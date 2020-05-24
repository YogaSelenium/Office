package com.cync.FactoringPages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.cync.base.BasePage;

public class RecoursePageFactoring extends BasePage
{
	private final By RecoursePageFactoring_xpath = By.xpath("//div[@class='panel-heading']/span[text()=' Recourse ']");
	
	private final By processRecourseBTN_xpath = By.xpath("//a[@id='process-recourse']");
	private final By processRecoursepopup_xpath = By.xpath("//span[@id='ui-id-2']");
	private final By recourseDate_xpath = By.xpath("//input[@id='recourse_data_date']");
	private final By noOfInv_xpath = By.xpath("//div[@id='no_of_inv']");
	private final By totRecAmt_xpath = By.xpath("//input[@id='rec_amt']");
	private final By processRecpopup_xpath = By.xpath("//span[@id='submit-recourse']");
	private final By cancelBTN_xpath = By.xpath("//span[@id='cancel-recourse']");
	private final By errorMsg_xpath = By.xpath("//div[@class='ui-state-error']");
	private final By closeErrorMsg_xpath = By.xpath("//a[@id='closedialog']");
	private final By ReverseButton_xpath= By.xpath("/html[1]/body[1]/div[3]/div[1]/div[2]/div[4]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/button[1]");
	
	public RecoursePageFactoring(WebDriver driver) {
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
			.until(ExpectedConditions.visibilityOfElementLocated(RecoursePageFactoring_xpath));
		HeaderWebEelement.getText();
		Thread.sleep(1000);
    	}
    	catch(Exception e)
    	{
    		
    	}
    	return Header; 

}
	public boolean VerifyProcessRecourseBTN() {
		try
    	{
    		WebElement ProcessRecourseBTNWebElement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(processRecourseBTN_xpath));
    		ProcessRecourseBTNWebElement.isDisplayed();
            return true;
    	}
    	catch(Exception e)
    	{
    	    return false;	
    	}
    	
	}
	public boolean ClickProcessRecorseBTN() {
		try
    	{
    		WebElement ProcessRecourseBTNWebElement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(processRecourseBTN_xpath));
    		ProcessRecourseBTNWebElement.click();
            return true;
    		
    	}
    	catch(Exception e)
    	{
    		return false;
    	}
	}
	public boolean VerifyProcessRecoursepopup() {
		try
    	{
    		WebElement ProcessRecoursepopupWebElement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(processRecoursepopup_xpath));
    		ProcessRecoursepopupWebElement.isDisplayed();
            return true;
    	}
    	catch(Exception e)
    	{
    	    return false;	
    	}
	}
	public boolean VerifyRecourseDate() {
		try
    	{
    		WebElement RecourseDateWebElement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(recourseDate_xpath));
    		RecourseDateWebElement.isDisplayed();
            return true;
    	}
    	catch(Exception e)
    	{
    	    return false;	
    	}
	}
	public boolean VerifyNoOfInv() {
		try
    	{
    		WebElement NoOfInvWebElement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(noOfInv_xpath));
    		NoOfInvWebElement.isDisplayed();
            return true;
    	}
    	catch(Exception e)
    	{
    	    return false;	
    	}
	}
	public boolean VerifyTotRecAmount() {
		try
    	{
    		WebElement TotRecAmountWebElement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(totRecAmt_xpath));
    		TotRecAmountWebElement.isDisplayed();
            return true;
    	}
    	catch(Exception e)
    	{
    	    return false;	
    	}
	}
	public boolean VerifyProRecourseBTNinpopup() {
		try
    	{
    		WebElement ProRecourseBTNinpopupWebElement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(processRecpopup_xpath));
    		ProRecourseBTNinpopupWebElement.isDisplayed();
            return true;
    	}
    	catch(Exception e)
    	{
    	    return false;	
    	}
	}
	public boolean VerifyCanceBTN() {
		try
    	{
    		WebElement CanceBTNWebElement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(cancelBTN_xpath));
    		CanceBTNWebElement.isDisplayed();
            return true;
    	}
    	catch(Exception e)
    	{
    	    return false;	
    	}
	}
	public boolean ClickProcessRecourseBTN() {
		try
    	{
    		WebElement ProRecourseBTNinpopupWebElement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(processRecpopup_xpath));
    		ProRecourseBTNinpopupWebElement.click();
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
    		WebElement ErrorMsgWebElement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(errorMsg_xpath));
    		ErrorMsgWebElement.isDisplayed();
            return true;
    	}
    	catch(Exception e)
    	{
    	    return false;	
    	}
	}
	public boolean CloseErroMsg() {
		try
    	{
    		WebElement ProRecourseBTNinpopupWebElement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(closeErrorMsg_xpath));
    		ProRecourseBTNinpopupWebElement.click();
            return true;
    	}
    	catch(Exception e)
    	{
    	    return false;	
    	}
	}
	public boolean ClickCancelBTN() {
		try
    	{
    		WebElement CancelBTNWebElement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(cancelBTN_xpath));
    		CancelBTNWebElement.click();
            return true;
    	}
    	catch(Exception e)
    	{
    	    return false;	
    	}
	}
