//Author : Abirami
package com.cync.Factoring;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.cync.FactoringPages.DataUploadPage;
import com.cync.FactoringPages.FactoringFileUploadPage;
import com.cync.FactoringPages.NewInvoicesPage;
import com.cync.base.BasePage;
import com.cync.base.BaseTest;
import com.cync.base.ExtentTestManager;
import com.cync.pages.CyncHomePage;
import com.cync.pages.LoginPage;
import com.cync.utility.TestGroups;
import com.cync.utility.TestUtil;
import com.cync.utility.Xls_Reader;
import com.relevantcodes.extentreports.LogStatus;

public class DataUploadTC extends BaseTest {
	
	Xls_Reader xls_reader = new Xls_Reader(System.getProperty("user.dir")
		    + "\\TestDataProvider\\FactoringModule.xlsx");
	
    //CY-3655
	@Test(dataProvider="DataUpload",groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Verify navigation to Data Upload screen")
	public void FactoringFileUpload_01(String clientname)
	{
		ExtentTestManager.getTest().getTest().setName("Data Upload:Verify User should able to navigate to Data Upload screen");
		 ExtentTestManager.getTest().assignCategory("Module:Factoring");

		 LoginPage loginPage = new LoginPage(driver);
		 CyncHomePage cyncHomePage = loginPage.doLogin();
		 Assert.assertEquals(cyncHomePage.getSuccessfulMessage(),"Signed in Successfully");
		 
		 //navigate to Data upload page
		DataUploadPage dataUpload = cyncHomePage.getCyncMenus().openDataUploadPage(clientname);
		 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully navigated to the Data Upload screen"); 
		 
	}
	
	//CY-3660
		@Test(dataProvider="DataUpload",groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Verify File Name HyperLink in Data Upload screen")
		public void FactoringFileUpload_02(String clientname)
		{
			ExtentTestManager.getTest().getTest().setName("Data Upload:Verify File Name HyperLink Data Upload screen");
			 ExtentTestManager.getTest().assignCategory("Module:Factoring");

			 LoginPage loginPage = new LoginPage(driver);
			 CyncHomePage cyncHomePage = loginPage.doLogin();
			 Assert.assertEquals(cyncHomePage.getSuccessfulMessage(),"Signed in Successfully");
			 
			DataUploadPage dataUpload = cyncHomePage.getCyncMenus().openDataUploadPage(clientname);
			 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully navigated to the Data Upload screen");
			 
			 //verify file name hyperlink
			 Assert.assertTrue(dataUpload.FileNameHyperLinkClick_DataUploadHistory());
			 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified File Name HyperLink in Data Upload screen ");
			 
		}
		
		
		//CY-3661
		@Test(dataProvider="DataUpload",groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Verify navigation to New Invoices screen")
		public void FactoringFileUpload_03(String clientname)
		{
			ExtentTestManager.getTest().getTest().setName("Data Upload:Verify navigation to New Invoices screen");
			 ExtentTestManager.getTest().assignCategory("Module:Factoring");

			 LoginPage loginPage = new LoginPage(driver);
			 CyncHomePage cyncHomePage = loginPage.doLogin();
			 Assert.assertEquals(cyncHomePage.getSuccessfulMessage(),"Signed in Successfully");
			 
			DataUploadPage dataUpload = cyncHomePage.getCyncMenus().openDataUploadPage(clientname);
			ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully navigated to the Data Upload screen"); 
			
			//click file name hyper link and verify new invoices page
			Assert.assertTrue(dataUpload.clickFileHyperLinkAndVerfiyNewInvoice());
			ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully navigated to New Invoices Page");
			 
		}
	
		

		//CY-5469
		@Test(dataProvider="DataUpload",groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Verify navigation to Image Mapping Popup")
		public void FactoringFileUpload_04(String clientname)
		{
			ExtentTestManager.getTest().getTest().setName("Data Upload:Verify navigation to Image Mapping Popup");
			 ExtentTestManager.getTest().assignCategory("Module:Factoring");

			 LoginPage loginPage = new LoginPage(driver);
			 CyncHomePage cyncHomePage = loginPage.doLogin();
			 Assert.assertEquals(cyncHomePage.getSuccessfulMessage(),"Signed in Successfully");
			 
			DataUploadPage dataUpload = cyncHomePage.getCyncMenus().openDataUploadPage(clientname);
			ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully navigated to the Data Upload screen"); 
			
			//click Schedule no hyper link and verify image mapping popup
			/*Assert.assertTrue(dataUpload.clickSheduleHyperLinkAndVerfiyImageMapping());
			ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked ScheduleNo Hyper Link and Navigated to Image Mapping popup");*/
			 
		}
		
		
		//CY-5470
		@Test(dataProvider="DataUpload",groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Verify Undo Button in Data Upload screen")
		public void FactoringFileUpload_05(String clientname)
		{
			ExtentTestManager.getTest().getTest().setName("Data Upload:Verify Undo Button in Data Upload screen");
			ExtentTestManager.getTest().assignCategory("Module:Factoring");

			 LoginPage loginPage = new LoginPage(driver);
			 CyncHomePage cyncHomePage = loginPage.doLogin();
			 Assert.assertEquals(cyncHomePage.getSuccessfulMessage(),"Signed in Successfully");
					 
			 DataUploadPage dataUpload = cyncHomePage.getCyncMenus().openDataUploadPage(clientname);
			 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully navigated to the Data Upload screen");
			 
			 //click undo button
			 Assert.assertTrue(dataUpload.clickUndoBTN());
			 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked Undo button in Data Upload screen");
			 
			 //verify undo success message
			 Assert.assertTrue(dataUpload.VerifyUndoSuccessMsg());
			 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully got Undoing message");			
					
		}
					
		
		
	
	@DataProvider(name = "FileUpload")
    public Object[][] getData() {
	return TestUtil.getData(xls_reader, "FileUpload");
    }

}
