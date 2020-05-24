package com.cync.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.cync.base.BasePage;

public class DetailPayablePage extends BasePage {  //(author:sanusha)
	
	
	private final By Over30_xpath=By.xpath("//input[@id='gs_bucket_1_amount']");
	private final By BalanceAmount_xpath=By.xpath("/html[1]/body[1]/div[3]/div[1]/div[2]/div[4]/div[1]/div[1]/div[2]/div[2]/div[3]/div[2]/div[1]/table[1]/thead[1]/tr[1]/th[16]");
	private final By Export_xpath=By.xpath("//td[@title='Export Data']//div[@class='ui-pg-div']");
    private final By BalanceAmountInPopup_xpath=By.xpath("/html[1]/body[1]/div[6]/div[2]/div[1]/div[1]/div[2]/div[13]/div[1]/label[1]");
	private final By TotalBalanceAmount_xpath=By.xpath("//td[contains(text(),'20,150.00')]");
	private final By summaryPayble_xpath = By.xpath("//span[@class='paneltitle']");
	private final By firstAccountNo_xpath = By
			.xpath("(//td[@aria-describedby='payables_list_account_no'])[1]");
	
	private final By firstAccountName_xpath = By
			.xpath("(//td[@aria-describedby='payables_list_account_name'])[1]");

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
	
	
	//anusha
	private final By SeachFieldForAccountNo_xpath=By.xpath("//input[@id='gs_account_no']");
    private final By AccountNo_xpath=By.xpath("(//td[contains(text(),'1011')])[1]");
    private final By AccountName_xpath=By.xpath("(//td[contains(text(),'VENDOR1')])[1]");
    private final By DocumentName_xpath=By.xpath("(//td[contains(text(),'12014')])[1]");
    private final By OriginalDate_xpath=By.xpath("(//td[contains(text(),'02/01/2018')])[1]");
    private final By DueDate_xpath=By.xpath("(//td[contains(text(),'02/01/2018')])[2]");
    private final By ParameterName_xpath=By.xpath("(//span[contains(text(),'Payables')])[4]");
    private final By futureAmountForMilDiv_xpath=By.xpath("(//td[contains(text(),'1,500.00')])[1]");
    private final By CurrentAmountFormulDiv_xpath=By.xpath("(//td[contains(text(),'0.00')])[2]");
    private final By Over30Amount_xpath=By.xpath("(//td[contains(text(),'0.00')])[3]");
    private final By Over60Amount_xpath=By.xpath("(//td[contains(text(),'0.00')])[4]");
    private final By Over90Amount_xpath=By.xpath("(//td[contains(text(),'0.00')])[5]");
    private final By Over120Amount_xpath=By.xpath("(//td[contains(text(),'0.00')])[6]");
    private final By CurrentAmountForMulDIvForSecondBBC_xpath=By.xpath("//tbody//tr[2]//td[10]");
    private final By FutureAmountForMulDivForSecondBBC_xpath=By.xpath("//tr[@id='266625']//td[11]");
    
    
    public DetailPayablePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	
	 public boolean clickonParameterName() {
	    	try {
	    	    WebElement clickoncolletralsearch = new WebDriverWait(driver,10)
	    		    .until(ExpectedConditions .visibilityOfElementLocated(Over30_xpath));
	    	    clickoncolletralsearch.click();
	    	    Actions action = new Actions(driver);
	    	    action.sendKeys(Keys.TAB).build().perform();
	    	    Actions action1 = new Actions(driver);
	    	    action1.sendKeys(Keys.TAB).build().perform();
	    	    Thread.sleep(3000);
	    	    return true;
	    	} catch (Exception ex) {
	    	    return false;
	    	}
		}
	 public boolean VerifyBalanceAmount() {
	    	try {	
		WebElement totalCurrentAmountWebElement = new WebDriverWait(driver,
					100).until(ExpectedConditions
					.visibilityOfElementLocated(BalanceAmount_xpath));
			totalCurrentAmountWebElement.isDisplayed();
			Thread.sleep(2000);
				return true;
		} catch (Exception e) {
			return false;
		}
	}
	 
	 public boolean ClickOnExport() {
	    	try {	
		WebElement totalCurrentAmountWebElement = new WebDriverWait(driver,
					100).until(ExpectedConditions
					.visibilityOfElementLocated(Export_xpath));
			totalCurrentAmountWebElement.click();
			Thread.sleep(2000);
				return true;
		} catch (Exception e) {
			return false;
		}
	}
	 
	 
	 public boolean VerifyBalanceAmountInPoPUp() {
	    	try {	
		WebElement totalCurrentAmountWebElement = new WebDriverWait(driver,
					100).until(ExpectedConditions
					.visibilityOfElementLocated(BalanceAmountInPopup_xpath));
			totalCurrentAmountWebElement.click();
			Thread.sleep(2000);
				return true;
		} catch (Exception e) {
			return false;
		}
	}
	 
