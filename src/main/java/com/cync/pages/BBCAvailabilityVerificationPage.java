package com.cync.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.SkipException;

import com.cync.base.BasePage;

public class BBCAvailabilityVerificationPage extends BasePage{

	   private final By BBCAvailabilityHeader_xpath=By.xpath("//span[contains(text(),'BBC Availability')]");
	    private final By BBCAvailabilityHeaderWebEelementHeader_xpath=By.xpath("//span[contains(text(),'BBC Availability')]");
	    private final By fundRequestedAmount_xpath=By.xpath("//td[contains(text(),' 10,000.00')]");
	    private final By netBorrowingBaseAmount_xpath=By.xpath("//td[contains(text(),' 20,000.00')]");
	    private final By ApproveBBCButton_xpath=By.xpath("(//a[contains(text(),'Approve BBC')])[2]");
	    private final By SendToApproverButton_xpath=By.xpath("//a[contains(text(),'Send to Approver')]");
	    private final By BBCPrintButton_xpath=By.xpath("//a[contains(text(),'BBC Print')]");
	    private final By SkipBBCButton_xpath=By.xpath("//a[contains(text(),'Skip BBC')]");
	    private final By future_xpath=By.xpath("//td[contains(text(),'Future')]");
	    private final By futureDiv1value_xpath=By.xpath("(//*[@id='child_']/td[2])[4]");
	    private final By futureTotalvalue_xpath=By.xpath("(//*[@id='child_']/td[3])[4]");
	    private final By current_xpath=By.xpath("//td[contains(text(),'Current')]");
	    private final By currentDiv1value_xpath=By.xpath("(//*[@id='child_']/td[2])[5]");
	    private final By currentTotalvalue_xpath=By.xpath("(//*[@id='child_']/td[3])[5]");
	    private final By over30_xpath=By.xpath("//td[contains(text(),'Over 30')]");
	    private final By over30Div1value_xpath=By.xpath("(//*[@id='child_']/td[2])[6]");
	    private final By over30Totalvalue_xpath=By.xpath("(//*[@id='child_']/td[3])[6]");
	    private final By over60_xpath=By.xpath("//td[contains(text(),'Over 60')]");
	    private final By over60Div1value_xpath=By.xpath("(//*[@id='child_']/td[2])[7]");
	    private final By over60Totalvalue_xpath=By.xpath("(//*[@id='child_']/td[3])[7]");
	    private final By over90_xpath=By.xpath("//td[contains(text(),'Over 90')]");
	    private final By over90Div1value_xpath=By.xpath("(//*[@id='child_']/td[2])[8]");
	    private final By over90Totalvalue_xpath=By.xpath("(//*[@id='child_']/td[3])[8]");
	    private final By over120_xpath=By.xpath("//td[contains(text(),'Over 120')]");
	    private final By over120Div1value_xpath=By.xpath("(//*[@id='child_']/td[2])[9]");
	    private final By over120Totalvalue_xpath=By.xpath("(//*[@id='child_']/td[3])[9]");
	    private final By totalAgedReceivables_xpath=By.xpath("//td[contains(text(),'Total Aged Receivables')]");
	    private final By totalAgedReceivablesDiv1value_xpath=By.xpath("(//*[@id='child_']/td[2])[10]");
	    private final By totalAgedReceivablesTotalvalue_xpath=By.xpath("(//*[@id='child_']/td[3])[10]");
	    
	    private final By ineligibles_xpath=By.xpath("//td[contains(text(),'INELIGIBLES')]");
	    private final By ineligiblesDiv1value_xpath=By.xpath("//*[@id='parent_inel_0']/td[2]");
	    private final By ineligiblesTotalvalue_xpath=By.xpath("//*[@id='parent_inel_0']/td[3]");
	    
	    private final By eligibleAR_xpath=By.xpath("//td[contains(text(),'Eligible AR')]");
	    private final By eligibleARDiv1value_xpath=By.xpath("(//*[@id='child_']/td[2])[12]");
	    private final By eligibleARTotalvalue_xpath=By.xpath("(//*[@id='child_']/td[3])[12]");
	    
	    private final By advanceRate_xpath=By.xpath("//td[contains(text(),'Advance Rate')]");
	    private final By advanceRateDiv1value_xpath=By.xpath("(//*[@id='child_']/td[2])[13]");
	//    private final By eligibleARTotalvalue_xpath=By.xpath("(//td[contains(text(),' 47,820.00')])[2]");
	    
	    private final By arBorrowingBase_xpath=By.xpath("//td[contains(text(),'AR Borrowing Base')]");
	    private final By arBorrowingBaseDiv1value_xpath=By.xpath("(//*[@id='child_']/td[2])[16]");
	    private final By arBorrowingBaseTotalvalue_xpath=By.xpath("(//*[@id='child_']/td[3])[16]");
	    
	    private final By arReceivablesSublimit=By.xpath("//td[contains(text(),'AR Receivables Sublimit')]");
	    private final By arReceivablesSublimitDiv1value_xpath=By.xpath("(//td[contains(text(),' 0.00')])[13]");
	    
	    private final By arAvailableForAdvance_xpath=By.xpath("//td[contains(text(),'AR Available for Advance')]");
	    private final By arAvailableForAdvanceDiv1value_xpath=By.xpath("(//td[contains(text(),' 38,256.00')])[1]");
	    private final By arAvailableForAdvanceTotalvalue_xpath=By.xpath("(//td[contains(text(),' 38,256.00')])[2]");
	   
	    private final By arTotalSublimit_xpath=By.xpath("//td[contains(text(),'AR Total Sublimit')]");
	    private final By arTotalSublimitTotalvalue_xpath=By.xpath("(//td[contains(text(),' 0.00')])[14]");
	    
	    private final By arReserves_xpath=By.xpath("//td[contains(text(),'AR Reserves')]");
	    private final By arReservesTotalvalue_xpath=By.xpath("(//td[contains(text(),' 0.00')])[15]");
	    
	    private final By totalCollateral_xpath=By.xpath("//td[contains(text(),'Total Collateral')]");
	    private final By totalCollateralTotalvalue_xpath=By.xpath("(//*[@id='child_']/td[3])[23]");
	    
	    
	    private final By totalReserve_xpath=By.xpath("//td[contains(text(),'Total Reserve')]");
	    private final By totalReserveTotalvalue_xpath=By.xpath("(//td[contains(text(),' 0.00')])[16]");
	    
	    
	    private final By totalAvailableForAdvance_xpath=By.xpath("//td[contains(text(),'Total Available For Advance')]");
	    private final By totalAvailableForAdvanceTotalvalue_xpath=By.xpath("(//*[@id='child_']/td[3])[25]");
	    
	    
	    private final By commitment_xpath=By.xpath("//td[contains(text(),'Commitment')]");
	    private final By commitmentTotalvalue_xpath=By.xpath("(//td[contains(text(),' 30,000.00')])[1]");
	    
	    
	    private final By lineLimitWithReserves_xpath=By.xpath("//td[contains(text(),'Line Limit with Reserves')]");
	    private final By lineLimitWithReservesTotalvalue_xpath=By.xpath("(//td[contains(text(),' 30,000.00')])[2]");
	    
	    
	    private final By beginningPriorBBC_xpath=By.xpath("//td[contains(text(),'Beginning - prior BBC')]");
	    private final By beginningPriorBBCTotalvalue_xpath=By.xpath("(//td[contains(text(),' 0.00')])[17]");
	    
	    
	    private final By disbursement_xpath=By.xpath("//td[contains(text(),'DISBURSEMENT')]");
	    private final By disbursementTotalvalue_xpath=By.xpath("(//td[contains(text(),' 0.00')])[18]");
	    
	    
	    private final By repayment_xpath=By.xpath("//td[contains(text(),'REPAYMENT')]");
	    private final By repaymentTotalvalue_xpath=By.xpath("(//td[contains(text(),' 0.00')])[19]");
	    
	    
	    private final By outstandingBalance_xpath=By.xpath("//td[contains(text(),'Outstanding Balance')]");
	    private final By outstandingBalanceTotalvalue_xpath=By.xpath("(//td[contains(text(),' 0.00')])[20]");
	    
	   
	    private final By borrowingBaseAvailability_xpath=By.xpath("//td[contains(text(),'BORROWING BASE AVAILABILITY')]");
	    private final By borrowingBaseAvailabilityTotalvalue_xpath=By.xpath("(//td[contains(text(),' 30,000.00')])[3]");
	    
	    
	    private final By netBorrowingBaseAvailable_xpath=By.xpath("//td[contains(text(),'NET BORROWING BASE AVAILABLE')]");
	    private final By netBorrowingBaseAvailableTotalvalue_xpath=By.xpath("(//*[@id='child_']/td[3])[40]");
	    
	    
	    private final By receivableRollforwardPlusIcon_xpath=By.xpath("(//i[@class='icon-plus'])[1]");
	    private final By ineligiblesPlusIcon_xpath=By.xpath("(//i[@class='icon-plus'])[2]");
	    
