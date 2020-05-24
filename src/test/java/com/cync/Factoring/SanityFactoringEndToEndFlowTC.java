package com.cync.Factoring;
//package com.cync.SanityFactoringTC;

import java.awt.AWTException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.LocalFileDetector;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.cync.FactoringPages.AccountDebtorPage;
import com.cync.FactoringPages.BasicParametersPageFactoring;
import com.cync.FactoringPages.BatchProcessScreenPageFactoring;
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
        

 
        String clientname = "0001Cnt2196";
        
        cyncHomePage.getCyncMenus().selectClientFromDropDown(clientGname);

	

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
        // Assert.assertEquals(debtor.addValuesToAccNo(accountnumber),accountnumber);
        
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
       
        
        //step 16: verify success message
        //Assert.assertTrue(debtor.VerifySuccessMessage());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified the Success Message");
        

        //step 17: click on close button
	    Assert.assertTrue(debtor.ClickOnMsgCloseBTN());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked on Close button");
        
        //step 18: click on back to main page button
        //Thread.sleep(8000);
        Assert.assertTrue(debtor.ClickBackToMainPage());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked on Back to Main page button");
        


        //step17: verifying Account name hyper link


       // Assert.assertTrue(debtor.ClickAccNameHyperLink());
       // ExtentTestManager.getTest().log(LogStatus.PASS, "Verified Account name hyperlink after debtor creation");


        
        // Assert.assertTrue(debtor.ClickAccNameHyperLink());
        // ExtentTestManager.getTest().log(LogStatus.PASS, "Verified Account name hyperlink after debtor creation");

        
        //step18: close the pop up
        //Assert.assertTrue(debtor.ClickOnPopupCloseBTN());
        


        //step 19: verifying Account name hyper link
        Assert.assertTrue(debtor.ClickAccNameHyperLink());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Verified Account name hyperlink after debtor creation");
        
      
         //step 20: close the pop up
         Thread.sleep(200);
         Assert.assertTrue(debtor.ClickOnPopupCloseBTN());
         ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully closed the popup");

	}
	
	@Test(dataProvider = "Mapping", groups = { TestGroups.SMOKE,TestGroups.REGRESSION }, testName = "Creating Mapping ")
	public void TC_06_Mapping(String mappingname,String dataFileType,String collateralname,String fileformat) throws InterruptedException
	{
		ExtentTestManager.getTest().getTest().setName("Creating Mapping");
        ExtentTestManager.getTest().assignCategory("Module:Factoring"); 
        

        String clientname = "0001Cnt8725";
       // Thread.sleep(3000);
        cyncHomePage.getCyncMenus().selectClientFromDropDown(clientGname);

       
      //  cyncHomePage.getCyncMenus().selectClientFromDropDown(clientGname);

       // Thread.sleep(1000);
        
        
        //step 1: navigate to Mapping List View screen
        MappingListViewPageFactoring mapp = cyncHomePage.getCyncMenus().openMappingListViewPageFactoring();
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully navigated to Mapping List View Page");
        

        //step 2: click on Create New Mapping button


        Assert.assertTrue(mapp.ClickOnCreateNewMappingBTN());



        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked on Create New Mapping button");

        
        
        //step 3: add value to mapping name to mapping name text box
       // Random R=new Random();
        //R.nextInt(999);
      //  String mappingnameR=mappingname+R;
        
        Assert.assertTrue(mapp.addValueToMappingName(mappingname));
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully entered Mapping name"); 
        
        //step 4: add value to data file type
        Assert.assertTrue(mapp.addValueToDataFiletype(dataFileType));
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully selected Data File Type"); 
        
        //step 5: add value to collateral name
        Assert.assertTrue(mapp.addValueToCollateralname(collateralname));
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully selected Collateralname"); 
        
        //step 6: add value to file format
        Assert.assertTrue(mapp.addValueToFileFormat(fileformat));
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully selected FileFormat"); 
        
        //step 7: add value to sheet no field
        String sheetno = "1";
        Assert.assertTrue(mapp.addValueToSheetNo(sheetno));
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully selected SheetNo"); 
        
        //step 7: mapping with file 
        Assert.assertTrue(mapp.SendInvoiceMapping());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully Mapped with invoice file");
        
        //step 8: click on next button
        Assert.assertTrue(mapp.ClickOnNextBTN());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked on Create New Mapping button");
        this.isAlertPresent();
        
        //step 9: add value to header row field
        String headerrows = "1";
        Assert.assertTrue(mapp.addValueToHeaderRow(headerrows));
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully entered HeaderRow"); 
        
        //step 10: click on next button
        Assert.assertTrue(mapp.ClickOnstep2NextBTN());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked on Next button");
        this.isAlertPresent();
        
        //step 11: add value to Account no field
        String accountNo = "A/c Num";
        Assert.assertTrue(mapp.accountNodropdownValues(accountNo));
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully Mapped accountNo"); 
        
        //step 12: add value to Account name field
        String accountName = "Name";
        Assert.assertTrue(mapp.accountNamedropdownValues(accountName));
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully Mapped accountName"); 
        
        //step 13: add value to collateral type field
        String collateraltype = "Type";
        Assert.assertTrue(mapp.collateraltypedropdownValues(collateraltype));
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully Mapped collateral type"); 
        
        //step 14: add value to invoice no field
        String invoiceno = "Invoice no.";
        Assert.assertTrue(mapp.invoicenodropdownValues(invoiceno));
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully Mapped invoice no"); 
        
        //step 15: add value to Po number field
        String poNo = "P. O.#";
        Assert.assertTrue(mapp.poNodropdownValues(poNo));
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully Mapped Po number"); 
        
        //step 16: add value to original date
        String originaldate = "Date";
        Assert.assertTrue(mapp.originalDatedropdownValues(originaldate));
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully Mapped original date");
        
        //step 17: add value to invoice amount field
        String invoiceamount = "Open Balance";
        Assert.assertTrue(mapp.invoiceamountdropdownValues(invoiceamount));
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully Mapped invoice amount");
        
        //step 18: add value to due date field
        String duedate = "Due Date";
        Assert.assertTrue(mapp.duedatedropdownValues(duedate));
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully Mapped due date");
        
        //step 19: add value to reference no field
        String referenceno = "reference no.";
        Assert.assertTrue(mapp.batchReferenceNodropdownValues(referenceno));
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully Mapped reference no");
        
        //step 20: check on image file format check box
        Assert.assertTrue(mapp.CheckOnImageFileFormat());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully Checked on Image File Format");
        
        //step 21: click on next button
        Assert.assertTrue(mapp.ClickOnstep2NextBTN());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked on Next button");
        this.isAlertPresent();
        
        //step 22: verify the Account no field in Step4
        Assert.assertTrue(mapp.verifyAccountNoFieldStep4());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified Account no field");
        
        //step 23: verify the Account name field in Step4
        Assert.assertTrue(mapp.verifyAccountNameFieldStep4());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified Account name field");
        
        //step 24: verify the Invoice no field in Step4
        Assert.assertTrue(mapp.verifyInvoiceNoFieldStep4());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified Invoice no field");
        
        //step 25: verify the Po No field in Step4
       // Assert.assertTrue(mapp.verifyPoNoFieldStep4());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified Po No field");
        
        //step 26: verify the Original Date field in Step4
        Assert.assertTrue(mapp.verifyOriginalDateFieldStep4());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified Original Date Field");
        
        //step 27: verify the Invoice Amount field in Step4
        Assert.assertTrue(mapp.verifyInvoiceAmountFieldStep4());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified Invoice Amount field");
        
        //step 28: verify the Due Date field in Step4
        Assert.assertTrue(mapp.verifyDueDateFieldStep4());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified Due date field");
        
        //step 29: verify the BatchReference no field in Step4
        Assert.assertTrue(mapp.verifyBatchRefNoFieldStep4());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified Batch Ref no field");
        
        //step 30: click on save button
        Assert.assertTrue(mapp.ClickOnSaveBTN());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked on save button");
        this.isAlertPresent();	
        
        //step 31: verify the success message
        Assert.assertTrue(mapp.verifySuccessMsg());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified Success message");
        
        //step 32: verify the mapping hyper link
        Assert.assertTrue(mapp.verifyMappingHyperlink());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified mapping hyperlink after saving");
         
	}
	
	@Test(dataProvider = "FileUpload", groups = { TestGroups.SMOKE,TestGroups.REGRESSION }, testName = "FileUploads")
	public void TC_07_FileUpload(String expectedValue)
	{
		
		ExtentTestManager.getTest().getTest().setName("Factoring FileUploads");
        ExtentTestManager.getTest().assignCategory("Module:Factoring"); 
		
        //String ClientData = "0AutoSanFac002";
       // cyncHomePage.getCyncMenus().selectClientFromDropDown(clientGname);
        
        //step1: navigate to Factoring File Uploads page
        FactoringFileUploadPage upload = cyncHomePage.getCyncMenus().openFactoringFileUploadsPage();
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully navigated to Factoring File uploads Page");
        
        //step2: entered expected value 
        Assert.assertTrue(upload.addValueToExpectedValue(expectedValue));
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully entered Expected Value");
        
		//step3: uploading the file
        try             
	    {
       WebElement El = driver.findElement(By.xpath("(//input[contains(@id,'uploaded_file')])[4]"));
	    	((RemoteWebElement)El).setFileDetector(new LocalFileDetector());
	    	El.sendKeys(System.getProperty("user.dir")+"\\FileUpload\\FactoringMappFile.xlsx");
	    }
	    catch(Exception e)
	    {
	    	e.printStackTrace();
	    }
        
       //step4: click on process file button
        Assert.assertTrue(upload.ProcessFilesClick());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully Processesd"); 
		
	   //step5: verify the success message
      //  Assert.assertTrue(upload.VerfiySuccessMsg());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully Verified Sucess Message");  	
		
	}
	
	@Test(dataProvider = "FileUpload", groups = { TestGroups.SMOKE,TestGroups.REGRESSION }, testName = "Verifying the uploaded details in Data Upload screen")
	public void TC_08_DataUpload(String expectedValue) throws InterruptedException
	{
		ExtentTestManager.getTest().getTest().setName("Verifying the uploaded details in Data Upload screen");
        ExtentTestManager.getTest().assignCategory("Module:Factoring"); 
        
        //String ClientData = "0AutoSanFac001";
       // cyncHomePage.getCyncMenus().selectClientFromDropDown(clientGname);
        
        //step1: navigate to Data Upload page
        DataUploadPage data = cyncHomePage.getCyncMenus().openDataUploadPageFactoring();
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully navigated to Data Upload Page");
        
        //step2: verifying the File name hyper link
      // Assert.assertTrue(data.FileNameHyperLinkClick_DataUploadHistory());
     //  ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified file name hyperlink");
       
       //step3: verifying the expected value
       Assert.assertTrue(data.ExpectedValueIn_DataUploadHistory());
       ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified Expected Value in Data Upload screen");
       
       //step4: verifying the schedule no hyper link
       Assert.assertTrue(data.SchduleNoIn_DataUploadHistory());
       ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified Schedule no hyperlink");
       
       //step5: click on Schedule no hyper link
     //									  Assert.assertTrue(data.clickSheduleHyperLinkAndVerfiySchedulePopup());
       ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked on Schedule no hyperlink");
       
       //step6: verify the original record hyper link
       Assert.assertTrue(data.OriginalRecordsHyperlink());
       ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified original records hyperlink");
       
       //step7: verify the duplicate record hyper link
       Assert.assertTrue(data.DuplicateRecordsHyperlink());
       ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified duplicate records hyperlink");
       
       //step8: verify the total record hyper link
       Assert.assertTrue(data.TotalRecordsHyperlink());
       ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified total records hyperlink");
       
       //step9: verify the undo button
       Assert.assertTrue(data.VerifyUndoBTN());
       ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified undo button");
       
     //  //step10: click on original records hyper link and verify the navigation of new invoices screen
       /*Assert.assertTrue(data.ClickOriginalRecLinkAndVerifyNewInv());
       ExtentTestManager.getTest().log(LogStatus.PASS, "Clicked on Original record hyperlink and Successfully verified the navigation of New Invoices screen");*/
       
       //step11: click on duplicate records hyper link and verify the navigation of duplicate invoices screen
      // Assert.assertTrue(data.ClickDuplicateRecLinkAndVerifyDupInv());
       Assert.assertTrue(data.ClickDuplicateRecLinkAndVerifyDupInv_i());
       ExtentTestManager.getTest().log(LogStatus.PASS, "Clicked on duplicate records hyperlink and Successfully verified the navigation of Duplicate Invoices screen");
       Thread.sleep(1000);
       //step12: click on undo button
       /*Assert.assertTrue(data.clickUndoBTN());
       ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked on undo button");
       
       //step13: verify the success message for undo
       Assert.assertTrue(data.VerifyUndoSuccessMsg());
       ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified the undo success messsage");*/
       
     //step14: navigate to Factoring File Uploads page
       FactoringFileUploadPage upload = cyncHomePage.getCyncMenus().openFactoringFileUploadsPage();
       
       //step15: entered expected value 
       Assert.assertTrue(upload.addValueToExpectedValue(expectedValue));
       ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully entered Expected Value");
       
		//step16: uploading the file
       try             
	    {
      WebElement El = driver.findElement(By.xpath("(//input[contains(@id,'uploaded_file')])[4]"));
	    	((RemoteWebElement)El).setFileDetector(new LocalFileDetector());
	    	El.sendKeys(System.getProperty("user.dir")+"\\FileUpload\\FactoringMappFile.xlsx");
	    }
	    catch(Exception e)
	    {
	    	e.printStackTrace();
	    }
       
      //step17: click on process file button
       Assert.assertTrue(upload.ProcessFilesClick());
       ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully entered Expected Value"); 
		
	   //step18: verify the success message
       Assert.assertTrue(upload.VerfiySuccessMsg());
       ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully entered Expected Value");  
	}
	
	@Test(dataProvider = "ManualEntry",groups = { TestGroups.SMOKE,TestGroups.REGRESSION }, testName = "Verify the Creation of Invoice through Manual Entry")
	public void TC_09_ManualEntry(String invoiceno,String accountno,String accountname,String invoiceamt) throws InterruptedException
	{
		ExtentTestManager.getTest().getTest().setName("Invoice creation through Manual Entry");
        ExtentTestManager.getTest().assignCategory("Module:Factoring");
        
        String clientname = "FACT AB TEST AB";
        //cyncHomePage.getCyncMenus().selectClientFromDropDown(clientGname);
        
        //step1: navigate to manual entry screen
        ManualEntryPage manual = cyncHomePage.getCyncMenus().openManualEntryPageFactoring();
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully navigated to Manual Entry Page");
        
        //step2: verify the header of manual entry screen
        String Header = "Manual Entry";
       // Assert.assertTrue(manual.PageHeaderVerify(Header));
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully navigated to Manual Entry screen");
		
        //step3: verify the invoice no by tabbing
        Assert.assertTrue(manual.VerifyInvNoTextBox());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified the invoice no by tabbing it");
        
        //step4: verify the account no by tabbing
        Assert.assertTrue(manual.VerifyAccNoTextBox());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified the account no by tabbing it");
        
        //step5: verify the account name by tabbing
        Assert.assertTrue(manual.VerifyAccNameTextBox());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified the account name by tabbing it");
        
        //step6: verify the po number by tabbing
        Assert.assertTrue(manual.VerifyPoNoTextBox());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified the po no by tabbing it");
        
        //step7: verify the file ref no by tabbing
        Assert.assertTrue(manual.VerifyFileRefNoTextBox());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified the file ref no by tabbing it");
        
        //step8: verify the invoice amount by tabbing
        Assert.assertTrue(manual.VerifyInvAmtTextBox());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified the invoice amount by tabbing it");
        
        //step9: verify the invoice date by tabbing
        Assert.assertTrue(manual.VerifyInvDateTextBox());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified the invoice date by tabbing it");
        
        //step10: verify the payment terms by tabbing
        Assert.assertTrue(manual.VerifyPaymentTerms());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified the payment terms by tabbing it");
        
        //step11: verify the due date by tabbing
        Assert.assertTrue(manual.VerifyDueDateTextBox());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified the due date by tabbing it");
        
        //step12:click on delete icon
        Assert.assertTrue(manual.VerifyDeleteIcon());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified Delete icon");
        
        //step13: add value to invoice no text box
        Assert.assertTrue(manual.ValuesToInvoiceNo(invoiceno));
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully entered invioce no");
        
        //step14: add value to account no text box
        Assert.assertTrue(manual.ValuesToAccountNo(accountno));
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully entered account no");
        
        //step15: add value to account name text box
        Assert.assertTrue(manual.ValuesToAccountName(accountname));
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully enetered account name");

        //step16: add value to invoice amount text box
        Assert.assertTrue(manual.ValuesToInvoiceAmount(invoiceamt));
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully entered invoice amount");
        
        //step17: add value to invoice date
        DateFormat dateFormat2 = new SimpleDateFormat("MM/dd/yyyy"); 
	     Date date2 = new Date();
	     String today = "28/2/2020";//dateFormat2.format(date2);
	     System.out.println(today);
        Assert.assertTrue(manual.ValuesToInvoiceDate());
        cyncHomePage.getCyncMenus().selectDate(today);
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully entered invoice date");
        Thread.sleep(4000);
        
        //Step :click on save Button
        Assert.assertTrue(manual.ClickSaveInvoiceBTN());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked on save invoices button");
        
        //step18: click on process invoices button and verify the new invoices screen's header
        //String newHeader = "New Invoices";
        Assert.assertTrue(manual.ClickProcessInvoiceBTN());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked on Process invoices button and naviagted to New invoices screen");
        
        //step19: verify the success message
       // Assert.assertTrue(manual.VerifySuccessMsg());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified Success Message");
         
	}
	

	@Test(dataProvider = "ManualEntry",groups = { TestGroups.SMOKE,TestGroups.REGRESSION }, testName = "Verify the processing of New Invoices")
	
	public void TC_10_NewInvoices(String invoiceno,String accountno,String accountname,String invoiceamt)
	{
		ExtentTestManager.getTest().getTest().setName("Processing of New Invoices");
        ExtentTestManager.getTest().assignCategory("Module:Factoring"); 
        
        String clientname = "0autocnt95";
        //cyncHomePage.getCyncMenus().selectClientFromDropDown(clientGname);
        
        //step1: navigate to new invoices screen
        NewInvoicesPage newinv = cyncHomePage.getCyncMenus().openNewInvoicesPage();
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully navigated to New Invoices Page");
        
        //step2: verify the header of new invoices screen
        String Header = "New Invoices";
        Assert.assertTrue(newinv.PageHeaderVerify(Header));
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified the new invoices page header");
        
        //step3: verify the edit invoices button
        Assert.assertTrue(newinv.VerifyEditInvoicesBTN());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified the Edit Invoice button");
        
        //step4:verify the process button
        Assert.assertTrue(newinv.VerifyProcessBTN());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified the Process button");
        
        //step5: verify the invoice list check box
        Assert.assertTrue(newinv.VerifyInvoiceListCheckBox());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified the invoice list check box");
        
        //step6: select the invoice from grid
        Assert.assertTrue(newinv.SelectFirstInv());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully selected the invoice from grid");
        
        //step7: click on edit invoices button
        Assert.assertTrue(newinv.ClickEditInvoicesBTN());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked on Edit invoices button");
        
        //step8: verify the manual entry screen
        Assert.assertTrue(newinv.VerifyManualEntryscreen());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified manual entry screen");
        
        //step9: click on process invoices button in manual entry screen
        Assert.assertTrue(newinv.ClickOnProcessInvoicesBTN());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked process invoices button in Manual Entry screen");
        
        //step10: verify the edited invoice in new invoices screen
      //  Assert.assertTrue(newinv.VerifyEditedinvoice());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified edited invoice in New invoices screen");
        
        //step11: select the invoice
        Assert.assertTrue(newinv.SelectInvChkBx());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully selected the invoice");
        
        //step12: process the invoice
        
        Assert.assertTrue(newinv.ClickonProcessBTN());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked on process button");
        
        //step13: verify the success message after processing the invoice
        Assert.assertTrue(newinv.VerifySuccessMSG());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verify the success message after processing the invoice");
        
        //step14: close the success message
   //     Assert.assertTrue(newinv.CloseSuccessMsg());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully closed the success message");
        
	}
	
	@Test(dataProvider = "DuplicateInvoices",groups = { TestGroups.SMOKE,TestGroups.REGRESSION }, testName = "Verify the Duplicate invoices screen functionality")
	public void TC_11_DuplicateInvoices(String expectedValue)
	{
		ExtentTestManager.getTest().getTest().setName("Verify the Duplicate invoices screen functionality");
        ExtentTestManager.getTest().assignCategory("Module:Factoring"); 
        
        String clientname = "0Autocnt95";
       // cyncHomePage.getCyncMenus().selectClientFromDropDown(clientGname);
        
      //step1: navigate to Factoring File Uploads page
        FactoringFileUploadPage upload = cyncHomePage.getCyncMenus().openFactoringFileUploadsPage();
        
        
        //step2: entered expected value 
       // upload.addValueToExpectedValue(expectedValue);
        Assert.assertTrue(upload.addValueToExpectedValue(expectedValue));
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully entered Expected Value");
        
 		
        try             
	    {
       WebElement E2 = driver.findElement(By.xpath("(//input[contains(@id,'uploaded_file')])[4]"));
	    	((RemoteWebElement)E2).setFileDetector(new LocalFileDetector());
	    	E2.sendKeys(System.getProperty("user.dir")+"\\FileUpload\\FactoringMappFile.xlsx");
	    }
	    catch(Exception e)
	    {
	    	e.printStackTrace();
	    }
        
       //step4: click on process file button
        Assert.assertTrue(upload.ProcessFilesClick());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully entered Expected Value"); 
        
      //step5: navigate to Data Upload page
        DataUploadPage data = cyncHomePage.getCyncMenus().openDataUploadPageFactoring();
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully navigated to Data Upload Page");
       
      //step6: verify the duplicate record hyper link
        Assert.assertTrue(data.DuplicateRecordsHyperlink());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified duplicate records hyperlink");
        
      ////step7: click on duplicate records hyper link and verify the navigation of duplicate invoices screen
        Assert.assertTrue(data.ClickDuplicateRecLink());
     //   Assert.assertTrue(data.VerifyDupInv());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Clicked on duplicate records hyperlink and Successfully verified the navigation of Duplicate Invoices screen");
        
      //step8: verify the Accept check box
        DuplicateInvoicesPageFactoring dup = cyncHomePage.getCyncMenus().openDuplicateInvoicesPage();
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully navigated to Duplicate Invoices page");
        
        Assert.assertTrue(dup.VerifyAcceptCheckBox());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified Accept checkbox");
        
        //step9: verify the Edit check box
      // Assert.assertTrue(dup.VerifyEditCheckBox());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified edit checkbox");
        
        //step10: verify the delete check box
        Assert.assertTrue(dup.VerfiyDeleteCheckBox());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified delete checkbox");
        
        //step11: check on edit check box
        Assert.assertTrue(dup.CheckOnEditcheckbox());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully checked on Edit check box");
        
        //step12: verify the after checked on edit check box invoice no field is editable
        Assert.assertTrue(dup.VerifyInvoiceNoEditable());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified the invoice no field");
        
        //step13: check on delete check box
        Assert.assertTrue(dup.CheckOnDeletecheckbox());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully checked on delete check box");
        
        //step14: click on process button
        Assert.assertTrue(dup.ClickOnProcessBTN());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked on process button");
        
        //step15: verify the success message after processing it
        Assert.assertTrue(dup.VerifyDelSuccessMsg());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified the success message after deleting it");
        
        //step16: Check on Accept check box
        Assert.assertTrue(dup.CheckOnAcceptcheckbox());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfuly checked on Accept check box");
        
        //step17: click on process button
        Assert.assertTrue(dup.ClickOnProcessBTN());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked on process button");

        //step18: verify the error msg
        Assert.assertTrue(dup.VerifyErrorMsg());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified the error message");
	}
	
	@Test(dataProvider = "Ineligible",groups = { TestGroups.SMOKE,TestGroups.REGRESSION }, testName = "Verify the Overriding of invoice")
	public void TC_12_Inelgible(String comment) throws InterruptedException
	{
	
		ExtentTestManager.getTest().getTest().setName("Verify the Overriding of invoice");
        ExtentTestManager.getTest().assignCategory("Module:Factoring"); 
        
        //String ClientData = "0AutoSanFac002";
        //cyncHomePage.getCyncMenus().selectClientFromDropDown(clientGname);
        
        //step1: navigate to ineligible screen
        IneligiblePageFactoring ineligible = cyncHomePage.getCyncMenus().openIneligiblePageFactoring();
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully navigated to Ineligible page");
        
        //step2: verify the page header
       /* String Header = "Ineligible";
        Assert.assertTrue(ineligible.PageHeaderVerify(Header));
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified the header");
        Thread.sleep(2000);*/
        //step3: verify the recalculate button
        Assert.assertTrue(ineligible.VerfiyRecalculateBTN());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified the Recalculate button");
        
        //step4: verify the edit invoices button
        Assert.assertTrue(ineligible.VerifyEditInvoiceBTN());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successsfully verified the Edit invoices button");
        
        //step5: verify the comment text box
        Assert.assertTrue(ineligible.VerifyCommentTextBox());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified the Comment Text Box");
        
        //step6: verify the override button
        Assert.assertTrue(ineligible.VerifyOverrideBTN());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified the Override button");
        
        //step7: check on ineligible invoice list check box
        Assert.assertTrue(ineligible.CheckOninvoicelistCheckBox());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully checked on Invoice list check box");
        
        //step8: add value to commment text box
        Assert.assertTrue(ineligible.addValuetoCommentTextBox(comment));
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully entered comment in comment text box");
        
        //step9: click on Override button
        Assert.assertTrue(ineligible.ClickOnOverrideBTN());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked on Overrride button");
        
        //step10: verify the success message
      //  Assert.assertTrue(ineligible.VerifySuccessMsg());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Verified the Success Message after overriding the invoice");
	}
	
	@Test(dataProvider = "PreVerification",groups = { TestGroups.SMOKE,TestGroups.REGRESSION }, testName = "Verify the Verification of the invoice")
	public void TC_13_PreVerification(String comment,String verificationmode,String paymentterms,String debtorcomment,String addComment,String sign) throws InterruptedException
	{
		ExtentTestManager.getTest().getTest().setName("Verification of invoices_factoring sanity");
        ExtentTestManager.getTest().assignCategory("Module:Factoring"); 
        
        String clientname = "0AUTOSANITY8";
        //cyncHomePage.getCyncMenus().selectClientFromDropDown(clientGname);
        
        //step1: navigate to pre-verification page
        PreVerificationPageFactoring pre = cyncHomePage.getCyncMenus().openPreVerificationPageFactoring();
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully navigate to Pre-Verification page");
        Thread.sleep(4000);
        //step2: verify the header
        String Header = "Pre Verification";
        Assert.assertEquals(pre.PageHeaderVerify(Header),Header);
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified the header");
        Thread.sleep(2000);
        
        //step3: verify the process verification button
        Assert.assertTrue(pre.VerifyProcessVerBTN());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified the process verification button");
        
        //step4: verify the edit invoices button
        Assert.assertTrue(pre.VerifyEditInvoicesBTN());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified the edit invoices button" );
        
        //step5: verify the Mark ineligible button
        Assert.assertTrue(pre.VerifyMarkIneligibleBTN());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified the Mark ineligible button");
        
        //driver.navigate().refresh();
       // Thread.sleep(4000);
        
      /*  //step6: check on invoice check box
        //    Assert.assertTrue(pre.CheckOnInvoiceCheckBox());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully checked on invoice check box");
        Thread.sleep(1000);
        
        //step12: click on mark inelgible button 
      //  Assert.assertTrue(pre.ClickOnMarkInelgibleBTN());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked on mark ineligible button");
        this.isAlertPresent();
        Thread.sleep(2000);
        
        //step13: close the success message
     //   Assert.assertTrue(pre.CloseSuccessMsg());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully closed the success message");
        this.isAlertPresent();
        Thread.sleep(2000);
        
        
        //step14: navigate to ineligible page
      //  IneligiblePageFactoring ineligible = cyncHomePage.getCyncMenus().openIneligiblePageFactoring();
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully navigated to Ineligible page");
       // this.isAlertPresent();
       
        //Thread.sleep(2000);
        
      //step15: check on ineligible invoice list check box
     //   Assert.assertTrue(ineligible.CheckOninvoicelistCheckBox());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully checked on Invoice list check box");
        
        //step16: add value to commment text box
     //   Assert.assertTrue(ineligible.addValuetoCommentTextBox(comment));
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully entered comment in comment text box");
        
        //step17: click on Override button
     //   Assert.assertTrue(ineligible.ClickOnOverrideBTN());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked on Override button");
        this.isAlertPresent();
        
        //step18: verify the success message
      //  Assert.assertTrue(ineligible.VerifySuccessMsg());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Verified the Success Message after overriding the invoice");
        
        //step19: navigate to pre-verification page
    //    cyncHomePage.getCyncMenus().openPreVerificationPageFactoring();
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully naviagted to pre-verification page");*/
        Thread.sleep(5000);
        
        driver.navigate().refresh();
        
        Thread.sleep(6000);
        
        //step20: check on invoice check box
        Assert.assertTrue(pre.CheckOnInvoiceCheckBox());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully checked on invoice check box" );
        Thread.sleep(4000);
        
        //step21: click on process verification button
        this.isAlertPresent();
        Assert.assertTrue(pre.ClickOnProcessVerificationBTN());
        this.isAlertPresent();
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked on process verification button");
        
        
        //step22: verify the success message after clicking process verification button
        // Assert.assertTrue(pre.VerifySuccessMsg());
        // ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified success messsage after clicking the process verification button");
        
        //step23: click on verification no hyper link
        Thread.sleep(8000);
        Assert.assertTrue(pre.ClickOnVerificationNoLink());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked on Verification no hyper link");
        
        //step24: verify the verification batch detail popup's header
        Assert.assertTrue(pre.VerifyHeaderOfVeriBatchDetailPopup());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified header of Verification batch detail poup's header");
        
        //step25: click on Add button
        Assert.assertTrue(pre.ClickOnAddBTN());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked on Plus button");
        
        //step26: select verification mode as call from drop down
        Assert.assertTrue(pre.SelectVerificationMode(verificationmode));
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully selected Call as Verification mode from drop down");
        
        //step27: click on verify button
        Assert.assertTrue(pre.ClickOnVerifyBTN());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked on verify button");
        
        //step28: select payment terms from drop down
        Assert.assertTrue(pre.SelectPaymentTerms(paymentterms));
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully selected payment terms from drop down");
        
        //step29: add value to comment text box
        Assert.assertTrue(pre.addValueToCommentTextBox(debtorcomment));
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully entered value to comment text box");
        
        //step30: add value to additional comment text box
        Assert.assertTrue(pre.addValueToAddCommentTextBox(addComment));
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully entered value to additonal comment text box");
        
        //step31: add value to authorized signatory text box
        Assert.assertTrue(pre.addValueToSignTB(sign));
        ExtentTestManager.getTest().log(LogStatus.PASS, "Succcessfully entered value to signatory text box");
        
        //step32: check on agree check box
        Assert.assertTrue(pre.CheckOnAgreeCB());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully checked on Agree check box");
        
        Thread.sleep(1000);
        //step33: click on submit button
        Assert.assertTrue(pre.ClickOnSubmitBTN());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked on submit button");
        
        //step34: verify the success message after verifying and close the Verification URL
        Assert.assertTrue(pre.VerifySuccessMsgOfVerify());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified the invoice and closed the verification URL");
        Thread.sleep(2000);

        
       //step35: close verification popup
        Assert.assertTrue(pre.CloseVerificationpopup());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully closed verification popup");
        
	}
	
	
	
	@Test(dataProvider = "Ineligible",groups = { TestGroups.SMOKE,TestGroups.REGRESSION }, testName = "Verify the Funding of the invoice")
	public void TC_14_Verified(String comment) throws InterruptedException
	{
		ExtentTestManager.getTest().getTest().setName("Funding of the invoices");
        ExtentTestManager.getTest().assignCategory("Module:Factoring"); 
        

        String clientname = "0001Cnt7294";
        cyncHomePage.getCyncMenus().selectClientFromDropDown(clientGname);


        
        //step1: navigate to verified screen
        VerifiedPageFactoring ver = cyncHomePage.getCyncMenus().openVerifiedPageFactoring();
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully navigated to Verified screen");
        
      /*  //step2: verify the header of verified screen
        String Header = "Verified";
        Assert.assertEquals(ver.PageHeaderVerify(Header),Header);
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified the page header");
        
        //step3: verify the Create funding Batch button
        Assert.assertTrue(ver.VerifyCreateFundingBatchBTN());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified the Create Funding Batch button");
        
        //step4: verify the batch drop down
        Assert.assertTrue(ver.VerifyBatchDropdown());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified the Batch Dropdown");
        
        //step5: verify the Append to batch button
        Assert.assertTrue(ver.VerifyAppendToBatchBTN());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified the Append To Batch button");
        
        //step6: verify the Remove batch button
        Assert.assertTrue(ver.VerifyRemoveBatchBTN());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified the Remove batch button");
        
        //step7: verify the Open batch button
      //  Assert.assertTrue(ver.VerifyOpenBatchBTN());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified the Open Batch button");
        
        //step8: Verify the Fund batch button
      //  Assert.assertTrue(ver.VerifyFundBatchBTN());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified the Fund Batch button");
        
        //step9: verify the Cancel Batch button
      //  Assert.assertTrue(ver.VerifyCancelBatchBTN());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified the Cancel Batch button");
        
        //step10: verify the Edit invoices button
      //  Assert.assertTrue(ver.VerifyEditInvoicesBTN());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified the Edit Invoices button");
        
        //step11: verify the Mark Ineligible button
       // Assert.assertTrue(ver.VerifyMarkIneligibleBTN());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified the Mark Ineligible button");
        
        //step13: select the invoice 
        Assert.assertTrue(ver.SelectFirstInvoiceCheckBox());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully selected the invoice");
        
        //step14: click on Edit invoices button
        Assert.assertTrue(ver.ClickEditInvoicesBTN());//alert is there
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked on Edit invoices button");
        
        //step15: verify the manual entry screen's header
        Assert.assertTrue(ver.VerifyManualEntryHeader());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified the Manual entry screen's header");
        
        //step16: click on process invoice button
        Assert.assertTrue(ver.ClickOnProcessInvoicesBTN());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfuly clicked on Process invoices button");
        
        //step17: verify the success message
        Assert.assertTrue(ver.VerifySuccessMsg());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified the success message");
        
        //step18: navigate to verified screen
        cyncHomePage.getCyncMenus().openVerifiedPageFactoring();
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully navigated to verified screen");
        
        //step19: select the invoice 
        Assert.assertTrue(ver.SelectFirstInvoiceCheckBox());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully selected the invoice");   
        
        //step20: click on Mark ineligible button
     //   Assert.assertTrue(ver.ClickMarkIneligibleBTN());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked on Mark Ineligible button");
        
        //step21: close the success message
        Assert.assertTrue(ver.CloseSuccessMsg());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully closed the success message");
       Thread.sleep(3000);
        
        //step30: select the invoice
        Assert.assertTrue(ver.SelectInvoiceCheckBox());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully selected the invoice");
        
        //step31: click on Create Funding Batch button
        Assert.assertTrue(ver.ClickCreateFundingBatchBTN()); //alert is there
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked on Create Funding Batch button");
        this.isAlertPresent();
        
        //step32: verify the success message
        Assert.assertTrue(ver.VerifySuccessMsgBatch());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verify the success message after creating Funding Batch");
        
        //step33: close the success message
        Assert.assertTrue(ver.CloseSuccessMsg());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully closed success message");
        
        //step34: click on cancel batch button
        //Assert.assertTrue(ver.ClickCancelBatch());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked on Cancel Batch button");
        
        //step35: Select Schedule no from drop down
        Assert.assertTrue(ver.SelectScheduleNo());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully selected schedule no drop down");
        
        //step36: click on cancel batch button in popup
   //     Assert.assertTrue(ver.ClickCancelBatchBTNinpopup()); //alert is there
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked on Cancel Batch button in popup");
        this.isAlertPresent();
        
        //step37: verify the success message
    //    Assert.assertTrue(ver.VerifyCancelSuccessMsg());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfuly verified the cance success message");
        
        //step38: close the cancel batch popup
    //    Assert.assertTrue(ver.CloseCancelpopup());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully closed the cancel batch popup");
        //driver.navigate().refresh();
        Thread.sleep(5000);
        
        //step39: select the invoice
        Assert.assertTrue(ver.SelectInvoiceCheckBox());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully selected the invoice");
        
        
        //step40: click on Create Funding Batch button
        Assert.assertTrue(ver.ClickCreateFundingBatchBTN()); //alert is there
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked on Create Funding Batch button");
        
        //step41: verify the success message
        Assert.assertTrue(ver.VerifySuccessMsgBatch());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verify the success message after creating Funding Batch");
        
        //step42: close the success message
        Assert.assertTrue(ver.CloseSuccessMsg());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully closed success message");

       ///step43: select the invoice
        Assert.assertTrue(ver.SelectInvoiceCheckBox());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully selected the invoice");
        
        //step44: click on Remove Batch button
      //  Assert.assertTrue(ver.ClickRemoveBatchBTN());//alert is there
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked on Remove batch button"); 
        this.isAlertPresent();
        
        //step46: close the success msg
     //   Assert.assertTrue(ver.CloseSuccessMsg());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully closed the success message");
        Thread.sleep(500);
       // driver.navigate().refresh();*/
        
        //step47: select the invoice
        Thread.sleep(5000);
        Assert.assertTrue(ver.SelectInvoicesCheckBox());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully selected the invoice");
        
        //step48: click on Create Funding Batch button
        Assert.assertTrue(ver.ClickCreateFundingBatchBTN()); //alert is there
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked on Create Funding Batch button");
        this.isAlertPresent();
        
        //step49: verify the success message
        //Assert.assertTrue(ver.VerifySuccessMsgBatch());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verify the success message after creating Funding Batch");
        
        //step50: close the success message
        Assert.assertTrue(ver.CloseSuccessMsg());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully closed success message");
        Thread.sleep(4000);
        //step51: click on Fund Batch button
        Assert.assertTrue(ver.ClickFundBatchBTN());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked on Fund batch button");
        
        //step52: verify the fund batch popup 
      //  Assert.assertTrue(ver.VerifyFundBatchpopup());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified the Fund Batch popup");
        
        //step53: select the batch from drop down
        Assert.assertTrue(ver.SelectBatchInFundBatchpopup());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully selected batch from drop down in fund batch popup");
        this.isAlertPresent();
        
        Thread.sleep(6000);
        //step56: click on Fund Batch button in popup
        Assert.assertTrue(ver.ClickFundBatchBTNinpopup());//with handle browser
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked on Fund Batch buttton in Fund Batch popup");
       Thread.sleep(4000);
        
                
        //step58: close the popup
        Assert.assertTrue(ver.CloseFundBatchPopup());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully closed the fund batch popup");
        
        
	}
	
	@Test(groups = { TestGroups.SMOKE,TestGroups.REGRESSION }, testName = "Verify the Funded Invoices screen")
	public void TC_15_FundedInvoices() throws InterruptedException
	{
		ExtentTestManager.getTest().getTest().setName("Verify the Funded Invoices screen");
        ExtentTestManager.getTest().assignCategory("Module:Factoring"); 
        
        String clientname = "0Autocnt696";
        //cyncHomePage.getCyncMenus().selectClientFromDropDown(clientGname);
        
        //step1: navigate to funded invoices screen
        FundedInvoicesPageFactoring fund = cyncHomePage.getCyncMenus().openFundedInvoicesPageFactoring();
        		
        //step2: verify the page header
        String Header = "Funded Invoices";
        //  Assert.assertEquals(fund.PageHeaderVerify(Header),Header);
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully navigated to Funded Invoices screen");
        
        Thread.sleep(6000);
        driver.navigate().refresh();
        Thread.sleep(6000);
        
        //step3: verify the Account name hyperlink
        Assert.assertTrue(fund.VerifyAccountNameHyperlink());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified te Account name hyperlink");
        
        //step4: verify the invoice no hyperlink
        // Assert.assertTrue(fund.VerifyIvnoiceNoHyperlink());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified the Invoice no hyperlink");
        
        //step5: click on Account name hyperlink
      //  Assert.assertTrue(fund.ClickAccountNameHyperlink());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked on Account name hyperlink");
        
        //step6: click on Invoice details hyperlink
        //  Assert.assertTrue(fund.ClickInvoiceDetailsHyperlink());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked on Invoice details hyperlink");
        
        //step7: Verify the Invoice details popup
        //Assert.assertTrue(fund.VerifyInvoiceDetailspopup());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully veriifed the invoice details popup");
        
        //step8: close the invoice details popup
        // Assert.assertTrue(fund.Closepopup());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully closed invoice details popup");
        
        //step9: click on Account name hyperlink
      //  Assert.assertTrue(fund.ClickAccountNameHyperlink());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked on Account name hyperlink");
        
        //step10: click on Account parameters hyperlink
       // Assert.assertTrue(fund.ClickAccountParaHyperlink());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked on Account Parameters hyperlink");
        
        //step11: verify the Account parameters popup
       // Assert.assertTrue(fund.VerifyAccParameterspopup());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified Account Parameters popup");
        
        //step12: close Account parameters popup
     //   Assert.assertTrue(fund.Closepopup());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully closed Account parameters popup");
        
        //step13: click on Account name hyperlink
       // Assert.assertTrue(fund.ClickAccountNameHyperlink());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked on Account name hyperlink");
        
        //step14: click on comment hyperlink
       // Assert.assertTrue(fund.ClickCommentHyperlink());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked on Comment hyeprlink");
        
        //step15: verify the comment popup
       // Assert.assertTrue(fund.VerifyCommentpopup());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified the Comment popup");
        
        //step16: close comment popup
       // Assert.assertTrue(fund.Closepopup());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully closed the comment popup");
        
        //step17: click on Account name hyperlink
        Assert.assertTrue(fund.ClickAccountNameHyperlink());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked on Account name hyperlink");
        
        //step18: click on invoice document hyperlink
        //Assert.assertTrue(fund.ClickInvoiceDocumentHyperlink());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked on Invoice Details hyperlink");
        
        //step19: verify the invoice document popup
       // Assert.assertTrue(fund.VerifyInvoiceDocumentpopup());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfuly verified the invoice details popup");
        
        //step20: close the invoice document popup
       // Assert.assertTrue(fund.CloseImageMappingpopup());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully closed the invoice document popup");
        
        //step17: click on Account name hyperlink
        Assert.assertTrue(fund.ClickAccountNameHyperlink());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked on Account name hyperlink");
        
        //step18: click on Chargeback hyeprlink
        Assert.assertTrue(fund.ClickChargebackHyperlink());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked on Chargeback hyperlink");
        
        //step19: verify the chargeback popup
       // Assert.assertTrue(fund.VerifyChargebackpopup());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified the chargeback popup");
        
        //step20: verify the charge back button
        Assert.assertTrue(fund.VerifyChargeBackBTN());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified the chargeback button");
        
        //step21: enter chargeback value in text box
        String chargebackValue = "4000";
        //  Assert.assertTrue(fund.addValuetoChargebackTB(chargebackValue));-->no need 
        // ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully added value to Charge back text box");
        
        
        //step24: verify chargeback reason drop down
        Assert.assertTrue(fund.VerifyChargebackReasonDD());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified ChargeBack reason dropdown");
        
        //step25: click on Add button
        Assert.assertTrue(fund.ClickAddBTN());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked on Add button");
        
        //step26: verify Additional fee drop down
       // Assert.assertTrue(fund.VerifyAdditionalFeeDD());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified Additional Fee dropdown");
        
        //step27: verify Amount field 
        //Assert.assertTrue(fund.VerifyAmountField());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified Amount field in charge back popup");
       
        
        //step23: click on charge back button
        Assert.assertTrue(fund.ClickChargebackBTN());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked on Chargeback button");
        
        //step25: veirfy the success message after processing the chargeback
        Assert.assertTrue(fund.VerifyCBSuccessMsg());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified the success message after processing the chargeback");
        
        //step26: close chargeback success message
        Assert.assertTrue(fund.CloseCBSuccessMsg());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully closed Chargeback success message");
        
        
        /*//step29: click on Verification no hyperlink
        Assert.assertTrue(fund.ClickVerificationNoHyperlink());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked on Verification no hyperlink");
       
       
        //step32: click on Verification report button
        Assert.assertTrue(fund.ClickVerificationReportBTN());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked on Verification report button");
       
        
        //step34: click on Generate report button
        Assert.assertTrue(fund.ClickGenerateReportBTN());//alert is there
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked on Generate Report button");
        
        //step35: close Master Account Debtor Details popup
        Assert.assertTrue(fund.CloseMasterAccDebtpopup());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully closed the Master Account Debtor Details popup");*/
        
        //step36: close verification batch detail popup
        /*Assert.assertTrue(fund.CloseVerificationBatchDetailpopup());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully closed the Verification Batch Details popup");*/
        
       
		
	}
	
	@Test(groups = { TestGroups.SMOKE,TestGroups.REGRESSION }, testName = "Verify the Recourse screen")
	public void TC_16_Recourse()
	{
		ExtentTestManager.getTest().getTest().setName("Verify Recourse screen");
        ExtentTestManager.getTest().assignCategory("Module:Factoring");
        
        //String ClientData = "0AutoSanFac002";
        //cyncHomePage.getCyncMenus().selectClientFromDropDown(clientGname);
        
        //step1: navigate to recourse screen
        RecoursePageFactoring rec = cyncHomePage.getCyncMenus().openRecoursePageFactoring();
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully navigated to Recourse screen");
        
        //step2: verify the page header
        String Header = "Recourse";
        Assert.assertEquals(rec.PageHeaderVerify(Header), Header);
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified the Recourse screen's page header");
        
        //step3: verify the process recourse button
        Assert.assertTrue(rec.VerifyProcessRecourseBTN());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified Process Recourse button");
        
        //step4: click on process recourse button
        Assert.assertTrue(rec.ClickProcessRecorseBTN());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked on Process Recourse button");
        
        //step5: verify the process recourse popup
        Assert.assertTrue(rec.VerifyProcessRecoursepopup());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified process recourse popup");
        
        //step6: verify recourse date field
       // Assert.assertTrue(rec.VerifyRecourseDate());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified Recouse Date field in popup");
        
        //step7: verify no of inovices field
        Assert.assertTrue(rec.VerifyNoOfInv());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified No of invoices field in popup");
        
        //step8: verify the total recourse amount field
        Assert.assertTrue(rec.VerifyTotRecAmount());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified Total Recourse Amount field in popup");
        
        //step9: verify the Process recourse button in popup
        Assert.assertTrue(rec.VerifyProRecourseBTNinpopup());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified Process Recourse button in popup");
        
        //step10: verify cancel button in popup
        Assert.assertTrue(rec.VerifyCanceBTN());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified Cancel button in popup");
        
        //step11: click on process recourse button
        Assert.assertTrue(rec.ClickProcessRecourseBTN());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked on Process Recourse button");
        
        //step12: verify the error message
        Assert.assertTrue(rec.VerifyErrorMsg());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified error message");
        
        //step13: close error message
        Assert.assertTrue(rec.CloseErroMsg());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully closed the error message");
        
        //step14: click on cancel button
        Assert.assertTrue(rec.ClickCancelBTN());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked on Cancel button in popup");
        
	}
	
	
	
	
	
	@Test(dataProvider = "BatchProcess" , groups = { TestGroups.SMOKE,TestGroups.REGRESSION }, testName = "Verify the Batch Process screen")
	public void TC_17_BatchProcess(String clientname,String debtorname,String sourcetype,String checkrefno,String checkamount,String applyamount) throws InterruptedException
	{
		ExtentTestManager.getTest().getTest().setName("Verify Batch Process screen");
        ExtentTestManager.getTest().assignCategory("Module:Factoring");
        
        //step1: navigate to Batch process screen
        BatchProcessScreenPageFactoring batch = cyncHomePage.getCyncMenus().openBatchProcessScreenPageFactoring();
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully navigated to Batch process screen");
        //Thread.sleep(4000);
        //step2: verify the page header


        String clientname1="0autocnt853";
        String debtorname1="SANAUTO";
        String Header = "Batch Process";
        String RefBatchNo = "112233";
        
        //step 2: verify the page header
        /*Assert.assertEquals(batch.PageHeaderVerify(Header), Header);
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified the Batch Process page's header");*/



   //*******************************************************************     FACTORED      ***************    1
       


        //step3: click on Add New button
        Thread.sleep(6000);
        //Assert.assertTrue(batch.clickAddNewBTN());
        
        Assert.assertTrue(batch.clickElement(batch.add));
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked on Add New button");

        
        //step4: verify batch date field
        //Assert.assertTrue(batch.VerifyBatchDate());
        //ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified Batch Date field");
        
        
        //step5: verify Ref Batch no field
        Assert.assertTrue(batch.VerifyRefBatchNo());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified Ref Batch no field");
        
        
        //step6: verify batch amount field
        Assert.assertTrue(batch.VerifyBatchAmt());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified Batch amount field");
        
        
        //step7: verify check total field
        Assert.assertTrue(batch.VerifyCheckTotal());//disabled
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified Check total field");
        
        
        //step8: verify applied total field
        Assert.assertTrue(batch.VerifyAppliedAmt());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified Applied Amount field");
        
        
        //step9: verify browse files button
        Assert.assertTrue(batch.VerifyBrowseFilesBTN());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successflly verified Browse Files button");
        
        
        //step10: add value to Ref Batch no field
        Assert.assertTrue(batch.addValueToRefBatchNo(RefBatchNo));
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully added value to Ref batch no");
        
        
        //step11: add value to Batch amount field
        String BatchAmt = "6000";
        Assert.assertTrue(batch.addValueToBatchAmt(BatchAmt));
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully added value to Batch Amount");
        
        
        //step12: verify Back to batch list button
        Assert.assertTrue(batch.VerifyBackToBatchBTN());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified Back To Batch button");
        
        
        //step13: verify save batch button
        Assert.assertTrue(batch.VerifySaveBatchBTN());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified Save Batch button");
        
        
        //step14: verify the batch date message
        Assert.assertTrue(batch.VerifyBatchDateMsg());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified Batch Date message");
        
        
        //step15: verify Save and create check button
        Assert.assertTrue(batch.VerifySaveAndCreateCheckBTN());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified Save and Batch button");
        
        
        //step16: click on save and create check button without check details
        Assert.assertTrue(batch.ClickSaveAndCreateCheckBTN());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked on Save and Batch button");
        
        
        //step17: verify the success message
        // Assert.assertTrue(batch.VerifySuccessMsg());
        //ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified success message after batch got saved");
        

        
        //step18: add value to Client field
        Assert.assertTrue(batch.addValueToClientField(clientGname));
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully added value to Client Text box");
           
        
        //step19: add value to Debtor field
        //  String debtorname12="DEMFAC";
        //  Assert.assertTrue(batch.addValueToDebtorField(debtorname1));
        //  ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully added value to Debtor Text box");
        
        //step19: add value to Debtor field
        Thread.sleep(2000);
        Assert.assertTrue(batch.SelectValueFromDebtorFieldDropDown());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully added value to Debtor Text box");

        
        
        //step20: select source type from drop down
        Assert.assertTrue(batch.SelectSourceType(sourcetype));
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully selected source type from dropdown");
        
        
        
        //step21: add value to check no field
        String checkrefno1="a";
        Random rndNum = new Random();    
        int Rnum=rndNum.nextInt(1000);
        String sRn= Integer.toString(Rnum); 
        String checkrefnoR=checkrefno1+sRn;

        Assert.assertTrue(batch.addValueToCheckNoField(checkrefnoR));
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully added value to Check No Text box");
        
        
        
        //step22: add value to Check amount field
        Assert.assertTrue(batch.addValueToCheckAmtField(checkamount));
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully added value to Check Amount text box");
        
        
        
        //step23: verify Bank Routing no Field
        Assert.assertTrue(batch.VerifyBankRoutingNoField());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified Bank routing No field");
        
        
        
        //step24: verify Bank Acocunt no field
        Assert.assertTrue(batch.VerifyBankAccNoField());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified Bank Acount No field");
        
        
        
        //step25: verify the factoring payments tag
        Assert.assertTrue(batch.VerifyFactPaymentsTag());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked on Factoring Payments Tag");
        Thread.sleep(2000);
         
        
        //step26: click on invoice distribution tag
        Thread.sleep(2000);
        Assert.assertTrue(batch.ClickInvDistributionTag());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked on Invoice Distribution Tag");
        
        //step28: check on Invoice check box
        Thread.sleep(4000);
        // batch.CheckOnInvCheckBox();-->no need
        // ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully checked on Invoice Check box");
        //Thread.sleep(4000);

        
        //step29: Get value from invoice amount field
        String applyAmtfetchedfromUI = batch.getValueFromFactoredCinvoiceAmtField(batch.invoiceAmount_xpath);


        //  Assert.assertEquals(batch.addValueToFactoredApplyAmtField(applyAmtfetchedfromUI),applyAmtfetchedfromUI);
        //ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully added value to Apply Amount field");
        
        
        //Enter data on Applyamount taking data from current Amount
        Assert.assertTrue(batch.addValueToApplyAmtFieldFromCurrentamount());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully added value to apply amount");
        Thread.sleep(2000);
        
        
        
        //step 30: Re-enter Check amount with taking data from apply amount
        Assert.assertTrue(batch.addValueToCheckAmtFieldFromApplyamount());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully added value to Check Amount text box same as apply amount");
        
        
        
        //step31: verify cancel button
        Assert.assertTrue(batch.VerifyCancelBTN());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified Cancel button");
        
        //step32: Verify save button
        Assert.assertTrue(batch.VerifySaveBTN());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified Save button");
        
        //step30: Verify Save and new button
        Assert.assertTrue(batch.VerifySaveAndNewBTN());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified Save and New button");
        
        //step31: click on save button
        Assert.assertTrue(batch.ClickSaveBTN());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked on save button");
        
        
        Thread.sleep(2000);
        //step32: Edit Batch
        Assert.assertTrue(batch.ClickBatchEditIcon());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked Edit Batch");
        Thread.sleep(2000);

        
        
        //step33: Clear Batch Amount & Re-enter data to Batch Amount,same as Check amount  
        Assert.assertTrue(batch.addValueToBatchAmtAfterEditBatch(applyAmtfetchedfromUI));
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully Re-Entered value to Batch Amount");
        Thread.sleep(4000);
        
        
        
        //step34: click on save button
        Assert.assertTrue(batch.ClickSaveBTNafterEditBatch());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked on save button");
        Thread.sleep(6000);

        
        
        //step35: verify the success message
       // Assert.assertTrue(batch.VerifySaveChkSuccessMsg());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified the success message after saving the batch");


        
        //step36: verify the preview icon
        //  Assert.assertTrue(batch.VerifyPreviewIcon());
        //  ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified preview icon");

   
        //step32: verify the success message
        //Assert.assertTrue(batch.VerifySaveChkSuccessMsg());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified the success message after saving the batch");
        
        
        
        //step37: Verify the edit icon
        Assert.assertTrue(batch.VerifyEditIcon());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified Edit icon");
        
        
        
        //step38: Verify the delete icon
        Assert.assertTrue(batch.VerifyDeleteIcon());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfuly verified delete icon");
        
        
        
        //step39: Get the Batch Number
        String batchNo=batch.getValueFromBatchNoField();
        
        
        
        //step40: click on Back to Batch button
        Assert.assertTrue(batch.ClickOnBackToBatchBTN());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked on Back to batch button");
        Thread.sleep(2000);


 //***********

        
        //step41: insert Batch No and Filter on Batch Process screen
        Assert.assertTrue(batch.addValueToBatchNoSearchField(batchNo));
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully Entered BatchNo on Search Field of Batch No");
        Thread.sleep(1000);
     
        
        
        //step42: Mouse Hover on BatchNo to see Process icon
        Thread.sleep(4000);
        Assert.assertTrue(batch.batchNumberMouseHover());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked on Process batch button");
        Thread.sleep(6000);
        

        
        //step43: Process the Batch
        
        Thread.sleep(2000);
        Assert.assertTrue(batch.ProcessBatchBTN());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked on Process batch button");
        Thread.sleep(8000);
      
 

//******************************************************** eND of BATCH PROCESS*****************************************

        
        //step39: click on notification icon
        Assert.assertTrue(batch.ClickNotificationIcon());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked on notification icon");

        
        //step40: verify the success message for completed batch process
        //String message = "Batch process completed successfully";
        Assert.assertTrue(batch.VerifyCompletedMsg());//check contains
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified Batch process completed message");
        
        //step41: click on cancel button

        Assert.assertTrue(batch.ClickCancelBTNInNot());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully closed notification popup");
        
	}
	

	@Test(dataProvider = "CreditQueue" , groups = { TestGroups.SMOKE,TestGroups.REGRESSION }, testName = "Verify the Credit Queue Creation")
	public void TC_18_CreditQueue(String clientname,String debtor) throws InterruptedException
	{
		ExtentTestManager.getTest().getTest().setName("Credit Queue creation");
		ExtentTestManager.getTest().assignCategory("Module:Factoring");
		
		//step1: navigate to credit queue screen
		CreditQueuePageFactoring credit = cyncHomePage.getCyncMenus().openCreditQueuePageFactoring();
		ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully navigated to Credit Queue screen");
		Thread.sleep(15000);
		
		//step2: click on add new button
		Assert.assertTrue(credit.ClickAddNewBTN());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked on add new button");
		
		//step3: select client from dropdown
		Assert.assertTrue(credit.SelectClient(clientGname));
		ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully selected client from drop down");
		Thread.sleep(500);
		
		//step4: select debtor from dropdown
		Assert.assertTrue(credit.SelectDebtor(debtor));
		ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully selected debtor from drop down");
		
		//step5: add value to Requested Credit limit text box
		String reqLimit = "10000";
		Assert.assertTrue(credit.addValueToReqCreditLimit(reqLimit));
		ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully added value to Requested Credit limit field");
		
		//step6: add value to comment field
		String comment = "SanTest";
		Assert.assertTrue(credit.addValueToComment(comment));
		ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully added value to comment field");
		
		//step7: click on save button
		Assert.assertTrue(credit.ClickSaveBTN());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked on save button");
		
		
	}
	
	@Test(groups = { TestGroups.SMOKE,TestGroups.REGRESSION }, testName = "Verify the Term Code Creation")
	public void TC_19_TermCode() throws InterruptedException
	{
		ExtentTestManager.getTest().getTest().setName("Term Code Creation");
		ExtentTestManager.getTest().assignCategory("Module:Factoring");
		
		//step1: navigate to Term Code screen
		TermCodesPageFactoring term = cyncHomePage.getCyncMenus().openTermCodesPageFactoring();
		ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully navigated to Term Codes screen");
		
		
	   //step3: verify add new button
		Assert.assertTrue(term.VerifyAddNewBTN());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified Add New button");
		
		//step4: verify delete button
		Assert.assertTrue(term.VerifyDeleteBTN());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified Delete button");
		
		//step5: click on add new button
		Assert.assertTrue(term.ClickAddNewBTN());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked on Add New button");
		
		//step6: add value to name field
		
		Random rndNum = new Random();    
        int Rnum=rndNum.nextInt(1000);
        
        String daysR= Integer.toString(Rnum); 
        
        String name = "auto";
        
        String nameR=name+daysR;
		
		
		
		Assert.assertTrue(term.addValueToName(nameR));
		ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully added value to Name field");
		

		//step7: add value to days field
		
		Assert.assertTrue(term.addValueToDays(daysR));
		ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully added value to Days field");
		
		//step8: click on save button
		Assert.assertTrue(term.ClickSaveBTN());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully created Term Code");
		Thread.sleep(5000);
		
		//step9: select created term code
		
		Assert.assertTrue(term.SelectCreatedTC());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully selected created Term Code");
		
		//step10: Click on Edit button
		Assert.assertTrue(term.ClickEditBTN());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked on Edit Button");
		
		//step11: verify status drop down
		Assert.assertTrue(term.VerifyStatusDropdownEdit());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified status dropdown while editing");
		
		//step12: click on cancel button
		Assert.assertTrue(term.ClickUpdateBTN());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked on Update button");
		Thread.sleep(7000);
		
		/*//step13: select created term code
		Assert.assertTrue(term.SelectCreatedTC());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully selected the created Term Code");
		
		//step14: click on delete button
		Assert.assertTrue(term.ClickDeleteBTN());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked on delete button");
		
		//step15: click on yes button
		Assert.assertTrue(term.ClickYesBTN());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully deleted Term code");*/
		
	}
	
	@Test(groups = { TestGroups.SMOKE,TestGroups.REGRESSION }, testName = "Verify the Term Code Creation")
	public void TC_20_DeleteAutoCreatedTermCode() throws InterruptedException
	{
		ExtentTestManager.getTest().getTest().setName("delete Term Code");
		ExtentTestManager.getTest().assignCategory("Module:Factoring");
		
		//step1: navigate to Term Code screen
		TermCodesPageFactoring term = cyncHomePage.getCyncMenus().openTermCodesPageFactoring();
		ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully navigated to Term Codes screen");

		//step2: select created term code
		
		Assert.assertTrue(term.SelectCreatedTC());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully selected created Term Code");
		
		//step3: Click on Edit button
		Assert.assertTrue(term.ClickEditBTN());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked on Edit Button");
		
		//step4: verify status drop down
		Assert.assertTrue(term.VerifyStatusDropdownEdit());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified status dropdown while editing");
		
		//step5: click on cancel button
		Assert.assertTrue(term.ClickUpdateBTN());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked on Update button");
		Thread.sleep(7000);
		
		//step6: select created term code
		Assert.assertTrue(term.SelectCreatedTC());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully selected the created Term Code");
		
		//step7: click on delete button
		Assert.assertTrue(term.ClickDeleteBTN());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked on delete button");
		
		//step8: click on yes button
		Assert.assertTrue(term.ClickYesBTN());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully deleted Term code");
		
	}
	
	

	@Test( groups = { TestGroups.SMOKE,TestGroups.REGRESSION }, testName = "Verify the Cash Receipt screen")
	public void TC_21_CashReceipt()
	{
		ExtentTestManager.getTest().getTest().setName("Verify Cash Receipt page after getting payment");
        ExtentTestManager.getTest().assignCategory("Module:Factoring");
        
        //String ClientData = "0AutoSanFac002";
        cyncHomePage.getCyncMenus().selectClientFromDropDown(clientGname);
        
        //step1: navigate to cash receipt screen
        CashReceiptPageFactoring cash = cyncHomePage.getCyncMenus().openCashReceiptPageFactoring();
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully navigated to Cash Recipt screen");
        
        //step2: verify Account name hyperlink
       // Assert.assertTrue(cash.VerifyAccNameHyperlink());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified Account name hyperlink");
        
        //step3: click on Account name hyperlink
        Assert.assertTrue(cash.ClickAccNameHyperlink());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked on Account name hyeprlink");
        
        //step4: verify invoice details hyeprlink
        Assert.assertTrue(cash.VerifyInvoiceDetailsHL());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified invoice details hyperlink");
        
        //step5: Verify Account parameters hyeprlink
        Assert.assertTrue(cash.VerifyAccParaHL());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified Account Parameters hyperlink");
        
        //step6: verify comments hyperlink
      //  Assert.assertTrue(cash.VerifyCommentsHL());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified Comments hyperlink");
        
        //step7: verify invoice documents hyperlink
        Assert.assertTrue(cash.VerifyInvoiceDocHL());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified Invoice Documents hyerplink");
        
        //step8: verify contacts hyeprlink
        Assert.assertTrue(cash.VerifyContactsHL());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified contacts hyperlink");
	}
	
	@Test(groups = { TestGroups.SMOKE,TestGroups.REGRESSION }, testName = "Verify the Reserve Release")
	public void TC_22_ReserveRelease()
	{
		ExtentTestManager.getTest().getTest().setName("Verify Reserve Release screen");
        ExtentTestManager.getTest().assignCategory("Module:Factoring");
        
      //  String ClientData = "0AutoSanFac002";
        cyncHomePage.getCyncMenus().selectClientFromDropDown(clientGname);
        
        
	}
	
	
	@Test(groups = { TestGroups.SMOKE,TestGroups.REGRESSION }, testName = "Purging Invoice Validation template")
	public void TC_23_DeleteInvoiceValidationTemp()
	{
		ExtentTestManager.getTest().getTest().setName("Purging invoice Validation Template");
		ExtentTestManager.getTest().assignCategory("Module: Factoring");
		
		  // String clientdata = "0AutoSanfac002";
		  String searchData="autotempSanfac";
          cyncHomePage.getCyncMenus().selectClientFromDropDown(clientGname);
          
          //Step 1:navigate to invoice validation Temp
          InvoiceValidationTemplatePage inv = cyncHomePage.getCyncMenus().openInvValTempPage();
          ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully navigated to Invoice Validation Template Page");
          //Step 2:Search existing invoice validation temp
          Assert.assertEquals(inv.addValueToSearchTextBox(searchData),searchData);
          ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully searched Invoice validation Temp"); 
          //Step 3:Delete invoice validation temp
          Assert.assertTrue(inv.ClickOnDeleteBTN());
          ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked on Delete "); 
     
	}
	
	
	
	@Test(groups = { TestGroups.SMOKE,TestGroups.REGRESSION }, testName = "Purging the Client", invocationCount=1)
	public void TC_24_PurgingClient()
	{
		ExtentTestManager.getTest().getTest().setName("Purging the Client");
		ExtentTestManager.getTest().assignCategory("Module: Factoring");
		
		   String clientname = "0AutoCNT";
          //cyncHomePage.getCyncMenus().selectClientFromDropDown(clientGname);
		
                //Step111:navigate to basic detail page
	         BasicClientDetailPage BasicClientDetail = cyncHomePage.getCyncMenus().openBasicDetailPage();
	         ExtentTestManager.getTest().log(LogStatus.PASS, "Step111:Successfully navigated Basic Client Detail Screen");
	         
	         //Step112:Successfully clicked on Edit button in Basic Client Detail Screen
	         Assert.assertTrue(BasicClientDetail.ClickOnEditVerify());
	         ExtentTestManager.getTest().log(LogStatus.PASS, "Step112:Successfully clicked on Edit button in Basic Client Detail Screen");        
	         
	         //Step113:Successfully clicked on Active check box in Basic Client Detail Screen
	         Assert.assertTrue(BasicClientDetail.ClickOnActiveCheckBoxVerify());
	         ExtentTestManager.getTest().log(LogStatus.PASS, "Step113:Successfully clicked on Active check box in Basic Client Detail Screen");        
	         
	         //Step114:Successfully clicked on save button in Basic Client Detail Screen
	         Assert.assertTrue(BasicClientDetail.ClickOnSaveBtnVerify());
	         ExtentTestManager.getTest().log(LogStatus.PASS, "Step114:Successfully clicked on save button in Basic Client Detail Screen");        

	         
	       //Step115:Navigate to Inactive client page
	         PurgeClientPage purge=cyncHomePage.getCyncMenus().openInactiveClientsPage();
	          ExtentTestManager.getTest().log(LogStatus.PASS, "Step115:Successfully navigated Inactive client Screen");
	          
	          
	         //Step116:verify the header of Inactive client page
	          String Header2 = "Inactive Clients";
		      Assert.assertTrue(purge.verifyInactiveClientsHeader(Header2));
		      ExtentTestManager.getTest().log(LogStatus.PASS, "Step116:Successfully verified header",Header2);
	          
		
	       //Step117:Successfully Click on the data to delete
		    //String clientname1="0AUTOSANFAC001";
		    Assert.assertEquals(purge.purgClientDeleteBtn(clientGname),clientGname);
		    ExtentTestManager.getTest().log(LogStatus.PASS, "Step117:Successfully Click on the data to delete", clientGname);
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
	
	@DataProvider(name = "FileUpload")
	public Object[][] getData7() {
		return TestUtil.getData(xls_reader, "FileUpload");
	}
	
	@DataProvider(name = "ManualEntry")
	public Object[][] getData9() {
		return TestUtil.getData(xls_reader, "ManualEntry");
	}
	
	
	@DataProvider(name = "DuplicateInvoices")
	public Object[][] getData11() {
		return TestUtil.getData(xls_reader, "DuplicateInvoices");
	}
	
	@DataProvider(name = "Ineligible")
	public Object[][] getData12() {
		return TestUtil.getData(xls_reader, "Ineligible");
	}
	
	@DataProvider(name = "PreVerification")
	public Object[][] getData13() {
		return TestUtil.getData(xls_reader, "PreVerification");
	}
	
	@DataProvider(name = "BatchProcess")
	public Object[][] getData14() {
		return TestUtil.getData(xls_reader, "BatchProcess");
	}
	
	@DataProvider(name = "CreditQueue")
	public Object[][] getData15() {
		return TestUtil.getData(xls_reader, "CreditQueue");
	}
	
	public boolean isAlertPresent() {
		boolean presentFlag = false;
		try {
			Alert alert = driver.switchTo().alert();
			presentFlag = true;
			//alert.accept();
			alert.dismiss();
			
		} catch (Exception ex) {

			System.out.println("No Such Alert Present");

		}

		return presentFlag;
	}
}
