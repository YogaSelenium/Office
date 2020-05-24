package com.cync.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.SkipException;

import com.cync.base.BasePage;

public class DetailReceivablesPage extends BasePage {

	/*
	 * private final By detailReceivables_xpath = By
	 * .xpath("//a[text()='Detail Receivables']"); private final By
	 * detailReceivablesHeader_xpath = By
	 * .xpath("//span[text()=' Detail Receivables']");
	 */
	private final By detailReceivables_xpath = By
			.xpath("//span[@class='paneltitle']");
	private final By firstAccountNo_xpath = By
			.xpath("(//td[@aria-describedby='receivables_list_account_no'])[1]");
	private final By secondAccountNo_xpath = By
			.xpath("(//td[@aria-describedby='receivables_list_account_no'])[2]");
	private final By thirdAccountNo_xpath = By
			.xpath("(//td[@aria-describedby='receivables_list_account_no'])[3]");
	private final By fourthAccountNo_xpath = By
			.xpath("(//td[@aria-describedby='receivables_list_account_no'])[4]");
	private final By fifthAccountNo_xpath = By
			.xpath("(//td[@aria-describedby='receivables_list_account_no'])[5]");
	private final By sixthAccountNo_xpath = By
			.xpath("(//td[@aria-describedby='receivables_list_account_no'])[6]");
	private final By seventhAccountNo_xpath = By
			.xpath("(//td[@aria-describedby='receivables_list_account_no'])[7]");
	private final By eighthAccountNo_xpath = By
			.xpath("(//td[@aria-describedby='receivables_list_account_no'])[8]");
	private final By firstAccountName_xpath = By
			.xpath("(//td[@aria-describedby='receivables_list_account_name'])[1]");
	private final By secondAccountName_xpath = By
			.xpath("(//td[@aria-describedby='receivables_list_account_name'])[2]");
	private final By thirdAccountName_xpath = By
			.xpath("(//td[@aria-describedby='receivables_list_account_name'])[3]");
	private final By fourthAccountName_xpath = By
			.xpath("(//td[@aria-describedby='receivables_list_account_name'])[4]");
	private final By fifthAccountName_xpath = By
			.xpath("(//td[@aria-describedby='receivables_list_account_name'])[5]");
	private final By sixthAccountName_xpath = By
			.xpath("(//td[@aria-describedby='receivables_list_account_name'])[6]");
	private final By seventhAccountName_xpath = By
			.xpath("(//td[@aria-describedby='receivables_list_account_name'])[7]");
	private final By eighthAccountName_xpath = By
			.xpath("(//td[@aria-describedby='receivables_list_account_name'])[8]");
	private final By firstInvoiceNo_xpath = By
			.xpath("(//td[@aria-describedby='receivables_list_receivable_no'])[1]");
	private final By secondInvoiceNo_xpath = By
			.xpath("(//td[@aria-describedby='receivables_list_receivable_no'])[2]");
	private final By thirdInvoiceNo_xpath = By
			.xpath("(//td[@aria-describedby='receivables_list_receivable_no'])[3]");
	private final By fourthInvoiceNo_xpath = By
			.xpath("(//td[@aria-describedby='receivables_list_receivable_no'])[4]");
	private final By fifthInvoiceNo_xpath = By
			.xpath("(//td[@aria-describedby='receivables_list_receivable_no'])[5]");
	private final By sixthInvoiceNo_xpath = By
			.xpath("(//td[@aria-describedby='receivables_list_receivable_no'])[6]");
	private final By seventhInvoiceNo_xpath = By
			.xpath("(//td[@aria-describedby='receivables_list_receivable_no'])[7]");
	private final By eighthInvoiceNo_xpath = By
			.xpath("(//td[@aria-describedby='receivables_list_receivable_no'])[8]");

