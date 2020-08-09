package com.syntax.class12;

public class FindAllEvenAndOddNumbers {
public static void main(String[] args) {
	
	int[][] numbers = {{2,34,-3,5, 4,0},
						{13,4,12,7,-2},
						{12,3,0}
	};
	System.out.print("All Even Numbers: ");
	for (int i=0; i<numbers.length; i++) {
		for (int j=0; j<numbers[i].length;j++) {
			if (numbers[i][j]%2==0) {
				System.out.print(numbers[i][j]+" ");
		}
	}
}
	System.out.println();
	System.out.print("All Odd Numbers: ");
	for (int i=0; i<numbers.length; i++) {
		for (int j=0; j<numbers[i].length;j++) {
			if (numbers[i][j]%2==1) {
				System.out.print(numbers[i][j]+" ");
		}
	}
}
}
}
