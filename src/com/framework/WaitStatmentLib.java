package com.framework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitStatmentLib {
	
	public static void isleep(int sec)
	{
	try{
		Thread.sleep(sec*1000);
	}
	catch(InterruptedException e)
	{
		e.printStackTrace();
	}		
	}
	/***********************************************************/
	public static void implicitwaitforseconds(WebDriver driver,int sec)
	{
		driver.manage().timeouts().implicitlyWait(sec, TimeUnit.SECONDS);
	}
		/**********************************************************/
		
		public static void implicitwaitforminutes(WebDriver driver,int mins)
		{
			driver.manage().timeouts().implicitlyWait(mins, TimeUnit.SECONDS);
		}
		/**********************************************/
		
		public static void explicitwaitforClickable(WebDriver driver,int sec, WebElement ele)
		{
			WebDriverWait wait= new WebDriverWait(driver,sec);
			wait.until(ExpectedConditions.elementToBeClickable(ele));
			
		}	
			/************************************************/
			
		public static void explicitwaitforvisiblity(WebDriver driver,int sec, WebElement ele)	
		{
			WebDriverWait wait1= new WebDriverWait(driver,sec);
			wait1.until(ExpectedConditions.visibilityOf(ele));
			
			
		}
			
			
			
			
			
			
			
		}
		
		
		
		
		
	
	
	
	
	
	


