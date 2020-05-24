package com.cync.pages;

import java.time.LocalDate;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.cync.base.BasePage;

public class InterestPaymentPage extends BasePage {

	private final By BreadCrum_xpath=By.xpath("//div[@id='breadcrumb_container']");
	private final By  InterestPaymentHeader_xpath=By.xpath("//span[@class='paneltitle']");
	private final By Year_xpath=By.xpath("//select[@id='start_year_end_year']");
	private final By EndingDate_xpath=By.xpath("//div[@id='jqgh_interest_payments_list_end_date']");
	private final By AccuredInterest_xpath=By.xpath("//div[@id='jqgh_interest_payments_list_interest_accrued_amount']");
	private final By InterestYTD_xpath=By.xpath("//div[@id='jqgh_interest_payments_list_interest_ytd']");
	private final By DueDate_xpath=By.xpath("//div[@id='jqgh_interest_payments_list_due_date']");
	private final By LateFee_xpath=By.xpath("//div[@id='jqgh_interest_payments_list_late_fee']");
	private final By PendingDue_xpath=By.xpath("//div[@id='jqgh_interest_payments_list_pending_amount']");
	private final By LoanFees_xpath=By.xpath("//div[@id='jqgh_interest_payments_list_other_fees_to_loan']");
	private final By StatementFees_xpath=By.xpath("//div[@id='jqgh_interest_payments_list_other_fees_to_statement']");
	private final By TotalStatementAmount_xpath=By.xpath("//div[@id='jqgh_interest_payments_list_balance_due']");
	private final By PaymentDate_xpath=By.xpath("//div[@id='jqgh_interest_payments_list_payment_date']");
	private final By PaymentAmount_xpath=By.xpath("//div[@id='jqgh_interest_payments_list_payment_amount']");
    private final By Export_xpath=By.xpath("(//div[@class='ui-pg-div'])[4]");
    private final By ReLoad_xpath=By.xpath("(//div[@class='ui-pg-div'])[1]");
    private final By InvoiceFrequency_xpath=By.xpath("(//span[@style='margin-left: 15px; display:inline-block'])[2]");
    //private final By DueDateColumn_xpath=By.xpath("//td[contains(text(),'02/15/2019')]");
    
    private final By LateFeeAdded_xpath=By.xpath("(//td[contains(text(),'0.00')])[1]");
  //  private final By EndingDateColumn_xpath=By.xpath("(//td[contains(text(),'01/31/2019')])[1]");
    private final By InterestYTDcolumn_xpath=By.xpath("/html[1]/body[1]/div[3]/div[1]/div[2]/div[4]/div[1]/div[1]/div[2]/div[2]/div[1]/div[3]/div[3]/div[1]/table[1]/tbody[1]/tr[2]/td[6]");
	private final By TotalStatementAmountMoney_xpath=By.xpath("/html[1]/body[1]/div[3]/div[1]/div[2]/div[4]/div[1]/div[1]/div[2]/div[2]/div[1]/div[3]/div[3]/div[1]/table[1]/tbody[1]/tr[2]/td[11]");
	private final By plusButton_xpath=By.xpath("(//span[@class='ui-icon ui-icon-plus'])[2]");
	private final By AddPaymentPlusButton_xpath=By.xpath("(//span[@class='ui-icon ui-icon ui-icon-plus'])");
	private final By EnterPaymentDate_xpath=By.xpath("//input[@name='payment_date']");
	private final By EnterPaymentAmount_xpath=By.xpath("//input[@name='payment_amount']");
	private final By ClickOnSave_xpath=By.xpath("(//span[@class='ui-icon ui-icon ui-icon-disk'])[1]");
	private final By MessageAfterPayement_xpath=By.xpath("//div[@class='ui-state-success']");
	private final By ErrorMessage_xpath=By.xpath("//div[@class='ui-state-error']");
	private final By AccuredInterestAmount_xpath=By.xpath("(//td[contains(text(),'258.23')])[1]");
	private final By ErrorMessageForInvalidDate_xpath=By.xpath("//div[@class='ui-state-error']");
	private final By PendingDueAmount_xpath=By.xpath("/html[1]/body[1]/div[3]/div[1]/div[2]/div[4]/div[1]/div[1]/div[2]/div[2]/div[1]/div[3]/div[3]/div[1]/table[1]/tbody[1]/tr[2]/td[9]");
	private final By ExportIcon_xpath=By.xpath("//div[@class='export']");
	private final By WaiveLateFee_xpath=By.xpath("//div[@id='jqgh_interest_payments_list_late_fee_waive_off']");
	private final By LateFeeAmount_xpath=By.xpath("(//td[@aria-describedby='interest_payments_list_late_fee'])[1]");


