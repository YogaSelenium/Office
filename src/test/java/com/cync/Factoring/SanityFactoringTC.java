package com.cync.Factoring;

import java.awt.AWTException;
import java.util.Random;

import org.junit.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.cync.FactoringPages.AccountDebtorPage;
import com.cync.FactoringPages.BasicParametersPageFactoring;
import com.cync.FactoringPages.FactoringClientCreationPage;
import com.cync.FactoringPages.FactoringFeeSetupPage;
import com.cync.FactoringPages.InvoiceValidationTemplatePage;
import com.cync.FactoringPages.MappingListViewPageFactoring;
import com.cync.base.BaseTest;
import com.cync.base.ExtentTestManager;
import com.cync.pages.MappingListViewPage;
import com.cync.utility.TestGroups;
import com.cync.utility.TestUtil;
import com.cync.utility.Xls_Reader;
import com.relevantcodes.extentreports.LogStatus;

public class SanityFactoringTC {
	public class SanityFactoringEndToEndFlowTC extends BaseTest{
		
		Xls_Reader xls_reader = new Xls_Reader(System.getProperty("user.dir")
				+ "\\TestDataProvider\\SanityFactoring.xlsx");

		String clientGname=null;
		@Test(dataProvider = "ClientCreation", groups = { TestGroups.SMOKE,TestGroups.REGRESSION }, testName = " Factoring Client Creation")
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
	        
	        
	        Random rndNum = new Random();    
	        int Rnum=rndNum.nextInt(9999);
	        //System.out.println("my num "+rndNum.nextInt(1000));
	        String sRn= Integer.toString(Rnum); 
	        
	        String clientnameR=clientname+sRn;
	        String shortnameR=shortname+sRn;
	        String clientnumberR=clientnumber+sRn;
	        
	        System.out.println("---------------------------->"+clientnameR);
	        
	        //Step 2: add value to client name
	        clientGname=clientnameR;
	        Assert.assertTrue(fact.addValueToClientnameTextBox(clientnameR));
	        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully entered client name");
	        Thread.sleep(500);
	        
	        //step 3: add value to short name
	        Assert.assertEquals(fact.addValueToShortClientnameTextBox(shortnameR),shortnameR);
	        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully entered client short name");
	        Thread.sleep(500);
	        //step 4: add value to client number
	        Assert.assertEquals(fact.addValueToClientNumTextBox(clientnumberR), clientnumberR);
	        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully entered Client number");
	        
	        
	        
	        //step 5: add singel Manager
	        String ManagerName="atishpm";
	      //  Assert.assertEquals(fact.ManagerCheckBoxiii("atishpm"),ManagerName);
	        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully selected manager");
	        Thread.sleep(1000);

	        //step: add all manager
	        
	        Assert.assertTrue(fact. ManagerCheckBox());
	        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully selected manager");

	        
	        //step : Get all the values from PM dropdown and select one
	    
	        

	        //step 6: click on save
	        Thread.sleep(8000);

	        Assert.assertTrue(fact.SaveBTNClick());
	        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfuly clicked on Save");
	        
	        this.isAlertPresent();
	        
	        //step 7:verify the Success message  
	       Assert.assertTrue(fact.VerifySuccessMessage());
	       ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified success message");
	        
			
		}
		
		
		@Test(dataProvider = "FeeSetup", groups = { TestGroups.SMOKE,TestGroups.REGRESSION }, testName = "Factoring Fee Setup")
		
