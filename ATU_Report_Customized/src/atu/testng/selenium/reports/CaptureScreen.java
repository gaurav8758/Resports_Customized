package atu.testng.selenium.reports;

import org.openqa.selenium.WebElement;

public class CaptureScreen
{
  private boolean captureBrowserPage = false;
  private boolean captureDesktop = false;
  private boolean captureWebElement = false;
  private WebElement element = null;
  
  public CaptureScreen(WebElement paramWebElement)
  {
    if (paramWebElement != null)
    {
      setCaptureWebElement(true);
      setElement(paramWebElement);
    }
  }
  
  public CaptureScreen(ScreenshotOf paramScreenshotOf)
  {
    if (paramScreenshotOf == ScreenshotOf.BROWSER_PAGE) {
      setCaptureBrowserPage(true);
    } else if (paramScreenshotOf == ScreenshotOf.DESKTOP) {
      setCaptureDesktop(true);
    }
  }
  
  public boolean isCaptureBrowserPage()
  {
    return captureBrowserPage;
  }
  
  public void setCaptureBrowserPage(boolean paramBoolean)
  {
    captureBrowserPage = paramBoolean;
  }
  
  public boolean isCaptureDesktop()
  {
    return captureDesktop;
  }
  
  public void setCaptureDesktop(boolean paramBoolean)
  {
    captureDesktop = paramBoolean;
  }
  
  public boolean isCaptureWebElement()
  {
    return captureWebElement;
  }
  
  public void setCaptureWebElement(boolean paramBoolean)
  {
    captureWebElement = paramBoolean;
  }
  
  public WebElement getElement()
  {
    return element;
  }
  
  public void setElement(WebElement paramWebElement)
  {
    element = paramWebElement;
  }
  
  public static enum ScreenshotOf
  {
    BROWSER_PAGE,  DESKTOP;
    
    private ScreenshotOf() {}
  }
}
