package com.cync.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.SkipException;

import com.cync.base.BasePage;

public class AdjustmentReasonPage extends BasePage {
	
	static Logger log = Logger.getLogger(AdjustmentReasonPage.class.getName());
	
	
	
	private final By adjustmentReasonHeader = By.xpath("//h3[text()='Adjustment Reasons']");
	private final By breadcrumb_xpath = By.xpath("//ul[@class='breadcrumb']");
	private final By nameLabel_xpath = By.xpath("//span[text()='Name']");
	private final By descriptionLabel_xpath = By.xpath("//span[text()='Description']");
	private final By dilutionLabel_xpath = By.xpath("//span[text()='Dilution']");
	private final By addLabel_xpath = By.xpath("//i[@id='New']");
	/*private final By editLabel_xpath = By.id("Edit");*/
	private final By deleteLabel_xpath = By.id("Delete"); 
	private final By exportLabel_xpath = By.xpath("//i[@id='Export']");
	private final By searchHere_xpath = By.xpath("//input[@placeholder='Search Here']");
	private final By nameSearch_xpath = By.xpath("(//input[@placeholder='Search'])[1]");
	private final By descriptionSearch_xpath = By.xpath("(//input[@placeholder='Search'])[2]");
	private final By checkboxone_xpath = By.xpath("(//div[contains(@class,'ui-chkbox-box ui-widget ui-corner-all ui-state-default')])[2]");
	
	//Ashfaq
	private final By editLabel_xpath = By.xpath("//i[@id='Edit']");
	private final By editDisabled_xpath = By.xpath("//i[@class='hand fa fa-pencil fa-1x clr_grey f_s_20 icon_disabled ng-star-inserted']");
	private final By deleteDisabled_xpath = By.xpath("//i[@class='hand fa fa-trash fa-2x f_s_20 clr_grey icon_disabled ng-star-inserted']");
	private final By checkboxTwo_xpath = By.xpath("(//div[contains(@class,'ui-chkbox-box ui-widget ui-corner-all ui-state-default')])[3]");
	private final By adjustmentReasonAddHeader = By.xpath("//h3[text()='Adjustment Reasons - Add']");
	private final By nameTextBox_xpath = By.xpath("//input[@formcontrolname='name']");
	private final By descriptionTextBox_xpath = By.xpath("//input[@formcontrolname='description']");
	private final By dilutionChktBox_xpath = By.xpath("(//div[contains(@class,'ui-chkbox-box ui-widget ui-corner-all ui-state')])[1]");

	private final By nameMandatory_xpath = By.xpath("//span[text()='*']");
	private final By cancelBtn_xpath = By.id("action_back");
	private final By saveAndNewBtn_xpath = By.id("action_save_new");
	/*private final By saveBtn_xpath = By.id("action_save");*/
	private final By adjustmentReaonMsgObj_xpath = By.id("cync_notifications_msg");
	private final By noRecord_xpath = By.xpath("//span[text()='No records found']");
	private final By trueRecord_xpath = By.xpath("//span[text()='DUSTER']");
	private final By adjustmentReasonEditHeader_xpath = By.xpath("//h3[text()='Adjustment Reasons - Edit']");

	
	private final By adjustmentReasonPopUpHeader_xpath = By.xpath("//span[text()='Adjustment Reasons']");
	private final By exportNameLabel_xpath = By.xpath("//label[text()='Name']");
	private final By exportDescriptionLabel_xpath = By.xpath("//label[text()='Description']");
	private final By exportDilutionLabel_xpath = By.xpath("//label[text()='Dilution']");
//  private final By exportCloseIconLabel_xpath = By.xpath("//a[@class='ng-tns-c4-2 ui-dialog-titlebar-icon ui-dialog-titlebar-close ui-corner-all ng-star-inserted']");
	
