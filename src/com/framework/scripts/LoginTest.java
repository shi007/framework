package com.framework.scripts;

import org.testng.annotations.Test;

import com.framework.BaseLib;
import com.framework.ExcelUtilities;
import com.framework.pageobjects.EnterTimeTrackPage;
import com.framework.pageobjects.LoginPage;

public class LoginTest extends BaseLib
{
@Test
public void validLoginTest()
{
	String username= ExcelUtilities.readData("Sheet1", 1, 1);
	String password= ExcelUtilities.readData("Sheet1", 1, 2);
	LoginPage lp = new LoginPage(driver);
	lp.login(username, password);
	EnterTimeTrackPage ettp = new EnterTimeTrackPage(driver);
	ettp.verifyHomePage();
	
}	//@Test
//public void invalidLoginTest
	
	
	
	
	
	
	
	
	
	
	
}
