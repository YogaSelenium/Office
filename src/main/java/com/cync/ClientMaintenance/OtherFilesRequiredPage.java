package com.cync.ClientMaintenance;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.cync.base.BasePage;

public class OtherFilesRequiredPage extends BasePage{
	
	private final By DescriptionLabel_xpath = By.xpath("//div[@id='jqgh_reporting_requirement_list_source_documents_name']");
	private final By ClassificationLabel_xpath = By.xpath("//div[@id='jqgh_reporting_requirement_list_file_classification_id']");
	private final By FrequencyLabel_xpath = By.xpath("//th[@id='reporting_requirement_list_frequency']");
	private final By LastPeriod_xpath = By.xpath("//div[@id='jqgh_reporting_requirement_list_last_date']");
	private final By NextPeriod_xpath = By.xpath("//div[@id='jqgh_reporting_requirement_list_next_date']");
	private final By DaysToReceipt_xpath = By.xpath("//div[@id='jqgh_reporting_requirement_list_days_to_receipt']");
	private final By NotificationDays_xpath = By.xpath("//div[@id='jqgh_reporting_requirement_list_notification_days']");
	private final By DeleteBtn_xpath = By.xpath("//td[@id='del_reporting_requirement_list']");
	private final By SearchBtn_xpath = By.xpath("//td[@id='search_reporting_requirement_list']");
	private final By ReloadBtn_xpath = By.xpath("//td[@id='refresh_reporting_requirement_list']");
	private final By AddRecordBtn_xpath = By.xpath("//td//span[@class='ui-icon ui-icon ui-icon-plus']");
	private final By SaveRecordBtn_xpath = By.xpath("//td[@title='Save Record']");
	private final By  Creoss_xpath=By.xpath("(//a[@class='ui-jqdialog-titlebar-close ui-corner-all'])[1]");
	private final By CancelBtn_xpath = By.xpath("//td[@title='Cancel']");
	private final By ExportBtn_xpath = By.xpath("//td[@title='Export Data']");
	private final By DescriptionText_xpath = By.xpath("(//input[@type='text'])[8]");
	private final By classification_xpath = By.xpath("(//select[@class='editable inline-edit-cell ui-widget-content ui-corner-all'])[1]");
	private final By Frequency_xpath = By.xpath("(//select[@class='editable inline-edit-cell ui-widget-content ui-corner-all'])[1]");
	private final By NextPeriodText_xpath = By.xpath("//input[@class='editable inline-edit-cell ui-widget-content ui-corner-all hasDatepicker']");
	private final By OtherFilesRequiredMsg_xpath = By.xpath("//div[@class='ui-state-success']");
	private final By ClosePopUp_xpath = By.xpath("//div[@id='info_head']//a[@class='ui-jqdialog-titlebar-close ui-corner-all']");
	private final By CheckOn_xpath = By.xpath("//input[@id='cb_reporting_requirement_list']");
	private final By DeleteBtnPopUp_xpath = By.xpath("(//a[@class='fm-button ui-state-default ui-corner-all fm-button-icon-left'])[1]");
	private final By OtherFilesRequiredDeleteMsg_xpath = By.xpath("//div[text()='Other Files Required was successfully deleted.']");
	private final By OtherFilesRequiredErrorMsg_xpath = By.xpath("//div[@id='infocnt']//div[@class='ui-state-error']");
	private final By FrequencyDropDownValues_xpath = By.xpath("(//select[@class='editable inline-edit-cell ui-widget-content ui-corner-all'])[2]");

	private final By DaysToReceiptText_xpath = By.xpath("(//input[@class='editable inline-edit-cell ui-widget-content ui-corner-all'])[2]");
	private final By NotificationDaysText_xpath = By.xpath("(//input[@class='editable inline-edit-cell ui-widget-content ui-corner-all'])[3]");
	private final By DescriptionSearch_xpath = By.xpath("//input[@id='gs_source_documents_name']");
	private final By OtherFilesRequiredDoubleClick_xpath = By.xpath("(//td[@aria-describedby='reporting_requirement_list_source_documents_name'])[1]");
	private final By DownloadBtn_xpath = By.xpath("//div[@class='export']");
	private final By ExportPopUpClose_xpath = By.xpath("//button[@class='ui-dialog-titlebar-close']");