	private final By LateFeeAmountBeforeWaive_xpath=By.xpath("(//td[@aria-describedby='interest_payments_list_late_fee'])[2]");


	

	private final By expandableGrid_xpath=By.xpath("(//span[@class='ui-icon ui-icon-plus'])[2]");
	private final By expandableAddIcon_xpath=By.xpath("//span[@class='ui-icon ui-icon ui-icon-plus']");
	private final By ExpandableSaveIcon_xpath=By.xpath("//td[@title='Save Record']");
	private final By ExpandableDeleteIcon_xpath=By.xpath("//span[@class='ui-icon ui-icon-trash']");
	private final By ExpandableReloadIcon_xpath=By.xpath("//span[@class='ui-icon ui-icon-refresh']");
	private final By ExpandableCancelIcon_xpath=By.xpath("//span[@class='ui-icon ui-icon ui-icon-cancel']");

	private final By Checkbox_xpath=By.xpath("(//input[@class='cbox'])[2]");
	private final By PaymentDateColumn_xpath=By.xpath("//div[@id='jqgh_interest_payments_list_43916_t_payment_date']");
	private final By PaymentAmountColumn_xpath=By.xpath("//div[@id='jqgh_interest_payments_list_43916_t_payment_amount']");
	//private final By FirstCheckbox_xpath=By.xpath("//input[@id='cb_interest_payments_list_61206_t']");
	
	private final By deleteButtonPopUp_xpath=By.xpath("//a[@id='dData']");
	private final By cancelButtonPopUp_xpath=By.xpath("//a[@id='eData']");
	private final By deleteMsg_xpath = By.xpath("//div[text()='Interest Payment Detail was successfully deleted.']");
	private final By closeButtonPopUp_xpath=By.xpath("//a[@id='closedialog']");
	//private final By doubleClick_xpath=By.xpath("(//td[@aria-describedby='interest_payments_list_43931_t_payment_date'])[1]");
	private final By updateMsg_xpath = By.xpath("//div[text()='Interest Payment Detail was successfully updated.']");
	private final By minimizeExpandableGrid_xpath=By.xpath("//span[@class='ui-icon ui-icon-minus']");
	


	private final By doubleClickOnRecord_xpath=By.xpath("(//input[@class='cbox '])[2]");
	private final By ClickOnWaiveCheckbox_xpath=By.xpath("//input[@name='late_fee_waive_off']");
	private final By WaiveLateFeeTextbox_xpath=By.xpath("//input[@name='waive_off_reason']");
	private final By messageIcon_xpath=By.xpath("//span[@class='icon-envelope']");
	private final By TextMessage_xpath=By.xpath("//div[contains(text(),'Waiving Of Late Fee')]");

	private final By pendingAmountAmountBeforeWaive_xpath=By.xpath("(//td[@aria-describedby='interest_payments_list_pending_amount'])[1]");
	private final By errorMsgCloseBTN_xpath = By.xpath("//a[@id='closedialog']");


	private final By datePicker_xpath = By.id("ui-datepicker-div");

	
	//kruthivas
	private final By DueDateColumn_xpath=By.xpath("//table[@id='interest_payments_list']//tr[2]//td[7]");
	 private final By EndingDateColumn_xpath=By.xpath("//table[@id='interest_payments_list']//tr[2]//td[4]");
	/* private final By Checkbox_xpath=By.xpath("//input[@id='cb_interest_payments_list_300_t']");*/
	 private final By FirstCheckbox_xpath=By.xpath("//table[@id='interest_payments_list_300_t']//tr[2]//td[1]");
	 private final By FirstCheckbox_xpath2=By.xpath("//input[@id='jqg_interest_payments_list_313_t_40']");
	 private final By doubleClick_xpath=By.xpath("//table[@id='interest_payments_list_300_t']//td[@aria-describedby='interest_payments_list_300_t_payment_date']");

	
	
