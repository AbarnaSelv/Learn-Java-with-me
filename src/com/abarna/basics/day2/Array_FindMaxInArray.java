package com.abarna.basics.day2;


public class Array_FindMaxInArray {
	 public static void main(String[] args) {
	        int[] numbers = {45, 22, 78, 91, 36, 89};
	        int max = numbers[0];
	        
	        for (int i = 1; i < numbers.length; i++) {
	            if (numbers[i] > max) {
	                max = numbers[i];
	            }
	        }
	        
	        System.out.println("Maximum value in the array: " + max);
	    }

}
