package com.cync.FactoringPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.cync.base.BasePage;

public class DepositUploadPage extends BasePage
{
	private final By DepositUploadPage_xpath = By.xpath("//button[@class='link-height mat-menu-item2 ng-star-inserted link-active']");
	
	
	
	public DepositUploadPage(WebDriver driver) {
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
			.until(ExpectedConditions.visibilityOfElementLocated(DepositUploadPage_xpath));
		HeaderWebEelement.getText();
		Thread.sleep(2000);
    	}
    	catch(Exception e)
    	{
    		
    	}
   	return Header;
    }
}