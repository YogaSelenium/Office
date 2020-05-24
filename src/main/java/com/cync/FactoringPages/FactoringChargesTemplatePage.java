package com.cync.FactoringPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.cync.base.BasePage;

public class FactoringChargesTemplatePage extends BasePage {
	private final By FactoringChargesTemplatePage_xpath = By.xpath("//div[@class='panel-heading']/span[text()=' Factoring Charges Template ']");
	
	public FactoringChargesTemplatePage(WebDriver driver) {
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
			.until(ExpectedConditions.visibilityOfElementLocated(FactoringChargesTemplatePage_xpath));
		HeaderWebEelement.getText();
		Thread.sleep(1000);
    	}
    	catch(Exception e)
    	{
    		
    	}
    	return Header;
    }
}

