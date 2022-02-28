package devide_and_conquer.Bridge;

/**
 * @ClassName:StepDisplay
 * @Author:wangsw17
 * @Dtae:2022/2/28 18:04
 * @Description:TODO
 **/
public class StepDisplay extends RandomDisplay {
    public StepDisplay(DisplayImpl impl) {
        super(impl);
    }
    public void stepDisplay(int lines,int step){
        int time;
        for(int i = 0;i<lines;++i){
            open();
            time = i*step;
            for(int j = 0;j<time;++j){
                print();
            }
            close();
        }
    }
}
