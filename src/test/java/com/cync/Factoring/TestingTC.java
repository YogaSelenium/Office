package com.cync.Factoring;

import org.junit.Assert;
import org.testng.annotations.Test;

import com.cync.FactoringPages.FactoringClientCreationPage;
import com.cync.base.BaseTest;
import com.cync.base.ExtentTestManager;
import com.cync.utility.TestGroups;
import com.cync.utility.Xls_Reader;
import com.relevantcodes.extentreports.LogStatus;

public class TestingTC extends BaseTest{

	
	Xls_Reader xls_reader = new Xls_Reader(System.getProperty("user.dir")
			+ "\\TestDataProvider\\SanityFactoring.xlsx");

	@Test(dataProvider = "ClientCreation", groups = { TestGroups.SMOKE,
			TestGroups.REGRESSION }, testName = " Factoring Client Creation")
	
	public void TC_01_FactoringClientCreation(String clientname,String shortname,String clientnumber,String successmsg,String BrokerName,String AccountName,String BankName,String AccountNo,String RoutingNo,String BrokerDays,String CommissionPercentage) throws InterruptedException
	{
		
		ExtentTestManager.getTest().getTest().setName("Factoring Client Creation");
        ExtentTestManager.getTest().assignCategory("Module:Factoring");
       
        //Step 1: navigate to client creation page
        FactoringClientCreationPage fact = cyncHomePage.getCyncMenus().openFactoringClientCreation();
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully navigated to Create Factoring Client Page");
        
        String Header = "Client Information";
        
        Assert.assertEquals(fact.VerifyHeader(Header),Header);
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified the Header");
        
        //Step 2: add value to client name
        Assert.assertEquals(fact.addValueToClientnameTextBox(clientname),clientname);
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully entered client name");
        Thread.sleep(500);
        //step 3: add value to short name
        Assert.assertEquals(fact.addValueToShortClientnameTextBox(shortname),shortname);
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully entered client short name");
        Thread.sleep(500);
        //step 4: add value to client number
        Assert.assertEquals(fact.addValueToClientNumTextBox(clientnumber), clientnumber);
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully entered Client number");
        
        //step 5: add Manager
        Assert.assertTrue(fact.ManagerCheckBox());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully selected manager");
        Thread.sleep(1000);
        //click on save
        Assert.assertTrue(fact.SaveBTNClick());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfuly clicked on Save");
        
        this.isAlertPresent();
        
        //verify the Success message  
       Assert.assertTrue(fact.VerifySuccessMessage());
       ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified success message");
        
		
	}
}
