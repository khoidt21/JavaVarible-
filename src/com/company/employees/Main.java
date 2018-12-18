package com.company.employees;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp = new Employee(1,"Tuan","Khoi",100);
		emp.getAnnualSalary();
		System.out.println("Salary up: " + emp.calSalary(10));
		emp.display();
		System.out.println("---------------------------");
		Employee emp1 = new Employee(2,"Le", "Lai", 200);
		emp1.getAnnualSalary();
		System.out.println("Salary up: " + emp1.calSalary(20));
		emp1.display();
		System.out.println("----------------------------");
		Employee emp2 = new Employee(3,"Nguyen Van","Hung",300);
		emp2.getAnnualSalary();
		System.out.println("Salary up: " + emp2.calSalary(10));
		emp2.display();
		System.out.println("----------------------------");
		
	}

}