	private final By PaginationFirstpage_xpath = By.xpath("//span[@class='ui-icon ui-icon-seek-first']");
	private final By Paginationpreviouspage_xpath = By.xpath("//span[@class='ui-icon ui-icon-seek-prev']");
	private final By PaginationNextpage_xpath = By.xpath("//span[@class='ui-icon ui-icon-seek-next']");
	private final By PaginationLastpage_xpath = By.xpath("//span[@class='ui-icon ui-icon-seek-end']");

	

	
	public OtherFilesRequiredPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	
	public boolean Description_label()
	 {
	 try{

	 	WebElement DescriptionWebEelement=new WebDriverWait(driver,5)
	 	.until(ExpectedConditions.visibilityOfElementLocated(DescriptionLabel_xpath));
	 	DescriptionWebEelement.isDisplayed();
	 
	 	return true;
	 }
	 catch(Exception ex){
	 	return false;
	 }

	 } 
	
	public boolean Classification_label()
	 {
	 try{

	 	WebElement ClassificationWebEelement=new WebDriverWait(driver,5)
	 	.until(ExpectedConditions.visibilityOfElementLocated( ClassificationLabel_xpath));
	 	ClassificationWebEelement.isDisplayed();
	
	 	return true;
	 }
	 catch(Exception ex){
	 	return false;
	 }

	 } 
	
	public boolean Frequency_label()
	 {
	 try{

	 	WebElement FrequencyWebEelement=new WebDriverWait(driver,5)
	 	.until(ExpectedConditions.visibilityOfElementLocated( FrequencyLabel_xpath));
	 	FrequencyWebEelement.isDisplayed();
	
	 	return true;
	 }
	 catch(Exception ex){
	 	return false;
	 }

	 } 
	
	
	public boolean LastPeriod_label()
	 {
	 try{

	 	WebElement LastPeriodWebEelement=new WebDriverWait(driver,5)
	 	.until(ExpectedConditions.visibilityOfElementLocated(LastPeriod_xpath));
	 	LastPeriodWebEelement.isDisplayed();
	
	 	return true;
	 }
	 catch(Exception ex){
	 	return false;
	 }

	 } 
	
	
	public boolean NextPeriod_label()
	 {
	 try{

	 	WebElement NextPeriodWebEelement=new WebDriverWait(driver,5)
	 	.until(ExpectedConditions.visibilityOfElementLocated(NextPeriod_xpath));
	 	NextPeriodWebEelement.isDisplayed();
	
	 	return true;
	 }
	 catch(Exception ex){
	 	return false;
	 }

	 } 
	
	public boolean DaysToReceipt_label()
	 {
	 try{

	 	WebElement DaysToReceiptWebEelement=new WebDriverWait(driver,5)
	 	.until(ExpectedConditions.visibilityOfElementLocated(DaysToReceipt_xpath));
	 	DaysToReceiptWebEelement.isDisplayed();
	
	 	return true;
	 }
	 catch(Exception ex){
	 	return false;
	 }

	 }
	
	
	public boolean NotificationDays_label()
	 {
	 try{

	 	WebElement NotificationDaysWebEelement=new WebDriverWait(driver,5)
	 	.until(ExpectedConditions.visibilityOfElementLocated(NotificationDays_xpath));
	 	NotificationDaysWebEelement.isDisplayed();
	
	 	return true;
	 }
	 catch(Exception ex){
	 	return false;
	 }

	 }
	
	
	public boolean DeleteBtn_label()
	 {
	 try{

	 	WebElement DeleteBtnWebEelement=new WebDriverWait(driver,5)
	 	.until(ExpectedConditions.visibilityOfElementLocated(DeleteBtn_xpath));
	 	DeleteBtnWebEelement.isDisplayed();
	
	 	return true;
	 }
	 catch(Exception ex){
	 	return false;
	 }

	 }
	
	public boolean SearchBtn_label()
	 {
	 try{

	 	WebElement SearchBtnWebEelement=new WebDriverWait(driver,5)
	 	.until(ExpectedConditions.visibilityOfElementLocated(SearchBtn_xpath));
	 	SearchBtnWebEelement.isDisplayed();
	
	 	return true;
	 }
	 catch(Exception ex){
	 	return false;
	 }

	 }
	
