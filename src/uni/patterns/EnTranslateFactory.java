package uni.patterns;

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