package com.cync.pages;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.SkipException;


import com.cync.base.BasePage;

public class InterestRateCodes extends BasePage{
	
	
	private final By interestRateCodeHeader=By.xpath("//h3[text()='Interest Rate Codes']");
	private final By interestRateHeader=By.xpath("//h3[@class='no-m-bt m-l-0']");
	private final By interestRateHeaderAdd=By.xpath("//h3[@class='no-m-bt ng-star-inserted']");
	private final By interestRateHeaderEdit=By.xpath("//h3[@class='no-m-bt ng-star-inserted']");
	private final By interestRateDateFieldAdd=By.xpath("(//label[@class='mandatory'])[1]");
	private final By interestRateValueFieldAdd=By.xpath("(//label[@class='mandatory'])[2]");
	
	private final By interestRateDateSearchFieldAdd=By.xpath("//span//input[@class='ng-tns-c5-5 ui-inputtext ui-widget ui-state-default ui-corner-all ng-star-inserted']");
	private final By interestRateValueSearchFieldEdit=By.id("rate_value");
/*	private final By interestRateDateSearchFieldAdd=By.xpath("//input[contains(@class,'ng-tns-c5-23 ui-inputtext ui-widget')]");*/

	private final By interestRateDateCalenderdAdd=By.xpath("//span[contains(@class,'ui-button-icon-left ui-clickable fa fa-fw fa-calendar')]");
	/*private final By interestRateDateCalenderdAdd9=By.xpath("//span[contains(@class,'ng-tns-c4-2 ui-calendar ui-calendar-w-btn')]");
*/
	private final By saveButtonAdd_xpath=By.xpath("(//button[@label='Save'])[1]");
	private final By cancelButtonAdd_xpath=By.xpath("//span[text()='Cancel']");
	private final By interestRateValueSearchFieldAdd=By.id("rate_value");
	private final By breadcrumb_xpath=By.xpath("//ul[@class='breadcrumb']");
	private final By loanTypeDropdown_xpath=By.xpath("//select[@formcontrolname='loan_Type']");
	private final By interestRateCodesSeachBar_xpath=By.xpath("//input[@placeholder='Search Here']");
	private final By interestRatePageSearch_xpath=By.xpath("//input[@placeholder='Search Here']");
	private final By interestRatePageSearchSubScreen_xpath=By.xpath("(//input[@placeholder='Search Here'])[2]");
	private final By interestRateCodesAdvanceSeachBar_xpath=By.xpath("//a[contains(text(),'Advanced Search')]");
	private final By addIcon_xpath=By.xpath("//i[@id='New']");
	private final By addIconSubScreen_xpath=By.xpath("(//i[@id='New'])[2]");
	private final By editIcon_xpath=By.xpath("//i[contains(@class,'ng-star-inserted hand fa fa-pencil')]");
	private final By editIconSubScreen_xpath=By.xpath("(//i[@id='Edit'])[2]");
	private final By deleteIcon_xpath=By.xpath("(//i[@id='Delete'])[1]");
	private final By deleteIconSubScreen_xpath=By.xpath("(//i[@id='Delete'])[2]");
	private final By exportIcon_xpath=By.xpath("//i[@id='Export']");
	private final By rateCodeColumn_xpath=By.xpath("//span[text()='Rate Code']");
	private final By interestRateDateColumn_xpath=By.xpath("//span[text()='Interest Rate Date']");
	private final By interestRateValueColumn_xpath=By.xpath("//span[text()='Interest Rate Value']");
	private final By interestRateDateFieldSearch_xpath=By.xpath("(//input[@placeholder='Search'])[6]");
	private final By interestRateValueFieldSearch_xpath=By.xpath("(//input[@placeholder='Search'])[7]");
	private final By rateNameColumn_xpath=By.xpath("//span[text()='Rate Name']");
	private final By descriptionColumn_xpath=By.xpath("//span[text()='Description']");
	private final By dailyDivisorColumn_xpath=By.xpath("//span[text()='Daily Divisor']");
	private final By dailyPrecisionColumn_xpath=By.xpath("//span[text()='Daily Precision']");
	private final By rateCodeFieldSearch_xpath=By.xpath("(//input[@placeholder='Search'])[1]");
	private final By rateNameFieldSearch_xpath=By.xpath("(//input[@placeholder='Search'])[2]");
	private final By descriptionFieldSearch_xpath=By.xpath("(//input[@placeholder='Search'])[3]");
	private final By dailyDivisorFieldSearch_xpath=By.xpath("(//input[@placeholder='Search'])[4]");
	private final By dailyPrecisionFieldSearch_xpath=By.xpath("(//input[@placeholder='Search'])[5]");
	private final By firstCheckbox_xpath=By.xpath("(//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default'])[2]");
	private final By selectAllCheckBox_xpath=By.xpath("(//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default'])[1]");
	private final By CheckBox_xpath=By.xpath("(//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default'])[22]");
	private final By searchFail_xpath=By.xpath("//span[text()='No records found']");
	private final By validsearch_xpath=By.xpath("//div[@class='w-200 ng-star-inserted']");
	private final By interestCodeAddHeader_xpath=By.xpath("//h3[text()='Interest Rate Codes - Add New']");
	private final By rateCodeAddField_xpath=By.xpath("(//label[@class='mandatory'])[1]");
	private final By rateNameAddField_xpath=By.xpath("(//label[@class='mandatory'])[2]");
	private final By descriptionAddField_xpath=By.xpath("(//label[text()='Description'])");
	private final By dailyDivisorAddField_xpath=By.xpath("(//label[@class='mandatory'])[3]");
	private final By dailyPrecisionAddField_xpath=By.xpath("//label[contains(text(),'Daily Precision')]");
	private final By rateCodeAddFieldTextbox_xpath=By.xpath("//input[@id='rate_code']");
	private final By rateNameAddFieldTextbox_xpath=By.xpath("//input[@id='rate_name']");
	private final By descriptionAddFieldTextbox_xpath=By.xpath("//input[@id='rate_description']");
	private final By dailyDivisorAddFieldTextbox_xpath=By.xpath("//input[@id='rate_divisor']");
	private final By dailyPrecisionAddFieldTextbox_xpath=By.xpath("//input[@id='rate_precision']");
	private final By cancelButton_xpath=By.xpath("//button[@id='action_back']");
	private final By saveNewButton_xpath=By.xpath("//span[text()='Save & New']");
	private final By saveButton_xpath=By.xpath("//span[text()='Save']");
	private final By rateCodeErrorMessage_xpath=By.xpath("//small[text()='Enter Rate Code']");
	private final By rateNameErrorMessage_xpath=By.xpath("//small[text()='Enter Rate Name']");
	private final By rateDateErrorMessage_xpath=By.xpath("//small[text()='Enter Interest Rate Date']");
	private final By rateValueErrorMessage_xpath=By.xpath("//small[text()='Enter Interest Rate Value']");
	private final By ErrorMessage_xpath=By.id("every-api-message");
	private final By SuccessMessage_xpath=By.id("every-api-message");
	private final By interestRateCodeEditHeader_xpath=By.xpath("//h3[text()='Interest Rate Codes - Edit ']");
	private final By firstCheckBox_xpath=By.xpath("(//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default'])[2]");
	private final By firstCheckBoxSubScreen_xpath=By.xpath("(//div[contains(@class,'ui-chkbox-box ui-widget ')])[4]");
	private final By selectAllCheckBoxSubScreen_xpath=By.xpath("(//div[contains(@class,'ui-chkbox-box ui-widget ')])[3]");
	private final By data_xpath=By.xpath("(//span[@class='ui-cell-data ng-star-inserted'])[1]");
	private final By monthDropDown_xpath=By.xpath("//select[contains(@class,'ui-datepicker-month')]");
	private final By yearDropDown_xpath=By.xpath("//select[contains(@class,'ui-datepicker-year')]");
	private final By day_xpath=By.xpath("//select[contains(@class,'ui-datepicker-year ng-tns-c5-13 ng-star-inserted')]");
	private final By dateWidget_xpath=By.xpath("//table[contains(@class,'ui-datepicker-calendar')]");
	private final By dateRows_xpath=By.tagName("tr");
/*	private final By dateColumn_xpath=By.tagName("td");
*/	private final By dateColumn_xpath=By.xpath("//tbody[@class='ng-tns-c4-2']//tr//td");

