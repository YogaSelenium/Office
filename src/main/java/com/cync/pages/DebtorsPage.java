package com.cync.pages;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.SkipException;

import com.cync.base.BasePage;

public class DebtorsPage extends BasePage {
	private final By debtors_xpath = By.xpath("//span[@class='paneltitle']");
	private final By firstAccountNo_xpath = By
			.xpath("(//td[@aria-describedby='customers_list_account_no'])[1]");
	private final By secondAccountNo_xpath = By
			.xpath("(//td[@aria-describedby='customers_list_account_no'])[2]");
	private final By thirdAccountNo_xpath = By
			.xpath("(//td[@aria-describedby='customers_list_account_no'])[3]");
	private final By fourthAccountNo_xpath = By
			.xpath("(//td[@aria-describedby='customers_list_account_no'])[4]");
	private final By fifthAccountNo_xpath = By
			.xpath("(//td[@aria-describedby='customers_list_account_no'])[5]");
	private final By sixthAccountNo_xpath = By
			.xpath("(//td[@aria-describedby='customers_list_account_no'])[6]");
	private final By seventhAccountNo_xpath = By
			.xpath("(//td[@aria-describedby='customers_list_account_no'])[7]");
	private final By eighthAccountNo_xpath = By
			.xpath("(//td[@aria-describedby='customers_list_account_no'])[8]");
	private final By firstAccountName_xpath = By
			.xpath("(//td[@aria-describedby='customers_list_account_name'])[1]");
	private final By secondAccountName_xpath = By
			.xpath("(//td[@aria-describedby='customers_list_account_name'])[2]");
	private final By thirdAccountName_xpath = By
			.xpath("(//td[@aria-describedby='customers_list_account_name'])[3]");
	private final By fourthAccountName_xpath = By
			.xpath("(//td[@aria-describedby='customers_list_account_name'])[4]");
	private final By fifthAccountName_xpath = By
			.xpath("(//td[@aria-describedby='customers_list_account_name'])[5]");
	private final By sixthAccountName_xpath = By
			.xpath("(//td[@aria-describedby='customers_list_account_name'])[6]");
	private final By seventhAccountName_xpath = By
			.xpath("(//td[@aria-describedby='customers_list_account_name'])[7]");
	private final By eighthAccountName_xpath = By
			.xpath("(//td[@aria-describedby='customers_list_account_name'])[8]");
	private final By parameterNameValidation_xpath = By
			.xpath("(//td[@aria-describedby='customers_list_collateral_advance_rate_id'])[1]");
	private final By accountNameSearch_xpath = By
			.xpath("(//input[@name='account_name'])[1]");

	private final By concentrationSearch_xpath = By
			.xpath("(//input[@placeholder='search'])");

	/*
	 * private final By summaryReceivablesBackButton_xpath = By
	 * .xpath("(//a[@style='color:#fff; text-decoration:none']");
	 */
	private final By summaryReceivablesBackButton_xpath = By
			.xpath("//i[@class='glyphicon glyphicon-arrow-left']");

	// //ineligible customer
	private final By Checkbbox_xpath = By
			.xpath("(//input[@type='checkbox'])[7]");
	private final By gridcell_xpath = By
			.xpath("(//td[@aria-describedby='customers_list_ineligibility_reason_id'])[1]");
	private final By Selectineligible_xpath = By
			.xpath("(//select[@name='ineligibility_reason_id'])[2]");
	private final By Save_xpath = By.xpath("//td[@title='Save Record']");
	private final By Close_xpath = By.xpath("//a[text()='Close']");
	private final By Checkbox1_xpath = By
			.xpath("(//input[@type='checkbox'])[14]");
	private final By gridcell1_xpath = By
			.xpath("(//td[@aria-describedby='customers_list_ineligibility_reason_id'])[8]");
	private final By checkbox2_xpath = By
			.xpath("(//input[@type='checkbox'])[24]");
	private final By gridcell2_xpath = By
			.xpath("(//td[@aria-describedby='customers_list_ineligibility_reason_id'])");
	private final By accountname_xpath = By.id("gs_account_name");

	private final By gridcell3_xpath = By
			.xpath("(//td[@aria-describedby='customers_list_account_no'])[1]");
	private final By element3_xpath = By
			.xpath("(//select[@name='collateral_advance_rate_id'])[2]");
	private final By credit_xpath = By.name("credit_limit");
	private final By Credit_xpath = By
			.xpath("(//input[@name='credit_limit'])[2]");

	// exclude reason
	private final By excludeper_xpath = By
			.xpath("//td[@role='gridcell']//input[@name='ar_exclude_pct']");
	// private final By enterpercent_xpath=By.name("ar_exclude_pct");
	private final By entervalue_xpath = By
			.xpath("(//input[@role='textbox'])[20]");

	private final By enterpercent_xpath = By
			.xpath("//td[@role='gridcell']//input[@name='ar_exclude_pct']");
	private final By closethepopUp_xpath = By
			.xpath("//a[@class='fm-button ui-state-default ui-corner-all']");

	// anusha
	private final By IneligibleRegion_xpath = By
			.xpath("//td[@aria-describedby='customers_list_account_name']");
	private final By IneligibleRegionDropDown_xpath = By
			.xpath("(//select[@class='editable inline-edit-cell ui-widget-content ui-corner-all'])[1]");
	private final By entervalue1_xpath = By
			.xpath(" //input[@id='2079647_ar_exclude_value']");

	private final By accoutnamegridcell_xpath = By
			.xpath("//td[@aria-describedby='customers_list_account_name']");
	private final By accoutnamegridcel2_xpath = By
			.xpath("(//td[@aria-describedby='customers_list_account_name'])[1]");

	/* NIDHI CHANGES */

