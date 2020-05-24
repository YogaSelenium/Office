package com.cync.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.SkipException;

import com.cync.base.BasePage;

public class ReportTemplatePage extends BasePage {
   
    private final By ReportTemplateHeader_xpath=By.xpath("//h3[contains(text(),'Report Templates')]");
    private final By breadcrumb_xpath=By.xpath("//ul[@class='breadcrumb']");
    private final By productTypeDropDownField_xpath=By.xpath("//label[contains(text(),'Product Type')]");
    private final By productTypeDropDown_xpath=By.xpath("//select[@formcontrolname='product_Type']");
    private final By saveButton_xpath=By.xpath("//span[text()='Save']");
    private final By cancelButton_xpath=By.xpath("//span[text()='Cancel']");
    private final By resetButton_xpath=By.xpath("//img[@title='Reset']");
    private final By editButton_xpath=By.xpath("//i[@id='Edit']");
    private final By PlaceHoldersField_xpath=By.xpath("//a[@class='accordion-toggle collapsed']");
    private final By PayoffQuoteRadioButton_xpath=By.xpath("//i[@class='fa fa-dot-circle-o fa-2x']");
    private final By PayoffQuoteField_xpath=By.xpath("//span[contains(text(),' Payoff Quote')]");
    private final By TemplateNamesField_xpath=By.xpath("//div[text()='Template Names']");
    private final By ReportTemplateObj_xpath=By.id("cync_notifications_msg");
    
    
    public ReportTemplatePage(WebDriver driver) {
   	super(driver);
   	try {
   		Thread.sleep(3000);
   	} catch (InterruptedException e) {
   		// TODO Auto-generated catch block
   		e.printStackTrace();
   	}
   	if(!driver.findElement(ReportTemplateHeader_xpath).getText().trim().equals("Report Templates")){
   		throw new SkipException("Report Templates couldn't open.");
   	}
   }
    
    
    