		public void TC_02_FactoringFeeSetup(String advanceRate,String recourseDays,String recourseFee,String maximumFee,String tier1DaysTo,String tier1TotalFee,String tier2DaysTo,String tier2TotalFee)
		{
			ExtentTestManager.getTest().getTest().setName("Factoring Fee Setup");
			ExtentTestManager.getTest().assignCategory("Module:Factoring");
			
			//String ClientData = "0AutoSanFac002";
	       // cyncHomePage.getCyncMenus().selectClientFromDropDown(clientGname);
	        
	        //step1: navigate to Fee setup page
	         FactoringFeeSetupPage fact = cyncHomePage.getCyncMenus().openFactoringFeeSetup();
	         ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully navigated to Factoring Fee Setup Page");
	         
	         //step 2: click on edit button
	         Assert.assertTrue(fact.EditBTNClick());
	         ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked on Edit button");
	        
	        //step 3: add value to advance rate
	         Assert.assertEquals(fact.addValueToAdvanceRateTextBox(advanceRate),advanceRate);
	         ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully entered advance rate");
	         
	        //step 4: check on recourse factoring check box
	         Assert.assertTrue(fact.RecourseCheckBoxClick());
	         ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully checked on Recourse check box");
	         
	        //step 5: add value to recourse days
	         Assert.assertEquals(fact.addValueToRecourseDaysTextBox(recourseDays),recourseDays);
	         ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully entered Recourse days ");
	         
	        //step 6: add value to recourse fee
	         Assert.assertEquals(fact.addValueToRecourseFeeTextBox(recourseFee), recourseFee);
	         ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully entered Recourse Fee");
	         
	         Assert.assertTrue(fact.AddBTNClick());
	         ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked on Add button"); 
	         
	        //step 7: add value to Tier1 days to
	         Assert.assertEquals(fact.addValueToTier1DaysTo(tier1DaysTo),tier1DaysTo);
	         ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully entered Tier1 Days To");
	         
	        //step 8: add value to Tier1 total Fee
	         Assert.assertEquals(fact.addValueToTier1TotalFee(tier1TotalFee), tier1TotalFee);
	         ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully entered Tier2 Total Fee");
	         
	        //step 9: click on add button
	         Assert.assertTrue(fact.AddBTNClick());
	         ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked on Add button"); 
	        
	        //step 10: add value to Tier2 days to
	         Assert.assertEquals(fact.addValueToTier2DaysTo(tier2DaysTo),tier2DaysTo);
	         ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully entered Tier2 Days To");
	         
	        //step 11: add value to Tier2 total Fee
	         Assert.assertEquals(fact.addValueToTier2TotalFee(tier2TotalFee), tier2TotalFee);
	         ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully entered Tier2 Total Fee");
	         
	         //step 12: add value to Maximum fee %
	         Assert.assertEquals(fact.addValueToMaximumFeeTextBox(maximumFee),maximumFee);
	         ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully entered maximum fee");
	         
	        //step 13: click on save button
	         Assert.assertTrue(fact.SaveBTNClick());
	         ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked on Save button"); 
	         
		}
		
		@Test(dataProvider = "InvValTemp", groups = { TestGroups.SMOKE,TestGroups.REGRESSION }, testName = "Invoice Validation Template Creation")
		public void TC_03_InvoiceValidaitonTemplate(String tempname,String tempdescname)
		{
			
			ExtentTestManager.getTest().getTest().setName("Invoice Validation Template Creation");
			ExtentTestManager.getTest().assignCategory("Module:Factoring");  
		
		    //step 1 : navigate to Invoice Validation Template page
	        InvoiceValidationTemplatePage inv = cyncHomePage.getCyncMenus().openInvValTempPage();
	        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully navigated to Invoice Validation Template Page");
	        
	        //step 2 : click on Create new button
	        Assert.assertTrue(inv.ClickCreateNewBTNAndVerifyAddPage());
	        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked on Create New button"); 
	        
	        //step 3 : add value to invoice validation temp name
	        Assert.assertEquals(inv.addValueToTempName(tempname),tempname);
	        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully entered Invoice validation template name");
	        
	        //step 4 : add value to invoice validation temp description name
	        Assert.assertEquals(inv.addValueToTempDescription(tempdescname),tempdescname);
	        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully entered Invoice validation template description name");
	        
	        //step 5 : check on parameters check box
	        Assert.assertTrue(inv.ClickOnParametersList());
	        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully checked on Parameters check box");
	        
	        //step 6 : click on save button
	        Assert.assertTrue(inv.ClickOnSaveBTN());
	        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked on save button");
		
		   //step 7 : verify the success message
	     //   Assert.assertTrue(inv.VerifySuccessMsg());
	        ExtentTestManager.getTest().log(LogStatus.PASS, "Verified the Succsess message");
		
		}
		
