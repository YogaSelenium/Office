package com.cync.FactoringPages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.cync.base.BasePage;

public class ContactsPageFactoring extends BasePage
{
	private final By ContactsPageFactoring_xpath = By.xpath("//span[@class='paneltitle']");
	private final By NewBTN_xpath =By.xpath("//*[@class='view-button-new new_lnk btnfltleft']");
	private final By ContactName_xpath=By.xpath("//input[@id='contact_name']");
	private final By EmailBox_xpath=By.xpath("//input[@id='contact_primary_email_id']");
	private final By MaillingAddress_xpath=By.xpath("//*[@id='contact_mail_address_id']");
	
	private final By PhoneTypeDropdown_xpath=By.xpath("//select[@id='contact_phones_attributes_0_phone_type']");
	private final By PhoneNoBox_xpath=By.xpath("//input[@id='contact_phones_attributes_0_phone_no']");
	private final By SaveBTN_xpath =By.xpath("//input[@id='update_phone_type']");
	
	public ContactsPageFactoring(WebDriver driver) {
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
			.until(ExpectedConditions.visibilityOfElementLocated(ContactsPageFactoring_xpath));
		HeaderWebEelement.getText();
		Thread.sleep(2000);
    	}
    	catch(Exception e)
    	{
    		
    	}
    	return Header;
    }

	public boolean NewBTNClick()
	{
		try
		{
			WebElement NewBTNWebElement =new WebDriverWait(driver,100)
			.until(ExpectedConditions.elementToBeClickable(NewBTN_xpath));
			NewBTNWebElement.click();
			
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}
	public boolean addValuesToContactNameTextBox(String contactname) {
		try
		{
			WebElement ContactNameTextBoxWebElement = new WebDriverWait(driver,100)
			.until(ExpectedConditions.elementToBeClickable(ContactName_xpath));
			ContactNameTextBoxWebElement.clear();
			ContactNameTextBoxWebElement.sendKeys(contactname);
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
		
	}
	public boolean addValuesToEmailTextBox(String email) {
		try
		{
			WebElement ContactNameTextBoxWebElement = new WebDriverWait(driver,100)
			.until(ExpectedConditions.elementToBeClickable(EmailBox_xpath));
			ContactNameTextBoxWebElement.clear();
			ContactNameTextBoxWebElement.sendKeys(email);
			return true;
		}
		catch(Exception e)
		{
			return false;
		}	
	}
	public boolean SelectMaillingAddressDropdown() {
		try {
			Thread.sleep(1000);
			WebElement SelectDebtorDropdownWebEelement = new WebDriverWait(
					driver, 100).until(ExpectedConditions
					.visibilityOfElementLocated(MaillingAddress_xpath));
			SelectDebtorDropdownWebEelement.click();
			Select sel = new Select(SelectDebtorDropdownWebEelement);
			sel.selectByIndex(1);
			List<WebElement> list = sel.getOptions();
		//	for (WebElement ele : list) {
				//if (ele.getText().equals(statename)) {
					//ele.click();
					
					//Thread.sleep(1000);
				//	break;
					 //return true;
					 
				//}
			//}
			
		} catch (Exception ex) {
		}
		return true;
	}
	
	public boolean SelectPhoneType(String phonetype) {
		try {
			WebElement SelectPhoneTypeDropdownWebEelement = new WebDriverWait(
					driver, 100).until(ExpectedConditions
					.visibilityOfElementLocated(PhoneTypeDropdown_xpath));
			Select sel = new Select(SelectPhoneTypeDropdownWebEelement);
			List<WebElement> list = sel.getOptions();
			for (WebElement ele : list) {
				if (ele.getText().equals(phonetype)) {
					ele.click();
					Thread.sleep(1000);
					 return true;
				}
			}
		} catch (Exception ex) {
		}
		return false;
	}
	public boolean addValuesTophoneNumberBox(String phonenumber) {
		try
		{
			WebElement PhoneNoTextBoxWebElement = new WebDriverWait(driver,100)
			.until(ExpectedConditions.elementToBeClickable(PhoneNoBox_xpath));
			//TextBoxWebElement.clear();
			PhoneNoTextBoxWebElement.sendKeys(phonenumber);
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
		
	}
	public boolean SaveBTNClick()
	{
		try
		{
			WebElement SaveBTNWebElement =new WebDriverWait(driver,100)
			.until(ExpectedConditions.elementToBeClickable(SaveBTN_xpath));
			SaveBTNWebElement.click();
			
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}
	
	
}
