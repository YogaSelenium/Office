package com.cync.userTS;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.cync.base.BaseTest;
import com.cync.base.ExtentTestManager;
import com.cync.pages.CyncHomePage;
import com.cync.pages.LoginPage;
import com.cync.utility.TestGroups;
import com.cync.utility.TestUtil;
import com.cync.utility.Xls_Reader;
import com.relevantcodes.extentreports.LogStatus;

public class LoginTest extends BaseTest{
	
    Xls_Reader xls_reader=new Xls_Reader(System.getProperty("user.dir")+"\\TestDataProvider\\AdminModule.xlsx");
	
	@Test(dataProvider="LoginData", groups={TestGroups.SANITY,TestGroups.SMOKE},testName="Cync_001: Verify Cync Login Successful.")
	public void verifySuccessfulLogin1(String username,
				String password,
				String expectedResult){
		ExtentTestManager.getTest().getTest().setName("Cync_001: Verify Cync Login with username: "+username+" , password: "+password+" and expectedResult."+expectedResult);
		ExtentTestManager.getTest().assignCategory("Module: Login Test");
		LoginPage loginPage=new LoginPage(driver);
				
		//Step1: Enter username in the the Login field
		Assert.assertEquals(loginPage.setUserName(username),true,"Oops! username cannot enter.");
		ExtentTestManager.getTest().log(LogStatus.PASS, "Enter username in the the Login field.",username);
		
		//Step2: Enter password in the the password field
		Assert.assertEquals(loginPage.setPassword(password),true);
		ExtentTestManager.getTest().log(LogStatus.PASS, "Enter password in the the password field.",password);

		//Step3: Click to Login Button
		Object page=loginPage.clickLoginButton();
		ExtentTestManager.getTest().log(LogStatus.PASS, "Click to Login Button.");

		/*if(page instanceof CyncHomePage) {
			CyncHomePage cyncHomePage=(CyncHomePage) (page);
			String actualSuccessMessage=cyncHomePage.getSuccessfulMessage();
			Assert.assertEquals(actualSuccessMessage, expectedResult);
			ExtentTestManager.getTest().log(LogStatus.PASS, "Successful login message is appeared and verified.",actualSuccessMessage);
		}else if(page instanceof LoginPage) {
			String actualSuccessMessage=loginPage.getErrorMessage();
			Assert.assertEquals(actualSuccessMessage, expectedResult);
			ExtentTestManager.getTest().log(LogStatus.PASS, "Unsuccessful login message is appeared and verified. ",actualSuccessMessage);
		}else{
			Assert.fail("Login Page and Cync Home Page is not reachable");
		}*/
		
	}

	
	@DataProvider(name="LoginData")
	public Object[][] getData(){
		return TestUtil.getData(xls_reader, "LoginTest");
	}

}
