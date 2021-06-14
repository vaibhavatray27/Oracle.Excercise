package com.oracle.excercise.week2;

public class Department {

	private String name;

	private Employee[] emp = new Employee[10];
	private int lastIndex = -1;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Department(String name) {
		super();
		this.name = name;
	}

	public void addEmp(Employee name) {
		if (lastIndex < emp.length) {
			lastIndex++;
			emp[lastIndex] = name;
		}
	}

	public Employee[] getEmployee() {

		Employee[] employees = new Employee[lastIndex + 1];
		for (int i = 0; i < employees.length; i++) {
			//if(employees[i]!= null)
			employees[i] = emp[i];

		}
		return employees;
	}
	
	public int getEmployeeCount() {
		return lastIndex +1;
	}
	
	public Employee getEmployeeById(int empId) {
		
		for(Employee emp : emp) {
			if(emp.getID()==empId) {
				return emp;
			}
		}
		return null;
	}
	
	public double getTotalSalary() {
		
		double sum=0.0;
		for(Employee emps: emp) {
			sum += emps.getSalary();
		}
		return sum;
	}
	
	public double getAverageSalary() {
		
		if(lastIndex>-1) {
			return getTotalSalary()/getEmployeeCount();
		}
		return 0.0;
	}

}
