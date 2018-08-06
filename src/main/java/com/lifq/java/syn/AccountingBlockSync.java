/**
将synchronized作用于一个给定的实例对象instance，即当前实例对象就是锁对象，
每次当线程进入synchronized包裹的代码块时就会要求当前线程持有instance实例对象锁，
如果当前有其他线程正持有该对象锁，那么新到的线程就必须等待，这样也就保证了每次只有一个线程执行i++;
操作。当然除了instance作为对象外，我们还可以使用this对象(代表当前实例)或者当前类的class对象作为锁，如下代码：
 * 
 * 
 */
package com.lifq.java.syn;

public class AccountingBlockSync implements Runnable{
	
	Object object = new Object();
	
    //共享资源(临界资源)
    static int i=0;

    @Override
    public void run() {
       synchronized (object) {
    	   for(int j=0;j<1000000;j++){
    		   i++;
    	   }
       }
    }
    //正确的
    public static void main(String[] args) throws InterruptedException {
        AccountingBlockSync instance=new AccountingBlockSync();
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