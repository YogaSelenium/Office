package com.cync.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.cync.base.BasePage;

public class DataUploadSummaryPayblesPage extends BasePage {
    
	public DataUploadSummaryPayblesPage(WebDriver driver) {
	super(driver);
	// TODO Auto-generated constructor stub
    }
       private final By summaryPayble_xpath = By.xpath("//span[@class='paneltitle']");
	private final By firstAccountNo_xpath = By
			.xpath("(//td[@aria-describedby='payable_summaries_list_account_no'])[1]");
	
	private final By firstAccountName_xpath = By
			.xpath("(//td[@aria-describedby='payable_summaries_list_account_name'])[1]");

	private final By futureAmount_xpath = By
			.xpath("(//td[@aria-describedby='payable_summaries_list_future_amount'])[1]");
	private final By firstCurrentAmount_xpath = By
			.xpath("(//td[@aria-describedby='payable_summaries_list_current_amount'])[1]");

	private final By firstOver30Amount_xpath = By
			.xpath("(//td[@aria-describedby='payable_summaries_list_bucket_1_amount'])[1]");

	private final By firstOver60Amount_xpath = By
			.xpath("(//td[@aria-describedby='payable_summaries_list_bucket_2_amount'])[1]");
	private final By firstOver90Amount_xpath = By
			.xpath("(//td[@aria-describedby='payable_summaries_list_bucket_3_amount'])[1]");
	private final By firstOver120Amount_xpath = By
			.xpath("(//td[@aria-describedby='payable_summaries_list_bucket_4_amount'])[1]");
	private final By firstBalanceAmount_xpath = By
		.xpath("(//td[@aria-describedby='payable_summaries_list_balance_amount'])[1]");

	private final By retentionAmount_xpath = By
		.xpath("(//td[@aria-describedby='payable_summaries_list_retention_amount'])[1]");
	
	private final By parameterName_xpath = By
		.xpath("(//td[@aria-describedby='payable_summaries_list_collateral_advance_rate_id'])[1]");
	
	
	
	private final By totalFutureAmount_xpath = By
			.xpath("(//td[@aria-describedby='payable_summaries_list_future_amount'])[5]");
	private final By totalCurrentAmount_xpath = By
			.xpath("(//td[@aria-describedby='payable_summaries_list_current_amount'])[5]");
	private final By totalOver30Amount_xpath = By
			.xpath("(//td[@aria-describedby='payable_summaries_list_bucket_1_amount'])[5]");
	private final By totalOver60Amount_xpath = By
			.xpath("(//td[@aria-describedby='payable_summaries_list_bucket_2_amount'])[5]");
	private final By totalOver90Amount_xpath = By
			.xpath("(//td[@aria-describedby='payable_summaries_list_bucket_3_amount'])[5]");
	private final By totalOver120Amount_xpath = By
			.xpath("(//td[@aria-describedby='payable_summaries_list_bucket_4_amount'])[5]");
	private final By totalBalanceAmount_xpath = By
			.xpath("(//td[@aria-describedby='payable_summaries_list_balance_amount'])[5]");
	
	//td[@aria-describedby='payable_summaries_list_balance_amount'])[5]
	private final By totalFutureAmountDetailClient_xpath = By
		.xpath("(//td[@aria-describedby='payable_summaries_list_future_amount'])[7]");
private final By totalCurrentAmountDetailClient_xpath = By
		.xpath("(//td[@aria-describedby='payable_summaries_list_current_amount'])[7]");
private final By totalOver30AmountDetailClient_xpath = By
		.xpath("(//td[@aria-describedby='payable_summaries_list_bucket_1_amount'])[7]");
private final By totalOver60AmountDetailClient_xpath = By
		.xpath("(//td[@aria-describedby='payable_summaries_list_bucket_2_amount'])[7]");
private final By totalOver90AmountDetailClient_xpath = By
		.xpath("(//td[@aria-describedby='payable_summaries_list_bucket_3_amount'])[7]");
private final By totalOver120AmountDetailClient_xpath = By
		.xpath("(//td[@aria-describedby='payable_summaries_list_bucket_4_amount'])[7]");
private final By totalBalanceAmountDetailClient_xpath = By
		.xpath("(//td[@aria-describedby='payable_summaries_list_balance_amount'])[7]");
	
