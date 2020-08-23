package com.kunitish.singleton;

public class Logger 
{

	/*
	 *there is always a no-arg constructor created in class by default
	 *like : public Logger()
	 *       {
	 *            responsible to create  object of the class 
	 *       }
	 *       static available one per class, initialized with default values
	 */
	private static Logger logger;
	/*
	 * you will not be able to instantiate  object, outside of this class
	 */
	private Logger()
	{
		
	}
	public static Logger getInstance()
	{
		if(logger==null)
		{
			logger = new Logger();
		}
		return logger;
	}
}
