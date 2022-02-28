package inherit.template_method;

/**
 * @ClassName:StringDisplay
 * @Author:wangsw17
 * @Dtae:2022/2/24 14:27
 * @Description:
 **/
public class StringDisplay extends AbstractDisplay{
    private String message;
    private int width;
    public StringDisplay(String message){
        this.message = message;
        this.width = message.length();
    }

    @Override
    protected void open() {
        printLine();
    }

    @Override
    protected void print() {
        System.out.println("|"+message+"|");
    }

    @Override
    protected void close() {
        printLine();
    }

    private void printLine(){
        System.out.print("+");
        for(int i =0;i<width;++i){
            System.out.print("-");
        }
        System.out.println("+");
    }
}
