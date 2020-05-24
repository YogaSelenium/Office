package com.cync.FactoringPages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.cync.base.BasePage;

public class NewInvoicesPage extends BasePage {
	
	
	private final By newInvoicesPageHeader_xpath = By.xpath("//span[@class='paneltitle']");
	private final By scheduleNoTextBox_xpath = By.id("schedule");
	private final By clickToMapHyperLink_xpath = By.xpath("//a[contains(text(),'Click to map images')]");
	private final By editInvoiceBTN_xpath = By.xpath("//button[contains(text(),'Edit Invoice(s)')]");
	private final By processBTN_xpath = By.xpath("//a[@id='system_verification']");
	private final By invoiceListCheckBox_xpath = By.id("cb_invoice_list");
	
	private final By accountNoHistoryHeader_xpath = By.xpath("//div[@id='jqgh_invoice_list_account_no'] ");
	private final By accountNameHistoryHeader_xpath = By.xpath("//div[@id='jqgh_invoice_list_account_name']");
	private final By fileNameHistoryHeader_xpath = By.xpath("//div[@id='jqgh_invoice_list_filename']");
	private final By sheduleNoHistoryHeader_xpath = By.xpath("//div[@id='jqgh_invoice_list_system_batch_no'] ");
	private final By fileRefNoHistoryHeader_Xpath = By.xpath("//div[@id='jqgh_invoice_list_batch_reference_no']  ");
	private final By invoiceNoHistoryHeader_xpath =By.xpath("//div[@id='jqgh_invoice_list_receivable_no']  ");
	private final By poNoHistoryHeader_xpath = By.xpath("//div[@id='jqgh_invoice_list_po_number']  ");
	private final By invoiceAmountHistoryHeader_xpath = By.xpath("//div[@id='jqgh_invoice_list_current_amount']  ");
	private final By invoiceDateHistoryHeader_xpath = By.xpath("//div[@id='jqgh_invoice_list_invoice_dt']  ");
	private final By dueDateHistoryHeader_xpath = By.xpath("//div[@id='jqgh_invoice_list_due_dt']");
	private final By invoiceStatusHistoryHeader_xpath = By.xpath("//div[@id='jqgh_invoice_list_invoice_status_id'] ");
	private final By feeNamehistoryHeader_xpath = By.xpath("//div[@id='jqgh_invoice_list_collateral_advance_rate_id']  ");
	
	private final By accountNoSearchBox_xpath = By.xpath("//input[@id='gs_account_no']");
	private final By accountNameSearchBox_xpath = By.xpath("//input[@id='gs_account_name']");
	private final By fileNameSearchBox_xpath = By.xpath("//input[@id='gs_filename']");
	private final By sheduleNoSearchBox_xpath = By.xpath("//input[@id='gs_system_batch_no']  ");
	private final By fileRefNoSearchBox_xpath = By.xpath("//input[@id='gs_batch_reference_no'] ");
	private final By invoiceNoSearchBox_xpath = By.xpath("//input[@id='gs_receivable_no']");
	private final By poNoSearchBox_xpath = By.xpath("//input[@id='gs_po_number']");
	private final By invoiceAmountSearchBox_xpath = By.xpath("//input[@id='gs_current_amount']");
	private final By invoiceDateSearchBox_xpath = By.xpath("//input[@id='gs_invoice_dt']");
	private final By dueDateSearchBox_xpath = By.xpath("//input[@id='gs_due_dt']");
	private final By invoiceStatusSearchBox_xpath = By.xpath("//input[@id='gs_invoice_status_id']  ");
	private final By feeNameSearchBox_xpath = By.xpath("//select[@id='gs_collateral_advance_rate_id'] ");
	
	private final By sheduleNoOption_xpath = By.xpath("//a[@id='ui-id-3']");
	private final By imageMappingPopupHeader_xpath = By.xpath("//div[@class='mp-title']");
	
	private final By firstinvcheckbox_xpath = By.xpath("(//input[contains(@id,'jqg_invoice_list')])[1]");
	private final By manualentryHeader_xpath = By.xpath("//span[contains(text(),'Manual Entry')]");
	private final By processinvoicesBTN_xpath = By.xpath("//input[@id='save_entire_batch_invoice_button'] ");
	private final By successMsg_xpath = By.xpath("//ul[contains(text(),'Receivable was successfully created.')]");
	private final By closeBTNSuccessMsg_xpath = By.xpath("//body[@class='cync-bg x-fixed']/div[@id='flexbox-container']/div[@class='flexbox-col2']/div[@id='content']/div[@id='bgshadow']/div[@class='box']/div[@class='panel panel-default']/div[@class='panel-body']/div[@class='col-sm-12 col-md-12 col-lg-12 col-xl-12 padone']/div[@class='alert alert-success']/button[1] ");

