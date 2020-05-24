package com.cync.pages;




import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.cync.base.BasePage;

public class PayoffInquiryPage extends BasePage {
	
	
	private final By PayoffDate_xpath=By.xpath("//label[@class='control-label required']");
	private final By FloatDate_xpath=By.xpath("(//label[@class='control-label'])[1]");
	private final By AdditionalFees_xpath=By.xpath("(//label[@class='control-label'])[3]");
	private final By Instructions_xpath=By.xpath("(//label[@class='control-label'])[5]");
	private final By Disclaimer_xpath=By.xpath("(//label[@class='control-label'])[6]");
	private final By Signature_xpath=By.xpath("(//label[@class='control-label'])[7]");
	private final By BankDetails_xpath=By.xpath("(//label[@class='control-label'])[8]");
	private final By PayoffDateTextBox_xpath=By.xpath("//input[@id='payoff_date']");
	private final By generate_xpath=By.xpath("//button[@id='payoff_calculate']");
	private final By floatDays_xpath=By.xpath("//input[@id='float_days']");
	private final By AddLink_xpath=By.xpath("//a[@class='add_button']");
	private final By nameTextBox_xpath=By.xpath("(//input[@type='text'])[3]");
	private final By amountTextBox_xpath=By.xpath("(//input[@type='number'])[2]");
	private final By SecondNameTextBox_xpath=By.xpath("(//input[@type='text'])[4]");
	private final By SecondamountTextBox_xpath=By.xpath("(//input[@name='additional_fee_amounts[]'])[2]");
	private final By instructionTextBox_xpath=By.xpath("//textarea[@id='instructions']");
	private final By disclaimerTextBox_xpath=By.xpath("//textarea[@id='disclaimer']");
	private final By signatureField_xpath=By.xpath("//textarea[@id='signature']");
	private final By BankName_xpath=By.xpath("(//b[contains(text(),'Bank Name:')])[1]");
	private final By BankAccountName_xpath=By.xpath("(//b[contains(text(),'Bank Account Name:')])[1]");
	private final By BankAccount_xpath=By.xpath("(//b[contains(text(),'Bank Account #:')])[1]");
	private final By BankRouting_xpath=By.xpath("(//b[contains(text(),'Bank Routing:')])[1]");
	private final By BankAddress_xpath=By.xpath("(//b[contains(text(),'Bank Address:')])[1]");
	private final By perDiem_xpath=By.xpath("//input[@name='per_diem']");
	private final By BankDetailsCheckBox_xpath=By.xpath("//input[@id='bank_details_']");
	private final By Report_xpath=By.xpath("//em[text()='ABL']");
	
	
	
