//Author - Abirami
package com.cync.FactoringPages;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.cync.base.BasePage;

public class ManualEntryPage extends BasePage{
	
	
	private final By manualEntryPageHeader_xpath = By.xpath(" //span[@class='paneltitle']");
	private final By chooseFileBTN_xpath = By.id("pdf_file_index");
	private final By noOfRowsTextBox_xpath = By.id("no_of_rows");
	private final By addBTN_xpath = By.id("batch_new_receivables_button");
	private final By processInvoicesBTN_xpath = By.id("save_entire_batch_invoice_button");
	private final By cancelBTN_xpath = By.id("new_batch_invoice_button");
	private final By SaveInvoicesBTN_xpath = By.xpath("/html[1]/body[1]/div[3]/div[1]/div[2]/div[4]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/input[2]");
	private final By invoiceNoTextBox_xpath = By.id("receivable_1_receivable_no");
	private final By accountNoTextBox_xpath = By.id("receivable_1_account_no");
	private final By accountNameTextBox_xpath = By.id("receivable_1_account_name");
	private final By poNoTextBox_xpath = By.id("receivable_1_po_number");
	private final By fileRefNoTextBox_xpath = By.id("receivable_1_batch_reference_no");
	private final By invoiceAmountTextBox_xpath = By.id("receivable_1_original_amount");
	private final By invoiceDateTextBox_xpath = By.id("receivable_1_invoice_dt");
	private final By dueDateTextBox_xpath = By.id("receivable_1_due_dt");
	private final By invoiceStatusDropdown_xpath = By.id("receivable_1_invoice_status_id_");
	private final By deleteIcon_xpath = By.xpath("(//span[@class='glyphicon icon-trash removerow'])[1]");
	private final By paymentTerms_xpath = By.xpath("//select[@id='receivable_1_net_days']");
	
	
	private final By newInvoicesHyperLink_xpath = By.xpath("(//a[contains(text(),'New Invoices')])[1]");
	private final By newInvoicesHeader_xpath = By.xpath("//span[contains(text(),'New Invoices')]");
	private final By successMsg_xpath = By.xpath("//ul[contains(text(),'Receivable was successfully created.')] ");
	
