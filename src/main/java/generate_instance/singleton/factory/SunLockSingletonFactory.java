package generate_instance.singleton.factory;

import generate_instance.singleton.Singletion;
import generate_instance.singleton.SingletonFactory;

/**
 * @ClassName:SunLockSingleton
 * @Author:wangsw17
 * @Dtae:2022/2/24 17:26
 * @Description:TODO
 **/
public class SunLockSingletonFactory extends SingletonFactory {
    private static class InstanceHolder{
        public static Singletion singletion = new Singletion();
    }
    @Override
    public  Singletion getInstance(){
        //此时初始化子类,执行子类中静态方法
        return InstanceHolder.singletion;
    }
}
