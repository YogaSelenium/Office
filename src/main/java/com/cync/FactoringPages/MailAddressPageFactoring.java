package com.cync.FactoringPages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.cync.base.BasePage;

public class MailAddressPageFactoring extends BasePage
{
	private final By MailAddressPageFactoring_xpath = By.xpath("//span[@class='paneltitle']");
	private final By NewBTN_xpath=By.xpath("//*[@class='view-button-new new_lnk btnfltleft']");
	private final By primaryAddressChkBox_xpath=By.xpath("//input[@type='checkbox' and @name='mail_address[is_primary_addr]']");
	private final By AddressNameBox_xpath=By.xpath("//*[@id='mail_address_address_code']");
	private final By ContactNameBox_xpath=By.xpath("//*[@id='mail_address_name_primary']");
	private final By StreetAddressBox_xpath=By.xpath("//*[@id='mail_address_street_address']");
	private final By CityBox_xpath=By.xpath("//*[@id='mail_address_city']");
	private final By CountryDropDown_xpath=By.xpath("//select[@id='mail_address_country_id']");
	private final By StateProvinceDropDown_xpath=By.xpath("//select[@id='mail_address_state_province_id']");
	private final By ZipCode_xpath=By.xpath("//*[@id='mail_address_zip_code']");
	private final By PhoneTypeDropdown_xpath=By.xpath("//select[@id='mail_address_phones_attributes_0_phone_type']");
	private final By PhoneNoBox_xpath=By.xpath("//input[@id='mail_address_phones_attributes_0_phone_no']");
	private final By SaveBTN_xpath=By.xpath("//*[@id='save_address']");
	
	
	public MailAddressPageFactoring(WebDriver driver) {
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
			.until(ExpectedConditions.visibilityOfElementLocated(MailAddressPageFactoring_xpath));
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
	public boolean CheckOnPrimaryAddressCheckBox() {
		try
		{
			WebElement PrimaryCheckBoxWebElement = new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(primaryAddressChkBox_xpath));
			
			PrimaryCheckBoxWebElement.click();
			
			
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}
	public boolean addValuesToAddressNameTextBox(String addressname) {
		try
		{
			WebElement AddressNameTextBoxWebElement = new WebDriverWait(driver,100)
			.until(ExpectedConditions.elementToBeClickable(AddressNameBox_xpath));
			AddressNameTextBoxWebElement.clear();
			AddressNameTextBoxWebElement.sendKeys(addressname);
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
			.until(ExpectedConditions.elementToBeClickable(ContactNameBox_xpath));
			ContactNameTextBoxWebElement.clear();
			ContactNameTextBoxWebElement.sendKeys(contactname);
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
		
	}
	public boolean addValuesToStreetAddressBox(String streetaddress) {
		try
		{
			WebElement streetaddressTextBoxWebElement = new WebDriverWait(driver,100)
			.until(ExpectedConditions.elementToBeClickable(StreetAddressBox_xpath));
			streetaddressTextBoxWebElement.clear();
			streetaddressTextBoxWebElement.sendKeys(streetaddress);
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
		
	}
	
	public boolean addValuesToCityBox(String cityname) {
		try
		{
			WebElement citynameTextBoxWebElement = new WebDriverWait(driver,100)
			.until(ExpectedConditions.elementToBeClickable(CityBox_xpath));
			citynameTextBoxWebElement.clear();
			citynameTextBoxWebElement.sendKeys(cityname);
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
		
	}
	
	public boolean SelectCountryFromDropDown(String countryname) {
		try
		{
			WebElement DropdownWebElement = new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(CountryDropDown_xpath));
			Select sel = new Select(DropdownWebElement);
			List<WebElement> list = sel.getOptions();
			for (WebElement ele : list) {
				if (ele.getText().equals(countryname)) 
				       {
					ele.click();
					Thread.sleep(2000);
					break;
				       }
			
			}
			return true;
			}
		
		catch(Exception e)
		{
			return false;
		}
		}
	
	public boolean SelectStateProvinceDropdown(String statename) {
		try {
			WebElement SelectDebtorDropdownWebEelement = new WebDriverWait(
					driver, 100).until(ExpectedConditions
					.visibilityOfElementLocated(StateProvinceDropDown_xpath));
			Select sel = new Select(SelectDebtorDropdownWebEelement);
			List<WebElement> list = sel.getOptions();
			for (WebElement ele : list) {
				if (ele.getText().equals(statename)) {
					ele.click();
					Thread.sleep(1000);
					 return true;
				}
			}
		} catch (Exception ex) {
		}
		return false;
	}
	
	public boolean addValuesToZipCode(String zipcode) {
		try
		{
			WebElement citynameTextBoxWebElement = new WebDriverWait(driver,100)
			.until(ExpectedConditions.elementToBeClickable(ZipCode_xpath));
			//citynameTextBoxWebElement.clear();
			citynameTextBoxWebElement.sendKeys(zipcode);
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
		
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
