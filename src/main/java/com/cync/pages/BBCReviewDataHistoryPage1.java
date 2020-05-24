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

public class BBCReviewDataHistoryPage1 extends BasePage {
	private final By BBCReviewHistoryPage_xpath = By
			.xpath("//span[@class='paneltitle']");
	private final By receivablesRollForward_xpath = By
		.xpath("//label[text()='Receivables-Roll forward']");
private final By receivableCollateral_xpath = By
		.xpath("//label[text()='Receivable Collateral']");
private final By inventoryCollateral_xpath = By
		.xpath("//label[text()='Inventory Collateral']");
private final By otherCollateral_xpath = By
		.xpath("//label[text()='Other Collateral']");
private final By creditLineAvailability_xpath = By
		.xpath("//label[text()='Credit Line Availability']");
private final By bbcAvailablity_xpath = By
		.xpath("//label[text()='BBC Availability']");
private final By receivablesRollForwardAmount_xpath = By
		.xpath("(//td[@class='numRightAlign'])[1]");
private final By receivableCollateralAmount_xpath = By
		.xpath("(//td[@class='numRightAlign'])[3]");
private final By creditLineAvailabilityAmount_xpath = By
		.xpath("(//td[@class='numRightAlign'])[9]");
private final By bbcAvailablityAmount_xpath = By
		.xpath("(//td[@class='numRightAlign'])[11]");
private final By bbcDate_xpath=By.xpath("//input[@value='04/28/2018']");
private final By bbcDateField_xpath=By.xpath("//label[text()='BBC Date']");
private final By InventoryCollateral_xpath = By
	.xpath("//label[text()='Inventory Collateral']");
private final By InventoryAmount_xpath = By
	.xpath("(//td[@class='numRightAlign'])[5]");
private final By OtherCollateral_xpath = By
	.xpath("//label[text()='Other Collateral']");
private final By OtherCollateralAmount_xpath = By
	.xpath("(//td[@class='numRightAlign'])[7]");
private final By selectBBCDateDropDown_xpath = By
	.xpath("//select[@name='detail_activity']");
private final By DescriptionField_xpath = By
	.xpath("//th[text()='Description']");
private final By CurrentValueField_xpath = By
	.xpath("//th[text()='Current Value']");
private final By PreviousValueField_xpath = By
	.xpath("//th[text()='Previous Value']");

private final By bbcStatusFieldUI_xpath = By
	.xpath("//th[text()='BBC Status']");
private final By bbcStatusField_xpath = By
	.xpath("//td[text()='Move to Fund']");

private final By FundRequestDateFieldUI_xpath = By
	.xpath("//th[text()='Fund Requested Date']");
private final By FundRequestDateField_xpath = By
	.xpath("(//td[text()='01/01/2018'])[1]");

private final By FundRequestDateField1_xpath = By
.xpath("(//td[text()='01/02/2018'])[1]");

private final By FundRequestFieldUI_xpath = By
	.xpath("//th[text()='Fund Requested']");
private final By FundRequestField_xpath = By
	.xpath("(//td[text()='8,000.00'])[1]");

private final By FundedAmountUI_xpath = By
	.xpath("//th[text()='Funded Amount']");
private final By FundedAmount_xpath = By
	.xpath("(//td[text()='8,000.00'])[2]");

private final By FundedDateUI_xpath = By
	.xpath("//th[text()='Funded Date']");
private final By FundedDate_xpath = By
	.xpath("(//td[text()='01/01/2018'])[1]");

private final By FundedDate1_xpath = By
.xpath("(//td[text()='01/03/2018'])[1]");

private final By bbcDateSingleDiv_xpath=By.xpath("//label[text()='01/01/2018']");
private final By lastApprovedBBCDiv_xpath=By.xpath("//label[text()='Last Approved BBC:']");

private final By bbcAvailability_xpath=By.xpath("((//a[text()='BBC Availability']))[3]");



//Summary
	private final By selectBbcDate_xpath=By.id("choose_bbc");
	private final By receivableRollforward_xpath=By.xpath("(//a[text()='Receivables Rollforward'])[3]");
	private final By receivableAging_xpath=By.xpath("(//a[text()='Receivable Aging'])[3]");
	private final By assetsInventoryHistory_xpath=By.xpath("(//a[text()='Assets / Inventory'])[5]");
	private final By BBCPrintButton_xpath=By.xpath("//a[contains(text(),'BBC Print')]");

//
	private final By otherCollateralHistory_xpath=By.xpath("(//a[text()='Other Collateral'])[3]");
	private final By assetsInventoryHistorya_xpath=By.xpath("(//a[text()='Assets / Inventory'])[4]");
	private final By assetsInventoryHistorySkipped_xpath=By.xpath("(//a[text()='Assets / Inventory'])[5]");








public BBCReviewDataHistoryPage1(WebDriver driver) {
	super(driver);

	try {
		Thread.sleep(1000);
	} catch (Exception e) {//div[contains(text(),'Cancel ')]

		e.printStackTrace();
	}
	if (!driver.findElement(BBCReviewHistoryPage_xpath).getText().trim()
			.equals("BBC Review Data History")) {
		throw new SkipException("BBC Review Data History couldn't open.");
	}
}

public String selectBBCDate(String BBCDate) {
	
    try{
    WebElement DropdownWebEelement=new WebDriverWait(driver,10)
	.until(ExpectedConditions.visibilityOfElementLocated(selectBBCDateDropDown_xpath)); 
    
    Select sel=new Select(DropdownWebEelement);
  //  sel.selectByVisibleText(BBCDate);
   List<WebElement> list =sel.getOptions();
    
    for (WebElement ele:list){
	
	if(ele.getText().equals(BBCDate))
	{
	ele.click();
	this.isAlertPresent();
	Thread.sleep(3000);
	break;
	
    }
    }
    
    }
    catch(Exception ex){
	 
	}

return BBCDate;


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

public boolean verifyReceivablesRollForwardAmount(String expected) {
	try {
		WebElement receivablesRollForwardAmountWebElement = new WebDriverWait(
				driver, 10)
				.until(ExpectedConditions
						.visibilityOfElementLocated(receivablesRollForwardAmount_xpath));
		WebElement receivablesRollForwardWebElement = new WebDriverWait(
				driver, 10)
				.until(ExpectedConditions
						.visibilityOfElementLocated(receivablesRollForward_xpath));

		receivablesRollForwardWebElement.isDisplayed();
		String actual = receivablesRollForwardAmountWebElement.getText().trim();
		if (actual.equals(expected))
			return true;
		else
			return false;

	} catch (Exception e) {
		return false;
	}
}
public boolean verifyReceivableCollateralAmount(String expected) {
	try {
		WebElement receivableCollateralAmountWebElement = new WebDriverWait(
				driver, 10)
				.until(ExpectedConditions
						.visibilityOfElementLocated(receivableCollateralAmount_xpath));
		WebElement receivableCollateralWebElement = new WebDriverWait(
				driver, 10)
				.until(ExpectedConditions
						.visibilityOfElementLocated(receivableCollateral_xpath));

		receivableCollateralWebElement.isDisplayed();
		String actual = receivableCollateralAmountWebElement.getText().trim();
		System.out.println(actual);
		if (actual.equals(expected))
			return true;
		else{
			return false;
		}
	} catch (Exception e) {
		return false;
	}
}



public boolean verifyCreditLineAvailabilityAmount(String expected) {
	try {
		WebElement creditLineAvailabilityAmountWebElement = new WebDriverWait(
				driver, 10)
				.until(ExpectedConditions
						.visibilityOfElementLocated(creditLineAvailabilityAmount_xpath));
		WebElement creditLineAvailabilityWebElement = new WebDriverWait(
				driver, 10)
				.until(ExpectedConditions
						.visibilityOfElementLocated(creditLineAvailability_xpath));

		creditLineAvailabilityWebElement.isDisplayed();
		String actual = creditLineAvailabilityAmountWebElement.getText().trim();
		if (actual.equals(expected))
			return true;
		else
			return false;

	} catch (Exception e) {
		return false;
	}
}

public boolean verifyBBCAvailabilityAmount(String expected) {
	try {
		WebElement bbcAvailabilityAmountWebElement = new WebDriverWait(
				driver, 10)
				.until(ExpectedConditions
						.visibilityOfElementLocated(bbcAvailablityAmount_xpath));
		WebElement bbcAvailabilityWebElement = new WebDriverWait(
				driver, 10)
				.until(ExpectedConditions
						.visibilityOfElementLocated(bbcAvailablity_xpath));

		bbcAvailabilityWebElement.isDisplayed();
		String actual = bbcAvailabilityAmountWebElement.getText().trim();
		if (actual.equals(expected))
			return true;
		else
			return false;

	} catch (Exception e) {
		return false;
	}
}



public boolean bbcDateValidation()
{
try{
	WebElement BBCDateWebElement=new WebDriverWait(driver,10)
	.until(ExpectedConditions.visibilityOfElementLocated(bbcDate_xpath));
	BBCDateWebElement.isDisplayed();
	return true;
}
catch(Exception ex){
	return false;
}

}


public boolean verifyInventoryAmount(String expected) {
	try {
		WebElement InventoryCollateralAmountWebElement = new WebDriverWait(
				driver, 10)
				.until(ExpectedConditions
						.visibilityOfElementLocated(InventoryAmount_xpath));
		WebElement InventoryCollateralWebElement = new WebDriverWait(
				driver, 10)
				.until(ExpectedConditions
						.visibilityOfElementLocated(InventoryCollateral_xpath));

		InventoryCollateralWebElement.isDisplayed();
		String actual = InventoryCollateralAmountWebElement.getText().trim();
		if (actual.equals(expected))
			return true;
		else
			return false;

	} catch (Exception e) {
		return false;
	}
}	

public boolean verifyOtherCollateralAmount(String expected) {
	try {
		WebElement OtherCollateralAmountWebElement = new WebDriverWait(
				driver, 10)
				.until(ExpectedConditions
						.visibilityOfElementLocated(OtherCollateralAmount_xpath));
		WebElement OtherCollateralWebElement = new WebDriverWait(
				driver, 10)
				.until(ExpectedConditions
						.visibilityOfElementLocated(OtherCollateral_xpath));

		OtherCollateralWebElement.isDisplayed();
		String actual = OtherCollateralAmountWebElement.getText().trim();
		if (actual.equals(expected))
			return true;
		else
			return false;

	} catch (Exception e) {
		return false;
	}
}	
public boolean DescriptionField()
{
try{
	WebElement bbcStatusFieldWebElement=new WebDriverWait(driver,10)
	.until(ExpectedConditions.visibilityOfElementLocated(DescriptionField_xpath));
	bbcStatusFieldWebElement.isDisplayed();
	return true;
}
catch(Exception ex){
	return false;
}
}
public boolean CurrentValueField()
{
try{
	WebElement FundRequestDateFieldWebElement=new WebDriverWait(driver,10)
	.until(ExpectedConditions.visibilityOfElementLocated(CurrentValueField_xpath));
	FundRequestDateFieldWebElement.isDisplayed();
	return true;
}
catch(Exception ex){
	return false;
}
}

public boolean PreviousValueField()
{
try{
	WebElement FundRequestDateFieldWebElement=new WebDriverWait(driver,10)
	.until(ExpectedConditions.visibilityOfElementLocated(PreviousValueField_xpath));
	FundRequestDateFieldWebElement.isDisplayed();
	return true;
}
catch(Exception ex){
	return false;
}
}

public boolean bbcStatusField(String expected)
{
try{
	WebElement FieldUIWebElement=new WebDriverWait(driver,10)
	.until(ExpectedConditions.visibilityOfElementLocated(bbcStatusFieldUI_xpath));
	WebElement FieldWebElement = new WebDriverWait(
		driver, 10)
		.until(ExpectedConditions
				.visibilityOfElementLocated(bbcStatusField_xpath));

	FieldUIWebElement.isDisplayed();
String actual = FieldWebElement.getText().trim();
if (actual.equals(expected))
	return true;
else
	return false;

} catch (Exception e) {
return false;
}
}	

public boolean FundRequestDateField(String expected)
{
try{
	WebElement FieldUIWebElement=new WebDriverWait(driver,10)
	.until(ExpectedConditions.visibilityOfElementLocated(FundRequestDateFieldUI_xpath));
	WebElement FieldWebElement = new WebDriverWait(
		driver, 10)
		.until(ExpectedConditions
				.visibilityOfElementLocated(FundRequestDateField_xpath));

	FieldUIWebElement.isDisplayed();
String actual = FieldWebElement.getText().trim();
if (actual.equals(expected))
	return true;
else
	return false;

} catch (Exception e) {
return false;
}
}	

	// rohit
	public boolean FundRequestDateField1(String expected) {
		try {
			WebElement FieldUIWebElement = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(FundRequestDateFieldUI_xpath));
			WebElement FieldWebElement = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(FundRequestDateField1_xpath));

			FieldUIWebElement.isDisplayed();
			String actual = FieldWebElement.getText().trim();
			if (actual.equals(expected))
				return true;
			else
				return false;

		} catch (Exception e) {
			return false;
		}
	}

