package com.cync.base;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;







import com.cync.CashAppPages.BatchCashPage;
import com.cync.CashAppPages.BatchProcessPage;
import com.cync.CashAppPages.CashReceiptHistoryPage;
import com.cync.CashAppPages.CheckRegisterPage;
import com.cync.CashAppPages.DailyCashPostingPage;
import com.cync.CashAppPages.DailyCashTransactionReportingPage;
import com.cync.ClientMaintenance.ActivityPage;


import com.cync.ClientMaintenance.BucketAgingPage;

import com.cync.ClientMaintenance.CommentsPages;
import com.cync.ClientMaintenance.ContactsPage;
import com.cync.ClientMaintenance.ExceptionPage;
import com.cync.FactoringPages.FactoringFeeSetupPage;

import com.cync.ClientMaintenance.MailAddressPages;
import com.cync.ClientMaintenance.MiscellaneousPage;

import com.cync.ClientMaintenance.ReportCommentsPage;



import com.cync.FactoringPages.ACDebtorStatusPageFactoring;
import com.cync.FactoringPages.AccountDebtorPage;
import com.cync.FactoringPages.AccountDebtorPageFactoring;
import com.cync.FactoringPages.ActivityTicklerPageFactoring;
import com.cync.FactoringPages.AutoProcessingFeeSetupPageFactoring;
import com.cync.FactoringPages.BasicClientDetailPageFactoring;
import com.cync.FactoringPages.BatchProcessScreenPageFactoring;
import com.cync.FactoringPages.BrokerBankInformationPageFactoring;
import com.cync.FactoringPages.BrokerCommissionPageFactoring;
import com.cync.FactoringPages.BrokerFeeSetupPageFactoring;
import com.cync.FactoringPages.BrokerInquiryPage;
import com.cync.FactoringPages.BrokerSetupPageFactoring;
import com.cync.FactoringPages.BucketAgingPageFactoring;
import com.cync.FactoringPages.CashReceiptPageFactoring;
import com.cync.FactoringPages.CashReservePageFactoring;
//import com.cync.FactoringPages.ClientFundedARAgingPage;
import com.cync.FactoringPages.ClientSummaryPageFactoring;
import com.cync.FactoringPages.CollectionTicklerPageFactoring;
import com.cync.FactoringPages.CommentsPageFactoring;
import com.cync.FactoringPages.ContactsPageFactoring;
import com.cync.FactoringPages.CreditMemoAdjustmentPage;
import com.cync.FactoringPages.CreditMemoHistoryPage;
import com.cync.FactoringPages.CreditQueuePageFactoring;
import com.cync.FactoringPages.CreditSourcesPageFactoring;
import com.cync.FactoringPages.DataUploadPage;
import com.cync.FactoringPages.DebtorMatchingPageFactoring;
import com.cync.FactoringPages.DepositUploadPage;
import com.cync.FactoringPages.DuplicateInvoicesPageFactoring;
import com.cync.FactoringPages.EscrowReservePageFactoring;
import com.cync.FactoringPages.ExceptionsPageFactoring;
import com.cync.FactoringPages.FactoringChargeCodesPage;
import com.cync.FactoringPages.FactoringChargesTemplatePage;
import com.cync.FactoringPages.FactoringClientCreationPage;
import com.cync.FactoringPages.FactoringFileUploadPage;
import com.cync.FactoringPages.FactoringGLSetupPage;
import com.cync.FactoringPages.FactoringGLTransactionsPage;
import com.cync.FactoringPages.FactoringMigrationPage;
import com.cync.FactoringPages.FollowUpActionsPageFactoring;
import com.cync.FactoringPages.FundedInvoicesPageFactoring;
import com.cync.FactoringPages.FundsEmployedPageFactoring;
import com.cync.FactoringPages.GlobalDebtorPageFactoring;
import com.cync.FactoringPages.InactiveClientsPageFactoring;
import com.cync.FactoringPages.IneligiblePageFactoring;
import com.cync.FactoringPages.InvoiceStatusPageFactoring;
import com.cync.FactoringPages.InvoiceValidationTemplatePage;
import com.cync.FactoringPages.InvoiceValidationTemplatePageFactoring;
import com.cync.FactoringPages.LegalContentPageFactoring;
import com.cync.FactoringPages.LetterAuditPageFactoring;
import com.cync.FactoringPages.LetterProcessingPageFactoring;
import com.cync.FactoringPages.LetterTrackingPageFactoring;
import com.cync.FactoringPages.MailAddressPageFactoring;
import com.cync.FactoringPages.ManualEntryPage;
import com.cync.FactoringPages.MappingListViewPageFactoring;
import com.cync.FactoringPages.MiscellaneousPageFactoring;
import com.cync.FactoringPages.NewInvoicesPage;
import com.cync.FactoringPages.BasicParametersPageFactoring;
import com.cync.FactoringPages.PreVerificationPageFactoring;
import com.cync.FactoringPages.ProcessedBatchesPages;
import com.cync.FactoringPages.ProcessingHistoryPageFactoring;
import com.cync.FactoringPages.RecoursePageFactoring;
import com.cync.FactoringPages.RepaymentReportPage;
import com.cync.FactoringPages.ReportCommentsPageFactoring;
import com.cync.FactoringPages.ReportsFactoringPage;
import com.cync.FactoringPages.ReserveReleasePageFactoring;
import com.cync.FactoringPages.TermCodesPageFactoring;
import com.cync.FactoringPages.Ungrouped_checksPage;
import com.cync.FactoringPages.VerifiedPageFactoring;
import com.cync.FactoringPages.WarningPageFactoring;

import com.cync.pages.*;





public class CyncMenus {

	static Logger log = Logger.getLogger(AdjustmentReasonPage.class.getName());

	WebDriver driver;

	// private final By menuItem_xpath=By.xpath("//span[text()='Menu']");
	// private final By
	// menuItem_xpath=By.xpath("//div[@id='b_c_area']//descendant::div[@id='hamburger_icon']");
	private final By menuItem_xpath = By.id("top-menu");
	private final By salesRegions_xpath = By
			.xpath("//a[text()='Sales Regions']");

	private final By Content_xpath = By
			.xpath("//a[contains(text(),'Content')]");
	private final By commentsType_xpath = By
			.xpath("//a[contains(text(),'Comment Types')]");
	private final By masterSearch_xpath = By
			.xpath("//div[@class='search_bar input-group']//descendant::input[@id='searchInputId']");
	private final By systemparameters_xpath = By
			.xpath("//a[contains(text(),'System Parameters')]");
	private final By notificationSettings_xpath = By
			.xpath("//a[contains(text(),'Notification Settings')]");
	private final By templates_xpath = By.xpath("//a[text()='Templates']");
	private final By auditLogs_xpath = By.xpath("//a[text()='Audit Logs']");
	private final By automatedTaskLogs_xpath = By
			.xpath("//a[text()='Automated Task Logs']");

	private final By NAICSCode_xpath = By.xpath("//a[text()='NAICS Codes']");
	private final By basicDetails_xpath = By
			.xpath("//a[text()='Basic Details']");

	private final By notificationLogs_xpath = By
			.xpath("//a[text()='Notification Logs']");

	private final By createClient_xpath = By
			.xpath("//a[text()='Create ABL Client ']");
	private final By adjustmentReason_xpath = By
			.xpath("//a[text()='Adjustment Reasons']");
	private final By ReportTemplate_xpath = By
			.xpath("//a[contains(text(),'Report Templates')]");
	private final By bankDetails_xpath = By.xpath("//a[text()='Bank Details']");

	
	private final By basicParameter_xpath = By
			.xpath("(//a[text()='Basic Parameters'])[1]");
	

	private final By FundRequest_xpath = By.xpath("//a[text()='Fund Request']");

	private final By selectClient_xpath = By
			.id("select2-choose_borrower-container");
	private final By searchClientTextBox_xpath = By
			.xpath("//input[@type='search']");
	private final By searchClient_xpath = By
			.xpath("//span[@class='select2-results']");

	


	private final By BasicClientDetailPage_xpath = By
			.xpath("(//a[text()='Basic Client Detail'])[1]");
	private final By InactivrClientsPage_xpath = By
			.xpath("//a[text()='Inactive Clients']");
	


	private final By receivableAging_xpath = By
			.xpath("(//a[text()='Receivable Aging'])[1]");
	private final By enterNewSalesInvoices_xpath = By
			.xpath("//a[text()='Enter New Sale Invoices']");

	private final By detailReceivables_xpath = By
			.xpath("//a[text()='Detail Receivables']");

	private final By BatchCashPage_xpath = By
			.xpath("(//a[text()='Batch Cash Receipts Entry'])[1]");
	private final By FundingStylePage_xpath = By
			.xpath("(//a[text()='Funding Style'])[1]");
	private final By FinancialAnalyzerPage_xpath = By
			.xpath("(//a[contains(text(),'Financial Analyzer')])[2]");

	private final By ineligibleSummary_xpath = By
			.xpath("//a[text()='Ineligible Summary']");
	private final By debtors_xpath = By.xpath("//a[text()='Debtors']");
	private final By vendors_xpath = By.xpath("//a[text()='Vendors']");

	//rohit
	private final By ablFileUploads_xpath = By
			.xpath("//*[@id='FLUL104']//a[text()='ABL File Uploads']");

/*	private final By mappingListView_xpath = By
			.xpath("(//a[text()='Mapping List View'])[1]");*/

	private final By bbcFilesRequired_xpath = By
			.xpath("//a[text()='BBC Files Required']");

	private final By CheckRegisterPage_xpath = By
			.xpath("(//a[text()='Check Register'])[1]");
	private final By BatchProcessPage_xpath = By
			.xpath("(//a[text()='Batch Process'])[1]");
	private final By CashReceiptHistoryPage_xpath = By
			.xpath("(//a[text()='Cash Receipt History'])[1]");

	private final By userdefinedfield_xpath = By
			.xpath("//a[text()='User Defined Field']");

	// Credit Line
	private final By creditLineLoanS_xpath = By
			.xpath("//a[text()='Credit Line Loan Creation']");
	private final By creditLineSetupS_xpath = By
			.xpath("//a[text()='Credit Line Charges Setup']");
	private final By creditLineCollateralSetUpS_xpath = By
			.xpath("//a[text()='Credit Line Collateral Setup']");


	/*
	 * private final By
	 * clientDropdown=By.xpath("//span[text()='Select Client']"); private final
	 * By
	 * clientDropdownTextbox=By.xpath("//input[@class='select2-search__field']"
	 * ); private final By
	 * selectclientFromDropdown=By.xpath("//li[text()='AUTOMATIONCLIENT']");
	 */

	private final By basicParameters_xpath = By
			.xpath("//a[text()='Basic Parameters']");

	private final By ClientSummary_xpath = By
			.xpath("//a[contains(text(),'Client Summary')]");
	private final By InactiveClients_xpath = By
			.xpath("//a[contains(text(),'Inactive Clients')]");
	private final By BasicParameters_xpath = By
			.xpath("//a[contains(text(),'Basic Parameters')]");
	private final By CollateralAdvanceRate_xpath = By
			.xpath("//a[contains(text(),'Collateral Advance Rate')]");
	private final By IneligibleCalculations_xpath = By
			.xpath("//a[contains(text(),'Ineligible Calculations')]");
	private final By SeasonalAdvanceRate_xpath = By
			.xpath("//a[contains(text(),'Seasonal Advance Rate')]");
	private final By BucketAging_xpath = By
			.xpath("//a[contains(text(),'Bucket Aging')]");
	private final By BBCFilesRequired_xpath = By
			.xpath("//a[contains(text(),'BBC Files Required')]");
	private final By ClientBBCOptions_xpath = By
			.xpath("//a[contains(text(),'Client BBC Options')]");
	private final By OtherFilesRequired_xpath = By
			.xpath("//a[contains(text(),'Other Files Required')]");
	private final By ActivityTickler_xpath = By
			.xpath("//a[contains(text(),'Activity Tickler')]");
	private final By Comments_xpath = By
			.xpath("//a[contains(text(),'Comments')]");
	private final By ReportComments_xpath = By
			.xpath("//a[contains(text(),'Report Comments')]");
	private final By Exceptions_xpath = By
			.xpath("//a[contains(text(),'Exceptions')]");
	private final By FundingStyle_xpath = By
			.xpath("//a[contains(text(),'Funding Style')]");
	private final By CollateralReserves_xpath = By
			.xpath("//a[contains(text(),'Collateral Reserves')]");
	private final By AssetAmortization_xpath = By
			.xpath("//a[contains(text(),'Asset Amortization')]");

	private final By MappingListView_Xpath = By
			.xpath("//a[contains(text(),'Mapping List View')]");
	private final By CreateABLClient_Xpath = By
			.xpath("//a[contains(text(),'Create ABL Client')]");
	private final By CreateFactoringClient_Xpath = By
			.xpath("//a[contains(text(),'Create Factoring Client')]");
	private final By BasicClientDetails_Xpath = By
			.xpath("//a[contains(text(),'Basic Client Detail')]");
	private final By MailAddress_Xpath = By
			.xpath("//a[contains(text(),'Mail Address')]");
	private final By Contacts_Xpath = By
			.xpath("//a[contains(text(),'Contacts')]");
	private final By Miscellaneous_Xpath = By
			.xpath("//a[contains(text(),'Miscellaneous')]");
	private final By LegalContent_Xpath = By
			.xpath("//a[contains(text(),'Legal Content')]");
	private final By Guarantors_Xpath = By
			.xpath("//a[contains(text(),'Guarantors')]");
	private final By LoanFees_Xpath = By
			.xpath("//a[contains(text(),'Loan Fees')]");
	private final By IneligibleAdvances_Xpath = By
			.xpath("//a[contains(text(),'Ineligible / Advances')]");

	private final By DailyCashPostingPage_xpath = By
			.xpath("(//a[text()='Daily Cash Posting'])[1]");
	private final By DailyCashTransactionReportingPage_xpath = By
			.xpath("(//a[text()='Daily Cash Transaction Reporting'])[1]");
	private final By CashReceipt_xpath = By
			.xpath("(//a[text()='Cash Receipts'])[2]");
	private final By ablGLTranactions_xpath = By
			.xpath("(//a[text()='ABL GL Transactions'])[1]");

