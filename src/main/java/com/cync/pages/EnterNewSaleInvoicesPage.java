package com.cync.pages;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.SkipException;

import com.cync.base.BasePage;

public class EnterNewSaleInvoicesPage extends BasePage {
	
	//private final By enterNewSalesInvoice_xpath = By
		//	.xpath("//a[text()='Enter New Sale Invoices']");
	private final By enterNewSalesInvoice_xpath = By
			.xpath("//span[@class='paneltitle']");
	private final By enterNewSalesInvoiceHeader_xpath = By
			.xpath("//span[text()=' Enter New Sale Invoices']");
	private final By batchDetailsSubHeader_xpath = By
			.xpath("//h2[text()='Batch Details']");
	private final By extBatch_xpath = By.xpath("//th[text()='Ext Batch']");
	private final By batchDateColumn_xpath = By.xpath("//th[text()='Batch Date']");
	private final By batchNo_xpath = By.xpath("//th[text()='Batch No']");
	private final By batchTotal_xpath = By.xpath("//th[text()='Batch Total']");
	private final By invoiceTotals_xpath = By
			.xpath("//th[text()='Invoice Totals']");
	private final By detailReceivablessubHeader_xpath = By
			.xpath("//h2[text()='Detail Receivables']");
	private final By accountNoColumn_xpath = By
			.xpath("//th[text()='Account No']");
	private final By accountNameColumn_xpath = By
			.xpath("//th[text()='Account Name']");
	private final By documentNoColumn_xpath = By
			.xpath("//th[text()='Document No']");
	private final By orderNoColumn_xpath = By.xpath("//th[text()='Order No']");
	private final By originalDateColumn_xpath = By
			.xpath("//th[text()='Original Date']");
	private final By currentAmountColumn_xpath = By
			.xpath("//th[text()='Current Amount']");
	private final By dueDatecolumn_xpath = By.xpath("//th[text()='Due Date']");
	private final By ineligibleCodeColumn_xpath = By
			.xpath("//th[text()='Ineligible Code']");
	private final By statusColumn_xpath = By.xpath("//th[text()='Status']");
	private final By parameterNameColumn_xpath = By
			.xpath("//th[text()='Parameter Name']");
	private final By firstAccountNumbertextfield_xpath = By
			.xpath("(//input[@class='acc_no_auto ui-autocomplete-input'])[1]");
	private final By secondAccountNumbertextfield_xpath = By
			.xpath("(//input[@class='acc_no_auto ui-autocomplete-input'])[2]");
	private final By thirdAccountNumbertextfield_xpath = By
			.xpath("(//input[@class='acc_no_auto ui-autocomplete-input'])[3]");
	private final By fourthAccountNumbertextfield_xpath = By
			.xpath("(//input[@class='acc_no_auto ui-autocomplete-input'])[4]");
	private final By fifthAccountNumbertextfield_xpath = By
			.xpath("(//input[@class='acc_no_auto ui-autocomplete-input'])[5]");
	private final By sixthAccountNumbertextfield_xpath = By
			.xpath("(//input[@class='acc_no_auto ui-autocomplete-input'])[6]");
	private final By seventhAccountNumbertextfield_xpath = By
			.xpath("(//input[@class='acc_no_auto ui-autocomplete-input'])[7]");
	private final By eighthAccountNumbertextfield_xpath = By
			.xpath("(//input[@class='acc_no_auto ui-autocomplete-input'])[8]");
	private final By firstAccountNametextfield_xpath = By
			.xpath("(//input[@class='acc_name_auto ui-autocomplete-input'])[1]");
	private final By secondAccountNametextfield_xpath = By
			.xpath("(//input[@class='acc_name_auto ui-autocomplete-input'])[2]");
	private final By thirdAccountNametextfield_xpath = By
			.xpath("(//input[@class='acc_name_auto ui-autocomplete-input'])[3]");
	private final By fourthAccountNametextfield_xpath = By
			.xpath("(//input[@class='acc_name_auto ui-autocomplete-input'])[4]");
	private final By fifthAccountNametextfield_xpath = By
			.xpath("(//input[@class='acc_name_auto ui-autocomplete-input'])[5]");
	private final By sixthAccountNametextfield_xpath = By
			.xpath("(//input[@class='acc_name_auto ui-autocomplete-input'])[6]");
	private final By seventhAccountNametextfield_xpath = By
			.xpath("(//input[@class='acc_name_auto ui-autocomplete-input'])[7]");
	private final By eighthAccountNametextfield_xpath = By
			.xpath("(//input[@class='acc_name_auto ui-autocomplete-input'])[8]");
	private final By firstDocumentNotextfield_xpath = By
			.xpath("(//tbody[@id='add_multi_row_invoice']//td[3]/input)[1]");
	private final By secondDocumentNotextfield_xpath = By
			.xpath("(//tbody[@id='add_multi_row_invoice']//td[3]/input)[2]");
	private final By thirdDocumentNotextfield_xpath = By
			.xpath("(//tbody[@id='add_multi_row_invoice']//td[3]/input)[3]");
	private final By fourthDocumentNotextfield_xpath = By
			.xpath("(//tbody[@id='add_multi_row_invoice']//td[3]/input)[4]");
	private final By fifthDocumentNotextfield_xpath = By
			.xpath("(//tbody[@id='add_multi_row_invoice']//td[3]/input)[5]");
	private final By sixthDocumentNotextfield_xpath = By
			.xpath("(//tbody[@id='add_multi_row_invoice']//td[3]/input)[6]");
	private final By seventhDocumentNotextfield_xpath = By
			.xpath("(//tbody[@id='add_multi_row_invoice']//td[3]/input)[7]");
	private final By eighthDocumentNotextfield_xpath = By
			.xpath("(//tbody[@id='add_multi_row_invoice']//td[3]/input)[8]");
	private final By firstOriginalDate_xpath = By
			.id("batch_invoice_receivables_attributes_0_invoice_dt");
	private final By secondOriginalDate_xpath = By
			.id("batch_invoice_receivables_attributes_1_invoice_dt");
	private final By thirdOriginalDate_xpath = By
			.id("batch_invoice_receivables_attributes_2_invoice_dt");
	private final By fourthOriginalDate_xpath = By
			.id("batch_invoice_receivables_attributes_3_invoice_dt");
	private final By fifthOriginalDate_xpath = By
			.id("batch_invoice_receivables_attributes_4_invoice_dt");
	private final By sixthOriginalDate_xpath = By
			.id("batch_invoice_receivables_attributes_5_invoice_dt");
	private final By seventhOriginalDate_xpath = By
			.id("batch_invoice_receivables_attributes_6_invoice_dt");
	private final By eighthOriginalDate_xpath = By
			.id("batch_invoice_receivables_attributes_7_invoice_dt");
	private final By firstCurrentAmounttextfield_xpath = By
			.xpath("(//input[@class='receivable_current_amount'])[1]");
	private final By secondCurrentAmounttextfield_xpath = By
			.xpath("(//input[@class='receivable_current_amount'])[2]");
	private final By thirdCurrentAmounttextfield_xpath = By
			.xpath("(//input[@class='receivable_current_amount'])[3]");
	private final By fourthCurrentAmounttextfield_xpath = By
			.xpath("(//input[@class='receivable_current_amount'])[4]");
	private final By fifthCurrentAmounttextfield_xpath = By
			.xpath("(//input[@class='receivable_current_amount'])[5]");
	private final By sixthCurrentAmounttextfield_xpath = By
			.xpath("(//input[@class='receivable_current_amount'])[6]");
	private final By seventhCurrentAmounttextfield_xpath = By
			.xpath("(//input[@class='receivable_current_amount'])[7]");
	private final By eighthCurrentAmounttextfield_xpath = By
			.xpath("(//input[@class='receivable_current_amount'])[8]");
	private final By firstDueDate_xpath = By
			.id("batch_invoice_receivables_attributes_0_due_dt");
	private final By secondDueDate_xpath = By.
			id("batch_invoice_receivables_attributes_1_due_dt");
	private final By thirdDueDate_xpath = By.id("batch_invoice_receivables_attributes_2_due_dt");
	private final By fourthDueDate_xpath = By.id("batch_invoice_receivables_attributes_3_due_dt");
	private final By fifthDueDate_xpath = By.id("batch_invoice_receivables_attributes_4_due_dt");
	private final By sixthDueDate_xpath = By.id("batch_invoice_receivables_attributes_5_due_dt");
	private final By seventhDueDate_xpath = By.id("batch_invoice_receivables_attributes_6_due_dt");
	private final By eighthDueDate_xpath = By.id("batch_invoice_receivables_attributes_7_due_dt");
	private final By processInvoiceButton_xpath = By
			.xpath("//input[@value='Process Invoice']");
	private final By batchDate_xpath=By.id("batch_invoice_batch_date");
	private final By batchTotaltextfield_xpath=By.id("batch_invoice_batch_total");
	private final By successMsg_xpath=By.xpath("h2[text()='Batch was successfully created.']");

