package devide_and_conquer.Bridge;

/**
 * @ClassName:CountDisplay
 * @Author:wangsw17
 * @Dtae:2022/2/28 17:13
 * @Description:TODO
 **/
public class CountDisplay extends Display{
    public CountDisplay(DisplayImpl impl) {
        super(impl);
    }

    public void multiDisplay(int times){
        this.open();
        for(int i =0;i<times;++i){
            this.print();
        }
        this.close();
    }
}