	public InterestPaymentPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	
	
	
	public String verifyBreadcrumb(String Breadcrumb)
	{
		try{
			WebElement breadcrumbWebEelement=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(BreadCrum_xpath));
			String actualData=breadcrumbWebEelement.getText().trim();
			if(actualData.equalsIgnoreCase(Breadcrumb));
		}
		catch(Exception ex){
			
		}
		return Breadcrumb;

		}
	
	
	public boolean HeaderVerify(String Header)
	{
	 
	try{
		WebElement HeaderWebEelement=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(InterestPaymentHeader_xpath));
		String actual = HeaderWebEelement.getText();
		if (actual.equals(Header))
			return true;
		else
			return false;

	} catch (Exception e) {
		return false;
	}
	}
	
	public boolean VerifyYearDropDown()
	{
		try{
		
		WebElement IntestPaymentWebelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(Year_xpath));
		IntestPaymentWebelement.isDisplayed();
		//Thread.sleep(2000);
		
		return true;
	    }
		catch (Exception e) {
			return false;
		}
	}

	
	public boolean VerifyEndingDate()
	{
		try{
		
		WebElement IntestPaymentWebelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(EndingDate_xpath));
		IntestPaymentWebelement.isDisplayed();
		//Thread.sleep(2000);
		
		return true;
	    }
		catch (Exception e) {
			return false;
		}
	}

	
	public boolean VerifyAccuredInterest()
	{
		try{
		
		WebElement IntestPaymentWebelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(AccuredInterest_xpath));
		IntestPaymentWebelement.isDisplayed();
		//Thread.sleep(2000);
		
		return true;
	    }
		catch (Exception e) {
			return false;
		}
	}
	
	public boolean VerifyInterestYTD()
	{
		try{
		
		WebElement IntestPaymentWebelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(InterestYTD_xpath));
		IntestPaymentWebelement.isDisplayed();
		//Thread.sleep(2000);
		
		return true;
	    }
		catch (Exception e) {
			return false;
		}
	}
	
	
	public boolean VerifyDueDate()
	{
		try{
		
		WebElement IntestPaymentWebelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(DueDate_xpath));
		IntestPaymentWebelement.isDisplayed();
		//Thread.sleep(2000);
		
		return true;
	    }
		catch (Exception e) {
			return false;
		}
	}
	
	
	
	public boolean VerifyLateFee()
	{
		try{
		
		WebElement IntestPaymentWebelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(LateFee_xpath));
		IntestPaymentWebelement.isDisplayed();
		//Thread.sleep(2000);
		
		return true;
	    }
		catch (Exception e) {
			return false;
		}
	}
	
	

	public boolean VerifyPendingDue()
	{
		try{
		
		WebElement IntestPaymentWebelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(PendingDue_xpath));
		IntestPaymentWebelement.isDisplayed();
		//Thread.sleep(2000);
		
		return true;
	    }
		catch (Exception e) {
			return false;
		}
	}
	
	
	public boolean VerifyLoanFees()
	{
		try{
		
		WebElement IntestPaymentWebelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(LoanFees_xpath));
		IntestPaymentWebelement.isDisplayed();
		//Thread.sleep(2000);
		
		return true;
	    }
		catch (Exception e) {
			return false;
		}
	}
	
	
	public boolean VerifyStatementFees()
	{
		try{
		
		WebElement IntestPaymentWebelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(StatementFees_xpath));
		IntestPaymentWebelement.isDisplayed();
		//Thread.sleep(2000);
		
		return true;
	    }
		catch (Exception e) {
			return false;
		}
	}
	
	public boolean VerifyTotalStatementAmount()
	{
		try{
		
		WebElement IntestPaymentWebelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(TotalStatementAmount_xpath));
		IntestPaymentWebelement.isDisplayed();
		//Thread.sleep(2000);
		
		return true;
	    }
		catch (Exception e) {
			return false;
		}
	}
	
	public boolean VerifyPaymentDate()
	{
		try{
		
		WebElement IntestPaymentWebelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(PaymentDate_xpath));
		IntestPaymentWebelement.isDisplayed();
		//Thread.sleep(2000);
		
		return true;
	    }
		catch (Exception e) {
			return false;
		}
	}
	
	
	public boolean VerifyPaymentAmount()
	{
		try{
		
		WebElement IntestPaymentWebelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(PaymentDate_xpath));
		IntestPaymentWebelement.isDisplayed();
		//Thread.sleep(2000);
		
		return true;
	    }
		catch (Exception e) {
			return false;
		}
	}
	
	public boolean VerifyExport()
	{
		try{
		
		WebElement IntestPaymentWebelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(Export_xpath));
		IntestPaymentWebelement.isDisplayed();
		//Thread.sleep(2000);
		
		return true;
	    }
		catch (Exception e) {
			return false;
		}
	}
	 
	public boolean VerifyReLoad()
	{
		try{
		
		WebElement IntestPaymentWebelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(ReLoad_xpath));
		IntestPaymentWebelement.isDisplayed();
		//Thread.sleep(2000);
		
		return true;
	    }
		catch (Exception e) {
			return false;
		}
	}
	
	
	public boolean validationInvoicefrequency(String Invoicefrequency)
	{
		try{
		
		WebElement IntestPaymentWebelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(InvoiceFrequency_xpath));
		String actual = IntestPaymentWebelement.getText();
		Thread.sleep(1000);
		if (actual.equals(Invoicefrequency))
			return true;
		else
			return false;
	    }
		catch (Exception e) {
			return false;
		}
	}
	
	
	 public boolean scrollToView()
		{
			try{
				 WebElement actual1=new WebDriverWait(driver,10)
	    		 .until(ExpectedConditions.visibilityOfElementLocated(PaymentDate_xpath));
	    		JavascriptExecutor jse1 = (JavascriptExecutor)driver;
	    		jse1.executeScript("arguments[0].scrollIntoView(true);",actual1);  		
		        Thread.sleep(1000);
		        return true;
				
			}
			catch(Exception e){
				
			}
			return false;
		}
	public boolean validationOf_dueDate(String date)
	{
		try{
		
		WebElement IntestPaymentWebelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(DueDateColumn_xpath));
		String actual = IntestPaymentWebelement.getText();
		Thread.sleep(1000);
		if (actual.equals(date))
			return true;
		else
			return false;
	    }
		catch (Exception e) {
			return false;
		}
	}
	
	public boolean validationOf_LateFee(String Fee)
	{
		try{
		
		WebElement IntestPaymentWebelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(LateFeeAdded_xpath));
		String actual = IntestPaymentWebelement.getText().trim();
		Thread.sleep(1000);
		if (actual.equals(Fee))
			return true;
		else
			return false;
	    }
		catch (Exception e) {
			return false;
		}
	}
	
	
	public boolean validationOf_EndingDate(String endingDate)
	{
		try{
		
		WebElement IntestPaymentWebelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(EndingDateColumn_xpath));
		String actual = IntestPaymentWebelement.getText();
		Thread.sleep(1000);
		if (actual.equals(endingDate))
			return true;
		else
			return false;
	    }
		catch (Exception e) {
			return false;
		}
	}
	
	
	public boolean validationOf_InterestYTD( )
	{
		try{
		
		WebElement IntestPaymentWebelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(InterestYTDcolumn_xpath));
		IntestPaymentWebelement.isDisplayed();
		return true;
		//thread.sleep(2000);
		}

		catch (Exception e) {
			return false;
		}
	}
	
	
	public boolean validationOf_TotalStatementAmount( )
	{
		try{
		
		WebElement IntestPaymentWebelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(TotalStatementAmountMoney_xpath));

		IntestPaymentWebelement.isDisplayed();

			return true;
		
	    }
		catch (Exception e) {
			return false;
		}
	}
	
	
	
	public boolean VerifyPlusButton()
	{
		try{
		
		WebElement IntestPaymentWebelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(plusButton_xpath));
		IntestPaymentWebelement.click();
		Thread.sleep(1000);
		
		return true;
	    }
		catch (Exception e) {
			return false;
		}
	}
	
	public boolean AddPayment_Button()
	{
		try{
			Thread.sleep(3000);
		WebElement IntestPaymentWebelement=new WebDriverWait(driver,50)
		.until(ExpectedConditions.visibilityOfElementLocated(AddPaymentPlusButton_xpath));
		IntestPaymentWebelement.click();
		Thread.sleep(1000);

		return true;
	    }
		catch (Exception e) {
			return false;
		}
	}
	
	
	public boolean AddPaymentDate(String dateFormatted)
	{
		try{
		Thread.sleep(2000);
		WebElement IntestPaymentWebelement=new WebDriverWait(driver,50)

		.until(ExpectedConditions.visibilityOfElementLocated(EnterPaymentDate_xpath));
		
		IntestPaymentWebelement.sendKeys(dateFormatted);	 
        Thread.sleep(2000);
        IntestPaymentWebelement.sendKeys(Keys.ESCAPE);
		Thread.sleep(3000);
		
		return true;
	    }
		catch (Exception e) {
			return false;
		}
	}
	public boolean AddPaymentAmount(String Amount) 
	{
		
		try{
			Thread.sleep(1000);
		
		WebElement IntestPaymentWebelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(EnterPaymentAmount_xpath));
		IntestPaymentWebelement.sendKeys(Amount);
		Thread.sleep(1000);
		
		return true;
	    }
		catch (Exception e) {
			return false;
		}
	}


	public boolean ClickOnSave()
	{
		try{
		
		WebElement IntestPaymentWebelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(ClickOnSave_xpath));
		IntestPaymentWebelement.click();
		Thread.sleep(1000);
		
		return true;
	    }
		catch (Exception e) {
			return false;
		}
	}
	

	public boolean MessageafterPayment(String msg)
	{
		try{
		
		WebElement IntestPaymentWebelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(MessageAfterPayement_xpath));
		String actualData=IntestPaymentWebelement.getText().trim();
		if(actualData.equalsIgnoreCase(msg));
		return true;
	
	    }
		catch (Exception e) {
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
	

	public boolean ValidationPaymentdate_ProvidingDateMorethanCurrentDate(String message)
	{
		try{
		
		WebElement IntestPaymentWebelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(ErrorMessage_xpath));
		String actualData=IntestPaymentWebelement.getText().trim();
		if(actualData.equalsIgnoreCase(message));
		return true;
		
	    }
		catch (Exception e) {
			return false;
		}
	}
	
	public boolean ValidationPaymentdate_WithOutProvidingAmount(String message)
	{
		try{
		
		WebElement IntestPaymentWebelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(ErrorMessage_xpath));
		String actualData=IntestPaymentWebelement.getText().trim();
		if(actualData.equalsIgnoreCase(message));
		return true;
		
		}
		catch (Exception e) {
			return false;
		}
	}
	

	public boolean ValidationPaymentdate_AccuredInterestAmount(String Amount)
	{
		try{
		
		WebElement IntestPaymentWebelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(AccuredInterestAmount_xpath));
		String actualData=IntestPaymentWebelement.getText().trim();
		if(actualData.equalsIgnoreCase(Amount));
		return true;
	    }
		catch (Exception e) {
			return false;
		}
	}
	


	public boolean ValidationPaymentdate_DateAsPreviousRecordDate(String message)
	{
		try{
		
		WebElement IntestPaymentWebelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(ErrorMessageForInvalidDate_xpath));
		String actualData=IntestPaymentWebelement.getText().trim();
		if(actualData.equalsIgnoreCase(message));
		return true;
	
	    }
		catch (Exception e) {
			return false;
		}
	}
	

	public boolean ValidationOf_PendingDueAmount() 
	{
		try{
			WebElement breadcrumbWebEelement=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(PendingDueAmount_xpath));
			breadcrumbWebEelement.isDisplayed();
			return true;
		}
		catch(Exception ex){
			
		}
		return false;
	

		}
	


	public boolean ValidationExport()
	{
		try{
		
		WebElement IntestPaymentWebelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(Export_xpath));
		IntestPaymentWebelement.click();
		Thread.sleep(1000);
		
		return true;
	    }
		catch (Exception e) {
			return false;
		}
	}


	public boolean ValidationExportIcon()
	{
		try{
		
		WebElement IntestPaymentWebelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(ExportIcon_xpath));
		IntestPaymentWebelement.click();
		Thread.sleep(1000);
		
		return true;
	    }
		catch (Exception e) {
			return false;
		}
	}
	 


	public boolean VerifyWaiveLateFee()
	{
		try{
		
		WebElement IntestPaymentWebelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(WaiveLateFee_xpath));
		IntestPaymentWebelement.isDisplayed();
		Thread.sleep(1000);
		
		return true;
	    }
		catch (Exception e) {
			return false;
		}
	}

	
	
	public boolean VerifyWaiveLateFeeReason()
	{
		try{
		
		WebElement IntestPaymentWebelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(WaiveLateFee_xpath));
		IntestPaymentWebelement.isDisplayed();
		Thread.sleep(1000);
		
		return true;
	    }
		catch (Exception e) {
			return false;
		}
	}

	public boolean VerifyLateFeeAmount(String Amount)
	{
		try{
		
		WebElement IntestPaymentWebelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(LateFeeAmount_xpath));
		String actualData=IntestPaymentWebelement.getText().trim();
		if(actualData.equalsIgnoreCase(Amount));
		return true;
	    }
		catch (Exception e) {
			return false;
		}
	}

	public boolean verifyExpandableGridIcon()
	{
	try{
		WebElement editWebEelement=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(expandableGrid_xpath));
		editWebEelement.isDisplayed();
		return true;
	}
	catch(Exception ex){
			
	}
	return false;
	}
	
	public boolean verifyMinimizeOfExpandableGridIcon()
	{
	try{
		WebElement editWebEelement=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(minimizeExpandableGrid_xpath));
		editWebEelement.click();
		return true;
	}
	catch(Exception ex){
			
	}
	return false;
	}
	

	
	public boolean clickOnExpandableIcon()
	{
	try{
		Thread.sleep(3000);
		WebElement editWebEelement=new WebDriverWait(driver,20)
			.until(ExpectedConditions.visibilityOfElementLocated(expandableGrid_xpath));
		editWebEelement.click();
		Thread.sleep(2000);
		return true;
	}
	catch(Exception ex){
			
	}
	return false;
	}



