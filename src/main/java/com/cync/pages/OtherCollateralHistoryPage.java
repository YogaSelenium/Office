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

public class OtherCollateralHistoryPage extends BasePage{
	
	private final By otherCollateralHeader=By.xpath("//span[text()='Other Collaterals']");
	private final By collateralName_xpath=By.id("balance_name_id");
	private final By productGroup_xpath=By.id("product_id");
	private final By ineligibiltyReason_xpath=By.xpath("//table[@id='other_collateral_ineligible_summaries_list']/tbody/tr[2]/td[3]");
	private final By ineligibiltyAmount_xpath=By.xpath("//table[@id='other_collateral_ineligible_summaries_list']/tbody/tr[2]/td[4]");
	private final By eomTotal_xpath=By.xpath("//table[@class='table dataTable table-bordered']/tbody/tr[1]/td[2]");
	private final By eligibleAccounts_xpath=By.xpath("//table[@class='table dataTable table-bordered']/tbody/tr[2]/td[2]");
	private final By advanceRate_xpath=By.xpath("//table[@class='table dataTable table-bordered']/tbody/tr[3]/td[2]");
	private final By accountsOtherCollateral_xpath=By.xpath("//table[@class='table dataTable table-bordered']/tbody/tr[4]/td[2]");
	
	private final By ActualValue_xpath=By.xpath("//table[@class='table dataTable table-bordered table-striped']//td[contains(text(),'36,000.00')]");
	private final By CollateralValue_xpath=By.xpath("//table[@class='table dataTable table-bordered table-striped']//tbody//tr[1]//td[3]");
	private final By AgedCreditAmount_xpath=By.xpath("(//td[contains(text(),'800.00')])[11]");
	private final By EOMTotals_xpath=By.xpath("//td[@class='center'][contains(text(),'36,000.00')]");
	private final By eligibleaccounts_xpath=By.xpath("//td[contains(text(),'35,200.00')]");
	private final By AccountsOtherColleteral_xpath=By.xpath("//td[@class='center'][contains(text(),'30,800.00')]");
	
	public OtherCollateralHistoryPage(WebDriver driver) {
		super(driver);
		try {
			if(!driver.findElement(otherCollateralHeader).getText().trim().equals("Other Collaterals")){
				throw new SkipException("Other collateral screen couldn't open.");
			}
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}		
	}
	
	
	
