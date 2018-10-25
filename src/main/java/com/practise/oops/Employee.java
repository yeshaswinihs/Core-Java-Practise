package com.practise.oops;

public class Employee extends Person {

	private String title;
	private String employeer;
	private char employeeGrade;
	private int salary;

	public Employee() {
		System.out.println("Employee constructor");
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getEmployeer() {
		return employeer;
	}

	public void setEmployeer(String employeer) {
		this.employeer = employeer;
	}

	public char getEmployeeGrade() {
		return employeeGrade;
	}

	public void setEmployeeGrade(char employeeGrade) {
		this.employeeGrade = employeeGrade;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [title=" + title + ", employeer=" + employeer + ", employeeGrade=" + employeeGrade
				+ ", salary=" + salary + ", toString()=" + super.toString() + "]";
	}

}
