package com.cync.CashAppPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.cync.base.BasePage;

public class BatchProcessPage extends BasePage {
	
	private final By BatchProcessPageHeader_xpath = By.xpath("//span[text()='Batch Process']");
	private final By SelectAllBtn_xpath = By.id("select_all_batch_button");
	private final By UbSelectAllBtn_xpath = By.id("unselect_all_batch_button");
	private final By ProcessBtn_xpath = By.id("process_batch_button");
	private final By BatchNumHyperLink_xpath = By.xpath("(//a[@class='OnClick'])[1]");
	private final By CheckRegisterLink_xpath = By.xpath("(//a[contains(text(),'Check Registers')])[1]");
	private final By CheckRegisterPopup_xpath = By.xpath("//h2[text()='Check Register']");
	
	
	
	
	private final By CheckRegisterPopupStatus_xpath = By.xpath("//td[text()='Balance']");
	private final By CheckRegisterPopupClose_xpath = By.xpath("//button[@class='ui-dialog-titlebar-close']");
	private final By PostCheckBoxCheckOn_xpath = By.xpath("(//td//input[@type='checkbox'])[1]");
	private final By MsgInPopUp_xpath = By.xpath("//p[@class='pull-left']");
	private final By BatchNumPopUp_xpath = By.xpath("//span//strong[text()=' Batch No:']");
	private final By BatchDatePopUp_xpath = By.xpath("//span//strong[text()=' Batch Date:']");
	private final By BatchAmountPopUp_xpath = By.xpath("//span//strong[text()=' Batch Amount:']");
	private final By SourceTypePopUp_xpath = By.xpath("//span//strong[text()=' Source Type:']");
	private final By CashTypePopUp_xpath = By.xpath("//span//strong[text()='Cash Type:']");
	private final By cancelBtnVerifyPopUp_xpath = By.id("confirm_cancel");
	private final By ProcessBtnClick_xpath = By.id("confirm_process");
	private final By successMsgAfterProcess_xpath = By.xpath("//li[text()='Batch was successfully queued.']");
	private final By BatchProcessClick_xpath = By.xpath("(//a[text()='Batch Process'])[2]");

	private final By BatchAmount_OP_xpath = By.xpath("(//td[contains(@class,'numRightAlign')])[1]");
	private final By TotalChkDisAmt_OP_xpath = By.xpath("(//td[contains(@class,'numRightAlign')])[2]");
	private final By StatusWebEelement_OP_xpath = By.xpath("(//td[contains(text(),'Balanced.')])[1]");


