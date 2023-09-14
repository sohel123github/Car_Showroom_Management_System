package com.showroom;

import java.util.Scanner;

public class Cars extends Showroom implements Utility {
	
    String car_name;
    String car_colour;
    String car_fuel_type;
    int car_price;
    String car_type;
    String car_transmission;
	
	@Override
	public void getDetails() {
	System.out.println("Car Name: "+car_name);
	System.out.println("Car Colour: "+car_colour);
	System.out.println("Fuel Type: "+car_fuel_type);
	System.out.println("Price: "+car_price);
	System.out.println("Type: "+car_type);
	System.out.println("Transmission: "+car_transmission);
	}

	@Override
	public void setDetails() {
	System.out.println("========== **** ENTER CAR DETAILS **** ==========");
	System.out.println();
	Scanner sc = new Scanner(System.in);
	System.out.println("CAR NAME: ");
	car_name = sc.nextLine();
	System.out.println("CAR COLOUR: ");
	car_colour = sc.nextLine();
	System.out.println("CAR FUEL TYPE (PETROL / DIESEL): ");
	car_fuel_type = sc.nextLine();
	System.out.println("CAR PRICE: ");
	car_price = sc.nextInt();
	sc.nextLine();
	System.out.println("CAR TYPE (SEDAN / SUV / HATCHBACK): ");
	car_type = sc.nextLine();
	System.out.println("TRANSMISSION TYPE (AUOTOMATIC / MANUAL):");
	car_transmission = sc.nextLine();
	total_cars_in_stock++;
	
	}
	
}
