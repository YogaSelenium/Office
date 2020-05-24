package com.cync.FactoringPages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.cync.base.BasePage;

public class BrokerFeeSetupPageFactoring extends BasePage
{
	private final By BrokerFeeSetupPageFactoring_xpath = By.xpath("//span[@class='paneltitle']");
	private final By Brokerdropdown_xpath=By.xpath("//select[@name='broker_fee[selected_broker]']");
	private final By EditButton_xpath=By.xpath("//button[@class='view-button save_btn']");
	private final By Activate_xpath=By.xpath("//input[@name='broker_active']");
	private final By Activate_Save_xpath=By.xpath("//input[@type='submit']");
	//private final By ClientNameDropdown_xpath=By.xpath("//select[@id='jqg1_borrower_id']");
	private final By ClientNameDropdown_xpath=By.xpath("//select[@class='editable inline-edit-cell ui-widget-content ui-corner-all' and @name='borrower_id']");
	//private final By AddButton_xpath=By.xpath("//td[@title='Add Record']");
	private final By AddButton_xpath=By.xpath("//span[@class='ui-icon ui-icon ui-icon-plus']");
	private final By BrokerDays_xpath=By.xpath("/html[1]/body[1]/div[3]/div[1]/div[2]/div[4]/div[1]/div[1]/div[2]/div[1]/div[4]/div[1]/div[3]/div[3]/div[1]/table[1]/tbody[1]/tr[2]/td[4]/input[1]");
	//private final By CommissionPercentage_xpath=By.xpath("//input[@id='jqg1_commission_pct']");
	private final By CommissionPercentage_xpath=By.xpath("/html[1]/body[1]/div[3]/div[1]/div[2]/div[4]/div[1]/div[1]/div[2]/div[1]/div[4]/div[1]/div[3]/div[3]/div[1]/table[1]/tbody[1]/tr[2]/td[5]/input[1]");
	private final By SaveRecord_xpath=By.xpath("//span[@class='ui-icon ui-icon ui-icon-disk']");
	
