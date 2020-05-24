package com.cync.pages;

import java.util.List;
import org.apache.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.cync.base.BasePage;

public class CreditLineLoanCreationPage extends BasePage{

	static Logger log = Logger.getLogger(CreditLineLoanCreationPage.class.getName());
		
	private final By breadcrumb_xpath=By.xpath("(//ul[@class='horizontal-li-list'])[1]");	
	private final By loanCreationTitle_xpath=By.xpath("//span[text()='Credit Line Loan Creation']");
	private final By newCreation_xpath=By.xpath("//a[text()='New']");
	private final By selectLoan_xpath=By.id("credit_loan_id");
	private final By saveLoanCreation_xpath=By.id("save_loan");
	private final By cancelCreation_xpath=By.id("reset_loan");
	private final By loanNo_xpath=By.id("credit_loan_loan_no");
	private final By loanNoMandatory_xpath=By.xpath("(//label[@class='label_mandatory'])[1]");
	private final By loanName_xpath=By.id("credit_loan_loan_name");
	private final By loanNameMandatory_xpath=By.xpath("(//label[@class='label_mandatory'])[2]");
	private final By participationParty_xpath=By.id("credit_loan_loan_party_id");
	private final By selectOriginalLoan_xpath=By.id("credit_loan_original_loan_id");
	private final By creditLimt_xpath=By.id("credit_loan_credit_limit");
	private final By creditLimitMandatory_xpath=By.xpath("(//label[@class='label_mandatory'])[3]");
	private final By minBalanceAmount_xpath=By.id("credit_loan_minimum_balance_amount");
	private final By interestRateCode_xpath=By.id("credit_loan_interest_rate_code_id");
	private final By interestRateMandatory_xpath=By.xpath("(//label[@class='label_mandatory'])[4]");
	private final By interestRateDate_xpath=By.id("credit_loan_interest_rate_date");
	private final By interestDateMandatory_xpath=By.xpath("(//label[@class='label_mandatory'])[5]");
	private final By interestRate_xpath=By.id("interest_rate");
	private final By interestRateValue=By.xpath("(//input[@value='0.00'])[3]");
	private final By rateAdjustment_xpath=By.id("credit_loan_rate_adjustment");
	private final By totalInterest_xpath=By.id("credit_loan_total_interest");
	private final By totalInterestValue_xpath=By.xpath("(//input[@value='0.00'])[5]");
	private final By minInterestRate_xpath=By.id("credit_loan_minimum_rate");
	private final By maxInterestRate_xpath=By.id("credit_loan_maximum_rate");
	private final By includeLoanBalancetoRes_xpath=By.id("credit_loan_include_loan_balance_to_reserve");
	private final By interestAddToBal_xpath=By.id("credit_loan_interest_add_to_balance");
	private final By saveSuccessMsg_xpath=By.xpath("//strong[text()='Credit Loan  was successfully created.']");
	private final By editCreditCreation_xpath=By.id("enable_loan");
	private final By updationMsg_xpath=By.xpath("//strong[text()='Credit Loan was successfully updated.']");
	private final By deleteCreditCreation_xpath=By.id("delete_loan");
	
