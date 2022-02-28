package devide_and_conquer.Bridge;

/**
 * @ClassName:TextDisplayImpl
 * @Author:wangsw17
 * @Dtae:2022/2/28 17:59
 * @Description:TODO
 **/
public class TextDisplayImpl extends DisplayImpl{

    private String text;

    private int width;

    public TextDisplayImpl(String text){
        this.text = text;
        this.width = this.text.getBytes().length;
    }
    @Override
    public void rawOpen() {
        printLine();
    }

    @Override
    public void rawPrint() {
        System.out.println("|    "+this.text+"  |");
    }

    @Override
    public void rawClose() {
        printLine();
    }

    private void printLine(){
        System.out.print("*");
        for(int i = 0;i<this.width;++i) {
            System.out.print("`");
        }
        System.out.println("*");
    }
}
