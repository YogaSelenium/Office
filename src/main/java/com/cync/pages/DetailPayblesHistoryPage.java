package com.cync.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.SkipException;

import com.cync.base.BasePage;

public class DetailPayblesHistoryPage extends BasePage {
    
	public DetailPayblesHistoryPage(WebDriver driver) {
	super(driver);
	// TODO Auto-generated constructor stub
    }
       private final By summaryPayble_xpath = By.xpath("//span[@class='paneltitle']");
	private final By firstAccountNo_xpath = By
			.xpath("(//td[@aria-describedby='payable_summaries_list_account_no'])[1]");
	
	private final By firstAccountName_xpath = By
			.xpath("(//td[@aria-describedby='payable_summaries_list_account_name'])[1]");

	private final By futureAmount_xpath = By
			.xpath("(//td[@aria-describedby='payables_list_future_amount'])[1]");
	private final By firstCurrentAmount_xpath = By
			.xpath("(//td[@aria-describedby='payables_list_bucket_current_amount'])[1]");

	private final By firstOver30Amount_xpath = By
			.xpath("(//td[@aria-describedby='payables_list_bucket_1_amount'])[1]");

	private final By firstOver60Amount_xpath = By
			.xpath("(//td[@aria-describedby='payables_list_bucket_2_amount'])[1]");
	private final By firstOver90Amount_xpath = By
			.xpath("(//td[@aria-describedby='payables_list_bucket_3_amount'])[1]");
	private final By firstOver120Amount_xpath = By
			.xpath("(//td[@aria-describedby='payables_list_bucket_4_amount'])[1]");
	private final By firstBalanceAmount_xpath = By
		.xpath("(//td[@aria-describedby='payables_list_balance_amount'])[1]");

	private final By retentionAmount_xpath = By
		.xpath("(//td[@aria-describedby='payables_list_retention_amount'])[1]");
	
	private final By parameterName_xpath = By
		.xpath("(//td[@aria-describedby='payables_list_collateral_advance_rate_id'])[1]");
	
	
	
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
	
	
	
	private final By totalFutureAmountYesSingle_xpath = By
		.xpath("(//td[@aria-describedby='payables_list_future_amount'])[9]");
private final By totalCurrentAmountYesSingle_xpath = By
		.xpath("(//td[@aria-describedby='payables_list_bucket_current_amount'])[9]");
private final By totalOver30AmountYesSingle_xpath = By
		.xpath("(//td[@aria-describedby='payables_list_bucket_1_amount'])[9]");
private final By totalOver60AmountYesSingle_xpath = By
		.xpath("(//td[@aria-describedby='payables_list_bucket_2_amount'])[9]");
private final By totalOver90AmountYesSingle_xpath = By
		.xpath("(//td[@aria-describedby='payables_list_bucket_3_amount'])[9]");
private final By totalOver120AmountYesSingle_xpath = By
		.xpath("(//td[@aria-describedby='payables_list_bucket_4_amount'])[9]");
private final By totalBalanceAmountYesSingle_xpath = By
		.xpath("(//td[@aria-describedby='payables_list_balance_amount'])[9]");
	
	
	
	
	
	private final By firstAccountNoYesSingleDivision_xpath = By
		.xpath("(//td[text()='1001'])[1]");
	private final By firstAccountNameYesSingleDivision_xpath = By
		.xpath("(//td[text()='VENDOR1'])[1]");
	
	private final By FIrstAccountName_xpath=By.xpath("//td[contains(text(),'V001')]");
	private final By firstInvoiceNo_xpath = By
			.xpath("(//td[@aria-describedby='receivables_list_receivable_no'])[1]");
	
	private final By firstOriginalDate_xpath = By
			.xpath("(//td[@aria-describedby='receivables_list_invoice_dt'])[1]");
	