	public CreditLineLoanCreationPage(WebDriver driver) {
			super(driver);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	public String breadCrumb(String creditLineCreatonBreadcrumb)
		{
			log.info("UI validation started on the screen for BreadcrumbVerify");
			try{
				Thread.sleep(3000);
				WebElement breadcrumbWebEelement=new WebDriverWait(driver,60).until(ExpectedConditions.visibilityOfElementLocated(breadcrumb_xpath));
				breadcrumbWebEelement.isDisplayed();
			}
			catch(Exception ex){
				
			}
			return creditLineCreatonBreadcrumb;

			}
		
	public boolean creditLoanCreationTitle(){
		log.info("Verfy creditLoanCreationTitle ");
			try{
				Thread.sleep(3000);
				WebElement creditLoanCreationTitleWebElement=new WebDriverWait(driver,60).until(ExpectedConditions.visibilityOfElementLocated(loanCreationTitle_xpath));
				creditLoanCreationTitleWebElement.isDisplayed();
				return true;
			
			}
			catch(Exception e){
				
			}
			return false;
			
			}
	
	public boolean newDisplayed(){
		log.info("Verfy new");
		try{
			Thread.sleep(3000);
			WebElement newWebElement=new WebDriverWait(driver,60).until(ExpectedConditions.visibilityOfElementLocated(newCreation_xpath));
			newWebElement.isDisplayed();
			return true;
		
		}
		catch(Exception e){
			
		}
		return false;
		
		}
	
	public boolean selectLoan(){
		log.info("Verify selectLoan");
		try{
			//Thread.sleep(3000);
			WebElement newWebElement=new WebDriverWait(driver,60).until(ExpectedConditions.visibilityOfElementLocated(selectLoan_xpath));
			newWebElement.isDisplayed();
			return true;
		
		}
		catch(Exception e){
			
		}
		return false;
		
		}
	
	public boolean clickOnNew(){
		log.info("Verify clickOnNew");
		try{
			Thread.sleep(3000);
			WebElement newWebElement=new WebDriverWait(driver,60).until(ExpectedConditions.visibilityOfElementLocated(newCreation_xpath));
			newWebElement.click();
			Thread.sleep(3000);
			return true;
		
		}
		catch(Exception e){
			
		}
		return false;
		
		}
	
	public boolean saveDispalyed(){
		log.info("Verify saveDispalyed");
		try{
			//Thread.sleep(3000);
			WebElement saveWebElement=new WebDriverWait(driver,60).until(ExpectedConditions.visibilityOfElementLocated(saveLoanCreation_xpath));
			saveWebElement.isDisplayed();
			return true;
		
		}
		catch(Exception e){
			
		}
		return false;
		
		}
	
	public boolean cancelDisplayed(){
		log.info("Verify cancelDisplayed");
		try{
			//Thread.sleep(3000);
			WebElement cancelWebElement=new WebDriverWait(driver,60).until(ExpectedConditions.visibilityOfElementLocated(cancelCreation_xpath));
			cancelWebElement.isDisplayed();
			return true;
		
		}
		catch(Exception e){
			
		}
		return false;
		
		}
	
	public boolean loanNoDisplayed(){
		log.info("Verify loanNoDisplayed");
		try{
			//Thread.sleep(3000);
			WebElement loanNoWebElement=new WebDriverWait(driver,60).until(ExpectedConditions.visibilityOfElementLocated(loanNo_xpath));
			loanNoWebElement.isDisplayed();
			return true;
		
		}
		catch(Exception e){
			
		}
		return false;
	}
	
	public boolean loanNoMandatoryDisplayed(){
		log.info("Verify loanNoMandatoryDisplayed");
		try{
			//Thread.sleep(3000);
			WebElement loanNoWebElement=new WebDriverWait(driver,60).until(ExpectedConditions.visibilityOfElementLocated(loanNoMandatory_xpath));
			loanNoWebElement.isDisplayed();
			return true;
		
		}
		catch(Exception e){
			
		}
		return false;
	}
	
	public boolean loanNameDisplayed(){
		log.info("Verify loanNameDisplayed");
		try{
			//Thread.sleep(3000);
			WebElement loanNameWebElement=new WebDriverWait(driver,60).until(ExpectedConditions.visibilityOfElementLocated(loanName_xpath));
			loanNameWebElement.isDisplayed();
			return true;
		
		}
		catch(Exception e){
			
		}
		return false;
	}
	
	public boolean loanNameMandatoryDisplayed(){
		log.info("Verify loanNameMandatoryDisplayed");
		try{
			//Thread.sleep(3000);
			WebElement loanNameWebElement=new WebDriverWait(driver,60).until(ExpectedConditions.visibilityOfElementLocated(loanNameMandatory_xpath));
			loanNameWebElement.isDisplayed();
			return true;
		
		}
		catch(Exception e){
			
		}
		return false;
	}
	
	public boolean participationPartyDisplay(){
		log.info("Verify participationPartyDisplay");
		try{
			//Thread.sleep(3000);
			WebElement particpationWebElement=new WebDriverWait(driver,60).until(ExpectedConditions.visibilityOfElementLocated(participationParty_xpath));
			particpationWebElement.isDisplayed();
			return true;
		
		}
		catch(Exception e){
			
		}
		return false;
	}
	
	public boolean selectOriginalLoanDisplay(){
		log.info("Verify selectOriginalLoanDisplay");
		try{
			//Thread.sleep(3000);
			WebElement selectLoanWebElement=new WebDriverWait(driver,60).until(ExpectedConditions.visibilityOfElementLocated(selectOriginalLoan_xpath));
			selectLoanWebElement.isDisplayed();
			return true;
		
		}
		catch(Exception e){
			
		}
		return false;
	}
	
	public boolean  verifyValuesUnderoriginalLoan(){
		 try {
				//Thread.sleep(10000);
		  String[] exp = {"Please Select","CR456:AUTOMATIONCREDIT_G"};
		  
		  WebElement dropdown = driver.findElement(selectOriginalLoan_xpath);  
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
	
	public boolean selectParticipationParty(String participationParty){
		try {
			 //Thread.sleep(4000);
			 WebElement SelectionWebElement=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(participationParty_xpath));		
				Select sel = new Select(SelectionWebElement);
				
				List<WebElement> list = sel.getOptions();	
				
				
				for(WebElement ele : list){
					
					if(ele.getText().equals(participationParty)){
						ele.click();
						 Thread.sleep(2000);					
						break;
					}
				}
				return true;
		} catch (Exception e) {

		}
				
			return false;
		}
	
	public boolean creditLimtDisplay(){
		log.info("Verify creditLimtDisplay");
		try{
			//Thread.sleep(3000);
			WebElement creditWebElement=new WebDriverWait(driver,60).until(ExpectedConditions.visibilityOfElementLocated(creditLimt_xpath));
			creditWebElement.isDisplayed();
			return true;
		
		}
		catch(Exception e){
			
		}
		return false;
	}
	
	public boolean creditLimitMandatoryDisplayed(){
		log.info("Verify creditLimitMandatoryDisplayed");
		try{
			//Thread.sleep(3000);
			WebElement creditLimitWebElement=new WebDriverWait(driver,60).until(ExpectedConditions.visibilityOfElementLocated(creditLimitMandatory_xpath));
			creditLimitWebElement.isDisplayed();
			return true;
		
		}
		catch(Exception e){
			
		}
		return false;
	}
	
	public boolean minBalanceAmountDisplayed(){
		log.info("Verify minBalanceAmountDisplayed");
		try{
			//Thread.sleep(3000);
			WebElement minBalWebElement=new WebDriverWait(driver,60).until(ExpectedConditions.visibilityOfElementLocated(minBalanceAmount_xpath));
			minBalWebElement.isDisplayed();
			return true;
		
		}
		catch(Exception e){
			
		}
		return false;
	}

	public boolean interestRateCodeDisplayed(){
		log.info("Verify interestRateCodeDisplayed");
		try{
			//Thread.sleep(3000);
			WebElement IntRateWebElement=new WebDriverWait(driver,60).until(ExpectedConditions.visibilityOfElementLocated(interestRateCode_xpath));
			IntRateWebElement.isDisplayed();
			return true;
		
		}
		catch(Exception e){
			
		}
		return false;
	}
	
	public boolean interestRateCodeMandtoryDisplayed(){
		log.info("Verify interestRateCodeMandtoryDisplayed");
		try{
			//Thread.sleep(3000);
			WebElement IntRateWebElement=new WebDriverWait(driver,60).until(ExpectedConditions.visibilityOfElementLocated(interestRateMandatory_xpath));
			IntRateWebElement.isDisplayed();
			return true;
		
		}
		catch(Exception e){
			
		}
		return false;
	}
	
	public boolean interestRateDateDisplayed(){
		log.info("Verify interestRateDateDisplayed");
		try{
			//Thread.sleep(3000);
			WebElement IntRateWebElement=new WebDriverWait(driver,60).until(ExpectedConditions.visibilityOfElementLocated(interestRateDate_xpath));
			IntRateWebElement.isDisplayed();
			return true;
		
		}
		catch(Exception e){
			
		}
		return false;
	}
	
	public boolean interestRateDateMandDisplayed(){
		log.info("Verify interestRateDateMandDisplayed");
		try{
			//Thread.sleep(3000);
			WebElement IntRateWebElement=new WebDriverWait(driver,60).until(ExpectedConditions.visibilityOfElementLocated(interestDateMandatory_xpath));
			IntRateWebElement.isDisplayed();
			return true;
		
		}
		catch(Exception e){
			
		}
		return false;
	}
	
	public boolean interestRateDisplayed(){
		log.info("Verify interestRateDisplayed");
		try{
			//Thread.sleep(3000);
			WebElement IntRateWebElement=new WebDriverWait(driver,60).until(ExpectedConditions.visibilityOfElementLocated(interestRate_xpath));
			IntRateWebElement.isDisplayed();
			return true;
		
		}
		catch(Exception e){
			
		}
		return false;
	}
	
	public boolean interestRateValue(){
		log.info("Verify interestRateValue");
		try{
			//Thread.sleep(3000);
			WebElement IntRateWebElement=new WebDriverWait(driver,60).until(ExpectedConditions.visibilityOfElementLocated(interestRateValue));
			IntRateWebElement.isDisplayed();
			return true;
		
		}
		catch(Exception e){
			
		}
		return false;
	}
	
	public boolean rateAdjustmentDisplay(){
		log.info("Verify rateAdjustmentDisplay");
		try{
			//Thread.sleep(3000);
			WebElement RateWebElement=new WebDriverWait(driver,60).until(ExpectedConditions.visibilityOfElementLocated(rateAdjustment_xpath));
			RateWebElement.isDisplayed();
			return true;
		
		}
		catch(Exception e){
			
		}
		return false;
	}
	
	public boolean totalInterestDisplay(){
		log.info("Verify totalInterestDisplay");
		try{
			//Thread.sleep(3000);
			WebElement totalIntWebElement=new WebDriverWait(driver,60).until(ExpectedConditions.visibilityOfElementLocated(totalInterest_xpath));
			totalIntWebElement.isDisplayed();
			return true;
		
		}
		catch(Exception e){
			
		}
		return false;
	}
	
	public boolean totalInterestValueDisplay(){
		log.info("Verify totalInterestValueDisplay");
		try{
			//Thread.sleep(3000);
			WebElement totalIntWebElement=new WebDriverWait(driver,60).until(ExpectedConditions.visibilityOfElementLocated(totalInterestValue_xpath));
			totalIntWebElement.isDisplayed();
			return true;
		
		}
		catch(Exception e){
			
		}
		return false;
	}
	
	public boolean minInterestRateDisplay(){
		log.info("Verify minInterestRateDisplay");
		try{
			//Thread.sleep(3000);
			WebElement minIntWebElement=new WebDriverWait(driver,60).until(ExpectedConditions.visibilityOfElementLocated(minInterestRate_xpath));
			minIntWebElement.isDisplayed();
			return true;
		
		}
		catch(Exception e){
			
		}
		return false;
	}
	
	public boolean maxInterestRateDisplay(){
		log.info("Verify maxInterestRateDisplay");
		try{
			//Thread.sleep(3000);
			WebElement maxIntWebElement=new WebDriverWait(driver,60).until(ExpectedConditions.visibilityOfElementLocated(maxInterestRate_xpath));
			maxIntWebElement.isDisplayed();
			return true;
		
		}
		catch(Exception e){
			
		}
		return false;
	}
	
	public boolean includeLoanBalanceIntoReserve(){
		log.info("Verify includeLoanBalanceIntoReserve");
		try{
			//Thread.sleep(3000);
			WebElement loanToResWebElement=new WebDriverWait(driver,60).until(ExpectedConditions.visibilityOfElementLocated(includeLoanBalancetoRes_xpath));
			loanToResWebElement.isDisplayed();
			return true;
		
		}
		catch(Exception e){
			
		}
		return false;
	}
	
	public boolean interestAddToBalance(){
		log.info("Verify interestAddToBalance");
		try{
			//Thread.sleep(3000);
			WebElement addToBalWebElement=new WebDriverWait(driver,60).until(ExpectedConditions.visibilityOfElementLocated(interestAddToBal_xpath));
			addToBalWebElement.isDisplayed();
			return true;
		
		}
		catch(Exception e){
			
		}
		return false;
	}
	
	public boolean passLoanNo(String loanNo){
		log.info("passLoanNo");
		try{
			//Thread.sleep(3000);
			WebElement loanNoWebElement=new WebDriverWait(driver,60).until(ExpectedConditions.visibilityOfElementLocated(loanNo_xpath));
			loanNoWebElement.click();
			loanNoWebElement.sendKeys(loanNo);
			return true;
			
		}
		catch(Exception e){
			
		}
		return false;
	}
	
	public boolean passLoanName(String loanName){
		log.info("passLoanName");
		try{
			//Thread.sleep(3000);
			WebElement loanNameWebElement=new WebDriverWait(driver,60).until(ExpectedConditions.visibilityOfElementLocated(loanName_xpath));
			loanNameWebElement.click();
			loanNameWebElement.sendKeys(loanName);	
			return true;
		}
		catch(Exception e){
			
		}
		return false;
	}
	
	public boolean passValueTocreditLimt(String creditLimit){
		log.info("Verify creditLimtDisplay");
		try{
			//Thread.sleep(3000);
			WebElement creditWebElement=new WebDriverWait(driver,60).until(ExpectedConditions.visibilityOfElementLocated(creditLimt_xpath));
			creditWebElement.clear();
			creditWebElement.sendKeys(creditLimit);
			return true;
		
		}
		catch(Exception e){
			
		}
		return false;
	}
	
	public boolean selectInterestCode(String interestRateCode){
		log.info("selectInterestCode");
		try {			
			 //Thread.sleep(4000);
			WebElement IntRateWebElement=new WebDriverWait(driver,60).until(ExpectedConditions.visibilityOfElementLocated(interestRateCode_xpath));	
				Select sel = new Select(IntRateWebElement);
				
				List<WebElement> list = sel.getOptions();	
				
				
				for(WebElement ele : list){
					
					if(ele.getText().equals(interestRateCode)){
						ele.click();
						 Thread.sleep(2000);					
						break;
					}
				}
				return true;
		} catch (Exception e) {

		}
				
			return false;
		}
	
	public boolean PassInterestRateDate(String RateDate){
		log.info("Verify PassInterestRateDate");
		try{
			//Thread.sleep(3000);
			WebElement IntRateWebElement=new WebDriverWait(driver,60).until(ExpectedConditions.visibilityOfElementLocated(interestRateDate_xpath));
			IntRateWebElement.clear();
			IntRateWebElement.sendKeys(RateDate);
			return true;
		
		}
		catch(Exception e){
			
		}
		return false;
	}
	
	public boolean clickOnSave(){
		log.info("Verify clickOnSave");
		try{
			//Thread.sleep(3000);
			WebElement saveWebElement=new WebDriverWait(driver,60).until(ExpectedConditions.visibilityOfElementLocated(saveLoanCreation_xpath));
			saveWebElement.click();
			Thread.sleep(1000);
			return true;
		
		}
		catch(Exception e){
			
		}
		return false;
		
		}
	
	public boolean successMsg(){
		log.info("Verify successMsg");
		try{
			//Thread.sleep(3000);
			WebElement msgWebElement=new WebDriverWait(driver,60).until(ExpectedConditions.visibilityOfElementLocated(saveSuccessMsg_xpath));
			msgWebElement.isDisplayed();
			return true;
		
		}
		catch(Exception e){
			
		}
		return false;
		
		}
	
	public boolean clickOnCancel(){
		log.info("Verify clickOnCancel");
		try{
			//Thread.sleep(3000);
			WebElement cancelWebElement=new WebDriverWait(driver,60).until(ExpectedConditions.visibilityOfElementLocated(cancelCreation_xpath));
			cancelWebElement.click();
			return true;
		
		}
		catch(Exception e){
			
		}
		return false;
		
		}
	
	public boolean selectLoanValue(String loan){
		log.info("selectLoan");
		try {			
			 //Thread.sleep(4000);
			WebElement newWebElement=new WebDriverWait(driver,60).until(ExpectedConditions.visibilityOfElementLocated(selectLoan_xpath));
				Select sel = new Select(newWebElement);
				
				List<WebElement> list = sel.getOptions();	
				
				
				for(WebElement ele : list){
					
					if(ele.getText().equals(loan)){
						ele.click();
						 Thread.sleep(2000);					
						break;
					}
				}
				return true;
		} catch (Exception e) {

		}
				
			return false;
		}
	
	public boolean clickOnEdit(){
		log.info("Verify clickOnEdit");
		try{
			//Thread.sleep(3000);
			WebElement editWebElement=new WebDriverWait(driver,60).until(ExpectedConditions.visibilityOfElementLocated(editCreditCreation_xpath));
			editWebElement.click();
			return true;
		
		}
		catch(Exception e){
			
		}
		return false;
		
		}
	
	
	public boolean verifyUpdationMsg(){
		log.info("Verify verifyUpdationMsg");
		try{
			//Thread.sleep(3000);
			WebElement updateWebElement=new WebDriverWait(driver,60).until(ExpectedConditions.visibilityOfElementLocated(updationMsg_xpath));
			updateWebElement.isDisplayed();
			return true;
		
		}
		catch(Exception e){
			
		}
		return false;
		
		}
	public boolean clickOnDelete(){
		log.info("Verify clickOnDelete");
		try{
			//Thread.sleep(3000);
			WebElement deleteWebElement=new WebDriverWait(driver,60).until(ExpectedConditions.visibilityOfElementLocated(deleteCreditCreation_xpath));
			deleteWebElement.click();
			
			Alert alertA = driver.switchTo().alert();	
			alertA.accept();	
			return true;
		
		}
		catch(Exception e){
			
		}
		return false;
		
		}
	
	
	
}
