package com.cync.CashAppPages;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.cync.base.BasePage;

public class DailyCashTransactionReportingPage extends BasePage {
	
	private final By DailyCashTransactionPageHeader_xpath = By.xpath("//span[contains(text(),'Daily Cash Transaction Reporting')]");
	private final By clientName_xpath = By.id("client_id");
	private final By TransactionTypes_xpath = By.id("transaction_type");
	private final By SelectFromDate_xpath = By.id("from_date");
	private final By SelectToDate_xpath = By.id("to_date");
	private final By generateBtnClick_xpath = By.id("generate_report");
	private final By CheckhyperLink_xpath = By.xpath("//label[text()='Check']");
	private final By ClientName_xpath = By.xpath("//div[text()='Client Name']");
	private final By BatchDate_xpath = By.xpath("//div[text()='Batch Date']");
	private final By AppliedAmount_xpath = By.xpath("//div[text()='Applied Amount']");
	private final By plus_xpath = By.xpath("(//span[@class='ui-icon ui-icon-plus'])[1]");
	private final By plusAccountName_xpath = By.xpath("(//td[@style='text-align:left;'])[1]");
	private final By plusBatchNum_xpath = By.xpath("(//td[@style='text-align:left;'])[2]");
	private final By plusCheckNum_xpath = By.xpath("(//td[@style='text-align:left;'])[3]");
	private final By plusCheckImg_xpath = By.xpath("(//span[text()='Check Images'])[1]");
	private final By plusCheckImgLink_xpath = By.xpath("//div[@id='gridholderBox']//tr[@class='row-odd'][1]//a[1]");

	
	private final By plusAppliedAmount_xpath = By.xpath("(//td[@style='text-align:right;'])[2]");
	private final By CheckImagePopup_xpath = By.xpath("//div[@id='gridholderBox']//table//tbody//tr//th");
	private final By CheckImagePopUpClose_xpath = By.xpath("//div//button[@class='ui-dialog-titlebar-close']");
	private final By plusAccountNameClick_xpath = By.xpath("(//td[@style='text-align:left;'])[1]//span");
	private final By InvoiceDetailsPopup_xpath = By.xpath("//span[text()='Invoice Details']");
	private final By InvoiceDetailsPopupClose_xpath = By.xpath("//button[@class='ui-dialog-titlebar-close']");
	private final By CheckImagePopUpImageClick_xpath = By.xpath("(//a[@target='_blank'])[6]");
	private final By AppliedAmtInvoiceDetailPopUp_xpath = By.xpath("(//td[contains(@aria-describedby,'current_amount')])[1]");
	private final By CheckAmnt_xpath = By.xpath("//span[@class='number-Daily']");

	
	
	
	
	public DailyCashTransactionReportingPage (WebDriver driver) {
		super(driver);
		try{
			/*if(!driver.findElement(DailyCashTransactionReportingPageHeader_xpath).getText().trim().contains("Daily Cash Transaction Reporting")){
				throw new SkipException(" Daily Cash Transaction Reporting page couldn't open.");
			
			} */
			}
		catch(Exception e){
			
		// TODO Auto-generated constructor stub
			e.printStackTrace();
	}
		
		// TODO Auto-generated constructor stub

}
	
