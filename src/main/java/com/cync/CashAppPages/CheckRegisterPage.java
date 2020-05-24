package com.cync.CashAppPages;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.cync.base.BasePage;

public class CheckRegisterPage extends BasePage {
	
	private final By checkRegisterPageHeader_xpath = By.xpath("//span[contains(text(),'Check Register')]");
	private final By batchInfoLabel_xpath = By.xpath("//h2[text()='Batch Information']");
	private final By SearchBtn_xpath = By.id("search_check_register_button");
	private final By checkRegisterScreen_xpath = By.xpath("(//a[text()='Check Register'])[2]");
	private final By extBatchSelect_xpath = By.id("check_register_existing_batch_no");
	private final By extSelectBatch_xpath = By.xpath("(//select[@id='check_register_existing_batch_no']/option)[2]");
	private final By ClientHyperLink_xpath = By.xpath("(//a[@onclick='javascript:return false;'])[1]");
	private final By CheckInvoiceDistribution_xpath = By.xpath("(//li/a[contains(text(),'Check Invoice Distribution')])[1]");
	private final By AppliedInvoiceListPopUp_xpath = By.xpath("//h2[text()='Applied Invoice List']");
	
	private final By AppliedAmtInvoiceListPopUp_OP_xpath = By.xpath("(//td[contains(text(),'11,000.00')])[3]");

	
	private final By InvCurrentBalInvoiceListPopUp_xpath = By.xpath("(//td[@class='numRightAlign'])[8]");

	
	private final By InvCurrentBalInvoiceListPopUp_OP_xpath = By.xpath("(//td[contains(text(),'(1,000.00)')])[1]");

	
	private final By AppliedAmtInvoiceListPopUpClose_xpath = By.xpath("//button[@class='ui-dialog-titlebar-close']");
	private final By searchFromBatchDate_xpath = By.id("batch_batch_date_from");

	private final By CheckAmountOP_xpath = By.xpath("(//td[contains(@class,'numRightAlign')])[1]");

	private final By AppliedAmountOP_xpath = By.xpath("(//td[contains(@class,'numRightAlign')])[2]");
	private final By AdjustAmount_xpath = By.xpath("(//td[contains(@class,'numRightAlign')])[3]");

	private final By Status_xpath = By.xpath("(//td[contains(text(),'Balance')])[1]");
	private final By DebtorNum_xpath = By.xpath("(//tr[@class='row-odd'])[1]//td[2]");
	private final By DebtorName_xpath = By.xpath("(//tr[@class='row-odd'])[1]//td[3]");

	
	private final By AppliedAmtInvoiceListPopUp_xpath = By.xpath("(//td[contains(@class,'numRightAlign')])[5]");

	private final By InvCurrentBalHead_xpath = By.xpath("//th[text()='Invoice Current Balance']");
	private final By InvCurrentBal_OP_xpath = By.xpath("(//td[contains(@class,'numRightAlign')])[8]");

	private final By AdjustmentAmtHead_xpath = By.xpath("//th[text()='Adjustment Amount']");
	private final By AdjustmentAmtValue_xpath = By.xpath("(//td[contains(@class,'numRightAlign')])[6]");

	private final By AdjustmentReasonHead_xpath = By.xpath("//th[text()='Adjustment Reason']");
	private final By AdjustmentReasonValue_xpath = By.xpath("(//td[contains(@class,'numRightAlign')])[7]");

	