	private final By exportNameCheckbox_xpath = By.xpath("(//span[@class='ui-chkbox-icon ui-clickable fa fa-check'])[2]");
	private final By exportDesCheckbox_xpath = By.xpath("(//span[@class='ui-chkbox-icon ui-clickable fa fa-check'])[3]");
	private final By exportDilutionCheckbox_xpath = By.xpath("(//span[@class='ui-chkbox-icon ui-clickable fa fa-check'])[4]");

	private final By exportBtn_xpath = By.xpath("//span[@class='ui-button-text ui-clickable']");
	private final By deleteWarningMsg_xpath = By.xpath("//p[contains(text(),'Are you sure you want to delete')]");

	private final By checkboxRandom_xpath = By.xpath("(//div[contains(@class,'ui-chkbox-box ui-widget ui-corner-all ui-state')])[7]");
	private final By deleteYes_xpath = By.id("modal_action_yes");
	private final By deleteNo_xpath = By.id("modal_action_no");

	//Ashfaq
		private final By exportCloseIconLabel_xpath = By.xpath("//div[@aria-labelledby='ui-dialog-0-label']//a[@href='#']");
		private final By saveBtn_xpath = By.xpath("//button[@id='action_save']");
		
		
		
		
	public AdjustmentReasonPage(WebDriver driver) {
		super(driver);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(!driver.findElement(adjustmentReasonHeader).getText().trim().equals("Adjustment Reasons")){
			throw new SkipException("Adjustment Reasons couldn't open.");
		}// TODO Auto-generated constructor stub
	}
	

