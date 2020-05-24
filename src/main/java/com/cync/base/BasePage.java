package com.cync.base;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.LocalFileDetector;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
	
public static WebDriver driver;
private CyncHeaderPage cyncHeaderPage;
private CyncMenus cyncMenus;	
public static String clientName="AUTERAASMSOEAUUS";
/*public static String clientName="URSSSOSTOMSYAMEO";*/
public String clientName1;

	public BasePage(WebDriver driver){
		this.driver=driver;
		cyncHeaderPage=new CyncHeaderPage(driver);
		cyncMenus=new CyncMenus(driver);
	}

	public CyncHeaderPage getCyncHeaderPage(){
		return cyncHeaderPage;
	}
	
	public CyncMenus getCyncMenus(){
		return cyncMenus;
	}
	
	public boolean isElementPresent(By xpath){
		try{
			List<WebElement> elementWebE=driver.findElements(xpath);
			if (elementWebE.size()==0){
				return false;
			}else
			return true;
		}catch(Exception ex){
			return false;
		}
		
	}
	
	public  void fileUpload(By chooseFile_xpath,String filepath){
		try{
			WebElement fileInput=new WebDriverWait(driver,10).
					until(ExpectedConditions.visibilityOfElementLocated(chooseFile_xpath)); 	
			//WebElement fileInput = driver.findElement(By.xpath(chooseFile_xpath));
			fileInput.sendKeys(filepath);
			Thread.sleep(3000);
		}catch(Exception e){
			
		}
		
	}
	public void scrollIntoView(By xpath) {
		WebElement element = driver.findElement(xpath);
		((JavascriptExecutor) driver).executeScript(
				"arguments[0].scrollIntoView(true);", element);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} }
	
	//rohit	
	public void fileupload(String FilePath,By xpath){		
			 try {
			    	WebElement El = driver.findElement(xpath);
				((RemoteWebElement) El ).setFileDetector(new LocalFileDetector()); 
				El.sendKeys(FilePath);
				Thread.sleep(2000);
			} 
			 catch (Exception e) {
					e.printStackTrace();
		    }
	}
	
	 public static String largest(String[] s) 
     { 
         int i;       
         String max = s[0]; 
         for (i = 1; i < s.length; i++) 
             if (s[i].length() > max.length()) 
                 max = s[i]; 
        
         return max; 
     } 	
	
/*	public void getClient(){
		clientName=driver.findElement(By.id("select2-choose_borrower-container")).getText().toString();
		String[] s = clientName.split("[, ?.@-]+");
		clientName=largest(s);
*/

	public static void getClient() {
        clientName = driver
                .findElement(By.id("select2-choose_borrower-container"))
                .getText().toString();
        String[] splitStr = clientName.split("\\s+");
        clientName = splitStr[0];
    }
}
	

