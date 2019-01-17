package com.practice.serialization;

import java.io.Serializable;

public class Employee implements Serializable {

	private static final long serialVersionUID = 7838496365681847805L;

	private String name;
	private int id;
	/*private String password;*/
	transient private int salary;

	public Employee(String name, int id/*, String password*/, int salary) {
		super();
		this.name = name;
		this.id = id;
		/*this.password = password;*/
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	/*public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}*/

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id /*+ ", password=" + password*/ + ", salary=" + salary + "]";
	}

}
