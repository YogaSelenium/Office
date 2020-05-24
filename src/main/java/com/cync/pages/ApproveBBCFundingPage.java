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

public class ApproveBBCFundingPage extends BasePage {

    private final By ApproveBBCFundingScreen_xpath=By.xpath("//span[contains(text(),'Approve BBC/Funding')]");
    private final By selectClientDropDown_xpath=By.xpath("//select[@id='selected_borrower_list']");
    private final By search_xpath=By.xpath("//input[@value='Search']");
    private final By fundRequestedAmount_xpath=By.xpath("//td[contains(text(),'10,000.00')]");
    private final By netBorrowingBaseAmount_xpath=By.xpath("//td[contains(text(),'20,000.00')]");
    private final By approveBBCFundingCheckBox_xpath=By.xpath("//input[@type='checkbox' and @name='bbc_ids[]']");
    private final By currentClientName_id=By.id("select2-choose_borrower-container");

    private final By saveApproveBBCFunding_xpath=By.xpath("//input[@id='Save']");
    private final By sucessMessageOnApproveBBCFunding=By.xpath("//li[contains(text(),'The records has been saved successfully and moved into Fund BBC section')]");
    
    ///ineligible customer
    
    private final By clientsel_xpath=By.id("selected_borrower_list");
    private final By unreleasebbc_xpath=By.xpath("//a[text()='Unrelease BBC']");
    
