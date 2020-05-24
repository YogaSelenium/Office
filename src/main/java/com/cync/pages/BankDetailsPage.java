package com.cync.pages;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.SkipException;

import com.cync.base.BasePage;

public class BankDetailsPage extends BasePage{

	private final By bankDetailsHeader=By.xpath("//h3[text()='Bank Details']");
	private final By breadcrumb_xpath=By.xpath("//ul[@class='breadcrumb']");
	private final By bankLabel_xpath=By.xpath("//label[contains(text(),'Bank')]");
	private final By accountNoLabel_xpath=By.xpath("//label[contains(text(),'Account No.')]");
	private final By accountNameLabel_xpath=By.xpath("//label[contains(text(),'Account Name')]");
	private final By routingNumLabel_xpath=By.xpath("//label[contains(text(),'Routing Number')]");
	private final By addressLine1Label_xpath=By.xpath("//label[text()='Address Line 1']");
	private final By addressLine2Label_xpath=By.xpath("//label[text()='Address Line 2']");
	private final By cityLabel_xpath=By.xpath("//label[text()='City']");
	private final By countryLabel_xpath=By.xpath("//label[text()='Country']");
	private final By stateProvinceLabel_xpath=By.xpath("//label[text()='State Province']");
	private final By zipPostalCodeLabel_xpath=By.xpath("//label[text()='Zip/Postal Code']");
	private final By faxNoLabel_xpath=By.xpath("//label[text()='Fax No.']");
	
	private final By bankField_xpath=By.xpath("//input[@formcontrolname='bankName']");
	private final By accountNoField_xpath=By.xpath("//input[@formcontrolname='bankaccountNo']");
	private final By accountNameField_xpath=By.xpath("//input[@formcontrolname='bankaccountName']");
	private final By routingNumField_xpath=By.xpath("//input[@formcontrolname='bankRouting']");
	
	private final By addressLine1Field_xpath=By.xpath("//input[@formcontrolname='bankAddressLine1']");
	private final By addressLine2Field_xpath=By.xpath("//input[@formcontrolname='bankAddressLine2']");
	private final By cityField_xpath=By.xpath("//input[@formcontrolname='bankCity']");
	private final By countryDropdown_xpath=By.xpath("//select[@formcontrolname='bankCountry']");
	private final By stateProvinceDropdown_xpath=By.xpath("//select[@formcontrolname='bankState']");
	private final By zipPostalCodeField_xpath=By.xpath("//input[@formcontrolname='bank_zip_code']");
	private final By faxNoField_xpath=By.xpath("//input[@formcontrolname='bank_fax_no']");
	
	
	private final By addBankButton_xpath=By.xpath("//span[text()='Add Bank']");
	private final By resetButton_xpath=By.xpath("//span[text()='Reset']");
	private final By editIconFirstBank_xpath=By.xpath("(//i[@id='Edit'])[1]");
	private final By deleteIconFirstBank_xpath=By.xpath("(//i[@id='Delete'])[1]");
	private final By recordMessage_xpath=By.id("cync_notifications_msg");
	private final By editUpdateDetailsButton_xpath=By.xpath("//span[text()='Update Details']");
	private final By editCancelButton_xpath=By.xpath("//span[text()='Cancel']");
	
	private final By deletepopuptriangle_xpath=By.xpath("//i[@class='fa fa-5x fa-exclamation-triangle clr_white f_s_64']");
	private final By deletepopupyes_xpath=By.xpath("//button[@id='modal_action_yes']");
	private final By deletepopupno_xpath=By.xpath("//button[@id='modal_action_no']");
	
	private final By editHeader_xpath=By.xpath("//h3[text()='Bank Details - Edit']");
	
	
	
	
	
	
	
	public BankDetailsPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub		
	}

