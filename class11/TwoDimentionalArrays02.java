package com.syntax.class11;

public class TwoDimentionalArrays02 {
	public static void main(String[] args) {

		String[][] months = { { "December", "January", "February" }, { "March", "Arpil", "May" },
				{ "June", "July", "August" }, { "September", "October", "November" } };

		int seasons = months.length; // how many arrays/rows are inside
		System.out.println(seasons + " rows");

		int winterLength = months[0].length; // printing how many elements/columns are in row[0]
		System.out.println(winterLength + " months in the row with index 0");
		
		System.out.println("---------------");
		for (int row=0; row<months.length; row++) {
			for (int col=0; col<months[row].length;col++) {
				System.out.println(months[row][col]);
			}
		}
	}
}
