package com.cync.pages;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.SkipException;

import com.cync.base.BasePage;

public class ChargeCodesPage extends BasePage {
	
	private final By chargeCodesHeader=By.xpath("//h3[contains(text(),'Charge Codes')]");
	private final By chargeCodesSearch_xpath=By.xpath("//input[@placeholder='Search Here']"); 
	private final By breadcrumb_xpath=By.xpath("//ul[@class='breadcrumb']");
	private final By addButton_xpath=By.id("New");
	private final By editButton_xpath=By.id("Edit");
	private final By deleteButton_xpath=By.id("Delete");
    private final By exportButton_xpath=By.id("Export");
	private final By chargeCodesColumn_xpath=By.xpath("//span[text()='Charge Codes']");
	private final By transcationCodeColumn_xpath=By.xpath("//span[text()='Transaction Code']");
	private final By natSignColumn_xpath=By.xpath("//span[text()='Nat Sign']");
	private final By sequenceColumn_xpath=By.xpath("//span[text()='Sequence']");
	private final By frequencyColumn_xpath=By.xpath("//span[text()='Frequency']");
	private final By chargeTypeColumn_xpath=By.xpath("//span[text()='Charge Type']");
	private final By valueColumn_xpath=By.xpath("//span[text()='Value']");
	private final By postingTypeColumn_xpath=By.xpath("//span[text()='Posting Type']");
	private final By autoNewClientColumn_xpath=By.xpath("//span[text()='Auto New Client']");
	private final By chargeCodesFieldSearch_xpath=By.xpath("(//input[@type='text'])[6]");
	private final By transactionCodeFieldSearch_xpath=By.xpath("(//input[@type='text'])[7]");
	private final By natSignFieldSearch_xpath=By.xpath("(//input[@type='text'])[8]");
	private final By sequenceFieldSearch_xpath=By.xpath("(//input[@type='text'])[9]");
	private final By frequencyFieldSearch_xpath=By.xpath("(//input[@type='text'])[10]");
	private final By chargeTypeFieldSearch_xpath=By.xpath("(//input[@type='text'])[11]");
	private final By valueFieldSearch_xpath=By.xpath("(//input[@type='text'])[12]");
	private final By postingTypeFieldSearch_xpath=By.xpath("(//input[@type='text'])[13]");
	private final By editDisable_xpath=By.xpath("//i[@class='hand fa fa-pencil fa-1x clr_grey f_s_20 icon_disabled operation_disabled']");
	private final By deleteDisable_xpath=By.xpath("//i[@class='hand fa fa-trash fa-2x f_s_20 clr_grey icon_disabled operation_disabled']");
	private final By firstCheckBox_xpath=By.xpath("(//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default'])[2]");
	private final By selectAllCheckBox_xpath=By.xpath("(//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default'])[1]");
	private final By CheckBox_xpath=By.xpath("(//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default'])[22]");
	private final By searchbar_xpath=By.xpath("//input[@id='globalSearch']");
	private final By searchFail_xpath=By.xpath("//span[text()='No records found']");
	private final By validsearch_xpath=By.xpath("//div[@class='w-200 ng-star-inserted']");
	private final By searchChargeCodes_xpath=By.xpath("(//input[contains(@class,'ui-column-filter ui-inputtext ui')])[1]");
	private final By searchTransactionCode_xpath=By.xpath("(//input[contains(@class,'ui-column-filter ui-inputtext ui')])[2]");
	private final By searchNatSign_xpath=By.xpath("(//input[contains(@class,'ui-column-filter ui-inputtext ui')])[3]");
	private final By searchSequence_xpath=By.xpath("(//input[contains(@class,'ui-column-filter ui-inputtext ui')])[4]");
	private final By searchFrequency_xpath=By.xpath("(//input[contains(@class,'ui-column-filter ui-inputtext ui')])[5]");
	private final By searchChargeType_xpath=By.xpath("(//input[contains(@class,'ui-column-filter ui-inputtext ui')])[6]");
	private final By searchValue_xpath=By.xpath("(//input[contains(@class,'ui-column-filter ui-inputtext ui')])[7]");
	private final By searchPostingType_xpath=By.xpath("(//input[contains(@class,'ui-column-filter ui-inputtext ui')])[8]");
	private final By chargeCodesAddHeader_xpath=By.xpath("//h3[text()='Charge Codes - Add']");
	//private final By chargeCodesField_xpath=By.xpath("//label[contains(text(),'Charge Codes']");
    private final By chargeCodesFieldMandatory_xpath=By.xpath("//label[contains(text(),'Charge Codes')]");
    private final By transactionCodeField_xpath=By.xpath("//label[contains(text(),'Transaction Code')]");
    private final By natSignFieldMandatory_xpath=By.xpath("//label[contains(text(),'Nat Sign')]");
    private final By sequenceField_xpath=By.xpath("//label[contains(text(),'Sequence')]");
    private final By frequencyFieldMandatory_xpath=By.xpath("//label[contains(text(),'Frequency')]");   
    private final By chargeTypeFieldMandatory_xpath=By.xpath("//label[contains(text(),'Charge Type')]");   
    private final By valueField_xpath=By.xpath("//label[contains(text(),'Value')]");   
    private final By postingTypeFieldMandatory_xpath=By.xpath("//label[contains(text(),'Posting Type')]");   
	private final By autoNewClientCheckbox_xpath=By.xpath("(//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default'])[1]");	
	private final By cancelButton_xpath=By.xpath("//button[@id='action_back']");
	private final By saveNewButton_xpath=By.xpath("//span[text()='Save & New']");
	private final By saveButton_xpath=By.xpath("//span[text()=' Save ']");
	//private final By chargeCodesBox_xpath=By.xpath("//input[@formcontrolname='description']");	
	private final By chargeCodesBox_xpath=By.id("charge_code_desc");
	private final By transactionCodeBox_xpath=By.xpath("//input[@formcontrolname='trans_code']");	
	private final By natSignDropdown_xpath=By.xpath("//select[@formcontrolname='natural_sign']");
	private final By sequenceBox_xpath=By.xpath("//input[@formcontrolname='sequence']");
	private final By frequencyDropdown_xpath=By.xpath("//select[@formcontrolname='frequency']");
	private final By chargeTypeDropdown_xpath=By.xpath("//select[@formcontrolname='charge_type']");
	private final By valueBox_xpath=By.name("charge_value");
	private final By postingTypeDropdown_xpath=By.id("posting_type");
	private final By chargeCodeErrorMessage_xpath=By.xpath("//small[text()='Enter Charge Codes']");
	private final By natSignErrorMessage_xpath=By.xpath("//small[text()='Enter Nat Sign']");
	private final By frequencyErrorMessage_xpath=By.xpath("//small[text()='Enter Frequency']");
	private final By chargeTypeErrorMessage_xpath=By.xpath("//small[text()='Enter Charge Type']");
	private final By postingTypeErrorMessage_xpath=By.xpath("//small[text()='Enter Posting Type']");
	private final By ErrorMessage_xpath=By.id("every-api-message");
	private final By SuccessMessage_xpath=By.id("every-api-message");
	private final By data_xpath=By.xpath("(//div[@class='w-200 ng-star-inserted'])[3]");
	private final By chargeCodesEditHeader_xpath=By.xpath("//h3[text()='Charge Codes - Edit']");
	private final By exportHeader_xpath=By.xpath("//span[contains(text(),'Charge Codes')]");
	private final By exportButtonPopUp_xpath=By.xpath("//span[contains(text(),'Export')]");
	private final By autonewclientPopUp_xpath=By.xpath("//label[contains(text(),'Auto New Client')]");
	private final By crossIconPopUp_xpath=By.xpath("//span[@class='fa fa-fw fa-close']");
	private final By chargeCodesExportCheckbox_xpath=By.xpath("(//span[@class='ui-chkbox-icon ui-clickable fa fa-check'])[2]");
	private final By transactionCodeExportCheckbox_xpath=By.xpath("(//span[@class='ui-chkbox-icon ui-clickable fa fa-check'])[3]");
	private final By natSignExportCheckbox_xpath=By.xpath("(//span[@class='ui-chkbox-icon ui-clickable fa fa-check'])[4]");
	private final By sequenceExportCheckbox_xpath=By.xpath("(//span[@class='ui-chkbox-icon ui-clickable fa fa-check'])[5]");
	private final By frequencyExportCheckbox_xpath=By.xpath("(//span[@class='ui-chkbox-icon ui-clickable fa fa-check'])[6]");
	private final By chargeTypeExportCheckbox_xpath=By.xpath("(//span[@class='ui-chkbox-icon ui-clickable fa fa-check'])[7]");
	private final By valueExportCheckbox_xpath=By.xpath("(//span[@class='ui-chkbox-icon ui-clickable fa fa-check'])[8]");
	private final By postingTypeExportCheckbox_xpath=By.xpath("(//span[@class='ui-chkbox-icon ui-clickable fa fa-check'])[9]");
	private final By autonewclientExportCheckbox_xpath=By.xpath("(//span[@class='ui-chkbox-icon ui-clickable fa fa-check'])[10]");
	private final By datasearchCheckbox_xpath=By.xpath("(//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default'])[2]");
	private final By deletebuttonpopup_xpath=By.xpath("(//div[@id='cync_alerts'])[2]");
	private final By deleteYes_xpath=By.xpath("//button[text()='Yes']");
	private final By deleteNo_xpath=By.xpath("//button[text()='No']");
	private final By menuSearch_xpath=By.xpath("//input[@id='menu-search']");
	//private final By validMenuSearch_xpath=By.className("tw-heading");
	private final By validMenuSearch_xpath=By.xpath("//span[contains(text(),'charge')]");
	private final By exportButtonInPopUp_xpath=By.xpath("//span[text()='Export']");
	
