package com.cync.pages;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.SkipException;

import com.cync.base.BasePage;



public class BBCFileRequiredPage extends BasePage {

        private final By BBCFileRequiredHeader_xpath=By.xpath("//span[contains(text(),'BBC Files Required')]");
        private final By addIconBBCFilesRequired_xpath=By.xpath("//span[@class='ui-icon ui-icon ui-icon-plus']");
	private final By collateralNameDropdown_xpath=By.xpath("(//select[@name='mapping_id'])[2]");
	private final By saveIconBBCFilesRequired_xpath=By.xpath("//span[@class='ui-icon ui-icon ui-icon-disk']");
	private final By saveBBCFilesRequiredSuccessmsg_xpath=By.xpath("//div[text()='BBC Files Required was successfully created.']");
	private final By closeMsgDialog_xpath=By.xpath("//a[@id='closedialog']");
    

	 private final By Division_xpath=By.xpath("//select[@id='division_code_id']");
	    private final By MappingNameDropdown_xpath=By.xpath("(//select[@class='editable inline-edit-cell ui-widget-content ui-corner-all'])[1]");
	    private final By GridAddIcon_xpath=By.xpath("//*[@class='ui-pg-div']//span[@class='ui-icon ui-icon ui-icon-plus']");
    
     private final By AddBtn_xpath=By.xpath("//*[@class='ui-pg-div']//*[contains(@class,'ui-icon ui-icon ui-icon-plus')]");
	//Author Garima
	
	private final By MappingNameHeader_xpath=By.id("jqgh_borrower_addendums_list_mapping_id");
	private final By ColletralNameHeader_xpath=By.id("jqgh_borrower_addendums_list_data_type");
	private final By DescriptionHeader_xpath=By.id("jqgh_borrower_addendums_list_source_documents_name");
	
	
	private final By FileFormatHeader_xpath=By.id("jqgh_borrower_addendums_list_file_format");
	private final By SelectColletralFromHeader_xpath=By.id("jqgh_borrower_addendums_list_select_collateral_from");
	private final By FrequencyHeader_xpath=By.id("jqgh_borrower_addendums_list_frequency");
	private final By FileClassification_xpath=By.id("jqgh_borrower_addendums_list_file_classification_id");
//	private final By LastBBC_xpath=By.id("jqgh_borrower_addendums_list_last_period");
	
	
	//  Author Kurthivas
	private final By LastBBC_xpath=By.xpath("//div[@class='ui-th-div ui-jqgrid-sortable']//self::div[@id='jqgh_borrower_addendums_list_last_period']");
	private final By NextBBC_xpath1=By.xpath("//input[@id='gs_next_period']");
	private final By NextBBC_xpath=By.id("jqgh_borrower_addendums_list_next_period");
	private final By DaysToRecipt_xpath=By.id("jqgh_borrower_addendums_list_days_to_receipt");
	private final By NotificationDays_xpath=By.id("jqgh_borrower_addendums_list_notification_days");
	private final By DeleteIcon_xpath=By.xpath("//span[@class='ui-icon ui-icon-trash']");
	private final By SearchIcon_xpath=By.xpath("//span[@class='ui-icon ui-icon-search']");
	private final By ReloadIcon_xpath=By.xpath("//span[@class='ui-icon ui-icon-refresh']");
	private final By AddIcon_xpath=By.xpath("//span[@class='ui-icon ui-icon ui-icon-plus']");
	private final By SaveIcon_xpath=By.xpath("//span[@class='ui-icon ui-icon ui-icon-disk']");
	private final By CancleIcon_xpath=By.xpath("//span[@class='ui-icon ui-icon ui-icon-cancel']");
	private final By ExportIcon_xpath=By.xpath("(//div[@class='ui-pg-div'])[7]");
	private final  By NextBBcSearch_xpath=By.id("gs_next_period");
	
	private final By Mapping_xpath=By.id("gs_mapping_id");
	/*private final By NewFile_xpath=By.xpath("//table[@id='borrower_addendums_list']/tbody/tr[2]/td[6]");*/
	private final By NewFile_xpath=By.xpath("//td[contains(text(),'XLS')]");