	public CheckRegisterPage(WebDriver driver) {
		super(driver);
		try{
			/*if(!driver.findElement(checkRegisterPageHeader_xpath).getText().trim().contains("Check Register")){
				throw new SkipException("Check Register page couldn't open.");
			
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
				.until(ExpectedConditions.visibilityOfElementLocated(checkRegisterPageHeader_xpath));
			HeaderWebEelement.getText();
			Thread.sleep(2000);
			
		}
		catch(Exception ex){
			
		}
		return Header;
		
		}  
	
	 public boolean BatchInfo_CheckRegister()
	 {
	 try{

	 	WebElement  BatchInfoWebEelement=new WebDriverWait(driver,100)
	 	.until(ExpectedConditions.visibilityOfElementLocated(batchInfoLabel_xpath));
	 	BatchInfoWebEelement.isDisplayed();
	 	
	 return true;
	 }
	 catch(Exception ex){
	 	return false;
	 }

	 }
	
	 public boolean SearchBtn_CheckRegister()
	 {
	 try{

	 	WebElement  SearchBtnWebEelement=new WebDriverWait(driver,100)
	 	.until(ExpectedConditions.visibilityOfElementLocated(SearchBtn_xpath));
	 	SearchBtnWebEelement.isDisplayed();
	 	
	 return true;
	 }
	 catch(Exception ex){
	 	return false;
	 }

	 }
	
	 public boolean CheckRegisterScreen()
	 {
	 try{

	 	WebElement CheckRegisterWebEelement=new WebDriverWait(driver,100)
	 	.until(ExpectedConditions.visibilityOfElementLocated(checkRegisterScreen_xpath));
	 	CheckRegisterWebEelement.click();
		Thread.sleep(10000);
	 	
	 return true;
	 }
	 catch(Exception ex){
	 	return false;
	 }

	 } 

	 public boolean CheckRegisterExtBatchClick()
	 {
	 try{

	 	WebElement extBatchWebEelement=new WebDriverWait(driver,100)
	 	.until(ExpectedConditions.visibilityOfElementLocated(extBatchSelect_xpath));
	 	extBatchWebEelement.click();

	 return true;
	 }
	 catch(Exception ex){
	 	return false;
	 }

	 }	
	 
	public boolean CheckRegisterExtBatchSelect()
		{
		try{

			WebElement extBatchSelectWebEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(extSelectBatch_xpath));
			extBatchSelectWebEelement.click();
			Thread.sleep(5000);


		return true;
		}
		catch(Exception ex){
			return false;
		}

		}	
	 
	 public boolean SearchBtnClick_CheckRegister()
	 {
	 try{

	 	WebElement SearchBtnWebEelement=new WebDriverWait(driver,100)
	 	.until(ExpectedConditions.visibilityOfElementLocated(SearchBtn_xpath));
	 	SearchBtnWebEelement.click();
		Thread.sleep(5000);
	 	
	 return true;
	 }
	 catch(Exception ex){
	 	return false;
	 }

	 }
	 
		public boolean CheckAmountValidation_OP(String expected) {
			try {
				WebElement CheckAmountWebElement = new WebDriverWait(driver, 100)
						.until(ExpectedConditions
								.visibilityOfElementLocated(CheckAmountOP_xpath));

				String actual = CheckAmountWebElement.getText();
				if (actual.equals(expected))
					return true;
				else
					return false;

			} catch (Exception e) {
				return false;
			}
		}
	 
		public boolean AppliedAmountValidation_OP(String expectedValue) {
			try {
				WebElement AppAmountWebElement = new WebDriverWait(driver, 100)
						.until(ExpectedConditions
								.visibilityOfElementLocated(AppliedAmountOP_xpath));

				String actual = AppAmountWebElement.getText();
				if (actual.equals(expectedValue))
					return true;
				else
					return false;

			} catch (Exception e) {
				return false;
			}
		}
	 
		public boolean AdjustAmountValidation_OP(String adjustValue) {
			try {
				WebElement AdjAmountWebElement = new WebDriverWait(driver, 100)
						.until(ExpectedConditions
								.visibilityOfElementLocated(AdjustAmount_xpath));

				String actual = AdjAmountWebElement.getText();
				if (actual.equals(adjustValue))
					return true;
				else
					return false;

			} catch (Exception e) {
				return false;
			}
		}
		
		
		public boolean StatusValidation(String status) {
			try {
				WebElement StatusWebElement = new WebDriverWait(driver, 100)
						.until(ExpectedConditions
								.visibilityOfElementLocated(Status_xpath));

				String actual = StatusWebElement.getText();
				if (actual.equals(status))
					return true;
				else
					return false;

			} catch (Exception e) {
				return false;
			}
		}
		
		
		
		public boolean DebtorNum(String DebtorNum) {
			try {
				WebElement DebtorNumWebElement = new WebDriverWait(driver, 100)
						.until(ExpectedConditions
								.visibilityOfElementLocated(DebtorNum_xpath));

				String actual = DebtorNumWebElement.getText();
				if (actual.equals(DebtorNum))
					return true;
				else
					return false;

			} catch (Exception e) {
				return false;
			}
		}
		
		public boolean DebtorName(String DebtorName) {
			try {
				WebElement DebtorNameWebElement = new WebDriverWait(driver, 100)
						.until(ExpectedConditions
								.visibilityOfElementLocated(DebtorName_xpath));

				String actual = DebtorNameWebElement.getText();
				if (actual.equals(DebtorName))
					return true;
				else
					return false;

			} catch (Exception e) {
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
	
	 public boolean ClientNameHyperLink_CheckRegister() { 
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
	 

	public boolean AppliedInvoiceListPopUp_CheckRegister(String ExpHead)
	 {
	 try{

	 	WebElement AppliedInvoiceListWebEelement=new WebDriverWait(driver,100)
	 	.until(ExpectedConditions.visibilityOfElementLocated(AppliedInvoiceListPopUp_xpath));
	 	String actual = AppliedInvoiceListWebEelement.getText();
		if (actual.equals(ExpHead))
			return true;
		else
			return false;

	} catch (Exception e) {
		return false;
	}
}
	
	public boolean AppliedAmountPopUp_CheckRegister_OP(String ExpValue)
	 {
	 try{

		 WebElement AppAmountWebElement = new WebDriverWait(driver, 100)
			.until(ExpectedConditions
					.visibilityOfElementLocated(InvCurrentBalHead_xpath));
		 AppAmountWebElement.isDisplayed();

		 
	 	WebElement AppliedAmtInvoiceListWebEelement=new WebDriverWait(driver,100)
	 	.until(ExpectedConditions.visibilityOfElementLocated(AppliedAmtInvoiceListPopUp_xpath));
	 	String actual = AppliedAmtInvoiceListWebEelement.getText();
		if (actual.equals(ExpValue))
			return true;
		else
			return false;

	} catch (Exception e) {
		return false;
	}
}
	
	
	public boolean AdjustmentAmountPopUp_CheckRegister_OP(String adjustmentValue)
	 {
	 try{

		 WebElement AppAmountWebElement = new WebDriverWait(driver, 100)
			.until(ExpectedConditions
					.visibilityOfElementLocated(AdjustmentAmtHead_xpath));
		 AppAmountWebElement.isDisplayed();

		 
	 	WebElement AppliedAmtInvoiceListWebEelement=new WebDriverWait(driver,100)
	 	.until(ExpectedConditions.visibilityOfElementLocated(AdjustmentAmtValue_xpath));
	 	String actual = AppliedAmtInvoiceListWebEelement.getText();
		if (actual.equals(adjustmentValue))
			return true;
		else
			return false;

	} catch (Exception e) {
		return false;
	}
}
	
	
	public boolean AdjustmentReasonPopUp_CheckRegister_OP(String adjustmentReason)
	 {
	 try{

		 WebElement AppAmountWebElement = new WebDriverWait(driver, 100)
			.until(ExpectedConditions
					.visibilityOfElementLocated(AdjustmentReasonHead_xpath));
		 AppAmountWebElement.isDisplayed();

		 
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
	
	
	
	public boolean AppliedAmountInvoiceListPopUp_CheckRegister_OP()
	 {
	 try{

	 	WebElement AppliedAmtInvoiceListWebEelement=new WebDriverWait(driver,100)
	 	.until(ExpectedConditions.visibilityOfElementLocated(AppliedAmtInvoiceListPopUp_OP_xpath));
	 	AppliedAmtInvoiceListWebEelement.isDisplayed();
	 	Thread.sleep(3000);
	 return true;
	 }
	 catch(Exception ex){
	 	return false;
	 }

	 } 
	
	
	public boolean InvoiceCurrentBalInvoiceListPopUp_CheckRegister()
	 {
	 try{

	 	WebElement invCurrentBalInvoiceListWebEelement=new WebDriverWait(driver,100)
	 	.until(ExpectedConditions.visibilityOfElementLocated(InvCurrentBalInvoiceListPopUp_xpath));
	 	invCurrentBalInvoiceListWebEelement.isDisplayed();
	 	Thread.sleep(3000);
	 return true;
	 }
	 catch(Exception ex){
	 	return false;
	 }

	 } 

	
	public boolean InvoiceCurrentBalInvoiceListPopUp_CheckRegister_OP(String ExValue)
	 {
	 try{

		 WebElement InvCurrentBalHeadWebElement = new WebDriverWait(driver, 100)
			.until(ExpectedConditions
					.visibilityOfElementLocated(InvCurrentBalHead_xpath));
		 InvCurrentBalHeadWebElement.isDisplayed();

		 
	 	WebElement InvCurrentBalWebEelement=new WebDriverWait(driver,100)
	 	.until(ExpectedConditions.visibilityOfElementLocated(InvCurrentBal_OP_xpath));
	 	String actual = InvCurrentBalWebEelement.getText();
		if (actual.equals(ExValue))
			return true;
		else
			return false;

	} catch (Exception e) {
		return false;
	}
}
	
	
	
	public boolean InvoiceCurrentBalInvoiceListPopUp_OP_CheckRegister()
	 {
	 try{

	 	WebElement invCurrentBalInvoiceListWebEelement=new WebDriverWait(driver,100)
	 	.until(ExpectedConditions.visibilityOfElementLocated(InvCurrentBalInvoiceListPopUp_OP_xpath));
	 	invCurrentBalInvoiceListWebEelement.isDisplayed();
	 	Thread.sleep(3000);
	 return true;
	 }
	 catch(Exception ex){
	 	return false;
	 }

	 } 
	
	
	public boolean AppliedInvoiceListPopUpClose_CheckRegister()
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

	
	public boolean SearchFromBatchDate_CheckRegister(){
		try {
			WebElement chkWebElement = new WebDriverWait(driver,
					100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(searchFromBatchDate_xpath));
			Date date = new Date(System.currentTimeMillis());
			SimpleDateFormat formatter = new SimpleDateFormat("mm:dd:yyyy");
			String today=formatter.format(date);
			chkWebElement.clear();
			chkWebElement.sendKeys(today);
			Thread.sleep(2000);
			
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	 




	
	
}
