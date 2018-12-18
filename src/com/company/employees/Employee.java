package com.company.employees;

public class Employee {
	 
	private int id;
	private String firstName;
	private String lastName;
	private int salary;
	
	public Employee(int id,String firstName,String lastName,int salary) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
		
	}
	public void getAnnualSalary() {
		System.out.println("Salary of employee : " + salary);
	}
	public double calSalary(double percent) {
		return salary * percent/100;
	}
    public void display() {
    	System.out.println("Employee[" + "id="+id + ", name="+firstName +lastName + ", salary="+salary +"]");
    }
    
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
}