	private final By AccountNo_xpath = By
			.xpath("//div[@id='jqgh_customers_list_account_no']");
	private final By AccountName_xpath = By
			.xpath("//div[@id='jqgh_customers_list_account_name']");
	private final By Concentration_xpath = By
			.xpath("//div[@id='jqgh_customers_list_concentration_pct']");
	private final By CrossAging_xpath = By
			.xpath("//div[@id='jqgh_customers_list_cross_age_pct']");
	private final By ARExclude_xpath = By
			.xpath("//div[@id='jqgh_customers_list_ar_exclude_pct']");
	private final By ARExcludeValue_xpath = By
			.xpath("//div[@id='jqgh_customers_list_ar_exclude_value']");
	private final By InsuranceLimit_xpath = By
			.xpath("//div[@id='jqgh_customers_list_insurance_limit']");
	private final By IneligibleReason_xpath = By
			.xpath("//div[@id='jqgh_customers_list_ineligibility_reason_id']");
	private final By PastDueARDays_xpath = By
			.xpath("//div[@id='jqgh_customers_list_ineligible_days']");
	private final By ParameterName_xpath = By
			.xpath("//div[@id='jqgh_customers_list_collateral_advance_rate_id']");
	private final By ParentName_xpath = By
			.xpath("//div[@id='jqgh_customers_list_parent_account_id']");
	private final By Deductible_xpath = By
			.xpath("//div[@id='jqgh_customers_list_deductible_amount']");
	private final By CreditLimit_xpath = By
			.xpath("//div[@id='jqgh_customers_list_credit_limit'']");
	private final By CreatedDate_xpath = By
			.xpath("//div[@id='jqgh_customers_list_created_at']");
	private final By Comments_xpath = By
			.xpath("//div[@id='jqgh_customers_list_comment_count']");

	private final By AccountNoSearch_xpath = By
			.xpath("(//input[@name='account_no'])[1]");
	private final By AccountNameSearch_xpath = By
			.xpath("(//input[@name='account_name'])[1]");
	private final By ConcentrationSearch_xpath = By
			.xpath("(//input[@name='concentration_pct'])[1]");
	private final By CrossAgingSearch_xpath = By
			.xpath("(//input[@name='cross_age_pct'])[1]");
	private final By ARExcludeSearch_xpath = By
			.xpath("(//input[@name='ar_exclude_pct'])[1]");
	private final By ARExcludeValueSearch_xpath = By
			.xpath("(//input[@name='ar_exclude_value'])[1]");
	private final By InsuranceLimitSearch_xpath = By
			.xpath("(//input[@name='insurance_limit'])[1]");
	private final By IneligibleReasonDropdown_xpath = By
			.xpath("//select[@id='gs_ineligibility_reason_id']");
	private final By PastDueARDaysSearch_xpath = By
			.xpath("(//input[@name='ineligible_days'])[1]");
	private final By ParameterNameDropdown_xpath = By
			.xpath("//select[@id='gs_collateral_advance_rate_id']");
	private final By ParentNameDropdown_xpath = By
			.xpath("//select[@id='gs_parent_account_id']");
	private final By DeductibleSearch_xpath = By
			.xpath("(//input[@name='deductible_amount'])[1]");
	private final By CreditLimitSearch_xpath = By
			.xpath("(//input[@name='credit_limit'])[1]");
	private final By CreatedDateSearch_xpath = By
			.xpath("(//input[@name='created_at'])[1]");
	private final By CommentsSearch_xpath = By
			.xpath("(//input[@name='comment_count'])[1]");
	private final By ScrubDebtors_xpath = By
			.xpath("//a[contains(text(), 'Scrub Debtors')]");

	// rohit

	private final By debtorsHeader_xpath = By
			.xpath("//span[contains(text(),'Debtors')]");
	private final By accountName_xpath = By
			.xpath("(//*[@id='account_name'])[1]");
	private final By assignChildrenLink_xpath = By
			.xpath("//*[@id='dialogPopup']//a[contains(text(),'Assign Children')]");
	private final By childrensearchbox_xpath = By
			.xpath("//*[@class='token-input-list-facebook']//input");
	private final By crossAgingFiled_xpath = By
			.xpath("((//*[@id='account_name'])[2]/../../td)[7]");
	private final By deleteBtn_xpath = By
			.xpath("//*[@class='ui-icon ui-icon-trash']");
	private final By AllNavigationIcon = By
			.xpath("//*[@class='ui-pg-table navtable ui-common-table']//*[contains(@class,'ui-icon ui-icon')]");
	private final By SuccessMessageOfDivisionCreation_xpath = By
			.xpath("//div[@class='ui-state-success']");
	private final By closePopup_xpath = By.id("closedialog");

