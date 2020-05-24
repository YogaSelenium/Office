package com.cync.pages;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Random;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.SkipException;

import com.cync.base.BasePage;


public class ABLClientCreationPage extends BasePage 
{
	
	private final By ablClientCreationPageHeader_xpath = By.xpath("//span[contains(text(),'Client Information')]");
	private final By clientNameTextBox_xpath = By.id("borrower_client_name");
	private final By shortNameTextBox_xpath = By.id("borrower_short_name"); 
	private final By clientNumTextBox_xpath = By.id("borrower_client_number"); 
	private final By bbcDateTextBox_xpath = By.id("borrower_bbc_frequency_date"); 
//	private final By naicsCodeTextBox_xpath = By.id("naics_code");
	private final By naicsCodeTextBox_xpath = By.xpath("//input[@id='naics_code']");
	private final By saveBtn_xpath = By.id("borrower_save_bt"); 
	private final By ablClientCreatonMsg_xpath = By.xpath("//strong[@class='extend_message']");
//	private final By selectNaicsCode_xpath = By.xpath("//a[@id='ui-id-331']");
	
	private final By selectNaicsCode_xpath = By.xpath("//ul[@class='ui-autocomplete ui-menu ui-widget ui-widget-content ui-corner-all']//li[1]");
	private final By selectManager_xpath = By.xpath("(//input[@id='borrower_manager_ids_'])[1]");
	private final By creditLineTextBox_xpath = By.id("limit_amount"); 
	private final By managerSelect_xpath = By.xpath("//div[@class='multiselect']"); 

	
	private final By selectClient_xpath = By.id("select2-choose_borrower-container");
	private final By searchClientTextBox_xpath = By.xpath("//input[@type='search']");
	private final By searchClient_xpath = By.xpath("//span[@class='select2-results']");
	
	private final By CreditLimit_xpath=By.xpath("//input[@id='limit_amount']");

	