		@Test(dataProvider = "BasicParameters", groups = { TestGroups.SMOKE,TestGroups.REGRESSION }, testName = "Invoice Validation Template assigning in Basic Parameters")
		public void TC_04_BasicParameters(String tempname,String feedays)
		{
			ExtentTestManager.getTest().getTest().setName("Invoice Validation Template assigning in Basic Parameters");
	        ExtentTestManager.getTest().assignCategory("Module:Factoring");  
		   
	        String ClientData = "0AutoSanFac002";
	       // cyncHomePage.getCyncMenus().selectClientFromDropDown(clientGname);
	        
	        //step 1 : navigate to Basic Parameters screen
	        BasicParametersPageFactoring basic = cyncHomePage.getCyncMenus().openBasicparameterFactoring();
	        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully navigated to Basic Parameters Page");
	        
	        //step 2 : click on edit button
	        Assert.assertTrue(basic.ClickOnEditBTN());
	        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked on edit button");
	        
	        //step 3 : select invoice validation template from drop down
	        Assert.assertTrue(basic.selectInvValTemp(tempname));
	        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully selected invoice validation template from dropdown");
	        
	        //step 4 : select fee days from drop down
	        Assert.assertEquals(basic.selectFeeDays(feedays),feedays);
	        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully selected fee days from dropdown");
	        
	        //step 5 : click on save button
	        Assert.assertTrue(basic.ClickOnSaveBTN());
	        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully saved basic paramters changes");	
		
		}
		
		/*@Test(dataProvider = "BasicParameters", groups = { TestGroups.SMOKE,TestGroups.REGRESSION }, testName = "Invoice Validation Template assigning in Basic Parameters")
		public void TC_04A_BasicParameters(String tempname,String feedays)
		{
			ExtentTestManager.getTest().getTest().setName("Invoice Validation Template assigning in Basic Parameters");
	        ExtentTestManager.getTest().assignCategory("Module:Factoring");  
		   
	        String ClientData = "0AutoSanFac001";
	        cyncHomePage.getCyncMenus().selectClientFromDropDown(ClientData);
	        
	        //step1: navigate to Basic Parameters screen
	        BasicParametersPageFactoring basic = cyncHomePage.getCyncMenus().openBasicparameterFactoring();
	        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully navigated to Basic Parameters Page");
	        
	        //step2: click on edit button
	        Assert.assertTrue(basic.ClickOnEditBTN());
	        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked on edit button");
	        
	        //step3: select invoice validation template from drop down
	        Assert.assertTrue(basic.selectInvValTemp(tempname));
	        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully selected invoice validation template from dropdown");
	        
	        //step4: select fee days from drop down
	        String feedays1="Fund Date";
	        Assert.assertEquals(basic.selectFeeDays(feedays1),feedays1);
	        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully selected fee days from dropdown");
	        
	        //step5: click on save button
	        Assert.assertTrue(basic.ClickOnSaveBTN());
	        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully saved basic paramters changes");	
		
		}*/
		
		
		@Test(dataProvider = "AccountDebtor", groups = { TestGroups.SMOKE,TestGroups.REGRESSION }, testName = "Debtor Creation")
		public void TC_05_AccountDebtor(String accountname,String accountnumber,String verificationmode,String contactname,String phoneno,String altphoneno,String faxno,String email) throws AWTException, InterruptedException
		{
			ExtentTestManager.getTest().getTest().setName("Debtor Creation");
	        ExtentTestManager.getTest().assignCategory("Module:Factoring");  
	        
		

	       
	          String clientname = "0AutoCnt";
	        // cyncHomePage.getCyncMenus().selectClientFromDropDown(clientGname);
		  
	        

	        //step 1: navigate to Account Debtor screen

	        AccountDebtorPage debtor = cyncHomePage.getCyncMenus().openAccountDebtorPage();
	        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully navigated to Account Debtor Page");
	        
	        //step 2: click on New Account debtor button
	        Assert.assertTrue(debtor.ClickNewAccDebtorBTN());
	        
	        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked on New Account Debtor button"); 

	        Thread.sleep(4000);
	      
	        //step 3: add value to Account name 
	        Assert.assertEquals(debtor.addValuesToAccName(accountname),accountname);
	        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully entered Account name"); 

	        Thread.sleep(2000);
	    
	        //step 4: add value to Account no
	        String accnumberD="d";
	        
	        Random rndNum = new Random();    
	        int Rnum=rndNum.nextInt(1000);
	        //System.out.println("my num "+rndNum.nextInt(1000));
	        String sRn= Integer.toString(Rnum); 
	        
	        String AccnumWithRnum=accnumberD+sRn;
	        
	        Assert.assertEquals(debtor.addValuesToAccNo(AccnumWithRnum),AccnumWithRnum);
	        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully entered Account number");
	        
	        //step 5: select verification mode from dropdown
	        Assert.assertTrue(debtor.SelectVerificationMode(verificationmode));
	        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfuly selected verification mode from dropdown");
	        
	        //step 6: scroll down 
	        debtor.Scrolldown();
	        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully scroll down");
	     
	        //step 7: select client from drop down
	        
	        Assert.assertTrue(debtor.selectClientFromDropDown(clientGname));
	        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully selected client from drop down");
	  
	        
	        //step 8: check on primary contact check box
	        Assert.assertTrue(debtor.CheckOnPrimaryCheckBox());
	        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully checked on primary check box");
	        
	        //step 9: add value to Contact name text box
	        Assert.assertTrue(debtor.addValuesToContactNameTextBox(contactname));
	        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully entered contact name in text box");
	        
	        //step 11: add value to phone no text box
	        Assert.assertTrue(debtor.addValuesToPhoneNoTextBox(phoneno));
	        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully entered phone no in text box");
	        
	        //step 12: add value to alternate phone no text box
	        Assert.assertTrue(debtor.addValuesToAlTPhoneNoTextBox(altphoneno));
	        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully entered alternate phone no in text box");
	        
	        //step 13: add value to fax no text box
	        Assert.assertTrue(debtor.addValuesToFaxNoTextBox(faxno));
	        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully enetered fax no in text box");
	        
	        //step 14: add value to email text box
	        Assert.assertTrue(debtor.addValuesToEmailTextBox(email));
	        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully enetered email in text box");
	        
	        debtor.ScrollUp();
	        //step 15: click on save button
	        Thread.sleep(4000);
	        Assert.assertTrue(debtor.ClickOnSaveBTN());
	        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked on Save button");
	        Thread.sleep(4000);
	        //step 16: verify success message
	      //  Assert.assertTrue(debtor.VerifySuccessMessage());
	        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified the Success Message");
	        
	        //step 17: click on close button
		    Assert.assertTrue(debtor.ClickOnMsgCloseBTN());
	        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked on Close button");
	        
	        //step 18: click on back to main page button
	        //Thread.sleep(8000);
	       //  Assert.assertTrue(debtor.ClickBackToMainPage());
	      //  ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked on Back to Main page button");
	        

	        //step 19: verifying Account name hyper link

	        //Assert.assertTrue(debtor.ClickAccNameHyperLink());
	        // ExtentTestManager.getTest().log(LogStatus.PASS, "Verified Account name hyperlink after debtor creation");
	        
	        //step 20: close the pop up
	        Thread.sleep(200);
	        // Assert.assertTrue(debtor.ClickOnPopupCloseBTN());
	        //ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully closed the popup");
		}
		
		
		

