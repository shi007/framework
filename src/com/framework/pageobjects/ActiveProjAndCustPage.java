package com.framework.pageobjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;

public class ActiveProjAndCustPage extends BasePage{

	@FindBy(css="input[value='Create New Customer']")
	private WebElement createNewCustBtn;
	@FindBy(className="successmsg")
	private WebElement successMsg;
	@FindBy(name="selectedcustomer")
	private WebElement CustomerdropDown;
	@FindBy (xpath="//input[contains(@value,'Show']")
	private WebElement showBtn;
	@FindBy(xpath="//td[Starts-with(@id,'customerNameCell')]//a[contains(@href,'customerId')]")
	private List<WebElement> custNameLink;
	
	public ActiveProjAndCustPage(WebDriver driver)
	
	{
		super(driver);	
		PageFactory.initElements(driver, this);
	}
	public void clickonCreateNewCustBtn()
	{
		
		createNewCustBtn.click();
		
	}
	public void verifyCreateCustMsg()
	{
		Assert.assertTrue(successMsg.isDisplayed());
		Reporter.log(successMsg.getText(), true);
	}

	public void selectCustomer(String CustomerName)
	{
	Select sel =new Select(CustomerdropDown);
	sel.selectByVisibleText(CustomerName);
	showBtn.click();
	if(custNameLink.get(0).getText().equals(CustomerName))
	{
		custNameLink.get(0).click();
	}
	else{
		System.out.println(CustomerName+" doesnot Exist");
	}
	}
	
	public void verifydeletecustMsg(){
		
		String expmsg ="Customer has been successfullt deleted";
		String actmsg= successMsg.getText();
		Assert.assertEquals(actmsg, expmsg);
		Reporter.log("Delete Customer msg is verified", true);
		
	}
}
	
	