public boolean verifyAddIcon_ExpandableIcon()
{
try{
	WebElement editWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(expandableAddIcon_xpath));
	editWebEelement.isDisplayed();
	return true;
}
catch(Exception ex){
		
}
return false;
}


public boolean clickAddIcon_ExpandableIcon()
{
try{
	Thread.sleep(3000);
	WebElement editWebEelement=new WebDriverWait(driver,20)
		.until(ExpectedConditions.visibilityOfElementLocated(expandableAddIcon_xpath));
	editWebEelement.click();
	Thread.sleep(1000);
	return true;
}
catch(Exception ex){
		
}
return false;
}

public boolean verifySaveIcon_ExpandableIcon()
{
try{
	WebElement editWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(ExpandableSaveIcon_xpath));
	editWebEelement.isDisplayed();
	return true;
}
catch(Exception ex){
		
}
return false;
}

public boolean clickSaveIcon_ExpandableIcon()
{
try{
	WebElement editWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(ExpandableSaveIcon_xpath));
	editWebEelement.click();
	return true;
}
catch(Exception ex){
		
}
return false;
}

public boolean verifyDeleteIcon_ExpandableReloadIcon()
{
try{
	WebElement editWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(ExpandableDeleteIcon_xpath));
	editWebEelement.isDisplayed();
	return true;
}
catch(Exception ex){
		
}
return false;
}