	private final By datasearchCheckbox_xpath=By.xpath("(//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default'])[2]");
	
	/*private final By natSigndrop=By.xpath("//span[text()='Select Client']");
	private final By natSigndrop1=By.xpath("//input[@class='select2-search__field']");
	private final By natSigndrop2=By.xpath("//li[text()='8JUNETEST2634']");
	*/
	
	  private final By exportButton_xpath=By.id("Export");
	  private final By exportHeader_xpath=By.xpath("//span[contains(text(),'Interest Rates')]");
	  private final By exportButtonPopUp_xpath=By.xpath("//span[contains(text(),'Export')]");
	  private final By crossIconPopUp_xpath=By.xpath("//span[@class='fa fa-fw fa-close']");	
	  private final By interestRateDateOnExport_xpath=By.xpath("//label[contains(text(),'Interest Rate Date')]");
	  private final By interestRateValueOnExport_xpath=By.xpath("//label[contains(text(),'Interest Rate Value')]");
	  private final By interestRateDateCheckboxOnExport_xpath=By.xpath("(//span[@class='ui-chkbox-icon ui-clickable fa fa-check'])[5]");
	  private final By interestRateValueCheckboxOnExport_xpath=By.xpath("(//span[@class='ui-chkbox-icon ui-clickable fa fa-check'])[6]");
	  private final By deletebuttonpopup_xpath=By.xpath("(//div[@id='cync_alerts'])[2]");
	  private final By deleteYes_xpath=By.xpath("//button[text()='Yes']");
	  private final By deleteNo_xpath=By.xpath("//button[text()='No']");
	  
	
	
	
	
	
	
	
	public InterestRateCodes(WebDriver driver)
	{
		super(driver);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(!driver.findElement(interestRateCodeHeader).getText().trim().equals("Interest Rate Codes")){
			throw new SkipException("Interest Rate Codes couldn't open.");
		}// TODO Auto-generated constructor stub

	
	}
	
