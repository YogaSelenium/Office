package com.cync.pages;



import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.SkipException;

import com.cync.base.BasePage;

public class BBCAvailabilityHistoryPage extends BasePage {

	private final By BBCAvailabilityHeader_xpath=By.xpath("//span[contains(text(),'BBC Availability')]");
	private final By totalAgedReceivables_xpath=By.xpath("//td[contains(text(),'Total Aged Receivables')]");
	private final By totalAgedReceivablesValue_xpath=By.xpath("//div[@class='reportsPannel']/table/tbody/tr[21]/td[8]/span");
	private final By arBorrowingBase_xpath=By.xpath("//td[contains(text(),'AR Borrowing Base')]");
    private final By arBorrowingBaseValue_xpath=By.xpath("//div[@class='reportsPannel']/table/tbody/tr[29]/td[8]/span");
    private final By fundedAmount_xpath=By.xpath("//td[contains(text(),'Funded Amount')]");



    
  //>>>>>>>>>>>>>>>>>>>>>>>
    private final By AmendBBC_xpath=By.xpath("//a[contains(text(),'Amend BBC')]");
    private final By BBCPrint_xpath=By.xpath("//a[contains(text(),'BBC Print')]");
    private final By SaveOnBBCAvailablity_xpath=By.xpath("//div[contains(text(),'Save')]");
    private final By CancelOnBBCAvailablity_xpath=By.xpath("//a[contains(text(),'Cancel')]");
    private final By bbcAvailability_xpath=By.xpath("(//a[text()='BBC Availability'])[3]");
    private final By periorBalanceEditTextBox_xpath=By.xpath("(//input[@class='bbc_editable_options'])[1]");
    private final By NewSalesEditTextBox_xpath=By.xpath("(//input[@class='bbc_editable_options'])[2]");
    private final By NewCreditsTextBox_xpath=By.xpath("(//input[@class='bbc_editable_options'])[3]");
    private final By NewCashCollectedTextBox_xpath=By.xpath("(//input[@class='bbc_editable_options'])[4]");
    private final By NewAdjustmentTextBox_xpath=By.xpath("(//input[@class='bbc_editable_options'])[5]");
    private final By BBCAdjiustmentTextBox_xpath=By.xpath("(//input[@class='bbc_editable_options'])[6]");
    private final By FutureTextBox_xpath=By.xpath("(//input[@class='bbc_editable_options'])[9]");
    private final By CurrentTextBox_xpath=By.xpath("(//input[@class='bbc_editable_options'])[10]");
    private final By Over30TextBox_xpath=By.xpath("(//input[@class='bbc_editable_options'])[11]");
    private final By Over60TextBox_xpath=By.xpath("(//input[@class='bbc_editable_options'])[12]");
    private final By Over90TextBox_xpath=By.xpath("(//input[@class='bbc_editable_options'])[13]");
    private final By Over120TextBox_xpath=By.xpath("(//input[@class='bbc_editable_options'])[14]");
    private final By RetentionTextBox_xpath=By.xpath("(//input[@class='bbc_editable_options'])[15]");
    private final By ARAdjustmentTextBox_xpath=By.xpath("(//input[@class='bbc_editable_options'])[16]");
    private final By InventoryAmountTextBox_xpath=By.xpath("(//input[@class='bbc_editable_options'])[26]");
    private final By IneligibleAmountTextBox_xpath=By.xpath("(//input[@class='bbc_editable_options'])[27]");
    private final By AvailableAmountTextBox_xpath=By.xpath("(//input[@class='bbc_editable_options'])[29]");
    private final By InventoryBorrowingBaseAmountTextBox_xpath=By.xpath("(//input[@class='bbc_editable_options'])[30]");
    private final By InventorySublimitTextBox_xpath=By.xpath("(//input[@class='bbc_editable_options'])[31]");
    private final By ARRelianceAmountTextBox_xpath=By.xpath("(//input[@class='bbc_editable_options'])[32]");
    private final By LoanPercentTextBox_xpath=By.xpath("(//input[@class='bbc_editable_options'])[33]");
    private final By InventoryReserveTextBox_xpath=By.xpath("(//input[@class='bbc_editable_options'])[35]");
    
    private final By OtherAmountTextBox_xpath=By.xpath("(//input[@class='bbc_editable_options'])[39]");
    private final By AssetAvailableForAdvanceTextBox_xpath=By.xpath("(//input[@class='bbc_editable_options'])[42]");
    private final By OtherSublimitTextBox_xpath=By.xpath("(//input[@class='bbc_editable_options'])[43]");
    private final By OtherReserveTextBox_xpath=By.xpath("(//input[@class='bbc_editable_options'])[45]");
    private final By CommitmentTextBox_xpath=By.xpath("(//input[@class='bbc_editable_options'])[50]");
    private final By LineLimitWithReserveTextBox_xpath=By.xpath("(//input[@class='bbc_editable_options'])[51]");
    private final By FutureTextBoxPay_xpath=By.xpath("(//input[@class='bbc_editable_options'])[56]");
    private final By CurrentTextBoxPay_xpath=By.xpath("(//input[@class='bbc_editable_options'])[57]");
    private final By Over30TextBoxPay_xpath=By.xpath("(//input[@class='bbc_editable_options'])[58]");
    private final By Over60TextBoxPay_xpath=By.xpath("(//input[@class='bbc_editable_options'])[59]");
    private final By Over90TextBoxPay_xpath=By.xpath("(//input[@class='bbc_editable_options'])[60]");
    private final By Over120TextBoxPay_xpath=By.xpath("(//input[@class='bbc_editable_options'])[61]");
    private final By RetentionTextBoxPay_xpath=By.xpath("(//input[@class='bbc_editable_options'])[62]");
    
    private final By IneligibleAmount_xpath=By.xpath("(//input[@class='bbc_editable_options'])[18]");
    private final By ARavailable_xpath=By.xpath("(//input[@class='bbc_editable_options'])[20]");
    private final By CancelOnBBCAvailability_xpath=By.id("amend_bbc_btn_cancel");
    private final By SaveOnBBCAvailability_xpath=By.xpath("//div[contains(text(),'Save')]");
    private final By AcceptSavePopupOnBBCAavilabityHistoryForAmendBBC_xpath=By.xpath("//div[contains(text(),'Ok')]");
    private final By SucessMessageSaveBBCAavilabityHistoryForAmendBBC_xpath=By.xpath("//Strong[@class='extend_message']");
    private final By scrollUpCheck_xpath=By.xpath("(//td[contains(text(),'Retention')])[1]");
    private final By BBCAvailability_xpath=By.xpath("//span[text()=' BBC Availability ']");
  
  

    private final By fundedAmountValue_xpath=By.xpath("//div[@class='reportsPannel']/table/tbody/tr[88]/td[8]/span");
    private final By netBorrowingBaseAvailable_xpath=By.xpath("//td[contains(text(),'NET BORROWING BASE AVAILABLE')]");
    private final By netBorrowingBaseAvailableValue_xpath=By.xpath("//div[@class='reportsPannel']/table/tbody/tr[89]/td[8]/span");
    private final By BBCPrintButton_xpath=By.xpath("//a[contains(text(),'BBC Print')]");
    
    private final By  totalAgedReceivablesReport_xpath=By.xpath("//td[contains(text(),'Total Aged Receivables')]");
    private final By  totalAgedReceivablesValuesReport_xpath=By.xpath("//div[@class='reportsPannel']/table/tbody/tr[19]/td[8]");
    private final By  netARAvailableForAdvance_xpath=By.xpath("//td[contains(text(),'Net AR Available for Advance')]");
    private final By  netARAvailableForAdvanceValue_xpath=By.xpath("//div[@class='reportsPannel']/table/tbody/tr[31]/td[8]");
    
    private final By  netInventoryAvailableForAdvanceReport_xpath=By.xpath("//td[contains(text(),'Net Inventory Available for Advance')]");
    private final By  netInventoryAvailableForAdvanceValueReport_xpath=By.xpath("//div[@class='reportsPannel']/table/tbody/tr[41]/td[8]");
    private final By  netOtherAvailableForAdvanceReport_xpath=By.xpath("//td[contains(text(),'Net Other Available for Advance')]");
    private final By  netOtherAvailableForAdvanceValueReport_xpath=By.xpath("//div[@class='reportsPannel']/table/tbody/tr[55]/td[8]");
    
    private final By  borrorwingBaseAvailabilityReport_xpath=By.xpath("//td[contains(text(),'BORROWING BASE AVAILABILITY')]");
    private final By  borrorwingBaseAvailabilityValueReport_xpath=By.xpath("//div[@class='reportsPannel']/table/tbody/tr[73]/td[8]");
    private final By fundedAmountReport_xpath=By.xpath("//td[contains(text(),'Funded Amount')]");
    private final By fundedAmountValueReport_xpath=By.xpath("//div[@class='reportsPannel']/table/tbody/tr[75]/td[8]");
    private final By netBorrowingBaseAvailableReport_xpath=By.xpath("//td[contains(text(),'NET BORROWING BASE AVAILABLE')]");
    private final By netBorrowingBaseAvailableValueReport_xpath=By.xpath("//div[@class='reportsPannel']/table/tbody/tr[76]/td[8]");
    private final By inventoryBorrowingBase_xpath=By.xpath("//td[contains(text(),'INVENTORY BORROWING BASE')]");
    
    
    private final By  totalAgedReceivablesValuesReportM_xpath=By.xpath("//div[@class='reportsPannel']/table/tbody/tr[20]/td[8]");
    private final By  netARAvailableForAdvanceValueM_xpath=By.xpath("//div[@class='reportsPannel']/table/tbody/tr[32]/td[8]");
    
    private final By  netInventoryAvailableForAdvanceValueReportM_xpath=By.xpath("//div[@class='reportsPannel']/table/tbody/tr[42]/td[8]");
    private final By  netOtherAvailableForAdvanceValueReportM_xpath=By.xpath("//div[@class='reportsPannel']/table/tbody/tr[56]/td[8]");
    
    private final By  borrorwingBaseAvailabilityValueReportM_xpath=By.xpath("//div[@class='reportsPannel']/table/tbody/tr[74]/td[8]");
    private final By fundedAmountValueReportM_xpath=By.xpath("//div[@class='reportsPannel']/table/tbody/tr[76]/td[8]");
    private final By netBorrowingBaseAvailableValueReportM_xpath=By.xpath("//div[@class='reportsPannel']/table/tbody/tr[77]/td[8]");
    
    
    //ineligible cust
    private final By reason_xpath=By.xpath("//td[contains(text(),'Ineligible Customer')]");
	private final By amnt_xpath=By.xpath("(//td[text()=' 6,250.00 '])[2]");
	private final By amnt1_xpath=By.xpath("(//td[text()=' 0.00 '])[25]");
	private final By amnt2_xpath=By.xpath("(//td[text()=' 0.00 '])[27]");
	//private final By bbcAvailability_xpath=By.xpath("(//a[text()='BBC Availability'])[3]");
	
	private final By TotalAgedReceivablesForMulDiv_xpath=By.xpath("//tbody//tr[21]//td[8]//span[1]");
	private final By ArborrowingBaseAvailabilityForMulDiv_xpath=By.xpath("//tbody//tr[29]//td[8]//span[1]");
	private final By netBorrowingBaseForMulDiv_xpath=By.xpath("//span[contains(text(),'6,784,572.95')]");
	private final By ScrollToViewForFundedAmount_xpath=By.xpath("//td[contains(text(),'Funded Amount')]");
	