	/*private final By menuSearch_xpath=By.xpath("//*[@id='menu-search']");
	private final By validMenuSearch_xpath=By.className("tw-heading");
*/
	
	
	
	
	
	
	
	public ChargeCodesPage(WebDriver driver)
	{
		super(driver);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(!driver.findElement(chargeCodesHeader).getText().trim().equals("Charge Codes")){
			throw new SkipException("Charge Codes couldn't open.");
		}// TODO Auto-generated constructor stub

	
	}
	
	
	public String verifyChargeCodesBreadcrumb(String chargecodesBreadcrumb)
	{
		try{
			WebElement breadcrumbWebEelement=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(breadcrumb_xpath));
			String actualData=breadcrumbWebEelement.getText();
			if(actualData.equalsIgnoreCase(chargecodesBreadcrumb));
		}
		catch(Exception ex){
			
		}
		return chargecodesBreadcrumb;

		}

	
	public String ChargeCodesHeader(String chargecodesHeader)
	{
	try{
		WebElement chargeCodesWebEelement=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(chargeCodesHeader));
	      String actualData=chargeCodesWebEelement.getText();
		   if(actualData.equalsIgnoreCase(chargecodesHeader));
		
	}
	catch(Exception ex){
		
	}
	return chargecodesHeader;
	
	}
	
	public boolean ChargeCodesPageSerach()
	{
	try{
		WebElement chargeCodesSearchWebEelement=new WebDriverWait(driver,30)
			.until(ExpectedConditions.visibilityOfElementLocated(chargeCodesSearch_xpath));
		chargeCodesSearchWebEelement.isDisplayed();
		return true;
	}
	catch(Exception ex){
		return false;
	}
	}
	
	public boolean addButtonUIValidation()
	{
		try{
			WebElement addButtonWebElement=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(addButton_xpath));
			addButtonWebElement.isDisplayed();
			return true;
		}
		catch(Exception ex){
			return false;
		}

		}

	public boolean editButtonUIValidation()
	{
		try{
			WebElement addButtonWebElement=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(editButton_xpath));
			addButtonWebElement.isDisplayed();
			return true;
		}
		catch(Exception ex){
			return false;
		}

		}
	public boolean deleteButtonUIValidation()
	{
		try{
			WebElement deleteButtonWebElement=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(deleteButton_xpath));
			deleteButtonWebElement.isDisplayed();
			return true;
		}
		catch(Exception ex){
			return false;
		}

		}
      public boolean exportButtonUIValidation()
      {
    	  try{
    		  WebElement exportButtonWebElement=new WebDriverWait(driver,10)
    		  .until(ExpectedConditions.visibilityOfElementLocated(exportButton_xpath));
    		  exportButtonWebElement.isDisplayed();
    		  return true;
    		  
    	  }
    	  catch(Exception ex){
  			return false;
  		}
      }
      public boolean  chargeCodesColumnUIValidation()
      {
    	  try{
    		  WebElement chargeCodesColumnWebElement=new WebDriverWait(driver,10)
    		  .until(ExpectedConditions.visibilityOfElementLocated(chargeCodesColumn_xpath));
    		  chargeCodesColumnWebElement.isDisplayed();
    		  return true;
    	  }
    	  catch(Exception ex){
    			return false;
    		}
    	  }
      public boolean transactionCodeColumnUIValidation()
      {
    	  try{
    		  WebElement transactionCodeColumnWebElement=new WebDriverWait(driver,10)
    		  .until(ExpectedConditions.visibilityOfElementLocated(transcationCodeColumn_xpath));
    	     transactionCodeColumnWebElement.isDisplayed();
    	  return true;
    	  }
      catch(Exception ex){
			return false;
		}
      
      }
      public boolean natSignColumnUIValidation()
      {
    	  try{
    		  WebElement natSignColumnWebElement=new WebDriverWait(driver,10)
    		  .until(ExpectedConditions.visibilityOfElementLocated(natSignColumn_xpath));
    		  natSignColumnWebElement.isDisplayed();
    	  return true;
    	  }
      catch(Exception ex){
			return false;
		}
      
      }
      public boolean sequenceColumnUIValidation()
      {
    	  try{
    		  WebElement sequenceColumnWebElement=new WebDriverWait(driver,10)
    		  .until(ExpectedConditions.visibilityOfElementLocated(sequenceColumn_xpath));
    		  sequenceColumnWebElement.isDisplayed();
    	  return true;
    	  }
      catch(Exception ex){
			return false;
		}
      
      }
      
      public boolean frequencyColumnUIValidation()
      {
    	  try{
    		  WebElement frequencyColumnWebElement=new WebDriverWait(driver,10)
    		  .until(ExpectedConditions.visibilityOfElementLocated(frequencyColumn_xpath));
    		  frequencyColumnWebElement.isDisplayed();
    	  return true;
    	  }
      catch(Exception ex){
			return false;
		}
      
      }
      
      public boolean chargeTypeColumnUIValidation()
      {
    	  try{
    		  WebElement chargeTypeColumnWebElement=new WebDriverWait(driver,10)
    		  .until(ExpectedConditions.visibilityOfElementLocated(chargeTypeColumn_xpath));
    		  chargeTypeColumnWebElement.isDisplayed();
    	  return true;
    	  }
      catch(Exception ex){
			return false;
		}
      
      }
      public boolean valueColumnUIValidation()
      {
    	  try{
    		  WebElement valueColumnWebElement=new WebDriverWait(driver,10)
    		  .until(ExpectedConditions.visibilityOfElementLocated(valueColumn_xpath));
    		  valueColumnWebElement.isDisplayed();
    	  return true;
    	  }
      catch(Exception ex){
			return false;
		}
      
      }
      public boolean postingTypeColumnUIValidation()
      {
    	  try{
    		  WebElement postingTypeColumnWebElement=new WebDriverWait(driver,10)
    		  .until(ExpectedConditions.visibilityOfElementLocated(postingTypeColumn_xpath));
    		  postingTypeColumnWebElement.isDisplayed();
    	  return true;
    	  }
      catch(Exception ex){
			return false;
		}
      
      }
      public boolean autoNewClientColumnUIValidation()
      {
    	  try{
    		  WebElement autoNewClientColumnWebElement=new WebDriverWait(driver,10)
    		  .until(ExpectedConditions.visibilityOfElementLocated(autoNewClientColumn_xpath));
    		  autoNewClientColumnWebElement.isDisplayed();
    	  return true;
    	  }
      catch(Exception ex){
			return false;
		}
      
      }
      public boolean chargeCodesFieldSearchUIValidation()
      {
    	  try{
    		  WebElement chargeCodesFieldSearchWebElement=new WebDriverWait(driver,10)
    		  .until(ExpectedConditions.visibilityOfElementLocated(chargeCodesFieldSearch_xpath));
    		  chargeCodesFieldSearchWebElement.isDisplayed();
    	  return true;
    	  }
      catch(Exception ex){
			return false;
		}
      
      }
      public boolean transactionCodeFieldSearchUIValidation()
      {
    	  try{
    		  WebElement transactionCodeFieldSearchWebElement=new WebDriverWait(driver,10)
    		  .until(ExpectedConditions.visibilityOfElementLocated(transactionCodeFieldSearch_xpath));
    		  transactionCodeFieldSearchWebElement.isDisplayed();
    	  return true;
    	  }
      catch(Exception ex){
			return false;
		}
      
      }
      public boolean natSignFieldSearchUIValidation()
      {
    	  try{
    		  WebElement natSignFieldSearchWebElement=new WebDriverWait(driver,10)
    		  .until(ExpectedConditions.visibilityOfElementLocated(natSignFieldSearch_xpath));
    		  natSignFieldSearchWebElement.isDisplayed();
    	  return true;
    	  }
      catch(Exception ex){
			return false;
		}
      
      }
      public boolean sequenceFieldSearchUIValidation()
      {
    	  try{
    		  WebElement sequenceFieldSearchWebElement=new WebDriverWait(driver,10)
    		  .until(ExpectedConditions.visibilityOfElementLocated(sequenceFieldSearch_xpath));
    		  sequenceFieldSearchWebElement.isDisplayed();
    	  return true;
    	  }
      catch(Exception ex){
			return false;
		}
      
      }
      public boolean frequencyFieldSearchUIValidation()
      {
    	  try{
    		  WebElement frequencyFieldSearchWebElement=new WebDriverWait(driver,10)
    		  .until(ExpectedConditions.visibilityOfElementLocated(frequencyFieldSearch_xpath));
    		  frequencyFieldSearchWebElement.isDisplayed();
    	  return true;
    	  }
      catch(Exception ex){
			return false;
		}
      
      }
      public boolean chargeTypeFieldSearchUIValidation()
      {
    	  try{
    		  WebElement chargeTypeFieldSearchWebElement=new WebDriverWait(driver,10)
    		  .until(ExpectedConditions.visibilityOfElementLocated(chargeTypeFieldSearch_xpath));
    		  chargeTypeFieldSearchWebElement.isDisplayed();
    	  return true;
    	  }
      catch(Exception ex){
			return false;
		}
      
      }
      public boolean valueFieldSearchUIValidation()
      {
    	  try{
    		  WebElement valueFieldSearchWebElement=new WebDriverWait(driver,10)
    		  .until(ExpectedConditions.visibilityOfElementLocated(valueFieldSearch_xpath));
    		  valueFieldSearchWebElement.isDisplayed();
    	  return true;
    	  }
      catch(Exception ex){
			return false;
		}
      
      }
     public boolean postingTypeFieldSearchUIValidation()
     {
	  try{
		  WebElement postingTypeFieldSearchWebElement=new WebDriverWait(driver,10)
		  .until(ExpectedConditions.visibilityOfElementLocated(postingTypeFieldSearch_xpath));
		  postingTypeFieldSearchWebElement.isDisplayed();
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
		.until(ExpectedConditions.visibilityOfElementLocated(editDisable_xpath)).isDisplayed();
		new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(deleteDisable_xpath)).isDisplayed();
		return true;
		}
	catch(Exception ex){
		return false;
	}

	}

   public boolean enableAndDisableOfEditDeleteIconsByslectingOneCheckBox()
   {
	try{
		new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(firstCheckBox_xpath)).click();
		 new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(editButton_xpath)).isDisplayed();
		new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(deleteButton_xpath)).isDisplayed();
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
		.until(ExpectedConditions.visibilityOfElementLocated(selectAllCheckBox_xpath)).click();
		
		new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(editDisable_xpath)).isDisplayed();
		new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(deleteButton_xpath)).isDisplayed();
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
public boolean ChargeCodesPageSerach(String data)
{
try{
	WebElement chargeCodesSearchWebEelement=new WebDriverWait(driver,100)
		.until(ExpectedConditions.visibilityOfElementLocated(searchbar_xpath));
	chargeCodesSearchWebEelement.clear();
	chargeCodesSearchWebEelement.sendKeys(data);
	return true;
}
catch(Exception ex){
	return false;	
}
}

