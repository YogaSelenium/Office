package com.cync.FactoringPages;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.cync.base.BasePage;

public class VerifiedPageFactoring extends BasePage
{
	private final By VerifiedPageFactoring_xpath = By.xpath("//span[@class='paneltitle']");
	
	private final By CreateFundingBatchBTN_xpath = By.xpath("//a[@id='create_schedule']");
	private final By BatchDropdown_xpath = By.xpath("//select[@id='schedule_id']");
	private final By AppendToBatchBTN_xpath = By.xpath("//a[@id='append_schedule_bt']");
	private final By RemoveBatchBTN_xpath = By.xpath("//a[@id='remove_schedule']");
	private final By openBatchBTN_xpath = By.xpath("//a[@id='print_schedule']");
	private final By fundBatchBTN_xpath = By.xpath("//a[@id='fund_schedule']");
	private final By cancelBatchBTN_xpath = By.xpath("//a[@id='cancel_schedule']");
	private final By editInvoicesBTN_xpath = By.xpath("//button[contains(text(),'Edit Invoice(s)')]");
	private final By markIneligibleBTN_xpath = By.xpath("//a[@id='mark_invalid']");
	private final By approveFundingBTN_xpath = By.xpath("//a[@id='approve-funding']");
	private final By invoiceCheckBox_xpath = By.xpath("(//input[contains(@id,'jqg_receivables_list')])[1]");
	
