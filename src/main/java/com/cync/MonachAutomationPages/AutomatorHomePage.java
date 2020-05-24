package com.cync.MonachAutomationPages;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.SkipException;

import com.cync.base.BasePage;
import com.cync.pages.SignBBCPage;

public class AutomatorHomePage extends BasePage{
	
	public AutomatorHomePage(WebDriver driver) {
	super(driver);
	}
	
	private final By HomePage_xpath=By.xpath("//a[text()='Home']");
	private final By StandardProcess_xpath=By.xpath("//li[@id='pumpprocesses'] /a[text()='Standard Processes']");
	

	
	
	  public ProcessesAutomatorPage StandardProcessClick()
		{
		try{
			WebElement  netBorrowingBaseWebEelement=new WebDriverWait(driver,200)
				.until(ExpectedConditions.visibilityOfElementLocated(StandardProcess_xpath));
			netBorrowingBaseWebEelement.click();
			Thread.sleep(5000);
			return new ProcessesAutomatorPage(driver);
		}
		catch(Exception ex){
		
		}
		return null;
		}
	    
	}
	
	

