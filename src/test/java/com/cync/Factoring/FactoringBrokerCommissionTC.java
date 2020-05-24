package com.cync.Factoring;

import java.awt.AWTException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.LocalFileDetector;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.cync.ClientMaintenance.BasicParametersPage;
import com.cync.FactoringPages.AccountDebtorPage;
import com.cync.FactoringPages.BasicParametersPageFactoring;
import com.cync.FactoringPages.BatchProcessScreenPageFactoring;
import com.cync.FactoringPages.BrokerBankInformationPageFactoring;
import com.cync.FactoringPages.BrokerCommissionPageFactoring;
import com.cync.FactoringPages.BrokerFeeSetupPageFactoring;
import com.cync.FactoringPages.BrokerSetupPageFactoring;
import com.cync.FactoringPages.CashReceiptPageFactoring;
import com.cync.FactoringPages.CreditQueuePageFactoring;
import com.cync.FactoringPages.DataUploadPage;
import com.cync.FactoringPages.DuplicateInvoicesPageFactoring;
import com.cync.FactoringPages.FactoringClientCreationPage;
import com.cync.FactoringPages.FactoringFeeSetupPage;
import com.cync.FactoringPages.FactoringFileUploadPage;
import com.cync.FactoringPages.FundedInvoicesPageFactoring;
import com.cync.FactoringPages.IneligiblePageFactoring;
import com.cync.FactoringPages.InvoiceValidationTemplatePage;
import com.cync.FactoringPages.ManualEntryPage;
import com.cync.FactoringPages.MappingListViewPageFactoring;
import com.cync.FactoringPages.NewInvoicesPage;
import com.cync.FactoringPages.PreVerificationPageFactoring;
import com.cync.FactoringPages.RecoursePageFactoring;
import com.cync.FactoringPages.TermCodesPageFactoring;
import com.cync.FactoringPages.VerifiedPageFactoring;
import com.cync.base.BaseTest;
import com.cync.base.ExtentManager;
import com.cync.base.ExtentTestManager;
import com.cync.pages.BasicClientDetailPage;
import com.cync.pages.PurgeClientPage;
import com.cync.utility.TestGroups;
import com.cync.utility.TestUtil;
import com.cync.utility.Xls_Reader;
import com.relevantcodes.extentreports.LogStatus;

public class FactoringBrokerCommissionTC extends BaseTest{
	
	Xls_Reader xls_reader = new Xls_Reader(System.getProperty("user.dir")
			+ "\\TestDataProvider\\SanityFactoring.xlsx");
     String clientKname="304FACT";
	
	@Test(priority=1,dataProvider = "ClientCreation", groups = { TestGroups.SMOKE,
			TestGroups.REGRESSION }, testName = "BrokerSetUp")

	public void TC_01_BrokerSetUp(String clientname,String shortname,String clientnumber,String successmsg,String BrokerName,String AccountName,String BankName,String AccountNo,String RoutingNo,String BrokerDays,String CommissionPercentage){
		
		ExtentTestManager.getTest().getTest().setName("BrokerCommission test script factoring:BrokerFeeSetup");
        ExtentTestManager.getTest().assignCategory("Module:Factoring");
        
       //String ClientData = "0AUTOSANFAC001";
        SanityFactoringEndToEndFlowTC obj=new SanityFactoringEndToEndFlowTC();
        String clientGname=obj.clientGname;
        cyncHomePage.getCyncMenus().selectClientFromDropDown(clientKname);
        
      //Step 1: navigate to Broker SetUp page
        BrokerSetupPageFactoring fact = cyncHomePage.getCyncMenus().openBrokerSetupPageFactoring();
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully navigated to Broker SetUp Page");
      //Setp 2:Select New Button and Enter broker Data
        Assert.assertTrue(fact.ClickNewButton());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully selected New button from broker Setup page");
      //Step 3:Enter Data in Broker SetUp
        Assert.assertEquals(fact.addValueToBrokerNameTextBox("BrokerNameD"),"BrokerNameD");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully Entered Data in broker Name field");
      //Step 4:Enter Data in Broker number field
        Assert.assertEquals(fact.addValueToBrokerNoTextBox("BrokerNoD"),"BrokerNoD");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully Entered Data in broker No field");
      //Step 5:Create a Broker with with clicking save Button
        Assert.assertTrue(fact.ClickSaveButton());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully selected Save button and created a Broker");
	}
	
	
	
	
	
	@Test(priority=2,dataProvider = "ClientCreation", groups = { TestGroups.SMOKE,
			TestGroups.REGRESSION }, testName = "BrokerBankInformation ")
	
	
	
