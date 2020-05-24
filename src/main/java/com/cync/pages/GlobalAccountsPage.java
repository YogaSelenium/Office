package com.cync.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.SkipException;

import com.cync.base.BasePage;

public class GlobalAccountsPage extends BasePage {

	private final By GlobalAccountHeader_xpath = By
			.xpath("//span[contains(text(),'Global Accounts')]");
	private final By exportLink_xpath = By
			.xpath("//*[@class='ui-icon ui-icon-extlink']");
	private final By downloadFile_xpath = By.xpath("//*[@class='export']");
	private final By globalAccountExportCheckBox_xpath = By
			.xpath("//*[@id='export_cols']");
	private final By closePopUp_xpath = By.id("closedialog");
	private final By verifyMessage_xpath = By.id("infocnt");
	private final By closeDialogTitleBar_xpath = By
			.xpath("//*[@class='ui-dialog-titlebar-close']");
	private final By addIcon_xpath = By
			.xpath("//*[@class='ui-icon ui-icon ui-icon-plus']");
	private final By accountName_xpath = By
			.xpath("(//*[contains(@id,'account_name') and contains(@role,'textbox')])[2]");
	private final By selectCountry_xpath = By
			.xpath("(//*[contains(@name,'country_id') and contains(@role,'select')])[2]");
	private final By saveButton_xpath = By
			.xpath("ui-icon ui-icon ui-icon-disk");
	private final By accoutnamegridcell_xpath = By
			.xpath("(//td[@aria-describedby='global_account_list_account_name'])");
	private final By searchAccountName_xpath=By.xpath("//*[@id='gs_account_name']");
	private final By deleteButton_xpath=By.xpath("//*[@class='ui-icon ui-icon-trash']");
	private final By refreshButton_xpath=By.xpath("//*[@class='ui-icon ui-icon-refresh']");
	private final By lastPager_xpath=By.id("last_global_account_pager");
	
	public GlobalAccountsPage(WebDriver driver) {
		super(driver);
		try {
			if (!driver.findElement(GlobalAccountHeader_xpath).getText().trim()
					.contains("Global Accounts")) {
				throw new SkipException("Global Accounts page couldn't open.");

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public boolean globalAccountsHeader(String HeaderData) {
		try {
			WebElement vendorsHeaderWebEelement = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(GlobalAccountHeader_xpath));
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

	public boolean ClosePopUp() {
		try {

			WebElement closeWebelement = new WebDriverWait(driver, 20)
					.until(ExpectedConditions
							.visibilityOfElementLocated(closePopUp_xpath));
			closeWebelement.click();
			Thread.sleep(1000);

			return true;
		}

		catch (Exception ex) {
			return false;
		}

	}

	public boolean addIcon() {
		try {

			WebElement closeWebelement = new WebDriverWait(driver, 20)
					.until(ExpectedConditions
							.visibilityOfElementLocated(addIcon_xpath));
			closeWebelement.click();
			Thread.sleep(1000);

			return true;
		}

		catch (Exception ex) {
			return false;
		}

	}

	public boolean downloadFile() {
		try {

			WebElement closeWebelement = new WebDriverWait(driver, 20)
					.until(ExpectedConditions
							.visibilityOfElementLocated(downloadFile_xpath));
			closeWebelement.click();
			Thread.sleep(1000);

			return true;
		}

		catch (Exception ex) {
			return false;
		}

	}

	public boolean exportLink() {
		try {

			WebElement closeWebelement = new WebDriverWait(driver, 20)
					.until(ExpectedConditions
							.visibilityOfElementLocated(exportLink_xpath));
			closeWebelement.click();
			Thread.sleep(1000);

			return true;
		}

		catch (Exception ex) {
			return false;
		}

	}

	public boolean closeDialogTitleBar() {
		try {

			WebElement closeWebelement = new WebDriverWait(driver, 20)
					.until(ExpectedConditions
							.visibilityOfElementLocated(closeDialogTitleBar_xpath));
			closeWebelement.click();
			Thread.sleep(1000);

			return true;
		}

		catch (Exception ex) {
			return false;
		}

	}

	public boolean unselectAllCheckboxFromExport() {
		try {
			new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(globalAccountExportCheckBox_xpath));

			List<WebElement> list = driver
					.findElements(globalAccountExportCheckBox_xpath);
			for (WebElement e : list) {

				if (e.isSelected()) {
					e.click();
				}
			}

			return true;

		} catch (Exception e) {
			return false;
		}
	}

	public String verifyTheErrorMessage(String Message) {

		try {
			WebElement HeaderWebEelement = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(verifyMessage_xpath));
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

	public boolean accountNameField(String accountNo) {
		try {

			WebElement closeWebelement = new WebDriverWait(driver, 20)
					.until(ExpectedConditions
							.visibilityOfElementLocated(accountName_xpath));
			closeWebelement.sendKeys(accountNo);
			Thread.sleep(1000);

			return true;
		}

		catch (Exception ex) {
			return false;
		}

	}

	public boolean selectCountry(String sw) {
		try {
			WebElement accTypeDropdownWebEelement = new WebDriverWait(driver,
					10).until(ExpectedConditions
					.visibilityOfElementLocated(selectCountry_xpath));
			Select sel = new Select(accTypeDropdownWebEelement);
			List<WebElement> list = sel.getOptions();
			for (WebElement ele : list) {
				if (ele.getText().equals(sw)) {
					ele.click();
					// ////Thread.sleep(5000);
					break;
				}
			}
			return true;
		} catch (Exception ex) {
		}
		return false;
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

	public boolean DoubleClickOnaccountname() {
		try {

			WebElement element = new WebDriverWait(driver, 100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(accoutnamegridcell_xpath));
			// Double click
			Actions action = new Actions(driver);
			action.doubleClick(element).build().perform();
			Thread.sleep(500);

			return true;
		} catch (Exception ex) {
			return false;
		}
	}
	
	public boolean deleteButton() {
		try {

			WebElement closeWebelement = new WebDriverWait(driver, 20)
					.until(ExpectedConditions
							.visibilityOfElementLocated(deleteButton_xpath));
			closeWebelement.click();
			Thread.sleep(3000);

			return true;
		}

		catch (Exception ex) {
			return false;
		}

	}
	
	public boolean refreshButton() {
		try {

			WebElement closeWebelement = new WebDriverWait(driver, 20)
					.until(ExpectedConditions
							.visibilityOfElementLocated(refreshButton_xpath));
			closeWebelement.click();
			Thread.sleep(3000);

			return true;
		}

		catch (Exception ex) {
			return false;
		}

	}
	
	public boolean lastPager() {
		try {

			WebElement closeWebelement = new WebDriverWait(driver, 20)
					.until(ExpectedConditions
							.visibilityOfElementLocated(lastPager_xpath));
			closeWebelement.click();
			Thread.sleep(3000);

			return true;
		}

		catch (Exception ex) {
			return false;
		}

	}
	
	
	public boolean searchAccountName(String accountName) {
		try {

			WebElement closeWebelement = new WebDriverWait(driver, 20)
					.until(ExpectedConditions
							.visibilityOfElementLocated(searchAccountName_xpath));
			closeWebelement.sendKeys(accountName);
			Thread.sleep(1000);

			return true;
		}

		catch (Exception ex) {
			return false;
		}

	}
}
