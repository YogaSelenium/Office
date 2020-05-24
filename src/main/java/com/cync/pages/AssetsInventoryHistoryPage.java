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

public class AssetsInventoryHistoryPage extends BasePage{
	
	private final By assetInventoryPage_xpath=By.xpath("//span[text()='Assets/Inventory']");
	private final By collateralName_xpath=By.id("balance_name_id");
	private final By collateralInventory_xpath=By.xpath("//select[@id='balance_name_id']/option[2]");
	private final By bbcDate_xpath=By.xpath("(//label[@class='control-label'])[2]");
	private final By description_xpath=By.xpath("//table[@id='inventory_summaries_list']/tbody/tr[2]/td[3]");
	private final By asOfDate_xpath=By.xpath("//table[@id='inventory_summaries_list']/tbody/tr[2]/td[4]");
	private final By actualDate_xpath=By.xpath("//table[@id='inventory_summaries_list']/tbody/tr[2]/td[5]");
	private final By ineligibleValue_xpath=By.xpath("//table[@id='inventory_summaries_list']/tbody/tr[2]/td[7]");
	private final By eligibleValue_xpath=By.xpath("//table[@id='inventory_summaries_list']/tbody/tr[2]/td[8]");
	private final By cogs_xpath=By.xpath("//table[@id='inventory_summaries_list']/tbody/tr[2]/td[10]");
	private final By nolv_xpath=By.xpath("(//table[@role='presentation'])[3]//tbody/tr/td[11]");
	private final By lotv_xpath=By.xpath("(//table[@role='presentation'])[3]//tbody/tr/td[12]");
	private final By adjustmentAdvance_xpath=By.xpath("(//table[@role='presentation'])[3]//tbody/tr/td[13]");
	private final By collateralValue_xpath=By.xpath("(//table[@role='presentation'])[3]//tbody/tr/td[14]");
	private final By subLimit_xpath=By.xpath("(//table[@role='presentation'])[3]//tbody/tr/td[15]");
	private final By available_xpath=By.xpath("(//table[@role='presentation'])[3]//tbody/tr/td[16]");
	private final By scroll_xapth=By.xpath("(//div[@class='ui-jqgrid-bdiv'])[1]/div/div");
	private final By ineligibiltyReason_xpath=By.xpath("//table[@id='inventory_ineligible_summaries_list']/tbody/tr[2]/td[3]");
	private final By ineligibiltyAmount_xpath=By.xpath("//table[@id='inventory_ineligible_summaries_list']/tbody/tr[2]/td[4]");
	private final By totalIneligible_xpath=By.xpath("(//table[@role='presentation'])[6]/tbody/tr/td[4]");
	private final By eomTotal_xpath=By.xpath("//div[@id='inventory_summary_section']/table/tbody/tr[1]/td[2]");
	private final By eligibleAccInventory_xpath=By.xpath("//div[@id='inventory_summary_section']/table/tbody/tr[2]/td[2]");
	private final By accInventoriesCollateral_xpath=By.xpath("//div[@id='inventory_summary_section']/table/tbody/tr[4]/td[2]");
	
	
	//cyncs_4462
	
	 private final By undefined_xpath=By.xpath("//td[contains(text(),'Undefined')]");
	 private final By asset_amnt_xpath=By.xpath("(//td[contains(text(),'1,418.00')])[3]");
	 private final By Assetamnt1_xpath=By.xpath("(//td[contains(text(),'1,418.00')])[1]");
	
