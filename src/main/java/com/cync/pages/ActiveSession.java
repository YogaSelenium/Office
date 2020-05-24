package com.cync.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.cync.base.BasePage;

public class ActiveSession extends BasePage {

	public ActiveSession(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	private final By userValidationPopup_xpath= By.xpath("//div[@class='loginform1']");
	private final By acceptYes_xpath= By.xpath("//div[@class='loginform1']//descendant::input[@class='button-yes']");
	private final By notAcceptNo_xpath= By.xpath("//div[@class='loginform1']//descendant::input[@class='button-no']");
	//Verify validate user session
	public CyncHomePage verifyActiveSession() {
		try {
		
		if(driver.findElement(userValidationPopup_xpath).isDisplayed()==true) {
			WebElement terminateSessionWebL=new WebDriverWait(driver,2)
					.until(ExpectedConditions.visibilityOfElementLocated(acceptYes_xpath));
			terminateSessionWebL.click();
			System.out.println("Accept session to continue");
			return new CyncHomePage(driver);
		}
		
		return null;
		}
		
		catch (Exception ex) {
			ex.printStackTrace();
			return new CyncHomePage(driver);
			
		}
		
		
	}
}