	public void TC_02_BrokerBankInformation(String clientname,String shortname,String clientnumber,String successmsg,String BrokerName,String AccountName,String BankName,String AccountNo,String RoutingNo,String BrokerDays,String CommissionPercentage){
		
		ExtentTestManager.getTest().getTest().setName("BrokerCommission test script factoring:Brokerbankinformation");
        ExtentTestManager.getTest().assignCategory("Module:Factoring");
        
        //String BrokerName="";
        //String AccountName="";
        //String BankName="";
        //String AccountNo="";
        //String RoutingNo="";
       
        //String ClientData = "0AUTOSANFAC001";
        SanityFactoringEndToEndFlowTC obj=new SanityFactoringEndToEndFlowTC();
        String clientGname=obj.clientGname;
        
        cyncHomePage.getCyncMenus().selectClientFromDropDown(clientKname);
        
      //Step 1: navigate to Broker SetUp page
        BrokerBankInformationPageFactoring fact = cyncHomePage.getCyncMenus().openBrokerBankInformationPageFactoring();
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully navigated to Broker bank information Page");
	  //Step 2: Select Broker from broker dropdown
        Assert.assertTrue(fact.ClickonBrokerDropdown(BrokerName));
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully selected Broker from dropdown");
      //Step 3:Click on Add button
        Assert.assertTrue(fact.clickOnadd());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Sucessfully click on add button");
      //Step 4:Enter Data on Account Name
        Assert.assertEquals(fact.addValueToAccountNameTextBox(AccountName),AccountName);
        ExtentTestManager.getTest().log(LogStatus.PASS, "Sucessfully Entered data in Account Name field");
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
        Assert.assertTrue(fact.clickOnSave());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Sucessfully saved Record");
	}
	
	@Test(priority=3,dataProvider = "ClientCreation", groups = { TestGroups.SMOKE,
			TestGroups.REGRESSION }, testName = "BrokerFeeSetup")
	
	
	
	public void TC_03_BrokerFeeSetup(String clientname,String shortname,String clientnumber,String successmsg,String BrokerName,String AccountName,String BankName,String AccountNo,String RoutingNo,String BrokerDays,String CommissionPercentage) throws InterruptedException{
		ExtentTestManager.getTest().getTest().setName("BrokerCommission test script factoring:Brokerbankinformation");
        ExtentTestManager.getTest().assignCategory("Module:Factoring");
	
	
        //String ClientData = "0AUTOSANFAC001";
        //String BrokerData="";
        //String BrokerDaysData="";
        //String CommissionPercentageData="";
        
        SanityFactoringEndToEndFlowTC obj=new SanityFactoringEndToEndFlowTC();
        String clientGname=obj.clientGname;
        String clientKname="304FACT";
        cyncHomePage.getCyncMenus().selectClientFromDropDown(clientKname);
        
      //Step 1: navigate to Broker SetUp page
        BrokerFeeSetupPageFactoring fact = cyncHomePage.getCyncMenus().openBrokerFeeSetupPageFactoring();
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully navigated to Broker Fee setUp Page");
	 Thread.sleep(8000);
        //Step 2: Select Broker from broker drop down
        Assert.assertTrue(fact.ClickonBrokerDropdown(BrokerName));
        ExtentTestManager.getTest().log(LogStatus.PASS, "Sucessfully selected Broker from Dropdown");
      //Step 3:Click on Edit Button
        Assert.assertTrue(fact.clickOnEdit());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Sucessfully clicked Edit");
        //Step 4:Click on checkbox
        Assert.assertTrue(fact.clickOnActiveCheckbox());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Sucessfully clicked CheckBox");
        //Step 5:Click on Save button
        Assert.assertTrue(fact.clickOnActivateSave());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Sucessfully Activate Broker");
        //Step 6:Click on add button
        Assert.assertTrue(fact.clickOnAdd());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Sucessfully clicked Add Assignment ");
        //step 7:select client from drop down
        Assert.assertTrue(fact.ClickonClientDropdown(clientKname));
        ExtentTestManager.getTest().log(LogStatus.PASS, "Sucessfully selected Client from Client dropdown");
        //step 8:Enter Broker Days data
        Assert.assertEquals(fact.addValueToDaysTextBox(BrokerDays),BrokerDays);
        ExtentTestManager.getTest().log(LogStatus.PASS, "Sucessfully Entered data to Broker days field");
        //step 9:Enter commission % data
        Assert.assertEquals(fact.addValueCommissinpercentageTextBox(CommissionPercentage),CommissionPercentage);
        ExtentTestManager.getTest().log(LogStatus.PASS, "Sucessfully Entered Data to Commission Percentage field");
        //step 10:Click on save and create client assignment
        Assert.assertTrue(fact.clickOnSave());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Sucessfully Saved Broker Assignment");
        
      
	}
	