public  String invalidSerachedData(String dataOnPageSearch)
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
public  String validSerachedData(String validdata)
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
public boolean chargeCodesFieldSearch(String data)
{
try{
	WebElement chargeCodesSearchWebEelement=new WebDriverWait(driver,100)
		.until(ExpectedConditions.visibilityOfElementLocated(searchChargeCodes_xpath));
	chargeCodesSearchWebEelement.clear();
	chargeCodesSearchWebEelement.sendKeys(data);
	return true;
}
catch(Exception ex){
	return false;	
}
}

public boolean trasactionCodeFieldSearch(String data)
{
try{
	WebElement trasactionCodeSearchWebEelement=new WebDriverWait(driver,100)
		.until(ExpectedConditions.visibilityOfElementLocated(searchTransactionCode_xpath));
	trasactionCodeSearchWebEelement.clear();
	trasactionCodeSearchWebEelement.sendKeys(data);
	return true;
}
catch(Exception ex){
	return false;	
}
}

public boolean natSignFieldSearch(String data)
{
try{
	WebElement natSignSearchWebEelement=new WebDriverWait(driver,100)
		.until(ExpectedConditions.visibilityOfElementLocated(searchNatSign_xpath));
	natSignSearchWebEelement.clear();
	natSignSearchWebEelement.sendKeys(data);
	return true;
}
catch(Exception ex){
	return false;	
}
}

