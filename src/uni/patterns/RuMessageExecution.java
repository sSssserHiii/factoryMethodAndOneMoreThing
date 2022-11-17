package uni.patterns;

class RuMessageExecution implements Command
{
    RuTranslateFactory ruFactory;
    @Override
    public void execute() {
        RuTranslateFactory ruF = new RuTranslateFactory(new RuMessage());
        ruF.callActionMessenger().start();
        ruF.callActionMessenger().sendMessage();
        ruF.callActionMessenger().close();
    }
}