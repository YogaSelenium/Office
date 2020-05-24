package com.cync.FactoringPages;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.cync.base.BasePage;

public class PreVerificationPageFactoring extends BasePage
{
	private final By PreVerificationPageFactoring_xpath = By.xpath("//span[@class='paneltitle']");
	private final By preverificationBTN_xpath = By.xpath("//a[@id='debtor_verification']");
	private final By editIvnoicesBTN_xpath = By.xpath("//button[contains(text(),'Edit Invoice(s)')] ");
	private final By markinelgibleBTN_xpath = By.xpath("//a[@id='mark_invalid']");
	private final By invoicelistCheckbox_xpath = By.xpath("//input[@id='cb_receivables_list']");
	
	private final By closeSuccessMSG_xpath = By.xpath("//a[@id='closedialog']");
	private final By manualEntryPageHeader_xpath = By.xpath(" //span[@class='paneltitle']");
	private final By editsuccessMsg_xpath = By.xpath("//ul[contains(text(),'Receivable was successfully created.')] ");
	private final By processInvoicesBTN_xpath = By.id("save_entire_batch_invoice_button");
	private final By successMsg_xpath = By.xpath("//div[@class='alert alert-success']");
	private final By verificationNoLink_xpath = By.xpath("(//div[contains(@onclick,'get_schedule_model')])[1]");
	private final By veribatchdetailpoupheader_xpath = By.xpath("//span[@id='ui-id-2']");
	private final By plusBTN_xpath = By.xpath("//span[@class='xfact-col xfact-iconbar xfact-plus'] ");
	private final By verificationModeDropdown_xpath = By.xpath("//select[@name='verification_mode']");
	private final By verifyBTN_xpath = By.xpath("//a[@class='view-button verify_via_call']");
	private final By paymentTermsDropdown_xpath = By.xpath("//select[@id='all_payment_term']");//select[@name='payment_term_id']
	
	private final By debtorCommentTB_xpath = By.xpath("(//textarea[contains(@id,'invoices')])[1]");
	private final By additionalCommetTB_xpath = By.xpath("//textarea[@id='comment_text']");
	private final By signTB_xpath = By.xpath("//input[@id='signer_name']");
	private final By agreeCheckbox_xpath = By.xpath("//input[@id='terms_condition']");
	private final By submitBTN_xpath = By.xpath("//input[@id='debtor_process']");
	private final By thankyouMsg_xpath = By.xpath("//div[@class='ui-dialog ui-corner-all ui-widget ui-widget-content ui-front ui-draggable ui-resizable'] ");
	private final By closeVerificationpoup_xpath = By.xpath("//button[@class='ui-dialog-titlebar-close']");
	
	
	