	public boolean ReloadBtn_label()
	 {
	 try{

	 	WebElement ReloadBtnWebEelement=new WebDriverWait(driver,5)
	 	.until(ExpectedConditions.visibilityOfElementLocated(ReloadBtn_xpath));
	 	ReloadBtnWebEelement.isDisplayed();
	
	 	return true;
	 }
	 catch(Exception ex){
	 	return false;
	 }

	 }
	
	public boolean AddRecordBtn_label()
	 {
	 try{

	 	WebElement AddRecordBtnWebEelement=new WebDriverWait(driver,5)
	 	.until(ExpectedConditions.visibilityOfElementLocated(AddRecordBtn_xpath));
	 	AddRecordBtnWebEelement.isDisplayed();
	
	 	return true;
	 }
	 catch(Exception ex){
	 	return false;
	 }

	 }
	
	public boolean SaveRecordBtn_label()
	 {
	 try{

	 	WebElement SaveRecordBtnWebEelement=new WebDriverWait(driver,5)
	 	.until(ExpectedConditions.visibilityOfElementLocated(SaveRecordBtn_xpath));
	 	SaveRecordBtnWebEelement.isDisplayed();
	
	 	return true;
	 }
	 catch(Exception ex){
	 	return false;
	 }

	 }
	
	public boolean cross()
	 {
	 try{

	 	WebElement SaveRecordBtnWebEelement=new WebDriverWait(driver,5)
	 	.until(ExpectedConditions.visibilityOfElementLocated(Creoss_xpath));
	 	SaveRecordBtnWebEelement.click();
	
	 	return true;
	 }
	 catch(Exception ex){
	 	return false;
	 }

	 }
	
	public boolean CancelBtn_label()
	 {
	 try{

	 	WebElement CancelBtnWebEelement=new WebDriverWait(driver,5)
	 	.until(ExpectedConditions.visibilityOfElementLocated(CancelBtn_xpath));
	 	CancelBtnWebEelement.isDisplayed();
	
	 	return true;
	 }
	 catch(Exception ex){
	 	return false;
	 }
	 
	 }
	
	public boolean ExportBtn_label()
	 {
	 try{

	 	WebElement ExportBtnWebEelement=new WebDriverWait(driver,5)
	 	.until(ExpectedConditions.visibilityOfElementLocated(ExportBtn_xpath));
	 	ExportBtnWebEelement.isDisplayed();
	
	 	return true;
	 }
	 catch(Exception ex){
	 	return false;
	 }

	 }
	
	public boolean AddRecordBtn_click()
	 {
	 try{
        Thread.sleep(1000);
	 	WebElement AddRecordBtnWebEelement=new WebDriverWait(driver,5)
	 	.until(ExpectedConditions.visibilityOfElementLocated(AddRecordBtn_xpath));
	 	AddRecordBtnWebEelement.click();
	 	//////Thread.sleep(500);
	
	 	return true;
	 }
	 catch(Exception ex){
	 	return false;
	 }
	 
	 }
	
	  public boolean DescriptionText(String Dtext)
		{
		try{
			WebElement enterDataWebEelement=new WebDriverWait(driver,5)
				.until(ExpectedConditions.visibilityOfElementLocated(DescriptionText_xpath));
			enterDataWebEelement.clear();
			enterDataWebEelement.sendKeys(Dtext);
			
			return true;
		}
		catch(Exception ex){
			return false;
		}
		}
	
	  public String Classificationt_Dropdown(String classification) throws InterruptedException{

			WebDriverWait wait = new WebDriverWait(driver, 5);
            Thread.sleep(500);
			wait.until(ExpectedConditions.visibilityOfElementLocated((classification_xpath)));
			WebElement element = driver.findElement((classification_xpath));
			Select sel = new Select(element);
			List<WebElement> list = sel.getOptions();	
			for(WebElement ele : list){			
				if(ele.getText().equals(classification)){
					ele.click();
					//////Thread.sleep(10000);
					break;
				}
			}
			return classification;

		}