	 public String PageHeaderVerify(String Header)
		{
		try{
			WebElement HeaderWebEelement=new WebDriverWait(driver,100)
				.until(ExpectedConditions.visibilityOfElementLocated(DailyCashTransactionPageHeader_xpath));
			HeaderWebEelement.getText();
			Thread.sleep(2000);
			
		}
		catch(Exception ex){
			
		}
		return Header;
		
		} 		
	
	 
	public boolean selectValueInClientsDropdown(String Clientname) throws InterruptedException{
			
		try {
			WebElement clientDropdownWebEelement = new WebDriverWait(
					driver, 10).until(ExpectedConditions
					.visibilityOfElementLocated(clientName_xpath));
			Select sel = new Select(clientDropdownWebEelement);
			List<WebElement> list = sel.getOptions();
			for (WebElement ele : list) {
				if (ele.getText().equals(Clientname)) {
			 		ele.click();
					Thread.sleep(5000);
					 return true;
				}
			}
		} catch (Exception ex) {
		}
		return false;
	}
	 
	
	public boolean selectValueTransactionTypeDropdown(String TransactionType) throws InterruptedException{
		
		try {
			WebElement transactiontypeDropdownWebEelement = new WebDriverWait(
					driver, 10).until(ExpectedConditions
					.visibilityOfElementLocated(TransactionTypes_xpath));
			Select sel = new Select(transactiontypeDropdownWebEelement);
			List<WebElement> list = sel.getOptions();
			for (WebElement ele : list) {
				if (ele.getText().equals(TransactionType)) {
			 		ele.click();
					Thread.sleep(5000);
					 return true;
				}
			}
		} catch (Exception ex) {
		}
		return false;
	}
	 
	/*public boolean selectSystemDate_From(){
		try {
			WebElement batchDateWebElement=new WebDriverWait(driver,100)
		 	.until(ExpectedConditions.visibilityOfElementLocated(SelectFromDate_xpath));
			batchDateWebElement.clear();
			batchDateWebElement.sendKeys("05/01/2018");
		 	Thread.sleep(5000);
		return true;
		} catch (Exception e) {
		return false;
		}
	
	}*/
	
	public boolean selectSystemDate_From(){
		try {
		WebElement batchDateWebElement = new WebDriverWait(driver,
		100)
		.until(ExpectedConditions
		.visibilityOfElementLocated(SelectFromDate_xpath));
		Date date = new Date(System.currentTimeMillis());
		SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
		String today=formatter.format(date);

		batchDateWebElement.sendKeys(today);


		return true;
		} catch (Exception e) {
		return false;
		}
		}
	
	
	
	public boolean selectSystemDate_To(){
		try {
		WebElement batchDateWebElement = new WebDriverWait(driver,
		100)
		.until(ExpectedConditions
		.visibilityOfElementLocated(SelectToDate_xpath));
		Date date = new Date(System.currentTimeMillis());
		SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
		String today=formatter.format(date);

		batchDateWebElement.sendKeys(today);


		return true;
		} catch (Exception e) {
		return false;
		}
		}	

	 public boolean CheckOnGenerateBtn_DailyCashTransaction()
	 {
	 try{

	 	WebElement generateBtnWebEelement=new WebDriverWait(driver,100)
	 	.until(ExpectedConditions.visibilityOfElementLocated(generateBtnClick_xpath));
	 	generateBtnWebEelement.click();
	 	Thread.sleep(5000);

	 return true;
	 }
	 catch(Exception ex){
	 	return false;
	 }

	 }
	 
	 public boolean CheckAmtDisplay_DailyCashTransaction(String amt)
	 {
	 try{

	 	WebElement CheckAmntDisplayed_DailyCashTransaction=new WebDriverWait(driver,100)
	 	.until(ExpectedConditions.visibilityOfElementLocated(CheckAmnt_xpath));
	 	String actual = CheckAmntDisplayed_DailyCashTransaction.getText();
		if (actual.equals(amt))
			return true;
		else
			return false;

	} catch (Exception e) {
		return false;
	}
}
	
	 
	 
	
	 public boolean CheckLink_DailyCashTransaction()
	 {
	 try{

	 	WebElement checkLinkWebEelement=new WebDriverWait(driver,100)
	 	.until(ExpectedConditions.visibilityOfElementLocated(CheckhyperLink_xpath));
	 		checkLinkWebEelement.click();
	 		Thread.sleep(2000);

	 return true;
	 }
	 catch(Exception ex){
	 	return false;
	 }

	 }
	 
	 public boolean ClientName_DailyCashTransaction()
	 {
	 try{

	 	WebElement clientNameWebEelement=new WebDriverWait(driver,100)
	 	.until(ExpectedConditions.visibilityOfElementLocated(ClientName_xpath));
	 	clientNameWebEelement.isDisplayed();
	 return true;
	 }
	 catch(Exception ex){
	 	return false;
	 }

	 }
	 
