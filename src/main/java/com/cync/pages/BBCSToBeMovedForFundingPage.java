package com.cync.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.SkipException;

import com.cync.base.BasePage;

public class BBCSToBeMovedForFundingPage extends BasePage {

    public BBCSToBeMovedForFundingPage(WebDriver driver) {
	super(driver);
	// TODO Auto-generated constructor stub
    }

    private final By BBCToBeMovedForFundingScreen_xpath=By.xpath("//span[contains(text(),'Moved for funding')]");
    private final By selectClientDropDown_xpath=By.xpath("(//*[@id='selected_borrower_list'])[1]");
    private final By search_xpath=By.xpath("//input[@value='Search']");
    private final By fundRequestedAmount_xpath=By.xpath("//td[contains(text(),'10,000.00')]");
    private final By netBorrowingBaseAmount_xpath=By.xpath("//td[contains(text(),'20,000.00')]");
    private final By approveBBCFundingCheckBox_xpath=By.xpath("//input[@type='checkbox' and @name='bbc_ids[]']");
    private final By saveApproveBBCFunding_xpath=By.xpath("//input[@id='Save']");
    private final By sucessMessageOnApproveBBCFunding=By.xpath("//li[contains(text(),'The records has been saved successfully and moved into Fund BBC section')]");
    
    
    
    
    
    /*public BBCSToBeMovedForFundingPage(WebDriver driver) {
	super(driver);
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	if(!driver.findElement(BBCToBeMovedForFundingScreen_xpath).getText().trim().equals(" BBC's to be Moved for funding  ")){
		throw new SkipException("BBC's to be Moved for funding couldn't open.");
	}
	
    }*/
    
    
    public String BBCSToBeMovedForFundingPageHeader(String BBCSToBeMovedForFundingPageHeader)
	{
	try{
		WebElement ApproveBBCFundingPageWebEelement=new WebDriverWait(driver,200)
			.until(ExpectedConditions.visibilityOfElementLocated(BBCToBeMovedForFundingScreen_xpath));
		ApproveBBCFundingPageWebEelement.getText();
		
	}
	catch(Exception ex){
		
	}
	return BBCSToBeMovedForFundingPageHeader;
	
	}
	 
    
    
    public String selectClientClick(String clientName) {
	
	    try{
	    WebElement selectClientDropdownWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(selectClientDropDown_xpath)); 
	    
	    Select sel=new Select(selectClientDropdownWebEelement);
	    List<WebElement> list =sel.getOptions();
	    
	    for (WebElement ele:list){
		
		if(ele.getText().equals(clientName))
		{
		ele.click();
		break;
		
	    }
	    }
	  }
	    catch(Exception ex){
		 
		}

	return clientName;
	
	
} 
    
    
    
  
    
 public boolean clickOnSearch(){
	
   	try{
   		WebElement searchWebEelement=new WebDriverWait(driver,10)
   		.until(ExpectedConditions.visibilityOfElementLocated(search_xpath));
   		searchWebEelement.click();
   		Thread.sleep(10000);
   		return true;
   	}
   	catch(Exception ex){
   		return false;
   	}
       }
 
 public boolean fundRequestedAmount()
	{
	try{
		WebElement fundRequestedAmountWebEelement=new WebDriverWait(driver,30)
			.until(ExpectedConditions.visibilityOfElementLocated(fundRequestedAmount_xpath));
		fundRequestedAmountWebEelement.isDisplayed();
		return true;
	}
	catch(Exception ex){
		return false;
	}
	}
    
    
    public boolean netBorrowingBaseAmount()
	{
	try{
		WebElement  netBorrowingBaseWebEelement=new WebDriverWait(driver,30)
			.until(ExpectedConditions.visibilityOfElementLocated(netBorrowingBaseAmount_xpath));
		netBorrowingBaseWebEelement.isDisplayed();
		return true;
	}
	catch(Exception ex){
		return false;
	}
	}
    
    
    public boolean approveBBCFundingCheckBox()
	{
	try{
		
		WebElement  approveBBCFundingCheckBoxWebEelement=new WebDriverWait(driver,30)
			.until(ExpectedConditions.visibilityOfElementLocated(approveBBCFundingCheckBox_xpath));
		approveBBCFundingCheckBoxWebEelement.click();
		return true;
	}
	catch(Exception ex){
		return false;
	}
	}
    
    public boolean saveApproveBBCFundingScreen()
   	{
   	try{
   		
   		WebElement  saveApproveBBCFundingWebEelement=new WebDriverWait(driver,30)
   			.until(ExpectedConditions.visibilityOfElementLocated(saveApproveBBCFunding_xpath));
   		saveApproveBBCFundingWebEelement.click();
   		return true;
   	}
   	catch(Exception ex){
   		return false;
   	}
   	}
    
    public boolean sucessMessageFundingScreen()
	{
	try{
		
		WebElement  sucessMessageFundingWebEelement=new WebDriverWait(driver,30)
			.until(ExpectedConditions.visibilityOfElementLocated(sucessMessageOnApproveBBCFunding));
		sucessMessageFundingWebEelement.isDisplayed();
		return true;
	}
	catch(Exception ex){
		return false;
	}
	}
}


