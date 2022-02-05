package com.bridgelabz;

public class EmployeeWageComputation {

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation Problem");
		
		final int FULL_TIME = 1;
		final int WAGE_PER_HR = 20;
		int FullDayHours = 0;
	    int empCheck = (int) (Math.random() * 100) % 2;
	    if (empCheck == FULL_TIME)
	    {
	        System.out.println("Employee is Present");
	        FullDayHours = 8;
	    } else
	    {
	        System.out.println("Employee is Absent");
	    }
	    int wage = FullDayHours * WAGE_PER_HR;
	    System.out.println("Employee Daily Wage is " + wage);
	}
}

