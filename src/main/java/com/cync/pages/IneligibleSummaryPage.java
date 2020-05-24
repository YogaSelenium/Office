package com.cync.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.SkipException;

import com.cync.base.BasePage;

public class IneligibleSummaryPage extends BasePage{
	private final By ineligibleSummary_xpath=By.xpath("(//span[@class='paneltitle'])[1]");
	private final By bbcDate_xpath=By.xpath("(//div[@class='controls']//label[3])[1]");
	private final By agedPastDueDays_xpath=By.xpath("//td[text()='Aged: Past Due Days']");
	private final By deferredRevenue_xpath=By.xpath("//td[text()='Deferred Revenue']");
	private final By concentrationPct_xpath=By.xpath("//td[text()='Concentration %']");
	private final By totals_xpath=By.xpath("(//td[text()='Totals'])[1]");
	private final By agedPastDueDaysAmount_xpath=By.xpath("(//td[@aria-describedby='ineligible_summaries_list_ineligible_amount'])[1]");
	private final By deferredRevenueAmount_xpath=By.xpath("(//td[@aria-describedby='ineligible_summaries_list_ineligible_amount'])[2]");
	private final By concentrationPctAmount_xpath=By.xpath("(//td[@aria-describedby='ineligible_summaries_list_ineligible_amount'])[3]");
	private final By totalAmount_xpath=By.xpath("(//td[@aria-describedby='ineligible_summaries_list_ineligible_amount'])[4]");
	private final By eomTotal_xpath=By.xpath("//td[text()=' EOM Totals']");
	private final By eligibleAccountsReceivables_xpath=By.xpath("//td[text()=' Eligible Accounts Receivables']");
	private final By accountsReceivablesCollateral_xpath=By.xpath("//td[text()=' Accounts Receivables Collateral']");
	private final By eomTotalAmount_xpath=By.xpath("//td[text()=' 119,400.00 ']");
	private final By eligibleAccountsReceivablesAmount_xpath=By.xpath("//td[text()=' 47,820.00 ']");
	private final By accountsReceivablesCollateralAmount_xpath=By.xpath("//td[text()=' 38,256.00 ']");
	