	  public String Frequency_Dropdown(String Frequency) throws InterruptedException{
			
			WebDriverWait wait = new WebDriverWait(driver, 5);
			wait.until(ExpectedConditions.visibilityOfElementLocated((Frequency_xpath)));
			WebElement element = driver.findElement((Frequency_xpath));
			Select sel = new Select(element);
			List<WebElement> list = sel.getOptions();	
			for(WebElement ele : list){
				
				if(ele.getText().equals(Frequency)){
					ele.click();
					//////Thread.sleep(10000);
					break;
				}
			}
			return Frequency;

		}

	  public boolean NextPeriodText(String NextPeriodText)
		{
		try{
			WebElement enterDataWebEelement=new WebDriverWait(driver,5)
				.until(ExpectedConditions.visibilityOfElementLocated(NextPeriodText_xpath));
			enterDataWebEelement.clear();
			enterDataWebEelement.sendKeys(NextPeriodText);
			
			return true;
		}
		catch(Exception ex){
			return false;
		}
		}
	  
		public boolean SaveRecordBtn_Click()
		 {
		 try{

		 	WebElement SaveRecordBtnWebEelement=new WebDriverWait(driver,5)
		 	.until(ExpectedConditions.visibilityOfElementLocated(SaveRecordBtn_xpath));
		 	SaveRecordBtnWebEelement.click();
			//////Thread.sleep(500);

		
		 	return true;
		 }
		 catch(Exception ex){
		 	return false;
		 }

		 }
		
		
		public String verifyMessageAfterSave(String successMsg)
	    {
	    try{
	       WebElement SaveWebEelement=new WebDriverWait(driver,5)
	       .until(ExpectedConditions.visibilityOfElementLocated(OtherFilesRequiredMsg_xpath));
	       
	      String actualMsg= SaveWebEelement.getText();
	      if(actualMsg.equalsIgnoreCase(successMsg))
	      {
	       return actualMsg;
	      }
	       
	    }
	    catch(Exception ex){
	     
	    }
	 return successMsg;
	    }
		
		
		public boolean CloseBtnPopUp_Click()
		 {
		 try{

		 	WebElement ClosePopUpBtnWebEelement=new WebDriverWait(driver,5)
		 	.until(ExpectedConditions.visibilityOfElementLocated(ClosePopUp_xpath));
		 	ClosePopUpBtnWebEelement.click();

		 	return true;
		 }
		 catch(Exception ex){
		 	return false;
		 }

		 }
		
		public boolean CloseBtnPopUpRefresh_Click()
		 {
		 try{

		 	WebElement ClosePopUpBtnWebEelement=new WebDriverWait(driver,5)
		 	.until(ExpectedConditions.visibilityOfElementLocated(ClosePopUp_xpath));
		 	ClosePopUpBtnWebEelement.click();
			//////Thread.sleep(5000);
		 	driver.navigate().refresh();
			//////Thread.sleep(5000);
			

		 	return true;
		 }
		 catch(Exception ex){
		 	return false;
		 }

		 }

		public boolean CkeckOn_Click()
		 {
		 try{

		 	WebElement CheckOnWebEelement=new WebDriverWait(driver,5)
		 	.until(ExpectedConditions.visibilityOfElementLocated(CheckOn_xpath));
		 	CheckOnWebEelement.click();
		 	//////Thread.sleep(2000);

		 	return true;
		 }
		 catch(Exception ex){
		 	return false;
		 }

		 }
		
	
		
		public boolean DeleteBtn_Click()
		 {
		 try{

		 	WebElement DeleteBtnBtnWebEelement=new WebDriverWait(driver,5)
		 	.until(ExpectedConditions.visibilityOfElementLocated(DeleteBtn_xpath));
		 	DeleteBtnBtnWebEelement.click();
		 	////Thread.sleep(500);

		 	return true;
		 }
		 catch(Exception ex){
		 	return false;
		 }

		 }
		
		public boolean DeleteBtnClick_PopUp()
		 {
		 try{


		 	WebElement DeleteBtnBtnWebEelement=new WebDriverWait(driver,5)
		 	.until(ExpectedConditions.visibilityOfElementLocated(DeleteBtnPopUp_xpath));
		 	DeleteBtnBtnWebEelement.click();
		

		 	return true;
		 }
		 catch(Exception ex){
		 	return false;
		 }

		 }
		
