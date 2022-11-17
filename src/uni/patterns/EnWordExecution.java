package uni.patterns;

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