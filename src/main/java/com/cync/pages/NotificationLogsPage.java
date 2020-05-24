package com.cync.pages;

import java.awt.AWTException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

import com.cync.base.BasePage;

public class NotificationLogsPage extends BasePage {
	
	
private final By masterSearch_xpath=By.xpath("//input[@placeholder='Search Here']");
private final By masterSearchValidInputSearch_xpath=By.xpath("(//span[@class='ui-cell-data ng-star-inserted'])[6]");
private final By masterSearchInValidInputSearch_xpath=By.xpath("//span[text()='No records found']");
private final By managerSearchInput_xpath=By.xpath("(//span[@class='ui-cell-data ng-star-inserted'])[1]");
private final By managerSearchTextField_xpath=By.xpath("(//input[@class='ui-column-filter ui-inputtext ui-widget ui-state-default ui-corner-all ng-star-inserted'])[1]");
private final By clientNameSearchTextfield_xpath=By.xpath("(//input[@class='ui-column-filter ui-inputtext ui-widget ui-state-default ui-corner-all ng-star-inserted'])[2]");
private final By clientNameSearchInput_xpath=By.xpath("(//span[@class='ui-cell-data ng-star-inserted'])[2]");
private final By receipientNameSearch_xpath=By.xpath("(//input[@class='ui-column-filter ui-inputtext ui-widget ui-state-default ui-corner-all ng-star-inserted'])[3]");
private final By receipientNameSearchInput_xpath=By.xpath("(//span[@class='ui-cell-data ng-star-inserted'])[3]");
private final By subjectNameSearchInput_xpath=By.xpath("(//span[@class='ui-cell-data ng-star-inserted'])[4]");
private final By subjectNameSearch_xpath=By.xpath("(//input[@class='ui-column-filter ui-inputtext ui-widget ui-state-default ui-corner-all ng-star-inserted'])[4]");
private final By logTypeSearch_xpath=By.xpath("(//input[@class='ui-column-filter ui-inputtext ui-widget ui-state-default ui-corner-all ng-star-inserted'])[5]");
private final By logTypeSearchInput_xpath=By.xpath("(//span[@class='ui-cell-data ng-star-inserted'])[6]");
private final By createdDateSearch_xpath=By.xpath("//input[@class='ng-tns-c3-5 ui-inputtext ui-widget ui-state-default ui-corner-all ng-star-inserted']");
private final By statusSearch_xpath=By.xpath("(//input[@class='ui-column-filter ui-inputtext ui-widget ui-state-default ui-corner-all ng-star-inserted'])[6]");
private final By statusSearchInput_xpath=By.xpath("(//span[@class='ui-cell-data ng-star-inserted'])[8]");
private final By messageIcon_xpath=By.xpath("(//i[@class='fa fa-envelope ng-star-inserted'])[1]");

private final By messageCancel_xpath=By.xpath("(//span[@class='fa fa-fw fa-close'])[3]");
public static int indexSI = 1;

private final By notificationLogsTitle_xpath=By.xpath("//h3[text()='Notification Logs']");
private final By records_xpath=By.xpath("//p[@class='recordcount ng-star-inserted']");

private final By managerTitle_xpath=By.xpath("//span[text()='Manager']");
private final By clientNameTitle_xpath=By.xpath("//span[text()='Client Name']");
private final By receipientTitle_xpath=By.xpath("//span[text()='Recipient']");
private final By subjectTitle_xpath=By.xpath("//span[text()='Subject']");
private final By messageTitle_xpath=By.xpath("(//span[text()='Message'])[1]");
private final By logTypeTitle_xpath=By.xpath("//span[text()='Log Type']");
private final By createdDateTitle_xpath=By.xpath("//span[text()='Created Date']");
private final By statusTitle_xpath=By.xpath("//span[text()='Status']");


private final By clientName_xpath=By.id("borrower_client_name");
private final By shortName_xpath=By.id("borrower_short_name");
private final By clientNumber_xpath=By.id("borrower_client_number");
private final By bbcData_xpath=By.id("borrower_bbc_frequency_date");
private final By naicsCode_xpath=By.id("naics_code");
private final By managerName_xpath=By.xpath("(//input[@id='borrower_manager_ids_'])[17]");
private final By clientSave_xpath=By.id("borrower_save_bt");
private final By createDateSearch_xpath=By.xpath("(//span[@class='ui-cell-data ng-star-inserted'])[7]");



