package com.cync.Factoring;

import java.awt.AWTException;

import org.junit.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.cync.FactoringPages.AccountDebtorPage;
import com.cync.FactoringPages.BasicParametersPageFactoring;
import com.cync.FactoringPages.ContactsPageFactoring;
import com.cync.FactoringPages.FactoringClientCreationPage;
import com.cync.FactoringPages.FactoringFeeSetupPage;
import com.cync.FactoringPages.MailAddressPageFactoring;
import com.cync.base.BaseTest;
import com.cync.base.ExtentTestManager;
import com.cync.pages.CyncHomePage;
import com.cync.utility.TestGroups;
import com.cync.utility.TestUtil;
import com.cync.utility.Xls_Reader;
import com.relevantcodes.extentreports.LogStatus;

//*********
/*  
 
 Multiple Client and Multiple Account Debtor load for FNBGriffin
   
*/
//*********
public class FNBGriffin_TC extends BaseTest{

	Xls_Reader xls_reader = new Xls_Reader(System.getProperty("user.dir")
			+ "\\TestDataProvider\\FNBGriffinFactoringClientandDebtorTemplate.xlsx");

	
	@Test(dataProvider = "Client Template", groups = { TestGroups.SMOKE,
			TestGroups.REGRESSION }, testName = "Multiple Factoring Client Creation")

	public void TC_01_MultipleClientCreation(String client_no,String client_name,String Short_Name,String Manager,String Credit_Line_Amount,String Risk_Rating,String Street_Address,String City,String State,String Zip_Code,String Country,String Contact_Name,String Phone_type,String Phone_Number,String Contact_Email,String UCC_Number,String UCC_Date,String Company_Type,String Advance_rate,String Fee_Calculated_On,String Fee1_Days_From,String Fee1_Days_To,String Fee1_percent,String max_fee,String Fee2_Days_From,String Fee2_Days_To,String Fee2_Percentage,String Fee3DaysFrom,String Fee3DaysTo,String Fee3Percentage,String Fee4DaysFrom,String Fee4DaysTo,String Fee4Percentage) throws InterruptedException{
		
		ExtentTestManager.getTest().getTest().setName("Multiple Client creation test script factoring: FNBGriffin");
        ExtentTestManager.getTest().assignCategory("Module:Factoring");
	
       //Step 1: navigate to client creation page
        FactoringClientCreationPage fact = cyncHomePage.getCyncMenus().openFactoringClientCreation();
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully navigated to Create Factoring Client Page");
        
        //Step 2: add value to client name
        Assert.assertTrue(fact.addValueToClientnameTextBox(client_name));
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully entered client name");
        
        //step 3: add value to short name
        Assert.assertEquals(fact.addValueToShortClientnameTextBox(Short_Name),Short_Name);
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully entered client short name");
        
        //step 4: add value to client number
        Assert.assertEquals(fact.addValueToClientNumTextBox(client_no), client_no);
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully entered Client number");
        
        //step 5: add Manager
        Assert.assertTrue(fact.ManagerCheckBox());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully selected manager");
        	
        //step 6:Enter data in Credit Line amount field
        Assert.assertTrue(fact.addValueToCreditLine(Credit_Line_Amount));
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully Entered Credit Line data");
       
        //step 7:ClickonSave
        
        Assert.assertTrue(fact.SaveBTNClick());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully Entered Credit Line data");
        
        
        //*************OPEN MAIL ADDRESS PAGE AND ENTER DATA
        
        
        //step 8:Navigate to Mail Address Page
        MailAddressPageFactoring mailaddress=cyncHomePage.getCyncMenus().openMailAddressPageFactoring();
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully navigated to Mail Address Page");
        
        //step 9:Click on New Address Button
        Assert.assertTrue(mailaddress.NewBTNClick());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked new address");
        Thread.sleep(1000);
        //step 10:Select Primary Address Check box
        Assert.assertTrue(mailaddress.CheckOnPrimaryAddressCheckBox());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully checked primary address check box");
        
        //step 11:Enter Data in Address Name field Note:City name ll be enter as Address name
        Assert.assertTrue(mailaddress.addValuesToAddressNameTextBox(City));
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully checked primary address check box");
        
        //step 12:Enter Data in Contact Name field
        Assert.assertTrue(mailaddress.addValuesToContactNameTextBox(Contact_Name));
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully checked primary address check box");
        
        //step 13:Enter Data To Street Address filed
        Assert.assertTrue(mailaddress.addValuesToStreetAddressBox(Street_Address));
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully checked primary address check box");
      
        //step 14:Enter City field
        Assert.assertTrue(mailaddress.addValuesToCityBox(City));
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully checked primary address check box");
       
        //step 15:Select Country from drop down
        Assert.assertTrue(mailaddress.SelectCountryFromDropDown(Country));
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully checked primary address check box");
      
        //step 16:Enter State field
        Assert.assertTrue(mailaddress.SelectStateProvinceDropdown(State));
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully checked primary address check box");
       
        //step 17:Enter ZipCode
        Assert.assertTrue(mailaddress.addValuesToZipCode(Zip_Code));
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully checked primary address check box");
       
        //step 18:Select data in Phone Type
        Assert.assertTrue(mailaddress.SelectPhoneType(Phone_type));
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully checked primary address check box");
       
        //step 19:Enter data in phone field
        Assert.assertTrue(mailaddress.addValuesTophoneNumberBox(Phone_Number));
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully checked primary address check box");
        
        Thread.sleep(500);
        //step 20: click on save button
        Assert.assertTrue(mailaddress.SaveBTNClick());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully checked primary address check box");
       
        //step 21:
       
        this.isAlertPresent();
        
        //*********///OPEN CONTACTS PAGE AND FILL THE DATA
        
      Thread.sleep(1000);
        
        ContactsPageFactoring contactfact=cyncHomePage.getCyncMenus().openContactsPageFactoring();
        ExtentTestManager.getTest().log(LogStatus.PASS, "Sucessfully Navigated to Contact Page");
        
        //step 22:Click on New Contact Button
        Assert.assertTrue(contactfact.NewBTNClick());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfuly clicked on ");
        
        //step 23:Enter Data in Contact Name field
        Assert.assertTrue(contactfact.addValuesToContactNameTextBox(Contact_Name));
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfuly clicked on ");
        
        //step 24:Enter Data in Email field
        Assert.assertTrue(contactfact.addValuesToEmailTextBox(Contact_Email));
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfuly clicked on ");
        Thread.sleep(500);
        //step 25:Select data from mailing address drop down
        Assert.assertTrue(contactfact.SelectMaillingAddressDropdown());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfuly clicked on ");
        
        //step 26:Select Phone Type from drop dowwn
        Assert.assertTrue(contactfact.SelectPhoneType(Phone_type));
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfuly clicked on ");
        
        //step 27:Enter Data in Phone No field
        Assert.assertTrue(contactfact.addValuesTophoneNumberBox(Phone_Number));
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfuly clicked on ");
        
        //step 28:Click on Save Button
        Assert.assertTrue(contactfact.SaveBTNClick());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfuly clicked on ");
        
        
        //*********//// NAVIGATE TO BASIC PARAMETER SCREEN AND ASSIGN INVOICE VALIDATION TEMPLATE
        
        //step 29: navigate to Basic Parameters screen
        BasicParametersPageFactoring basic = cyncHomePage.getCyncMenus().openBasicparameterFactoring();
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully navigated to Basic Parameters Page");
        
        //step 30: click on edit button
        Assert.assertTrue(basic.ClickOnEditBTN());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked on edit button");
        
        //step 31: select invoice validation template from drop down
        String tempname="default";
        Assert.assertTrue(basic.selectInvValTemp(tempname));
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully selected invoice validation template from dropdown");
        
        //step 32: click on save button
        Assert.assertTrue(basic.ClickOnSaveBTN());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully saved basic paramters changes");
        
        
        //********** NAVIGATING TO FACTORING FEE SET UP PAGE AND FILL THE DATA         //
     
        //step 33: navigate to Fee setup page
        FactoringFeeSetupPage fact1 = cyncHomePage.getCyncMenus().openFactoringFeeSetup();
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully navigated to Factoring Fee Setup Page");
        
        //step 34: click on edit button
        Assert.assertTrue(fact1.EditBTNClick());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked on Edit button");
       
        //step 35: add value to advance rate
        Assert.assertEquals(fact1.addValueToAdvanceRateTextBox(Advance_rate),Advance_rate);
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully entered advance rate");
          
        //step 36:add button click
        
        Assert.assertTrue(fact1.AddBTNClick());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked on Add button"); 
        
        //step 37: add value to Tier1 days to
        Assert.assertEquals(fact1.addValueToTier1DaysTo(Fee1_Days_To),Fee1_Days_To);
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully entered Tier1 Days To");
        
        //step 38: add value to Tier1 total Fee
        Assert.assertEquals(fact1.addValueToTier1TotalFee(Fee1_percent),Fee1_percent);
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully entered Tier2 Total Fee");
        
        //step 39: add value to Maximum fee %
       
        Assert.assertEquals(fact1.addValueToMaximumFeeTextBox(max_fee),max_fee);
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully entered maximum fee");
        
        //step 40: click on save button
        Thread.sleep(1000);
        Assert.assertTrue(fact1.SaveBTNClick());
        //fact1.SaveBTNClick();
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked on Save button"); 
        Thread.sleep(4000);
       
	}
	
