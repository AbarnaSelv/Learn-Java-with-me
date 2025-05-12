package com.abarna.day3_oops;

public class Class_nd_Object_car {
	String brand = "Tesla";
    int speed = 120;

    void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Top Speed: " + speed + " km/h");
    }

    public static void main(String[] args) {
    	Class_nd_Object_car myCar = new Class_nd_Object_car();
        myCar.displayDetails();
    }

}