	private final By manaulEntryHeader_xpath = By.xpath("//span[contains(text(),'Manual Entry')]");
	private final By processInvoicesBTN_xpath = By.xpath("//input[@id='save_entire_batch_invoice_button']");
	private final By processSuccessMsg_xpath = By.xpath("//ul[contains(text(),'Receivable was successfully created.')]");
	private final By invoiceListCheckBox_xpath = By.xpath("//input[@id='cb_receivables_list']");
	private final By closeSuccessMsg_xpath = By.xpath("//a[@id='closedialog']");
	private final By scheduleNodropdown_xpath = By.xpath("//div[@class='controls']//select[@id='schedule_id']");
	private final By cancelBatchBTNpopup_xpath = By.xpath("//input[@name='commit']");
	private final By cancelSuccessMsg_xpath = By.xpath("//strong[@class='extend_message']");
	private final By closeCancelPopup_xpath = By.xpath("//button[@class='ui-dialog-titlebar-close']");
	private final By removeSuccessMsg_xpath = By.xpath("//div[@class='ui-state-success']");
	private final By fundBatchpopupHeader_xpath = By.xpath("//div[@class='ui-dialog-titlebar ui-widget-header ui-corner-all ui-helper-clearfix']");
	private final By selectBatchDropdown_xpath = By.xpath("//select[@id='schedule_no_list']");
	private final By saveBTN_xpath = By.xpath("//input[@id='save_update_schedule']");
	private final By fundBatchBTNinpopup_xpath = By.xpath("//form[@class='form-horizontal cync_form']//input[2]");
	private final By fundingSuccessMsg_xpath = By.xpath("//strong[@class='extend_message']");
	private final By closeFundBatchpopup_xpath = By.xpath("//button[@class='ui-dialog-titlebar-close']");
	private final By fundSuccessMsg_xpath = By.xpath("//div[@class='ui-state-success']");
	private final By saveSuccessMsg_xpath = By.xpath("//strong[@class='extend_message']");
	private final By invoicesCheckBox_xpath = By.xpath("//input[@id='cb_receivables_list']");
	private final By Batchdropdown_xpath=By.xpath("//select[@name='schedule_id']");
	
	
	public VerifiedPageFactoring(WebDriver driver) {
		super(driver);
		try
		{
			
		}
		catch(Exception e)
		{
			
		}
	}
	public  String PageHeaderVerify(String Header)
    {
    	try
    	{
    		WebElement HeaderWebEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(VerifiedPageFactoring_xpath));
		HeaderWebEelement.getText();
		Thread.sleep(2000);
    	}
    	catch(Exception e)
    	{
    		
    	}
    	return Header;

}
	public boolean VerifyCreateFundingBatchBTN() {
		try
    	{
    		WebElement CreateFundingBatchBTNWebEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(CreateFundingBatchBTN_xpath));
    		CreateFundingBatchBTNWebEelement.isDisplayed();
		
    		return true;
    	}
    	catch(Exception e)
    	{
    		return false;
    	}
	}
	public boolean VerifyBatchDropdown() {
		try
    	{
    		WebElement BatchDropdownWebEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(BatchDropdown_xpath));
    		BatchDropdownWebEelement.isDisplayed();
		
    		return true;
    	}
    	catch(Exception e)
    	{
    		return false;
    	}
	}
	public boolean VerifyAppendToBatchBTN() {
		try
    	{
    		WebElement AppendToBatchBTNWebEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(AppendToBatchBTN_xpath));
    		AppendToBatchBTNWebEelement.isDisplayed();
		
    		return true;
    	}
    	catch(Exception e)
    	{
    		return false;
    	}
	}
	public boolean VerifyRemoveBatchBTN() {
		try
    	{
    		WebElement RemoveBatchBTNWebEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(RemoveBatchBTN_xpath));
    		RemoveBatchBTNWebEelement.isDisplayed();
		
    		return true;
    	}
    	catch(Exception e)
    	{
    		return false;
    	}
	}
	public boolean VerifyOpenBatchBTN() {
		try
    	{
    		WebElement OpenBatchBTNWebEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(openBatchBTN_xpath));
    		OpenBatchBTNWebEelement.isDisplayed();
		
    		return true;
    	}
    	catch(Exception e)
    	{
    		return false;
    	}
	}
	public boolean VerifyFundBatchBTN() {
		try
    	{
    		WebElement FundBatchBTNWebEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(fundBatchBTN_xpath));
    		FundBatchBTNWebEelement.isDisplayed();
		
    		return true;
    	}
    	catch(Exception e)
    	{
    		return false;
    	}
	}
	public boolean VerifyCancelBatchBTN() {
		try
    	{
    		WebElement CancelBatchBTNWebEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(cancelBatchBTN_xpath));
    		CancelBatchBTNWebEelement.isDisplayed();
		
    		return true;
    	}
    	catch(Exception e)
    	{
    		return false;
    	}
	}
	public boolean VerifyEditInvoicesBTN() {
		try
    	{
    		WebElement EditInvoicesBTNWebEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(editInvoicesBTN_xpath));
    		EditInvoicesBTNWebEelement.isDisplayed();
		
    		return true;
    	}
    	catch(Exception e)
    	{
    		return false;
    	}
	}
	public boolean VerifyMarkIneligibleBTN() {
		try
    	{
    		WebElement MarkIneligibleBTNWebEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(markIneligibleBTN_xpath));
    		MarkIneligibleBTNWebEelement.isDisplayed();
		
    		return true;
    	}
    	catch(Exception e)
    	{
    		return false;
    	}
	}
	public boolean VerifyApproveFundingBTN() {
		try
    	{
    		WebElement ApproveFundingBTNWebEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(approveFundingBTN_xpath));
    		ApproveFundingBTNWebEelement.isDisplayed();
		
    		return true;
    	}
    	catch(Exception e)
    	{
    		return false;
    	}
	}
	public boolean SelectFirstInvoiceCheckBox() {
		try
    	{
    		WebElement InvoiceCheckBoxWebEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(invoiceCheckBox_xpath));
    		InvoiceCheckBoxWebEelement.click();
		
    		return true;
    	}
    	catch(Exception e)
    	{
    		return false;
    	}
	}
	public boolean ClickEditInvoicesBTN() {
		try
    	{
    		WebElement EditInvoicesBTNWebEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(editInvoicesBTN_xpath));
    		EditInvoicesBTNWebEelement.click();
    		this.isAlertPresent();
		
    		return true;
    	}
    	catch(Exception e)
    	{
    		return false;
    	}
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
	public boolean VerifyManualEntryHeader() {
		try
    	{
    		WebElement ManualEntryHeaderWebEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(manaulEntryHeader_xpath));
    		ManualEntryHeaderWebEelement.isDisplayed();
		
    		return true;
    	}
    	catch(Exception e)
    	{
    		return false;
    	}
	}
	public boolean ClickOnProcessInvoicesBTN() {
		try
    	{
    		WebElement ProcessInvoicesBTNWebEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(processInvoicesBTN_xpath));
    		ProcessInvoicesBTNWebEelement.click();
    		this.isAlertPresent();
		
    		return true;
    	}
    	catch(Exception e)
    	{
    		return false;
    	}
	}
	public boolean VerifySuccessMsg() {
		try
    	{
    		WebElement SuccessMsgWebEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(processSuccessMsg_xpath));
    		SuccessMsgWebEelement.isDisplayed();
    		//this.isAlertPresent();
		
    		return true;
    	}
    	catch(Exception e)
    	{
    		return false;
    	}
	}
	public boolean ClickMarkIneligibleBTN() {
		try
    	{
    		WebElement MarkIneligibleBTNWebEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(markIneligibleBTN_xpath));
    		MarkIneligibleBTNWebEelement.click();
    		this.isAlertPresent();
		
    		return true;
    	}
    	catch(Exception e)
    	{
    		return false;
    	}
	}
	public boolean CloseSuccessMsg() {
		try
    	{
    		WebElement CloseSuccessMsgWebEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(closeSuccessMsg_xpath));
    		CloseSuccessMsgWebEelement.click();
    		Thread.sleep(1000);
    		this.isAlertPresent();
    		//driver.navigate().refresh();
 
    		return true;
    	}
    	catch(Exception e)
    	{
    		return false;
    	}
	}
	public boolean SelectInvoiceCheckBox() {
		try
    	{
    		WebElement InvoiceCheckBoxWebEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(invoiceListCheckBox_xpath));
    		InvoiceCheckBoxWebEelement.click();
		
    		return true;
    	}
    	catch(Exception e)
    	{
    		return false;
    	}
	}
	public boolean ClickCreateFundingBatchBTN() {
		try
    	{
			Thread.sleep(1000);

    		WebElement CreateFundingBatchBTNWebEelement=new WebDriverWait(driver,200)
			.until(ExpectedConditions.visibilityOfElementLocated(CreateFundingBatchBTN_xpath));
    		CreateFundingBatchBTNWebEelement.click();
    		this.isAlertPresent();
		    Thread.sleep(2000);
    		this.isAlertPresent();
		    Thread.sleep(1000);

    		return true;
    	}
    	catch(Exception e)
    	{
    		return false;
    	}
	}
	public boolean ClickCancelBatch() {
		try
    	{
    		WebElement CancelBatchWebEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(cancelBatchBTN_xpath));
    		CancelBatchWebEelement.click();
    		this.isAlertPresent();
		
    		return true;
    	}
    	catch(Exception e)
    	{
    		return false;
    	}
	}
	public boolean SelectScheduleNo() {
		try
    	{
    		WebElement ScheduleNoWebEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(scheduleNodropdown_xpath));
    		Select sel = new Select(ScheduleNoWebEelement);
    		java.util.List<WebElement> options = sel.getOptions();
    		for(WebElement schedule :  options)
    		{
    			String sel1 = "Please Select";
    			if(!schedule.equals(sel1))
    			{
    				schedule.click();
    			}
    		}
    		return true;
    	}
    	catch(Exception e)
    	{
    		return false;
    	}
	}
	public boolean ClickCancelBatchBTNinpopup() {
		try
    	{
    		WebElement CancelBatchWebEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(cancelBatchBTNpopup_xpath));
    		CancelBatchWebEelement.click();
    		this.isAlertPresent();
		
    		return true;
    	}
    	catch(Exception e)
    	{
    		return false;
    	}
	}
	public boolean VerifyCancelSuccessMsg() {
		try
    	{
    		WebElement CancelSuccessMsgWebEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(cancelSuccessMsg_xpath));
    		CancelSuccessMsgWebEelement.isDisplayed();
		
    		return true;
    	}
    	catch(Exception e)
    	{
    		return false;
    	}
	}
	public boolean CloseCancelpopup() {
		try
    	{
    		WebElement CloseCancelpopupWebEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(closeCancelPopup_xpath));
    		CloseCancelpopupWebEelement.click();
    		this.isAlertPresent();
    		//driver.navigate().refresh();
		
    		return true;
    	}
    	catch(Exception e)
    	{
    		return false;
    	}
	}
	public boolean ClickRemoveBatchBTN() {
		try
    	{
    		WebElement RemoveBatchBTNWebEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(RemoveBatchBTN_xpath));
    		RemoveBatchBTNWebEelement.click();
    		this.isAlertPresent();
		
    		return true;
    	}
    	catch(Exception e)
    	{
    		return false;
    	}
	}
	public boolean VerifyRemovedSuccessMsg() {
		try
    	{
    		WebElement RemovedSuccessMsgWebEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(removeSuccessMsg_xpath));
    		RemovedSuccessMsgWebEelement.isDisplayed();
    		this.isAlertPresent();
		
    		return true;
    	}
    	catch(Exception e)
    	{
    		return false;
    	}
	}
	public boolean ClickFundBatchBTN() {
		try
    	{
    		WebElement FundBatchBTNWebEelement=new WebDriverWait(driver,200)
			.until(ExpectedConditions.visibilityOfElementLocated(fundBatchBTN_xpath));
    		FundBatchBTNWebEelement.click();
    		this.isAlertPresent();
		Thread.sleep(2000);
    		return true;
    	}
    	catch(Exception e)
    	{
    		return false;
    	}
	}
	public boolean VerifyFundBatchpopup() {
		try
    	{
    		WebElement FundBatchpopupWebEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(fundBatchpopupHeader_xpath));
    		FundBatchpopupWebEelement.isDisplayed();
    		
    		return true;
    	}
    	catch(Exception e)
    	{
    		return false;
    	}
	}
	public boolean SelectBatchInFundBatchpopup() {
		try
    	{
    		WebElement SelectBatchWebEelement=new WebDriverWait(driver,200)
			.until(ExpectedConditions.visibilityOfElementLocated(selectBatchDropdown_xpath));
    		Select sel = new Select(SelectBatchWebEelement);
    		java.util.List<WebElement> options = sel.getOptions();
    		for(WebElement schedule :  options)
    		{
    			String sel1 = "Please Select";
    			if(!schedule.equals(sel1))
    			{
    				schedule.click();
    			}
    		}
    		Thread.sleep(4000);
    		return true;
    	}
    	catch(Exception e)
    	{
    		return false;
    	}
	}
	public boolean ClickOnSaveBTN() {
		try
    	{
			Thread.sleep(500);
			//String parent = driver.getWindowHandle();
    		WebElement SaveBTNWebEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(saveBTN_xpath));
    		SaveBTNWebEelement.click();
    		Thread.sleep(2000);
    		this.isAlertPresent();
    		Thread.sleep(500);
    		//driver.close();
    		Set<String> WHs = driver.getWindowHandles();
		      Iterator<String> it = WHs.iterator();
				//iterate through your windows
		      while (it.hasNext()){
		  		String parent = it.next();
		  		String newwin = it.next();
		  		driver.switchTo().window(newwin);
		  		Thread.sleep(500);
		  		driver.close();
		  		//driver.switchTo().window(parent);
		  		//driver.close();
			}
    	      
    		return true;
    	}
    	catch(Exception e)
    	{
    		return false;
    	}
	}
	public boolean VerifySavingSuccessMsg() {
		try
    	{
    		WebElement SavingSuccessMsgWebEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(saveSuccessMsg_xpath));
    		SavingSuccessMsgWebEelement.isDisplayed();
    		Thread.sleep(1000);
    		
    		return true;
    	}
    	catch(Exception e)
    	{
    		return false;
    	}
	}