	private final By firstOriginalDate_xpath = By
			.xpath("(//td[@aria-describedby='receivables_list_invoice_dt'])[1]");
	private final By secondOriginalDate_xpath = By
			.xpath("(//td[@aria-describedby='receivables_list_invoice_dt'])[2]");
	private final By thirdOriginalDate_xpath = By
			.xpath("(//td[@aria-describedby='receivables_list_invoice_dt'])[3]");
	private final By fourthOriginalDate_xpath = By
			.xpath("(//td[@aria-describedby='receivables_list_invoice_dt'])[4]");
	private final By fifthOriginalDate_xpath = By
			.xpath("(//td[@aria-describedby='receivables_list_invoice_dt'])[5]");
	private final By sixthOriginalDate_xpath = By
			.xpath("(//td[@aria-describedby='receivables_list_invoice_dt'])[6]");
	private final By seventhOriginalDate_xpath = By
			.xpath("(//td[@aria-describedby='receivables_list_invoice_dt'])[7]");
	private final By eighthOriginalDate_xpath = By
			.xpath("(//td[@aria-describedby='receivables_list_invoice_dt'])[8]");

	private final By firstDueDate_xpath = By
			.xpath("(//td[@aria-describedby='receivables_list_due_dt'])[1]");
	private final By secondDueDate_xpath = By
			.xpath("(//td[@aria-describedby='receivables_list_due_dt'])[2]");
	private final By thirdDueDate_xpath = By
			.xpath("(//td[@aria-describedby='receivables_list_due_dt'])[3]");
	private final By fourthDueDate_xpath = By
			.xpath("(//td[@aria-describedby='receivables_list_due_dt'])[4]");
	private final By fifthDueDate_xpath = By
			.xpath("(//td[@aria-describedby='receivables_list_due_dt'])[5]");
	private final By sixthDueDate_xpath = By
			.xpath("(//td[@aria-describedby='receivables_list_due_dt'])[6]");
	private final By seventhDueDate_xpath = By
			.xpath("(//td[@aria-describedby='receivables_list_due_dt'])[7]");
	private final By eighthDueDate_xpath = By
			.xpath("(//td[@aria-describedby='receivables_list_due_dt'])[8]");
	private final By futureAmount_xpath = By
			.xpath("(//td[@aria-describedby='receivables_list_future_amount'])[5]");
	private final By firstCurrentAmount_xpath = By
			.xpath("(//td[@aria-describedby='receivables_list_bucket_current_amount'])[4]");
	private final By secondCurrentAmount_xpath = By
			.xpath("(//td[@aria-describedby='receivables_list_bucket_current_amount'])[7]");
	private final By firstOver30Amount_xpath = By
			.xpath("(//td[@aria-describedby='receivables_list_bucket_1_amount'])[3]");
	private final By secondOver30Amount_xpath = By
			.xpath("(//td[@aria-describedby='receivables_list_bucket_1_amount'])[8]");
	private final By firstOver60Amount_xpath = By
			.xpath("(//td[@aria-describedby='receivables_list_bucket_2_amount'])[2]");
	private final By firstOver90Amount_xpath = By
			.xpath("(//td[@aria-describedby='receivables_list_bucket_3_amount'])[1]");
	private final By firstOver120Amount_xpath = By
			.xpath("(//td[@aria-describedby='receivables_list_bucket_4_amount'])[1]");
	private final By totalFutureAmount_xpath = By
			.xpath("(//td[@aria-describedby='receivables_list_future_amount'])[9]");
	private final By totalCurrentAmount_xpath = By
			.xpath("(//td[@aria-describedby='receivables_list_bucket_current_amount'])[9]");
	private final By totalOver30Amount_xpath = By
			.xpath("(//td[@aria-describedby='receivables_list_bucket_1_amount'])[9]");
	private final By totalOver60Amount_xpath = By
			.xpath("(//td[@aria-describedby='receivables_list_bucket_2_amount'])[9]");
	private final By totalOver90Amount_xpath = By
			.xpath("(//td[@aria-describedby='receivables_list_bucket_3_amount'])[9]");
	private final By totalOver120Amount_xpath = By
			.xpath("(//td[@aria-describedby='receivables_list_bucket_4_amount'])[9]");
	private final By firstInvoiceDays_xpath = By
		.xpath("(//td[@aria-describedby='receivables_list_invoice_days'])[1]");
	private final By firstdueDays_xpath = By
		.xpath("(//td[@aria-describedby='receivables_list_due_days'])[1]");
	