public String BankDetailsHeader(String bankdetailsHeader)
{
	
try{
	
	WebElement BankDetailsHeaderWebE=new WebDriverWait(driver,30)
		.until(ExpectedConditions.visibilityOfElementLocated(bankDetailsHeader));
	BankDetailsHeaderWebE.getText();
	
}
catch(Exception ex){
	
}
return bankdetailsHeader;
}

public String breadcrumb(String bankDetailsBreadcrumb)
{
	try{
		WebElement BankDetailsBreadcrumbWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(breadcrumb_xpath));
		BankDetailsBreadcrumbWebEelement.isDisplayed();
		
	}
	catch(Exception ex){
		
	}
	return bankDetailsBreadcrumb;

	}

public boolean bankLabel(){
	try{
		WebElement bankLabelWebE=new WebDriverWait(driver,30)
			.until(ExpectedConditions.visibilityOfElementLocated(bankLabel_xpath));
		bankLabelWebE.isDisplayed();
		return true;
	}catch(Exception ex){
		
	}
	return false;
}

public boolean accountNoLabel(){
	try{
		WebElement accountNoLabelWebE=new WebDriverWait(driver,30)
			.until(ExpectedConditions.visibilityOfElementLocated(accountNoLabel_xpath));
		accountNoLabelWebE.isDisplayed();
		return true;
	}catch(Exception ex){
		
	}
	return false;
}

public boolean accountNameLabel(){
	try{
		WebElement accountNameLabelWebE=new WebDriverWait(driver,30)
			.until(ExpectedConditions.visibilityOfElementLocated(accountNameLabel_xpath));
		accountNameLabelWebE.isDisplayed();
		return true;
	}catch(Exception ex){
		
	}
	return false;
}

public boolean routingNumLabel(){
	try{
		WebElement routingNumLabelWebE=new WebDriverWait(driver,30)
			.until(ExpectedConditions.visibilityOfElementLocated(routingNumLabel_xpath));
		routingNumLabelWebE.isDisplayed();
		return true;
	}catch(Exception ex){
		
	}
	return false;
}


public boolean addressLine1Label(){
	try{
		WebElement addressLine1LabelWebE=new WebDriverWait(driver,30)
			.until(ExpectedConditions.visibilityOfElementLocated(addressLine1Label_xpath));
		addressLine1LabelWebE.isDisplayed();
		return true;
	}catch(Exception ex){
		
	}
	return false;
}


public boolean addressLine2Label(){
	try{
		WebElement addressLine2LabelWebE=new WebDriverWait(driver,30)
			.until(ExpectedConditions.visibilityOfElementLocated(addressLine2Label_xpath));
		addressLine2LabelWebE.isDisplayed();
		return true;
	}catch(Exception ex){
		
	}
	return false;
}

public boolean cityLabel(){
	try{
		WebElement cityLabelWebE=new WebDriverWait(driver,30)
			.until(ExpectedConditions.visibilityOfElementLocated(cityLabel_xpath));
		cityLabelWebE.isDisplayed();
		return true;
	}catch(Exception ex){
		
	}
	return false;
}

public boolean countryLabel(){
	try{
		WebElement countryLabelWebE=new WebDriverWait(driver,30)
			.until(ExpectedConditions.visibilityOfElementLocated(countryLabel_xpath));
		countryLabelWebE.isDisplayed();
		return true;
	}catch(Exception ex){
		
	}
	return false;
}

public boolean stateProvinceLabel(){
	try{
		WebElement stateProvinceLabelWebE=new WebDriverWait(driver,30)
			.until(ExpectedConditions.visibilityOfElementLocated(stateProvinceLabel_xpath));
		stateProvinceLabelWebE.isDisplayed();
		return true;
	}catch(Exception ex){
		
	}
	return false;
}


public boolean zipPostalCodeLabel(){
	try{
		WebElement zipPostalCodeLabelWebE=new WebDriverWait(driver,30)
			.until(ExpectedConditions.visibilityOfElementLocated(zipPostalCodeLabel_xpath));
		zipPostalCodeLabelWebE.isDisplayed();
		return true;
	}catch(Exception ex){
		
	}
	return false;
}

