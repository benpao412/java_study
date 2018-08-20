package com.lifq.java.Study.syn;

public class TestSynchronized {
	
	public static int i=0;
	
	 static synchronized void add() {
		for(int k=0;k<100000;k++) {
			i++;
		}
	}
	
	static class MyRunnable implements Runnable{
		@Override
		public void run() {
			add();
		}
	}

	public static void main(String[] args) throws InterruptedException {
		MyRunnable runnable1 = new MyRunnable();
		
		Thread t1 = new Thread(runnable1,"线程1");
		Thread t2 = new Thread(runnable1,"线程2");
		t1.start();
		t2.start();

		t1.join();
		t2.join();
		
		System.out.println(i);
		
	}

}