	/*@Test(dataProvider = "ClientCreation", groups = { TestGroups.SMOKE,
			TestGroups.REGRESSION }, testName = "Funding a Batch")
	
	public void TC_04_FundBatch(String clientname,String shortname,String clientnumber,String successmsg,String BrokerName,String AccountName,String BankName,String AccountNo,String RoutingNo,String BrokerDays,String CommissionPercentage)
	{
		
		ExtentTestManager.getTest().getTest().setName("BrokerCommission test script factoring:FuncBatch");
        ExtentTestManager.getTest().assignCategory("Module:Factoring");
        
        //String ClientData = "0AUTOSANFAC001";
        cyncHomePage.getCyncMenus().selectClientFromDropDown(clientname);
               
        //Step 1: navigate to Verified page
        VerifiedPageFactoring fact = cyncHomePage.getCyncMenus().openVerifiedPageFactoring();
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully navigated to Verified Page");
        //Step 2: Select invoice from verified page
        Assert.assertTrue(fact.SelectFirstInvoiceCheckBox());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully selected invoice from verified page");
        //Step 3:Create Funding batch
        Assert.assertTrue(fact.ClickCreateFundingBatchBTN());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully created Batch at verified page");
      //step 4: close the success message
        Assert.assertTrue(fact.CloseSuccessMsg());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully closed the success message");
        //Step 5:Open Fund Batch popup
        Assert.assertTrue(fact.ClickFundBatchBTN());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully open Funding batch popup at verified page");
        //Step 6:Select batch in Fund Batch pop up
        Assert.assertTrue(fact.SelectBatchInFundBatchpopup());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully selected Batch from Fund Batch popup");
        //Step 7:Fund a Batch in Popup
        Assert.assertTrue(fact.ClickFundBatchBTNinpopup());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully selected Fund Batch in popup ");       
	}
	public void TC_05_CompleteChargeback(String clientname,String shortname,String clientnumber,String successmsg,String BrokerName,String AccountName,String BankName,String AccountNo,String RoutingNo,String BrokerDays,String CommissionPercentage)
	{
		ExtentTestManager.getTest().getTest().setName("BrokerCommission test script factoring:FuncBatch");
        ExtentTestManager.getTest().assignCategory("Module:Factoring");
       
        cyncHomePage.getCyncMenus().selectClientFromDropDown(clientname);
        
        //Step 1: navigate to Funded Invoice page
        FundedInvoicesPageFactoring fund = cyncHomePage.getCyncMenus().openFundedInvoicesPageFactoring();
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully navigated to Create Factoring Client Page");
        
        //step 2: click on Account name hyperlink
        Assert.assertTrue(fund.ClickAccountNameHyperlink());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked on Account name hyperlink");
		
		//Step 3: click on Chargeback hyeprlink
        Assert.assertTrue(fund.ClickChargebackHyperlink());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked on Chargeback hyperlink");
        
      //step4: enter chargeback value in text box
        String chargebackValue = "40000";
        Assert.assertTrue(fund.addValuetoChargebackTB(chargebackValue));
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully added value to Charge back text box");
        
      //step5: click on Chargeback button
        Assert.assertTrue(fund.ClickChargebackBTN());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked on Chargeback button");
        
      //Step 6:Close the 
           }  
       */
	
	
	@Test(priority=4,dataProvider = "ClientCreation", groups = { TestGroups.SMOKE,
			TestGroups.REGRESSION }, testName = "BrokerCommission")
	
	
	public void TC_06_BrokerCommission(String clientname,String shortname,String clientnumber,String successmsg,String BrokerName,String AccountName,String BankName,String AccountNo,String RoutingNo,String BrokerDays,String CommissionPercentage){
		ExtentTestManager.getTest().getTest().setName("Broker Commission Release");
        ExtentTestManager.getTest().assignCategory("Module:Factoring_Broker");
	
	
        //String ClientData = "0AUTOSANFAC001";
       // String BrokerData="";
        SanityFactoringEndToEndFlowTC obj=new SanityFactoringEndToEndFlowTC();
        String clientGname=obj.clientGname;
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
	
	@Test(priority=5,dataProvider = "ClientCreation", groups = { TestGroups.SMOKE,
			TestGroups.REGRESSION }, testName = "Delete Broker")
	
	public void TC_07_DeleteBroker(String clientname,String shortname,String clientnumber,String successmsg,String BrokerName,String AccountName,String BankName,String AccountNo,String RoutingNo,String BrokerDays,String CommissionPercentage){
		ExtentTestManager.getTest().getTest().setName("Delete Broker");
        ExtentTestManager.getTest().assignCategory("Module:Factoring_Broker");
	
	
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
       /* BasicParametersPage pp=new BasicParametersPage(driver);
        Assert.assertTrue(pp.isAlertPresent());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Sucessfully Deleted Broker");*/
      
        
	}
	
	@DataProvider(name = "ClientCreation")
	public Object[][] getData1() {
		return TestUtil.getData(xls_reader, "ClientCreation");
	}
	
}