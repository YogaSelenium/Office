package com.cync.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.SkipException;

import com.cync.base.BasePage;

public class OtherCollateralPage extends BasePage{

	private final By otherCollateralHeader=By.xpath("//span[text()='Other Collateral']");
	private final By collateralName_xpath=By.id("balance_name_id");
	private final By addCollateral_xpath=By.id("add_other_collaterals_list");
	private final By addDescription_xpath=By.id("jqg1_description");
	private final By addValue_xpath=By.id("jqg1_balance_amount");
	private final By saveCollateral_xpath=By.xpath("(//td[@title='Save Record'])[1]");
	private final By successMessage_xpath=By.xpath("//div[text()='Other Collateral was successfully created.']");
	private final By closePopUp_xpath=By.id("closedialog");
	private final By productGroup_xpath=By.id("product_id");
	private final By addProductGrp_xpath=By.id("add_other_collateral_ineligible_summaries_list");
	private final By ineligibilityReason_xpath=By.name("ineligibility_reason_id");
	private final By amountProduct_xpath=By.name("ineligible_amount");
	private final By saveProduct_xpath=By.xpath("(//td[@title='Save Record'])[2]");
	private final By successMsg_xpath=By.xpath("//div[text()='Ineligble summary was successfully  created']");
	private final By eomTotal_xpath=By.xpath("//table[@class='table dataTable table-bordered']/tbody/tr[1]/td[2]");
	private final By eligibleAccounts_xpath=By.xpath("//table[@class='table dataTable table-bordered']/tbody/tr[2]/td[2]");
	private final By advanceRate_xpath=By.xpath("//table[@class='table dataTable table-bordered']/tbody/tr[3]/td[2]");
	private final By accountsOtherCollateral_xpath=By.xpath("//*[@id='other_collateral_summary_section']//tbody/tr[3]/td[2]");
	private final By GridAddForCollateral1DIV1_xpath=By.xpath("(//span[@class='ui-icon ui-icon ui-icon-plus'])[1]");
	private final By addDescriptionForCollateral_xpath=By.xpath("(//input[@class='editable inline-edit-cell ui-widget-content ui-corner-all'])[1]");
	private final By addValueForCollateral_xpath=By.xpath("(//input[@class='editable inline-edit-cell ui-widget-content ui-corner-all'])[2]");

	
	public OtherCollateralPage(WebDriver driver) {
		super(driver);
		try {
			if(!driver.findElement(otherCollateralHeader).getText().trim().equals("Other Collateral")){
				throw new SkipException("Other collateral screen couldn't open.");
			}
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}		
	}
	
	public boolean selectCollateralName(String collateralToSelect){	
		 
		 try {

			 Thread.sleep(1000);

			 WebElement collateralNameWebElement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(collateralName_xpath));		
				Select sel = new Select(collateralNameWebElement);
				//sel.selectByVisibleText(collateralToSelect);
				List<WebElement> list = sel.getOptions();	
				
				
				for(WebElement ele : list){
					
					if(ele.getText().equals(collateralToSelect)){
						ele.click();
						Thread.sleep(5000);
						break;
					}
				}
				return true;
		} catch (Exception e) {
			System.out.println("Error");
		}
				
