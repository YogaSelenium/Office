package com.cync.FactoringPages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.cync.base.BasePage;

public class IneligiblePageFactoring extends BasePage
{
	private final By IneligiblePageFactoring_xpath = By.xpath("//span[@class='paneltitle']");
	
	private final By recalculateBTN_xpath = By.xpath("//button[contains(text(),'Recalculate')]");
	private final By editinvoiceBTN_xpath = By.xpath("//button[contains(text(),'Edit Invoice(s)')]");
	private final By commentTextBox_xpath = By.xpath("//input[@id='common_comment']");
	private final By overrideBTN_xpath = By.xpath("//input[@id='override']");
	private final By invoicelistCheckbox_xpath = By.xpath("//input[@id='cb_ineligible_list']");
	private final By successMsg_xpath = By.xpath("//div[@class='alert alert-success']");
	
	public IneligiblePageFactoring(WebDriver driver) {
		super(driver);
		try
		{
			
		}
		catch(Exception e)
		{
			
		}
	}
	public  boolean PageHeaderVerify(String Header)
    {
    	try
    	{
    		WebElement HeaderWebEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(IneligiblePageFactoring_xpath));
		HeaderWebEelement.getText();
		/*Thread.sleep(2000);*/
		return true;
    	}
    	catch(Exception e)
    	{
    		return false;
    	}
    	

}
	public boolean VerfiyRecalculateBTN() {
		try
    	{
    		WebElement recalculateBTNWebEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(recalculateBTN_xpath));
    		recalculateBTNWebEelement.isDisplayed();
		/*Thread.sleep(2000);*/
		return true;
    	}
    	catch(Exception e)
    	{
    		return false;
    	}
	}
	
	public boolean VerifyEditInvoiceBTN() {
		try
    	{
    		WebElement EdiInvoiceBTNWebEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(editinvoiceBTN_xpath));
    		EdiInvoiceBTNWebEelement.isDisplayed();
		/*Thread.sleep(2000);*/
		return true;
    	}
    	catch(Exception e)
    	{
    		return false;
    	}
	}
	
	public boolean VerifyCommentTextBox() {
		try
    	{
    		WebElement CommentTextBoxWebEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(commentTextBox_xpath));
    		CommentTextBoxWebEelement.isDisplayed();
		/*Thread.sleep(2000);*/
		return true;
    	}
    	catch(Exception e)
    	{
    		return false;
    	}
	}
	
	public boolean VerifyOverrideBTN() {
		try
    	{
    		WebElement OverrideBTNWebEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(overrideBTN_xpath));
    		OverrideBTNWebEelement.isDisplayed();
		/*Thread.sleep(2000);*/
		return true;
    	}
    	catch(Exception e)
    	{
    		return false;
    	}
	}
	
	public boolean CheckOninvoicelistCheckBox() {
		try
    	{
    		WebElement invoicelistCheckBoxWebEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(invoicelistCheckbox_xpath));
    		invoicelistCheckBoxWebEelement.click();
		/*Thread.sleep(2000);*/
		return true;
    	}
    	catch(Exception e)
    	{
    		return false;
    	}
	}
	
	public boolean addValuetoCommentTextBox(String comment) {
		try
    	{
    		WebElement CommentTextBoxWebEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(commentTextBox_xpath));
    		CommentTextBoxWebEelement.clear();
    		CommentTextBoxWebEelement.sendKeys(comment);
		/*Thread.sleep(2000);*/
		return true;
    	}
    	catch(Exception e)
    	{
    		return false;
    	}
	}
	
	
	public boolean ClickOnOverrideBTN() {
		try
    	{
    		WebElement OverrideBTNWebEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(overrideBTN_xpath));
    		OverrideBTNWebEelement.click();
    		this.isAlertPresent();
    		//this.isAlertPresent();
		/*Thread.sleep(2000);*/
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
    		
		/*Thread.sleep(2000);*/
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
			alert.dismiss();
		} catch (Exception ex) {

			System.out.println("No Such Alert Present");

		}

		return presentFlag;
	}
}