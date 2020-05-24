package com.cync.FactoringPages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.cync.base.BasePage;

public class DuplicateInvoicesPageFactoring extends BasePage
{
	private final By DuplicateInvoicesPageFactoring_xpath = By.xpath("//span[@class='paneltitle']");
	
	private final By acceptCheckBox_xpath = By.xpath("(//input[@type='radio'])[1]");
	//private final By editCheckBox_xpath = By.xpath("(//input[@type='radio'])[2]");
	//input[@type='radio' and @name='17308' and @value='edit']
	private final By editCheckBox_xpath = By.xpath("//tbody/tr/td[8]/input");
	
	private final By deleteCheckBox_xpath = By.xpath("(//input[@type='radio'])[3]");
	private final By invoicenoField_xpath = By.xpath("(//input[@type='text'])[2]");
	private final By processBTN_xpath = By.xpath("//input[@id='process_bt1']");
	
	private final By errorMsg_xpath = By.xpath("//strong[text()='Please provide valid Invoice number']");
	private final By delSuccessMsg_xpath = By.xpath("//strong[text()='Duplicate invoice successfully deleted/updated.']");
	
	
	
	public DuplicateInvoicesPageFactoring(WebDriver driver) {
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
			.until(ExpectedConditions.visibilityOfElementLocated(DuplicateInvoicesPageFactoring_xpath));
		HeaderWebEelement.getText();
		Thread.sleep(2000);
    	}
    	catch(Exception e)
    	{
    		
    	}
    	return Header;
    }
	
	
	public boolean VerifyAcceptCheckBox() {
		try
    	{
    		WebElement AcceptCheckBoxWebEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(acceptCheckBox_xpath));
    		AcceptCheckBoxWebEelement.isDisplayed();
	
		return true;
    	}
    	catch(Exception e)
    	{
    		return false;
    	}
    	
	}
	
	public boolean VerifyEditCheckBox() {
		try
    	{
    		WebElement EditCheckBoxWebEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(editCheckBox_xpath));
    		EditCheckBoxWebEelement.isDisplayed();
	
		return true;
    	}
    	catch(Exception e)
    	{
    		return false;
    	}
	}
	public boolean VerfiyDeleteCheckBox() {
		try
    	{
    		WebElement DeleteCheckBoxWebEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(deleteCheckBox_xpath));
    		DeleteCheckBoxWebEelement.isDisplayed();
	
		return true;
    	}
    	catch(Exception e)
    	{
    		return false;
    	}
	}
	public boolean CheckOnEditcheckbox() {
		try
    	{
    		WebElement EditCheckBoxWebEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(editCheckBox_xpath));
    		
    		EditCheckBoxWebEelement.click();
	
		return true;
    	}
    	catch(Exception e)
    	{
    		return false;
    	}
	}
	public boolean VerifyInvoiceNoEditable() {
		try
    	{
    		WebElement InvoiceNoWebEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(invoicenoField_xpath));
    		InvoiceNoWebEelement.isEnabled();
	
		return true;
    	}
    	catch(Exception e)
    	{
    		return false;
    	}
	}
	public boolean CheckOnDeletecheckbox() {
		try
    	{
    		WebElement DeleteCheckBoxWebEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(deleteCheckBox_xpath));
    		DeleteCheckBoxWebEelement.click();
    		this.isAlertPresent();
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
	
	
	public boolean ClickOnProcessBTN() {
		try
    	{
    		WebElement processbtnWebEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(processBTN_xpath));
    		processbtnWebEelement.click();
    		this.isAlertPresent();
		return true;
    	}
    	catch(Exception e)
    	{
    		return false;
    	}
}
	
	
	public boolean VerifyDelSuccessMsg() {
		try
    	{
    		WebElement DelSuccessMsgbtnWebEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(delSuccessMsg_xpath));
    		DelSuccessMsgbtnWebEelement.click();
    		this.isAlertPresent();
		return true;
    	}
    	catch(Exception e)
    	{
    		return false;
    	}
	}
	
	public boolean CheckOnAcceptcheckbox() {
		try
    	{
    		WebElement AcceptCheckBoxWebEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(acceptCheckBox_xpath));
    		AcceptCheckBoxWebEelement.click();
	
		return true;
    	}
    	catch(Exception e)
    	{
    		return false;
    	}
	}
	
	
	public boolean VerifyErrorMsg() {
		try
    	{
    		WebElement ErrorMsgWebEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(errorMsg_xpath));
    		ErrorMsgWebEelement.click();
	
		return true;
    	}
    	catch(Exception e)
    	{
    		return false;
    	}
	}
	}
