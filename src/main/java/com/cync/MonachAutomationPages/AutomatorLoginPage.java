package com.cync.MonachAutomationPages;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.SkipException;

import com.cync.base.BasePage;

public class AutomatorLoginPage extends BasePage{
	
	public AutomatorLoginPage(WebDriver driver) {
	super(driver);
	// TODO Auto-generated constructor stub
    }


	static Logger log = Logger.getLogger(AutomatorLoginPage.class.getName());

	
	private final By username_xpath=By.xpath("//input[@id='login']"); 
	private final By password_xpath=By.xpath("//input[@id='password']"); 
	private final By loginButton_xpath=By.xpath("//input[@id='loginSubmit']"); 
	

	
	
	
	public boolean setUserName(String username){
		log.info("setting up the username");
		try{
			WebElement usernameWebE=new WebDriverWait(driver,10)
				.until(ExpectedConditions.visibilityOfElementLocated(username_xpath));
			usernameWebE.clear();
			usernameWebE.sendKeys(username);
			return true;
		}catch(Exception ex){
			log.info("something went wrong while passing username");

			return false;
		}
		
	}
	
	public boolean setPassword(String password){
		log.info("setting up the password");

		try{
			WebElement passwordWebE=new WebDriverWait(driver,10)
				.until(ExpectedConditions.visibilityOfElementLocated(password_xpath));
			passwordWebE.clear();
			passwordWebE.sendKeys(password);
			return true;
		}catch(Exception ex){
			log.info("something went wrong while passing password");
			return false;
		}
	}
	
	public Object clickLoginButton(){
		try{
			boolean result;
			new WebDriverWait(driver,10)
				.until(ExpectedConditions.visibilityOfElementLocated(loginButton_xpath)).click();
			result=this.isElementPresent(username_xpath);
			if(result){
				log.info("clicking on the login Btn");
				return new AutomatorLoginPage(driver);
				

			}else{
				return new AutomatorHomePage(driver);
			}
		}catch(Exception ex){
		return null;
		}
	}
	
	
	public AutomatorHomePage LoginAutomator(){
		try{
		    
		this.setUserName("mpraveen");
		this.setPassword("Idexcel@321");
			
			new WebDriverWait(driver,10)
				.until(ExpectedConditions.visibilityOfElementLocated(loginButton_xpath)).click();
			log.info("login to the automator application");
			return new AutomatorHomePage(driver);
		}catch(Exception ex){
			return null;
		}
	}

}
