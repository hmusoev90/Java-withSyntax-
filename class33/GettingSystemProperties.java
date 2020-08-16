package com.syntax.class33;

public class GettingSystemProperties {
	public static void main(String[] args) {

		String userName = System.getProperty("user.name");
		System.out.println(userName);

		String windows = System.getProperty("os.name");
		System.out.println(windows);
		
		String directory = System.getProperty("user.dir");
		System.out.println(directory);
		
	}
}