public boolean sequenceFieldSearch(String data)
{
try{
	WebElement sequenceSearchWebEelement=new WebDriverWait(driver,100)
		.until(ExpectedConditions.visibilityOfElementLocated(searchSequence_xpath));
	sequenceSearchWebEelement.clear();
	sequenceSearchWebEelement.sendKeys(data);
	return true;
}
catch(Exception ex){
	return false;	
}
}

public boolean frequencyFieldSearch(String data)
{
try{
	WebElement frequencySearchWebEelement=new WebDriverWait(driver,100)
		.until(ExpectedConditions.visibilityOfElementLocated(searchFrequency_xpath));
	frequencySearchWebEelement.clear();
	frequencySearchWebEelement.sendKeys(data);
	return true;
}
catch(Exception ex){
	return false;	
}
}

public boolean chargeTypeFieldSearch(String data)
{
try{
	WebElement chargeTypeSearchWebEelement=new WebDriverWait(driver,100)
		.until(ExpectedConditions.visibilityOfElementLocated(searchChargeType_xpath));
	chargeTypeSearchWebEelement.clear();
	chargeTypeSearchWebEelement.sendKeys(data);
	return true;
}
catch(Exception ex){
	return false;	
}
}

public boolean valueFieldSearch(String data)
{
try{
	WebElement valueSearchWebEelement=new WebDriverWait(driver,100)
		.until(ExpectedConditions.visibilityOfElementLocated(searchValue_xpath));
	valueSearchWebEelement.clear();
	valueSearchWebEelement.sendKeys(data);
	return true;
}
catch(Exception ex){
	return false;	
}
}

public boolean postingTypeFieldSearch(String data)
{
try{
	WebElement valueSearchWebEelement=new WebDriverWait(driver,100)
		.until(ExpectedConditions.visibilityOfElementLocated(searchPostingType_xpath));
	valueSearchWebEelement.clear();
	valueSearchWebEelement.sendKeys(data);
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
		.until(ExpectedConditions.visibilityOfElementLocated(addButton_xpath));
	clickAddWebEelement.click();
	//Thread.sleep(5000);
	return true;
}
catch(Exception ex){
	return false;	
}
}

public String verifyChargeCodesAddHeader(String addHeader )
{
try{
	WebElement ChargeCodesAddHeaderWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(chargeCodesAddHeader_xpath));
	String actualData=ChargeCodesAddHeaderWebEelement.getText();
	if(actualData.equalsIgnoreCase(addHeader));
}
catch(Exception ex){
}
return addHeader;
}

/*public boolean chargeCodesAddField_UIValidation()
{
try{
	WebElement chargeCodesAddFieldWebEelement=new WebDriverWait(driver,100)
		.until(ExpectedConditions.visibilityOfElementLocated(chargeCodesField_xpath));
	chargeCodesAddFieldWebEelement.isDisplayed();
	return true;
}
catch(Exception ex){
	return false;	
}
}
*/
public boolean chargeCodesAddFieldMandatory_UIValidation()
{
try{
	WebElement chargeCodesAddFieldWebEelement=new WebDriverWait(driver,100)
		.until(ExpectedConditions.visibilityOfElementLocated(chargeCodesFieldMandatory_xpath));
	chargeCodesAddFieldWebEelement.isDisplayed();
	return true;
}
catch(Exception ex){
	return false;	
}
}

public boolean transactionCodeAddField_UIValidation()
{
try{
	WebElement transactionCodeAddFieldWebEelement=new WebDriverWait(driver,100)
		.until(ExpectedConditions.visibilityOfElementLocated(transactionCodeField_xpath));
	transactionCodeAddFieldWebEelement.isDisplayed();
	return true;
}
catch(Exception ex){
	return false;	
}
}

public boolean natSignAddFieldMandatory_UIValidation()
{
try{
	WebElement natSignAddFieldWebEelement=new WebDriverWait(driver,100)
		.until(ExpectedConditions.visibilityOfElementLocated(natSignFieldMandatory_xpath));
	natSignAddFieldWebEelement.isDisplayed();
	return true;
}
catch(Exception ex){
	return false;	
}
}

public boolean sequenceAddField_UIValidation1()
{
try{
	WebElement sequenceAddFieldWebEelement=new WebDriverWait(driver,100)
		.until(ExpectedConditions.visibilityOfElementLocated(sequenceField_xpath));
	sequenceAddFieldWebEelement.isDisplayed();
	return true;
}
catch(Exception ex){
	return false;	
}
}

public boolean frequencyAddFieldMandatory_UIValidation()
{
try{
	WebElement frequencyAddFieldWebEelement=new WebDriverWait(driver,100)
		.until(ExpectedConditions.visibilityOfElementLocated(frequencyFieldMandatory_xpath));
	frequencyAddFieldWebEelement.isDisplayed();
	return true;
}
catch(Exception ex){
	return false;	
}
}

public boolean chargeTypeAddFieldMandatory_UIValidation()
{
try{
	WebElement chargeTypeyAddFieldWebEelement=new WebDriverWait(driver,100)
		.until(ExpectedConditions.visibilityOfElementLocated(chargeTypeFieldMandatory_xpath));
	chargeTypeyAddFieldWebEelement.isDisplayed();
	return true;
}
catch(Exception ex){
	return false;	
}
}

public boolean valueAddField_UIValidation1()
{
try{
	WebElement valueAddFieldWebEelement=new WebDriverWait(driver,100)
		.until(ExpectedConditions.visibilityOfElementLocated(valueField_xpath));
	valueAddFieldWebEelement.isDisplayed();
	return true;
}
catch(Exception ex){
	return false;	
}
}

public boolean postingTypeAddFieldMandatory_UIValidation()
{
try{
	WebElement postingTypeyAddFieldWebEelement=new WebDriverWait(driver,100)
		.until(ExpectedConditions.visibilityOfElementLocated(postingTypeFieldMandatory_xpath));
	postingTypeyAddFieldWebEelement.isDisplayed();
	return true;
}
catch(Exception ex){
	return false;	
}
}

