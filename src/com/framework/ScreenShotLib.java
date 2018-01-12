package com.framework;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
/**
 * 
 * @author SHIVA
 *created on 16th dec,2017
 */
public class ScreenShotLib {

	public void takeScreenshot(WebDriver driver, String filename)
	{
		EventFiringWebDriver efw= new EventFiringWebDriver(driver);
		File srcFile =efw.getScreenshotAs(OutputType.FILE);
		File destFile=new File(".\\screenshots\\"+filename+".png");
		try {
			FileUtils.copyFile(srcFile, destFile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	
	
	
	
	
}
