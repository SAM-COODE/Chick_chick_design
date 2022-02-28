package devide_and_conquer.Bridge;

/**
 * @ClassName:Display
 * @Author:wangsw17
 * @Dtae:2022/2/28 17:08
 * @Description:TODO
 **/
public class Display {
    private DisplayImpl impl;

    public Display(DisplayImpl impl){
        this.impl = impl;
    }

    protected void open(){
        this.impl.rawOpen();
    }
    protected void close(){
        this.impl.rawClose();
    }
    protected void print(){
        this.impl.rawPrint();
    }

    public final void display(){
        this.open();
        this.print();
        this.close();
    }
}
