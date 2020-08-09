package com.syntax.class11;

public class ClassTask02 {
	public static void main(String[] args) {

		String[] cars = { "BMW", "TOYOTA", "HONDA", "BUICK", "CHEVROLET" };

		for (String car : cars) {
			System.out.print(car + " ");
		}

		System.out.println("-------------");

		int[] numbers = new int[5];
		numbers[0] = 5;
		numbers[1] = 4;
		numbers[2] = 12;
		numbers[3] = 43;
		numbers[4] = 0;
		int sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
		}
		System.out.println("Sum is: " + sum);
		
		System.out.println("--------------");
		
		String [] countries = {"Canada","USA","Germany","Russia","Tajikistan","Albania"};
		for (String country:countries) {
			switch(country) {
			case "Canada":
				System.out.println("Ottava");
				break;
			case "USA":
				System.out.println("Washington");
				break;
			case "Germany":
				System.out.println("Berlin");
				break;
			case "Russa":
				System.out.println("Moscow");
				break;
			case "Tajikistan":
				System.out.println("Dushanbe");
				
			}
		}
	}
}
