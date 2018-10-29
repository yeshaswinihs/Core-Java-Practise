package com.practice.oops;

public class EmployeeRunner {

	public static void main(String[] args) {
		Employee pradeep = new Employee();
		pradeep.setName("Pradeep");
		pradeep.setPhoneNumber("9535858926");
		pradeep.setEmail("pradeep.kodavoor@gmail.com");
		pradeep.setEmployeeGrade('A');
		pradeep.setSalary(20000);
		pradeep.setTitle("Associate");

		System.out.println(pradeep);
	}

}