	public String verifyInterestRateCodesBreadcrumb(String InterestRateCodesBreadcrumb)
	{
		try{
			WebElement breadcrumbWebEelement=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(breadcrumb_xpath));
			String actualData=breadcrumbWebEelement.getText().trim();
			if(actualData.equalsIgnoreCase(InterestRateCodesBreadcrumb));
		}
		catch(Exception ex){
			
		}
		return InterestRateCodesBreadcrumb;

		}
	
	public String verifyInterestRateCodesHeader(String InterestRateCodesHeader)
	{
	try{
		WebElement interestRateCodesWebEelement=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(interestRateCodeHeader));
	      String actualData=interestRateCodesWebEelement.getText();
		   if(actualData.equalsIgnoreCase(InterestRateCodesHeader));
		
	}
	catch(Exception ex){
		
	}
	return InterestRateCodesHeader;
	
	}
	
	public boolean verifySelectLoanTypeDropdown_UIValidation()
	{
	try{
		WebElement interestRateCodesWebEelement=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(loanTypeDropdown_xpath));
		interestRateCodesWebEelement.isDisplayed();
	}
	catch(Exception ex){
		
	}
	return false;	
	}
	
	public boolean interestRateCodesPageSerach()
	{
	try{
		WebElement interestRateCodesSearchWebEelement=new WebDriverWait(driver,30)
			.until(ExpectedConditions.visibilityOfElementLocated(interestRateCodesSeachBar_xpath));
		interestRateCodesSearchWebEelement.isDisplayed();
		return true;
	}
	catch(Exception ex){
		return false;
	}
	}
	
	public boolean interestRateCodesAdvanceSerach()
	{
	try{
		WebElement interestRateCodesSearchWebEelement=new WebDriverWait(driver,30)
			.until(ExpectedConditions.visibilityOfElementLocated(interestRateCodesAdvanceSeachBar_xpath));
		interestRateCodesSearchWebEelement.isDisplayed();
		return true;
	}
	catch(Exception ex){
		return false;
	}
	}
	
	public boolean addIconUIValidation()
	{
		try{
			WebElement addButtonWebElement=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(addIcon_xpath));
			addButtonWebElement.isDisplayed();
			return true;
		}
		catch(Exception ex){
			return false;
		}

		}

	public boolean editIconUIValidation()
	{
		try{
			WebElement addButtonWebElement=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(editIcon_xpath));
			addButtonWebElement.isDisplayed();
			return true;
		}
		catch(Exception ex){
			return false;
		}

		}
	public boolean deleteIconUIValidation()
	{
		try{
			WebElement deleteButtonWebElement=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(deleteIcon_xpath));
			deleteButtonWebElement.isDisplayed();
			return true;
		}
		catch(Exception ex){
			return false;
		}

		}
	
	public boolean  rateCodeColumnUIValidation()
    {
  	  try{
  		  WebElement rateCodesColumnWebElement=new WebDriverWait(driver,10)
  		  .until(ExpectedConditions.visibilityOfElementLocated(rateCodeColumn_xpath));
  		rateCodesColumnWebElement.isDisplayed();
  		  return true;
  	  }
  	  catch(Exception ex){
  			return false;
  		}
  	  }
	
	public boolean  rateNameColumnUIValidation()
    {
  	  try{
  		  WebElement rateCodesColumnWebElement=new WebDriverWait(driver,10)
  		  .until(ExpectedConditions.visibilityOfElementLocated(rateNameColumn_xpath));
  		rateCodesColumnWebElement.isDisplayed();
  		  return true;
  	  }
  	  catch(Exception ex){
  			return false;
  		}
  	  }
	
	public boolean  descriptionColumnUIValidation()
    {
  	  try{
  		  WebElement rateCodesColumnWebElement=new WebDriverWait(driver,10)
  		  .until(ExpectedConditions.visibilityOfElementLocated(descriptionColumn_xpath));
  		rateCodesColumnWebElement.isDisplayed();
  		  return true;
  	  }
  	  catch(Exception ex){
  			return false;
  		}
  	  }
	
	public boolean  dailyDivisorColumnUIValidation()
    {
  	  try{
  		  WebElement rateCodesColumnWebElement=new WebDriverWait(driver,10)
  		  .until(ExpectedConditions.visibilityOfElementLocated(dailyDivisorColumn_xpath));
  		rateCodesColumnWebElement.isDisplayed();
  		  return true;
  	  }
  	  catch(Exception ex){
  			return false;
  		}
  	  }
	
	public boolean  dailyPrecisionColumnUIValidation()
    {
  	  try{
  		  WebElement rateCodesColumnWebElement=new WebDriverWait(driver,10)
  		  .until(ExpectedConditions.visibilityOfElementLocated(dailyPrecisionColumn_xpath));
  		rateCodesColumnWebElement.isDisplayed();
  		  return true;
  	  }
  	  catch(Exception ex){
  			return false;
  		}
  	  }
	
	public boolean  rateCodeFieldSearchUIValidation()
    {
  	  try{
  		  WebElement rateCodesColumnWebElement=new WebDriverWait(driver,10)
  		  .until(ExpectedConditions.visibilityOfElementLocated(rateCodeFieldSearch_xpath));
  		rateCodesColumnWebElement.isDisplayed();
  		  return true;
  	  }
  	  catch(Exception ex){
  			return false;
  		}
  	  }
	
	public boolean  rateNameFieldSearchUIValidation()
    {
  	  try{
  		  WebElement rateCodesColumnWebElement=new WebDriverWait(driver,10)
  		  .until(ExpectedConditions.visibilityOfElementLocated(rateNameFieldSearch_xpath));
  		rateCodesColumnWebElement.isDisplayed();
  		  return true;
  	  }
  	  catch(Exception ex){
  			return false;
  		}
  	  }
	
	public boolean  descriptionFieldSearchUIValidation()
    {
  	  try{
  		  WebElement rateCodesColumnWebElement=new WebDriverWait(driver,10)
  		  .until(ExpectedConditions.visibilityOfElementLocated(descriptionFieldSearch_xpath));
  		rateCodesColumnWebElement.isDisplayed();
  		  return true;
  	  }
  	  catch(Exception ex){
  			return false;
  		}
  	  }
	
	public boolean  dailyDivisorFieldSearchUIValidation()
    {
  	  try{
  		  WebElement rateCodesColumnWebElement=new WebDriverWait(driver,10)
  		  .until(ExpectedConditions.visibilityOfElementLocated(dailyDivisorFieldSearch_xpath));
  		rateCodesColumnWebElement.isDisplayed();
  		  return true;
  	  }
  	  catch(Exception ex){
  			return false;
  		}
  	  }
	
	public boolean  dailyPrecisionFieldSearchUIValidation()
    {
  	  try{
  		  WebElement rateCodesColumnWebElement=new WebDriverWait(driver,10)
  		  .until(ExpectedConditions.visibilityOfElementLocated(dailyPrecisionFieldSearch_xpath));
  		rateCodesColumnWebElement.isDisplayed();
  		  return true;
  	  }
  	  catch(Exception ex){
  			return false;
  		}
  	  }
	
	public boolean disableOfEditDeleteIconsWithoutSelectingAnyCheckBox()
    {
try{
	
	new WebDriverWait(driver,10)
	.until(ExpectedConditions.visibilityOfElementLocated(editIcon_xpath)).isDisplayed();
	new WebDriverWait(driver,10)
	.until(ExpectedConditions.visibilityOfElementLocated(deleteIcon_xpath)).isDisplayed();
	return true;
	}
catch(Exception ex){
	return false;
}

}
	
	public boolean enableOfEditDeleteIconsByslectingOneCheckBox()
	   {
		try{
			new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(firstCheckbox_xpath)).click();
			 new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(editIcon_xpath)).isDisplayed();
			new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(deleteIcon_xpath)).isDisplayed();
			return true;
			}
		catch(Exception ex){
			return false;
		}

		}
	
	public boolean enableOfEditDeleteIconsByslectingMultipleCheckBox()
	{
		try{
			new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(selectAllCheckBox_xpath)).click();
			
			new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(editIcon_xpath)).isDisplayed();
			new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(deleteIcon_xpath)).isDisplayed();
			return true;
			}
		catch(Exception ex){
			return false;
		}

		}
	
	public boolean presenceOfScrollbar()
	{
		  try{
			  WebElement presenceOfScrollbarWebElement=new WebDriverWait(driver,10)
			  .until(ExpectedConditions.visibilityOfElementLocated(CheckBox_xpath));
			  presenceOfScrollbarWebElement.click();
		  return true;
		  }
	catch(Exception ex){
			return false;
		}
	}
	
	public boolean verifySelectLoanTypeDropdown()
	{
		try{
			String[] exp={"Please Select","CollateralLoan","CreditLoan","TermLoan"};
			
			WebElement dropdown=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(loanTypeDropdown_xpath));
			dropdown.click();
			Thread.sleep(4000);
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

		return true;
			
		}
		catch(Exception ex){
			
		}
		return false;
		
	}
	
	public boolean interestRateCodesPageSerach(String data)
	{
	try{
		WebElement SearchWebEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(interestRateCodesSeachBar_xpath));
		SearchWebEelement.clear();
		SearchWebEelement.sendKeys(data);
		//Thread.sleep(5000);
		return true;
	}
	catch(Exception ex){
		
	}
	return false;
	}

	public  String invalidSerachedData(String dataOnPage)
	{
	    try{
	WebElement SearchWebEelement=new WebDriverWait(driver,30)
		.until(ExpectedConditions.visibilityOfElementLocated(searchFail_xpath));
	SearchWebEelement.getText();
	    }
	    catch(Exception ex){

	    }
	    return dataOnPage;


	}
	public  String validSerachedData(String validdata)
	{
	    try{
	WebElement SearchWebEelement=new WebDriverWait(driver,30)
		.until(ExpectedConditions.visibilityOfElementLocated(validsearch_xpath));
	SearchWebEelement.getText();
	    }
	    catch(Exception ex){

	    }
	    return validdata;


}
	
	public boolean rateCodeFieldSearch(String data)
	{
	try{
		WebElement SearchWebEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(rateCodeFieldSearch_xpath));
		SearchWebEelement.clear();
		SearchWebEelement.sendKeys(data);
		return true;
	}
	catch(Exception ex){
		return false;	
	}
	}
	
	public boolean rateNameFieldSearch(String data)
	{
	try{
		WebElement SearchWebEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(rateNameFieldSearch_xpath));
		SearchWebEelement.clear();
		SearchWebEelement.sendKeys(data);
		return true;
	}
	catch(Exception ex){
		return false;	
	}
	}
	
	public boolean descriptionFieldSearch(String data)
	{
	try{
		WebElement SearchWebEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(descriptionFieldSearch_xpath));
		SearchWebEelement.clear();
		SearchWebEelement.sendKeys(data);
		return true;
	}
	catch(Exception ex){
		return false;	
	}
	}
	
	public boolean dailyDivisorFieldSearch(String data)
	{
	try{
		WebElement SearchWebEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(dailyDivisorFieldSearch_xpath));
		SearchWebEelement.clear();
		SearchWebEelement.sendKeys(data);
		return true;
	}
	catch(Exception ex){
		return false;	
	}
	}
	
	public boolean dailyPrecisionFieldSearch(String data)
	{
	try{
		WebElement SearchWebEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(dailyPrecisionFieldSearch_xpath));
		SearchWebEelement.clear();
		SearchWebEelement.sendKeys(data);
		return true;
	}
	catch(Exception ex){
		return false;	
	}
	}
	
	public boolean clickOnAdd()
	{
	try{
		WebElement clickAddWebEelement=new WebDriverWait(driver,1000)
			.until(ExpectedConditions.visibilityOfElementLocated(addIcon_xpath));
		clickAddWebEelement.click();
		//Thread.sleep(5000);
		return true;
	}
	catch(Exception ex){
		return false;	
	}
	}
	
	public String verifyInterestRateCodesAddHeader(String addHeader )
	{
	try{
		WebElement addHeaderWebEelement=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(interestCodeAddHeader_xpath));
		String actualData=addHeaderWebEelement.getText().trim();
		if(actualData.equalsIgnoreCase(addHeader));
	}
	catch(Exception ex){
	}
	return addHeader;
	}
	
	
	public boolean rateCodeAddFieldMandatory_UIValidation()
	{
	try{
		WebElement rateCodesWebEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(rateCodeAddField_xpath));
		rateCodesWebEelement.isDisplayed();
		return true;
	}
	catch(Exception ex){
		return false;	
	}
	}
	
	public boolean rateNameAddFieldMandatory_UIValidation()
	{
	try{
		WebElement rateCodesWebEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(rateNameAddField_xpath));
		rateCodesWebEelement.isDisplayed();
		return true;
	}
	catch(Exception ex){
		return false;	
	}
	}
	
	public boolean descriptionAddField_UIValidation()
	{
	try{
		WebElement rateCodesWebEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(descriptionAddField_xpath));
		rateCodesWebEelement.isDisplayed();
		return true;
	}
	catch(Exception ex){
		return false;	
	}
	}
	
	public boolean dailyDivisorAddFieldMandatory_UIValidation()
	{
	try{
		WebElement rateCodesWebEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(dailyDivisorAddField_xpath));
		rateCodesWebEelement.isDisplayed();
		return true;
	}
	catch(Exception ex){
		return false;	
	}
	}
	
	public boolean dailyPrecisionAddFieldMandatory_UIValidation()
	{
	try{
		WebElement rateCodesWebEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(dailyPrecisionAddField_xpath));
		rateCodesWebEelement.isDisplayed();
		return true;
	}
	catch(Exception ex){
		return false;	
	}
	}
	
	/*public boolean selectFromNatSignDropdown(String VisibleText1) throws InterruptedException{
		
		try {
			WebElement DropdownWebEelement = new WebDriverWait(driver, 10)
			.until(ExpectedConditions.visibilityOfElementLocated(natSigndrop));
			Select sel = new Select(DropdownWebEelement);
			
			List<WebElement> list = sel.getOptions();
			
			for (WebElement ele : list) 
			{
				String data = ele.getText();
				System.out.println(data);
				
				if (ele.getText().equals(VisibleText1)) 
				{
			 		ele.click();
					//Thread.sleep(10000);
					
					 return true;
				}
			}
		} 
		catch (Exception ex)
		{
			return false;
		}
		
		return false;
		}*/
	
	
	
	public boolean rateCodeAddFieldTextbox_UIValidation()
	{
	try{
		WebElement rateCodesWebEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(rateCodeAddFieldTextbox_xpath));
		rateCodesWebEelement.isDisplayed();
		return true;
	}
	catch(Exception ex){
		return false;	
	}
	}
	
	public boolean rateNameAddFieldTextbox_UIValidation()
	{
	try{
		WebElement rateCodesWebEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(rateNameAddFieldTextbox_xpath));
		rateCodesWebEelement.isDisplayed();
		return true;
	}
	catch(Exception ex){
		return false;	
	}
	}
	
	public boolean descriptionAddFieldTextbox_UIValidation()
	{
	try{
		WebElement rateCodesWebEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(descriptionAddFieldTextbox_xpath));
		rateCodesWebEelement.isDisplayed();
		return true;
	}
	catch(Exception ex){
		return false;	
	}
	}
	
	public boolean dailyDivisorAddFieldTextbox_UIValidation()
	{
	try{
		WebElement rateCodesWebEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(dailyDivisorAddFieldTextbox_xpath));
		rateCodesWebEelement.isDisplayed();
		return true;
	}
	catch(Exception ex){
		return false;	
	}
	}
	
	public boolean dailyPrecisionAddFieldTextbox_UIValidation()
	{
	try{
		WebElement rateCodesWebEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(dailyPrecisionAddFieldTextbox_xpath));
		rateCodesWebEelement.isDisplayed();
		return true;
	}
	catch(Exception ex){
		return false;	
	}
	}
	
	/*public boolean dailyPrecisionAddFieldTextboxc_UIValidation(String data)
	{
	try{
		WebElement rateCodesWebEelement=new WebDriverWait(driver,100)
		.until(ExpectedConditions.visibilityOfElementLocated(natSigndrop));
		rateCodesWebEelement.click();
		WebElement rateCodesWebEelement1=new WebDriverWait(driver,100)
		.until(ExpectedConditions.visibilityOfElementLocated(natSigndrop1));
		rateCodesWebEelement1.clear();
		rateCodesWebEelement1.sendKeys();
		WebElement rateCodesWebEelement2=new WebDriverWait(driver,100)
		.until(ExpectedConditions.visibilityOfElementLocated(natSigndrop2));
		rateCodesWebEelement2.click();
		return true;
	}
	catch(Exception ex){
		return false;	
	}
	}
	*/
	
	public String dailyDivisorAddDefaultValue_UIValidation(String data)
	{
	try{
		WebElement rateCodesWebEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(dailyDivisorAddFieldTextbox_xpath));
		String value=rateCodesWebEelement.getText();
		if(value.equals(data));
	
	}
	catch(Exception ex){
			
	}
	return data;
	}
	
	public String dailyPrecisionAddDefaultValue_UIValidation(String data)
	{
	try{
		WebElement rateCodesWebEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(dailyPrecisionAddFieldTextbox_xpath));
		String value=rateCodesWebEelement.getText();
		if(value.equals(data));
	}
	catch(Exception ex){
		
	}
	return data;
	}
	
	
	public boolean cancelButtonAdd_UIValidation()
	{
	try{
		WebElement cancelButtonAddWebEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(cancelButton_xpath));
		cancelButtonAddWebEelement.isDisplayed();
		return true;
	}
	catch(Exception ex){
		return false;	
	}
	}

	public boolean saveNewButtonAdd_UIValidation()
	{
	try{
		WebElement saveNewButtonAddWebEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(saveNewButton_xpath));
		saveNewButtonAddWebEelement.isDisplayed();
		return true;
	}
	catch(Exception ex){
		return false;	
	}
	}

	public boolean saveButtonAdd_UIValidation()
	{
	try{
		WebElement saveButtonAddWebEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(saveButton_xpath));
		saveButtonAddWebEelement.isDisplayed();
		return true;
	}
	catch(Exception ex){
		return false;	
	}
	}
	
	public String verifyRateCodeErrorMessage(String msg){
		try{
			WebElement ErrorMessageWebE=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(rateCodeAddFieldTextbox_xpath));
	         
			ErrorMessageWebE.sendKeys(Keys.TAB);
			ErrorMessageWebE.sendKeys(Keys.ENTER);
			
			String actual_msg=driver.findElement(rateCodeErrorMessage_xpath).getText();
			if(actual_msg.equalsIgnoreCase(msg));
		
		}
	catch(Exception ex){
		
		}
		return msg;

	}
	
	public String verifyRateNameErrorMessage(String msg){
		try{
			WebElement ErrorMessageWebE=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(rateNameAddFieldTextbox_xpath));
	         
			ErrorMessageWebE.sendKeys(Keys.TAB);
			ErrorMessageWebE.sendKeys(Keys.ENTER);
			
			String actual_msg=driver.findElement(rateNameErrorMessage_xpath).getText();
			if(actual_msg.equalsIgnoreCase(msg));
		
		}
	catch(Exception ex){
		
		}
		return msg;

	}
	
	public  boolean addDataToRateCodeTextBox(String Data)
	{
		try{
			WebElement rateCodesBoxWebE=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(rateCodeAddFieldTextbox_xpath));
			Thread.sleep(1000);
			rateCodesBoxWebE.clear();
			Thread.sleep(6000);
			rateCodesBoxWebE.sendKeys(Data);
			return true;	
		}
		catch(Exception ex){
			
		}
		return false;
		
	}
	
	public  boolean addDataToRateNameTextBox(String Data)
	{
		try{
			WebElement rateCodesBoxWebE=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(rateNameAddFieldTextbox_xpath));
			rateCodesBoxWebE.clear();
			Thread.sleep(6000);
			rateCodesBoxWebE.sendKeys(Data);
			return true;	
		}
		catch(Exception ex){
			
		}
		return false;
		
	}
	
	public  boolean addDataToDescriptionTextBox(String Data)
	{
		try{
			WebElement rateCodesBoxWebE=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(descriptionAddFieldTextbox_xpath));
			rateCodesBoxWebE.clear();
			Thread.sleep(6000);
			rateCodesBoxWebE.sendKeys(Data);
			return true;	
		}
		catch(Exception ex){
			
		}
		return false;
		
	}
	
	public  boolean addDataToDailyDivisorTextBox(String Data)
	{
		try{
			WebElement rateCodesBoxWebE=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(dailyDivisorAddFieldTextbox_xpath));
			rateCodesBoxWebE.clear();
			Thread.sleep(6000);
			rateCodesBoxWebE.sendKeys(Data);
			return true;	
		}
		catch(Exception ex){
			
		}
		return false;
		
	}
	
	public  boolean addDataToDailyPrecisionTextBox(String Data)
	{
		try{
			WebElement rateCodesBoxWebE=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(dailyPrecisionAddFieldTextbox_xpath));
			rateCodesBoxWebE.clear();
			Thread.sleep(6000);
			rateCodesBoxWebE.sendKeys(Data);
			return true;	
		}
		catch(Exception ex){
			
		}
		return false;
		
	}
	
	public  boolean clickOnSaveButtonOnAdd()
	{
		try{
			WebElement rateCodesBoxWebE=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(saveButton_xpath));
			rateCodesBoxWebE.click();
			
			return true;	
		}
		catch(Exception ex){
			
		}
		return false;
		
	}
	
	public String verifyErrorMessageForDuplicateData(String msg){
		try{
			WebElement ErrorMessageWebE=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(ErrorMessage_xpath));
			String actual_msg=ErrorMessageWebE.getText();
			if(actual_msg.equalsIgnoreCase(msg));
		/*return true;
		else
			return false;*/
		}
	catch(Exception ex){
		/*System.out.println(ex.getMessage());
		return false;*/
		}
		return msg;
	}
	
	public String verifyErrorMessageForInvalidData(String msg){
		try{
			WebElement ErrorMessageWebE=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(ErrorMessage_xpath));
			String actual_msg=ErrorMessageWebE.getText();
			if(actual_msg.equalsIgnoreCase(msg));
		/*return true;
		else
			return false;*/
		}
	catch(Exception ex){
		/*System.out.println(ex.getMessage());
		return false;*/
		}
		return msg;
	}
	
	
	public String verifySuccessMessageEnteringValidData (String successmsg){
		try{
			WebElement successMessageWebE=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(SuccessMessage_xpath));
			String actual_msg=successMessageWebE.getText().trim();
			
			if(actual_msg.equals(successmsg));
		}
		catch(Exception ex){
		}
		return successmsg;
		}
			/*{
				System.out.println(actual_msg);
		        return true;
			}
		else
			return false;
		}*/
	
	
	public boolean clickOnSaveNewButtonOnAdd()
	{
	try{
		WebElement saveNewButtonAddWebEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(saveNewButton_xpath));
		saveNewButtonAddWebEelement.click();
		return true;
	}
	catch(Exception ex){
		return false;	
	}
	}
	
	public boolean verifyCancelActionOnAdd()
	{
	try{
		WebElement cancelWebEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(cancelButton_xpath));
		cancelWebEelement.click();
		return true;
	}
	catch(Exception ex){
		return false;	
	}
	}
	
	/////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	
	public boolean clickOnEdit()
	{
	try{
		WebElement editWebEelement=new WebDriverWait(driver,1000)
			.until(ExpectedConditions.visibilityOfElementLocated(editIcon_xpath));
		Thread.sleep(5000);
		editWebEelement.click();
		return true;
	}
	catch(Exception ex){
		return false;	
	}
	}

	public boolean verifyInterestRateCodesEditHeader(String editHeader )
	{
	try{
		WebElement EditHeaderWebEelement=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(interestRateCodeEditHeader_xpath));
		String actualData=EditHeaderWebEelement.getText().trim();
		if(actualData.equalsIgnoreCase(editHeader))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	catch(Exception ex){
	}
	return false;

	}



	public boolean clickOnFirstCheckbox()
	{
	try{
		WebElement checkboxWebEelement=new WebDriverWait(driver,1000)
			.until(ExpectedConditions.visibilityOfElementLocated(firstCheckBox_xpath));
		checkboxWebEelement.click();
		Thread.sleep(500);
		return true;
	}
	catch(Exception ex){
		return false;	
	}
	}
	
	public boolean rateCodeEditFieldMandatory_UIValidation()
	{
	try{
		WebElement rateCodesWebEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(rateCodeAddField_xpath));
		rateCodesWebEelement.isDisplayed();
		return true;
	}
	catch(Exception ex){
		return false;	
	}
	}
	
	public boolean rateNameEditFieldMandatory_UIValidation()
	{
	try{
		WebElement rateCodesWebEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(rateNameAddField_xpath));
		rateCodesWebEelement.isDisplayed();
		return true;
	}
	catch(Exception ex){
		return false;	
	}
	}
	
	public boolean descriptionEditField_UIValidation()
	{
	try{
		WebElement rateCodesWebEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(descriptionAddField_xpath));
		rateCodesWebEelement.isDisplayed();
		return true;
	}
	catch(Exception ex){
		return false;	
	}
	}
	
	public boolean dailyDivisorEditFieldMandatory_UIValidation()
	{
	try{
		WebElement rateCodesWebEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(dailyDivisorAddField_xpath));
		rateCodesWebEelement.isDisplayed();
		return true;
	}
	catch(Exception ex){
		return false;	
	}
	}
	
	public boolean dailyPrecisionEditFieldMandatory_UIValidation()
	{
	try{
		WebElement rateCodesWebEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(dailyPrecisionAddField_xpath));
		rateCodesWebEelement.isDisplayed();
		return true;
	}
	catch(Exception ex){
		return false;	
	}
	}
	
	
	
	
	public boolean rateCodeEditFieldTextbox_UIValidation()
	{
	try{
		WebElement rateCodesWebEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(rateCodeAddFieldTextbox_xpath));
		rateCodesWebEelement.isDisplayed();
		return true;
	}
	catch(Exception ex){
		return false;	
	}
	}
	
	public boolean rateNameEditFieldTextbox_UIValidation()
	{
	try{
		WebElement rateCodesWebEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(rateNameAddFieldTextbox_xpath));
		rateCodesWebEelement.isDisplayed();
		return true;
	}
	catch(Exception ex){
		return false;	
	}
	}
	
	public boolean descriptionEditFieldTextbox_UIValidation()
	{
	try{
		WebElement rateCodesWebEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(descriptionAddFieldTextbox_xpath));
		rateCodesWebEelement.isDisplayed();
		return true;
	}
	catch(Exception ex){
		return false;	
	}
	}
	
	public boolean dailyDivisorEditFieldTextbox_UIValidation()
	{
	try{
		WebElement rateCodesWebEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(dailyDivisorAddFieldTextbox_xpath));
		rateCodesWebEelement.isDisplayed();
		return true;
	}
	catch(Exception ex){
		return false;	
	}
	}
	
	public boolean dailyPrecisionEditFieldTextbox_UIValidation()
	{
	try{
		WebElement rateCodesWebEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(dailyPrecisionAddFieldTextbox_xpath));
		rateCodesWebEelement.isDisplayed();
		return true;
	}
	catch(Exception ex){
		return false;	
	}
	}
	public boolean cancelButtonEdit_UIValidation()
	{
	try{
		WebElement cancelButtonWebEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(cancelButton_xpath));
		cancelButtonWebEelement.isDisplayed();
		return true;
	}
	catch(Exception ex){
		return false;	
	}
	}

	public boolean saveButtonEdit_UIValidation()
	{
	try{
		WebElement saveNewButtonWebEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(saveButton_xpath));
		saveNewButtonWebEelement.isDisplayed();
		return true;
	}
	catch(Exception ex){
		return false;	
	}
	}
	
	public boolean clickOnsaveButtonOnEdit()
	{
	try{
		WebElement saveButtonWebEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(saveButton_xpath));
		saveButtonWebEelement.click();
		return true;
	}
	catch(Exception ex){
		return false;	
	}
	}
	
	public boolean clickOnCancelButtonOnEdit()
	{
	try{
		WebElement cancelButtonWebEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(cancelButton_xpath));
		cancelButtonWebEelement.click();
		return true;
	}
	catch(Exception ex){
		return false;	
	}
	}


	public String verifySuccessMessageForEditingdata(String successmsg){
		try{
			WebElement successMessageWebE=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(SuccessMessage_xpath));
			String actual_msg=successMessageWebE.getText().trim();
			
			if(actual_msg.equals(successmsg));
		}
		catch(Exception ex){
		}
		return successmsg;
		}
			/*{
				System.out.println(actual_msg);
		        return true;
			}
		else
			return false;
		}*/
		
	
	
	public boolean clickOnData()
	{
	try{
		WebElement cancelButtonAddWebEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(data_xpath));
		cancelButtonAddWebEelement.click();
		return true;
	}
	catch(Exception ex){
		return false;	
	}
	}
	
	//////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public String verifyInterestRateHeader(String InterestRateHeader)
	{
	try{
		WebElement interestRateCodesWebEelement=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(interestRateHeader));
	      String actualData=interestRateCodesWebEelement.getText();
		   if(actualData.equalsIgnoreCase(InterestRateHeader));
		
	}
	catch(Exception ex){
		
	}
	return InterestRateHeader;
	
	}
	
	public boolean interestRatePageSerach()
	{
	try{
		WebElement interestRateCodesSearchWebEelement=new WebDriverWait(driver,30)
			.until(ExpectedConditions.visibilityOfElementLocated(interestRatePageSearch_xpath));
		interestRateCodesSearchWebEelement.isDisplayed();
		return true;
	}
	catch(Exception ex){
		return false;
	}
	}
	
	
	public boolean addIconUIValidationSubScreen()
	{
		try{
			WebElement addButtonWebElement=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(addIconSubScreen_xpath));
			addButtonWebElement.isDisplayed();
			return true;
		}
		catch(Exception ex){
			return false;
		}

		}

	public boolean editIconUIValidationSubScreen()
	{
		try{
			WebElement addButtonWebElement=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(editIconSubScreen_xpath));
			addButtonWebElement.isDisplayed();
			return true;
		}
		catch(Exception ex){
			return false;
		}

		}
	public boolean deleteIconUIValidationSubScreen()
	{
		try{
			WebElement deleteButtonWebElement=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(deleteIconSubScreen_xpath));
			deleteButtonWebElement.isDisplayed();
			return true;
		}
		catch(Exception ex){
			return false;
		}

		}
	
	public boolean exportIconUIValidationSubScreen()
	{
		try{
			WebElement deleteButtonWebElement=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(exportIcon_xpath));
			deleteButtonWebElement.isDisplayed();
			return true;
		}
		catch(Exception ex){
			return false;
		}

		}
	
	
	public boolean  interestRateDateColumnUIValidation()
    {
  	  try{
  		  WebElement rateCodesColumnWebElement=new WebDriverWait(driver,10)
  		  .until(ExpectedConditions.visibilityOfElementLocated(interestRateDateColumn_xpath));
  		rateCodesColumnWebElement.isDisplayed();
  		  return true;
  	  }
  	  catch(Exception ex){
  			return false;
  		}
  	  }
	
	public boolean  interestRateValueColumnUIValidation()
    {
  	  try{
  		  WebElement rateCodesColumnWebElement=new WebDriverWait(driver,10)
  		  .until(ExpectedConditions.visibilityOfElementLocated(interestRateValueColumn_xpath));
  		rateCodesColumnWebElement.isDisplayed();
  		  return true;
  	  }
  	  catch(Exception ex){
  			return false;
  		}
  	  }
	
	
	public boolean  interestRateDateFieldSearchUIValidation()
    {
  	  try{
  		  WebElement rateCodesColumnWebElement=new WebDriverWait(driver,10)
  		  .until(ExpectedConditions.visibilityOfElementLocated(interestRateDateFieldSearch_xpath));
  		rateCodesColumnWebElement.isDisplayed();
  		  return true;
  	  }
  	  catch(Exception ex){
  			return false;
  		}
  	  }
	
	public boolean  interestRateDateFieldSearchUIValidation(String data)
    {
  	  try{
  		  WebElement rateCodesColumnWebElement=new WebDriverWait(driver,10)
  		  .until(ExpectedConditions.visibilityOfElementLocated(interestRateDateFieldSearch_xpath));
  		rateCodesColumnWebElement.sendKeys(data);
  		  return true;
  	  }
  	  catch(Exception ex){
  			return false;
  		}
  	  }
	
	
	
	public boolean  interestRateValueFieldSearchUIValidation()
    {
  	  try{
  		  WebElement rateCodesColumnWebElement=new WebDriverWait(driver,10)
  		  .until(ExpectedConditions.visibilityOfElementLocated(interestRateValueFieldSearch_xpath));
  		rateCodesColumnWebElement.isDisplayed();
  		  return true;
  	  }
  	  catch(Exception ex){
  			return false;
  		}
  	  }
	
	public boolean  interestRateValueFieldSearchUIValidation(String data)
    {
  	  try{
  		  WebElement rateCodesColumnWebElement=new WebDriverWait(driver,10)
  		  .until(ExpectedConditions.visibilityOfElementLocated(interestRateValueFieldSearch_xpath));
  		rateCodesColumnWebElement.sendKeys(data);
  		  return true;
  	  }
  	  catch(Exception ex){
  			return false;
  		}
  	  }
	
	public boolean clickOnAddSubScreeen()
	{
	try{
		WebElement clickAddWebEelement=new WebDriverWait(driver,1000)
			.until(ExpectedConditions.visibilityOfElementLocated(addIconSubScreen_xpath));
		clickAddWebEelement.click();
		Thread.sleep(5000);
		return true;
	}
	catch(Exception ex){
		return false;	
	}
	}
	
	public String verifyInterestRateHeaderOnAdd(String InterestRateHeader)
	{
	try{
		WebElement interestRateCodesWebEelement=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(interestRateHeaderAdd));
	      String actualData=interestRateCodesWebEelement.getText();
		   if(actualData.equalsIgnoreCase(InterestRateHeader));
		
	}
	catch(Exception ex){
		
	}
	return InterestRateHeader;
	
	}
	
	public boolean interestRateDateFieldOnAddSubScreeen()
	{
	try{
		WebElement clickAddWebEelement=new WebDriverWait(driver,1000)
			.until(ExpectedConditions.visibilityOfElementLocated(interestRateDateFieldAdd));
		clickAddWebEelement.isDisplayed();
		//Thread.sleep(5000);
		return true;
	}
	catch(Exception ex){
		return false;	
	}
	}
	
	public boolean interestRateValueFieldOnAddSubScreeen()
	{
	try{
		WebElement clickAddWebEelement=new WebDriverWait(driver,1000)
			.until(ExpectedConditions.visibilityOfElementLocated(interestRateValueFieldAdd));
		clickAddWebEelement.isDisplayed();

		//Thread.sleep(5000);
		return true;
	}
	catch(Exception ex){
		return false;	
	}
	}
	
	public boolean interestRateDateFieldSearchOnAddSubScreeen()
	{
	try{
		WebElement clickAddWebEelement=new WebDriverWait(driver,1000)
			.until(ExpectedConditions.visibilityOfElementLocated(interestRateDateSearchFieldAdd));
		clickAddWebEelement.isDisplayed();

		//Thread.sleep(5000);
		return true;
	}
	catch(Exception ex){
		return false;	
	}
	}
	
	public boolean SaveButtonOnAddSubScreeen()
	{
	try{
		WebElement clickAddWebEelement=new WebDriverWait(driver,1000)
			.until(ExpectedConditions.visibilityOfElementLocated(saveButtonAdd_xpath));
		clickAddWebEelement.isDisplayed();

		//Thread.sleep(5000);
		return true;
	}
	catch(Exception ex){
		return false;	
	}
	}
	
	public boolean cancelButtonOnAddSubScreeen()
	{
	try{
		WebElement clickAddWebEelement=new WebDriverWait(driver,1000)
			.until(ExpectedConditions.visibilityOfElementLocated(cancelButtonAdd_xpath));
		clickAddWebEelement.isDisplayed();

		//Thread.sleep(5000);
		return true;
	}
	catch(Exception ex){
		return false;	
	}
	}
	
	
	public boolean ClickSaveButtonOnAddSubScreeen()
	{
	try{
		WebElement clickAddWebEelement=new WebDriverWait(driver,1000)
			.until(ExpectedConditions.visibilityOfElementLocated(saveButtonAdd_xpath));
		clickAddWebEelement.click();

		//Thread.sleep(5000);
		return true;
	}
	catch(Exception ex){
		return false;	
	}
	}
	
	public boolean ClickCancelButtonOnAddSubScreeen()
	{
	try{
		WebElement clickAddWebEelement=new WebDriverWait(driver,1000)
			.until(ExpectedConditions.visibilityOfElementLocated(cancelButtonAdd_xpath));
		clickAddWebEelement.click();

		//Thread.sleep(5000);
		return true;
	}
	catch(Exception ex){
		return false;	
	}
	}
	
	public boolean interestRateValueFieldSearchOnAddSubScreeen()
	{
	try{
		WebElement clickAddWebEelement=new WebDriverWait(driver,1000)
			.until(ExpectedConditions.visibilityOfElementLocated(interestRateValueSearchFieldAdd));
		clickAddWebEelement.isDisplayed();

		//Thread.sleep(5000);
		return true;
	}
	catch(Exception ex){
		return false;	
	}
	}
	
	public boolean interestRateDate(){
		try {
			
			WebElement dateWebElement1 = new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(interestRateDateCalenderdAdd));
			dateWebElement1.click();
			Thread.sleep(5000);
			
		WebElement dateWebElement = new WebDriverWait(driver,100)
		.until(ExpectedConditions.visibilityOfElementLocated(interestRateDateSearchFieldAdd));
		Date date = new Date(System.currentTimeMillis());
		SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
		String today=formatter.format(date);

		dateWebElement.sendKeys(today);


		return true;
		} catch (Exception e) {
		return false;
		}
		}
	
	
	
	public  boolean selectDate(String month,String year,String day)
	{
		
       try {
			
			WebElement dateWebElement1 = new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(interestRateDateCalenderdAdd));
			dateWebElement1.click();
			
			
		// Select year 
			
			Actions action = new Actions(driver);
			
		WebElement yearDropDown= new WebDriverWait(driver,3000)
		.until(ExpectedConditions.visibilityOfElementLocated(yearDropDown_xpath));
		action.moveToElement(yearDropDown).perform();
		action.click().build().perform();
		Thread.sleep(3000);
		Select sel1 = new Select(yearDropDown);
		
		List<WebElement> list1 = sel1.getOptions();
		
		for (WebElement ele1: list1) 
		{
			String data = ele1.getText();
			System.out.println(data);
			
			if (ele1.getText().equals(year)) 
			{
		 		ele1.click();
				Thread.sleep(3000);

				
				 return true;
			}
		}
		
		// Select Month
		
					WebElement monthDropDown= new WebDriverWait(driver,100)
					.until(ExpectedConditions.visibilityOfElementLocated(monthDropDown_xpath));
					Thread.sleep(3000);
					monthDropDown.click();
					//Thread.sleep(3000);
					
					Select sel = new Select(monthDropDown);
					
					List<WebElement> list = sel.getOptions();
					
					for (WebElement ele : list) 
					{
						/*String data = ele.getText();
						System.out.println(data);*/
						
						if (ele.getText().equals(month)) 
						{
					 		ele.click();
					 		ele.sendKeys(Keys.ESCAPE);
							Thread.sleep(5000);
							return true;
							
						}
					}
	
	
		
		// Select date
		
		List<WebElement>dateWidget=driver.findElements(dateWidget_xpath);
		
		for(WebElement ele:dateWidget)
		{
			
			String date=ele.getText();
			
			if(date.equalsIgnoreCase(day))
			{
				ele.click();
				break;
			}
			
		}
       }
		
		
		
		  
       catch(Exception ex){
   		
		}
		return false;

	
	}

	
       
		
	
	public String verifyInterateRateDateErrorMessage(String msg){
		try{
			WebElement ErrorMessageWebE=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(interestRateDateSearchFieldAdd));
	         
			ErrorMessageWebE.sendKeys(Keys.TAB);
			ErrorMessageWebE.sendKeys(Keys.ENTER);
			
			String actual_msg=driver.findElement(rateDateErrorMessage_xpath).getText();
			if(actual_msg.equalsIgnoreCase(msg));
		
		}
	catch(Exception ex){
		
		}
		return msg;

	}
	
	
	public String verifyInterateRateValueErrorMessage(String msg){
		try{
			WebElement ErrorMessageWebE=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(interestRateValueSearchFieldAdd));
	         
			ErrorMessageWebE.sendKeys(Keys.TAB);
			ErrorMessageWebE.sendKeys(Keys.ENTER);
			
			String actual_msg=driver.findElement(rateValueErrorMessage_xpath).getText();
			if(actual_msg.equalsIgnoreCase(msg));
		
		}
	catch(Exception ex){
		
		}
		return msg;

	}
	
	public boolean addDataToInterestRateDateFieldOnAddSubScreeen(String rateDate)
	{
	try{
		WebElement clickAddWebEelement=new WebDriverWait(driver,1000)
			.until(ExpectedConditions.visibilityOfElementLocated(interestRateDateSearchFieldAdd));
		clickAddWebEelement.sendKeys(rateDate);

		//Thread.sleep(5000);
		return true;
	}
	catch(Exception ex){
		return false;	
	}
	}
	
	public boolean addDataToInterestRateValueFieldOnAddSubScreeen(String rateValue)
	{
	try{
		WebElement clickAddWebEelement=new WebDriverWait(driver,1000)
			.until(ExpectedConditions.visibilityOfElementLocated(interestRateValueSearchFieldAdd));
		clickAddWebEelement.sendKeys(rateValue);

		//Thread.sleep(5000);
		return true;
	}
	catch(Exception ex){
		return false;	
	}
	}
	
	public boolean addDataToInterestRatePageSerach()
	{
	try{
		WebElement interestRateCodesSearchWebEelement=new WebDriverWait(driver,30)
			.until(ExpectedConditions.visibilityOfElementLocated(interestRatePageSearch_xpath));
		interestRateCodesSearchWebEelement.isDisplayed();
		return true;
	}
	catch(Exception ex){
		return false;
	}
	}
	
	 public boolean disableOfEditDeleteIconsWithoutSelectingAnyCheckBoxOnSubScreen()
     {
try{
	
	new WebDriverWait(driver,10)
	.until(ExpectedConditions.visibilityOfElementLocated(editIconSubScreen_xpath)).isDisplayed();
	new WebDriverWait(driver,10)
	.until(ExpectedConditions.visibilityOfElementLocated(deleteIconSubScreen_xpath)).isDisplayed();
	return true;
	}
catch(Exception ex){
	return false;
}

}

