/**
 * ReentrantLocakSync
 * 
 */
package com.lifq.java.syn;

import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLocakSync implements Runnable{
	
    //共享资源(临界资源)
    static int i=0;
    ReentrantLock lock = new ReentrantLock();

    @Override
    public void run() {
    	try {
    		lock.lock();
    		 for(int j=0;j<1000000;j++){
	            i++;
	        }
		} catch (Exception e) {
		}finally{
			lock.unlock();
		}
    	
       
    }
    //正确的
    public static void main(String[] args) throws InterruptedException {
        ReentrantLocakSync instance=new ReentrantLocakSync();
        Thread t1=new Thread(instance);
        Thread t2=new Thread(instance);
        t1.start();
        t2.start();
        //join含义:当前线程 A等待thread线程终止之后才能从thread.join()返回
        t1.join();
        t2.join();
        System.out.println(i);
    }
    
    /**
     * 输出结果:
     * 2000000
     */
}