	private final By reports_xpath = By.xpath("//a[text()='Reports']");

	private final By bbcreviewdate_xpath = By
			.xpath("(//div//a[text()='BBC Review Data'])[2]");
	private final By summaryReceivablesSanity_xpath = By
			.xpath("//a[contains(text(),'Summary Receivables')]");
	private final By BBCstobeMovedforfundingSanityCA_xpath = By
			.xpath("//a[contains(text(),' Moved for Funding')]");
	private final By BBCstobeFundedSanityCA_xpath = By
			.xpath("//a[contains(text(),' to be Funded')]");
	private final By SeasonalAdvanceRatePage_xpath = By
			.xpath("(//a[text()='Seasonal Advance Rates'])[1]");
	private final By CollateralReservePage_xpath = By
			.xpath("(//a[text()='Collateral Reserves'])[1]");

	private final By bbcFilesRequiredPage_xpath = By
			.xpath("(//a[contains(text(),'BBC Files Required')])[1]");
	private final By CreditMemoPage_xpath = By
			.xpath("(//a[text()='Credit Memo'])[1]");

	private final By AssetInventoryDataUpload_xpath = By
			.xpath("(//a[text()='Assets / Inventory'])[1]");
	private final By DataUploadSummaryPayblesPage_xpath = By
			.xpath("(//a[text()='Summary Payables'])[1]");
	private final By BBCDocumentsWebEelement_xpath = By
			.xpath("(//a[text()='BBC Documents'])[1]");

	private final By DataReviewHistory_xpath = By
			.xpath("(//a[text()='Data Review History'])[1]");

	private final By summaryReceivablesHistory_xpath = By
			.xpath("(//a[text()='Summary Receivables'])[2]");
	private final By SummaryPayblesHistoryPage_xpath = By
			.xpath("(//a[text()='Summary Payables'])[2]");

	private final By AssetInventoryDataUploadHistory_xpath = By
			.xpath("(//a[text()='Assets / Inventory'])[3]");
	private final By openBBCReviewDataHistory_xpath = By
			.xpath("(//a[text()='BBC Review Data'])[2]");
	private final By AmendDetailsHistoryPage_xpath = By
			.xpath("(//a[text()='Amend Details'])[1]");

	private final By financialAnalyzer_xpath = By
			.xpath("//a[text()='Financial Analyzer']");
	private final By clientSummaryPage_xpath = By
			.xpath("//a[text()='Client Summary']");

	private final By dailytransactionreporting_xpath = By
			.xpath("//a[.='Daily Transaction Reporting']");

	// other collateral _manual input
	private final By otherCollateralInput_xpath = By
			.xpath("(//a[text()='Other Collateral'])[1]");

	// Receivables rollforward manual input
	private final By receivableRollforwardInput_xpath = By
			.xpath("(//a[text()='Receivables Rollforward'])[1]");

	// Asset inventory manual input
	private final By assetsInventoryInputPage_xpath = By
			.xpath("(//a[text()='Assets / Inventory'])[2]");

	// BBC Review Data _manual input history
	private final By bbcReviewDataManualHistory_xpath = By
			.xpath("(//a[text()='BBC Review Data'])[2]");

	private final By LetterOfCredit_xpath = By
			.xpath("(//a[contains(text(),'Letter of Credit')])[1]");

	private final By ProcessOneTimeAndManualCharge_xpath = By
			.xpath("(//a[text()='Process OneTime & Manual Charges'])[1]");

	private final By PayoffInquiry_xpath1 = By
			.xpath("(//a[text()='Payoff Inquiry'])[1]");

	private final By InterestRecalculation_xpath = By
			.xpath("(//a[contains(text(),'Interest Recalculation')])[1]");

	private final By InterestPayment_xpath = By
			.xpath("(//a[contains(text(),'Interest Payment')])[1]");

	private final By cashReciptSource_xpath = By
			.xpath("//a[text()='Cash Receipt Source Codes']");

	private final By interestPaymentPage_xpath = By
			.xpath("//a[contains(text(),'Interest Payment')]");

	private final By CollateralReservesePage_xpath = By
			.xpath("(//a[text()='Collateral Reserves'])[1]");
	private final By IneligibilityReasonsPage_xpath = By
			.xpath("//a[text()='Ineligibility Reasons']");

	private final By fundReleaseBBCPageOpen_xpath = By
			.xpath("(//a[text()='Fund / Release BBC'])[1]");

	private final By BBCtobeApproved_xpath = By
			.xpath("//*[@id='FLUL32']/li[2]/a");
	private final By OtherFileRequired_xpath = By
			.xpath("(//a[contains(text(),'Other Files Required')])[1]");
	private final By CommentsPages_xpath = By
			.xpath("(//a[contains(text(),'Comments')])[1]");
	private final By EmailAddress_xpath = By
			.xpath("(//a[contains(text(),'Mail Address')])[1]");
	private final By Contacts_xpath = By.xpath("(//a[text()='Contacts'])[1]");
	private final By MiscellaneousPage_xpath = By
			.xpath("(//a[text()='Miscellaneous'])[1]");
	private final By ReportCommentsPage_xpath = By
			.xpath("(//a[text()='Report Comments'])[1]");
	private final By receive2_xpath = By
			.xpath("(//a[text()='Receivable Aging'])[2]");
	private final By chargeCodes_xpath = By.xpath("//a[text()='Charge Codes']");
	private final By InterestRateCodes_xpath = By
			.xpath("//a[text()='Interest Rate Codes']");
	private final By colla_xpath = By.xpath("//a[contains(text(), 'Collateral Loan Activity')]");
	private final By Exception_xpath=By.xpath("(//a[text()='Exceptions'])[1]");

	private final By interestStatement_xpath = By.xpath("//a[contains(text(), 'Interest Charges Statement')]");
	private final By VendorParentChildRelation_xpath=By.xpath("(//a[contains(text(),'Vendor Parent Child Relation')])[1]");
	private final By DetailPayablesPage_xpath=By.xpath("//a[contains(text(),'Detail Payables')][1]");
	private final By SummaryPayablepage_xpath=By.xpath("//a[contains(text(),'Summary Payables')][1]");
	private final By detailsPayableHistoryPage_xpath=By.xpath("(//a[contains(text(),'Detail Payables')])[2]");
	private final By SummaryPayableHistoryPage_xpath=By.xpath("(//a[text()='Summary Payables'])[2]");

	private final By DetailReceivablePageHistory_xpath=By.xpath("(//a[text()='Detail Receivables'])[2]");

	private final By DetailPayblesHistoryPage_xpath = By
		.xpath("(//a[text()='Detail Payables'])[2]");

	private final By collateraLoanFeeSetup_xpath=By.xpath("//a[contains(text(),'Collateral Loan Fee Setup')]");

	

	private final By ineligibilityReasons_xpath=By
			.xpath("//a[contains(text(),'Ineligibility Reasons')]");
	
	 
	 private final By unusedLoanReport_xpath = By.xpath("//a[contains(text(), 'Unused Loan')]");
	 private final By LoanReport_xpath = By.xpath("//a[contains(text(), 'Loan Report')]");
	 
	 //Factoring
	 private final By ActivityTicklerPageFactoring_xpath=By.xpath("//a[contains(text(),'Activity Tickler')]");
	 private final By BasicparameterFactoring_xpath=By.xpath("//div[@class='seperationDiv seperate_forthbox']/ul/li/a[text()='Basic Parameters']");
	 
	 private final By factoringClientCreation_xpath = By.xpath("//a[text()='Create Factoring Client']");
	 private final By factoringFeeSetup_xpath = By.xpath("//a[contains(text(),'Factoring Fee Setup')]");
	 private final By factoringFileUpload_xpath = By.xpath("(//a[contains(text(),'Factoring File Uploads')])[1]");
	 private final By newInvoices_xpath = By.xpath("//a[contains(text(),'New Invoices')]");
	 private final By dataUpload_xpath = By.xpath("//a[contains(text(),'Data Upload')]");
	 private final By invoiceValidationTemplate_xpath = By.xpath("//a[contains(text(),'Invoice Validation Template')]");
	 private final By accountDebtors_xpath = By.xpath("//a[contains(text(),'Account Debtor')]");
	 private final By manualEntry_xpath = By.xpath("(//a[contains(text(),'Manual Entry')])[1]");
	
	
 
	//ineligible customer
		 private final By bbcavailabilityhistorypage_xpath=By.xpath("(//a[text()='BBC Availability'])[2]");
	 private final By mappingListView_xpath=By.xpath("(//a[text()='Mapping List View'])[1]");

	 //rohit
	 private final By opencashReceiptsPage_xpath = By.xpath("//a[text()='Open Batch Cash Receipts']");



	 
	//ineligible customer
		// private final By bbcavailabilityhistorypage_xpath=By.xpath("(//a[text()='BBC Availability'])[2]");

		 /////unapproved bbc page
		 private final By unapprovebbc_xpath=By.xpath("(//a[text()='Unapproved BBCs'])[1]");
		 private final By assetinventoryhistorypage_xpath=By.xpath("(//a[text()='Assets / Inventory'])[4]");
		 private final By ablFileUploadData_xpath=By.xpath("(//*[@class='ui-datatable-resizable']//tr)[2]");
		 
	public CyncMenus(WebDriver driver) {
		this.driver = driver;
	}

	public boolean MouseOverOnMenu() {
		try {
			WebElement menuItemWebE = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(menuItem_xpath));
			menuItemWebE.click();
			/* new Actions(driver).moveToElement(menuItemWebE).perform(); */

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

	public boolean NavigateSalesRegion() {
		try {
			WebElement salesRegionWebEelement = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(salesRegions_xpath));
			salesRegionWebEelement.click();
			return true;
		} catch (Exception ex) {
			return false;
		}

	}

	public SalesRegion openSalesRegion() {
		try {
			this.MouseOverOnMenu();
			this.moveToLeftNavigation("Administration");
			WebElement salesRegionWebEelement = new WebDriverWait(driver, 1000)
					.until(ExpectedConditions
							.elementToBeClickable(salesRegions_xpath));
			salesRegionWebEelement.click();
			//Thread.sleep(10000);
			return new SalesRegion(driver);
		} catch (Exception ex) {
			return null;
		}
	}

