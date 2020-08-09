package com.syntax.class26;

public class PhoneTest {
	public static void main(String[] args) {

		Phone iphone = new IPhone();

		iphone.makeCall();
		iphone.sendText();
		iphone.navigate();
		iphone.playMusic();

		System.out.println(" - - - - - -");

		Phone samsung = new Samsung();
		samsung.makeCall();
		samsung.sendText();
		samsung.navigate();
		samsung.playMusic();

	}
}
