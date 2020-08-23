package com.kunitish.basicconcepts;

public class Test {

	public static void main(String[] args)
	{
		   System.out.println("---A class Object-----");																																														 
		   SupA aobj = new SupA();
		   aobj.methodA();
		   
		   System.out.println("---B class Object-----");
		   
		   SubB bobj = new SubB();
		   bobj.methodA();
		   bobj.methodB();
		   /*
		    * Superclass obj = new Subclass();
		    * obj has value of subclass and property of Superclass
		    * 
		    */
		   System.out.println("---A or B class Object-----");
		   SupA obj2 = new SubB();
		   obj2.methodA();
		   
		   /*
		    * Subclass obj = new Superclass();
		    * not true
		    */
		   
		   
		   
	}

}
