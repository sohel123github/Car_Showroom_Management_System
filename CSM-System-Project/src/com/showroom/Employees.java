package com.showroom;

import java.util.Scanner;
import java.util.UUID;

public class Employees extends Showroom implements Utility{
	
    String emp_id;
    String emp_name;
    int emp_age;
    String emp_department;
    
	@Override
	public void getDetails() {
	System.out.println("Employee ID: "+emp_id);	
	System.out.println("Employee Name: "+emp_name);	
	System.out.println("Employee Age: "+emp_age);	
	System.out.println("Employee Department: "+emp_department);	
	System.out.println("Employee Showroom Name: "+showroom_name);	
	}
	
	@Override
	public void setDetails() {
	System.out.println("=========== **** ENTER EMPLOYEE DETAILS **** ===========");
	System.out.println();
	Scanner sc = new Scanner(System.in);
	UUID uuid = UUID.randomUUID();
	emp_id = String.valueOf(uuid);
	System.out.println("EMPLOYEE NAME: ");
	emp_name = sc.nextLine();
	System.out.println("EMPLOYEE AGE: ");
	emp_age = sc.nextInt();
	sc.nextLine();
	System.out.println("EMPLOYEE DEPARTMENT: ");
	emp_department = sc.nextLine();
	System.out.println("SHOWROOM NAME:");
	showroom_name = sc.nextLine();
	total_employees++;
	}
    
    
	
	

}