	private final By firstDueDate_xpath = By
			.xpath("(//td[@aria-describedby='receivables_list_due_dt'])[1]");
	
	
	private final By firstInvoiceDays_xpath = By
			.xpath("(//td[@aria-describedby='receivables_list_invoice_days'])[1]");
	private final By firstdueDays_xpath = By
			.xpath("(//td[@aria-describedby='receivables_list_due_days'])[1]");
		
	private final By Header_xpath=By.xpath("(//a[contains(text(),'Detail Receivables')])[3]");
    private final By Header1_xpath=By.xpath("(//a[contains(text(),'Detail Payables')])[3]");

    
    private final By AccountNoFormulDIv_xpath=By.xpath("(//*[contains(@class,'jqgrow ui-row-')])[1]//td[4]");
	private final By accountNameForMulDIv_xpath=By.xpath("(//*[contains(@class,'jqgrow ui-row-')])[1]//td[5]");
	
	
	private final By totalFutureAmountForMulDiv_xpath = By.xpath("//td[contains(text(),'28,100.00')]");
    private final By totalCurrentAmountForMulDiv_xpath = By.xpath("//tr[@class='footrow footrow-ltr ui-widget-content']//td[11]");
    private final By totalOver30AmountForMulDiv_xpath = By.xpath("//td[contains(text(),'(500.00)')]");
    private final By totalOver60AmountForMulDiv_xpath = By.xpath("//tr[@class='footrow footrow-ltr ui-widget-content']//td[13]");
    private final By totalOver90AmountForMulDiv_xpath = By.xpath("//tr[@class='footrow footrow-ltr ui-widget-content']//td[14]");
    private final By totalOver120AmountForMulDiv_xpath = By.xpath("//tr[@class='footrow footrow-ltr ui-widget-content']//td[15]");
    private final By totalBalanceAmountForMulDiv_xpath = By.xpath("//td[contains(text(),'30,400.00')]");
	//td[@aria-describedby='payable_summaries_list_balance_amount'])[5]
	
	/*public SummaryReceivablesPage(WebDriver driver) {
		super(driver);

		try {
			(//td[@aria-describedby='payables_list_balance_amount'])[9]
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
		WebElement actual=new WebDriverWait(driver,200)
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
	public boolean clickonHeader()
	{
	try{
		WebElement actual=new WebDriverWait(driver,200)
			.until(ExpectedConditions.visibilityOfElementLocated(Header_xpath));
		actual.click();
		
					return true;
		
	} catch (Exception e) {
	
	}
	return false;


}
	public boolean firstAccountNoValidation(String expected) {
		try {
			WebElement firstAccountNoWebElement = new WebDriverWait(driver, 100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(firstAccountNo_xpath));
			firstAccountNoWebElement.isDisplayed();
			System.out.println("verify account number1");
			String actual = firstAccountNoWebElement.getText();
			System.out.println("verify account number");
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

	

	

	
	public boolean futureAmountValidation(String expected) {
		try {
			/*
			 * JavascriptExecutor js = (JavascriptExecutor) driver;
			 * js.executeScript("window.scrollBy(400,0)", "");
			 */
			WebElement futureAmountWebElement = new WebDriverWait(driver, 100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(futureAmount_xpath));

