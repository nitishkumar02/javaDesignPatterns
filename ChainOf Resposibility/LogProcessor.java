package com.ChainResponsibility;

public abstract class LogProcessor
{
    public static int INFO=1;
    public static int DEBUG=1;
    public static int ERROR=1;

    LogProcessor nextLogProcessor;

    public LogProcessor(LogProcessor logProcessor)
    {
        this.nextLogProcessor = logProcessor;
    }

    public void log (int logLevel , String message)
    {
        if(nextLogProcessor != null)
        {
            nextLogProcessor.log(logLevel,message);
        }
    }
}

class DebugLogProcessor extends LogProcessor
{
    DebugLogProcessor(LogProcessor nextLogProcessor)
    {
        super(nextLogProcessor);
    }
    public void log (int logLevel , String message)
    {
        if(logLevel == DEBUG)
        {
            System.out.println("INFO " + message);
        }
        else
        {
            super.log(logLevel,message);
        }
    }
}

class ErrorLogProcessor extends LogProcessor
{
    ErrorLogProcessor(LogProcessor nextLogProcessor)
    {
        super(nextLogProcessor);
    }
    public void log (int logLevel , String message)
    {
        if(logLevel == INFO)
        {
            System.out.println("INFO " + message);
        }
        else
        {
            super.log(logLevel,message);
        }
    }
}

class InfoLogProcessor extends LogProcessor
{
    InfoLogProcessor(LogProcessor nextLogProcessor)
    {
        super(nextLogProcessor);
    }
    public void log (int logLevel , String message)
    {
        if(logLevel == ERROR)
        {
            System.out.println("INFO " + message);
        }
        else
        {
            super.log(logLevel,message);
        }
    }

}

class Main
{
    public static void main(String[] args)
    {
        LogProcessor logProcessor = new InfoLogProcessor(new DebugLogProcessor(new ErrorLogProcessor(null)));
        logProcessor.log(LogProcessor.ERROR ,"exception happens");
        logProcessor.log(LogProcessor.DEBUG ,"need to debug this");
        logProcessor.log(LogProcessor.INFO ,"just info");
    }
}
