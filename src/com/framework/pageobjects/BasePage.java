package com.framework.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {
	//store all common webElements
	
	@FindBy(xpath="//div[text()='Tasks']")
	private WebElement tasks;
	@FindBy(id="logoutLink")
	private WebElement logoutLink;
	public BasePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
		
	}
	public void clickTask()
	{
	tasks.click();
	}
	public void clickonLogoutLink(){
		logoutLink.click();
	}
}
