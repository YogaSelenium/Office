package com.cync.pages;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.SkipException;

import com.cync.base.BasePage;



/*Jagadish changes*/


public class CurrencyCodePage extends BasePage{

	
	private final By CurrencyCodeHeader_xpath=By.xpath("//h3[contains(text(),'Currency Code Summary')]");
	private final By Breadcrumb_xpath=By.xpath("//ul[@class='breadcrumb']");
	private final By Menu_xpath=By.xpath("//*[@class='hand ng-star-inserted']");
	private final By MenuSearch_xpath=By.xpath("//input[@id='searchInputId']");
	private final By MenuSearchData_xpath=By.xpath("(//a[contains(@href,'#/generalCodes/currency-code')])[1]");
	private final By CurrencyColumn_xpath=By.xpath("//span[text()='Currency']");
	private final By DescriptionColumn_xpath=By.xpath("//span[text()='Description']");
	private final By DecimalPrecisionColumn_xpath=By.xpath("//span[text()='Decimal Precision']");
	private final By SelectAllColumn_xpath=By.xpath("(//div[@class='ui-chkbox ui-widget'])[1]");
	private final By CurrencyCadx_path=By.xpath("//span[contains(text(),'CAD')]");
	private final By CurrencycadDescriptionx_path=By.xpath("//span[contains(text(),'Canadian Dollar')]");
	private final By CurrencyEurx_path=By.xpath("//span[contains(text(),'Euro')]");
	private final By CurrencyEurDescriptionx_path=By.xpath("//span[contains(text(),'Euro')]");
	private final By CurrencyGbpx_path=By.xpath("//span[contains(text(),'GBP')]");
	private final By CurrencyGbpDescriptionx_path=By.xpath("//span[contains(text(),'Pound Sterling')]");
	private final By CurrencyMxnx_path=By.xpath("//span[contains(text(),'MXN')]");
	private final By CurrencyMxnDescriptionx_path=By.xpath("//span[contains(text(),'Mexican Nuevo Peso')]");
	private final By CurrencyUsdx_path=By.xpath("//span[contains(text(),'USD')]");
	private final By CurrencyUsdDescriptionx_path=By.xpath("//span[contains(text(),'US Dollar')]");
	private final By RecordsDetailsx_path=By.xpath("//p[@class='recordcount ng-star-inserted']");
	private final By AddNew_xpath=By.xpath("//i[@id='New']");
	private final By Export_xpath=By.xpath("//i[@id='Export']");
	private final By DisabledEditx_path=By.xpath("//i[@class='hand fa fa-pencil fa-1x clr_grey f_s_20 icon_disabled operation_disabled ng-star-inserted']");
	private final By DisabledDeletex_path=By.xpath("//i[@class='hand fa fa-trash fa-2x f_s_20 clr_grey icon_disabled operation_disabled ng-star-inserted']");
	private final By CurrencyCodeAddHeaderx_path=By.xpath("//h3[contains(text(),'Currency Code - Add ')]");
	private final By AddCurrencyx_path=By.xpath("//label[contains(text(),'Currency')]");
	private final By AddDescriptionx_path=By.xpath("//label[contains(text(),'Description')]");
	private final By AddDecimalPrecisionx_path=By.xpath("//label[contains(text(),'Decimal Precision')]");
	private final By AddCurrencyTextBoxx_path=By.xpath("//input[@id='currency']");
	private final By AddDescriptionTextBoxx_path=By.xpath("//input[@id='description']");
	private final By AddDecimalPrecisionTextBoxx_path=By.xpath("//input[@id='decimalPrecision']");
	private final By AddcurrencyMandatoryx_path=By.xpath("(//span[@class='required'])[1]");
	private final By AddDescriptionMandatoryx_path=By.xpath("(//span[@class='required'])[2]");
	private final By AddDecimalPrecisionMandatoryx_path=By.xpath("(//span[@class='required'])[3]");
	private final By CancelButtonx_path=By.xpath("//button[@id='action_back']");
	private final By SaveAndNewx_path=By.xpath("//button[@id='action_savenew']");
	private final By SaveButtonx_path=By.xpath("//button[@id='action_save']");
	private final By AddSuccessmsgx_path=By.xpath("//div[@class='success ng-star-inserted']");
	private final By MainSearchx_path=By.xpath("//input[@placeholder='Search Here']");
	private final By SearchDatax_path=By.xpath("(//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default'])[2]");
	private final By EnabledEditx_path=By.xpath("//i[@class='ng-star-inserted hand fa fa-pencil fa-1x clr_grey f_s_20']");
	private final By EnabledDeletex_path=By.xpath("//i[@class='ng-star-inserted hand fa fa-trash fa-2x f_s_20 clr_grey']");
	private final By CurrencyCodeEditHeaderx_path=By.xpath("//h3[contains(text(),'Currency Code - Edit')]");
	private final By EditSuccessmsgx_path=By.xpath("//div[@class='success ng-star-inserted']");
	private final By DeleteButtonPopUpHeaderx_path=By.xpath("//p[contains(text(),'Are you sure you want to delete')]");
	private final By DeleteYesx_path=By.xpath("//button[@class='noradius btn btn-sm btn-primary p_r_20 p_l_20 ui-button ui-widget ui-state-default ui-corner-all ui-button-text-only ui-button ui-widget ui-state-default ui-corner-all ui-button-text-only options-btn']");
	private final By DeleteNox_path=By.xpath("//button[@class='noradius btn btn-sm btn-primary p_r_20 p_l_20 ui-button ui-widget ui-state-default ui-corner-all ui-button-text-only options-btn']");
	private final By DeleteSuccessmsgx_path=By.xpath("//div[@id='cync_notifications_msg']");
	private final By CurrencyMandatorymsgx_path=By.xpath("//small[contains(text(),'Enter Curreny Code')]");
	private final By CurrencyLengthmsgx_path=By.xpath("//small[contains(text(),'Maximum length 3')]");
	private final By DescriptionMandatorymsgx_path=By.xpath("//small[contains(text(),'Enter Description')]");
	private final By DecimalPrecisionMandatorymsgx_path=By.xpath("//small[contains(text(),'Enter Decimal Precision')]");
	private final By DecimalPrecisionInvalidDatamsgx_path=By.xpath("//small[contains(text(),'Not a valid Number')]");
	private final By InvalidPrecisionRangemsgx_path=By.xpath("//div[@class='danger ng-star-inserted']");
	private final By InvalidPrecisionmsgx_path=By.xpath("//div[@class='error-text-msg ng-star-inserted']");
	private final By ClickCurrencyCodex_path=By.xpath("(//tr[@class='ui-datatable-odd ui-widget-content ng-star-inserted'])[1]");
	private final By SeedUpdateMsgx_path=By.xpath("//div[@class='danger ng-star-inserted']");
	private final By ExportHeaderx_path=By.xpath("//span[contains(text(),'Curreny Code')]");
	private final By CrossIconExportx_path=By.xpath("(//span[@class='fa fa-fw fa-close'])[1]");
	private final By ExportButtonPopUpx_path=By.xpath("//span[@class='ui-button-text ui-clickable']");
	private final By CurrencyCheckBoxExportx_path=By.xpath("(//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default ui-state-active'])[2]");
	private final By DescriptionCheckBoxExportx_path=By.xpath("(//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default ui-state-active'])[3]");
	private final By DecimalPrecisionCheckBoxExportx_path=By.xpath("(//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default ui-state-active'])[4]");
	private final By SearcheDataMainSeachx_path=By.xpath("//span[contains(text(),'MXN')]");
	private final By SearchCancelx_path=By.xpath("//span[@class='input-group-addon icon-input-field border-right-none']");
	private final By CurrencySearchx_path=By.xpath("(//input[@class='ui-column-filter ui-inputtext ui-widget ui-state-default ui-corner-all ng-star-inserted'])[1]");
	private final By DescriptionSearchx_path=By.xpath("(//input[@class='ui-column-filter ui-inputtext ui-widget ui-state-default ui-corner-all ng-star-inserted'])[2]");
	private final By PrecisionSearchx_path=By.xpath("(//input[@class='ui-column-filter ui-inputtext ui-widget ui-state-default ui-corner-all ng-star-inserted'])[3]");
	private final By SearchedDescriptionDatax_path=By.xpath("//span[contains(text(),'US Dollar')]");
	private final By SearchedPrecisionDatax_path=By.xpath("(//td[@class='ng-star-inserted'])[3]");
	private final By CurrencySortx_path=By.xpath("(//span[@class='ui-sortable-column-icon fa fa-fw fa-sort ng-star-inserted'])[1]");
	private final By CurrencyUPSortx_path=By.xpath("//span[@class='ui-sortable-column-icon fa fa-fw fa-sort ng-star-inserted fa-sort-asc']");
	private final By CurrencyDownSortx_path=By.xpath("//span[@class='ui-sortable-column-icon fa fa-fw fa-sort ng-star-inserted fa-sort-desc']");
	private final By DescriptionSortx_path=By.xpath("(//span[@class='ui-sortable-column-icon fa fa-fw fa-sort ng-star-inserted'])[2]");
	private final By DescriptionUPSortx_path=By.xpath("//span[@class='ui-sortable-column-icon fa fa-fw fa-sort ng-star-inserted fa-sort-asc']");
	private final By DescriptionDownSortx_path=By.xpath("//span[@class='ui-sortable-column-icon fa fa-fw fa-sort ng-star-inserted fa-sort-desc']");
	private final By PrecisionSortx_path=By.xpath("(//span[@class='ui-sortable-column-icon fa fa-fw fa-sort ng-star-inserted'])[3]");
	private final By PrecisionUPSortx_path=By.xpath("//span[@class='ui-sortable-column-icon fa fa-fw fa-sort ng-star-inserted fa-sort-asc']");
	private final By PrecisionDownSortx_path=By.xpath("//span[@class='ui-sortable-column-icon fa fa-fw fa-sort ng-star-inserted fa-sort-desc']");
	
	