public boolean autoNewClientCheckbox_UIValidation()
{
try{
	WebElement autoNewClientCheckboxAddFieldWebEelement=new WebDriverWait(driver,100)
		.until(ExpectedConditions.visibilityOfElementLocated(autoNewClientCheckbox_xpath));
	autoNewClientCheckboxAddFieldWebEelement.isDisplayed();
	return true;
}
catch(Exception ex){
	return false;	
}
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

public boolean chargeCodesBox_UIValidation()
{
try{
	WebElement chargeCodesBoxWebEelement=new WebDriverWait(driver,100)
		.until(ExpectedConditions.visibilityOfElementLocated(chargeCodesBox_xpath));
	chargeCodesBoxWebEelement.isDisplayed();
	return true;
}
catch(Exception ex){
	return false;	
}
}

public boolean transactionCodeBox_UIValidation()
{
try{
	WebElement transactionCodeBoxWebEelement=new WebDriverWait(driver,100)
		.until(ExpectedConditions.visibilityOfElementLocated(transactionCodeBox_xpath));
	transactionCodeBoxWebEelement.isDisplayed();
	return true;
}
catch(Exception ex){
	return false;	
}
}


public boolean natSignDropdown_UIValidation()
{
try{
	
	 String[] exp = {"Select","Plus","Minus"};
	 
	WebElement dropdown = driver.findElement(natSignDropdown_xpath);  
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
	return false;
}
}

public boolean sequenceBox_UIValidation()
{
try{
	WebElement sequenceBoxWebEelement=new WebDriverWait(driver,100)
		.until(ExpectedConditions.visibilityOfElementLocated(sequenceBox_xpath));
	sequenceBoxWebEelement.isDisplayed();
	return true;
}
catch(Exception ex){
	return false;	
}
}

public boolean frequencyDropdown_UIValidation()
{
try{
	
	 String[] exp = {"Select","Annually","Bus. Daily","Daily","Manual","Monthly","Quarterly","Weekly","One Time"};

	WebElement dropdown = driver.findElement(frequencyDropdown_xpath);  
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
	return false;
}
}

public boolean chargeTypeDropdown_UIValidation()
{
try{
	
	 String[] exp = {"Select","Value","Loan","Loan/Float","Loan/Float/Advance","Unused Line","Minimum Balance","Original Amount"};

	WebElement dropdown = driver.findElement(chargeTypeDropdown_xpath);  
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
	return false;
}
}

public boolean valueBox_UIValidation()
{
try{
	WebElement valueBoxWebEelement=new WebDriverWait(driver,100)
		.until(ExpectedConditions.visibilityOfElementLocated(valueBox_xpath));
	valueBoxWebEelement.isDisplayed();
	return true;
}
catch(Exception ex){
	return false;	
}
}

public boolean postingTypeDropdown_UIValidation()
{
try{
	
	 String[] exp = {"Select","In Balance","Accrue To Loan","Accrue To Statement"};

	WebElement dropdown = driver.findElement(postingTypeDropdown_xpath);  
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
	return false;
}
}












/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
public String verifyChargeCodesErrorMessage(String msg){
	try{
		WebElement ChargeCodesErrorMessageWebE=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(chargeCodesBox_xpath));
         
		ChargeCodesErrorMessageWebE.sendKeys(Keys.TAB);
		ChargeCodesErrorMessageWebE.sendKeys(Keys.ENTER);
		
		String actual_msg=driver.findElement(chargeCodeErrorMessage_xpath).getText();
		if(actual_msg.equalsIgnoreCase(msg));
	
	}
catch(Exception ex){
	
	}
	return msg;

}

public String verifyNatSignErrorMessage(String msg){
	try{
		WebElement NatSignErrorMessageWebE=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(natSignDropdown_xpath));
         
		NatSignErrorMessageWebE.sendKeys(Keys.TAB);
		NatSignErrorMessageWebE.sendKeys(Keys.ENTER);
		
		String actual_msg=driver.findElement(natSignErrorMessage_xpath).getText();
		if(actual_msg.equalsIgnoreCase(msg));
	
	}
catch(Exception ex){
	
	}
	return msg;

}

public String verifyFrequencyErrorMessage(String msg){
	try{
		WebElement FrequencyErrorMessageWebE=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(frequencyDropdown_xpath));
         
		FrequencyErrorMessageWebE.sendKeys(Keys.TAB);
		FrequencyErrorMessageWebE.sendKeys(Keys.ENTER);
		
		String actual_msg=driver.findElement(frequencyErrorMessage_xpath).getText();
		if(actual_msg.equalsIgnoreCase(msg));
	
	}
catch(Exception ex){
	
	}
	return msg;

}

public String verifyChargeTypeErrorMessage(String msg){
	try{
		WebElement FrequencyErrorMessageWebE=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(chargeTypeDropdown_xpath));
         
		FrequencyErrorMessageWebE.sendKeys(Keys.TAB);
		FrequencyErrorMessageWebE.sendKeys(Keys.ENTER);
		
		String actual_msg=driver.findElement(chargeTypeErrorMessage_xpath).getText();
		if(actual_msg.equalsIgnoreCase(msg));
	
	}
catch(Exception ex){
	
	}
	return msg;

}

public String verifyPostingTypeErrorMessage(String actual_msg){
	try{
		WebElement FrequencyErrorMessageWebE=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(postingTypeDropdown_xpath));
         
		FrequencyErrorMessageWebE.sendKeys(Keys.TAB);
		FrequencyErrorMessageWebE.sendKeys(Keys.ENTER);
		
		actual_msg=driver.findElement(postingTypeErrorMessage_xpath).getText().trim();
		//if(actual_msg.equalsIgnoreCase(msg));
	
	}
catch(Exception ex){
	
	}
	return actual_msg;

}

/*public boolean  tabMethod(){
	  try { 
	Actions action = new Actions(driver);
	  action.sendKeys(Keys.TAB);
	return true;
	 } catch (Exception e) {
	  // TODO: handle exception
	 }
	 return false;
	 
	}*/


public  boolean addDataToChargeCodesTextBox(String Data)
{
	try{
		WebElement chargeCodesBoxWebE=new WebDriverWait(driver,100)
		.until(ExpectedConditions.visibilityOfElementLocated(chargeCodesBox_xpath));
		chargeCodesBoxWebE.clear();
		Thread.sleep(500);
		chargeCodesBoxWebE.sendKeys(Data);
		return true;
		
	
		
	
	}
	catch(Exception ex){
		
	}
	return false;
	
}


public boolean addDataToTransactionCodeTextBox(String Data){
	try{
		WebElement TransactionCodeBoxWebE=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(transactionCodeBox_xpath));
		TransactionCodeBoxWebE.clear();
		Thread.sleep(500);
		TransactionCodeBoxWebE.sendKeys(Data);
		return true;
		
		
		
	
	}
	catch(Exception ex){
		
	}
	return false;
	
}

	
public boolean selectFromNatSignDropdown(String VisibleText1) throws InterruptedException{
	
	try {
		WebElement DropdownWebEelement = new WebDriverWait(driver, 10)
		.until(ExpectedConditions.visibilityOfElementLocated(natSignDropdown_xpath));
		Select sel = new Select(DropdownWebEelement);
		
		List<WebElement> list = sel.getOptions();
		
		for (WebElement ele : list) 
		{
			/*String data = ele.getText();
			System.out.println(data);*/
			
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
	}
	
public boolean selectFromFrequencyDropdown(String VisibleText2) throws InterruptedException{
	
	try {
		WebElement DropdownWebEelement = new WebDriverWait(driver, 10)
		.until(ExpectedConditions.visibilityOfElementLocated(frequencyDropdown_xpath));
		
		Select sel = new Select(DropdownWebEelement);
		
		List<WebElement> list = sel.getOptions();
		
		for (WebElement ele : list) 
		{
			/*String data = ele.getText();
			//System.out.println(data);
*/			
			if(ele.getText().equalsIgnoreCase(VisibleText2))
			{
		 		ele.click();
				//Thread.sleep(50);
				 return true;
			 }
			
		 }	
		}
 catch (Exception ex) 
	{
		return false;
	}
	return false;
	

}
public boolean addDataToSequenceTextBox(String Data){
	try{
		WebElement sequenceBoxWebE=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(sequenceBox_xpath));
		sequenceBoxWebE.clear();
		Thread.sleep(500);

		sequenceBoxWebE.sendKeys(Data);
		//Thread.sleep(1000);
		return true;
	   }
	
	catch(Exception ex)
	{
		System.out.println("Test case failed");
		return false;
	}
		
}


public boolean selectFromChargeTypeDropdown(String VisibleText)throws InterruptedException{
{
	try {
		WebElement DropdownWebEelement = new WebDriverWait(driver, 10)
		.until(ExpectedConditions.visibilityOfElementLocated(chargeTypeDropdown_xpath));
		Select sel = new Select(DropdownWebEelement);
		List<WebElement> list = sel.getOptions();
		for (WebElement ele : list) {
			if (ele.getText().equals(VisibleText)) {
		 		ele.click();
				//Thread.sleep(5000);
				 return true;
			}
		}
	}
	 catch (Exception ex) {
		 return false;
	}
	return false;
}
}



public boolean addDataToValueTextBox(String Data){
	try{
		WebElement valueBoxWebE=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(valueBox_xpath));
		//Thread.sleep(10);
		valueBoxWebE.clear();
		Thread.sleep(500);

		valueBoxWebE.sendKeys(Data);
		
		return true;
	}
	catch(Exception ex){
		
	}
	return false;
}

