package com.cync.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.cync.base.BasePage;

public class SummaryPayblesHistoryPage extends BasePage {
    
	public SummaryPayblesHistoryPage(WebDriver driver) {
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
	



	
	private final By totalFutureAmountYesSingle_xpath = By
		.xpath("(//td[@aria-describedby='payable_summaries_list_future_amount'])[7]");
private final By totalCurrentAmountYesSingle_xpath = By
		.xpath("(//td[@aria-describedby='payable_summaries_list_current_amount'])[7]");
private final By totalOver30AmountYesSingle_xpath = By
		.xpath("(//td[@aria-describedby='payable_summaries_list_bucket_1_amount'])[7]");
private final By totalOver60AmountYesSingle_xpath = By
		.xpath("(//td[@aria-describedby='payable_summaries_list_bucket_2_amount'])[7]");
private final By totalOver90AmountYesSingle_xpath = By
		.xpath("(//td[@aria-describedby='payable_summaries_list_bucket_3_amount'])[7]");
private final By totalOver120AmountYesSingle_xpath = By
		.xpath("(//td[@aria-describedby='payable_summaries_list_bucket_4_amount'])[7]");
private final By totalBalanceAmountYesSingle_xpath = By
		.xpath("(//td[@aria-describedby='payable_summaries_list_balance_amount'])[7]");
	
	
	
	
	
	private final By firstAccountNoYesSingleDivision_xpath = By
		.xpath("//td[text()='1001']");
	private final By firstAccountNameYesSingleDivision_xpath = By
		.xpath("//span[text()='VENDOR1']");


	private final By FirstChevronIcon_xpath=By.xpath("//span[@class='fa fa-angle-double-down']");
	private final By ChildrenDetailSummaryClient_xpath=By.xpath("//td[contains(text(),'VENDOR10')]");


	private final By FirstChevronicon_xpath=By.xpath("//span[@class='fa fa-angle-double-down']");
	private final By ChildrenDetail_xpath=By.xpath("//td[@role='gridcell'][contains(text(),'VENDOR1')]");
	
	private final By Header_xpath=By.xpath("(//a[contains(text(),'Summary Payables')])[3]");


	private final By totalCurrentAmountMulDiv_xpath = By.xpath("//tr[@class='footrow footrow-ltr ui-widget-content']//td[7]");
    private final By totalFutureAmountMulDiv_xpath = By.xpath("//td[contains(text(),'28,100.00')]");
    private final By totalOver30AmountMulDiv_xpath = By.xpath("//tr[@class='footrow footrow-ltr ui-widget-content']//td[@role='gridcell'][contains(text(),'(500.00)')]");
    private final By totalOver60AmountMulDiv_xpath = By.xpath("//tr[@class='footrow footrow-ltr ui-widget-content']//td[9]");
    private final By totalOver90AmountMulDiv_xpath = By.xpath("//tr[@class='footrow footrow-ltr ui-widget-content']//td[10]");
    private final By totalOver120AmountMulDiv_xpath = By.xpath("//tr[@class='footrow footrow-ltr ui-widget-content']//td[11]");
    private final By totalBalanceAmountMulDiv_xpath = By.xpath("//td[contains(text(),'30,400.00')]");
    
    //anusha
    private final By totalFutureAmountSummaryYesMulDiv_xpath = By.xpath("//td[contains(text(),'7,300.00')]");
    private final By totalOver30AmountSummaryYesMulDiv_xpath = By.xpath("//td[contains(text(),'11,250.00')]");
    private final By totalOver60AmountSummaryYesMulDiv_xpath = By.xpath("//tr[@class='footrow footrow-ltr ui-widget-content']//td[9]");
    private final By totalOver90AmountSummaryYesMulDiv_xpath = By.xpath("//tr[@class='footrow footrow-ltr ui-widget-content']//td[10]");
    private final By totalOver120AmountSummaryYesMulDiv_xpath = By.xpath("//tr[@class='footrow footrow-ltr ui-widget-content']//td[11]");
    private final By totalBalanceAmountSummaryYesMulDiv_xpath = By.xpath("//td[contains(text(),'16,700.00')]");

	//td[@aria-describedby='payable_summaries_list_balance_amount'])[5]
	
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
            Thread.sleep(3000);
			WebElement firstAccountNoWebElement = new WebDriverWait(driver, 30)

					.until(ExpectedConditions
							.visibilityOfElementLocated(firstAccountNo_xpath));
			firstAccountNoWebElement.isDisplayed();
			System.out.println("verify account number1");
			String actual = firstAccountNoWebElement.getText().trim().toString();
			System.out.println("verify account number   "+actual);
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

			String actual = firstAccountNameWebElement.getText().trim();
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
			WebElement futureAmountWebElement = new WebDriverWait(driver, 10)
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
	

	public boolean VerifyfirstChevronIcon() {
		try {
			WebElement FirstChevronIConWebElement = new WebDriverWait(driver,
					10).until(ExpectedConditions
					.visibilityOfElementLocated(FirstChevronicon_xpath));
			FirstChevronIConWebElement.isDisplayed();
			//Thread.sleep(2000);
			return true;
		} catch (Exception e) {
			return false;
		}
	
	}
	public boolean ValidationfirstChevronIcon() {
		try {
			WebElement FirstChevronIConWebElement = new WebDriverWait(driver,
					10).until(ExpectedConditions
					.visibilityOfElementLocated(FirstChevronicon_xpath));
			FirstChevronIConWebElement.click();
			//Thread.sleep(2000);
			return true;
		} catch (Exception e) {
			return false;
		}
	
	}
	
	public boolean VerifyChildrenDetails(String child) {
		try {
			WebElement FirstChevronIConWebElement = new WebDriverWait(driver,
					10).until(ExpectedConditions
					.visibilityOfElementLocated(ChildrenDetail_xpath));
			FirstChevronIConWebElement.isDisplayed();
			

			String actual = FirstChevronIConWebElement.getText();
			if (actual.equals(child))
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
					10).until(ExpectedConditions
					.visibilityOfElementLocated(firstAccountNameYesSingleDivision_xpath));
			firstAccountNameWebElement.isDisplayed();;
			return true;
		} catch (Exception e) {
		    return false;
		}
		
	}
	public boolean firstAccountNameValidationMulDiv() {
		try {
			WebElement firstAccountNameWebElement = new WebDriverWait(driver,
					10).until(ExpectedConditions
					.visibilityOfElementLocated(firstAccountName_xpath));
			firstAccountNameWebElement.isDisplayed();

			Thread.sleep(1000);


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
	
	
	public boolean firstAccountNoValidationMulDiv()
	{
	try{
		WebElement SalesNameFieldValidationWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(firstAccountNo_xpath));
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
					10).until(ExpectedConditions
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
					10).until(ExpectedConditions
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
					10).until(ExpectedConditions
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
					10).until(ExpectedConditions
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
					driver, 10).until(ExpectedConditions
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
					driver, 10).until(ExpectedConditions
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
					10).until(ExpectedConditions
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





	
	public boolean VerifyChevronIcon() {
		try {
			WebElement ChevronIconWebElement = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(FirstChevronIcon_xpath));
			ChevronIconWebElement.isDisplayed();
			//Thread.sleep(2000);
			return true;
		} catch (Exception e) {
			return false;
		}

		}
	
	public boolean ClickOnChevronIcon() {
		try {
			WebElement ChevronIconWebElement = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(FirstChevronIcon_xpath));
			ChevronIconWebElement.click();
			//Thread.sleep(2000);
			return true;
		} catch (Exception e) {
			return false;
		}

		}

	public boolean ValidationChevronIcon() {
		try {
			WebElement ChevronIconWebElement = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(FirstChevronIcon_xpath));
			ChevronIconWebElement.click();
			//Thread.sleep(2000);
			return true;
		} catch (Exception e) {
			return false;
		}

		}
	
