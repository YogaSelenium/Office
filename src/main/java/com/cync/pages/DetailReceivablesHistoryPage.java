package com.cync.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.cync.base.BasePage;

public class DetailReceivablesHistoryPage extends BasePage{
	
	private final By firstAccountNo_xpath = By
			.xpath("(//td[@aria-describedby='receivables_list_account_no'])[1]");
	private final By firstOriginalDate_xpath = By
			.xpath("(//td[@aria-describedby='receivables_list_invoice_dt'])[1]");
	private final By firstDueDate_xpath = By
			.xpath("(//td[@aria-describedby='receivables_list_due_dt'])[1]");
	private final By futureAmount_xpath = By
			.xpath("(//td[@aria-describedby='receivables_list_future_amount'])[5]");
	private final By firstCurrentAmount_xpath = By
			.xpath("(//td[@aria-describedby='receivables_list_bucket_current_amount'])[4]");
	private final By firstOver30Amount_xpath = By
			.xpath("(//td[@aria-describedby='receivables_list_bucket_1_amount'])[3]");	
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
	private final By firstAccountName_xpath = By
			.xpath("(//td[@aria-describedby='receivables_list_account_name'])[1]");
	private final By firstInvoiceNo_xpath = By
			.xpath("(//td[@aria-describedby='receivables_list_receivable_no'])[1]");
 
	private final By header_xpath=By.xpath("//a[@href='#'][contains(text(),'Detail Receivables')]");

	
	
	public DetailReceivablesHistoryPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public boolean firstAccountNoValidation(String expected) {
		try {
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
	public boolean clickOnheader() {
		try {
			WebElement actual = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(header_xpath));
			actual.click();
			Thread.sleep(2000);
				return true;
			

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
	public boolean futureAmountValidation(String expected) {
		try {
			/*
			 * JavascriptExecutor js = (JavascriptExecutor) driver;
			 * js.executeScript("window.scrollBy(400,0)", "");
			 */
		    JavascriptExecutor js = (JavascriptExecutor)driver; 
		    js.executeScript("window.scrollBy(0,500)");
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
	public boolean totalCurrentAmountValidation(String expected) {
		try {
			
			WebElement element=driver.findElement(totalCurrentAmount_xpath);
			    JavascriptExecutor js = (JavascriptExecutor)driver; 
			    js.executeScript("arguments[0].scrollIntoView(true);", element); 
			    
			    Thread.sleep(500);
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
	
	public boolean scrollToview()

	  
			{
				try{
					 WebElement actual1=new WebDriverWait(driver,10)
		    		 .until(ExpectedConditions.visibilityOfElementLocated(firstdueDays_xpath));
		    		JavascriptExecutor jse1 = (JavascriptExecutor)driver;
		    		jse1.executeScript("arguments[0].scrollIntoView(true);", actual1);  		
			        Thread.sleep(3000);
			        return true;
					
				}
				catch(Exception e){
					
				}
				return false;
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

}
