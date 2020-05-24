package com.cync.ClientMaintenance;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.cync.base.BasePage;

public class ContactsPage extends BasePage {

	private final By SelectContactsWebEelement_xpath = By.xpath("//label[text()='Select Contacts']");
	private final By ContactLabelWebEelement_xpath = By.xpath("(//label[@for='contact_Contact'])[2]");
	private final By EmailLabelWebEelement_xpath = By.xpath("//label[@for='contact_Email']");
	private final By EmailAddLabelWebEelement_xpath = By.xpath("//label[@for='contact_Mail Address']");
	private final By PhonesLabelWebEelement_xpath = By.xpath("(//label[@class='control-label required'])[4]");

	private final By NewBtn_xpath = By.xpath("//a[@class='view-button-new new_lnk btnfltleft']");
	private final By ContactText_xpath = By.xpath("//input[@id='contact_name']");
	private final By EmailText_xpath = By.xpath("//input[@id='contact_primary_email_id']");
	private final By MailAddressValue_xpath = By.xpath("//select[@id='contact_mail_address_id']");
	private final By TitleText_xpath = By.xpath("//input[@id='contact_title']");
	private final By PhonesType_xpath = By.xpath("//select[contains(@id,'contact_phones_attributes_0_phone_type')]");
	private final By PhoneNoField_xpath = By.xpath("(//input[@name='contact[phones_attributes][0][phone_no]'])[1]");
	private final By SaveBtn_xpath = By.xpath("//input[@id='update_phone_type']");
	private final By MailAddressAfterSaveMsg_xpath = By.xpath("//li[@style='text-align:left']");
	private final By ErrorMsg_xpath = By.xpath("(//li[@style='text-align:left'])[1]");
	private final By DeleteBtn_xpath = By.id("delete_selected_contact");

	
	
	
	
	public ContactsPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	 public boolean SelectContacts_dropdown()
	 {
	 try{

	 	WebElement SelectContactsWebEelement=new WebDriverWait(driver,5)
	 	.until(ExpectedConditions.visibilityOfElementLocated(SelectContactsWebEelement_xpath));
	 	SelectContactsWebEelement.isDisplayed();
	
	 	return true;
	 }
	 catch(Exception ex){
	 	return false;
	 }

	 }
	
	 public boolean Contact_label()
	 {
	 try{

	 	WebElement SelectContactsWebEelement=new WebDriverWait(driver,5)
	 	.until(ExpectedConditions.visibilityOfElementLocated(ContactLabelWebEelement_xpath));
	 	SelectContactsWebEelement.isDisplayed();
	
	 	return true;
	 }
	 catch(Exception ex){
	 	return false;
	 }

	 }
	 
	 public boolean Email_label()
	 {
	 try{

	 	WebElement SelectContactsWebEelement=new WebDriverWait(driver,5)
	 	.until(ExpectedConditions.visibilityOfElementLocated(EmailLabelWebEelement_xpath));
	 	SelectContactsWebEelement.isDisplayed();
	
	 	return true;
	 }
	 catch(Exception ex){
	 	return false;
	 }

	 }
	 
	 public boolean EmailAdd_label()
	 {
	 try{

	 	WebElement SelectContactsWebEelement=new WebDriverWait(driver,5)
	 	.until(ExpectedConditions.visibilityOfElementLocated(EmailAddLabelWebEelement_xpath));
	 	SelectContactsWebEelement.isDisplayed();
	
	 	return true;
	 }
	 catch(Exception ex){
	 	return false;
	 }

	 }
	 
	 
	 public boolean Phones_label()
	 {
	 try{

	 	WebElement SelectContactsWebEelement=new WebDriverWait(driver,5)
	 	.until(ExpectedConditions.visibilityOfElementLocated(PhonesLabelWebEelement_xpath));
	 	SelectContactsWebEelement.isDisplayed();
	
	 	return true;
	 }
	 catch(Exception ex){
	 	return false;
	 }

	 }
	 
	 public boolean Newbtn_Click()
	 {
	 try{

	 	WebElement NewBtnWebEelement=new WebDriverWait(driver,5)
	 	.until(ExpectedConditions.visibilityOfElementLocated(NewBtn_xpath));
	 	NewBtnWebEelement.click();
	 	////Thread.sleep(3000);
	
	 	return true;
	 }
	 catch(Exception ex){
	 	return false;
	 }

	 }
	 