	public boolean VerifyChildrenDetails1(String ChildrenName) {
		try {
			WebElement ChildrenDetailWebElement = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(ChildrenDetail_xpath));
			String actual = ChildrenDetailWebElement.getText();
			if (actual.equals(ChildrenName))
				return true;
			else
				return false;
		} catch (Exception e) {
			return false;
		}

		}
	public boolean VerifyChildrenDetails_summaryClient(String ChildrenName) {
		try {
			WebElement ChildrenDetailWebElement = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(ChildrenDetailSummaryClient_xpath));
			String actual = ChildrenDetailWebElement.getText();
			if (actual.equals(ChildrenName))
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
			//Thread.sleep(1000);
				return true;
			
		} catch (Exception e) {
			return false;
		}

		}
	public boolean totalFutureAmountValidationMulDiv(String expected) {
        try {
 
            WebElement totalFutureAmountWebElement = new WebDriverWait(driver,
                    10).until(ExpectedConditions
                    .visibilityOfElementLocated(totalFutureAmountMulDiv_xpath));
            String actual = totalFutureAmountWebElement.getText();
            if (actual.equals(expected))
                return true;
            else
                return false;
 
        } catch (Exception e) {
            return false;
        }
    }
	 public boolean totalOver30AmountValidationMulDiv(String expected) {
	        try {
	 
	            WebElement totalOver30AmountWebElement = new WebDriverWait(driver,
	                    10).until(ExpectedConditions
	                    .visibilityOfElementLocated(totalOver30AmountMulDiv_xpath));
	 
	            String actual = totalOver30AmountWebElement.getText();
	            if (actual.equals(expected))
	                return true;
	            else
	                return false;
	 
	        } catch (Exception e) {
	            return false;
	        }
	    }
	 public boolean totalOver60AmountValidationMulDiv(String expected) {
	        try {
	 
	            WebElement totalOver60AmountWebElement = new WebDriverWait(driver,
	                    10).until(ExpectedConditions
	                    .visibilityOfElementLocated(totalOver60AmountMulDiv_xpath));
	 
	            String actual = totalOver60AmountWebElement.getText();
	            if (actual.equals(expected))
	                return true;
	            else
	                return false;
	 
	        } catch (Exception e) {
	            return false;
	        }
	    }
	 public boolean totalOver90AmountValidationMulDiv(String expected) {
	        try {
	 
	            WebElement totalOver90AmountValidationWebElement = new WebDriverWait(
	                    driver, 10).until(ExpectedConditions
	                    .visibilityOfElementLocated(totalOver90AmountMulDiv_xpath));
	 
	            String actual = totalOver90AmountValidationWebElement.getText();
	            if (actual.equals(expected))
	                return true;
	            else
	                return false;
	 
	        } catch (Exception e) {
	            return false;
	        }
	    }
	 public boolean totalOver120AmountValidationMulDiv(String expected) {
	        try {
	 
	            WebElement totalOver120AmountValidationWebElement = new WebDriverWait(
	                    driver, 10).until(ExpectedConditions
	                    .visibilityOfElementLocated(totalOver120AmountMulDiv_xpath));
	 
	            String actual = totalOver120AmountValidationWebElement.getText();
	            if (actual.equals(expected))
	                return true;
	            else
	                return false;
	 
	        } catch (Exception e) {
	            return false;
	        }
	 
	    }
	 public boolean totalBalanceAmountValidationMulDiv(String expected) {
	        try {
	            WebElement totalBalanceAmountWebElement = new WebDriverWait(driver,
	                    10).until(ExpectedConditions
	                    .visibilityOfElementLocated(totalBalanceAmountMulDiv_xpath));
	 
	            String actual = totalBalanceAmountWebElement.getText();
	            if (actual.equals(expected))
	                return true;
	            else
	                return false;
	 
	        } catch (Exception e) {
	            return false;
	        }}
	    
	    
	 public boolean totalCurrentAmountValidationSummaryYesMulDiv(String expected) {
	        try {
	 Thread.sleep(3000);
	            WebElement totalFutureAmountWebElement = new WebDriverWait(driver,
	                    10).until(ExpectedConditions
	                    .visibilityOfElementLocated(totalFutureAmountSummaryYesMulDiv_xpath));
	            String actual = totalFutureAmountWebElement.getText();
	            if (actual.equals(expected))
	                return true;
	            else
	                return false;
	 
	        } catch (Exception e) {
	            return false;
	        }
	    }
		 public boolean totalOver30AmountValidationSummaryYesMulDiv(String expected) {
		        try {
		 
		            WebElement totalOver30AmountWebElement = new WebDriverWait(driver,
		                    10).until(ExpectedConditions
		                    .visibilityOfElementLocated(totalOver30AmountSummaryYesMulDiv_xpath));
		 
		            String actual = totalOver30AmountWebElement.getText();
		            if (actual.equals(expected))
		                return true;
		            else
		                return false;
		 
		        } catch (Exception e) {
		            return false;
		        }
		    }
		 public boolean totalOver60AmountValidationSummaryYesMulDiv(String expected) {
		        try {
		 
		            WebElement totalOver60AmountWebElement = new WebDriverWait(driver,

		                    10).until(ExpectedConditions

		                    .visibilityOfElementLocated(totalOver60AmountSummaryYesMulDiv_xpath));
		 
		            String actual = totalOver60AmountWebElement.getText();
		            if (actual.equals(expected))
		                return true;
		            else
		                return false;
		 
		        } catch (Exception e) {
		            return false;
		        }
		    }
		 public boolean totalOver90AmountValidationSummaryYesMulDiv(String expected) {
		        try {
		 
		            WebElement totalOver90AmountValidationWebElement = new WebDriverWait(

		                    driver, 10).until(ExpectedConditions

		                    .visibilityOfElementLocated(totalOver90AmountSummaryYesMulDiv_xpath));
		 
		            String actual = totalOver90AmountValidationWebElement.getText();
		            if (actual.equals(expected))
		                return true;
		            else
		                return false;
		 
		        } catch (Exception e) {
		            return false;
		        }
		    }
		 public boolean totalOver120AmountValidationSummaryYesMulDiv(String expected) {
		        try {
		 
		            WebElement totalOver120AmountValidationWebElement = new WebDriverWait(
		                    driver, 10).until(ExpectedConditions

		                    .visibilityOfElementLocated(totalOver120AmountSummaryYesMulDiv_xpath));
		 
		            String actual = totalOver120AmountValidationWebElement.getText();
		            if (actual.equals(expected))
		                return true;
		            else
		                return false;
		 
		        } catch (Exception e) {
		            return false;
		        }
		 
		    }
		 public boolean totalBalanceAmountValidationSummaryYesMulDiv(String expected) {
		        try {
		            WebElement totalBalanceAmountWebElement = new WebDriverWait(driver,

		                    10).until(ExpectedConditions
		                    .visibilityOfElementLocated(totalBalanceAmountSummaryYesMulDiv_xpath));
		 
		            String actual = totalBalanceAmountWebElement.getText();
		            if (actual.equals(expected))
		                return true;
		            else
		                return false;
		 
		        } catch (Exception e) {
		            return false;
		        }}
		    
		    
}