	public SalesRegion MouseOverOnMenuSales() {
		try {
			WebElement menuItemWebE = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(menuItem_xpath));
			new Actions(driver).moveToElement(menuItemWebE).perform();
			return new SalesRegion(driver);
		} catch (Exception ex) {
			return null;
		}
	}

	public BankDetailsPage openBankDetails() {
		try {
			this.MouseOverOnMenu();
			this.moveToLeftNavigation("Administration");
			WebElement bankDetailsWebEelement = new WebDriverWait(driver, 1000)
					.until(ExpectedConditions
							.elementToBeClickable(bankDetails_xpath));
			bankDetailsWebEelement.click();
			//Thread.sleep(10000);
			return new BankDetailsPage(driver);
		} catch (Exception ex) {
			return null;
		}

	}

	public boolean navigateToContent() {
		try {
			WebElement ContentWebEelement = new WebDriverWait(driver, 90)
					.until(ExpectedConditions
							.visibilityOfElementLocated(Content_xpath));
			ContentWebEelement.click();
			return true;
		} catch (Exception ex) {
			return false;
		}

	}

	public ContentPage openContentPage() {
		try {
			this.MouseOverOnMenu();
			this.moveToLeftNavigation("Administration");
			WebElement salesRegionWebEelement = new WebDriverWait(driver, 1000)
					.until(ExpectedConditions
							.elementToBeClickable(Content_xpath));
			salesRegionWebEelement.click();
			return new ContentPage(driver);
		} catch (Exception ex) {
			return null;
		}

	}

	public CommentTypesPage openCommentsType() {
		try {
			this.MouseOverOnMenu();
			this.moveToLeftNavigation("Administration");
			WebElement commentsWebEelement = new WebDriverWait(driver, 1000)
					.until(ExpectedConditions
							.elementToBeClickable(commentsType_xpath));
			commentsWebEelement.click();
			//Thread.sleep(10000);
			return new CommentTypesPage(driver);
		} catch (Exception ex) {
			return null;
		}
	}

	// use above code to navigate to the page

	public boolean masterSearchUI() {
		try {
			WebElement masterSearchUIWebE = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(masterSearch_xpath));
			// masterSearchUIWebE.isDisplayed();
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}

	public SystemParametersPage openSystemParameters() {
		try {
			this.MouseOverOnMenu();
			this.moveToLeftNavigation("Administration");
			WebElement SystemParametersWebEelement = new WebDriverWait(driver,
					1000).until(ExpectedConditions
					.elementToBeClickable(systemparameters_xpath));
			SystemParametersWebEelement.click();
			//Thread.sleep(10000);
			return new SystemParametersPage(driver);
		} catch (Exception ex) {
			return null;
		}
	}

	public boolean NavigateCommentsType() {
		try {
			WebElement CommentsTypeWebEelement = new WebDriverWait(driver, 1000)
					.until(ExpectedConditions
							.visibilityOfElementLocated(commentsType_xpath));
			CommentsTypeWebEelement.click();
			//Thread.sleep(10000);
			return true;
		} catch (Exception ex) {

		}
		return false;
	}

	public boolean NavigateNotificationSettings() {
		try {
			WebElement NotificationSettingsWebEelement = new WebDriverWait(
					driver, 10).until(ExpectedConditions
					.visibilityOfElementLocated(notificationSettings_xpath));
			NotificationSettingsWebEelement.click();
			return true;
		} catch (Exception ex) {

		}
		return false;
	}

	public boolean NavigateTemplates() {
		try {
			WebElement TemplatesWebEelement = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(templates_xpath));
			TemplatesWebEelement.click();
			return true;
		} catch (Exception ex) {

		}
		return false;
	}

	public TemplatesPage openTemplate() {
		try {
			this.MouseOverOnMenu();
			this.moveToLeftNavigation("Administration");
			WebElement TemplatessWebEelement = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.elementToBeClickable(templates_xpath));
			TemplatessWebEelement.click();
			Thread.sleep(1000);

			return new TemplatesPage(driver);
		} catch (Exception ex) {
			return null;
		}
	}

	public AuditLogPage openAuditLogs() {
		try {
			this.MouseOverOnMenu();
			this.moveToLeftNavigation("Administration");
			WebElement auditLogsWebEelement = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.elementToBeClickable(auditLogs_xpath));
			auditLogsWebEelement.click();

			return new AuditLogPage(driver);
		} catch (Exception ex) {
			return null;
		}

	}

	public AutomatedTaskLogsPage openAutomatedTaskLogs() {
		try {
			this.MouseOverOnMenu();
			this.moveToLeftNavigation("Administration");
			WebElement auditLogsWebEelement = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.elementToBeClickable(automatedTaskLogs_xpath));
			auditLogsWebEelement.click();

			return new AutomatedTaskLogsPage(driver);
		} catch (Exception ex) {
			return null;
		}

	}

	public NAICS_Codes_Page openNAICSCode() {
		try {
			this.MouseOverOnMenu();
			this.moveToLeftNavigation("Administration");

			WebElement NAICSCodeWebEelement = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.elementToBeClickable(NAICSCode_xpath));

			NAICSCodeWebEelement.click();
			//Thread.sleep(10000);
			return new NAICS_Codes_Page(driver);
		} catch (Exception ex) {
			return null;
		}

	}

	public NotificationCentrePage openNotificationSettings() {
		try {
			this.MouseOverOnMenu();
			this.moveToLeftNavigation("Administration");
			WebElement notificationSettingsWebEelement = new WebDriverWait(
					driver, 10).until(ExpectedConditions
					.elementToBeClickable(notificationSettings_xpath));
			notificationSettingsWebEelement.click();

			return new NotificationCentrePage(driver);

		} catch (Exception ex) {
			return null;
		}
	}

	public NotificationLogsPage openNotificationLogs() {
		try {
			this.MouseOverOnMenu();
			this.moveToLeftNavigation("Administration");
			WebElement auditLogsWebEelement = new WebDriverWait(driver, 100)
					.until(ExpectedConditions
							.elementToBeClickable(notificationLogs_xpath));
			auditLogsWebEelement.click();

			return new NotificationLogsPage(driver);

		} catch (Exception ex) {
			return null;
		}

	}

	public NotificationLogsPage openClientCreation() {
		try {
			this.MouseOverOnMenu();
			this.moveToLeftNavigation("Client Maintenance");
			WebElement auditLogsWebEelement = new WebDriverWait(driver, 1000)
					.until(ExpectedConditions
							.elementToBeClickable(createClient_xpath));
			auditLogsWebEelement.click();

			return new NotificationLogsPage(driver);

		} catch (Exception ex) {
			return null;
		}

	}

	public BasicDetailsPage openBasicDetails() {
		try {
			this.MouseOverOnMenu();
			this.moveToLeftNavigation("Administration");
			WebElement basicDetailsWebEelement = new WebDriverWait(driver, 1000)
					.until(ExpectedConditions
							.elementToBeClickable(basicDetails_xpath));
			basicDetailsWebEelement.click();
			//Thread.sleep(10000);
			return new BasicDetailsPage(driver);
		} catch (Exception ex) {
			return null;
		}

	}

	public AdjustmentReasonPage openAdjustmentReason() {
		log.info("naviagting to the Adjustment reason");
		try {
			this.MouseOverOnMenu();
			this.moveToLeftNavigation("Administration");
			WebElement AdjustmentReasonWebEelement = new WebDriverWait(driver,
					1000).until(ExpectedConditions
					.elementToBeClickable(adjustmentReason_xpath));
			AdjustmentReasonWebEelement.click();
			//Thread.sleep(10000);
			return new AdjustmentReasonPage(driver);
		} catch (Exception ex) {
			return null;
		}
	}

	public ReportTemplatePage openReportTemplate() {
		try {
			this.MouseOverOnMenu();
			this.moveToLeftNavigation("Administration");

			WebElement ReportTemplateWebEelement = new WebDriverWait(driver,
					100).until(ExpectedConditions
					.elementToBeClickable(ReportTemplate_xpath));

			ReportTemplateWebEelement.click();
			//Thread.sleep(10000);
			return new ReportTemplatePage(driver);
		} catch (Exception ex) {
			return null;
		}

	}

	public FundRequestPage openFundRequest() {
		try {
			this.MouseOverOnMenu();
			this.moveToLeftNavigation("ABL");

			WebElement FundRequestWebEelement = new WebDriverWait(driver, 100)
					.until(ExpectedConditions
							.elementToBeClickable(FundRequest_xpath));

			FundRequestWebEelement.click();
			Thread.sleep(1000);
			return new FundRequestPage(driver);
		} catch (Exception ex) {
			return null;
		}
	}

	public UserDefinedFieldPage openUserDefinedField() {
		try {
			this.MouseOverOnMenu();
			this.moveToLeftNavigation("Administration");
			WebElement userdefinedfieldWebEelement = new WebDriverWait(driver,
					1000).until(ExpectedConditions
					.elementToBeClickable(userdefinedfield_xpath));
			userdefinedfieldWebEelement.click();

			return new UserDefinedFieldPage(driver);

		} catch (Exception ex) {
			return null;
		}

	}

	// Credit Line
	public CreditLineLoanCreationPage openCreditLineLoanCreationS() {
		try {
			this.MouseOverOnMenu();
			this.moveToLeftNavigation("Loan Maintenance");
			WebElement CreditLineLoanCreationWebEelement = new WebDriverWait(
					driver, 1000).until(ExpectedConditions
					.elementToBeClickable(creditLineLoanS_xpath));
			CreditLineLoanCreationWebEelement.click();

			return new CreditLineLoanCreationPage(driver);

		} catch (Exception ex) {
			return null;
		}
	}

	public CreditLineChargesSetupPage openCreditLineChargesSetupS() {
		try {
			this.MouseOverOnMenu();
			this.moveToLeftNavigation("Loan Maintenance");
			WebElement CreditLineChargesSetupWebEelement = new WebDriverWait(
					driver, 1000).until(ExpectedConditions
					.elementToBeClickable(creditLineSetupS_xpath));
			CreditLineChargesSetupWebEelement.click();

			return new CreditLineChargesSetupPage(driver);

		} catch (Exception ex) {
			return null;
		}
	}

	public CreditLineCollateralSetupPage openCreditLineCollateralSetupS() {
		try {
			this.MouseOverOnMenu();
			this.moveToLeftNavigation("Loan Maintenance");
			WebElement CreditLineCollateralSetupWebEelement = new WebDriverWait(
					driver, 1000).until(ExpectedConditions
					.elementToBeClickable(creditLineCollateralSetUpS_xpath));
			CreditLineCollateralSetupWebEelement.click();

			return new CreditLineCollateralSetupPage(driver);

		} catch (Exception ex) {
			return null;
		}
	}



	// other collateralPage
	public OtherCollateralPage openOtherCollateralPage() {
		try {
			this.MouseOverOnMenu();
			this.moveToLeftNavigation("ABL");
			WebElement otherCollateralWebEelement = new WebDriverWait(driver,
					1000).until(ExpectedConditions
					.elementToBeClickable(otherCollateralInput_xpath));
			otherCollateralWebEelement.click();

			return new OtherCollateralPage(driver);
		} catch (Exception ex) {
			return null;
		}

	}


	// Receivable rollforward
	public ReceivablesRollforwardPage openReceivableRollforwardPage() {
		try {
			this.MouseOverOnMenu();
			this.moveToLeftNavigation("ABL");
			WebElement otherCollateralWebEelement = new WebDriverWait(driver,
					1000).until(ExpectedConditions
					.elementToBeClickable(receivableRollforwardInput_xpath));
			otherCollateralWebEelement.click();

			return new ReceivablesRollforwardPage(driver);
		} catch (Exception ex) {
			return null;
		}

	}

	// Assets/Inventory
	public AssetsInventoryBBCReviewPage openAssetsAndInventroryPage() {
		try {
			this.MouseOverOnMenu();
			this.moveToLeftNavigation("ABL");
			WebElement assetsInventoryWebEelement = new WebDriverWait(driver,
					1000).until(ExpectedConditions
					.elementToBeClickable(assetsInventoryInputPage_xpath));
			assetsInventoryWebEelement.click();
			Thread.sleep(1000);
			this.isAlertPresent();
			return new AssetsInventoryBBCReviewPage(driver);
		} catch (Exception ex) {
			return null;
		}

	}

	// BBC ReviewData history
	public BBCReviewDataPage openBbcReviewDataHistory() {
		try {
			this.MouseOverOnMenu();
			this.moveToLeftNavigation("ABL");
			WebElement assetsInventoryWebEelement = new WebDriverWait(driver,
					1000).until(ExpectedConditions
					.elementToBeClickable(bbcReviewDataManualHistory_xpath));
			assetsInventoryWebEelement.click();

			return new BBCReviewDataPage(driver);
		} catch (Exception ex) {
			return null;
		}

	}

	// //////////////////////////////////////////////
	public boolean SelectClientFunction() {
		try {


			Thread.sleep(1000);

			WebElement selectClientWebEelement = new WebDriverWait(driver, 100)

					.until(ExpectedConditions
							.visibilityOfElementLocated(selectClient_xpath));
			selectClientWebEelement.click();

			return true;
		} catch (Exception ex) {
			return false;
		}

	}

	public String addValueToSearch(String ClientData) {
		try {
			WebElement searchClientTextBoxWebEelement = new WebDriverWait(
					driver, 200).until(ExpectedConditions
					.visibilityOfElementLocated(searchClientTextBox_xpath));
			searchClientTextBoxWebEelement.click();
			searchClientTextBoxWebEelement.clear();
			searchClientTextBoxWebEelement.sendKeys(ClientData);
			

		} catch (Exception ex) {

		}
		return ClientData;

	}

	public boolean SearchClientClick() {
		try {

			WebElement searchClientWebEelement = new WebDriverWait(driver, 100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(searchClient_xpath));
			searchClientWebEelement.click();

			return true;
		} catch (Exception ex) {
			return false;
		}

	}

	public boolean selectClientFromDropDown(String ClientData) {
		try {
			this.SelectClientFunction();
			Thread.sleep(2000);
			this.addValueToSearch(ClientData);
			Thread.sleep(2000);
			this.SearchClientClick();

	       Thread.sleep(500);


			return true;
		} catch (Exception ex) {
			return false;
		}

	}

	// ///////////////Admin End////////////////


	public BasicParametersPage openBasicParameters() {
		try {
			this.MouseOverOnMenu();
			this.moveToLeftNavigation("Client Maintenance");
			WebElement BasicParametersWebEelement = new WebDriverWait(driver,500)
			.until(ExpectedConditions.elementToBeClickable(basicParameter_xpath));
            this.isAlertPresent();
			BasicParametersWebEelement.click();
			this.isAlertPresent();
			//Thread.sleep(2000);
			Thread.sleep(1000);

			return new BasicParametersPage(driver);
		} catch (Exception ex) {
			return null;
		}
	}

	public IneligiblePage openIneligibleBasicParameters() {
		try {
			this.MouseOverOnMenu();
			this.moveToLeftNavigation("Client Maintenance");
			WebElement BasicParametersWebEelement = new WebDriverWait(driver,
					1000).until(ExpectedConditions
					.elementToBeClickable(basicParameter_xpath));
			BasicParametersWebEelement.click();

			this.isAlertPresent();
			//Thread.sleep(10000);

			return new IneligiblePage(driver);
		} catch (Exception ex) {
			return null;
		}
	}

	

	

	public BasicClientDetailPage openBasicDetailPage() {
		try {
			this.MouseOverOnMenu();
			this.moveToLeftNavigation("Client Maintenance");
			WebElement BasicClientDetailWebEelement = new WebDriverWait(driver,
					1000).until(ExpectedConditions
					.elementToBeClickable(BasicClientDetailPage_xpath));
			BasicClientDetailWebEelement.click();
			this.isAlertPresent();
			//Thread.sleep(2000);
			return new BasicClientDetailPage(driver);
		} catch (Exception ex) {
			return null;
		}
	}

	public PurgeClientPage openInactiveClientsPage() {
		try {
			this.MouseOverOnMenu();
			this.moveToLeftNavigation("Client Maintenance");
			WebElement BasicClientDetailWebEelement = new WebDriverWait(driver,
					1000).until(ExpectedConditions
					.elementToBeClickable(InactivrClientsPage_xpath));
			BasicClientDetailWebEelement.click();
			this.isAlertPresent();
			//Thread.sleep(2000);
			return new PurgeClientPage(driver);
		} catch (Exception ex) {
			return null;
		}
	}




	public ReceivableAgingPage openReceivableAgingPage() {
		try {
			this.MouseOverOnMenu();
			this.moveToLeftNavigation("ABL");
			WebElement receivableAgingWebEelement = new WebDriverWait(driver,
					1000).until(ExpectedConditions
					.elementToBeClickable(receivableAging_xpath));
			receivableAgingWebEelement.click();
			this.isAlertPresent();
			return new ReceivableAgingPage(driver);
		} catch (Exception e) {
			return null;
		}
	}

	public EnterNewSaleInvoicesPage openEnterNewSaleInvoicesPage() {
		try {
			this.MouseOverOnMenu();
			this.moveToLeftNavigation("ABL");
			WebElement rolesandPermissionsWebEelement = new WebDriverWait(
					driver, 1000).until(ExpectedConditions
					.elementToBeClickable(enterNewSalesInvoices_xpath));
			rolesandPermissionsWebEelement.click();
			return new EnterNewSaleInvoicesPage(driver);
		} catch (Exception e) {
			return null;
		}
	}


	public DetailReceivablesPage openDetailReceivablesPage() {
		try {
			this.MouseOverOnMenu();
			this.moveToLeftNavigation("ABL");
			WebElement rolesandPermissionsWebEelement = new WebDriverWait(
					driver, 1000).until(ExpectedConditions
					.elementToBeClickable(detailReceivables_xpath));
			rolesandPermissionsWebEelement.click();
			this.isAlertPresent();
			return new DetailReceivablesPage(driver);
		} catch (Exception e) {
			return null;
		}
	}

	public IneligibleSummaryPage openIneligibleSummaryPage() {
		try {
			this.MouseOverOnMenu();
			this.moveToLeftNavigation("ABL");
			WebElement receivableAgingWebEelement = new WebDriverWait(driver,
					1000).until(ExpectedConditions
					.elementToBeClickable(ineligibleSummary_xpath));
			receivableAgingWebEelement.click();
			return new IneligibleSummaryPage(driver);
		} catch (Exception e) {
			return null;
		}
	}

	//rohit
	public DebtorsPage opendebtorsPage() {
		try {
			this.MouseOverOnMenu();
			this.moveToLeftNavigation("ABL");
			WebElement debtorsWebEelement = new WebDriverWait(driver, 1000)
					.until(ExpectedConditions
							.elementToBeClickable(debtors_xpath));
			debtorsWebEelement.click();
			this.isAlertPresent();
			return new DebtorsPage(driver);
		} catch (Exception e) {
			return null;
		}

	}

	public BatchCashPage openBatchCashPage() {
		try {
			this.MouseOverOnMenu();
			this.moveToLeftNavigation("Cash Application");
			WebElement BatchCashWebEelement = new WebDriverWait(driver, 1000)
					.until(ExpectedConditions
							.elementToBeClickable(BatchCashPage_xpath));
			BatchCashWebEelement.click();
			//Thread.sleep(10000);
			return new BatchCashPage(driver);
		} catch (Exception ex) {
			return null;
		}
	}

	public BatchCashPage openFundingStylePage() {
		try {
			this.MouseOverOnMenu();
			this.moveToLeftNavigation("Client Maintenance");
			WebElement BatchCashWebEelement = new WebDriverWait(driver, 1000)
					.until(ExpectedConditions
							.elementToBeClickable(FundingStylePage_xpath));
			BatchCashWebEelement.click();
			//Thread.sleep(10000);
			return new BatchCashPage(driver);
		} catch (Exception ex) {
			return null;
		}
	}

	/*public MappingListViewPage openmappingListViewPage() {
		try {
			this.MouseOverOnMenu();
			this.moveToLeftNavigation("Client Maintenance");
			WebElement mappingListViewWebEelement = new WebDriverWait(driver,
					1000).until(ExpectedConditions
					.elementToBeClickable(mappingListView_xpath));
			mappingListViewWebEelement.click();
			//Thread.sleep(1000);
			this.isAlertPresent();
           return new MappingListViewPage(driver);
		} catch (Exception ex) {
			return null;
		}

	}*/
	
	public BBCFileRequiredPage openbbcFilesRequiredPage() {
		try {
			this.MouseOverOnMenu();
			this.moveToLeftNavigation("Client Maintenance");
			WebElement mappingListViewWebEelement = new WebDriverWait(driver,
					1000).until(ExpectedConditions
					.elementToBeClickable(bbcFilesRequired_xpath));
			mappingListViewWebEelement.click();
			this.isAlertPresent();
			//Thread.sleep(5000);

			return new BBCFileRequiredPage(driver);
		} catch (Exception ex) {
			return null;
		}
	}

	public ABLFileUploadPage openABLFileUploadsPage() {
		try {
			this.MouseOverOnMenu();
			this.moveToLeftNavigation("ABL");
			WebElement ABLFileUploadsWebEelement = new WebDriverWait(driver,
					20).until(ExpectedConditions
					.elementToBeClickable(ablFileUploads_xpath));
			ABLFileUploadsWebEelement.click();
			Thread.sleep(5000);
			this.isAlertPresent();
			Thread.sleep(5000);

			//this.isAlertPresent();
			return new ABLFileUploadPage(driver);
			
		} catch (Exception ex) {
			return null;
		}
	}

	/*
	 * public CheckRegisterPage openCheckRegister() { try {
	 * this.MouseOverOnMenu(); this.moveToLeftNavigation("Cash Application");
	 * WebElement CheckRegisterWebEelement = new WebDriverWait(driver, 1000)
	 * .until(ExpectedConditions.elementToBeClickable(CheckRegisterPage_xpath));
	 * CheckRegisterWebEelement.click(); //Thread.sleep(10000); return new
	 * CheckRegisterPage(driver); } catch (Exception ex) { return null; } }
	 * 
	 * 
	 * 
	 * public BatchProcessPage openBatchProcess() { try {
	 * this.MouseOverOnMenu(); this.moveToLeftNavigation("Cash Application");
	 * WebElement BatchProcesWebEelement = new WebDriverWait(driver, 1000)
	 * .until(ExpectedConditions.elementToBeClickable(BatchProcessPage_xpath));
	 * BatchProcesWebEelement.click(); //Thread.sleep(20000); return new
	 * BatchProcessPage(driver); } catch (Exception ex) { return null; } }
	 * 
	 * 
	 * public CashReceiptHistoryPage openCashReceiptHistory() { try {
	 * this.MouseOverOnMenu(); this.moveToLeftNavigation("Cash Application");
	 * WebElement CashReceiptWebEelement = new WebDriverWait(driver, 1000)
	 * .until
	 * (ExpectedConditions.elementToBeClickable(CashReceiptHistoryPage_xpath));
	 * CashReceiptWebEelement.click(); //Thread.sleep(10000); return new
	 * CashReceiptHistoryPage(driver); } catch (Exception ex) { return null; } }
	 */




	

	public boolean NavigateSalesRegionPageBreak() {
		try {
			WebElement salesRegionWebEelement = new WebDriverWait(driver, 1000)
					.until(ExpectedConditions
							.visibilityOfElementLocated(salesRegions_xpath));
			salesRegionWebEelement.click();
			return true;
		} catch (Exception ex) {
			return false;
		}

	}

	

	public boolean selectClientFromDropdown(String ClientData) {
		try {
			this.SelectClientFunction();
			this.addValueToSearch(ClientData);
			this.SearchClientClick();



			return true;
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


	
	
	public ActivityPage openActivityTickler1() {
		try {
			
			this.MouseOverOnMenu();
			this.moveToLeftNavigation("Client Maintenance");
			
			/*Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
					.withTimeout(Duration.ofMillis(50))
					.pollingEvery(Duration.ofNanos(20)).ignoring(NoSuchElementException.class);
			WebElement BatchCashWebEelement= wait.until(ExpectedConditions.elementToBeClickable(ActivityTickler_xpath));*/
			
			
			WebElement BatchCashWebEelement = new WebDriverWait(driver,50)
					.until(ExpectedConditions
							.elementToBeClickable(ActivityTickler_xpath));
			BatchCashWebEelement.click();
			this.isAlertPresent();
	        Thread.sleep(1000);
			return new ActivityPage(driver);
		} catch (Exception ex) {
			return null;
		}
	}

	

	

	public CheckRegisterPage openCheckRegister() {
		try {
			this.MouseOverOnMenu();
			this.moveToLeftNavigation("Cash Application");
			WebElement CheckRegisterWebEelement = new WebDriverWait(driver,
					1000).until(ExpectedConditions
					.elementToBeClickable(CheckRegisterPage_xpath));
			CheckRegisterWebEelement.click();
			this.isAlertPresent();
			return new CheckRegisterPage(driver);
		} catch (Exception ex) {
			return null;
		}
	}

	public BatchProcessPage openBatchProcess() {
		try {
			this.MouseOverOnMenu();
			this.moveToLeftNavigation("Cash Application");
			WebElement BatchProcesWebEelement = new WebDriverWait(driver, 1000)
					.until(ExpectedConditions
							.elementToBeClickable(BatchProcessPage_xpath));
			BatchProcesWebEelement.click();
			this.isAlertPresent();
			return new BatchProcessPage(driver);
		} catch (Exception ex) {
			return null;
		}
	}

	public CashReceiptHistoryPage openCashReceiptHistory() {
		try {
			this.MouseOverOnMenu();
			this.moveToLeftNavigation("Cash Application");
			WebElement CashReceiptWebEelement = new WebDriverWait(driver, 1000)
					.until(ExpectedConditions
							.elementToBeClickable(CashReceiptHistoryPage_xpath));
			CashReceiptWebEelement.click();
			this.isAlertPresent();
			return new CashReceiptHistoryPage(driver);
		} catch (Exception ex) {
			return null;
		}
	}

	public DailyCashPostingPage openDailyCashPosting() {
		try {
			this.MouseOverOnMenu();
			this.moveToLeftNavigation("Cash Application");
			WebElement DailyCashPostingWebEelement = new WebDriverWait(driver,
					1000).until(ExpectedConditions
					.elementToBeClickable(DailyCashPostingPage_xpath));
			DailyCashPostingWebEelement.click();
			this.isAlertPresent();
			return new DailyCashPostingPage(driver);
		} catch (Exception ex) {
			return null;
		}
	}

	public DailyCashTransactionReportingPage openDailyCashTransactionReporting() {
		try {
			this.MouseOverOnMenu();
			this.moveToLeftNavigation("Cash Application");
			WebElement DailyCashTransactionReportingWebEelement = new WebDriverWait(
					driver, 1000)
					.until(ExpectedConditions
							.elementToBeClickable(DailyCashTransactionReportingPage_xpath));
			DailyCashTransactionReportingWebEelement.click();
			this.isAlertPresent();
			return new DailyCashTransactionReportingPage(driver);
		} catch (Exception ex) {
			return null;
		}
	}


	public ReportsPage openReports() {
		try {
			this.MouseOverOnMenu();
			this.moveToLeftNavigation("Client Maintenance");
			WebElement ABLClientCreationWebEelement = new WebDriverWait(driver,
					1000).until(ExpectedConditions
					.elementToBeClickable(reports_xpath));
			ABLClientCreationWebEelement.click();
			this.isAlertPresent();
			return new ReportsPage(driver);
		} catch (Exception ex) {
			return null;
		}
	}

	public CashReceiptPage openCashReceiptsPage() {
		try {
			this.MouseOverOnMenu();
			this.moveToLeftNavigation("ABL");
			WebElement CashReceipWebEelement = new WebDriverWait(driver, 1000)
					.until(ExpectedConditions
							.elementToBeClickable(CashReceipt_xpath));
			CashReceipWebEelement.click();
			this.isAlertPresent();
			return new CashReceiptPage(driver);
		} catch (Exception e) {
			return null;
		}
	}

	

	public boolean Applicationfreezes(String value) {
		boolean RuntimeErrorException = false;
		if (RuntimeErrorException)
			try {
				driver.quit();
				// driver.getCurrentUrl();
				driver.get(value);
				LoginPage loginPage = new LoginPage(driver);
				CyncHomePage cyncHomePage = loginPage.doLogin();
			} catch (Exception ex) {

				System.out.println("application working fine");

			}
		return false;

	}

	/*
	 * public ChargeTemplatesPage openChargeTemplates() { try {
	 * this.MouseOverOnMenu(); this.moveToLeftNavigation("Loan Maintenance");
	 * WebElement InterestcodesWebEelement = new WebDriverWait(driver, 1000)
	 * .until(ExpectedConditions.elementToBeClickable(chargeTemplates_xpath));
	 * InterestcodesWebEelement.click(); //Thread.sleep(10000); return new
	 * ChargeTemplatesPage(driver); } catch (Exception ex) { return null; } }
	 */

	/*
	 * public InterestPaymentPage openInterestPayment() { try {
	 * this.MouseOverOnMenu(); this.moveToLeftNavigation("Loan Maintenance");
	 * WebElement InterestcodesWebEelement = new WebDriverWait(driver, 1000)
	 * .until(ExpectedConditions.elementToBeClickable(interestPayment_xpath));
	 * InterestcodesWebEelement.click(); return new InterestPaymentPage(driver);
	 * } catch (Exception ex) { return null; } }
	 */

	public CommentsPages openCommentsPages() {
		try {
			this.MouseOverOnMenu();
			this.moveToLeftNavigation("Client Maintenance");
			WebElement ClientMaintenanceCommentsPageWebEelement = new WebDriverWait(
					driver, 10).until(ExpectedConditions
					.elementToBeClickable(CommentsPages_xpath));
			ClientMaintenanceCommentsPageWebEelement.click();
			this.isAlertPresent();
			////Thread.sleep(10000);
			return new CommentsPages(driver);
		} catch (Exception ex) {
			return null;
		}

	}

	public MailAddressPages openMailAddressPages() {
		try {
			this.MouseOverOnMenu();
			this.moveToLeftNavigation("Client Maintenance");
			WebElement ClientMaintenanceMailAddressPageWebEelement = new WebDriverWait(
					driver, 10).until(ExpectedConditions
					.elementToBeClickable(EmailAddress_xpath));
			ClientMaintenanceMailAddressPageWebEelement.click();
			this.isAlertPresent();
			//Thread.sleep(10000);
			return new MailAddressPages(driver);
		} catch (Exception ex) {
			return null;
		}


	}
	public MiscellaneousPage openMiscellaneousPage() {
		try {
			this.MouseOverOnMenu();
			this.moveToLeftNavigation("Client Maintenance");
			WebElement ClientMaintenanceMiscellaneousPageWebEelement = new WebDriverWait(
					driver, 10).until(ExpectedConditions
					.elementToBeClickable(MiscellaneousPage_xpath));
			ClientMaintenanceMiscellaneousPageWebEelement.click();
			this.isAlertPresent();
			//Thread.sleep(10000);
			return new MiscellaneousPage(driver);
		} catch (Exception ex) {
			return null;
		}

	}




	/*
	 * public ActivityPage openActivityPage() { try { this.MouseOverOnMenu();
	 * this.moveToLeftNavigation("ABL"); WebElement
	 * FinancialAnalyzerSummaryWebEelement = new WebDriverWait(driver,
	 * 1000).until(ExpectedConditions
	 * .elementToBeClickable(ActivityTickler_xpath));
	 * FinancialAnalyzerSummaryWebEelement.click(); return new
	 * ActivityPage(driver); } catch (Exception e) { return null; } }
	 * 
	 * 
	 * }
	 */

	
	/*public ContactsPage openContactsPage() {
		try {
			this.MouseOverOnMenu();
			this.moveToLeftNavigation("Client Maintenance");
			WebElement ClientMaintenanceContactsPageWebEelement = new WebDriverWait(
					driver, 1000).until(ExpectedConditions
					.elementToBeClickable(Contacts_xpath));
			ClientMaintenanceContactsPageWebEelement.click();
			//Thread.sleep(10000);
			return new ContactsPage(driver);
		} catch (Exception ex) {
			return null;
		}

	}*/

           public ReportCommentsPage openReportCommentsPage() {
             	try {
             	    this.MouseOverOnMenu();
             	    this.moveToLeftNavigation("Client Maintenance");
             	    WebElement ClientMaintenanceReportCommentsPageWebEelement = new WebDriverWait(driver, 5)
             		.until(ExpectedConditions.elementToBeClickable(ReportCommentsPage_xpath));
             	  ClientMaintenanceReportCommentsPageWebEelement.click();
                    //Thread.sleep(50);
             	    return new ReportCommentsPage(driver);
             	} catch (Exception ex) {
             	    return null;
             	}
                
        	 }  
          
public ContactsPage openContactsPage() {
	try {
	    this.MouseOverOnMenu();
	    this.moveToLeftNavigation("Client Maintenance");
	    WebElement ClientMaintenanceContactsPageWebEelement = new WebDriverWait(driver, 1000)
		.until(ExpectedConditions.elementToBeClickable(Contacts_xpath));
	    ClientMaintenanceContactsPageWebEelement.click();
	    this.isAlertPresent();
       //Thread.sleep(10000);
	    return new ContactsPage(driver);
	} catch (Exception ex) {
	    return null;
	}
   
}  	


public ChargeCodesPage openChargeCodes() { 
	   try {     
	   this.MouseOverOnMenu();     
	   this.moveToLeftNavigation("ABL");     
	   WebElement ChargeCodesWebEelement = new WebDriverWait(driver, 1000)      
	   .until(ExpectedConditions.elementToBeClickable(chargeCodes_xpath));     
	   ChargeCodesWebEelement.click();     
	   //Thread.sleep(10000);
	   return new ChargeCodesPage(driver); 
	   } 
	   catch (Exception ex) {     
	   return null; 
	   } 
	   
	   }


public BucketAgingPage openBucketAging() {
	try {
		this.MouseOverOnMenu();
		this.moveToLeftNavigation("Client Maintenance");
		WebElement userdefinedfieldWebEelement = new WebDriverWait(driver,
				10).until(ExpectedConditions
				.elementToBeClickable(BucketAging_xpath));
		userdefinedfieldWebEelement.click();
		this.isAlertPresent();
		//Thread.sleep(10000);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		return new BucketAgingPage(driver);

	} catch (Exception ex) {
		return null;
	}

}


public BucketAgingPage openMappingliatview() {
	try {
		this.MouseOverOnMenu();
		this.moveToLeftNavigation("Client Maintenance");
		WebElement CollateralAdvanceRateWebEelement = new WebDriverWait(
				driver, 10).until(ExpectedConditions
				.elementToBeClickable(MappingListView_Xpath));
		CollateralAdvanceRateWebEelement.click();
		this.isAlertPresent();
		//Thread.sleep(2000);
		return new BucketAgingPage(driver);
	} catch (Exception ex) {
		return null;
	}
}


public ExceptionPage openExceptionsPage() {




	try {
	    this.MouseOverOnMenu();
	    this.moveToLeftNavigation("Client Maintenance");
	    WebElement ClientMaintenanceContactsPageWebEelement = new WebDriverWait(driver, 10)
		.until(ExpectedConditions.elementToBeClickable(Exception_xpath));
	    ClientMaintenanceContactsPageWebEelement.click();
	    this.isAlertPresent();
       //Thread.sleep(10000);
	    return new ExceptionPage(driver);
	} catch (Exception ex) {
	    return null;
	}

}

public BasicClientDetailPage openBasicClientDetailPage() {
	try {
		this.MouseOverOnMenu();
		this.moveToLeftNavigation("Client Maintenance");
		WebElement CollateralAdvanceRateWebEelement = new WebDriverWait(
				driver, 10).until(ExpectedConditions
				.elementToBeClickable(BasicClientDetailPage_xpath));
		CollateralAdvanceRateWebEelement.click();
		this.isAlertPresent();
		Thread.sleep(6000);
	
		return new BasicClientDetailPage(driver);
	} catch (Exception ex) {
		return null;
	}
}




/*/////Factoring//////*/
//@author:atish
private final By MappingListViewPageFactoring_xpath=By.xpath("//a[text()='Mapping List View']");
private final By FactoringChargesTemplatePage_xpath=By.xpath("//a[contains(text(),'Factoring Charges Template')]");
private final By AutoProcessingFeeSetupPageFactoring_xpath=By.xpath("//a[contains(text(),'Auto Processing Fee Setup')]");
private final By BasicClientDetailPageFactoring_xpath=By.xpath("//a[contains(text(),'Basic Client Detail')]");
private final By MailAddressPageFactoring_xpath=By.xpath("//a[contains(text(),'Mail Address')]");
private final By ContactsPageFactoring_xpath=By.xpath("//a[contains(text(),'Contacts')]");
private final By MiscellaneousPageFactoring_xpath=By.xpath("//a[contains(text(),'Miscellaneous')]");
private final By LegalContentPageFactoring_xpath=By.xpath("//a[contains(text(),'Legal Content')]");
private final By ClientSummaryPageFactoring_xpath=By.xpath("//a[contains(text(),'Client Summary')]");
private final By InactiveClientsPageFactoring_xpath=By.xpath("//a[contains(text(),'Inactive Clients')]");
private final By CommentsPageFactoring_xpath=By.xpath("//a[text()='Comments']");


private final By FactoringFileUploadsPage_xpath=By.xpath("//a[contains(text(),'Factoring File Uploads')]");
private final By DataUploadPageFactoring_xpath=By.xpath("//a[contains(text(),'Data Upload')]");
private final By ManualEntryPageFactoring_xpath=By.xpath("//a[contains(text(),'Manual Entry')]");
private final By NewInvoicesPageFactoring_xpath=By.xpath("//a[contains(text(),'New Invoices')]");
private final By DuplicateInvoicesPageFactoring_xpath=By.xpath("//a[contains(text(),'Duplicate Invoices')]");
private final By IneligiblePageFactoring_xpath=By.xpath("//a[contains(text(),'Ineligible')]");
private final By PreVerificationPageFactoring_xpath=By.xpath("//a[contains(text(),'Pre-Verification')]");
private final By VerifiedPageFactoring_xpath=By.xpath("//a[contains(text(),'Verified')]");
private final By FundedInvoicesPageFactoring_xpath=By.xpath("//a[contains(text(),'Funded Invoices')]");
private final By RecoursePageFactoring_xpath=By.xpath("//a[contains(text(),'Recourse')]");
private final By CashReceiptPageFactoring_xpath=By.xpath("//a[text()='Cash Receipt']");
private final By CashReservePageFactoring_xpath=By.xpath("//a[contains(text(),'Cash Reserve')]");
private final By EscrowReservePageFactoring_xpath=By.xpath("//a[contains(text(),'Escrow Reserve')]");
private final By ReserveReleasePageFactoring_xpath=By.xpath("//a[contains(text(),'Reserve Release')]");
private final By FactoringChargeCodesPage_xpath=By.xpath("//a[contains(text(),'Factoring Charge Codes')]");
private final By TermCodesPageFactoring_xpath=By.xpath("//a[contains(text(),'Term Codes')]");
private final By InvoiceStatusPageFactoring_xpath=By.xpath("//a[contains(text(),'Invoice Status')]");
private final By BucketAgingPageFactoring_xpath=By.xpath("//a[contains(text(),'Bucket Aging')]");
private final By InvoiceValidationTemplatePageFactoring_xpath=By.xpath("//a[contains(text(),'Invoice Validation Template')]");
private final By FactoringGLSetupPage_xpath=By.xpath("//a[contains(text(),'Factoring GL Setup')]");
private final By FactoringGLTransactionsPage_xpath=By.xpath("//a[contains(text(),'Factoring GL Transactions')]");
private final By FactoringMigrationPage_xpath=By.xpath("//a[contains(text(),'Factoring Migration')]");
private final By CreditSourcesPageFactoring_xpath=By.xpath("//a[contains(text(),'Credit Sources')]");
private final By FollowUpActionsPageFactoring_xpath=By.xpath("//a[contains(text(),'Follow Up Actions')]");
private final By AccountDebtorPageFactoring_xpath=By.xpath("//a[contains(text(),'Account Debtor')]");
private final By GlobalDebtorPageFactoring_xpath=By.xpath("//a[contains(text(),'Global Debtor')]");
private final By DebtorMatchingPageFactoring_xpath=By.xpath("//a[contains(text(),'Debtor Matching')]");
private final By LetterProcessingPageFactoring_xpath=By.xpath("//a[contains(text(),'Letter Processing')]");
private final By LetterTrackingPageFactoring_xpath=By.xpath("//a[contains(text(),'Letter Tracking')]");
private final By LetterAuditPageFactoring_xpath=By.xpath("//a[contains(text(),'Letter Audit')]");
private final By ACDebtorStatusPageFactoring_xpath=By.xpath("//a[contains(text(),'A/C Debtor Status')]");
private final By BrokerSetupPageFactoring_xpath=By.xpath("//a[contains(text(),'Broker Setup')]");
private final By BrokerBankInformationPageFactoring_xpath=By.xpath("//a[contains(text(),'Broker Bank Information')]");
private final By BrokerFeeSetupPageFactoring_xpath=By.xpath("//a[contains(text(),'Broker Fee Setup')]");
private final By BrokerCommissionPageFactoring_xpath=By.xpath("//a[contains(text(),'Broker Commission')]");
private final By BrokerInquiryPageFactoring_xpath=By.xpath("//a[contains(text(),'Broker Inquiry')]");
private final By ProcessingHistoryPageFactoring_xpath=By.xpath("//a[contains(text(),'Processing History')]");
private final By WarningPageFactoring_xpath=By.xpath("//a[contains(text(),'Warning')]");
private final By FundsEmployedPageFactoring_xpath=By.xpath("//a[contains(text(),'Funds Employed')]");
private final By CreditQueuePageFactoring_xpath=By.xpath("//a[contains(text(),'Credit Queue')]");
private final By CollectionTicklerPageFactoring_xpath=By.xpath("//a[contains(text(),'Collection Tickler')]");

private final By BatchProcessScreenPageFactoring_xpath=By.xpath("//a[contains(text(),'Batch Process Screen')]");
private final By ungrouped_checksPage_xpath=By.xpath("//a[contains(text(),'Ungrouped Checks')]");
private final By ProcessedBatchesPage_xpath=By.xpath("//a[contains(text(),'Processed Batches')]");
private final By deposit_uploadsPage_xpath=By.xpath("//a[contains(text(),'Deposit Upload')]");
//private final By  RepaymentPage_xpath=By.xpath("//a[contains(text(),'Repayment Report')]");
private final By  RepaymentPage_xpath=By.xpath("//a[contains(text(),'Payment History')]");
private final By credit_memo_adjustmentPage_xpath=By.xpath("//a[contains(text(),'Credit Memo Adjustment')]");
private final By credit_memo_historyPage_xpath=By.xpath("//a[contains(text(),'Credit Memo History')]");

private final By ClientFundedARAgingPage_xpath=By.xpath("//a[contains(text(),'Client Funded AR Aging')]");
private final By StatementofAccounts_xpath=By.xpath("//a[contains(text(),'Statement of Accounts')]");
private final By ClientsARAging_xpath=By.xpath("//a[contains(text(),'Client's AR Aging')]");
private final By ClientsARBalance_xpath=By.xpath("//a[contains(text(),'Client's AR Balance')]");
private final By OpeninvoicesbySchedule_xpath=By.xpath("//a[contains(text(),'OpeninvoicesbySchedule')]");
private final By ClientsInvoiceStatus_xpath=By.xpath("//a[contains(text(),'Client's Invoice Status')]");

private final By O_xpath=By.xpath("//a[contains(text(),'')]");
private final By ExceptionsPageFactoring_xpath=By.xpath("//a[contains(text(),'Exceptions')]");

private final By month_selection_xpath = By.xpath("//select[@class='ui-datepicker-month']");
private final By year_Selection_xpath = By.xpath("//select[@class='ui-datepicker-year']");
private final By date_selection_xpath = By.xpath("//table[@class='ui-datepicker-calendar']//tbody");

public boolean selectDate(String BBCDate)
{

try{
   
    String datepart[] = BBCDate.split("/");
    String month = datepart[0];
    String date = datepart[1];
    String year = datepart[2];
    System.out.println(month);
    System.out.println(year);
    System.out.println(date);
    
    WebElement month1=new WebDriverWait(driver,10)
    .until(ExpectedConditions.elementToBeClickable(month_selection_xpath));
    month1.sendKeys( this.selectMonth(month));
    
  
    WebElement year_xpath = new WebDriverWait(driver,10).until(ExpectedConditions.elementToBeClickable(year_Selection_xpath));
 
    Select sel1=new Select(year_xpath);
    List<WebElement> options=sel1.getOptions();
    for(WebElement op:options)
    {
        String ele = op.getText();
        if(ele.equals(year))
        {
         op.click();
        }
    }
  
   Thread.sleep(500);
    List<WebElement> lists =driver
            .findElements(By
              .xpath("//table[@class='ui-datepicker-calendar']/tbody//tr//td"));
    for(WebElement list:lists)
    {
        String date_value = list.getText();
        if(date_value.equals(date))
        {
            list.click();
        }
        Thread.sleep(1500);
    }
}

catch(Exception ex){
 
}
return true;

}

public String selectMonth(String month)
{
    int month_data = Integer.valueOf(month).intValue();
    try
    {
        switch(month_data)
        {
        case 1 :
            month = "Jan";
            break;
        case 2 :
            month = "Feb";
            break;
        case 3 :
            month = "Mar";
            break;
        case 4 :
            month = "Apr";
            break;
        case 5 :
            month = "May";
            break;
        case 6 :
            month = "Jun";
            break;
        case 7 :
            month = "Jul";
            break;
        case 8 :
            month = "Aug";
            break;
        case 9 :
            month = "Sep";
            break;
        case 10 :
            month = "Oct";
            break;
        case 11 :
            month = "Nov";
            break;
        case 12 :
            month = "Dec";
            break;
           
           
        }
    }
    catch(Exception e)
    {
   
    }
    return month;
}

public FactoringClientCreationPage openFactoringClientCreation() {
	try {
		this.MouseOverOnMenu();

		this.moveToLeftNavigation("Client Maintenance");
		Thread.sleep(2000);
		WebElement FactoringCreationPage = new WebDriverWait(driver,
				10).until(ExpectedConditions
				.elementToBeClickable(CreateFactoringClient_Xpath));
		FactoringCreationPage.click();
		Thread.sleep(5000);

		return new FactoringClientCreationPage(driver);
	} catch (Exception ex) {
		return null;
	}
}
public ReportCommentsPageFactoring openReportCommentsPageFactoring() {
 	try {
 	    this.MouseOverOnMenu();
 	    this.moveToLeftNavigation("Client Maintenance");
 	    WebElement ClientMaintenanceReportCommentsPageWebEelement = new WebDriverWait(driver, 5)
 		.until(ExpectedConditions.elementToBeClickable(ReportCommentsPage_xpath));
 	  ClientMaintenanceReportCommentsPageWebEelement.click();
     
 	    return new ReportCommentsPageFactoring(driver);
 	} catch (Exception ex) {
 	    return null;
 	}
    
 }  

public ExceptionsPageFactoring openExceptionsPageFactoring() {
 	try {
 	    this.MouseOverOnMenu();
 	    this.moveToLeftNavigation("Client Maintenance");
 	    WebElement ClientMaintenanceReportCommentsPageWebEelement = new WebDriverWait(driver, 5)
 		.until(ExpectedConditions.elementToBeClickable(ExceptionsPageFactoring_xpath));
 	    ClientMaintenanceReportCommentsPageWebEelement.click();
     
 	    return new ExceptionsPageFactoring(driver);
 	} catch (Exception ex) {
 	    return null;
 	}
    
 }  

public ActivityTicklerPageFactoring openActivityTicklerPageFactoring() {
	try {
		this.MouseOverOnMenu();

		this.moveToLeftNavigation("Client Maintenance");
		WebElement ActivityTicklerPage = new WebDriverWait(driver,
				10).until(ExpectedConditions
				.elementToBeClickable(ActivityTicklerPageFactoring_xpath));
		ActivityTicklerPage.click();
		Thread.sleep(5000);

		return new ActivityTicklerPageFactoring(driver);
	} catch (Exception ex) {
		return null;
	}
}
public MappingListViewPageFactoring openMappingListViewPageFactoring() {
	try {
		this.MouseOverOnMenu();

		this.moveToLeftNavigation("Client Maintenance");
		WebElement MappingListViewPage = new WebDriverWait(driver,800).until(ExpectedConditions
				.elementToBeClickable(MappingListViewPageFactoring_xpath));
		MappingListViewPage.click();
		Thread.sleep(3000);

		return new MappingListViewPageFactoring(driver);
	} catch (Exception ex) {
		return null;
	}
}
public FactoringChargesTemplatePage openFactoringChargesTemplatePage() {
	try {
		this.MouseOverOnMenu();

		this.moveToLeftNavigation("Client Maintenance");
		WebElement FactoringChargesTemplatePage = new WebDriverWait(driver,
				10).until(ExpectedConditions
				.elementToBeClickable(FactoringChargesTemplatePage_xpath));
		FactoringChargesTemplatePage.click();
		Thread.sleep(5000);

		return new FactoringChargesTemplatePage(driver);
	} catch (Exception ex) {
		return null;
	}
}
public AutoProcessingFeeSetupPageFactoring openAutoProcessingFeeSetupPageFactoring() {
	try {
		this.MouseOverOnMenu();

		this.moveToLeftNavigation("Client Maintenance");
		WebElement AutoProcessingFeeSetupPageFactoring = new WebDriverWait(driver,
				10).until(ExpectedConditions
				.elementToBeClickable(AutoProcessingFeeSetupPageFactoring_xpath));
		AutoProcessingFeeSetupPageFactoring.click();
		Thread.sleep(5000);

		return new AutoProcessingFeeSetupPageFactoring(driver);
	} catch (Exception ex) {
		return null;
	}
}




public BasicClientDetailPageFactoring openBasicClientDetailPageFactoring() {
	try {
		this.MouseOverOnMenu();

		this.moveToLeftNavigation("Client Maintenance");
		WebElement BasicClientDetailPageFactoring = new WebDriverWait(driver,
				10).until(ExpectedConditions
				.elementToBeClickable(BasicClientDetailPageFactoring_xpath));
		BasicClientDetailPageFactoring.click();
		Thread.sleep(5000);

		return new BasicClientDetailPageFactoring(driver);
	} catch (Exception ex) {
		return null;
	}
}
public MailAddressPageFactoring openMailAddressPageFactoring() {
	try {
		this.MouseOverOnMenu();

		this.moveToLeftNavigation("Client Maintenance");
		WebElement MailAddressPageFactoring = new WebDriverWait(driver,
				10).until(ExpectedConditions
				.elementToBeClickable(MailAddressPageFactoring_xpath));
		MailAddressPageFactoring.click();
		Thread.sleep(5000);

		return new MailAddressPageFactoring(driver);
	} catch (Exception ex) {
		return null;
	}
}
public ContactsPageFactoring openContactsPageFactoring() {
	try {
		this.MouseOverOnMenu();

		this.moveToLeftNavigation("Client Maintenance");
		WebElement ContactsPageFactoring = new WebDriverWait(driver,
				10).until(ExpectedConditions
				.elementToBeClickable(ContactsPageFactoring_xpath));
		ContactsPageFactoring.click();
		Thread.sleep(5000);

		return new ContactsPageFactoring(driver);
	} catch (Exception ex) {
		return null;
	}
}
public MiscellaneousPageFactoring openMiscellaneousPageFactoring() {
	try {
		this.MouseOverOnMenu();

		this.moveToLeftNavigation("Client Maintenance");
		WebElement MiscellaneousPageFactoring = new WebDriverWait(driver,
				10).until(ExpectedConditions
				.elementToBeClickable(MiscellaneousPageFactoring_xpath));
		MiscellaneousPageFactoring.click();
		Thread.sleep(5000);

		return new MiscellaneousPageFactoring(driver);
	} catch (Exception ex) {
		return null;
	}
}
public LegalContentPageFactoring openLegalContentPageFactoring() {
	try {
		this.MouseOverOnMenu();

		this.moveToLeftNavigation("Client Maintenance");
		WebElement LegalContentPageFactoring = new WebDriverWait(driver,
				10).until(ExpectedConditions
				.elementToBeClickable(LegalContentPageFactoring_xpath));
		LegalContentPageFactoring.click();
		Thread.sleep(5000);

		return new LegalContentPageFactoring(driver);
	} catch (Exception ex) {
		return null;
	}
}

public ClientSummaryPageFactoring openClientSummaryPageFactoring() {
	try {
		this.MouseOverOnMenu();

		this.moveToLeftNavigation("Client Maintenance");
		WebElement ClientSummaryPageFactoring = new WebDriverWait(driver,
				10).until(ExpectedConditions
				.elementToBeClickable(ClientSummaryPageFactoring_xpath));
		ClientSummaryPageFactoring.click();
		Thread.sleep(5000);

		return new ClientSummaryPageFactoring(driver);
	} catch (Exception ex) {
		return null;
	}
}

public InactiveClientsPageFactoring openInactiveClientsPageFactoring() {
	try {
		this.MouseOverOnMenu();

		this.moveToLeftNavigation("Client Maintenance");
		WebElement InactiveClientsPageFactoring = new WebDriverWait(driver,
				10).until(ExpectedConditions
				.elementToBeClickable(InactiveClientsPageFactoring_xpath));
		InactiveClientsPageFactoring.click();
		Thread.sleep(5000);

		return new InactiveClientsPageFactoring(driver);
	} catch (Exception ex) {
		return null;
	}
}

public CommentsPageFactoring openCommentsPageFactoring() {
	try {
		this.MouseOverOnMenu();

		this.moveToLeftNavigation("Client Maintenance");
		WebElement InactiveClientsPageFactoring = new WebDriverWait(driver,
				10).until(ExpectedConditions
				.elementToBeClickable(CommentsPageFactoring_xpath));
		InactiveClientsPageFactoring.click();
		Thread.sleep(2000);

		return new CommentsPageFactoring(driver);
	} catch (Exception ex) {
		return null;
	}
}
public FactoringFileUploadPage openFactoringFileUploadsPage() {
	try {
		this.MouseOverOnMenu();

		this.moveToLeftNavigation("Factoring");
		WebElement FactoringFileUploadsPage = new WebDriverWait(driver,
				10).until(ExpectedConditions
				.elementToBeClickable(FactoringFileUploadsPage_xpath));
		FactoringFileUploadsPage.click();
		Thread.sleep(5000);

		return new FactoringFileUploadPage(driver);
	} catch (Exception ex) {
		return null;
	}
}
public  DataUploadPage openDataUploadPageFactoring() {
	try {
		this.MouseOverOnMenu();

		this.moveToLeftNavigation("Factoring");
		WebElement DataUploadPageFactoring = new WebDriverWait(driver,
				10).until(ExpectedConditions
				.elementToBeClickable(DataUploadPageFactoring_xpath));
		DataUploadPageFactoring.click();
		Thread.sleep(5000);

		return new DataUploadPage(driver);
	} catch (Exception ex) {
		return null;
	}
}
public ManualEntryPage openManualEntryPageFactoring() {
	try {
		this.MouseOverOnMenu();

		this.moveToLeftNavigation("Factoring");
		WebElement ManualEntryPageFactoring = new WebDriverWait(driver,
				10).until(ExpectedConditions
				.elementToBeClickable(ManualEntryPageFactoring_xpath));
		ManualEntryPageFactoring.click();
		Thread.sleep(5000);

		return new ManualEntryPage(driver);
	} catch (Exception ex) {
		return null;
	}
}
public DuplicateInvoicesPageFactoring openDuplicateInvoicesPage() {
	try {
		this.MouseOverOnMenu();

		this.moveToLeftNavigation("Factoring");
		WebElement DuplicateInvoicesPage = new WebDriverWait(driver,
				10).until(ExpectedConditions
				.elementToBeClickable(DuplicateInvoicesPageFactoring_xpath));
		DuplicateInvoicesPage.click();
		Thread.sleep(5000);

		return new DuplicateInvoicesPageFactoring(driver);
	} catch (Exception ex) {
		return null;
	}
}

public PreVerificationPageFactoring openPreVerificationPageFactoring() {
	try {
		this.MouseOverOnMenu();

		this.moveToLeftNavigation("Factoring");
		WebElement PreVerificationPageFactoring = new WebDriverWait(driver,
				10).until(ExpectedConditions
				.elementToBeClickable(PreVerificationPageFactoring_xpath));
		PreVerificationPageFactoring.click();
		Thread.sleep(5000);

		return new PreVerificationPageFactoring(driver);
	} catch (Exception ex) {
		return null;
	}
}
public  IneligiblePageFactoring openIneligiblePageFactoring() {
	try {
		this.MouseOverOnMenu();

		this.moveToLeftNavigation("Factoring");
		WebElement IneligiblePageFactoring = new WebDriverWait(driver,
				10).until(ExpectedConditions
				.elementToBeClickable(IneligiblePageFactoring_xpath));
		IneligiblePageFactoring.click();
		Thread.sleep(5000);

		return new IneligiblePageFactoring(driver);
	} catch (Exception ex) {
		return null;
	}
}
public VerifiedPageFactoring openVerifiedPageFactoring() {
	try {
		this.MouseOverOnMenu();

		this.moveToLeftNavigation("Factoring");
		WebElement VerifiedPageFactoring = new WebDriverWait(driver,
				10).until(ExpectedConditions
				.elementToBeClickable(VerifiedPageFactoring_xpath));
		VerifiedPageFactoring.click();
		Thread.sleep(5000);

		return new VerifiedPageFactoring(driver);
	} catch (Exception ex) {
		return null;
	}
}
public FundedInvoicesPageFactoring openFundedInvoicesPageFactoring() {
	try {
		this.MouseOverOnMenu();

		this.moveToLeftNavigation("Factoring");
		WebElement FundedInvoicesPageFactoring = new WebDriverWait(driver,
				10).until(ExpectedConditions
				.elementToBeClickable(FundedInvoicesPageFactoring_xpath));
		FundedInvoicesPageFactoring.click();
		Thread.sleep(5000);

		return new FundedInvoicesPageFactoring(driver);
	} catch (Exception ex) {
		return null;
	}
}
public RecoursePageFactoring openRecoursePageFactoring() {
	try {
		this.MouseOverOnMenu();

		this.moveToLeftNavigation("Factoring");
		WebElement RecoursePageFactoring = new WebDriverWait(driver,
				10).until(ExpectedConditions
				.elementToBeClickable(RecoursePageFactoring_xpath));
		RecoursePageFactoring.click();
		Thread.sleep(2000);

		return new RecoursePageFactoring(driver);
	} catch (Exception ex) {
		return null;
	}
}
public CashReceiptPageFactoring openCashReceiptPageFactoring() {
	try {
		this.MouseOverOnMenu();

		this.moveToLeftNavigation("Factoring");
		WebElement CashReceiptPageFactoring = new WebDriverWait(driver,
				10).until(ExpectedConditions
				.elementToBeClickable(CashReceiptPageFactoring_xpath));
		CashReceiptPageFactoring.click();
		Thread.sleep(5000);

		return new CashReceiptPageFactoring (driver);
	} catch (Exception ex) {
		return null;
	}
}
public CashReservePageFactoring openCashReservePageFactoring() {
	try {
		this.MouseOverOnMenu();

		this.moveToLeftNavigation("Factoring");
		WebElement CashReservePageFactoring = new WebDriverWait(driver,
				10).until(ExpectedConditions
				.elementToBeClickable(CashReservePageFactoring_xpath));
		CashReservePageFactoring.click();
		Thread.sleep(5000);

		return new CashReservePageFactoring(driver);
	} catch (Exception ex) {
		return null;
	}
}
public EscrowReservePageFactoring openEscrowReservePageFactoring() {
	try {
		this.MouseOverOnMenu();

		this.moveToLeftNavigation("Factoring");
		WebElement CashReservePageFactoring = new WebDriverWait(driver,
				10).until(ExpectedConditions
				.elementToBeClickable(EscrowReservePageFactoring_xpath));
		CashReservePageFactoring.click();
		Thread.sleep(5000);

		return new EscrowReservePageFactoring(driver);
	} catch (Exception ex) {
		return null;
	}
}
public FactoringChargeCodesPage openFactoringChargeCodesPage() {
	try {
		this.MouseOverOnMenu();

		this.moveToLeftNavigation("Factoring");
		WebElement FactoringChargeCodesPage = new WebDriverWait(driver,
				10).until(ExpectedConditions
				.elementToBeClickable(FactoringChargeCodesPage_xpath));
		FactoringChargeCodesPage.click();
		Thread.sleep(5000);

		return new FactoringChargeCodesPage(driver);
	} catch (Exception ex) {
		return null;
	}
}
public ReserveReleasePageFactoring openReserveReleasePageFactoring() {
	try {
		this.MouseOverOnMenu();

		this.moveToLeftNavigation("Factoring");
		WebElement ReserveReleasePageFactoring = new WebDriverWait(driver,
				10).until(ExpectedConditions
				.elementToBeClickable(ReserveReleasePageFactoring_xpath));
		ReserveReleasePageFactoring.click();
		Thread.sleep(5000);

		return new ReserveReleasePageFactoring(driver);
	} catch (Exception ex) {
		return null;
	}
}
public TermCodesPageFactoring openTermCodesPageFactoring() {
	try {
		this.MouseOverOnMenu();

		this.moveToLeftNavigation("Factoring");
		WebElement TermCodesPageFactoring = new WebDriverWait(driver,
				10).until(ExpectedConditions
				.elementToBeClickable(TermCodesPageFactoring_xpath));
		TermCodesPageFactoring.click();
		Thread.sleep(5000);

		return new TermCodesPageFactoring(driver);
	} catch (Exception ex) {
		return null;
	}
}
public InvoiceStatusPageFactoring openInvoiceStatusPageFactoring() {
	try {
		this.MouseOverOnMenu();

		this.moveToLeftNavigation("Factoring");
		WebElement InvoiceStatusPageFactoring = new WebDriverWait(driver,
				10).until(ExpectedConditions
				.elementToBeClickable(InvoiceStatusPageFactoring_xpath));
		InvoiceStatusPageFactoring.click();
		Thread.sleep(5000);

		return new InvoiceStatusPageFactoring(driver);
	} catch (Exception ex) {
		return null;
	}
}
public  BucketAgingPageFactoring openBucketAgingPageFactoring() {
	try {
		this.MouseOverOnMenu();

		this.moveToLeftNavigation("Factoring");
		WebElement BucketAgingPageFactoring = new WebDriverWait(driver,
				10).until(ExpectedConditions
				.elementToBeClickable(BucketAgingPageFactoring_xpath));
		BucketAgingPageFactoring.click();
		Thread.sleep(5000);

		return new BucketAgingPageFactoring(driver);
	} catch (Exception ex) {
		return null;
	}
}
public InvoiceValidationTemplatePageFactoring openInvoiceValidationTemplatePageFactoring() {
	try {
		this.MouseOverOnMenu();

		this.moveToLeftNavigation("Factoring");
		WebElement InvoiceValidationTemplatePageFactoring = new WebDriverWait(driver,
				10).until(ExpectedConditions
				.elementToBeClickable(InvoiceValidationTemplatePageFactoring_xpath));
		InvoiceValidationTemplatePageFactoring.click();
		Thread.sleep(5000);

		return new InvoiceValidationTemplatePageFactoring(driver);
	} catch (Exception ex) {
		return null;
	}
}
public FactoringGLSetupPage openFactoringGLSetupPage() {
	try {
		this.MouseOverOnMenu();

		this.moveToLeftNavigation("Factoring");
		WebElement FactoringGLSetupPage = new WebDriverWait(driver,
				10).until(ExpectedConditions
				.elementToBeClickable(FactoringGLSetupPage_xpath));
		FactoringGLSetupPage.click();
		Thread.sleep(5000);

		return new FactoringGLSetupPage(driver);
	} catch (Exception ex) {
		return null;
	}
}
public FactoringGLTransactionsPage openFactoringGLTransactionsPage() {
	try {
		this.MouseOverOnMenu();

		this.moveToLeftNavigation("Factoring");
		WebElement FactoringGLTransactionsPage = new WebDriverWait(driver,
				10).until(ExpectedConditions
				.elementToBeClickable(FactoringGLTransactionsPage_xpath));
		FactoringGLTransactionsPage.click();
		Thread.sleep(5000);

		return new FactoringGLTransactionsPage(driver);
	} catch (Exception ex) {
		return null;
	}
}
public FactoringMigrationPage openFactoringMigrationPage() {
	try {
		this.MouseOverOnMenu();

		this.moveToLeftNavigation("Factoring");
		WebElement FactoringMigrationPage = new WebDriverWait(driver,
				10).until(ExpectedConditions
				.elementToBeClickable(FactoringMigrationPage_xpath));
		FactoringMigrationPage.click();
		Thread.sleep(5000);

		return new FactoringMigrationPage(driver);
	} catch (Exception ex) {
		return null;
	}
}

public CreditSourcesPageFactoring openCreditSourcesPageFactoring() {
	try {
		this.MouseOverOnMenu();

		this.moveToLeftNavigation("Factoring");
		WebElement CreditSourcesPageFactoring = new WebDriverWait(driver,
				10).until(ExpectedConditions
				.elementToBeClickable(CreditSourcesPageFactoring_xpath));
		CreditSourcesPageFactoring.click();
		Thread.sleep(5000);

		return new CreditSourcesPageFactoring(driver);
	} catch (Exception ex) {
		return null;
	}
}
public FollowUpActionsPageFactoring openFollowUpActionsPageFactoring() {
	try {
		this.MouseOverOnMenu();

		this.moveToLeftNavigation("Factoring");
		WebElement FollowUpActionsPageFactoring = new WebDriverWait(driver,
				10).until(ExpectedConditions
				.elementToBeClickable(FollowUpActionsPageFactoring_xpath));
		FollowUpActionsPageFactoring.click();
		Thread.sleep(5000);

		return new FollowUpActionsPageFactoring(driver);
	} catch (Exception ex) {
		return null;
	}
}
public AccountDebtorPageFactoring openAccountDebtorPageFactoring() {
	try {
		this.MouseOverOnMenu();

		this.moveToLeftNavigation("Factoring");
		WebElement AccountDebtorPageFactoring = new WebDriverWait(driver,
				10).until(ExpectedConditions
				.elementToBeClickable(AccountDebtorPageFactoring_xpath));
		AccountDebtorPageFactoring.click();
		Thread.sleep(5000);

		return new AccountDebtorPageFactoring(driver);
	} catch (Exception ex) {
		return null;
	}
}
public GlobalDebtorPageFactoring openGlobalDebtorPageFactoring() {
	try {
		this.MouseOverOnMenu();

		this.moveToLeftNavigation("Factoring");
		WebElement GlobalDebtorPageFactoring = new WebDriverWait(driver,
				10).until(ExpectedConditions
				.elementToBeClickable(GlobalDebtorPageFactoring_xpath));
		GlobalDebtorPageFactoring.click();
		Thread.sleep(5000);

		return new GlobalDebtorPageFactoring(driver);
	} catch (Exception ex) {
		return null;
	}
}
public DebtorMatchingPageFactoring openDebtorMatchingPageFactoring() {
	try {
		this.MouseOverOnMenu();

		this.moveToLeftNavigation("Factoring");
		WebElement DebtorMatchingPageFactoring = new WebDriverWait(driver,
				10).until(ExpectedConditions
				.elementToBeClickable(DebtorMatchingPageFactoring_xpath));
		DebtorMatchingPageFactoring.click();
		Thread.sleep(5000);

		return new DebtorMatchingPageFactoring(driver);
	} catch (Exception ex) {
		return null;
	}
}
public LetterProcessingPageFactoring openLetterProcessingPageFactoring() {
	try {
		this.MouseOverOnMenu();

		this.moveToLeftNavigation("Factoring");
		WebElement LetterProcessingPageFactoring = new WebDriverWait(driver,
				10).until(ExpectedConditions
				.elementToBeClickable(LetterProcessingPageFactoring_xpath));
		LetterProcessingPageFactoring.click();
		Thread.sleep(5000);

		return new LetterProcessingPageFactoring(driver);
	} catch (Exception ex) {
		return null;
	}
}
public LetterTrackingPageFactoring openLetterTrackingPageFactoring() {
	try {
		this.MouseOverOnMenu();

		this.moveToLeftNavigation("Factoring");
		WebElement LetterTrackingPageFactoring = new WebDriverWait(driver,
				10).until(ExpectedConditions
				.elementToBeClickable(LetterTrackingPageFactoring_xpath));
		LetterTrackingPageFactoring.click();
		Thread.sleep(5000);

		return new LetterTrackingPageFactoring(driver);
	} catch (Exception ex) {
		return null;
	}
}
public LetterAuditPageFactoring openLetterAuditPageFactoring() {
	try {
		this.MouseOverOnMenu();

		this.moveToLeftNavigation("Factoring");
		WebElement LetterAuditPageFactoring = new WebDriverWait(driver,
				10).until(ExpectedConditions
				.elementToBeClickable(LetterAuditPageFactoring_xpath));
		LetterAuditPageFactoring.click();
		Thread.sleep(5000);

		return new LetterAuditPageFactoring(driver);
	} catch (Exception ex) {
		return null;
	}
}
public ACDebtorStatusPageFactoring openACDebtorStatusPageFactoring() {
	try {
		this.MouseOverOnMenu();

		this.moveToLeftNavigation("Factoring");
		WebElement  ACDebtorStatusPageFactoring= new WebDriverWait(driver,
				10).until(ExpectedConditions
				.elementToBeClickable(ACDebtorStatusPageFactoring_xpath));
		ACDebtorStatusPageFactoring.click();
		Thread.sleep(5000);

		return new ACDebtorStatusPageFactoring(driver);
	} catch (Exception ex) {
		return null;
	}
}
public BrokerSetupPageFactoring openBrokerSetupPageFactoring() {
	try {
		this.MouseOverOnMenu();

		this.moveToLeftNavigation("Factoring");
		WebElement BrokerSetupPageFactoring = new WebDriverWait(driver,
				10).until(ExpectedConditions
				.elementToBeClickable(BrokerSetupPageFactoring_xpath));
		BrokerSetupPageFactoring.click();
		Thread.sleep(5000);

		return new BrokerSetupPageFactoring(driver);
	} catch (Exception ex) {
		return null;
	}
}
public BrokerBankInformationPageFactoring openBrokerBankInformationPageFactoring() {
	try {
		this.MouseOverOnMenu();

		this.moveToLeftNavigation("Factoring");
		WebElement BrokerBankInformationPageFactoring = new WebDriverWait(driver,
				10).until(ExpectedConditions
				.elementToBeClickable(BrokerBankInformationPageFactoring_xpath));
		BrokerBankInformationPageFactoring.click();
		Thread.sleep(5000);

		return new BrokerBankInformationPageFactoring(driver);
	} catch (Exception ex) {
		return null;
	}
}
public BrokerFeeSetupPageFactoring openBrokerFeeSetupPageFactoring() {
	try {
		this.MouseOverOnMenu();

		this.moveToLeftNavigation("Factoring");
		WebElement BrokerFeeSetupPageFactoring = new WebDriverWait(driver,
				10).until(ExpectedConditions
				.elementToBeClickable(BrokerFeeSetupPageFactoring_xpath));
		BrokerFeeSetupPageFactoring.click();
		Thread.sleep(5000);

		return new BrokerFeeSetupPageFactoring(driver);
	} catch (Exception ex) {
		return null;
	}
}
public BrokerCommissionPageFactoring openBrokerCommissionPageFactoring() {
	try {
		this.MouseOverOnMenu();

		this.moveToLeftNavigation("Factoring");
		WebElement BrokerCommissionPageFactoring = new WebDriverWait(driver,
				10).until(ExpectedConditions
				.elementToBeClickable(BrokerCommissionPageFactoring_xpath));
		BrokerCommissionPageFactoring.click();
		Thread.sleep(5000);

		return new BrokerCommissionPageFactoring(driver);
	} catch (Exception ex) {
		return null;
	}
}
public BrokerInquiryPage openBrokerInquiryPageFactoring() {
	try {
		this.MouseOverOnMenu();

		this.moveToLeftNavigation("Factoring");
		WebElement BrokerCommissionPageFactoring = new WebDriverWait(driver,
				10).until(ExpectedConditions
				.elementToBeClickable(BrokerInquiryPageFactoring_xpath));
		BrokerCommissionPageFactoring.click();
		Thread.sleep(5000);

		return new BrokerInquiryPage(driver);
	} catch (Exception ex) {
		return null;
	}
}

public ProcessingHistoryPageFactoring openProcessingHistoryPageFactoring() {
	try {
		this.MouseOverOnMenu();

		this.moveToLeftNavigation("Factoring");
		WebElement ProcessingHistoryPageFactoring = new WebDriverWait(driver,
				10).until(ExpectedConditions
				.elementToBeClickable(ProcessingHistoryPageFactoring_xpath));
		ProcessingHistoryPageFactoring.click();
		Thread.sleep(5000);

		return new ProcessingHistoryPageFactoring(driver);
	} catch (Exception ex) {
		return null;
	}
}
public WarningPageFactoring openWarningPageFactoring() {
	try {
		this.MouseOverOnMenu();

		this.moveToLeftNavigation("Factoring");
		WebElement WarningPageFactoring = new WebDriverWait(driver,
				10).until(ExpectedConditions
				.elementToBeClickable(WarningPageFactoring_xpath));
		WarningPageFactoring.click();
		Thread.sleep(5000);

		return new WarningPageFactoring(driver);
	} catch (Exception ex) {
		return null;
	}
}
public FundsEmployedPageFactoring openFundsEmployedPageFactoring() {
	try {
		this.MouseOverOnMenu();

		this.moveToLeftNavigation("Factoring");
		WebElement FundsEmployedPageFactoring = new WebDriverWait(driver,
				10).until(ExpectedConditions
				.elementToBeClickable(FundsEmployedPageFactoring_xpath));
		FundsEmployedPageFactoring.click();
		Thread.sleep(5000);

		return new FundsEmployedPageFactoring(driver);
	} catch (Exception ex) {
		return null;
	}
}
public CreditQueuePageFactoring openCreditQueuePageFactoring() {
	try {
		this.MouseOverOnMenu();

		this.moveToLeftNavigation("Factoring");
		WebElement  CreditQueuePageFactoring= new WebDriverWait(driver,
				10).until(ExpectedConditions
				.elementToBeClickable(CreditQueuePageFactoring_xpath));
		CreditQueuePageFactoring.click();
		Thread.sleep(5000);

		return new CreditQueuePageFactoring(driver);
	} catch (Exception ex) {
		return null;
	}
}

public CollectionTicklerPageFactoring openCollectionTicklerPageFactoring() {
	try {
		this.MouseOverOnMenu();

		this.moveToLeftNavigation("Factoring");
		WebElement  CollectionTicklerPageFactoring= new WebDriverWait(driver,
				10).until(ExpectedConditions
				.elementToBeClickable(CollectionTicklerPageFactoring_xpath));
		CollectionTicklerPageFactoring.click();
		Thread.sleep(5000);

		return new CollectionTicklerPageFactoring(driver);
	} catch (Exception ex) {
		return null;
	}
}
public BatchProcessScreenPageFactoring openBatchProcessScreenPageFactoring() {
	try {
		this.MouseOverOnMenu();

		this.moveToLeftNavigation("Cash Application 2.0");
		WebElement  CollectionTicklerPageFactoring= new WebDriverWait(driver,
				10).until(ExpectedConditions
				.elementToBeClickable(BatchProcessScreenPageFactoring_xpath));
		CollectionTicklerPageFactoring.click();
		Thread.sleep(5000);

		return new BatchProcessScreenPageFactoring(driver);
	} catch (Exception ex) {
		return null;
	}
}
public Ungrouped_checksPage openungrouped_checks() {
	try {
		this.MouseOverOnMenu();

		this.moveToLeftNavigation("Cash Application 2.0");
		WebElement  ungrouped_checks= new WebDriverWait(driver,
				10).until(ExpectedConditions
				.elementToBeClickable(ungrouped_checksPage_xpath));
		ungrouped_checks.click();
		Thread.sleep(5000);

		return new Ungrouped_checksPage(driver);
	} catch (Exception ex) {
		return null;
	}
}
public ProcessedBatchesPages openProcessedBatches() {
	try {
		this.MouseOverOnMenu();

		this.moveToLeftNavigation("Cash Application 2.0");
		WebElement ProcessedBatches = new WebDriverWait(driver,
				10).until(ExpectedConditions
				.elementToBeClickable(ProcessedBatchesPage_xpath));
		ProcessedBatches.click();
		Thread.sleep(5000);

		return new ProcessedBatchesPages(driver);
	} catch (Exception ex) {
		return null;
	}
}
public DepositUploadPage opendeposit_uploads() {
	try {
		this.MouseOverOnMenu();

		this.moveToLeftNavigation("Cash Application 2.0");
		WebElement deposit_uploads= new WebDriverWait(driver,
				10).until(ExpectedConditions
				.elementToBeClickable(deposit_uploadsPage_xpath));
		deposit_uploads.click();
		Thread.sleep(5000);

		return new DepositUploadPage(driver);
	} catch (Exception ex) {
		return null;
	}
}
public RepaymentReportPage openRepayment() {
	try {
		this.MouseOverOnMenu();

		this.moveToLeftNavigation("Cash Application 2.0");
		WebElement Repayment= new WebDriverWait(driver,
				10).until(ExpectedConditions
				.elementToBeClickable(RepaymentPage_xpath));
		Repayment.click();
		Thread.sleep(5000);

		return new RepaymentReportPage(driver);
	} catch (Exception ex) {
		return null;
	}
}
public CreditMemoAdjustmentPage opencredit_memo_adjustment() {
	try {
		this.MouseOverOnMenu();

		this.moveToLeftNavigation("Cash Application 2.0");
		WebElement credit_memo_adjustment = new WebDriverWait(driver,
				10).until(ExpectedConditions
				.elementToBeClickable(credit_memo_adjustmentPage_xpath));
		credit_memo_adjustment.click();
		Thread.sleep(5000);

		return new CreditMemoAdjustmentPage(driver);
	} catch (Exception ex) {
		return null;
	}
}
public CreditMemoHistoryPage opencredit_memo_history() {
	try {
		this.MouseOverOnMenu();

		this.moveToLeftNavigation("Cash Application 2.0");
		WebElement credit_memo_history= new WebDriverWait(driver,
				10).until(ExpectedConditions
				.elementToBeClickable(credit_memo_historyPage_xpath));
		credit_memo_history.click();
		Thread.sleep(5000);

		return new CreditMemoHistoryPage(driver);
	} catch (Exception ex) {
		return null;
	}
}
/**/public BasicParametersPageFactoring openBasicparameterFactoring() {
	try {
		this.MouseOverOnMenu();

		this.moveToLeftNavigation("Client Maintenance");
		WebElement BasicParametersPageFactoring = new WebDriverWait(driver,
				10).until(ExpectedConditions
				.elementToBeClickable(BasicparameterFactoring_xpath));
		BasicParametersPageFactoring.click();
		Thread.sleep(5000);

		return new BasicParametersPageFactoring(driver);
	} catch (Exception ex) {
		return null;
	}
}




/*nav*/public boolean moveToReport(String navigation_Name) {
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
				new Actions(driver).moveToElement(option).click().perform();
				return true;
			}

		}
		return false;
	} catch (Exception ex) {
		return false;
	}

}


