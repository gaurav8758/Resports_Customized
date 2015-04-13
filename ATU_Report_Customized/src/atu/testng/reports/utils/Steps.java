package atu.testng.reports.utils;

import atu.testng.reports.logging.LogAs;

public class Steps
{
  private String description;
  private String inputValue;
  private String expectedValue;
  private String actualValue;
  private String time;
  private String lineNum;
  private String screenShot;
  private LogAs logAs;
  
  public String getDescription()
  {
    return description;
  }
  
  public void setDescription(String paramString)
  {
    description = paramString;
  }
  
  public String getInputValue()
  {
    return inputValue;
  }
  
  public void setInputValue(String paramString)
  {
    inputValue = paramString;
  }
  
  public String getExpectedValue()
  {
    return expectedValue;
  }
  
  public void setExpectedValue(String paramString)
  {
    expectedValue = paramString;
  }
  
  public String getActualValue()
  {
    return actualValue;
  }
  
  public void setActualValue(String paramString)
  {
    actualValue = paramString;
  }
  
  public String getTime()
  {
    return time;
  }
  
  public void setTime(String paramString)
  {
    time = paramString;
  }
  
  public String getLineNum()
  {
    return lineNum;
  }
  
  public void setLineNum(String paramString)
  {
    lineNum = paramString;
  }
  
  public String getScreenShot()
  {
    return screenShot;
  }
  
  public void setScreenShot(String paramString)
  {
    screenShot = paramString;
  }
  
  public LogAs getLogAs()
  {
    return logAs;
  }
  
  public void setLogAs(LogAs paramLogAs)
  {
    logAs = paramLogAs;
  }
}
