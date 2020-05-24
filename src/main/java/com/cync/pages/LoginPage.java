package com.cync.pages;


import java.util.concurrent.TimeUnit;

import org.apache.commons.codec.binary.Base64;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.SkipException;

import com.cync.base.BasePage;
import com.cync.base.PropertyManager;


public class LoginPage extends BasePage{
	
	static Logger log = Logger.getLogger(LoginPage.class.getName());

	
	private final By username_xpath=By.xpath("//div[@class='loginbox']//descendant::input[@id='user_login']"); 
	private final By password_xpath=By.xpath("//div[@class='loginbox']//descendant::input[@id='user_password']"); 
	private final By loginButton_xpath=By.xpath("//div[@class='loginbox']//descendant::button[@class='login-button']"); 
	private final By errorMessage_xpath=By.xpath("//div[@class='loginform1']//descendant::div[@class='loginErrormsg']"); 
	

	String userName = PropertyManager.getInstance().getUsername();
    String passWord = PropertyManager.getInstance().getPassword();
	
	public LoginPage(WebDriver driver) {
		super(driver);
		try {
			//Thread.sleep(3000);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		} catch (Exception e) {
		}
		if(!driver.getTitle().equalsIgnoreCase("Cync Application")){
			throw new SkipException("Login Page couldn't open properly.");
		}
	}
	
	public boolean setUserName(String username){
		log.info("setting up the username");
		try{
			WebElement usernameWebE=new WebDriverWait(driver,5)
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
			WebElement passwordWebE=new WebDriverWait(driver,5)
				.until(ExpectedConditions.visibilityOfElementLocated(password_xpath));
			passwordWebE.clear();
			passwordWebE.sendKeys(password);
			byte[] encodedBytes = Base64.encodeBase64(password.getBytes());
			System.out.println("encodedBytes "+ new String(encodedBytes));

			byte[] decodedBytes = Base64.decodeBase64(encodedBytes);
			System.out.println("decodedBytes "+ new String(decodedBytes));
			
			return true;
		}catch(Exception ex){
			log.info("something went wrong while passing password");
			return false;
		}
	}
	
	public Object clickLoginButton(){
		try{
			boolean result;
			new WebDriverWait(driver,5)
				.until(ExpectedConditions.visibilityOfElementLocated(loginButton_xpath)).click();
			result=this.isElementPresent(username_xpath);
			if(result){
				log.info("clicking on the login Btn");
				return new LoginPage(driver);
				

			}else{
				return new CyncHomePage(driver);
			}
		}catch(Exception ex){
		return null;
		}
	}
	
	public String getErrorMessage(){
		try{
			WebElement errorMessageWebE=new WebDriverWait(driver,5)
				.until(ExpectedConditions.visibilityOfElementLocated(errorMessage_xpath));
			return errorMessageWebE.getText().trim();
		}catch(Exception ex){
			return null;
		}
	}
	
	public CyncHomePage doLogin(){
		try{
         	new WebDriverWait(driver,5); 
		   // this.setUserName("rohitAdmin");
			//this.setPassword("Cync@1234");
		   /* this.setUserName("abirami");
			this.setPassword("Idexcel&1234");
			*/		
			/*Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
					.withTimeout(Duration.ofSeconds(5))
					.pollingEvery(Duration.ofMillis(20)).ignoring(NoSuchElementException.class);
			wait.until(ExpectedConditions.visibilityOfElementLocated(loginButton_xpath)).click();*/
			new WebDriverWait(driver,5); 
		    /*this.setUserName("adminautomation");
			this.setPassword("Idexcel@123");*/	
			
			/*this.setUserName("kurthivasa");
			this.setPassword("Kruthivasrona=1");*/
			
		   /* this.setUserName("anushasg");
			this.setPassword("Cync@123");*/
			
			/*this.setUserName("atish");
			this.setPassword("Idexcel@123");*/
		 /*   this.setUserName(userName);
			this.setPassword(passWord);*/
		    /*this.setUserName("abirami");
			this.setPassword("Idexcel&1234");*/
			
			
			/*Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
					.withTimeout(Duration.ofSeconds(5))
					.pollingEvery(Duration.ofMillis(20)).ignoring(NoSuchElementException.class);
		    /*this.setUserName("abirami");
			this.setPassword("Idexcel&1234");*/
			
			
			/*Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
					.withTimeout(Duration.ofSeconds(5))
					.pollingEvery(Duration.ofMillis(20)).ignoring(NoSuchElementException.class);
			wait.until(ExpectedConditions.visibilityOfElementLocated(loginButton_xpath)).click();
			new WebDriverWait(driver,5); */
		    /*this.setUserName("adminautomation");
			this.setPassword("Idexcel@123");	*/	
			/*this.setUserName("kurthivasa");
			this.setPassword("Kruthivasrona=1");*/
		    /*this.setUserName("anushasg");
			this.setPassword("Cync@123");*/
			
			new WebDriverWait(driver,5);
			this.setUserName(userName);
			this.setPassword(passWord);
			new WebDriverWait(driver,10)
				.until(ExpectedConditions.visibilityOfElementLocated(loginButton_xpath)).click();
			log.info("login to the cync application");
			return new CyncHomePage(driver);
		}catch(Exception ex){
			return null;
		}
	}

	
	public void setLoginUNPassword(String un,String pwd){
		this.setUserName(un);
		this.setPassword(pwd);
		new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(loginButton_xpath)).click();
	}
	
	
	
	public CyncHomePage doLoginPassData(String Username,String Password){
		try{
		    
		    this.setUserName(Username);
			this.setPassword(Password);
		    
		new WebDriverWait(driver,5).until(ExpectedConditions.visibilityOfElementLocated(loginButton_xpath)).click();
			log.info("login to the cync application");
			System.out.println("login done");
			return new CyncHomePage(driver);
		}catch(Exception ex){
			return null;
		}
	}
}