public ReportsFactoringPage openFactoringReportsPage() {
	try {
		this.MouseOverOnMenu();
		this.moveToLeftNavigation("report");
		WebElement report = new WebDriverWait(driver, 10)
				.until(ExpectedConditions
						.visibilityOfElementLocated(reports_xpath));
		report.click();
		/* new Actions(driver).moveToElement(menuItemWebE).perform(); */


		//Thread.sleep(2000);
		this.isAlertPresent();
		return new ReportsFactoringPage(driver);

	} catch (Exception ex) {
		return null;
	}
}
/*public ClientFundedARAgingPage ClientFundedARAgingPage(){
	try {
		this.MouseOverOnMenu();

		this.moveToReport("Report");
		WebElement ClientFundedARAgingPage = new WebDriverWait(driver,
				10).until(ExpectedConditions
				.elementToBeClickable(ClientFundedARAgingPage_xpath));
		ClientFundedARAgingPage.click();
		Thread.sleep(5000);

		return new ClientFundedARAgingPage(driver);
	} catch (Exception ex) {
		return null;
	}
}*/
/*Reports Factoring*/


/*end*/



public FactoringFeeSetupPage openFactoringFeeSetup() {
	try {
		Thread.sleep(1000);
		this.MouseOverOnMenu();
        Thread.sleep(1000);
		this.moveToLeftNavigation("Client Maintenance");
		WebElement FactoringFeeSetupPage = new WebDriverWait(driver,
				1000).until(ExpectedConditions
				.elementToBeClickable(factoringFeeSetup_xpath));
		FactoringFeeSetupPage.click();
		
		Thread.sleep(2000);
		return new FactoringFeeSetupPage(driver);
	} catch (Exception ex) {
		return null;
	}
}

