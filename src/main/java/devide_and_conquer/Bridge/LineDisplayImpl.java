package devide_and_conquer.Bridge;

/**
 * @ClassName:LineDisplayImpk
 * @Author:wangsw17
 * @Dtae:2022/2/28 18:06
 * @Description:TODO
 **/
public class LineDisplayImpl extends DisplayImpl {
    private String open;
    private String close;
    private String text;

    public LineDisplayImpl(String open,String close,String text){
        this.open = open;
        this.text = text;
        this.close =close;
    }
    @Override
    public void rawOpen() {
        System.out.print(open);
    }

    @Override
    public void rawPrint() {
        System.out.print(text);
    }

    @Override
    public void rawClose() {
        System.out.println(close);
    }
}
