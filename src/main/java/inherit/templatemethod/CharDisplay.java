package inherit.templatemethod;

/**
 * @ClassName:CharDisplay
 * @Author:wangsw17
 * @Dtae:2022/2/24 14:24
 * @Description:TODO
 **/
public class CharDisplay extends AbstractDisplay {
    private char message;
    public CharDisplay(char message){
        this.message = message;
    }

    @Override
    protected void open() {
        System.out.print("<");
    }

    @Override
    protected void print() {
        System.out.print(message);
    }

    @Override
    protected void close() {
        System.out.println(">");
    }
}
