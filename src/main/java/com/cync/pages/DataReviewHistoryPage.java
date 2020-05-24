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

public class DataReviewHistoryPage extends BasePage {
	private final By DataReviewHistoryPage_xpath = By
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
		.xpath("//td[contains(text(),'Move to Fund')]");
	
	private final By FundRequestDateFieldUI_xpath = By
		.xpath("//th[text()='Fund Requested Date']");
	private final By FundRequestDateField_xpath = By
		.xpath("//table[@class='table dataTable table-bordered']/tbody/tr[1]/td[2]");
	
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
		.xpath("//table[@class='table dataTable table-bordered']/tbody/tr[1]/td[5]");
	

	private final By Header_xpath=By.xpath("(//a[contains(text(),'Summary Payables')])[3]");

	
	public DataReviewHistoryPage(WebDriver driver) {
		super(driver);

		try {
			Thread.sleep(1000);
		} catch (Exception e) {

			e.printStackTrace();
		}
		if (!driver.findElement(DataReviewHistoryPage_xpath).getText().trim()
				.equals("Data Review History")) {
			throw new SkipException("Data Review History couldn't open.");
		}
	}
	
	public String selectBBCDate(String BBCDate) {
		
	    try{
	    WebElement DropdownWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(selectBBCDateDropDown_xpath)); 
	    
	    Select sel=new Select(DropdownWebEelement);
	    sel.selectByVisibleText(BBCDate);
	    this.isAlertPresent();
	    /*List<WebElement> list =sel.getOptions();
	    
	    for (WebElement ele:list){
		
		if(ele.getText().equals(BBCDate))
		{
		ele.click();
		
		this.isAlertPresent();
	
		break;
		
	    }
	    }*/
	    
	    Thread.sleep(3000);
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
			if (actual.equals(expected))
				return true;
			else
				return false;

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
	
	public boolean clickOnHeader() {
        try {
            WebElement ChildrenDetailWebElement = new WebDriverWait(driver, 10)
                    .until(ExpectedConditions
                            .visibilityOfElementLocated(Header_xpath));
            ChildrenDetailWebElement.click();
            Thread.sleep(1000);
                return true;
            
        } catch (Exception e) {
            return false;
        }
 
        }
}
	