	private final By BalanceAmount_xpath=By.xpath("/html[1]/body[1]/div[3]/div[1]/div[2]/div[4]/div[1]/div[1]/div[2]/div[3]/div[3]/div[3]/div[1]/table[1]/thead[1]/tr[1]/th[21]/div[1]");
	private final By Export_xpath=By.xpath("(//div[@class='ui-pg-div'])[7]");
	private final By BalanceAmountInExportPopup_xpath=By.xpath("/html[1]/body[1]/div[6]/div[2]/div[1]/div[1]/div[2]/div[18]/div[1]/label[1]");
	private final By GridColumn_xpath=By.xpath("//div[@id='colomun_choose_action']");
	private final By GridBalanceAmount_xpath=By.xpath("/html[1]/body[1]/div[3]/div[1]/div[2]/div[4]/div[1]/div[1]/div[2]/div[5]/div[1]/div[1]/form[1]/div[18]/span[1]");
	private final By FutureBucketValue_xpath=By.xpath("//td[contains(text(),'140,000.00')]");
	private final By CurrentBucketValue_xpath=By.xpath("(//td[contains(text(),'0.00')])[58]");
	private final By Over30BucketValue_xpath=By.xpath("(//td[contains(text(),'0.00')])[59]");
	private final By Over60BucketValue_xpath=By.xpath("(//td[contains(text(),'0.00')])[60]");
	private final By Over90BucketValue_xpath=By.xpath("(//td[contains(text(),'0.00')])[61]");
	private final By Over120BucketValue_xpath=By.xpath("(//td[contains(text(),'20,000.00')])[3]");
	private final By BalanceAmountValue_xpath=By.xpath("//td[contains(text(),'160,000.00')]");

	
	private final By Status_xpath=By.xpath("//select[@id='gs_invoice_status']");
	private final By parameterName_xpath=By.xpath("//select[@id='gs_collateral_advance_rate_id']");
	private final By Over120_xpath=By.xpath("(//input[@type='text'])[17]");
	private final By BalanceAmountInGrid_xpath=By.xpath("//input[@value='balance_amount']");

	
	private final By retenstion_xpath=By.xpath("//tr[5]/td[22]");


	private final By FutureField_xpath=By.xpath("//tr[5]/td[21]");

	public DetailReceivablesPage(WebDriver driver) {
		super(driver);

		try {
			Thread.sleep(1000);
		} catch (Exception e) {

			e.printStackTrace();
		}
		if (!driver.findElement(detailReceivables_xpath).getText().trim()
				.equals("Detail Receivables")) {
			throw new SkipException("Detail Receivables couldn't open.");
		}
	}

