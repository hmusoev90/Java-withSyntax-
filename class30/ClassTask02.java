package com.syntax.class30;

import java.util.ArrayList;
import java.util.Iterator;

public class ClassTask02 {
	public static void main(String[] args) {

		ArrayList<String> words = new ArrayList<>();
		words.add("Hello");
		words.add("Welcome");
		words.add("Chevy");
		words.add("Apple");
		words.add("Iterate");
		words.add("Dream");
		System.out.println("- - Before removing elements - -  \n" + words);
		
		Iterator<String> it = words.iterator();
		while (it.hasNext()) {
			String txt = it.next();
			if (txt.endsWith("e")) {
				it.remove();
			}
		}
		System.out.println("- - Arfter removing elements - - \n" + words);
	}
}
