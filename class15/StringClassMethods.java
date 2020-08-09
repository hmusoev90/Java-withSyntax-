package com.syntax.class15;

public class StringClassMethods {
public static void main(String[] args) {
	
	// .replace() Method
	String txt = "Hey, what's up?";
	String s = "Hello";
	
	s=s.replace('H', 'h'); // (old char, new char)
	System.out.println(s);
	
	txt = txt.replace("Hey", "Hi"); // (old string, new string)
	System.out.println(txt);
	
	txt = txt.replace("down", "left"); // if it finds it --> replace, if not --> does nothing
	System.out.println(txt);
	
	
	//.replaceAll() Method
	
	String txt1 = "PHONE number 918-322-4232";
	txt1 = txt1.replaceAll("[A-Z]", "");
	System.out.println(txt1);
	txt1 = txt1.replaceAll("[0-9]", "");
	System.out.println(txt1.trim());
	
	String txt2 = "Bowi kijon !~@#$%^&*()_+";
	txt2 = txt2.replaceAll("[^A-Za-z0-9]", "");
	System.out.println(txt2);
	
}
}
