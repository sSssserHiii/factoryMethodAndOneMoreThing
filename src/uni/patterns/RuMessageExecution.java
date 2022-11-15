package uni.patterns;

class RuMessageExecution implements Command
{
    @Override
    public void execute() {
        new RuMessage().start();
        new RuMessage().sendMessage();
        new RuMessage().close();
    }
}