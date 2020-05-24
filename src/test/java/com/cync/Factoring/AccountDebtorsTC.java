//Author : Abirami
package com.cync.Factoring;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.cync.FactoringPages.AccountDebtorPage;
import com.cync.FactoringPages.DataUploadPage;
import com.cync.base.BaseTest;
import com.cync.base.ExtentTestManager;
import com.cync.pages.CyncHomePage;
import com.cync.pages.LoginPage;
import com.cync.utility.TestGroups;
import com.cync.utility.TestUtil;
import com.cync.utility.Xls_Reader;
import com.relevantcodes.extentreports.LogStatus;

public class AccountDebtorsTC extends BaseTest{

	Xls_Reader xls_reader = new Xls_Reader(System.getProperty("user.dir")
		    + "\\TestDataProvider\\FactoringModule.xlsx");
	
	//CY-4288
	@Test(dataProvider="AccountDebtors",groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Verify navigation to Account Debtor screen")
	public void AccountDebtor_01(String clientname)
	{
		ExtentTestManager.getTest().getTest().setName("Data Upload:Verify User should able to navigate to Account Debtor screen");
	    ExtentTestManager.getTest().assignCategory("Module:Factoring");

		LoginPage loginPage = new LoginPage(driver);
		CyncHomePage cyncHomePage = loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(),"Signed in Successfully");
			 
		AccountDebtorPage accDebt = cyncHomePage.getCyncMenus().openAccountDebtorPage();
		ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully navigated to Account Debtor screen"); 
		
		String Header = "Account Debtor";
		
		//Verify the page header
		Assert.assertEquals(accDebt.PageHeaderVerify(Header), Header);
		ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified page header in Account Debtor screen");
			 
	}
	
	//CY-4289
	@Test(dataProvider="AccountDebtors",groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Verify 'Select Client' drop down in Account Debtor screen")
	public void AccountDebtor_02(String clientname)
	{
		ExtentTestManager.getTest().getTest().setName("Data Upload:Verify 'Select Client' drop down in Account Debtor screen");
		ExtentTestManager.getTest().assignCategory("Module:Factoring");

		LoginPage loginPage = new LoginPage(driver);
		CyncHomePage cyncHomePage = loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(),"Signed in Successfully");
				 
		AccountDebtorPage accDebt = cyncHomePage.getCyncMenus().openAccountDebtorPage();
		ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully navigated to Account Debtor screen");
		
		//Select client from select client drop down
		Assert.assertTrue(accDebt.selectClientdropdownValues(clientname));
		ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully selected client from Select Client Dropdown");
		
	}
	
	
	//CY-4290
	@Test(dataProvider="AccountDebtors",groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Verify 'Select Debtor' drop down in Account Debtor screen")
	public void AccountDebtor_03(String clientname,String debtorName)
	{
		ExtentTestManager.getTest().getTest().setName("Data Upload:Verify 'Select Debtor' drop down in Account Debtor screen");
		ExtentTestManager.getTest().assignCategory("Module:Factoring");

		LoginPage loginPage = new LoginPage(driver);
		CyncHomePage cyncHomePage = loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(),"Signed in Successfully");
					 
		AccountDebtorPage accDebt = cyncHomePage.getCyncMenus().openAccountDebtorPage();
		ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully navigated to Account Debtor screen");
		
		//select client from 'select client' drop down
		Assert.assertTrue(accDebt.selectClientdropdownValues(clientname));
		ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully selected client from Select Client Dropdown");
		
		//select debtor from 'select debtor' drop down
		Assert.assertTrue(accDebt.SelectDebtordropdownValues(debtorName));
		ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully selected debtor from Select Debtor Dropdown");
			
	}
	
	
	//CY-4292
	@Test(dataProvider="AccountDebtors",groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Verify 'New Account Debtor' button in Account Debtor screen")
	public void AccountDebtor_04(String clientname)
	{
		ExtentTestManager.getTest().getTest().setName("Data Upload:Verify 'New Account Debtor' button in Account Debtor screen");
		ExtentTestManager.getTest().assignCategory("Module:Factoring");

		LoginPage loginPage = new LoginPage(driver);
		CyncHomePage cyncHomePage = loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(),"Signed in Successfully");
					 
		AccountDebtorPage accDebt = cyncHomePage.getCyncMenus().openAccountDebtorPage();
		ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully navigated to Account Debtor screen");
		
		//click 'new account debtor' button and verify account debtor page
		Assert.assertTrue(accDebt.ClickNewAccDebtorBTN());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully navigated to Account Debtor Page for Debtor creation");
			
	}
	
