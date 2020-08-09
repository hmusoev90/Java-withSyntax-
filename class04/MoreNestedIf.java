package com.syntax.class04;

public class MoreNestedIf {
	public static void main(String[] args) {

		/*Let's have a date of month and a day of week 
		 * if it is Friday --> We are going to watch a movie 
		 *                     if date is 13 --> Watch a SCARY movie. 
		 *                     if date is not 13 --> Watch a COMEDY. 
		 *  if it is not Friday --> We are going to study JAVA
		 */
		boolean isFriday = true;
		int date = 17;

		if (isFriday) {
			System.out.println("It's Friday. I'm going to watch a movie!");
			if (date == 13) {
				System.out.println("I will watch a Scary movie.");
			} else {
				System.out.println("I will watch a Comedy.");
			}
		} else {
			System.out.println("It's not Friday. I'm going to study Java!");
		}
	}
}