	 public boolean BatchDate_DailyCashTransaction()
	 {
	 try{

	 	WebElement batchDateWebEelement=new WebDriverWait(driver,100)
	 	.until(ExpectedConditions.visibilityOfElementLocated(BatchDate_xpath));
	 	batchDateWebEelement.isDisplayed();
	 return true;
	 }
	 catch(Exception ex){
	 	return false;
	 }

	 }
	 
	 public boolean AppliedAmount_DailyCashTransaction()
	 {
	 try{

	 	WebElement appliedAmountWebEelement=new WebDriverWait(driver,100)
	 	.until(ExpectedConditions.visibilityOfElementLocated(AppliedAmount_xpath));
	 	appliedAmountWebEelement.isDisplayed();
	 return true;
	 }
	 catch(Exception ex){
	 	return false;
	 }

	 }
	 
	 
	 public boolean plusBtn_DailyCashTransaction()
	 {
	 try{

	 	WebElement plusBtnWebEelement=new WebDriverWait(driver,100)
	 	.until(ExpectedConditions.visibilityOfElementLocated(plus_xpath));
	 	plusBtnWebEelement.isDisplayed();
	 	plusBtnWebEelement.click();
	 return true;
	 }
	 catch(Exception ex){
	 	return false;
	 }

	 }
	 
	 public boolean plusBtnAccountName_DailyCashTransaction()
	 {
	 try{

	 	WebElement appliedAmountWebEelement=new WebDriverWait(driver,100)
	 	.until(ExpectedConditions.visibilityOfElementLocated(plusAccountName_xpath));
	 	appliedAmountWebEelement.isDisplayed();
	 return true;
	 }
	 catch(Exception ex){
	 	return false;
	 }

	 }
	 
	 public boolean plusBtnBatchNum_DailyCashTransaction()
	 {
	 try{

	 	WebElement appliedAmountWebEelement=new WebDriverWait(driver,100)
	 	.until(ExpectedConditions.visibilityOfElementLocated(plusBatchNum_xpath));
	 	appliedAmountWebEelement.isDisplayed();
	 return true;
	 }
	 catch(Exception ex){
	 	return false;
	 }

	 }
	
	 public boolean plusBtnCheckNum_DailyCashTransaction()
	 {
	 try{

	 	WebElement appliedAmountWebEelement=new WebDriverWait(driver,100)
	 	.until(ExpectedConditions.visibilityOfElementLocated(plusCheckNum_xpath));
	 	appliedAmountWebEelement.isDisplayed();
	 return true;
	 }
	 catch(Exception ex){
	 	return false;
	 }

	 }
	 
	 public boolean plusBtnAppliedAmount_DailyCashTransaction(String ApAmt)
	 {
	 try{

	 	WebElement appliedAmountWebEelement=new WebDriverWait(driver,100)
	 	.until(ExpectedConditions.visibilityOfElementLocated(plusAppliedAmount_xpath));
	 	String actual = appliedAmountWebEelement.getText().trim();
		actual.equals(ApAmt);
			return true;
		

	} catch (Exception e) {
		return false;
	}
}
	 public boolean plusBtnCheckImg_DailyCashTransaction()
	 {
	 try{

	 	WebElement appliedAmountWebEelement=new WebDriverWait(driver,100)
	 	.until(ExpectedConditions.visibilityOfElementLocated(plusCheckImg_xpath));
	 	appliedAmountWebEelement.isDisplayed();
	 return true;
	 }
	 catch(Exception ex){
	 	return false;
	 }

	 }
	 
	 
	 public boolean plusBtnCheckImgClick_DailyCashTransaction()
	 {
	 try{

	 	WebElement appliedAmountWebEelement=new WebDriverWait(driver,100)
	 	.until(ExpectedConditions.visibilityOfElementLocated(plusCheckImg_xpath));
	 	appliedAmountWebEelement.click();
	 	Thread.sleep(5000);
	 return true;
	 }
	 catch(Exception ex){
	 	return false;
	 }

	 }
	 
