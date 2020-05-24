package com.cync.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.SkipException;

import com.cync.base.BasePage;

public class CashReceiptSourceCode extends BasePage 
{
	
	private final By cashReceiptSourceCodes_xpath=By.xpath("//span[contains(text(),'Cash Receipt Source Codes')]"); 
	private final By addIcon_xpath=By.xpath("//span[@class='ui-icon ui-icon ui-icon-plus']");
	private final By sourceCode_xpath=By.xpath("//input[@id='jqg1_code']");
	private final By description_xpath=By.xpath("//input[@id='jqg1_description']");
	private final By floatDays_xpath=By.xpath("//input[@id='jqg1_float_days']");
	private final By saveBtnVerify_xpath = By.xpath("//span[@class='ui-icon ui-icon ui-icon-disk']");
	private final By successMsg_xpath = By.xpath("//div[@class='ui-state-success']");
	private final By closeBtnVerify_xpath = By.id("closedialog");
	
	
	


	public CashReceiptSourceCode(WebDriver driver) {
		super(driver);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(!driver.findElement(cashReceiptSourceCodes_xpath).getText().trim().equals("Cash Receipt Source Codes")){
			throw new SkipException("Cash Receipt Source Codes couldn't open.");
		}
	}
	
	public boolean clickOnAddIcon()
	{
	try{

		WebElement addWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(addIcon_xpath));
		addWebEelement.click();
		Thread.sleep(5000);
		return true;
	}
	catch(Exception ex){
		return false;
	}

	}
	
	public boolean enterDataInSourceCode()
	{
	try{

		WebElement addWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(sourceCode_xpath));
		addWebEelement.click();
		Thread.sleep(5000);
		return true;
	}
	catch(Exception ex){
		return false;
	}

	}
	
	public boolean enterDataInDescription()
	{
	try{

		WebElement addWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(description_xpath));
		addWebEelement.click();
		//Thread.sleep(5000);
		return true;
	}
	catch(Exception ex){
		return false;
	}

	}
	
	public boolean enterDataInFloatDays()
	{
	try{

		WebElement addWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(floatDays_xpath));
		addWebEelement.click();
		//Thread.sleep(5000);
		return true;
	}
	catch(Exception ex){
		return false;
	}

	}
	
	public boolean ClickOnSave()
	{
		try{
		
		WebElement savebtnWebelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(saveBtnVerify_xpath));
		savebtnWebelement.click();
		
		
		return true;
	}
	

	catch(Exception ex){
		return false;
	}
		
	}
	
	public String SuccessMsgVerify(String SuccessMsg)
	{
	 
	try{
		WebElement MsgWebEelement=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(successMsg_xpath));
		MsgWebEelement.getText();
		
		
	}
	catch(Exception ex){
		
	}
	return SuccessMsg;
	
	} 

	
	public boolean CloseBtnVerify()
	{
		try{
		
		WebElement closebtnWebelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(closeBtnVerify_xpath));
		closebtnWebelement.click();
		
		return true;
	}
	

	catch(Exception ex){
		return false;
	}
		
	}



}