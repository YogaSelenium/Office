package com.cync.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.SkipException;

import com.cync.base.BasePage;

public class DataUploadAssetInventoryHistoryPage extends BasePage {
    
	public DataUploadAssetInventoryHistoryPage(WebDriver driver) {
	super(driver);
	// TODO Auto-generated constructor stub
    }


	private final By AssetInventory_xpath = By.xpath("//span[@class='paneltitle']");
	private final By firstAssetNo_xpath = By
			.xpath("(//td[@aria-describedby='assets_list_asset_no'])[1]");
	private final By firstAccountName_xpath = By
			.xpath("(//td[@aria-describedby='assets_list_asset_name'])[1]");
	private final By firstLocation_xpath = By
		.xpath("(//td[@aria-describedby='assets_list_location'])[1]");
	private final By firstValue_xpath = By
		.xpath("(//td[@aria-describedby='assets_list_asset_amount'])[1]");
	private final By firstIneligibelValue_xpath = By
		.xpath("(//td[@aria-describedby='assets_list_balance_amount'])[1]");
	
	private final By firstCostOfGoods_xpath = By
		.xpath("(//td[@aria-describedby='assets_list_cogs_value'])[1]");
	
	private final By firstParameterName_xpath = By
		.xpath("(//td[@aria-describedby='assets_list_collateral_advance_rate_id'])[1]");
	
	private final By totalValueAmount_xpath = By
			.xpath("(//td[@aria-describedby='assets_list_asset_amount'])[4]");
	private final By totalIneligibleAmount_xpath = By
			.xpath("(//td[@aria-describedby='assets_list_balance_amount'])[4]");
	private final By totalValueAmountYesSingle_xpath = By
		.xpath("(//td[@aria-describedby='assets_list_asset_amount'])[9]");
	private final By totalIneligibleAmountYesSingle_xpath = By
		.xpath("(//td[@aria-describedby='assets_list_balance_amount'])[9]");
	
	
	
	
	
	
	
	
	/*public SummaryReceivablesPage(WebDriver driver) {
		super(driver);

		try {
			
		} catch (Exception e) {

			e.printStackTrace();
		}
		if (!driver.findElement(summaryReceivables_xpath).getText().trim().equals("Summary Receivables")) {
			throw new SkipException("summary Receivables couldn't open.");
		}
	}*/
	
	public boolean AssetInventoryHeader(String expected)
	{
	try{
		WebElement actual=new WebDriverWait(driver,200)
			.until(ExpectedConditions.visibilityOfElementLocated(AssetInventory_xpath));
		
		
		actual.getText().trim();
		if (actual.equals(expected))
			return true;
		else
			return false;

	} catch (Exception e) {
	
	}
	return false;


}
	
	public boolean firstAssetNoValidation(String expected) {
		try {
			Thread.sleep(2000);
			WebElement firstAccountNoWebElement = new WebDriverWait(driver, 100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(firstAssetNo_xpath));

			String actual = firstAccountNoWebElement.getText();
			if (actual.equals(expected))
				return true;
			else
				return false;

		} catch (Exception e) {
			return false;
		}
	}

	

	public boolean firstAssetNameValidation(String expected) {
		try {
			WebElement firstAccountNameWebElement = new WebDriverWait(driver,
					100).until(ExpectedConditions
					.visibilityOfElementLocated(firstAccountName_xpath));

			String actual = firstAccountNameWebElement.getText();
			if (actual.equals(expected))
				return true;
			else
				return false;

		} catch (Exception e) {
			return false;
		}
	}

	public boolean firstLocationValidation(String expected) {
		try {
			WebElement secondAccountNameWebElement = new WebDriverWait(driver,
					100).until(ExpectedConditions
					.visibilityOfElementLocated(firstLocation_xpath));

			String actual = secondAccountNameWebElement.getText();
			if (actual.equals(expected))
				return true;
			else
				return false;

		} catch (Exception e) {
			return false;
		}
	}

	public boolean firstValueValidation(String expected) {
		try {
			WebElement thirdAccountNameWebElement = new WebDriverWait(driver,
					100).until(ExpectedConditions
					.visibilityOfElementLocated(firstValue_xpath));

			String actual = thirdAccountNameWebElement.getText();
			System.out.println(actual);
			if (actual.equals(expected))
				return true;
			else
				return false;

		} catch (Exception e) {
			return false;
		}
	}

	public boolean firstIneligibelValueValidation(String expected) {
		try {
			WebElement fourthAccountNameWebElement = new WebDriverWait(driver,
					100).until(ExpectedConditions
					.visibilityOfElementLocated(firstIneligibelValue_xpath));

			String actual = fourthAccountNameWebElement.getText();
			if (actual.equals(expected))
				return true;
			else
				return false;

		} catch (Exception e) {
			return false;
		}
	}

	public boolean firstCostOfGoodsValidation(String expected) {
		try {
			WebElement fifthAccountNameWebElement = new WebDriverWait(driver,
					100).until(ExpectedConditions
					.visibilityOfElementLocated(firstCostOfGoods_xpath));

			String actual = fifthAccountNameWebElement.getText();
			if (actual.equals(expected))
				return true;
			else
				return false;

		} catch (Exception e) {
			return false;
		}
	}

	public boolean firstParameterNameValidation(String expected) {
		try {
			WebElement sixthAccountNameWebElement = new WebDriverWait(driver,
					100).until(ExpectedConditions
					.visibilityOfElementLocated(firstParameterName_xpath));

			String actual = sixthAccountNameWebElement.getText();
			if (actual.equals(expected))
				return true;
			else
				return false;

		} catch (Exception e) {
			return false;
		}
	}

	public boolean totalValueAmountValidation(String expected) {
		try {
			WebElement seventhAccountNameWebElement = new WebDriverWait(driver,
					100).until(ExpectedConditions
					.visibilityOfElementLocated(totalValueAmount_xpath));

			String actual = seventhAccountNameWebElement.getText();
			if (actual.equals(expected))
				return true;
			else
				return false;

		} catch (Exception e) {
			return false;
		}
	}

	
	public boolean totalIneligibleAmountValidation(String expected) {
		try {
			/*
			 * JavascriptExecutor js = (JavascriptExecutor) driver;
			 * js.executeScript("window.scrollBy(400,0)", "");
			 */
			WebElement futureAmountWebElement = new WebDriverWait(driver, 100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(totalIneligibleAmount_xpath));

			String actual = futureAmountWebElement.getText();
			if (actual.equals(expected))
				return true;
			else
				return false;

		} catch (Exception e) {
			return false;
		}
	
	}
	public boolean totalValueAmountValidationYesSingle(String expected) {
		try {
			WebElement seventhAccountNameWebElement = new WebDriverWait(driver,
					100).until(ExpectedConditions
					.visibilityOfElementLocated(totalValueAmountYesSingle_xpath));

			String actual = seventhAccountNameWebElement.getText();
			if (actual.equals(expected))
				return true;
			else
				return false;

		} catch (Exception e) {
			return false;
		}
	}

	
	public boolean totalIneligibleAmountValidationYesSingle(String expected) {
		try {
			/*
			 * JavascriptExecutor js = (JavascriptExecutor) driver;
			 * js.executeScript("window.scrollBy(400,0)", "");
			 */
			WebElement futureAmountWebElement = new WebDriverWait(driver, 100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(totalIneligibleAmountYesSingle_xpath));

			String actual = futureAmountWebElement.getText();
			if (actual.equals(expected))
				return true;
			else
				return false;

		} catch (Exception e) {
			return false;
		}
	
	}
	}