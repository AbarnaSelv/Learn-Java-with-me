package com.abarna.day3_oops;

public class Constructor_student {
	String name;
    int age;

    public Constructor_student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
    	Constructor_student s = new Constructor_student("Abarna", 21);
        s.display();
    }

}
