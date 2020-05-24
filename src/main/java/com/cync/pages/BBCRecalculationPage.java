package com.cync.pages;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.SkipException;

import com.cync.base.BasePage;



public class BBCRecalculationPage extends BasePage {
 
    private final By BBCRecalucaltionHeader_xpath=By.xpath("//span[contains(text(),'BBC Recalculation Process ')]");
    private final By processRecalculateBBC_xpath=By.xpath("//a[contains(text(),'Process/Re-Calculate BBC')]");
    private final By BBCAvailability_xpath=By.id("tab_150");
    private final By BBcavablityapprove_xpath=By.xpath("//a[text()='Approve BBC']");
    private final By Title_xpath=By.xpath("//span[@class='paneltitle']");
    
    public BBCRecalculationPage(WebDriver driver) {
	super(driver);
	try {

		Thread.sleep(1000);

		Thread.sleep(500);

	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	if(!driver.findElement(BBCRecalucaltionHeader_xpath).getText().trim().equals("BBC Recalculation Process")){
		throw new SkipException("Fund Request couldn't open.");
	}
}

    public boolean processRecalculateBBC()
   	{
   	try{
   		WebElement WebEelement=new WebDriverWait(driver,10)
   			.until(ExpectedConditions.visibilityOfElementLocated(processRecalculateBBC_xpath));
   		Thread.sleep(1000);
   		WebEelement.click();
   		Alert alert = driver.switchTo().alert();
   		alert.accept();

   		Thread.sleep(5000);
   		

   		/*Alert alert1 = driver.switchTo().alert();
   		alert1.accept(); 
   		Thread.sleep(5000);*/
   		return true;
   	}
   	catch(Exception ex){
		return false;
   	}
   	}
    
    //ineligible
    public boolean processRecalculateBBCOnce()
   	{
   	try{
   		WebElement WebEelement=new WebDriverWait(driver,10)
   			.until(ExpectedConditions.visibilityOfElementLocated(processRecalculateBBC_xpath));
   		WebEelement.click();
   		Alert alert = driver.switchTo().alert();
   		alert.accept();

   		Thread.sleep(500);
/*   		Alert alert1 = driver.switchTo().alert();
   		alert1.accept(); 
   		Thread.sleep(5000);*/
   		return true;
   	}
   	catch(Exception ex){
		return false;
   	}
   	}
    
	public boolean clickonbbcavablity() {
		try {
			WebElement bbcavablity = new WebDriverWait(driver, 5)
					.until(ExpectedConditions
							.visibilityOfElementLocated(BBCAvailability_xpath));
			bbcavablity.click();
			Thread.sleep(1000);

			return true;
		} catch (Exception ex) {

		}
		return false;
	}
    
  //click on bbcavablity approve
  	 public boolean selectbbcavablityapprove() {
  	    	try {
  	    	    WebElement bbcavablityapprove = new WebDriverWait(driver, 5)
  	    		    .until(ExpectedConditions
  	    			    .visibilityOfElementLocated(BBcavablityapprove_xpath));
  	    	    bbcavablityapprove.click();
  	    	    Thread.sleep(1000);
  	    	    return true;
  	    	} catch (Exception ex) {
  	    	    return false;
  	    	}

  	        }
  	 //verify page
  	 
  	 public boolean verifypage() {
	    	try {
	    	    WebElement bbcavablityapprove = new WebDriverWait(driver, 5)
	    		    .until(ExpectedConditions
	    			    .visibilityOfElementLocated(Title_xpath));
	    	    bbcavablityapprove.isDisplayed();
	    	    Thread.sleep(1000);
	    	    return true;
	    	} catch (Exception ex) {
	    	    return false;
	    	}

	        }
  	 
} 
