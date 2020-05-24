package com.cync.pages;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.SkipException;

import com.cync.base.BasePage;

public class PurgeClientPage extends BasePage {

	
	
    private final By InactiveClientPageHeader_xpath = By.xpath("//span[contains(text(),'Inactive Clients')]");
	private final By inactiveClientsRecords_xpath = By.xpath("//*[@id='content']/div[3]/div");
	private final By InactiveClientsHeader_xpath=By.xpath("//span[contains(text(),'Inactive Clients')]");
	
    
	public PurgeClientPage(WebDriver driver) {
	    
	    super(driver);
		try{
			if(!driver.findElement(InactiveClientPageHeader_xpath).getText().trim().contains("Inactive Clients"))
			{
				throw new SkipException("Inactive Clients page couldn't open.");
			
			}}
		catch(Exception e){
			
		// TODO Auto-generated constructor stub
			e.printStackTrace();
	}
		
		// TODO Auto-generated constructor stub
		
	}

	
	
	
	public  String purgClientDeleteBtn(String data) {
	     try {
	     WebElement LabelWebEelement=new WebDriverWait(driver,10)
	      .until(ExpectedConditions.visibilityOfElementLocated(inactiveClientsRecords_xpath));
	     
	      if (LabelWebEelement.isEnabled()) {
	       String dataaftertrim = data.trim();
	    
	       List<WebElement> lists =driver
	         .findElements(By
	           .xpath("//tr[contains(@class,'row-')]/td[2]"));

	       for (int l = 0; l <= lists.size(); l++) 
	       {

	        String clientname = lists.get(l).getText();
	        String appdata = clientname.trim();
	       
	        if (dataaftertrim.equals(appdata)) {
	         System.out.println(clientname);
	         System.out.println("to check1");
	         int j = l + 1;
	         System.out.println("to check2");
	         
	         driver.findElement(
		           By.xpath("//*[@id='bgshadow']/div/div/div[2]/div/div/table/tbody/tr["+ j + "]/td/a/i")).click();
	        
	         System.out.println("to check");
	         
	  /* driver.findElement(
	           By.xpath("//td[contains(@style,'text-align: center')]["
	             + j + "]/a[@title='Purge']")).click();*/
	             
	          
	   
	   Alert alert =driver.switchTo().alert();
	        alert.accept();
	         Thread.sleep(5000);
	        
	        }
	       }
	      }
	     }

	     catch (Exception e) {
	      

	     }
	     return data;

	}
	
	public boolean verifyInactiveClientsHeader(String Header){
		try{
			WebElement ClientSummarysWebE=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(InactiveClientsHeader_xpath));
			
			String actual_header=ClientSummarysWebE.getText().trim();
			
			if(actual_header.equals(Header))
				return true;
			else
				return false;
		}
		catch(Exception ex){
			return false;
		}
		
		}
	
}