	public ABLClientCreationPage(WebDriver driver) {
		super(driver);
		try{
			if(!driver.findElement(ablClientCreationPageHeader_xpath).getText().trim().contains("Client Information")){
				throw new SkipException("ABL Client Creation page couldn't open.");
			
			}}
		catch(Exception e){
			
		// TODO Auto-generated constructor stub
			e.printStackTrace();
	}
		
		// TODO Auto-generated constructor stub

}
	

 
	 public String HeaderVerify(String Header)
		{
		try{
			WebElement HeaderWebEelement=new WebDriverWait(driver,10)
				.until(ExpectedConditions.visibilityOfElementLocated(ablClientCreationPageHeader_xpath));
			HeaderWebEelement.getText();
			Thread.sleep(1000);
			
		}
		catch(Exception ex){
			
		}
		return Header;
		
		}  
	
	
	
	
	public String addValueToClientnameTextBox(String clientnameData)
	{
	try{
		WebElement codeTextBoxWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(clientNameTextBox_xpath));
		codeTextBoxWebEelement.clear();
		codeTextBoxWebEelement.sendKeys(clientnameData);
		
		Thread.sleep(1000);
		
	}
	catch(Exception ex){
	  
	}
	return clientnameData;
	}
	
	public String DataWithTimeStamp(String clientnameData)
	{
	try{
		WebElement codeTextBoxWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(clientNameTextBox_xpath));
		codeTextBoxWebEelement.clear();
		codeTextBoxWebEelement.sendKeys(clientnameData+(new SimpleDateFormat("ddMMMyy_hh_mm_ss")
		.format(new Date())));
		Thread.sleep(1000);
		
	}
	catch(Exception ex){
	  
	}
	return clientnameData;
	}
	
	
	
	
	public boolean uniqueDataGenerate() {
		// Generate random id, for example 283952-V8M32
	    try{
	    int length=7;
		char[] chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789abcdefghijklmnopqrstuvwxyz"
				.toCharArray();
		Random rnd = new Random();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < length; i++)
			sb.append(chars[rnd.nextInt(chars.length)]);
		String ranData = sb.toString();
		WebElement shortNameTextBoxWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(shortNameTextBox_xpath));
		shortNameTextBoxWebEelement.clear();
		shortNameTextBoxWebEelement.sendKeys(ranData);
	}
	catch(Exception ex){

	}
	    return false;
	 
			
	}
	
	
	
	
	
	public String addValueToShortnameTextBox(String ShortnameData)
	{
	try{
		WebElement shortNameTextBoxWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(shortNameTextBox_xpath));
		shortNameTextBoxWebEelement.clear();
		shortNameTextBoxWebEelement.sendKeys(ShortnameData);
		Thread.sleep(1000);
	
	}
	catch(Exception ex){

	}
	return ShortnameData;

	}
	
	public String addValueToClientNumTextBox(String ClientNumData)
	{
	try{
		WebElement clientNumTextBoxWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(clientNumTextBox_xpath));
		clientNumTextBoxWebEelement.clear();


		String ClientNumData1 = RandomStringUtils.random(7, ClientNumData);
		System.out.println(ClientNumData1);
		clientNumTextBoxWebEelement.sendKeys(ClientNumData1);
		Thread.sleep(2000);


		clientNumTextBoxWebEelement.sendKeys(ClientNumData);
		Thread.sleep(1000);

	
	}
	catch(Exception ex){

	}
	return ClientNumData;

	}

	public String addValueToStartingBBCDate(String BBCDateData)
	{
	try{
		WebElement bbcDateTextBoxWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(bbcDateTextBox_xpath));
		bbcDateTextBoxWebEelement.clear();
		bbcDateTextBoxWebEelement.sendKeys(BBCDateData);
		bbcDateTextBoxWebEelement.sendKeys(Keys.ESCAPE);
		
		Thread.sleep(1000);
	
	}
	catch(Exception ex){

	}
	return BBCDateData;

	}
	
	
	public String addValueToNaicsCode(String NaicsCodeData)
	{
	try{
		WebElement naicsCodeTextBoxWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(naicsCodeTextBox_xpath));
		naicsCodeTextBoxWebEelement.clear();
		naicsCodeTextBoxWebEelement.sendKeys(NaicsCodeData);
		
		Thread.sleep(1000);
	
	}
	catch(Exception ex){

	}
	return NaicsCodeData;

	}
	
	public boolean SelectManager()
	{
	try{

		WebElement selectWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(selectManager_xpath));
		selectWebEelement.click();
		Thread.sleep(1000);

		
return true;

	}
	catch(Exception ex){
		return false;
	}

	}
	
	public boolean SelectNaicsCode()
	{
	try{

		WebElement selectWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(selectNaicsCode_xpath));
//		selectWebEelement.click();
		
		Thread.sleep(1000);
		Actions act=new Actions(driver);
		act.moveToElement(selectWebEelement).click().perform();
			
		return true;
	}
	catch(Exception ex){
		return false;
	}

	}
	
	public String addValueToCreditLine(String CreditLineData)
	{
	try{
		WebElement creditLineTextBoxWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(creditLineTextBox_xpath));
		creditLineTextBoxWebEelement.clear();
		creditLineTextBoxWebEelement.sendKeys(CreditLineData);
		Thread.sleep(1000);
	
	}
	catch(Exception ex){

	}
	return CreditLineData;

	}

	public boolean SaveFunction()
	{
	try{

		WebElement saveWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(saveBtn_xpath));
		saveWebEelement.click();
		isAlertPresent();
		Thread.sleep(1000);

		
return true;
	}
	catch(Exception ex){
		return false;
	}

	}
	

	public String verifyMessageOnABLClientCreationAfterSave(String successMessage)
	    {
	    try{

	    	
	    	getClient();
	    	System.out.println(BasePage.clientName);

	       WebElement SaveWebEelement=new WebDriverWait(driver,10)
	       .until(ExpectedConditions.visibilityOfElementLocated(ablClientCreatonMsg_xpath));
	       
	      String actualMsgFromApp= SaveWebEelement.getText();
	      if(actualMsgFromApp.equalsIgnoreCase(successMessage))
	      {
		  return actualMsgFromApp; 	
	      }
	       
	      
	    }
	    catch(Exception ex){
	   
	    }
	    return successMessage;
	 
	    }
	
	
	
	public  String dynamicManagerCheckBox(String data) {
	     try {
	     WebElement mangerLabelWebEelement=new WebDriverWait(driver,10)
	      .until(ExpectedConditions.visibilityOfElementLocated(managerSelect_xpath));
	     
	      if (mangerLabelWebEelement.isEnabled()) {
	       String dataaftertrim = data.trim();
	    
	       List<WebElement> CHECKBOXlist =driver
	         .findElements(By
	           .xpath("//div[@class='multiselect']/label"));

	       for (int i = 0; i <= CHECKBOXlist.size(); i++) {

	        String mangername = CHECKBOXlist.get(i).getText();
	        String appdata = mangername.trim();

	        if (dataaftertrim.equals(appdata)) {
	         System.out.println(mangername);
	         int j = i + 1;
	   driver.findElement(
	           By.xpath("//div[@class='multiselect']/label["
	             + j + "]/input[@type='checkbox']"))
	           .click();
		Thread.sleep(2000);

	        }
	       }
	      }
	     }

	     catch (Exception e) {
	      

	     }
	     return data;

	}
	
	
	
	public  boolean dynamicManagerCheckBox1() {
	     try {
	     WebElement mangerLabelWebEelement=new WebDriverWait(driver,10)
	      .until(ExpectedConditions.visibilityOfElementLocated(managerSelect_xpath));
	     
	      if (mangerLabelWebEelement.isEnabled()) {
	       
	      WebElement element= driver.findElement(
	           By.xpath("(//div[@class='multiselect']/label)[3]/input[@type='checkbox']"));
		   Thread.sleep(1000);
		   element.click();

	        }
	      return true;    
	      
	     }

	     catch (Exception e) {	      
          return false; 
	     }
	}
	

	
	///////////////////////  
	
	public boolean SelectClientFunction()
	{
	try{

		WebElement selectClientWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(selectClient_xpath));
		selectClientWebEelement.click();
		Thread.sleep(1000);

return true;
	}
	catch(Exception ex){
		return false;
	}

	}
	
	public String addValueToSearch(String ClientData)
	{
	try{
		WebElement searchClientTextBoxWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(searchClientTextBox_xpath));
		searchClientTextBoxWebEelement.clear();
		searchClientTextBoxWebEelement.sendKeys(ClientData);
		Thread.sleep(1000);
	
	}
	catch(Exception ex){

	}
	return ClientData;

	}
	
	
	public boolean SearchClientClick()
	{
	try{

		WebElement searchClientWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(searchClient_xpath));
		searchClientWebEelement.click();
		Thread.sleep(1000);

return true;
	}
	catch(Exception ex){
		return false;
	}

	}
	public boolean addCreditValue(String CreditLimit)
	{
	try{
		WebElement clientNumTextBoxWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(CreditLimit_xpath));
		clientNumTextBoxWebEelement.clear();
		clientNumTextBoxWebEelement.sendKeys(CreditLimit);
		Thread.sleep(1000);
		return true;
	
	}
	catch(Exception ex){

	}
	return false;
	

	}

	public String addValueToStartingBBCDate1(String BBCDateData1)
	{
	try{
		WebElement bbcDateTextBoxWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(bbcDateTextBox_xpath));
		bbcDateTextBoxWebEelement.clear();
		bbcDateTextBoxWebEelement.sendKeys(BBCDateData1);
		
		Thread.sleep(1000);
	
	}
	catch(Exception ex){

	}
	return BBCDateData1;

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
	//kruthivas
	public String addValueToClientnameTextBox1(String clientnameData)
	{
	try{
		WebElement codeTextBoxWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(clientNameTextBox_xpath));
		codeTextBoxWebEelement.clear();
		codeTextBoxWebEelement.sendKeys(clientnameData);
		//Thread.sleep(2000);

		
	}
	catch(Exception ex){
	  
	}
	return clientnameData;
	}

	public String addValueToShortnameTextBox1(String ShortnameData)
	{
	try{
		WebElement shortNameTextBoxWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(shortNameTextBox_xpath));
		shortNameTextBoxWebEelement.clear();
		shortNameTextBoxWebEelement.sendKeys(ShortnameData);
		Thread.sleep(200);

	
	}
	catch(Exception ex){

	}
	return ShortnameData;

	}
	public String addValueToClientNumTextBox1(String ClientNumData)
	{
	try{
		WebElement clientNumTextBoxWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(clientNumTextBox_xpath));
		clientNumTextBoxWebEelement.clear();
		clientNumTextBoxWebEelement.sendKeys(ClientNumData);
		Thread.sleep(2000);

	
	}
	catch(Exception ex){

	}
	return ClientNumData;
	}
	
}
