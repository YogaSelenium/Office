package com.cync.pages;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.cync.base.BasePage;

public class Contra extends BasePage {

	public Contra(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub

	}

	private final By selectAllValues_xpath = By
			.xpath("//button[@class='moveall arrow-btnstyle']");
	private final By saveOnIneligibleReasons_xpath = By
			.id("apply_calculations");
	private final By unselectAllValues_xpath = By
			.xpath("//button[@class='removeall arrow-btnstyle']");
	private final By selecttContra_xpath = By
			.xpath("(//option[contains(text(),'Contra')])[1]");
	private final By finalContra_xpath = By
			.xpath("//button[@class='move arrow-btnstyle']");
	private final By BBCRecalculationProcess_xpath = By
			.xpath("//a[contains(text(),'BBC Recalculation Process')]");
	private final By menuItem_xpath = By.id("top-menu");
	private final By Contras_xpath = By
			.xpath("(//a[contains(text(),'Contras')])[1]");
	private final By Addcustomer_xpath = By
			.xpath("//span[@class='ui-icon ui-icon ui-icon-plus']");
	private final By CustomerTextbox_xpath = By.id("jqg1_customer_name");
	private final By selectingCustomer_xpath = By
			.xpath("(//li[@class='ui-menu-item'])[1]");
	private final By VendorTextbox_xpath = By.id("jqg1_vendor_name");
	private final By selectingVendor_xpath = By
			.xpath("(//li[@class='ui-menu-item'])[2]");
	private final By saveOnContras_Xpath = By
			.xpath("//span[@class='ui-icon ui-icon ui-icon-disk']");
	private final By CloseOnPopUp_Xpath = By.id("closedialog");
	private final By BBCRecalculationProcessButton_xpath = By
			.xpath("//a[contains(text(),'Process/Re-Calculate BBC')]");
	private final By ReceivableAging_xpath = By
			.xpath("//a[contains(text(),'Receivable Aging')]");
	private final By Contra_ReceivableAgingReason_Xpath = By
			.xpath("//td[contains(text(),'Contra')]");
	private final By Contra_ReceivableAgingAmount_Xpath = By
			.xpath("(//td[contains(text(),'6,250.00')])[1]");
	private final By BBCAvailability_xpath = By
			.xpath("(//a[contains(text(),'BBC Availability')])[1]");
	private final By clickOnPlusBBCAvailability_Xpath = By
			.xpath("(//i[@class='icon-plus'])[2]");
	private final By Contra_BBCAvailabilityReason_Xpath = By
			.xpath("//td[contains(text(),'Contra')]");
	private final By Contra_BBCAvailabilityAmount_Xpath = By
			.xpath("(//td[contains(text(),'6,250.00')])[1]");
	private final By Reports_xpath = By
			.xpath("(//a[contains(text(),'Reports')])[1]");
	private final By clickOnBBCReport_Xpath = By
			.xpath("(//li[@class='open_menu'])[9]");
	private final By clickOnHTMlButton_Xpath = By
			.xpath("//button[contains(text(),'HTML')]");
	private final By Contra_BBCReportReason_Xpath = By
			.xpath("//td[contains(text(),'Contra')]");
	private final By Contra_BBCReportAmount_Xpath = By
			.xpath("(//td[contains(text(),'6,250.00')])[1]");
	private final By clickOnIneligibleEligibleAnalysisReport_Xpath = By
			.xpath("(//li[@class='open_menu'])[3]");
	private final By Contra_IneligibleEligibleAnalysis_Reason_Reason_Xpath = By
			.xpath("//td[contains(text(),'Contra')]");
	private final By Contra_IneligibleEligibleAnalysis_Reason_Amount_Xpath = By
			.xpath("(//td[contains(text(),'6,250.00')])[1]");
	private final By ClickonGroupbyDropdown_Xpath = By
			.xpath("//select[@id='ineligible_style']");
	private final By Contra_IneligibleEligibleAnalysis_Debtor_Reason_Xpath = By
			.xpath("//td[contains(text(),'Contra')]");
	private final By Contra_IneligibleEligibleAnalysis_Debtor_Amount_Xpath = By
			.xpath("(//td[contains(text(),'6,250.00')])[1]");
	private final By BBCManagementReport_Xpath = By
			.xpath("(//li[@class='open_menu'])[28]");
	private final By ClickonGenerateButton_Xpath = By
			.xpath("//button[contains(text(),'Generate')]");
	private final By Contra_Management_Reason_Xpath = By
			.xpath("//td[contains(text(),'Contra')]");
	private final By Contra_Management_Amount_Xpath = By
			.xpath("(//td[contains(text(),'6,250.00')])[1]");
	private final By ClickonApproveBBC_Xpath = By
			.xpath("(//a[contains(text(),'Approve BBC')])[2]");
	private final By ClickonElectronicSignature_Xpath = By
			.xpath("(//a[contains(text(),'Electronic Signature')])");
	private final By SigNameTextBox_Xpath = By.id("signer_name");
	private final By AgreeCheckBox_Xpath = By.id("terms_condition");
	private final By ClickonApproveBBCButton_Xpath = By
			.xpath("(//button[contains(text(),'Authorize Signature and Approve BBC')])");
	private final By CloseButtonPopup_Xpath = By
			.xpath("(//button[@class='ui-dialog-titlebar-close'])");

	private final By SelectBBC_Xpath = By.id("choose_bbc");
	private final By BBCReviewData_History = By
			.xpath("(//a[contains(text(),'BBC Review Data')])[2]");

	private final By ReceivableAgingHistory_xpath = By
			.xpath("(//a[contains(text(),'Receivable Aging')])[2]");

	private final By BBCAvailabilityHistory_xpath = By
			.xpath("(//a[contains(text(),'BBC Availability')])[2]");
	private final By ApproveBBcDropdown_BBCReport_Xpath = By.id("bbc_status");
	private final By ApproveBBcDate_BBCReport_Xpath = By.id("bbc_id");

	private final By ApproveBBc_Xpath = By
			.xpath("//a[contains(text(),'Approve BBC/Funding')]");
	private final By SelectBorrowerList_Xpath = By.id("selected_borrower_list");
	private final By ClickonSearch_Xpath = By.xpath("//input[@value='Search']");
	private final By SelectCheckBox_Xpath = By
			.id("move_to_fund_check_box_14382");
	private final By ClickonUnreleaseButton_Xpath = By
			.xpath("//a[contains(text(),'Unrelease BBC')]");

	private final By Contra_ReceivableAgingReason_Greater_Xpath = By
			.xpath("//td[contains(text(),'Contra')]");
	private final By Contra_ReceivableAgingAmount_Greater_Xpath = By
			.xpath("(//td[contains(text(),'1,700.00')])[1]");

	private final By Contra_BBCAvailabilityReason_Greater_Xpath = By
			.xpath("//td[contains(text(),'Contra')]");
	private final By Contra_BBCAvailabilityAmount_Greater_Xpath = By
			.xpath("(//td[contains(text(),'1,700.00')])[1]");

	private final By Contra_BBCReportReason_Greater_Xpath = By
			.xpath("//td[contains(text(),'Contra')]");
	private final By Contra_BBCReportAmount_Greater_Xpath = By
			.xpath("(//td[contains(text(),'1,700.00')])[1]");

	private final By Contra_IneligibleEligibleAnalysis_Reason_Reason_Greater_Xpath = By
			.xpath("//td[contains(text(),'Contra')]");
	private final By Contra_IneligibleEligibleAnalysis_Reason_Amount_Greater_Xpath = By
			.xpath("(//td[contains(text(),'1,700.00')])[1]");

	private final By Contra_IneligibleEligibleAnalysis_Debtor_Reason_Greater_Xpath = By
			.xpath("//td[contains(text(),'Contra')]");
	private final By Contra_IneligibleEligibleAnalysis_Debtor_Amount_Greater_Xpath = By
			.xpath("(//td[contains(text(),'1,700.00')])[1]");

	private final By Contra_Management_Reason_Greater_Xpath = By
			.xpath("//td[contains(text(),'Contra')]");
	private final By Contra_Management_Amount_Greater_Xpath = By
			.xpath("(//td[contains(text(),'1,700.00')])[1]");

	private final By selectCheckBox_Xpath = By
			.xpath("(//input[@type='checkbox'])[6]");
	private final By deleteMappedVebdor_Xpath = By
			.xpath("//span[@class='ui-icon ui-icon-trash']");
	private final By clickOnDelete_Xpath = By
			.xpath("(//a[@class='fm-button ui-state-default ui-corner-all fm-button-icon-left'])[1]");

	private final By Contra_ReceivableAgingReason_Negative_Xpath = By
			.xpath("//td[contains(text(),'Totals')]");
	private final By Contra_ReceivableAgingAmount_Negative_Xpath = By
			.xpath("(//td[contains(text(),'0.00')])[1]");

	private final By Contra_BBCAvailabilityAmount_Negative_Xpath = By
			.xpath("(//td[contains(text(),'0.00')])[31]");

	private final By Contra_BBCReportReason_Negative_Xpath = By
			.xpath("//td[contains(text(),'INELIGIBLES')]");
	private final By Contra_BBCReportAmount_Negative_Xpath = By
			.xpath("(//td[contains(text(),'0.00')])[31]");

	private final By Contra_IneligibleEligibleAnalysis_Reason_Reason_Negative_Xpath = By
			.xpath("//td[contains(text(),' Overall Total ')]");
	private final By Contra_IneligibleEligibleAnalysis_Reason_Amount_Negative_Xpath = By
			.xpath("(//td[contains(text(),'0.00')])[1]");

	private final By Contra_IneligibleEligibleAnalysis_Debtor_Reason_Negative_Xpath = By
			.xpath("//td[contains(text(),'Total')]");
	private final By Contra_IneligibleEligibleAnalysis_Debtor_Amount_Negative_Xpath = By
			.xpath("(//td[contains(text(),'0.00')])[1]");

	private final By Contra_Management_Reason_Negative_Xpath = By
			.xpath("(//th[contains(text(),'Ineligible')])[1]");
	private final By Contra_Management_Amount_Negative_Xpath = By
			.xpath("(//td[contains(text(),'0.00')])[77]");

	private final By Contra_ReceivableAgingReason_Equal_Xpath = By
			.xpath("//td[contains(text(),'Contra')]");
	private final By Contra_ReceivableAgingAmount_Equal_Xpath = By
			.xpath("(//td[contains(text(),'2,000.00')])[1]");

	private final By Contra_BBCAvailabilityReason_Equal_Xpath = By
			.xpath("//td[contains(text(),'Contra')]");
	private final By Contra_BBCAvailabilityAmount_Equal_Xpath = By
			.xpath("(//td[contains(text(),'2,000.00')])[1]");

	private final By Contra_BBCReportReason_Equal_Xpath = By
			.xpath("//td[contains(text(),'Contra')]");
	private final By Contra_BBCReportAmount_Equal_Xpath = By
			.xpath("(//td[contains(text(),'2,000.00')])[1]");

