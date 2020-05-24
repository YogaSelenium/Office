package com.cync.pages;

import java.util.List;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.SkipException;
import org.testng.asserts.SoftAssert;

import com.cync.base.BasePage;

public class FactoringClientCreationPage extends BasePage {

	private final By factoringClientCreationPageHeader_xpath = By.xpath("//span[contains(text(),'Client Information')]");
	
	private final By clientNameTextBox_xpath = By.id("borrower_client_name");
	private final By shortNameTextBox_xpath = By.id("borrower_short_name");
	private final By clientNumberTextBox_xpath = By.id("borrower_client_number");
	private final By cuurencyListBox_xpath = By.id("borrower_currency_id");
	private final By naicsCodeTextBox_xpath = By.id("naics_code");
	private final By selectNaicsCode_xpath = By.xpath("//a[text()='111110, Soybean Farming']");
	private final By parentChildListBox_xpath = By.id("borrower_parent_client_id");
	private final By managerCheckBox_xpath = By.xpath("//div[@class='multiselect']");
	
	private final By saveBTN_xpath = By.id("borrower_save_bt");
	private final By cancelBTN_xpath = By.id("borrower_cancel");
	
	private final By successMsg_xpath = By.id("message");
	
	private final By editBTN_xpath = By.id("detail_parameter_edit");
	
	
	public FactoringClientCreationPage(WebDriver driver) {
		super(driver);
		
	}
	
