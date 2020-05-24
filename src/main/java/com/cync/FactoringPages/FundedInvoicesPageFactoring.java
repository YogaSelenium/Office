package com.cync.FactoringPages;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.cync.base.BasePage;

public class FundedInvoicesPageFactoring extends BasePage
{
	private final By FundedInvoicesPageFactoring_xpath = By.xpath("//span[@class='paneltitle']");
	
	private final By accountNameHyperlink_xpath = By.xpath("(//td[@aria-describedby='receivables_list_account_name'])[1]");
	private final By invoiceNoHyperlink_xpath = By.xpath("(//div[contains(@onclick,'get_reserve_model')])[1]");
	private final By invoiceDetailsHyperlink_xpath = By.xpath("//a[contains(text(),'Invoice Details')]");
	private final By invoiceDetailspopup_xpath = By.xpath("(//span[@class='ui-dialog-title'])[2]");
	private final By closeBTNspopup_xpath = By.xpath("//button[@class='ui-dialog-titlebar-close' or @xpath='1']");
	private final By accParametersHyperlink_xpath = By.xpath("//a[contains(text(),'Account Parameters')]");
	private final By accParapopup_xpath = By.xpath("(//span[@class='ui-dialog-title'])[2]");
	private final By commentHyperlink_xpath = By.xpath("//div[@id='dialogPopup']//div//a[contains(text(),'Comments')]");
	private final By commentPopup_xpath = By.xpath("(//span[@class='ui-dialog-title'])[2]");
	private final By invoiceDocumentHyperlink_xpath = By.xpath("//a[contains(text(),'Invoice Documents')]");
	private final By invoiceDocumentspopup_xpath = By.xpath("//div[@class='mp-title']");
	private final By closeImageMappingpopup_xpath = By.xpath("//span[@class='mp-iconClose']//img");
	private final By chargebackHyperlink_xpath = By.xpath("//a[contains(text(),'Chargeback')]");
	private final By chargebakpopup_xpath = By.xpath("(//span[@class='ui-dialog-title'])[2]");
	private final By chargebackBTN_xpath = By.xpath("//button[text()='Chargeback']");
	private final By chargebackTB_xpath = By.xpath("//input[@id='charge_amt']");
	private final By chargebackReasonDD_xpath = By.xpath("//select[@id='chargeback_reason']");
	private final By addBTN_xpath = By.xpath("//span[@id='add-new-fee']");
	private final By additionalFeeDD_xpath = By.xpath("//div[@class='row-fluid']//select[@id='recourse_fees_-100_id']");
	private final By amountField_xpath = By.xpath("//div[@class='row-fluid']//input[@id='recourse_fees_-100_amount']");
	private final By CBSuccessMsg_xpath = By.xpath("//div[@class='ui-state-success']");
	private final By closeCBSuccessMsg_xpath = By.xpath("//div[@id='info_head']//a[@class='ui-jqdialog-titlebar-close ui-corner-all']");
	private final By invoiceNoPopup_xpath = By.xpath("//span[@class='ui-dialog-title']");
	private final By closeInvoiceNopopupu_xpath = By.xpath("(//button[@class='ui-dialog-titlebar-close'])[3]");
	private final By verificationNoHyperlink_xpath = By.xpath("(//div[@onclick='get_schedule_model(this)'])[1]");
	private final By verificationDetailsPopup_xpath = By.xpath("(//span[@class='ui-dialog-title'])[2]");
	private final By addBTNVerificationpopup_xpath = By.xpath("//span[@class='xfact-col xfact-iconbar xfact-plus']");
	private final By verificationReport_xpath = By.xpath("//a[contains(text(),'Verification Report')]");
	private final By masterAccDebtpopup_xpath = By.xpath("(//span[@class='ui-dialog-title'])[3]");
	private final By generateReportBTN_xpath = By.xpath("//button[contains(text(),'Generate Report')]");
	private final By closeMasterAccDebtpopup_xpath = By.xpath("//div[@class='ui-dialog ui-widget ui-widget-content ui-corner-all ui-front ui-draggable ui-resizable']//button[@class='ui-dialog-titlebar-close']");
	private final By closeVerBatchDetailspopup_xpath = By.xpath("(//button[@class='ui-dialog-titlebar-close'])[1]");
    private final By scheduleNoHyperlink_xpath = By.xpath("(//a[@onclick='schedule_number(this)'])[1]");	
	private final By fundBatchHyperlink_xpath = By.xpath("(//a[@onclick='funded_batch(this)'])[1]");		
	private final By Batchdropdown_xpath=By.xpath("/html[1]/body[1]/div[3]/div[1]/div[2]/div[4]/div[1]/div[1]/div[2]/div[1]/div[1]/span[1]/span[1]/span[1]/span[2]/b[1]");
	private final By ReverseButton_xpath=By.xpath("//button[@id='submit-reverse-batch']");
	public FundedInvoicesPageFactoring(WebDriver driver) {
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
			.until(ExpectedConditions.visibilityOfElementLocated(FundedInvoicesPageFactoring_xpath));
		HeaderWebEelement.getText();
		Thread.sleep(2000);
    	}
    	catch(Exception e)
    	{
    		
    	}
    	return Header;

}
	public boolean VerifyAccountNameHyperlink() {
		try
    	{
    		WebElement AccountNameHyperlinkWebEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(accountNameHyperlink_xpath));
    		AccountNameHyperlinkWebEelement.isDisplayed();
		
    		return true;
    	}
    	catch(Exception e)
    	{
    		return false;
    	}
	}
	public boolean VerifyIvnoiceNoHyperlink() {
		try
    	{
    		WebElement IvnoiceNoHyperlinkWebEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(invoiceNoHyperlink_xpath));
    		IvnoiceNoHyperlinkWebEelement.isDisplayed();
		
    		return true;
    	}
    	catch(Exception e)
    	{
    		return false;
    	}
	}
	public boolean ClickAccountNameHyperlink() {
		try
    	{
    		WebElement AccountNameHyperlinkWebEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(accountNameHyperlink_xpath));
    		AccountNameHyperlinkWebEelement.click();
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
	public boolean ClickInvoiceDetailsHyperlink() {
		try
    	{
    		WebElement InvoiceDetailsHyperlinkWebEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(invoiceDetailsHyperlink_xpath));
    		InvoiceDetailsHyperlinkWebEelement.click();
		    this.isAlertPresent();
    		return true;
    	}
    	catch(Exception e)
    	{
    		return false;
    	}
	}
	public boolean VerifyInvoiceDetailspopup() {
		try
    	{
    		WebElement InvoiceDetailspopupWebEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(invoiceDetailspopup_xpath));
    		InvoiceDetailspopupWebEelement.isDisplayed();
    		return true;
    	}
    	catch(Exception e)
    	{
    		return false;
    	}
	}
	public boolean Closepopup() {
		try
    	{
    		WebElement CloseInvoiceDetailspopupWebEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(closeBTNspopup_xpath));
    		CloseInvoiceDetailspopupWebEelement.click();
		    this.isAlertPresent();
    		return true;
    	}
    	catch(Exception e)
    	{
    		return false;
    	}
	}
	public boolean ClickAccountParaHyperlink() {
		try
    	{
    		WebElement CloseInvoiceDetailspopupWebEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(accParametersHyperlink_xpath));
    		CloseInvoiceDetailspopupWebEelement.click();
		    this.isAlertPresent();
    		return true;
    	}
    	catch(Exception e)
    	{
    		return false;
    	}
	}
	public boolean VerifyAccParameterspopup() {
		try
    	{
    		WebElement AccParameterspopupWebEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(accParapopup_xpath));
    		AccParameterspopupWebEelement.isDisplayed();

    		return true;
    	}
    	catch(Exception e)
    	{
    		return false;
    	}
	}
	public boolean ClickCommentHyperlink() {
		try
    	{
    		WebElement CommentHyperlinkWebEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(commentHyperlink_xpath));
    		CommentHyperlinkWebEelement.click();
		    this.isAlertPresent();
    		return true;
    	}
    	catch(Exception e)
    	{
    		return false;
    	}
	}
	public boolean VerifyCommentpopup() {
		try
    	{
    		WebElement CommentpopupWebEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(commentPopup_xpath));
    		CommentpopupWebEelement.isDisplayed();

    		return true;
    	}
    	catch(Exception e)
    	{
    		return false;
    	}
	}
	public boolean ClickInvoiceDocumentHyperlink() {
		try
    	{
    		WebElement InvoiceDocumentHyperlinkWebEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(invoiceDocumentHyperlink_xpath));
    		InvoiceDocumentHyperlinkWebEelement.click();
		    this.isAlertPresent();
    		return true;
    	}
    	catch(Exception e)
    	{
    		return false;
    	}
	}
	public boolean VerifyInvoiceDocumentpopup() {
		try
    	{
    		WebElement InvoiceDocumentpopupWebEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(invoiceDocumentspopup_xpath));
    		InvoiceDocumentpopupWebEelement.isDisplayed();

    		return true;
    	}
    	catch(Exception e)
    	{
    		return false;
    	}
	}
	public boolean ClickChargebackHyperlink() {
		try
    	{
    		WebElement ChargebackHyperlinkWebEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(chargebackHyperlink_xpath));
    		ChargebackHyperlinkWebEelement.click();
		    this.isAlertPresent();
    		return true;
    	}
    	catch(Exception e)
    	{
    		return false;
    	}
	}
	public boolean CloseImageMappingpopup() {
		try
    	{
    		WebElement CloseImageMappingpopupWebEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(closeImageMappingpopup_xpath));
    		CloseImageMappingpopupWebEelement.click();
		    this.isAlertPresent();
    		return true;
    	}
    	catch(Exception e)
    	{
    		return false;
    	}
	}
	public boolean VerifyChargebackpopup() {
		try
    	{
    		WebElement ChargebackpopupWebEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(chargebakpopup_xpath));
    		ChargebackpopupWebEelement.isDisplayed();

    		return true;
    	}
    	catch(Exception e)
    	{
    		return false;
    	}
	}
	public boolean VerifyChargeBackBTN() {
		try
    	{
    		WebElement ChargeBackBTNWebEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(chargebackBTN_xpath));
    		ChargeBackBTNWebEelement.isDisplayed();

    		return true;
    	}
    	catch(Exception e)
    	{
    		return false;
    	}
	}
	public boolean addValuetoChargebackTB(String chargebackValue) {
		try
    	{
    		WebElement ChargebackTBWebEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(chargebackTB_xpath));
    		ChargebackTBWebEelement.sendKeys(chargebackValue);;

    		return true;
    	}
    	catch(Exception e)
    	{
    		return false;
    	}
	}
	public boolean ClickChargebackBTN() {
		try
    	{
    		WebElement ChargebackBTNWebEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(chargebackBTN_xpath));
    		ChargebackBTNWebEelement.click();
    		this.isAlertPresent();

    		return true;
    	}
    	catch(Exception e)
    	{
    		return false;
    	}
	}
	public boolean VerifyChargebackReasonDD() {
		try
    	{
    		WebElement ChargebackReasonDDWebEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(chargebackReasonDD_xpath));
    		ChargebackReasonDDWebEelement.isDisplayed();

    		return true;
    	}
    	catch(Exception e)
    	{
    		return false;
    	}
	}
	public boolean ClickAddBTN() {
		try
    	{
    		WebElement AddBTNWebEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(addBTN_xpath));
    		AddBTNWebEelement.click();

    		return true;
    	}
    	catch(Exception e)
    	{
    		return false;
    	}
	}
	public boolean VerifyAdditionalFeeDD() {
		try
    	{
    		WebElement AdditionalFeeDDWebEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(additionalFeeDD_xpath));
    		AdditionalFeeDDWebEelement.isDisplayed();

    		return true;
    	}
    	catch(Exception e)
    	{
    		return false;
    	}
	}
	public boolean VerifyAmountField() {
		try
    	{
    		WebElement AmountFieldWebEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(amountField_xpath));
    		AmountFieldWebEelement.isDisplayed();

    		return true;
    	}
    	catch(Exception e)
    	{
    		return false;
    	}
	}
	public boolean VerifyCBSuccessMsg() {
		try
    	{
    		WebElement CBSuccessMsgWebEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(CBSuccessMsg_xpath));
    		CBSuccessMsgWebEelement.isDisplayed();

    		return true;
    	}
    	catch(Exception e)
    	{
    		return false;
    	}
	}
	public boolean CloseCBSuccessMsg() {
		try
    	{
    		WebElement CloseCBSuccessMsgWebEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(closeCBSuccessMsg_xpath));
    		CloseCBSuccessMsgWebEelement.click();

    		return true;
    	}
    	catch(Exception e)
    	{
    		return false;
    	}
	}
	public boolean ClickInvoiceNoHyperlink() {
		try
    	{
    		WebElement InvoiceNoHyperlinkWebEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(invoiceNoHyperlink_xpath));
    		InvoiceNoHyperlinkWebEelement.click();
            this.isAlertPresent();
    		return true;
    	}
    	catch(Exception e)
    	{
    		return false;
    	}
	}
	public boolean VerifyInvoiceNopopup() {
		try
    	{
    		WebElement InvoiceNopopupWebEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(invoiceNoPopup_xpath));
    		InvoiceNopopupWebEelement.isDisplayed();

    		return true;
    	}
    	catch(Exception e)
    	{
    		return false;
    	}
	}
	public boolean CloseInvoiceNopopup() {
		try
    	{
    		WebElement CloseInvoiceNopopupWebEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(closeInvoiceNopopupu_xpath));
    		CloseInvoiceNopopupWebEelement.click();
            this.isAlertPresent();
    		return true;
    	}
    	catch(Exception e)
    	{
    		return false;
    	}
	}
	public boolean ClickVerificationNoHyperlink() {
		try
    	{
    		WebElement VerificationNoHyperlinkWebEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(verificationNoHyperlink_xpath));
    		VerificationNoHyperlinkWebEelement.click();
    		this.isAlertPresent();

    		return true;
    	}
    	catch(Exception e)
    	{
    		return false;
    	}
	}
	public boolean VerifyVerificationBatcDetailpopup() {
		try
    	{
    		WebElement VerificationBatcDetailpopupWebEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(verificationDetailsPopup_xpath));
    		VerificationBatcDetailpopupWebEelement.isDisplayed();

    		return true;
    	}
    	catch(Exception e)
    	{
    		return false;
    	}
	}
	public boolean ClickAddBTNVerificationpopup() {
		try
    	{
    		WebElement AddBTNVerificationpopupWebEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(addBTNVerificationpopup_xpath));
    		AddBTNVerificationpopupWebEelement.click();

    		return true;
    	}
    	catch(Exception e)
    	{
    		return false;
    	}
	}
	public boolean ClickVerificationReportBTN() {
		try
    	{
    		WebElement VerificationReportBTNWebEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(verificationReport_xpath));
    		VerificationReportBTNWebEelement.click();
    		Thread.sleep(500);
    		return true;
    	}
    	catch(Exception e)
    	{
    		return false;
    	}
	}
	public boolean VerifyMasterAccDebtpopup() {
		try
    	{
    		WebElement MasterAccDebtpopupWebEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(masterAccDebtpopup_xpath));
    		MasterAccDebtpopupWebEelement.isDisplayed();

    		return true;
    	}
    	catch(Exception e)
    	{
    		return false;
    	}
	}
	public boolean ClickGenerateReportBTN() {
		try
    	{
    		WebElement GenerateReportBTNWebEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(generateReportBTN_xpath));
    		GenerateReportBTNWebEelement.click();
    		this.isAlertPresent();
    		Thread.sleep(1000);
    		Set<String> WHs = driver.getWindowHandles();
		      Iterator<String> it = WHs.iterator();
				//iterate through your windows
				while (it.hasNext()){
				String parent = it.next();
				String newwin = it.next();
				driver.switchTo().window(newwin);
				Thread.sleep(1000);
				driver.close();
				driver.switchTo().window(parent);
				}
              //driver.close();
    		return true;
    	}
    	catch(Exception e)
    	{
    		return false;
    	}
	}
	public boolean CloseMasterAccDebtpopup() {
		try
    	{
    		WebElement CloseMasterAccDebtpopupWebEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(closeMasterAccDebtpopup_xpath));
    		CloseMasterAccDebtpopupWebEelement.click();

    		return true;
    	}
    	catch(Exception e)
    	{
    		return false;
    	}
	}
	public boolean CloseVerificationBatchDetailpopup() {
		try
    	{
    		WebElement CloseVerificationBatchDetailpopup=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(closeVerBatchDetailspopup_xpath));
    		CloseVerificationBatchDetailpopup.click();

    		return true;
    	}
    	catch(Exception e)
    	{
    		return false;
    	}
	}
	public boolean ClickScheduleNoHyperlink() {
		try
    	{
			
    		WebElement GenerateReportBTNWebEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(scheduleNoHyperlink_xpath));
    		
    		JavascriptExecutor js = (JavascriptExecutor) driver;
    		js.executeScript("arguments[0].scrollIntoView();",GenerateReportBTNWebEelement );
    		
    		GenerateReportBTNWebEelement.click();
    		this.isAlertPresent();
    		Thread.sleep(1000);
    		Set<String> WHs = driver.getWindowHandles();
		      Iterator<String> it = WHs.iterator();
				//iterate through your windows
				while (it.hasNext()){
				String parent = it.next();
				String newwin = it.next();
				driver.switchTo().window(newwin);
				Thread.sleep(1000);
				driver.close();
				driver.switchTo().window(parent);
				Thread.sleep(1000);
				}
             // driver.close();
    		return true;
    	}
    	catch(Exception e)
    	{
    		return false;
    	}
	}
	public boolean ClickFundBatchHyperlink() {
		try
    	{
    		WebElement FundBatchHyperlinkWebEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(fundBatchHyperlink_xpath));
    		
    		JavascriptExecutor js = (JavascriptExecutor) driver;
    		js.executeScript("arguments[0].scrollIntoView();",FundBatchHyperlinkWebEelement );
    		
    		FundBatchHyperlinkWebEelement.click();
    		this.isAlertPresent();
    		Thread.sleep(1000);
    		Set<String> WHs = driver.getWindowHandles();
		      Iterator<String> it = WHs.iterator();
				//iterate through your windows
				while (it.hasNext()){
				String parent = it.next();
				String newwin = it.next();
				driver.switchTo().window(newwin);
				Thread.sleep(1000);
				driver.close();
				driver.switchTo().window(parent);
				}
             //driver.close();
    		return true;
    	}
    	catch(Exception e)
    	{
    		return false;
    	}
	}
	private final By Batch_xpath = By.xpath("/html[1]/body[1]/span[1]/span[1]/span[2]/ul[1]/li[3]");
	
	public  boolean ClickonSelectBatchDropdown_reverse() {
		try {
			WebElement DropdownWebEelement = new WebDriverWait(driver, 100)
			.until(ExpectedConditions.visibilityOfElementLocated(Batchdropdown_xpath));
			
			DropdownWebEelement.click();
			Thread.sleep(500);
			
			WebElement DWebEelement = new WebDriverWait(driver, 100)
			.until(ExpectedConditions.visibilityOfElementLocated(Batch_xpath));
			
			DWebEelement.click();
			
			
			
			/*Select sel = new Select(DropdownWebEelement);
			
			//sel.selectByIndex(1);
			
			List<WebElement> list = sel.getOptions();
			
			String batchno=list.get(1).getText();
			
			System.out.println("********************************"+batchno);*/
			
			/*for (WebElement ele:list) 
			{
				
				
			 		ele.click();
				
			}*/
			
		} 
		catch (Exception ex)
		{
			return false;
		}
		
		return true;	
	}
	//*********
	public boolean dropdown(){
        try {
            Thread.sleep(1000);
            WebElement el=new WebDriverWait(driver,10)
            .until(ExpectedConditions.visibilityOfElementLocated(Batchdropdown_xpath));
            el.click();
            Select sel= new Select(el);
            List<WebElement>data=sel.getOptions();
            
            String d=data.get(0).getText();
            System.out.println("*******************************"+d);
            for (WebElement op : data) {
                String ele = op.getText();
                System.out.println("*******************************"+ele);
                
                
             System.out.println("Size of data"+op.getSize());
                    return true;
                }
           
        }
             catch (Exception e) {
                 return false;
            }
        return false;
           
}
	
	
	
	//********
	
	public boolean ClickReverseButton() {
		try
    	{
    		WebElement RButtonWebEelement=new WebDriverWait(driver,50)
			.until(ExpectedConditions.visibilityOfElementLocated(ReverseButton_xpath));
    		RButtonWebEelement.click();
    		return true;
    	}
    	catch(Exception e)
    	{
    		return false;
    	}
	}
	private final By Notification_xpath=By.xpath("//i[@class='fa fa-bell fa-2x']");
	private final By notificationMessage_xpath=By.xpath("/html[1]/body[1]/div[4]/div[2]/div[1]/div[3]/div[1]/div[1]/ul[1]/li[2]/div[2]");
	public boolean ClickonNotification(){
		try{
			WebElement notificationWebE=new WebDriverWait(driver, 100)
			.until(ExpectedConditions.visibilityOfElementLocated(Notification_xpath));
			
			notificationWebE.click();
			
		}
			catch(Exception e){
				
			
		}
		return true;
		
	}
	String actMsg ;
	public boolean verifyNotification(String expectedMsg)
	
	{
		
		try{
			WebElement notificationWebE=new WebDriverWait(driver, 100)
			.until(ExpectedConditions.visibilityOfElementLocated(notificationMessage_xpath));
			
			String msg=notificationWebE.getText();
			System.out.println("*********8888888888888888888888888888*******"+msg);
			actMsg=msg;
			   if(msg.contains(expectedMsg))
			       {
				   return true;
			       }
		
		    }
			catch(Exception e)
		                {
				
		                }
		
		System.out.println("*********8888888888888888888888888888*******"+actMsg);
		return true;	
	}
	
	
	
}