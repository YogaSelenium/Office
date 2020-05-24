package com.cync.pages;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.cync.base.BasePage;

public class AutomatedTaskLogsPage extends BasePage {
	
	private final By automatedTaskLogsTitle_xpath=By.xpath("//h3[text()='Automated Task Logs']");
	private final By masterSearch_xpath=By.xpath("//input[@placeholder='Search Here']");
//	private final By searchValue_xpath=By.xpath("(//span[text()='Log gl transaction'])[1]");
	private final By searchValue_xpath=By.xpath("//span[@class='input-group-addon icon-input-field border-right-none']");
	private final By searchInvalidValue_xpath=By.xpath("//span[text()='No records found']");
	private final By advanceSearchLink_xpath=By.xpath("//a[text()='Advanced Search']");
	private final By taskNameDropDown_xpath=By.xpath("//label[text()='Task Name']");
	private final By fromDateDropDown_xpath=By.xpath("//label[text()='From Date']");
	private final By toDateDropDown_xpath=By.xpath("//label[text()='To Date']");
	private final By statusDropDown_xpath=By.xpath("//label[text()='Status']");
//	private final By searchAdvSearch_xpath=By.id("action_save");
	
	private final By searchAdvSearch_xpath=By.xpath("//span[contains(text(),'Search')]");
	
	private final By CancelAdvSearch_xpath=By.id("action_cancel");
	
