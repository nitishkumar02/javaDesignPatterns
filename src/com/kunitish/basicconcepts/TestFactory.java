package com.kunitish.basicconcepts;

import java.util.Scanner;

public class TestFactory {

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter first number");
		double num1 = input.nextDouble();
		
		System.out.println("Enter first number");
		double num2 = input.nextDouble();
		
		/*
		 * Divide obj = new Divide(); obj.calculate(num1,num2);
		 */
		System.out.println("Enter the oprn to perform number add,subtract,multiply,divide:");
         CalculateFactory factory = new CalculateFactory();
         Calculate obj =factory.getCalculate(input.next());
         obj.calculate(num1, num2);

	}

}
