/*//Author : Abirami
package com.cync.Factoring;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.cync.base.BaseTest;
import com.cync.base.ExtentTestManager;
import com.cync.pages.CyncHomePage;
import com.cync.pages.FactoringClientCreationPage;
import com.cync.pages.IneligiblePage;
import com.cync.pages.LoginPage;
import com.cync.pages.MappingListViewPage;
import com.cync.utility.TestGroups;
import com.relevantcodes.extentreports.LogStatus;

public class FactoringMappingTC extends BaseTest{
	
	//CY-3620
	@Test(groups = { TestGroups.SMOKE, TestGroups.REGRESSION }, testName = "Factoring: mapping Creation")
	public void MappingTC_001()
	{
		ExtentTestManager.getTest().getTest().setName("Factoring: Navigate To Mapping List View");
	    ExtentTestManager.getTest().assignCategory("Module:Factoring");
	    
	    LoginPage loginPage = new LoginPage(driver);
	    CyncHomePage cyncHomePage = loginPage.doLogin();
	    Assert.assertEquals(cyncHomePage.getSuccessfulMessage(),"Signed in Successfully");
	    
	    
	    String clientname = "Fact001_automation";
	   
	    //select client from list
	    Assert.assertTrue(cyncHomePage.getCyncMenus().selectClientFromDropDown(clientname));
	   ExtentTestManager.getTest().log(LogStatus.PASS,"Successfully clicked client from the dropdown list");
	   
	   //navigate to mapping list view screen
	   cyncHomePage.getCyncMenus().openMappingListView(clientname);
	   ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully navigate to Mapping List view Page");
	    
	}
	
	//CY-3621
	@Test( groups = {TestGroups.SMOKE, TestGroups.REGRESSION }, testName = "Factoring: Mapping Creation")
	public void MappingTC_002()
	{
		ExtentTestManager.getTest().getTest().setName("Factoring: Navigate to Create New Mapping");
		ExtentTestManager.getTest().assignCategory("Module: Factoring");
		
		LoginPage loginPage = new LoginPage(driver);
	    CyncHomePage cyncHomePage = loginPage.doLogin();
	    Assert.assertEquals(cyncHomePage.getSuccessfulMessage(),"Signed in Successfully");
	    
        String clientname = "Fact001_automation";
	    
        //select client from list
	    Assert.assertTrue(cyncHomePage.getCyncMenus().selectClientFromDropDown(clientname));
	    ExtentTestManager.getTest().log(LogStatus.PASS,"Successfully clicked client from the dropdown list");
	   
	    //navigate to mapping list view screen
	    cyncHomePage.getCyncMenus().openMappingListView(clientname);
	    ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully navigate to Mapping List view Page");
	    
	    MappingListViewPage mvp = new MappingListViewPage(driver);
	    
	    //click create new button
	    Assert.assertTrue(mvp.ClickOnCreateNewBTN());
	    ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully Clicked on create new Mapping button");
	    
	}
	
	//CY-3625
	@Test( groups = {TestGroups.SMOKE,TestGroups.REGRESSION }, testName = "Factoring: Mapping Creation ")
	public void MappingTC_003()
	{
		ExtentTestManager.getTest().getTest().setName("Factoring: Verify Next Button in Mapping List view");
		ExtentTestManager.getTest().assignCategory("Module: Factoring");
		
		LoginPage loginPage = new LoginPage(driver);
	    CyncHomePage cyncHomePage = loginPage.doLogin();
	    Assert.assertEquals(cyncHomePage.getSuccessfulMessage(),"Signed in Successfully");
	    
        String clientname = "Fact001_automation";
	    
        //select client from list
	    Assert.assertTrue(cyncHomePage.getCyncMenus().selectClientFromDropDown(clientname));
	    ExtentTestManager.getTest().log(LogStatus.PASS,"Successfully clicked client from the dropdown list");
	   
	    //naviagte to mapping list view screen
	    cyncHomePage.getCyncMenus().openMappingListView(clientname);
	    ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully navigate to Mapping List view Page");
	    
	    MappingListViewPage mvp = new MappingListViewPage(driver);
	    
	    //click create new button
	    Assert.assertTrue(mvp.ClickOnCreateNewBTN());
	    ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully Clicked on create new Mapping button");
	    
	    //click next button
	    Assert.assertTrue(mvp.nextButtonClick());
	    ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully Clicked on next button");
	}
	
	//CY-3627
	@Test( groups = {TestGroups.SMOKE,TestGroups.REGRESSION }, testName = "Factoring Mapping Creation" )
	public void MappingTC_004()
	{
		ExtentTestManager.getTest().getTest().setName("Factoring: Verify Dropdown in Mapping List View");
		ExtentTestManager.getTest().assignCategory("Module: Factoring");
		
		LoginPage loginPage = new LoginPage(driver);
	    CyncHomePage cyncHomePage = loginPage.doLogin();
	    Assert.assertEquals(cyncHomePage.getSuccessfulMessage(),"Signed in Successfully");
	    
        String clientname = "Fact001_automation";
	    
        //select client from list
	    Assert.assertTrue(cyncHomePage.getCyncMenus().selectClientFromDropDown(clientname));
	    ExtentTestManager.getTest().log(LogStatus.PASS,"Successfully clicked client from the dropdown list");
	   
	    //navigate to mapping list view screen
	    cyncHomePage.getCyncMenus().openMappingListView(clientname);
	    ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully navigate to Mapping List view Page");
	    
	    MappingListViewPage mvp = new MappingListViewPage(driver);
	    
	    //click create new button
	    Assert.assertTrue(mvp.ClickOnCreateNewBTN());
	    ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully Clicked on create new Mapping button");
	    
	    //verify data file type field
	    Assert.assertTrue(mvp.VerifyDataFileTypeDropdown());
	    ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified Data File Type Field dropdown in Mapping List View screen");
	    
	    //verify collateral name field
	    Assert.assertTrue(mvp.VerifyCollteralNameDropdown());
	    ExtentTestManager.getTest().log(LogStatus.PASS, "Succesfully verified Collateral name dropdown in Mapping List View screen");
	    
	    //verify file format drop down
	    Assert.assertTrue(mvp.VerifyFileFormatDropdown());
	    ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified File Format dropdown in Mapping List View screen");
	    
	}
	
	//CY-3628
	@Test(groups ={TestGroups.SMOKE,TestGroups.REGRESSION }, testName = "Factoring Mapping Creation" )
	public void MappingTC_005()
	{
		ExtentTestManager.getTest().getTest().setName("Factoring: Verify Create Mapping for Ar Details");
		ExtentTestManager.getTest().assignCategory("Module: Factoring");
		
		LoginPage loginPage = new LoginPage(driver);
	    CyncHomePage cyncHomePage = loginPage.doLogin();
	    Assert.assertEquals(cyncHomePage.getSuccessfulMessage(),"Signed in Successfully");
	    
        String clientname = "Fact001_automation";
	    
        //select client from list
	    Assert.assertTrue(cyncHomePage.getCyncMenus().selectClientFromDropDown(clientname));
	    ExtentTestManager.getTest().log(LogStatus.PASS,"Successfully Selected client from the dropdown list");
	   
	    //navigate to mapping list view screen
	    cyncHomePage.getCyncMenus().openMappingListView(clientname);
	    ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully navigate to Mapping List view Page");
	    
	    MappingListViewPage mvp = new MappingListViewPage(driver);
	    
	    //click create new button
	    Assert.assertTrue(mvp.ClickOnCreateNewBTN());
	    ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully Clicked on create new Mapping button");
	    
	    String mappingNameData = "ArDetails";
	    
	    //passing data mapping name field
	    Assert.assertEquals(mvp.addValueToMappingName(mappingNameData), mappingNameData);
	    ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully passing data to Mapping name text box in Mapping List View screen");
	    
	    String dataFileTypeData = "AR Details";
	    
	    //passing data data file type field
	    Assert.assertTrue(mvp.dataFileTypedropdownValues(dataFileTypeData));
	    ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully passing data to Data File Type dropdown in Mapping List View screen");
	    
	    String collateralNameData = "Factoring Fee";
	    
	    //passing data to collateral name field
	    Assert.assertEquals(mvp.collateralNameFieldInput(collateralNameData), collateralNameData);
	    ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully passing data to Collateral Name dropdown in Mapping List View screen");
	    
	    String fileFormatData = "XLSX";
	    
	    //passing data to file format field
	    Assert.assertTrue(mvp.fileFormatdropdownValues(fileFormatData));
	    ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully passing data to File Format dropdown in Mapping List View screen");
	    
	    String sheetNoData = "1";
	    
	    //passing data to sheet no field
	    Assert.assertTrue(mvp.sheetNoFieldInput(sheetNoData));
	    ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully passing data to SheetNo text box in Mapping List View screen");
	    
	    //click choose file button and upload file
	    Assert.assertTrue(mvp.fileUPload_MappingARDetails_Factoring());
	    ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully Ar Details file uploaded");
	    
	    //click next button
	    Assert.assertTrue(mvp.nextButtonClick());
	    ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully Clicked next button in Mapping List View screen");
	    
	    String noOfHeaderRowsData = "1";
	    
	    //passing data to no of header row field
	    Assert.assertTrue(mvp.noOfHeaderRowsFieldInput(noOfHeaderRowsData));
	    ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully passing data to NoofHeaderRow test box in Mapping List View screen");
	    
	    //click next button
	    Assert.assertTrue(mvp.nextButtonClick());
	    ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully Clicked next button in Mapping List View screen");
	    
	    String accNoData = "A/C Num";
	    
	    //passing data to account no field
	    Assert.assertTrue(mvp.accountNodropdownValues(accNoData));
	    ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully passing data to Accout No dropdown in Mapping List View screen");
	    
	    String accNameData = "Name";
	    
	    //passing data to account name field
	    Assert.assertTrue(mvp.accountNamedropdownValues(accNameData));
	    ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully passing data to Account Name dropdown in Mapping List View screen");
	    
	    String invoiceNoData = "Invoice no.";
	    
	    //passing data to invoice no field
	    Assert.assertTrue(mvp.InvoicenodropdownValues(invoiceNoData));
	    ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully passing data to Invoice No dropdown in Mapping List View screen");
	    
	    String PONoData = "P.O.#";
	    
	    //passing data to po no field
	    Assert.assertEquals(mvp.PODropdownValues(PONoData),PONoData);
	    ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully passing data to PO dropdown in Mapping List View screen");
	    
	    String originalDateData = "Date";
	    
	    //passing data to original date field
	    Assert.assertTrue(mvp.originalDatedropdownValues(originalDateData));
	    ExtentTestManager.getTest().log(LogStatus.PASS, "Successfuly passsing data to Original Date dropdown in Mapping List View screen");
	    
	    String invoiceAmountData = "Öpen Balance";
	    
	    //passing data to invoice amount field
	    Assert.assertEquals(mvp.invoiceAmountdropdownValues(invoiceAmountData), invoiceAmountData);
	    ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully passing data to Invoice Amount dropdown in Mapping List View screen");
	    
	    String dueDateData = "Due Date";
	    
	    //passing data to due date field
	    Assert.assertEquals(mvp.DueDateDropdownValues(dueDateData), dueDateData);
	    ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully passing data to DueDate dropdown in Mapping List View screen");
	    
	    String batchRefNoData = "reference no.";
	    
	    //passing data to bank ref no field
	    Assert.assertEquals(mvp.BatchreferenceNoDropDownValues(batchRefNoData),batchRefNoData);
	    ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully passing data to Bank Ref No dropdown in Mapping List View screen");
	    
	    //select image file format 
	    Assert.assertTrue(mvp.ImageFileFormatRadioButtonClick());
	    ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully Selected Image File Format in Mapping List View screen");
	    
	    //click next button
	    Assert.assertTrue(mvp.nextButtonClick());
	    ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully Clicked next button in Mapping List View screen");
	    
	    String map4AccNoData = "Facttest";
	    
	    //verify mapped account no field 
	    Assert.assertTrue(mvp.verifyMappedAccNo(map4AccNoData));
	    ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully veified mapped Account No in Mapping List View screen");
	    
	    String map4InvNoData = "FactInvNo1";
	    
	    //verify mapped invoice no field 
	    Assert.assertTrue(mvp.verifyMappedInvNo(map4InvNoData));
	    ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified mapped Invoice No in Mapping List View screen");
	    
	    //click save button
	    Assert.assertTrue(mvp.ClickOnSaveBTN());
	    ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked Save Button in Mapping List View screen");
	}
	
	//CY-3631
	@Test(groups ={TestGroups.SMOKE,TestGroups.REGRESSION }, testName = "Factoring Mapping Creation" )
	public void MappingTC_006()
	{
		ExtentTestManager.getTest().getTest().setName("Factoring: Verify Mapping List View in Mapping List View screen");
		ExtentTestManager.getTest().assignCategory("Module: Factoring");
		
		LoginPage loginPage = new LoginPage(driver);
	    CyncHomePage cyncHomePage = loginPage.doLogin();
	    Assert.assertEquals(cyncHomePage.getSuccessfulMessage(),"Signed in Successfully");
	    
        String clientname = "Fact001_automation";
	    
	    Assert.assertTrue(cyncHomePage.getCyncMenus().selectClientFromDropDown(clientname));
	    ExtentTestManager.getTest().log(LogStatus.PASS,"Successfully Selected client from the dropdown list");
	   
	    //navigate to mapping list view screen
	    cyncHomePage.getCyncMenus().openMappingListView(clientname);
	    ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully navigate to Mapping List view Page");
	    
	    MappingListViewPage mvp = new MappingListViewPage(driver);
	    
	    //click create new button
	    Assert.assertTrue(mvp.ClickOnCreateNewBTN());
	    ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked Create new button in Mapping List View screen");
	    
	    //click mapping list view button
	    Assert.assertTrue(mvp.Click_on_Map1listview());
	    ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked Mapping List View button in Mapping List View screen");
	    
	    //navigate to main mapping list view screen 
	    Assert.assertTrue(mvp.VerifyPageHeader());
	    ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully navigated to main Mapping List View screen");
	}
	
	
	//CY-3633
	@Test(groups ={TestGroups.SMOKE,TestGroups.REGRESSION }, testName = "Factoring Mapping Creation" )
	public void MappingTC_007()
	{
		ExtentTestManager.getTest().getTest().setName("Factoring: Verify Delete in Mapping List View screen");
		ExtentTestManager.getTest().assignCategory("Module: Factoring");
		
		LoginPage loginPage = new LoginPage(driver);
	    CyncHomePage cyncHomePage = loginPage.doLogin();
	    Assert.assertEquals(cyncHomePage.getSuccessfulMessage(),"Signed in Successfully");
	    
        String clientname = "Fact001_automation";
	    
        //select client from list
	    Assert.assertTrue(cyncHomePage.getCyncMenus().selectClientFromDropDown(clientname));
	    ExtentTestManager.getTest().log(LogStatus.PASS,"Successfully Selected client from the dropdown list");
	    
	    //navigate to mapping list view page
	    cyncHomePage.getCyncMenus().openMappingListView(clientname);
	    ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully navigate to Mapping List view Page");
	    
	    MappingListViewPage mvp = new MappingListViewPage(driver);
	    
	    //click delete button
	    Assert.assertTrue(mvp.ClickOnDeleteBTN());
	    ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked Delete button in Mapping List view screen");
	    
	    //verify delete message
	    Assert.assertTrue(mvp.VerifyDeleteMessage());
	    ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully Mapping was Deleted");
	    
	}
	
	
	//CY-3635
	@Test(groups ={TestGroups.SMOKE,TestGroups.REGRESSION }, testName = "Factoring Mapping Creation" )
	public void MappingTC_008()
	{
		ExtentTestManager.getTest().getTest().setName("Factoring: Verify MappingName Hyper Link in Mapping List View screen");
		ExtentTestManager.getTest().assignCategory("Module: Factoring");
		
		LoginPage loginPage = new LoginPage(driver);
	    CyncHomePage cyncHomePage = loginPage.doLogin();
	    Assert.assertEquals(cyncHomePage.getSuccessfulMessage(),"Signed in Successfully");
	    
        String clientname = "Fact001_automation";
	    
        //select client from list
	    Assert.assertTrue(cyncHomePage.getCyncMenus().selectClientFromDropDown(clientname));
	    ExtentTestManager.getTest().log(LogStatus.PASS,"Successfully Selected client from the dropdown list");
	    
	    //navigate to mapping list view page
	    cyncHomePage.getCyncMenus().openMappingListView(clientname);
	    ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully navigate to Mapping List view Page");
	    
	    MappingListViewPage mvp = new MappingListViewPage(driver);
	    
	    //click mapping name hyper link
	    Assert.assertTrue(mvp.ClickOnMappinhNameHyperLink());
	    ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked Mapping name hyperlink in Mapping List View screen");
	    
	    //navigate to step 1 of mapping
	    Assert.assertTrue(mvp.VerifyDataFileType());
	    ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully navigated to Step 1 of Mapping");
	    
	}

}
*/