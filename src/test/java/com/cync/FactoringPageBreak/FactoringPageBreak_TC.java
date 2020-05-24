package com.cync.FactoringPageBreak;

import java.awt.AWTException;
import java.awt.Robot;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.cync.FactoringPages.BrokerInquiryPage;
import com.cync.FactoringPages.FactoringFeeSetupPage;
import com.cync.FactoringPages.ACDebtorStatusPageFactoring;
import com.cync.FactoringPages.AccountDebtorPageFactoring;
import com.cync.FactoringPages.ActivityTicklerPageFactoring;
import com.cync.FactoringPages.AutoProcessingFeeSetupPageFactoring;
import com.cync.FactoringPages.BasicClientDetailPageFactoring;
import com.cync.FactoringPages.BasicParametersPageFactoring;
import com.cync.FactoringPages.BatchProcessScreenPageFactoring;
import com.cync.FactoringPages.BrokerBankInformationPageFactoring;
import com.cync.FactoringPages.BrokerCommissionPageFactoring;
import com.cync.FactoringPages.BrokerFeeSetupPageFactoring;
import com.cync.FactoringPages.BrokerSetupPageFactoring;
import com.cync.FactoringPages.BucketAgingPageFactoring;
import com.cync.FactoringPages.CashReceiptPageFactoring;
import com.cync.FactoringPages.CashReservePageFactoring;
import com.cync.FactoringPages.ClientFundedARAgingReportPage;
import com.cync.FactoringPages.ClientSummaryPageFactoring;
import com.cync.FactoringPages.CollectionTicklerPageFactoring;
import com.cync.FactoringPages.CommentsPageFactoring;
import com.cync.FactoringPages.ContactsPageFactoring;
import com.cync.FactoringPages.CreditMemoAdjustmentPage;
import com.cync.FactoringPages.CreditMemoHistoryPage;
import com.cync.FactoringPages.CreditQueuePageFactoring;
import com.cync.FactoringPages.CreditSourcesPageFactoring;
import com.cync.FactoringPages.DataUploadPage;
import com.cync.FactoringPages.DebtorMatchingPageFactoring;
import com.cync.FactoringPages.DepositUploadPage;
import com.cync.FactoringPages.DuplicateInvoicesPageFactoring;
import com.cync.FactoringPages.ExceptionsPageFactoring;
import com.cync.FactoringPages.FactoringChargeCodesPage;
import com.cync.FactoringPages.FactoringChargesTemplatePage;
import com.cync.FactoringPages.FactoringClientCreationPage;
import com.cync.FactoringPages.FactoringFileUploadPage;
import com.cync.FactoringPages.FactoringGLSetupPage;
import com.cync.FactoringPages.FactoringGLTransactionsPage;
import com.cync.FactoringPages.FactoringMigrationPage;
import com.cync.FactoringPages.FollowUpActionsPageFactoring;
import com.cync.FactoringPages.FundedInvoicesPageFactoring;
import com.cync.FactoringPages.FundsEmployedPageFactoring;
import com.cync.FactoringPages.GlobalDebtorPageFactoring;
import com.cync.FactoringPages.InactiveClientsPageFactoring;
import com.cync.FactoringPages.IneligiblePageFactoring;
import com.cync.FactoringPages.InvoiceStatusPageFactoring;
import com.cync.FactoringPages.InvoiceValidationTemplatePage;
import com.cync.FactoringPages.InvoiceValidationTemplatePageFactoring;
import com.cync.FactoringPages.LegalContentPageFactoring;
import com.cync.FactoringPages.LetterAuditPageFactoring;
import com.cync.FactoringPages.LetterProcessingPageFactoring;
import com.cync.FactoringPages.LetterTrackingPageFactoring;
import com.cync.FactoringPages.MailAddressPageFactoring;
import com.cync.FactoringPages.ManualEntryPage;
import com.cync.FactoringPages.MappingListViewPageFactoring;
import com.cync.FactoringPages.MiscellaneousPageFactoring;
import com.cync.FactoringPages.NewInvoicesPage;
import com.cync.FactoringPages.PreVerificationPageFactoring;
import com.cync.FactoringPages.ProcessedBatchesPages;
import com.cync.FactoringPages.ProcessingHistoryPageFactoring;
import com.cync.FactoringPages.RecoursePageFactoring;
import com.cync.FactoringPages.RepaymentReportPage;
import com.cync.FactoringPages.ReportCommentsPage;
import com.cync.FactoringPages.ReportCommentsPageFactoring;
import com.cync.FactoringPages.ReportsFactoringPage;
import com.cync.FactoringPages.ReserveReleasePageFactoring;
import com.cync.FactoringPages.TermCodesPageFactoring;
import com.cync.FactoringPages.Ungrouped_checksPage;
import com.cync.FactoringPages.VerifiedPageFactoring;
import com.cync.FactoringPages.WarningPageFactoring;
import com.cync.base.BaseTest;
import com.cync.base.ExtentTestManager;
import com.cync.pages.CyncHomePage;
import com.cync.pages.LoginPage;
import com.cync.utility.TestGroups;
import com.cync.utility.TestUtil;
import com.cync.utility.Xls_Reader;
import com.relevantcodes.extentreports.LogStatus;

import java.awt.event.KeyEvent;	


//@author:Aatish
public class FactoringPageBreak_TC extends BaseTest {
	
