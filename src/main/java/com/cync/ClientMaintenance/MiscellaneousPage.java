package com.cync.ClientMaintenance;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.cync.base.BasePage;

public class MiscellaneousPage extends BasePage {
	
	private final By NewBtn_xpath = By.xpath("//a[@class='view-button-new new_lnk']");
	private final By enterBankName_xpath = By.xpath("(//input[@id='miscellaneou_borrower_bank_name'])[2]");
	private final By enterBankRouting_xpath = By.xpath("(//input[@id='miscellaneou_borrower_bank_routing'])[2]");
	private final By enterBankAccount_xpath = By.xpath("(//input[@name='miscellaneou[borrower_bank_account]'])[3]");
	private final By enterLine1_xpath = By.xpath("(//input[@name='miscellaneou[borrower_remit_line1]'])[2]");
	private final By enterLine2_xpath = By.xpath("(//input[@name='miscellaneou[borrower_remit_line2]'])[2]");
	private final By enterLine3_xpath = By.xpath("(//input[@name='miscellaneou[borrower_remit_line3]'])[2]");
	private final By enterLine4_xpath = By.xpath("(//input[@name='miscellaneou[borrower_remit_line4]'])[2]");
	private final By SaveBtn_xpath = By.xpath("//input[@id='miscellaneous_submit']");
	private final By MailAddressAfterSaveMsg_xpath = By.xpath("//div[@class='ui-state-success']");
	private final By EditBtn_xpath = By.xpath("//a[@class='view-button edit_lnk_form pull-right']");
	private final By EditSaveBtn_xpath = By.xpath("//input[@class='view-button save_btn pull-right']");
	private final By DeleteBtn_xpath = By.xpath("//a[@class='view-button delete_lnk_form pull-right']");
	private final By MiscellaneousAfterDeleteMsg_xpath = By.xpath("//li[text()='Miscellaneous deleted successfully']");

	
	
	
	
	
	
	
	

	public MiscellaneousPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	
	 public boolean Newbtn()
	 {
	 try{

	 	WebElement NewBtnWebEelement=new WebDriverWait(driver,5)
	 	.until(ExpectedConditions.visibilityOfElementLocated(NewBtn_xpath));
	 	NewBtnWebEelement.isDisplayed();
	 	NewBtnWebEelement.click();
	 	//////Thread.sleep(500);
	
	 	return true;
	 }
	 catch(Exception ex){
	 	return false;
	 }

	 }
	 
	 public boolean BankName_EnterText(String enterBankName)
	 {
	 try{

	 	WebElement enterBankNameWebEelement=new WebDriverWait(driver,5)
	 	.until(ExpectedConditions.visibilityOfElementLocated(enterBankName_xpath));
	 	enterBankNameWebEelement.isDisplayed();
	 	enterBankNameWebEelement.clear();
	 	enterBankNameWebEelement.sendKeys(enterBankName);
	
	 	return true;
	 }
	 catch(Exception ex){
	 	return false;
	 }

	 }
	 
	 public boolean BankRouting_EnterText(String enterBankRouting)
	 {
	 try{

	 	WebElement enterBankRoutingWebEelement=new WebDriverWait(driver,5)
	 	.until(ExpectedConditions.visibilityOfElementLocated(enterBankRouting_xpath));
	 	enterBankRoutingWebEelement.isDisplayed();
	 	enterBankRoutingWebEelement.clear();
	 	enterBankRoutingWebEelement.sendKeys(enterBankRouting);
	
	 	return true;
	 }
	 catch(Exception ex){
	 	return false;
	 }

	 }
	
	 public boolean BankAccount_EnterText(String enterBankAccount)
	 {
	 try{

	 	WebElement enterBankRoutingWebEelement=new WebDriverWait(driver,5)
	 	.until(ExpectedConditions.visibilityOfElementLocated(enterBankAccount_xpath));
	 	enterBankRoutingWebEelement.isDisplayed();
	 	enterBankRoutingWebEelement.clear();
	 	enterBankRoutingWebEelement.sendKeys(enterBankAccount);
	
	 	return true;
	 }
	 catch(Exception ex){
	 	return false;
	 }

	 }
	 
	 public boolean RemitToLine1_EnterText(String enterLine1)
	 {
	 try{

	 	WebElement enterBankRoutingWebEelement=new WebDriverWait(driver,5)
	 	.until(ExpectedConditions.visibilityOfElementLocated(enterLine1_xpath));
	 	enterBankRoutingWebEelement.isDisplayed();
	 	enterBankRoutingWebEelement.clear();
	 	enterBankRoutingWebEelement.sendKeys(enterLine1);
	
	 	return true;
	 }
	 catch(Exception ex){
	 	return false;
	 }

	 }
	 
