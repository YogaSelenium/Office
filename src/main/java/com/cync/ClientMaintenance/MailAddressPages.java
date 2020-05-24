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

public class MailAddressPages extends BasePage {
	
	private final By SelectMailAddressesWebEelement_xpath = By.xpath("//label[text()='Select Mail Addresses']");
	private final By IsPrimaryAddressWebEelement_xpath = By.xpath("//label[text()='Is Primary Address?']");
	private final By AddressCodeWebEelement_xpath = By.xpath("//label[text()='Address Code']");
	private final By ContactNameWebEelement_xpath = By.xpath("//label[text()='Contact Name']");
	private final By StreetAddressWebEelement_xpath = By.xpath("//label[text()='Street Address']");
	private final By CityWebEelement_xpath = By.xpath("//label[text()='City']");
	private final By CountryWebEelement_xpath = By.xpath("//label[text()='Country']");
	private final By StateProvinceWebEelement_xpath = By.xpath("//label[text()='State Province']");
	private final By ZipCodeWebEelement_xpath = By.xpath("//label[text()='Zip Code']");
	private final By PhonesWebEelement_xpath = By.xpath("//label[text()='Phones']");
	private final By SaveBtn_xpath = By.xpath("//input[@id='save_address']");
	private final By CancelBtn_xpath = By.xpath("//button[text()='Cancel']");
	private final By IsPrimaryAddressCheckOn_xpath = By.xpath("//input[@id='mail_address_is_primary_addr']");
	private final By NewBtn_xpath = By.xpath("//a[@class='view-button-new new_lnk btnfltleft']");

	private final By AddressCodeText_xpath = By.xpath("//input[@name='mail_address[address_code]']");
	private final By ContactNameText_xpath = By.xpath("//input[@name='mail_address[name_primary]']");
	private final By AltContactNameText_xpath = By.xpath("//input[@name='mail_address[name_alternate]']");
	private final By StreetAddressText_xpath = By.xpath("//textarea[@name='mail_address[street_address]']");
	private final By CityTextField_xpath = By.xpath("//input[@name='mail_address[city]']");
	private final By ZipCodeTextField_xpath = By.xpath("//input[@name='mail_address[zip_code]']");
	private final By PhonesType_xpath = By.xpath("//select[contains(@id,'mail_address_phones_attributes_0_phone_type')]");
	private final By PhoneNoField_xpath = By.xpath("(//input[@name='mail_address[phones_attributes][0][phone_no]'])[1]");
	private final By StateProvinceValue_xpath = By.xpath("//select[@id='mail_address_state_province_id']");
	private final By CountryValue_xpath = By.xpath("//select[@id='mail_address_country_id']");
	private final By MailAddressAfterSaveMsg_xpath = By.xpath("//li[@style='text-align:left']");
	private final By EditBtn_xpath = By.xpath("//a[text()='Edit']");
	private final By SelectMailAddressesdropdownValue_xpath = By.xpath("//select[@name='mail_address_id']");
	private final By DeleteBtn_xpath = By.xpath("//a[@class='view-button delete_lnk btnfltleft']");
	private final By ErrorMsg_xpath = By.xpath("(//li[@style='text-align:left'])[1]");

	
	
	
	
	