	 private final By crossaged_xpath=By.xpath("//td[contains(text(),'Cross Aged %')]");
	 private final By assetamnt2_xpath=By.xpath("(//td[text()='300.00'])[1]");
	 private final By total_xpath=By.xpath("(//td[text()='Totals'])[2]");
	 private final By totalinelig_xpath=By.xpath("(//td[text()='1,718.00'])[3]");
	 
	
	public AssetsInventoryHistoryPage(WebDriver driver) {
		super(driver);

		try {
			Thread.sleep(1000);
			if (!driver.findElement(assetInventoryPage_xpath).getText().trim().equals("Assets/Inventory")) {
				throw new SkipException("Assets/Inventory  couldn't open.");
			}
		} catch (Exception e) {

			e.printStackTrace();
		}
		
	}
	public boolean verifyassetinventoryamnt_cyncs4462_2(String expected) {
    	try {
    		WebElement assetinventoryWebElement = new WebDriverWait(
    				driver, 100)
    				.until(ExpectedConditions
    						.visibilityOfElementLocated(undefined_xpath));
    		WebElement assetinventoryAmountWebElement = new WebDriverWait(
    				driver, 100)
    				.until(ExpectedConditions
    						.visibilityOfElementLocated(Assetamnt1_xpath));

    		assetinventoryWebElement.isDisplayed();
    		String actual = assetinventoryAmountWebElement.getText();
    		if (actual.equals(expected))
    			return true;
    		else
    			return false;

    	} catch (Exception e) {
    		return false;
    	}
    
	
} 
	public boolean verifyassetinventoryamnt_cyncs4462_3(String expected1) {
    	try {
    		WebElement assetinventoryWebElement = new WebDriverWait(
    				driver, 100)
    				.until(ExpectedConditions
    						.visibilityOfElementLocated(crossaged_xpath));
    		WebElement assetinventoryAmountWebElement = new WebDriverWait(
    				driver, 100)
    				.until(ExpectedConditions
    						.visibilityOfElementLocated(assetamnt2_xpath));

    		assetinventoryWebElement.isDisplayed();
    		String actual = assetinventoryAmountWebElement.getText();
    		if (actual.equals(expected1))
    			return true;
    		else
    			return false;

    	} catch (Exception e) {
    		return false;
    	}
    
	
} 
	public boolean verifyassetinventoryamnt_cyncs4462_total(String expected2) {
    	try {
    		WebElement assetinventoryWebElement = new WebDriverWait(
    				driver, 100)
    				.until(ExpectedConditions
    						.visibilityOfElementLocated(total_xpath));
    		WebElement assetinventoryAmountWebElement = new WebDriverWait(
    				driver, 100)
    				.until(ExpectedConditions
    						.visibilityOfElementLocated(totalinelig_xpath));

    		assetinventoryWebElement.isDisplayed();
    		String actual = assetinventoryAmountWebElement.getText();
    		if (actual.equals(expected2))
    			return true;
    		else
    			return false;

    	} catch (Exception e) {
    		return false;
    	}
    
	
} 
	public boolean verifyassetinventoryamnt_cyncs4462_1(String expected) {
    	try {
    		WebElement assetinventoryWebElement = new WebDriverWait(
    				driver, 100)
    				.until(ExpectedConditions
    						.visibilityOfElementLocated(undefined_xpath));
    		WebElement assetinventoryAmountWebElement = new WebDriverWait(
    				driver, 100)
    				.until(ExpectedConditions
    						.visibilityOfElementLocated(asset_amnt_xpath));

    		assetinventoryWebElement.isDisplayed();
    		String actual = assetinventoryAmountWebElement.getText();
    		if (actual.equals(expected))
    			return true;
    		else
    			return false;

    	} catch (Exception e) {
    		return false;
    	}
    
	
}  
	public boolean clickonCollateralName(String CollateralName){
		try{
			//Thread.sleep(5000);
			WebElement clickWebElement=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(collateralName_xpath));
			clickWebElement.click();
			WebElement CollateralWebElement=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(collateralInventory_xpath));
			CollateralWebElement.getText().equalsIgnoreCase(CollateralName);
			return true;
			
		}
		catch(Exception e){
			
		}
		return false;
		
		}
	
	public boolean bbcDate(String bbcDate){
		try{
			//Thread.sleep(5000);
			WebElement bbcDateWebElement=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(bbcDate_xpath));
			bbcDateWebElement.getText().equalsIgnoreCase(bbcDate);
			return true;
			
		}
		catch(Exception e){
			
		}
		return false;
		
		}
	public boolean description(String description){
		try{
			//Thread.sleep(5000);
			WebElement descriptionWebElement=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(description_xpath));
			descriptionWebElement.getText().equalsIgnoreCase(description);
			System.out.println("description");
			return true;
			
		}
		catch(Exception e){
			
		}
		return false;
		
		}
	
	public boolean collateralNameDropdownValues(String collateralNameDropdownValue) {
		try {
			WebElement productTypeDropdownWebEelement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(collateralName_xpath));
			Select sel = new Select(productTypeDropdownWebEelement);
			List<WebElement> list = sel.getOptions();
			for (WebElement ele : list) {
				if (ele.getText().equals(collateralNameDropdownValue)) {
					ele.click();
					Thread.sleep(5000);
					break;
				}
			}
			return true;} 
		catch (Exception ex) {
		}
		return false;
	}
	
	public boolean asOfDate(String asOfDate){
		try{
			//Thread.sleep(5000);
			WebElement DateWebElement=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(asOfDate_xpath));
			DateWebElement.getText().equalsIgnoreCase(asOfDate);
			System.out.println("asOfDate");
			return true;
			
		}
		catch(Exception e){
			
		}
		return false;
		
		}
	public boolean actualValue(String actualValue){
		try{
			//Thread.sleep(5000);
			WebElement DateWebElement=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(actualDate_xpath));
			DateWebElement.getText().equalsIgnoreCase(actualValue);
			System.out.println("actualValue");
			return true;
			
		}
		catch(Exception e){
			
		}
		return false;
		
		}
	
	public boolean ineligibleValue(String ineligibleValue){
		try{
			//Thread.sleep(5000);
			WebElement ineligibleValueWebElement=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(ineligibleValue_xpath));
			ineligibleValueWebElement.getText().equalsIgnoreCase(ineligibleValue);
			System.out.println("ineligibleValue");
			return true;
			
		}
		catch(Exception e){
			
		}
		return false;
		
		}
	
	public boolean eligibleValue(String eligibleValue){
		try{
			//Thread.sleep(5000);
			WebElement eligibleValueWebElement=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(eligibleValue_xpath));
			eligibleValueWebElement.getText().equalsIgnoreCase(eligibleValue);
			System.out.println("eligibleValue");
			return true;
			
		}
		catch(Exception e){
			
		}
		return false;
		
		}
	
	public boolean cogs(String cogs){
		try{
			//Thread.sleep(5000);
			WebElement cogsWebElement=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(cogs_xpath));
			cogsWebElement.getText().equalsIgnoreCase(cogs);
			System.out.println("cogs");
			return true;
			
		}
		catch(Exception e){
			
		}
		return false;
		
		}
	public boolean nolv(String nolv){
		try{
			//Thread.sleep(5000);
			WebElement nolvWebElement=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(nolv_xpath));
			nolvWebElement.getText().equalsIgnoreCase(nolv);
			System.out.println("nolv");
			return true;
			
		}
		catch(Exception e){
			
		}
		return false;
		
		}
	
	public boolean ltv(String lotv){
		try{
			//Thread.sleep(5000);
			WebElement lotvWebElement=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(lotv_xpath));
			lotvWebElement.getText().equalsIgnoreCase(lotv);
			System.out.println("ltv");
			return true;
			
		}
		catch(Exception e){
			
		}
		return false;
		
		}

	public boolean adjustmentAdvance(String adjustment){
		try{
			//Thread.sleep(5000);
			WebElement adjustmentWebElement=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(adjustmentAdvance_xpath));
			adjustmentWebElement.getText().equalsIgnoreCase(adjustment);
			System.out.println("adjustmentAdvance");
			return true;
			
		}
		catch(Exception e){
			
		}
		return false;
		
		}
	
	public boolean collateralValue(String collateral){
		try{
			//Thread.sleep(5000);
			 //WebElement scroll = driver.findElement(By.xpath("(//table[@role='presentation'])[3]//tbody/tr/td[14]"));\
		
			WebElement scrollWebElement=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(collateralValue_xpath));
			scrollWebElement.getText().equalsIgnoreCase(collateral);
			System.out.println("collateralValue");
			return true;
			
		}
		catch(Exception e){
			
		}
		return false;
		
		}
	public boolean subLimit(String sublimit){
		try{
			Thread.sleep(2000);
			WebElement sublimitWebElement=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(subLimit_xpath));
			sublimitWebElement.getText().equalsIgnoreCase(sublimit);
			System.out.println("subLimit");	
			return true;
			
		}
		catch(Exception e){
			
		}
		return false;
		
		}
	
	public boolean available(String available){
		try{
			//Thread.sleep(5000);
			WebElement availableWebElement=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(available_xpath));
			availableWebElement.getText().equalsIgnoreCase(available);
			System.out.println("available");
			return true;
			
		}
		catch(Exception e){
			
		}
		return false;
		
		}
	
	public boolean ineligibiltyReason(String reason){
		try{
			//Thread.sleep(5000);
			WebElement ineligibiltyWebElement=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(ineligibiltyReason_xpath));
			ineligibiltyWebElement.getText().equalsIgnoreCase(reason);
			System.out.println("ineligibiltyReason");
			return true;
			
		}
		catch(Exception e){
			
		}
		return false;
		
		}
	
	public boolean ineligibiltyAmount(String amount){
		try{
			//Thread.sleep(5000);
			WebElement ineligibiltyWebElement=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(ineligibiltyAmount_xpath));
			ineligibiltyWebElement.getText().equalsIgnoreCase(amount);
			System.out.println("ineligibiltyAmount");
			return true;
			
		}
		catch(Exception e){
			
		}
		return false;
		
		}
	
	public boolean ineligibiltyAmountTotal(String total){
		try{
			//Thread.sleep(5000);
			WebElement ineligibiltyWebElement=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(totalIneligible_xpath));
			ineligibiltyWebElement.getText().equalsIgnoreCase(total);
			System.out.println("ineligibiltyAmountTotal");
			return true;
			
		}
		catch(Exception e){
			
		}
		return false;
		
		}
	
	public boolean eomTotal(String eom){
		try{
			//Thread.sleep(5000);
			WebElement eomWebElement=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(eomTotal_xpath));
			eomWebElement.getText().trim().equalsIgnoreCase(eom);
			System.out.println("eomTotal");
			return true;
			
		}
		catch(Exception e){
			
		}
		return false;
		
		}
	
	public boolean eligibleAccountsInventories(String eligibleAccInventories){
		try{
			//Thread.sleep(5000);
			WebElement AccountRecWebElement=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(eligibleAccInventory_xpath));
			AccountRecWebElement.getText().trim().equalsIgnoreCase(eligibleAccInventories);
			System.out.println("eligibleAccountsInventories");
			return true;
			
		}
		catch(Exception e){
			
		}
		return false;
		
		}
	
	public boolean accountsInventoriesCollateral(String accountInventory){
		try{
			//Thread.sleep(5000);
			WebElement AccountInventoryWebElement=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(accInventoriesCollateral_xpath));
			AccountInventoryWebElement.getText().trim().equalsIgnoreCase(accountInventory);
			System.out.println("accountsInventoriesCollateral");
			return true;
			
		}
		catch(Exception e){
			
		}
		return false;
		
		}
	
}
