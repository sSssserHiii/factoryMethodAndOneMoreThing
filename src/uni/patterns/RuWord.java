package uni.patterns;

class RuWord implements IWord
{


    @Override
    public void start() {System.out.println("Нажмите на иконку ворда чтобы начать");}

    @Override
    public void editText() {System.out.println("Используйте стили текста для его редактирования");}

    @Override
    public void save() {System.out.println("нажмине сочетание клавиш CTRL+S чтобы сохранить");}

    @Override
    public void close() {System.out.println("нажмите сочетание клавиш CTRL+W чтобы выйти");}
}