	    private final By priorBalanceTotalAccounts_xpath=By.xpath("//td[contains(text(),'Prior Balance - Total Accounts Receivable')]");
	    private final By priorBalanceTotalAccountsDiv1value_xpath=By.xpath("(//td[contains(text(),' 0.00')])[1]");
	    private final By priorBalanceTotalAccountsTotalvalue_xpath=By.xpath("(//td[contains(text(),' 0.00')])[2]");
	    
	    private final By newSalesAdditions_xpath=By.xpath("//td[contains(text(),'New Sales (Additions)')]");
	    private final By newSalesAdditionsDiv1value_xpath=By.xpath("(//td[contains(text(),' 119,400.00')])[1]");
	    private final By newSalesAdditionsTotalvalue_xpath=By.xpath("(//td[contains(text(),' 119,400.00')])[2]");
	    
	    
	    private final By newcredits_xpath=By.xpath("//td[contains(text(),'New Sales (Additions)')]");
	    private final By newcreditsDiv1value_xpath=By.xpath("(//td[contains(text(),' 0.00')])[3]");
	    private final By newcreditsTotalvalue_xpath=By.xpath("(//td[contains(text(),' 0.00')])[4]");
	    
	    private final By newCashCollected_xpath=By.xpath("//td[contains(text(),'New Cash Collected')]");
	    private final By newCashCollectedDiv1value_xpath=By.xpath("(//td[contains(text(),' 0.00')])[5]");
	    private final By newCashCollectedTotalvalue_xpath=By.xpath("(//td[contains(text(),' 0.00')])[6]");
	    
	    
	    private final By newAdjustments_xpath=By.xpath("//td[contains(text(),'New Adjustments')]");
	    private final By newAdjustmentsDiv1value_xpath=By.xpath("(//td[contains(text(),' 0.00')])[7]");
	    private final By newAdjustmentsTotalvalue_xpath=By.xpath("(//td[contains(text(),' 0.00')])[8]");
	    
	    
	    private final By bbcAdjustments_xpath=By.xpath("//td[contains(text(),'BBC Adjustment')]");
	    private final By bbcAdjustmentsDiv1value_xpath=By.xpath("(//td[contains(text(),' 0.00')])[9]");
	    private final By bbcAdjustmentsTotalvalue_xpath=By.xpath("(//td[contains(text(),' 0.00')])[10]");
	    
	    
	    private final By endingBalanceTotalAR_xpath=By.xpath("//td[contains(text(),'Ending Balance Total AR')]");
	    private final By endingBalanceTotalARDiv1value_xpath=By.xpath("(//td[contains(text(),' 119,400.00')])[3]");
	    private final By endingBalanceTotalARTotalvalue_xpath=By.xpath("(//td[contains(text(),' 119,400.00')])[4]");
	    
	    
	    private final By agedPastDueDays_xpath=By.xpath("//td[contains(text(),'Aged: Past Due Days')]");
	    private final By agedPastDueDaysDiv1value_xpath=By.xpath("(//td[contains(text(),' 33,400.00')])[1]");
	    private final By agedPastDueDaysTotalvalue_xpath=By.xpath("(//td[contains(text(),' 33,400.00')])[2]");
	    
	    
	    private final By deferredRevenue_xpath=By.xpath("//td[contains(text(),'Deferred Revenue')]");
	    private final By deferredRevenueDiv1value_xpath=By.xpath("(//td[contains(text(),' 1,000.00')])[5]");
	    private final By deferredRevenueTotalvalue_xpath=By.xpath("(//td[contains(text(),' 1,000.00')])[6]");
	    
	    
	    private final By concentration=By.xpath("//td[contains(text(),'Concentration %')]");
	    private final By concentrationDiv1value_xpath=By.xpath("(//td[contains(text(),' 37,180.00')])[1]");
	    private final By concentrationTotalvalue_xpath=By.xpath("(//td[contains(text(),' 37,180.00')])[2]");
	    private final By arAvailableForAdvanceTotalvalueData_xpath=By.xpath("(//*[@id='child_']/td[3])[18]");
	    private final By arAvailableForAdvanceField_xpath=By.xpath("//td[contains(text(),'A/R Available for Advance')]");;
	    
	    
	    
	    public BBCAvailabilityVerificationPage(WebDriver driver) {
		super(driver);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(!driver.findElement(BBCAvailabilityHeader_xpath).getText().trim().equals("BBC Availability")){
			throw new SkipException("Fund Request couldn't open.");
		}
	}
	 
	    
	    
	    public String BBCAvailabilitytHeader(String BBCAvailabilityHeader)
		{
		try{
			WebElement BBCAvailabilityHeaderWebEelement=new WebDriverWait(driver,200)
				.until(ExpectedConditions.visibilityOfElementLocated(BBCAvailabilityHeaderWebEelementHeader_xpath));
			BBCAvailabilityHeaderWebEelement.getText();
			
		}
		catch(Exception ex){
			
		}
		return BBCAvailabilityHeader;
		
		}
		 
	    
	    public boolean futureDiv1valueValidation(String expected){
			try {
				WebElement futureWebElement = new WebDriverWait(
						driver, 100)
						.until(ExpectedConditions
								.visibilityOfElementLocated(future_xpath));
				WebElement futureDiv1valueWebElement = new WebDriverWait(
						driver, 100)
						.until(ExpectedConditions
								.visibilityOfElementLocated(futureDiv1value_xpath));

				futureWebElement.isDisplayed();
				String actual = futureDiv1valueWebElement.getText().trim();
				if (actual.equals(expected))
					return true;
				else
					return false;

			} catch (Exception e) {
				return false;
			}
			
			}
	    
	    public boolean futureTotalvalueValidation(String expected){
			try {
				WebElement futureWebElement = new WebDriverWait(
						driver, 100)
						.until(ExpectedConditions
								.visibilityOfElementLocated(future_xpath));
				WebElement futureTotalvalueWebElement = new WebDriverWait(
						driver, 100)
						.until(ExpectedConditions
								.visibilityOfElementLocated(futureTotalvalue_xpath));

				futureWebElement.isDisplayed();
				String actual = futureTotalvalueWebElement.getText().trim();
				if (actual.equals(expected))
					return true;
				else
					return false;

			} catch (Exception e) {
				return false;
			}
				}
	    
	    
	    public boolean currentDiv1valueValidation(String expected){
			try {
				WebElement currentWebElement = new WebDriverWait(
						driver, 100)
						.until(ExpectedConditions
								.visibilityOfElementLocated(current_xpath));
				WebElement currentDiv1valueWebElement = new WebDriverWait(
						driver, 100)
						.until(ExpectedConditions
								.visibilityOfElementLocated(currentDiv1value_xpath));

				currentWebElement.isDisplayed();
				String actual = currentDiv1valueWebElement.getText().trim();
				if (actual.equals(expected))
					return true;
				else
					return false;

			} catch (Exception e) {
				return false;
			}
			
			}
	    