	private final By concentrationIneligbleSummary_xpath=By.xpath("//td[text()='Concentration %']");
	private final By concentrationIneligbleSummaryValue_xpath =By.xpath("(//td[text()='21,925.00'])[1]");
	
	
	public IneligibleSummaryPage(WebDriver driver) {
		super(driver);

		try {
			Thread.sleep(1000);
		} catch (Exception e) {

			e.printStackTrace();
		}
		if (!driver.findElement(ineligibleSummary_xpath).getText().trim()
				.equals("Ineligible Summary")) {
			throw new SkipException("Ineligible Summary couldn't open.");
		}
	}
	public boolean bbcDateValidation(String expected){
		try {
			WebElement BBCDateWebElement = new WebDriverWait(
					driver, 100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(bbcDate_xpath));
			
			String actual = BBCDateWebElement.getText().trim();
			if (actual.equals(expected))
				return true;
			else
				return false;

		} catch (Exception e) {
			return false;
		}
	}
	public boolean verifyAgedPastDueAmount(String expected) {
		try {
			WebElement agedPastDueDayAmountWebElement = new WebDriverWait(
					driver, 100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(agedPastDueDaysAmount_xpath));
			WebElement agedPastDueDaysWebElement = new WebDriverWait(
					driver, 100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(agedPastDueDays_xpath));

			agedPastDueDaysWebElement.isDisplayed();
			String actual = agedPastDueDayAmountWebElement.getText();
			if (actual.equals(expected))
				return true;
			else
				return false;

		} catch (Exception e) {
			return false;
		}
	}
	public boolean verifyDeferredRevenueAmount(String expected) {
		try {
			WebElement DeferredRevenueAmountWebElement = new WebDriverWait(
					driver, 100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(deferredRevenueAmount_xpath));
			WebElement DeferredRevenueWebElement = new WebDriverWait(
					driver, 100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(deferredRevenue_xpath));

			DeferredRevenueWebElement.isDisplayed();
			String actual = DeferredRevenueAmountWebElement.getText();
			if (actual.equals(expected))
				return true;
			else
				return false;

		} catch (Exception e) {
			return false;
		}
	}
	public boolean verifyConcentrationAmount(String expected) {
		try {
			WebElement concentrationAmountWebElement = new WebDriverWait(
					driver, 100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(concentrationPctAmount_xpath));
			WebElement concentrationWebElement = new WebDriverWait(
					driver, 100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(concentrationPct_xpath));

			concentrationWebElement.isDisplayed();
			String actual = concentrationAmountWebElement.getText();
			if (actual.equals(expected))
				return true;
			else
				return false;

		} catch (Exception e) {
			return false;
		}
	}
	public boolean verifyTotalAmount(String expected) {
		try {
			WebElement TotalAmountWebElement = new WebDriverWait(
					driver, 100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(totalAmount_xpath));
			WebElement TotalWebElement = new WebDriverWait(
					driver, 100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(totals_xpath));

			TotalWebElement.isDisplayed();
			String actual = TotalAmountWebElement.getText();
			if (actual.equals(expected))
				return true;
			else
				return false;

		} catch (Exception e) {
			return false;
		}
	}
	public boolean verifyEOMTotalAmount(String expected) {
		try {
			WebElement EOMTotalAmountWebElement = new WebDriverWait(
					driver, 100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(eomTotalAmount_xpath));
			WebElement EOMTotalWebElement = new WebDriverWait(
					driver, 100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(eomTotal_xpath));

			EOMTotalWebElement.isDisplayed();
			String actual = EOMTotalAmountWebElement.getText().trim();
			if (actual.equals(expected))
				return true;
			else
				return false;

		} catch (Exception e) {
			return false;
		}
	}
	public boolean verifyEligibleAccountsReceivablesAmount(String expected) {
		try {
			WebElement EligibleAccountsReceivablesAmountWebElement = new WebDriverWait(
					driver, 100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(eligibleAccountsReceivablesAmount_xpath));
			WebElement EligibleAccountsReceivablesWebElement = new WebDriverWait(
					driver, 100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(eligibleAccountsReceivables_xpath));

			EligibleAccountsReceivablesWebElement.isDisplayed();
			String actual = EligibleAccountsReceivablesAmountWebElement.getText().trim();
			if (actual.equals(expected))
				return true;
			else
				return false;

		} catch (Exception e) {
			return false;
		}
	}
	public boolean verifyAccountsReceivablesCollateralAmount(String expected) {
		try {
			WebElement AccountsReceivablesCollateralAmountWebElement = new WebDriverWait(
					driver, 100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(accountsReceivablesCollateralAmount_xpath));
			WebElement AccountsReceivablesCollateralWebElement = new WebDriverWait(
					driver, 100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(accountsReceivablesCollateral_xpath));

			AccountsReceivablesCollateralWebElement.isDisplayed();
			String actual = AccountsReceivablesCollateralAmountWebElement.getText().trim();
			if (actual.equals(expected))
				return true;
			else
				return false;

		} catch (Exception e) {
			return false;
		}
	}
	
	public boolean ineligibleSummaryConcentrationReason()
	{
	try{

		WebElement saveBBCFilesRequiredSuccessmsgWebEelement=new WebDriverWait(driver,100)
		.until(ExpectedConditions.visibilityOfElementLocated(concentrationIneligbleSummary_xpath));
		saveBBCFilesRequiredSuccessmsgWebEelement.isDisplayed();
		Thread.sleep(5000);

		
return true;
	}
	catch(Exception ex){
		return false;
	}

	}
	
	public boolean ineligibleSummaryConcentrationReasonValue()
	{
	try{

		WebElement saveBBCFilesRequiredSuccessmsgWebEelement=new WebDriverWait(driver,100)
		.until(ExpectedConditions.visibilityOfElementLocated(concentrationIneligbleSummaryValue_xpath));
		saveBBCFilesRequiredSuccessmsgWebEelement.isDisplayed();
		Thread.sleep(5000);

		
return true;
	}
	catch(Exception ex){
		return false;
	}

	}
}
