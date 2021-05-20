package com.employeeWage;

import java.util.*;

public class EmployeeType {
	int Is_Full_Time = 0;
	int Is_Part_Time = 1;

	public static int EmployeeHours() {
		int workingHour = 0;
		int check = new Random().nextInt(2);
		System.out.println(check);
		switch (check) {
		case 0:
			workingHour = 4;
			break;
		case 1:
			workingHour = 8;
			break;
		}
		return workingHour;

	}
}
