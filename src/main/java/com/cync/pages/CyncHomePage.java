package com.cync.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.SkipException;

import com.cync.base.BasePage;

public class CyncHomePage extends BasePage{
	
	static Logger log = Logger.getLogger(CyncHomePage.class.getName());
    private final By successMessage_xpath=By.xpath("//div[@id='bgshadow']//descendant::strong[@class='extend_message']");
    private final By homeIcon_xpath= By.xpath("//img[@class='home-icon']");
	
	
	public CyncHomePage(WebDriver driver)
	{
		super(driver);
		log.info("Verifying Home Page");
		if(!driver.findElement(homeIcon_xpath).isDisplayed())
		{
			log.info("Cync Home Page couldn't open");
			throw new SkipException("Cync Home Page couldn't open");
		}
		
	}
	
	public String getSuccessfulMessage(){
		log.info("verifying the success Message");
		try{	
			WebElement successfulMessageWebE=new WebDriverWait(driver,5)
				.until(ExpectedConditions.visibilityOfElementLocated(successMessage_xpath));
			return successfulMessageWebE.getText().substring(0, 22);
		}catch(Exception ex){
			return null;
		}

	}
}


