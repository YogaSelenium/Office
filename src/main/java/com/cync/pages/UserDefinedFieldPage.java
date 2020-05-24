package com.cync.pages;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;



import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.cync.base.BasePage;

public class UserDefinedFieldPage extends BasePage {
	static Logger log = Logger.getLogger(UserDefinedFieldPage.class.getName());
	
	private final By breadcrumb_xpath=By.xpath("//ul[@class='breadcrumb']");
	private final By userdefinedfieldTitle_xpath=By.xpath("//h3[text()='User Defined Field']");
	private final By userdefinitionbuttonlabel_xpath=By.xpath("//label[text()='UDF Definition ']");
	private final By udfmappinglabel_xpath=By.xpath("//label[text()='UDF Mapping']");
	private final By udfclienttransferlabel_xpath=By.xpath("//label[text()='UDF Client Transfer']");
	private final By udfdefinitiondefault_xpath=By.xpath("//span[@class='ui-radiobutton-icon ui-clickable fa fa-circle']");
	private final By addUdfsummary_xpath=By.id("New");
	private final By deletedisableUdfsummary_xpath=By.xpath("//i[@class='hand fa fa-trash fa-2x f_s_20 clr_grey icon_disabled operation_disabled ng-star-inserted']");
	private final By editdisableUdfsummary_xpath=By.xpath("//i[@class='hand fa fa-pencil fa-1x clr_grey f_s_20 icon_disabled operation_disabled ng-star-inserted']");
	private final By mastersearch_xpath=By.xpath("//input[@placeholder='Search Here']");
	private final By userDefinitionAdd_xpath=By.xpath("//h3[text()='UDF Definition - Add']");
	private final By fieldTypeDropdown_xpath=By.id("udf_field_type");
	private final By validationTypeDropdown_xpath=By.id("udf_validation_type");
	private final By statustoggleactive_xpath=By.xpath("//label[@class='switch']");
	private final By cancelUdfDefiniton_xpath=By.id("action_back");
	private final By udfNameTextField_xpath=By.id("udf_name");
	private final By udfDescriptiontextField_xpath=By.id("udf_description");
	private final By errorMessageForBlankUdfName_xpath=By.xpath("//small[text()='Enter UDF Name']");
	private final By errorMessageForBlankDescription_xpath=By.xpath("//small[text()='Enter Description']");
	private final By errorMessageForMaximumUdfName_xpath=By.xpath("//small[text()='Maximum length 100']");
	private final By saveUdfDefiniton_xpath=By.id("action_save");
	private final By udfNameSearchBox_xpath=By.xpath("(//input[@class='ui-column-filter ui-inputtext ui-widget ui-state-default ui-corner-all ng-star-inserted'])[1]");
	private final By udfSearchValue_xpath=By.xpath("(//span[@class='ui-cell-data ng-star-inserted'])[1]");
	private final By duplicateErrorMsg_xpath=By.xpath("//div[contains(text(),'Name has already been taken')]");
	private final By firstCheckBox_xpath=By.xpath("(//div[@class='ui-chkbox ui-widget'])[1]");
	//private final By delete_xpath=By.id("Delete");
	private final By delete_xpath=By.xpath("//div[@class='cync-grid-search row no-marg']/div[2]/i[3]");
	private final By yesDelete_xpath=By.xpath("//button[text()='Yes']");
	private final By statusInactive_xpath=By.xpath("(//span[@class='ui-cell-data ng-star-inserted'])[5]");
	private final By fixedLengthCheckbox_xpath=By.xpath("(//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default'])[1]");
	private final By maskedMinLengthForLength_xpath=By.xpath("(//input[@class='form-control ng-untouched ng-pristine'])[1]");
	private final By maskedMaxLengthForLength_xpath=By.xpath("(//input[@class='form-control ng-untouched ng-pristine'])[2]");
	private final By minLengthTextField_xpath=By.id("udf_min_length");
	private final By maxLengthTextField_xpath=By.id("udf_max_length");
	
	private final By UdfMappingRadioButton_xpath=By.xpath("(//div[@class='ui-radiobutton-box ui-widget ui-state-default'])[1]");
	//private final By udfselectionInUdfMapping_xpath=By.xpath("(//div[@class='display-inline-flex'])[1]");
	private final By selectDropdown_xpath=By.xpath("//select[@class='mapping-dropdown form-control ng-pristine ui-inputtext ui-corner-all ui-state-default ng-submitted ng-untouched ng-invalid']");
	private final By fixedLengthValue_xpath=By.id("udf_length_value");
	private final By disabledSave_xpath=By.xpath("//button[@id='action_save' and @disabled]");
	private final By errorMessageForZeroLengthValue_xpath=By.xpath("//small[text()='Minimum range  to enter is 1']");
	private final By mandatoryUdfValueInUdfMappingAdd_xpath=By.xpath("//label[@class='mandatory ng-star-inserted' and @for='udf_value']");
	private final By mandatoryFieldInUdfDefiniton_xpath=By.xpath("(//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default'])[1]");
	private final By firstCheckBoxOfMap_xpath=By.xpath("(//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default'])[2]");
	private final By selectProgramValueUdfMapping_xpath=By.xpath("//select[@class='mapping-dropdown form-control w-95 ng-untouched ng-pristine ng-invalid']");
	private final By selectSubValueInUDfMapping_xpath=By.xpath("(//select[@class='mapping-dropdown form-control ng-pristine ng-valid ui-inputtext ui-corner-all ui-state-default ng-submitted ng-untouched'])[1]");
	private final By entersubPrgmValueTextField_xpath=By.xpath("//input[@name='program_param_value']");
	private final By uniqueFieldMax_xpath=By.xpath("(//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default'])[3]");
	private final By udfValueFieldUdfmappingAdd_xpath=By.xpath("//input[@class='form-control ng-untouched ng-pristine ng-valid ng-star-inserted']");
	private final By errorForUniqueField_xpath=By.xpath("//div[contains(text(),'Validation failed: Udf is unique and can be attached to only one program')]");
    private final By successMsgForMapping_xpath=By.xpath("//div[contains(text(),'UDF Mapping saved successfully')]");
	private final By checkOnUpdatableField_xpath=By.xpath("(//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default'])[4]");
	private final By checkOnClientDetailsCheckBoxInUdfMapping_xpath=By.xpath("(//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default'])[2]");
	private final By editUdfMapping_xpath=By.id("Edit");
	private final By uniqueFieldRange=By.xpath("(//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default'])[2]");
	private final By successMsgForUpdatingMapping_xpath=By.xpath("//div[contains(text(),'UDF Mapping updated successfully')]");
	private final By saveAndNewInUdfDefintionAdd_xpath=By.xpath("//span[text()='Save & New']");
	private final By saveInUdfDefAdd_Xapth=By.xpath("//div[contains(text(),'Record Created Successfully')]");
	
	private final By uniqueFieldValueChkboxLength_xpath=By.xpath("(//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default'])[4]");
	private final By uniqueFieldValueTextField_xpath=By.xpath("//input[@class='unique_f_value_input form-control ng-untouched ng-pristine ng-invalid ng-star-inserted']");
	private final By errorMessageUniqueFieldValue_xpath=By.xpath("//small[text()='Enter Unique Field Value']");
	private final By disabledUDfValueInMap_xpath=By.xpath("//input[@class='form-control ng-untouched ng-pristine ng-valid ng-star-inserted' and @disabled]");
	private final By clickOnUpdatableFixedLength_xpath=By.xpath("(//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default'])[3]");
	private final By MinValueRange_xpath=By.id("udf_range_min_value");
	private final By MaxValueRange_xpath=By.id("udf_range_max_value");
	private final By valueMinRange_xpath=By.xpath("//small[text()='Enter Max Value']");
	private final By valueMaxRange_xpaath=By.xpath("//small[text()='Enter Min Value']");
	private final By udfClientCreation_xpath=By.xpath("//label[text()='UDFAutomation001']");
	private final By homeIcon=By.xpath("//img[@class='grayscale']");
	private final By random_xpath=By.xpath("(//span[@class='ui-cell-data ng-star-inserted'])[1]");
	private final By selectAllInMapping_xpath=By.xpath("(//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default'])[1]");
	private final By errorMessageForMaxMinRange_xpath=By.xpath("//div[contains(text(),'Max Value should be less than or equal to 9999999999, Min value must be less than Max value')]");
	private final By labelOrg_xpath=By.xpath("//label[text()='Original Amount']");
	private final By defsummaryLabel_xpath=By.xpath("//h3[text()='UDF Definition - Summary']");
	private final By lovValue_Xpath=By.xpath("//input[@formcontrolname='lov_value']");
	private final By descriptionLovValue_xpath=By.xpath("(//input[@formcontrolname='description'])[2]");
	private final By addLov_xpath=By.xpath("//i[@title='Add More']");
	private final By updatedDescriotion_xpath=By.xpath("(//input[@class='form-control ng-dirty ng-valid ng-touched' and @formcontrolname='description' ])[2]");
	private final By updatedLovValue_xpath=By.xpath("//input[@class='form-control ng-star-inserted ng-dirty ng-valid ng-touched']");
	private final By secondLovValueTextfield_xpath=By.xpath("(//input[@formcontrolname='lov_value'])[2]");
	private final By secondDescription_xpath=By.xpath("(//input[@formcontrolname='description'])[3]");
	private final By firstDefaultValue_xpath=By.xpath("(//span[@class='ui-chkbox-icon ui-clickable fa fa-check'])[1]");
	private final By secDefaultChBox_xpath=By.xpath("(//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default'])[1]");
	private final By sortByOrder_xpath=By.xpath("(//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default'])[2]");
	private final By udfValue_xpath=By.xpath("//select[@class='mapping-dropdown form-control ng-pristine ng-valid ui-inputtext ui-corner-all ui-state-default ng-submitted ng-untouched ng-star-inserted']");
	private final By errorMsgMappedUdf_xpath=By.xpath("//div[contains(text(),'UDF is attached with a program, can't Delete the UDF')]");
	
	
	private final By udfMappingSummary_xpath=By.xpath("//h3[text()='UDF Mapping - Summary']");
	private final By masterSearchMapping_xpath=By.id("globalSearch");
	private final By udfMappingAdd_xpath=By.xpath("//h3[text()='UDF Mapping - Add']");
	private final By secondSelctInMapping_xpath=By.xpath("(//select[@class='mapping-dropdown form-control ng-pristine ui-inputtext ui-corner-all ui-state-default ng-submitted ng-untouched ng-invalid'])[2]");
	private final By addIconInMapping_xpath=By.xpath("(//i[@class='fa fa-plus-square hand addrow-icon'])[1]");
	private final By addIconInPrgmMapping_xpath=By.xpath("(//i[@class='fa fa-plus-square hand addrow-icon'])[2]");
	private final By secPrgmDrpdown_xpath=By.xpath("//select[@class='mapping-dropdown form-control w-95 ng-untouched ng-pristine ng-invalid']");
	//private final By secDragElement_xpath=By.xpath("(//i[@class='fa fa-arrows ng-star-inserted'])[2]");
	//private final By firstDragElement_xpath=By.xpath("(//i[@class='fa fa-arrows ng-star-inserted'])[1]");
	