	@Test(dataProvider = "AndersonDebtorTemplate", groups = { TestGroups.SMOKE,
			TestGroups.REGRESSION }, testName = "Account Debtor Creation")

	public void TC_02_Anderson_DebtorCreation(String AccountNo,String AccountName,String LinkedClient,String ContactName,String ContactPhoneNo,String ContactEmail,String ContactDepartment,String ContactTitle,String AddressType,String StreetAddress,String City,String State,String Zip,String Country,String CreditLimit,String CreditRating,String CreditRatingExpiryDate, String PaymentTerms) throws AWTException, InterruptedException{
		
		ExtentTestManager.getTest().getTest().setName("Multiple Client creation test script factoring: FNBGriffin");
        ExtentTestManager.getTest().assignCategory("Module:Factoring");
        
	    String client_name1="Anderson Forklift Supply Inc";
        cyncHomePage.getCyncMenus().selectClientFromDropDown(client_name1);
        
        
      //step1: navigate to Account Debtor screen
        AccountDebtorPage debtor = cyncHomePage.getCyncMenus().openAccountDebtorPage();
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully navigated to Account Debtor Page");
        
        //step2: click on New Account debtor button
        Assert.assertTrue(debtor.ClickNewAccDebtorBTN());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked on New Account Debtor button"); 
        
        //step3: add value to Account name 
        Assert.assertEquals(debtor.addValuesToAccName(AccountName),AccountName);
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully entered Account name"); 
        
        //step4: add value to Account no
        Assert.assertEquals(debtor.addValuesToAccNo(AccountNo),AccountNo);
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully entered Account number");
        
        //step5: select verification mode from dropdown
        String verificationmode="Call";
        Assert.assertTrue(debtor.SelectVerificationMode(verificationmode));
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfuly selected verification mode from dropdown");
        
        //step scroll down 
        debtor.Scrolldown();
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully scroll down");
     
        //step6: select client from drop down
        
        Assert.assertTrue(debtor.selectClientFromDropDown(client_name1));
      //  Assert.assertTrue(debtor.selectClientFromDropDown("AUTOSANFACTOR15"));
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully selected client from drop down");
  
        
        //step7: check on primary contact check box
        Assert.assertTrue(debtor.CheckOnPrimaryCheckBox());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully checked on primary check box");
        
        //step8: add value to Contact name text box
        Assert.assertTrue(debtor.addValuesToContactNameTextBox(ContactName));
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully entered contact name in text box");
        
        //step9: add value to phone no text box
        Assert.assertTrue(debtor.addValuesToPhoneNoTextBox(ContactPhoneNo));
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully entered phone no in text box");
        
        //step12: add value to email text box
        //  Assert.assertTrue(debtor.addValuesToEmailTextBox(email));
        // ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully enetered email in text box");
        
        //step13: click on save button
        Assert.assertTrue(debtor.ClickOnSaveBTN());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked on Save button");
        
        
        //step15: click on close button
        Assert.assertTrue(debtor.ClickOnMsgCloseBTN());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked on Close button");
        
        //step16: click on back to main page button
        
        Assert.assertTrue(debtor.ClickBackToMainPage());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked on Back to Main page button");
        
        Thread.sleep(1000);
        //step17: verifying Account name hyper link
       // Assert.assertTrue(debtor.ClickAccNameHyperLink());
       // ExtentTestManager.getTest().log(LogStatus.PASS, "Verified Account name hyperlink after debtor creation");
        
        //step18: close the pop up
        /*Assert.assertTrue(debtor.ClickOnPopupCloseBTN());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully closed the popup");*/
	}
	
