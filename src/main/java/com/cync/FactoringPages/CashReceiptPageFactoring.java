package com.cync.FactoringPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.cync.base.BasePage;

public class CashReceiptPageFactoring extends BasePage
{
	private final By CashReceiptPageFactoring_xpath = By.xpath("//span[@class='paneltitle']");
	
	private final By accNameHyperlink_xpath = By.xpath("(//td[@aria-describedby='cash_receipts_list_account_name'])[1]");
	private final By invDetailsHL_xpath = By.xpath("//a[contains(text(),'Invoice Details')]");
	private final By accParaHL_xpath = By.xpath("//a[contains(text(),'Account Parameters')]");
	private final By commentsHL_xpath = By.xpath("(//a[contains(text(),'Comments')])[3]");
	private final By invDocHL_xpath = By.xpath("//a[contains(text(),'Invoice Documents')]");
	private final By contactsHL_xpath = By.xpath("(//a[contains(text(),'Contacts')])[2]");
	
	
	public CashReceiptPageFactoring(WebDriver driver) {
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
			.until(ExpectedConditions.visibilityOfElementLocated(CashReceiptPageFactoring_xpath));
		HeaderWebEelement.getText();
		Thread.sleep(2000);
    	}
    	catch(Exception e)
    	{
    		
    	}
    	return Header;

}
	public boolean VerifyAccNameHyperlink() {
    	try
    	{
    		WebElement AccNameHyperlinkEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(accNameHyperlink_xpath));
    		AccNameHyperlinkEelement.isDisplayed();
		return true;
    	}
    	catch(Exception e)
    	{
    		return false;
    	}
    	

	}
	public boolean ClickAccNameHyperlink() {
		try
    	{
    		WebElement AccNameHyperlinkEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(accNameHyperlink_xpath));
    		AccNameHyperlinkEelement.click();
		return true;
    	}
    	catch(Exception e)
    	{
    		return false;
    	}
	}
	public boolean VerifyInvoiceDetailsHL() {
		try
    	{
    		WebElement InvoiceDetailsHLEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(invDetailsHL_xpath));
    		InvoiceDetailsHLEelement.isDisplayed();
		return true;
    	}
    	catch(Exception e)
    	{
    		return false;
    	}	}
	public boolean VerifyAccParaHL() {
		try
    	{
    		WebElement AccParaHLEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(accParaHL_xpath));
    		AccParaHLEelement.isDisplayed();
		return true;
    	}
    	catch(Exception e)
    	{
    		return false;
    	}
	}
	public boolean VerifyCommentsHL() {
		try
    	{
    		WebElement CommentsHLEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(commentsHL_xpath));
    		CommentsHLEelement.isDisplayed();
		return true;
    	}
    	catch(Exception e)
    	{
    		return false;
    	}
	}
	public boolean VerifyInvoiceDocHL() {
		try
    	{
    		WebElement InvoiceDocHLEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(invDocHL_xpath));
    		InvoiceDocHLEelement.isDisplayed();
		return true;
    	}
    	catch(Exception e)
    	{
    		return false;
    	}
	}
	public boolean VerifyContactsHL() {
		try
    	{
    		WebElement ContactsHLEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(contactsHL_xpath));
    		ContactsHLEelement.isDisplayed();
		return true;
    	}
    	catch(Exception e)
    	{
    		return false;
    	}
	}
}
