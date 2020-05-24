package com.cync.Factoring;

import org.junit.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.cync.ClientMaintenance.BasicParametersPage;
import com.cync.FactoringPages.BrokerBankInformationPageFactoring;
import com.cync.FactoringPages.BrokerCommissionPageFactoring;
import com.cync.FactoringPages.BrokerFeeSetupPageFactoring;
import com.cync.FactoringPages.BrokerSetupPageFactoring;
import com.cync.base.BaseTest;
import com.cync.base.ExtentTestManager;
import com.cync.utility.TestGroups;
import com.cync.utility.TestUtil;
import com.cync.utility.Xls_Reader;
import com.relevantcodes.extentreports.LogStatus;

public class BrokerCommTC extends BaseTest  {

	
	Xls_Reader xls_reader = new Xls_Reader(System.getProperty("user.dir")
			+ "\\TestDataProvider\\SanityFactoring.xlsx");
	
	String clientKname="304FACT";
	
	@Test(dataProvider = "ClientCreation", groups = { TestGroups.SMOKE,
			TestGroups.REGRESSION }, testName = "BrokerSetUp")
	
	public void TC_01_BrokerSetup(String clientname,String shortname,String clientnumber,String successmsg,String BrokerName,String AccountName,String BankName,String AccountNo,String RoutingNo,String BrokerDays,String CommissionPercentage) throws InterruptedException
	{
		ExtentTestManager.getTest().getTest().setName("Broker Setup");
        ExtentTestManager.getTest().assignCategory("Module:Factoring_Broker");
       
        String clientname1 = "AB FACT TEST";
        cyncHomePage.getCyncMenus().selectClientFromDropDown(clientKname);
        
        //Step 1: navigate to Broker SetUp Page
          BrokerSetupPageFactoring fact = cyncHomePage.getCyncMenus().openBrokerSetupPageFactoring();
          ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully navigated to Broker Setup Page");
          
        //Setp 2:Select New Button and Enter broker Data
          Assert.assertTrue(fact.ClickNewButton());
          ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully selected New button from broker Setup page");
        //Step 3:Enter Data in Broker SetUp
          Assert.assertEquals(fact.addValueToBrokerNameTextBox(BrokerName),BrokerName);
          ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully Entered Data in broker Name field");
        //Step 4:Enter Data in Broker number field
          Assert.assertEquals(fact.addValueToBrokerNoTextBox("BrokerNo"),"BrokerNo");
          ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully Entered Data in broker No field");
        //Step 5:Create a Broker with clicking save Button
          Assert.assertTrue(fact.ClickSaveButton());
          ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully selected Save button and created a Broker");
          
	}
	
//****
	@Test(dataProvider = "ClientCreation", groups = { TestGroups.SMOKE,
			TestGroups.REGRESSION }, testName = "BrokerBankInformation ")
	
	
	
	public void TC_02_BrokerBankInformation(String clientname,String shortname,String clientnumber,String successmsg,String BrokerName,String AccountName,String BankName,String AccountNo,String RoutingNo,String BrokerDays,String CommissionPercentage) throws InterruptedException{
		
		ExtentTestManager.getTest().getTest().setName("Broker bank information");
        ExtentTestManager.getTest().assignCategory("Module:Factoring_Broker");
        
        //String BrokerName="";
        //String AccountName="";
        //String BankName="";
        //String AccountNo="";
        //String RoutingNo="";
       
        //String ClientData = "0AUTOSANFAC001";
        
        cyncHomePage.getCyncMenus().selectClientFromDropDown(clientKname);
        
      //Step 1: navigate to Broker SetUp page
        BrokerBankInformationPageFactoring fact = cyncHomePage.getCyncMenus().openBrokerBankInformationPageFactoring();
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully navigated to Broker bank information Page");
	  //Step 2: Select Broker from broker dropdown
        Assert.assertTrue(fact.ClickonBrokerDropdown(BrokerName));
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully selected Broker from dropdown");
      
      //Step 3:Click on Add button
       // Assert.assertTrue(fact.clickOnadd());
        Assert.assertTrue(fact.clickOnadd());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Sucessfully click on add button");
      // Thread.sleep(6000);
      //  Assert.assertTrue(fact.clickOnadd());
      //Step 4:Enter Data on Account Name
        Assert.assertEquals(fact.addValueToAccountNameTextBox(AccountName),AccountName);
        ExtentTestManager.getTest().log(LogStatus.PASS, "Sucessfully Entered data in Account Name field");
       // Thread.sleep(4000);
      //Step 5:Enter data on Bank name
        Assert.assertEquals(fact.addValueToBankNameTextBox(BankName),BankName);
        ExtentTestManager.getTest().log(LogStatus.PASS, "Sucessfully Entered data in Bank name field");
      //Step 6:Enter data on Account number
        Assert.assertEquals(fact.addValueToAccountNoTextBox(AccountNo),AccountNo);
        ExtentTestManager.getTest().log(LogStatus.PASS, "Sucessfully Entered data in Account Number Field");
      //Step 7:Enter data in Routing number
        Assert.assertEquals(fact.addValueToRoutingNoTextBox(RoutingNo),RoutingNo);
        ExtentTestManager.getTest().log(LogStatus.PASS, "Sucessfully Entered data in Routing Number filed");
      //Step 8:Click on Save Record
        Thread.sleep(2000);
        Assert.assertTrue(fact.clickOnSave());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Sucessfully saved Record");
	}
	
