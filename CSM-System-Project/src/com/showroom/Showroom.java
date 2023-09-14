package com.showroom;

import java.util.Scanner;

public class Showroom implements Utility{
	
	 String showroom_name;
	 String showroom_address;
	 String manager_name;
	 int total_employees;
	 int total_cars_in_stock = 0;
	
	@Override
	public void getDetails() {
	System.out.println("Showroom Name: "+showroom_name);
	System.out.println("Showroom Address: "+showroom_address);
	System.out.println("Total Employees: "+total_employees);
	System.out.println("Total Cars: "+total_cars_in_stock);
	System.out.println("Manager Name: "+manager_name);
	}
	
	@Override
	public void setDetails() {
	System.out.println("=========== **** ENTER SHOWROOM DETAILS **** ===========");
	System.out.println();
	Scanner sc = new Scanner(System.in);
	System.out.println("SHOWROOM NAME: ");
	showroom_name = sc.nextLine();
	System.out.println("SHOWROOM ADDRESS: ");
	showroom_address = sc.nextLine();
	System.out.println("MANAGER NAME: ");
	manager_name = sc.nextLine();
	System.out.println("TOTAL EMPLOYEES: ");
	total_employees = sc.nextInt();
	sc.nextLine();
	System.out.println("TOTAL CARS IN STOCK:");
	total_cars_in_stock = sc.nextInt();
	}
	 
	 
}
