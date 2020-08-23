package com.kunitish.basicconcepts;

public class Employee 
{
	private String empid;
	private String empName;
	private int salary ;
	private String grade ;
	Email email;
	/*
	 * if something is always common in objects
	 */
	private String company="IBM";
	/*
	 * prevent creation of object without any value, by decalring parm constructor
	 */

	public Employee(String empid,String empName ,Email email) 
	{
		this.empid=empid;
		this.empName = empName;
		this.email =email;
	}
	
	public void notifyEmployee()
	{
		email.senEmail();
	}
}
