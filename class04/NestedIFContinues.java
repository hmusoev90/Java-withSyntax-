package com.syntax.class04;

public class NestedIFContinues {
	public static void main(String[] args) {

		// Check if patient has allergies
		// if no allergies ----> You're healthy
		// otherwise:
		// -----> if peanut allergy: Don't eat peanut
		// -----> if Lactose allergy: Don't drink milk
		// ------> if bee allergy: Don't mess with bees

		boolean isAllergy = false;
		boolean peanut = true;
		boolean lactose = false;
		boolean bees = true;
		if (isAllergy) {
			// We have allergies
			if (peanut) {
				System.out.println("Don't eat Peanut");
			}
			if (lactose) {
				System.out.println("Don't drink milk");
			}
			if (bees) {
				System.out.println("Don't mass with bees");
			}
		} else {
			// No allergies
			System.out.println("You're healthy.");
		}
	}
}