	public boolean selectCollateralName(String collateralToSelect){	
		 
		 try {
			 //Thread.sleep(4000);
			 WebElement collateralNameWebElement=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(collateralName_xpath));		
				Select sel = new Select(collateralNameWebElement);
				List<WebElement> list = sel.getOptions();	
				
				
				for(WebElement ele : list){
					
					if(ele.getText().equals(collateralToSelect)){
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
	public boolean selectProductGroup(String collateralToSelect){	
		 
		 try {
			 //Thread.sleep(4000);
			 WebElement productGroupWebElement=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(productGroup_xpath));		
			 productGroupWebElement.click();
				Select sel = new Select(productGroupWebElement);
				List<WebElement> list = sel.getOptions();	
				
				
				for(WebElement ele : list){
					
					if(ele.getText().equals(collateralToSelect)){
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
	
	
	public boolean verifyIneligibiltyReason(String ineligibiltyReason){
		try{
			//Thread.sleep(5000);
			WebElement reasonWebElement=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(ineligibiltyReason_xpath));
			reasonWebElement.getText().equalsIgnoreCase(ineligibiltyReason);
			return true;
			
		}
		catch(Exception e){
			
		}
		return false;
		
		}
	
	public boolean verifyIneligibiltyAmount(String ineligibiltyAmount){
		try{
			//Thread.sleep(5000);
			WebElement reasonWebElement=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(ineligibiltyAmount_xpath));
			reasonWebElement.getText().trim().equalsIgnoreCase(ineligibiltyAmount);
			return true;
			
		}
		catch(Exception e){
			
		}
		return false;
		
		}
	public boolean verifyEomTotal(String eomTotal){
		try{
			//Thread.sleep(5000);
			WebElement eomWebElement=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(eomTotal_xpath));
			eomWebElement.getText().trim().equalsIgnoreCase(eomTotal);
			return true;
			
		}
		catch(Exception e){
			
		}
		return false;
		
		}
	
	public boolean verifyEligibleAccounts(String eligibleAcc){
		try{
			//Thread.sleep(5000);
			WebElement eligibleAccWebElement=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(eligibleAccounts_xpath));
			eligibleAccWebElement.getText().trim().equalsIgnoreCase(eligibleAcc);
			return true;
			
		}
		catch(Exception e){
			
		}
		return false;
		
		}
	
	public boolean verifyAdvanceRate(String advanceRate){
		try{
			//Thread.sleep(5000);
			WebElement advanceRateWebElement=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(advanceRate_xpath));
			advanceRateWebElement.getText().trim().equalsIgnoreCase(advanceRate);
			return true;
			
		}
		catch(Exception e){
			
		}
		return false;
		
		}
	
	public boolean verifyaccountsOtherColl(String accountsOtherColl){
		try{
			//Thread.sleep(5000);
			WebElement accOtherCollWebElement=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(accountsOtherCollateral_xpath));
			accOtherCollWebElement.getText().trim().equalsIgnoreCase(accountsOtherColl);
			return true;
			
		}
		catch(Exception e){
			
		}
		return false;
		
		}
	public boolean VerifyActualAmount(String actualAmount)
	{
	try{
		WebElement FieldUIWebElement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(ActualValue_xpath));
		WebElement FieldWebElement = new WebDriverWait(
			driver, 100)
			.until(ExpectedConditions
					.visibilityOfElementLocated(ActualValue_xpath));

		FieldUIWebElement.isDisplayed();
	String actual = FieldWebElement.getText().trim();
	if (actual.equals(actualAmount))
		return true;
	else
		return false;

} catch (Exception e) {
	return false;
}
}	
	public boolean VerifyCollateralAmount(String ColleteralAmount)
	{
	try{
		WebElement FieldUIWebElement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(CollateralValue_xpath));
		WebElement FieldWebElement = new WebDriverWait(
			driver, 100)
			.until(ExpectedConditions
					.visibilityOfElementLocated(CollateralValue_xpath));

		FieldUIWebElement.isDisplayed();
	String actual = FieldWebElement.getText().trim();
	if (actual.equals(ColleteralAmount))
		return true;
	else
		return false;

} catch (Exception e) {
	return false;
}
}	
	public boolean VerifyAccountsForOthercolleral(String ColleteralAmount)
	{
	try{
		WebElement FieldUIWebElement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(AccountsOtherColleteral_xpath));
		WebElement FieldWebElement = new WebDriverWait(
			driver, 100)
			.until(ExpectedConditions
					.visibilityOfElementLocated(AccountsOtherColleteral_xpath));

		FieldUIWebElement.isDisplayed();
	String actual = FieldWebElement.getText().trim();
	if (actual.equals(ColleteralAmount))
		return true;
	else
		return false;

} catch (Exception e) {
	return false;
}
}	
	public boolean VerifyAgedcreditAmount(String creditamount)
	{
	try{
		WebElement FieldUIWebElement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(AgedCreditAmount_xpath));
		WebElement FieldWebElement = new WebDriverWait(
			driver, 100)
			.until(ExpectedConditions
					.visibilityOfElementLocated(AgedCreditAmount_xpath));

		FieldUIWebElement.isDisplayed();
	String actual = FieldWebElement.getText().trim();
	if (actual.equals(creditamount))
		return true;
	else
		return false;

} catch (Exception e) {
	return false;
}
}	
	public boolean VerifyEOMTotal(String eom)
	{
	try{
		WebElement FieldUIWebElement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(EOMTotals_xpath));
		WebElement FieldWebElement = new WebDriverWait(
			driver, 100)
			.until(ExpectedConditions
					.visibilityOfElementLocated(EOMTotals_xpath));

		FieldUIWebElement.isDisplayed();
	String actual = FieldWebElement.getText().trim();
	if (actual.equals(eom))
		return true;
	else
		return false;

} catch (Exception e) {
	return false;
}
}	
	public boolean Verifyeligibleaccounts(String eligible)
	{
	try{
		WebElement FieldUIWebElement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(eligibleaccounts_xpath));
		WebElement FieldWebElement = new WebDriverWait(
			driver, 100)
			.until(ExpectedConditions
					.visibilityOfElementLocated(eligibleaccounts_xpath));

		FieldUIWebElement.isDisplayed();
	String actual = FieldWebElement.getText().trim();
	if (actual.equals(eligible))
		return true;
	else
		return false;

} catch (Exception e) {
	return false;
}
}	
}
