package com.syntax.class07;

public class HW03 {
public static void main(String[] args) {
	
	int a = 20;
	
	// 1st way
	System.out.println("1st Way");
	while (a>=1) {
		if (a%2==0)
			System.out.println(a);
		a--;
	}
	System.out.println("2nd Way");
	//2nd way
	int b =20;
	while (b>=1) {
		System.out.println(b);
		b-=2;
	}
	
}
}
