package com.kunitish.basicconcepts;

public class Contact 
{
	public String name;
	/*
	 * current object(this) who is calling like here contact1 , contact2 
	 */
	public String toString()
	{
		String temp = "";
		if(this instanceof Friend)
		{
			temp= "Work Name: " + name + "phoneNumber: " + ((Friend)this).phoneNumber;
		}
		else if(this instanceof Work)
		{
			temp= "Work Name: " + name + "Email: " + ((Work)this).email;	
		}
		return temp;
	}

	

}
