package adapter;

import adapter.inherit.BannerPrint;
import adapter.inherit.Print;

/**
 * @ClassName:Runner
 * @Author:wangsw17
 * @Dtae:2022/2/24 11:07
 * @Description:
 **/
public class Runner {
    public static void main(String[] args) {
        /**
         * 适配器模式按目前的了解来看,更像是为了使用旧代码来实现新功能,(应该也可以作为功能的聚合类)
         * 同样的体现了开闭原则
         */
        //通过继承实现的适配器
        testInheritAdapter();
        //通过委托实现的适配器
        testProxyAdapter();
    }
    public static void testInheritAdapter(){
        Print bannerPrint = new BannerPrint("白色的明天在等着我们");
        bannerPrint.printStrong();
        bannerPrint.printWeek();
    }

    public static void testProxyAdapter(){
        adapter.proxy.Print bannerPrint = new adapter.proxy.BannerPrint("白色的明天在等着我们");
        bannerPrint.printStrong();
        bannerPrint.printWeek();
    }
}