public boolean clickDeleteIcon_ExpandableReloadIcon()
{
try{
	WebElement editWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(ExpandableDeleteIcon_xpath));
	editWebEelement.click();
	return true;
}
catch(Exception ex){
		
}
return false;
}


public boolean verifyCancelIcon_ExpandableIcon()
{
try{
	WebElement editWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(ExpandableCancelIcon_xpath));
	editWebEelement.isDisplayed();
	return true;
	}
	catch(Exception ex){
	}
return false;
	}
			



public boolean clickCancelIcon_ExpandableIcon()
{
try{
	WebElement editWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(ExpandableCancelIcon_xpath));
	editWebEelement.click();
	return true;
}
catch(Exception ex){
		
}
return false;
}

public boolean verifyReloadIcon_ExpandableIcon()
{
try{
	WebElement editWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(ExpandableReloadIcon_xpath));
	editWebEelement.isDisplayed();
	return true;
}
catch(Exception ex){
		
}
return false;
}


public boolean verifyCheckbox_ExpandableIcon() 
{
	
try{
	Thread.sleep(1000);
	WebElement editWebEelement=new WebDriverWait(driver,20)
		.until(ExpectedConditions.visibilityOfElementLocated(Checkbox_xpath));
	editWebEelement.isDisplayed();
	return true;
	}
catch(Exception ex){
	
}
return false;
}