	private final By secDragElement_xpath=By.xpath("(//i[@class='fa fa-arrows ng-star-inserted'])[2]");
	private final By firstDragElement_xpath=By.xpath("(//i[@class='fa fa-arrows ng-star-inserted'])[1]");
	private final By bbcMgmtReportLabel_xpath=By.xpath("//span[text()='BBC Management Report']");
	private final By trendReportCheckBox_xpath=By.xpath("(//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default'])[3]");
	private final By thirdBox_xpath=By.xpath("(//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default'])[3]");
	
	private final By udfValuer_xpath=By.xpath("//select[@formcontrolname='udf_value']");
	private final By udfSecValu_xpath=By.xpath("//select[@class='mapping-dropdown form-control ng-pristine ui-inputtext ui-corner-all ui-state-default ng-submitted ng-untouched ng-invalid']");
	private final By firstCheckBoxOfReportMap_xpath=By.xpath("(//div[@class='ui-widget-header ui-corner-all ui-listbox-header ui-helper-clearfix ui-listbox-header-w-checkbox ng-star-inserted']/div)[2]");
	private final By secUdfValueTextField_xpath=By.xpath("//input[@class='form-control ng-untouched ng-pristine ng-star-inserted ng-invalid']");
	private final By mappingEditLabel_xpath=By.xpath("//h3[text()='UDF Mapping - Edit']");
    private final By exportMap_xpath=By.id("Export");
	private final By exportHeader_xpath=By.xpath("//span[text()='UDF Mapping - Summary']");
		
	private final By programSearch_xpath=By.xpath("(//input[@class='ui-column-filter ui-inputtext ui-widget ui-state-default ui-corner-all ng-star-inserted'])[2]");
    private final By disabledEditMap_xpath=By.xpath("//i[@class='hand fa fa-pencil fa-1x clr_grey f_s_20 icon_disabled operation_disabled']");
	private final By disabledDeleteMap_xpath=By.xpath("//i[@class='hand fa fa-trash fa-2x f_s_20 clr_grey icon_disabled operation_disabled']");
	private final By editUdff_xpath=By.xpath("//select[@class='mapping-dropdown form-control ng-pristine ng-valid ui-inputtext ui-corner-all ui-state-default ng-submitted ng-untouched']/option");
	
	
	private final By udfClientTransferRadioButton_xpath=By.xpath("(//div[@class='ui-radiobutton-box ui-widget ui-state-default'])[2]");
	private final By udfClientTransferLabel_xpath=By.xpath("//h3[text()='UDF Client Transfer']");
	private final By transferclientFromLabel_xpath=By.xpath("//span[text()='Transfer Clients From']");
	private final By transferClientsToLabel_xpath=By.xpath("//span[text()='Transfer Clients To']");
	private final By cancelUdfTransfer_xpath=By.id("action_back");
	private final By transferClientTransfer_xpath=By.id("action_cancel");
	private final By firstSelectUdf_xpath=By.xpath("(//select[@class='form-control ng-untouched ng-pristine ng-valid'])[1]");
	private final By udfValueTransferFrom_xpath=By.xpath("(//select[@class='form-control ng-untouched ng-pristine ng-valid'])[1]");
	private final By firstClient_xpath=By.xpath("(//span[@class='ng-star-inserted'])[3]");
	private final By firstClientInList_xpath=By.xpath("(//li[@class='ui-multiselect-item ui-corner-all ng-star-inserted'])[1]");
	private final By searchClientFrom_xpath=By.xpath("//input[@placeholder='Search Client']");
	private final By secClientMapping_xpath=By.xpath("(//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default'])[2]");
	private final By allcheckBocLabel_xpath=By.xpath("//label[text()='All']");
	private final By allByDefault_xpath=By.xpath("//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default ui-state-disabled']");
	private final By allCheckOn_xpath=By.xpath("(//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default'])[1]");
	private final By warningMsg_xpath=By.xpath("//small[text()='Select client, Press Ctrl key for selecting multiple Clients']");
	private final By selectUdfTransferTo_xpath=By.xpath("(//select[@class='form-control ng-untouched ng-pristine ng-valid'])[3]");
	private final By selectUdfTransferToAfterSelection_xpath=By.xpath("(//select[@class='form-control ng-untouched ng-pristine ng-valid'])[1]");
	private final By warningMessage_xpath=By.xpath("//p[text()='Transferring Client(s) will link them with a new level and all levels associated. Would you like to proceed?']");
	private final By transferNo_xpath=By.xpath("//button[text()='No']");
	
	public UserDefinedFieldPage(WebDriver driver) {
		super(driver);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public String breadCrumb(String userdefinedfieldBreadcrumb)
	{
		try{
			Thread.sleep(3000);
			WebElement breadcrumbWebEelement=new WebDriverWait(driver,40).until(ExpectedConditions.visibilityOfElementLocated(breadcrumb_xpath));
			breadcrumbWebEelement.isDisplayed();
		}
		catch(Exception ex){
			
		}
		return userdefinedfieldBreadcrumb;

		}
	
	public boolean userDefinedFieldTitle(){
	try{
		Thread.sleep(3000);
		WebElement userdefinedfieldTitleWebElement=new WebDriverWait(driver,40).until(ExpectedConditions.visibilityOfElementLocated(userdefinedfieldTitle_xpath));
		userdefinedfieldTitleWebElement.isDisplayed();
			return true;
	
	}
	catch(Exception e){
		
	}
	return false;
	
	}
	
	public boolean userDefinitionRadiobuttonUI(){
		try{
			Thread.sleep(3000);
			WebElement userdefinitionWebElement=new WebDriverWait(driver,40).until(ExpectedConditions.visibilityOfElementLocated(userdefinitionbuttonlabel_xpath));
			userdefinitionWebElement.isDisplayed();
			return true;
		}
		catch(Exception e){
			
		}
		return false;
		
		}
	
	public boolean udfMappingRadiobuttonUI(){
		try{
			Thread.sleep(3000);
			WebElement udfmappinglabelWebElement=new WebDriverWait(driver,40).until(ExpectedConditions.visibilityOfElementLocated(udfmappinglabel_xpath));
			udfmappinglabelWebElement.isDisplayed();
			return true;
		}
		catch(Exception e){
			
		}
		return false;
		
		}
	
	public boolean udfClienttransferRadiobuttonUI(){
		try{
			Thread.sleep(3000);
			WebElement udfclienttransferlabelWebElement=new WebDriverWait(driver,40).until(ExpectedConditions.visibilityOfElementLocated(udfclienttransferlabel_xpath));
			udfclienttransferlabelWebElement.isDisplayed();
			return true;
		}
		catch(Exception e){
			
		}
		return false;
		
		}
	
	public boolean udfDefinitionDefaultbutton(){
		try{
			Thread.sleep(3000);
			WebElement udfdefinitiondefaultWebElement=new WebDriverWait(driver,40).until(ExpectedConditions.visibilityOfElementLocated(udfdefinitiondefault_xpath));
			udfdefinitiondefaultWebElement.isSelected();
			return true;
		}
		catch(Exception e){
			
		}
		return false;
		
		}
	
	public boolean addEnabledUI(){
		try{
			Thread.sleep(3000);
			WebElement addUDFSummaryWebElement=new WebDriverWait(driver,40).until(ExpectedConditions.visibilityOfElementLocated(addUdfsummary_xpath));
			addUDFSummaryWebElement.isDisplayed();
			return true;
		}
		catch(Exception e){
			
		}
		return false;
		
		}
	
	public boolean editDisabledUI(){
		try{
			Thread.sleep(3000);
			WebElement editdisabledUDFSummaryWebElement=new WebDriverWait(driver,40).until(ExpectedConditions.visibilityOfElementLocated(editdisableUdfsummary_xpath));
			editdisabledUDFSummaryWebElement.isDisplayed();
			return true;
		}
		catch(Exception e){
			
		}
		return false;
	}
	
	public boolean deleteDisabledUI(){
		try{
			Thread.sleep(3000);
			WebElement deletedisabledUDFSummaryWebElement=new WebDriverWait(driver,40).until(ExpectedConditions.visibilityOfElementLocated(deletedisableUdfsummary_xpath));
			deletedisabledUDFSummaryWebElement.isDisplayed();
			return true;
		}
		catch(Exception e){
			
		}
		return false;
	}
	
	public boolean masterSearch(){
		try{
			Thread.sleep(3000);
			WebElement mastersearchUDFSummaryWebElement=new WebDriverWait(driver,40).until(ExpectedConditions.visibilityOfElementLocated(mastersearch_xpath));
			mastersearchUDFSummaryWebElement.isDisplayed();
			return true;
		}
		catch(Exception e){
			
		}
		return false;
	}
	
	public boolean clickOnAddInUdfdefinitionSummary(){
		try{
			Thread.sleep(5000);
			WebElement clickOnAddSummaryWebElement=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(addUdfsummary_xpath));
			clickOnAddSummaryWebElement.click();
			Thread.sleep(5000);
			return true;
			
		}
		catch(Exception e){
			
		}
		return false;
		
		}
	
	public boolean udfdefinitionaddtitle(){
		try{
			//Thread.sleep(3000);
			WebElement adddefinitiontitleWebElement=new WebDriverWait(driver,90).until(ExpectedConditions.visibilityOfElementLocated(userDefinitionAdd_xpath));
			adddefinitiontitleWebElement.isDisplayed();
			return true;
		}
		catch(Exception e){
			
		}
		return false;
	}
	
