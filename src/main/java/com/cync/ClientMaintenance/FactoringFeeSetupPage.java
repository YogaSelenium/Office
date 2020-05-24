package com.cync.ClientMaintenance;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.SkipException;

import com.cync.base.BasePage;

public class FactoringFeeSetupPage extends BasePage{
	
	private final By factoringFeeSetupPageHeader_xpath = By.xpath("(//strong[contains(text(),'Factoring Fee Setup')])[2]");
	private final By editBTN_xpath = By.xpath("(//a[contains(text(),'Edit')])[2]");
	private final By advanceRateTextBox_xpath = By.id("collateral_advance_rate_advance_rate");
	private final By feeCalculatedOnDropdown_xpath = By.id("collateral_advance_rate_fee_calculated_on");
	private final By feeTierAddNewBTN_xpath = By.xpath("//span[contains(@class,'help-inline')]");
	private final By feeTier1DaysTextBox_xpath = By.id("collateral_advance_rate_fee_codes_attributes_0_tier_days");
	private final By feeTier1PerTextBox_xpath = By.id("collateral_advance_rate_fee_codes_attributes_0_tier_percent");
	private final By saveBTN_xpath = By.id("update_fee");
	private final By cancelBTN_xpath = By.xpath("(//button[contains(text(),'Cancel')])[3]");
	
	private final By feeTierAdditionBTN1_xpath = By.xpath("(//span[@class='help-inline'])[2]");
	private final By feeTierDeductBTN1_xpath = By.xpath("(//span[@class='help-inline'])[1]");
	private final By feeTier2DaysTextBox_xpath = By.id("collateral_advance_rate_fee_codes_attributes_1_tier_days");
	private final By feeTier2PerTextBox_xpath = By.id("collateral_advance_rate_fee_codes_attributes_1_tier_percent");
	
	
	
	

	public FactoringFeeSetupPage(WebDriver driver) {
		super(driver);
		try
		{
			if(!driver.findElement(factoringFeeSetupPageHeader_xpath).getText().trim().contains("Client Information"))
				throw new SkipException("Factoring Client Creation page couldn't open.");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	
	public String VerifyHeader(String Header)
	{
		try
		{
			WebElement HeaderWebEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(factoringFeeSetupPageHeader_xpath));
		HeaderWebEelement.getText();
		Thread.sleep(5000);
		
	}
	catch(Exception ex){
		
	}
	return Header;
	
	}
	
	public boolean ClickOnEditBTN()
	{
		try
		{
			WebElement EditBTNWebElement =new WebDriverWait(driver,100)
			.until(ExpectedConditions.elementToBeClickable(editBTN_xpath));
			EditBTNWebElement.click();
			
			Thread.sleep(5000);
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}
	
	public boolean ClickOnSaveBTN()
	{
		try
		{
			WebElement SaveBTNWebElement =new WebDriverWait(driver,100)
			.until(ExpectedConditions.elementToBeClickable(saveBTN_xpath));
			SaveBTNWebElement.click();
			
			Thread.sleep(5000);
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}
	
	public boolean ClickOnCancelBTN()
	{
		try
		{
			WebElement CancelBTNWebElement =new WebDriverWait(driver,100)
			.until(ExpectedConditions.elementToBeClickable(cancelBTN_xpath));
			CancelBTNWebElement.click();
			
			Thread.sleep(5000);
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}
	
	public String addValueToAdvanceRate(String advanceRateData)
	{
		try
		{
			WebElement AdvanceRateWebElement =new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(advanceRateTextBox_xpath));
			AdvanceRateWebElement.clear();
			AdvanceRateWebElement.sendKeys(advanceRateData);
			
			Thread.sleep(5000);
		}
		catch(Exception e)
		{
			
		}
		return advanceRateData;
	}
	
	public boolean ClickOnFeeTierAddNewBTN()
	{
		try
		{
			WebElement FeeTierAddNewWebElement =new WebDriverWait(driver,100)
			.until(ExpectedConditions.elementToBeClickable(feeTierAddNewBTN_xpath));
			FeeTierAddNewWebElement.click();
			
			Thread.sleep(5000);
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}
	
	public String addValueToFeeTier_1Days(String feeTierDaysData)
	{
		try
		{
			WebElement FeeTierDaysWebElement =new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(feeTier1DaysTextBox_xpath));
			FeeTierDaysWebElement.clear();
			FeeTierDaysWebElement.sendKeys(feeTierDaysData);
			
			Thread.sleep(5000);
		}
		catch(Exception e)
		{
			
		}
		return feeTierDaysData;
	}
	
	public String addValueToFeeTier_1Per(String feeTierPerData)
	{
		try
		{
			WebElement FeeTierPerWebElement =new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(feeTier1PerTextBox_xpath));
			FeeTierPerWebElement.clear();
			FeeTierPerWebElement.sendKeys(feeTierPerData);
			
			Thread.sleep(5000);
		}
		catch(Exception e)
		{
			
		}
		return feeTierPerData;
	}
	
	public boolean ClickOnFeeTierAdditionBTN()
	{
		try
		{
			WebElement FeeTierAdditionWebElement =new WebDriverWait(driver,100)
			.until(ExpectedConditions.elementToBeClickable(feeTierAdditionBTN1_xpath));
			FeeTierAdditionWebElement.click();
			
			Thread.sleep(5000);
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}
	
	
	public boolean ClickOnFeeTierDeductionBTN()
	{
		try
		{
			WebElement FeeTierDeductionWebElement =new WebDriverWait(driver,100)
			.until(ExpectedConditions.elementToBeClickable(feeTierDeductBTN1_xpath));
			FeeTierDeductionWebElement.click();
			
			Thread.sleep(5000);
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}


	public String addValueToFeeTier_2Days(String feeTier2Days) {
		try
		{
			WebElement FeeTierDaysWebElement =new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(feeTier2DaysTextBox_xpath));
			FeeTierDaysWebElement.clear();
			FeeTierDaysWebElement.sendKeys(feeTier2Days);
			
			Thread.sleep(5000);
		}
		catch(Exception e)
		{
			
		}
		return feeTier2Days;
	
	}


   public String addValueToFeeTier_2Per(String feeTier2Per) {
	   try
	   {
		WebElement FeeTierPerWebElement =new WebDriverWait(driver,100)
		.until(ExpectedConditions.visibilityOfElementLocated(feeTier2PerTextBox_xpath));
		FeeTierPerWebElement.clear();
		FeeTierPerWebElement.sendKeys(feeTier2Per);
		
		Thread.sleep(5000);
	  }
	  catch(Exception e)
	  {
	 	
	  }
    	return feeTier2Per;

     }
   
   public boolean addValueToFeeCalculatedOnDropdown(String feeCalOnData)
   {
	   try
	   {
		   WebElement FeeCalculatedOnWebElement =new WebDriverWait(driver,100)
		   .until(ExpectedConditions.visibilityOfElementLocated(feeCalculatedOnDropdown_xpath));
		   FeeCalculatedOnWebElement.click();
		   
		   Select sel = new Select(FeeCalculatedOnWebElement);
		   
		   List<WebElement> list = sel.getOptions();
		   
		   for(WebElement ele : list)
		   {
			   String data = ele.getText();
			   System.out.println(data);
			   
			   if(data.equals(feeCalOnData))
			   {
				   ele.click();
				   return true;
			   }	   
		   }  
	   }
	   catch(Exception e)
	   {
		   return false;
	   }
	   return false;
   }
	


}