	@Test(dataProvider = "ClientCreation", groups = { TestGroups.SMOKE,
			TestGroups.REGRESSION }, testName = "BrokerFeeSetup")
	
	
	
	public void TC_03_BrokerFeeSetup(String clientname,String shortname,String clientnumber,String successmsg,String BrokerName,String AccountName,String BankName,String AccountNo,String RoutingNo,String BrokerDays,String CommissionPercentage) throws InterruptedException{
		ExtentTestManager.getTest().getTest().setName("Broker Fee Setup");
        ExtentTestManager.getTest().assignCategory("Module:Factoring_Broker");
	
	
        //String ClientData = "0AUTOSANFAC001";
        //String BrokerData="";
       
        String BrokerDaysi="10";
        String CommissionPercentagei="30";
        cyncHomePage.getCyncMenus().selectClientFromDropDown(clientKname);
        
      //Step 1: navigate to Broker SetUp page
        BrokerFeeSetupPageFactoring fact = cyncHomePage.getCyncMenus().openBrokerFeeSetupPageFactoring();
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully navigated to Broker Fee setUp Page");
	  
        //Step 2: Select Broker from broker drop down
        Assert.assertTrue(fact.ClickonBrokerDropdown(BrokerName));
        ExtentTestManager.getTest().log(LogStatus.PASS, "Sucessfully selected Broker from Dropdown");
        Thread.sleep(6000);
      //Step 3:Click on Edit Button
        Assert.assertTrue(fact.clickOnEdit());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Sucessfully clicked Edit");
        Thread.sleep(4000);
        //Step 4:Click on checkbox
        Assert.assertTrue(fact.clickOnActiveCheckbox());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Sucessfully clicked CheckBox");
        
        //Step 5:Click on Save button
        Assert.assertTrue(fact.clickOnActivateSave());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Sucessfully Activate Broker");
        Thread.sleep(4000);
        //Step 6:Click on add button
        Assert.assertTrue(fact.clickOnAdd());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Sucessfully clicked Add Assignment ");
        Thread.sleep(3000);
        //step 7:select client from drop down
        
        Assert.assertTrue(fact.ClickonClientDropdown(clientname));
        ExtentTestManager.getTest().log(LogStatus.PASS, "Sucessfully selected Client from Client dropdown");
        //step 8:Enter Broker Days data
        
    //    Assert.assertEquals(fact.addValueToDaysTextBox(BrokerDaysi),BrokerDaysi);
        Assert.assertEquals(fact.addValueBrokerDaysTextBoxii(BrokerDaysi),BrokerDaysi);
        ExtentTestManager.getTest().log(LogStatus.PASS, "Sucessfully Entered data to Broker days field");
        //step 9:Enter commission % data
      //  Assert.assertEquals(fact.addValueCommissinpercentageTextBox(CommissionPercentage),CommissionPercentage);
        Assert.assertEquals(fact.addValueCommissinpercentageTextBoxi(CommissionPercentagei),CommissionPercentagei);
        ExtentTestManager.getTest().log(LogStatus.PASS, "Sucessfully Entered Data to Commission Percentage field");
        //step 10:Click on save and create client assignment
        
        Assert.assertTrue(fact.clickOnSave());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Sucessfully Saved Broker Assignment");
        Thread.sleep(4000);
      
	}
	
