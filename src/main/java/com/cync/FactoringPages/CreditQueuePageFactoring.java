package com.cync.FactoringPages;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.cync.base.BasePage;

public class CreditQueuePageFactoring extends BasePage
{
	private final By CreditQueuePageFactoring_xpath = By.xpath("//li[@class='nav-item active ng-star-inserted']");
	
	private final By addNewBTN_xpath = By.xpath("//div[@class='addbtn']//button[@class='btn btn-primary']");
	private final By selectClientDD_xpath = By.xpath("//select[@formcontrolname='borrower_id']");
	private final By selectDebtorDD_xpath = By.xpath("//select[@formcontrolname='customer_id']");
	private final By reqCreditLimit_xpath = By.xpath("//input[@formcontrolname='requested_limit']");
	private final By commentTB_xpath = By.xpath("//textarea[@formcontrolname='comment']");
	private final By saveBTN_xpath = By.xpath("//span[contains(text(),'Save')]");
	private final By successMsg_xpath = By.xpath("//div[@id=every-api-message");
	
	
	public CreditQueuePageFactoring(WebDriver driver) {
		super(driver);
		try
		{
			
		}
		catch(Exception e)
		{
			
		}
	}
	public  String PageHeaderVerify(String Header)
    {
    	try
    	{
    		WebElement HeaderWebEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(CreditQueuePageFactoring_xpath));
		HeaderWebEelement.getText();
		Thread.sleep(2000);
    	}
    	catch(Exception e)
    	{
    		
    	}
    	return Header;
    }
	public boolean ClickAddNewBTN() {
		try
    	{
    		WebElement AddNewBTNWebEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(addNewBTN_xpath));
    		AddNewBTNWebEelement.click();
    		this.isAlertPresent();
    		Thread.sleep(1000);
    		
		return true;
    	}
    	catch(Exception e)
    	{
    		return false;
    	}
    	
	}
	public boolean SelectClient(String clientname) {
		try
    	{
    		WebElement SelectClientWebEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(selectClientDD_xpath));
    		SelectClientWebEelement.sendKeys(clientname);
    		Thread.sleep(500);
    		Robot rb = new Robot();
    		rb.keyPress(KeyEvent.VK_ENTER);
    		/*Select sel = new Select(SelectClientWebEelement);
    		List<WebElement> list = sel.getOptions();
			for (WebElement ele : list) {
				if (ele.getText().equals(clientname)) {
					ele.click();
					Thread.sleep(1000);

					 return true;
				}
			}*/
    		return true;
    	}
    	catch(Exception e)
    	{
    		
    	}
		return false;
	}
	public boolean SelectDebtor(String debtor) {
		try
    	{
    		WebElement SelectDebtorWebEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(selectDebtorDD_xpath));
    		//SelectDebtorWebEelement.sendKeys(debtor);
    		Select sel = new Select(SelectDebtorWebEelement);
    		List<WebElement> list = sel.getOptions();
			for (WebElement ele : list) {
				if (ele.getText().equals(debtor)) {
					ele.click();
					Thread.sleep(1000);

					 return true;
				}
			}
    		return true;
    	}
    	catch(Exception e)
    	{
    		
    	}
		return false;
	}
	public boolean addValueToReqCreditLimit(String reqLimit) {
		try
    	{
    		WebElement ReqCreditLimitWebEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(reqCreditLimit_xpath));
    		ReqCreditLimitWebEelement.clear();
    		ReqCreditLimitWebEelement.sendKeys(reqLimit);;
    		
		return true;
    	}
    	catch(Exception e)
    	{
    		return false;
    	}
	}
	public boolean addValueToComment(String comment) {
		try
    	{
    		WebElement ReqCreditLimitWebEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(commentTB_xpath));
    		ReqCreditLimitWebEelement.clear();
    		ReqCreditLimitWebEelement.sendKeys(comment);
    		
		return true;
    	}
    	catch(Exception e)
    	{
    		return false;
    	}
	}
	public boolean ClickSaveBTN() {
		try
    	{
    		WebElement SaveBTNWebEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(saveBTN_xpath));
    		SaveBTNWebEelement.click();
    		this.isAlertPresent();
    		Thread.sleep(1000);
    		
		return true;
    	}
    	catch(Exception e)
    	{
    		return false;
    	}
	}
	public boolean VerifySuccessMsg() {
		try
    	{
    		WebElement SuccessMsgWebEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(successMsg_xpath));
    		SuccessMsgWebEelement.isDisplayed();
    		Thread.sleep(1000);
    		
		return true;
    	}
    	catch(Exception e)
    	{
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
