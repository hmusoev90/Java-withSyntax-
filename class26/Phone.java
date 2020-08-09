package com.syntax.class26;

public abstract class Phone {

	public void makeCall() {
		System.out.println("Phone makes call");
	}

	public void sendText() {
		System.out.println("Phone can sent text");
	}

	public abstract void navigate();

	abstract void playMusic();
}

class Samsung extends Phone {

	public void navigate() {
		System.out.println("Samsung navigates ....");
	}

	void playMusic() {
		System.out.println("Samsung can play Music");
	}
}

class IPhone extends Phone {

	public void navigate() {
		System.out.println("iPhone navigates ....");
	}

	public void playMusic() {
		System.out.println("iPhone play music");
	}
}
