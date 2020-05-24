package com.cync.Factoring;

import org.junit.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.cync.FactoringPages.RecoursePageFactoring;
import com.cync.FactoringPages.VerifiedPageFactoring;
import com.cync.base.BaseTest;
import com.cync.base.ExtentTestManager;
import com.cync.utility.TestGroups;
import com.cync.utility.TestUtil;
import com.cync.utility.Xls_Reader;
import com.relevantcodes.extentreports.LogStatus;

public class Reverse_RecourseTC extends BaseTest{

	Xls_Reader xls_reader = new Xls_Reader(System.getProperty("user.dir")
			+ "\\TestDataProvider\\SanityFactoring.xlsx");

	
	@Test(dataProvider = "ClientCreation", groups = { TestGroups.SMOKE,
			TestGroups.REGRESSION }, testName = "Reverse on FundedPage")

	public void TC_01_ReverseFromRecoursePage(String clientname,String shortname,String clientnumber,String successmsg,String BrokerName,String AccountName,String BankName,String AccountNo,String RoutingNo,String BrokerDays,String CommissionPercentage){
		
		ExtentTestManager.getTest().getTest().setName("Reversal test script factoring:Reverse from Recourse Page");
        ExtentTestManager.getTest().assignCategory("Module:Factoring");
        
        String clientdata = "AB FACT";
        cyncHomePage.getCyncMenus().selectClientFromDropDown(clientname);
        
      //Step 1: navigate to Recourse page
        RecoursePageFactoring fact = cyncHomePage.getCyncMenus().openRecoursePageFactoring();
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully navigated to FundedInvoice Page");
        
      //Setp 2:Select a Batch from Drop down
        Assert.assertTrue(fact.ClickonSelectBatchDropdown_reverse());
      //Assert.assertTrue(fact.dropdown());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully selected Batch for Reversal");
      //Step 3:Click on Reverse
        Assert.assertTrue(fact.ClickReverseButton());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully selected Reverse button  a batch");
        //Step 5:Click on Notification Center
        Assert.assertTrue(fact.ClickonNotification());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Sucessfully selected notification center");
      //Step 4:Verify Reversal success message
        String expectedMsg="Reverse Batch Succeed";
        Assert.assertTrue(fact.verifyNotification(expectedMsg));
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully Verified sucessfull message");
	}
	
	
	@Test(dataProvider = "ClientCreation", groups = { TestGroups.SMOKE,
			TestGroups.REGRESSION }, testName = "Verify in verified page")
	
	public void TC_02_VerifiedPage(String clientname,String shortname,String clientnumber,String successmsg,String BrokerName,String AccountName,String BankName,String AccountNo,String RoutingNo,String BrokerDays,String CommissionPercentage){
	
		
		ExtentTestManager.getTest().getTest().setName("Reversal test script factoring:Reverse from Funded invoice");
        ExtentTestManager.getTest().assignCategory("Module:Factoring");
        
        String clientdata = "AB FACT";
        cyncHomePage.getCyncMenus().selectClientFromDropDown(clientname);
        
        
		 //Step 1: navigate to Verified page
        VerifiedPageFactoring fact = cyncHomePage.getCyncMenus().openVerifiedPageFactoring();
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully navigated to Verified Page");
		
		//Step 2:Verify Reversed batch in Verified Page
        Assert.assertTrue(fact.VerifyDatainDropDown());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully Verified data in Drop down after Reversal"); 
	}
	
	
	
	
	
	
	
	@DataProvider(name = "ClientCreation")
	public Object[][] getData1() 
	  {
		return TestUtil.getData(xls_reader, "ClientCreation");
		
	  }
}
