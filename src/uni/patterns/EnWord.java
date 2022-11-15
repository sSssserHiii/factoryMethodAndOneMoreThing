package uni.patterns;

class EnWord implements IWord
{
    @Override
    public void start() {System.out.println("press shortcut to continue");}

    @Override
    public void editText() {System.out.println("to add text use style collections ");}

    @Override
    public void save() {System.out.println("press CTRL+S to save changes");}

    @Override
    public void close() {System.out.println("press CTRL+W to exit");}
}