	    public boolean currentTotalvalueValidation(String expected){
			try {
				WebElement currentWebElement = new WebDriverWait(
						driver, 100)
						.until(ExpectedConditions
								.visibilityOfElementLocated(current_xpath));
				WebElement currentTotalvalueWebElement = new WebDriverWait(
						driver, 100)
						.until(ExpectedConditions
								.visibilityOfElementLocated(currentTotalvalue_xpath));

				currentWebElement.isDisplayed();
				String actual = currentTotalvalueWebElement.getText().trim();
				if (actual.equals(expected))
					return true;
				else
					return false;

			} catch (Exception e) {
				return false;
			}
				}
	    
	    
	    public boolean over30Div1valueValidation(String expected){
			try {
				WebElement currentWebElement = new WebDriverWait(
						driver, 100)
						.until(ExpectedConditions
								.visibilityOfElementLocated(over30_xpath));
				WebElement currentDiv1valueWebElement = new WebDriverWait(
						driver, 100)
						.until(ExpectedConditions
								.visibilityOfElementLocated(over30Div1value_xpath));

				currentWebElement.isDisplayed();
				String actual = currentDiv1valueWebElement.getText().trim();
				if (actual.equals(expected))
					return true;
				else
					return false;

			} catch (Exception e) {
				return false;
			}
			
			}
	    
	    public boolean over30TotalvalueValidation(String expected){
			try {
				WebElement currentWebElement = new WebDriverWait(
						driver, 100)
						.until(ExpectedConditions
								.visibilityOfElementLocated(over30_xpath));
				WebElement currentTotalvalueWebElement = new WebDriverWait(
						driver, 100)
						.until(ExpectedConditions
								.visibilityOfElementLocated(over30Totalvalue_xpath));

				currentWebElement.isDisplayed();
				String actual = currentTotalvalueWebElement.getText().trim();
				if (actual.equals(expected))
					return true;
				else
					return false;

			} catch (Exception e) {
				return false;
			}
				}
	    
	    
	    
	    public boolean over60Div1valueValidation(String expected){
			try {
				WebElement currentWebElement = new WebDriverWait(
						driver, 100)
						.until(ExpectedConditions
								.visibilityOfElementLocated(over60_xpath));
				WebElement currentDiv1valueWebElement = new WebDriverWait(
						driver, 100)
						.until(ExpectedConditions
								.visibilityOfElementLocated(over60Div1value_xpath));
				currentWebElement.isDisplayed();
				String actual = currentDiv1valueWebElement.getText().trim();
				if (actual.equals(expected))
					return true;
				else
					return false;
			} catch (Exception e) {
				return false;
			}
			
			}
	    
	    public boolean over60TotalvalueValidation(String expected){
			try {
				WebElement currentWebElement = new WebDriverWait(
						driver, 100)
						.until(ExpectedConditions
								.visibilityOfElementLocated(over60_xpath));
				WebElement currentTotalvalueWebElement = new WebDriverWait(
						driver, 100)
						.until(ExpectedConditions
								.visibilityOfElementLocated(over60Totalvalue_xpath));

				currentWebElement.isDisplayed();
				String actual = currentTotalvalueWebElement.getText().trim();
				if (actual.equals(expected))
					return true;
				else
					return false;

			} catch (Exception e) {
				return false;
			}
				}
	    
	    
	    public boolean over90Div1valueValidation(String expected){
			try {
				WebElement currentWebElement = new WebDriverWait(
						driver, 100)
						.until(ExpectedConditions
								.visibilityOfElementLocated(over90_xpath));
				WebElement currentDiv1valueWebElement = new WebDriverWait(
						driver, 100)
						.until(ExpectedConditions
								.visibilityOfElementLocated(over90Div1value_xpath));

				currentWebElement.isDisplayed();
				String actual = currentDiv1valueWebElement.getText().trim();
				if (actual.equals(expected))
					return true;
				else
					return false;

			} catch (Exception e) {
				return false;
			}
			
			}
	    
	    public boolean over90TotalvalueValidation(String expected){
			try {
				WebElement currentWebElement = new WebDriverWait(
						driver, 100)
						.until(ExpectedConditions
								.visibilityOfElementLocated(over90_xpath));
				WebElement currentTotalvalueWebElement = new WebDriverWait(
						driver, 100)
						.until(ExpectedConditions
								.visibilityOfElementLocated(over90Totalvalue_xpath));

				currentWebElement.isDisplayed();
				String actual = currentTotalvalueWebElement.getText().trim();
				if (actual.equals(expected))
					return true;
				else
					return false;

			} catch (Exception e) {
				return false;
			}
				}
	    
	    public boolean over120Div1valueValidation(String expected){
			try {
				WebElement currentWebElement = new WebDriverWait(
						driver, 100)
						.until(ExpectedConditions
								.visibilityOfElementLocated(over120_xpath));
				WebElement currentDiv1valueWebElement = new WebDriverWait(
						driver, 100)
						.until(ExpectedConditions
								.visibilityOfElementLocated(over120Div1value_xpath));

				currentWebElement.isDisplayed();
				String actual = currentDiv1valueWebElement.getText().trim();
				if (actual.equals(expected))
					return true;
				else
					return false;

			} catch (Exception e) {
				return false;
			}
			
			}
	    
	    public boolean over120TotalvalueValidation(String expected){
			try {
				WebElement currentWebElement = new WebDriverWait(
						driver, 100)
						.until(ExpectedConditions
								.visibilityOfElementLocated(over120_xpath));
				WebElement currentTotalvalueWebElement = new WebDriverWait(
						driver, 100)
						.until(ExpectedConditions
								.visibilityOfElementLocated(over120Totalvalue_xpath));

				currentWebElement.isDisplayed();
				String actual = currentTotalvalueWebElement.getText().trim();
				if (actual.equals(expected))
					return true;
				else
					return false;

			} catch (Exception e) {
				return false;
			}
				}
	    
	    
	    
	    public boolean totalAgedReceivablesDiv1valueValidation(String expected){
			try {
				WebElement currentWebElement = new WebDriverWait(
						driver, 100)
						.until(ExpectedConditions
								.visibilityOfElementLocated(totalAgedReceivables_xpath));
				WebElement currentDiv1valueWebElement = new WebDriverWait(
						driver, 100)
						.until(ExpectedConditions
								.visibilityOfElementLocated(totalAgedReceivablesDiv1value_xpath));

				currentWebElement.isDisplayed();
				String actual = currentDiv1valueWebElement.getText().trim();
				if (actual.equals(expected))
					return true;
				else
					return false;

			} catch (Exception e) {
				return false;
			}
			
			}
	    
	    public boolean totalAgedReceivablesTotalvalueValidation(String expected){
			try {
				WebElement currentWebElement = new WebDriverWait(
						driver, 100)
						.until(ExpectedConditions
								.visibilityOfElementLocated(totalAgedReceivables_xpath));
				WebElement currentTotalvalueWebElement = new WebDriverWait(
						driver, 100)
						.until(ExpectedConditions
								.visibilityOfElementLocated(totalAgedReceivablesTotalvalue_xpath));

				currentWebElement.isDisplayed();
				String actual = currentTotalvalueWebElement.getText().trim();
				if (actual.equals(expected))
					return true;
				else
					return false;

			} catch (Exception e) {
				return false;
			}
				}
	    
	    
	    public boolean ineligiblesDivvalueValidation(String expected){
			try {
				
				WebElement currentDiv1valueWebElement = new WebDriverWait(
						driver, 100)
						.until(ExpectedConditions
								.visibilityOfElementLocated(ineligiblesDiv1value_xpath));

				
				String actual = currentDiv1valueWebElement.getText().trim();
				if (actual.equals(expected))
					return true;
				else
					return false;

			} catch (Exception e) {
				return false;
			}
			
			}
	    