	public boolean  verifyFieldTypeDropdownValues(){
		 try {
			 Thread.sleep(4000);
		  String[] exp = {"Numeric","Alphanumeric"};
		  
		  WebElement dropdown = driver.findElement(fieldTypeDropdown_xpath);  
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
	
	public boolean  verifyValidationTypeDropdownValues(){
		 try {
			 Thread.sleep(5000);
		  String[] exp = {"Range","Length","LOV","None"};
		  
		  WebElement dropdown = driver.findElement(validationTypeDropdown_xpath);  
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
	
	public boolean  verifyValidationTypeDropdownValuesForAlphanumeric(){
		 try {
			 Thread.sleep(4000);
		  String[] exp = {"Length","LOV","None"};
		  
		  WebElement dropdown = driver.findElement(validationTypeDropdown_xpath);  
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
	
	public boolean statusToggleActive(){
		try{
			 //Thread.sleep(4000);
			WebElement activeStatusToggleWebElement=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(statustoggleactive_xpath));
			activeStatusToggleWebElement.isDisplayed();
			return true;
		}
		catch(Exception e){
			
		}
		return false;
	}
	
	public boolean cancelUdfDefiniton(){
		try{
			 //Thread.sleep(4000);
			WebElement cancelUdfDefinitonWebElement=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(cancelUdfDefiniton_xpath));
			cancelUdfDefinitonWebElement.isDisplayed();
			return true;
		}
		catch(Exception e){
			
		}
		return false;
	}
	public boolean clickOnCancelUdfDefiniton(){
		try{
			// Thread.sleep(4000);
			WebElement cancelUdfDefinitonWebElement=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(cancelUdfDefiniton_xpath));
			cancelUdfDefinitonWebElement.click();
			return true;
		}
		catch(Exception e){
			
		}
		return false;
	}
	public boolean clickOnUdfNameInUdfDefinitonAdd(){
		try{
			 //Thread.sleep(4000);
			WebElement udfNameWebElement=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(udfNameTextField_xpath));
			udfNameWebElement.click();
			return true;
		}
		catch(Exception e){
			
		}
		return false;
	}
	
	public boolean clickOnUdfDescriptionInUdfDefinitonAdd(){
		try{
			 //Thread.sleep(4000);
			WebElement udfDescriptionWebElement=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(udfDescriptiontextField_xpath));
			udfDescriptionWebElement.click();
			return true;
		}
		catch(Exception e){
			
		}
		return false;
	}
	
	public boolean verifyErrorMessageForUdfNameInUdfDefinitonAdd(){
		try{
			// Thread.sleep(4000);
			WebElement udfNameWebElement=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(errorMessageForBlankUdfName_xpath));
			udfNameWebElement.isDisplayed();
			return true;
		}
		catch(Exception e){
			
		}
		return false;
	}
	