public boolean ClickFundBatchBTNinpopupi() {
		try
    	{
			//String parent=driver.getWindowHandle();
    		WebElement FundBatchBTNinpopupWebEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(fundBatchBTNinpopup_xpath));
    		FundBatchBTNinpopupWebEelement.click();
    		Thread.sleep(2000);
    		this.isAlertPresent();
    		Thread.sleep(1000);
    		//driver.close();
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
    	catch(Exception e)
    	{
    		return false;
    	}
	}
	public boolean ClickFundBatchBTNinpopup() {
		try
    	{
			Thread.sleep(4000);
    		WebElement FundBatchBTNinpopupWebEelement=new WebDriverWait(driver,200)
			.until(ExpectedConditions.visibilityOfElementLocated(fundBatchBTNinpopup_xpath));
    		FundBatchBTNinpopupWebEelement.click();
    		Thread.sleep(2000);
    		this.isAlertPresent();
    		Thread.sleep(1000);
    		
    		Set<String> WHs = driver.getWindowHandles();
		      Iterator<String> it = WHs.iterator();
				//iterate through your windows
		      String parent = it.next();
		      while (it.hasNext()){
			  		//String parent = it.next();
			  		String newwin = it.next();
			  		driver.switchTo().window(newwin);
			  		Thread.sleep(1000);
			  		driver.close();
			  		driver.switchTo().window(parent);
		      }
    		return true;
    	}
    	catch(Exception e)
    	{
    		return false;
    	}
	}
	public boolean VerifyFundingSuccessMsg() {
		try
    	{
			Thread.sleep(1500);
    		WebElement FundingSuccessMsgWebEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(fundingSuccessMsg_xpath));
    		FundingSuccessMsgWebEelement.isDisplayed();
    		Thread.sleep(2000);
    		
    		return true;
    	}
    	catch(Exception e)
    	{
    		return false;
    	}
	}
	public boolean CloseFundBatchPopup() {
		try
    	{
			Thread.sleep(2000);
    		WebElement CloseFundBatchPopupWebEelement=new WebDriverWait(driver,200)
			.until(ExpectedConditions.visibilityOfElementLocated(closeFundBatchpopup_xpath));
    		CloseFundBatchPopupWebEelement.click();
    		this.isAlertPresent();
		
    		return true;
    	}
    	catch(Exception e)
    	{
    		return false;
    	}
	}
	public boolean VerifySuccessMsgBatch() {
		try
    	{
    		WebElement FundingSuccessMsgWebEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(fundSuccessMsg_xpath));
    		FundingSuccessMsgWebEelement.isDisplayed();
    		
    		return true;
    	}
    	catch(Exception e)
    	{
    		return false;
    	}
	}
	public boolean SelectInvoicesCheckBox() {
		try
    	{
			Thread.sleep(1500);
    		WebElement CloseFundBatchPopupWebEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(invoicesCheckBox_xpath));
    		CloseFundBatchPopupWebEelement.click();
    		this.isAlertPresent();
		    Thread.sleep(1500);
    		return true;
    	}
    	catch(Exception e)
    	{
    		return false;
    	}
	}
	
	public  boolean ClickonSelectBatchDropdown_reverse() {
		try {

			
			
			WebElement DropdownWebEelement = new WebDriverWait(driver, 10)
			.until(ExpectedConditions.visibilityOfElementLocated(Batchdropdown_xpath));
			
			Select sel = new Select(DropdownWebEelement);
			
			List<WebElement> list = sel.getOptions();
			
			for (WebElement ele:list) 
			{
				
			 		ele.click();
				
			}
			
		} 
		catch (Exception ex)
		{
			return false;
		}
		
		return true;	
	}	
	
	
	
	public boolean VerifyDatainDropDown(){
		
		
      try {	
			WebElement DropdownWebEelement = new WebDriverWait(driver, 10)
			.until(ExpectedConditions.visibilityOfElementLocated(Batchdropdown_xpath));
			
			Select sel = new Select(DropdownWebEelement);
			
			List<WebElement> list = sel.getOptions();
			     
			for (WebElement ele:list) 
			{
				int num=list.size();
			 		if(num>1)
			 		{
			 			return true;
				    }
			
		    } 
         }
		catch (Exception ex)
		   {
			return false;
		   }
		return true;	
	  }	
		
	
}