	    public boolean ineligiblesTotalvalueValidation(String expected){
			try {
				
				WebElement currentTotalvalueWebElement = new WebDriverWait(
						driver, 100)
						.until(ExpectedConditions
								.visibilityOfElementLocated(ineligiblesTotalvalue_xpath));

			
				String actual = currentTotalvalueWebElement.getText().trim();
				if (actual.equals(expected))
					return true;
				else
					return false;

			} catch (Exception e) {
				return false;
			}
				}
	    
	    
	    public boolean eligibleDivvalueValidation(String expected){
			try {
				WebElement currentWebElement = new WebDriverWait(
						driver, 100)
						.until(ExpectedConditions
								.visibilityOfElementLocated(eligibleAR_xpath));
				WebElement currentDiv1valueWebElement = new WebDriverWait(
						driver, 100)
						.until(ExpectedConditions
								.visibilityOfElementLocated(eligibleARDiv1value_xpath));

				currentWebElement.isDisplayed();
				String actual = currentDiv1valueWebElement.getText().trim();
				if (actual.equals(expected))
					return true;
				else
					return false;

			} catch (Exception e) {
				return false;
			}
			
			}
	    
	    public boolean eligiblesTotalvalueValidation(String expected){
			try {
				WebElement currentWebElement = new WebDriverWait(
						driver, 100)
						.until(ExpectedConditions
								.visibilityOfElementLocated(eligibleAR_xpath));
				WebElement currentTotalvalueWebElement = new WebDriverWait(
						driver, 100)
						.until(ExpectedConditions
								.visibilityOfElementLocated(eligibleARTotalvalue_xpath));

				currentWebElement.isDisplayed();
				String actual = currentTotalvalueWebElement.getText().trim();
				if (actual.equals(expected))
					return true;
				else
					return false;

			} catch (Exception e) {
				return false;
			}
				}
	    
	    
	    public boolean advanceRateDivvalueValidation(String expected){
			try {
				WebElement currentWebElement = new WebDriverWait(
						driver, 100)
						.until(ExpectedConditions
								.visibilityOfElementLocated(advanceRate_xpath));
				WebElement currentDiv1valueWebElement = new WebDriverWait(
						driver, 100)
						.until(ExpectedConditions
								.visibilityOfElementLocated(advanceRateDiv1value_xpath));

				currentWebElement.isDisplayed();
				String actual = currentDiv1valueWebElement.getText().trim();
				if (actual.equals(expected))
					return true;
				else
					return false;

			} catch (Exception e) {
				return false;
			}
			
			}
	    
	    
	    public boolean arBorrowingBaseDivvalueValidation(String expected){
			try {
				WebElement currentWebElement = new WebDriverWait(
						driver, 100)
						.until(ExpectedConditions
								.visibilityOfElementLocated(arBorrowingBase_xpath));
				WebElement currentDiv1valueWebElement = new WebDriverWait(
						driver, 100)
						.until(ExpectedConditions
								.visibilityOfElementLocated(arBorrowingBaseDiv1value_xpath));

				currentWebElement.isDisplayed();
				String actual = currentDiv1valueWebElement.getText().trim();
				if (actual.equals(expected))
					return true;
				else
					return false;

			} catch (Exception e) {
				return false;
			}
			
			}
	    
	    public boolean arBorrowingBaseTotalvalueValidation(String expected){
			try {
				WebElement currentWebElement = new WebDriverWait(
						driver, 100)
						.until(ExpectedConditions
								.visibilityOfElementLocated(arBorrowingBase_xpath));
				WebElement currentTotalvalueWebElement = new WebDriverWait(
						driver, 100)
						.until(ExpectedConditions
								.visibilityOfElementLocated(arBorrowingBaseTotalvalue_xpath));

				currentWebElement.isDisplayed();
				String actual = currentTotalvalueWebElement.getText().trim();
				if (actual.equals(expected))
					return true;
				else
					return false;

			} catch (Exception e) {
				return false;
			}
				}
	    
	    
	    public boolean arReceivablesSublimitDivvalueValidation(String expected){
			try {
				WebElement currentWebElement = new WebDriverWait(
						driver, 100)
						.until(ExpectedConditions
								.visibilityOfElementLocated(arReceivablesSublimit));
				WebElement currentDiv1valueWebElement = new WebDriverWait(
						driver, 100)
						.until(ExpectedConditions
								.visibilityOfElementLocated(arReceivablesSublimitDiv1value_xpath));

				currentWebElement.isDisplayed();
				String actual = currentDiv1valueWebElement.getText().trim();
				if (actual.equals(expected))
					return true;
				else
					return false;

			} catch (Exception e) {
				return false;
			}
			
			}
	    
	    
	    
	    public boolean arAvailableForAdvanceDivvalueValidation(String expected){
	 			try {
	 				WebElement currentWebElement = new WebDriverWait(
	 						driver, 100)
	 						.until(ExpectedConditions
	 								.visibilityOfElementLocated(arAvailableForAdvance_xpath));
	 				WebElement currentDiv1valueWebElement = new WebDriverWait(
	 						driver, 100)
	 						.until(ExpectedConditions
	 								.visibilityOfElementLocated(arAvailableForAdvanceDiv1value_xpath));

	 				currentWebElement.isDisplayed();
	 				String actual = currentDiv1valueWebElement.getText().trim();
	 				if (actual.equals(expected))
	 					return true;
	 				else
	 					return false;

	 			} catch (Exception e) {
	 				return false;
	 			}
	 			
	 			}
	 	    
	 	    public boolean arAvailableForAdvanceTotalvalueValidation(String expected){
	 			try {
	 				WebElement currentWebElement = new WebDriverWait(
	 						driver, 100)
	 						.until(ExpectedConditions
	 								.visibilityOfElementLocated(arAvailableForAdvance_xpath));
	 				WebElement currentTotalvalueWebElement = new WebDriverWait(
	 						driver, 100)
	 						.until(ExpectedConditions
	 								.visibilityOfElementLocated(arAvailableForAdvanceTotalvalue_xpath));

	 				currentWebElement.isDisplayed();
	 				String actual = currentTotalvalueWebElement.getText().trim();
	 				if (actual.equals(expected))
	 					return true;
	 				else
	 					return false;

	 			} catch (Exception e) {
	 				return false;
	 			}
	 				}
	 	    
	 	   public boolean arTotalSublimitTotalvalueValidation(String expected){
	 			try {
	 				WebElement currentWebElement = new WebDriverWait(
	 						driver, 100)
	 						.until(ExpectedConditions
	 								.visibilityOfElementLocated(arTotalSublimit_xpath));
	 				WebElement currentTotalvalueWebElement = new WebDriverWait(
	 						driver, 100)
	 						.until(ExpectedConditions
	 								.visibilityOfElementLocated(arTotalSublimitTotalvalue_xpath));

	 				currentWebElement.isDisplayed();
	 				String actual = currentTotalvalueWebElement.getText().trim();
	 				if (actual.equals(expected))
	 					return true;
	 				else
	 					return false;

	 			} catch (Exception e) {
	 				return false;
	 			}
	 				}
	 	   
