package com.bridgelabz;

public class EmployeeWageComputation {

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation Problem");
		
		final int FULL_TIME = 2;
		final int PART_TIME = 1;
		final int WAGE_PER_HR = 20;
		final int WORKING_DAYS = 20;
		int dailyWage = 0;
		int totalWage = 0;
		
		for (int day = 1; day <= WORKING_DAYS; day++)
		{
			System.out.println("FOR DAY " + day);
			
			int empCheck = (int) (Math.random() * 100) % 3;
			
			int FullDayHours =0;
			
			switch (empCheck)
	        {
	        case FULL_TIME:
	        	FullDayHours = 16;
	        	dailyWage = FullDayHours * WAGE_PER_HR;
	        	System.out.println("Employee is present for full time \n And Salary is " + dailyWage);
                break;
            case PART_TIME:
            	FullDayHours = 8;
            	dailyWage = FullDayHours * WAGE_PER_HR;
            	System.out.println("Employee is present for part time \n And Salary is " + dailyWage);
                break;
            default:
            	System.out.println("Employee is absent \n And Salary is " + dailyWage);
            	break;
            }
			
			totalWage += dailyWage;
	    }
		System.out.println("Total wage for a month is " + totalWage);
    }
}

