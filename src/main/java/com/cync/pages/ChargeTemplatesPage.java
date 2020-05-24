package com.cync.pages;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.cync.base.BasePage;

public class ChargeTemplatesPage extends BasePage {
	
	private final By chargecodecolumn_xpath=By.xpath("//div[contains(text(),'Charge Code')]");

	private final By chargeCodeColumnDropdown_xpath=By.xpath("(//select[@name='charge_code_id'])[1]");
	private final By selectChargeCodeColumnDropdown_xpath=By.xpath("(//select[@name='charge_code_id'])[2]");
	private final By natSigncolumn_xpath=By.xpath("//div[contains(text(),'Nat Sign')]");
	private final By natSignColumnDropdown_xpath=By.xpath("(//select[@name='natural_sign'])[1]");
	private final By selectNatSignColumnDropdown_xpath=By.xpath("(//select[@name='natural_sign'])[2]");

	private final By facilityFeeCheckbox=By.xpath("(//input[@class='cbox '])[6]");
	private final By Sequencecolumn_xpath=By.xpath("//div[contains(text(),'Sequence')]");
	private final By valueTextBox_xpath=By.xpath("//input[@name='charge_value']");
	private final By sequenceTextBox_xpath=By.xpath("//input[@name='sequence']");
	private final By saveIcon_xpath=By.xpath("//td[@title='Save Record']");

	private final By deleteIcon_xpath=By.xpath("//span[@class='ui-icon ui-icon-trash']");
	private final By reloadIcon_xpath=By.xpath("//span[@class='ui-icon ui-icon-refresh']");
	private final By addIcon_xpath=By.xpath("//span[@class='ui-icon ui-icon ui-icon-plus']");
	private final By cancelIcon_xpath=By.xpath("//span[@class='ui-icon ui-icon ui-icon-cancel']");
	private final By exportIcon_xpath=By.xpath("(//div[@class='ui-pg-div'])[6]");
	private final By paginationNext_xpath=By.xpath("//span[@class='ui-icon ui-icon-seek-next']");
	private final By paginationLast_xpath=By.xpath("//span[@class='ui-icon ui-icon-seek-end']");
	private final By paginationPrevious_xpath=By.xpath("//span[@class='ui-icon ui-icon-seek-prev']");
	private final By paginationFirst_xpath=By.xpath("//span[@class='ui-icon ui-icon-seek-first']");
	private final By pageTextbox_xpath=By.xpath("//input[@class='ui-pg-input ui-corner-all']");
	private final By frequencycolumn_xpath=By.xpath("//div[contains(text(),'Frequency')]");
	private final By frequencyDropdown_xpath=By.xpath("(//select[@name='frequency'])[1]");
	private final By selectFrequencyDropdown_xpath=By.xpath("(//select[@name='frequency'])[2]");
	private final By chargecolumn_xpath=By.xpath("//div[contains(text(),'Charge Type')]");
	private final By chargeDropdown_xpath=By.xpath("(//select[@name='charge_type'])[1]");
	private final By selectChargeDropdown_xpath=By.xpath("(//select[@name='charge_type'])[2]");

	/*private final By collateralNamecolumn_xpath=By.xpath("//div[@id='jqgh_charge_templates_list_collateral_type']");*/

	private final By collateralNamecolumn_xpath=By.xpath("(//select[@name='collateral_type'])[1]");

	private final By collateralNameDropdown_xpath=By.xpath("//select[@name='collateral_type']");
	private final By selectCollateralNameDropdown_xpath=By.xpath("//select[@id='jqg3_collateral_type']");

	private final By valuecolumn_xpath=By.xpath("//div[contains(text(),'Value')]");
	private final By inBalancecolumn_xpath=By.xpath("//div[contains(text(),'In Balance?')]");
	private final By accrueToLoancolumn_xpath=By.xpath("//div[contains(text(),'Accrued To Loan?')]");
	private final By lateFeeLink_xpath=By.xpath("//a[contains(text(),'Late Fee')]");
	private final By lateFeeLinkInvoiceFreq_xpath=By.xpath("//label[contains(text(),'Invoice frequency')]");
	private final By lateFeeLinkInvoiceFreqDropdown_xpath=By.xpath("//select[@id='parameter_invoice_frequency']");
	private final By lateFeeLinkPastDueDays_xpath=By.xpath("//label[contains(text(),'Past due days')]");
	private final By lateFeeLinkAsCheckbox_xpath=By.xpath("//label[contains(text(),'Late Fee as % ?')]");
	private final By lateFeeLinkPercentageField_xpath=By.xpath("//label[contains(text(),'Late Fee %')]");
	private final By lateFeeLinkAmountField_xpath=By.xpath("//label[contains(text(),'Late fee amount')]");
	private final By lateFeeLinkSaveButton_xpath=By.xpath("//input[@id='parameter_submit']");
	private final By lateFeeLinkCancelButton_xpath=By.xpath("//button[@class='view-button cancel_btn']");
	private final By lateFeeLinkCloseButton_xpath=By.xpath("//button[@class='ui-dialog-titlebar-close']");
	private final By lateFeeLinkEdit_xpath=By.xpath("//a[contains(text(),'Edit')]");
	private final By accuredLoanCheckbox=By.xpath("//input[@name='accrued_to_loan']");
	private final By InBalanceCheckbox=By.xpath("//input[@name='add_to_balance']");
	private final By errorMsg_xpath=By.xpath("//div[text()='Sequence must be less than or equal to 999']");
	private final By closeBtnVerify_xpath = By.id("closedialog");
	private final By interestCheckbox=By.xpath("(//input[@class='cbox '])[5]");

