package uni.patterns;

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
