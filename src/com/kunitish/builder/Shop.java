package com.kunitish.builder;

public class Shop {
	public static void main(String[] args)
	{
		/*
		 * here we need to specify every argument to constructor, but what if we have to pass onle some
		 * parameters
		 */
		Phone p1 = new Phone("samsung", 2,"Qulcoom",24,4500);
		System.out.println(p1);
	}

}
