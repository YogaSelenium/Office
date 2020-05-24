package com.cync.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.cync.base.BasePage;

public class CreditLineCollateralSetupPage extends BasePage{

	static Logger log = Logger.getLogger(CreditLineCollateralSetupPage.class.getName()); 
	
	private final By breadcrumb_xpath=By.xpath("(//ul[@class='horizontal-li-list'])[1]");
	private final By pageheader_xpath=By.xpath("//span[text()='Credit Line Loan Collateral Setup']");
	private final By selectLoan_xpath=By.id("credit_loan_id");
	private final By disabledParticipationParty_xpath=By.xpath("//select[@id='credit_loan_loan_party_id' and @disabled='disabled']/option[1]");
	private final By sourceLabel_xpath=By.id("jqgh_credit_line_collaterals_list_source");
	private final By descriptionLabel_xpath=By.id("jqgh_credit_line_collaterals_list_description");
	private final By asOfDateLabel_xpath=By.id("credit_line_collaterals_list_as_of_date");
	private final By actualValue_xpath=By.id("credit_line_collaterals_list_actual_amount");
	private final By ineligibleCode_xpath=By.id("jqgh_credit_line_collaterals_list_ineligibility_reason_id");
	private final By ineligibleValue_xpath=By.id("jqgh_credit_line_collaterals_list_ineligible_amount");
	private final By eligibleValue_xpath=By.id("jqgh_credit_line_collaterals_list_eligible_amount");
	private final By advanceRate_xpath=By.id("jqgh_credit_line_collaterals_list_advance_rate");
	private final By collateralValue_xpath=By.id("jqgh_credit_line_collaterals_list_collateral_value");
	private final By add_xpath=By.id("add_credit_line_collaterals_list");
	private final By advanceRateValue_xpath=By.id("jqg1_advance_rate");
	private final By save_xpath=By.xpath("//span[@class='ui-icon ui-icon ui-icon-disk']");
	private final By saveSuccessMsg_xpath=By.xpath("//div[text()='Credit Line Collateral was successfully created.']");
	private final By advanceRateEdit_xpath=By.xpath("(//td[@aria-describedby='credit_line_collaterals_list_advance_rate'])[1]");
	private final By editableAdvanceRate_xpath=By.xpath("(//input[@class='editable inline-edit-cell ui-widget-content ui-corner-all'])[4]");
	private final By updatedSuccessMsg_xpath=By.xpath("//div[text()='Credit Line Collateral was successfully updated.']");
	private final By cancel_xpath=By.xpath("//span[@class='ui-icon ui-icon ui-icon-cancel']");
	private final By checkbox_xpath=By.id("jqg_credit_line_collaterals_list_57");
	private final By delete_xpath=By.xpath("//span[@class='ui-icon ui-icon-trash']");
	private final By deleteOk_xpath=By.id("dData");
	private final By reload_xpath=By.xpath("//span[@class='ui-icon ui-icon-refresh']");
	
	
	
