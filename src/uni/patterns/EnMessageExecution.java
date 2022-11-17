package uni.patterns;

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