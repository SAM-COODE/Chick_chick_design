package generate_instance.abstract_factory;

import generate_instance.abstract_factory.factory.Factory;
import generate_instance.abstract_factory.factory.Page;
import generate_instance.abstract_factory.factory.Tray;
import generate_instance.abstract_factory.list_factory.ListFactory;

/**
 * @ClassName:Runner
 * @Author:wangsw17
 * @Dtae:2022/2/28 15:53
 * @Description:TODO
 **/
public class Runner {
    /**
     * //TODO 抽象工厂模式
     * 定义行为
     * 和工厂模式的区别 :
     *      工厂模式:实例决定行为
     *      抽象工厂模式:工厂决定实例,实例决定行为
     * @param args
     */
    public static void main(String[] args) {
        Factory factory = Factory.getFactory(ListFactory.class.getName());
        Page page = factory.createPage("摆烂","摆烂作者");
        page.add(factory.createLink("摆烂链接","摆烂协议://摆烂domain/摆烂URI"));
        Tray tray = factory.createTray("摆烂小组");
        tray.add(factory.createLink("",""));
        page.add(tray);
        page.output();
    }
}
