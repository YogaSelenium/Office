package com.cync.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.cync.base.BasePage;

public class CreateSkippedBBC  extends BasePage { //anusha

	private final By CreateSkippedBBCHeader_xpath=By.xpath("//span[@class='paneltitle']");
	private final By SkippedBBCCreationDate=By.xpath("//th[contains(text(),'Skipped BBC Creation Date')]");
	private final By bbcTypeHeader_xpath=By.xpath("//table[@class='table table-bordered dataTable']/thead/tr[1]/th[1]");
	private final By bbcDateHeader_xpath=By.xpath("//table[@class='table table-bordered dataTable']/thead/tr[1]/th[2]");
	private final By skippedbbcHeader_xpath=By.xpath("//table[@class='table table-bordered dataTable']/thead/tr[1]/th[3]");
	private final By createSkippedBBCForDate_xpath=By.id("bbc_dates");
	private final By processSkippedBbc_xpath=By.xpath("//input[@class='view-button save_btn']");
	
	public CreateSkippedBBC(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public boolean VerifyHeader(String Header) {
		try {
			WebElement firstAccountNoWebElement = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(CreateSkippedBBCHeader_xpath));

			String actual = firstAccountNoWebElement.getText();
			if (actual.equals(Header))
				return true;
			else
				return false;

		} catch (Exception e) {
			return false;
		}
	}
	public boolean VerifySkippedBBcCreationDate(String SkippedBBC) {
		try {
			WebElement firstAccountNoWebElement = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(SkippedBBCCreationDate));

			String actual = firstAccountNoWebElement.getText();
			if (actual.equals(SkippedBBC))
				return true;
			else
				return false;

		} catch (Exception e) {
			return false;
		}
	}
//G
    public boolean  verifyBbcDate(String bbcDate){
    	try {

    		WebElement priorAmountAmountWebElement = new WebDriverWait(driver, 100).until(ExpectedConditions.visibilityOfElementLocated(bbcDateHeader_xpath));
    		String actual = priorAmountAmountWebElement.getText().trim();
    		if (actual.equals(bbcDate))
    			return true;
    		else
    			return false;

    	} catch (Exception e) {
    		return false;
    	}
    	
    	}
    
    public boolean  verifyBbcType(String bbcType){
    	try {

    		WebElement priorAmountAmountWebElement = new WebDriverWait(driver, 100).until(ExpectedConditions.visibilityOfElementLocated(bbcTypeHeader_xpath));
    		String actual = priorAmountAmountWebElement.getText().trim();
    		if (actual.equals(bbcType))
    			return true;
    		else
    			return false;

    	} catch (Exception e) {
    		return false;
    	}
    	
    	}
    
    public boolean  verifySkippedBbc(String skippedbbc){
    	try {

    		WebElement priorAmountAmountWebElement = new WebDriverWait(driver, 100).until(ExpectedConditions.visibilityOfElementLocated(skippedbbcHeader_xpath));
    		String actual = priorAmountAmountWebElement.getText().trim();
    		if (actual.equals(skippedbbc))
    			return true;
    		else
    			return false;

    	} catch (Exception e) {
    		return false;
    	}
    	
    	}
    
    public boolean  passSkipDate(String Date){
    	try {

    		WebElement dateWebElement = new WebDriverWait(driver, 100).until(ExpectedConditions.visibilityOfElementLocated(createSkippedBBCForDate_xpath));
    		dateWebElement.click();
    		dateWebElement.sendKeys(Date);
    			return true;

    	} catch (Exception e) {
    		return false;
    	}
    	
    	}
    
    public boolean  clickProcess(){
    	try {

    		WebElement dateWebElement = new WebDriverWait(driver, 100).until(ExpectedConditions.visibilityOfElementLocated(processSkippedBbc_xpath));
    		dateWebElement.click();
    		this.isAlertPresent();
    			return true;

    	} catch (Exception e) {
    		return false;
    	}
    	
    	}
    
    public boolean isAlertPresent() {

    	boolean presentFlag = false;

    	try {
    		Alert alert = driver.switchTo().alert();
    		presentFlag = true;
    		alert.accept();
    	} catch (Exception ex) {

    		System.out.println("No Such Alert Present");

    	}

    	return presentFlag;
    }
}
