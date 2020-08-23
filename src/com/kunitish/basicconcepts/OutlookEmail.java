package com.kunitish.basicconcepts;

public class OutlookEmail implements Email 
{
	@Override
	public void senEmail() 
	{
	  System.out.println("Outlook email");
	}
}
