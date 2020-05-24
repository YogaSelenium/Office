//Author : Abirami
package com.cync.Factoring;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.cync.FactoringPages.FactoringFileUploadPage;
import com.cync.FactoringPages.NewInvoicesPage;
import com.cync.base.BaseTest;
import com.cync.base.ExtentTestManager;
import com.cync.pages.CyncHomePage;
import com.cync.pages.LoginPage;
import com.cync.utility.TestGroups;
import com.cync.utility.TestUtil;
import com.cync.utility.Xls_Reader;
import com.relevantcodes.extentreports.LogStatus;

public class FactoringFileUploadTC extends BaseTest{
	
	Xls_Reader xls_reader = new Xls_Reader(System.getProperty("user.dir")
		    + "\\TestDataProvider\\FactoringModule.xlsx");
	
    //CY-3645
	@Test(dataProvider="FileUpload",groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Verify navigation to Factoring File Upload screen")
	public void FactoringFileUpload_01(String clientname)
	{
		ExtentTestManager.getTest().getTest().setName("Factoring File Upload:Verify User should able to navigate to Factoring File Upload screen");
		 ExtentTestManager.getTest().assignCategory("Module:Factoring");

		 LoginPage loginPage = new LoginPage(driver);
		 CyncHomePage cyncHomePage = loginPage.doLogin();
		 Assert.assertEquals(cyncHomePage.getSuccessfulMessage(),"Signed in Successfully");
		 
		 //navigate to Factoring file upload screen
		 FactoringFileUploadPage factFileUpload = cyncHomePage.getCyncMenus().openFactoringFileUpload(clientname);
		 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully navigated to the Factoring File Upload screen"); 
		 
	}
	
	
	//CY-3646
	@Test(dataProvider="FileUpload",groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Verify Fields in Factoring File Upload screen")
	public void FactoringFileUpload_02(String clientname)
	{
		ExtentTestManager.getTest().getTest().setName("Factoring File Upload:Verify Data File Type and Collateral Name to Factoring File Upload screen");
		 ExtentTestManager.getTest().assignCategory("Module:Factoring");

		 LoginPage loginPage = new LoginPage(driver);
		 CyncHomePage cyncHomePage = loginPage.doLogin();
		 Assert.assertEquals(cyncHomePage.getSuccessfulMessage(),"Signed in Successfully");
		 
		 FactoringFileUploadPage factFileUpload = cyncHomePage.getCyncMenus().openFactoringFileUpload(clientname);
		 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully navigated to the Factoring File Upload screen"); 
		 
		 String dataFileTypeData = "Receivables";
		 
		 //verify Data file type field
		 Assert.assertTrue(factFileUpload.verifyDataFileType_FactFileUploadHistory(dataFileTypeData));
		 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified Data File Type field in Factorig File Upload screen");
		 
		 String collateralNameData = "FactTest";
		 
		 //verify collateral name field
		 Assert.assertTrue(factFileUpload.verifyCollateralName_FactFileUploadHistory(collateralNameData));
		 ExtentTestManager.getTest().log(LogStatus.PASS, "successfully verified Collateral Name in FActoring File Upload screen");
		 
	}
	
	//CY-3650
	
	@Test(dataProvider="FileUpload",groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Verify uploading Receivables in Factoring File Upload screen")
	public void FactoringFileUpload_04(String clientname)
	{
		ExtentTestManager.getTest().getTest().setName("Factoring File Upload:Verify User should able to upload the Receivables in Factoring File Upload screen");
		 ExtentTestManager.getTest().assignCategory("Module:Factoring");

		 LoginPage loginPage = new LoginPage(driver);
		 CyncHomePage cyncHomePage = loginPage.doLogin();
		 Assert.assertEquals(cyncHomePage.getSuccessfulMessage(),"Signed in Successfully");
		 
		 FactoringFileUploadPage factFileUpload = cyncHomePage.getCyncMenus().openFactoringFileUpload(clientname);
		 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully navigated to the Factoring File Upload screen"); 
		 
		 //click choose file button
		 Assert.assertTrue(factFileUpload.ChooseFileBTN_click());
		 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked Choose File Button in Factoring File Upload screen");
		 
		 //select file from folder to upload
		 Assert.assertTrue(factFileUpload.fileUPload_MappingARDetails_Factoring());
		 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully adble to select file from folder");
		 
		 //click process files button and verify success message
		 Assert.assertTrue(factFileUpload.ProcessFilesClick());
		 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully File was uploaded");
	}
	
	//CY-3663
	@Test(dataProvider="FileUpload",groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Verify uploading Receivables along with image")
	public void FactoringFileUpload_06(String clientname)
	{
		ExtentTestManager.getTest().getTest().setName("Factoring File Upload:Verify User should able to upload the Receivables along with image");
		 ExtentTestManager.getTest().assignCategory("Module:Factoring");

		 LoginPage loginPage = new LoginPage(driver);
		 CyncHomePage cyncHomePage = loginPage.doLogin();
		 Assert.assertEquals(cyncHomePage.getSuccessfulMessage(),"Signed in Successfully");
		 
		 FactoringFileUploadPage factFileUpload = cyncHomePage.getCyncMenus().openFactoringFileUpload(clientname);
		 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully navigated to the Factoring File Upload screen"); 
		 
		 //click choose file button
		 Assert.assertTrue(factFileUpload.ChooseFileBTN_click());
		 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked Choose File Button in Factoring File Upload screen");
		 
		 //select file from folder
		 Assert.assertTrue(factFileUpload.fileUPload_MappingARDetails_Factoring());
		 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully adble to select file from folder");
		 
		 //click choose image file button
		 Assert.assertTrue(factFileUpload.ChooseImageFileBTN_click());
		 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked Choose Image File Button in Factoring File Upload screen");
		 
		 //select image from file
		 Assert.assertTrue(factFileUpload.fileUPload_ImageFile_Factoring());
		 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully able to select image file from folder");
		 
		 //click process button and verify success message
		 Assert.assertTrue(factFileUpload.ProcessFilesClick());
		 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully File was uploaded");
		 
		 String Header = "New Invoices";
		 NewInvoicesPage newInv = cyncHomePage.getCyncMenus().openNewInvoicesPage();
		 Assert.assertEquals(newInv.PageHeaderVerify(Header),Header);
		 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully navigated to New Invoices Page");
		 
		 //passing data to schedule no field
		 Assert.assertTrue(newInv.addValueToSheduleNo());
		 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully entered Schedule No in Schedule No text box in Naew invoices Page");
		 
		 //click image hyper link
		 Assert.assertTrue(newInv.ClickOnClickToImage_HyperLink());
		 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked Click To Image Hyper Link in New Invoices Page");
		 
		 //verify image mapping popup
		 Assert.assertTrue(newInv.VerifyImageMappingPopup());
		 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully got Image Mapping Page");
		 
	}
	
	//CY-5468
	@Test(dataProvider="FileUpload",groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Verify Non Invoice Check Box in Image Mapping Popup")
	public void FactoringFileUpload_11(String clientname)
	{
		ExtentTestManager.getTest().getTest().setName("Factoring File Upload:Verify Non Invoice Check Box in Image Mapping Popup");
		 ExtentTestManager.getTest().assignCategory("Module:Factoring");

		 LoginPage loginPage = new LoginPage(driver);
		 CyncHomePage cyncHomePage = loginPage.doLogin();
		 Assert.assertEquals(cyncHomePage.getSuccessfulMessage(),"Signed in Successfully");
		 
		 FactoringFileUploadPage factFileUpload = cyncHomePage.getCyncMenus().openFactoringFileUpload(clientname);
		 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully navigated to the Factoring File Upload screen"); 
		 
		 //click choose file button
		 Assert.assertTrue(factFileUpload.ChooseFileBTN_click());
		 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked Choose File Button in Factoring File Upload screen");
		 
		 //select file from folder
		 Assert.assertTrue(factFileUpload.fileUPload_MappingARDetails_Factoring());
		 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully able to select file from folder");
		 
		 //click choose image file button
		 Assert.assertTrue(factFileUpload.ChooseImageFileBTN_click());
		 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked Choose Image File Button in Factoring File Upload screen");
		 
		 //select image file from folder
		 Assert.assertTrue(factFileUpload.fileUPload_ImageFile_Factoring());
		 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully able to select image file from folder");
		 
		 //click process file button and verify success message 
		 Assert.assertTrue(factFileUpload.ProcessFilesClick());
		 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully File was uploaded");
		 
		 //navigate to new invoices page
		 String Header = "New Invoices";
		 NewInvoicesPage newInv = cyncHomePage.getCyncMenus().openNewInvoicesPage();
		 Assert.assertEquals(newInv.PageHeaderVerify(Header),Header);
		 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully navigated to New Invoices Page");
		 
		 //passing data to schedule no field
		 Assert.assertTrue(newInv.addValueToSheduleNo());
		 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully entered Schedule No in Schedule No text box in Naew invoices Page");
		 
		 //click image hyper link
		 Assert.assertTrue(newInv.ClickOnClickToImage_HyperLink());
		 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked Click To Image Hyper Link in New Invoices Page");
		 
		 //verify image mapping popup
		 Assert.assertTrue(newInv.VerifyImageMappingPopup());
		 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully got Image Mapping Page");
		 
		 //click non invoice check box
		 /*Assert.assertTrue(newInv.ClickOnClickToNonInvoiceCheckBox());
		 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully checked Non Invoice Check Box");*/
		 
		 //verify invoice list visibility
		 Assert.assertTrue(newInv.VerifyInvoiceListCheckBox());
		 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully Invoice List was disabled");
		 
	}
	
	//CY-5476
	
		@Test(dataProvider="FileUpload",groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Verify Expected Value text box in Factoring File Upload page")
		public void FactoringFileUpload_12(String clientname)
		{
			ExtentTestManager.getTest().getTest().setName("Factoring File Upload:Verify Expected Value text box in FActoring File Upload Page");
			 ExtentTestManager.getTest().assignCategory("Module:Factoring");

			 LoginPage loginPage = new LoginPage(driver);
			 CyncHomePage cyncHomePage = loginPage.doLogin();
			 Assert.assertEquals(cyncHomePage.getSuccessfulMessage(),"Signed in Successfully");
			 
			 FactoringFileUploadPage factFileUpload = cyncHomePage.getCyncMenus().openFactoringFileUpload(clientname);
			 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully navigated to the Factoring File Upload screen"); 
			 
			 //click choose file button
			 Assert.assertTrue(factFileUpload.ChooseFileBTN_click());
			 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked Choose File Button in Factoring File Upload screen");
			 
			 //select file from folder
			 Assert.assertTrue(factFileUpload.fileUPload_MappingARDetails_Factoring());
			 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully adble to select file from folder");
			 
			 //click choose image file button
			 Assert.assertTrue(factFileUpload.ChooseImageFileBTN_click());
			 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked Choose Image File Button in Factoring File Upload screen");
			 
			 String expectedValueData = "10000" ;
			 
			 //passing data to expected value text box
			 Assert.assertEquals(factFileUpload.addValueToExpectedValue(expectedValueData), expectedValueData);
			 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully passing data to Expected value text box in File Upload page");;
		}
		
		//CY-5478
		@Test(dataProvider="FileUpload",groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Verify uploading Receivables in Factoring File Upload screen")
		public void FactoringFileUpload_13(String clientname)
		{
			ExtentTestManager.getTest().getTest().setName("Factoring File Upload:Verify User should able to upload the Receivables in Factoring File Upload screen");
			 ExtentTestManager.getTest().assignCategory("Module:Factoring");

			 LoginPage loginPage = new LoginPage(driver);
			 CyncHomePage cyncHomePage = loginPage.doLogin();
			 Assert.assertEquals(cyncHomePage.getSuccessfulMessage(),"Signed in Successfully");
			 
			 FactoringFileUploadPage factFileUpload = cyncHomePage.getCyncMenus().openFactoringFileUpload(clientname);
			 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully navigated to the Factoring File Upload screen"); 
			 
			 //click choose file button
			 Assert.assertTrue(factFileUpload.ChooseFileBTN_click());
			 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked Choose File Button in Factoring File Upload screen");
			 
			 //select file from folder
			 Assert.assertTrue(factFileUpload.fileUPload_MappingARDetails_Factoring());
			 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully adble to select file from folder");
			 
			 //click process file button
			 Assert.assertTrue(factFileUpload.ProcessFilesClick());
			 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully File was uploaded");
			 
			 //click close success message button
			 Assert.assertTrue(factFileUpload.ClickCloseSuccessMSG_BTN());
			 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked Close Success Message button in Factoring File Upload page");
		}
	
	
	@DataProvider(name = "FileUpload")
    public Object[][] getData() {
	return TestUtil.getData(xls_reader, "FileUpload");
    }
	
}
