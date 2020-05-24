/*//Author : Abirami
package com.cync.Factoring;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.cync.FactoringPages.DataUploadPage;
import com.cync.FactoringPages.InvoiceValidationTemplatePage;
import com.cync.base.BaseTest;
import com.cync.base.ExtentTestManager;
import com.cync.pages.CyncHomePage;
import com.cync.pages.LoginPage;
import com.cync.utility.TestGroups;
import com.cync.utility.TestUtil;
import com.cync.utility.Xls_Reader;
import com.relevantcodes.extentreports.LogStatus;

public class InvoiceValidationTemplateTC extends BaseTest {
	Xls_Reader xls_reader = new Xls_Reader(System.getProperty("user.dir")
		    + "\\TestDataProvider\\FactoringModule.xlsx");
	
	
	//CY-3681
	@Test(dataProvider="InvValTemp",groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Verify navigation to Invoice Validation Template screen")
	public void InvoiceValidationTemplate_01(String clientname)
	{
		ExtentTestManager.getTest().getTest().setName("Invoice Validation Template:Verify User should able to navigate toInvoice Validation Template screen");
		 ExtentTestManager.getTest().assignCategory("Module:Factoring");

		 LoginPage loginPage = new LoginPage(driver);
		 CyncHomePage cyncHomePage = loginPage.doLogin();
		 Assert.assertEquals(cyncHomePage.getSuccessfulMessage(),"Signed in Successfully");
		 
		 CyncHomePage cyncHomePage = new CyncHomePage(driver);
		 //navigate to invoice validation template screen
		InvoiceValidationTemplatePage invVal = cyncHomePage.getCyncMenus().openInvValTempPage(clientname);
		 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully navigated to the Invoice Validation Template screen");
		 
		 String Header = "Invoice validation Template";
		 
		 //verify page header 
		 Assert.assertEquals(invVal.PageHeaderVerify(Header), Header);
		 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified Page header of Invoice Validation Template screen");
		 
	}
	
	//CY-3682
	@Test(dataProvider="InvValTemp",groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Verify Serach and CreateNew button in Invoice Validation Template screen")
	public void InvoiceValidationTemplate_02(String clientname)
	{
		ExtentTestManager.getTest().getTest().setName("Invoice Validation Template:Verify Search and Create New button in Invoice Validation Template screen");
		 ExtentTestManager.getTest().assignCategory("Module:Factoring");

		 LoginPage loginPage = new LoginPage(driver);
		 CyncHomePage cyncHomePage = loginPage.doLogin();
		 Assert.assertEquals(cyncHomePage.getSuccessfulMessage(),"Signed in Successfully");
		 
		 CyncHomePage cyncHomePage= new CyncHomePage(driver);
		 //navigate to invoice validation template
		InvoiceValidationTemplatePage invVal = cyncHomePage.getCyncMenus().openInvValTempPage(clientname);
		 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully navigated to the Invoice Validation Template screen"); 
		 
		 //verify search button
		 Assert.assertTrue(invVal.VerifySearchBTN());
		 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified Search button in Invoice Validation Template screen");
		 
		 //verify create new button
		 Assert.assertTrue(invVal.VerifyCreateNewBTN());
		 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified Create New button in Invoice Validation Template screen");	 
		 
	}
	
	//CY-3683
		@Test(dataProvider="InvValTemp",groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Verify View button in Invoice Validation Template screen")
		public void InvoiceValidationTemplate_03(String clientname)
		{
			ExtentTestManager.getTest().getTest().setName("Invoice Validation Template:Verify View button in Invoice Validation Template screen");
			 ExtentTestManager.getTest().assignCategory("Module:Factoring");

			 LoginPage loginPage = new LoginPage(driver);
			 CyncHomePage cyncHomePage = loginPage.doLogin();
			 Assert.assertEquals(cyncHomePage.getSuccessfulMessage(),"Signed in Successfully");
			 
			 CyncHomePage cyncHomePage= new CyncHomePage(driver);
			 //navigate to invoice validation template
			InvoiceValidationTemplatePage invVal = cyncHomePage.getCyncMenus().openInvValTempPage(clientname);
			 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully navigated to the Invoice Validation Template screen");
			 
			 //verify view button
			 Assert.assertTrue(invVal.VerifyViewBTN());
			 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified View button in Invoice Validation Template screen");
		}	 
	
		
		//CY-3684
		@Test(dataProvider="InvValTemp",groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Verify creation of Invoice Validation Template")
		public void InvoiceValidationTemplate_04(String clientname)
		{
			ExtentTestManager.getTest().getTest().setName("Invoice Validation Template:Verify creation of Invoice Validation Template");
			 ExtentTestManager.getTest().assignCategory("Module:Factoring");

			 LoginPage loginPage = new LoginPage(driver);
			 CyncHomePage cyncHomePage = loginPage.doLogin();
			 Assert.assertEquals(cyncHomePage.getSuccessfulMessage(),"Signed in Successfully");
			 
			 CyncHomePage cyncHomePage= new CyncHomePage(driver);		 
			 //navigate to invoice validation template
			InvoiceValidationTemplatePage invVal = cyncHomePage.getCyncMenus().openInvValTempPage(clientname);
			ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully navigated to the Invoice Validation Template screen");
			
			//click create new button and verify add page
			Assert.assertTrue(invVal.ClickCreateNewBTNAndVerifyAddPage());
			ExtentTestManager.getTest().log(LogStatus.PASS, "successfuly user navigated to Add Invoice Validation Template screen");
			
			String tempNameData = "Fact002InvValTemp";
			
			//passing data to template name field
			Assert.assertEquals(invVal.addValueToTempName(tempNameData), tempNameData);
			ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully passing data to Template Name text box");
			
			String tempDesData = "Fact002TestInvValTemp";
			
			//passing data to template description field
			Assert.assertEquals(invVal.addValueToTempDescription(tempDesData), tempDesData);
			ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully passing data to Template Description text box");
			
			//click on parameters list check box 
			Assert.assertTrue(invVal.ClickOnParametersList());
			ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully checked Parameters List Check Box");
			
			//click save button
			Assert.assertTrue(invVal.ClickOnSaveBTN());
			ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked Save button");
			
			//verify success message
			Assert.assertTrue(invVal.VerifySuccessMsg());
			ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully got success message");
		}
		
		//CY-3685
		@Test(dataProvider="InvValTemp",groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Verify Edit by updating in Invoice Validation Template")
		public void InvoiceValidationTemplate_05(String clientname)
		{
			ExtentTestManager.getTest().getTest().setName("Invoice Validation Template:Verify Edit by updating in Invoice Validation Template");
		    ExtentTestManager.getTest().assignCategory("Module:Factoring");

			LoginPage loginPage = new LoginPage(driver);
			CyncHomePage cyncHomePage = loginPage.doLogin();
			Assert.assertEquals(cyncHomePage.getSuccessfulMessage(),"Signed in Successfully");
		    
		    CyncHomePage cyncHomePage= new CyncHomePage(driver);
			//navigate to invoice validation template
	        InvoiceValidationTemplatePage invVal = cyncHomePage.getCyncMenus().openInvValTempPage(clientname);
			ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully navigated to the Invoice Validation Template screen");
			
			String searchData = "Fact002InvValTemp";
			
			//passing data to search field and click search button
			Assert.assertEquals(invVal.addValueToSearchTextBox(searchData), searchData);
			ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully searched specified Invoice Validation Template");
			
			//click edit button
			Assert.assertTrue(invVal.ClickOnEditBTN());
			ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked Edit Button in Invoice Validation Template");
			
			String tempDesData = "Fact002InvoiceValidationTemp";
			
			//passing data to template description field
			Assert.assertEquals(invVal.addValueToTempDescription(tempDesData), tempDesData);
			ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully passing data to Template Description text box");
			
			//click save button
			Assert.assertTrue(invVal.ClickOnSaveBTN());
			ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked Save Button");
			
			//verify update message
			Assert.assertTrue(invVal.VerifyUpdateMsg());
			ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully Tamplate was updated");
			
		}
		
		//CY-5481
		@Test(dataProvider="InvValTemp",groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Verify Copying Template with New name")
		public void InvoiceValidationTemplate_08(String clientname)
		{
			ExtentTestManager.getTest().getTest().setName("Invoice Validation Template:Verify Copying Template with New name");
		    ExtentTestManager.getTest().assignCategory("Module:Factoring");

			LoginPage loginPage = new LoginPage(driver);
			CyncHomePage cyncHomePage = loginPage.doLogin();
			Assert.assertEquals(cyncHomePage.getSuccessfulMessage(),"Signed in Successfully");
		    
		    CyncHomePage cyncHomePage= new CyncHomePage(driver);
			//navigate to invoice validation template screen
			InvoiceValidationTemplatePage invVal = cyncHomePage.getCyncMenus().openInvValTempPage(clientname);
			ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully navigated to the Invoice Validation Template screen");
							
			String searchData = "Fact002InvValTemp";
							
			//passing data to search field and click search button
			Assert.assertEquals(invVal.addValueToSearchTextBox(searchData), searchData);
			ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully searched specified Invoice Validation Template");
							
			//click edit button
			Assert.assertTrue(invVal.ClickOnEditBTN());
			ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked Edit Button in Invoice Validation Template");
			
			String tempNameData = "Fact002InvoiceValTemp";
			
			//passing data to template name field
			Assert.assertEquals(invVal.addValueToTempName(tempNameData), tempNameData);
			ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully passing data to Template Name text box");
			
			//click save button
			Assert.assertTrue(invVal.ClickOnSaveAsBTN());
			ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked Save As button");
			
			//verify update message
			Assert.assertTrue(invVal.VerifyUpdateMsg());
			ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully Template was updated");
		}
		
		//CY-5482
		@Test(dataProvider="InvValTemp",groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Verify Copying Template with existing name")
		public void InvoiceValidationTemplate_09(String clientname)
		{
			ExtentTestManager.getTest().getTest().setName("Invoice Validation Template:Verify Copying Template with existing name");
		    ExtentTestManager.getTest().assignCategory("Module:Factoring");

			LoginPage loginPage = new LoginPage(driver);
			CyncHomePage cyncHomePage = loginPage.doLogin();
			Assert.assertEquals(cyncHomePage.getSuccessfulMessage(),"Signed in Successfully");
		    
		    CyncHomePage cyncHomePage= new CyncHomePage(driver);						
			//navigate to invoice valiation template
		    InvoiceValidationTemplatePage invVal = cyncHomePage.getCyncMenus().openInvValTempPage(clientname);
			ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully navigated to the Invoice Validation Template screen");
					
			String searchData = "Fact002InvValTemp";
					
			//passing data to search field and click search button
			Assert.assertEquals(invVal.addValueToSearchTextBox(searchData), searchData);
			ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully searched specified Invoice Validation Template");
					
			//click edit button
			Assert.assertTrue(invVal.ClickOnEditBTN());
			ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked Edit Button in Invoice Validation Template");
			
			//click save as button
			Assert.assertTrue(invVal.ClickOnSaveAsBTN());
			ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked Save As Button");
			
			//verify save as error message
			Assert.assertTrue(invVal.VerifySaveAsErrorMsg());
			ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully got Error message");
		}
		
		//CY-5483
		@Test(dataProvider="InvValTemp",groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Verify Viewing Default Validation template")
		public void InvoiceValidationTemplate_10(String clientname)
		{
			ExtentTestManager.getTest().getTest().setName("Invoice Validation Template:Verify Viewing Default Validation template");
		    ExtentTestManager.getTest().assignCategory("Module:Factoring");

			LoginPage loginPage = new LoginPage(driver);
			CyncHomePage cyncHomePage = loginPage.doLogin();
			Assert.assertEquals(cyncHomePage.getSuccessfulMessage(),"Signed in Successfully");
											
			//navigate to invoice validation template
			InvoiceValidationTemplatePage invVal = cyncHomePage.getCyncMenus().openInvValTempPage(clientname);
			ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully navigated to the Invoice Validation Template screen");
							
			//click view button
			Assert.assertTrue(invVal.ClickOnViewBTN());
			ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked view button");
			
			String tempName = "default";
			//verify default validation template
			Assert.assertTrue(invVal.VerifyDefaultTemp(tempName));
			ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified default validation template");
			
			//click back to list button
			Assert.assertTrue(invVal.ClickOnBackToListBTN());
			ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked Back To List button");
			
			String Header = "Invoice validation Template";
			
			//verify page header
			Assert.assertEquals(invVal.PageHeaderVerify(Header),Header);
			ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully navigated to Invoice Validation Template screen");
		}
		
		
		//CY-5471
		@Test(dataProvider="InvValTemp",groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Verify Delete Button in Invoice Validation Template")
		public void InvoiceValidationTemplate_06(String clientname)
		{
			ExtentTestManager.getTest().getTest().setName("Invoice Validation Template:Verify Delete Button in Invoice Validation Template");
			ExtentTestManager.getTest().assignCategory("Module:Factoring");

			LoginPage loginPage = new LoginPage(driver);
			CyncHomePage cyncHomePage = loginPage.doLogin();
			Assert.assertEquals(cyncHomePage.getSuccessfulMessage(),"Signed in Successfully");
			
			 CyncHomePage cyncHomePage= new CyncHomePage(driver);					
			//navigate to invoice validation template
		    InvoiceValidationTemplatePage invVal = cyncHomePage.getCyncMenus().openInvValTempPage(clientname);
		    ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully navigated to the Invoice Validation Template screen");
		    
		    String searchData = "Fact002InvValTemp";
			
		    //passing data to search field and click search button
			Assert.assertEquals(invVal.addValueToSearchTextBox(searchData), searchData);
			ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully searched specified Invoice Validation Template");
					
			//click delete button
			Assert.assertTrue(invVal.ClickOnDeleteBTN());
			ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked Delete Button in Invoice Validation Template");
			
			//verify delete message
			Assert.assertTrue(invVal.VerifyDeleteMsg());
			ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully Template was Deleted ");
					
		}
		
		

		//CY-5472
		@Test(dataProvider="InvValTemp",groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Verify Cancel Button in Invoice Validation Template")
		public void InvoiceValidationTemplate_07(String clientname)
		{
			ExtentTestManager.getTest().getTest().setName("Invoice Validation Template:Verify Cancel Button in Invoice Validation Template");
			 ExtentTestManager.getTest().assignCategory("Module:Factoring");

			 LoginPage loginPage = new LoginPage(driver);
			 CyncHomePage cyncHomePage = loginPage.doLogin();
			 Assert.assertEquals(cyncHomePage.getSuccessfulMessage(),"Signed in Successfully");
			 
			 CyncHomePage cyncHomePage= new CyncHomePage(driver);		 
			 //naviagte to invoice validation template screen
			InvoiceValidationTemplatePage invVal = cyncHomePage.getCyncMenus().openInvValTempPage(clientname);
			ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully navigated to the Invoice Validation Template screen");
			
			//click create new button and verify add page
			Assert.assertTrue(invVal.ClickCreateNewBTNAndVerifyAddPage());
			ExtentTestManager.getTest().log(LogStatus.PASS, "successfuly user navigated to Add Invoice Validation Template screen");
			
			String tempNameData = "Fact002InvValTemp";
			
			//passing data to template name field
			Assert.assertEquals(invVal.addValueToTempName(tempNameData), tempNameData);
			ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully passing data to Template Name text box");
			
			String tempDesData = "Fact002InvValTemplate";
			
			//passing data to template description field
			Assert.assertEquals(invVal.addValueToTempDescription(tempDesData), tempDesData);
			ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully passing data to Template Description text box");
			
			//click parameters list check box
			Assert.assertTrue(invVal.ClickOnParametersList());
			ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully checked Parameters List Check Box");
			
			//click cancel button
			Assert.assertTrue(invVal.ClickOnCancelBTN());
			ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked Cancel button");
			
			String Header = "Invoice validation Template";
			
			//verify page header
			Assert.assertEquals(invVal.PageHeaderVerify(Header), Header);
			ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully navigated to Invoice Validation Template screen");
		}
		
		
	
	@DataProvider(name = "InvValTemp")
    public Object[][] getData() {
	return TestUtil.getData(xls_reader, "InvValTemp");
    }

}
*/