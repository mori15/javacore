package com.digitek.mathoperations;

public class Mathoperations {

	public static void addNumbers(){
		int a = 15;
		int b = 10;
		int c = a+b;
		System.out.println("Result of two numbers:"+c);
	}

	public static void subtractNumbers() {
		int a = 20;
		int b = 10;
		int c = a-b;
		System.out.println("Subtraction of two numbers:"+c);
	}
	public static void main(String args[]){
		addNumbers();
		subtractNumbers();
	}
}
