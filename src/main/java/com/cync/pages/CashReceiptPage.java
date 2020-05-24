package com.cync.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.cync.base.BasePage;

public class CashReceiptPage extends BasePage{
	
	private final By CashReceiptHeader_xpath = By.xpath("//span[text()=' Cash Receipts ']");
	private final By InvoiceSearch_xpath = By.id("gs_invoice_no");
	private final By RecordFoundApplyToInvoice_xpath = By.xpath("(//td[@aria-describedby='cash_receipts_list_invoice_no'])[1]");
	private final By PaidAmount_xpath = By.xpath("(//td[@aria-describedby='cash_receipts_list_current_amount'])[1]");

	//author garima
	
	private final By CashReceipt_xpath=By.xpath("(//a[contains(text(),'Cash Receipts')])[5]");
	private final By bbc_xpath=By.xpath("//select[@id='bbc_status']");
	private final By Startdate_xpath=By.xpath("//input[@id='start_date']");
	private final By Style_xpath=By.xpath("//select[@id='style']");
	private final By pdf_xpath=By.xpath("//button[contains(text(),'PDF')]");
	
	
	
	
	
	
	
	
	
	
	public CashReceiptPage(WebDriver driver) {
		super(driver);
		try{
			/*if(!driver.findElement(CashReceiptHeader_xpath).getText().trim().contains("Cash Receipts")){
				throw new SkipException(" Cash Receipts page couldn't open.");
			
			} */
			}
		catch(Exception e){
			
		// TODO Auto-generated constructor stub
			e.printStackTrace();
	}
		
		// TODO Auto-generated constructor stub

}
	
	 public String PageHeaderVerify(String Header)
		{
		try{
			WebElement HeaderWebEelement=new WebDriverWait(driver,100)
				.until(ExpectedConditions.visibilityOfElementLocated(CashReceiptHeader_xpath));
			HeaderWebEelement.getText();
			Thread.sleep(2000);
			
		}
		catch(Exception ex){
			
		}
		return Header;
		
		} 	
	
	
	 public String ApplyToInvoiceSearch(String search)
		{
		try{
			WebElement InvoiceSearchWebEelement=new WebDriverWait(driver,200)
			.until(ExpectedConditions.visibilityOfElementLocated(InvoiceSearch_xpath));
			InvoiceSearchWebEelement.clear();
			InvoiceSearchWebEelement.sendKeys(search);
			Thread.sleep(5000);

		}
		catch(Exception ex){

		}
		return search;

		}
	 
		public boolean RecordFoundApplyToInvoice()
		 {
		 try{

		 	WebElement RecordFoundWebEelement=new WebDriverWait(driver,100)
		 	.until(ExpectedConditions.visibilityOfElementLocated(RecordFoundApplyToInvoice_xpath));
		 	RecordFoundWebEelement.isDisplayed();
		 	Thread.sleep(5000);
		 	
		 return true;
		 }
		 catch(Exception ex){
		 	return false;
		 }

		 } 
		
		public boolean RecordFoundPaidAmount()
		 {
		 try{

		 	WebElement RecordFoundWebEelement=new WebDriverWait(driver,100)
		 	.until(ExpectedConditions.visibilityOfElementLocated(PaidAmount_xpath));
		 	RecordFoundWebEelement.isDisplayed();
			Thread.sleep(5000);

		 return true;
		 }
		 catch(Exception ex){
		 	return false;
		 }

		 } 
	 //Method to click on cash receipt
		

		public boolean ClickonCashReceipt()
		 {
		 try{

		 	WebElement RecordFoundWebEelement=new WebDriverWait(driver,100)
		 	.until(ExpectedConditions.visibilityOfElementLocated(CashReceipt_xpath));
		 	RecordFoundWebEelement.click();
			

		 return true;
		 }
		 catch(Exception ex){
		 	return false;
		 }

		 } 
		
		//Method to select data from BBC
		
		public String clickOnBBc(String data)
		 {
		 try{

		 	WebElement RecordFoundWebEelement=new WebDriverWait(driver,100)
		 	.until(ExpectedConditions.visibilityOfElementLocated(bbc_xpath));
		 	RecordFoundWebEelement.click();
		 	RecordFoundWebEelement.sendKeys(data);

		 
		 }
		 catch(Exception ex){
		 
		 }
		 return data;

		 } 
		
		//Method to select starting date
		
		
		public String selectdate(String date)
		 {
		 try{

		 	WebElement RecordFoundWebEelement=new WebDriverWait(driver,100)
		 	.until(ExpectedConditions.visibilityOfElementLocated(Startdate_xpath));
		 	RecordFoundWebEelement.click();
		 	RecordFoundWebEelement.sendKeys(date);
		 	Thread.sleep(4000);
		 
		 }
		 catch(Exception ex){
		 
		 }
		 return date;

		 } 

		//Method to enter style
		
public String selectstyle(String style)
{
try{

	WebElement RecordFoundWebEelement=new WebDriverWait(driver,100)
	.until(ExpectedConditions.visibilityOfElementLocated(Style_xpath));
	RecordFoundWebEelement.click();
	RecordFoundWebEelement.sendKeys(style);
	Thread.sleep(4000);

}
catch(Exception ex){

}
return style;

} 

//method to click on pdf



public boolean Clickonpdf()
 {
 try{

 	WebElement RecordFoundWebEelement=new WebDriverWait(driver,100)
 	.until(ExpectedConditions.visibilityOfElementLocated(pdf_xpath));
 	RecordFoundWebEelement.click();
	

 return true;
 }
 catch(Exception ex){
 	return false;
 }

 } 
}