	//CY-4294
	@Test(dataProvider="AccountDebtors",groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Verify that page should navigate to 'Detailed Debtor Aging' after choosing specific debtor from 'Select debtor' dropdown.")
	public void AccountDebtor_06(String clientname,String debtorName)
	{
		ExtentTestManager.getTest().getTest().setName("Data Upload:Verify that page should navigate to 'Detailed Debtor Aging' after choosing specific debtor from 'Select debtor' dropdown.");
		ExtentTestManager.getTest().assignCategory("Module:Factoring");

		LoginPage loginPage = new LoginPage(driver);
		CyncHomePage cyncHomePage = loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(),"Signed in Successfully");
						 
		AccountDebtorPage accDebt = cyncHomePage.getCyncMenus().openAccountDebtorPage();
		ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully navigated to Account Debtor screen");
				
		//select client from 'select client' drop down
		Assert.assertTrue(accDebt.selectClientdropdownValues(clientname));
		ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully selected client from Select Client Dropdown");
		
		//select debtor from 'select debtor' drop down
		Assert.assertTrue(accDebt.SelectDebtordropdownValues(debtorName));
		ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully selected debtor from Select Debtor Dropdown");
		
		//verify detailed debtor aging page
		Assert.assertTrue(accDebt.VerifyDetailedDebtorAging());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully got Detailed Debtor Aging Page");
				
	}
	
	//CY-4295
    @Test(dataProvider="AccountDebtors",groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Verify columns under Account Debtors")
	public void AccountDebtor_07(String clientname)
	{
		ExtentTestManager.getTest().getTest().setName("Data Upload:Verify columns under Account Debtors");
		ExtentTestManager.getTest().assignCategory("Module:Factoring");

		LoginPage loginPage = new LoginPage(driver);
		CyncHomePage cyncHomePage = loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(),"Signed in Successfully");
							 
		AccountDebtorPage accDebt = cyncHomePage.getCyncMenus().openAccountDebtorPage();
		ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully navigated to Account Debtor screen");
					
		Assert.assertTrue(accDebt.VerifyAccNoField());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified account no field");
		
		Assert.assertTrue(accDebt.VerifyAccNameField());
		ExtentTestManager.getTest().log(LogStatus.PASS,"Successfully verified account name field");
		
		Assert.assertTrue(accDebt.VerifyOpenInvBalField());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified open invoice balance field");
		
		Assert.assertTrue(accDebt.VerifyFutureField());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified future field");
		
		Assert.assertTrue(accDebt.VerifyCurrentField());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified current field");
		
		Assert.assertTrue(accDebt.VerifyOneToThirtyField());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified one to thirty field");
		
		Assert.assertTrue(accDebt.VerifyThrityToSixtyField());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified thirty to sixty field");
		
		Assert.assertTrue(accDebt.VerifySixtyToNinetyField());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified sixty to ninety field");
		
		Assert.assertTrue(accDebt.VerifyNinetyToOneTwentyField());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified ninety to one twenty field");
		
		Assert.assertTrue(accDebt.VerifyOverOneTwentyField());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified over one twenty field");
		
		Assert.assertTrue(accDebt.VerifyInvoiceCountField());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified invoice count field");
		
		Assert.assertTrue(accDebt.VerifyConcentrationField());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified concentration field");
		
		Assert.assertTrue(accDebt.VerifyDillutionField());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified dillution field");
		
		Assert.assertTrue(accDebt.VerifyDsoField());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified dso field");
			
	}
    