	 	  public boolean arReservesTotalvalueValidation(String expected){
	 			try {
	 				WebElement currentWebElement = new WebDriverWait(
	 						driver, 100)
	 						.until(ExpectedConditions
	 								.visibilityOfElementLocated(arReserves_xpath));
	 				WebElement currentTotalvalueWebElement = new WebDriverWait(
	 						driver, 100)
	 						.until(ExpectedConditions
	 								.visibilityOfElementLocated(arReservesTotalvalue_xpath));

	 				currentWebElement.isDisplayed();
	 				String actual = currentTotalvalueWebElement.getText().trim();
	 				if (actual.equals(expected))
	 					return true;
	 				else
	 					return false;

	 			} catch (Exception e) {
	 				return false;
	 			}
	 				}
	 	  
	 	  
	 	 public boolean totalCollateralTotalvalueValidation(String expected){
	 			try {
	 				WebElement currentWebElement = new WebDriverWait(
	 						driver, 100)
	 						.until(ExpectedConditions
	 								.visibilityOfElementLocated(totalCollateral_xpath));
	 				WebElement currentTotalvalueWebElement = new WebDriverWait(
	 						driver, 100)
	 						.until(ExpectedConditions
	 								.visibilityOfElementLocated(totalCollateralTotalvalue_xpath));

	 				currentWebElement.isDisplayed();
	 				String actual = currentTotalvalueWebElement.getText().trim();
	 				if (actual.equals(expected))
	 					return true;
	 				else
	 					return false;

	 			} catch (Exception e) {
	 				return false;
	 			}
	 				}
	 	 
	 	 
	 	public boolean totalReserveTotalvalueValidation(String expected){
 			try {
 				WebElement currentWebElement = new WebDriverWait(
 						driver, 100)
 						.until(ExpectedConditions
 								.visibilityOfElementLocated(totalReserve_xpath));
 				WebElement currentTotalvalueWebElement = new WebDriverWait(
 						driver, 100)
 						.until(ExpectedConditions
 								.visibilityOfElementLocated(totalReserveTotalvalue_xpath));

 				currentWebElement.isDisplayed();
 				String actual = currentTotalvalueWebElement.getText().trim();
 				if (actual.equals(expected))
 					return true;
 				else
 					return false;

 			} catch (Exception e) {
 				return false;
 			}
 				}
	 	
	 	
	 	
	 	
	 	public boolean totalAvailableForAdvanceTotalvalueValidation(String expected){
 			try {
 				WebElement currentWebElement = new WebDriverWait(
 						driver, 100)
 						.until(ExpectedConditions
 								.visibilityOfElementLocated(totalAvailableForAdvance_xpath));
 				WebElement currentTotalvalueWebElement = new WebDriverWait(
 						driver, 100)
 						.until(ExpectedConditions
 								.visibilityOfElementLocated(totalAvailableForAdvanceTotalvalue_xpath));

 				currentWebElement.isDisplayed();
 				String actual = currentTotalvalueWebElement.getText().trim();
 				if (actual.equals(expected))
 					return true;
 				else
 					return false;

 			} catch (Exception e) {
 				return false;
 			}
 				}
	    
	 	
	 	
	    
	 	public boolean commitmentTotalvalueValidation(String expected){
 			try {
 				WebElement currentWebElement = new WebDriverWait(
 						driver, 100)
 						.until(ExpectedConditions
 								.visibilityOfElementLocated(commitment_xpath));
 				WebElement currentTotalvalueWebElement = new WebDriverWait(
 						driver, 100)
 						.until(ExpectedConditions
 								.visibilityOfElementLocated(commitmentTotalvalue_xpath));

 				currentWebElement.isDisplayed();
 				String actual = currentTotalvalueWebElement.getText().trim();
 				if (actual.equals(expected))
 					return true;
 				else
 					return false;

 			} catch (Exception e) {
 				return false;
 			}
 				}
	 	
	 	
	 	public boolean lineLimitWithReservesTotalvalueValidation(String expected){
 			try {
 				WebElement currentWebElement = new WebDriverWait(
 						driver, 100)
 						.until(ExpectedConditions
 								.visibilityOfElementLocated(lineLimitWithReserves_xpath));
 				WebElement currentTotalvalueWebElement = new WebDriverWait(
 						driver, 100)
 						.until(ExpectedConditions
 								.visibilityOfElementLocated(lineLimitWithReservesTotalvalue_xpath));

 				currentWebElement.isDisplayed();
 				String actual = currentTotalvalueWebElement.getText().trim();
 				if (actual.equals(expected))
 					return true;
 				else
 					return false;

 			} catch (Exception e) {
 				return false;
 			}
 				}
	 	
	 	
	 	public boolean beginningPriorBBCTotalvalueValidation(String expected){
 			try {
 				WebElement currentWebElement = new WebDriverWait(
 						driver, 100)
 						.until(ExpectedConditions
 								.visibilityOfElementLocated(beginningPriorBBC_xpath));
 				WebElement currentTotalvalueWebElement = new WebDriverWait(
 						driver, 100)
 						.until(ExpectedConditions
 								.visibilityOfElementLocated(beginningPriorBBCTotalvalue_xpath));

 				currentWebElement.isDisplayed();
 				String actual = currentTotalvalueWebElement.getText().trim();
 				if (actual.equals(expected))
 					return true;
 				else
 					return false;

 			} catch (Exception e) {
 				return false;
 			}
 				}
	 	
	 	
	 	public boolean disbursementTotalvalueValidation(String expected){
 			try {
 				WebElement currentWebElement = new WebDriverWait(
 						driver, 100)
 						.until(ExpectedConditions
 								.visibilityOfElementLocated(disbursement_xpath));
 				WebElement currentTotalvalueWebElement = new WebDriverWait(
 						driver, 100)
 						.until(ExpectedConditions
 								.visibilityOfElementLocated(disbursementTotalvalue_xpath));

 				currentWebElement.isDisplayed();
 				String actual = currentTotalvalueWebElement.getText().trim();
 				if (actual.equals(expected))
 					return true;
 				else
 					return false;

 			} catch (Exception e) {
 				return false;
 			}
 				}
	 	
	 	
	 	
	 	public boolean repaymentTotalvalueValidation(String expected){
 			try {
 				WebElement currentWebElement = new WebDriverWait(
 						driver, 100)
 						.until(ExpectedConditions
 								.visibilityOfElementLocated(repayment_xpath));
 				WebElement currentTotalvalueWebElement = new WebDriverWait(
 						driver, 100)
 						.until(ExpectedConditions
 								.visibilityOfElementLocated(repaymentTotalvalue_xpath));

 				currentWebElement.isDisplayed();
 				String actual = currentTotalvalueWebElement.getText().trim();
 				if (actual.equals(expected))
 					return true;
 				else
 					return false;

 			} catch (Exception e) {
 				return false;
 			}
 				}
	 	
	 	
	 	
	 	
	 	public boolean outstandingBalanceTotalvalueValidation(String expected){
 			try {
 				WebElement currentWebElement = new WebDriverWait(
 						driver, 100)
 						.until(ExpectedConditions
 								.visibilityOfElementLocated(outstandingBalance_xpath));
 				WebElement currentTotalvalueWebElement = new WebDriverWait(
 						driver, 100)
 						.until(ExpectedConditions
 								.visibilityOfElementLocated(outstandingBalanceTotalvalue_xpath));

 				currentWebElement.isDisplayed();
 				String actual = currentTotalvalueWebElement.getText().trim();
 				if (actual.equals(expected))
 					return true;
 				else
 					return false;

 			} catch (Exception e) {
 				return false;
 			}
 				}
	 	
	 	
	 	
	 	public boolean borrowingBaseAvailabilityTotalvalueValidation(String expected){
 			try {
 				WebElement currentWebElement = new WebDriverWait(
 						driver, 100)
 						.until(ExpectedConditions
 								.visibilityOfElementLocated(borrowingBaseAvailability_xpath));
 				WebElement currentTotalvalueWebElement = new WebDriverWait(
 						driver, 100)
 						.until(ExpectedConditions
 								.visibilityOfElementLocated(borrowingBaseAvailabilityTotalvalue_xpath));

 				currentWebElement.isDisplayed();
 				String actual = currentTotalvalueWebElement.getText().trim();
 				if (actual.equals(expected))
 					return true;
 				else
 					return false;

 			} catch (Exception e) {
 				return false;
 			}
 				}
	 	
	 	
	 	
