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

public class VendorsPage extends BasePage // (author:sanusha)
{
	private final By vendor_xpath = By.xpath("//span[@class='paneltitle']");
	private final By firstAccountNo_xpath = By
			.xpath("(//*[@class='jqgfirstrow']/..//td[contains(@aria-describedby,'list_account_no')])[1]");
	private final By secondAccountNo_xpath = By
			.xpath("(//td[@aria-describedby='vendors_list_account_no'])[2]");
	private final By thirdAccountNo_xpath = By
			.xpath("(//td[@aria-describedby='vendors_list_account_no'])[3]");
	private final By fourthAccountNo_xpath = By
			.xpath("(//td[@aria-describedby='vendors_list_account_no'])[4]");
	private final By firstAccountName_xpath = By
			.xpath("(//td[@aria-describedby='vendors_list_account_name'])[1]");
	private final By secondAccountName_xpath = By
			.xpath("(//td[@aria-describedby='vendors_list_account_name'])[1]");
	private final By thirdAccountName_xpath = By
			.xpath("(//td[@aria-describedby='vendors_list_account_name'])[3]");
	private final By fourthAccountName_xpath = By
			.xpath("(//td[@aria-describedby='vendors_list_account_name'])[4]");
	private final By parameterNameValidation_xpath = By
			.xpath("(//td[@aria-describedby='vendors_list_collateral_advance_rate_id'])[1]");
	private final By accountNameSearch_xpath = By
			.xpath("(//input[@name='account_name'])[1]");
	private final By accountNumberSearch_xpath = By
			.xpath("(//input[@name='account_no'])[1]");

	// anusha
	private final By AccountName_xpath = By
			.xpath("(//span[@id='account_name'])[1]");
	private final By popupAssignChildren_xpath = By
			.xpath("//a[contains(text(),'Assign Children')]");
	private final By SelectTheChildrenFromDropDownInPopUp_xpath = By
			.xpath("//input[@id='token-input-children_search_box']");
	private final By SaveButtonInPopup_xpath = By
			.xpath("//button[@class='view-button']");
	private final By SucessMessage_xpath = By
			.xpath("//div[contains(text(),'Vendor children was successfully updated')]");
	private final By Vendors_xpath = By
			.xpath("//p[contains(text(),'VENDOR2 V002')]");

