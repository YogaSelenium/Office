package com.cync.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.cync.base.BasePage;

public class SummaryPayablesPage extends BasePage{  //author:anusha

	
	private final By FirstChevronIcon_xpath=By.xpath("//span[@class='fa fa-angle-double-down']");
	private final By ChildrenDetail_xpath=By.xpath("//td[contains(text(),'VENDOR2')]");
	private final By ChildrenDetailSummaryClient_xpath=By.xpath("//td[contains(text(),'VENDOR10')]");
	
	
	
	public SummaryPayablesPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public boolean VerifyChevronIcon() {
		try {
			WebElement ChevronIconWebElement = new WebDriverWait(driver, 100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(FirstChevronIcon_xpath));
			ChevronIconWebElement.isDisplayed();
			Thread.sleep(2000);
			return true;
		} catch (Exception e) {
			return false;
		}

		}
	
	public boolean ClickOnChevronIcon() {
		try {
			WebElement ChevronIconWebElement = new WebDriverWait(driver, 100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(FirstChevronIcon_xpath));
			ChevronIconWebElement.click();
			Thread.sleep(2000);
			return true;
		} catch (Exception e) {
			return false;
		}

		}

	public boolean ValidationChevronIcon() {
		try {
			WebElement ChevronIconWebElement = new WebDriverWait(driver, 100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(FirstChevronIcon_xpath));
			ChevronIconWebElement.click();
			Thread.sleep(2000);
			return true;
		} catch (Exception e) {
			return false;
		}

		}
	
	public boolean VerifyChildrenDetails(String ChildrenName) {
		try {
			WebElement ChildrenDetailWebElement = new WebDriverWait(driver, 100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(ChildrenDetail_xpath));
			String actual = ChildrenDetailWebElement.getText();
			if (actual.equals(ChildrenName))
				return true;
			else
				return false;
		} catch (Exception e) {
			return false;
		}

		}
	public boolean VerifyChildrenDetails_summaryClient(String ChildrenName) {
		try {
			WebElement ChildrenDetailWebElement = new WebDriverWait(driver, 100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(ChildrenDetailSummaryClient_xpath));
			String actual = ChildrenDetailWebElement.getText();
			if (actual.equals(ChildrenName))
				return true;
			else
				return false;
		} catch (Exception e) {
			return false;
		}

		}
}
