package devide_and_conquer.Bridge;

/**
 * @ClassName:StringDisplayImpl
 * @Author:wangsw17
 * @Dtae:2022/2/28 17:15
 * @Description:TODO
 **/
public class StringDisplayImpl extends DisplayImpl {
    private String text;

    private int width;

    public StringDisplayImpl(String text){
        this.text =text;
        this.width = text.getBytes().length;
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
        System.out.print("+");
        for(int i = 0;i<this.width;++i) {
            System.out.print("-");
        }
        System.out.println("+");
    }
}