	public EnterNewSaleInvoicesPage(WebDriver driver) {
		super(driver);

		try {
			Thread.sleep(10000);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		if (!driver.findElement(enterNewSalesInvoice_xpath).getText().trim()
				.equals("Enter New Sale Invoices")) {
			throw new SkipException("Enter New Sale Invoices couldn't open.");
		}
	}
public boolean selectBatchDate(){
	try {
		WebElement batchDateWebElement = new WebDriverWait(driver,
				100)
				.until(ExpectedConditions
						.visibilityOfElementLocated(batchDate_xpath));
		Date date = new Date(System.currentTimeMillis());
		SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
		String today=formatter.format(date);
		
		batchDateWebElement.sendKeys(today);
		
		
		return true;
	} catch (Exception e) {
		return false;
	}
}
public boolean enterBatchTotal(String total){
	try {
		WebElement batchTotalWebElement = new WebDriverWait(driver,
				100)
				.until(ExpectedConditions
						.visibilityOfElementLocated(batchTotaltextfield_xpath));
		batchTotalWebElement.clear();
		batchTotalWebElement.sendKeys(total);
		
		
		return true;
	} catch (Exception e) {
		return false;
	}
}
	public boolean enterNewSalesInvoiceHeaderVerification(String header) {
		try {
			WebElement enterNewSalesInvoiceHeaderWebElement = new WebDriverWait(driver,
					100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(enterNewSalesInvoiceHeader_xpath));
			Thread.sleep(5000);
			String actual = enterNewSalesInvoiceHeaderWebElement.getText();
			if (actual.equals(header)) {
				return true;
			} else {
				System.out.println("headers don't match!!!");
				return false;
			}
		} catch (Exception e) {
			return false;
		}
	}
	
	public boolean enterfirstAccountNo(String accountNo){
		try {
			WebElement firstAccountNumbertextfieldWebElement = new WebDriverWait(driver,
					100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(firstAccountNumbertextfield_xpath));
			Thread.sleep(5000);
			firstAccountNumbertextfieldWebElement.sendKeys(accountNo);
			return true;
			
		} catch (Exception e) {
			return false;
		}
	}
	public boolean enterSecondAccountNo(String accountNo){
		try {
			WebElement secondAccountNumbertextfieldWebElement = new WebDriverWait(driver,
					100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(secondAccountNumbertextfield_xpath));
			Thread.sleep(5000);
			secondAccountNumbertextfieldWebElement.sendKeys(accountNo);
			return true;
			
		} catch (Exception e) {
			return false;
		}
	}
	public boolean enterThirdAccountNo(String accountNo){
		try {
			WebElement thirdAccountNumbertextfieldWebElement = new WebDriverWait(driver,
					100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(thirdAccountNumbertextfield_xpath));
			Thread.sleep(5000);
			thirdAccountNumbertextfieldWebElement.sendKeys(accountNo);
			return true;
			
		} catch (Exception e) {
			return false;
		}
	}
	public boolean enterFourthAccountNo(String accountNo){
		try {
			WebElement fourthAccountNumbertextfieldWebElement = new WebDriverWait(driver,
					100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(fourthAccountNumbertextfield_xpath));
			Thread.sleep(5000);
			fourthAccountNumbertextfieldWebElement.sendKeys(accountNo);
			return true;
			
		} catch (Exception e) {
			return false;
		}
	}
	public boolean enterFifthAccountNo(String accountNo){
		try {
			WebElement fifthAccountNumbertextfieldWebElement = new WebDriverWait(driver,
					100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(fifthAccountNumbertextfield_xpath));
			Thread.sleep(5000);
			fifthAccountNumbertextfieldWebElement.sendKeys(accountNo);
			return true;
			
		} catch (Exception e) {
			return false;
		}
	}
	public boolean enterSixthAccountNo(String accountNo){
		try {
			WebElement SixthAccountNumbertextfieldWebElement = new WebDriverWait(driver,
					100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(sixthAccountNumbertextfield_xpath));
			Thread.sleep(5000);
			SixthAccountNumbertextfieldWebElement.sendKeys(accountNo);
			return true;
			
		} catch (Exception e) {
			return false;
		}
	}
	public boolean enterSeventhAccountNo(String accountNo){
		try {
			WebElement seventhAccountNumbertextfieldWebElement = new WebDriverWait(driver,
					100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(seventhAccountNumbertextfield_xpath));
			Thread.sleep(5000);
			seventhAccountNumbertextfieldWebElement.sendKeys(accountNo);
			return true;
			
		} catch (Exception e) {
			return false;
		}
	}
	public boolean enterEighthAccountNo(String accountNo){
		try {
			WebElement eighthAccountNumbertextfieldWebElement = new WebDriverWait(driver,
					100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(eighthAccountNumbertextfield_xpath));
			Thread.sleep(5000);
			eighthAccountNumbertextfieldWebElement.sendKeys(accountNo);
			return true;
			
		} catch (Exception e) {
			return false;
		}
	}
	
	public boolean enterFirstAccountName(String accountName){
		try {
			WebElement firstAccountNametextfieldWebElement = new WebDriverWait(driver,
					100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(firstAccountNametextfield_xpath));
			Thread.sleep(5000);
			firstAccountNametextfieldWebElement.sendKeys(accountName);
			return true;
			
		} catch (Exception e) {
			return false;
		}
	}
	public boolean enterSecondAccountName(String accountName){
		try {
			WebElement secondAccountNametextfieldWebElement = new WebDriverWait(driver,
					100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(secondAccountNametextfield_xpath));
			Thread.sleep(5000);
			secondAccountNametextfieldWebElement.sendKeys(accountName);
			return true;
			
		} catch (Exception e) {
			return false;
		}
	}
	public boolean enterThirdAccountName(String accountName){
		try {
			WebElement thirdAccountNametextfieldWebElement = new WebDriverWait(driver,
					100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(thirdAccountNametextfield_xpath));
			Thread.sleep(5000);
			thirdAccountNametextfieldWebElement.sendKeys(accountName);
			return true;
			
		} catch (Exception e) {
			return false;
		}
	}
	public boolean enterFourthAccountName(String accountName){
		try {
			WebElement fourthAccountNametextfieldWebElement = new WebDriverWait(driver,
					100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(fourthAccountNametextfield_xpath));
			Thread.sleep(5000);
			fourthAccountNametextfieldWebElement.sendKeys(accountName);
			return true;
			
		} catch (Exception e) {
			return false;
		}
	}	
	public boolean enterFifthAccountName(String accountName){
		try {
			WebElement fifthAccountNametextfieldWebElement = new WebDriverWait(driver,
					100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(fifthAccountNametextfield_xpath));
			Thread.sleep(5000);
			fifthAccountNametextfieldWebElement.sendKeys(accountName);
			return true;
			
		} catch (Exception e) {
			return false;
		}
	}
	
	public boolean enterSixthAccountName(String accountName){
		try {
			WebElement sixthAccountNametextfieldWebElement = new WebDriverWait(driver,
					100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(sixthAccountNametextfield_xpath));
			Thread.sleep(5000);
			sixthAccountNametextfieldWebElement.sendKeys(accountName);
			return true;
			
		} catch (Exception e) {
			return false;
		}
	}	
	public boolean enterSeventhAccountName(String accountName){
		try {
			WebElement seventhAccountNametextfieldWebElement = new WebDriverWait(driver,
					100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(seventhAccountNametextfield_xpath));
			Thread.sleep(5000);
			seventhAccountNametextfieldWebElement.sendKeys(accountName);
			return true;
			
		} catch (Exception e) {
			return false;
		}
	}
	public boolean enterEighthAccountName(String accountName){
		try {
			WebElement eighthAccountNametextfieldWebElement = new WebDriverWait(driver,
					100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(eighthAccountNametextfield_xpath));
			Thread.sleep(5000);
			eighthAccountNametextfieldWebElement.sendKeys(accountName);
			return true;
			
		} catch (Exception e) {
			return false;
		}
	}
	public boolean enterFirstDocumentNo(String documentNo){
		try {
			WebElement firstDocumentNotextfieldWebElement = new WebDriverWait(driver,
					100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(firstDocumentNotextfield_xpath));
			Thread.sleep(5000);
			firstDocumentNotextfieldWebElement.sendKeys(documentNo);
			return true;
			
		} catch (Exception e) {
			return false;
		}
	}
	public boolean enterSecondDocumentNo(String documentNo){
		try {
			WebElement secondDocumentNotextfieldWebElement = new WebDriverWait(driver,
					100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(secondDocumentNotextfield_xpath));
			Thread.sleep(5000);
			secondDocumentNotextfieldWebElement.sendKeys(documentNo);
			return true;
			
		} catch (Exception e) {
			return false;
		}
	}
	public boolean enterThirdDocumentNo(String documentNo){
		try {
			WebElement thirdDocumentNotextfieldWebElement = new WebDriverWait(driver,
					100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(thirdDocumentNotextfield_xpath));
			Thread.sleep(5000);
			thirdDocumentNotextfieldWebElement.sendKeys(documentNo);
			return true;
			
		} catch (Exception e) {
			return false;
		}
	}
	public boolean enterFourthDocumentNo(String documentNo){
		try {
			WebElement fourthDocumentNotextfieldWebElement = new WebDriverWait(driver,
					100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(fourthDocumentNotextfield_xpath));
			Thread.sleep(5000);
			fourthDocumentNotextfieldWebElement.sendKeys(documentNo);
			return true;
			
		} catch (Exception e) {
			return false;
		}
	}
	public boolean enterFifthDocumentNo(String documentNo){
		try {
			WebElement fifthDocumentNotextfieldWebElement = new WebDriverWait(driver,
					100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(fifthDocumentNotextfield_xpath));
			Thread.sleep(5000);
			fifthDocumentNotextfieldWebElement.sendKeys(documentNo);
			return true;
			
		} catch (Exception e) {
			return false;
		}
	}
	public boolean enterSixthDocumentNo(String documentNo){
		try {
			WebElement sixthDocumentNotextfieldWebElement = new WebDriverWait(driver,
					100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(sixthDocumentNotextfield_xpath));
			Thread.sleep(5000);
			sixthDocumentNotextfieldWebElement.sendKeys(documentNo);
			return true;
			
		} catch (Exception e) {
			return false;
		}
	}
	public boolean enterSeventhDocumentNo(String documentNo){
		try {
			WebElement seventhDocumentNotextfieldWebElement = new WebDriverWait(driver,
					100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(seventhDocumentNotextfield_xpath));
			Thread.sleep(5000);
			seventhDocumentNotextfieldWebElement.sendKeys(documentNo);
			return true;
			
		} catch (Exception e) {
			return false;
		}
	}
	public boolean enterEighthDocumentNo(String documentNo){
		try {
			WebElement eighthDocumentNotextfieldWebElement = new WebDriverWait(driver,
					100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(eighthDocumentNotextfield_xpath));
			Thread.sleep(5000);
			eighthDocumentNotextfieldWebElement.sendKeys(documentNo);
			return true;
			
		} catch (Exception e) {
			return false;
		}
	}
	public boolean enterFirstOriginalDate(String originalDate){
		try {
			WebElement firstOriginalDateWebElement = new WebDriverWait(driver,
					100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(firstOriginalDate_xpath));
			Thread.sleep(5000);
			firstOriginalDateWebElement.sendKeys(originalDate);
			return true;
			
		} catch (Exception e) {
			return false;
		}
	}
	public boolean enterSecondOriginalDate(String originalDate){
		try {
			WebElement secondOriginalDateWebElement = new WebDriverWait(driver,
					100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(secondOriginalDate_xpath));
			Thread.sleep(5000);
			secondOriginalDateWebElement.sendKeys(originalDate);
			return true;
			
		} catch (Exception e) {
			return false;
		}
	}
	public boolean enterThirdOriginalDate(String originalDate){
		try {
			WebElement thirdOriginalDateWebElement = new WebDriverWait(driver,
					100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(thirdOriginalDate_xpath));
			Thread.sleep(5000);
			thirdOriginalDateWebElement.sendKeys(originalDate);
			return true;
			
		} catch (Exception e) {
			return false;
		}
	}
	public boolean enterFourthOriginalDate(String originalDate){
		try {
			WebElement fourthOriginalDateWebElement = new WebDriverWait(driver,
					100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(fourthOriginalDate_xpath));
			Thread.sleep(5000);
			fourthOriginalDateWebElement.sendKeys(originalDate);
			return true;
			
		} catch (Exception e) {
			return false;
		}
	}
	public boolean enterFifthOriginalDate(String originalDate){
		try {
			WebElement fifthOriginalDateWebElement = new WebDriverWait(driver,
					100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(fifthOriginalDate_xpath));
			Thread.sleep(5000);
			fifthOriginalDateWebElement.sendKeys(originalDate);
			return true;
			
		} catch (Exception e) {
			return false;
		}
	}
	public boolean enterSixthOriginalDate(String originalDate){
		try {
			WebElement sixthOriginalDateWebElement = new WebDriverWait(driver,
					100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(sixthOriginalDate_xpath));
			Thread.sleep(5000);
			sixthOriginalDateWebElement.sendKeys(originalDate);
			return true;
			
		} catch (Exception e) {
			return false;
		}
	}
	public boolean enterSeventhOriginalDate(String originalDate){
		try {
			WebElement seventhOriginalDateWebElement = new WebDriverWait(driver,
					100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(seventhOriginalDate_xpath));
			Thread.sleep(5000);
			seventhOriginalDateWebElement.sendKeys(originalDate);
			return true;
			
		} catch (Exception e) {
			return false;
		}
	}
	public boolean enterEighthOriginalDate(String originalDate){
		try {
			WebElement eighthOriginalDateWebElement = new WebDriverWait(driver,
					100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(eighthOriginalDate_xpath));
			Thread.sleep(5000);
			eighthOriginalDateWebElement.sendKeys(originalDate);
			return true;
			
		} catch (Exception e) {
			return false;
		}
	}
	
	public boolean enterFirstDueDate(String dueDate){
		try {
			WebElement firstDueDateWebElement = new WebDriverWait(driver,
					100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(firstDueDate_xpath));
			Thread.sleep(5000);
			firstDueDateWebElement.sendKeys(dueDate);
			return true;
			
		} catch (Exception e) {
			return false;
		}
	}
	public boolean enterSecondDueDate(String dueDate){
		try {
			WebElement secondDueDateWebElement = new WebDriverWait(driver,
					100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(secondDueDate_xpath));
			Thread.sleep(5000);
			secondDueDateWebElement.sendKeys(dueDate);
			return true;
			
		} catch (Exception e) {
			return false;
		}
	}
	public boolean enterThirdDueDate(String dueDate){
		try {
			WebElement thirdDueDateWebElement = new WebDriverWait(driver,
					100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(thirdDueDate_xpath));
			Thread.sleep(5000);
			thirdDueDateWebElement.sendKeys(dueDate);
			return true;
			
		} catch (Exception e) {
			return false;
		}
	}
	public boolean enterFourthDueDate(String dueDate){
		try {
			WebElement fourthDueDateWebElement = new WebDriverWait(driver,
					100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(fourthDueDate_xpath));
			Thread.sleep(5000);
			fourthDueDateWebElement.sendKeys(dueDate);
			return true;
			
		} catch (Exception e) {
			return false;
		}
	}
	public boolean enterFifthDueDate(String dueDate){
		try {
			WebElement fifthDueDateWebElement = new WebDriverWait(driver,
					100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(fifthDueDate_xpath));
			Thread.sleep(5000);
			fifthDueDateWebElement.sendKeys(dueDate);
			return true;
			
		} catch (Exception e) {
			return false;
		}
	}
	public boolean enterSixthDueDate(String dueDate){
		try {
			WebElement sixthDueDateWebElement = new WebDriverWait(driver,
					100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(sixthDueDate_xpath));
			Thread.sleep(5000);
			sixthDueDateWebElement.sendKeys(dueDate);
			return true;
			
		} catch (Exception e) {
			return false;
		}
	}
	public boolean enterSeventhDueDate(String dueDate){
		try {
			WebElement seventhDueDateWebElement = new WebDriverWait(driver,
					100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(seventhDueDate_xpath));
			Thread.sleep(5000);
			seventhDueDateWebElement.sendKeys(dueDate);
			return true;
			
		} catch (Exception e) {
			return false;
		}
	}
	public boolean enterEighthDueDate(String dueDate){
		try {
			WebElement eighthDueDateWebElement = new WebDriverWait(driver,
					100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(eighthDueDate_xpath));
			Thread.sleep(5000);
			eighthDueDateWebElement.sendKeys(dueDate);
			return true;
			
		} catch (Exception e) {
			return false;
		}
	}
		
	public boolean enterFirstCurrentAmount(String currentAmount){
		try {
			WebElement firstCurrentAmounttextfieldWebElement = new WebDriverWait(driver,
					100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(firstCurrentAmounttextfield_xpath));
			Thread.sleep(5000);
			firstCurrentAmounttextfieldWebElement.clear();
			String selectAll = Keys.chord(Keys.CONTROL, "a");
			firstCurrentAmounttextfieldWebElement.sendKeys(selectAll);
			firstCurrentAmounttextfieldWebElement.sendKeys(currentAmount);
			return true;
			
			
		} catch (Exception e) {
			return false;
		}
	}
	public boolean enterSecondCurrentAmount(String currentAmount){
		try {
			WebElement secondCurrentAmounttextfieldWebElement = new WebDriverWait(driver,
					100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(secondCurrentAmounttextfield_xpath));
			Thread.sleep(5000);
			secondCurrentAmounttextfieldWebElement.clear();
			String selectAll = Keys.chord(Keys.CONTROL, "a");
			secondCurrentAmounttextfieldWebElement.sendKeys(selectAll);
			secondCurrentAmounttextfieldWebElement.sendKeys(currentAmount);
			return true;
			
			
		} catch (Exception e) {
			return false;
		}
	}
	public boolean enterThirdCurrentAmount(String currentAmount){
		try {
			WebElement thirdCurrentAmounttextfieldWebElement = new WebDriverWait(driver,
					100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(thirdCurrentAmounttextfield_xpath));
			Thread.sleep(5000);
			thirdCurrentAmounttextfieldWebElement.clear();
			String selectAll = Keys.chord(Keys.CONTROL, "a");
			thirdCurrentAmounttextfieldWebElement.sendKeys(selectAll);
			thirdCurrentAmounttextfieldWebElement.sendKeys(currentAmount);
			return true;
			
			
		} catch (Exception e) {
			return false;
		}
	}
	public boolean enterFourthCurrentAmount(String currentAmount){
		try {
			WebElement fourthCurrentAmounttextfieldWebElement = new WebDriverWait(driver,
					100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(fourthCurrentAmounttextfield_xpath));
			Thread.sleep(5000);
			fourthCurrentAmounttextfieldWebElement.clear();
			String selectAll = Keys.chord(Keys.CONTROL, "a");
			fourthCurrentAmounttextfieldWebElement.sendKeys(selectAll);
			fourthCurrentAmounttextfieldWebElement.sendKeys(currentAmount);
			return true;
			
			
		} catch (Exception e) {
			return false;
		}
	}
	public boolean enterFifthCurrentAmount(String currentAmount){
		try {
			WebElement fifthCurrentAmounttextfieldWebElement = new WebDriverWait(driver,
					100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(fifthCurrentAmounttextfield_xpath));
			Thread.sleep(5000);
			fifthCurrentAmounttextfieldWebElement.clear();
			String selectAll = Keys.chord(Keys.CONTROL, "a");
			fifthCurrentAmounttextfieldWebElement.sendKeys(selectAll);
			fifthCurrentAmounttextfieldWebElement.sendKeys(currentAmount);
			return true;
			
			
		} catch (Exception e) {
			return false;
		}
	}
	public boolean enterSixthCurrentAmount(String currentAmount){
		try {
			WebElement sixthCurrentAmounttextfieldWebElement = new WebDriverWait(driver,
					100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(sixthCurrentAmounttextfield_xpath));
			Thread.sleep(5000);
			sixthCurrentAmounttextfieldWebElement.clear();
			String selectAll = Keys.chord(Keys.CONTROL, "a");
			sixthCurrentAmounttextfieldWebElement.sendKeys(selectAll);
			sixthCurrentAmounttextfieldWebElement.sendKeys(currentAmount);
			return true;
			
			
		} catch (Exception e) {
			return false;
		}
	}
	public boolean enterSeventhCurrentAmount(String currentAmount){
		try {
			WebElement seventhCurrentAmounttextfieldWebElement = new WebDriverWait(driver,
					100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(seventhCurrentAmounttextfield_xpath));
			Thread.sleep(5000);
			seventhCurrentAmounttextfieldWebElement.clear();
			String selectAll = Keys.chord(Keys.CONTROL, "a");
			seventhCurrentAmounttextfieldWebElement.sendKeys(selectAll);
			seventhCurrentAmounttextfieldWebElement.sendKeys(currentAmount);
			return true;
			
			
		} catch (Exception e) {
			return false;
		}
	}
	public boolean enterEighthCurrentAmount(String currentAmount){
		try {
			WebElement eighthCurrentAmounttextfieldWebElement = new WebDriverWait(driver,
					100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(eighthCurrentAmounttextfield_xpath));
			Thread.sleep(5000);
			eighthCurrentAmounttextfieldWebElement.clear();
			String selectAll = Keys.chord(Keys.CONTROL, "a");
			eighthCurrentAmounttextfieldWebElement.sendKeys(selectAll);
			eighthCurrentAmounttextfieldWebElement.sendKeys(currentAmount);
			return true;
			
			
		} catch (Exception e) {
			return false;
		}
	}
	public boolean clickOnProcessInvoice(){
		try {
			WebElement processInvoiceButtonWebElement = new WebDriverWait(driver,
					100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(processInvoiceButton_xpath));
			processInvoiceButtonWebElement.click();
			return true;
			
		} catch (Exception e) {
		return false;
		}
	}
public boolean verifySuccessMsg(String expectedMsg){
	try {
		WebElement successMsgWebElement = new WebDriverWait(driver,
				100)
				.until(ExpectedConditions
						.visibilityOfElementLocated(successMsg_xpath));
		String actualMsg=successMsgWebElement.getText();
		if(actualMsg.equals(expectedMsg))
		return true;
		else
			return false;
	} catch (Exception e) {
		return false;
	}
}


}
