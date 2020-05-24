package ClientMaintenancePages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.cync.base.BasePage;

public class FundingStylePages extends BasePage {

	private final By AutoSweepingIcon_xpath = By.xpath("//label[text()='Auto Sweeping']");
	private final By MultipleFundingIcon_xpath = By.xpath("//label[text()='Multiple Funding with Current BBC']");
	private final By BatchCashTypeLabel_xpath = By.xpath("//span[text()='Batch Cash Type']");
	private final By EditLabel_xpath = By.xpath("//a[@id='edit']");
	private final By AutoSweepingCheckBoxCheckBox_xpath = By.xpath("//input[@id='parameter_automatic_fund']");
	private final By SaveButton_xpath = By.xpath("//input[@id='save']");
    private final By electornicSignature_xpath=By.xpath("//a[contains(text(),'Electronic Signature')]");
    private final By AuthorizedSignName_xpath=By.xpath("//input[@id='signer_name']");
    private final By AgreeCheckBox_xpath=By.xpath("//input[@id='terms_condition']");
    private final By AuthorizeSignatureandApproveBBC_xpath=By.xpath("//button[contains(text(),'Authorize Signature and Approve BBC')]");
    private final By CancelBtnWebEelement_xpath=By.xpath("//button[text()='Cancel']");
    private final By MultipleFundingWithCurrentBBCONifOff_xpath=By.xpath("//input[@id='parameter_anytime_fund']");
    private final By FundingAmount_xpath=By.xpath("(//input[@class='fund_amount'])[1]");
    private final By selectFundSendBydropdown_xpath=By.xpath("(//select[contains(@name,'[fund_send_by]')])[1]");

    private final By selectClientDropDownFundRelease_xpath=By.xpath("//select[@id='selected_borrower_list']");

    private final By searchClick_xpath=By.xpath("//input[@value='Search']");
    private final By FundCheckBox_xpath=By.xpath("(//input[contains(@name,'[first_fund]')])[1]");
    private final By FundReleaseBBCSaveBtn_xpath=By.xpath("(//input[@class='view-button'])[2]");
    private final By successMsgFundReleaseBbc_xpath=By.xpath("//li[text()='Records have been saved successfully and moved into Funded / Archived section']");

    private final By approveBBCFundingCheckBox_xpath=By.xpath("//input[@type='checkbox' and @name='bbc_ids[]']");
    private final By approveButtonClick_xpath=By.xpath("//input[@id='Save']");
    private final By successMsgAfterApprovedBbc_xpath=By.xpath("//li[text()='The records has been saved successfully and moved into Move to Fund BBC section']");
    private final By BatchCashTypeDropDown_xpath=By.xpath("//select[@id='parameter_batch_cash_type']");
    private final By selectBatchCashTypefromdropdown_xpath=By.xpath("//select[@id='parameter_batch_cash_type']");
	private final By SaveButtonValidate_xpath = By.xpath("//input[@id='save']");

    
    
    		
	
