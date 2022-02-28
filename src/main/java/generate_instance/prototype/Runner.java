package generate_instance.prototype;

/**
 * @ClassName:Runner
 * @Author:wangsw17
 * @Dtae:2022/2/25 17:40
 * @Description:
 **/
public class Runner {
    public static void main(String[] args) {
        /**
         * 原型模式,
            主要用于
                解耦框架与对象的生成
                大且复杂对象的创建
            示例:
                Spring 中的 prototype 模式
                //todo
         */
        //准备
        Manager manager = new Manager();
        UnderLinePen underLinePen = new UnderLinePen('~');
        MessageBox messageBox = new MessageBox('*');
        MessageBox messageBox2 = new MessageBox('/');
        manager.register("strong message",underLinePen);
        manager.register("warning box",messageBox);
        manager.register("slash box",messageBox2);

        //生成
        Product p1 = manager.create("strong message");
        p1.use("阿莱卡因在黑暗中摸索");
        Product p2 = manager.create("warning box");
        p2.use("路过客厅时");
        Product p3 = manager.create("slash box");
        p3.use("大舅哥翻了翻身,梦里愤愤地嘟囔了句\"今天老子要杀鸡\"");
    }
}