	public PayoffInquiryPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stu
	}

	
	public boolean VerifyPayoffDate()
	{
	 
	try{
		WebElement PayoffDateWebEelement=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(PayoffDate_xpath));
		PayoffDateWebEelement.isDisplayed();
		//Thread.sleep(2000);
			return true;
		
	} catch (Exception e) {
		return false;
	}
    }
	

	public boolean VerifyFloatDate()
	{
	 
	try{
		WebElement FloatDateWebEelement=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(FloatDate_xpath));
		FloatDateWebEelement.isDisplayed();
		//Thread.sleep(2000);
			return true;
		
	} catch (Exception e) {
		return false;
	}
    }
	
	
	public boolean VerifyAdditionalFees()
	{
	 
	try{
		WebElement AdditionalFeesWebEelement=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(AdditionalFees_xpath));
		AdditionalFeesWebEelement.isDisplayed();
		//Thread.sleep(2000);
			return true;
		
	} catch (Exception e) {
		return false;
	}
	}
	
	public boolean VerifyInstructions()
	{
	 
	try{
		WebElement InstructionsWebEelement=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(Instructions_xpath));
		InstructionsWebEelement.isDisplayed();
		//Thread.sleep(2000);
			return true;
		
	} catch (Exception e) {
		return false;
	}
    }
	
	public boolean VerifyDisclaimer()
	{
	 
	try{
		WebElement DisclaimerWebEelement=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(Disclaimer_xpath));
		DisclaimerWebEelement.isDisplayed();
		//Thread.sleep(2000);
			return true;
		
	} catch (Exception e) {
		return false;
	}
    }
	
	public boolean VerifySignature()
	{
	 
	try{
		WebElement disabledFieldWebEelement=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(Signature_xpath));
		disabledFieldWebEelement.isDisplayed();
		//Thread.sleep(2000);
			return true;
		
	} catch (Exception e) {
		return false;
	}
    }
	
	
	public boolean VerifyBankDetails()
	{
	 
	try{
		WebElement BankdetailsWebEelement=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(BankDetails_xpath));
		BankdetailsWebEelement.isDisplayed();
		//Thread.sleep(2000);
			return true;
		
	} catch (Exception e) {
		return false;
	}
    }
	
	public   boolean VerifyPayOffDateTextBox(String Date)
	{
	 
	try{
		WebElement PayoffDateTextBoxWebEelement=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(PayoffDateTextBox_xpath));
		//Thread.sleep(2000);
		PayoffDateTextBoxWebEelement.clear();
		PayoffDateTextBoxWebEelement.sendKeys(Date);
		//Thread.sleep(2000);
			return true;
		
	} catch (Exception e) {
		return false;
	}
    }
	
	
	public boolean VerifyGenerate()
	{
	 
	try{
		WebElement GenerateWebEelement=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(generate_xpath));
		GenerateWebEelement.click();
		Thread.sleep(1000);
			return true;
		
	} catch (Exception e) {
		return false;
	}
    }
	
	public boolean VerifyFloatDaysTextBox()
	{
	 
	try{
		WebElement FloatDaysTextBoxEelement=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(floatDays_xpath));
		FloatDaysTextBoxEelement.isDisplayed();
		//Thread.sleep(000);
			return true;
		
	} catch (Exception e) {
		return false;
	}
    }
	
	
	public boolean VerifyFloatDaysText(String days)
	{
	 
	try{
		WebElement FloatDaysTextBoxEelement=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(floatDays_xpath));
		FloatDaysTextBoxEelement.clear();
		FloatDaysTextBoxEelement.sendKeys(days);
		Thread.sleep(1000);
			return true;
		
	} catch (Exception e) {
		return false;
	}
    }
	
	
	public boolean VerifyAddLink()
	{
	 
	try{
		WebElement AddLinkWebEelement=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(AddLink_xpath));
		AddLinkWebEelement.click();
		Thread.sleep(1000);
			return true;
		
	} catch (Exception e) {
		return false;
	}
    }

	public   boolean VerifyNametextBox(String name)
	{
	 
	try{
		WebElement NameTextboxWebEelement=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(nameTextBox_xpath));
		//Thread.sleep(2000);
		NameTextboxWebEelement.clear();
		NameTextboxWebEelement.sendKeys(name);
		//Thread.sleep(2000);
			return true;
		
	} catch (Exception e) {
		return false;
	}
    }
	
	public   boolean VerifyAmounttextBox(String amount)
	{
	 
	try{
		WebElement AmountTextBoxWebEelement=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(amountTextBox_xpath));
		//Thread.sleep(2000);
		AmountTextBoxWebEelement.clear();
		AmountTextBoxWebEelement.sendKeys(amount);
		//Thread.sleep(2000);
			return true;
		
	} catch (Exception e) {
		return false;
	}
    }
	
	
	public   boolean VerifySecondNametextBox(String name1)
	{
	 
	try{
		WebElement SecondNameTextBoxWebEelement=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(SecondNameTextBox_xpath));
		//Thread.sleep(2000);
		SecondNameTextBoxWebEelement.clear();
		SecondNameTextBoxWebEelement.sendKeys(name1);
		//Thread.sleep(2000);
			return true;
		
	} catch (Exception e) {
		return false;
	}
    }
	
	public   boolean VerifySecondAmounttextBox(String amnt)
	{
	 
	try{
		WebElement SecondAmountTextBoxWebEelement=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(SecondamountTextBox_xpath));
		//Thread.sleep(2000);
		SecondAmountTextBoxWebEelement.clear();
		SecondAmountTextBoxWebEelement.sendKeys(amnt);
		//Thread.sleep(2000);
			return true;
		
	} catch (Exception e) {
		return false;
	}
    }
	  
	
	public boolean VerifyInstructionTextBox()
	{
	 
	try{
		WebElement InstructionTextBoxWebEelement=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(AddLink_xpath));
		InstructionTextBoxWebEelement.isDisplayed();
		//Thread.sleep(2000);
			return true;
		
	} catch (Exception e) {
		return false;
	}
    }
	

	public boolean VerifyTheInstructionsField(String instruction)
	{
	 
	try{
		WebElement InstructionTextBoxWebEelement=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(instructionTextBox_xpath));
		InstructionTextBoxWebEelement.clear();
		InstructionTextBoxWebEelement.sendKeys(instruction);
		//Thread.sleep(2000);
			return true;
		
	} catch (Exception e) {
		return false;
	}
    }
	
	
	public boolean VerifyDisclaimerField()
	{
	 
	try{
		WebElement DisclaimerWebEelement=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(disclaimerTextBox_xpath));
		DisclaimerWebEelement.isDisplayed();
		//Thread.sleep(2000);
			return true;
		
	} catch (Exception e) {
		return false;
	}
    }
	
	
	public boolean ValidateDisclaimerField(String disclaimer)
	{
	 
	try{
		WebElement DisclaimerTextBoxWebEelement=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(disclaimerTextBox_xpath));
		DisclaimerTextBoxWebEelement.clear();
		DisclaimerTextBoxWebEelement.sendKeys(disclaimer);
		//Thread.sleep(2000);
			return true;
		
	} catch (Exception e) {
		return false;
	}
    }
	

	public boolean VerifySignatureField1()
	{
	 
	try{
		WebElement SignatureWebEelement=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(signatureField_xpath));
		SignatureWebEelement.isDisplayed();
		//Thread.sleep(2000);
			return true;
		
	} catch (Exception e) {
		return false;
	}
    }
	
	
	public boolean ValidateSignatureField(String signature)
	{
	 
	try{
		WebElement DisclaimerTextBoxWebEelement=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(signatureField_xpath));
		DisclaimerTextBoxWebEelement.clear();
		DisclaimerTextBoxWebEelement.sendKeys(signature);
		//Thread.sleep(2000);
			return true;
		
	} catch (Exception e) {
		return false;
	}
    }
	
	

	public boolean VerifyBankName()
	{
	 
	try{
		WebElement BankNameWebEelement=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(BankName_xpath));
		BankNameWebEelement.isDisplayed();
		//Thread.sleep(2000);
			return true;
		
	} catch (Exception e) {
		return false;
	}
    }
	
	public boolean VerifyBankAccountName()
	{
	 
	try{
		WebElement BankAccountNameWebEelement=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(BankAccountName_xpath));
		BankAccountNameWebEelement.isDisplayed();
		//Thread.sleep(2000);
			return true;
		
	} catch (Exception e) {
		return false;
	}
    }
	
	
	public boolean VerifyBankAccount()
	{
	 
	try{
		WebElement BankAccountWebEelement=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(BankAccount_xpath));
		BankAccountWebEelement.isDisplayed();
		//Thread.sleep(2000);
			return true;
		
	} catch (Exception e) {
		return false;
	}
    }
	
	public boolean VerifyBankRouting()
	{
	 
	try{
		WebElement BankRoutingWebEelement=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(BankRouting_xpath));
		BankRoutingWebEelement.isDisplayed();
		//Thread.sleep(2000);
			return true;
		
	} catch (Exception e) {
		return false;
	}
    }
	
	
	public boolean VerifyBankAddress()
	{
	 
	try{
		WebElement BankAddressWebEelement=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(BankAddress_xpath));
		BankAddressWebEelement.isDisplayed();
		//Thread.sleep(2000);
			return true;
		
	} catch (Exception e) {
		return false;
	}
    }
	
	public boolean VerifyPerDiem()
	{
	 
	try{
		WebElement PerDiemWebEelement=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(perDiem_xpath));
		PerDiemWebEelement.isDisplayed();
		//Thread.sleep(2000);
			return true;
		
	} catch (Exception e) {
		return false;
	}
    }
	
	public boolean ClickOnBankDetail()
	{
	 
	try{
		WebElement BankDetailsWebEelement=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(BankDetailsCheckBox_xpath));
		BankDetailsWebEelement.click();
		//Thread.sleep(2000);
			return true;
		
	} catch (Exception e) {
		return false;
	}
	}
	
	
	
	
	public boolean VerifyReport()
	{
	 
	try{
		
		String winHandleBefore = driver.getWindowHandle();
		for(String winHandle : driver.getWindowHandles()){
		    driver.switchTo().window(winHandle);
		}
		WebElement ReportWebEelement=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(Report_xpath));
		ReportWebEelement.isDisplayed();
		//Thread.sleep(2000);
			return true;
		
	} catch (Exception e) {
		return false;
	}
	}
	
	
	
	       
		
	}


	
	
	
	
	
	
	
	