	private final By inventoryborrowingBaseForMulDiv=By.xpath("//tbody//tr[42]//td[1]");
    private final By  totalAgedReceivablesValuesReportForMulDiv_xpath=By.xpath("//tbody//tr[20]//td[8]");
    private final By  netInventoryAvailableForAdvanceValueReportForMulDiv_xpath=By.xpath("//td[contains(text(),'(6,394.50)')]");
    private final By  netOtherAvailableForAdvanceValueReportForMulDIv_xpath=By.xpath("//td[contains(text(),'29,500.00')]");
    private final By  borrorwingBaseAvailabilityValueReportForMulDiv_xpath=By.xpath("//tbody//tr[115]//td[8]");
    private final By fundedAmountValueReportForMulDiv_xpath=By.xpath("(//td[contains(text(),'8,000.00')])[3]");
    private final By netBorrowingBaseAvailableValueReportForMulDiv_xpath=By.xpath("//td[contains(text(),'6,784,572.95')]");

	
	//retention reason
	private final By retention_xpath=By.xpath("(//td[contains(text(),'Retention')])[2]");
	private final By retentionamnt_xpath=By.xpath("(//td[contains(text(),' 1,500.00 ')])[3]");
	private final By retentionamnt1_xpath=By.xpath("(//td[text()=' 22,000.00 '])[4]");
	private final By retentionamnt2_xpath=By.xpath("(//td[text()=' 50.00 '])[5]");
	private final By retentionamnt3_xpath=By.xpath("(//td[text()=' 0.00 '])[10]");
	// private final By netBorrowingBaseAvailableskValue_xpath=By.xpath("//div[@class='reportsPannel']/table/tbody/tr[53]/td[3]");
///excluded reason
	 private final By netBorrowingBaseAvailableskValue_xpath=By.xpath("//div[@class='reportsPannel']/table/tbody/tr[53]/td[3]");

	///excluded reason

	private final By excludedreason_xpath=By.xpath("(//td[contains(text(),'Excluded')])[1]");  
    private final By excludeamnt_xpath=By.xpath("(//td[contains(text(),' 3,000.00')])[2]");
    private final By excludeamnt1_xpath=By.xpath("(//td[contains(text(),' 3,500.00 ')])[2]");
    private final By excludeamnt2_xpath=By.xpath("(//td[contains(text(),' 2,500.00')])[3]");
    private final By excludeamnt3_xpath=By.xpath("(//td[text()=' 15,900.00 '])[2]");
    private final By excludeamnt7_xpath=By.xpath("(//td[text()=' 3,000.00 '])[1]");

    private final By agedpastdeu_xpath=By.xpath("//td[contains(text(),'Aged: Past Due Days')]");
    private final By agedpastamnt_xpath=By.xpath("(//td[text()=' 66,000.00 '])[1]");
	//anusha
	private final By AgedCreditItem_xpath=By.xpath("(//td[contains(text(),'300.00')])[3]");
    private final By CrossAgedPercentage_xpath=By.xpath("(//td[contains(text(),'75,800.00')])[1]");
    private final By ConcentrationPercentage_xpath=By.xpath("(//td[contains(text(),'67,540.00')])[1]");
    private final By PastDueDays_xpath=By.xpath("(//td[contains(text(),' 71,950.00')])[1]");
    private final By IneligibleCustomer_xpath=By.xpath("(//td[contains(text(),'9,000.00')])[1]");
    private final By secondPlus_xpath=By.xpath("(//i[@class='icon-plus'])[2]");
    private final By ConcentrationPercentageAgedcreditLimit_xpath=By.xpath("(//td[contains(text(),'67,570')])[1]");
    private final By ConcentrationPercentageAgedCreditLimitExclude_xpath=By.xpath("(//td[contains(text(),' 84,500.00')])[1]");
    private final By ConcentrationPercentageIneligibleCustomer_xpath=By.xpath("(//td[contains(text(),'68,470.00')])[1]");
    private final By ConcentrationPercentageCrossAgedPercentageExclude_xpath=By.xpath("(//td[contains(text(),'76,050.00')])[1]");
    private final By ConcentrationPercentageTotalReceivablesCap_xpath=By.xpath("(//td[contains(text(),'60,345.00')])[1]");
    private final By ConcentrationPercentageAgedcreditLimitEligibleBalance_xpath=By.xpath("(//td[contains(text(),'67,540.00')])[1]");
    private final By excludeamnt4_xpath=By.xpath("(//td[text()=' 16,500.00 '])[2]");
    private final By excludeamnt5_xpath=By.xpath("(//td[text()=' 5,000.00 '])[2]");
    private final By excludeamnt6_xpath=By.xpath("(//td[text()=' (6,600.00) '])[1]");
    
    private final By TotalAgedReceivablesForSummaryYesMulDiv_xpath=By.xpath("//tr[21]//td[8]//span[1]");
    private final By ArborrowingBaseAvailabilityForSummaryYesMulDiv_xpath=By.xpath("//tr[118]//td[8]//span[1]");
    private final By netBorrowingBaseForSummaryYesMulDiv_xpath=By.xpath("//span[contains(text(),'784,000.00')]");
    private final By totalAgedReceivablesValuesReportMForSummaryYesMulDiv_xpath=By.xpath("//tr[11]//td[8]");
    private final By netARAvailableForAdvanceValueMForSummaryYesMulDiv_xpath=By.xpath("//td[contains(text(),'137,110.00')]");
    private final By netInventoryAvailableForAdvanceValueReportMForSummaryYesMulDiv_xpath=By.xpath("//td[contains(text(),'6,150,001.55')]");
    private final By netOtherAvailableForAdvanceValueReportMForSummaryYesMulDiv_xpath=By.xpath("//td[contains(text(),'29,500.00')]"); 
    private final By borrorwingBaseAvailabilityValueReportMForSummaryYesMulDiv_xpath=By.xpath("//tr[115]//td[8]");
    private final By fundRequestedValueReportMForSummaryYesMulDiv_xpath=By.xpath("//td[contains(text(),'16,000.00')]");
    private final By netBorrowingBaseAvailableValueReportMForSummaryYesMulDiv_xpath=By.xpath("//td[contains(text(),'784,000.00')]");
    private final By fundedAmountValue1_xpath=By.xpath("//td[contains(text(),'Funded Amount')]");
    
//cyncs_4462
    private final By agedpastdueamnt_xpath=By.xpath("(//td[text()=' 126,750.00 '])[2]");
    private final By agedpastdueamnt1_xpath=By.xpath("(//td[text()=' 126,750.00 '])[1]");
    private final By concentration_xpath=By.xpath("//td[contains(text(),'Concentration %')]");
    private final By concentrationamnt_xpath=By.xpath("(//td[text()=' 200.00 '])[1]");
    private final By totalelig_xpath=By.xpath("//tr[@id='parent_inel_0']//td[1]");
    private final By totalamnt_xpath=By.xpath("(//td[text()=' 126,950.00 '])[1]");  
    private final By agedpastdueamnt3_xpath=By.xpath("(//td[text()=' 0.00 '])[9]");
    private final By concentrationamnt1_xpath=By.xpath("(//td[text()=' 8,000.00 '])[2]");
    private final By totalamnt1_xpath=By.xpath("(//td[text()=' 8,000.00 '])[1]");
    private final By inv_plus_xpath=By.xpath("//tr[@id='parent_inv_ineligible10']//td[1]");
    private final By inve_undefined_xpath=By.xpath("//td[contains(text(),'Undefined')]");
    private final By invamnt_xpath=By.xpath("(//td[text()=' 1,418.00 '])[2]");
    private final By invamnt1_xpath=By.xpath("(//td[text()=' 1,418.00 '])[1]");
    private final By crosaged_xpath=By.xpath("//td[contains(text(),'Cross Aged %')]");
    private final By crossaged_amnt_xpath=By.xpath("(//td[text()=' 300.00 '])[1]");
    private final By totalamnt2_xpath=By.xpath("(//td[text()=' 1,718.00 '])[1]");
    
    
 
