package com.syntax.class22Task;

public class Test extends ScrumTeam {

	public static void main(String[] args) {
		Test obj1 = new Test();
		obj1.ceremonies = "Ceremonies";
		obj1.work();
		obj1.attendsMeetings();
		obj1.workOnBuildingSoftware();

		Test.company = "MyFutureCompany Inc";
		obj1.salary = 110_000;
		obj1.getPaid();
	}
}