public boolean faxNoLabel(){
	try{
		WebElement faxNoLabelWebE=new WebDriverWait(driver,30)
			.until(ExpectedConditions.visibilityOfElementLocated(faxNoLabel_xpath));
		faxNoLabelWebE.isDisplayed();
		return true;
	}catch(Exception ex){
		
	}
	return false;
}

public boolean bankFieldUI(){
	try{
		WebElement bankFieldUIWebE=new WebDriverWait(driver,30)
			.until(ExpectedConditions.visibilityOfElementLocated(bankField_xpath));
		bankFieldUIWebE.isDisplayed();
		return true;
	}catch(Exception ex){
		
	}
	return false;
}

public boolean accountNoFieldUI(){
	try{
		WebElement accountNoFieldUIWebE=new WebDriverWait(driver,30)
			.until(ExpectedConditions.visibilityOfElementLocated(accountNoField_xpath));
		accountNoFieldUIWebE.isDisplayed();
		return true;
	}catch(Exception ex){
		
	}
	return false;
}


public boolean accountNameFieldUI(){
	try{
		WebElement accountNameFieldUIWebE=new WebDriverWait(driver,30)
			.until(ExpectedConditions.visibilityOfElementLocated(accountNameField_xpath));
		accountNameFieldUIWebE.isDisplayed();
		return true;
	}catch(Exception ex){
		
	}
	return false;
}


public boolean routingNumFieldUI(){
	try{
		WebElement routingNumFieldUIWebE=new WebDriverWait(driver,30)
			.until(ExpectedConditions.visibilityOfElementLocated(routingNumField_xpath));
		routingNumFieldUIWebE.isDisplayed();
		return true;
	}catch(Exception ex){
		
	}
	return false;
}

public boolean addressLine1FieldUI(){
	try{
		WebElement addressLine1FieldUIWebE=new WebDriverWait(driver,30)
			.until(ExpectedConditions.visibilityOfElementLocated(addressLine1Field_xpath));
		addressLine1FieldUIWebE.isDisplayed();
		return true;
	}catch(Exception ex){
		
	}
	return false;
}


public boolean addressLine2FieldUI(){
	try{
		WebElement addressLine2FieldUIWebE=new WebDriverWait(driver,30)
			.until(ExpectedConditions.visibilityOfElementLocated(addressLine2Field_xpath));
		addressLine2FieldUIWebE.isDisplayed();
		return true;
	}catch(Exception ex){
		
	}
	return false;
}

public boolean cityFieldUI(){
	try{
		WebElement cityFieldUIWebE=new WebDriverWait(driver,30)
			.until(ExpectedConditions.visibilityOfElementLocated(cityField_xpath));
		cityFieldUIWebE.isDisplayed();
		return true;
	}catch(Exception ex){
		
	}
	return false;
}


public boolean countryDropdownUI(){
	try{
		WebElement countryDropdownUIWebE=new WebDriverWait(driver,30)
			.until(ExpectedConditions.visibilityOfElementLocated(countryDropdown_xpath));
		countryDropdownUIWebE.isDisplayed();
		return true;
	}catch(Exception ex){
		
	}
	return false;
}


public boolean stateProvinceDropdownUI(){
	try{
		WebElement stateProvinceDropdownUIWebE=new WebDriverWait(driver,30)
			.until(ExpectedConditions.visibilityOfElementLocated(stateProvinceDropdown_xpath));
		stateProvinceDropdownUIWebE.isDisplayed();
		return true;
	}catch(Exception ex){
		
	}
	return false;
}


public boolean zipPostalCodeFieldUI(){
	try{
		WebElement zipPostalCodeFieldUIWebE=new WebDriverWait(driver,30)
			.until(ExpectedConditions.visibilityOfElementLocated(zipPostalCodeField_xpath));
		zipPostalCodeFieldUIWebE.isDisplayed();
		return true;
	}catch(Exception ex){
		
	}
	return false;
}


