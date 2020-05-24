//Author : Abirami
package com.cync.FactoringPages;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.cync.base.BasePage;

public class InvoiceValidationTemplatePage extends BasePage {
	
	
	private final By invValTempPageHeader_xpath = By.xpath("//span[@class='paneltitle']");
	private final By searchTextBox_xpath = By.id("search_template_text");
	private final By searchBTN_xpath = By.id("search_template_button");
	private final By createNewBTN_xpath = By.xpath("//a[contains(text(),'Create New')]");
	private final By tempNameTitleHistory_xpath = By.xpath("//span[contains(text(),'Template name')] ");
	private final By descriptiontitleHistory_xpath = By.xpath("//span[contains(text(),'Description')]  ");
	private final By createdByTitleHistory_xpath = By.xpath("//a[contains(text(),'Created By')]");
	private final By actionsTitleHistory_xpath = By.xpath("/span[contains(text(),'Actions')] ");
	private final By editBTN_xpath = By.xpath("//a[contains(text(),'Edit')]");
	private final By deleteBTN_xpath = By.xpath("//a[contains(text(),'Delete')]");
	private final By viewBTN_xpath = By.xpath("//a[@class='view-button'][contains(text(),'View')]  ");
	private final By addInvValTempHeader_xpath = By.xpath("//span[contains(text(),'Add Invoice Validation Template')]");
	private final By tempNameTextBox_xpath = By.id("invoice_verification_template_name");
	private final By tempDescriptionTextBox_xpath = By.id("invoice_verification_template_description");
	private final By saveBTN_xpath = By.id("validation_for_save");
	private final By cancelBTN_xpath = By.xpath("//a[@class='view-button-cancel'] ");
	private final By parametersCheckBox_xpath = By.id("all_check_box");
	private final By successMsg_xpath = By.xpath("//strong[contains(text(),'Template was successfully created')]");
	private final By updateMsg_xpath = By.xpath("//strong[contains(text(),'Template was successfully updated')]");
	private final By deleteMsg_xpath = By.xpath("//a[contains(text(),'Delete')]");
	private final By saveAsErrorMsg_xpath = By.xpath("//div[@class='alert alert-error']");
	private final By saveAsBTN_xpath = By.id("validation_for_save_as");
	private final By backToListBTN_xpath = By.xpath("//a[contains(text(),'Back to List View')]");
	private final By defaultPageHeader_xpath = By.xpath("//span[contains(text(),'Invoice Validation')]");
	

	public InvoiceValidationTemplatePage(WebDriver driver) {
		super(driver);
		
	}
	
	public String PageHeaderVerify(String Header)
    {
    	try
    	{
    		
    		WebElement HeaderWebEelement=new WebDriverWait(driver,5)
			.until(ExpectedConditions.visibilityOfElementLocated(invValTempPageHeader_xpath));
		HeaderWebEelement.getText();
		Thread.sleep(1000);
    	}
    	catch(Exception e)
    	{
    		
    	}
    	return Header;
    }
	
	
	