	///************////
	 
	@Test(dataProvider = "Cranford Debtor Template", groups = { TestGroups.SMOKE,
			TestGroups.REGRESSION }, testName = "Account Debtor Creation")

	public void TC_03_Cranford_AccountDebtorCreation(String client_name,String AccountNo,String AccountName,String LinkedClient,String ContactName,String ContactPhoneNo,String ContactEmail,String ContactDepartment,String ContactTitle,String AddressType,String StreetAddress,String City,String State,String Zip,String Country,String CreditLimit,String CreditRating,String CreditRatingExpiryDate, String PaymentTerms) throws AWTException{
		
		ExtentTestManager.getTest().getTest().setName("Multiple Client creation test script factoring: FNBGriffin");
        ExtentTestManager.getTest().assignCategory("Module:Factoring");
	
        cyncHomePage.getCyncMenus().selectClientFromDropDown(client_name);
        
        
      //step1: navigate to Account Debtor screen
        AccountDebtorPage debtor = cyncHomePage.getCyncMenus().openAccountDebtorPage();
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully navigated to Account Debtor Page");
        
        //step2: click on New Account debtor button
        Assert.assertTrue(debtor.ClickNewAccDebtorBTN());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked on New Account Debtor button"); 
        
        //step3: add value to Account name 
        Assert.assertEquals(debtor.addValuesToAccName(AccountName),AccountName);
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully entered Account name"); 
        
        //step4: add value to Account no
        Assert.assertEquals(debtor.addValuesToAccNo(AccountNo),AccountNo);
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully entered Account number");
        
        //step5: select verification mode from dropdown
        String verificationmode="Call";
        Assert.assertTrue(debtor.SelectVerificationMode(verificationmode));
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfuly selected verification mode from dropdown");
        
        //step scroll down 
        debtor.Scrolldown();
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully scroll down");
     
        //step6: select client from drop down
        
        Assert.assertTrue(debtor.selectClientFromDropDown(client_name));
      //  Assert.assertTrue(debtor.selectClientFromDropDown("AUTOSANFACTOR15"));
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully selected client from drop down");
  
        
        //step7: check on primary contact check box
        Assert.assertTrue(debtor.CheckOnPrimaryCheckBox());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully checked on primary check box");
        
        //step8: add value to Contact name text box
        Assert.assertTrue(debtor.addValuesToContactNameTextBox(ContactName));
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully entered contact name in text box");
        
        //step9: add value to phone no text box
        Assert.assertTrue(debtor.addValuesToPhoneNoTextBox(ContactPhoneNo));
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully entered phone no in text box");
        
        //step12: add value to email text box
        //  Assert.assertTrue(debtor.addValuesToEmailTextBox(email));
        // ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully enetered email in text box");
        
        //step13: click on save button
        Assert.assertTrue(debtor.ClickOnSaveBTN());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked on Save button");
        
        
        //step15: click on close button
        Assert.assertTrue(debtor.ClickOnMsgCloseBTN());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked on Close button");
        
        //step16: click on back to main page button
        
        Assert.assertTrue(debtor.ClickBackToMainPage());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked on Back to Main page button");
        
        //step17: verifying Account name hyper link
       // Assert.assertTrue(debtor.ClickAccNameHyperLink());
       // ExtentTestManager.getTest().log(LogStatus.PASS, "Verified Account name hyperlink after debtor creation");
        
        //step18: close the pop up
        Assert.assertTrue(debtor.ClickOnPopupCloseBTN());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully closed the popup");
	}
	
	@Test(dataProvider = "Enviro Debtor Template", groups = { TestGroups.SMOKE,
			TestGroups.REGRESSION }, testName = "Account Debtor Creation")

