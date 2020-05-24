package com.cync.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.SkipException;

import com.cync.base.BasePage;

public class CurrentReceivablesPage extends BasePage {
	private final By currentReceivables_xpath = By
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
	private final By firstInvoiceOriginalAmount_xpath = By
			.xpath("(//td[@aria-describedby='receivables_list_original_amount'])[1]");
	private final By secondInvoiceOriginalAmount_xpath = By
			.xpath("(//td[@aria-describedby='receivables_list_original_amount'])[2]");
	private final By thirdInvoiceOriginalAmount_xpath = By
			.xpath("(//td[@aria-describedby='receivables_list_original_amount'])[3]");
	private final By fourthInvoiceOriginalAmount_xpath = By
			.xpath("(//td[@aria-describedby='receivables_list_original_amount'])[4]");
	private final By fifthInvoiceOriginalAmount_xpath = By
			.xpath("(//td[@aria-describedby='receivables_list_original_amount'])[5]");
	private final By sixthInvoiceOriginalAmount_xpath = By
			.xpath("(//td[@aria-describedby='receivables_list_original_amount'])[6]");
	private final By seventhInvoiceOriginalAmount_xpath = By
			.xpath("(//td[@aria-describedby='receivables_list_original_amount'])[7]");
	private final By eighthInvoiceOriginalAmount_xpath = By
			.xpath("(//td[@aria-describedby='receivables_list_original_amount'])[8]");
	private final By firstCurrentAmount_xpath = By
			.xpath("(//td[@aria-describedby='receivables_list_current_amount'])[1]");
	private final By secondCurrentAmount_xpath = By
			.xpath("(//td[@aria-describedby='receivables_list_current_amount'])[2]");
	private final By thirdCurrentAmount_xpath = By
			.xpath("(//td[@aria-describedby='receivables_list_current_amount'])[3]");
	private final By fourthCurrentAmount_xpath = By
			.xpath("(//td[@aria-describedby='receivables_list_current_amount'])[4]");
	private final By fifthCurrentAmount_xpath = By
			.xpath("(//td[@aria-describedby='receivables_list_current_amount'])[5]");
	private final By sixthCurrentAmount_xpath = By
			.xpath("(//td[@aria-describedby='receivables_list_current_amount'])[6]");
	private final By seventhCurrentAmount_xpath = By
			.xpath("(//td[@aria-describedby='receivables_list_current_amount'])[7]");
	private final By eighthCurrentAmount_xpath = By
			.xpath("(//td[@aria-describedby='receivables_list_current_amount'])[8]");
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
	private final By totals_xpath = By
			.xpath("(//td[@aria-describedby='receivables_list_invoice_dt'])[9]");
	private final By totalInvoiceOriginalAmount_xpath = By
			.xpath("(//td[@aria-describedby='receivables_list_original_amount'])[9]");
	private final By totalCurrentAmount_xpath = By
			.xpath("(//td[@aria-describedby='receivables_list_current_amount'])[9]");
	
	private final By CurrentReceivablesPageHeader_xpath = By
			.xpath("//span[text()=' Current Receivables ']");
	
	private final By InvoiceSearch_xpath = By
			.id("gs_receivable_no");
	
	private final By NoRecordFound_xpath = By
			.xpath("//div[text()='No records to view']");
	

