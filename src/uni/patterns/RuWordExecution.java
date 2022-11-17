package uni.patterns;

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