	private final By cancelBtn_xpath = By
			.xpath("//*[@class='ui-icon ui-icon ui-icon-cancel']");
	private final By AddBtn_xpath = By
			.xpath("//*[@class='ui-icon ui-icon ui-icon-plus']");
	private final By accountNoField_xpath = By
			.xpath("(//*[contains(@id,'account_no') and contains(@role,'textbox')])[2]");
	private final By accountNameField_xpath = By
			.xpath("(//*[contains(@id,'account_name') and contains(@role,'textbox')])[2]");
	private final By concentratiomField_xpath = By
			.xpath("//td[@role='gridcell']//input[@name='concentration_pct']");
	private final By deletepopupBtn_xpath = By.id("dData");
	private final By cancelpopupBtn_xpath = By.id("eData");
	private final By selectDebtorsCheckbox = By
			.xpath("(//input[@type='checkbox'])[10]");
	private final By exportLink_xpath = By
			.xpath("//*[@class='ui-icon ui-icon-extlink']");
	private final By insuranceLimit_xpath = By
			.xpath("(//input[contains(@id,'insurance_limit') and contains(@role,'textbox')])[2]");
	private final By allSelectionCheckbox = By
			.xpath("//*[@id='cb_customers_list']");
	private final By allAccountNumberData = By
			.xpath("//*[contains(@aria-describedby,'customers_list_account_no') and contains(@role,'gridcell')]");
	private final By allAccountNameData = By
			.xpath("//*[contains(@aria-describedby,'customers_list_account_name') and contains(@role,'gridcell')]");
	private final By totalDebotrsCount_xpath = By
			.xpath("//*[@id='customers_pager_right']/div");
	private final By pastDueDateARDays_xpath = By
			.xpath("(//*[contains(@name,'ineligible_days') and contains(@role,'textbox')])[2]");
	private final By parameter_xpath = By
			.xpath("(//*[contains(@aria-describedby,'customers_list_collateral_advance_rate_id') and contains(@role,'gridcell')])[1]");
	private final By errorMsg_xpath = By
			.xpath("//div[@class='ui-state-error']");
	private final By clickAsceendingBtnAccNo = By
			.xpath("//div[@id='jqgh_customers_list_account_no']");
	private final By recordsPerPageDropdown_xpath = By
			.xpath("//select[@class='ui-pg-selbox ui-widget-content ui-corner-all']");
	private final By crossBtn_xpath = By
			.xpath("//*[@class='ui-icon ui-icon ui-icon-cancel']");
	private final By refreshIcon_xpath = By
			.xpath("//*[@class='ui-icon ui-icon-refresh']");
	private final By gridColumnShowHide_xpath = By.id("colomun_choose_action");
	private final By closegrid = By.xpath("//*[@id='done']");
	private final By editBtn_xpath = By.id("detail_parameter_edit");
	private final By basicDetails_xpath = By
			.xpath("//*[@id='dialogPopup']//a[contains(text(),'Basic Details')]");
	private final By editCrossAging_xpath = By
			.xpath("//*[@class='controls']//*[@id='customer_cross_age_pct']");
	private final By saveBtn_xpath = By.id("customer_save_bt");
	private final By successfulMsg_xpath = By
			.xpath("//*[@class='extend_message']");
	private final By cancelBasicDetailBtn_xpath = By.id("user_cancel");
	private final By crossBasicDeatilsBtn_xpath = By
			.xpath("(//button[@class='ui-dialog-titlebar-close'])[2]");
	private final By allFilledText_xpath = By
			.xpath("//*[@class='controls']//input[contains(@type,'text')]");
	private final By changeIneleigibilityReason_xpath = By
			.xpath("(//select[@id='customer_ineligibility_reason_id'])[2]");
	private final By parentDropDown_xpath = By
			.xpath("(//select[@id='customer_parent_account_id'])[2]");
	private final By primaryAddress_xpath = By
			.xpath("//*[@id='dialogPopup']//a[contains(text(),'Primary Address')]");
	private final By Cname_xpath = By
			.xpath("//*[contains(@name,'account_address[company_name]') and contains(@type,'text')]");
	private final By SAddress_xpath = By
			.xpath("//*[contains(@name,'account_address[street_address]') and contains(@type,'text')]");
	private final By otherAddress_xpath = By
			.xpath("//*[contains(@name,'account_address[other_address]') and contains(@type,'text')]");
	private final By accountNumberSearch_xpath = By
			.xpath("//*[@id='account_name']");
	private final By secondaryAddress_xpath = By
			.xpath("//*[@id='dialogPopup']//a[contains(text(),'Secondary Address')]");
	private final By accountParameter_xpath = By
			.xpath("//*[@id='dialogPopup']//a[contains(text(),'Account Parameters')]");
	private final By creditScore_xpath = By
			.xpath("//*[contains(@name,'customer[credit_score]') and contains(@type,'text')]");
	private final By govermentId_xpath = By
			.xpath("//*[contains(@name,'customer[government_id_no]') and contains(@type,'text')]");
	private final By bankAccountNo_xpath = By
			.xpath("//*[contains(@name,'customer[bank_account_no]') and contains(@type,'text')]");
	private final By assignContra_xpath = By
			.xpath("//*[@id='dialogPopup']//a[contains(text(),'Assign Contras')]");
	private final By searchAssignContras_xpath = By
			.id("token-input-drawer_vendor_search_box");
	private final By assignContraUpdated_xpath = By
			.xpath("//*[@id='message_area']/../div[2]");
	private final By deleteAssignContra_xpath = By
			.xpath("//*[@class='token-input-list-facebook']//*[contains(@class,'token-input-delete')]");
	private final By clickOnComments_xpath = By
			.xpath("//*[@id='dialogPopup']//a[contains(text(),'Comments')]");
	private final By editCommentsTextBox_xpath = By
			.xpath("(//*[@name='comment_text'])[2]");
	private final By addCommentBtn_xpath = By
			.xpath("(//*[@class='ui-icon ui-icon ui-icon-plus'])[2]");
	private final By commentSave_xpath = By.xpath("//td[@title='Save Record']");
	private final By doubleClickOnCommentList_xpath = By
			.xpath("//td[contains(@aria-describedby,'comments_list_user_id')]");

	ArrayList<String> addList;

	public DebtorsPage(WebDriver driver) {
		super(driver);

		try {
			Thread.sleep(1000);
		} catch (Exception e) {

			e.printStackTrace();
		}
		if (!driver.findElement(debtors_xpath).getText().trim()
				.equals("Debtors")) {
			throw new SkipException("Debtors page couldn't open.");
		}
	}

	/* NIDHI CHANGES */

