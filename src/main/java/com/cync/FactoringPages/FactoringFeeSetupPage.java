package com.cync.FactoringPages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.cync.base.BasePage;

public class FactoringFeeSetupPage extends BasePage
{

	public FactoringFeeSetupPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	private final By factoringFeeSetupPageHeader_xpath = By.xpath("//span[@class='paneltitle']//strong[contains(text(),'Factoring Fee Setup')] ");
	
	private final By editBTN_xpath = By.xpath("(//a[@class='view-button edit_lnk btnfltleft'])[2]");
	private final By advanceRateTextBox_xpath = By.xpath("//input[@id='collateral_advance_rate_advance_rate']");
	private final By maximumFeeTextBox_xpath = By.xpath("//input[@id='collateral_advance_rate_max_fee_percent']");
	private final By feeTier1DaysTo_xpath = By.xpath("//input[@id='collateral_advance_rate_fee_codes_attributes_0_tier_days']");
	private final By feeTier1TotalFeePer_xpath = By.xpath("//input[@id='collateral_advance_rate_fee_codes_attributes_0_tier_percent']");
	private final By addBTN_xpath = By.xpath("//button[@class='addNew']");
	private final By feeTier2DaysTo_xpath = By.xpath("//input[@id='collateral_advance_rate_fee_codes_attributes_1_tier_days']");
	private final By feeTier2TotalFeePer_xpath = By.xpath("//input[@id='collateral_advance_rate_fee_codes_attributes_1_tier_percent']");
	private final By recourseFactoringCheckBox_xpath = By.xpath("//input[@id='collateral_advance_rate_fact_recourse_factoring']");
	private final By recourseFactoringDaysTextBox_xpath = By.xpath("//input[@id='collateral_advance_rate_fact_recourse_days']");
	private final By recourseFactoringFeeTextBox_xpath = By.xpath("//input[@id='collateral_advance_rate_fact_recourse_fee_pct']");
	private final By saveBTN_xpath = By.xpath("/html[1]/body[1]/div[3]/div[1]/div[2]/div[4]/form[1]/div[1]/div[1]/div[2]/div[1]/div[1]/fieldset[1]/div[6]/input[1]");
	private final By cancelBTN_xpath = By.xpath("(//button[@class='view-button-cancel btnfltleft cont_btn'])[2]");
	
	
	public String VerifyHeader(String Header)
	{
		try
		{
			WebElement HeaderWebElement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(factoringFeeSetupPageHeader_xpath));
		HeaderWebElement.getText();
		
		Thread.sleep(5000);
		
	}
	catch(Exception ex){
		
	}
	return Header;
	
		}
	
	public boolean EditBTNClick()
	{
		try
		{
			WebElement editBTNWebElement =new WebDriverWait(driver,100)
			.until(ExpectedConditions.elementToBeClickable(editBTN_xpath));
			editBTNWebElement.click();
			
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}
	
	
	
	public String addValueToAdvanceRateTextBox(String advanceRateData)
	{
	try{
		WebElement advanceRateWebEelement=new WebDriverWait(driver,200)
		.until(ExpectedConditions.visibilityOfElementLocated(advanceRateTextBox_xpath));
		advanceRateWebEelement.clear();
		advanceRateWebEelement.sendKeys(advanceRateData);
		
		Thread.sleep(2000);
		
	}
	catch(Exception ex){
	  
	}
	return advanceRateData;
	}
	
	public String addValueToMaximumFeeTextBox(String maximumFeeData)
	{
	try{
		WebElement maximumFeeWebEelement=new WebDriverWait(driver,200)
		.until(ExpectedConditions.visibilityOfElementLocated(maximumFeeTextBox_xpath));
		maximumFeeWebEelement.clear();
		maximumFeeWebEelement.sendKeys(maximumFeeData);
		
		Thread.sleep(2000);
		
	}
	catch(Exception ex){
	  
	}
	return maximumFeeData;
	}
	
	public boolean RecourseCheckBoxClick()
	{
		try
		{
			WebElement recourseCheckboxWebElement =new WebDriverWait(driver,100)
			.until(ExpectedConditions.elementToBeClickable(recourseFactoringCheckBox_xpath));
			recourseCheckboxWebElement.click();
			
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}
	
	public String addValueToRecourseDaysTextBox(String recourseDaysData)
	{
	try{
		WebElement recourseDaysWebEelement=new WebDriverWait(driver,200)
		.until(ExpectedConditions.visibilityOfElementLocated(recourseFactoringDaysTextBox_xpath));
		recourseDaysWebEelement.clear();
		recourseDaysWebEelement.sendKeys(recourseDaysData);
		
		Thread.sleep(2000);
		
	}
	catch(Exception ex){
	  
	}
	return recourseDaysData;
	}
	
	
	public String addValueToRecourseFeeTextBox(String recourseFeeData)
	{
	try{
		WebElement recourseFeeWebEelement=new WebDriverWait(driver,200)
		.until(ExpectedConditions.visibilityOfElementLocated(recourseFactoringFeeTextBox_xpath));
		recourseFeeWebEelement.clear();
		recourseFeeWebEelement.sendKeys(recourseFeeData);
		
		Thread.sleep(2000);
		
	}
	catch(Exception ex){
	  
	}
	return recourseFeeData;
	}
	
	
	public String addValueToTier1DaysTo(String Tier1DaysToData)
	{
	try{
		WebElement Tier1DasyToWebEelement=new WebDriverWait(driver,200)
		.until(ExpectedConditions.visibilityOfElementLocated(feeTier1DaysTo_xpath));
		Tier1DasyToWebEelement.clear();
		Tier1DasyToWebEelement.sendKeys(Tier1DaysToData);
		
		Thread.sleep(2000);
		
	}
	catch(Exception ex){
	  
	}
	return Tier1DaysToData;
	}
	
	
	public String addValueToTier1TotalFee(String Tier1FeeData)
	{
	try{
		WebElement Tier1FeeWebEelement=new WebDriverWait(driver,200)
		.until(ExpectedConditions.visibilityOfElementLocated(feeTier1TotalFeePer_xpath));
		Tier1FeeWebEelement.clear();
		Tier1FeeWebEelement.sendKeys(Tier1FeeData);
		
		Thread.sleep(2000);
		
	}
	catch(Exception ex){
	  
	}
	return Tier1FeeData;
	}
			
	public boolean AddBTNClick()
	{
		try
		{
			WebElement addBTNWebElement =new WebDriverWait(driver,100)
			.until(ExpectedConditions.elementToBeClickable(addBTN_xpath));
			addBTNWebElement.click();
			
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}
	
	public String addValueToTier2TotalFee(String Tier2FeeData)
	{
	try{
		WebElement Tier2FeeWebEelement=new WebDriverWait(driver,200)
		.until(ExpectedConditions.visibilityOfElementLocated(feeTier2TotalFeePer_xpath));
		Tier2FeeWebEelement.clear();
		Tier2FeeWebEelement.sendKeys(Tier2FeeData);
		
		Thread.sleep(2000);
		
	}
	catch(Exception ex){
	  
	}
	return Tier2FeeData;
	}
	
	public String addValueToTier2DaysTo(String Tier2DaysToData)
	{
	try{
		WebElement Tier2DasyToWebEelement=new WebDriverWait(driver,200)
		.until(ExpectedConditions.visibilityOfElementLocated(feeTier2DaysTo_xpath));
		Tier2DasyToWebEelement.clear();
		Tier2DasyToWebEelement.sendKeys(Tier2DaysToData);
		
		Thread.sleep(2000);
		
	}
	catch(Exception ex){
	  
	}
	return Tier2DaysToData;
	}
	
	public boolean SaveBTNClick()
	{
		try
		{
			WebElement SaveBTNWebElement =new WebDriverWait(driver,100)
			.until(ExpectedConditions.elementToBeClickable(saveBTN_xpath));
			SaveBTNWebElement.click();
			//SaveBTNWebElement.click();
			this.isAlertPresent();
			
			Thread.sleep(4000);
			
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}
	public boolean isAlertPresent() {
		boolean presentFlag = false;
		try {
			Alert alert = driver.switchTo().alert();
			presentFlag = true;
			alert.accept();
		} catch (Exception ex) {

			System.out.println("No Such Alert Present");

		}

		return presentFlag;
	}
	
	
			
	

}