	public PreVerificationPageFactoring(WebDriver driver) {
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
			.until(ExpectedConditions.visibilityOfElementLocated(PreVerificationPageFactoring_xpath));
		HeaderWebEelement.getText();
		Thread.sleep(2000);
    	}
    	catch(Exception e)
    	{
    		
    	}
    	return Header;

}
	public boolean VerifyProcessVerBTN() {
		try
    	{
    		WebElement ProcessVerBTNEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(preverificationBTN_xpath));
    		ProcessVerBTNEelement.isDisplayed();
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
    		WebElement EditInvoicesBTNEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(editIvnoicesBTN_xpath));
    		EditInvoicesBTNEelement.isDisplayed();
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
    		WebElement MarkIneligibleBTNEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(markinelgibleBTN_xpath));
    		MarkIneligibleBTNEelement.isDisplayed();
		return true;
    	}
    	catch(Exception e)
    	{
    	return false;	
    	}
	}
	public boolean CheckOnInvoiceCheckBox() {
		try
    	{
			Thread.sleep(1000);
    		WebElement InvoiceCheckBoxEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(invoicelistCheckbox_xpath));
    		
    		InvoiceCheckBoxEelement.click();
    //		InvoiceCheckBoxEelement.click();
    		//InvoiceCheckBoxEelement.click();
    		Thread.sleep(2000);
		return true;
    	}
    	catch(Exception e)
    	{
    	return false;	
    	}
	}
	public boolean ClickOnEditInvoicesBTN() {
		try
    	{
    		WebElement EditInvoicesBTNEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(editIvnoicesBTN_xpath));
    		EditInvoicesBTNEelement.click();
    		this.isAlertPresent();
    		EditInvoicesBTNEelement.click();
    		this.isAlertPresent();
            Thread.sleep(1000);
    	/*WebElement manualEntryHeader = new WebDriverWait(driver,100)
    				.until(ExpectedConditions.visibilityOfElementLocated(manualEntryPageHeader_xpath));
    		manualEntryHeader.isDisplayed();*/
		return true;
    	}
    	catch(Exception e)
    	{
    	return false;	
    	}
	}
	public boolean ClickOnProcessInvoiceBTN() {
		try
    	{
    		WebElement ProcessInvoiceBTNEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(processInvoicesBTN_xpath));
    		ProcessInvoiceBTNEelement.click();
    		this.isAlertPresent();
		return true;
    	}
    	catch(Exception e)
    	{
    	return false;	
    	}
		
	}
	public boolean ClickOnMarkInelgibleBTN() {
		try
    	{
    		WebElement MarkIneligibleBTNEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(markinelgibleBTN_xpath));
    		MarkIneligibleBTNEelement.click();
    		Thread.sleep(500);
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
			Thread.sleep(500);
    		WebElement CloseBTNEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(closeSuccessMSG_xpath));
    		CloseBTNEelement.click();
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
	public boolean VerifyEditSuccesssMSG() {
		try
    	{
    		WebElement SuccesssMSGEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(editsuccessMsg_xpath));
    		SuccesssMSGEelement.isDisplayed();
		return true;
    	}
    	catch(Exception e)
    	{
    	return false;	
    	}
	}
	public boolean ClickOnProcessVerificationBTN() throws InterruptedException {
		Thread.sleep(1000);
		try
    	{
    		WebElement ProcessVerBTNEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(preverificationBTN_xpath));
    		ProcessVerBTNEelement.click();
    		this.isAlertPresent();
    		Thread.sleep(2000);
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
    		WebElement SuccessMsgEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(successMsg_xpath));
    		SuccessMsgEelement.isDisplayed();
    		
		return true;
    	}
    	catch(Exception e)
    	{
    	return false;	
    	}
	}
	public boolean ClickOnVerificationNoLink() {
		try
    	{
    		WebElement VerificationNoLinkEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(verificationNoLink_xpath));
    		VerificationNoLinkEelement.click();
    		this.isAlertPresent();
		return true;
    	}
    	catch(Exception e)
    	{
    	return false;	
    	}
	}
	public boolean VerifyHeaderOfVeriBatchDetailPopup() {
		try
    	{
    		WebElement VeriBatchDetailEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(veribatchdetailpoupheader_xpath));
    		VeriBatchDetailEelement.isDisplayed();
    		
		return true;
    	}
    	catch(Exception e)
    	{
    	return false;	
    	}
	}
	public boolean ClickOnAddBTN() {
		try
    	{
    		WebElement PlusBTNEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(plusBTN_xpath));
    		PlusBTNEelement.click();
    		
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
				if (ele.getText().equals(verificationmode)) {
					ele.click();
					//Thread.sleep(500);
					break;
				}
			
			}return true;}
		
		catch(Exception e)
		{
			return false;
		}
	}
	public boolean ClickOnVerifyBTN() {
		try
    	{
    		WebElement VerifyBTNEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(verifyBTN_xpath));
    		VerifyBTNEelement.click();
    		this.isAlertPresent();
    		Thread.sleep(4000);
    		Set<String> WHs = driver.getWindowHandles();
		      Iterator<String> it = WHs.iterator();
				//iterate through your windows
				while (it.hasNext()){
				String parent = it.next();
				String newwin = it.next();
				driver.switchTo().window(newwin);
				}
		return true;
    	}
    	catch(Exception e)
    	{
    	return false;	
    	}
	}
	private final By TermsDropdown_xpath = By.xpath("//select[@id='all_payment_term']//option");
	
	public boolean SelectPaymentTerms(String paymentterms) {
		try
		{
			Thread.sleep(2000);
			
			WebElement PaymentTermsWebElement = new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(paymentTermsDropdown_xpath));
			PaymentTermsWebElement.click();
			Thread.sleep(1000);
			
			WebElement TermsWebElement = new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(TermsDropdown_xpath));
			
			
			Select sel = new Select(PaymentTermsWebElement);
			//sel.selectByVisibleText(paymentterms);
			sel.selectByValue("20");
			//sel.selectByIndex(1);
			Actions builder = new Actions(driver);        
			builder.sendKeys(Keys.ENTER);
			List<WebElement> list = sel.getOptions();
			
			for(int i=0;i<list.size();i++){
			    System.out.println(list.get(i));
			} 
			
			
			for (WebElement ele : list) {
				if (ele.getText().contains(paymentterms)) {
					ele.click();
					////Thread.sleep(5000);
					break;
				}
				}return true;}
		
		catch(Exception e)
		{
			return false;
		}
	}
	public boolean addValueToCommentTextBox(String debtorcomment) {
		try
		{
			WebElement CommentTextBoxWebElement = new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(debtorCommentTB_xpath));
			CommentTextBoxWebElement.clear();
			CommentTextBoxWebElement.sendKeys(debtorcomment);
			
			return true;}
		
		catch(Exception e)
		{
			return false;
		}
	}
	public boolean addValueToAddCommentTextBox(String addComment) {
		try
		{
			WebElement AddCommentTextBoxWebElement = new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(additionalCommetTB_xpath));
			AddCommentTextBoxWebElement.clear();
			AddCommentTextBoxWebElement.sendKeys(addComment);
			
			return true;}
		
		catch(Exception e)
		{
			return false;
		}
	}
	public boolean addValueToSignTB(String sign) {
		try
		{
			WebElement SignTBWebElement = new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(signTB_xpath));
			SignTBWebElement.clear();
			SignTBWebElement.sendKeys(sign);
			
			return true;}
		
		catch(Exception e)
		{
			return false;
		}
	}
	public boolean CheckOnAgreeCB() {
		try
    	{
    		WebElement AgreeCBEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(agreeCheckbox_xpath));
    		AgreeCBEelement.click();
    		Thread.sleep(4000);
		return true;
    	}
    	catch(Exception e)
    	{
    	return false;	
    	}
	}
	public boolean ClickOnSubmitBTN() {
		try
    	{
    		WebElement SubmitBTNEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(submitBTN_xpath));
    		SubmitBTNEelement.click();
    		
		return true;
    	}
    	catch(Exception e)
    	{
    	return false;	
    	}
}
	public boolean VerifySuccessMsgOfVerify() {
		try
    	{
    		WebElement SuccessMsgOfVerifyEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(thankyouMsg_xpath));
    		SuccessMsgOfVerifyEelement.isDisplayed();
    		Set<String> WHs = driver.getWindowHandles();
		      Iterator<String> it = WHs.iterator();
				//iterate through your windows
				while (it.hasNext()){
				String parent = it.next();
				String newwin = it.next();
				//driver.close();
				driver.switchTo().window(parent);
				}

    		
		return true;
    	}
    	catch(Exception e)
    	{
    	return false;	
    	}
	}
	public boolean CloseVerificationpopup() {
		try
    	{
    		WebElement VerificationpopupEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(closeVerificationpoup_xpath));
    		VerificationpopupEelement.click();
    		Thread.sleep(500);
    		
		return true;
    	}
    	catch(Exception e)
    	{
    	return false;	
    	}
	}}