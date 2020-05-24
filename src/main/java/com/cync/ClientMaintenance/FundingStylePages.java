package com.cync.ClientMaintenance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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

	
	
    
	
	
	
	public FundingStylePages(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public boolean AutoSweepingZLabel_FundingStyle()
	 {
	 try{

	 	WebElement AutoSweepingIconWebEelement=new WebDriverWait(driver,5)
	 	.until(ExpectedConditions.visibilityOfElementLocated(AutoSweepingIcon_xpath));
	 	AutoSweepingIconWebEelement.isDisplayed();
	 	////Thread.sleep(2000);
	 
	 	return true;
	 }
	 catch(Exception ex){
	 	return false;
	 }

	 } 
	

	public boolean MultipleFundingLabel_FundingStyle()
	 {
	 try{

	 	WebElement MultipleFundingIconWebEelement=new WebDriverWait(driver,5)
	 	.until(ExpectedConditions.visibilityOfElementLocated(MultipleFundingIcon_xpath));
	 	MultipleFundingIconWebEelement.isDisplayed();
	 	////Thread.sleep(2000);
	 
	 	return true;
	 }
	 catch(Exception ex){
	 	return false;
	 }

	 } 
	
	public boolean BatchCashTypeLabel_FundingStyle()
	 {
	 try{

	 	WebElement BatchCashTypeLabelWebEelement=new WebDriverWait(driver,5)
	 	.until(ExpectedConditions.visibilityOfElementLocated(BatchCashTypeLabel_xpath));
	 	BatchCashTypeLabelWebEelement.isDisplayed();
	 	////Thread.sleep(2000);
	 
	 	return true;
	 }
	 catch(Exception ex){
	 	return false;
	 }

	 } 
	
	public boolean EditLabel_FundingStyle()
	 {
	 try{

	 	WebElement EditLabelWebEelement=new WebDriverWait(driver,5)
	 	.until(ExpectedConditions.visibilityOfElementLocated(EditLabel_xpath));
	 	EditLabelWebEelement.isDisplayed();
	 	////Thread.sleep(2000);
	 
	 	return true;
	 }
	 catch(Exception ex){
	 	return false;
	 }

	 } 
	
	public boolean EditBtnClick_FundingStyle()
	 {
	 try{

	 	WebElement EditLabelWebEelement=new WebDriverWait(driver,5)
	 	.until(ExpectedConditions.visibilityOfElementLocated(EditLabel_xpath));
	 	EditLabelWebEelement.click();
	 	////Thread.sleep(2000);
	 
	 	return true;
	 }
	 catch(Exception ex){
	 	return false;
	 }

	 } 
	
public boolean AutoSweepingCheckBoxONifOff(boolean flag){
		 try {
			   WebDriverWait wait = new WebDriverWait(driver, 5);
			   ////Thread.sleep(6000);
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

		 	WebElement SaveButtonWebEelement=new WebDriverWait(driver,5)
		 	.until(ExpectedConditions.visibilityOfElementLocated(SaveButton_xpath));
		 	SaveButtonWebEelement.click();
		 	////Thread.sleep(2000);
		 
		 	return true;
		 }
		 catch(Exception ex){
		 	return false;
		 }

		 } 
		
		  public boolean clickElectornicSignature()
			{
			try{
				WebElement electonicSignatureWebEelement=new WebDriverWait(driver,5)
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
				WebElement AuthorizedSignNameWebEelement=new WebDriverWait(driver,5)
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
		   		WebElement AgreeCheckBoxWebEelement=new WebDriverWait(driver,5)
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
				
				WebElement AuthorizeSignatureandApproveBBCWebEelement=new WebDriverWait(driver,5)
					.until(ExpectedConditions.visibilityOfElementLocated(AuthorizeSignatureandApproveBBC_xpath));
				AuthorizeSignatureandApproveBBCWebEelement.click();
				return true;
			}
			catch(Exception ex){
				return false;
			}
			} 
		    
		    
		    public boolean clickOnCancelBtn()
			{
			try{
				
				WebElement CancelBtnWebEelement=new WebDriverWait(driver,5)
					.until(ExpectedConditions.visibilityOfElementLocated(CancelBtnWebEelement_xpath));
				CancelBtnWebEelement.click();
				return true;
			}
			catch(Exception ex){
				return false;
			}
			}     
		  

}
