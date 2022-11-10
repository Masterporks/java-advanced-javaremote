package org.sda.concurrency;

/**
 *
 * Implementation of Runnable interface
 *
 */
public class StopWatchRunnableImpl implements Runnable {
    @Override
    public void run() {
        for(int i = 0; i < 10; i++){
            System.out.println("Stop watch: " + i);
            try{
                Thread.sleep(2000);
            }catch (InterruptedException e){
                System.out.println(e.getLocalizedMessage());
            }
        }
    }
}