			String actual = futureAmountWebElement.getText();
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
					100).until(ExpectedConditions
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
					100).until(ExpectedConditions
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
					100).until(ExpectedConditions
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
					100).until(ExpectedConditions
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
					100).until(ExpectedConditions
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
			WebElement firstBalanceAmountWebElement = new WebDriverWait(driver, 100)
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
					100).until(ExpectedConditions
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
					100).until(ExpectedConditions
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
	
	public boolean totalCurrentAmountValidation(String expected) {
		try {

			WebElement totalCurrentAmountWebElement = new WebDriverWait(driver,
					100).until(ExpectedConditions
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
					100).until(ExpectedConditions
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
					100).until(ExpectedConditions
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
					100).until(ExpectedConditions
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
					driver, 100).until(ExpectedConditions
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
					driver, 100).until(ExpectedConditions
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
					100).until(ExpectedConditions
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
	

	
	public boolean firstAccountNameValidationYesSingleDivision() {
		try {
			WebElement firstAccountNameWebElement = new WebDriverWait(driver,
					100).until(ExpectedConditions
					.visibilityOfElementLocated(firstAccountNameYesSingleDivision_xpath));
			firstAccountNameWebElement.isDisplayed();;
			return true;
		} catch (Exception e) {
		    return false;
		}
		
	}

	public boolean firstAccountNoValidationYesSingleDivision()
	{
	try{
		WebElement SalesNameFieldValidationWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(firstAccountNoYesSingleDivision_xpath));
		SalesNameFieldValidationWebEelement.isDisplayed();
		return true;
	}
	catch(Exception ex){
		return false;
	}

	}
	
	
	public boolean totalCurrentAmountValidationYesSingle(String expected) {
		try {

			
			WebElement totalCurrentAmountWebElement = new WebDriverWait(driver,
					100).until(ExpectedConditions
					.visibilityOfElementLocated(totalCurrentAmountYesSingle_xpath));

			String actual = totalCurrentAmountWebElement.getText();
			if (actual.equals(expected))
				return true;
			else
				return false;

		} catch (Exception e) {
			return false;
		}
	}
	
	//rohit
	public boolean totalCurrentAmountValidationYesSingle1(String expected) {
		try {

			WebElement element = driver
					.findElement(By
							.xpath("(//td[@aria-describedby='payables_list_retention_amount'])[9]"));
			((JavascriptExecutor) driver).executeScript(
					"arguments[0].scrollIntoView(true);", element);
			Thread.sleep(500);
			
			WebElement totalCurrentAmountWebElement = new WebDriverWait(driver,
					100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(totalCurrentAmountYesSingle_xpath));

			String actual = totalCurrentAmountWebElement.getText();
			if (actual.equals(expected))
				return true;
			else
				return false;

		} catch (Exception e) {
			return false;
		}
	}
	
	
	
	public boolean totalFutureAmountValidationYesSingle(String expected) {
		try {

			WebElement totalFutureAmountWebElement = new WebDriverWait(driver,
					100).until(ExpectedConditions
					.visibilityOfElementLocated(totalFutureAmountYesSingle_xpath));

			String actual = totalFutureAmountWebElement.getText();
			if (actual.equals(expected))
				return true;
			else
				return false;

		} catch (Exception e) {
			return false;
		}
	}

	public boolean totalOver30AmountValidationYesSingle(String expected) {
		try {

			WebElement totalOver30AmountWebElement = new WebDriverWait(driver,
					100).until(ExpectedConditions
					.visibilityOfElementLocated(totalOver30AmountYesSingle_xpath));

			String actual = totalOver30AmountWebElement.getText();
			if (actual.equals(expected))
				return true;
			else
				return false;

		} catch (Exception e) {
			return false;
		}
	}

	public boolean totalOver60AmountValidationYesSingle(String expected) {
		try {

			WebElement totalOver60AmountWebElement = new WebDriverWait(driver,
					100).until(ExpectedConditions
					.visibilityOfElementLocated(totalOver60AmountYesSingle_xpath));

			String actual = totalOver60AmountWebElement.getText();
			if (actual.equals(expected))
				return true;
			else
				return false;

		} catch (Exception e) {
			return false;
		}
	}

	public boolean totalOver90AmountValidationYesSingle(String expected) {
		try {

			WebElement totalOver90AmountValidationWebElement = new WebDriverWait(
					driver, 100).until(ExpectedConditions
					.visibilityOfElementLocated(totalOver90AmountYesSingle_xpath));

			String actual = totalOver90AmountValidationWebElement.getText();
			if (actual.equals(expected))
				return true;
			else
				return false;

		} catch (Exception e) {
			return false;
		}
	}

	public boolean totalOver120AmountValidationYesSingle(String expected) {
		try {

			WebElement totalOver120AmountValidationWebElement = new WebDriverWait(
					driver, 100).until(ExpectedConditions
					.visibilityOfElementLocated(totalOver120AmountYesSingle_xpath));

			String actual = totalOver120AmountValidationWebElement.getText();
			if (actual.equals(expected))
				return true;
			else
				return false;

		} catch (Exception e) {
			return false;
		}
	}
	
	
	
	public boolean totalBalanceAmountValidationYesSingle(String expected) {
		try {
			WebElement totalBalanceAmountWebElement = new WebDriverWait(driver,
					100).until(ExpectedConditions
					.visibilityOfElementLocated(totalBalanceAmountYesSingle_xpath));

			String actual = totalBalanceAmountWebElement.getText();
			if (actual.equals(expected))
				return true;
			else
				return false;

		} catch (Exception e) {
			return false;
		}
	}
	
	public boolean VerifyTheChevronIcon() {
		try {
			WebElement firstAccountNameWebElement = new WebDriverWait(driver, 100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(FIrstAccountName_xpath));
			firstAccountNameWebElement.isDisplayed();
			Thread.sleep(2000);
			return true;
		} catch (Exception e) {
			return false;
		}

		}
	public boolean firstInvoiceNoValidation(String expected) {
		try {
			WebElement firstInvoiceNoWebElement = new WebDriverWait(driver, 100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(firstInvoiceNo_xpath));

			String actual = firstInvoiceNoWebElement.getText();
			if (actual.equals(expected))
				return true;
			else
				return false;

		} catch (Exception e) {
			return false;
		}
	}
	public boolean firstOriginalDateValidation(String expected) {
		try {
			WebElement firstOriginalDateWebElement = new WebDriverWait(driver,
					100).until(ExpectedConditions
					.visibilityOfElementLocated(firstOriginalDate_xpath));

			String actual = firstOriginalDateWebElement.getText();
			if (actual.equals(expected))
				return true;
			else
				return false;

		} catch (Exception e) {
			return false;
		}
	}
	public boolean firstDueDateValidation(String expected) {
		try {
			WebElement firstDueDateWebElement = new WebDriverWait(driver, 100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(firstDueDate_xpath));

			String actual = firstDueDateWebElement.getText();
			if (actual.equals(expected))
				return true;
			else
				return false;

		} catch (Exception e) {
			return false;
		}
	}
	public boolean firstInvoiceDaysValidation(String expected) {
		try {
			WebElement firstInvoiceNoWebElement = new WebDriverWait(driver, 100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(firstInvoiceDays_xpath));

			String actual = firstInvoiceNoWebElement.getText();
			if (actual.equals(expected))
				return true;
			else
				return false;

		} catch (Exception e) {
			return false;
		}
	}
	public boolean firstDueDaysValidation(String expected) {
		try {
			WebElement firstInvoiceNoWebElement = new WebDriverWait(driver, 100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(firstdueDays_xpath));

			String actual = firstInvoiceNoWebElement.getText();
			if (actual.equals(expected))
				return true;
			else
				return false;

		} catch (Exception e) {
			return false;
		}
	}
	public boolean ClickOnHeader() {
		try {
			WebElement HeaderWebElement = new WebDriverWait(driver,10).until(ExpectedConditions
					.visibilityOfElementLocated(Header1_xpath));
			HeaderWebElement.click();		
				return true;
	
		} catch (Exception e) {
			return false;
		}
	}
	public boolean firstAccountNoValidationForMulDiv(String expected) {
		try {
			//Thread.sleep(200000);
			WebElement firstAccountNoWebElement = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(AccountNoFormulDIv_xpath));
			firstAccountNoWebElement.isDisplayed();
			System.out.println("verify account number1");
			String actual = firstAccountNoWebElement.getText();
			System.out.println("verify account number");
			if (actual.equals(expected))
		
				return true;
			
			else
				return false;
			
		} catch (Exception e) {
			return false;
		}
	}
	public boolean firstAccountNameValidationForMulDiv(String expected) {
		try {
			WebElement firstAccountNameWebElement = new WebDriverWait(driver,
					100).until(ExpectedConditions
					.visibilityOfElementLocated(accountNameForMulDIv_xpath));

			String actual = firstAccountNameWebElement.getText();
			if (actual.equals(expected))
				return true;
			else
				return false;

		} catch (Exception e) {
			return false;
		}
	}
	public boolean totalFutureAmountValidationForMulDiv(String expected) {
        try {
 
            WebElement totalFutureAmountWebElement = new WebDriverWait(driver,
                    100).until(ExpectedConditions
                    .visibilityOfElementLocated(totalFutureAmountForMulDiv_xpath));
 
            String actual = totalFutureAmountWebElement.getText();
            if (actual.equals(expected))
                return true;
            else
                return false;
 
        } catch (Exception e) {
            return false;
        }
    }
 
	public boolean totalOver30AmountValidationForMulDiv(String expected) {
        try {
 
            WebElement totalOver30AmountWebElement = new WebDriverWait(driver,
                    100).until(ExpectedConditions
                    .visibilityOfElementLocated(totalOver30AmountForMulDiv_xpath));
 
            String actual = totalOver30AmountWebElement.getText();
            if (actual.equals(expected))
                return true;
            else
                return false;
 
        } catch (Exception e) {
            return false;
        }
    }
	
	 public boolean totalOver60AmountValidationForMulDiv(String expected) {
	        try {
	 
	            WebElement totalOver60AmountWebElement = new WebDriverWait(driver,
	                    100).until(ExpectedConditions
	                    .visibilityOfElementLocated(totalOver60AmountForMulDiv_xpath));
	 
	            String actual = totalOver60AmountWebElement.getText();
	            if (actual.equals(expected))
	                return true;
	            else
	                return false;
	 
	        } catch (Exception e) {
	            return false;
	        }
	    }
	 
	 public boolean totalOver90AmountValidationForMulDiv(String expected) {
	        try {
	 
	            WebElement totalOver90AmountValidationWebElement = new WebDriverWait(
	                    driver, 10).until(ExpectedConditions
	                    .visibilityOfElementLocated(totalOver90AmountForMulDiv_xpath));
	 
	            String actual = totalOver90AmountValidationWebElement.getText();
	            System.out.println(actual);
	            if (actual.equals(expected))
	                return true;
	            else
	                return false;
	 
	        } catch (Exception e) {
	            return false;
	        }
	    }
	 
	 public boolean totalOver120AmountValidationForMulDiv(String expected) {
	        try {
	 
	            WebElement totalOver120AmountValidationWebElement = new WebDriverWait(
	                    driver, 100).until(ExpectedConditions
	                    .visibilityOfElementLocated(totalOver120AmountForMulDiv_xpath));
	 
	            String actual = totalOver120AmountValidationWebElement.getText();
	            if (actual.equals(expected))
	                return true;
	            else
	                return false;
	 
	        } catch (Exception e) {
	            return false;
	        }
	    }
	 
	 public boolean totalBalanceAmountValidationForMulDiv(String expected) {
	        try {
	            WebElement totalBalanceAmountWebElement = new WebDriverWait(driver,
	                    100).until(ExpectedConditions
	                    .visibilityOfElementLocated(totalBalanceAmountForMulDiv_xpath));
	 
	            String actual = totalBalanceAmountWebElement.getText();
	            if (actual.equals(expected))
	                return true;
	            else
	                return false;
	 
	        } catch (Exception e) {
	            return false;
	        }
	    }
	    
	
	 public boolean scrollToView_BalanceAmount()
		{
			try{
	    		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", driver.findElement(By.xpath("(//td[@aria-describedby='payables_list_bucket_4_amount'])[9]")));
		        Thread.sleep(3000);
		        return true;
				
			}
			catch(Exception e){
				
			}
			return false;
		}

	}
	 

