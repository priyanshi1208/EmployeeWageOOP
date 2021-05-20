package com.employeeWage;

public class WagePerMonth extends DailyEmployeeWage {
	public int calculatingWage(int workingDays,int workingHour, int wagePerHour)
	{
		int dailyWage=super.DailyWage(workingHour,wagePerHour);
		return dailyWage*workingDays;
	}

}