	 	public boolean netBorrowingBaseAvailableTotalvalueValidation(String expected){
 			try {
 				WebElement currentWebElement = new WebDriverWait(
 						driver, 100)
 						.until(ExpectedConditions
 								.visibilityOfElementLocated(netBorrowingBaseAvailable_xpath));
 				WebElement currentTotalvalueWebElement = new WebDriverWait(
 						driver, 100)
 						.until(ExpectedConditions
 								.visibilityOfElementLocated(netBorrowingBaseAvailableTotalvalue_xpath));

 				currentWebElement.isDisplayed();
 				String actual = currentTotalvalueWebElement.getText().trim();
 				if (actual.equals(expected))
 					return true;
 				else
 					return false;

 			} catch (Exception e) {
 				return false;
 			}
 				}
	 	
	 	
	 	
	 	
	 	public boolean priorBalanceTotalAccountsDivvalueValidation(String expected){
			try {
				WebElement receivableRollforwardPlusIconWebElement = new WebDriverWait(
						driver, 100)
						.until(ExpectedConditions
								.visibilityOfElementLocated(receivableRollforwardPlusIcon_xpath));
				receivableRollforwardPlusIconWebElement.click();
				WebElement currentWebElement = new WebDriverWait(
						driver, 100)
						.until(ExpectedConditions
								.visibilityOfElementLocated(priorBalanceTotalAccounts_xpath));
				WebElement currentDiv1valueWebElement = new WebDriverWait(
						driver, 100)
						.until(ExpectedConditions
								.visibilityOfElementLocated(priorBalanceTotalAccountsDiv1value_xpath));

				currentWebElement.isDisplayed();
				String actual = currentDiv1valueWebElement.getText().trim();
				if (actual.equals(expected))
					return true;
				else
					return false;

			} catch (Exception e) {
				return false;
			}
			
			}
	    
	    public boolean priorBalanceTotalAccountsTotalvalueValidation(String expected){
			try {
				WebElement receivableRollforwardPlusIconWebElement = new WebDriverWait(
					driver, 100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(receivableRollforwardPlusIcon_xpath));
			receivableRollforwardPlusIconWebElement.click();
				WebElement currentWebElement = new WebDriverWait(
						driver, 100)
						.until(ExpectedConditions
								.visibilityOfElementLocated(arBorrowingBase_xpath));
				WebElement currentTotalvalueWebElement = new WebDriverWait(
						driver, 100)
						.until(ExpectedConditions
								.visibilityOfElementLocated(arBorrowingBaseTotalvalue_xpath));

				currentWebElement.isDisplayed();
				String actual = currentTotalvalueWebElement.getText().trim();
				if (actual.equals(expected))
					return true;
				else
					return false;

			} catch (Exception e) {
				return false;
			}
				}
	    
	    
	    public boolean newSalesAdditionsDivvalueValidation(String expected){
			try {
				WebElement receivableRollforwardPlusIconWebElement = new WebDriverWait(
						driver, 100)
						.until(ExpectedConditions
								.visibilityOfElementLocated(receivableRollforwardPlusIcon_xpath));
				receivableRollforwardPlusIconWebElement.click();
				WebElement currentWebElement = new WebDriverWait(
						driver, 100)
						.until(ExpectedConditions
								.visibilityOfElementLocated(newSalesAdditions_xpath));
				WebElement currentDiv1valueWebElement = new WebDriverWait(
						driver, 100)
						.until(ExpectedConditions
								.visibilityOfElementLocated(newSalesAdditionsDiv1value_xpath));

				currentWebElement.isDisplayed();
				String actual = currentDiv1valueWebElement.getText().trim();
				if (actual.equals(expected))
					return true;
				else
					return false;

			} catch (Exception e) {
				return false;
			}
			
			}
	    
	    public boolean newSalesAdditionsTotalvalueValidation(String expected){
			try {
				WebElement receivableRollforwardPlusIconWebElement = new WebDriverWait(
					driver, 100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(receivableRollforwardPlusIcon_xpath));
			receivableRollforwardPlusIconWebElement.click();
				WebElement currentWebElement = new WebDriverWait(
						driver, 100)
						.until(ExpectedConditions
								.visibilityOfElementLocated(newSalesAdditions_xpath));
				WebElement currentTotalvalueWebElement = new WebDriverWait(
						driver, 100)
						.until(ExpectedConditions
								.visibilityOfElementLocated(newSalesAdditionsTotalvalue_xpath));

				currentWebElement.isDisplayed();
				String actual = currentTotalvalueWebElement.getText().trim();
				if (actual.equals(expected))
					return true;
				else
					return false;

			} catch (Exception e) {
				return false;
			}
				}
	    
	    
	    public boolean newcreditsDivvalueValidation(String expected){
			try {
				WebElement receivableRollforwardPlusIconWebElement = new WebDriverWait(
						driver, 100)
						.until(ExpectedConditions
								.visibilityOfElementLocated(receivableRollforwardPlusIcon_xpath));
				receivableRollforwardPlusIconWebElement.click();
				WebElement currentWebElement = new WebDriverWait(
						driver, 100)
						.until(ExpectedConditions
								.visibilityOfElementLocated(newcredits_xpath));
				WebElement currentDiv1valueWebElement = new WebDriverWait(
						driver, 100)
						.until(ExpectedConditions
								.visibilityOfElementLocated(newcreditsDiv1value_xpath));

				currentWebElement.isDisplayed();
				String actual = currentDiv1valueWebElement.getText().trim();
				if (actual.equals(expected))
					return true;
				else
					return false;

			} catch (Exception e) {
				return false;
			}
			
			}
	    
	    public boolean newcreditsTotalvalueValidation(String expected){
			try {
				WebElement receivableRollforwardPlusIconWebElement = new WebDriverWait(
					driver, 100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(receivableRollforwardPlusIcon_xpath));
			receivableRollforwardPlusIconWebElement.click();
				WebElement currentWebElement = new WebDriverWait(
						driver, 100)
						.until(ExpectedConditions
								.visibilityOfElementLocated(newcredits_xpath));
				WebElement currentTotalvalueWebElement = new WebDriverWait(
						driver, 100)
						.until(ExpectedConditions
								.visibilityOfElementLocated(newcreditsTotalvalue_xpath));

				currentWebElement.isDisplayed();
				String actual = currentTotalvalueWebElement.getText().trim();
				if (actual.equals(expected))
					return true;
				else
					return false;

			} catch (Exception e) {
				return false;
			}
				}
	    
	    
	    
	    public boolean newCashCollectedDivvalueValidation(String expected){
			try {
				WebElement receivableRollforwardPlusIconWebElement = new WebDriverWait(
						driver, 100)
						.until(ExpectedConditions
								.visibilityOfElementLocated(receivableRollforwardPlusIcon_xpath));
				receivableRollforwardPlusIconWebElement.click();
				WebElement currentWebElement = new WebDriverWait(
						driver, 100)
						.until(ExpectedConditions
								.visibilityOfElementLocated(newCashCollected_xpath));
				WebElement currentDiv1valueWebElement = new WebDriverWait(
						driver, 100)
						.until(ExpectedConditions
								.visibilityOfElementLocated(newCashCollectedDiv1value_xpath));

				currentWebElement.isDisplayed();
				String actual = currentDiv1valueWebElement.getText().trim();
				if (actual.equals(expected))
					return true;
				else
					return false;

			} catch (Exception e) {
				return false;
			}
			
			}
	    
