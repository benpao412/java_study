package com.lifq.java.exception;
/**
 * java.lang.StackOverflowError测试
 *
 * @author lifq
 *
 * 2018年8月31日 上午9:38:16
 */
public class StackErrorTest {
	
	public static int i=0;
	
	public static void call() {
		i++;
		call();
	}
	

	public static void main(String[] args) {
		try {
			call();
		} catch (Exception e) {
			
		}finally {
			System.out.println("i="+i);
		}

	}

}