	public void TC_04_Enviro_DebtorCreation(String client_name,String AccountNo,String AccountName,String LinkedClient,String ContactName,String ContactPhoneNo,String ContactEmail,String ContactDepartment,String ContactTitle,String AddressType,String StreetAddress,String City,String State,String Zip,String Country,String CreditLimit,String CreditRating,String CreditRatingExpiryDate, String PaymentTerms) throws AWTException{
		
		ExtentTestManager.getTest().getTest().setName("Multiple Client creation test script factoring: FNBGriffin");
        ExtentTestManager.getTest().assignCategory("Module:Factoring");
	
        cyncHomePage.getCyncMenus().selectClientFromDropDown(client_name);
        
        
      //step1: navigate to Account Debtor screen
        AccountDebtorPage debtor = cyncHomePage.getCyncMenus().openAccountDebtorPage();
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully navigated to Account Debtor Page");
        
        //step2: click on New Account debtor button
        Assert.assertTrue(debtor.ClickNewAccDebtorBTN());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked on New Account Debtor button"); 
        
        //step3: add value to Account name 
        Assert.assertEquals(debtor.addValuesToAccName(AccountName),AccountName);
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully entered Account name"); 
        
        //step4: add value to Account no
        Assert.assertEquals(debtor.addValuesToAccNo(AccountNo),AccountNo);
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully entered Account number");
        
        //step5: select verification mode from dropdown
        String verificationmode="Call";
        Assert.assertTrue(debtor.SelectVerificationMode(verificationmode));
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfuly selected verification mode from dropdown");
        
        //step scroll down 
        debtor.Scrolldown();
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully scroll down");
     
        //step6: select client from drop down
        
        Assert.assertTrue(debtor.selectClientFromDropDown(client_name));
      //  Assert.assertTrue(debtor.selectClientFromDropDown("AUTOSANFACTOR15"));
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully selected client from drop down");
  
        
        //step7: check on primary contact check box
        Assert.assertTrue(debtor.CheckOnPrimaryCheckBox());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully checked on primary check box");
        
        //step8: add value to Contact name text box
        Assert.assertTrue(debtor.addValuesToContactNameTextBox(ContactName));
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully entered contact name in text box");
        
        //step9: add value to phone no text box
        Assert.assertTrue(debtor.addValuesToPhoneNoTextBox(ContactPhoneNo));
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully entered phone no in text box");
        
        //step12: add value to email text box
        //  Assert.assertTrue(debtor.addValuesToEmailTextBox(email));
        // ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully enetered email in text box");
        
        //step13: click on save button
        Assert.assertTrue(debtor.ClickOnSaveBTN());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked on Save button");
        
        
        //step15: click on close button
        Assert.assertTrue(debtor.ClickOnMsgCloseBTN());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked on Close button");
        
        //step16: click on back to main page button
        
        Assert.assertTrue(debtor.ClickBackToMainPage());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked on Back to Main page button");
        
        //step17: verifying Account name hyper link
       // Assert.assertTrue(debtor.ClickAccNameHyperLink());
       // ExtentTestManager.getTest().log(LogStatus.PASS, "Verified Account name hyperlink after debtor creation");
        
        //step18: close the pop up
        Assert.assertTrue(debtor.ClickOnPopupCloseBTN());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully closed the popup");
	}
	@Test(dataProvider = "Expedited Debtor Template", groups = { TestGroups.SMOKE,
			TestGroups.REGRESSION }, testName = "Account Debtor Creation")

	public void TC_05_Expedited_DebtorCreation(String client_name,String AccountNo,String AccountName,String LinkedClient,String ContactName,String ContactPhoneNo,String ContactEmail,String ContactDepartment,String ContactTitle,String AddressType,String StreetAddress,String City,String State,String Zip,String Country,String CreditLimit,String CreditRating,String CreditRatingExpiryDate, String PaymentTerms) throws AWTException{
		
		ExtentTestManager.getTest().getTest().setName("Multiple Client creation test script factoring: FNBGriffin");
        ExtentTestManager.getTest().assignCategory("Module:Factoring");
	
        cyncHomePage.getCyncMenus().selectClientFromDropDown(client_name);
        
        
      //step1: navigate to Account Debtor screen
        AccountDebtorPage debtor = cyncHomePage.getCyncMenus().openAccountDebtorPage();
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully navigated to Account Debtor Page");
        
        //step2: click on New Account debtor button
        Assert.assertTrue(debtor.ClickNewAccDebtorBTN());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked on New Account Debtor button"); 
        
        //step3: add value to Account name 
        Assert.assertEquals(debtor.addValuesToAccName(AccountName),AccountName);
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully entered Account name"); 
        
        //step4: add value to Account no
        Assert.assertEquals(debtor.addValuesToAccNo(AccountNo),AccountNo);
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully entered Account number");
        
        //step5: select verification mode from dropdown
        String verificationmode="Call";
        Assert.assertTrue(debtor.SelectVerificationMode(verificationmode));
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfuly selected verification mode from dropdown");
        
        //step scroll down 
        debtor.Scrolldown();
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully scroll down");
     
        //step6: select client from drop down
        
        Assert.assertTrue(debtor.selectClientFromDropDown(client_name));
      //  Assert.assertTrue(debtor.selectClientFromDropDown("AUTOSANFACTOR15"));
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully selected client from drop down");
  
        
        //step7: check on primary contact check box
        Assert.assertTrue(debtor.CheckOnPrimaryCheckBox());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully checked on primary check box");
        
        //step8: add value to Contact name text box
        Assert.assertTrue(debtor.addValuesToContactNameTextBox(ContactName));
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully entered contact name in text box");
        
        //step9: add value to phone no text box
        Assert.assertTrue(debtor.addValuesToPhoneNoTextBox(ContactPhoneNo));
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully entered phone no in text box");
        
        //step12: add value to email text box
        //  Assert.assertTrue(debtor.addValuesToEmailTextBox(email));
        // ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully enetered email in text box");
        
        //step13: click on save button
        Assert.assertTrue(debtor.ClickOnSaveBTN());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked on Save button");
        
        
        //step15: click on close button
        Assert.assertTrue(debtor.ClickOnMsgCloseBTN());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked on Close button");
        
        //step16: click on back to main page button
        
        Assert.assertTrue(debtor.ClickBackToMainPage());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked on Back to Main page button");
        
        //step17: verifying Account name hyper link
       // Assert.assertTrue(debtor.ClickAccNameHyperLink());
       // ExtentTestManager.getTest().log(LogStatus.PASS, "Verified Account name hyperlink after debtor creation");
        
        //step18: close the pop up
        Assert.assertTrue(debtor.ClickOnPopupCloseBTN());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully closed the popup");
	}
	@Test(dataProvider = "Gilbert Debtor Template", groups = { TestGroups.SMOKE,
			TestGroups.REGRESSION }, testName = "Account Debtor Creation")

