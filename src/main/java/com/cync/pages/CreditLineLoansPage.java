package com.cync.pages;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.cync.base.BasePage;

public class CreditLineLoansPage extends BasePage{

	static Logger log = Logger.getLogger(CreditLineLoansPage.class.getName()); 
	private final By breadcrumb_xpath=By.xpath("(//ul[@class='horizontal-li-list'])[1]");
	private final By pageheader_xpath=By.xpath("//span[text()='Credit Line Loans']");
	private final By selectLoan_xpath=By.id("credit_loan_id");
	private final By disabledParticipationParty_xpath=By.xpath("//select[@id='credit_loan_loan_party_id' and @disabled='disabled']/option[1]");
	private final By creditLimt_xpath=By.id("credit_loan_credit_limit");
	private final By collateralMandatory_xpath=By.xpath("//label[@class='control-label required']");
	private final By fromDateField_xpath=By.id("date_from_recalculate");
	private final By reapplyCharges=By.id("reapply_charges");
	private final By dateLabel_xpath=By.id("jqgh_credit_line_loans_list_activity_date");
	private final By creditLineHeader_xpath=By.xpath("//h2[text()='Credit Line Loans']");
	private final By chargeCode_xpath=By.id("jqgh_credit_line_loans_list_credit_line_charge_template_id");
	private final By amount_xpath=By.id("jqgh_credit_line_loans_list_charge_amount");
	private final By floatDays_xpath=By.id("jqgh_credit_line_loans_list_float_days");
	private final By floatInterest_xpath=By.id("credit_line_loans_list_float_amount");
	private final By closingBalalnce_xpath=By.id("jqgh_credit_line_loans_list_closing_balance");
	private final By add_xpath=By.xpath("//span[@class='ui-icon ui-icon ui-icon-plus']");
	private final By save_xpath=By.xpath("//span[@class='ui-icon ui-icon ui-icon-disk']");
	private final By amountEdit_xpath=By.xpath("//td[@aria-describedby='credit_line_loans_list_charge_amount']");
	private final By amountEditField_xpath=By.xpath("(//input[@name='charge_amount'])[2]");
	private final By cancel_xpath=By.xpath("//span[@class='ui-icon ui-icon ui-icon-cancel']");
	private final By checkBox_xpath=By.xpath("(//input[@type='checkbox'])[5]");
	private final By delete_xpath=By.xpath("//span[@class='ui-icon ui-icon-trash']");
	private final By deleteIcon_xpath=By.id("dData");
	