public FactoringFileUploadPage openFactoringFileUpload(String clientname) {
	try {
		this.selectClientFromDropdown(clientname);
		this.MouseOverOnMenu();
		this.moveToLeftNavigation("Factoring");
		WebElement FactoringFileUploadPage = new WebDriverWait(driver,
				1000).until(ExpectedConditions
				.elementToBeClickable(factoringFileUpload_xpath));
		FactoringFileUploadPage.click();
		Thread.sleep(5000);

		return new FactoringFileUploadPage(driver);
	} catch (Exception ex) {
		return null;
	}
}

public NewInvoicesPage openNewInvoicesPage() {
	
	try {
		this.MouseOverOnMenu();
		this.moveToLeftNavigation("Factoring");
		WebElement NewInvoicesPage = new WebDriverWait(driver,
				1000).until(ExpectedConditions
				.elementToBeClickable(newInvoices_xpath));
		NewInvoicesPage.click();
		Thread.sleep(5000);

		return new NewInvoicesPage(driver);
	} catch (Exception ex) {
		return null;
	}
	
}

public DataUploadPage openDataUploadPage(String clientname) {
	try {
		this.selectClientFromDropdown(clientname);
		this.MouseOverOnMenu();
		this.moveToLeftNavigation("ABL");
		WebElement DataUploadPage = new WebDriverWait(driver, 10)
		.until(ExpectedConditions
				.visibilityOfElementLocated(dataUpload_xpath));
		
		DataUploadPage.click();
		
		Thread.sleep(2000);
		this.isAlertPresent();
		return new DataUploadPage(driver);
	} catch (Exception ex) {
		return null;
	}
}