  //CY-4303
  	@Test(dataProvider="AccountDebtors",groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Verify Detailed Debtor Aging popup in Account Debtors page")
  	public void AccountDebtor_08(String clientname)
  	{
  		ExtentTestManager.getTest().getTest().setName("Data Upload:Verify Detailed Debtor Aging popup in Account Debtors page");
  		ExtentTestManager.getTest().assignCategory("Module:Factoring");

  		LoginPage loginPage = new LoginPage(driver);
  		CyncHomePage cyncHomePage = loginPage.doLogin();
  		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(),"Signed in Successfully");
  						 
  		AccountDebtorPage accDebt = cyncHomePage.getCyncMenus().openAccountDebtorPage();
  		ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully navigated to Account Debtor screen");
  				
  		//select client from 'select client' drop down
  		Assert.assertTrue(accDebt.selectClientdropdownValues(clientname));
  		ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully selected client from Select Client Dropdown");
  		
  		Assert.assertTrue(accDebt.ClickAccNameHyperLink());
  		ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked acc name hyper link in Account Debtor page");
  		
  		Assert.assertTrue(accDebt.VerifyDetDebAgingHyperLink());
  		ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified detailed debtor aging hyper link");
  		
  		Assert.assertTrue(accDebt.VerifyAccParametersHyperLink());
  		ExtentTestManager.getTest().log(LogStatus.PASS, "Successfuly verified account parameters hyper link");
  		
  		Assert.assertTrue(accDebt.VerifyCommentsHyperLink());
  		ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified comments hyper link");
  		
  		Assert.assertTrue(accDebt.VerifyDebPerformanceHyperLink());
  		ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified debtor performance hyper link");
  		
  	}
  	
  //CY-4304
  	@Test(dataProvider="AccountDebtors",groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Verify Navigation to Detailed Debtor Aging Page")
  	public void AccountDebtor_09(String clientname)
  	{
  		ExtentTestManager.getTest().getTest().setName("Data Upload:Verify Navigation to Detailed Debtor Aging Page");
  		ExtentTestManager.getTest().assignCategory("Module:Factoring");

  		LoginPage loginPage = new LoginPage(driver);
  		CyncHomePage cyncHomePage = loginPage.doLogin();
  		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(),"Signed in Successfully");
  						 
  		AccountDebtorPage accDebt = cyncHomePage.getCyncMenus().openAccountDebtorPage();
  		ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully navigated to Account Debtor screen");
  				
  		//select client from 'select client' drop down
  		Assert.assertTrue(accDebt.selectClientdropdownValues(clientname));
  		ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully selected client from Select Client Dropdown");
  		
  		Assert.assertTrue(accDebt.ClickAccNameHyperLink());
  		ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked acc name hyper link in Account Debtor page");
  		
  		Assert.assertTrue(accDebt.ClickDetDebAgingHyperLink());
  		ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked Detailed Debtor Aging hyper link in Account Debtor page ");
  		
  		Assert.assertTrue(accDebt.VerifyDetDebAgingPage());
  		ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified Detailed Debtor Aging page");
  		
  	}				   
	
  	
  //CY-4305
  	@Test(dataProvider="AccountDebtors",groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Verify columns in 'Detail debtor aging' page.")
  	public void AccountDebtor_10(String clientname)
  	{
  		ExtentTestManager.getTest().getTest().setName("Data Upload:Verify columns in 'Detail debtor aging' page.");
  		ExtentTestManager.getTest().assignCategory("Module:Factoring");

  		LoginPage loginPage = new LoginPage(driver);
  		CyncHomePage cyncHomePage = loginPage.doLogin();
  		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(),"Signed in Successfully");
  						 
  		AccountDebtorPage accDebt = cyncHomePage.getCyncMenus().openAccountDebtorPage();
  		ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully navigated to Account Debtor screen");
  				
  		//select client from 'select client' drop down
  		Assert.assertTrue(accDebt.selectClientdropdownValues(clientname));
  		ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully selected client from Select Client Dropdown");
  		
  		Assert.assertTrue(accDebt.ClickAccNameHyperLink());
  		ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked acc name hyper link in Account Debtor page");
  		
  		Assert.assertTrue(accDebt.ClickDetDebAgingHyperLink());
  		ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked Detailed Debtor Aging hyper link in Account Debtor page ");
  		
  		Assert.assertTrue(accDebt.VerifyDetDebAgingPage());
  		ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified Detailed Debtor Aging page");
  		
  		Assert.assertTrue(accDebt.VerifyDetInvNoField());
  		ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified Invoice No field in Detailed Debtor Aging page");
  		
  		Assert.assertTrue(accDebt.VerifyDetPoNoField());
  		ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified Po No field in Detailed Debtor Aging page");
  		
  		Assert.assertTrue(accDebt.VerifyDetInvDateField());
  		ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified Invoice Date field in Detailed Debtor Aging page");
  		
  		Assert.assertTrue(accDebt.VerifyDetDueDateField());
  		ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified Due Date field in Detailed Debtor Aging page");
  		
  		Assert.assertTrue(accDebt.VerifyDetInvAmtField());
  		ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified Invoice Amount field in Detailed Debtor Aging page");
  		
  		Assert.assertTrue(accDebt.VerifyDetBalAmtField());
  		ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified Balance Amount field in Detailed Debtor Aging page");
  		
  		Assert.assertTrue(accDebt.VerifyDetFutureField());
  		ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified Future Amount field in Detailed Debtor Aging page");
  		
  		Assert.assertTrue(accDebt.VerifyDetOverThirtyField());
  		ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified Over Thirty field in Detailed Debtor Aging page");
  		
        Assert.assertTrue(accDebt.VerifyDetOverSixtyField());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified Over Sixty field in Detailed Debtor Aging page");
  		
  		Assert.assertTrue(accDebt.VerifyDetOverNinetyField());
  		ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified Over Ninety field in Detailed Debtor Aging page");
  		
  		Assert.assertTrue(accDebt.VerifyDetOverOneTwentyField());
  		ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified Over One Twenty in Detailed Debtor Aging page");
  		
  	}				   
  	