	public CurrencyCodePage(WebDriver driver) {
		super(driver);
		try{
			Thread.sleep(9000);
			if(!driver.findElement(CurrencyCodeHeader_xpath).getText().trim().contains("Currency Code Summary")){
				throw new SkipException("Currency Code Summary page couldn't open.");
			
			}}
		catch(Exception e){
			
		// TODO Auto-generated constructor stub
			e.printStackTrace();
	}
		
		// TODO Auto-generated constructor stub
		
	}
	public String breadcrumb(String currencycodeBreadcrumb)
	{
		try{
			WebElement breadcrumbWebEelement=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(Breadcrumb_xpath));
			breadcrumbWebEelement.isDisplayed();
			
		}
		catch(Exception ex){
			
		}
		return currencycodeBreadcrumb;

		}

	public boolean HeaderVerify(String Header)
	{
	 
	try{
		WebElement HeaderWebEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(CurrencyCodeHeader_xpath));
		String actual = HeaderWebEelement.getText().trim();
		if (actual.equals(Header))
			return true;
		else
			return false;

	} catch (Exception e) {
		return false;
	}
}
	public boolean VerifySelctAllColumn()
	{
		  try{
			 
		WebElement SelectAllwebelement=new WebDriverWait(driver,100)
		.until(ExpectedConditions.visibilityOfElementLocated(SelectAllColumn_xpath));
		SelectAllwebelement.isDisplayed();
		Thread.sleep(2000);
		
		
		return true;

     }
     catch(Exception ex){
    	 return false;
 }
}
	public boolean ClickOnMenu()
	{
		  try{
			 
		WebElement SelectAllwebelement=new WebDriverWait(driver,100)
		.until(ExpectedConditions.visibilityOfElementLocated(Menu_xpath));
		SelectAllwebelement.click();
		Thread.sleep(5000);
		
		
		return true;

     }
     catch(Exception ex){
    	 return false;
 }   
 }
	public String addValueToMasterSearchTextBox(String masterSearchData)
	{
	try{
		WebElement masterSearchTextBoxWebEelement=new WebDriverWait(driver,100)
		.until(ExpectedConditions.visibilityOfElementLocated(MenuSearch_xpath));
		masterSearchTextBoxWebEelement.click();
		masterSearchTextBoxWebEelement.clear();
		masterSearchTextBoxWebEelement.sendKeys(masterSearchData);
		Thread.sleep(5000);
		
	}
	catch(Exception ex){

 }
	return masterSearchData;
	}
	public boolean ClickOnSearchedData()
	{
		  try{
			 
		WebElement SearchDataClcikwebelement=new WebDriverWait(driver,100)
		.until(ExpectedConditions.visibilityOfElementLocated(MenuSearchData_xpath));
		SearchDataClcikwebelement.click();
		Thread.sleep(5000);
		
		
		return true;

     }
     catch(Exception ex){
    	 return false;
 }   
 }
	public boolean VerifyMenuSearch()
	{
		  try{
			 
		WebElement SmenuSearchwebelement=new WebDriverWait(driver,100)
		.until(ExpectedConditions.visibilityOfElementLocated(SelectAllColumn_xpath));
		SmenuSearchwebelement.isDisplayed();
		Thread.sleep(2000);
		
		
		return true;

     }
     catch(Exception ex){
    	 return false;
 }}
	public boolean VerifyCurrencyColumn()
	{
		try{
		
		WebElement CurrencyWebelement=new WebDriverWait(driver,100)
		.until(ExpectedConditions.visibilityOfElementLocated(CurrencyColumn_xpath));
		CurrencyWebelement.isDisplayed();
		Thread.sleep(2000);
		
		return true;
	}
	catch(Exception ex){
		return false;
	}
		
	}
	
	public boolean VerifyDescriptionColumn()
	{
		try{
		
		WebElement DescriptionWebelement=new WebDriverWait(driver,100)
		.until(ExpectedConditions.visibilityOfElementLocated(DescriptionColumn_xpath));
		DescriptionWebelement.isDisplayed();
		Thread.sleep(2000);
		
		return true;
	}
	catch(Exception ex){
		return false;
	}
		
	}
	public boolean VerifyDecimalPrecisionColumn()
	{
		try{
		
		WebElement decimalprecisionWebelement=new WebDriverWait(driver,100)
		.until(ExpectedConditions.visibilityOfElementLocated(DecimalPrecisionColumn_xpath));
		decimalprecisionWebelement.isDisplayed();
		Thread.sleep(2000);
		
		return true;
	}
	catch(Exception ex){
		return false;
	}
		
	}
	public boolean VerifyCurrencyCadDescription(String expected)
	{
		try{
		
		WebElement descriptioncadWebelement=new WebDriverWait(driver,100)
		.until(ExpectedConditions.visibilityOfElementLocated(CurrencyCadx_path));
		descriptioncadWebelement.isDisplayed();
		WebElement cadDescriptionWebelement=new WebDriverWait(driver,100)
		.until(ExpectedConditions.visibilityOfElementLocated(CurrencycadDescriptionx_path));
		String actual=cadDescriptionWebelement.getText();
		if (actual.equals(expected)) 
			return true;
		
	}
	catch(Exception ex){
		return false;
	}
		
		return true;
	}
		public boolean VerifyCurrencyEurDescription(String expected)
		{
			try{
			
			WebElement descriptioneurWebelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(CurrencyEurx_path));
			descriptioneurWebelement.isDisplayed();
			WebElement eurDescriptionWebelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(CurrencyEurDescriptionx_path));
			String actual=eurDescriptionWebelement.getText();
			if (actual.equals(expected)) {
				return true;
			}else
				
			return false;
		}
		catch(Exception ex){
			return false;
		}
	}
	
		public boolean VerifyCurrencyGpbDescription(String expected)
		{
			try{
			
			WebElement descriptiongpbWebelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(CurrencyGbpx_path));
			descriptiongpbWebelement.isDisplayed();
			WebElement gpbDescriptionWebelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(CurrencyGbpDescriptionx_path));
			String actual=gpbDescriptionWebelement.getText();
			if (actual.equals(expected)) {
				return true;
			}else
				
			return false;
		}
		catch(Exception ex){
			return false;
		}
	}
		public boolean VerifyCurrencyMxnDescription(String expected)
		{
			try{
			
			WebElement descriptionmxnWebelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(CurrencyMxnx_path));
			descriptionmxnWebelement.isDisplayed();
			WebElement mxnDescriptionWebelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(CurrencyMxnDescriptionx_path));
			String actual=mxnDescriptionWebelement.getText();
			if (actual.equals(expected)) {
				return true;
			}else
				
			return false;
		}
		catch(Exception ex){
			return false;
		}
	}
		public boolean VerifyCurrencyUsdDescription(String expected)
		{
			try{
			
			WebElement descriptionusdWebelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(CurrencyUsdx_path));
			Thread.sleep(1000);
			descriptionusdWebelement.isDisplayed();
			WebElement usdDescriptionWebelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(CurrencyUsdDescriptionx_path));
			Thread.sleep(1000);
			
			String actual=usdDescriptionWebelement.getText();
			if (actual.equals(expected)) {
				return true;
			}
		}
		catch(Exception ex){
			return false;
		}
			return true;
	}
		/*public boolean MasterSearch(String currency Code)
		{
			try{
				
		WebElement masterSerachdWebelement=new WebDriverWait(driver,100)
		.until(ExpectedConditions.visibilityOfElementLocated(Menu_xpath));
		masterSerachdWebelement.click();
		masterSerachdWebelement.sendKeys(currencyCodesearch);
		return true;
	  }
      	catch(Exception ex){
	       		return false;
	       	}
	      }*/
		public boolean VerifyAddIcon()
		{
			try{
			
			WebElement addWebelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(AddNew_xpath));
			addWebelement.isDisplayed();
			Thread.sleep(2000);
			
			return true;
		}
		catch(Exception ex){
			return false;
		}
			
		}
		public boolean VerifyExportIcon()
		{
			try{
					
		    WebElement exportWebelement=new WebDriverWait(driver,100)
		    .until(ExpectedConditions.visibilityOfElementLocated(Export_xpath));
		    exportWebelement.isDisplayed();
			Thread.sleep(2000);
					
			return true;
		}
				
			catch(Exception ex){
			return false;
			}
		}
		public boolean VerifyDisabledEditIcon()	
		{
			try{
				
			    WebElement diableeditWebelement=new WebDriverWait(driver,100)
			    .until(ExpectedConditions.visibilityOfElementLocated(DisabledEditx_path));
			    diableeditWebelement.isDisplayed();
				Thread.sleep(2000);
						
				return true;
			}
					
				catch(Exception ex){
				return false;
			}
		}
		public boolean VerifyDisabledDeleteIcon()	
		{
			try{
				
			    WebElement diableddeleteWebelement=new WebDriverWait(driver,100)
			    .until(ExpectedConditions.visibilityOfElementLocated(DisabledDeletex_path));
			    diableddeleteWebelement.isDisplayed();
				Thread.sleep(2000);
						
				return true;
			}
					
				catch(Exception ex){
				return false;
			}
		}
		public boolean VerifyRecordDetails()	
		{
			try{
				
			    WebElement recorddetailsWebelement=new WebDriverWait(driver,100)
			    .until(ExpectedConditions.visibilityOfElementLocated(RecordsDetailsx_path));
			    recorddetailsWebelement.isDisplayed();
				Thread.sleep(2000);
						
				return true;
			}
					
				catch(Exception ex){
				return false;
			}
		}
		public boolean ClickOnAddButton()
		{
		try{
			WebElement addButtonWebEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(AddNew_xpath));
			
            addButtonWebEelement.click();
			Thread.sleep(2000);
			return true;
		}
		catch(Exception ex){
			return false;
		}
		}
		
		
		
		
	    public boolean VerifyHeaderOfAdd(String currencycodeHeader)	
		{
			   try{
				WebElement HeaderWebEelement=new WebDriverWait(driver,100)
					.until(ExpectedConditions.visibilityOfElementLocated(CurrencyCodeAddHeaderx_path));
				String actual = HeaderWebEelement.getText().trim();
				
				if (actual.equals(currencycodeHeader))
					return true;
				else
					return false;

			} catch (Exception e) {
				return false;
			}
		}
		
		
		
		
		
		
		
	    public boolean VerifyAddCurrencyMandatory()
	    {
	   
	    	try{
	    		WebElement addcurrencymandatoryWebElement=new WebDriverWait(driver,100)
	    		.until(ExpectedConditions.visibilityOfElementLocated(AddcurrencyMandatoryx_path));
	    		addcurrencymandatoryWebElement.isDisplayed();
	    		Thread.sleep(3000);
	    		
	    		return true;
	    		
	    	}
	    	catch(Exception ex){
				return false;
	    	}
	    }
	    public boolean VerifyAddDescriptionMandatory()
	    {
	   
	    	try{
	    		WebElement adddescriptionmandatoryWebElement=new WebDriverWait(driver,100)
	    		.until(ExpectedConditions.visibilityOfElementLocated(AddDescriptionMandatoryx_path));
	    		adddescriptionmandatoryWebElement.isDisplayed();
	    		Thread.sleep(3000);
	    		
	    		return true;
	    		
	    	}
	    	catch(Exception ex){
				return false;
	    	}
	    }
	    public boolean VerifyAddDecimalPrecisionMandatory()
	    {
	   
	    	try{
	    		WebElement adddecimalprecisionmandatoryWebElement=new WebDriverWait(driver,100)
	    		.until(ExpectedConditions.visibilityOfElementLocated(AddDecimalPrecisionMandatoryx_path));
	    		adddecimalprecisionmandatoryWebElement.isDisplayed();
	    		Thread.sleep(3000);
	    		
	    		return true;
	    		
	    	}
	    	catch(Exception ex){
				return false;
	    	}
	    }
	    public boolean VerifyCancelButton()
	    {
	   
	    	try{
	    		WebElement cancelbuttonWebElement=new WebDriverWait(driver,100)
	    		.until(ExpectedConditions.visibilityOfElementLocated(CancelButtonx_path));
	    		cancelbuttonWebElement.isDisplayed();
	    		Thread.sleep(3000);
	    		
	    		return true;
	    		
	    	}
	    	catch(Exception ex){
				return false;
	    	}
	    }
	    public boolean VerifySaveAndNewButton()
	    {
	   
	    	try{
	    		WebElement saveandnewWebElement=new WebDriverWait(driver,100)
	    		.until(ExpectedConditions.visibilityOfElementLocated(SaveAndNewx_path));
	    		saveandnewWebElement.isDisplayed();
	    		Thread.sleep(3000);
	    		
	    		return true;
	    		
	    	}
	    	catch(Exception ex){
				return false;
	    	}
	    }
	    public boolean VerifySaveButton()
	    {
	   
	    	try{
	    		WebElement saveWebElement=new WebDriverWait(driver,100)
	    		.until(ExpectedConditions.visibilityOfElementLocated(SaveButtonx_path));
	    		saveWebElement.isDisplayed();
	    		
	    		return true;
	    		
	    	}
	    	catch(Exception ex){
				return false;
	    	}
	    }
	    public boolean SaveCurrencyCode()
		{
		try{
			WebElement SaveOnAddCurrencysWebEelement=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(SaveButtonx_path));
			SaveOnAddCurrencysWebEelement.click();
		Thread.sleep(5000);
			return true;
		}
		catch(Exception ex){
			return false;
		}

		}
	    public boolean SaveAndNewCurrencyCode()
		{
		try{
			WebElement saveAndNewOnAddCurrencysWebEelement=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(SaveAndNewx_path));
			saveAndNewOnAddCurrencysWebEelement.click();
		Thread.sleep(5000);
			return true;
		}
		catch(Exception ex){
			return false;
		}

		}
	    public boolean CancelCurrencyCode()
		{
		try{
			WebElement cancelOnAddCurrencysWebEelement=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(CancelButtonx_path));
			cancelOnAddCurrencysWebEelement.click();
		Thread.sleep(5000);
			return true;
		}
		catch(Exception ex){
			return false;
		}

		}
	    public String addValueToCurrencyTextBox(String currencyData)
		{
		try{
			WebElement currencyTextBoxWebEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(AddCurrencyTextBoxx_path));
/*			currencyTextBoxWebEelement.click();
*/			currencyTextBoxWebEelement.clear();
			currencyTextBoxWebEelement.sendKeys(currencyData);
			
		}
		catch(Exception ex){
	
	 }
		return currencyData;

		}
	    public boolean clickCurrencyTextBox()
		{
		try{
			WebElement clickCurrencyTextBoxWebEelement=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(AddCurrencyTextBoxx_path));
			clickCurrencyTextBoxWebEelement.click();
		Thread.sleep(5000);
			return true;
		}
		catch(Exception ex){
			return false;
		}

		}
	    public String verifyMessageOnCurrencyMandatory(String messageOnCurrencyMandatory)
	    {
	    try{
	       WebElement currencyMandatoryWebEelement=new WebDriverWait(driver,10)
	       .until(ExpectedConditions.visibilityOfElementLocated(CurrencyMandatorymsgx_path));
	       
	      String actualMsgFromAPP= currencyMandatoryWebEelement.getText();
	      if(actualMsgFromAPP.equalsIgnoreCase(messageOnCurrencyMandatory))
	      {
	       return actualMsgFromAPP;
	      }
	       
	    }
	    catch(Exception ex){
	     
	    }
	 return messageOnCurrencyMandatory;
	    }
	    public String verifyMessageOnCurrencyLength(String messageOnCurrencyLength)
	    {
	    try{
	       WebElement currencyMandatoryLengthWebEelement=new WebDriverWait(driver,10)
	       .until(ExpectedConditions.visibilityOfElementLocated(CurrencyLengthmsgx_path));
	       
	      String actualMsgFromAPP= currencyMandatoryLengthWebEelement.getText();
	      if(actualMsgFromAPP.equalsIgnoreCase(messageOnCurrencyLength))
	      {
	       return actualMsgFromAPP;
	      }
	       
	    }
	    catch(Exception ex){
	     
	    }
	 return messageOnCurrencyLength;
	    }
	    
	    
	    public String addValueToDescriptionTextBox(String editdescriptionData)
		{
		try{
			WebElement descriptionTextBoxWebEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(AddDescriptionTextBoxx_path));
			descriptionTextBoxWebEelement.click();
			descriptionTextBoxWebEelement.clear();
			descriptionTextBoxWebEelement.sendKeys(editdescriptionData);
			
		}
		catch(Exception ex){
	
	 }
		return editdescriptionData;
		}
	    public boolean clickDescriptionTextBox()
		{
		try{
			WebElement clickDescriptionTextBoxWebEelement=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(AddDescriptionTextBoxx_path));
			clickDescriptionTextBoxWebEelement.click();
		Thread.sleep(5000);
			return true;
		}
		catch(Exception ex){
			return false;
		}

		}
	    
		
		public String verifyMessageOnDescriptionMandatory(String messageOnDescriptionMandatory)
	    {
	    try{
	       WebElement descriptionMandatoryWebEelement=new WebDriverWait(driver,10)
	       .until(ExpectedConditions.visibilityOfElementLocated(DescriptionMandatorymsgx_path));
	       
	      String actualMsgFromAPP= descriptionMandatoryWebEelement.getText();
	      if(actualMsgFromAPP.equalsIgnoreCase(messageOnDescriptionMandatory))
	      {
	       return actualMsgFromAPP;
	      }
	       
	    }
	    catch(Exception ex){
	     
	    }
	 return messageOnDescriptionMandatory;
	    }
		public String addValueToDecimalPrecisionTextBox(String decimalprecisionData)
		{
		try{
			WebElement decimalprecisionTextBoxWebEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(AddDecimalPrecisionTextBoxx_path));
			decimalprecisionTextBoxWebEelement.clear();
			decimalprecisionTextBoxWebEelement.sendKeys(decimalprecisionData);
			
		}
		catch(Exception ex){
	
	 }
		return decimalprecisionData;

		}
		public boolean clickDecimalPrecisionTextBox()
		{
		try{
			WebElement clickDecimalPrecisionTextBoxWebEelement=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(AddDecimalPrecisionTextBoxx_path));
			clickDecimalPrecisionTextBoxWebEelement.click();
			clickDecimalPrecisionTextBoxWebEelement.clear();
		Thread.sleep(5000);
			return true;
		}
		catch(Exception ex){
			return false;
		}

		}
		public String verifyMessageOnDecimalPrecisionMandatory(String messageOnDecimalPrecisionMandatory)
	    {
	    try{
	       WebElement decimalPrecisionMandatoryWebEelement=new WebDriverWait(driver,10)
	       .until(ExpectedConditions.visibilityOfElementLocated(DecimalPrecisionMandatorymsgx_path));
	       
	      String actualMsgFromAPP= decimalPrecisionMandatoryWebEelement.getText();
	      if(actualMsgFromAPP.equalsIgnoreCase(messageOnDecimalPrecisionMandatory))
	      {
	       return actualMsgFromAPP;
	      }
	       
	    }
	    catch(Exception ex){
	     
	    }
	 return messageOnDecimalPrecisionMandatory;
	    }
		public String verifyMessageOnDecimalPrecisionLength(String messageOnDecimalPrecisionLength)
	    {
	    try{
	       WebElement SaveOnAddCurrencyWebEelement=new WebDriverWait(driver,10)
	       .until(ExpectedConditions.visibilityOfElementLocated(InvalidPrecisionRangemsgx_path));
	       
	      String actualMsgFromAPP= SaveOnAddCurrencyWebEelement.getText();
	      if(actualMsgFromAPP.equalsIgnoreCase(messageOnDecimalPrecisionLength))
	      {
	       return actualMsgFromAPP;
	      }
	       
	    }
	    catch(Exception ex){
	     
	    }
	 return messageOnDecimalPrecisionLength;
	    }
		public String verifyMessageOnDecimalPrecisionInvalid(String messageOnDecimalPrecisionInvalid)
	    {
	    try{
	       WebElement SaveOnAddCurrencyWebEelement=new WebDriverWait(driver,10)
	       .until(ExpectedConditions.visibilityOfElementLocated(InvalidPrecisionmsgx_path));
	       
	      String actualMsgFromAPP= SaveOnAddCurrencyWebEelement.getText();
	      if(actualMsgFromAPP.equalsIgnoreCase(messageOnDecimalPrecisionInvalid))
	      {
	       return actualMsgFromAPP;
	      }
	       
	    }
	    catch(Exception ex){
	     
	    }
	 return messageOnDecimalPrecisionInvalid;
	    }
		
	    public String verifyMessageOnCurrencyCodeAfterSave(String messageOnCurrencyCode)
	    {
	    try{
	       WebElement SaveOnAddCurrencyWebEelement=new WebDriverWait(driver,10)
	       .until(ExpectedConditions.visibilityOfElementLocated(AddSuccessmsgx_path));
	       
	      String actualMsgFromAPP= SaveOnAddCurrencyWebEelement.getText();
	      if(actualMsgFromAPP.equalsIgnoreCase(messageOnCurrencyCode))
	      {
	       return actualMsgFromAPP;
	      }
	       
	    }
	    catch(Exception ex){
	     
	    }
	 return messageOnCurrencyCode;
	    }
	    public boolean VerifyMainSearchTextBox()
		{
			try{
			
			WebElement menuSearchWebelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(MainSearchx_path));
			menuSearchWebelement.isDisplayed();
			Thread.sleep(2000);
			
			return true;
		}
		catch(Exception ex){
			return false;
		}
	    
}
	    public String addValueToMainSearchTextBox(String mainsearchData)
		{
		try{
			WebElement mainSearchTextBoxWebEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(MainSearchx_path));
			mainSearchTextBoxWebEelement.click();
			mainSearchTextBoxWebEelement.clear();
			mainSearchTextBoxWebEelement.sendKeys(mainsearchData);			
		}
		catch(Exception ex){
	     return null;
	 }
		return mainsearchData;
	}
	    
	    public boolean ClickOnSerchedDataCheckBOx()
		{
		try{
			WebElement searcheddataWebEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(SearchDatax_path));
			
			searcheddataWebEelement.click();
			Thread.sleep(5000);
			return true;
		}
		catch(Exception ex){
			return false;
		}
		}
	    public boolean ClickOnEditButton()
		{
		try{
			WebElement editButtonWebEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(EnabledEditx_path));
			
			editButtonWebEelement.click();
			Thread.sleep(5000);
			return true;
		}
		catch(Exception ex){
			return false;
		}
		}
	    public boolean VerifyHeaderOfEdit(String editcurrencycodeHeader)	
		{
			   try{
				WebElement HeadereditWebEelement=new WebDriverWait(driver,100)
					.until(ExpectedConditions.visibilityOfElementLocated(CurrencyCodeEditHeaderx_path));
				String actual = HeadereditWebEelement.getText().trim();
				
				if (actual.equals(editcurrencycodeHeader))
					return true;
				else
					return false;

			} catch (Exception e) {
				return false;
			}
		}
	    
	    public String verifyMessageOnCurrencyCodeAfterEdit(String editmessageOnCurrencyCode)
	    {
	    try{
	       WebElement saveOnEditCurrencyWebEelement=new WebDriverWait(driver,10)
	       .until(ExpectedConditions.visibilityOfElementLocated(EditSuccessmsgx_path));
	       
	      String actualMsgFromAPP= saveOnEditCurrencyWebEelement.getText();
	      if(actualMsgFromAPP.equalsIgnoreCase(editmessageOnCurrencyCode))
	      {
	       return actualMsgFromAPP;
	      }
	       
	    }
	    catch(Exception ex){
	     
	    }
	 return editmessageOnCurrencyCode;
	    }
	    public boolean ClickOnDeleteButton()
		{
		try{
			WebElement deleteButtonWebEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(EnabledDeletex_path));
			
			deleteButtonWebEelement.click();
			Thread.sleep(2000);
			return true;
		}
		catch(Exception ex){
			return false;
		}
		}
	    public String verifyMessageOnCurrencyCodeAfterDelete(String messageOnCurrencyCode)
	    {
	    try{
	       WebElement deleteOnCurrencyWebEelement=new WebDriverWait(driver,10)
	       .until(ExpectedConditions.visibilityOfElementLocated(DeleteSuccessmsgx_path));
	       
	      String actualMsgFromAPP= deleteOnCurrencyWebEelement.getText();
	      if(actualMsgFromAPP.equalsIgnoreCase(messageOnCurrencyCode))
	      {
	       return actualMsgFromAPP;
	      }
	       
	    }
	    catch(Exception ex){
	     
	    }
	 return messageOnCurrencyCode;
	    }
	    public boolean deleteButtonWarningPopUpHeader()
       	{
       	try{
       	    Thread.sleep(3000);
       		WebElement deleteButtonWebEelement=new WebDriverWait(driver,10)
       		.until(ExpectedConditions.visibilityOfElementLocated(DeleteButtonPopUpHeaderx_path));
       		deleteButtonWebEelement.isDisplayed();
       		return true;
       	}
       	catch(Exception ex){
       		return false;
       	}

       	}
        
        public boolean deleteButtonYes()
       	{
       	try{
       		WebElement deleteButtonWebEelement=new WebDriverWait(driver,10)
       		.until(ExpectedConditions.visibilityOfElementLocated(DeleteYesx_path));
       		deleteButtonWebEelement.isDisplayed();
       		return true;
       	}
       	catch(Exception ex){
       		return false;
       	}

       	} 
        public boolean deleteButtonNo()
       	{
       	try{
       		WebElement deleteButtonWebEelement=new WebDriverWait(driver,10)
       		.until(ExpectedConditions.visibilityOfElementLocated(DeleteNox_path));
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
       		.until(ExpectedConditions.visibilityOfElementLocated(DeleteNox_path));
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
       		.until(ExpectedConditions.visibilityOfElementLocated(DeleteYesx_path));
       		deleteButtonWebEelement.click();
       		return true;
       	}
       	catch(Exception ex){
       		return false;
       	}
       	}
        public boolean currencyCodeClick()
       	{
       	try{
       		WebElement clickcurrencyWebEelement=new WebDriverWait(driver,10)
       		.until(ExpectedConditions.visibilityOfElementLocated(ClickCurrencyCodex_path));
       		clickcurrencyWebEelement.click();
       		return true;
       	}
       	catch(Exception ex){
       		return false;
       	}
       	}
        public String verifyMessageOnSeedCurrencyUpdate(String messageSeedCurrency)
	    {
	    try{
	       WebElement updateSeedWebEelement=new WebDriverWait(driver,10)
	       .until(ExpectedConditions.visibilityOfElementLocated(SeedUpdateMsgx_path));
	       
	      String actualMsgFromAPP= updateSeedWebEelement.getText();
	      if(actualMsgFromAPP.equalsIgnoreCase(messageSeedCurrency))
	      {
	       return actualMsgFromAPP;
	      }
	       
	    }
	    catch(Exception ex){
	     
	    }
	 return messageSeedCurrency;
	    }
        public boolean ClickOnExportIcon()
		{
			try{
					
		    WebElement exportWebelement=new WebDriverWait(driver,100)
		    .until(ExpectedConditions.visibilityOfElementLocated(Export_xpath));
		    exportWebelement.click();
			Thread.sleep(2000);
					
			return true;
		}
				
			catch(Exception ex){
			return false;
			}
		}
        public boolean ExportHeaderVerify(String exportHeader)
    	{
    	 
    	try{
    		WebElement exportHeaderWebEelement=new WebDriverWait(driver,100)
    			.until(ExpectedConditions.visibilityOfElementLocated(ExportHeaderx_path));
    		String actual = exportHeaderWebEelement.getText().trim();
    		if (actual.equals(exportHeader))
    			return true;
    		else
    			return false;

    	} catch (Exception e) {
    		return false;
    	}
    }
        public boolean VerifyCrossIconOnExport()
    	{
    		try{
    		
    		WebElement crossIconWebelement=new WebDriverWait(driver,100)
    		.until(ExpectedConditions.visibilityOfElementLocated(CrossIconExportx_path));
    		crossIconWebelement.isDisplayed();
    		Thread.sleep(2000);
    		
    		return true;
    	}
    	catch(Exception ex){
    		return false;
    	}
    		
    	}
        public boolean ClickOnExportCrossIcon()
		{
			try{
					
		    WebElement clickcrossWebelement=new WebDriverWait(driver,100)
		    .until(ExpectedConditions.visibilityOfElementLocated(CrossIconExportx_path));
		    clickcrossWebelement.click();
			Thread.sleep(2000);
					
			return true;
		}
				
			catch(Exception ex){
			return false;
			}
		}
        public boolean VerifyExportButtonOnPopUp()
    	{
    		try{
    		
    		WebElement exportIconWebelement=new WebDriverWait(driver,100)
    		.until(ExpectedConditions.visibilityOfElementLocated(ExportButtonPopUpx_path));
    		exportIconWebelement.isDisplayed();
    		Thread.sleep(2000);
    		
    		return true;
    	}
    	catch(Exception ex){
    		return false;
    	}
    		
    	}
        public boolean ClickOnExportButtonOnPopUp()
		{
			try{
					
		    WebElement clickExportWebelement=new WebDriverWait(driver,100)
		    .until(ExpectedConditions.visibilityOfElementLocated(ExportButtonPopUpx_path));
		    clickExportWebelement.click();
			Thread.sleep(2000);
					
			return true;
		}
				
			catch(Exception ex){
			return false;
			}
		}
        public boolean CurrencyCheckBoxInExportPopUp()
       	{
       	try{
       		WebElement currencyCheckBoxWebEelement=new WebDriverWait(driver,100)
       		.until(ExpectedConditions.visibilityOfElementLocated(CurrencyCheckBoxExportx_path));
       		currencyCheckBoxWebEelement.isDisplayed();
       		Thread.sleep(2000);
       		return true;
       	}
       	catch(Exception ex){
       		return false;
       	}

       	} 
        public boolean ClickCurrencyCheckBoxInExportPopUp()
       	{
       	try{
       		WebElement clickcurrencyCheckBoxWebEelement=new WebDriverWait(driver,100)
       		.until(ExpectedConditions.visibilityOfElementLocated(CurrencyCheckBoxExportx_path));
       		clickcurrencyCheckBoxWebEelement.click();
       		Thread.sleep(2000);
       		return true;
       	}
       	catch(Exception ex){
       		return false;
       	}

       	} 
        public boolean DescriptionCheckBoxInExportPopUp()
       	{
       	try{
       		WebElement descriptionCheckBoxWebEelement=new WebDriverWait(driver,100)
       		.until(ExpectedConditions.visibilityOfElementLocated(DescriptionCheckBoxExportx_path));
       		descriptionCheckBoxWebEelement.isDisplayed();
       		Thread.sleep(2000);
       		return true;
       	}
       	catch(Exception ex){
       		return false;
       	}

       	}  
        public boolean PrecisionCheckBoxInExportPopUp()
       	{
       	try{
       		WebElement precisionCheckBoxWebEelement=new WebDriverWait(driver,100)
       		.until(ExpectedConditions.visibilityOfElementLocated(DecimalPrecisionCheckBoxExportx_path));
       		precisionCheckBoxWebEelement.isDisplayed();
       		Thread.sleep(2000);
       		return true;
       	}
       	catch(Exception ex){
       		return false;
       	}

       	}
        public boolean MainSearchFetchedData()
       	{
       	try{
       		WebElement dataserchWebEelement=new WebDriverWait(driver,100)
       		.until(ExpectedConditions.visibilityOfElementLocated(SearcheDataMainSeachx_path));
       		dataserchWebEelement.isDisplayed();
       		Thread.sleep(2000);
       		return true;
       	}
       	catch(Exception ex){
       		return false;
       	}

       	}
        public boolean ClickOnCancelInSeach()
       	{
       	try{
       		WebElement clickcurrencyCheckBoxWebEelement=new WebDriverWait(driver,100)
       		.until(ExpectedConditions.visibilityOfElementLocated(SearchCancelx_path));
       		clickcurrencyCheckBoxWebEelement.click();
       		Thread.sleep(2000);
       		return true;
       	}
       	catch(Exception ex){
       		return false;
       	}

       	} 
        
        public boolean SearchCurrency()
       	{
       	try{
       		WebElement serachCurrencyWebEelement=new WebDriverWait(driver,100)
       		.until(ExpectedConditions.visibilityOfElementLocated(CurrencySearchx_path));
       		serachCurrencyWebEelement.isDisplayed();
       		Thread.sleep(2000);
       		return true;
       	}
       	catch(Exception ex){
       		return false;
       	}

       	}
        public String addValueToCurrencySearchTextBox(String currencySearchData)
		{
		try{
			WebElement currencySearchTextBoxWebEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(CurrencySearchx_path));
			currencySearchTextBoxWebEelement.click();
			currencySearchTextBoxWebEelement.clear();
			currencySearchTextBoxWebEelement.sendKeys(currencySearchData);
			Thread.sleep(5000);
			
		}
		catch(Exception ex){
	
	 }
		return currencySearchData;

		}
        public boolean CurrencySearchFetchedData()
       	{
       	try{
       		WebElement dataserchWebEelement=new WebDriverWait(driver,100)
       		.until(ExpectedConditions.visibilityOfElementLocated(SearcheDataMainSeachx_path));
       		dataserchWebEelement.isDisplayed();
       		Thread.sleep(2000);
       		return true;
       	}
       	catch(Exception ex){
       		return false;
       	}

       	}
        public boolean SearchDescription()
       	{
       	try{
       		WebElement serachDescriptionWebEelement=new WebDriverWait(driver,100)
       		.until(ExpectedConditions.visibilityOfElementLocated(DescriptionSearchx_path));
       		serachDescriptionWebEelement.isDisplayed();
       		Thread.sleep(2000);
       		return true;
       	}
       	catch(Exception ex){
       		return false;
       	}

       	}
        
        public String addValueToDescriptionSearchTextBox(String descriptionSearchData)
		{
		try{
			WebElement serachDescriptionTextBoxWebEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(DescriptionSearchx_path));
			serachDescriptionTextBoxWebEelement.click();
			serachDescriptionTextBoxWebEelement.clear();
			serachDescriptionTextBoxWebEelement.sendKeys(descriptionSearchData);
			Thread.sleep(5000);
			
		}
		catch(Exception ex){
	
	 }
		return descriptionSearchData;

		}
        
        
        public String addValueToDescriptionSearchTextBox2(String descriptionSearchData)
		{
		try{
			WebElement serachDescriptionTextBoxWebEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(MainSearchx_path));
			serachDescriptionTextBoxWebEelement.click();
			serachDescriptionTextBoxWebEelement.clear();
			serachDescriptionTextBoxWebEelement.sendKeys(descriptionSearchData);
			Thread.sleep(5000);
			
		}
		catch(Exception ex){
	
	 }
		return descriptionSearchData;

		}
        
        
        
        public boolean DescriptionSearchFetchedData()
       	{
       	try{
       		WebElement dataserchWebEelement=new WebDriverWait(driver,100)
       		.until(ExpectedConditions.visibilityOfElementLocated(SearchedDescriptionDatax_path));
       		dataserchWebEelement.isDisplayed();
       		Thread.sleep(2000);
       		return true;
       	}
       	catch(Exception ex){
       		return false;
       	}

       	}
        public boolean SearchPrecision()
       	{
       	try{
       		WebElement serachPrecisionWebEelement=new WebDriverWait(driver,100)
       		.until(ExpectedConditions.visibilityOfElementLocated(PrecisionSearchx_path));
       		serachPrecisionWebEelement.isDisplayed();
       		Thread.sleep(2000);
       		return true;
       	}
       	catch(Exception ex){
       		return false;
       	}

       	}
        public String addValueToPrecisionSearchTextBox(String precisionSearchData)
		{
		try{
			WebElement serachprecisionTextBoxWebEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(PrecisionSearchx_path));
			serachprecisionTextBoxWebEelement.click();
			serachprecisionTextBoxWebEelement.clear();
			serachprecisionTextBoxWebEelement.sendKeys(precisionSearchData);
			Thread.sleep(5000);
			
		}
		catch(Exception ex){
			
		}
	  return precisionSearchData;
	
		
		}
        public boolean PrecisionSearchFetchedData()
       	{
       	try{
       		WebElement dataserchWebEelement=new WebDriverWait(driver,100)
       		.until(ExpectedConditions.visibilityOfElementLocated(SearchedPrecisionDatax_path));
       		dataserchWebEelement.isDisplayed();
       		Thread.sleep(2000);
       		return true;
       	}
       	catch(Exception ex){
       		return false;
       	}

       	}
        public boolean CurrencySort()
       	{
       	try{
       		WebElement currencySortWebEelement=new WebDriverWait(driver,100)
       		.until(ExpectedConditions.visibilityOfElementLocated(CurrencySortx_path));
       		currencySortWebEelement.isDisplayed();
       		Thread.sleep(2000);
       		return true;
       	}
       	catch(Exception ex){
       		return false;
       	}

       	}
        /*public boolean CurrencySortClick()
       	{
       	try{
       		WebElement currencyUpSortWebEelement=new WebDriverWait(driver,100)
       		.until(ExpectedConditions.visibilityOfElementLocated(CurrencySortx_path));
       		currencyUpSortWebEelement.click();
       		Thread.sleep(2000);
       		return true;
       	}
       	catch(Exception ex){
       		return false;
       	}

       	} */
        public boolean DescriptionSort()
       	{
       	try{
       		WebElement descriptionSortWebEelement=new WebDriverWait(driver,100)
       		.until(ExpectedConditions.visibilityOfElementLocated(DescriptionSortx_path));
       		descriptionSortWebEelement.isDisplayed();
       		Thread.sleep(2000);
       		return true;
       	}
       	catch(Exception ex){
       		return false;
       	}

       	}
        public boolean PrecisionSort()
       	{
       	try{
       		WebElement precisionSortWebEelement=new WebDriverWait(driver,100)
       		.until(ExpectedConditions.visibilityOfElementLocated(PrecisionSortx_path));
       		precisionSortWebEelement.isDisplayed();
       		Thread.sleep(2000);
       		return true;
       	}
       	catch(Exception ex){
       		return false;
       	}

       	}
}

				
				
	