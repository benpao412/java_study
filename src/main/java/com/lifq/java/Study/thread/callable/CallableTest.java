package com.lifq.java.Study.thread.callable;

import java.util.Date;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableTest {

	
	static class CallableDemo implements Callable<String>{
		
		@Override
		public String call() throws Exception {
			System.out.println(Thread.currentThread().getName()+new Date().toString());
			Thread.sleep(3000);
			System.out.println(Thread.currentThread().getName()+new Date().toString());
			return Thread.currentThread().getName();
		}
		
	}
	
	
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		 CallableDemo demo = new CallableDemo();
		
		 ExecutorService exec = Executors.newFixedThreadPool(5);
		 
		 Future<String> f = exec.submit(demo);
		 System.out.println(f.get());
		 
		 
		 System.out.println("main thread");
		 
		 
		 
		
		

	}

}
