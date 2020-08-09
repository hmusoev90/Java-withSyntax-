package com.syntax.class24;

public class DegreeTaskTest {

	public static void main(String[] args) {
		
		DegreeTask degree = new DegreeTask();
		degree.getPrerequisite();
		
		Bachelors bachelor = new Bachelors();
		bachelor.getPrerequisite();
		
		Masters masters = new Masters();
		masters.getPrerequisite();
	}
}
