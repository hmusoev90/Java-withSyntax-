package com.syntax.class06;

import java.util.Scanner;

public class SwitchCaseBirthSeason {
public static void main(String[] args) {
	
	System.out.println("Please enter your birth month");
	
	Scanner input = new Scanner(System.in);
	
	String month = input.next();
	
	String season="Unknown";
	
	switch (month) {
	
	case "December":
	case "January":
	case "February":
		season = "Winter";
	break;
	case "March":
	case "April":
	case "May":
		season = "Spring";
	break;
	case "June":
	case "July":
	case "August":
		season = "Summer";
	break;
	case "September":
	case "October":
	case "November":
		season = "Autumn";
	break;
	}
	System.out.println("You were born in "+season);
}
}