	// rohit
	private final By vendorsHeader_xpath = By
			.xpath("//span[contains(text(),'Vendors')]");
	private final By clickScrubVendors_xpath = By
			.xpath("(//a[contains(text(),'Vendors')])[3]");
	private final By closePopup_xpath = By.id("closedialog");
	private final By errorMsg_xpath = By.xpath("//div[@id='infocnt']");
	private final By exportLink_xpath = By
			.xpath("//*[@class='ui-icon ui-icon-extlink']");
	private final By gridColumnShowHide_xpath = By.id("colomun_choose_action");
	private final By closegrid = By.xpath("//*[@id='done']");
	private final By unselectAllCheckboxFromExport_xpath = By
			.xpath("//*[@class='box-content']//input");
	private final By verifyTheErrorMessage_xpath = By
			.xpath("//*[@id='infocnt']//div");
	private final By firstVendorsPager_xpath = By.id("first_vendors_pager");
	private final By prevVendorsPager_xpath = By.id("prev_vendors_pager");
	private final By nextVendorsPager_xpath = By.id("next_vendors_pager");
	private final By lastVendorsPager_xpath = By.id("last_vendors_pager");
	private final By vendorsTotalPageCount_xpath = By.id("sp_1_vendors_pager");
	private final By AccountNo_xpath = By
			.xpath("(//*[@class='ui-jqgrid-labels']//th[@role='columnheader']//div)[4]");
	private final By accountName_xpath = By
			.xpath("(//*[@class='ui-jqgrid-labels']//th[@role='columnheader']//div)[5]");
	private final By parameterName_xpath = By
			.xpath("(//*[@class='ui-jqgrid-labels']//th[@role='columnheader']//div)[6]");
	private final By globalAccount_xpath = By
			.xpath("(//*[@class='ui-jqgrid-labels']//th[@role='columnheader']//div)[7]");
	private final By parentAccount_xpath = By
			.xpath("(//*[@class='ui-jqgrid-labels']//th[@role='columnheader']//div)[8]");
	private final By createDate_xpath = By
			.xpath("(//*[@class='ui-jqgrid-labels']//th[@role='columnheader']//div)[9]");
	private final By dialogpopup = By.xpath("//*[@id='dialogPopup']//li");
	private final By accountName1_xpath = By
			.xpath("(//*[@id='account_name'])[1]");
	private final By primaryAddress_xpath = By
			.xpath("//*[@id='dialogPopup']//a[contains(text(),'Primary Address')]");
	private final By editBtn_xpath = By.id("detail_parameter_edit");
	private final By editAccountNo_xpath = By
			.xpath("//*[@id='vendor_account_name']");
	private final By saveBtn_xpath = By.xpath("//*[contains(@id,'save_bt')]");
	private final By successfulMsg_xpath = By
			.xpath("//*[@class='extend_message']");
	private final By crossBasicDeatilsBtn_xpath = By
			.xpath("(//button[@class='ui-dialog-titlebar-close'])[2]");
	private final By dialogTitlebarCloseContras_xpath = By
			.xpath("(//button[@class='ui-dialog-titlebar-close'])[3]");
	private final By commentTitleBarClose_xpath = By
			.xpath("(//*[@class='ui-jqdialog-titlebar-close ui-corner-all'])[1]");
	private final By firstAcountName_xpath = By
			.xpath("(//*[@id='vendors_list']//span[@id='account_name'])[1]");
	private final By clearFiled_xpath = By
			.xpath("//*[contains(@id,'vendor_account')]");
	private final By error_massage_xpath = By
			.xpath("//*[@class='alert alert-error failure']/ul");
	private final By vendorParentAccount_xpath = By
			.xpath("//*[contains(@id,'vendor_parent_account')]");
	private final By accoutnamegridcel2_xpath = By
			.xpath("(//td[@aria-describedby='vendors_list_account_name'])[1]");
	private final By selectParentAccount_xpath = By
			.xpath("//select[contains(@name,'parent_account_id') and not (contains(@id,'gs'))]");
	private final By saveIcon_xpath = By
			.xpath("//*[@class='ui-icon ui-icon ui-icon-disk']");
	private final By basicDetails_xpath = By
			.xpath("//*[@id='dialogPopup']//a[contains(text(),'Basic Details')]");
	private final By commentSectionCancelIcon_xpath = By
			.xpath("(//*[@class='ui-icon ui-icon ui-icon-cancel'])[2]");
	private final By primaryContactName_xpath = By
			.xpath("//*[contains(@name,'primary_account_address') and contains(@id,'primary_contact_name')]");
	private final By secondaryContactName_xpath = By
			.xpath("//*[contains(@name,'primary_account_address') and contains(@id,'other_contact_name')]");
	private final By cancelBasicDetailBtn_xpath = By.id("user_cancel");
	private final By secondaryAddress_xpath = By
			.xpath("//*[@id='dialogPopup']//a[contains(text(),'Secondary Address')]");
	private final By assignChildrenLink_xpath = By
			.xpath("//*[@id='dialogPopup']//a[contains(text(),'Assign Children')]");
	private final By searchChildren_xpath = By
			.id("token-input-children_search_box");
	private final By assignChildrenUpdated_xpath = By
			.xpath("//*[@id='message_area']/../div[2]");
	private final By assignChildrenClearAllBtn_xpath = By.id("clear");
	private final By assignChildrenSaveBtn_xpath = By
			.id("assign_children_submit_button");
	private final By assignContrasLink_xpath = By
			.xpath("//*[@id='dialogPopup']//a[contains(text(),'Assign Contras')]");
	private final By assignCommentsLink_xpath = By
			.xpath("//*[@id='dialogPopup']//a[contains(text(),'Comments')]");
	private final By addCommentButton_xpath = By
			.xpath("(//*[@class='ui-icon ui-icon ui-icon-plus'])[2]");
	private final By editCommentSection = By
			.xpath("//*[contains(@id,'comment_text') and contains(@class,'editable')]");
	private final By saveComment_xpath = By
			.xpath("(//*[@class='ui-icon ui-icon ui-icon-disk'])[2]");
	private final By notEditableMessage_xpath = By.id("infocnt");
	private final By editComment_xpath = By.xpath("//td[.='RohitAdmin']");
	private final By searchAccountNumber_xpath = By
			.xpath("//*[@class='ui-search-input']//*[@name='account_no']");
	private final By iconrefresh_xpath = By
			.xpath("//*[@class='ui-icon ui-icon-refresh']");
	private final By vendorCommentCheckBox_xpath = By
			.xpath("(//*[@class='ui-th-div']//input)[2]");
	private final By trashComment_xpath = By
			.xpath("(//*[@class='ui-icon ui-icon-trash'])[2]");
	private final By deleteComment_xpath = By.id("dData");
	private final By searchContras_xpath = By
			.id("token-input-drawer_customer_search_box");
	private final By deleteTokenContras_xpath = By
			.xpath("//*[@class='token-input-delete-token-facebook']");
	private final By accountNumberField = By
			.xpath("(//input[@name='account_no'])[2]");
	private final By accountNameField = By
			.xpath("(//input[@name='account_name'])[2]");
	private final By addVendorButton_xpath = By
			.xpath("//*[@class='ui-icon ui-icon ui-icon-plus']");
	private final By selectVendorsFirstCheckBox_xpath = By
			.xpath("(//input[contains(@class,'cbox')])[2]");
	private final By trashVendors_xpath = By
			.xpath("(//*[@class='ui-icon ui-icon-trash'])");
	private final By vendorCancelIcon_xpath = By
			.xpath("(//*[@class='ui-icon ui-icon ui-icon-cancel'])[2]");
	private final By vendorCancelIcon1_xpath = By
			.xpath("(//*[@class='ui-icon ui-icon ui-icon-cancel'])");
	
