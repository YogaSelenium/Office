package com.cync.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.SkipException;

import com.cync.base.BasePage;

public class SignBBCPage extends BasePage {

    private final By SignBBCHeader_xpath=By.xpath("//span[contains(text(),'Sign BBC')]");
    private final By electornicSignature_xpath=By.xpath("//a[contains(text(),'Electronic Signature')]");

    private final By Reject_xpath=By.xpath("//a[contains(text(),'Reject')]");
    private final By Download_xpath=By.xpath("//a[contains(text(),'Download')]");
    private final By Print_xpath=By.xpath("//a[contains(text(),'Print')]");
    private final By paperSignature_xpath=By.xpath("//a[contains(text(),'Paper Signature')]");
    private final By crossElectornicSignature_xpath=By.xpath("//button[@class='ui-dialog-titlebar-close']");
    private final By cancelElectornicSignature_xpath=By.xpath("//button[text()='Cancel']");
    private final By AuthorizedSignName_xpath=By.xpath("//input[@id='signer_name']");
    private final By AgreeCheckBox_xpath=By.xpath("//input[@id='terms_condition']");
    private final By AuthorizeSignatureandApproveBBC_xpath=By.xpath("//button[contains(text(),'Authorize Signature and Approve BBC')]");
    private final By AuthorizeSignatureandApproveBBCVerify_xpath=By.xpath("//strong[contains(text(),'Your BBC Has been Signed and Approved')]");
    private final By sucessAuthorizeSignatureandApproveBBCVerify_xpath=By.xpath("//strong[contains(text(),'document was electronic signed successfully')]");
    
    private final By electornicSignaturePopup_xpath=By.xpath("//span[text()='Electronic Signature']");
    
    
    
    
    
    public SignBBCPage(WebDriver driver) {
	super(driver);
	try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	if(!driver.findElement(SignBBCHeader_xpath).getText().trim().equals("Sign BBC")){
		throw new SkipException("Sign BBC couldn't open.");
	}
}

    
    public String SignBBCHeader(String FundRequestHeader)
	{
	try{
		WebElement SignBBCHeaderWebEelement=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(SignBBCHeader_xpath));
		SignBBCHeaderWebEelement.getText();
		
	}
	catch(Exception ex){
		
	}
	return FundRequestHeader;
	
	}
    
    
    
    public boolean PaperSignatureButtonUi() {
	try{
	    Thread.sleep(1000);
		WebElement electonicSignatureWebEelement=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(paperSignature_xpath));
		electonicSignatureWebEelement.isDisplayed();
		return true;
	}
	catch(Exception ex){
		return false;
	}
	}
    
    
    
    
    public boolean ElectornicSignatureButtonUi()
   	{
   	try{
   		WebElement electonicSignatureWebEelement=new WebDriverWait(driver,10)
   			.until(ExpectedConditions.visibilityOfElementLocated(electornicSignature_xpath));
   		electonicSignatureWebEelement.isDisplayed();
   		return true;
   	}
   	catch(Exception ex){
   		return false;
   	}
   	}
    
  
    
    
    public boolean RejectButtonUi()
	{
	try{
		WebElement electonicSignatureWebEelement=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(Reject_xpath));
		electonicSignatureWebEelement.isDisplayed();
		return true;
	}
	catch(Exception ex){
		return false;
	}
	}
    public boolean DownloadButtonUi()
	{
	try{
		WebElement electonicSignatureWebEelement=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(Download_xpath));
		electonicSignatureWebEelement.isDisplayed();
		return true;
	}
	catch(Exception ex){
		return false;
	}
	}

    public boolean PrintButtonUi()
	{
	try{
		WebElement electonicSignatureWebEelement=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(Print_xpath));
		electonicSignatureWebEelement.isDisplayed();
		return true;
	}
	catch(Exception ex){
		return false;
	}
	}

    public boolean clickElectornicSignature()
	{
	try{
		WebElement electonicSignatureWebEelement=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(electornicSignature_xpath));
		electonicSignatureWebEelement.click();
		return true;
	}
	catch(Exception ex){
		return false;
	}
	}
    
    public boolean ElectornicSignaturePOPup()
	{
	try{
		WebElement electonicSignatureWebEelement=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(electornicSignaturePopup_xpath));
		electonicSignatureWebEelement.isDisplayed();
		return true;
	}
	catch(Exception ex){
		return false;
	}
	}

    public boolean crossElectornicSignature()
	{
	try{
		WebElement crosselectonicSignatureWebEelement=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(crossElectornicSignature_xpath));
		crosselectonicSignatureWebEelement.click();
		Thread.sleep(1000);
		return true;
	}
	catch(Exception ex){
		return false;
	}
	}

    
    public boolean cancelElectornicSignature()
  	{
  	try{
  		WebElement CancelelectonicSignatureWebEelement=new WebDriverWait(driver,10)
  			.until(ExpectedConditions.visibilityOfElementLocated(cancelElectornicSignature_xpath));
  		CancelelectonicSignatureWebEelement.click();
  		return true;
  	}
  	catch(Exception ex){
  		return false;
  	}
  	}
    public boolean enterDataAuthorizedSignName(String name)
	{
	try{
		WebElement AuthorizedSignNameWebEelement=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(AuthorizedSignName_xpath));
		AuthorizedSignNameWebEelement.sendKeys(name);
		return true;
	}
	catch(Exception ex){
		return false;
	}
	}
    
    public boolean clickAgree()
   	{
   	try{
   		WebElement AgreeCheckBoxWebEelement=new WebDriverWait(driver,10)
   			.until(ExpectedConditions.visibilityOfElementLocated(AgreeCheckBox_xpath));
   		AgreeCheckBoxWebEelement.click();
   		return true;
   	}
   	catch(Exception ex){
   		return false;
   	}
   	}  
    
    public boolean clickAuthorizeSignatureandApproveBBC()
	{
	try{
		
		WebElement AuthorizeSignatureandApproveBBCWebEelement=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(AuthorizeSignatureandApproveBBC_xpath));
		AuthorizeSignatureandApproveBBCWebEelement.click();
		return true;
	}
	catch(Exception ex){
		return false;
	}
	} 
    
    
    public boolean VerifyAuthorizeSignatureandApproveBBC()
	{
	try{
		
	
		
		WebElement verifySignatureandApproveBBCWebEelement=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(AuthorizeSignatureandApproveBBCVerify_xpath));
		verifySignatureandApproveBBCWebEelement.isDisplayed();
		return true;
	}
	catch(Exception ex){
		return false;
	}
	} 

    
    public boolean sucessAuthorizeSignatureandApproveBBC()
   	{
   	try{
   		
   	
   		
   		WebElement sucessSignatureandApproveBBCWebEelement=new WebDriverWait(driver,10)
   			.until(ExpectedConditions.visibilityOfElementLocated(sucessAuthorizeSignatureandApproveBBCVerify_xpath));
   		sucessSignatureandApproveBBCWebEelement.isDisplayed();
   		return true;
   	}
   	catch(Exception ex){
   		return false;
   	}
   	} 

    
    
}