	 public boolean RemitToLine2_EnterText(String enterLine2)
	 {
	 try{

	 	WebElement enterBankRoutingWebEelement=new WebDriverWait(driver,5)
	 	.until(ExpectedConditions.visibilityOfElementLocated(enterLine2_xpath));
	 	enterBankRoutingWebEelement.isDisplayed();
	 	enterBankRoutingWebEelement.clear();
	 	enterBankRoutingWebEelement.sendKeys(enterLine2);
	
	 	return true;
	 }
	 catch(Exception ex){
	 	return false;
	 }

	 }
	 public boolean RemitToLine3_EnterText(String enterLine3)
	 {
	 try{

	 	WebElement enterBankRoutingWebEelement=new WebDriverWait(driver,5)
	 	.until(ExpectedConditions.visibilityOfElementLocated(enterLine3_xpath));
	 	enterBankRoutingWebEelement.isDisplayed();
	 	enterBankRoutingWebEelement.clear();
	 	enterBankRoutingWebEelement.sendKeys(enterLine3);
	
	 	return true;
	 }
	 catch(Exception ex){
	 	return false;
	 }

	 }
	 public boolean RemitToLine4_EnterText(String enterLine4)
	 {
	 try{

	 	WebElement enterBankRoutingWebEelement=new WebDriverWait(driver,5)
	 	.until(ExpectedConditions.visibilityOfElementLocated(enterLine4_xpath));
	 	enterBankRoutingWebEelement.isDisplayed();
	 	enterBankRoutingWebEelement.clear();
	 	enterBankRoutingWebEelement.sendKeys(enterLine4);
	
	 	return true;
	 }
	 catch(Exception ex){
	 	return false;
	 }

	 }
	 
	 public boolean Save_ButtonClick()
	 {
	 try{

	 	WebElement SaveBtnWebEelement=new WebDriverWait(driver,5)
	 	.until(ExpectedConditions.visibilityOfElementLocated(SaveBtn_xpath));
	 	SaveBtnWebEelement.click();
	
	 	return true;
	 }
	 catch(Exception ex){
	 	return false;
	 }

	 }
	 
	 public String verifyMessageAfterSave(String successMsg)
	    {
	    try{
	       WebElement SaveWebEelement=new WebDriverWait(driver,5)
	       .until(ExpectedConditions.visibilityOfElementLocated(MailAddressAfterSaveMsg_xpath));
	       
	      String actualMsg= SaveWebEelement.getText();
	      if(actualMsg.equalsIgnoreCase(successMsg))
	      {
	       return actualMsg;
	      }
	       
	    }
	    catch(Exception ex){
	     
	    }
	 return successMsg;
	    }
	
	 public boolean Edit_ButtonClick()
	 {
	 try{

	 	WebElement EditBtnWebEelement=new WebDriverWait(driver,5)
	 	.until(ExpectedConditions.visibilityOfElementLocated(EditBtn_xpath));
	 	EditBtnWebEelement.click();
	
	 	return true;
	 }
	 catch(Exception ex){
	 	return false;
	 }

	 }
	 
	 public boolean EditSave_ButtonClick()
	 {
	 try{

	 	WebElement EditBtnWebEelement=new WebDriverWait(driver,5)
	 	.until(ExpectedConditions.visibilityOfElementLocated(EditSaveBtn_xpath));
	 	EditBtnWebEelement.click();
	
	 	return true;
	 }
	 catch(Exception ex){
	 	return false;
	 }

	 }
	 
	 public boolean Delete_Button()
	 {
	 try{

	 	WebElement DeleteBtnWebEelement=new WebDriverWait(driver,5)
	 	.until(ExpectedConditions.visibilityOfElementLocated(DeleteBtn_xpath));
	 	DeleteBtnWebEelement.click();
	 	//////Thread.sleep(500);
		Alert alertOK = driver.switchTo().alert();
		alertOK.accept();
		//////Thread.sleep(500);
		
	
	 	return true;
	 }
	 catch(Exception ex){
	 	return false;
	 }

	 }
	 
	 public String verifyMessageAfterDelete(String DeletesuccessMsg)
	    {
	    try{
	       WebElement DeleteWebEelement=new WebDriverWait(driver,5)
	       .until(ExpectedConditions.visibilityOfElementLocated(MiscellaneousAfterDeleteMsg_xpath));
	       
	      String actualMsg= DeleteWebEelement.getText();
	      if(actualMsg.equalsIgnoreCase(DeletesuccessMsg))
	      {
	       return actualMsg;
	      }
	       
	    }
	    catch(Exception ex){
	     
	    }
	 return DeletesuccessMsg;
	    }
	
	 
	 
}