	//anusha
    private final By SeachFieldForAccountNo_xpath=By.xpath("//input[@id='gs_account_no']");
    private final By totalFutureAmountDetailClientForMul_xpath = By.xpath("(//td[@aria-describedby='payable_summaries_list_future_amount'])[9]");
    private final By totalCurrentAmountDetailClientForMul_xpath = By.xpath("(//td[@aria-describedby='payable_summaries_list_current_amount'])[9]");
    private final By totalOver30AmountDetailClientForMul_xpath = By.xpath("(//td[@aria-describedby='payable_summaries_list_bucket_1_amount'])[9]");
    private final By totalOver60AmountDetailClientForMul_xpath = By.xpath("(//td[@aria-describedby='payable_summaries_list_bucket_2_amount'])[9]");
    private final By totalOver90AmountDetailClientFor_xpath = By.xpath("(//td[@aria-describedby='payable_summaries_list_bucket_3_amount'])[9]");
    private final By totalOver120AmountDetailClientForMul_xpath = By.xpath("(//td[@aria-describedby='payable_summaries_list_bucket_4_amount'])[9]");
    private final By totalBalanceAmountDetailClientForMul_xpath = By.xpath("(//td[@aria-describedby='payable_summaries_list_balance_amount'])[9]");
    	
	
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
	