	 public boolean VerifyTotalBalanceAmount(String BalanceAmount) {
	    	try {	
		WebElement totalCurrentAmountWebElement = new WebDriverWait(driver,
					100).until(ExpectedConditions
					.visibilityOfElementLocated(TotalBalanceAmount_xpath));
			String actual=totalCurrentAmountWebElement.getText();
			if(actual==BalanceAmount)
			return true;
			else
				return false;
			
		} catch (Exception e) {
			return false;
		}
	}
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
	 public boolean firstAccountNoValidation(String expected) {
		try {
			Thread.sleep(2000);
			WebElement firstAccountNoWebElement = new WebDriverWait(driver, 100)
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
				Thread.sleep(2000);
				WebElement firstAccountNameWebElement = new WebDriverWait(driver,
						20).until(ExpectedConditions
						.elementToBeClickable(firstAccountName_xpath));

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
			Thread.sleep(2000);
			WebElement SalesNameFieldValidationWebEelement=new WebDriverWait(driver,20)
			.until(ExpectedConditions.elementToBeClickable(firstAccountNoYesSingleDivision_xpath));
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
		 public boolean SearchFieldForAccountNo(String AccountNo) {
		    	try {	
			WebElement totalCurrentAmountWebElement = new WebDriverWait(driver,
						100).until(ExpectedConditions
						.visibilityOfElementLocated(SeachFieldForAccountNo_xpath));
			totalCurrentAmountWebElement.click();
				totalCurrentAmountWebElement.sendKeys(AccountNo);
				Thread.sleep(2000);
					return true;
			} catch (Exception e) {
				return false;
			}
		}
		 
		 public boolean AccountNoValidation(String expected) {
				try {
					WebElement firstAccountNameWebElement = new WebDriverWait(driver,
							100).until(ExpectedConditions
							.visibilityOfElementLocated(AccountNo_xpath));

					String actual = firstAccountNameWebElement.getText();
					if (actual.equals(expected))
						return true;
					else
						return false;

				} catch (Exception e) {
					return false;
				}
			}
		 public boolean AccountNameValidation(String expectedName) {
				try {
					WebElement firstAccountNameWebElement = new WebDriverWait(driver,
							100).until(ExpectedConditions
							.visibilityOfElementLocated(AccountName_xpath));

					String actual = firstAccountNameWebElement.getText();
					if (actual.equals(expectedName))
						return true;
					else
						return false;

				} catch (Exception e) {
					return false;
				}
			}

		 public boolean DocumentNameValidation(String DocumnetName) {
				try {
					WebElement firstAccountNameWebElement = new WebDriverWait(driver,
							100).until(ExpectedConditions
							.visibilityOfElementLocated(DocumentName_xpath));

					String actual = firstAccountNameWebElement.getText();
					if (actual.equals(DocumnetName))
						return true;
					else
						return false;

				} catch (Exception e) {
					return false;
				}
			}
		 public boolean OriginalDateValidation(String OriginalDate) {
				try {
					WebElement firstAccountNameWebElement = new WebDriverWait(driver,
							100).until(ExpectedConditions
							.visibilityOfElementLocated(OriginalDate_xpath));

					String actual = firstAccountNameWebElement.getText();
					if (actual.equals(OriginalDate))
						return true;
					else
						return false;

				} catch (Exception e) {
					return false;
				}
			}
		 public boolean DueDateValidation(String DueDate) {
				try {
					WebElement firstAccountNameWebElement = new WebDriverWait(driver,
							100).until(ExpectedConditions
							.visibilityOfElementLocated(DueDate_xpath));

					String actual = firstAccountNameWebElement.getText();
					if (actual.equals(DueDate))
						return true;
					else
						return false;

				} catch (Exception e) {
					return false;
				}
			}
		 public boolean ParameterNameValidationForMultidiv(String ParameterName) {
				try {
					WebElement firstAccountNameWebElement = new WebDriverWait(driver,
							100).until(ExpectedConditions
							.visibilityOfElementLocated(ParameterName_xpath));

					String actual = firstAccountNameWebElement.getText();
					if (actual.equals(ParameterName))
						return true;
					else
						return false;

				} catch (Exception e) {
					return false;
				}
			}
		 public boolean FutureAmountValidationForMultidiv(String FutureAmount) {
				try {
					WebElement firstAccountNameWebElement = new WebDriverWait(driver,
							100).until(ExpectedConditions
							.visibilityOfElementLocated(futureAmountForMilDiv_xpath));

					String actual = firstAccountNameWebElement.getText();
					if (actual.equals(FutureAmount))
						return true;
					else
						return false;

				} catch (Exception e) {
					return false;
				}
			}
		 public boolean CurrentAmountValidationForMultidiv(String CurrentAmount) {
				try {
					WebElement firstAccountNameWebElement = new WebDriverWait(driver,
							100).until(ExpectedConditions
							.visibilityOfElementLocated(CurrentAmountFormulDiv_xpath));

					String actual = firstAccountNameWebElement.getText();
					if (actual.equals(CurrentAmount))
						return true;
					else
						return false;

				} catch (Exception e) {
					return false;
				}
			}
		 public boolean Over30AmountValidationForMultidiv(String Amount1) {
				try {
					WebElement firstAccountNameWebElement = new WebDriverWait(driver,
							100).until(ExpectedConditions
							.visibilityOfElementLocated(Over30Amount_xpath));

					String actual = firstAccountNameWebElement.getText();
					if (actual.equals(Amount1))
						return true;
					else
						return false;

				} catch (Exception e) {
					return false;
				}
			}
		 public boolean Over60AmountValidationForMultidiv(String Amount2) {
				try {
					WebElement firstAccountNameWebElement = new WebDriverWait(driver,
							100).until(ExpectedConditions
							.visibilityOfElementLocated(Over60Amount_xpath));

					String actual = firstAccountNameWebElement.getText();
					if (actual.equals(Amount2))
						return true;
					else
						return false;

				} catch (Exception e) {
					return false;
				}
			}
		 public boolean Over90AmountValidationForMultidiv(String Amount3) {
				try {
					WebElement firstAccountNameWebElement = new WebDriverWait(driver,
							100).until(ExpectedConditions
							.visibilityOfElementLocated(Over90Amount_xpath));

					String actual = firstAccountNameWebElement.getText();
					if (actual.equals(Amount3))
						return true;
					else
						return false;

				} catch (Exception e) {
					return false;
				}
			}
		 public boolean Over120AmountValidationForMultidiv(String Amount4) {
				try {
					WebElement firstAccountNameWebElement = new WebDriverWait(driver,
							100).until(ExpectedConditions
							.visibilityOfElementLocated(Over120Amount_xpath));

					String actual = firstAccountNameWebElement.getText();
					if (actual.equals(Amount4))
						return true;
					else
						return false;

				} catch (Exception e) {
					return false;
				}
			}
		 public boolean scrollToView_Over120Amount()
			{
				try{
					 WebElement actual1=new WebDriverWait(driver,10)
		    		 .until(ExpectedConditions.visibilityOfElementLocated(Over120Amount_xpath));
		    		JavascriptExecutor jse1 = (JavascriptExecutor)driver;
		    		jse1.executeScript("arguments[0].scrollIntoView(true);",actual1);  		
			        Thread.sleep(3000);
			        return true;
					
				}
				catch(Exception e){
					
				}
				return false;
			}
		 public boolean scrollToView_ForBalanceAmount()
			{
				try{
					 WebElement actual1=new WebDriverWait(driver,10)
		    		 .until(ExpectedConditions.visibilityOfElementLocated(totalBalanceAmountYesSingle_xpath));
		    		JavascriptExecutor jse1 = (JavascriptExecutor)driver;
		    		jse1.executeScript("arguments[0].scrollIntoView(true);",actual1);  		
			        Thread.sleep(3000);
			        return true;
					
				}
				catch(Exception e){
					
				}
				return false;
			}
		 
		 //gha
		 public boolean scrollToView_BalanceAmount()
			{
				try{
		    		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", driver.findElement(By.xpath("(//td[@aria-describedby='payables_list_balance_amount'])[9]")));
			        Thread.sleep(3000);
			        return true;
					
				}
				catch(Exception e){
					
				}
				return false;
			}


		 public boolean FutureAmountValidationForMultidivForSecondBBC(String FutureAmount) {
				try {
					WebElement firstAccountNameWebElement = new WebDriverWait(driver,
							100).until(ExpectedConditions
							.visibilityOfElementLocated(CurrentAmountForMulDIvForSecondBBC_xpath));

					String actual = firstAccountNameWebElement.getText();
					if (actual.equals(FutureAmount))
						return true;
					else
						return false;

				} catch (Exception e) {
					return false;
				}
			}
		 public boolean CurrentAmountValidationForMultidivForSecondBBC(String CurrentAmount) {
				try {
					WebElement firstAccountNameWebElement = new WebDriverWait(driver,
							100).until(ExpectedConditions
							.visibilityOfElementLocated(FutureAmountForMulDivForSecondBBC_xpath));

					String actual = firstAccountNameWebElement.getText();
					if (actual.equals(CurrentAmount))
						return true;
					else
						return false;

				} catch (Exception e) {
					return false;
				}
			}

}