private final By Batch_xpath = By.xpath("/html[1]/body[1]/span[1]/span[1]/span[2]/ul[1]/li[2]");
private final By dropdown_xpath = By.xpath("/html[1]/body[1]/div[3]/div[1]/div[2]/div[4]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/span[1]/span[1]/span[1]/span[2]");
	public  boolean ClickonSelectBatchDropdown_reverse() {
		try {
			WebElement DropdownWebEelement = new WebDriverWait(driver, 100)
			.until(ExpectedConditions.visibilityOfElementLocated(dropdown_xpath));
			
			DropdownWebEelement.click();
			Thread.sleep(1000);
			
			WebElement DropWebEelement = new WebDriverWait(driver, 100)
			.until(ExpectedConditions.visibilityOfElementLocated(Batch_xpath));
			Thread.sleep(1000);
			DropWebEelement.click();
			
			
			
			/*Select sel = new Select(DropdownWebEelement);
			
			//sel.selectByIndex(1);
			
			List<WebElement> list = sel.getOptions();
			
			String batchno=list.get(1).getText();
			
			System.out.println("********************************"+batchno);*/
			
			/*for (WebElement ele:list) 
			{
				
				
			 		ele.click();
				
			}*/
			
		} 
		catch (Exception ex)
		{
			return false;
		}
		
		return true;	
	}
	
	public boolean ClickReverseButton() {
		try
    	{
    		WebElement RButtonWebEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(ReverseButton_xpath));
    		RButtonWebEelement.click();
    		return true;
    	}
    	catch(Exception e)
    	{
    		return false;
    	}
	}
	
	private final By Notification_xpath=By.xpath("//i[@class='fa fa-bell fa-2x']");
	private final By notificationMessage_xpath=By.xpath("/html[1]/body[1]/div[6]/div[2]/div[1]/div[3]/div[1]/div[1]/ul[1]/li[2]/div[2]");
	public boolean ClickonNotification(){
		try{
			WebElement notificationWebE=new WebDriverWait(driver, 100)
			.until(ExpectedConditions.visibilityOfElementLocated(Notification_xpath));
			notificationWebE.click();
			
		}
			catch(Exception e){
				
			
		}
		return true;
		
	}
	String actMsg ;
	public boolean verifyNotification(String expectedMsg)
	
	{
		
		try{
			WebElement notificationWebE=new WebDriverWait(driver, 100)
			.until(ExpectedConditions.visibilityOfElementLocated(notificationMessage_xpath));
			
			String msg=notificationWebE.getText();
			System.out.println("*********8888888888888888888888888888*******"+msg);
			actMsg=msg;
			   if(msg.contains(expectedMsg))
			       {
				   return true;
			       }
		
		    }
			catch(Exception e)
		                {
				
		                }
		
		System.out.println("*********8888888888888888888888888888*******"+actMsg);
		return true;	
	}
	
	
	
	
}