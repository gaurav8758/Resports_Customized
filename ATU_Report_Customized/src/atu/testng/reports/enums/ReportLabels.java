package atu.testng.reports.enums;

public enum ReportLabels
{
  HEADER_TEXT("ATU Graphical Reports for Selenium -  TestNG"),  PASS("Passed"),  FAIL("Failed"),  SKIP("Skipped"),  X_AXIS("Run Number"),  Y_AXIS("TC Number"),  LINE_CHART_TOOLTIP("Test Cases"),  ATU_LOGO("atu.png"),  ATU_CAPTION("<i style=\"float:left;padding-left:20px;font-size:12px\"></i>"),  PROJ_LOGO(""),  PROJ_CAPTION(""),  PIE_CHART_LABEL("Test Cases Percent Distribution"),  TC_INFO_LABEL("Requirement Coverage/Build Info/Cycle - Description");
  
  private String label;
  
  private ReportLabels(String paramString)
  {
    setLabel(paramString);
  }
  
  public String getLabel()
  {
    return label;
  }
  
  public void setLabel(String paramString)
  {
    label = paramString;
  }
}