	private final By CurrentAmount_xpath = By
			.xpath("(//td[@aria-describedby='receivables_list_current_amount'])[1]");
	//anusha
	private final By SearchForAccountName_xpath=By.xpath("//input[@id='gs_account_no']");
	private final By InvoiceDate_xpath=By.xpath("(//td[contains(text(),'214')])[1]");
	private final By InvoiceOriginalAmount_xpath=By.xpath("//tr[@class='footrow footrow-ltr ui-widget-content']//td[9]");
	private final By CurrentTotalAmount_xpath=By.xpath("//tr[@class='footrow footrow-ltr ui-widget-content']//td[10]");

	
	public CurrentReceivablesPage(WebDriver driver) {
		super(driver);

		try {
			Thread.sleep(10000);
		} catch (Exception e) {

			e.printStackTrace();
		}
		if (!driver.findElement(currentReceivables_xpath).getText().trim()
				.equals("Current Receivables")) {
			throw new SkipException("Current Receivables couldn't open.");
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
					100).until(ExpectedConditions
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
					100).until(ExpectedConditions
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
					100).until(ExpectedConditions
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
					100).until(ExpectedConditions
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
					100).until(ExpectedConditions
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
					100).until(ExpectedConditions
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

	public boolean secondInvoiceNoValidation(String expected) {
		try {
			WebElement secondInvoiceNoWebElement = new WebDriverWait(driver,
					100).until(ExpectedConditions
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
			WebElement thirdInvoiceNoWebElement = new WebDriverWait(driver, 100)
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
					100).until(ExpectedConditions
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
			WebElement fifthInvoiceNoWebElement = new WebDriverWait(driver, 100)
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
			WebElement sixthInvoiceNoWebElement = new WebDriverWait(driver, 100)
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
					100).until(ExpectedConditions
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
					100).until(ExpectedConditions
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

	public boolean secondOriginalDateValidation(String expected) {
		try {
			WebElement secondOriginalDateWebElement = new WebDriverWait(driver,
					100).until(ExpectedConditions
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
					100).until(ExpectedConditions
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
					100).until(ExpectedConditions
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
					100).until(ExpectedConditions
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
					100).until(ExpectedConditions
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
					driver, 100).until(ExpectedConditions
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
					100).until(ExpectedConditions
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

	public boolean firstInvoiceOriginalAmountValidation(String expected) {
		try {
			WebElement firstInvoiceOriginalAmountWebElement = new WebDriverWait(
					driver, 100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(firstInvoiceOriginalAmount_xpath));

			String actual = firstInvoiceOriginalAmountWebElement.getText();
			if (actual.equals(expected))
				return true;
			else
				return false;

		} catch (Exception e) {
			return false;
		}
	}

	public boolean secondInvoiceOriginalAmountValidation(String expected) {
		try {
			WebElement secondInvoiceOriginalAmountWebElement = new WebDriverWait(
					driver, 100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(secondInvoiceOriginalAmount_xpath));

			String actual = secondInvoiceOriginalAmountWebElement.getText();
			if (actual.equals(expected))
				return true;
			else
				return false;

		} catch (Exception e) {
			return false;
		}
	}

	public boolean thirdInvoiceOriginalAmountValidation(String expected) {
		try {
			WebElement thirdInvoiceOriginalAmountWebElement = new WebDriverWait(
					driver, 100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(thirdInvoiceOriginalAmount_xpath));

			String actual = thirdInvoiceOriginalAmountWebElement.getText();
			if (actual.equals(expected))
				return true;
			else
				return false;

		} catch (Exception e) {
			return false;
		}
	}

	public boolean fourthInvoiceOriginalAmountValidation(String expected) {
		try {
			WebElement fourthInvoiceOriginalAmountWebElement = new WebDriverWait(
					driver, 100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(fourthInvoiceOriginalAmount_xpath));

			String actual = fourthInvoiceOriginalAmountWebElement.getText();
			if (actual.equals(expected))
				return true;
			else
				return false;

		} catch (Exception e) {
			return false;
		}
	}

	public boolean fifthInvoiceOriginalAmountValidation(String expected) {
		try {
			WebElement fifthInvoiceOriginalAmountWebElement = new WebDriverWait(
					driver, 100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(fifthInvoiceOriginalAmount_xpath));

			String actual = fifthInvoiceOriginalAmountWebElement.getText();
			if (actual.equals(expected))
				return true;
			else
				return false;

		} catch (Exception e) {
			return false;
		}
	}

	public boolean sixthInvoiceOriginalAmountValidation(String expected) {
		try {
			WebElement sixthInvoiceOriginalAmountWebElement = new WebDriverWait(
					driver, 100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(sixthInvoiceOriginalAmount_xpath));

			String actual = sixthInvoiceOriginalAmountWebElement.getText();
			if (actual.equals(expected))
				return true;
			else
				return false;

		} catch (Exception e) {
			return false;
		}
	}

	public boolean seventhInvoiceOriginalAmountValidation(String expected) {
		try {
			WebElement seventhInvoiceOriginalAmountWebElement = new WebDriverWait(
					driver, 100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(seventhInvoiceOriginalAmount_xpath));

			String actual = seventhInvoiceOriginalAmountWebElement.getText();
			if (actual.equals(expected))
				return true;
			else
				return false;

		} catch (Exception e) {
			return false;
		}
	}

	public boolean eighthInvoiceOriginalAmountValidation(String expected) {
		try {
			WebElement eighthInvoiceOriginalAmountWebElement = new WebDriverWait(
					driver, 100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(eighthInvoiceOriginalAmount_xpath));

			String actual = eighthInvoiceOriginalAmountWebElement.getText();
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

	public boolean secondCurrentAmountValidation(String expected) {
		try {
			WebElement secondCurrentAmountWebElement = new WebDriverWait(
					driver, 100).until(ExpectedConditions
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

	public boolean thirdCurrentAmountValidation(String expected) {
		try {
			WebElement thirdCurrentAmountWebElement = new WebDriverWait(driver,
					100).until(ExpectedConditions
					.visibilityOfElementLocated(thirdCurrentAmount_xpath));

			String actual = thirdCurrentAmountWebElement.getText();
			if (actual.equals(expected))
				return true;
			else
				return false;

		} catch (Exception e) {
			return false;
		}
	}

	public boolean fourthCurrentAmountValidation(String expected) {
		try {
			WebElement fourthCurrentAmountWebElement = new WebDriverWait(
					driver, 100).until(ExpectedConditions
					.visibilityOfElementLocated(fourthCurrentAmount_xpath));

			String actual = fourthCurrentAmountWebElement.getText();
			if (actual.equals(expected))
				return true;
			else
				return false;

		} catch (Exception e) {
			return false;
		}
	}

	public boolean fifthCurrentAmountValidation(String expected) {
		try {
			WebElement fifthCurrentAmountWebElement = new WebDriverWait(driver,
					100).until(ExpectedConditions
					.visibilityOfElementLocated(fifthCurrentAmount_xpath));

			String actual = fifthCurrentAmountWebElement.getText();
			if (actual.equals(expected))
				return true;
			else
				return false;

		} catch (Exception e) {
			return false;
		}
	}

	public boolean sixthCurrentAmountValidation(String expected) {
		try {
			WebElement sixthCurrentAmountWebElement = new WebDriverWait(driver,
					100).until(ExpectedConditions
					.visibilityOfElementLocated(sixthCurrentAmount_xpath));

			String actual = sixthCurrentAmountWebElement.getText();
			if (actual.equals(expected))
				return true;
			else
				return false;

		} catch (Exception e) {
			return false;
		}
	}

	public boolean seventhCurrentAmountValidation(String expected) {
		try {
			WebElement seventhCurrentAmountWebElement = new WebDriverWait(
					driver, 100).until(ExpectedConditions
					.visibilityOfElementLocated(seventhCurrentAmount_xpath));

			String actual = seventhCurrentAmountWebElement.getText();
			if (actual.equals(expected))
				return true;
			else
				return false;

		} catch (Exception e) {
			return false;
		}
	}

	public boolean eighthCurrentAmountValidation(String expected) {
		try {
			WebElement eighthCurrentAmountWebElement = new WebDriverWait(
					driver, 100).until(ExpectedConditions
					.visibilityOfElementLocated(eighthCurrentAmount_xpath));

			String actual = eighthCurrentAmountWebElement.getText();
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

	public boolean secondDueDateValidation(String expected) {
		try {
			WebElement secondDueDateWebElement = new WebDriverWait(driver, 100)
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
			WebElement thirdDueDateWebElement = new WebDriverWait(driver, 100)
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
			WebElement fourthDueDateWebElement = new WebDriverWait(driver, 100)
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
			WebElement fifthDueDateWebElement = new WebDriverWait(driver, 100)
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
			WebElement sixthDueDateWebElement = new WebDriverWait(driver, 100)
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
			WebElement seventhDueDateWebElement = new WebDriverWait(driver, 100)
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
			WebElement eighthDueDateWebElement = new WebDriverWait(driver, 100)
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

	public boolean totalsValidation(String expected) {
		try {
			WebElement totalsWebElement = new WebDriverWait(driver, 100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(totals_xpath));

			String actual = totalsWebElement.getText();
			if (actual.equals(expected))
				return true;
			else
				return false;

		} catch (Exception e) {
			return false;
		}
	}

	public boolean totalInvoiceOriginalAmountValidation(String expected) {
		try {
			WebElement totalInvoiceOriginalAmountWebElement = new WebDriverWait(
					driver, 100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(totalInvoiceOriginalAmount_xpath));

			String actual = totalInvoiceOriginalAmountWebElement.getText();
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
	
	
	 public String PageHeaderVerify(String Header)
		{
		try{
			WebElement HeaderWebEelement=new WebDriverWait(driver,100)
				.until(ExpectedConditions.visibilityOfElementLocated(CurrentReceivablesPageHeader_xpath));
			HeaderWebEelement.getText();
			Thread.sleep(2000);
			
		}
		catch(Exception ex){
			
		}
		return Header;
		
		} 	
	 
	 
	 public String InvoiceSearch(String search)
		{
		try{
			WebElement InvoiceSearchWebEelement=new WebDriverWait(driver,200)
			.until(ExpectedConditions.visibilityOfElementLocated(InvoiceSearch_xpath));
			InvoiceSearchWebEelement.clear();
			InvoiceSearchWebEelement.sendKeys(search);
			Thread.sleep(5000);

		}
		catch(Exception ex){

		}
		return search;

		}
		
		public boolean CurrentAmountDisplayed()
		 {
		 try{

		 	WebElement CurrentAmountWebEelement=new WebDriverWait(driver,100)
		 	.until(ExpectedConditions.visibilityOfElementLocated(CurrentAmount_xpath));
		 	CurrentAmountWebEelement.isDisplayed();
		 	
		 return true;
		 }
		 catch(Exception ex){
		 	return false;
		 }

		 } 

	 
	 
		public boolean NoRecordFoundLabel()
		 {
		 try{

		 	WebElement NoRecordFoundWebEelement=new WebDriverWait(driver,100)
		 	.until(ExpectedConditions.visibilityOfElementLocated(NoRecordFound_xpath));
		 	NoRecordFoundWebEelement.isDisplayed();
		 	
		 return true;
		 }
		 catch(Exception ex){
		 	return false;
		 }

		 } 
 
		//anusha
		
		public String SearchForAccountNo(String AccountNo)
		{
		try{
			WebElement InvoiceSearchWebEelement=new WebDriverWait(driver,200)
			.until(ExpectedConditions.visibilityOfElementLocated(SearchForAccountName_xpath));
			InvoiceSearchWebEelement.clear();
			InvoiceSearchWebEelement.sendKeys(AccountNo);
			Thread.sleep(5000);

		}
		catch(Exception ex){

		}
		return AccountNo;

		}
		public boolean InvoiceDaysValidation(String Days) {
			try {
				WebElement firstOriginalDateWebElement = new WebDriverWait(driver,
						100).until(ExpectedConditions
						.visibilityOfElementLocated(InvoiceDate_xpath));

				String actual = firstOriginalDateWebElement.getText();
				if (actual.equals(Days))
					return true;
				else
					return false;

			} catch (Exception e) {
				return false;
			}
		}
		public boolean InvoiceOriginalAmountValidation(String invoiceOriginalAmount) {
			try {
				WebElement firstOriginalDateWebElement = new WebDriverWait(driver,
						100).until(ExpectedConditions
						.visibilityOfElementLocated(InvoiceOriginalAmount_xpath));

				String actual = firstOriginalDateWebElement.getText();
				if (actual.equals(invoiceOriginalAmount))
					return true;
				else
					return false;

			} catch (Exception e) {
				return false;
			}
		}
		public boolean CurrentTotalAmountValidation(String CurrentAmount) {
			try {
				WebElement firstOriginalDateWebElement = new WebDriverWait(driver,
						100).until(ExpectedConditions
						.visibilityOfElementLocated(CurrentTotalAmount_xpath));

				String actual = firstOriginalDateWebElement.getText();
				if (actual.equals(CurrentAmount))
					return true;
				else
					return false;

			} catch (Exception e) {
				return false;
			}
		}
}