public boolean verifyPaymentDateColumn_ExpandableIcon()
{
try{
	WebElement editWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(PaymentDateColumn_xpath));
	editWebEelement.isDisplayed();
	return true;
}
catch(Exception ex){
	
}
return false;
}
		




public boolean clickReloadIcon_ExpandableIcon()
{
try{
	WebElement editWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(ExpandableReloadIcon_xpath));
	editWebEelement.click();
	return true;
}
catch(Exception ex){
		
}
return false;
}



public boolean verifyPaymentAmountColumn_ExpandableIcon()
{
try{
	WebElement editWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(PaymentAmountColumn_xpath));
	editWebEelement.isDisplayed();
	return true;
}
catch(Exception ex){
		
}
return false;
}





public boolean selectCheckbox()
{
try{
	Thread.sleep(2000);
	WebElement editWebEelement=new WebDriverWait(driver,20)
		.until(ExpectedConditions.visibilityOfElementLocated(FirstCheckbox_xpath));
	editWebEelement.click();
	return true;
}
catch(Exception ex){
		
}
return false;
}
//kruthivas
public boolean selectCheckbox2()
{
try{
	Thread.sleep(2000);
	WebElement editWebEelement=new WebDriverWait(driver,20)
		.until(ExpectedConditions.visibilityOfElementLocated(FirstCheckbox_xpath2));
	editWebEelement.click();
	return true;
}
catch(Exception ex){
		
}
return false;
}