public boolean FundRequestField(String expected)
{
try{
	WebElement FieldUIWebElement=new WebDriverWait(driver,10)
	.until(ExpectedConditions.visibilityOfElementLocated(FundRequestFieldUI_xpath));
	WebElement FieldWebElement = new WebDriverWait(
		driver, 10)
		.until(ExpectedConditions
				.visibilityOfElementLocated(FundRequestField_xpath));

	FieldUIWebElement.isDisplayed();
String actual = FieldWebElement.getText().trim();
if (actual.equals(expected))
	return true;
else
	return false;

} catch (Exception e) {
return false;
}
}	



public boolean FundedAmount(String expected)
{
try{
	WebElement FieldUIWebElement=new WebDriverWait(driver,10)
	.until(ExpectedConditions.visibilityOfElementLocated(FundedAmountUI_xpath));
	WebElement FieldWebElement = new WebDriverWait(
		driver, 10)
		.until(ExpectedConditions
				.visibilityOfElementLocated(FundedAmount_xpath));

	FieldUIWebElement.isDisplayed();
String actual = FieldWebElement.getText().trim();
if (actual.equals(expected))
	return true;
else
	return false;

} catch (Exception e) {
return false;
}
}	


public boolean FundedDate(String expected)
{
try{
	WebElement FieldUIWebElement=new WebDriverWait(driver,10)
	.until(ExpectedConditions.visibilityOfElementLocated(FundedDateUI_xpath));
	WebElement FieldWebElement = new WebDriverWait(
		driver, 10)
		.until(ExpectedConditions
				.visibilityOfElementLocated(FundedDate_xpath));

	FieldUIWebElement.isDisplayed();
String actual = FieldWebElement.getText().trim();
if (actual.equals(expected))
	return true;
else
	return false;

} catch (Exception e) {
return false;
}
}	

	public boolean FundedDate1(String expected) {
		try {
			WebElement FieldUIWebElement = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(FundedDateUI_xpath));
			WebElement FieldWebElement = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(FundedDate1_xpath));

			FieldUIWebElement.isDisplayed();
			String actual = FieldWebElement.getText().trim();
			if (actual.equals(expected))
				return true;
			else
				return false;

		} catch (Exception e) {
			return false;
		}
	}

