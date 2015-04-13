package atu.testng.reports.enums;

public enum Colors
{
  PASS("#7BB661"),  FAIL("#E03C31"),  SKIP("#21ABCD");
  
  private String color;
  
  private Colors(String paramString)
  {
    setColor(paramString);
  }
  
  public String getColor()
  {
    return color;
  }
  
  private void setColor(String paramString)
  {
    color = paramString;
  }
}