    //anusha
    private final By UnapproveBBC_xpath=By.xpath("//a[@href='#'][contains(text(),'Unapproved BBCs')]");
    private final By UnapprovedBBCPurge_xpath=By.xpath("//a[@title='Purge']");
    

    
    public ApproveBBCFundingPage(WebDriver driver) {
	super(driver);
	try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	if(!driver.findElement(ApproveBBCFundingScreen_xpath).getText().trim().equals("Approve BBC/Funding")){
		throw new SkipException("Approve BBC/Funding couldn't open.");
	}
	
    }
    
     
    public String ApproveBBCFundingPageHeader(String ApproveBBCFundingHeader)
	{
	try{
		WebElement ApproveBBCFundingPageWebEelement=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(ApproveBBCFundingScreen_xpath));
		ApproveBBCFundingPageWebEelement.getText();
		
	}
	catch(Exception ex){
		
	}
	return ApproveBBCFundingHeader;
	
	}
	 
    //ineligible custoemr
    
    public boolean clickOnUnreleasebbc(){
    	
       	try{
       		WebElement searchWebEelement=new WebDriverWait(driver,10)
       		.until(ExpectedConditions.visibilityOfElementLocated(unreleasebbc_xpath));
       		searchWebEelement.click();
       		Alert alert = driver.switchTo().alert();
       		alert.accept();
       		Thread.sleep(1000);
       		
       		return true;
       	}
       	catch(Exception ex){
       		return false;
       	}
    }
       
    
    public String selectClientClick(String clientName) {
	
	    try{
	    	Thread.sleep(3000);
	    WebElement selectClientDropdownWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(selectClientDropDown_xpath)); 
	    selectClientDropdownWebEelement.click();
	    Select sel=new Select(selectClientDropdownWebEelement);
	   /* sel.selectByVisibleText(clientName);*/
	    List<WebElement> list =sel.getOptions();
	    
	    for (WebElement ele:list){
		
		if(ele.getText().equals(clientName))
		{
		ele.click();
		Thread.sleep(500);
		break;
		
	    }
	    }
	    
	    }
	    catch(Exception ex){
		 
		}

	return clientName;
	
	
} 

	// rohit

	public String selectClientClick1(String clientName) {

		try {
			Thread.sleep(3000);
			WebElement selectClientDropdownWebEelement = new WebDriverWait(
					driver, 10).until(ExpectedConditions
					.visibilityOfElementLocated(selectClientDropDown_xpath));

			Select sel = new Select(selectClientDropdownWebEelement);
			// sel.selectByVisibleText(clientName);
			List<WebElement> list = sel.getOptions();

			for (WebElement ele : list) {

				if (ele.getText().equals(clientName.toUpperCase())) {
					ele.click();
					break;

				}
			}
			Thread.sleep(1000);
		} catch (Exception ex) {

		}

		return clientName;

	}
    
    
    
    public boolean  Clientfromdropdown_Click(String clientName){
		try {

			WebElement DropdownWebEelements = new WebDriverWait(driver, 10)
			.until(ExpectedConditions.visibilityOfElementLocated(clientsel_xpath));
			DropdownWebEelements.click();
			DropdownWebEelements.sendKeys(clientName);
			Select sel = new Select(DropdownWebEelements);	
			//sel.selectByVisibleText(clientName);

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
   		Thread.sleep(2000);
   		return true;
   	}
   	catch(Exception ex){
   		return false;
   	}
       }
 
 public boolean clickOnSearch1(){
		
	   	try{
	   		Thread.sleep(5000);
	   		WebElement searchWebEelement=new WebDriverWait(driver,10)
	   		.until(ExpectedConditions.visibilityOfElementLocated(search_xpath));
	   		searchWebEelement.click();
	   		Thread.sleep(2000);
	   		return true;
	   	}
	   	catch(Exception ex){
	   		return false;
	   	}
	       }
 
 
 public boolean fundRequestedAmount()
	{
	try{
		WebElement fundRequestedAmountWebEelement=new WebDriverWait(driver,10)
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
		WebElement  netBorrowingBaseWebEelement=new WebDriverWait(driver,10)
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
		Thread.sleep(3000);
		WebElement  approveBBCFundingCheckBoxWebEelement=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(approveBBCFundingCheckBox_xpath));
		approveBBCFundingCheckBoxWebEelement.click();
		Thread.sleep(1000);
		return true;
	}
	catch(Exception ex){
		return false;
	}
	}
    
    public boolean saveApproveBBCFundingScreen()
   	{
   	try{
   		
   		WebElement  saveApproveBBCFundingWebEelement=new WebDriverWait(driver,10)
   			.until(ExpectedConditions.visibilityOfElementLocated(saveApproveBBCFunding_xpath));
   		saveApproveBBCFundingWebEelement.click();
   		Thread.sleep(3000);
   		return true;
   	}
   	catch(Exception ex){
   		return false;
   	}
   	}
    
    public boolean sucessMessageFundingScreen()
	{
	try{
		
		WebElement  sucessMessageFundingWebEelement=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(sucessMessageOnApproveBBCFunding));
		sucessMessageFundingWebEelement.isDisplayed();
		return true;
	}
	catch(Exception ex){
		return false;
	}
	}
    
    public String selectClientdropdown(String clientNameselect) {
    	
	    try{
	    WebElement selectClientDropdownWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(selectClientDropDown_xpath)); 
	    
	    Select sel=new Select(selectClientDropdownWebEelement);
	   // sel.selectByVisibleText(clientNameselect);
	    List<WebElement> list =sel.getOptions();
	    
	    for (WebElement ele:list){
		
		if(ele.getText().equals(clientNameselect))
		{
		ele.click();
		break;
		
	    }
	    }
	    
	    }
	    catch(Exception ex){
		 
		}

	return clientNameselect;
	
	
} 

    public boolean ClickOnUnapproveBBc()
	{
	try{
		
		WebElement  sucessMessageFundingWebEelement=new WebDriverWait(driver,30)
			.until(ExpectedConditions.visibilityOfElementLocated(UnapproveBBC_xpath));
		sucessMessageFundingWebEelement.click();
		this.isAlertPresent();
		return true;
	}
	catch(Exception ex){
		return false;
	}
	}  
    
   


	public boolean ClickUnapproveBBCPurge()
   	{
   	try{
   		
   		WebElement  sucessMessageFundingWebEelement=new WebDriverWait(driver,30)
   			.until(ExpectedConditions.visibilityOfElementLocated(UnapprovedBBCPurge_xpath));
   		sucessMessageFundingWebEelement.click();
		this.isAlertPresent();

   		Thread.sleep(4000);
   		return true;
   	}
   	catch(Exception ex){
   		return false;
   	}
   	} 
	public boolean isAlertPresent() {

		boolean presentFlag = false;

		try {
			Alert alert = driver.switchTo().alert();
			presentFlag = true;
			alert.accept();
		} catch (Exception ex) {

			System.out.println("No Such Alert Present");

		}

		return presentFlag;
	}

}


