package com.cync.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.SkipException;

import com.cync.base.BasePage;

public class DataUploadAssetInventoryPage extends BasePage {
    
	public DataUploadAssetInventoryPage(WebDriver driver) {
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
	
	
	private final By totalValueAmountSecondBBC_xpath = By
		.xpath("(//td[@aria-describedby='assets_list_asset_amount'])[9]");
          private final By totalIneligibleAmountSecondBBC_xpath = By
		.xpath("(//td[@aria-describedby='assets_list_balance_amount'])[9]");
          
          //anusha
          private final By SearchFieldForLocation_xpath=By.xpath("//input[@id='gs_asset_no']");
          private final By AccountNoOfLocation1_xpath=By.xpath("(//td[contains(text(),'1001')])[2]");
          private final By AccountNameOfLocation1_xpath=By.xpath("(//td[contains(text(),'Asset1')])");
          private final By Location1_xpath=By.xpath("(//td[contains(text(),'Location1')])");
          private final By ValueOfLocation1_xpath=By.xpath("//td[contains(text(),'5,000.00')]");

          private final By IneligibleValueOfLocation1_xpath=By.xpath("(//td[contains(text(),'921.00')])");
          private final By CostOfgoodsValueOfLocation1_xpath=By.xpath("(//td[contains(text(),'0.00')])[8]");
	      private final By ParameterNameForLocation1_xpath=By.xpath("(//span[@id='collateral_advance_rate_id'])");
          private final By Location1Summary_xpath=By.xpath("(//td[contains(text(),'Location01')])");


      /*    private final By IneligibleValueOfLocation1_xpath=By.xpath("(//td[contains(text(),'921.00')])[1]");
          private final By CostOfgoodsValueOfLocation1_xpath=By.xpath("(//td[contains(text(),'0.00')])[8]");
	      private final By ParameterNameForLocation1_xpath=By.xpath("(//span[@id='collateral_advance_rate_id'])[1]");
          
*/
          
          
          
          
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
		WebElement actual=new WebDriverWait(driver,10)
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
			//Thread.sleep(2000);
			WebElement firstAccountNoWebElement = new WebDriverWait(driver, 10)
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
					10).until(ExpectedConditions
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
					10).until(ExpectedConditions
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
					10).until(ExpectedConditions
					.visibilityOfElementLocated(firstValue_xpath));

			String actual = thirdAccountNameWebElement.getText();
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
					10).until(ExpectedConditions
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
					10).until(ExpectedConditions
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
					10).until(ExpectedConditions
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
					10).until(ExpectedConditions
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
			WebElement futureAmountWebElement = new WebDriverWait(driver, 10)
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
	public boolean totalValueAmountValidationSecondBBC(String expected) {
		try {
			WebElement seventhAccountNameWebElement = new WebDriverWait(driver,
					10).until(ExpectedConditions
					.visibilityOfElementLocated(totalValueAmountSecondBBC_xpath));

			String actual = seventhAccountNameWebElement.getText();
			if (actual.equals(expected))
				return true;
			else
				return false;

		} catch (Exception e) {
			return false;
		}
	}

	
	public boolean totalIneligibleAmountValidationSecondBBC(String expected) {
		try {
			/*
			 * JavascriptExecutor js = (JavascriptExecutor) driver;
			 * js.executeScript("window.scrollBy(400,0)", "");
			 */
			WebElement futureAmountWebElement = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(totalIneligibleAmountSecondBBC_xpath));

			String actual = futureAmountWebElement.getText();
			if (actual.equals(expected))
				return true;
			else
				return false;

		} catch (Exception e) {
			return false;
		}
	
	}
	
	//anusha
	public boolean SerachForAccountNo(String AccountNo) {
		try {
			WebElement firstAccountNoWebElement = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(SearchFieldForLocation_xpath));
			firstAccountNoWebElement.click();
			firstAccountNoWebElement.sendKeys(AccountNo);
			//Thread.sleep(3000);
			
			return true;

		} catch (Exception e) {
			return false;
		}
	}
	public boolean AssetNoValidationForLocation1(String expected) {
		try {
			WebElement firstAccountNoWebElement = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(AccountNoOfLocation1_xpath));

			String actual = firstAccountNoWebElement.getText();
			if (actual.equals(expected))
				return true;
			else
				return false;

		} catch (Exception e) {
			return false;
		}
	}
	public boolean AssetNameValidationForLocation1(String expected) {
		try {
			WebElement firstAccountNameWebElement = new WebDriverWait(driver,
					10).until(ExpectedConditions
					.visibilityOfElementLocated(AccountNameOfLocation1_xpath));

			String actual = firstAccountNameWebElement.getText();
			if (actual.equals(expected))
				return true;
			else
				return false;

		} catch (Exception e) {
			return false;
		}
	}
	public boolean ValueValidationForLocation1(String expected) {
		try {
			WebElement thirdAccountNameWebElement = new WebDriverWait(driver,
					10).until(ExpectedConditions
					.visibilityOfElementLocated(ValueOfLocation1_xpath));

			String actual = thirdAccountNameWebElement.getText();
			if (actual.equals(expected))
				return true;
			else
				return false;

		} catch (Exception e) {
			return false;
		}
	}
	public boolean IneligibelValueValidationForLocaction1(String expected) {
		try {
			WebElement fourthAccountNameWebElement = new WebDriverWait(driver,
					10).until(ExpectedConditions
					.visibilityOfElementLocated(IneligibleValueOfLocation1_xpath));

			String actual = fourthAccountNameWebElement.getText();
			if (actual.equals(expected))
				return true;
			else
				return false;

		} catch (Exception e) {
			return false;
		}
	}
	public boolean LocationValidationForLocation1(String expected) {
		try {
			WebElement firstAccountNameWebElement = new WebDriverWait(driver,
					10).until(ExpectedConditions
					.visibilityOfElementLocated(Location1_xpath));

			String actual = firstAccountNameWebElement.getText();
			if (actual.equals(expected))
				return true;
			else
				return false;

		} catch (Exception e) {
			return false;
		}
	}
	public boolean LocationValidationForLocation1Summary(String expected) {
		try {
			WebElement firstAccountNameWebElement = new WebDriverWait(driver,
					10).until(ExpectedConditions
					.visibilityOfElementLocated(Location1Summary_xpath));

			String actual = firstAccountNameWebElement.getText();
			if (actual.equals(expected))
				return true;
			else
				return false;

		} catch (Exception e) {
			return false;
		}
	}
	public boolean CostOfGoodsValidationForLocation1(String expected) {
		try {
			WebElement fifthAccountNameWebElement = new WebDriverWait(driver,
					10).until(ExpectedConditions
					.visibilityOfElementLocated(CostOfgoodsValueOfLocation1_xpath));

			String actual = fifthAccountNameWebElement.getText();
			if (actual.equals(expected))
				return true;
			else
				return false;

		} catch (Exception e) {
			return false;
		}
	}
	public boolean ParameterNameValidationForLocation1(String expected) {
		try {
			WebElement sixthAccountNameWebElement = new WebDriverWait(driver,
					10).until(ExpectedConditions
					.visibilityOfElementLocated(ParameterNameForLocation1_xpath));

			String actual = sixthAccountNameWebElement.getText();
			if (actual.equals(expected))
				return true;
			else
				return false;

		} catch (Exception e) {
			return false;
		}
	}

	}