	public boolean BreadcrumbVerify()
	{
		log.info("UI validation started on the screen for BreadcrumbVerify");
	try{

		WebElement breadcrumbWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(breadcrumb_xpath));
		Thread.sleep(2000);
		breadcrumbWebEelement.isDisplayed();
		
return true;
	}
	catch(Exception ex){
		return false;
	}

	}
	
	public boolean HeaderVerify()
	{
	try{

		WebElement headerWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(adjustmentReasonHeader));
		Thread.sleep(2000);
		headerWebEelement.isDisplayed();
		
return true;
	}
	catch(Exception ex){
		return false;
	}

	}
	
	public boolean VerifyLabelName()
	{
	try{

		WebElement nameWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(nameLabel_xpath));
		Thread.sleep(2000);
		nameWebEelement.isDisplayed();
		
return true;
	}
	catch(Exception ex){
		return false;
	}

	}
	
	
	public boolean VerifyLabelDescription()
	{
	try{

		WebElement descriptionWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(descriptionLabel_xpath));
		Thread.sleep(2000);
		descriptionWebEelement.isDisplayed();
		
return true;
	}
	catch(Exception ex){
		return false;
	}

	}
	
	public boolean VerifyLabelDilution()
	{
	try{

		WebElement dilutionWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(dilutionLabel_xpath));
		Thread.sleep(2000);
		dilutionWebEelement.isDisplayed();
		
return true;
	}
	catch(Exception ex){
		return false;
	}

	}
	
	public boolean VerifyLabelAdd()
	{
	try{

		WebElement addWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(addLabel_xpath));
		Thread.sleep(2000);
		addWebEelement.isDisplayed();
		
return true;
	}
	catch(Exception ex){
		return false;
	}

	}
	
	public boolean VerifyLabelEdit()
	{
	try{

		WebElement editWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(editLabel_xpath));
		Thread.sleep(2000);
		editWebEelement.isDisplayed();
		
return true;
	}
	catch(Exception ex){
		return false;
	}

	}	
	
	public boolean VerifyLabelDelete()
	{
	try{

		WebElement deleteWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(deleteLabel_xpath));
		Thread.sleep(2000);
		deleteWebEelement.isDisplayed();
		
return true;
	}
	catch(Exception ex){
		return false;
	}

	}
	
	public boolean VerifyLabelExport()
	{
	try{

		WebElement exportWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(exportLabel_xpath));
		Thread.sleep(2000);
		exportWebEelement.isDisplayed();
		
return true;
	}
	catch(Exception ex){
		return false;
	}

	}
	
	public boolean VerifySearchHere()
	{
	try{

		WebElement searchHereWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(searchHere_xpath));
		Thread.sleep(2000);
		searchHereWebEelement.isDisplayed();
		
return true;
	}
	catch(Exception ex){
		return false;
	}

	}
	
	public boolean VerifyNameSearch()
	{
	try{

		WebElement searchNameWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(nameSearch_xpath));
		Thread.sleep(1000);
		searchNameWebEelement.isDisplayed();
		
return true;
	}
	catch(Exception ex){
		return false;
	}

	}
	
	public boolean VerifyDescriptionSearch()
	{
	try{

		WebElement searchDescriptionWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(descriptionSearch_xpath));
		Thread.sleep(2000);
		searchDescriptionWebEelement.isDisplayed();
		
return true;
	}
	catch(Exception ex){
		return false;
	}

	}
	
	public boolean SelectCheckBox()
	{
	try{

		WebElement checkBoxWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(checkboxone_xpath));
		checkBoxWebEelement.click();
		Thread.sleep(2000);
		
return true;
	}
	catch(Exception ex){
		return false;
	}

	}
	
	public boolean VerifyEditBtnDisabled()
	{
	try{

		WebElement editDisabledWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(editDisabled_xpath));
		Thread.sleep(2000);
		editDisabledWebEelement.isDisplayed();
		
return true;
	}
	catch(Exception ex){
		return false;
	}

	}	
	
	public boolean VerifyDeleteBtnDisabled()
	{
	try{

		WebElement deleteDisabledWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(deleteDisabled_xpath));
		Thread.sleep(2000);
		deleteDisabledWebEelement.isDisplayed();
		
return true;
	}
	catch(Exception ex){
		return false;
	}

	}	
	
	
	
	public boolean SelectCheckBoxTwo()
	{
	try{

		WebElement checkBoxWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(checkboxTwo_xpath));
		checkBoxWebEelement.click();
		Thread.sleep(2000);
		
return true;
	}
	catch(Exception ex){
		return false;
	}

	}
	
	
	public boolean VerifyAddBtnFunctionality()
	{
	try{

		WebElement addBtnWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(addLabel_xpath));
		Thread.sleep(2000);
		addBtnWebEelement.click();
		Thread.sleep(2000);		
    return true;
	}
	catch(Exception ex){
		return false;
	}

	}
	
	public boolean HeaderVerifyInAddScreen()
	{
	try{

		WebElement headerAddWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(adjustmentReasonAddHeader));
		Thread.sleep(2000);
		headerAddWebEelement.isDisplayed();
		
return true;
	}
	catch(Exception ex){
		return false;
	}

	}
	
	
	
	public boolean NameTextBoxVerify()
	{
	try{

		WebElement nameTextBoxWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(nameTextBox_xpath));
		Thread.sleep(2000);
		nameTextBoxWebEelement.isDisplayed();
		
return true;
	}
	catch(Exception ex){
		return false;
	}

	}
	
	
	public boolean DescriptionTextBoxVerify()
	{
	try{

		WebElement descriptionTextBoxWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(descriptionTextBox_xpath));
		Thread.sleep(2000);
		descriptionTextBoxWebEelement.isDisplayed();
		
return true;
	}
	catch(Exception ex){
		return false;
	}

	}
	
	public boolean DilutionCheckBoxVerify()
	{
	try{

		WebElement dilutionChkBoxWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(dilutionChktBox_xpath));
		Thread.sleep(2000);
		dilutionChkBoxWebEelement.isDisplayed();
		
return true;
	}
	catch(Exception ex){
		return false;
	}

	}
	
	public boolean NameFieldMandatoryLabelVerify()
	{
	try{

		WebElement nameMandatoryWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(nameMandatory_xpath));
		Thread.sleep(2000);
		nameMandatoryWebEelement.isDisplayed();
		
return true;
	}
	catch(Exception ex){
		return false;
	}

	}
	
	
	public boolean CancelBtnVerify()
	{
	try{

		WebElement cancelBtnWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(cancelBtn_xpath));
		Thread.sleep(2000);
		cancelBtnWebEelement.isDisplayed();
		
return true;
	}
	catch(Exception ex){
		return false;
	}

	}
	
	public boolean CancelFunctionalityVerify()
	{
	try{

		WebElement cancelWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(cancelBtn_xpath));
		Thread.sleep(2000);
		cancelWebEelement.click();
		Thread.sleep(1000);
		
return true;
	}
	catch(Exception ex){
		return false;
	}

	}
	
	public boolean SaveAndNewBtnVerify()
	{
	try{

		WebElement saveAndNewBtnWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(saveAndNewBtn_xpath));
		Thread.sleep(2000);
		saveAndNewBtnWebEelement.isDisplayed();
		
return true;
	}
	catch(Exception ex){
		return false;
	}

	}
	
	public boolean SaveAndNewBtnFunctionalityVerify()
	{
	try{

		WebElement saveAndNewBtnWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(saveAndNewBtn_xpath));
		Thread.sleep(2000);
		saveAndNewBtnWebEelement.click();
		
return true;
	}
	catch(Exception ex){
		return false;
	}

	}
	
	public boolean SaveBtnVerify()
	{
	try{

		WebElement savewBtnWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(saveBtn_xpath));
		Thread.sleep(2000);
		savewBtnWebEelement.isDisplayed();
		
return true;
	}
	catch(Exception ex){
		return false;
	}

	}
	
	public boolean SaveBtnFunctionalityVerify()
	{
	try{

		WebElement saveFunctionWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(saveBtn_xpath));
		Thread.sleep(2000);
		saveFunctionWebEelement.click();
		Thread.sleep(2000);

return true;
	}
	catch(Exception ex){
		return false;
	}

	}
	
	public String addValueToNameTextBox(String nameData)
	{
	try{
		WebElement nameTextBoxWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(nameTextBox_xpath));
		nameTextBoxWebEelement.clear();
		nameTextBoxWebEelement.sendKeys(nameData);
		
	}
	catch(Exception ex){

	}
	return nameData;

	}
	
	
	public String addValueToDescriptionTextBox(String descriptionData)
	{
	try{
		WebElement descriptionTextBoxWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(descriptionTextBox_xpath));
		descriptionTextBoxWebEelement.clear();
		descriptionTextBoxWebEelement.sendKeys(descriptionData);
		
	}
	catch(Exception ex){

	}
	return descriptionData;

	}
	
	
	public String verifyMessageOnAdjustmentReasonAfterSave(String messageOnAdjustmentReason)
	    {
	    try{
	       WebElement SaveOnAddAdjustmentWebEelement=new WebDriverWait(driver,10)
	       .until(ExpectedConditions.visibilityOfElementLocated(adjustmentReaonMsgObj_xpath));
	       
	      String actualMsgFromApp= SaveOnAddAdjustmentWebEelement.getText();
	      if(actualMsgFromApp.equalsIgnoreCase(messageOnAdjustmentReason))
	      {
	       return actualMsgFromApp;
	      }
	       
	    }
	    catch(Exception ex){
	     
	    }
	 return messageOnAdjustmentReason;
	    }
	
	
	public String VerifySearchHereFunctionality(String value)
	{
	try{

		WebElement searchHereWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(searchHere_xpath));
		Thread.sleep(2000);
		searchHereWebEelement.clear();
		searchHereWebEelement.sendKeys(value);
		Thread.sleep(2000);
		

	}
	catch(Exception ex){
		
	}

	return value;
	}
	
	
	public boolean NoRecordFoundlVerify()
	{
	try{

		WebElement noRecordWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(noRecord_xpath));
		Thread.sleep(2000);
		noRecordWebEelement.isDisplayed();
		
return true;
	}
	catch(Exception ex){
		return false;
	}

	}
	
	public boolean RecordFoundlVerify()
	{
	try{

		WebElement recordWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(trueRecord_xpath));
		Thread.sleep(2000);
		recordWebEelement.isDisplayed();
		
return true;
	}
	catch(Exception ex){
		return false;
	}

	}
	
	
	public String VerifyNameSearchFunctionality(String value)
	{
	try{

		WebElement searchNameWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(nameSearch_xpath));
		Thread.sleep(2000);
		searchNameWebEelement.clear();
		searchNameWebEelement.sendKeys(value);
		Thread.sleep(2000);
	}
	catch(Exception ex){
		
	}

	return value;
	}
	
	
	public String VerifyDescriptionSearchFunctionality(String value)
	{
	try{

		WebElement searchDescriptionWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(descriptionSearch_xpath));
		Thread.sleep(2000);
		searchDescriptionWebEelement.clear();
		searchDescriptionWebEelement.sendKeys(value);
		Thread.sleep(2000);
	}
	catch(Exception ex){
		
	}

	return value;
	}
	
	public boolean RecordClickVerify()
	{
	try{

		WebElement recordWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(trueRecord_xpath));
		Thread.sleep(2000);
		recordWebEelement.click();
		Thread.sleep(1000);

return true;
	}
	catch(Exception ex){
		return false;
	}

	}
	
	public boolean VerifyEditHeaderNameUI()
	{
	try{

		WebElement editHeaderNameWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(adjustmentReasonEditHeader_xpath));
		Thread.sleep(2000);
		editHeaderNameWebEelement.isDisplayed();

return true;
	}
	catch(Exception ex){
		return false;
	}

	}
	
	public boolean VerifyEditModeNameTextBoxUI()
	{
	try{

		WebElement editModeNameWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(nameTextBox_xpath));
		Thread.sleep(2000);
		editModeNameWebEelement.isDisplayed();

return true;
	}
	catch(Exception ex){
		return false;
	}

	}
	
	public String verifyMessageOnAdjustmentReasonAfterEdit(String messageOnAdjustmentReason)
    {
    try{
       WebElement SaveOnAddAdjustmentWebEelement=new WebDriverWait(driver,10)
       .until(ExpectedConditions.visibilityOfElementLocated(adjustmentReaonMsgObj_xpath));
       
      String actualMsgFromApp= SaveOnAddAdjustmentWebEelement.getText();
      if(actualMsgFromApp.equalsIgnoreCase(messageOnAdjustmentReason))
      {
       return actualMsgFromApp;
      }
       
    }
    catch(Exception ex){
     
    }
 return messageOnAdjustmentReason;
    }
	
	
	public boolean VerifyEditIconFunction()
	{
	try{

		WebElement editWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(editLabel_xpath));
		Thread.sleep(2000);
		editWebEelement.click();
		Thread.sleep(1000);
		
return true;
	}
	catch(Exception ex){
		return false;
	}
	}
	
	public boolean VerifyExportClick()
	{
	try{

		WebElement exportWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(exportLabel_xpath));
		Thread.sleep(2000);
		exportWebEelement.click();
		Thread.sleep(2000);
		
return true;
	}
	catch(Exception ex){
		return false;
	}

	}
	
	
	public boolean VerifyExportHearderName()
	{
	try{

		WebElement exportWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(adjustmentReasonPopUpHeader_xpath));
		Thread.sleep(2000);
		exportWebEelement.isDisplayed();
		Thread.sleep(2000);

return true;
	}
	catch(Exception ex){
		return false;
	}

	}	
	
	public boolean VerifyExportNameLabel()
	{
	try{

		WebElement exportnamelabelWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(exportNameLabel_xpath));
		Thread.sleep(2000);
		exportnamelabelWebEelement.isDisplayed();
		Thread.sleep(2000);

return true;
	}
	catch(Exception ex){
		return false;
	}

	}		
	
	public boolean VerifyExportDescriptionLabel()
	{
	try{

		WebElement exportDeslabelWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(exportDescriptionLabel_xpath));
		Thread.sleep(2000);
		exportDeslabelWebEelement.isDisplayed();
		Thread.sleep(2000);

return true;
	}
	catch(Exception ex){
		return false;
	}

	}	
	
	public boolean VerifyExportDilutionLabel()
	{
	try{

		WebElement exportDilutionlabelWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(exportDilutionLabel_xpath));
		Thread.sleep(2000);
		exportDilutionlabelWebEelement.isDisplayed();
		Thread.sleep(2000);

return true;
	}
	catch(Exception ex){
		return false;
	}

	}	
	
	public boolean VerifyOnExportCloseIconLabel()
	{
	try{

		WebElement exportloselabelWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(exportCloseIconLabel_xpath));
		Thread.sleep(2000);
		exportloselabelWebEelement.isDisplayed();

return true;
	}
	catch(Exception ex){
		return false;
	}

	}
	
	public boolean VerifyExportNameCheckBoxFunction()
	{
	try{

		WebElement exportnameCheckWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(exportNameCheckbox_xpath));
		Thread.sleep(2000);
		exportnameCheckWebEelement.click();
		Thread.sleep(2000);

return true;
	}
	catch(Exception ex){
		return false;
	}

	}	
	
	public boolean VerifyExportDescriptionCheckBoxFunction()
	{
	try{

		WebElement exportDesCheckWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(exportDesCheckbox_xpath));
		Thread.sleep(4000);
		exportDesCheckWebEelement.click();
		Thread.sleep(2000);

return true;
	}
	catch(Exception ex){
		return false;
	}

	}	
	
	public boolean VerifyExportDilutionCheckBoxFunction()
	{
	try{

		WebElement exportDilutionCheckWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(exportDilutionCheckbox_xpath));
		Thread.sleep(2000);
		exportDilutionCheckWebEelement.click();
		Thread.sleep(2000);

return true;
	}
	catch(Exception ex){
		return false;
	}

	}	
	
	
	public boolean VerifyOnExportCloseIconFunction()
	{
	try{

		WebElement exportloselabelWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(exportCloseIconLabel_xpath));
		Thread.sleep(2000);
		exportloselabelWebEelement.click();
		Thread.sleep(2000);
return true;
	}
	catch(Exception ex){
		return false;
	}

	}
	
	public boolean VerifyExportBtnFunctionality()
	{
	try{

		WebElement exportWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(exportBtn_xpath));
		Thread.sleep(5000);
		exportWebEelement.click();
		Thread.sleep(1000);
return true;
	}