	public CreditLineLoansPage(WebDriver driver) {
		super(driver);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public String breadCrumb(String creditLineLoanBreadcrumb)
	{
		log.info("UI validation started on the screen for BreadcrumbVerify");
		try{
			Thread.sleep(3000);
			WebElement breadcrumbWebEelement=new WebDriverWait(driver,60).until(ExpectedConditions.visibilityOfElementLocated(breadcrumb_xpath));
			breadcrumbWebEelement.isDisplayed();
		}
		catch(Exception ex){
			
		}
		return creditLineLoanBreadcrumb;

		}
	
	public boolean creditLineLoanTitle(){
		log.info("Verfy creditLineLoanTitle ");
			try{
				Thread.sleep(3000);
				WebElement creditLineLoanTitleWebElement=new WebDriverWait(driver,60).until(ExpectedConditions.visibilityOfElementLocated(pageheader_xpath));
				creditLineLoanTitleWebElement.isDisplayed();
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
			WebElement selectLoantWebElement=new WebDriverWait(driver,60).until(ExpectedConditions.visibilityOfElementLocated(selectLoan_xpath));
			selectLoantWebElement.isDisplayed();
			return true;
		
		}
		catch(Exception e){
			
		}
		return false;
		
		}
	public boolean disabledParticipationParty(String expectedParticipationParty){
		log.info("Verify disabledParticipationParty");
		try{
			//Thread.sleep(3000);
			WebElement participationPartyWebElement=new WebDriverWait(driver,60).until(ExpectedConditions.visibilityOfElementLocated(disabledParticipationParty_xpath));
			String actual=participationPartyWebElement.getText();
			System.out.println(actual);
			if (actual.equals(expectedParticipationParty)) {
				return true;
			}else
			return false;
		}
		catch(Exception e){
			
		}
		return false;
		
		}
	
	public boolean enteredCreditLimit(String expectedCreditLimit){
		log.info("Verify enteredCreditLimit");
		try{
			//Thread.sleep(3000);
			WebElement creditWebElement=new WebDriverWait(driver,60).until(ExpectedConditions.visibilityOfElementLocated(creditLimt_xpath));
			String actual=creditWebElement.getAttribute("value");
			System.out.println(actual);
			if (actual.equals(expectedCreditLimit)) {
				return true;
			}else
			return false;
		
		}
		catch(Exception e){
			
		}
		return false;
		
		}
	
	public boolean collateralMandatory(){
		log.info("Verfy collateralMandatory ");
			try{
				//Thread.sleep(3000);
				WebElement collateralMandWebElement=new WebDriverWait(driver,60).until(ExpectedConditions.visibilityOfElementLocated(collateralMandatory_xpath));
				collateralMandWebElement.isDisplayed();
				return true;
			
			}
			catch(Exception e){
				
			}
			return false;
			
			}
	
	public boolean fromDateField(){
		log.info("Verfy fromDateField ");
			try{
				//Thread.sleep(3000);
				WebElement fromDateWebElement=new WebDriverWait(driver,60).until(ExpectedConditions.visibilityOfElementLocated(fromDateField_xpath));
				fromDateWebElement.isDisplayed();
				return true;
			
			}
			catch(Exception e){
				
			}
			return false;
			
			}
	
	public boolean PassfromDate(String fromDate){
		log.info("Verfy PassfromDate ");
			try{
				//Thread.sleep(3000);
				WebElement fromDateWebElement=new WebDriverWait(driver,60).until(ExpectedConditions.visibilityOfElementLocated(fromDateField_xpath));
				fromDateWebElement.clear();
				fromDateWebElement.sendKeys(fromDate);
				return true;
			
			}
			catch(Exception e){
				
			}
			return false;
			
			}
	public boolean reapplychargesDisplay(){
		log.info("Verfy reapplychargesDisplay ");
			try{
				//Thread.sleep(3000);
				WebElement reapplyWebElement=new WebDriverWait(driver,60).until(ExpectedConditions.visibilityOfElementLocated(reapplyCharges));
				reapplyWebElement.isDisplayed();
				return true;
			
			}
			catch(Exception e){
				
			}
			return false;
			
			}
	
	public boolean DateDisplay(){
		log.info("Verfy DateDisplay ");
			try{
				//Thread.sleep(3000);
				WebElement dateWebElement=new WebDriverWait(driver,60).until(ExpectedConditions.visibilityOfElementLocated(dateLabel_xpath));
				dateWebElement.isDisplayed();
				return true;
			
			}
			catch(Exception e){
				
			}
			return false;
			
			}
	
	public boolean creditLineLoanDisplay(){
		log.info("Verfy creditLineLoanisplay ");
			try{
				//Thread.sleep(3000);
				WebElement creditLineWebElement=new WebDriverWait(driver,60).until(ExpectedConditions.visibilityOfElementLocated(creditLineHeader_xpath));
				creditLineWebElement.isDisplayed();
				return true;		
			}
			catch(Exception e){
				
			}
			return false;
			
			}
	public boolean chargeCodeDisplay(){
		log.info("Verfy chargeCodeDisplay");
			try{
				//Thread.sleep(3000);
				WebElement chargeCodeWebElement=new WebDriverWait(driver,60).until(ExpectedConditions.visibilityOfElementLocated(chargeCode_xpath));
				chargeCodeWebElement.isDisplayed();
				return true;
			
			}
			catch(Exception e){
				
			}
			return false;
			
			}
	
	public boolean amountDisplay(){
		log.info("Verfy amountDisplay");
			try{
				//Thread.sleep(3000);
				WebElement amountWebElement=new WebDriverWait(driver,60).until(ExpectedConditions.visibilityOfElementLocated(amount_xpath));
				amountWebElement.isDisplayed();
				return true;
			
			}
			catch(Exception e){
				
			}
			return false;
			
			}
	
	public boolean floatDaysDisplay(){
		log.info("Verfy floatDaysDisplay");
			try{
				//Thread.sleep(3000);
				WebElement floatDaysWebElement=new WebDriverWait(driver,60).until(ExpectedConditions.visibilityOfElementLocated(floatDays_xpath));
				floatDaysWebElement.isDisplayed();
				return true;
			
			}
			catch(Exception e){
				
			}
			return false;
			
			}
	public boolean floatInterestDisplay(){
		log.info("Verfy floatInterestDisplay");
			try{
				//Thread.sleep(3000);
				WebElement floatInterestWebElement=new WebDriverWait(driver,60).until(ExpectedConditions.visibilityOfElementLocated(floatInterest_xpath));
				floatInterestWebElement.isDisplayed();
				return true;
			
			}
			catch(Exception e){
				
			}
			return false;
			
			}
	public boolean closingBalanceDisplay(){
		log.info("Verfy closingBalanceDisplay");
			try{
				//Thread.sleep(3000);
				WebElement closingBalWebElement=new WebDriverWait(driver,60).until(ExpectedConditions.visibilityOfElementLocated(closingBalalnce_xpath));
				closingBalWebElement.isDisplayed();
				return true;
			
			}
			catch(Exception e){
				
			}
			return false;
			
			}
	public boolean addDisplay(){
		log.info("Verfy addDisplay");
			try{
				//Thread.sleep(3000);
				WebElement addWebElement=new WebDriverWait(driver,60).until(ExpectedConditions.visibilityOfElementLocated(add_xpath));
				addWebElement.isDisplayed();
				return true;
			
			}
			catch(Exception e){
				
			}
			return false;
			
			}
	public boolean clickOnAdd(){
		log.info("Verfy clickOnAdd");
			try{
				Thread.sleep(2000);
				WebElement addWebElement=new WebDriverWait(driver,60).until(ExpectedConditions.visibilityOfElementLocated(add_xpath));
				addWebElement.click();
				WebElement amountWebElement=new WebDriverWait(driver,60).until(ExpectedConditions.visibilityOfElementLocated(amountEdit_xpath));
				amountWebElement.click();
				return true;
			
			}
			catch(Exception e){
				
			}
			return false;
			
			}

	public boolean clickOnSave(){
	log.info("Verfy clickOnSave");
		try{
			Thread.sleep(2000);
			WebElement saveWebElement=new WebDriverWait(driver,60).until(ExpectedConditions.visibilityOfElementLocated(save_xpath));
			saveWebElement.click();
			return true;
		
		}
		catch(Exception e){
			
		}
		return false;
		
		}
	
	public boolean edit(){
		log.info("Verify edit");
		try{
			//Thread.sleep(3000);
			WebElement editWebElement=new WebDriverWait(driver,60).until(ExpectedConditions.visibilityOfElementLocated(amountEdit_xpath));
			Actions act=new Actions(driver);
			act.doubleClick(editWebElement).perform();
			Thread.sleep(2000);
			return true;

		
		}
		catch(Exception e){
			
		}
		return false;
		
		}
	
	public boolean clickAmount(){
	log.info("Verfy clickOnSave");
		try{
			//Thread.sleep(3000);
			WebElement amountWebElement=new WebDriverWait(driver,60).until(ExpectedConditions.visibilityOfElementLocated(amountEditField_xpath));	
			amountWebElement.click();
			return true;
		
		}
		catch(Exception e){
			
		}
		return false;
		
		}
	public boolean passamount(String amount){
		log.info("Verfy clickOnSave");
			try{
				//Thread.sleep(3000);
				WebElement amountWebElement=new WebDriverWait(driver,60).until(ExpectedConditions.visibilityOfElementLocated(amountEditField_xpath));	
				amountWebElement.clear();
				amountWebElement.sendKeys(amount);
				return true;
			
			}
			catch(Exception e){
				
			}
			return false;
			
			}
	public boolean clickOnCancel(){
	log.info("Verfy clickOnCancel");
		try{
			//Thread.sleep(3000);
			WebElement cancelWebElement=new WebDriverWait(driver,60).until(ExpectedConditions.visibilityOfElementLocated(cancel_xpath));		
			cancelWebElement.click();
			return true;
		
		}
		catch(Exception e){
			
		}
		return false;
		
		}
	
	public boolean checkBox(){
		log.info("Verfy checkBox");
			try{
				//Thread.sleep(3000);
				WebElement checkWebElement=new WebDriverWait(driver,60).until(ExpectedConditions.visibilityOfElementLocated(checkBox_xpath));		
				checkWebElement.click();
				return true;
			
			}
			catch(Exception e){
				
			}
			return false;
			
			}
	public boolean delete(){
		log.info("Verfy delete");
			try{
				//Thread.sleep(3000);
				WebElement deleteWebElement=new WebDriverWait(driver,60).until(ExpectedConditions.visibilityOfElementLocated(delete_xpath));		
				deleteWebElement.click();
				return true;
			
			}
			catch(Exception e){
				
			}
			return false;
			
			}
	
	public boolean deleteD(){
		log.info("Verfy deleteD");
			try{
				//Thread.sleep(3000);
				WebElement deleteWebElement=new WebDriverWait(driver,60).until(ExpectedConditions.visibilityOfElementLocated(deleteIcon_xpath));		
				deleteWebElement.click();
				return true;
			
			}
			catch(Exception e){
				
			}
			return false;
			
			}
	public boolean selectLoanValue(String loan){
		log.info("selectLoan");
		try {			
			 Thread.sleep(3000);
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
}