		public String verifyMessageAfterDelete(String successMsgDelete)
	    {
	    try{
	    	////Thread.sleep(1000);
	       WebElement SaveWebEelement=new WebDriverWait(driver,5)
	       .until(ExpectedConditions.visibilityOfElementLocated(OtherFilesRequiredDeleteMsg_xpath));
	       
	      String actualMsg= SaveWebEelement.getText();
	      if(actualMsg.equalsIgnoreCase(successMsgDelete))
	      {
	       return actualMsg;
	      }
	       
	    }
	    catch(Exception ex){
	     
	    }
	 return successMsgDelete;
	    }
		
	
		
		public String verifyErrorMessage(String ErrorMsg)
	    {
	    try{
	       WebElement SaveWebEelement=new WebDriverWait(driver,5)
	       .until(ExpectedConditions.visibilityOfElementLocated(OtherFilesRequiredErrorMsg_xpath));
	       
	      String actualMsg= SaveWebEelement.getText();
	      if(actualMsg.equalsIgnoreCase(ErrorMsg))
	      {
	       return actualMsg;
	      }
	       
	    }
	    catch(Exception ex){
	     
	    }
	 return ErrorMsg;
	    }	
		
	
		public boolean  verifyFrequencyDropdownValues(){
			try {
				String[] exp = {"Daily","Weekly","BiWeekly","Monthly","Quarterly", "SemiAnnual","Annual","OnDemand"};
				
				WebElement dropdown = driver.findElement(FrequencyDropDownValues_xpath);  
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
		
		public boolean selectSystemDate_NextPeriod(){
			try {
			WebElement selectSystemDateWebElement = new WebDriverWait(driver,
			5)
			.until(ExpectedConditions
			.visibilityOfElementLocated(NextPeriodText_xpath));
			Date date = new Date(System.currentTimeMillis());
			SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
			String today=formatter.format(date);

			selectSystemDateWebElement.sendKeys(today);


			return true;
			} catch (Exception e) {
			return false;
			}
			}
		
		 public boolean DaysToReceiptText(String DaysToReceiptText)
			{
			try{
				WebElement enterDataWebEelement=new WebDriverWait(driver,5)
					.until(ExpectedConditions.visibilityOfElementLocated(DaysToReceiptText_xpath));
				enterDataWebEelement.clear();
				enterDataWebEelement.sendKeys(DaysToReceiptText);
				
				return true;
			}
			catch(Exception ex){
				return false;
			}
			}
		
		 public boolean NotificationDaysText(String NotificationDaysText)
			{
			try{
				WebElement enterDataWebEelement=new WebDriverWait(driver,5)
					.until(ExpectedConditions.visibilityOfElementLocated(NotificationDaysText_xpath));
				enterDataWebEelement.clear();
				enterDataWebEelement.sendKeys(NotificationDaysText);
				
				return true;
			}
			catch(Exception ex){
				return false;
			}
			}
	
		 
		 public boolean DescriptionSearch(String DescriptionSearch)
			{
			try{
				WebElement enterDataWebEelement=new WebDriverWait(driver,5)
					.until(ExpectedConditions.visibilityOfElementLocated(DescriptionSearch_xpath));
				enterDataWebEelement.clear();
				enterDataWebEelement.sendKeys(DescriptionSearch);
				//////Thread.sleep(500);
				
				return true;
			}
			catch(Exception ex){
				return false;
			}
			}
		 
		 public boolean DoubleClickVerify()
			{
				try{
				
				WebElement element=new WebDriverWait(driver,5)
				.until(ExpectedConditions.visibilityOfElementLocated(OtherFilesRequiredDoubleClick_xpath));
				//Double click
				Actions action = new Actions(driver);
				action.doubleClick(element).build().perform();
				//////Thread.sleep(2000);
				
				return true;
			}
			

			catch(Exception ex){
				return false;
			}
		}
		 
		 public boolean CancelBtn_Click()
		 {
		 try{

		 	WebElement CancelBtnWebEelement=new WebDriverWait(driver,5)
		 	.until(ExpectedConditions.visibilityOfElementLocated(CancelBtn_xpath));
		 	CancelBtnWebEelement.click();
		 	//////Thread.sleep(500);
		
		 	return true;
		 }
		 catch(Exception ex){
		 	return false;
		 }
		 
		 }
		 
		 public boolean DescriptionTextEdit(String Destext)
			{
			try{
				WebElement enterDataWebEelement=new WebDriverWait(driver,5)
					.until(ExpectedConditions.visibilityOfElementLocated(DescriptionText_xpath));
				enterDataWebEelement.clear();
				enterDataWebEelement.sendKeys(Destext);
				
				return true;
			}
			catch(Exception ex){
				return false;
			}
			}
			 
		 
		 public String CancelBtnClick_searchPreviousData(String search)
		    {
		    try{
		       WebElement SaveWebEelement=new WebDriverWait(driver,5)
		       .until(ExpectedConditions.visibilityOfElementLocated(OtherFilesRequiredDoubleClick_xpath));
		       
		      String actualMsg= SaveWebEelement.getText();
		      if(actualMsg.equalsIgnoreCase(search))
		      {
		       return actualMsg;
		      }
		       
		    }
		    catch(Exception ex){
		     
		    }
		 return search;
		    }
			
		 public boolean ExportBtn_Click()
		 {
		 try{

		 	WebElement ExportBtnWebEelement=new WebDriverWait(driver,5)
		 	.until(ExpectedConditions.visibilityOfElementLocated(ExportBtn_xpath));
		 	ExportBtnWebEelement.click();
		 			
		 	return true;
		 }
		 catch(Exception ex){
		 	return false;
		 }

		 }
		 
		 public boolean Export_DownloadClick()
		 {
		 try{

		 	WebElement ExportBtnWebEelement=new WebDriverWait(driver,5)
		 	.until(ExpectedConditions.visibilityOfElementLocated(DownloadBtn_xpath));
		 	ExportBtnWebEelement.click();
		 	//////Thread.sleep(5000);
		 			
		 	return true;
		 }
		 catch(Exception ex){
		 	return false;
		 }

		 }	 
		
		 public boolean ExportPopUp_close()
		 {
		 try{

		 	WebElement ExportBtnWebEelement=new WebDriverWait(driver,5)
		 	.until(ExpectedConditions.visibilityOfElementLocated(ExportPopUpClose_xpath));
		 	ExportBtnWebEelement.click();
		 			
		 	return true;
		 }
		 catch(Exception ex){
		 	return false;
		 }

		 }
		 
		 public boolean Pagination_firstpage()
		 {
		 try{

		 	WebElement ExportBtnWebEelement=new WebDriverWait(driver,5)
		 	.until(ExpectedConditions.visibilityOfElementLocated(PaginationFirstpage_xpath));
		 	ExportBtnWebEelement.isDisplayed();
		 			
		 	return true;
		 }
		 catch(Exception ex){
		 	return false;
		 }

		 }
		 
		 public boolean Pagination_previouspage()
		 {
		 try{

		 	WebElement ExportBtnWebEelement=new WebDriverWait(driver,5)
		 	.until(ExpectedConditions.visibilityOfElementLocated(Paginationpreviouspage_xpath));
		 	ExportBtnWebEelement.isDisplayed();
		 			
		 	return true;
		 }
		 catch(Exception ex){
		 	return false;
		 }
		 
		 }
		 
		 
		 public boolean Pagination_Nextpage()
		 {
		 try{

		 	WebElement ExportBtnWebEelement=new WebDriverWait(driver,5)
		 	.until(ExpectedConditions.visibilityOfElementLocated(PaginationNextpage_xpath));
		 	ExportBtnWebEelement.isDisplayed();
		 			
		 	return true;
		 }
		 catch(Exception ex){
		 	return false;
		 }
		 }
		 
		 public boolean Pagination_Lastpage()
		 {
		 try{

		 	WebElement ExportBtnWebEelement=new WebDriverWait(driver,5)
		 	.until(ExpectedConditions.visibilityOfElementLocated(PaginationLastpage_xpath));
		 	ExportBtnWebEelement.isDisplayed();
		 			
		 	return true;
		 }
		 catch(Exception ex){
		 	return false;
		 }
		 
		 }
		 
		 
}