	public FundingStylePages(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public boolean AutoSweepingZLabel_FundingStyle()
	 {
	 try{

	 	WebElement AutoSweepingIconWebEelement=new WebDriverWait(driver,100)
	 	.until(ExpectedConditions.visibilityOfElementLocated(AutoSweepingIcon_xpath));
	 	AutoSweepingIconWebEelement.isDisplayed();
	 	Thread.sleep(2000);
	 
	 	return true;
	 }
	 catch(Exception ex){
	 	return false;
	 }

	 } 
	

	public boolean MultipleFundingLabel_FundingStyle()
	 {
	 try{

	 	WebElement MultipleFundingIconWebEelement=new WebDriverWait(driver,100)
	 	.until(ExpectedConditions.visibilityOfElementLocated(MultipleFundingIcon_xpath));
	 	MultipleFundingIconWebEelement.isDisplayed();
	 	Thread.sleep(2000);
	 
	 	return true;
	 }
	 catch(Exception ex){
	 	return false;
	 }

	 } 
	
	public boolean BatchCashTypeLabel_FundingStyle()
	 {
	 try{

	 	WebElement BatchCashTypeLabelWebEelement=new WebDriverWait(driver,100)
	 	.until(ExpectedConditions.visibilityOfElementLocated(BatchCashTypeLabel_xpath));
	 	BatchCashTypeLabelWebEelement.isDisplayed();
	 	Thread.sleep(2000);
	 
	 	return true;
	 }
	 catch(Exception ex){
	 	return false;
	 }

	 } 
	
	public boolean EditLabel_FundingStyle()
	 {
	 try{

	 	WebElement EditLabelWebEelement=new WebDriverWait(driver,100)
	 	.until(ExpectedConditions.visibilityOfElementLocated(EditLabel_xpath));
	 	EditLabelWebEelement.isDisplayed();
	 	Thread.sleep(2000);
	 
	 	return true;
	 }
	 catch(Exception ex){
	 	return false;
	 }
	 } 
	
	public boolean EditBtnClick_FundingStyle()
	 {
	 try{

	 	WebElement EditLabelWebEelement=new WebDriverWait(driver,100)
	 	.until(ExpectedConditions.visibilityOfElementLocated(EditLabel_xpath));
	 	EditLabelWebEelement.click();
	 	Thread.sleep(2000);
	 
	 	return true;
	 }
	 catch(Exception ex){
	 	return false;
	 }

	 } 
	
public boolean AutoSweepingCheckBoxONifOff(boolean flag){
		 try {
			   WebDriverWait wait = new WebDriverWait(driver, 60);
			   Thread.sleep(6000);
			   wait.until(ExpectedConditions.visibilityOfElementLocated(( AutoSweepingCheckBoxCheckBox_xpath)));			   
			   WebElement element = driver.findElement((AutoSweepingCheckBoxCheckBox_xpath));
			   if(flag){
			    if(!element.isSelected() == true){
			     element.click();
			
			    }
			   }else if(!flag){
			    if(element.isSelected() == true){
			     element.click();
			    

			    }
			   }   
			  } catch (Exception e) {
			   System.out.println("Exception in clickOnCheckBox Method "+e.getCause());
			  }
		return flag; 
}
	
		public boolean SaveButton_FundingStyle()
		 {
		 try{

		 	WebElement SaveButtonWebEelement=new WebDriverWait(driver,100)
		 	.until(ExpectedConditions.visibilityOfElementLocated(SaveButton_xpath));
		 	SaveButtonWebEelement.click();
		 	Thread.sleep(2000);
		 
		 	return true;
		 }
		 catch(Exception ex){
		 	return false;
		 }

		 } 
		
		  public boolean clickElectornicSignature()
			{
			try{
				WebElement electonicSignatureWebEelement=new WebDriverWait(driver,30)
					.until(ExpectedConditions.visibilityOfElementLocated(electornicSignature_xpath));
				electonicSignatureWebEelement.click();
				return true;
			}
			catch(Exception ex){
				return false;
			}
			}
		  
		  public boolean enterDataAuthorizedSignName(String name)
			{
			try{
				WebElement AuthorizedSignNameWebEelement=new WebDriverWait(driver,30)
					.until(ExpectedConditions.visibilityOfElementLocated(AuthorizedSignName_xpath));
				AuthorizedSignNameWebEelement.sendKeys(name);
				return true;
			}
			catch(Exception ex){
				return false;
			}
			}
		
		    public boolean clickAgree()
		   	{
		   	try{
		   		WebElement AgreeCheckBoxWebEelement=new WebDriverWait(driver,30)
		   			.until(ExpectedConditions.visibilityOfElementLocated(AgreeCheckBox_xpath));
		   		AgreeCheckBoxWebEelement.click();
		   		return true;
		   	}
		   	catch(Exception ex){
		   		return false;
		   	}
		   	}  
		    
		    public boolean clickAuthorizeSignatureandApproveBBC()
			{
			try{
				
				WebElement AuthorizeSignatureandApproveBBCWebEelement=new WebDriverWait(driver,30)
					.until(ExpectedConditions.visibilityOfElementLocated(AuthorizeSignatureandApproveBBC_xpath));
				AuthorizeSignatureandApproveBBCWebEelement.click();
				Thread.sleep(7000);
				return true;
			}
			catch(Exception ex){
				return false;
			}
			} 
		    
		    
		    public boolean clickOnCancelBtn()
			{
			try{
				
				WebElement CancelBtnWebEelement=new WebDriverWait(driver,30)
					.until(ExpectedConditions.visibilityOfElementLocated(CancelBtnWebEelement_xpath));
				CancelBtnWebEelement.click();
				return true;
			}
			catch(Exception ex){
				return false;
			}
			}     
		  
		    
		    public boolean clickOnCancelBtn_Verify()
			{
			try{
				
				WebElement CancelBtnWebEelement=new WebDriverWait(driver,30)
					.until(ExpectedConditions.visibilityOfElementLocated(CancelBtnWebEelement_xpath));
				CancelBtnWebEelement.isDisplayed();
				return true;
			}
			catch(Exception ex){
				return false;
			}
			}     
		  
		    
		    public boolean MultipleFundingWithCurrentBBCONifOff(boolean flag){
				 try {
					   WebDriverWait wait = new WebDriverWait(driver, 60);
					   Thread.sleep(6000);
					   wait.until(ExpectedConditions.visibilityOfElementLocated((MultipleFundingWithCurrentBBCONifOff_xpath)));			   
					   WebElement element = driver.findElement((MultipleFundingWithCurrentBBCONifOff_xpath));
					   if(flag){
					    if(!element.isSelected() == true){
					     element.click();
					
					    }
					   }else if(!flag){
					    if(element.isSelected() == true){
					     element.click();
					    

					    }
					   }   
					  } catch (Exception e) {
					   System.out.println("Exception in clickOnCheckBox Method "+e.getCause());
					  }
				return flag; 
		}
		    
			
	public boolean FundReleaseBbc_FundingAmount(String FundingAmount)
			 {
			 try{
					WebElement FundReleaseBbcWebEelement=new WebDriverWait(driver,100)
				 	.until(ExpectedConditions.visibilityOfElementLocated(FundingAmount_xpath));
					FundReleaseBbcWebEelement.clear();
					FundReleaseBbcWebEelement.sendKeys(FundingAmount);
				
			 	return true;
			 }
			 catch(Exception ex){
			 	return false;
			 }

			 }
	
	 public String selectClientClick_FundRelease(String EnterclientName) {
			
		    try{
		    WebElement selectClientDropdownWebEelement=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(selectClientDropDownFundRelease_xpath)); 
		    
		    Select sel=new Select(selectClientDropdownWebEelement);
		    List<WebElement> list =sel.getOptions();
		    
		    for (WebElement ele:list){
			
			if(ele.getText().equals(EnterclientName))
			{
			ele.click();
			break;
			
		    }
		    }
		    
		    }
		    catch(Exception ex){
			 
			}

		return EnterclientName;
		
		
	} 
	