	public boolean verifyErrorMessageForUdfDescriptionInUdfDefinitonAdd(){
		try{
			 //Thread.sleep(4000);
			WebElement udfDescriptionWebElement=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(errorMessageForBlankDescription_xpath));
			udfDescriptionWebElement.isDisplayed();
			return true;
		}
		catch(Exception e){
			
		}
		return false;
	}

	public boolean passValuesToUdfNameInUdfDefinitonAdd(String Udfname){
		try{
			// Thread.sleep(4000);
			WebElement udfNameWebElement=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(udfNameTextField_xpath));
			udfNameWebElement.sendKeys(Udfname);
			return true;
		}
		catch(Exception e){
			
		}
		return false;
	}

	public boolean verifyErrorMessageForMaximumInUdfDefinitonAdd(){
		try{
			 //Thread.sleep(4000);
			WebElement udfNameWebElement=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(errorMessageForMaximumUdfName_xpath));
			udfNameWebElement.isDisplayed();
			return true;
		}
		catch(Exception e){
			
		}
		return false;
	}


	public boolean passValueToUdfDescriptionInUdfDefinitonAdd(String UdfDescription){
		try{
			// Thread.sleep(4000);
			WebElement udfDescriptionWebElement=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(udfDescriptiontextField_xpath));
			udfDescriptionWebElement.sendKeys(UdfDescription);
			return true;
		}
		catch(Exception e){
			
		}
		return false;
	}
	
	


	
	
	public boolean udfNameC(String uniqueUdfName )
	{
		try{
			 //Thread.sleep(4000);
		
		WebElement udfNameWebElement=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(udfNameTextField_xpath));
		udfNameWebElement.sendKeys(uniqueUdfName);
		return true;
		}
		catch(Exception e){
			
		}
		return false;
	}
	public boolean duplicateudfName(String uniqueUdfName)
	{
		try{
			 //Thread.sleep(4000);
			WebElement udfNameWebElement=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(udfNameTextField_xpath));
			udfNameWebElement.sendKeys(uniqueUdfName);
		return true;
		}
		catch(Exception e){
			
		}
		return false;
	}

	
	public boolean udfDescription()
	{
		try{
			 //Thread.sleep(4000);
		String uniqueUdfDescription=generateRandomData(4);
		WebElement udfDescriptionWebElement=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(udfDescriptiontextField_xpath));
		udfDescriptionWebElement.sendKeys(uniqueUdfDescription);
		return true;
		}
		catch(Exception e){
			
		}
		return false;
	}
	
	private static String generateRandomData(int length) {
		// Generate random id, for example 283952-V8M32
	try {
		 Thread.sleep(4000);
		 String s="_g";
		char[] chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789abcdefghijklmnopqrstuvwxyz"
				.toCharArray();
		Random rnd = new Random();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < length; i++)
			sb.append(chars[rnd.nextInt(chars.length)]);
		
		return sb.toString()+s;
	} catch (Exception e) {
		
	}
		return null;
	}
	
	public boolean clickOnSave(){
		try{
			 //Thread.sleep(4000);
			WebElement saveWebElement=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(saveUdfDefiniton_xpath));
			saveWebElement.click();
			return true;
		}
		catch(Exception e){
			
		}
		return false;
	}
	
	public boolean clickOnUdfNameSearchBox(){
		try{
			Thread.sleep(2000);
			WebElement saveWebElement=new WebDriverWait(driver,1000).until(ExpectedConditions.visibilityOfElementLocated(udfNameSearchBox_xpath));
			saveWebElement.click();
			return true;
		}
		catch(Exception e){
			
		}
		return false;
	}
	public boolean sendKeysToUdfNameSearchBox(String uniqueUdfName){
		try{
			 //Thread.sleep(4000);
		
			WebElement saveWebElement=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(udfNameSearchBox_xpath));
			saveWebElement.sendKeys(uniqueUdfName);
			return true;
		}
		catch(Exception e){
			
		}
		return false;
	}
	
	/*public boolean verifyUdfName(){
		try{
			Thread.sleep(2000);		
			WebElement udfWebElement=new WebDriverWait(driver,60).until(ExpectedConditions.visibilityOfElementLocated(udfSearchValue_xpath));
			udfWebElement.isDisplayed();
			
		}
		catch(Exception e){
			
		}
		return false;
	}*/
	
	public boolean verifyUdfName(String uniqueUdfName){
		try{
			// Thread.sleep(4000);
			WebElement udfWebElement=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(udfSearchValue_xpath));
			udfWebElement.getText().equalsIgnoreCase(uniqueUdfName);
			return true;
		}
		catch(Exception e){
			
		}
		return false;
	}
	
	public boolean verifyDuplicateErrorMessage()
	{
		try{
					
			WebElement duplicateErrorMessageWebElement=new WebDriverWait(driver,60).until(ExpectedConditions.visibilityOfElementLocated(duplicateErrorMsg_xpath));
			duplicateErrorMessageWebElement.isDisplayed();
			return true;
		}
		catch(Exception e){
			
		}
		return false;
	}
	

	public boolean fieldTypeSelection(String fieldTypeToSelect){	
		 
		 try {
			 //Thread.sleep(4000);
			 WebElement alphanumericWebElement=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(fieldTypeDropdown_xpath));		
				Select sel = new Select(alphanumericWebElement);
				List<WebElement> list = sel.getOptions();	
				
				
				for(WebElement ele : list){
					
					if(ele.getText().equals(fieldTypeToSelect)){
						ele.click();
						 Thread.sleep(3000);
						break;
					}
				}
				return true;
		} catch (Exception e) {
			
		}
				
			return false;
	}
	public boolean checkOnFirstCheckBox()
	{
		try{
			Thread.sleep(4000);	
			WebElement checkBoxWebElement=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(firstCheckBox_xpath));
			checkBoxWebElement.click();
			return true;
		}
		catch(Exception e){
			
		}
		return false;
	}
	public boolean clickOnDelete()
	{
		try{
			Thread.sleep(4000);		
			WebElement deleteWebElement=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(delete_xpath));
			deleteWebElement.click();
			return true;
		}
		catch(Exception e){
			
		}
		return false;
	}
	public boolean clickOnDeleteYes()
	{
		try{
			//Thread.sleep(4000);	
			WebElement deleteYesWebElement=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(yesDelete_xpath));
			deleteYesWebElement.click();
			Thread.sleep(4000);
			return true;
		}
		catch(Exception e){
			
		}
		return false;
	}
	
	String uniqueUdfName1=generateRandomData(4);
	public boolean udfNameRandom()
	{
		try{
		Thread.sleep(2000);
		
		WebElement udfNameWebElement=new WebDriverWait(driver,60).until(ExpectedConditions.visibilityOfElementLocated(udfNameTextField_xpath));
		udfNameWebElement.sendKeys(uniqueUdfName1);
		return true;
		}
		catch(Exception e){
			
		}
		return false;
	}
	public boolean clickOnStatusToggleActive(){
		try{
			 //Thread.sleep(4000);
			WebElement StatusToggleWebElement=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(statustoggleactive_xpath));
			StatusToggleWebElement.click();
			return true;
		}
		catch(Exception e){
			
		}
		return false;
	}
	
	public boolean sendKeysRandomToUdfNameSearchBox(){
		try{
			 //Thread.sleep(4000);

			WebElement saveWebElement=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(udfNameSearchBox_xpath));
			saveWebElement.sendKeys(uniqueUdfName1);
			return true;
		}
		catch(Exception e){
			
		}
		return false;
	}
	
	public boolean verifyStatusInactive(String inactiveStatus){
		try{
			 //Thread.sleep(4000);
			WebElement inactiveWebElement=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(statusInactive_xpath));
			inactiveWebElement.getText().equalsIgnoreCase(inactiveStatus);
			return true;
		}
		catch(Exception e){
			
		}
		return false;
	}
	
	public boolean validationTypeSelection(String validationTypeToSelect){	
		 
		 try {
			 //Thread.sleep(4000);
			 WebElement validationTypeWebElement=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(validationTypeDropdown_xpath));		
				Select sel = new Select(validationTypeWebElement);
				List<WebElement> list = sel.getOptions();	
				
				
				for(WebElement ele : list){
					
					if(ele.getText().equals(validationTypeToSelect)){
						ele.click();
						 Thread.sleep(3000);
						break;
					}
				}
				return true;
		} catch (Exception e) {
			
		}
				
			return false;
	}
	
	public boolean checkOnFixedLengthCheckbox(){
		try{
			//Thread.sleep(4000);
			WebElement fixedLengthCheckboxWebElement=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(fixedLengthCheckbox_xpath));
			fixedLengthCheckboxWebElement.click();
			return true;
		}
		catch(Exception e){
			
		}
		return false;
	}
	
	public boolean maskedMinLength(){
		try{
			//Thread.sleep(4000);
			WebElement minLengthWebElement=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(maskedMinLengthForLength_xpath));
			minLengthWebElement.isDisplayed();
			return true;
		}
		catch(Exception e){
			
		}
		return false;
	}
	
	public boolean maskedMaxLength(){
		try{
			//Thread.sleep(4000);
			WebElement maxLengthWebElement=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(maskedMaxLengthForLength_xpath));
			maxLengthWebElement.isDisplayed();
			return true;
		}
		catch(Exception e){
			
		}
		return false;
	}
	
	public boolean clickOnMinLength(){
		try{
			//Thread.sleep(4000);
			WebElement minLengthWebElement=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(minLengthTextField_xpath));
			minLengthWebElement.click();
			return true;
		}
		catch(Exception e){
			
		}
		return false;
	}
	
	public boolean PassValueToMinLength(String MinLength){
		try{
			//Thread.sleep(4000);
			WebElement minLengthWebElement=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(minLengthTextField_xpath));
			minLengthWebElement.sendKeys(MinLength);
			return true;
		}
		catch(Exception e){
			
		}
		return false;
	}
	
	
	public boolean clickOnMaxLength(){
		try{
			//Thread.sleep(4000);
			WebElement maxLengthWebElement=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(maxLengthTextField_xpath));
			maxLengthWebElement.click();
			return true;
		}
		catch(Exception e){
			
		}
		return false;
	}
	
	public boolean PassValueToMaxLength(String maxLength){
		try{
			//Thread.sleep(4000);
			WebElement maxLengthWebElement=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(maxLengthTextField_xpath));
			maxLengthWebElement.sendKeys(maxLength);
			return true;
		}
		catch(Exception e){
			
		}
		return false;
	}
	
	public boolean clickOnUdfMappingRadioButton(){
		try{
			Thread.sleep(2000);
			WebElement udfMappingRadiooButtonWebElement=new WebDriverWait(driver,60).until(ExpectedConditions.visibilityOfElementLocated(UdfMappingRadioButton_xpath));
			udfMappingRadiooButtonWebElement.click();
			return true;
		}
		catch(Exception e){
			
		}
		return false;
	}
	
	
	public boolean UdfSelectionInUdfMappingAdd(){	
		 
		 try {
			 //Thread.sleep(4000);
			 WebElement udfSelectionWebElement=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(selectDropdown_xpath));		
				Select sel = new Select(udfSelectionWebElement);
				
				List<WebElement> list = sel.getOptions();	
				
				
				for(WebElement ele : list){
					
					if(ele.getText().equals(uniqueUdfName1)){
						ele.click();
						 Thread.sleep(4000);
						 System.out.println("UDF available");
						break;
					}
				}
				return true;
		} catch (Exception e) {
			System.out.println("UDF not available");
		}
				
			return false;
	}
	
	public boolean UdfSelectionInUdfMappingAddDef(String udfValue){	
		 
		 try {
			// Thread.sleep(4000);
			 WebElement udfSelectionWebElement=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(selectDropdown_xpath));		
				Select sel = new Select(udfSelectionWebElement);
				
				List<WebElement> list = sel.getOptions();	
				
				
				for(WebElement ele : list){
					
					if(ele.getText().equals(udfValue)){
						ele.click();
						 Thread.sleep(4000);
						 System.out.println("UDF available");
						break;
					}
				}
				return true;
		} catch (Exception e) {
			System.out.println("UDF not available");
		}
				
			return false;
	}
	
	public boolean clickOnselect(){
		try{
			//Thread.sleep(4000);
			WebElement udfSelectionWebElement=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(selectDropdown_xpath));
			udfSelectionWebElement.click();
			return true;
		}
		catch(Exception e){
			
		}
		return false;
	}
	
	public boolean clickOnLengthValue(){
		try{
			//Thread.sleep(4000);
			WebElement lengthValueWebElement=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(fixedLengthValue_xpath));
			lengthValueWebElement.click();
			return true;
		}
		catch(Exception e){
			
		}
		return false;
	}
	public boolean passValueToLengthValue(String lengthValue){
		try{
			//Thread.sleep(4000);
			WebElement lengthValueWebElement=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(fixedLengthValue_xpath));
			lengthValueWebElement.sendKeys(lengthValue);
			return true;
		}
		catch(Exception e){
			
		}
		return false;
	}
	
	public boolean sendKeysRandomUdfToUdfNameSearchBox(){
		try{
			 //Thread.sleep(4000);
		
			WebElement saveWebElement=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(udfNameSearchBox_xpath));
			saveWebElement.sendKeys(uniqueUdfName1);
			return true;
		}
		catch(Exception e){
			
		}
		return false;
	}
	
	public boolean verifyRandomUdfName(){
		try{
			 //Thread.sleep(4000);
			WebElement udfWebElement=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(udfSearchValue_xpath));
			udfWebElement.getText().equalsIgnoreCase(uniqueUdfName1);
			return true;
		}
		catch(Exception e){
			
		}
		return false;
	}
	public boolean VerifyDisabledSave(){
		try{
			// Thread.sleep(4000);
			WebElement disabledSaveWebElement=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(disabledSave_xpath));
			disabledSaveWebElement.isDisplayed();
			return true;
		}
		catch(Exception e){
			
		}
		return false;
	}
	public boolean VerifyErrorMessageForZeroLengthValue(){
		try{
			 //Thread.sleep(4000);
			WebElement errorMsgWebElement=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(errorMessageForZeroLengthValue_xpath));
			errorMsgWebElement.isDisplayed();
			return true;
		}
		catch(Exception e){
			
		}
		return false;
	}
	public boolean VerifyMandatoryUdfValueInUdfMappingAdd(){
		try{
			 //Thread.sleep(4000);
			WebElement mandatoryWebElement=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(mandatoryUdfValueInUdfMappingAdd_xpath));
			mandatoryWebElement.isDisplayed();
			return true;
		}
		catch(Exception e){
			
		}
		return false;
	}
	public boolean checkOnMandatoryField(){
		try{
			//Thread.sleep(4000);
			WebElement mandatoryWebElement=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(mandatoryFieldInUdfDefiniton_xpath));
			mandatoryWebElement.click();
			return true;
		}
		catch(Exception e){
			
		}
		return false;
	}
	public boolean checkOnfirstCheckBoxx(){
		try{
			Thread.sleep(5000);
			WebElement boxWebElement=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(firstCheckBoxOfMap_xpath));
			boxWebElement.click();
			Thread.sleep(3000);
			return true;
		}
		catch(Exception e){
			
		}
		return false;
	}
	
	public boolean programValueSelectionInUdfMappingAdd(String prgmValue){	
		 
		 try {
			// Thread.sleep(4000);
			 WebElement prgSelectionWebElement=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(selectProgramValueUdfMapping_xpath));		
				Select sel = new Select(prgSelectionWebElement);
				
				List<WebElement> list = sel.getOptions();	
				
				
				for(WebElement ele : list){
					
					if(ele.getText().equals(prgmValue)){
						ele.click();
						 Thread.sleep(2000);					
						break;
					}
				}
				return true;
		} catch (Exception e) {

		}
				
			return false;
	}
	
	public boolean subProgramValueSelectionInUdfMappingAdd(String subprgmValue){	
		 
		 try {
			 //Thread.sleep(4000);
			 WebElement subprgSelectionWebElement=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(selectSubValueInUDfMapping_xpath));		
				Select sel = new Select(subprgSelectionWebElement);
				
				List<WebElement> list = sel.getOptions();	
				
				
				for(WebElement ele : list){
					
					if(ele.getText().equals(subprgmValue)){
						ele.click();
						 Thread.sleep(2000);					
						break;
					}
				}
				return true;
		} catch (Exception e) {

		}
				
			return false;
	}
	
	public boolean passValueToTextFieldInUdfMappAdd(String Value){
		try{
			//Thread.sleep(4000);
			WebElement valueWebElement=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(entersubPrgmValueTextField_xpath));
			valueWebElement.click();
			valueWebElement.sendKeys(Value);
			return true;
		}
		catch(Exception e){
			
		}
		return false;
	}
	public boolean checkOnUniqueField(){
		try{
			//Thread.sleep(4000);
			WebElement uniqueWebElement=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(uniqueFieldMax_xpath));
			uniqueWebElement.click();
			return true;
		}
		catch(Exception e){
			
		}
		return false;
	}
	public boolean passValueToUdfValueInUdfMappAdd(String udfValue){
		try{
			//Thread.sleep(4000);
			WebElement valueWebElement=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(udfValueFieldUdfmappingAdd_xpath));
			valueWebElement.click();
			valueWebElement.sendKeys(udfValue);
			return true;
		}
		catch(Exception e){
			
		}
		return false;
	}
	public boolean verifyErrorMessageUnique(){
		try{
			WebElement uniqueWebElement=new WebDriverWait(driver,60).until(ExpectedConditions.visibilityOfElementLocated(errorForUniqueField_xpath));
			uniqueWebElement.isDisplayed();
			Thread.sleep(3000);
			return true;
		}
		catch(Exception e){
			
		}
		return false;
	}
	
	public boolean verifysuccessMessageMap(){
		try{
			WebElement MapWebElement=new WebDriverWait(driver,60).until(ExpectedConditions.visibilityOfElementLocated(successMsgForMapping_xpath));
			MapWebElement.isDisplayed();
			Thread.sleep(3000);
			return true;
		}
		catch(Exception e){
			
		}
		return false;
	}
	public boolean checkOnUpdatableField(){
		try{
			//Thread.sleep(3000);
			WebElement updatableFieldWebElement=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(checkOnUpdatableField_xpath));
			updatableFieldWebElement.click();
			return true;
		}
		catch(Exception e){
			
		}
		return false;
	}
	
	public boolean checkOnCheckboxClientDetails(){
		try{
			Thread.sleep(3000);
			WebElement checkBoxCleintDetailsWebElement=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(checkOnClientDetailsCheckBoxInUdfMapping_xpath));
			checkBoxCleintDetailsWebElement.click();
			return true;
		}
		catch(Exception e){
			
		}
		return false;
	}
	
	public boolean clickOnEditInUdfMapping(){
		try{
			Thread.sleep(3000);
			WebElement editWebElement=new WebDriverWait(driver,60).until(ExpectedConditions.visibilityOfElementLocated(editUdfMapping_xpath));
			editWebElement.click();
			Thread.sleep(3000);
			return true;
		}
		catch(Exception e){
			
		}
		return false;
	}
	
	
	public boolean searchMappedUDf(String udfValueNew){	
		 
		 try {
			 Thread.sleep(4000);
			int a=12;
			ArrayList<Integer> list = new ArrayList<Integer>(a);
			 for (int i = 1; i <list.size(); i++) {
				// WebElement searchMappedUDfWebElement=new WebDriverWait(driver,60).until(ExpectedConditions.visibilityOfElementLocated(udfNameInEdit_xpath));
				 String udfValue=driver.findElement(By.xpath("(//div[@class='row no-marg no-pad']/div[2]/div/select/option[@class='ng-star-inserted'])[" + i + "]")).getText();
				 System.out.println(udfValue);
				 /*if (udfValue.equals(uniqueUdfName1)) {
					 Thread.sleep(3000);
				driver.findElement(By.xpath("(//input[@class='ui-inputtext ui-widget ui-state-default ui-corner-all ui-autocomplete-input ng-star-inserted'])[" + j + "]")).click();
				driver.findElement(By.xpath("(//input[@class='ui-inputtext ui-widget ui-state-default ui-corner-all ui-autocomplete-input ng-star-inserted'])[" + j + "]")).sendKeys(udfValueNew);
				break;
					}*/}
			 return true;
			 }
 
				 catch (Exception e) {
		       }
		 
			return false;
		
/*		   try {
			     WebElement LabelWebEelement=new WebDriverWait(driver,60).until(ExpectedConditions.visibilityOfElementLocated(udfNameInEdit_xpath));
			     
			      if (LabelWebEelement.isEnabled()) {
			       String dataaftertrim = uniqueUdfName1.trim();
			    
			       List<WebElement> lists =driver
			         .findElements(By
			           .xpath("//div[@class='row no-marg no-pad']"));

			       for (int i = 0; i <= lists.size(); i++) {

			        String mangername = lists.get(i).getText();
			        String appdata = mangername.trim();

			        if (dataaftertrim.equals(appdata)) {
			         System.out.println(mangername);
			         int j = i + 1;
			   driver.findElement(By.xpath("(//input[@class='ui-inputtext ui-widget ui-state-default ui-corner-all ui-autocomplete-input ng-star-inserted'])["
			             + j + "]")).click();
			   driver.findElement(By.xpath("(//input[@class='ui-inputtext ui-widget ui-state-default ui-corner-all ui-autocomplete-input ng-star-inserted'])["
			             + j + "]")).sendKeys(udfValueNew);
			         Thread.sleep(5000);
			        
			        }
			       }
			      }
			     }

			     catch (Exception e) {
			     System.out.println("Failed");

			     }
		return false;

*/
			}
	
	public boolean verify(){
		try{
			
			WebElement prgSelectionWebElement=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(editUdff_xpath));		
			Select sel = new Select(prgSelectionWebElement);
			
			List<WebElement> list = sel.getOptions();	
			
			
			for(WebElement ele : list){
				
				if(ele.getText().equals(uniqueUdfName1)){
					ele.click();
					 Thread.sleep(2000);					
					break;
				}
			}
			return true;
		
		}
		catch(Exception e){
			
		}
		return false;
	}

	
	public boolean verifysuccessMessageMapForUpdate(){
		try{
			WebElement updateMapWebElement=new WebDriverWait(driver,60).until(ExpectedConditions.visibilityOfElementLocated(successMsgForUpdatingMapping_xpath));
			updateMapWebElement.isDisplayed();
			Thread.sleep(3000);
			return true;
		}
		catch(Exception e){
			
		}
		return false;
	}

