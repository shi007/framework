package com.framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseLib {

	public WebDriver driver;
	
	@BeforeMethod
	@Parameters("browser")
//	public void setUP(String browserName)
//	{
	public void setUp(){
		String browserName = GetPropertyValue.getvalue("browser");
	if (browserName.equalsIgnoreCase("firefox")){
		driver= new FirefoxDriver();
		Reporter.log("Firefox Launched", true);
		
	}
	else if (browserName.equalsIgnoreCase("Chrome"))
	{
		System.setProperty("webdriver.chrome.driver",".\\exefiles\\chromedriver.exe");
		
	driver=new ChromeDriver();
	Reporter.log("Chrome Launched", true);
	}
	driver.manage().window().maximize();
	WaitStatmentLib.implicitwaitforseconds(driver,20);
	driver.get(GetPropertyValue.getvalue("url"));
	
}
@AfterMethod

public void tearDown(ITestResult Result)
{
	if (Result.isSuccess()){
		System.out.println("Result pass");
		
	}
	else{
		System.out.println("Result fail");
		String filename=Result.getMethod().getMethodName();
		ScreenShotLib slib= new ScreenShotLib();
		slib.takeScreenshot(driver, filename);
		Reporter.log("Screenshot has been taken", true);
	}
	//driver.close();
	Reporter.log("Browser closed", true);
}

}