public InvoiceValidationTemplatePage openInvValTempPage() {
	try {
		/*this.selectClientFromDropdown(clientname);*/
		this.MouseOverOnMenu();
		this.moveToLeftNavigation("Factoring");
		WebElement InvValTempPage = new WebDriverWait(driver, 10)
				.until(ExpectedConditions
						.visibilityOfElementLocated(invoiceValidationTemplate_xpath));
		InvValTempPage.click();
		
		Thread.sleep(2000);
		this.isAlertPresent();
		return new InvoiceValidationTemplatePage(driver);
	} catch (Exception ex) {
		return null;
	}
}

public AccountDebtorPage openAccountDebtorPage() {
	try {
		/*this.selectClientFromDropdown(clientname);*/
		this.MouseOverOnMenu();
		this.moveToLeftNavigation("Factoring");
		WebElement AccountDebtorsPage = new WebDriverWait(driver, 10)
				.until(ExpectedConditions
						.visibilityOfElementLocated(accountDebtors_xpath));
		AccountDebtorsPage.click();
		
		Thread.sleep(2000);
		this.isAlertPresent();
		return new AccountDebtorPage(driver);
	} catch (Exception ex) {
		return null;
	}
}

public ManualEntryPage openManualEntryPage(String clientname) 
{
	try {
		this.selectClientFromDropdown(clientname);
		this.MouseOverOnMenu();
		this.moveToLeftNavigation("Factoring");
		WebElement ManualEntryPage = new WebDriverWait(driver, 10)
				.until(ExpectedConditions
						.visibilityOfElementLocated(manualEntry_xpath));
		ManualEntryPage.click();
		
		Thread.sleep(2000);
		this.isAlertPresent();
		return new ManualEntryPage(driver);
	} catch (Exception ex) {
		return null;
	}
}


