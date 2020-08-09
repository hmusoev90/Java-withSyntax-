package com.syntax.class27;

public class Recap {

}

abstract class Money { // 0% abstraction

	public void jump() {
		System.out.println("Monkey jumps");
	}
}

abstract class Mouse { // 50% abstraction

	public void eat() {
		System.out.println("Mouse eat cheese");
	}

	public abstract void still();
}
