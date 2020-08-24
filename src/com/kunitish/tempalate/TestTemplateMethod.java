package com.kunitish.tempalate;

public class TestTemplateMethod 
{
	public static void main(String[] args)
	{
		TextFile txtobj = new TextFile();
		txtobj.readData();
		txtobj.writeData();
		txtobj.saveData();
		
		ExcelFile exlobj = new ExcelFile();
		exlobj.readData();
		exlobj.writeData();
		exlobj.saveData();
	}
  
  
}
