package com.syntax.class06;

import java.util.Scanner;

public class Recap {
	public static void main(String[] args) {
		// if hour is between 1am - 11am => good morning
		// if hour is between 12mp - 6pm => good afternoon
		// if hour is between  6pm - 20pm => good evening
		// i hour is between  20pm-24om => good night
		
		Scanner input = new Scanner(System.in);
		
		int hour = input.nextInt();
		String dayTime;
		if (hour>=1 && hour<=11) {
			dayTime ="morning";
		}
		else if (hour>=12 && hour<=18) {
			dayTime = "afternoon";
		}
		else if (hour>18 && hour<=20) {
			dayTime = "evening";
				}
		else if (hour>20 && hour<=24) {
		dayTime = "night";	
		}
		else {
		dayTime = "unknown";	
		}
		System.out.println("Right now it is "+dayTime);
	
		boolean breakTime = true;
		String s;
		if (breakTime)
			s ="Finally, got a break";
		else 
			s ="No break, really?";
		System.out.println("Break time: "+s);
		
		
		boolean isElionSeeMyMessage = true;
		String result;
		if (isElionSeeMyMessage)
			result = "Yeah, finally will get break.";
		else 
			result = "No break";
		System.out.println("So will we get break: "+result);
		
		
		
	}
}