public boolean clickOnDeleteInPopUp()
{
try{
	WebElement editWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(deleteButtonPopUp_xpath));
	editWebEelement.click();
	return true;
}
catch(Exception ex){
		
}
return false;
}

public boolean clickOnCancelInPopUp()
{
try{
	WebElement editWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(cancelButtonPopUp_xpath));
	editWebEelement.click();
	return true;
}
catch(Exception ex){
		
}
return false;
}

public String verifyMessageAfterDelete(String msg)
{
try{
   WebElement SaveWebEelement=new WebDriverWait(driver,10)
   .until(ExpectedConditions.visibilityOfElementLocated(deleteMsg_xpath));
   
  String actualMsg= SaveWebEelement.getText();
  if(actualMsg.equalsIgnoreCase(msg))
  {
   return actualMsg;
  }
   
}
catch(Exception ex){
 
}
return msg;
}


public String verifyMessageAfterUpdate(String msg)
{
try{
   WebElement SaveWebEelement=new WebDriverWait(driver,10)
   .until(ExpectedConditions.visibilityOfElementLocated(updateMsg_xpath));
   
  String actualMsg= SaveWebEelement.getText();
  if(actualMsg.equalsIgnoreCase(msg))
  {
   return actualMsg;
  }
   
}
catch(Exception ex){
 
}
return msg;
}

public boolean clickOnCloseInPopUp()
{
try{
	WebElement editWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(closeButtonPopUp_xpath));
	editWebEelement.click();
	return true;
}
catch(Exception ex){
		
}
return false;
}

public boolean DoubleClickVerify()
{
	try{
	Thread.sleep(1000);
	WebElement element=new WebDriverWait(driver,20)
	.until(ExpectedConditions.visibilityOfElementLocated(doubleClick_xpath));
	//Double click
	Actions action = new Actions(driver);
	action.doubleClick(element).build().perform();
	Thread.sleep(2000);
	
	return true;
}

	catch(Exception ex){
		return false;
	}
}


public boolean VerifyLateFeeAmountBeforeWaiveOff(String Amount)
{
	try{
	
	WebElement IntestPaymentWebelement=new WebDriverWait(driver,10)
	.until(ExpectedConditions.visibilityOfElementLocated(LateFeeAmountBeforeWaive_xpath));
	String actualData=IntestPaymentWebelement.getText().trim();
	if(actualData.equalsIgnoreCase(Amount));
	return true;
    }
	catch (Exception e) {
		return false;
	}
}

