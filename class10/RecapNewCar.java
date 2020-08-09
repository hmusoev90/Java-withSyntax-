package com.syntax.class10;

public class RecapNewCar {
public static void main(String[] args) {
	
	//We bought a new car
	//It starts with 0000 mileage and it increases
	//it goes 0001, 0002, 0003, ...., 9999
	//Hint : Do it with 4 inner loops
	
	for (int i=0; i<=9; i++) {
		for (int j=0; j<=9; j++) {
			for (int k=0; k<=9; k++) {
				for (int l=0; l<=9; l++) {
					System.out.println(i+""+j+""+k+""+l);
				}
			}
		}
		
	}
}
}
