package com.cync.pages;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.cync.base.BasePage;

public class AuditLogPage extends BasePage {

private final By auditLogsTitle_xpath=By.xpath("//h3[text()='Audit Logs']");
private final By clientNameTitle_xpath=By.xpath("//span[text()='Client Name']");
private final By dateTimeTitle_xpath=By.xpath("//span[text()='Date Time']");
private final By userNameTitle_xpath=By.xpath("//span[text()='User']");
private final By programNameTitle_xpath=By.xpath("//span[text()='Program']");
private final By actionTitle_xpath=By.xpath("//span[text()='Action']");
private final By fieldTitle_xpath=By.xpath("//span[text()='Field']");
private final By oldValueTitle_xpath=By.xpath("//span[text()='Old Value']");
private final By newValueTitle_xpath=By.xpath("//span[text()='New Value']");
private final By masterSearch_xpath=By.xpath("//input[@placeholder='Search Here']");
private final By searchValue_xpath=By.xpath("(//span[text()='update'])[4]");
private final By searchInvalidValue_xpath=By.xpath("//span[text()='No records found']");
private final By advanceSearchLink_xpath=By.xpath("//a[text()='Advanced Search']");

private final By clientNameDropDown_xpath=By.xpath("//label[text()='Client Name']");
private final By actionDropDown_xpath=By.xpath("//label[text()='Action']");
private final By programDropdown_xpath=By.xpath("//label[text()='Program']");
private final By userDropDown_xpath=By.xpath("//label[text()='User']");
private final By fromDateWidget_xpath=By.xpath("//label[text()='From Date']");
private final By toDateWidget_xpath=By.xpath("//label[text()='To Date']");

private final By searchAdvSearch_xpath=By.id("action_save");
private final By CancelAdvSearch_xpath=By.id("action_cancel");

private final By fromDateTextField_xpath=By.xpath("//input[@class='ng-tns-c3-5 ui-inputtext ui-widget ui-state-default ui-corner-all ng-star-inserted']");
private final By fromDateSearchValue_xpath=By.xpath("(//a[@class='ui-state-default ng-tns-c3-5 ng-star-inserted'])[7]");
private final By toDateTextField_xapth=By.xpath("//input[@class='ng-tns-c3-6 ui-inputtext ui-widget ui-state-default ui-corner-all ng-star-inserted']");
private final By toDateSearchValue_xpath=By.xpath("(//a[@class='ui-state-default ng-tns-c3-6 ng-star-inserted'])[9]");
private final By toDateSearchIcon_xpath=By.xpath("(//span[@class='ui-button-icon-left ui-clickable fa fa-fw fa-calendar'])[2]");

private final By actionDropDownVal=By.xpath("//div[@id='adv_search']/div[2]/select");

private final By clientNameValueDropdown_xpath=By.xpath("(//select[@class='form-control ng-untouched ng-pristine ng-valid'])[1]");
private final By clientUserSpecficSearch_xpath=By.xpath("(//span[@class='ui-cell-data ng-star-inserted'])[1]");
private final By actionNameValueDropdown_xpath=By.xpath("(//select[@class='form-control ng-untouched ng-pristine ng-valid'])[2]");
private final By actionUSerSpecificSearch_xapth=By.xpath("(//span[@class='ui-cell-data ng-star-inserted'])[5]");
private final By programValueDropdown_xpath=By.xpath("(//select[@class='form-control ng-untouched ng-pristine ng-valid'])[3]");
private final By programUserSpecificSearch_xpath=By.xpath("(//span[@class='ui-cell-data ng-star-inserted'])[4]");
private final By userValueDropdown_xpath=By.xpath("(//select[@class='form-control ng-untouched ng-pristine ng-valid'])[4]");
private final By userNameUserSpecific_xpath=By.xpath("(//span[@class='ui-cell-data ng-star-inserted'])[3]");
//private final By systemDate_xpath=By.xpath("(//span[contains(text(),'04/05/2018')])[1]");//change to today date
private final By date_Xpath=By.xpath("(//span[@class='ui-cell-data ng-star-inserted'])[2]");
public static int indexSI = 1;
private final By recordsCount_xpath=By.xpath("//p[@class='recordcount ng-star-inserted']");


private final By SelectClientFromTheDropDown_xpath=By.xpath("//div[@class='col-xs-12 col-sm-6 col-md-2 ad-bt-pad-15 col-lg-2 no_marg no_pad']//select[@class='form-control ng-pristine ng-valid ng-touched']");
private final By SelectActionFromTheDropDown_xpath=By.xpath("//div[@class='form-group p-t-16 ng-star-inserted']//div[2]//select[1]");
private final By SelectUserFromTheDropDown_xpath=By.xpath("//div[@id='adv_search']//div[4]//select[1]");
private final By SelectFromDate_xpath=By.xpath("//span[@class='ng-tns-c4-5 ui-calendar ui-calendar-w-btn']//input[@type='text']");
private final By SelectToDate_xpath=By.xpath("//span[@class='ng-tns-c4-6 ui-calendar ui-calendar-w-btn']//input[@type='text']");
private final By newValueDetails_xpath=By.xpath("(//td[@class='ng-star-inserted'])[8]");
private final By ArBorrowingBaseValue_xpath=By.xpath("(//td[@class='ng-star-inserted'])[32]");
private final By BorrowingBaseValue_xpath=By.xpath("(//td[@class='ng-star-inserted'])[24]");
 

	
//author garima
private final By skippbbc_xpath=By.xpath("(//tr[@class='ui-datatable-even ui-widget-content ng-star-inserted']//span[@class='ui-cell-data ng-star-inserted'])[5]");


