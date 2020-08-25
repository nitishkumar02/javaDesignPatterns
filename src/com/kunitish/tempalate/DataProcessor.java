package com.kunitish.tempalate;

public abstract class DataProcessor 
{
	public void readWriteSave()
	{
		readData();
		writeData();
		saveData();
		
	}
	public abstract void readData();
	public abstract void writeData();
	public void saveData() 
	{
		System.out.println("Save Data to DB file");
	}
}