public ReportsPage openReportsPage() {
	try {
		this.MouseOverOnMenu();
		this.moveToLeftNavigation("report");
		WebElement report = new WebDriverWait(driver, 10)
				.until(ExpectedConditions
						.visibilityOfElementLocated(reports_xpath));
		report.click();
		/* new Actions(driver).moveToElement(menuItemWebE).perform(); */


		//Thread.sleep(2000);
		this.isAlertPresent();
		return new ReportsPage(driver);

	} catch (Exception ex) {
		return null;
	}
}


public UnapprovedBBCsPage openUnapprovedBBCsPage() {

    try {
        this.MouseOverOnMenu();
        this.moveToLeftNavigation("ABL");
        WebElement BasicParametersWebEelement = new WebDriverWait(driver,
                10).until(ExpectedConditions
                .elementToBeClickable(unapprovebbc_xpath));
        BasicParametersWebEelement.click();
        Thread.sleep(1000);
        return new UnapprovedBBCsPage(driver);
    } catch (Exception ex) {
        return null;
    }
}


public CashReceiptPage openReportsPages() {
	try {
		this.MouseOverOnMenu();
		this.moveToLeftNavigation("report");
		WebElement report = new WebDriverWait(driver, 10)
				.until(ExpectedConditions
						.visibilityOfElementLocated(reports_xpath));
		report.click();
		/* new Actions(driver).moveToElement(menuItemWebE).perform(); */


		//Thread.sleep(2000);
		this.isAlertPresent();
		return new CashReceiptPage(driver);
	} catch (Exception ex) {
		return null;
	}


	}


//cyncs_4462


	
public AssetsInventoryHistoryPage openAssetsInventoryHistoryPage() {

    try {
        this.MouseOverOnMenu();
        this.moveToLeftNavigation("ABL");
        WebElement BasicParametersWebEelement = new WebDriverWait(driver,
                1000).until(ExpectedConditions
                .elementToBeClickable(assetinventoryhistorypage_xpath));
        BasicParametersWebEelement.click();
        /*Thread.sleep(1000);*/
        return new AssetsInventoryHistoryPage(driver);
    } catch (Exception ex) {
        return null;
    }
}
}