	public void TC_06_Glibert_DebtorCreation(String client_name,String AccountNo,String AccountName,String LinkedClient,String ContactName,String ContactPhoneNo,String ContactEmail,String ContactDepartment,String ContactTitle,String AddressType,String StreetAddress,String City,String State,String Zip,String Country,String CreditLimit,String CreditRating,String CreditRatingExpiryDate, String PaymentTerms) throws AWTException{
		
		ExtentTestManager.getTest().getTest().setName("Multiple Client creation test script factoring: FNBGriffin");
        ExtentTestManager.getTest().assignCategory("Module:Factoring");
	
        cyncHomePage.getCyncMenus().selectClientFromDropDown(client_name);
        
        
      //step1: navigate to Account Debtor screen
        AccountDebtorPage debtor = cyncHomePage.getCyncMenus().openAccountDebtorPage();
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully navigated to Account Debtor Page");
        
        //step2: click on New Account debtor button
        Assert.assertTrue(debtor.ClickNewAccDebtorBTN());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked on New Account Debtor button"); 
        
        //step3: add value to Account name 
        Assert.assertEquals(debtor.addValuesToAccName(AccountName),AccountName);
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully entered Account name"); 
        
        //step4: add value to Account no
        Assert.assertEquals(debtor.addValuesToAccNo(AccountNo),AccountNo);
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully entered Account number");
        
        //step5: select verification mode from dropdown
        String verificationmode="Call";
        Assert.assertTrue(debtor.SelectVerificationMode(verificationmode));
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfuly selected verification mode from dropdown");
        
        //step scroll down 
        debtor.Scrolldown();
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully scroll down");
     
        //step6: select client from drop down
        
        Assert.assertTrue(debtor.selectClientFromDropDown(client_name));
      //  Assert.assertTrue(debtor.selectClientFromDropDown("AUTOSANFACTOR15"));
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully selected client from drop down");
  
        
        //step7: check on primary contact check box
        Assert.assertTrue(debtor.CheckOnPrimaryCheckBox());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully checked on primary check box");
        
        //step8: add value to Contact name text box
        Assert.assertTrue(debtor.addValuesToContactNameTextBox(ContactName));
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully entered contact name in text box");
        
        //step9: add value to phone no text box
        Assert.assertTrue(debtor.addValuesToPhoneNoTextBox(ContactPhoneNo));
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully entered phone no in text box");
        
        //step12: add value to email text box
        //  Assert.assertTrue(debtor.addValuesToEmailTextBox(email));
        // ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully enetered email in text box");
        
        //step13: click on save button
        Assert.assertTrue(debtor.ClickOnSaveBTN());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked on Save button");
        
        
        //step15: click on close button
        Assert.assertTrue(debtor.ClickOnMsgCloseBTN());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked on Close button");
        
        //step16: click on back to main page button
        
        Assert.assertTrue(debtor.ClickBackToMainPage());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked on Back to Main page button");
        
        //step17: verifying Account name hyper link
       // Assert.assertTrue(debtor.ClickAccNameHyperLink());
       // ExtentTestManager.getTest().log(LogStatus.PASS, "Verified Account name hyperlink after debtor creation");
        
        //step18: close the pop up
        Assert.assertTrue(debtor.ClickOnPopupCloseBTN());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully closed the popup");
	}
	@Test(dataProvider = "Logistic Debtor Template", groups = { TestGroups.SMOKE,
			TestGroups.REGRESSION }, testName = "Account Debtor Creation")

	public void TC_07_Logistic_DebtorCreation(String client_name,String AccountNo,String AccountName,String LinkedClient,String ContactName,String ContactPhoneNo,String ContactEmail,String ContactDepartment,String ContactTitle,String AddressType,String StreetAddress,String City,String State,String Zip,String Country,String CreditLimit,String CreditRating,String CreditRatingExpiryDate, String PaymentTerms) throws AWTException{
		
		ExtentTestManager.getTest().getTest().setName("Multiple Client creation test script factoring: FNBGriffin");
        ExtentTestManager.getTest().assignCategory("Module:Factoring");
	
        cyncHomePage.getCyncMenus().selectClientFromDropDown(client_name);
        
        
      //step1: navigate to Account Debtor screen
        AccountDebtorPage debtor = cyncHomePage.getCyncMenus().openAccountDebtorPage();
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully navigated to Account Debtor Page");
        
        //step2: click on New Account debtor button
        Assert.assertTrue(debtor.ClickNewAccDebtorBTN());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked on New Account Debtor button"); 
        
        //step3: add value to Account name 
        Assert.assertEquals(debtor.addValuesToAccName(AccountName),AccountName);
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully entered Account name"); 
        
        //step4: add value to Account no
        Assert.assertEquals(debtor.addValuesToAccNo(AccountNo),AccountNo);
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully entered Account number");
        
        //step5: select verification mode from dropdown
        String verificationmode="Call";
        Assert.assertTrue(debtor.SelectVerificationMode(verificationmode));
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfuly selected verification mode from dropdown");
        
        //step scroll down 
        debtor.Scrolldown();
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully scroll down");
     
        //step6: select client from drop down
        
        Assert.assertTrue(debtor.selectClientFromDropDown(client_name));
      //  Assert.assertTrue(debtor.selectClientFromDropDown("AUTOSANFACTOR15"));
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully selected client from drop down");
  
        
        //step7: check on primary contact check box
        Assert.assertTrue(debtor.CheckOnPrimaryCheckBox());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully checked on primary check box");
        
        //step8: add value to Contact name text box
        Assert.assertTrue(debtor.addValuesToContactNameTextBox(ContactName));
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully entered contact name in text box");
        
        //step9: add value to phone no text box
        Assert.assertTrue(debtor.addValuesToPhoneNoTextBox(ContactPhoneNo));
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully entered phone no in text box");
        
        //step12: add value to email text box
        //  Assert.assertTrue(debtor.addValuesToEmailTextBox(email));
        // ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully enetered email in text box");
        
        //step13: click on save button
        Assert.assertTrue(debtor.ClickOnSaveBTN());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked on Save button");
        
        
        //step15: click on close button
        Assert.assertTrue(debtor.ClickOnMsgCloseBTN());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked on Close button");
        
        //step16: click on back to main page button
        
        Assert.assertTrue(debtor.ClickBackToMainPage());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked on Back to Main page button");
        
        //step17: verifying Account name hyper link
       // Assert.assertTrue(debtor.ClickAccNameHyperLink());
       // ExtentTestManager.getTest().log(LogStatus.PASS, "Verified Account name hyperlink after debtor creation");
        
        //step18: close the pop up
        Assert.assertTrue(debtor.ClickOnPopupCloseBTN());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully closed the popup");
	}
	
