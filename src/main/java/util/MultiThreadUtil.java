package util;

import java.util.concurrent.*;

/**
 * @ClassName:MultiThreadUtil
 * @Author:wangsw17
 * @Dtae:2022/2/24 17:52
 * @Description:TODO
 **/
public abstract class MultiThreadUtil {

    public abstract void execute();

    public static BlockingQueue<Runnable> blockingQueue;
    public void runWithMultiThread(int threadNum){
        blockingQueue = new ArrayBlockingQueue<Runnable>(threadNum);
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(threadNum, threadNum, 30, TimeUnit.MINUTES, blockingQueue, (ThreadFactory) Thread::new);
        while(true) {
            try {
                threadPoolExecutor.execute(this::execute);
            }catch (RejectedExecutionException e){
                break;
            }
        }
        threadPoolExecutor.shutdown();
    }
}
