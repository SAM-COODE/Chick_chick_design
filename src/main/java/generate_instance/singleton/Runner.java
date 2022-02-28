package generate_instance.singleton;

import generate_instance.singleton.factory.DoubleCheckSingletonFactory;
import generate_instance.singleton.factory.SunLockSingletonFactory;
import generate_instance.singleton.factory.UnSafetySingletonFactory;
import util.MultiThreadUtil;

/**
 * @ClassName:Runner
 * @Author:wangsw17
 * @Dtae:2022/2/24 16:34
 * @Description:
 **/
public class Runner {
    public static void main(String[] args) {
        System.out.println("---------------------------非线程安全的单例---------------------------");
        //非线程安全的单例
        multiThreadUnSafety();
        System.out.println("---------------------------双重检查的单例---------------------------");
        //双重检查的单例
        doubleCheck();
        System.out.println("---------------------------使用子类中JVM自带锁实现的单例---------------------------");
        //使用子类中JVM自带锁实现的单例
        sunLock();

    }

    /**
     * 线程不安全的单例模式
     */
    private static void multiThreadUnSafety(){
        SingletonFactory singletonFactory= new  UnSafetySingletonFactory();
        test(singletonFactory);
    }
    /**
     * 双重检查的单例模式
     */
    private static void doubleCheck(){
        SingletonFactory singletonFactory= new DoubleCheckSingletonFactory();
        test(singletonFactory);

    }

    private static void test(SingletonFactory singletonFactory) {
        System.out.println("单线程多次实例化");
        for(int i =0;i<10;i++) {
            Singletion singletion = singletonFactory.getInstance();
        }
        singletonFactory.destory();
        System.out.println("100线程同时实例化");
        new MultiThreadUtil() {
            @Override
            public void execute() {
                singletonFactory.getInstance();
            }
        }.runWithMultiThread(100);
    }

    /**
     * 子类锁的单例模式
     */
    private static void sunLock(){
//        SingletonFactory singletonFactory= new SunLockSingletonFactory();
//        System.out.println("单线程多次实例化");
//        for(int i =0;i<10;i++) {
//            Singletion singletion = singletonFactory.getInstance();
//        }
//        singletonFactory.destory();
//        System.gc();
        System.out.println("100线程同时实例化");
        SingletonFactory singletonFactory = new SunLockSingletonFactory();
        new MultiThreadUtil() {
            @Override
            public void execute() {
                singletonFactory.getInstance();
            }
        }.runWithMultiThread(100);
    }
}
