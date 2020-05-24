package com.cync.ClientMaintenance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.SkipException;

import com.cync.base.BasePage;

public class exceptionsPage extends BasePage{

	
	private final By exceptionsPageHeader_xpath = By.xpath("//span[contains(text(),'Exceptions')]");
	private final By exceptionDescriptionColumn_xpath = By.xpath("//div[contains(text(),'Exception Description')]");
	private final By exceptionNotesColumn_xpath = By.xpath("//div[contains(text(),'Exception Notes')]");
	private final By exceptionSignColumn_xpath = By.xpath("//div[contains(text(),'Exception Sign')]");
/*	private final By valueTypeColumn_xpath = By.xpath("//div[contains(text(),'Value Type')]");
	private final By valueTypeColumn_xpath = By.xpath("//div[contains(text(),'Value Type')]");
	private final By valueTypeColumn_xpath = By.xpath("//div[contains(text(),'Value Type')]");*/
	
	
	
	
	public exceptionsPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		try{
			if(!driver.findElement(exceptionsPageHeader_xpath).getText().trim().contains("Exceptions")){
				throw new SkipException("ABL Client Creation page couldn't open.");
			}}
		catch(Exception e){

			e.printStackTrace();
	}
	}	
}