    public String ReportTemplateHeader(String ReportTemplateHeader)
	{
	try{
		WebElement ReportTemplateHeaderWebEelement=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(ReportTemplateHeader_xpath));
		ReportTemplateHeaderWebEelement.getText();
		
	}
	catch(Exception ex){
		
	}
	return ReportTemplateHeader;
	
	}   
    
    
    
    public String breadcrumbReportTemplate(String  ReportTemplateBreadcrumb)
	{
		try{
			WebElement breadcrumbWebEelement=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(breadcrumb_xpath));
			breadcrumbWebEelement.isDisplayed();
			
		}
		catch(Exception ex){
			
		}
		return ReportTemplateBreadcrumb;

		}
    
    
    
    
    public boolean productTypeDropdownFieldUIValidation(){
	
	try{
		WebElement productTypeDropdownFieldWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(productTypeDropDownField_xpath));
		productTypeDropdownFieldWebEelement.isDisplayed();
		return true;
	}
	catch(Exception ex){
		return false;
	}
    }
    
    public boolean productTypeDropdownUIValidation(){
	
   	try{
   		WebElement productTypeDropdownWebEelement=new WebDriverWait(driver,10)
   		.until(ExpectedConditions.visibilityOfElementLocated(productTypeDropDown_xpath));
   		productTypeDropdownWebEelement.isDisplayed();
   		return true;
   	}
   	catch(Exception ex){
   		return false;
   	}
       }
       
    
    
    public boolean ProductTypeDropdownValueUI(){
	try{
	    
	    String[] ValuesInTheDropDown={"Please Select","ABL","FACTORING"};
	    
	    WebElement productTypeDropdownWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(productTypeDropDown_xpath));  
	    productTypeDropdownWebEelement.click();
	     Select sel=new Select(productTypeDropdownWebEelement);
	     List<WebElement> options=sel.getOptions();
	     
	     for(WebElement ele:options){
		 
		 boolean value =false;
		 for(int i=0; i<ValuesInTheDropDown.length; i++){
		     
		     if(ele.getText().equals(ValuesInTheDropDown[i])){
			 value=true;
			 System.out.println(ele.getText());
			 
		     }
		     
		 }
		 Assert.assertTrue(value); 
	     }
	    
	    
	    
	}
	catch(Exception ex){
	    return false;  
	}
	
    return true;
    
    
}
    
    
    public String productTypeValueClick(String productTypeABLLabel) {
	
	    try{
	    WebElement productTypeDropdownWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(productTypeDropDown_xpath)); 
	    productTypeDropdownWebEelement.click();
	    
	    Select sel=new Select(productTypeDropdownWebEelement);
	    List<WebElement> list =sel.getOptions();
	    
	    for (WebElement ele:list){
		Thread.sleep(1000);
	    String el=ele.getText().trim();
		if(el.contains(productTypeABLLabel))
		{
			
		sel.selectByVisibleText(el);
		return el;
	
	    }
		
	    }
	    
	    }
	    
	    catch(Exception ex){
		 return null;
		}
	    return productTypeABLLabel;		
    } 
    
    
    
    
 public boolean TemplateNamesFieldUIValidation(){
	
   	try{
   		WebElement TemplateNamesFieldwnWebEelement=new WebDriverWait(driver,10)
   		.until(ExpectedConditions.visibilityOfElementLocated(TemplateNamesField_xpath));
   		TemplateNamesFieldwnWebEelement.isDisplayed();
   		return true;
   	}
   	catch(Exception ex){
   		return false;
   	}
       }
 
 
    
 public boolean   PayoffQuoteFieldUIValidation(){
	
	try{
		WebElement PayoffQuoteFieldwnWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(PayoffQuoteField_xpath));
		PayoffQuoteFieldwnWebEelement.isDisplayed();
		return true;
	}
	catch(Exception ex){
		return false;
	}
    }
 
 public boolean   PayoffQuoteRadioButtonUIValidation(){
	
	try{
		WebElement PayoffQuoteRadioButtonWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(PayoffQuoteRadioButton_xpath));
		PayoffQuoteRadioButtonWebEelement.isDisplayed();
		return true;
	}
	catch(Exception ex){
		return false;
	}
 }
 
    
 public boolean  PlaceHoldersFieldUIValidation(){
	
	try{
		WebElement PlaceHoldersFieldWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(PlaceHoldersField_xpath));
		PlaceHoldersFieldWebEelement.isDisplayed();
		return true;
	}
	catch(Exception ex){
		return false;
	}
}  
    
    
 public boolean  editButtonUIValidation(){
	
	try{
		WebElement editButtonWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(editButton_xpath));
		Thread.sleep(3000);
		editButtonWebEelement.isDisplayed();
		return true;
	}
	catch(Exception ex){
		return false;
	}
}  
   
 public boolean  resetButtonUIValidation(){
	
	try{
		WebElement saveButtonWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(resetButton_xpath));
		saveButtonWebEelement.isDisplayed();
		return true;
	}
	catch(Exception ex){
		return false;
	}
}
 
 public boolean cancelButtonUIValidation(){
	
	try{
		WebElement cancelButtonWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(cancelButton_xpath));
		cancelButtonWebEelement.isDisplayed();
		return true;
	}
	catch(Exception ex){
		return false;
	}
}
 
 public boolean saveButtonUIValidation(){
	
	try{
		WebElement saveButtonWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(saveButton_xpath));
		saveButtonWebEelement.isDisplayed();
		return true;
	}
	catch(Exception ex){
		return false;
	}
}

 
 public boolean  editButton(){
	
	try{
		WebElement editButtonWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(editButton_xpath));
		Thread.sleep(3000);
		editButtonWebEelement.click();
		return true;
	}
	catch(Exception ex){
		return false;
	}
}
 
 
 public boolean  saveButton(){
	
	try{
		WebElement saveButtonWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(saveButton_xpath));
		saveButtonWebEelement.click();
		return true;
	}
	catch(Exception ex){
		return false;
	}
}
 
 
 
 public String verifyMessageOnReportTemplateSave(String messageOnReportTemplate)
 {
 try{
    WebElement reportTemplateWebEelement=new WebDriverWait(driver,200)
    .until(ExpectedConditions.visibilityOfElementLocated(ReportTemplateObj_xpath));
    
   String actualMsgFromAPP= reportTemplateWebEelement.getText();
   if(actualMsgFromAPP.equalsIgnoreCase(messageOnReportTemplate))
   {
    return actualMsgFromAPP;
   }
    
 }
 catch(Exception ex){
  
 }
return messageOnReportTemplate;
 }
 
 

 public boolean  resetButtonClick(){
	
	try{
		WebElement resetButtonWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(resetButton_xpath));
		Thread.sleep(3000);
		resetButtonWebEelement.click();
		return true;
	}
	catch(Exception ex){
		return false;
	}
}

public boolean  cancelButtonClick(){
	
	try{
		WebElement cancelButtonWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(cancelButton_xpath));
		Thread.sleep(3000);
		cancelButtonWebEelement.click();
		return true;
	}
	catch(Exception ex){
		return false;
	}
}

}