	private final By Description_xpath=By.xpath("//input[@name='source_documents_name']");
	private final By Sucessmessage_xpath=By.xpath("//div[@class='ui-state-success']");//div[@class='ui-state-error']
	private final By DilogBoxclose_xpath=By.id("closedialog");
	private final By Frequency_xpath=By.xpath(" //td[contains(text(),'Monthly')]");
	private final By Verifydate_xpath=By.id("bbc_bbc_dt");
	private final By VerifyNextBBcDate_xpath=By.xpath("//td[contains(text(),'12/15/2018')]");
	private final By checkBox_xpath=By.xpath("(//input[@type='checkbox'])[6]");
	private final By delete_xpath=By.id("dData");
	private final By Nextseasrch_xpath=By.xpath(" //input[@id='gs_next_period']");
	private final By EnterDayTReciept_xpath=By.xpath("(//input[@name='days_to_receipt'])[2]");
	private final By tabinFileClassification_xpath=By.xpath("//input[@name='next_date']");
	private final By ErroeMessage_xpath=By.xpath("//div[@class='ui-state-error']");
	private final By enterValueInNotificationDays_xpath=By.xpath("(//input[@name='notification_days'])[2]");
	private final By Download_xpath=By.xpath("//div[@class='export']");
	private final By searchanybox_xpath=By.xpath("//select[@class='opsel ui-widget-content ui-corner-all']");
	private final By searchasofdate_xpath=By.xpath("//td[@class='columns']//select[@class='ui-widget-content ui-corner-all'][1]");
	private final By SelectAll_xpath=By.xpath("//select[@class='input-elm ui-widget-content ui-corner-all']");
	private final By searchfind_xpath=By.xpath("//td[@class='EditButton']//a[@class='fm-button ui-state-default ui-corner-all fm-button-icon-right ui-search']");
	private final By FirstPage_xpath=By.xpath("//span[@class='ui-icon ui-icon-seek-first']");
	private final By previouspage_xpath=By.xpath("//span[@class='ui-icon ui-icon-seek-prev']");
	private final By Nextpage_xpath=By.xpath("//span[@class='ui-icon ui-icon-seek-next']");
	private final By lastpage_xpath=By.xpath("//span[@class='ui-icon ui-icon-seek-end']");
	private final By clikOnMappings_xpath=By.xpath(" //td[contains(text(),'BBc file requires 1')]");
	private final By Tab_xpath=By.xpath("//select[@name='file_classification_id']");
	private final By clikOnMappings_xpath1=By.xpath("//table[@id='borrower_addendums_list']//descendant::td[contains(text(),'Mapping6')]");

    
    
    
    public BBCFileRequiredPage(WebDriver driver) {
	super(driver);
	try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	if(!driver.findElement(BBCFileRequiredHeader_xpath).getText().trim().equals("BBC Files Required")){
		throw new SkipException("sales region couldn't open.");
	}
}

    
    