public boolean clickOnSaveNewInUdfDefAdd(){
try{
	//Thread.sleep(4000);
	WebElement defSaveNewWebElement=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(saveAndNewInUdfDefintionAdd_xpath));
	defSaveNewWebElement.click();
	
	return true;
}
catch(Exception e){
	
}
return false;
}
public boolean verifysuccessMessageInUdfAdd(){
	try{
		WebElement saveUdfWebElement=new WebDriverWait(driver,60).until(ExpectedConditions.visibilityOfElementLocated(saveInUdfDefAdd_Xapth));
		saveUdfWebElement.isDisplayed();
		Thread.sleep(4000);
		return true;
	}
	catch(Exception e){
		
	}
	return false;
}
public boolean clickOnUniqueFieldValue(){
try{
	//Thread.sleep(4000);
	WebElement uniqueWebElement=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(uniqueFieldValueChkboxLength_xpath));
	uniqueWebElement.click();
	
	return true;
}
catch(Exception e){
	
}
return false;
}

public boolean verifyUniqueFieldValueTextField(){
try{
	//Thread.sleep(4000);
	WebElement uniqueWebElement=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(uniqueFieldValueTextField_xpath));
	uniqueWebElement.isDisplayed();
	
	return true;
}
catch(Exception e){
	
}
return false;
}


public boolean clickOnUniqueFieldValueTextField(){
try{
	//Thread.sleep(4000);
	WebElement uniqueWebElement=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(uniqueFieldValueTextField_xpath));
	uniqueWebElement.click();
	
	return true;
}
catch(Exception e){
	
}
return false;
}
public boolean verifyErrorMessageUniqueFieldValueTextField(){
try{
	//Thread.sleep(4000);
	WebElement uniqueWebElement=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(errorMessageUniqueFieldValue_xpath));
	uniqueWebElement.isDisplayed();
	
	return true;
}
catch(Exception e){
	
}
return false;
}
public boolean passValueToUniqueFieldValueTextField(String uniqueFieldValue){
try{
	//Thread.sleep(4000);
	WebElement uniqueWebElement=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(uniqueFieldValueTextField_xpath));
	uniqueWebElement.sendKeys(uniqueFieldValue);
	
	return true;
}
catch(Exception e){
	
}
return false;
}

public boolean verifydisabeldUniqueFieldValueTextField(){
try{
	//Thread.sleep(4000);
	WebElement uniqueWebElement=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(disabledUDfValueInMap_xpath));
	uniqueWebElement.isDisplayed();
	
	return true;
}
catch(Exception e){
	
}
return false;
}

public boolean clickOnUpdatableFieldValueTextField(){
try{
	//Thread.sleep(4000);
	WebElement updtableWebElement=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(clickOnUpdatableFixedLength_xpath));
	updtableWebElement.click();
	
	return true;
}
catch(Exception e){
	
}
return false;
}

public boolean passValueToMaxValueRange(String maxValue){
	try{
		//Thread.sleep(4000);
		WebElement valueWebElement=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(MaxValueRange_xpath));
		valueWebElement.click();
		valueWebElement.sendKeys(maxValue);
		return true;
	}
	catch(Exception e){
		
	}
	return false;
}
public boolean passValueToMinValueRange(String minValue){
	try{
		//Thread.sleep(4000);
		WebElement valueWebElement=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(MinValueRange_xpath));
		valueWebElement.click();
		valueWebElement.sendKeys(minValue);
		return true;
	}
	catch(Exception e){
		
	}
	return false;
}



public boolean clickOnMaxValueRange(){
	try{
		//Thread.sleep(4000);
		WebElement valueWebElement=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(MaxValueRange_xpath));
		valueWebElement.click();
		return true;
	}
	catch(Exception e){
		
	}
	return false;
}

public boolean clickOnMinValueRange(){
	try{
		//Thread.sleep(4000);
		WebElement valueWebElement=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(MinValueRange_xpath));
		valueWebElement.click();
		return true;
	}
	catch(Exception e){
		
	}
	return false;
}

public boolean verifyerrorMsgForMaxRange(){
try{
	//Thread.sleep(4000);
	WebElement errorMsgWebElement=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(valueMinRange_xpath));
	errorMsgWebElement.isDisplayed();
	
	return true;
}
catch(Exception e){
	
}
return false;
}


public boolean verifyerrorMsgForMinRange(){
try{
	//Thread.sleep(4000);
	WebElement errorMsgWebElement=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(valueMaxRange_xpaath));
	errorMsgWebElement.isDisplayed();
	
	return true;
}
catch(Exception e){
	
}
return false;
}

public boolean clickOnUniqueRange(){
try{
	//Thread.sleep(4000);
	WebElement clickWebElement=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(uniqueFieldRange));
	clickWebElement.click();
	
	return true;
}
catch(Exception e){
	
}
return false;
}

String path=valueR();
public boolean verifyUdfIfNotMandatoryTest(){
try{
	Thread.sleep(4000);
	driver.findElement(By.xpath("//label[text()='" + path + "']"));
	
	return true;
}
catch(Exception e){
	
}
return false;
}

public boolean clickOnhomeIcon(){
try{
	Thread.sleep(3000);
	WebElement clickWebElement=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(homeIcon));
	clickWebElement.click();
	
	return true;
}
catch(Exception e){
	
}
return false;
}


public String valueR(){
try{
	//Thread.sleep(4000);	
	WebElement valWebElement=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(random_xpath));
	String value=valWebElement.getText();	
	return value;
}
catch(Exception e){
	
}
return null;
}

public boolean verifyUdfIfNotMandatory(){
try{
	//Thread.sleep(4000);
	WebElement verifyWebElement=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(udfClientCreation_xpath));
	verifyWebElement.isDisplayed();
}
catch(Exception e){
	
}
return false;
}

public boolean selectAllInMapping(){
try{
	Thread.sleep(5000);
	WebElement selectWebElement=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(selectAllInMapping_xpath));
	selectWebElement.click();
	Thread.sleep(4000);
	return true;
}
catch(Exception e){
	
}
return false;
}


public boolean scrollDown()
{
try{
	JavascriptExecutor js = (JavascriptExecutor) driver;
	 js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
System.out.println("screen scrolled down successfully");
return true;

}
catch(Exception ex){
return false;
}
}

