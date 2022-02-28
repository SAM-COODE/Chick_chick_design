package devide_and_conquer.Bridge;

/**
 * @ClassName:Runner
 * @Author:wangsw17
 * @Dtae:2022/2/28 17:18
 * @Description:
 **/
public class Runner {
    public static void main(String[] args) {

        /**
         * Bridge模式
         *      功能层次
         *      实现层次
         *  Bridge模式将类的功能 抽象与实现 [分离]开来,
         *      由抽象负责组装并扩展功能
         *      由实现负责具体功能实现
         *
         *  [委托代替继承]
         */
        Display display = new Display(new StringDisplayImpl("每一百元资产就有65元债务"));
        display.display();
        CountDisplay countDisplay = new CountDisplay(new StringDisplayImpl("好好厂子给他造完了"));
        countDisplay.display();
        countDisplay.multiDisplay(5);
        RandomDisplay randomDisplay = new RandomDisplay(new TextDisplayImpl("东北文艺三杰"));
        randomDisplay.randomDisplay(5);
        StepDisplay stepDisplay = new StepDisplay(new LineDisplayImpl("<",">","*"));
        stepDisplay.stepDisplay(4,1);
        StepDisplay stepDisplay2 = new StepDisplay(new LineDisplayImpl("|","-","#"));
        stepDisplay2.stepDisplay(6,2);
    }
}
