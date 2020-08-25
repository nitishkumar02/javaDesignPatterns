package com.kunitish.tempalate;

public class TestTemplateMethod 
{
	public static void main(String[] args)
	{
		//TextFile txtobj = new TextFile();
		//txtobj.readWriteSave(); 
		DataProcessor obj = new TextFile();
		
		obj.readWriteSave();
		
		
		obj = new ExcelFile();
		obj.readWriteSave();
		
	}
  
  
}
