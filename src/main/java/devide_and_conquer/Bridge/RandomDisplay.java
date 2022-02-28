package devide_and_conquer.Bridge;

import java.util.Random;

/**
 * @ClassName:RanDomDisplay
 * @Author:wangsw17
 * @Dtae:2022/2/28 17:52
 * @Description:TODO
 **/
public class RandomDisplay extends CountDisplay{
    public RandomDisplay(DisplayImpl impl) {
        super(impl);
    }
    public void randomDisplay(int times){
        Random random = new Random();
        int realTime = random.nextInt(times)+1;
        this.open();
        for(int i =0;i<realTime;++i){
            this.print();
        }
        this.close();
    }
}
