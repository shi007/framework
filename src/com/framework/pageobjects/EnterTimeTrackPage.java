package com.framework.pageobjects;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class EnterTimeTrackPage extends BasePage {
WebDriver driver;
	@FindBy(xpath="//img[contains(@src,'default-logo.png')]")
			private WebElement logo;
	
	public EnterTimeTrackPage(WebDriver driver)
	{super(driver);
		this.driver= driver;
		PageFactory.initElements(driver, this);
				
	}
	public void verifyHomePage(){
		
		Assert.assertTrue(logo.isDisplayed());
				Reporter.log("Home Page logo is displayed", true);
		String expTitle="actiTIME - Enter Time-Track";
		String actTitle=driver.getTitle();
		Assert.assertEquals(actTitle, expTitle);
		Reporter.log("Home page title is verified", true);
		
	}
	
	
	
	
	
	
	
	
	
	
}
