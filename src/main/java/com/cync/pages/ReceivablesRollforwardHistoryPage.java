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

public class ReceivablesRollforwardHistoryPage  extends BasePage {

	private final By receivableRollForwardHeader_xpath=By.xpath("//span[text()='Receivables Rollforward']");
	private final By unreconciled_xpath=By.xpath("//label[text()='Unreconciled']");
	private final By unreconciledValue_xpath=By.xpath("//div[@id='roll_forwards_section']/table/tbody/tr[6]/td[2]");
	private final By EOPTotal_xpath=By.xpath("//label[text()='EOP Total']");
	private final By EOPTotalValue_xpath=By.xpath("//div[@id='roll_forwards_section']/table/tbody/tr[7]/td[2]");
	private final By division_xpath=By.id("balance_name_id");
	
	
	//Maintain AR
	private final By newSalesDisplay_xpath=By.xpath("//label[text()='New Sales (Additions)']");
	private final By newSalesValue_xpath=By.xpath("(//input[@class='receivable_roll_forward'])[1]");
	private final By newCreditDisplay_xpath=By.xpath("//label[text()='New Credits']");
	private final By newCreditValue_xpath=By.xpath("(//input[@class='receivable_roll_forward'])[2]");
	//
	private final By bbcDate_xpath=By.xpath("//label[text()='BBC Date']");
	private final By bbcDateValue_xpath=By.xpath("(//label[@class='control-label'])[2]");
	
	
	
	public ReceivablesRollforwardHistoryPage(WebDriver driver) {
		super(driver);
		try {
			Thread.sleep(1000);
			if(!driver.findElement(receivableRollForwardHeader_xpath).getText().trim().equals("Receivables Rollforward")){
				throw new SkipException("Receivables Rollforward couldn't open.");
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	
	
	 public boolean  verifyUnreconciled(String  Unreconciled){
	    	try {
	    		WebElement displayWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(unreconciled_xpath));
	    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(unreconciledValue_xpath));
	    		displayWebElement.isDisplayed();
	    		String actual = AmountWebElement.getText().trim();
	    		if (actual.equals(Unreconciled))
	    			return true;
	    		else
	    			return false;

	    	} catch (Exception e) {
	    		return false;
	    	}
	    	
	    }
	    
	 public boolean  verifyEOPTotal(String  EOPTotal){
	    	try {
	    		WebElement displayWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(EOPTotal_xpath));
	    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(EOPTotalValue_xpath));
	    		displayWebElement.isDisplayed();
	    		String actual = AmountWebElement.getText().trim();
	    		if (actual.equals(EOPTotal))
	    			return true;
	    		else
	    			return false;

	    	} catch (Exception e) {
	    		return false;
	    	}
	    	
	    }
	 
	 public boolean selectDivisionDropdownValues(String division) {
			try {
				//Thread.sleep(3000);
				WebElement divisionDropdownWebEelement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(division_xpath));
				Select sel = new Select(divisionDropdownWebEelement);
				sel.selectByVisibleText(division);
				/*List<WebElement> list = sel.getOptions();
				for (WebElement ele : list) {
					if (ele.getText().equals(division)) {
						ele.click();
						Thread.sleep(3000);
						break;
					}
				}*/
				return true;} 
			catch (Exception ex) {
			}
			return false;

		}
	    
	 
	//
	 public boolean  verifyNewSales(String  newSales){
	    	try {
	    		WebElement displayWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(newSalesDisplay_xpath));
	    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(newSalesValue_xpath));
	    		displayWebElement.isDisplayed();
	    		String actual = AmountWebElement.getAttribute("value");
	    		if (actual.equals(newSales))
	    			return true;
	    		else
	    			return false;

	    	} catch (Exception e) {
	    		return false;
	    	}
	    	
	    }
	 
	 public boolean  verifyNewCredits(String  newCredits){
	    	try {
	    		WebElement displayWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(newCreditDisplay_xpath));
	    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(newCreditValue_xpath));
	    		displayWebElement.isDisplayed();
	    		String actual = AmountWebElement.getAttribute("value");
	    		if (actual.equals(newCredits))
	    			return true;
	    		else
	    			return false;

	    	} catch (Exception e) {
	    		return false;
	    	}
	    	
	    }
	 
	 //
	 public boolean  verifyBbcDate(String  bbcDate){
	    	try {
	    		WebElement displayWebElement = new WebDriverWait(driver, 100).until(ExpectedConditions.visibilityOfElementLocated(bbcDate_xpath));
	    		WebElement AmountWebElement = new WebDriverWait(driver, 100).until(ExpectedConditions.visibilityOfElementLocated(bbcDateValue_xpath));
	    		displayWebElement.isDisplayed();
	    		String actual = AmountWebElement.getText().trim();
	    		if (actual.equals(bbcDate))
	    			return true;
	    		else
	    			return false;

	    	} catch (Exception e) {
	    		return false;
	    	}
	    	
	    }
}
