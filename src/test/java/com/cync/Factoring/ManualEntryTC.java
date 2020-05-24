package com.cync.Factoring;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.cync.FactoringPages.DataUploadPage;
import com.cync.FactoringPages.ManualEntryPage;
import com.cync.base.BaseTest;
import com.cync.base.ExtentTestManager;
import com.cync.pages.CyncHomePage;
import com.cync.pages.LoginPage;
import com.cync.utility.TestGroups;
import com.cync.utility.TestUtil;
import com.cync.utility.Xls_Reader;
import com.relevantcodes.extentreports.LogStatus;

public class ManualEntryTC extends BaseTest{

	
	Xls_Reader xls_reader = new Xls_Reader(System.getProperty("user.dir")
		    + "\\TestDataProvider\\FactoringModule.xlsx");

	 //CY-3655
		@Test(dataProvider="ManualEntry",groups={TestGroups.SMOKE,TestGroups.REGRESSION},testName="Verify navigation to Manual Entry screen")
		public void ManualEntry_01(String clientname)
		{
			ExtentTestManager.getTest().getTest().setName("Manual Entry:Verify User should able to navigate to Manual Entry screen");
			 ExtentTestManager.getTest().assignCategory("Module:Factoring");

			 LoginPage loginPage = new LoginPage(driver);
			 CyncHomePage cyncHomePage = loginPage.doLogin();
			 Assert.assertEquals(cyncHomePage.getSuccessfulMessage(),"Signed in Successfully");
			 
			 //navigate to Data upload page
			ManualEntryPage manual = cyncHomePage.getCyncMenus().openManualEntryPage(clientname);
			 ExtentTestManager.getTest().log(LogStatus.PASS, "Successfully navigated to the Manual Entry screen"); 
			 
		}
		
	
	
	@DataProvider(name = "ManualEntry")
    public Object[][] getData() {
	return TestUtil.getData(xls_reader, "ManualEntry");
    }

}