	private final By fieldValidation_xpath = By
			.xpath("//*[@class='ui-jqgrid-labels']//th");

	public VendorsPage(WebDriver driver) {
		super(driver);

		try {
			Thread.sleep(1000);
		} catch (Exception e) {

			e.printStackTrace();
		}
		if (!driver.findElement(vendor_xpath).getText().trim()
				.equals("Vendors")) {
			throw new SkipException("Vendors page couldn't open.");
		}
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

	public boolean secondAccountNoValidation(String expected) {
		try {
			WebElement secondAccountNoWebElement = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
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
			WebElement thirdAccountNoWebElement = new WebDriverWait(driver, 10)
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
			WebElement fourthAccountNoWebElement = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
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

	public boolean secondAccountNameValidation(String expected) {
		try {
			WebElement secondAccountNameWebElement = new WebDriverWait(driver,
					10).until(ExpectedConditions
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

	public boolean parameterNameValidation(String expected) {
		try {
			WebElement parameterNameValidationWebElement = new WebDriverWait(
					driver, 10).until(ExpectedConditions
					.visibilityOfElementLocated(parameterNameValidation_xpath));

			String actual = parameterNameValidationWebElement.getText();
			if (actual.equals(expected))
				return true;
			else
				return false;

		} catch (Exception e) {
			return false;
		}
	}

	public boolean AccountNameSearch(String Accountname) {
		try {
			WebElement accountNameSearchWebElement = new WebDriverWait(driver,
					10).until(ExpectedConditions
					.visibilityOfElementLocated(accountNameSearch_xpath));

			accountNameSearchWebElement.clear();
			accountNameSearchWebElement.sendKeys(Accountname);
			Thread.sleep(1000);
			return true;

		} catch (Exception e) {
			return false;
		}
	}

	public boolean AccountNumberSearch(String AccountNmber) {
		try {
			WebElement accountNameSearchWebElement = new WebDriverWait(driver,
					10).until(ExpectedConditions
					.visibilityOfElementLocated(accountNumberSearch_xpath));

			accountNameSearchWebElement.clear();
			accountNameSearchWebElement.sendKeys(AccountNmber);
			Thread.sleep(1000);
			return true;

		} catch (Exception e) {
			return false;
		}
	}
	
	

	// anusha

	public boolean ClickOnAccountNameHyperLink() {
		try {
			WebElement firstAccountNoWebElement = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(AccountName_xpath));
			firstAccountNoWebElement.click();
			Thread.sleep(1000);
			return true;
		} catch (Exception e) {
			return false;
		}

	}

	public boolean SelectAssignChildrenFromPopup() {
		try {
			WebElement assignChildrenWebElement = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(popupAssignChildren_xpath));
			assignChildrenWebElement.click();
			Thread.sleep(1000);
			return true;
		} catch (Exception e) {
			return false;
		}

	}

	public boolean SelectTheChildrenFromDropDownInPopUp(String selectChildren) {
		try {
			WebElement ChildrenWebElement = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(SelectTheChildrenFromDropDownInPopUp_xpath));
			ChildrenWebElement.click();
			ChildrenWebElement.sendKeys(selectChildren);
			WebElement saveWebElement = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(Vendors_xpath));
			saveWebElement.click();

			return true;
		} catch (Exception e) {
			return false;
		}

	}

	public boolean ClickOnSaveInPopup() {
		try {

			WebElement saveWebElement1 = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(SaveButtonInPopup_xpath));
			saveWebElement1.click();

		} catch (Exception e) {
			return false;
		}
		return false;

	}

	public boolean VerifySuccessMessage(String msg) {
		try {

			WebElement SuccessMessageWebElement = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(SucessMessage_xpath));
			String actual = SuccessMessageWebElement.getText();
			if (actual.equals(msg))
				return true;
			else
				return false;

		} catch (Exception e) {
			return false;
		}
	}

