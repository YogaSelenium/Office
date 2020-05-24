package com.cync.FactoringPages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
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

public class AccountDebtorPage extends BasePage {


	private final By accountDebtorsHeader_xpath = By.xpath("//span[@class='paneltitle']");
	private final By selectClientDropdown_xpath = By.xpath("//span[@class='select2 select2-container select2-container--default select2-container--below select2-container--focus']//span[@class='select2-selection select2-selection--single']");
	private final By selectDebtorDropdown_xpath = By.xpath("//select[@id='debtor_id']");
	//private final By newAccountDebtorBTN_xpath = By.xpath("//tr[@id='6012']//td[4]");
	private final By newAccountDebtorBTN_xpath = By.xpath("//*[text()='New Account Debtor']");
	
	private final By Accountpara_xpath = By.xpath("//a[contains(text(),'Account Parameters')]");
	private final By edit_xpath = By.xpath("//button[@id='edit_customer']");
	private final By scrubAccountDebtorBTN_xpath = By.xpath("//a[@class='view-button scrub_customer'] ");
	private final By customerListCheckBox_xpath = By.id("cb_customers_list");
	private final By backToMainPageBTN_xpath = By.xpath("//a[@class='view-button cancel_btn'] ");
	//private final By saveBTN_xpath = By.id("customer_save_bt");
	//button[@class='view-button save_btn create' and text()]
	//private final By saveBTN_xpath = By.xpath("//button[@class='view-button save_btn create' and text()='Save']");
	private final By saveBTN_xpath = By.xpath("//div[@id='basic_details']//div/div/button[1]");
	
	private final By successMessage_xpath = By.xpath("//b[contains(text(),'Success')]");
	private final By scrubSuccessMsg_xpath = By.xpath("//div[@id='infocnt']");
	private final By closeBTN_xpath = By.id("closedialog");
	private final By detailedDebtorAging_xpath = By.xpath("//div[@id='gview_detail_debtor']//tr[@class='ui-jqgrid-labels'] ");
	
	private final By accNoField_xpath = By.id("jqgh_customers_list_account_no");
	private final By accNameField_xpath = By.id("customers_list_account_name");
	private final By openInvBalField_xpath = By.id("jqgh_customers_list_open_balance_amount");
	private final By futureField_xpath = By.id("customers_list_future_bucket_amount");
	private final By currentField_xpath = By.id("jqgh_customers_list_bucket_0_amount");
	private final By oneToThirtyField_xpath = By.id("jqgh_customers_list_bucket_1_amount");
	private final By thirtyToSixtyField_xpath = By.id("jqgh_customers_list_bucket_2_amount");
	private final By sixtyToNinetyField_xpath = By.id("jqgh_customers_list_bucket_3_amount");
	private final By ninetyToOneTwentyField_xpath = By.id("jqgh_customers_list_bucket_4_amount");
	private final By overOneTwentyField_xpath = By.id("jqgh_customers_list_bucket_5_amount");
	private final By invoiceCountField_xpath = By.id("jqgh_customers_list_inv_count");
	private final By concentrationField_xpath = By.id("customers_list_concentration");
	private final By dillutionField_xpath = By.id("customers_list_dilution");
	private final By dsoField_xpath = By.id("customers_list_dso");
	
	private final By detDebAgingHyperLink_xpath = By.xpath("//a[contains(text(),'Detailed Debtor Aging')]  ");
	private final By accParametersHyperLink_xpath = By.xpath("//a[contains(text(),'Account Parameters')] ");
	private final By commentsHyperLink_xpath = By.xpath("/a[@title='Customer Comments']  ");
	private final By debPerformanceHyperLink_xpath = By.xpath("//a[contains(text(),'Debtor Performance')]  ");
	
	private final By debNameHyperLink_xpath = By.xpath("(//td[@aria-describedby='customers_list_account_name'])[1]");
	private final By detDebAgingPopup_xpath = By.xpath("//a[contains(text(),'Detailed Debtor Aging')]");
	private final By popupCloseBTN_xpath = By.xpath("//button[@class='ui-dialog-titlebar-close']");
	
	private final By detDebAgingPage_xpath = By.xpath("(//tr[@class='ui-jqgrid-labels'])[2]");
	