    public boolean clickaddIconBBCFilesRequired()
	{
	try{

		WebElement clickaddIconBBCFilesRequiredWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(addIconBBCFilesRequired_xpath));
		clickaddIconBBCFilesRequiredWebEelement.click();
		Thread.sleep(1000);
	
return true;
	}
	catch(Exception ex){
		return false;
	}

	}
	
    
	public boolean collateralNameDropdownValues(String collateralNameDropdownValue) {
		try {
			WebElement productTypeDropdownWebEelement = new WebDriverWait(
					driver, 10).until(ExpectedConditions
					.visibilityOfElementLocated(collateralNameDropdown_xpath));
			Select sel = new Select(productTypeDropdownWebEelement);
			sel.selectByVisibleText(collateralNameDropdownValue);
			/*List<WebElement> list = sel.getOptions();
			for (WebElement ele : list) {
				if (ele.getText().equals(collateralNameDropdownValue)) {
					ele.click();
					
					return true;
				}
			}*/

			return true;

		} catch (Exception ex) {
		}
		return false;
	}
	
	
	public boolean saveIconBBCFilesRequired()
	{
	try{
        
		WebElement saveIconBBCFilesRequiredWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(saveIconBBCFilesRequired_xpath));
		saveIconBBCFilesRequiredWebEelement.click();
		Thread.sleep(1000);

		
return true;
	}
	catch(Exception ex){
		return false;
	}

	}
	
	
	
	
	public String saveBBCFilesRequiredSuccessmsg(String messageOnBBCFileRequired)
	    {
	    try{
	       WebElement SaveWebEelement=new WebDriverWait(driver,10)
	       .until(ExpectedConditions.visibilityOfElementLocated(saveBBCFilesRequiredSuccessmsg_xpath));
	       
	      String actualMsgFromAPP= SaveWebEelement.getText();
	      if(actualMsgFromAPP.equalsIgnoreCase(messageOnBBCFileRequired))
	      {
	       return actualMsgFromAPP;
	      }
	       
	    }
	    catch(Exception ex){
	     
	    }
	 return messageOnBBCFileRequired;
	    }

	
	
	public boolean closeMsgDialog()
	{
	try{

		WebElement closeMsgDialogWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(closeMsgDialog_xpath));
		closeMsgDialogWebEelement.click();
		Thread.sleep(1000);

		
return true;
	}
	catch(Exception ex){
		return false;
	}

	}

	public boolean SelectDivisionFromDropDown(String Division) {
		try {
			WebElement productTypeDropdownWebEelement = new WebDriverWait(
					driver, 10).until(ExpectedConditions
					.visibilityOfElementLocated(Division_xpath));
			Select sel = new Select(productTypeDropdownWebEelement);
			sel.selectByVisibleText(Division);
			/*List<WebElement> list = sel.getOptions();
			for (WebElement ele : list) {
				if (ele.getText().equals(Division)) {
					ele.click();					
				//Thread.sleep(1000);	
				}
			}*/
			Thread.sleep(500);
		}
				catch (Exception ex) {
				    return false;
				}
		return true;

			}

	public boolean SelectDivisionFromDropDown1(String Division) {
		try {
			WebElement productTypeDropdownWebEelement = new WebDriverWait(
					driver, 10).until(ExpectedConditions
					.visibilityOfElementLocated(Division_xpath));
			Select sel = new Select(productTypeDropdownWebEelement);
			//sel.selectByVisibleText(Division);
			List<WebElement> list = sel.getOptions();
			for (WebElement ele : list) {
				if (ele.getText().equals(Division)) {
					ele.click();					
				}
			}
			Thread.sleep(3000);
		}
				catch (Exception ex) {
				    return false;
				}
		return true;

			}

	
	//Method to Verify Mapping Name Header

	public boolean verifyMappingNameHeader() {
		try {
		    WebElement clickonclientname = new WebDriverWait(driver,10)
			    .until(ExpectedConditions .visibilityOfElementLocated(MappingNameHeader_xpath));
		    clickonclientname.isDisplayed();

		    Thread.sleep(1000);
		    return true;
		} catch (Exception ex) {
		    return false;
		}

	}

	//Method to Verify Colletral Name Header

	public boolean verifyColletralNameHeader() {
		try {
		    WebElement clickonclientname = new WebDriverWait(driver,10)
			    .until(ExpectedConditions .visibilityOfElementLocated(ColletralNameHeader_xpath));
		    clickonclientname.isDisplayed();
		    Thread.sleep(1000);
		    return true;
		} catch (Exception ex) {
		    return false;
		}

	}

	//Method to Verify Description Header

	public boolean verifyDescriptionNameHeader() {
		try {
		    WebElement clickonclientname = new WebDriverWait(driver,10)
			    .until(ExpectedConditions .visibilityOfElementLocated(DescriptionHeader_xpath));
		    clickonclientname.isDisplayed();

		    Thread.sleep(1000);


		    Thread.sleep(1000);


		    return true;
		} catch (Exception ex) {
		    return false;
		}

	}

	//Method to Verify File format Header

	public boolean verifyFileFormatHeader() {
		try {
		    WebElement clickonclientname = new WebDriverWait(driver,10)
			    .until(ExpectedConditions .visibilityOfElementLocated(FileFormatHeader_xpath));
		    clickonclientname.isDisplayed();
		    Thread.sleep(1000);
		    return true;
		} catch (Exception ex) {
		    return false;
		}

	}

	//Method to Verify Select Colletral From

	public boolean verifySelectColletralFromHeader() {
		try {
		    WebElement clickonclientname = new WebDriverWait(driver,10)
			    .until(ExpectedConditions .visibilityOfElementLocated(SelectColletralFromHeader_xpath));
		    clickonclientname.isDisplayed();
		    Thread.sleep(1000);
		    return true;
		} catch (Exception ex) {
		    return false;
		}

	}

	//Method to Verify Frequency Header


	public boolean verifyFrequencyHeader() {
		try {
		    WebElement clickonclientname = new WebDriverWait(driver,10)
			    .until(ExpectedConditions .visibilityOfElementLocated(FrequencyHeader_xpath));
		    clickonclientname.isDisplayed();
		    Thread.sleep(1000);
		    return true;
		} catch (Exception ex) {
		    return false;
		}

	}

	//Method to Verify File Classification Header

	public boolean verifyFileClassificatinHeader() {
		try {
		    WebElement clickonclientname = new WebDriverWait(driver,10)
			    .until(ExpectedConditions .visibilityOfElementLocated(FileClassification_xpath));
		    clickonclientname.isDisplayed();

		    Thread.sleep(1000);

		    Actions action = new Actions(driver);
		    action.sendKeys(Keys.TAB).build().perform();

		    //Thread.sleep(3000);


		    return true;
		} catch (Exception ex) {
		    return false;
		}

	}
	//Method to tab
	
	public boolean tabonFileClassification() {
		try {
		    WebElement clickonclientname = new WebDriverWait(driver,10)
			    .until(ExpectedConditions .visibilityOfElementLocated(Tab_xpath));
		    clickonclientname.isDisplayed();
		    Thread.sleep(3000);
		    Actions action = new Actions(driver);
		    action.sendKeys(Keys.TAB).build().perform();
		    Actions action1 = new Actions(driver);
		    action1.sendKeys(Keys.TAB).build().perform();
            
		    return true;
		} catch (Exception ex) {
		    return false;
		}

	}

	//Method To Verify Last BBC Header


	public boolean verifyLastBBCHeader() {
		try {
			
		    WebElement clickonclientname = new WebDriverWait(driver,10)
			    .until(ExpectedConditions .visibilityOfElementLocated(LastBBC_xpath));
		    clickonclientname.isDisplayed();
		    clickonclientname.click();
		    Thread.sleep(1000);
		  
		    /*clickonclientname.sendKeys(Keys.ESCAPE);
		    clickonclientname.sendKeys(Keys.TAB);
		    clickonclientname.sendKeys(Keys.ESCAPE);*/
		    
		   // Thread.sleep(500);
		    return true;
		} catch (Exception ex) {
		    return false;
		}

	}

	//Method To Verify Next BBC Header

	public boolean verifyNextBBCHeader() {
		try {
		    WebElement clickonclientname = new WebDriverWait(driver,10)
			    .until(ExpectedConditions .visibilityOfElementLocated(NextBBC_xpath));
		    clickonclientname.isDisplayed();
    Thread.sleep(1000);
		    Thread.sleep(1000);
		    clickonclientname.isDisplayed();
		   
		    
		    
		   // Thread.sleep(500);
		    return true;
		} catch (Exception ex) {
		    return false;
		}

	}

	//Method to Verify Days To Recipt


	public boolean verifyDaysToReciptHeader() {
		try {
			
		    WebElement clickonclientname = new WebDriverWait(driver,10)
			    .until(ExpectedConditions .visibilityOfElementLocated(DaysToRecipt_xpath));
		    clickonclientname.isDisplayed();
		    Thread.sleep(1000);
		    return true;
		} catch (Exception ex) {
		    return false;
		}

	}


	//Method to Verify Notification Days

	public boolean verifyNotificatinDaysHeader() {
		try {
		    WebElement clickonclientname = new WebDriverWait(driver,10)
			    .until(ExpectedConditions .visibilityOfElementLocated(NotificationDays_xpath));
		    clickonclientname.isDisplayed();
		    Thread.sleep(1000);
		    return true;
		} catch (Exception ex) {
		    return false;
		}

	}

	//Method To Verify Delete Icon

	public boolean verifyDeleteIcon() {
		try {
		    WebElement clickonclientname = new WebDriverWait(driver,10)
			    .until(ExpectedConditions .visibilityOfElementLocated(DeleteIcon_xpath));
		    clickonclientname.isDisplayed();
		    Thread.sleep(1000);
		    return true;
		} catch (Exception ex) {
		    return false;
		}

	}

	//Method To Verify Search Icon

	public boolean verifySearchIcon() {
		try {
		    WebElement clickonclientname = new WebDriverWait(driver,10)
			    .until(ExpectedConditions .visibilityOfElementLocated(SearchIcon_xpath));
		    clickonclientname.isDisplayed();
		    Thread.sleep(1000);
		    return true;
		} catch (Exception ex) {
		    return false;
		}

	}

	//Method To Verify Reload Icon


	public boolean verifyReloadIcon() {
		try {
		    WebElement clickonclientname = new WebDriverWait(driver,10)
			    .until(ExpectedConditions .visibilityOfElementLocated(ReloadIcon_xpath));
		    clickonclientname.isDisplayed();
		    Thread.sleep(1000);
		    return true;
		} catch (Exception ex) {
		    return false;
		}

	}


	//Method to Verify Add Icon

	public boolean verifyAddIcon() {
		try {
		    WebElement clickonclientname = new WebDriverWait(driver,10)
			    .until(ExpectedConditions .visibilityOfElementLocated(AddIcon_xpath));
		    clickonclientname.isDisplayed();
		    Thread.sleep(1000);
		    return true;
		} catch (Exception ex) {
		    return false;
		}

	}

	//Method To Verify Save Icon

	public boolean verifySaveIcon() {
		try {
		    WebElement clickonclientname = new WebDriverWait(driver,10)
			    .until(ExpectedConditions .visibilityOfElementLocated(SaveIcon_xpath));
		    clickonclientname.isDisplayed();

		    Thread.sleep(1000);

		    return true;
		} catch (Exception ex) {
		    return false;
		}

	}

	//Method To Verify Cancle Icon


	public boolean verifyCancleIcon() {
		try {
		    WebElement clickonclientname = new WebDriverWait(driver,10)
			    .until(ExpectedConditions .visibilityOfElementLocated(CancleIcon_xpath));
		    clickonclientname.isDisplayed();

		    Thread.sleep(1000);
		    return true;
		} catch (Exception ex) {
		    return false;
		}

	}

	//Method To Verify Export Icon

	public boolean verifyExportIcon() {
		try {
		    WebElement clickonclientname = new WebDriverWait(driver,10)
			    .until(ExpectedConditions .visibilityOfElementLocated(ExportIcon_xpath));
		    clickonclientname.isDisplayed();

		    Thread.sleep(1000);
		    return true;
		} catch (Exception ex) {
		    return false;
		}

	}

	//Method to Tab on BBc Date

	public boolean clickNextBBCDate() {
		try {
		    WebElement clickoncolletralsearch = new WebDriverWait(driver,10)
			    .until(ExpectedConditions .visibilityOfElementLocated(NextBBcSearch_xpath));
		    clickoncolletralsearch.click();
		    Actions action = new Actions(driver);
		    action.sendKeys(Keys.TAB).build().perform();
		  
		   Thread.sleep(1000);
		    return true;
		} catch (Exception ex) {
		    return false;
		}

	    }



	//Method to Click on Add Icon

	public boolean clickOnAddIcon() {
		try {
			Thread.sleep(2000);
		    WebElement clickonclientname = new WebDriverWait(driver,10)
			    .until(ExpectedConditions .visibilityOfElementLocated(AddIcon_xpath));
		    clickonclientname.click();
		    
		    return true;
		} catch (Exception ex) {
		    return false;
		}

	}

	//Method to Verify Mapping Name

	public boolean clickOnMappingName() {
		try {
		    WebElement clickonclientname = new WebDriverWait(driver,10)
			    .until(ExpectedConditions .visibilityOfElementLocated(Mapping_xpath));
		    clickonclientname.click();
		    
		    return true;
		} catch (Exception ex) {
		    return false;
		}

	}

	//Method to  Click on New Mapping Name

	public String  clickOnNewMappingNameDropdownValues(String collateralNameDropdownValue) {
		try {
			WebElement productTypeDropdownWebEelement = new WebDriverWait(driver, 10).until(ExpectedConditions
					.visibilityOfElementLocated(collateralNameDropdown_xpath));
			Select sel = new Select(productTypeDropdownWebEelement);
			sel.selectByVisibleText(collateralNameDropdownValue);
			/*List<WebElement> list = sel.getOptions();
			for (WebElement ele : list) {
				if (ele.getText().equalsIgnoreCase(collateralNameDropdownValue)) {
					
					ele.click();
					Thread.sleep(2000);
					System.out.println(ele);

				}

			}*/
		} catch (Exception ex) {
		}

		return collateralNameDropdownValue;
	}
	
	 public boolean clickaddIconInGrid()
		{
		try{

			WebElement clickaddIconBBCFilesRequiredWebEelement=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(GridAddIcon_xpath));
			clickaddIconBBCFilesRequiredWebEelement.click();	
	return true;
		}
		catch(Exception ex){
			return false;
		}

		}
	 
	 public boolean clickaddIconInGrid1()
		{
		try{

			WebElement clickaddIconBBCFilesRequiredWebEelement=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(AddBtn_xpath));
			clickaddIconBBCFilesRequiredWebEelement.click();	
			Thread.sleep(1000);
	return true;
		}
		catch(Exception ex){
			return false;
		}

		}
	
	public boolean SelectMappingNameFromDropDown(String MappingName) {
		try {
			WebElement productTypeDropdownWebEelement = new WebDriverWait(
					driver, 10).until(ExpectedConditions
					.visibilityOfElementLocated(MappingNameDropdown_xpath));
			Select sel = new Select(productTypeDropdownWebEelement);
			sel.selectByVisibleText(MappingName);
			/*List<WebElement> list = sel.getOptions();
			for (WebElement ele : list) {
				if (ele.getText().equals(MappingName)) {
					ele.click();
					//Thread.sleep(1000);
					return true;
				}
			}*/

			return true;

		} catch (Exception ex) {
		}
		return false;
	}

	
	public boolean SelectMappingNameFromDropDown1(String MappingName) {
		try {
			WebElement productTypeDropdownWebEelement = new WebDriverWait(
					driver, 10).until(ExpectedConditions
					.visibilityOfElementLocated(MappingNameDropdown_xpath));
			Select sel = new Select(productTypeDropdownWebEelement);
			//sel.selectByVisibleText(MappingName);
			List<WebElement> list = sel.getOptions();
			for (WebElement ele : list) {
				if (ele.getText().equals(MappingName)) {
					ele.click();
					Thread.sleep(1000);
					return true;
				}
			}

			return true;

		} catch (Exception ex) {
		}
		return false;
	}

	
	//Method For Verify New File Format


	public boolean verifyNewFileValue() {
		try {
		    WebElement clickonclientname = new WebDriverWait(driver,10)
			    .until(ExpectedConditions .visibilityOfElementLocated(NewFile_xpath));
		    String val=clickonclientname.getText();
		    
		    System.out.println(val);
		    return true;
		} catch (Exception ex) {
		    return false;
		}

	}

	//Method to Enter Value in Description

	public String enterDataInDescription(String value) {
		try {
			WebElement ClickOnBucketNameField = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(Description_xpath));
			ClickOnBucketNameField.clear();
			ClickOnBucketNameField.sendKeys(value);

		} catch (Exception ex) {

		}
		return value;
	}

	//Method to click on save

	public boolean clickOnSave() {
		try {
		    WebElement clickonclientname = new WebDriverWait(driver,10)
			    .until(ExpectedConditions .visibilityOfElementLocated(SaveIcon_xpath));
		    clickonclientname.click();
		    
		    return true;
		} catch (Exception ex) {
		    return false;
		}

	}
	//Method to verify sucess message

	public boolean verifySucessMessage() {
		try {
		    WebElement clickonclientname = new WebDriverWait(driver,10)
			    .until(ExpectedConditions .visibilityOfElementLocated(Sucessmessage_xpath));
		    clickonclientname.isDisplayed();
		    
		    return true;
		} catch (Exception ex) {
		    return false;
		}

	}

	//Method For ErrorMessage


	public boolean verifyErrorMessage() {
		try {
		    WebElement clickonclientname = new WebDriverWait(driver,10)
			    .until(ExpectedConditions .visibilityOfElementLocated(ErroeMessage_xpath));
		    clickonclientname.isDisplayed();
		    
		    return true;
		} catch (Exception ex) {
		    return false;
		}

	}
	//Method to click on close

	public boolean clickOnClose() {
		try {
		    WebElement clickonclientname = new WebDriverWait(driver,10)
			    .until(ExpectedConditions .visibilityOfElementLocated(DilogBoxclose_xpath));
		    clickonclientname.click();

		    Thread.sleep(1000);

		    return true;
		} catch (Exception ex) {
		    return false;
		}

	}

	//Method to Verify frequency value

	public boolean verifyFrequencyValue() {
		try {
		    WebElement clickonclientname = new WebDriverWait(driver,10)
			    .until(ExpectedConditions .visibilityOfElementLocated(Frequency_xpath));
		    String val=clickonclientname.getText();
		    System.out.println(val);
		    return true;
		} catch (Exception ex) {
		    return false;
		}

	}


	//Method to Capture Next BBC date from BBC file required screen

	public boolean getNextBBcDateFromBBCFileScreen()
	{
		  try{
			  WebElement getdatafrombasicclient=new WebDriverWait(driver,10)
			  .until(ExpectedConditions.visibilityOfElementLocated(VerifyNextBBcDate_xpath));
			 /*String valueclient= getdatafrombasicclient.getAttribute("value");*/
			  String valu=getdatafrombasicclient.getText();
			  System.out.println(valu);
			  Thread.sleep(1000);

		  return true;
		  }
	catch(Exception ex){
			return false;
		}
	}





	//Method to select check box

	public boolean clickOnCheckbox() {
		try {
		    WebElement clickonclientname = new WebDriverWait(driver,10)
			    .until(ExpectedConditions .visibilityOfElementLocated(checkBox_xpath));
		    clickonclientname.click();
		    
		    return true;
		} catch (Exception ex) {
		    return false;
		}

	}

	//Method to Click on delete icon

	public boolean clickOnDeleteIcon() {
		try {
		    WebElement clickonclientname = new WebDriverWait(driver,10)
			    .until(ExpectedConditions .visibilityOfElementLocated(DeleteIcon_xpath));
		    clickonclientname.click();
		    
		    return true;
		} catch (Exception ex) {
		    return false;
		}

	}
	//Method to select delete

	public boolean clickOnDelete() {
		try {
		    WebElement clickonclientname = new WebDriverWait(driver,10)
			    .until(ExpectedConditions .visibilityOfElementLocated(delete_xpath));
		    clickonclientname.click();

		    Thread.sleep(1000);

		    return true;
		} catch (Exception ex) {
		    return false;
		}

	}
	//Method to click on File Classification

	public boolean tabOnFileClassification() {
		try {
			WebElement clickoncolletralsearch = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(tabinFileClassification_xpath));
			clickoncolletralsearch.click();
			Actions action = new Actions(driver);
			action.sendKeys(Keys.TAB).build().perform();
			Actions action1 = new Actions(driver);
			action1.sendKeys(Keys.TAB).build().perform();

			Thread.sleep(1000);

			return true;
		} catch (Exception ex) {
			return false;
		}
	}

	//Method to enter value in dAY TO Recipt

	public String enterValueInDaysToRecipt(String value) {
		try {
		    WebElement clickonclientname = new WebDriverWait(driver,10)
			    .until(ExpectedConditions .visibilityOfElementLocated(EnterDayTReciept_xpath));
		    clickonclientname.clear();
		    clickonclientname.sendKeys(value);

		    Thread.sleep(1000);

		    
		} catch (Exception ex) {
		  
		}
	return value;
	}

	//Method to enter value in Notification Days

	public String enterValueInNotificationDays(String value) {
		try {
		    WebElement clickonclientname = new WebDriverWait(driver,10)
			    .until(ExpectedConditions .visibilityOfElementLocated(enterValueInNotificationDays_xpath));
		    clickonclientname.clear();
		    clickonclientname.sendKeys(value);

		    Thread.sleep(1000);

		    
		} catch (Exception ex) {
		  
		}
	return value;
	}

	//Method to Click on cancle

	public boolean clickOnCancle() {
		try {
		    WebElement clickonclientname = new WebDriverWait(driver,10)
			    .until(ExpectedConditions .visibilityOfElementLocated(CancleIcon_xpath));
		    clickonclientname.click();

		    Thread.sleep(1000);

		    return true;
		} catch (Exception ex) {
		    return false;
		}

	}

	//Method to Click on Export

	public boolean clickExportIcon() {
		try {
		    WebElement clickonclientname = new WebDriverWait(driver,10)
			    .until(ExpectedConditions .visibilityOfElementLocated(ExportIcon_xpath));
		    clickonclientname.click();

		    Thread.sleep(1000);

		    return true;
		} catch (Exception ex) {
		    return false;
		}

	}
	//Method to Click on Download

	public boolean clickOnDownload() {
		try {
		    WebElement clickonclientname = new WebDriverWait(driver,10)
			    .until(ExpectedConditions .visibilityOfElementLocated(Download_xpath));
		    clickonclientname.click();

		    Thread.sleep(1000);

		    return true;
		} catch (Exception ex) {
		    return false;
		}

	}

	//Method to click on reload

	public boolean clickReloadIcon() {
		try {
		    WebElement clickonclientname = new WebDriverWait(driver,10)
			    .until(ExpectedConditions .visibilityOfElementLocated(ReloadIcon_xpath));

		    clickonclientname.clear();
		    Thread.sleep(1000);
		    return true;
		} catch (Exception ex) {
		    return false;
		}

	}

	//Method For search

	public boolean clickOnSearchIcon() {
		try {
		    WebElement clickonclientname = new WebDriverWait(driver,10)
			    .until(ExpectedConditions .visibilityOfElementLocated(SearchIcon_xpath));
		    clickonclientname.click();
		    Thread.sleep(1000);
		    return true;
		} catch (Exception ex) {
		    return false;
		}

	}
	//Method to click on All

	public String clickOnFirstDilogBoxOfSearch(String ClientData)
	{
	try{
	WebElement searchany =new WebDriverWait(driver,10)
	.until(ExpectedConditions.visibilityOfElementLocated(searchanybox_xpath));
	searchany.click();
	searchany.sendKeys(ClientData);

	}
	catch(Exception ex){

	}
	return ClientData;

	}

	//Method to select Mapping Name

	public String clickOnSearchMappingName(String ClientData) throws InterruptedException{
		

		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated((searchasofdate_xpath)));

		WebElement element = driver.findElement((searchasofdate_xpath));
		Select sel = new Select(element);
		sel.selectByVisibleText(ClientData);
		/*List<WebElement> list = sel.getOptions();	
		
		
		for(WebElement ele : list){
			
			if(ele.getText().equals(ClientData)){
				ele.click();
				//Thread.sleep(10000);
				break;
			}
		}*/
		return ClientData;
	}

	//Method to click on all


	public String clickOnAll(String ClientData) throws InterruptedException{
		

		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated((SelectAll_xpath)));

		WebElement element = driver.findElement((SelectAll_xpath));
		Select sel = new Select(element);

		sel.selectByVisibleText(ClientData);
		/*List<WebElement> list = sel.getOptions();	
=======
		
		List<WebElement> list = sel.getOptions();	
>>>>>>> Stashed changes
		
		
		for(WebElement ele : list){
			
			if(ele.getText().equals(ClientData)){
				ele.click();
				//Thread.sleep(10000);
				break;
			}
		}*/
		return ClientData;
	}


	//Method to click on find

	public boolean clickOnFind()
	{
	try{
	WebElement find =new WebDriverWait(driver,10)
	.until(ExpectedConditions.visibilityOfElementLocated(searchfind_xpath));
	find.click();
	Thread.sleep(1000);

	return true;
	}
	catch(Exception ex){

	}
	return false;


	}

	//Method to Double click 
	public boolean doubleClickOnMapping() {
		try {
			WebElement doubleclickonDaysto = new WebDriverWait(driver, 10)
					.until(ExpectedConditions.elementToBeClickable(clikOnMappings_xpath1));
							//visibilityOfElementLocated(clikOnMappings_xpath1));
			Actions action = new Actions(driver);
			action.doubleClick(doubleclickonDaysto).build().perform();
			Thread.sleep(1000);
			Thread.sleep(500);
		    Thread.sleep(1000);

			return true;
		} catch (Exception e) {

		}
		return false;

	}

	//Method to click on first page

	public boolean clickOnFirstPageSymbol() {
		try {
		    WebElement clickonclientname = new WebDriverWait(driver,10)
			    .until(ExpectedConditions .visibilityOfElementLocated(FirstPage_xpath));
		    clickonclientname.click();


		    Thread.sleep(1000);

		    Thread.sleep(1000);
		    //driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		    return true;
		} catch (Exception ex) {
		    return false;
		}

	}


	//Method to Click on previous Day

	public boolean clickOnPreviousPageSymbol() {
		try {
		    WebElement clickonclientname = new WebDriverWait(driver,10)
			    .until(ExpectedConditions .visibilityOfElementLocated(previouspage_xpath));
		    clickonclientname.click();
		    Thread.sleep(1000);

		    return true;
		} catch (Exception ex) {
		    return false;
		}

	}

	//Method to Click on Next Page

	public boolean clickOnNextPageSymbol() {
		try {
		    WebElement clickonclientname = new WebDriverWait(driver,10)
			    .until(ExpectedConditions .visibilityOfElementLocated(Nextpage_xpath));
		    clickonclientname.click();


		    Thread.sleep(1000);


		    Thread.sleep(1000);
		 //   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		    return true;
		} catch (Exception ex) {
		    return false;
		}

	}

	//Method to Click on last page

	public boolean clickOnLastPageSymbol() {
		try {
		    WebElement clickonclientname = new WebDriverWait(driver,10)
			    .until(ExpectedConditions .visibilityOfElementLocated(lastpage_xpath));
		    clickonclientname.click();

		    Thread.sleep(1000);

		    //Thread.sleep(3000);
		    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		    return true;
		} catch (Exception ex) {
		    return false;
		}

	}
}



