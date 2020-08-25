package com.kunitish.tempalate;

public class TextFile {
	public void readWriteSave()
	{
		readData();
		writeData();
		saveData();
		
	}

	public void readData()
	{
		System.out.println("Read data from text File");
	}
	public void writeData()
	{
		System.out.println("write Data to text File");
	}
	public void saveData() {
		System.out.println("Save Data to Text file");
	}
}