			return false;
	}
	
	public boolean clickToAdd(){
		try{
			//Thread.sleep(5000);
			WebElement clickOnAddWebElement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(addCollateral_xpath));
			clickOnAddWebElement.click();
			return true;
			
		}
		catch(Exception e){
			
		}
		return false;
		
		}
	
	public boolean sendkeysToDescription(String description){
		try{
			Thread.sleep(1000);
			WebElement descriptionWebElement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(addDescription_xpath));
			descriptionWebElement.click();
			descriptionWebElement.sendKeys(description);
			return true;
			
		}
		catch(Exception e){
			
		}
		return false;
		
		}
	
	public boolean sendkeysToValue(String value){
		try{
			//Thread.sleep(5000);
			WebElement valueWebElement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(addValue_xpath));
			valueWebElement.clear();
			valueWebElement.sendKeys(value);
			return true;
			
		}
		catch(Exception e){
			
		}
		return false;
		
		}
	public boolean clickToSaveCollateral(){
		try{
			//Thread.sleep(5000);
			WebElement clickOnSaveWebElement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(saveCollateral_xpath));
			clickOnSaveWebElement.click();
			return true;
			
		}
		catch(Exception e){
			
		}
		return false;
		
		}
	
	public boolean SuccessMessageCollateral(){
		try{
			//Thread.sleep(5000);
			WebElement successWebElement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(successMessage_xpath));
			successWebElement.isDisplayed();
			return true;
			
		}
		catch(Exception e){
			
		}
		return false;
		
		}
	public boolean clickOnClosePopup(){
		try{
			//Thread.sleep(5000);
			WebElement clickOnCloseWebElement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(closePopUp_xpath));
			clickOnCloseWebElement.click();
			Thread.sleep(1000);
			return true;
			
		}
		catch(Exception e){
			
		}
		return false;
		
		}
	
	public boolean selectProductGroup(String collateralToSelect){	
		 
		 try {
			 Thread.sleep(2000);
			 WebElement productGroupWebElement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(productGroup_xpath));		
			 productGroupWebElement.click();

			 Select sel = new Select(productGroupWebElement);
				List<WebElement> list = sel.getOptions();
				for (WebElement ele : list) {
					if (ele.getText().equals(collateralToSelect)) {
						ele.click();
						 Thread.sleep(1000);
						break;
					}
				}
				return true;
		} catch (Exception e) {
			System.out.println("Error");
		}
		return false;
	}	
	
	public boolean clickToAddProductGrp(){
		try{
			//Thread.sleep(5000);
			WebElement clickOnAddWebElement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(addProductGrp_xpath));
			clickOnAddWebElement.click();
			return true;
			
		}
		catch(Exception e){
			
		}
		return false;
		
		}
	
	public boolean selectPrdIneligiblityReason(String IneligibiltyToSelect){	
		 
		 try {
			 //Thread.sleep(4000);
			 WebElement ineligibiltyReasonWebElement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(ineligibilityReason_xpath));		
				Select sel = new Select(ineligibiltyReasonWebElement);
				//sel.selectByVisibleText(IneligibiltyToSelect);
				List<WebElement> list = sel.getOptions();	
				
				
				for(WebElement ele : list){
					
					if(ele.getText().equals(IneligibiltyToSelect)){
						ele.click();
						 Thread.sleep(1000);
						break;
					}
				}
				return true;
		} catch (Exception e) {
			System.out.println("Error");
		}
				
			return false;
	}
	
	public boolean sendkeysToAmount(String amount){
		try{
			//Thread.sleep(5000);
			WebElement valueWebElement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(amountProduct_xpath));
			valueWebElement.clear();
			valueWebElement.sendKeys(amount);
			return true;
			
		}
		catch(Exception e){
			
		}
		return false;
		
		}
	public boolean clickToSaveProductGrp(){
		try{
			//Thread.sleep(5000);
			WebElement clickOnAddWebElement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(saveProduct_xpath));
			clickOnAddWebElement.click();
			return true;
			
		}
		catch(Exception e){
			
		}
		return false;
		
		}
	
	public boolean SuccessMessageProduct(){
		try{
			//Thread.sleep(5000);
			WebElement successWebElement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(successMsg_xpath));
			successWebElement.isDisplayed();
			return true;
			
		}
		catch(Exception e){
			
		}
		return false;
		
		}
	public boolean verifyEomTotal(String eomTotal){
		try{
			//Thread.sleep(5000);
			WebElement eomWebElement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(eomTotal_xpath));
			eomWebElement.getText().equalsIgnoreCase(eomTotal);
			return true;
			
		}
		catch(Exception e){
			
		}
		return false;
		
		}
	
	public boolean verifyEligibleAccounts(String eligibleAcc){
		try{
			//Thread.sleep(5000);
			WebElement eligibleAccWebElement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(eligibleAccounts_xpath));
			eligibleAccWebElement.getText().equalsIgnoreCase(eligibleAcc);
			return true;
			
		}
		catch(Exception e){
			
		}
		return false;
		
		}
	
	public boolean verifyAdvanceRate(String advanceRate){
		try{
			//Thread.sleep(5000);
			WebElement advanceRateWebElement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(advanceRate_xpath));
			advanceRateWebElement.getText().equalsIgnoreCase(advanceRate);
			return true;
			
		}
		catch(Exception e){
			
		}
		return false;
		
		}
	
	public boolean verifyaccountsOtherColl(String accountsOtherColl){
		try{
			//Thread.sleep(5000);
			WebElement accOtherCollWebElement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(accountsOtherCollateral_xpath));
			accOtherCollWebElement.getText().equalsIgnoreCase(accountsOtherColl);
			return true;
			
		}
		catch(Exception e){
			
		}
		return false;
		
		}
	public boolean clickGridIconForCollateral(){
		try{
			//Thread.sleep(5000);
			WebElement clickOnAddWebElement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(GridAddForCollateral1DIV1_xpath));
			clickOnAddWebElement.click();
			return true;
			
		}
		catch(Exception e){
			
		}
		return false;
		
		}
	public boolean sendkeysToDescriptionForCollateral(String description){
		try{
			Thread.sleep(1000);
			WebElement descriptionWebElement=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(addDescriptionForCollateral_xpath));
			descriptionWebElement.click();
			descriptionWebElement.sendKeys(description);
			return true;
			
		}
		catch(Exception e){
			
		}
		return false;
		
		}
	public boolean sendkeysToValueForCollateral(String value){
		try{
			//Thread.sleep(5000);
			WebElement valueWebElement=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(addValueForCollateral_xpath));
			valueWebElement.clear();
			valueWebElement.sendKeys(value);
			return true;
			
		}
		catch(Exception e){
			
		}
		return false;
		
		}
	
	
}
