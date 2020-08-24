package com.kunitish.basicconcepts;

public class CalculateFactory{

	public Calculate getCalculate(String type)
	{
		Calculate obj=null;
		if(type.toLowerCase().equals("add"))
		{
			obj = new Add();
		}
		else if(type.toLowerCase().equals("subtract"))
		{
			obj = new Subtract();
		}
		else if(type.toLowerCase().equals("multiply"))
		{
			obj = new Multiply();
		}
		else if(type.toLowerCase().equals("divide"))
		{
			obj = new Divide();
		}
		else
		{
			System.out.println("We do not do that");
		}
		return obj;
	}
}