	//****
	@Test(dataProvider = "ClientCreation", groups = { TestGroups.SMOKE,
			TestGroups.REGRESSION }, testName = "BrokerCommission")
	
	
	public void TC_04_BrokerCommission(String clientname,String shortname,String clientnumber,String successmsg,String BrokerName,String AccountName,String BankName,String AccountNo,String RoutingNo,String BrokerDays,String CommissionPercentage){
		ExtentTestManager.getTest().getTest().setName("Broker Commission");
        ExtentTestManager.getTest().assignCategory("Module:Factoring");
	
	
        //String ClientData = "0AUTOSANFAC001";
       // String BrokerData="";
        cyncHomePage.getCyncMenus().selectClientFromDropDown(clientKname);
        
      //Step 1: navigate to Broker Commission Page
        BrokerCommissionPageFactoring fact = cyncHomePage.getCyncMenus().openBrokerCommissionPageFactoring();
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully navigated to Broker Commission Page");
	  //Step 2: Select Broker from broker dropdown
        Assert.assertTrue(fact.ClickonBrokerDropdown(BrokerName));
        ExtentTestManager.getTest().log(LogStatus.PASS, "Sucessfully selected Broker from Dropdown");
      //Step 3:Select checkbox of broker
        Assert.assertTrue(fact.clickOnBrokerCheckbox());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Sucessfully selected Broker CheckBox");
      //Step 4:Click on release & print commission button
        Assert.assertTrue(fact.clickOnReleaseandPrintCommission());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Sucessfully selected Release & PrintCommission");
      //Step 5:Click Yes on ReleaseandPrintCommission Pop-Up
        Assert.assertTrue(fact.clickYesCommissionReleasePopup());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Sucessfully selected Yes on Release & PrintCommission Pop-up");
	  //Step 6:Download Commission Release report
        Assert.assertTrue(fact.clickDownloadCommissionReleaseReport());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Sucessfully Downloaded Broker Commission report");
	}	
	
	@Test(dataProvider = "ClientCreation", groups = { TestGroups.SMOKE,
			TestGroups.REGRESSION }, testName = "Delete Broker")
	
	public void TC_05_DeleteBroker(String clientname,String shortname,String clientnumber,String successmsg,String BrokerName,String AccountName,String BankName,String AccountNo,String RoutingNo,String BrokerDays,String CommissionPercentage){
		ExtentTestManager.getTest().getTest().setName("Delete Broker");
        ExtentTestManager.getTest().assignCategory("Module:Factoring");
	
	
        //String ClientData = "0AUTOSANFAC001";
       // String BrokerData="";
        cyncHomePage.getCyncMenus().selectClientFromDropDown(clientKname);
        
      //Step 1: navigate to Broker SetUp Page
        BrokerSetupPageFactoring fact = cyncHomePage.getCyncMenus().openBrokerSetupPageFactoring();
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully navigated to Broker Setup Page");
	  //Step 2: Select Broker from broker dropdown
        Assert.assertTrue(fact.ClickonBrokerDropdown(BrokerName));
        ExtentTestManager.getTest().log(LogStatus.PASS, "Sucessfully selected Broker from Dropdown");
      //Step 3:Select Delete button
        Assert.assertTrue(fact.ClickDeleteButton());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Sucessfully selected Delete Button");
      //Step 4:Click Ok on Popup
        BasicParametersPage pp=new BasicParametersPage(driver);
        Assert.assertTrue(pp.isAlertPresent());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Sucessfully Deleted Broker");
      
        
	}
	
	
	
	//***
	
	@DataProvider(name = "ClientCreation")
	public Object[][] getData1() 
	  {
		return TestUtil.getData(xls_reader, "ClientCreation");
		
	  }
}
