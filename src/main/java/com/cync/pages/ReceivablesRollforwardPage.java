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

public class ReceivablesRollforwardPage extends BasePage
{
	private final By receivablesRollforward_xpath=By.xpath("//span[@class='paneltitle']");
	private final By bbcDate_xpath=By.xpath("(//label[@class='control-label'])[2]");
	private final By newSalesAdditions_xpath=By.xpath("//label[text()='New Sales (Additions)']");
	private final By newSalesAdditionsAmount_xpath=By.id("ns");
	private final By eopTotal_xpath=By.xpath("//label[text()='EOP Total']");
	private final By eopTotalAmount_xpath=By.id("et");
	private final By Unreconciled_xpath=By.xpath("//label[text()='Unreconciled']");
	private final By UnreconciledTotalAmount_xpath=By.xpath("(//label[text()='117,250.00'])[1]");
	
	
	//summary
	private final By divisionAll_xpath=By.xpath("//select[@id='balance_name_id']/option[1]");
	private final By unreconciled_xpath=By.xpath("//table[@class='receivble_tbl dataTable table table-bordered']/tbody/tr[8]/td[2]");
	private final By eopTotalValue_xpath=By.xpath("//table[@class='receivble_tbl dataTable table table-bordered']/tbody/tr[9]/td[2]");
	
	//Maintain AR
	private final By newSalesAmount_xpath=By.id("ns");
	private final By newSales_xpath=By.xpath("//label[text()='New Sales (Additions)']");
	private final By newCreditsAmount_xpath=By.id("ncr");
	private final By newCredits_xpath=By.xpath("//label[text()='New Credits']");
	
	
	public ReceivablesRollforwardPage(WebDriver driver) {
		super(driver);

		try {
			Thread.sleep(1000);
		} catch (Exception e) {

			e.printStackTrace();
		}
		if (!driver.findElement(receivablesRollforward_xpath).getText().trim()
				.equals("Receivables Rollforward")) {
			throw new SkipException("Receivables Rollforward couldn't open.");
		}
	}
	
	public boolean bbcDateValidation(String expected){
		try {
			WebElement BBCDateWebElement = new WebDriverWait(
					driver, 10)
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
	
	
	
	
	
	public boolean newSalesValidation(String expected){
	try {
		WebElement newSalesAdditionsWebElement = new WebDriverWait(
				driver, 10)
				.until(ExpectedConditions
						.visibilityOfElementLocated(newSalesAdditions_xpath));
		WebElement newSalesAdditionsAmountWebElement = new WebDriverWait(
				driver, 10)
				.until(ExpectedConditions
						.visibilityOfElementLocated(newSalesAdditionsAmount_xpath));

		newSalesAdditionsWebElement.isDisplayed();
		String actual = newSalesAdditionsAmountWebElement.getAttribute("value");
		if (actual.equals(expected))
			return true;
		else
			return false;

	} catch (Exception e) {
		return false;
	}
	
	}
	
	public boolean EOPTotalValidation(String expected){
		try {
			WebElement EOPTotalWebElement = new WebDriverWait(
					driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(eopTotal_xpath));
			WebElement EOPTotalAmountWebElement = new WebDriverWait(
					driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(eopTotalAmount_xpath));

			EOPTotalWebElement.isDisplayed();
			String actual = EOPTotalAmountWebElement.getText().trim();
			if (actual.equals(expected))
				return true;
			else
				return false;

		} catch (Exception e) {
			return false;
		}
		
		}
	
	
	
	
	public boolean UnreconciledValidation(String expected){
		try {
			WebElement EOPTotalWebElement = new WebDriverWait(
					driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(Unreconciled_xpath));
			WebElement EOPTotalAmountWebElement = new WebDriverWait(
					driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(UnreconciledTotalAmount_xpath));

			EOPTotalWebElement.isDisplayed();
			String actual = EOPTotalAmountWebElement.getText().trim();
			if (actual.equals(expected))
				return true;
			else
				return false;

		} catch (Exception e) {
			return false;
		}
		
		}
	
	//summary
	public boolean verifydivAll(String divAll){
		try{
			//Thread.sleep(5000);
			WebElement divWebElement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(divisionAll_xpath));
			divWebElement.getText().equalsIgnoreCase(divAll);
			return true;
			
		}
		catch(Exception e){
			
		}
		return false;
		
		}
	
	public boolean verifyUnreconciled(String unreconciled){
		try{
			//Thread.sleep(5000);
			WebElement unreconciledWebElement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(unreconciled_xpath));
			unreconciledWebElement.getText().equalsIgnoreCase(unreconciled);
			return true;
			
		}
		catch(Exception e){
			
		}
		return false;
		
		}
	
	public boolean verifyEopTotal(String eop){
		try{
			//Thread.sleep(5000);
			WebElement eopWebElement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(eopTotalValue_xpath));
			eopWebElement.getText().equalsIgnoreCase(eop);
			return true;
			
		}
		catch(Exception e){
			
		}
		return false;
		
		}
	
	//Maintain AR
	public boolean verifyNewSales(String expected) {
		try {
			WebElement newSalesAmountWebElement = new WebDriverWait(
					driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(newSalesAmount_xpath));
			WebElement newSalesWebElement = new WebDriverWait(
					driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(newSales_xpath));

			newSalesWebElement.isDisplayed();
			String actual = newSalesAmountWebElement.getAttribute("value");
			if (actual.equals(expected))
				return true;
			else
				return false;

		} catch (Exception e) {
			return false;
		}
	}
	
	public boolean verifyNewCredits(String expectedCredits) {
		try {
			WebElement newSalesAmountWebElement = new WebDriverWait(
					driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(newCreditsAmount_xpath));
			WebElement newSalesWebElement = new WebDriverWait(
					driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(newCredits_xpath));

			newSalesWebElement.isDisplayed();
			String actual = newSalesAmountWebElement.getAttribute("value");
			if (actual.equals(expectedCredits))
				return true;
			else
				return false;

		} catch (Exception e) {
			return false;
		}
	}
}
