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

public class CreditLineChargesSetupPage extends BasePage{

	static Logger log = Logger.getLogger(CreditLineChargesSetupPage.class.getName());

	private final By breadcrumb_xpath=By.xpath("(//ul[@class='horizontal-li-list'])[1]");	
	private final By pageHeader_xpath=By.xpath("//span[text()='Credit Line Charges Setup']");
	private final By selectLoan_xpath=By.id("credit_loan_id");
	private final By selectedRateCode_xpath=By.xpath("//select[@id='credit_loan_interest_rate_code_id']/option[@selected='selected']");
	private final By participationParty_xpath=By.id("credit_loan_loan_party_id");
	private final By creditLimt_xpath=By.id("credit_loan_credit_limit");
	private final By chargeTemplateTitle_xpath=By.xpath("//h2[text()='Credit Line Charge Templates']");
	private final By chargeCodeTilte_xpath=By.id("jqgh_credit_line_charge_templates_list_charge_code_id");
	private final By plusMinusTitle_xpath=By.id("jqgh_credit_line_charge_templates_list_natural_sign");
	private final By sequenceTitle_xpath=By.id("credit_line_charge_templates_list_sequence");
	private final By frequency_xpath=By.id("jqgh_credit_line_charge_templates_list_frequency");
	private final By calcType_xpath=By.id("jqgh_credit_line_charge_templates_list_charge_type");
	private final By calcValue_xpath=By.id("jqgh_credit_line_charge_templates_list_charge_value");
	private final By inBalance_xpath=By.id("jqgh_credit_line_charge_templates_list_add_to_balance");
	private final By addCredit_xpath=By.id("add_credit_line_charge_templates_list");
	private final By selectChargeCode_xpath=By.name("charge_code_id");
	private final By editCalValue_xpath=By.xpath("(//td[@aria-describedby='credit_line_charge_templates_list_charge_value'])[1]");
	private final By saveIcon_xpath=By.xpath("//span[@class='ui-icon ui-icon ui-icon-disk']");
	private final By successMsg_xpath=By.xpath("//div[text()='Credit Line Charge Template was successfully updated.']");
	private final By cancel_xpath=By.xpath("//span[@class='ui-icon ui-icon ui-icon-cancel']");
	private final By reload_xpath=By.id("refresh_credit_line_charge_templates_list");
	private final By export_xpath=By.xpath("//td[@title='Export Data']");
	private final By selectedPP_xpath=By.xpath("//select[@id='credit_loan_loan_party_id']/option[1]");
	private final By enterCalcValue_xpath=By.xpath("(//input[@class='editable inline-edit-cell ui-widget-content ui-corner-all'])[2]");
			
	
	public CreditLineChargesSetupPage(WebDriver driver) {
		super(driver);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public String breadCrumb(String creditLineSetUpBreadcrumb)
	{
		log.info("UI validation started on the screen for BreadcrumbVerify");
		try{
			Thread.sleep(3000);
			WebElement breadcrumbWebEelement=new WebDriverWait(driver,60).until(ExpectedConditions.visibilityOfElementLocated(breadcrumb_xpath));
			breadcrumbWebEelement.isDisplayed();
		}
		catch(Exception ex){
			
		}
		return creditLineSetUpBreadcrumb;

		}	
	
	public boolean creditLineSetUpTitle(){
		log.info("Verfy creditLineSetUpTitle ");
			try{
				Thread.sleep(3000);
				WebElement creditLoanSetUpTitleWebElement=new WebDriverWait(driver,60).until(ExpectedConditions.visibilityOfElementLocated(pageHeader_xpath));
				creditLoanSetUpTitleWebElement.isDisplayed();
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
			WebElement selectLoanWebElement=new WebDriverWait(driver,60).until(ExpectedConditions.visibilityOfElementLocated(selectLoan_xpath));
			selectLoanWebElement.isDisplayed();
			return true;
		
		}
		catch(Exception e){
			
		}
		return false;
		
		}
	
	public boolean selectedInterestRateCode(String expectedRateCode){
		log.info("Verify selectedInterestRateCode");
		try{
			//Thread.sleep(3000);
			WebElement rateCodeWebElement=new WebDriverWait(driver,60).until(ExpectedConditions.visibilityOfElementLocated(selectedRateCode_xpath));
			String actual=rateCodeWebElement.getText();
			System.out.println(actual);
			if (actual.equals(expectedRateCode)) {
				return true;
			}else
			return false;
		
		}
		catch(Exception e){
			
		}
		return false;
		
		}
	
	public boolean selectLoanValue(String loan){
		log.info("selectLoanValue");
		try {			
			 //Thread.sleep(4000);
			WebElement valWebElement=new WebDriverWait(driver,60).until(ExpectedConditions.visibilityOfElementLocated(selectLoan_xpath));	
				Select sel = new Select(valWebElement);
				
				List<WebElement> list = sel.getOptions();	
				
				
				for(WebElement ele : list){
					
					if(ele.getText().equals(loan)){
						ele.click();
						 Thread.sleep(4000);					
						break;
					}
				}
				return true;
		} catch (Exception e) {

		}
				
			return false;
		}
	
	public boolean selectedPaticipationParty(String expectedParticipationParty){
		log.info("Verify selectedPaticipationParty");
		try{
			//Thread.sleep(3000);
			WebElement particpationWebElement=new WebDriverWait(driver,60).until(ExpectedConditions.visibilityOfElementLocated(selectedPP_xpath));
			String actual=particpationWebElement.getText();
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
	
	public boolean chargeTemplateDisplay(){
		log.info("Verify chargeTemplateDisplay");
		try{
			//Thread.sleep(3000);
			WebElement tempWebElement=new WebDriverWait(driver,60).until(ExpectedConditions.visibilityOfElementLocated(chargeTemplateTitle_xpath));
			tempWebElement.isDisplayed();
			return true;
		
		}
		catch(Exception e){
			
		}
		return false;
		
		}
	
	public boolean chargeCodeDisplay(){
		log.info("Verify chargeCodeDisplay");
		try{
			//Thread.sleep(3000);
			WebElement codeWebElement=new WebDriverWait(driver,60).until(ExpectedConditions.visibilityOfElementLocated(chargeCodeTilte_xpath));
			codeWebElement.isDisplayed();
			return true;
		
		}
		catch(Exception e){
			
		}
		return false;
		
		}
	
	public boolean plusMinusDisplay(){
		log.info("Verify plusMinusDisplay");
		try{
			//Thread.sleep(3000);
			WebElement signWebElement=new WebDriverWait(driver,60).until(ExpectedConditions.visibilityOfElementLocated(plusMinusTitle_xpath));
			signWebElement.isDisplayed();
			return true;
		
		}
		catch(Exception e){
			
		}
		return false;
		
		}
	
	public boolean sequenceDisplay(){
		log.info("Verify sequenceDisplay");
		try{
			//Thread.sleep(3000);
			WebElement sequenceWebElement=new WebDriverWait(driver,60).until(ExpectedConditions.visibilityOfElementLocated(sequenceTitle_xpath));
			sequenceWebElement.isDisplayed();
			return true;
		
		}
		catch(Exception e){
			
		}
		return false;
		
		}
	public boolean frequencyDisplay(){
		log.info("Verify frequencyDisplay");
		try{
			//Thread.sleep(3000);
			WebElement frequencyWebElement=new WebDriverWait(driver,60).until(ExpectedConditions.visibilityOfElementLocated(frequency_xpath));
			frequencyWebElement.isDisplayed();
			return true;
		
		}
		catch(Exception e){
			
		}
		return false;
		
		}
	
	public boolean calcTypeDisplay(){
		log.info("Verify calcTypeDisplay");
		try{
			//Thread.sleep(3000);
			WebElement calcTypeWebElement=new WebDriverWait(driver,60).until(ExpectedConditions.visibilityOfElementLocated(calcType_xpath));
			calcTypeWebElement.isDisplayed();
			return true;
		
		}
		catch(Exception e){
			
		}
		return false;
		
		}
	
	
	public boolean calcValueDisplay(){
		log.info("Verify calcValueDisplay");
		try{
			//Thread.sleep(3000);
			WebElement calcValueWebElement=new WebDriverWait(driver,60).until(ExpectedConditions.visibilityOfElementLocated(calcValue_xpath));
			calcValueWebElement.isDisplayed();
			return true;
		
		}
		catch(Exception e){
			
		}
		return false;
		
		}
	
	public boolean inBalanceDisplay(){
		log.info("Verify inBalanceDisplay");
		try{
			//Thread.sleep(3000);
			WebElement inBalanceWebElement=new WebDriverWait(driver,60).until(ExpectedConditions.visibilityOfElementLocated(inBalance_xpath));
			inBalanceWebElement.isDisplayed();
			return true;
		
		}
		catch(Exception e){
			
		}
		return false;
		
		}
	
	public boolean DisplayAddCredit(){
		log.info("Verify DisplayAddCredit");
		try{
			//Thread.sleep(3000);
			WebElement addWebElement=new WebDriverWait(driver,60).until(ExpectedConditions.visibilityOfElementLocated(addCredit_xpath));
			addWebElement.isDisplayed();
			return true;
		
		}
		catch(Exception e){
			
		}
		return false;
		
		}
	
	public boolean selectChargeCodeVal(String chargeCode){
		log.info("selectChargeCodeVal");
		try {			
			 //Thread.sleep(4000);
			WebElement valWebElement=new WebDriverWait(driver,60).until(ExpectedConditions.visibilityOfElementLocated(selectChargeCode_xpath));	
				Select sel = new Select(valWebElement);
				
				List<WebElement> list = sel.getOptions();	
				
				
				for(WebElement ele : list){
					
					if(ele.getText().equals(chargeCode)){
						ele.click();
						 Thread.sleep(3000);					
						break;
					}
				}
				return true;
		} catch (Exception e) {

		}
				
			return false;
		}
	
	public boolean doubleclickOnCalcValue(){
		log.info("Verify doubleclickOnCalcValue");
		try{
			//Thread.sleep(3000);
			WebElement doubleClickWebElement=new WebDriverWait(driver,60).until(ExpectedConditions.visibilityOfElementLocated(editCalValue_xpath));
			Actions act=new Actions(driver);
			act.doubleClick(doubleClickWebElement).perform();
			Thread.sleep(2000);
			return true;
		
		}
		catch(Exception e){
			
		}
		return false;
		
		}
	
	public boolean passValueToCalcValue(String value){
		log.info("Verify passValueToCalcValue");
		try{
			//Thread.sleep(3000);
			WebElement passValueWebElement=new WebDriverWait(driver,60).until(ExpectedConditions.visibilityOfElementLocated(enterCalcValue_xpath));
			passValueWebElement.clear();
			passValueWebElement.sendKeys(value);
			
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
			WebElement saveWebElement=new WebDriverWait(driver,60).until(ExpectedConditions.visibilityOfElementLocated(saveIcon_xpath));
			saveWebElement.click();
			return true;
		
		}
		catch(Exception e){
			
		}
		return false;
		
		}
	
	public boolean successMSg(){
		log.info("Verify successMSg");
		try{
			Thread.sleep(1000);
			WebElement successMsgWebElement=new WebDriverWait(driver,60).until(ExpectedConditions.visibilityOfElementLocated(successMsg_xpath));
			successMsgWebElement.isDisplayed();
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
			WebElement cancelWebElement=new WebDriverWait(driver,60).until(ExpectedConditions.visibilityOfElementLocated(cancel_xpath));
			cancelWebElement.click();
			return true;
		
		}
		catch(Exception e){
			
		}
		return false;
		
		}
	
	public boolean clickOnReload(){
		log.info("Verify clickOnReload");
		try{
			//Thread.sleep(3000);
			WebElement reloadWebElement=new WebDriverWait(driver,60).until(ExpectedConditions.visibilityOfElementLocated(reload_xpath));
			reloadWebElement.click();
			return true;
		
		}
		catch(Exception e){
			
		}
		return false;
		
		}
	
	public boolean verifyExport(){
		log.info("Verify verifyExport");
		try{
			//Thread.sleep(3000);
			WebElement exportWebElement=new WebDriverWait(driver,60).until(ExpectedConditions.visibilityOfElementLocated(export_xpath));
			exportWebElement.isDisplayed();
			return true;
		
		}
		catch(Exception e){
			
		}
		return false;
		
		}
	
}
