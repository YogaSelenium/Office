package com.cync.CashAppPages;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.cync.base.BasePage;

public class CashReceiptHistoryPage extends BasePage {
	
	
	private final By CashReceiptHistoryPageHeader_xpath = By.xpath("//span[contains(text(),'Cash Receipt History')]");
	private final By ExistingBatch_xpath = By.id("cash_receipt_history_existing_batch_no");
	private final By existingBatchSelect_xpath = By.xpath("(//select[@id='cash_receipt_history_existing_batch_no']/option)[2]");
	private final By SearchBtnFunction_xpath = By.id("search_cash_receipt_history_button");
	private final By ClientNameInCheckRegister_xpath = By.xpath("//div//table//thead//tr//th[text()='Client']");
	private final By DebtorNumInCheckRegister_xpath = By.xpath("//div//table//thead//tr//th[text()='Debtor No']");
	private final By DebtorNameInCheckRegister_xpath = By.xpath("//div//table//thead//tr//th[text()='Debtor Name']");
	private final By CheckNumInCheckRegister_xpath = By.xpath("//div//table//thead//tr//th[text()='Check Number']");
	private final By CheckAmountInCheckRegister_xpath = By.xpath("//div//table//thead//tr//th[text()='Check Amount']");
	private final By ApplyAmountInCheckRegister_xpath = By.xpath("//div//table//thead//tr//th[text()='Applied Amount']");
	private final By AdjustAmountInCheckRegister_xpath = By.xpath("//div//table//thead//tr//th[text()='Adjust Amount']");
	private final By StatusInCheckRegister_xpath = By.xpath("//div//table//thead//tr//th[text()='Status']");
	private final By BatchFiles_xpath = By.xpath("//div//table//thead//tr//th[text()='Batch Files']");
	private final By ClientHyperLink_xpath = By.xpath("(//a[@onclick='javascript:return false;'])[1]");
	private final By CheckInvoiceDistribution_xpath = By.xpath("(//li/a[contains(text(),'Check Invoice Distribution')])[1]");
	private final By AppliedInvoiceListPopUp_xpath = By.xpath("//h2[text()='Applied Invoice List']");
	private final By InvCurrentBalInvoiceListPopUp_xpath = By.xpath("(//td[@class='numRightAlign'])[8]");

	private final By AppliedAmtInvoiceListPopUpClose_xpath = By.xpath("//button[@class='ui-dialog-titlebar-close']");
	private final By SearchWithBatchDateFrom_xpath = By.id("batch_batch_date_from");
	private final By SearchWithBatchDateTo_xpath = By.id("batch_batch_date_to");
	private final By chooseFile_xpath = By.xpath("(//div[@class='xfact-fileUpload btn btn-primary btn-sm'])[1]");
	private final By UploadImageBtn_xpath = By.xpath("(//div[@class='xfact-fileUpload btn btn-primary btn-sm'])[2]");
	private final By UploadImageSuccessMsg_xpath = By.id("success_explanation_for_batch_upload");
	private final By BatchFileHyperLink_xpath = By.xpath("(//a[@target='_blank'])[2]");
	private final By ImageMappingBtn_xpath = By.xpath("//span//a[@title='Image Mapping']");
	private final By CheckOnDebtor_xpath = By.xpath("(//input[@class='invoice_list_checks'])[1]");
	private final By CheckOnImage_xpath = By.xpath("(//input[@class='thumbcheck'])[1]");
	private final By CheckOnSaveBtn_xpath = By.xpath("//div//span[text()='Save']");
	private final By CheckOnCloseBtn_xpath = By.xpath("//span[@class='mp-iconClose']");
	private final By ChkAmt_OP_xpath = By.xpath("(//td[@class='numRightAlign'])[1]");
	private final By AppliedAmt_OP_xpath = By.xpath("(//td[@class='numRightAlign'])[2]");
	private final By AdjustAmt_OP_xpath = By.xpath("(//td[@class='numRightAlign'])[3]");

	private final By AppliedAmtInvoiceListPopUp_OP_xpath = By.xpath("(//td[@class='numRightAlign'])[5]");
	private final By AdjustmentAmtValue_xpath = By.xpath("(//td[contains(@class,'numRightAlign')])[6]");
	private final By AdjustmentReasonValue_xpath = By.xpath("(//td[contains(@class,'numRightAlign')])[7]");

