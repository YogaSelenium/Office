package com.cync.FactoringPages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.cync.base.BasePage;

public class BrokerCommissionPageFactoring extends BasePage
{
	private final By BrokerCommissionPageFactoring_xpath = By.xpath("//span[@class='paneltitle']");
	private final By Brokerdropdown_xpath= By.xpath("//select[@class='broker']");
	private final By BrokerCheckBox_xpath= By.xpath("//span[@class='ag-selection-checkbox']");
	private final By ReleaseandPrintCommission_xpath= By.xpath("//button[@class='primary btn']");
	private final By YesPopup_xpath=By.xpath("//button[text()='Yes']");
	private final By Download_xpath=By.xpath("//button[text()='Download']");
	public BrokerCommissionPageFactoring(WebDriver driver) {
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
			.until(ExpectedConditions.visibilityOfElementLocated(BrokerCommissionPageFactoring_xpath));
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
				
				if (ele.getText().equals(value)) 
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
	public boolean clickOnBrokerCheckbox()
	{
	try{

		WebElement Webelement=new WebDriverWait(driver,5)
		.until(ExpectedConditions.visibilityOfElementLocated(BrokerCheckBox_xpath));
		Webelement.click();
		
return true;
	}
	catch(Exception ex){
		return false;
	}

	}
	public boolean clickOnReleaseandPrintCommission()
	{
	try{

		WebElement Webelement=new WebDriverWait(driver,5)
		.until(ExpectedConditions.visibilityOfElementLocated(ReleaseandPrintCommission_xpath));
		Webelement.click();
		
return true;
	}
	catch(Exception ex){
		return false;
	}
	
}
	public boolean clickYesCommissionReleasePopup()
	{
	try{

		WebElement Webelement=new WebDriverWait(driver,5)
		.until(ExpectedConditions.visibilityOfElementLocated(YesPopup_xpath));
		Webelement.click();
		
return true;
	}
	catch(Exception ex){
		return false;
	}

	}
	public boolean clickDownloadCommissionReleaseReport()
	{
	try{

		WebElement Webelement=new WebDriverWait(driver,5)
		.until(ExpectedConditions.visibilityOfElementLocated(Download_xpath));
		Webelement.click();
		
return true;
	}
	catch(Exception ex){
		return false;
	}

	}
}