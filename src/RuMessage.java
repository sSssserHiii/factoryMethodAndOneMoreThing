class RuMessage implements IMassage
{
    @Override
    public void start() {System.out.println("Нажмите на иконку мессенджера чтобы начать");}

    @Override
    public void sendMessage() {System.out.println("Выберете контакт и введите сообщение, а затем нажмите на самолетик");}

    @Override
    public void close() {System.out.println("нажмите сочетание клавиш CTRL+W чтобы выйти");}
}