	public boolean VerifySearchBTN()
	{
		try
		{
			
		WebElement SearchBTNWebElement=new WebDriverWait(driver,5)
			.until(ExpectedConditions.visibilityOfElementLocated(searchBTN_xpath));
		SearchBTNWebElement.isDisplayed();
		
		Thread.sleep(1000);
		return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}
	
	public boolean VerifyCreateNewBTN()
	{
		try
		{
			
			WebElement CreateNewBTNWebEelement=new WebDriverWait(driver,5)
			.until(ExpectedConditions.visibilityOfElementLocated(createNewBTN_xpath));
		CreateNewBTNWebEelement.isDisplayed();
		
		Thread.sleep(1000);
		return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}
	
	
	public boolean VerifyViewBTN()
	{
		try
		{
		
			WebElement ViewBTNWebEelement=new WebDriverWait(driver,5)
			.until(ExpectedConditions.visibilityOfElementLocated(viewBTN_xpath));
		ViewBTNWebEelement.isDisplayed();
		
		Thread.sleep(1000);
		return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}
	
	
	public boolean ClickCreateNewBTNAndVerifyAddPage()
	{
		try
		{
			
			WebElement CreateNewBTNWebEelement=new WebDriverWait(driver,5)
			.until(ExpectedConditions.elementToBeClickable(createNewBTN_xpath));
		CreateNewBTNWebEelement.click();
		
		Thread.sleep(1000);
		
		WebElement HeaderWebElement =new WebDriverWait(driver,5)
		.until(ExpectedConditions.visibilityOfElementLocated(addInvValTempHeader_xpath));
		HeaderWebElement.isDisplayed();
		return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}
	
	public String addValueToTempName(String tempNameData)
	{
		try
		{
			WebElement TempNameWebElement =new WebDriverWait(driver,5)
			.until(ExpectedConditions.visibilityOfElementLocated(tempNameTextBox_xpath));
			TempNameWebElement.clear();
			TempNameWebElement.sendKeys(tempNameData);
			
		}
		catch(Exception e)
		{
			
		}
		return tempNameData;
	}
	
	
	public String addValueToTempDescription(String tempDesData)
	{
		try
		{
			
			WebElement TempDesWebElement =new WebDriverWait(driver,5)
			.until(ExpectedConditions.visibilityOfElementLocated(tempDescriptionTextBox_xpath));
			TempDesWebElement.clear();
			TempDesWebElement.sendKeys(tempDesData);
			
		}
		catch(Exception e)
		{
			
		}
		return tempDesData;
	}
	
	public boolean ClickOnParametersList()
	{
		try
		{
			
			WebElement ParametersListWebEelement=new WebDriverWait(driver,5)
			.until(ExpectedConditions.elementToBeClickable(parametersCheckBox_xpath));
		ParametersListWebEelement.click();
		
		Thread.sleep(1000);
		return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}
	
	public boolean ClickOnSaveBTN()
	{
		try
		{
			
			
			WebElement SaveBTNWebEelement=new WebDriverWait(driver,5)
			.until(ExpectedConditions.elementToBeClickable(saveBTN_xpath));
		SaveBTNWebEelement.click();
		
		Thread.sleep(000);
		return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}
	
	public boolean VerifySuccessMsg()
	{
		try
		{
			
			WebElement SuccessMsgWebElement =new WebDriverWait(driver,5)
			.until(ExpectedConditions.visibilityOfElementLocated(successMsg_xpath));
			SuccessMsgWebElement.isDisplayed();
			
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}

	public boolean ClickOnEditBTN() {
		try
		{
			
			WebElement EditBTNWebElement =new WebDriverWait(driver,5)
			.until(ExpectedConditions.elementToBeClickable(editBTN_xpath));
			EditBTNWebElement.click();
			
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}
	
	public boolean VerifyUpdateMsg()
	{
		try
		{
			
			WebElement UpdateMsgWebElement =new WebDriverWait(driver,5)
			.until(ExpectedConditions.visibilityOfElementLocated(updateMsg_xpath));
			Thread.sleep(1000);
			UpdateMsgWebElement.isDisplayed();
			
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}
	
	public boolean ClickOnDeleteBTN()
	{
		try
		{
			
			WebElement DeleteBTNWebElement =new WebDriverWait(driver,5)
			.until(ExpectedConditions.elementToBeClickable(deleteBTN_xpath));
			DeleteBTNWebElement.click();
			
			Alert alert = driver.switchTo().alert();
			alert.accept();
			
			Thread.sleep(1000);
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}
	
	public String addValueToSearchTextBox(String searchData)
	{
		try
		{
			
			WebElement SearchTextBoxWebElement =new WebDriverWait(driver,5)
			.until(ExpectedConditions.visibilityOfElementLocated(searchTextBox_xpath));
			SearchTextBoxWebElement.clear();
			SearchTextBoxWebElement.sendKeys(searchData);
			
			Thread.sleep(1000);
			WebElement SearchBTNWebElement =new WebDriverWait(driver,5)
			.until(ExpectedConditions.elementToBeClickable(searchBTN_xpath));
			SearchBTNWebElement.click();
		}
		catch(Exception e)
		{
			
		}
		return searchData;
	}
	
	public boolean VerifyDeleteMsg()
	{
		try
		{
			
			WebElement DeleteMsgWebElement =new WebDriverWait(driver,5)
			.until(ExpectedConditions.visibilityOfElementLocated(deleteMsg_xpath));
			Thread.sleep(1000);
			DeleteMsgWebElement.isDisplayed();
			
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}

	public boolean ClickOnCancelBTN() {
		try
		{
			
			WebElement CancelBTNWebElement =new WebDriverWait(driver,5)
			.until(ExpectedConditions.elementToBeClickable(cancelBTN_xpath));
			CancelBTNWebElement.click();
			
			Thread.sleep(1000);
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}
	
	
	public boolean ClickOnSaveAsBTN() {
		try
		{
			WebElement SaveAsBTNWebElement =new WebDriverWait(driver,5)
			.until(ExpectedConditions.elementToBeClickable(saveAsBTN_xpath));
			SaveAsBTNWebElement.click();
			
			Thread.sleep(1000);
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}
	
	public boolean VerifySaveAsErrorMsg()
	{
		try
		{
			WebElement ErrorMsgWebElement = new WebDriverWait(driver,5)
			.until(ExpectedConditions.visibilityOfElementLocated(saveAsErrorMsg_xpath));
			ErrorMsgWebElement.isDisplayed();
			
			Thread.sleep(1000);
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}

	public boolean ClickOnViewBTN() {
		try
		{
			WebElement ViewBTNWebElement =new WebDriverWait(driver,5)
			.until(ExpectedConditions.elementToBeClickable(viewBTN_xpath));
			ViewBTNWebElement.click();
			
			Thread.sleep(1000);
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}
	
	public boolean VerifyDefaultTemp(String tempName)
	{
		try
		{
			WebElement DefaultPageHeaderWebElement =new WebDriverWait(driver,5)
		           .until(ExpectedConditions.visibilityOfElementLocated(defaultPageHeader_xpath));
			DefaultPageHeaderWebElement.isDisplayed();
			
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
		
	}
	
	public boolean ClickOnBackToListBTN()
	{
		try
		{
			WebElement BackToListWebElement =new WebDriverWait(driver,5)
			.until(ExpectedConditions.elementToBeClickable(backToListBTN_xpath));
			BackToListWebElement.click();
			
			Thread.sleep(1000);
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}

}