	public NotificationLogsPage(WebDriver driver) {
		super(driver);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public boolean searchIsDisplayed()
	{
	try{
		WebElement searchWebElement=new WebDriverWait(driver,30).until(ExpectedConditions.visibilityOfElementLocated(masterSearch_xpath));
		searchWebElement.isDisplayed();
		return true;
	}
	catch(Exception e){
		return false;
	}}
	
	public boolean masterSearch(String Input)
	{
	try{
		WebElement searchWebElement=new WebDriverWait(driver,30).until(ExpectedConditions.visibilityOfElementLocated(masterSearch_xpath));
		searchWebElement.click();
		searchWebElement.sendKeys(Input);
		Thread.sleep(7000);
		return true;
	}
	catch(Exception e){
		return false;
	}}
	
	public boolean searchWithValidData()
	{
	try{
		Thread.sleep(7000);
		WebElement searchValidWebElement=new WebDriverWait(driver,30).until(ExpectedConditions.visibilityOfElementLocated(masterSearchValidInputSearch_xpath));
		searchValidWebElement.isDisplayed();
		return true;
	}
	catch(Exception e){
		return false;
	}}
	
	public boolean searchWithInValidData()
	{
	try{
		Thread.sleep(7000);
		WebElement searchInValidWebElement=new WebDriverWait(driver,30).until(ExpectedConditions.visibilityOfElementLocated(masterSearchInValidInputSearch_xpath));
		searchInValidWebElement.isDisplayed();
		return true;
	}
	catch(Exception e){
		return false;
	}}
	
	public boolean searchManagerField(String managerToSearch)
	{
	try{
		WebElement searchWebElement=new WebDriverWait(driver,30).until(ExpectedConditions.visibilityOfElementLocated(managerSearchTextField_xpath));
		searchWebElement.click();
		searchWebElement.sendKeys(managerToSearch);
		Thread.sleep(7000);
		return true;
	}
	catch(Exception e){
		System.out.println("No records found");
		return false;
	}}
	
	public boolean searchManager()
	{
	try{
		Thread.sleep(7000);
		WebElement searchInputWebElement=new WebDriverWait(driver,30).until(ExpectedConditions.visibilityOfElementLocated(managerSearchInput_xpath));
		searchInputWebElement.isDisplayed();
		return true;
	}
	catch(Exception e){
		System.out.println("No records found");
		return false;
	}}
	
	public boolean searchClienNameField(String clientNameToSearch)
	{
	try{
		WebElement searchWebElement=new WebDriverWait(driver,30).until(ExpectedConditions.visibilityOfElementLocated(clientNameSearchTextfield_xpath));
		searchWebElement.click();
		searchWebElement.sendKeys(clientNameToSearch);
		Thread.sleep(10000);
		return true;
	}
	catch(Exception e){
		System.out.println("No records found");
		return false;
	}}
	
	public boolean searchClienName()
	{
	try{
		Thread.sleep(10000);
		WebElement searchInputWebElement=new WebDriverWait(driver,30).until(ExpectedConditions.visibilityOfElementLocated(clientNameSearchInput_xpath));
		searchInputWebElement.isDisplayed();
		return true;
	}
	catch(Exception e){
		System.out.println("No records found");
		return false;
	}}
	
	public boolean searchreceipientField(String receipientNameToSearch)
	{
	try{
		WebElement searchWebElement=new WebDriverWait(driver,30).until(ExpectedConditions.visibilityOfElementLocated(receipientNameSearch_xpath));
		searchWebElement.click();
		searchWebElement.sendKeys(receipientNameToSearch);
		Thread.sleep(7000);
		return true;
	}
	catch(Exception e){
		System.out.println("No records found");
		return false;
	}}
	
	public boolean searchreceipient()
	{
	try{
		Thread.sleep(7000);
		WebElement searchInputWebElement=new WebDriverWait(driver,30).until(ExpectedConditions.visibilityOfElementLocated(receipientNameSearchInput_xpath));
		searchInputWebElement.isDisplayed();
		return true;
	}
	catch(Exception e){
		System.out.println("No records found");
		return false;
	}}
	

	public boolean searchSubjectField(String subjectNameToSearch)
	{
	try{
		WebElement searchWebElement=new WebDriverWait(driver,30).until(ExpectedConditions.visibilityOfElementLocated(subjectNameSearch_xpath));
		searchWebElement.click();
		searchWebElement.sendKeys(subjectNameToSearch);
		Thread.sleep(7000);
		return true;
	}
	catch(Exception e){
		System.out.println("No records found");
		return false;
	}}
	
	public boolean searchSubject()
	{
	try{
		Thread.sleep(7000);
		WebElement searchInputWebElement=new WebDriverWait(driver,30).until(ExpectedConditions.visibilityOfElementLocated(subjectNameSearchInput_xpath));
		searchInputWebElement.isDisplayed();
		return true;
	}
	catch(Exception e){
		System.out.println("No records found");
		return false;
	}}
	
	public boolean searchLogTypeField(String logTypeToSearch)
	{
	try{
		WebElement searchWebElement=new WebDriverWait(driver,30).until(ExpectedConditions.visibilityOfElementLocated(logTypeSearch_xpath));
		searchWebElement.click();
		searchWebElement.sendKeys(logTypeToSearch);
		Thread.sleep(7000);
		return true;
	}
	catch(Exception e){
		System.out.println("No records found");
		return false;
	}}
	
	public boolean searchLogType()
	{
	try{
		Thread.sleep(7000);
		WebElement searchInputWebElement=new WebDriverWait(driver,30).until(ExpectedConditions.visibilityOfElementLocated(logTypeSearchInput_xpath));
		searchInputWebElement.isDisplayed();
		return true;
	}
	catch(Exception e){
		System.out.println("No records found");
		return false;
	}}
	
	
	public boolean searchStatusField(String StatusToSearch)
	{
	try{
		WebElement searchWebElement=new WebDriverWait(driver,30).until(ExpectedConditions.visibilityOfElementLocated(statusSearch_xpath));
		searchWebElement.click();
		searchWebElement.sendKeys(StatusToSearch);
		Thread.sleep(7000);
		return true;
	}
	catch(Exception e){
		System.out.println("No records found");
		return false;
	}}
	
	
	
	
	public boolean searchStatus()
	{
	try{
		Thread.sleep(7000);
		WebElement searchInputWebElement=new WebDriverWait(driver,30).until(ExpectedConditions.visibilityOfElementLocated(statusSearchInput_xpath));
		searchInputWebElement.isDisplayed();
		return true;
	}
	catch(Exception e){
		System.out.println("No records found");
		return false;
	}}
	
	public boolean messagePopUpMain()
	{
	try{
		WebElement searchWebElement=new WebDriverWait(driver,30).until(ExpectedConditions.visibilityOfElementLocated(messageIcon_xpath));
		searchWebElement.click();
		Thread.sleep(7000);
		return true;
		
	}
	catch(Exception e){
		
		return false;
	}}
	
	
	public boolean messagePopUp()
	{
	try{
		Thread.sleep(7000);
		//WebElement searchInputWebElement=new WebDriverWait(driver,30).until(ExpectedConditions.visibilityOfElementLocated(messageLabel_xpath));
		//searchInputWebElement.isDisplayed();
		WebElement clickWebElement=new WebDriverWait(driver,30).until(ExpectedConditions.visibilityOfElementLocated(messageCancel_xpath));
		clickWebElement.click();
		return true;
		
	}
	catch(Exception e){
		
		return false;
	}}
	

	
	public boolean notificationLogsTitle(String notificationLogsHeader)
	{
	try{
		WebElement notificationLogsTitleWebElement=new WebDriverWait(driver,30).until(ExpectedConditions.visibilityOfElementLocated(notificationLogsTitle_xpath));
		String title=notificationLogsTitleWebElement.getText();
		if (title.equals(notificationLogsHeader)) {
			return true;
		}
	}
	catch(Exception e){
		
	}
	return false;
	
	}
	
	public boolean recordsCount(String notificationLogsCount)
	{
	try{
		WebElement countOfRecordsWebElement=new WebDriverWait(driver,30).until(ExpectedConditions.visibilityOfElementLocated(records_xpath));
		String title=countOfRecordsWebElement.getText().substring(0, 10);
		if (title.equals(notificationLogsCount)) {
			return true;
		}
	}
	catch(Exception e){
		
	}
	return false;
	
	}
	
	public boolean managerUI()
	{
	try{
		WebElement managerTitleWebElement=new WebDriverWait(driver,30).until(ExpectedConditions.visibilityOfElementLocated(managerTitle_xpath));
		managerTitleWebElement.isDisplayed();
		return true;
	}
	catch(Exception e){
		return false;
	}}	
	
	public boolean clientNameUI()
	{
	try{
		WebElement clientNameTitleWebElement=new WebDriverWait(driver,30).until(ExpectedConditions.visibilityOfElementLocated(clientNameTitle_xpath));
		clientNameTitleWebElement.isDisplayed();
		return true;
	}
	catch(Exception e){
		return false;
	}}	
	
	public boolean receipientUI()
	{
	try{
		WebElement receipientTitleWebElement=new WebDriverWait(driver,30).until(ExpectedConditions.visibilityOfElementLocated(receipientTitle_xpath));
		receipientTitleWebElement.isDisplayed();
		return true;
	}
	catch(Exception e){
		return false;
	}}	
	
	public boolean subjectUI()
	{
	try{
		WebElement subjectTitleWebElement=new WebDriverWait(driver,30).until(ExpectedConditions.visibilityOfElementLocated(subjectTitle_xpath));
		subjectTitleWebElement.isDisplayed();
		return true;
	}
	catch(Exception e){
		return false;
	}}	
	
	public boolean messageUI()
	{
	try{
		WebElement messageTitleWebElement=new WebDriverWait(driver,30).until(ExpectedConditions.visibilityOfElementLocated(messageTitle_xpath));
		messageTitleWebElement.isDisplayed();
		return true;
	}
	catch(Exception e){
		return false;
	}}	
	
	public boolean logTypeUI()
	{
	try{
		WebElement logTypeTitleWebElement=new WebDriverWait(driver,30).until(ExpectedConditions.visibilityOfElementLocated(logTypeTitle_xpath));
		logTypeTitleWebElement.isDisplayed();
		return true;
	}
	catch(Exception e){
		return false;
	}}	
	
	
	
	public boolean createdDateUI()
	{
	try{
		WebElement createdDateTitleWebElement=new WebDriverWait(driver,30).until(ExpectedConditions.visibilityOfElementLocated(createdDateTitle_xpath));
		createdDateTitleWebElement.isDisplayed();
		return true;
	}
	catch(Exception e){
		return false;
	}}	
	
	public boolean statusUI()
	{
	try{
		WebElement statusTitleWebElement=new WebDriverWait(driver,30).until(ExpectedConditions.visibilityOfElementLocated(statusTitle_xpath));
		statusTitleWebElement.isDisplayed();
		return true;
	}
	catch(Exception e){
		return false;
	}}	
	
	

	
	
	/*public boolean createClient(String clientName,String shortName,String clientNumber,String bbcDateToEnter,String naicsCodeToEnter){
		try{
			WebElement clientNameWebElement=new WebDriverWait(driver,30).until(ExpectedConditions.visibilityOfElementLocated(clientName_xpath));
			clientNameWebElement.sendKeys(clientName);
			WebElement shortNameWebElement=new WebDriverWait(driver,30).until(ExpectedConditions.visibilityOfElementLocated(shortName_xpath));
			shortNameWebElement.sendKeys(shortName);
			WebElement clientNumberWebElement=new WebDriverWait(driver,30).until(ExpectedConditions.visibilityOfElementLocated(clientNumber_xpath));
			clientNumberWebElement.sendKeys(clientNumber);
			WebElement bbcDateWebElement=new WebDriverWait(driver,30).until(ExpectedConditions.visibilityOfElementLocated(bbcData_xpath));
			bbcDateWebElement.sendKeys(bbcDateToEnter);
			WebElement naicsCodeWebElement=new WebDriverWait(driver,30).until(ExpectedConditions.visibilityOfElementLocated(naicsCode_xpath));
			naicsCodeWebElement.sendKeys(naicsCodeToEnter);
			WebElement managerNameWebElement=new WebDriverWait(driver,30).until(ExpectedConditions.visibilityOfElementLocated(managerName_xpath));
			managerNameWebElement.click();
			WebElement clientSaveWebElement=new WebDriverWait(driver,30).until(ExpectedConditions.visibilityOfElementLocated(clientSave_xpath));
			clientSaveWebElement.click();
			
			return true;
		}
		catch(Exception e){
			return false;
		}}	*/

}
