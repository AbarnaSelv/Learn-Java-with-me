package com.abarna.day3_oops;

public class Inheritance_Dog extends Inheritance_Animal {
	 void makeSound() {
	        System.out.println("Bark!");
	    }

	    public static void main(String[] args) {
	    	Inheritance_Dog d = new Inheritance_Dog();
	        d.makeSound();
	    }
	

}
