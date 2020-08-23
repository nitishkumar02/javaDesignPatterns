package com.kunitish.basicconcepts;

public class TestEmployee 
{
	public static void main(String[] args)
	{
		Email email = new OutlookEmail();
		Employee obj1 = new Employee("1","as",email);
		obj1.notifyEmployee();
		
		Email email1 = new WebserviceEmail();
		 Employee obj2 = new Employee("1","as",email1);
		obj2.notifyEmployee();
	}
	
	

}