	    public boolean newCashCollectedTotalvalueValidation(String expected){
			try {
				WebElement receivableRollforwardPlusIconWebElement = new WebDriverWait(
					driver, 100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(receivableRollforwardPlusIcon_xpath));
			receivableRollforwardPlusIconWebElement.click();
				WebElement currentWebElement = new WebDriverWait(
						driver, 100)
						.until(ExpectedConditions
								.visibilityOfElementLocated(newCashCollected_xpath));
				WebElement currentTotalvalueWebElement = new WebDriverWait(
						driver, 100)
						.until(ExpectedConditions
								.visibilityOfElementLocated(newCashCollectedTotalvalue_xpath));

				currentWebElement.isDisplayed();
				String actual = currentTotalvalueWebElement.getText().trim();
				if (actual.equals(expected))
					return true;
				else
					return false;

			} catch (Exception e) {
				return false;
			}
				}
	    
	    
	    
	    public boolean newAdjustmentsDivvalueValidation(String expected){
			try {
				WebElement receivableRollforwardPlusIconWebElement = new WebDriverWait(
						driver, 100)
						.until(ExpectedConditions
								.visibilityOfElementLocated(receivableRollforwardPlusIcon_xpath));
				receivableRollforwardPlusIconWebElement.click();
				WebElement currentWebElement = new WebDriverWait(
						driver, 100)
						.until(ExpectedConditions
								.visibilityOfElementLocated(newAdjustments_xpath));
				WebElement currentDiv1valueWebElement = new WebDriverWait(
						driver, 100)
						.until(ExpectedConditions
								.visibilityOfElementLocated(newAdjustmentsDiv1value_xpath));

				currentWebElement.isDisplayed();
				String actual = currentDiv1valueWebElement.getText().trim();
				if (actual.equals(expected))
					return true;
				else
					return false;

			} catch (Exception e) {
				return false;
			}
			
			}
	    
	    public boolean newAdjustmentsTotalvalueValidation(String expected){
			try {
				WebElement receivableRollforwardPlusIconWebElement = new WebDriverWait(
					driver, 100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(receivableRollforwardPlusIcon_xpath));
			receivableRollforwardPlusIconWebElement.click();
				WebElement currentWebElement = new WebDriverWait(
						driver, 100)
						.until(ExpectedConditions
								.visibilityOfElementLocated(newAdjustments_xpath));
				WebElement currentTotalvalueWebElement = new WebDriverWait(
						driver, 100)
						.until(ExpectedConditions
								.visibilityOfElementLocated(newAdjustmentsTotalvalue_xpath));

				currentWebElement.isDisplayed();
				String actual = currentTotalvalueWebElement.getText().trim();
				if (actual.equals(expected))
					return true;
				else
					return false;

			} catch (Exception e) {
				return false;
			}
				}
	    
	    public boolean bbcAdjustmentsDivvalueValidation(String expected){
			try {
				WebElement receivableRollforwardPlusIconWebElement = new WebDriverWait(
						driver, 100)
						.until(ExpectedConditions
								.visibilityOfElementLocated(receivableRollforwardPlusIcon_xpath));
				receivableRollforwardPlusIconWebElement.click();
				WebElement currentWebElement = new WebDriverWait(
						driver, 100)
						.until(ExpectedConditions
								.visibilityOfElementLocated(bbcAdjustments_xpath));
				WebElement currentDiv1valueWebElement = new WebDriverWait(
						driver, 100)
						.until(ExpectedConditions
								.visibilityOfElementLocated(bbcAdjustmentsDiv1value_xpath));

				currentWebElement.isDisplayed();
				String actual = currentDiv1valueWebElement.getText().trim();
				if (actual.equals(expected))
					return true;
				else
					return false;

			} catch (Exception e) {
				return false;
			}
			
			}
	    
	    public boolean bbcAdjustmentsTotalvalueValidation(String expected){
			try {
				WebElement receivableRollforwardPlusIconWebElement = new WebDriverWait(
					driver, 100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(receivableRollforwardPlusIcon_xpath));
			receivableRollforwardPlusIconWebElement.click();
				WebElement currentWebElement = new WebDriverWait(
						driver, 100)
						.until(ExpectedConditions
								.visibilityOfElementLocated(bbcAdjustments_xpath));
				WebElement currentTotalvalueWebElement = new WebDriverWait(
						driver, 100)
						.until(ExpectedConditions
								.visibilityOfElementLocated(bbcAdjustmentsTotalvalue_xpath));

				currentWebElement.isDisplayed();
				String actual = currentTotalvalueWebElement.getText().trim();
				if (actual.equals(expected))
					return true;
				else
					return false;

			} catch (Exception e) {
				return false;
			}
				}
	 	
	    
	    
	    public boolean endingBalanceTotalARDivvalueValidation(String expected){
			try {
				WebElement receivableRollforwardPlusIconWebElement = new WebDriverWait(
						driver, 100)
						.until(ExpectedConditions
								.visibilityOfElementLocated(receivableRollforwardPlusIcon_xpath));
				receivableRollforwardPlusIconWebElement.click();
				WebElement currentWebElement = new WebDriverWait(
						driver, 100)
						.until(ExpectedConditions
								.visibilityOfElementLocated(endingBalanceTotalAR_xpath));
				WebElement currentDiv1valueWebElement = new WebDriverWait(
						driver, 100)
						.until(ExpectedConditions
								.visibilityOfElementLocated(endingBalanceTotalARDiv1value_xpath));

				currentWebElement.isDisplayed();
				String actual = currentDiv1valueWebElement.getText().trim();
				if (actual.equals(expected))
					return true;
				else
					return false;

			} catch (Exception e) {
				return false;
			}
			
			}
	    
	    public boolean endingBalanceTotalARTotalvalueValidation(String expected){
			try {
				WebElement receivableRollforwardPlusIconWebElement = new WebDriverWait(
					driver, 100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(receivableRollforwardPlusIcon_xpath));
			receivableRollforwardPlusIconWebElement.click();
				WebElement currentWebElement = new WebDriverWait(
						driver, 100)
						.until(ExpectedConditions
								.visibilityOfElementLocated(endingBalanceTotalAR_xpath));
				WebElement currentTotalvalueWebElement = new WebDriverWait(
						driver, 100)
						.until(ExpectedConditions
								.visibilityOfElementLocated(endingBalanceTotalARTotalvalue_xpath));

				currentWebElement.isDisplayed();
				String actual = currentTotalvalueWebElement.getText().trim();
				if (actual.equals(expected))
					return true;
				else
					return false;

			} catch (Exception e) {
				return false;
			}
				}
	    
	    
	    public boolean agedPastDueDaysDivvalueValidation(String expected){
			try {
				WebElement ineligiblesPlusIconWebElement = new WebDriverWait(
						driver, 100)
						.until(ExpectedConditions
								.visibilityOfElementLocated(ineligiblesPlusIcon_xpath));
				ineligiblesPlusIconWebElement.click();
				WebElement currentWebElement = new WebDriverWait(
						driver, 100)
						.until(ExpectedConditions
								.visibilityOfElementLocated(agedPastDueDays_xpath));
				WebElement currentDiv1valueWebElement = new WebDriverWait(
						driver, 100)
						.until(ExpectedConditions
								.visibilityOfElementLocated(agedPastDueDaysDiv1value_xpath));

				currentWebElement.isDisplayed();
				String actual = currentDiv1valueWebElement.getText().trim();
				if (actual.equals(expected))
					return true;
				else
					return false;

			} catch (Exception e) {
				return false;
			}
			
			}
	    