  //CY-4306
  	@Test(dataProvider="AccountDebtors",groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Verify columns in 'Detail debtor aging' page.")
  	public void AccountDebtor_11(String clientname)
  	{
  		ExtentTestManager.getTest().getTest().setName("Data Upload:Verify columns in 'Detail debtor aging' page.");
  		ExtentTestManager.getTest().assignCategory("Module:Factoring");

  		LoginPage loginPage = new LoginPage(driver);
  		CyncHomePage cyncHomePage = loginPage.doLogin();
  		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(),"Signed in Successfully");
  						 
  		AccountDebtorPage accDebt = cyncHomePage.getCyncMenus().openAccountDebtorPage();
  		ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully navigated to Account Debtor screen");
  				
  		//select client from 'select client' drop down
  		Assert.assertTrue(accDebt.selectClientdropdownValues(clientname));
  		ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully selected client from Select Client Dropdown");
  		
  		Assert.assertTrue(accDebt.ClickAccNameHyperLink());
  		ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked acc name hyper link in Account Debtor page");
  		
  		Assert.assertTrue(accDebt.ClickDetDebAgingHyperLink());
  		ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked Detailed Debtor Aging hyper link in Account Debtor page ");
  		  	
  		Assert.assertTrue(accDebt.ClickInvNoHyperLink());
  		ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked Invoice No Hyper Link");
  		
  		Assert.assertTrue(accDebt.VerifyInvoiceDetPopup());
  		ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully got Invoice Details popup");
  		
  		Assert.assertTrue(accDebt.VerifyInvDetailsHyperLink());
  		ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified Invoice Details Hyper Link ");
  		
  		Assert.assertTrue(accDebt.VerifyInvDocumentsHyperLink());
  		ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified Invoice Documents Hyper Link");
  		
  		Assert.assertTrue(accDebt.VerifyInvCommentsHyperLink());
  		ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified Invoice Comments Hyper Link");
  		
  		Assert.assertTrue(accDebt.VerifyCashReceiptHyperLink());
  		ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified Cash Receipt Hyper Link");
  	}	
	