	public boolean PageHeaderVerify(String Header)
    {
    	try
    	{
    		WebElement HeaderWebEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(manualEntryPageHeader_xpath));
		HeaderWebEelement.getText();
		Thread.sleep(2000);
		return true;
    	}
    	catch(Exception e)
    	{
    		return false;
    	}
    	
    }
	
	public boolean ValuesToInvoiceNo(String invoiceNoData)
	{
		try
		{
			WebElement InvoiceNoWebElement = new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(invoiceNoTextBox_xpath));
			InvoiceNoWebElement.clear();
			InvoiceNoWebElement.sendKeys(invoiceNoData);
			
		    return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}
	
	public boolean ValuesToAccountNo(String accountNoData)
	{
		try
		{
			WebElement AccountNoWebElement = new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(accountNoTextBox_xpath));
			AccountNoWebElement.clear();
			AccountNoWebElement.sendKeys(accountNoData);
			
		    return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}
	
	
	public boolean ValuesToAccountName(String accountNameData)
	{
		try
		{
			WebElement AccountNameWebElement = new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(accountNameTextBox_xpath));
			AccountNameWebElement.clear();
			AccountNameWebElement.sendKeys(accountNameData);
			
		    return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}
	
	public boolean ValuesToPoNo(String poNoData)
	{
		try
		{
			WebElement PoNoWebElement = new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(poNoTextBox_xpath));
			PoNoWebElement.clear();
			PoNoWebElement.sendKeys(poNoData);
			
		    return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}
	
	public boolean ValuesToFileRefNo(String fileRefNoData)
	{
		try
		{
			WebElement FileRefNoWebElement = new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(fileRefNoTextBox_xpath));
			FileRefNoWebElement.clear();
			FileRefNoWebElement.sendKeys(fileRefNoData);
			
		    return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}
	
	public boolean ValuesToInvoiceAmount(String invoiceAmtData)
	{
		try
		{
			WebElement InvoiceAmtWebElement = new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(invoiceAmountTextBox_xpath));
			InvoiceAmtWebElement.clear();
			InvoiceAmtWebElement.sendKeys(invoiceAmtData);
			
		    return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}
	
	
	public boolean ClickProcessInvoiceBTN()
	{
		try
		{
			WebElement ProcessInvoicesWebElement = new WebDriverWait(driver,10)
			.until(ExpectedConditions.elementToBeClickable(processInvoicesBTN_xpath));
			ProcessInvoicesWebElement.click();
			this.isAlertPresent();
			
			/*WebElement NewInvHeaderWebElement = new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(newInvoicesHeader_xpath));
			NewInvHeaderWebElement.getText();
			if(text.equals(Header))
			{
			  return true;
			}
			else
			{
				return false;
			}
		*/
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
		
	}
	public boolean ClickSaveInvoiceBTN()
	{
		try
		{
			WebElement SaveInvoicesWebElement = new WebDriverWait(driver,100)
			.until(ExpectedConditions.elementToBeClickable(SaveInvoicesBTN_xpath));
			
			SaveInvoicesWebElement.click();
			
			
			this.isAlertPresent();
			Thread.sleep(4000);
			/*WebElement NewInvHeaderWebElement = new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(newInvoicesHeader_xpath));
			NewInvHeaderWebElement.getText();
			if(text.equals(Header))
			{
			  return true;
			}
			else
			{
				return false;
			}
		*/
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
		
	}
	public boolean VerifyInvNoTextBox()
	{
		try
		{
			WebElement InvNoWebElement = new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(invoiceNoTextBox_xpath));
			InvNoWebElement.click();
			
			Robot rb = new Robot();
			rb.keyPress(KeyEvent.VK_TAB);
			
			/*Thread.sleep(1000);*/
			int size= InvNoWebElement.getText().length();
			if(size==0)
			{
				return true;
			}
			else
			{
				return false;
			}
			
		}
		catch(Exception e)
		{
			return false;
		}
		
	}
	
	public boolean VerifyAccNameTextBox()
	{
		try
		{
			WebElement AccountNameWebElement = new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(accountNameTextBox_xpath));
			
			Robot rb = new Robot();
			rb.keyPress(KeyEvent.VK_TAB);
			
			/*Thread.sleep(1000);*/
			int size= AccountNameWebElement.getText().length();
			if(size==0)
			{
				return true;
			}
			else
			{
				return false;
			}
			
		}
		catch(Exception e)
		{
			return false;
		}
		
	}
	
	public boolean VerifyAccNoTextBox()
	{
		try
		{
			WebElement AccountNoWebElement = new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(accountNoTextBox_xpath));
			
			Robot rb = new Robot();
			rb.keyPress(KeyEvent.VK_TAB);
			
			/*Thread.sleep(1000);*/
			int size= AccountNoWebElement.getText().length();
			if(size==0)
			{
				return true;
			}
			else
			{
				return false;
			}
			
		}
		catch(Exception e)
		{
			return false;
		}
		
	}
	
	
	public boolean VerifyPoNoTextBox()
	{
		try
		{
			WebElement PoNoWebElement = new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(poNoTextBox_xpath));
			
			Robot rb = new Robot();
			rb.keyPress(KeyEvent.VK_TAB);
			
			/*Thread.sleep(1000);*/
			int size= PoNoWebElement.getText().length();
			if(size==0)
			{
				return true;
			}
			else
			{
				return false;
			}
			
		}
		catch(Exception e)
		{
			return false;
		}
		
	}
	
	public boolean VerifyFileRefNoTextBox()
	{
		try
		{
			WebElement FileRefNoWebElement = new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(fileRefNoTextBox_xpath));
			
			Robot rb = new Robot();
			rb.keyPress(KeyEvent.VK_TAB);
			
			/*Thread.sleep(1000);*/
			int size = FileRefNoWebElement.getText().length();
			if(size==0)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		catch(Exception e)
		{
			return false;
		}
	}
	

	public boolean VerifyInvAmtTextBox()
	{
		try
		{
			WebElement InvAmtWebElement = new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(invoiceAmountTextBox_xpath));
			
			Robot rb = new Robot();
			rb.keyPress(KeyEvent.VK_TAB);
			
			/*Thread.sleep(1000);*/
			int size= InvAmtWebElement.getText().length();
			if(size==0)
			{
				return true;
			}
			else
			{
				return false;
			}
			
		}
		catch(Exception e)
		{
			return false;
		}
		
	}
	
	public boolean VerifyInvDateTextBox()
	{
		try
		{
			WebElement InvDateWebElement = new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(invoiceDateTextBox_xpath));
			Robot rb = new Robot();
			rb.keyPress(KeyEvent.VK_TAB);
			
			Thread.sleep(1000);
			/*String size= InvDateWebElement.getText();
			
			DateFormat dateFormat2 = new SimpleDateFormat("MM/DD/YYY"); 
		     Date date2 = new Date();

		     String today = dateFormat2.format(date2); 

			if(size.equals(today))
			{
				return true;
			}
			else
			{
				return false;
			}
			*/
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
		
	}
	
	
	public boolean VerifyDueDateTextBox()
	{
		try
		{
			WebElement DueDateWebElement = new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(dueDateTextBox_xpath));
			
			Robot rb = new Robot();
			rb.keyPress(KeyEvent.VK_TAB);
			
			/*Thread.sleep(1000);
			int size= DueDateWebElement.getText().length();
			if(size!=0)
			{
				return true;
			}
			else
			{
				return false;
			}*/
			
			return true;
			
		}
		catch(Exception e)
		{
			return false;
		}
		
	}
	
	public boolean ClickNewInvoicesLink(String Header)
	{
		try
		{
			WebElement NewInvoicesWebElement = new WebDriverWait(driver,10)
			.until(ExpectedConditions.elementToBeClickable(newInvoicesHyperLink_xpath));
			NewInvoicesWebElement.click();
			
			Thread.sleep(1000);
			WebElement NewInvHeaderWebElement = new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(newInvoicesHeader_xpath));
			String text = NewInvHeaderWebElement.getText();
			if(text.equals(Header))
			{
			  return true;
			}
			else
			{
				return false;
			}
		}
		catch(Exception e)
		{
			return false;
		}
	}

		

	public ManualEntryPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public boolean VerifyPaymentTerms() {
		try
		{
			WebElement PaymentTermsWebElement = new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(paymentTerms_xpath));
			
			Robot rb = new Robot();
			rb.keyPress(KeyEvent.VK_TAB);
			
			/*Thread.sleep(1000);*/
			int size= PaymentTermsWebElement.getText().length();
			if(size!=0)
			{
				return true;
			}
			else
			{
				return false;
			}
			
		}
		catch(Exception e)
		{
			return false;
		}
	}

	public boolean ClickonDeleteIcon() {
		try
		{
			WebElement DeleteiconWebElement = new WebDriverWait(driver,10)
			.until(ExpectedConditions.elementToBeClickable(deleteIcon_xpath));
			DeleteiconWebElement.click();
			
			//Thread.sleep(1000);
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
			WebElement SuccessMsgWebElement = new WebDriverWait(driver,10)
			.until(ExpectedConditions.elementToBeClickable(successMsg_xpath));
			SuccessMsgWebElement.isDisplayed();
			
			//Thread.sleep(1000);
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}

	public boolean ValuesToInvoiceDate() {
		try
		{
			
			
			WebElement InvoiceDateWebElement = new WebDriverWait(driver,10)
			.until(ExpectedConditions.elementToBeClickable(invoiceDateTextBox_xpath));
			InvoiceDateWebElement.click();
			//InvoiceDateWebElement.sendKeys(today);
			
			//Thread.sleep(1000);
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

	public boolean VerifyDeleteIcon() {
		try
		{
			WebElement DeleteiconWebElement = new WebDriverWait(driver,10)
			.until(ExpectedConditions.elementToBeClickable(deleteIcon_xpath));
			DeleteiconWebElement.isDisplayed();
			
			//Thread.sleep(1000);
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}
	

}