	Xls_Reader xls_reader = new Xls_Reader(System.getProperty("user.dir")
			+ "\\TestDataProvider\\FactoringPageBreak.xlsx");
	
	
	
	
	@Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION }, testName = "Navigating to Create Factoring Client Page")
		
      public void TC_01_navigatetoFactoringClientCreation_Verifypageheader()
{

           ExtentTestManager.getTest().getTest().setName("TC_01_Verify navigation to Factoring Client Creation page");
           ExtentTestManager.getTest().assignCategory("Module: Factoring_PageBreak");
         
       
           //Step1: navigate to Factoring CLient Creation page
           FactoringClientCreationPage factClient = cyncHomePage.getCyncMenus().openFactoringClientCreation();
          
           //Step2: verify the Header
           String Header = "Client Information";
           Assert.assertEquals(factClient.VerifyHeader(Header),Header);
           ExtentTestManager.getTest().log(LogStatus.PASS,"Successfully navigated to Factoring CLient Creation Page");
          
           /*Assert.assertTrue(cyncHomePage.getCyncMenus().selectClientFromDropDown(clientname));
           ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully selected the client from dropdown");
           */
           

       }
	
	 @Test(dataProvider = "PageBreak",groups = { TestGroups.SMOKE, TestGroups.REGRESSION }, testName = "Navigating to Basicparameter page ")
		
     public void TC_02_navigatetoBasicparameter_Verifypageheader(String clientname){
		  ExtentTestManager.getTest().getTest().setName("TC_02_Verify navigation to Basicparameter page");
         ExtentTestManager.getTest().assignCategory("Module: Factoring ");  
         
         Assert.assertTrue(cyncHomePage.getCyncMenus().selectClientFromDropDown(clientname));
         ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully selected the client from dropdown");
         
         //Strep1: navigate to Basicparameter page
         BasicParametersPageFactoring fact = cyncHomePage.getCyncMenus().openBasicparameterFactoring();
         //Step2: verify the Header  
         String Header = "Basic Parameters";
         //Assert.assertEquals(fact.PageHeaderVerify(Header),Header);
         Assert.assertEquals(fact.VerifyRetentionActionPending(Header),Header);
         ExtentTestManager.getTest().log(LogStatus.PASS,"Successfully navigated to Basicparameter Factoring Page Page");
		  
	  }
	 
	 @Test(dataProvider="PageBreak",groups = { TestGroups.SMOKE, TestGroups.REGRESSION }, testName = "Navigating to Report Comments Page")
		
	   public void TC_03_navigatetoReportCommentsPage_Verifypageheader(String clientname)
	   {

	              ExtentTestManager.getTest().getTest().setName("TC_03_Verify navigation to ReportComments page");
	              ExtentTestManager.getTest().assignCategory("Module: Factoring ");
	              //  LoginPage loginPage = new LoginPage(driver);
	         
	              Assert.assertTrue(cyncHomePage.getCyncMenus().selectClientFromDropDown(clientname));
	              ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully selected the client from dropdown");
	              
	              //Step1: navigate to ReportComments
	              ReportCommentsPageFactoring factClient = cyncHomePage.getCyncMenus().openReportCommentsPageFactoring();
	             
	              //Step2: verify the Header
	              String Header = " Report Comments ";
	              Assert.assertEquals(factClient.PageHeaderVerify(Header),Header);
	              ExtentTestManager.getTest().log(LogStatus.PASS,"Successfully navigated to ReportComments Page");
	   
	   }
	 
	 @Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION }, testName = "Navigating to Exceptions Page")
	   
	   public void TC_04_navigatetoExceptionsPageFactoring_Verifypageheader()
	   {

	              ExtentTestManager.getTest().getTest().setName("TC_04_Verify navigation to ExceptionsPageFactoring");
	              ExtentTestManager.getTest().assignCategory("Module: Factoring ");
	              
	              //Step1: navigate to ExceptionsPageFactoring
	              ExceptionsPageFactoring factClient = cyncHomePage.getCyncMenus().openExceptionsPageFactoring();
	             
	              //Step2: verify the Header
	              String Header = "Exceptions ";
	              Assert.assertEquals(factClient.PageHeaderVerify(Header),Header);
	              ExtentTestManager.getTest().log(LogStatus.PASS,"Successfully navigated to ExceptionsPageFactoring");
	   
	   }
	   @Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION }, testName = "Navigating to Comments Page")
	
	   public void TC_05_navigatetoCommentsPage_Verifypageheader()
	   {

	              ExtentTestManager.getTest().getTest().setName("TC_05_Verify navigation to Comments page");
	              ExtentTestManager.getTest().assignCategory("Module: Factoring ");
	            
	      		
	              //Step1: navigate to 
	              CommentsPageFactoring factClient = cyncHomePage.getCyncMenus().openCommentsPageFactoring();
	             
	              //Step2: verify the Header
	              String Header = "Comments ";
	              Assert.assertEquals(factClient.PageHeaderVerify(Header),Header);
	              ExtentTestManager.getTest().log(LogStatus.PASS,"Successfully navigated to Comments Page");
	   
	   }
	   
	  @Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION }, testName = "Navigating to ActivityTickler page")
		
      public void TC_06_navigatetoActivityTicklerPageFactoring_Verifypageheader(){
		  ExtentTestManager.getTest().getTest().setName("TC_06_Verify navigation to ActivityTickler page");
          ExtentTestManager.getTest().assignCategory("Module: Factoring ");  
		  
          //Strep1: navigate to MappingListView page
          ActivityTicklerPageFactoring fact = cyncHomePage.getCyncMenus().openActivityTicklerPageFactoring();
          //Step2: verify the Header  
          String Header = "Activity Tickler";
          Assert.assertEquals(fact.PageHeaderVerify(Header),Header);
          ExtentTestManager.getTest().log(LogStatus.PASS,"Successfully navigated to ActivityTicklerPageFactoring Factoring Page Page");
		  
	  }
	  
	  @Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION }, testName = "Navigating to MappingListView page")
	
      public void TC_07_navigatetoMappingListView_Verifypageheader(){
		  ExtentTestManager.getTest().getTest().setName("TC_07_Verify navigation to MappingListView page");
          ExtentTestManager.getTest().assignCategory("Module: Factoring ");  
		  
          //Strep1: navigate to MappingListView page
          MappingListViewPageFactoring fact = cyncHomePage.getCyncMenus().openMappingListViewPageFactoring();
          //Step2: verify the Header  
          String Header = "Mapping List View";
          Assert.assertEquals(fact.PageHeaderVerify(Header),Header);
          ExtentTestManager.getTest().log(LogStatus.PASS,"Successfully navigated to MappingListView Factoring Page Page");
		  
	  }
	  
	  @Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION }, testName = "Navigating to FactoringFeeSetup page")
		
      public void TC_08_navigatetoFactoringFeeSetupPage_Verifypageheader(){
		  ExtentTestManager.getTest().getTest().setName("TC_08_Verify navigation to FactoringFeeSetup page");
          ExtentTestManager.getTest().assignCategory("Module: Factoring ");  
		  
        //Strep1: navigate to MappingListView page
         FactoringFeeSetupPage fact = cyncHomePage.getCyncMenus().openFactoringFeeSetup();
        //Step2: verify the Header  
          String Header = "FactoringFeeSetup";
          Assert.assertEquals(fact.VerifyHeader(Header),Header);
          ExtentTestManager.getTest().log(LogStatus.PASS,"Successfully navigated to FactoringFeeSetup Page");
		  
	  }
	  @Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION }, testName = "Navigating to FactoringChargesTemplatePage page")
		
      public void TC_09_navigatetoFactoringChargesTemplatePage_Verifypageheader(){
		  ExtentTestManager.getTest().getTest().setName("TC_09_Verify navigation to FactoringChargesTemplatePage page");
          ExtentTestManager.getTest().assignCategory("Module: Factoring ");  
		  
        //Strep1: navigate to MappingListView page
          FactoringChargesTemplatePage fact = cyncHomePage.getCyncMenus().openFactoringChargesTemplatePage();
        //Step2: verify the Header  
          String Header = "Factoring Charges Template";
          Assert.assertEquals(fact.PageHeaderVerify(Header),Header);
          ExtentTestManager.getTest().log(LogStatus.PASS,"Successfully navigated to FactoringChargesTemplate Factoring Page Page");
		  
	  }
	  
	  @Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION }, testName = "Navigating to AutoProcessingFeeSetupPageFactoring")
		
      public void TC_10_navigatetoAutoProcessingFeeSetupPageFactoring_Verifypageheader(){
		  ExtentTestManager.getTest().getTest().setName("TC_10_Verify navigation to AutoProcessingFeeSetupPageFactoring");
          ExtentTestManager.getTest().assignCategory("Module: Factoring ");  
		  
        //Strep1: navigate to AutoProcessingFeeSetupPageFactoring
          AutoProcessingFeeSetupPageFactoring fact = cyncHomePage.getCyncMenus().openAutoProcessingFeeSetupPageFactoring();
        //Step2: verify the Header  
          String Header = "Auto Processing Fee Setup";
          Assert.assertEquals(fact.PageHeaderVerify(Header),Header);
          ExtentTestManager.getTest().log(LogStatus.PASS,"Successfully navigated to AutoProcessingFeeSetupPageFactoring");
		  
	 } 
	  
	  @Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION }, testName = "Navigating to BasicClientDetailPageFactoring")
		
      public void TC_11_navigatetoBasicClientDetailPageFactoring_Verifypageheader(){
		  ExtentTestManager.getTest().getTest().setName("TC_11_Verify navigation to BasicClientDetailPageFactoring");
          ExtentTestManager.getTest().assignCategory("Module: Factoring ");  
		  
        //Strep1: navigate to page
          BasicClientDetailPageFactoring fact = cyncHomePage.getCyncMenus().openBasicClientDetailPageFactoring();
        //Step2: verify the Header  
          String Header = "Basic Client Detail";
          Assert.assertEquals(fact.PageHeaderVerify(Header),Header);
          ExtentTestManager.getTest().log(LogStatus.PASS,"Successfully navigated to BasicClientDetailPageFactoring");
		  
	  }
	 
	  @Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION }, testName = "Navigating to MailAddressPageFactoring")
		
      public void TC_12_navigatetoMailAddressPageFactoring_Verifypageheader(){
		  ExtentTestManager.getTest().getTest().setName("TC_12_Verify navigation to MailAddressPageFactoring");
          ExtentTestManager.getTest().assignCategory("Module: Factoring ");  
		  
        //Step1: navigate to  page
          MailAddressPageFactoring fact = cyncHomePage.getCyncMenus().openMailAddressPageFactoring();
        //Step2: verify the Header  
          String Header = " Address Information  ";
          Assert.assertEquals(fact.PageHeaderVerify(Header),Header);
          ExtentTestManager.getTest().log(LogStatus.PASS,"Successfully navigated to MailAddressPageFactoring");
		  
	  }
	  
	  @Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION }, testName = "Navigating to ContactsPageFactoring")
		
      public void TC_13_navigatetoContactsPageFactoring_Verifypageheader(){
		  ExtentTestManager.getTest().getTest().setName("TC_13_Verify navigation to ContactsPageFactoring");
          ExtentTestManager.getTest().assignCategory("Module: Factoring ");  
		  
        //Step1: navigate to ContactsPageFactoring
          ContactsPageFactoring fact = cyncHomePage.getCyncMenus().openContactsPageFactoring();
        //Step2: verify the Header  
          String Header = "Contact Information";
          Assert.assertEquals(fact.PageHeaderVerify(Header),Header);
          ExtentTestManager.getTest().log(LogStatus.PASS,"Successfully navigated to ContactsPageFactoring");
		  
	  }
	  
	  @Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION }, testName = "Navigating to MiscellaneousPageFactoring")
		
      public void TC_14_navigatetoMiscellaneousPageFactoring_Verifypageheader(){
		  ExtentTestManager.getTest().getTest().setName("TC_14_Verify navigation to MiscellaneousPageFactoring");
          ExtentTestManager.getTest().assignCategory("Module: Factoring ");  
		  
        //Step1: navigate to MiscellaneousPageFactoring
          MiscellaneousPageFactoring fact = cyncHomePage.getCyncMenus().openMiscellaneousPageFactoring();
        //Step2: verify the Header  
          String Header = "Miscellaneous";
          Assert.assertEquals(fact.PageHeaderVerify(Header),Header);
          ExtentTestManager.getTest().log(LogStatus.PASS,"Successfully navigated to MiscellaneousPageFactoring");
		  
	  }
	  
	  @Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION }, testName = "Navigating to LegalContentPageFactoring")
		
      public void TC_15_navigatetoLegalContentPageFactoring_Verifypageheader(){
		  ExtentTestManager.getTest().getTest().setName("TC_15_Verify navigation to LegalContentPageFactoring");
          ExtentTestManager.getTest().assignCategory("Module: Factoring ");  
		  
        //Step1: navigate to LegalContentPageFactoring
          LegalContentPageFactoring fact = cyncHomePage.getCyncMenus().openLegalContentPageFactoring();
        //Step2: verify the Header  
          String Header = "Legal Content";
          Assert.assertEquals(fact.PageHeaderVerify(Header),Header);
          ExtentTestManager.getTest().log(LogStatus.PASS,"Successfully navigated to LegalContentPageFactoring");
		  
	  }
	  
	  @Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION }, testName = "Navigating to ClientSummaryPageFactoring")
		
      public void TC_16_navigatetoClientSummaryPageFactoring_Verifypageheader(){
		  ExtentTestManager.getTest().getTest().setName("TC_16_Verify navigation to ClientSummaryPageFactoring");
          ExtentTestManager.getTest().assignCategory("Module: Factoring ");  
		  
        //Step1: navigate to ClientSummaryPageFactoring
          ClientSummaryPageFactoring fact = cyncHomePage.getCyncMenus().openClientSummaryPageFactoring();
        //Step2: verify the Header  
          String Header = "Client Summary";
          Assert.assertEquals(fact.PageHeaderVerify(Header),Header);
          ExtentTestManager.getTest().log(LogStatus.PASS,"Successfully navigated to ClientSummaryPageFactoring");
		  
	  }
	  
	  @Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION }, testName = "Navigating to InactiveClientsPageFactoring")
		
      public void TC_17_navigatetoInactiveClientsPageFactoring_Verifypageheader(){
		  ExtentTestManager.getTest().getTest().setName("TC_17_Verify navigation to InactiveClientsPageFactoring");
          ExtentTestManager.getTest().assignCategory("Module: Factoring ");  
		  
        //Step1: navigate to InactiveClientsPageFactoring
          InactiveClientsPageFactoring fact = cyncHomePage.getCyncMenus().openInactiveClientsPageFactoring();
        //Step2: verify the Header  
          String Header = "Inactive Clients";
          Assert.assertEquals(fact.PageHeaderVerify(Header),Header);
          ExtentTestManager.getTest().log(LogStatus.PASS,"Successfully navigated to InactiveClientsPageFactoring");
		  
	  }
	 
	  @Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION }, testName = "Navigating to FactoringFileUploadsPage")
		
      public void TC_18_navigatetoFactoringFileUploadsPage_Verifypageheader(){
		  ExtentTestManager.getTest().getTest().setName("TC_18_Verify navigation to FactoringFileUploadsPage");
          ExtentTestManager.getTest().assignCategory("Module: Factoring ");  
		  
        //Step1: navigate to FactoringFileUploadsPage
          FactoringFileUploadPage  fact = cyncHomePage.getCyncMenus().openFactoringFileUploadsPage();
        //Step2: verify the Header  
          String Header = "Factoring File Uploads";
          Assert.assertEquals(fact.PageHeaderVerify(Header),Header);
          ExtentTestManager.getTest().log(LogStatus.PASS,"Successfully navigated to FactoringFileUploadsPage");
	  }
	  
	  @Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION }, testName = "Navigating to DataUploadPageFactoring")
		
      public void TC_19_navigatetoDataUploadPageFactoring_Verifypageheader(){
		  ExtentTestManager.getTest().getTest().setName("TC_19_Verify navigation to DataUploadPageFactoring");
          ExtentTestManager.getTest().assignCategory("Module: Factoring ");  
		  
        //Step1: navigate to DataUploadPageFactoring
          DataUploadPage  fact = cyncHomePage.getCyncMenus().openDataUploadPageFactoring();
        //Step2: verify the Header  
          String Header = "Data Upload";
          Assert.assertEquals(fact.PageHeaderVerify(Header),Header);
          ExtentTestManager.getTest().log(LogStatus.PASS,"Successfully navigated to DataUploadPageFactoring");
	  }
	  
	  @Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION }, testName = "Navigating to ManualEntryPageFactoring")
		
      public void TC_20_navigatetoManualEntryPageFactoring_Verifypageheader(){
		  ExtentTestManager.getTest().getTest().setName("TC_20_Verify navigation to ManualEntryPageFactoring");
          ExtentTestManager.getTest().assignCategory("Module: Factoring ");  
		  
        //Step1: navigate to ManualEntryPageFactoring
          ManualEntryPage  fact = cyncHomePage.getCyncMenus().openManualEntryPageFactoring();
        //Step2: verify the Header  
          String Header = "Manual Entry";
         // Assert.assertEquals(fact.PageHeaderVerify(Header),Header);
          ExtentTestManager.getTest().log(LogStatus.PASS,"Successfully navigated to ManualEntryPageFactoring");
	  }
	  
	  @Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION }, testName = "Navigating to NewInvoicesPageFactoring")
		
      public void TC_21_navigatetoNewInvoicesPageFactoring_Verifypageheader(){
		  ExtentTestManager.getTest().getTest().setName("TC_21_Verify navigation to NewInvoicesPageFactoring");
          ExtentTestManager.getTest().assignCategory("Module: Factoring ");  
		  
        //Step1: navigate to NewInvoicesPageFactoring
          NewInvoicesPage fact = cyncHomePage.getCyncMenus().openNewInvoicesPage();
        //Step2: verify the Header  
          String Header = "New Invoices";
         // Assert.assertEquals(fact.PageHeaderVerify(Header),Header);
          ExtentTestManager.getTest().log(LogStatus.PASS,"Successfully navigated to NewInvoicesPageFactoring");
	  }
	  @Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION }, testName = "Navigating to DuplicateInvoicesPageFactoring")
		
      public void TC_22_navigatetoDuplicateInvoicesPageFactoring_Verifypageheader(){
		  ExtentTestManager.getTest().getTest().setName("TC_22_Verify navigation to DuplicateInvoicesPageFactoring");
          ExtentTestManager.getTest().assignCategory("Module: Factoring ");  
		  
        //Step1: navigate to DuplicateInvoicesPageFactoring
          DuplicateInvoicesPageFactoring fact = cyncHomePage.getCyncMenus().openDuplicateInvoicesPage();
        //Step2: verify the Header  
          String Header = "Duplicate Invoices";
          Assert.assertEquals(fact.PageHeaderVerify(Header),Header);
          ExtentTestManager.getTest().log(LogStatus.PASS,"Successfully navigated to DuplicateInvoicesPageFactoring");
	  }
	  @Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION }, testName = "Navigating to IneligiblePageFactoring")
		
      public void TC_23_navigatetoIneligiblePageFactoring_Verifypageheader(){
		  ExtentTestManager.getTest().getTest().setName("TC_23_Verify navigation to IneligiblePageFactoring");
          ExtentTestManager.getTest().assignCategory("Module: Factoring ");  
		  
        //Step1: navigate to IneligiblePageFactoring
          IneligiblePageFactoring  fact = cyncHomePage.getCyncMenus().openIneligiblePageFactoring();
        //Step2: verify the Header IneligiblePageFactoring  
          String Header = "Ineligible";
         // Assert.assertEquals(fact.PageHeaderVerify(Header),Header);
          ExtentTestManager.getTest().log(LogStatus.PASS,"Successfully navigated to IneligiblePageFactoring");
	  }
	  @Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION }, testName = "Navigating to PreVerificationPageFactoring")
		
      public void TC_24_navigatetoPreVerificationPageFactoring_Verifypageheader(){
		  ExtentTestManager.getTest().getTest().setName("TC_24_Verify navigation to PreVerificationPageFactoring");
          ExtentTestManager.getTest().assignCategory("Module: Factoring ");  
		  
        //Step1: navigate to PreVerificationPageFactoring
          PreVerificationPageFactoring  fact = cyncHomePage.getCyncMenus().openPreVerificationPageFactoring();
        //Step2: verify the Header  
          String Header = "Pre-Verification";
          Assert.assertEquals(fact.PageHeaderVerify(Header),Header);
          ExtentTestManager.getTest().log(LogStatus.PASS,"Successfully navigated to PreVerificationPageFactoring");
	  }
	  @Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION }, testName = "Navigating to VerifiedPageFactoring")
		
      public void TC_25_navigatetoVerifiedPageFactoring_Verifypageheader(){
		  ExtentTestManager.getTest().getTest().setName("TC_25_Verify navigation to VerifiedPageFactoring");
          ExtentTestManager.getTest().assignCategory("Module: Factoring ");  
		  
        //Step1: navigate to VerifiedPageFactoring
          VerifiedPageFactoring fact = cyncHomePage.getCyncMenus().openVerifiedPageFactoring();
        //Step2: verify the Header  
          String Header = "Verified";
          Assert.assertEquals(fact.PageHeaderVerify(Header),Header);
          ExtentTestManager.getTest().log(LogStatus.PASS,"Successfully navigated to VerifiedPageFactoring");
	  }
	  @Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION }, testName = "Navigating to FundedInvoicesPageFactoring")
		
      public void TC_26_navigatetoFundedInvoicesPageFactoring_Verifypageheader(){
		  ExtentTestManager.getTest().getTest().setName("TC_26_Verify navigation to FundedInvoicesPageFactoring");
          ExtentTestManager.getTest().assignCategory("Module: Factoring ");  
		  
        //Step1: navigate to FundedInvoicesPageFactoring
          FundedInvoicesPageFactoring fact = cyncHomePage.getCyncMenus().openFundedInvoicesPageFactoring();
        //Step2: verify the Header  
          String Header = "Funded Invoices";
          Assert.assertEquals(fact.PageHeaderVerify(Header),Header);
          ExtentTestManager.getTest().log(LogStatus.PASS,"Successfully navigated to FundedInvoicesPageFactoring");
	  }
	  @Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION }, testName = "Navigating to RecoursePageFactoring")
		
      public void TC_27_navigatetoRecoursePageFactoring_Verifypageheader(){
		  ExtentTestManager.getTest().getTest().setName("TC_27_Verify navigation to RecoursePageFactoring");
          ExtentTestManager.getTest().assignCategory("Module: Factoring ");  
		  
        //Step1: navigate to RecoursePageFactoring
          RecoursePageFactoring fact = cyncHomePage.getCyncMenus().openRecoursePageFactoring();
        //Step2: verify the Header  
          String Header = "Recourse";
          Assert.assertEquals(fact.PageHeaderVerify(Header),Header);
          ExtentTestManager.getTest().log(LogStatus.PASS,"Successfully navigated to RecoursePageFactoring");
	  }
	  @Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION }, testName = "Navigating to CashReceiptPageFactoring")
		
      public void TC_28_navigatetoCashReceiptPageFactoring_Verifypageheader(){
		  ExtentTestManager.getTest().getTest().setName("TC_28_Verify navigation to CashReceiptPageFactoring");
          ExtentTestManager.getTest().assignCategory("Module: Factoring ");  
		  
        //Step1: navigate to CashReceiptPageFactoring
          CashReceiptPageFactoring  fact = cyncHomePage.getCyncMenus().openCashReceiptPageFactoring();
        //Step2: verify the Header  
          String Header = "Cash Receipt";
          Assert.assertEquals(fact.PageHeaderVerify(Header),Header);
          ExtentTestManager.getTest().log(LogStatus.PASS,"Successfully navigated to CashReceiptPageFactoring");
	  }
	  @Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION }, testName = "Navigating to CashReservePageFactoring")
		
      public void TC_29_navigatetoCashReservePageFactoring_Verifypageheader(){
		  ExtentTestManager.getTest().getTest().setName("TC_29_Verify navigation to CashReservePageFactoring");
          ExtentTestManager.getTest().assignCategory("Module: Factoring ");  
		  
        //Step1: navigate to CashReservePageFactoring
          CashReservePageFactoring  fact = cyncHomePage.getCyncMenus().openCashReservePageFactoring();
        //Step2: verify the Header  
          String Header = "Cash Reserve";
          Assert.assertEquals(fact.PageHeaderVerify(Header),Header);
          ExtentTestManager.getTest().log(LogStatus.PASS,"Successfully navigated to CashReservePageFactoring");
	  }
	  @Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION }, testName = "Navigating to EscrowReservePageFactoring")
		
      public void TC_navigateto_EscrowReservePageFactoring_Verifypageheader(){
		  ExtentTestManager.getTest().getTest().setName("TC_Verify navigation to EscrowReservePageFactoring");
          ExtentTestManager.getTest().assignCategory("Module: Factoring ");  
		  
        //Step1: navigate to CashReservePageFactoring
          CashReservePageFactoring  fact = cyncHomePage.getCyncMenus().openCashReservePageFactoring();
        //Step2: verify the Header  
          String Header = " Escrow Reserve";
          Assert.assertEquals(fact.PageHeaderVerify(Header),Header);
          ExtentTestManager.getTest().log(LogStatus.PASS,"Successfully navigated to EscrowReservePageFactoring");
	  }
	  
	  
	  @Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION }, testName = "Navigating to ReserveReleasePageFactoring")
		
      public void TC_30_navigatetoReserveReleasePageFactoring_Verifypageheader(){
		  ExtentTestManager.getTest().getTest().setName("TC_30_Verify navigation to ReserveReleasePageFactoring");
          ExtentTestManager.getTest().assignCategory("Module: Factoring ");  
		  
        //Step1: navigate to ReserveReleasePageFactoring
          ReserveReleasePageFactoring fact = cyncHomePage.getCyncMenus().openReserveReleasePageFactoring();
        //Step2: verify the Header  
          String Header = "Reserve Release";
          Assert.assertEquals(fact.PageHeaderVerify(Header),Header);
          ExtentTestManager.getTest().log(LogStatus.PASS,"Successfully navigated to ReserveReleasePageFactoring");
	  }
	  @Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION }, testName = "Navigating to FactoringChargeCodesPage")
		
      public void TC_31_navigatetoFactoringChargeCodesPage_Verifypageheader(){
		  ExtentTestManager.getTest().getTest().setName("TC_31_Verify navigation to FactoringChargeCodesPage");
          ExtentTestManager.getTest().assignCategory("Module: Factoring ");  
		  
        //Step1: navigate to FactoringChargeCodesPage
          FactoringChargeCodesPage  fact = cyncHomePage.getCyncMenus().openFactoringChargeCodesPage();
        //Step2: verify the Header  
          String Header = "Factoring Charge Codes";
          Assert.assertEquals(fact.PageHeaderVerify(Header),Header);
          ExtentTestManager.getTest().log(LogStatus.PASS,"Successfully navigated to FactoringChargeCodesPage");
	  }
	  @Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION }, testName = "Navigating to TermCodesPageFactoring")
		
      public void TC_32_navigatetoTermCodesPageFactoring_Verifypageheader(){
		  ExtentTestManager.getTest().getTest().setName("TC_32_Verify navigation to TermCodesPageFactoring");
          ExtentTestManager.getTest().assignCategory("Module: Factoring ");  
		  
        //Step1: navigate to TermCodesPageFactoring
          TermCodesPageFactoring  fact = cyncHomePage.getCyncMenus().openTermCodesPageFactoring();
        //Step2: verify the Header  
          String Header = " Term Codes";
          Assert.assertEquals(fact.PageHeaderVerify(Header),Header);
          ExtentTestManager.getTest().log(LogStatus.PASS,"Successfully navigated to TermCodesPageFactoring");
	  }
	  @Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION }, testName = "Navigating to InvoiceStatusPageFactoring")
		
      public void TC_33_navigatetoInvoiceStatusPageFactoring_Verifypageheader(){
		  ExtentTestManager.getTest().getTest().setName("TC_33_Verify navigation to InvoiceStatusPageFactoring");
          ExtentTestManager.getTest().assignCategory("Module: Factoring ");  
		  
        //Step1: navigate to InvoiceStatusPageFactoring
          InvoiceStatusPageFactoring fact = cyncHomePage.getCyncMenus().openInvoiceStatusPageFactoring();
        //Step2: verify the Header  
          String Header = "Invoice Status";
          Assert.assertEquals(fact.PageHeaderVerify(Header),Header);
          ExtentTestManager.getTest().log(LogStatus.PASS,"Successfully navigated to InvoiceStatusPageFactoring");
	  }
	  @Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION }, testName = "Navigating to BucketAgingPageFactoring")
		
      public void TC_34_navigatetoBucketAgingPageFactoring_Verifypageheader(){
		  ExtentTestManager.getTest().getTest().setName("TC_34_Verify navigation to BucketAgingPageFactoring");
          ExtentTestManager.getTest().assignCategory("Module: Factoring ");  
		  
        //Step1: navigate to BucketAgingPageFactoring
          BucketAgingPageFactoring fact = cyncHomePage.getCyncMenus().openBucketAgingPageFactoring();
        //Step2: verify the Header  
          String Header = "Bucket Aging";
          Assert.assertEquals(fact.PageHeaderVerify(Header),Header);
          ExtentTestManager.getTest().log(LogStatus.PASS,"Successfully navigated to BucketAgingPageFactoring");
	  }
	  @Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION }, testName = "Navigating to InvoiceValidationTemplatePageFactoring")
		
      public void TC_35_navigatetoInvoiceValidationTemplatePageFactoring_Verifypageheader(){
		  ExtentTestManager.getTest().getTest().setName("TC_35_Verify navigation to InvoiceValidationTemplatePageFactoring");
          ExtentTestManager.getTest().assignCategory("Module: Factoring ");  
		  
        //Step1: navigate to InvoiceValidationTemplatePageFactoring
          InvoiceValidationTemplatePageFactoring fact = cyncHomePage.getCyncMenus().openInvoiceValidationTemplatePageFactoring();
        //Step2: verify the Header  
          String Header = " Invoice validation Template ";
          Assert.assertEquals(fact.PageHeaderVerify(Header),Header);
          ExtentTestManager.getTest().log(LogStatus.PASS,"Successfully navigated to InvoiceValidationTemplatePageFactoring");
	  }
	  @Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION }, testName = "Navigating to FactoringGLSetupPage")
		
      public void TC_36_navigatetoFactoringGLSetupPage_Verifypageheader(){
		  ExtentTestManager.getTest().getTest().setName("TC_36_Verify navigation to FactoringGLSetupPage");
          ExtentTestManager.getTest().assignCategory("Module: Factoring ");  
		  
        //Step1: navigate to FactoringGLSetupPage
          FactoringGLSetupPage fact = cyncHomePage.getCyncMenus().openFactoringGLSetupPage();
        //Step2: verify the Header  
          String Header = " GL Accounts";
          Assert.assertEquals(fact.PageHeaderVerify(Header),Header);
          ExtentTestManager.getTest().log(LogStatus.PASS,"Successfully navigated to FactoringGLSetupPage");
	  }
	  @Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION }, testName = "Navigating to FactoringGLTransactionsPage")
		
      public void TC_37_navigatetoFactoringGLTransactionsPage_Verifypageheader(){
		  ExtentTestManager.getTest().getTest().setName("TC_37_Verify navigation to FactoringGLTransactionsPage");
          ExtentTestManager.getTest().assignCategory("Module: Factoring ");  
		  
        //Step1: navigate to FactoringGLTransactionsPage
          FactoringGLTransactionsPage fact = cyncHomePage.getCyncMenus().openFactoringGLTransactionsPage();
        //Step2: verify the Header  
          String Header = " Gl Transactions";
          Assert.assertEquals(fact.PageHeaderVerify(Header),Header);
          ExtentTestManager.getTest().log(LogStatus.PASS,"Successfully navigated to FactoringGLTransactionsPage");
	  }
	  @Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION }, testName = "Navigating to FactoringMigrationPage")
		
      public void TC_38_navigatetoFactoringMigrationPage_Verifypageheader(){
		  ExtentTestManager.getTest().getTest().setName("TC_38_Verify navigation to FactoringMigrationPage");
          ExtentTestManager.getTest().assignCategory("Module: Factoring ");  
		  
        //Step1: navigate to FactoringMigrationPage
          FactoringMigrationPage  fact = cyncHomePage.getCyncMenus().openFactoringMigrationPage();
        //Step2: verify the Header  
          String Header = " Data Migration";
          Assert.assertEquals(fact.PageHeaderVerify(Header),Header);
          ExtentTestManager.getTest().log(LogStatus.PASS,"Successfully navigated to FactoringMigrationPage");
	  }
	  @Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION }, testName = "Navigating to CreditSourcesPageFactoring")
		
      public void TC_39_navigatetoCreditSourcesPageFactoring_Verifypageheader(){
		  ExtentTestManager.getTest().getTest().setName("TC_39_Verify navigation to CreditSourcesPageFactoring");
          ExtentTestManager.getTest().assignCategory("Module: Factoring ");  
		  
        //Step1: navigate to CreditSourcesPageFactoring
          CreditSourcesPageFactoring   fact = cyncHomePage.getCyncMenus().openCreditSourcesPageFactoring();
        //Step2: verify the Header  
          String Header = "Credit Sources";
          Assert.assertEquals(fact.PageHeaderVerify(Header),Header);
          ExtentTestManager.getTest().log(LogStatus.PASS,"Successfully navigated to CreditSourcesPageFactoring");
	  }
	  @Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION }, testName = "Navigating to FollowUpActionsPageFactoring")
		
      public void TC_40_navigatetoFollowUpActionsPageFactoring_Verifypageheader(){
		  ExtentTestManager.getTest().getTest().setName("TC_40_Verify navigation to FollowUpActionsPageFactoring");
          ExtentTestManager.getTest().assignCategory("Module: Factoring ");  
		  
        //Step1: navigate to FollowUpActionsPageFactoring
          FollowUpActionsPageFactoring  fact = cyncHomePage.getCyncMenus().openFollowUpActionsPageFactoring();
        //Step2: verify the Header  
          String Header = "Follow Up Actions";
          Assert.assertEquals(fact.PageHeaderVerify(Header),Header);
          ExtentTestManager.getTest().log(LogStatus.PASS,"Successfully navigated to FollowUpActionsPageFactoring");
	  }
	  @Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION }, testName = "Navigating to AccountDebtorPageFactoring")
		
      public void TC_41_navigatetoAccountDebtorPageFactoring_Verifypageheader(){
		  ExtentTestManager.getTest().getTest().setName("TC_41_Verify navigation to AccountDebtorPageFactoring");
          ExtentTestManager.getTest().assignCategory("Module: Factoring ");  
		  
        //Step1: navigate to AccountDebtorPageFactoring
          AccountDebtorPageFactoring fact = cyncHomePage.getCyncMenus().openAccountDebtorPageFactoring();
        //Step2: verify the Header  
          String Header = " Account Debtor ";
          Assert.assertEquals(fact.PageHeaderVerify(Header),Header);
          ExtentTestManager.getTest().log(LogStatus.PASS,"Successfully navigated to AccountDebtorPageFactoring");
	  }
	  @Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION }, testName = "Navigating to GlobalDebtorPageFactoring")
		
      public void TC_42_navigatetoGlobalDebtorPageFactoring_Verifypageheader(){
		  ExtentTestManager.getTest().getTest().setName("TC_42_Verify navigation to GlobalDebtorPageFactoring");
          ExtentTestManager.getTest().assignCategory("Module: Factoring ");  
		  
        //Step1: navigate to GlobalDebtorPageFactoring
          GlobalDebtorPageFactoring  fact = cyncHomePage.getCyncMenus().openGlobalDebtorPageFactoring();
        //Step2: verify the Header  
          String Header = " Global Debtor ";
          Assert.assertEquals(fact.PageHeaderVerify(Header),Header);
          ExtentTestManager.getTest().log(LogStatus.PASS,"Successfully navigated to GlobalDebtorPageFactoring");
	  }
	  @Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION }, testName = "Navigating to DebtorMatchingPageFactoring")
		
      public void TC_43_navigatetoDebtorMatchingPageFactoring_Verifypageheader(){
		  ExtentTestManager.getTest().getTest().setName("TC_43_Verify navigation to DebtorMatchingPageFactoring");
          ExtentTestManager.getTest().assignCategory("Module: Factoring ");  
		  
        //Step1: navigate to DebtorMatchingPageFactoring
          DebtorMatchingPageFactoring fact = cyncHomePage.getCyncMenus().openDebtorMatchingPageFactoring();
        //Step2: verify the Header  
          String Header = "Debtor Matching";
          Assert.assertEquals(fact.PageHeaderVerify(Header),Header);
          ExtentTestManager.getTest().log(LogStatus.PASS,"Successfully navigated to DebtorMatchingPageFactoring");
	  }
	  @Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION }, testName = "Navigating to LetterProcessingPageFactoring")
		
      public void TC_44_navigatetoLetterProcessingPageFactoring_Verifypageheader(){
		  ExtentTestManager.getTest().getTest().setName("TC_44_Verify navigation to LetterProcessingPageFactoring");
          ExtentTestManager.getTest().assignCategory("Module: Factoring ");  
		  
        //Step1: navigate to LetterProcessingPageFactoring
          LetterProcessingPageFactoring fact = cyncHomePage.getCyncMenus().openLetterProcessingPageFactoring();
        //Step2: verify the Header  
          String Header = "Letter Processing ";
          Assert.assertEquals(fact.PageHeaderVerify(Header),Header);
          ExtentTestManager.getTest().log(LogStatus.PASS,"Successfully navigated to LetterProcessingPageFactoring");
	  }
	  @Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION }, testName = "Navigating to LetterTrackingPageFactoring")
		
      public void TC_45_navigatetoLetterTrackingPageFactoring_Verifypageheader(){
		  ExtentTestManager.getTest().getTest().setName("TC_45_Verify navigation to LetterTrackingPageFactoring");
          ExtentTestManager.getTest().assignCategory("Module: Factoring ");  
		  
        //Step1: navigate to LetterTrackingPageFactoring
          LetterTrackingPageFactoring  fact = cyncHomePage.getCyncMenus().openLetterTrackingPageFactoring();
        //Step2: verify the Header  
          String Header = "Letter Tracking";
          Assert.assertEquals(fact.PageHeaderVerify(Header),Header);
          ExtentTestManager.getTest().log(LogStatus.PASS,"Successfully navigated to LetterTrackingPageFactoring");
	  }
	  @Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION }, testName = "Navigating to LetterAuditPageFactoring")
		
      public void TC_46_navigatetoLetterAuditPageFactoring_Verifypageheader(){
		  ExtentTestManager.getTest().getTest().setName("TC_46_Verify navigation to LetterAuditPageFactoring");
          ExtentTestManager.getTest().assignCategory("Module: Factoring ");  
		  
        //Step1: navigate to LetterAuditPageFactoring
          LetterAuditPageFactoring fact = cyncHomePage.getCyncMenus().openLetterAuditPageFactoring();
        //Step2: verify the Header  
          String Header = "Letter Audit";
          Assert.assertEquals(fact.PageHeaderVerify(Header),Header);
          ExtentTestManager.getTest().log(LogStatus.PASS,"Successfully navigated to LetterAuditPageFactoring");
	  }
	  @Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION }, testName = "Navigating to ACDebtorStatusPageFactoring")
		
      public void TC_47_navigatetoACDebtorStatusPageFactoring_Verifypageheader(){
		  ExtentTestManager.getTest().getTest().setName("TC_47_Verify navigation to ACDebtorStatusPageFactoring");
          ExtentTestManager.getTest().assignCategory("Module: Factoring ");  
		  
        //Step1: navigate to ACDebtorStatusPageFactoring
          ACDebtorStatusPageFactoring fact = cyncHomePage.getCyncMenus().openACDebtorStatusPageFactoring();
        //Step2: verify the Header  
          String Header = "A/C Debtor Status";
          Assert.assertEquals(fact.PageHeaderVerify(Header),Header);
          ExtentTestManager.getTest().log(LogStatus.PASS,"Successfully navigated to ACDebtorStatusPageFactoring");
	  }
	  
	  @Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION }, testName = "Navigating to BrokerSetupPageFactoring")
		
      public void TC_48_navigatetoBrokerSetupPageFactoring_Verifypageheader(){
		  ExtentTestManager.getTest().getTest().setName("TC_48_Verify navigation to BrokerSetupPageFactoring");
          ExtentTestManager.getTest().assignCategory("Module: Factoring ");  
		  
        //Step1: navigate to BrokerSetupPageFactoring
          BrokerSetupPageFactoring fact = cyncHomePage.getCyncMenus().openBrokerSetupPageFactoring();
        //Step2: verify the Header  
          String Header = " Broker Setup ";
          Assert.assertEquals(fact.PageHeaderVerify(Header),Header);
          ExtentTestManager.getTest().log(LogStatus.PASS,"Successfully navigated to BrokerSetupPageFactoring");
	  }
	  @Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION }, testName = "Navigating to BrokerBankInformationPageFactoring")
		
      public void TC_49_navigatetoBrokerBankInformationPageFactoring_Verifypageheader(){
		  ExtentTestManager.getTest().getTest().setName("TC_49_Verify navigation to BrokerBankInformationPageFactoring");
          ExtentTestManager.getTest().assignCategory("Module: Factoring ");  
		  
        //Step1: navigate to BrokerBankInformationPageFactoring
          BrokerBankInformationPageFactoring  fact = cyncHomePage.getCyncMenus().openBrokerBankInformationPageFactoring();
        //Step2: verify the Header  
          String Header = " Broker Bank Information";
          Assert.assertEquals(fact.PageHeaderVerify(Header),Header);
          ExtentTestManager.getTest().log(LogStatus.PASS,"Successfully navigated to BrokerBankInformationPageFactoring");
	  }
	  @Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION }, testName = "Navigating to BrokerFeeSetupPageFactoring")
		
      public void TC_50_navigatetoBrokerFeeSetupPageFactoring_Verifypageheader(){
		  ExtentTestManager.getTest().getTest().setName("TC_50_Verify navigation to BrokerFeeSetupPageFactoring");
          ExtentTestManager.getTest().assignCategory("Module: Factoring ");  
		  
        //Step1: navigate to BrokerFeeSetupPageFactoring
          BrokerFeeSetupPageFactoring  fact = cyncHomePage.getCyncMenus().openBrokerFeeSetupPageFactoring();
        //Step2: verify the Header  
          String Header = " Broker Fee Setup";
          Assert.assertEquals(fact.PageHeaderVerify(Header),Header);
          ExtentTestManager.getTest().log(LogStatus.PASS,"Successfully navigated to BrokerFeeSetupPageFactoring");
	  }
	  @Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION }, testName = "Navigating to BrokerCommissionPageFactoring")
		
      public void TC_51_navigatetoBrokerCommissionPageFactoring_Verifypageheader(){
		  ExtentTestManager.getTest().getTest().setName("TC_51_Verify navigation to BrokerCommissionPageFactoring");
          ExtentTestManager.getTest().assignCategory("Module: Factoring ");  
		  
        //Step1: navigate to BrokerCommissionPageFactoring
          BrokerCommissionPageFactoring  fact = cyncHomePage.getCyncMenus().openBrokerCommissionPageFactoring();
        //Step2: verify the Header  
          String Header = " Broker Fee";
          Assert.assertEquals(fact.PageHeaderVerify(Header),Header);
          ExtentTestManager.getTest().log(LogStatus.PASS,"Successfully navigated to BrokerCommissionPageFactoring");
	  }
	  
	  @Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION }, testName = "Navigating to BrokerInquiry PageFactoring")
		
      public void TC_52_navigatetoBrokerInquiryPageFactoring_Verifypageheader(){
		  ExtentTestManager.getTest().getTest().setName("TC_52_Verify navigation to BrokerInquiryPageFactoring");
          ExtentTestManager.getTest().assignCategory("Module: Factoring ");  
		  
        //Step1: navigate to BrokerInquiryPageFactoring
          BrokerInquiryPage  fact = cyncHomePage.getCyncMenus().openBrokerInquiryPageFactoring();
        //Step2: verify the Header  
          String Header = "Broker Inquiry";
          Assert.assertEquals(fact.PageHeaderVerify(Header),Header);
          ExtentTestManager.getTest().log(LogStatus.PASS,"Successfully navigated to BrokerInquiryPageFactoring and verified Header");
	  }
	  
	  
	  @Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION }, testName = "Navigating to ProcessingHistoryPageFactoring")
		
      public void TC_53_navigatetoProcessingHistoryPageFactoring_Verifypageheader(){
		  ExtentTestManager.getTest().getTest().setName("TC_53_Verify navigation to ProcessingHistoryPageFactoring");
          ExtentTestManager.getTest().assignCategory("Module: Factoring ");  
		  
        //Step1: navigate to ProcessingHistoryPageFactoring
          ProcessingHistoryPageFactoring  fact = cyncHomePage.getCyncMenus().openProcessingHistoryPageFactoring();
        //Step2: verify the Header  
          String Header = "Processing History";
          Assert.assertEquals(fact.PageHeaderVerify(Header),Header);
          ExtentTestManager.getTest().log(LogStatus.PASS,"Successfully navigated to ProcessingHistoryPageFactoring");
	  }
	  @Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION }, testName = "Navigating to WarningPageFactoring")
		
      public void TC_54_navigatetoWarningPageFactoring_Verifypageheader(){
		  ExtentTestManager.getTest().getTest().setName("TC_54_Verify navigation to WarningPageFactoring");
          ExtentTestManager.getTest().assignCategory("Module: Factoring ");  
		  
        //Step1: navigate to WarningPageFactoring
          WarningPageFactoring fact = cyncHomePage.getCyncMenus().openWarningPageFactoring();
        //Step2: verify the Header  
          String Header = " Warning ";
          Assert.assertEquals(fact.PageHeaderVerify(Header),Header);
          ExtentTestManager.getTest().log(LogStatus.PASS,"Successfully navigated to WarningPageFactoring");
	  }
	  @Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION }, testName = "Navigating to FundsEmployedFundsEmployedPageFactoring")
		
      public void TC_55_navigatetoFundsEmployedPageFactoring_Verifypageheader(){
		  ExtentTestManager.getTest().getTest().setName("TC_55_Verify navigation to FundsEmployedPageFactoring");
          ExtentTestManager.getTest().assignCategory("Module: Factoring ");  
		  
        //Step1: navigate to FundsEmployedPageFactoring
          FundsEmployedPageFactoring fact = cyncHomePage.getCyncMenus().openFundsEmployedPageFactoring();
        //Step2: verify the Header  
          String Header = "  Funds Employed ";
          Assert.assertEquals(fact.PageHeaderVerify(Header),Header);
          ExtentTestManager.getTest().log(LogStatus.PASS,"Successfully navigated to FundsEmployedPageFactoring");
	  }
	  @Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION }, testName = "Navigating to CreditQueuePageFactoring")
		
      public void TC_56_navigatetoCreditQueuePageFactoring_Verifypageheader(){
		  ExtentTestManager.getTest().getTest().setName("TC_56_Verify navigation to CreditQueuePageFactoring");
          ExtentTestManager.getTest().assignCategory("Module: Factoring ");  
		  
        //Step1: navigate to CreditQueuePageFactoring
          CreditQueuePageFactoring fact = cyncHomePage.getCyncMenus().openCreditQueuePageFactoring();
        //Step2: verify the Header  
          String Header = "Credit Queue - Details";
          Assert.assertEquals(fact.PageHeaderVerify(Header),Header);
          ExtentTestManager.getTest().log(LogStatus.PASS,"Successfully navigated to CreditQueuePageFactoring");
	  }
	  @Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION }, testName = "Navigating to CollectionTicklerPageFactoring")
		
      public void TC_57_navigatetoCollectionTicklerPageFactoring_Verifypageheader(){
		  ExtentTestManager.getTest().getTest().setName("TC_57_Verify navigation to CollectionTicklerPageFactoring");
          ExtentTestManager.getTest().assignCategory("Module: Factoring ");  
		  
        //Step1: navigate to CollectionTicklerPageFactoring
          CollectionTicklerPageFactoring  fact = cyncHomePage.getCyncMenus().openCollectionTicklerPageFactoring();
        //Step2: verify the Header  
          String Header = " Collection Tickler ";
          Assert.assertEquals(fact.PageHeaderVerify(Header),Header);
          ExtentTestManager.getTest().log(LogStatus.PASS,"Successfully navigated to CollectionTicklerPageFactoring");
	  }
	
	  @Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION }, testName = "Navigating to BatchProcessScreenPageFactoring")
		
      public void TC_58_navigatetoBatchProcessScreenPageFactoring_Verifypageheader(){
		  ExtentTestManager.getTest().getTest().setName("TC_58_Verify navigation to BatchProcessScreenPageFactoring");
          ExtentTestManager.getTest().assignCategory("Module: Factoring ");  
		  
        //Step1: navigate to BatchProcessScreenPageFactoring
          BatchProcessScreenPageFactoring fact = cyncHomePage.getCyncMenus().openBatchProcessScreenPageFactoring();
        //Step2: verify the Header  
          String Header = "Batch Process";
          Assert.assertEquals(fact.PageHeaderVerify(Header),Header);
          ExtentTestManager.getTest().log(LogStatus.PASS,"Successfully navigated to BatchProcessScreenPageFactoring");
	  
	  }
	  @Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION }, testName = "Navigating to Ungrouped_checksPage")
		
      public void TC_59_navigatetoUngrouped_checksPage_Verifypageheader(){
		  ExtentTestManager.getTest().getTest().setName("TC_59_Verify navigation to Ungrouped_checksPage");
          ExtentTestManager.getTest().assignCategory("Module: Factoring ");  
		  
        //Step1: navigate to Ungrouped_checksPage
          Ungrouped_checksPage fact = cyncHomePage.getCyncMenus().openungrouped_checks();
        //Step2: verify the Header  
          String Header = "Ungrouped Checks";
          Assert.assertEquals(fact.PageHeaderVerify(Header),Header);
          ExtentTestManager.getTest().log(LogStatus.PASS,"Successfully navigated to Ungrouped_checksPage");
	  
	  }
	  
	  @Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION }, testName = "Navigating to ProcessedBatchesPages")
		
      public void TC_60_navigatetoProcessedBatchesPages_Verifypageheader(){
		  ExtentTestManager.getTest().getTest().setName("TC_60_Verify navigation to ProcessedBatchesPages");
          ExtentTestManager.getTest().assignCategory("Module: Factoring ");  
		  
        //Step1: navigate to ProcessedBatchesPages
          ProcessedBatchesPages fact = cyncHomePage.getCyncMenus().openProcessedBatches();
        //Step2: verify the Header  
          String Header = "Processed Batches";
          Assert.assertEquals(fact.PageHeaderVerify(Header),Header);
          ExtentTestManager.getTest().log(LogStatus.PASS,"Successfully navigated to ProcessedBatchesPages");
	  
	  }
	  @Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION }, testName = "Navigating to DepositUploadPage")
		
      public void TC_61_navigattoDepositUploadPage_Verifypageheader(){
		  ExtentTestManager.getTest().getTest().setName("TC_61_Verify navigation to DepositUploadPage");
          ExtentTestManager.getTest().assignCategory("Module: Factoring ");  
		  
        //Step1: navigate to DepositUploadPage
          DepositUploadPage fact = cyncHomePage.getCyncMenus().opendeposit_uploads();
        //Step2: verify the Header  
          String Header = "Deposit Uploads";
          Assert.assertEquals(fact.PageHeaderVerify(Header),Header);
          ExtentTestManager.getTest().log(LogStatus.PASS,"Successfully navigated to DepositUploadPage");
	  
	  }
	  @Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION }, testName = "Navigating to RepaymentReportPage")
		
      public void TC_62_navigattoRepaymentReportPage_Verifypageheader(){
		  ExtentTestManager.getTest().getTest().setName("TC_62_Verify navigation to RepaymentReportPage");
          ExtentTestManager.getTest().assignCategory("Module: Factoring ");  
		  
        //Step1: navigate to RepaymentReportPage
          RepaymentReportPage fact = cyncHomePage.getCyncMenus().openRepayment();
        //Step2: verify the Header  
          String Header = " Repayment";
          Assert.assertEquals(fact.PageHeaderVerify(Header),Header);
          ExtentTestManager.getTest().log(LogStatus.PASS,"Successfully navigated to RepaymentReportPage");
	  
	  }
	  @Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION }, testName = "Navigating to CreditMemoAdjustmentPage")
		
      public void TC_63_navigattoCreditMemoAdjustmentPage_Verifypageheader(){
		  ExtentTestManager.getTest().getTest().setName("TC_63_Verify navigation to CreditMemoAdjustmentPage");
          ExtentTestManager.getTest().assignCategory("Module: Factoring ");  
		  
        //Step1: navigate to CreditMemoAdjustmentPage
          CreditMemoAdjustmentPage fact = cyncHomePage.getCyncMenus().opencredit_memo_adjustment();
        //Step2: verify the Header  
          String Header = "Credit Memo";
          Assert.assertEquals(fact.PageHeaderVerify(Header),Header);
          ExtentTestManager.getTest().log(LogStatus.PASS,"Successfully navigated to CreditMemoAdjustmentPage");
	  
	  }
	  
	  @Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION }, testName = "Navigating to CreditMemoHistoryPage")
		
      public void TC_64_navigattoCreditMemoHistoryPage_Verifypageheader(){
		  ExtentTestManager.getTest().getTest().setName("TC_64_Verify navigation to CreditMemoHistoryPage");
          ExtentTestManager.getTest().assignCategory("Module: Factoring ");  
		  
        //Step1: navigate to CreditMemoHistoryPage
          CreditMemoHistoryPage fact = cyncHomePage.getCyncMenus().opencredit_memo_history();
        //Step2: verify the Header  
          String Header = "Credit Memo - History";
          Assert.assertEquals(fact.PageHeaderVerify(Header),Header);
          ExtentTestManager.getTest().log(LogStatus.PASS,"Successfully navigated to CreditMemoHistoryPage");
	  
	  }
	  
	//  Reports
	  
	  @Test(dataProvider="PageBreak",groups = { TestGroups.SMOKE, TestGroups.REGRESSION }, testName = "Navigating to ClientFundedARAgingReport")
		
      public void TC_65_navigattoClientFundedARAgingReport_Verifypageheader(String clientname) throws InterruptedException, AWTException{
		 
		  ExtentTestManager.getTest().getTest().setName("TC_65_Verify navigation to ClientFundedARAgingReport");
          ExtentTestManager.getTest().assignCategory("Module: Reports ");  
		  
          Assert.assertTrue(cyncHomePage.getCyncMenus().selectClientFromDropDown(clientname));
          ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully selected the client from dropdown");
          
          //Step1: navigate to Report
          ReportsFactoringPage RF = cyncHomePage.getCyncMenus().openFactoringReportsPage();
          ExtentTestManager.getTest().log(LogStatus.PASS,"Successfully navigated to Report Module");
          
          //Step2:Move to particular Report
          RF.moveToReportmenus("Client Funded AR Aging");
          ExtentTestManager.getTest().log(LogStatus.PASS,"Successfully selected Client Funded AR Aging");
          
        //  Assert.assertTrue(RF.moveToReport());
        //  ExtentTestManager.getTest().log(LogStatus.PASS,"Successfully clicked on Client Funded AR Aging report link");
          
          //Dynamically Current Date selection
          DateFormat dateFormat2 = new SimpleDateFormat("MM/dd/yyyy"); 
          Date date2 = new Date();
          String today = dateFormat2.format(date2); 
     //     Assert.assertTrue(RF.enterAsOfDate(today)); 
          Thread.sleep(1000);
          Robot robot = new Robot();
          

          robot.keyPress(KeyEvent.VK_ESCAPE);
          robot.keyPress(KeyEvent.VK_ENTER);
        //  robot.keyPress(KeyEvent.VK_MINUS);
          Thread.sleep(1000);
          //Step3:Click HTML button
          Assert.assertTrue(RF.clickHTMLButton());
          ExtentTestManager.getTest().log(LogStatus.PASS,"Successfully Entered data and Clicked the Popup to Generate report");
          
          //Step4: verify the Header  
          String Header = "Client Funded AR Aging Detailed Report";
          Thread.sleep(1000);
          Assert.assertEquals(RF.verifyHeader(Header),Header);
          ExtentTestManager.getTest().log(LogStatus.PASS,"Successfully Generated ClientFundedARAging Report and Verified Header");
	 
          RF.Switchtochildwindow();
          ExtentTestManager.getTest().log(LogStatus.PASS,"Closed Child Window");
	  }
	  
	  @Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION }, testName = "Navigating to Statement of Accounts Report")
		
      public void TC_66_navigattoStatementofAccountsReport_Verifypageheader() throws InterruptedException{
		  ExtentTestManager.getTest().getTest().setName("TC_66_Verify navigation to StatementofAccountsReport");
          ExtentTestManager.getTest().assignCategory("Module: Reports ");  
		  
          //Step1: navigate to Reports module
          ReportsFactoringPage RF = cyncHomePage.getCyncMenus().openFactoringReportsPage();
          ExtentTestManager.getTest().log(LogStatus.PASS,"Successfully navigated to Report Module");
          
          //Step2:Move to particular Report
          RF.moveToReportmenus("Statement of Accounts");
          ExtentTestManager.getTest().log(LogStatus.PASS,"Successfully selected Statement of Accounts");
          
          //Dynamically Current Date selection
          DateFormat dateFormat2 = new SimpleDateFormat("MM/dd/yyyy"); 
          Date date2 = new Date();
          String today = dateFormat2.format(date2); 
          Assert.assertTrue(RF.enterAsOfDate_StatementofAccounts(today)); 
         
          //Step3:Click HTML button
          Assert.assertTrue(RF.clickHTMLButton());
          ExtentTestManager.getTest().log(LogStatus.PASS,"Successfully Entered data and Clicked the Popup to Generate report");
          
          //Step4: verify the Header  
          String Header = "Statement of Accounts as of";
          Assert.assertEquals(RF.verifyHeader(Header),Header);
          ExtentTestManager.getTest().log(LogStatus.PASS,"Successfully Generated Statement of Accounts Report and Verified Header");
	 
          RF.Switchtochildwindow();
          ExtentTestManager.getTest().log(LogStatus.PASS,"Closed Child Window");
	  
	  }
	  
	  @Test(dataProvider="PageBreak",groups = { TestGroups.SMOKE, TestGroups.REGRESSION }, testName = "Navigating to ClientsARAging Report")
		
      public void TC_67_navigattoClientsARAgingReport_Verifypageheader(String clientname) throws InterruptedException{
		  ExtentTestManager.getTest().getTest().setName("TC_67_Verify navigation to ClientsARAging Report");
          ExtentTestManager.getTest().assignCategory("Module: Reports ");  
		  
          Assert.assertTrue(cyncHomePage.getCyncMenus().selectClientFromDropDown(clientname));
          ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully selected the client from dropdown");
          
          //Step1: navigate to Report module
          ReportsFactoringPage RF = cyncHomePage.getCyncMenus().openFactoringReportsPage();
          ExtentTestManager.getTest().log(LogStatus.PASS,"Successfully navigated to Report Module");
          
          //Step2:Move to particular Report
          RF.moveToReportmenus("Client's AR Aging");
          ExtentTestManager.getTest().log(LogStatus.PASS,"Successfully selected ClientsARAging");
          
          //Dynamically Current Date selection
          DateFormat dateFormat2 = new SimpleDateFormat("MM/dd/yyyy"); 
          Date date2 = new Date();
          String today = dateFormat2.format(date2); 
          
        //  Assert.assertTrue(RF.enterFromDate(today)); 
         // Assert.assertTrue(RF.enterToDate(today));
         
          //Step3:Click HTML button
          Assert.assertTrue(RF.clickHTMLButton());
          ExtentTestManager.getTest().log(LogStatus.PASS,"Successfully Entered data and Clicked the Popup to Generate report");
         
          //Step4: verify the Header  
          String Header = "Client's AR Aging Report";
          Assert.assertEquals(RF.verifyHeader(Header),Header);
          ExtentTestManager.getTest().log(LogStatus.PASS,"Successfully Generated ClientsARAging Report and Verified Header");
	  
          RF.Switchtochildwindow();
          ExtentTestManager.getTest().log(LogStatus.PASS,"Closed Child Window");
	  }
	  
	  @Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION }, testName = "Navigating to ClientsARBalance Report")
		
      public void TC_68_navigattoClientsARBalanceReport_Verifypageheader() throws InterruptedException{
		  ExtentTestManager.getTest().getTest().setName("TC_68_Verify navigation to ClientsARBalance Report");
          ExtentTestManager.getTest().assignCategory("Module: Reports ");  
		  
          //Step1: navigate to Report module
          ReportsFactoringPage RF = cyncHomePage.getCyncMenus().openFactoringReportsPage();
          ExtentTestManager.getTest().log(LogStatus.PASS,"Successfully navigated to Report Module");
          
          //Step2:Move to particular Report
          RF.moveToReportmenus("Client's AR Balance");
          ExtentTestManager.getTest().log(LogStatus.PASS,"Successfully selected ClientsARBalance");
          
          //Dynamically Current Date selection
          DateFormat dateFormat2 = new SimpleDateFormat("MM/dd/yyyy"); 
          Date date2 = new Date();
          String today = dateFormat2.format(date2); 
          
          Assert.assertTrue(RF.enterFromDate_PurchaseSummary(today)); 
          Assert.assertTrue(RF.enterToDate_PurchaseSummary(today));
         
          //Step3:Click HTML button
          Assert.assertTrue(RF.clickHTMLButton());
          ExtentTestManager.getTest().log(LogStatus.PASS,"Successfully Entered data and Clicked the Popup to Generate report");
        
          //Step4: verify the Header  
          String Header = "Client's AR Balance";
          Assert.assertEquals(RF.verifyHeader(Header),Header);
          ExtentTestManager.getTest().log(LogStatus.PASS,"Successfully Generated ClientsARBalance Report and Verified Header");
	 
          RF.Switchtochildwindow();
          ExtentTestManager.getTest().log(LogStatus.PASS,"Closed Child Window");
	  }
	  
	  @Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION }, testName = "Navigating to OpeninvoicesbySchedule Report")
		
      public void TC_69_navigattoOpeninvoicesbyScheduleReport_Verifypageheader() throws InterruptedException{
		  ExtentTestManager.getTest().getTest().setName("TC_69_Verify navigation to OpeninvoicesbySchedule Report");
          ExtentTestManager.getTest().assignCategory("Module: Reports ");  
		  
          //Step1: navigate to Report module
          ReportsFactoringPage RF = cyncHomePage.getCyncMenus().openFactoringReportsPage();
          ExtentTestManager.getTest().log(LogStatus.PASS,"Successfully navigated to Report Module");
          
          //Step2:Move to particular Report
          RF.moveToReportmenus("Open invoices by Schedule");
          ExtentTestManager.getTest().log(LogStatus.PASS,"Successfully selected OpeninvoicesbySchedule");
          
      
         
          //Step3:Click HTML button
          Assert.assertTrue(RF.clickHTMLButton());
          ExtentTestManager.getTest().log(LogStatus.PASS,"Successfully Clicked the Popup to Generate report");
        
          //Step4: verify the Header  
          String Header = "Open Invoices By Schedule";
          Assert.assertEquals(RF.verifyHeader(Header),Header);
          ExtentTestManager.getTest().log(LogStatus.PASS,"Successfully Generated OpeninvoicesbySchedule Report and Verified Header");
	 
          RF.Switchtochildwindow();
          ExtentTestManager.getTest().log(LogStatus.PASS,"Closed Child Window");
	  }
	  
	  @Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION }, testName = "Navigating to ClientsInvoiceStatus Report")
		
      public void TC_70_navigattoClientsInvoiceStatusReport_Verifypageheader() throws InterruptedException{
		  ExtentTestManager.getTest().getTest().setName("TC_70_Verify navigation to ClientsInvoiceStatusReport Report");
          ExtentTestManager.getTest().assignCategory("Module: Reports ");  
		  
          //Step1: navigate to Report module
          ReportsFactoringPage RF = cyncHomePage.getCyncMenus().openFactoringReportsPage();
          ExtentTestManager.getTest().log(LogStatus.PASS,"Successfully navigated to Report Module");
          
          //Step2:Move to particular Report
          RF.moveToReportmenus("Client's Invoice Status");
          ExtentTestManager.getTest().log(LogStatus.PASS,"Successfully selected ClientsInvoiceStatus");
          
          //Dynamically Current Date selection
          DateFormat dateFormat2 = new SimpleDateFormat("MM/dd/yyyy"); 
          Date date2 = new Date();
          String today = dateFormat2.format(date2); 
         // Assert.assertTrue(RF.enterAsOfDate(today)); 
         
          //Step3:Click HTML button
          Assert.assertTrue(RF.clickHTMLButton());
          ExtentTestManager.getTest().log(LogStatus.PASS,"Successfully Entered data and Clicked the Popup to Generate report");
        
          //Step4: verify the Header  
          String Header = "Client's Invoice Status";
          Assert.assertEquals(RF.verifyHeader(Header),Header);
          ExtentTestManager.getTest().log(LogStatus.PASS,"Successfully Generated ClientsInvoiceStatus Report and Verified Header");
	 
          RF.Switchtochildwindow();
          ExtentTestManager.getTest().log(LogStatus.PASS,"Closed Child Window");
	  }
	  
	  @Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION }, testName = "Navigating to Pending Fund Processing Report")
		
      public void TC_71_navigattoPendingFundProcessingReport_Verifypageheader() throws InterruptedException{
		  ExtentTestManager.getTest().getTest().setName("TC_71_Verify navigation to Pending Fund Processing Report");
          ExtentTestManager.getTest().assignCategory("Module: Reports ");  
		  
          //Step1: navigate to Report module
          ReportsFactoringPage RF = cyncHomePage.getCyncMenus().openFactoringReportsPage();
          ExtentTestManager.getTest().log(LogStatus.PASS,"Successfully navigated to Report Module");
          
          //Step2:Move to particular Report
          RF.moveToReportmenus("Pending Fund Processing");
          ExtentTestManager.getTest().log(LogStatus.PASS,"Successfully selected Pending Fund Processing");
          
          //Dynamically Current Date selection
          DateFormat dateFormat2 = new SimpleDateFormat("MM/dd/yyyy"); 
          Date date2 = new Date();
          String today = dateFormat2.format(date2); 
         // Assert.assertTrue(RF.enterAsOfDate(today)); 
         
          //Step3:Click HTML button
          Assert.assertTrue(RF.clickHTMLButton());
          ExtentTestManager.getTest().log(LogStatus.PASS,"Successfully Entered data and Clicked the Popup to Generate report");
        
          //Step4: verify the Header  
          String Header = "Pending Fund Processing";
          Assert.assertEquals(RF.verifyHeader(Header),Header);
          ExtentTestManager.getTest().log(LogStatus.PASS,"Successfully Generated Pending Fund Processing Report and Verified Header");
	 
          RF.Switchtochildwindow();
          ExtentTestManager.getTest().log(LogStatus.PASS,"Closed Child Window");
	  }
	  
	  @Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION }, testName = "Navigating to DailyFundings Report")
		
      public void TC_72_navigattoDailyFundingsReport_Verifypageheader() throws InterruptedException{
		  ExtentTestManager.getTest().getTest().setName("TC_72_Verify navigation to DailyFundings Report");
          ExtentTestManager.getTest().assignCategory("Module: Reports ");  
		  
          //Step1: navigate to Report module
          ReportsFactoringPage RF = cyncHomePage.getCyncMenus().openFactoringReportsPage();
          ExtentTestManager.getTest().log(LogStatus.PASS,"Successfully navigated to Report Module");
          
          //Step2:Move to particular Report
          RF.moveToReportmenus("Daily Fundings Report");
          ExtentTestManager.getTest().log(LogStatus.PASS,"Successfully selected DailyFundings");
          
          //Dynamically Current Date selection
          DateFormat dateFormat2 = new SimpleDateFormat("MM/dd/yyyy"); 
          Date date2 = new Date();
          String today = dateFormat2.format(date2); 
          Assert.assertTrue(RF.enterFromDate(today));
          Assert.assertTrue(RF.enterToDate(today));
  
          //Step3:Click HTML button
          Assert.assertTrue(RF.clickHTMLButton());
          ExtentTestManager.getTest().log(LogStatus.PASS,"Successfully Entered data and Clicked the Popup to Generate report");
        
          //Step4: verify the Header  
          String Header = "Daily Fundings Report";
          Assert.assertEquals(RF.verifyHeader(Header),Header);
          ExtentTestManager.getTest().log(LogStatus.PASS,"Successfully DailyFundings Report and Verified Header");
         
          RF.Switchtochildwindow();
          ExtentTestManager.getTest().log(LogStatus.PASS,"Closed Child Window");
	  
	  }
	  
	  @Test(dataProvider="PageBreak",groups = { TestGroups.SMOKE, TestGroups.REGRESSION }, testName = "Navigating to Invoices Awaiting Funding Report")
		
      public void TC_73_navigattoInvoicesAwaitingFundingReport_Verifypageheader(String clientname) throws InterruptedException, AWTException{
		  ExtentTestManager.getTest().getTest().setName("TC_73_Verify navigation to Invoices Awaiting Funding Report");
          ExtentTestManager.getTest().assignCategory("Module: Reports ");  
		  
          Assert.assertTrue(cyncHomePage.getCyncMenus().selectClientFromDropDown(clientname));
          ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully selected the client from dropdown");
          
          //Step1: navigate to Report module
          ReportsFactoringPage RF = cyncHomePage.getCyncMenus().openFactoringReportsPage();
          ExtentTestManager.getTest().log(LogStatus.PASS,"Successfully navigated to Report Module");
          
          //Step2:Move to particular Report
          RF.moveToReportmenus("Invoices Awaiting Funding");
          ExtentTestManager.getTest().log(LogStatus.PASS,"Successfully selected InvoicesAwaitingFundingReport");
          
          //Dynamically Current Date selection
          DateFormat dateFormat2 = new SimpleDateFormat("MM/dd/yyyy"); 
          Date date2 = new Date();
          String today = dateFormat2.format(date2); 
          Assert.assertTrue(RF.enterAsOfDate(today)); 
          
          //BeforClick HTML button RemoveCalender
          Robot rb = new Robot();
          rb.keyPress(KeyEvent.VK_ESCAPE);
         
          //Step3:Click HTML button
          Assert.assertTrue(RF.clickHTMLButton());
          ExtentTestManager.getTest().log(LogStatus.PASS,"Successfully Entered data and Clicked the Popup to Generate report");
        
          //Step4: verify the Header  
          String Header = "Invoices Awaiting Funding";
          Assert.assertEquals(RF.verifyHeader(Header),Header);
          ExtentTestManager.getTest().log(LogStatus.PASS,"Successfully Generated Invoices Awaiting Funding Report and Verified Header");
	
          RF.Switchtochildwindow();
          ExtentTestManager.getTest().log(LogStatus.PASS,"Closed Child Window");
	  }
	  
	  @Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION }, testName = "Navigating to Invoices Pending Verification Report")
		
      public void TC_74_navigattoInvoicesPendingVerificationReport_Verifypageheader() throws InterruptedException{
		  ExtentTestManager.getTest().getTest().setName("TC_74_Verify navigation to Invoices Pending Verification Report");
          ExtentTestManager.getTest().assignCategory("Module: Reports ");  
		  
          //Step1: navigate to Report module
          ReportsFactoringPage RF = cyncHomePage.getCyncMenus().openFactoringReportsPage();
          ExtentTestManager.getTest().log(LogStatus.PASS,"Successfully navigated to Report Module");
          
          //Step2:Move to particular Report
          RF.moveToReportmenus("Invoices Pending Verification");
          ExtentTestManager.getTest().log(LogStatus.PASS,"Successfully selected Invoices Pending Verification");
         
          //Step3:Click HTML button
          Assert.assertTrue(RF.clickHTMLButton());
          ExtentTestManager.getTest().log(LogStatus.PASS,"Successfully Entered data and Clicked the Popup to Generate report");
        
          //Step4: verify the Header  
          String Header = "Invoices Pending Verification";
          Assert.assertEquals(RF.verifyHeader(Header),Header);
          ExtentTestManager.getTest().log(LogStatus.PASS,"Successfully Generated Invoices Pending Verification Report and Verified Header");
	 
          RF.Switchtochildwindow();
          ExtentTestManager.getTest().log(LogStatus.PASS,"Closed Child Window");
	  }
	  
	  @Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION }, testName = "Navigating to Funding Batch Report")
		
      public void TC_75_navigattoFundingBatchReport_Verifypageheader() throws InterruptedException{
		  ExtentTestManager.getTest().getTest().setName("TC_75_Verify navigation to Funding Batch Report");
          ExtentTestManager.getTest().assignCategory("Module: Reports ");  
		  
          //Step1: navigate to Report module
          ReportsFactoringPage RF = cyncHomePage.getCyncMenus().openFactoringReportsPage();
          ExtentTestManager.getTest().log(LogStatus.PASS,"Successfully navigated to Report Module");
          
          //Step2:Move to particular Report
          RF.moveToReportmenus("Funding Batch Report");
          ExtentTestManager.getTest().log(LogStatus.PASS,"Successfully selected Funding Batch Report");
         
          //Step3:Click HTML button
          Assert.assertTrue(RF.clickHTMLButton());
          ExtentTestManager.getTest().log(LogStatus.PASS,"Successfully Entered data and Clicked the Popup to Generate report");
        
          //Step4: verify the Header  
          String Header = "Funding Batch Report";
          Assert.assertEquals(RF.verifyHeader(Header),Header);
          ExtentTestManager.getTest().log(LogStatus.PASS,"Successfully Generated Funding Batch Report and Verified Header");
	 
          RF.Switchtochildwindow();
          ExtentTestManager.getTest().log(LogStatus.PASS,"Closed Child Window");
	  }
	  
	  @Test(dataProvider = "PageBreak",groups = { TestGroups.SMOKE, TestGroups.REGRESSION }, testName = "Navigating to Purchase Summary Report")
		
      public void TC_76_navigattoPurchaseSummaryReport_Verifypageheader(String clientname) throws InterruptedException{
		  ExtentTestManager.getTest().getTest().setName("TC_76_Verify navigation to Purchase Summary Report");
          ExtentTestManager.getTest().assignCategory("Module: Reports ");  
		  
          //Step1: navigate to Report module
          ReportsFactoringPage RF = cyncHomePage.getCyncMenus().openFactoringReportsPage();
          ExtentTestManager.getTest().log(LogStatus.PASS,"Successfully navigated to Report Module");
          
          //Step2:Move to particular Report
          RF.moveToReportmenus("Purchase Summary Report");
          ExtentTestManager.getTest().log(LogStatus.PASS,"Successfully selected Purchase Summary Report");
          
          //select Client from popup dropdown
          RF.selectFromPopupDropDown(clientname);
          //Dynamically Current Date selection
          DateFormat dateFormat2 = new SimpleDateFormat("MM/dd/yyyy"); 
          Date date2 = new Date();
          String today = dateFormat2.format(date2); 
          Assert.assertTrue(RF.enterFromDate_PurchaseSummary(today));
          Assert.assertTrue(RF.enterToDate_PurchaseSummary(today));
         
          //Step3:Click HTML button
          Assert.assertTrue(RF.clickHTMLButton());
          ExtentTestManager.getTest().log(LogStatus.PASS,"Successfully Entered data and Clicked the Popup to Generate report");
        
          //Step4: verify the Header  
          String Header = "Purchase Summary Report";
          Assert.assertEquals(RF.verifyHeader(Header),Header);
          ExtentTestManager.getTest().log(LogStatus.PASS,"Successfully Generate Purchase Summary Report and Verified Header");
	 
          RF.Switchtochildwindow();
          ExtentTestManager.getTest().log(LogStatus.PASS,"Closed Child Window");
	  }
	  
	  @Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION }, testName = "Navigating to Processing Status Report")
		
      public void TC_77_navigattoProcessingStatusReport_Verifypageheader() throws InterruptedException{
		  ExtentTestManager.getTest().getTest().setName("TC_77_Verify navigation to Processing Status Report");
          ExtentTestManager.getTest().assignCategory("Module: Reports ");  
		  
          //Step1: navigate to Report module
          ReportsFactoringPage RF = cyncHomePage.getCyncMenus().openFactoringReportsPage();
          ExtentTestManager.getTest().log(LogStatus.PASS,"Successfully navigated to Report Module");
          
          //Step2:Move to particular Report
          RF.moveToReportmenus("Processing Status Report");
          ExtentTestManager.getTest().log(LogStatus.PASS,"Successfully selected Processing Status Report");
         
          //Step3:Click HTML button
          Assert.assertTrue(RF.clickHTMLButton());
          ExtentTestManager.getTest().log(LogStatus.PASS,"Successfully Entered data and Clicked the Popup to Generate report");
        
          //Step4: verify the Header  
          String Header = "Processing Status Report";
          Assert.assertEquals(RF.verifyHeader(Header),Header);
          ExtentTestManager.getTest().log(LogStatus.PASS,"Successfully Generated Processing Status Report and Verified Header");
	 
          RF.Switchtochildwindow();
          ExtentTestManager.getTest().log(LogStatus.PASS,"Closed Child Window");
	  }
	  
	  @Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION }, testName = "Navigating to Verification Report")
		
      public void TC_78_navigattoVerificationReport_Verifypageheader() throws InterruptedException{
		  ExtentTestManager.getTest().getTest().setName("TC_78_Verify navigation to Verification Report");
          ExtentTestManager.getTest().assignCategory("Module: Reports ");  
		  
          //Step1: navigate to Report module
          ReportsFactoringPage RF = cyncHomePage.getCyncMenus().openFactoringReportsPage();
          ExtentTestManager.getTest().log(LogStatus.PASS,"Successfully navigated to Report Module");
          
          //Step2:Move to particular Report
          RF.moveToReportmenus("Verification Report");
          ExtentTestManager.getTest().log(LogStatus.PASS,"Successfully selected Verification Report");
          
          //Step3:Click HTML button
          Assert.assertTrue(RF.clickHTMLButton());
          ExtentTestManager.getTest().log(LogStatus.PASS,"Successfully Entered data and Clicked the Popup to Generate report");
        
          //Step4: verify the Header  
          String Header = "Verification Report";
          Assert.assertEquals(RF.verifyHeader(Header),Header);
          ExtentTestManager.getTest().log(LogStatus.PASS,"Successfully Generated Verification Report and Verified Header");
	 
          RF.Switchtochildwindow();
          ExtentTestManager.getTest().log(LogStatus.PASS,"Closed Child Window");
	  }
	  
	  @Test(groups = {TestGroups.SMOKE, TestGroups.REGRESSION }, testName = "Navigating to Fee Report")
		
      public void TC_79_navigattoFeeReport_Verifypageheader() throws InterruptedException{
		  ExtentTestManager.getTest().getTest().setName("TC_79_Verify navigation to Fee Report");
          ExtentTestManager.getTest().assignCategory("Module: Reports ");  
		  
          //Step1: navigate to Report module
          ReportsFactoringPage RF = cyncHomePage.getCyncMenus().openFactoringReportsPage();
          ExtentTestManager.getTest().log(LogStatus.PASS,"Successfully navigated to Report Module");
          
          //Step2:Move to particular Report
          RF.moveToReportmenus("Fee Report");
          ExtentTestManager.getTest().log(LogStatus.PASS,"Successfully selected Fee Report");
          
          //Dynamically Current Date selection
          DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy"); 
          Date date = new Date();
          String today = dateFormat.format(date); 
          
          Assert.assertTrue(RF.enterFromDate_PurchaseSummary(today));
          Assert.assertTrue(RF.enterToDate_PurchaseSummary(today));
         
          //Step3:Click HTML button
          Assert.assertTrue(RF.clickHTMLButton());
          ExtentTestManager.getTest().log(LogStatus.PASS,"Successfully Entered data and Clicked the Popup to Generate report");
        
          //Step4: verify the Header  
          String Header="Fee Report";
          Assert.assertEquals(RF.checkreporttitle(Header),Header);
          ExtentTestManager.getTest().log(LogStatus.PASS,"Successfully Generated Fee Report and Verified Header");
	  
          RF.Switchtochildwindow();
          ExtentTestManager.getTest().log(LogStatus.PASS,"Closed Child Window");
	  }
	  
	  @Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION }, testName = "Navigating to Client Activity Detail Report")
		
      public void TC_80_navigattoClientActivityDetailReport_Verifypageheader() throws InterruptedException{
		  ExtentTestManager.getTest().getTest().setName("TC_80_Verify navigation to Client Activity Detail Report");
          ExtentTestManager.getTest().assignCategory("Module: Reports ");  
		  
          //Step1: navigate to Report module
          ReportsFactoringPage RF = cyncHomePage.getCyncMenus().openFactoringReportsPage();
          ExtentTestManager.getTest().log(LogStatus.PASS,"Successfully navigated to Report Module");
          
          //Step2:Move to particular Report
          RF.moveToReportmenus("Client Activity Detail");
          ExtentTestManager.getTest().log(LogStatus.PASS,"Successfully selected Client Activity Detail");
          
          //Dynamically Current Date selection
          DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy"); 
          Date date = new Date();
          String today = dateFormat.format(date); 
        
          
          Assert.assertTrue(RF.enterFromDate_PurchaseSummary(today));
          Assert.assertTrue(RF.enterToDate_PurchaseSummary(today));
         
          //Step3:Click HTML button
          Assert.assertTrue(RF.clickHTMLButton());
          ExtentTestManager.getTest().log(LogStatus.PASS,"Successfully Entered data and Clicked the Popup to Generate report");
        
          //Step4: verify the Header  
          String Header = "Client Activity Detail";
          Assert.assertEquals(RF.ClientActivityDetail(Header),Header);
          ExtentTestManager.getTest().log(LogStatus.PASS,"Successfully Generated Client Activity Detail Report and Verified Header");
	  
          RF.Switchtochildwindow();
          ExtentTestManager.getTest().log(LogStatus.PASS,"Closed Child Window");
	  }
	 
	  @Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION }, testName = "Navigating to EOMClientAnalysis Report")
		
      public void TC_81_navigattoEOMClientAnalysisReport_Verifypageheader() throws InterruptedException{
		  ExtentTestManager.getTest().getTest().setName("TC_81_Verify navigation to EOMClientAnalysis Report");
          ExtentTestManager.getTest().assignCategory("Module: Reports ");  
		  
          //Step1: navigate to Report module
          ReportsFactoringPage RF = cyncHomePage.getCyncMenus().openFactoringReportsPage();
          ExtentTestManager.getTest().log(LogStatus.PASS,"Successfully navigated to Reports Module");
          
          //Step2:Move to particular Report
          RF.moveToReportmenus("EOM Client Analysis");
          ExtentTestManager.getTest().log(LogStatus.PASS,"Successfully selected EOMClientAnalysisReport");
          
         
          //Step3:Click HTML button
          Assert.assertTrue(RF.clickHTMLButton());
          ExtentTestManager.getTest().log(LogStatus.PASS,"Successfully Entered data and Clicked the Popup to Generate report");
        
          //Step4: verify the Header  
          String Header = "EOM Client Analysis";
          Assert.assertEquals(RF.ClientActivityDetail(Header),Header);
          ExtentTestManager.getTest().log(LogStatus.PASS,"Successfully Generated EOMClientAnalysis Report and Verified Header");
	  
          RF.Switchtochildwindow();
          ExtentTestManager.getTest().log(LogStatus.PASS,"Closed Child Window");
	  }
	  
	  @Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION }, testName = "Navigating to Comments Report")
		
      public void TC_82_navigattoCommentsReport_Verifypageheader() throws InterruptedException{
		  ExtentTestManager.getTest().getTest().setName("TC_82_Verify navigation to Comments Report");
          ExtentTestManager.getTest().assignCategory("Module: Reports ");  
		  
          //Step1: navigate to Report module
          ReportsFactoringPage RF = cyncHomePage.getCyncMenus().openFactoringReportsPage();
          ExtentTestManager.getTest().log(LogStatus.PASS,"Successfully navigated to Reports Module");
          
          //Step2:Move to particular Report
          RF.moveToReportmenus("Comments Report");
          ExtentTestManager.getTest().log(LogStatus.PASS,"Successfully selected Comments");
          
          //Dynamically Current Date selection
          DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy"); 
          Date date = new Date();
          String today = dateFormat.format(date);
        
          
          Assert.assertTrue(RF.enterFromDate_PurchaseSummary(today));
          Assert.assertTrue(RF.enterToDate_PurchaseSummary(today));
         
          //Step3:Click HTML button
          Assert.assertTrue(RF.clickHTMLButton());
          ExtentTestManager.getTest().log(LogStatus.PASS,"Successfully Entered data and Clicked the Popup to Generate report");
        
          //Step4: verify the Header  
          String Header = "Comments Report";
          Assert.assertEquals(RF.ClientActivityDetail(Header),Header);
          ExtentTestManager.getTest().log(LogStatus.PASS,"Successfully Generated Comments Report and Verified Header");
	 
          RF.Switchtochildwindow();
          ExtentTestManager.getTest().log(LogStatus.PASS,"Closed Child Window");
	  }
	  
	  @Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION }, testName = "Navigating to Daily Activity All Clients Report")
		
      public void TC_83_navigattoDailyActivityAllClientsReport_Verifypageheader() throws InterruptedException{
		  ExtentTestManager.getTest().getTest().setName("TC_83_Verify navigation to Daily Activity All Clients Report");
          ExtentTestManager.getTest().assignCategory("Module: Reports ");  
		  
          //Step1: navigate to Report module
          ReportsFactoringPage RF = cyncHomePage.getCyncMenus().openFactoringReportsPage();
          ExtentTestManager.getTest().log(LogStatus.PASS,"Successfully navigated to Report Module");
          
          //Step2:Move to particular Report
          RF.moveToReportmenus("Daily Activity All Clients");
          ExtentTestManager.getTest().log(LogStatus.PASS,"Successfully selected Daily Activity All Clients");
          
          //Dynamically Current Date selection
          DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy"); 
          Date date = new Date();
          String today = dateFormat.format(date); 
        
          
          Assert.assertTrue(RF.enterFromDate(today));
          Assert.assertTrue(RF.enterToDate(today));
         
          //Step3:Click HTML button
          Assert.assertTrue(RF.clickHTMLButton());
          ExtentTestManager.getTest().log(LogStatus.PASS,"Successfully Entered data and Clicked the Popup to Generate report");
        
          //Step4: verify the Header  
          String Header = "";
          Assert.assertEquals(RF.ClientActivityDetail(Header),Header);
          ExtentTestManager.getTest().log(LogStatus.PASS,"Successfully Generated Daily Activity All Clients Report and Verified Header");
	 
          RF.Switchtochildwindow();
          ExtentTestManager.getTest().log(LogStatus.PASS,"Closed Child Window");
	  }
	  
	  @Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION }, testName = "Navigating to Reserve Activity Report")
		
      public void TC_84_navigattoReserveActivityReport_Verifypageheader() throws InterruptedException{
		  ExtentTestManager.getTest().getTest().setName("TC_84_Verify navigation to Reserve Activity Report");
          ExtentTestManager.getTest().assignCategory("Module: Reports ");  
		  
          //Step1: navigate to Report module
          ReportsFactoringPage RF = cyncHomePage.getCyncMenus().openFactoringReportsPage();
          ExtentTestManager.getTest().log(LogStatus.PASS,"Successfully navigated to Report Module");
          
          //Step2:Move to particular Report
          RF.moveToReportmenus("Reserve Activity Report");
          ExtentTestManager.getTest().log(LogStatus.PASS,"Successfully selected Reserve Activity Report");
          
          //Dynamically Current Date selection
          DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy"); 
          Date date = new Date();
          String today = dateFormat.format(date); 
        
          
          Assert.assertTrue(RF.enterFromDate_PurchaseSummary(today));
          Assert.assertTrue(RF.enterToDate_PurchaseSummary(today));
         
          //Step3:Click HTML button
          Assert.assertTrue(RF.clickHTMLButton());
          ExtentTestManager.getTest().log(LogStatus.PASS,"Successfully Entered data and Clicked the Popup to Generate report");
        
          //Step4: verify the Header  
          String Header = "Reserve Activity Report";
          Assert.assertEquals(RF.ClientActivityDetail(Header),Header);
          ExtentTestManager.getTest().log(LogStatus.PASS,"Successfully Generated Reserve Activity Report and Verified Header");
	 
          RF.Switchtochildwindow();
          ExtentTestManager.getTest().log(LogStatus.PASS,"Closed Child Window");
	  }
	  
	  @Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION }, testName = "Navigating to Client Summary Report")
		
      public void TC_85_navigattoClientSummaryReport_Verifypageheader() throws InterruptedException{
		  ExtentTestManager.getTest().getTest().setName("TC_85_Verify navigation to Client Summary Report");
          ExtentTestManager.getTest().assignCategory("Module: Reports ");  
		  
          //Step1: navigate to Report module
          ReportsFactoringPage RF = cyncHomePage.getCyncMenus().openFactoringReportsPage();
          ExtentTestManager.getTest().log(LogStatus.PASS,"Successfully navigated to Report Module");
          
          //Step2:Move to particular Report
          RF.moveToReportmenus("Client Summary Report");
          ExtentTestManager.getTest().log(LogStatus.PASS,"Successfully selected Client Summary Report");
          
          //Dynamically Current Date selection
          DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy"); 
          Date date = new Date();
          String today = dateFormat.format(date); 
        
          
          Assert.assertTrue(RF.enterFromDate_PurchaseSummary(today));
          Assert.assertTrue(RF.enterToDate_PurchaseSummary(today));
         
          //Step3:Click HTML button
          Assert.assertTrue(RF.clickHTMLButton());
          ExtentTestManager.getTest().log(LogStatus.PASS,"Successfully Entered data and Clicked the Popup to Generate report");
        
          //Step4: verify the Header  
          String Header = "Client Summary Report";
          Assert.assertEquals(RF.ClientActivityDetail(Header),Header);
          ExtentTestManager.getTest().log(LogStatus.PASS,"Successfully Generated Client Summary Report and Verified Header");
	  
          RF.Switchtochildwindow();
          ExtentTestManager.getTest().log(LogStatus.PASS,"Closed Child Window");
	  }
	  
	  @Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION }, testName = "Navigating to Cash Reserve Report")
		
      public void TC_86_navigattoCashReserveReport_Verifypageheader() throws InterruptedException{
		  ExtentTestManager.getTest().getTest().setName("TC_86_Verify navigation to Cash Reserve Report");
          ExtentTestManager.getTest().assignCategory("Module: Reports ");  
		  
          //Step1: navigate to Report module
          ReportsFactoringPage RF = cyncHomePage.getCyncMenus().openFactoringReportsPage();
          ExtentTestManager.getTest().log(LogStatus.PASS,"Successfully navigated to Report Module");
          
          //Step2:Move to particular Report
          RF.moveToReportmenus("Cash Reserve Report");
          ExtentTestManager.getTest().log(LogStatus.PASS,"Successfully selected Cash Reserve");
          
          //Dynamically Current Date selection
          DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy"); 
          Date date = new Date();
          String today = dateFormat.format(date); 
        
          
          Assert.assertTrue(RF.enterFromDate_PurchaseSummary(today));
          Assert.assertTrue(RF.enterToDate_PurchaseSummary(today));
         
          //Step3:Click HTML button
          Assert.assertTrue(RF.clickHTMLButton());
          ExtentTestManager.getTest().log(LogStatus.PASS,"Successfully Entered data and Clicked the Popup to Generate report");
        
          //Step4: verify the Header  
          String Header = "Cash Reserve Report";
          Assert.assertEquals(RF.ClientActivityDetail(Header),Header);
          ExtentTestManager.getTest().log(LogStatus.PASS,"Successfully Generated Cash Reserve Report and Verified Header");
	  
          RF.Switchtochildwindow();
          ExtentTestManager.getTest().log(LogStatus.PASS,"Closed Child Window");
	  }
	  
	  @Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION }, testName = "Navigating to Debtor Concentration Report")
		
      public void TC_87_navigattoDebtorConcentrationReport_Verifypageheader() throws InterruptedException{
		  ExtentTestManager.getTest().getTest().setName("TC_87_Verify navigation to Debtor Concentration Report");
          ExtentTestManager.getTest().assignCategory("Module: Reports ");  
		  
          //Step1: navigate to Report module
          ReportsFactoringPage RF = cyncHomePage.getCyncMenus().openFactoringReportsPage();
          ExtentTestManager.getTest().log(LogStatus.PASS,"Successfully navigated to Report Module");
          
          //Step2:Move to particular Report
          RF.moveToReportmenus("Debtor Concentration");
          ExtentTestManager.getTest().log(LogStatus.PASS,"Successfully selected Debtor Concentration");
          
         
          //Step3:Click HTML button
          Assert.assertTrue(RF.clickHTMLButton());
          ExtentTestManager.getTest().log(LogStatus.PASS,"Successfully Entered data and Clicked the Popup to Generate report");
        
          //Step4: verify the Header  
          String Header = "Debtor Concentration";
          Assert.assertEquals(RF.ClientActivityDetail(Header),Header);
          ExtentTestManager.getTest().log(LogStatus.PASS,"Successfully Generated Debtor Concentration Report and Verified Header");
	      
          RF.Switchtochildwindow();
          ExtentTestManager.getTest().log(LogStatus.PASS,"Closed Child Window");
	  
	  }
	  
	  @Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION }, testName = "Navigating to Payment History Report")
		
      public void TC_88_navigattoPaymentHistoryReport_Verifypageheader() throws InterruptedException{
		  ExtentTestManager.getTest().getTest().setName("TC_88_Verify navigation to Payment History Report");
          ExtentTestManager.getTest().assignCategory("Module: Reports ");  
		  
          //Step1: navigate to Report module
          ReportsFactoringPage RF = cyncHomePage.getCyncMenus().openFactoringReportsPage();
          ExtentTestManager.getTest().log(LogStatus.PASS,"Successfully navigated to Report Module");
          
          //Step2:Move to particular Report
          RF.moveToReportmenus("Payment History Report");
          ExtentTestManager.getTest().log(LogStatus.PASS,"Successfully selected Payment History Report");
          
          //Dynamically Current Date selection
          DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy"); 
          Date date = new Date();
          String today = dateFormat.format(date); 
        
          
          Assert.assertTrue(RF.enterFromDate_PurchaseSummary(today));
          Assert.assertTrue(RF.enterToDate_PurchaseSummary(today));
         
          //Step3:Click HTML button
          Assert.assertTrue(RF.clickHTMLButton());
          ExtentTestManager.getTest().log(LogStatus.PASS,"Successfully Entered data and Clicked the Popup to Generate report");
        
          //Step4: verify the Header  
          String Header = "Payment History Report";
          Assert.assertEquals(RF.ClientActivityDetail(Header),Header);
          ExtentTestManager.getTest().log(LogStatus.PASS,"Successfully Generated Payment History Report and Verified Header");
	 
          RF.Switchtochildwindow();
          ExtentTestManager.getTest().log(LogStatus.PASS,"Closed Child Window");
	  }
	  @Test(dataProvider="PageBreak",groups = { TestGroups.SMOKE, TestGroups.REGRESSION }, testName = "Navigating to Follow Up Report")
		
      public void TC_89_navigattoFollowUpReport_Verifypageheader(String clientname) throws InterruptedException{
		  ExtentTestManager.getTest().getTest().setName("TC_89_Verify navigation to Follow Up Report");
          ExtentTestManager.getTest().assignCategory("Module: Reports ");  
		  
          Assert.assertTrue(cyncHomePage.getCyncMenus().selectClientFromDropDown(clientname));
          ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully selected the client from dropdown");
          
          //Step1: navigate to Report module
          ReportsFactoringPage RF = cyncHomePage.getCyncMenus().openFactoringReportsPage();
          ExtentTestManager.getTest().log(LogStatus.PASS,"Successfully navigated to Report Module");
          
          //Step2:Move to particular Report
          RF.moveToReportmenus("Follow Up Report");
          ExtentTestManager.getTest().log(LogStatus.PASS,"Successfully selected Follow Up Report");
          
          //Dynamically Current Date selection
          DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy"); 
          Date date = new Date();
          String today = dateFormat.format(date); 
        
          
         // Assert.assertTrue(RF.enterFromDate_PurchaseSummary(today));
         // Assert.assertTrue(RF.enterToDate_PurchaseSummary(today));
         
          //Step3:Click HTML button
          Assert.assertTrue(RF.clickHTMLButton());
          ExtentTestManager.getTest().log(LogStatus.PASS,"Successfully Entered data and Clicked the Popup to Generate report");
        
          //Step4: verify the Header  
          String Header = "Follow Up Report";
          Assert.assertEquals(RF.ClientActivityDetail(Header),Header);
          ExtentTestManager.getTest().log(LogStatus.PASS,"Successfully Generated Follow Up Report and Verified Header");
	      
          RF.Switchtochildwindow();
          ExtentTestManager.getTest().log(LogStatus.PASS,"Closed Child Window");
	  }
	  
	  @Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION }, testName = "Navigating to Portfolio AR Balance Report")
		
      public void TC_90_navigattoPortfolioARBalanceReport_Verifypageheader() throws InterruptedException{
		  ExtentTestManager.getTest().getTest().setName("TC_90_Verify navigation to Portfolio AR Balance Report");
          ExtentTestManager.getTest().assignCategory("Module: Reports ");  
		  
          //Step1: navigate to Report module
          ReportsFactoringPage RF = cyncHomePage.getCyncMenus().openFactoringReportsPage();
          ExtentTestManager.getTest().log(LogStatus.PASS,"Successfully navigated to Report Module");
          
          //Step2:Move to particular Report
          RF.moveToReportmenus("Portfolio AR Balance");
          ExtentTestManager.getTest().log(LogStatus.PASS,"Successfully selected Portfolio AR Balance");
          
          //Dynamically Current Date selection
          DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy"); 
          Date date = new Date();
          String today = dateFormat.format(date); 
        
          
        //  Assert.assertTrue(RF.enterFromDate_PurchaseSummary(today));
        //  Assert.assertTrue(RF.enterToDate_PurchaseSummary(today));
         
          //Step3:Click HTML button
          Assert.assertTrue(RF.clickHTMLButton());
          ExtentTestManager.getTest().log(LogStatus.PASS,"Successfully Entered data and Clicked the Popup to Generate report");
          Thread.sleep(2000);
          //Step4: verify the Header  
          String Header = "Portfolio AR Balance";
          Assert.assertEquals(RF.ClientActivityDetail(Header),Header);
          ExtentTestManager.getTest().log(LogStatus.PASS,"Successfully Generated Portfolio AR Balance Report and Verified Header");
	 
          RF.Switchtochildwindow();
          ExtentTestManager.getTest().log(LogStatus.PASS,"Closed Child Window");
	  }
	  
	  @Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION }, testName = "Navigating to EOM Portfolio Analysis Report")
		
      public void TC_91_navigattoEOMPortfolioAnalysisReport_Verifypageheader() throws InterruptedException{
		  ExtentTestManager.getTest().getTest().setName("TC_91_Verify navigation to EOM Portfolio Analysis Report");
          ExtentTestManager.getTest().assignCategory("Module: Reports ");  
		  
          //Step1: navigate to Report module
          ReportsFactoringPage RF = cyncHomePage.getCyncMenus().openFactoringReportsPage();
          ExtentTestManager.getTest().log(LogStatus.PASS,"Successfully navigated to Report Module");
          
          //Step2:Move to particular Report
          RF.moveToReportmenus("EOM Portfolio Analysis");
          ExtentTestManager.getTest().log(LogStatus.PASS,"Successfully selected EOM Portfolio Analysis");
          
          //Dynamically Current Date selection
          DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy"); 
          Date date = new Date();
          String today = dateFormat.format(date); 
        
          
        //  Assert.assertTrue(RF.enterFromDate_PurchaseSummary(today));
         // Assert.assertTrue(RF.enterToDate_PurchaseSummary(today));
         
          //Step3:Click HTML button
          Assert.assertTrue(RF.clickHTMLButton());
          ExtentTestManager.getTest().log(LogStatus.PASS,"Successfully Entered data and Clicked the Popup to Generate report");
        
          //Step4: verify the Header  
          String Header = "EOM Portfolio Analysis";
          Assert.assertEquals(RF.ClientActivityDetail(Header),Header);
          ExtentTestManager.getTest().log(LogStatus.PASS,"Successfully Generated EOM Portfolio Analysis Report and Verified Header");
	
          RF.Switchtochildwindow();
          ExtentTestManager.getTest().log(LogStatus.PASS,"Closed Child Window");
	  }
	  
	  @Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION }, testName = "Navigating to AR All Debtors Report")
		
      public void TC_92_navigattoARAllDebtorsReport_Verifypageheader() throws InterruptedException{
		  ExtentTestManager.getTest().getTest().setName("TC_92_Verify navigation to AR All Debtors Report");
          ExtentTestManager.getTest().assignCategory("Module: Reports ");  
		  
          //Step1: navigate to Report module
          ReportsFactoringPage RF = cyncHomePage.getCyncMenus().openFactoringReportsPage();
          ExtentTestManager.getTest().log(LogStatus.PASS,"Successfully navigated to Report Module");
          
          //Step2:Move to particular Report
          RF.moveToReportmenus("AR All Debtors");
          ExtentTestManager.getTest().log(LogStatus.PASS,"Successfully selected AR All Debtors");
          
          //Dynamically Current Date selection
          DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy"); 
          Date date = new Date();
          String today = dateFormat.format(date); 
        
          
        //  Assert.assertTrue(RF.enterFromDate_PurchaseSummary(today));
         // Assert.assertTrue(RF.enterToDate_PurchaseSummary(today));
         
          //Step3:Click HTML button
          Assert.assertTrue(RF.clickHTMLButton());
          ExtentTestManager.getTest().log(LogStatus.PASS,"Successfully Entered data and Clicked the Popup to Generate report");
        
          //Step4: verify the Header  
          String Header = "AR All Debtors";
          Assert.assertEquals(RF.ClientActivityDetail(Header),Header);
          ExtentTestManager.getTest().log(LogStatus.PASS,"Successfully Generated AR All Debtors Report and Verified Header");
	 
          RF.Switchtochildwindow();
          ExtentTestManager.getTest().log(LogStatus.PASS,"Closed Child Window");
	  
	  }
	  
	  
	  @Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION }, testName = "Navigating to Cash Receipt Register Report")
		
      public void TC_93_navigattoCashReceiptRegisterReport_Verifypageheader() throws InterruptedException{
		  ExtentTestManager.getTest().getTest().setName("TC_93_Verify navigation to Cash Receipt Register Report");
          ExtentTestManager.getTest().assignCategory("Module: Reports ");  
		  
          //Step1: navigate to Report module
          ReportsFactoringPage RF = cyncHomePage.getCyncMenus().openFactoringReportsPage();
          ExtentTestManager.getTest().log(LogStatus.PASS,"Successfully navigated to Report Module");
          
          //Step2:Move to particular Report
          RF.moveToReportmenus("Cash Receipt Register");
          ExtentTestManager.getTest().log(LogStatus.PASS,"Successfully selected Cash Receipt Register");
          
          //Dynamically Current Date selection
          DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy"); 
          Date date = new Date();
          String today = dateFormat.format(date); 
        
          
         // Assert.assertTrue(RF.enterFromDate_PurchaseSummary(today));
         // Assert.assertTrue(RF.enterToDate_PurchaseSummary(today));
         
          //Step3:Click HTML button
          Assert.assertTrue(RF.clickHTMLButton());
          ExtentTestManager.getTest().log(LogStatus.PASS,"Successfully Entered data and Clicked the Popup to Generate report");
        
          //Step4: verify the Header  
          String Header = "Cash Receipt Register";
          Assert.assertEquals(RF.ClientActivityDetail(Header),Header);
          ExtentTestManager.getTest().log(LogStatus.PASS,"Successfully Generated Cash Receipt Register Report and Verified Header");
	
          RF.Switchtochildwindow();
          ExtentTestManager.getTest().log(LogStatus.PASS,"Closed Child Window");
	  }
	  
	  @Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION }, testName = "Navigating to Open Batch Reconciliation Report")
		
      public void TC_94_navigattoOpenBatchReconciliationReport_Verifypageheader() throws InterruptedException{
		  ExtentTestManager.getTest().getTest().setName("TC_94_Verify navigation to Open Batch Reconciliation Report");
          ExtentTestManager.getTest().assignCategory("Module: Reports ");  
		  
          //Step1: navigate to Report module
          ReportsFactoringPage RF = cyncHomePage.getCyncMenus().openFactoringReportsPage();
          ExtentTestManager.getTest().log(LogStatus.PASS,"Successfully navigated to Report Module");
          
          //Step2:Move to particular Report
          RF.moveToReportmenus("Open Batch Reconciliation");
          ExtentTestManager.getTest().log(LogStatus.PASS,"Successfully selected Open Batch Reconciliation");
          
          //Dynamically Current Date selection
          DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy"); 
          Date date = new Date();
          String today = dateFormat.format(date); 
        
          
        //  Assert.assertTrue(RF.enterFromDate_PurchaseSummary(today));
        //  Assert.assertTrue(RF.enterToDate_PurchaseSummary(today));
         
          //Step3:Click HTML button
          Assert.assertTrue(RF.clickHTMLButton());
          ExtentTestManager.getTest().log(LogStatus.PASS,"Successfully Entered data and Clicked the Popup to Generate report");
          Thread.sleep(3000);
          //Step4: verify the Header  
          String Header = "Open Batch Reconciliation";
          Assert.assertEquals(RF.ClientActivityDetail(Header),Header);
          ExtentTestManager.getTest().log(LogStatus.PASS,"Successfully Generated Open Batch Reconciliation Report and Verified Header");
	      
      
          RF.Switchtochildwindow();
          ExtentTestManager.getTest().log(LogStatus.PASS,"Closed Child Window");
	  }
	  
	  @Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION }, testName = "Navigating to Unapplied Cash Report")
		
      public void TC_95_navigattoUnappliedCashReport_Verifypageheader() throws InterruptedException{
		  ExtentTestManager.getTest().getTest().setName("TC_95_Verify navigation to Unapplied Cash Report");
          ExtentTestManager.getTest().assignCategory("Module: Reports ");  
		  
          //Step1: navigate to Report module
          ReportsFactoringPage RF = cyncHomePage.getCyncMenus().openFactoringReportsPage();
          ExtentTestManager.getTest().log(LogStatus.PASS,"Successfully navigated to Report Module");
          
          //Step2:Move to particular Report
          RF.moveToReportmenus("Unapplied Cash Report");
          ExtentTestManager.getTest().log(LogStatus.PASS,"Successfully selected Unapplied Cash Report");
          
          //Dynamically Current Date selection
          DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy"); 
          Date date = new Date();
          String today = dateFormat.format(date); 
        
          
          Assert.assertTrue(RF.enterFromDate_PurchaseSummary(today));
          Assert.assertTrue(RF.enterToDate_PurchaseSummary(today));
         
          //Step3:Click HTML button
          Assert.assertTrue(RF.clickHTMLButton());
          ExtentTestManager.getTest().log(LogStatus.PASS,"Successfully Entered data and Clicked the Popup to Generate report");
        
          //Step4: verify the Header  
          String Header = "Unapplied Cash Report";
          Assert.assertEquals(RF.ClientActivityDetail(Header),Header);
          ExtentTestManager.getTest().log(LogStatus.PASS,"Successfully Generated Unapplied Cash Report and Verified Header");
        
          RF.Switchtochildwindow();
          ExtentTestManager.getTest().log(LogStatus.PASS,"Closed Child Window");
	  }
	  
	  @Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION }, testName = "Navigating to Cash Journal / Adjustment Report")
		
      public void TC_96_navigattoCashJournalAdjustmentReport_Verifypageheader() throws InterruptedException, AWTException{
		  ExtentTestManager.getTest().getTest().setName("TC_96_Verify navigation to Cash Journal / Adjustment Report");
          ExtentTestManager.getTest().assignCategory("Module: Reports ");  
		  
          Robot robot = new Robot();
         

          /*robot.keyPress(KeyEvent.VK_CONTROL);
          robot.keyPress(KeyEvent.VK_MINUS);
          
          robot.keyRelease(KeyEvent.VK_CONTROL);
          robot.keyRelease(KeyEvent.VK_MINUS);*/
          
          /*robot.keyPress(KeyEvent.VK_CONTROL);
          robot.keyPress(KeyEvent.VK_MINUS);
          
          robot.keyRelease(KeyEvent.VK_CONTROL);
          robot.keyRelease(KeyEvent.VK_MINUS);*/
          
          //Step1: navigate to Report module
          ReportsFactoringPage RF = cyncHomePage.getCyncMenus().openFactoringReportsPage();
          ExtentTestManager.getTest().log(LogStatus.PASS,"Successfully navigated to Report Module");
          
          //Step2:Move to particular Report
          RF.moveToReportmenus("Cash Journal / Adjustment Report");
          ExtentTestManager.getTest().log(LogStatus.PASS,"Successfully selected Cash Journal / Adjustment Report");
          
          //Dynamically Current Date selection
          DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy"); 
          Date date = new Date();
          String today = dateFormat.format(date); 
        
          
          Assert.assertTrue(RF.enterFromDate_PurchaseSummary(today));
          Assert.assertTrue(RF.enterToDate_PurchaseSummary(today));
         
          //Step3:Click HTML button
          Assert.assertTrue(RF.clickHTMLButton());
          ExtentTestManager.getTest().log(LogStatus.PASS,"Successfully Entered data and Clicked the Popup to Generate report");
        
          //Step4: verify the Header  
          String Header = "Cash Journal / Adjustment Report";
          Assert.assertEquals(RF.ClientActivityDetail(Header),Header);
          ExtentTestManager.getTest().log(LogStatus.PASS,"Successfully Generated Cash Journal / Adjustment Report Report and Verified Header");
	 
          RF.Switchtochildwindow();
          ExtentTestManager.getTest().log(LogStatus.PASS,"Closed Child Window"); 
	  }
	  
	
	  @Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION }, testName = "Navigating to Daily Transactions Reconciliation Report")
		
      public void TC_97_navigattoDailyTransactionsReconciliationReport_Verifypageheader() throws InterruptedException{
		  ExtentTestManager.getTest().getTest().setName("TC_97_Verify navigation to Daily Transactions Reconciliation Report");
          ExtentTestManager.getTest().assignCategory("Module: Reports ");  
		  
          //Step1: navigate to Report module
          ReportsFactoringPage RF = cyncHomePage.getCyncMenus().openFactoringReportsPage();
          ExtentTestManager.getTest().log(LogStatus.PASS,"Successfully navigated to Report Module");
          
          //Step2:Move to particular Report
          RF.moveToReportmenus("Daily Transactions Reconciliation");
          ExtentTestManager.getTest().log(LogStatus.PASS,"Successfully selected Daily Transactions Reconciliation");
          
          //Dynamically Current Date selection
          DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy"); 
          Date date = new Date();
          String today = dateFormat.format(date); 
        
          
         // Assert.assertTrue(RF.StartDate(today));
         // Assert.assertTrue(RF.enterToDate_PurchaseSummary(today));
         
          //Step3:Click HTML button
          Assert.assertTrue(RF.clickHTMLButton());
          ExtentTestManager.getTest().log(LogStatus.PASS,"Successfully Entered data and Clicked the Popup to Generate report");
        
          //Step4: verify the Header  
          String Header = "Daily Transactions Reconciliation";
          Assert.assertEquals(RF.ClientActivityDetail(Header),Header);
          ExtentTestManager.getTest().log(LogStatus.PASS,"Successfully Generated Daily Transactions Reconciliation Report and Verified Header");
	 
          RF.Switchtochildwindow();
          ExtentTestManager.getTest().log(LogStatus.PASS,"Closed Child Window");
	  }
	  
	  @Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION }, testName = "Navigating to Broker Outstanding Invoices Report")
		
      public void TC_98_navigattoBrokerOutstandingInvoicesReport_Verifypageheader() throws InterruptedException{
		  ExtentTestManager.getTest().getTest().setName("TC_98_Verify navigation to Broker Outstanding Invoices Report");
          ExtentTestManager.getTest().assignCategory("Module: Reports ");  
		  
          //Step1: navigate to Report module
          ReportsFactoringPage RF = cyncHomePage.getCyncMenus().openFactoringReportsPage();
          ExtentTestManager.getTest().log(LogStatus.PASS,"Successfully navigated to Report Module");
          
          //Step2:Move to particular Report
          RF.moveToReportmenus("Broker Outstanding Invoices");
          ExtentTestManager.getTest().log(LogStatus.PASS,"Successfully selected Broker Outstanding Invoices");
          
          //Dynamically Current Date selection
          DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy"); 
          Date date = new Date();
          String today = dateFormat.format(date); 
        
          
          //Assert.assertTrue(RF.enterFromDate_PurchaseSummary(today));
         // Assert.assertTrue(RF.enterToDate_PurchaseSummary(today));
         
          //Step3:Click HTML button
          Assert.assertTrue(RF.clickHTMLButton());
          ExtentTestManager.getTest().log(LogStatus.PASS,"Successfully Entered data and Clicked the Popup to Generate report");
        
          //Step4: verify the Header  
          String Header = "Broker Outstanding Invoices";
          Assert.assertEquals(RF.ClientActivityDetail(Header),Header);
          ExtentTestManager.getTest().log(LogStatus.PASS,"Successfully Generated Broker Outstanding Invoices Report and Verified Header");
	      
          RF.Switchtochildwindow();
          ExtentTestManager.getTest().log(LogStatus.PASS,"Closed Child Window");
	  }
	  
	  
	   @Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION }, testName = "Navigating to Audit Log Report")
		
      public void TC_99_navigattoAuditLogReport_Verifypageheader(String un, String pwd) throws InterruptedException{
		  
		   ExtentTestManager.getTest().getTest().setName("TC_99_Verify navigation to Audit Log Report");
          ExtentTestManager.getTest().assignCategory("Module: Reports ");  
        
          //Step1: navigate to Report module
          ReportsFactoringPage RF = cyncHomePage.getCyncMenus().openFactoringReportsPage();
          ExtentTestManager.getTest().log(LogStatus.PASS,"Successfully navigated to Report Module");
          
          //Step2:Move to particular Report
          RF.moveToReportmenus("Audit Log");
          ExtentTestManager.getTest().log(LogStatus.PASS,"Successfully selected Audit Log");
          
          //Dynamically Current Date selection
          DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy"); 
          Date date = new Date();
          String today = dateFormat.format(date); 
        
          
          Assert.assertTrue(RF.enterFromDate_PurchaseSummary(today));
          Assert.assertTrue(RF.enterToDate_PurchaseSummary(today));
         
          //Step3:Click HTML button
          Assert.assertTrue(RF.clickHTMLButton());
          ExtentTestManager.getTest().log(LogStatus.PASS,"Successfully Entered data and Clicked the Popup to Generate report");
        
          //Step4: verify the Header  
          String Header = "Audit Log";
          Assert.assertEquals(RF.ClientActivityDetail(Header),Header);
          ExtentTestManager.getTest().log(LogStatus.PASS,"Successfully Generated Audit Log Report and Verified Header");
	  }
	  
	  
	  @DataProvider(name = "PageBreak")
		public Object[][] getData() {
			return TestUtil.getData(xls_reader, "PageBreak");
		}
}