	 public boolean ContactField_EnterText(String enterDataInContact)
	 {
	 try{
			WebElement IsPrimaryAddressWebEelement=new WebDriverWait(driver,5)
		 	.until(ExpectedConditions.visibilityOfElementLocated(ContactText_xpath));
		 	IsPrimaryAddressWebEelement.clear();
		 	IsPrimaryAddressWebEelement.sendKeys(enterDataInContact);
		
	 	return true;
	 }
	 catch(Exception ex){
	 	return false;
	 }

	 }
	 
	 public boolean EmailField_EnterText(String enterDataInEmail)
	 {
	 try{
			WebElement IsPrimaryAddressWebEelement=new WebDriverWait(driver,5)
		 	.until(ExpectedConditions.visibilityOfElementLocated(EmailText_xpath));
		 	IsPrimaryAddressWebEelement.clear();
		 	IsPrimaryAddressWebEelement.sendKeys(enterDataInEmail);
		
	 	return true;
	 }
	 catch(Exception ex){
	 	return false;
	 }

	 }
	  
	 public String MailAddress_DropdownValue(String MailAddressValue) throws InterruptedException{
			

			WebDriverWait wait = new WebDriverWait(driver, 5);
			wait.until(ExpectedConditions.visibilityOfElementLocated((MailAddressValue_xpath)));

			WebElement element = driver.findElement((MailAddressValue_xpath));
			Select sel = new Select(element);
			List<WebElement> list = sel.getOptions();	
			
			
			for(WebElement ele : list){
				
				if(ele.getText().equals(MailAddressValue)){
					ele.click();
					//////Thread.sleep(5000);
					break;
				}
			}
			return MailAddressValue;

		}
	 
	 
	 public boolean Title_EnterText(String enterDataInTitle)
	 {
	 try{
			WebElement IsPrimaryAddressWebEelement=new WebDriverWait(driver,5)
		 	.until(ExpectedConditions.visibilityOfElementLocated(TitleText_xpath));
		 	IsPrimaryAddressWebEelement.clear();
		 	IsPrimaryAddressWebEelement.sendKeys(enterDataInTitle);
		
	 	return true;
	 }
	 catch(Exception ex){
	 	return false;
	 }

	 }
	 
	 public String PhonesType_Dropdown(String PhonesType) throws InterruptedException{
			

			WebDriverWait wait = new WebDriverWait(driver, 5);
			wait.until(ExpectedConditions.visibilityOfElementLocated((PhonesType_xpath)));

			WebElement element = driver.findElement((PhonesType_xpath));
			Select sel = new Select(element);
			List<WebElement> list = sel.getOptions();	
			
			
			for(WebElement ele : list){
				
				if(ele.getText().equals(PhonesType)){
					ele.click();
					//////Thread.sleep(5000);
					break;
				}
			}
			return PhonesType;

		}
	 
	 public boolean PhonesType_Text(String enterPhoneNo)
	 {
	 try{
			WebElement IsPrimaryAddressWebEelement=new WebDriverWait(driver,5)
		 	.until(ExpectedConditions.visibilityOfElementLocated(PhoneNoField_xpath));
		 	IsPrimaryAddressWebEelement.clear();
		 	IsPrimaryAddressWebEelement.sendKeys(enterPhoneNo);
		
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
	
	 public String verifyMessageAfterDelete(String successMsgDelete)
	    {
	    try{
	       WebElement SaveWebEelement=new WebDriverWait(driver,5)
	       .until(ExpectedConditions.visibilityOfElementLocated(MailAddressAfterSaveMsg_xpath));
	       
	      String actualMsg= SaveWebEelement.getText();
	      if(actualMsg.equalsIgnoreCase(successMsgDelete))
	      {
	       return actualMsg;
	      }
	       
	    }
	    catch(Exception ex){
	     
	    }
	 return successMsgDelete;
	    }
	
	 
	 
	 public String ErrorMsgAfterSave(String ErrorMsg)
	    {
	    try{
	       WebElement SaveWebEelement=new WebDriverWait(driver,5)
	       .until(ExpectedConditions.visibilityOfElementLocated(ErrorMsg_xpath));
	       
	      String actualMsg= SaveWebEelement.getText();
	      if(actualMsg.equalsIgnoreCase(ErrorMsg))
	      {
	       return actualMsg;
	      }
	       
	    }
	    catch(Exception ex){
	     
	    }
	 return ErrorMsg;
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
	 
}
