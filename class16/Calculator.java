package com.syntax.class16;

public class Calculator {
public static void main(String[] args) {
	
	CalculatorTest calc = new CalculatorTest();
	
	calc.add(100,20);
	calc.sub(10, 15);
	calc.mult(5, 4);
	calc.div(5, 0);
}
}