	private final By InvBalInvoiceListPopUp_OP_xpath = By.xpath("(//td[@class='numRightAlign'])[4]");
	private final By InvCurrentBalInvoiceListPopUp_OP_xpath = By.xpath("(//td[@class='numRightAlign'])[8]");

	private final By BatchFilesImageLink_xpath = By.xpath("(//div[@class='row-fluid'])[3]//tr[@class='row-even'][1]//td[1]//a[1]");

	private final By checkDebtorMapping_xpath = By.xpath("//input[@class='invoice_list_checks']");
	private final By checkImageSelect_xpath = By.xpath("(//input[@class='thumbcheck'])[2]");
	private final By checkImageSaveBtn_xpath = By.id("assign_invoice_btn");
	private final By checkImageIconLink_xpath = By.xpath("(//span[@class='icon-link'])[1]");
	private final By status_checkRegister_xpath = By.xpath("(//table//td[text()='Balance'])[1]");

	
	
	
	public CashReceiptHistoryPage(WebDriver driver) {
		super(driver);
		try{
			/*if(!driver.findElement(CashReceiptHistoryPageHeader_xpath).getText().trim().contains(" Cash Receipt History ")){
				throw new SkipException(" Cash Receipt History page couldn't open.");
			
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
				.until(ExpectedConditions.visibilityOfElementLocated(CashReceiptHistoryPageHeader_xpath));
			HeaderWebEelement.getText();
			Thread.sleep(2000);
			
		}
		catch(Exception ex){
			
		}
		return Header;
		
		} 	

	 
	 public boolean ExistingBatchClick()
	 {
	 try{

	 	WebElement extBatchWebEelement=new WebDriverWait(driver,100)
	 	.until(ExpectedConditions.visibilityOfElementLocated(ExistingBatch_xpath));
	 	extBatchWebEelement.click();

	 return true;
	 }
	 catch(Exception ex){
	 	return false;
	 }

	 }	


	 public boolean ExistingBatchSelect()
	 {
	 try{

	 	WebElement extBatchSelectWebEelement=new WebDriverWait(driver,100)
	 	.until(ExpectedConditions.visibilityOfElementLocated(existingBatchSelect_xpath));
	 	extBatchSelectWebEelement.click();
	 	Thread.sleep(1000);


	 return true;
	 }
	 catch(Exception ex){
	 	return false;
	 }

	 }	
	 
	 public boolean SearchBtnClick_CashReceiprHistory()
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

	 public boolean ClientNameInCheckRegister_CashReceiprHistory()
	 {
	 try{

	 	WebElement clientNameWebEelement=new WebDriverWait(driver,100)
	 	.until(ExpectedConditions.visibilityOfElementLocated(ClientNameInCheckRegister_xpath));
	 	clientNameWebEelement.isDisplayed();

	 return true;
	 }
	 catch(Exception ex){
	 	return false;
	 }

	 }
	 
	 public boolean DebtorNumInCheckRegister_CashReceiprHistory()
	 {
	 try{

	 	WebElement debtorNumWebEelement=new WebDriverWait(driver,100)
	 	.until(ExpectedConditions.visibilityOfElementLocated(DebtorNumInCheckRegister_xpath));
	 	debtorNumWebEelement.isDisplayed();

	 return true;
	 }
	 catch(Exception ex){
	 	return false;
	 }

	 }
	 
	 public boolean DebtorNameInCheckRegister_CashReceiprHistory()
	 {
	 try{

	 	WebElement debtorNameWebEelement=new WebDriverWait(driver,100)
	 	.until(ExpectedConditions.visibilityOfElementLocated(DebtorNameInCheckRegister_xpath));
	 	debtorNameWebEelement.isDisplayed();

	 return true;
	 }
	 catch(Exception ex){
	 	return false;
	 }

	 }
	 
	 public boolean CheckNumInCheckRegister_CashReceiprHistory()
	 {
	 try{

	 	WebElement checkNumWebEelement=new WebDriverWait(driver,100)
	 	.until(ExpectedConditions.visibilityOfElementLocated(CheckNumInCheckRegister_xpath));
	 	checkNumWebEelement.isDisplayed();

	 return true;
	 }
	 catch(Exception ex){
	 	return false;
	 }

	 }
	
	 public boolean CheckAmountInCheckRegister_CashReceiprHistory()
	 {
	 try{

	 	WebElement checkAmountWebEelement=new WebDriverWait(driver,100)
	 	.until(ExpectedConditions.visibilityOfElementLocated(CheckAmountInCheckRegister_xpath));
	 	checkAmountWebEelement.isDisplayed();

	 return true;
	 }
	 catch(Exception ex){
	 	return false;
	 }

	 }

	 public boolean AppliedAmountInCheckRegister_CashReceiprHistory()
	 {
	 try{

	 	WebElement appliedAmountWebEelement=new WebDriverWait(driver,100)
	 	.until(ExpectedConditions.visibilityOfElementLocated(ApplyAmountInCheckRegister_xpath));
	 	appliedAmountWebEelement.isDisplayed();

	 return true;
	 }
	 catch(Exception ex){
	 	return false;
	 }

	 }
	 
	 public boolean AdjustAmountInCheckRegister_CashReceiprHistory()
	 {
	 try{

	 	WebElement adjustAmountWebEelement=new WebDriverWait(driver,100)
	 	.until(ExpectedConditions.visibilityOfElementLocated(AdjustAmountInCheckRegister_xpath));
	 	adjustAmountWebEelement.isDisplayed();

	 return true;
	 }
	 catch(Exception ex){
	 	return false;
	 }

	 }
	 
	 public boolean StatusInCheckRegister_CashReceiprHistory()
	 {
	 try{

	 	WebElement StatusWebEelement=new WebDriverWait(driver,100)
	 	.until(ExpectedConditions.visibilityOfElementLocated(StatusInCheckRegister_xpath));
	 	StatusWebEelement.isDisplayed();

	 return true;
	 }
	 catch(Exception ex){
	 	return false;
	 }

	 }
	 
	 public boolean BatchFiles_CashReceiprHistory()
	 {
	 try{

	 	WebElement BatchFilesWebEelement=new WebDriverWait(driver,100)
	 	.until(ExpectedConditions.visibilityOfElementLocated(BatchFiles_xpath));
	 	BatchFilesWebEelement.isDisplayed();

	 return true;
	 }
	 catch(Exception ex){
	 	return false;
	 }

	 }
	 

	public boolean MouseOverOnClientHyperLink() {
		    	try {
		    	    WebElement menuItemWebE = new WebDriverWait(driver, 10)
		    		    .until(ExpectedConditions
		    			    .visibilityOfElementLocated(ClientHyperLink_xpath));
		    	    new Actions(driver).moveToElement(menuItemWebE).perform();
		    	    return true;
		    	} catch (Exception ex) {
		    	    return false;
		    	}
		        }
	
	
	public boolean CheckAmnt_CashReceiprHistory_OP(String expected) {
		try {
			WebElement CheckAmntWebElement = new WebDriverWait(driver, 100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(ChkAmt_OP_xpath));

			String actual = CheckAmntWebElement.getText();
			if (actual.equals(expected))
				return true;
			else
				return false;

		} catch (Exception e) {
			return false;
		}
	}

	public boolean AppliedAmnt_CashReceiprHistory_OP(String expectApp) {
		try {
			WebElement AppAmntWebElement = new WebDriverWait(driver, 100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(AppliedAmt_OP_xpath));

			String actual = AppAmntWebElement.getText();
			if (actual.equals(expectApp))
				return true;
			else
				return false;

		} catch (Exception e) {
			return false;
		}
	}

	
	public boolean AdjustAmnt_CashReceiprHistory_OP(String AdjustAmt) {
		try {
			WebElement AdjAmntWebElement = new WebDriverWait(driver, 100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(AdjustAmt_OP_xpath));

			String actual = AdjAmntWebElement.getText();
			if (actual.equals(AdjustAmt))
				return true;
			else
				return false;

		} catch (Exception e) {
			return false;
		}
	}
	
	
	public boolean Status_CashReceiprHistory_OP(String status) {
		try {
			WebElement StatusWebElement = new WebDriverWait(driver, 100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(status_checkRegister_xpath));

			String actual = StatusWebElement.getText();
			if (actual.equals(status))
				return true;
			else
				return false;

		} catch (Exception e) {
			return false;
		}
	}
	
		 public boolean ClientNameHyperLink_CashReceiprHistory() { 
	         try {     
	         this.MouseOverOnClientHyperLink();        
	         WebElement CheckInvoiceDistributionWebEelement = new WebDriverWait(driver, 1000)      
	         .until(ExpectedConditions.elementToBeClickable(CheckInvoiceDistribution_xpath));     
	         CheckInvoiceDistributionWebEelement.click();     
	         Thread.sleep(5000);
	         return true;
	         }
	         
	         catch (Exception ex) {     
	         return false; 
	         }
	         
	         }
	 
		 public boolean AppliedInvoiceListPopUp_CashReceiprHistory(String POpUopHead)
		 {
		 try{

		 	WebElement AppliedInvoiceListWebEelement=new WebDriverWait(driver,100)
		 	.until(ExpectedConditions.visibilityOfElementLocated(AppliedInvoiceListPopUp_xpath));
		 	AppliedInvoiceListWebEelement.isDisplayed();
		
		 	String actual = AppliedInvoiceListWebEelement.getText();
			if (actual.equals(POpUopHead))
				return true;
			else
				return false;

		} catch (Exception e) {
			return false;
		}
		 }
		 
		 
			public boolean InvBalInvoiceListPopUp_OP_CashReceiprHistory(String InvBal)
			 {
			 try{

			 	WebElement InvBalInvoiceListWebEelement=new WebDriverWait(driver,100)
			 	.until(ExpectedConditions.visibilityOfElementLocated(InvBalInvoiceListPopUp_OP_xpath));
			 	String actual = InvBalInvoiceListWebEelement.getText();
				if (actual.equals(InvBal))
					return true;
				else
					return false;

			} catch (Exception e) {
				return false;
			}
			 }
		 
		 
		public boolean AppliedAmountInvoiceListPopUp_OP_CashReceiprHistory(String Apply)
		 {
		 try{

		 	WebElement AppliedAmtInvoiceListWebEelement=new WebDriverWait(driver,100)
		 	.until(ExpectedConditions.visibilityOfElementLocated(AppliedAmtInvoiceListPopUp_OP_xpath));
		 	String actual = AppliedAmtInvoiceListWebEelement.getText();
			if (actual.equals(Apply))
				return true;
			else
				return false;

		} catch (Exception e) {
			return false;
		}
		 }
		
		
		public boolean AdjustmentAmountPopUp_CashReceiprHistory(String adjustmentValue)
		 {
		 try{

		 	WebElement AdjustAmtInvoiceListWebEelement=new WebDriverWait(driver,100)
		 	.until(ExpectedConditions.visibilityOfElementLocated(AdjustmentAmtValue_xpath));
		 	String actual = AdjustAmtInvoiceListWebEelement.getText();
			if (actual.equals(adjustmentValue))
				return true;
			else
				return false;

		} catch (Exception e) {
			return false;
		}
	}
		
		
		public boolean AdjustmentReasonPopUp_CashReceiprHistory(String adjustmentReason)
		 {
		 try{

		 	WebElement AdjustmentReasonInvoiceListWebEelement=new WebDriverWait(driver,100)
		 	.until(ExpectedConditions.visibilityOfElementLocated(AdjustmentReasonValue_xpath));
		 	String actual = AdjustmentReasonInvoiceListWebEelement.getText();
			if (actual.equals(adjustmentReason))
				return true;
			else
				return false;

		} catch (Exception e) {
			return false;
		}
	}
		
		
			public boolean InvCurrentBalInvoiceListPopUp_OP_CashReceiprHistory(String InvCurrent)
			 {
			 try{

			 	WebElement InvCurrentBalInvoiceListWebEelement=new WebDriverWait(driver,100)
			 	.until(ExpectedConditions.visibilityOfElementLocated(InvCurrentBalInvoiceListPopUp_OP_xpath));
			 	String actual = InvCurrentBalInvoiceListWebEelement.getText();
				if (actual.equals(InvCurrent))
					return true;
				else
					return false;

			} catch (Exception e) {
				return false;
			}
			 }
		 
		
		public boolean InvCurrentBalInvoiceListPopUp_CashReceiprHistory()
		 {
		 try{

		 	WebElement InvCurrentBalInvoiceListWebEelement=new WebDriverWait(driver,100)
		 	.until(ExpectedConditions.visibilityOfElementLocated(InvCurrentBalInvoiceListPopUp_xpath));
		 	InvCurrentBalInvoiceListWebEelement.isDisplayed();
		 	Thread.sleep(3000);
		 return true;
		 }
		 catch(Exception ex){
		 	return false;
		 }

		 } 
		
		public boolean AppliedInvoiceListPopUpClose_CashReceiprHistory()
		 {
		 try{

		 	WebElement AppliedAmtInvoiceListWebEelement=new WebDriverWait(driver,100)
		 	.until(ExpectedConditions.visibilityOfElementLocated(AppliedAmtInvoiceListPopUpClose_xpath));
		 	AppliedAmtInvoiceListWebEelement.click();
		 	
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
		
		public boolean clickOnChooseFile_CashReceipt(){
			
			try{
				WebElement chooseFileWebEelement=new WebDriverWait(driver,60)
				.until(ExpectedConditions.visibilityOfElementLocated(chooseFile_xpath));
				chooseFileWebEelement.isDisplayed();
				chooseFileWebEelement.click();
				Thread.sleep(7000);
				return true;
			}
			catch(Exception ex){
				return false;
			}

			}
		
		public boolean  fileUPload_CashReceipt(){
			
			
			try {	
				
				StringSelection ss = new StringSelection("D:\\Cync_master\\cyncautomation\\cyncautomation\\Cync_Automation_Project\\src\\test\\resources\\cash1.pdf");
		
				Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
				
				Robot robot = new Robot();
				robot.keyPress(KeyEvent.VK_CONTROL);
				robot.keyPress(KeyEvent.VK_V);
				robot.keyRelease(KeyEvent.VK_V);
				robot.keyRelease(KeyEvent.VK_CONTROL);
				robot.keyPress(KeyEvent.VK_ENTER);
				robot.keyRelease(KeyEvent.VK_ENTER);
						
				Thread.sleep(5000);
				return true;
			} catch (Exception e) {
				// TODO: handle exception
			}
			return false;
			
		}
		
		public boolean UploadImageFunction_CashReceiprHistory()
		 {
		 try{

		 	WebElement UploadImageWebEelement=new WebDriverWait(driver,100)
		 	.until(ExpectedConditions.visibilityOfElementLocated(UploadImageBtn_xpath));
		 	UploadImageWebEelement.click();
		 	Thread.sleep(10000);
		 return true;
		 }
		 catch(Exception ex){
		 	return false;
		 }

		 } 
		
		
		public boolean UploadImageSuccessMsgn_CashReceiprHistory()
		 {
		 try{

		 	WebElement UploadImageMsgWebEelement=new WebDriverWait(driver,100)
		 	.until(ExpectedConditions.visibilityOfElementLocated(UploadImageSuccessMsg_xpath));
		 	UploadImageMsgWebEelement.isDisplayed();
		 	
		 return true;
		 }
		 catch(Exception ex){
		 	return false;
		 }

		 } 
		
		
		/* public String UploadImageSuccessMsgn_CashReceiprHistory(String SuccessMsg)
			{
			try{
				WebElement UploadImageMsgWebEelement=new WebDriverWait(driver,100)
					.until(ExpectedConditions.visibilityOfElementLocated(UploadImageSuccessMsg_xpath));
				UploadImageMsgWebEelement.getText();
				Thread.sleep(5000);
				
			}
			catch(Exception ex){
				
			}
			return SuccessMsg;
			
			} 	*/

		 public boolean BatchFileHyperLink_CashReceiprHistory()
		 {
		 try{

		 	WebElement BatchFileHyperLinkWebEelement=new WebDriverWait(driver,100)
		 	.until(ExpectedConditions.visibilityOfElementLocated(BatchFileHyperLink_xpath));
		 	BatchFileHyperLinkWebEelement.isDisplayed();
		 	Thread.sleep(5000);
		 return true;
		 }
		 catch(Exception ex){
		 	return false;
		 }

		 } 
		
		 public boolean ImageMappingFunction_CashReceiprHistory()
		 {
		 try{

		 	WebElement ImageMappingWebEelement=new WebDriverWait(driver,100)
		 	.until(ExpectedConditions.visibilityOfElementLocated(ImageMappingBtn_xpath));
		 	ImageMappingWebEelement.click();
		 	Thread.sleep(10000);
		 return true;
		 }
		 catch(Exception ex){
		 	return false;
		 }

		 } 
		
		 
		 public boolean CashReceiprHistoryImgMappingCheckBox()
		 {
		 try{

		 	WebElement batchImgMapWebEelement=new WebDriverWait(driver,100)
		 	.until(ExpectedConditions.visibilityOfElementLocated(checkDebtorMapping_xpath));
		 	batchImgMapWebEelement.click();
		 	Thread.sleep(5000);

		 	
		 return true;
		 }
		 catch(Exception ex){
		 	return false;
		 }

		 }
		 
		 public boolean CashReceiprHistoryImgMappingSelectImg()
		 {
		 try{

		 	WebElement batchSelectImgWebEelement=new WebDriverWait(driver,100)
		 	.until(ExpectedConditions.visibilityOfElementLocated(checkImageSelect_xpath));
		 	batchSelectImgWebEelement.click();
		 	Thread.sleep(5000);

		 	
		 return true;
		 }
		 catch(Exception ex){
		 	return false;
		 }

		 }
		 
		 public boolean CashReceiprHistoryImgMappingSaveBtn()
		 {
		 try{

		 	WebElement batchSelectImgSaveWebEelement=new WebDriverWait(driver,100)
		 	.until(ExpectedConditions.visibilityOfElementLocated(checkImageSaveBtn_xpath));
		 	batchSelectImgSaveWebEelement.click();
		 	Thread.sleep(4000);

		 	
		 return true;
		 }
		 catch(Exception ex){
		 	return false;
		 }

		 }

		 public boolean CashReceiprHistoryMappingIconClick()
		 {
		 try{

		 	WebElement batchSelectIconWebEelement=new WebDriverWait(driver,100)
		 	.until(ExpectedConditions.visibilityOfElementLocated(checkImageIconLink_xpath));
		 	batchSelectIconWebEelement.click();
		 	Thread.sleep(5000);

		 	
		 return true;
		 }
		 catch(Exception ex){
		 	return false;
		 }

		 }
		 
		 
		 public boolean CheckImageMappingPopUp_CheckOnDebtor()
		 {
		 try{

		 	WebElement CheckDebtorWebEelement=new WebDriverWait(driver,100)
		 	.until(ExpectedConditions.visibilityOfElementLocated(CheckOnDebtor_xpath));
		 	CheckDebtorWebEelement.click();
		 	Thread.sleep(3000);
		 return true;
		 }
		 catch(Exception ex){
		 	return false;
		 }

		 } 	 
		
		 public boolean CheckImageMappingPopUp_CheckOnImage()
		 {
		 try{

		 	WebElement CheckImageWebEelement=new WebDriverWait(driver,100)
		 	.until(ExpectedConditions.visibilityOfElementLocated(CheckOnImage_xpath));
		 	CheckImageWebEelement.click();
		 	Thread.sleep(3000);
		 return true;
		 }
		 catch(Exception ex){
		 	return false;
		 }

		 } 	
		 
		 public boolean CheckImageMappingPopUp_SaveButton()
		 {
		 try{

		 	WebElement CheckImageSaveWebEelement=new WebDriverWait(driver,100)
		 	.until(ExpectedConditions.visibilityOfElementLocated(CheckOnSaveBtn_xpath));
		 	CheckImageSaveWebEelement.click();
		 	Thread.sleep(3000);
		 return true;
		 }
		 catch(Exception ex){
		 	return false;
		 }

		 } 	
		 
		 public boolean CheckImageMappingPopUp_CloseFunction()
		 {
		 try{

		 	WebElement CheckImageCloseWebEelement=new WebDriverWait(driver,100)
		 	.until(ExpectedConditions.visibilityOfElementLocated(CheckOnCloseBtn_xpath));
		 	CheckImageCloseWebEelement.click();
		 	Thread.sleep(3000);
		 return true;
		 }
		 catch(Exception ex){
		 	return false;
		 }

		 } 
		 
		 public boolean BatchFile_ImageLink()
		 {
		 try{

		 	WebElement ImageLinkWebEelement=new WebDriverWait(driver,100)
		 	.until(ExpectedConditions.visibilityOfElementLocated(BatchFilesImageLink_xpath));
		 	ImageLinkWebEelement.isDisplayed();
		 	Thread.sleep(2000);
		 return true;
		 }
		 catch(Exception ex){
		 	return false;
		 }

		 }	 

}
