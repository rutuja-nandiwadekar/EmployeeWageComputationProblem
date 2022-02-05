package com.bridgelabz;

public class EmployeeWageComputation {

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation Problem");
		
		final int FULL_TIME = 2;
		final int PART_TIME = 1;
		final int WAGE_PER_HR = 20;
		final int WORKING_DAYS = 20;
		int totalWage = 0;
		
		for (int day = 1; day <= WORKING_DAYS; day++)
        {
			int FullDayHours = 0;
			int empCheck = (int) (Math.random() * 100) % 3;
	        switch (empCheck)
            {
	        case FULL_TIME:
                FullDayHours = 16;
                break;
            case PART_TIME:
                FullDayHours = 8;
                break;
            default:
            	
            }
	        
	        int wage = FullDayHours * WAGE_PER_HR;
	        System.out.println("Day " + day + " wage is:" + wage);
	        totalWage += wage;
	    }
		System.out.println("Total wage for a month is " + totalWage);
    }
}