	public MailAddressPages(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	
	 public boolean SelectMailAddresses_dropdown()
	 {
	 try{

	 	WebElement SelectMailAddressesWebEelement=new WebDriverWait(driver,5)
	 	.until(ExpectedConditions.visibilityOfElementLocated(SelectMailAddressesWebEelement_xpath));
	 	SelectMailAddressesWebEelement.isDisplayed();
	
	 	return true;
	 }
	 catch(Exception ex){
	 	return false;
	 }

	 }
	 
	 public boolean IsPrimaryAddress_check()
	 {
	 try{

	 	WebElement IsPrimaryAddressWebEelement=new WebDriverWait(driver,5)
	 	.until(ExpectedConditions.visibilityOfElementLocated(IsPrimaryAddressWebEelement_xpath));
	 	IsPrimaryAddressWebEelement.isDisplayed();
	
	 	return true;
	 }
	 catch(Exception ex){
	 	return false;
	 }

	 }
	 

	 public boolean AddressCode_Text()
	 {
	 try{

	 	WebElement IsPrimaryAddressWebEelement=new WebDriverWait(driver,5)
	 	.until(ExpectedConditions.visibilityOfElementLocated(AddressCodeWebEelement_xpath));
	 	IsPrimaryAddressWebEelement.isDisplayed();
	
	 	return true;
	 }
	 catch(Exception ex){
	 	return false;
	 }

	 }

	 public boolean ContactName_Text()
	 {
	 try{

	 	WebElement IsPrimaryAddressWebEelement=new WebDriverWait(driver,5)
	 	.until(ExpectedConditions.visibilityOfElementLocated(ContactNameWebEelement_xpath));
	 	IsPrimaryAddressWebEelement.isDisplayed();
	
	 	return true;
	 }
	 catch(Exception ex){
	 	return false;
	 }

	 }

	 public boolean StreetAddress_Text()
	 {
	 try{

	 	WebElement IsPrimaryAddressWebEelement=new WebDriverWait(driver,5)
	 	.until(ExpectedConditions.visibilityOfElementLocated(StreetAddressWebEelement_xpath));
	 	IsPrimaryAddressWebEelement.isDisplayed();
	
	 	return true;
	 }
	 catch(Exception ex){
	 	return false;
	 }

	 }

	 public boolean CityField_Text()
	 {
	 try{

	 	WebElement IsPrimaryAddressWebEelement=new WebDriverWait(driver,5)
	 	.until(ExpectedConditions.visibilityOfElementLocated(CityWebEelement_xpath));
	 	IsPrimaryAddressWebEelement.isDisplayed();
	
	 	return true;
	 }
	 catch(Exception ex){
	 	return false;
	 }

	 }

	 public boolean CountryField_dropdown()
	 {
	 try{

	 	WebElement IsPrimaryAddressWebEelement=new WebDriverWait(driver,5)
	 	.until(ExpectedConditions.visibilityOfElementLocated(CountryWebEelement_xpath));
	 	IsPrimaryAddressWebEelement.isDisplayed();
	
	 	return true;
	 }
	 catch(Exception ex){
	 	return false;
	 }

	 }

	 public boolean StateProvince_dropdown()
	 {
	 try{

	 	WebElement IsPrimaryAddressWebEelement=new WebDriverWait(driver,5)
	 	.until(ExpectedConditions.visibilityOfElementLocated(StateProvinceWebEelement_xpath));
	 	IsPrimaryAddressWebEelement.isDisplayed();
	
	 	return true;
	 }
	 catch(Exception ex){
	 	return false;
	 }

	 }
	 public boolean ZipCode_Text()
	 {
	 try{

	 	WebElement IsPrimaryAddressWebEelement=new WebDriverWait(driver,5)
	 	.until(ExpectedConditions.visibilityOfElementLocated(ZipCodeWebEelement_xpath));
	 	IsPrimaryAddressWebEelement.isDisplayed();
	
	 	return true;
	 }
	 catch(Exception ex){
	 	return false;
	 }

	 }

	 public boolean Phones_dropdown()
	 {
	 try{

	 	WebElement IsPrimaryAddressWebEelement=new WebDriverWait(driver,5)
	 	.until(ExpectedConditions.visibilityOfElementLocated(PhonesWebEelement_xpath));
	 	IsPrimaryAddressWebEelement.isDisplayed();
	
	 	return true;
	 }
	 catch(Exception ex){
	 	return false;
	 }

	 }
	 
	 public boolean Save_Button()
	 {
	 try{

	 	WebElement SaveBtnWebEelement=new WebDriverWait(driver,5)
	 	.until(ExpectedConditions.visibilityOfElementLocated(SaveBtn_xpath));
	 	SaveBtnWebEelement.isDisplayed();
	
	 	return true;
	 }
	 catch(Exception ex){
	 	return false;
	 }

	 }
	 
	 public boolean Cancel_Button()
	 {
	 try{

	 	WebElement CancelBtnWebEelement=new WebDriverWait(driver,5)
	 	.until(ExpectedConditions.visibilityOfElementLocated(CancelBtn_xpath));
	 	CancelBtnWebEelement.isDisplayed();
	
	 	return true;
	 }
	 catch(Exception ex){
	 	return false;
	 }

	 }
	 
	 public boolean Newbtn()
	 {
	 try{

	 	WebElement NewBtnWebEelement=new WebDriverWait(driver,5)
	 	.until(ExpectedConditions.visibilityOfElementLocated(NewBtn_xpath));
	 	NewBtnWebEelement.isDisplayed();
	
	 	return true;
	 }
	 catch(Exception ex){
	 	return false;
	 }

	 }
	 
	 public boolean Newbtn_Click()
	 {
	 try{
		 
	 	WebElement NewBtnWebEelement=new WebDriverWait(driver,50)
	 	.until(ExpectedConditions.visibilityOfElementLocated(NewBtn_xpath));
	 	Thread.sleep(1000);
	 	NewBtnWebEelement.click();
	 ////Thread.sleep(2000);
	
	 	return true;
	 }
	 catch(Exception ex){
	 	return false;
	 }

	 }
	 
	 
	 
	 
	 public boolean IsPrimaryAdress_CheckOn(boolean flag){
		 try {
			   WebDriverWait wait = new WebDriverWait(driver, 5);
			   //////Thread.sleep(2000);
			   wait.until(ExpectedConditions.visibilityOfElementLocated(( IsPrimaryAddressCheckOn_xpath)));			   
			   WebElement element = driver.findElement((IsPrimaryAddressCheckOn_xpath));
			   if(flag){
			    if(!element.isSelected() == true){
			     element.click();
			
			    }
			   }else if(!flag){
			    if(element.isSelected() == true){
			     element.click();
			    

			    }
			   }   
			  } catch (Exception e) {
			  }
		return flag; 
}	
	 
	 public boolean AddressCode_EnterText(String enterTextAddressCode)
	 {
	 try{
        Thread.sleep(1000);
	 	WebElement IsPrimaryAddressWebEelement=new WebDriverWait(driver,50)
	 	.until(ExpectedConditions.visibilityOfElementLocated(AddressCodeText_xpath));
	 	//IsPrimaryAddressWebEelement.clear();
	 	IsPrimaryAddressWebEelement.sendKeys(enterTextAddressCode);
	
	 	return true;
	 }
	 catch(Exception ex){
	 	return false;
	 }

	 }

	 public boolean ContactName_EnterText(String enterContactName)
	 {
	 try{
		 Thread.sleep(1000);
			WebElement IsPrimaryAddressWebEelement=new WebDriverWait(driver,50)
		 	.until(ExpectedConditions.visibilityOfElementLocated(ContactNameText_xpath));
		 	IsPrimaryAddressWebEelement.clear();
		 	IsPrimaryAddressWebEelement.sendKeys(enterContactName);
		
	 	return true;
	 }
	 catch(Exception ex){
	 	return false;
	 }

	 }
	 
	 public boolean AltContactName_EnterText(String enterAltContactName)
	 {
	 try{
			WebElement IsPrimaryAddressWebEelement=new WebDriverWait(driver,5)
		 	.until(ExpectedConditions.visibilityOfElementLocated(AltContactNameText_xpath));
		 	IsPrimaryAddressWebEelement.clear();
		 	IsPrimaryAddressWebEelement.sendKeys(enterAltContactName);
		
	 	return true;
	 }
	 catch(Exception ex){
	 	return false;
	 }

	 }
	 
	 public boolean StreetAddress_EnterText(String enterStreetAddress)
	 {
	 try{
			WebElement IsPrimaryAddressWebEelement=new WebDriverWait(driver,5)
		 	.until(ExpectedConditions.visibilityOfElementLocated(StreetAddressText_xpath));
		 	IsPrimaryAddressWebEelement.clear();
		 	IsPrimaryAddressWebEelement.sendKeys(enterStreetAddress);
		
	 	return true;
	 }
	 catch(Exception ex){
	 	return false;
	 }

	 }
	 
	 public boolean City_EnterText(String enterCityText)
	 {
	 try{
			WebElement IsPrimaryAddressWebEelement=new WebDriverWait(driver,5)
		 	.until(ExpectedConditions.visibilityOfElementLocated(CityTextField_xpath));
		 	IsPrimaryAddressWebEelement.clear();
		 	IsPrimaryAddressWebEelement.sendKeys(enterCityText);
		
	 	return true;
	 }
	 catch(Exception ex){
	 	return false;
	 }

	 }
	 
	 public boolean ZipCode_EnterText(String enterZipCode)
	 {
	 try{
			WebElement IsPrimaryAddressWebEelement=new WebDriverWait(driver,100)
		 	.until(ExpectedConditions.visibilityOfElementLocated(ZipCodeTextField_xpath));
		 	IsPrimaryAddressWebEelement.clear();
		 	IsPrimaryAddressWebEelement.sendKeys(enterZipCode);
		
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
	 
	 public String StateProvince_DropdownValue(String StateProvinceValue) throws InterruptedException{
			

			WebDriverWait wait = new WebDriverWait(driver, 5);
			wait.until(ExpectedConditions.visibilityOfElementLocated((StateProvinceValue_xpath)));

			WebElement element = driver.findElement((StateProvinceValue_xpath));
			Select sel = new Select(element);
			List<WebElement> list = sel.getOptions();	
			
			
			for(WebElement ele : list){
				
				if(ele.getText().equals(StateProvinceValue)){
					ele.click();
					//////Thread.sleep(5000);
					break;
				}
			}
			return StateProvinceValue;

		}
	 
	 public String Country_DropdownValue(String CountryValue) throws InterruptedException{
			

			WebDriverWait wait = new WebDriverWait(driver, 5);
			wait.until(ExpectedConditions.visibilityOfElementLocated((CountryValue_xpath)));

			WebElement element = driver.findElement((CountryValue_xpath));
			Select sel = new Select(element);
			List<WebElement> list = sel.getOptions();	
			
			
			for(WebElement ele : list){
				
				if(ele.getText().equals(CountryValue)){
					ele.click();
					//////Thread.sleep(5000);
					break;
				}
			}
			return CountryValue;

		}
	 
	 public boolean Save_ButtonClick()
	 {
	 try{
     Thread.sleep(1000);
	 	WebElement SaveBtnWebEelement=new WebDriverWait(driver,50)
	 	.until(ExpectedConditions.visibilityOfElementLocated(SaveBtn_xpath));
	 	SaveBtnWebEelement.click();
	 	Thread.sleep(2000);
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
	
	
	 
	 public boolean  SelectMailAddressesClick()
	 {
	 try{

	 	WebElement SaveBtnWebEelement=new WebDriverWait(driver,5)
	 	.until(ExpectedConditions.visibilityOfElementLocated(SelectMailAddressesdropdownValue_xpath));
	 	SaveBtnWebEelement.click();
	 	//////Thread.sleep(5000);
	
	 	return true;
	 }
	 catch(Exception ex){
	 	return false;
	 }

	 }
	 
	 
/*	 public boolean SelectMailAddresses_DropdownValue(String EmailAddress)
	 {
	 try{
			WebElement IsPrimaryAddressWebEelement=new WebDriverWait(driver,100)
		 	.until(ExpectedConditions.visibilityOfElementLocated(SelectMailAddressesdropdownValue_xpath));
		 	IsPrimaryAddressWebEelement.sendKeys(EmailAddress);
		 	//////Thread.sleep(500);

		
	 	return true;
	 }
	 catch(Exception ex){
	 	return false;
	 }

	 }*/
	 
	 public String SelectMailAddresses_DropdownValue(String EmailAddress) throws InterruptedException{
			

			WebDriverWait wait = new WebDriverWait(driver, 5);
			wait.until(ExpectedConditions.visibilityOfElementLocated((SelectMailAddressesdropdownValue_xpath)));

			WebElement element = driver.findElement((SelectMailAddressesdropdownValue_xpath));
			Select sel = new Select(element);
			List<WebElement> list = sel.getOptions();	
			
			
			for(WebElement ele : list){
				
				if(ele.getText().equals(EmailAddress)){
					ele.click();
					//////Thread.sleep(10000);
					break;
				}
			}
			return EmailAddress;

		}
	
	 
	 public boolean Edit_Button()
	 {
	 try{
		////Thread.sleep(2000);
			
	 	WebElement EditBtnWebEelement=new WebDriverWait(driver,5)
	 	.until(ExpectedConditions.visibilityOfElementLocated(EditBtn_xpath));
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
       Thread.sleep(100);
	 	WebElement DeleteBtnWebEelement=new WebDriverWait(driver,10)
	 	.until(ExpectedConditions.visibilityOfElementLocated(DeleteBtn_xpath));
	 	DeleteBtnWebEelement.click();
	 	////Thread.sleep(500);
		Alert alertOK = driver.switchTo().alert();
		alertOK.accept();
		////Thread.sleep(500);
		
	
	 	return true;
	 }
	 catch(Exception ex){
	 	return false;
	 }

	 }
	 
	 public boolean ErrorMsg()
	 {
	 try{

	 	WebElement ErrorMsgWebEelement=new WebDriverWait(driver,5)
	 	.until(ExpectedConditions.visibilityOfElementLocated(ErrorMsg_xpath));
	 	ErrorMsgWebEelement.isDisplayed();
	 		
	 	return true;
	 }
	 catch(Exception ex){
	 	return false;
	 }

	 }
	 
	 
}