	public NewInvoicesPage(WebDriver driver) {
		super(driver);
		try
		{
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public boolean PageHeaderVerify(String Header)
    {
    	try
    	{
    		WebElement HeaderWebEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(newInvoicesPageHeader_xpath));
		HeaderWebEelement.getText();
		Thread.sleep(2000);
		return true;
    	}
    	catch(Exception e)
    	{
    		return false;
    	}
    	
    }

	public boolean addValueToSheduleNo() {
		try
		{
			WebElement ScheduleNoTextBoxWebElement =new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(scheduleNoTextBox_xpath ));
			ScheduleNoTextBoxWebElement.click();
			
			WebElement ScheduleOptionWebelemnt = new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(sheduleNoOption_xpath));
			
			Thread.sleep(5000);
			
			Actions act = new Actions(driver);
			act.moveToElement(ScheduleOptionWebelemnt);
			ScheduleOptionWebelemnt.click();
			
			Thread.sleep(5000);
			return true;
		}
		catch(Exception e)
		{
		return false;
		}
	}
    
	
	public boolean ClickOnClickToImage_HyperLink()
	{
		try
		{
			WebElement ClickToImageWebElement =new WebDriverWait(driver,100)
			.until(ExpectedConditions.elementToBeClickable(clickToMapHyperLink_xpath));
			ClickToImageWebElement.click();
			
			Thread.sleep(5000);
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}
	
	public boolean VerifyImageMappingPopup()
	{
		try
		{
			WebElement ImageMappingPopupWebElement =new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(imageMappingPopupHeader_xpath));
			ImageMappingPopupWebElement.isDisplayed();
			
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}
	

	
	public boolean VerifyInvoiceListCheckBox()
	{
		try
		{
			WebElement InvoiceListWebElement =new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(invoiceListCheckBox_xpath));
			InvoiceListWebElement.isDisplayed();
			
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
			WebElement editinvoicesWebElement =new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(editInvoiceBTN_xpath));
			editinvoicesWebElement.isDisplayed();
			
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}

	public boolean VerifyProcessBTN() {
		try
		{
			WebElement processWebElement =new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(processBTN_xpath));
			processWebElement.isDisplayed();
			
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}

	public boolean SelectFirstInv() {
		try
		{
			WebElement Inv1WebElement =new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(firstinvcheckbox_xpath));
			Inv1WebElement.click();
			
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
			WebElement editinvoicesWebElement =new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(editInvoiceBTN_xpath));
			editinvoicesWebElement.click();
			this.isAlertPresent();
			Thread.sleep(500);
			
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}

	public boolean VerifyManualEntryscreen() {
		try
		{
			WebElement manualentryWebElement =new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(manualentryHeader_xpath));
			manualentryWebElement.isDisplayed();
			
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
			WebElement processinvoicesWebElement =new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(processinvoicesBTN_xpath));
			processinvoicesWebElement.click();
			
			this.isAlertPresent();
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}

	public boolean VerifyEditedinvoice() {
		try
		{
			WebElement Inv1WebElement =new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(firstinvcheckbox_xpath));
			Inv1WebElement.isDisplayed();
			
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}

	public boolean ClickonProcessBTN() {
		try
		{
			WebElement ProcessBTNWebElement =new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(processBTN_xpath));
			Thread.sleep(500);
			ProcessBTNWebElement.click();
			this.isAlertPresent();
			Thread.sleep(500);
			
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}

	public boolean VerifySuccessMSG() {
		try
		{
			WebElement SuccessMsgWebElement =new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(successMsg_xpath));
			SuccessMsgWebElement.isDisplayed();
			
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
			WebElement CloseBTNSuccessMsgWebElement =new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(closeBTNSuccessMsg_xpath));
			CloseBTNSuccessMsgWebElement.click();
			
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

	public boolean SelectInvChkBx() {
		try
		{
			WebElement CloseBTNSuccessMsgWebElement =new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(invoiceListCheckBox_xpath));
			CloseBTNSuccessMsgWebElement.click();
			
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}
	

}
