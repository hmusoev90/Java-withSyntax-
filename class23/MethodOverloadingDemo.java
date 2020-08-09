package com.syntax.class23;

public class MethodOverloadingDemo {

	public void hello() {
		System.out.println("Hello");
	}

	public String hello(String str) {
		return str;
	}

	public static void main(String[] args) {

		MethodOverloadingDemo obj = new MethodOverloadingDemo();
		
		obj.hello();

		System.out.println(obj.hello("Hello World"));

	}
}
