package com.abarna.oops.day3;

public class Method_Calculator {

	// Method without return
    void greet() {
        System.out.println("Welcome to the Calculator!");
    }

    // Method with parameters and return value
    int add(int a, int b) {
        return a + b;
    }

    // Static method
    static int square(int x) {
        return x * x;
    }

    public static void main(String[] args) {
    	Method_Calculator calc = new Method_Calculator();

        calc.greet();

        int result = calc.add(5, 10);
        System.out.println("Sum: " + result);

        System.out.println("Square of 4: " + Method_Calculator.square(4));
    }
}