	 public BBCAvailabilityHistoryPage(WebDriver driver) {


		 super(driver);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	 public boolean clickOn_plusofinventory()
		{
		try{
			WebElement editWebEelement=new WebDriverWait(driver,5)
				.until(ExpectedConditions.visibilityOfElementLocated(inv_plus_xpath));
			editWebEelement.click();
			return true;
		}
		catch(Exception ex){
			return false;	
		}
		}
	 public boolean verifyAssetinventoryAmount_cyncs4462_2(String expected1) {
	    	try {
	    		WebElement assetinventoryWebElement = new WebDriverWait(
	    				driver, 100)
	    				.until(ExpectedConditions
	    						.visibilityOfElementLocated(crosaged_xpath));
	    		WebElement AssetinventoryAmountWebElement = new WebDriverWait(
	    				driver, 100)
	    				.until(ExpectedConditions
	    						.visibilityOfElementLocated(crossaged_amnt_xpath));

	    		assetinventoryWebElement.isDisplayed();
	    		String actual = AssetinventoryAmountWebElement.getText();
	    		if (actual.equals(expected1))
	    			return true;
	    		else
	    			return false;

	    	} catch (Exception e) {
	    		return false;
	    	}
	    }
	 public boolean verifyAssetinventoryAmount_cyncs4462_total(String expected1) {
	    	try {
	    		WebElement assetinventoryWebElement = new WebDriverWait(
	    				driver, 100)
	    				.until(ExpectedConditions
	    						.visibilityOfElementLocated(inv_plus_xpath));
	    		WebElement AssetinventoryAmountWebElement = new WebDriverWait(
	    				driver, 100)
	    				.until(ExpectedConditions
	    						.visibilityOfElementLocated(totalamnt2_xpath));

	    		assetinventoryWebElement.isDisplayed();
	    		String actual = AssetinventoryAmountWebElement.getText();
	    		if (actual.equals(expected1))
	    			return true;
	    		else
	    			return false;

	    	} catch (Exception e) {
	    		return false;
	    	}
	    }
	 public boolean verifyAssetinventoryAmount_cyncs4462_1(String expected) {
	    	try {
	    		WebElement assetinventoryWebElement = new WebDriverWait(
	    				driver, 100)
	    				.until(ExpectedConditions
	    						.visibilityOfElementLocated(inve_undefined_xpath));
	    		WebElement AssetinventoryAmountWebElement = new WebDriverWait(
	    				driver, 100)
	    				.until(ExpectedConditions
	    						.visibilityOfElementLocated(invamnt1_xpath));

	    		assetinventoryWebElement.isDisplayed();
	    		String actual = AssetinventoryAmountWebElement.getText();
	    		if (actual.equals(expected))
	    			return true;
	    		else
	    			return false;

	    	} catch (Exception e) {
	    		return false;
	    	}
	    }
	    public boolean verifyAssetinventoryAmount_cyncs4462(String expected) {
	    	try {
	    		WebElement assetinventoryWebElement = new WebDriverWait(
	    				driver, 100)
	    				.until(ExpectedConditions
	    						.visibilityOfElementLocated(inve_undefined_xpath));
	    		WebElement AssetinventoryAmountWebElement = new WebDriverWait(
	    				driver, 100)
	    				.until(ExpectedConditions
	    						.visibilityOfElementLocated(invamnt_xpath));

	    		assetinventoryWebElement.isDisplayed();
	    		String actual = AssetinventoryAmountWebElement.getText();
	    		if (actual.equals(expected))
	    			return true;
	    		else
	    			return false;

	    	} catch (Exception e) {
	    		return false;
	    	}
	    }
	 //ineligible cust
	 public  boolean verifyIneligibleexcludedreasonbbcavailabilityhistoryScreenapprove(String ReasonData){
	    	try{
	    	WebElement verifyIneligibilityReasonWebE=new WebDriverWait(driver,20)
	    	.until(ExpectedConditions.visibilityOfElementLocated(excludedreason_xpath));
	    	Thread.sleep(100);

	    	String ActualReason = verifyIneligibilityReasonWebE.getText().trim();
	    	if(ActualReason.equalsIgnoreCase(ReasonData))
	    	{
	    		System.out.println(ReasonData);
	    		return true;
	    		}
	    else {
	    	return false;
	    }
	    	}	
	    	catch (Exception ex) 
	    	{
	    			
	    		return false;
	    	}
	    		
	    		
	    	}

	    public  boolean verifyIneligibileExcludedamntbbcavailabilitycreenunapprovbbc9(String ReasonAmount){
			try{
			WebElement verifyIneligibilityAmountWebE=new WebDriverWait(driver,20)
			.until(ExpectedConditions.visibilityOfElementLocated(excludeamnt7_xpath));
			Thread.sleep(100);
			String ActualAmount = verifyIneligibilityAmountWebE.getText();
			if(ActualAmount.equalsIgnoreCase(ReasonAmount))
			{
				System.out.println(ReasonAmount);
				return true;
				}
		else {
			return false;
		}
		}	
			catch (Exception ex) 
			{
					
				return false;
			}
				
				
			} 
	    public  boolean verifyIneligibleAgedpastduereasonbbcavailabilityScreenunapprovebbc(String ReasonData1){
	    	try{
	    	WebElement verifyIneligibilityReasonWebE=new WebDriverWait(driver,20)
	    	.until(ExpectedConditions.visibilityOfElementLocated(agedpastdeu_xpath));
	    	Thread.sleep(100);
	    	String ActualReason = verifyIneligibilityReasonWebE.getText().trim();
	    	if(ActualReason.equalsIgnoreCase(ReasonData1))
	    	{
	    		System.out.println(ReasonData1);
	    		return true;
	    		}
	    else {
	    	return false;
	    }
	    	}	
	    	catch (Exception ex) 
	    	{
	    			
	    		return false;
	    	}
	    		
	    		
	    	}
	    public  boolean verifyIneligibileAgedpastduemntbbcavailabilitycreenunapprovbbc9(String ReasonAmount){
			try{
			WebElement verifyIneligibilityAmountWebE=new WebDriverWait(driver,20)
			.until(ExpectedConditions.visibilityOfElementLocated(agedpastamnt_xpath));
			Thread.sleep(100);
			String ActualAmount = verifyIneligibilityAmountWebE.getText();
			if(ActualAmount.equalsIgnoreCase(ReasonAmount))
			{
				System.out.println(ReasonAmount);
				return true;
				}
		else {
			return false;
		}
		}	
			catch (Exception ex) 
			{
					
				return false;
			}
				
				
			} 
	 public  boolean verifyIneligibileexcludedamntbbcavailabilitycreenapprovbbc1(String ReasonAmount){
			try{
			WebElement verifyIneligibilityAmountWebE=new WebDriverWait(driver,20)
			.until(ExpectedConditions.visibilityOfElementLocated(excludeamnt2_xpath));
			Thread.sleep(100);
			String ActualAmount = verifyIneligibilityAmountWebE.getText();
			if(ActualAmount.equalsIgnoreCase(ReasonAmount))
			{
				System.out.println(ReasonAmount);
				return true;
				}
		else {
			return false;
		}
		}	
			catch (Exception ex) 
			{
					
				return false;
			}
				
				
			} 

	 public  boolean verifyIneligibileexcludedamntbbcavailabilitycreenapprovbbc5(String ReasonAmount){
			try{
			WebElement verifyIneligibilityAmountWebE=new WebDriverWait(driver,20)
			.until(ExpectedConditions.visibilityOfElementLocated(excludeamnt6_xpath));
			Thread.sleep(100);
			String ActualAmount = verifyIneligibilityAmountWebE.getText();
			if(ActualAmount.equalsIgnoreCase(ReasonAmount))
			{
				System.out.println(ReasonAmount);
				return true;
				}
		else {
			return false;
		}
		}	
			catch (Exception ex) 
			{
					
				return false;
			}
				
				
			}
	 public  boolean verifyIneligibileexcludedamntbbcavailabilitycreenapprovbbc4(String ReasonAmount){
			try{
			WebElement verifyIneligibilityAmountWebE=new WebDriverWait(driver,20)
			.until(ExpectedConditions.visibilityOfElementLocated(excludeamnt5_xpath));
			Thread.sleep(100);
			String ActualAmount = verifyIneligibilityAmountWebE.getText();
			if(ActualAmount.equalsIgnoreCase(ReasonAmount))
			{
				System.out.println(ReasonAmount);
				return true;
				}
		else {
			return false;
		}
		}	
			catch (Exception ex) 
			{
					
				return false;
			}
				
				
			}
	 public  boolean verifyIneligibileexcludedamntbbcavailabilitycreenapprovbbc3(String ReasonAmount){
			try{
			WebElement verifyIneligibilityAmountWebE=new WebDriverWait(driver,20)
			.until(ExpectedConditions.visibilityOfElementLocated(excludeamnt4_xpath));
			Thread.sleep(100);
			String ActualAmount = verifyIneligibilityAmountWebE.getText();
			if(ActualAmount.equalsIgnoreCase(ReasonAmount))
			{
				System.out.println(ReasonAmount);
				return true;
				}
		else {
			return false;
		}
		}	
			catch (Exception ex) 
			{
					
				return false;
			}
				
				
			} 

	 public  boolean verifyIneligibileexcludedamntbbcavailabilitycreenapprovbbc2(String ReasonAmount){
			try{
			WebElement verifyIneligibilityAmountWebE=new WebDriverWait(driver,20)
			.until(ExpectedConditions.visibilityOfElementLocated(excludeamnt3_xpath));
			Thread.sleep(100);
			String ActualAmount = verifyIneligibilityAmountWebE.getText();
			if(ActualAmount.equalsIgnoreCase(ReasonAmount))
			{
				System.out.println(ReasonAmount);
				return true;
				}
		else {
			return false;
		}
		}	
			catch (Exception ex) 
			{
					
				return false;
			}
				
				
			} 
	 public  boolean verifyIneligibileexcludedamntbbcavailabilitycreenunapprovbbc1(String ReasonAmount){
			try{
			WebElement verifyIneligibilityAmountWebE=new WebDriverWait(driver,20)
			.until(ExpectedConditions.visibilityOfElementLocated(excludeamnt1_xpath));
			Thread.sleep(100);
			String ActualAmount = verifyIneligibilityAmountWebE.getText();
			if(ActualAmount.equalsIgnoreCase(ReasonAmount))
			{
				System.out.println(ReasonAmount);
				return true;
				}
		else {
			return false;
		}
		}	
			catch (Exception ex) 
			{
					
				return false;
			}
				
				
			} 
	 public  boolean verifyIneligibileexcludedamntbbcavailabilitycreenunapprovbbc(String ReasonAmount){
			try{
			WebElement verifyIneligibilityAmountWebE=new WebDriverWait(driver,20)
			.until(ExpectedConditions.visibilityOfElementLocated(excludeamnt_xpath));
			Thread.sleep(100);
			String ActualAmount = verifyIneligibilityAmountWebE.getText();
			if(ActualAmount.equalsIgnoreCase(ReasonAmount))
			{
				System.out.println(ReasonAmount);
				return true;
				}
		else {
			return false;
		}
		}	
			catch (Exception ex) 
			{
					
				return false;
			}
				
				
			} 

	 public  boolean verifyIneligibleretentionreasonbbcavailabilityhistoryScreenapprove(String ReasonData){
	    	try{
	    	WebElement verifyIneligibilityReasonWebE=new WebDriverWait(driver,20)
	    	.until(ExpectedConditions.visibilityOfElementLocated(retention_xpath));
	    	//Thread.sleep(100);
	    	String ActualReason = verifyIneligibilityReasonWebE.getText().trim();
	    	if(ActualReason.equalsIgnoreCase(ReasonData))
	    	{
	    		System.out.println(ReasonData);
	    		return true;
	    		}
	    else {
	    	return false;
	    }
	    	}	
	    	catch (Exception ex) 
	    	{
	    			
	    		return false;
	    	}
	    		
	    		
	    	}	 
	
	 	 public  boolean verifyIneligibileretentionamntbbcavailabilitycreenunapprovbbc3(String ReasonAmount){

			try{
			WebElement verifyIneligibilityAmountWebE=new WebDriverWait(driver,20)
			.until(ExpectedConditions.visibilityOfElementLocated(retentionamnt3_xpath));
			//Thread.sleep(100);
			String ActualAmount = verifyIneligibilityAmountWebE.getText();
			if(ActualAmount.equalsIgnoreCase(ReasonAmount))
			{
				System.out.println(ReasonAmount);
				return true;
				}
		else {
			return false;
		}
		}	
			catch (Exception ex) 
			{
					
				return false;
			}
				
				
			} 
	 public  boolean verifyIneligibileretentionamntbbcavailabilityhistorycreenapprove2(String ReasonAmount){
			try{
			WebElement verifyIneligibilityAmountWebE=new WebDriverWait(driver,20)
			.until(ExpectedConditions.visibilityOfElementLocated(retentionamnt2_xpath));
			//Thread.sleep(100);
			String ActualAmount = verifyIneligibilityAmountWebE.getText();
			if(ActualAmount.equalsIgnoreCase(ReasonAmount))
			{
				System.out.println(ReasonAmount);
				return true;
				}
		else {
			return false;
		}
		}	
			catch (Exception ex) 
			{
					
				return false;
			}
				
				
			}
	 public  boolean verifyIneligibileretentionamntbbcavailabilityhistorycreenapprove(String ReasonAmount){
		try{
		WebElement verifyIneligibilityAmountWebE=new WebDriverWait(driver,20)
		.until(ExpectedConditions.visibilityOfElementLocated(retentionamnt_xpath));
		//Thread.sleep(100);
		String ActualAmount = verifyIneligibilityAmountWebE.getText();
		if(ActualAmount.equalsIgnoreCase(ReasonAmount))
		{
			System.out.println(ReasonAmount);
			return true;
			}
	else {
		return false;
	}
	}	
		catch (Exception ex) 
		{
				
			return false;
		}
			
			
		}
	 public  boolean verifyIneligibileretentionamntbbcavailabilityhistorycreenapprove1(String ReasonAmount){
			try{
			WebElement verifyIneligibilityAmountWebE=new WebDriverWait(driver,20)
			.until(ExpectedConditions.visibilityOfElementLocated(retentionamnt1_xpath));
			//Thread.sleep(100);
			String ActualAmount = verifyIneligibilityAmountWebE.getText();
			if(ActualAmount.equalsIgnoreCase(ReasonAmount))
			{
				System.out.println(ReasonAmount);
				return true;
				}
		else {
			return false;
		}
		}	
			catch (Exception ex) 
			{
					
				return false;
			}
				
				
			}
	 public  boolean verifyIneligibilityreasonbbcavailabilityhistoryScreen1(String ReasonData){
	    	try{
	    	WebElement verifyIneligibilityReasonWebE=new WebDriverWait(driver,20)
	    	.until(ExpectedConditions.visibilityOfElementLocated(reason_xpath));
	    	//Thread.sleep(100);
	    	String ActualReason = verifyIneligibilityReasonWebE.getText().trim();
	    	if(ActualReason.equalsIgnoreCase(ReasonData))
	    	{
	    		System.out.println(ReasonData);
	    		return true;
	    		}
	    else {
	    	return false;
	    }
	    	}	
	    	catch (Exception ex) 
	    	{
	    			
	    		return false;
	    	}
	    		
	    		
	    	}
	 public  boolean verifyIneligibilityamntbbcavailabilityhistorycreenapp1(String ReasonAmount){
		try{
		WebElement verifyIneligibilityAmountWebE=new WebDriverWait(driver,20)
		.until(ExpectedConditions.visibilityOfElementLocated(amnt2_xpath));
		//Thread.sleep(100);
		String ActualAmount = verifyIneligibilityAmountWebE.getText();
		if(ActualAmount.equalsIgnoreCase(ReasonAmount))
		{
			System.out.println(ReasonAmount);
			return true;
			}
	else {
		return false;
	}
	}	
		catch (Exception ex) 
		{
				
			return false;
		} 
			
			
		}

	 public  boolean verifyIneligibilityreasonbbcavailabilityhistoryScreen(String ReasonData){
	    	try{
	    	WebElement verifyIneligibilityReasonWebE=new WebDriverWait(driver,20)
	    	.until(ExpectedConditions.visibilityOfElementLocated(reason_xpath));
	    	//Thread.sleep(100);
	    	String ActualReason = verifyIneligibilityReasonWebE.getText().trim();
	    	if(ActualReason.equalsIgnoreCase(ReasonData))
	    	{
	    		System.out.println(ReasonData);
	    		return true;
	    		}
	    else {
	    	return false;
	    }
	    	}	
	    	catch (Exception ex) 
	    	{
	    			
	    		return false;
	    	}
	    		
	    		
	    	}
	 public  boolean verifyIneligibilityamntbbcavailabilityhistorycreenapp(String ReasonAmount){
 		try{
 		WebElement verifyIneligibilityAmountWebE=new WebDriverWait(driver,20)
 		.until(ExpectedConditions.visibilityOfElementLocated(amnt1_xpath));
 		//Thread.sleep(100);
 		String ActualAmount = verifyIneligibilityAmountWebE.getText();
 		if(ActualAmount.equalsIgnoreCase(ReasonAmount))
 		{
 			System.out.println(ReasonAmount);
 			return true;
 			}
 	else {
 		return false;
 	}
 	}	
 		catch (Exception ex) 
 		{
 				
 			return false;
 		}
 			
 			
 		}

	    	public  boolean verifyIneligibilityamntbbcavailabilityhistorycreen(String ReasonAmount){
	    		try{
	    		WebElement verifyIneligibilityAmountWebE=new WebDriverWait(driver,20)
	    		.until(ExpectedConditions.visibilityOfElementLocated(amnt_xpath));
	    		//Thread.sleep(100);
	    		String ActualAmount = verifyIneligibilityAmountWebE.getText();
	    		if(ActualAmount.equalsIgnoreCase(ReasonAmount))
	    		{
	    			System.out.println(ReasonAmount);
	    			return true;
	    			}
	    	else {
	    		return false;
	    	}
	    	}	
	    		catch (Exception ex) 
	    		{
	    				
	    			return false;
	    		}
	    			
	    			
	    		}
	 public boolean  verifyTotalAgedReceivables(String totalAgedReceivables){
	    	try {
	    		WebElement displayWebElement = new WebDriverWait(driver, 100).until(ExpectedConditions.visibilityOfElementLocated(totalAgedReceivables_xpath));
	    		WebElement AmountWebElement = new WebDriverWait(driver, 100).until(ExpectedConditions.visibilityOfElementLocated(totalAgedReceivablesValue_xpath));
	    		displayWebElement.isDisplayed();
	    		String actual = AmountWebElement.getText().trim();
	    		if (actual.equals(totalAgedReceivables))
	    			return true;
	    		else
	    			return false;

	    	} catch (Exception e) {

	    		return false;
	    	}
	    	
	    	}
	    
	 public boolean  verifyARBorrowingBase(String  ARBorrowingBase){
	    	try {
	    		WebElement displayWebElement = new WebDriverWait(driver, 100).until(ExpectedConditions.visibilityOfElementLocated(arBorrowingBase_xpath));
	    		WebElement AmountWebElement = new WebDriverWait(driver, 100).until(ExpectedConditions.visibilityOfElementLocated(arBorrowingBaseValue_xpath));
	    		displayWebElement.isDisplayed();
	    		String actual = AmountWebElement.getText().trim();
	    		if (actual.equals(ARBorrowingBase))
	    			return true;
	    		else
	    			return false;

	    	} catch (Exception e) {
	    		return false;
	    	}
	    	
	    }
	 
	 public boolean  verifyFundedAmount(String  fundedAmount){
	    	try {
	    		WebElement displayWebElement = new WebDriverWait(driver, 100).until(ExpectedConditions.visibilityOfElementLocated(fundedAmount_xpath));
	    		WebElement AmountWebElement = new WebDriverWait(driver, 100).until(ExpectedConditions.visibilityOfElementLocated(fundedAmountValue_xpath));
	    		displayWebElement.isDisplayed();
	    		String actual = AmountWebElement.getText().trim();
	    		if (actual.equals(fundedAmount))
	    			return true;
	    		else
	    			return false;

	    	} catch (Exception e) {
	    		return false;
	    	}
	    	
	    }
	 
	 public boolean  verifyNetBorrowingBaseAvailable(String  netBorrowingBaseAvailable){
	    	try {
	    		WebElement displayWebElement = new WebDriverWait(driver, 100).until(ExpectedConditions.visibilityOfElementLocated(netBorrowingBaseAvailable_xpath));
	    		WebElement AmountWebElement = new WebDriverWait(driver, 100).until(ExpectedConditions.visibilityOfElementLocated(netBorrowingBaseAvailableValue_xpath));
	    		displayWebElement.isDisplayed();
	    		String actual = AmountWebElement.getText().trim();
	    		if (actual.equals(netBorrowingBaseAvailable))
	    			return true;
	    		else
	    			return false;

	    	} catch (Exception e) {
	    		return false;
	    	}
	    	
	    }
	 
	 public boolean scrollToViewElement()
		{
			try{
				 WebElement actual1=new WebDriverWait(driver,10)
	    		 .until(ExpectedConditions.visibilityOfElementLocated(fundedAmountValue_xpath));
	    		JavascriptExecutor jse1 = (JavascriptExecutor)driver;;
	    		jse1.executeScript("arguments[0].scrollIntoView(true);", actual1);  		

		        //Thread.sleep(3000);

		        return true;
				
			}
			catch(Exception e){
				
			}
			return false;
			
			}


	// >>>>>>>>>>>>>>>>>>>>>>>>>
	 
	 public boolean ButtonOnBBCAavilabityHistorysreen()
	 {
	 try{
	 	WebElement AmendBBCWebElement=new WebDriverWait(driver,10)
	 	.until(ExpectedConditions.visibilityOfElementLocated(AmendBBC_xpath));
	 	AmendBBCWebElement.isDisplayed();
	 	WebElement BBCPrintWebElement=new WebDriverWait(driver,10)
	 	.until(ExpectedConditions.visibilityOfElementLocated(BBCPrint_xpath));
	 	BBCPrintWebElement.isDisplayed();
	 	return true;
	 }
	 catch(Exception ex){
	 	return false;
	 }

	 }

	 public boolean ButtonOnBBCAavilabityEditModeHistorysreen()
	 {
	 try{
	 	WebElement AmendBBCWebElement=new WebDriverWait(driver,10)
	 	.until(ExpectedConditions.visibilityOfElementLocated(AmendBBC_xpath));
	 	AmendBBCWebElement.click();
	 	WebElement SaveOnBBCAvailablityWebElement=new WebDriverWait(driver,10)
	 	.until(ExpectedConditions.visibilityOfElementLocated(SaveOnBBCAvailablity_xpath));
	 	SaveOnBBCAvailablityWebElement.isDisplayed();
	 	WebElement CancelOnBBCAvailablityWebElement=new WebDriverWait(driver,10)
	 	.until(ExpectedConditions.visibilityOfElementLocated(CancelOnBBCAvailablity_xpath));
	 	CancelOnBBCAvailablityWebElement.isDisplayed();
	 	return true;
	 }
	 catch(Exception ex){
	 	return false;
	 }

	 }

	 public boolean EditTextBoxOnBBCAavilabityHistoryForReceivables()
	 {
	 try{
	 	WebElement AmendBBCWebElement=new WebDriverWait(driver,10)
	 	.until(ExpectedConditions.visibilityOfElementLocated(AmendBBC_xpath));
	 	AmendBBCWebElement.click();
	 	
	 	WebElement periorBalanceEditTextBoxWebElement=new WebDriverWait(driver,10)
	 	.until(ExpectedConditions.visibilityOfElementLocated(periorBalanceEditTextBox_xpath));
	 	periorBalanceEditTextBoxWebElement.isDisplayed();
	 	
	 	WebElement NewSalesEditTextBoxWebElement=new WebDriverWait(driver,10)
	 	.until(ExpectedConditions.visibilityOfElementLocated(NewSalesEditTextBox_xpath));
	 	NewSalesEditTextBoxWebElement.isDisplayed();
	 	
	 	WebElement CancelOnBBCAvailablityWebElement=new WebDriverWait(driver,10)
	 	.until(ExpectedConditions.visibilityOfElementLocated(NewCreditsTextBox_xpath));
	 	CancelOnBBCAvailablityWebElement.isDisplayed();
	 	
	 	WebElement NewCashCollectedTextBoxWebElement=new WebDriverWait(driver,10)
	 	.until(ExpectedConditions.visibilityOfElementLocated(NewCashCollectedTextBox_xpath));
	 	NewCashCollectedTextBoxWebElement.isDisplayed();
	 	
	 	
	 	WebElement NewAdjustmentTextBoxWebElement=new WebDriverWait(driver,10)
	 	.until(ExpectedConditions.visibilityOfElementLocated(NewAdjustmentTextBox_xpath));
	 	NewAdjustmentTextBoxWebElement.isDisplayed();
	 	
	 	
	 	WebElement BBCAdjiustmentTextBoxWebElement=new WebDriverWait(driver,10)
	 	.until(ExpectedConditions.visibilityOfElementLocated(BBCAdjiustmentTextBox_xpath));
	 	BBCAdjiustmentTextBoxWebElement.isDisplayed();
	 	
	 	WebElement FutureTextBoxWebElement=new WebDriverWait(driver,10)
	 	.until(ExpectedConditions.visibilityOfElementLocated(FutureTextBox_xpath));
	 	FutureTextBoxWebElement.isDisplayed();
	 	
	 	WebElement CurrentTextBoxWebElement=new WebDriverWait(driver,10)
	 	.until(ExpectedConditions.visibilityOfElementLocated(CurrentTextBox_xpath));
	 	CurrentTextBoxWebElement.isDisplayed();
	 	
	 	WebElement Over30TextBoxWebElement=new WebDriverWait(driver,10)
	 	.until(ExpectedConditions.visibilityOfElementLocated(Over30TextBox_xpath));
	 	Over30TextBoxWebElement.isDisplayed();
	 	
	 	WebElement Over60TextBoxWebElement=new WebDriverWait(driver,10)
	 	.until(ExpectedConditions.visibilityOfElementLocated(Over60TextBox_xpath));
	 	Over60TextBoxWebElement.isDisplayed();
	 	
	 	WebElement Over90TextBoxWebElement=new WebDriverWait(driver,10)
	 	.until(ExpectedConditions.visibilityOfElementLocated(Over90TextBox_xpath));
	 	Over90TextBoxWebElement.isDisplayed();
	 	
	 	
	 	WebElement Over120TextBoxWebElement=new WebDriverWait(driver,10)
	 	.until(ExpectedConditions.visibilityOfElementLocated(Over120TextBox_xpath));
	 	Over120TextBoxWebElement.isDisplayed();
	 	
	 	WebElement RetentionTextBoxWebElement=new WebDriverWait(driver,10)
	 	.until(ExpectedConditions.visibilityOfElementLocated(RetentionTextBox_xpath));
	 	RetentionTextBoxWebElement.isDisplayed();
	 	
	 	WebElement ARAdjustmentTextBoxWebElement=new WebDriverWait(driver,10)
	 	.until(ExpectedConditions.visibilityOfElementLocated(ARAdjustmentTextBox_xpath));
	 	ARAdjustmentTextBoxWebElement.isDisplayed();
	 	
	 	return true;
	 }
	 catch(Exception ex){
	 	return false;
	 }
}
	 
	 public boolean EditTextBoxOnBBCAavilabityHistoryForInventory()
	 {
	 try{
	 	WebElement AmendBBCWebElement=new WebDriverWait(driver,10)
	 	.until(ExpectedConditions.visibilityOfElementLocated(AmendBBC_xpath));
	 	AmendBBCWebElement.click();
	 	
	 	WebElement InventoryAmountTextBoxWebElement=new WebDriverWait(driver,10)
	 	.until(ExpectedConditions.visibilityOfElementLocated(InventoryAmountTextBox_xpath));
	 	InventoryAmountTextBoxWebElement.isDisplayed();
	 	
	 	WebElement IneligibleAmountTextBoxWebElement=new WebDriverWait(driver,10)
	 	.until(ExpectedConditions.visibilityOfElementLocated(IneligibleAmountTextBox_xpath));
	 	IneligibleAmountTextBoxWebElement.isDisplayed();
	 	
	 	WebElement AvailableAmountTextBoxWebElement=new WebDriverWait(driver,10)
	 	.until(ExpectedConditions.visibilityOfElementLocated(AvailableAmountTextBox_xpath));
	 	AvailableAmountTextBoxWebElement.isDisplayed();
	 	
	 	WebElement InventoryBorrowingBaseAmountTextBoxWebElement=new WebDriverWait(driver,10)
	 	.until(ExpectedConditions.visibilityOfElementLocated(InventoryBorrowingBaseAmountTextBox_xpath));
	 	InventoryBorrowingBaseAmountTextBoxWebElement.isDisplayed();
	 	
	 	
	 	WebElement InventorySublimitTextBoxWebElement=new WebDriverWait(driver,10)
	 	.until(ExpectedConditions.visibilityOfElementLocated(InventorySublimitTextBox_xpath));
	 	InventorySublimitTextBoxWebElement.isDisplayed();
	 	
	 	
	 	WebElement ARRelianceAmountTextBoxWebElement=new WebDriverWait(driver,10)
	 	.until(ExpectedConditions.visibilityOfElementLocated(ARRelianceAmountTextBox_xpath));
	 	ARRelianceAmountTextBoxWebElement.isDisplayed();
	 	
	 	WebElement LoanPercentTextBoxWebElement=new WebDriverWait(driver,10)
	 	.until(ExpectedConditions.visibilityOfElementLocated(LoanPercentTextBox_xpath));
	 	LoanPercentTextBoxWebElement.isDisplayed();
	 	
	 	WebElement InventoryReserveTextBoxWebElement=new WebDriverWait(driver,10)
	 	.until(ExpectedConditions.visibilityOfElementLocated(InventoryReserveTextBox_xpath));
	 	InventoryReserveTextBoxWebElement.isDisplayed();
	 	
	 	return true;
	 }
	 catch(Exception ex){
	 	return false;
	 }
}
	 public boolean EditTextBoxOnBBCAavilabityHistoryForOtherCollateral()
	 {
	 try{
	 	WebElement AmendBBCWebElement=new WebDriverWait(driver,10)
	 	.until(ExpectedConditions.visibilityOfElementLocated(AmendBBC_xpath));
	 	AmendBBCWebElement.click();
	 	
	 	WebElement OtherAmountTextBoxWebElement=new WebDriverWait(driver,10)
	 	.until(ExpectedConditions.visibilityOfElementLocated(OtherAmountTextBox_xpath));
	 	OtherAmountTextBoxWebElement.isDisplayed();
	 	
	 	WebElement AssetAvailableForAdvanceTextBoxWebElement=new WebDriverWait(driver,10)
	 	.until(ExpectedConditions.visibilityOfElementLocated(AssetAvailableForAdvanceTextBox_xpath));
	 	AssetAvailableForAdvanceTextBoxWebElement.isDisplayed();
	 	
	 	WebElement OtherSublimitTextBoxWebElement=new WebDriverWait(driver,10)
	 	.until(ExpectedConditions.visibilityOfElementLocated(OtherSublimitTextBox_xpath));
	 	OtherSublimitTextBoxWebElement.isDisplayed();
	 	
	 	WebElement OtherReserveTextBoxWebElement=new WebDriverWait(driver,10)
	 	.until(ExpectedConditions.visibilityOfElementLocated(OtherReserveTextBox_xpath));
	 	OtherReserveTextBoxWebElement.isDisplayed();
	 	
	 	
	 	WebElement CommitmentTextBoxWebElement=new WebDriverWait(driver,10)
	 	.until(ExpectedConditions.visibilityOfElementLocated(CommitmentTextBox_xpath));
	 	CommitmentTextBoxWebElement.isDisplayed();
	 	
	 	
	 	WebElement LineLimitWithReserveTextBoxWebElement=new WebDriverWait(driver,10)
	 	.until(ExpectedConditions.visibilityOfElementLocated(LineLimitWithReserveTextBox_xpath));
	 	LineLimitWithReserveTextBoxWebElement.isDisplayed();
	 	
	 	
	 	return true;
	 }
	 catch(Exception ex){
	 	return false;
	 }
	 }
	 
	 public boolean EditTextBoxOnBBCAavilabityHistoryForAP()
	 {
	 try{
	 	WebElement AmendBBCWebElement=new WebDriverWait(driver,10)
	 	.until(ExpectedConditions.visibilityOfElementLocated(AmendBBC_xpath));
	 	AmendBBCWebElement.click();
	 	
	 	WebElement FuturePayTextBoxWebElement=new WebDriverWait(driver,10)
	 	.until(ExpectedConditions.visibilityOfElementLocated(FutureTextBoxPay_xpath));
	 	FuturePayTextBoxWebElement.isDisplayed();
	 	
	 	WebElement CurrentPayTextBoxWebElement=new WebDriverWait(driver,10)
	 	.until(ExpectedConditions.visibilityOfElementLocated(CurrentTextBoxPay_xpath));
	 	CurrentPayTextBoxWebElement.isDisplayed();
	 	
	 	WebElement Over30PayTextBoxWebElement=new WebDriverWait(driver,10)
	 	.until(ExpectedConditions.visibilityOfElementLocated(Over30TextBoxPay_xpath));
	 	Over30PayTextBoxWebElement.isDisplayed();
	 	
	 	WebElement Over60PayTextBoxWebElement=new WebDriverWait(driver,10)
	 	.until(ExpectedConditions.visibilityOfElementLocated(Over60TextBoxPay_xpath));
	 	Over60PayTextBoxWebElement.isDisplayed();
	 	
	 	WebElement Over90PayTextBoxWebElement=new WebDriverWait(driver,10)
	 	.until(ExpectedConditions.visibilityOfElementLocated(Over90TextBoxPay_xpath));
	 	Over90PayTextBoxWebElement.isDisplayed();
	 	
	 	
	 	WebElement Over120PayTextBoxWebElement=new WebDriverWait(driver,10)
	 	.until(ExpectedConditions.visibilityOfElementLocated(Over120TextBoxPay_xpath));
	 	Over120PayTextBoxWebElement.isDisplayed();
	 	
	 	WebElement RetentionPayTextBoxWebElement=new WebDriverWait(driver,10)
	 	.until(ExpectedConditions.visibilityOfElementLocated(RetentionTextBoxPay_xpath));
	 	RetentionPayTextBoxWebElement.isDisplayed();
	 	
	 	return true;
	 }
	 catch(Exception ex){
	 	return false;
	 }
}
	
	 public boolean EditedTextBoxOnBBCAavilabityHistoryForAmendBBC(String ineligbleamount,String aravailable)
	 {
	 try{
	 	WebElement AmendBBCWebElement=new WebDriverWait(driver,10)
	 	.until(ExpectedConditions.visibilityOfElementLocated(AmendBBC_xpath));
	 	AmendBBCWebElement.click();
	 	
	 	WebElement IneligibleAmountyTextBoxWebElement=new WebDriverWait(driver,10)
	 	.until(ExpectedConditions.visibilityOfElementLocated(IneligibleAmount_xpath));
	 	IneligibleAmountyTextBoxWebElement.clear();
	 	IneligibleAmountyTextBoxWebElement.sendKeys(ineligbleamount);
	 	
	 	WebElement ARavailableWebElement=new WebDriverWait(driver,10)
	 	.until(ExpectedConditions.visibilityOfElementLocated(ARavailable_xpath));
	 	ARavailableWebElement.clear();
	 	ARavailableWebElement.sendKeys(aravailable);
	 	
	 	//Thread.sleep(2000);
	 	/*WebElement CancelWebElement=new WebDriverWait(driver,10)
	 	.until(ExpectedConditions.visibilityOfElementLocated(CancelOnBBCAvailability_xpath));
	 	CancelWebElement.click();*/
	 	
	 	
	 	return true;
	 }
	 catch(Exception ex){
	 	return false;
	 }	 
	 }
	 public boolean scrollToViewElementForBBC()
	 {
		try{
			 WebElement actual1=new WebDriverWait(driver,10)
 		 .until(ExpectedConditions.visibilityOfElementLocated(BBCAvailability_xpath));
 		JavascriptExecutor jse1 = (JavascriptExecutor)driver;;
 		jse1.executeScript("arguments[0].scrollIntoView(true);", actual1);  		
	        //Thread.sleep(2000);
	        System.out.println("scroll done");
	        return true;
			
		}
		catch(Exception e){
			
		}
		return false;
		
		}
	 
	 public boolean scrollUp()
	 {
	 try{
	     
	 JavascriptExecutor js = (JavascriptExecutor) driver;
	 js.executeScript("window.scrollBy(0,-1500)", "");
	 /*js.executeScript("window.scrollBy(0,-8000)");*/
	 System.out.println("screen scrolled up successfully");
	 //Thread.sleep(3000);
	 
	 return true;
          }
	 catch(Exception ex){
	 return false;
	 }
	 }
 
	 public boolean CancelButtonONBBCAavilabityHistoryForAmendBBC()
	 {
	 try{
	     WebElement CancelWebElement=new WebDriverWait(driver,10)
	 	.until(ExpectedConditions.visibilityOfElementLocated(CancelOnBBCAvailability_xpath));
	 	CancelWebElement.click();
	 	Alert alert = driver.switchTo().alert();
   		alert.accept();
   		//Thread.sleep(5000);
	 	return true;
	 } catch(Exception ex){
	 	return false;
}  } 

public boolean SaveButtonONBBCAavilabityHistoryForAmendBBC()
{
try{
    WebElement CancelWebElement=new WebDriverWait(driver,10)
	.until(ExpectedConditions.visibilityOfElementLocated(SaveOnBBCAvailability_xpath));
	CancelWebElement.click();
	
	return true;
} catch(Exception ex){
	return false;
} 
}

public boolean AcceptSavePopupOnBBCAavilabityHistoryForAmendBBC()
{
try{
    WebElement CancelWebElement=new WebDriverWait(driver,10)
	.until(ExpectedConditions.visibilityOfElementLocated(AcceptSavePopupOnBBCAavilabityHistoryForAmendBBC_xpath));
	CancelWebElement.click();
	
	return true;
} catch(Exception ex){
	return false;
} 
}

public boolean SucessMessageSaveBBCAavilabityHistoryForAmendBBC(String Expected )
{
try{
    WebElement SucessMessageWebElement=new WebDriverWait(driver,10)
	.until(ExpectedConditions.visibilityOfElementLocated(SucessMessageSaveBBCAavilabityHistoryForAmendBBC_xpath));
    String actual = SucessMessageWebElement.getText().trim();
	if (actual.equals(Expected))
		return true;
	else
		return false;
} catch(Exception ex){
	return false;
} 
}



	 
	public boolean clickOnBBCPrintButton(String BorrowingBaseCertificateDate) {
		try {

			WebElement netBorrowingBaseWebEelement = new WebDriverWait(driver,
					30).until(ExpectedConditions
					.visibilityOfElementLocated(BBCPrintButton_xpath));
			netBorrowingBaseWebEelement.click();

			Thread.sleep(2000);
			Set<String> handles = driver.getWindowHandles();
			Iterator<String> it = handles.iterator();
			// iterate through your windows
			while (it.hasNext()) {
				String parent = it.next();
				String newwin = it.next();
				driver.switchTo().window(newwin);

				driver.findElement(
						By.xpath("//h2[text()='Borrowing Base Certificate "
								+ BorrowingBaseCertificateDate + "']"))
						.isDisplayed();
				System.out.println("Report header");

			}
			return true;
		} catch (Exception ex) {
			return false;
		}
	}

	    public boolean clickOnBBCPrintButton1()
		
	    	{
	    		try{
	    			driver.switchTo().defaultContent();
	    			return true;
	    		}
	    		catch(Exception ex){
	    			return false;
	    		}
	    		}
	    
	    
	    public boolean  verifyTotalAgedReceivablesReport(String  TotalAgedReceivables){
	    	try {
	    		WebElement displayWebElement = new WebDriverWait(driver, 100).until(ExpectedConditions.visibilityOfElementLocated(totalAgedReceivablesReport_xpath));
	    		WebElement AmountWebElement = new WebDriverWait(driver, 100).until(ExpectedConditions.visibilityOfElementLocated(totalAgedReceivablesValuesReport_xpath));
	    		displayWebElement.isDisplayed();
	    		String actual = AmountWebElement.getText().trim();
	    		if (actual.equals(TotalAgedReceivables))
	    			return true;
	    		else
	    			return false;

	    	} catch (Exception e) {
	    		return false;
	    	}
	    	
	    }
	    
	    public boolean  verifyNetARAvailableForAdvanceReport(String  NetARAvailableForAdvance){
	    	try {
	    		WebElement displayWebElement = new WebDriverWait(driver, 100).until(ExpectedConditions.visibilityOfElementLocated(netARAvailableForAdvance_xpath));
	    		WebElement AmountWebElement = new WebDriverWait(driver, 100).until(ExpectedConditions.visibilityOfElementLocated(netARAvailableForAdvanceValue_xpath));
	    		displayWebElement.isDisplayed();
	    		String actual = AmountWebElement.getText().trim();
	    		if (actual.equals(NetARAvailableForAdvance))
	    			return true;
	    		else
	    			return false;

	    	} catch (Exception e) {
	    		return false;
	    	}
	    	
	    }
	    
	    public boolean  verifyNetInventoryAvailableForAdvanceReport(String  NetInventoryAvailableForAdvance){
	    	try {
	    		WebElement displayWebElement = new WebDriverWait(driver, 100).until(ExpectedConditions.visibilityOfElementLocated(netInventoryAvailableForAdvanceReport_xpath));
	    		WebElement AmountWebElement = new WebDriverWait(driver, 100).until(ExpectedConditions.visibilityOfElementLocated(netInventoryAvailableForAdvanceValueReport_xpath));
	    		displayWebElement.isDisplayed();
	    		String actual = AmountWebElement.getText().trim();
	    		if (actual.equals(NetInventoryAvailableForAdvance))
	    			return true;
	    		else
	    			return false;

	    	} catch (Exception e) {
	    		return false;
	    	}
	    	
	    }
	    
	    public boolean  verifyNetOtherAvailableForAdvanceReport(String  NetOtherAvailableForAdvance){
	    	try {
	    		WebElement displayWebElement = new WebDriverWait(driver, 100).until(ExpectedConditions.visibilityOfElementLocated(netOtherAvailableForAdvanceReport_xpath));
	    		WebElement AmountWebElement = new WebDriverWait(driver, 100).until(ExpectedConditions.visibilityOfElementLocated(netOtherAvailableForAdvanceValueReport_xpath));
	    		displayWebElement.isDisplayed();
	    		String actual = AmountWebElement.getText().trim();
	    		if (actual.equals(NetOtherAvailableForAdvance))
	    			return true;
	    		else
	    			return false;

	    	} catch (Exception e) {
	    		return false;
	    	}
	    	
	    }
	    
	    public boolean  verifyborrorwingBaseAvailabilityReport(String  borrorwingBaseAvailability){
	    	try {
	    		WebElement displayWebElement = new WebDriverWait(driver, 100).until(ExpectedConditions.visibilityOfElementLocated(borrorwingBaseAvailabilityReport_xpath));
	    		WebElement AmountWebElement = new WebDriverWait(driver, 100).until(ExpectedConditions.visibilityOfElementLocated(borrorwingBaseAvailabilityValueReport_xpath));
	    		displayWebElement.isDisplayed();
	    		String actual = AmountWebElement.getText().trim();
	    		if (actual.equals(borrorwingBaseAvailability))
	    			return true;
	    		else
	    			return false;

	    	} catch (Exception e) {
	    		return false;
	    	}
	    	
	    }
	    
	    public boolean  verifyfundedAmountReport(String  fundRequested){
	    	try {
	    		WebElement displayWebElement = new WebDriverWait(driver, 100).until(ExpectedConditions.visibilityOfElementLocated(fundedAmountReport_xpath));
	    		WebElement AmountWebElement = new WebDriverWait(driver, 100).until(ExpectedConditions.visibilityOfElementLocated(fundedAmountValueReport_xpath));
	    		displayWebElement.isDisplayed();
	    		String actual = AmountWebElement.getText().trim();
	    		if (actual.equals(fundRequested))
	    			return true;
	    		else
	    			return false;

	    	} catch (Exception e) {
	    		return false;
	    	}
	    	
	    }
	    
	    public boolean  verifynetBorrowingBaseAvailableReport(String  netBorrowingBaseAvailable){
	    	try {
	    		WebElement displayWebElement = new WebDriverWait(driver, 100).until(ExpectedConditions.visibilityOfElementLocated(netBorrowingBaseAvailableReport_xpath));
	    		WebElement AmountWebElement = new WebDriverWait(driver, 100).until(ExpectedConditions.visibilityOfElementLocated(netBorrowingBaseAvailableValueReport_xpath));
	    		displayWebElement.isDisplayed();
	    		String actual = AmountWebElement.getText().trim();
	    		if (actual.equals(netBorrowingBaseAvailable))
	    			return true;
	    		else
	    			return false;

	    	} catch (Exception e) {
	    		return false;
	    	}
	    	
	    }
	    
	    public boolean scrollToView()
		{
			try{
				 WebElement actual1=new WebDriverWait(driver,10)
	    		 .until(ExpectedConditions.visibilityOfElementLocated(inventoryBorrowingBase_xpath));
	    		JavascriptExecutor jse1 = (JavascriptExecutor)driver;;
	    		jse1.executeScript("arguments[0].scrollIntoView(true);", actual1);  		
		        //Thread.sleep(3000);
		        return true;
				
			}
			catch(Exception e){
				
			}
			return false;
			
			}
	    
	    public boolean scrollToViewElementS()
		{
			try{
				 WebElement actual1=new WebDriverWait(driver,10)
	    		 .until(ExpectedConditions.visibilityOfElementLocated(borrorwingBaseAvailabilityReport_xpath));
	    		JavascriptExecutor jse1 = (JavascriptExecutor)driver;;
	    		jse1.executeScript("arguments[0].scrollIntoView(true);", actual1);  		
		        //Thread.sleep(3000);
		        return true;
				
			}
			catch(Exception e){
				
			}
			return false;
			
			}
	    
	    //
	    public boolean  verifyTotalAgedReceivablesReportM(String  TotalAgedReceivables){
	    	try {
	    		WebElement displayWebElement = new WebDriverWait(driver, 100).until(ExpectedConditions.visibilityOfElementLocated(totalAgedReceivablesReport_xpath));
	    		WebElement AmountWebElement = new WebDriverWait(driver, 100).until(ExpectedConditions.visibilityOfElementLocated(totalAgedReceivablesValuesReportM_xpath));
	    		displayWebElement.isDisplayed();
	    		String actual = AmountWebElement.getText().trim();
	    		if (actual.equals(TotalAgedReceivables))
	    			return true;
	    		else
	    			return false;

	    	} catch (Exception e) {
	    		return false;
	    	}
	    	
	    }
	    
	    public boolean  verifyNetARAvailableForAdvanceReportM(String  NetARAvailableForAdvance){
	    	try {
	    		WebElement displayWebElement = new WebDriverWait(driver, 100).until(ExpectedConditions.visibilityOfElementLocated(netARAvailableForAdvance_xpath));
	    		WebElement AmountWebElement = new WebDriverWait(driver, 100).until(ExpectedConditions.visibilityOfElementLocated(netARAvailableForAdvanceValueM_xpath));
	    		displayWebElement.isDisplayed();
	    		String actual = AmountWebElement.getText().trim();
	    		if (actual.equals(NetARAvailableForAdvance))
	    			return true;
	    		else
	    			return false;

	    	} catch (Exception e) {
	    		return false;
	    	}
	    	
	    }
	    
	    public boolean  verifyNetInventoryAvailableForAdvanceReportM(String  NetInventoryAvailableForAdvance){
	    	try {
	    		WebElement displayWebElement = new WebDriverWait(driver, 100).until(ExpectedConditions.visibilityOfElementLocated(netInventoryAvailableForAdvanceReport_xpath));
	    		WebElement AmountWebElement = new WebDriverWait(driver, 100).until(ExpectedConditions.visibilityOfElementLocated(netInventoryAvailableForAdvanceValueReportM_xpath));
	    		displayWebElement.isDisplayed();
	    		String actual = AmountWebElement.getText().trim();
	    		if (actual.equals(NetInventoryAvailableForAdvance))
	    			return true;
	    		else
	    			return false;

	    	} catch (Exception e) {
	    		return false;
	    	}
	    	
	    }
	    
	    public boolean  verifyNetOtherAvailableForAdvanceReportM(String  NetOtherAvailableForAdvance){
	    	try {
	    		WebElement displayWebElement = new WebDriverWait(driver, 100).until(ExpectedConditions.visibilityOfElementLocated(netOtherAvailableForAdvanceReport_xpath));
	    		WebElement AmountWebElement = new WebDriverWait(driver, 100).until(ExpectedConditions.visibilityOfElementLocated(netOtherAvailableForAdvanceValueReportM_xpath));
	    		displayWebElement.isDisplayed();
	    		String actual = AmountWebElement.getText().trim();
	    		if (actual.equals(NetOtherAvailableForAdvance))
	    			return true;
	    		else
	    			return false;

	    	} catch (Exception e) {
	    		return false;
	    	}
	    	
	    }
	    
	    public boolean  verifyborrorwingBaseAvailabilityReportM(String  borrorwingBaseAvailability){
	    	try {
	    		WebElement displayWebElement = new WebDriverWait(driver, 100).until(ExpectedConditions.visibilityOfElementLocated(borrorwingBaseAvailabilityReport_xpath));
	    		WebElement AmountWebElement = new WebDriverWait(driver, 100).until(ExpectedConditions.visibilityOfElementLocated(borrorwingBaseAvailabilityValueReportM_xpath));
	    		displayWebElement.isDisplayed();
	    		String actual = AmountWebElement.getText().trim();
	    		if (actual.equals(borrorwingBaseAvailability))
	    			return true;
	    		else
	    			return false;

	    	} catch (Exception e) {
	    		return false;
	    	}
	    	
	    }
	    
	    public boolean  verifyfundedAmountReportM(String  fundRequested){
	    	try {
	    		WebElement displayWebElement = new WebDriverWait(driver, 100).until(ExpectedConditions.visibilityOfElementLocated(fundedAmountReport_xpath));
	    		WebElement AmountWebElement = new WebDriverWait(driver, 100).until(ExpectedConditions.visibilityOfElementLocated(fundedAmountValueReportM_xpath));
	    		displayWebElement.isDisplayed();
	    		String actual = AmountWebElement.getText().trim();
	    		if (actual.equals(fundRequested))
	    			return true;
	    		else
	    			return false;

	    	} catch (Exception e) {
	    		return false;
	    	}
	    	
	    }
	    public boolean  verifynetBorrowingBaseAvailableReportM(String  netBorrowingBaseAvailable){
	    	try {
	    		WebElement displayWebElement = new WebDriverWait(driver, 100).until(ExpectedConditions.visibilityOfElementLocated(netBorrowingBaseAvailableReport_xpath));
	    		WebElement AmountWebElement = new WebDriverWait(driver, 100).until(ExpectedConditions.visibilityOfElementLocated(netBorrowingBaseAvailableValueReportM_xpath));
	    		displayWebElement.isDisplayed();
	    		String actual = AmountWebElement.getText().trim();
	    		if (actual.equals(netBorrowingBaseAvailable))
	    			return true;
	    		else
	    			return false;

	    	} catch (Exception e) {
	    		return false;
	    	}
	    	
	    }
	    
	    public boolean  verifyTotalAgedReceivablesForMulDiv(String totalAgedReceivables){
	    	try {
	    		WebElement displayWebElement = new WebDriverWait(driver, 100).until(ExpectedConditions.visibilityOfElementLocated(TotalAgedReceivablesForMulDiv_xpath));
	    		WebElement AmountWebElement = new WebDriverWait(driver, 100).until(ExpectedConditions.visibilityOfElementLocated(TotalAgedReceivablesForMulDiv_xpath));
	    		displayWebElement.isDisplayed();
	    		String actual = AmountWebElement.getText().trim();
	    		if (actual.equals(totalAgedReceivables))
	    			return true;
	    		else
	    			return false;

	    	} catch (Exception e) {

	    		return false;
	    	}
	    	
	    	}
	    
	    public boolean  verifyARBorrowingBaseForMulDiv(String  ARBorrowingBase){
	    	try {
	    		WebElement displayWebElement = new WebDriverWait(driver, 100).until(ExpectedConditions.visibilityOfElementLocated(ArborrowingBaseAvailabilityForMulDiv_xpath));
	    		WebElement AmountWebElement = new WebDriverWait(driver, 100).until(ExpectedConditions.visibilityOfElementLocated(ArborrowingBaseAvailabilityForMulDiv_xpath));
	    		displayWebElement.isDisplayed();
	    		String actual = AmountWebElement.getText().trim();
	    		if (actual.equals(ARBorrowingBase))
	    			return true;
	    		else
	    			return false;

	    	} catch (Exception e) {
	    		return false;
	    	}
	    	
	    }
	    public boolean  verifyNetBorrowingBaseAvailableForMulDiv(String  netBorrowingBaseAvailable){
	    	try {
	    		WebElement displayWebElement = new WebDriverWait(driver, 100).until(ExpectedConditions.visibilityOfElementLocated(netBorrowingBaseForMulDiv_xpath));
	    		WebElement AmountWebElement = new WebDriverWait(driver, 100).until(ExpectedConditions.visibilityOfElementLocated(netBorrowingBaseForMulDiv_xpath));
	    		displayWebElement.isDisplayed();
	    		String actual = AmountWebElement.getText().trim();
	    		if (actual.equals(netBorrowingBaseAvailable))
	    			return true;
	    		else
	    			return false;

	    	} catch (Exception e) {
	    		return false;
	    	}
	    	
	    }
	    public boolean scrollToViewForFundedAmount()
		{
			try{
				 WebElement actual1=new WebDriverWait(driver,10)
	    		 .until(ExpectedConditions.visibilityOfElementLocated(ScrollToViewForFundedAmount_xpath));
	    		JavascriptExecutor jse1 = (JavascriptExecutor)driver;;
	    		jse1.executeScript("arguments[0].scrollIntoView(true);", actual1);  		

		        //Thread.sleep(3000);

		        return true;
				
			}
			catch(Exception e){
				
			}
			return false;
			
			}
	    public boolean scrollToViewForinventorybase()
		{
			try{
				 WebElement actual1=new WebDriverWait(driver,10)
	    		 .until(ExpectedConditions.visibilityOfElementLocated(inventoryborrowingBaseForMulDiv));
	    		JavascriptExecutor jse1 = (JavascriptExecutor)driver;;
	    		jse1.executeScript("arguments[0].scrollIntoView(true);", actual1);  		
		        //Thread.sleep(3000);
		        return true;
				
			}
			catch(Exception e){
				
			}
			return false;
			
			}
	    public boolean  verifyTotalAgedReceivablesReportForMulDiv(String  TotalAgedReceivables){
	    	try {
	    		WebElement displayWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(totalAgedReceivablesValuesReportForMulDiv_xpath));
	    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(totalAgedReceivablesValuesReportForMulDiv_xpath));
	    		displayWebElement.isDisplayed();
	    		String actual = AmountWebElement.getText().trim();
	    		if (actual.equals(TotalAgedReceivables))
	    			return true;
	    		else
	    			return false;

	    	} catch (Exception e) {
	    		return false;
	    	}
	    	
	    }
	    public boolean  verifyNetInventoryAvailableForAdvanceReportForMulDiv(String  NetInventoryAvailableForAdvance){
	    	try {
	    		WebElement displayWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(netInventoryAvailableForAdvanceValueReportForMulDiv_xpath));
	    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(netInventoryAvailableForAdvanceValueReportForMulDiv_xpath));
	    		displayWebElement.isDisplayed();
	    		String actual = AmountWebElement.getText().trim();
	    		if (actual.equals(NetInventoryAvailableForAdvance))
	    			return true;
	    		else
	    			return false;

	    	} catch (Exception e) {
	    		return false;
	    	}
	    	
	    }
	    public boolean  verifyNetOtherAvailableForAdvanceReportForMulDiv(String  NetOtherAvailableForAdvance){
	    	try {
	    		WebElement displayWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(netOtherAvailableForAdvanceValueReportForMulDIv_xpath));
	    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(netOtherAvailableForAdvanceValueReportForMulDIv_xpath));
	    		displayWebElement.isDisplayed();
	    		String actual = AmountWebElement.getText().trim();
	    		if (actual.equals(NetOtherAvailableForAdvance))
	    			return true;
	    		else
	    			return false;

	    	} catch (Exception e) {
	    		return false;
	    	}
	    	
	    }
	    public boolean  verifyborrorwingBaseAvailabilityReportForMulDiv(String  borrorwingBaseAvailability){
	    	try {
	    		WebElement displayWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(borrorwingBaseAvailabilityValueReportForMulDiv_xpath));
	    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(borrorwingBaseAvailabilityValueReportForMulDiv_xpath));
	    		displayWebElement.isDisplayed();
	    		String actual = AmountWebElement.getText().trim();
	    		if (actual.equals(borrorwingBaseAvailability))
	    			return true;
	    		else
	    			return false;

	    	} catch (Exception e) {
	    		return false;
	    	}
	    	
	    }
	    public boolean  verifyfundedAmountReportFormulDiv(String  fundRequested){
	    	try {
	    		WebElement displayWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(fundedAmountValueReportForMulDiv_xpath));
	    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(fundedAmountValueReportForMulDiv_xpath));
	    		displayWebElement.isDisplayed();
	    		String actual = AmountWebElement.getText().trim();
	    		if (actual.equals(fundRequested))
	    			return true;
	    		else
	    			return false;

	    	} catch (Exception e) {
	    		return false;
	    	}
	    	
	    }
	    public boolean  verifynetBorrowingBaseAvailableReportForMulDiv(String  netBorrowingBaseAvailable){
	    	try {
	    		WebElement displayWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(netBorrowingBaseAvailableValueReportForMulDiv_xpath));
	    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(netBorrowingBaseAvailableValueReportForMulDiv_xpath));
	    		displayWebElement.isDisplayed();
	    		String actual = AmountWebElement.getText().trim();
	    		if (actual.equals(netBorrowingBaseAvailable))
	    			return true;
	    		else
	    			return false;

	    	} catch (Exception e) {
	    		return false;
	    	}
	    	
	    }
	    

	    //
	    
	    public boolean  verifyNetBorrowingBaseAvailableSkipped(String  netBorrowingBaseAvailable){
	    	try {
	    		WebElement displayWebElement = new WebDriverWait(driver, 100).until(ExpectedConditions.visibilityOfElementLocated(netBorrowingBaseAvailable_xpath));
	    		WebElement AmountWebElement = new WebDriverWait(driver, 100).until(ExpectedConditions.visibilityOfElementLocated(netBorrowingBaseAvailableskValue_xpath));
	    		displayWebElement.isDisplayed();
	    		String actual = AmountWebElement.getText().trim();
	    		if (actual.equals(netBorrowingBaseAvailable))
	    			return true;
	    		else
	    			return false;

	    	} catch (Exception e) {
	    		return false;
	    	}
	    	
	    }
	    public boolean scrollToViewElementNet()
		{
			try{
				 WebElement actual1=new WebDriverWait(driver,10)
	    		 .until(ExpectedConditions.visibilityOfElementLocated(netBorrowingBaseAvailable_xpath));
	    		JavascriptExecutor jse1 = (JavascriptExecutor)driver;;
	    		jse1.executeScript("arguments[0].scrollIntoView(true);", actual1);  		
		        Thread.sleep(3000);
		        return true;
			}
			catch(Exception e){
				
			}
			return false;
			
			}


        public boolean  verifyAgedCreditItem(String  AgedCreditItem){
        	try {
        		
        		WebElement AmountWebElement = new WebDriverWait(driver, 100).until(ExpectedConditions.visibilityOfElementLocated(AgedCreditItem_xpath));
        		String actual = AmountWebElement.getText().trim();
        		if (actual.equals(AgedCreditItem))
        			return true;
        		else
        			return false;

        	} catch (Exception e) {
        		return false;
        	}
        	
        	}
        
        public boolean  verifyCrossAgedPercentage(String  CrossAgedPercentage){
        	try {
        		
        		WebElement AmountWebElement = new WebDriverWait(driver, 100).until(ExpectedConditions.visibilityOfElementLocated(CrossAgedPercentage_xpath));
        		String actual = AmountWebElement.getText().trim();
        		if (actual.equals(CrossAgedPercentage))
        			return true;
        		else
        			return false;

        	} catch (Exception e) {
        		return false;
        	}
        	
        	}
        public boolean  verifyConcentrationPercentage_AgedCreditLimit_EligibleBalance(String  ConcentrationPercentage){
        	try {
        		
        		WebElement AmountWebElement = new WebDriverWait(driver, 100).until(ExpectedConditions.visibilityOfElementLocated(ConcentrationPercentageAgedcreditLimitEligibleBalance_xpath));
        		String actual = AmountWebElement.getText().trim();
        		if (actual.equals(ConcentrationPercentage))
        			return true;
        		else
        			return false;

        	} catch (Exception e) {
        		return false;
        	}
        	
        	}
        
        public boolean  verifyConcentrationPercentage(String  ConcentrationPercentage){
        	try {
        		
        		WebElement AmountWebElement = new WebDriverWait(driver, 100).until(ExpectedConditions.visibilityOfElementLocated(ConcentrationPercentage_xpath));
        		String actual = AmountWebElement.getText().trim();
        		if (actual.equals(ConcentrationPercentage))
        			return true;
        		else
        			return false;

        	} catch (Exception e) {
        		return false;
        	}
        	
        	}
        
        public boolean  verifyConcentrationPercentage_AgedCreditLimit(String  ConcentrationPercentage){
        	try {
        		
        		WebElement AmountWebElement = new WebDriverWait(driver, 100).
        				until(ExpectedConditions.visibilityOfElementLocated(ConcentrationPercentageAgedcreditLimit_xpath));
        		JavascriptExecutor jse1 = (JavascriptExecutor)driver;;
				jse1.executeScript("arguments[0].scrollIntoView(true);", AmountWebElement);
        		String actual = AmountWebElement.getText();
        		if (actual.equals(ConcentrationPercentage))
        			return true;
        		else
        			return false;

        	} catch (Exception e) {
        		return false;
        	}
        	
        	}
        public boolean  verifyConcentrationPercentage_IneligibleCustomer(String  ConcentrationPercentage){
        	try {
        		
        		WebElement AmountWebElement = new WebDriverWait(driver, 100).until(ExpectedConditions.visibilityOfElementLocated(ConcentrationPercentageIneligibleCustomer_xpath));
        		String actual = AmountWebElement.getText().trim();
        		if (actual.equals(ConcentrationPercentage))
        			return true;
        		else
        			return false;

        	} catch (Exception e) {
        		return false;
        	}
        	
        	}
        public boolean  ConcentrationPercentageAgedCreditLimitExclude(String  ConcentrationPercentage){
        	try {
        		
        		WebElement AmountWebElement = new WebDriverWait(driver, 100).
        				until(ExpectedConditions.visibilityOfElementLocated(ConcentrationPercentageAgedCreditLimitExclude_xpath));
        		JavascriptExecutor jse1 = (JavascriptExecutor)driver;;
				jse1.executeScript("arguments[0].scrollIntoView(true);", AmountWebElement);
        		String actual = AmountWebElement.getText();
        		if (actual.equals(ConcentrationPercentage))
        			return true;
        		else
        			return false;

        	} catch (Exception e) {
        		return false;
        	}
        	
        	}
        
        public boolean  verifyPastDueDate(String  AgedPastDueDays){
        	try {
        		
        		WebElement AmountWebElement = new WebDriverWait(driver, 100).until(ExpectedConditions.visibilityOfElementLocated(PastDueDays_xpath));
        		String actual = AmountWebElement.getText().trim();
        		if (actual.equals(AgedPastDueDays))
        			return true;
        		else
        			return false;

        	} catch (Exception e) {
        		return false;
        	}
        	
        	}
        
        public boolean  verifyIneligibleCustomer(String  Ineligible){
        	try {
        		
        		WebElement AmountWebElement = new WebDriverWait(driver, 100).until(ExpectedConditions.visibilityOfElementLocated(IneligibleCustomer_xpath));
        		String actual = AmountWebElement.getText().trim();
        		if (actual.equals(Ineligible))
        			return true;
        		else
        			return false;

        	} catch (Exception e) {
        		return false;
        	}
        	
        	}
        
        public boolean clickOnSecondPlus()
    	{
    		try{

    			WebElement plusWebEelement=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(secondPlus_xpath));
    			plusWebEelement.click();
    			Thread.sleep(2000);
    			
    	return true;
    		}
    	catch (Exception ex) {
    	}
    	return false;

    	}	
        public boolean  verifyConcentrationPercentage_CrossAgedPercentage_Cap(String  ConcentrationPercentage){
    		try {
    			
    			WebElement AmountWebElement = new WebDriverWait(driver, 100).
    					until(ExpectedConditions.visibilityOfElementLocated(ConcentrationPercentageCrossAgedPercentageExclude_xpath));
    			JavascriptExecutor jse1 = (JavascriptExecutor)driver;;
    			jse1.executeScript("arguments[0].scrollIntoView(true);", AmountWebElement);
    			String actual = AmountWebElement.getText();
    			if (actual.equals(ConcentrationPercentage))
    				return true;
    			else
    				return false;

    		} catch (Exception e) {
    			return false;
    		}
    		
    		}
        public boolean  verifyConcentrationPercentage_TotalReceivabels_Cap(String  ConcentrationPercentage){
    		try {
    			
    			WebElement AmountWebElement = new WebDriverWait(driver, 100).
    					until(ExpectedConditions.visibilityOfElementLocated(ConcentrationPercentageTotalReceivablesCap_xpath));
    			JavascriptExecutor jse1 = (JavascriptExecutor)driver;;
    			jse1.executeScript("arguments[0].scrollIntoView(true);", AmountWebElement);
    			String actual = AmountWebElement.getText();
    			if (actual.equals(ConcentrationPercentage))
    				return true;
    			else
    				return false;

    		} catch (Exception e) {
    			return false;
    		}
    		
    		}
    public boolean verifyTotalAgedReceivablesForSummaryYesMulDiv(String totalAgedReceivables){

        	try {

     WebElement AmountWebElement = new WebDriverWait(driver, 100).until(ExpectedConditions.visibilityOfElementLocated(TotalAgedReceivablesForSummaryYesMulDiv_xpath));
        String actual = AmountWebElement.getText().trim();
        	if (actual.equals(totalAgedReceivables))
    return true;
 else
return false;
} 
  catch (Exception e)
        	{
return false;
     }
    }
  
    public boolean verifyARBorrowingBaseForSummaryYesMulDiv(String ARBorrowingBase){

 try {

   WebElement AmountWebElement = new WebDriverWait(driver, 100).until(ExpectedConditions.visibilityOfElementLocated(ArborrowingBaseAvailabilityForSummaryYesMulDiv_xpath));

 String actual = AmountWebElement.getText().trim();

    if (actual.equals(ARBorrowingBase))
    return true;

else

 return false;

}
 catch (Exception e)
{
return false;
}
    }
    


      
	    public boolean  verifyNetBorrowingBaseAvailableForSummaryYesMulDiv(String  netBorrowingBaseAvailable){
	    	try {
	    		WebElement AmountWebElement = new WebDriverWait(driver, 100).until(ExpectedConditions.visibilityOfElementLocated(netBorrowingBaseForSummaryYesMulDiv_xpath));
	    		String actual = AmountWebElement.getText().trim();
	    		if (actual.equals(netBorrowingBaseAvailable))
	    			return true;
	    		else
	    			return false;

	    	} catch (Exception e) {
	    		return false;
	    	}
	    	
	    }
	    public boolean  verifyTotalAgedReceivablesReportMForSummaryYesMulDiv(String  TotalAgedReceivables){
        	try {
        		WebElement AmountWebElement = new WebDriverWait(driver, 100).until(ExpectedConditions.visibilityOfElementLocated(totalAgedReceivablesValuesReportMForSummaryYesMulDiv_xpath));
        		String actual = AmountWebElement.getText().trim();
        		if (actual.equals(TotalAgedReceivables))
        			return true;
        		else
        			return false;

        	} catch (Exception e) {
        		return false;
        	}
        	
        }
        
        public boolean  verifyNetARAvailableForAdvanceReportMForSummaryYesMulDiv(String  NetARAvailableForAdvance){
        	try {
        		WebElement AmountWebElement = new WebDriverWait(driver, 100).until(ExpectedConditions.visibilityOfElementLocated(netARAvailableForAdvanceValueMForSummaryYesMulDiv_xpath));
        		String actual = AmountWebElement.getText().trim();
        		if (actual.equals(NetARAvailableForAdvance))
        			return true;
        		else
        			return false;

        	} catch (Exception e) {
        		return false;
        	}
        	
        }
        
        public boolean  verifyNetInventoryAvailableForAdvanceReportMForSummaryYesMulDiv(String  NetInventoryAvailableForAdvance){
        	try {
        		WebElement AmountWebElement = new WebDriverWait(driver, 100).until(ExpectedConditions.visibilityOfElementLocated(netInventoryAvailableForAdvanceValueReportMForSummaryYesMulDiv_xpath));
        		String actual = AmountWebElement.getText().trim();
        		if (actual.equals(NetInventoryAvailableForAdvance))
        			return true;
        		else
        			return false;


        	} catch (Exception e) {
        		return false;
        	}
        	
        }
        
        
        public boolean  verifyNetOtherAvailableForAdvanceReportMForSummaryYesMulDiv(String  NetOtherAvailableForAdvance){
        	try {
        		WebElement AmountWebElement = new WebDriverWait(driver, 100).until(ExpectedConditions.visibilityOfElementLocated(netOtherAvailableForAdvanceValueReportMForSummaryYesMulDiv_xpath));
        		String actual = AmountWebElement.getText().trim();
        		if (actual.equals(NetOtherAvailableForAdvance))
        			return true;
        		else
        			return false;

        	} catch (Exception e) {
        		return false;
        	}
        	
        }
        
        public boolean  verifyborrorwingBaseAvailabilityReportMForSummaryYesMulDiv(String  borrorwingBaseAvailability){
        	try {
        		WebElement AmountWebElement = new WebDriverWait(driver, 100).until(ExpectedConditions.visibilityOfElementLocated(borrorwingBaseAvailabilityValueReportMForSummaryYesMulDiv_xpath));
        		String actual = AmountWebElement.getText().trim();
        		if (actual.equals(borrorwingBaseAvailability))
        			return true;
        		else
        			return false;

        	} catch (Exception e) {
        		return false;
        	}
        	
        }
        
        public boolean  verifyfundRequestedReportMForSummaryYesMulDiv(String  fundRequested){
        	try {
        		WebElement AmountWebElement = new WebDriverWait(driver, 100).until(ExpectedConditions.visibilityOfElementLocated(fundRequestedValueReportMForSummaryYesMulDiv_xpath));
        		String actual = AmountWebElement.getText().trim();
        		if (actual.equals(fundRequested))
        			return true;
        		else
        			return false;

        	} catch (Exception e) {
        		return false;
        	}
        	
        }
        
        public boolean  verifynetBorrowingBaseAvailableReportMForSummaryYesMulDiv(String  netBorrowingBaseAvailable){
        	try {
        		WebElement AmountWebElement = new WebDriverWait(driver, 100).until(ExpectedConditions.visibilityOfElementLocated(netBorrowingBaseAvailableValueReportMForSummaryYesMulDiv_xpath));
        		String actual = AmountWebElement.getText().trim();
        		if (actual.equals(netBorrowingBaseAvailable))
        			return true;
        		else
        			return false;

        	} catch (Exception e) {
        		return false;
        	}
        	
        } 
        public boolean scrollToViewElement1()
		{
			try{
				 WebElement actual1=new WebDriverWait(driver,10)
	    		 .until(ExpectedConditions.visibilityOfElementLocated(fundedAmountValue1_xpath));
	    		JavascriptExecutor jse1 = (JavascriptExecutor)driver;;
	    		jse1.executeScript("arguments[0].scrollIntoView(true);", actual1);  		

		        //Thread.sleep(3000);

		        return true;
				
			}
			catch(Exception e){
				
			}
			return false;
			
			}
  //cyncs_4462
  public boolean verifyAgedPastDueDaysAmount_cyncs4462(String expected) {
  	try {
  		WebElement AgedPastDueDayaWebElement = new WebDriverWait(
  				driver, 100)
  				.until(ExpectedConditions
  						.visibilityOfElementLocated(agedpastdeu_xpath));
  		WebElement AgedPastDueDayaAmountWebElement = new WebDriverWait(
  				driver, 100)
  				.until(ExpectedConditions
  						.visibilityOfElementLocated(agedpastdueamnt_xpath));

  		AgedPastDueDayaWebElement.isDisplayed();
  		String actual = AgedPastDueDayaAmountWebElement.getText();
  		if (actual.equals(expected))
  			return true;
  		else
  			return false;

  	} catch (Exception e) {
  		return false;
  	}
  }
  
  public boolean verifyAgedPastDueDaysAmount_cyncs4462_1(String expected) {
  	try {
  		WebElement AgedPastDueDayaWebElement = new WebDriverWait(
  				driver, 100)
  				.until(ExpectedConditions
  						.visibilityOfElementLocated(agedpastdeu_xpath));
  		WebElement AgedPastDueDayaAmountWebElement = new WebDriverWait(
  				driver, 100)
  				.until(ExpectedConditions
  						.visibilityOfElementLocated(agedpastdueamnt1_xpath));

  		AgedPastDueDayaWebElement.isDisplayed();
  		String actual = AgedPastDueDayaAmountWebElement.getText();
  		if (actual.equals(expected))
  			return true;
  		else
  			return false;

  	} catch (Exception e) {
  		return false;
  	}
  }
  public boolean verifyConcentrationAmount_cyncs4462(String expected) {
  	try {
  		WebElement AgedPastDueDayaWebElement = new WebDriverWait(
  				driver, 100)
  				.until(ExpectedConditions
  						.visibilityOfElementLocated(concentration_xpath));
  		WebElement AgedPastDueDayaAmountWebElement = new WebDriverWait(
  				driver, 100)
  				.until(ExpectedConditions
  						.visibilityOfElementLocated(concentrationamnt_xpath));

  		AgedPastDueDayaWebElement.isDisplayed();
  		String actual = AgedPastDueDayaAmountWebElement.getText();
  		if (actual.equals(expected))
  			return true;
  		else
  			return false;

  	} catch (Exception e) {
  		return false;
  	}
  }
  
  public boolean verifyTotalineligAmount_cyncs4462(String expected) {
  	try {
  		WebElement AgedPastDueDayaWebElement = new WebDriverWait(
  				driver, 100)
  				.until(ExpectedConditions
  						.visibilityOfElementLocated(totalelig_xpath));
  		WebElement AgedPastDueDayaAmountWebElement = new WebDriverWait(
  				driver, 100)
  				.until(ExpectedConditions
  						.visibilityOfElementLocated(totalamnt_xpath));

  		AgedPastDueDayaWebElement.isDisplayed();
  		String actual = AgedPastDueDayaAmountWebElement.getText();
  		if (actual.equals(expected))
  			return true;
  		else
  			return false;

  	} catch (Exception e) {
  		return false;
  	}
  }
  public boolean verifyAgedPastDueDaysAmount_cyncs4462_3(String expected) {
  	try {
  		WebElement AgedPastDueDayaWebElement = new WebDriverWait(
  				driver, 100)
  				.until(ExpectedConditions
  						.visibilityOfElementLocated(agedpastdeu_xpath));
  		WebElement AgedPastDueDayaAmountWebElement = new WebDriverWait(
  				driver, 100)
  				.until(ExpectedConditions
  						.visibilityOfElementLocated(agedpastdueamnt3_xpath));

  		AgedPastDueDayaWebElement.isDisplayed();
  		String actual = AgedPastDueDayaAmountWebElement.getText();
  		if (actual.equals(expected))
  			return true;
  		else
  			return false;

  	} catch (Exception e) {
  		return false;
  	}
  }
  public boolean verifyConcentrationAmount_cyncs4462_1(String expected) {
  	try {
  		WebElement AgedPastDueDayaWebElement = new WebDriverWait(
  				driver, 100)
  				.until(ExpectedConditions
  						.visibilityOfElementLocated(concentration_xpath));
  		WebElement AgedPastDueDayaAmountWebElement = new WebDriverWait(
  				driver, 100)
  				.until(ExpectedConditions
  						.visibilityOfElementLocated(concentrationamnt1_xpath));

  		AgedPastDueDayaWebElement.isDisplayed();
  		String actual = AgedPastDueDayaAmountWebElement.getText();
  		if (actual.equals(expected))
  			return true;
  		else
  			return false;

  	} catch (Exception e) {
  		return false;
  	}
  } 
  public boolean verifyTotalineligAmount_cyncs4462_1(String expected) {
  	try {
  		WebElement AgedPastDueDayaWebElement = new WebDriverWait(
  				driver, 100)
  				.until(ExpectedConditions
  						.visibilityOfElementLocated(totalelig_xpath));
  		WebElement AgedPastDueDayaAmountWebElement = new WebDriverWait(
  				driver, 100)
  				.until(ExpectedConditions
  						.visibilityOfElementLocated(totalamnt1_xpath));

  		AgedPastDueDayaWebElement.isDisplayed();
  		String actual = AgedPastDueDayaAmountWebElement.getText();
  		if (actual.equals(expected))
  			return true;
  		else
  			return false;

  	} catch (Exception e) {
  		return false;
  	}
  }
  
}


