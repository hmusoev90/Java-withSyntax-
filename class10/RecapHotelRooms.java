package com.syntax.class10;

import java.util.Scanner;

public class RecapHotelRooms {
	public static void main(String[] args) {

		// There are 4 floors in a Hotel
		// Room numbers go from 1.1, 1.2, ..., 1.7
		Scanner input = new Scanner(System.in);

		System.out.println("How many floors does your Hotel have?");
		int floor = input.nextInt();
		
		System.out.println("And how many rooms?");
		int room = input.nextInt();
		
		for (int i = 1; i <= floor; i++) {
			System.out.print("Floor #" + i + " ---> ");
			for (int j = 1; j <= room; j++) {
				System.out.print(i + "." + j + " ");
			}
			System.out.println();
		}
	}
}
