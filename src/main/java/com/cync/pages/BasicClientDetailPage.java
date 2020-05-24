package com.cync.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.SkipException;

import com.cync.base.BasePage;

public class BasicClientDetailPage extends BasePage {

    private final By editBtnClick_xpath = By.id("detail_parameter_edit");
   private final By activeCheck_xpath = By.id("borrower_active");
   private final By saveBtnClick_xpath = By.xpath("//button[contains(text(),'Save')]");
   private final By BasicClientDetailPageHeader_xpath = By.xpath("//span[contains(text(),'Basic Client Detail')]");


   private final By Clientno_xpath=By.xpath("//label[contains(text(),'Client Name')]");
   private final By BBcFrequency_xpath=By.xpath("//label[contains(text(),'BBC Frequency')]");
   private final By StartingDate_xpath=By.xpath("//label[contains(text(),'Starting BBC Date')]");
   private final By Nascicode_xpath=By.xpath("//label[contains(text(),'NAICS Code')]");
   private final By client_xpath=By.xpath(" //input[@value='BUCKET1234']");
   private final By shortname_xpath=By.xpath("//input[@id='borrower_short_name']");
    private final By clientnum_xpath=By.xpath("//input[@id='borrower_client_number']");
    private final By description_xpath=By.xpath("//textarea[@name='borrower[description]']");


	public BasicClientDetailPage(WebDriver driver) {

		super(driver);
		try{
			if(!driver.findElement(BasicClientDetailPageHeader_xpath).getText().trim().contains("Basic Client Detail")){
				throw new SkipException("Basic Client Detail page couldn't open.");
			
			}}
		catch(Exception e){
			
		// TODO Auto-generated constructor stub
			e.printStackTrace();
	}
		
		// TODO Auto-generated constructor stub
		
	}
	

	public boolean ClickOnEditVerify()
	{
		try{
		
		WebElement editWebelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(editBtnClick_xpath));
		editWebelement.click();

		Thread.sleep(1000);

		
		Thread.sleep(500);

		
		return true;
	}
	

	catch(Exception ex){
		return false;
	}
		
	}
	
	
	public boolean ClickOnActiveCheckBoxVerify()
	{
		try{
		
		WebElement activeCheckWebelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(activeCheck_xpath));
		activeCheckWebelement.click();
		Thread.sleep(1000);
		
		return true;
	}
	

	catch(Exception ex){
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
	
	public boolean ClickOnSaveBtnVerify()
	{
		try{
		
		WebElement saveBtnWebelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(saveBtnClick_xpath));
		saveBtnWebelement.click();
		this.isAlertPresent();
		


		Thread.sleep(1000);

		


		
		return true;
	}
	

	catch(Exception ex){
		return false;
	}
		

	}

	//Method to display client no
	

		public boolean verifyClientno()
		{
			try{
			
			WebElement activeCheckWebelement=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(Clientno_xpath));
			activeCheckWebelement.isDisplayed();
			
			
			return true;
		}
		

		catch(Exception ex){
			return false;
		}
			
		}
		
		//Method to display BBC frequency
		
		
		public boolean verifyBBCFrequency()
		{
			try{
			
			WebElement activeCheckWebelement=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(BBcFrequency_xpath));
			activeCheckWebelement.isDisplayed();
			
			
			return true;
		}
		

		catch(Exception ex){
			return false;
		}
			
		}
		
		//Method to Verify starting date
		
		public boolean verifyStartingDate()
		{
			try{
			
			WebElement activeCheckWebelement=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(StartingDate_xpath));
			activeCheckWebelement.isDisplayed();
			
			
			return true;
		}
		

		catch(Exception ex){
			return false;
		}
			
		}
		
		//Method to Verify NAsciCode
		
		

		public boolean verifyNasciCode()
		{
			try{
			
			WebElement activeCheckWebelement=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(Nascicode_xpath));
			activeCheckWebelement.isDisplayed();
			
			
			return true;
		}
		

		catch(Exception ex){
			return false;
		}
			
		}
		
		//Method to enter value in client name
		
		public String enterClientName(String c)
		{
			try{
			
			WebElement activeCheckWebelement=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(client_xpath));
			activeCheckWebelement.clear();
			activeCheckWebelement.click();
			activeCheckWebelement.sendKeys(c);
			
			
		}
		

		catch(Exception ex){
			
		}
			return c;
		}
		
		
		//Method to enter value in short name
		
		public String enterShortName(String s)
		{
			try{
			
			WebElement activeCheckWebelement=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(shortname_xpath));
			activeCheckWebelement.clear();
			activeCheckWebelement.click();
			activeCheckWebelement.sendKeys(s);
			
			
		}
		

		catch(Exception ex){
			
		}
			return s;
		}
		
		//Method to enter value in Client no
		

		public String enterClientNumber(String n)
		{
			try{
			
			WebElement activeCheckWebelement=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(clientnum_xpath));
			activeCheckWebelement.clear();
			activeCheckWebelement.click();
			activeCheckWebelement.sendKeys(n);
			
			
		}
		

		catch(Exception ex){
			
		}
			return n;
		}
		
		//Method  to enter description
		
		

		public String enterdescription(String d)
		{
			try{
			
			WebElement activeCheckWebelement=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(description_xpath));
			activeCheckWebelement.clear();
			activeCheckWebelement.click();
			activeCheckWebelement.sendKeys(d);
			
			
		}
		

		catch(Exception ex){
			
		}
			return d;
		}
		
		public boolean validationStartingDate(String date)
		{
			try{
			
			WebElement activeCheckWebelement=new WebDriverWait(driver,30)
			.until(ExpectedConditions.visibilityOfElementLocated(StartingDate_xpath));
			activeCheckWebelement.sendKeys(date);;
			
			
			return true;
		}
		

		catch(Exception ex){
			return false;
		}
			
		}
		
		
}