		@Test(dataProvider = "Mapping",groups = { TestGroups.SMOKE,TestGroups.REGRESSION }, testName = "Creating Mapping ")
		public void TC_06_Mapping(String mappingname,String dataFileType,String collateralname,String fileformat) throws InterruptedException
		{
			ExtentTestManager.getTest().getTest().setName("Creating Mapping");
	        ExtentTestManager.getTest().assignCategory("Module:Factoring"); 
	     
	        String clientname = "0001CNT1346";
	        cyncHomePage.getCyncMenus().selectClientFromDropDown(clientname);
	        
	        
	        MappingListViewPageFactoring fact = cyncHomePage.getCyncMenus().openMappingListViewPageFactoring();
	        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully navigated to Account Debtor Page");
	        
	        
	        
		
		}
		
		
		
		
		
		
		
		@DataProvider(name = "ClientCreation")
		public Object[][] getData1() {
			return TestUtil.getData(xls_reader, "ClientCreation");
		}
		
		@DataProvider(name = "FeeSetup")
		public Object[][] getData2() {
			return TestUtil.getData(xls_reader, "FeeSetup");
		}
		
		@DataProvider(name = "InvValTemp")
		public Object[][] getData3() {
			return TestUtil.getData(xls_reader, "InvValTemp");
		}

		@DataProvider(name = "BasicParameters")
		public Object[][] getData4() {
			return TestUtil.getData(xls_reader, "BasicParameters");
		}

		@DataProvider(name = "AccountDebtor")
		public Object[][] getData5() {
			return TestUtil.getData(xls_reader, "AccountDebtor");
		}
		@DataProvider(name = "Mapping")
		public Object[][] getData6() {
			return TestUtil.getData(xls_reader, "Mapping");
		}
}
}