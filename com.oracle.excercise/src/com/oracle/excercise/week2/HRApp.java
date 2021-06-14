package com.oracle.excercise.week2;

public class HRApp {

	public static void main(String[] args) {
		System.out.println("HRApp Starts");

		Employee emp1 = new Employee(230, "Vaibhav", 53000.95);
		Employee emp2 = new Employee(232, "Jerry", 5300.95);
		
		System.out.println("Emp "+emp1);
		System.out.println("Emp "+emp2);
		
		Department dept1 = new Department("Edu");
		dept1.addEmp(emp1);;
		dept1.addEmp(emp2);
		dept1.addEmp(new Employee(235, "Atray", 555555.55));
	
		Employee[] emps = dept1.getEmployee();
		for (Employee emp :emps) {
			System.out.println("Emp "+emp);
		}
		
		System.out.println("Total "+dept1.getTotalSalary());
	}
}