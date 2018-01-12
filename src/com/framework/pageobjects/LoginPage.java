package com.framework.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	@FindBy(name="username")
	private WebElement unTxtBx;
	@FindBy (name="pwd")
	private WebElement pwdTxtBx;
	@FindBy (id="loginButton")
	private WebElement loginBtn;
	//@FindBy
	public LoginPage (WebDriver driver){
		PageFactory.initElements(driver, this);
		
	}
	public void login(String username, String password)
	{
		unTxtBx.sendKeys(username);
		pwdTxtBx.sendKeys(password);
		loginBtn.click();
		
	}
}