	private final By Contra_IneligibleEligibleAnalysis_Reason_Reason_Equal_Xpath = By
			.xpath("//td[contains(text(),'Contra')]");
	private final By Contra_IneligibleEligibleAnalysis_Reason_Amount_Equal_Xpath = By
			.xpath("(//td[contains(text(),'2,000.00')])[1]");

	private final By Contra_IneligibleEligibleAnalysis_Debtor_Reason_Equal_Xpath = By
			.xpath("//td[contains(text(),'Contra')]");
	private final By Contra_IneligibleEligibleAnalysis_Debtor_Amount_Equal_Xpath = By
			.xpath("(//td[contains(text(),'2,000.00')])[1]");

	private final By Contra_Management_Reason_Equal_Xpath = By
			.xpath("//td[contains(text(),'Contra')]");
	private final By Contra_Management_Amount_Equal_Xpath = By
			.xpath("(//td[contains(text(),'2,000.00')])[1]");

	private final By ToBBCToApproved_Xpath = By
			.xpath("//ul[@id='FLUL32']/li[2]/a");
	private final By ClickonPurgeButton_Xpath = By
			.xpath("//a[contains(text(),'Purge')]");

	// rohit
	private final By verifyAllField_xpath = By
			.xpath("//*[@class='ui-jqgrid-labels']//th");
	private final By contrasHeader_xpath = By
			.xpath("//span[contains(text(),'Contras')]");
	private final By firstAccountNo_xpath = By
			.xpath("(//*[@class='jqgfirstrow']/..//td[contains(@aria-describedby,'account_no')])[1]");
	private final By searchAccountNo_xpath = By
			.xpath("//*[@name='customer_account_no']");
	private final By firstAccountName_xpath = By
			.xpath("(//*[@class='jqgfirstrow']/..//td[contains(@aria-describedby,'customer_name')])[1]");
	private final By searchAccountName_xpath = By
			.xpath("(//*[@name='customer_id'])[2]");
	private final By vendorAccount_xpath = By
			.xpath("(//*[@class='jqgfirstrow']/..//td[contains(@aria-describedby,'account_no')])[2]");
	private final By searchvendorAccount_xpath = By
			.xpath("//*[@name='vendor_account_no']");
	private final By vendorName_xpath = By
			.xpath("(//*[@class='jqgfirstrow']/..//td[contains(@aria-describedby,'vendor_name')])[1]");
	private final By searchvendorName_xpath = By
			.xpath("//*[@id='gs_contras_vendor_name']");
	private final By allAccountNumberData = By
			.xpath("//*[contains(@aria-describedby,'customers_list_account_no') and contains(@role,'gridcell')]");
	private final By clickAsceendingBtnAccNo = By
			.xpath("//div[@id='jqgh_contra_list_customer_account_no']");
	
	private final By allCustomerNameData = By
			.xpath("//*[contains(@aria-describedby,'contra_list_contras_customer_name') and contains(@role,'gridcell')]");
	private final By clickAsceendingBtnCustomerName = By
			.xpath("//div[@id='jqgh_contra_list_contras_customer_name']");
	
	private final By allVendorAccount = By
			.xpath("//*[contains(@aria-describedby,'contra_list_vendor_account_no') and contains(@role,'gridcell')]");
	private final By clickAsceendingBtnVendorAccount = By
			.xpath("//div[@id='jqgh_contra_list_vendor_account_no']");
	
	private final By allVendorName = By
			.xpath("//*[contains(@aria-describedby,'contra_list_contras_vendor_name') and contains(@role,'gridcell')]");
	private final By clickAsceendingBtnVendorName = By
			.xpath("//div[@id='jqgh_contra_list_contras_vendor_name']");
	private final By customerAccountTextBox_xpath=By.xpath("(//*[contains(@name,'customer_account_no')])[2]");
	private final By customerNameTextBox_xpath=By.xpath("(//*[contains(@name,'contras_customer_name')])");
	private final By vendorAccountTextBox_xpath=By.xpath("(//*[contains(@name,'vendor_account_no')])[2]");
	private final By vendorNameTextBox_xpath=By.xpath("(//*[contains(@name,'contras_vendor_name')])");
	private final By customerAccountAutoSuggestion_xpath=By.xpath("//*[@id='ui-id-2']//*[@class='ui-menu-item']");
	private final By customerNameAutoSuggestion_xpath=By.xpath("//*[@id='ui-id-3']//*[@class='ui-menu-item']");
	private final By vendorAccountAutoSuggestion_xpath=By.xpath("//*[@id='ui-id-4']//*[@class='ui-menu-item']");
	private final By vendorNameAutoSuggestion_xpath=By.xpath("//*[@id='ui-id-5']//*[@class='ui-menu-item']");
	private final By exportLink_xpath=By.xpath("//*[@class='ui-icon ui-icon-extlink']");
	private final By downloadFile_xpath=By.xpath("//*[@class='export']");
	private final By exportCheckBox_xpath=By.xpath("//*[@id='export_cols']");
	private final By errorMessage_xpath=By.id("infocnt");
	
	public boolean selectContra() {
		try {
			this.selectAllReasons();
			this.removeAllList();
			this.selecttContra();
			this.finalContra();
			this.saveOnIneligibleCalculation();
			return true;
		}

		catch (Exception ex) {
			return false;
		}

	}

	public boolean selectAllReasons() {
		try {
			WebElement selectAllReasonsWebE = new WebDriverWait(driver, 20)
					.until(ExpectedConditions
							.visibilityOfElementLocated(selectAllValues_xpath));
			selectAllReasonsWebE.click();
			Thread.sleep(100);
			return true;
		} catch (Exception e) {

			return false;
		}
	}

	public boolean removeAllList() {
		try {
			WebElement removeAllListWebE = new WebDriverWait(driver, 20)
					.until(ExpectedConditions
							.visibilityOfElementLocated(unselectAllValues_xpath));
			removeAllListWebE.click();
			Thread.sleep(100);
			return true;
		} catch (Exception e) {

			return false;
		}
	}

	public boolean selecttContra() {
		try {
			WebElement selectUninsuiredWebE = new WebDriverWait(driver, 20)
					.until(ExpectedConditions
							.visibilityOfElementLocated(selecttContra_xpath));
			selectUninsuiredWebE.click();
			Thread.sleep(100);
			return true;
		} catch (Exception e) {

			return false;
		}
	}

	public boolean finalContra() {
		try {
			WebElement finalUninsuiredWebE = new WebDriverWait(driver, 20)
					.until(ExpectedConditions
							.visibilityOfElementLocated(finalContra_xpath));
			finalUninsuiredWebE.click();
			Thread.sleep(100);
			return true;
		} catch (Exception e) {

			return false;
		}
	}

	public boolean saveOnIneligibleCalculation() {
		try {
			WebElement saveOnIneligibleReasonsWebE = new WebDriverWait(driver,
					20).until(ExpectedConditions
					.visibilityOfElementLocated(saveOnIneligibleReasons_xpath));
			saveOnIneligibleReasonsWebE.click();
			Thread.sleep(1000);
			return true;
		} catch (Exception e) {

			return false;
		}
	}

