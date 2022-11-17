package uni.patterns;

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