	 public boolean clickOnSearch_FundRelease(){
			
		   	try{
		   		WebElement searchWebEelement=new WebDriverWait(driver,10)
		   		.until(ExpectedConditions.visibilityOfElementLocated(searchClick_xpath));
		   		searchWebEelement.click();
		   		Thread.sleep(10000);
		   		return true;
		   	}
		   	catch(Exception ex){
		   		return false;
		   	}
		       }
	 
	
	 public String FundSendBydropdown(String FundSendBy) {
			
		    try{
		    WebElement FundSendByDropdownWebEelement=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(selectFundSendBydropdown_xpath)); 
		    
		    Select sel=new Select(FundSendByDropdownWebEelement);
		    List<WebElement> list =sel.getOptions();
		    
		    for (WebElement ele:list){
			
			if(ele.getText().equals(FundSendBy))
			{
			ele.click();
			break;
			
		    }
		    }
		    
		    }
		    catch(Exception ex){
			 
			}

		return FundSendBy;
		
		
	} 
	
			
	 public boolean clickOnFund_checkBox(){
			
		   	try{
		   		WebElement searchWebEelement=new WebDriverWait(driver,10)
		   		.until(ExpectedConditions.visibilityOfElementLocated(FundCheckBox_xpath));
		   		searchWebEelement.click();
		   		return true;
		   	}
		   	catch(Exception ex){
		   		return false;
		   	}
		       }
	 
	 
	 public boolean FundReleaseBBC_SaveBtn(){
			
		   	try{
		   		WebElement searchWebEelement=new WebDriverWait(driver,10)
		   		.until(ExpectedConditions.visibilityOfElementLocated(FundReleaseBBCSaveBtn_xpath));
		   		searchWebEelement.click();
		   		Thread.sleep(5000);
		   		return true;
		   	}
		   	catch(Exception ex){
		   		return false;
		   	}
		       }
	 
	 public boolean SuccessMsg_FundRelease(){
			
		   	try{
		   		WebElement searchWebEelement=new WebDriverWait(driver,10)
		   		.until(ExpectedConditions.visibilityOfElementLocated(successMsgFundReleaseBbc_xpath));
		   		searchWebEelement.isDisplayed();
		   	
		   		return true;
		   	}
		   	catch(Exception ex){
		   		return false;
		   	}
		       }
		    
	 public boolean SuccessMsg_AfterApproved(){
			
		   	try{
		   		WebElement searchWebEelement=new WebDriverWait(driver,10)
		   		.until(ExpectedConditions.visibilityOfElementLocated(successMsgAfterApprovedBbc_xpath));
		   		searchWebEelement.isDisplayed();
		   	
		   		return true;
		   	}
		   	catch(Exception ex){
		   		return false;
		   	}
		       }
	 
	 
	 public boolean approveBBCFundingCheckBox()
		{
		try{
			
			WebElement  approveBBCFundingCheckBoxWebEelement=new WebDriverWait(driver,30)
				.until(ExpectedConditions.visibilityOfElementLocated(approveBBCFundingCheckBox_xpath));
			approveBBCFundingCheckBoxWebEelement.click();
			return true;
		}
		catch(Exception ex){
			return false;
		}
		}
	 
	 public boolean approveButton_Click()
		{
		try{
			
			WebElement  approveBBCFundingCheckBoxWebEelement=new WebDriverWait(driver,30)
				.until(ExpectedConditions.visibilityOfElementLocated(approveButtonClick_xpath));
			approveBBCFundingCheckBoxWebEelement.click();
			Thread.sleep(5000);
			return true;
		}
		catch(Exception ex){
			return false;
		}
		}
	    
	 public boolean BatchCashTypeDropDown_Click(){
		 try {
		 String[] exp = {"Select","Bulk Collection","Collection by Debtor"};

		 WebElement dropdown = driver.findElement(BatchCashTypeDropDown_xpath); 
		 dropdown.click();
		 Select select = new Select(dropdown); 

		 List<WebElement> options = select.getOptions(); 
		 for(WebElement we:options) 
		 { 

		 boolean match = false;
		 for (int i=0; i<exp.length; i++){
		 if (we.getText().equals(exp[i])){
		 match = true;
		 System.out.println(we.getText());
		 }
		 }
		 Assert.assertTrue(match);
		 }
		 } catch (Exception e) {
		 // TODO: handle exception
		 return false;
		 }
		 return true;	
		 }	
	 
	 public String BatchCashType_select(String BatchCashTypeSelect) {
			
		    try{
		    WebElement FundSendByDropdownWebEelement=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(selectBatchCashTypefromdropdown_xpath)); 
		    
		    Select sel=new Select(FundSendByDropdownWebEelement);
		    List<WebElement> list =sel.getOptions();
		    
		    for (WebElement ele:list){
			
			if(ele.getText().equals(BatchCashTypeSelect))
			{
			ele.click();
			break;
			
		    }
		    }
		    
		    }
		    catch(Exception ex){
			 
			}

		return BatchCashTypeSelect;
		
	} 
	 
	 public boolean ProcessSummaryAgingCheckBoxONifOff(boolean flag){
		 try {
			   WebDriverWait wait = new WebDriverWait(driver, 60);
			   Thread.sleep(6000);
			   wait.until(ExpectedConditions.visibilityOfElementLocated(( AutoSweepingCheckBoxCheckBox_xpath)));			   
			   WebElement element = driver.findElement((AutoSweepingCheckBoxCheckBox_xpath));
			   if(flag){
			    if(!element.isSelected() == true){
			     element.click();
			
			    }
			   }else if(!flag){
			    if(element.isSelected() == true){
			     element.click();
			    

			    }
			   }   
			  } catch (Exception e) {
			   System.out.println("Exception in clickOnCheckBox Method "+e.getCause());
			  }
		return flag; 
}
	
	 

		public boolean SaveButtonValidate_FundingStyle()
		 {
		 try{

		 	WebElement SaveButtonWebEelement=new WebDriverWait(driver,100)
		 	.until(ExpectedConditions.visibilityOfElementLocated(SaveButton_xpath));
		 	SaveButtonWebEelement.isDisplayed();
		 
		 	return true;
		 }
		 catch(Exception ex){
		 	return false;
		 }

		 } 
	 
	 
}
