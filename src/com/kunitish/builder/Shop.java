package com.kunitish.builder;

public class Shop {
	public static void main(String[] args)
	{
		/*
		 * here we need to specify every argument to constructor, but what if we have to pass onle some
		 * parameters
		 */
		//Phone p1 = new Phone("samsung", 2,"Qulcoom",24,4500);
		/*
		 * here You can specify as much param u want to have the object
		 */
		Phone p1 = new PhoneBuilder().setOs("Andorid").setRam(2).getPhone();
		System.out.println(p1);
		
		
	}

}