public boolean enableAndDisableOfEditDeleteIconsByslectingOneCheckBoxOnSubscreen()
{
try{
	new WebDriverWait(driver,10)
	.until(ExpectedConditions.visibilityOfElementLocated(firstCheckBoxSubScreen_xpath)).click();
	 new WebDriverWait(driver,10)
	.until(ExpectedConditions.visibilityOfElementLocated(editIconSubScreen_xpath)).isDisplayed();
	new WebDriverWait(driver,10)
	.until(ExpectedConditions.visibilityOfElementLocated(deleteIconSubScreen_xpath)).isDisplayed();
	return true;
	}
catch(Exception ex){
	return false;
}

}


public boolean enableAndDisableOfEditDeleteIconsByslectingMultipleCheckBox()
{
try{
	new WebDriverWait(driver,10)
	.until(ExpectedConditions.visibilityOfElementLocated(selectAllCheckBoxSubScreen_xpath)).click();
	
	new WebDriverWait(driver,10)
	.until(ExpectedConditions.visibilityOfElementLocated(editIconSubScreen_xpath)).isDisplayed();
	new WebDriverWait(driver,10)
	.until(ExpectedConditions.visibilityOfElementLocated(deleteIconSubScreen_xpath)).isDisplayed();
	return true;
	}
catch(Exception ex){
	return false;
}

}