	private final By Checkbox=By.xpath("(//input[@role='checkbox'])[6]");
	private final By pageRecords_xpath=By.xpath("//select[contains(@title,'Records per Page')]");
	private final By exportHeader_xpath=By.xpath("//label[contains(text(),'Charge Templates')]");
	private final By exportButtonPopUp_xpath=By.xpath("//div[@class='export']");
	private final By crossIconPopUp_xpath=By.xpath("//button[@class='ui-dialog-titlebar-close']");
	private final By deletePopUpClose_xpath=By.xpath("//a[contains(text(),'Close')]");
	private final By chargeCodesExportCheckbox_xpath=By.xpath("(//input[@id='export_cols'])[1]");
	private final By natSignExportCheckbox_xpath=By.xpath("(//input[@id='export_cols'])[2]");
	private final By sequenceExportCheckbox_xpath=By.xpath("(//input[@id='export_cols'])[3]");
	private final By frequencyExportCheckbox_xpath=By.xpath("(//input[@id='export_cols'])[4]");
	private final By chargeTypeExportCheckbox_xpath=By.xpath("(//input[@id='export_cols'])[5]");
	private final By collateralNameCheckbox_xpath=By.xpath("(//input[@id='export_cols'])[6]");
	private final By valueExportCheckbox_xpath=By.xpath("(//input[@id='export_cols'])[7]");
	private final By inBalanceExportCheckbox_xpath=By.xpath("(//input[@id='export_cols'])[8]");
	private final By accrueToLoanCheckbox_xpath=By.xpath("(//input[@id='export_cols'])[9]");
     private final By chargeCodesFieldMandatory_xpath=By.xpath("//label[contains(text(),'Charge Code')]");
	  private final By natSignFieldMandatory_xpath=By.xpath("//label[contains(text(),'Nat Sign')]");
	  private final By sequenceField_xpath=By.xpath("//label[contains(text(),'Sequence')]");
	  private final By frequencyFieldMandatory_xpath=By.xpath("//label[contains(text(),'Frequency')]");   
	    private final By chargeTypeFieldMandatory_xpath=By.xpath("//label[contains(text(),'Charge Type')]");  
	    private final By collateralNameField_xpath=By.xpath("//label[contains(text(),'Collateral Name')]");   
	    private final By valueField_xpath=By.xpath("//label[contains(text(),'Value')]");
	    private final By inBalanceFieldExportCheckbox_xpath=By.xpath("//label[contains(text(),' In Balance ?')]");
		private final By accrueToLoanExportCheckbox_xpath=By.xpath("//label[contains(text(),' Accrued To Loan')]");
	    
	    private final By exportButtonInPopUp_xpath=By.xpath("//div[@class='export']");
	    private final By deletebuttonpopup_xpath=By.xpath("//td[contains(text(),'Delete selected record(s)?')]");
	    private final By delete_xpath=By.xpath("//a[contains(text(),'Delete')]");
		private final By deleteCancel_xpath=By.xpath("//a[contains(text(),'Cancel')]");
		private final By SuccessMessage_xpath=By.xpath("//div[contains(text(),'Charge Template was successfully deleted.')]");
		private final By selectAllCheckBox_xpath=By.xpath("cb_charge_templates_list");
	  
		
		private final By errorMsgCloseBTN_xpath = By.xpath("//a[@id='closedialog']");
		private final By closeBTNDeletepopup_xpath = By.xpath("(//a[@class='ui-jqdialog-titlebar-close ui-corner-all'])[1]");
		private final By closeBTNExporpopup_xpath = By.xpath("//button[@class='ui-dialog-titlebar-close']");
	    

	
	public ChargeTemplatesPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
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
	
	public boolean chargeCodeColumnUIValidation()
	{

	    	try{


		WebElement chargeCodeValidationWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(chargecodecolumn_xpath));
		chargeCodeValidationWebEelement.isDisplayed();
		return true;
	}
	catch(Exception ex){
		return false;
	}

	}
	
	public boolean chargeCodesDropdown_UIValidation()
	{
	try{
			 
		WebElement dropdown = driver.findElement(chargeCodeColumnDropdown_xpath);  
		  dropdown.click();
		  //Thread.sleep(4000);
		  Select select = new Select(dropdown);  
		

		 List<WebElement> options = select.getOptions(); 
		   int iSize = options.size();
		   for(int i =0; i<iSize ; i++){
				String sValue = options.get(i).getText();
				System.out.println(sValue);
				}
		   
	return true;
	}
	catch(Exception ex){
		return false;
	}
	}
	

