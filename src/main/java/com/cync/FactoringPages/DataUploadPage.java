package com.cync.FactoringPages;

import java.io.BufferedInputStream;
import java.net.URL;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;





import com.cync.base.BasePage;

public class DataUploadPage extends BasePage {
	
	
	private final By dataUploadHeader_xpath = By.xpath("//span[contains(text(),'Data Upload')]");
	private final By fileName_xpath = By.id("jqgh_data_review_filename");
	private final By expectedValue_xpath = By.xpath("//td[@aria-describedby='data_review_expected_value']");
	private final By actualValue_xpath = By.id("jqgh_data_review_actual_value");
	private final By variance_xpath = By.id("jqgh_data_review_variance");
	private final By scheduleNo_xpath = By.xpath("//td[@aria-describedby='data_review_batch_schedule_no']");
	private final By user_xpath = By.id("jqgh_data_review_user_name");
	private final By startTime_xpath = By.id("jqgh_data_review_start_time");
	private final By endTime_xpath = By.id("jqgh_data_review_end_time");
	private final By createdAt_xpath = By.id("jqgh_data_review_created_at");
	private final By newAcc_xpath = By.id("jqgh_data_review_no_of_new_accounts");
	private final By originalRecords_xpath = By.id("jqgh_data_review_row_count");
	private final By duplicateRecords_xpath = By.id("jqgh_data_review_duplicate_record_count");
	private final By totalRecords_xpath = By.id("jqgh_data_review_total_count");
	private final By actions_xpath = By.id("jqgh_data_review_data_action");
	
	private final By fileNameSearchTB_xpath = By.id("gs_filename");
	private final By scheduleNoSearchTB_xpath = By.id("gs_batch_schedule_no");
	private final By userSearchTB_xpath = By.id("gs_user_name");
	private final By createdAtTB_xpath = By.id("gs_created_at");
	
	
	private final By fileNameHyperLink_xpath = By.xpath("//td[@aria-describedby='data_review_filename']");
	private final By expectedValuePopup_xpath = By.xpath("//table[@id='data_review']//td[4]");
	private final By actualValuePopup_xpath = By.xpath("//table[@id='data_review']//td[5]");
	private final By variancePopup_xpath = By.xpath("//table[@id='data_review']//td[6]");
	private final By scheduleNoHyperLink_xpath = By.xpath("//a[contains(@onclick,'schedule_number')]");
	private final By userPopup_xpath = By.xpath("//table[@id='data_review']//td[8]");
	private final By startTimePopup_xpath = By.xpath("//table[@id='data_review']//td[9]");
	private final By endTimePopup_xpath = By.xpath("//table[@id='data_review']//td[10]");
	private final By createdAtPopup_xpath = By.xpath("//table[@id='data_review']//td[11]");
	private final By newAccPopup_xpath = By.xpath("//table[@id='data_review']//td[12]");
	private final By originalRecordsHyperLink_xpath = By.xpath("//td[@aria-describedby='data_review_row_count']");
	//private final By duplicateRecordsHyperLink_xpath = By.xpath("//td[@aria-describedby='data_review_duplicate_record_count']");
	//private final By duplicateRecordsHyperLink_xpath = By.xpath("//td[@role='gridcell' and @aria-describedby='data_review_duplicate_record_count']");
	private final By duplicateRecordsHyperLink_xpath = By.xpath("//a[@href='#' and text()='Duplicate Invoices']");

	private final By totalRecordsPopup_xpath = By.xpath("//td[@aria-describedby='data_review_total_count']");
	private final By undoBTN_xpath = By.xpath("//a[@title='Undo']");
	
   //private final By newInvoices_xpath = By.xpath("//li[@id='tab_358']//a[contains(text(),'New Invoices')] ");
	private final By newInvoices_xpath = By.xpath("//span[@class='paneltitle' and text()=' New Invoices  ']");
	//private final By dataUpload_xpath = By.xpath("//li[@id='tab_280']//a[contains(text(),'Data Upload')] ");
	private final By dataUpload_xpath = By.xpath("//li/a[@href='#' and text()='Data Upload']");
	private final By duplicateInvoices_xpath = By.xpath("//li[@id='tab_285']//a[contains(text(),'Duplicate Invoices')] ");
	private final By undoSuccessMsg_xpath = By.xpath("//strong[@class='extend_message']  ");

	public DataUploadPage(WebDriver driver) {
		super(driver);
		try
		{
			
		}
		catch(Exception e)
		{
			
		}
	}
	