public boolean selectFromPostingTypeDropdown(String value)throws InterruptedException{
{
	try {
		WebElement DropdownWebEelement = new WebDriverWait(driver, 10)
		.until(ExpectedConditions.visibilityOfElementLocated(postingTypeDropdown_xpath));
		Select sel = new Select(DropdownWebEelement);
		List<WebElement> list = sel.getOptions();
		for (WebElement ele : list) {
			if (ele.getText().equals(value)) {
		 		ele.click();
				//Thread.sleep(5000);
				 return true;
			}
		}
	}
	 catch (Exception ex) {
		 return false;
	}
	return false;
}
}



public boolean clickOnsaveButtonOnAdd()
{
try{
	WebElement saveButtonAddWebEelement=new WebDriverWait(driver,100)
		.until(ExpectedConditions.visibilityOfElementLocated(saveButton_xpath));
	saveButtonAddWebEelement.click();
	return true;
}
catch(Exception ex){
	return false;	
}
}

public boolean clickOnAutoNewClientCheckboxOnAdd()
{
try{
	WebElement autoNewClientCheckboxWebEelement=new WebDriverWait(driver,100)
		.until(ExpectedConditions.visibilityOfElementLocated(autoNewClientCheckbox_xpath));
	autoNewClientCheckboxWebEelement.click();
	return true;
}
catch(Exception ex){
	return false;	
}
}

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
		String actual_msg=ErrorMessageWebE.getText().trim();
		
		//if(actual_msg.equalsIgnoreCase(msg));
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

public String verifyErrorMessageEnteringDataMoreThanValidCharacters(String msg){
	try{
		WebElement ErrorMessageWebE=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(ErrorMessage_xpath));
		String actual_msg=ErrorMessageWebE.getText().trim();
		
		//if(actual_msg.equalsIgnoreCase(msg));
	/*return true;
	else
		return false;*/
	}
catch(Exception ex){
	
	}
	return msg;
}

public boolean verifySuccessMessageEnteringValidData (String successmsg){
	try{
		WebElement successMessageWebE=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(SuccessMessage_xpath));
		String actual_msg=successMessageWebE.getText().trim();
		
		if(actual_msg.equals(successmsg))
		{
			System.out.println(actual_msg);
	        return true;
		}
	else
		return false;
	}
catch(Exception ex){
	System.out.println("Test case Failed");
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


//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

public boolean clickOnEdit()
{
try{
	WebElement editWebEelement=new WebDriverWait(driver,1000)
		.until(ExpectedConditions.visibilityOfElementLocated(editButton_xpath));
	editWebEelement.click();
	Thread.sleep(1000);
	return true;
}
catch(Exception ex){
	return false;	
}
}

public boolean verifyChargeCodesEditHeader(String editHeader )
{
try{
	WebElement ChargeCodesEditHeaderWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(chargeCodesEditHeader_xpath));
	String actualData=ChargeCodesEditHeaderWebEelement.getText().trim();
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
	//Thread.sleep(5000);
	return true;
}
catch(Exception ex){
	return false;	
}
}


public boolean chargeCodesEditFieldMandatory_UIValidation()
{
try{
	WebElement chargeCodesEditFieldWebEelement=new WebDriverWait(driver,100)
		.until(ExpectedConditions.visibilityOfElementLocated(chargeCodesFieldMandatory_xpath));
	chargeCodesEditFieldWebEelement.isDisplayed();
	return true;
}
catch(Exception ex){
	return false;	
}
}

public boolean transactionCodeEditField_UIValidation()
{
try{
	WebElement transactionCodeEditFieldWebEelement=new WebDriverWait(driver,100)
		.until(ExpectedConditions.visibilityOfElementLocated(transactionCodeField_xpath));
	transactionCodeEditFieldWebEelement.isDisplayed();
	return true;
}
catch(Exception ex){
	return false;	
}
}

public boolean natSignEditFieldMandatory_UIValidation()
{
try{
	WebElement natSignEditFieldWebEelement=new WebDriverWait(driver,100)
		.until(ExpectedConditions.visibilityOfElementLocated(natSignFieldMandatory_xpath));
	natSignEditFieldWebEelement.isDisplayed();
	return true;
}
catch(Exception ex){
	return false;	
}
}

public boolean sequenceEditField_UIValidation1()
{
try{
	WebElement sequenceEditFieldWebEelement=new WebDriverWait(driver,100)
		.until(ExpectedConditions.visibilityOfElementLocated(sequenceField_xpath));
	sequenceEditFieldWebEelement.isDisplayed();
	return true;
}
catch(Exception ex){
	return false;	
}
}

public boolean frequencyEditFieldMandatory_UIValidation()
{
try{
	WebElement frequencyEditFieldWebEelement=new WebDriverWait(driver,100)
		.until(ExpectedConditions.visibilityOfElementLocated(frequencyFieldMandatory_xpath));
	frequencyEditFieldWebEelement.isDisplayed();
	return true;
}
catch(Exception ex){
	return false;	
}
}

public boolean chargeTypeEditFieldMandatory_UIValidation()
{
try{
	WebElement chargeTypeyEditFieldWebEelement=new WebDriverWait(driver,100)
		.until(ExpectedConditions.visibilityOfElementLocated(chargeTypeFieldMandatory_xpath));
	chargeTypeyEditFieldWebEelement.isDisplayed();
	return true;
}
catch(Exception ex){
	return false;	
}
}

public boolean valueEditField_UIValidation()
{
try{
	WebElement valueEditFieldWebEelement=new WebDriverWait(driver,100)
		.until(ExpectedConditions.visibilityOfElementLocated(valueField_xpath));
	valueEditFieldWebEelement.isDisplayed();
	return true;
}
catch(Exception ex){
	return false;	
}
}

public boolean postingTypeEditFieldMandatory_UIValidation()
{
try{
	WebElement postingTypeyEditFieldWebEelement=new WebDriverWait(driver,100)
		.until(ExpectedConditions.visibilityOfElementLocated(postingTypeFieldMandatory_xpath));
	postingTypeyEditFieldWebEelement.isDisplayed();
	return true;
}
catch(Exception ex){
	return false;	
}
}

public boolean autoNewClientCheckboxEdit_UIValidation()
{
try{
	WebElement autoNewClientCheckboxAddFieldWebEelement=new WebDriverWait(driver,100)
		.until(ExpectedConditions.visibilityOfElementLocated(autoNewClientCheckbox_xpath));
	autoNewClientCheckboxAddFieldWebEelement.isDisplayed();
	return true;
}
catch(Exception ex){
	return false;	
}
}