public boolean selectFromChargeCodeDropdown(String visibleText) throws InterruptedException{
		
		try {
			WebElement DropdownWebEelement = new WebDriverWait(driver, 10)
			.until(ExpectedConditions.visibilityOfElementLocated(selectChargeCodeColumnDropdown_xpath));
			DropdownWebEelement.click();
			Select sel = new Select(DropdownWebEelement);
			sel.selectByVisibleText(visibleText);
			/*List<WebElement> list = sel.getOptions();
			
			for (WebElement ele : list) 
			{
				String data = ele.getText();
				System.out.println(data);
				
				if (ele.getText().equals(visibleText)) 
				{
			 		ele.click();
					
					 return true;
				}
			}*/
			
		} 
		catch (Exception ex)
		{
			return false;
		}
		
		return true;
		}

	

	public boolean natSignColumnUIValidation()
	{
	try{
		WebElement chargeCodeValidationWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(natSigncolumn_xpath));
		chargeCodeValidationWebEelement.isDisplayed();
		return true;
	}
	catch(Exception ex){
		return false;
	}

	}
	
	public boolean natSignDropdown_UIValidation()
	{
	try{
			 
		WebElement dropdown = driver.findElement(natSignColumnDropdown_xpath);  
		  dropdown.click();
		  Select select = new Select(dropdown);  
		  

		  List<WebElement> options = select.getOptions(); 
		   int iSize = options.size();
		   for(int i =0; i<iSize ; i++){
				String sValue = options.get(i).getText();
				System.out.println(sValue);
				}
	   
	return true;
	}
	catch(Exception ex){
		return false;
	}
	}
	
	public boolean DoubleClickOnFacilityFeeChargeCodeCheckbox()
	{
		try{
		
		WebElement element=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(facilityFeeCheckbox));
		//Double click
		Actions action = new Actions(driver);
		action.doubleClick(element).build().perform();
		Thread.sleep(1000);
		
		return true;
		}
		catch(Exception ex){
			return false;
		}
	}
	
public boolean selectFromNatSignDropdown(String visibleText) throws InterruptedException{
		
		try {
			WebElement DropdownWebEelement = new WebDriverWait(driver, 10)

			.until(ExpectedConditions.visibilityOfElementLocated(selectNatSignColumnDropdown_xpath));
			DropdownWebEelement.click();
			
			Select sel = new Select(DropdownWebEelement);
			sel.selectByVisibleText(visibleText);
			/*List<WebElement> list = sel.getOptions();
			
			for (WebElement ele : list) 
			{
				String data = ele.getText();
				System.out.println(data);
				
				if (ele.getText().equals(visibleText)) 
				{
			 		ele.click();
					
					 return true;
				}
			}*/
		} 
		catch (Exception ex)
		{

		
		return false;
		}
		return true;
}


public boolean addToValueTextbox(String value)
{
try{
	WebElement texttWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(valueTextBox_xpath));
	texttWebEelement.clear();
	texttWebEelement.sendKeys(value);
	
	return true;
}
catch(Exception ex){
	return false;	
}
}

public boolean clickOnSave()
{
try{

	WebElement editWebEelement=new WebDriverWait(driver,10)
	.until(ExpectedConditions.visibilityOfElementLocated(saveIcon_xpath));
	editWebEelement.click();
	Thread.sleep(1000);
	return true;
}
catch(Exception ex){
	return false;
}

}

public boolean ClickErrorMsgCloseBTN()
{
 
try{
	WebElement CloseBTNWebEelement=new WebDriverWait(driver,10)
	.until(ExpectedConditions.visibilityOfElementLocated(errorMsgCloseBTN_xpath));
	CloseBTNWebEelement.click();
	return true;
} catch (Exception e) {
	return false;
} }

		
	public boolean sequenceColumnUIValidation()
	{
	try{
		WebElement chargeCodeValidationWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(Sequencecolumn_xpath));
		chargeCodeValidationWebEelement.isDisplayed();
		return true;
	}
	catch(Exception ex){
		return false;
	}

	}
	
	
	public boolean frequencyColumnUIValidation()
	{
	try{
		WebElement chargeCodeValidationWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(frequencycolumn_xpath));
		chargeCodeValidationWebEelement.isDisplayed();
		return true;
	}
	catch(Exception ex){
		return false;
	}

	}
	
	
	public boolean frequencyDropdown_UIValidation()
	{
	try{
			 
		WebElement dropdown = driver.findElement(frequencyDropdown_xpath);  
		  dropdown.click();
		  //Thread.sleep(4000);
		  Select select = new Select(dropdown);  

		   List<WebElement> options = select.getOptions(); 
		   int iSize = options.size();
		   for(int i =0; i<iSize ; i++){
				String sValue = options.get(i).getText();
				System.out.println(sValue);
				}
		   
	return true;
	}
	catch(Exception ex){
		return false;
	}
	}
	