  //CY-4307
  	@Test(dataProvider="AccountDebtors",groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Verify that user should navigate to Cash receipt page onclick of Cash receipt hyperlink in 'Invoice no' link.")
  	public void AccountDebtor_12(String clientname,String debtorName)
  	{
  		ExtentTestManager.getTest().getTest().setName("Data Upload:Verify that user should navigate to Cash receipt page onclick of Cash receipt hyperlink in 'Invoice no' link.");
  		ExtentTestManager.getTest().assignCategory("Module:Factoring");

  		LoginPage loginPage = new LoginPage(driver);
  		CyncHomePage cyncHomePage = loginPage.doLogin();
  		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(),"Signed in Successfully");
  						 
  		AccountDebtorPage accDebt = cyncHomePage.getCyncMenus().openAccountDebtorPage();
  		ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully navigated to Account Debtor screen");
  				
  		//select client from 'select client' drop down
  		Assert.assertTrue(accDebt.selectClientdropdownValues(clientname));
  		ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully selected client from Select Client Dropdown");
  		
  		Assert.assertTrue(accDebt.SelectDebtordropdownValues(debtorName));
		ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully selected debtor from Select Debtor Dropdown");
  		
  		Assert.assertTrue(accDebt.ClickAccNameHyperLink());
  		ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked acc name hyper link in Account Debtor page");
  		
  		Assert.assertTrue(accDebt.ClickDetDebAgingHyperLink());
  		ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked Detailed Debtor Aging hyper link in Account Debtor page ");
  		  	
  		Assert.assertTrue(accDebt.ClickInvNoHyperLink());
  		ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked Invoice No Hyper Link");
  		
  		Assert.assertTrue(accDebt.ClickCashReceiptHyperLink());
  		ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully got Cash Receipt screen");
  		  	
  	}
  	
  	 //CY-4308
  	@Test(dataProvider="AccountDebtors",groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Verify that user should navigate to Cash receipt page onclick of ' Balance Amount' hyperlink.")
  	public void AccountDebtor_13(String clientname,String debtorName)
  	{
  		ExtentTestManager.getTest().getTest().setName("Data Upload:Verify that user should navigate to Cash receipt page onclick of ' Balance Amount' hyperlink.");
  		ExtentTestManager.getTest().assignCategory("Module:Factoring");

  		LoginPage loginPage = new LoginPage(driver);
  		CyncHomePage cyncHomePage = loginPage.doLogin();
  		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(),"Signed in Successfully");
  						 
  		AccountDebtorPage accDebt = cyncHomePage.getCyncMenus().openAccountDebtorPage();
  		ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully navigated to Account Debtor screen");
  				
  		//select client from 'select client' drop down
  		Assert.assertTrue(accDebt.selectClientdropdownValues(clientname));
  		ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully selected client from Select Client Dropdown");
  		
  		Assert.assertTrue(accDebt.SelectDebtordropdownValues(debtorName));
		ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully selected debtor from Select Debtor Dropdown");
  		
  		Assert.assertTrue(accDebt.ClickAccNameHyperLink());
  		ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked acc name hyper link in Account Debtor page");
  		
  		Assert.assertTrue(accDebt.ClickDetDebAgingHyperLink());
  		ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked Detailed Debtor Aging hyper link in Account Debtor page ");
  		
  		Assert.assertTrue(accDebt.ClickBalAmountHyperLink());
  		ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully got Cash Receipt screen");
  	
  	}
  	

