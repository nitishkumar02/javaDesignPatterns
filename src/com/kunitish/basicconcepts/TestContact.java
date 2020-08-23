package com.kunitish.basicconcepts;
/*
 * to show casting of objects
 */

public class TestContact 
{
	public static void main(String[] args)
	{
		/*
		 * Friend contact1 = new Friend();
		 * use Superclass obj = new Subclass()
		 */
		Contact contact1 = new Friend();
		contact1.name = "Alex";
		 //contact1.phoneNumber = "555";  can not access directly ,since Contact has no access
		((Friend)contact1).phoneNumber = "555";
		
		
		//Work contact2 = new Work();
		Contact contact2 = new Work();
		contact2.name="Sara";
		((Work)contact2).email ="666@";
		
	}
	

}