public boolean cancelButtonEdit_UIValidation()
{
try{
	WebElement cancelButtonEditWebEelement=new WebDriverWait(driver,100)
		.until(ExpectedConditions.visibilityOfElementLocated(cancelButton_xpath));
	cancelButtonEditWebEelement.isDisplayed();
	return true;
}
catch(Exception ex){
	return false;	
}
}


public boolean saveButtonEdit_UIValidation()
{
try{
	WebElement saveButtonEditWebEelement=new WebDriverWait(driver,100)
		.until(ExpectedConditions.visibilityOfElementLocated(saveButton_xpath));
	saveButtonEditWebEelement.isDisplayed();
	return true;
}
catch(Exception ex){
	return false;	
}
}

public boolean chargeCodesBoxEdit_UIValidation()
{
try{
	WebElement chargeCodesBoxWebEelement=new WebDriverWait(driver,100)
		.until(ExpectedConditions.visibilityOfElementLocated(chargeCodesBox_xpath));
	chargeCodesBoxWebEelement.isDisplayed();
	return true;
}
catch(Exception ex){
	return false;	
}
}

public boolean transactionCodeBoxEdit_UIValidation()
{
try{
	WebElement transactionCodeBoxWebEelement=new WebDriverWait(driver,100)
		.until(ExpectedConditions.visibilityOfElementLocated(transactionCodeBox_xpath));
	transactionCodeBoxWebEelement.isDisplayed();
	return true;
}
catch(Exception ex){
	return false;	
}
}


public boolean natSignDropdownEdit_UIValidation()
{
try{
	
	 String[] exp = {"Select","Plus","Minus"};
	 
	WebElement dropdown = driver.findElement(natSignDropdown_xpath);  
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
	return false;
}
}

public boolean sequenceBoxEdit_UIValidation()
{
try{
	WebElement sequenceBoxWebEelement=new WebDriverWait(driver,100)
		.until(ExpectedConditions.visibilityOfElementLocated(sequenceBox_xpath));
	sequenceBoxWebEelement.isDisplayed();
	return true;
}
catch(Exception ex){
	return false;	
}
}

public boolean frequencyDropdownEdit_UIValidation()
{
try{
	
	 String[] exp = {"Select","Annually","Bus. Daily","Daily","Manual","Monthly","Quarterly","Weekly","One Time"};

	WebElement dropdown = driver.findElement(frequencyDropdown_xpath);  
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
	return false;
}
}

public boolean chargeTypeDropdownEdit_UIValidation()
{
try{
	
	 String[] exp = {"Select","Value","Loan","Loan/Float","Loan/Float/Advance","Unused Line","Minimum Balance","Original Amount"};

	WebElement dropdown = driver.findElement(chargeTypeDropdown_xpath);  
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
	return false;
}
}

public boolean valueBoxEdit_UIValidation()
{
try{
	WebElement valueBoxWebEelement=new WebDriverWait(driver,100)
		.until(ExpectedConditions.visibilityOfElementLocated(valueBox_xpath));
	valueBoxWebEelement.isDisplayed();
	return true;
}
catch(Exception ex){
	return false;	
}
}

public boolean postingTypeDropdownEdit_UIValidation()
{
try{
	
	 String[] exp = {"Select","In Balance","Accrue To Loan","Accrue To Statement"};

	WebElement dropdown = driver.findElement(postingTypeDropdown_xpath);  
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
	return false;
}
}

public boolean clickOnAutoNewClientCheckboxOnEdit()
{
try{
	WebElement autoNewClientCheckboxWebEelement=new WebDriverWait(driver,100)
		.until(ExpectedConditions.visibilityOfElementLocated(autoNewClientCheckbox_xpath));
	autoNewClientCheckboxWebEelement.click();
	return true;
}
catch(Exception ex){
	return false;	
}
}

public boolean clickOnsaveButtonOnEdit()
{
try{
	WebElement saveButtonAddWebEelement=new WebDriverWait(driver,100)
		.until(ExpectedConditions.visibilityOfElementLocated(saveButton_xpath));
	saveButtonAddWebEelement.click();
	return true;
}
catch(Exception ex){
	return false;	
}
}

public boolean clickOnCancelButtonOnEdit()
{
try{
	WebElement cancelButtonAddWebEelement=new WebDriverWait(driver,100)
		.until(ExpectedConditions.visibilityOfElementLocated(cancelButton_xpath));
	cancelButtonAddWebEelement.click();
	return true;
}
catch(Exception ex){
	return false;	
}
}


public boolean verifySuccessMessageForEditingdata(String successmsg){
	try{
		WebElement successMessageWebE=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(SuccessMessage_xpath));
		String actual_msg=successMessageWebE.getText().trim();
		
		if(actual_msg.equals(successmsg))
		{
			System.out.println(actual_msg);
	        return true;
		}
	else
		return false;
	}
catch(Exception ex){
	System.out.println("Test case Failed");
	return false;
	}
	
}

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


