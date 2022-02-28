package generate_instance.singleton.factory;

import generate_instance.singleton.Singletion;
import generate_instance.singleton.SingletonFactory;

/**
 * @ClassName:Singleton
 * @Author:wangsw17
 * @Dtae:2022/2/24 16:31
 * @Description:
 **/
public class UnSafetySingletonFactory extends SingletonFactory {
    private static Singletion singletion;


    @Override
    public  Singletion getInstance(){
        if(singletion ==null){
            System.out.println("生成实例");
            singletion = new Singletion();
        }
        return singletion;
    }

    @Override
    public void destory() {
        singletion = null;
    }
}