	public boolean MouseOverOnMenu() {
		try {
			WebElement menuItemWebE = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(menuItem_xpath));
			menuItemWebE.click();

			return true;
		} catch (Exception ex) {
			return false;
		}
	}

	public boolean moveToLeftNavigation(String navigation_Name) {
		try {
			By menuContainerWebE_xpath = By.xpath("//ul[@id='menu']");
			WebElement menuContainerWebE = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(menuContainerWebE_xpath));
			List<WebElement> menuWebL = menuContainerWebE.findElements(By
					.tagName("li"));
			for (WebElement option : menuWebL) {
				String title = option.getText();
				if (title.equals(navigation_Name)) {
					new Actions(driver).moveToElement(option).perform();
					return true;
				}

			}
			return false;
		} catch (Exception ex) {
			return false;
		}

	}

	public boolean isAlertPresent() {

		boolean presentFlag = false;

		try {
			Alert alert = driver.switchTo().alert();
			presentFlag = true;
			alert.accept();
		} catch (Exception ex) {

			System.out.println("No Such Alert Present");

		}

		return presentFlag;
	}

	public boolean openContrasScreen() {
		try {
			Thread.sleep(5000);
			this.MouseOverOnMenu();
			this.moveToLeftNavigation("ABL");
			WebElement IneligibleCalculationPageWebElement = new WebDriverWait(
					driver, 1000).until(ExpectedConditions
					.elementToBeClickable(Contras_xpath));
			IneligibleCalculationPageWebElement.click();
			Thread.sleep(1000);
			this.isAlertPresent();
			Thread.sleep(1000);
			return true;
		}

		catch (Exception ex) {
			return false;
		}

	}

	public boolean mapVendorAndCustoumer(String CustomerData, String VendorData) {
		try {
			this.clickonAdd();
			this.selectingCustomer(CustomerData);
			this.selectingVendor(VendorData);
			this.saveOnContrasScreen();
			this.closeOnPopUp();
			return true;
		}

		catch (Exception ex) {
			return false;
		}
	}

	public boolean clickonAdd() {
		try {

			WebElement clickonParentDebtorAddWebE = new WebDriverWait(driver,
					20).until(ExpectedConditions
					.visibilityOfElementLocated(Addcustomer_xpath));
			Thread.sleep(100);
			clickonParentDebtorAddWebE.click();
			return true;
		} catch (Exception e) {

			return false;
		}
	}

	public boolean selectingCustomer(String CustomerData) {
		try {
			// this.clickonParentTextbox();
			this.PassingthedataIntoCustomerTextbox(CustomerData);
			this.selectingCustomer();
			return true;
		}

		catch (Exception ex) {
			return false;
		}
	}

	public boolean PassingthedataIntoCustomerTextbox(String CustomerData) {
		try {

			WebElement clickonParentDebtorAddWebE = new WebDriverWait(driver,
					20).until(ExpectedConditions
					.visibilityOfElementLocated(CustomerTextbox_xpath));
			Thread.sleep(100);
			clickonParentDebtorAddWebE.clear();
			clickonParentDebtorAddWebE.sendKeys(CustomerData);
			return true;
		} catch (Exception e) {

			return false;
		}
	}

	public boolean selectingCustomer() {
		try {

			WebElement clickonParentDebtorAddWebE = new WebDriverWait(driver,
					20).until(ExpectedConditions
					.visibilityOfElementLocated(selectingCustomer_xpath));
			Thread.sleep(100);
			clickonParentDebtorAddWebE.click();
			return true;
		} catch (Exception e) {

			return false;
		}
	}

	public boolean selectingVendor(String VendorData) {
		try {
			// this.clickonParentTextbox();
			this.PassingthedataIntoVendorTextbox(VendorData);
			this.selectingVendor();
			return true;
		}

		catch (Exception ex) {
			return false;
		}
	}

	public boolean PassingthedataIntoVendorTextbox(String CustomerData) {
		try {

			WebElement clickonParentDebtorAddWebE = new WebDriverWait(driver,
					20).until(ExpectedConditions
					.visibilityOfElementLocated(VendorTextbox_xpath));
			Thread.sleep(100);
			clickonParentDebtorAddWebE.clear();
			clickonParentDebtorAddWebE.sendKeys(CustomerData);
			return true;
		} catch (Exception e) {

			return false;
		}
	}

	public boolean selectingVendor() {
		try {

			WebElement clickonParentDebtorAddWebE = new WebDriverWait(driver,
					20).until(ExpectedConditions
					.visibilityOfElementLocated(selectingVendor_xpath));
			Thread.sleep(100);
			clickonParentDebtorAddWebE.click();
			return true;
		} catch (Exception e) {

			return false;
		}
	}

	public boolean saveOnContrasScreen() {
		try {

			WebElement saveOnDebtorsScreeneWebE = new WebDriverWait(driver, 20)
					.until(ExpectedConditions
							.visibilityOfElementLocated(saveOnContras_Xpath));
			Thread.sleep(100);
			saveOnDebtorsScreeneWebE.click();
			Thread.sleep(500);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}

	public boolean closeOnPopUp() {
		try {
			WebElement saveOnDebtorsScreeneWebE = new WebDriverWait(driver, 20)
					.until(ExpectedConditions
							.visibilityOfElementLocated(CloseOnPopUp_Xpath));
			Thread.sleep(100);
			saveOnDebtorsScreeneWebE.click();
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public boolean recalculatingBBC() {
		try {
			this.openBbcRecalculationProcess();
			this.clickOnProcessButton();
			return true;
		}

		catch (Exception ex) {
			return false;
		}

	}

	public boolean openBbcRecalculationProcess() {
		try {
			this.MouseOverOnMenu();
			this.moveToLeftNavigation("ABL");
			WebElement IneligibleCalculationPageWebElement = new WebDriverWait(
					driver, 1000).until(ExpectedConditions
					.elementToBeClickable(BBCRecalculationProcess_xpath));
			IneligibleCalculationPageWebElement.click();
			Thread.sleep(1000);
			return true;
		}

		catch (Exception ex) {
			return false;
		}

	}

	public boolean clickOnProcessButton() {
		try {
			WebElement IneligibleCalculationPageWebElement = new WebDriverWait(
					driver, 1000).until(ExpectedConditions
					.elementToBeClickable(BBCRecalculationProcessButton_xpath));
			IneligibleCalculationPageWebElement.click();
			Thread.sleep(3000);
			Alert simpleAlert = driver.switchTo().alert();
			simpleAlert.accept();
			Thread.sleep(1000);
			simpleAlert.accept();
			Thread.sleep(1000);
			return true;
		}

		catch (Exception ex) {
			return false;
		}
	}

	public boolean navigateToReceivableAgingScreen() {
		try {
			this.MouseOverOnMenu();
			this.moveToLeftNavigation("ABL");
			WebElement navigateToIneligibleSummaryWebElement = new WebDriverWait(
					driver, 1000).until(ExpectedConditions
					.elementToBeClickable(ReceivableAging_xpath));
			navigateToIneligibleSummaryWebElement.click();
			this.isAlertPresent();
			Thread.sleep(1000);
			return true;
		}

		catch (Exception ex) {
			return false;
		}

	}

	public boolean verifyIneligibilityReasonReceivableAgingScreen(
			String ReasonData) {
		try {
			WebElement verifyIneligibilityReasonWebE = new WebDriverWait(
					driver, 20)
					.until(ExpectedConditions
							.visibilityOfElementLocated(Contra_ReceivableAgingReason_Xpath));
			Thread.sleep(100);
			String ActualReason = verifyIneligibilityReasonWebE.getText()
					.trim();
			if (ActualReason.equalsIgnoreCase(ReasonData)) {
				System.out.println(ReasonData);
				return true;
			} else {
				return false;
			}
		}

		catch (Exception ex) {

			return false;
		}

	}

	public boolean verifyIneligibilityAmountReceivableAgingScreen(
			String ReasonAmount) {
		try {
			WebElement verifyIneligibilityAmountWebE = new WebDriverWait(
					driver, 20)
					.until(ExpectedConditions
							.visibilityOfElementLocated(Contra_ReceivableAgingAmount_Xpath));
			Thread.sleep(100);
			String ActualAmount = verifyIneligibilityAmountWebE.getText();
			if (ActualAmount.equalsIgnoreCase(ReasonAmount)) {
				System.out.println(ReasonAmount);
				return true;
			} else {
				return false;
			}
		}

		catch (Exception ex) {

			return false;
		}

	}

	public boolean navigateToBBCAvailabilitySCreen() {
		try {
			this.MouseOverOnMenu();
			this.moveToLeftNavigation("ABL");
			WebElement navigateToIneligibleSummaryWebElement = new WebDriverWait(
					driver, 1000).until(ExpectedConditions
					.elementToBeClickable(BBCAvailability_xpath));
			navigateToIneligibleSummaryWebElement.click();
			this.isAlertPresent();
			Thread.sleep(1000);
			return true;
		}

		catch (Exception ex) {
			return false;
		}

	}

	public boolean clickOnPlus_BBCAvailability() {
		try {
			WebElement clickOnPlus_BBCAvailabilityWebElement = new WebDriverWait(
					driver, 1000).until(ExpectedConditions
					.elementToBeClickable(clickOnPlusBBCAvailability_Xpath));
			clickOnPlus_BBCAvailabilityWebElement.click();
			Thread.sleep(1000);
			return true;
		}

		catch (Exception ex) {
			return false;
		}

	}

	public boolean verifyIneligibilityReasonBBCAvailabilityScreen(
			String ReasonData) {
		try {
			this.clickOnPlus_BBCAvailability();
			WebElement verifyIneligibilityReasonWebE = new WebDriverWait(
					driver, 20)
					.until(ExpectedConditions
							.visibilityOfElementLocated(Contra_BBCAvailabilityReason_Xpath));
			Thread.sleep(100);
			String ActualReason = verifyIneligibilityReasonWebE.getText()
					.trim();
			if (ActualReason.equalsIgnoreCase(ReasonData)) {
				System.out.println(ReasonData);
				return true;
			} else {
				return false;
			}
		}

		catch (Exception ex) {

			return false;
		}

	}

	public boolean verifyIneligibilityAmountBBCAvailabilityScreen(
			String ReasonAmount) {
		try {
			WebElement verifyIneligibilityAmountWebE = new WebDriverWait(
					driver, 20)
					.until(ExpectedConditions
							.visibilityOfElementLocated(Contra_BBCAvailabilityAmount_Xpath));
			Thread.sleep(100);
			String ActualAmount = verifyIneligibilityAmountWebE.getText();
			if (ActualAmount.equalsIgnoreCase(ReasonAmount)) {
				System.out.println(ReasonAmount);
				return true;
			} else {
				return false;
			}
		}

		catch (Exception ex) {

			return false;
		}

	}

	public boolean generatingBBCReport() {
		try {
			this.MouseOverOnMenu();
			this.moveToLeftNavigation("Reports");
			WebElement navigationToReportsWebElement = new WebDriverWait(
					driver, 1000).until(ExpectedConditions
					.elementToBeClickable(Reports_xpath));
			navigationToReportsWebElement.click();
			Thread.sleep(1000);
			this.clickOnBBCReport();
			this.clickOnHTMlButton();
			return true;
		}

		catch (Exception ex) {
			return false;
		}

	}

	public boolean clickOnBBCReport() {
		try {
			WebElement clickOnPlus_BBCAvailabilityWebElement = new WebDriverWait(
					driver, 1000).until(ExpectedConditions
					.elementToBeClickable(clickOnBBCReport_Xpath));
			clickOnPlus_BBCAvailabilityWebElement.click();
			Thread.sleep(1000);
			return true;
		}

		catch (Exception ex) {
			return false;
		}

	}

	public boolean clickOnHTMlButton() {
		try {
			WebElement clickOnPlus_BBCAvailabilityWebElement = new WebDriverWait(
					driver, 1000).until(ExpectedConditions
					.elementToBeClickable(clickOnHTMlButton_Xpath));
			clickOnPlus_BBCAvailabilityWebElement.click();
			Thread.sleep(1000);
			ArrayList<String> tabs2 = new ArrayList<String>(
					driver.getWindowHandles());
			driver.switchTo().window(tabs2.get(1));
			return true;
		}

		catch (Exception ex) {
			return false;
		}

	}

	public boolean verifyIneligibilityReasonBBCReport(String ReasonData) {
		try {
			WebElement verifyIneligibilityReasonWebE = new WebDriverWait(
					driver, 20).until(ExpectedConditions
					.visibilityOfElementLocated(Contra_BBCReportReason_Xpath));
			Thread.sleep(100);
			String ActualReason = verifyIneligibilityReasonWebE.getText()
					.trim();
			if (ActualReason.equalsIgnoreCase(ReasonData)) {
				System.out.println(ReasonData);
				return true;
			} else {
				return false;
			}
		}

		catch (Exception ex) {

			return false;
		}

	}

	public boolean verifyIneligibilityAmountBBCReport(String ReasonAmount) {
		try {
			WebElement verifyIneligibilityAmountWebE = new WebDriverWait(
					driver, 20).until(ExpectedConditions
					.visibilityOfElementLocated(Contra_BBCReportAmount_Xpath));
			Thread.sleep(100);
			String ActualAmount = verifyIneligibilityAmountWebE.getText()
					.trim();
			if (ActualAmount.equalsIgnoreCase(ReasonAmount)) {
				System.out.println(ReasonAmount);
				return true;
			} else {
				return false;
			}
		}

		catch (Exception ex) {

			return false;
		}

	}

	public boolean generatingIneligibleEligibleReceivableAnalysisReportBy_Reason() {
		try {
			this.MouseOverOnMenu();
			this.moveToLeftNavigation("Reports");
			WebElement navigationToReportsWebElement = new WebDriverWait(
					driver, 1000).until(ExpectedConditions
					.elementToBeClickable(Reports_xpath));
			navigationToReportsWebElement.click();
			Thread.sleep(1000);
			this.IneligibleEligibleRecivablesAnalysisReport();
			this.clickOnHTMlButton();

			return true;
		}

		catch (Exception ex) {
			return false;
		}

	}

	public boolean IneligibleEligibleRecivablesAnalysisReport() {
		try {
			WebElement clickOnPlus_BBCAvailabilityWebElement = new WebDriverWait(
					driver, 1000)
					.until(ExpectedConditions
							.elementToBeClickable(clickOnIneligibleEligibleAnalysisReport_Xpath));
			clickOnPlus_BBCAvailabilityWebElement.click();
			Thread.sleep(1000);
			return true;
		}

		catch (Exception ex) {
			return false;
		}

	}

	public boolean verifyIneligibilityReason_IneligibleEligibleReceivableAnalysisReportBy_Reason(
			String ReasonData) {
		try {
			WebElement verifyIneligibilityReasonWebE = new WebDriverWait(
					driver, 20)
					.until(ExpectedConditions
							.visibilityOfElementLocated(Contra_IneligibleEligibleAnalysis_Reason_Reason_Xpath));
			Thread.sleep(100);
			String ActualReason = verifyIneligibilityReasonWebE.getText();
			if (ActualReason.equalsIgnoreCase(ReasonData)) {
				System.out.println(ReasonData);
				return true;
			} else {
				return false;
			}
		}

		catch (Exception ex) {

			return false;
		}

	}

	public boolean verifyIneligibilityAmount_IneligibleEligibleReceivableAnalysisReportBy_Reason(
			String ReasonAmount) {
		try {
			WebElement verifyIneligibilityAmountWebE = new WebDriverWait(
					driver, 20)
					.until(ExpectedConditions
							.visibilityOfElementLocated(Contra_IneligibleEligibleAnalysis_Reason_Amount_Xpath));
			Thread.sleep(100);
			String ActualAmount = verifyIneligibilityAmountWebE.getText();
			if (ActualAmount.equalsIgnoreCase(ReasonAmount)) {
				System.out.println(ReasonAmount);
				return true;
			} else {
				return false;
			}
		}

		catch (Exception ex) {

			return false;
		}
	}

	public boolean generatingIneligibleEligibleReceivableAnalysisReportBy_Debtor() {
		try {
			this.MouseOverOnMenu();
			this.moveToLeftNavigation("Reports");
			WebElement navigationToReportsWebElement = new WebDriverWait(
					driver, 1000).until(ExpectedConditions
					.elementToBeClickable(Reports_xpath));
			navigationToReportsWebElement.click();
			Thread.sleep(1000);
			this.IneligibleEligibleRecivablesAnalysisReport();
			return true;
		}

		catch (Exception ex) {
			return false;
		}

	}

	public boolean ClickonGroupbyDropdown(String GropuBy) {
		try {
			WebElement DropdownWebEelement = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(ClickonGroupbyDropdown_Xpath));
			Select sel = new Select(DropdownWebEelement);

			List<WebElement> list = sel.getOptions();

			for (WebElement ele : list) {
				/*
				 * String data = ele.getText(); System.out.println(data);
				 */
				if (ele.getText().equals(GropuBy)) {
					ele.click();
					// Thread.sleep(10000);

					return true;
				}
			}
		} catch (Exception ex) {
			return false;
		}
		return false;

	}

	public boolean verifyIneligibilityReason_IneligibleEligibleReceivableAnalysisReportBy_Debtor(
			String ReasonData) {
		try {
			WebElement verifyIneligibilityReasonWebE = new WebDriverWait(
					driver, 20)
					.until(ExpectedConditions
							.visibilityOfElementLocated(Contra_IneligibleEligibleAnalysis_Debtor_Reason_Xpath));
			Thread.sleep(100);
			String ActualReason = verifyIneligibilityReasonWebE.getText();
			if (ActualReason.equalsIgnoreCase(ReasonData)) {
				System.out.println(ReasonData);
				return true;
			} else {
				return false;
			}
		}

		catch (Exception ex) {

			return false;
		}

	}

	public boolean verifyIneligibilityAmount_IneligibleEligibleReceivableAnalysisReportBy_Debtor(
			String ReasonAmount) {
		try {
			WebElement verifyIneligibilityAmountWebE = new WebDriverWait(
					driver, 20)
					.until(ExpectedConditions
							.visibilityOfElementLocated(Contra_IneligibleEligibleAnalysis_Debtor_Amount_Xpath));
			Thread.sleep(100);
			String ActualAmount = verifyIneligibilityAmountWebE.getText();
			if (ActualAmount.equalsIgnoreCase(ReasonAmount)) {
				System.out.println(ReasonAmount);
				return true;
			} else {
				return false;
			}
		}

		catch (Exception ex) {

			return false;
		}
	}

	public boolean generatingBBCManagementReport() {
		try {
			this.MouseOverOnMenu();
			this.moveToLeftNavigation("Reports");
			WebElement navigationToReportsWebElement = new WebDriverWait(
					driver, 1000).until(ExpectedConditions
					.elementToBeClickable(Reports_xpath));
			navigationToReportsWebElement.click();
			Thread.sleep(1000);
			this.generatBBCManagementReport();

			return true;
		}

		catch (Exception ex) {
			return false;
		}

	}

	public boolean generatBBCManagementReport() {
		try {
			WebElement clickOnPlus_BBCAvailabilityWebElement = new WebDriverWait(
					driver, 1000).until(ExpectedConditions
					.elementToBeClickable(BBCManagementReport_Xpath));
			clickOnPlus_BBCAvailabilityWebElement.click();
			Thread.sleep(1000);
			this.clickOnGenerate_BBCManagement();
			return true;
		}

		catch (Exception ex) {
			return false;
		}

	}

	public boolean clickOnGenerate_BBCManagement() {
		try {
			WebElement clickOnGenerate_BBCManagementWebElement = new WebDriverWait(
					driver, 1000).until(ExpectedConditions
					.elementToBeClickable(ClickonGenerateButton_Xpath));
			clickOnGenerate_BBCManagementWebElement.click();
			Thread.sleep(1000);
			ArrayList<String> tabs2 = new ArrayList<String>(
					driver.getWindowHandles());
			driver.switchTo().window(tabs2.get(1));
			return true;
		}

		catch (Exception ex) {
			return false;
		}

	}

	public boolean verifyIneligibilityReason_BBCManagementReport(
			String ReasonData) {
		try {
			WebElement verifyIneligibilityReasonWebE = new WebDriverWait(
					driver, 20)
					.until(ExpectedConditions
							.visibilityOfElementLocated(Contra_Management_Reason_Xpath));
			Thread.sleep(100);
			String ActualReason = verifyIneligibilityReasonWebE.getText();
			if (ActualReason.equalsIgnoreCase(ReasonData)) {
				System.out.println(ReasonData);
				return true;
			} else {
				return false;
			}
		}

		catch (Exception ex) {

			return false;
		}

	}

	public boolean verifyIneligibilityAmount_BBCManagementReport(
			String ReasonAmount) {
		try {
			WebElement verifyIneligibilityAmountWebE = new WebDriverWait(
					driver, 20)
					.until(ExpectedConditions
							.visibilityOfElementLocated(Contra_Management_Amount_Xpath));
			Thread.sleep(100);
			String ActualAmount = verifyIneligibilityAmountWebE.getText();
			if (ActualAmount.equalsIgnoreCase(ReasonAmount)) {
				System.out.println(ReasonAmount);
				return true;
			} else {
				return false;
			}
		}

		catch (Exception ex) {

			return false;
		}
	}

	public boolean approveTheBBC(String SignatureData) {
		try {

			this.clickOnApproveBBC();
			this.clickOnElectronicSignatureButton();
			this.datatoTheSigntureTextBox("Basava");
			this.clickOnAgreeCheckBox();
			this.clickOnArroveBBCbutton();
			this.clickOnCloseButton();
			return true;
		}

		catch (Exception ex) {
			return false;
		}

	}

	public boolean clickOnApproveBBC() {
		try {
			WebElement clickOnApproveBBCWebElement = new WebDriverWait(driver,
					1000).until(ExpectedConditions
					.elementToBeClickable(ClickonApproveBBC_Xpath));
			clickOnApproveBBCWebElement.click();
			this.isAlertPresent();
			Thread.sleep(1000);
			return true;
		}

		catch (Exception ex) {
			return false;
		}

	}

	public boolean clickOnElectronicSignatureButton() {
		try {
			WebElement clickOnElectronicSignatureButtonWebElement = new WebDriverWait(
					driver, 1000).until(ExpectedConditions
					.elementToBeClickable(ClickonElectronicSignature_Xpath));
			clickOnElectronicSignatureButtonWebElement.click();
			Thread.sleep(500);
			return true;
		}

		catch (Exception ex) {
			return false;
		}

	}

	public boolean datatoTheSigntureTextBox(String SignatureData) {
		try {
			WebElement datatoTheSigntureTextBoxWebElement = new WebDriverWait(
					driver, 1000).until(ExpectedConditions
					.elementToBeClickable(SigNameTextBox_Xpath));
			datatoTheSigntureTextBoxWebElement.clear();
			datatoTheSigntureTextBoxWebElement.sendKeys(SignatureData);
			Thread.sleep(500);
			return true;
		}

		catch (Exception ex) {
			return false;
		}

	}

	public boolean clickOnAgreeCheckBox() {
		try {
			WebElement clickOnAgreeCheckBoxWebElement = new WebDriverWait(
					driver, 1000).until(ExpectedConditions
					.elementToBeClickable(AgreeCheckBox_Xpath));
			clickOnAgreeCheckBoxWebElement.click();
			Thread.sleep(500);
			return true;
		}

		catch (Exception ex) {
			return false;
		}

	}

	public boolean clickOnArroveBBCbutton() {
		try {
			WebElement clickOnArroveBBCbuttonWebElement = new WebDriverWait(
					driver, 1000).until(ExpectedConditions
					.elementToBeClickable(ClickonApproveBBCButton_Xpath));
			clickOnArroveBBCbuttonWebElement.click();
			Thread.sleep(2000);
			return true;
		}

		catch (Exception ex) {
			return false;
		}

	}

	public boolean clickOnCloseButton() {
		try {
			WebElement clickOnCloseButtonWebElement = new WebDriverWait(driver,
					1000).until(ExpectedConditions
					.elementToBeClickable(CloseButtonPopup_Xpath));
			clickOnCloseButtonWebElement.click();
			Thread.sleep(500);
			return true;
		}

		catch (Exception ex) {
			return false;
		}

	}

	public boolean navigationToBBCReviewData_History() {
		try {
			this.MouseOverOnMenu();
			this.moveToLeftNavigation("ABL");
			WebElement navigateToIneligibleSummaryWebElement = new WebDriverWait(
					driver, 1000).until(ExpectedConditions
					.elementToBeClickable(BBCReviewData_History));
			navigateToIneligibleSummaryWebElement.click();
			this.isAlertPresent();
			Thread.sleep(1000);
			return true;
		}

		catch (Exception ex) {
			return false;
		}

	}

	public boolean ClickonSelectBBCDropdown(String SelectBBC) {
		try {
			WebElement DropdownWebEelement = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(SelectBBC_Xpath));
			Thread.sleep(1500);
			Select sel = new Select(DropdownWebEelement);

			List<WebElement> list = sel.getOptions();

			for (WebElement ele : list) {
				/*
				 * String data = ele.getText(); System.out.println(data);
				 */

				if (ele.getText().equals(SelectBBC)) {
					ele.click();
					Thread.sleep(2500);

					return true;
				}
			}
		} catch (Exception ex) {
			return false;
		}
		return false;

	}

	public boolean navigateToReceivableAgingHistoryScreen() {
		try {
			this.MouseOverOnMenu();
			this.moveToLeftNavigation("ABL");
			WebElement navigateToIneligibleSummaryWebElement = new WebDriverWait(
					driver, 1000).until(ExpectedConditions
					.elementToBeClickable(ReceivableAgingHistory_xpath));
			navigateToIneligibleSummaryWebElement.click();
			this.isAlertPresent();
			Thread.sleep(1000);
			return true;
		}

		catch (Exception ex) {
			return false;
		}

	}

	public boolean navigateToBBCAvailabilityHistoryScreen() {
		try {

			this.MouseOverOnMenu();
			this.moveToLeftNavigation("ABL");
			WebElement navigateToIneligibleSummaryWebElement = new WebDriverWait(
					driver, 1000).until(ExpectedConditions
					.elementToBeClickable(BBCAvailabilityHistory_xpath));
			navigateToIneligibleSummaryWebElement.click();
			this.isAlertPresent();
			Thread.sleep(1000);
			// this.clickOnPlus_BBCAvailability();
			return true;
		}

		catch (Exception ex) {
			return false;
		}

	}

	public boolean generatingBBCReport_Approved(String SelectBBCDate,
			String SelectBBCStatus) {
		try {
			this.MouseOverOnMenu();
			this.moveToLeftNavigation("Reports");
			WebElement navigationToReportsWebElement = new WebDriverWait(
					driver, 1000).until(ExpectedConditions
					.elementToBeClickable(Reports_xpath));
			navigationToReportsWebElement.click();
			Thread.sleep(1000);
			this.clickOnBBCReport();
			Thread.sleep(500);
			this.selectBBCStatus("Approved");
			Thread.sleep(500);
			this.selectBBCDate("12/01/2018");
			Thread.sleep(500);
			this.clickOnHTMlButton();
			return true;
		}

		catch (Exception ex) {
			return false;
		}

	}

	public boolean selectBBCStatus(String SelectBBCStatus) {
		try {
			WebElement DropdownWebEelement = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(ApproveBBcDropdown_BBCReport_Xpath));
			Thread.sleep(1500);
			Select sel = new Select(DropdownWebEelement);

			List<WebElement> list = sel.getOptions();

			for (WebElement ele : list) {
				/*
				 * String data = ele.getText(); System.out.println(data);
				 */

				if (ele.getText().equals(SelectBBCStatus)) {
					ele.click();
					Thread.sleep(2500);

					return true;
				}
			}
		} catch (Exception ex) {
			return false;
		}
		return false;

	}

	public boolean selectBBCDate(String SelectBBCDate) {
		try {
			WebElement DropdownWebEelement = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(ApproveBBcDate_BBCReport_Xpath));
			Thread.sleep(1500);
			Select sel = new Select(DropdownWebEelement);

			List<WebElement> list = sel.getOptions();

			for (WebElement ele : list) {
				/*
				 * String data = ele.getText(); System.out.println(data);
				 */

				if (ele.getText().equals(SelectBBCDate)) {
					ele.click();
					Thread.sleep(2500);

					return true;
				}
			}
		} catch (Exception ex) {
			return false;
		}
		return false;

	}

	public boolean generatingIneligibleReasonReportApproved_Reason(
			String SelectBBCDate, String SelectBBCStatus) {
		try {
			this.MouseOverOnMenu();
			this.moveToLeftNavigation("Reports");
			WebElement navigationToReportsWebElement = new WebDriverWait(
					driver, 1000).until(ExpectedConditions
					.elementToBeClickable(Reports_xpath));
			navigationToReportsWebElement.click();
			Thread.sleep(1000);
			this.IneligibleEligibleRecivablesAnalysisReport();
			Thread.sleep(500);
			this.selectBBCStatus("Approved");
			Thread.sleep(500);
			this.selectBBCDate("12/01/2018");
			Thread.sleep(500);
			this.clickOnHTMlButton();
			return true;
		}

		catch (Exception ex) {
			return false;
		}

	}

	public boolean generatingIneligibleReasonReportApproved_Debtor(
			String SelectBBCDate, String SelectBBCStatus) {
		try {
			this.MouseOverOnMenu();
			this.moveToLeftNavigation("Reports");
			WebElement navigationToReportsWebElement = new WebDriverWait(
					driver, 1000).until(ExpectedConditions
					.elementToBeClickable(Reports_xpath));
			navigationToReportsWebElement.click();
			Thread.sleep(1000);
			this.IneligibleEligibleRecivablesAnalysisReport();
			Thread.sleep(500);
			this.selectBBCStatus("Approved");
			Thread.sleep(500);
			this.selectBBCDate("12/01/2018");
			Thread.sleep(500);
			return true;
		}

		catch (Exception ex) {
			return false;
		}

	}

	public boolean generatingBBCManagementReport_Approved(String SelectBBCDate,
			String SelectBBCStatus) {
		try {
			this.MouseOverOnMenu();
			this.moveToLeftNavigation("Reports");
			WebElement navigationToReportsWebElement = new WebDriverWait(
					driver, 1000).until(ExpectedConditions
					.elementToBeClickable(Reports_xpath));
			navigationToReportsWebElement.click();
			Thread.sleep(1000);
			this.generatBBCManagementReport_Approved();
			Thread.sleep(500);
			this.selectBBCStatus("Approved");
			Thread.sleep(500);
			this.selectBBCDate("12/01/2018");
			Thread.sleep(500);
			this.clickOnGenerate_BBCManagement();
			return true;
		}

		catch (Exception ex) {
			return false;
		}

	}

	public boolean generatBBCManagementReport_Approved() {
		try {
			WebElement clickOnPlus_BBCAvailabilityWebElement = new WebDriverWait(
					driver, 1000).until(ExpectedConditions
					.elementToBeClickable(BBCManagementReport_Xpath));
			clickOnPlus_BBCAvailabilityWebElement.click();
			Thread.sleep(1000);
			// this.clickOnGenerate_BBCManagement();
			return true;
		}

		catch (Exception ex) {
			return false;
		}

	}

	public boolean UnreleaseTheBBC(String SelectApprovedClient) {
		try {
			this.navigationToApproveBBC();
			this.clickonAllClientDropdown("NEW_CONT_AUTOMATION");
			this.clickonSearchButton();
			this.SelectCheckBox();
			this.clickonUnreleaseButton();
			return true;
		}

		catch (Exception ex) {
			return false;
		}
	}

	public boolean navigationToApproveBBC() {
		try {
			this.MouseOverOnMenu();
			this.moveToLeftNavigation("ABL");
			WebElement navigateToIneligibleSummaryWebElement = new WebDriverWait(
					driver, 1000).until(ExpectedConditions
					.elementToBeClickable(ApproveBBc_Xpath));
			navigateToIneligibleSummaryWebElement.click();
			this.isAlertPresent();
			Thread.sleep(1000);
			return true;
		}

		catch (Exception ex) {
			return false;
		}
	}

	public boolean clickonAllClientDropdown(String SelectApprovedClient) {
		try {
			WebElement DropdownWebEelement = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(SelectBorrowerList_Xpath));
			Thread.sleep(1500);
			Select sel = new Select(DropdownWebEelement);

			List<WebElement> list = sel.getOptions();

			for (WebElement ele : list) {
				/*
				 * String data = ele.getText(); System.out.println(data);
				 */

				if (ele.getText().equals(SelectApprovedClient)) {
					ele.click();
					Thread.sleep(2500);

					return true;
				}
			}
		} catch (Exception ex) {
			return false;
		}
		return false;

	}

	public boolean clickonSearchButton() {
		try {
			WebElement clickonSearchButtonWebElement = new WebDriverWait(
					driver, 1000).until(ExpectedConditions
					.elementToBeClickable(ClickonSearch_Xpath));
			clickonSearchButtonWebElement.click();
			Thread.sleep(5000);
			return true;
		}

		catch (Exception ex) {
			return false;
		}

	}

	public boolean SelectCheckBox() {
		try {
			WebElement clickonSearchButtonWebElement = new WebDriverWait(
					driver, 1000).until(ExpectedConditions
					.elementToBeClickable(SelectCheckBox_Xpath));
			clickonSearchButtonWebElement.click();
			Thread.sleep(1000);
			return true;
		}

		catch (Exception ex) {
			return false;
		}

	}

	public boolean clickonUnreleaseButton() {
		try {
			WebElement clickonUnreleaseButtonWebElement = new WebDriverWait(
					driver, 1000).until(ExpectedConditions
					.elementToBeClickable(ClickonUnreleaseButton_Xpath));
			clickonUnreleaseButtonWebElement.click();
			Thread.sleep(1000);
			Alert simpleAlert = driver.switchTo().alert();
			simpleAlert.accept();
			Thread.sleep(2000);
			return true;
		}

		catch (Exception ex) {
			return false;
		}

	}

	public boolean verifyIneligibilityReasonReceivableAgingScreen_Greater(
			String ReasonData) {
		try {
			WebElement verifyIneligibilityReasonWebE = new WebDriverWait(
					driver, 20)
					.until(ExpectedConditions
							.visibilityOfElementLocated(Contra_ReceivableAgingReason_Greater_Xpath));
			Thread.sleep(100);
			String ActualReason = verifyIneligibilityReasonWebE.getText()
					.trim();
			if (ActualReason.equalsIgnoreCase(ReasonData)) {
				System.out.println(ReasonData);
				return true;
			} else {
				return false;
			}
		}

		catch (Exception ex) {

			return false;
		}

	}

	public boolean verifyIneligibilityAmountReceivableAgingScreen_Greater(
			String ReasonAmount) {
		try {
			WebElement verifyIneligibilityAmountWebE = new WebDriverWait(
					driver, 20)
					.until(ExpectedConditions
							.visibilityOfElementLocated(Contra_ReceivableAgingAmount_Greater_Xpath));
			Thread.sleep(100);
			String ActualAmount = verifyIneligibilityAmountWebE.getText();
			if (ActualAmount.equalsIgnoreCase(ReasonAmount)) {
				System.out.println(ReasonAmount);
				return true;
			} else {
				return false;
			}
		}

		catch (Exception ex) {

			return false;
		}

	}

	public boolean verifyIneligibilityReasonBBCAvailabilityScreen_Greater(
			String ReasonData) {
		try {
			this.clickOnPlus_BBCAvailability();
			WebElement verifyIneligibilityReasonWebE = new WebDriverWait(
					driver, 20)
					.until(ExpectedConditions
							.visibilityOfElementLocated(Contra_BBCAvailabilityReason_Greater_Xpath));
			Thread.sleep(100);
			String ActualReason = verifyIneligibilityReasonWebE.getText()
					.trim();
			if (ActualReason.equalsIgnoreCase(ReasonData)) {
				System.out.println(ReasonData);
				return true;
			} else {
				return false;
			}
		}

		catch (Exception ex) {

			return false;
		}

	}

	public boolean verifyIneligibilityAmountBBCAvailabilityScreen_Greater(
			String ReasonAmount) {
		try {
			WebElement verifyIneligibilityAmountWebE = new WebDriverWait(
					driver, 20)
					.until(ExpectedConditions
							.visibilityOfElementLocated(Contra_BBCAvailabilityAmount_Greater_Xpath));
			Thread.sleep(100);
			String ActualAmount = verifyIneligibilityAmountWebE.getText();
			if (ActualAmount.equalsIgnoreCase(ReasonAmount)) {
				System.out.println(ReasonAmount);
				return true;
			} else {
				return false;
			}
		}

		catch (Exception ex) {

			return false;
		}

	}

	public boolean verifyIneligibilityReasonBBCReport_Greater(String ReasonData) {
		try {
			WebElement verifyIneligibilityReasonWebE = new WebDriverWait(
					driver, 20)
					.until(ExpectedConditions
							.visibilityOfElementLocated(Contra_BBCReportReason_Greater_Xpath));
			Thread.sleep(100);
			String ActualReason = verifyIneligibilityReasonWebE.getText()
					.trim();
			if (ActualReason.equalsIgnoreCase(ReasonData)) {
				System.out.println(ReasonData);
				return true;
			} else {
				return false;
			}
		}

		catch (Exception ex) {

			return false;
		}

	}

	public boolean verifyIneligibilityAmountBBCReport_Greater(
			String ReasonAmount) {
		try {
			WebElement verifyIneligibilityAmountWebE = new WebDriverWait(
					driver, 20)
					.until(ExpectedConditions
							.visibilityOfElementLocated(Contra_BBCReportAmount_Greater_Xpath));
			Thread.sleep(100);
			String ActualAmount = verifyIneligibilityAmountWebE.getText()
					.trim();
			if (ActualAmount.equalsIgnoreCase(ReasonAmount)) {
				System.out.println(ReasonAmount);
				return true;
			} else {
				return false;
			}
		}

		catch (Exception ex) {

			return false;
		}

	}

	public boolean verifyIneligibilityReason_IneligibleEligibleReceivableAnalysisReportBy_Reason_Greater(
			String ReasonData) {
		try {
			WebElement verifyIneligibilityReasonWebE = new WebDriverWait(
					driver, 20)
					.until(ExpectedConditions
							.visibilityOfElementLocated(Contra_IneligibleEligibleAnalysis_Reason_Reason_Greater_Xpath));
			Thread.sleep(100);
			String ActualReason = verifyIneligibilityReasonWebE.getText();
			if (ActualReason.equalsIgnoreCase(ReasonData)) {
				System.out.println(ReasonData);
				return true;
			} else {
				return false;
			}
		}

		catch (Exception ex) {

			return false;
		}

	}

	public boolean verifyIneligibilityAmount_IneligibleEligibleReceivableAnalysisReportBy_Reason_Greater(
			String ReasonAmount) {
		try {
			WebElement verifyIneligibilityAmountWebE = new WebDriverWait(
					driver, 20)
					.until(ExpectedConditions
							.visibilityOfElementLocated(Contra_IneligibleEligibleAnalysis_Reason_Amount_Greater_Xpath));
			Thread.sleep(100);
			String ActualAmount = verifyIneligibilityAmountWebE.getText();
			if (ActualAmount.equalsIgnoreCase(ReasonAmount)) {
				System.out.println(ReasonAmount);
				return true;
			} else {
				return false;
			}
		}

		catch (Exception ex) {

			return false;
		}
	}

	public boolean verifyIneligibilityReason_IneligibleEligibleReceivableAnalysisReportBy_Debtor_Greater(
			String ReasonData) {
		try {
			WebElement verifyIneligibilityReasonWebE = new WebDriverWait(
					driver, 20)
					.until(ExpectedConditions
							.visibilityOfElementLocated(Contra_IneligibleEligibleAnalysis_Debtor_Reason_Greater_Xpath));
			Thread.sleep(100);
			String ActualReason = verifyIneligibilityReasonWebE.getText();
			if (ActualReason.equalsIgnoreCase(ReasonData)) {
				System.out.println(ReasonData);
				return true;
			} else {
				return false;
			}
		}

		catch (Exception ex) {

			return false;
		}

	}

	public boolean verifyIneligibilityAmount_IneligibleEligibleReceivableAnalysisReportBy_Debtor_Greater(
			String ReasonAmount) {
		try {
			WebElement verifyIneligibilityAmountWebE = new WebDriverWait(
					driver, 20)
					.until(ExpectedConditions
							.visibilityOfElementLocated(Contra_IneligibleEligibleAnalysis_Debtor_Amount_Greater_Xpath));
			Thread.sleep(100);
			String ActualAmount = verifyIneligibilityAmountWebE.getText();
			if (ActualAmount.equalsIgnoreCase(ReasonAmount)) {
				System.out.println(ReasonAmount);
				return true;
			} else {
				return false;
			}
		}

		catch (Exception ex) {

			return false;
		}
	}

	public boolean verifyIneligibilityReason_BBCManagementReport_Greater(
			String ReasonData) {
		try {
			WebElement verifyIneligibilityReasonWebE = new WebDriverWait(
					driver, 20)
					.until(ExpectedConditions
							.visibilityOfElementLocated(Contra_Management_Reason_Greater_Xpath));
			Thread.sleep(100);
			String ActualReason = verifyIneligibilityReasonWebE.getText();
			if (ActualReason.equalsIgnoreCase(ReasonData)) {
				System.out.println(ReasonData);
				return true;
			} else {
				return false;
			}
		}

		catch (Exception ex) {

			return false;
		}

	}

	public boolean verifyIneligibilityAmount_BBCManagementReport_Greater(
			String ReasonAmount) {
		try {
			WebElement verifyIneligibilityAmountWebE = new WebDriverWait(
					driver, 20)
					.until(ExpectedConditions
							.visibilityOfElementLocated(Contra_Management_Amount_Greater_Xpath));
			Thread.sleep(100);
			String ActualAmount = verifyIneligibilityAmountWebE.getText();
			if (ActualAmount.equalsIgnoreCase(ReasonAmount)) {
				System.out.println(ReasonAmount);
				return true;
			} else {
				return false;
			}
		}

		catch (Exception ex) {

			return false;
		}
	}

	public boolean unMapVendorAndCustomer() {
		try {
			WebElement clickOnPlus_BBCAvailabilityWebElement = new WebDriverWait(
					driver, 1000).until(ExpectedConditions
					.elementToBeClickable(selectCheckBox_Xpath));
			clickOnPlus_BBCAvailabilityWebElement.click();
			this.deleteMappedVebdor();
			Thread.sleep(1000);
			return true;
		}

		catch (Exception ex) {
			return false;
		}

	}

	public boolean deleteMappedVebdor() {
		try {
			WebElement clickOnPlus_BBCAvailabilityWebElement = new WebDriverWait(
					driver, 1000).until(ExpectedConditions
					.elementToBeClickable(deleteMappedVebdor_Xpath));
			clickOnPlus_BBCAvailabilityWebElement.click();

			Thread.sleep(1000);
			return true;
		}

		catch (Exception ex) {
			return false;
		}

	}

	public boolean clickOnDelete() {
		try {
			WebElement clickOnPlus_BBCAvailabilityWebElement = new WebDriverWait(
					driver, 1000).until(ExpectedConditions
					.elementToBeClickable(clickOnDelete_Xpath));
			clickOnPlus_BBCAvailabilityWebElement.click();

			Thread.sleep(1000);
			return true;
		}

		catch (Exception ex) {
			return false;
		}

	}

	public boolean verifyIneligibilityReasonReceivableAgingScreen_Negative(
			String ReasonData) {
		try {
			WebElement verifyIneligibilityReasonWebE = new WebDriverWait(
					driver, 20)
					.until(ExpectedConditions
							.visibilityOfElementLocated(Contra_ReceivableAgingReason_Negative_Xpath));
			Thread.sleep(100);
			String ActualReason = verifyIneligibilityReasonWebE.getText()
					.trim();
			if (ActualReason.equalsIgnoreCase(ReasonData)) {
				System.out.println(ReasonData);
				return true;
			} else {
				return false;
			}
		}

		catch (Exception ex) {

			return false;
		}

	}

	public boolean verifyIneligibilityAmountReceivableAgingScreen_Negative(
			String ReasonAmount) {
		try {
			WebElement verifyIneligibilityAmountWebE = new WebDriverWait(
					driver, 20)
					.until(ExpectedConditions
							.visibilityOfElementLocated(Contra_ReceivableAgingAmount_Negative_Xpath));
			Thread.sleep(100);
			String ActualAmount = verifyIneligibilityAmountWebE.getText();
			if (ActualAmount.equalsIgnoreCase(ReasonAmount)) {
				System.out.println(ReasonAmount);
				return true;
			} else {
				return false;
			}
		}

		catch (Exception ex) {

			return false;
		}

	}

	public boolean verifyIneligibilityAmountBBCAvailabilityScreen_Negative(
			String ReasonAmount) {
		try {
			WebElement verifyIneligibilityAmountWebE = new WebDriverWait(
					driver, 20)
					.until(ExpectedConditions
							.visibilityOfElementLocated(Contra_BBCAvailabilityAmount_Negative_Xpath));
			Thread.sleep(100);
			String ActualAmount = verifyIneligibilityAmountWebE.getText();
			if (ActualAmount.equalsIgnoreCase(ReasonAmount)) {
				System.out.println(ReasonAmount);
				return true;
			} else {
				return false;
			}
		}

		catch (Exception ex) {

			return false;
		}

	}

	public boolean verifyIneligibilityReasonBBCReport_Negative(String ReasonData) {
		try {
			WebElement verifyIneligibilityReasonWebE = new WebDriverWait(
					driver, 20)
					.until(ExpectedConditions
							.visibilityOfElementLocated(Contra_BBCReportReason_Negative_Xpath));
			Thread.sleep(100);
			String ActualReason = verifyIneligibilityReasonWebE.getText()
					.trim();
			if (ActualReason.equalsIgnoreCase(ReasonData)) {
				System.out.println(ReasonData);
				return true;
			} else {
				return false;
			}
		}

		catch (Exception ex) {

			return false;
		}

	}

	public boolean verifyIneligibilityAmountBBCReport_Negative(
			String ReasonAmount) {
		try {
			WebElement verifyIneligibilityAmountWebE = new WebDriverWait(
					driver, 20)
					.until(ExpectedConditions
							.visibilityOfElementLocated(Contra_BBCReportAmount_Negative_Xpath));
			Thread.sleep(100);
			String ActualAmount = verifyIneligibilityAmountWebE.getText()
					.trim();
			if (ActualAmount.equalsIgnoreCase(ReasonAmount)) {
				System.out.println(ReasonAmount);
				return true;
			} else {
				return false;
			}
		}

		catch (Exception ex) {

			return false;
		}

	}

	public boolean verifyIneligibilityReason_IneligibleEligibleReceivableAnalysisReportBy_Reason_Negative(
			String ReasonData) {
		try {
			WebElement verifyIneligibilityReasonWebE = new WebDriverWait(
					driver, 20)
					.until(ExpectedConditions
							.visibilityOfElementLocated(Contra_IneligibleEligibleAnalysis_Reason_Reason_Negative_Xpath));
			Thread.sleep(100);
			String ActualReason = verifyIneligibilityReasonWebE.getText()
					.trim();
			if (ActualReason.equalsIgnoreCase(ReasonData)) {
				System.out.println(ReasonData);
				return true;
			} else {
				return false;
			}
		}

		catch (Exception ex) {

			return false;
		}

	}

	public boolean verifyIneligibilityAmount_IneligibleEligibleReceivableAnalysisReportBy_Reason_Negative(
			String ReasonAmount) {
		try {
			WebElement verifyIneligibilityAmountWebE = new WebDriverWait(
					driver, 20)
					.until(ExpectedConditions
							.visibilityOfElementLocated(Contra_IneligibleEligibleAnalysis_Reason_Amount_Negative_Xpath));
			Thread.sleep(100);
			String ActualAmount = verifyIneligibilityAmountWebE.getText()
					.trim();
			if (ActualAmount.equalsIgnoreCase(ReasonAmount)) {
				System.out.println(ReasonAmount);
				return true;
			} else {
				return false;
			}
		}

		catch (Exception ex) {

			return false;
		}

	}

	public boolean verifyIneligibilityReason_IneligibleEligibleReceivableAnalysisReportBy_Debtor_Negative(
			String ReasonData) {
		try {
			WebElement verifyIneligibilityReasonWebE = new WebDriverWait(
					driver, 20)
					.until(ExpectedConditions
							.visibilityOfElementLocated(Contra_IneligibleEligibleAnalysis_Debtor_Reason_Negative_Xpath));
			Thread.sleep(100);
			String ActualReason = verifyIneligibilityReasonWebE.getText()
					.trim();
			if (ActualReason.equalsIgnoreCase(ReasonData)) {
				System.out.println(ReasonData);
				return true;
			} else {
				return false;
			}
		}

		catch (Exception ex) {

			return false;
		}

	}

	public boolean verifyIneligibilityAmount_IneligibleEligibleReceivableAnalysisReportBy_Debtor_Negative(
			String ReasonAmount) {
		try {
			WebElement verifyIneligibilityAmountWebE = new WebDriverWait(
					driver, 20)
					.until(ExpectedConditions
							.visibilityOfElementLocated(Contra_IneligibleEligibleAnalysis_Debtor_Amount_Negative_Xpath));
			Thread.sleep(100);
			String ActualAmount = verifyIneligibilityAmountWebE.getText()
					.trim();
			if (ActualAmount.equalsIgnoreCase(ReasonAmount)) {
				System.out.println(ReasonAmount);
				return true;
			} else {
				return false;
			}
		}

		catch (Exception ex) {

			return false;
		}

	}

	public boolean verifyIneligibilityReason_BBCManagementReport_Negative(
			String ReasonData) {
		try {
			WebElement verifyIneligibilityReasonWebE = new WebDriverWait(
					driver, 20)
					.until(ExpectedConditions
							.visibilityOfElementLocated(Contra_Management_Reason_Negative_Xpath));
			Thread.sleep(100);
			String ActualReason = verifyIneligibilityReasonWebE.getText();
			if (ActualReason.equalsIgnoreCase(ReasonData)) {
				System.out.println(ReasonData);
				return true;
			} else {
				return false;
			}
		}

		catch (Exception ex) {

			return false;
		}

	}

	public boolean verifyIneligibilityAmount_BBCManagementReport_Negative(
			String ReasonAmount) {
		try {
			WebElement verifyIneligibilityAmountWebE = new WebDriverWait(
					driver, 20)
					.until(ExpectedConditions
							.visibilityOfElementLocated(Contra_Management_Amount_Negative_Xpath));
			Thread.sleep(100);
			String ActualAmount = verifyIneligibilityAmountWebE.getText();
			if (ActualAmount.equalsIgnoreCase(ReasonAmount)) {
				System.out.println(ReasonAmount);
				return true;
			} else {
				return false;
			}
		}

		catch (Exception ex) {

			return false;
		}
	}

	public boolean verifyIneligibilityReasonReceivableAgingScreen_Equal(
			String ReasonData) {
		try {
			WebElement verifyIneligibilityReasonWebE = new WebDriverWait(
					driver, 20)
					.until(ExpectedConditions
							.visibilityOfElementLocated(Contra_ReceivableAgingReason_Equal_Xpath));
			Thread.sleep(100);
			String ActualReason = verifyIneligibilityReasonWebE.getText()
					.trim();
			if (ActualReason.equalsIgnoreCase(ReasonData)) {
				System.out.println(ReasonData);
				return true;
			} else {
				return false;
			}
		}

		catch (Exception ex) {

			return false;
		}

	}

	public boolean verifyIneligibilityAmountReceivableAgingScreen_Equal(
			String ReasonAmount) {
		try {
			WebElement verifyIneligibilityAmountWebE = new WebDriverWait(
					driver, 20)
					.until(ExpectedConditions
							.visibilityOfElementLocated(Contra_ReceivableAgingAmount_Equal_Xpath));
			Thread.sleep(100);
			String ActualAmount = verifyIneligibilityAmountWebE.getText();
			if (ActualAmount.equalsIgnoreCase(ReasonAmount)) {
				System.out.println(ReasonAmount);
				return true;
			} else {
				return false;
			}
		}

		catch (Exception ex) {

			return false;
		}

	}

	// ///
	public boolean verifyIneligibilityReasonBBCAvailabilityScreen_Equal(
			String ReasonData) {
		try {
			this.clickOnPlus_BBCAvailability();
			WebElement verifyIneligibilityAmountWebE = new WebDriverWait(
					driver, 20)
					.until(ExpectedConditions
							.visibilityOfElementLocated(Contra_BBCAvailabilityReason_Equal_Xpath));
			Thread.sleep(100);
			String ActualAmount = verifyIneligibilityAmountWebE.getText();
			if (ActualAmount.equalsIgnoreCase(ReasonData)) {
				System.out.println(ReasonData);
				return true;
			} else {
				return false;
			}
		}

		catch (Exception ex) {

			return false;
		}

	}

	public boolean verifyIneligibilityAmountBBCAvailabilityScreen_Equal(
			String ReasonAmount) {
		try {
			WebElement verifyIneligibilityAmountWebE = new WebDriverWait(
					driver, 20)
					.until(ExpectedConditions
							.visibilityOfElementLocated(Contra_BBCAvailabilityAmount_Equal_Xpath));
			Thread.sleep(100);
			String ActualAmount = verifyIneligibilityAmountWebE.getText();
			if (ActualAmount.equalsIgnoreCase(ReasonAmount)) {
				System.out.println(ReasonAmount);
				return true;
			} else {
				return false;
			}
		}

		catch (Exception ex) {

			return false;
		}

	}

	public boolean verifyIneligibilityReasonBBCReport_Equal(String ReasonData) {
		try {
			WebElement verifyIneligibilityReasonWebE = new WebDriverWait(
					driver, 20)
					.until(ExpectedConditions
							.visibilityOfElementLocated(Contra_BBCReportReason_Equal_Xpath));
			Thread.sleep(100);
			String ActualReason = verifyIneligibilityReasonWebE.getText()
					.trim();
			if (ActualReason.equalsIgnoreCase(ReasonData)) {
				System.out.println(ReasonData);
				return true;
			} else {
				return false;
			}
		}

		catch (Exception ex) {

			return false;
		}

	}

	public boolean verifyIneligibilityAmountBBCReport_Equal(String ReasonAmount) {
		try {
			WebElement verifyIneligibilityAmountWebE = new WebDriverWait(
					driver, 20)
					.until(ExpectedConditions
							.visibilityOfElementLocated(Contra_BBCReportAmount_Equal_Xpath));
			Thread.sleep(100);
			String ActualAmount = verifyIneligibilityAmountWebE.getText()
					.trim();
			if (ActualAmount.equalsIgnoreCase(ReasonAmount)) {
				System.out.println(ReasonAmount);
				return true;
			} else {
				return false;
			}
		}

		catch (Exception ex) {

			return false;
		}

	}

	public boolean verifyIneligibilityReason_IneligibleEligibleReceivableAnalysisReportBy_Reason_Equal(
			String ReasonData) {
		try {
			WebElement verifyIneligibilityReasonWebE = new WebDriverWait(
					driver, 20)
					.until(ExpectedConditions
							.visibilityOfElementLocated(Contra_IneligibleEligibleAnalysis_Reason_Reason_Equal_Xpath));
			Thread.sleep(100);
			String ActualReason = verifyIneligibilityReasonWebE.getText()
					.trim();
			if (ActualReason.equalsIgnoreCase(ReasonData)) {
				System.out.println(ReasonData);
				return true;
			} else {
				return false;
			}
		}

		catch (Exception ex) {

			return false;
		}

	}

	public boolean verifyIneligibilityAmount_IneligibleEligibleReceivableAnalysisReportBy_Reason_Equal(
			String ReasonAmount) {
		try {
			WebElement verifyIneligibilityAmountWebE = new WebDriverWait(
					driver, 20)
					.until(ExpectedConditions
							.visibilityOfElementLocated(Contra_IneligibleEligibleAnalysis_Reason_Amount_Equal_Xpath));
			Thread.sleep(100);
			String ActualAmount = verifyIneligibilityAmountWebE.getText()
					.trim();
			if (ActualAmount.equalsIgnoreCase(ReasonAmount)) {
				System.out.println(ReasonAmount);
				return true;
			} else {
				return false;
			}
		}

		catch (Exception ex) {

			return false;
		}

	}

	public boolean verifyIneligibilityReason_IneligibleEligibleReceivableAnalysisReportBy_Debtor_Equal(
			String ReasonData) {
		try {
			WebElement verifyIneligibilityReasonWebE = new WebDriverWait(
					driver, 20)
					.until(ExpectedConditions
							.visibilityOfElementLocated(Contra_IneligibleEligibleAnalysis_Debtor_Reason_Equal_Xpath));
			Thread.sleep(100);
			String ActualReason = verifyIneligibilityReasonWebE.getText()
					.trim();
			if (ActualReason.equalsIgnoreCase(ReasonData)) {
				System.out.println(ReasonData);
				return true;
			} else {
				return false;
			}
		}

		catch (Exception ex) {

			return false;
		}

	}

	public boolean verifyIneligibilityAmount_IneligibleEligibleReceivableAnalysisReportBy_Debtor_Equal(
			String ReasonAmount) {
		try {
			WebElement verifyIneligibilityAmountWebE = new WebDriverWait(
					driver, 20)
					.until(ExpectedConditions
							.visibilityOfElementLocated(Contra_IneligibleEligibleAnalysis_Debtor_Amount_Equal_Xpath));
			Thread.sleep(100);
			String ActualAmount = verifyIneligibilityAmountWebE.getText()
					.trim();
			if (ActualAmount.equalsIgnoreCase(ReasonAmount)) {
				System.out.println(ReasonAmount);
				return true;
			} else {
				return false;
			}
		}

		catch (Exception ex) {

			return false;
		}

	}

	public boolean verifyIneligibilityReason_BBCManagementReport_Equal(
			String ReasonData) {
		try {
			WebElement verifyIneligibilityReasonWebE = new WebDriverWait(
					driver, 20)
					.until(ExpectedConditions
							.visibilityOfElementLocated(Contra_Management_Reason_Equal_Xpath));
			Thread.sleep(100);
			String ActualReason = verifyIneligibilityReasonWebE.getText();
			if (ActualReason.equalsIgnoreCase(ReasonData)) {
				System.out.println(ReasonData);
				return true;
			} else {
				return false;
			}
		}

		catch (Exception ex) {

			return false;
		}

	}

	public boolean verifyIneligibilityAmount_BBCManagementReport_Equal(
			String ReasonAmount) {
		try {
			WebElement verifyIneligibilityAmountWebE = new WebDriverWait(
					driver, 20)
					.until(ExpectedConditions
							.visibilityOfElementLocated(Contra_Management_Amount_Equal_Xpath));
			Thread.sleep(100);
			String ActualAmount = verifyIneligibilityAmountWebE.getText();
			if (ActualAmount.equalsIgnoreCase(ReasonAmount)) {
				System.out.println(ReasonAmount);
				return true;
			} else {
				return false;
			}
		}

		catch (Exception ex) {

			return false;
		}
	}

	public boolean purgeBBC(String SelectApprovedClient) {
		try {
			this.navigationToBBCToApproved();
			this.clickonAllClientDropdown("NEW_CONT_AUTOMATION");
			this.clickonSearchButton();
			this.SelectCheckBox();
			this.clickonPurgeButton();
			return true;
		}

		catch (Exception ex) {
			return false;
		}
	}

	public boolean navigationToBBCToApproved() {
		try {
			this.MouseOverOnMenu();
			this.moveToLeftNavigation("ABL");
			WebElement navigateToIneligibleSummaryWebElement = new WebDriverWait(
					driver, 1000).until(ExpectedConditions
					.elementToBeClickable(ToBBCToApproved_Xpath));
			navigateToIneligibleSummaryWebElement.click();
			Thread.sleep(1000);
			return true;
		}

		catch (Exception ex) {
			return false;
		}
	}

	public boolean clickonPurgeButton() {
		try {
			WebElement clickonUnreleaseButtonWebElement = new WebDriverWait(
					driver, 1000).until(ExpectedConditions
					.elementToBeClickable(ClickonPurgeButton_Xpath));
			clickonUnreleaseButtonWebElement.click();
			Thread.sleep(1000);
			Alert simpleAlert = driver.switchTo().alert();
			simpleAlert.accept();
			Thread.sleep(2000);
			return true;
		}

		catch (Exception ex) {
			return false;
		}

	}

	// rohit

	public boolean verifyElementIsPresent() {
		try {
			List<WebElement> list = driver.findElements(verifyAllField_xpath);
			for (WebElement e : list) {

				e.isDisplayed();
				return true;
			}
			return true;
		}

		catch (Exception ex) {
			return false;
		}

	}

	public boolean contrasHeader(String HeaderData) {
		try {
			WebElement contrasHeaderWebEelement = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(contrasHeader_xpath));
			String data = contrasHeaderWebEelement.getText().trim();
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

	public boolean searchCustomerAccountNo(String accountName) {
		try {
			WebElement HeaderWebEelement = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(searchAccountNo_xpath));
			HeaderWebEelement.clear();
			HeaderWebEelement.sendKeys(accountName);
			Thread.sleep(2000);

			return true;

		} catch (Exception e) {
			return false;
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
	
	public boolean searchCustomerAccountName(String accountName) {
		try {
			WebElement HeaderWebEelement = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(searchAccountName_xpath));
			HeaderWebEelement.clear();
			HeaderWebEelement.sendKeys(accountName);
			Thread.sleep(2000);

			return true;

		} catch (Exception e) {
			return false;
		}
	}
	public boolean firstAccountNameValidation(String expected) {
		try {
			WebElement firstAccountNoWebElement = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(firstAccountName_xpath));

			String actual = firstAccountNoWebElement.getText();
			if (actual.equals(expected))
				return true;
			else
				return false;

		} catch (Exception e) {
			return false;
		}
	}
	public boolean searchVendorAccount(String accountName) {
		try {
			WebElement HeaderWebEelement = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(searchvendorAccount_xpath));
			HeaderWebEelement.clear();
			HeaderWebEelement.sendKeys(accountName);
			Thread.sleep(5000);

			return true;

		} catch (Exception e) {
			return false;
		}
	}
	public boolean verifyVendorAccount(String expected) {
		try {
			WebElement firstAccountNoWebElement = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(vendorAccount_xpath));

			String actual = firstAccountNoWebElement.getText();
			if (actual.equals(expected))
				return true;
			else
				return false;

		} catch (Exception e) {
			return false;
		}
	}
	public boolean searchVendorName(String accountName) {
		try {
			WebElement HeaderWebEelement = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(searchvendorName_xpath));
			HeaderWebEelement.clear();
			HeaderWebEelement.sendKeys(accountName);
			Thread.sleep(5000);

			return true;

		} catch (Exception e) {
			return false;
		}
	}
	public boolean verifyVendorName(String expected) {
		try {
			WebElement firstAccountNoWebElement = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(vendorName_xpath));

			String actual = firstAccountNoWebElement.getText();
			if (actual.equals(expected))
				return true;
			else
				return false;

		} catch (Exception e) {
			return false;
		}
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
	public boolean verifyAscendingAndDescendingOrderOfCustomerName() {
		try {

			List<WebElement> list = driver.findElements(allCustomerNameData);
			List<String> mainList = new ArrayList<String>();
			for (WebElement G : list) {
				mainList.add(G.getText().toString());
			}

			WebElement closeWebelement = new WebDriverWait(driver, 20)
					.until(ExpectedConditions
							.visibilityOfElementLocated(clickAsceendingBtnCustomerName));
			closeWebelement.click();

			Thread.sleep(5000);

			closeWebelement.click();

			List<WebElement> list2 = driver.findElements(allCustomerNameData);
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
	public boolean verifyAscendingAndDescendingOrderOfVendorAccount() {
		try {

			List<WebElement> list = driver.findElements(allVendorAccount);
			List<String> mainList = new ArrayList<String>();
			for (WebElement G : list) {
				mainList.add(G.getText().toString());
			}

			WebElement closeWebelement = new WebDriverWait(driver, 20)
					.until(ExpectedConditions
							.visibilityOfElementLocated(clickAsceendingBtnVendorAccount));
			closeWebelement.click();

			Thread.sleep(5000);

			closeWebelement.click();

			List<WebElement> list2 = driver.findElements(allVendorAccount);
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
	
	public boolean verifyAscendingAndDescendingOrderOfVendorName() {
		try {

			List<WebElement> list = driver.findElements(allVendorName);
			List<String> mainList = new ArrayList<String>();
			for (WebElement G : list) {
				mainList.add(G.getText().toString());
			}

			WebElement closeWebelement = new WebDriverWait(driver, 20)
					.until(ExpectedConditions
							.visibilityOfElementLocated(clickAsceendingBtnVendorName));
			closeWebelement.click();

			Thread.sleep(5000);

			closeWebelement.click();

			List<WebElement> list2 = driver.findElements(allVendorName);
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
	public boolean customerAccountTextBox(String accountName) {
		try {
			WebElement HeaderWebEelement = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(customerAccountTextBox_xpath));
			HeaderWebEelement.clear();
			HeaderWebEelement.sendKeys(accountName);
			Thread.sleep(2000);

			return true;

		} catch (Exception e) {
			return false;
		}
	}
	
	public boolean customerNameTextBox(String accountName) {
		try {
			WebElement HeaderWebEelement = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(customerNameTextBox_xpath));
			HeaderWebEelement.clear();
			HeaderWebEelement.sendKeys(accountName);
			Thread.sleep(2000);

			return true;

		} catch (Exception e) {
			return false;
		}
	}
	
	public boolean vendorAccountTextBox(String accountName) {
		try {
			WebElement HeaderWebEelement = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(vendorAccountTextBox_xpath));
			HeaderWebEelement.clear();
			HeaderWebEelement.sendKeys(accountName);
			Thread.sleep(2000);

			return true;

		} catch (Exception e) {
			return false;
		}
	}
	
	public boolean vendorNameTextBox(String accountName) {
		try {
			WebElement HeaderWebEelement = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(vendorNameTextBox_xpath));
			HeaderWebEelement.clear();
			HeaderWebEelement.sendKeys(accountName);
			Thread.sleep(2000);

			return true;

		} catch (Exception e) {
			return false;
		}
	}
	
	public boolean customerAccountAutoSuggestion() {
		try {

			List<WebElement> list = driver.findElements(customerAccountAutoSuggestion_xpath);
			for (WebElement G : list) {
				G.isDisplayed();
			}
			return true;
		}

		catch (Exception ex) {
			return false;
		}
	}
	public boolean customerNameAutoSuggestion() {
		try {

			List<WebElement> list = driver.findElements(customerNameAutoSuggestion_xpath);
			for (WebElement G : list) {
				G.isDisplayed();
			}
			return true;
		}

		catch (Exception ex) {
			return false;
		}
	}
	
	public boolean vendorAccountAutoSuggestion() {
		try {

			List<WebElement> list = driver.findElements(vendorAccountAutoSuggestion_xpath);
			for (WebElement G : list) {
				G.isDisplayed();
			}
			return true;
		}

		catch (Exception ex) {
			return false;
		}
	}
	
	public boolean vendorNameAutoSuggestion() {
		try {

			List<WebElement> list = driver.findElements(vendorNameAutoSuggestion_xpath);
			for (WebElement G : list) {
				G.isDisplayed();
			}
			return true;
		}

		catch (Exception ex) {
			return false;
		}
	}
	public boolean exportLink() {
		try {
			WebElement saveOnDebtorsScreeneWebE = new WebDriverWait(driver, 20)
					.until(ExpectedConditions
							.visibilityOfElementLocated(exportLink_xpath));
			Thread.sleep(100);
			saveOnDebtorsScreeneWebE.click();
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public boolean downloadFile() {
		try {
			WebElement saveOnDebtorsScreeneWebE = new WebDriverWait(driver, 20)
					.until(ExpectedConditions
							.visibilityOfElementLocated(downloadFile_xpath));
			Thread.sleep(100);
			saveOnDebtorsScreeneWebE.click();
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public boolean unselectAllCheckboxFromExport() {
		try {
			new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(exportCheckBox_xpath));

			List<WebElement> list = driver
					.findElements(exportCheckBox_xpath);
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
							.visibilityOfElementLocated(errorMessage_xpath));
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
}
