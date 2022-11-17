package uni.patterns;

import java.lang.String;;
import java.util.Scanner;
import java.lang.RuntimeException;


interface Command {void execute();}


interface IAbFactoryApp
{
    IWord callActionWordApp();
    IMessage callActionMessenger();
}
interface IMessage
{
    void start();
    void sendMessage();
    void close();
}

interface IWord
{
    void start();
    void editText();
    void save();
    void close();
}

class EnTranslateFactory implements IAbFactoryApp
{
    private IMessage productA;
    private IWord productB;

    EnTranslateFactory(EnMessage m) {this.productA = m;}
    EnTranslateFactory( EnWord w) {this.productB = w;}
    @Override
    public IMessage callActionMessenger() {return this.productA;}

    @Override
    public IWord callActionWordApp() {return this.productB;}
}
class RuTranslateFactory implements IAbFactoryApp
{
    private IMessage productA;
    private IWord productB;

    RuTranslateFactory(RuMessage m) {this.productA = m;}
    RuTranslateFactory( RuWord w) {this.productB = w;}
    @Override
    public IMessage callActionMessenger() {return this.productA;}

    @Override
    public IWord callActionWordApp() {return this.productB;}
}



class RuWordExecution implements Command
{


    @Override
    public void execute() {
        RuTranslateFactory ruF = new RuTranslateFactory(new RuWord());
        ruF.callActionWordApp().start();
        ruF.callActionWordApp().editText();
        ruF.callActionWordApp().save();
        ruF.callActionWordApp().close();
    }
}
class EnWordExecution implements Command
{

    @Override
    public void execute() {
        EnTranslateFactory enF = new EnTranslateFactory(new EnMessage());
        enF.callActionMessenger().start();
        enF.callActionMessenger().sendMessage();
        enF.callActionMessenger().close();
    }
}
class EnMessageExecution implements Command
{

    @Override
    public void execute() {
        EnTranslateFactory enF = new EnTranslateFactory(new EnWord());
        enF.callActionWordApp().start();
        enF.callActionWordApp().editText();
        enF.callActionWordApp().save();
        enF.callActionWordApp().close();
    }
}

class User //invoker
{
    User(){}

    public void getEnTranslate()
    {
        new EnWordExecution().execute();
        new EnMessageExecution().execute();
    }

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
        String lang = scanner.next();
        getFactoryByCountryCode(lang);
    }
    public static void getFactoryByCountryCode(String l)
    {
        User user = new User();
        switch (l)
        {
            case "RU":
                user.getRuTranslate();
                break;
            case "EN":
                user.getEnTranslate();
                break;
            default:
                throw new RuntimeException("Wrong country code: " + l);
        }
    }
}
