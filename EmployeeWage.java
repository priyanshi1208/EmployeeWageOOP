package com.employeeWage;

public class EmployeeWage {
	public static void main(String[] args) {
		MonthlyWageCondition monthlyWage=new MonthlyWageCondition();
		int wage=monthlyWage.EnsuringCondition(100,20,0,0,20);
		System.out.println(wage);
	}
}
