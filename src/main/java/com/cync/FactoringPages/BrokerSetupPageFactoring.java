package com.cync.FactoringPages;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.cync.base.BasePage;

public class BrokerSetupPageFactoring extends BasePage
{
	private final By BrokerSetupPageFactoring_xpath = By.xpath("//span[@class='paneltitle']");
	private final By NewButton = By.xpath("//a[@class='view-button new_lnk' and text()='New']");
	private final By BrokerNameTextBox_xpath = By.xpath("//input[@class='text_field' and @name='broker[name]']");
	private final By BrokerNoTextBox_xpath = By.xpath("//input[@class='text_field' and @id='broker_number']");
	private final By SaveButton_xpath = By.xpath("//input[@name='commit' and @value='Save']");
	private final By Brokerdropdown_xpath= By.xpath("//select[@name='broker_id']");
	private final By DeleteButton_xpath=By.xpath("//a[text()='Delete']");
	public BrokerSetupPageFactoring(WebDriver driver) {
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
			.until(ExpectedConditions.visibilityOfElementLocated(BrokerSetupPageFactoring_xpath));
		HeaderWebEelement.getText();
		Thread.sleep(2000);
    	}
    	catch(Exception e)
    	{
    		
    	}
    	return Header;
    }
	public boolean ClickNewButton(){
		try{

			WebElement headerWebEelement=new WebDriverWait(driver,5)
			.until(ExpectedConditions.visibilityOfElementLocated(NewButton));
			headerWebEelement.click();
			
	return true;
		}
		catch(Exception ex){
			return false;
		}
	}
	public String addValueToBrokerNameTextBox(String BrokerNameData)
	{
	try{
		WebElement codeTextBoxWebEelement=new WebDriverWait(driver,200)
		.until(ExpectedConditions.elementToBeClickable(BrokerNameTextBox_xpath));
		codeTextBoxWebEelement.clear();
		codeTextBoxWebEelement.sendKeys(BrokerNameData);
		
		Thread.sleep(2000);
		
	}
	catch(Exception ex){
	  
	}
	return BrokerNameData;
	}
//	
	
	
	
	
	
	
//
	public String addValueToBrokerNoTextBox(String BrokerNoData)
	{
	try{
		WebElement codeTextBoxWebEelement=new WebDriverWait(driver,200)
		.until(ExpectedConditions.visibilityOfElementLocated(BrokerNoTextBox_xpath));
		codeTextBoxWebEelement.clear();
		codeTextBoxWebEelement.sendKeys(BrokerNoData);
		
		Thread.sleep(2000);
		
	}
	catch(Exception ex){
	  
	}
	return BrokerNoData;
	}
	
	public boolean ClickSaveButton(){
		try{

			WebElement headerWebEelement=new WebDriverWait(driver,5)
			.until(ExpectedConditions.visibilityOfElementLocated(SaveButton_xpath));
			headerWebEelement.click();
			
	return true;
		}
		catch(Exception ex){
			return false;
		}
	}
	
	public  boolean ClickonBrokerDropdown(String BrokerData) {
		try {
			WebElement DropdownWebEelement = new WebDriverWait(driver, 10)
			.until(ExpectedConditions.visibilityOfElementLocated(Brokerdropdown_xpath));
			Select sel = new Select(DropdownWebEelement);
			
			List<WebElement> list = sel.getOptions();
			
			for (WebElement ele : list) 
			{
				/*String data = ele.getText();
				System.out.println(data);*/
				if (ele.getText().equals(BrokerData)) 
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
	public boolean ClickDeleteButton(){
		try{

			WebElement headerWebEelement=new WebDriverWait(driver,5)
			.until(ExpectedConditions.visibilityOfElementLocated(DeleteButton_xpath));
			headerWebEelement.click();
			 Alert alert =driver.switchTo().alert();
		        alert.accept();
			
			
	return true;
		}
		catch(Exception ex){
			return false;
		}
	}
	
	
}
