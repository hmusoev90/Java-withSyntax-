package com.syntax.class14;

import java.util.Scanner;

/*  Accept username, password and confirm password from a 
 * user and check following requirements:

    1. Username and Password cannot be  empty, 
    	if so --> message=“Username and Password cannot be empty”.
	2. Password should be minimum 8 characters, 
		if less --> message=“Password is too short”.
	3. Password cannot contain username 
		if so, --> message=“Password cannot contain username”.
	4. Password should match confirmed password, 
	    if not  --> message=“Passwords do not match”.

		Only after all requirements met --> 
		message “Your username and password has been created”
 * 
 */
public class Task01 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter Username, please:");
		String userName = input.nextLine();

		System.out.println("Enter Password, please:");
		String password = input.nextLine();

		if (userName.isEmpty() || password.isEmpty()) {
			System.err.println("Username or Password cannot be empty.");
		} else {
			if (password.length() >= 8) {
				if (!password.contains(userName)) {
					System.out.println("Confirm the password, please:");
					String confirmPassword = input.nextLine();
					if (password.equals(confirmPassword)) {
						System.out.println("Your username and password has been created");
					} else
						System.err.println("Passwords do not match");
				} else {
					System.err.println("Password cannot contain username.");
				}
			} else {
				System.err.println("Password is too short");
			}

		}
	}
}