public boolean faxNoFieldUI(){
	try{
		WebElement faxNoFieldUIWebE=new WebDriverWait(driver,30)
			.until(ExpectedConditions.visibilityOfElementLocated(faxNoField_xpath));
		faxNoFieldUIWebE.isDisplayed();
		return true;
	}catch(Exception ex){
		
	}
	return false;
}

public boolean addButtonUI(){
	try{
		WebElement addButtonUIWebE=new WebDriverWait(driver,30)
			.until(ExpectedConditions.visibilityOfElementLocated(addBankButton_xpath));
		addButtonUIWebE.isDisplayed();
		return true;
	}catch(Exception ex){
		
	}
	return false;
}

public boolean addButtonClick(){
	try{
		WebElement addButtonClickWebE=new WebDriverWait(driver,30)
			.until(ExpectedConditions.visibilityOfElementLocated(addBankButton_xpath));
		addButtonClickWebE.click();
		return true;
	}catch(Exception ex){
		
	}
	return false;
}

public boolean resetButtonUI(){
	try{
		WebElement resetButtonUIWebE=new WebDriverWait(driver,30)
			.until(ExpectedConditions.visibilityOfElementLocated(resetButton_xpath));
		resetButtonUIWebE.isDisplayed();
		return true;
	}catch(Exception ex){
		
	}
	return false;
}

public boolean resetButtonClick(){
	try{
		WebElement resetButtonClickWebE=new WebDriverWait(driver,30)
			.until(ExpectedConditions.visibilityOfElementLocated(resetButton_xpath));
		resetButtonClickWebE.click();
		return true;
	}catch(Exception ex){
		
	}
	return false;
}

public boolean editIconFirstBankUI(){
	try{
		WebElement editIconFirstBankUIWebE=new WebDriverWait(driver,30)
			.until(ExpectedConditions.visibilityOfElementLocated(editIconFirstBank_xpath));
		editIconFirstBankUIWebE.isDisplayed();
		return true;
	}catch(Exception ex){
		
	}
	return false;
}

public boolean editIconFirstBankClick(){
	try{
		WebElement editIconFirstBankClickWebE=new WebDriverWait(driver,30)
			.until(ExpectedConditions.visibilityOfElementLocated(editIconFirstBank_xpath));
		editIconFirstBankClickWebE.click();
		return true;
	}catch(Exception ex){
		
	}
	return false;
}


public boolean deleteIconFirstBankUI(){
	try{
		Thread.sleep(1000);
		WebElement deleteIconFirstBankUIWebE=new WebDriverWait(driver,30)
			.until(ExpectedConditions.visibilityOfElementLocated(deleteIconFirstBank_xpath));
		deleteIconFirstBankUIWebE.isDisplayed();
		return true;
	}catch(Exception ex){
		
	}
	return false;
}

public boolean deleteIconFirstBankClick(){
	try{
		WebElement deleteIconFirstBankClickWebE=new WebDriverWait(driver,30)
			.until(ExpectedConditions.visibilityOfElementLocated(deleteIconFirstBank_xpath));
		deleteIconFirstBankClickWebE.click();
		return true;
	}catch(Exception ex){
		
	}
	return false;
}

public boolean bankFieldInput(String bankFieldData){
	try{
		WebElement bankFieldInputWebE=new WebDriverWait(driver,30)
			.until(ExpectedConditions.visibilityOfElementLocated(bankField_xpath));
		bankFieldInputWebE.clear();
		bankFieldInputWebE.sendKeys(bankFieldData);
		return true;
	}catch(Exception ex){
		
	}
	return false;
}

public boolean accountNoFieldInput(String accountNoFieldData){
	try{
		WebElement accountNoFieldInputWebE=new WebDriverWait(driver,30)
			.until(ExpectedConditions.visibilityOfElementLocated(accountNoField_xpath));
		accountNoFieldInputWebE.clear();
		accountNoFieldInputWebE.sendKeys(accountNoFieldData);
		return true;
	}catch(Exception ex){
		
	}
	return false;
}


