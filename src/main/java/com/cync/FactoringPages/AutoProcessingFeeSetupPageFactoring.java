package com.cync.FactoringPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.cync.base.BasePage;

public class AutoProcessingFeeSetupPageFactoring extends BasePage
{
	private final By AutoProcessingFeeSetupPageFactoring_xpath = By.xpath("//div[@class='panel-heading']/span[text()=' Auto Processing Fee Setup ']");
	
	
	
	public AutoProcessingFeeSetupPageFactoring(WebDriver driver) {
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
			.until(ExpectedConditions.visibilityOfElementLocated(AutoProcessingFeeSetupPageFactoring_xpath));
		HeaderWebEelement.getText();
		Thread.sleep(1000);
    	}
    	catch(Exception e)
    	{
    		
    	}
    	return Header;
    }

}
