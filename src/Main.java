import java.lang.String;;
import java.util.Scanner;

interface Command {void execute();}


interface IWord
{
    void start();
    void editText();
    void save();
    void close();
}
interface IMassage
{
    void start();
    void sendMessage();
    void close();
}
interface  AppFactory
{
    void getRuTranslate();
    void getEnTranslate();
}



class RuWordExecution implements Command
{
    @Override
    public void execute() {
        new RuWord().start();
        new RuWord().editText();
        new RuWord().save();
        new RuWord().close();
    }
}
class EnWordExecution implements Command
{
    @Override
    public void execute() {
        new EnWord().start();
        new EnWord().editText();
        new EnWord().save();
        new EnWord().close();
    }
}
class EnMessageExecution implements Command
{
    @Override
    public void execute() {
        new EnMessage().start();
        new EnMessage().sendMessage();
        new EnMessage().close();
    }
}

class User implements AppFactory
{
    @Override
    public void getEnTranslate()
    {
        new EnMessageExecution().execute();
        new EnWordExecution().execute();
    }

    @Override
    public void getRuTranslate()
    {
        new RuMessageExecution().execute();
        new RuWordExecution().execute();
    }
}


public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("EN or RU");
        String l = scanner.next();
        AppFactory factory  = getFactoryByCountryCode(l);

    }
    private static AppFactory getFactoryByCountryCode(String l)
    {

        switch (l)
        {
            case "RU":
                new User().getRuTranslate();

            case "EN":
                new User().getEnTranslate();
            default:
                throw new RuntimeException("Wrong country code: "+ l);
        }
    }
}