	public boolean firstAccountNoValidation(String expected) {
		try {
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

	public boolean secondAccountNoValidation(String expected) {
		try {
			WebElement secondAccountNoWebElement = new WebDriverWait(driver,
					100).until(ExpectedConditions
					.visibilityOfElementLocated(secondAccountNo_xpath));

			String actual = secondAccountNoWebElement.getText();
			if (actual.equals(expected))
				return true;
			else
				return false;

		} catch (Exception e) {
			return false;
		}
	}

	public boolean thirdAccountNoValidation(String expected) {
		try {
			WebElement thirdAccountNoWebElement = new WebDriverWait(driver, 100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(thirdAccountNo_xpath));

			String actual = thirdAccountNoWebElement.getText();
			if (actual.equals(expected))
				return true;
			else
				return false;

		} catch (Exception e) {
			return false;
		}
	}

	public boolean fourthAccountNoValidation(String expected) {
		try {
			WebElement fourthAccountNoWebElement = new WebDriverWait(driver,
					100).until(ExpectedConditions
					.visibilityOfElementLocated(fourthAccountNo_xpath));

			String actual = fourthAccountNoWebElement.getText();
			if (actual.equals(expected))
				return true;
			else
				return false;

		} catch (Exception e) {
			return false;
		}
	}

	public boolean fifthAccountNoValidation(String expected) {
		try {
			WebElement fifthAccountNoWebElement = new WebDriverWait(driver, 100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(fifthAccountNo_xpath));

			String actual = fifthAccountNoWebElement.getText();
			if (actual.equals(expected))
				return true;
			else
				return false;

		} catch (Exception e) {
			return false;
		}
	}

	public boolean sixthAccountNoValidation(String expected) {
		try {
			WebElement sixthAccountNoWebElement = new WebDriverWait(driver, 100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(sixthAccountNo_xpath));

			String actual = sixthAccountNoWebElement.getText();
			if (actual.equals(expected))
				return true;
			else
				return false;

		} catch (Exception e) {
			return false;
		}
	}

	public boolean seventhAccountNoValidation(String expected) {
		try {
			WebElement seventhAccountNoWebElement = new WebDriverWait(driver,
					100).until(ExpectedConditions
					.visibilityOfElementLocated(seventhAccountNo_xpath));

			String actual = seventhAccountNoWebElement.getText();
			if (actual.equals(expected))
				return true;
			else
				return false;

		} catch (Exception e) {
			return false;
		}
	}

	public boolean eighthAccountNoValidation(String expected) {
		try {
			WebElement eighthAccountNoWebElement = new WebDriverWait(driver,
					100).until(ExpectedConditions
					.visibilityOfElementLocated(eighthAccountNo_xpath));

			String actual = eighthAccountNoWebElement.getText();
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

	public boolean secondAccountNameValidation(String expected) {
		try {
			WebElement secondAccountNameWebElement = new WebDriverWait(driver,
					100).until(ExpectedConditions
					.visibilityOfElementLocated(secondAccountName_xpath));

			String actual = secondAccountNameWebElement.getText();
			if (actual.equals(expected))
				return true;
			else
				return false;

		} catch (Exception e) {
			return false;
		}
	}

	public boolean thirdAccountNameValidation(String expected) {
		try {
			WebElement thirdAccountNameWebElement = new WebDriverWait(driver,
					10).until(ExpectedConditions
					.visibilityOfElementLocated(thirdAccountName_xpath));

			String actual = thirdAccountNameWebElement.getText();
			if (actual.equals(expected))
				return true;
			else
				return false;

		} catch (Exception e) {
			return false;
		}
	}

	public boolean fourthAccountNameValidation(String expected) {
		try {
			WebElement fourthAccountNameWebElement = new WebDriverWait(driver,
					10).until(ExpectedConditions
					.visibilityOfElementLocated(fourthAccountName_xpath));

			String actual = fourthAccountNameWebElement.getText();
			if (actual.equals(expected))
				return true;
			else
				return false;

		} catch (Exception e) {
			return false;
		}
	}

	public boolean fifthAccountNameValidation(String expected) {
		try {
			WebElement fifthAccountNameWebElement = new WebDriverWait(driver,
					10).until(ExpectedConditions
					.visibilityOfElementLocated(fifthAccountName_xpath));

			String actual = fifthAccountNameWebElement.getText();
			if (actual.equals(expected))
				return true;
			else
				return false;

		} catch (Exception e) {
			return false;
		}
	}

	public boolean sixthAccountNameValidation(String expected) {
		try {
			WebElement sixthAccountNameWebElement = new WebDriverWait(driver,
					10).until(ExpectedConditions
					.visibilityOfElementLocated(sixthAccountName_xpath));

			String actual = sixthAccountNameWebElement.getText();
			if (actual.equals(expected))
				return true;
			else
				return false;

		} catch (Exception e) {
			return false;
		}
	}

	public boolean seventhAccountNameValidation(String expected) {
		try {
			WebElement seventhAccountNameWebElement = new WebDriverWait(driver,
					10).until(ExpectedConditions
					.visibilityOfElementLocated(seventhAccountName_xpath));

			String actual = seventhAccountNameWebElement.getText();
			if (actual.equals(expected))
				return true;
			else
				return false;

		} catch (Exception e) {
			return false;
		}
	}

	public boolean eighthAccountNameValidation(String expected) {
		try {
			WebElement eighthAccountNameWebElement = new WebDriverWait(driver,
					10).until(ExpectedConditions
					.visibilityOfElementLocated(eighthAccountName_xpath));

			String actual = eighthAccountNameWebElement.getText();
			if (actual.equals(expected))
				return true;
			else
				return false;

		} catch (Exception e) {
			return false;
		}
	}

	public boolean firstInvoiceNoValidation(String expected) {
		try {
			WebElement firstInvoiceNoWebElement = new WebDriverWait(driver, 10)
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

	public boolean secondInvoiceNoValidation(String expected) {
		try {
			WebElement secondInvoiceNoWebElement = new WebDriverWait(driver,
					10).until(ExpectedConditions
					.visibilityOfElementLocated(secondInvoiceNo_xpath));

			String actual = secondInvoiceNoWebElement.getText();
			if (actual.equals(expected))
				return true;
			else
				return false;

		} catch (Exception e) {
			return false;
		}
	}

	public boolean thirdInvoiceNoValidation(String expected) {
		try {
			WebElement thirdInvoiceNoWebElement = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(thirdInvoiceNo_xpath));

			String actual = thirdInvoiceNoWebElement.getText();
			if (actual.equals(expected))
				return true;
			else
				return false;

		} catch (Exception e) {
			return false;
		}
	}

	public boolean fourthInvoiceNoValidation(String expected) {
		try {
			WebElement fourthInvoiceNoWebElement = new WebDriverWait(driver,
					10).until(ExpectedConditions
					.visibilityOfElementLocated(fourthInvoiceNo_xpath));

			String actual = fourthInvoiceNoWebElement.getText();
			if (actual.equals(expected))
				return true;
			else
				return false;

		} catch (Exception e) {
			return false;
		}
	}

	public boolean fifthInvoiceNoValidation(String expected) {
		try {
			WebElement fifthInvoiceNoWebElement = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(fifthInvoiceNo_xpath));

			String actual = fifthInvoiceNoWebElement.getText();
			if (actual.equals(expected))
				return true;
			else
				return false;

		} catch (Exception e) {
			return false;
		}
	}

	public boolean sixthInvoiceNoValidation(String expected) {
		try {
			WebElement sixthInvoiceNoWebElement = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(sixthInvoiceNo_xpath));

			String actual = sixthInvoiceNoWebElement.getText();
			if (actual.equals(expected))
				return true;
			else
				return false;

		} catch (Exception e) {
			return false;
		}
	}

	public boolean seventhInvoiceNoValidation(String expected) {
		try {
			WebElement seventhInvoiceNoWebElement = new WebDriverWait(driver,
					10).until(ExpectedConditions
					.visibilityOfElementLocated(seventhInvoiceNo_xpath));

			String actual = seventhInvoiceNoWebElement.getText();
			if (actual.equals(expected))
				return true;
			else
				return false;

		} catch (Exception e) {
			return false;
		}
	}

	public boolean eighthInvoiceNoValidation(String expected) {
		try {
			WebElement eighthInvoiceNoWebElement = new WebDriverWait(driver,
					10).until(ExpectedConditions
					.visibilityOfElementLocated(eighthInvoiceNo_xpath));

			String actual = eighthInvoiceNoWebElement.getText();
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
					10).until(ExpectedConditions
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

	public boolean secondOriginalDateValidation(String expected) {
		try {
			WebElement secondOriginalDateWebElement = new WebDriverWait(driver,
					10).until(ExpectedConditions
					.visibilityOfElementLocated(secondOriginalDate_xpath));

			String actual = secondOriginalDateWebElement.getText();
			if (actual.equals(expected))
				return true;
			else
				return false;

		} catch (Exception e) {
			return false;
		}
	}

	public boolean thirdOriginalDateValidation(String expected) {
		try {
			WebElement thirdOriginalDateWebElement = new WebDriverWait(driver,
					10).until(ExpectedConditions
					.visibilityOfElementLocated(thirdOriginalDate_xpath));

			String actual = thirdOriginalDateWebElement.getText();
			if (actual.equals(expected))
				return true;
			else
				return false;

		} catch (Exception e) {
			return false;
		}
	}

	public boolean fourthOriginalDateValidation(String expected) {
		try {
			WebElement fourthOriginalDateWebElement = new WebDriverWait(driver,
					10).until(ExpectedConditions
					.visibilityOfElementLocated(fourthOriginalDate_xpath));

			String actual = fourthOriginalDateWebElement.getText();
			if (actual.equals(expected))
				return true;
			else
				return false;

		} catch (Exception e) {
			return false;
		}
	}

	public boolean fifthOriginalDateValidation(String expected) {
		try {
			WebElement fifthOriginalDateWebElement = new WebDriverWait(driver,
					10).until(ExpectedConditions
					.visibilityOfElementLocated(fifthOriginalDate_xpath));

			String actual = fifthOriginalDateWebElement.getText();
			if (actual.equals(expected))
				return true;
			else
				return false;

		} catch (Exception e) {
			return false;
		}
	}

	public boolean sixthOriginalDateValidation(String expected) {
		try {
			WebElement sixthOriginalDateWebElement = new WebDriverWait(driver,
					10).until(ExpectedConditions
					.visibilityOfElementLocated(sixthOriginalDate_xpath));

			String actual = sixthOriginalDateWebElement.getText();
			if (actual.equals(expected))
				return true;
			else
				return false;

		} catch (Exception e) {
			return false;
		}
	}

	public boolean seventhOriginalDateValidation(String expected) {
		try {
			WebElement seventhOriginalDateWebElement = new WebDriverWait(
					driver, 10).until(ExpectedConditions
					.visibilityOfElementLocated(seventhOriginalDate_xpath));

			String actual = seventhOriginalDateWebElement.getText();
			if (actual.equals(expected))
				return true;
			else
				return false;

		} catch (Exception e) {
			return false;
		}
	}

	public boolean eighthOriginalDateValidation(String expected) {
		try {
			WebElement eighthOriginalDateWebElement = new WebDriverWait(driver,
					10).until(ExpectedConditions
					.visibilityOfElementLocated(eighthOriginalDate_xpath));

			String actual = eighthOriginalDateWebElement.getText();
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
			WebElement firstDueDateWebElement = new WebDriverWait(driver, 10)
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

	public boolean secondDueDateValidation(String expected) {
		try {
			WebElement secondDueDateWebElement = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(secondDueDate_xpath));

			String actual = secondDueDateWebElement.getText();
			if (actual.equals(expected))
				return true;
			else
				return false;

		} catch (Exception e) {
			return false;
		}
	}

	public boolean thirdDueDateValidation(String expected) {
		try {
			WebElement thirdDueDateWebElement = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(thirdDueDate_xpath));

			String actual = thirdDueDateWebElement.getText();
			if (actual.equals(expected))
				return true;
			else
				return false;

		} catch (Exception e) {
			return false;
		}
	}

	public boolean fourthDueDateValidation(String expected) {
		try {
			WebElement fourthDueDateWebElement = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(fourthDueDate_xpath));

			String actual = fourthDueDateWebElement.getText();
			if (actual.equals(expected))
				return true;
			else
				return false;

		} catch (Exception e) {
			return false;
		}
	}

	public boolean fifthDueDateValidation(String expected) {
		try {
			WebElement fifthDueDateWebElement = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(fifthDueDate_xpath));

			String actual = fifthDueDateWebElement.getText();
			if (actual.equals(expected))
				return true;
			else
				return false;

		} catch (Exception e) {
			return false;
		}
	}

	public boolean sixthDueDateValidation(String expected) {
		try {
			WebElement sixthDueDateWebElement = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(sixthDueDate_xpath));

			String actual = sixthDueDateWebElement.getText();
			if (actual.equals(expected))
				return true;
			else
				return false;

		} catch (Exception e) {
			return false;
		}
	}

	public boolean seventhDueDateValidation(String expected) {
		try {
			WebElement seventhDueDateWebElement = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(seventhDueDate_xpath));

			String actual = seventhDueDateWebElement.getText();
			if (actual.equals(expected))
				return true;
			else
				return false;

		} catch (Exception e) {
			return false;
		}
	}

	public boolean eighthDueDateValidation(String expected) {
		try {
			WebElement eighthDueDateWebElement = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(eighthDueDate_xpath));

			String actual = eighthDueDateWebElement.getText();
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
		    JavascriptExecutor js = (JavascriptExecutor)driver; 
		    js.executeScript("window.scrollBy(0,500)");
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

	public boolean secondCurrentAmountValidation(String expected) {
		try {

			WebElement secondCurrentAmountWebElement = new WebDriverWait(
					driver, 10).until(ExpectedConditions
					.visibilityOfElementLocated(secondCurrentAmount_xpath));

			String actual = secondCurrentAmountWebElement.getText();
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

	public boolean secondOver30AmountValidation(String expected) {
		try {

			WebElement secondOver30AmountWebElement = new WebDriverWait(driver,
					10).until(ExpectedConditions
					.visibilityOfElementLocated(secondOver30Amount_xpath));

			String actual = secondOver30AmountWebElement.getText();
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

	public boolean totalCurrentAmountValidation(String expected) {
		try {
			
			WebElement element = driver.findElement(By.xpath("(//td[@aria-describedby='receivables_list_balance_amount'])[9]"));
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
			Thread.sleep(500); 

			
			  /*  JavascriptExecutor js = (JavascriptExecutor)driver; 
			    js.executeScript("window.scrollBy(2000,0)");*/

			    
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
	
	public boolean firstInvoiceDaysValidation(String expected) {
		try {
			WebElement firstInvoiceNoWebElement = new WebDriverWait(driver, 10)
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
			WebElement firstInvoiceNoWebElement = new WebDriverWait(driver, 10)
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
	
	   public boolean scrollToView()
		{
			try{
				 WebElement actual1=new WebDriverWait(driver,10)
	    		 .until(ExpectedConditions.visibilityOfElementLocated(FutureField_xpath));
	    		JavascriptExecutor jse1 = (JavascriptExecutor)driver;
	    		jse1.executeScript("arguments[0].scrollIntoView(true);", actual1);  		
		        Thread.sleep(3000);
		        return true;
				
			}
			catch(Exception e){
				
			}
			return false;
			
			}
	   
	   public boolean clickonStatus() {
	    	try {
	    	    WebElement clickoncolletralsearch = new WebDriverWait(driver,10)
	    		    .until(ExpectedConditions .visibilityOfElementLocated(Status_xpath));
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
	   public boolean clickonParameterName() {
	    	try {
	    	    WebElement clickoncolletralsearch = new WebDriverWait(driver,10)
	    		    .until(ExpectedConditions .visibilityOfElementLocated(parameterName_xpath));
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
	   public boolean clickonOver120() {
	    	try {
	    	    WebElement clickoncolletralsearch = new WebDriverWait(driver,10)
	    		    .until(ExpectedConditions .visibilityOfElementLocated(Over120_xpath));
	    	    clickoncolletralsearch.click();
	    	    Actions action = new Actions(driver);
	    	    action.sendKeys(Keys.TAB).build().perform();
	    	    Thread.sleep(3000);
	    	    return true;
	    	} catch (Exception ex) {
	    	    return false;
	    	}
		}


			
	   
	 public boolean ValidationOfExport()
		{
			try{
				 WebElement ExportWebElement=new WebDriverWait(driver,10)
	    		 .until(ExpectedConditions.visibilityOfElementLocated(Export_xpath));
				 ExportWebElement.click();
		        return true;
				
			}
			catch(Exception e){
				
			}
			return false;
			
			}
	 public boolean VerifyAmountBalanceInExportPopup()
		{
			try{
				 WebElement ExportWebElement=new WebDriverWait(driver,10)
	    		 .until(ExpectedConditions.visibilityOfElementLocated(BalanceAmountInExportPopup_xpath));
				 ExportWebElement.isDisplayed();
		        return true;
				
			}
			catch(Exception e){
				
			}
			return false;
			
			}
	 public boolean ValidationOfGridColumn()
		{
			try{
				 WebElement ExportWebElement=new WebDriverWait(driver,10)
	    		 .until(ExpectedConditions.visibilityOfElementLocated(GridColumn_xpath));
				 ExportWebElement.click();
		        return true;
				
			}
			catch(Exception e){
				
			}
			return false;
			
			}
	/* public boolean VerifyAmountBalanceInGridColumn()
		{
			try{
				
				
				 WebElement ExportWebElement=new WebDriverWait(driver,10)
	    		 .until(ExpectedConditions.visibilityOfElementLocated(GridBalanceAmount_xpath));
				 JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("window.scrollBy(400,0)","");
				 ExportWebElement.isDisplayed();
		        return true;
				
			}
			catch(Exception e){
				
			}
			return false;
			
			}*/
	 public boolean ValidationOfGridAccountNoCheckBox()
		{
			try{
				 WebElement ExportWebElement=new WebDriverWait(driver,10)
	    		 .until(ExpectedConditions.visibilityOfElementLocated(GridBalanceAmount_xpath));
				 ExportWebElement.click();
		        return true;
				
			}
			catch(Exception e){
				
			}
			return false;
			
			}

	 public boolean verifyBalanceAmount(String BalanceAmount) {
			try {
				
				
				WebElement BalanceAmountWebelement = new WebDriverWait(driver, 10)
				.until(ExpectedConditions.visibilityOfElementLocated(BalanceAmountValue_xpath));
				String actual=BalanceAmountWebelement.getText();

				if (actual.equals(BalanceAmount))
					return true;
				else
					return false;
				
			} catch (Exception e) {
				System.out.println(e.getMessage());
				
			}
			return false;
	 }
  
	 public boolean ValidationOfGridAmountBalance()
		{
			try{
				 WebElement ExportWebElement=new WebDriverWait(driver,10)
	    		 .until(ExpectedConditions.visibilityOfElementLocated(BalanceAmountInGrid_xpath));
				 Thread.sleep(2000);
				 ExportWebElement.isDisplayed();
				 Thread.sleep(2000);
		        return true;
				
			}
			catch(Exception e){
				
			}
			return false;
			
			}
	 
	 public boolean VerifyBalanceAmount() {
	    	try {	
		WebElement totalCurrentAmountWebElement = new WebDriverWait(driver,
					10).until(ExpectedConditions
					.visibilityOfElementLocated(BalanceAmount_xpath));
			totalCurrentAmountWebElement.isDisplayed();
			Thread.sleep(2000);
				return true;
		} catch (Exception e) {
			return false;
		}


	}
	 
	 public boolean scrollToView_ForBalanceAmount()
		{
			try{
				 WebElement actual1=new WebDriverWait(driver,10)
	    		 .until(ExpectedConditions.visibilityOfElementLocated(retenstion_xpath));
	    		JavascriptExecutor jse1 = (JavascriptExecutor)driver;
	    		jse1.executeScript("arguments[0].scrollIntoView(true);", actual1);  		
		        Thread.sleep(3000);
		        return true;				
			}
			catch(Exception e){
				
			}
			return false;
		}

			

//Ghanavi
	 public boolean scrollToView_Over120Amount()
     {
         try{
             ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", driver.findElement(By.xpath("(//td[@aria-describedby='receivables_list_bucket_4_amount'])[9]")));
             Thread.sleep(3000);
             return true;
            
         }
         catch(Exception e){
            
         }
         return false;
     }

  
}
	   

	 