	 public boolean plusBtnCheckImgLink_DailyCashTransaction()
	 {
	 try{

	 	WebElement appliedAmountWebEelement=new WebDriverWait(driver,100)
	 	.until(ExpectedConditions.visibilityOfElementLocated(plusCheckImgLink_xpath));
	 	appliedAmountWebEelement.isDisplayed();
	 	Thread.sleep(3000);
	 return true;
	 }
	 catch(Exception ex){
	 	return false;
	 }

	 }
	 
	 
		
		public boolean InvoiceDetailPopUp_AppliedAmt(String AppAmt)
		 {
		 try{

		 	WebElement AppliedAmtWebEelement=new WebDriverWait(driver,100)
		 	.until(ExpectedConditions.visibilityOfElementLocated(AppliedAmtInvoiceDetailPopUp_xpath));
		 	String actual = AppliedAmtWebEelement.getText().trim();
			actual.equals(AppAmt);
				return true;
			

		} catch (Exception e) {
			return false;
		}
	}
		 
		
		public boolean CheckImagePopUp_DailyCashTransaction(String ChkImgHead)
		 {
		 try{

		 	WebElement CheckImgWebEelement=new WebDriverWait(driver,100)
		 	.until(ExpectedConditions.visibilityOfElementLocated(CheckImagePopup_xpath));
		 	String actual = CheckImgWebEelement.getText().trim();
			actual.equals(ChkImgHead);
				return true;
			

		} catch (Exception e) {
			return false;
		}
	}
		 
		
		public boolean CheckImagePopImageLinkClick_DailyCashTransaction()
		 {
		 try{

		 	WebElement CheckImgWebEelement=new WebDriverWait(driver,100)
		 	.until(ExpectedConditions.visibilityOfElementLocated(CheckImagePopUpImageClick_xpath));
		 	CheckImgWebEelement.click();
		 	Thread.sleep(10000);
		 	
		 return true;
		 }
		 catch(Exception ex){
		 	return false;
		 }

		 }
		
		public boolean CheckImagePopUpClose_DailyCashTransaction()
		 {
		 try{

		 	WebElement CheckImgWebEelement=new WebDriverWait(driver,100)
		 	.until(ExpectedConditions.visibilityOfElementLocated(CheckImagePopUpClose_xpath));
		 	CheckImgWebEelement.click();
		 	Thread.sleep(3000);
		 	
		 return true;
		 }
		 catch(Exception ex){
		 	return false;
		 }

		 }
		
		 public boolean plusBtnAccountNameClick_DailyCashTransaction()
		 {
		 try{

		 	WebElement appliedAmountWebEelement=new WebDriverWait(driver,100)
		 	.until(ExpectedConditions.visibilityOfElementLocated(plusAccountNameClick_xpath));
		 	appliedAmountWebEelement.click();
		 	Thread.sleep(3000);
		 return true;
		 }
		 catch(Exception ex){
		 	return false;
		 }

		 }
		
			public boolean InvoiceDetailsPopUp_DailyCashTransaction(String InvDetailPop)
			 {
			 try{

			 	WebElement CheckImgWebEelement=new WebDriverWait(driver,100)
			 	.until(ExpectedConditions.visibilityOfElementLocated(InvoiceDetailsPopup_xpath));
			 	String actual = CheckImgWebEelement.getText().trim();
				actual.equals(InvDetailPop);
					return true;
				

			} catch (Exception e) {
				return false;
			}
		}
			 

			public boolean InvoiceDetailsPopUpClose_DailyCashTransaction()
			 {
			 try{

			 	WebElement CheckImgWebEelement=new WebDriverWait(driver,100)
			 	.until(ExpectedConditions.visibilityOfElementLocated(InvoiceDetailsPopupClose_xpath));
			 	CheckImgWebEelement.click();
			 	Thread.sleep(3000);
			 	
			 return true;
			 }
			 catch(Exception ex){
			 	return false;
			 }

			 } 
			
			
}