	@Test(dataProvider = "P&P Debtor Template", groups = { TestGroups.SMOKE,
			TestGroups.REGRESSION }, testName = "Account Debtor Creation")

	public void TC_08_PandP_DebtorCreation(String client_name,String AccountNo,String AccountName,String LinkedClient,String ContactName,String ContactPhoneNo,String ContactEmail,String ContactDepartment,String ContactTitle,String AddressType,String StreetAddress,String City,String State,String Zip,String Country,String CreditLimit,String CreditRating,String CreditRatingExpiryDate, String PaymentTerms) throws AWTException{
		
		ExtentTestManager.getTest().getTest().setName("Multiple Client creation test script factoring: FNBGriffin");
        ExtentTestManager.getTest().assignCategory("Module:Factoring");
	
        cyncHomePage.getCyncMenus().selectClientFromDropDown(client_name);
        
        
      //step1: navigate to Account Debtor screen
        AccountDebtorPage debtor = cyncHomePage.getCyncMenus().openAccountDebtorPage();
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully navigated to Account Debtor Page");
        
        //step2: click on New Account debtor button
        Assert.assertTrue(debtor.ClickNewAccDebtorBTN());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked on New Account Debtor button"); 
        
        //step3: add value to Account name 
        Assert.assertEquals(debtor.addValuesToAccName(AccountName),AccountName);
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully entered Account name"); 
        
        //step4: add value to Account no
        Assert.assertEquals(debtor.addValuesToAccNo(AccountNo),AccountNo);
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully entered Account number");
        
        //step5: select verification mode from dropdown
        String verificationmode="Call";
        Assert.assertTrue(debtor.SelectVerificationMode(verificationmode));
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfuly selected verification mode from dropdown");
        
        //step scroll down 
        debtor.Scrolldown();
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully scroll down");
     
        //step6: select client from drop down
        
        Assert.assertTrue(debtor.selectClientFromDropDown(client_name));
      //  Assert.assertTrue(debtor.selectClientFromDropDown("AUTOSANFACTOR15"));
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully selected client from drop down");
  
        
        //step7: check on primary contact check box
        Assert.assertTrue(debtor.CheckOnPrimaryCheckBox());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully checked on primary check box");
        
        //step8: add value to Contact name text box
        Assert.assertTrue(debtor.addValuesToContactNameTextBox(ContactName));
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully entered contact name in text box");
        
        //step9: add value to phone no text box
        Assert.assertTrue(debtor.addValuesToPhoneNoTextBox(ContactPhoneNo));
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully entered phone no in text box");
        
        //step12: add value to email text box
        //  Assert.assertTrue(debtor.addValuesToEmailTextBox(email));
        // ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully enetered email in text box");
        
        //step13: click on save button
        Assert.assertTrue(debtor.ClickOnSaveBTN());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked on Save button");
        
        
        //step15: click on close button
        Assert.assertTrue(debtor.ClickOnMsgCloseBTN());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked on Close button");
        
        //step16: click on back to main page button
        
        Assert.assertTrue(debtor.ClickBackToMainPage());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked on Back to Main page button");
        
        //step17: verifying Account name hyper link
       // Assert.assertTrue(debtor.ClickAccNameHyperLink());
       // ExtentTestManager.getTest().log(LogStatus.PASS, "Verified Account name hyperlink after debtor creation");
        
        //step18: close the pop up
        Assert.assertTrue(debtor.ClickOnPopupCloseBTN());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully closed the popup");
	}
	@Test(dataProvider = "Power Debtor Template", groups = { TestGroups.SMOKE,
			TestGroups.REGRESSION }, testName = "Account Debtor Creation")

