package com.cync.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.cync.base.BasePage;

public class InterestRecalculationPage extends BasePage {

	private final By BreadCrum_xpath=By.xpath("//div[@id='breadcrumb_container']");
	private final By Header_xpath=By.xpath("//span[@class='paneltitle']");
	private final By ABLClient_xpath=By.xpath("//select[@id='client']");
	private final By ReCalculationFrom_xpath=By.xpath("//input[@id='from_date']");
	private final By ReCalculationUntil_xpath=By.xpath("//input[@id='to_date']");
	private final By ReCalculate_xpath=By.xpath("//button[@id='interest_recalculate_bt']");
	private final By ABLclientField_xpath=By.xpath("(//label[@class='control-label required'])[1]");
	private final By ReCalculationFromField_xpath=By.xpath("(//label[@class='control-label required'])[2]");
	private final By ReCalculationUntilField_xpath=By.xpath("(//label[@class='control-label required'])[3]");
	private final By ErrorMessage_xpath=By.xpath("//li[@style='text-align: left']");
	
	
	public InterestRecalculationPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	
	public String verifyBreadcrumb(String Breadcrumb)
	{
		try{
			WebElement breadcrumbWebEelement=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(BreadCrum_xpath));
			String actualData=breadcrumbWebEelement.getText().trim();
			if(actualData.equalsIgnoreCase(Breadcrumb));
		}
		catch(Exception ex){
			
		}
		return Breadcrumb;

		}
	
	
	public boolean HeaderVerify(String InterestRecalculationLoansHeader)
	{
	 
	try{
		WebElement HeaderWebEelement=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(Header_xpath));
		String actual = HeaderWebEelement.getText();
		if (actual.equals(InterestRecalculationLoansHeader))
			return true;
		else
			return false;

	} catch (Exception e) {
		return false;
	}
    }
	  
	
	public boolean VerifyABLClient()
	{
		try
		{
			WebElement ABLClientWebEelement=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(ABLClient_xpath));	
			ABLClientWebEelement.isDisplayed();
			return true;
		}
		 catch (Exception e) {
			return false;
		}
	}

	
	public boolean VerifyReCalculationFrom()
	{
		try
		{
			WebElement RecalculationFromWebEelement=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(ReCalculationFrom_xpath));	
			RecalculationFromWebEelement.isDisplayed();
			return true;
		}
		 catch (Exception e) {
			return false;
		}
	}

	
	public boolean VerifyReCalculationUntil()
	{
		try
		{
			WebElement RecalculationUntilWebEelement=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(ReCalculationUntil_xpath));	
			RecalculationUntilWebEelement.isDisplayed();
			return true;
		}
		 catch (Exception e) {
			return false;
		}
	}

	
	public boolean VerifyReCalculate()
	{
		try
		{
			WebElement RecalculateWebEelement=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(ReCalculate_xpath));	
			RecalculateWebEelement.isDisplayed();
			return true;
		}
		 catch (Exception e) {
			return false;
		}
	}

	public boolean VerifyABLClientField()
	{
		try
		{
			WebElement ABLClientFieldWebEelement=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(ABLclientField_xpath));	
			ABLClientFieldWebEelement.isDisplayed();
			return true;
		}
		 catch (Exception e) {
			return false;
		}
	}

	public boolean VerifyReCalculateFromField()
	{
		try
		{
			WebElement RecalculateFromFieldWebEelement=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(ReCalculationFromField_xpath));	
			RecalculateFromFieldWebEelement.isDisplayed();
			return true;
		}
		 catch (Exception e) {
			return false;
		}
	}

	public boolean VerifyReCalculateUntilField()
	{
		try
		{
			WebElement RecalculateUntilFieldWebEelement=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(ReCalculationUntilField_xpath));	
			RecalculateUntilFieldWebEelement.isDisplayed();
			return true;
		}
		 catch (Exception e) {
			return false;
		}
	}

	
	
	public boolean ValidationReCalculationFrom(String FromDate)
	{
	 
	try{
		WebElement ReCalculationWebEelement=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(ReCalculationFrom_xpath));
		ReCalculationWebEelement.clear();
		ReCalculationWebEelement.sendKeys(FromDate);
		ReCalculationWebEelement.sendKeys(Keys.ESCAPE);
		Thread.sleep(1000);
			return true;

	} catch (Exception e) {
		return false;
	}
    }
	
	public boolean ValidationReCalculationUntil(String ToDate)
	{
	 
	try{
		WebElement ReCalculationWebEelement=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(ReCalculationUntil_xpath));
		ReCalculationWebEelement.clear();
		ReCalculationWebEelement.sendKeys(ToDate);
		ReCalculationWebEelement.sendKeys(Keys.ESCAPE);
		
		Thread.sleep(1000);
		
			return true;

	} catch (Exception e) {
		return false;
	}
    }
	
	
	public boolean ValidationReCalculate()
	{
		try
		{
			WebElement RecalculateWebEelement=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(ReCalculate_xpath));	
			RecalculateWebEelement.click();
			
			Thread.sleep(1000);
			return true;
		}
		 catch (Exception e) {
			return false;
		}
	}

	
	public boolean ValidationABLClient(String client)
	{
		try
		{
			WebElement RecalculateWebEelement=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(ABLClient_xpath));	
			RecalculateWebEelement.click();;
			
			RecalculateWebEelement.sendKeys(client);
			return true;
		}
		 catch (Exception e) {
			return false;
		}
	}
	
	public boolean VerifyErrorMessage(String message)
	{
	 
	try{
		WebElement HeaderWebEelement=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(ErrorMessage_xpath));
		String actual = HeaderWebEelement.getText();
		if (actual.equals(message))
			return true;
		

	} catch (Exception e) {
		return false;
	}
	return false;
    }
	
	
	
}
