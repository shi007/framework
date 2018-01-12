package com.framework.scripts;

import org.testng.annotations.Test;

import com.framework.BaseLib;
import com.framework.ExcelUtilities;
import com.framework.pageobjects.ActiveProjAndCustPage;
import com.framework.pageobjects.CreateNewCustPage;
import com.framework.pageobjects.EditCustInfoPage;
import com.framework.pageobjects.EnterTimeTrackPage;
import com.framework.pageobjects.LoginPage;
import com.framework.pageobjects.OpenTaskPage;

public class TasksTest extends BaseLib{

	@Test
	public void CreateCustomerTest(){
		
	String Username = ExcelUtilities.readData("sheet1", 3, 1);	
	String Password = ExcelUtilities.readData("sheet1", 3, 2);
	LoginPage lp=new LoginPage(driver);
	lp.login(Username, Password);
	
	EnterTimeTrackPage ettp=new EnterTimeTrackPage(driver);
	ettp.clickTask();
	OpenTaskPage otp =new OpenTaskPage(driver);
	otp.clickonprojAndCustLink();
	
	ActiveProjAndCustPage apcp =new ActiveProjAndCustPage(driver);
	apcp.clickonCreateNewCustBtn();

	String customerName = ExcelUtilities.readData("sheet1", 3, 3);
	CreateNewCustPage cncp = new CreateNewCustPage(driver);
	
	cncp.createCustomer(customerName);
	apcp.verifyCreateCustMsg();
	apcp.clickonLogoutLink();
	
	}
	@Test(dependsOnMethods={"CreateCustomerTest"})
	public void deletecustomertest(){
		
		String Username = ExcelUtilities.readData("sheet1", 4, 1);	
		String Password = ExcelUtilities.readData("sheet1", 4, 2);
		LoginPage lp=new LoginPage(driver);
		lp.login(Username, Password);
		EnterTimeTrackPage ettp=new EnterTimeTrackPage(driver);
		ettp.clickTask();
		OpenTaskPage otp = new OpenTaskPage(driver);
		otp.clickonprojAndCustLink();
		String CustomerName = ExcelUtilities.readData("sheet1", 4, 3);	
		ActiveProjAndCustPage apcp= new ActiveProjAndCustPage(driver);
		apcp.selectCustomer(CustomerName);
		EditCustInfoPage ecip = new EditCustInfoPage(driver);
		ecip.deleteCustomer();
		apcp.verifydeletecustMsg();
		apcp.clickonLogoutLink();
				
	}
	
	
	
	
	
	
}