		public CreditLineCollateralSetupPage(WebDriver driver) {
			super(driver);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		public String breadCrumb(String creditLineCollateralSetupBreadcrumb)
		{
			log.info("UI validation started on the screen for BreadcrumbVerify");
			try{
				Thread.sleep(3000);
				WebElement breadcrumbWebEelement=new WebDriverWait(driver,60).until(ExpectedConditions.visibilityOfElementLocated(breadcrumb_xpath));
				breadcrumbWebEelement.isDisplayed();
			}
			catch(Exception ex){
				
			}
			return creditLineCollateralSetupBreadcrumb;

			}
		
		public boolean creditLoanCollateralTitle(){
			log.info("Verfy creditLoanCollateralTitle ");
				try{
					Thread.sleep(3000);
					WebElement creditLoanCollateralTitleWebElement=new WebDriverWait(driver,60).until(ExpectedConditions.visibilityOfElementLocated(pageheader_xpath));
					creditLoanCollateralTitleWebElement.isDisplayed();
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
				WebElement newWebElementWebElement=new WebDriverWait(driver,60).until(ExpectedConditions.visibilityOfElementLocated(selectLoan_xpath));
				newWebElementWebElement.isDisplayed();
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
		
		public boolean sourceTitle(){
			log.info("Verify sourceTitle");
			try{
				//Thread.sleep(3000);
				WebElement sourceWebElement=new WebDriverWait(driver,60).until(ExpectedConditions.visibilityOfElementLocated(sourceLabel_xpath));
				sourceWebElement.isDisplayed();
				return true;
			
			}
			catch(Exception e){
				
			}
			return false;
			
			}
		
		public boolean descriptionLabel(){
			log.info("Verify descriptionLabel");
			try{
				//Thread.sleep(3000);
				WebElement descriptionWebElement=new WebDriverWait(driver,60).until(ExpectedConditions.visibilityOfElementLocated(descriptionLabel_xpath));
				descriptionWebElement.isDisplayed();
				return true;
			
			}
			catch(Exception e){
				
			}
			return false;
			
			}
		
		public boolean asOfDateLabel(){
			log.info("Verify asOfDateLabel");
			try{
				//Thread.sleep(3000);
				WebElement dateWebElement=new WebDriverWait(driver,60).until(ExpectedConditions.visibilityOfElementLocated(asOfDateLabel_xpath));
				dateWebElement.isDisplayed();
				return true;
			
			}
			catch(Exception e){
				
			}
			return false;
			
			}
		
		public boolean actualValueLabel(){
			log.info("Verify actualValueLabel");
			try{
				//Thread.sleep(3000);
				WebElement valueWebElement=new WebDriverWait(driver,60).until(ExpectedConditions.visibilityOfElementLocated(actualValue_xpath));
				valueWebElement.isDisplayed();
				return true;
			
			}
			catch(Exception e){
				
			}
			return false;
			
			}
		
		public boolean ineligibleCodeLabel(){
			log.info("Verify ineligibleCodeLabel");
			try{
				//Thread.sleep(3000);
				WebElement ineligibleCodeLabelWebElement=new WebDriverWait(driver,60).until(ExpectedConditions.visibilityOfElementLocated(ineligibleCode_xpath));
				ineligibleCodeLabelWebElement.isDisplayed();
				return true;
			
			}
			catch(Exception e){
				
			}
			return false;
			
			}
		
		public boolean ineligibleValueLabel(){
			log.info("Verify ineligibleValueLabel");
			try{
				//Thread.sleep(3000);
				WebElement ineligibleValueLabelWebElement=new WebDriverWait(driver,60).until(ExpectedConditions.visibilityOfElementLocated(ineligibleValue_xpath));
				ineligibleValueLabelWebElement.isDisplayed();
				return true;
			
			}
			catch(Exception e){
				
			}
			return false;
			
			}
		
		public boolean eligibleValueLabel(){
			log.info("Verify eligibleValueLabel");
			try{
				//Thread.sleep(3000);
				WebElement eligibleValueLabelWebElement=new WebDriverWait(driver,60).until(ExpectedConditions.visibilityOfElementLocated(eligibleValue_xpath));
				eligibleValueLabelWebElement.isDisplayed();
				return true;
			
			}
			catch(Exception e){
				
			}
			return false;
			
			}
		
		public boolean advanceRateLabel(){
			log.info("Verify advanceRateLabel");
			try{
				//Thread.sleep(3000);
				WebElement advanceRateLabelWebElement=new WebDriverWait(driver,60).until(ExpectedConditions.visibilityOfElementLocated(advanceRate_xpath));
				advanceRateLabelWebElement.isDisplayed();
				return true;
			
			}
			catch(Exception e){
				
			}
			return false;
			
			}
		
		public boolean collateralValueLabel(){
			log.info("Verify collateralValueLabel");
			try{
				//Thread.sleep(3000);
				WebElement collateralValueLabelWebElement=new WebDriverWait(driver,60).until(ExpectedConditions.visibilityOfElementLocated(collateralValue_xpath));
				collateralValueLabelWebElement.isDisplayed();
				return true;
			
			}
			catch(Exception e){
				
			}
			return false;
			
			}
		
		public boolean add(){
			log.info("Verify add");
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
			log.info("Verify clickOnAdd");
			try{
				//Thread.sleep(3000);
				WebElement addWebElement=new WebDriverWait(driver,60).until(ExpectedConditions.visibilityOfElementLocated(add_xpath));
				addWebElement.click();
				return true;
			
			}
			catch(Exception e){
				
			}
			return false;
			
			}

		public boolean passValueToAdvanceRate(String advanceRate){
			log.info("Verify passValueToAdvanceRate");
			try{
				//Thread.sleep(3000);
				WebElement advanceRateWebElement=new WebDriverWait(driver,60).until(ExpectedConditions.visibilityOfElementLocated(advanceRateValue_xpath));
				advanceRateWebElement.clear();
				advanceRateWebElement.sendKeys(advanceRate);
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
				WebElement saveWebElement=new WebDriverWait(driver,60).until(ExpectedConditions.visibilityOfElementLocated(save_xpath));
				saveWebElement.click();
				Thread.sleep(2000);
				return true;
			
			}
			catch(Exception e){
				
			}
			return false;
			
			}
		
		public boolean successMessage(){
			log.info("Verify successMessage");
			try{
				//Thread.sleep(3000);
				WebElement saveMsgWebElement=new WebDriverWait(driver,60).until(ExpectedConditions.visibilityOfElementLocated(saveSuccessMsg_xpath));
				saveMsgWebElement.isDisplayed();
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
				WebElement editWebElement=new WebDriverWait(driver,60).until(ExpectedConditions.visibilityOfElementLocated(advanceRateEdit_xpath));
				Actions act=new Actions(driver);
				act.doubleClick(editWebElement).perform();
				Thread.sleep(2000);
				return true;

			
			}
			catch(Exception e){
				
			}
			return false;
			
			}
		
		public boolean passValueToEditableAdvanceRate(String value){
			log.info("Verify passValueToEditableAdvanceRate");
			try{
				//Thread.sleep(3000);
				WebElement passValueWebElement=new WebDriverWait(driver,60).until(ExpectedConditions.visibilityOfElementLocated(editableAdvanceRate_xpath));
				passValueWebElement.clear();
				passValueWebElement.sendKeys(value);				
				return true;
			
			}
			catch(Exception e){
				
			}
			return false;
			
			}
		
		public boolean UpdationSuccessMessage(){
			log.info("Verify UpdationSuccessMessage");
			try{
				//Thread.sleep(3000);
				WebElement saveMsgWebElement=new WebDriverWait(driver,60).until(ExpectedConditions.visibilityOfElementLocated(updatedSuccessMsg_xpath));
				saveMsgWebElement.isDisplayed();
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
		
		public boolean clickOnCheckbox(){
			log.info("Verify clickOnCheckbox");
			try{
				//Thread.sleep(3000);
				WebElement checkBoxWebElement=new WebDriverWait(driver,60).until(ExpectedConditions.visibilityOfElementLocated(checkbox_xpath));
				checkBoxWebElement.click();
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
				WebElement deleteWebElement=new WebDriverWait(driver,60).until(ExpectedConditions.visibilityOfElementLocated(delete_xpath));
				deleteWebElement.click();
				return true;
			
			}
			catch(Exception e){
				
			}
			return false;
			
			}
		
		public boolean clickOnDeletePop(){
			log.info("Verify clickOnDeletePop");
			try{
				//Thread.sleep(3000);
				WebElement deleteWebElement=new WebDriverWait(driver,60).until(ExpectedConditions.visibilityOfElementLocated(deleteOk_xpath));
				deleteWebElement.click();
				return true;
			
			}
			catch(Exception e){
				
			}
			return false;
			
			}
		
		public boolean reload(){
			log.info("Verify reload");
			try{
				//Thread.sleep(3000);
				WebElement reloadWebElement=new WebDriverWait(driver,60).until(ExpectedConditions.visibilityOfElementLocated(reload_xpath));
				reloadWebElement.isDisplayed();
				return true;
			
			}
			catch(Exception e){
				
			}
			return false;
			
			}
		
		
		
}