	public AuditLogPage(WebDriver driver) {
		super(driver);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
		    
	
	public String auditLogsTitle(String auditLogsHeader)
	{
	try{
		WebElement auditLogsTitleWebElement=new WebDriverWait(driver,30).until(ExpectedConditions.visibilityOfElementLocated(auditLogsTitle_xpath));
		auditLogsTitleWebElement.getText();
		
	}
	catch(Exception e){
		
	}
	return auditLogsHeader;
	
	}
	
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
	
	public boolean dateTimeUI()
	{
	try{
		WebElement dateTimeTitleWebElement=new WebDriverWait(driver,30).until(ExpectedConditions.visibilityOfElementLocated(dateTimeTitle_xpath));
		dateTimeTitleWebElement.isDisplayed();
		return true;
	}
	catch(Exception e){
		return false;
	}}	

	public boolean userUI()
	{
	try{
		WebElement userTitleWebElement=new WebDriverWait(driver,30).until(ExpectedConditions.visibilityOfElementLocated(userNameTitle_xpath));
		userTitleWebElement.isDisplayed();
		return true;
	}
	catch(Exception e){
		return false;
	}}	
	
	public boolean programUI()
	{
	try{
		WebElement programTitleWebElement=new WebDriverWait(driver,30).until(ExpectedConditions.visibilityOfElementLocated(programNameTitle_xpath));
		programTitleWebElement.isDisplayed();
		return true;
	}
	catch(Exception e){
		return false;
	}}	
	
	public boolean actionUI()
	{
	try{
		WebElement actionTitleWebElement=new WebDriverWait(driver,30).until(ExpectedConditions.visibilityOfElementLocated(actionTitle_xpath));
		actionTitleWebElement.isDisplayed();
		return true;
	}
	catch(Exception e){
		return false;
	}}	
	
	public boolean fieldUI()
	{
	try{
		WebElement fieldTitleWebElement=new WebDriverWait(driver,30).until(ExpectedConditions.visibilityOfElementLocated(fieldTitle_xpath));
		fieldTitleWebElement.isDisplayed();
		return true;
	}
	catch(Exception e){
		return false;
	}}	
	
	public boolean oldValueUI()
	{
	try{
		WebElement oldValueTitleWebElement=new WebDriverWait(driver,30).until(ExpectedConditions.visibilityOfElementLocated(oldValueTitle_xpath));
		oldValueTitleWebElement.isDisplayed();
		return true;
	}
	catch(Exception e){
		return false;
	}}	
	
	public boolean newValueUI()
	{
	try{
		WebElement newValueTitleWebElement=new WebDriverWait(driver,30).until(ExpectedConditions.visibilityOfElementLocated(newValueTitle_xpath));
		newValueTitleWebElement.isDisplayed();
		return true;
	}
	catch(Exception e){
		return false;
	}}	
	public boolean masterSearchUI()
	{
	try{
		WebElement masterSearchWebElement=new WebDriverWait(driver,30).until(ExpectedConditions.visibilityOfElementLocated(masterSearch_xpath));
		masterSearchWebElement.isDisplayed();
		return true;
	}
	catch(Exception e){
		return false;
	}}
	
	public boolean masterSearchFunctionality(String searchValue)
	{
	try{
		Thread.sleep(20000);
		WebElement masterSearchWebElement=new WebDriverWait(driver,30).until(ExpectedConditions.visibilityOfElementLocated(masterSearch_xpath));
		masterSearchWebElement.sendKeys(searchValue);
		return true;
	}
	catch(Exception e){
		return false;
	}
	
	}
	
	public boolean masterSearchFunctionalityValidSearch()
	{
	try{
		Thread.sleep(20000);
		WebElement searchInputWebElement=new WebDriverWait(driver,30).until(ExpectedConditions.visibilityOfElementLocated(searchValue_xpath));
		searchInputWebElement.isDisplayed();
		//String searchedValue=searchInputWebElement.getText();
		//return searchedValue;
		Thread.sleep(10000);
		return true;
	}
	catch(Exception e){
		return false;
	}
	
	}
	
	public boolean masterSearchWithInvalidInput()
	{
	try{
		Thread.sleep(20000);
		WebElement searchInputWebElement=new WebDriverWait(driver,30).until(ExpectedConditions.visibilityOfElementLocated(searchInvalidValue_xpath));
		searchInputWebElement.isDisplayed();
		//String searchedValue=searchInputWebElement.getText();
		//return searchedValue;
		Thread.sleep(13000);
		return true;
	}
	catch(Exception e){
		return false;
	}}
	
	public boolean advanceSearchUI()
	{
	try{
		Thread.sleep(10000);
		WebElement advanceSearchWebElement=new WebDriverWait(driver,30).until(ExpectedConditions.visibilityOfElementLocated(advanceSearchLink_xpath));
		advanceSearchWebElement.isDisplayed();
		return true;
	}
	catch(Exception e){
		return false;
	}}
	
	public boolean clickOnAdvSearch()
	{
	try{
		Thread.sleep(25000);
		WebElement advanceSearchWebElement=new WebDriverWait(driver,30).until(ExpectedConditions.visibilityOfElementLocated(advanceSearchLink_xpath));
		advanceSearchWebElement.click();
		Thread.sleep(10000);
		return true;
	}
	catch(Exception e){
		return false;
	}}
	
	public boolean clientNameAdvSearchUI()
	{
	try{
		Thread.sleep(20000);
		WebElement clientAdvSearchWebElement=new WebDriverWait(driver,30).until(ExpectedConditions.visibilityOfElementLocated(clientNameDropDown_xpath));
		clientAdvSearchWebElement.isDisplayed();
		return true;
	}
	catch(Exception e){
		return false;
	}}
	
	public boolean actionAdvSearchUI()
	{
	try{
		Thread.sleep(20000);
		WebElement actionAdvSearchWebElement=new WebDriverWait(driver,30).until(ExpectedConditions.visibilityOfElementLocated(actionDropDown_xpath));
		actionAdvSearchWebElement.isDisplayed();
		return true;
	}
	catch(Exception e){
		return false;
	}}	
	

	public boolean programAdvSearchUI()
	{
	try{
		Thread.sleep(20000);
		WebElement programAdvSearchWebElement=new WebDriverWait(driver,30).until(ExpectedConditions.visibilityOfElementLocated(programDropdown_xpath));
		programAdvSearchWebElement.isDisplayed();
		return true;
	}
	catch(Exception e){
		return false;
	}}	
	
	public boolean userAdvSearchUI()
	{
	try{
		Thread.sleep(20000);
		WebElement userAdvSearchWebElement=new WebDriverWait(driver,30).until(ExpectedConditions.visibilityOfElementLocated(userDropDown_xpath));
		userAdvSearchWebElement.isDisplayed();
		return true;
	}
	catch(Exception e){
		return false;
	}}	
	
	public boolean fromDateAdvSearchUI()
	{
	try{
		Thread.sleep(10000);
		WebElement fromDateAdvSearchWebElement=new WebDriverWait(driver,30).until(ExpectedConditions.visibilityOfElementLocated(fromDateWidget_xpath));
		fromDateAdvSearchWebElement.isDisplayed();
		return true;
	}
	catch(Exception e){
		return false;
	}}
	
	public boolean toDateAdvSearchUI()
	{
	try{
		Thread.sleep(10000);
		WebElement toDateAdvSearchWebElement=new WebDriverWait(driver,30).until(ExpectedConditions.visibilityOfElementLocated(toDateWidget_xpath));
		toDateAdvSearchWebElement.isDisplayed();
		return true;
	}
	catch(Exception e){
		return false;
	}}
	
	public boolean searchAdvSearchUI()
	{
	try{
		Thread.sleep(10000);
		WebElement searchAdvSearchWebElement=new WebDriverWait(driver,30).until(ExpectedConditions.visibilityOfElementLocated(searchAdvSearch_xpath));
		searchAdvSearchWebElement.isDisplayed();
		return true;
	}
	catch(Exception e){
		return false;
		}}
	
	public boolean cancelAdvSearchUI()
	{
	try{
		Thread.sleep(10000);
		WebElement cancelAdvSearchWebElement=new WebDriverWait(driver,30).until(ExpectedConditions.visibilityOfElementLocated(CancelAdvSearch_xpath));
		cancelAdvSearchWebElement.click();;
		return true;
	}
	catch(Exception e){
		return false;
	}}
	
	public boolean clickOnSearchInAdvanceSearch()
	{
	try{
		Thread.sleep(13000);
		WebElement searchAdvSearchWebElement=new WebDriverWait(driver,30).until(ExpectedConditions.visibilityOfElementLocated(searchAdvSearch_xpath));
		searchAdvSearchWebElement.click();
		Thread.sleep(13000);
		return true;
	}
	catch(Exception e){
		return false;
	}}
	
	public boolean clickOnFromDateAdvSearch()
	{
	try{
		Thread.sleep(10000);
		WebElement fromDateTextWebElement=new WebDriverWait(driver,30).until(ExpectedConditions.visibilityOfElementLocated(fromDateTextField_xpath));
		fromDateTextWebElement.click();
		Thread.sleep(10000);
		return true;
	}
	catch(Exception e){
		return false;
	}}
	
	
	public boolean fromDateAdvSearchTextWidget(String fromDateTextValue)
	{
	try{
		WebElement fromDateTextWebElement=new WebDriverWait(driver,30).until(ExpectedConditions.visibilityOfElementLocated(fromDateTextField_xpath));
		fromDateTextWebElement.sendKeys(fromDateTextValue);
		Thread.sleep(10000);
		return true;
	}
	catch(Exception e){
		return false;
	}}
	
	public boolean fromDateAdvSearchCalenderWidget()
	{
	try{
		Thread.sleep(10000);
		WebElement SearchWebElement=new WebDriverWait(driver,30).until(ExpectedConditions.visibilityOfElementLocated(fromDateSearchValue_xpath));
		SearchWebElement.click();
		Thread.sleep(10000);
		return true;
	}
	catch(Exception e){
		return false;
	}}
	
	
	public boolean clickOntoDateAdvSearch()
	{
	try{
		Thread.sleep(20000);
		WebElement toDateTextWebElement=new WebDriverWait(driver,30).until(ExpectedConditions.visibilityOfElementLocated(toDateTextField_xapth));
		toDateTextWebElement.click();
		return true;
	}
	catch(Exception e){
		return false;
	}}
	
	public boolean toDateAdvSearchTextWidgetPassValue(String toDateTextValue)
	{
	try{
		Thread.sleep(20000);
		WebElement toDateTextWebElement=new WebDriverWait(driver,30).until(ExpectedConditions.visibilityOfElementLocated(toDateTextField_xapth));	
		toDateTextWebElement.sendKeys(toDateTextValue);
		return true;
	}
	catch(Exception e){
		return false;
	}}
	
	public boolean toDateAdvSearchTextWidget()
	{
	try{
		Thread.sleep(20000);
		WebElement toDateTextIconWebElement=new WebDriverWait(driver,30).until(ExpectedConditions.visibilityOfElementLocated(toDateSearchIcon_xpath));
		toDateTextIconWebElement.click();
		Thread.sleep(3000);
		return true;
	}
	catch(Exception e){
		return false;
	}}
	
	public boolean toDateAdvSearchCalenderWidget()
	{
	try{
		Thread.sleep(20000);
		WebElement SearchWebElement=new WebDriverWait(driver,30).until(ExpectedConditions.visibilityOfElementLocated(toDateSearchValue_xpath));
		SearchWebElement.click();
		Thread.sleep(10000);
		return true;
	}
	catch(Exception e){
		return false;
	}}
	
	
	public boolean searchAdvSearch(String searchActionValue)
	{
	try{
		Thread.sleep(9000);
		WebElement actionSearchWebElement=new WebDriverWait(driver,30).until(ExpectedConditions.visibilityOfElementLocated(actionDropDownVal));
			
			Select sel = new Select(actionSearchWebElement);
			List<WebElement> list = sel.getOptions();				
			
			for(WebElement ele : list){
				
				if(ele.getText().equals(searchActionValue)){
					ele.click();
					break;			
			}
		} 

		return true;
	}
	catch(Exception e){
		return false;
		}}
	
	public boolean searchValueActionDropdown()
	{
	try{
		Thread.sleep(8000);	
		WebElement searchInputWebElement=new WebDriverWait(driver,30).until(ExpectedConditions.visibilityOfElementLocated(searchValue_xpath));
		searchInputWebElement.isDisplayed();		
		return true;
	}
	catch(Exception e){
		return false;
	}}
	
	public boolean clientNameValidAdvSearch(String clientNameToSearch)
	{
	try{
		Thread.sleep(20000);
		WebElement clientNameDrpWebElement=new WebDriverWait(driver,30).until(ExpectedConditions.visibilityOfElementLocated(clientNameValueDropdown_xpath));	
		Select sel = new Select(clientNameDrpWebElement);
		List<WebElement> list = sel.getOptions();				
		
		for(WebElement ele : list){
			
			if(ele.getText().equals(clientNameToSearch)){
				ele.click();
				break;			
		}		}
		Thread.sleep(8000);
		return true;
	}
	catch(Exception e){
		return false;
	}}
	
	public boolean clientNameValidAdvSearchWithSearchedValue(String clientNameToSearch)
	{
	try{
		WebElement searchInputWebElement=new WebDriverWait(driver,30).until(ExpectedConditions.visibilityOfElementLocated(clientUserSpecficSearch_xpath));
		searchInputWebElement.getText().equalsIgnoreCase(clientNameToSearch);
		return true;
	}
	catch(Exception e){
		return false;
	}}
	
	
	public boolean actionValidAdvSearch(String ActionNameToSearch)
	{
	try{
		Thread.sleep(20000);
		
		WebElement ActionDrpWebElement=new WebDriverWait(driver,30).until(ExpectedConditions.visibilityOfElementLocated(actionNameValueDropdown_xpath));
		
		Select sel = new Select(ActionDrpWebElement);
		List<WebElement> list = sel.getOptions();				
		
		for(WebElement ele : list){
			
			if(ele.getText().equals(ActionNameToSearch)){
				ele.click();
				break;			
		}		}
		Thread.sleep(8000);	
		return true;
	}
	catch(Exception e){
		return false;
	}}
	
	public boolean actionValidAdvSearchWithSearchedValue(String ActionNameToSearch)
	{
	try{
		WebElement searchInputWebElement=new WebDriverWait(driver,30).until(ExpectedConditions.visibilityOfElementLocated(actionUSerSpecificSearch_xapth));
		searchInputWebElement.getText().equalsIgnoreCase(ActionNameToSearch);
		return true;
	}
	catch(Exception e){
		return false;
	}}
	
	
	
	public boolean programValidAdvSearch(String ProgramNameToSearch)
	{
	try{

		Thread.sleep(20000);
				
		WebElement ProgramDrpWebElement=new WebDriverWait(driver,30).until(ExpectedConditions.visibilityOfElementLocated(programValueDropdown_xpath));
		
		
		Select sel = new Select(ProgramDrpWebElement);
		List<WebElement> list = sel.getOptions();				
		
		for(WebElement ele : list){
			
			if(ele.getText().equals(ProgramNameToSearch)){
				ele.click();
				break;			
		}		}
		Thread.sleep(10000);	
		WebElement searchAdvSearchWebElement=new WebDriverWait(driver,30).until(ExpectedConditions.visibilityOfElementLocated(searchAdvSearch_xpath));
		searchAdvSearchWebElement.click();
		Thread.sleep(9000);	
		
		WebElement searchInputWebElement=new WebDriverWait(driver,30).until(ExpectedConditions.visibilityOfElementLocated(programUserSpecificSearch_xpath));
		searchInputWebElement.getText().equalsIgnoreCase(ProgramNameToSearch);
		return true;
	}
	catch(Exception e){
		return false;
	}}
	
	
	public boolean userValidAdvSearch(String UserNameToSearch)
	{
	try{

		Thread.sleep(20000);
		
		WebElement UserDrpWebElement=new WebDriverWait(driver,30).until(ExpectedConditions.visibilityOfElementLocated(userValueDropdown_xpath));
		
		
		Select sel = new Select(UserDrpWebElement);
		List<WebElement> list = sel.getOptions();				
		
		for(WebElement ele : list){
			
			if(ele.getText().equals(UserNameToSearch)){
				ele.click();
				break;			
		}		}
		Thread.sleep(13000);	
		WebElement searchAdvSearchWebElement=new WebDriverWait(driver,30).until(ExpectedConditions.visibilityOfElementLocated(searchAdvSearch_xpath));
		searchAdvSearchWebElement.click();
		Thread.sleep(10000);	
		
		WebElement searchInputWebElement=new WebDriverWait(driver,30).until(ExpectedConditions.visibilityOfElementLocated(userNameUserSpecific_xpath));
		searchInputWebElement.getText().equalsIgnoreCase(UserNameToSearch);
		return true;
	}
	catch(Exception e){
		return false;
	}}
	
	
	public boolean fromDateAdvSearch(String fromDateTextValue)
	{
	try{
		Thread.sleep(20000);
	
		WebElement searchDateWebElement=new WebDriverWait(driver,30).until(ExpectedConditions.visibilityOfElementLocated(date_Xpath));
		
		String actual=searchDateWebElement.getText().substring(0, 10);
		
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
	
	
	public boolean toDateInputAndClickOnIcon(String toDateTextValue)
	{
	try{
		Thread.sleep(20000);
		
		WebElement fromDateTextWebElement=new WebDriverWait(driver,30).until(ExpectedConditions.visibilityOfElementLocated(toDateTextField_xapth));
		fromDateTextWebElement.click();
		fromDateTextWebElement.sendKeys(toDateTextValue);
		WebElement toDateTextIconWebElement=new WebDriverWait(driver,30).until(ExpectedConditions.visibilityOfElementLocated(toDateSearchIcon_xpath));
		toDateTextIconWebElement.click();
			return true;
			}
		
	catch(Exception e){
		System.out.println("Error");
		return false;
	}}
	
	
	public boolean toDateAdvSearch(String toDateTextValue)
	{
	try{
		Thread.sleep(20000);
		WebElement searchDateWebElement=new WebDriverWait(driver,30).until(ExpectedConditions.visibilityOfElementLocated(date_Xpath));
		
		String actual=searchDateWebElement.getText().substring(0, 10);
		
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
	
	
	public boolean fromDateToDateAdvSearch(String fromDateTextValue,String toDateTextValue)
	{
	try{
		Thread.sleep(10000);	
		
		WebElement dateAdvSearchWebElement=new WebDriverWait(driver,30).until(ExpectedConditions.visibilityOfElementLocated(date_Xpath));
		dateAdvSearchWebElement.getText().contains(fromDateTextValue);
		
		return true;
		
		}
	catch(Exception e){
		return false;
	}}

	
	
	
	public boolean cancelChangesInAdvSearchUI(String clientNameToSearch)
	{
	try{
		Thread.sleep(20000);
		WebElement clientNameDrpWebElement=new WebDriverWait(driver,30).until(ExpectedConditions.visibilityOfElementLocated(clientNameValueDropdown_xpath));
				
		Select sel = new Select(clientNameDrpWebElement);
		List<WebElement> list = sel.getOptions();				
		
		for(WebElement ele : list){
			
			if(ele.getText().equals(clientNameToSearch)){
				ele.click();
				break;			
		}		}
		return true;
	}
	catch(Exception e){
		return false;
	}}
	
	public boolean  verifyActionDropdownValues(){
		 try {
				Thread.sleep(10000);
		  String[] exp = {"All","Create","Update","Delete"};
		  
		  WebElement dropdown = driver.findElement(actionNameValueDropdown_xpath);  
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
		  // TODO: handle exception
		  return false;
		 }
		 return true;
	}
	
	public boolean  verifyProgramDropdownValues(){
		 try {
							
				String[] exp = {"All","ABL Customers / Vendors","ABL GL Account Details","Account Address","Active Broker","Adjustment Reason","Asset Amortized","Assets/Inventory","BBC","BBC Amend Details","BBC Files Required","Batch File","Batch Invoice","Borrower Exception","Borrower Guarantors","Borrower Legal Text","Borrower Managers","Broker Fee Setup","Bucket Aging","Cash Receipt","Cash Receipt Source Codes","Charge Codes","Charges Templates","Check Invoices","Checks","Client BBC Option","Client Balance","Client Data Mappings","Client Details","Client Parameters","Collateral Advance Rate","Collateral Loan Fee Setup","Collateral Loans","Collateral Reserves","Comment Sets","Comments","Comments Types","Contacts","Contras","Countries","Credit Line Charge Templates","Credit Line Collateral Setup","Credit Line Loans","Credit Memo","Credit Sources","Currencies","Detail Receivables","Division Code","Email Subscriptions","Email Templates","Factoring Auto Processing Fee Setup","Factoring Borrower Customer","Factoring Broker Setup","Factoring Cash Receipt","Factoring Charge Codes","Factoring Credit Scores","Factoring Customer Contact Person","Factoring Customer Office Address","Factoring Customers","Factoring Document Upload","Factoring Email","Factoring Fee","Factoring Fee Code","Factoring GL Account Details","Factoring Global Account","Factoring Invoice Ageing","Factoring Invoice Document","Factoring Invoice Validation Template","Factoring Loan Charges Template","Factoring Phone","Factoring Rebate Bucket Ageing","Factoring Rebate Charge","Factoring Rebate Summary","Factoring Receivables","Factoring Reserve Activity","Factoring Schedule","Factoring Schedule Charge","Factoring Uploaded File","File Classification","Follow Up Actions","Gl Transactions","Global Accounts","Global Debtors","Ineligibility Reasons","Ineligible Calculations","Insurance Policies Guarantors","Interest Calendar","Interest Payments","Interest Rate Codes","Interest Rates","Inventory Ineligible Summary","Invoice Status","Legal Texts","Lender Bank Details","Lender Basic Details","Lender Exception","Lender Notifications","Letter Of Credit","Loan Amortizations","Loan Fees","Loan Party","Loan Summary","Login Access Limitation","Mail Address","Miscellaneous","NAICS Codes","Net Funds Employed","Other Collateral","Parent/Child Receivable Summary","Participation Detail","Payable Bucket Aging","Personal Guarantors","Phone","Rate Adjustments","Report Templates","Rollforward Data","Sales Regions","Seasonal Advance Rates","State Provinces","System Parameters","Term Loan Collaterals","Term Loans","Text Message Subscriptions","Text Message Templates","User Extended Login","User Roles","User Subscriptions","Users","Verification Letters"};
				WebElement dropdown=new WebDriverWait(driver,40).until(ExpectedConditions.visibilityOfElementLocated(programValueDropdown_xpath));
		  //WebElement dropdown = driver.findElement(programValueDropdown_xpath);  
		  dropdown.click();
		  Thread.sleep(3000);
		  Select select = new Select(dropdown);  
			Thread.sleep(4000);
		   List<WebElement> options = select.getOptions();     
		   for(WebElement we:options)  
		   {  
		    
		    boolean match = false;
		    for (int i=0; i<exp.length; i++){
		        if (we.getText().equals(exp[i])){
		          match = true;
		          //System.out.println(we.getText());
		        }
		      }
		    Assert.assertTrue(match);
		   }
		 } catch (Exception e) {
		  // TODO: handle exception
		  return false;
		 }
		 
		 return true;
		 
		
	}
	public boolean recordsCount(String AuditLogsCount)
	{
	try{
		Thread.sleep(25000);
		WebElement countOfRecordsWebElement=new WebDriverWait(driver,30).until(ExpectedConditions.visibilityOfElementLocated(recordsCount_xpath));
		String title=countOfRecordsWebElement.getText().substring(0, 10);
		if (title.equals(AuditLogsCount)) {
			return true;
		}
	}
	catch(Exception e){
		
	}
	return false;
	
	}
	/*public void dateForm() {
		 Date date = new Date(System.currentTimeMillis());
		    SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
		    String s = formatter.format(date);
		    System.out.println(s);
		
	}
	
	*/


	
	public boolean SelectClientFromTheDropDown(String ClientName)
    {
    try{
        Thread.sleep(20000);
        WebElement clientNameDrpWebElement=new WebDriverWait(driver,30).until(ExpectedConditions.visibilityOfElementLocated(SelectClientFromTheDropDown_xpath));    
        Select sel = new Select(clientNameDrpWebElement);
        List<WebElement> list = sel.getOptions();                
        
        for(WebElement ele : list){
            
            if(ele.getText().equals(ClientName)){
                ele.click();
                break;            
        }        }
        Thread.sleep(8000);
        return true;
    }
    catch(Exception e){
        return false;
    }}
	
	public boolean SelectActionFromTheDropDown(String Action)
    {
    try{
        Thread.sleep(20000);
        WebElement clientNameDrpWebElement=new WebDriverWait(driver,30).until(ExpectedConditions.visibilityOfElementLocated(SelectActionFromTheDropDown_xpath));    
        Select sel = new Select(clientNameDrpWebElement);
        List<WebElement> list = sel.getOptions();                
        
        for(WebElement ele : list){
            
            if(ele.getText().equals(Action)){
                ele.click();
                break;            
        }        }
        Thread.sleep(8000);
        return true;
    }
    catch(Exception e){
        return false;
    }}
	
	 public boolean SelectUserFromTheDropDown(String Action)
	    {
	    try{
	        Thread.sleep(20000);
	        WebElement clientNameDrpWebElement=new WebDriverWait(driver,30).until(ExpectedConditions.visibilityOfElementLocated(SelectUserFromTheDropDown_xpath));    
	        Select sel = new Select(clientNameDrpWebElement);
	        List<WebElement> list = sel.getOptions();                
	        
	        for(WebElement ele : list){
	            
	            if(ele.getText().equals(Action)){
	                ele.click();
	                break;            
	        }        }
	        Thread.sleep(8000);
	        return true;
	    }
	    catch(Exception e){
	        return false;
	    }}
	 
	 
	 
	 public boolean SelectFromDate(String FromDate)
	    {
	    try{
	        
	        WebElement fromDateTextWebElement=new WebDriverWait(driver,30).
	                until(ExpectedConditions.visibilityOfElementLocated(SelectFromDate_xpath));
	        fromDateTextWebElement.click();
	        fromDateTextWebElement.sendKeys(FromDate);
	        Thread.sleep(10000);
	        return true;
	    }
	    catch(Exception e){
	        return false;
	    }}
	 public boolean SelectToDate(String ToDate)
	    {
	    try{
	        
	        WebElement fromDateTextWebElement=new WebDriverWait(driver,30).
	                until(ExpectedConditions.visibilityOfElementLocated(SelectToDate_xpath));
	        fromDateTextWebElement.click();
	        fromDateTextWebElement.sendKeys(ToDate);
	        Thread.sleep(10000);
	        return true;
	    }
	    catch(Exception e){
	        return false;
	    }}
	 public boolean VerifyingTheValue()
     {
     try{
 
         WebElement DeleteBtnWebEelement=new WebDriverWait(driver,30)
         .until(ExpectedConditions.visibilityOfElementLocated(newValueDetails_xpath));
    String d=     DeleteBtnWebEelement.getText();
    System.out.println(d);
         return true;
     }
     catch(Exception ex){
         return false;
     }
 
     }
	 
	 public boolean ArBorrowingBaseVAlue()
     {
     try{
 
         WebElement DeleteBtnWebEelement=new WebDriverWait(driver,30)
         .until(ExpectedConditions.visibilityOfElementLocated(ArBorrowingBaseValue_xpath));
    String d=     DeleteBtnWebEelement.getText();
    System.out.println(d);
         return true;
     }
     catch(Exception ex){
         return false;
     }
 
     }
	 
	 public boolean BorrowingBaseVAlue()
     {
     try{
 
         WebElement DeleteBtnWebEelement=new WebDriverWait(driver,30)
         .until(ExpectedConditions.visibilityOfElementLocated(BorrowingBaseValue_xpath));
    String d=     DeleteBtnWebEelement.getText();
    System.out.println(d);
         return true;
     }
     catch(Exception ex){
         return false;
     }
 
     }




//Method to display skip bbc

public boolean getskipbbc()
{
	try
	{
		WebElement ClickonAdd=new WebDriverWait(driver,5)
		.until(ExpectedConditions.visibilityOfElementLocated(skippbbc_xpath));
		String d=ClickonAdd.getText();
		System.out.println(d);
return true;
		}
	catch (Exception e)
	{
		return false;

	}}}