public boolean DoubleClickOnRecord()
{
	try{
	
	WebElement element=new WebDriverWait(driver,10)
	.until(ExpectedConditions.visibilityOfElementLocated(doubleClickOnRecord_xpath));
	//Double click
	Actions action = new Actions(driver);
	action.doubleClick(element).build().perform();
	Thread.sleep(2000);
	
	return true;
}

	catch(Exception ex){
		return false;
	}
}

public boolean ClickOnWaiveLateFeeCheckbox()
{
	try{
	
	WebElement element=new WebDriverWait(driver,10)
	.until(ExpectedConditions.visibilityOfElementLocated(ClickOnWaiveCheckbox_xpath));
	element.click();
	return true;
}

	catch(Exception ex){
		return false;
	}
}

public boolean EnterTextInWaiveLateFeeReasonTextbox(String waiveLateFeeReason)
{
	try{
	
	WebElement element=new WebDriverWait(driver,10)
	.until(ExpectedConditions.visibilityOfElementLocated(WaiveLateFeeTextbox_xpath));
	element.sendKeys(waiveLateFeeReason);
	return true;
}

	catch(Exception ex){
		return false;
	}
}

public boolean VerifyLateFeeAmountAfterWaiveOff(String Amount)
{
	try{
	
	WebElement IntestPaymentWebelement=new WebDriverWait(driver,10)
	.until(ExpectedConditions.visibilityOfElementLocated(LateFeeAmountBeforeWaive_xpath));
	String actualData=IntestPaymentWebelement.getText().trim();
	if(actualData.equalsIgnoreCase(Amount));
	return true;
    }
	catch (Exception e) {
		return false;
	}
}

public boolean VerifyMessageIcon()
{
	try{
	
	WebElement IntestPaymentWebelement=new WebDriverWait(driver,10)
	.until(ExpectedConditions.visibilityOfElementLocated(messageIcon_xpath));
	IntestPaymentWebelement.isDisplayed();
	return true;
    }
	catch (Exception e) {
		return false;
	}
}





public boolean ClickOnMessageIcon()

{
	try{
	
	WebElement IntestPaymentWebelement=new WebDriverWait(driver,10)
	.until(ExpectedConditions.visibilityOfElementLocated(messageIcon_xpath));

	IntestPaymentWebelement.isDisplayed();

	IntestPaymentWebelement.click();

	return true;
    }
	catch (Exception e) {
		return false;
	}
}


public boolean VerifyWaiveOffReasonInPopUp(String msg)
{
	try{
	
	WebElement IntestPaymentWebelement=new WebDriverWait(driver,10)
	.until(ExpectedConditions.visibilityOfElementLocated(TextMessage_xpath));
	String actualData=IntestPaymentWebelement.getText().trim();
	if(actualData.equalsIgnoreCase(msg));
	return true;
    }
	catch (Exception e) {
		return false;
	}
}

public boolean VerifyPendingDueAmountBeforeWaiveOff(String Amount)
{
	try{
	
	WebElement IntestPaymentWebelement=new WebDriverWait(driver,10)
	.until(ExpectedConditions.visibilityOfElementLocated(pendingAmountAmountBeforeWaive_xpath));
	String actualData=IntestPaymentWebelement.getText().trim();
	if(actualData.equalsIgnoreCase(Amount));
	return true;
    }
	catch (Exception e) {
		return false;
	}
}

public boolean VerifyPendingDueAmountAfterWaiveOff(String Amount)
{
	try{
	
	WebElement IntestPaymentWebelement=new WebDriverWait(driver,10)
	.until(ExpectedConditions.visibilityOfElementLocated(pendingAmountAmountBeforeWaive_xpath));
	String actualData=IntestPaymentWebelement.getText().trim();
	if(actualData.equalsIgnoreCase(Amount));
	return true;
    }
	catch (Exception e) {
		return false;
	}
}

public boolean ValidateWithoutAddingPaymentDate()
{
	try{
	
	WebElement IntestPaymentWebelement=new WebDriverWait(driver,10)
	.until(ExpectedConditions.visibilityOfElementLocated(EnterPaymentDate_xpath));
	IntestPaymentWebelement.clear();
	
	IntestPaymentWebelement.sendKeys(Keys.ESCAPE);
	Thread.sleep(1000);
	
	return true;
    }
	catch (Exception e) {
		return false;
	}
}
}



	















