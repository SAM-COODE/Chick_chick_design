package generate_instance.singleton;

import generate_instance.singleton.factory.DoubleCheckSingletonFactory;
import generate_instance.singleton.factory.SunLockSingletonFactory;
import generate_instance.singleton.factory.UnSafetySingletonFactory;
import util.MultiThreadUtil;

/**
 * @ClassName:Runner
 * @Author:wangsw17
 * @Dtae:2022/2/24 16:34
 * @Description:TODO
 **/
public class Runner {
    public static void main(String[] args) {
        multiThreadUnSafety();
        doubleCheck();
        sunLock();

    }

    /**
     * 线程不安全的单例模式
     */
    private static void multiThreadUnSafety(){
        SingletonFactory singletonFactory= new  UnSafetySingletonFactory();

        System.out.println("单线程多次实例化");
        for(int i =0;i<10;i++) {
            Singletion singletion = singletonFactory.getInstance();
        }
        System.out.println("100线程同时实例化");
        new MultiThreadUtil() {
            @Override
            public void execute() {
                singletonFactory.getInstance();
            }
        }.runWithMultiThread(100);
    }
    /**
     * 双重检查的单例模式
     */
    private static void doubleCheck(){
        SingletonFactory singletonFactory= new DoubleCheckSingletonFactory();
        System.out.println("单线程多次实例化");
        for(int i =0;i<10;i++) {
            Singletion singletion = singletonFactory.getInstance();
        }
        System.out.println("100线程同时实例化");
        new MultiThreadUtil() {
            @Override
            public void execute() {
                singletonFactory.getInstance();
            }
        }.runWithMultiThread(100);

    }
    /**
     * 线程不安全的单例模式
     */
    private static void sunLock(){
        SingletonFactory singletonFactory= new SunLockSingletonFactory();
        System.out.println("单线程多次实例化");
        for(int i =0;i<10;i++) {
            Singletion singletion = singletonFactory.getInstance();
        }
        System.out.println("100线程同时实例化");
        new MultiThreadUtil() {
            @Override
            public void execute() {
                singletonFactory.getInstance();
            }
        }.runWithMultiThread(100);
    }
}