public  boolean scrollToView()
{
	try{
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", udfClientCreation_xpath);
        return true;
	}
	catch(Exception e)
	{
  System.out.println("Error in viewing ");
	}
	return false;
}

public boolean verifyErrorForMaxMinRange(){
try{
	WebElement verifyWebElement=new WebDriverWait(driver,60).until(ExpectedConditions.visibilityOfElementLocated(errorMessageForMaxMinRange_xpath));
	verifyWebElement.isDisplayed();
	return true;
}
catch(Exception e){
	
}
return false;
}

public boolean clickOnOrg(){
try{
	WebElement verifyWebElement=new WebDriverWait(driver,60).until(ExpectedConditions.visibilityOfElementLocated(labelOrg_xpath));
	verifyWebElement.click();
	return true;
}
catch(Exception e){
	
}
return false;
}

public boolean verifydefSummaryLabel(){
try{
	//Thread.sleep(4000);
	WebElement verifyWebElement=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(defsummaryLabel_xpath));
	verifyWebElement.isDisplayed();
	return true;
}
catch(Exception e){
	
}
return false;
}


public boolean passValueToLovValue(String lovValue){
try{
	WebElement lovValueWebElement=new WebDriverWait(driver,60).until(ExpectedConditions.visibilityOfElementLocated(lovValue_Xpath));
	lovValueWebElement.click();
	lovValueWebElement.sendKeys(lovValue);
	return true;
}
catch(Exception e){
	
}
return false;
}


public boolean udfDescriptionForLov()
{
	try{
	//Thread.sleep(4000);
	String uniqueUdfDescription=generateRandomData(4);
	WebElement udfDescriptionWebElement=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(descriptionLovValue_xpath));
	udfDescriptionWebElement.click();
	udfDescriptionWebElement.sendKeys(uniqueUdfDescription);
	return true;
	}
	catch(Exception e){
		
	}
	return false;
}
	
public boolean clickOnAddLovValue(){
try{
	//Thread.sleep(4000);
	WebElement clickWebElement=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(addLov_xpath));
	clickWebElement.click();
	return true;
}
catch(Exception e){
	
}
return false;
}

public boolean verifylastLovValue(){
try{
	//Thread.sleep(4000);
	WebElement verifyWebElement=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(updatedLovValue_xpath));
	verifyWebElement.isDisplayed();
	return true;
}
catch(Exception e){
	
}
return false;
}

public boolean verifylastDescriptionLov(){
try{
	//Thread.sleep(4000);
	WebElement verifyWebElement=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(updatedDescriotion_xpath));
	verifyWebElement.isDisplayed();
	return true;
}
catch(Exception e){
	
}
return false;
}

public boolean verifyLovValueAfterAdd(){
try{
	//Thread.sleep(4000);
	WebElement verifyWebElement=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(secondLovValueTextfield_xpath));
	verifyWebElement.isDisplayed();
	return true;
}
catch(Exception e){
	
}
return false;
}

public boolean verifyDescriptionAfterAdd(){
try{
	//Thread.sleep(4000);
	WebElement verifyWebElement=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(secondDescription_xpath));
	verifyWebElement.isDisplayed();
	return true;
}
catch(Exception e){
	
}
return false;
}

public boolean passValuesToSecondLovValue(String lovValuenew){
try{
	//Thread.sleep(4000);
	WebElement lovWebElement=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(secondLovValueTextfield_xpath));
	lovWebElement.click();
	lovWebElement.sendKeys(lovValuenew);
	return true;
}
catch(Exception e){
	
}
return false;
}


public boolean udfDescriptionForSecLov()
{
	try{
	//Thread.sleep(4000);
	String uniqueUdfDescription=generateRandomData(4);
	WebElement udfDescriptionWebElement=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(secondDescription_xpath));
	udfDescriptionWebElement.click();
	udfDescriptionWebElement.sendKeys(uniqueUdfDescription);
	return true;
	}
	catch(Exception e){
		
	}
	return false;
}


public boolean clickOnFirstDefaultValue(){
try{
	//Thread.sleep(4000);
	WebElement clickWebElement=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(firstDefaultValue_xpath));
	clickWebElement.click();
	return true;
}
catch(Exception e){
	
}
return false;
}


public boolean verifyDefaultUdfValue(String lovValuenew){
try{
	//Thread.sleep(4000);
	Select select = new Select(driver.findElement(By.xpath("//select[@class='mapping-dropdown form-control ng-pristine ng-valid ui-inputtext ui-corner-all ui-state-default ng-submitted ng-untouched ng-star-inserted']")));
	WebElement option = select.getFirstSelectedOption();
	String defaultItem = option.getText();
	if (lovValuenew.equals(defaultItem)) {
		System.out.println("Default value is displayed in Mapping");
	}
	return true;
}
catch(Exception e){
	
}
return false;
}

public boolean clickOnSecondDefaultValue(){
try{
	//Thread.sleep(4000);
	WebElement clickWebElement=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(secDefaultChBox_xpath));
	clickWebElement.click();
	return true;
}
catch(Exception e){
	
}
return false;
}

public boolean clickOnsortByorder(){
try{
	//Thread.sleep(4000);
	WebElement clickWebElement=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(sortByOrder_xpath));
	clickWebElement.click();
	return true;
}
catch(Exception e){
	
}
return false;
}

public boolean click(){
try{
	Thread.sleep(4000);
	WebElement clickWebElement=new WebDriverWait(driver,60).until(ExpectedConditions.visibilityOfElementLocated(udfValue_xpath));
	clickWebElement.click();
	return true;
}
catch(Exception e){
	
}
return false;
}


public List<String> getAllValues() throws InterruptedException
{
	WebElement element = driver.findElement(udfValuer_xpath);
	Select sel = new Select(element);	
   List<WebElement> we = sel.getOptions();
 
   List<String> ls = new ArrayList<String>();
   for(int i=0;i<we.size() ;i++)
   {
      
        ls.add(we.get(i).getText());
       
   }
   return ls;
}

public boolean verifySortedUdfValue(){
	try{
		List<String> list1 = new ArrayList<String>();
		   list1.add("Select");
		   list1.add("11");
		   list1.add("22");	
		   
		   System.out.println(list1);
		   /*//String[] myArray = (String[]) list1.toArray();
		   Object[] myArray = list1.toArray();
		   for (Object myObject : myArray) {
		      System.out.println(myObject);
		   }*/
		   
		  
		   
	List<String> a=new UserDefinedFieldPage(driver).getAllValues();
	System.out.println(a);
	 /*Object[] myArray1 = a.toArray();
	   for (Object myObject1 : myArray1) {
	      System.out.println(myObject1);
	      
	   }*/
	   
	  for (int i = 0; i < list1.size(); i++) {
		if (list1.equals(a)) {
			i++;
			return true;
		}else {
			return false;
		}
	}
	  return true; 
		   
		/*if(list1.size()==a.size())
		{ 
			
			
			for(int i=0;i<a.size();i++)
			{
				
				if(list1.get(i).equals(a.get(i)))
				{
					
					
					return true;
				}					
					return false;
			}
			return false;
			
		}else 
			{
				return false;
			}*/

	}
	catch(Exception e){
		System.out.println("Error");
		return false;
	}
	
	
}

public boolean verifySortedUdfValueForAlphanumeric(){
	try{
		List<String> list1 = new ArrayList<String>();
		   list1.add("Select");
		   list1.add("Atest");
		   list1.add("Btest");	
		   
		   System.out.println(list1);
		   
	List<String> a=new UserDefinedFieldPage(driver).getAllValues();
	System.out.println(a);
  for (int i = 0; i < list1.size(); i++) {
		if (list1.equals(a)) {
			i++;
			return true;
		}else {
			return false;
		}
	}
	  return true; 
	}
	catch(Exception e){
		System.out.println("Error");
		return false;
	}
	
	
}

public boolean verifErrorMsgForMappedUdf(){
	try{
		WebElement errorMsgWebElement=new WebDriverWait(driver,60).until(ExpectedConditions.visibilityOfElementLocated(errorMsgMappedUdf_xpath));
		errorMsgWebElement.isDisplayed();
		
		return true;
	}
	catch(Exception e){
		
	}
	return false;
}



public boolean udfMappingSumamryTitle(){
try{
	Thread.sleep(3000);
	WebElement userSummaryTitleWebElement=new WebDriverWait(driver,60).until(ExpectedConditions.visibilityOfElementLocated(udfMappingSummary_xpath));
	userSummaryTitleWebElement.isDisplayed();
		return true;

}
catch(Exception e){
	
}
return false;

}

public boolean masterSearchMapping(){
try{
	Thread.sleep(3000);
	WebElement masterSearchWebElement=new WebDriverWait(driver,60).until(ExpectedConditions.visibilityOfElementLocated(masterSearchMapping_xpath));
	masterSearchWebElement.isDisplayed();
		return true;

}
catch(Exception e){
	
}
return false;

}

public boolean udfMappingAddTitle(){
try{
	Thread.sleep(3000);
	WebElement titleWebElement=new WebDriverWait(driver,60).until(ExpectedConditions.visibilityOfElementLocated(udfMappingAdd_xpath));
	titleWebElement.isDisplayed();
		return true;

}
catch(Exception e){
	
}
return false;

}

public boolean selectUDfMapping(){
try{
	Thread.sleep(3000);
	WebElement searchMapWebElement=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(selectDropdown_xpath));
	searchMapWebElement.isDisplayed();
		return true;

}
catch(Exception e){
	
}
return false;

}

public boolean  verifyValuesUnderProgramValues(){
	 try {
			Thread.sleep(10000);
	  String[] exp = {"Select","Client Details","Reports","Debtors","Detail Receivables","Summary Receivables","Enter New Sale Invoices","Current Receivables"};
	  
	  WebElement dropdown = driver.findElement(selectProgramValueUdfMapping_xpath);  
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


public boolean verifyUdfValue(){
try{
	Thread.sleep(4000);
	WebElement clickWebElement=new WebDriverWait(driver,60).until(ExpectedConditions.visibilityOfElementLocated(udfValue_xpath));
	clickWebElement.isDisplayed();
	return true;
}
catch(Exception e){
	
}
return false;
}


public boolean verifyUdfTextFieldInMapping(){
	try{
		//Thread.sleep(4000);
		WebElement valueWebElement=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(udfValueFieldUdfmappingAdd_xpath));
		valueWebElement.isDisplayed();
		return true;
	}
	catch(Exception e){
		
	}
	return false;
}

public boolean selectLovValue(String lovValueToSelect){
try {
	 //Thread.sleep(4000);
	 WebElement SelectionWebElement=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(udfValue_xpath));		
		Select sel = new Select(SelectionWebElement);
		
		List<WebElement> list = sel.getOptions();	
		
		
		for(WebElement ele : list){
			
			if(ele.getText().equals(lovValueToSelect)){
				ele.click();
				 Thread.sleep(2000);					
				break;
			}
		}
		return true;
} catch (Exception e) {

}
		
	return false;
}

