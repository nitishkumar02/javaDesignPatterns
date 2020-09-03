package com.kunitish.adhoc.concepts;

public class MarkerImplTestDriver {

	public static void main(String[] args)
	{
		MarkerImplClass obj = new MarkerImplClass();
		if(obj instanceof Marker)
		{
			System.out.println("Permission:simple class function with interface impl" );
			obj.show();
		}
		else
		{
			System.out.println("No Permission:simple class function without interface impl" );
			obj.show();
		}
	}
}