public boolean rateCodePageSerach(String data)
{
try{
WebElement chargeCodesSearchWebEelement=new WebDriverWait(driver,100)
	.until(ExpectedConditions.visibilityOfElementLocated(interestRatePageSearchSubScreen_xpath));
chargeCodesSearchWebEelement.clear();
chargeCodesSearchWebEelement.sendKeys(data);
return true;
}
catch(Exception ex){
return false;	
}
}

public boolean verifyinterestRateValueFieldSearchOnAddSubScreeen(String data)
{
try{
	WebElement clickAddWebEelement=new WebDriverWait(driver,1000)
		.until(ExpectedConditions.visibilityOfElementLocated(interestRateValueSearchFieldAdd));
	clickAddWebEelement.sendKeys(data);

	//Thread.sleep(5000);
	return true;
}
catch(Exception ex){
	return false;	
}
}

public boolean clickOnsearchedElement()
{
    try{
	Thread.sleep(2000);
	WebElement SearchWebEelement=new WebDriverWait(driver,200)
.until(ExpectedConditions.visibilityOfElementLocated(datasearchCheckbox_xpath));

	SearchWebEelement.click();
	Thread.sleep(3000);
	
	
	return true;
    }
catch(Exception ex){
    return false;
    }

}

public  String invalidSerachedDataSubScreen(String dataOnPageSearch)
{
try{
WebElement chargeCodesSearchWebEelement=new WebDriverWait(driver,30)
.until(ExpectedConditions.visibilityOfElementLocated(searchFail_xpath));
chargeCodesSearchWebEelement.getText();
}
catch(Exception ex){

}
return dataOnPageSearch;
}



