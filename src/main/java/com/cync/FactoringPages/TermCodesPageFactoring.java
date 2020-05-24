package com.cync.FactoringPages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.cync.base.BasePage;

public class TermCodesPageFactoring extends BasePage
{
	private final By TermCodesPageFactoring_xpath = By.xpath("//li[@class='nav-item active ng-star-inserted']");
	
	private final By statusDD_xpath = By.xpath("//select[@class='form-control ng-pristine ng-valid ng-touched']");
	private final By addNewBTN_xpath = By.xpath("//body[@id='cync_app_dashboard']//div[@class='row']//div[@class='row']//button[1]");
	private final By deleteBTN_xpath = By.xpath("//i[@class='fa fa-trash']");
	private final By nameTB_xpath = By.xpath("(//input[@formcontrolname='name'])[1]");
	private final By daysTB_xpath = By.xpath("(//input[@formcontrolname='days'])[1]");
	private final By saveBTN_xpath = By.xpath("//button[@label='Save']");
	private final By createdTC_xpath = By.xpath("(//div[contains(@class,'ag-row-position-absolute ag-row-last')])[2]//span[@class='ag-selection-checkbox']");
	private final By EditBTN_xpath = By.xpath("(//div[contains(@class,'ag-row-position-absolute ag-row-last')])[2]//i[@class='fa fa-pencil-square-o fa-2x custom-icon-size-ingrid']");
	private final By statusDDedit_xpath = By.xpath("//select[@formcontrolname='status']");
	private final By cancelBTN_xpath = By.xpath("//button[@id='action_back']//span[@class='ui-button-text ui-clickable no-pad'][contains(text(),'Cancel')]");
	//private final By deleteBTN_xpath = By.xpath("//body[@id='cync_app_dashboard']//div[@class='row']//div[@class='row']//button[2]");
	private final By updateBTN_xpath = By.xpath("//button[@id='action_back' and @label='Cancel']//span");
	private final By yesBTN_xpath = By.xpath("//button[@class='noradius btn btn-sm btn-primary p_r_20 p_l_20 ui-button ui-widget ui-state-default ui-corner-all ui-button-text-only ui-button ui-widget ui-state-default ui-corner-all ui-button-text-only options-btn']");
	
	
	public TermCodesPageFactoring(WebDriver driver) {
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
			.until(ExpectedConditions.visibilityOfElementLocated(TermCodesPageFactoring_xpath));
		HeaderWebEelement.getText();
		Thread.sleep(2000);
    	}
    	catch(Exception e)
    	{
    		
    	}
    	return Header;

}
	public boolean VerifyStatusDD() {
		try
    	{
    		WebElement StatusDDWebEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(statusDD_xpath));
    		StatusDDWebEelement.isDisplayed();
    		return true;
    	}
    	catch(Exception e)
    	{
    		return false;
    	}
    	
	}
	public boolean VerifyAddNewBTN() {
		try
    	{
    		WebElement AddNewBTNWebEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(addNewBTN_xpath));
    		AddNewBTNWebEelement.isDisplayed();
    		return true;
    	}
    	catch(Exception e)
    	{
    		return false;
    	}	}
	public boolean VerifyDeleteBTN() {
		try
    	{
    		WebElement DeleteBTNWebEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(deleteBTN_xpath));
    		DeleteBTNWebEelement.isDisplayed();
    		return true;
    	}
    	catch(Exception e)
    	{
    		return false;
    	}
	}
	public boolean ClickAddNewBTN() {
		try
    	{
    		WebElement AddNewBTNWebEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(addNewBTN_xpath));
    		AddNewBTNWebEelement.click();
    		this.isAlertPresent();
    		return true;
    	}
    	catch(Exception e)
    	{
    		return false;
    	}	
	}

public boolean isAlertPresent() {
	boolean presentFlag = false;
	try {
		Alert alert = driver.switchTo().alert();
		presentFlag = true;
		alert.accept();
	} catch (Exception ex) {

		System.out.println("No Such Alert Present");

	}

	return presentFlag;
}
public boolean addValueToName(String name) {
	try
	{
		WebElement NameWebEelement=new WebDriverWait(driver,100)
		.until(ExpectedConditions.visibilityOfElementLocated(nameTB_xpath));
		NameWebEelement.sendKeys(name);
		
		return true;
	}
	catch(Exception e)
	{
		return false;
	}	
}
public boolean addValueToDays(String days) {
	try
	{
		WebElement DaysWebEelement=new WebDriverWait(driver,100)
		.until(ExpectedConditions.visibilityOfElementLocated(daysTB_xpath));
		DaysWebEelement.sendKeys(days);
		
		return true;
	}
	catch(Exception e)
	{
		return false;
	}	
}
public boolean ClickSaveBTN() {
	try
	{
		WebElement SaveBTNWebEelement=new WebDriverWait(driver,100)
		.until(ExpectedConditions.visibilityOfElementLocated(saveBTN_xpath));
		SaveBTNWebEelement.click();
		this.isAlertPresent();
		return true;
	}
	catch(Exception e)
	{
		return false;
	}	
}
public boolean SelectCreatedTC() {
	try
	{
		WebElement CreatedTCWebEelement=new WebDriverWait(driver,800)
		.until(ExpectedConditions.visibilityOfElementLocated(createdTC_xpath));
		CreatedTCWebEelement.click();
		
		return true;
	}
	catch(Exception e)
	{
		return false;
	}	
}
public boolean ClickEditBTN() {
	try
	{
		WebElement EditBTNWebEelement=new WebDriverWait(driver,100)
		.until(ExpectedConditions.visibilityOfElementLocated(EditBTN_xpath));
		EditBTNWebEelement.click();
		this.isAlertPresent();
		return true;
	}
	catch(Exception e)
	{
		return false;
	}	
}
public boolean VerifyStatusDropdownEdit() {
	try
	{
		WebElement StatusDropdownEditWebEelement=new WebDriverWait(driver,100)
		.until(ExpectedConditions.visibilityOfElementLocated(statusDDedit_xpath));
		StatusDropdownEditWebEelement.isDisplayed();
		//this.isAlertPresent();
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
		WebElement CancelBTNWebEelement=new WebDriverWait(driver,100)
		.until(ExpectedConditions.visibilityOfElementLocated(cancelBTN_xpath));
		CancelBTNWebEelement.click();
		this.isAlertPresent();
		return true;
	}
	catch(Exception e)
	{
		return false;
	}
}
public boolean ClickDeleteBTN() {
	try
	{
		WebElement DeleteBTNWebEelement=new WebDriverWait(driver,100)
		.until(ExpectedConditions.visibilityOfElementLocated(deleteBTN_xpath));
		DeleteBTNWebEelement.click();
		this.isAlertPresent();
		return true;
	}
	catch(Exception e)
	{
		return false;
	}
}
public boolean ClickUpdateBTN() {
	try
	{
		WebElement DeleteBTNWebEelement=new WebDriverWait(driver,100)
		.until(ExpectedConditions.visibilityOfElementLocated(updateBTN_xpath));
		DeleteBTNWebEelement.click();
		this.isAlertPresent();
		return true;
	}
	catch(Exception e)
	{
		return false;
	}
}
public boolean ClickYesBTN() {
	try
	{
		WebElement YesBTNWebEelement=new WebDriverWait(driver,100)
		.until(ExpectedConditions.visibilityOfElementLocated(yesBTN_xpath));
		YesBTNWebEelement.click();
		this.isAlertPresent();
		return true;
	}
	catch(Exception e)
	{
		return false;
	}
}
}