	private final By detInvoiceNoField_xpath = By.id("jqgh_detail_debtor_receivable_no");
	private final By detPoNoField_xpath = By.id("jqgh_detail_debtor_po_number");
	private final By detInvoiceDateField_xpath = By.id("jqgh_detail_debtor_invoice_dt");
	private final By detDueDateField_xpath = By.id("jqgh_detail_debtor_due_dt");
	private final By detInvoiceAmtField_xpath = By.id("jqgh_detail_debtor_current_amount");
	private final By detBalAmtField_xpath = By.id("jqgh_detail_debtor_original_amount");
	private final By detFutureField_xpath = By.id("jqgh_detail_debtor_future_amount");
	private final By detCurrentField_xpath = By.id("jqgh_detail_debtor_bucket_current_amount");
	private final By detOverThirtyField_xpath = By.id("jqgh_detail_debtor_bucket_1_amount");
	private final By detOverSixtyField_xpath = By.id("jqgh_detail_debtor_bucket_2_amount");
	private final By detOverNinetyField_xpath = By.id("jqgh_detail_debtor_bucket_3_amount");
	private final By detOverOneTwentyField_xpath = By.id("jqgh_detail_debtor_bucket_4_amount");
	
	private final By invoiceNoHyperLink_xpath = By.xpath("//tr[@id='136192']//td[4]");
	private final By balAmtHyperLink_xpath = By.xpath("//tr[@id='136192']//td[9]");
	private final By invoiceDetailsPopup_xpath = By.xpath("//body[@class='cync-bg x-fixed']/div[8]  ");
	private final By invoiceDetailsHyperLink_xpath = By.xpath("//a[contains(text(),'Invoice Details')]");
	private final By invoiceDocumentsHyperLink_xpath = By.xpath("//a[contains(text(),'Invoice Documents')]");
	private final By invCommentsHyperLink_xpath = By.xpath("(//a[contains(text(),'Comments')])[1]");
	private final By cashReceiptHyperLink_xpath = By.xpath("(//a[contains(text(),'Cash Receipt')])[1]");
	
	private final By cashReceiptPageHeader_xpath = By.xpath("//span[contains(text(),'Cash Receipt')]");
	
	private final By editBTN_xpath = By.id("edit_customer");
	private final By backToMainPage_xpath = By.xpath("//a[@class='view-button cancel_btn']");
	private final By commentsPopup_xpath = By.xpath("//div[@class='ui-dialog ui-widget ui-widget-content ui-corner-all ui-front ui-draggable ui-resizable']  ");
	
	private final By accNameTextBox_xpath = By.id("customer_account_name");
	private final By accNoTextBox_xpath = By.id("customer_account_no");
	private final By verificationModeDropdown_xpath = By.id("customer_verification_mode");
	private final By editSelectClientDropdown_xpath = By.id("customer_borrowers_customers_attributes_0_borrower_id");
	private final By primaryContactsChkBox_xpath = By.id("customer_customer_contact_people_attributes_0_is_primary");
	private final By contactNameTextBox_xpath = By.id("customer_customer_contact_people_attributes_0_name");
	private final By contactPhNoTextBox_xpath = By.id("customer_customer_contact_people_attributes_0_phone");
	private final By contactAltPhnoTextBox_xpath = By.xpath("//input[@id='customer_customer_contact_people_attributes_0_alternate_phone_no'] ");
	private final By faxnoTextBox_xpath = By.xpath("//input[@id='customer_customer_contact_people_attributes_0_fax'] ");
	private final By contactEmailTextBox_xpath = By.id("customer_customer_contact_people_attributes_0_email");
	
	private final By primaryOfficeChkBox_xpath = By.id("customer_customer_office_addresses_attributes_0_is_primary");
	private final By streetAddTextBox_xpath = By.id("customer_customer_office_addresses_attributes_0_street_address");
	private final By cityTextBox_xpath = By.id("customer_customer_office_addresses_attributes_0_city");
	private final By zipCodeTextBox_xpath = By.id("customer_customer_office_addresses_attributes_0_zip_code");
	private final By officePhNoTextBox_xpath = By.id("customer_customer_office_addresses_attributes_0_phone");
	private final By officeFaxTextBox_xpath = By.id("customer_customer_office_addresses_attributes_0_fax");
	private final By websiteTextBox_xpath = By.id("customer_customer_office_addresses_attributes_0_website");
	
