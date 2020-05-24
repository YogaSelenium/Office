/*//Author : Abirami
package com.cync.Factoring;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.cync.FactoringPages.FactoringFeeSetupPage;
import com.cync.base.BaseTest;
import com.cync.base.ExtentTestManager;
import com.cync.pages.CyncHomePage;
import com.cync.pages.LoginPage;
import com.cync.utility.TestGroups;
import com.cync.utility.TestUtil;
import com.cync.utility.Xls_Reader;
import com.relevantcodes.extentreports.LogStatus;

public class FactoringFeeSetupTC extends BaseTest{
	Xls_Reader xls_reader = new Xls_Reader(System.getProperty("user.dir")
		    + "\\TestDataProvider\\FactoringModule.xlsx");
	
	
	//CY-5320
	@Test(dataProvider="FactoringFee",groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Verify the navigation to Factoring Fee setup")
	public void FactoringFeeSetupTC_01(String clientname)
	{
		ExtentTestManager.getTest().getTest().setName("Factoring Fee Setup:Verify all the fileds in Factoring Fee Setup Screen");
		 ExtentTestManager.getTest().assignCategory("Module:Factoring");

		 LoginPage loginPage = new LoginPage(driver);
		 CyncHomePage cyncHomePage = loginPage.doLogin();
		 Assert.assertEquals(cyncHomePage.getSuccessfulMessage(),"Signed in Successfully");
		 
		 //navigate to Factoring fee setup page
		 FactoringFeeSetupPage factFee = cyncHomePage.getCyncMenus().openFactoringFeeSetup();
		 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully navigated to Factoring Fee Setup screen");
	}
	
	
	//CY-5440
		@Test(dataProvider="FactoringFee", groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Verify all the fileds in Factoring Fee setup")
		public void FactoringFeeSetupTC_10(String clientname,String advanceRate,String feeTier1Days,String feeTier1Per )
		{
			 ExtentTestManager.getTest().getTest().setName("Factoring Fee Setup:Verify all the fileds in Factoring Fee Setup Screen");
			 ExtentTestManager.getTest().assignCategory("Module:Factoring");

			 LoginPage loginPage = new LoginPage(driver);
			 CyncHomePage cyncHomePage = loginPage.doLogin();
			 Assert.assertEquals(cyncHomePage.getSuccessfulMessage(),"Signed in Successfully");
			 
			 FactoringFeeSetupPage factFee = cyncHomePage.getCyncMenus().openFactoringFeeSetup();
			 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully navigated to Factoring Fee Setup screen");
			 
			 //click edit button
			 Assert.assertTrue(factFee.ClickOnEditBTN());
			 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked Edit button in Factoring Fee Setup screen");
			 
			 //passing data to advance rate text box
			 Assert.assertEquals(factFee.addValueToAdvanceRate(advanceRate), advanceRate);
			 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully passing data to Advance Rate Text Box in Factoring Fee Setup screen");
			 
			 //click fee tier add new button
			 Assert.assertTrue(factFee.ClickOnFeeTierAddNewBTN());
			 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked Fee Tier Add New Button in Factoring fee Setup screen");
			 
			 //passing data to fee tier1 days text box
			 Assert.assertEquals(factFee.addValueToFeeTier_1Days(feeTier1Days), feeTier1Days);
			 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully paassing data to Fee Tier Days Text Box in Factoring Fee setup screen");
			 
			 //passing data to fee tier1 per text box
			 Assert.assertEquals(factFee.addValueToFeeTier_1Per(feeTier1Per), feeTier1Per);
			 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully passing data to Fee Tier Percentage text box in Factoring Fee setup screen");	 	 
			 
		}
		
		//CY-5321
		@Test(dataProvider="FactoringFee", groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Verify Save Button in Factoring Fee Setup")
		public void FactoringFeeSetupTC_02(String clientname,String advanceRate,String feeCalculatedOn,String feeTier1Days,String feeTier1Per)
		{
			 ExtentTestManager.getTest().getTest().setName("Factoring Fee Setup:Verify Save Button in Factoring Fee Setup Screen");
			 ExtentTestManager.getTest().assignCategory("Module:Factoring");

			 LoginPage loginPage = new LoginPage(driver);
			 CyncHomePage cyncHomePage = loginPage.doLogin();
			 Assert.assertEquals(cyncHomePage.getSuccessfulMessage(),"Signed in Successfully");
			 
			 FactoringFeeSetupPage factFee = cyncHomePage.getCyncMenus().openFactoringFeeSetup();
			 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully navigated to Factoring Fee Setup screen");
			 
			 //click edit button
			 Assert.assertTrue(factFee.ClickOnEditBTN());
			 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked Edit button in Factoring Fee Setup screen");
			 
			 //passing data to advance rate text box
			 Assert.assertEquals(factFee.addValueToAdvanceRate(advanceRate), advanceRate);
			 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully passing data to Advance Rate Text Box in Factoring Fee Setup screen");
			 
			 //select fee calculated on from drop down
			 Assert.assertEquals(factFee.addValueToFeeCalculatedOnDropdown(feeCalculatedOn), feeCalculatedOn);
			 ExtentTestManager.getTest().log(LogStatus.PASS, "Sucessfully selected Fee Calculated On drop down in Factoring Fee Setup screen");
			 
			 //click fee tier add new button
			 Assert.assertTrue(factFee.ClickOnFeeTierAddNewBTN());
			 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked Fee Tier Add New Button in Factoring fee Setup screen");
			 
			 //passing data to fee tier1 days text box
			 Assert.assertEquals(factFee.addValueToFeeTier_1Days(feeTier1Days), feeTier1Days);
			 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully paassing data to Fee Tier Days Text Box in Factoring Fee setup screen");
			 
			 //passing data to fee tier1 per text box
			 Assert.assertEquals(factFee.addValueToFeeTier_1Per(feeTier1Per), feeTier1Per);
			 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully passing data to Fee Tier Percentage text box in Factoring Fee setup screen");	 
			 
			 //click save button
			 Assert.assertTrue(factFee.ClickOnSaveBTN());
			 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully Factoring Fee created");
		}
		
		//CY-5441
		
		@Test(dataProvider="FactoringFee", groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Verify Cancel Button in Factoring Fee Setup")
		public void FactoringFeeSetupTC_11(String clientname,String advanceRate,String feeCalculatedOn,String feeTier1Days)
		{
			 ExtentTestManager.getTest().getTest().setName("Factoring Fee Setup:Verify Cancel Button in Factoring Fee Setup Screen");
			 ExtentTestManager.getTest().assignCategory("Module:Factoring");

			 LoginPage loginPage = new LoginPage(driver);
			 CyncHomePage cyncHomePage = loginPage.doLogin();
			 Assert.assertEquals(cyncHomePage.getSuccessfulMessage(),"Signed in Successfully");
			 
			 FactoringFeeSetupPage factFee = cyncHomePage.getCyncMenus().openFactoringFeeSetup();
			 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully navigated to Factoring Fee Setup screen");
			 
			 //click edit button
			 Assert.assertTrue(factFee.ClickOnEditBTN());
			 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked Edit button in Factoring Fee Setup screen");
			 
			 //passing data to advance rate text box			 
			 Assert.assertEquals(factFee.addValueToAdvanceRate(advanceRate), advanceRate);
			 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully passing data to Advance Rate Text Box in Factoring Fee Setup screen");
			
			 //select fee calculated on from drop down
			 Assert.assertEquals(factFee.addValueToFeeCalculatedOnDropdown(feeCalculatedOn), feeCalculatedOn);
			 ExtentTestManager.getTest().log(LogStatus.PASS, "Sucessfully selected Fee Calculated On drop down in Factoring Fee Setup screen");
			 
			 //click fee tier add new button
			 Assert.assertTrue(factFee.ClickOnFeeTierAddNewBTN());
			 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked Fee Tier Add New Button in Factoring fee Setup screen");
			 
			 //passing data to fee tier1 days text box
			 Assert.assertEquals(factFee.addValueToFeeTier_1Days(feeTier1Days), feeTier1Days);
			 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully paassing data to Fee Tier Days Text Box in Factoring Fee setup screen");
			 
			 //click cancel button
			 Assert.assertTrue(factFee.ClickOnCancelBTN());
			 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully Cancelled the updation");
		}
			
		//CY-5442
		@Test(dataProvider="FactoringFee", groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Verify Adding Fee Tier in Factoring Fee Setup")
		public void FactoringFeeSetupTC_12(String clientname,String advanceRate,String feeCalculatedOn,String feeTier1Days,String feeTier1Per,String feeTier2Days,String feeTier2Per)
		{
			 ExtentTestManager.getTest().getTest().setName("Factoring Fee Setup:Verify Adding Fee Tier in Factoring Fee Setup Screen");
			 ExtentTestManager.getTest().assignCategory("Module:Factoring");

			 LoginPage loginPage = new LoginPage(driver);
			 CyncHomePage cyncHomePage = loginPage.doLogin();
			 Assert.assertEquals(cyncHomePage.getSuccessfulMessage(),"Signed in Successfully");
			 
			 FactoringFeeSetupPage factFee = cyncHomePage.getCyncMenus().openFactoringFeeSetup();
			 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully navigated to Factoring Fee Setup screen");
			 
			 //click edit button
			 Assert.assertTrue(factFee.ClickOnEditBTN());
			 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked Edit button in Factoring Fee Setup screen");
			 
			 //passing data to advance rate text box
			 Assert.assertEquals(factFee.addValueToAdvanceRate(advanceRate), advanceRate);
			 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully passing data to Advance Rate Text Box in Factoring Fee Setup screen");
			 
			 //select fee calculated on from drop down
			 Assert.assertEquals(factFee.addValueToFeeCalculatedOnDropdown(feeCalculatedOn), feeCalculatedOn);
			 ExtentTestManager.getTest().log(LogStatus.PASS, "Sucessfully selected Fee Calculated On drop down in Factoring Fee Setup screen");
			 
			 //click fee tier add new button
			 Assert.assertTrue(factFee.ClickOnFeeTierAddNewBTN());
			 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked Fee Tier Add New Button in Factoring fee Setup screen");
			 
			 //passing data to fee tier1 days text box
			 Assert.assertEquals(factFee.addValueToFeeTier_1Days(feeTier1Days), feeTier1Days);
			 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully paassing data to Fee Tier Days Text Box in Factoring Fee setup screen");
			 
			 //passing data to fee tier1 per text box
			 Assert.assertEquals(factFee.addValueToFeeTier_1Per(feeTier1Per), feeTier1Per);
			 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully passing data to Fee Tier Percentage text box in Factoring Fee setup screen");
			 
			 //click fee tier addition button
			 Assert.assertTrue(factFee.ClickOnFeeTierAdditionBTN());
			 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked Fee Tier Addition button in Factoring Fee Setup screen");
			 
			 //passing data to fee tier2 days text box
			 Assert.assertEquals(factFee.addValueToFeeTier_2Days(feeTier2Days), feeTier2Days);
			 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully passing data to 2nd Fee Tier Days in Factoring Fee Setup screen");
			 
			 //passing data to fee tier2 per text box
			 Assert.assertEquals(factFee.addValueToFeeTier_2Per(feeTier2Per), feeTier2Per);
			 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully passing data to 2nd Fee Tier Percentage in Factoring Fee Setup screen");
			 
			 //click save button
			 Assert.assertTrue(factFee.ClickOnSaveBTN());
			 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully Factoring Fee Updated");
			 
		}	
		
		
		//CY-5327
	  @Test(dataProvider="FactoringFee", groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Verifying fee with Invoice Date")
	   public void FactoringFeeSetupTC_03(String clientname,String advanceRate,String feeCalculatedOn,String feeTier1Days,String feeTier1Per,String feeTier2Days,String feeTier2Per)
				{
					 ExtentTestManager.getTest().getTest().setName("Factoring Fee Setup:Verifying Fee Value with Invoice Date");
					 ExtentTestManager.getTest().assignCategory("Module:Factoring");

					 LoginPage loginPage = new LoginPage(driver);
					 CyncHomePage cyncHomePage = loginPage.doLogin();
					 Assert.assertEquals(cyncHomePage.getSuccessfulMessage(),"Signed in Successfully");
					 
					 FactoringFeeSetupPage factFee = cyncHomePage.getCyncMenus().openFactoringFeeSetup();
					 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully navigated to Factoring Fee Setup screen");
					 
					 Assert.assertTrue(factFee.ClickOnEditBTN());
					 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked Edit button in Factoring Fee Setup screen");
					 
					
					 Assert.assertEquals(factFee.addValueToAdvanceRate(advanceRate), advanceRate);
					 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully passing data to Advance Rate Text Box in Factoring Fee Setup screen");
					 
					 
					 Assert.assertEquals(factFee.addValueToFeeCalculatedOnDropdown(feeCalculatedOn), feeCalculatedOn);
					 ExtentTestManager.getTest().log(LogStatus.PASS, "Sucessfully selected Fee Calculated On drop down in Factoring Fee Setup screen");
					 
					 Assert.assertTrue(factFee.ClickOnFeeTierAddNewBTN());
					 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked Fee Tier Add New Button in Factoring fee Setup screen");
					 
					 
					 Assert.assertEquals(factFee.addValueToFeeTier_1Days(feeTier1Days), feeTier1Days);
					 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully paassing data to Fee Tier Days Text Box in Factoring Fee setup screen");
					 
					 
					 Assert.assertEquals(factFee.addValueToFeeTier_1Per(feeTier1Per), feeTier1Per);
					 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully passing data to Fee Tier Percentage text box in Factoring Fee setup screen");
					 
					 Assert.assertTrue(factFee.ClickOnFeeTierAdditionBTN());
					 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked Fee Tier Addition button in Factoring Fee Setup screen");
					 
					 
					 Assert.assertEquals(factFee.addValueToFeeTier_2Days(feeTier2Days), feeTier2Days);
					 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully passing data to 2nd Fee Tier Days in Factoring Fee Setup screen");
					 
					 
					 Assert.assertEquals(factFee.addValueToFeeTier_2Per(feeTier2Per), feeTier2Per);
					 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully passing data to 2nd Fee Tier Percentage in Factoring Fee Setup screen");
					 
					 Assert.assertTrue(factFee.ClickOnSaveBTN());
					 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully Factoring Fee Saved");
					 
					 
				}
				
		
		
		@DataProvider(name = "FactoringFee")
	    public Object[][] getData() {
		return TestUtil.getData(xls_reader, "FactoringFee");
	    }
		

}*/