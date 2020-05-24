package com.cync.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.cync.base.BasePage;


public class IneligibilityreasonsPage extends BasePage {
private final By checkboxagedpastdue_xpath=By.xpath("(//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default'])[3]");
private final By checkboxagedcredititem_xpath=By.xpath("(//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default'])[5]");
private final By checkboxcrossaged_xpath=By.xpath("(//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default'])[18]");
private final By contra_xpath=By.xpath("//span[text()='qaqaqa']");
private final By webb_xpath=By.xpath("//span[text()='AutomatinTest']")	;
private final By menu_xpath=By.xpath("//img[@class='hand ng-star-inserted']");	
private final By client_xpath=By.xpath("(//a[@class='the_head ng-star-inserted'])[2]");	
private final By agedpastcheckbox_xpath=By.xpath("//span[text()='Aged: Past Due Days']");	
private final By calnegbalnc_xpath=By.xpath("(//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default'])[1]");
private final By savebtn_xpath=By.xpath("//span[text()=' Save ']");
private final By checkboxaged_xpath=By.xpath("//span[text()='Aged Credit Item']");	
private final By descrip_xpath=By.xpath("(//input[@type='text'])[7]");	
private final By checkboxnegdebtor_xpath=By.xpath("(//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default'])[2]");
	
public IneligibilityreasonsPage(WebDriver driver) {
		
		super(driver);
		// TODO Auto-generated constructor stub
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

public boolean scrollToViewL()
{
	try{
		 WebElement actual1=new WebDriverWait(driver,10)
		 .until(ExpectedConditions.visibilityOfElementLocated(contra_xpath));
		JavascriptExecutor jse1 = (JavascriptExecutor)driver;;
		jse1.executeScript("arguments[0].scrollIntoView(true);", actual1);  		
        Thread.sleep(3000);
        return true;
		
	}
	catch(Exception e){
		
	}
	return false;
	
	} 
////ineligible caluculation
public boolean enterdescription(String descname)
{
try{
	WebElement descriTextBoxWebEelement=new WebDriverWait(driver,200)
	.until(ExpectedConditions.visibilityOfElementLocated(descrip_xpath));
	descriTextBoxWebEelement.click();
	descriTextBoxWebEelement.clear();
	descriTextBoxWebEelement.sendKeys(descname);
	Thread.sleep(2000);
return true;
}
catch(Exception ex){

}
return false;

}

public boolean DoubleClickagedcreditcheckbox()
{
	try{
	
	WebElement element=new WebDriverWait(driver,100)
	.until(ExpectedConditions.visibilityOfElementLocated(checkboxaged_xpath));
	//Double click
	Actions action = new Actions(driver);
	action.doubleClick(element).build().perform();
	Thread.sleep(2000);
	
	return true;
}


catch(Exception ex){
	return false;
}
}
public boolean DoubleClickagedcheckbox()
{
	try{
	
	WebElement element=new WebDriverWait(driver,100)
	.until(ExpectedConditions.visibilityOfElementLocated(agedpastcheckbox_xpath));
	//Double click
	Actions action = new Actions(driver);
	action.doubleClick(element).build().perform();
	Thread.sleep(2000);
	
	return true;
}


catch(Exception ex){
	return false;
}
}
public boolean clickoncaluculatenegbalance()
{
try{
	WebElement menuWebElement=new WebDriverWait(driver,10)
	.until(ExpectedConditions.visibilityOfElementLocated(calnegbalnc_xpath));
	
	menuWebElement.click();
	
	
	return true;
}
catch(Exception ex){
	return false;
}

}
public boolean clickoncaluculatenegdebtorbalance()
{
try{
	WebElement WebElement=new WebDriverWait(driver,10)
	.until(ExpectedConditions.visibilityOfElementLocated(checkboxnegdebtor_xpath));
	
	WebElement.click();
	
	
	return true;
}
catch(Exception ex){
	return false;
}

}
public boolean clickonsave()
{
try{
	WebElement menuWebElement=new WebDriverWait(driver,10)
	.until(ExpectedConditions.visibilityOfElementLocated(savebtn_xpath));
	menuWebElement.click();
	
	
	return true;
}
catch(Exception ex){
	return false;
}

}
public boolean MouseOverOnMenu1() {
	try {
		WebElement menuItemWebE = new WebDriverWait(driver, 10)
				.until(ExpectedConditions
						.visibilityOfElementLocated(client_xpath));
		menuItemWebE.click();
		/* new Actions(driver).moveToElement(menuItemWebE).perform(); */

		return true;
	} catch (Exception ex) {
		return false;
	}
}
public boolean clickonmenu()
{
try{
	WebElement menuWebElement=new WebDriverWait(driver,10)
	.until(ExpectedConditions.visibilityOfElementLocated(menu_xpath));
	menuWebElement.click();
	this.MouseOverOnMenu1();
	
	return true;
}
catch(Exception ex){
	return false;
}

}

public boolean scrollToViewL1()
{
	try{
		 WebElement actual1=new WebDriverWait(driver,10)
		 .until(ExpectedConditions.visibilityOfElementLocated(webb_xpath));
		JavascriptExecutor jse1 = (JavascriptExecutor)driver;;
		jse1.executeScript("window.scrollBy(0,-250)", actual1);  		
        Thread.sleep(3000);
        return true;
		
	}
	catch(Exception e){
		
	}
	return false;
	
	} 
public boolean  Click_on_checkboxagedpastdue()
{
try{
	WebElement HeaderWebEelement=new WebDriverWait(driver,100)
		.until(ExpectedConditions.visibilityOfElementLocated(checkboxagedpastdue_xpath));
	HeaderWebEelement.click();
	Thread.sleep(5000);
	return true;
}
catch(Exception ex){
	return false;

}


}

public boolean  Click_on_checkboxagedcredititem()
{
try{
	WebElement HeaderWebEelement=new WebDriverWait(driver,100)
		.until(ExpectedConditions.visibilityOfElementLocated(checkboxagedcredititem_xpath));
	HeaderWebEelement.click();
	Thread.sleep(5000);
	return true;
}
catch(Exception ex){
	return false;

}


}
public boolean  Click_on_checkboxcrossaged()
{
try{
	WebElement HeaderWebEelement=new WebDriverWait(driver,100)
		.until(ExpectedConditions.visibilityOfElementLocated(checkboxcrossaged_xpath));
	HeaderWebEelement.click();
	Thread.sleep(5000);
	return true;
}
catch(Exception ex){
	return false;

}


}

}
