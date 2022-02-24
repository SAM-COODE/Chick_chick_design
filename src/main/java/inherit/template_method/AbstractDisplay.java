package inherit.template_method;

/**
 * @ClassName:AbstractDisplay
 * @Author:wangsw17
 * @Dtae:2022/2/24 14:22
 * @Description:TODO
 **/
public abstract class AbstractDisplay {
    protected abstract void open();

    protected abstract void print();

    protected abstract void close();

    public final void display(){
        open();
        for(int i = 0;i<5;++i){
            print();
        }
        close();
    }
}