	public boolean accountNo_UI() {

		try {
			WebElement debtor = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(AccountNo_xpath));
			WebElement search = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(AccountNoSearch_xpath));
			debtor.isDisplayed();
			search.isDisplayed();
			return true;
		} catch (Exception ex) {
			return false;
		}

	}

	public boolean accountName_UI() {
		try {
			WebElement debtor = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(AccountName_xpath));
			WebElement search = new WebDriverWait(driver, 100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(AccountNameSearch_xpath));
			debtor.isDisplayed();
			search.isDisplayed();
			return true;
		} catch (Exception ex) {
			return false;
		}

	}

	public boolean concentration_UI() {
		try {
			WebElement debtor = new WebDriverWait(driver, 100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(Concentration_xpath));
			WebElement search = new WebDriverWait(driver, 100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(ConcentrationSearch_xpath));
			debtor.isDisplayed();
			search.isDisplayed();
			return true;
		} catch (Exception ex) {
			return false;
		}
	}

	public boolean crossAging_UI() {
		try {
			WebElement debtor = new WebDriverWait(driver, 100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(CrossAging_xpath));
			WebElement search = new WebDriverWait(driver, 100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(CrossAgingSearch_xpath));
			debtor.isDisplayed();
			search.isDisplayed();
			return true;
		} catch (Exception ex) {
			return false;
		}
	}

	public boolean ARExclude_UI() {
		try {
			WebElement debtor = new WebDriverWait(driver, 100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(ARExclude_xpath));
			WebElement search = new WebDriverWait(driver, 100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(ARExcludeSearch_xpath));
			debtor.isDisplayed();
			search.isDisplayed();
			return true;
		} catch (Exception ex) {
			return false;
		}
	}

	public boolean ARExcludeValue_UI() {
		try {
			WebElement debtor = new WebDriverWait(driver, 100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(ARExcludeValue_xpath));
			WebElement search = new WebDriverWait(driver, 100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(ARExcludeValueSearch_xpath));
			debtor.isDisplayed();
			search.isDisplayed();
			return true;
		} catch (Exception ex) {
			return false;
		}
	}

	public boolean IneligibleReason_UI() {
		try {
			WebElement debtor = new WebDriverWait(driver, 100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(IneligibleReason_xpath));
			debtor.isDisplayed();
			WebElement dropdown = new WebDriverWait(driver, 100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(IneligibleReasonDropdown_xpath));
			Select sel = new Select(dropdown);

			List<WebElement> list = sel.getOptions();
			for (WebElement ele : list) {
				String data = ele.getText();
				System.out.println(data);

			}
			return true;
		} catch (Exception ex) {
			return true;
		}

	}

	public boolean InsuranceLimit_UI() {
		try {
			WebElement debtor = new WebDriverWait(driver, 100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(InsuranceLimit_xpath));
			WebElement search = new WebDriverWait(driver, 100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(InsuranceLimitSearch_xpath));
			debtor.isDisplayed();
			search.isDisplayed();
			return true;
		} catch (Exception ex) {
			return false;
		}
	}

	public boolean PastDueARDays_UI() {
		try {
			WebElement debtor = new WebDriverWait(driver, 100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(PastDueARDays_xpath));
			WebElement search = new WebDriverWait(driver, 100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(PastDueARDaysSearch_xpath));
			debtor.isDisplayed();
			search.isDisplayed();
			return true;
		} catch (Exception ex) {
			return false;
		}
	}

	public boolean ParameterName_UI() {
		try {
			WebElement debtor = new WebDriverWait(driver, 100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(ParameterName_xpath));
			debtor.isDisplayed();
			WebElement dropdown = new WebDriverWait(driver, 100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(ParameterNameDropdown_xpath));
			Select sel = new Select(dropdown);

			List<WebElement> list = sel.getOptions();
			for (WebElement ele : list) {
				String data = ele.getText();
				System.out.println(data);

			}
			return true;
		} catch (Exception ex) {
			return true;
		}

	}

	public boolean ParentName_UI() {
		try {
			WebElement debtor = new WebDriverWait(driver, 100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(ParentName_xpath));
			debtor.isDisplayed();
			WebElement dropdown = new WebDriverWait(driver, 100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(ParentNameDropdown_xpath));
			Select sel = new Select(dropdown);

			List<WebElement> list = sel.getOptions();
			for (WebElement ele : list) {
				String data = ele.getText();
				System.out.println(data);

			}
			return true;
		} catch (Exception ex) {
			return true;
		}

	}

	public boolean Deductible_UI() {
		try {
			WebElement debtor = new WebDriverWait(driver, 100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(Deductible_xpath));
			WebElement search = new WebDriverWait(driver, 100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(DeductibleSearch_xpath));
			debtor.isDisplayed();
			search.isDisplayed();
			return true;
		} catch (Exception ex) {
			return false;
		}
	}

	public boolean CreditLimit_UI() {
		try {
			WebElement debtor = new WebDriverWait(driver, 100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(CreditLimit_xpath));
			WebElement search = new WebDriverWait(driver, 100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(CreditLimitSearch_xpath));
			debtor.isDisplayed();
			search.isDisplayed();
			return true;
		} catch (Exception ex) {
			return false;
		}
	}

	public boolean CreatedDate_UI() {
		try {
			WebElement debtor = new WebDriverWait(driver, 100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(CreatedDate_xpath));
			WebElement search = new WebDriverWait(driver, 100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(CreatedDateSearch_xpath));
			debtor.isDisplayed();
			search.isDisplayed();
			return true;
		} catch (Exception ex) {
			return false;
		}
	}

	public boolean Comments_UI() {
		try {
			WebElement debtor = new WebDriverWait(driver, 100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(Comments_xpath));
			WebElement search = new WebDriverWait(driver, 100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(CommentsSearch_xpath));
			debtor.isDisplayed();
			search.isDisplayed();
			return true;
		} catch (Exception ex) {
			return false;
		}
	}

	public boolean Click_on_accountname(String accntname) {
		try {
			WebElement HeaderWebEelement = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(accountname_xpath));
			HeaderWebEelement.click();
			HeaderWebEelement.clear();
			HeaderWebEelement.sendKeys(accntname);

			Thread.sleep(1000);
			return true;
		} catch (Exception ex) {
			return false;

		}
	}

	public boolean Click_on_accountname1(String accntname1) {
		try {
			WebElement HeaderWebEelement = new WebDriverWait(driver, 100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(accountname_xpath));
			HeaderWebEelement.click();
			HeaderWebEelement.clear();
			HeaderWebEelement.sendKeys(accntname1);

			Thread.sleep(1000);
			return true;
		} catch (Exception ex) {
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

	public boolean enterarexcludeper(String percent)

	{
		try {

			WebElement pastdueardaysInputWebEelement = new WebDriverWait(
					driver, 5).until(ExpectedConditions
					.visibilityOfElementLocated(enterpercent_xpath));
			pastdueardaysInputWebEelement.click();
			pastdueardaysInputWebEelement.clear();
			pastdueardaysInputWebEelement.sendKeys(percent);
			Thread.sleep(200);

			return true;
		} catch (Exception ex) {
			return false;
		}
	}

	public boolean enterarexcludeper1(String percent1) {
		try {

			WebElement pastdueardaysInputWebEelement = new WebDriverWait(
					driver, 5).until(ExpectedConditions
					.visibilityOfElementLocated(excludeper_xpath));
			pastdueardaysInputWebEelement.click();
			pastdueardaysInputWebEelement.clear();
			pastdueardaysInputWebEelement.sendKeys(percent1);
			Thread.sleep(200);

			return true;
		} catch (Exception ex) {
			return false;
		}
	}

	public boolean enterarexcludevalue1(String values) {
		try {

			WebElement pastdueardaysInputWebEelement = new WebDriverWait(
					driver, 5).until(ExpectedConditions
					.visibilityOfElementLocated(entervalue_xpath));
			pastdueardaysInputWebEelement.click();
			pastdueardaysInputWebEelement.clear();
			pastdueardaysInputWebEelement.sendKeys(values);
			Thread.sleep(200);

			return true;
		} catch (Exception ex) {
			return false;
		}
	}

	public boolean enterarexcludevalue(String values) {
		try {

			WebElement pastdueardaysInputWebEelement = new WebDriverWait(
					driver, 5).until(ExpectedConditions
					.visibilityOfElementLocated(entervalue_xpath));
			pastdueardaysInputWebEelement.click();
			pastdueardaysInputWebEelement.clear();
			pastdueardaysInputWebEelement.sendKeys(values);
			Thread.sleep(200);

			return true;
		} catch (Exception ex) {
			return false;
		}
	}

	public boolean DoubleClickOncreditlimit() {
		try {

			WebElement element = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(gridcell3_xpath));
			// Double click
			Actions action = new Actions(driver);
			action.doubleClick(element).build().perform();
			Thread.sleep(200);

			return true;
		} catch (Exception ex) {
			return false;
		}
	}

	public boolean tabOnPastDurA() {
		try {
			WebElement clickoncolletralsearch = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(element3_xpath));
			clickoncolletralsearch.click();
			Actions action = new Actions(driver);
			action.sendKeys(Keys.TAB).build().perform();
			Actions action1 = new Actions(driver);
			action1.sendKeys(Keys.TAB).build().perform();
			Thread.sleep(300);
			return true;
		} catch (Exception ex) {
			return false;
		}
	}

	public String entercreditlimit(String credit) {
		try {

			WebElement pastdueardaysInputWebEelement = new WebDriverWait(
					driver, 10).until(ExpectedConditions
					.visibilityOfElementLocated(Credit_xpath));
			pastdueardaysInputWebEelement.click();
			pastdueardaysInputWebEelement.clear();
			pastdueardaysInputWebEelement.sendKeys(credit);
			Thread.sleep(200);

		} catch (Exception ex) {

		}
		return credit;
	}

	public boolean firstAccountNoValidation(String expected) {
		try {
			Thread.sleep(200);
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

	public boolean DoubleClickOnArexclude() {
		try {

			WebElement element = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(excludeper_xpath));
			// Double click
			Actions action = new Actions(driver);
			action.doubleClick(element).build().perform();
			Thread.sleep(1000);

			return true;
		} catch (Exception ex) {
			return false;
		}
	}

	public boolean enterArPer(String percent) {
		try {

			WebElement trendnWebEelement = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(enterpercent_xpath));
			trendnWebEelement.clear();
			trendnWebEelement.sendKeys(percent);
			return true;
		} catch (Exception ex) {
			return false;
		}
	}

	public boolean enterArvalue(String value) {
		try {

			WebElement trendnWebEelement = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(entervalue_xpath));
			trendnWebEelement.clear();
			trendnWebEelement.sendKeys(value);
			return true;
		} catch (Exception ex) {
			return false;
		}
	}

	public boolean DoubleClickOnineligible1() {
		try {

			WebElement element = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(gridcell1_xpath));
			// Double click
			Actions action = new Actions(driver);
			action.doubleClick(element).build().perform();
			Thread.sleep(200);
			return true;
		} catch (Exception ex) {
			return false;
		}
	}

	public boolean DoubleClickOnineligible2() {
		try {

			WebElement element = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(gridcell2_xpath));
			// Double click
			Actions action = new Actions(driver);
			action.doubleClick(element).build().perform();
			Thread.sleep(200);

			return true;
		} catch (Exception ex) {
			return false;
		}
	}

	public boolean Click_on_checkbox() {
		try {
			WebElement HeaderWebEelement = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(Checkbbox_xpath));
			HeaderWebEelement.click();
			Thread.sleep(500);
			return true;
		} catch (Exception ex) {
			return false;

		}

	}

	public boolean Click_on_checkbox1() {
		try {
			WebElement HeaderWebEelement = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(Checkbox1_xpath));
			HeaderWebEelement.click();
			Thread.sleep(500);
			return true;
		} catch (Exception ex) {
			return false;

		}

	}

	public boolean Click_on_checkbox2() {
		try {
			WebElement HeaderWebEelement = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(checkbox2_xpath));
			HeaderWebEelement.click();
			Thread.sleep(1000);
			return true;
		} catch (Exception ex) {
			return false;

		}

	}

	public boolean Click_on_Save() {
		try {
			WebElement HeaderWebEelement = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(Save_xpath));
			HeaderWebEelement.click();
			Thread.sleep(200);
			return true;
		} catch (Exception ex) {
			return false;

		}
	}

	public boolean closeThePopUp() {
		try {
			WebElement HeaderWebEelement = new WebDriverWait(driver, 100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(closethepopUp_xpath));
			HeaderWebEelement.click();
			Thread.sleep(5000);
			return true;
		} catch (Exception ex) {
			return false;

		}
	}

	public boolean Click_on_close() {
		try {
			WebElement HeaderWebEelement = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(Close_xpath));
			HeaderWebEelement.click();
			Thread.sleep(500);
			return true;
		} catch (Exception ex) {
			return false;

		}

	}

	public boolean DoubleClickOnineligible() {
		try {

			WebElement element = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(gridcell_xpath));
			// Double click
			Actions action = new Actions(driver);
			action.doubleClick(element).build().perform();
			Thread.sleep(1000);

			return true;
		} catch (Exception ex) {
			return false;
		}
	}

	public boolean SelectFromCurrentamountDrsopdown(String visibleTexts)
			throws InterruptedException {

		try {
			WebElement DropdownWebEelements1 = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(Selectineligible_xpath));
			DropdownWebEelements1.click();
			Select sel = new Select(DropdownWebEelements1);
			sel.selectByVisibleText(visibleTexts);

			/*
			 * List<WebElement> list = sel.getOptions();
			 * 
			 * for (WebElement ele : list) { String data = ele.getText();
			 * 
			 * if (ele.getText().equals(visibleTexts)) { ele.click();
			 * 
			 * break; } }
			 */return true;
		} catch (Exception ex) {

		}

		return false;
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

	public boolean fifthAccountNoValidation(String expected) {
		try {
			WebElement fifthAccountNoWebElement = new WebDriverWait(driver, 10)
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
			WebElement sixthAccountNoWebElement = new WebDriverWait(driver, 10)
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
					10).until(ExpectedConditions
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
			WebElement eighthAccountNoWebElement = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
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
			Thread.sleep(2000);
			return true;

		} catch (Exception e) {
			return false;
		}

	}

	public boolean doubleClickConcentrationSearch() {
		try {
			WebElement concentrationSearchWebElement = new WebDriverWait(
					driver, 10).until(ExpectedConditions
					.visibilityOfElementLocated(concentrationSearch_xpath));
			Actions action = new Actions(driver);
			action.doubleClick(concentrationSearchWebElement).perform();

			Thread.sleep(1000);
			return true;

		} catch (Exception e) {
			return false;
		}

	}

	public boolean SummaryReceivalesBackButtonClicked() {
		try {
			WebElement SummaryReceivablesWebElement = new WebDriverWait(driver,
					10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(summaryReceivablesBackButton_xpath));

			SummaryReceivablesWebElement.isDisplayed();

			return true;

		} catch (Exception e) {
			return false;
		}
	}

	public boolean SummaryReceivalesButtonClicked() {
		try {
			WebElement summaryreceivablesWebElement = new WebDriverWait(driver,
					10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(summaryReceivablesBackButton_xpath));

			summaryreceivablesWebElement.click();

			return true;

		} catch (Exception e) {
			return false;
		}
	}

	public boolean DoubleClickOnIneligleReason() {
		try {

			WebElement element = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(IneligibleRegion_xpath));
			// Double click
			Actions action = new Actions(driver);
			action.doubleClick(element).build().perform();
			Thread.sleep(2000);

			return true;
		}

		catch (Exception ex) {
			return false;
		}
	}

	public boolean SelectfromIneligibleRegion(String input4) {
		try {
			WebElement DebtorNumerator = new WebDriverWait(driver, 100)
					.until(ExpectedConditions
							.elementToBeClickable(IneligibleRegionDropDown_xpath));
			JavascriptExecutor jse1 = (JavascriptExecutor) driver;
			;
			jse1.executeScript("arguments[0].scrollIntoView(true);",
					DebtorNumerator);
			DebtorNumerator.click();
			Select sel = new Select(DebtorNumerator);
			List<WebElement> list = sel.getOptions();
			for (WebElement ele : list) {
				if (ele.getText().equals(input4)) {
					ele.click();
					// Thread.sleep(5000);
					break;
				}
			}
			return true;
		} catch (Exception ex) {
		}
		return false;
	}

	// rohit Debtors New Testcases
	public boolean debtorsHeader(String HeaderData) {
		try {
			WebElement debtorsHeaderWebEelement = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(debtorsHeader_xpath));
			String data = debtorsHeaderWebEelement.getText().trim();
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

	public boolean leftclickInAccount() {
		try {
			WebElement acountNumber = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(accountName_xpath));
			acountNumber.click();
			Thread.sleep(2000);

			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public boolean enterText(String assignchildren) {
		try {

			WebElement enterText = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(childrensearchbox_xpath));
			enterText.sendKeys(assignchildren);

			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public boolean doubleClickAndEnterData(String valueEnter) {
		try {

			WebElement doulbeClickAndenter = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(crossAgingFiled_xpath));
			Actions action = new Actions(driver);
			action.doubleClick(doulbeClickAndenter);

			doulbeClickAndenter.clear();
			doulbeClickAndenter.sendKeys(valueEnter);

			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public boolean deleteBtn() {
		try {

			WebElement deleteBtn = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(deleteBtn_xpath));
			deleteBtn.click();
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public boolean verifyUIField() {
		try {

			new WebDriverWait(driver, 10).until(ExpectedConditions
					.visibilityOfElementLocated(AllNavigationIcon));

			List<WebElement> list = driver.findElements(AllNavigationIcon);
			for (WebElement l : list) {
				l.isDisplayed();
			}

			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public String VerifyTheSucessMessage(String Message) {

		try {
			WebElement HeaderWebEelement = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(SuccessMessageOfDivisionCreation_xpath));
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

	public boolean cancelBtn() {
		try {

			WebElement closeWebelement = new WebDriverWait(driver, 20)
					.until(ExpectedConditions
							.visibilityOfElementLocated(cancelBtn_xpath));
			closeWebelement.click();
			Thread.sleep(1000);

			return true;
		}

		catch (Exception ex) {
			return false;
		}

	}

	public boolean addBtn1()

	{
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

	/*
	 * public boolean cancelBtn() { try{
	 * 
	 * WebElement closeWebelement=new WebDriverWait(driver,20)
	 * .until(ExpectedConditions.visibilityOfElementLocated(cancelBtn_xpath));
	 * closeWebelement.click(); Thread.sleep(1000);
	 * 
	 * return true; }
	 * 
	 * 
	 * catch(Exception ex){ return false; }
	 * 
	 * }
	 */

	public boolean addBtn() {
		try {

			WebElement closeWebelement = new WebDriverWait(driver, 20)
					.until(ExpectedConditions
							.visibilityOfElementLocated(AddBtn_xpath));
			closeWebelement.click();
			Thread.sleep(1000);

			return true;
		}

		catch (Exception ex) {
			return false;
		}

	}

	public boolean accountNoField(String accountNo) {
		try {

			WebElement closeWebelement = new WebDriverWait(driver, 20)
					.until(ExpectedConditions
							.visibilityOfElementLocated(accountNoField_xpath));
			closeWebelement.sendKeys(accountNo);
			Thread.sleep(1000);

			return true;
		}

		catch (Exception ex) {
			return false;
		}

	}

	public boolean accountNameField(String accountNo) {
		try {

			WebElement closeWebelement = new WebDriverWait(driver, 20)
					.until(ExpectedConditions
							.visibilityOfElementLocated(accountNameField_xpath));
			closeWebelement.sendKeys(accountNo);
			Thread.sleep(1000);

			return true;
		}

		catch (Exception ex) {
			return false;
		}
	}

	public boolean concentrationField(String percent) {
		try {

			WebElement pastdueardaysInputWebEelement = new WebDriverWait(
					driver, 5).until(ExpectedConditions
					.visibilityOfElementLocated(concentratiomField_xpath));
			pastdueardaysInputWebEelement.click();
			pastdueardaysInputWebEelement.clear();
			pastdueardaysInputWebEelement.sendKeys(percent);
			Thread.sleep(200);

			return true;
		} catch (Exception ex) {
			return false;
		}

	}

	public boolean deletepopupBtn() {
		try {

			WebElement deleteBtn = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(deletepopupBtn_xpath));
			deleteBtn.click();
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public boolean cancelpopupBtn() {
		try {

			WebElement deleteBtn = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(cancelpopupBtn_xpath));
			deleteBtn.click();
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public boolean selectDebtorscheckbox() {
		try {

			WebElement HeaderWebEelement1 = new WebDriverWait(driver, 10)
					.until(ExpectedConditions.visibilityOfElementLocated(By
							.xpath("//*[@id='next_customers_pager']/span")));
			HeaderWebEelement1.click();
			Thread.sleep(500);

			WebElement HeaderWebEelement = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(selectDebtorsCheckbox));
			HeaderWebEelement.click();
			Thread.sleep(500);
			return true;
		} catch (Exception ex) {
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

	public boolean insuranceLimitField(String percent) {
		try {

			WebElement pastdueardaysInputWebEelement = new WebDriverWait(
					driver, 10).until(ExpectedConditions
					.visibilityOfElementLocated(insuranceLimit_xpath));
			pastdueardaysInputWebEelement.click();
			pastdueardaysInputWebEelement.clear();
			pastdueardaysInputWebEelement.sendKeys(percent);
			Thread.sleep(200);

			return true;
		} catch (Exception ex) {
			return false;
		}

	}

	public boolean allSelectionCheckbox() {
		try {
			WebElement HeaderWebEelement = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(allSelectionCheckbox));
			HeaderWebEelement.click();
			Thread.sleep(500);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public boolean verifyTwoVeriables(String str1, String str2) {
		if (str1.equalsIgnoreCase(str2)) {
			return true;
		} else
			return false;
	}

	public String verifyTotalNumberOfCount() {
		try {

			WebElement element = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(totalDebotrsCount_xpath));

			String str = element.getText();

			return str;
		} catch (Exception ex) {
			return null;
		}

	}

	public boolean pastDueDateARDaysField(String pastDueDateARDays) {
		try {

			WebElement pastdueardaysInputWebEelement = new WebDriverWait(
					driver, 10).until(ExpectedConditions
					.visibilityOfElementLocated(pastDueDateARDays_xpath));
			pastdueardaysInputWebEelement.click();
			pastdueardaysInputWebEelement.clear();
			pastdueardaysInputWebEelement.sendKeys(pastDueDateARDays);
			Thread.sleep(200);

			return true;
		} catch (Exception ex) {
			return false;
		}

	}

	public boolean verifyParameter(String parameter) {
		try {

			WebElement element = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(parameter_xpath));
			Thread.sleep(200);
			String str = element.getText().toString();
			if (str.equalsIgnoreCase(parameter)) {
				return true;
			} else
				return false;
		} catch (Exception ex) {
			return false;
		}

	}

	public String VerifyTheErrorMessage(String Message) {

		try {
			WebElement HeaderWebEelement = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(errorMsg_xpath));
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

	public boolean ScrubDebtorsBtn() {
		try {
			WebElement HeaderWebEelement = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(ScrubDebtors_xpath));
			HeaderWebEelement.click();
			Thread.sleep(500);
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

	public boolean clickOnAccountandVerifyAscendingAndDescendingOrder() {
		try {

			List<WebElement> list = driver.findElements(allAccountNumberData);
			List<String> mainList = new ArrayList<String>();
			for (WebElement G : list) {
				mainList.add(G.getText().toString());
			}

			WebElement closeWebelement = new WebDriverWait(driver, 20)
					.until(ExpectedConditions
							.visibilityOfElementLocated(clickAsceendingBtnAccNo));
			closeWebelement.click();

			Thread.sleep(5000);

			closeWebelement.click();

			List<WebElement> list2 = driver.findElements(allAccountNumberData);
			TreeSet<String> mainList2 = new TreeSet<String>();
			for (WebElement G : list2) {
				mainList2.add(G.getText().toString());
			}

			if (mainList.containsAll(mainList2)) {
				System.out.println("pass");
				return true;
			} else {
				Assert.fail();
			}
			return true;
		}

		catch (Exception ex) {
			return false;
		}
	}

	public boolean selectRecordsPerPageDropDown(String value) {
		try {
			WebElement HeaderWebEelement = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(recordsPerPageDropdown_xpath));
			Select s = new Select(HeaderWebEelement);
			s.selectByValue(value);
			Thread.sleep(2000);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public boolean clickOnAccountNameandVerifyAscendingAndDescendingOrder() {
		try {

			WebElement closeWebelement = new WebDriverWait(driver, 20)
					.until(ExpectedConditions
							.visibilityOfElementLocated(clickAsceendingBtnAccNo));
			closeWebelement.click();
			Thread.sleep(5000);

			List<WebElement> list = driver.findElements(allAccountNameData);
			List<String> mainList = new ArrayList<String>();
			for (WebElement G : list) {
				mainList.add(G.getText().toString());
			}

			closeWebelement.click();
			Thread.sleep(5000);

			List<WebElement> list2 = driver.findElements(allAccountNameData);
			TreeSet<String> mainList2 = new TreeSet<String>();
			for (WebElement G : list2) {
				mainList2.add(G.getText().toString());
			}

			if (mainList.containsAll(mainList2)) {
				return true;
			} else {
				Assert.fail();
			}
			return true;
		}

		catch (Exception ex) {
			return false;
		}

	}

	public boolean refreshIcon() {
		try {
			WebElement HeaderWebEelement = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(refreshIcon_xpath));
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

	public boolean exportCheckboxs() {
		try {
			Thread.sleep(1000);
			List<WebElement> list = driver.findElements(By
					.xpath("//*[@class='box-content']//input"));
			for (WebElement e : list) {
				if (e.isSelected()) {
					e.click();
				}
			}
			driver.findElement(By.xpath("//*[@class='box-content']//input"))
					.click();
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	public boolean exportCheckboxs1() {
		try {
			Thread.sleep(1000);
			List<WebElement> list = driver.findElements(By
					.xpath("//*[@class='box-content']//input"));
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
	
	public boolean textISDisplayinDialog() {
		try {
			Thread.sleep(1000);

			addList = new ArrayList<String>();
			List<WebElement> list = driver.findElements(By
					.xpath("//*[@id='dialogPopup']//a"));
			for (WebElement e : list) {
				System.out.println(e.getText().toString());
				addList.add(e.getText().toString());
			}

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

	public boolean editCrossAgingPercentage(String value) {
		try {
			WebElement pastdueardaysInputWebEelement = new WebDriverWait(
					driver, 100).until(ExpectedConditions
					.visibilityOfElementLocated(editCrossAging_xpath));
			pastdueardaysInputWebEelement.clear();
			pastdueardaysInputWebEelement.sendKeys(value);
			Thread.sleep(200);
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

	public boolean clearAllFieldsOfBsicDetails() {
		try {

			int i = driver.findElements(allFilledText_xpath).size();
			System.out.println(i);
			for (int count = 3; count <= i; count++) {
				String xpath = "(//*[@class='controls']//input[contains(@type,'text')])"
						+ "[" + count + "]";
				By clearAllFilledText_xpath = By.xpath(xpath);

				WebElement HeaderWebEelement = new WebDriverWait(driver, 10)
						.until(ExpectedConditions
								.visibilityOfElementLocated(clearAllFilledText_xpath));
				HeaderWebEelement.clear();
				Thread.sleep(300);
			}
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

	public boolean clickAccountParameter() {
		try {
			WebElement HeaderWebEelement = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(accountParameter_xpath));
			HeaderWebEelement.click();
			Thread.sleep(2000);

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
							.visibilityOfElementLocated(searchAssignContras_xpath));
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

	public String VerifyAssignContraSucessMessage(String Message) {

		try {
			WebElement HeaderWebEelement = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(assignContraUpdated_xpath));
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

	public boolean deleteAssignContras() {
		try {
			WebElement HeaderWebEelement = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(deleteAssignContra_xpath));
			HeaderWebEelement.click();
			Thread.sleep(2000);

			return true;

		} catch (Exception e) {
			return false;
		}
	}

	public boolean clickOnComments() {
		try {
			WebElement HeaderWebEelement = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(clickOnComments_xpath));
			HeaderWebEelement.click();
			Thread.sleep(4000);

			return true;

		} catch (Exception e) {
			return false;
		}

	}

	public boolean crossBtn() {
		try {
			WebElement HeaderWebEelement = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(crossBtn_xpath));
			HeaderWebEelement.click();
			Thread.sleep(500);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public boolean VerifyTextIsPresent(String str) {
		try {
			
			addList.contains(str);
			System.out.println("present");
			//Thread.sleep(2000);
	
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

	public boolean selectOtherOptions(String value) {

		try {
			WebElement element = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(changeIneleigibilityReason_xpath));
			Select s = new Select(element);

			s.selectByVisibleText(value);
			return true;
		} catch (Exception ex) {
		}
		return false;
	}

	public boolean selectParentOptionsInDropDown(String value) {

		try {
			WebElement element = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(parentDropDown_xpath));
			Select s = new Select(element);

			s.selectByVisibleText(value);
			return true;
		} catch (Exception ex) {
		}
		return false;
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

	public boolean enterPrimaryAddressDetails(String Cname,
			String streetAddress, String contactno) {

		try {
			WebElement element = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(Cname_xpath));
			element.clear();
			element.sendKeys(Cname);

			element = new WebDriverWait(driver, 10).until(ExpectedConditions
					.visibilityOfElementLocated(SAddress_xpath));
			element.clear();
			element.sendKeys(streetAddress);

			element = new WebDriverWait(driver, 10).until(ExpectedConditions
					.visibilityOfElementLocated(otherAddress_xpath));
			element.clear();
			element.sendKeys(contactno);
			return true;
		} catch (Exception ex) {
		}
		return false;
	}

	public String VerifyAbleToSearchAccountName(String Message) {

		try {
			WebElement HeaderWebEelement = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(accountNumberSearch_xpath));
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

	public boolean acountParameterDetails(String CScore, String govermentID,
			String bankAccountNo) {

		try {
			WebElement element = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(creditScore_xpath));
			element.sendKeys(CScore);

			element = new WebDriverWait(driver, 10).until(ExpectedConditions
					.visibilityOfElementLocated(govermentId_xpath));
			element.sendKeys(govermentID);

			element = new WebDriverWait(driver, 10).until(ExpectedConditions
					.visibilityOfElementLocated(bankAccountNo_xpath));
			element.sendKeys(bankAccountNo);
			return true;
		} catch (Exception ex) {
		}
		return false;
	}

	public boolean clickAssignContras() {
		try {
			WebElement HeaderWebEelement = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(assignContra_xpath));
			HeaderWebEelement.click();
			Thread.sleep(2000);

			return true;

		} catch (Exception e) {
			return false;
		}
	}

	public boolean editCommentsTextBox(String value) {
		try {

			WebElement element = new WebDriverWait(driver, 100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(editCommentsTextBox_xpath));
			element.clear();
			element.sendKeys(value);
			//Thread.sleep(2000);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public boolean addCommentBtn() {
		try {

			WebElement closeWebelement = new WebDriverWait(driver, 20)
					.until(ExpectedConditions
							.visibilityOfElementLocated(addCommentBtn_xpath));
			closeWebelement.click();
			//Thread.sleep(1000);

			return true;
		}

		catch (Exception ex) {
			return false;
		}

	}

	public boolean clickonCommentSaveBtn() {
		try {
			Thread.sleep(2000);
			WebElement HeaderWebEelement = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(commentSave_xpath));
			HeaderWebEelement.click();
			Thread.sleep(200);
			return true;
		} catch (Exception ex) {
			return false;

		}
	}

	public boolean doubleClickOnCommentList() {
		try {

			WebElement element = new WebDriverWait(driver, 100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(doubleClickOnCommentList_xpath));
			// Double click
			Actions action = new Actions(driver);
			action.doubleClick(element).build().perform();
			Thread.sleep(500);

			return true;
		} catch (Exception ex) {
			return false;
		}
	}
}
