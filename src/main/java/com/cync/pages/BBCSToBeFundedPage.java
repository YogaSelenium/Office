package com.cync.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.SkipException;

import com.cync.base.BasePage;

public class BBCSToBeFundedPage extends BasePage {

	private final By BBCSToBeFundedScreen_xpath = By
			.xpath("//span[contains(text(),' to be Funded')]");
	private final By selectClientDropDown_xpath = By
			.xpath("//select[@id='selected_borrower_list']");
	private final By search_xpath = By.xpath("//input[@value='Search']");
	private final By fundRequestedAmount_xpath = By
			.xpath("//td[contains(text(),'10,000.00')]");
	private final By netBorrowingBaseAmount_xpath = By
			.xpath("(//td[contains(text(),'20,000.00')])[1]");
	private final By maxFundLimitAmount_xpath = By
			.xpath("(//td[contains(text(),'20,000.00')])[2]");
	private final By fundingAmountXpath_xpath = By
			.xpath("//input[@class='fund_amount' and @type='text']");
	private final By fundSendByDropDown_xpath = By
			.xpath("//tr[@class='row-odd']/td[12]/select");
	private final By fundReleaseCheckBox_xpath = By
			.xpath("//tr[@class='row-odd']/td[14]/input[@type='checkbox']");
	private final By BBCDate_xpath = By
			.xpath("//a[contains(text(),'04/28/2017')]");
	private final By saveFundRelease_xpath = By.xpath("//input[@value='Save']");
	private final By sucessMessageOnFundRelease = By
			.xpath("//li[contains(text(),'Records have been saved successfully and moved into Funded / Archived section')]");

	public BBCSToBeFundedPage(WebDriver driver) {
		super(driver);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (!driver.findElement(BBCSToBeFundedScreen_xpath).getText().trim()
				.equals("BBC's to be Funded")) {
			throw new SkipException("Fund / Release BBC couldn't open.");
		}

	}

	public String BBCSToBeFundedPageHeader(String BBCSToBeFundedHeader) {
		try {
			WebElement BBCSToBeFundedWebEelement = new WebDriverWait(driver,
					200).until(ExpectedConditions
					.visibilityOfElementLocated(BBCSToBeFundedScreen_xpath));
			BBCSToBeFundedWebEelement.getText();

		} catch (Exception ex) {

		}
		return BBCSToBeFundedHeader;

	}

	public String selectClientClick(String clientName) {

		try {
			WebElement selectClientDropdownWebEelement = new WebDriverWait(
					driver, 10).until(ExpectedConditions
					.visibilityOfElementLocated(selectClientDropDown_xpath));

			Select sel = new Select(selectClientDropdownWebEelement);
			List<WebElement> list = sel.getOptions();

			for (WebElement ele : list) {

				if (ele.getText().equals(clientName)) {
					ele.click();
					Thread.sleep(3000);
					break;

				}
			}

		} catch (Exception ex) {

		}

		return clientName;

	}

	public boolean clickOnSearch() {

		try {
			WebElement searchWebEelement = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(search_xpath));
			searchWebEelement.click();
			Thread.sleep(2000);
			return true;
		} catch (Exception ex) {
			return false;
		}
	}

	public boolean fundRequestedAmount() {
		try {
			WebElement fundRequestedAmountWebEelement = new WebDriverWait(
					driver, 30).until(ExpectedConditions
					.visibilityOfElementLocated(fundRequestedAmount_xpath));
			fundRequestedAmountWebEelement.isDisplayed();
			return true;
		} catch (Exception ex) {
			return false;
		}
	}

	public boolean netBorrowingBaseAmount() {
		try {
			WebElement netBorrowingBaseWebEelement = new WebDriverWait(driver,
					30).until(ExpectedConditions
					.visibilityOfElementLocated(netBorrowingBaseAmount_xpath));
			netBorrowingBaseWebEelement.isDisplayed();
			return true;
		} catch (Exception ex) {
			return false;
		}
	}

	public boolean maxFundLimitAmount() {
		try {
			WebElement maxFundLimitWebEelement = new WebDriverWait(driver, 30)
					.until(ExpectedConditions
							.visibilityOfElementLocated(maxFundLimitAmount_xpath));
			maxFundLimitWebEelement.isDisplayed();
			return true;
		} catch (Exception ex) {
			return false;
		}
	}

	public boolean fundingAmountTextBox(String fundingAmount) {
		try {
			Thread.sleep(5000);
			WebElement fundingAmountTextBoxWebEelement = new WebDriverWait(
					driver, 30).until(ExpectedConditions
					.visibilityOfElementLocated(fundingAmountXpath_xpath));
			fundingAmountTextBoxWebEelement.clear();
			fundingAmountTextBoxWebEelement.sendKeys(fundingAmount);
			Thread.sleep(3000);
			return true;
		} catch (Exception ex) {
			return false;
		}
	}

	public String selectFundingSendBy(String FundingStyle) {

		try {
			WebElement selectFundingSendByWebEelement = new WebDriverWait(
					driver, 10).until(ExpectedConditions
					.visibilityOfElementLocated(fundSendByDropDown_xpath));

			Select sel = new Select(selectFundingSendByWebEelement);
			List<WebElement> list = sel.getOptions();

			for (WebElement ele : list) {

				if (ele.getText().equals(FundingStyle)) {
					ele.click();
					Thread.sleep(10000);
					break;

				}
			}

		} catch (Exception ex) {

		}

		return FundingStyle;

	}

	public boolean FundReleaseCheckBox() {
		try {

			WebElement fundReleaseCheckBoxWebEelement = new WebDriverWait(
					driver, 30).until(ExpectedConditions
					.visibilityOfElementLocated(fundReleaseCheckBox_xpath));
			fundReleaseCheckBoxWebEelement.click();
			return true;
		} catch (Exception ex) {
			return false;
		}
	}

	public boolean BBCDateVerify() {
		try {

			WebElement BBCDateWebEelement = new WebDriverWait(driver, 30)
					.until(ExpectedConditions
							.visibilityOfElementLocated(BBCDate_xpath));
			BBCDateWebEelement.isDisplayed();
			return true;
		} catch (Exception ex) {
			return false;
		}
	}

	public boolean saveFundReleaseScreen() {
		try {

			WebElement saveFundReleaseWebEelement = new WebDriverWait(driver,
					30).until(ExpectedConditions
					.visibilityOfElementLocated(saveFundRelease_xpath));
			saveFundReleaseWebEelement.click();
			return true;
		} catch (Exception ex) {
			return false;
		}
	}

	public boolean sucessMessageFundReleaseScreen() {
		try {

			WebElement sucessMessageFundReleaseWebEelement = new WebDriverWait(
					driver, 30).until(ExpectedConditions
					.visibilityOfElementLocated(sucessMessageOnFundRelease));
			sucessMessageFundReleaseWebEelement.isDisplayed();
			return true;
		} catch (Exception ex) {
			return false;
		}
	}
}
