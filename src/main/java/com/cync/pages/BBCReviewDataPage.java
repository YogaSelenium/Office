package com.cync.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.cync.base.BasePage;

public class BBCReviewDataPage extends BasePage {
	private final By bbcReviewDataPage_xpath = By
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
			.xpath("(//td[@class='numRightAlign'])[4]");
	private final By receivableCollateralAmount1_xpath = By
			.xpath("(//td[@class='numRightAlign'])[3]");
	
	private final By creditLineAvailabilityAmount_xpath = By
			.xpath("(//td[@class='numRightAlign'])[9]");
	private final By bbcAvailablityAmount_xpath = By
			.xpath("(//td[@class='numRightAlign'])[11]");
	private final By bbcAvailablityAmount1_xpath = By
			.xpath("(//td[@class='numRightAlign'])[12]");
	
	private final By bbcDate_xpath=By.xpath("//input[@value='04/28/2018']");
	private final By bbcDateField_xpath=By.xpath("//label[text()='BBC Date']");



	private final By InventoryCollateral_xpath = By
		.xpath("//label[text()='Inventory Collateral']");
	private final By InventoryAmount_xpath = By
		.xpath("(//td[@class='numRightAlign'])[6]");
	
	private final By InventoryAmount1_xpath = By
			.xpath("(//td[@class='numRightAlign'])[5]");
	
	private final By OtherCollateral_xpath = By
		.xpath("//label[text()='Other Collateral']");
	private final By OtherCollateralAmount_xpath = By
		.xpath("(//td[@class='numRightAlign'])[7]");

	private final By OtherCollateralAmount1_xpath = By
			.xpath("(//td[@class='numRightAlign'])[8]");

///ineli cust
	private final By Selectbbc_xpath=By.xpath("//select[@id='choose_bbc']");
   private final By menu_xpath=By.xpath("//img[@class='home-icon']");
	
	
	public BBCReviewDataPage(WebDriver driver) {
		super(driver);

		try {
			Thread.sleep(1000);
		} catch (Exception e) {

			e.printStackTrace();
		}
		/*if (!driver.findElement(bbcReviewDataPage_xpath).getText().trim()
				.equals("BBC Review Data")) {
			throw new SkipException("BBC Review Data couldn't open.");
		}*/
	}
	
	//ineligible cust
	public boolean Click_on_BBCdate(String sw) {
		try {
			WebElement accTypeDropdownWebEelement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(Selectbbc_xpath));
			Select sel = new Select(accTypeDropdownWebEelement);
			sel.selectByVisibleText(sw);
			/*List<WebElement> list = sel.getOptions();
			for (WebElement ele : list) {
				if (ele.getText().equals(sw)) {
					ele.click();
					//Thread.sleep(5000);
					break;
				}
			}*/
			return true;} 
		catch (Exception ex) {
		}
		return false;

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
	
	public boolean verifyReceivableCollateralAmount1(String expected) {
		try {
			WebElement receivableCollateralAmountWebElement = new WebDriverWait(
					driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(receivableCollateralAmount1_xpath));
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
	
	public boolean verifyBBCAvailabilityAmount1(String expected) {
		try {
			WebElement bbcAvailabilityAmountWebElement = new WebDriverWait(
					driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(bbcAvailablityAmount1_xpath));
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
	
	public boolean verifyInventoryAmount1(String expected) {
		try {
			WebElement InventoryCollateralAmountWebElement = new WebDriverWait(
					driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(InventoryAmount1_xpath));
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

	public boolean verifyOtherCollateralAmount1(String expected) {
		try {
			WebElement OtherCollateralAmountWebElement = new WebDriverWait(
					driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(OtherCollateralAmount1_xpath));
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
	public boolean clickonmenu()
	{
	try{
		WebElement BBCDateWebElement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(menu_xpath));
		BBCDateWebElement.click();
		return true;
	}
	catch(Exception ex){
		return false;
	}

	}
	
	
	
	
	
}
	

