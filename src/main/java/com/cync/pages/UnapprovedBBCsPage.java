package com.cync.pages;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.cync.base.BasePage;

public class UnapprovedBBCsPage extends BasePage {
	
	private final By unapprovebbc_xpath=By.xpath("(//a[text()='Unapproved BBCs'])[1]");
	private final By unapprovebbcheader_xapth=By.xpath("//span[@class='paneltitle']");
	   private final By clientsel_xpath=By.id("selected_borrower_list");
	   private final By search_xpath=By.xpath("//input[@value='Search']");
	   private final By purge_xpath=By.xpath("//a[@title='Purge']");
	   
	   
		public UnapprovedBBCsPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
		public boolean VerifyHeader(String Header) {
			try {
				WebElement firstAccountNoWebElement = new WebDriverWait(driver, 100)
						.until(ExpectedConditions
								.visibilityOfElementLocated(unapprovebbcheader_xapth));

				String actual = firstAccountNoWebElement.getText();
				if (actual.equals(Header))
					return true;
				else
					return false;

			} catch (Exception e) {
				return false;
			}
		}
		
		public boolean  Clientfromdropdown_Click(String clientName){
			try {

				WebElement DropdownWebEelements = new WebDriverWait(driver, 10)
				.until(ExpectedConditions.visibilityOfElementLocated(clientsel_xpath));
				DropdownWebEelements.click();
				DropdownWebEelements.sendKeys(clientName);
				Select sel = new Select(DropdownWebEelements);									 
	    List<WebElement> list =sel.getOptions();
	    
	    for (WebElement ele:list){
		
		if(ele.getText().equals(clientName))
		{
		ele.click();
		break;

		 //System.out.println(ele.getText());
	      
	    }
	  //Assert.assertTrue(match);
	 }
	    return true;	
	} catch (Exception e) {
	// TODO: handle exception

	}
			return false;
	}
	    
	    
	 public boolean clickOnSearch(){
		
	   	try{
	   		WebElement searchWebEelement=new WebDriverWait(driver,10)
	   		.until(ExpectedConditions.visibilityOfElementLocated(search_xpath));
	   		searchWebEelement.click();

	   		Thread.sleep(1000);
	   		return true;
	   	}
	   	catch(Exception ex){
	   		return false;
	   	}
	       }
	 public boolean clickOnpurge(){
			
		   	try{

		   		WebElement searchWebEelement=new WebDriverWait(driver,10)
		   		.until(ExpectedConditions.visibilityOfElementLocated(purge_xpath));
		   		searchWebEelement.click();
		   		Alert alert = driver.switchTo().alert();
		   		alert.accept();
		   		Thread.sleep(500);
		   		return true;
		   	}
		   	catch(Exception ex){
		   		return false;
		   	}
		       }
		}
		