  	 //CY-4312
  	@Test(dataProvider="AccountDebtors",groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Verify 'Account parameters' hyperlink in Debtor details pop up.")
  	public void AccountDebtor_17(String clientname,String debtorName)
  	{
  		ExtentTestManager.getTest().getTest().setName("Data Upload:Verify 'Account parameters' hyperlink in Debtor details pop up.");
  		ExtentTestManager.getTest().assignCategory("Module:Factoring");

  		LoginPage loginPage = new LoginPage(driver);
  		CyncHomePage cyncHomePage = loginPage.doLogin();
  		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(),"Signed in Successfully");
  						 
  		AccountDebtorPage accDebt = cyncHomePage.getCyncMenus().openAccountDebtorPage();
  		ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully navigated to Account Debtor screen");
  				
  		//select client from 'select client' drop down
  		Assert.assertTrue(accDebt.selectClientdropdownValues(clientname));
  		ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully selected client from Select Client Dropdown");
  		
  		Assert.assertTrue(accDebt.ClickAccNameHyperLink());
  		ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked acc name hyper link in Account Debtor page");
  		
  		Assert.assertTrue(accDebt.ClickAccParametersHyperLink());
 		ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked Account Parameters Hyper Link");
  		
  		Assert.assertTrue(accDebt.VerifyEditBTN());
  		ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully got navigate to Debtor Edit page");
  			 	
  	}
  	
  	
 	 //CY-4313
 	@Test(dataProvider="AccountDebtors",groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Verify that user should navigate to Account debtor onclick of  'Back to main page'.")
 	public void AccountDebtor_18(String clientname,String debtorName)
 	{
 		ExtentTestManager.getTest().getTest().setName("Data Upload:Verify that user should navigate to Account debtor onclick of  'Back to main page'.");
 		ExtentTestManager.getTest().assignCategory("Module:Factoring");

 		LoginPage loginPage = new LoginPage(driver);
 		CyncHomePage cyncHomePage = loginPage.doLogin();
 		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(),"Signed in Successfully");
 						 
 		AccountDebtorPage accDebt = cyncHomePage.getCyncMenus().openAccountDebtorPage();
 		ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully navigated to Account Debtor screen");
 				
 		//select client from 'select client' drop down
 		Assert.assertTrue(accDebt.selectClientdropdownValues(clientname));
 		ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully selected client from Select Client Dropdown");
 		
 		Assert.assertTrue(accDebt.ClickAccNameHyperLink());
 		ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked acc name hyper link in Account Debtor page");
 		
 		Assert.assertTrue(accDebt.ClickAccParametersHyperLink());
 		ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked Account Parameters Hyper Link");
 		
 		Assert.assertTrue(accDebt.VerifyEditBTN());
 		ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully got navigate to Debtor Edit page");
 		
 		Assert.assertTrue(accDebt.ClickBackToMainPage());
 		ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked Back To Main Page button");
 		
 		Assert.assertTrue(accDebt.VerifyAccDebMainPage());
 		ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully navigated to Account Debtor's Main Page");
 			 	
 	}
   	
  
	 //CY-4314
	@Test(dataProvider="AccountDebtors",groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Verify 'Comments' hyperlink in Debtor details pop up.")
	public void AccountDebtor_19(String clientname,String debtorName)
	{
		ExtentTestManager.getTest().getTest().setName("Data Upload:Verify 'Comments' hyperlink in Debtor details pop up.");
		ExtentTestManager.getTest().assignCategory("Module:Factoring");

		LoginPage loginPage = new LoginPage(driver);
		CyncHomePage cyncHomePage = loginPage.doLogin();
		Assert.assertEquals(cyncHomePage.getSuccessfulMessage(),"Signed in Successfully");
						 
		AccountDebtorPage accDebt = cyncHomePage.getCyncMenus().openAccountDebtorPage();
		ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully navigated to Account Debtor screen");
				
		//select client from 'select client' drop down
		Assert.assertTrue(accDebt.selectClientdropdownValues(clientname));
		ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully selected client from Select Client Dropdown");
		
		Assert.assertTrue(accDebt.ClickAccNameHyperLink());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked acc name hyper link in Account Debtor page");
		
		Assert.assertTrue(accDebt.ClickCommentsHyperLink());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked Comments Hyper Link");
		
		Assert.assertTrue(accDebt.VerifyCommentsPopup());
		ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully got Comments Pop up");
			 	
	}
	

	 //CY-4320
		@Test(dataProvider="AccountDebtors",groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Verify 'Include Paid Invoices' check box in Account Debtor screen without selecting Debtor")
		public void AccountDebtor_23(String clientname)
		{
			ExtentTestManager.getTest().getTest().setName("Data Upload:Verify 'Include Paid Invoices' check box in Account Debtor screen without selecting Debtor");
			ExtentTestManager.getTest().assignCategory("Module:Factoring");

			LoginPage loginPage = new LoginPage(driver);
			CyncHomePage cyncHomePage = loginPage.doLogin();
			Assert.assertEquals(cyncHomePage.getSuccessfulMessage(),"Signed in Successfully");
							 
			AccountDebtorPage accDebt = cyncHomePage.getCyncMenus().openAccountDebtorPage();
			ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully navigated to Account Debtor screen");
					
			//select client from 'select client' drop down
			Assert.assertTrue(accDebt.selectClientdropdownValues(clientname));
			ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully selected client from Select Client Dropdown");
			
			Assert.assertFalse(accDebt.VerifyIncludePaidInvoices());
			ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified Include Paid Invoices not in Account Debtor Page");
	
		}
	
 
		 //CY-5502
			@Test(dataProvider="AccountDebtors",groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Verify 'Ínclude Paid Invoices' check box in Account Debtor screen after selecting Debtor")
			public void AccountDebtor_25(String clientname,String debtorName)
			{
				ExtentTestManager.getTest().getTest().setName("Data Upload:Verify 'Ínclude Paid Invoices' check box in Account Debtor screen after selecting Debtor");
				ExtentTestManager.getTest().assignCategory("Module:Factoring");

				LoginPage loginPage = new LoginPage(driver);
				CyncHomePage cyncHomePage = loginPage.doLogin();
				Assert.assertEquals(cyncHomePage.getSuccessfulMessage(),"Signed in Successfully");
								 
				AccountDebtorPage accDebt = cyncHomePage.getCyncMenus().openAccountDebtorPage();
				ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully navigated to Account Debtor screen");
						
				//select client from 'select client' drop down
				Assert.assertTrue(accDebt.selectClientdropdownValues(clientname));
				ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully selected client from Select Client Dropdown");
				
				Assert.assertTrue(accDebt.SelectDebtordropdownValues(debtorName));
				ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully selected Debtor from Select Debtor Dropdown");
				
				Assert.assertTrue(accDebt.VerifyIncludePaidInvoices());
				ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified Include Paid Invoices present in Account Debtor Page");
		
			}
		
			
			 //CY-5504
			@Test(dataProvider="AccountDebtors",groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Verify 'Ínclude Paid Invoices' check box default status")
			public void AccountDebtor_26(String clientname,String debtorName)
			{
				ExtentTestManager.getTest().getTest().setName("Data Upload:Verify 'Ínclude Paid Invoices' check box default status");
				ExtentTestManager.getTest().assignCategory("Module:Factoring");

				LoginPage loginPage = new LoginPage(driver);
				CyncHomePage cyncHomePage = loginPage.doLogin();
				Assert.assertEquals(cyncHomePage.getSuccessfulMessage(),"Signed in Successfully");
									 
				AccountDebtorPage accDebt = cyncHomePage.getCyncMenus().openAccountDebtorPage();
				ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully navigated to Account Debtor screen");
							
				//select client from 'select client' drop down
				Assert.assertTrue(accDebt.selectClientdropdownValues(clientname));
				ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully selected client from Select Client Dropdown");
					
				Assert.assertTrue(accDebt.SelectDebtordropdownValues(debtorName));
				ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully selected Debtor from Select Debtor Dropdown");
					
				/*Assert.assertFalse(accDebt.VerifyIncPaidInvDefStatus());
				ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified Include Paid Invoices default status is unchecked");*/
			
			}	
			
			
	@DataProvider(name = "AccountDebtors")
    public Object[][] getData() {
	return TestUtil.getData(xls_reader, "AccountDebtors");
    }
}