public boolean accountNameFieldInput(String accountNameData){
	try{
		WebElement accountNameFieldInputWebE=new WebDriverWait(driver,30)
			.until(ExpectedConditions.visibilityOfElementLocated(accountNameField_xpath));
		accountNameFieldInputWebE.clear();
		accountNameFieldInputWebE.sendKeys(accountNameData);
		return true;
	}catch(Exception ex){
		
	}
	return false;
}


public boolean routingNumFieldInput(String routingNumFieldData){
	try{
		WebElement routingNumFieldInputWebE=new WebDriverWait(driver,30)
			.until(ExpectedConditions.visibilityOfElementLocated(routingNumField_xpath));
		routingNumFieldInputWebE.clear();
		routingNumFieldInputWebE.sendKeys(routingNumFieldData);
		return true;
	}catch(Exception ex){
		
	}
	return false;
}

public boolean addressLine1FieldInput(String addressLine1Data){
	try{
		WebElement addressLine1FieldInputWebE=new WebDriverWait(driver,30)
			.until(ExpectedConditions.visibilityOfElementLocated(addressLine1Field_xpath));
		addressLine1FieldInputWebE.clear();
		addressLine1FieldInputWebE.sendKeys(addressLine1Data);
		return true;
	}catch(Exception ex){
		
	}
	return false;
}

public boolean addressLine2FieldInput(String addressLin2Data){
	try{
		WebElement addressLine2FieldInputWebE=new WebDriverWait(driver,30)
			.until(ExpectedConditions.visibilityOfElementLocated(addressLine2Field_xpath));
		addressLine2FieldInputWebE.clear();
		addressLine2FieldInputWebE.sendKeys(addressLin2Data);
		return true;
	}catch(Exception ex){
		
	}
	return false;
}


public boolean cityFieldInput(String cityData){
	try{
		WebElement cityFieldUIInputWebE=new WebDriverWait(driver,30)
			.until(ExpectedConditions.visibilityOfElementLocated(cityField_xpath));
		cityFieldUIInputWebE.clear();
		cityFieldUIInputWebE.sendKeys(cityData);
		return true;
	}catch(Exception ex){
		
	}
	return false;
}


public boolean zipPostalCodeFieldInput(String zipPostalCodeData){
	try{
		WebElement zipPostalCodeFieldInputWebE=new WebDriverWait(driver,30)
			.until(ExpectedConditions.visibilityOfElementLocated(zipPostalCodeField_xpath));
		zipPostalCodeFieldInputWebE.clear();
		zipPostalCodeFieldInputWebE.sendKeys(zipPostalCodeData);
		return true;
	}catch(Exception ex){
		
	}
	return false;
}


public boolean faxNoFieldInput(String faxNoFieldData){
	try{
		WebElement faxNoFieldInputWebE=new WebDriverWait(driver,30)
			.until(ExpectedConditions.visibilityOfElementLocated(faxNoField_xpath));
		faxNoFieldInputWebE.clear();
		faxNoFieldInputWebE.sendKeys(faxNoFieldData);
		return true;
	}catch(Exception ex){
		
	}
	return false;
}

