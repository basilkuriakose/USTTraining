package com.EmployeeModel;

public class Employee {
	@Override
	public String toString() {
		return "Employee [ Employee_id=" + Employee_id +"Employee_name=" + Employee_name +  ", Employee_salary="
				+ Employee_salary + "]";
	}

	private String Employee_name;
	private int Employee_id;
	private int Employee_salary;
	
	public String getEmployee_name() {
		return Employee_name;
	}
	public void setEmployee_name(String employee_name) {
		Employee_name = employee_name;
	}
	
	
	public int getEmployee_id() {
		return Employee_id;
	}
	public void setEmployee_id(int employee_id) {
		Employee_id = employee_id;
	}
	public int getEmployee_salary() {
		return Employee_salary;
	}
	public void setEmployee_salary(int employee_salary) {
		Employee_salary = employee_salary;
	}
	
	public Employee( int employee_id,String employee_name,int employee_salary) {
		super();
		Employee_name = employee_name;
		Employee_id = employee_id;
		Employee_salary = employee_salary;
	}
	
	
}