public  String validSerachedDataSubScreen(String validdata)
{
try{
WebElement chargeCodesSearchWebEelement=new WebDriverWait(driver,30)
.until(ExpectedConditions.visibilityOfElementLocated(validsearch_xpath));
chargeCodesSearchWebEelement.getText();
}
catch(Exception ex){

}
return validdata;
}

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
public String verifyInterestRateHeaderOnEdit(String InterestRateHeader)
{
try{
	WebElement interestRateCodesWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(interestRateHeaderEdit));
      String actualData=interestRateCodesWebEelement.getText();
	   if(actualData.equalsIgnoreCase(InterestRateHeader));
	
}
catch(Exception ex){
	
}
return InterestRateHeader;

}

public boolean interestRateValueTextboxOnEditSubScreeen(String data)
{
try{
	WebElement clickAddWebEelement=new WebDriverWait(driver,1000)
		.until(ExpectedConditions.visibilityOfElementLocated(interestRateValueSearchFieldEdit));
	clickAddWebEelement.clear();
	Thread.sleep(3000);
	clickAddWebEelement.sendKeys(data);

	Thread.sleep(10000);
	return true;
}
catch(Exception ex){
		
}
return false;
}

public boolean SaveButtonOnEditSubScreeen()
{
try{
	WebElement clickAddWebEelement=new WebDriverWait(driver,1000)
		.until(ExpectedConditions.visibilityOfElementLocated(saveButtonAdd_xpath));
	clickAddWebEelement.click();

	Thread.sleep(10000);
	return true;
}
catch(Exception ex){
	return false;	
}
}