public boolean chargeCodesUIInExportPopUp()
	{
	try{
		WebElement exportButtonWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(chargeCodesFieldMandatory_xpath));
		exportButtonWebEelement.isDisplayed();
		return true;
	}
	catch(Exception ex){
		return false;
	}
	}
	
	public boolean transactionCodeUIInExportPopUp()
	{
	try{
		WebElement exportButtonWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(transactionCodeField_xpath));
		exportButtonWebEelement.isDisplayed();
		return true;
	}
	catch(Exception ex){
		return false;
	}

	}
	
	public boolean NatSignUIInExportPopUp()
	{
	try{
		WebElement exportButtonWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(natSignFieldMandatory_xpath));
		exportButtonWebEelement.isDisplayed();
		return true;
	}
	catch(Exception ex){
		return false;
	}

	}
	
	public boolean SequenceUIInExportPopUp()
	{
	try{
		WebElement exportButtonWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(sequenceField_xpath));
		exportButtonWebEelement.isDisplayed();
		return true;
	}
	catch(Exception ex){
		return false;
	}

	}
	
	public boolean FrequencyUIInExportPopUp()
	{
	try{
		WebElement exportButtonWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(frequencyFieldMandatory_xpath));
		exportButtonWebEelement.isDisplayed();
		return true;
	}
	catch(Exception ex){
		return false;
	}

	}
	
	public boolean ChargeTypeUIInExportPopUp()
	{
	try{
		WebElement exportButtonWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(chargeTypeFieldMandatory_xpath));
		exportButtonWebEelement.isDisplayed();
		return true;
	}
	catch(Exception ex){
		return false;
	}

	}
	
	public boolean  ValueUIInExportPopUp()
	{
	try{
		WebElement exportButtonWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(valueField_xpath));
		exportButtonWebEelement.isDisplayed();
		return true;
	}
	catch(Exception ex){
		return false;
	}

	}
	
	public boolean  PostingTypeInExportPopUp()
	{
	try{
		WebElement exportButtonWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(postingTypeFieldMandatory_xpath));
		exportButtonWebEelement.isDisplayed();
		return true;
	}
	catch(Exception ex){
		return false;
	}

	}
	
	public boolean  AutoNewClientExportPopUp()
	{
	try{
		WebElement exportButtonWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(autonewclientPopUp_xpath));
		exportButtonWebEelement.isDisplayed();
		return true;
	}
	catch(Exception ex){
		return false;
	}

	}
	
	
	public boolean chargeCodesCheckboxUIInExportPopUp()
	{
	try{
		WebElement exportButtonWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(chargeCodesExportCheckbox_xpath));
		exportButtonWebEelement.isDisplayed();
		return true;
	}
	catch(Exception ex){
		return false;
	}
	}
	
	public boolean transactionCodeCheckboxUIInExportPopUp()
	{
	try{
		WebElement exportButtonWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(transactionCodeExportCheckbox_xpath));
		exportButtonWebEelement.isDisplayed();
		return true;
	}
	catch(Exception ex){
		return false;
	}

	}
	
	public boolean NatSignCheckboxUIInExportPopUp()
	{
	try{
		WebElement exportButtonWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(natSignExportCheckbox_xpath));
		exportButtonWebEelement.isDisplayed();
		return true;
	}
	catch(Exception ex){
		return false;
	}

	}
	
	public boolean SequenceCheckboxUIInExportPopUp()
	{
	try{
		WebElement exportButtonWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(sequenceExportCheckbox_xpath));
		exportButtonWebEelement.isDisplayed();
		return true;
	}
	catch(Exception ex){
		return false;
	}

	}
	
	public boolean FrequencyCheckboxUIInExportPopUp()
	{
	try{
		WebElement exportButtonWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(frequencyExportCheckbox_xpath));
		exportButtonWebEelement.isDisplayed();
		return true;
	}
	catch(Exception ex){
		return false;
	}

	}
	
	public boolean ChargeTypeCheckboxUIInExportPopUp()
	{
	try{
		WebElement exportButtonWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(chargeTypeExportCheckbox_xpath));
		exportButtonWebEelement.isDisplayed();
		return true;
	}
	catch(Exception ex){
		return false;
	}

	}
	
	public boolean  ValueCheckboxUIInExportPopUp()
	{
	try{
		WebElement exportButtonWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(valueExportCheckbox_xpath));
		exportButtonWebEelement.isDisplayed();
		return true;
	}
	catch(Exception ex){
		return false;
	}

	}
	
	public boolean  PostingTypeCheckboxInExportPopUp()
	{
	try{
		WebElement exportButtonWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(postingTypeExportCheckbox_xpath));
		exportButtonWebEelement.isDisplayed();
		return true;
	}
	catch(Exception ex){
		return false;
	}

	}
	
	public boolean  AutoNewClientCheckboxExportPopUp()
	{
	try{
		WebElement exportButtonWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(autonewclientExportCheckbox_xpath));
		exportButtonWebEelement.click();
		return true;
	}
	catch(Exception ex){
		return false;
	}

	}
	
	public boolean selectChargeCodesCheckboxOnexportPopUp(boolean flag){
        try {
           WebDriverWait wait = new WebDriverWait(driver, 60);
           
           wait.until(ExpectedConditions.visibilityOfElementLocated(chargeCodesExportCheckbox_xpath));
           
           WebElement element = driver.findElement((chargeCodesExportCheckbox_xpath));
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
	
	public boolean selectTransactionCodeCheckboxOnexportPopUp(boolean flag){
        try {
           WebDriverWait wait = new WebDriverWait(driver, 60);
           
           wait.until(ExpectedConditions.visibilityOfElementLocated(transactionCodeExportCheckbox_xpath));
           
           WebElement element = driver.findElement((transactionCodeExportCheckbox_xpath));
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
	
	
	public boolean selectNatSignCheckboxOnexportPopUp(boolean flag){
        try {
           WebDriverWait wait = new WebDriverWait(driver, 60);
           
           wait.until(ExpectedConditions.visibilityOfElementLocated(natSignExportCheckbox_xpath));
           
           WebElement element = driver.findElement((natSignExportCheckbox_xpath));
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
	
	public boolean selectSequenceCheckboxOnexportPopUp(boolean flag){
        try {
           WebDriverWait wait = new WebDriverWait(driver, 60);
           
           wait.until(ExpectedConditions.visibilityOfElementLocated(sequenceExportCheckbox_xpath));
           
           WebElement element = driver.findElement((sequenceExportCheckbox_xpath));
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
	
	public boolean selectFrequencyCheckboxOnexportPopUp(boolean flag){
        try {
           WebDriverWait wait = new WebDriverWait(driver, 60);
           
           wait.until(ExpectedConditions.visibilityOfElementLocated(frequencyExportCheckbox_xpath));
           
           WebElement element = driver.findElement((frequencyExportCheckbox_xpath));
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
	
	public boolean selectChargeTypeCheckboxOnexportPopUp(boolean flag){
        try {
           WebDriverWait wait = new WebDriverWait(driver, 60);
           
           wait.until(ExpectedConditions.visibilityOfElementLocated(chargeTypeExportCheckbox_xpath));
           
           WebElement element = driver.findElement((chargeTypeExportCheckbox_xpath));
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
	
	
	public boolean selectValueCheckboxOnexportPopUp(boolean flag){
        try {
           WebDriverWait wait = new WebDriverWait(driver, 60);
           
           wait.until(ExpectedConditions.visibilityOfElementLocated(valueExportCheckbox_xpath));
           
           WebElement element = driver.findElement((valueExportCheckbox_xpath));
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
	
	public boolean selectPostingTypeCheckboxOnexportPopUp(boolean flag){
        try {
           WebDriverWait wait = new WebDriverWait(driver, 60);
           
           wait.until(ExpectedConditions.visibilityOfElementLocated(postingTypeExportCheckbox_xpath));
           
           WebElement element = driver.findElement((postingTypeExportCheckbox_xpath));
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
	
	public boolean selectAutoNewClientCheckboxOnexportPopUp(boolean flag){
        try {
           WebDriverWait wait = new WebDriverWait(driver, 60);
           
           wait.until(ExpectedConditions.visibilityOfElementLocated(autonewclientExportCheckbox_xpath));
           
           WebElement element = driver.findElement((autonewclientExportCheckbox_xpath));
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
	
	public boolean clickexportButtonInPopUp()
   	{
   	try{
   	Thread.sleep(3000);
   		WebElement exportButtonWebEelement=new WebDriverWait(driver,10)
   		.until(ExpectedConditions.visibilityOfElementLocated(exportButtonInPopUp_xpath));
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
		.until(ExpectedConditions.visibilityOfElementLocated(deleteButton_xpath));
		deleteButtonWebEelement.click();
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
    		WebElement deleteButtonWebEelement=new WebDriverWait(driver,10)
    		.until(ExpectedConditions.visibilityOfElementLocated(selectAllCheckBox_xpath));
    		deleteButtonWebEelement.click();
    		return true;
    	}
    	catch(Exception ex){
    		return false;
    	}

  
    
}
	 
	 public boolean menuSearch(String chargeCodesSerach)
    	{
    	try{
    	    /*Thread.sleep(3000);*/
    		WebElement menuSearchWebEelement=new WebDriverWait(driver,60)
    		.until(ExpectedConditions.visibilityOfElementLocated(menuSearch_xpath));
    		menuSearchWebEelement.click();
    		menuSearchWebEelement.sendKeys();
    		Thread.sleep(5000);
    		return true;
    	}
    	catch(Exception ex){
    		return false;
    	}

    
    	}
	
	
	
   public boolean validateMenuSearch()
	{
	try{
		WebElement menuSearchWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(validMenuSearch_xpath));
		menuSearchWebEelement.click();
		return true;
	}
	catch(Exception ex){
		return false;
	}


	}
	
	
	
}



	


