package generate_instance.singleton.factory;

import generate_instance.singleton.Singletion;
import generate_instance.singleton.SingletonFactory;

/**
 * @ClassName:DoubleCheckSingleton
 * @Author:wangsw17
 * @Dtae:2022/2/24 16:40
 * @Description:
 **/
public class DoubleCheckSingletonFactory extends SingletonFactory {
    /**
     加volatile 防止创建对象三个步骤:
        1.申请空间,2.初始化对象,3.将引用指向空间,
     被优化为:
        todo 为什么要这么优化?
        1.申请空间,2.将引用指向空间,3.初始化对象
     **/
    private volatile static Singletion singleton;

    @Override
    public  Singletion getInstance(){
        if(null==singleton){
            //延迟加锁,减少开销
            synchronized (DoubleCheckSingletonFactory.class) {
                if(null == singleton) {
                    System.out.println("生成实例");
                    singleton = new Singletion();
                }
            }
        }
        return singleton;
    }

    @Override
    public void destory() {
        singleton = null;
    }
}