	public void TC_09_Power_DebtorCreation(String client_name,String AccountNo,String AccountName,String LinkedClient,String ContactName,String ContactPhoneNo,String ContactEmail,String ContactDepartment,String ContactTitle,String AddressType,String StreetAddress,String City,String State,String Zip,String Country,String CreditLimit,String CreditRating,String CreditRatingExpiryDate, String PaymentTerms) throws AWTException{
		
		ExtentTestManager.getTest().getTest().setName("Multiple Client creation test script factoring: FNBGriffin");
        ExtentTestManager.getTest().assignCategory("Module:Factoring");
	
        cyncHomePage.getCyncMenus().selectClientFromDropDown(client_name);
        
        
      //step1: navigate to Account Debtor screen
        AccountDebtorPage debtor = cyncHomePage.getCyncMenus().openAccountDebtorPage();
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully navigated to Account Debtor Page");
        
        //step2: click on New Account debtor button
        Assert.assertTrue(debtor.ClickNewAccDebtorBTN());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked on New Account Debtor button"); 
        
        //step3: add value to Account name 
        Assert.assertEquals(debtor.addValuesToAccName(AccountName),AccountName);
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully entered Account name"); 
        
        //step4: add value to Account no
        Assert.assertEquals(debtor.addValuesToAccNo(AccountNo),AccountNo);
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully entered Account number");
        
        //step5: select verification mode from dropdown
        String verificationmode="Call";
        Assert.assertTrue(debtor.SelectVerificationMode(verificationmode));
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfuly selected verification mode from dropdown");
        
        //step scroll down 
        debtor.Scrolldown();
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully scroll down");
     
        //step6: select client from drop down
        
        Assert.assertTrue(debtor.selectClientFromDropDown(client_name));
      //  Assert.assertTrue(debtor.selectClientFromDropDown("AUTOSANFACTOR15"));
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully selected client from drop down");
  
        
        //step7: check on primary contact check box
        Assert.assertTrue(debtor.CheckOnPrimaryCheckBox());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully checked on primary check box");
        
        //step8: add value to Contact name text box
        Assert.assertTrue(debtor.addValuesToContactNameTextBox(ContactName));
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully entered contact name in text box");
        
        //step9: add value to phone no text box
        Assert.assertTrue(debtor.addValuesToPhoneNoTextBox(ContactPhoneNo));
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully entered phone no in text box");
        
        //step12: add value to email text box
        //  Assert.assertTrue(debtor.addValuesToEmailTextBox(email));
        // ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully enetered email in text box");
        
        //step13: click on save button
        Assert.assertTrue(debtor.ClickOnSaveBTN());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked on Save button");
        
        
        //step15: click on close button
        Assert.assertTrue(debtor.ClickOnMsgCloseBTN());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked on Close button");
        
        //step16: click on back to main page button
        
        Assert.assertTrue(debtor.ClickBackToMainPage());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked on Back to Main page button");
        
        //step17: verifying Account name hyper link
       // Assert.assertTrue(debtor.ClickAccNameHyperLink());
       // ExtentTestManager.getTest().log(LogStatus.PASS, "Verified Account name hyperlink after debtor creation");
        
        //step18: close the pop up
        Assert.assertTrue(debtor.ClickOnPopupCloseBTN());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully closed the popup");
	}
	
	@Test(dataProvider = "R&R Debtor Template", groups = { TestGroups.SMOKE,
			TestGroups.REGRESSION }, testName = "Account Debtor Creation")

	public void TC_10_RandR_DebtorCreation(String client_name,String AccountNo,String AccountName,String LinkedClient,String ContactName,String ContactPhoneNo,String ContactEmail,String ContactDepartment,String ContactTitle,String AddressType,String StreetAddress,String City,String State,String Zip,String Country,String CreditLimit,String CreditRating,String CreditRatingExpiryDate, String PaymentTerms) throws AWTException{
		
		ExtentTestManager.getTest().getTest().setName("Multiple Client creation test script factoring: FNBGriffin");
        ExtentTestManager.getTest().assignCategory("Module:Factoring");
	
        cyncHomePage.getCyncMenus().selectClientFromDropDown(client_name);
        
        
      //step1: navigate to Account Debtor screen
        AccountDebtorPage debtor = cyncHomePage.getCyncMenus().openAccountDebtorPage();
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully navigated to Account Debtor Page");
        
        //step2: click on New Account debtor button
        Assert.assertTrue(debtor.ClickNewAccDebtorBTN());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked on New Account Debtor button"); 
        
        //step3: add value to Account name 
        Assert.assertEquals(debtor.addValuesToAccName(AccountName),AccountName);
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully entered Account name"); 
        
        //step4: add value to Account no
        Assert.assertEquals(debtor.addValuesToAccNo(AccountNo),AccountNo);
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully entered Account number");
        
        //step5: select verification mode from dropdown
        String verificationmode="Call";
        Assert.assertTrue(debtor.SelectVerificationMode(verificationmode));
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfuly selected verification mode from dropdown");
        
        //step scroll down 
        debtor.Scrolldown();
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully scroll down");
     
        //step6: select client from drop down
        
        Assert.assertTrue(debtor.selectClientFromDropDown(client_name));
      //  Assert.assertTrue(debtor.selectClientFromDropDown("AUTOSANFACTOR15"));
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully selected client from drop down");
  
        
        //step7: check on primary contact check box
        Assert.assertTrue(debtor.CheckOnPrimaryCheckBox());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully checked on primary check box");
        
        //step8: add value to Contact name text box
        Assert.assertTrue(debtor.addValuesToContactNameTextBox(ContactName));
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully entered contact name in text box");
        
        //step9: add value to phone no text box
        Assert.assertTrue(debtor.addValuesToPhoneNoTextBox(ContactPhoneNo));
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully entered phone no in text box");
        
        //step12: add value to email text box
        //  Assert.assertTrue(debtor.addValuesToEmailTextBox(email));
        // ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully enetered email in text box");
        
        //step13: click on save button
        Assert.assertTrue(debtor.ClickOnSaveBTN());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked on Save button");
        
        
        //step15: click on close button
        Assert.assertTrue(debtor.ClickOnMsgCloseBTN());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked on Close button");
        
        //step16: click on back to main page button
        
        Assert.assertTrue(debtor.ClickBackToMainPage());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked on Back to Main page button");
        
        //step17: verifying Account name hyper link
       // Assert.assertTrue(debtor.ClickAccNameHyperLink());
       // ExtentTestManager.getTest().log(LogStatus.PASS, "Verified Account name hyperlink after debtor creation");
        
        //step18: close the pop up
        Assert.assertTrue(debtor.ClickOnPopupCloseBTN());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully closed the popup");
	}
	