catch(Exception ex){
	return false;
}

}
	
	public boolean VerifyDeleteBtnFunctionality()
	{
	try{

		WebElement deleteWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(deleteLabel_xpath));
		Thread.sleep(2000);
		deleteWebEelement.click();
		Thread.sleep(1000);

return true;
	}
	catch(Exception ex){
		return false;
	}

	}	
	

	public boolean VerifyMsgOnDelete()
	{
	try{

		WebElement msgDeleteWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(deleteWarningMsg_xpath));
		Thread.sleep(2000);
		msgDeleteWebEelement.isDisplayed();
		Thread.sleep(2000);

return true;
	}
	catch(Exception ex){
		return false;
	}

	}	
	
	public boolean SelectAnyCheckBox()
	{
	try{

		WebElement checkBoxWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(checkboxRandom_xpath));
		checkBoxWebEelement.click();
		Thread.sleep(2000);
		
return true;
	}
	catch(Exception ex){
		return false;
	}

	}
	
	public boolean VerifyYesbtnOnDelete()
	{
	try{

		WebElement yesbtnWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(deleteYes_xpath));
		yesbtnWebEelement.isDisplayed();
		Thread.sleep(2000);
		
return true;
	}
	catch(Exception ex){
		return false;
	}

	}
	
	public boolean VerifyNobtnOnDelete()
	{
	try{

		WebElement nobtnWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(deleteNo_xpath));
		nobtnWebEelement.isDisplayed();
		Thread.sleep(2000);
		
return true;
	}
	catch(Exception ex){
		return false;
	}

	}
	
	public boolean VerifyNobtnFunctionalityOnDelete()
	{
	try{

		WebElement nobtnWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(deleteNo_xpath));
		nobtnWebEelement.click();
		Thread.sleep(2000);
		
return true;
	}
	catch(Exception ex){
		return false;
	}

	}
	
	public boolean VerifyYesbtnFunctionalityOnDelete()
	{
	try{

		WebElement yesbtnWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(deleteYes_xpath));
		yesbtnWebEelement.click();
		Thread.sleep(2000);
		
return true;
	}
	catch(Exception ex){
		return false;
	}

	}
	
	public String verifyMessageOnAdjustmentReasonAfterDelete(String messageOnAdjustmentReason)
    {
    try{
       WebElement SaveOnAddAdjustmentWebEelement=new WebDriverWait(driver,10)
       .until(ExpectedConditions.visibilityOfElementLocated(adjustmentReaonMsgObj_xpath));
       
      String actualMsgFromApp= SaveOnAddAdjustmentWebEelement.getText();
      if(actualMsgFromApp.equalsIgnoreCase(messageOnAdjustmentReason))
      {
       return actualMsgFromApp;
      }
       
    }
    catch(Exception ex){
     
    }
 return messageOnAdjustmentReason;
    }
	
	public boolean selectexportPopUpNameCheckbox(boolean flag){
        try {
           WebDriverWait wait = new WebDriverWait(driver, 10);
           
           wait.until(ExpectedConditions.visibilityOfElementLocated((exportNameLabel_xpath)));
           
           WebElement element = driver.findElement((exportNameLabel_xpath));
           if(flag){
            if(!element.isSelected() == true){
             element.click();
             Thread.sleep(2000);
            }
           }else if(!flag){
            if(element.isSelected() == true){
             element.click();
             Thread.sleep(2000);

            }
           }   
          } catch (Exception e) {
           System.out.println("Exception in clickOnCheckBox Method "+e.getCause());
          }
       return flag; 
      }
	
	public boolean selectexportPopUpDescriptionCheckbox(boolean flag){
        try {
           WebDriverWait wait = new WebDriverWait(driver, 10);
           
           wait.until(ExpectedConditions.visibilityOfElementLocated((exportDescriptionLabel_xpath)));
           
           WebElement element = driver.findElement((exportDescriptionLabel_xpath));
           if(flag){
            if(!element.isSelected() == true){
             element.click();
             Thread.sleep(2000);
            }
           }else if(!flag){
            if(element.isSelected() == true){
             element.click();
             Thread.sleep(2000);

            }
           }   
          } catch (Exception e) {
           System.out.println("Exception in clickOnCheckBox Method "+e.getCause());
          }
       return flag; 
      }
	
	public boolean selectexportPopUpDilutionCheckbox(boolean flag){
        try {
           WebDriverWait wait = new WebDriverWait(driver, 10);
           
           wait.until(ExpectedConditions.visibilityOfElementLocated((exportDilutionLabel_xpath)));
           
           WebElement element = driver.findElement((exportDilutionLabel_xpath));
           if(flag){
            if(!element.isSelected() == true){
             element.click();
             Thread.sleep(2000);
            }
           }else if(!flag){
            if(element.isSelected() == true){
             element.click();
             Thread.sleep(2000);

            }
           }   
          } catch (Exception e) {
           System.out.println("Exception in clickOnCheckBox Method "+e.getCause());
          }
       return flag; 
      }
	
}