public boolean cancelButtonOnEditSubScreeen()
{
try{
	WebElement clickAddWebEelement=new WebDriverWait(driver,1000)
		.until(ExpectedConditions.visibilityOfElementLocated(cancelButtonAdd_xpath));
	clickAddWebEelement.isDisplayed();

	//Thread.sleep(5000);
	return true;
}
catch(Exception ex){
	return false;	
}
}

public boolean ClickCancelButtonOnEditSubScreeen()
{
try{
	WebElement clickAddWebEelement=new WebDriverWait(driver,1000)
		.until(ExpectedConditions.visibilityOfElementLocated(cancelButtonAdd_xpath));
	clickAddWebEelement.click();

	//Thread.sleep(5000);
	return true;
}
catch(Exception ex){
	return false;	
}
}


public boolean clickOnCheckboxInSubScreeen()
{

	try{
		Thread.sleep(5000);
		WebElement clickWebE=new WebDriverWait(driver,1000)
		.until(ExpectedConditions.visibilityOfElementLocated(firstCheckBoxSubScreen_xpath));
		clickWebE.click();
	//Thread.sleep(5000);
	return true;
}
catch(Exception ex){
	return false;	
}
}

public boolean ClickEditIconUIValidationSubScreen()
{
	try{
		Thread.sleep(1000);
		WebElement addButtonWebElement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(editIconSubScreen_xpath));
		addButtonWebElement.click();
		Thread.sleep(1000);
		return true;
	}
	catch(Exception ex){
		return false;
	}

}