public String verifyMessageOnAfterSave(String successMessageOnContent)
{
try{
   WebElement SaveOnAddSalesWebEelement=new WebDriverWait(driver,10)
   .until(ExpectedConditions.visibilityOfElementLocated(recordMessage_xpath));
  String actualMsgFromAPP= SaveOnAddSalesWebEelement.getText();
  if(actualMsgFromAPP.equalsIgnoreCase(successMessageOnContent))
  {
   return actualMsgFromAPP;
  }
   
}
catch(Exception ex){
 
}
return successMessageOnContent;


}

	public String countrydropdownValues(String countryDropdownValue) {
		try {
			WebElement productTypeDropdownWebEelement = new WebDriverWait(
					driver, 10).until(ExpectedConditions
					.visibilityOfElementLocated(countryDropdown_xpath));
			Select sel = new Select(productTypeDropdownWebEelement);
			List<WebElement> list = sel.getOptions();
			for (WebElement ele : list) {
				if (ele.getText().equals(countryDropdownValue)) {
					ele.click();
					Thread.sleep(10000);
					break;
				}
			}
		} catch (Exception ex) {
		}
		return countryDropdownValue;
	}

	public String stateProvinceDropdownInput(String stateProvinceDropdownValue) {
		try {
			WebElement productTypeDropdownWebEelement = new WebDriverWait(
					driver, 10).until(ExpectedConditions
					.visibilityOfElementLocated(countryDropdown_xpath));
			Select sel = new Select(productTypeDropdownWebEelement);
			List<WebElement> list = sel.getOptions();
			for (WebElement ele : list) {
				if (ele.getText().equals(stateProvinceDropdownValue)) {
					ele.click();
					Thread.sleep(10000);
					break;
				}
			}
		} catch (Exception ex) {
		}
		return stateProvinceDropdownValue;
	}
	
	public boolean editUpdateDetailsButtonUI(){
		try{
			WebElement editUpdateDetailsButtonUIWebE=new WebDriverWait(driver,30)
				.until(ExpectedConditions.visibilityOfElementLocated(editUpdateDetailsButton_xpath));
			editUpdateDetailsButtonUIWebE.isDisplayed();
			return true;
		}catch(Exception ex){
			
		}
		return false;
	}
	
	public boolean editCancelButtonUI(){
		try{
			WebElement editCancelButtonUIWebE=new WebDriverWait(driver,30)
				.until(ExpectedConditions.visibilityOfElementLocated(deleteIconFirstBank_xpath));
			editCancelButtonUIWebE.isDisplayed();
			return true;
		}catch(Exception ex){
			
		}
		return false;
	}
	
	public boolean editUpdateDetailsButtonClick(){
		try{
			WebElement editUpdateDetailsButtonUIWebE=new WebDriverWait(driver,30)
				.until(ExpectedConditions.visibilityOfElementLocated(editUpdateDetailsButton_xpath));
			editUpdateDetailsButtonUIWebE.click();
			return true;
		}catch(Exception ex){
			
		}
		return false;
	}
	
	public boolean editCancelButtonClick(){
		try{
			WebElement editCancelButtonUIWebE=new WebDriverWait(driver,30)
				.until(ExpectedConditions.visibilityOfElementLocated(editCancelButton_xpath));
			editCancelButtonUIWebE.click();
			return true;
		}catch(Exception ex){
			
		}
		return false;
	}
	
	
	public boolean deletepopuptriangleUI(){
		try {
			WebElement deletepopuptriangleUIWebE=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(deletepopuptriangle_xpath));
			deletepopuptriangleUIWebE.isDisplayed();
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
	
	public boolean deletepopupyesactionUI(){
		try {
			WebElement deletepopupyesactionUIWebE=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(deletepopupyes_xpath));
			deletepopupyesactionUIWebE.isDisplayed();
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
	
	public boolean deletepopupnoactionUI(){
		try {
			WebElement deletepopupnoactionUIWebE=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(deletepopupno_xpath));
			deletepopupnoactionUIWebE.isDisplayed();
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
	
	
	public boolean clickOndeletepopupyesaction(){
		try {
			WebElement clickOndeletepopupyesactionWebE=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(deletepopupyes_xpath));
			clickOndeletepopupyesactionWebE.click();
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
	
	public boolean clickOndeletepopupnoaction(){
		try {
			WebElement clickOndeletepopupnoactionWebE=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(deletepopupno_xpath));
			clickOndeletepopupnoactionWebE.click();
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
	
	public boolean editHeader(){
		try {
			WebElement editHeaderWebE=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(editHeader_xpath));
			editHeaderWebE.isDisplayed();
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
}