	public String VerifyHeader(String Header)
	{
		try
		{
			WebElement HeaderWebElement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(factoringClientCreationPageHeader_xpath));
		HeaderWebElement.getText();
		
		Thread.sleep(5000);
		
	}
	catch(Exception ex){
		
	}
	return Header;
	
		}
	
	
	public String addValueToClientnameTextBox(String clientnameData)
	{
	try{
		WebElement codeTextBoxWebEelement=new WebDriverWait(driver,200)
		.until(ExpectedConditions.visibilityOfElementLocated(clientNameTextBox_xpath));
		codeTextBoxWebEelement.clear();
		codeTextBoxWebEelement.sendKeys(clientnameData);
		
		Thread.sleep(2000);
		
	}
	catch(Exception ex){
	  
	}
	return clientnameData;
	}
	
	
	public String DataWithTimeStamp(String clientnameData)
	{
	try{
		WebElement codeTextBoxWebEelement=new WebDriverWait(driver,200)
		.until(ExpectedConditions.visibilityOfElementLocated(clientNameTextBox_xpath));
		codeTextBoxWebEelement.clear();
		codeTextBoxWebEelement.sendKeys(clientnameData+(new SimpleDateFormat("ddMMMyy_hh_mm_ss")
		.format(new Date())));
		Thread.sleep(2000);
		
	}
	catch(Exception ex){
	  
	}
	return clientnameData;
	}
	
	
	
	public boolean uniqueDataGenerate() {
		// Generate random id, for example 283952-V8M32
	    try{
	    int length=7;
		char[] chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789abcdefghijklmnopqrstuvwxyz".toCharArray();
		Random rnd = new Random();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < length; i++)
			sb.append(chars[rnd.nextInt(chars.length)]);
		String ranData = sb.toString();
		WebElement shortNameTextBoxWebEelement=new WebDriverWait(driver,200)
		.until(ExpectedConditions.visibilityOfElementLocated(shortNameTextBox_xpath));
		shortNameTextBoxWebEelement.clear();
		shortNameTextBoxWebEelement.sendKeys(ranData);
	}
	catch(Exception ex){

	}
	    return false;
	 
			
	}
	
	
	public String addValueToShortClientnameTextBox(String shortClientnameData)
	{
	try{
		WebElement codeTextBoxWebEelement=new WebDriverWait(driver,200)
		.until(ExpectedConditions.visibilityOfElementLocated(shortNameTextBox_xpath));
		codeTextBoxWebEelement.clear();
		codeTextBoxWebEelement.sendKeys(shortClientnameData);
		
		Thread.sleep(2000);
		
	}
	catch(Exception ex){
	  
	}
	return shortClientnameData;
	}
	
	
	public String addValueToClientNumTextBox(String ClientNumData)
	{
	try{
		WebElement clientNumTextBoxWebEelement=new WebDriverWait(driver,200)
		.until(ExpectedConditions.visibilityOfElementLocated(clientNumberTextBox_xpath));
		clientNumTextBoxWebEelement.clear();
		clientNumTextBoxWebEelement.sendKeys(ClientNumData);
		Thread.sleep(2000);
	
	}
	catch(Exception ex){

	}
	return ClientNumData;

	}
	
	
	public String addValueToNaicsCode(String NaicsCodeData)
	{
	try{
		WebElement naicsCodeTextBoxWebEelement=new WebDriverWait(driver,200)
		.until(ExpectedConditions.visibilityOfElementLocated(naicsCodeTextBox_xpath));
		naicsCodeTextBoxWebEelement.clear();
		naicsCodeTextBoxWebEelement.sendKeys(NaicsCodeData);
		Thread.sleep(2000);
	
	}
	catch(Exception ex){

	}
	return NaicsCodeData;

	}
	
	
	public boolean SelectNaicsCode()
	{
	try{

		WebElement selectWebEelement=new WebDriverWait(driver,100)
		.until(ExpectedConditions.visibilityOfElementLocated(selectNaicsCode_xpath));
		selectWebEelement.click();
		Thread.sleep(2000);

		
return true;
	}
	catch(Exception ex){
		return false;
	}

	}
	
	
	public  String ManagerCheckBox(String managerdata) {
	     try {
	     WebElement mangerCheckBoxWebEelement=new WebDriverWait(driver,30)
	      .until(ExpectedConditions.visibilityOfElementLocated(managerCheckBox_xpath));
	     
	      if (mangerCheckBoxWebEelement.isEnabled()) 
	      {
	       String trimManagerdata = managerdata.trim();
	    
	        List<WebElement> CHECKBOXlist =driver.findElements(By.xpath("//div[@class='multiselect']/label"));

	       for (int i = 0; i <= CHECKBOXlist.size(); i++) 
	       {

	        String mangername = CHECKBOXlist.get(i).getText();
	        String appdata = mangername.trim();

	        if (trimManagerdata.equals(appdata)) {
	         System.out.println(mangername);
	         int j = i + 1;
	              driver.findElement(By.xpath("//div[@class='multiselect']/label["
	             + j + "]/input[@type='checkbox']"))
	           .click();
		Thread.sleep(2000);

	        }
	       }
	      }
	     }

	     catch (Exception e) {
	      

	     }
	     return managerdata;

	}
	
	
	public boolean SaveBTNClick()
	{
		try
		{
			WebElement saveBTNWebElement =new WebDriverWait(driver,100)
			.until(ExpectedConditions.elementToBeClickable(saveBTN_xpath));
			saveBTNWebElement.click();
			
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}
	
	public boolean CancelBTNClick()
	{
		try
		{
			WebElement cancelBTNWebElement =new WebDriverWait(driver,100)
			.until(ExpectedConditions.elementToBeClickable(cancelBTN_xpath));
			cancelBTNWebElement.click();
			
			Alert alert = driver.switchTo().alert();
			alert.accept();
			
			WebElement clientNameWebElement =new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(clientNameTextBox_xpath));
			int clientNameLength = clientNameWebElement.getText().length();
			if(clientNameLength==0)
			{
			  return true;
			}
			else
			{
				return false;
			}		
				
		}
		catch(Exception e)
		{
			return false;
		}
	}
	
	
	public boolean VerifySuccessMessage()
	{
		try
		{
			WebElement SuccessMsgWebElement =new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(successMsg_xpath));
			SuccessMsgWebElement.isDisplayed();
			
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}

}
