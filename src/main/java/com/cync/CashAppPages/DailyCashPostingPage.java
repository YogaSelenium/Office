package com.cync.CashAppPages;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.cync.base.BasePage;

public class DailyCashPostingPage  extends BasePage {
	
	private final By DailyCashPostingPageHeader_xpath = By.xpath("//span[contains(text(),'Daily Cash Posting')]");
	private final By AccountNumDailyCashPosting_xpath = By.xpath("(//tr[2]//td[@aria-describedby='daily_cash_posting_list_account_no'])[1]");
	private final By AccountNameDailyCashPosting_xpath = By.xpath("(//span[contains(@onclick,'subGridAction')])[1]");
	private final By CheckNoDailyCashPosting_xpath = By.xpath("(//tr[2]//td[@aria-describedby='daily_cash_posting_list_check_no'])[1]");
	private final By ChecAmountDailyCashPosting_xpath = By.xpath("(//tr[2]//td[@aria-describedby='daily_cash_posting_list_check_amount'])[1]");
	private final By batchNumDailyCashPosting_xpath = By.xpath("(//tr[2]//td[@aria-describedby='daily_cash_posting_list_batch_no'])[1]");
	private final By BatchDateDailyCashPosting_xpath = By.xpath("(//tr[2]//td[@aria-describedby='daily_cash_posting_list_batch_date'])[1]");
	private final By SourceDailyCashPosting_xpath = By.xpath("(//tr[2]//td[@aria-describedby='daily_cash_posting_list_source'])[1]");
	private final By CheckInvoiceDistribution_xpath = By.xpath("//a[text()='Check Invoice Distribution']");
	private final By AppliedInvoiceListPopUp_xpath = By.xpath("//h2[@class='title-heading']");
	private final By InvoiceNumPopUp_xpath = By.xpath("//tbody//tr[@class='row-odd']//td[1]");
	private final By AccountnamePopUp_xpath = By.xpath("//tbody//tr[@class='row-odd']//td[2]");
	private final By InvoicebalancePopUp_xpath = By.xpath("//tbody//tr[@class='row-odd']//td[3]");
	private final By ApplyAmountPopUp_xpath = By.xpath("//tbody//tr[@class='row-odd']//td[4]");
	private final By AdjustmentAmountPopUp_xpath = By.xpath("//tbody//tr[@class='row-odd']//td[5]");
	private final By InvCurrentBalAmountPopUp_xpath = By.xpath("//tbody//tr[@class='row-odd']//td[6]");
	private final By CheckInvoiceDistributionPopUpClose_xpath = By.xpath("(//button[@class='ui-dialog-titlebar-close'])[2]");
	private final By CheckImage_xpath = By.xpath("(//span[text()='Check Images'])[1]");
	private final By CheckImagePopup_xpath = By.xpath("//div[@id='gridholderBox']//table//tbody//tr//th");
/*	private final By CheckImagePopUpClose_xpath = By.xpath("(//div//button[@class='ui-dialog-titlebar-close'])[2]");
*/
	private final By CheckImgLink_xpath = By.xpath("//div[@id='gridholderBox']//tr[@class='row-odd'][1]//a[1]");

	
	private final By CheckImagePopUpClose_xpath = By.xpath("//div[@class='ui-dialog-titlebar ui-widget-header ui-corner-all ui-helper-clearfix']//button[@class='ui-dialog-titlebar-close']");