	    public boolean agedPastDueDaysTotalvalueValidation(String expected){
			try {
				WebElement ineligiblesPlusIconWebElement = new WebDriverWait(
					driver, 100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(ineligiblesPlusIcon_xpath));
				ineligiblesPlusIconWebElement.click();
				WebElement currentWebElement = new WebDriverWait(
						driver, 100)
						.until(ExpectedConditions
								.visibilityOfElementLocated(agedPastDueDays_xpath));
				WebElement currentTotalvalueWebElement = new WebDriverWait(
						driver, 100)
						.until(ExpectedConditions
								.visibilityOfElementLocated(agedPastDueDaysTotalvalue_xpath));

				currentWebElement.isDisplayed();
				String actual = currentTotalvalueWebElement.getText().trim();
				if (actual.equals(expected))
					return true;
				else
					return false;

			} catch (Exception e) {
				return false;
			}
				}
	    
	    public boolean deferredRevenueDivvalueValidation(String expected){
			try {
				WebElement ineligiblesPlusIconWebElement = new WebDriverWait(
						driver, 100)
						.until(ExpectedConditions
								.visibilityOfElementLocated(ineligiblesPlusIcon_xpath));
				ineligiblesPlusIconWebElement.click();
				WebElement currentWebElement = new WebDriverWait(
						driver, 100)
						.until(ExpectedConditions
								.visibilityOfElementLocated(deferredRevenue_xpath));
				WebElement currentDiv1valueWebElement = new WebDriverWait(
						driver, 100)
						.until(ExpectedConditions
								.visibilityOfElementLocated(deferredRevenueDiv1value_xpath));

				currentWebElement.isDisplayed();
				String actual = currentDiv1valueWebElement.getText().trim();
				if (actual.equals(expected))
					return true;
				else
					return false;

			} catch (Exception e) {
				return false;
			}
			
			}
	    
	    public boolean deferredRevenueTotalvalueValidation(String expected){
			try {
				WebElement ineligiblesPlusIconWebElement = new WebDriverWait(
					driver, 100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(ineligiblesPlusIcon_xpath));
				ineligiblesPlusIconWebElement.click();
				WebElement currentWebElement = new WebDriverWait(
						driver, 100)
						.until(ExpectedConditions
								.visibilityOfElementLocated(deferredRevenueDiv1value_xpath));
				WebElement currentTotalvalueWebElement = new WebDriverWait(
						driver, 100)
						.until(ExpectedConditions
								.visibilityOfElementLocated(deferredRevenueTotalvalue_xpath));

				currentWebElement.isDisplayed();
				String actual = currentTotalvalueWebElement.getText().trim();
				if (actual.equals(expected))
					return true;
				else
					return false;

			} catch (Exception e) {
				return false;
			}
				}

	    public boolean concentrationDivvalueValidation(String expected){
			try {
				WebElement ineligiblesPlusIconWebElement = new WebDriverWait(
						driver, 100)
						.until(ExpectedConditions
								.visibilityOfElementLocated(ineligiblesPlusIcon_xpath));
				ineligiblesPlusIconWebElement.click();
				WebElement currentWebElement = new WebDriverWait(
						driver, 100)
						.until(ExpectedConditions
								.visibilityOfElementLocated(concentration));
				WebElement currentDiv1valueWebElement = new WebDriverWait(
						driver, 100)
						.until(ExpectedConditions
								.visibilityOfElementLocated(concentrationDiv1value_xpath));

				currentWebElement.isDisplayed();
				String actual = currentDiv1valueWebElement.getText().trim();
				if (actual.equals(expected))
					return true;
				else
					return false;

			} catch (Exception e) {
				return false;
			}
			
			}
	    
	    public boolean concentrationTotalvalueValidation(String expected){
			try {
				WebElement ineligiblesPlusIconWebElement = new WebDriverWait(
					driver, 100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(ineligiblesPlusIcon_xpath));
				ineligiblesPlusIconWebElement.click();
				WebElement currentWebElement = new WebDriverWait(
						driver, 100)
						.until(ExpectedConditions
								.visibilityOfElementLocated(concentration));
				WebElement currentTotalvalueWebElement = new WebDriverWait(
						driver, 100)
						.until(ExpectedConditions
								.visibilityOfElementLocated(concentrationTotalvalue_xpath));

				currentWebElement.isDisplayed();
				String actual = currentTotalvalueWebElement.getText().trim();
				if (actual.equals(expected))
					return true;
				else
					return false;

			} catch (Exception e) {
				return false;
			}
				}
	    
	    public boolean fundRequestedAmount()
		{
		try{
			WebElement fundRequestedAmountWebEelement=new WebDriverWait(driver,30)
				.until(ExpectedConditions.visibilityOfElementLocated(fundRequestedAmount_xpath));
			fundRequestedAmountWebEelement.isDisplayed();
			return true;
		}
		catch(Exception ex){
			return false;
		}
		}
	    
	    
	    public boolean netBorrowingBaseAmount()
		{
		try{
			WebElement  netBorrowingBaseWebEelement=new WebDriverWait(driver,30)
				.until(ExpectedConditions.visibilityOfElementLocated(netBorrowingBaseAmount_xpath));
			netBorrowingBaseWebEelement.isDisplayed();
			return true;
		}
		catch(Exception ex){
			return false;
		}
		}

	    public boolean ApproveBBCButtonVerify()
		{
		try{
			WebElement  netBorrowingBaseWebEelement=new WebDriverWait(driver,30)
				.until(ExpectedConditions.visibilityOfElementLocated(ApproveBBCButton_xpath));
			netBorrowingBaseWebEelement.isDisplayed();
			return true;
		}
		catch(Exception ex){
			return false;
		}
		}
	    

	    public boolean SendToApproverButtonVerify()
		{
		try{
			WebElement  netBorrowingBaseWebEelement=new WebDriverWait(driver,30)
				.until(ExpectedConditions.visibilityOfElementLocated(SendToApproverButton_xpath));
			netBorrowingBaseWebEelement.isDisplayed();
			return true;
		}
		catch(Exception ex){
			return false;
		}
		}
	    
	    
	    public boolean BBCPrintButtonVerify()
		{
		try{
			WebElement  netBorrowingBaseWebEelement=new WebDriverWait(driver,30)
				.until(ExpectedConditions.visibilityOfElementLocated(BBCPrintButton_xpath));
			netBorrowingBaseWebEelement.isDisplayed();
			return true;
		}
		catch(Exception ex){
			return false;
		}
		}
	    
	    public boolean SkipBBCButtonVerify()
		{
		try{
			WebElement  netBorrowingBaseWebEelement=new WebDriverWait(driver,30)
				.until(ExpectedConditions.visibilityOfElementLocated(SkipBBCButton_xpath));
			netBorrowingBaseWebEelement.isDisplayed();
			return true;
		}
		catch(Exception ex){
			return false;
		}
		}
	    
	    public SignBBCPage ApproveBBCButtonClick()
		{
		try{
			WebElement  netBorrowingBaseWebEelement=new WebDriverWait(driver,30)
				.until(ExpectedConditions.visibilityOfElementLocated(ApproveBBCButton_xpath));
			netBorrowingBaseWebEelement.click();
			return new SignBBCPage(driver);
		}
		catch(Exception ex){
		
		}
		return null;
		}
	    
	    
	    public boolean arAvailableForAdvanceTotalvalueValidationSummary(String expected){
			try {
				
				
				WebElement currentWebElement = new WebDriverWait(
						driver, 100)
						.until(ExpectedConditions
								.visibilityOfElementLocated(arAvailableForAdvanceField_xpath));
				WebElement currentTotalvalueWebElement = new WebDriverWait(
						driver, 100)
						.until(ExpectedConditions
								.visibilityOfElementLocated(arAvailableForAdvanceTotalvalueData_xpath));

				currentWebElement.isDisplayed();
				String actual = currentTotalvalueWebElement.getText().trim();
				if (actual.equals(expected))
					return true;
				else
					return false;

			} catch (Exception e) {
				return false;
			}
				}
	    
}