public boolean selectFromfrequencyDropdown(String visibleText) throws InterruptedException{
		
		try {
			WebElement DropdownWebEelement = new WebDriverWait(driver, 10)
			.until(ExpectedConditions.visibilityOfElementLocated(selectFrequencyDropdown_xpath));
			DropdownWebEelement.click();
			Select sel = new Select(DropdownWebEelement);
			sel.selectByVisibleText(visibleText);
			
			/*List<WebElement> list = sel.getOptions();
			
			for (WebElement ele : list) 
			{
				String data = ele.getText();
				System.out.println(data);
				
				if (ele.getText().equals(visibleText)) 
				{
			 		ele.click();
					
					 return true;
				}
			}*/
		} 
		catch (Exception ex)
		{
			return false;
		}
		
		return true;
		}
	

	
	public boolean chargeTypeColumnUIValidation()
	{
	try{
		WebElement chargeCodeValidationWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(chargecolumn_xpath));
		chargeCodeValidationWebEelement.isDisplayed();
		return true;
	}
	catch(Exception ex){
		return false;
	}

	}
	
	
	public boolean chargeTypeDropdown_UIValidation()
	{
	try{
			 
		WebElement dropdown = driver.findElement(chargeDropdown_xpath);  
		  dropdown.click();
		  //Thread.sleep(4000);
		  Select select = new Select(dropdown);  

		   List<WebElement> options = select.getOptions(); 
		   int iSize = options.size();
		   for(int i =0; i<iSize ; i++){
				String sValue = options.get(i).getText();
				System.out.println(sValue);
				}
		   
	return true;
	}
	catch(Exception ex){
		return false;
	}
	}
	

	
public boolean selectFromChargeTypeDropdown(String visibleText) throws InterruptedException{
		
		try {
			WebElement DropdownWebEelement = new WebDriverWait(driver, 10)
			.until(ExpectedConditions.visibilityOfElementLocated(selectChargeDropdown_xpath));
			DropdownWebEelement.click();
			Select sel = new Select(DropdownWebEelement);
			sel.selectByVisibleText(visibleText);
			/*List<WebElement> list = sel.getOptions();
			
			for (WebElement ele : list) 
			{
				String data = ele.getText();
				System.out.println(data);
				
				if (ele.getText().equals(visibleText)) 
				{
			 		ele.click();
					
					 return true;
				}
			}*/
		} 
		catch (Exception ex)
		{
			return false;
		}
		
		return true;
		}
	
	

	public boolean collateralNameColumnUIValidation()
	{
	try{
		WebElement chargeCodeValidationWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(collateralNamecolumn_xpath));
		chargeCodeValidationWebEelement.isDisplayed();
		return true;
	}
	catch(Exception ex){
		return false;
	}

	}
	
	
	public boolean collateralNameDropdown_UIValidation()
	{
	try{
			 
		WebElement dropdown = driver.findElement(collateralNameDropdown_xpath);  
		  dropdown.click();
		  ///Thread.sleep(4000);
		  Select select = new Select(dropdown);  

		   List<WebElement> options = select.getOptions(); 
		   int iSize = options.size();
		   for(int i =0; i<iSize ; i++){
				String sValue = options.get(i).getText();
				System.out.println(sValue);
				}
		   
	return true;
	}
	catch(Exception ex){
		return false;
	}
	}
	

	
