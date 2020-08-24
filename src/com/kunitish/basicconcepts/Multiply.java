package com.kunitish.basicconcepts;

public class Multiply implements Calculate 
{
	public void calculate(double num1, double num2) 
	{
		System.out.println("Result is:" + num1*num2);
	}
}