	@Test(dataProvider = "Trans Debtor Template", groups = { TestGroups.SMOKE,
			TestGroups.REGRESSION }, testName = "Account Debtor Creation")

	public void TC_11_Trans_AccountDebtorCreation(String client_name,String AccountNo,String AccountName,String LinkedClient,String ContactName,String ContactPhoneNo,String ContactEmail,String ContactDepartment,String ContactTitle,String AddressType,String StreetAddress,String City,String State,String Zip,String Country,String CreditLimit,String CreditRating,String CreditRatingExpiryDate, String PaymentTerms) throws AWTException{
		
		ExtentTestManager.getTest().getTest().setName("Multiple Client creation test script factoring: FNBGriffin");
        ExtentTestManager.getTest().assignCategory("Module:Factoring");
	
        cyncHomePage.getCyncMenus().selectClientFromDropDown(client_name);
        
        
      //step1: navigate to Account Debtor screen
        AccountDebtorPage debtor = cyncHomePage.getCyncMenus().openAccountDebtorPage();
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully navigated to Account Debtor Page");
        
        //step2: click on New Account debtor button
        Assert.assertTrue(debtor.ClickNewAccDebtorBTN());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked on New Account Debtor button"); 
        
        //step3: add value to Account name 
        Assert.assertEquals(debtor.addValuesToAccName(AccountName),AccountName);
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully entered Account name"); 
        
        //step4: add value to Account no
        Assert.assertEquals(debtor.addValuesToAccNo(AccountNo),AccountNo);
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully entered Account number");
        
        //step5: select verification mode from dropdown
        String verificationmode="Call";
        Assert.assertTrue(debtor.SelectVerificationMode(verificationmode));
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfuly selected verification mode from dropdown");
        
        //step scroll down 
        debtor.Scrolldown();
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully scroll down");
     
        //step6: select client from drop down
        
        Assert.assertTrue(debtor.selectClientFromDropDown(client_name));
      //  Assert.assertTrue(debtor.selectClientFromDropDown("AUTOSANFACTOR15"));
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully selected client from drop down");
  
        
        //step7: check on primary contact check box
        Assert.assertTrue(debtor.CheckOnPrimaryCheckBox());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully checked on primary check box");
        
        //step8: add value to Contact name text box
        Assert.assertTrue(debtor.addValuesToContactNameTextBox(ContactName));
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully entered contact name in text box");
        
        //step9: add value to phone no text box
        Assert.assertTrue(debtor.addValuesToPhoneNoTextBox(ContactPhoneNo));
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully entered phone no in text box");
        
        //step12: add value to email text box
        //  Assert.assertTrue(debtor.addValuesToEmailTextBox(email));
        // ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully enetered email in text box");
        
        //step13: click on save button
        Assert.assertTrue(debtor.ClickOnSaveBTN());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked on Save button");
        
        
        //step15: click on close button
        Assert.assertTrue(debtor.ClickOnMsgCloseBTN());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked on Close button");
        
        //step16: click on back to main page button
        
        Assert.assertTrue(debtor.ClickBackToMainPage());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked on Back to Main page button");
        
        //step17: verifying Account name hyper link
       // Assert.assertTrue(debtor.ClickAccNameHyperLink());
       // ExtentTestManager.getTest().log(LogStatus.PASS, "Verified Account name hyperlink after debtor creation");
        
        //step18: close the pop up
        Assert.assertTrue(debtor.ClickOnPopupCloseBTN());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully closed the popup");
	}
	 //****************/
	
	
	
	
	
	
	
	
	@DataProvider(name = "Client Template")
	public Object[][] getData1() 
	  {
		return TestUtil.getData(xls_reader, "Client Template");
		
	  }
	@DataProvider(name = "AndersonDebtorTemplate")
	public Object[][] getData2() 
	  {
		return TestUtil.getData(xls_reader, "AndersonDebtorTemplate");
	  }
	@DataProvider(name = "Cranford Debtor Template")
	public Object[][] getData3() 
	  {
		return TestUtil.getData(xls_reader, "Cranford Debtor Template");
		
	  }
	@DataProvider(name = "Enviro Debtor Template")
	public Object[][] getData4() 
	  {
		return TestUtil.getData(xls_reader, "Enviro Debtor Template");
		
	  }
	@DataProvider(name = "Expedited Debtor Template")
	public Object[][] getData5() 
	  {
		return TestUtil.getData(xls_reader, "Expedited Debtor Template");
		
	  }
	@DataProvider(name = "Gilbert Debtor Template")
	public Object[][] getData6() 
	  {
		return TestUtil.getData(xls_reader, "Gilbert Debtor Template");
		
	  }
	@DataProvider(name = "Logistic Debtor Template")
	public Object[][] getData7() 
	  {
		return TestUtil.getData(xls_reader, "Logistic Debtor Template");
		
	  }
	@DataProvider(name = "P&P Debtor Template")
	public Object[][] getData8() 
	  {
		return TestUtil.getData(xls_reader, "P&P Debtor Template");
		
	  }
	@DataProvider(name = "Power Debtor Template")
	public Object[][] getData9() 
	  {
		return TestUtil.getData(xls_reader, "Power Debtor Template");
		
	  }
	@DataProvider(name = "R&R Debtor Template")
	public Object[][] getData10() 
	  {
		return TestUtil.getData(xls_reader, "R&R Debtor Template");
		
	  }
	@DataProvider(name = "Trans Debtor Template")
	public Object[][] getData11() 
	  {
		return TestUtil.getData(xls_reader, "Trans Debtor Template");
		
	  }
}