public boolean verifySecSelect(){
	try{
		//Thread.sleep(4000);
		WebElement valueWebElement=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(secondSelctInMapping_xpath));
		valueWebElement.isDisplayed();
		return true;
	}
	catch(Exception e){
		
	}
	return false;
}
public boolean clickOnAddInMapp(){
	try{
		//Thread.sleep(4000);
		WebElement clickWebElement=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(addIconInMapping_xpath));
		clickWebElement.click();
		
		return true;
	}
	catch(Exception e){
		
	}
	return false;
}

public boolean clickOnAddPrgmMapp(){
	try{
		//Thread.sleep(4000);
		WebElement clickWebElement=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(addIconInPrgmMapping_xpath));
		clickWebElement.click();
		
		return true;
	}
	catch(Exception e){
		
	}
	return false;
}


public boolean verifySecPrgm(String prgmValueN){
try {
	// Thread.sleep(4000);
	 WebElement prgSelectionWebElement=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(secPrgmDrpdown_xpath));		
		Select sel = new Select(prgSelectionWebElement);
		
		List<WebElement> list = sel.getOptions();	
		
		
		for(WebElement ele : list){
			
			if(ele.getText().equals(prgmValueN)){
				ele.click();
				 Thread.sleep(3000);					
				break;
			}
		}
		return true;
} catch (Exception e) {

}
		
	return false;
}

public boolean verifyUDfNAmeIsMulitple(){
	try{
		Thread.sleep(2000);
		 Select listbox = new Select(driver.findElement(By.xpath("//select[@class='mapping-dropdown form-control ng-pristine ui-inputtext ui-corner-all ui-state-default ng-submitted ng-untouched ng-invalid']")));
		
		if (listbox.isMultiple()) {
			System.out.println("UDF Selection is multi select");
		}else {
			System.out.println("UDF Selection is single select");
		}
		
		return true;
	}
	catch(Exception e){
		System.out.println("Error");
	}
	return false;
}

public boolean dragAndDropUdf(){
	try{
		//Thread.sleep(4000);   		
		WebElement dragWebElement=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(firstDragElement_xpath));		
		WebElement dropWebElement=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(secDragElement_xpath));								
		Actions act=new Actions(driver);						
		//act.dragAndDrop(dragWebElement, dropWebElement).build().perform();	
		//Thread.sleep(2000);
		Action drag = act.clickAndHold(dragWebElement).moveToElement(dropWebElement).release(dropWebElement).build( );
		drag.perform( );
		Thread.sleep(5000);
		/*act.clickAndHold(dragWebElement).moveToElement(dropWebElement).perform();
		Thread.sleep(2000);// add 2 sec wait
		act.release(dropWebElement).build().perform();*/
		
		/*Action dragAndDrop = act.clickAndHold(dragWebElement)
				 
				.moveToElement(dropWebElement)
				 
				.release(dragWebElement)
				 
				.build();
				 
				dragAndDrop.perform();
		Thread.sleep(4000);   		
		return true;*/
		return true;
	}
	catch(Exception e){
		System.out.println("Drag and drop failed");
	}
	return false;
}



public boolean  verifyValuesUnderClientDetailsProgramValues(){
	 try {
			Thread.sleep(10000);
	  String[] exp = {"Select","NAICS Code","Description","Account References","Cash Controls", "Risk Rating Code" ,"Company Type", "Country", "Branch" , "Sales Region"};
	  
	  WebElement dropdown = driver.findElement(selectSubValueInUDfMapping_xpath);  
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

public boolean verifySubPrgm(){
	try{
		//Thread.sleep(4000);
		WebElement verifyWebElement=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(selectSubValueInUDfMapping_xpath));
		verifyWebElement.isDisplayed();
		
		return true;
	}
	catch(Exception e){
		
	}
	return false;
}
public boolean verifySubPrgmValue(){
	try{
		//Thread.sleep(4000);
		WebElement verifyWebElement=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(entersubPrgmValueTextField_xpath));
		verifyWebElement.isDisplayed();
		
		return true;
	}
	catch(Exception e){
		
	}
	return false;
}


public boolean verifyBbcReportLabel(){
	try{
		//Thread.sleep(4000);
		WebElement verifyWebElement=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(bbcMgmtReportLabel_xpath));
		verifyWebElement.isDisplayed();
		
		return true;
	}
	catch(Exception e){
		
	}
	return false;
}

public boolean clickOnTrendReport(){
	try{
		//Thread.sleep(4000);
		WebElement clickWebElement=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(trendReportCheckBox_xpath));
		clickWebElement.click();
		
		return true;
	}
	catch(Exception e){
		
	}
	return false;
}


String uniqueUdfDescription3=generateRandomData(4);
public boolean udfSecValue()
{
	try{
		 //Thread.sleep(4000);
	
	WebElement udfDescriptionWebElement=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(udfNameTextField_xpath));
	udfDescriptionWebElement.sendKeys(uniqueUdfDescription3);
	return true;
	}
	catch(Exception e){
		
	}
	return false;
}

public boolean UdfSecondSelectionInUdfMappingAdd(){	
	 
	 try {
		 //Thread.sleep(4000);
		 WebElement udfSelectionWebElement=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(selectDropdown_xpath));
		 udfSelectionWebElement.click();
			Select sel = new Select(udfSelectionWebElement);
			
			List<WebElement> list = sel.getOptions();	
			
			
			for(WebElement ele : list){
				
				if(ele.getText().equals(uniqueUdfDescription3)){
					ele.click();
					 Thread.sleep(4000);
					 System.out.println("Second UDF available");
					break;
				}
			}
			return true;
	} catch (Exception e) {
		System.out.println("Second UDF not available");
	}
			
		return false;
}

public boolean checkOnfirstCheckBoxOfReports(){
	try{
		Thread.sleep(4000);
		WebElement boxWebElement=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(firstCheckBoxOfReportMap_xpath));
		boxWebElement.click();
		return true;
	}
	catch(Exception e){
		
	}
	return false;
}
public boolean passValueToSecUdfValueInUdfMappAdd(String secUdfValue){
	try{
		//Thread.sleep(4000);
		WebElement valueWebElement=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(secUdfValueTextField_xpath));
		valueWebElement.click();
		valueWebElement.sendKeys(secUdfValue);
		return true;
	}
	catch(Exception e){
		
	}
	return false;
}

public boolean sendKeysRandomToUdfMappNameSearchBox(){
	try{
		 //Thread.sleep(4000);

		WebElement saveWebElement=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(udfNameSearchBox_xpath));
		saveWebElement.sendKeys(uniqueUdfName1);
		Thread.sleep(4000);
		return true;
	}
	catch(Exception e){
		
	}
	return false;
}

public boolean verifyMappedUdfName(){
	try{
		String actual=driver.findElement(By.xpath("//tr[@class='ng-star-inserted']/td[text()='"+uniqueUdfName1 +" ']")).getText();
		String Expected=uniqueUdfName1;
		if (actual.equals(Expected)) {
			System.out.println(actual);
			return true;
		}else
			System.out.println("UDF are not mapped");
		return false;
	}
	catch(Exception e){
		System.out.println("Error");
	}
	return false;
}

public boolean enabledEditInUdfMapping(){
	try{
		//Thread.sleep(3000);
		WebElement editWebElement=new WebDriverWait(driver,60).until(ExpectedConditions.visibilityOfElementLocated(editUdfMapping_xpath));
		editWebElement.isDisplayed();
		return true;
	}
	catch(Exception e){
		
	}
	return false;
}

public boolean UdfMappingEditLbel(){
	try{
		Thread.sleep(2000);
		WebElement editWebElement=new WebDriverWait(driver,60).until(ExpectedConditions.visibilityOfElementLocated(mappingEditLabel_xpath));
		editWebElement.isDisplayed();
		return true;
	}
	catch(Exception e){
		
	}
	return false;
}

public boolean clickOnExportMap(){
	try{
		//Thread.sleep(3000);
		WebElement clickWebElement=new WebDriverWait(driver,60).until(ExpectedConditions.visibilityOfElementLocated(exportMap_xpath));
		clickWebElement.click();
		return true;
	}
	catch(Exception e){
		
	}
	return false;
}

public boolean exportHeader(){
	try{
		//Thread.sleep(3000);
		WebElement expWebElement=new WebDriverWait(driver,60).until(ExpectedConditions.visibilityOfElementLocated(exportHeader_xpath));
		expWebElement.isDisplayed();
		return true;
	}
	catch(Exception e){
		
	}
	return false;
}

public boolean passToProgramSearch(String search){
	try{
		//Thread.sleep(3000);
		WebElement clickWebElement=new WebDriverWait(driver,60).until(ExpectedConditions.visibilityOfElementLocated(programSearch_xpath));
		clickWebElement.click();
		clickWebElement.sendKeys(search);
		return true;
	}
	catch(Exception e){
		
	}
	return false;
}

public boolean disabledEdit(){
	try{
		//Thread.sleep(3000);
		WebElement editWebElement=new WebDriverWait(driver,60).until(ExpectedConditions.visibilityOfElementLocated(disabledEditMap_xpath));
		editWebElement.isDisplayed();
		return true;
	}
	catch(Exception e){
		
	}
	return false;
}

public boolean disabledDelete(){
	try{
		//Thread.sleep(3000);
		WebElement deleteWebElement=new WebDriverWait(driver,60).until(ExpectedConditions.visibilityOfElementLocated(disabledDeleteMap_xpath));
		deleteWebElement.isDisplayed();
		return true;
	}
	catch(Exception e){
		
	}
	return false;
}

public boolean secSelectAddInMapp(){
	try{
		//Thread.sleep(4000);
		WebElement verifyWebElement=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(addIconInMapping_xpath));
		verifyWebElement.isDisplayed();
		
		return true;
	}
	catch(Exception e){
		
	}
	return false;
}

