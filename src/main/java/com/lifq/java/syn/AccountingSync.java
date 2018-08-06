/**
 * https://blog.csdn.net/javazejian/article/details/72828483#synchronized%E7%9A%84%E4%B8%89%E7%A7%8D%E5%BA%94%E7%94%A8%E6%96%B9%E5%BC%8F
 * synchronized的三种应用方式
synchronized关键字最主要有以下3种应用方式，下面分别介绍

修饰实例方法，作用于当前实例加锁，进入同步代码前要获得当前实例的锁

修饰静态方法，作用于当前类对象加锁，进入同步代码前要获得当前类对象的锁

修饰代码块，指定加锁对象，对给定对象加锁，进入同步代码库前要获得给定对象的锁。
 * 
 * 
 */
package com.lifq.java.syn;

public class AccountingSync implements Runnable{
    //共享资源(临界资源)
    static int i=0;

    /**
     * synchronized 修饰实例方法
     */
    public synchronized void increase(){
        i++;
    }
    @Override
    public void run() {
        for(int j=0;j<1000000;j++){
            increase();
        }
    }
    //正确的
    public static void main(String[] args) throws InterruptedException {
        AccountingSync instance=new AccountingSync();
        Thread t1=new Thread(instance);
        Thread t2=new Thread(instance);
        t1.start();
        t2.start();
        //join含义:当前线程 A等待thread线程终止之后才能从thread.join()返回
        t1.join();
        t2.join();
        System.out.println(i);
    }
    
    //错误的
//    public static void main(String[] args) throws InterruptedException {
//        AccountingSync instance=new AccountingSync();
//        AccountingSync instance1=new AccountingSync();
//        Thread t1=new Thread(instance);
//        Thread t2=new Thread(instance1);
//        t1.start();
//        t2.start();
//        //join含义:当前线程 A等待thread线程终止之后才能从thread.join()返回
//        t1.join();
//        t2.join();
//        System.out.println(i);
//    }
    
    /**
     * 输出结果:
     * 2000000
     */
}