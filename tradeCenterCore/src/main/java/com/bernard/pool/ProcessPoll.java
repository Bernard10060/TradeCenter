package com.bernard.pool;

import java.util.concurrent.*;

public class ProcessPoll {
    private static ExecutorService executorService = new ThreadPoolExecutor(32, 32 ,0L, TimeUnit.MILLISECONDS,new LinkedBlockingQueue<Runnable>(3000));
    //Executors.newFixedThreadPool(32);
    public static void submitTask( FutureTask<Integer> futureTask){
        executorService.submit(futureTask);
    }
    public static void shutdown(){
        executorService.shutdown();
    }

}