public boolean selectFromCollateralNameDropdown(String visibleText) throws InterruptedException{
		
		try {
			WebElement DropdownWebEelement = new WebDriverWait(driver, 10)
			.until(ExpectedConditions.visibilityOfElementLocated(selectCollateralNameDropdown_xpath));
			DropdownWebEelement.click();
			Select sel = new Select(DropdownWebEelement);
			sel.selectByVisibleText(visibleText);
			/*List<WebElement> list = sel.getOptions();
			
			for (WebElement ele : list) 
			{
				String data = ele.getText();
				System.out.println(data);
				
				if (ele.getText().equals(visibleText)) 
				{
			 		ele.click();
					
					 return true;
				}
			}*/
		} 
		catch (Exception ex)
		{
			return false;
		}
		
		return true;
		}
	
	

	public boolean valueColumnUIValidation()
	{
	try{
		WebElement chargeCodeValidationWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(valuecolumn_xpath));
		chargeCodeValidationWebEelement.isDisplayed();
		return true;
	}
	catch(Exception ex){
		return false;
	}

	}
	
	public boolean inBalanceColumnUIValidation()
	{
	try{
		WebElement chargeCodeValidationWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(inBalancecolumn_xpath));
		chargeCodeValidationWebEelement.isDisplayed();
		return true;
	}
	catch(Exception ex){
		return false;
	}

	}
	
	public boolean accrueToLoanColumnUIValidation()
	{
	try{
		Thread.sleep(500);
		WebElement chargeCodeValidationWebEelement=new WebDriverWait(driver,20)
		.until(ExpectedConditions.visibilityOfElementLocated(accrueToLoancolumn_xpath));
		chargeCodeValidationWebEelement.isDisplayed();
		return true;
	}
	catch(Exception ex){
		return false;
	}

	}
	
	public boolean verifylateFeeLink()
	{
	try{
		WebElement chargeCodeValidationWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(lateFeeLink_xpath));
		chargeCodeValidationWebEelement.isDisplayed();
		return true;
	}
	catch(Exception ex){
		return false;
	}

	}
	
	public boolean lateFeeLinkUIValidation_invoicefrequencyField()
	{
	try{
		WebElement chargeCodeValidationWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(lateFeeLinkInvoiceFreq_xpath));
		chargeCodeValidationWebEelement.isDisplayed();
		return true;
	}
	catch(Exception ex){
		return false;
	}

	}
	
	public boolean lateFeeLinkUIValidation_invoicefrequencyDropdown()
	{
	try{
		WebElement chargeCodeValidationWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(lateFeeLinkInvoiceFreqDropdown_xpath));
		chargeCodeValidationWebEelement.isDisplayed();
		return true;
	}
	catch(Exception ex){
		return false;
	}

	}
	
	public boolean lateFeeLinkUIValidation_PastDueDaysField()
	{
	try{
		WebElement chargeCodeValidationWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(lateFeeLinkPastDueDays_xpath));
		chargeCodeValidationWebEelement.isDisplayed();
		return true;
	}
	catch(Exception ex){
		return false;
	}

	}
	
	
	public boolean lateFeeLinkUIValidation_LateFeeAsCheckbox()
	{
	try{
		WebElement chargeCodeValidationWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(lateFeeLinkAsCheckbox_xpath));
		chargeCodeValidationWebEelement.isDisplayed();
		return true;
	}
	catch(Exception ex){
		return false;
	}

	}
	
	public boolean lateFeeLinkUIValidation_LateFeePercentageField()
	{
	try{
		WebElement chargeCodeValidationWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(lateFeeLinkPercentageField_xpath));
		chargeCodeValidationWebEelement.isDisplayed();
		return true;
	}
	catch(Exception ex){
		return false;
	}

	}
	
	
	public boolean lateFeeLinkUIValidation_LateFeeAmountField()
	{
	try{
		WebElement chargeCodeValidationWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(lateFeeLinkAmountField_xpath));
		chargeCodeValidationWebEelement.isDisplayed();
		return true;
	}
	catch(Exception ex){
		return false;
	}

	}
	
	
	public boolean lateFeeLinkUIValidation_SaveButton()
	{
	try{
		WebElement chargeCodeValidationWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(lateFeeLinkSaveButton_xpath));
		chargeCodeValidationWebEelement.isDisplayed();
		return true;
	}
	catch(Exception ex){
		return false;
	}

	}
	
	
	public boolean lateFeeLinkUIValidation_CancelButton()
	{
	try{
		WebElement chargeCodeValidationWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(lateFeeLinkCancelButton_xpath));
		chargeCodeValidationWebEelement.isDisplayed();
		return true;
	}
	catch(Exception ex){
		return false;
	}

	}

	public boolean lateFeeLinkUIValidation_CloseButton()
	{
	try{
		WebElement chargeCodeValidationWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(lateFeeLinkCloseButton_xpath));
		chargeCodeValidationWebEelement.isDisplayed();
		return true;
	}
	catch(Exception ex){
		return false;
	}

	}
	
	public boolean clickOnlateFeeLink()
	{
	try{
		WebElement chargeCodeValidationWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(lateFeeLink_xpath));
		chargeCodeValidationWebEelement.click();
		return true;
	}
	catch(Exception ex){
		return false;
	}

	}
	
	public boolean clickOnEditlateFeeLink()
	{
	try{
		WebElement chargeCodeValidationWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(lateFeeLinkEdit_xpath));
		chargeCodeValidationWebEelement.click();
		return true;
	}
	catch(Exception ex){
		return false;
	}

	}
	
	public boolean clickOnAccuruedLoanCheckbox()
	{
	try{
		WebElement editWebEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(accuredLoanCheckbox));
		editWebEelement.click();
		return true;
	}
	catch(Exception ex){
		return false;	
	}
	}
	
	
	public boolean deselectInBalanceCheckbox(boolean flag){
        try {
           WebDriverWait wait = new WebDriverWait(driver, 60);
           
           wait.until(ExpectedConditions.visibilityOfElementLocated(InBalanceCheckbox));
           
           WebElement element = driver.findElement((InBalanceCheckbox));
           if(flag){
            if(!element.isSelected() == false){
             element.click();
             Thread.sleep(10000);
            }
           }else if(!flag){
            if(element.isSelected() == false){
             element.click();
             Thread.sleep(1000);

            }
           }   
          } catch (Exception e) {
           System.out.println("Exception in clickOnCheckBox Method "+e.getCause());
          }
       return flag; 
      }
	

	
	
	public boolean clickOnInBalanceCheckbox()
	{
	try{
		WebElement editWebEelement=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(InBalanceCheckbox));
		editWebEelement.click();
		return true;
	}
	catch(Exception ex){
		return false;	
	}
	}
	


	public String verifyErrorMessage(String msg){
		try{
			
			WebElement errorMessageWebE=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(errorMsg_xpath));
			String actual_msg=errorMessageWebE.getText().trim();
			
			if(actual_msg.equals(msg));
		}
		catch(Exception ex){
		}
		return msg;
		}
	
	
	
	public boolean addToSequenceTextbox(String value)
	{
	try{
		WebElement texttWebEelement=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(sequenceTextBox_xpath));
		texttWebEelement.clear();
		texttWebEelement.sendKeys(value);
		
		return true;
	}
	catch(Exception ex){
		return false;	
	}
	}

	
	
	public boolean ClickOnClose()
	{
		try{
		
		WebElement closebtnWebelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(closeBtnVerify_xpath));
		closebtnWebelement.click();
		Thread.sleep(1000);
		
		return true;
		}
		catch(Exception ex){
			return false;	
		}
		}
	
	
	public boolean DoubleClickOnInterestChargeCodeCheckbox()
	{
		try{
		
		WebElement element=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(interestCheckbox));
		//Double click
		Actions action = new Actions(driver);
		action.doubleClick(element).build().perform();
		Thread.sleep(1000);
		
		return true;
		}
		catch(Exception ex){
			return false;	
		}
	}


	
	public boolean verifySaveIcon()
	{
	try{

		WebElement saveWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(saveIcon_xpath));
		saveWebEelement.isDisplayed();
		Thread.sleep(1000);
		return true;
	}
	catch(Exception ex){
		return false;
	}

	}
	
	public boolean verifyDeleteIcon()
	{
	try{

		WebElement deleteWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(deleteIcon_xpath));
		deleteWebEelement.isDisplayed();
		Thread.sleep(1000);
		return true;
	}
	catch(Exception ex){
		return false;
	}

	}
	
	public boolean verifyReloadIcon()
	{
	try{

		WebElement deleteWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(reloadIcon_xpath));
		deleteWebEelement.isDisplayed();
		Thread.sleep(1000);
		return true;
	}
	catch(Exception ex){
		return false;
	}

	}
	
	public boolean verifyAddIcon()
	{
	try{

		WebElement deleteWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(addIcon_xpath));
		deleteWebEelement.isDisplayed();
		Thread.sleep(1000);
		return true;
	}
	catch(Exception ex){
		return false;
	}

	}
	
	public boolean clickCloseBTNDeletepopup()
	{
	try{

		WebElement closeBTNWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(closeBTNDeletepopup_xpath));
		closeBTNWebEelement.click();
		Thread.sleep(1000);
		return true;
	}
	catch(Exception ex){
		return false;
	}

	}
	
	
	public boolean clickOnAddIcon()
	{
	try{

		WebElement addWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(addIcon_xpath));
		addWebEelement.click();
		Thread.sleep(1000);
		return true;
	}
	catch(Exception ex){
		return false;
	}

	}
	
	public boolean verifyCancelIcon()
	{
	try{

		WebElement deleteWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(cancelIcon_xpath));
		deleteWebEelement.isDisplayed();
		Thread.sleep(1000);
		return true;
	}
	catch(Exception ex){
		return false;
	}
	}
	
	public boolean clickOnCancelIcon()
	{
	try{

		WebElement deleteWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(cancelIcon_xpath));
		deleteWebEelement.isDisplayed();
		this.isAlertPresent();
		Thread.sleep(1000);
		return true;
	}
	catch(Exception ex){
		return false;
	}
	}
	
	public boolean clickOnReloadIcon()
	{
	try{

		WebElement deleteWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(reloadIcon_xpath));
		deleteWebEelement.click();
		this.isAlertPresent();
		Thread.sleep(2000);
		return true;
	}
	catch(Exception ex){
		return false;
	}

	}
	
	public boolean verifyExportIcon()
	{
	try{

		WebElement deleteWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(exportIcon_xpath));
		deleteWebEelement.isDisplayed();
		Thread.sleep(1000);
		this.isAlertPresent();
		Thread.sleep(1000);
		return true;
	}
	catch(Exception ex){
		return false;
	}

	}
	
	public boolean clickOnExportIcon()
	{
	try{

		WebElement deleteWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(exportIcon_xpath));
		deleteWebEelement.click();
		Thread.sleep(1000);
	    this.isAlertPresent();
	    Thread.sleep(1000);
		
		return true;
	}
	catch(Exception ex){
		return false;
	}

	}
	
	public boolean clickOnNextPaginationButton()
	{
	try{
		WebElement editWebEelement=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(paginationNext_xpath));
		editWebEelement.click();
		Thread.sleep(1000);
		return true;
	}
	catch(Exception ex){
			
	}
	return false;
	}
	
	
	public boolean clickOnLastPaginationButton()
	{
	try{
		WebElement editWebEelement=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(paginationLast_xpath));
		editWebEelement.click();
		Thread.sleep(1000);
		return true;
	}
	catch(Exception ex){
			
	}
	return false;
	}
	
	
	public boolean clickOnCloseExportpopup()
	{
	try{
		WebElement closeWebEelement=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(closeBTNExporpopup_xpath));
		closeWebEelement.click();
		Thread.sleep(1000);
		return true;
	}
	catch(Exception ex){
			
	}
	return false;
	}
	
	
	public boolean clickOnPreviousPaginationButton()
	{
	try{
		WebElement editWebEelement=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(paginationPrevious_xpath));
		editWebEelement.click();
		Thread.sleep(1000);
		return true;
	}
	catch(Exception ex){
			
	}
	return false;
	}
	
	public boolean clickOnFirstPaginationButton()
	{
	try{
		WebElement editWebEelement=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(paginationFirst_xpath));
		editWebEelement.click();
		Thread.sleep(1000);
		return true;
	}
	catch(Exception ex){
			
	}
	return false;
	}
	
	public boolean enterValueInPageTextbox(String pagenumber)
	{
	try{
		WebElement editWebEelement=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(pageTextbox_xpath));
		editWebEelement.sendKeys(pagenumber);
		editWebEelement.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		return true;
	}
	catch(Exception ex){
			
	}
	return false;
	}
	
	