	private final By BatchAmountData_xpath = By.xpath("//strong[contains(text(),'Batch Amount:')]");

	
	private final By CheckRegisterPopupAdjAmt_xpath = By.xpath("(//table[@class='table table-bordered  dataTable']//td[@class='numRightAlign'])[3]");
	private final By CheckRegisterPopupChkAmt_xpath = By.xpath("(//table[@class='table table-bordered  dataTable']//td[@class='numRightAlign'])[1]");
	private final By CheckRegisterPopupAppliedAmt_xpath = By.xpath("(//table[@class='table table-bordered  dataTable']//td[@class='numRightAlign'])[2]");
	private final By DebtorNumPopUp_xpath = By.xpath("//div[@class='ui-dialog ui-widget ui-widget-content ui-corner-all ui-front ui-draggable ui-resizable']//tbody//tr[1]//td[2]");
	private final By StatusPopUp_xpath = By.xpath("//td[text()='Balance']");

	
	
	
	public BatchProcessPage(WebDriver driver) {
		super(driver);
		try{
			/*if(!driver.findElement(BatchProcessPageHeader_xpath).getText().trim().contains("Batch Process")){
				throw new SkipException(" Batch Process page couldn't open.");
			
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
				.until(ExpectedConditions.visibilityOfElementLocated(BatchProcessPageHeader_xpath));
			HeaderWebEelement.getText();
			Thread.sleep(2000);
			
		}
		catch(Exception ex){
			
		}
		return Header;
		
		} 	
	
	 
		public boolean SelectAllBtn_BatchProcess()
		 {
		 try{

		 	WebElement SelectAllWebEelement=new WebDriverWait(driver,100)
		 	.until(ExpectedConditions.visibilityOfElementLocated(SelectAllBtn_xpath));
		 	SelectAllWebEelement.isDisplayed();
		 return true;
		 }
		 catch(Exception ex){
		 	return false;
		 }

		 } 
	 
		public boolean UnSelectAllBtn_BatchProcess()
		 {
		 try{

		 	WebElement UnSelectAllWebEelement=new WebDriverWait(driver,100)
		 	.until(ExpectedConditions.visibilityOfElementLocated(UbSelectAllBtn_xpath));
		 	UnSelectAllWebEelement.isDisplayed();
		 return true;
		 }
		 catch(Exception ex){
		 	return false;
		 }

		 } 

		public boolean ProcessBtn_BatchProcess()
		 {
		 try{

		 	WebElement ProcessBtn_BatchProcess=new WebDriverWait(driver,100)
		 	.until(ExpectedConditions.visibilityOfElementLocated(ProcessBtn_xpath));
		 	ProcessBtn_BatchProcess.isDisplayed();
		 return true;
		 }
		 catch(Exception ex){
		 	return false;
		 }

		 } 


		public boolean MouseOverOnBatchNumHyperLink() {
		    	try {
		    	    WebElement BatchNumWebE = new WebDriverWait(driver, 10)
		    		    .until(ExpectedConditions
		    			    .visibilityOfElementLocated(BatchNumHyperLink_xpath));
		    	    new Actions(driver).moveToElement(BatchNumWebE).perform();
		    	    return true;
		    	} catch (Exception ex) {
		    	    return false;
		    	}
		        }
		
		
		public boolean BatchAmount_BatchProcess_OP(String ExpValue)
		 {
		 try{
		 	WebElement BatchAmountWebElementWebEelement=new WebDriverWait(driver,100)
		 	.until(ExpectedConditions.visibilityOfElementLocated(BatchAmount_OP_xpath));
		 	String actual = BatchAmountWebElementWebEelement.getText();
			if (actual.equals(ExpValue))
				return true;
			else
				return false;

		} catch (Exception e) {
			return false;
		}
	}
		
		public boolean TotalChkDisAmt_BatchProcess_OP(String ExpValueT)
		 {
		 try{
		 	WebElement DisAmtWebEelement=new WebDriverWait(driver,100)
		 	.until(ExpectedConditions.visibilityOfElementLocated(TotalChkDisAmt_OP_xpath));
		 	String actual = DisAmtWebEelement.getText();
			if (actual.equals(ExpValueT))
				return true;
			else
				return false;

		} catch (Exception e) {
			return false;
		}
	}
		
		
		public boolean Status_BatchProcess_OP(String ExpValueS)
		 {
		 try{
		 	WebElement StatusWebEelement=new WebDriverWait(driver,100)
		 	.until(ExpectedConditions.visibilityOfElementLocated(StatusWebEelement_OP_xpath));
		 	String actual = StatusWebEelement.getText();
			if (actual.equals(ExpValueS))
				return true;
			else
				return false;

		} catch (Exception e) {
			return false;
		}
	}
		
		
		
		
		
		 public boolean BatchNumHyperLink_BatchProcess() { 
	         try {     
	         this.MouseOverOnBatchNumHyperLink();        
	         WebElement CheckRegistersWebEelement = new WebDriverWait(driver, 1000)      
	         .until(ExpectedConditions.elementToBeClickable(CheckRegisterLink_xpath));     
	         CheckRegistersWebEelement.click();     
	         Thread.sleep(5000);
	         return true;
	         }
	         
	         catch (Exception ex) {     
	         return false; 
	         }
	         
	         }
		
		/*	public boolean CheckRegisterPopUp_BatchProcess()
			 {
			 try{

			 	WebElement CheckRegister_BatchProcess=new WebDriverWait(driver,100)
			 	.until(ExpectedConditions.visibilityOfElementLocated(CheckRegisterPopup_xpath));
			 	CheckRegister_BatchProcess.isDisplayed();
			 return true;
			 }
			 catch(Exception ex){
			 	return false;
			 }

			 } */
			
			
			public boolean CheckRegisterPopUp_BatchProcess(String expected) {
				try {
					WebElement CheckRegisterWebElement = new WebDriverWait(driver, 100)
							.until(ExpectedConditions
									.visibilityOfElementLocated(CheckRegisterPopup_xpath));

					String actual = CheckRegisterWebElement.getText();
					if (actual.equals(expected))
						return true;
					else
						return false;

				} catch (Exception e) {
					return false;
				}
			}
			
			public boolean CheckRegisterPopUpCheckAmt_BatchProcess(String ChkAmt) {
				try {
					WebElement CheckRegisterPopUpChkAmtWebElement = new WebDriverWait(driver, 100)
							.until(ExpectedConditions
									.visibilityOfElementLocated(CheckRegisterPopupChkAmt_xpath));

					String actual = CheckRegisterPopUpChkAmtWebElement.getText();
					if (actual.equals(ChkAmt))
						return true;
					else
						return false;

				} catch (Exception e) {
					return false;
				}
			}
			
			
			public boolean CheckRegisterPopUpAppliedAmt_BatchProcess(String AppliedAmt) {
				try {
					WebElement CheckRegisterPopUpAppliedAmtWebElement = new WebDriverWait(driver, 100)
							.until(ExpectedConditions
									.visibilityOfElementLocated(CheckRegisterPopupAppliedAmt_xpath));

					String actual = CheckRegisterPopUpAppliedAmtWebElement.getText();
					if (actual.equals(AppliedAmt))
						return true;
					else
						return false;

				} catch (Exception e) {
					return false;
				}
			}
			
			
			
			public boolean CheckRegisterPopUpAdjAmt_BatchProcess(String AdjAmt) {
				try {
					WebElement CheckRegisterPopUpAdjAmtWebElement = new WebDriverWait(driver, 100)
							.until(ExpectedConditions
									.visibilityOfElementLocated(CheckRegisterPopupAdjAmt_xpath));

					String actual = CheckRegisterPopUpAdjAmtWebElement.getText();
					if (actual.equals(AdjAmt))
						return true;
					else
						return false;

				} catch (Exception e) {
					return false;
				}
			}
	
			
			public boolean CheckRegisterPopUpStatus_BatchProcess_OP(String expecte) {
				try {
					WebElement CheckRegisterPopUpStatusWebElement = new WebDriverWait(driver, 100)
							.until(ExpectedConditions
									.visibilityOfElementLocated(CheckRegisterPopupStatus_xpath));

					String actual = CheckRegisterPopUpStatusWebElement.getText();
					if (actual.equals(expecte))
						return true;
					else
						return false;

				} catch (Exception e) {
					return false;
				}
			}
			
			
			
			
		 
			public boolean CheckRegisterPopUpStatus_BatchProcess()
			 {
			 try{

			 	WebElement CheckRegisterStatus_BatchProcess=new WebDriverWait(driver,100)
			 	.until(ExpectedConditions.visibilityOfElementLocated(CheckRegisterPopupStatus_xpath));
			 	CheckRegisterStatus_BatchProcess.isDisplayed();
			 return true;
			 }
			 catch(Exception ex){
			 	return false;
			 }

			 } 
		 
			public boolean CheckRegisterPopUpClose_BatchProcess()
			 {
			 try{

			 	WebElement CheckRegisterPopUpClose_BatchProcess=new WebDriverWait(driver,100)
			 	.until(ExpectedConditions.visibilityOfElementLocated(CheckRegisterPopupClose_xpath));
			 	CheckRegisterPopUpClose_BatchProcess.click();
		         Thread.sleep(3000);

			 return true;
			 }
			 catch(Exception ex){
			 	return false;
			 }

			 } 
			
			public boolean PostCheckBoxCheckOn_BatchProcess()
			 {
			 try{

			 	WebElement PostCheckBoxCheckOnWE_BatchProcess=new WebDriverWait(driver,100)
			 	.until(ExpectedConditions.visibilityOfElementLocated(PostCheckBoxCheckOn_xpath));
			 	
			 	
			 	PostCheckBoxCheckOnWE_BatchProcess.click();
		         Thread.sleep(3000);

			 return true;
			 }
			 catch(Exception ex){
			 	return false;
			 }

			 } 
			
			
			public boolean ProcessBtnFunction_BatchProcess()
			 {
			 try{

			 	WebElement ProcessBtn_BatchProcess=new WebDriverWait(driver,100)
			 	.until(ExpectedConditions.visibilityOfElementLocated(ProcessBtn_xpath));
			 	ProcessBtn_BatchProcess.click();
			 	 Thread.sleep(10000);
			 return true;
			 }
			 catch(Exception ex){
			 	return false;
			 }

			 } 
			
			public boolean ProcessBtnClick_BatchProcess()
			 {
			 try{

			 	WebElement ProcessBtnClick_BatchProcess=new WebDriverWait(driver,100)
			 	.until(ExpectedConditions.visibilityOfElementLocated(MsgInPopUp_xpath));
			 	ProcessBtnClick_BatchProcess.isDisplayed();
			 	 Thread.sleep(10000);
			 return true;
			 }
			 catch(Exception ex){
			 	return false;
			 }

			 } 
		 
			
			public boolean BatchAmountData_BatchProcess_OP(String expectBatch) {
				try {
					WebElement BatchAmountDataWebElement = new WebDriverWait(driver, 100)
							.until(ExpectedConditions
									.visibilityOfElementLocated(BatchAmountData_xpath));

					String actual = BatchAmountDataWebElement.getText();
					if (actual.equals(expectBatch))
						return true;
					else
						return false;

				} catch (Exception e) {
					return false;
				}
			}
			
			
			public boolean ProcessBtnClickBatchNum_BatchProcess(String BatchNo)
			 {
			 try{

			 	WebElement ProcessBtnClick_BatchProcess=new WebDriverWait(driver,100)
			 	.until(ExpectedConditions.visibilityOfElementLocated(BatchNumPopUp_xpath));
				String actual = ProcessBtnClick_BatchProcess.getText();
				if (actual.equals(BatchNo))
					return true;
				else
					return false;

			} catch (Exception e) {
				return false;
			}
		}
			
			public boolean ProcessBtnClickBatchdate_BatchProcess(String BatchDate)
			 {
			 try{

			 	WebElement ProcessBtnClick_BatchProcess=new WebDriverWait(driver,100)
			 	.until(ExpectedConditions.visibilityOfElementLocated(BatchDatePopUp_xpath));
			 	String actual = ProcessBtnClick_BatchProcess.getText();
				if (actual.equals(BatchDate))
					return true;
				else
					return false;

			} catch (Exception e) {
				return false;
			}
		}
		
			public boolean ProcessBtnClickBatchAmount_BatchProcess(String BatchAmount)
			 {
			 try{

			 	WebElement ProcessBtnClick_BatchProcess=new WebDriverWait(driver,100)
			 	.until(ExpectedConditions.visibilityOfElementLocated(BatchAmountPopUp_xpath));
			 	String actual = ProcessBtnClick_BatchProcess.getText();
				if (actual.equals(BatchAmount))
					return true;
				else
					return false;

			} catch (Exception e) {
				return false;
			}
		}
			
			public boolean ProcessBtnClickSourceType_BatchProcess(String SourceType)
			 {
			 try{

			 	WebElement ProcessBtnClick_BatchProcess=new WebDriverWait(driver,100)
			 	.until(ExpectedConditions.visibilityOfElementLocated(SourceTypePopUp_xpath));
			 	String actual = ProcessBtnClick_BatchProcess.getText();
				if (actual.equals(SourceType))
					return true;
				else
					return false;

			} catch (Exception e) {
				return false;
			}
		}
			
			public boolean ProcessBtnClickCashType_BatchProcess(String CashType)
			 {
			 try{

			 	WebElement ProcessBtnClick_BatchProcess=new WebDriverWait(driver,100)
			 	.until(ExpectedConditions.visibilityOfElementLocated(CashTypePopUp_xpath));
			 	String actual = ProcessBtnClick_BatchProcess.getText();
				if (actual.equals(CashType))
					return true;
				else
					return false;

			} catch (Exception e) {
				return false;
			}
		}
			
			public boolean ProcessBtnClickCancelBtnVerify_BatchProcess()
			 {
			 try{

			 	WebElement ProcessBtnClick_BatchProcess=new WebDriverWait(driver,100)
			 	.until(ExpectedConditions.visibilityOfElementLocated(cancelBtnVerifyPopUp_xpath));
			 	ProcessBtnClick_BatchProcess.isDisplayed();
			 	 Thread.sleep(2000);
			 return true;
			 }
			 catch(Exception ex){
			 	return false;
			 }

			 }
			
			
			public boolean ProcessBtnClickDebtorNum_BatchProcess(String DbNum)
			 {
			 try{

			 	WebElement ProcessBtnClickDbNum_BatchProcess=new WebDriverWait(driver,100)
			 	.until(ExpectedConditions.visibilityOfElementLocated(DebtorNumPopUp_xpath));
			 	String actual = ProcessBtnClickDbNum_BatchProcess.getText();
				if (actual.equals(DbNum))
					return true;
				else
					return false;

			} catch (Exception e) {
				return false;
			}
		}
			
			public boolean ProcessBtnClickChkAmt_BatchProcess(String ChkAmtt)
			 {
			 try{

			 	WebElement ProcessBtnClickChkAmt_BatchProcess=new WebDriverWait(driver,100)
			 	.until(ExpectedConditions.visibilityOfElementLocated(CheckRegisterPopupChkAmt_xpath));
			 	String actual = ProcessBtnClickChkAmt_BatchProcess.getText();
				if (actual.equals(ChkAmtt))
					return true;
				else
					return false;

			} catch (Exception e) {
				return false;
			}
		}
				
			
			public boolean ProcessBtnClickAppliedAmt_BatchProcess(String ApplyAmt)
			 {
			 try{

			 	WebElement ProcessBtnClickAppliedAmt_BatchProcess=new WebDriverWait(driver,100)
			 	.until(ExpectedConditions.visibilityOfElementLocated(CheckRegisterPopupAppliedAmt_xpath));
			 	String actual = ProcessBtnClickAppliedAmt_BatchProcess.getText();
				if (actual.equals(ApplyAmt))
					return true;
				else
					return false;

			} catch (Exception e) {
				return false;
			}
		}
			
			public boolean ProcessBtnClickAdjustAmt_BatchProcess(String AdjustAmt)
			 {
			 try{

			 	WebElement ProcessBtnClickAppliedAmt_BatchProcess=new WebDriverWait(driver,100)
			 	.until(ExpectedConditions.visibilityOfElementLocated(CheckRegisterPopupAdjAmt_xpath));
			 	String actual = ProcessBtnClickAppliedAmt_BatchProcess.getText();
				if (actual.equals(AdjustAmt))
					return true;
				else
					return false;

			} catch (Exception e) {
				return false;
			}
		}
			
			public boolean ProcessBtnClickStatus_BatchProcess(String Status)
			 {
			 try{

			 	WebElement ProcessBtnClickStatus_BatchProcess=new WebDriverWait(driver,100)
			 	.until(ExpectedConditions.visibilityOfElementLocated(StatusPopUp_xpath));
			 	String actual = ProcessBtnClickStatus_BatchProcess.getText();
				if (actual.equals(Status))
					return true;
				else
					return false;

			} catch (Exception e) {
				return false;
			}
		}
			
			
			public boolean ClickOnProcessBtn_BatchProcess()
			 {
			 try{

			 	WebElement ProcessBtnClick_BatchProcess=new WebDriverWait(driver,100)
			 	.until(ExpectedConditions.visibilityOfElementLocated(ProcessBtnClick_xpath));
			 	ProcessBtnClick_BatchProcess.click();
			 	 Thread.sleep(30000);
			 return true;
			 }
			 catch(Exception ex){
			 	return false;
			 }

			 }
		
			
			
			
		/*	public boolean SuccessMsgAfterProcess_BatchProcess()
			 {
			 try{

			 	WebElement ProcessBtnClick_BatchProcess=new WebDriverWait(driver,100)
			 	.until(ExpectedConditions.visibilityOfElementLocated(successMsgAfterProcess_xpath));
			 	ProcessBtnClick_BatchProcess.isDisplayed();
			 	 Thread.sleep(5000);
			 return true;
			 }
			 catch(Exception ex){
			 	return false;
			 }

			 }*/
			
			public boolean SuccessMsgAfterProcess_BatchProcess(String expectMsg) {
				try {
					WebElement MsgWebElement = new WebDriverWait(driver, 100)
							.until(ExpectedConditions
									.visibilityOfElementLocated(successMsgAfterProcess_xpath));

					String actual = MsgWebElement.getText();
					if (actual.equals(expectMsg))
						return true;
					else
						return false;

				} catch (Exception e) {
					return false;
				}
			}
			
			
			public boolean BatchProcessScreenClick()
			 {
			 try{

			 	WebElement ProcessBtnClick_BatchProcess=new WebDriverWait(driver,100)
			 	.until(ExpectedConditions.visibilityOfElementLocated(BatchProcessClick_xpath));
			 	ProcessBtnClick_BatchProcess.click();
			 	 Thread.sleep(10000);
			 return true;
			 }
			 catch(Exception ex){
			 	return false;
			 }

			 }
			
}

