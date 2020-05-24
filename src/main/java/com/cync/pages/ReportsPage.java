package com.cync.pages;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.SkipException;

import com.cync.base.BasePage;

public class ReportsPage extends BasePage {

	private final By reportsHeader=By.xpath("//span[text()=' Reports ']");
	private final By bbcReport_xpath=By.xpath("//a[text()='BBC Report']");
	private final By htmlButton_xpath=By.xpath("//*[@class='ui-dialog-buttonset']//button[text()='HTML']");
	private final By concentrationTextReport_xpath=By.xpath("//td[contains(text(),'Concentration %')]");
	private final By concentrationTextReportValue_xpath=By.xpath("(//td[contains(text(),' 21,925.00')])[3]");
	private final By ineligibleReceivableAnalysis_xpath=By.xpath("//a[text()='Ineligible/Eligible Receivable Analysis']");
	private final By ineligibleReceivableAnalysisGroupBy_xpath=By.xpath("//select[@id='ineligible_style']");
	
	
	//Summary//Ghanavi
	private final By receivableAgedTrialBalance_xpath=By.xpath("//a[text()='Receivables Aged Trial Balance']");
	private final By bbcDate_xpath=By.id("bbc_status");
	private final By style_xpath=By.id("style");
	private final By receivables_xpath=By.id("receivables_balance");
	
	private final By headerReport_xpath=By.xpath("//h1");
	private final By accountNo_xpath=By.xpath("//table[@class='dataTable']/tbody/tr[1]/td[1]");
	private final By accname_xpath=By.xpath("//table[@class='dataTable']/tbody/tr[1]/td[2]");
	private final By future_xpath=By.xpath("//table[@class='dataTable']/tbody/tr[1]/td[3]");
	private final By current_xapth=By.xpath("//table[@class='dataTable']/tbody/tr[1]/td[4]");
	private final By over30_xpath=By.xpath("//table[@class='dataTable']/tbody/tr[1]/td[5]");
	private final By over60_xpath=By.xpath("//table[@class='dataTable']/tbody/tr[1]/td[6]");
	private final By over90_xpath=By.xpath("//table[@class='dataTable']/tbody/tr[1]/td[7]");
	private final By over120_xpath=By.xpath("//table[@class='dataTable']/tbody/tr[1]/td[8]");
	private final By total_xpath=By.xpath("//table[@class='dataTable']/tbody/tr[1]/td[9]");
	
	private final By payablesAgedTrialBalance_xpath=By.xpath("//a[text()='Payables Aged Trial Balance']");
	private final By payable_xpath=By.id("payables_balance");
	
	private final By aRAPConcentrations_xpath=By.xpath("//a[text()='AR / AP Concentrations']");
	private final By accountType_xpath=By.id("account_type");
	private final By reportType_xpath=By.id("report_type");
	
	private final By accountNameArAp_xpath=By.xpath("//table[@class='dataTable']/tbody/tr[1]/td[1]");
	private final By PercOfTotalARArAp_xpath=By.xpath("//table[@class='dataTable']/tbody/tr[1]/td[2]");
	private final By totalarAp_xpath=By.xpath("//table[@class='dataTable']/tbody/tr[1]/td[3]");
	private final By currentArAp_xapth=By.xpath("//table[@class='dataTable']/tbody/tr[1]/td[4]");
	private final By over30ArAp_xpath=By.xpath("//table[@class='dataTable']/tbody/tr[1]/td[5]");
	private final By over60ArAp_xpath=By.xpath("//table[@class='dataTable']/tbody/tr[1]/td[6]");
	private final By over90ArAp_xpath=By.xpath("//table[@class='dataTable']/tbody/tr[1]/td[7]");
	private final By over120ArAp_xpath=By.xpath("//table[@class='dataTable']/tbody/tr[1]/td[8]");
	
	private final By assetInventoryReport_xpath=By.xpath("//a[text()='Assets / Inventory Report']");
	
	private final By location_xpath=By.xpath("//table[@class='dataTable']/tbody/tr[1]/td[1]");
	private final By actualValue_xpath=By.xpath("//table[@class='dataTable']/tbody/tr[1]/td[2]");
	private final By ineligibleAmount_xpath=By.xpath("//table[@class='dataTable']/tbody/tr[1]/td[3]");
	private final By assetAmount_xapth=By.xpath("//table[@class='dataTable']/tbody/tr[1]/td[4]");
	private final By bbcDateRecev_xpath=By.id("bbc_id");
	private final By bbcTrendReport_xpath=By.xpath("(//a[text()='BBC Trend Report'])[1]");
	private final By bbcTrendStartDate_xpath=By.xpath("//*[@class='control-group']//input[@id='start_date']");
	private final By bbcTrendEndDate_xpath=By.xpath("//*[@class='control-group']//input[@id='end_date']");
	private final By endingARBalance_xpath=By.xpath("//td[contains(text(),'Ending A/R Balance')]");
	private final By endingARBalanceValue_xpath=By.xpath("//table[@class='dataTable']/tbody/tr[9]/td[2]");
	private final By netARAvailableForAdvance_xpath=By.xpath("//td[contains(text(),'Net AR Available for Advance')]");
	private final By netARAvailableForAdvanceValue_xpath=By.xpath("//table[@class='dataTable']/tbody/tr[34]/td[2]");
	private final By netInventoryAvailableForAdvance_xpath=By.xpath("//*[contains(text(),'Net Inventory Available for Advance')]");
	private final By netInventoryAvailableForAdvanceValue_xpath=By.xpath("//table[@class='dataTable']/tbody/tr[43]/td[2]");
	private final By totalAvailableARInventory_xpath=By.xpath("//td[contains(text(),'Total Available AR & Inventory')]");
	private final By totalAvailableARInventoryValue_xpath=By.xpath("//table[@class='dataTable']/tbody/tr[44]/td[2]");
	private final By netOtherAvailableForAdvance_xpath=By.xpath("//td[contains(text(),'Net Other Available for Advance')]");
	private final By netOtherAvailableForAdvanceValue_xpath=By.xpath("//table[@class='dataTable']/tbody/tr[54]/td[2]");
	private final By totalAvailableForAdvance_xpath=By.xpath("//td[contains(text(),'Total Available For Advance')]");
	private final By totalAvailableForAdvanceValue_xpath=By.xpath("//table[@class='dataTable']/tbody/tr[58]/td[2]");
	private final By approvedLineLessReserves_xpath=By.xpath("//td[contains(text(),'Approved Line less Reserves')]");
	private final By approvedLineLessReservesValue_xpath=By.xpath("//table[@class='dataTable']/tbody/tr[62]/td[2]");
	private final By netCollateralAvailable_xpath=By.xpath("//td[contains(text(),'Net Collateral Available')]");
	private final By netCollateralAvailableValue_xpath=By.xpath("//table[@class='dataTable']/tbody/tr[65]/td[2]");
	
	private final By endingBalanceTotalAR_xpath=By.xpath("//td[contains(text(),'Ending Balance Total AR')]");
	private final By endingBalanceTotalARValue_xpath=By.xpath("//table[@class='dataTable']/tbody/tr[11]/td[8]");
	private final By totalAgedReceivables_xpath=By.xpath("//td[contains(text(),'Total Aged Receivables')]");
	private final By totalAgedReceivablesValue_xpath=By.xpath("//table[@class='dataTable']/tbody/tr[19]/td[8]");
	private final By netARAvailableForAdvanceBbcValue_xpath=By.xpath("//table[@class='dataTable']/tbody/tr[31]/td[8]");
	private final By netInventoryAvailableForAdvanceBbcValue_xpath=By.xpath("//table[@class='dataTable']/tbody/tr[41]/td[8]");
	private final By totalAvailableARInventoryBbc_xpath=By.xpath("//td[contains(text(),'TOTAL AR & INVENTORY AVAILABILITY')]");
	private final By totalAvailableARInventoryBbcValue_xpath=By.xpath("//table[@class='dataTable']/tbody/tr[43]/td[8]");
	private final By netOtherAvailableForAdvanceBbcValue_xpath=By.xpath("//table[@class='dataTable']/tbody/tr[55]/td[8]");
	private final By totalAvailableForAdvanceBbcValue_xpath=By.xpath("//table[@class='dataTable']/tbody/tr[60]/td[8]");
	private final By lineLimitWithReserves_xpath=By.xpath("//td[contains(text(),'Line Limit with Reserves')]");
	private final By lineLimitWithReservesValue_xpath=By.xpath("//table[@class='dataTable']/tbody/tr[64]/td[8]");
	private final By borrowingBaseAvailability_xpath=By.xpath("//td[contains(text(),'BORROWING BASE AVAILABILITY')]");
	private final By borrowingBaseAvailabilityValue_xpath=By.xpath("//table[@class='dataTable']/tbody/tr[73]/td[8]");
	private final By netBorrowingBaseAvailable_xpath=By.xpath("//td[contains(text(),'NET BORROWING BASE AVAILABLE')]");
	private final By netBorrowingBaseAvailableValue_xpath=By.xpath("//table[@class='dataTable']/tbody/tr[76]/td[8]");
	private final By bBCExecutiveTrendReport_xpath=By.xpath("//a[text()='BBC Executive Trend Report']");

	private final By generateTrend_xpath=By.xpath("//button[text()='Generate']");
	
	private final By commitmentAmount_xpath=By.xpath("//th[contains(text(),'Commitment Amount')]");
	private final By commitmentAmountValue_xpath=By.xpath("//td[contains(text(),'0.00')]");
	private final By bBCFrequency_xpath=By.xpath("//th[contains(text(),'BBC Frequency')]");
	private final By bBCFrequencyValue_xpath=By.xpath("//td[contains(text(),'Monthly')]");
	
	private final By eligibilityPeriod_xpath=By.xpath("//th[contains(text(),'Eligibility Period')]");
	private final By eligibilityPeriodValue_xpath=By.xpath("//td[contains(text(),'>60 ADI')]");
	
	private final By receivablesTrend_xpath=By.xpath("//th[contains(text(),'Receivables')]");
	private final By receivablesTrendAdvance_xpath=By.xpath("//td[contains(text(),'80.00')][1]");
	private final By receivablesTrendSubLimit_xpath=By.xpath("(//td[contains(text(),'0.00')])[3]");
	private final By inventoryTrend_xpath=By.xpath("//th[contains(text(),'Inventory')]");
	private final By inventoryTrendAdvance_xpath=By.xpath("(//table[@class='reportview-table'])[2]/tbody/tr[1]/td[2]/table/tbody/tr[3]/td[2]");
	private final By inventoryTrendSublimit_xpath=By.xpath("(//table[@class='reportview-table'])[2]/tbody/tr[1]/td[2]/table/tbody/tr[3]/td[3]");
	private final By otherCollateralTrend_xpath=By.xpath("//th[contains(text(),'Other Collateral')]");
	private final By otherCollateralAdvance_xpath=By.xpath("(//table[@class='reportview-table'])[2]/tbody/tr[1]/td[2]/table/tbody/tr[4]/td[2]");
	private final By otherCollateralSublimit_xpath=By.xpath("(//table[@class='reportview-table'])[2]/tbody/tr[1]/td[2]/table/tbody/tr[4]/td[3]");
	
	private final By focalDate_xpath=By.xpath("//th[contains(text(),'Focal Date')]");
	private final By focalDateValue_xpath=By.xpath("(//table[@class='reportview-table'])[1]/tbody/tr[1]/td[3]/table/tbody/tr[1]/td");
	
	private final By endingARBalanceRollForward_xpath=By.xpath("(//td[contains(text(),'Ending A/R Balance')])[1]");
	private final By endingARBalanceRollForwardValue_xpath=By.xpath("//table[@class='rbbc-nonebox']/tbody/tr[3]/td[2]");
	private final By endingARBalanceArAging_xpath=By.xpath("(//td[contains(text(),'Ending A/R Balance')])[2]");
	private final By endingARBalanceArAgingValue_xpath=By.xpath("//table[@class='rbbc-nonebox']/tbody/tr[11]/td[2]");
	
	private final By endingAPBalance_xpath=By.xpath("//td[contains(text(),'Ending A/P Balance')]");
	private final By endingAPBalanceValue_xpath=By.xpath("//table[@class='rbbc-nonebox']/tbody/tr[18]/td[2]");
	private final By NetARAvailableForAdvance_xpath=By.xpath("//td[contains(text(),'A/R Borrowing Base')]");
	private final By NetARAvailableForAdvanceValue_xpath=By.xpath("//table[@class='rbbc-nonebox']/tbody/tr[25]/td[2]");
	private final By NetInventoryAvailableForAdvance_xapth=By.xpath("//td[contains(text(),'Net Inventory Available For Advance')]");	
	private final By NetInventoryAvailableForAdvanceValue_xapth=By.xpath("//table[@class='rbbc-nonebox']/tbody/tr[32]/td[2]");
	private final By NetOtherCollateralAvailableForAdvance_xpath=By.xpath("//td[contains(text(),'Net Other Collateral Available For Advance')]");
	private final By NetOtherCollateralAvailableForAdvanceValue_xpath=By.xpath("//table[@class='rbbc-nonebox']/tbody/tr[36]/td[2]");
	private final By totalBorrowingBase_xpath=By.xpath("//td[contains(text(),'Total Borrowing Base')]");
	private final By totalBorrowingBaseValue_xpath=By.xpath("//table[@class='rbbc-nonebox']/tbody/tr[39]/td[2]");
	private final By approvedLine_xpath=By.xpath("//td[contains(text(),'Approved Line')]");
	private final By approvedLineValue_xpath=By.xpath("//table[@class='rbbc-nonebox']/tbody/tr[39]/td[2]");
	private final By netCollateralAvailableTrend_xpath=By.xpath("//td[contains(text(),'Net Collateral Available')]");
	private final By netCollateralAvailableTrendValue_xpath=By.xpath("//table[@class='rbbc-nonebox']/tbody/tr[40]/td[2]");
	private final By netCollateralAvailableTrendValueC_xpath=By.xpath("//table[@class='rbbc-nonebox']/tbody/tr[39]/td[2]");
	
	private final By bbcTrenReportManagement_xpath=By.xpath("(//a[text()='BBC Trend Report'])[2]");
	private final By totalArReceivables_xpath=By.xpath("(//td[contains(text(),'Total A/R')])[1]");
	private final By totalArReceivablesValue_xpath=By.xpath("(//table[@class='rbbc-nonebox'])[1]/tbody/tr[2]/td[2]");
	private final By netARAvailableForAdvanceMgmt_xpath=By.xpath("(//td[contains(text(),'Net A/R Available For Advance')])[1]");
	private final By netARAvailableForAdvanceValueMgmt_xpath=By.xpath("(//table[@class='rbbc-nonebox'])[1]/tbody/tr[13]/td[2]");
	private final By inventoryAvailable_xpath=By.xpath("(//td[contains(text(),'Inventory Available')])[1]");
	private final By inventoryAvailableValue_xpath=By.xpath("(//table[@class='rbbc-nonebox'])[1]/tbody/tr[20]/td[2]");
	private final By NetInventoryAvailableForAdvanceMgmt_xapth=By.xpath("(//td[contains(text(),'Net Inventory Available For Advance')])[1]");
	private final By NetInventoryAvailableForAdvanceValueMgmt_xapth=By.xpath("(//table[@class='rbbc-nonebox'])[1]/tbody/tr[24]/td[2]");
	private final By otherCollateralAvailableMgmt_xpath=By.xpath("(//td[contains(text(),'Other Collateral Available')])[1]");
	private final By otherCollateralAvailableValueMgmt_xpath=By.xpath("(//table[@class='rbbc-nonebox'])[1]/tbody/tr[30]/td[2]");
	private final By netOtherCollateralAvailableForAdvance_xpath=By.xpath("(//td[contains(text(),'Net Other Collateral Available For Advance')])[1]");
	private final By netOtherCollateralAvailableForAdvanceValue_xpath=By.xpath("(//table[@class='rbbc-nonebox'])[1]/tbody/tr[34]/td[2]");
	private final By approvedLinelessReserves_xpath=By.xpath("//td[contains(text(),'Approved Line less Reserves')]");
	private final By approvedLinelessReservesValue_xpath=By.xpath("(//table[@class='rbbc-nonebox'])[1]/tbody/tr[40]/td[2]");
	private final By netCollateralAvailableMgmt_xpath=By.xpath("(//td[contains(text(),'Net Collateral Available')])[1]");
	private final By netCollateralAvailableValueMgmt_xpath=By.xpath("(//table[@class='rbbc-nonebox'])[1]/tbody/tr[43]/td[2]");
	
	private final By aRTotal_xpath=By.xpath("//td[contains(text(),'A/R Total')]");
	private final By aRTotalValue_xpath=By.xpath("(//table[@class='rbbc-nonebox'])[2]/tbody/tr[6]/td[2]");
	private final By apTotal_xpath=By.xpath("//td[contains(text(),'A/P Total')]");
	private final By apTotalValue_xpath=By.xpath("(//table[@class='rbbc-nonebox'])[3]/tbody/tr[6]/td[2]");
	private final By totalAvailableForAdvanceValueCollateral1_xpath=By.xpath("(//table[@class='rbbctable rbbc-nonebox'])[1]/tbody/tr[8]/td[2]");

	
	private final By collateralAnalysisComparativeReport_xpath=By.xpath("//a[text()='Collateral Analysis - Comparative Report']");
	private final By totalArReceivablesValueCollateral_xpath=By.xpath("(//table[@class='rbbctable rbbc-nonebox'])[1]/tbody/tr[1]/td[2]");
	private final By netARAvailableForAdvanceValueCollateral_xpath=By.xpath("(//table[@class='rbbctable rbbc-nonebox'])[1]/tbody/tr[2]/td[2]");
	private final By NetInventoryAvailableForAdvanceValueCollateral_xapth=By.xpath("(//table[@class='rbbctable rbbc-nonebox'])[1]/tbody/tr[4]/td[2]");
	private final By netOtherCollateralAvailableForAdvanceValueCollateral_xpath=By.xpath("(//table[@class='rbbctable rbbc-nonebox'])[1]/tbody/tr[5]/td[2]");
	private final By totalAvailableForAdvanceCollateral_xpath=By.xpath("//td[contains(text(),'Total Available for Advance')]");
	private final By totalAvailableForAdvanceValueCollateral_xpath=By.xpath("(//table[@class='rbbctable rbbc-nonebox'])[1]/tbody/tr[7]/td[2]");
	private final By approvedLineCollateral_xpath=By.xpath("(//td[contains(text(),'Approved Line')])[1]");
	private final By approvedLineCollateralValue_xpath=By.xpath("(//table[@class='rbbctable rbbc-nonebox'])[1]/tbody/tr[8]/td[2]");
	private final By oSLoanBalanceLetterOfCredit_xpath=By.xpath("(//td[contains(text(),'O/S Loan Balance / Letter of Credit')])[1]");
	private final By oSLoanBalanceLetterOfCreditValue_xpath=By.xpath("(//table[@class='rbbctable rbbc-nonebox'])[1]/tbody/tr[9]/td[2]");
	private final By netCollateralAvailableValueCollateral_xpath=By.xpath("(//table[@class='rbbctable rbbc-nonebox'])[1]/tbody/tr[10]/td[2]");
	private final By tradePayables_xpath=By.xpath("//td[contains(text(),'Trade Payables')]");
	private final By tradePayablesValue_xpath=By.xpath("(//table[@class='rbbctable rbbc-nonebox'])[1]/tbody/tr[12]/td[2]");
	private final By totalAvailableBeforeSublimit_xpath=By.xpath("(//td[contains(text(),'Total Available, before Sublimit')])[1]");
	private final By totalAvailableBeforeSublimitValue_xpath=By.xpath("(//table[@class='rbbctable rbbc-nonebox'])[1]/tbody/tr[13]/td[2]");
	
	
	private final By commitmentAmountValueCollateral_xpath=By.xpath("(//table[@class='rbbctable'])[2]/tbody/tr[1]/td");
	private final By receivablesTrendAdvanceCollateral_xpath=By.xpath("(//tr[@class='rbbc-trtotal'])[14]/td[2]");
	private final By receivablesTrendSubLimitCollateral_xpath=By.xpath("(//tr[@class='rbbc-trtotal'])[14]/td[3]");
	private final By inventoryTrendAdvancecollateral_xpath=By.xpath("(//tr[@class='rbbc-trtotal'])[15]/td[2]");
	private final By inventoryTrendSublimitcollateral_xpath=By.xpath("(//tr[@class='rbbc-trtotal'])[15]/td[3]");
	private final By otherCollateralAdvanceCollateral_xpath=By.xpath("(//tr[@class='rbbc-trtotal'])[16]/td[2]");
	private final By otherCollateralSublimitcollateral_xpath=By.xpath("(//tr[@class='rbbc-trtotal'])[16]/td[3]");

	

	private final By BBCReport_xpath=By.xpath("(//li[@class='open_menu'])[9]");
	private final By BBCStatus_xpath=By.xpath("//select[@id='bbc_status']");
	private final By agedpastdue_xpath=By.xpath("//td[contains(text(),'Aged: Past Due Days')]");
	private final By agedpastdue1_xpath=By.xpath("(//td[contains(text(),'Aged: Past Due Days')])[1]");
	//MaintainAr
	private final By futureArApp_xapth=By.xpath("//table[@class='dataTable']/tbody/tr[1]/td[4]");
	private final By currentArApp_xapth=By.xpath("//table[@class='dataTable']/tbody/tr[1]/td[5]");
	private final By over30ArApp_xpath=By.xpath("//table[@class='dataTable']/tbody/tr[1]/td[6]");
	private final By over60ArApp_xpath=By.xpath("//table[@class='dataTable']/tbody/tr[1]/td[7]");
	private final By over90ArApp_xpath=By.xpath("//table[@class='dataTable']/tbody/tr[1]/td[8]");
	private final By over120ArApp_xpath=By.xpath("//table[@class='dataTable']/tbody/tr[1]/td[9]");
	
	
	private final By futureAr_xpath=By.xpath("//table[@class='dataTable']/tbody/tr[1]/td[4]");
	private final By currentAr_xapth=By.xpath("//table[@class='dataTable']/tbody/tr[1]/td[5]");
	private final By over30Ar_xpath=By.xpath("//table[@class='dataTable']/tbody/tr[1]/td[6]");
	private final By over60Ar_xpath=By.xpath("//table[@class='dataTable']/tbody/tr[1]/td[7]");
	private final By over90Ar_xpath=By.xpath("//table[@class='dataTable']/tbody/tr[1]/td[8]");
	private final By over120Ar_xpath=By.xpath("//table[@class='dataTable']/tbody/tr[1]/td[9]");
	private final By totalAr_xpath=By.xpath("//table[@class='dataTable']/tbody/tr[1]/td[11]");
	
	
	private final By aRSummaryDetailAging_xpath=By.xpath("//a[text()='AR Summary / Detail Aging']");
	private final By asOfDate_xpath=By.id("as_of_date");
	
	private final By accountNoDetail_xpath=By.xpath("(//table[@class='dataTable']/tbody/tr[1])[2]/td[1]");
	private final By accountNameDetail_xpath=By.xpath("(//table[@class='dataTable']/tbody/tr[1])[2]/td[2]");
	private final By documentNoDetail_xpath=By.xpath("(//table[@class='dataTable']/tbody/tr[1])[2]/td[4]");
	private final By invoiceDate_xpath=By.xpath("(//table[@class='dataTable']/tbody/tr[1])[2]/td[5]");
	private final By futureDetail_xpath=By.xpath("(//table[@class='dataTable']/tbody/tr[1])[2]/td[6]");
	private final By currentDetail_xpath=By.xpath("(//table[@class='dataTable']/tbody/tr[1])[2]/td[7]");
	private final By over30Detail_xpath=By.xpath("(//table[@class='dataTable']/tbody/tr[1])[2]/td[8]");
	private final By over60Detail_xpath=By.xpath("(//table[@class='dataTable']/tbody/tr[1])[2]/td[9]");
	private final By over90Detail_xpath=By.xpath("(//table[@class='dataTable']/tbody/tr[1])[2]/td[10]");
	private final By over120Detail_xpath=By.xpath("(//table[@class='dataTable']/tbody/tr[1])[2]/td[11]");
	private final By totalDetail_xpath=By.xpath("(//table[@class='dataTable']/tbody/tr[1])[2]/td[13]");
	
	private final By futureDetailSumm_xpath=By.xpath("(//table[@class='dataTable']/tbody/tr[1])[2]/td[4]");
	private final By currentDetailSumm_xpath=By.xpath("(//table[@class='dataTable']/tbody/tr[1])[2]/td[5]");
	private final By over30DetailSumm_xpath=By.xpath("(//table[@class='dataTable']/tbody/tr[1])[2]/td[6]");
	private final By over60DetailSumm_xpath=By.xpath("(//table[@class='dataTable']/tbody/tr[1])[2]/td[7]");
	private final By over90DetailSumm_xpath=By.xpath("(//table[@class='dataTable']/tbody/tr[1])[2]/td[8]");
	private final By over120DetailSumm_xpath=By.xpath("(//table[@class='dataTable']/tbody/tr[1])[2]/td[9]");
	private final By totalDetailSumm_xpath=By.xpath("(//table[@class='dataTable']/tbody/tr[1])[2]/td[11]");
	
	private final By styledisplay_xpath=By.xpath("//label[text()='Style']");

	
	private final By netOtherAvailableForAdvanceBbcValuee_xpath=By.xpath("//table[@class='dataTable']/tbody/tr[56]/td[8]");
	private final By totalAvailableForAdvanceBbcValuee_xpath=By.xpath("//table[@class='dataTable']/tbody/tr[61]/td[8]");
	private final By lineLimitWithReservesValuee_xpath=By.xpath("//table[@class='dataTable']/tbody/tr[64]/td[8]");
	

	private final By totalAAr_xpath=By.xpath("//table[@class='dataTable']/tbody/tr[1]/td[10]");
	
	private final By transactionByDateRange_xpath=By.xpath("//a[text()='Transaction By Date Range']");
	
	private final By accNo=By.xpath("//table[@class='dataTable']/tbody/tr[1]/td[1]");
	private final By accName_xpath=By.xpath("//table[@class='dataTable']/tbody/tr[1]/td[2]");
	private final By invoiceNo_xpath=By.xpath("//table[@class='dataTable']/tbody/tr[1]/td[3]");
	private final By orgDate_xapth=By.xpath("//table[@class='dataTable']/tbody/tr[1]/td[4]");
	private final By currentAmt_xpath=By.xpath("//table[@class='dataTable']/tbody/tr[1]/td[5]");
	private final By invStatus_xpath=By.xpath("//table[@class='dataTable']/tbody/tr[1]/td[7]");
	private final By parameterNAme_xpath=By.xpath("//table[@class='dataTable']/tbody/tr[1]/td[8]");
	
	//
	private final By totalAgedReceivablesValueT_xpath=By.xpath("//table[@class='dataTable']/tbody/tr[20]/td[8]");
	private final By netARAvailableForAdvanceBbcValueT_xpath=By.xpath("//table[@class='dataTable']/tbody/tr[32]/td[8]");
	private final By netInventoryAvailableForAdvanceBbcValueT_xpath=By.xpath("//table[@class='dataTable']/tbody/tr[42]/td[8]");
	private final By totalAvailableARInventoryBbcValueT_xpath=By.xpath("//table[@class='dataTable']/tbody/tr[44]/td[8]");
	private final By netOtherAvailableForAdvanceBbcValueT_xpath=By.xpath("//table[@class='dataTable']/tbody/tr[56]/td[8]");
	private final By totalAvailableForAdvanceBbcValueT_xpath=By.xpath("//table[@class='dataTable']/tbody/tr[61]/td[8]");
	private final By lineLimitWithReservesValueT_xpath=By.xpath("//table[@class='dataTable']/tbody/tr[65]/td[8]");
	private final By borrowingBaseAvailabilityValueT_xpath=By.xpath("//table[@class='dataTable']/tbody/tr[74]/td[8]");
	private final By netBorrowingBaseAvailableValueT_xpath=By.xpath("//table[@class='dataTable']/tbody/tr[77]/td[8]");


		private final By eligibleAR_xpath=By.xpath("//td[contains(text(),'Eligible AR')]");
		private final By displayreport_xpath=By.id("display_report");
		private final By Invcollateral_xpath=By.xpath("//strong[text()='Inv. Collateral']");
		//private final By ineligibleamnt_xpath=By.xpath("(//td[text()='6,250.00'])[7]");
		private final By ineligibleamnt2_xpath=By.xpath("(//td[text()='6,250.00'])[7]");
		private final By ineligibletrendreport_xpath=By.xpath("(//li[@class='open_menu'])[27]");
		private final By BBCManReport_xpath=By.xpath("(//li[@class='open_menu'])[28]");
		private final By value_xpath=By.xpath("(//td[text()='0.00'])[2]");
		private final By value1_xpath=By.xpath("//td[text()='0.00']");
		private final By reason3_xpath=By.xpath("//td[text()=' Overall Total ']");
		private final By Generatebtn_xpath=By.xpath("//button[text()='Generate']");
		private final By ineligibleGrandTotal_xpath=By.xpath("//strong[contains(text(),'Total AR Concentration')]");
		private final By display_xpath=By.xpath("//select[@id='display_report']");
		private final By reason_xpath=By.xpath("//td[contains(text(),'Ineligible Customer')]");
		private final By amnt_xpath=By.xpath("(//td[contains(text(),' 6,250.00')])[4]");
		private final By reason1_xpath=By.xpath("(//td[text()='Ineligible Customer'])[2]");
		private final By amnt2_xpath=By.xpath("(//strong[text()='6,250'])[1]");
		private final By ineliamnt_xpath=By.xpath("(//td[text()=' 0.00'])[29]");
		private final By ineliamnt1_xpath=By.xpath("(//td[text()='0.00'])[27]");
		private final By total2_xpath=By.xpath("//td[text()='0.00']");
		private final By inelamnt_xpath=By.xpath("(//td[text()=' 0.00'])[32]");
		//private final By inelireason_xpath=By.xpath("//td[text()=' Overall Total ']");
		private final By total3_xpath=By.xpath("//td[text()='Total']");
		private final By reason4_xpath=By.xpath("//td[text()='TOTALS']");
		private final By inelamnt1_xpath=By.xpath("(//td[text()='0.00'])[105]");
		


	
	private final By aRLoanActivity_xpath=By.xpath("//a[text()='AR Loan Activity']");
	private final By arLoanStartDate_xpath=By.id("ar_loan_start_date");
	private final By arLoanEndDate_xpath=By.id("ar_loan_end_date");
	
	
	private final By dateArLoan_xpath=By.xpath("//table[@class='dataTable']/tbody/tr[2]/td[1]");
	private final By salesArLoan_xpath=By.xpath("//table[@class='dataTable']/tbody/tr[2]/td[2]");
	private final By creditsArLoan_xpath=By.xpath("//table[@class='dataTable']/tbody/tr[2]/td[3]");
	private final By unreconciled_xpath=By.xpath("//table[@class='dataTable']/tbody/tr[2]/td[4]");
	private final By collections_xpath=By.xpath("//table[@class='dataTable']/tbody/tr[2]/td[5]");
	private final By adjustments_xpath=By.xpath("//table[@class='dataTable']/tbody/tr[2]/td[6]");
	private final By arBalance_xpath=By.xpath("//table[@class='dataTable']/tbody/tr[2]/td[7]");
	private final By BalanceAr_xpath=By.xpath("//table[@class='dataTable']/tbody/tr[2]/td[12]");
	
		
	//
	private final By OpenInvoiceByDateRange_xpath=By.xpath("//a[text()='Open invoice By Date Range']");
	private final By custtomerAccount_xpath=By.xpath("//table[@class='dataTable']/tbody/tr[1]/td[1]");
	private final By accNumberOpen_xpath=By.xpath("//table[@class='dataTable']/tbody/tr[1]/td[2]");
	private final By invoiceNumberOpen_xpath=By.xpath("//table[@class='dataTable']/tbody/tr[1]/td[4]");
	private final By originalDateOpen_xpath=By.xpath("//table[@class='dataTable']/tbody/tr[1]/td[5]");
	private final By dueDateOpen_xpath=By.xpath("//table[@class='dataTable']/tbody/tr[1]/td[6]");
	private final By originalAmountOpen_xpath=By.xpath("//table[@class='dataTable']/tbody/tr[1]/td[7]");
	private final By balanceAmountOpen_xpath=By.xpath("//table[@class='dataTable']/tbody/tr[1]/td[8]");

	//
	
	private final By endingARBalanceRollForwardValueAr_xpath=By.xpath("//table[@class='rbbc-nonebox']/tbody/tr[4]/td[2]");
	private final By endingARBalanceArAgingValueAr_xpath=By.xpath("//table[@class='rbbc-nonebox']/tbody/tr[13]/td[2]");
	private final By endingAPBalanceValueAr_xpath=By.xpath("//table[@class='rbbc-nonebox']/tbody/tr[16]/td[2]");
	private final By NetARAvailableForAdvanceValueAr_xpath=By.xpath("//table[@class='rbbc-nonebox']/tbody/tr[23]/td[2]");
	private final By NetInventoryAvailableForAdvanceValueAr_xapth=By.xpath("//table[@class='rbbc-nonebox']/tbody/tr[30]/td[2]");
	private final By NetOtherCollateralAvailableForAdvanceValueAr_xpath=By.xpath("//table[@class='rbbc-nonebox']/tbody/tr[34]/td[2]");
	private final By totalBorrowingBaseValueAr_xpath=By.xpath("//table[@class='rbbc-nonebox']/tbody/tr[36]/td[2]");
	private final By netCollateralAvailableTrendValueAr_xpath=By.xpath("//table[@class='rbbc-nonebox']/tbody/tr[37]/td[2]");
	private final By netCollateralAvailableValueMgmtM_xpath=By.xpath("(//table[@class='rbbc-nonebox'])[1]/tbody/tr[40]/td[2]");
	private final By netCollateralAvailableValueMgmtM1_xpath=By.xpath("(//table[@class='rbbc-nonebox'])[1]/tbody/tr[41]/td[2]");

	
	private final By aRTotalValueM_xpath=By.xpath("(//table[@class='rbbc-nonebox'])[2]/tbody/tr[7]/td[2]");
	private final By apTotalValueM_xpath=By.xpath("(//table[@class='rbbc-nonebox'])[3]/tbody/tr[2]/td[2]");
	private final By oSLoanBalanceLetterOfCreditValueM1_xpath=By.xpath("(//table[@class='rbbctable rbbc-nonebox'])[1]/tbody/tr[9]/td[2]");
	private final By netCollateralAvailableValueCollateralM1_xpath=By.xpath("(//table[@class='rbbctable rbbc-nonebox'])[1]/tbody/tr[10]/td[2]");
	private final By tradePayablesValueM1_xpath=By.xpath("(//table[@class='rbbctable rbbc-nonebox'])[1]/tbody/tr[12]/td[2]");

	
	private final By oSLoanBalanceLetterOfCreditValueM_xpath=By.xpath("(//table[@class='rbbctable rbbc-nonebox'])[1]/tbody/tr[8]/td[2]");
	private final By netCollateralAvailableValueCollateralM_xpath=By.xpath("(//table[@class='rbbctable rbbc-nonebox'])[1]/tbody/tr[9]/td[2]");
	private final By tradePayablesValueM_xpath=By.xpath("(//table[@class='rbbctable rbbc-nonebox'])[1]/tbody/tr[11]/td[2]");
	private final By totalAvailableBeforeSublimitValueM_xpath=By.xpath("(//table[@class='rbbctable rbbc-nonebox'])[1]/tbody/tr[13]/td[2]");
	

	//anusha(mul div)
		private final By Over120ForMulDiv_xpath=By.xpath("(//td[@class='numRightAlign'])[7]");
		private final By endingBalanceTotalARValueForMulDiv_xpath=By.xpath("//table[@class='dataTable']/tbody/tr[09]//td[2]");
		private final By totalAgedReceivablesValueForMulDiv_xpath=By.xpath("//tbody//tr[19]//td[8]");
		private final By netInventoryAvailableForAdvanceBbcValueForMulDiv_xpath=By.xpath("//td[contains(text(),'6,775,417.45')]");
		private final By totalAvailableARInventoryBbcValueForMulDiv_xpath=By.xpath("//td[contains(text(),'6,769,022.95')]");
		private final By netOtherAvailableForAdvanceBbcValueeForMulDiv_xpath=By.xpath("//td[contains(text(),'29,500.00')]");
		private final By totalAvailableForAdvanceBbcValueeForMulDiv_xpath=By.xpath("//tbody//tr[101]//td[8]");
		private final By lineLimitWithReservesValueeForMulDiv_xpath=By.xpath("//tbody//tr[105]//td[8]");
		private final By borrowingBaseAvailabilityValueForMul_xpath=By.xpath("//tbody//tr[113]//td[8]");

		private final By BbcExecutiveTrendReport_xpath=By.xpath("//a[contains(text(),'BBC Executive Trend Report')]");
	    private final By SelectBBCDate_xpath=By.xpath("//select[@name='bbc_id']");
	    
	    private final By receivables2Trend_xpath=By.xpath("//th[contains(text(),'Receivables2 ')]");
		private final By receivables2TrendAdvance_xpath=By.xpath("(//td[contains(text(),'100.00')])[1]");
		private final By receivables2TrendSubLimit_xpath=By.xpath("(//td[contains(text(),'0.00')])[5]");
		
		private final By receivables1DIV1Trend_xpath=By.xpath("//th[contains(text(),'Receivables1DIV1')]");
		private final By receivables1DIV1TrendAdvance_xpath=By.xpath("(//td[contains(text(),'90.00')])[1]");
		private final By receivables1Div1TrendSubLimit_xpath=By.xpath("(//td[contains(text(),'0.00')])[7]");
		
		private final By receivables2DIV2Trend_xpath=By.xpath("//th[contains(text(),'Receivables2DIV2')]");
		private final By receivables2DIV2TrendAdvance_xpath=By.xpath("//tbody//tr[6]//td[2]");
		private final By receivables2Div2TrendSubLimit_xpath=By.xpath("//tbody//tr[6]//td[3]");
		
		private final By inventory1Trend_xpath=By.xpath("//tbody//tr[7]//th[1]");
		private final By inventory1TrendAdvance_xpath=By.xpath("//div[@class='tw-chatbox']//tbody//tr[7]//td[2]");
		private final By inventory1TrendSublimit_xpath=By.xpath("//div[@class='tw-chatbox']//tbody//tr[7]//td[3]");
			
		




	
	
	//author garima
	
	private final By Header_xpath=By.xpath(" //span[contains(text(),'COLLATERAL ANALYSIS - COMPARATIVE REPORT')]  ");


			
		private final By inventory2Trend_xpath=By.xpath("//tbody//tr[8]//th[1]");
		private final By inventory2TrendAdvance_xpath=By.xpath("//div[@class='tw-chatbox']//tbody//tr[8]//td[2]");
		private final By inventory2TrendSublimit_xpath=By.xpath("//div[@class='tw-chatbox']//tbody//tr[8]//td[3]");
		
		
		private final By inventory1DIV1Trend_xpath=By.xpath("//th[contains(text(),'Inventory1DIV1')]");
		private final By inventory1DIV1TrendAdvance_xpath=By.xpath("//div[@class='tw-chatbox']//tbody//tr[9]//td[2]");
		private final By inventory1DIV1TrendSublimit_xpath=By.xpath("//div[@class='tw-chatbox']//tbody//tr[9]//td[3]");
		
		private final By inventory2DIV2Trend_xpath=By.xpath("//th[contains(text(),'Inventory2DIV2')]");
		private final By inventory2DIV2TrendAdvance_xpath=By.xpath("//div[@class='tw-chatbox']//tbody//tr[10]//td[2]");
		private final By inventory2DIV2TrendSublimit_xpath=By.xpath("//div[@class='tw-chatbox']//tbody//tr[10]//td[3]");
		
		private final By otherCollateral1Trend_xpath=By.xpath("//tbody//tr[11]//th[1]");
		private final By otherCollateral1Advance_xpath=By.xpath("//div[@class='tw-chatbox']//tbody//tr[11]//td[2]");
		private final By otherCollateral1Sublimit_xpath=By.xpath("//div[@class='tw-chatbox']//tbody//tr[11]//td[3]");
		
		private final By otherCollateral2Trend_xpath=By.xpath("//tbody//tr[12]//th[1]");
		private final By otherCollateral2Advance_xpath=By.xpath("//div[@class='tw-chatbox']//tbody//tr[12]//td[2]");
		private final By otherCollateral2Sublimit_xpath=By.xpath("//div[@class='tw-chatbox']//tbody//tr[12]//td[3]");
		
		private final By otherCollateral1DIV1Trend_xpath=By.xpath("//th[contains(text(),'Other Collateral1DIV1')]");
		private final By otherCollateral1DIV1Advance_xpath=By.xpath("//div[@class='tw-chatbox']//tbody//tr[13]//td[2]");
		private final By otherCollateralDIV1Sublimit_xpath=By.xpath("//div[@class='tw-chatbox']//tbody//tr[13]//td[3]");
		
		private final By otherCollateral2DIV2Trend_xpath=By.xpath("//th[contains(text(),'Other Collateral2DIV2')]");
		private final By otherCollateral2DIV2Advance_xpath=By.xpath("//tbody//tr[14]//td[2]");
		private final By otherCollateral2DIV2Sublimit_xpath=By.xpath("//tbody//tr[14]//td[3]");
		
		private final By endingARBalanceRollForwardValueForMulDiv_xpath=By.xpath("//table[@class='rbbc-nonebox']//tbody//tr[4]//td[3]");
	    private final By endingAPBalanceForMulDiv_xpath=By.xpath("//tbody//tr[19]//td[3]");
		private final By NetArAvailableForMulDiv_xpath=By.xpath("//tbody//tr[26]//td[3]");
		private final By NetInventoryAvailableaforAdvanceForMulDiv_xpath=By.xpath("//tbody//tr[33]//td[3]");
		private final By TotalBorrowingBaseForMulDiv_xpath=By.xpath("//tbody//tr[40]//td[3]");
		private final By ApprovedLineForMulDiv_xpath=By.xpath("//tbody//tr[41]//td[3]");
		private final By NetCollateralAvailableForMulDiv_xpath=By.xpath("//tbody//tr[42]//td[3]");
		private final By TotalARForMulDiv_xpath=By.xpath("//body[@class='view-page']/table[@class='rbbctable rbbc-nonebox']/tbody/tr[1]/td[3]");
		private final By NetARAvailableForAdvanceForMulDiv_xpath=By.xpath("//td[contains(text(),'(6)')]");
		private final By TotalInventoryForMulDiv_xpath=By.xpath("//table[@class='rbbctable rbbc-nonebox']//tbody//tr[3]//td[2]");
		private final By NetInventoryAvailableForAdvanceForMulDiv_xpath=By.xpath("//td[contains(text(),'6,775')]");
		private final By NetOtherCollateralAvailableForAdvanceForMulDiv_xpath=By.xpath("//table[@class='rbbctable rbbc-nonebox']//tbody//tr[5]//td[2]");
		
		private final By Total_xpath=By.xpath("//tr//td[1]//table[1]");
	    private final By Total2_xpath=By.xpath("//td[@class='td-width-500']//tbody");
	    private final By Total3_xpath=By.xpath("//tr//td[3]//table[1]");

//Author-Lavanya 	  //retention reason
	    private final By retentionreason_xpath=By.xpath("(//td[contains(text(),'Retention')])[2]");
	    private final By retention3_xpath=By.xpath("(//td[text()='Retention'])[2]");
	    private final By retentionamnt_xpath=By.xpath("(//td[contains(text(),' 1,500.00')])[5]");
	    private final By ClickonGroupbyDropdown_Xpath=By.xpath("//select[@id='ineligible_style']"); 
	    private final By retentionamnt4_xpath=By.xpath("(//strong[text()='1,500'])[1]");
	    private final By retention2_xpath=By.xpath("//td[text()='Retention']");
	    private final By retenamnt_xpath=By.xpath("(//td[text()=' 1,500.00'])[2]");
	    private final By retenamnt1_xpath=By.xpath("(//td[text()=' 22,000.00'])[2]");
	    private final By retentionamnt3_xpath=By.xpath("(//td[text()='1,500.00'])[4]");
	    private final By retenamnt2_xpath=By.xpath("(//td[text()=' 50.00'])[2]");
	    private final By retentionamnt14_xpath=By.xpath("(//td[text()='50.00'])[6]");
	    private final By retentionamnt7_xpath=By.xpath("(//td[text()='22,000.00'])[6]");
	    private final By retentionamnt5_xpath=By.xpath("(//td[text()='22,000.00'])[6]");
	    private final By retentionamnt11_xpath=By.xpath("(//td[text()='50.00'])[6]");
	
	    
	    private final By retentionamnt15_xpath=By.xpath("(//strong[text()='50'])[1]");
	    private final By retentionamnt9_xpath=By.xpath("(//strong[text()='22,000'])[1]");
	    private final By retentionamnt8_xpath=By.xpath("(//strong[text()='22,000'])[1]");
	    private final By retentionamnt6_xpath=By.xpath("(//strong[text()='22,000'])[1]");
	    private final By retentionamnt12_xpath=By.xpath("(//strong[text()='50'])[1]");
	    
	    private final  By retentionreason1_xpath=By.xpath("(//td[text()=' 1,500.00'])[2]");
	    private final  By retentionreason2_xpath=By.xpath("(//td[text()=' 22,000.00'])[2]");
	    private final By bbcdate_xpath=By.xpath("//select[@id='bbc_id']");
	    private final By retention4_xpath=By.xpath("//td[text()='Retention']");
	    private final By retention5_xpath=By.xpath("(//td[text()='Retention'])[2]");
	    private final  By retentionreason3_xpath=By.xpath("(//td[text()=' 50.00'])[2]");
	    private final  By retentionreason4_xpath=By.xpath("(//td[text()=' 0.00'])[11]");
	    private final  By retentionreason5_xpath=By.xpath("//td[text()=' Overall Total ']");
	    private final By retentionamnt16_xpath=By.xpath("//td[text()='0.00']");
	    private final By retentionreason6_xpath=By.xpath("//td[text()='Total']");
	    private final By retentionamnt17_xpath=By.xpath("(//td[text()='0.00'])[1]");
	    private final By retentiontotal_xpath=By.xpath("//td[text()='TOTALS']");
	    private final By retentionamnt18_xpath=By.xpath("(//td[text()='0.00'])[98]");
	    private final By retentionamnt19_xpath=By.xpath("(//td[text()=' 0.00'])[17]");
	    private final By retentiontotal1_xpath=By.xpath("(//strong[text()='Ineligible Grand Total'])[4]");
	    private final By retentiontotal2_xpath=By.xpath("(//strong[text()='Ineligible Grand Total'])[5]");
	    private final By retentionamnt20_xpath=By.xpath("(//strong[text()='0'])[1]");
	    private final By retentionamnt23_xpath=By.xpath("(//strong[text()='0'])[4]");
	    
	    private final By retentionamnt21_xpath=By.xpath("(//td[text()=' 0.00'])[15]");
	    private final By retentionamnt22_xpath=By.xpath("(//td[text()=' 0.00'])[19]");
	    private final By retentionamnt2_xpath=By.xpath("(//td[text()=' 22,000.00'])[7]");
	    private final By retentionamnt1_xpath=By.xpath("(//td[contains(text(),' 22,000.00')])[7]");
	 
	    private final By retentionamnt13_xpath=By.xpath("(//td[text()=' 50.00'])[9]");
	    private final By retentionamnt10_xpath=By.xpath("(//td[text()=' 50.00'])[9]");
	    private final By asofdateFormuldiv_xpath=By.xpath("//select[@name='bbc_id']");
	    

	    private final By AgedCreditItem_xpath=By.xpath("(//td[contains(text(),'300.00')])[3]");
	    private final By CrossAgedPercentage_xpath=By.xpath("(//td[contains(text(),'75,800.00')])[1]");
	    private final By ConcentrationPercentage_xpath=By.xpath("(//td[contains(text(),'67,540.00')])[1]");
	    private final By PastDueDays_xpath=By.xpath("(//td[contains(text(),'71,950.00')])[1]");
	    private final By IneligibleCustomer_xpath=By.xpath("(//td[contains(text(),'9,000.00')])[1]");
	    private final By ConcentrationPercentageAgedCreditLimitExclude_xpath=By.xpath("(//td[contains(text(),'84,500.00')])[1]");
	    private final By ConcentrationPercentageIneligibleCustomer_xpath=By.xpath("(//td[contains(text(),'68,470.00')])[1]");
	    private final By ConcentrationPercentageCrossAgedPercentageExclude_xpath=By.xpath("(//td[contains(text(),'76,050.00')])[1]");
	    private final By ConcentrationPercentageTotalReceivablesCap_xpath=By.xpath("(//td[contains(text(),'60,345.00')])[1]");


	    private final By AgedCreditItemBBCMang_xpath=By.xpath("(//td[contains(text(),'300')])[3]");
	    private final By CrossAgedPercentageBBCMang_xpath=By.xpath("(//td[contains(text(),'75,800')])[1]");
	    private final By ConcentrationPercentageBBCMang_xpath=By.xpath("(//td[contains(text(),'67,540')])[1]");
	    private final By PastDueDaysBBCMang_xpath=By.xpath("(//td[contains(text(),'71,950')])[1]");
	    private final By IneligibleCustomerBBCMang_xpath=By.xpath("(//td[contains(text(),'9,000')])[3]");
	    private final By ConcentrationPercentageAgedCreditLimit_xpath=By.xpath("(//td[contains(text(),'67,570')])[1]");
	    private final By ConcentrationPercentageAgedCreditLimitExclude_bbc_xpath=By.xpath("(//td[contains(text(),'84,500')])[1]");
	    private final By ConcentrationPercentageIneligibleCustomerBBCMang_xpath=By.xpath("(//td[contains(text(),'68,470')])[1]");
	    private final By ConcentrationPercentageCrossAgedPercentageExcludeBBC_xpath=By.xpath("(//td[contains(text(),'76,050')])[1]");
	    private final By ConcentrationPercentageTotalReceivablesBBCCap_xpath=By.xpath("(//td[contains(text(),'60,345')])[1]");
	    private final By ConcentrationPercentageAgedcreditLimitEligibleBalance_xpath=By.xpath("(//td[contains(text(),'67,540.00')])[1]");
	    private final By ConcentrationPercentageAgedcreditLimitEligibleBalanceBBC_xpath=By.xpath("(//td[contains(text(),'67,540')])[1]");

	    private final By totalAvailableBeforeSublimitValueC_xpath=By.xpath("(//table[@class='rbbctable rbbc-nonebox'])[1]/tbody/tr[12]/td[2]");

	    private final By totalAvailableBeforeSublimitValueC1_xpath=By.xpath("(//table[@class='rbbctable rbbc-nonebox'])[1]/tbody/tr[13]/td[2]");

	//
	    private final By totalIneligible_xpath=By.xpath("//table[@class='dataTable']/tbody/tr[1]/td[3]");
	    private final By noRecords_xpath=By.xpath("//td[contains(text(),'No Records Found')]");
	    private final By oSLoanBalanceLetterOfCreditValueSkipped_xpath=By.xpath("(//table[@class='dataTable'])/tbody/tr[65]/td[2]");
	    private final By oSLoanBalanceLetterOfCreditValueMC_xpath=By.xpath("(//table[@class='rbbc-nonebox'])/tbody/tr[39]/td[3]");
	    private final By borrowingBaseAvailabilityValueS_xpath=By.xpath("//table[@class='dataTable']/tbody/tr[48]/td[3]");
	    private final By osBalanceMgmtM_xpath=By.xpath("(//table[@class='rbbc-nonebox'])[1]/tbody/tr[40]/td[2]");
	    private final By oSLoanBalanceLetterOfCreditValueSkippedM_xpath=By.xpath("(//table[@class='rbbctable rbbc-nonebox'])[1]/tbody/tr[9]/td[2]");
	 
	    //Lavanya
	    private final By excludedreason_xpath=By.xpath("(//td[contains(text(),'Excluded')])[1]");
        private final By excludedamnt_xpath=By.xpath("(//td[contains(text(),' 3,000.00')])[1]");
        private final By excludedamnt3_xpath=By.xpath("(//td[contains(text(),' 3,500.00')])[1]");
        private final By excludedamnt4_xpath=By.xpath("(//td[contains(text(),' 2,500.00')])[1]");
        private final By excludeamnt1_xpath=By.xpath("(//td[text()='3,000.00'])[3]");
        private final By excludeamnt2_xpath=By.xpath("(//td[text()='3,000'])[1]");
        private final By agdpastdue2_xpath=By.xpath("(//td[text()='66,000'])[1]");
        private final By excludeamnt4_xpath=By.xpath("(//td[text()='3,500'])[1]");
        private final By excludeamnt5_xpath=By.xpath("(//td[contains(text(),' 3,500.00')])[3]"); 
        private final By agedpstamnt1_xpath=By.xpath("(//td[contains(text(),' 66,000.00')])[1]");
        private final By agedpstamnt2_xpath=By.xpath("(//td[contains(text(),' 66,000.00')])[1]");
       /// private final By agedpastdue_xpath=By.xpath("//td[contains(text(),'Aged: Past Due Days')]");
        private final By excludeamnt14_xpath=By.xpath("(//td[text()='3,000.00'])[2]");
        private final By excludeamnt3_xpath=By.xpath("(//td[text()='3,500.00'])[1]");
        private final By excludeamnt6_xpath=By.xpath("(//td[text()='2,500.00'])[1]");
        private final By excludeamnt9_xpath=By.xpath("(//td[text()=' 15,900.00'])[1]");
        private final By excludeamnt11_xpath=By.xpath("(//td[text()=' 16,500.00'])[1]");
       
        private final By excludeamnt7_xpath=By.xpath("(//td[text()='2,500'])[1]");
        private final By excludedamnt8_xpath=By.xpath("(//td[contains(text(),' 15,900.00')])[1]");
        private final By excludedamnt9_xpath=By.xpath("(//td[contains(text(),' 16,500.00')])[1]");
        private final By excludeamnt8_xpath=By.xpath("(//td[text()='15,900'])[1]");
        private final By excludeamnt12_xpath=By.xpath("(//td[text()='16,500'])[1]");
       
        private final By excludeamnt10_xpath=By.xpath("(//td[text()=' 15,900.00'])[3]");
        private final By excludeamnt13_xpath=By.xpath("(//td[text()=' 16,500.00'])[3]");
        
        private final By value4_xpath=By.xpath("//div[20]//tr[4]//td[3]");
   
        private final By inelig_amnt_xpath=By.xpath("//div[20]//tr[4]//td[3]");
        

	    private final By excludeamnt17_xpath=By.xpath("(//td[text()=' 5,000.00'])[3]");
	    private final By excludedamnt14_xpath=By.xpath("(//td[contains(text(),' 5,000.00')])[1]");
	    private final By excludeamnt15_xpath=By.xpath("(//td[text()=' 5,000.00'])[1]");
	    private final By excludeamnt16_xpath=By.xpath("(//td[text()='5,000'])[1]");
	    private final By excludedamnt17_xpath=By.xpath("(//td[contains(text(),' (6,600.00)')])[1]");
	    private final By excludeamnt18_xpath=By.xpath("(//td[text()=' (6,600.00)'])[1]");
	    private final By excludeamnt19_xpath=By.xpath("(//td[text()='(6,600)'])[1]");
	    
	    
	    //cyncs_4462

	    
	    	    private final By agedpastdueamnt_xpath=By.xpath("(//td[text()=' 126,750.00'])[3]");
	    	    private final By agedpastdueamnt1_xpath=By.xpath("(//td[contains(text(),'126,750')])[5]");
	    	    private final By agedpastdueamnt2_xpath=By.xpath("(//td[text()=' 126,750.00'])[1]");
	    	    private final By concentration_xpath=By.xpath("//td[contains(text(),'Concentration %')]");
	    	    private final By concentrationamnt_xpath=By.xpath("(//td[text()=' 200.00'])[1]");
	    	    private final By inelig_toal_xpath=By.xpath(" //td[contains(text(),'INELIGIBLES')]");
	    	    private final By totalamnt_xpath=By.xpath("(//td[text()=' 126,950.00'])[1]");
	    	    private final By agedpastdueamnt3_xpath=By.xpath("(//td[contains(text(),'126,750')])[1]");
	    	    private final By concentrationamnt1_xpath=By.xpath("(//td[contains(text(),'200')])[1]");
	            private final By inelig_total_xapth=By.xpath("//strong[contains(text(),'Ineligible Total')]");
	            private final By ineligtotalamnt_xpath=By.xpath("(//strong[contains(text(),'126,950')])[1]");
	            private final By agedpastdueamnt4_xpath=By.xpath("(//td[text()=' 0.00'])[13]");
	            private final By concentrationamnt2_xpath=By.xpath("(//td[text()=' 8,000.00'])[3]");
	            private final By agedpastdueamnt5_xpath=By.xpath("//div[32]//tbody[1]//td[2]");
	            
	            private final By totalelig_xpath=By.xpath("//td[contains(text(),'INELIGIBLES')]");
	            private final By totalamnt1_xpath=By.xpath("(//td[text()=' 8,000.00'])[1]");
	            private final By concentrationamnt3_xpath=By.xpath("(//td[text()='8,000'])[1]");
	            
	            private final By totaleligM_xpath=By.xpath("//strong[contains(text(),'Ineligible Total')]");
	            private final By totalamnt2_xpath=By.xpath("(//strong[text()='8,000'])[1]");
	            
	            private final By agedpastdueamnt6_xpath=By.xpath("(//td[text()=' 0.00'])[13]");
	            private final By undefined_xpath=By.xpath("//td[contains(text(),'Undefined')]");
	            private final By ineligible_invamnt_xpath=By.xpath("(//td[text()=' 1,418.00'])[3]");
	           private final By ineligible_xpath=By.xpath("(//th[text()='Ineligible'])[2]");
	           private final By ineligibleamnt_xpath=By.xpath("(//td[text()='1,418.00'])[1]");
	           private final By ineliginvamnt_xpath=By.xpath("(//td[text()=' 1,418.00'])[1]");
	            private final By crsossaged_xpath=By.xpath("//td[contains(text(),'Cross Aged %')]");
	            private final By crossagedamnt_xpath=By.xpath("(//td[text()=' 300.00'])[1]");
	        private final By totalineligible_xpath=By.xpath("//td[contains(text(),'Ineligible')]");
	         private final By totalamntin_xpath=By.xpath("(//td[text()=' 1,718.00'])[1]");    
	          private final By totalinelig_xpath=By.xpath("(//td[text()='1,718.00'])[1]");

	            
		private final By endingBalanceTotalARValueForSummaryMulDiv_xpath=By.xpath("//tr[11]//td[8]");
		private final By totalAgedReceivablesValueForSummaryMulDiv_xpath=By.xpath("//tr[20]//td[8]");
		private final By netInventoryAvailableForAdvanceBbcValueForSummaryMulDiv_xpath=By.xpath("//td[contains(text(),'137,110.00')]");
		private final By totalAvailableARInventoryBbcValueForSummaryMulDiv_xpath=By.xpath("//td[contains(text(),'6,287,111.55')]");
		private final By netOtherAvailableForAdvanceBbcValueeForSummaryMulDiv_xpath=By.xpath("//td[contains(text(),'29,500.00')]");
		private final By totalAvailableForAdvanceBbcValueeForSummaryMulDiv_xpath=By.xpath("//td[contains(text(),'6,310,661.55')]");
		private final By lineLimitWithReservesValueeForSummaryMulDiv_xpath=By.xpath("//tr[106]//td[8]");
		private final By borrowingBaseAvailabilityValueForSummaryMul_xpath=By.xpath("//tr[115]//td[8]");
//kruthivas
		private final By ORIENTATIONStatus_xpath=By.xpath("//select[@id='bbc_print_orientation']");
		private final By HTML_xpath=By.xpath("//button[text()='HTML']");
		private final By BASE_AVAILABILITY_xpath=By.xpath("//td[contains(text(),' BORROWING BASE AVAILABILITY')]");
		private final By BASEAVAILABILITY_Value1_xpath=By.xpath("//table[@class='dataTable']//tr[47]//td[3]");

         
		//rohit
		private final By endingBalanceTotalAR1_xpath=By.xpath("//td[contains(text(),'Ending Balance Total AR')]");
		private final By endingBalanceTotalARValueForMulDiv1_xpath=By.xpath("//table[@class='dataTable']/tbody/tr[11]//td[8]");
//table[@class='dataTable']/tbody/tr[11]//td[8]
		
		//
				 public boolean  verifyCollateralNameOtherCollateral(String collateraladvance,String collateralsublimit){
				    	try {
				    		WebElement elementWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(otherCollateralTrend_xpath));
				    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(otherCollateralAdvance_xpath));
				    		WebElement sublimitWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(otherCollateralSublimit_xpath));	    		
				    		elementWebElement.isDisplayed();
				    		
				    		String advanceA = AmountWebElement.getText().trim();
				    		String sublimitA = sublimitWebElement.getText().trim();
				    		
				    		System.out.println("verifyCollateralNameOtherCollateral : "+advanceA +" :  "+sublimitA);

				    		
				    		if (advanceA.equals(collateraladvance))
				    		{
				    			if (sublimitA.equals(collateralsublimit)) 
				    			{
				    				return true;
								}
				    			else
				    				return false;
				    		}
				    		else
				    			return false;

				    	} catch (Exception e) {
				    		return false;
				    	}				    	
				    	}
				 public boolean  verifyFocalDate(String focalDate){
				    	try {
				    		WebElement displayWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(focalDate_xpath));
				    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(focalDateValue_xpath));
				    		displayWebElement.isDisplayed();
				    		String actual = AmountWebElement.getText().trim();
				    		System.out.println("verifyFocalDate : "+actual );

				    		
				    		if (actual.equals(focalDate))
				    			return true;
				    		else
				    			return false;

				    	} catch (Exception e) {
				    		return false;
				    	}
				    	
				    	}
				 

				 public boolean  verifyEndingARBalanceRollForward(String EndingARBalanceRollForward){
				    	try {
				    		WebElement elementWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(endingARBalanceRollForward_xpath));
				    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(endingARBalanceRollForwardValue_xpath));
				    		elementWebElement.isDisplayed();
				    		String actual = AmountWebElement.getText().trim();
				    		if (actual.equals(EndingARBalanceRollForward))
				    			return true;
				    		else
				    			return false;

				    	} catch (Exception e) {
				    		return false;
				    	}				    	
				    	}
				 
				  public boolean scrollToViewNetARAvailableForAdvance()
					{
						try{
							 WebElement actual1=new WebDriverWait(driver,10)
				    		 .until(ExpectedConditions.visibilityOfElementLocated(NetARAvailableForAdvance_xpath));
				    		JavascriptExecutor jse1 = (JavascriptExecutor)driver;;
				    		jse1.executeScript("arguments[0].scrollIntoView(true);", actual1);  		
					        //Thread.sleep(3000);
					        return true;
							
						}
						catch(Exception e){
							
						}
						return false;
						
						}
				 
				  public boolean  verifyEndingARBalanceARAging(String EndingARBalanceARAging){
				    	try {
				    		WebElement elementWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(endingARBalanceArAging_xpath));
				    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(endingARBalanceArAgingValue_xpath));
				    		elementWebElement.isDisplayed();
				    		String actual = AmountWebElement.getText().trim();
				    		System.out.println("verifyEndingARBalanceARAging : "+actual);
				    		
				    		if (actual.equals(EndingARBalanceARAging))
				    			
				    			return true;
				    		else
				    			return false;

				    	} catch (Exception e) {
				    		return false;
				    	}				    	

				    	}	 
				  

				  public boolean  verifyEndingARBalanceAPAging(String endingAPBalanceValue){
				    	try {
				    		WebElement elementWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(endingAPBalance_xpath));
				    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(endingAPBalanceValue_xpath));
				    		elementWebElement.isDisplayed();
				    		String actual = AmountWebElement.getText().trim();
				    		System.out.println(actual);
				    		if (actual.equals(endingAPBalanceValue))
				    			return true;
				    		else
				    			return false;

				    	} catch (Exception e) {
				    		return false;
				    	}				    	
				    	}	 
				  
				  public boolean  verifyNetARAvailableForAdvanceTrend(String NetARAvailableForAdvance){
				    	try {
				    	//		WebElement elementWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(NetARAvailableForAdvance_xpath));
				    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(NetARAvailableForAdvanceValue_xpath));
				    	//	elementWebElement.isDisplayed();
				    		String actual = AmountWebElement.getText().trim();
				    		System.out.println("verifyNetARAvailableForAdvanceTrend : "+actual);
				    		
				    		if (actual.equals(NetARAvailableForAdvance))
				    			return true;
				    		else
				    			return false;

				    	} catch (Exception e) {
				    		return false;
				    	}				    	
				    	}	   
				  public boolean  verifyNetInventoryAvailableForAdvanceTrend(String NetInventoryAvailableForAdvance){
				    	try {
				    		WebElement elementWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(NetInventoryAvailableForAdvance_xapth));
				    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(NetInventoryAvailableForAdvanceValue_xapth));
				    		elementWebElement.isDisplayed();
				    		String actual = AmountWebElement.getText().trim();
				    		System.out.println(actual);
				    		if (actual.equals(NetInventoryAvailableForAdvance))
				    			return true;
				    		else
				    			return false;

				    	} catch (Exception e) {
				    		return false;
				    	}				    	
				    	}	
				 
				  
				  
				  public boolean  verifyNetOtherCollateralAvailableForAdvanceTrend(String NetOtherCollateralAvailableForAdvance){
				    	try {
				    		WebElement elementWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(NetOtherCollateralAvailableForAdvance_xpath));
				    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(NetOtherCollateralAvailableForAdvanceValue_xpath));
				    		elementWebElement.isDisplayed();
				    		String actual = AmountWebElement.getText().trim();
				    		System.out.println(actual);
				    		if (actual.equals(NetOtherCollateralAvailableForAdvance))
				    			return true;
				    		else
				    			return false;

				    	} catch (Exception e) {
				    		return false;
				    	}				    	
				    	}	
				  
				  public boolean  verifyTotalBorrowingBase(String totalBorrowingBase){
				    	try {
				    		WebElement elementWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(totalBorrowingBase_xpath));
				    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(totalBorrowingBaseValue_xpath));
				    		elementWebElement.isDisplayed();
				    		String actual = AmountWebElement.getText().trim();
				    		
				    		System.out.println("verifyTotalBorrowingBase : "+actual);
				    		if (actual.equals(totalBorrowingBase))
				    			return true;
				    		else
				    			return false;

				    	} catch (Exception e) {
				    		return false;
				    	}				    	
				    	}	
				  
				  public boolean  verifyApprovedLine(String approvedLine){
				    	try {
				    		WebElement elementWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(approvedLine_xpath));
				    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(approvedLineValue_xpath));
				    		elementWebElement.isDisplayed();
				    		String actual = AmountWebElement.getText().trim();
				    		if (actual.equals(approvedLine))
				    			return true;
				    		else
				    			return false;

				    	} catch (Exception e) {
				    		return false;
				    	}				    	
				    	}	
				  
				  public boolean  verifyNetCollateralAvailableTrend(String netCollateralAvailableTrend){
				    	try {
				    		WebElement elementWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(netCollateralAvailableTrend_xpath));
				    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(netCollateralAvailableTrendValue_xpath));
				    		elementWebElement.isDisplayed();
				    		String actual = AmountWebElement.getText().trim();
				    		if (actual.equals(netCollateralAvailableTrend))
				    			return true;
				    		else
				    			return false;

				    	} catch (Exception e) {
				    		return false;
				    	}				    	
				    	}	
				  
					
				  
				  public boolean  verifyNetCollateralAvailableTrendC(String netCollateralAvailableTrend){
				    	try {
				    		WebElement elementWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(netCollateralAvailableTrend_xpath));
				    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(netCollateralAvailableTrendValueC_xpath));
				    		elementWebElement.isDisplayed();
				    		String actual = AmountWebElement.getText().trim();
				    		if (actual.equals(netCollateralAvailableTrend))
				    			return true;
				    		else
				    			return false;

				    	} catch (Exception e) {
				    		return false;
				    	}				    	
				    	}	
				  
				  
				 
						 public boolean verifyReportAllValuesMaintainArForMulDiv(String expected,String asOfDate,String clientname,String accNo,String accName,String future,String current,String over30,String over60,String over90,String over120,String total)
							{
							try{
							WebElement WebEelement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(htmlButton_xpath));
							WebEelement.click();
							//Thread.sleep(5000);
							Set <String> handles =driver.getWindowHandles();
							Iterator<String> it = handles.iterator();
							//iterate through your windows
							while (it.hasNext()){
							String parent = it.next();
							String newwin = it.next();
							driver.switchTo().window(newwin);

				//			System.out.println("start");
//							String parentWindow = driver.getWindowHandle();
//                            System.out.println(parentWindow.toString()); 
//							//Set<String> childWindow;
//							for(String childWindow1:driver.getWindowHandles())
//							{
//								System.out.println(childWindow1.toString());
//							if(!childWindow1.equals(parentWindow)){
//							    driver.switchTo().window(childWindow1);
//							}

							//System.out.println("end");
							System.out.println(driver.getCurrentUrl().toString());

							WebElement reportHeader=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(headerReport_xpath));
							reportHeader.isDisplayed();
							System.out.println("Report header");
							
							driver.findElement(By.xpath("//h2[text()='Receivables Aged Trial Balance for Summary as of: 01/01/2018']")).isDisplayed();	
							System.out.println("As Of date");
							
							driver.findElement(By.xpath("//*[contains(text(),'"+BasePage.clientName+"')]")).isDisplayed();	
							System.out.println("Client name");
							
							
							WebElement accNoWebElement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(accountNo_xpath));
							accNoWebElement.getText().equalsIgnoreCase(accNo);
							System.out.println("Account number");
							
							WebElement accNameWebElement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(accname_xpath));
							accNameWebElement.getText().equalsIgnoreCase(accName);
							System.out.println("Account name");
							
							WebElement futureWebElement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(futureAr_xpath));
							futureWebElement.getText().equalsIgnoreCase(future);
							System.out.println("Future");
							
							WebElement currentWebElement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(currentAr_xapth));
							currentWebElement.getText().equalsIgnoreCase(current);
							System.out.println("Current");
							
							WebElement over30WebElement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(over30Ar_xpath));
							over30WebElement.getText().equalsIgnoreCase(over30);
							System.out.println("over30");
							
							WebElement over60Webelement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(over60Ar_xpath));
							over60Webelement.getText().equalsIgnoreCase(over60);
							System.out.println("over60");
							
							WebElement over90Webelement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(over90Ar_xpath));
							over90Webelement.getText().equalsIgnoreCase(over90);
							System.out.println("over90");
							
							WebElement over120Webelement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(over120Ar_xpath));
							over120Webelement.getText().equalsIgnoreCase(over120);
							System.out.println("over120");
							
							WebElement totalWebelement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(totalAr_xpath));
							totalWebelement.getText().equalsIgnoreCase(total);
							System.out.println("Total");
							
							driver.close();
							driver.switchTo().window(parent);
							
							}
							return true;}
							catch(Exception ex){
							return false;
							}
					}

						 public boolean  verifyEndingARBalanceRollForwardAr(String EndingARBalanceRollForward){
						    	try {
						    		WebElement elementWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(endingARBalanceRollForward_xpath));
						    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(endingARBalanceRollForwardValueAr_xpath));
						    		elementWebElement.isDisplayed();
						    		String actual = AmountWebElement.getText().trim();
						    		if (actual.equals(EndingARBalanceRollForward))
						    			return true;
						    		else
						    			return false;

						    	} catch (Exception e) {
						    		return false;
						    	}				    	
						    	}
						  public boolean  verifyEndingARBalanceARAgingAr(String EndingARBalanceARAging){
						    	try {
						    		WebElement elementWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(endingARBalanceArAging_xpath));
						    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(endingARBalanceArAgingValueAr_xpath));
						    		elementWebElement.isDisplayed();
						    		String actual = AmountWebElement.getText().trim();
						    		if (actual.equals(EndingARBalanceARAging))
						    			
						    			return true;
						    		else
						    			return false;

						    	} catch (Exception e) {
						    		return false;
						    	}				    	
						    	}	 
						  
						  public boolean  verifyEndingARBalanceAPAgingAr(String endingAPBalanceValue){
						    	try {
						    		WebElement elementWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(endingAPBalance_xpath));
						    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(endingAPBalanceValueAr_xpath));
						    		elementWebElement.isDisplayed();
						    		String actual = AmountWebElement.getText().trim();
						    		if (actual.equals(endingAPBalanceValue))
						    			return true;
						    		else
						    			return false;

						    	} catch (Exception e) {
						    		return false;
						    	}				    	
						    	}	
						  
						  public boolean  verifyNetARAvailableForAdvanceTrendAr(String NetARAvailableForAdvance){
						    	try {
						    		WebElement elementWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(NetARAvailableForAdvance_xpath));
						    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(NetARAvailableForAdvanceValueAr_xpath));
						    		elementWebElement.isDisplayed();
						    		String actual = AmountWebElement.getText().trim();
						    		if (actual.equals(NetARAvailableForAdvance))
						    			return true;
						    		else
						    			return false;

						    	} catch (Exception e) {
						    		return false;
						    	}				    	
						    	}	   
						  public boolean  verifyNetInventoryAvailableForAdvanceTrendAr(String NetInventoryAvailableForAdvance){
						    	try {
						    		WebElement elementWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(NetInventoryAvailableForAdvance_xapth));
						    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(NetInventoryAvailableForAdvanceValueAr_xapth));
						    		elementWebElement.isDisplayed();
						    		String actual = AmountWebElement.getText().trim();
						    		if (actual.equals(NetInventoryAvailableForAdvance))
						    			return true;
						    		else
						    			return false;

						    	} catch (Exception e) {
						    		return false;
						    	}				    	
						    	}	
						 
						  public boolean  verifyNetOtherCollateralAvailableForAdvanceTrendAr(String NetOtherCollateralAvailableForAdvance){
						    	try {
						    		WebElement elementWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(NetOtherCollateralAvailableForAdvance_xpath));
						    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(NetOtherCollateralAvailableForAdvanceValueAr_xpath));
						    		elementWebElement.isDisplayed();
						    		String actual = AmountWebElement.getText().trim();
						    		if (actual.equals(NetOtherCollateralAvailableForAdvance))
						    			return true;
						    		else
						    			return false;

						    	} catch (Exception e) {
						    		return false;
						    	}				    	
						    	}	
						  public boolean  verifyTotalBorrowingBaseAr(String totalBorrowingBase){
						    	try {
						    		WebElement elementWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(totalBorrowingBase_xpath));
						    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(totalBorrowingBaseValueAr_xpath));
						    		elementWebElement.isDisplayed();
						    		String actual = AmountWebElement.getText().trim();
						    		if (actual.equals(totalBorrowingBase))
						    			return true;
						    		else
						    			return false;

						    	} catch (Exception e) {
						    		return false;
						    	}				    	
						    	}	
						  public boolean  verifyNetCollateralAvailableTrendAr(String netCollateralAvailableTrend){
						    	try {
						    		WebElement elementWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(netCollateralAvailableTrend_xpath));
						    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(netCollateralAvailableTrendValueAr_xpath));
						    		elementWebElement.isDisplayed();
						    		String actual = AmountWebElement.getText().trim();
						    		if (actual.equals(netCollateralAvailableTrend))
						    			return true;
						    		else
						    			return false;

						    	} catch (Exception e) {
						    		return false;
						    	}				    	
						    	}	
						  
						  public boolean  verifyNetCollateralAvailableMgmtM(String  netCollateralAvailableMgmt){
						    	try {
						    		WebElement displayWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(netCollateralAvailableMgmt_xpath));
						    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(netCollateralAvailableValueMgmtM_xpath));
						    		displayWebElement.isDisplayed();
						    		String actual = AmountWebElement.getText().trim();
						    		System.out.println(actual);
						    		if (actual.equals(netCollateralAvailableMgmt))
						    			return true;
						    		else
						    			return false;

						    	} catch (Exception e) {
						    		return false;
						    	}}

	// rohit
	public boolean verifyNetCollateralAvailableMgmtM1(
			String netCollateralAvailableMgmt) {
		try {
			WebElement displayWebElement = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(netCollateralAvailableMgmt_xpath));
			WebElement AmountWebElement = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(netCollateralAvailableValueMgmtM1_xpath));
			displayWebElement.isDisplayed();
			String actual = AmountWebElement.getText().trim();
			System.out.println(actual);
			if (actual.equals(netCollateralAvailableMgmt))
				return true;
			else
				return false;

		} catch (Exception e) {
			return false;
		}
	}						  
						  
						  public boolean  verifyARTotalM(String  aRTotal){
						    	try {
						    		WebElement displayWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(aRTotal_xpath));
						    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(aRTotalValueM_xpath));
						    		displayWebElement.isDisplayed();
						    		String actual = AmountWebElement.getText().trim();
						    		if (actual.equals(aRTotal))
						    			return true;
						    		else
						    			return false;

						    	} catch (Exception e) {
						    		return false;
						    	}}
						  
						  public boolean  verifyApTotalM(String  apTotal){
						    	try {
						    		WebElement displayWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(apTotal_xpath));
						    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(apTotalValueM_xpath));
						    		displayWebElement.isDisplayed();
						    		String actual = AmountWebElement.getText().trim();
						    		if (actual.equals(apTotal))
						    			return true;
						    		else
						    			return false;

						    	} catch (Exception e) {
						    		return false;
						    	}}
						  public boolean  verifyOSLoanBalanceLetterOfCreditM(String oSLoanBalanceLetterOfCredit){
						    	try {
						    		WebElement elementWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(oSLoanBalanceLetterOfCredit_xpath));
						    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(oSLoanBalanceLetterOfCreditValueM_xpath));
						    		elementWebElement.isDisplayed();
						    		String actual = AmountWebElement.getText().trim();
						    		if (actual.equals(oSLoanBalanceLetterOfCredit))
						    			return true;
						    		else
						    			return false;

						    	} catch (Exception e) {
						    		return false;
						    	}				    	
						    	}	

	// rohit
	public boolean verifyOSLoanBalanceLetterOfCreditM1(
			String oSLoanBalanceLetterOfCredit) {
		try {
			WebElement elementWebElement = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(oSLoanBalanceLetterOfCredit_xpath));
			WebElement AmountWebElement = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(oSLoanBalanceLetterOfCreditValueM1_xpath));
			elementWebElement.isDisplayed();
			String actual = AmountWebElement.getText().trim();
			if (actual.equals(oSLoanBalanceLetterOfCredit))
				return true;
			else
				return false;

		} catch (Exception e) {
			return false;
		}
	}	
	
	//rohit
	public boolean  verifyNetCollateralAvailableCollateralM1(String  NetCollateralAvailable){
    	try {
    		WebElement displayWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(netCollateralAvailable_xpath));
    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(netCollateralAvailableValueCollateralM1_xpath));
    		displayWebElement.isDisplayed();
    		String actual = AmountWebElement.getText().trim();
    		if (actual.equals(NetCollateralAvailable))
    			return true;
    		else
    			return false;

    	} catch (Exception e) {
    		return false;
    	}
    	
    }	
	
						  public boolean  verifyNetCollateralAvailableCollateralM(String  NetCollateralAvailable){
						    	try {
						    		WebElement displayWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(netCollateralAvailable_xpath));
						    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(netCollateralAvailableValueCollateralM_xpath));
						    		displayWebElement.isDisplayed();
						    		String actual = AmountWebElement.getText().trim();
						    		if (actual.equals(NetCollateralAvailable))
						    			return true;
						    		else
						    			return false;

						    	} catch (Exception e) {
						    		return false;
						    	}
						    	
						    }	
						  
						  public boolean  verifyTradePayablesM(String tradePayables){
						    	try {
						    		WebElement elementWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(tradePayables_xpath));
						    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(tradePayablesValueM_xpath));
						    		elementWebElement.isDisplayed();
						    		String actual = AmountWebElement.getText().trim();
						    		if (actual.equals(tradePayables))
						    			return true;
						    		else
						    			return false;

						    	} catch (Exception e) {
						    		return false;
						    	}				    	
						    	}	

	// rohit
	public boolean verifyTradePayablesM1(String tradePayables) {
		try {
			WebElement elementWebElement = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(tradePayables_xpath));
			WebElement AmountWebElement = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(tradePayablesValueM1_xpath));
			elementWebElement.isDisplayed();
			String actual = AmountWebElement.getText().trim();
			if (actual.equals(tradePayables))
				return true;
			else
				return false;

		} catch (Exception e) {
			return false;
		}
	}
						  
						  public boolean  verifyTotalAvailableBeforeSublimitM(String totalAvailableBeforeSublimit){
						    	try {
						    		WebElement elementWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(totalAvailableBeforeSublimit_xpath));
						    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(totalAvailableBeforeSublimitValueM_xpath));
						    		elementWebElement.isDisplayed();
						    		String actual = AmountWebElement.getText().trim();
						    		if (actual.equals(totalAvailableBeforeSublimit))
						    			return true;
						    		else
						    			return false;

						    	} catch (Exception e) {
						    		return false;
						    	}				    	
						    	}	
						
						 public boolean verifyReportAllValuesInPayablesAgedTrialBalanceForMulDiv(String expected,String asOfDate,String clientname,String accNo,String accName,String future,String current,String over30,String over60,String over90,String over120,String total)
							{
							try{
							WebElement WebEelement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(htmlButton_xpath));
							WebEelement.click();
							//Thread.sleep(5000);
							Set <String> handles =driver.getWindowHandles();
							Iterator<String> it = handles.iterator();
							//iterate through your windows
							while (it.hasNext()){
							String parent = it.next();
							String newwin = it.next();
							driver.switchTo().window(newwin);

							
//							String parentWindow = driver.getWindowHandle();
//
//							//Set<String> childWindow;
//							for(String childWindow1:driver.getWindowHandles())
//							{
//							if(!childWindow1.equals(parentWindow)){
//							    driver.switchTo().window(childWindow1);
//							}


							WebElement reportHeader=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(headerReport_xpath));
							reportHeader.isDisplayed();
							System.out.println("Report header");
							
							driver.findElement(By.xpath("//h2[text()='Payables Aged Trial Balance as of: 01/01/2018']")).isDisplayed();	
							System.out.println("As Of date");
							
							driver.findElement(By.xpath("//h2[text()='"+BasePage.clientName+"']")).isDisplayed();	
							System.out.println("Client name");
							
							
							WebElement accNoWebElement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(accountNo_xpath));
							accNoWebElement.getText().equalsIgnoreCase(accNo);
							System.out.println("Account number");
							
							WebElement accNameWebElement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(accname_xpath));
							accNameWebElement.getText().equalsIgnoreCase(accName);
							System.out.println("Account name");
							
							WebElement futureWebElement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(future_xpath));
							futureWebElement.getText().equalsIgnoreCase(future);
							System.out.println("Future");
							
							WebElement currentWebElement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(current_xapth));
							currentWebElement.getText().equalsIgnoreCase(current);
							System.out.println("Current");
							
							WebElement over30WebElement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(over30_xpath));
							over30WebElement.getText().equalsIgnoreCase(over30);
							System.out.println("over30");
							
							WebElement over60Webelement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(over60_xpath));
							over60Webelement.getText().equalsIgnoreCase(over60);
							System.out.println("over60");
							
							WebElement over90Webelement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(over90_xpath));
							over90Webelement.getText().equalsIgnoreCase(over90);
							System.out.println("over90");
							
							WebElement over120Webelement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(over120_xpath));
							over120Webelement.getText().equalsIgnoreCase(over120);
							System.out.println("over120");
							
							
							WebElement totalWebelement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(total_xpath));
							totalWebelement.getText().equalsIgnoreCase(total);
							System.out.println("Total");
							
							/*WebElement totalWebelement=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(totalAr_xpath));
							totalWebelement.getText().equalsIgnoreCase(total);
							System.out.println("Total");*/
							
						//
							/*WebElement actual=new WebDriverWait(driver,200).until(ExpectedConditions.visibilityOfElementLocated(reportsHeader));
							actual.getText().trim();
							if (actual.equals(expected))
							return true;
							else
							return false;*/
							
							driver.close();
							driver.switchTo().window(parent);
							
							}
							return true;}
							catch(Exception ex){
							return false;
							}
							


							
							}
						 public boolean verifyArApConcReportAllValuesMaintainArForMulDiv(String expected,String asOfDate,String clientname,String accName,String perOfTotalAr,String total,String current,String over30,String over60,String over90,String over120)
							{
								try{
									WebElement WebEelement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(htmlButton_xpath));
									WebEelement.click();
									//Thread.sleep(5000);
									Set <String> handles =driver.getWindowHandles();
									Iterator<String> it = handles.iterator();
									//iterate through your windows
									while (it.hasNext()){
									String parent = it.next();
									String newwin = it.next();
									driver.switchTo().window(newwin);

//									String parentWindow = driver.getWindowHandle();
//
//									//Set<String> childWindow;
//									for(String childWindow1:driver.getWindowHandles())
//									{
//									if(!childWindow1.equals(parentWindow)){
//									    driver.switchTo().window(childWindow1);
//									}

									

									WebElement reportHeader=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(headerReport_xpath));
									reportHeader.isDisplayed();
									System.out.println("Report header");
									
									driver.findElement(By.xpath("//h2[text()='Debtors Concentrations as of:01/01/2018']")).isDisplayed();	
									System.out.println("As Of date");
									
									driver.findElement(By.xpath("//h2[text()='"+BasePage.clientName+"']")).isDisplayed();	
									System.out.println("Client name");

							WebElement accNameWebElement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(accountNameArAp_xpath));
							accNameWebElement.getText().equalsIgnoreCase(accName);
							System.out.println("Account name");
							
							WebElement perOfTotalArWebelement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(PercOfTotalARArAp_xpath));
							perOfTotalArWebelement.getText().trim().equalsIgnoreCase(perOfTotalAr);
							System.out.println("% of total AR");
							
							WebElement totalWebelement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(totalarAp_xpath));
							totalWebelement.getText().trim().equalsIgnoreCase(total);
							System.out.println("Total");
							
							WebElement currentWebElement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(currentArApp_xapth));
							currentWebElement.getText().trim().equalsIgnoreCase(current);
							System.out.println("Current");
							
							WebElement over30WebElement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(over30ArApp_xpath));
							over30WebElement.getText().equalsIgnoreCase(over30);
							System.out.println("over30");
							
							WebElement over60Webelement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(over60ArApp_xpath));
							over60Webelement.getText().equalsIgnoreCase(over60);
							System.out.println("over60");
							
							WebElement over90Webelement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(over90ArApp_xpath));
							over90Webelement.getText().equalsIgnoreCase(over90);
							System.out.println("over90");
							
							WebElement over120Webelement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(Over120ForMulDiv_xpath));
							over120Webelement.getText().equalsIgnoreCase(over120);
							System.out.println("over120");
							
							driver.close();
							driver.switchTo().window(parent);
							
							}
							return true;}
							catch(Exception ex){
							return false;
							}}
						 
						 public boolean verifyArApConcReportAllValuesMaintainArForSummaryMulDiv(String expected,String asOfDate,String clientname,String accName,String perOfTotalAr,String total,String current,String over30,String over60,String over90,String over120)
							{
								try{
									WebElement WebEelement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(htmlButton_xpath));
									WebEelement.click();
									//Thread.sleep(5000);
									Set <String> handles =driver.getWindowHandles();
									Iterator<String> it = handles.iterator();
									//iterate through your windows
									while (it.hasNext()){
									String parent = it.next();
									String newwin = it.next();
									driver.switchTo().window(newwin);
									//
									
									WebElement reportHeader=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(headerReport_xpath));
									reportHeader.isDisplayed();
									System.out.println("Report header");
									
									driver.findElement(By.xpath("//h2[text()='Debtors Concentrations as of:01/01/2018']")).isDisplayed();	
									System.out.println("As Of date");
									
									driver.findElement(By.xpath("//h2[text()='"+clientname.toUpperCase()+"']")).isDisplayed();	
									System.out.println("Client name");
							
							WebElement accNameWebElement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(accountNameArAp_xpath));
							accNameWebElement.getText().equalsIgnoreCase(accName);
							System.out.println("Account name");
							
							WebElement perOfTotalArWebelement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(PercOfTotalARArAp_xpath));
							perOfTotalArWebelement.getText().trim().equalsIgnoreCase(perOfTotalAr);
							System.out.println("% of total AR");
							
							WebElement totalWebelement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(totalarAp_xpath));
							totalWebelement.getText().trim().equalsIgnoreCase(total);
							System.out.println("Total");
							
							WebElement currentWebElement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(currentArApp_xapth));
							currentWebElement.getText().trim().equalsIgnoreCase(current);
							System.out.println("Current");
							
							WebElement over30WebElement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(over30ArApp_xpath));
							over30WebElement.getText().equalsIgnoreCase(over30);
							System.out.println("over30");
							
							WebElement over60Webelement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(over60ArApp_xpath));
							over60Webelement.getText().equalsIgnoreCase(over60);
							System.out.println("over60");
							
							WebElement over90Webelement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(over90ArApp_xpath));
							over90Webelement.getText().equalsIgnoreCase(over90);
							System.out.println("over90");
							
							WebElement over120Webelement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(Over120ForMulDiv_xpath));
							over120Webelement.getText().equalsIgnoreCase(over120);
							System.out.println("over120");
							
							
							driver.switchTo().defaultContent();
							
							}
							return true;}
							catch(Exception ex){
							return false;
							}}
						 public boolean verifyReportAllValuesInAssetsInventoryForMulDIv(String expected,String asOfDate,String clientname,String location,String actualValue,String ineligibleAmount,String assetAmount)
							{
							try{
							WebElement WebEelement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(htmlButton_xpath));
							WebEelement.click();
							//Thread.sleep(5000);
							Set <String> handles =driver.getWindowHandles();
							Iterator<String> it = handles.iterator();
							//iterate through your windows
							while (it.hasNext()){
							String parent = it.next();
							String newwin = it.next();
							driver.switchTo().window(newwin);

							
//							String parentWindow = driver.getWindowHandle();
//
//							//Set<String> childWindow;
//							for(String childWindow1:driver.getWindowHandles())
//							{
//							if(!childWindow1.equals(parentWindow)){
//							    driver.switchTo().window(childWindow1);
//							}

							

							WebElement reportHeader=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(headerReport_xpath));
							reportHeader.isDisplayed();
							System.out.println("Report header");
							
							driver.findElement(By.xpath("//h2[text()='Assets/Inventory Report as of BBC dated: 01/01/2018']")).isDisplayed();	
							System.out.println("As Of date");
							
							driver.findElement(By.xpath("//h2[text()='"+BasePage.clientName+"']")).isDisplayed();	
							System.out.println("Client name");
							
							WebElement locationWebelement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(location_xpath));
							locationWebelement.getText().equalsIgnoreCase(location);
							System.out.println("Location");
							
							WebElement actualValueWebElement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(actualValue_xpath));
							actualValueWebElement.getText().equalsIgnoreCase(actualValue);
							System.out.println("Actual value");
							
							WebElement ineligibleAmountWebElement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(ineligibleAmount_xpath));
							ineligibleAmountWebElement.getText().equalsIgnoreCase(ineligibleAmount);
							System.out.println("Ineligible amount");
							
							WebElement assetAmountWebelement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(assetAmount_xapth));
							assetAmountWebelement.getText().equalsIgnoreCase(assetAmount);
							System.out.println("Asset amount");
							
							driver.close();
							driver.switchTo().window(parent);
							
							}
							return true;}
							catch(Exception ex){
							return false;
							}}

	public boolean verifyBbcReportNewTabForMulDiv(String clientname,
			String MaximumLineAmount) {
		try {
			WebElement WebEelement = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(htmlButton_xpath));
			WebEelement.click();
			// Thread.sleep(5000);
			Set<String> handles = driver.getWindowHandles();
			Iterator<String> it = handles.iterator();
			// iterate through your windows
			while (it.hasNext()) {
				String parent = it.next();
				String newwin = it.next();
				driver.switchTo().window(newwin);
				//

				WebElement reportHeader = new WebDriverWait(driver, 10)
						.until(ExpectedConditions
								.visibilityOfElementLocated(headerReport_xpath));
				reportHeader.isDisplayed();
				System.out.println("Cync Report header");

				driver.findElement(
						By.xpath("//h2[text()='Maximum Line Amount: 8,000,000.00']"))
						.isDisplayed();
				System.out.println("Maximum line amount");

				driver.findElement(
						By.xpath("//h2[text()='" + BasePage.clientName + "']"))
						.isDisplayed();
				System.out.println("Client name");

			}
			return true;
		} catch (Exception ex) {
			return false;
		}
	}
						 
						 public boolean  verifyEndingBalanceTotalARForMulDiv(String  EndingBalanceTotalAR){
						    	try {
						    		WebElement displayWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(endingBalanceTotalAR_xpath));
						    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(endingBalanceTotalARValueForMulDiv_xpath));
						    		displayWebElement.isDisplayed();
						    		String actual = AmountWebElement.getText().trim();
						    		if (actual.equals(EndingBalanceTotalAR))
						    			return true;
						    		else
						    			return false;

						    	} catch (Exception e) {
						    		return false;
						    	}
						    	
						    }	
						 
						 
						 public boolean  verifyEndingBalanceTotalARForMulDiv1(String  EndingBalanceTotalAR){
						    	try {
						    		WebElement displayWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(endingBalanceTotalAR1_xpath));
						    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(endingBalanceTotalARValueForMulDiv1_xpath));
						    		displayWebElement.isDisplayed();
						    		String actual = AmountWebElement.getText().trim();
						    		if (actual.equals(EndingBalanceTotalAR))
						    			return true;
						    		else
						    			return false;

						    	} catch (Exception e) {
						    		return false;
						    	}
						    	
						    }	
						 
						 
						 public boolean  verifyTotalAgedReceivablesForMulDiv(String  totalAgedReceivables){
						    	try {
						    		WebElement displayWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(totalAgedReceivables_xpath));
						    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(totalAgedReceivablesValueForMulDiv_xpath));
						    		displayWebElement.isDisplayed();
						    		String actual = AmountWebElement.getText().trim();
						    		if (actual.equals(totalAgedReceivables))
						    			return true;
						    		else
						    			return false;

						    	} catch (Exception e) {
						    		return false;
						    	}
						    	
						    }	
						 public boolean  verifyNetInventoryAvailableForAdvanceBbcForMulDiv(String  netInventoryAvailableForAdvance){
						    	try {
						    		WebElement displayWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(netInventoryAvailableForAdvance_xpath));
						    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(netInventoryAvailableForAdvanceBbcValueForMulDiv_xpath));
						    		displayWebElement.isDisplayed();
						    		System.out.println(AmountWebElement.getText().toString());
						    		String actual = AmountWebElement.getText().trim();
						    		if (actual.equals(netInventoryAvailableForAdvance))
						    			return true;
						    		else
						    			return false;

						    	} catch (Exception e) {
						    		return false;
						    	}
						    	
						    }	
						 public boolean  verifyTotalAvailableARInventoryBbcForMulDiv(String  totalAvailableARInventory){
						    	try {
						    		WebElement displayWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(totalAvailableARInventoryBbc_xpath));
						    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(totalAvailableARInventoryBbcValueForMulDiv_xpath));
						    		displayWebElement.isDisplayed();
						    		String actual = AmountWebElement.getText().trim();
						    		if (actual.equals(totalAvailableARInventory))
						    			return true;
						    		else
						    			return false;

						    	} catch (Exception e) {
						    		return false;
						    	}
						    	
						    }	
						 public boolean  verifyNetOtherAvailableForAdvanceBbcUFirMulDiv(String  netOtherAvailableForAdvance){
						    	try {
						    		WebElement displayWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(netOtherAvailableForAdvance_xpath));
						    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(netOtherAvailableForAdvanceBbcValueeForMulDiv_xpath));
						    		displayWebElement.isDisplayed();
						    		String actual = AmountWebElement.getText().trim();
						    		if (actual.equals(netOtherAvailableForAdvance))
						    			return true;
						    		else
						    			return false;

						    	} catch (Exception e) {
						    		return false;
						    	}
						    	
						    }	
						 public boolean  verifyTotalAvailableForAdvanceBbcUForMulDiv(String  totalAvailableForAdvance){
						    	try {
						    		WebElement displayWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(totalAvailableForAdvance_xpath));
						    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(totalAvailableForAdvanceBbcValueeForMulDiv_xpath));
						    		displayWebElement.isDisplayed();
						    		String actual = AmountWebElement.getText().trim();
						    		if (actual.equals(totalAvailableForAdvance))
						    			return true;
						    		else
						    			return false;

						    	} catch (Exception e) {
						    		return false;
						    	}
						    	
						    }
						 public boolean  verifyLineLimitWithReservesBbcUForMulDiv(String  lineLimitWithReserves){
						    	try {
						    		WebElement displayWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(lineLimitWithReserves_xpath));
						    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(lineLimitWithReservesValueeForMulDiv_xpath));
						    		displayWebElement.isDisplayed();
						    		String actual = AmountWebElement.getText().trim();
						    		if (actual.equals(lineLimitWithReserves))
						    			return true;
						    		else
						    			return false;

						    	} catch (Exception e) {
						    		return false;
						    	}
						    	
						    }	
						 public boolean  verifyBorrowingBaseAvailabilityBbcForMulDiv(String  borrowingBaseAvailability){
						    	try {
						    		WebElement displayWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(borrowingBaseAvailability_xpath));
						    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(borrowingBaseAvailabilityValueForMul_xpath));
						    		displayWebElement.isDisplayed();
						    		String actual = AmountWebElement.getText().trim();
						    		if (actual.equals(borrowingBaseAvailability))
						    			return true;
						    		else
						    			return false;

						    	} catch (Exception e) {
						    		return false;
						    	}
						    	
						    }	
						 public boolean verifyReportAllValuesInARDetailedAgingForMulDiv(String expected,String asOfDate,String clientname,String accNo,String accName,String documentNo,String invoiceDate,String future,String current,String over30,String over60,String over90,String over120,String total)

							{
							try{
							WebElement WebEelement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(htmlButton_xpath));
							WebEelement.click();
							//Thread.sleep(5000);
							Set <String> handles =driver.getWindowHandles();
							Iterator<String> it = handles.iterator();
							//iterate through your windows
							while (it.hasNext()){

								String parent = it.next();
								String newwin = it.next();
								driver.switchTo().window(newwin);
							//
							

							WebElement reportHeader=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(headerReport_xpath));

//							String parentWindow = driver.getWindowHandle();
//
//							//Set<String> childWindow;
//							for(String childWindow1:driver.getWindowHandles())
//							{
//							if(!childWindow1.equals(parentWindow)){
//							    driver.switchTo().window(childWindow1);
//							}
//
//							
							
	
							reportHeader.isDisplayed();
							System.out.println("Report header");
							
							driver.findElement(By.xpath("//h2[text()='AR Detailed Aging as of: 01/01/2018']")).isDisplayed();	
							System.out.println("As Of date");
							
							driver.findElement(By.xpath("//h2[text()='"+BasePage.clientName+"']")).isDisplayed();	
							System.out.println("Client name");		
							
							WebElement accNoWebElement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(accountNoDetail_xpath));
							accNoWebElement.getText().equalsIgnoreCase(accNo);
							System.out.println("Account no");
							
							WebElement accNameWebElement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(accountNameDetail_xpath));
							accNameWebElement.getText().equalsIgnoreCase(accName);
							System.out.println("Account name");
							
							WebElement documentWebelement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(documentNoDetail_xpath));
							documentWebelement.getText().trim().equalsIgnoreCase(documentNo);
							System.out.println("documentNo");
							
							WebElement dateWebElement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(invoiceDate_xpath));
							dateWebElement.getText().equalsIgnoreCase(invoiceDate);
							System.out.println("invoiceDate");
							
							WebElement futureWebElement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(futureDetail_xpath));
							futureWebElement.getText().trim().equalsIgnoreCase(future);
							System.out.println("Future");
							
							WebElement currentWebElement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(currentDetail_xpath));
							currentWebElement.getText().trim().equalsIgnoreCase(current);
							System.out.println("Current");
							
							WebElement over30WebElement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(over30Detail_xpath));
							over30WebElement.getText().equalsIgnoreCase(over30);
							System.out.println("over30");
							
							WebElement over60Webelement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(over60Detail_xpath));
							over60Webelement.getText().equalsIgnoreCase(over60);
							System.out.println("over60");
							
							WebElement over90Webelement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(over90Detail_xpath));
							over90Webelement.getText().equalsIgnoreCase(over90);
							System.out.println("over90");
							
							WebElement over120Webelement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(over120Detail_xpath));
							over120Webelement.getText().equalsIgnoreCase(over120);
							System.out.println("over120");
							
							WebElement totalWebelement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(totalDetail_xpath));
							totalWebelement.getText().equalsIgnoreCase(total);
							System.out.println("total");
							
							driver.close();
							driver.switchTo().window(parent);
							
							}
							return true;}
							catch(Exception ex){
							return false;
							}}
						 
						 public boolean verifyReportAllValuesInARDetailedAgingSummaryForMulDiv(String expected,String asOfDate,String clientname,String accNo,String accName,String future,String current,String over30,String over60,String over90,String over120,String total)
							{
							 try{
									WebElement WebEelement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(htmlButton_xpath));
									WebEelement.click();
									//Thread.sleep(5000);
									Set <String> handles =driver.getWindowHandles();
									Iterator<String> it = handles.iterator();
									//iterate through your windows
									while (it.hasNext()){
										String parent = it.next();
										String newwin = it.next();
										driver.switchTo().window(newwin);
							
							WebElement reportHeader=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(headerReport_xpath));

							
//									String parentWindow = driver.getWindowHandle();
//
//									//Set<String> childWindow;
//									for(String childWindow1:driver.getWindowHandles())
//									{
//									if(!childWindow1.equals(parentWindow)){
//									    driver.switchTo().window(childWindow1);
//									}
		
						
							reportHeader.isDisplayed();
							System.out.println("Report header");
							
							driver.findElement(By.xpath("//h2[contains(text(),'AR Summary Aging as of: 01/01/2018')]")).isDisplayed();	
							System.out.println("As Of date");
							
							driver.findElement(By.xpath("//h2[text()='"+BasePage.clientName+"']")).isDisplayed();	
							System.out.println("Client name");		
							
							WebElement accNoWebElement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(accountNoDetail_xpath));
							accNoWebElement.getText().equalsIgnoreCase(accNo);
							System.out.println("Account no");
							
							WebElement accNameWebElement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(accountNameDetail_xpath));
							accNameWebElement.getText().equalsIgnoreCase(accName);
							System.out.println("Account name");
							
							WebElement futureWebElement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(futureDetailSumm_xpath));
							futureWebElement.getText().trim().equalsIgnoreCase(future);
							System.out.println("Future");
							
							WebElement currentWebElement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(currentDetailSumm_xpath));
							currentWebElement.getText().trim().equalsIgnoreCase(current);
							System.out.println("Current");
							
							WebElement over30WebElement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(over30DetailSumm_xpath));
							over30WebElement.getText().equalsIgnoreCase(over30);
							System.out.println("over30");
							
							WebElement over60Webelement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(over60DetailSumm_xpath));
							over60Webelement.getText().equalsIgnoreCase(over60);
							System.out.println("over60");
							
							WebElement over90Webelement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(over90DetailSumm_xpath));
							over90Webelement.getText().equalsIgnoreCase(over90);
							System.out.println("over90");
							
							WebElement over120Webelement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(over120DetailSumm_xpath));
							over120Webelement.getText().equalsIgnoreCase(over120);
							System.out.println("over120");
							
							WebElement totalWebelement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(totalDetailSumm_xpath));
							totalWebelement.getText().equalsIgnoreCase(total);
							System.out.println("total");

							driver.close();
							driver.switchTo().window(parent);
							
							}
							return true;}
							catch(Exception ex){
							return false;
							}}
						 
						 public boolean verifyArLoanReportForMulDiv(String arStartDate,String arEndDate,String clientname,String dateArLoan,String salesArLoan,String creditsArLoan,String unreconciled,String collections,String adjustments,String arBalance,String BalanceAr)
							{
							 try{
									WebElement WebEelement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(htmlButton_xpath));
									WebEelement.click();
									//Thread.sleep(5000);
									Set <String> handles =driver.getWindowHandles();
									Iterator<String> it = handles.iterator();
									//iterate through your windows
									while (it.hasNext()){
										String parent = it.next();
										String newwin = it.next();
										driver.switchTo().window(newwin);
							//
							
							WebElement reportHeader=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(headerReport_xpath));
							reportHeader.isDisplayed();
							System.out.println("Report header");
							
							driver.findElement(By.xpath("//h2[text()='AR Loan Activity Report from 01/01/2018 to 01/01/2018']")).isDisplayed();	
							System.out.println("AR loan activity report");
							
							driver.findElement(By.xpath("//h2[text()='TEST_ABL7']")).isDisplayed();	
							System.out.println("Client name");		
							
							WebElement dateArLoanWebElement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(dateArLoan_xpath));
							dateArLoanWebElement.getText().equalsIgnoreCase(dateArLoan);
							System.out.println("dateArLoan");
							
							WebElement salesArLoanWebElement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(salesArLoan_xpath));
							salesArLoanWebElement.getText().equalsIgnoreCase(salesArLoan);
							System.out.println("salesArLoan");
							
							WebElement creditsArLoanWebElement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(creditsArLoan_xpath));
							creditsArLoanWebElement.getText().trim().equalsIgnoreCase(creditsArLoan);
							System.out.println("creditsArLoan");
							
							WebElement unreconciledWebElement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(unreconciled_xpath));
							unreconciledWebElement.getText().trim().equalsIgnoreCase(unreconciled);
							System.out.println("unreconciled");
							
							WebElement collectionsWebElement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(collections_xpath));
							collectionsWebElement.getText().equalsIgnoreCase(collections);
							System.out.println("collections");
							
							WebElement adjustmentsWebelement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(adjustments_xpath));
							adjustmentsWebelement.getText().equalsIgnoreCase(adjustments);
							System.out.println("adjustments");
							
							WebElement arBalanceWebelement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(arBalance_xpath));
							arBalanceWebelement.getText().equalsIgnoreCase(arBalance);
							System.out.println("arBalance");
							
							WebElement BalanceArWebelement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(BalanceAr_xpath));
							BalanceArWebelement.getText().equalsIgnoreCase(BalanceAr);
							System.out.println("BalanceAr");

							
							driver.close();
							driver.switchTo().window(parent);
							
							}
							return true;}
							catch(Exception ex){
							return false;
							}}
						 public boolean verifyOpenInvoiceByDateRangeReportNewTabForMulDiv(String expected,String clientname,String startdate,String toDate)
							{
								try{
									WebElement WebEelement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(htmlButton_xpath));
									WebEelement.click();
									//Thread.sleep(5000);
									Set <String> handles =driver.getWindowHandles();
									Iterator<String> it = handles.iterator();
									//iterate through your windows
									while (it.hasNext()){
									String parent = it.next();
									String newwin = it.next();
									driver.switchTo().window(newwin);
									//
									
									WebElement reportHeader=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(headerReport_xpath));
									reportHeader.isDisplayed();
									System.out.println("Cync Report header");

									
									driver.findElement(By.xpath("//h2[contains(text(),'Invoice By Date Range Report from 01/01/2018 to 02/01/2018')]")).isDisplayed();				
									System.out.println("Report header");
									
									driver.findElement(By.xpath("//h2[text()='TEST_ABL7']")).isDisplayed();	
									System.out.println("Client name");
									
									}
									return true;}
									catch(Exception ex){
									return false;
									}}
						 
						 //bbc executive trend report
						 
						 public boolean clickOnOpenBBcExecutiveTrendReport()
							{
								try{

									WebElement ReportWebEelement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(BbcExecutiveTrendReport_xpath));
									ReportWebEelement.click();
									////Thread.sleep(2000);
									
							return true;
								}
							catch (Exception ex) {
							}
							return false;

							}

						 public boolean SelectBBCdate(String BBCdate) {
								try {
									WebElement bbcDropdownWebEelement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(SelectBBCDate_xpath));
									Select sel = new Select(bbcDropdownWebEelement);
									sel.selectByVisibleText(BBCdate);
									/*List<WebElement> list = sel.getOptions();
									for (WebElement ele : list) {
										if (ele.getText().equals(BBCdate)) {
											ele.click();
											////Thread.sleep(5000);
											break;
										}
									}*/
									return true;} 
								catch (Exception ex) {
								}
								return false;
							}
						 
						 public boolean  verifyCollateralNameReceivables2(String advance,String sublimit){
						    	try {
						    		WebElement elementWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(receivables2Trend_xpath));
						    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(receivables2TrendAdvance_xpath));
						    		WebElement sublimitWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(receivables2TrendSubLimit_xpath));	    		
						    		elementWebElement.isDisplayed();
						    		
						    		String advanceA = AmountWebElement.getText().trim();
						    		String sublimitA = sublimitWebElement.getText().trim();
						    		
						    		if (advanceA.equals(advance))
						    		{
						    			if (sublimitA.equals(sublimit)) 
						    			{
						    				return true;
										}
						    			else
						    				return false;
						    		}
						    		else
						    			return false;

						    	} catch (Exception e) {
						    		return false;
						    	}				    	
						    	}	
						 public boolean  verifyCollateralNameReceivables1DIV1(String advance,String sublimit){
						    	try {
						    		WebElement elementWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(receivables1DIV1Trend_xpath));
						    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(receivables1DIV1TrendAdvance_xpath));
						    		WebElement sublimitWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(receivables1Div1TrendSubLimit_xpath));	    		
						    		elementWebElement.isDisplayed();
						    		
						    		String advanceA = AmountWebElement.getText().trim();
						    		String sublimitA = sublimitWebElement.getText().trim();
						    		
						    		if (advanceA.equals(advance))
						    		{
						    			if (sublimitA.equals(sublimit)) 
						    			{
						    				return true;
										}
						    			else
						    				return false;
						    		}
						    		else
						    			return false;

						    	} catch (Exception e) {
						    		return false;
						    	}				    	
						    	}	
						 public boolean  verifyCollateralNameReceivables2DIV2(String advance,String sublimit){
						    	try {
						    		WebElement elementWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(receivables2DIV2Trend_xpath));
						    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(receivables2DIV2TrendAdvance_xpath));
						    		WebElement sublimitWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(receivables2Div2TrendSubLimit_xpath));	    		
						    		elementWebElement.isDisplayed();
						    		
						    		String advanceA = AmountWebElement.getText().trim();
						    		String sublimitA = sublimitWebElement.getText().trim();
						    		
						    		if (advanceA.equals(advance))
						    		{
						    			if (sublimitA.equals(sublimit)) 
						    			{
						    				return true;
										}
						    			else
						    				return false;
						    		}
						    		else
						    			return false;

						    	} catch (Exception e) {
						    		return false;
						    	}				    	
						    	}	
						 
						 public boolean  verifyCollateralNameInventory2(String Inventoryadvance,String Inventorysublimit){
						    	try {
						    		WebElement elementWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(inventory2Trend_xpath));
						    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(inventory2TrendAdvance_xpath));
						    		WebElement sublimitWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(inventory2TrendSublimit_xpath));	    		
						    		elementWebElement.isDisplayed();
						    		
						    		String advanceA = AmountWebElement.getText().trim();
						    		String sublimitA = sublimitWebElement.getText().trim();
						    		
						    		if (advanceA.equals(Inventoryadvance))
						    		{
						    			if (sublimitA.equals(Inventorysublimit)) 
						    			{
						    				return true;
										}
						    			else
						    				return false;
						    		}
						    		else
						    			return false;

						    	} catch (Exception e) {
						    		return false;
						    	}				    	
						    	}
						 
						 public boolean  verifyCollateralNameInventory1DIV1(String Inventoryadvance,String Inventorysublimit){
						    	try {
						    		WebElement elementWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(inventory1DIV1Trend_xpath));
						    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(inventory1DIV1TrendAdvance_xpath));
						    		WebElement sublimitWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(inventory1DIV1TrendSublimit_xpath));	    		
						    		elementWebElement.isDisplayed();
						    		
						    		String advanceA = AmountWebElement.getText().trim();
						    		String sublimitA = sublimitWebElement.getText().trim();
						    		
						    		if (advanceA.equals(Inventoryadvance))
						    		{
						    			if (sublimitA.equals(Inventorysublimit)) 
						    			{
						    				return true;
										}
						    			else
						    				return false;
						    		}
						    		else
						    			return false;

						    	} catch (Exception e) {
						    		return false;
						    	}				    	
						    	}
						 public boolean  verifyCollateralNameInventory2DIV2(String Inventoryadvance,String Inventorysublimit){
						    	try {
						    		WebElement elementWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(inventory2DIV2Trend_xpath));
						    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(inventory2DIV2TrendAdvance_xpath));
						    		WebElement sublimitWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(inventory2DIV2TrendSublimit_xpath));	    		
						    		elementWebElement.isDisplayed();
						    		
						    		String advanceA = AmountWebElement.getText().trim();
						    		String sublimitA = sublimitWebElement.getText().trim();
						    		
						    		if (advanceA.equals(Inventoryadvance))
						    		{
						    			if (sublimitA.equals(Inventorysublimit)) 
						    			{
						    				return true;
										}
						    			else
						    				return false;
						    		}
						    		else
						    			return false;

						    	} catch (Exception e) {
						    		return false;
						    	}				    	
						    	}
						 public boolean  verifyCollateralNameInventory1(String Inventoryadvance,String Inventorysublimit){
						    	try {
						    		WebElement elementWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(inventory1Trend_xpath));
						    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(inventory1TrendAdvance_xpath));
						    		WebElement sublimitWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(inventory1TrendSublimit_xpath));	    		
						    		elementWebElement.isDisplayed();
						    		
						    		String advanceA = AmountWebElement.getText().trim();
						    		String sublimitA = sublimitWebElement.getText().trim();
						    		
						    		if (advanceA.equals(Inventoryadvance))
						    		{
						    			if (sublimitA.equals(Inventorysublimit)) 
						    			{
						    				return true;
										}
						    			else
						    				return false;
						    		}
						    		else
						    			return false;

						    	} catch (Exception e) {
						    		return false;
						    	}				    	
						    	}
						 public boolean  verifyCollateralNameOtherCollateral1(String collateraladvance,String collateralsublimit){
						    	try {
						    		WebElement elementWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(otherCollateral1Trend_xpath));
						    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(otherCollateral1Advance_xpath));
						    		WebElement sublimitWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(otherCollateral1Sublimit_xpath));	    		
						    		elementWebElement.isDisplayed();
						    		
						    		String advanceA = AmountWebElement.getText().trim();
						    		String sublimitA = sublimitWebElement.getText().trim();
						    		
						    		if (advanceA.equals(collateraladvance))
						    		{
						    			if (sublimitA.equals(collateralsublimit)) 
						    			{
						    				return true;
										}
						    			else
						    				return false;
						    		}
						    		else
						    			return false;

						    	} catch (Exception e) {
						    		return false;
						    	}				    	
						    	}
						 public boolean  verifyCollateralNameOtherCollateral2(String collateraladvance,String collateralsublimit){
						    	try {
						    		WebElement elementWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(otherCollateral2Trend_xpath));
						    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(otherCollateral2Advance_xpath));
						    		WebElement sublimitWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(otherCollateral2Sublimit_xpath));	    		
						    		elementWebElement.isDisplayed();
						    		
						    		String advanceA = AmountWebElement.getText().trim();
						    		String sublimitA = sublimitWebElement.getText().trim();
						    		
						    		if (advanceA.equals(collateraladvance))
						    		{
						    			if (sublimitA.equals(collateralsublimit)) 
						    			{
						    				return true;
										}
						    			else
						    				return false;
						    		}
						    		else
						    			return false;

						    	} catch (Exception e) {
						    		return false;
						    	}				    	
						    	}
						 public boolean  verifyCollateralNameOtherCollateral1DIV1(String collateraladvance,String collateralsublimit){
						    	try {
						    		WebElement elementWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(otherCollateral1DIV1Trend_xpath));
						    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(otherCollateral1DIV1Advance_xpath));
						    		WebElement sublimitWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(otherCollateralDIV1Sublimit_xpath));	    		
						    		elementWebElement.isDisplayed();
						    		
						    		String advanceA = AmountWebElement.getText().trim();
						    		String sublimitA = sublimitWebElement.getText().trim();
						    		
						    		if (advanceA.equals(collateraladvance))
						    		{
						    			if (sublimitA.equals(collateralsublimit)) 
						    			{
						    				return true;
										}
						    			else
						    				return false;
						    		}
						    		else
						    			return false;

						    	} catch (Exception e) {
						    		return false;
						    	}				    	
						    	}
						 
						 public boolean  verifyCollateralNameOtherCollateral2DIV2(String collateraladvance,String collateralsublimit){
						    	try {
						    		WebElement elementWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(otherCollateral2DIV2Trend_xpath));
						    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(otherCollateral2DIV2Advance_xpath));
						    		WebElement sublimitWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(otherCollateral2DIV2Sublimit_xpath));	    		
						    		elementWebElement.isDisplayed();
						    		
						    		String advanceA = AmountWebElement.getText().trim();
						    		String sublimitA = sublimitWebElement.getText().trim();
						    		
						    		if (advanceA.equals(collateraladvance))
						    		{
						    			if (sublimitA.equals(collateralsublimit)) 
						    			{
						    				return true;
										}
						    			else
						    				return false;
						    		}
						    		else
						    			return false;

						    	} catch (Exception e) {
						    		return false;
						    	}				    	
						    	}
						 
						 public boolean  verifyEndingARBalanceRollForwardForMulDiv(String EndingARBalanceRollForward){
						    	try {
						    		WebElement elementWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(endingARBalanceRollForward_xpath));
						    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(endingARBalanceRollForwardValueForMulDiv_xpath));
						    		elementWebElement.isDisplayed();
						    		String actual = AmountWebElement.getText().trim();
						    		if (actual.equals(EndingARBalanceRollForward))
						    			return true;
						    		else
						    			return false;

						    	} catch (Exception e) {
						    		return false;
						    	}				    	
						    	}
						 
						 public boolean  verifyEndingAPBalanceRollForwardForMulDiv(String EndingApBalance){
						    	try {
						    		
						    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(endingAPBalanceForMulDiv_xpath));
						    		String actual = AmountWebElement.getText().trim();
						    		if (actual.equals(EndingApBalance))
						    			return true;
						    		else
						    			return false;

						    	} catch (Exception e) {
						    		return false;
						    	}				    	
						    	}
						 
						 public boolean  verifyNetArAvailableForMulDiv(String NetAr){
						    	try {
						    		
						    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(NetArAvailableForMulDiv_xpath));
						    		String actual = AmountWebElement.getText().trim();
						    		if (actual.equals(NetAr))
						    			return true;
						    		else
						    			return false;

						    	} catch (Exception e) {
						    		return false;
						    	}				    	
						    	}
						 
						 public boolean  verifyNetInventoryAvailableForAdvanceForMulDiv(String Netinventory){
						    	try {
						    		
						    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(NetInventoryAvailableaforAdvanceForMulDiv_xpath));
						    		String actual = AmountWebElement.getText().trim();
						    		if (actual.equals(Netinventory))
						    			return true;
						    		else
						    			return false;

						    	} catch (Exception e) {
						    		return false;
						    	}				    	
						    	}
						 public boolean  verifyTotalBorrowingBaseForMulDiv(String BorrowingBase){
						    	try {
						    		
						    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(TotalBorrowingBaseForMulDiv_xpath));
						    		String actual = AmountWebElement.getText().trim();
						    		if (actual.equals(BorrowingBase))
						    			return true;
						    		else
						    			return false;

						    	} catch (Exception e) {
						    		return false;
						    	}				    	
						    	}
						 public boolean  verifyApprovedLineForMulDiv(String Approvedline){
						    	try {
						    		
						    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(ApprovedLineForMulDiv_xpath));
						    		String actual = AmountWebElement.getText().trim();
						    		if (actual.equals(Approvedline))
						    			return true;
						    		else
						    			return false;

						    	} catch (Exception e) {
						    		return false;
						    	}				    	
						    	}
						 public boolean  verifyNetCollateralAvailableForMulDiv(String collateralAvailable){
						    	try {
						    		
						    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(NetCollateralAvailableForMulDiv_xpath));
						    		String actual = AmountWebElement.getText().trim();
						    		if (actual.equals(collateralAvailable))
						    			return true;
						    		else
						    			return false;

						    	} catch (Exception e) {
						    		return false;
						    	}				    	
						    	}
						 public boolean  verifyTotalArForMulDiv(String TotalAr){
						    	try {
						    		
						    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(TotalARForMulDiv_xpath));
						    		String actual = AmountWebElement.getText().trim();
						    		if (actual.equals(TotalAr))
						    			return true;
						    		else
						    			return false;

						    	} catch (Exception e) {
						    		return false;
						    	}				    	
						    	}
						 public boolean  verifyNetArAvailableForAdvance(String NetARAvailableForAdvance){
						    	try {
						    		
						    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(NetARAvailableForAdvanceForMulDiv_xpath));
						    		String actual = AmountWebElement.getText().trim();
						    		if (actual.equals(NetARAvailableForAdvance))
						    			return true;
						    		else
						    			return false;

						    	} catch (Exception e) {
						    		return false;
						    	}				    	
						    	}
						 public boolean  verifyTotalInventoryForMulDiv(String TotalInventory){
						    	try {
						    		
						    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(TotalInventoryForMulDiv_xpath));
						    		String actual = AmountWebElement.getText().trim();
						    		if (actual.equals(TotalInventory))
						    			return true;
						    		else
						    			return false;

						    	} catch (Exception e) {
						    		return false;
						    	}				    	
						    	}
						 public boolean  verifyNetInventoryAvilableForAdvanceInventoryForMulDiv(String NetInventoryAvailableForAdvance){
						    	try {
						    		
						    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(NetInventoryAvailableForAdvanceForMulDiv_xpath));
						    		String actual = AmountWebElement.getText().trim();
						    		if (actual.equals(NetInventoryAvailableForAdvance))
						    			return true;
						    		else
						    			return false;

						    	} catch (Exception e) {
						    		return false;
						    	}				    	
						    	}

						 public boolean  verifyNetOtherCollateralAvilableForAdvanceInventoryForMulDiv(String NetOtherCollateralAvailableForAdvance){
						    	try {
						    		
						    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(NetOtherCollateralAvailableForAdvanceForMulDiv_xpath));
						    		String actual = AmountWebElement.getText().trim();
						    		if (actual.equals(NetOtherCollateralAvailableForAdvance))
						    			return true;
						    		else
						    			return false;

						    	} catch (Exception e) {
						    		return false;
						    	}				    	
						    	}
						 
						 public boolean gettotal1()
						 {
						 try{

						 	WebElement DeleteBtnWebEelement=new WebDriverWait(driver,10)
						 	.until(ExpectedConditions.visibilityOfElementLocated(Total_xpath));
						String d= 	DeleteBtnWebEelement.getText();
						System.out.println(d);
						 	return true;
						 }
						 catch(Exception ex){
						 	return false;
						 }

						 }
						 public boolean gettotal2()
						 {
						 try{

						 	WebElement DeleteBtnWebEelement=new WebDriverWait(driver,10)
						 	.until(ExpectedConditions.visibilityOfElementLocated(Total2_xpath));
						String d= 	DeleteBtnWebEelement.getText();
						System.out.println(d);
						 	return true;
						 }
						 catch(Exception ex){
						 	return false;
						 }

						 }
						 public boolean gettotal3()
						 {
						 try{

						 	WebElement DeleteBtnWebEelement=new WebDriverWait(driver,10)
						 	.until(ExpectedConditions.visibilityOfElementLocated(Total3_xpath));
						String d= 	DeleteBtnWebEelement.getText();
						System.out.println(d);
						 	return true;
						 }
						 catch(Exception ex){
						 	return false;
						 }

						 }
						 
			 
					/*	 Author-Lavanya*/
						 
 
public  boolean verifyIneligibleretention_ineligiblereportbyreasonunapproveScreen(String ReasonData){
	try{
	WebElement verifyIneligibilityReasonWebE=new WebDriverWait(driver,10)
	.until(ExpectedConditions.visibilityOfElementLocated(retention2_xpath));
	//Thread.sleep(100);
	String ActualReason = verifyIneligibilityReasonWebE.getText().trim();
	if(ActualReason.equalsIgnoreCase(ReasonData))
	{
		System.out.println(ReasonData);
		return true;
		}
else {
	return false;
}
	}	
	catch (Exception ex) 
	{
			
		return false;
	}
	}
	public ReportsPage(WebDriver driver) {
		super(driver);
		if(!driver.findElement(reportsHeader).getText().trim().equals("Reports")){
			throw new SkipException("Reports screen couldn't open.");
		}
	}
	public boolean Select_on_BBCdate(String sw2) {
		try {
			WebElement accTypeDropdownWebEelement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(bbcdate_xpath));
			Select sel = new Select(accTypeDropdownWebEelement);
			List<WebElement> list = sel.getOptions();
			for (WebElement ele : list) {
				if (ele.getText().equals(sw2)) {
					ele.click();
					////Thread.sleep(5000);
					break;
				}
			}
			return true;} 
		catch (Exception ex) {
		}
		return false;

	}
	//Author-Lavanya
	public  boolean verifyIneligibilityamnt_bbcreport_approvecreen2(String ReasonAmount){
		try{
		WebElement verifyIneligibilityAmountWebE=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(inelamnt_xpath));
		//Thread.sleep(100);
		String ActualAmount = verifyIneligibilityAmountWebE.getText();
		if(ActualAmount.equalsIgnoreCase(ReasonAmount))
		{
			System.out.println(ReasonAmount);
			return true;
			}
	else {
		return false;
	}
	}	
		catch (Exception ex) 
		{
				
			return false;
		}
			
			
		}
	public  boolean verifyIneligibleretention_bbcmanagementreportapproveScreen(String ReasonData){
    	try{
    	WebElement verifyIneligibilityReasonWebE=new WebDriverWait(driver,10)
    	.until(ExpectedConditions.visibilityOfElementLocated(retention4_xpath));
    	//Thread.sleep(100);
    	String ActualReason = verifyIneligibilityReasonWebE.getText().trim();
    	if(ActualReason.equalsIgnoreCase(ReasonData))
    	{
    		System.out.println(ReasonData);
    		return true;
    		}
    else {
    	return false;
    }
    	}	
    	catch (Exception ex) 
    	{
    			
    		return false;
    	}
    		
    		
    	}
	public  boolean verifyIneligibleretentionamnt_bbcmanagementreport_approvecreen1(String ReasonAmount){
		try{
		WebElement verifyIneligibilityAmountWebE=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(retentionamnt9_xpath));
		//Thread.sleep(100);
		String ActualAmount = verifyIneligibilityAmountWebE.getText();
		if(ActualAmount.equalsIgnoreCase(ReasonAmount))
		{
			System.out.println(ReasonAmount);
			return true;
			}
	else {
		return false;
	}
	}	
		catch (Exception ex) 
		{
				
			return false;
		}
			
			
		}
	public  boolean verifyIneligibleretentionamnt_bbcmanagementreport_approvecreen2(String ReasonAmount){
		try{
		WebElement verifyIneligibilityAmountWebE=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(retentionamnt15_xpath));
		//Thread.sleep(100);
		String ActualAmount = verifyIneligibilityAmountWebE.getText();
		if(ActualAmount.equalsIgnoreCase(ReasonAmount))
		{
			System.out.println(ReasonAmount);
			return true;
			}
	else {
		return false;
	}
	}	
		catch (Exception ex) 
		{
				
			return false;
		}
			
			
		}
	public  boolean verifyIneligibleretentionamnt_bbcmanagementreport_approvecreen(String ReasonAmount){
		try{
		WebElement verifyIneligibilityAmountWebE=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(retentionamnt4_xpath));
		//Thread.sleep(100);
		String ActualAmount = verifyIneligibilityAmountWebE.getText();
		if(ActualAmount.equalsIgnoreCase(ReasonAmount))
		{
			System.out.println(ReasonAmount);
			return true;
			}
	else {
		return false;
	}
	}	
		catch (Exception ex) 
		{
				
			return false;
		}
			
			
		}
	public  boolean verifyIneligibleretention_ineligibletrendreportapproveScreen1(String ReasonData){
    	try{
    	WebElement verifyIneligibilityReasonWebE=new WebDriverWait(driver,10)
    	.until(ExpectedConditions.visibilityOfElementLocated(retention5_xpath));
    	//Thread.sleep(100);
    	String ActualReason = verifyIneligibilityReasonWebE.getText().trim();
    	if(ActualReason.equalsIgnoreCase(ReasonData))
    	{
    		System.out.println(ReasonData);
    		return true;
    		}
    else {
    	return false;
    }
    	}	
    	catch (Exception ex) 
    	{
    			
    		return false;
    	}
    		
    		
    	}
	public  boolean verifyIneligibleretention_ineligibletrendreportapproveScreen4(String ReasonData){
    	try{
    	WebElement verifyIneligibilityReasonWebE=new WebDriverWait(driver,10)
    	.until(ExpectedConditions.visibilityOfElementLocated(retentiontotal2_xpath));
    	//Thread.sleep(100);
    	String ActualReason = verifyIneligibilityReasonWebE.getText().trim();
    	if(ActualReason.equalsIgnoreCase(ReasonData))
    	{
    		System.out.println(ReasonData);
    		return true;
    		}
    else {
    	return false;
    }
    	}	
    	catch (Exception ex) 
    	{
    			
    		return false;
    	}
    		
    		
    	}

//	public  boolean verifyIneligibleretention_ineligibletrendreportapproveScreen3(String ReasonData){   	
	public  boolean verifyIneligibleretention_ineligibletrendreportapproveScreen(String ReasonData){
    	try{
    	WebElement verifyIneligibilityReasonWebE=new WebDriverWait(driver,10)
    	.until(ExpectedConditions.visibilityOfElementLocated(retention4_xpath));
    	//Thread.sleep(100);
    	String ActualReason = verifyIneligibilityReasonWebE.getText().trim();
    	if(ActualReason.equalsIgnoreCase(ReasonData))
    	{
    		System.out.println(ReasonData);
    		return true;
    		}
    else {
    	return false;
    }
    	}	
    	catch (Exception ex) 
    	{
    			
    		return false;
    	}
    		
    		
    	}
	public  boolean verifyIneligibleretentionamnt_ineligibletrendreport_approvecreen1(String ReasonAmount){
		try{
		WebElement verifyIneligibilityAmountWebE=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(retentionamnt8_xpath));
		//Thread.sleep(100);
		String ActualAmount = verifyIneligibilityAmountWebE.getText();
		if(ActualAmount.equalsIgnoreCase(ReasonAmount))
		{
			System.out.println(ReasonAmount);
			return true;
			}
	else {
		return false;
	}
	}	
		catch (Exception ex) 
		{
				
			return false;
		}
			
			
		}
	public  boolean verifyIneligibleretentionamnt_ineligibletrendreport_approvecreen3(String ReasonAmount){
		try{
		WebElement verifyIneligibilityAmountWebE=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(retentionamnt20_xpath));
		//Thread.sleep(100);
		String ActualAmount = verifyIneligibilityAmountWebE.getText();
		if(ActualAmount.equalsIgnoreCase(ReasonAmount))
		{
			System.out.println(ReasonAmount);
			return true;
			}
	else {
		return false;
	}
	}	
		catch (Exception ex) 
		{
				
			return false;
		}
			
			
		}
	public  boolean verifyIneligibleretentionamnt_ineligibletrendreport_approvecreen4(String ReasonAmount){
		try{
		WebElement verifyIneligibilityAmountWebE=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(retentionamnt23_xpath));
		//Thread.sleep(100);
		String ActualAmount = verifyIneligibilityAmountWebE.getText();
		if(ActualAmount.equalsIgnoreCase(ReasonAmount))
		{
			System.out.println(ReasonAmount);
			return true;
			}
	else {
		return false;
	}
	}	
		catch (Exception ex) 
		{
				
			return false;
		}

			
			
		}
	public  boolean verifyIneligibleretentionamnt_ineligibletrendreport_approvecreen2(String ReasonAmount){
		try{
		WebElement verifyIneligibilityAmountWebE=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(retentionamnt15_xpath));
		//Thread.sleep(100);
		String ActualAmount = verifyIneligibilityAmountWebE.getText();
		if(ActualAmount.equalsIgnoreCase(ReasonAmount))
		{
			System.out.println(ReasonAmount);
			return true;
			}
	else {
		return false;
	}
	}	
		catch (Exception ex) 
		{
				
			return false;
		}	
		}
	public  boolean verifyIneligibleExcludedamnt_BBCmanagementreport_unapprovecreen9(String ReasonAmount){
		try{


		WebElement verifyIneligibilityAmountWebE=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(excludeamnt19_xpath));
		//Thread.sleep(100);
		String ActualAmount = verifyIneligibilityAmountWebE.getText();
		if(ActualAmount.equalsIgnoreCase(ReasonAmount))
		{
			System.out.println(ReasonAmount);
			return true;
			}
	else {
		return false;
	}
	}	
		catch (Exception ex) 
		{
				
			return false;
		}	
		}
	public  boolean verifyIneligibleExcludedamnt_BBCmanagementreport_unapprovecreen8(String ReasonAmount){
		try{

		WebElement verifyIneligibilityAmountWebE=new WebDriverWait(driver,10)

		.until(ExpectedConditions.visibilityOfElementLocated(excludeamnt16_xpath));
		//Thread.sleep(100);
		String ActualAmount = verifyIneligibilityAmountWebE.getText();
		if(ActualAmount.equalsIgnoreCase(ReasonAmount))
		{
			System.out.println(ReasonAmount);
			return true;
			}
	else {
		return false;
	}
	}	
		catch (Exception ex) 
		{
				
			return false;
		}	
		}
	public  boolean verifyIneligibleExcludedamnt_BBCmanagementreport_unapprovecreen7(String ReasonAmount){
		try{

		WebElement verifyIneligibilityAmountWebE=new WebDriverWait(driver,10)

		.until(ExpectedConditions.visibilityOfElementLocated(excludeamnt12_xpath));
		//Thread.sleep(100);
		String ActualAmount = verifyIneligibilityAmountWebE.getText();
		if(ActualAmount.equalsIgnoreCase(ReasonAmount))
		{
			System.out.println(ReasonAmount);
			return true;
			}
	else {
		return false;
	}
	}	
		catch (Exception ex) 
		{
				
			return false;
		}	
}
	
	
	public  boolean verifyIneligibleretention_ineligibletrendreportapproveScreen3(String ReasonData){
        try{

        WebElement verifyIneligibilityReasonWebE=new WebDriverWait(driver,10)
        .until(ExpectedConditions.visibilityOfElementLocated(retentiontotal1_xpath));
        //Thread.sleep(100);
        String ActualReason = verifyIneligibilityReasonWebE.getText().trim();
        if(ActualReason.equalsIgnoreCase(ReasonData))
        {
            System.out.println(ReasonData);
            return true;
            }
    else {
        return false;
    }
        }   
        catch (Exception ex)
        {
               
            return false;
        }
           
           
        }
	public  boolean verifyIneligibleretentionamnt_ineligibletrendreport_approvecreen(String ReasonAmount){
		try{
		WebElement verifyIneligibilityAmountWebE=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(retentionamnt4_xpath));
		//Thread.sleep(100);
		String ActualAmount = verifyIneligibilityAmountWebE.getText();
		if(ActualAmount.equalsIgnoreCase(ReasonAmount))
		{
			System.out.println(ReasonAmount);
			return true;
			}
	else {
		return false;
	}
	}	
		catch (Exception ex) 
		{
				
			return false;
		}
			
			
		}
	public  boolean verifyIneligibleretention_BBCmanagementreportunapproveScreen1(String ReasonData){
    	try{
    	WebElement verifyIneligibilityReasonWebE=new WebDriverWait(driver,10)
    	.until(ExpectedConditions.visibilityOfElementLocated(retentiontotal_xpath));
    	//Thread.sleep(100);
    	String ActualReason = verifyIneligibilityReasonWebE.getText().trim();
    	if(ActualReason.equalsIgnoreCase(ReasonData))
    	{
    		System.out.println(ReasonData);
    		return true;
    		}
    else {
    	return false;
    }
    	}	
    	catch (Exception ex) 
    	{
    			
    		return false;
    	}
    		
    		
    	}
	
	public  boolean verifyIneligibleretention_BBCmanagementreportunapproveScreen(String ReasonData){
    	try{
    	WebElement verifyIneligibilityReasonWebE=new WebDriverWait(driver,10)
    	.until(ExpectedConditions.visibilityOfElementLocated(retention2_xpath));
    	//Thread.sleep(100);
    	String ActualReason = verifyIneligibilityReasonWebE.getText().trim();
    	if(ActualReason.equalsIgnoreCase(ReasonData))
    	{
    		System.out.println(ReasonData);
    		return true;
    		}
    else {
    	return false;
    }
    	}	
    	catch (Exception ex) 
    	{
    			
    		return false;
    	}
    		
    		
    	}
	public  boolean verifyIneligibleretentionamnt_BBCmanagementreport_unapprovecreen3(String ReasonAmount){
		try{

		WebElement verifyIneligibilityAmountWebE=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(retentionamnt18_xpath));
		//Thread.sleep(100);
		String ActualAmount = verifyIneligibilityAmountWebE.getText();
		if(ActualAmount.equalsIgnoreCase(ReasonAmount))
		{
			System.out.println(ReasonAmount);
			return true;
			}
	else {
		return false;
	}
		}
		catch (Exception ex) 
		{
				
			return false;
		}
		}		


	public  boolean verifyIneligibleretentionamnt_BBCmanagementreport_unapprovecreen2(String ReasonAmount){
		try{
		WebElement verifyIneligibilityAmountWebE=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(retentionamnt12_xpath));
		//Thread.sleep(100);
		String ActualAmount = verifyIneligibilityAmountWebE.getText();
		if(ActualAmount.equalsIgnoreCase(ReasonAmount))
		{
			System.out.println(ReasonAmount);
			return true;
			}
	else {
		return false;
	}
	}	
		catch (Exception ex) 
		{
				
			return false;
		}
			
			
		}
	public  boolean verifyIneligibleretentionamnt_BBCmanagementreport_unapprovecreen1(String ReasonAmount){
		try{
		WebElement verifyIneligibilityAmountWebE=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(retentionamnt6_xpath));
		//Thread.sleep(100);
		String ActualAmount = verifyIneligibilityAmountWebE.getText();
		if(ActualAmount.equalsIgnoreCase(ReasonAmount))
		{
			System.out.println(ReasonAmount);
			return true;
			}
	else {
		return false;
	}
	}	
		catch (Exception ex) 
		{
				
			return false;
		}
			
			
		}
	public  boolean verifyIneligibleretentionamnt_BBCmanagementreport_unapprovecreen(String ReasonAmount){
		try{
		WebElement verifyIneligibilityAmountWebE=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(retentionamnt4_xpath));
		//Thread.sleep(100);
		String ActualAmount = verifyIneligibilityAmountWebE.getText();
		if(ActualAmount.equalsIgnoreCase(ReasonAmount))
		{
			System.out.println(ReasonAmount);
			return true;
			}
	else {
		return false;
	}
	}	
		catch (Exception ex) 
		{
				
			return false;
		}
			
			
		}
	public  boolean verifyIneligibleretention_ineligiblereportbydebtorapproveScreen(String ReasonData){
    	try{
    	WebElement verifyIneligibilityReasonWebE=new WebDriverWait(driver,10)
    	.until(ExpectedConditions.visibilityOfElementLocated(retention3_xpath));
    	//Thread.sleep(100);
    	String ActualReason = verifyIneligibilityReasonWebE.getText().trim();
    	if(ActualReason.equalsIgnoreCase(ReasonData))
    	{
    		System.out.println(ReasonData);
    		return true;
    		}
    else {
    	return false;
    }
    	}	
    	catch (Exception ex) 
    	{
    			
    		return false;
    	}
    		
    		
    	}
	public  boolean verifyIneligibleretentionamnt_ineligiblereportbydebtor_approvecreen1(String ReasonAmount){
		try{
		WebElement verifyIneligibilityAmountWebE=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(retentionamnt7_xpath));
		//Thread.sleep(100);
		String ActualAmount = verifyIneligibilityAmountWebE.getText();
		if(ActualAmount.equalsIgnoreCase(ReasonAmount))
		{
			System.out.println(ReasonAmount);
			return true;
			}
	else {
		return false;
	}
	}	
		catch (Exception ex) 
		{
				
			return false;
		}
			
			
		}
	public  boolean verifyIneligibleretentionamnt_ineligiblereportbydebtor_approvecreen2(String ReasonAmount){
		try{
		WebElement verifyIneligibilityAmountWebE=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(retentionamnt14_xpath));
		//Thread.sleep(100);
		String ActualAmount = verifyIneligibilityAmountWebE.getText();
		if(ActualAmount.equalsIgnoreCase(ReasonAmount))
		{
			System.out.println(ReasonAmount);
			return true;
			}
	else {
		return false;
	}
	}	
		catch (Exception ex) 
		{
				
			return false;
		}
			
			
		}
	public  boolean verifyIneligibleretentionamnt_ineligiblereportbydebtor_approvecreen(String ReasonAmount){
		try{
		WebElement verifyIneligibilityAmountWebE=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(retentionamnt3_xpath));
		//Thread.sleep(100);
		String ActualAmount = verifyIneligibilityAmountWebE.getText();
		if(ActualAmount.equalsIgnoreCase(ReasonAmount))
		{
			System.out.println(ReasonAmount);
			return true;
			}
	else {
		return false;
	}
	}	
		catch (Exception ex) 
		{
				
			return false;
		}
			
			
		}
	public  boolean verifyIneligibleretention_ineligiblereportbydebtorunapproveScreen(String ReasonData){
    	try{
    	WebElement verifyIneligibilityReasonWebE=new WebDriverWait(driver,10)
    	.until(ExpectedConditions.visibilityOfElementLocated(retention3_xpath));
    	//Thread.sleep(100);
    	String ActualReason = verifyIneligibilityReasonWebE.getText().trim();
    	if(ActualReason.equalsIgnoreCase(ReasonData))
    	{
    		System.out.println(ReasonData);
    		return true;
    		}
    else {
    	return false;
    }
    	}	
    	catch (Exception ex) 
    	{
    			
    		return false;
    	}
  
    	}
	public  boolean verifyIneligibleretentionamnt_ineligiblereportbydebtor_unapprovecreen4(String ReasonAmount){
		try{
		WebElement verifyIneligibilityAmountWebE=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(retentionamnt17_xpath));
		//Thread.sleep(100);
		String ActualAmount = verifyIneligibilityAmountWebE.getText();
		if(ActualAmount.equalsIgnoreCase(ReasonAmount))
		{
			System.out.println(ReasonAmount);
			return true;
			}
	else {
		return false;
	}
	}	
		catch (Exception ex) 
		{
				
			return false;
		}
		}
	public  boolean verifyIneligibleretentionamnt_ineligiblereportbydebtor_unapprovecreen3(String ReasonAmount){
		try{
		WebElement verifyIneligibilityAmountWebE=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(retentionreason6_xpath));
		//Thread.sleep(100);
		String ActualAmount = verifyIneligibilityAmountWebE.getText();
		if(ActualAmount.equalsIgnoreCase(ReasonAmount))
		{
			System.out.println(ReasonAmount);
			return true;
			}
	else {
		return false;
	}
	}	
		catch (Exception ex) 
		{
				
			return false;
		}
			
			
		}
	public  boolean verifyIneligibleretentionamnt_ineligiblereportbydebtor_unapprovecreen2(String ReasonAmount){
		try{
		WebElement verifyIneligibilityAmountWebE=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(retentionamnt11_xpath));
		//Thread.sleep(100);
		String ActualAmount = verifyIneligibilityAmountWebE.getText();
		if(ActualAmount.equalsIgnoreCase(ReasonAmount))
		{
			System.out.println(ReasonAmount);
			return true;
			}
	else {
		return false;
	}
	}	
		catch (Exception ex) 
		{
				
			return false;
		}
			
			
		}
	public  boolean verifyIneligibleretentionamnt_ineligiblereportbydebtor_unapprovecreen1(String ReasonAmount){
		try{
		WebElement verifyIneligibilityAmountWebE=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(retentionamnt5_xpath));
		//Thread.sleep(100);
		String ActualAmount = verifyIneligibilityAmountWebE.getText();
		if(ActualAmount.equalsIgnoreCase(ReasonAmount))
		{
			System.out.println(ReasonAmount);
			return true;
			}
	else {
		return false;
	}
	}	
		catch (Exception ex) 
		{
				
			return false;
		}
			
			
		}
	public  boolean verifyIneligibleretentionamnt_ineligiblereportbydebtor_unapprovecreen(String ReasonAmount){
		try{
		WebElement verifyIneligibilityAmountWebE=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(retentionamnt3_xpath));
		//Thread.sleep(100);
		String ActualAmount = verifyIneligibilityAmountWebE.getText();
		if(ActualAmount.equalsIgnoreCase(ReasonAmount))
		{
			System.out.println(ReasonAmount);
			return true;
			}
	else {
		return false;
	}
	}	
		catch (Exception ex) 
		{
				
			return false;
		}
			
			
		}
	public  boolean verifyIneligibleretention_ineligiblereportbyreasonapproveScreen(String ReasonData){
    	try{
    	WebElement verifyIneligibilityReasonWebE=new WebDriverWait(driver,10)
    	.until(ExpectedConditions.visibilityOfElementLocated(retention2_xpath));
    	//Thread.sleep(100);
    	String ActualReason = verifyIneligibilityReasonWebE.getText().trim();
    	if(ActualReason.equalsIgnoreCase(ReasonData))
    	{
    		System.out.println(ReasonData);
    		return true;
    		}
    else {
    	return false;
    }
    	}	
    	catch (Exception ex) 
    	{
    			
    		return false;
    	}
    		
    		
    	}
	public  boolean verifyIneligibleretentionamnt_ineligiblereportbyreason_approvecreen(String ReasonAmount){
		try{
		WebElement verifyIneligibilityAmountWebE=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(retentionreason1_xpath));
		//Thread.sleep(100);
		String ActualAmount = verifyIneligibilityAmountWebE.getText();
		if(ActualAmount.equalsIgnoreCase(ReasonAmount))
		{
			System.out.println(ReasonAmount);
			return true;
			}
	else {
		return false;
	}
	}	
		catch (Exception ex) 
		{
				
			return false;
		}
			
			
		}
	public  boolean verifyIneligibleretentionamnt_ineligiblereportbyreason_approvecreen2(String ReasonAmount){
		try{
		WebElement verifyIneligibilityAmountWebE=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(retentionreason3_xpath));
		//Thread.sleep(100);
		String ActualAmount = verifyIneligibilityAmountWebE.getText();
		if(ActualAmount.equalsIgnoreCase(ReasonAmount))
		{
			System.out.println(ReasonAmount);
			return true;
			}
	else {
		return false;
	}
	}	
		catch (Exception ex) 
		{
				
			return false;
		}
			
			
		}
	public  boolean verifyIneligibleretentionamnt_ineligiblereportbyreason_approvecreen1(String ReasonAmount){
		try{
		WebElement verifyIneligibilityAmountWebE=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(retentionreason2_xpath));
		//Thread.sleep(100);
		String ActualAmount = verifyIneligibilityAmountWebE.getText();
		if(ActualAmount.equalsIgnoreCase(ReasonAmount))
		{
			System.out.println(ReasonAmount);
			return true;
			}
	else {
		return false;
	}
	}	
		catch (Exception ex) 
		{
				
			return false;
		}
			
			
		}
	public  boolean verifyIneligibleretention_ineligiblereportbyreasonunapproveScreen1(String ReasonData){
    	try{
    	WebElement verifyIneligibilityReasonWebE=new WebDriverWait(driver,10)
    	.until(ExpectedConditions.visibilityOfElementLocated(retentionreason5_xpath));
    	//Thread.sleep(100);
    	String ActualReason = verifyIneligibilityReasonWebE.getText().trim();
    	if(ActualReason.equalsIgnoreCase(ReasonData))
    	{
    		System.out.println(ReasonData);
    		return true;
    		}
    else {
    	return false;
    }
    	}	
    	catch (Exception ex) 
    	{
    			
    		return false;
    	}
    		
    		
    	}
	
	public  boolean verifyIneligibleretentionamnt_ineligiblereportbyreason_unapprovecreen3(String ReasonAmount){
		try{
		WebElement verifyIneligibilityAmountWebE=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(retentionamnt16_xpath));
		String ActualAmount = verifyIneligibilityAmountWebE.getText();
		if(ActualAmount.equalsIgnoreCase(ReasonAmount))
		{
			System.out.println(ReasonAmount);
			return true;
			}
	else {
		return false;
	}
	}	
		catch (Exception ex) 
		{
				
			return false;
		}
			
			
	}
	public  boolean verifyIneligibleexcludedamnt_bbcreport_unapprovecreen8(String ReasonAmount){
		try{
		WebElement verifyIneligibilityAmountWebE=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(excludedamnt17_xpath));
		//Thread.sleep(100);
		String ActualAmount = verifyIneligibilityAmountWebE.getText();
		if(ActualAmount.equalsIgnoreCase(ReasonAmount))
		{
			System.out.println(ReasonAmount);
			return true;
			}
	else {
		return false;
	}
	}	
		catch (Exception ex) 
		{
				
			return false;
		}
			
			
	}


	
	public  boolean verifyIneligibleexcludedamnt_bbcreport_unapprovecreen7(String ReasonAmount){
		try{
		WebElement verifyIneligibilityAmountWebE=new WebDriverWait(driver,20)
		.until(ExpectedConditions.visibilityOfElementLocated(excludedamnt14_xpath));
		//Thread.sleep(100);
		String ActualAmount = verifyIneligibilityAmountWebE.getText();
		if(ActualAmount.equalsIgnoreCase(ReasonAmount))
		{
			System.out.println(ReasonAmount);
			return true;
			}
	else {
		return false;
	}
	}	
		catch (Exception ex) 
		{
				
			return false;
		}
			
			
	}
	public  boolean verifyIneligibleretentionamnt_ineligiblereportbyreason_unapprovecreen2(String ReasonAmount){
		try{
		WebElement verifyIneligibilityAmountWebE=new WebDriverWait(driver,20)
		.until(ExpectedConditions.visibilityOfElementLocated(retenamnt2_xpath));
		//Thread.sleep(100);
		String ActualAmount = verifyIneligibilityAmountWebE.getText();
		if(ActualAmount.equalsIgnoreCase(ReasonAmount))
		{
			System.out.println(ReasonAmount);
			return true;
			}
	else {
		return false;
	}
	}	
		catch (Exception ex) 
		{
				
			return false;
		}
			
			
		}
	
	
	
	public  boolean verifyIneligibleexcludedamnt_bbcreport_approvecreen7(String ReasonAmount){
		try{
		WebElement verifyIneligibilityAmountWebE=new WebDriverWait(driver,20)
		.until(ExpectedConditions.visibilityOfElementLocated(excludeamnt17_xpath));
		//Thread.sleep(100);
		String ActualAmount = verifyIneligibilityAmountWebE.getText();
		if(ActualAmount.equalsIgnoreCase(ReasonAmount))
		{
			System.out.println(ReasonAmount);
			return true;
			}
	else {
		return false;
	}
	}	
		catch (Exception ex)
		{
				
			return false;
		}
			
			
		}
	public  boolean verifyIneligibleretentionamnt_ineligiblereportbyreason_unapprovecreen1(String ReasonAmount){
		try{
		WebElement verifyIneligibilityAmountWebE=new WebDriverWait(driver,20)
		.until(ExpectedConditions.visibilityOfElementLocated(retenamnt1_xpath));
		//Thread.sleep(100);
		String ActualAmount = verifyIneligibilityAmountWebE.getText();
		if(ActualAmount.equalsIgnoreCase(ReasonAmount))
		{
			System.out.println(ReasonAmount);
			return true;
			}
	else {
		return false;
	}
	}	
		catch (Exception ex) 
		{
				
			return false;
		}
			
			
		}
	public  boolean verifyIneligibleretentionamnt_ineligiblereportbyreason_unapprovecreen(String ReasonAmount){
		try{
		WebElement verifyIneligibilityAmountWebE=new WebDriverWait(driver,20)
		.until(ExpectedConditions.visibilityOfElementLocated(retenamnt_xpath));
		//Thread.sleep(100);
		String ActualAmount = verifyIneligibilityAmountWebE.getText();
		if(ActualAmount.equalsIgnoreCase(ReasonAmount))
		{
			System.out.println(ReasonAmount);
			return true;
			}
	else {
		return false;
	}
	}	
		catch (Exception ex) 
		{
				
			return false;
		}
			
			
		}
	
	public  boolean verifyIneligibleretention_bbcreportunapproveScreen1(String ReasonData){
    	try{
    	WebElement verifyIneligibilityReasonWebE=new WebDriverWait(driver,10)
    	.until(ExpectedConditions.visibilityOfElementLocated(retentionreason_xpath));
    	//Thread.sleep(100);
    	String ActualReason = verifyIneligibilityReasonWebE.getText().trim();
    	if(ActualReason.equalsIgnoreCase(ReasonData))
    	{
    		System.out.println(ReasonData);
    		return true;
    		}
    else {
    	return false;
    }
    	}	
    	catch (Exception ex) 
    	{
    			
    		return false;
    	}
    		
    		
    	}
	
	public  boolean verifyIneligibleretention_bbcreportunapproveScreen(String ReasonData){
    	try{
    	WebElement verifyIneligibilityReasonWebE=new WebDriverWait(driver,10)
    	.until(ExpectedConditions.visibilityOfElementLocated(retentionreason_xpath));
    	//Thread.sleep(100);
    	String ActualReason = verifyIneligibilityReasonWebE.getText().trim();
    	if(ActualReason.equalsIgnoreCase(ReasonData))
    	{
    		System.out.println(ReasonData);
    		return true;
    		}
    else {
    	return false;
    }
    	}	
    	catch (Exception ex) 
    	{
    			
    		return false;
    	}
    		
    		
    	}
	public  boolean verifyIneligibleretentionamnt_bbcmanareport_approvecreen2(String ReasonAmount){
		try{
		WebElement verifyIneligibilityAmountWebE=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(retentionamnt19_xpath));
		//Thread.sleep(100);
		String ActualAmount = verifyIneligibilityAmountWebE.getText();
		if(ActualAmount.equalsIgnoreCase(ReasonAmount))
		{
			System.out.println(ReasonAmount);
			return true;
			}
	else {
		return false;
	}
	}	
		catch (Exception ex) 
		{
				
			return false;
		}
			
			
		}
	public  boolean verifyIneligibleretentionamnt_bbcmanareport_approvecreen1(String ReasonAmount){
		try{
		WebElement verifyIneligibilityAmountWebE=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(retentionreason4_xpath));
		//Thread.sleep(100);
		String ActualAmount = verifyIneligibilityAmountWebE.getText();
		if(ActualAmount.equalsIgnoreCase(ReasonAmount))
		{
			System.out.println(ReasonAmount);
			return true;
			}
	else {
		return false;
	}
	}	
		catch (Exception ex) 
		{
				
			return false;
		}
			
			
		}
	public  boolean verifyIneligibleretentionamnt_bbcreport_unapprovecreen3(String ReasonAmount){
		try{
		WebElement verifyIneligibilityAmountWebE=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(retentionamnt22_xpath));
		//Thread.sleep(100);
		String ActualAmount = verifyIneligibilityAmountWebE.getText();
		if(ActualAmount.equalsIgnoreCase(ReasonAmount))
		{
			System.out.println(ReasonAmount);
			return true;
			}
	else {
		return false;
	}
	}	
		catch (Exception ex) 
		{
				
			return false;
		}
			
			
		}
	public  boolean verifyIneligibleretentionamnt_bbcreport_unapprovecreen2(String ReasonAmount){
		try{
		WebElement verifyIneligibilityAmountWebE=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(retentionamnt21_xpath));
		//Thread.sleep(100);
		String ActualAmount = verifyIneligibilityAmountWebE.getText();
		if(ActualAmount.equalsIgnoreCase(ReasonAmount))
		{
			System.out.println(ReasonAmount);
			return true;
			}
	else {
		return false;
	}
	}	
		catch (Exception ex) 
		{
				
			return false;
		}
			
			
		}
	public  boolean verifyIneligibleretentionamnt_bbcmanareport_unapprovecreen2(String ReasonAmount){
		try{
		WebElement verifyIneligibilityAmountWebE=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(retentionamnt10_xpath));
		//Thread.sleep(100);
		String ActualAmount = verifyIneligibilityAmountWebE.getText();
		if(ActualAmount.equalsIgnoreCase(ReasonAmount))
		{
			System.out.println(ReasonAmount);
			return true;
			}
	else {
		return false;
	}
	}	
		catch (Exception ex) 
		{
				
			return false;
		}
			
			
		}
	
	public  boolean verifyIneligibleretentionamnt_bbcreport_approvecreen(String ReasonAmount){
		try{
		WebElement verifyIneligibilityAmountWebE=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(retentionamnt13_xpath));
		//Thread.sleep(100);
		String ActualAmount = verifyIneligibilityAmountWebE.getText();
		if(ActualAmount.equalsIgnoreCase(ReasonAmount))
		{
			System.out.println(ReasonAmount);
			return true;
			}
	else {
		return false;
	}
	}	
		catch (Exception ex) 
		{
				
			return false;
		}
			
			
		}
	public  boolean verifyIneligibleretentionamnt_bbcmanareport_unapprovecreen(String ReasonAmount){
		try{
		WebElement verifyIneligibilityAmountWebE=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(retentionamnt_xpath));
		//Thread.sleep(100);
		String ActualAmount = verifyIneligibilityAmountWebE.getText();
		if(ActualAmount.equalsIgnoreCase(ReasonAmount))
		{
			System.out.println(ReasonAmount);
			return true;
			}
	else {
		return false;
	}
	}	
		catch (Exception ex) 
		{
				
			return false;
		}
			
			
		}
	public  boolean verifyIneligibleretentionamnt_bbcmanareport_unapprovecreen1(String ReasonAmount){
		try{
		WebElement verifyIneligibilityAmountWebE=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(retentionamnt1_xpath));
		//Thread.sleep(100);
		String ActualAmount = verifyIneligibilityAmountWebE.getText();
		if(ActualAmount.equalsIgnoreCase(ReasonAmount))
		{
			System.out.println(ReasonAmount);
			return true;
			}
	else {
		return false;
	}
	}	
		catch (Exception ex) 
		{
				
			return false;
		}
			
			
		}
	
	public  boolean verifyIneligibilityreason_bbcreportunapproveScreen2(String ReasonData){
    	try{
    	WebElement verifyIneligibilityReasonWebE=new WebDriverWait(driver,10)
    	.until(ExpectedConditions.visibilityOfElementLocated(reason_xpath));
    	//Thread.sleep(100);
    	String ActualReason = verifyIneligibilityReasonWebE.getText().trim();
    	if(ActualReason.equalsIgnoreCase(ReasonData))
    	{
    		System.out.println(ReasonData);
    		return true;
    		}
    else {
    	return false;
    }
    	}	
    	catch (Exception ex) 
    	{
    			
    		return false;
    	}
    		
    		
    	}
	public  boolean verifyIneligibilityamnt_bbcmanareport_approvecreen1(String ReasonAmount){
		try{
		WebElement verifyIneligibilityAmountWebE=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(inelamnt1_xpath));
		//Thread.sleep(100);
		String ActualAmount = verifyIneligibilityAmountWebE.getText();
		if(ActualAmount.equalsIgnoreCase(ReasonAmount))
		{
			System.out.println(ReasonAmount);
			return true;
			}
	else {
		return false;
	}
	}	
		catch (Exception ex) 
		{
				
			return false;
		}
			
			
		}
	public  boolean verifyIneligibilityreason_bbcmanareportunapproveScreen1(String ReasonData){
    	try{
    	WebElement verifyIneligibilityReasonWebE=new WebDriverWait(driver,10)
    	.until(ExpectedConditions.visibilityOfElementLocated(reason4_xpath));
    	//Thread.sleep(100);
    	String ActualReason = verifyIneligibilityReasonWebE.getText().trim();
    	if(ActualReason.equalsIgnoreCase(ReasonData))
    	{
    		System.out.println(ReasonData);
    		return true;
    		}
    else {
    	return false;
    }
    	}	
    	catch (Exception ex) 
    	{
    			
    		return false;
    	}
    		
    		
    	}
	public  boolean verifyIneligibilityamnt_inelireport_approvecreen1(String ReasonAmount){
		try{
		WebElement verifyIneligibilityAmountWebE=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(value_xpath));
		//Thread.sleep(100);
		String ActualAmount = verifyIneligibilityAmountWebE.getText();
		if(ActualAmount.equalsIgnoreCase(ReasonAmount))
		{
			System.out.println(ReasonAmount);
			return true;
			}
	else {
		return false;
	}
	}	
		catch (Exception ex) 
		{
				
			return false;
		}
			
			
		}
	public  boolean verifyIneligibilityreason_inelireportunapproveScreen1(String ReasonData){
    	try{
    	WebElement verifyIneligibilityReasonWebE=new WebDriverWait(driver,10)
    	.until(ExpectedConditions.visibilityOfElementLocated(total3_xpath));
    	//Thread.sleep(100);
    	String ActualReason = verifyIneligibilityReasonWebE.getText().trim();
    	if(ActualReason.equalsIgnoreCase(ReasonData))
    	{
    		System.out.println(ReasonData);
    		return true;
    		}
    else {
    	return false;
    }
    	}	
    	catch (Exception ex) 
    	{
    			
    		return false;
    	}
    		
    		
    	}
	public  boolean verifyIneligibilityamnt_bbcreport_approvecreen1(String ReasonAmount){
		try{
		WebElement verifyIneligibilityAmountWebE=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(inelamnt_xpath));
		//Thread.sleep(100);
		String ActualAmount = verifyIneligibilityAmountWebE.getText();
		if(ActualAmount.equalsIgnoreCase(ReasonAmount))
		{
			System.out.println(ReasonAmount);
			return true;
			}
	else {
		return false;
	}
	}	
		catch (Exception ex) 
		{
				
			return false;
		}
			
			
		}
	public  boolean verifyIneligibilityreason_bbcreportunapproveScreen1(String ReasonData){
    	try{
    	WebElement verifyIneligibilityReasonWebE=new WebDriverWait(driver,10)
    	.until(ExpectedConditions.visibilityOfElementLocated(eligibleAR_xpath));
    	//Thread.sleep(100);
    	String ActualReason = verifyIneligibilityReasonWebE.getText().trim();
    	if(ActualReason.equalsIgnoreCase(ReasonData))
    	{
    		System.out.println(ReasonData);
    		return true;
    		}
    else {
    	return false;
    }
    	}	
    	catch (Exception ex) 
    	{
    			
    		return false;
    	}
    		
    		
    	}
	public  boolean verifyIneligibilityamnt_ineligiblereport_approvecreen(String ReasonAmount){
		try{
		WebElement verifyIneligibilityAmountWebE=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(total2_xpath));
		//Thread.sleep(100);
		String ActualAmount = verifyIneligibilityAmountWebE.getText();
		if(ActualAmount.equalsIgnoreCase(ReasonAmount))
		{
			System.out.println(ReasonAmount);
			return true;
			}
	else {
		return false;
	}
	}	
		catch (Exception ex) 
		{
				
			return false;
		}
			
			
		}
	public  boolean verifyIneligibilityreason_ineligiblereportunapproveScreen(String ReasonData){
    	try{
    	WebElement verifyIneligibilityReasonWebE=new WebDriverWait(driver,10)
    	.until(ExpectedConditions.visibilityOfElementLocated(reason3_xpath));
    	//Thread.sleep(100);
    	String ActualReason = verifyIneligibilityReasonWebE.getText().trim();
    	if(ActualReason.equalsIgnoreCase(ReasonData))
    	{
    		System.out.println(ReasonData);
    		return true;
    		}
    else {
    	return false;
    }
    	}	
    	catch (Exception ex) 
    	{
    			
    		return false;
    	}
    		
    		
    	}
	public  boolean verifyIneligibilityamnt_bbcreport_approvecreen(String ReasonAmount){
		try{
		WebElement verifyIneligibilityAmountWebE=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(inelamnt_xpath));
		//Thread.sleep(100);
		String ActualAmount = verifyIneligibilityAmountWebE.getText();
		if(ActualAmount.equalsIgnoreCase(ReasonAmount))
		{
			System.out.println(ReasonAmount);
			return true;
			}
	else {
		return false;
	}
	}	
		catch (Exception ex) 
		{
				
			return false;
		}
			
			
		}
	public  boolean verifyIneligibilityreason_bbcmanagementreportunapproveScreen(String ReasonData){
    	try{
    	WebElement verifyIneligibilityReasonWebE=new WebDriverWait(driver,10)
    	.until(ExpectedConditions.visibilityOfElementLocated(ineligibleGrandTotal_xpath));
    	//Thread.sleep(100);
    	String ActualReason = verifyIneligibilityReasonWebE.getText().trim();
    	if(ActualReason.equalsIgnoreCase(ReasonData))
    	{
    		System.out.println(ReasonData);
    		return true;
    		}
    else {
    	return false;
    }
    	}	
    	catch (Exception ex) 
    	{
    			
    		return false;
    	}
    		
    		
    	}

	public  boolean verifyIneligibilityamnt_managementreportunapproveScreen(String ReasonAmount){
    	try{
    	WebElement verifyIneligibilityReasonWebE=new WebDriverWait(driver,10)
    	.until(ExpectedConditions.visibilityOfElementLocated(ineliamnt1_xpath));
    	//Thread.sleep(100);
    	String ActualReason = verifyIneligibilityReasonWebE.getText().trim();
    	if(ActualReason.equalsIgnoreCase(ReasonAmount))
    	{
    		System.out.println(ReasonAmount);
    		return true;
    		}
    else {
    	return false;
    }
    	}	
    	catch (Exception ex) 
    	{
    			
    		return false;
    	}
    		
    		
    	}

	public  boolean verifyIneligibilityreason_inelianyalysisreportbydebtorunapproveScreen(String ReasonData){
    	try{
    	WebElement verifyIneligibilityReasonWebE=new WebDriverWait(driver,10)
    	.until(ExpectedConditions.visibilityOfElementLocated(total2_xpath));
    	//Thread.sleep(100);
    	String ActualReason = verifyIneligibilityReasonWebE.getText().trim();
    	if(ActualReason.equalsIgnoreCase(ReasonData))
    	{
    		System.out.println(ReasonData);
    		return true;
    		}
    else {
    	return false;
    }
    	}	
    	catch (Exception ex) 
    	{
    			
    		return false;
    	}
    		
    		
    	}
        

    	public  boolean verifyIneligibilityamnt_ineliganalysisreportbydebtor_unapprovecreen(String ReasonAmount){
    		try{
    		WebElement verifyIneligibilityAmountWebE=new WebDriverWait(driver,10)
    		.until(ExpectedConditions.visibilityOfElementLocated(value_xpath));
    		//Thread.sleep(100);
    		String ActualAmount = verifyIneligibilityAmountWebE.getText();
    		if(ActualAmount.equalsIgnoreCase(ReasonAmount))
    		{
    			System.out.println(ReasonAmount);
    			return true;
    			}
    	else {
    		return false;
    	}
    	}	
    		catch (Exception ex) 
    		{
    				
    			return false;
    		}
    			
    			
    		}
	public  boolean verifyIneligibilityreason_inelianyalysisreportunapproveScreen(String ReasonData){
    	try{
    	WebElement verifyIneligibilityReasonWebE=new WebDriverWait(driver,10)
    	.until(ExpectedConditions.visibilityOfElementLocated(reason3_xpath));
    	//Thread.sleep(100);
    	String ActualReason = verifyIneligibilityReasonWebE.getText().trim();
    	if(ActualReason.equalsIgnoreCase(ReasonData))
    	{
    		System.out.println(ReasonData);
    		return true;
    		}
    else {
    	return false;
    }
    	}	
    	catch (Exception ex) 
    	{
    			
    		return false;
    	}
    		
    		
    	}
        

    	public  boolean verifyIneligibilityamnt_ineliganalysisreport_unapprovecreen(String ReasonAmount){
    		try{
    		WebElement verifyIneligibilityAmountWebE=new WebDriverWait(driver,10)
    		.until(ExpectedConditions.visibilityOfElementLocated(value1_xpath));
    		//Thread.sleep(100);
    		String ActualAmount = verifyIneligibilityAmountWebE.getText();
    		if(ActualAmount.equalsIgnoreCase(ReasonAmount))
    		{
    			System.out.println(ReasonAmount);
    			return true;
    			}
    	else {
    		return false;
    	}
    	}	
    		catch (Exception ex) 
    		{
    				
    			return false;
    		}
    			
    			
    		}
	public  boolean verifyIneligibilityreason_bbcreportunapproveScreen(String ReasonData){
    	try{
    	WebElement verifyIneligibilityReasonWebE=new WebDriverWait(driver,10)
    	.until(ExpectedConditions.visibilityOfElementLocated(eligibleAR_xpath));
    	//Thread.sleep(100);
    	String ActualReason = verifyIneligibilityReasonWebE.getText().trim();
    	if(ActualReason.equalsIgnoreCase(ReasonData))
    	{
    		System.out.println(ReasonData);
    		return true;
    		}
    else {
    	return false;
    }
    	}	
    	catch (Exception ex) 
    	{
    			
    		return false;
    	}
    		
    		
    	}
        

    	public  boolean verifyIneligibilityamnt_bbcreport_unapprovecreen(String ReasonAmount){
    		try{
    		WebElement verifyIneligibilityAmountWebE=new WebDriverWait(driver,10)
    		.until(ExpectedConditions.visibilityOfElementLocated(ineliamnt_xpath));
    		//Thread.sleep(100);
    		String ActualAmount = verifyIneligibilityAmountWebE.getText();
    		if(ActualAmount.equalsIgnoreCase(ReasonAmount))
    		{
    			System.out.println(ReasonAmount);
    			return true;
    			}
    	else {
    		return false;
    	}
    	}	
    		catch (Exception ex) 
    		{
    				
    			return false;
    		}
    			
    			
    		}
	public  boolean verifyIneligibilityreason_bbcmanagementreportapproveScreen(String ReasonData){
    	try{
    	WebElement verifyIneligibilityReasonWebE=new WebDriverWait(driver,10)
    	.until(ExpectedConditions.visibilityOfElementLocated(reason_xpath));
    	//Thread.sleep(100);
    	String ActualReason = verifyIneligibilityReasonWebE.getText().trim();
    	if(ActualReason.equalsIgnoreCase(ReasonData))
    	{
    		System.out.println(ReasonData);
    		return true;
    		}
    else {
    	return false;
    }
    	}	
    	catch (Exception ex) 
    	{
    			
    		return false;
    	}
    		
    		
    	}
        

    	public  boolean verifyIneligibilityamnt_bbcmanegementreport_approvecreen(String ReasonAmount){
    		try{
    		WebElement verifyIneligibilityAmountWebE=new WebDriverWait(driver,10)
    		.until(ExpectedConditions.visibilityOfElementLocated(amnt2_xpath));
    		//Thread.sleep(100);
    		String ActualAmount = verifyIneligibilityAmountWebE.getText();
    		if(ActualAmount.equalsIgnoreCase(ReasonAmount))
    		{
    			System.out.println(ReasonAmount);
    			return true;
    			}
    	else {
    		return false;
    	}
    	}	
    		catch (Exception ex) 
    		{
    				
    			return false;
    		}
    			
    			
    		}
	public  boolean verifyIneligibilityreason_ineltrendreportapproveScreen(String ReasonData){
    	try{
    	WebElement verifyIneligibilityReasonWebE=new WebDriverWait(driver,10)
    	.until(ExpectedConditions.visibilityOfElementLocated(reason_xpath));
    	//Thread.sleep(100);
    	String ActualReason = verifyIneligibilityReasonWebE.getText().trim();
    	if(ActualReason.equalsIgnoreCase(ReasonData))
    	{
    		System.out.println(ReasonData);
    		return true;
    		}
    else {
    	return false;
    }
    	}	
    	catch (Exception ex) 
    	{
    			
    		return false;
    	}
    		
    		
    	}
	public  boolean verifyIneligibleexcludedamnt_ineligiblereportbyreason_unapprovecreen7(String ReasonAmount){
		try{

		WebElement verifyIneligibilityAmountWebE=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(excludeamnt18_xpath));
		//Thread.sleep(100);
		String ActualAmount = verifyIneligibilityAmountWebE.getText();
		if(ActualAmount.equalsIgnoreCase(ReasonAmount))
		{
			System.out.println(ReasonAmount);
			return true;
			}
	else {
		return false;
	}
	}	
		catch (Exception ex) 
		{
				
			return false;
		}
			
			
		}
	public  boolean verifyIneligibleexcludedamnt_ineligiblereportbyreason_unapprovecreen6(String ReasonAmount){
		try{

		WebElement verifyIneligibilityAmountWebE=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(excludeamnt15_xpath));
		//Thread.sleep(100);
		String ActualAmount = verifyIneligibilityAmountWebE.getText();
		if(ActualAmount.equalsIgnoreCase(ReasonAmount))
		{
			System.out.println(ReasonAmount);
			return true;
			}
	else {
		return false;
	}
	}	
		catch (Exception ex) 
		{
				
			return false;
		}
			
			
		}

    	public  boolean verifyIneligibilityamnt_inelitrendreport_approvecreen(String ReasonAmount){
    		try{
    		WebElement verifyIneligibilityAmountWebE=new WebDriverWait(driver,10)
    		.until(ExpectedConditions.visibilityOfElementLocated(amnt2_xpath));
    		//Thread.sleep(100);
    		String ActualAmount = verifyIneligibilityAmountWebE.getText();
    		if(ActualAmount.equalsIgnoreCase(ReasonAmount))
    		{
    			System.out.println(ReasonAmount);
    			return true;
    			}
    	else {
    		return false;
    	}
    	}	
    		catch (Exception ex) 
    		{
    				
    			return false;
    		}
    			
    			
    		}
	public  boolean verifyIneligibilityreasonbydebtorreportapproveScreen(String ReasonData){
    	try{
    	WebElement verifyIneligibilityReasonWebE=new WebDriverWait(driver,10)
    	.until(ExpectedConditions.visibilityOfElementLocated(reason1_xpath));
    	//Thread.sleep(100);
    	String ActualReason = verifyIneligibilityReasonWebE.getText().trim();
    	if(ActualReason.equalsIgnoreCase(ReasonData))
    	{
    		System.out.println(ReasonData);
    		return true;
    		}
    else {
    	return false;
    }
    	}	
    	catch (Exception ex) 
    	{
    			
    		return false;
    	}
    		
    		
    	}
        

    	public  boolean verifyIneligibilityamntineligiblereportbydebtorapprovecreen(String ReasonAmount){
    		try{
    		WebElement verifyIneligibilityAmountWebE=new WebDriverWait(driver,10)
    		.until(ExpectedConditions.visibilityOfElementLocated(ineligibleamnt2_xpath));
    		//Thread.sleep(100);
    		String ActualAmount = verifyIneligibilityAmountWebE.getText();
    		if(ActualAmount.equalsIgnoreCase(ReasonAmount))
    		{
    			System.out.println(ReasonAmount);
    			return true;
    			}
    	else {
    		return false;
    	}
    	}	
    		catch (Exception ex) 
    		{
    				
    			return false;
    		}
    			
    			
    		}
	    

	public  boolean verifyIneligibilityreasonbbcreportapproveScreen(String ReasonData){
    	try{
    	WebElement verifyIneligibilityReasonWebE=new WebDriverWait(driver,10)
    	.until(ExpectedConditions.visibilityOfElementLocated(reason_xpath));
    	//Thread.sleep(100);
    	String ActualReason = verifyIneligibilityReasonWebE.getText().trim();
    	if(ActualReason.equalsIgnoreCase(ReasonData))
    	{
    		System.out.println(ReasonData);
    		return true;
    		}
    else {
    	return false;
    }
    	}	
    	catch (Exception ex) 
    	{
    			
    		return false;
    	}
    		
    		
    	}
        

    	public  boolean verifyIneligibilityamntbbcreportapprovecreen(String ReasonAmount){
    		try{
    		WebElement verifyIneligibilityAmountWebE=new WebDriverWait(driver,10)
    		.until(ExpectedConditions.visibilityOfElementLocated(amnt_xpath));
    		//Thread.sleep(100);
    		String ActualAmount = verifyIneligibilityAmountWebE.getText();
    		if(ActualAmount.equalsIgnoreCase(ReasonAmount))
    		{
    			System.out.println(ReasonAmount);
    			return true;
    			}
    	else {
    		return false;
    	}
    	}	
    		catch (Exception ex) 
    		{
    				
    			return false;
    		}
    			
    			
    		}
	 public  boolean verifyIneligibilityreasonbbcreportScreen(String ReasonData){
	    	try{
	    	WebElement verifyIneligibilityReasonWebE=new WebDriverWait(driver,10)
	    	.until(ExpectedConditions.visibilityOfElementLocated(reason_xpath));
	    	//Thread.sleep(100);
	    	String ActualReason = verifyIneligibilityReasonWebE.getText().trim();
	    	if(ActualReason.equalsIgnoreCase(ReasonData))
	    	{
	    		System.out.println(ReasonData);
	    		return true;
	    		}
	    else {
	    	return false;
	    }
	    	}	
	    	catch (Exception ex) 
	    	{
	    			
	    		return false;
	    	}
	    		
	    		
	    	}
	        

	    	public  boolean verifyIneligibilityamntbbcreportcreen(String ReasonAmount){
	    		try{
	    		WebElement verifyIneligibilityAmountWebE=new WebDriverWait(driver,10)
	    		.until(ExpectedConditions.visibilityOfElementLocated(amnt_xpath));
	    		//Thread.sleep(100);
	    		String ActualAmount = verifyIneligibilityAmountWebE.getText();
	    		if(ActualAmount.equalsIgnoreCase(ReasonAmount))
	    		{
	    			System.out.println(ReasonAmount);
	    			return true;
	    			}
	    	else {
	    		return false;
	    	}
	    	}	
	    		catch (Exception ex) 
	    		{
	    				
	    			return false;
	    		}
	    			
	    			
	    		}
	    	 public  boolean verifyIneligibilityreasonineligibleanaysisreportScreen(String ReasonData){
	 	    	try{
	 	    	WebElement verifyIneligibilityReasonWebE=new WebDriverWait(driver,10)
	 	    	.until(ExpectedConditions.visibilityOfElementLocated(reason1_xpath));
	 	    	//Thread.sleep(100);
	 	    	String ActualReason = verifyIneligibilityReasonWebE.getText().trim();
	 	    	if(ActualReason.equalsIgnoreCase(ReasonData))
	 	    	{
	 	    		System.out.println(ReasonData);
	 	    		return true;
	 	    		}
	 	    else {
	 	    	return false;
	 	    }
	 	    	}	
	 	    	catch (Exception ex) 
	 	    	{
	 	    			
	 	    		return false;
	 	    	}
	 	    		
	 	    		
	 	    	}
	 	        

	 	    	public  boolean verifyIneligibilityamntineligibleanalysisreportcreen(String ReasonAmount){
	 	    		try{
	 	    		WebElement verifyIneligibilityAmountWebE=new WebDriverWait(driver,10)
	 	    		.until(ExpectedConditions.visibilityOfElementLocated(ineligibleamnt2_xpath));
	 	    		//Thread.sleep(100);
	 	    		String ActualAmount = verifyIneligibilityAmountWebE.getText();
	 	    		if(ActualAmount.equalsIgnoreCase(ReasonAmount))
	 	    		{
	 	    			System.out.println(ReasonAmount);
	 	    			return true;
	 	    			}
	 	    	else {
	 	    		return false;
	 	    	}
	 	    	}	
	 	    		catch (Exception ex) 
	 	    		{
	 	    				
	 	    			return false;
	 	    		}
	 	    			
	 	    			
	 	    		}
	public boolean clickBBCReport()
	{
		try{

			WebElement clickRemoveAllIconWebEelement=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(bbcReport_xpath));
			clickRemoveAllIconWebEelement.click();
			Set <String> handles =driver.getWindowHandles();
			Iterator<String> it = handles.iterator();
			//iterate through your windows
			while (it.hasNext()){
			String newwin = it.next();
			String parent = it.next();
			driver.switchTo().window(newwin);
			
			//Thread.sleep(2000);
			
	return true;
		}
		}
		catch(Exception ex){
			
		}
		return false;
}
	
	public boolean clickBBCReport1()
	{
		try{

			WebElement clickRemoveAllIconWebEelement=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(bbcReport_xpath));
			clickRemoveAllIconWebEelement.click();
		
	return true;
		}
		catch(Exception ex){
			
		}
		return false;
}
	
	
	public boolean clickIneligibleReceivableAnalysis()
	{
		try{

			WebElement clickRemoveAllIconWebEelement=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(ineligibleReceivableAnalysis_xpath));
			clickRemoveAllIconWebEelement.click();
			Set <String> handles =driver.getWindowHandles();
			Iterator<String> it = handles.iterator();
			//iterate through your windows
			while (it.hasNext()){
			String parent = it.next();
			String newwin = it.next();
			driver.switchTo().window(newwin);
			//Thread.sleep(2000);
			
	return true;
		}}
		catch(Exception ex){
			
		}
		return false;
}
	
	public boolean clickHTMLButton()
	{
		try{

			WebElement clickRemoveAllIconWebEelement=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(htmlButton_xpath));
			clickRemoveAllIconWebEelement.click();
			//Thread.sleep(2000);
			
	return true;
		}
		catch(Exception ex){
			return false;
		}
}
	public boolean concentrationValueInReport()
	{
		String winHandleBefore = driver.getWindowHandle();
	for(String winHandle : driver.getWindowHandles()){
		System.out.println("!!!!!!!!!!!"+winHandleBefore);
	    driver.switchTo().window(winHandle);
	}

	// Perform the actions on new window
	try{

		WebElement concentrationText=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(concentrationTextReport_xpath));
		
		WebElement concentrationValue=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(concentrationTextReportValue_xpath));
		//Thread.sleep(2000);
return true;
	}
	catch(Exception ex){
		return false;
	}
	// Close the new window, if that window no more required


	// Switch back to original browser (first window)
	//driver.switchTo().window(winHandleBefore);

}

	public boolean ineligibleReceivableAnalysisdropdownValues(String dataFileTypeDropdownValue) {
		try {
			WebElement ineligibleReceivableAnalysisdropdownValuesWebEelement = new WebDriverWait(
					driver, 10).until(ExpectedConditions
					.visibilityOfElementLocated(ineligibleReceivableAnalysisGroupBy_xpath));
			Select sel = new Select(ineligibleReceivableAnalysisdropdownValuesWebEelement);
			sel.selectByVisibleText(dataFileTypeDropdownValue);
			/*List<WebElement> list = sel.getOptions();
			for (WebElement ele : list) {
				if (ele.getText().equals(dataFileTypeDropdownValue)) {
					ele.click();
					//Thread.sleep(10000);
					return true;
				
				}
			}*/
			return true;
		} catch (Exception ex) {
		}
		return false;
	}

	
	public  boolean ClickonGroupbyDropdown(String GropuBy) {
		try {
			WebElement DropdownWebEelement = new WebDriverWait(driver, 10)
			.until(ExpectedConditions.visibilityOfElementLocated(ClickonGroupbyDropdown_Xpath));
			Select sel = new Select(DropdownWebEelement);
			sel.selectByVisibleText(GropuBy);
			/*List<WebElement> list = sel.getOptions();
			
			for (WebElement ele : list) 
			{
				String data = ele.getText();
				System.out.println(data);
				if (ele.getText().equals(GropuBy)) 
				{
			 		ele.click();
					////Thread.sleep(10000);
					
					 return true;
				}
			}*/
			return true;
		} 
		catch (Exception ex)
		{
			return false;
		}
		
		

	}
	
	
	public boolean ineligibleReceivableAnalysisdropdownValues1(String visibleTexts) {
		try {
			WebElement ineligibleReceivableAnalysisdropdownValuesWebEelement = new WebDriverWait(
					driver, 10).until(ExpectedConditions
					.visibilityOfElementLocated(display_xpath));
			Select sel = new Select(ineligibleReceivableAnalysisdropdownValuesWebEelement);
			sel.selectByVisibleText(visibleTexts);
			/*List<WebElement> list = sel.getOptions();
			for (WebElement ele : list) {
				if (ele.getText().equals(visibleTexts)) {
					ele.click();
					//Thread.sleep(10000);
					break;
				}
			}*/
			return true;
		} catch (Exception ex) {
			
		}
		return false;
	}

	
	
	//Summary
	public boolean receivableAgedTrialBalance()
	{
		try{

			WebElement receivableAgedTrailWebEelement=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(receivableAgedTrialBalance_xpath));
			receivableAgedTrailWebEelement.click();
			
		Thread.sleep(500);
			
	return true;
			}
		
	
		catch(Exception ex){
			
		}
		return false;
}
	
	public boolean bbcDropdownValues(String bbcDropdownValue) {
		try {
			//Thread.sleep(2000);
			WebElement bbcDropdownWebEelement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(bbcDate_xpath));
			Select sel = new Select(bbcDropdownWebEelement);
			sel.selectByVisibleText(bbcDropdownValue);
			/*List<WebElement> list = sel.getOptions();
			for (WebElement ele : list) {
				if (ele.getText().equals(bbcDropdownValue)) {
					ele.click();
					////Thread.sleep(5000);
					break;
				}
			}*/
			return true;} 
		catch (Exception ex) {
		}
		return false;
	}
	
	//rohit
	
	public boolean bbcDropdownValues2(String bbcDropdownValue) {
		try {
			WebElement bbcDropdownWebEelement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(bbcDate_xpath));
			Select sel = new Select(bbcDropdownWebEelement);			
			sel.selectByVisibleText(bbcDropdownValue);
			Thread.sleep(1000);
			sel.selectByVisibleText("Unreleased");
			Thread.sleep(1000);
			sel.selectByVisibleText(bbcDropdownValue);
			Thread.sleep(1000);
			return true;} 
		catch (Exception ex) {
		}
		return false;
	}
	
	
	public boolean bbcDropdownValues1(String bbcDropdownValue) {
		try {
			WebElement bbcDropdownWebEelement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(bbcDate_xpath));
			Select sel = new Select(bbcDropdownWebEelement);			
			List<WebElement> list = sel.getOptions();
			for (WebElement ele : list) {
				if (ele.getText().equals(bbcDropdownValue)) {
					ele.click();
					break;
				}
			}
			Thread.sleep(1000);
			return true;} 
		catch (Exception ex) {
		}
		return false;
	}
	
	public boolean styleDropdownValues(String styleDropdownValue) {
		try {
			WebElement styleDropdownWebEelement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(style_xpath));
			Select sel = new Select(styleDropdownWebEelement);
			sel.selectByVisibleText(styleDropdownValue);
			/*List<WebElement> list = sel.getOptions();
			for (WebElement ele : list) {
				if (ele.getText().equals(styleDropdownValue)) {
					ele.click();
					////Thread.sleep(5000);
					break;
				}
			}*/
			return true;} 
		catch (Exception ex) {
		}
		return false;
	}
	
	public boolean styleDropdownValues1(String styleDropdownValue) {
		try {
			WebElement styleDropdownWebEelement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(style_xpath));
			Select sel = new Select(styleDropdownWebEelement);
			List<WebElement> list = sel.getOptions();
			for (WebElement ele : list) {
				if (ele.getText().equals(styleDropdownValue)) {
					ele.click();
					////Thread.sleep(5000);
					break;
				}
			}
			return true;} 
		catch (Exception ex) {
		}
		return false;
	}
	
	
	public boolean recievableBalanceDropdownValues(String receivableBalDropdownValue) {
		try {
			WebElement recivableDropdownWebEelement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(receivables_xpath));
			Select sel = new Select(recivableDropdownWebEelement);
			sel.selectByVisibleText(receivableBalDropdownValue);
			/*List<WebElement> list = sel.getOptions();
			for (WebElement ele : list) {
				if (ele.getText().equals(receivableBalDropdownValue)) {
					ele.click();
					////Thread.sleep(5000);
					break;
				}
			}*/
			return true;} 
		catch (Exception ex) {
		}
		return false;
	}
	
	public boolean recievableBalanceDropdownValues1(String receivableBalDropdownValue) {
		try {
			WebElement recivableDropdownWebEelement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(receivables_xpath));
			Select sel = new Select(recivableDropdownWebEelement);
			List<WebElement> list = sel.getOptions();
			for (WebElement ele : list) {
				if (ele.getText().equals(receivableBalDropdownValue)) {
					ele.click();
					break;
				}
			}
			return true;} 
		catch (Exception ex) {
		}
		return false;
	}
	
	
	public boolean verifyReportAllValues(String expected,String asOfDate,String clientname,String accNo,String accName,String future,String current,String over30,String over60,String over90,String over120,String total)
	{
	try{
	WebElement WebEelement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(htmlButton_xpath));
	WebEelement.click();
	//Thread.sleep(5000);
	Set <String> handles =driver.getWindowHandles();
	Iterator<String> it = handles.iterator();
	//iterate through your windows
	while (it.hasNext()){
	String parent = it.next();
	String newwin = it.next();
	driver.switchTo().window(newwin);
	//
	
	WebElement reportHeader=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(headerReport_xpath));
	reportHeader.isDisplayed();
	System.out.println("Report header");
	
	driver.findElement(By.xpath("//h2[text()='Receivables Aged Trial Balance for  as of: " +asOfDate+ "']")).isDisplayed();	
	System.out.println("As Of date");
	
	driver.findElement(By.xpath("//h2[text()='" +clientname +"']")).isDisplayed();	
	System.out.println("Client name");
	
	
	WebElement accNoWebElement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(accountNo_xpath));
	accNoWebElement.getText().equalsIgnoreCase(accNo);
	System.out.println("Account number");
	
	WebElement accNameWebElement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(accname_xpath));
	accNameWebElement.getText().equalsIgnoreCase(accName);
	System.out.println("Account name");
	
	WebElement futureWebElement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(future_xpath));
	futureWebElement.getText().equalsIgnoreCase(future);
	System.out.println("Future");
	
	WebElement currentWebElement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(current_xapth));
	currentWebElement.getText().equalsIgnoreCase(current);
	System.out.println("Current");
	
	WebElement over30WebElement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(over30_xpath));
	over30WebElement.getText().equalsIgnoreCase(over30);
	System.out.println("over30");
	
	WebElement over60Webelement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(over60_xpath));
	over60Webelement.getText().equalsIgnoreCase(over60);
	System.out.println("over60");
	
	WebElement over90Webelement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(over90_xpath));
	over90Webelement.getText().equalsIgnoreCase(over90);
	System.out.println("over90");
	
	WebElement over120Webelement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(over120_xpath));
	over120Webelement.getText().equalsIgnoreCase(over120);
	System.out.println("over120");
	
	WebElement totalWebelement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(total_xpath));
	totalWebelement.getText().equalsIgnoreCase(total);
	System.out.println("Total");
	
	
	

	/*WebElement actual=new WebDriverWait(driver,200).until(ExpectedConditions.visibilityOfElementLocated(reportsHeader));
	actual.getText().trim();
	if (actual.equals(expected))
	return true;
	else
	return false;*/
	

	
	driver.close();
	driver.switchTo().window(parent);
	
	
	}
	return true;}
	catch(Exception ex){
	return false;
	}
	


	
	}
	
	public boolean verifyReportAllValues1(String expected, String asOfDate,
			String clientname, String accNo, String accName, String future,
			String current, String over30, String over60, String over90,
			String over120, String total) {
		try {
			
				WebElement reportHeader = new WebDriverWait(driver, 10)
						.until(ExpectedConditions
								.visibilityOfElementLocated(headerReport_xpath));
				reportHeader.isDisplayed();
				System.out.println("Report header");

				driver.findElement(
						By.xpath("//h2[text()='Receivables Aged Trial Balance for  as of: "
								+ asOfDate + "']")).isDisplayed();
				System.out.println("As Of date");

				driver.findElement(
						By.xpath("//h2[text()='" + clientname.toUpperCase() + "']"))
						.isDisplayed();
				System.out.println("Client name");

				WebElement accNoWebElement = new WebDriverWait(driver, 10)
						.until(ExpectedConditions
								.visibilityOfElementLocated(accountNo_xpath));
				accNoWebElement.getText().equalsIgnoreCase(accNo);
				System.out.println("Account number");

				WebElement accNameWebElement = new WebDriverWait(driver, 10)
						.until(ExpectedConditions
								.visibilityOfElementLocated(accname_xpath));
				accNameWebElement.getText().equalsIgnoreCase(accName);
				System.out.println("Account name");

				WebElement futureWebElement = new WebDriverWait(driver, 10)
						.until(ExpectedConditions
								.visibilityOfElementLocated(future_xpath));
				futureWebElement.getText().equalsIgnoreCase(future);
				System.out.println("Future");

				WebElement currentWebElement = new WebDriverWait(driver, 10)
						.until(ExpectedConditions
								.visibilityOfElementLocated(current_xapth));
				currentWebElement.getText().equalsIgnoreCase(current);
				System.out.println("Current");

				WebElement over30WebElement = new WebDriverWait(driver, 10)
						.until(ExpectedConditions
								.visibilityOfElementLocated(over30_xpath));
				over30WebElement.getText().equalsIgnoreCase(over30);
				System.out.println("over30");

				WebElement over60Webelement = new WebDriverWait(driver, 10)
						.until(ExpectedConditions
								.visibilityOfElementLocated(over60_xpath));
				over60Webelement.getText().equalsIgnoreCase(over60);
				System.out.println("over60");

				WebElement over90Webelement = new WebDriverWait(driver, 10)
						.until(ExpectedConditions
								.visibilityOfElementLocated(over90_xpath));
				over90Webelement.getText().equalsIgnoreCase(over90);
				System.out.println("over90");

				WebElement over120Webelement = new WebDriverWait(driver, 10)
						.until(ExpectedConditions
								.visibilityOfElementLocated(over120_xpath));
				over120Webelement.getText().equalsIgnoreCase(over120);
				System.out.println("over120");

				WebElement totalWebelement = new WebDriverWait(driver, 10)
						.until(ExpectedConditions
								.visibilityOfElementLocated(total_xpath));
				totalWebelement.getText().equalsIgnoreCase(total);
				System.out.println("Total");

			return true;
		} catch (Exception ex) {
			return false;
		}

	}

	public boolean verifyReportAllValuesInPayablesAgedTrialBalance1(
			String expected, String asOfDate, String clientname, String accNo,
			String accName, String future, String current, String over30,
			String over60, String over90, String over120, String total) {
		try {
			
				WebElement reportHeader = new WebDriverWait(driver, 10)
						.until(ExpectedConditions
								.visibilityOfElementLocated(headerReport_xpath));
				reportHeader.isDisplayed();
				System.out.println("Report header");

				driver.findElement(
						By.xpath("//h2[text()='Payables Aged Trial Balance as of: "
								+ asOfDate + "']")).isDisplayed();
				System.out.println("As Of date");

				driver.findElement(
						By.xpath("//h2[text()='" + clientname.toUpperCase() + "']"))
						.isDisplayed();
				System.out.println("Client name");

				WebElement accNoWebElement = new WebDriverWait(driver, 10)
						.until(ExpectedConditions
								.visibilityOfElementLocated(accountNo_xpath));
				accNoWebElement.getText().equalsIgnoreCase(accNo);
				System.out.println("Account number");

				WebElement accNameWebElement = new WebDriverWait(driver, 10)
						.until(ExpectedConditions
								.visibilityOfElementLocated(accname_xpath));
				accNameWebElement.getText().equalsIgnoreCase(accName);
				System.out.println("Account name");

				WebElement futureWebElement = new WebDriverWait(driver, 10)
						.until(ExpectedConditions
								.visibilityOfElementLocated(future_xpath));
				futureWebElement.getText().equalsIgnoreCase(future);
				System.out.println("Future");

				WebElement currentWebElement = new WebDriverWait(driver, 10)
						.until(ExpectedConditions
								.visibilityOfElementLocated(current_xapth));
				currentWebElement.getText().equalsIgnoreCase(current);
				System.out.println("Current");

				WebElement over30WebElement = new WebDriverWait(driver, 10)
						.until(ExpectedConditions
								.visibilityOfElementLocated(over30_xpath));
				over30WebElement.getText().equalsIgnoreCase(over30);
				System.out.println("over30");

				WebElement over60Webelement = new WebDriverWait(driver, 10)
						.until(ExpectedConditions
								.visibilityOfElementLocated(over60_xpath));
				over60Webelement.getText().equalsIgnoreCase(over60);
				System.out.println("over60");

				WebElement over90Webelement = new WebDriverWait(driver, 10)
						.until(ExpectedConditions
								.visibilityOfElementLocated(over90_xpath));
				over90Webelement.getText().equalsIgnoreCase(over90);
				System.out.println("over90");

				WebElement over120Webelement = new WebDriverWait(driver, 10)
						.until(ExpectedConditions
								.visibilityOfElementLocated(over120_xpath));
				over120Webelement.getText().equalsIgnoreCase(over120);
				System.out.println("over120");

				WebElement totalWebelement = new WebDriverWait(driver, 10)
						.until(ExpectedConditions
								.visibilityOfElementLocated(total_xpath));
				totalWebelement.getText().equalsIgnoreCase(total);
				System.out.println("Total");

			return true;
		} catch (Exception ex) {
			return false;
		}
	


	
	}
	
	
	public boolean verifyReportAllValuesInPayablesAgedTrialBalance(String expected,String asOfDate,String clientname,String accNo,String accName,String future,String current,String over30,String over60,String over90,String over120,String total)
	{
	try{
	WebElement WebEelement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(htmlButton_xpath));
	WebEelement.click();
	//Thread.sleep(5000);
	Set <String> handles =driver.getWindowHandles();
	Iterator<String> it = handles.iterator();
	//iterate through your windows
	while (it.hasNext()){
	String parent = it.next();
	String newwin = it.next();
	driver.switchTo().window(newwin);
	//
	
	WebElement reportHeader=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(headerReport_xpath));
	reportHeader.isDisplayed();
	System.out.println("Report header");
	
	driver.findElement(By.xpath("//h2[text()='Payables Aged Trial Balance as of: " +asOfDate+ "']")).isDisplayed();	
	System.out.println("As Of date");
	
	driver.findElement(By.xpath("//h2[text()='" +clientname +"']")).isDisplayed();	
	System.out.println("Client name");
	
	
	WebElement accNoWebElement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(accountNo_xpath));
	accNoWebElement.getText().equalsIgnoreCase(accNo);
	System.out.println("Account number");
	
	WebElement accNameWebElement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(accname_xpath));
	accNameWebElement.getText().equalsIgnoreCase(accName);
	System.out.println("Account name");
	
	WebElement futureWebElement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(future_xpath));
	futureWebElement.getText().equalsIgnoreCase(future);
	System.out.println("Future");
	
	WebElement currentWebElement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(current_xapth));
	currentWebElement.getText().equalsIgnoreCase(current);
	System.out.println("Current");
	
	WebElement over30WebElement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(over30_xpath));
	over30WebElement.getText().equalsIgnoreCase(over30);
	System.out.println("over30");
	
	WebElement over60Webelement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(over60_xpath));
	over60Webelement.getText().equalsIgnoreCase(over60);
	System.out.println("over60");
	
	WebElement over90Webelement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(over90_xpath));
	over90Webelement.getText().equalsIgnoreCase(over90);
	System.out.println("over90");
	
	WebElement over120Webelement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(over120_xpath));
	over120Webelement.getText().equalsIgnoreCase(over120);
	System.out.println("over120");
	
	
	WebElement totalWebelement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(total_xpath));
	totalWebelement.getText().equalsIgnoreCase(total);
	System.out.println("Total");
	
	/*WebElement totalWebelement=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(totalAr_xpath));
	totalWebelement.getText().equalsIgnoreCase(total);
	System.out.println("Total");*/
	
//
	/*WebElement actual=new WebDriverWait(driver,200).until(ExpectedConditions.visibilityOfElementLocated(reportsHeader));
	actual.getText().trim();
	if (actual.equals(expected))
	return true;
	else
	return false;*/
	

	driver.close();
	driver.switchTo().window(parent);
	
	}
	return true;}
	catch(Exception ex){
	return false;
	}
	


	
	}

	
	
	public boolean payablesAgedTrialBalance()
	{
		try{

			WebElement payablesAgedTrialBalanceWebEelement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(payablesAgedTrialBalance_xpath));
			payablesAgedTrialBalanceWebEelement.click();
			
			Thread.sleep(500);
			
	return true;
		}
		catch(Exception ex){
		
		}
		return false;
}

	
	public boolean payableBalanceDropdownValues(String payableBalDropdownValue) {
		try {
			WebElement payableDropdownWebEelement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(payable_xpath));
			Select sel = new Select(payableDropdownWebEelement);
			sel.selectByVisibleText(payableBalDropdownValue);
			/*List<WebElement> list = sel.getOptions();
			for (WebElement ele : list) {
				if (ele.getText().equals(payableBalDropdownValue)) {
					ele.click();
					////Thread.sleep(5000);
					break;
				}
			}
*/			return true;} 
		catch (Exception ex) {
		}
		return false;
	
}



public boolean ARAPConcentrations()
{
	try{

		WebElement ARAPConcentrationsWebEelement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(aRAPConcentrations_xpath));
		ARAPConcentrationsWebEelement.click();
		
		Thread.sleep(500);
		
return true;
	
	}
catch (Exception ex) {
}
return false;

}


public boolean accountTypeDropdownValues(String accountTypeDropdownValue) {
	try {
		WebElement accTypeDropdownWebEelement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(accountType_xpath));
		Select sel = new Select(accTypeDropdownWebEelement);
		sel.selectByVisibleText(accountTypeDropdownValue);
		/*List<WebElement> list = sel.getOptions();
		for (WebElement ele : list) {
			if (ele.getText().equals(accountTypeDropdownValue)) {
				ele.click();
				////Thread.sleep(5000);
				break;
			}
		}*/
		return true;} 
	catch (Exception ex) {
	}
	return false;

}

public boolean reportTypeDropdownValues(String reportTypeDropdownValue) {
	try {
		WebElement reportTypeDropdownWebEelement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(reportType_xpath));
		Select sel = new Select(reportTypeDropdownWebEelement);
		sel.selectByVisibleText(reportTypeDropdownValue);
		/*List<WebElement> list = sel.getOptions();
		for (WebElement ele : list) {
			if (ele.getText().equals(reportTypeDropdownValue)) {
				ele.click();
				////Thread.sleep(5000);
				break;
			}
		}*/
		return true;} 
	catch (Exception ex) {
	}
	return false;

}


		public boolean verifyArApConcReportAllValues(String expected,String asOfDate,String clientname,String accName,String perOfTotalAr,String total,String current,String over30,String over60,String over90,String over120)
		{
			try{
				WebElement WebEelement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(htmlButton_xpath));
				WebEelement.click();
				//Thread.sleep(5000);
				Set <String> handles =driver.getWindowHandles();
				Iterator<String> it = handles.iterator();
				//iterate through your windows
				while (it.hasNext()){
				String parent = it.next();
				String newwin = it.next();
				driver.switchTo().window(newwin);
				//
				
				WebElement reportHeader=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(headerReport_xpath));
				reportHeader.isDisplayed();
				System.out.println("Report header");
				
				driver.findElement(By.xpath("//h2[text()='Debtors Concentrations as of:" +asOfDate+ "']")).isDisplayed();	
				System.out.println("As Of date");
				
				driver.findElement(By.xpath("//h2[text()='" +clientname +"']")).isDisplayed();	
				System.out.println("Client name");
		
		WebElement accNameWebElement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(accountNameArAp_xpath));
		accNameWebElement.getText().equalsIgnoreCase(accName);
		System.out.println("Account name");
		
		WebElement perOfTotalArWebelement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(PercOfTotalARArAp_xpath));
		perOfTotalArWebelement.getText().trim().equalsIgnoreCase(perOfTotalAr);
		System.out.println("% of total AR");
		
		WebElement totalWebelement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(totalarAp_xpath));
		totalWebelement.getText().trim().equalsIgnoreCase(total);
		System.out.println("Total");
		
		WebElement currentWebElement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(currentArAp_xapth));
		currentWebElement.getText().trim().equalsIgnoreCase(current);
		System.out.println("Current");
		
		WebElement over30WebElement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(over30ArAp_xpath));
		over30WebElement.getText().equalsIgnoreCase(over30);
		System.out.println("over30");
		
		WebElement over60Webelement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(over60ArAp_xpath));
		over60Webelement.getText().equalsIgnoreCase(over60);
		System.out.println("over60");
		
		WebElement over90Webelement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(over90ArAp_xpath));
		over90Webelement.getText().equalsIgnoreCase(over90);
		System.out.println("over90");
		
		WebElement over120Webelement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(over120ArAp_xpath));
		over120Webelement.getText().equalsIgnoreCase(over120);
		System.out.println("over120");
		
		
		driver.close();
		driver.switchTo().window(parent);
		
		}
		return true;}
		catch(Exception ex){
		return false;
		}}

	// rohit
	public boolean verifyArApConcReportAllValues1(String expected,
			String asOfDate, String clientname, String accName,
			String perOfTotalAr, String total, String current, String over30,
			String over60, String over90, String over120) {
		try {
				WebElement reportHeader = new WebDriverWait(driver, 10)
						.until(ExpectedConditions
								.visibilityOfElementLocated(headerReport_xpath));
				reportHeader.isDisplayed();
				System.out.println("Report header");

				driver.findElement(
						By.xpath("//h2[text()='Debtors Concentrations as of:"
								+ asOfDate + "']")).isDisplayed();
				System.out.println("As Of date");

				driver.findElement(
						By.xpath("//h2[text()='" + clientname.toUpperCase() + "']"))
						.isDisplayed();
				System.out.println("Client name");

				WebElement accNameWebElement = new WebDriverWait(driver, 10)
						.until(ExpectedConditions
								.visibilityOfElementLocated(accountNameArAp_xpath));
				accNameWebElement.getText().equalsIgnoreCase(accName);
				System.out.println("Account name");

				WebElement perOfTotalArWebelement = new WebDriverWait(driver,
						10).until(ExpectedConditions
						.visibilityOfElementLocated(PercOfTotalARArAp_xpath));
				perOfTotalArWebelement.getText().trim()
						.equalsIgnoreCase(perOfTotalAr);
				System.out.println("% of total AR");

				WebElement totalWebelement = new WebDriverWait(driver, 10)
						.until(ExpectedConditions
								.visibilityOfElementLocated(totalarAp_xpath));
				totalWebelement.getText().trim().equalsIgnoreCase(total);
				System.out.println("Total");

				WebElement currentWebElement = new WebDriverWait(driver, 10)
						.until(ExpectedConditions
								.visibilityOfElementLocated(currentArAp_xapth));
				currentWebElement.getText().trim().equalsIgnoreCase(current);
				System.out.println("Current");

				WebElement over30WebElement = new WebDriverWait(driver, 10)
						.until(ExpectedConditions
								.visibilityOfElementLocated(over30ArAp_xpath));
				over30WebElement.getText().equalsIgnoreCase(over30);
				System.out.println("over30");

				WebElement over60Webelement = new WebDriverWait(driver, 10)
						.until(ExpectedConditions
								.visibilityOfElementLocated(over60ArAp_xpath));
				over60Webelement.getText().equalsIgnoreCase(over60);
				System.out.println("over60");

				WebElement over90Webelement = new WebDriverWait(driver, 10)
						.until(ExpectedConditions
								.visibilityOfElementLocated(over90ArAp_xpath));
				over90Webelement.getText().equalsIgnoreCase(over90);
				System.out.println("over90");

				WebElement over120Webelement = new WebDriverWait(driver, 10)
						.until(ExpectedConditions
								.visibilityOfElementLocated(over120ArAp_xpath));
				over120Webelement.getText().equalsIgnoreCase(over120);
				System.out.println("over120");

			return true;
		} catch (Exception ex) {
			return false;
		}
	}
		
		public boolean assetsInventoryReport()
		{
			try{

				WebElement sssetsInventoryReportWebEelement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(assetInventoryReport_xpath));
				sssetsInventoryReportWebEelement.click();
				
				Thread.sleep(2000);
				
		return true;
			
			}
		catch (Exception ex) {
		}
		return false;

		}	
		
		
		public boolean verifyReportAllValuesInAssetsInventory(String expected,String asOfDate,String clientname,String location,String actualValue,String ineligibleAmount,String assetAmount)
		{
		try{
		WebElement WebEelement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(htmlButton_xpath));
		WebEelement.click();
		//Thread.sleep(5000);
		Set <String> handles =driver.getWindowHandles();
		Iterator<String> it = handles.iterator();
		//iterate through your windows
		while (it.hasNext()){
		String parent = it.next();
		String newwin = it.next();
		driver.switchTo().window(newwin);
		//
		
		WebElement reportHeader=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(headerReport_xpath));
		reportHeader.isDisplayed();
		System.out.println("Report header");
		
		driver.findElement(By.xpath("//h2[text()='Assets/Inventory Report as of BBC dated: " +asOfDate+ "']")).isDisplayed();	
		System.out.println("As Of date");
		
		driver.findElement(By.xpath("//h2[text()='" +clientname +"']")).isDisplayed();	
		System.out.println("Client name");
		
		WebElement locationWebelement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(location_xpath));
		locationWebelement.getText().equalsIgnoreCase(location);
		System.out.println("Location");
		
		WebElement actualValueWebElement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(actualValue_xpath));
		actualValueWebElement.getText().equalsIgnoreCase(actualValue);
		System.out.println("Actual value");
		
		WebElement ineligibleAmountWebElement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(ineligibleAmount_xpath));
		ineligibleAmountWebElement.getText().equalsIgnoreCase(ineligibleAmount);
		System.out.println("Ineligible amount");
		
		WebElement assetAmountWebelement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(assetAmount_xapth));
		assetAmountWebelement.getText().equalsIgnoreCase(assetAmount);
		System.out.println("Asset amount");
		
		driver.close();
		driver.switchTo().window(parent);
		
		}
		return true;}
		catch(Exception ex){
		return false;
		}}


	//rohit	
	public boolean verifyReportAllValuesInAssetsInventory1(String expected,
			String asOfDate, String clientname, String location,
			String actualValue, String ineligibleAmount, String assetAmount) {
		try {

			WebElement reportHeader = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(headerReport_xpath));
			reportHeader.isDisplayed();
			System.out.println("Report header");

			driver.findElement(
					By.xpath("//h2[text()='Assets/Inventory Report as of BBC dated: "
							+ asOfDate + "']")).isDisplayed();
			System.out.println("As Of date");

			driver.findElement(By.xpath("//h2[text()='" + clientname.toUpperCase() + "']"))
					.isDisplayed();
			System.out.println("Client name");

			WebElement locationWebelement = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(location_xpath));
			locationWebelement.getText().equalsIgnoreCase(location);
			System.out.println("Location");

			WebElement actualValueWebElement = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(actualValue_xpath));
			actualValueWebElement.getText().equalsIgnoreCase(actualValue);
			System.out.println("Actual value");

			WebElement ineligibleAmountWebElement = new WebDriverWait(driver,
					10).until(ExpectedConditions
					.visibilityOfElementLocated(ineligibleAmount_xpath));
			ineligibleAmountWebElement.getText().equalsIgnoreCase(
					ineligibleAmount);
			System.out.println("Ineligible amount");

			WebElement assetAmountWebelement = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(assetAmount_xapth));
			assetAmountWebelement.getText().equalsIgnoreCase(assetAmount);
			System.out.println("Asset amount");

			return true;
		} catch (Exception ex) {
			return false;
		}
	}
		
		
		//
		
		public boolean bbcDateDropdownValues(String bbcDateDropdownValue) {
			try {
				WebElement bbcDropdownWebEelement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(bbcDateRecev_xpath));
				Select sel = new Select(bbcDropdownWebEelement);
				sel.selectByVisibleText(bbcDateDropdownValue);
				/*List<WebElement> list = sel.getOptions();
				for (WebElement ele : list) {
					if (ele.getText().equals(bbcDateDropdownValue)) {
						ele.click();
						////Thread.sleep(5000);
						break;
					}
				}*/
				return true;} 
			catch (Exception ex) {
			}
			return false;
		}
		
		public boolean bbcDateDropdownValues1(String bbcDateDropdownValue) {
			try {
				WebElement bbcDropdownWebEelement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(bbcDateRecev_xpath));
				Select sel = new Select(bbcDropdownWebEelement);
				List<WebElement> list = sel.getOptions();
				for (WebElement ele : list) {
					if (ele.getText().equals(bbcDateDropdownValue)) {
						ele.click();
						////Thread.sleep(5000);
						break;
					}
				}
				return true;} 
			catch (Exception ex) {
			}
			return false;
		}
		
		
		public boolean clickOnBbcTrendReport()
		{
			try{

				WebElement trendnWebEelement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(bbcTrendReport_xpath));
				trendnWebEelement.click();	
				Set <String> handles =driver.getWindowHandles();
    			Iterator<String> it = handles.iterator();
    			//iterate through your windows
    			while (it.hasNext()){
    			String newwin = it.next();
    			String parent = it.next();
    			driver.switchTo().window(newwin);
				return true;
			}}
			catch(Exception ex){
				
			}
			return false;
	}
		
		public boolean clickOnBbcTrendReport1()
		{
			try{

				WebElement trendnWebEelement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(bbcTrendReport_xpath));
				trendnWebEelement.click();	
			
				return true;
			}
			catch(Exception ex){
				
			}
			return false;
	}
		
		
		public boolean enterStartDate(String startDate)
		{
			try{

				WebElement trendnWebEelement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(bbcTrendStartDate_xpath));
				trendnWebEelement.sendKeys(startDate);
				trendnWebEelement.sendKeys(Keys.ESCAPE);
				return true;
			}
			catch(Exception ex){
				return false;
			}
	}

		public boolean enterEndDate(String endDate)
		{
			try{

				WebElement trendnWebEelement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(bbcTrendEndDate_xpath));
				trendnWebEelement.sendKeys(endDate);
				trendnWebEelement.sendKeys(Keys.ESCAPE);
				Thread.sleep(2000);
				return true;
			}
			catch(Exception ex){
				return false;
			}
		}
		
		//rohit
	public boolean verifyBbcTrendReportNewTab1(String expected,
			String clientname, String startdate, String toDate) {
		try {
			
				/*WebElement reportHeader = new WebDriverWait(driver, 10)
						.until(ExpectedConditions
								.visibilityOfElementLocated(headerReport_xpath));
				reportHeader.isDisplayed();
				System.out.println("Cync Report header");*/

				driver.findElement(
						By.xpath("//h2[contains(text(),'BBC Trend Report from "
								+ startdate + " to " + toDate + "')]"))
						.isDisplayed();
				System.out.println("Report header");

				driver.findElement(
						By.xpath("//h2[text()='" + clientname.toUpperCase() + "']"))
						.isDisplayed();
				System.out.println("Client name");
			return true;
		} catch (Exception ex) {
			return false;
		}
	}


		public boolean verifyBbcTrendReportNewTab(String expected,String clientname,String startdate,String toDate)
		{
			try{
				WebElement WebEelement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(htmlButton_xpath));
				WebEelement.click();
				//Thread.sleep(5000);
				Set <String> handles =driver.getWindowHandles();
				Iterator<String> it = handles.iterator();
				//iterate through your windows
				while (it.hasNext()){
				String parent = it.next();
				String newwin = it.next();
				driver.switchTo().window(newwin);
				//
				
				WebElement reportHeader=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(headerReport_xpath));
				reportHeader.isDisplayed();
				System.out.println("Cync Report header");


				
				driver.findElement(By.xpath("//h2[contains(text(),'BBC Trend Report from " +startdate+" to " +toDate+ "')]")).isDisplayed();				
				System.out.println("Report header");
				
				driver.findElement(By.xpath("//h2[text()='" +clientname +"']")).isDisplayed();	
				System.out.println("Client name");
				
				}
				return true;}
				catch(Exception ex){
				return false;
				}}

				//bbc report
					

		 public boolean  verifyEndingARBalance(String  EndingArBalance){
		    	try {
		    		WebElement displayWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(endingARBalance_xpath));
		    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(endingARBalanceValue_xpath));
		    		displayWebElement.isDisplayed();
		    		String actual = AmountWebElement.getText().trim();
		    		if (actual.equals(EndingArBalance))
		    			return true;
		    		else
		    			return false;

		    	} catch (Exception e) {
		    		return false;
		    	}
		    	
		    }	
		 
		 public boolean  verifyNetARAvailableForAdvance(String  NetARAvailableForAdvance){
		    	try {
		    		WebElement displayWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(netARAvailableForAdvance_xpath));
		    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(netARAvailableForAdvanceValue_xpath));
		    		displayWebElement.isDisplayed();
		    		String actual = AmountWebElement.getText().trim();
		    		if (actual.equals(NetARAvailableForAdvance))
		    			return true;
		    		else
		    			return false;

		    	} catch (Exception e) {
		    		return false;
		    	}
		    	
		    }	
		 public boolean  verifyNetInventoryAvailableForAdvance(String  NetInventoryAvailableForAdvance){
		    	try {
		    		WebElement displayWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(netInventoryAvailableForAdvance_xpath));
		    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(netInventoryAvailableForAdvanceValue_xpath));
		    		displayWebElement.isDisplayed();
		    		String actual = AmountWebElement.getText().trim();
		    		if (actual.equals(NetInventoryAvailableForAdvance))
		    			return true;
		    		else
		    			return false;

		    	} catch (Exception e) {
		    		return false;
		    	}
		    	
		    }	
		 
		 public boolean  verifyTotalAvailableARInventory(String  TotalAvailableARInventory){
		    	try {
		    		WebElement displayWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(totalAvailableARInventory_xpath));
		    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(totalAvailableARInventoryValue_xpath));
		    		displayWebElement.isDisplayed();
		    		String actual = AmountWebElement.getText().trim();
		    		if (actual.equals(TotalAvailableARInventory))
		    			return true;
		    		else
		    			return false;

		    	} catch (Exception e) {
		    		return false;
		    	}
		    	
		    }	
		 
		 public boolean  verifyNetOtherAvailableForAdvance(String  NetOtherAvailableForAdvance){
		    	try {
		    		WebElement displayWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(netOtherAvailableForAdvance_xpath));
		    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(netOtherAvailableForAdvanceValue_xpath));
		    		displayWebElement.isDisplayed();
		    		String actual = AmountWebElement.getText().trim();
		    		if (actual.equals(NetOtherAvailableForAdvance))
		    			return true;
		    		else
		    			return false;

		    	} catch (Exception e) {
		    		return false;
		    	}
		    	
		    }	
		 
		 public boolean  verifyTotalAvailableForAdvance(String  TotalAvailableForAdvance){
		    	try {
		    		WebElement displayWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(totalAvailableForAdvance_xpath));
		    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(totalAvailableForAdvanceValue_xpath));
		    		displayWebElement.isDisplayed();
		    		String actual = AmountWebElement.getText().trim();
		    		if (actual.equals(TotalAvailableForAdvance))
		    			return true;
		    		else
		    			return false;

		    	} catch (Exception e) {
		    		return false;
		    	}
		    	
		    }	
		 public boolean  verifyApprovedLineLessReserves(String  ApprovedLineLessReserves){
		    	try {
		    		WebElement displayWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(approvedLineLessReserves_xpath));
		    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(approvedLineLessReservesValue_xpath));
		    		displayWebElement.isDisplayed();
		    		String actual = AmountWebElement.getText().trim();
		    		if (actual.equals(ApprovedLineLessReserves))
		    			return true;
		    		else
		    			return false;

		    	} catch (Exception e) {
		    		return false;
		    	}
		    	
		    }	
		 
		 public boolean  verifyNetCollateralAvailable(String  NetCollateralAvailable){
		    	try {
		    		WebElement displayWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(netCollateralAvailable_xpath));
		    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(netCollateralAvailableValue_xpath));
		    		displayWebElement.isDisplayed();
		    		String actual = AmountWebElement.getText().trim();
		    		if (actual.equals(NetCollateralAvailable))
		    			return true;
		    		else
		    			return false;

		    	} catch (Exception e) {
		    		return false;
		    	}
		    	
		    }	

		    public boolean reportsPage()
			
		    	{
		            //driver.get("https://staging.cyncsoftware.com");	
		       		try{
		       		String parentWindow = driver.getWindowHandle();
		       			
		              //Set<String> childWindow;
		       		for(String childWindow1:driver.getWindowHandles())
		       		{
		       		if(!childWindow1.equals(parentWindow)){		       			
		       	    driver.switchTo().window(childWindow1);
		       	    driver.close();
		       	 //driver.get("https://staging.cyncsoftware.com");
		       		}
		       		driver.switchTo().window(parentWindow);
		       		driver.get("https://staging.cyncsoftware.com");
		       		return true;
		       				}
		       		}
	catch(Exception ex){
		    			
		    		}
					return false;
		    	}

		    		/*try{
		    			Set <String> handles =driver.getWindowHandles();
		    			Iterator<String> it = handles.iterator();
		    			//iterate through your windows
		    			while (it.hasNext()){
		    			String parent = it.next();
		    			String newwin = it.next();
		    			driver.close();
		    			driver.switchTo().window(parent);
		    			return true;
		    			}
		    		}
		    		catch(Exception ex){
		    			
		    		}
					return false;
		    	}*/
		    public boolean scrollToView()
			{
				try{
					 WebElement actual1=new WebDriverWait(driver,10)
		    		 .until(ExpectedConditions.visibilityOfElementLocated(netInventoryAvailableForAdvance_xpath));
		    		JavascriptExecutor jse1 = (JavascriptExecutor)driver;;
		    		jse1.executeScript("arguments[0].scrollIntoView(true);", actual1);  		
			        //Thread.sleep(3000);
			        return true;
					
				}
				catch(Exception e){
					
				}
				return false;
				
				}	    
		    
		    public boolean scrollToViewR()
			{
				try{
					 WebElement actual1=new WebDriverWait(driver,10)
		    		 .until(ExpectedConditions.visibilityOfElementLocated(netCollateralAvailable_xpath));
		    		JavascriptExecutor jse1 = (JavascriptExecutor)driver;;
		    		jse1.executeScript("arguments[0].scrollIntoView(true);", actual1);  		
			        //Thread.sleep(3000);
			        return true;
					
				}
				catch(Exception e){
					
				}
				return false;
				
				}	 
			public boolean verifyBbcReportNewTab(String clientname,String MaximumLineAmount)
			{
				try{
					WebElement WebEelement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(htmlButton_xpath));
					WebEelement.click();
					//Thread.sleep(5000);
					Set <String> handles =driver.getWindowHandles();
					Iterator<String> it = handles.iterator();
					//iterate through your windows
					while (it.hasNext()){
					String parent = it.next();
					String newwin = it.next();
					driver.switchTo().window(newwin);
					//
					
					WebElement reportHeader=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(headerReport_xpath));
					reportHeader.isDisplayed();
					System.out.println("Cync Report header");

					
					driver.findElement(By.xpath("//h2[text()='Maximum Line Amount: "+MaximumLineAmount +"']")).isDisplayed();				
					System.out.println("Maximum line amount");
					
					driver.findElement(By.xpath("//h2[text()='" +clientname +"']")).isDisplayed();	
					System.out.println("Client name");
					driver.switchTo().window(newwin).close();
					driver.switchTo().window(parent);
					}
					
					return true;}
					catch(Exception ex){
					return false;
					}}
			
	// rohit
	public boolean verifyBbcReportNewTab1(String clientname,
			String MaximumLineAmount) {
		try {
			/*WebElement reportHeader = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(headerReport_xpath));
			reportHeader.isDisplayed();
			System.out.println("Cync Report header");*/

			driver.findElement(
					By.xpath("//h2[text()='Maximum Line Amount: "
							+ MaximumLineAmount + "']")).isDisplayed();
			System.out.println("Maximum line amount");

			driver.findElement(By.xpath("//h2[text()='" + clientname.toUpperCase() + "']"))
					.isDisplayed();
			System.out.println("Client name");
			return true;
		} catch (Exception ex) {
			return false;
		}
	}
			
			 public boolean  verifyEndingBalanceTotalAR(String  EndingBalanceTotalAR){
			    	try {
			    		WebElement displayWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(endingBalanceTotalAR_xpath));
			    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(endingBalanceTotalARValue_xpath));
			    		displayWebElement.isDisplayed();
			    		String actual = AmountWebElement.getText().trim();
			    		if (actual.equals(EndingBalanceTotalAR))
			    			return true;
			    		else
			    			return false;

			    	} catch (Exception e) {
			    		return false;
			    	}
			    	
			    }	
			 public boolean  verifyTotalAgedReceivables(String  totalAgedReceivables){
			    	try {
			    		WebElement displayWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(totalAgedReceivables_xpath));
			    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(totalAgedReceivablesValue_xpath));
			    		displayWebElement.isDisplayed();
			    		String actual = AmountWebElement.getText().trim();
			    		if (actual.equals(totalAgedReceivables))
			    			return true;
			    		else
			    			return false;

			    	} catch (Exception e) {
			    		return false;
			    	}
			    	
			    }	
			 public boolean  verifyNetARAvailableForAdvanceBbc(String  netARAvailableForAdvance){
			    	try {
			    		WebElement displayWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(netARAvailableForAdvance_xpath));
			    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(netARAvailableForAdvanceBbcValue_xpath));
			    		displayWebElement.isDisplayed();
			    		String actual = AmountWebElement.getText().trim();
			    		if (actual.equals(netARAvailableForAdvance))
			    			return true;
			    		else
			    			return false;

			    	} catch (Exception e) {
			    		return false;
			    	}
			    	
			    }	
			 public boolean  verifyNetInventoryAvailableForAdvanceBbc(String  netInventoryAvailableForAdvance){
			    	try {
			    		WebElement displayWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(netInventoryAvailableForAdvance_xpath));
			    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(netInventoryAvailableForAdvanceBbcValue_xpath));
			    		displayWebElement.isDisplayed();
			    		String actual = AmountWebElement.getText().trim();
			    		if (actual.equals(netInventoryAvailableForAdvance))
			    			return true;
			    		else
			    			return false;

			    	} catch (Exception e) {
			    		return false;
			    	}
			    	
			    }	
			 public boolean  verifyTotalAvailableARInventoryBbc(String  totalAvailableARInventory){
			    	try {
			    		WebElement displayWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(totalAvailableARInventoryBbc_xpath));
			    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(totalAvailableARInventoryBbcValue_xpath));
			    		displayWebElement.isDisplayed();
			    		String actual = AmountWebElement.getText().trim();
			    		if (actual.equals(totalAvailableARInventory))
			    			return true;
			    		else
			    			return false;

			    	} catch (Exception e) {
			    		return false;
			    	}
			    	
			    }	
			 public boolean  verifyNetOtherAvailableForAdvanceBbc(String  netOtherAvailableForAdvance){
			    	try {
			    		WebElement displayWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(netOtherAvailableForAdvance_xpath));
			    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(netOtherAvailableForAdvanceBbcValue_xpath));
			    		displayWebElement.isDisplayed();
			    		String actual = AmountWebElement.getText().trim();
			    		if (actual.equals(netOtherAvailableForAdvance))
			    			return true;
			    		else
			    			return false;

			    	} catch (Exception e) {
			    		return false;
			    	}
			    	
			    }	
			 public boolean  verifyTotalAvailableForAdvanceBbc(String  totalAvailableForAdvance){
			    	try {
			    		WebElement displayWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(totalAvailableForAdvance_xpath));
			    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(totalAvailableForAdvanceBbcValue_xpath));
			    		displayWebElement.isDisplayed();
			    		String actual = AmountWebElement.getText().trim();
			    		if (actual.equals(totalAvailableForAdvance))
			    			return true;
			    		else
			    			return false;

			    	} catch (Exception e) {
			    		return false;
			    	}
			    	
			    }	
			 public boolean  verifyLineLimitWithReservesBbc(String  lineLimitWithReserves){
			    	try {
			    		WebElement displayWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(lineLimitWithReserves_xpath));
			    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(lineLimitWithReservesValue_xpath));
			    		displayWebElement.isDisplayed();
			    		String actual = AmountWebElement.getText().trim();
			    		if (actual.equals(lineLimitWithReserves))
			    			return true;
			    		else
			    			return false;

			    	} catch (Exception e) {
			    		return false;
			    	}
			    	
			    }	
			 public boolean  verifyBorrowingBaseAvailabilityBbc(String  borrowingBaseAvailability){
			    	try {
			    		WebElement displayWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(borrowingBaseAvailability_xpath));
			    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(borrowingBaseAvailabilityValue_xpath));
			    		displayWebElement.isDisplayed();
			    		String actual = AmountWebElement.getText().trim();
			    		if (actual.equals(borrowingBaseAvailability))
			    			return true;
			    		else
			    			return false;

			    	} catch (Exception e) {
			    		return false;
			    	}
			    	
			    }	
			 public boolean  verifyNetBorrowingBaseAvailableBbc(String  netBorrowingBaseAvailable){
			    	try {
			    		WebElement displayWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(netBorrowingBaseAvailable_xpath));
			    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(netBorrowingBaseAvailableValue_xpath));
			    		displayWebElement.isDisplayed();
			    		String actual = AmountWebElement.getText().trim();
			    		if (actual.equals(netBorrowingBaseAvailable))
			    			return true;
			    		else
			    			return false;

			    	} catch (Exception e) {
			    		return false;
			    	}
			    	
			    }
			   public boolean scrollToViewBbcReport()
				{
					try{
						 WebElement actual1=new WebDriverWait(driver,10)
			    		 .until(ExpectedConditions.visibilityOfElementLocated(netARAvailableForAdvance_xpath));
			    		JavascriptExecutor jse1 = (JavascriptExecutor)driver;;
			    		jse1.executeScript("arguments[0].scrollIntoView(true);", actual1);  		
				        //Thread.sleep(3000);
				        return true;
						
					}
					catch(Exception e){
						
					}
					return false;
					
					}
			   public boolean scrollToViewBbc()
				{
					try{
						 WebElement actual1=new WebDriverWait(driver,10)
			    		 .until(ExpectedConditions.visibilityOfElementLocated(netBorrowingBaseAvailable_xpath));
			    		JavascriptExecutor jse1 = (JavascriptExecutor)driver;;
			    		jse1.executeScript("arguments[0].scrollIntoView(true);", actual1);  		
				        //Thread.sleep(3000);
				        return true;
						
					}
					catch(Exception e){
						
					}
					return false;
					
					}
			 //
			   
			   
				public boolean clickbBCExecutiveTrendReport()
				{
					try{

			WebElement clickWebEelement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(bBCExecutiveTrendReport_xpath));
						clickWebEelement.click();
						Set <String> handles =driver.getWindowHandles();
		    			Iterator<String> it = handles.iterator();
		    			//iterate through your windows
		    			while (it.hasNext()){
		    			String parent = it.next();
		    			String newwin = it.next();
		    			driver.switchTo().window(newwin);
						//Thread.sleep(2000);
						
				return true;
					}
					}
					catch(Exception ex){
						
					}
					return false;

				}		
//rohit
	public boolean clickbBCExecutiveTrendReport1() {
		try {

			WebElement clickWebEelement = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(bBCExecutiveTrendReport_xpath));
			clickWebEelement.click();

			return true;

		} catch (Exception ex) {

		}
		return false;

	}
				
				
				public boolean clickOnGenerate()
				{
				try{
				WebElement WebEelement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(generateTrend_xpath));
				WebEelement.click();
				//Thread.sleep(5000);
				Set <String> handles =driver.getWindowHandles();
				Iterator<String> it = handles.iterator();
				//iterate through your windows
				while (it.hasNext()){
				String parent = it.next();
				String newwin = it.next();
				driver.switchTo().window(newwin);
				

				
				driver.findElement(By.xpath("//span[contains(text(),'BBC Executive Trend Report')]")).isDisplayed();
				System.out.println("Report name");
				}
				return true;}
				catch(Exception ex){
				return false;
				}}

				//rohit
	public boolean clickOnGenerate1() {
		try {
			WebElement WebEelement = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(generateTrend_xpath));
			WebEelement.click();
			
			return true;
		} catch (Exception ex) {
			return false;
		}
	}


	
	
				 public boolean  verifyCommitmentAmount(String CommitmentAmount){
				    	try {
				    		WebElement elementWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(commitmentAmount_xpath));
				    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(commitmentAmountValue_xpath));
				    		elementWebElement.isDisplayed();
				    		String actual = AmountWebElement.getText().trim();
				    		System.out.println("verifyCommitmentAmount : "+actual);
				    		if (actual.equals(CommitmentAmount))
				    			return true;
				    		else
				    			return false;

				    	} catch (Exception e) {
				    		return false;
				    	}				    	
				    	}
				 
				 public boolean  verifyBBCFrequency(String BBCFrequency){
				    	try {
				    		WebElement elementWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(bBCFrequency_xpath));
				    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(bBCFrequencyValue_xpath));
				    		elementWebElement.isDisplayed();
				    		String actual = AmountWebElement.getText().trim();
				    		System.out.println("verifyBBCFrequency : "+actual);
				    		if (actual.equals(BBCFrequency))
				    			return true;
				    		else
				    			return false;

				    	} catch (Exception e) {
				    		return false;
				    	}				    	
				    	}
				 
				 public boolean  verifyEligibilityPeriod(String EligibilityPeriod){
				    	try {
				    		WebElement elementWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(eligibilityPeriod_xpath));
				    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(eligibilityPeriodValue_xpath));
				    		elementWebElement.isDisplayed();
				    		String actual = AmountWebElement.getText().trim();
				    		System.out.println("verifyEligibilityPeriod : "+actual);
				    		if (actual.equals(EligibilityPeriod))
				    			return true;
				    		else
				    			return false;

				    	} catch (Exception e) {
				    		return false;
				    	}				    	
				    	}
				 
				 public boolean  verifyCollateralNameReceivables(String advance,String sublimit){
				    	try {
				    		WebElement elementWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(receivablesTrend_xpath));
				    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(receivablesTrendAdvance_xpath));
				    		WebElement sublimitWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(receivablesTrendSubLimit_xpath));	    		
				    		elementWebElement.isDisplayed();
				    		
				    		String advanceA = AmountWebElement.getText().trim();
				    		String sublimitA = sublimitWebElement.getText().trim();
				    		System.out.println("verifyCollateralNameReceivables : "+advanceA +" :  "+sublimitA);
				    		
				    		if (advanceA.equals(advance))
				    		{
				    			if (sublimitA.equals(sublimit)) 
				    			{
				    				return true;
								}
				    			else
				    				return false;
				    		}
				    		else
				    			return false;

				    	} catch (Exception e) {
				    		return false;
				    	}				    	
				    	}
				 
				 public boolean  verifyCollateralNameInventory(String Inventoryadvance,String Inventorysublimit){
				    	try {
				    		WebElement elementWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(inventoryTrend_xpath));
				    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(inventoryTrendAdvance_xpath));
				    		WebElement sublimitWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(inventoryTrendSublimit_xpath));	    		
				    		elementWebElement.isDisplayed();
				    		
				    		String advanceA = AmountWebElement.getText().trim();
				    		String sublimitA = sublimitWebElement.getText().trim();
				    		System.out.println("verifyCollateralNameInventory : "+advanceA +" :  "+sublimitA);

				    		
				    		if (advanceA.equals(Inventoryadvance))
				    		{
				    			if (sublimitA.equals(Inventorysublimit)) 
				    			{
				    				return true;
								}
				    			else
				    				return false;
				    		}
				    		else
				    			return false;

				    	} catch (Exception e) {
				    		return false;
				    	}				    	
				    	}
				 
				 
				  
					public boolean clickOnGenerateTrendReport()
					{
					try{
					WebElement WebEelement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(generateTrend_xpath));
					WebEelement.click();
					//Thread.sleep(5000);
					Set <String> handles =driver.getWindowHandles();
					Iterator<String> it = handles.iterator();
					//iterate through your windows
					while (it.hasNext()){
					String parent = it.next();
					String newwin = it.next();
					driver.switchTo().window(newwin);
					

					
					driver.findElement(By.xpath("//span[contains(text(),'BBC Trend Report')]")).isDisplayed();
					System.out.println("Report name");
					}
					return true;}
					catch(Exception ex){
					return false;
					}}

//rohit
	public boolean clickOnGenerateTrendReport1() {
		try {
			WebElement WebEelement = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(generateTrend_xpath));
			WebEelement.click();
			return true;
		} catch (Exception ex) {
			return false;
		}
	}
					
	//rohit
	public boolean clickbbcTrendReportManagement1() {
		try {

			WebElement clickWebEelement = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(bbcTrenReportManagement_xpath));
			clickWebEelement.click();
		
			return true;
		} catch (Exception ex) {

		return false;
	}
}	
				  public boolean clickbbcTrendReportManagement()
					{
						try{

				WebElement clickWebEelement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(bbcTrenReportManagement_xpath));
							clickWebEelement.click();
							Set <String> handles =driver.getWindowHandles();
			    			Iterator<String> it = handles.iterator();
			    			//iterate through your windows
			    			while (it.hasNext()){
			    			String parent = it.next();
			    			String newwin = it.next();
			    			driver.switchTo().window(newwin);
							//Thread.sleep(2000);
							
					return true;
						}
						}
						catch(Exception ex){
							
						}
						return false;
					}		
//rohit
	public boolean clickbbcTrendReportManagement2() {
		try {

			WebElement clickWebEelement = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(bbcTrenReportManagement_xpath));
			clickWebEelement.click();
			
				return true;
			
		} catch (Exception ex) {

		}
		return false;
	}
				  
				  public boolean scrollToViewOtherCollateralAvailable()
					{
						try{
							 WebElement actual1=new WebDriverWait(driver,10)
				    		 .until(ExpectedConditions.visibilityOfElementLocated(inventoryAvailable_xpath));
				    		JavascriptExecutor jse1 = (JavascriptExecutor)driver;;
				    		jse1.executeScript("arguments[0].scrollIntoView(true);", actual1);  		
					        //Thread.sleep(3000);
					        return true;
							
						}
						catch(Exception e){
							
						}
						return false;
						
						}
				  
				  public boolean  verifyTotalAR(String  totalAR){
				    	try {
				    		WebElement displayWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(totalArReceivables_xpath));
				    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(totalArReceivablesValue_xpath));
				    		displayWebElement.isDisplayed();
				    		String actual = AmountWebElement.getText().trim();
				    		if (actual.equals(totalAR))
				    			return true;
				    		else
				    			return false;

				    	} catch (Exception e) {
				    		return false;
				    	}}	
				  
				  public boolean  verifyNetARAvailableForAdvanceMgmt(String  netARAvailableForAdvance){
				    	try {
				    		WebElement displayWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(netARAvailableForAdvanceMgmt_xpath));
				    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(netARAvailableForAdvanceValueMgmt_xpath));
				    		displayWebElement.isDisplayed();
				    		String actual = AmountWebElement.getText().trim();
				    		if (actual.equals(netARAvailableForAdvance))
				    			return true;
				    		else
				    			return false;

				    	} catch (Exception e) {
				    		return false;
				    	}}
				  
				  public boolean  verifyInventoryAvailableMgmt(String  inventoryAvailable){
				    	try {
				    		WebElement displayWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(inventoryAvailable_xpath));
				    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(inventoryAvailableValue_xpath));
				    		displayWebElement.isDisplayed();
				    		String actual = AmountWebElement.getText().trim();
				    		if (actual.equals(inventoryAvailable))
				    			return true;
				    		else
				    			return false;

				    	} catch (Exception e) {
				    		return false;
				    	}}
				  
				  public boolean  verifyNetInventoryAvailableForAdvanceMgmt(String  NetInventoryAvailableForAdvance){
				    	try {
				    		WebElement displayWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(NetInventoryAvailableForAdvanceMgmt_xapth));
				    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(NetInventoryAvailableForAdvanceValueMgmt_xapth));
				    		displayWebElement.isDisplayed();
				    		String actual = AmountWebElement.getText().trim();
				    		if (actual.equals(NetInventoryAvailableForAdvance))
				    			return true;
				    		else
				    			return false;

				    	} catch (Exception e) {
				    		return false;
				    	}}
				  
				  public boolean  verifyOtherCollateralAvailableMgmt(String  otherCollateralAvailable){
				    	try {
				    		WebElement displayWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(otherCollateralAvailableMgmt_xpath));
				    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(otherCollateralAvailableValueMgmt_xpath));
				    		displayWebElement.isDisplayed();
				    		String actual = AmountWebElement.getText().trim();
				    		if (actual.equals(otherCollateralAvailable))
				    			return true;
				    		else
				    			return false;

				    	} catch (Exception e) {
				    		return false;
				    	}}
				  
				  public boolean  verifyNetOtherCollateralAvailableForAdvance(String  netOtherCollateralAvailableForAdvance){
				    	try {
				    		WebElement displayWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(netOtherCollateralAvailableForAdvance_xpath));
				    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(netOtherCollateralAvailableForAdvanceValue_xpath));
				    		displayWebElement.isDisplayed();
				    		String actual = AmountWebElement.getText().trim();
				    		if (actual.equals(netOtherCollateralAvailableForAdvance))
				    			return true;
				    		else
				    			return false;

				    	} catch (Exception e) {
				    		return false;
				    	}}
				  
				  public boolean  verifyApprovedLinelessReserves(String  approvedLinelessReserves){
				    	try {
				    		WebElement displayWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(approvedLinelessReserves_xpath));
				    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(approvedLinelessReservesValue_xpath));
				    		displayWebElement.isDisplayed();
				    		String actual = AmountWebElement.getText().trim();
				    		if (actual.equals(approvedLinelessReserves))
				    			return true;
				    		else
				    			return false;

				    	} catch (Exception e) {
				    		return false;
				    	}}
				  
				  public boolean  verifyNetCollateralAvailableMgmt(String  netCollateralAvailableMgmt){
				    	try {
				    		WebElement displayWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(netCollateralAvailableMgmt_xpath));
				    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(netCollateralAvailableValueMgmt_xpath));
				    		displayWebElement.isDisplayed();
				    		String actual = AmountWebElement.getText().trim();
				    		if (actual.equals(netCollateralAvailableMgmt))
				    			return true;
				    		else
				    			return false;

				    	} catch (Exception e) {
				    		return false;
				    	}}
				  
				  public boolean scrollToViewApTotal()
					{
						try{
							 WebElement actual1=new WebDriverWait(driver,10)
				    		 .until(ExpectedConditions.visibilityOfElementLocated(apTotal_xpath));
				    		JavascriptExecutor jse1 = (JavascriptExecutor)driver;;
				    		jse1.executeScript("arguments[0].scrollIntoView(true);", actual1);  		
					        //Thread.sleep(3000);
					        return true;
							
						}
						catch(Exception e){
							
						}
						return false;
						
						}
				  
				  public boolean  verifyARTotal(String  aRTotal){
				    	try {
				    		WebElement displayWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(aRTotal_xpath));
				    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(aRTotalValue_xpath));
				    		displayWebElement.isDisplayed();
				    		String actual = AmountWebElement.getText().trim();
				    		if (actual.equals(aRTotal))
				    			return true;
				    		else
				    			return false;

				    	} catch (Exception e) {
				    		return false;
				    	}}
				  
				  public boolean  verifyApTotal(String  apTotal){
				    	try {
				    		WebElement displayWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(apTotal_xpath));
				    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(apTotalValue_xpath));
				    		displayWebElement.isDisplayed();
				    		String actual = AmountWebElement.getText().trim();
				    		if (actual.equals(apTotal))
				    			return true;
				    		else
				    			return false;

				    	} catch (Exception e) {
				    		return false;
				    	}}
				  
				  public boolean clickCollateralAnalysis()
					{
						try{

				WebElement clickWebEelement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(collateralAnalysisComparativeReport_xpath));
							clickWebEelement.click();
							Set <String> handles =driver.getWindowHandles();
			    			Iterator<String> it = handles.iterator();
			    			//iterate through your windows
			    			while (it.hasNext()){
			    			String parent = it.next();
			    			String newwin = it.next();
			    			driver.switchTo().window(newwin);
							////Thread.sleep(2000);
							
					return true;
						}
						}
						catch(Exception ex){
							
						}
						return false;
					}	

	// rohit
	public boolean clickCollateralAnalysis1() {
		try {

			WebElement clickWebEelement = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(collateralAnalysisComparativeReport_xpath));
			clickWebEelement.click();

			return true;

		} catch (Exception ex) {

		}
		return false;
	}
				  
				  
				  public boolean clickOnGenerateCollateralAnalysisReport()
					{
					try{
					WebElement WebEelement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(generateTrend_xpath));
					WebEelement.click();
					//Thread.sleep(5000);
					Set <String> handles =driver.getWindowHandles();
					Iterator<String> it = handles.iterator();
					//iterate through your windows
					while (it.hasNext()){
					String parent = it.next();
					String newwin = it.next();
					driver.switchTo().window(newwin);
					

					
					driver.findElement(By.xpath("//span[contains(text(),'COLLATERAL ANALYSIS - COMPARATIVE REPORT')]")).isDisplayed();
					System.out.println("Report name");
					}
					return true;}
					catch(Exception ex){
					return false;
					}}
//rohit
	public boolean clickOnGenerateCollateralAnalysisReport1() {
		try {
			WebElement WebEelement = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(generateTrend_xpath));
			WebEelement.click();
			return true;
		} catch (Exception ex) {
			return false;
		}
	}
				  
				  public boolean  verifyTotalARCollateral(String  totalAR){
				    	try {
				    		WebElement displayWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(totalArReceivables_xpath));
				    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(totalArReceivablesValueCollateral_xpath));
				    		displayWebElement.isDisplayed();
				    		String actual = AmountWebElement.getText().trim();
				    		if (actual.equals(totalAR))
				    			return true;
				    		else
				    			return false;

				    	} catch (Exception e) {
				    		return false;
				    	}}	
				  
				  public boolean  verifyNetARAvailableForAdvancecollateral(String  netARAvailableForAdvance){
				    	try {
				    		WebElement displayWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(netARAvailableForAdvanceMgmt_xpath));
				    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(netARAvailableForAdvanceValueCollateral_xpath));
				    		displayWebElement.isDisplayed();
				    		String actual = AmountWebElement.getText().trim();
				    		if (actual.equals(netARAvailableForAdvance))
				    			return true;
				    		else
				    			return false;

				    	} catch (Exception e) {
				    		return false;
				    	}}
				  
				  public boolean  verifyNetInventoryAvailableForAdvanceCollaateral(String  NetInventoryAvailableForAdvance){
				    	try {
				    		WebElement displayWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(NetInventoryAvailableForAdvanceMgmt_xapth));
				    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(NetInventoryAvailableForAdvanceValueCollateral_xapth));
				    		displayWebElement.isDisplayed();
				    		String actual = AmountWebElement.getText().trim();
				    		if (actual.equals(NetInventoryAvailableForAdvance))
				    			return true;
				    		else
				    			return false;

				    	} catch (Exception e) {
				    		return false;
				    	}}
				  
				  public boolean  verifyNetOtherCollateralAvailableForAdvanceCollateral(String NetOtherCollateralAvailableForAdvance){
				    	try {
				    		WebElement elementWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(NetOtherCollateralAvailableForAdvance_xpath));
				    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(netOtherCollateralAvailableForAdvanceValueCollateral_xpath));
				    		elementWebElement.isDisplayed();
				    		String actual = AmountWebElement.getText().trim();
				    		if (actual.equals(NetOtherCollateralAvailableForAdvance))
				    			return true;
				    		else
				    			return false;

				    	} catch (Exception e) {
				    		return false;
				    	}				    	
				    	}	
				  
				  
				  public boolean  verifyTotalAvailableForAdvancCollateral(String totalAvailableForAdvanc){
				    	try {
				    		WebElement elementWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(totalAvailableForAdvanceCollateral_xpath));
				    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(totalAvailableForAdvanceValueCollateral_xpath));
				    		elementWebElement.isDisplayed();
				    		String actual = AmountWebElement.getText().trim();
				    		if (actual.equals(totalAvailableForAdvanc))
				    			return true;
				    		else
				    			return false;

				    	} catch (Exception e) {
				    		return false;
				    	}				    	
				    	}	
				  
	// rohit
	public boolean verifyTotalAvailableForAdvancCollateral1(
			String totalAvailableForAdvanc) {
		try {
			WebElement elementWebElement = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(totalAvailableForAdvanceCollateral_xpath));
			WebElement AmountWebElement = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(totalAvailableForAdvanceValueCollateral1_xpath));
			elementWebElement.isDisplayed();
			String actual = AmountWebElement.getText().trim();
			if (actual.equals(totalAvailableForAdvanc))
				return true;
			else
				return false;

		} catch (Exception e) {
			return false;
		}
	}
				  
				  public boolean  verifyApprovedLineCollateral(String approvedLineCollateral){
				    	try {
				    		WebElement elementWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(approvedLineCollateral_xpath));
				    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(approvedLineCollateralValue_xpath));
				    		elementWebElement.isDisplayed();
				    		String actual = AmountWebElement.getText().trim();
				    		if (actual.equals(approvedLineCollateral))
				    			return true;
				    		else
				    			return false;

				    	} catch (Exception e) {
				    		return false;
				    	}				    	
				    	}	
				  
				  public boolean  verifyOSLoanBalanceLetterOfCredit(String oSLoanBalanceLetterOfCredit){
				    	try {
				    		WebElement elementWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(oSLoanBalanceLetterOfCredit_xpath));
				    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(oSLoanBalanceLetterOfCreditValue_xpath));
				    		elementWebElement.isDisplayed();
				    		String actual = AmountWebElement.getText().trim();
				    		if (actual.equals(oSLoanBalanceLetterOfCredit))
				    			return true;
				    		else
				    			return false;

				    	} catch (Exception e) {
				    		return false;
				    	}				    	
				    	}	
				  
				  public boolean  verifyNetCollateralAvailableCollateral(String  NetCollateralAvailable){
				    	try {
				    		WebElement displayWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(netCollateralAvailable_xpath));
				    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(netCollateralAvailableValueCollateral_xpath));
				    		displayWebElement.isDisplayed();
				    		String actual = AmountWebElement.getText().trim();
				    		if (actual.equals(NetCollateralAvailable))
				    			return true;
				    		else
				    			return false;

				    	} catch (Exception e) {
				    		return false;
				    	}
				    	
				    }	
				  
				  public boolean  verifyTradePayables(String tradePayables){
				    	try {
				    		WebElement elementWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(tradePayables_xpath));
				    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(tradePayablesValue_xpath));
				    		elementWebElement.isDisplayed();
				    		String actual = AmountWebElement.getText().trim();
				    		if (actual.equals(tradePayables))
				    			return true;
				    		else
				    			return false;

				    	} catch (Exception e) {
				    		return false;
				    	}				    	
				    	}	
				  
				  public boolean  verifyTotalAvailableBeforeSublimit(String totalAvailableBeforeSublimit){
				    	try {
				    		WebElement elementWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(totalAvailableBeforeSublimit_xpath));
				    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(totalAvailableBeforeSublimitValue_xpath));
				    		elementWebElement.isDisplayed();
				    		String actual = AmountWebElement.getText().trim();
				    		if (actual.equals(totalAvailableBeforeSublimit))
				    			return true;
				    		else
				    			return false;

				    	} catch (Exception e) {
				    		return false;
				    	}				    	
				    	}	
				  
				  public boolean scrollToViewTotalAvailableBeforeSublimit()
					{
						try{
							 WebElement actual1=new WebDriverWait(driver,10)
				    		 .until(ExpectedConditions.visibilityOfElementLocated(totalAvailableBeforeSublimit_xpath));
				    		JavascriptExecutor jse1 = (JavascriptExecutor)driver;;
				    		jse1.executeScript("arguments[0].scrollIntoView(true);", actual1);  		
					        //Thread.sleep(3000);
					        return true;
							
						}
						catch(Exception e){
							
						}
						return false;
						
						}
				  
				  public boolean  verifyCommitmentAmountCollateral(String CommitmentAmount){
				    	try {
				    		WebElement elementWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(commitmentAmount_xpath));
				    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(commitmentAmountValueCollateral_xpath));
				    		elementWebElement.isDisplayed();
				    		String actual = AmountWebElement.getText().trim();
				    		if (actual.equals(CommitmentAmount))
				    			return true;
				    		else
				    			return false;

				    	} catch (Exception e) {
				    		return false;
				    	}				    	
				    	}
				  
				  public boolean  verifyAnalysisNameReceivables(String advance,String sublimit){
				    	try {
				    		WebElement elementWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(receivablesTrend_xpath));
				    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(receivablesTrendAdvanceCollateral_xpath));
				    		WebElement sublimitWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(receivablesTrendSubLimitCollateral_xpath));	    		
				    		elementWebElement.isDisplayed();
				    		
				    		String advanceA = AmountWebElement.getText().trim();
				    		String sublimitA = sublimitWebElement.getText().trim();
				    		
				    		if (advanceA.equals(advance))
				    		{
				    			if (sublimitA.equals(sublimit)) 
				    			{
				    				return true;
								}
				    			else
				    				return false;
				    		}
				    		else
				    			return false;

				    	} catch (Exception e) {
				    		return false;
				    	}				    	
				    	}
				 
				 public boolean  verifyAnalysisNameInventory(String Inventoryadvance,String Inventorysublimit){
				    	try {
				    		WebElement elementWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(inventoryTrend_xpath));
				    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(inventoryTrendAdvancecollateral_xpath));
				    		WebElement sublimitWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(inventoryTrendSublimitcollateral_xpath));	    		
				    		elementWebElement.isDisplayed();
				    		
				    		String advanceA = AmountWebElement.getText().trim();
				    		String sublimitA = sublimitWebElement.getText().trim();
				    		
				    		if (advanceA.equals(Inventoryadvance))
				    		{
				    			if (sublimitA.equals(Inventorysublimit)) 
				    			{
				    				return true;
								}
				    			else
				    				return false;
				    		}
				    		else
				    			return false;

				    	} catch (Exception e) {
				    		return false;
				    	}				    	
				    	}
				 
				 public boolean  verifyAnalysisNameOtherCollateral(String collateraladvance,String collateralsublimit){
				    	try {
				    		WebElement elementWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(otherCollateralTrend_xpath));
				    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(otherCollateralAdvanceCollateral_xpath));
				    		WebElement sublimitWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(otherCollateralSublimitcollateral_xpath));    		
				    		elementWebElement.isDisplayed();
				    		
				    		String advanceA = AmountWebElement.getText().trim();
				    		String sublimitA = sublimitWebElement.getText().trim();
				    		
				    		if (advanceA.equals(collateraladvance))
				    		{
				    			if (sublimitA.equals(collateralsublimit)) 
				    			{
				    				return true;
								}
				    			else
				    				return false;
				    		}
				    		else
				    			return false;

				    	} catch (Exception e) {
				    		return false;
				    	}				    	
				    	}
				 
				//bbc report
					public boolean  Click_on_BBCReport()
					{
					try{
						WebElement HeaderWebEelement=new WebDriverWait(driver,10)
							.until(ExpectedConditions.visibilityOfElementLocated(BBCReport_xpath));
						HeaderWebEelement.click();
						//Thread.sleep(5000);
						return true;
					}
					catch(Exception ex){
						return false;

					}

					}
					
					public boolean Click_on_BBCstatus(String sw) {
						try {
							WebElement accTypeDropdownWebEelement = new WebDriverWait(driver, 10)
							.until(ExpectedConditions.visibilityOfElementLocated(BBCStatus_xpath));
							Select sel = new Select(accTypeDropdownWebEelement);
							//sel.selectByVisibleText(sw);
							List<WebElement> list = sel.getOptions();
							for (WebElement ele : list) {
								if (ele.getText().equals(sw)) {
									ele.click();
									////Thread.sleep(5000);
									break;
								}
							}
							return true;} 
						catch (Exception ex) {
						}
						return false;

					}
public boolean verifyDropdownIneligible3()
					 {
try{
WebElement WebEelement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(htmlButton_xpath));
WebEelement.click();
//Thread.sleep(2000);
Set <String> handles =driver.getWindowHandles();
Iterator<String> it = handles.iterator();
//iterate through your windows
while (it.hasNext()){
String parent = it.next();
String newwin = it.next();
driver.switchTo().window(newwin);
//
 
//Eligible AR
 

WebElement HeaderWebEelement=new WebDriverWait(driver,10)
.until(ExpectedConditions.visibilityOfElementLocated(value1_xpath));
HeaderWebEelement.isDisplayed();
 
 

driver.switchTo().defaultContent();
 
}
return true;}
catch(Exception ex){
return false;
}}             
        
	public boolean verifyDropdown(){
     try{
     WebElement WebEelement=new WebDriverWait(driver,50)
     .until(ExpectedConditions.visibilityOfElementLocated(htmlButton_xpath));
     WebEelement.click();
     Thread.sleep(1000);
     Set <String> handles =driver.getWindowHandles();
     Iterator<String> it = handles.iterator();
     //iterate through your windows
     while (it.hasNext()){
     String parent = it.next();
     String newwin = it.next();
     driver.switchTo().window(newwin);
     //
     
    //aged past
      WebElement HeaderWebEelement=new WebDriverWait(driver,10)
       .until(ExpectedConditions.visibilityOfElementLocated(agedpastdue_xpath));
      HeaderWebEelement.isDisplayed();


     
     
     driver.switchTo().defaultContent();
     
     }
     return true;}
     catch(Exception ex){
     return false;
     }}



				 
				 
				 //Maintain AR
				 public boolean verifyArApConcReportAllValuesMaintainAr(String expected,String asOfDate,String clientname,String accName,String perOfTotalAr,String total,String future,String current,String over30,String over60,String over90,String over120)
					{
						try{
							WebElement WebEelement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(htmlButton_xpath));
							WebEelement.click();
							Thread.sleep(500);
							Set <String> handles =driver.getWindowHandles();
							Iterator<String> it = handles.iterator();
							//iterate through your windows
							while (it.hasNext()){
							String parent = it.next();
							String newwin = it.next();
							driver.switchTo().window(newwin);
							Thread.sleep(500);
							//
							
							WebElement reportHeader=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(headerReport_xpath));
							reportHeader.isDisplayed();
							System.out.println("Report header");
							
							driver.findElement(By.xpath("//h2[text()='Debtors Concentrations as of:" +asOfDate+ "']")).isDisplayed();	
							System.out.println("As Of date");
							
							driver.findElement(By.xpath("//h2[text()='" +clientname +"']")).isDisplayed();	
							System.out.println("Client name");
					
					WebElement accNameWebElement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(accountNameArAp_xpath));
					accNameWebElement.getText().equalsIgnoreCase(accName);
					System.out.println("Account name");
					
					WebElement perOfTotalArWebelement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(PercOfTotalARArAp_xpath));
					perOfTotalArWebelement.getText().trim().equalsIgnoreCase(perOfTotalAr);
					System.out.println("% of total AR");
					
					WebElement totalWebelement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(totalarAp_xpath));
					totalWebelement.getText().trim().equalsIgnoreCase(total);
					System.out.println("Total");
					
					WebElement futureWebElement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(futureArApp_xapth));
					futureWebElement.getText().trim().equalsIgnoreCase(future);
					System.out.println("Future");
					
					WebElement currentWebElement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(currentArApp_xapth));
					currentWebElement.getText().trim().equalsIgnoreCase(current);
					System.out.println("Current");
					
					WebElement over30WebElement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(over30ArApp_xpath));
					over30WebElement.getText().equalsIgnoreCase(over30);
					System.out.println("over30");
					
					WebElement over60Webelement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(over60ArApp_xpath));
					over60Webelement.getText().equalsIgnoreCase(over60);
					System.out.println("over60");
					
					WebElement over90Webelement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(over90ArApp_xpath));
					over90Webelement.getText().equalsIgnoreCase(over90);
					System.out.println("over90");
					
					WebElement over120Webelement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(over120ArApp_xpath));
					over120Webelement.getText().equalsIgnoreCase(over120);
					System.out.println("over120");
					
							
				
					driver.close();
					driver.switchTo().window(parent);
							
					
					return true;}
						}
					catch(Exception ex){
					return false;
					}
						return false;}

	//rohit
				 
	public boolean verifyArApConcReportAllValuesMaintainAr1(String expected,
			String asOfDate, String clientname, String accName,
			String perOfTotalAr, String total, String future, String current,
			String over30, String over60, String over90, String over120) {
		try {

			WebElement reportHeader = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(headerReport_xpath));
			reportHeader.isDisplayed();
			System.out.println("Report header");

			driver.findElement(
					By.xpath("//h2[text()='Debtors Concentrations as of:"
							+ asOfDate + "']")).isDisplayed();
			System.out.println("As Of date");

			driver.findElement(
					By.xpath("//h2[text()='" + clientname.toUpperCase() + "']"))
					.isDisplayed();
			System.out.println("Client name");

			WebElement accNameWebElement = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(accountNameArAp_xpath));
			accNameWebElement.getText().equalsIgnoreCase(accName);
			System.out.println("Account name");

			WebElement perOfTotalArWebelement = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(PercOfTotalARArAp_xpath));
			perOfTotalArWebelement.getText().trim()
					.equalsIgnoreCase(perOfTotalAr);
			System.out.println("% of total AR");

			WebElement totalWebelement = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(totalarAp_xpath));
			totalWebelement.getText().trim().equalsIgnoreCase(total);
			System.out.println("Total");

			WebElement futureWebElement = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(futureArApp_xapth));
			futureWebElement.getText().trim().equalsIgnoreCase(future);
			System.out.println("Future");

			WebElement currentWebElement = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(currentArApp_xapth));
			currentWebElement.getText().trim().equalsIgnoreCase(current);
			System.out.println("Current");

			WebElement over30WebElement = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(over30ArApp_xpath));
			over30WebElement.getText().equalsIgnoreCase(over30);
			System.out.println("over30");

			WebElement over60Webelement = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(over60ArApp_xpath));
			over60Webelement.getText().equalsIgnoreCase(over60);
			System.out.println("over60");

			WebElement over90Webelement = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(over90ArApp_xpath));
			over90Webelement.getText().equalsIgnoreCase(over90);
			System.out.println("over90");

			WebElement over120Webelement = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(over120ArApp_xpath));
			over120Webelement.getText().equalsIgnoreCase(over120);
			System.out.println("over120");

			return true;
		} catch (Exception ex) {
			return false;
		}
	}
				 
	//rohit			 
	public boolean clickHTMLLink() {
		try {
			WebElement WebEelement = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(htmlButton_xpath));
			WebEelement.click();
			return true;
		} catch (Exception e) {
			return false;
		}
	}
   //rohit
	public boolean switchWindow() {
		try {
			Set<String> handles = driver.getWindowHandles();
			if (handles.size() > 1) {
				Iterator<String> it = handles.iterator();
				while (it.hasNext()) {
					String parent = it.next();
					String newwin = it.next();
					driver.switchTo().window(newwin);
				}
				System.out.println(driver.getCurrentUrl());
			}
			System.out.println("not required");
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	//rohit
	
	public boolean closeChildWindow() {
		try {
			Set<String> handles = driver.getWindowHandles();
			if (handles.size() > 1) {
				Iterator<String> it = handles.iterator();
				while (it.hasNext()) {
					String parent = it.next();
					String newwin = it.next();
					driver.switchTo().window(newwin);

					driver.switchTo().window(newwin).close();
					driver.switchTo().window(parent);
				}
	   		}
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	
				 
	//rohit
	public boolean verifyReportAllValuesMaintainAr1(String expected,
			String asOfDate, String clientname, String accNo, String accName,
			String future, String current, String over30, String over60,
			String over90, String over120, String total) {
		try {

			WebElement reportHeader = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(headerReport_xpath));
			reportHeader.isDisplayed();
			System.out.println("Report header");

			driver.findElement(
					By.xpath("//h2[text()='Receivables Aged Trial Balance for Summary as of: "
							+ asOfDate + "']")).isDisplayed();
			System.out.println("As Of date");

			driver.findElement(By.xpath("//h2[text()='" + clientname.toUpperCase() + "']"))
					.isDisplayed();
			System.out.println("Client name");

			WebElement accNoWebElement = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(accountNo_xpath));
			accNoWebElement.getText().equalsIgnoreCase(accNo);
			System.out.println("Account number");

			WebElement accNameWebElement = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(accname_xpath));
			accNameWebElement.getText().equalsIgnoreCase(accName);
			System.out.println("Account name");

			WebElement futureWebElement = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(futureAr_xpath));
			futureWebElement.getText().equalsIgnoreCase(future);
			System.out.println("Future");

			WebElement currentWebElement = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(currentAr_xapth));
			currentWebElement.getText().equalsIgnoreCase(current);
			System.out.println("Current");

			WebElement over30WebElement = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(over30Ar_xpath));
			over30WebElement.getText().equalsIgnoreCase(over30);
			System.out.println("over30");

			WebElement over60Webelement = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(over60Ar_xpath));
			over60Webelement.getText().equalsIgnoreCase(over60);
			System.out.println("over60");

			WebElement over90Webelement = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(over90Ar_xpath));
			over90Webelement.getText().equalsIgnoreCase(over90);
			System.out.println("over90");

			WebElement over120Webelement = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(over120Ar_xpath));
			over120Webelement.getText().equalsIgnoreCase(over120);
			System.out.println("over120");

			WebElement totalWebelement = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(totalAr_xpath));
			totalWebelement.getText().equalsIgnoreCase(total);
			System.out.println("Total");

			return true;
		}

		catch (Exception ex) {
			return false;
		}
	}
	
	
	
	
	public boolean verifyReportAllValuesMaintainAr(String expected,String asOfDate,String clientname,String accNo,String accName,String future,String current,String over30,String over60,String over90,String over120,String total)
					{
					try{
					WebElement WebEelement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(htmlButton_xpath));
					WebEelement.click();
					Thread.sleep(2000);
					 Set <String> handles =driver.getWindowHandles();
						Iterator<String> it = handles.iterator();
						//iterate through your windows
						while (it.hasNext()){
						String parent = it.next();
						String newwin = it.next();
						driver.switchTo().window(newwin);
					//
					
					WebElement reportHeader=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(headerReport_xpath));
					reportHeader.isDisplayed();
					System.out.println("Report header");
					
					driver.findElement(By.xpath("//h2[text()='Receivables Aged Trial Balance for Summary as of: " +asOfDate+ "']")).isDisplayed();	
					System.out.println("As Of date");
					
					driver.findElement(By.xpath("//h2[text()='" +clientname +"']")).isDisplayed();	
					System.out.println("Client name");
					
					
					WebElement accNoWebElement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(accountNo_xpath));
					accNoWebElement.getText().equalsIgnoreCase(accNo);
					System.out.println("Account number");
					
					WebElement accNameWebElement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(accname_xpath));
					accNameWebElement.getText().equalsIgnoreCase(accName);
					System.out.println("Account name");
					
					WebElement futureWebElement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(futureAr_xpath));
					futureWebElement.getText().equalsIgnoreCase(future);
					System.out.println("Future");
					
					WebElement currentWebElement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(currentAr_xapth));
					currentWebElement.getText().equalsIgnoreCase(current);
					System.out.println("Current");
					
					WebElement over30WebElement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(over30Ar_xpath));
					over30WebElement.getText().equalsIgnoreCase(over30);
					System.out.println("over30");
					
					WebElement over60Webelement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(over60Ar_xpath));
					over60Webelement.getText().equalsIgnoreCase(over60);
					System.out.println("over60");
					
					WebElement over90Webelement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(over90Ar_xpath));
					over90Webelement.getText().equalsIgnoreCase(over90);
					System.out.println("over90");
					
					WebElement over120Webelement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(over120Ar_xpath));
					over120Webelement.getText().equalsIgnoreCase(over120);
					System.out.println("over120");
					
					WebElement totalWebelement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(totalAr_xpath));
					totalWebelement.getText().equalsIgnoreCase(total);
					System.out.println("Total");
					
				
					driver.switchTo().window(newwin).close();
					driver.switchTo().window(parent);
					
					}
					return true;}
					catch(Exception ex){
					return false;
					}}
		
				 
				 
				 
				 
				 public boolean clickOnARSummaryDetailAging()
					{
						try{

							WebElement ReportWebEelement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(aRSummaryDetailAging_xpath));
							ReportWebEelement.click();
							Thread.sleep(500);
							
					return true;
						}
					catch (Exception ex) {
					}
					return false;

					}				 
				 
				 public boolean enterAsOfDate(String asOfDate)
					{
						try{

							WebElement ReportWebEelement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(asOfDate_xpath));
							ReportWebEelement.sendKeys(asOfDate);
							Thread.sleep(500);
							
					return true;
						}
					catch (Exception ex) {
					}
					return false;

					}		
				 
				 
				 public boolean verifyReportAllValuesInARDetailedAging(String expected,String asOfDate,String clientname,String accNo,String accName,String documentNo,String invoiceDate,String future,String current,String over30,String over60,String over90,String over120,String total)

					{
					try{
					WebElement WebEelement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(htmlButton_xpath));
					WebEelement.click();
					//Thread.sleep(5000);
					Set <String> handles =driver.getWindowHandles();
					Iterator<String> it = handles.iterator();
					//iterate through your windows
					while (it.hasNext()){

						String parent = it.next();
						String newwin = it.next();
						driver.switchTo().window(newwin);
					//
					
					WebElement reportHeader=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(headerReport_xpath));
					reportHeader.isDisplayed();
					System.out.println("Report header");
					
					driver.findElement(By.xpath("//h2[text()='AR Detailed Aging as of: " +asOfDate+ "']")).isDisplayed();	
					System.out.println("As Of date");
					
					driver.findElement(By.xpath("//h2[text()='" +clientname +"']")).isDisplayed();	
					System.out.println("Client name");		
					
					WebElement accNoWebElement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(accountNoDetail_xpath));
					accNoWebElement.getText().equalsIgnoreCase(accNo);
					System.out.println("Account no");
					
					WebElement accNameWebElement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(accountNameDetail_xpath));
					accNameWebElement.getText().equalsIgnoreCase(accName);
					System.out.println("Account name");
					
					WebElement documentWebelement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(documentNoDetail_xpath));
					documentWebelement.getText().trim().equalsIgnoreCase(documentNo);
					System.out.println("documentNo");
					
					WebElement dateWebElement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(invoiceDate_xpath));
					dateWebElement.getText().equalsIgnoreCase(invoiceDate);
					System.out.println("invoiceDate");
					
					WebElement futureWebElement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(futureDetail_xpath));
					futureWebElement.getText().trim().equalsIgnoreCase(future);
					System.out.println("Future");
					
					WebElement currentWebElement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(currentDetail_xpath));
					currentWebElement.getText().trim().equalsIgnoreCase(current);
					System.out.println("Current");
					
					WebElement over30WebElement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(over30Detail_xpath));
					over30WebElement.getText().equalsIgnoreCase(over30);
					System.out.println("over30");
					
					WebElement over60Webelement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(over60Detail_xpath));
					over60Webelement.getText().equalsIgnoreCase(over60);
					System.out.println("over60");
					
					WebElement over90Webelement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(over90Detail_xpath));
					over90Webelement.getText().equalsIgnoreCase(over90);
					System.out.println("over90");
					
					WebElement over120Webelement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(over120Detail_xpath));
					over120Webelement.getText().equalsIgnoreCase(over120);
					System.out.println("over120");
					
					WebElement totalWebelement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(totalDetail_xpath));
					totalWebelement.getText().equalsIgnoreCase(total);
					System.out.println("total");
					
						
						driver.close();
						driver.switchTo().window(parent);
						
					
					}
					return true;}
					catch(Exception ex){
					return false;
					}}

	// rohit
	public boolean verifyReportAllValuesInARDetailedAging1(String expected,
			String asOfDate, String clientname, String accNo, String accName,
			String documentNo, String invoiceDate, String future,
			String current, String over30, String over60, String over90,
			String over120, String total)

	{
		try {

			WebElement reportHeader = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(headerReport_xpath));
			reportHeader.isDisplayed();
			System.out.println("Report header");

			driver.findElement(
					By.xpath("//h2[text()='AR Detailed Aging as of: "
							+ asOfDate + "']")).isDisplayed();
			System.out.println("As Of date");

			driver.findElement(By.xpath("//h2[text()='" + clientname.toUpperCase() + "']"))
					.isDisplayed();
			System.out.println("Client name");

			WebElement accNoWebElement = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(accountNoDetail_xpath));
			accNoWebElement.getText().equalsIgnoreCase(accNo);
			System.out.println("Account no");

			WebElement accNameWebElement = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(accountNameDetail_xpath));
			accNameWebElement.getText().equalsIgnoreCase(accName);
			System.out.println("Account name");

			WebElement documentWebelement = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(documentNoDetail_xpath));
			documentWebelement.getText().trim().equalsIgnoreCase(documentNo);
			System.out.println("documentNo");

			WebElement dateWebElement = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(invoiceDate_xpath));
			dateWebElement.getText().equalsIgnoreCase(invoiceDate);
			System.out.println("invoiceDate");

			WebElement futureWebElement = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(futureDetail_xpath));
			futureWebElement.getText().trim().equalsIgnoreCase(future);
			System.out.println("Future");

			WebElement currentWebElement = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(currentDetail_xpath));
			currentWebElement.getText().trim().equalsIgnoreCase(current);
			System.out.println("Current");

			WebElement over30WebElement = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(over30Detail_xpath));
			over30WebElement.getText().equalsIgnoreCase(over30);
			System.out.println("over30");

			WebElement over60Webelement = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(over60Detail_xpath));
			over60Webelement.getText().equalsIgnoreCase(over60);
			System.out.println("over60");

			WebElement over90Webelement = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(over90Detail_xpath));
			over90Webelement.getText().equalsIgnoreCase(over90);
			System.out.println("over90");

			WebElement over120Webelement = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(over120Detail_xpath));
			over120Webelement.getText().equalsIgnoreCase(over120);
			System.out.println("over120");

			WebElement totalWebelement = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(totalDetail_xpath));
			totalWebelement.getText().equalsIgnoreCase(total);
			System.out.println("total");

			return true;
		} catch (Exception ex) {
			return false;
		}
	}
				 
				 
				 public boolean verifyReportAllValuesInARDetailedAgingSummary(String expected,String asOfDate,String clientname,String accNo,String accName,String future,String current,String over30,String over60,String over90,String over120,String total)
					{
					 try{
							WebElement WebEelement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(htmlButton_xpath));
							WebEelement.click();
							//Thread.sleep(5000);
							Set <String> handles =driver.getWindowHandles();
							Iterator<String> it = handles.iterator();
							//iterate through your windows
							while (it.hasNext()){
								String newwin = it.next();
								String parent = it.next();
								driver.switchTo().window(newwin);
					//
					
					WebElement reportHeader=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(headerReport_xpath));
					reportHeader.isDisplayed();
					System.out.println("Report header");
					
					driver.findElement(By.xpath("//h2[text()='AR Summary Aging as of: " +asOfDate+ "']")).isDisplayed();	
					System.out.println("As Of date");
					
					driver.findElement(By.xpath("//h2[text()='" +clientname +"']")).isDisplayed();	
					System.out.println("Client name");		
					
					WebElement accNoWebElement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(accountNoDetail_xpath));
					accNoWebElement.getText().equalsIgnoreCase(accNo);
					System.out.println("Account no");
					
					WebElement accNameWebElement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(accountNameDetail_xpath));
					accNameWebElement.getText().equalsIgnoreCase(accName);
					System.out.println("Account name");
					
					WebElement futureWebElement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(futureDetailSumm_xpath));
					futureWebElement.getText().trim().equalsIgnoreCase(future);
					System.out.println("Future");
					
					WebElement currentWebElement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(currentDetailSumm_xpath));
					currentWebElement.getText().trim().equalsIgnoreCase(current);
					System.out.println("Current");
					
					WebElement over30WebElement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(over30DetailSumm_xpath));
					over30WebElement.getText().equalsIgnoreCase(over30);
					System.out.println("over30");
					
					WebElement over60Webelement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(over60DetailSumm_xpath));
					over60Webelement.getText().equalsIgnoreCase(over60);
					System.out.println("over60");
					
					WebElement over90Webelement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(over90DetailSumm_xpath));
					over90Webelement.getText().equalsIgnoreCase(over90);
					System.out.println("over90");
					
					WebElement over120Webelement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(over120DetailSumm_xpath));
					over120Webelement.getText().equalsIgnoreCase(over120);
					System.out.println("over120");
					
					WebElement totalWebelement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(totalDetailSumm_xpath));
					totalWebelement.getText().equalsIgnoreCase(total);
					System.out.println("total");

					
					driver.close();
					driver.switchTo().window(parent);
					
					
					}
					return true;}
					catch(Exception ex){
					return false;
					}}

	// rohit
	public boolean verifyReportAllValuesInARDetailedAgingSummary1(
			String expected, String asOfDate, String clientname, String accNo,
			String accName, String future, String current, String over30,
			String over60, String over90, String over120, String total) {
		try {
			WebElement reportHeader = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(headerReport_xpath));
			reportHeader.isDisplayed();
			System.out.println("Report header");

			driver.findElement(
					By.xpath("//h2[text()='AR Summary Aging as of: " + asOfDate
							+ "']")).isDisplayed();
			System.out.println("As Of date");

			driver.findElement(By.xpath("//h2[text()='" + clientname.toUpperCase() + "']"))
					.isDisplayed();
			System.out.println("Client name");

			WebElement accNoWebElement = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(accountNoDetail_xpath));
			accNoWebElement.getText().equalsIgnoreCase(accNo);
			System.out.println("Account no");

			WebElement accNameWebElement = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(accountNameDetail_xpath));
			accNameWebElement.getText().equalsIgnoreCase(accName);
			System.out.println("Account name");

			WebElement futureWebElement = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(futureDetailSumm_xpath));
			futureWebElement.getText().trim().equalsIgnoreCase(future);
			System.out.println("Future");

			WebElement currentWebElement = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(currentDetailSumm_xpath));
			currentWebElement.getText().trim().equalsIgnoreCase(current);
			System.out.println("Current");

			WebElement over30WebElement = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(over30DetailSumm_xpath));
			over30WebElement.getText().equalsIgnoreCase(over30);
			System.out.println("over30");

			WebElement over60Webelement = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(over60DetailSumm_xpath));
			over60Webelement.getText().equalsIgnoreCase(over60);
			System.out.println("over60");

			WebElement over90Webelement = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(over90DetailSumm_xpath));
			over90Webelement.getText().equalsIgnoreCase(over90);
			System.out.println("over90");

			WebElement over120Webelement = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(over120DetailSumm_xpath));
			over120Webelement.getText().equalsIgnoreCase(over120);
			System.out.println("over120");

			WebElement totalWebelement = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(totalDetailSumm_xpath));
			totalWebelement.getText().equalsIgnoreCase(total);
			System.out.println("total");

			return true;
		} catch (Exception ex) {
			return false;
		}
	}
				  
				 public boolean clickStyle()
					{
						try{

				WebElement clickWebEelement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(styledisplay_xpath));
							clickWebEelement.click();
							Thread.sleep(500);
							
					return true;
						}
						catch(Exception ex){
							return false;
						}
					}		
				 //
				 public boolean  verifyNetOtherAvailableForAdvanceBbcU(String  netOtherAvailableForAdvance){
				    	try {
				    		WebElement displayWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(netOtherAvailableForAdvance_xpath));
				    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(netOtherAvailableForAdvanceBbcValuee_xpath));
				    		displayWebElement.isDisplayed();
				    		String actual = AmountWebElement.getText().trim();
				    		if (actual.equals(netOtherAvailableForAdvance))
				    			return true;
				    		else
				    			return false;

				    	} catch (Exception e) {
				    		return false;
				    	}
				    	
				    }	
				 public boolean  verifyTotalAvailableForAdvanceBbcU(String  totalAvailableForAdvance){
				    	try {
				    		WebElement displayWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(totalAvailableForAdvance_xpath));
				    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(totalAvailableForAdvanceBbcValuee_xpath));
				    		displayWebElement.isDisplayed();
				    		String actual = AmountWebElement.getText().trim();
				    		if (actual.equals(totalAvailableForAdvance))
				    			return true;
				    		else
				    			return false;

				    	} catch (Exception e) {
				    		return false;
				    	}
				    	
				    }	
				 
				 public boolean  verifyLineLimitWithReservesBbcU(String  lineLimitWithReserves){
				    	try {
				    		WebElement displayWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(lineLimitWithReserves_xpath));
				    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(lineLimitWithReservesValuee_xpath));
				    		displayWebElement.isDisplayed();
				    		String actual = AmountWebElement.getText().trim();
				    		if (actual.equals(lineLimitWithReserves))
				    			return true;
				    		else
				    			return false;

				    	} catch (Exception e) {
				    		return false;
				    	}
				    	
				    }	

		//

					public boolean verifyReportAllValuesInPayablesAgedTrialBalanceApproved(String expected,String asOfDate,String clientname,String accNo,String accName,String future,String current,String over30,String over60,String over90,String over120,String total)
					{
					try{
					WebElement WebEelement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(htmlButton_xpath));
					WebEelement.click();
					//Thread.sleep(5000);
					Set <String> handles =driver.getWindowHandles();
					Iterator<String> it = handles.iterator();
					//iterate through your windows
					while (it.hasNext()){
					String parent = it.next();
					String newwin = it.next();
					driver.switchTo().window(newwin);
					//
					
					WebElement reportHeader=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(headerReport_xpath));
					reportHeader.isDisplayed();
					System.out.println("Report header");
					
					driver.findElement(By.xpath("//h2[text()='Payables Aged Trial Balance as of: " +asOfDate+ "']")).isDisplayed();	
					System.out.println("As Of date");
					
					driver.findElement(By.xpath("//h2[text()='" +clientname +"']")).isDisplayed();	
					System.out.println("Client name");
					
					
					WebElement accNoWebElement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(accountNo_xpath));
					accNoWebElement.getText().equalsIgnoreCase(accNo);
					System.out.println("Account number");
					
					WebElement accNameWebElement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(accname_xpath));
					accNameWebElement.getText().equalsIgnoreCase(accName);
					System.out.println("Account name");
					
					WebElement futureWebElement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(future_xpath));
					futureWebElement.getText().equalsIgnoreCase(future);
					System.out.println("Future");
					
					WebElement currentWebElement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(current_xapth));
					currentWebElement.getText().equalsIgnoreCase(current);
					System.out.println("Current");
					
					WebElement over30WebElement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(over30_xpath));
					over30WebElement.getText().equalsIgnoreCase(over30);
					System.out.println("over30");
					
					WebElement over60Webelement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(over60_xpath));
					over60Webelement.getText().equalsIgnoreCase(over60);
					System.out.println("over60");
					
					WebElement over90Webelement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(over90_xpath));
					over90Webelement.getText().equalsIgnoreCase(over90);
					System.out.println("over90");
					
					WebElement over120Webelement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(over120_xpath));
					over120Webelement.getText().equalsIgnoreCase(over120);
					System.out.println("over120");
					

					
					WebElement totalWebelement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(totalAAr_xpath));
					totalWebelement.getText().equalsIgnoreCase(total);
					System.out.println("Total");
					
					

					driver.switchTo().defaultContent();
					
					}
					return true;}
					catch(Exception ex){
					return false;
					}
					}
					


					



				 //ineligble customer

				
					public boolean verifyinelibyreasonreport()

					{
try{
WebElement WebEelement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(htmlButton_xpath));
WebEelement.click();
//Thread.sleep(5000);
Set <String> handles =driver.getWindowHandles();
Iterator<String> it = handles.iterator();
//iterate through your windows
while (it.hasNext()){
String parent = it.next();
String newwin = it.next();
driver.switchTo().window(newwin);
//

//inEligible AR

WebElement HeaderWebEelement=new WebDriverWait(driver,10)
.until(ExpectedConditions.visibilityOfElementLocated(total2_xpath));
HeaderWebEelement.isDisplayed();




driver.switchTo().defaultContent();

}
return true;}
catch(Exception ex){
return false;
}}
		
					public boolean verifyineligiblereport()

					{
try{
WebElement WebEelement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(htmlButton_xpath));
WebEelement.click();
//Thread.sleep(5000);
Set <String> handles =driver.getWindowHandles();
Iterator<String> it = handles.iterator();
//iterate through your windows
while (it.hasNext()){
String parent = it.next();
String newwin = it.next();
driver.switchTo().window(newwin);
//

//inEligible AR

WebElement HeaderWebEelement=new WebDriverWait(driver,10)
.until(ExpectedConditions.visibilityOfElementLocated(total2_xpath));
HeaderWebEelement.isDisplayed();




driver.switchTo().defaultContent();

}
return true;}
catch(Exception ex){
return false;
}}
					public boolean verifyineligiblereportbydebtor()

					{
  try{
  WebElement WebEelement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(htmlButton_xpath));
  WebEelement.click();
  //Thread.sleep(5000);
  Set <String> handles =driver.getWindowHandles();
  Iterator<String> it = handles.iterator();
  //iterate through your windows
  while (it.hasNext()){
  String parent = it.next();
  String newwin = it.next();
  driver.switchTo().window(newwin);
  //
  
 //Eligible AR
  
   WebElement HeaderWebEelement=new WebDriverWait(driver,10)
    .until(ExpectedConditions.visibilityOfElementLocated(total3_xpath));
   HeaderWebEelement.isDisplayed();


  
  
  driver.switchTo().defaultContent();
  
  }
  return true;}
  catch(Exception ex){
  return false;
  }}
					public boolean verifyineligibleanalysisreport1()

					{
try{
WebElement WebEelement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(htmlButton_xpath));
WebEelement.click();
//Thread.sleep(5000);
Set <String> handles =driver.getWindowHandles();
Iterator<String> it = handles.iterator();
//iterate through your windows
while (it.hasNext()){
String parent = it.next();
String newwin = it.next();
driver.switchTo().window(newwin);
//

//inEligible AR

WebElement HeaderWebEelement=new WebDriverWait(driver,10)
.until(ExpectedConditions.visibilityOfElementLocated(retentionreason5_xpath));
HeaderWebEelement.isDisplayed();




driver.switchTo().defaultContent();

}
return true;}
catch(Exception ex){
return false;
}}
					public boolean verifyineligibleanalysisreport()

					{
try{
WebElement WebEelement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(htmlButton_xpath));
WebEelement.click();
//Thread.sleep(5000);
Set <String> handles =driver.getWindowHandles();
Iterator<String> it = handles.iterator();
//iterate through your windows
while (it.hasNext()){
String parent = it.next();
String newwin = it.next();
driver.switchTo().window(newwin);
//

//inEligible AR

WebElement HeaderWebEelement=new WebDriverWait(driver,10)
.until(ExpectedConditions.visibilityOfElementLocated(retention2_xpath));
HeaderWebEelement.isDisplayed();




driver.switchTo().defaultContent();

}
return true;}
catch(Exception ex){
return false;
}}
					public boolean verifyineligibleanalysisreportbydebtor1()

					{
try{
WebElement WebEelement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(htmlButton_xpath));
WebEelement.click();
//Thread.sleep(5000);
Set <String> handles =driver.getWindowHandles();
Iterator<String> it = handles.iterator();
//iterate through your windows
while (it.hasNext()){
String parent = it.next();
String newwin = it.next();
driver.switchTo().window(newwin);
//

//inEligible AR

WebElement HeaderWebEelement=new WebDriverWait(driver,10)
.until(ExpectedConditions.visibilityOfElementLocated(retentionreason6_xpath));
HeaderWebEelement.isDisplayed();




driver.switchTo().defaultContent();

}
return true;}
catch(Exception ex){
return false;
}}
					public boolean verifyineligibleanalysisreportbydebtor()

					{
try{
WebElement WebEelement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(htmlButton_xpath));
WebEelement.click();
//Thread.sleep(5000);
Set <String> handles =driver.getWindowHandles();
Iterator<String> it = handles.iterator();
//iterate through your windows
while (it.hasNext()){
String parent = it.next();
String newwin = it.next();
driver.switchTo().window(newwin);
//

//inEligible AR

WebElement HeaderWebEelement=new WebDriverWait(driver,10)
.until(ExpectedConditions.visibilityOfElementLocated(retention3_xpath));
HeaderWebEelement.isDisplayed();




driver.switchTo().defaultContent();

}
return true;}
catch(Exception ex){
return false;
}}
					public boolean verifyineligiblebbcreport()

					{
try{
WebElement WebEelement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(htmlButton_xpath));
WebEelement.click();
//Thread.sleep(5000);
Set <String> handles =driver.getWindowHandles();
Iterator<String> it = handles.iterator();
//iterate through your windows
while (it.hasNext()){
String parent = it.next();
String newwin = it.next();
driver.switchTo().window(newwin);
//

//inEligible AR

WebElement HeaderWebEelement=new WebDriverWait(driver,10)
.until(ExpectedConditions.visibilityOfElementLocated(retentionamnt19_xpath));
HeaderWebEelement.isDisplayed();




driver.switchTo().defaultContent();

}
return true;}
catch(Exception ex){
return false;
}}
					 public boolean verifybbcreport()

						{
	try{
	WebElement WebEelement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(htmlButton_xpath));
	WebEelement.click();
	//Thread.sleep(5000);
	Set <String> handles =driver.getWindowHandles();
	Iterator<String> it = handles.iterator();
	//iterate through your windows
	while (it.hasNext()){
	String parent = it.next();
	String newwin = it.next();
	driver.switchTo().window(newwin);
	//

	//inEligible AR

	WebElement HeaderWebEelement=new WebDriverWait(driver,10)
	.until(ExpectedConditions.visibilityOfElementLocated(inelamnt_xpath));
	HeaderWebEelement.isDisplayed();




	driver.switchTo().defaultContent();

	}
	return true;}
	catch(Exception ex){
	return false;
	}}
					 public boolean verifyDropdownIneligible6()

						{
	  try{
	  WebElement WebEelement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(htmlButton_xpath));
	  WebEelement.click();
	  //Thread.sleep(5000);
	  Set <String> handles =driver.getWindowHandles();
	  Iterator<String> it = handles.iterator();
	  //iterate through your windows
	  while (it.hasNext()){
	  String parent = it.next();
	  String newwin = it.next();
	  driver.switchTo().window(newwin);
	  //
	  
	 //Eligible AR
	  
	   WebElement HeaderWebEelement=new WebDriverWait(driver,10)
	    .until(ExpectedConditions.visibilityOfElementLocated(value1_xpath));
	   HeaderWebEelement.isDisplayed();


	  
	  
	  driver.switchTo().defaultContent();
	  
	  }
	  return true;}
	  catch(Exception ex){
	  return false;
	  }}
					public boolean verifyDropdownIneligible5()

					{
  try{
  WebElement WebEelement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(htmlButton_xpath));
  WebEelement.click();
  //Thread.sleep(5000);
  Set <String> handles =driver.getWindowHandles();
  Iterator<String> it = handles.iterator();
  //iterate through your windows
  while (it.hasNext()){
  String parent = it.next();
  String newwin = it.next();
  driver.switchTo().window(newwin);
  //
  
 //Eligible AR
  
   WebElement HeaderWebEelement=new WebDriverWait(driver,10)
    .until(ExpectedConditions.visibilityOfElementLocated(reason_xpath));
   HeaderWebEelement.isDisplayed();


  
  
  driver.switchTo().defaultContent();
  
  }
  return true;}
  catch(Exception ex){
  return false;
  }}
					
				// public boolean verifyDropdownIneligible4()

				/* public boolean verifyDropdownIneligible()

									{
				  try{
				  WebElement WebEelement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(htmlButton_xpath));
				  WebEelement.click();
				  //Thread.sleep(5000);
				  Set <String> handles =driver.getWindowHandles();
				  Iterator<String> it = handles.iterator();
				  //iterate through your windows
				  while (it.hasNext()){
				  String parent = it.next();
				  String newwin = it.next();
				  driver.switchTo().window(newwin);
				  //
				  
				 //Eligible AR
				  
				   WebElement HeaderWebEelement=new WebDriverWait(driver,100)
				    .until(ExpectedConditions.visibilityOfElementLocated(eligibleAR_xpath));
				   HeaderWebEelement.isDisplayed();


				  
				  
				  driver.switchTo().defaultContent();
				  
				  }
				  return true;}
				  catch(Exception ex){
				  return false;
				  }}	
				 public boolean  displayreportdropdown_Click(String value1){
						try {

							WebElement DropdownWebEelements = new WebDriverWait(driver, 10)
							.until(ExpectedConditions.visibilityOfElementLocated(displayreport_xpath));
							DropdownWebEelements.click();
							Select sel = new Select(DropdownWebEelements);									 
				 List<WebElement> list =sel.getOptions();
				 
				 for (WebElement ele:list){
					
*/


				 //ineligble customer

				/* public boolean verifyDropdownIneligible()

=======
				
					public boolean verifyinelibyreasonreport()

					{
try{
WebElement WebEelement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(htmlButton_xpath));
WebEelement.click();
//Thread.sleep(5000);
Set <String> handles =driver.getWindowHandles();
Iterator<String> it = handles.iterator();
//iterate through your windows
while (it.hasNext()){
String parent = it.next();
String newwin = it.next();
driver.switchTo().window(newwin);
//

//inEligible AR

WebElement HeaderWebEelement=new WebDriverWait(driver,100)
.until(ExpectedConditions.visibilityOfElementLocated(total2_xpath));
HeaderWebEelement.isDisplayed();




driver.switchTo().defaultContent();

}
return true;}
catch(Exception ex){
return false;
}}
		
					public boolean verifyineligiblereport()

					{
try{
WebElement WebEelement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(htmlButton_xpath));
WebEelement.click();
//Thread.sleep(5000);
Set <String> handles =driver.getWindowHandles();
Iterator<String> it = handles.iterator();
//iterate through your windows
while (it.hasNext()){
String parent = it.next();
String newwin = it.next();
driver.switchTo().window(newwin);
//

//inEligible AR

WebElement HeaderWebEelement=new WebDriverWait(driver,100)
.until(ExpectedConditions.visibilityOfElementLocated(total2_xpath));
HeaderWebEelement.isDisplayed();




driver.switchTo().defaultContent();

}
return true;}
catch(Exception ex){
return false;
}}
					public boolean verifyineligiblereportbydebtor()

					{
  try{
  WebElement WebEelement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(htmlButton_xpath));
  WebEelement.click();
  //Thread.sleep(5000);
  Set <String> handles =driver.getWindowHandles();
  Iterator<String> it = handles.iterator();
  //iterate through your windows
  while (it.hasNext()){
  String parent = it.next();
  String newwin = it.next();
  driver.switchTo().window(newwin);
  //
  
 //Eligible AR
  
   WebElement HeaderWebEelement=new WebDriverWait(driver,100)
    .until(ExpectedConditions.visibilityOfElementLocated(total3_xpath));
   HeaderWebEelement.isDisplayed();


  
  
  driver.switchTo().defaultContent();
  
  }
  return true;}
  catch(Exception ex){
  return false;
  }}
		
					 public boolean verifybbcreport()

						{
	try{
	WebElement WebEelement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(htmlButton_xpath));
	WebEelement.click();
	//Thread.sleep(5000);
	Set <String> handles =driver.getWindowHandles();
	Iterator<String> it = handles.iterator();
	//iterate through your windows
	while (it.hasNext()){
	String parent = it.next();
	String newwin = it.next();
	driver.switchTo().window(newwin);
	//

	//inEligible AR

	WebElement HeaderWebEelement=new WebDriverWait(driver,100)
	.until(ExpectedConditions.visibilityOfElementLocated(inelamnt_xpath));
	HeaderWebEelement.isDisplayed();




	driver.switchTo().defaultContent();

	}
	return true;}
	catch(Exception ex){
	return false;
	}}
					 public boolean verifyDropdownIneligible6()

						{
	  try{
	  WebElement WebEelement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(htmlButton_xpath));
	  WebEelement.click();
	  //Thread.sleep(5000);
	  Set <String> handles =driver.getWindowHandles();
	  Iterator<String> it = handles.iterator();
	  //iterate through your windows
	  while (it.hasNext()){
	  String parent = it.next();
	  String newwin = it.next();
	  driver.switchTo().window(newwin);
	  //
	  
	 //Eligible AR
	  
	   WebElement HeaderWebEelement=new WebDriverWait(driver,100)
	    .until(ExpectedConditions.visibilityOfElementLocated(value1_xpath));
	   HeaderWebEelement.isDisplayed();


	  
	  
	  driver.switchTo().defaultContent();
	  
	  }
	  return true;}
	  catch(Exception ex){
	  return false;
	  }}
					public boolean verifyDropdownIneligible5()

					{
  try{
  WebElement WebEelement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(htmlButton_xpath));
  WebEelement.click();
  //Thread.sleep(5000);
  Set <String> handles =driver.getWindowHandles();
  Iterator<String> it = handles.iterator();
  //iterate through your windows
  while (it.hasNext()){
  String parent = it.next();
  String newwin = it.next();
  driver.switchTo().window(newwin);
  //
  
 //Eligible AR
  
   WebElement HeaderWebEelement=new WebDriverWait(driver,100)
    .until(ExpectedConditions.visibilityOfElementLocated(reason_xpath));
   HeaderWebEelement.isDisplayed();


  
  
  driver.switchTo().defaultContent();
  
  }
  return true;}
  catch(Exception ex){
  return false;
  }}
					
				 public boolean verifyDropdownIneligible4()
>>>>>>> dec 18 changes

									{
				  try{
				  WebElement WebEelement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(htmlButton_xpath));
				  WebEelement.click();
				  //Thread.sleep(5000);
				  Set <String> handles =driver.getWindowHandles();
				  Iterator<String> it = handles.iterator();
				  //iterate through your windows
				  while (it.hasNext()){
				  String parent = it.next();
				  String newwin = it.next();
				  driver.switchTo().window(newwin);
				  //
				  
				 //Eligible AR
				  
				   WebElement HeaderWebEelement=new WebDriverWait(driver,100)
				    .until(ExpectedConditions.visibilityOfElementLocated(ineligibleamnt2_xpath));
				   HeaderWebEelement.isDisplayed();


				  
				  
				  driver.switchTo().defaultContent();
				  
				  }
				  return true;}
				  catch(Exception ex){
				  return false;
				  }}
<<<<<<< Updated upstream
<<<<<<< HEAD
				 */


				 public boolean verifyDropdownIneligible()

					{
try{
WebElement WebEelement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(htmlButton_xpath));
WebEelement.click();
//Thread.sleep(2000);
Set <String> handles =driver.getWindowHandles();
Iterator<String> it = handles.iterator();
//iterate through your windows
while (it.hasNext()){
String parent = it.next();
String newwin = it.next();
driver.switchTo().window(newwin);
//

//Eligible AR

WebElement HeaderWebEelement=new WebDriverWait(driver,10)
 .until(ExpectedConditions.visibilityOfElementLocated(eligibleAR_xpath));
HeaderWebEelement.isDisplayed();




driver.switchTo().defaultContent();

}
return true;}
catch(Exception ex){
return false;
}}

				 
				 
				 
				 public boolean verifyDropdownIneligible1()

					{
try{
WebElement WebEelement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(htmlButton_xpath));
WebEelement.click();
//Thread.sleep(2000);
Set <String> handles =driver.getWindowHandles();
Iterator<String> it = handles.iterator();
//iterate through your windows
while (it.hasNext()){
String parent = it.next();
String newwin = it.next();
driver.switchTo().window(newwin);
//

//Eligible AR

WebElement HeaderWebEelement=new WebDriverWait(driver,10)
 .until(ExpectedConditions.visibilityOfElementLocated(value_xpath));
HeaderWebEelement.isDisplayed();




driver.switchTo().defaultContent();

}
return true;}
catch(Exception ex){
return false;
}}
	 
				 public boolean verifyDropdownIneligible2()


					{
try{
WebElement WebEelement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(htmlButton_xpath));
WebEelement.click();
//Thread.sleep(2000);
Set <String> handles =driver.getWindowHandles();
Iterator<String> it = handles.iterator();
//iterate through your windows
while (it.hasNext()){
String parent = it.next();
String newwin = it.next();
driver.switchTo().window(newwin);
//

//Eligible AR

WebElement HeaderWebEelement=new WebDriverWait(driver,10)
.until(ExpectedConditions.visibilityOfElementLocated(ineligibleamnt2_xpath));
HeaderWebEelement.isDisplayed();




driver.switchTo().defaultContent();

}
return true;}
catch(Exception ex){
return false;
}}	
				 public boolean verifyDropdownIneligible8()


					{
try{
WebElement WebEelement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(htmlButton_xpath));
WebEelement.click();
//Thread.sleep(2000);
Set <String> handles =driver.getWindowHandles();
Iterator<String> it = handles.iterator();
//iterate through your windows
while (it.hasNext()){
String parent = it.next();
String newwin = it.next();
driver.switchTo().window(newwin);
//

//Eligible AR


WebElement HeaderWebEelement=new WebDriverWait(driver,10)

.until(ExpectedConditions.visibilityOfElementLocated(ineligibleamnt2_xpath));
HeaderWebEelement.isDisplayed();




driver.switchTo().defaultContent();

}
return true;}
catch(Exception ex){
return false;
}}	
				
				 public boolean verifyDropdownIneligible9()

					{
try{
WebElement WebEelement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(htmlButton_xpath));
WebEelement.click();
//Thread.sleep(2000);
Set <String> handles =driver.getWindowHandles();
Iterator<String> it = handles.iterator();
//iterate through your windows
while (it.hasNext()){
String parent = it.next();
String newwin = it.next();
driver.switchTo().window(newwin);
//

//Eligible AR

WebElement HeaderWebEelement=new WebDriverWait(driver,10)
.until(ExpectedConditions.visibilityOfElementLocated(retentionreason6_xpath));
HeaderWebEelement.isDisplayed();




driver.switchTo().defaultContent();

}
return true;}
catch(Exception ex){
return false;
}}

				 public boolean verifyDropdownIneligible4()

					{
try{
WebElement WebEelement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(htmlButton_xpath));
WebEelement.click();
//Thread.sleep(2000);
Set <String> handles =driver.getWindowHandles();
Iterator<String> it = handles.iterator();
//iterate through your windows
while (it.hasNext()){
String parent = it.next();
String newwin = it.next();
driver.switchTo().window(newwin);
//

//Eligible AR

WebElement HeaderWebEelement=new WebDriverWait(driver,10)
.until(ExpectedConditions.visibilityOfElementLocated(retention2_xpath));
HeaderWebEelement.isDisplayed();




driver.switchTo().defaultContent();

}
return true;}
catch(Exception ex){
return false;
}}
				 
				 public boolean verifyDropdownIneligible7()

					{
try{
WebElement WebEelement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(htmlButton_xpath));
WebEelement.click();
//Thread.sleep(2000);
Set <String> handles =driver.getWindowHandles();
Iterator<String> it = handles.iterator();
//iterate through your windows
while (it.hasNext()){
String parent = it.next();
String newwin = it.next();
driver.switchTo().window(newwin);
//

//Eligible AR

WebElement HeaderWebEelement=new WebDriverWait(driver,10)
.until(ExpectedConditions.visibilityOfElementLocated(retention3_xpath));
HeaderWebEelement.isDisplayed();




driver.switchTo().defaultContent();

}
return true;}
catch(Exception ex){
return false;
}}

			
				
				 public boolean  displayreportdropdown_Click(String value1){
						try {

							WebElement DropdownWebEelements = new WebDriverWait(driver, 10)
							.until(ExpectedConditions.visibilityOfElementLocated(displayreport_xpath));
							DropdownWebEelements.click();
							
							Select sel = new Select(DropdownWebEelements);									 
				 List<WebElement> list =sel.getOptions();
				 
				 for (WebElement ele:list){
					

					if(ele.getText().equals(value1))
					{
					ele.click();
					break;

					 //System.out.println(ele.getText());
				   
				 }
				//Assert.assertTrue(match);
				}
				 return true;	
				} catch (Exception e) {
				// TODO: handle exception

				}
						return false;
				}

				 
				 public boolean scrollToViewL()
					{
						try{
							 WebElement actual1=new WebDriverWait(driver,10)
				   		 .until(ExpectedConditions.visibilityOfElementLocated(Invcollateral_xpath));
				   		JavascriptExecutor jse1 = (JavascriptExecutor)driver;;
				   		jse1.executeScript("arguments[0].scrollIntoView(true);", actual1);  		
					        //Thread.sleep(2000);
					        return true;
							
						}
						catch(Exception e){
							
						}
						return false;
						
						}	
				 public boolean scrollToViewL1()
					{
						try{
							 WebElement actual1=new WebDriverWait(driver,10)
						 .until(ExpectedConditions.visibilityOfElementLocated(ineligibleGrandTotal_xpath));
						JavascriptExecutor jse1 = (JavascriptExecutor)driver;;
						jse1.executeScript("arguments[0].scrollIntoView(true);", actual1);  		
					        //Thread.sleep(2000);
					        return true;
							
						}
						catch(Exception e){
							
						}
						return false;
						
						}
				 
				 public boolean  Click_on_Ineligibletrendreport()
					{
					try{
						WebElement HeaderWebEelement=new WebDriverWait(driver,10)
							.until(ExpectedConditions.visibilityOfElementLocated(ineligibletrendreport_xpath));
						HeaderWebEelement.click();
						//Thread.sleep(2000);
						return true;
					}
					catch(Exception ex){
						return false;

					}


					}
				 public boolean  Click_on_BBCManReport()
					{
					try{
						WebElement HeaderWebEelement=new WebDriverWait(driver,10)
							.until(ExpectedConditions.visibilityOfElementLocated(BBCManReport_xpath));
						HeaderWebEelement.click();
						//Thread.sleep(2000);
						return true;
					}
					catch(Exception ex){
						return false;

					}

					}
				 public boolean  Click_on_Generatebutton()
					{
					try{
						WebElement HeaderWebEelement=new WebDriverWait(driver,10)
							.until(ExpectedConditions.visibilityOfElementLocated(Generatebtn_xpath));
						HeaderWebEelement.click();
						//Thread.sleep(2000);
						return true;
					}
					catch(Exception ex){
						return false;

					}


					}
				 public boolean  Click_on_Generatebtn()
					{
					try{
						WebElement HeaderWebEelement=new WebDriverWait(driver,10)
							.until(ExpectedConditions.visibilityOfElementLocated(Generatebtn_xpath));
						HeaderWebEelement.click();
						//Thread.sleep(5000);					 
						     Set <String> handles =driver.getWindowHandles();
						     Iterator<String> it = handles.iterator();
						     //iterate through your windows
						     while (it.hasNext()){
						     String parent = it.next();
						     String newwin = it.next();
						     driver.switchTo().window(newwin);
						    
						
						     driver.switchTo().defaultContent();
						     
						     }
						     return true;}
						     catch(Exception ex){
						     return false;
						     }
					}

					public boolean clickOnTrnsactionByDate()
					{
						try{

				WebElement clickWebEelement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(transactionByDateRange_xpath));
							clickWebEelement.click();
							////Thread.sleep(2000);
							
					return true;
						}
						catch(Exception ex){
							return false;
						}
					}		
					
	// rohit
	public boolean clickOnTransactionByDateRangeReport1(String asOfDate,
			String Accno, String AccountName, String InvoiceNumber,
			String originationDate, String currentAmt, String InvoiceStatus,
			String ParametreName) {
		try {
				driver.findElement(
						By.xpath("//h2[text()='Invoices as of BBC dated on: "
								+ asOfDate + "']")).isDisplayed();
				System.out.println("Report name");

				WebElement accNameWebElement = new WebDriverWait(driver, 10)
						.until(ExpectedConditions
								.visibilityOfElementLocated(accNo));
				accNameWebElement.getText().trim().equalsIgnoreCase(Accno);
				System.out.println("accNo");

				WebElement perOfTotalArWebelement = new WebDriverWait(driver,
						10).until(ExpectedConditions
						.visibilityOfElementLocated(accName_xpath));
				perOfTotalArWebelement.getText().trim()
						.equalsIgnoreCase(AccountName);
				System.out.println("accName");

				WebElement totalWebelement = new WebDriverWait(driver, 10)
						.until(ExpectedConditions
								.visibilityOfElementLocated(invoiceNo_xpath));
				totalWebelement.getText().trim()
						.equalsIgnoreCase(InvoiceNumber);
				System.out.println("invoiceNo");

				WebElement currentWebElement = new WebDriverWait(driver, 10)
						.until(ExpectedConditions
								.visibilityOfElementLocated(orgDate_xapth));
				currentWebElement.getText().trim()
						.equalsIgnoreCase(originationDate);
				System.out.println("orgDate");

				WebElement over30WebElement = new WebDriverWait(driver, 10)
						.until(ExpectedConditions
								.visibilityOfElementLocated(currentAmt_xpath));
				over30WebElement.getText().trim().equalsIgnoreCase(currentAmt);
				System.out.println("currentAmt");

				WebElement over60Webelement = new WebDriverWait(driver, 10)
						.until(ExpectedConditions
								.visibilityOfElementLocated(invStatus_xpath));
				over60Webelement.getText().trim()
						.equalsIgnoreCase(InvoiceStatus);
				System.out.println("invStatus");

				WebElement over120Webelement = new WebDriverWait(driver, 10)
						.until(ExpectedConditions
								.visibilityOfElementLocated(parameterNAme_xpath));
				over120Webelement.getText().trim()
						.equalsIgnoreCase(ParametreName);
				System.out.println("parameterNAme_xpath");
		
			return true;
		} catch (Exception ex) {
			return false;
		}
	}
				 
					 public boolean clickOnTransactionByDateRangeReport(String asOfDate,String Accno, String AccountName, String InvoiceNumber,String originationDate,String currentAmt,String InvoiceStatus,String ParametreName)
						{
						try{
							WebElement WebEelement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(htmlButton_xpath));
						WebEelement.click();
						//Thread.sleep(5000);
						Set <String> handles =driver.getWindowHandles();
						Iterator<String> it = handles.iterator();
						//iterate through your windows
						while (it.hasNext()){
						String newwin = it.next();
						String parent = it.next();
						driver.switchTo().window(newwin);
						

						
						driver.findElement(By.xpath("//h2[text()='Invoices as of BBC dated on: "+asOfDate +"']")).isDisplayed();
						System.out.println("Report name");
						
						WebElement accNameWebElement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(accNo));
						accNameWebElement.getText().trim().equalsIgnoreCase(Accno);
						System.out.println("accNo");
						
						WebElement perOfTotalArWebelement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(accName_xpath));
						perOfTotalArWebelement.getText().trim().equalsIgnoreCase(AccountName);
						System.out.println("accName");
						
						WebElement totalWebelement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(invoiceNo_xpath));
						totalWebelement.getText().trim().equalsIgnoreCase(InvoiceNumber);
						System.out.println("invoiceNo");
						
						WebElement currentWebElement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(orgDate_xapth));
						currentWebElement.getText().trim().equalsIgnoreCase(originationDate);
						System.out.println("orgDate");
						
						WebElement over30WebElement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(currentAmt_xpath));
						over30WebElement.getText().trim().equalsIgnoreCase(currentAmt);
						System.out.println("currentAmt");
						
						WebElement over60Webelement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(invStatus_xpath));
						over60Webelement.getText().trim().equalsIgnoreCase(InvoiceStatus);
						System.out.println("invStatus");
						

						WebElement over120Webelement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(parameterNAme_xpath));
						over120Webelement.getText().trim().equalsIgnoreCase(ParametreName);
						System.out.println("parameterNAme_xpath");
						driver.close();
						driver.switchTo().window(parent);
						
						}
						return true;}
						catch(Exception ex){
						return false;
						}}
					  
					 
			
	public boolean verifyTotalAgedReceivablesT(String totalAgedReceivables) {
		try {
			WebElement displayWebElement = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(totalAgedReceivables_xpath));
			WebElement AmountWebElement = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(totalAgedReceivablesValueT_xpath));
			displayWebElement.isDisplayed();
			
			String actual = AmountWebElement.getText().trim();
			System.out.println(actual);
			if (actual.equals(totalAgedReceivables))
				return true;
			else{
				return false;
			}
		} catch (Exception e) {
			return false;
		}

	}
					 
					 public boolean  verifyNetARAvailableForAdvanceBbcT(String  netARAvailableForAdvance){
					    	try {
					    		WebElement displayWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(netARAvailableForAdvance_xpath));
					    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(netARAvailableForAdvanceBbcValueT_xpath));
					    		displayWebElement.isDisplayed();
					    		String actual = AmountWebElement.getText().trim();
					    		if (actual.equals(netARAvailableForAdvance))
					    			return true;
					    		else
					    			return false;

					    	} catch (Exception e) {
					    		return false;
					    	}
					    	
					    }	
					 
					 
					 public boolean  verifyNetInventoryAvailableForAdvanceBbcT(String  netInventoryAvailableForAdvance){
					    	try {
					    		WebElement displayWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(netInventoryAvailableForAdvance_xpath));
					    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(netInventoryAvailableForAdvanceBbcValueT_xpath));
					    		displayWebElement.isDisplayed();
					    		String actual = AmountWebElement.getText().trim();
					    		if (actual.equals(netInventoryAvailableForAdvance))
					    			return true;
					    		else
					    			return false;

					    	} catch (Exception e) {
					    		return false;
					    	}
					    	
					    }	
					 
					 public boolean  verifyTotalAvailableARInventoryBbcT(String  totalAvailableARInventory){
					    	try {
					    		WebElement displayWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(totalAvailableARInventoryBbc_xpath));
					    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(totalAvailableARInventoryBbcValueT_xpath));
					    		displayWebElement.isDisplayed();
					    		String actual = AmountWebElement.getText().trim();
					    		if (actual.equals(totalAvailableARInventory))
					    			return true;
					    		else
					    			return false;

					    	} catch (Exception e) {
					    		return false;
					    	}
					    	
					    }	

					 public boolean  verifyNetOtherAvailableForAdvanceBbcT(String  netOtherAvailableForAdvance){
					    	try {
					    		WebElement displayWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(netOtherAvailableForAdvance_xpath));
					    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(netOtherAvailableForAdvanceBbcValueT_xpath));
					    		displayWebElement.isDisplayed();
					    		String actual = AmountWebElement.getText().trim();
					    		if (actual.equals(netOtherAvailableForAdvance))
					    			return true;
					    		else
					    			return false;

					    	} catch (Exception e) {
					    		return false;
					    	}
					    	
					    }	
					 
					 public boolean  verifyTotalAvailableForAdvanceBbcT(String  totalAvailableForAdvance){
					    	try {
					    		WebElement displayWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(totalAvailableForAdvance_xpath));
					    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(totalAvailableForAdvanceBbcValueT_xpath));
					    		displayWebElement.isDisplayed();
					    		String actual = AmountWebElement.getText().trim();
					    		if (actual.equals(totalAvailableForAdvance))
					    			return true;
					    		else
					    			return false;

					    	} catch (Exception e) {
					    		return false;
					    	}
					    	
					    }	
					 
					 public boolean  verifyLineLimitWithReservesBbcT(String  lineLimitWithReserves){
					    	try {
					    		WebElement displayWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(lineLimitWithReserves_xpath));
					    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(lineLimitWithReservesValueT_xpath));
					    		displayWebElement.isDisplayed();
					    		String actual = AmountWebElement.getText().trim();
					    		if (actual.equals(lineLimitWithReserves))
					    			return true;
					    		else
					    			return false;

					    	} catch (Exception e) {
					    		return false;
					    	}
					    	
					    }	 
					 
					 public boolean  verifyBorrowingBaseAvailabilityBbcT(String  borrowingBaseAvailability){
					    	try {
					    		WebElement displayWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(borrowingBaseAvailability_xpath));
					    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(borrowingBaseAvailabilityValueT_xpath));
					    		displayWebElement.isDisplayed();
					    		String actual = AmountWebElement.getText().trim();
					    		if (actual.equals(borrowingBaseAvailability))
					    			return true;
					    		else
					    			return false;

					    	} catch (Exception e) {
					    		return false;
					    	}
					    	
					    }	
					 
					 public boolean  verifyNetBorrowingBaseAvailableBbcT(String  netBorrowingBaseAvailable){
					    	try {
					    		WebElement displayWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(netBorrowingBaseAvailable_xpath));
					    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(netBorrowingBaseAvailableValueT_xpath));
					    		displayWebElement.isDisplayed();
					    		String actual = AmountWebElement.getText().trim();
					    		if (actual.equals(netBorrowingBaseAvailable))
					    			return true;
					    		else
					    			return false;

					    	} catch (Exception e) {
					    		return false;
					    	}
					    	
					    }
					 
					 
					 //
					 public boolean clickOnARLoanActivity()
						{
							try{

								WebElement ReportWebEelement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(aRLoanActivity_xpath));
								ReportWebEelement.click();
								////Thread.sleep(2000);
								
						return true;
							}
						catch (Exception ex) {
						}
						return false;

						}		
					 
						public boolean arStartDate(String arStartDate) {
							try {
								WebElement bbcDropdownWebEelement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(arLoanStartDate_xpath));
								Select sel = new Select(bbcDropdownWebEelement);
								sel.selectByVisibleText(arStartDate);
								/*List<WebElement> list = sel.getOptions();
								for (WebElement ele : list) {
									if (ele.getText().equals(arStartDate)) {
										ele.click();
										////Thread.sleep(5000);
										break;
									}
								}*/
								return true;} 
							catch (Exception ex) {
							}
							return false;
						}
						
						public boolean arEndDate(String arEndDate) {
							try {
								WebElement bbcDropdownWebEelement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(arLoanEndDate_xpath));
								Select sel = new Select(bbcDropdownWebEelement);
								sel.selectByVisibleText(arEndDate);
								/*List<WebElement> list = sel.getOptions();
								for (WebElement ele : list) {
									if (ele.getText().equals(arEndDate)) {
										ele.click();
										////Thread.sleep(5000);
										break;
									}
								}*/
								return true;} 
							catch (Exception ex) {
							}
							return false;
						}
						
						
	// rohit
	public boolean verifyArLoanReport1(String arStartDate, String arEndDate,
			String clientname, String dateArLoan, String salesArLoan,
			String creditsArLoan, String unreconciled, String collections,
			String adjustments, String arBalance, String BalanceAr) {
		try {
				/*WebElement reportHeader = new WebDriverWait(driver, 10)
						.until(ExpectedConditions
								.visibilityOfElementLocated(headerReport_xpath));
				reportHeader.isDisplayed();
				System.out.println("Report header");*/

				driver.findElement(
						By.xpath("//h2[text()='AR Loan Activity Report from "
								+ arStartDate + " to " + arEndDate + "']"))
						.isDisplayed();
				System.out.println("AR loan activity report");

				driver.findElement(
						By.xpath("//h2[text()='" + clientname.toUpperCase() + "']"))
						.isDisplayed();
				System.out.println("Client name");

				WebElement dateArLoanWebElement = new WebDriverWait(driver, 10)
						.until(ExpectedConditions
								.visibilityOfElementLocated(dateArLoan_xpath));
				dateArLoanWebElement.getText().equalsIgnoreCase(dateArLoan);
				System.out.println("dateArLoan");

				WebElement salesArLoanWebElement = new WebDriverWait(driver, 10)
						.until(ExpectedConditions
								.visibilityOfElementLocated(salesArLoan_xpath));
				salesArLoanWebElement.getText().equalsIgnoreCase(salesArLoan);
				System.out.println("salesArLoan");

				WebElement creditsArLoanWebElement = new WebDriverWait(driver,
						10).until(ExpectedConditions
						.visibilityOfElementLocated(creditsArLoan_xpath));
				creditsArLoanWebElement.getText().trim()
						.equalsIgnoreCase(creditsArLoan);
				System.out.println("creditsArLoan");

				WebElement unreconciledWebElement = new WebDriverWait(driver,
						10).until(ExpectedConditions
						.visibilityOfElementLocated(unreconciled_xpath));
				unreconciledWebElement.getText().trim()
						.equalsIgnoreCase(unreconciled);
				System.out.println("unreconciled");

				WebElement collectionsWebElement = new WebDriverWait(driver, 10)
						.until(ExpectedConditions
								.visibilityOfElementLocated(collections_xpath));
				collectionsWebElement.getText().equalsIgnoreCase(collections);
				System.out.println("collections");

				WebElement adjustmentsWebelement = new WebDriverWait(driver, 10)
						.until(ExpectedConditions
								.visibilityOfElementLocated(adjustments_xpath));
				adjustmentsWebelement.getText().equalsIgnoreCase(adjustments);
				System.out.println("adjustments");

				WebElement arBalanceWebelement = new WebDriverWait(driver, 10)
						.until(ExpectedConditions
								.visibilityOfElementLocated(arBalance_xpath));
				arBalanceWebelement.getText().equalsIgnoreCase(arBalance);
				System.out.println("arBalance");

				WebElement BalanceArWebelement = new WebDriverWait(driver, 10)
						.until(ExpectedConditions
								.visibilityOfElementLocated(BalanceAr_xpath));
				BalanceArWebelement.getText().equalsIgnoreCase(BalanceAr);
				System.out.println("BalanceAr");

			return true;
		} catch (Exception ex) {
			return false;
		}
	}

						 public boolean verifyArLoanReport(String arStartDate,String arEndDate,String clientname,String dateArLoan,String salesArLoan,String creditsArLoan,String unreconciled,String collections,String adjustments,String arBalance,String BalanceAr)
							{
							 try{
									WebElement WebEelement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(htmlButton_xpath));
									WebEelement.click();
									//Thread.sleep(5000);
									Set <String> handles =driver.getWindowHandles();
									Iterator<String> it = handles.iterator();
									//iterate through your windows
									while (it.hasNext()){
										String parent = it.next();
										String newwin = it.next();
										driver.switchTo().window(newwin);
							//
							
							WebElement reportHeader=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(headerReport_xpath));
							reportHeader.isDisplayed();
							System.out.println("Report header");
							
							driver.findElement(By.xpath("//h2[text()='AR Loan Activity Report from "+ arStartDate +" to " + arEndDate +"']")).isDisplayed();	
							System.out.println("AR loan activity report");
							
							driver.findElement(By.xpath("//h2[text()='" +clientname +"']")).isDisplayed();	
							System.out.println("Client name");		
							
							WebElement dateArLoanWebElement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(dateArLoan_xpath));
							dateArLoanWebElement.getText().equalsIgnoreCase(dateArLoan);
							System.out.println("dateArLoan");
							
							WebElement salesArLoanWebElement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(salesArLoan_xpath));
							salesArLoanWebElement.getText().equalsIgnoreCase(salesArLoan);
							System.out.println("salesArLoan");
							
							WebElement creditsArLoanWebElement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(creditsArLoan_xpath));
							creditsArLoanWebElement.getText().trim().equalsIgnoreCase(creditsArLoan);
							System.out.println("creditsArLoan");
						
							WebElement unreconciledWebElement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(unreconciled_xpath));
							unreconciledWebElement.getText().trim().equalsIgnoreCase(unreconciled);
							System.out.println("unreconciled");
							
							WebElement collectionsWebElement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(collections_xpath));
							collectionsWebElement.getText().equalsIgnoreCase(collections);
							System.out.println("collections");
							
							WebElement adjustmentsWebelement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(adjustments_xpath));
							adjustmentsWebelement.getText().equalsIgnoreCase(adjustments);
							System.out.println("adjustments");
							
							WebElement arBalanceWebelement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(arBalance_xpath));
							arBalanceWebelement.getText().equalsIgnoreCase(arBalance);
							System.out.println("arBalance");
							
							WebElement BalanceArWebelement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(BalanceAr_xpath));
							BalanceArWebelement.getText().equalsIgnoreCase(BalanceAr);
							System.out.println("BalanceAr");

							
							
							driver.close();
							driver.switchTo().window(parent);
							
							}
							return true;}
							catch(Exception ex){
							return false;
							}}

						 
						 //
	public boolean clickOnOpenInvoiceByDateRange() {
		try {

			WebElement ReportWebEelement = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(OpenInvoiceByDateRange_xpath));
			ReportWebEelement.click();
			// //Thread.sleep(2000);

			return true;
		} catch (Exception ex) {
		}
		return false;

	}
						  
	// rohit
	public boolean verifyOpenInvoiceByDateRangeReportNewTab1(String expected,
			String clientname, String startdate, String toDate) {
		try {
			/*WebElement reportHeader = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(headerReport_xpath));
			reportHeader.isDisplayed();
			System.out.println("Cync Report header");*/

			driver.findElement(
					By.xpath("//h2[contains(text(),'Invoice By Date Range Report from "
							+ startdate + " to " + toDate + "')]"))
					.isDisplayed();
			System.out.println("Report header");

			driver.findElement(By.xpath("//h2[text()='" + clientname.toUpperCase() + "']"))
					.isDisplayed();
			System.out.println("Client name");

			return true;
		} catch (Exception ex) {
			return false;
		}
	}			 
						 
						 public boolean verifyOpenInvoiceByDateRangeReportNewTab(String expected,String clientname,String startdate,String toDate)
							{
								try{
									WebElement WebEelement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(htmlButton_xpath));
									WebEelement.click();
									//Thread.sleep(5000);
									Set <String> handles =driver.getWindowHandles();
									Iterator<String> it = handles.iterator();
									//iterate through your windows
									while (it.hasNext()){
									String parent = it.next();
									String newwin = it.next();
									driver.switchTo().window(newwin);
									//
									
									WebElement reportHeader=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(headerReport_xpath));
									reportHeader.isDisplayed();
									System.out.println("Cync Report header");

									
									driver.findElement(By.xpath("//h2[contains(text(),'Invoice By Date Range Report from " +startdate+" to " +toDate+ "')]")).isDisplayed();				
									System.out.println("Report header");
									
									driver.findElement(By.xpath("//h2[text()='" +clientname +"']")).isDisplayed();	
									System.out.println("Client name");
									
									}
									return true;}
									catch(Exception ex){
									return false;
									}} 
						 
						 public boolean verifyCustomerAccount(String CustomerAccount)
							{
								try{

									WebElement ReportWebEelement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(custtomerAccount_xpath));
									String actual = ReportWebEelement.getText().trim();
						    		if (actual.equals(CustomerAccount))
						    			return true;
						    		else
						    			return false;

						    	} catch (Exception e) {
						    		return false;
						    	}
						    	
						    }
									
									
				
						 
						 public boolean verifyAccNumber(String AccNumber)
							{
								try{

									WebElement ReportWebEelement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(accNumberOpen_xpath));
									String actual = ReportWebEelement.getText().trim();
						    		if (actual.equals(AccNumber))
						    			return true;
						    		else
						    			return false;

						    	} catch (Exception e) {
						    		return false;
						    	}
						    	
						    }
						 
						 
						 public boolean verifyInvoiceNumber(String InvoiceNo)
							{
								try{

									WebElement ReportWebEelement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(invoiceNumberOpen_xpath));
									String actual = ReportWebEelement.getText().trim();
						    		if (actual.equals(InvoiceNo))
						    			return true;
						    		else
						    			return false;

						    	} catch (Exception e) {
						    		return false;
						    	}
						    	
						    }
						 
						 
						 public boolean verifyOriginalDate(String OriginalDate)
							{
								try{

									WebElement ReportWebEelement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(originalDateOpen_xpath));
									String actual = ReportWebEelement.getText().trim();
						    		if (actual.equals(OriginalDate))
						    			return true;
						    		else
						    			return false;

						    	} catch (Exception e) {
						    		return false;
						    
						    	}}
						 
						 public boolean verifyDueDate(String dueDate)
							{
								try{

									WebElement ReportWebEelement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(dueDateOpen_xpath));
									String actual = ReportWebEelement.getText().trim();
						    		if (actual.equals(dueDate))
						    			return true;
						    		else
						    			return false;

						    	} catch (Exception e) {
						    		return false;
						    
						    	}}
						 public boolean verifyOriginalAmount(String OriginalAmount)
							{
								try{

									WebElement ReportWebEelement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(originalAmountOpen_xpath));
									String actual = ReportWebEelement.getText().trim();
						    		if (actual.equals(OriginalAmount))
						    			return true;
						    		else
						    			return false;

						    	} catch (Exception e) {
						    		return false;
						    
						    	}}
						 
						 public boolean verifyBalanceAmount(String balanceAmount)
							{
								try{

									WebElement ReportWebEelement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(balanceAmountOpen_xpath));
									String actual = ReportWebEelement.getText().trim();
						    		if (actual.equals(balanceAmount))
						    			return true;
						    		else
						    			return false;

						    	} catch (Exception e) {
						    		return false;
						    
						    	}}
						 public boolean clickOnGenerateForMulDiv()
							{
							try{
							WebElement WebEelement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(generateTrend_xpath));
							WebEelement.click();
							//Thread.sleep(5000);
							Set <String> handles =driver.getWindowHandles();
							Iterator<String> it = handles.iterator();
							//iterate through your windows
							while (it.hasNext()){
							String parent = it.next();
							String newwin = it.next();
							driver.switchTo().window(newwin);
							

							
							driver.findElement(By.xpath("//span[contains(text(),'BBC Trend Report')]")).isDisplayed();
							System.out.println("Report name");
							}
							return true;}
							catch(Exception ex){
							return false;
							}}

	public boolean clickOnGenerateForMulDiv1() {
		try {
			WebElement WebEelement = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(generateTrend_xpath));
			WebEelement.click();
		
				System.out.println("Report name");
			
			return true;
		} catch (Exception ex) {
			return false;
		}
	}
						 
							public boolean verifyBbcTrendReportNewTabFormulDiv(String expected,String clientname,String startdate,String toDate)
							{
								try{
									WebElement WebEelement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(htmlButton_xpath));
									WebEelement.click();
									
									Set <String> handles =driver.getWindowHandles();
									Iterator<String> it = handles.iterator();
									//iterate through your windows
									while (it.hasNext()){
									String parent = it.next();
									String newwin = it.next();
									driver.switchTo().window(newwin);
									return true;
								}
								}catch (Exception e) {
						    		return false;
						    	}
								return false;
							}
							 public boolean AsofDate(String Date) {
									try {
										WebElement bbcDropdownWebEelement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(asofdateFormuldiv_xpath));
										Select sel = new Select(bbcDropdownWebEelement);
										sel.selectByVisibleText(Date);
										/*List<WebElement> list = sel.getOptions();
										for (WebElement ele : list) {
											if (ele.getText().equals(Date)) {
												ele.click();
												//Thread.sleep(2000);
												break;
											}
										}*/
										return true;} 
									catch (Exception ex) {
									}
									return false;
								}

							 public boolean verifyReportForPayablesAllValuesMaintainArForMulDivForSkipped(String expected,String asOfDate,String clientname,String accNo,String accName,String future,String current,String over30,String over60,String over90,String over120)
								{
								try{
								WebElement WebEelement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(htmlButton_xpath));
								WebEelement.click();
								//Thread.sleep(5000);
								Set <String> handles =driver.getWindowHandles();
								Iterator<String> it = handles.iterator();
								//iterate through your windows
								while (it.hasNext()){
								String parent = it.next();
								String newwin = it.next();
								driver.switchTo().window(newwin);
								//
								
								WebElement reportHeader=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(headerReport_xpath));
								reportHeader.isDisplayed();
								System.out.println("Report header");
								
								driver.findElement(By.xpath("//h2[text()='Payables Aged Trial Balance as of: 02/01/2018']")).isDisplayed();	
								System.out.println("As Of date");
								
								driver.findElement(By.xpath("//h2[text()='TEST_ABL7']")).isDisplayed();	
								System.out.println("Client name");
							
								
								WebElement futureWebElement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(futureAr_xpath));
								futureWebElement.getText().equalsIgnoreCase(future);
								System.out.println("Future");
								
								WebElement currentWebElement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(currentAr_xapth));
								currentWebElement.getText().equalsIgnoreCase(current);
								System.out.println("Current");
								
								WebElement over30WebElement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(over30Ar_xpath));
								over30WebElement.getText().equalsIgnoreCase(over30);
								System.out.println("over30");
								
								WebElement over60Webelement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(over60Ar_xpath));
								over60Webelement.getText().equalsIgnoreCase(over60);
								System.out.println("over60");
								
								WebElement over90Webelement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(over90Ar_xpath));
								over90Webelement.getText().equalsIgnoreCase(over90);
								System.out.println("over90");
								
								WebElement over120Webelement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(over120Ar_xpath));
								over120Webelement.getText().equalsIgnoreCase(over120);
								System.out.println("over120");
								
								driver.close();
								driver.switchTo().window(parent);
								
								}
								return true;}
								catch(Exception ex){
								return false;
								}}
							 public boolean verifyReportForPayablesAllValuesMaintainArForMulDivForSkippedSummaryYesMul(String expected,String asOfDate,String clientname,String accNo,String accName,String future,String current,String over30,String over60,String over90,String over120)
								{
								try{
								WebElement WebEelement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(htmlButton_xpath));
								WebEelement.click();
								//Thread.sleep(5000);
								Set <String> handles =driver.getWindowHandles();
								Iterator<String> it = handles.iterator();
								//iterate through your windows
								while (it.hasNext()){
								String parent = it.next();
								String newwin = it.next();
								driver.switchTo().window(newwin);
								//
								
								WebElement reportHeader=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(headerReport_xpath));
								reportHeader.isDisplayed();
								System.out.println("Report header");
								
								driver.findElement(By.xpath("//h2[text()='Payables Aged Trial Balance as of: 02/01/2018']")).isDisplayed();	
								System.out.println("As Of date");
								
								driver.findElement(By.xpath("//h2[text()='"+clientname.toUpperCase()+"']")).isDisplayed();	
								System.out.println("Client name");
							
								
								WebElement futureWebElement=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(futureAr_xpath));
								futureWebElement.getText().equalsIgnoreCase(future);
								System.out.println("Future");
								
								WebElement currentWebElement=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(currentAr_xapth));
								currentWebElement.getText().equalsIgnoreCase(current);
								System.out.println("Current");
								
								WebElement over30WebElement=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(over30Ar_xpath));
								over30WebElement.getText().equalsIgnoreCase(over30);
								System.out.println("over30");
								
								WebElement over60Webelement=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(over60Ar_xpath));
								over60Webelement.getText().equalsIgnoreCase(over60);
								System.out.println("over60");
								
								WebElement over90Webelement=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(over90Ar_xpath));
								over90Webelement.getText().equalsIgnoreCase(over90);
								System.out.println("over90");
								
								WebElement over120Webelement=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(over120Ar_xpath));
								over120Webelement.getText().equalsIgnoreCase(over120);
								System.out.println("over120");
								
								driver.switchTo().defaultContent();
								
								}
								return true;}
								catch(Exception ex){
								return false;
								}}

	// rohit
	public boolean verifyReportForPayablesAllValuesMaintainArForMulDivForSkippedSummaryYesMul1(
			String expected, String asOfDate, String clientname, String accNo,
			String accName, String future, String current, String over30,
			String over60, String over90, String over120) {
		try {
		
				WebElement reportHeader = new WebDriverWait(driver, 100)
						.until(ExpectedConditions
								.visibilityOfElementLocated(headerReport_xpath));
				reportHeader.isDisplayed();
				System.out.println("Report header");

				driver.findElement(
						By.xpath("//h2[text()='Payables Aged Trial Balance as of: 02/01/2018']"))
						.isDisplayed();
				System.out.println("As Of date");

				driver.findElement(By.xpath("//h2[text()='"+clientname.toUpperCase()+"']"))
						.isDisplayed();
				System.out.println("Client name");

				WebElement futureWebElement = new WebDriverWait(driver, 100)
						.until(ExpectedConditions
								.visibilityOfElementLocated(futureAr_xpath));
				futureWebElement.getText().equalsIgnoreCase(future);
				System.out.println("Future");

				WebElement currentWebElement = new WebDriverWait(driver, 100)
						.until(ExpectedConditions
								.visibilityOfElementLocated(currentAr_xapth));
				currentWebElement.getText().equalsIgnoreCase(current);
				System.out.println("Current");

				WebElement over30WebElement = new WebDriverWait(driver, 100)
						.until(ExpectedConditions
								.visibilityOfElementLocated(over30Ar_xpath));
				over30WebElement.getText().equalsIgnoreCase(over30);
				System.out.println("over30");

				WebElement over60Webelement = new WebDriverWait(driver, 100)
						.until(ExpectedConditions
								.visibilityOfElementLocated(over60Ar_xpath));
				over60Webelement.getText().equalsIgnoreCase(over60);
				System.out.println("over60");

				WebElement over90Webelement = new WebDriverWait(driver, 100)
						.until(ExpectedConditions
								.visibilityOfElementLocated(over90Ar_xpath));
				over90Webelement.getText().equalsIgnoreCase(over90);
				System.out.println("over90");

				WebElement over120Webelement = new WebDriverWait(driver, 100)
						.until(ExpectedConditions
								.visibilityOfElementLocated(over120Ar_xpath));
				over120Webelement.getText().equalsIgnoreCase(over120);
				System.out.println("over120");

			return true;
		} catch (Exception ex) {
			return false;
		}
	}
						 
							 public boolean verifyReportAPARMaintainArForMulDivForSkipped(String expected,String asOfDate,String clientname,String accNo,String accName,String future,String current,String over30,String over60,String over90,String over120,String total)

								{
								try{
								WebElement WebEelement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(htmlButton_xpath));
								WebEelement.click();
								//Thread.sleep(5000);
								Set <String> handles =driver.getWindowHandles();
								Iterator<String> it = handles.iterator();
								//iterate through your windows
								while (it.hasNext()){
								String parent = it.next();
								String newwin = it.next();
								driver.switchTo().window(newwin);
								//
								
								WebElement reportHeader=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(headerReport_xpath));
								reportHeader.isDisplayed();
								System.out.println("Report header");
								
								driver.findElement(By.xpath("//h2[text()='Payables Aged Trial Balance as of: 02/01/2018']")).isDisplayed();	
								System.out.println("As Of date");
								
								driver.findElement(By.xpath("//h2[text()='"+clientname.toUpperCase()+"']")).isDisplayed();	
								System.out.println("Client name");
							
								
								WebElement futureWebElement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(futureAr_xpath));
								futureWebElement.getText().equalsIgnoreCase(future);
								System.out.println("Future");
								
								WebElement currentWebElement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(currentAr_xapth));
								currentWebElement.getText().equalsIgnoreCase(current);
								System.out.println("Current");
								
								WebElement over30WebElement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(over30Ar_xpath));
								over30WebElement.getText().equalsIgnoreCase(over30);
								System.out.println("over30");
								
								WebElement over60Webelement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(over60Ar_xpath));
								over60Webelement.getText().equalsIgnoreCase(over60);
								System.out.println("over60");
								
								WebElement over90Webelement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(over90Ar_xpath));
								over90Webelement.getText().equalsIgnoreCase(over90);
								System.out.println("over90");
								
								WebElement over120Webelement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(over120Ar_xpath));
								over120Webelement.getText().equalsIgnoreCase(over120);
								System.out.println("over120");
								
								driver.switchTo().defaultContent();
								
								}
								return true;}
								catch(Exception ex){
								return false;
								}}

							
	// rohit
	public boolean verifyTotalAvailableBeforeSublimitC1(
			String totalAvailableBeforeSublimit) {
		try {
			WebElement elementWebElement = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(totalAvailableBeforeSublimit_xpath));
			WebElement AmountWebElement = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(totalAvailableBeforeSublimitValueC1_xpath));
			elementWebElement.isDisplayed();
			String actual = AmountWebElement.getText().trim();
			if (actual.equals(totalAvailableBeforeSublimit))
				return true;
			else
				return false;

		} catch (Exception e) {
			return false;
		}

	}
							

							  public boolean  verifyTotalAvailableBeforeSublimitC(String totalAvailableBeforeSublimit){
							    	try {
							    		WebElement elementWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(totalAvailableBeforeSublimit_xpath));
							    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(totalAvailableBeforeSublimitValueC_xpath));
							    		elementWebElement.isDisplayed();
							    		String actual = AmountWebElement.getText().trim();
							    		if (actual.equals(totalAvailableBeforeSublimit))
							    			return true;
							    		else
							    			return false;

							    	} catch (Exception e) {
							    		return false;
							    	}				    	
							    	
							  

					
								}
							  



								//
							  public boolean verifyReportAllValuesSkipped(String expected,String asOfDate,String clientname,String future,String current,String over30,String over60,String over90,String over120,String total)
								{
								try{
								WebElement WebEelement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(htmlButton_xpath));
								WebEelement.click();
								//Thread.sleep(5000);
								Set <String> handles =driver.getWindowHandles();
								Iterator<String> it = handles.iterator();
								//iterate through your windows
								while (it.hasNext()){
								String parent = it.next();
								String newwin = it.next();
								driver.switchTo().window(newwin);
								//
								
								WebElement reportHeader=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(headerReport_xpath));
								reportHeader.isDisplayed();
								System.out.println("Report header");
								
								driver.findElement(By.xpath("//h2[text()='Receivables Aged Trial Balance for  as of: " +asOfDate+ "']")).isDisplayed();	
								System.out.println("As Of date");
								
								driver.findElement(By.xpath("//h2[text()='" +clientname +"']")).isDisplayed();	
								System.out.println("Client name");
															
								WebElement futureWebElement=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(future_xpath));
								futureWebElement.getText().equalsIgnoreCase(future);
								System.out.println("Future");
								
								WebElement currentWebElement=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(current_xapth));
								currentWebElement.getText().equalsIgnoreCase(current);
								System.out.println("Current");
								
								WebElement over30WebElement=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(over30_xpath));
								over30WebElement.getText().equalsIgnoreCase(over30);
								System.out.println("over30");
								
								WebElement over60Webelement=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(over60_xpath));
								over60Webelement.getText().equalsIgnoreCase(over60);
								System.out.println("over60");
								
								WebElement over90Webelement=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(over90_xpath));
								over90Webelement.getText().equalsIgnoreCase(over90);
								System.out.println("over90");
								
								WebElement over120Webelement=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(over120_xpath));
								over120Webelement.getText().equalsIgnoreCase(over120);
								System.out.println("over120");
								
								WebElement totalWebelement=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(total_xpath));
								totalWebelement.getText().equalsIgnoreCase(total);
								System.out.println("Total");					
								driver.close();
								driver.switchTo().window(parent);				
								}
								return true;}
								catch(Exception ex){
								return false;
								}
								
								}
//rohit
	public boolean verifyReportAllValuesSkipped1(String expected,
			String asOfDate, String clientname, String future, String current,
			String over30, String over60, String over90, String over120,
			String total) {
		try {
			
				WebElement reportHeader = new WebDriverWait(driver, 100)
						.until(ExpectedConditions
								.visibilityOfElementLocated(headerReport_xpath));
				reportHeader.isDisplayed();
				System.out.println("Report header");

				driver.findElement(
						By.xpath("//h2[text()='Receivables Aged Trial Balance for  as of: "
								+ asOfDate + "']")).isDisplayed();
				System.out.println("As Of date");

				driver.findElement(
						By.xpath("//h2[text()='" + clientname.toUpperCase() + "']"))
						.isDisplayed();
				System.out.println("Client name");

				WebElement futureWebElement = new WebDriverWait(driver, 100)
						.until(ExpectedConditions
								.visibilityOfElementLocated(future_xpath));
				futureWebElement.getText().equalsIgnoreCase(future);
				System.out.println("Future");

				WebElement currentWebElement = new WebDriverWait(driver, 100)
						.until(ExpectedConditions
								.visibilityOfElementLocated(current_xapth));
				currentWebElement.getText().equalsIgnoreCase(current);
				System.out.println("Current");

				WebElement over30WebElement = new WebDriverWait(driver, 100)
						.until(ExpectedConditions
								.visibilityOfElementLocated(over30_xpath));
				over30WebElement.getText().equalsIgnoreCase(over30);
				System.out.println("over30");

				WebElement over60Webelement = new WebDriverWait(driver, 100)
						.until(ExpectedConditions
								.visibilityOfElementLocated(over60_xpath));
				over60Webelement.getText().equalsIgnoreCase(over60);
				System.out.println("over60");

				WebElement over90Webelement = new WebDriverWait(driver, 100)
						.until(ExpectedConditions
								.visibilityOfElementLocated(over90_xpath));
				over90Webelement.getText().equalsIgnoreCase(over90);
				System.out.println("over90");

				WebElement over120Webelement = new WebDriverWait(driver, 100)
						.until(ExpectedConditions
								.visibilityOfElementLocated(over120_xpath));
				over120Webelement.getText().equalsIgnoreCase(over120);
				System.out.println("over120");

				WebElement totalWebelement = new WebDriverWait(driver, 100)
						.until(ExpectedConditions
								.visibilityOfElementLocated(total_xpath));
				totalWebelement.getText().equalsIgnoreCase(total);
				System.out.println("Total");

			return true;
		} catch (Exception ex) {
			return false;
		}

	}					  
	
	public boolean verifyReportAllValuesInPayablesAgedTrialBalanceSkipped1(
			String expected, String asOfDate, String clientname, String future,
			String current, String over30, String over60, String over90,
			String over120, String total) {
		try {
			
				WebElement reportHeader = new WebDriverWait(driver, 100)
						.until(ExpectedConditions
								.visibilityOfElementLocated(headerReport_xpath));
				reportHeader.isDisplayed();
				System.out.println("Report header");

				driver.findElement(
						By.xpath("//h2[text()='Payables Aged Trial Balance as of: "
								+ asOfDate + "']")).isDisplayed();
				System.out.println("As Of date");

				driver.findElement(
						By.xpath("//h2[text()='" + clientname.toUpperCase() + "']"))
						.isDisplayed();
				System.out.println("Client name");

				WebElement futureWebElement = new WebDriverWait(driver, 100)
						.until(ExpectedConditions
								.visibilityOfElementLocated(future_xpath));
				futureWebElement.getText().equalsIgnoreCase(future);
				System.out.println("Future");

				WebElement currentWebElement = new WebDriverWait(driver, 100)
						.until(ExpectedConditions
								.visibilityOfElementLocated(current_xapth));
				currentWebElement.getText().equalsIgnoreCase(current);
				System.out.println("Current");

				WebElement over30WebElement = new WebDriverWait(driver, 100)
						.until(ExpectedConditions
								.visibilityOfElementLocated(over30_xpath));
				over30WebElement.getText().equalsIgnoreCase(over30);
				System.out.println("over30");

				WebElement over60Webelement = new WebDriverWait(driver, 100)
						.until(ExpectedConditions
								.visibilityOfElementLocated(over60_xpath));
				over60Webelement.getText().equalsIgnoreCase(over60);
				System.out.println("over60");

				WebElement over90Webelement = new WebDriverWait(driver, 100)
						.until(ExpectedConditions
								.visibilityOfElementLocated(over90_xpath));
				over90Webelement.getText().equalsIgnoreCase(over90);
				System.out.println("over90");

				WebElement over120Webelement = new WebDriverWait(driver, 100)
						.until(ExpectedConditions
								.visibilityOfElementLocated(over120_xpath));
				over120Webelement.getText().equalsIgnoreCase(over120);
				System.out.println("over120");

				WebElement totalWebelement = new WebDriverWait(driver, 100)
						.until(ExpectedConditions
								.visibilityOfElementLocated(total_xpath));
				totalWebelement.getText().equalsIgnoreCase(total);
				System.out.println("Total");

			return true;
		} catch (Exception ex) {
			return false;
		}
	}
	
							  public boolean verifyReportAllValuesInPayablesAgedTrialBalanceSkipped(String expected,String asOfDate,String clientname,String future,String current,String over30,String over60,String over90,String over120,String total)
								{
								try{
								WebElement WebEelement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(htmlButton_xpath));
								WebEelement.click();
								//Thread.sleep(5000);
								Set <String> handles =driver.getWindowHandles();
								Iterator<String> it = handles.iterator();
								//iterate through your windows
								while (it.hasNext()){
								String parent = it.next();
								String newwin = it.next();
								driver.switchTo().window(newwin);
								//
								
								WebElement reportHeader=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(headerReport_xpath));
								reportHeader.isDisplayed();
								System.out.println("Report header");
								
								driver.findElement(By.xpath("//h2[text()='Payables Aged Trial Balance as of: " +asOfDate+ "']")).isDisplayed();	
								System.out.println("As Of date");
								
								driver.findElement(By.xpath("//h2[text()='" +clientname +"']")).isDisplayed();	
								System.out.println("Client name");
								
								
								WebElement futureWebElement=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(future_xpath));
								futureWebElement.getText().equalsIgnoreCase(future);
								System.out.println("Future");
								
								WebElement currentWebElement=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(current_xapth));
								currentWebElement.getText().equalsIgnoreCase(current);
								System.out.println("Current");
								
								WebElement over30WebElement=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(over30_xpath));
								over30WebElement.getText().equalsIgnoreCase(over30);
								System.out.println("over30");
								
								WebElement over60Webelement=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(over60_xpath));
								over60Webelement.getText().equalsIgnoreCase(over60);
								System.out.println("over60");
								
								WebElement over90Webelement=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(over90_xpath));
								over90Webelement.getText().equalsIgnoreCase(over90);
								System.out.println("over90");
								
								WebElement over120Webelement=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(over120_xpath));
								over120Webelement.getText().equalsIgnoreCase(over120);
								System.out.println("over120");
								
								
								WebElement totalWebelement=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(total_xpath));
								totalWebelement.getText().equalsIgnoreCase(total);
								System.out.println("Total");
								

							
				            	 driver.close();
							        driver.switchTo().window(parent);
								}
								return true;}
								catch(Exception ex){
								return false;
								}
								}

							 
							 public boolean  verifyAgedCreditItem(String  AgedCreditItem){
						        	try {
						        		
						        		WebElement AmountWebElement = new WebDriverWait(driver, 10).
						        				until(ExpectedConditions.visibilityOfElementLocated(AgedCreditItem_xpath));
						        		JavascriptExecutor jse1 = (JavascriptExecutor)driver;;
										jse1.executeScript("arguments[0].scrollIntoView(true);", AmountWebElement);
						        		String actual = AmountWebElement.getText();
						        		if (actual.equals(AgedCreditItem))
						        			return true;
						        		else
						        			return false;

						        	} catch (Exception e) {
						        		return false;
						        	}
						        	
						        	}
						        
						        public boolean  verifyCrossAgedPercentage(String  CrossAgedPercentage){
						        	try {
						        		
						        		WebElement AmountWebElement = new WebDriverWait(driver, 10).
						        				until(ExpectedConditions.visibilityOfElementLocated(CrossAgedPercentage_xpath));
						        		JavascriptExecutor jse1 = (JavascriptExecutor)driver;;
										jse1.executeScript("arguments[0].scrollIntoView(true);", AmountWebElement);
						        		String actual = AmountWebElement.getText();
						        		if (actual.equals(CrossAgedPercentage))
						        			return true;
						        		else
						        			return false;

						        	} catch (Exception e) {
						        		return false;
						        	}
						        	
						        	}
						        public boolean  verifyConcentrationPercentage_AgedCreditLimit_EligibleBalance(String  ConcentrationPercentage){
						        	try {
						        		
						        		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(ConcentrationPercentageAgedcreditLimitEligibleBalance_xpath));
						        		String actual = AmountWebElement.getText().trim();
						        		if (actual.equals(ConcentrationPercentage))
						        			return true;
						        		else
						        			return false;

						        	} catch (Exception e) {
						        		return false;
						        	}
						        	
						        	}
						        
						        public boolean  verifyConcentrationPercentage_AgedCreditLimit_EligibleBalance_BBC(String  ConcentrationPercentage){
						        	try {
						        		
						        		WebElement AmountWebElement = new WebDriverWait(driver, 0).until(ExpectedConditions.visibilityOfElementLocated(ConcentrationPercentageAgedcreditLimitEligibleBalanceBBC_xpath));

						        		String actual = AmountWebElement.getText().trim();
						        		if (actual.equals(ConcentrationPercentage))
						        			return true;
						        		else
						        			return false;

						        	} catch (Exception e) {
						        		return false;
						        	}
						        	
						        	}
						        public boolean  verifyConcentrationPercentage_IneligibleCustomer_BBCMang(String  ConcentrationPercentage){
						        	try {
						        		

						        		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(ConcentrationPercentageIneligibleCustomerBBCMang_xpath));

						        		String actual = AmountWebElement.getText().trim();
						        		if (actual.equals(ConcentrationPercentage))
						        			return true;
						        		else
						        			return false;

						        	} catch (Exception e) {
						        		return false;
						        	}
						        	
						        	}
						        public boolean  verifyConcentrationPercentage(String  ConcentrationPercentage){
						        	try {
						        		

						        		WebElement AmountWebElement = new WebDriverWait(driver, 10).

						        				until(ExpectedConditions.visibilityOfElementLocated(ConcentrationPercentage_xpath));
						        		JavascriptExecutor jse1 = (JavascriptExecutor)driver;;
										jse1.executeScript("arguments[0].scrollIntoView(true);", AmountWebElement);
						        		String actual = AmountWebElement.getText();
						        		if (actual.equals(ConcentrationPercentage))
						        			return true;
						        		else
						        			return false;

						        	} catch (Exception e) {
						        		return false;
						        	}
						        	
						        	}
						        
						        public boolean  verifyConcentrationPercentage_AgedCreditLimit(String  ConcentrationPercentage){
						        	try {
						        		

						        		WebElement AmountWebElement = new WebDriverWait(driver, 10).

						        				until(ExpectedConditions.visibilityOfElementLocated(ConcentrationPercentageAgedCreditLimit_xpath));
						        		JavascriptExecutor jse1 = (JavascriptExecutor)driver;;
										jse1.executeScript("arguments[0].scrollIntoView(true);", AmountWebElement);
						        		String actual = AmountWebElement.getText();
						        		if (actual.equals(ConcentrationPercentage))
						        			return true;
						        		else
						        			return false;

						        	} catch (Exception e) {
						        		return false;
						        	}
						        	
						        	}
						        public boolean  verifyConcentrationPercentage_AgedCreditLimit_Exclude(String  ConcentrationPercentage){
						        	try {
						        		

						        		WebElement AmountWebElement = new WebDriverWait(driver, 10).

						        				until(ExpectedConditions.visibilityOfElementLocated(ConcentrationPercentageAgedCreditLimitExclude_xpath));
						        		JavascriptExecutor jse1 = (JavascriptExecutor)driver;;
										jse1.executeScript("arguments[0].scrollIntoView(true);", AmountWebElement);
						        		String actual = AmountWebElement.getText();
						        		if (actual.equals(ConcentrationPercentage))
						        			return true;
						        		else
						        			return false;

						        	} catch (Exception e) {
						        		return false;
						        	}
						        	
						        	}
						        public boolean  verifyConcentrationPercentage_IneligibleCustomer(String  ConcentrationPercentage){
						        	try {
						        		

						        		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(ConcentrationPercentageIneligibleCustomer_xpath));

						        		String actual = AmountWebElement.getText().trim();
						        		if (actual.equals(ConcentrationPercentage))
						        			return true;
						        		else
						        			return false;

						        	} catch (Exception e) {
						        		return false;
						        	}
						        	
						        	}
						        public boolean  verifyConcentrationPercentage_AgedCreditLimit_Exclude_BBC(String  ConcentrationPercentage){
						        	try {
						        		

						        		WebElement AmountWebElement = new WebDriverWait(driver, 10).

						        				until(ExpectedConditions.visibilityOfElementLocated(ConcentrationPercentageAgedCreditLimitExclude_bbc_xpath));
						        		JavascriptExecutor jse1 = (JavascriptExecutor)driver;;
										jse1.executeScript("arguments[0].scrollIntoView(true);", AmountWebElement);
						        		String actual = AmountWebElement.getText();
						        		if (actual.equals(ConcentrationPercentage))
						        			return true;
						        		else
						        			return false;

						        	} catch (Exception e) {
						        		return false;
						        	}
						        	
						        	}
						        
						        public boolean  verifyPastDueDate(String  AgedPastDueDays){
						        	try {
						        		

						        		WebElement AmountWebElement = new WebDriverWait(driver, 10).

						        				until(ExpectedConditions.visibilityOfElementLocated(PastDueDays_xpath));
						        		JavascriptExecutor jse1 = (JavascriptExecutor)driver;;
										jse1.executeScript("arguments[0].scrollIntoView(true);", AmountWebElement);
						        		String actual = AmountWebElement.getText().trim();
							    		if (actual.equals(AgedPastDueDays))
							    			return true;
							    		else
							    			return false;

							    	} catch (Exception e) {
							    		return false;
							    	}
							    	
							    }	
						        public boolean  verifyIneligibleCustomer(String  Ineligible){
						        	try {
						        		

						        		WebElement AmountWebElement = new WebDriverWait(driver, 10).

						        				until(ExpectedConditions.visibilityOfElementLocated(IneligibleCustomer_xpath));
						        		JavascriptExecutor jse1 = (JavascriptExecutor)driver;;
										jse1.executeScript("arguments[0].scrollIntoView(true);", AmountWebElement);
						        		String actual = AmountWebElement.getText();
						        		if (actual.equals(Ineligible))
						        			return true;
						        		else
						        			return false;

						        	} catch (Exception e) {
						        		return false;
						        	}
						        	
						        	}

						        public boolean ClickOnHTML()

								{
			     try{
			     WebElement WebEelement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(htmlButton_xpath));
			     WebEelement.click();
			     //Thread.sleep(5000);
			     Set <String> handles =driver.getWindowHandles();
			     Iterator<String> it = handles.iterator();
			     //iterate through your windows
			     while (it.hasNext()){
			     String parent = it.next();
			     String newwin = it.next();
			     driver.switchTo().window(newwin);
			    
			
			     driver.switchTo().defaultContent();
			     
			     }
			     return true;}
			     catch(Exception ex){
			     return false;
			     }}
						        public boolean  verifyAgedCreditItemBBCMang(String  AgedCreditItem){
						        	try {
						        		

						        		WebElement AmountWebElement = new WebDriverWait(driver, 10).

						        				until(ExpectedConditions.visibilityOfElementLocated(AgedCreditItemBBCMang_xpath));
						        		JavascriptExecutor jse1 = (JavascriptExecutor)driver;;
										jse1.executeScript("arguments[0].scrollIntoView(true);", AmountWebElement);
						        		String actual = AmountWebElement.getText();
						        		if (actual.equals(AgedCreditItem))
						        			return true;
						        		else
						        			return false;

						        	} catch (Exception e) {
						        		return false;
						        	}
						        	
						        	}
						        
						        public boolean  verifyCrossAgedPercentageBBCMang(String  CrossAgedPercentage){
						        	try {
						        		

						        		WebElement AmountWebElement = new WebDriverWait(driver, 10).

						        				until(ExpectedConditions.visibilityOfElementLocated(CrossAgedPercentageBBCMang_xpath));
						        		JavascriptExecutor jse1 = (JavascriptExecutor)driver;;
										jse1.executeScript("arguments[0].scrollIntoView(true);", AmountWebElement);
						        		String actual = AmountWebElement.getText();
						        		if (actual.equals(CrossAgedPercentage))
						        			return true;
						        		else
						        			return false;

						        	} catch (Exception e) {
						        		return false;
						        	}
						        	
						        	}

						        
						        public boolean  verifyConcentrationPercentageBBCMang(String  ConcentrationPercentage){
						        	try {
						        		

						        		WebElement AmountWebElement = new WebDriverWait(driver, 10).

						        				until(ExpectedConditions.visibilityOfElementLocated(ConcentrationPercentageBBCMang_xpath));
						        		JavascriptExecutor jse1 = (JavascriptExecutor)driver;;
										jse1.executeScript("arguments[0].scrollIntoView(true);", AmountWebElement);
						        		String actual = AmountWebElement.getText();
						        		if (actual.equals(ConcentrationPercentage))
						        			return true;
						        		else
						        			return false;

						        	} catch (Exception e) {
						        		return false;
						        	}
						        	
						        	}
						        
						        
						        public boolean  verifyPastDueDateBBCMang(String  AgedPastDueDays){
						        	try {
						        		

						        		WebElement AmountWebElement = new WebDriverWait(driver, 10).

						        				until(ExpectedConditions.visibilityOfElementLocated(PastDueDaysBBCMang_xpath));
						        		JavascriptExecutor jse1 = (JavascriptExecutor)driver;;
										jse1.executeScript("arguments[0].scrollIntoView(true);", AmountWebElement);
						        		String actual = AmountWebElement.getText().trim();
							    		if (actual.equals(AgedPastDueDays))
							    			return true;
							    		else
							    			return false;

							    	} catch (Exception e) {
							    		return false;
							    	}
							    	
							    }	
						        public boolean  verifyIneligibleCustomerBBCMang(String  Ineligible){
						        	try {
						        		

						        		WebElement AmountWebElement = new WebDriverWait(driver, 10).

						        				until(ExpectedConditions.visibilityOfElementLocated(IneligibleCustomerBBCMang_xpath));
						        		JavascriptExecutor jse1 = (JavascriptExecutor)driver;;
										jse1.executeScript("arguments[0].scrollIntoView(true);", AmountWebElement);
						        		String actual = AmountWebElement.getText();
						        		if (actual.equals(Ineligible))
						        			return true;
						        		else
						        			return false;

						        	} catch (Exception e) {
						        		return false;
						        	}
						        	
						        	}
						        public boolean  verifyConcentrationPercentage_CrossAgedPercentage_Cap(String  ConcentrationPercentage){
						    		try {


						    			WebElement AmountWebElement = new WebDriverWait(driver, 10).

						    					until(ExpectedConditions.visibilityOfElementLocated(ConcentrationPercentageCrossAgedPercentageExclude_xpath));
						    			JavascriptExecutor jse1 = (JavascriptExecutor)driver;;
						    			jse1.executeScript("arguments[0].scrollIntoView(true);", AmountWebElement);
						    			String actual = AmountWebElement.getText();
						    			if (actual.equals(ConcentrationPercentage))
						    				return true;
						    			else
						    				return false;

						    		} catch (Exception e) {
						    			return false;
						    		}
						    		
						    		}
						        public boolean  verifyConcentrationPercentage_CrossAgedPercentage_Cap_BBC(String  ConcentrationPercentage){
						    		try {
						    			

						    			WebElement AmountWebElement = new WebDriverWait(driver, 10).

						    					until(ExpectedConditions.visibilityOfElementLocated(ConcentrationPercentageCrossAgedPercentageExcludeBBC_xpath));
						    			JavascriptExecutor jse1 = (JavascriptExecutor)driver;;
						    			jse1.executeScript("arguments[0].scrollIntoView(true);", AmountWebElement);
						    			String actual = AmountWebElement.getText();
						    			if (actual.equals(ConcentrationPercentage))
						    				return true;
						    			else
						    				return false;


						    		} catch (Exception e) {
						    			return false;
						    		}
						    		
						    		}
						        
						        public boolean  verifyConcentrationPercentage_TotalReceivabels_Cap(String  ConcentrationPercentage){
						    		try {
						    			

						    			WebElement AmountWebElement = new WebDriverWait(driver, 10).

						    					until(ExpectedConditions.visibilityOfElementLocated(ConcentrationPercentageTotalReceivablesCap_xpath));
						    			JavascriptExecutor jse1 = (JavascriptExecutor)driver;;
						    			jse1.executeScript("arguments[0].scrollIntoView(true);", AmountWebElement);
						    			String actual = AmountWebElement.getText();
						    			if (actual.equals(ConcentrationPercentage))
						    				return true;
						    			else
						    				return false;
						    		} catch (Exception e) {
						    			return false;
						    		}
						    		
						    		}
						        
						    			
								
								
			
								public boolean verifyReportAllValuesInIneligibleEligibleSkipped(String expected,String asOfDate,String clientname,String total)
								{
								try{
								WebElement WebEelement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(htmlButton_xpath));
								WebEelement.click();
								//Thread.sleep(5000);
								Set <String> handles =driver.getWindowHandles();
								Iterator<String> it = handles.iterator();
								//iterate through your windows
								while (it.hasNext()){
								String parent = it.next();
								String newwin = it.next();
								driver.switchTo().window(newwin);
								//
								

								WebElement reportHeader=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(headerReport_xpath));

								reportHeader.isDisplayed();
								System.out.println("Report header");
								//h2[text()='Ineligible Receivables Analysis as of BBC dated on: 02/01/2018']
								driver.findElement(By.xpath("//h2[text()='Ineligible Receivables Analysis as of BBC dated on: " +asOfDate+ "']")).isDisplayed();	
								System.out.println("As Of date");
								
								driver.findElement(By.xpath("//h2[text()='" +clientname +"']")).isDisplayed();	
								System.out.println("Client name");
								

								WebElement totalWebelement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(totalIneligible_xpath));

								totalWebelement.getText().equalsIgnoreCase(total);
								System.out.println("Ineligible Amount");
								

							
								driver.close();
								driver.switchTo().window(parent);
								
								
								}
								return true;}
								catch(Exception ex){
								return false;
								}
								
								
								}
								
								public boolean verifyArApConcReportAllValuesSkipped(String expected,String asOfDate,String clientname,String perOfTotalAr,String total,String current,String over30,String over60,String over90,String over120)
								{
									try{
										WebElement WebEelement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(htmlButton_xpath));
										WebEelement.click();
										//Thread.sleep(5000);
										Set <String> handles =driver.getWindowHandles();
										Iterator<String> it = handles.iterator();
										//iterate through your windows
										while (it.hasNext()){
										String parent = it.next();
										String newwin = it.next();
										driver.switchTo().window(newwin);
										//
										
										WebElement reportHeader=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(headerReport_xpath));
										reportHeader.isDisplayed();
										System.out.println("Report header");
										
										driver.findElement(By.xpath("//h2[text()='Debtors Concentrations as of:" +asOfDate+ "']")).isDisplayed();	
										System.out.println("As Of date");
										
										driver.findElement(By.xpath("//h2[text()='" +clientname +"']")).isDisplayed();	
										System.out.println("Client name");
								
								
								WebElement perOfTotalArWebelement=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(PercOfTotalARArAp_xpath));
								perOfTotalArWebelement.getText().trim().equalsIgnoreCase(perOfTotalAr);
								System.out.println("% of total AR");
								
								WebElement totalWebelement=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(totalarAp_xpath));
								totalWebelement.getText().trim().equalsIgnoreCase(total);
								System.out.println("Total");
								
								WebElement currentWebElement=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(currentArAp_xapth));
								currentWebElement.getText().trim().equalsIgnoreCase(current);
								System.out.println("Current");
								
								WebElement over30WebElement=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(over30ArAp_xpath));
								over30WebElement.getText().equalsIgnoreCase(over30);
								System.out.println("over30");
								
								WebElement over60Webelement=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(over60ArAp_xpath));
								over60Webelement.getText().equalsIgnoreCase(over60);
								System.out.println("over60");
								
								WebElement over90Webelement=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(over90ArAp_xpath));
								over90Webelement.getText().equalsIgnoreCase(over90);
								System.out.println("over90");
								
								WebElement over120Webelement=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(over120ArAp_xpath));
								over120Webelement.getText().equalsIgnoreCase(over120);
								System.out.println("over120");
								
								
								
								driver.close();
								driver.switchTo().window(parent);
								}
								return true;}
								catch(Exception ex){
								return false;
								}}

	
	// rohit
	public boolean verifyReportAllValuesInIneligibleEligibleSkipped1(
			String expected, String asOfDate, String clientname, String total) {
		try {
			
				WebElement reportHeader = new WebDriverWait(driver, 10)
						.until(ExpectedConditions
								.visibilityOfElementLocated(headerReport_xpath));

				reportHeader.isDisplayed();
				System.out.println("Report header");
				// h2[text()='Ineligible Receivables Analysis as of BBC dated
				// on: 02/01/2018']
				driver.findElement(
						By.xpath("//h2[text()='Ineligible Receivables Analysis as of BBC dated on: "
								+ asOfDate + "']")).isDisplayed();
				System.out.println("As Of date");

				driver.findElement(
						By.xpath("//h2[text()='" + clientname.toUpperCase() + "']"))
						.isDisplayed();
				System.out.println("Client name");

				WebElement totalWebelement = new WebDriverWait(driver, 10)
						.until(ExpectedConditions
								.visibilityOfElementLocated(totalIneligible_xpath));

				totalWebelement.getText().equalsIgnoreCase(total);
				System.out.println("Ineligible Amount");

			return true;
		} catch (Exception ex) {
			return false;
		}

	}
								
	// rohit
	public boolean verifyArApConcReportAllValuesSkipped1(String expected,
			String asOfDate, String clientname, String perOfTotalAr,
			String total, String current, String over30, String over60,
			String over90, String over120) {
		try {
				/*WebElement reportHeader = new WebDriverWait(driver, 100)
						.until(ExpectedConditions
								.visibilityOfElementLocated(headerReport_xpath));
				reportHeader.isDisplayed();
				System.out.println("Report header");*/

				driver.findElement(
						By.xpath("//h2[text()='Debtors Concentrations as of:"
								+ asOfDate + "']")).isDisplayed();
				System.out.println("As Of date");

				driver.findElement(
						By.xpath("//h2[text()='" + clientname.toUpperCase() + "']"))
						.isDisplayed();
				System.out.println("Client name");

				WebElement perOfTotalArWebelement = new WebDriverWait(driver,
						100).until(ExpectedConditions
						.visibilityOfElementLocated(PercOfTotalARArAp_xpath));
				perOfTotalArWebelement.getText().trim()
						.equalsIgnoreCase(perOfTotalAr);
				System.out.println("% of total AR");

				WebElement totalWebelement = new WebDriverWait(driver, 100)
						.until(ExpectedConditions
								.visibilityOfElementLocated(totalarAp_xpath));
				totalWebelement.getText().trim().equalsIgnoreCase(total);
				System.out.println("Total");

				WebElement currentWebElement = new WebDriverWait(driver, 100)
						.until(ExpectedConditions
								.visibilityOfElementLocated(currentArAp_xapth));
				currentWebElement.getText().trim().equalsIgnoreCase(current);
				System.out.println("Current");

				WebElement over30WebElement = new WebDriverWait(driver, 100)
						.until(ExpectedConditions
								.visibilityOfElementLocated(over30ArAp_xpath));
				over30WebElement.getText().equalsIgnoreCase(over30);
				System.out.println("over30");

				WebElement over60Webelement = new WebDriverWait(driver, 100)
						.until(ExpectedConditions
								.visibilityOfElementLocated(over60ArAp_xpath));
				over60Webelement.getText().equalsIgnoreCase(over60);
				System.out.println("over60");

				WebElement over90Webelement = new WebDriverWait(driver, 100)
						.until(ExpectedConditions
								.visibilityOfElementLocated(over90ArAp_xpath));
				over90Webelement.getText().equalsIgnoreCase(over90);
				System.out.println("over90");

				WebElement over120Webelement = new WebDriverWait(driver, 100)
						.until(ExpectedConditions
								.visibilityOfElementLocated(over120ArAp_xpath));
				over120Webelement.getText().equalsIgnoreCase(over120);
				System.out.println("over120");
			return true;
		} catch (Exception ex) {
			return false;
		}
	}

	// rohit
	public boolean verifyReportAllValuesInAssetsInventorySkipped1(
			String expected, String asOfDate, String clientname) {
		try {
				/*WebElement reportHeader = new WebDriverWait(driver, 10)
						.until(ExpectedConditions
								.visibilityOfElementLocated(headerReport_xpath));

				reportHeader.isDisplayed();
				System.out.println("Report header");*/

				driver.findElement(
						By.xpath("//h2[text()='Assets/Inventory Report as of BBC dated: "
								+ asOfDate + "']")).isDisplayed();
				System.out.println("As Of date");

				driver.findElement(
						By.xpath("//h2[text()='" + clientname.toUpperCase() + "']"))
						.isDisplayed();
				System.out.println("Client name");

				WebElement textWebelement = new WebDriverWait(driver, 10)
						.until(ExpectedConditions
								.visibilityOfElementLocated(noRecords_xpath));
				textWebelement.isDisplayed();
				System.out.println("No records found");

			return true;
		} catch (Exception ex) {
			return false;
		}
	}
								public boolean verifyReportAllValuesInAssetsInventorySkipped(String expected,String asOfDate,String clientname)
								{
								try{
								WebElement WebEelement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(htmlButton_xpath));
								WebEelement.click();
								//Thread.sleep(5000);
								Set <String> handles =driver.getWindowHandles();
								Iterator<String> it = handles.iterator();
								//iterate through your windows
								while (it.hasNext()){
								String parent = it.next();
								String newwin = it.next();
								driver.switchTo().window(newwin);
								//
								

								WebElement reportHeader=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(headerReport_xpath));

								reportHeader.isDisplayed();
								System.out.println("Report header");
								
								driver.findElement(By.xpath("//h2[text()='Assets/Inventory Report as of BBC dated: " +asOfDate+ "']")).isDisplayed();	
								System.out.println("As Of date");
								
								driver.findElement(By.xpath("//h2[text()='" +clientname +"']")).isDisplayed();	
								System.out.println("Client name");
								

								WebElement textWebelement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(noRecords_xpath));
								textWebelement.isDisplayed();
								System.out.println("No records found");
								
								
								driver.close();
								driver.switchTo().window(parent);
							
								}
								return true;}
								catch(Exception ex){
								return false;
								}}

								
								public boolean  verifyOSLoanBalanceLetterOfCreditSkipped(String oSLoanBalanceLetterOfCredit){
							    	try {
							    		WebElement elementWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(oSLoanBalanceLetterOfCredit_xpath));
							    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(oSLoanBalanceLetterOfCreditValueSkipped_xpath));
							    		elementWebElement.isDisplayed();
							    		String actual = AmountWebElement.getText().trim();
							    		if (actual.equals(oSLoanBalanceLetterOfCredit))
							    			return true;
							    		else
							    			return false;

							    	} catch (Exception e) {
							    		return false;
							    	}				    	
							    	}					
								 
								 public boolean  verifyOSLoanBalanceLetterOfCreditMC(String oSLoanBalanceLetterOfCredit){
								    	try {
								    		WebElement elementWebElement = new WebDriverWait(driver, 100).until(ExpectedConditions.visibilityOfElementLocated(oSLoanBalanceLetterOfCredit_xpath));
								    		WebElement AmountWebElement = new WebDriverWait(driver, 100).until(ExpectedConditions.visibilityOfElementLocated(oSLoanBalanceLetterOfCreditValueMC_xpath));
								    		elementWebElement.isDisplayed();
								    		String actual = AmountWebElement.getText().trim();
								    		if (actual.equals(oSLoanBalanceLetterOfCredit))
								    			return true;
								    		else
								    			return false;

								    	} catch (Exception e) {
								    		return false;
								    	}				    	
								    	}
								 
								 public boolean  verifyBorrowingBaseAvailabilityBbcSkipped(String  borrowingBaseAvailability){
								    	try {
								    		WebElement displayWebElement = new WebDriverWait(driver, 100).until(ExpectedConditions.visibilityOfElementLocated(borrowingBaseAvailability_xpath));
								    		WebElement AmountWebElement = new WebDriverWait(driver, 100).until(ExpectedConditions.visibilityOfElementLocated(borrowingBaseAvailabilityValueS_xpath));
								    		displayWebElement.isDisplayed();
								    		String actual = AmountWebElement.getText().trim();
								    		if (actual.equals(borrowingBaseAvailability))
								    			return true;
								    		else
								    			return false;

								    	} catch (Exception e) {
								    		return false;
								    	}
								    	
								    }
								 public boolean  verifyOsLoanBalanceMgmtM(String  osLoanBalanceMgmt){
								    	try {
								    		WebElement displayWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(oSLoanBalanceLetterOfCredit_xpath));
								    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(osBalanceMgmtM_xpath));
								    		displayWebElement.isDisplayed();
								    		String actual = AmountWebElement.getText().trim();
								    		if (actual.equals(osLoanBalanceMgmt))
								    			return true;
								    		else
								    			return false;

								    	} catch (Exception e) {
								    		return false;
								    	}}
								 
								 
								 public boolean  verifyOSLoanBalanceLetterOfCreditSkippedM(String oSLoanBalanceLetterOfCredit){
								    	try {
								    		WebElement elementWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(oSLoanBalanceLetterOfCredit_xpath));
								    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(oSLoanBalanceLetterOfCreditValueSkippedM_xpath));
								    		elementWebElement.isDisplayed();
								    		String actual = AmountWebElement.getText().trim();
								    		if (actual.equals(oSLoanBalanceLetterOfCredit))
								    			return true;
								    		else
								    			return false;

								    	} catch (Exception e) {
								    		return false;
								    	}				    	
								    	}	
						 
								 public boolean verifyReportAllValuesMaintainArSkipped(String expected,String asOfDate,String clientname,String future,String current,String over30,String over60,String over90,String over120,String total)
									{
									try{
									WebElement WebEelement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(htmlButton_xpath));
									WebEelement.click();
									//Thread.sleep(5000);
									Set <String> handles =driver.getWindowHandles();
									Iterator<String> it = handles.iterator();
									//iterate through your windows
									while (it.hasNext()){
									String parent = it.next();
									String newwin = it.next();
									driver.switchTo().window(newwin);
									//
									
									WebElement reportHeader=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(headerReport_xpath));
									reportHeader.isDisplayed();
									System.out.println("Report header");
									
									driver.findElement(By.xpath("//h2[text()='Receivables Aged Trial Balance for Summary as of: " +asOfDate+ "']")).isDisplayed();	
									System.out.println("As Of date");
									
									driver.findElement(By.xpath("//h2[text()='" +clientname +"']")).isDisplayed();	
									System.out.println("Client name");
									
									
									WebElement futureWebElement=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(futureAr_xpath));
									futureWebElement.getText().equalsIgnoreCase(future);
									System.out.println("Future");
									
									WebElement currentWebElement=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(currentAr_xapth));
									currentWebElement.getText().equalsIgnoreCase(current);
									System.out.println("Current");
									
									WebElement over30WebElement=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(over30Ar_xpath));
									over30WebElement.getText().equalsIgnoreCase(over30);
									System.out.println("over30");
									
									WebElement over60Webelement=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(over60Ar_xpath));
									over60Webelement.getText().equalsIgnoreCase(over60);
									System.out.println("over60");
									
									WebElement over90Webelement=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(over90Ar_xpath));
									over90Webelement.getText().equalsIgnoreCase(over90);
									System.out.println("over90");
									
									WebElement over120Webelement=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(over120Ar_xpath));
									over120Webelement.getText().equalsIgnoreCase(over120);
									System.out.println("over120");
									
									WebElement totalWebelement=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(totalAr_xpath));
									totalWebelement.getText().equalsIgnoreCase(total);
									System.out.println("Total");
									
									
									driver.close();
									driver.switchTo().window(parent);
									
									}
									return true;}
									catch(Exception ex){
									return false;
									}}

	// rohit
	public boolean verifyReportAllValuesMaintainArSkipped1(String expected,
			String asOfDate, String clientname, String future, String current,
			String over30, String over60, String over90, String over120,
			String total) {
		try {
				/*WebElement reportHeader = new WebDriverWait(driver, 100)
						.until(ExpectedConditions
								.visibilityOfElementLocated(headerReport_xpath));
				reportHeader.isDisplayed();
				System.out.println("Report header");*/

				driver.findElement(
						By.xpath("//h2[text()='Receivables Aged Trial Balance for Summary as of: "
								+ asOfDate + "']")).isDisplayed();
				System.out.println("As Of date");

				driver.findElement(
						By.xpath("//h2[text()='" + clientname.toUpperCase() + "']"))
						.isDisplayed();
				System.out.println("Client name");

				WebElement futureWebElement = new WebDriverWait(driver, 100)
						.until(ExpectedConditions
								.visibilityOfElementLocated(futureAr_xpath));
				futureWebElement.getText().equalsIgnoreCase(future);
				System.out.println("Future");

				WebElement currentWebElement = new WebDriverWait(driver, 100)
						.until(ExpectedConditions
								.visibilityOfElementLocated(currentAr_xapth));
				currentWebElement.getText().equalsIgnoreCase(current);
				System.out.println("Current");

				WebElement over30WebElement = new WebDriverWait(driver, 100)
						.until(ExpectedConditions
								.visibilityOfElementLocated(over30Ar_xpath));
				over30WebElement.getText().equalsIgnoreCase(over30);
				System.out.println("over30");

				WebElement over60Webelement = new WebDriverWait(driver, 100)
						.until(ExpectedConditions
								.visibilityOfElementLocated(over60Ar_xpath));
				over60Webelement.getText().equalsIgnoreCase(over60);
				System.out.println("over60");

				WebElement over90Webelement = new WebDriverWait(driver, 100)
						.until(ExpectedConditions
								.visibilityOfElementLocated(over90Ar_xpath));
				over90Webelement.getText().equalsIgnoreCase(over90);
				System.out.println("over90");

				WebElement over120Webelement = new WebDriverWait(driver, 100)
						.until(ExpectedConditions
								.visibilityOfElementLocated(over120Ar_xpath));
				over120Webelement.getText().equalsIgnoreCase(over120);
				System.out.println("over120");

				WebElement totalWebelement = new WebDriverWait(driver, 100)
						.until(ExpectedConditions
								.visibilityOfElementLocated(totalAr_xpath));
				totalWebelement.getText().equalsIgnoreCase(total);
				System.out.println("Total");

			return true;
		} catch (Exception ex) {
			return false;
		}
	}
								 
	// rohit
	public boolean verifyReportAllValuesInPayablesAgedTrialBalanceSkipped1(
			String expected, String asOfDate, String clientname, String future,
			String current, String over30, String over60, String over90,
			String over120) {
		try {
				/*WebElement reportHeader = new WebDriverWait(driver, 100)
						.until(ExpectedConditions
								.visibilityOfElementLocated(headerReport_xpath));
				reportHeader.isDisplayed();
				System.out.println("Report header");*/

				driver.findElement(
						By.xpath("//h2[text()='Payables Aged Trial Balance as of: "
								+ asOfDate + "']")).isDisplayed();
				System.out.println("As Of date");

				driver.findElement(
						By.xpath("//h2[text()='" + clientname.toUpperCase() + "']"))
						.isDisplayed();
				System.out.println("Client name");

				WebElement futureWebElement = new WebDriverWait(driver, 100)
						.until(ExpectedConditions
								.visibilityOfElementLocated(future_xpath));
				futureWebElement.getText().equalsIgnoreCase(future);
				System.out.println("Future");

				WebElement currentWebElement = new WebDriverWait(driver, 100)
						.until(ExpectedConditions
								.visibilityOfElementLocated(current_xapth));
				currentWebElement.getText().equalsIgnoreCase(current);
				System.out.println("Current");

				WebElement over30WebElement = new WebDriverWait(driver, 100)
						.until(ExpectedConditions
								.visibilityOfElementLocated(over30_xpath));
				over30WebElement.getText().equalsIgnoreCase(over30);
				System.out.println("over30");

				WebElement over60Webelement = new WebDriverWait(driver, 100)
						.until(ExpectedConditions
								.visibilityOfElementLocated(over60_xpath));
				over60Webelement.getText().equalsIgnoreCase(over60);
				System.out.println("over60");

				WebElement over90Webelement = new WebDriverWait(driver, 100)
						.until(ExpectedConditions
								.visibilityOfElementLocated(over90_xpath));
				over90Webelement.getText().equalsIgnoreCase(over90);
				System.out.println("over90");

				WebElement over120Webelement = new WebDriverWait(driver, 100)
						.until(ExpectedConditions
								.visibilityOfElementLocated(over120_xpath));
				over120Webelement.getText().equalsIgnoreCase(over120);
				System.out.println("over120");

			return true;
		} catch (Exception ex) {
			return false;
		}

	}
								 public boolean verifyReportAllValuesInPayablesAgedTrialBalanceSkipped(String expected,String asOfDate,String clientname,String future,String current,String over30,String over60,String over90,String over120)
									{
									try{
									WebElement WebEelement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(htmlButton_xpath));
									WebEelement.click();
									//Thread.sleep(5000);
									Set <String> handles =driver.getWindowHandles();
									Iterator<String> it = handles.iterator();
									//iterate through your windows
									while (it.hasNext()){
									String parent = it.next();
									String newwin = it.next();
									driver.switchTo().window(newwin);
									//
									
									WebElement reportHeader=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(headerReport_xpath));
									reportHeader.isDisplayed();
									System.out.println("Report header");
									
									driver.findElement(By.xpath("//h2[text()='Payables Aged Trial Balance as of: " +asOfDate+ "']")).isDisplayed();	
									System.out.println("As Of date");
									
									driver.findElement(By.xpath("//h2[text()='" +clientname +"']")).isDisplayed();	
									System.out.println("Client name");
									
									
									WebElement futureWebElement=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(future_xpath));
									futureWebElement.getText().equalsIgnoreCase(future);
									System.out.println("Future");
									
									WebElement currentWebElement=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(current_xapth));
									currentWebElement.getText().equalsIgnoreCase(current);
									System.out.println("Current");
									
									WebElement over30WebElement=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(over30_xpath));
									over30WebElement.getText().equalsIgnoreCase(over30);
									System.out.println("over30");
									
									WebElement over60Webelement=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(over60_xpath));
									over60Webelement.getText().equalsIgnoreCase(over60);
									System.out.println("over60");
									
									WebElement over90Webelement=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(over90_xpath));
									over90Webelement.getText().equalsIgnoreCase(over90);
									System.out.println("over90");
									
									WebElement over120Webelement=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(over120_xpath));
									over120Webelement.getText().equalsIgnoreCase(over120);
									System.out.println("over120");


								
									driver.close();
									driver.switchTo().window(parent);
									
									}
									return true;}
									catch(Exception ex){
									return false;
									}
									


									
									}
		
									 public boolean verifyDropdownIneligibleexcluded()

										{
					try{
					WebElement WebEelement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(htmlButton_xpath));
					WebEelement.click();
					//Thread.sleep(2000);
					Set <String> handles =driver.getWindowHandles();
					Iterator<String> it = handles.iterator();
					//iterate through your windows
					while (it.hasNext()){
					String parent = it.next();
					String newwin = it.next();
					driver.switchTo().window(newwin);
					//

					//Eligible AR
					WebElement HeaderWebEelement=new WebDriverWait(driver,10)
					.until(ExpectedConditions.visibilityOfElementLocated(excludedreason_xpath));
					HeaderWebEelement.isDisplayed();

					driver.switchTo().defaultContent();

					}
					return true;}
					catch(Exception ex){
					return false;
					}}
									 
										public  boolean verifyIneligibleexcluded_ineligiblereportbyreasonunapproveScreen(String ReasonData){
											try{

											WebElement verifyIneligibilityReasonWebE=new WebDriverWait(driver,10)
											.until(ExpectedConditions.visibilityOfElementLocated(excludedreason_xpath));
											//Thread.sleep(100);
											String ActualReason = verifyIneligibilityReasonWebE.getText().trim();
											if(ActualReason.equalsIgnoreCase(ReasonData))
											{
												System.out.println(ReasonData);
												return true;
												}
										else {
											return false;
										}
											}	
											catch (Exception ex) 
											{
													
												return false;
											}
											}
										public  boolean verifyIneligibleexcludedamnt_ineligiblereportbyreason_unapprovecreen1(String ReasonAmount){
											try{

											WebElement verifyIneligibilityAmountWebE=new WebDriverWait(driver,10)
											.until(ExpectedConditions.visibilityOfElementLocated(excludeamnt3_xpath));
											//Thread.sleep(100);
											String ActualAmount = verifyIneligibilityAmountWebE.getText();
											if(ActualAmount.equalsIgnoreCase(ReasonAmount))
											{
												System.out.println(ReasonAmount);
												return true;
												}
										else {
											return false;
										}
										}	
											catch (Exception ex) 
											{
													
												return false;
											}
												
												
											}
										public  boolean verifyIneligibleexcludedamnt_ineligiblereportbyreason_unapprovecreen5(String ReasonAmount){
											try{

											WebElement verifyIneligibilityAmountWebE=new WebDriverWait(driver,10)

											.until(ExpectedConditions.visibilityOfElementLocated(excludeamnt11_xpath));
											//Thread.sleep(100);
											String ActualAmount = verifyIneligibilityAmountWebE.getText();
											if(ActualAmount.equalsIgnoreCase(ReasonAmount))
											{
												System.out.println(ReasonAmount);
												return true;
												}
										else {
											return false;
										}
										}	
											catch (Exception ex) 
											{
													
												return false;
											}
												
												
											}
										public  boolean verifyIneligibleexcludedamnt_ineligiblereportbyreason_unapprovecreen4(String ReasonAmount){
											try{

											WebElement verifyIneligibilityAmountWebE=new WebDriverWait(driver,10)

											.until(ExpectedConditions.visibilityOfElementLocated(excludeamnt9_xpath));
											//Thread.sleep(100);
											String ActualAmount = verifyIneligibilityAmountWebE.getText();
											if(ActualAmount.equalsIgnoreCase(ReasonAmount))
											{
												System.out.println(ReasonAmount);
												return true;
												}
										else {
											return false;
										}
										}	
											catch (Exception ex) 
											{
													
												return false;
											}
												
												
											}
										
										public  boolean verifyIneligibleexcludedamnt_ineligiblereportbyreason_unapprovecreen2(String ReasonAmount){
											try{

											WebElement verifyIneligibilityAmountWebE=new WebDriverWait(driver,10)
											.until(ExpectedConditions.visibilityOfElementLocated(excludeamnt6_xpath));
											//Thread.sleep(100);
											String ActualAmount = verifyIneligibilityAmountWebE.getText();
											if(ActualAmount.equalsIgnoreCase(ReasonAmount))
											{
												System.out.println(ReasonAmount);
												return true;
												}
										else {
											return false;
										}
										}	
											catch (Exception ex) 
											{
													
												return false;
											}
												
												
											}
										public  boolean verifyIneligibleexcludedamnt_ineligiblereportbyreason_unapprovecreen3(String ReasonAmount){
											try{

											WebElement verifyIneligibilityAmountWebE=new WebDriverWait(driver,10)
											.until(ExpectedConditions.visibilityOfElementLocated(excludeamnt6_xpath));
											//Thread.sleep(100);
											String ActualAmount = verifyIneligibilityAmountWebE.getText();
											if(ActualAmount.equalsIgnoreCase(ReasonAmount))
											{
												System.out.println(ReasonAmount);
												return true;
												}
										else {
											return false;
										}
										}	
											catch (Exception ex) 
											{
													
												return false;
											}
												
												
											}
										public  boolean verifyIneligibleexcludedamnt_ineligiblereportbyreason_unapprovecreen(String ReasonAmount){
											try{

											WebElement verifyIneligibilityAmountWebE=new WebDriverWait(driver,10)
											.until(ExpectedConditions.visibilityOfElementLocated(excludeamnt1_xpath));
	
											String ActualAmount = verifyIneligibilityAmountWebE.getText();
											if(ActualAmount.equalsIgnoreCase(ReasonAmount))
											{
												System.out.println(ReasonAmount);
												return true;
												}
										else {
											return false;
										}
										}	
											catch (Exception ex) 
											{
													
												return false;
											}
												
												
											}
										public  boolean verifyIneligibleexcludedamnt_ineligiblereportbyreason_unapprovecreen9(String ReasonAmount){
											try{

											WebElement verifyIneligibilityAmountWebE=new WebDriverWait(driver,10)
											.until(ExpectedConditions.visibilityOfElementLocated(excludeamnt14_xpath));
											Thread.sleep(100);

											String ActualAmount = verifyIneligibilityAmountWebE.getText();
											if(ActualAmount.equalsIgnoreCase(ReasonAmount))
											{
												System.out.println(ReasonAmount);
												return true;
												}
										else {
											return false;
										}
										}	
											catch (Exception ex) 
											{
													
												return false;
											}
												
												
											}
										
										
										
										public  boolean verifyIneligibleexcludedamnt_bbcreport_unapprovecreen4(String ReasonAmount){
											try{

											WebElement verifyIneligibilityAmountWebE=new WebDriverWait(driver,10)
											.until(ExpectedConditions.visibilityOfElementLocated(excludedamnt3_xpath));
											//Thread.sleep(100);
											String ActualAmount = verifyIneligibilityAmountWebE.getText();
											if(ActualAmount.equalsIgnoreCase(ReasonAmount))
											{
												System.out.println(ReasonAmount);
												return true;
												}
										else {
											return false;
										}
										}	
											catch (Exception ex) 
											{
													
												return false;
											}
												
												
											}
										
										public  boolean verifyIneligibleexcludedamnt_bbcreport_unapprovecreen6(String ReasonAmount){
											try{

											WebElement verifyIneligibilityAmountWebE=new WebDriverWait(driver,10)

											.until(ExpectedConditions.visibilityOfElementLocated(excludedamnt8_xpath));
											//Thread.sleep(100);
											String ActualAmount = verifyIneligibilityAmountWebE.getText();
											if(ActualAmount.equalsIgnoreCase(ReasonAmount))
											{
												System.out.println(ReasonAmount);
												return true;
												}
										else {
											return false;
										}
										}	
											catch (Exception ex) 
											{
													
												return false;
											}
												
												
											}	
										
										public  boolean verifyIneligibleexcludedamnt_bbcreport_unapprovecreen5(String ReasonAmount){
											try{

											WebElement verifyIneligibilityAmountWebE=new WebDriverWait(driver,10)

											.until(ExpectedConditions.visibilityOfElementLocated(excludedamnt9_xpath));
											//Thread.sleep(100);
											String ActualAmount = verifyIneligibilityAmountWebE.getText();
											if(ActualAmount.equalsIgnoreCase(ReasonAmount))
											{
												System.out.println(ReasonAmount);
												return true;
												}
										else {
											return false;
										}
										}	
											catch (Exception ex) 
											{
													
												return false;
											}
												
												
											}
										public  boolean verifyIneligibleexcludedamnt_bbcreport_approvecreen4(String ReasonAmount){
											try{

											WebElement verifyIneligibilityAmountWebE=new WebDriverWait(driver,10)
											.until(ExpectedConditions.visibilityOfElementLocated(excludedamnt4_xpath));
											//Thread.sleep(100);
											String ActualAmount = verifyIneligibilityAmountWebE.getText();
											if(ActualAmount.equalsIgnoreCase(ReasonAmount))
											{
												System.out.println(ReasonAmount);
												return true;
												}
										else {
											return false;
										}
										}	
											catch (Exception ex) 
											{
													
												return false;
											}
												
												
											}
										public  boolean verifyIneligibleexcludedamnt_bbcreport_approvecreen3(String ReasonAmount){
											try{

											WebElement verifyIneligibilityAmountWebE=new WebDriverWait(driver,10)

											.until(ExpectedConditions.visibilityOfElementLocated(excludedamnt4_xpath));
											//Thread.sleep(100);
											String ActualAmount = verifyIneligibilityAmountWebE.getText();
											if(ActualAmount.equalsIgnoreCase(ReasonAmount))
											{
												System.out.println(ReasonAmount);
												return true;
												}
										else {
											return false;
										}
										}	
											catch (Exception ex) 
											{
													
												return false;
											}
												
												
											}
										public  boolean verifyIneligibleexcludedamnt_bbcreport_approvecreen6(String ReasonAmount){
											try{

											WebElement verifyIneligibilityAmountWebE=new WebDriverWait(driver,10)

											.until(ExpectedConditions.visibilityOfElementLocated(excludeamnt13_xpath));
											//Thread.sleep(100);
											String ActualAmount = verifyIneligibilityAmountWebE.getText();
											if(ActualAmount.equalsIgnoreCase(ReasonAmount))
											{
												System.out.println(ReasonAmount);
												return true;
												}
										else {
											return false;
										}
										}	
											catch (Exception ex) 
											{
													
												return false;
											}
												
												
											}
										public  boolean verifyIneligibleexcludedamnt_bbcreport_approvecreen5(String ReasonAmount){
											try{

											WebElement verifyIneligibilityAmountWebE=new WebDriverWait(driver,10)

											.until(ExpectedConditions.visibilityOfElementLocated(excludeamnt10_xpath));
											//Thread.sleep(100);
											String ActualAmount = verifyIneligibilityAmountWebE.getText();
											if(ActualAmount.equalsIgnoreCase(ReasonAmount))
											{
												System.out.println(ReasonAmount);
												return true;
												}
										else {
											return false;
										}
										}	
											catch (Exception ex) 
											{
													
												return false;
											}
												
												
											}
										
										public  boolean verifyIneligibleexcludedamnt_bbcreport_approvecreen2(String ReasonAmount){
											try{

											WebElement verifyIneligibilityAmountWebE=new WebDriverWait(driver,10)

											.until(ExpectedConditions.visibilityOfElementLocated(excludedamnt_xpath));
											//Thread.sleep(100);
											String ActualAmount = verifyIneligibilityAmountWebE.getText();
											if(ActualAmount.equalsIgnoreCase(ReasonAmount))
											{
												System.out.println(ReasonAmount);
												return true;
												}
										else {
											return false;
										}
										}	
											catch (Exception ex) 
											{
													
												return false;
											}
												
												
											}
										public  boolean verifyIneligibleagedpastdueamnt_bbcreport_approvecreen2(String ReasonAmount1){
											try{

											WebElement verifyIneligibilityAmountWebE=new WebDriverWait(driver,10)

											.until(ExpectedConditions.visibilityOfElementLocated(agedpstamnt1_xpath));
											Thread.sleep(100);
											String ActualAmount = verifyIneligibilityAmountWebE.getText();
											if(ActualAmount.equalsIgnoreCase(ReasonAmount1))
											{
												System.out.println(ReasonAmount1);
												return true;
												}
										else {
											return false;
										}
										}	
											catch (Exception ex) 
											{
													
												return false;
											}
												
												
											}
										public  boolean verifyIneligibleagedpastdueamnt_report_approvecreen9(String ReasonAmount1){
											try{

											WebElement verifyIneligibilityAmountWebE=new WebDriverWait(driver,10)

											.until(ExpectedConditions.visibilityOfElementLocated(agedpstamnt2_xpath));
											Thread.sleep(100);
											String ActualAmount = verifyIneligibilityAmountWebE.getText();
											if(ActualAmount.equalsIgnoreCase(ReasonAmount1))
											{
												System.out.println(ReasonAmount1);
												return true;
												}
										else {
											return false;
										}
										}	
											catch (Exception ex) 
											{
													
												return false;
											}
												
												
											}
										public  boolean verifyIneligibleexcluded_bbcreportunapproveScreen(String ReasonData){
									    	try{

									    	WebElement verifyIneligibilityReasonWebE=new WebDriverWait(driver,10)

									    	.until(ExpectedConditions.visibilityOfElementLocated(excludedreason_xpath));
									    	//Thread.sleep(100);
									    	String ActualReason = verifyIneligibilityReasonWebE.getText().trim();
									    	if(ActualReason.equalsIgnoreCase(ReasonData))
									    	{
									    		System.out.println(ReasonData);
									    		return true;
									    		}
									    else {
									    	return false;
									    }
									    	}	
									    	catch (Exception ex) 
									    	{
									    			
									    		return false;
									    	}
									    		
									    		
									    	}	
										public  boolean verifyIneligibleagedpastdue_bbcreportunapproveScreen(String ReasonData1){
									    	try{

									    	WebElement verifyIneligibilityReasonWebE=new WebDriverWait(driver,10)

									    	.until(ExpectedConditions.visibilityOfElementLocated(agedpastdue_xpath));
									    	Thread.sleep(100);
									    	String ActualReason = verifyIneligibilityReasonWebE.getText().trim();
									    	if(ActualReason.equalsIgnoreCase(ReasonData1))
									    	{
									    		System.out.println(ReasonData1);
									    		return true;
									    		}
									    else {
									    	return false;
									    }
									    	}	
									    	catch (Exception ex) 
									    	{
									    			
									    		return false;
									    	}
									    		
									    		
									    	}	
										public  boolean verifyIneligibleexcludedamnt_bbcreport_approvecreen8(String ReasonAmount){
											try{
											WebElement verifyIneligibilityAmountWebE=new WebDriverWait(driver,20)
											.until(ExpectedConditions.visibilityOfElementLocated(excludeamnt18_xpath));
											//Thread.sleep(100);
											String ActualAmount = verifyIneligibilityAmountWebE.getText();
											if(ActualAmount.equalsIgnoreCase(ReasonAmount))
											{
												System.out.println(ReasonAmount);
												return true;
												}
										else {
											return false;
										}
										}	
											catch (Exception ex)
											{
													
												return false;
											}
												
												
											}
										public  boolean verifyIneligibleagedpastdue_ineligiblereporbyreasontunapproveScreen(String ReasonData1){
									    	try{

									    	WebElement verifyIneligibilityReasonWebE=new WebDriverWait(driver,10)

									    	.until(ExpectedConditions.visibilityOfElementLocated(agedpastdue1_xpath));
									    	Thread.sleep(100);
									    	String ActualReason = verifyIneligibilityReasonWebE.getText().trim();
									    	if(ActualReason.equalsIgnoreCase(ReasonData1))
									    	{
									    		System.out.println(ReasonData1);
									    		return true;
									    		}
									    else {
									    	return false;
									    }
									    	}	
									    	catch (Exception ex) 
									    	{
									    			
									    		return false;
									    	}
									    		
									    		
									    	}	
										public  boolean verifyIneligibleExcluded_BBCmanagementreportunapproveScreen(String ReasonData){
									    	try{

									    	WebElement verifyIneligibilityReasonWebE=new WebDriverWait(driver,10)

									    	.until(ExpectedConditions.visibilityOfElementLocated(excludedreason_xpath));
									    	//Thread.sleep(100);
									    	String ActualReason = verifyIneligibilityReasonWebE.getText().trim();
									    	if(ActualReason.equalsIgnoreCase(ReasonData))
									    	{
									    		System.out.println(ReasonData);
									    		return true;
									    		}
									    else {
									    	return false;
									    }
									    	}	
									    	catch (Exception ex) 
									    	{
									    			
									    		return false;
									    	}
									    	}
									    	public  boolean verifyIneligibleagedpast_BBCmanagementreportunapproveScreen(String ReasonData1){
										    	try{

										    	WebElement verifyIneligibilityReasonWebE=new WebDriverWait(driver,10)

										    	.until(ExpectedConditions.visibilityOfElementLocated(agedpastdue_xpath));
										    	Thread.sleep(100);
										    	String ActualReason = verifyIneligibilityReasonWebE.getText().trim();
										    	if(ActualReason.equalsIgnoreCase(ReasonData1))
										    	{
										    		System.out.println(ReasonData1);
										    		return true;
										    		}
										    else {
										    	return false;
										    }
										    	}	
										    	catch (Exception ex) 
										    	{
										    			
										    		return false;
										    	}
										    		
										    				
									    		
}
										public  boolean verifyIneligibleExcludedamnt_BBCmanagementreport_unapprovecreen4(String ReasonAmount){
											try{

											WebElement verifyIneligibilityAmountWebE=new WebDriverWait(driver,10)
											.until(ExpectedConditions.visibilityOfElementLocated(excludeamnt4_xpath));
											//Thread.sleep(100);
											String ActualAmount = verifyIneligibilityAmountWebE.getText();
											if(ActualAmount.equalsIgnoreCase(ReasonAmount))
											{
												System.out.println(ReasonAmount);
												return true;
												}
										else {
											return false;
										}
										}	
											catch (Exception ex) 
											{
													
												return false;
											}	
											}
										

										public  boolean verifyIneligibleExcludedamnt_BBCmanagementreport_unapprovecreen3(String ReasonAmount){
											try{

											WebElement verifyIneligibilityAmountWebE=new WebDriverWait(driver,10)
											.until(ExpectedConditions.visibilityOfElementLocated(excludeamnt2_xpath));
											//Thread.sleep(100);

											String ActualAmount = verifyIneligibilityAmountWebE.getText();
											if(ActualAmount.equalsIgnoreCase(ReasonAmount))
											{
												System.out.println(ReasonAmount);
												return true;
												}
										else {
											return false;
										}
										}	
											catch (Exception ex) 
											{
													
												return false;
											}	
											}


										public  boolean verifyIneligibleagedpastdueamnt_BBCmanagementreport_unapprovecreen3(String ReasonAmount){
											try{

											WebElement verifyIneligibilityAmountWebE=new WebDriverWait(driver,10)
											.until(ExpectedConditions.visibilityOfElementLocated(agdpastdue2_xpath));
											Thread.sleep(100);

											String ActualAmount = verifyIneligibilityAmountWebE.getText();
											if(ActualAmount.equalsIgnoreCase(ReasonAmount))
											{
												System.out.println(ReasonAmount);
												return true;
												}
										else {
											return false;
										}
										}	
											catch (Exception ex) 
											{
													
												return false;
											}	
											}
							
										public  boolean verifyIneligibleexcluded_bbcmanagementreportapproveScreen(String ReasonData){
									        try{

									        WebElement verifyIneligibilityReasonWebE=new WebDriverWait(driver,10)

									        .until(ExpectedConditions.visibilityOfElementLocated(excludedreason_xpath));
									        //Thread.sleep(100);
									        String ActualReason = verifyIneligibilityReasonWebE.getText().trim();
									        if(ActualReason.equalsIgnoreCase(ReasonData))
									        {
									            System.out.println(ReasonData);
									            return true;
									            }
									    else {
									        return false;
									    }
									        }   
									        catch (Exception ex)
									        {
									               
									            return false;
									        }
									           
									           
									        }
										
										public  boolean verifyIneligibleexcludedamnt_bbcmanagementreport_approvecreen1(String ReasonAmount){
									        try{

									        WebElement verifyIneligibilityAmountWebE=new WebDriverWait(driver,10)
									        .until(ExpectedConditions.visibilityOfElementLocated(excludeamnt4_xpath));
									        //Thread.sleep(100);
									        String ActualAmount = verifyIneligibilityAmountWebE.getText();
									        if(ActualAmount.equalsIgnoreCase(ReasonAmount))
									        {
									            System.out.println(ReasonAmount);
									            return true;
									            }
									    else {
									        return false;
									    }
									    }   
									        catch (Exception ex)
									        {
									               
									            return false;
									        }
									           
									           
									        }
										
										public  boolean verifyIneligibleexcludedamnt_bbcmanagementreport_approvecreen(String ReasonAmount){
									        try{

									        WebElement verifyIneligibilityAmountWebE=new WebDriverWait(driver,10)

									        .until(ExpectedConditions.visibilityOfElementLocated(excludeamnt2_xpath));
									        //Thread.sleep(100);
									        String ActualAmount = verifyIneligibilityAmountWebE.getText();
									        if(ActualAmount.equalsIgnoreCase(ReasonAmount))
									        {
									            System.out.println(ReasonAmount);
									            return true;
									            }
									    else {
									        return false;
									    }
									    }   
									        catch (Exception ex)
									        {
									               
									            return false;
									        }
									           
									           
									        }
										
										public  boolean verifyIneligibleExcludedamnt_BBCmanagementreport_unapprovecreen5(String ReasonAmount){
									        try{

									        WebElement verifyIneligibilityAmountWebE=new WebDriverWait(driver,10)

									        .until(ExpectedConditions.visibilityOfElementLocated(excludeamnt7_xpath));
									        //Thread.sleep(100);
									        String ActualAmount = verifyIneligibilityAmountWebE.getText();
									        if(ActualAmount.equalsIgnoreCase(ReasonAmount))
									        {
									            System.out.println(ReasonAmount);
									            return true;
									            }
									    else {
									        return false;
									    }
									    }   
									        catch (Exception ex)
									        {
									               
									            return false;
									        }   
									        }
										
										public  boolean verifyIneligibleExcludedamnt_BBCmanagementreport_unapprovecreen6(String ReasonAmount){
									        try{

									        WebElement verifyIneligibilityAmountWebE=new WebDriverWait(driver,10)

									        .until(ExpectedConditions.visibilityOfElementLocated(excludeamnt8_xpath));
									        //Thread.sleep(100);
									        String ActualAmount = verifyIneligibilityAmountWebE.getText();
									        if(ActualAmount.equalsIgnoreCase(ReasonAmount))
									        {
									            System.out.println(ReasonAmount);
									            return true;
									            }
									    else {
									        return false;
									    }
									    }   
									        catch (Exception ex)
									        {
									               
									            return false;
									        }   
									        }
										
										public  boolean verifyIneligibilitamnt_bbcmanagementreportunapproveScreen(String ReasonData){
									        try{

									        WebElement verifyIneligibilityReasonWebE=new WebDriverWait(driver,10)

									        .until(ExpectedConditions.visibilityOfElementLocated(value4_xpath));
									        //Thread.sleep(100);
									        String ActualReason = verifyIneligibilityReasonWebE.getText().trim();
									        if(ActualReason.equalsIgnoreCase(ReasonData))
									        {
									            System.out.println(ReasonData);
									            return true;
									            }
									    else {
									        return false;
									    }
									        }   
									        catch (Exception ex)
									        {
									               
									            return false;
									        }
									           
									           
									        }
										
										public  boolean verifyIneligibilityamnt_ineligiblereport_approvecreen1(String ReasonAmount){
									        try{

									        WebElement verifyIneligibilityAmountWebE=new WebDriverWait(driver,10)

									        .until(ExpectedConditions.visibilityOfElementLocated(inelig_amnt_xpath));
									        //Thread.sleep(100);
									        String ActualAmount = verifyIneligibilityAmountWebE.getText();
									        if(ActualAmount.equalsIgnoreCase(ReasonAmount))
									        {
									            System.out.println(ReasonAmount);
									            return true;
									            }
									    else {
									        return false;
									    }
									    }   
									        catch (Exception ex)
									        {
									               
									            return false;
									        }
									           
									           
									        }

						        public boolean  verifyConcentrationPercentage_TotalReceivabels_Cap_BBC(String  ConcentrationPercentage){
						    		try {
						    			

						    			WebElement AmountWebElement = new WebDriverWait(driver, 10).

						    					until(ExpectedConditions.visibilityOfElementLocated(ConcentrationPercentageTotalReceivablesBBCCap_xpath));
						    			JavascriptExecutor jse1 = (JavascriptExecutor)driver;;
						    			jse1.executeScript("arguments[0].scrollIntoView(true);", AmountWebElement);
						    			String actual = AmountWebElement.getText();
						    			if (actual.equals(ConcentrationPercentage))
						    				return true;
						    			else
						    				return false;

						    		} catch (Exception e) {
						    			return false;
						    		}
						    		
						    		}
						        
				

						  public boolean verifyHeader()
							{
								try{

		WebElement ReportWebEelement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(Header_xpath));

									ReportWebEelement.isDisplayed();
									////Thread.sleep(2000);
									
							return true;
								}
							catch (Exception ex) {
							}
							return false;

							}	
						  
						  public boolean verifyReportAllValuesSummaryYesMulDiv(String expected,String asOfDate,String clientname,String accNo,String accName,String future,String current,String over30,String over60,String over90,String over120,String total)
							{
							try{
							WebElement WebEelement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(htmlButton_xpath));
							WebEelement.click();
							//Thread.sleep(5000);
							Set <String> handles =driver.getWindowHandles();
							Iterator<String> it = handles.iterator();
							//iterate through your windows
							while (it.hasNext()){
							String parent = it.next();
							String newwin = it.next();
							driver.switchTo().window(newwin);
							//
							
							WebElement reportHeader=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(headerReport_xpath));
							reportHeader.isDisplayed();
							System.out.println("Report header");
							
							driver.findElement(By.xpath("//h2[text()='Receivables Aged Trial Balance for  as of: 01/01/2018']")).isDisplayed();	
							System.out.println("As Of date");
							
							driver.findElement(By.xpath("//h2[text()='"+clientname.toUpperCase()+"']")).isDisplayed();	
							System.out.println("Client name");
							
							
							WebElement accNoWebElement=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(accountNo_xpath));
							accNoWebElement.getText().equalsIgnoreCase(accNo);
							System.out.println("Account number");
							
							WebElement accNameWebElement=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(accname_xpath));
							accNameWebElement.getText().equalsIgnoreCase(accName);
							System.out.println("Account name");
							
							WebElement futureWebElement=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(futureAr_xpath));
							futureWebElement.getText().equalsIgnoreCase(future);
							System.out.println("Future");
							
							WebElement currentWebElement=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(currentAr_xapth));
							currentWebElement.getText().equalsIgnoreCase(current);
							System.out.println("Current");
							
							WebElement over30WebElement=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(over30Ar_xpath));
							over30WebElement.getText().equalsIgnoreCase(over30);
							System.out.println("over30");
							
							WebElement over60Webelement=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(over60Ar_xpath));
							over60Webelement.getText().equalsIgnoreCase(over60);
							System.out.println("over60");
							
							WebElement over90Webelement=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(over90Ar_xpath));
							over90Webelement.getText().equalsIgnoreCase(over90);
							System.out.println("over90");
							
							WebElement over120Webelement=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(over120Ar_xpath));
							over120Webelement.getText().equalsIgnoreCase(over120);
							System.out.println("over120");
							
							/*WebElement totalWebelement=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(totalAr_xpath));
							totalWebelement.getText().equalsIgnoreCase(total);
							System.out.println("Total");
							*/
							driver.close();
							driver.switchTo().window(parent);
							
						
							}
							return true;}
							catch(Exception ex){
							return false;
							}}
						  
						  
						  
	public boolean verifyReportAllValuesSummaryYesMulDiv1(String expected,
			String asOfDate, String clientname, String accNo, String accName,
			String future, String current, String over30, String over60,
			String over90, String over120, String total) {
		try {
		
				WebElement reportHeader = new WebDriverWait(driver, 100)
						.until(ExpectedConditions
								.visibilityOfElementLocated(headerReport_xpath));
				reportHeader.isDisplayed();
				System.out.println("Report header");

				driver.findElement(
						By.xpath("//h2[text()='Receivables Aged Trial Balance for  as of: 01/01/2018']"))
						.isDisplayed();
				System.out.println("As Of date");

				driver.findElement(By.xpath("//h2[text()='"+clientname.toUpperCase()+"']"))
						.isDisplayed();
				System.out.println("Client name");

				WebElement accNoWebElement = new WebDriverWait(driver, 100)
						.until(ExpectedConditions
								.visibilityOfElementLocated(accountNo_xpath));
				accNoWebElement.getText().equalsIgnoreCase(accNo);
				System.out.println("Account number");

				WebElement accNameWebElement = new WebDriverWait(driver, 100)
						.until(ExpectedConditions
								.visibilityOfElementLocated(accname_xpath));
				accNameWebElement.getText().equalsIgnoreCase(accName);
				System.out.println("Account name");

				WebElement futureWebElement = new WebDriverWait(driver, 100)
						.until(ExpectedConditions
								.visibilityOfElementLocated(futureAr_xpath));
				futureWebElement.getText().equalsIgnoreCase(future);
				System.out.println("Future");

				WebElement currentWebElement = new WebDriverWait(driver, 100)
						.until(ExpectedConditions
								.visibilityOfElementLocated(currentAr_xapth));
				currentWebElement.getText().equalsIgnoreCase(current);
				System.out.println("Current");

				WebElement over30WebElement = new WebDriverWait(driver, 100)
						.until(ExpectedConditions
								.visibilityOfElementLocated(over30Ar_xpath));
				over30WebElement.getText().equalsIgnoreCase(over30);
				System.out.println("over30");

				WebElement over60Webelement = new WebDriverWait(driver, 100)
						.until(ExpectedConditions
								.visibilityOfElementLocated(over60Ar_xpath));
				over60Webelement.getText().equalsIgnoreCase(over60);
				System.out.println("over60");

				WebElement over90Webelement = new WebDriverWait(driver, 100)
						.until(ExpectedConditions
								.visibilityOfElementLocated(over90Ar_xpath));
				over90Webelement.getText().equalsIgnoreCase(over90);
				System.out.println("over90");

				WebElement over120Webelement = new WebDriverWait(driver, 100)
						.until(ExpectedConditions
								.visibilityOfElementLocated(over120Ar_xpath));
				over120Webelement.getText().equalsIgnoreCase(over120);
				System.out.println("over120");

			return true;
		} catch (Exception ex) {
			return false;
		}
	}
						  
						  public boolean verifyReportAllValuesInPayablesAgedTrialBalanceSummaryYesForMulDiv(String expected,String asOfDate,String clientname,String accNo,String accName,String future,String current,String over30,String over60,String over90,String over120,String total)
							{
							try{
							WebElement WebEelement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(htmlButton_xpath));
							WebEelement.click();
							//Thread.sleep(5000);
							Set <String> handles =driver.getWindowHandles();
							Iterator<String> it = handles.iterator();
							//iterate through your windows
							while (it.hasNext()){
							String parent = it.next();
							String newwin = it.next();
							driver.switchTo().window(newwin);
							
							
							WebElement reportHeader=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(headerReport_xpath));
							reportHeader.isDisplayed();
							System.out.println("Report header");
							
							driver.findElement(By.xpath("//h2[text()='Payables Aged Trial Balance as of: 01/01/2018']")).isDisplayed();	
							System.out.println("As Of date");
							
							driver.findElement(By.xpath("//h2[text()='"+clientname.toUpperCase()+"']")).isDisplayed();	
							System.out.println("Client name");
							
							
							WebElement accNoWebElement=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(accountNo_xpath));
							accNoWebElement.getText().equalsIgnoreCase(accNo);
							System.out.println("Account number");
							
							WebElement accNameWebElement=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(accname_xpath));
							accNameWebElement.getText().equalsIgnoreCase(accName);
							System.out.println("Account name");
							
							WebElement futureWebElement=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(future_xpath));
							futureWebElement.getText().equalsIgnoreCase(future);
							System.out.println("Future");
							
							WebElement currentWebElement=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(current_xapth));
							currentWebElement.getText().equalsIgnoreCase(current);
							System.out.println("Current");
							
							WebElement over30WebElement=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(over30_xpath));
							over30WebElement.getText().equalsIgnoreCase(over30);
							System.out.println("over30");
							
							WebElement over60Webelement=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(over60_xpath));
							over60Webelement.getText().equalsIgnoreCase(over60);
							System.out.println("over60");
							
							WebElement over90Webelement=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(over90_xpath));
							over90Webelement.getText().equalsIgnoreCase(over90);
							System.out.println("over90");
							
							WebElement over120Webelement=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(over120_xpath));
							over120Webelement.getText().equalsIgnoreCase(over120);
							System.out.println("over120");
							
							
							/*WebElement totalWebelement=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(total_xpath));
							totalWebelement.getText().equalsIgnoreCase(total);
							System.out.println("Total");*/
							
							/*WebElement totalWebelement=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(totalAr_xpath));
							totalWebelement.getText().equalsIgnoreCase(total);
							System.out.println("Total");*/
							
						//
							/*WebElement actual=new WebDriverWait(driver,200).until(ExpectedConditions.visibilityOfElementLocated(reportsHeader));
							actual.getText().trim();
							if (actual.equals(expected))
							return true;
							else
							return false;*/
							driver.close();
							driver.switchTo().window(parent);

							//driver.switchTo().defaultContent();
							
							}
							return true;}
							catch(Exception ex){
							return false;
							}
							}

	// rohit
	public boolean verifyReportAllValuesInPayablesAgedTrialBalanceSummaryYesForMulDiv1(
			String expected, String asOfDate, String clientname, String accNo,
			String accName, String future, String current, String over30,
			String over60, String over90, String over120, String total) {
		try {
				WebElement reportHeader = new WebDriverWait(driver, 100)
						.until(ExpectedConditions
								.visibilityOfElementLocated(headerReport_xpath));
				reportHeader.isDisplayed();
				System.out.println("Report header");

				driver.findElement(
						By.xpath("//h2[text()='Payables Aged Trial Balance as of: 01/01/2018']"))
						.isDisplayed();
				System.out.println("As Of date");

				driver.findElement(By.xpath("//h2[text()='"+clientname.toUpperCase()+"']"))
						.isDisplayed();
				System.out.println("Client name");

				WebElement accNoWebElement = new WebDriverWait(driver, 100)
						.until(ExpectedConditions
								.visibilityOfElementLocated(accountNo_xpath));
				accNoWebElement.getText().equalsIgnoreCase(accNo);
				System.out.println("Account number");

				WebElement accNameWebElement = new WebDriverWait(driver, 100)
						.until(ExpectedConditions
								.visibilityOfElementLocated(accname_xpath));
				accNameWebElement.getText().equalsIgnoreCase(accName);
				System.out.println("Account name");

				WebElement futureWebElement = new WebDriverWait(driver, 100)
						.until(ExpectedConditions
								.visibilityOfElementLocated(future_xpath));
				futureWebElement.getText().equalsIgnoreCase(future);
				System.out.println("Future");

				WebElement currentWebElement = new WebDriverWait(driver, 100)
						.until(ExpectedConditions
								.visibilityOfElementLocated(current_xapth));
				currentWebElement.getText().equalsIgnoreCase(current);
				System.out.println("Current");

				WebElement over30WebElement = new WebDriverWait(driver, 100)
						.until(ExpectedConditions
								.visibilityOfElementLocated(over30_xpath));
				over30WebElement.getText().equalsIgnoreCase(over30);
				System.out.println("over30");

				WebElement over60Webelement = new WebDriverWait(driver, 100)
						.until(ExpectedConditions
								.visibilityOfElementLocated(over60_xpath));
				over60Webelement.getText().equalsIgnoreCase(over60);
				System.out.println("over60");

				WebElement over90Webelement = new WebDriverWait(driver, 100)
						.until(ExpectedConditions
								.visibilityOfElementLocated(over90_xpath));
				over90Webelement.getText().equalsIgnoreCase(over90);
				System.out.println("over90");

				WebElement over120Webelement = new WebDriverWait(driver, 100)
						.until(ExpectedConditions
								.visibilityOfElementLocated(over120_xpath));
				over120Webelement.getText().equalsIgnoreCase(over120);
				System.out.println("over120");

                return true;
		} catch (Exception ex) {
			return false;
		}
	}
						  
	// rohit
	public boolean verifyArApConcReportAllValuesSummaryYesForMulDiv1(
			String expected, String asOfDate, String clientname,
			String accName, String perOfTotalAr, String total, String current,
			String over30, String over60, String over90, String over120) {
		try {
			
				WebElement reportHeader = new WebDriverWait(driver, 100)
						.until(ExpectedConditions
								.visibilityOfElementLocated(headerReport_xpath));
				reportHeader.isDisplayed();
				System.out.println("Report header");

				driver.findElement(
						By.xpath("//h2[text()='Debtors Concentrations as of:01/01/2018']"))
						.isDisplayed();
				System.out.println("As Of date");

				driver.findElement(By.xpath("//h2[text()='"+clientname.toUpperCase()+"']"))
						.isDisplayed();
				System.out.println("Client name");

				WebElement accNameWebElement = new WebDriverWait(driver, 100)
						.until(ExpectedConditions
								.visibilityOfElementLocated(accountNameArAp_xpath));
				accNameWebElement.getText().equalsIgnoreCase(accName);
				System.out.println("Account name");

				WebElement perOfTotalArWebelement = new WebDriverWait(driver,
						100).until(ExpectedConditions
						.visibilityOfElementLocated(PercOfTotalARArAp_xpath));
				perOfTotalArWebelement.getText().trim()
						.equalsIgnoreCase(perOfTotalAr);
				System.out.println("% of total AR");

				WebElement totalWebelement = new WebDriverWait(driver, 100)
						.until(ExpectedConditions
								.visibilityOfElementLocated(totalarAp_xpath));
				totalWebelement.getText().trim().equalsIgnoreCase(total);
				System.out.println("Total");

				WebElement currentWebElement = new WebDriverWait(driver, 100)
						.until(ExpectedConditions
								.visibilityOfElementLocated(currentArApp_xapth));
				currentWebElement.getText().trim().equalsIgnoreCase(current);
				System.out.println("Current");

				WebElement over30WebElement = new WebDriverWait(driver, 100)
						.until(ExpectedConditions
								.visibilityOfElementLocated(over30ArApp_xpath));
				over30WebElement.getText().equalsIgnoreCase(over30);
				System.out.println("over30");

				WebElement over60Webelement = new WebDriverWait(driver, 100)
						.until(ExpectedConditions
								.visibilityOfElementLocated(over60ArApp_xpath));
				over60Webelement.getText().equalsIgnoreCase(over60);
				System.out.println("over60");

				WebElement over90Webelement = new WebDriverWait(driver, 100)
						.until(ExpectedConditions
								.visibilityOfElementLocated(over90ArApp_xpath));
				over90Webelement.getText().equalsIgnoreCase(over90);
				System.out.println("over90");

				WebElement over120Webelement = new WebDriverWait(driver, 100)
						.until(ExpectedConditions
								.visibilityOfElementLocated(Over120ForMulDiv_xpath));
				over120Webelement.getText().equalsIgnoreCase(over120);
				System.out.println("over120");

			return true;
		} catch (Exception ex) {
			return false;
		}
	}
						  
						  public boolean verifyArApConcReportAllValuesSummaryYesForMulDiv(String expected,String asOfDate,String clientname,String accName,String perOfTotalAr,String total,String current,String over30,String over60,String over90,String over120)
							{
								try{
									WebElement WebEelement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(htmlButton_xpath));
									WebEelement.click();
									//Thread.sleep(5000);
									Set <String> handles =driver.getWindowHandles();
									Iterator<String> it = handles.iterator();
									//iterate through your windows
									while (it.hasNext()){
									String parent = it.next();
									String newwin = it.next();
									driver.switchTo().window(newwin);
									//
									
									WebElement reportHeader=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(headerReport_xpath));
									reportHeader.isDisplayed();
									System.out.println("Report header");
									
									driver.findElement(By.xpath("//h2[text()='Debtors Concentrations as of:01/01/2018']")).isDisplayed();	
									System.out.println("As Of date");
									
									driver.findElement(By.xpath("//h2[text()='"+clientname.toUpperCase()+"']")).isDisplayed();	
									System.out.println("Client name");
							
							WebElement accNameWebElement=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(accountNameArAp_xpath));
							accNameWebElement.getText().equalsIgnoreCase(accName);
							System.out.println("Account name");
							
							WebElement perOfTotalArWebelement=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(PercOfTotalARArAp_xpath));
							perOfTotalArWebelement.getText().trim().equalsIgnoreCase(perOfTotalAr);
							System.out.println("% of total AR");
							
							WebElement totalWebelement=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(totalarAp_xpath));
							totalWebelement.getText().trim().equalsIgnoreCase(total);
							System.out.println("Total");
							
							WebElement currentWebElement=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(currentArApp_xapth));
							currentWebElement.getText().trim().equalsIgnoreCase(current);
							System.out.println("Current");
							
							WebElement over30WebElement=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(over30ArApp_xpath));
							over30WebElement.getText().equalsIgnoreCase(over30);
							System.out.println("over30");
							
							WebElement over60Webelement=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(over60ArApp_xpath));
							over60Webelement.getText().equalsIgnoreCase(over60);
							System.out.println("over60");
							
							WebElement over90Webelement=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(over90ArApp_xpath));
							over90Webelement.getText().equalsIgnoreCase(over90);
							System.out.println("over90");
							
							WebElement over120Webelement=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(Over120ForMulDiv_xpath));
							over120Webelement.getText().equalsIgnoreCase(over120);
							System.out.println("over120");
							
							driver.close();
							driver.switchTo().window(parent);
							//driver.switchTo().defaultContent();
							
							}
							return true;}
							catch(Exception ex){
							return false;
							}}
						  
						  public boolean verifyReportAllValuesInAssetsInventoryForSummaryMulDIv(String expected,String asOfDate,String clientname,String location,String actualValue,String ineligibleAmount,String assetAmount)
							{
							try{
							WebElement WebEelement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(htmlButton_xpath));
							WebEelement.click();


							Thread.sleep(5000);


							Set <String> handles =driver.getWindowHandles();
							Iterator<String> it = handles.iterator();
							//iterate through your windows
							while (it.hasNext()){
							String parent = it.next();
							String newwin = it.next();
							driver.switchTo().window(newwin);
							//
							
							WebElement reportHeader=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(headerReport_xpath));
							reportHeader.isDisplayed();
							System.out.println("Report header");
							
							driver.findElement(By.xpath("//h2[text()='Assets/Inventory Report as of BBC dated: 01/01/2018']")).isDisplayed();	
							System.out.println("As Of date");
							
							driver.findElement(By.xpath("//h2[text()='"+clientname.toUpperCase()+"']")).isDisplayed();	
							System.out.println("Client name");
							
							WebElement locationWebelement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(location_xpath));
							locationWebelement.getText().equalsIgnoreCase(location);
							System.out.println("Location");
							
							WebElement actualValueWebElement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(actualValue_xpath));
							actualValueWebElement.getText().equalsIgnoreCase(actualValue);
							System.out.println("Actual value");
							
							WebElement ineligibleAmountWebElement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(ineligibleAmount_xpath));
							ineligibleAmountWebElement.getText().equalsIgnoreCase(ineligibleAmount);
							System.out.println("Ineligible amount");
							
							WebElement assetAmountWebelement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(assetAmount_xapth));
							assetAmountWebelement.getText().equalsIgnoreCase(assetAmount);
							System.out.println("Asset amount");
							
							driver.close();
							driver.switchTo().window(parent);
							//driver.switchTo().defaultContent();
							
							}
							return true;}
							catch(Exception ex){
							return false;
							}}		
				
	// rohit
	public boolean verifyReportAllValuesInAssetsInventoryForSummaryMulDIv1(
			String expected, String asOfDate, String clientname,
			String location, String actualValue, String ineligibleAmount,
			String assetAmount) {
		try {
			
				WebElement reportHeader = new WebDriverWait(driver, 10)
						.until(ExpectedConditions
								.visibilityOfElementLocated(headerReport_xpath));
				reportHeader.isDisplayed();
				System.out.println("Report header");

				driver.findElement(
						By.xpath("//h2[text()='Assets/Inventory Report as of BBC dated: 01/01/2018']"))
						.isDisplayed();
				System.out.println("As Of date");

				driver.findElement(By.xpath("//h2[text()='"+clientname.toUpperCase()+"']"))
						.isDisplayed();
				System.out.println("Client name");

				WebElement locationWebelement = new WebDriverWait(driver, 10)
						.until(ExpectedConditions
								.visibilityOfElementLocated(location_xpath));
				locationWebelement.getText().equalsIgnoreCase(location);
				System.out.println("Location");

				WebElement actualValueWebElement = new WebDriverWait(driver, 10)
						.until(ExpectedConditions
								.visibilityOfElementLocated(actualValue_xpath));
				actualValueWebElement.getText().equalsIgnoreCase(actualValue);
				System.out.println("Actual value");

				WebElement ineligibleAmountWebElement = new WebDriverWait(
						driver, 10).until(ExpectedConditions
						.visibilityOfElementLocated(ineligibleAmount_xpath));
				ineligibleAmountWebElement.getText().equalsIgnoreCase(
						ineligibleAmount);
				System.out.println("Ineligible amount");

				WebElement assetAmountWebelement = new WebDriverWait(driver, 10)
						.until(ExpectedConditions
								.visibilityOfElementLocated(assetAmount_xapth));
				assetAmountWebelement.getText().equalsIgnoreCase(assetAmount);
				System.out.println("Asset amount");

			return true;
		} catch (Exception ex) {
			return false;
		}
	}

	// rohit
	public boolean verifyBbcReportNewTabForSummaryYesMulDiv1(String clientname,
			String MaximumLineAmount) {
		try {
				WebElement reportHeader = new WebDriverWait(driver, 10)
						.until(ExpectedConditions
								.visibilityOfElementLocated(headerReport_xpath));

				reportHeader.isDisplayed();
				System.out.println("Cync Report header");

				/*driver.findElement(
						By.xpath("//h2[text()='Maximum Line Amount: 800,000.00']"))
						.isDisplayed();
				System.out.println("Maximum line amount");*/

				driver.findElement(By.xpath("//h2[text()='"+clientname.toUpperCase()+"']"))
						.isDisplayed();
				System.out.println("Client name");

			return true;
		} catch (Exception ex) {
			return false;
		}
	}
	
				public boolean verifyBbcReportNewTabForSummaryYesMulDiv(String clientname,String MaximumLineAmount)
				{
					try{
						WebElement WebEelement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(htmlButton_xpath));
						WebEelement.click();

						Thread.sleep(5000);

						Set <String> handles =driver.getWindowHandles();
						Iterator<String> it = handles.iterator();
						//iterate through your windows
						while (it.hasNext()){
						String parent = it.next();
						String newwin = it.next();
						driver.switchTo().window(newwin);
		
						

						WebElement reportHeader=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(headerReport_xpath));

						reportHeader.isDisplayed();
						System.out.println("Cync Report header");

						
						driver.findElement(By.xpath("//h2[text()='Maximum Line Amount: 800,000.00']")).isDisplayed();				
						System.out.println("Maximum line amount");
						
						driver.findElement(By.xpath("//h2[text()='"+clientname.toUpperCase()+"']")).isDisplayed();	
						System.out.println("Client name");
						
						driver.close();
						driver.switchTo().window(parent);
						
						}
						return true;}
						catch(Exception ex){
						return false;
						}}

				public boolean verifyBbcTrendReportNewTabForSummaryYesMulDIv(String expected,String clientname,String startdate,String toDate)
				{
					try{
						WebElement WebEelement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(htmlButton_xpath));
						WebEelement.click();
						//Thread.sleep(5000);
						Set <String> handles =driver.getWindowHandles();
						Iterator<String> it = handles.iterator();
						//iterate through your windows
						while (it.hasNext()){
						String parent = it.next();
						String newwin = it.next();
						driver.switchTo().window(newwin);


						
						WebElement reportHeader=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(headerReport_xpath));

						reportHeader.isDisplayed();
						System.out.println("Cync Report header");


						
						driver.findElement(By.xpath("//h2[contains(text(),'BBC Trend Report from " +startdate+" to " +toDate+ "')]")).isDisplayed();				
						System.out.println("Report header");
						
						driver.findElement(By.xpath("//h2[text()='"+clientname.toUpperCase()+"']")).isDisplayed();	
						System.out.println("Client name");
						
						}
						return true;}
						catch(Exception ex){
						return false;
						}}
				 public boolean  verifyEndingBalanceTotalARForSummaryMulDiv(String  EndingBalanceTotalAR){
				    	try {

				    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(endingBalanceTotalARValueForSummaryMulDiv_xpath));
				    		String actual = AmountWebElement.getText().trim();
				    		if (actual.equals(EndingBalanceTotalAR))
				    			return true;
				    		else
				    			return false;

				    	} catch (Exception e) {
				    		return false;
				    	}
				    	
				    }	
				 
				 public boolean  verifyTotalAgedReceivablesForSummaryMulDiv(String  totalAgedReceivables){
				    	try {

				    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(totalAgedReceivablesValueForSummaryMulDiv_xpath));

				    		String actual = AmountWebElement.getText().trim();
				    		if (actual.equals(totalAgedReceivables))
				    			return true;
				    		else
				    			return false;

				    	} catch (Exception e) {
				    		return false;
				    	}
				    	
				    }	
				 public boolean  verifyNetInventoryAvailableForAdvanceBbcForSummaryMulDiv(String  netInventoryAvailableForAdvance){
				    	try {

				    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(netInventoryAvailableForAdvanceBbcValueForSummaryMulDiv_xpath));

				    		String actual = AmountWebElement.getText().trim();
				    		if (actual.equals(netInventoryAvailableForAdvance))
				    			return true;
				    		else
				    			return false;

				    	} catch (Exception e) {
				    		return false;
				    	}
				    	
				    }	
				 public boolean  verifyTotalAvailableARInventoryBbcForSummaryMulDiv(String  totalAvailableARInventory){
				    	try {

				    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(totalAvailableARInventoryBbcValueForSummaryMulDiv_xpath));

				    		String actual = AmountWebElement.getText().trim();
				    		if (actual.equals(totalAvailableARInventory))
				    			return true;
				    		else
				    			return false;

				    	} catch (Exception e) {
				    		return false;
				    	}
				    	
				    }	
				 public boolean  verifyNetOtherAvailableForAdvanceBbcUFirSummaryMulDiv(String  netOtherAvailableForAdvance){
				    	try {

				    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(netOtherAvailableForAdvanceBbcValueeForSummaryMulDiv_xpath));

				    		String actual = AmountWebElement.getText().trim();
				    		if (actual.equals(netOtherAvailableForAdvance))
				    			return true;
				    		else
				    			return false;

				    	} catch (Exception e) {
				    		return false;
				    	}
				    	
				    }	
				 public boolean  verifyTotalAvailableForAdvanceBbcUForSummaryMulDiv(String  totalAvailableForAdvance){
				    	try {

				    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(totalAvailableForAdvanceBbcValueeForSummaryMulDiv_xpath));

				    		String actual = AmountWebElement.getText().trim();
				    		if (actual.equals(totalAvailableForAdvance))
				    			return true;
				    		else
				    			return false;

				    	} catch (Exception e) {
				    		return false;
				    	}
				    	
				    }
				 public boolean  verifyLineLimitWithReservesBbcUForSummaryMulDiv(String  lineLimitWithReserves){
				    	try {

				    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(lineLimitWithReservesValueeForSummaryMulDiv_xpath));
				    		String actual = AmountWebElement.getText().trim();
				    		if (actual.equals(lineLimitWithReserves))
				    			return true;
				    		else
				    			return false;

				    	} catch (Exception e) {
				    		return false;
				    	}
				    	
				    }	
				 public boolean  verifyBorrowingBaseAvailabilityBbcForSummaryMulDiv(String  borrowingBaseAvailability){
				    	try {

				    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(borrowingBaseAvailabilityValueForSummaryMul_xpath));
				    		String actual = AmountWebElement.getText().trim();
				    		if (actual.equals(borrowingBaseAvailability))
				    			return true;
				    		else
				    			return false;

				    	} catch (Exception e) {
				    		return false;
				    	}
				    	
				    }	
				 public boolean verifyBbcReportNewTabSummary(String clientname,String MaximumLineAmount)
					{
						try{
							WebElement WebEelement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(htmlButton_xpath));
							WebEelement.click();
							//Thread.sleep(5000);
							Set <String> handles =driver.getWindowHandles();
							Iterator<String> it = handles.iterator();
							//iterate through your windows
							while (it.hasNext()){
							String parent = it.next();
							String newwin = it.next();
							driver.switchTo().window(newwin);

							WebElement reportHeader=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(headerReport_xpath));

							reportHeader.isDisplayed();
							System.out.println("Cync Report header");

							
							driver.findElement(By.xpath("//h2[text()='Maximum Line Amount: "+MaximumLineAmount +"']")).isDisplayed();				
							System.out.println("Maximum line amount");
							
							driver.findElement(By.xpath("//h2[text()='"+clientname.toUpperCase()+"']")).isDisplayed();	
							System.out.println("Client name");
							
							}
							return true;}
							catch(Exception ex){
							return false;
							}}

	// rohit
	public boolean verifyBbcReportNewTabSummary1(String clientname,
			String MaximumLineAmount) {
		try {
				WebElement reportHeader = new WebDriverWait(driver, 10)
						.until(ExpectedConditions
								.visibilityOfElementLocated(headerReport_xpath));

				reportHeader.isDisplayed();
				System.out.println("Cync Report header");

				driver.findElement(
						By.xpath("//h2[text()='Maximum Line Amount: "
								+ MaximumLineAmount + "']")).isDisplayed();
				System.out.println("Maximum line amount");

				driver.findElement(By.xpath("//h2[text()='"+clientname.toUpperCase()+"']"))
						.isDisplayed();
				System.out.println("Client name");

			return true;
		} catch (Exception ex) {
			return false;
		}
	}
				 public boolean verifyArLoanReportForMulDivSummary(String arStartDate,String arEndDate,String clientname,String dateArLoan,String salesArLoan,String creditsArLoan,String unreconciled,String collections,String adjustments,String arBalance,String BalanceAr)
					{
					 try{
							WebElement WebEelement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(htmlButton_xpath));
							WebEelement.click();
							//Thread.sleep(5000);
							Set <String> handles =driver.getWindowHandles();
							Iterator<String> it = handles.iterator();
							//iterate through your windows
							while (it.hasNext()){
								String parent = it.next();
								String newwin = it.next();
								driver.switchTo().window(newwin);
					//
					
					WebElement reportHeader=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(headerReport_xpath));
					reportHeader.isDisplayed();
					System.out.println("Report header");
					
					driver.findElement(By.xpath("//h2[text()='AR Loan Activity Report from 01/01/2018 to 01/01/2018']")).isDisplayed();	
					System.out.println("AR loan activity report");
					
					driver.findElement(By.xpath("//h2[text()='"+clientname.toUpperCase()+"']")).isDisplayed();	
					System.out.println("Client name");		
					
					WebElement dateArLoanWebElement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(dateArLoan_xpath));
					dateArLoanWebElement.getText().equalsIgnoreCase(dateArLoan);
					System.out.println("dateArLoan");
					
					WebElement salesArLoanWebElement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(salesArLoan_xpath));
					salesArLoanWebElement.getText().equalsIgnoreCase(salesArLoan);
					System.out.println("salesArLoan");
					
					WebElement creditsArLoanWebElement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(creditsArLoan_xpath));
					creditsArLoanWebElement.getText().trim().equalsIgnoreCase(creditsArLoan);
					System.out.println("creditsArLoan");
					
					WebElement unreconciledWebElement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(unreconciled_xpath));
					unreconciledWebElement.getText().trim().equalsIgnoreCase(unreconciled);
					System.out.println("unreconciled");
					
					WebElement collectionsWebElement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(collections_xpath));
					collectionsWebElement.getText().equalsIgnoreCase(collections);
					System.out.println("collections");
					
					WebElement adjustmentsWebelement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(adjustments_xpath));
					adjustmentsWebelement.getText().equalsIgnoreCase(adjustments);
					System.out.println("adjustments");
					
					WebElement arBalanceWebelement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(arBalance_xpath));
					arBalanceWebelement.getText().equalsIgnoreCase(arBalance);
					System.out.println("arBalance");
					
					WebElement BalanceArWebelement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(BalanceAr_xpath));
					BalanceArWebelement.getText().equalsIgnoreCase(BalanceAr);
					System.out.println("BalanceAr");

					
					driver.switchTo().window(parent);
					
					}
					return true;}
					catch(Exception ex){
					return false;
					}}

	// rohit
	public boolean verifyArLoanReportForMulDivSummary1(String arStartDate,
			String arEndDate, String clientname, String dateArLoan,
			String salesArLoan, String creditsArLoan, String unreconciled,
			String collections, String adjustments, String arBalance,
			String BalanceAr) {
		try {
				WebElement reportHeader = new WebDriverWait(driver, 10)
						.until(ExpectedConditions
								.visibilityOfElementLocated(headerReport_xpath));
				reportHeader.isDisplayed();
				System.out.println("Report header");

				driver.findElement(
						By.xpath("//h2[text()='AR Loan Activity Report from 01/01/2018 to 01/01/2018']"))
						.isDisplayed();
				System.out.println("AR loan activity report");

				driver.findElement(
						By.xpath("//h2[text()='" + clientname.toUpperCase()
								+ "']")).isDisplayed();
				System.out.println("Client name");

				WebElement dateArLoanWebElement = new WebDriverWait(driver, 10)
						.until(ExpectedConditions
								.visibilityOfElementLocated(dateArLoan_xpath));
				dateArLoanWebElement.getText().equalsIgnoreCase(dateArLoan);
				System.out.println("dateArLoan");

				WebElement salesArLoanWebElement = new WebDriverWait(driver, 10)
						.until(ExpectedConditions
								.visibilityOfElementLocated(salesArLoan_xpath));
				salesArLoanWebElement.getText().equalsIgnoreCase(salesArLoan);
				System.out.println("salesArLoan");

				WebElement creditsArLoanWebElement = new WebDriverWait(driver,
						10).until(ExpectedConditions
						.visibilityOfElementLocated(creditsArLoan_xpath));
				creditsArLoanWebElement.getText().trim()
						.equalsIgnoreCase(creditsArLoan);
				System.out.println("creditsArLoan");

				WebElement unreconciledWebElement = new WebDriverWait(driver,
						10).until(ExpectedConditions
						.visibilityOfElementLocated(unreconciled_xpath));
				unreconciledWebElement.getText().trim()
						.equalsIgnoreCase(unreconciled);
				System.out.println("unreconciled");

				WebElement collectionsWebElement = new WebDriverWait(driver, 10)
						.until(ExpectedConditions
								.visibilityOfElementLocated(collections_xpath));
				collectionsWebElement.getText().equalsIgnoreCase(collections);
				System.out.println("collections");

				WebElement adjustmentsWebelement = new WebDriverWait(driver, 10)
						.until(ExpectedConditions
								.visibilityOfElementLocated(adjustments_xpath));
				adjustmentsWebelement.getText().equalsIgnoreCase(adjustments);
				System.out.println("adjustments");

				WebElement arBalanceWebelement = new WebDriverWait(driver, 10)
						.until(ExpectedConditions
								.visibilityOfElementLocated(arBalance_xpath));
				arBalanceWebelement.getText().equalsIgnoreCase(arBalance);
				System.out.println("arBalance");

				WebElement BalanceArWebelement = new WebDriverWait(driver, 10)
						.until(ExpectedConditions
								.visibilityOfElementLocated(BalanceAr_xpath));
				BalanceArWebelement.getText().equalsIgnoreCase(BalanceAr);
				System.out.println("BalanceAr");

			return true;
		} catch (Exception ex) {
			return false;
		}
	}

				 
				 

				 //cyncs_4462
				    public boolean verifyAgedPastDueDaysAmount_cyncs4462(String expected) {
				    	try {
				    		WebElement AgedPastDueDayaWebElement = new WebDriverWait(driver, 100)
				    				.until(ExpectedConditions
				    						.visibilityOfElementLocated(agedpastdue_xpath));
				    		WebElement AgedPastDueDayaAmountWebElement = new WebDriverWait(driver, 10)
				    				.until(ExpectedConditions.visibilityOfElementLocated(agedpastdue_xpath));
				    		AgedPastDueDayaWebElement.isDisplayed();
				    		String actual = AgedPastDueDayaAmountWebElement.getText();
				    		if (actual.equals(expected))
				    			return true;
				    		else
				    			return false;

				    	} catch (Exception e) {
				    		return false;
				    	}
				    }
				    public boolean verifyConcentrationAmount_cyncs4462(String expected1) {
				    	try {
				    		WebElement AgedPastDueDayaWebElement = new WebDriverWait(driver, 100)
				    				.until(ExpectedConditions.visibilityOfElementLocated(concentration_xpath));
				    		WebElement AgedPastDueDayaAmountWebElement = new WebDriverWait(driver, 10)
				    				.until(ExpectedConditions.visibilityOfElementLocated(concentration_xpath));
				    		AgedPastDueDayaWebElement.isDisplayed();
				    		String actual = AgedPastDueDayaAmountWebElement.getText();
				    		if (actual.equals(expected1))
				    			return true;
				    		else
				    			return false;

				    	} catch (Exception e) {
				    		return false;
				    	}
				    }
				    public boolean verifyTotalineligAmount_cyncs4462(String expected2) {
				    	try {
				    		WebElement AgedPastDueDayaWebElement = new WebDriverWait(
				    				driver, 10)
				    				.until(ExpectedConditions
				    						.visibilityOfElementLocated(inelig_toal_xpath));
				    		WebElement AgedPastDueDayaAmountWebElement = new WebDriverWait(
				    				driver, 10)
				    				.until(ExpectedConditions
				    						.visibilityOfElementLocated(totalamnt_xpath));

				    		AgedPastDueDayaWebElement.isDisplayed();
				    		String actual = AgedPastDueDayaAmountWebElement.getText();
				    		if (actual.equals(expected2))
				    			return true;
				    		else
				    			return false;

				    	} catch (Exception e) {
				    		return false;
				    	}
				    }
				    public boolean verifyAgedPastDueDaysAmount_cyncs4462_1(String expected) {
				    	try {
				    		WebElement AgedPastDueDayaWebElement = new WebDriverWait(
				    				driver, 10)
				    				.until(ExpectedConditions
				    						.visibilityOfElementLocated(agedpastdue_xpath));
				    		WebElement AgedPastDueDayaAmountWebElement = new WebDriverWait(
				    				driver, 10)
				    				.until(ExpectedConditions
				    						.visibilityOfElementLocated(agedpastdueamnt2_xpath));

				    		AgedPastDueDayaWebElement.isDisplayed();
				    		String actual = AgedPastDueDayaAmountWebElement.getText();
				    		if (actual.equals(expected))
				    			return true;
				    		else
				    			return false;

				    	} catch (Exception e) {
				    		return false;
				    	}
				    }
				    
				    
				    public boolean verifyAgedPastDueDaysAmount_cyncs4462_BBCM(String expected) {
				    	try {
				    		WebElement AgedPastDueDayaWebElement = new WebDriverWait(
				    				driver, 10)
				    				.until(ExpectedConditions
				    						.visibilityOfElementLocated(agedpastdue_xpath));
				    		WebElement AgedPastDueDayaAmountWebElement = new WebDriverWait(
				    				driver, 10)
				    				.until(ExpectedConditions
				    						.visibilityOfElementLocated(agedpastdueamnt1_xpath));

				    		AgedPastDueDayaWebElement.isDisplayed();
				    		String actual = AgedPastDueDayaAmountWebElement.getText();
				    		if (actual.equals(expected))
				    			return true;
				    		else
				    			return false;

				    	} catch (Exception e) {
				    		return false;
				    	}
				    	
				    }
				    public boolean verifyAgedPastDueDaysAmount_cyncs4462_BBCM1(String expected) {
				    	try {
				    		WebElement AgedPastDueDayaWebElement = new WebDriverWait(driver, 10)
				    				.until(ExpectedConditions.visibilityOfElementLocated(agedpastdue_xpath));

				    		WebElement AgedPastDueDayaAmountWebElement = new WebDriverWait(driver, 10)
				    				.until(ExpectedConditions.visibilityOfElementLocated(agedpastdueamnt3_xpath));

				    		AgedPastDueDayaWebElement.isDisplayed();
				    		String actual = AgedPastDueDayaAmountWebElement.getText();
				    		if (actual.equals(expected))
				    			return true;
				    		else
				    			return false;

				    	} catch (Exception e) {
				    		return false;
				    	}
				    	
				    }
				    
				    public boolean verifyConcentrationAmount_cyncs4462_BBCM1_C(String expected1) {
				    	try {
				    		WebElement AgedPastDueDayaWebElement = new WebDriverWait(driver, 100)
				    				.until(ExpectedConditions.visibilityOfElementLocated(concentration_xpath));

				    				
				    		WebElement AgedPastDueDayaAmountWebElement = new WebDriverWait(driver, 10)
				    				.until(ExpectedConditions.visibilityOfElementLocated(concentrationamnt1_xpath));

				    		AgedPastDueDayaWebElement.isDisplayed();
				    		String actual = AgedPastDueDayaAmountWebElement.getText();
				    		if (actual.equals(expected1))
				    			return true;
				    		else
				    			return false;

				    	} catch (Exception e) {
				    		return false;
				    	}
				    	
				    }  
				    
				    public boolean verifytotalineligAmount_cyncs4462_BBCM1(String expected2) {
				    	try {
				    		WebElement AgedPastDueDayaWebElement = new WebDriverWait(driver, 10)
				    				.until(ExpectedConditions.visibilityOfElementLocated(inelig_total_xapth));
				    		WebElement AgedPastDueDayaAmountWebElement = new WebDriverWait(driver, 10)
				    		.until(ExpectedConditions.visibilityOfElementLocated(ineligtotalamnt_xpath));

				    		AgedPastDueDayaWebElement.isDisplayed();
				    		String actual = AgedPastDueDayaAmountWebElement.getText();
				    		if (actual.equals(expected2))
				    			return true;
				    		else
				    			return false;

				    	} catch (Exception e) {
				    		return false;
				    	}
				    	}
				        public boolean verifyAgedPastDueDaysAmount_cyncs4462_2(String expected) {
				        	try {
				        		WebElement AgedPastDueDayaWebElement = new WebDriverWait(driver, 10)
				        				.until(ExpectedConditions.visibilityOfElementLocated(agedpastdue_xpath));

				        		WebElement AgedPastDueDayaAmountWebElement = new WebDriverWait(driver, 10)
				        				.until(ExpectedConditions.visibilityOfElementLocated(agedpastdueamnt4_xpath));

				        		AgedPastDueDayaWebElement.isDisplayed();
				        		String actual = AgedPastDueDayaAmountWebElement.getText();
				        		if (actual.equals(expected))
				        			return true;
				        		else
				        			return false;

				        	} catch (Exception e) {
				        		return false;
				        	}
				        
				    	
				    }  
				        public boolean verifyConcentrationAmount_cyncs4462_1(String expected) {
				        	try {
				        		WebElement AgedPastDueDayaWebElement = new WebDriverWait(driver, 10)
				        				.until(ExpectedConditions.visibilityOfElementLocated(concentration_xpath));

				        		WebElement AgedPastDueDayaAmountWebElement = new WebDriverWait(driver, 10)
				        				.until(ExpectedConditions.visibilityOfElementLocated(concentrationamnt2_xpath));

				        		AgedPastDueDayaWebElement.isDisplayed();
				        		String actual = AgedPastDueDayaAmountWebElement.getText();
				        		if (actual.equals(expected))
				        			return true;
				        		else
				        			return false;

				        	} catch (Exception e) {
				        		return false;
				        	}
				        } 
				        public boolean verifyConcentrationAmount_cyncs4462_1M(String expected) {
				        	try {
				        		WebElement AgedPastDueDayaWebElement = new WebDriverWait(driver, 10)
				        				.until(ExpectedConditions.visibilityOfElementLocated(concentration_xpath));
				        		WebElement AgedPastDueDayaAmountWebElement = new WebDriverWait(
				        				driver, 10).until(ExpectedConditions
				        						.visibilityOfElementLocated(concentrationamnt3_xpath));

				        		AgedPastDueDayaWebElement.isDisplayed();
				        		String actual = AgedPastDueDayaAmountWebElement.getText();
				        		if (actual.equals(expected))
				        			return true;
				        		else
				        			return false;

				        	} catch (Exception e) {
				        		return false;
				        	}
				        } 
				        public boolean verifyTotalineligAmount_cyncs4462_1(String expected) {
				        	try {
				        		WebElement AgedPastDueDayaWebElement = new WebDriverWait(
				        				driver, 100)
				        				.until(ExpectedConditions
				        						.visibilityOfElementLocated(totalelig_xpath));
				        		WebElement AgedPastDueDayaAmountWebElement = new WebDriverWait(driver, 10)
				        				.until(ExpectedConditions.visibilityOfElementLocated(totalamnt1_xpath));

				        		AgedPastDueDayaWebElement.isDisplayed();
				        		String actual = AgedPastDueDayaAmountWebElement.getText();
				        		if (actual.equals(expected))
				        			return true;
				        		else
				        			return false;

				        	} catch (Exception e) {
				        		return false;
				        	}
				        }
				        public boolean verifyTotalineligAmount_cyncs4462_1M(String expected) {
				        	try {
				        		WebElement AgedPastDueDayaWebElement = new WebDriverWait(driver, 10)
				        				.until(ExpectedConditions.visibilityOfElementLocated(totaleligM_xpath));

				        		WebElement AgedPastDueDayaAmountWebElement = new WebDriverWait(driver, 10)	
				        		.until(ExpectedConditions.visibilityOfElementLocated(totalamnt2_xpath));

				        		AgedPastDueDayaWebElement.isDisplayed();
				        		String actual = AgedPastDueDayaAmountWebElement.getText();
				        		if (actual.equals(expected))
				        			return true;
				        		else
				        			return false;

				        	} catch (Exception e) {
				        		return false;
				        	}
				        }  
				        public boolean verifyAgedPastDueDaysAmount_cyncs4462_2M(String expected) {
				        	try {
				        		WebElement AgedPastDueDayaWebElement = new WebDriverWait(driver, 100)
				        				.until(ExpectedConditions.visibilityOfElementLocated(agedpastdue_xpath));
				        		
				        		WebElement AgedPastDueDayaAmountWebElement = new WebDriverWait(driver, 10)
				        				.until(ExpectedConditions.visibilityOfElementLocated(agedpastdueamnt5_xpath));

				        		AgedPastDueDayaWebElement.isDisplayed();
				        		String actual = AgedPastDueDayaAmountWebElement.getText();
				        		if (actual.equals(expected))
				        			return true;
				        		else
				        			return false;

				        	} catch (Exception e) {
				        		return false;
				        	}
				        
				    	
				    }  
				        public boolean verifyAgedPastDueDaysAmount_cyncs4462_3(String expected) {
				        	try {
				        		WebElement AgedPastDueDayaWebElement = new WebDriverWait(
				        				driver, 100)
				        				.until(ExpectedConditions
				        						.visibilityOfElementLocated(agedpastdue_xpath));

				        		WebElement AgedPastDueDayaAmountWebElement = new WebDriverWait(driver, 10)
				        				.until(ExpectedConditions.visibilityOfElementLocated(agedpastdueamnt4_xpath));

				        		AgedPastDueDayaWebElement.isDisplayed();
				        		String actual = AgedPastDueDayaAmountWebElement.getText();
				        		if (actual.equals(expected))
				        			return true;
				        		else
				        			return false;

				        	} catch (Exception e) {
				        		return false;
				        	}
				        
				    }  
				        
				        
				        
				        public boolean verifyAsseinventoryAmount_cyncs4462_1(String expected) {
				        	try {
				        		WebElement AssetinventoryWebElement = new WebDriverWait(
				        				driver, 100)
				        				.until(ExpectedConditions
				        						.visibilityOfElementLocated(undefined_xpath));
				        		WebElement AssetinventoryaAmountWebElement = new WebDriverWait(
				        				driver, 100)
				        				.until(ExpectedConditions
				        						.visibilityOfElementLocated(ineligible_invamnt_xpath));

				        		AssetinventoryWebElement.isDisplayed();
				        		String actual = AssetinventoryaAmountWebElement.getText();
				        		if (actual.equals(expected))
				        			return true;
				        		else
				        			return false;

				        	} catch (Exception e) {
				        		return false;
				        	}
				        
				    	
				    } 
				        public boolean verifyAsseinventoryAmount_cyncs4462_1bbcreport(String expected) {
				        	try {
				        		WebElement AssetinventoryWebElement = new WebDriverWait(
				        				driver, 100)
				        				.until(ExpectedConditions
				        						.visibilityOfElementLocated(undefined_xpath));
				        		WebElement AssetinventoryaAmountWebElement = new WebDriverWait(
				        				driver, 100)
				        				.until(ExpectedConditions
				        						.visibilityOfElementLocated(ineliginvamnt_xpath));

				        		AssetinventoryWebElement.isDisplayed();
				        		String actual = AssetinventoryaAmountWebElement.getText();
				        		if (actual.equals(expected))
				        			return true;
				        		else
				        			return false;

				        	} catch (Exception e) {
				        		return false;
				        	}
				        
				    	
				    } 
				        public boolean verifyAsseinventoryAmount_cyncs4462_2bbcreport(String expected2) {
				        	try {
				        		WebElement AssetinventoryWebElement = new WebDriverWait(
				        				driver, 100)
				        				.until(ExpectedConditions
				        						.visibilityOfElementLocated(crsossaged_xpath));
				        		WebElement AssetinventoryaAmountWebElement = new WebDriverWait(
				        				driver, 100)
				        				.until(ExpectedConditions
				        						.visibilityOfElementLocated(crossagedamnt_xpath));

				        		AssetinventoryWebElement.isDisplayed();
				        		String actual = AssetinventoryaAmountWebElement.getText();
				        		if (actual.equals(expected2))
				        			return true;
				        		else
				        			return false;

				        	} catch (Exception e) {
				        		return false;
				        	}
				        
				    	
				    }  
				        public boolean verifyAsseinventorytotalAmount_cyncs4462_2bbcreport(String expected3) {
				        	try {
				        		WebElement AssetinventoryWebElement = new WebDriverWait(
				        				driver, 100)
				        				.until(ExpectedConditions
				        						.visibilityOfElementLocated(totalineligible_xpath));
				        		WebElement AssetinventoryaAmountWebElement = new WebDriverWait(
				        				driver, 100)
				        				.until(ExpectedConditions
				        						.visibilityOfElementLocated(totalamntin_xpath));

				        		AssetinventoryWebElement.isDisplayed();
				        		String actual = AssetinventoryaAmountWebElement.getText();
				        		if (actual.equals(expected3))
				        			return true;
				        		else
				        			return false;

				        	} catch (Exception e) {
				        		return false;
				        	}
				        
				    	
				    }  
				        
				        public boolean verifyAsseinventoryAmount_cyncs4462_1M(String expected) {
				        	try {
				        		WebElement AssetinventoryWebElement = new WebDriverWait(
				        				driver, 100)
				        				.until(ExpectedConditions
				        						.visibilityOfElementLocated(ineligible_xpath));
				        		WebElement AssetinventoryaAmountWebElement = new WebDriverWait(
				        				driver, 100)
				        				.until(ExpectedConditions
				        						.visibilityOfElementLocated(ineligibleamnt_xpath));

				        		AssetinventoryWebElement.isDisplayed();
				        		String actual = AssetinventoryaAmountWebElement.getText();
				        		if (actual.equals(expected))
				        			return true;
				        		else
				        			return false;

				        	} catch (Exception e) {
				        		return false;
				        	}
				    }  
				        public boolean verifyAsseinventoryAmount_cyncs4462_2M(String expected) {
				        	try {
				        		WebElement AssetinventoryWebElement = new WebDriverWait(
				        				driver, 100)
				        				.until(ExpectedConditions
				        						.visibilityOfElementLocated(ineligible_xpath));
				        		WebElement AssetinventoryaAmountWebElement = new WebDriverWait(
				        				driver, 100)
				        				.until(ExpectedConditions
				        						.visibilityOfElementLocated(totalinelig_xpath));

				        		AssetinventoryWebElement.isDisplayed();
				        		String actual = AssetinventoryaAmountWebElement.getText();
				        		if (actual.equals(expected))
				        			return true;
				        		else
				        			return false;

				        	} catch (Exception e) {
				        		return false;
				        	}        		    	
				    }  		        
			 
public boolean CloseTheChildWindeow()
{
	try{
		
		Set <String> handles =driver.getWindowHandles();
		Iterator<String> it = handles.iterator();
		//iterate through your windows
		while (it.hasNext()){
		String parent = it.next();
		String newwin = it.next();
	
		driver.close();
		driver.switchTo().window(parent);		
		}
		return true;}
		catch(Exception ex){
		return false;
		}
	}	
//kruthivas
public boolean Click_on_ORIENTATIONstatus(String sww) {
	try {
		WebElement accTypeDropdownWebEelement = new WebDriverWait(driver, 10)
		.until(ExpectedConditions.visibilityOfElementLocated(ORIENTATIONStatus_xpath));
		Select sel = new Select(accTypeDropdownWebEelement);
		//sel.selectByVisibleText(sw);
		List<WebElement> list = sel.getOptions();
		for (WebElement ele : list) {
			if (ele.getText().equals(sww)) {
				ele.click();
				////Thread.sleep(5000);
				break;
			}
		}
		return true;} 
	catch (Exception ex) {
	}
	return false;

}
public boolean  Click_on_HTML()
{
try{
	WebElement HeaderWebEelement=new WebDriverWait(driver,5)
		.until(ExpectedConditions.visibilityOfElementLocated(HTML_xpath));
	HeaderWebEelement.click();
	return true;
}
catch(Exception ex){
	return false;

}
}
//kruthivas
	public boolean closeHtmlREport() {
      try {
          Thread.sleep(1000);
          Set <String> handles =driver.getWindowHandles();
          Iterator<String> it = handles.iterator();
          //iterate through your windows
          while (it.hasNext()){
          String parent = it.next();
          String newwin = it.next();
          driver.switchTo().window(newwin).close();
          driver.switchTo().window(parent);
          return true;
          }
      } catch (Exception ex) {
          return false;
      }
      return false;
      }
	//kruthivas
	public boolean  verifyARReliance1(){
		try {
		
			WebElement displayWebElement = new WebDriverWait(driver, 10)
			.until(ExpectedConditions.visibilityOfElementLocated(BASE_AVAILABILITY_xpath));
			WebElement AmountWebElement = new WebDriverWait(driver, 10)
			.until(ExpectedConditions.visibilityOfElementLocated(BASEAVAILABILITY_Value1_xpath));
			
			displayWebElement.isDisplayed();
			String s=displayWebElement.getText();
			System.out.println(s);
			
			AmountWebElement.isDisplayed();
			String s1=AmountWebElement.getText();
			System.out.println(s1);
			
			return true;

		} catch (Exception e) {
			
		}
		return true;
		}

}
				        
	

					





