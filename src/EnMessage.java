class EnMessage implements IMassage
{
    @Override
    public void start() {System.out.println("press shortcut to continue");}

    @Override
    public void sendMessage() {System.out.println("choose contact and enter yoyur message, then press send button");}

    @Override
    public void close() {System.out.println("press CTRL+W to exit");}
}