public boolean bbcDateValidationForSummarySingleDiv()
{
try{
	WebElement BBCDateWebElement=new WebDriverWait(driver,10)
	.until(ExpectedConditions.visibilityOfElementLocated(bbcDateSingleDiv_xpath));
	BBCDateWebElement.isDisplayed();
	WebElement LastApprovedWebElement=new WebDriverWait(driver,10)
	.until(ExpectedConditions.visibilityOfElementLocated(lastApprovedBBCDiv_xpath));
	LastApprovedWebElement.isDisplayed();
	return true;
}
catch(Exception ex){
	return false;
}

}


//Summary
	public boolean selectDateDropdownValues(String selectDate) {
		try {
			Thread.sleep(1000);
			WebElement dateDropdownWebEelement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(selectBbcDate_xpath));
			Select sel = new Select(dateDropdownWebEelement);
			sel.selectByVisibleText(selectDate);
			/*List<WebElement> list = sel.getOptions();
			for (WebElement ele : list) {
				if (ele.getText().equals(selectDate)) {
					ele.click();
					Thread.sleep(1000);
					break;
				}
			}*/
			
			Thread.sleep(3000);
			return true;} 
		catch (Exception ex) {
		}
		return false;

	}
	
   public boolean clickOnReceivableRollforward()
	{
	try{
		WebElement clickWebElement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(receivableRollforward_xpath));
		clickWebElement.click();
		return true;
	}
	catch(Exception ex){
		return false;
	}

	}
	public boolean clickOnReceivableAging()
	{
	try{
		WebElement clickWebElement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(receivableAging_xpath));
		clickWebElement.click();
		return true;
	}
	catch(Exception ex){
		return false;
	}

	}
	
	public boolean clickOnAssetsInventory()
	{
	try{
		WebElement clickWebElement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(assetsInventoryHistory_xpath));
		clickWebElement.click();
		return true;
	}
	catch(Exception ex){
		return false;
	}

	}
	public boolean clickOnBbcavailability()
	{
	try{
		WebElement clickWebElement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(bbcAvailability_xpath));
		clickWebElement.click();
		this.isAlertPresent();
		return true;
	}
	catch(Exception ex){
		return false;
	}

	}
	
	

	
	public boolean clickOnOtherCollateral()
	{
	try{
		WebElement clickWebElement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(otherCollateralHistory_xpath));
		clickWebElement.click();
		return true;
	}
	catch(Exception ex){
		return false;
	}

	}
	
//
	
	public boolean clickOnAssetsInventorya()
	{
	try{
		WebElement clickWebElement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(assetsInventoryHistorya_xpath));
		clickWebElement.click();
		return true;
	}
	catch(Exception ex){
		return false;
	}

	}
	
	
}


