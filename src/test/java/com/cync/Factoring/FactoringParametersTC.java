//Author : Abirami
package com.cync.Factoring;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;





import com.cync.ClientMaintenance.FactoringFeeSetupPage;
import com.cync.base.BaseTest;
import com.cync.base.ExtentTestManager;
import com.cync.pages.BasicParametersPage;
import com.cync.pages.CyncHomePage;
import com.cync.pages.LoginPage;
import com.cync.utility.TestGroups;
import com.cync.utility.TestUtil;
import com.cync.utility.Xls_Reader;
import com.relevantcodes.extentreports.LogStatus;

public class FactoringParametersTC extends BaseTest{
	Xls_Reader xls_reader = new Xls_Reader(System.getProperty("user.dir")
		    + "\\TestDataProvider\\FactoringModule.xlsx");
	
	//CY-3643
	@Test(dataProvider="BasicParameters",groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Verify all the fields in basic parameters")
	public void FactoringParametersTC_01(String clientname,String invValTemp,String recourseDays,String recourseFee,String feeDays,String successmsg)
	{
		 ExtentTestManager.getTest().getTest().setName("Factoring Basic Parameters:Verify all the fileds in Basic Parameters Screen");
		 ExtentTestManager.getTest().assignCategory("Module:Factoring");

		 LoginPage loginPage = new LoginPage(driver);
		 CyncHomePage cyncHomePage = loginPage.doLogin();
		 Assert.assertEquals(cyncHomePage.getSuccessfulMessage(),"Signed in Successfully");
		 
		 BasicParametersPage basicParameters = cyncHomePage.getCyncMenus().openBasicParameters();
		 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully navigated to Basic Parameters Pager");
		 
		 Assert.assertTrue(basicParameters.clickOnEditBTN());
		 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked Edit button in Basic Parameters screen");
		 
		 //select invoice validation template
		 Assert.assertEquals(basicParameters.InvValTempDropdownValues(invValTemp), invValTemp);
		 ExtentTestManager.getTest().log(LogStatus.PASS,"Successfully selected invoice Validation Template from drop down");
		 
		 
		 //select recourse factoring check box
		 Assert.assertTrue(basicParameters.clickOnRecourseFactoringCheckBox());
		 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully checked Recourse Factoring checkbox in Basic parameters screen");
		 
		 //passing data to recourse days
		 Assert.assertEquals(basicParameters.addValueToRecourseDays(recourseDays), recourseDays);
		 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully passing data to Recourse Days text box in Basic Parameters screen");
		 
		 //passing data to recourse fee
		 Assert.assertEquals(basicParameters.addValueToRecourseFee(recourseFee), recourseFee);
		 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully passing data to Recourse Fee text box in Basic Paramaters screen");
		
		 //click save button
		 Assert.assertTrue(basicParameters.clickOnSaveButton());
		 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully clicked Save Button in Basic Parameters screen");
		 
		 //verifying success message
		 Assert.assertEquals(basicParameters.verifySuccessMessageAfterEditingValue(successmsg),successmsg);
		 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully verified Success Message in Basic Parameters screen");

	}
	
	
	
	
	@DataProvider(name = "BasicParameters")
    public Object[][] getData() {
	return TestUtil.getData(xls_reader, "BasicParameters");
    }
}