	public BrokerFeeSetupPageFactoring(WebDriver driver) {
		super(driver);
		try
		{
			
		}
		catch(Exception e)
		{
			
		}
	}
	public  String PageHeaderVerify(String Header)
    {
    	try
    	{
    		WebElement HeaderWebEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(BrokerFeeSetupPageFactoring_xpath));
		HeaderWebEelement.getText();
		Thread.sleep(2000);
    	}
    	catch(Exception e)
    	{
    		
    	}
    	return Header;
    }
	
	public  boolean ClickonBrokerDropdown(String value) {
		try {
			WebElement DropdownWebEelement = new WebDriverWait(driver, 10)
			.until(ExpectedConditions.visibilityOfElementLocated(Brokerdropdown_xpath));
			
			Select sel = new Select(DropdownWebEelement);
			
			List<WebElement> list = sel.getOptions();
			
			for (WebElement ele : list) 
			{
				/*String data = ele.getText();
				System.out.println(data);*/
				if (ele.getText().contains(value)) 
				{
			 		ele.click();
					// return true;
				}
			}
		} 
		catch (Exception ex)
		{
			return false;
		}
		return true;	
	}
	public boolean clickOnEdit()
	{
	try{

		WebElement Webelement=new WebDriverWait(driver,5)
		.until(ExpectedConditions.visibilityOfElementLocated(EditButton_xpath));
		Webelement.click();
		
return true;
	}
	catch(Exception ex){
		return false;
	}

	}
	public boolean clickOnActiveCheckbox()
	{
	try{

		WebElement Webelement=new WebDriverWait(driver,5)
		.until(ExpectedConditions.visibilityOfElementLocated(Activate_xpath));
		Webelement.click();
		

	}
	catch(Exception ex){
		return false;
	}
	return true;
	}
	public boolean clickOnActivateSave()
	{
	try{

		WebElement Webelement=new WebDriverWait(driver,5)
		.until(ExpectedConditions.visibilityOfElementLocated(Activate_Save_xpath));
		Webelement.click();
		

	}
	catch(Exception ex){
		return false;
	}
    return true;
	}
	
	
	public boolean clickOnAdd()
	{
	try{

		WebElement aWebelement=new WebDriverWait(driver,100)
		.until(ExpectedConditions.visibilityOfElementLocated(AddButton_xpath));
		aWebelement.click();
		//aWebelement.click();

	}
	catch(Exception ex){
		return false;
	}
	return true;
	}
	//*******/
	
	//********/
	public  boolean ClickonClientDropdown(String ClientNameData) {
		try {
			Thread.sleep(2000);
			WebElement DropdownWebEelement = new WebDriverWait(driver, 10)
			.until(ExpectedConditions.visibilityOfElementLocated(ClientNameDropdown_xpath));
			
		//	DropdownWebEelement.click();
			
			Select sel = new Select(DropdownWebEelement);
			
			List<WebElement> list=sel.getOptions();
			
			for (WebElement ele :list) 
			{
				String data = ele.getText();
				//System.out.println(data);
				//if(data.equals(ClientNameData))
				//	ele.click();
				
				if (ele.getText().equalsIgnoreCase(ClientNameData)) 
				{
			 		//ele.sendKeys(ClientNameData);
			 		ele.click();
			 		//ele.click();
			 		
					 return true;
				}
			}
		} 
		catch (Exception ex)
		{
			return false;
		}
		return true;	
	}
	public String addValueToDaysTextBox(String BrokerDaysData)
	{
	try{
		WebElement codeTextBoxWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.elementToBeClickable(BrokerDays_xpath));
		codeTextBoxWebEelement.clear();
		codeTextBoxWebEelement.sendKeys(BrokerDaysData);
		
		Thread.sleep(2000);
		
	}
	catch(Exception ex){
	  
	}
	return BrokerDaysData;
	//return true;
	}
	public String addValueBrokerDaysTextBoxi(String BrokerDaysData)
	{
	try{
		
		Thread.sleep(2000);
		WebElement textBoxWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(BrokerDays_xpath));
		textBoxWebEelement.click();
		            textBoxWebEelement.sendKeys(BrokerDaysData);
		
	}
	catch(Exception ex){
	  
	}
	return BrokerDaysData;
	//return true;
	}
	public String addValueBrokerDaysTextBoxii(String BrokerData)
	{
	try{
		
		Thread.sleep(2000);
		WebElement textBoxWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(BrokerDays_xpath));
		
		
		textBoxWebEelement.click();
		            textBoxWebEelement.sendKeys(BrokerData);
		
	}
	catch(Exception ex){
	  
	}
	return BrokerData;
	//return true;
	}
	public String addValueCommissinpercentageTextBoxi(String CommissionPercentageData)
	{
	try{
		
		Thread.sleep(2000);
		WebElement textBoxWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(CommissionPercentage_xpath));
		
		
		textBoxWebEelement.click();
		            textBoxWebEelement.sendKeys(CommissionPercentageData);
		
	}
	catch(Exception ex){
	  
	}
	return CommissionPercentageData;
	//return true;
	}
	public String addValueCommissinpercentageTextBox(String CommissionPercentageData)
	{
	try{
		
		Thread.sleep(2000);
		WebElement codeTextBoxWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.elementToBeClickable(CommissionPercentage_xpath));
		codeTextBoxWebEelement.click();
		codeTextBoxWebEelement.sendKeys(CommissionPercentageData);
			
	}
	catch(Exception ex)
	{
	  
	}
	return CommissionPercentageData;
	}
	
	
	
	
	public boolean clickOnSave()
	{
	try{

		WebElement Webelement=new WebDriverWait(driver,5)
		.until(ExpectedConditions.visibilityOfElementLocated(SaveRecord_xpath));
		Webelement.click();
		
return true;
	}
	catch(Exception ex){
		return false;
	}

	}
	
}