	private final By SearchWithBatchDateFrom_xpath = By.id("from_date");
	private final By SearchWithBatchDateTo_xpath = By.id("to_date");
	private final By SearchBtnFunction_xpath = By.id("daily-cash-posting-form");
	private final By ClickOnCheckBox_xpath = By.id("cb_daily_cash_posting_list");
	private final By ExportBtn_xpath = By.xpath("//div//span[@class='ui-icon ui-icon-extlink']");
	private final By ExportPopUpHeader_xpath = By.xpath("//label[text()='Daily Cash Posting']");
	private final By DownloadBtn_xpath = By.xpath("//div[@class='export']");
	private final By ExportPopUpClose_xpath = By.xpath("//button[@class='ui-dialog-titlebar-close']");
	private final By Reloadgrid_xpath = By.xpath("//div//span[@class='ui-icon ui-icon-refresh']");
	private final By AccNum_xpath = By.xpath("//table[@id='daily_cash_posting_list']//tbody//tr[2]//td[@role='gridcell'][3]");
	private final By CheckAmount_xpath = By.xpath("//table[@id='daily_cash_posting_list']//tbody//tr[2]//td[@role='gridcell'][6]");

	
	
	
	
	public DailyCashPostingPage (WebDriver driver) {
		super(driver);
		try{
			/*if(!driver.findElement(DailyCashPostingPageHeader_xpath).getText().trim().contains("Daily Cash Posting")){
				throw new SkipException(" Daily Cash Posting page couldn't open.");
			
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
				.until(ExpectedConditions.visibilityOfElementLocated(DailyCashPostingPageHeader_xpath));
			HeaderWebEelement.getText();
			Thread.sleep(2000);
			
		}
		catch(Exception ex){
			
		}
		return Header;
		
		} 	

	 public boolean AccountNum_DailyCashPosting()
	 {
	 try{

	 	WebElement accountNumWebEelement=new WebDriverWait(driver,100)
	 	.until(ExpectedConditions.visibilityOfElementLocated(AccountNumDailyCashPosting_xpath));
	 	accountNumWebEelement.isDisplayed();

	 return true;
	 }
	 catch(Exception ex){
	 	return false;
	 }

	 }
	 
	 public boolean AccountName_DailyCashPosting()
	 {
	 try{

	 	WebElement accountNameWebEelement=new WebDriverWait(driver,100)
	 	.until(ExpectedConditions.visibilityOfElementLocated(AccountNameDailyCashPosting_xpath));
	 	accountNameWebEelement.isDisplayed();

	 return true;
	 }
	 catch(Exception ex){
	 	return false;
	 }

	 } 
	 
	 public boolean CheckNum_DailyCashPosting()
	 {
	 try{

	 	WebElement CheckNumWebEelement=new WebDriverWait(driver,100)
	 	.until(ExpectedConditions.visibilityOfElementLocated(CheckNoDailyCashPosting_xpath));
	 	CheckNumWebEelement.isDisplayed();

	 return true;
	 }
	 catch(Exception ex){
	 	return false;
	 }

	 } 
	 
	 public boolean CheckAmount_DailyCashPosting()
	 {
	 try{

	 	WebElement CheckAmountWebEelement=new WebDriverWait(driver,100)
	 	.until(ExpectedConditions.visibilityOfElementLocated(ChecAmountDailyCashPosting_xpath));
	 	CheckAmountWebEelement.isDisplayed();

	 return true;
	 }
	 catch(Exception ex){
	 	return false;
	 }

	 } 
	 
	 public boolean BatchNum_DailyCashPosting()
	 {
	 try{

	 	WebElement BatchNumWebEelement=new WebDriverWait(driver,100)
	 	.until(ExpectedConditions.visibilityOfElementLocated(batchNumDailyCashPosting_xpath));
	 	BatchNumWebEelement.isDisplayed();

	 return true;
	 }
	 catch(Exception ex){
	 	return false;
	 }

	 } 
	 
	 public boolean BatchDate_DailyCashPosting()
	 {
	 try{

	 	WebElement BatchDateWebEelement=new WebDriverWait(driver,100)
	 	.until(ExpectedConditions.visibilityOfElementLocated(BatchDateDailyCashPosting_xpath));
	 	BatchDateWebEelement.isDisplayed();

	 return true;
	 }
	 catch(Exception ex){
	 	return false;
	 }

	 } 
	 
	 public boolean Source_DailyCashPosting()
	 {
	 try{

	 	WebElement SourceWebEelement=new WebDriverWait(driver,100)
	 	.until(ExpectedConditions.visibilityOfElementLocated(SourceDailyCashPosting_xpath));
	 	SourceWebEelement.isDisplayed();

	 return true;
	 }
	 catch(Exception ex){
	 	return false;
	 }

	 }
	
	 public boolean AccountNameHyperLink_DailyCashPosting()
	 {
	 try{

	 	WebElement accountNameWebEelement=new WebDriverWait(driver,100)
	 	.until(ExpectedConditions.visibilityOfElementLocated(AccountNameDailyCashPosting_xpath));
	 	accountNameWebEelement.click();
	 	Thread.sleep(2000);

	 return true;
	 }
	 catch(Exception ex){
	 	return false;
	 }

	 } 
	 
	 public boolean CheckInvoiceDistributionHyperLink_DailyCashPosting()
	 {
	 try{

	 	WebElement DistributionLinkWebEelement=new WebDriverWait(driver,100)
	 	.until(ExpectedConditions.visibilityOfElementLocated(CheckInvoiceDistribution_xpath));
	 	DistributionLinkWebEelement.click();
	 	Thread.sleep(2000);

	 return true;
	 }
	 catch(Exception ex){
	 	return false;
	 }

	 } 
	 
	 public boolean AppliedInvoiceListPopUp_DailyCashPosting(String PopUpHead)
	 {
	 try{

	 	WebElement AppliedInvoiceListWebEelement=new WebDriverWait(driver,100)
	 	.until(ExpectedConditions.visibilityOfElementLocated(AppliedInvoiceListPopUp_xpath));
		String actual = AppliedInvoiceListWebEelement.getText().trim();
		actual.equals(PopUpHead);
			return true;
		

	} catch (Exception e) {
		return false;
	}
}

	 public boolean AccNum_DailyCashPosting(String AccNum)
	 {
	 try{

	 	WebElement AccNumWebEelement=new WebDriverWait(driver,100)
	 	.until(ExpectedConditions.visibilityOfElementLocated(AccNum_xpath));
		String actual = AccNumWebEelement.getText().trim();
		actual.equals(AccNum);
			return true;
		

	} catch (Exception e) {
		return false;
	}
} 
	 
	 public boolean CheckAmount_DailyCashPosting(String ChkAmt)
	 {
	 try{

	 	WebElement CheckAmountWebEelement=new WebDriverWait(driver,100)
	 	.until(ExpectedConditions.visibilityOfElementLocated(CheckAmount_xpath));
		String actual = CheckAmountWebEelement.getText().trim();
		actual.equals(ChkAmt);
			return true;
		

	} catch (Exception e) {
		return false;
	}
} 
	 
	public boolean InvoiceNumCIDPopUp_DailyCashPosting()
		 {
		 try{

		 	WebElement invoiceNumInvoiceListWebEelement=new WebDriverWait(driver,100)
		 	.until(ExpectedConditions.visibilityOfElementLocated(InvoiceNumPopUp_xpath));
		 	invoiceNumInvoiceListWebEelement.isDisplayed();
		 
		 return true;
		 }
		 catch(Exception ex){
		 	return false;
		 }

		 } 
	
	public boolean AccountNameCIDPopUp_DailyCashPosting()
	 {
	 try{

	 	WebElement accountnameInvoiceListWebEelement=new WebDriverWait(driver,100)
	 	.until(ExpectedConditions.visibilityOfElementLocated(AccountnamePopUp_xpath));
	 	accountnameInvoiceListWebEelement.isDisplayed();
	 
	 return true;
	 }
	 catch(Exception ex){
	 	return false;
	 }

	 } 
	
	public boolean invoiceBalanceCIDPopUp_DailyCashPosting(String InvBal)
	 {
	 try{

	 	WebElement InvBalInvoiceListWebEelement=new WebDriverWait(driver,100)
	 	.until(ExpectedConditions.visibilityOfElementLocated(InvoicebalancePopUp_xpath));
	 	String actual = InvBalInvoiceListWebEelement.getText().trim();
		actual.equals(InvBal);
			return true;
		

	} catch (Exception e) {
		return false;
	}
}
	public boolean appliedAmountCIDPopUp_DailyCashPosting(String AppAmt)
	 {
	 try{

	 	WebElement ApplyAmountInvoiceListWebEelement=new WebDriverWait(driver,100)
	 	.until(ExpectedConditions.visibilityOfElementLocated(ApplyAmountPopUp_xpath));
	 	String actual = ApplyAmountInvoiceListWebEelement.getText().trim();
		actual.equals(AppAmt);
			return true;
		

	} catch (Exception e) {
		return false;
	}
}
	 
	public boolean adjustmentAmountCIDPopUp_DailyCashPosting(String AdjAmt)
	 {
	 try{

	 	WebElement AdjustmentAmountInvoiceListWebEelement=new WebDriverWait(driver,100)
	 	.until(ExpectedConditions.visibilityOfElementLocated(AdjustmentAmountPopUp_xpath));
	 	String actual = AdjustmentAmountInvoiceListWebEelement.getText().trim();
		actual.equals(AdjAmt);
			return true;
		

	} catch (Exception e) {
		return false;
	}
}
	 
	
	public boolean invCurrentBalanceCIDPopUp_DailyCashPosting(String InvCurrBal)
	 {
	 try{

	 	WebElement invCurrentBalAmountInvoiceListWebEelement=new WebDriverWait(driver,100)
	 	.until(ExpectedConditions.visibilityOfElementLocated(InvCurrentBalAmountPopUp_xpath));
	 	String actual = invCurrentBalAmountInvoiceListWebEelement.getText().trim();
		actual.equals(InvCurrBal);
			return true;
		

	} catch (Exception e) {
		return false;
	}
}
	
	public boolean CheckInvoiceDistributionPopUpClose_DailyCashPosting()
	 {
	 try{

	 	WebElement CheckInvoiceListWebEelement=new WebDriverWait(driver,100)
	 	.until(ExpectedConditions.visibilityOfElementLocated(CheckInvoiceDistributionPopUpClose_xpath));
	 	CheckInvoiceListWebEelement.click();
	 	
	 return true;
	 }
	 catch(Exception ex){
	 	return false;
	 }

	 } 
	
	public boolean CheckImage_DailyCashPosting()
	 {
	 try{

	 	WebElement CheckImgWebEelement=new WebDriverWait(driver,100)
	 	.until(ExpectedConditions.visibilityOfElementLocated(CheckImage_xpath));
	 	CheckImgWebEelement.click();
	 	
	 return true;
	 }
	 catch(Exception ex){
	 	return false;
	 }

	 } 
	
	
	public boolean CheckImagePopUp_DailyCashPosting(String ChkImgHead)
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
	
	public boolean CheckImageLink_DailyCashPosting()
	 {
	 try{

	 	WebElement CheckImgLinkWebEelement=new WebDriverWait(driver,100)
	 	.until(ExpectedConditions.visibilityOfElementLocated(CheckImgLink_xpath));
	 	CheckImgLinkWebEelement.isDisplayed();
	 	Thread.sleep(2000);
	 	
	 return true;
	 }
	 catch(Exception ex){
	 	return false;
	 }

	 }
	
	
	
	public boolean CheckImagePopUpClose_DailyCashPosting()
	 {
	 try{

	 	WebElement CheckImgWebEelement=new WebDriverWait(driver,100)
	 	.until(ExpectedConditions.visibilityOfElementLocated(CheckImagePopUpClose_xpath));
	 	CheckImgWebEelement.click();
	 	
	 return true;
	 }
	 catch(Exception ex){
	 	return false;
	 }

	 }
	
	public boolean selectSystemDate_From(){
		try {
		WebElement batchDateWebElement = new WebDriverWait(driver,
		100)
		.until(ExpectedConditions
		.visibilityOfElementLocated(SearchWithBatchDateFrom_xpath));
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
		.visibilityOfElementLocated(SearchWithBatchDateTo_xpath));
		Date date = new Date(System.currentTimeMillis());
		SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
		String today=formatter.format(date);

		batchDateWebElement.sendKeys(today);


		return true;
		} catch (Exception e) {
		return false;
		}
		}	
	
	 public boolean SearchBtnClick_DailyCashPosting()
	 {
	 try{

	 	WebElement searchBtnWebEelement=new WebDriverWait(driver,100)
	 	.until(ExpectedConditions.visibilityOfElementLocated(SearchBtnFunction_xpath));
	 	searchBtnWebEelement.click();
	 	Thread.sleep(5000);

	 return true;
	 }
	 catch(Exception ex){
	 	return false;
	 }

	 }
	 
	 public boolean SelectCheckBox_DailyCashPosting()
	 {
	 try{

	 	WebElement checkBoxWebEelement=new WebDriverWait(driver,100)
	 	.until(ExpectedConditions.visibilityOfElementLocated(ClickOnCheckBox_xpath));
	 	checkBoxWebEelement.click();
	 	Thread.sleep(2000);

	 return true;
	 }
	 catch(Exception ex){
	 	return false;
	 }

	 }
	 
	 public boolean ClickOnExportBtn_DailyCashPosting()
	 {
	 try{

	 	WebElement exportBtnWebEelement=new WebDriverWait(driver,100)
	 	.until(ExpectedConditions.visibilityOfElementLocated(ExportBtn_xpath));
	 	exportBtnWebEelement.click();
	 	Thread.sleep(2000);

	 return true;
	 }
	 catch(Exception ex){
	 	return false;
	 }

	 }
	
	 
	 public boolean ExportPopUpHeader_DailyCashPosting()
	 {
	 try{

	 	WebElement exportpopupWebEelement=new WebDriverWait(driver,100)
	 	.until(ExpectedConditions.visibilityOfElementLocated(ExportPopUpHeader_xpath));
	 	exportpopupWebEelement.isDisplayed();
	 	Thread.sleep(2000);

	 return true;
	 }
	 catch(Exception ex){
	 	return false;
	 }

	 }
	 
	 public boolean DownloadBtnExportPopUp_DailyCashPosting()
	 {
	 try{

	 	WebElement downloadBtnWebEelement=new WebDriverWait(driver,100)
	 	.until(ExpectedConditions.visibilityOfElementLocated(DownloadBtn_xpath));
	 	downloadBtnWebEelement.click();
	 	Thread.sleep(5000);

	 return true;
	 }
	 catch(Exception ex){
	 	return false;
	 }

	 }
	 
	 public boolean ExportPopUpClose_DailyCashPosting()
	 {
	 try{

	 	WebElement downloadBtnWebEelement=new WebDriverWait(driver,100)
	 	.until(ExpectedConditions.visibilityOfElementLocated(ExportPopUpClose_xpath));
	 	downloadBtnWebEelement.click();
	 	Thread.sleep(2000);

	 return true;
	 }
	 catch(Exception ex){
	 	return false;
	 }

	 }
	 
	 public boolean ReloadGridFunction_DailyCashPosting()
	 {
	 try{

	 	WebElement reloadGridWebEelement=new WebDriverWait(driver,100)
	 	.until(ExpectedConditions.visibilityOfElementLocated(Reloadgrid_xpath));
	 	reloadGridWebEelement.click();
	 	Thread.sleep(5000);

	 return true;
	 }
	 catch(Exception ex){
	 	return false;
	 }

	 } 
	 
}