	public boolean SummaryPaybleHeader(String expected)
	{
	try{
		WebElement actual=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(summaryPayble_xpath));
		
		
		actual.getText().trim();
		if (actual.equals(expected))
			return true;
		else
			return false;

	} catch (Exception e) {
	
	}
	return false;


}
	public boolean firstAccountNoValidation(String expected) {
		try {
			Thread.sleep(1000);
			WebElement firstAccountNoWebElement = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(firstAccountNo_xpath));

			String actual = firstAccountNoWebElement.getText();
			if (actual.equals(expected))
				return true;
			else
				return false;

		} catch (Exception e) {
			return false;
		}
	}

	
	public boolean firstAccountNameValidation(String expected) {
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

	

	

	
	public boolean futureAmountValidation(String expected) {
		try {
			/*
			 * JavascriptExecutor js = (JavascriptExecutor) driver;
			 * js.executeScript("window.scrollBy(400,0)", "");
			 */
			
			Thread.sleep(2000);
			WebElement futureAmountWebElement = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.elementToBeClickable(futureAmount_xpath));

			String actual = futureAmountWebElement.getText().trim();
			if (actual.equals(expected))
				return true;
			else
				return false;

		} catch (Exception e) {
			return false;
		}
	}
	
	public boolean firstCurrentAmountValidation(String expected) {
		try {

			WebElement firstCurrentAmountWebElement = new WebDriverWait(driver,
					10).until(ExpectedConditions
					.visibilityOfElementLocated(firstCurrentAmount_xpath));

			String actual = firstCurrentAmountWebElement.getText();
			if (actual.equals(expected))
				return true;
			else
				return false;

		} catch (Exception e) {
			return false;
		}
	}

	
	public boolean firstOver30AmountValidation(String expected) {
		try {

			WebElement firstOver30AmountWebElement = new WebDriverWait(driver,
					10).until(ExpectedConditions
					.visibilityOfElementLocated(firstOver30Amount_xpath));

			String actual = firstOver30AmountWebElement.getText();
			if (actual.equals(expected))
				return true;
			else
				return false;

		} catch (Exception e) {
			return false;
		}
	}

	

	public boolean firstOver60AmountValidation(String expected) {
		try {

			WebElement firstOver60AmountWebElement = new WebDriverWait(driver,
					10).until(ExpectedConditions
					.visibilityOfElementLocated(firstOver60Amount_xpath));

			String actual = firstOver60AmountWebElement.getText();
			if (actual.equals(expected))
				return true;
			else
				return false;

		} catch (Exception e) {
			return false;
		}
	}

	public boolean firstOver90AmountValidation(String expected) {
		try {

			WebElement firstOver90AmountWebElement = new WebDriverWait(driver,
					10).until(ExpectedConditions
					.visibilityOfElementLocated(firstOver90Amount_xpath));

			String actual = firstOver90AmountWebElement.getText();
			if (actual.equals(expected))
				return true;
			else
				return false;

		} catch (Exception e) {
			return false;
		}
	}

	public boolean firstOver120AmountValidation(String expected) {
		try {

			WebElement firstOver120AmountWebElement = new WebDriverWait(driver,
					10).until(ExpectedConditions
					.visibilityOfElementLocated(firstOver120Amount_xpath));

			String actual = firstOver120AmountWebElement.getText();
			if (actual.equals(expected))
				return true;
			else
				return false;

		} catch (Exception e) {
			return false;
		}
	}
	
	public boolean firstBalanceAmountValidation(String expected) {
		try {
			WebElement firstBalanceAmountWebElement = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(firstBalanceAmount_xpath));

			String actual = firstBalanceAmountWebElement.getText();
			if (actual.equals(expected))
				return true;
			else
				return false;

		} catch (Exception e) {
			return false;
		}
	}

	public boolean RetemtionAmountValidation(String expected) {
		try {
			WebElement thirdAccountNameWebElement = new WebDriverWait(driver,
					10).until(ExpectedConditions
					.visibilityOfElementLocated(retentionAmount_xpath));

			String actual = thirdAccountNameWebElement.getText();
			if (actual.equals(expected))
				return true;
			else
				return false;

		} catch (Exception e) {
			return false;
		}
	}

	public boolean ParameterNameValidation(String expected) {
		try {
			WebElement fourthAccountNameWebElement = new WebDriverWait(driver,
					10).until(ExpectedConditions
					.visibilityOfElementLocated(parameterName_xpath));

			String actual = fourthAccountNameWebElement.getText();
			if (actual.equals(expected))
				return true;
			else
				return false;

		} catch (Exception e) {
			return false;
		}
	}
	
	public boolean totalCurrentAmountValidationForDetailClient(String expected) {
		try {

			WebElement totalCurrentAmountWebElement = new WebDriverWait(driver,
					10).until(ExpectedConditions
					.visibilityOfElementLocated(totalCurrentAmountDetailClient_xpath));

			String actual = totalCurrentAmountWebElement.getText();
			if (actual.equals(expected))
				return true;
			else
				return false;

		} catch (Exception e) {
			return false;
		}
	}

	public boolean totalFutureAmountValidationDetailClient(String expected) {
		try {

			WebElement totalFutureAmountWebElement = new WebDriverWait(driver,
					10).until(ExpectedConditions
					.visibilityOfElementLocated(totalFutureAmountDetailClient_xpath));

			String actual = totalFutureAmountWebElement.getText();
			if (actual.equals(expected))
				return true;
			else
				return false;

		} catch (Exception e) {
			return false;
		}
	}

	public boolean totalOver30AmountValidationDetailClient(String expected) {
		try {

			WebElement totalOver30AmountWebElement = new WebDriverWait(driver,
					10).until(ExpectedConditions
					.visibilityOfElementLocated(totalOver30AmountDetailClient_xpath));

			String actual = totalOver30AmountWebElement.getText();
			if (actual.equals(expected))
				return true;
			else
				return false;

		} catch (Exception e) {
			return false;
		}
	}

	public boolean totalOver60AmountValidationDetailClient(String expected) {
		try {

			WebElement totalOver60AmountWebElement = new WebDriverWait(driver,
					10).until(ExpectedConditions
					.visibilityOfElementLocated(totalOver60AmountDetailClient_xpath));

			String actual = totalOver60AmountWebElement.getText();
			if (actual.equals(expected))
				return true;
			else
				return false;

		} catch (Exception e) {
			return false;
		}
	}

	public boolean totalOver90AmountValidationDetailClient(String expected) {
		try {

			WebElement totalOver90AmountValidationWebElement = new WebDriverWait(
					driver, 10).until(ExpectedConditions
					.visibilityOfElementLocated(totalOver90AmountDetailClient_xpath));

			String actual = totalOver90AmountValidationWebElement.getText();
			if (actual.equals(expected))
				return true;
			else
				return false;

		} catch (Exception e) {
			return false;
		}
	}

	public boolean totalOver120AmountValidationDetailClient(String expected) {
		try {

			WebElement totalOver120AmountValidationWebElement = new WebDriverWait(
					driver, 10).until(ExpectedConditions
					.visibilityOfElementLocated(totalOver120AmountDetailClient_xpath));

			String actual = totalOver120AmountValidationWebElement.getText();
			if (actual.equals(expected))
				return true;
			else
				return false;

		} catch (Exception e) {
			return false;
		}
	}
	
	
	
	public boolean totalBalanceAmountValidationDetailClient(String expected) {
		try {
			WebElement totalBalanceAmountWebElement = new WebDriverWait(driver,
					10).until(ExpectedConditions
					.visibilityOfElementLocated(totalBalanceAmountDetailClient_xpath));

			String actual = totalBalanceAmountWebElement.getText();
			if (actual.equals(expected))
				return true;
			else
				return false;

		} catch (Exception e) {
			return false;
		}
	}
	public boolean totalCurrentAmountValidation(String expected) {
		try {

			WebElement totalCurrentAmountWebElement = new WebDriverWait(driver,
					10).until(ExpectedConditions
					.visibilityOfElementLocated(totalCurrentAmount_xpath));

			String actual = totalCurrentAmountWebElement.getText();
			if (actual.equals(expected))
				return true;
			else
				return false;

		} catch (Exception e) {
			return false;
		}
	}

	public boolean totalFutureAmountValidation(String expected) {
		try {

			WebElement totalFutureAmountWebElement = new WebDriverWait(driver,
					10).until(ExpectedConditions
					.visibilityOfElementLocated(totalFutureAmount_xpath));

			String actual = totalFutureAmountWebElement.getText();
			if (actual.equals(expected))
				return true;
			else
				return false;

		} catch (Exception e) {
			return false;
		}
	}

	public boolean totalOver30AmountValidation(String expected) {
		try {

			WebElement totalOver30AmountWebElement = new WebDriverWait(driver,
					10).until(ExpectedConditions
					.visibilityOfElementLocated(totalOver30Amount_xpath));

			String actual = totalOver30AmountWebElement.getText();
			if (actual.equals(expected))
				return true;
			else
				return false;

		} catch (Exception e) {
			return false;
		}
	}

	public boolean totalOver60AmountValidation(String expected) {
		try {

			WebElement totalOver60AmountWebElement = new WebDriverWait(driver,
					10).until(ExpectedConditions
					.visibilityOfElementLocated(totalOver60Amount_xpath));

			String actual = totalOver60AmountWebElement.getText();
			if (actual.equals(expected))
				return true;
			else
				return false;

		} catch (Exception e) {
			return false;
		}
	}

	public boolean totalOver90AmountValidation(String expected) {
		try {

			WebElement totalOver90AmountValidationWebElement = new WebDriverWait(
					driver, 10).until(ExpectedConditions
					.visibilityOfElementLocated(totalOver90Amount_xpath));

			String actual = totalOver90AmountValidationWebElement.getText();
			if (actual.equals(expected))
				return true;
			else
				return false;

		} catch (Exception e) {
			return false;
		}
	}

	public boolean totalOver120AmountValidation(String expected) {
		try {

			WebElement totalOver120AmountValidationWebElement = new WebDriverWait(
					driver, 10).until(ExpectedConditions
					.visibilityOfElementLocated(totalOver120Amount_xpath));

			String actual = totalOver120AmountValidationWebElement.getText();
			if (actual.equals(expected))
				return true;
			else
				return false;

		} catch (Exception e) {
			return false;
		}
	}
	
	
	
	public boolean totalBalanceAmountValidation(String expected) {
		try {
			WebElement totalBalanceAmountWebElement = new WebDriverWait(driver,
					10).until(ExpectedConditions
					.visibilityOfElementLocated(totalBalanceAmount_xpath));

			String actual = totalBalanceAmountWebElement.getText();
			if (actual.equals(expected))
				return true;
			else
				return false;

		} catch (Exception e) {
			return false;
		}
	}
	public boolean SearchForAccountNo(String AccountNo)
	{
	try{
		WebElement actual=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(SeachFieldForAccountNo_xpath));
		
		actual.click();
		actual.sendKeys(AccountNo);
		Thread.sleep(1000);
		
			return true;

	} catch (Exception e) {
	
	}
	return false;


}
	public boolean totalFutureAmountValidationDetailClientForMulDiv(String expected) {
		try {

			WebElement totalFutureAmountWebElement = new WebDriverWait(driver,
					10).until(ExpectedConditions
					.visibilityOfElementLocated(totalFutureAmountDetailClientForMul_xpath));

			String actual = totalFutureAmountWebElement.getText();
			if (actual.equals(expected))
				return true;
			else
				return false;

		} catch (Exception e) {
			return false;
		}
	}
	public boolean totalCurrentAmountValidationForDetailClientForMuldiv(String expected) {
		try {

			WebElement totalCurrentAmountWebElement = new WebDriverWait(driver,
					10).until(ExpectedConditions
					.visibilityOfElementLocated(totalCurrentAmountDetailClientForMul_xpath));

			String actual = totalCurrentAmountWebElement.getText();
			if (actual.equals(expected))
				return true;
			else
				return false;

		} catch (Exception e) {
			return false;
		}
	}
	public boolean totalOver30AmountValidationDetailClientForMulDiv(String expected) {
		try {

			WebElement totalOver30AmountWebElement = new WebDriverWait(driver,
					10).until(ExpectedConditions
					.visibilityOfElementLocated(totalOver30AmountDetailClientForMul_xpath));

			String actual = totalOver30AmountWebElement.getText();
			if (actual.equals(expected))
				return true;
			else
				return false;

		} catch (Exception e) {
			return false;
		}
	}
	public boolean totalOver60AmountValidationDetailClientForMulDiv(String expected) {
		try {

			WebElement totalOver60AmountWebElement = new WebDriverWait(driver,
					10).until(ExpectedConditions
					.visibilityOfElementLocated(totalOver60AmountDetailClientForMul_xpath));

			String actual = totalOver60AmountWebElement.getText();
			if (actual.equals(expected))
				return true;
			else
				return false;

		} catch (Exception e) {
			return false;
		}
	}
	
	public boolean totalOver90AmountValidationDetailClientForMul(String expected) {
		try {

			WebElement totalOver90AmountValidationWebElement = new WebDriverWait(
					driver, 10).until(ExpectedConditions
					.visibilityOfElementLocated(totalOver90AmountDetailClientFor_xpath));

			String actual = totalOver90AmountValidationWebElement.getText();
			if (actual.equals(expected))
				return true;
			else
				return false;

		} catch (Exception e) {
			return false;
		}
	}
	public boolean totalOver120AmountValidationDetailClientForMulDiv(String expected) {
		try {

			WebElement totalOver120AmountValidationWebElement = new WebDriverWait(
					driver, 10).until(ExpectedConditions
					.visibilityOfElementLocated(totalOver120AmountDetailClientForMul_xpath));

			String actual = totalOver120AmountValidationWebElement.getText();
			if (actual.equals(expected))
				return true;
			else
				return false;

		} catch (Exception e) {
			return false;
		}
	}
	public boolean totalBalanceAmountValidationDetailClientForMulDIv(String expected) {
		try {
			WebElement totalBalanceAmountWebElement = new WebDriverWait(driver,
					10).until(ExpectedConditions
					.visibilityOfElementLocated(totalBalanceAmountDetailClientForMul_xpath));

			String actual = totalBalanceAmountWebElement.getText();
			if (actual.equals(expected))
				return true;
			else
				return false;

		} catch (Exception e) {
			return false;
		}
	}
	

}