public boolean pageRecordDropdown_UIValidation()
{
try{
		 
	WebElement dropdown = driver.findElement(pageRecords_xpath);  
	  dropdown.click();
	  //Thread.sleep(4000);
	  Select select = new Select(dropdown);  

	   List<WebElement> options = select.getOptions(); 
	   int iSize = options.size();
	   for(int i =0; i<iSize ; i++){
			String sValue = options.get(i).getText();
			System.out.println(sValue);
			}
	   
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
	
	public boolean  CollateralNameUIInExportPopUp()
	{
	try{
		WebElement exportButtonWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(collateralNameField_xpath));
		exportButtonWebEelement.isDisplayed();
		return true;
	}
	catch(Exception ex){
		return false;
	}

	}
	
	
	public boolean  InBalnceUIInExportPopUp()
	{
	try{
		WebElement exportButtonWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(inBalanceFieldExportCheckbox_xpath));
		exportButtonWebEelement.isDisplayed();
		return true;
	}
	catch(Exception ex){
		return false;
	}

	}
	
	public boolean  AccrueToLoanUIInExportPopUp()
	{
	try{
		WebElement exportButtonWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(accrueToLoanExportCheckbox_xpath));
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
	
	public boolean  CollateralNameCheckboxUIInExportPopUp()
	{
	try{
		WebElement exportButtonWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(collateralNameCheckbox_xpath));
		exportButtonWebEelement.isDisplayed();
		return true;
	}
	catch(Exception ex){
		return false;
	}

	}
	
	public boolean  InBalanceCheckboxUIInExportPopUp()
	{
	try{
		WebElement exportButtonWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(inBalanceExportCheckbox_xpath));
		exportButtonWebEelement.isDisplayed();
		return true;
	}
	catch(Exception ex){
		return false;
	}

	}
	
	public boolean  AccrueToLoanCheckboxUIInExportPopUp()
	{
	try{
		WebElement exportButtonWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(accrueToLoanCheckbox_xpath));
		exportButtonWebEelement.isDisplayed();
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
             Thread.sleep(1000);
            }
           }else if(!flag){
            if(element.isSelected() == true){
             element.click();
             Thread.sleep(1000);

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
             Thread.sleep(1000);
            }
           }else if(!flag){
            if(element.isSelected() == true){
             element.click();
             Thread.sleep(1000);

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
             Thread.sleep(1000);
            }
           }else if(!flag){
            if(element.isSelected() == true){
             element.click();
             Thread.sleep(1000);

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
             Thread.sleep(1000);
            }
           }else if(!flag){
            if(element.isSelected() == true){
             element.click();
             Thread.sleep(1000);

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
             Thread.sleep(1000);
            }
           }else if(!flag){
            if(element.isSelected() == true){
             element.click();
             Thread.sleep(1000);

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
             Thread.sleep(1000);
            }
           }else if(!flag){
            if(element.isSelected() == true){
             element.click();
             Thread.sleep(1000);

            }
           }   
          } catch (Exception e) {
           System.out.println("Exception in clickOnCheckBox Method "+e.getCause());
          }
       return flag; 
      }
	
	
	public boolean selectCollateralNameCheckboxOnexportPopUp(boolean flag){
        try {
           WebDriverWait wait = new WebDriverWait(driver, 60);
           
           wait.until(ExpectedConditions.visibilityOfElementLocated(collateralNameCheckbox_xpath));
           
           WebElement element = driver.findElement((collateralNameCheckbox_xpath));
           if(flag){
            if(!element.isSelected() == true){
             element.click();
             Thread.sleep(1000);
            }
           }else if(!flag){
            if(element.isSelected() == true){
             element.click();
             Thread.sleep(1000);

            }
           }   
          } catch (Exception e) {
           System.out.println("Exception in clickOnCheckBox Method "+e.getCause());
          }
       return flag; 
      }
	
	
	public boolean selectInBalanceCheckboxOnexportPopUp(boolean flag){
        try {
           WebDriverWait wait = new WebDriverWait(driver, 60);
           
           wait.until(ExpectedConditions.visibilityOfElementLocated(inBalanceExportCheckbox_xpath));
           
           WebElement element = driver.findElement((inBalanceExportCheckbox_xpath));
           if(flag){
            if(!element.isSelected() == true){
             element.click();
             Thread.sleep(1000);
            }
           }else if(!flag){
            if(element.isSelected() == true){
             element.click();
             Thread.sleep(1000);

            }
           }   
          } catch (Exception e) {
           System.out.println("Exception in clickOnCheckBox Method "+e.getCause());
          }
       return flag; 
      }
	
	
	
	public boolean selectAccrueToLoanCheckboxOnexportPopUp(boolean flag){
        try {
           WebDriverWait wait = new WebDriverWait(driver, 60);
           
           wait.until(ExpectedConditions.visibilityOfElementLocated(accrueToLoanCheckbox_xpath));
           
           WebElement element = driver.findElement((accrueToLoanCheckbox_xpath));
           if(flag){
            if(!element.isSelected() == true){
             element.click();
             Thread.sleep(1000);
            }
           }else if(!flag){
            if(element.isSelected() == true){
             element.click();
             Thread.sleep(1000);

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
	
	public boolean closeclickInDeletePopUp()
   	{
   	try{
   		WebElement exportButtonWebEelement=new WebDriverWait(driver,10)
   		.until(ExpectedConditions.visibilityOfElementLocated(deletePopUpClose_xpath));
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
   	Thread.sleep(1000);
   		WebElement exportButtonWebEelement=new WebDriverWait(driver,10)
   		.until(ExpectedConditions.visibilityOfElementLocated(exportButtonInPopUp_xpath));
   		Thread.sleep(1000);
   		exportButtonWebEelement.click();
   		return true;
   	}
   	catch(Exception ex){
   		return false;
   	}
   	}
   	
   	
   	public boolean doubleClickOnChargeCode()
	{
		try{
		
		WebElement element=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(interestCheckbox));
		//Double click
		Actions action = new Actions(driver);
		action.doubleClick(element).build().perform();
		Thread.sleep(1000);
		
		return true;
	}
	

	catch(Exception ex){
		return false;
	}
}
   	
   	public boolean clickOnCheckbox()
	{
		try{
		
		WebElement element=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(Checkbox));
		//Double click
		Actions action = new Actions(driver);
		action.doubleClick(element).build().perform();
		Thread.sleep(1000);
		
		return true;
	}
	

	catch(Exception ex){
		return false;
	}
}


   	public boolean deleteIconClick()
	{
	try{
	    //Thread.sleep(3000);
		WebElement deleteButtonWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(deleteIcon_xpath));
		deleteButtonWebEelement.click();
		return true;
	}
	catch(Exception ex){
		return false;
	}

	} 
   	
   	public boolean deleteButtonWarningPopUpHeader(String header)
   	{
   	try{
   	    
   		WebElement deleteButtonWebEelement=new WebDriverWait(driver,10)
   		.until(ExpectedConditions.visibilityOfElementLocated(deletebuttonpopup_xpath));
   		String actual_header=deleteButtonWebEelement.getText().trim();
		
		if(actual_header.equals(header))
		{
			System.out.println(actual_header);
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
   	
    public boolean deleteButtonUi()
	{
	try{
		WebElement deleteButtonWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(delete_xpath));
		deleteButtonWebEelement.isDisplayed();
		return true;
	}
	catch(Exception ex){
		return false;
	}

	} 
 
 public boolean deleteButtonCancelUi()
	{
	try{
		WebElement deleteButtonWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(deleteCancel_xpath));
		deleteButtonWebEelement.isDisplayed();
		return true;
	}
	catch(Exception ex){
		return false;
	}

	}   
 
 public boolean deleteButtonClick()
	{
	try{
		WebElement deleteButtonWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(delete_xpath));
		deleteButtonWebEelement.click();
		return true;
	}
	catch(Exception ex){
		return false;
	}

	}   
 
 
 public boolean deleteCancelClick()
	{
	try{
		WebElement deleteButtonWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(deleteCancel_xpath));
		deleteButtonWebEelement.click();
		return true;
	}
	catch(Exception ex){
		return false;
	}

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


 public boolean selectFromInvoiceFrequencyDropdown(String visibleText) throws InterruptedException{
 	
 	try {
 		WebElement DropdownWebEelement = new WebDriverWait(driver, 10)
 		.until(ExpectedConditions.visibilityOfElementLocated(lateFeeLinkInvoiceFreqDropdown_xpath));
 		DropdownWebEelement.click();
 		Select sel = new Select(DropdownWebEelement);
 		sel.selectByVisibleText(visibleText);
 		/*List<WebElement> list = sel.getOptions();
 		
 		for (WebElement ele : list) 
 		{
 			String data = ele.getText();
 			System.out.println(data);
 			
 			if (ele.getText().equals(visibleText)) 
 			{
 		 		ele.click();
 				
 				 return true;
 			}
 		}*/
 	} 
 	catch (Exception ex)
 	{
 		return false;
 	}
 	
 	return true;
 	}

 public boolean EnterLateFeeAmount(String LateFeeAmount)
 {
 	try{
 	
 	WebElement element=new WebDriverWait(driver,10)
 	.until(ExpectedConditions.visibilityOfElementLocated(lateFeeLinkAmountField_xpath));
 	element.sendKeys(LateFeeAmount);
 	return true;
 }

 	catch(Exception ex){
 		return false;
 	}
 }

 public boolean clickOnSave_LateFeePopUp() 
 {
 	try{
 	
 	WebElement element=new WebDriverWait(driver,10)
 	.until(ExpectedConditions.visibilityOfElementLocated(lateFeeLinkSaveButton_xpath));
 	element.click();
 	return true;
 }

 	catch(Exception ex){
 		return false;
 	}
 }

}
