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
