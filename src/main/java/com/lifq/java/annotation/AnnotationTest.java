package com.lifq.java.annotation;

@MyAnnotation(id=12,value="abc")
public class AnnotationTest {

	public static void main(String[] args) {
		Class aclass =  AnnotationTest.class.getAnnotations()[0].getClass();
		
		MyAnnotation a = AnnotationTest.class.getAnnotation(MyAnnotation.class);
		System.out.println(a.getClass().getName());
		System.out.println(a.id());
		System.out.println(a.value());
		
		System.out.println(AnnotationTest.class.isAnnotationPresent(MyAnnotation.class));

	}

}
