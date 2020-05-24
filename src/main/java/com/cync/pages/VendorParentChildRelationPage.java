package com.cync.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.cync.base.BasePage;

public class VendorParentChildRelationPage extends BasePage { // (author:sanusha)

	private final By FirstParentName_xpath = By
			.xpath("//td[contains(text(),'VENDOR1 V001')]");
	private final By FirstChildName_xpath = By
			.xpath("//td[contains(text(),'VENDOR2 V002')]");

	private final By firstParentnameSummaryClient_xpath = By
			.xpath("//td[contains(text(),'VENDOR10 V0010')]");
	private final By FirstChildNameSummaryClient_xpath = By
			.xpath("//td[contains(text(),'VENDOR12 V0012')]");
	private final By vendorParentChildHeader_xpath = By
			.xpath("//span[contains(text(),' Vendor Parent Child Relation ')]");
	private final By addButton_xpath = By
			.xpath("//*[@class='ui-icon ui-icon ui-icon-plus']");
	private final By saveButton_xpath = By
			.xpath("//*[@class='ui-icon ui-icon ui-icon-disk']");
	private final By trash_xpath = By
			.xpath("//*[@id='del_vendor_parent_child_list']");
	private final By closeDialog_xpath = By.id("closedialog");
	private final By verifyMsg_xpath = By.xpath("//*[@id='infocnt']");
	private final By parentAccountField_xpath = By
			.xpath("(//*[@name='parent_account_no'])[2]");
	private final By childAccountNo_xpath = By
			.xpath("(//*[@name='child_account_no'])[2]");
	private final By deleteAcceptButton_xpath=By.xpath("dData");

	private final By allSelectCheckbox_xpath=By.xpath("cb_vendor_parent_child_list");
	
	public VendorParentChildRelationPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public boolean ParentNameValidation(String parentName) {
		try {
			WebElement parameterNameValidationWebElement = new WebDriverWait(
					driver, 100).until(ExpectedConditions
					.visibilityOfElementLocated(FirstParentName_xpath));
			Thread.sleep(2000);
			String actual = parameterNameValidationWebElement.getText();
			if (actual.equals(parentName))
				return true;
			else
				return false;
		} catch (Exception e) {
			return false;
		}
	}

	public boolean ChildNameValidation(String ChildName) {
		try {
			WebElement parameterNameValidationWebElement = new WebDriverWait(
					driver, 100).until(ExpectedConditions
					.visibilityOfElementLocated(FirstChildName_xpath));
			Thread.sleep(2000);
			String actual = parameterNameValidationWebElement.getText();
			if (actual.equals(ChildName))
				return true;
			else
				return false;

		} catch (Exception e) {
			return false;
		}
	}

	public boolean ParentNameValidation_summaryClient(String parentName) {
		try {
			WebElement parameterNameValidationWebElement = new WebDriverWait(
					driver, 100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(firstParentnameSummaryClient_xpath));
			Thread.sleep(2000);
			String actual = parameterNameValidationWebElement.getText();
			if (actual.equals(parentName))
				return true;
			else
				return false;
		} catch (Exception e) {
			return false;
		}
	}

	public boolean ChildNameValidation_summaryClient(String ChildName) {
		try {
			WebElement parameterNameValidationWebElement = new WebDriverWait(
					driver, 100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(FirstChildNameSummaryClient_xpath));
			Thread.sleep(2000);
			String actual = parameterNameValidationWebElement.getText();
			if (actual.equals(ChildName))
				return true;
			else
				return false;

		} catch (Exception e) {
			return false;
		}
	}

	// rohit

	public boolean vendorParentChildRelation(String HeaderData) {
		try {
			WebElement vendorsHeaderWebEelement = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(vendorParentChildHeader_xpath));
			String data = vendorsHeaderWebEelement.getText().trim();
			if (data.equalsIgnoreCase(HeaderData)) {
				System.out.println(data);
				return true;
			}

			else {
				return false;
			}

		} catch (Exception ex) {
			System.out.println("Test case Failed");
			return false;

		}
	}

	public boolean addButton() {
		try {

			WebElement closeWebelement = new WebDriverWait(driver, 20)
					.until(ExpectedConditions
							.visibilityOfElementLocated(addButton_xpath));
			closeWebelement.click();
			Thread.sleep(3000);

			return true;
		}

		catch (Exception ex) {
			return false;
		}

	}

	public boolean saveButton() {
		try {

			WebElement closeWebelement = new WebDriverWait(driver, 20)
					.until(ExpectedConditions
							.visibilityOfElementLocated(saveButton_xpath));
			closeWebelement.click();
			Thread.sleep(3000);

			return true;
		}

		catch (Exception ex) {
			return false;
		}

	}

	public boolean trash() {
		try {

			WebElement closeWebelement = new WebDriverWait(driver, 20)
					.until(ExpectedConditions
							.visibilityOfElementLocated(trash_xpath));
			closeWebelement.click();
			Thread.sleep(3000);

			return true;
		}

		catch (Exception ex) {
			return false;
		}

	}

	public boolean closeDialog() {
		try {

			WebElement closeWebelement = new WebDriverWait(driver, 20)
					.until(ExpectedConditions
							.visibilityOfElementLocated(closeDialog_xpath));
			closeWebelement.click();
			Thread.sleep(3000);

			return true;
		}

		catch (Exception ex) {
			return false;
		}

	}

	public String verifyTheMessage(String Message) {

		try {
			WebElement HeaderWebEelement = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(verifyMsg_xpath));
			String actualMsgFromAPP = HeaderWebEelement.getText();
			if (actualMsgFromAPP.equalsIgnoreCase(Message))
				;
			{
				return actualMsgFromAPP;
			}
		} catch (Exception ex) {
		}
		return Message;
	}

	public boolean parentAccountField(String account) {
		try {

			WebElement closeWebelement = new WebDriverWait(driver, 20)
					.until(ExpectedConditions
							.visibilityOfElementLocated(parentAccountField_xpath));
			closeWebelement.sendKeys(account);
			Thread.sleep(1000);

			return true;
		}

		catch (Exception ex) {
			return false;
		}

	}
	public boolean childAccountNo(String accountNo) {
		try {

			WebElement closeWebelement = new WebDriverWait(driver, 20)
					.until(ExpectedConditions
							.visibilityOfElementLocated(childAccountNo_xpath));
			closeWebelement.sendKeys(accountNo);
			Thread.sleep(1000);

			return true;
		}

		catch (Exception ex) {
			return false;
		}

	}
	
	public boolean allSelectCheckbox() {
		try {

			WebElement closeWebelement = new WebDriverWait(driver, 20)
					.until(ExpectedConditions
							.visibilityOfElementLocated(allSelectCheckbox_xpath));
			closeWebelement.click();
			Thread.sleep(3000);

			return true;
		}

		catch (Exception ex) {
			return false;
		}

	}
	
	public boolean deleteAcceptButton() {
		try {

			WebElement closeWebelement = new WebDriverWait(driver, 20)
					.until(ExpectedConditions
							.visibilityOfElementLocated(deleteAcceptButton_xpath));
			closeWebelement.click();
			Thread.sleep(3000);

			return true;
		}

		catch (Exception ex) {
			return false;
		}

	}
}