/////////////////////////////////////////////////////////////////////////////////////////////////////////////////

public boolean clickOnExportIcon()
{
try{
	WebElement exportIconWebEelement=new WebDriverWait(driver,100)
		.until(ExpectedConditions.visibilityOfElementLocated(exportButton_xpath));
	exportIconWebEelement.click();
	Thread.sleep(500);
	return true;
}
catch(Exception ex){
	return false;	
}
}

public boolean verifyExportHeader(String exportHeader )
{
try{
	//Alert alert = driver.switchTo().alert();		
	
    WebElement exportHeaderWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(exportHeader_xpath));
    		
	String actualData=exportHeaderWebEelement.getText().trim();
	
	if(actualData.equalsIgnoreCase(exportHeader))
	{
		return true;
	}
	else
	{
		return false;
	}
}
catch(Exception ex){
}
return false;

}

public boolean UIexportButtonInPopUp()
	{
	try{
		WebElement exportButtonWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(exportButtonPopUp_xpath));
		exportButtonWebEelement.isDisplayed();
		return true;
	}
	catch(Exception ex){
		return false;
	}

	}

public boolean UICrossIconInPopUp()
{
try{
	WebElement exportButtonWebEelement=new WebDriverWait(driver,10)
	.until(ExpectedConditions.visibilityOfElementLocated(crossIconPopUp_xpath));
	exportButtonWebEelement.isDisplayed();
	return true;
}
catch(Exception ex){
	return false;
}

}


public boolean interestRateDateUIInExportPopUp()
	{
	try{
		WebElement exportButtonWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(interestRateDateOnExport_xpath));
		exportButtonWebEelement.isDisplayed();
		return true;
	}
	catch(Exception ex){
		return false;
	}
	}
	
	public boolean interestRateValueUIInExportPopUp()
	{
	try{
		WebElement exportButtonWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(interestRateValueOnExport_xpath));
		exportButtonWebEelement.isDisplayed();
		return true;
	}
	catch(Exception ex){
		return false;
	}
	}
	
	public boolean selectInterestRateDateCheckboxOnExportPopUp(boolean flag){
        try {
           WebDriverWait wait = new WebDriverWait(driver, 60);
           
           wait.until(ExpectedConditions.visibilityOfElementLocated(interestRateDateCheckboxOnExport_xpath));
           
           WebElement element = driver.findElement((interestRateDateCheckboxOnExport_xpath));
           if(flag){
            if(!element.isSelected() == true){
             element.click();
             Thread.sleep(10000);
            }
           }else if(!flag){
            if(element.isSelected() == true){
             element.click();
             Thread.sleep(10000);

            }
           }   
          } catch (Exception e) {
           System.out.println("Exception in clickOnCheckBox Method "+e.getCause());
          }
       return flag; 
      }
	
	public boolean selectInterestRateValueCheckboxOnExportPopUp(boolean flag){
        try {
           WebDriverWait wait = new WebDriverWait(driver, 60);
           
           wait.until(ExpectedConditions.visibilityOfElementLocated(interestRateValueCheckboxOnExport_xpath));
           
           WebElement element = driver.findElement((interestRateValueCheckboxOnExport_xpath));
           if(flag){
            if(!element.isSelected() == true){
             element.click();
             Thread.sleep(10000);
            }
           }else if(!flag){
            if(element.isSelected() == true){
             element.click();
             Thread.sleep(10000);

            }
           }   
          } catch (Exception e) {
           System.out.println("Exception in clickOnCheckBox Method "+e.getCause());
          }
       return flag; 
      }
	
	
	public boolean crossclickInExportPopUp()
   	{
   	try{
   		WebElement exportButtonWebEelement=new WebDriverWait(driver,10)
   		.until(ExpectedConditions.visibilityOfElementLocated(crossIconPopUp_xpath));
   		exportButtonWebEelement.click();
   		return true;
   	}
   	catch(Exception ex){
   		return false;
   	}

   	} 
	
	public boolean clickExportButtonInPopUp()
   	{
   	try{
   	Thread.sleep(3000);
   		WebElement exportButtonWebEelement=new WebDriverWait(driver,10)
   		.until(ExpectedConditions.visibilityOfElementLocated(exportButtonPopUp_xpath));
   		//Thread.sleep(3000);
   		exportButtonWebEelement.click();
   		return true;
   	}
   	catch(Exception ex){
   		return false;
   	}

   	}
	
	
	public boolean deleteIconClick()
	{
	try{
	    Thread.sleep(3000);
		WebElement deleteButtonWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(deleteIconSubScreen_xpath));
		deleteButtonWebEelement.click();
		Thread.sleep(3000);
		return true;
	}
	catch(Exception ex){
		return false;
	}
	}
	
	public boolean deleteButtonWarningPopUpHeader()
   	{
   	try{
   	    Thread.sleep(5000);
   		WebElement deleteButtonWebEelement=new WebDriverWait(driver,10)
   		.until(ExpectedConditions.visibilityOfElementLocated(deletebuttonpopup_xpath));
   		deleteButtonWebEelement.isDisplayed();
   		return true;
   	}
   	catch(Exception ex){
   		return false;
   	}

   	}
	
	 public boolean deleteButtonYesUi()
    	{
    	try{
    		WebElement deleteButtonWebEelement=new WebDriverWait(driver,10)
    		.until(ExpectedConditions.visibilityOfElementLocated(deleteYes_xpath));
    		deleteButtonWebEelement.isDisplayed();
    		return true;
    	}
    	catch(Exception ex){
    		return false;
    	}

    	} 
	 
	 public boolean deleteButtonNoUi()
    	{
    	try{
    		WebElement deleteButtonWebEelement=new WebDriverWait(driver,10)
    		.until(ExpectedConditions.visibilityOfElementLocated(deleteNo_xpath));
    		deleteButtonWebEelement.isDisplayed();
    		return true;
    	}
    	catch(Exception ex){
    		return false;
    	}

    	}   
	 
	 public boolean deleteButtonNoClick()
    	{
    	try{
    		WebElement deleteButtonWebEelement=new WebDriverWait(driver,10)
    		.until(ExpectedConditions.visibilityOfElementLocated(deleteNo_xpath));
    		deleteButtonWebEelement.click();
    		return true;
    	}
    	catch(Exception ex){
    		return false;
    	}

    	}   
     
	 
	 public boolean deleteButtonYesClick()
 	{
 	try{
 		WebElement deleteButtonWebEelement=new WebDriverWait(driver,10)
 		.until(ExpectedConditions.visibilityOfElementLocated(deleteYes_xpath));
 		deleteButtonWebEelement.click();
 		return true;
 	}
 	catch(Exception ex){
 		return false;
 	}

 	} 

	 public boolean multipleCheckBoxClick()
    	{
    	try{
    		Thread.sleep(3000);
    		WebElement deleteButtonWebEelement=new WebDriverWait(driver,10)
    		.until(ExpectedConditions.visibilityOfElementLocated(selectAllCheckBoxSubScreen_xpath));
    		deleteButtonWebEelement.click();
    		return true;
    	}
    	catch(Exception ex){
    		return false;
    	}
	}
}
	 
	 
	 

	



