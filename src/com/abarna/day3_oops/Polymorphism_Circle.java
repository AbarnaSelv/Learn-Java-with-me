package com.abarna.day3_oops;

public class Polymorphism_Circle extends Polymorphism_Shape {
	 @Override
	    void draw() {
	        System.out.println("Drawing a Circle");
	    }

	    public static void main(String[] args) {
	    	Polymorphism_Circle c = new Polymorphism_Circle();
	        c.draw();
	        c.draw("Red");
	    }

}
