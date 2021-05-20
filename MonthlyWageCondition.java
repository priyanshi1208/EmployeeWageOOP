package com.employeeWage;

public class MonthlyWageCondition extends DailyEmployeeWage{
	public int EnsuringCondition(int maxWorkingHour,int maxWorkingDays, int workingDays, int workingHour,int wagePerHour)
	{
		int empWage=0;
		
		while(maxWorkingHour>=workingHour&& maxWorkingDays>workingDays)
		{
			int Emp_type_work_hour=EmployeeType.EmployeeHours();
			System.out.println(Emp_type_work_hour);
			workingHour+=Emp_type_work_hour;
			workingDays++;
			empWage=super.DailyWage(workingHour, wagePerHour);
			//System.out.println(empWage);
		}
		return empWage;
	}
}