public boolean clickOnBox(){
	try{
		//Thread.sleep(3000);
		WebElement clickWebElement=new WebDriverWait(driver,60).until(ExpectedConditions.visibilityOfElementLocated(thirdBox_xpath));
		clickWebElement.click();
		return true;
	}
	catch(Exception e){
		
	}
	return false;
}

public boolean clickOnUDfClientTransfer(){
	try{
		Thread.sleep(3000);
		log.info("clicked on UDF client transfer");
		WebElement clickWebElement=new WebDriverWait(driver,60).until(ExpectedConditions.visibilityOfElementLocated(udfClientTransferRadioButton_xpath));
		clickWebElement.click();
		return true;
	}
	catch(Exception e){
		
	}
	return false;
}


public boolean udfClientTransferTitle(){
try{
	//Thread.sleep(3000);
	WebElement TitleWebElement=new WebDriverWait(driver,60).until(ExpectedConditions.visibilityOfElementLocated(udfClientTransferLabel_xpath));
	TitleWebElement.isDisplayed();
		return true;

}
catch(Exception e){
	
}
return false;

}

public boolean transferClientsFromTitle(){
try{
	//Thread.sleep(3000);
	WebElement TitleWebElement=new WebDriverWait(driver,60).until(ExpectedConditions.visibilityOfElementLocated(transferclientFromLabel_xpath));
	TitleWebElement.isDisplayed();
		return true;

}
catch(Exception e){
	
}
return false;

}

public boolean transferClientsToTitle(){
try{
	//Thread.sleep(3000);
	WebElement TitleWebElement=new WebDriverWait(driver,60).until(ExpectedConditions.visibilityOfElementLocated(transferClientsToLabel_xpath));
	TitleWebElement.isDisplayed();
		return true;

}
catch(Exception e){
	
}
return false;

}

public boolean cancelDisplay(){
try{
	//Thread.sleep(3000);
	WebElement cancelWebElement=new WebDriverWait(driver,60).until(ExpectedConditions.visibilityOfElementLocated(cancelUdfTransfer_xpath));
	cancelWebElement.isDisplayed();
		return true;

}
catch(Exception e){
	
}
return false;

}

public boolean transferDisplay(){
try{
	//Thread.sleep(3000);
	WebElement transferWebElement=new WebDriverWait(driver,60).until(ExpectedConditions.visibilityOfElementLocated(transferClientTransfer_xpath));
	transferWebElement.isDisplayed();
		return true;

}
catch(Exception e){
	
}
return false;

}


public boolean transferClientFromUdf(){	
	 
	 try {
		Thread.sleep(4000);
		
		 WebElement udfSelectionWebElement=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(firstSelectUdf_xpath));		
			Select sel = new Select(udfSelectionWebElement);
			
			List<WebElement> list = sel.getOptions();	
			
			
			for(WebElement ele : list){
				
				if(ele.getText().equals(uniqueUdfName1)){
					ele.click();
					 Thread.sleep(2000);					
					break;
				}
			}
			return true;
	} catch (Exception e) {

	}
			
		return false;
}

public boolean transferClientFromUdfValue(String udfValue){	
	 
	 try {
		Thread.sleep(4000);
		 
		 WebElement udfValueSelectionWebElement=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(udfValueTransferFrom_xpath));		
			Select sel = new Select(udfValueSelectionWebElement);
			
			List<WebElement> list = sel.getOptions();	
			
			
			for(WebElement ele : list){
				
				if(ele.getText().equals(udfValue)){
					ele.click();
					 Thread.sleep(2000);					
					break;
				}
			}
			return true;
	} catch (Exception e) {

	}
			
		return false;
}

String firstClient;
public boolean getFirstClient(){
try{
	Thread.sleep(1000);
	WebElement transferWebElement=new WebDriverWait(driver,60).until(ExpectedConditions.visibilityOfElementLocated(firstClient_xpath));
	firstClient=transferWebElement.getText();	
	return true;

}
catch(Exception e){
	
}
return false;

}

public boolean compareClients(){
try{
	//Thread.sleep(3000);
	WebElement clientWebElement=new WebDriverWait(driver,60).until(ExpectedConditions.visibilityOfElementLocated(firstClientInList_xpath));
	String matchClient=clientWebElement.getText();	
	if (firstClient.equalsIgnoreCase(matchClient)) {
		System.out.println(firstClient);
		System.out.println(matchClient);
		System.out.println("Verified mapped client");
		return true;
	}else
	return false;

}
catch(Exception e){
	System.out.println("Error");
}
return false;

}

public boolean searchClientFrom(){
try{
	//Thread.sleep(3000);
	WebElement searchWebElement=new WebDriverWait(driver,60).until(ExpectedConditions.visibilityOfElementLocated(searchClientFrom_xpath));
	searchWebElement.isDisplayed();
		return true;

}
catch(Exception e){
	
}
return false;

}


public boolean checkOnSecCheckBoxx(){
	try{
		WebElement boxWebElement=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(secClientMapping_xpath));
		boxWebElement.click();
		return true;
	}
	catch(Exception e){
		
	}
	return false;
}

public boolean passClientInSearchClient(){
	try{
		Thread.sleep(2000);
		WebElement boxWebElement=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(searchClientFrom_xpath));
		boxWebElement.click();
		boxWebElement.sendKeys(firstClient);
		return true;
	}
	catch(Exception e){
		
	}
	return false;
}


public boolean VerifysearchedClient(){
try{
	//Thread.sleep(3000);
	WebElement clientWebElement=new WebDriverWait(driver,60).until(ExpectedConditions.visibilityOfElementLocated(firstClientInList_xpath));
	clientWebElement.getText();

}
catch(Exception e){
	System.out.println("Error");
}
return false;

}


public boolean allLabel(){
	try{
		WebElement boxWebElement=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(allcheckBocLabel_xpath));
		boxWebElement.isDisplayed();
		return true;
	}
	catch(Exception e){
		
	}
	return false;
}

public boolean allDefaultCheckBox(){
	try{
		WebElement boxWebElement=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(allByDefault_xpath));
		boxWebElement.isDisplayed();
		return true;
	}
	catch(Exception e){
		
	}
	return false;
}

public boolean clickOnAllCheckBox(){
	try{
		WebElement boxWebElement=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(allCheckOn_xpath));
		boxWebElement.click();
		return true;
	}
	catch(Exception e){
		
	}
	return false;
}
public boolean msgTransferFrom(){
	try{
		WebElement boxWebElement=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(warningMsg_xpath));
		boxWebElement.isDisplayed();
		return true;
	}
	catch(Exception e){
		
	}
	return false;
}


public boolean transferClientToUdf(){	
	 
	 try {
		Thread.sleep(4000);
		
		 WebElement udfSelectionWebElement=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(selectUdfTransferTo_xpath));		
			Select sel = new Select(udfSelectionWebElement);
			
			List<WebElement> list = sel.getOptions();	
			
			
			for(WebElement ele : list){
				
				if(ele.getText().equals(uniqueUdfName1)){
					ele.click();
					 Thread.sleep(2000);					
					break;
				}
			}
			return true;
	} catch (Exception e) {

	}
			
		return false;
}

public boolean transferClientToUdfValue(String udfValue){	
	 
	 try {
		Thread.sleep(4000);
		 
		 WebElement udfValueSelectionWebElement=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(selectUdfTransferTo_xpath));		
			Select sel = new Select(udfValueSelectionWebElement);
			
			List<WebElement> list = sel.getOptions();	
			
			
			for(WebElement ele : list){
				
				if(ele.getText().equals(udfValue)){
					ele.click();
					 Thread.sleep(2000);					
					break;
				}
			}
			return true;
	} catch (Exception e) {

	}
			
		return false;
}

public boolean selectClient(){
	try{
		WebElement selectWebElement=new WebDriverWait(driver,60).until(ExpectedConditions.visibilityOfElementLocated(firstClientInList_xpath));
		selectWebElement.click();
		return true;
	}
	catch(Exception e){
		
	}
	return false;
}


public boolean transferClientToUdfAfterSelection(){	
	 
	 try {
		Thread.sleep(4000);
		
		 WebElement udfSelectionWebElement=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(selectUdfTransferToAfterSelection_xpath));		
			Select sel = new Select(udfSelectionWebElement);
			
			List<WebElement> list = sel.getOptions();	
			
			
			for(WebElement ele : list){
				
				if(ele.getText().equals(uniqueUdfDescription3)){
					ele.click();
					 Thread.sleep(2000);					
					break;
				}
			}
			return true;
	} catch (Exception e) {

	}
			
		return false;
}

public boolean transferClientToUdfValueAfterSelection(String secUdfValue){	
	 
	 try {
		Thread.sleep(4000);
		 
		 WebElement udfValueSelectionWebElement=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(selectUdfTransferToAfterSelection_xpath));		
			Select sel = new Select(udfValueSelectionWebElement);
			
			List<WebElement> list = sel.getOptions();	
			
			
			for(WebElement ele : list){
				
				if(ele.getText().equals(secUdfValue)){
					ele.click();
					 Thread.sleep(2000);					
					break;
				}
			}
			return true;
	} catch (Exception e) {

	}
			
		return false;
}

public boolean clickOnTransfer(){
try{
	Thread.sleep(2000);
	WebElement transferWebElement=new WebDriverWait(driver,60).until(ExpectedConditions.visibilityOfElementLocated(transferClientTransfer_xpath));
	transferWebElement.click();
	Thread.sleep(1000);
		return true;

}
catch(Exception e){
	
}
return false;

}


public boolean clickOnTransferYes()
{
	try{
		//Thread.sleep(4000);	
		WebElement deleteYesWebElement=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(yesDelete_xpath));
		deleteYesWebElement.click();
		Thread.sleep(4000);
		return true;
	}
	catch(Exception e){
		
	}
	return false;
}

public boolean verifyMsg(){
try{
	//Thread.sleep(3000);
	WebElement transferWebElement=new WebDriverWait(driver,60).until(ExpectedConditions.visibilityOfElementLocated(warningMessage_xpath));
	transferWebElement.isDisplayed();
		return true;

}
catch(Exception e){
	
}
return false;

}

public boolean clickOnTransferNo()
{
	try{
		//Thread.sleep(4000);	
		WebElement deleteYesWebElement=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(transferNo_xpath));
		deleteYesWebElement.click();
		Thread.sleep(4000);
		return true;
	}
	catch(Exception e){
		
	}
	return false;
}

}


