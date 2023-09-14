package com.showroom;

import java.util.Scanner;

public class Main {
	
	static void main_menu() {
	System.out.println();
	System.out.println("======== **** WELCOME TO CAR SHOWROOM MANAGEMENT SYSTEM **** ========");
	System.out.println();
	System.out.println("======== **** ENTER YOUR CHOICE **** ========");
	System.out.println();
	System.out.println("1].ADD SHOWROOMS \t\t\t 2].ADD CARS \t\t\t 3].ADD EMPLOYEES");
	System.out.println();
	System.out.println("4].GET SHOWROOMS \t\t\t 5].GET CARS \t\t\t 6].GET EMPLOYEES");
	System.out.println();
	System.out.println("======== **** ENTER 0 TO EXIT **** ========");
	}
	
	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	Showroom showroom[] = new Showroom [5];
	Cars cars[] = new Cars [5];
	Employees employees[] = new Employees [5];
	int showroom_counter = 0;
	int cars_counter = 0;
	int employees_counter = 0;
	int choice = 100;
	while(choice != 0) {
		main_menu();
		choice = sc.nextInt();
		
	while(choice != 0 && choice != 9) {
		switch (choice) {
		case 1:
			showroom[showroom_counter] = new Showroom();
			showroom[showroom_counter].setDetails();
			showroom_counter++;
			System.out.println();
			System.out.println("1].ADD NEW SHOWROOMS");
			System.out.println("9].GO BACK TO MAIN MENU");
			choice = sc.nextInt();
			break;
		case 2:
			cars[cars_counter] = new Cars();
			cars[cars_counter].setDetails();
			cars_counter++;
			System.out.println();
			System.out.println("2].ADD NEW CARS");
			System.out.println("9].GO BACK TO MAIN MENU");
			choice = sc.nextInt();
			break;
		case 3:
			employees[employees_counter] = new Employees();
			employees[employees_counter].setDetails();
			employees_counter++;
			System.out.println();
			System.out.println("3].ADD NEW EMPLOYEES");
			System.out.println("9].GO BACK TO MAIN MENU");
			choice = sc.nextInt();
			break;
		case 4:
			for(int i =0; i<showroom_counter; i++) {
				showroom[i].getDetails();
				System.out.println();
				System.out.println();
			}System.out.println();
			System.out.println("1].ADD NEW SHOWROOMS");
			System.out.println("9].EXIT");
			choice = sc.nextInt();
			break;
		case 5:
			for(int i =0; i<cars_counter; i++) {
				cars[i].getDetails();
				System.out.println();
				System.out.println();
			}System.out.println();
			System.out.println("2].ADD NEW CARS");
			System.out.println("9].EXIT");
			choice = sc.nextInt();
			break;
		case 6:
			for(int i =0; i<employees_counter; i++) {
				employees[i].getDetails();
				System.out.println();
			}System.out.println();
			 System.out.println("3].ADD NEW EMPLOYEES");
			 System.out.println("9].EXIT");
			 choice = sc.nextInt();
			 break;
		default:
			System.out.println("ENTER VALID CHOICE:");
			break;
			
		}
	}
	}
		
}
}
