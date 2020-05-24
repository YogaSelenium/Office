package com.cync.FactoringPages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.cync.base.BasePage;

public class BrokerBankInformationPageFactoring extends BasePage
{
	private final By BrokerBankInformationPageFactoring_xpath = By.xpath("//span[@class='paneltitle']");
	
	private final By Brokerdropdown_xpath= By.xpath("//select[@name='broker_fee[selected_broker]' ]");
	private final By add_xpath= By.xpath("//span[@class='ui-icon ui-icon ui-icon-plus']");
	private final By AccountNameTextBox_xpath=By.xpath("//tbody/tr[2]//td[3]/input[@name='broker_account_name']");
	//private final By BankNameTextBox_xpath=By.xpath("//input[@name='broker_bank_name' and @id='jqg1_broker_bank_name']");
	private final By BankNameTextBox_xpath=By.xpath("//input[@id='jqg2_broker_bank_name']");
	//private final By AccountNoTextBox_xpath=By.xpath("//input[@name='broker_account_number' and @id='jqg1_broker_account_number']");
	private final By AccountNoTextBox_xpath=By.xpath("/html[1]/body[1]/div[3]/div[1]/div[2]/div[4]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[3]/div[3]/div[1]/table[1]/tbody[1]/tr[2]/td[5]/input[1]");
	private final By RoutingNoTextBox_xpath=By.xpath("//input[@name='routing_number' and @id='jqg1_routing_number']");
	private final By Save_xpath=By.xpath("//td[5]//div[1]//span[1]");
	
	
	public BrokerBankInformationPageFactoring(WebDriver driver) {
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
			.until(ExpectedConditions.visibilityOfElementLocated(BrokerBankInformationPageFactoring_xpath));
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
			
			for (WebElement ele:list) 
			{
				/*String data = ele.getText();
				System.out.println(data);*/
				if (ele.getText().contains(value)) 
				{
			 		ele.click();
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
	public boolean clickOnadd()
	{
	try
	    {

		WebElement addWebEelement=new WebDriverWait(driver,5)
		.until(ExpectedConditions.visibilityOfElementLocated(add_xpath));
		//addWebEelement.click();
		addWebEelement.click();
		Thread.sleep(2000);
        
	    }
	catch(Exception ex)
	    {
		return false;
	    }
	return true;
	}
	
	public String addValueToAccountNameTextBox(String AccountNameData)
	{
	try{
		WebElement codeTextBoxWebEelement=new WebDriverWait(driver,20)
		.until(ExpectedConditions.visibilityOfElementLocated(AccountNameTextBox_xpath));
		codeTextBoxWebEelement.clear();
		codeTextBoxWebEelement.sendKeys(AccountNameData);
		
		Thread.sleep(1000);
		
	}
	catch(Exception ex){
	  
	}
	return AccountNameData;
	}
	public String addValueToBankNameTextBox(String BankNameData)
	{
	try{
		WebElement codeTextBoxWebEelement=new WebDriverWait(driver,20)
		.until(ExpectedConditions.visibilityOfElementLocated(BankNameTextBox_xpath));
		codeTextBoxWebEelement.clear();
		codeTextBoxWebEelement.sendKeys(BankNameData);
		
		Thread.sleep(1000);
		
	}
	catch(Exception ex){
	  
	}
	return BankNameData;
	}
	
	public String addValueToAccountNoTextBox(String AccountNoData)
	{
	try{
		WebElement codeTextBoxWebEelement=new WebDriverWait(driver,20)
		.until(ExpectedConditions.visibilityOfElementLocated(AccountNoTextBox_xpath));
		//codeTextBoxWebEelement.clear();
		codeTextBoxWebEelement.sendKeys(AccountNoData);
		
		Thread.sleep(1000);
		
	}
	catch(Exception ex){
	  
	}
	return AccountNoData;
	}
	public String addValueToRoutingNoTextBox(String RoutingNoData)
	{
	try{
		WebElement codeTextBoxWebEelement=new WebDriverWait(driver,20)
		.until(ExpectedConditions.visibilityOfElementLocated(RoutingNoTextBox_xpath));
		codeTextBoxWebEelement.clear();
		codeTextBoxWebEelement.sendKeys(RoutingNoData);
		
		Thread.sleep(1000);
		
	}
	catch(Exception ex){
	  
	}
	return RoutingNoData;
	}
	public boolean clickOnSave()
	{
	try{

		WebElement headerWebEelement=new WebDriverWait(driver,100)
		.until(ExpectedConditions.visibilityOfElementLocated(Save_xpath));
		headerWebEelement.click();
		
return true;
	}
	catch(Exception ex){
		return false;
	}
	}
}
