package com.kunitish.tempalate;

public class TestTemplateMethod 
{
	public static void main(String[] args)
	{
		TextFile txtobj = new TextFile();
		txtobj.readWriteSave();
		
		
		ExcelFile exlobj = new ExcelFile();
		exlobj.readWriteSave();
		
	}
  
  
}
