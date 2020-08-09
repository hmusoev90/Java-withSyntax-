package com.syntax.class19_1;

import com.syntax.class19.Task02;

public class Task02Accessing {
public static void main(String[] args) {
	Task02 str1 = new Task02();
	
	str1.str = "Hi, How is going on?";
	String txt = str1.reverse(str1.str);
	System.out.println(txt);
}
}