	// rohit

	public boolean vendorsHeader(String HeaderData) {
		try {
			WebElement vendorsHeaderWebEelement = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(vendorsHeader_xpath));
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

	public boolean clickScrubVendors() {
		try {

			WebElement saveWebElement1 = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(clickScrubVendors_xpath));
			saveWebElement1.click();
			return true;

		} catch (Exception e) {
			return false;
		}

	}

	public String VerifyscrubbedMsg(String Message) {

		try {
			WebElement HeaderWebEelement = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(errorMsg_xpath));
			String actualMsgFromAPP = HeaderWebEelement.getText();
			System.out.println(actualMsgFromAPP);
			if (actualMsgFromAPP.contains(Message)) {
				return actualMsgFromAPP;
			}
		} catch (Exception ex) {
		}
		return Message;
	}

	public boolean ClosePopUpVerify() {
		try {

			WebElement closeWebelement = new WebDriverWait(driver, 20)
					.until(ExpectedConditions
							.visibilityOfElementLocated(closePopup_xpath));
			closeWebelement.click();
			Thread.sleep(1000);

			return true;
		}

		catch (Exception ex) {
			return false;
		}

	}

	public boolean clickOnExportLink() {
		try {

			WebElement HeaderWebEelement = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(exportLink_xpath));
			HeaderWebEelement.click();
			Thread.sleep(500);
			return true;
		} catch (Exception ex) {
			return false;

		}

	}

	public boolean exportDownload() {
		try {
			WebElement HeaderWebEelement = new WebDriverWait(driver, 10)
					.until(ExpectedConditions.visibilityOfElementLocated(By
							.xpath("//*[@class='ui_icon']")));
			HeaderWebEelement.click();
			Thread.sleep(500);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public boolean gridColumnShowHide() {
		try {
			WebElement HeaderWebEelement = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(gridColumnShowHide_xpath));
			HeaderWebEelement.click();
			Thread.sleep(2000);

			List<WebElement> list = driver.findElements(By
					.xpath("//*[@id='multi_select_form']//input"));
			for (WebElement e : list) {

				if (e.isSelected()) {
					e.click();
				}
			}

			WebElement element = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(closegrid));

			element.click();

			return true;

		} catch (Exception e) {
			return false;
		}
	}

	public boolean unselectAllCheckboxFromExport() {
		try {
			new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(unselectAllCheckboxFromExport_xpath));

			List<WebElement> list = driver
					.findElements(unselectAllCheckboxFromExport_xpath);
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
							.visibilityOfElementLocated(verifyTheErrorMessage_xpath));
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

	public boolean unSelectGridColumnShowHide() {
		try {
			WebElement HeaderWebEelement = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(gridColumnShowHide_xpath));
			HeaderWebEelement.click();
			Thread.sleep(2000);

			List<WebElement> list = driver.findElements(By
					.xpath("//*[@id='multi_select_form']//input"));
			for (WebElement e : list) {

				e.click();

			}

			WebElement element = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(closegrid));

			element.click();

			return true;

		} catch (Exception e) {
			return false;
		}
	}

	public boolean verifyForwardAndBackwardCarousel() {
		try {
			WebElement firstVendorsPager = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(firstVendorsPager_xpath));

			WebElement prevVendorsPager = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(prevVendorsPager_xpath));

			WebElement lastVendorsPager = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(lastVendorsPager_xpath));

			WebElement nextVendorsPager = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(nextVendorsPager_xpath));

			String s = driver.findElement(vendorsTotalPageCount_xpath)
					.getText().toString();
			int LastPageNum = Integer.parseInt(s);
			System.out.println(LastPageNum + "lastpage");

			int currentPageNum = 1;

			System.out.println(currentPageNum);
			for (int a = 1; a <= LastPageNum; a++) {
				if (a < LastPageNum) {
					nextVendorsPager.click();
					Thread.sleep(1000);
					System.out.println(a);
				} else {
					break;
				}
			}
			Thread.sleep(5000);
			for (int a = LastPageNum; a >= 1; a--) {
				if (a > 1) {
					prevVendorsPager.click();
					Thread.sleep(1000);
					System.out.println("pass");

				} else {
					break;

				}
			}
			lastVendorsPager.click();
			firstVendorsPager.click();

			return true;

		} catch (Exception e) {
			return false;
		}
	}

	public boolean verifyElementIsPresent() {
		try {
			new WebDriverWait(driver, 10).until(
					ExpectedConditions
							.visibilityOfElementLocated(AccountNo_xpath))
					.isDisplayed();
			new WebDriverWait(driver, 10).until(
					ExpectedConditions
							.visibilityOfElementLocated(accountName_xpath))
					.isDisplayed();

			new WebDriverWait(driver, 10).until(
					ExpectedConditions
							.visibilityOfElementLocated(parameterName_xpath))
					.isDisplayed();

			new WebDriverWait(driver, 10).until(
					ExpectedConditions
							.visibilityOfElementLocated(globalAccount_xpath))
					.isDisplayed();

			new WebDriverWait(driver, 10).until(
					ExpectedConditions
							.visibilityOfElementLocated(parentAccount_xpath))
					.isDisplayed();

			new WebDriverWait(driver, 10).until(
					ExpectedConditions
							.visibilityOfElementLocated(createDate_xpath))
					.isDisplayed();

			return true;

		} catch (Exception e) {
			return false;
		}
	}

	public boolean verifyContextMenuList() {
		try {
			List<WebElement> list = driver.findElements(dialogpopup);
			for (WebElement e : list) {
				e.isDisplayed();
				System.out.println(e.getText().toString());
			}

			return true;

		} catch (Exception e) {
			return false;
		}
	}

	public boolean leftclickOnAccount() {
		try {
			WebElement acountNumber = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(accountName1_xpath));
			acountNumber.click();
			Thread.sleep(2000);

			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public boolean clickOnBasicDetails() {
		try {
			WebElement HeaderWebEelement = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(basicDetails_xpath));
			HeaderWebEelement.click();
			Thread.sleep(2000);

			return true;

		} catch (Exception e) {
			return false;
		}
	}

	public boolean clickOnEditBtn() {
		try {
			WebElement HeaderWebEelement = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(editBtn_xpath));
			HeaderWebEelement.click();
			Thread.sleep(2000);

			return true;

		} catch (Exception e) {
			return false;
		}
	}

	public boolean editAccountNo(String accountName) {
		try {
			WebElement HeaderWebEelement = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(editAccountNo_xpath));
			HeaderWebEelement.clear();
			HeaderWebEelement.sendKeys(accountName);
			Thread.sleep(2000);

			return true;

		} catch (Exception e) {
			return false;
		}
	}

	public boolean clickOnSaveBtn() {
		try {
			WebElement HeaderWebEelement = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(saveBtn_xpath));
			HeaderWebEelement.click();
			Thread.sleep(2000);

			return true;

		} catch (Exception e) {
			return false;
		}
	}

	public String VerifyBasicDetailsSucessMessage(String Message) {

		try {
			WebElement HeaderWebEelement = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(successfulMsg_xpath));
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

	public boolean clickOnCancelBasicDetailsBtn() {
		try {
			WebElement HeaderWebEelement = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(crossBasicDeatilsBtn_xpath));
			HeaderWebEelement.click();
			Thread.sleep(2000);

			return true;

		} catch (Exception e) {
			return false;
		}
	}

	public String getTheAccountName() {

		String accountName = "";
		WebElement HeaderWebEelement = new WebDriverWait(driver, 10)
				.until(ExpectedConditions
						.visibilityOfElementLocated(firstAcountName_xpath));
		accountName=HeaderWebEelement.getText().toString();
System.out.println(accountName);
		return accountName;

	}

	public boolean clearAllField() {
		try {

			List<WebElement> list = driver.findElements(clearFiled_xpath);
			for (WebElement e : list) {
				e.clear();
			}
			return true;

		} catch (Exception e) {
			return false;
		}
	}

	public String verifyBasicDetailsErrorMessage(String Message) {

		try {
			WebElement HeaderWebEelement = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(error_massage_xpath));
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

	public boolean enterTheDataAllField(String data1, String data2) {
		try {
			String name = data1;
			List<WebElement> list = driver.findElements(clearFiled_xpath);
			for (WebElement e : list) {
				e.clear();
				e.sendKeys(name);
				name = data2;
			}
			return true;

		} catch (Exception e) {
			return false;
		}
	}

	public boolean vendorParentAccount(String data) {
		try {

			WebElement vendorParent = driver
					.findElement(vendorParentAccount_xpath);
			Select select = new Select(vendorParent);
			select.selectByVisibleText(data);
			return true;

		} catch (Exception e) {
			return false;
		}
	}

	public boolean DoubleClickOnaccountname1() {
		try {

			WebElement element = new WebDriverWait(driver, 100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(accoutnamegridcel2_xpath));
			// Double click
			Actions action = new Actions(driver);
			action.doubleClick(element).build().perform();
			Thread.sleep(200);

			return true;
		} catch (Exception ex) {
			return false;
		}
	}

	public boolean selectParentAccount(String data) {
		try {

			WebElement vendorParent = driver
					.findElement(selectParentAccount_xpath);
			Select select = new Select(vendorParent);
			select.selectByVisibleText(data);
			return true;

		} catch (Exception e) {
			return false;
		}
	}

	public boolean clickOnSaveIconButton() {
		try {

			WebElement element = new WebDriverWait(driver, 100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(saveIcon_xpath));
			// Double click
			Actions action = new Actions(driver);
			action.doubleClick(element).build().perform();
			Thread.sleep(200);

			return true;
		} catch (Exception ex) {
			return false;
		}
	}

	public boolean clickOnPrimaryAddress() {
		try {
			WebElement HeaderWebEelement = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(primaryAddress_xpath));
			HeaderWebEelement.click();
			Thread.sleep(2000);

			return true;

		} catch (Exception e) {
			return false;
		}
	}

	public boolean enterDataPrimaryAddressField(String data1, String data2) {
		try {
			Thread.sleep(1000);
			driver.findElement(primaryContactName_xpath).sendKeys(data1);
			Thread.sleep(500);
			driver.findElement(secondaryContactName_xpath).sendKeys(data2);
			return true;

		} catch (Exception e) {
			return false;
		}
	}

	public boolean clickOnCancelBtn() {
		try {
			WebElement HeaderWebEelement = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(cancelBasicDetailBtn_xpath));
			HeaderWebEelement.click();
			Thread.sleep(2000);

			return true;

		} catch (Exception e) {
			return false;
		}
	}

	public boolean clickOnSecondaryAddress() {
		try {
			WebElement HeaderWebEelement = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(secondaryAddress_xpath));
			HeaderWebEelement.click();
			Thread.sleep(2000);

			return true;

		} catch (Exception e) {
			return false;
		}
	}

	public boolean selectAssignChildrenLink() {
		try {
			WebElement assignchildren = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(assignChildrenLink_xpath));
			assignchildren.click();

			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public boolean editBoxAssignContras(String value) {
		try {
			Thread.sleep(2000);
			WebElement element = new WebDriverWait(driver, 100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(searchChildren_xpath));
			element.clear();
			element.sendKeys(value);

			Thread.sleep(1000);

			WebElement eelement = new WebDriverWait(driver, 100)
					.until(ExpectedConditions.visibilityOfElementLocated(By
							.xpath("//div[contains(@class,'token-input')]")));
			eelement.click();
			// element.submit();
			Thread.sleep(200);

			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public String VerifyAssignChildrenSucessMessage(String Message) {

		try {
			WebElement HeaderWebEelement = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(assignChildrenUpdated_xpath));
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

	public boolean assignChildrenClearAllBtn() {
		try {
			WebElement assignchildren = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(assignChildrenClearAllBtn_xpath));
			assignchildren.click();

			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public boolean assignChildrenSaveBtn() {
		try {
			WebElement assignchildren = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(assignChildrenSaveBtn_xpath));
			assignchildren.click();
			Thread.sleep(2000);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public boolean editBoxAssignChildren(String value) {
		try {
			Thread.sleep(2000);
			WebElement element = new WebDriverWait(driver, 100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(searchChildren_xpath));
			element.clear();
			element.sendKeys(value);

			Thread.sleep(3000);

			new WebDriverWait(driver, 100).until(ExpectedConditions
					.visibilityOfElementLocated(By
							.xpath("//div[contains(@class,'token-input')]")));
			// System.out.println(eelement.getText().toString());
			// element.submit();
			Thread.sleep(200);

			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public String VerifyNoResults(String Message) {
		String textMsg = null;
		try {
			WebElement eelement = new WebDriverWait(driver, 100)
					.until(ExpectedConditions.visibilityOfElementLocated(By
							.xpath("//div[contains(@class,'token-input')]")));
			textMsg = eelement.getText().toString();
			System.out.println(textMsg);
			if (textMsg.equalsIgnoreCase(Message)) {

			}
		} catch (Exception ex) {
		}
		return textMsg;
	}

	public boolean clickAssignContrasLink() {
		try {
			WebElement assignchildren = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(assignContrasLink_xpath));
			assignchildren.click();
			Thread.sleep(1000);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public boolean clickCommentsLink() {
		try {
			WebElement assignchildren = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(assignCommentsLink_xpath));
			assignchildren.click();
			Thread.sleep(2000);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public boolean clickAddCommentButtonLink() {
		try {
			WebElement assignchildren = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(addCommentButton_xpath));
			assignchildren.click();

			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public boolean editCommentSection(String data) {
		try {
			WebElement assignchildren = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(editCommentSection));
			assignchildren.clear();
			assignchildren.sendKeys(data);

			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public boolean saveCommentSection() {
		try {
			WebElement assignchildren = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(saveComment_xpath));
			assignchildren.click();

			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public String verifyCommentSectionNotEditableMessage(String Message) {

		try {
			WebElement HeaderWebEelement = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(notEditableMessage_xpath));
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

	public boolean DoubleClickOnComment() {
		try {

			WebElement element = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(editComment_xpath));
			// Double click
			Actions action = new Actions(driver);
			action.doubleClick(element).build().perform();
			Thread.sleep(200);

			return true;
		} catch (Exception ex) {
			return false;
		}
	}

	public boolean searchAcountNumber(String accountName) {
		try {

			WebElement element = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(searchAccountNumber_xpath));
			element.sendKeys(accountName);
			Thread.sleep(5000);
			return true;
		} catch (Exception ex) {
			return false;
		}
	}

	public boolean clickRefreshIcon() {
		try {

			WebElement element = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(iconrefresh_xpath));
			element.click();

			return true;
		} catch (Exception ex) {
			return false;
		}
	}

	public boolean selectCheckbox() {
		try {

			WebElement element = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(vendorCommentCheckBox_xpath));
			element.click();
			Thread.sleep(1000);
			return true;
		} catch (Exception ex) {
			return false;
		}
	}

	public boolean trashComment() {
		try {

			WebElement element = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(trashComment_xpath));
			element.click();

			return true;
		} catch (Exception ex) {
			return false;
		}
	}

	public boolean deleteComment() {
		try {

			WebElement element = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(deleteComment_xpath));
			element.click();

			return true;
		} catch (Exception ex) {
			return false;
		}
	}

	public boolean dialogTitlebarCloseContras() {
		try {

			WebElement element = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(dialogTitlebarCloseContras_xpath));
			element.click();

			return true;
		} catch (Exception ex) {
			return false;
		}
	}

	public boolean deleteTokenContras() {
		try {

			WebElement element = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(deleteTokenContras_xpath));
			element.click();

			return true;
		} catch (Exception ex) {
			return false;
		}
	}

	public boolean commentTitleBarClose() {
		try {

			WebElement element = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(commentTitleBarClose_xpath));
			element.click();

			return true;
		} catch (Exception ex) {
			return false;
		}
	}

	public boolean commentSectionCancelIcon() {
		try {

			WebElement element = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(commentSectionCancelIcon_xpath));
			element.click();

			return true;
		} catch (Exception ex) {
			return false;
		}
	}

	public boolean searchBoxAssignContras(String value) {
		try {
			Thread.sleep(2000);
			WebElement element = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(searchContras_xpath));
			element.clear();
			element.sendKeys(value);

			Thread.sleep(1000);

			WebElement eelement = new WebDriverWait(driver, 10)
					.until(ExpectedConditions.visibilityOfElementLocated(By
							.xpath("//div[contains(@class,'token-input')]")));
			eelement.click();
			// element.submit();
			Thread.sleep(200);

			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public boolean addVendorButton() {
		try {

			WebElement element = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(addVendorButton_xpath));
			element.click();

			return true;
		} catch (Exception ex) {
			return false;
		}
	}

	public boolean trashVendors() {
		try {

			WebElement element = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(trashVendors_xpath));
			element.click();

			return true;
		} catch (Exception ex) {
			return false;
		}
	}

	public boolean enterDataVendorsDetailsField(String data1, String data2) {
		try {

			Thread.sleep(1000);
			driver.findElement(accountNumberField).sendKeys(data1);
			Thread.sleep(500);
			driver.findElement(accountNameField).sendKeys(data2);
			return true;

		} catch (Exception e) {
			return false;
		}
	}

	public boolean selectVendorsFirstCheckBox() {
		try {

			WebElement element = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(selectVendorsFirstCheckBox_xpath));
			element.click();

			return true;
		} catch (Exception ex) {
			return false;
		}
	}

	public boolean vendorCancelIcon() {
		try {

			WebElement element = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(vendorCancelIcon_xpath));
			element.click();

			return true;
		} catch (Exception ex) {
			return false;
		}
	}
	
	public boolean vendorCancelIcon1() {
		try {

			WebElement element = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(vendorCancelIcon1_xpath));
			element.click();

			return true;
		} catch (Exception ex) {
			return false;
		}
	}
	public boolean fieldValidation(){
		try {
			
         List<WebElement> list = driver.findElements(fieldValidation_xpath);
       
			for(WebElement e:list){
				e.isDisplayed();
			}

			return true;
		} catch (Exception ex) {
			return false;
		}	
	}
}