	public String PageHeaderVerify(String Header)
    {
    	try
    	{
    		WebElement HeaderWebEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(dataUploadHeader_xpath));
		HeaderWebEelement.getText();
		Thread.sleep(2000);
    	}
    	catch(Exception e)
    	{
    		
    	}
    	return Header;
    }
	
	
	public boolean FileNameIn_DataUploadHistory()
	{
		try
		{
			WebElement FileNameWebElement =new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(fileName_xpath));
			FileNameWebElement.isDisplayed();
			
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}
    
	
	public boolean ExpectedValueIn_DataUploadHistory()
	{
		try
		{
			WebElement ExpectedValueWebElement =new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(expectedValue_xpath));
			ExpectedValueWebElement.isDisplayed();
			
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}
	
	
	public boolean ActualValueIn_DataUploadHistory()
	{
		try
		{
			WebElement ActualValueWebElement =new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(actualValue_xpath));
			ActualValueWebElement.isDisplayed();
			
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}
    
	public boolean VarianceIn_DataUploadHistory()
	{
		try
		{
			WebElement VarianceWebElement =new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(variance_xpath));
			VarianceWebElement.isDisplayed();
			
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}
	
	
	public boolean SchduleNoIn_DataUploadHistory()
	{
		try
		{
			WebElement ScheduleNoWebElement =new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(scheduleNo_xpath));
			ScheduleNoWebElement.isDisplayed();
			
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}
	
	
	public boolean UserIn_DataUploadHistory()
	{
		try
		{
			WebElement UserWebElement =new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(user_xpath));
			UserWebElement.isDisplayed();
			
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}
	
	
	public boolean StartTimeIn_DataUploadHistory()
	{
		try
		{
			WebElement StartTimeWebElement =new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(startTime_xpath));
			StartTimeWebElement.isDisplayed();
			
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}
	
	
	public boolean EndTimeIn_DataUploadHistory()
	{
		try
		{
			WebElement EndTimeWebElement =new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(endTime_xpath));
			EndTimeWebElement.isDisplayed();
			
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}
	
	
	public boolean CreatedAtIn_DataUploadHistory()
	{
		try
		{
			WebElement CreatedAtWebElement =new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(createdAt_xpath));
			CreatedAtWebElement.isDisplayed();
			
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}
	
	
	public boolean NewAccIn_DataUploadHistory()
	{
		try
		{
			WebElement NewAccWebElement =new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(newAcc_xpath));
			NewAccWebElement.isDisplayed();
			
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}
	
	
	public boolean OriginalRecordsIn_DataUploadHistory()
	{
		try
		{
			WebElement OriginalRecordsWebElement =new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(originalRecords_xpath));
			OriginalRecordsWebElement.isDisplayed();
			
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}
	
	
	public boolean DuplicateRecordsIn_DataUploadHistory()
	{
		try
		{
			WebElement DuplicateRecordsWebElement =new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(duplicateRecords_xpath));
			DuplicateRecordsWebElement.isDisplayed();
			
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}
	
	
	public boolean TotalRecordsIn_DataUploadHistory()
	{
		try
		{
			WebElement TotalRecordsWebElement =new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(totalRecords_xpath));
			TotalRecordsWebElement.isDisplayed();
			
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}
	
	public boolean ActionsIn_DataUploadHistory()
	{
		try
		{
			WebElement ActionsWebElement =new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(actions_xpath));
			ActionsWebElement.isDisplayed();
			
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}
 

       public boolean FileNameHyperLinkClick_DataUploadHistory()
       {
    	   try
    	   {
    		   WebElement FileNameHyperLinkWebElement =new WebDriverWait(driver,100)
    		   .until(ExpectedConditions.elementToBeClickable(fileNameHyperLink_xpath));
    		   FileNameHyperLinkWebElement.isDisplayed();
    		   
    		   return true;
    	   }
    	   catch(Exception e)
    	   {
    		   return false;
    	   }
       }
       
       
       public boolean ExpectedValuePopup_DataUploadHistory(String expectedValue)
       {
    	   try
    	   {
    		   WebElement ExpectedValuePopupWebElement =new WebDriverWait(driver,100)
    		   .until(ExpectedConditions.visibilityOfElementLocated(expectedValuePopup_xpath));
    		   String actual = ExpectedValuePopupWebElement.getText();
    		   if(actual.equals(expectedValue))
    		       return true;
    		   else
    			   return false;
    	   }
    	   catch(Exception e)
    	   {
    		   return false;
    	   }
       }
       
       
       public boolean ActualValuePopup_DataUploadHistrory(String actualValue)
       {
    	   try
    	   {
    		   WebElement ActualPopupWebElement =new WebDriverWait(driver,100)
    		   .until(ExpectedConditions.visibilityOfElementLocated(actualValuePopup_xpath));
    		   String actual = ActualPopupWebElement.getText();
    		   if(actual.equals(actualValue))
    			   return true;
    		   else
    			   return false;
    		   
    	   }
    	   catch(Exception e)
    	   {
    		   return false;
    	   }
       }
       
       public boolean VariancePopup_DataUploadHistrory(String varianceValue)
       {
    	   try
    	   {
    		   WebElement VariancePopupWebElement =new WebDriverWait(driver,100)
    		   .until(ExpectedConditions.visibilityOfElementLocated(variancePopup_xpath));
    		   String actual = VariancePopupWebElement.getText();
    		   if(actual.equals(varianceValue))
    			   return true;
    		   else
    			   return false;
    		   
    	   }
    	   catch(Exception e)
    	   {
    		   return false;
    	   }
       }
       
       public boolean ScheduleNoHyperLinkClick_DataUploadHistory()
       {
    	   try
    	   {
    		   WebElement ScheduleNoPopupWebElement =new WebDriverWait(driver,100)
    		   .until(ExpectedConditions.visibilityOfElementLocated(scheduleNoHyperLink_xpath));
    		   ScheduleNoPopupWebElement.click();
    		   
    		   return true;
    	   }
    	   catch(Exception e)
    	   {
    		   return false;
    	   }
       }
       
       
       public boolean UserPopup_DataUploadHistrory(String userValue)
       {
    	   try
    	   {
    		   WebElement UserPopupWebElement =new WebDriverWait(driver,100)
    		   .until(ExpectedConditions.visibilityOfElementLocated(userPopup_xpath));
    		   String actual = UserPopupWebElement.getText();
    		   if(actual.equals(userValue))
    			   return true;
    		   else
    			   return false;
    		   
    	   }
    	   catch(Exception e)
    	   {
    		   return false;
    	   }
       }
       
       
       public boolean StartTimePopup_DataUploadHistrory(String startTimeValue)
       {
    	   try
    	   {
    		   WebElement StartTimePopupWebElement =new WebDriverWait(driver,100)
    		   .until(ExpectedConditions.visibilityOfElementLocated(startTimePopup_xpath));
    		   String actual = StartTimePopupWebElement.getText();
    		   if(actual.equals(startTimeValue))
    			   return true;
    		   else
    			   return false;
    		   
    	   }
    	   catch(Exception e)
    	   {
    		   return false;
    	   }
       }
       
       public boolean clickFileHyperLinkAndVerfiyNewInvoice()
       {
       try{
           WebElement WebEelement=new WebDriverWait(driver,10)
       	.until(ExpectedConditions.visibilityOfElementLocated(fileNameHyperLink_xpath));
       	WebEelement.click();
       	Thread.sleep(2000);
       	Set <String> handles =driver.getWindowHandles();
       	Iterator<String> it = handles.iterator();
       	//iterate through your windows
       	while (it.hasNext()){
       	String parent = it.next();
       	String newwin = it.next();
       	driver.switchTo().window(newwin);
       	//perform actions on new window
       	
       	WebElement actual=new WebDriverWait(driver,200)
       	.until(ExpectedConditions.visibilityOfElementLocated(newInvoices_xpath));
       	actual.isDisplayed();
       	return true;

       }}
       catch(Exception ex){
       	
       }

       return false;
       }
       
       public boolean clickSheduleHyperLinkAndVerfiySchedulePopup()
       {
    	  
       try{
    	  
          //String parent = driver.getWindowHandle();
           WebElement WebEelement=new WebDriverWait(driver,10)
       	.until(ExpectedConditions.visibilityOfElementLocated(scheduleNoHyperLink_xpath));
       	WebEelement.click();
       	Thread.sleep(2000);
      Set<String> WHs = driver.getWindowHandles();
      Iterator<String> it = WHs.iterator();
		//iterate through your windows
		while (it.hasNext()){
		String parent = it.next();
		String newwin = it.next();
		driver.switchTo().window(newwin);
		Thread.sleep(500);
		driver.close();
		driver.switchTo().window(parent);
		}
	return true;   	
       }
       	
       catch(Exception ex){
       	
       }

       return false;
       }
       
       
      
      public boolean clickUndoBTN()
       {
    	   try
    	   {
    		   WebElement UndoBTNWebElement =new WebDriverWait(driver,10)
    		   .until(ExpectedConditions.visibilityOfElementLocated(undoBTN_xpath));
    		   UndoBTNWebElement.click();
    		   
    		   Alert alert = driver.switchTo().alert();
    		   alert.accept();
    		   
    		   Thread.sleep(5000);
    		   return true;
    	   }
    	   catch(Exception e)
    	   {
    		   return false;
    	   }
       }
       
       public boolean VerifyUndoSuccessMsg()
       {
    	   try
    	   {
    		   WebElement UndoSuccessMsgWebElement =new WebDriverWait(driver,10)
    		   .until(ExpectedConditions.visibilityOfElementLocated(undoSuccessMsg_xpath));
    		   UndoSuccessMsgWebElement.isDisplayed();
    		   
    		   return true;
    	   }
    	   catch(Exception e)
    	   {
    		   return false;
    	   }
       }


	public boolean OriginalRecordsHyperlink() {
		 try
  	   {
  		   WebElement originalRecordsWebElement =new WebDriverWait(driver,10)
  		   .until(ExpectedConditions.visibilityOfElementLocated(originalRecordsHyperLink_xpath));
  		 originalRecordsWebElement.isDisplayed();
  		   
  		   return true;
  	   }
  	   catch(Exception e)
  	   {
  		   return false;
  	   }
	}


	public boolean DuplicateRecordsHyperlink() {
		 try
 	   {
 		   WebElement duplicateRecordsWebElement =new WebDriverWait(driver,10)
 		   .until(ExpectedConditions.visibilityOfElementLocated(duplicateRecordsHyperLink_xpath));
 		  duplicateRecordsWebElement.isDisplayed();
 		   
 		   return true;
 	   }
 	   catch(Exception e)
 	   {
 		   return false;
 	   }
	}
	
	public boolean TotalRecordsHyperlink() {
		 try
	   {
		   WebElement totalRecordsWebElement =new WebDriverWait(driver,10)
		   .until(ExpectedConditions.visibilityOfElementLocated(totalRecordsPopup_xpath));
		   totalRecordsWebElement.isDisplayed();
		   
		   return true;
	   }
	   catch(Exception e)
	   {
		   return false;
	   }
	}

	public boolean VerifyUndoBTN() {
		 try
		   {
			   WebElement undobtnWebElement =new WebDriverWait(driver,10)
			   .until(ExpectedConditions.visibilityOfElementLocated(undoBTN_xpath));
			   undobtnWebElement.isDisplayed();
			   
			   return true;
		   }
		   catch(Exception e)
		   {
			   return false;
		   }
	}

	public boolean ClickOriginalRecLinkAndVerifyNewInv() {
		 try
		   {
			   WebElement originalRecordsWebElement =new WebDriverWait(driver,10)
			   .until(ExpectedConditions.visibilityOfElementLocated(originalRecordsHyperLink_xpath));
			   originalRecordsWebElement.click();
			   Thread.sleep(500);
			   
			   WebElement newinvoicesWebElement =new WebDriverWait(driver,10)
			   .until(ExpectedConditions.visibilityOfElementLocated(newInvoices_xpath));
			   newinvoicesWebElement.isDisplayed();
			   
			   WebElement datauploadWebElement =new WebDriverWait(driver,10)
			   .until(ExpectedConditions.visibilityOfElementLocated(dataUpload_xpath));
			   datauploadWebElement.click();
			   Thread.sleep(500);   
			   return true;
		   }
		   catch(Exception e)
		   {
			   return false;
		   }
	}

	public boolean VerifyDupInv() {
		try
		   {
			  
			   
			   WebElement dupinvoicesWebElement =new WebDriverWait(driver,10)
			   .until(ExpectedConditions.visibilityOfElementLocated(duplicateInvoices_xpath));
			   dupinvoicesWebElement.isDisplayed();
			   
			   WebElement datauploadWebElement =new WebDriverWait(driver,10)
			   .until(ExpectedConditions.visibilityOfElementLocated(dataUpload_xpath));
			   datauploadWebElement.click();
			   Thread.sleep(500);   
			   return true;
		   }
		   catch(Exception e)
		   {
			   return false;
		   }
	}
	public boolean ClickDuplicateRecLink() {
		try
		   {
			   WebElement originalRecordsWebElement =new WebDriverWait(driver,10)
			   .until(ExpectedConditions.visibilityOfElementLocated(duplicateRecordsHyperLink_xpath));
			   originalRecordsWebElement.click();
			   
			   Thread.sleep(500);
			   
			  /* WebElement dupinvoicesWebElement =new WebDriverWait(driver,10)
			   .until(ExpectedConditions.visibilityOfElementLocated(duplicateInvoices_xpath));
			   dupinvoicesWebElement.isDisplayed();
			   
			   WebElement datauploadWebElement =new WebDriverWait(driver,10)
			   .until(ExpectedConditions.visibilityOfElementLocated(dataUpload_xpath));
			   datauploadWebElement.click();
			   Thread.sleep(500);   */
			   return true;
		   }
		   catch(Exception e)
		   {
			   return false;
		   }
	}
	
	public boolean ClickDuplicateRecLinkAndVerifyDupInv_i() {
		try
		   {
			   WebElement originalRecordsWebElement =new WebDriverWait(driver,10)
			   .until(ExpectedConditions.visibilityOfElementLocated(duplicateRecordsHyperLink_xpath));
			   originalRecordsWebElement.click();
			   
			  Thread.sleep(5000);   
			   return true;
		   }
		   catch(Exception e)
		   {
			   return false;
		   }

	}
}

