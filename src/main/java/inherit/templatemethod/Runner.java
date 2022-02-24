package inherit.templatemethod;

/**
 * @ClassName:Runner
 * @Author:wangsw17
 * @Dtae:2022/2/24 15:14
 * @Description:TODO
 **/
public class Runner {
    public static void main(String[] args) {
        /**
         * 多态,面向对象编程
         */
        testStringDisplay();
        testCharDisplay();
    }
    public static void testStringDisplay(){
        AbstractDisplay abstractDisplay = new StringDisplay("回首往事或怀念故乡,其实只是在现实里不知所措后的故作镇静");
        abstractDisplay.display();
    }
    public static void testCharDisplay(){
        AbstractDisplay abstractDisplay = new CharDisplay('对');
        abstractDisplay.display();
    }
}