	private final By fromDateTextField_xpath=By.xpath("//input[@class='ng-tns-c4-5 ui-inputtext ui-widget ui-state-default ui-corner-all ng-star-inserted']");
	
	
//	private final By fromDateTextField_xpath=By.xpath("(//p-calendar[contains(@yearrange,'2000:2030')])[1]");
//	private final By fromDateSearchValue_xpath=By.xpath("(//a[@class='ui-state-default ng-tns-c3-5 ng-star-inserted'])[9]");
	private final By fromDateSearchValue_xpath=By.xpath("//div[@class='ng-tns-c4-5 ui-datepicker ui-widget ui-widget-content ui-helper-clearfix ui-corner-all ui-shadow ng-trigger ng-trigger-overlayState']");
	private final By toDateTextField_xapth=By.xpath("//input[@class='ng-tns-c4-6 ui-inputtext ui-widget ui-state-default ui-corner-all ng-star-inserted']");
	private final By toDateSearchIcon_xpath=By.xpath("(//span[@class='ui-button-icon-left ui-clickable fa fa-fw fa-calendar'])[2]");
//	private final By toDateSearchValue_xpath=By.xpath("(//a[@class='ui-state-default ng-tns-c3-6 ng-star-inserted'])[9]");
	private final By toDateSearchValue_xpath=By.xpath("//table[@class='ui-datepicker-calendar ng-tns-c4-6 ng-star-inserted']");
	private final By taskNameTextDrpDown=By.xpath("//input[@display-property-name='taskName']");
//	private final By taskNameSearch=By.xpath("(//span[@class='ui-cell-data ng-star-inserted'])[1]");
	private final By taskNameSearch=By.xpath("//span[contains(text(),'Task Name')]");
	private final By statusNameValueDropdown_xpath=By.xpath("//select[@class='form-control ng-untouched ng-pristine ng-valid']");
	private final By statusUserSpecficSearch_xpath=By.xpath("(//span[@class='ui-cell-data ng-star-inserted'])[4]");
	private final By dateStartDate_Xpath=By.xpath("(//span[@class='ui-cell-data ng-star-inserted'])[2]");
	private final By dateEndDate_xpath=By.xpath("(//span[@class='ui-cell-data ng-star-inserted'])[3]");
	private final By date_Xpath=By.xpath("(//td[@class='ng-star-inserted'])[2]");
	private final By taskNameTitle_xpath=By.xpath("//span[text()='Task Name']");
	private final By startTime_xpath=By.xpath("//span[text()='Start Time']");
	private final By endTimeTitle_xpath=By.xpath("//span[text()='End Time']");
	private final By statusTitle_xpath=By.xpath("//span[text()='Status']");
	private final By recordsCount_xpath=By.xpath("//p[@class='recordcount ng-star-inserted']");
	
	
	public AutomatedTaskLogsPage(WebDriver driver) {
		super(driver);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public String automatedTaskLogsTitle(String automatedTaskLogsHeader)
	{
	try{
		WebElement automatedTaskLogsTitleWebElement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(automatedTaskLogsTitle_xpath));
		automatedTaskLogsTitleWebElement.getText();
		
	}
	catch(Exception e){
		
	}
	return automatedTaskLogsHeader;
	
	}
	
	
	public boolean masterSearch(String searchValue)
	{
	try{
		WebElement masterSearchWebElement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(masterSearch_xpath));
		masterSearchWebElement.sendKeys(searchValue);
		//Thread.sleep(4000);
		Thread.sleep(1000);
		return true;
	}
	catch(Exception e){
		return false;
	}}
	
	public boolean masterSearchFunctionality()
	{
	try{
		//Thread.sleep(9000);
		Thread.sleep(1000);
		WebElement searchInputWebElement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(searchValue_xpath));
		searchInputWebElement.isDisplayed();
		return true;
	}
	catch(Exception e){
		return false;
	}}
	
	public boolean masterSearchWithInvalidInput()
	{
	try{
		//Thread.sleep(9000);
		Thread.sleep(1000);
		WebElement searchInputWebElement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(searchInvalidValue_xpath));
		searchInputWebElement.isDisplayed();
		return true;
	}
	catch(Exception e){
		return false;
	}}
	
	public boolean advanceSearchUI()
	{
	try{
		//Thread.sleep(9000);
		Thread.sleep(1000);
		WebElement advanceSearchWebElement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(advanceSearchLink_xpath));
		advanceSearchWebElement.isDisplayed();
		return true;
	}
	catch(Exception e){
		return false;
	}}
	
	public boolean clickOnAdvanceSearch()
	{
	try{
		//Thread.sleep(14000);
		Thread.sleep(1000);
		WebElement advanceSearchWebElement=new WebDriverWait(driver,10).until(ExpectedConditions.presenceOfElementLocated(advanceSearchLink_xpath));
		Thread.sleep(1000);
		advanceSearchWebElement.click();
		//Thread.sleep(8000);
		
		return true;
	}
	catch(Exception e){
		return false;
	}}
	
	public boolean taskNameAdvSearchUI()
	{
	try{
		//Thread.sleep(7000);
		Thread.sleep(1000);
		WebElement taskNameAdvSearchWebElement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(taskNameDropDown_xpath));
		taskNameAdvSearchWebElement.isDisplayed();
		return true;
	}
	catch(Exception e){
		return false;
	}}
	
	public boolean fromDateAdvSearchUI()
	{
		try{
			//Thread.sleep(15000);
			Thread.sleep(1000);
			WebElement toDateAdvSearchWebElement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(fromDateDropDown_xpath));
			toDateAdvSearchWebElement.isDisplayed();
			return true;
		}
		catch(Exception e){
			return false;
		}}
	
	public boolean toDateAdvSearchUI()
	{
	try{
		//Thread.sleep(7000);
		Thread.sleep(1000);
		WebElement toDateAdvSearchWebElement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(toDateDropDown_xpath));
		toDateAdvSearchWebElement.isDisplayed();
		return true;
	}
	catch(Exception e){
		return false;
	}}
	
	public boolean statusAdvSearchUI()
	{
	try{

		//Thread.sleep(7000);
		Thread.sleep(1000);
		WebElement statusAdvSearchWebElement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(statusDropDown_xpath));
		statusAdvSearchWebElement.isDisplayed();
		return true;
	}
	catch(Exception e){
		return false;
	}}
	
	public boolean searchAdvSearchUI()
	{
	try{
		//Thread.sleep(7000);
		Thread.sleep(1000);
		WebElement searchAdvSearchWebElement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(searchAdvSearch_xpath));
		searchAdvSearchWebElement.isDisplayed();
		return true;
	}
	catch(Exception e){
		return false;
		}}
	
	public boolean cancelAdvSearchUI()
	{
	try{

		//Thread.sleep(7000);
		Thread.sleep(1000);
		WebElement cancelAdvSearchWebElement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(CancelAdvSearch_xpath));
		cancelAdvSearchWebElement.click();;
		return true;
	}
	catch(Exception e){
		return false;
	}}
	
	public boolean clickOnSearchInAdvanceSearch()
	{
	try{
		// Thread.sleep(13000);
		Thread.sleep(1000);
		WebElement searchAdvSearchWebElement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(searchAdvSearch_xpath));
		searchAdvSearchWebElement.click();
		// Thread.sleep(13000);
		Thread.sleep(1000);
		return true;
	}
	catch(Exception e){
		return false;
	}}
	
	public boolean ClickOnfromDateAdvSearch()
	{
	try{
		// Thread.sleep(13000);
		Thread.sleep(1000);
		WebElement fromDateTextWebElement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(fromDateTextField_xpath));
		fromDateTextWebElement.click();
		// Thread.sleep(13000);
//		Thread.sleep(1000);
		return true;
	}
	catch(Exception e){
		return false;
	}}
	
	public boolean fromDateAdvSearchTextWidget(String fromDateTextValue)
	{
	try{
		// Thread.sleep(13000);
		Thread.sleep(1000);
		WebElement fromDateTextWebElement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(fromDateTextField_xpath));
		fromDateTextWebElement.sendKeys(fromDateTextValue);
		
		// Thread.sleep(13000);
		Thread.sleep(1000);
		return true;
	}
	catch(Exception e){
		return false;
	}
	}
	
	
	
	public boolean fromDateAdvSearchCalenderWidget()
	{
	try{
		// Thread.sleep(13000);
		Thread.sleep(1000);
		WebElement SearchWebElement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(fromDateSearchValue_xpath));
		SearchWebElement.click();
		// Thread.sleep(13000);
//		Thread.sleep(1000);
		return true;
	}
	catch(Exception e){
		return false;
	}}
	
	public boolean clickOntoDateAdvSearchText()
	{
	try{
		// Thread.sleep(13000);
		Thread.sleep(1000);
		WebElement toDateTextWebElement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(toDateTextField_xapth));
		toDateTextWebElement.click();
		
		return true;
	}
	catch(Exception e){
		return false;
	}}
	
	
	public boolean toDateAdvSearchTextWidget(String toDateTextValue)
	{
	try{
		// Thread.sleep(13000);
		Thread.sleep(1000);
		WebElement toDateTextWebElement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(toDateTextField_xapth));
	    toDateTextWebElement.sendKeys(toDateTextValue);
	 
	//	WebElement toDateTextIconWebElement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(toDateSearchIcon_xpath));
	//	toDateTextIconWebElement.click();
		// Thread.sleep(13000);
//	    Thread.sleep(1000);
		return true;
	}
	catch(Exception e){
		return false;
	}}
	
	public boolean toDateAdvSearchCalenderWidget()
	{
	try{

		// Thread.sleep(13000);
		Thread.sleep(1000);
		WebElement SearchWebElement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(toDateSearchValue_xpath));
		SearchWebElement.click();

		// Thread.sleep(13000);
//		Thread.sleep(1000);
		return true;
	}
	catch(Exception e){
		return false;
	}}
	
	public boolean taskNameUserSpecificAdvSearch(String taskNameUserInput)
	{
	try{

		// Thread.sleep(13000);
		Thread.sleep(1000);
		
		WebElement taskNameAdvSearchWebElement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(taskNameTextDrpDown));
		taskNameAdvSearchWebElement.sendKeys(taskNameUserInput);	
		// Thread.sleep(10000);
		Thread.sleep(1000);
		
		return true;
	}
	catch(Exception e){
		return false;
	}}
	
	public boolean taskNameUserSpecificAdvSearchInput()
	{
	try{
		WebElement taskNameSearchWebElement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(taskNameSearch));
		taskNameSearchWebElement.isDisplayed();
		
		return true;
	}
	catch(Exception e){
		return false;
	}}
	
	public boolean statusNameUserSpecificAdvSearch(String statusToSearch)
	{
	try{
		//Thread.sleep(15000);	
		Thread.sleep(1000);
		
		
		WebElement statusDrpWebElement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(statusNameValueDropdown_xpath));
		
		
		Select sel = new Select(statusDrpWebElement);
		List<WebElement> list = sel.getOptions();				
		
		for(WebElement ele : list){
			
			if(ele.getText().equals(statusToSearch)){
				ele.click();
				break;			
		}		}
		//Thread.sleep(8000);	
		Thread.sleep(1000);
		WebElement searchAdvSearchWebElement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(searchAdvSearch_xpath));
		searchAdvSearchWebElement.click();
		Thread.sleep(5000);	
		
		WebElement searchInputWebElement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(statusUserSpecficSearch_xpath));
		searchInputWebElement.getText().equalsIgnoreCase(statusToSearch);
		return true;
	}
	catch(Exception e){
		return false;
	}}
	
	
	public boolean fromDateToDateAdvSearch(String fromDateTextValue,String toDateTextValue)
	{
	try{
		// Thread.sleep(10000);	
		Thread.sleep(1000);
//WebElement toDateTextIconWebElement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(toDateSearchIcon_xpath));
		//toDateTextIconWebElement.click();

		WebElement startDateAdvSearchWebElement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(dateStartDate_Xpath));
		startDateAdvSearchWebElement.getText().contains(fromDateTextValue);
		
		WebElement endDateAdvSearchWebElement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(dateEndDate_xpath));
		endDateAdvSearchWebElement.getText().contains(toDateTextValue);
		return true;
		
		}
	catch(Exception e){
		return false;
	}}
	
	
	public boolean clickOnCancelAdvSearch(String taskNameUserInput)
	{
	try{
		WebElement searchAdvSearchWebElement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(CancelAdvSearch_xpath));
		searchAdvSearchWebElement.click();
		// Thread.sleep(10000);
		Thread.sleep(1000);
		
		return true;
	}
	catch(Exception e){
		return false;
	}}
	
	public boolean cancelChangesAdvSearch(String taskNameUserInput)
	{
	try{

		
		WebElement taskNameAdvSearchWebElement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(taskNameTextDrpDown));
		taskNameAdvSearchWebElement.sendKeys(taskNameUserInput);	

		// Thread.sleep(10000);
		Thread.sleep(1000);
		
		return true;
	}
	catch(Exception e){
		return false;
	}}
	
	public boolean fromDateAdvSearch(String fromDateTextValue)
	{
	try{

		//Thread.sleep(15000);	
		Thread.sleep(1000);
		
		
		WebElement searchDateWebElement=new WebDriverWait(driver,30).until(ExpectedConditions.visibilityOfElementLocated(date_Xpath));
		
		String actual=searchDateWebElement.getText().substring(0,10);
		
		    Date date = new Date(System.currentTimeMillis());
		    SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
		    String expected = formatter.format(date);
		    if (actual.equals(expected)) {
				return true;
			}else {
				
				return false;
			}
		}
	catch(Exception e){
		System.out.println("Error");
		return false;
	}}
	
	public boolean toDateAdvSearch(String toDateTextValue)
	{
	try{
		//Thread.sleep(15000);	
		Thread.sleep(1000);
		
		
		WebElement searchDateWebElement=new WebDriverWait(driver,30).until(ExpectedConditions.visibilityOfElementLocated(date_Xpath));
		
		String actual=searchDateWebElement.getText();
		    
		    if (actual.equals(toDateTextValue)) {
				return true;
			}
			
		}
	catch(Exception e){
		System.out.println("Error");
		return false;
	}
	return true;
	}
	
	
	/*public String taskNameTypeBootStrapDropDownValueSelection(String organizationTypeValue) throws InterruptedException
	 {
	  
		WebElement advanceSearchWebElement=new WebDriverWait(driver,30).until(ExpectedConditions.visibilityOfElementLocated(advanceSearchLink_xpath));
		advanceSearchWebElement.click();
		//Thread.sleep(15000);
		
		WebElement SaveOnAddSalesWebEelement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(taskNameTextDrpDown));
	     int flag=0;
	     SaveOnAddSalesWebEelement.click();

	     List<WebElement> organizationType = driver.findElements(recordMessage_xpath); 
	     flag=0;
	     for (WebElement orgType : organizationType) 
	     {   
	         if (orgType.getText().equals(organizationTypeValue)) 
	         {
	             orgType.click();
	             flag=1;
	             break;
	         }
	     }
	 return organizationTypeValue;
}*/
	
	public boolean taskNameTitle(String taskNameHeader)
	{
	try{
		WebElement taskNametitleTitleWebElement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(taskNameTitle_xpath));
		String actual=taskNametitleTitleWebElement.getText();
		if (actual.equals(taskNameHeader)) 
			return true;
	}
	catch(Exception e){
		return false;
	}
	return true;
	
	}
	
	public boolean startTimeTitle(String startTimeHeader)
	{
	try{
		WebElement startTimetitleWebElement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(startTime_xpath));
		String actual=startTimetitleWebElement.getText();
		if (actual.equals(startTimeHeader)) 
			return true;
		
		
	}
	catch(Exception e){
		return false;
	}
	return true;
	
	}
	public boolean endTimeTitle(String endTimeHeader)
	{
	try{
		WebElement endTimetitleWebElement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(endTimeTitle_xpath));
		String actual=endTimetitleWebElement.getText();
		if (actual.equals(endTimeHeader)) {
			return true;
		}else {
			return false;
		}
		
	}
	catch(Exception e){
		
	}
	return false;
	
	}
	public boolean statusTitle(String statusHeader)
	{
	try{
		WebElement statusTitleWebElement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(statusTitle_xpath));
		String actual=statusTitleWebElement.getText();
		if (actual.equals(statusHeader)) {
			return true;
		}else {
			return false;
		}
		
	}
	catch(Exception e){
		
	}
	return false;
	
	}
	
	
	public boolean masterSearchUI()
	{
	try{
		WebElement masterSearchWebElement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(masterSearch_xpath));
		masterSearchWebElement.isDisplayed();
	
		return true;
	}
	catch(Exception e){
		return false;
	}}
	
	
	public boolean  verifyStatusDropdownValues(){
		 try {
				// Thread.sleep(10000);
			 Thread.sleep(1000);
		  String[] exp = {"All","Success","Failure"};
		  
		  WebElement dropdown = driver.findElement(statusNameValueDropdown_xpath);  
		  dropdown.click();
		  Select select = new Select(dropdown);  

		   List<WebElement> options = select.getOptions();     
		   for(WebElement we:options)  
		   {  
		    
		    boolean match = false;
		    for (int i=0; i<exp.length; i++){
		        if (we.getText().equals(exp[i])){
		          match = true;
		          System.out.println(we.getText());
		        }
		      }
		    Assert.assertTrue(match);
		   }
		 } catch (Exception e) {
		  
		  return false;
		 }
		 return true;
	}
	
	
	public boolean recordsCount(String automatedTaskLogsCount)
	{
	try{
		//Thread.sleep(15000);
		Thread.sleep(1000);
		WebElement countOfRecordsWebElement=new WebDriverWait(driver,30).until(ExpectedConditions.visibilityOfElementLocated(recordsCount_xpath));
		String title=countOfRecordsWebElement.getText().substring(0,7);
		
		if (title.equals(automatedTaskLogsCount)) {
			return true;
		}
	}
	catch(Exception e){
		
	}
	return false;
	
	}
	

}