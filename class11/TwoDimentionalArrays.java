package com.syntax.class11;

public class TwoDimentionalArrays {
public static void main(String[] args) {
	
	int [][]numbers = new int[3][4]; //[rows][cols]
	int randomNum=0;
	for (int i=0; i<numbers.length; i++) {
		for (int j=0; j<numbers.length; j++) {
			randomNum = (int)(Math.random()*10+1);
			numbers[i][j]=randomNum;
		}
	}
}
}