	private final By includePaidInvoicesCheckBox_xpath = By.id("include_paid_invoice");
	
	private final By selectClient_xpath = By.xpath("(//span[@class='select2-selection select2-selection--single'])[3]");
	private final By searchClientTextBox_xpath = By.xpath("//input[@type='search']");
	private final By searchClient_xpath = By.xpath("//span[@class='select2-results']");
	
	public AccountDebtorPage(WebDriver driver) {
		super(driver);
		//span[@class='select2-results']
	}
	
	
	public String PageHeaderVerify(String Header)
    {
    	try
    	{
    		WebElement HeaderWebEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(accountDebtorsHeader_xpath));
		HeaderWebEelement.getText();
		Thread.sleep(2000);
    	}
    	catch(Exception e)
    	{
    	}
    	return Header;
    }
	
	public boolean selectClientdropdownValues(String selectClientData) {
		try {
			WebElement SelectClientDropdownWebEelement = new WebDriverWait(
					driver, 10).until(ExpectedConditions
					.visibilityOfElementLocated(selectClientDropdown_xpath));
			Select sel = new Select(SelectClientDropdownWebEelement);
			List<WebElement> list = sel.getOptions();
			for (WebElement ele : list) {
				if (ele.getText().equals(selectClientData)) {
					ele.click();
					Thread.sleep(1000);
					 return true;
				}
			}
		} catch (Exception ex) {
		}
		return false;
	}

	public boolean SelectDebtordropdownValues(String selectDebtorData) {
		try {
			WebElement SelectDebtorDropdownWebEelement = new WebDriverWait(
					driver, 10).until(ExpectedConditions
					.visibilityOfElementLocated(selectDebtorDropdown_xpath));
			Select sel = new Select(SelectDebtorDropdownWebEelement);
			List<WebElement> list = sel.getOptions();
			for (WebElement ele : list) {
				if (ele.getText().equals(selectDebtorData)) {
					ele.click();
					Thread.sleep(10000);
					 return true;
				}
			}
		} catch (Exception ex) {
		}
		return false;
	}
	
	public boolean ClickNewAccDebtorBTN()
	{
		try
		{
			WebElement NewAccDebtorWebElement =new WebDriverWait(driver,100)
			.until(ExpectedConditions.elementToBeClickable(newAccountDebtorBTN_xpath));
			NewAccDebtorWebElement.click();
			
			/*WebElement NewAccDebtorWebElement1 =new WebDriverWait(driver,100)
			.until(ExpectedConditions.elementToBeClickable(Accountpara_xpath));
			NewAccDebtorWebElement1.click();
			
			WebElement NewAccDebtorWebElement2 =new WebDriverWait(driver,100)
			.until(ExpectedConditions.elementToBeClickable(edit_xpath));
			NewAccDebtorWebElement2.click();*/
			
			Thread.sleep(3000);
			/*
			WebElement BackToMainPageWebElement =new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(backToMainPageBTN_xpath));
			BackToMainPageWebElement.isDisplayed();*/
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}
	
	public boolean VerifyDetailedDebtorAging()
	{
		try
		{
			WebElement DetailedDebAgingWebElement =new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(detailedDebtorAging_xpath));
			DetailedDebAgingWebElement.isDisplayed();
			
			Thread.sleep(5000);
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}
	
	public boolean VerifyAccNoField()
	{
		try
		{
			WebElement AccNoFieldWebElement = new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(accNoField_xpath));
			AccNoFieldWebElement.isDisplayed();
			
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}
	
	public boolean VerifyAccNameField()
	{
		try
		{
			WebElement AccNameFieldWebElement = new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(accNameField_xpath));
			AccNameFieldWebElement.isDisplayed();
			
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}
	
	public boolean VerifyOpenInvBalField()
	{
		try
		{
			WebElement OpenInvBalFieldWebElement = new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(openInvBalField_xpath));
			OpenInvBalFieldWebElement.isDisplayed();
			
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}
	
	public boolean VerifyFutureField()
	{
		try
		{
			WebElement FutureFieldWebElement = new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(futureField_xpath));
			FutureFieldWebElement.isDisplayed();
			
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}
	
	public boolean VerifyCurrentField()
	{
		try
		{
			WebElement CurrentFieldWebElement = new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated( currentField_xpath));
			CurrentFieldWebElement.isDisplayed();
			
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}
	
	public boolean VerifyOneToThirtyField()
	{
		try
		{
			WebElement OneToThirtyFieldWebElement = new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(oneToThirtyField_xpath));
			OneToThirtyFieldWebElement.isDisplayed();
			
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}
	
	public boolean VerifyThrityToSixtyField()
	{
		try
		{
			WebElement ThirtyToSixtyFieldWebElement = new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(thirtyToSixtyField_xpath));
			ThirtyToSixtyFieldWebElement.isDisplayed();
			
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}
	
	public boolean VerifySixtyToNinetyField()
	{
		try
		{
			WebElement SixtyToNinetyFieldWebElement = new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(sixtyToNinetyField_xpath));
			SixtyToNinetyFieldWebElement.isDisplayed();
			
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}
	
	
	public boolean VerifyNinetyToOneTwentyField()
	{
		try
		{
			WebElement NinetyToOneTwentyFieldWebElement = new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(ninetyToOneTwentyField_xpath));
			NinetyToOneTwentyFieldWebElement.isDisplayed();
			
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}
	
	
	public boolean VerifyOverOneTwentyField()
	{
		try
		{
			WebElement OverOneTwentyFieldWebElement = new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(overOneTwentyField_xpath));
			OverOneTwentyFieldWebElement.isDisplayed();
			
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}
	
	public boolean VerifyInvoiceCountField()
	{
		try
		{
			WebElement InvoiceCountFieldWebElement = new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(invoiceCountField_xpath));
			InvoiceCountFieldWebElement.isDisplayed();
			
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}
	
	public boolean VerifyConcentrationField()
	{
		try
		{
			WebElement ConcentrationFieldWebElement = new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(concentrationField_xpath));
			ConcentrationFieldWebElement.isDisplayed();
			
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}
	
	public boolean VerifyDillutionField()
	{
		try
		{
			WebElement DillutionFieldWebElement = new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(dillutionField_xpath));
			DillutionFieldWebElement.isDisplayed();
			
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}
	
	public boolean VerifyDsoField()
	{
		try
		{
			WebElement DsoFieldWebElement = new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(dsoField_xpath));
			DsoFieldWebElement.isDisplayed();
			
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}
	
	public boolean VerifyDetDebAgingHyperLink()
	{
		try
		{
			WebElement DetDebAgingWebElement = new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(detDebAgingHyperLink_xpath));
			DetDebAgingWebElement.isDisplayed();
			
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}
	
	public boolean VerifyAccParametersHyperLink()
	{
		try
		{
			WebElement AccParametersWebElement = new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(accParametersHyperLink_xpath));
			AccParametersWebElement.isDisplayed();
			
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}
	
	public boolean ClickAccParametersHyperLink()
	{
		try
		{
			WebElement AccParametersWebElement = new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(accParametersHyperLink_xpath));
			AccParametersWebElement.click();
			
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}
	
	public boolean VerifyCommentsHyperLink()
	{
		try
		{
			WebElement CommentsWebElement = new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(commentsHyperLink_xpath));
			CommentsWebElement.isDisplayed();
			
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}
	
	public boolean VerifyDebPerformanceHyperLink()
	{
		try
		{
			WebElement DebPerformanceWebElement = new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(debPerformanceHyperLink_xpath));
			DebPerformanceWebElement.isDisplayed();
			
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}
	
	public boolean ClickAccNameHyperLink()
	{
		try
		{
			WebElement AccNameWebElement = new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(debNameHyperLink_xpath));
			AccNameWebElement.click();
			
			WebElement DetDebAgingPopupWebElement = new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(detDebAgingPopup_xpath));
			DetDebAgingPopupWebElement.isDisplayed();
			
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}
	
	
	public boolean ClickDetDebAgingHyperLink()
	{
		try
		{
			WebElement DetDebAgingWebElement = new WebDriverWait(driver,200)
			.until(ExpectedConditions.visibilityOfElementLocated(detDebAgingHyperLink_xpath));
			DetDebAgingWebElement.click();
			
			
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}
	
	public boolean VerifyDetDebAgingPage()
	{
		try
		{
			WebElement DetDebAgingPageWebElement = new WebDriverWait(driver,200)
			.until(ExpectedConditions.visibilityOfElementLocated(detDebAgingPage_xpath));
			 DetDebAgingPageWebElement.isDisplayed();
			
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}
	
	public boolean VerifyDetInvNoField()
	{
		try
		{
			WebElement DetInvNoFieldWebElement = new WebDriverWait(driver,200)
			.until(ExpectedConditions.visibilityOfElementLocated(detInvoiceNoField_xpath));
			DetInvNoFieldWebElement.isDisplayed();
			
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}
	
	public boolean VerifyDetPoNoField()
	{
		try
		{
			WebElement DetPoNoFieldWebElement = new WebDriverWait(driver,200)
			.until(ExpectedConditions.visibilityOfElementLocated(detPoNoField_xpath));
			DetPoNoFieldWebElement.isDisplayed();
			
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}
	
	public boolean VerifyDetInvDateField()
	{
		try
		{
			WebElement DetInvDateFieldWebElement = new WebDriverWait(driver,200)
			.until(ExpectedConditions.visibilityOfElementLocated(detInvoiceDateField_xpath));
			DetInvDateFieldWebElement.isDisplayed();
			
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}
	
	public boolean VerifyDetDueDateField()
	{
		try
		{
			WebElement DetDueDateFieldWebElement = new WebDriverWait(driver,200)
			.until(ExpectedConditions.visibilityOfElementLocated(detDueDateField_xpath));
			DetDueDateFieldWebElement.isDisplayed();
			
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}
	
	public boolean VerifyDetInvAmtField()
	{
		try
		{
			WebElement DetInvAmtFieldWebElement = new WebDriverWait(driver,200)
			.until(ExpectedConditions.visibilityOfElementLocated(detInvoiceAmtField_xpath));
			DetInvAmtFieldWebElement.isDisplayed();
			
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}
	
	public boolean VerifyDetBalAmtField()
	{
		try
		{
			WebElement DetBalAmtFieldWebElement = new WebDriverWait(driver,200)
			.until(ExpectedConditions.visibilityOfElementLocated(detBalAmtField_xpath));
			DetBalAmtFieldWebElement.isDisplayed();
			
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}
	
	public boolean VerifyDetFutureField()
	{
		try
		{
			WebElement DetFutureFieldWebElement = new WebDriverWait(driver,200)
			.until(ExpectedConditions.visibilityOfElementLocated(detFutureField_xpath));
			DetFutureFieldWebElement.isDisplayed();
			
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}
	
	public boolean VerifyDetCurrentField()
	{
		try
		{
			WebElement DetCurrentFieldWebElement = new WebDriverWait(driver,200)
			.until(ExpectedConditions.visibilityOfElementLocated(detCurrentField_xpath));
			DetCurrentFieldWebElement.isDisplayed();
			
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}
	
	public boolean VerifyDetOverThirtyField()
	{
		try
		{
			WebElement DetOverThirtyFieldWebElement = new WebDriverWait(driver,200)
			.until(ExpectedConditions.visibilityOfElementLocated(detOverThirtyField_xpath));
			DetOverThirtyFieldWebElement.isDisplayed();
			
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}
	
	public boolean VerifyDetOverSixtyField()
	{
		try
		{
			WebElement DetOverSixtyFieldWebElement = new WebDriverWait(driver,200)
			.until(ExpectedConditions.visibilityOfElementLocated(detOverSixtyField_xpath));
			DetOverSixtyFieldWebElement.isDisplayed();
			
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}
	
	
	public boolean VerifyDetOverNinetyField()
	{
		try
		{
			WebElement DetOverNinetyFieldWebElement = new WebDriverWait(driver,200)
			.until(ExpectedConditions.visibilityOfElementLocated(detOverNinetyField_xpath));
			DetOverNinetyFieldWebElement.isDisplayed();
			
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}
	
	public boolean VerifyDetOverOneTwentyField()
	{
		try
		{
			WebElement DetOverOneTwentyFieldWebElement = new WebDriverWait(driver,200)
			.until(ExpectedConditions.visibilityOfElementLocated(detOverOneTwentyField_xpath));
			DetOverOneTwentyFieldWebElement.isDisplayed();
			
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}
	
	
	public boolean ClickInvNoHyperLink()
	{
		try
		{
			WebElement InvNoWebElement = new WebDriverWait(driver,200)
			.until(ExpectedConditions.elementToBeClickable(invoiceNoHyperLink_xpath));
			InvNoWebElement.click();
			
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}
	
	
	public boolean VerifyInvoiceDetPopup()
	{
		try
		{
			WebElement InvDetPopupWebElement = new WebDriverWait(driver,200)
			.until(ExpectedConditions.visibilityOfElementLocated(invoiceDetailsPopup_xpath));
			InvDetPopupWebElement.isDisplayed();
			
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}
	
	public boolean VerifyInvDetailsHyperLink()
	{
		try
		{
			WebElement InvDetHyperLinkWebElement = new WebDriverWait(driver,200)
			.until(ExpectedConditions.visibilityOfElementLocated(invoiceDetailsHyperLink_xpath));
			InvDetHyperLinkWebElement.isDisplayed();
			
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}
	
	public boolean VerifyInvDocumentsHyperLink()
	{
		try
		{
			WebElement InvDocumentsHyperLinkWebElement = new WebDriverWait(driver,200)
			.until(ExpectedConditions.visibilityOfElementLocated(invoiceDocumentsHyperLink_xpath));
			InvDocumentsHyperLinkWebElement.isDisplayed();
			
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}
	
	public boolean VerifyInvCommentsHyperLink()
	{
		try
		{
			WebElement InvCommentsHyperLinkWebElement = new WebDriverWait(driver,200)
			.until(ExpectedConditions.visibilityOfElementLocated(invCommentsHyperLink_xpath));
			InvCommentsHyperLinkWebElement.isDisplayed();
			
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}
	
	public boolean VerifyCashReceiptHyperLink()
	{
		try
		{
			WebElement CashReceiptHyperLinkWebElement = new WebDriverWait(driver,200)
			.until(ExpectedConditions.visibilityOfElementLocated(cashReceiptHyperLink_xpath));
			CashReceiptHyperLinkWebElement.isDisplayed();
			
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}
	
	public boolean ClickCashReceiptHyperLink()
	{
		try
		{
			WebElement CashReceiptHyperLinkWebElement = new WebDriverWait(driver,200)
			.until(ExpectedConditions.visibilityOfElementLocated(cashReceiptHyperLink_xpath));
			CashReceiptHyperLinkWebElement.click();
			
			Thread.sleep(3000);
			WebElement CashReceiptHeaderWebElement = new WebDriverWait(driver,200)
			.until(ExpectedConditions.visibilityOfElementLocated(cashReceiptPageHeader_xpath));
			CashReceiptHeaderWebElement.isDisplayed();
			
			
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}
	
	
	public boolean ClickBalAmountHyperLink()
	{
		try
		{
			WebElement BalAmtHyperLinkWebElement = new WebDriverWait(driver,200)
			.until(ExpectedConditions.visibilityOfElementLocated(balAmtHyperLink_xpath));
			BalAmtHyperLinkWebElement.click();
			
			Thread.sleep(3000);
			WebElement CashReceiptHeaderWebElement = new WebDriverWait(driver,200)
			.until(ExpectedConditions.visibilityOfElementLocated(cashReceiptPageHeader_xpath));
			CashReceiptHeaderWebElement.isDisplayed();
			
			
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}
	
	public boolean VerifyEditBTN()
	{
		try
		{
			WebElement EditBTNWebElement = new WebDriverWait(driver,200)
			.until(ExpectedConditions.visibilityOfElementLocated(editBTN_xpath));
			EditBTNWebElement.isDisplayed();
			
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}
	
	
	public boolean ClickBackToMainPage()
	{
		try
		{
			WebElement BackToMainPageWebElement = new WebDriverWait(driver,200)
			.until(ExpectedConditions.visibilityOfElementLocated(backToMainPage_xpath));
			BackToMainPageWebElement.click();
			
			
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}
	
	public boolean VerifyAccDebMainPage()
	{
		try
		{
			WebElement NewAccDebBTNWebElement = new WebDriverWait(driver,200)
			.until(ExpectedConditions.visibilityOfElementLocated(newAccountDebtorBTN_xpath));
			NewAccDebBTNWebElement.isDisplayed();
			
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}
	
	public boolean ClickCommentsHyperLink()
	{
		try
		{
			WebElement CommentsHyperLinkWebElement = new WebDriverWait(driver,200)
			.until(ExpectedConditions.visibilityOfElementLocated(commentsHyperLink_xpath));
			CommentsHyperLinkWebElement.click();
			
			
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}
	
	public boolean VerifyCommentsPopup()
	{
		try
		{
			WebElement CommentsPopupWebElement = new WebDriverWait(driver,200)
			.until(ExpectedConditions.visibilityOfElementLocated(commentsPopup_xpath));
			CommentsPopupWebElement.isDisplayed();
			
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}
	
	public String addValuesToAccName(String accNameData)
	{
		try
		{
			WebElement AccNameWebElement = new WebDriverWait(driver,200)
			.until(ExpectedConditions.elementToBeClickable(accNameTextBox_xpath));
			AccNameWebElement.clear();
			AccNameWebElement.sendKeys(accNameData);
			
		}
		catch(Exception e)
		{
			
		}
		return accNameData;
	}
	
	public String addValuesToAccNo(String accNoData)
	{
		try
		{
			WebElement AccNoWebElement = new WebDriverWait(driver,200)
			.until(ExpectedConditions.elementToBeClickable(accNoTextBox_xpath));
			AccNoWebElement.clear();
			AccNoWebElement.sendKeys(accNoData);
			
		}
		catch(Exception e)
		{
			
		}
		return accNoData;
	}
	
	public boolean VerifyIncludePaidInvoices()
	{
		try
		{
			WebElement IncludePaidInvoicesWebElement = new WebDriverWait(driver,200)
			.until(ExpectedConditions.visibilityOfElementLocated(includePaidInvoicesCheckBox_xpath));
			IncludePaidInvoicesWebElement.isDisplayed();
			
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}
	
	public boolean ClickOnSaveBTN()
	{
		try
		{
			WebElement SaveBTNWebElement = new WebDriverWait(driver,200)
			.until(ExpectedConditions.visibilityOfElementLocated(saveBTN_xpath));
			SaveBTNWebElement.click();
	        Thread.sleep(8000);
			
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}
	
	public boolean VerifySuccessMessage()
	{
		try
		{
			WebElement successMsgWebElement = new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(successMessage_xpath));
			successMsgWebElement.isDisplayed();
			
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}
	
	public boolean ClickOnMsgCloseBTN()
	{
		try
		{
			Thread.sleep(1000);
			WebElement CloseBTNWebElement = new WebDriverWait(driver,200)
			.until(ExpectedConditions.visibilityOfElementLocated(closeBTN_xpath));
			CloseBTNWebElement.click();
			
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}

	
	public boolean ClickOnPopupCloseBTN()
	{
		try
		{
			WebElement CloseBTNWebElement = new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(popupCloseBTN_xpath));
			
			CloseBTNWebElement.click();
			
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}


	public boolean SelectVerificationMode(String verificationmode) {
		try
		{
			WebElement verificationmodeWebElement = new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(verificationModeDropdown_xpath));
			Select sel = new Select(verificationmodeWebElement);
			List<WebElement> list = sel.getOptions();
			for (WebElement ele : list) {
				if (ele.getText().equals(verificationmode)) 
				       {
					ele.click();
					Thread.sleep(2000);
					break;
				       }
			
			}
			return true;
			}
		
		catch(Exception e)
		{
			return false;
		}
		}


	public boolean CheckOnPrimaryCheckBox() {
		try
		{
			WebElement PrimaryCheckBoxWebElement = new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(primaryContactsChkBox_xpath));
			PrimaryCheckBoxWebElement.click();
			
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}


	public boolean addValuesToContactNameTextBox(String contactname) {
		try
		{
			WebElement ContactNameTextBoxWebElement = new WebDriverWait(driver,100)
			.until(ExpectedConditions.elementToBeClickable(contactNameTextBox_xpath));
			ContactNameTextBoxWebElement.clear();
			ContactNameTextBoxWebElement.sendKeys(contactname);
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
		
	}


	public boolean addValuesToPhoneNoTextBox(String phoneno) {
		try
		{
			WebElement PhoneNoTextBoxWebElement = new WebDriverWait(driver,100)
			.until(ExpectedConditions.elementToBeClickable(contactPhNoTextBox_xpath));
			PhoneNoTextBoxWebElement.clear();
			PhoneNoTextBoxWebElement.sendKeys(phoneno);
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}


	public boolean addValuesToAlTPhoneNoTextBox(String altphoneno) {
		try
		{
			WebElement AlTPhoneNoTextBoxWebElement = new WebDriverWait(driver,100)
			.until(ExpectedConditions.elementToBeClickable(contactAltPhnoTextBox_xpath));
			AlTPhoneNoTextBoxWebElement.clear();
			AlTPhoneNoTextBoxWebElement.sendKeys(altphoneno);
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}


	public boolean addValuesToFaxNoTextBox(String faxno) {
		try
		{
			WebElement FaxNoTextBoxWebElement = new WebDriverWait(driver,100)
			.until(ExpectedConditions.elementToBeClickable(faxnoTextBox_xpath));
			FaxNoTextBoxWebElement.clear();
			FaxNoTextBoxWebElement.sendKeys(faxno);
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}


	public boolean addValuesToEmailTextBox(String email) {
		try
		{
			WebElement EmailTextBoxWebElement = new WebDriverWait(driver,100)
			.until(ExpectedConditions.elementToBeClickable(contactEmailTextBox_xpath));
			EmailTextBoxWebElement.clear();
			EmailTextBoxWebElement.sendKeys(email);
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}


	public void Scrolldown() throws AWTException {
		try
		{
			JavascriptExecutor jse = (JavascriptExecutor)driver;
			jse.executeScript("scroll(0, 500);");
            Thread.sleep(1000);
		}
		catch(Exception e)
		{
			
		}
		
	}
	public void ScrollUp() throws AWTException {
		try
		{/*
			JavascriptExecutor jse = (JavascriptExecutor)driver;

			jse.executeScript("window.scrollBy(0,-750)");
            Thread.sleep(1000);*/
            
            Actions actions = new Actions(driver);

            // Scroll Down using Actions class
           // actions.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();

            // Scroll Up using Actions class
            actions.keyUp(Keys.CONTROL).sendKeys(Keys.HOME).perform();
            
            WebElement element_scroll = driver
                    .findElement(By.xpath("//span[@class='paneltitle']"));
            actions.clickAndHold(element_scroll).moveByOffset(40, 0).release().perform();
            
            //moveByOffset(600, 0).click().release().perform();
            
		}
		catch(Exception e)
		{
			
		}
		
	}
	
	public boolean selectClientFromDropDown(String ClientData) {
		try {
			this.SelectClientFunction();
			this.addValueToSearch(ClientData);
			Thread.sleep(2000);
			this.SearchClientClick();

			//Thread.sleep(5000);
	        Thread.sleep(2000);

			return true;
		} catch (Exception ex) {
			return false;
		}

	}
	
	public boolean SelectClientFunction() {
		try {


			Thread.sleep(100);

			WebElement selectClientWebEelement = new WebDriverWait(driver, 100)

					.until(ExpectedConditions
							.visibilityOfElementLocated(selectClient_xpath));
			selectClientWebEelement.click();

			return true;
		} catch (Exception ex) {
			return false;
		}

	}
	public String addValueToSearch(String ClientData) {
		try {
			WebElement searchClientTextBoxWebEelement = new WebDriverWait(
					driver, 10).until(ExpectedConditions
					.visibilityOfElementLocated(searchClientTextBox_xpath));
			searchClientTextBoxWebEelement.click();
			searchClientTextBoxWebEelement.clear();
			searchClientTextBoxWebEelement.sendKeys(ClientData);
			

		} catch (Exception ex) {

		}
		return ClientData;

	}
	public boolean SearchClientClick() {
		try {

			WebElement searchClientWebEelement = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(searchClient_xpath));
			searchClientWebEelement.click();

			return true;
		} catch (Exception ex) {
			return false;
		}

	}
	}
