package com.cync.pages;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.SkipException;

import com.cync.base.BasePage;

//Ghanavi
public class BBCAvailabilityPage extends BasePage {
 
    private final By BBCAvailabilityHeader_xpath=By.xpath("//span[contains(text(),'BBC Availability')]");
    private final By BBCAvailabilityHeaderWebEelementHeader_xpath=By.xpath("//span[contains(text(),'BBC Availability')]");
    private final By fundRequestedAmount_xpath=By.xpath("//td[contains(text(),' 10,000.00')]");
    private final By netBorrowingBaseAmount_xpath=By.xpath("//td[contains(text(),' 20,000.00')]");
    private final By ApproveBBCButton_xpath=By.xpath("(//a[contains(text(),'Approve BBC')])[2]");
    private final By SendToApproverButton_xpath=By.xpath("//a[contains(text(),'Send to Approver')]");
    private final By BBCPrintButton_xpath=By.xpath("//a[contains(text(),'BBC Print')]");
    private final By SkipBBCButton_xpath=By.xpath("//a[contains(text(),'Skip BBC')]");
    
    
    //Summary
    private final By firstPlus_xpath=By.xpath("(//i[@class='icon-plus'])[1]");
    private final By priorBalanceLabel_xpath=By.xpath("//td[contains(text(),'Prior Balance - Total Accounts Receivable')]");
    private final By priorBalanceValue_xpath=By.xpath("//table[@class='dataTable table table-bordered table-striped']/tbody/tr[4]/td[8]");
    private final By newSales_xpath=By.xpath("//td[contains(text(),'New Sales (Additions)')]");
    private final By newSalesAmount_xpath=By.xpath("//table[@class='dataTable table table-bordered table-striped']/tbody/tr[5]/td[8]");
    private final By newCredits_xpath=By.xpath("//td[contains(text(),'New Credits')]");
    private final By newCreditsAmount_xpath=By.xpath("//table[@class='dataTable table table-bordered table-striped']/tbody/tr[6]/td[8]");
    private final By newCashCollected_xpath=By.xpath("//td[contains(text(),'New Cash Collected')]");
    private final By newCashCollectedAmount_xpath=By.xpath("//table[@class='dataTable table table-bordered table-striped']/tbody/tr[7]/td[8]");
    private final By newAdjustment_xpath=By.xpath("//td[contains(text(),'New Adjustments')]");
    private final By newAdjustmentAmount_xpath=By.xpath("//table[@class='dataTable table table-bordered table-striped']/tbody/tr[8]/td[8]");
    private final By bbcAdjustment_xpath=By.xpath("//td[contains(text(),'BBC Adjustment')]");
    private final By bbcAdjustmentAmount_xpath=By.xpath("//table[@class='dataTable table table-bordered table-striped']/tbody/tr[9]/td[8]");
    private final By unreconciled_xpath=By.xpath("//td[contains(text(),'Unreconciled')]");
    private final By unreconciledAmount_xpath=By.xpath("//table[@class='dataTable table table-bordered table-striped']/tbody/tr[10]/td[8]");
    private final By endingBallanceTotalAr_xpath=By.xpath("//td[contains(text(),'Ending Balance Total AR')]");
    private final By endingBallanceTotalArAmount_xpath=By.xpath("//table[@class='dataTable table table-bordered table-striped']/tbody/tr[11]/td[8]");
    
    private final By current_xpath=By.xpath("//td[contains(text(),'Current')]");
    private final By currentValue_xpath=By.xpath("//table[@class='dataTable table table-bordered table-striped']/tbody/tr[13]/td[8]");
    private final By over30_xpath=By.xpath("//td[contains(text(),'Over 30')]");
    private final By over30Value_xpath=By.xpath("//table[@class='dataTable table table-bordered table-striped']/tbody/tr[14]/td[8]");
    private final By over60_xpath=By.xpath("//td[contains(text(),'Over 60')]");
    private final By over60Value_xpath=By.xpath("//table[@class='dataTable table table-bordered table-striped']/tbody/tr[15]/td[8]");
    private final By over90_xpath=By.xpath("//td[contains(text(),'Over 90')]");
    private final By over90Value_xpath=By.xpath("//table[@class='dataTable table table-bordered table-striped']/tbody/tr[16]/td[8]");
    private final By over120_xpath=By.xpath("//td[contains(text(),'Over 120')]");
    private final By over120Value_xpath=By.xpath("//table[@class='dataTable table table-bordered table-striped']/tbody/tr[17]/td[8]");
    private final By totalAgedReceivables_xpath=By.xpath("//td[contains(text(),'Total Aged Receivables')]");
    private final By totalAgedReceivablesValue_xpath=By.xpath("//table[@class='dataTable table table-bordered table-striped']/tbody/tr[18]/td[3]");
    
     //rohit
    private final By ineligiblesValue1_xpath=By.xpath("//table[@id='DataTables_Table_0']//tr[20]/td[2]");    
    private final By agedPastDueDaysValue1_xpath=By.xpath("//table[@id='DataTables_Table_0']//tr[21]/td[2]");
    private final By   eligbileArValue1_xpath =By.xpath("//table[@id='DataTables_Table_0']//tr[22]/td[2]");
    private final By advanceRateValue1_xapth=By.xpath("//table[@id='DataTables_Table_0']//tr[23]/td[2]");
    private final By arAvailableValue1_xpath=By.xpath("//table[@id='DataTables_Table_0']//tr[24]/td[2]");
    private final By arReceivableSublimitValue1_xpath=By.xpath("//table[@id='DataTables_Table_0']//tr[25]/td[2]");
    private final By arBorrowingBaseValue1_xpath=By.xpath("//table[@id='DataTables_Table_0']//tr[26]/td[2]");
    private final By arReserveValue1_xpath=By.xpath("//table[@id='DataTables_Table_0']//tr[29]/td[8]");
    private final By netArAdvanceAvailableValue1_xpath=By.xpath("//table[@class='dataTable table table-bordered table-striped']/tbody/tr[30]/td[8]");

    
    
    private final By secondPlus_xpath=By.xpath("(//i[@class='icon-plus'])[2]");
    private final By ineligiblesLabel_xpath=By.xpath("//tr[@class='row-even summary-row parent-row']/td[1]");
    private final By ineligiblesValue_xpath=By.xpath("//table[@class='dataTable table-bordered table-striped']/tbody/tr[23]/td[2]");    
    private final By agedPastDueDays_xpath=By.xpath("//td[contains(text(),'Aged: Past Due Days')]");
    private final By agedPastDueDaysValue_xpath=By.xpath("//table[@class='dataTable table table-bordered table-striped']/tbody/tr[22]/td[8]");
    private final By eligbileAr_xpath=By.xpath("//td[contains(text(),'Eligible AR')]");
    private final By eligbileArValue_xpath=By.xpath("//table[@class='dataTable table-bordered table-striped']/tbody/tr[25]/td[2]");
    private final By advanceRate_xapth=By.xpath("(//td[contains(text(),'Advance Rate')])[1]");
    private final By advanceRateValue_xapth=By.xpath("//table[@class='dataTable table-bordered table-striped']/tbody/tr[26]/td[2]");
    private final By arAvailable_xpath=By.xpath("(//td[contains(text(),'AR Available')])[1]");
    private final By arAvailableValue_xpath=By.xpath("//table[@class='dataTable table-bordered table-striped']/tbody/tr[27]/td[2]");
    private final By arReceivableSublimit_xpath=By.xpath("//td[contains(text(),'AR Receivables Sublimit')]");
    private final By arReceivableSublimitValue_xpath=By.xpath("//table[@class='dataTable table-bordered table-striped']/tbody/tr[28]/td[2]");
    private final By arBorrowingBase_xpath=By.xpath("//td[contains(text(),'AR Borrowing Base')]");
    private final By arBorrowingBaseValue_xpath=By.xpath("//table[@class='dataTable table-bordered table-striped']/tbody/tr[29]/td[2]");
    private final By arTotalSublimit_xpath=By.xpath("//td[contains(text(),'AR Total Sublimit')]");
    private final By arTotalSublimitValue_xpath=By.xpath("//table[@class='dataTable table-bordered table-striped']/tbody/tr[30]/td[2]");
    
    private final By arAvaialbleAdv_xpath=By.xpath("//td[contains(text(),'A/R Available for Advance')]");
    private final By arAvaialbleAdvValue_xpath=By.xpath("//table[@class='dataTable table table-bordered table-striped']/tbody/tr[28]/td[8]");
    private final By arReserve_xpath=By.xpath("//td[contains(text(),'AR Reserves')]");
    private final By arReserveValue_xpath=By.xpath("//table[@class='dataTable table table-bordered table-striped']/tbody/tr[28]/td[8]");
    private final By netArAdvanceAvailable_xpath=By.xpath("//td[contains(text(),'Net AR Available for Advance')]");
    private final By netArAdvanceAvailableValue_xpath=By.xpath("//table[@class='dataTable table table-bordered table-striped']/tbody/tr[30]/td[8]");
    
    private final By inventoryAmount_xpath=By.xpath("//td[contains(text(),'Inventory Amount')]");
    private final By inventoryAmountValue_xpath=By.xpath("//table[@class='dataTable table table-bordered table-striped']/tbody/tr[33]/td[2]");
  //  private final By inventoryGrossAmountValue_xpath=By.xpath("//table[@class='dataTable table table-bordered table-striped']/tbody/tr[32]/td[2]");
    private final By ineligibleInventory_xpath=By.xpath("(//td[contains(text(),'Ineligible')])[1]");
    private final By ineligibleInventoryValue_xpath=By.xpath("//table[@class='dataTable table table-bordered table-striped']/tbody/tr[33]/td[3]");
    private final By eligibleInv_xpath=By.xpath("(//td[contains(text(),'Eligible')])[2]");
    private final By eligibleInvValue_xpath=By.xpath("//table[@class='dataTable table table-bordered table-striped']/tbody/tr[32]/td[4]");
    private final By adjustmentAdvan_xpath=By.xpath("//td[contains(text(),'Adjusted/Advance Rate')]");
    private final By adjustmentAdvanValue_xpath=By.xpath("//table[@class='dataTable table table-bordered table-striped']/tbody/tr[33]/td[5]");
    private final By availableInv_xpath=By.xpath("(//td[contains(text(),'Available')])[4]");
    private final By availableInvValue_xpath=By.xpath("//table[@class='dataTable table table-bordered table-striped']/tbody/tr[33]/td[6]");
    private final By sublimit_xpath=By.xpath("(//td[contains(text(),'Sublimit')])[3]");
    private final By sublimitValue_xpath=By.xpath("//table[@class='dataTable table table-bordered table-striped']/tbody/tr[32]/td[7]");
    private final By inventoryBorrowingBase_xpath=By.xpath("//td[contains(text(),'INVENTORY BORROWING BASE')]");
    private final By inventoryBorrowingBaseValue_xpath=By.xpath("//table[@class='dataTable table table-bordered table-striped']/tbody/tr[33]/td[8]");
    
    private final By inventoryAvailableForAdvance_xpath=By.xpath("(//td[contains(text(),'Inventory Available for Advance')])[1]");
    private final By inventoryAvailableForAdvanceValue_xpath=By.xpath("//table[@class='dataTable table table-bordered table-striped']/tbody/tr[38]/td[8]");
    private final By inventoryReserve_xpath=By.xpath("//td[contains(text(),'Inventory Reserve')]");
    private final By inventoryReserveValue_xpath=By.xpath("//table[@class='dataTable table table-bordered table-striped']/tbody/tr[39]/td[8]");
    private final By netInventoryAvailableForAdvance_xpath=By.xpath("//td[contains(text(),'Net Inventory Available for Advance')]");
    private final By netInventoryAvailableForAdvanceValue_xpath=By.xpath("//table[@class='dataTable table table-bordered table-striped']/tbody/tr[40]/td[8]");
    
    private final By otherAmount_xpath=By.xpath("//td[contains(text(),'Other Amount')]");
    private final By otherAmountValue_xpath=By.xpath("//table[@class='dataTable table table-bordered table-striped']/tbody/tr[47]/td[2]");
    private final By otherCollateralValue_xpath=By.xpath("//table[@class='dataTable table table-bordered table-striped']/tbody/tr[48]/td[2]");
    private final By ineligible_xpath=By.xpath("(//td[contains(text(),'Ineligible')])[2]");
    private final By ineligibleValue_xpath=By.xpath("//table[@class='dataTable table table-bordered table-striped']/tbody/tr[47]/td[3]");
    private final By eligibleCollateral_xpath=By.xpath("(//td[contains(text(),'Eligible')])[3]");
    private final By eligibleCollateralValue_xpath=By.xpath("//table[@class='dataTable table table-bordered table-striped']/tbody/tr[47]/td[4]");
    private final By eligibleCollateralAmount_xpath=By.xpath("//table[@class='dataTable table table-bordered table-striped']/tbody/tr[48]/td[4]");
    private final By advanceRateCollateral_xpath=By.xpath("(//td[contains(text(),'Advance Rate')])[3]");
    private final By advanceRateCollateralValue_xpath=By.xpath("//table[@class='dataTable table table-bordered table-striped']/tbody/tr[47]/td[5]");
    private final By availableCollateral_xpath=By.xpath("(//td[contains(text(),'Available')])[7]");
    private final By availableCollateralValue_xpath=By.xpath("//table[@class='dataTable table table-bordered table-striped']/tbody/tr[47]/td[6]");
    private final By availableCollateralAmount_xpath=By.xpath("//table[@class='dataTable table table-bordered table-striped']/tbody/tr[47]/td[8]");
    private final By sublimitCollateral_xpath=By.xpath("(//td[contains(text(),'Sublimit')])[5]");
    private final By sublimitCollateralValue_xpath=By.xpath("//table[@class='dataTable table table-bordered table-striped']/tbody/tr[47]/td[7]");
    private final By sublimitCollateralAmount_xpath=By.xpath("//table[@class='dataTable table table-bordered table-striped']/tbody/tr[48]/td[7]");
    private final By otherCollateralBorrowingBase_xpath=By.xpath("//td[contains(text(),'Other Collateral Borrowing Base')]");
    private final By otherCollateralBorrowingBaseValue_xpath=By.xpath("//table[@class='dataTable table table-bordered table-striped']/tbody/tr[49]/td[8]");
    private final By otherCollateralSublimit_xpath=By.xpath("//td[contains(text(),'Other Sublimit')]");
    private final By otherCollateralSublimitValue_xpath=By.xpath("//table[@class='dataTable table table-bordered table-striped']/tbody/tr[52]/td[8]");
    private final By collateralBorrowingBaseValue_xpath=By.xpath("//table[@class='dataTable table table-bordered table-striped']/tbody/tr[50]/td[8]");
    private final By otherAvailableForAdvance_xpath=By.xpath("(//td[contains(text(),'Other Available for Advance')])[1]");
    private final By otherAvailableForAdvanceValue_xpath=By.xpath("//table[@class='dataTable table table-bordered table-striped']/tbody/tr[53]/td[8]");
    private final By otherReserve_xpath=By.xpath("//td[contains(text(),'Other Reserves')]");
    private final By otherReserveValue_xpath=By.xpath("//table[@class='dataTable table table-bordered table-striped']/tbody/tr[54]/td[8]");
    private final By netOtherAvailableForAdvance_xpath=By.xpath("//td[contains(text(),'Net Other Available for Advance')]");
    private final By netOtherAvailableForAdvanceValue_xpath=By.xpath("//table[@class='dataTable table table-bordered table-striped']/tbody/tr[55]/td[8]");
    
    private final By totalCollateral_xpath=By.xpath("//td[contains(text(),'Total Collateral')]");
    private final By totalCollateralValue_xpath=By.xpath("//table[@class='dataTable table table-bordered table-striped']/tbody/tr[58]/td[8]");
    private final By totalReserve_xpath=By.xpath("//td[contains(text(),'Total Reserve')]");
    private final By totalReserveValue_xpath=By.xpath("//table[@class='dataTable table table-bordered table-striped']/tbody/tr[59]/td[8]");
    private final By totalAvailableForAdvance_xpath=By.xpath("//td[contains(text(),'Total Available For Advance')]");
    private final By totalAvailableForAdvanceValue_xpath=By.xpath("//table[@class='dataTable table table-bordered table-striped']/tbody/tr[60]/td[8]");
    private final By commitment_xpath=By.xpath("//td[contains(text(),'Commitment')]");
    private final By commitmentValue_xpath=By.xpath("//table[@class='dataTable table table-bordered table-striped']/tbody/tr[64]/td[8]");
    
    private final By borrorwingBaseAvailability_xpath=By.xpath("//td[contains(text(),'BORROWING BASE AVAILABILITY')]");
    private final By borrorwingBaseAvailabilityValue_xpath=By.xpath("//table[@class='dataTable table table-bordered table-striped']/tbody/tr[72]/td[8]");
    private final By fundRequested_xpath=By.xpath("//td[contains(text(),'Funds Requested')]");
    private final By fundRequestedValue_xpath=By.xpath("//table[@class='dataTable table table-bordered table-striped']/tbody/tr[74]/td[8]");
    private final By netBorrowingBaseAvailable_xpath=By.xpath("//td[contains(text(),'NET BORROWING BASE AVAILABLE')]");
    private final By netBorrowingBaseAvailableValue_xpath=By.xpath("//table[@class='dataTable table table-bordered table-striped']/tbody/tr[75]/td[8]");
    
    private final By  bbcDate_xpath=By.xpath("(//label[@class='control-label'])[2]");

    private final By  totalAgedReceivablesReport_xpath=By.xpath("//td[contains(text(),'Total Aged Receivables')]");
    private final By  totalAgedReceivablesValuesReport_xpath=By.xpath("//div[@class='reportsPannel']/table/tbody/tr[18]/td[8]");
    private final By  netARAvailableForAdvance_xpath=By.xpath("//td[contains(text(),'Net AR Available for Advance')]");
    private final By  netARAvailableForAdvanceValue_xpath=By.xpath("//div[@class='reportsPannel']/table/tbody/tr[30]/td[8]");
    private final By  netInventoryAvailableForAdvanceReport_xpath=By.xpath("//td[contains(text(),'Net Inventory Available for Advance')]");
    private final By  netInventoryAvailableForAdvanceValueReport_xpath=By.xpath("//div[@class='reportsPannel']/table/tbody/tr[40]/td[8]");
    private final By  netOtherAvailableForAdvanceReport_xpath=By.xpath("//td[contains(text(),'Net Other Available for Advance')]");
    private final By  netOtherAvailableForAdvanceValueReport_xpath=By.xpath("//div[@class='reportsPannel']/table/tbody/tr[55]/td[8]");
    private final By  borrorwingBaseAvailabilityReport_xpath=By.xpath("//td[contains(text(),'BORROWING BASE AVAILABILITY')]");
    private final By  borrorwingBaseAvailabilityValueReport_xpath=By.xpath("//div[@class='reportsPannel']/table/tbody/tr[72]/td[8]");
    private final By fundRequestedReport_xpath=By.xpath("//td[contains(text(),'Funds Requested')]");
    private final By fundRequestedValueReport_xpath=By.xpath("//div[@class='reportsPannel']/table/tbody/tr[74]/td[8]");
    private final By netBorrowingBaseAvailableReport_xpath=By.xpath("//td[contains(text(),'NET BORROWING BASE AVAILABLE')]");
    private final By netBorrowingBaseAvailableValueReport_xpath=By.xpath("//div[@class='reportsPannel']/table/tbody/tr[75]/td[8]");
    private final By SkipBBC_xpath=By.xpath("//a[text()='Skip BBC']");
    private final By skipMsg_xpath=By.xpath("//strong[contains(text(),'Skipped successfully')]");
    
    
    private final By ineligiblesLabell_xpath=By.xpath("//table[@class='dataTable table table-bordered table-striped']/tbody/tr[21]/td[1]");
    private final By ineligiblesValuee_xpath=By.xpath("//table[@class='dataTable table table-bordered table-striped']/tbody/tr[21]/td[8]");    
    private final By agedPastDueDaysValuee_xpath=By.xpath("//table[@class='dataTable table-bordered table-striped']/tbody/tr[24]/td[2]");
    private final By eligbileArValuee_xpath=By.xpath("//table[@class='dataTable table table-bordered table-striped']/tbody/tr[23]/td[8]");
    private final By advanceRateValuee_xapth=By.xpath("//table[@class='dataTable table table-bordered table-striped']/tbody/tr[24]/td[2]");
    private final By arAvailableValuee_xpath=By.xpath("//table[@class='dataTable table table-bordered table-striped']/tbody/tr[25]/td[8]");
    private final By arReceivableSublimitValuee_xpath=By.xpath("//table[@class='dataTable table table-bordered table-striped']/tbody/tr[26]/td[2]");
    private final By arBorrowingBaseValuee_xpath=By.xpath("//table[@class='dataTable table table-bordered table-striped']/tbody/tr[27]/td[8]");
    private final By arAvaialbleAdvValuee_xpath=By.xpath("//table[@class='dataTable table table-bordered table-striped']/tbody/tr[29]/td[8]");
    private final By arReserveValuee_xpath=By.xpath("//table[@class='dataTable table table-bordered table-striped']/tbody/tr[30]/td[8]");
    private final By netArAdvanceAvailableValuee_xpath=By.xpath("//table[@class='dataTable table table-bordered table-striped']/tbody/tr[31]/td[8]");
    
    //

    private final By inventoryAmountValueM_xpath=By.xpath("//table[@class='dataTable table table-bordered table-striped']/tbody/tr[34]/td[2]");
    private final By ineligibleInventoryValueM_xpath=By.xpath("//table[@class='dataTable table table-bordered table-striped']/tbody/tr[34]/td[3]");
    private final By eligibleInvValueM_xpath=By.xpath("//table[@class='dataTable table table-bordered table-striped']/tbody/tr[34]/td[4]");
    private final By adjustmentAdvanValueM_xpath=By.xpath("//table[@class='dataTable table table-bordered table-striped']/tbody/tr[34]/td[5]");
    private final By availableInvValueM_xpath=By.xpath("//table[@class='dataTable table table-bordered table-striped']/tbody/tr[34]/td[6]");
    private final By sublimitValueM_xpath=By.xpath("//table[@class='dataTable table table-bordered table-striped']/tbody/tr[34]/td[7]");
    private final By inventoryBorrowingBaseValueM_xpath=By.xpath("//table[@class='dataTable table table-bordered table-striped']/tbody/tr[35]/td[8]");
    
    private final By inventoryAvailableForAdvanceValueM_xpath=By.xpath("//table[@class='dataTable table table-bordered table-striped']/tbody/tr[39]/td[8]");
    private final By inventoryReserveValueM_xpath=By.xpath("//table[@class='dataTable table table-bordered table-striped']/tbody/tr[40]/td[8]");
    private final By netInventoryAvailableForAdvanceValueM_xpath=By.xpath("//table[@class='dataTable table table-bordered table-striped']/tbody/tr[41]/td[8]");
    
    
    private final By otherAmountValueT_xpath=By.xpath("//table[@class='dataTable table table-bordered table-striped']/tbody/tr[48]/td[2]");
    private final By ineligibleValueT_xpath=By.xpath("//table[@class='dataTable table table-bordered table-striped']/tbody/tr[48]/td[3]");
    private final By eligibleCollateralValueT_xpath=By.xpath("//table[@class='dataTable table table-bordered table-striped']/tbody/tr[48]/td[4]");
    private final By advanceRateCollateralValueT_xpath=By.xpath("//table[@class='dataTable table table-bordered table-striped']/tbody/tr[48]/td[5]");
    private final By availableCollateralValueT_xpath=By.xpath("//table[@class='dataTable table table-bordered table-striped']/tbody/tr[48]/td[6]");
    private final By sublimitCollateralValueT_xpath=By.xpath("//table[@class='dataTable table table-bordered table-striped']/tbody/tr[48]/td[7]");
    private final By otherCollateralBorrowingBaseValueT_xpath=By.xpath("//table[@class='dataTable table table-bordered table-striped']/tbody/tr[50]/td[8]");
    private final By otherAvailableForAdvanceValueT_xpath=By.xpath("//table[@class='dataTable table table-bordered table-striped']/tbody/tr[54]/td[8]");
    private final By otherReserveValueT_xpath=By.xpath("//table[@class='dataTable table table-bordered table-striped']/tbody/tr[55]/td[8]");
    private final By netOtherAvailableForAdvanceValueT_xpath=By.xpath("//table[@class='dataTable table table-bordered table-striped']/tbody/tr[56]/td[8]");
    
    //
    private final By totalCollateralValueT_xpath=By.xpath("//table[@class='dataTable table table-bordered table-striped']/tbody/tr[59]/td[8]");
    private final By totalReserveValueT_xpath=By.xpath("//table[@class='dataTable table table-bordered table-striped']/tbody/tr[60]/td[8]");
    private final By totalAvailableForAdvanceValueT_xpath=By.xpath("//table[@class='dataTable table table-bordered table-striped']/tbody/tr[61]/td[8]");
    private final By futureDisplayT_xpath=By.xpath("//td[contains(text(),'Future')]");
    private final By futureValueT_xpath=By.xpath("//table[@class='dataTable table table-bordered table-striped']/tbody/tr[13]/td[8]");
    private final By currentValueT_xpath=By.xpath("//table[@class='dataTable table table-bordered table-striped']/tbody/tr[14]/td[8]");
    private final By over30ValueT_xpath=By.xpath("//table[@class='dataTable table table-bordered table-striped']/tbody/tr[15]/td[8]");
    private final By over60ValueT_xpath=By.xpath("//table[@class='dataTable table table-bordered table-striped']/tbody/tr[16]/td[8]");
    private final By over90ValueT_xpath=By.xpath("//table[@class='dataTable table table-bordered table-striped']/tbody/tr[17]/td[8]");
    private final By over120ValueT_xpath=By.xpath("//table[@class='dataTable table table-bordered table-striped']/tbody/tr[18]/td[8]");
    private final By totalAgedReceivablesValueT_xpath=By.xpath("//table[@class='dataTable table table-bordered table-striped']/tbody/tr[19]/td[8]");
    
    
    private final By borrorwingBaseAvailabilityValueT_xpath=By.xpath("//table[@class='dataTable table table-bordered table-striped']/tbody/tr[73]/td[8]");
    private final By fundRequestedValueT_xpath=By.xpath("//table[@class='dataTable table table-bordered table-striped']/tbody/tr[75]/td[8]");
    private final By netBorrowingBaseAvailableValueT_xpath=By.xpath("//table[@class='dataTable table table-bordered table-striped']/tbody/tr[76]/td[8]");
    
    //
    private final By  totalAgedReceivablesValuesReportM_xpath=By.xpath("//div[@class='reportsPannel']/table/tbody/tr[19]/td[8]");
    private final By  netARAvailableForAdvanceValueM_xpath=By.xpath("//div[@class='reportsPannel']/table/tbody/tr[31]/td[8]");
    private final By  netInventoryAvailableForAdvanceValueReportM_xpath=By.xpath("//div[@class='reportsPannel']/table/tbody/tr[41]/td[8]");
    private final By  netOtherAvailableForAdvanceValueReportM_xpath=By.xpath("//div[@class='reportsPannel']/table/tbody/tr[56]/td[8]");
    private final By  borrorwingBaseAvailabilityValueReportM_xpath=By.xpath("//div[@class='reportsPannel']/table/tbody/tr[73]/td[8]");
    private final By fundRequestedValueReportM_xpath=By.xpath("//div[@class='reportsPannel']/table/tbody/tr[75]/td[8]");
    private final By netBorrowingBaseAvailableValueReportM_xpath=By.xpath("//div[@class='reportsPannel']/table/tbody/tr[76]/td[8]");
    

    //ineligible customer
    private final By reason_xpath=By.xpath("//td[contains(text(),'Ineligible Customer')]");
    private final By amnt_xpath=By.xpath("(//td[contains(text(),' 6,250.00')])[4]");
    private final By ineliMNt_xpath=By.xpath("(//td[text()=' 0.00'])[31]");
    private final By reasoninel_xpath=By.xpath("//td[contains(text(),'Eligible AR')]");
    

    
    
    private final By ARReliance_xpath=By.xpath("//td[contains(text(),'AR Reliance (10.00%)')]");
    private final By ARRelianceValue_xpath=By.xpath("//table[@class='dataTable table table-bordered table-striped']/tbody/tr[36]/td[8]");


    
    //anusha(Mul div)
    private final By priorBalanceValueForMulDiv_xpath=By.xpath("//tbody//tr[4]//td[8]");
    private final By newSalesAmountForMulDiv_xpath=By.xpath("//td[contains(text(),'609,240.00')]");
    private final By newCreditsAmountForMulDiv_xpath=By.xpath("//td[contains(text(),'55,955.00')]");
    private final By newCashCollectedAmountForMulDiv_xpath=By.xpath("//tbody//tr[7]//td[8]");
    private final By newAdjustmentAmountForMulDiv_xpath=By.xpath("//tbody//tr[8]//td[8]");
    private final By bbcAdjustmentAmountForMulDiv_xpath=By.xpath("//tbody//tr[9]//td[8]");
    private final By unreconciledAmountForMulDiv_xpath=By.xpath("//tbody//tr[10]//td[8]");
    private final By endingBallanceTotalArAmountForMulDiv_xpath=By.xpath("/html[1]/body[1]/div[3]/div[1]/div[2]/div[4]/div[1]/div[1]/div[2]/div[4]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[11]/td[8]");

    private final By futureValueForMulDiv_xpath=By.xpath("//tbody//tr[13]//td[8]");
    private final By currentValueForMulDiv_xpath=By.xpath("//tbody//tr[14]//td[8]");
    private final By over30ValueForMulDiv_xpath=By.xpath("//tbody//tr[15]//td[8]");
    private final By over60ValueForMulDiv_xpath=By.xpath("//tbody//tr[16]//td[8]");
    private final By over90ValueForMulDiv_xpath=By.xpath("//tbody//tr[17]//td[8]");
    private final By over120ValueForMulDiv_xpath=By.xpath("//td[contains(text(),'486,685.00')]");
    private final By totalAgedReceivablesValueForMulDiv_xpath=By.xpath("//tr[@id='child_']//td[contains(text(),'553,285.00')]");

    private final By ineligiblesValueeForMulDiv_xpath=By.xpath("//tr[@id='parent_inel_0']//td[contains(text(),'547,655.00')]");    
    private final By agedPastDueDaysValueeForMulDiv_xpath=By.xpath("//tr[@id='child_inel_0']//td[contains(text(),'547,655.00')]");
    private final By eligbileArValueeForMulDiv_xpath=By.xpath("//td[contains(text(),'5,630.00')]");
    private final By advanceRateValueeForMulDiv_xapth=By.xpath("//tbody//tr[24]//td[6]");
    private final By arAvailableValueeForMulDiv_xpath=By.xpath("//tbody//tr[25]//td[8]");
    private final By arBorrowingBaseValueeForMulDiv_xpath=By.xpath("//tbody//tr[27]//td[8]");
    private final By arAvaialbleAdvValueeForMulDiv_xpath=By.xpath("//tbody//tr[29]//td[8]");
    private final By arReserveValueeForMulDiv_xpath=By.xpath("//td[contains(text(),'7,500.00')]");
    private final By netArAdvanceAvailableValueeForMulDiv_xpath=By.xpath("//td[contains(text(),'(6,394.50)')]");
    
    private final By inventoryAmountValueMForMulDiv_xpath=By.xpath("//td[contains(text(),'7,711,582.25')]");
    private final By ineligibleInventoryValueMForMulDiv_xpath=By.xpath("//tr[@id='parent_inv_ineligible01']//td[contains(text(),'141,684.00')]");
    private final By eligibleInvValueMForMulDiv_xpath=By.xpath("//td[contains(text(),'7,569,898.25')]");
    private final By availableInvValueMForMulDiv_xpath=By.xpath("//tbody//tr[50]//td[8]");
    private final By inventoryBorrowingBaseValueMForMulDiv_xpath=By.xpath("//tbody//tr[52]//td[8]");   
    private final By inventoryAvailableForAdvanceValueMForMulDiv_xpath=By.xpath("//tbody//tr[54]//td[8]");
    private final By inventoryReserveValueMForMulDiv_xpath=By.xpath("//td[contains(text(),'1,925.00')]");
    private final By netInventoryAvailableForAdvanceValueMForMulDiv_xpath=By.xpath("//td[contains(text(),'6,775,417.45')]");
    
    private final By otherAmountValueTForMulDiv_xpath=By.xpath("//td[contains(text(),'36,000.00')]");
    private final By ineligibleValueTForMulDiv_xpath=By.xpath("//tbody//tr[80]//td[8]");
    private final By eligibleCollateralValueTForMulDiv_xpath=By.xpath("//td[contains(text(),'35,200.00')]");
    private final By availableCollateralValueTForMulDiv_xpath=By.xpath("//tbody//tr[85]//td[8]");
    private final By otherCollateralBorrowingBaseValueTForMulDiv_xpath=By.xpath("//tbody//tr[87]//td[8]");
    private final By otherAvailableForAdvanceValueTForMulDiv_xpath=By.xpath("//tbody//tr[94]//td[8]");
    private final By otherReserveValueTForMulDiv_xpath=By.xpath("//td[contains(text(),'1,300.00')]");
    private final By netOtherAvailableForAdvanceValueTForMulDiv_xpath=By.xpath("//td[contains(text(),'29,500.00')]");
    
    private final By totalCollateralValueTForMulDiv_xpath=By.xpath("//td[contains(text(),'6,798,522.95')]");
    private final By totalReserveValueTForMulDiv_xpath=By.xpath("//td[contains(text(),'5,950.00')]");
    private final By totalAvailableForAdvanceValueTForMulDiv_xpath=By.xpath("//tbody//tr[101]//td[8]");
    
    private final By borrorwingBaseAvailabilityValueTForMulDiv_xpath=By.xpath("//tbody//tr[113]//td[8]");
    private final By fundRequestedValueTForMulDiv_xpath=By.xpath("//tbody//tr[115]//td[8]");
    private final By netBorrowingBaseAvailableValueTForMulDiv_xpath=By.xpath("//td[contains(text(),'6,784,572.95')]");
    
    
    private final By  totalAgedReceivablesValuesReportMForMulDiv_xpath=By.xpath("//tbody//tr[19]//td[8]");
    private final By  netARAvailableForAdvanceValueMForMulDiv_xpath=By.xpath("//td[contains(text(),'(6,394.50)')]");
    private final By  netInventoryAvailableForAdvanceValueReportMForMulDiv_xpath=By.xpath("//td[contains(text(),'6,775,417.45')]");
    private final By  netOtherAvailableForAdvanceValueReportMForMulDiv_xpath=By.xpath("//td[contains(text(),'29,500.00')]");
    private final By  borrorwingBaseAvailabilityValueReportMForMulDiv_xpath=By.xpath("//tbody//tr[113]//td[8]");
    private final By fundRequestedValueReportMForMulDiv_xpath=By.xpath("//tbody//tr[115]//td[8]");
    private final By netBorrowingBaseAvailableValueReportMForMulDiv_xpath=By.xpath("//td[contains(text(),'6,784,572.95')]");



  
////exclude reason

    private final By excludedreason_xpath=By.xpath("(//td[contains(text(),'Excluded')])[1]");  
    private final By excludeamnt_xpath=By.xpath("(//td[contains(text(),' 3,000.00')])[3]");
    private final By excludeamnt1_xpath=By.xpath("(//td[contains(text(),' 3,500.00')])[3]");
    private final By excludeamnt2_xpath=By.xpath("(//td[contains(text(),' 2,500.00')])[3]");
    private final By excludeamnt3_xpath=By.xpath("(//td[contains(text(),' 15,900.00')])[3]");
    private final By excludeamnt4_xpath=By.xpath("(//td[contains(text(),' 16,500.00')])[3]");
    private final By excludeamnt5_xpath=By.xpath("(//td[contains(text(),' 5,000.00')])[3]");
    private final By excludeamnt6_xpath=By.xpath("(//td[text()=' (6,600.00)'])[1]");
private final By excludeamnt7_xpath=By.xpath("(//td[text()=' 3,000.00'])[1]");
private final By agedpastdeu_xpath=By.xpath("//td[contains(text(),'Aged: Past Due Days')]");
private final By agedpastamnt_xpath=By.xpath("(//td[text()=' 66,000.00'])[1]");

    //retention reason
   /* private final By retentionreason_xpath=By.xpath("(//td[contains(text(),'Retention')])[2]");
    private final By retentionamnt_xpath=By.xpath("(//td[contains(text(),' 1,500.00')])[5]");
    private final By retentionamnt1_xpath=By.xpath("(//td[text()=' 22,000.00'])[7]");
    private final By retentionamnt2_xpath=By.xpath("( //td[text()=' 50.00'])[9]");
    private final By retentionamnt3_xpath=By.xpath("(//td[text()=' 0.00'])[15]");
    private final By retentionamnt4_xpath=By.xpath("(//td[text()=' 0.00'])[19]");
    */



    //retention reason

    private final By retentionreason_xpath=By.xpath("(//td[contains(text(),'Retention')])[2]");
    private final By retentionamnt_xpath=By.xpath("(//td[contains(text(),' 1,500.00')])[5]");
    private final By retentionamnt1_xpath=By.xpath("(//td[text()=' 22,000.00'])[7]");
    private final By retentionamnt2_xpath=By.xpath("( //td[text()=' 50.00'])[9]");
    private final By retentionamnt3_xpath=By.xpath("(//td[text()=' 0.00'])[15]");
    private final By retentionamnt4_xpath=By.xpath("(//td[text()=' 0.00'])[19]");
    

    //anusha

    
    //Garima
    private final By Paper_xpath=By.xpath("//a[contains(text(),'Paper Signature')]");
    private final By ElectronicSignature_xpath=By.xpath(" //a[contains(text(),'Electronic Signature')]");
    private final By reject_xpath=By.xpath("//a[@id='lnk-reject-review']");
    private final By Download_xpath=By.xpath("//a[contains(text(),'Download')]");
    private final By Print_xpath=By.xpath("//a[@class='save_btn view-button'][contains(text(),'Print')]");
    private final By Headersxpath=By.xpath("//span[@class='ui-dialog-title']");
    private final By BBcavablityapprove_xpath=By.xpath("//a[text()='Approve BBC']");
    
	 private final By Authorisedname_xpath=By.id("signer_name");
	 private final By Iagree_xpath=By.id("terms_condition");
	 private final By AuthorisedSignature_xpath=By.xpath("(//button[@type='button'])[6]");
	 private final By Verifymessage_xpath=By.id("message");
	 private final By Verfiypage_xpath=By.xpath("//span[@class='paneltitle']");
	
    
    
    //anusha
	 private final By priorBalanceValueForSummaryYesMulDiv_xpath=By.xpath("//tr[4]//td[8]");
	    private final By newSalesAmountForSummaryYesMulDiv_xpath=By.xpath("//tr[5]//td[8]");
	    private final By newCreditsAmountForSummaryYesMulDiv_xpath=By.xpath("//tr[6]//td[8]");
	    private final By newCashCollectedAmountForSummaryYesMulDiv_xpath=By.xpath("//tr[7]//td[8]");
	    private final By newAdjustmentAmountForSummaryYesMulDiv_xpath=By.xpath("//tr[8]//td[8]");
	    private final By bbcAdjustmentAmountForSummaryYesMulDiv_xpath=By.xpath("//tr[9]//td[8]");
	    private final By unreconciledAmountForSummaryYesMulDiv_xpath=By.xpath("//tr[10]//td[8]");
	    private final By endingBallanceTotalArAmountSummaryYesForMulDiv_xpath=By.xpath("//tr[11]//td[8]");

    
	    private final By futureValueForSummaryYesMulDiv_xpath=By.xpath("//td[contains(text(),'10,000.00')]");
	    private final By currentValueForSummaryYesMulDiv_xpath=By.xpath("//td[contains(text(),'130,100.00')]");
	    private final By over30ValueForSummaryYesMulDiv_xpath=By.xpath("//td[contains(text(),'26,100.00')]");
	    private final By over60ValueForSummaryYesMulDiv_xpath=By.xpath("//tr[16]//td[8]");
	    private final By over90ValueForSummaryYesMulDiv_xpath=By.xpath("//td[contains(text(),'2,600.00')]");
	    private final By over120ValueForSummaryYesMulDiv_xpath=By.xpath("//td[contains(text(),'160,000.00')]");
	    private final By totalAgedReceivablesValueForSummaryYesMulDiv_xpath=By.xpath("//tr[@id='child_']//td[contains(text(),'336,800.00')]");

    
    
    
	    private final By ineligiblesValueeForSummaryYesMulDiv_xpath=By.xpath("//tr[@class='row-odd summary-row parent-row']//td[contains(text(),'170,600.00')]");    
	    private final By agedPastDueDaysValueeForSummaryYesMulDiv_xpath=By.xpath("//tr[@id='child_inel_0']//td[contains(text(),'170,600.00')]");
	    private final By eligbileArValueeForSummaryYesMulDiv_xpath=By.xpath("//td[contains(text(),'166,200.00')]");
	    private final By advanceRateValueeForSummaryYesMulDiv_xapth=By.xpath("//tr[24]//td[2]");
	    private final By arAvailableValueeForSummaryYesMulDiv_xpath=By.xpath("//tr[25]//td[8]");
	    private final By arBorrowingBaseValueeForSummaryYesMulDiv_xpath=By.xpath("//tr[26]//td[8]");
	    private final By arAvaialbleAdvValueeForSummaryYesMulDiv_xpath=By.xpath("//tr[27]//td[8]");
	    private final By arReserveValueeForSummaryYesMulDiv_xpath=By.xpath("//tr[30]//td[8]");
	    private final By netArAdvanceAvailableValueeForSummaryYesMulDiv_xpath=By.xpath("//td[contains(text(),'137,110.00')]");
	    
	    private final By inventoryAmountValueMForSummaryYesMulDiv_xpath=By.xpath("//td[contains(text(),'7,711,582.25')]");
	    private final By ineligibleInventoryValueMForSummaryYesMulDiv_xpath=By.xpath("//tr[@id='parent_inv_ineligible01']//td[contains(text(),'141,684.00')]");
	    private final By eligibleInvValueMForSummaryYesMulDiv_xpath=By.xpath("//td[contains(text(),'7,569,898.25')]");
	    private final By availableInvValueMForSummaryYesMulDiv_xpath=By.xpath("//tr[105]//td[8]");
	    private final By inventoryBorrowingBaseValueMForSummaryYesMulDiv_xpath=By.xpath("//tr[54]//td[8]");   
	    private final By inventoryAvailableForAdvanceValueMForSummaryYesMulDiv_xpath=By.xpath("//tr[62]//td[8]");
	    private final By inventoryReserveValueMForSummaryYesMulDiv_xpath=By.xpath("//tr[63]//td[8]");
	    private final By netInventoryAvailableForAdvanceValueMForSummaryYesMulDiv_xpath=By.xpath("//tr[64]//td[8]");
	   
	    private final By otherAmountValueTForSummaryYesMulDiv_xpath=By.xpath("//tr[83]//td[8]");
	    private final By ineligibleValueTForSummaryYesMulDiv_xpath=By.xpath("//tr[84]//td[8]");
	    private final By eligibleCollateralValueTForSummaryYesMulDiv_xpath=By.xpath("//tr[85]//td[8]");
	    private final By availableCollateralValueTForSummaryYesMulDiv_xpath=By.xpath("//tr[89]//td[8]");
	    private final By otherCollateralBorrowingBaseValueTForSummaryYesMulDiv_xpath=By.xpath("//tr[91]//td[8]");
	    private final By otherAvailableForAdvanceValueTForSummaryYesMulDiv_xpath=By.xpath("//tr[98]//td[8]");
	    private final By otherReserveValueTForSummaryYesMulDiv_xpath=By.xpath("//tr[99]//td[8]");
	    private final By netOtherAvailableForAdvanceValueTForSummaryYesMulDiv_xpath=By.xpath("//tr[100]//td[8]");
	    
    
	    private final By totalCollateralValueTForSummaryYesMulDiv_xpath=By.xpath("//tr[103]//td[8]");
	    private final By totalReserveValueTForSummaryYesMulDiv_xpath=By.xpath("//tr[104]//td[8]");
	    private final By totalAvailableForAdvanceValueTForSummaryYesMulDiv_xpath=By.xpath("//tr[105]//td[8]");
	    
	    private final By borrorwingBaseAvailabilityValueTForSummaryYesMulDiv_xpath=By.xpath("//tr[113]//td[8]");
	    private final By fundRequestedValueTForSummaryYesMulDiv_xpath=By.xpath("//tr[115]//td[8]");
	    private final By netBorrowingBaseAvailableValueTForSummaryYesMulDiv_xpath=By.xpath("//td[contains(text(),'792,000.00')]");
	    
    
	    private final By  totalAgedReceivablesValuesReportMForSummaryYesMulDiv_xpath=By.xpath("//tr[19]//td[8]");
	    private final By  netARAvailableForAdvanceValueMForSummaryYesMulDiv_xpath=By.xpath("//td[contains(text(),'137,110.00')]");
	    private final By  netInventoryAvailableForAdvanceValueReportMForSummaryYesMulDiv_xpath=By.xpath("//td[contains(text(),'6,775,417.45')]");
	    private final By  netOtherAvailableForAdvanceValueReportMForSummaryYesMulDiv_xpath=By.xpath("//td[contains(text(),'29,500.00')]");
	    private final By  borrorwingBaseAvailabilityValueReportMForSummaryYesMulDiv_xpath=By.xpath("//tr[113]//td[8]");
	    private final By fundRequestedValueReportMForSummaryYesMulDiv_xpath=By.xpath("//tr[115]//td[8]");
	    private final By netBorrowingBaseAvailableValueReportMForSummaryYesMulDiv_xpath=By.xpath("//td[contains(text(),'792,000.00')]");

    
    
    
    

    
    private final By AgedCreditItem_xpath=By.xpath("(//td[contains(text(),'300.00')])[3]");
    private final By CrossAgedPercentage_xpath=By.xpath("(//td[contains(text(),'75,800.00')])[1]");
    private final By ConcentrationPercentage_xpath=By.xpath("(//td[contains(text(),'67,540.00')])[1]");
    private final By PastDueDays_xpath=By.xpath("(//td[contains(text(),' 71,950.00')])[1]");
    private final By IneligibleCustomer_xpath=By.xpath("(//td[contains(text(),'9,000.00')])[1]");
    private final By ConcentrationPercentageAgedcreditLimit_xpath=By.xpath("(//td[contains(text(),'67,570.00')])[1]");
    private final By ConcentrationPercentageIneligibleCustomer_xpath=By.xpath("(//td[contains(text(),'68,470.00')])[1]");
    private final By ConcentrationPercentageAgedCreditLimitExclude_xpath=By.xpath("(//td[contains(text(),'84,500.00')])[1]");
    private final By ConcentrationPercentageCrossAgedPercentageExclude_xpath=By.xpath("(//td[contains(text(),'76,050.00')])[1]");
    private final By ConcentrationPercentageTotalReceivablesCap_xpath=By.xpath("(//td[contains(text(),'60,345.00')])[1]");
    private final By ConcentrationPercentageAgedcreditLimitEligibleBalance_xpath=By.xpath("(//td[contains(text(),'67,540.00')])[1]");

//cyncs_4462
    private final By agedpastdueamnt_xpath=By.xpath("(//td[text()=' 126,750.00'])[3]");
    private final By agedpastdueamnt1_xpath=By.xpath("(//td[text()=' 126,750.00'])[1]");
    private final By concentration_xpath=By.xpath("//td[contains(text(),'Concentration %')]");
    private final By concentrationamnt_xpath=By.xpath("(//td[text()=' 200.00'])[1]");
    private final By totalelig_xpath=By.xpath("//tr[@id='parent_inel_0']//td[1]");
    private final By totalamnt_xpath=By.xpath("(//td[text()=' 126,950.00'])[1]");
    private final By agedpastdueamnt2_xpath=By.xpath("(//td[text()=' 0.00'])[13]");
    private final By agedpastdueamnt3_xpath=By.xpath("(//td[text()=' 0.00 '])[9]");
    private final By concentrationamnt1_xpath=By.xpath("(//td[text()=' 8,000.00'])[3]");
    private final By totalamnt1_xpath=By.xpath("(//td[text()=' 8,000.00'])[1]");
   private final By inv_plus_xpath=By.xpath("//tr[@id='parent_inv_ineligible10']//td[1]");
    private final By inve_undefined_xpath=By.xpath("//td[contains(text(),'Undefined')]");
    private final By invamnt_xpath=By.xpath("(//td[text()=' 1,418.00'])[3]");
    private final By advancerate_xpath=By.xpath("(//td[contains(text(),'Advance Rate')])[1]");
    private final By ineliamntasset_xpath=By.xpath("(//td[text()=' 1,418.00'])[1]");
    private final By crossaged_xpath=By.xpath("//td[contains(text(),'Cross Aged %')]");
    private final By assetamnt2_xpath=By.xpath("(//td[text()=' 300.00'])[1]");
    private final By total_xpath=By.xpath("//tr[@id='parent_inv_ineligible10']//td[1]");
    private final By totalinelig_xpath=By.xpath("(//td[text()=' 1,718.00'])[1]");

    //kruthivas
    private final By inventoryGrossAmountValue_xpath=By.xpath("//table[@class='dataTable table table-bordered table-striped']//tbody//tr[36]/td[2]");


    private final By ARReliance1_xpath=By.xpath("//td[contains(text(),'AR Reliance')]");
    private final By ARRelianceValue1_xpath=By.xpath("//table[@class='dataTable table table-bordered table-striped']/tbody/tr[37]/td[8]");
    private final By eligibleInv1_xpath=By.xpath("//td[contains(text(),'Eligible AR')]");
    private final By eligibleInvValue1_xpath=By.xpath("//table[@class='dataTable table table-bordered table-striped']/tbody/tr[22]/td[2]");
    private final By ineligiblesLabell1_xpath=By.xpath("//table[@class='dataTable table table-bordered table-striped']/tbody/tr[32]/td[4]");

    public BBCAvailabilityPage(WebDriver driver) throws InterruptedException {
    	
    	
    	super(driver);
    	try {
    		Thread.sleep(1000);
    	} catch (InterruptedException e) {
    		// TODO Auto-generated catch block
    		e.printStackTrace();
    	}
    	if(!driver.findElement(BBCAvailabilityHeader_xpath).getText().trim().equals("BBC Availability")){
    		throw new SkipException("Fund Request couldn't open.");
    	}
	}
	public boolean clickOn_plusofinventory()
	{
	try{
		WebElement editWebEelement=new WebDriverWait(driver,5)
			.until(ExpectedConditions.visibilityOfElementLocated(inv_plus_xpath));
		editWebEelement.click();
		return true;
	}
	catch(Exception ex){
		return false;	
	}
	}
	public boolean verifyassetinventoryamnt_cyncs4462_total(String expected2) {
    	try {
    		WebElement assetinventoryWebElement = new WebDriverWait(
    				driver, 100)
    				.until(ExpectedConditions
    						.visibilityOfElementLocated(total_xpath));
    		WebElement assetinventoryAmountWebElement = new WebDriverWait(
    				driver, 100)
    				.until(ExpectedConditions
    						.visibilityOfElementLocated(totalinelig_xpath));

    		assetinventoryWebElement.isDisplayed();
    		String actual = assetinventoryAmountWebElement.getText();
    		if (actual.equals(expected2))
    			return true;
    		else
    			return false;

    	} catch (Exception e) {
    		return false;
    	}
    
	
} 
    public boolean verifyAssetinventoryAmount_cyncs4462(String expected) {
    	try {
    		WebElement assetinventoryWebElement = new WebDriverWait(
    				driver, 100)
    				.until(ExpectedConditions
    						.visibilityOfElementLocated(inve_undefined_xpath));
    		WebElement AssetinventoryAmountWebElement = new WebDriverWait(
    				driver, 100)
    				.until(ExpectedConditions
    						.visibilityOfElementLocated(invamnt_xpath));

    		assetinventoryWebElement.isDisplayed();
    		String actual = AssetinventoryAmountWebElement.getText();
    		if (actual.equals(expected))
    			return true;
    		else
    			return false;

    	} catch (Exception e) {
    		return false;
    	}
    }
	public boolean verifyassetinventoryamnt_cyncs4462_2(String expected1) {
    	try {
    		WebElement assetinventoryWebElement = new WebDriverWait(
    				driver, 100)
    				.until(ExpectedConditions
    						.visibilityOfElementLocated(crossaged_xpath));
    		WebElement assetinventoryAmountWebElement = new WebDriverWait(
    				driver, 100)
    				.until(ExpectedConditions
    						.visibilityOfElementLocated(assetamnt2_xpath));

    		assetinventoryWebElement.isDisplayed();
    		String actual = assetinventoryAmountWebElement.getText();
    		if (actual.equals(expected1))
    			return true;
    		else
    			return false;

    	} catch (Exception e) {
    		return false;
    	}
    
	
}
    public boolean verifyAssetinventoryAmount_cyncs4462_bbc(String expected) {
    	try {
    		WebElement assetinventoryWebElement = new WebDriverWait(
    				driver, 100)
    				.until(ExpectedConditions
    						.visibilityOfElementLocated(inve_undefined_xpath));
    		WebElement AssetinventoryAmountWebElement = new WebDriverWait(
    				driver, 100)
    				.until(ExpectedConditions
    						.visibilityOfElementLocated(ineliamntasset_xpath));

    		assetinventoryWebElement.isDisplayed();
    		String actual = AssetinventoryAmountWebElement.getText();
    		if (actual.equals(expected))
    			return true;
    		else
    			return false;

    	} catch (Exception e) {
    		return false;
    	}
    }
    public boolean scrollToViewL()
    {
    	try{
    		 WebElement actual1=new WebDriverWait(driver,5)
    		 .until(ExpectedConditions.visibilityOfElementLocated(advancerate_xpath));
    		JavascriptExecutor jse1 = (JavascriptExecutor)driver;;
    		jse1.executeScript("arguments[0].scrollIntoView(true);", actual1);  		

            Thread.sleep(300);

            return true;
    		
    	}
    	catch(Exception e){
    		
    	}
    	return false;
    	
    	} 
   
    public boolean verifyAgedPastDueDaysAmount_cyncs4462(String expected) {
    	try {
    		WebElement AgedPastDueDayaWebElement = new WebDriverWait(
    				driver, 10)
    				.until(ExpectedConditions
    						.visibilityOfElementLocated(agedpastdeu_xpath));
    		WebElement AgedPastDueDayaAmountWebElement = new WebDriverWait(
    				driver, 10)
    				.until(ExpectedConditions
    						.visibilityOfElementLocated(agedpastdueamnt_xpath));

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
    public boolean verifyAgedPastDueDaysAmount_cyncs4462_1(String expected) {
    	try {
    		WebElement AgedPastDueDayaWebElement = new WebDriverWait(driver, 10)
    				.until(ExpectedConditions.visibilityOfElementLocated(agedpastdeu_xpath));
    		
    		WebElement AgedPastDueDayaAmountWebElement = new WebDriverWait(driver, 10)
    				.until(ExpectedConditions.visibilityOfElementLocated(agedpastdueamnt1_xpath));

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
    public boolean verifyAgedPastDueDaysAmount_cyncs4462_2(String expected) {
    	try {
    		WebElement AgedPastDueDayaWebElement = new WebDriverWait(
    				driver, 100)
    				.until(ExpectedConditions
    						.visibilityOfElementLocated(agedpastdeu_xpath));
    		WebElement AgedPastDueDayaAmountWebElement = new WebDriverWait(
    				driver, 100)
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

    public boolean verifyConcentrationAmount_cyncs4462(String expected) {
    	try {
    		WebElement AgedPastDueDayaWebElement = new WebDriverWait(
    				driver, 100)
    				.until(ExpectedConditions
    						.visibilityOfElementLocated(concentration_xpath));
    		WebElement AgedPastDueDayaAmountWebElement = new WebDriverWait(
    				driver, 100)
    				.until(ExpectedConditions
    						.visibilityOfElementLocated(concentrationamnt_xpath));

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
    		WebElement AgedPastDueDayaWebElement = new WebDriverWait(
    				driver, 100)
    				.until(ExpectedConditions
    						.visibilityOfElementLocated(concentration_xpath));
    		WebElement AgedPastDueDayaAmountWebElement = new WebDriverWait(
    				driver, 100)
    				.until(ExpectedConditions
    						.visibilityOfElementLocated(concentrationamnt1_xpath));

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
    public boolean verifyTotalineligAmount_cyncs4462(String expected) {
    	try {
    		WebElement AgedPastDueDayaWebElement = new WebDriverWait(
    				driver, 100)
    				.until(ExpectedConditions
    						.visibilityOfElementLocated(totalelig_xpath));
    		WebElement AgedPastDueDayaAmountWebElement = new WebDriverWait(
    				driver, 100)
    				.until(ExpectedConditions
    						.visibilityOfElementLocated(totalamnt_xpath));

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
    		WebElement AgedPastDueDayaAmountWebElement = new WebDriverWait(
    				driver, 100)
    				.until(ExpectedConditions
    						.visibilityOfElementLocated(totalamnt1_xpath));

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
    
    public  boolean verifyIneligibleExcludedreasonbbcavailabilityScreenunapprovebbc(String ReasonData){
    	try{
    	WebElement verifyIneligibilityReasonWebE=new WebDriverWait(driver,20)
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
    public  boolean verifyIneligibleAgedpastduereasonbbcavailabilityScreenunapprovebbc(String ReasonData1){
    	try{
    	WebElement verifyIneligibilityReasonWebE=new WebDriverWait(driver,20)
    	.until(ExpectedConditions.visibilityOfElementLocated(agedpastdeu_xpath));
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
    
    public  boolean verifyIneligibileExcludedamntbbcavailabilitycreenunapprovbbc2(String ReasonAmount){
		try{
		WebElement verifyIneligibilityAmountWebE=new WebDriverWait(driver,20)
		.until(ExpectedConditions.visibilityOfElementLocated(excludeamnt1_xpath));
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
    
    public  boolean verifyIneligibileExcludedamntbbcavailabilitycreenunapprovbbc3(String ReasonAmount){
		try{
		WebElement verifyIneligibilityAmountWebE=new WebDriverWait(driver,20)
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
   
   
public  boolean verifyIneligibileExcludedamntbbcavailabilitycreenunapprovbbc4(String ReasonAmount){
	try{
	WebElement verifyIneligibilityAmountWebE=new WebDriverWait(driver,20)
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

    public  boolean verifyIneligibileExcludedamntbbcavailabilitycreenunapprovbbc5(String ReasonAmount){
		try{
		WebElement verifyIneligibilityAmountWebE=new WebDriverWait(driver,20)
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
    public  boolean verifyIneligibileExcludedamntbbcavailabilitycreenunapprovbbc7(String ReasonAmount){
		try{
		WebElement verifyIneligibilityAmountWebE=new WebDriverWait(driver,20)
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


    
    public  boolean verifyIneligibileExcludedamntbbcavailabilitycreenunapprovbbc6(String ReasonAmount){
		try{
		WebElement verifyIneligibilityAmountWebE=new WebDriverWait(driver,20)
		.until(ExpectedConditions.visibilityOfElementLocated(excludeamnt5_xpath));
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

 //retention reason
    
    public  boolean verifyIneligibleretentionreasonbbcavailabilityScreenunapprovebbc(String ReasonData){
    	try{
    	WebElement verifyIneligibilityReasonWebE=new WebDriverWait(driver,20)
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
    public  boolean verifyIneligibileretentionamntbbcavailabilitycreenunapprovbbc1(String ReasonAmount){
		try{
		WebElement verifyIneligibilityAmountWebE=new WebDriverWait(driver,20)
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
    public  boolean verifyIneligibileretentionamntbbcavailabilitycreenunapprovbbc4(String ReasonAmount){
		try{
		WebElement verifyIneligibilityAmountWebE=new WebDriverWait(driver,20)
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
    public  boolean verifyIneligibileretentionamntbbcavailabilitycreenunapprovbbc3(String ReasonAmount){
		try{
		WebElement verifyIneligibilityAmountWebE=new WebDriverWait(driver,20)
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
    public  boolean verifyIneligibileretentionamntbbcavailabilitycreenunapprovbbc2(String ReasonAmount){
		try{
		WebElement verifyIneligibilityAmountWebE=new WebDriverWait(driver,20)
		.until(ExpectedConditions.visibilityOfElementLocated(retentionamnt2_xpath));
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
    	public  boolean verifyIneligibileretentionamntbbcavailabilitycreenunapprovbbc(String ReasonAmount){
    		try{
    		WebElement verifyIneligibilityAmountWebE=new WebDriverWait(driver,20)
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
    ////INELIGIBLE CUSTOMER
    public  boolean verifyIneligibilityreasonbbcavailabilityScreenunapprovebbc(String ReasonData){
    	try{
    	WebElement verifyIneligibilityReasonWebE=new WebDriverWait(driver,20)
    	.until(ExpectedConditions.visibilityOfElementLocated(reasoninel_xpath));
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
        
    public  boolean verifyIneligibilityamntbbcavailabilitycreenunapprovbbc(String ReasonAmount){
		try{
		WebElement verifyIneligibilityAmountWebE=new WebDriverWait(driver,20)
		.until(ExpectedConditions.visibilityOfElementLocated(ineliMNt_xpath));
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

    public  boolean verifyIneligibileExcludedamntbbcavailabilitycreenunapprovbbc1(String ReasonAmount){
		try{
		WebElement verifyIneligibilityAmountWebE=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(excludeamnt_xpath));
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

    public  boolean verifyIneligibileExcludedamntbbcavailabilitycreenunapprovbbc9(String ReasonAmount){
		try{
		WebElement verifyIneligibilityAmountWebE=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(excludeamnt7_xpath));
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
    public  boolean verifyIneligibileAgedpastduemntbbcavailabilitycreenunapprovbbc9(String ReasonAmount){
		try{
		WebElement verifyIneligibilityAmountWebE=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(agedpastamnt_xpath));
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
 
    public  boolean verifyIneligibilityreasonbbcavailabilityScreen(String ReasonData){
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
        

    	public  boolean verifyIneligibilityamntbbcavailabilitycreen(String ReasonAmount){
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
    
    public String BBCAvailabilitytHeader(String BBCAvailabilityHeader)
	{
	try{
		WebElement BBCAvailabilityHeaderWebEelement=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(BBCAvailabilityHeaderWebEelementHeader_xpath));
		BBCAvailabilityHeaderWebEelement.getText();
		
	}
	catch(Exception ex){
		
	}
	return BBCAvailabilityHeader;
	
	}
	 
    
    
    public boolean fundRequestedAmount()
	{
	try{
		WebElement fundRequestedAmountWebEelement=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(fundRequestedAmount_xpath));
		fundRequestedAmountWebEelement.isDisplayed();
		return true;
	}
	catch(Exception ex){
		return false;
	}
	}
    
    
    public boolean netBorrowingBaseAmount()
	{
	try{
		WebElement  netBorrowingBaseWebEelement=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(netBorrowingBaseAmount_xpath));
		netBorrowingBaseWebEelement.isDisplayed();
		return true;
	}
	catch(Exception ex){
		return false;
	}
	}

    public boolean ApproveBBCButtonVerify()
	{
	try{
		WebElement  netBorrowingBaseWebEelement=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(ApproveBBCButton_xpath));
		netBorrowingBaseWebEelement.isDisplayed();
		return true;
	}
	catch(Exception ex){
		return false;
	}
	}
    

    public boolean SendToApproverButtonVerify()
	{
	try{
		WebElement  netBorrowingBaseWebEelement=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(SendToApproverButton_xpath));
		netBorrowingBaseWebEelement.isDisplayed();
		return true;
	}
	catch(Exception ex){
		return false;
	}
	}
    
    
    public boolean BBCPrintButtonVerify()
	{
	try{
		WebElement  netBorrowingBaseWebEelement=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(BBCPrintButton_xpath));
		netBorrowingBaseWebEelement.isDisplayed();
		return true;
	}
	catch(Exception ex){
		return false;
	}
	}
    
    public boolean SkipBBCButtonVerify()
	{
	try{
		WebElement  netBorrowingBaseWebEelement=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(SkipBBCButton_xpath));
		netBorrowingBaseWebEelement.isDisplayed();
		return true;
	}
	catch(Exception ex){
		return false;
	}
	}
    
    public SignBBCPage ApproveBBCButtonClick()
	{
	try{
		WebElement  netBorrowingBaseWebEelement=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(ApproveBBCButton_xpath));
		netBorrowingBaseWebEelement.click();
		return new SignBBCPage(driver);
	}
	catch(Exception ex){
	
	}
	return null;
	}
    
    
    
    //Summary
    public boolean clickOnfirstPlus()
	{
		try{

			WebElement plusWebEelement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(firstPlus_xpath));
			plusWebEelement.click();
			//Thread.sleep(2000);
			
	return true;
		}
	catch (Exception ex) {
	}
	return false;

	}	
    
    
    public boolean  verifyPriorBalance(String priorBalance){
    	try {
    		WebElement priorBalanceWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(priorBalanceLabel_xpath));
    		WebElement priorAmountAmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(priorBalanceValue_xpath));
    		priorBalanceWebElement.isDisplayed();
    		String actual = priorAmountAmountWebElement.getText().trim();
    		if (actual.equals(priorBalance))
    			return true;
    		else
    			return false;

    	} catch (Exception e) {
    		return false;
    	}
    	
    	}
    
    public boolean  verifyNewSales(String newSales){
    	try {
    		WebElement displayWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(newSales_xpath));
    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(newSalesAmount_xpath));
    		displayWebElement.isDisplayed();
    		String actual = AmountWebElement.getText().trim();
    		if (actual.equals(newSales))
    			return true;
    		else
    			return false;

    	} catch (Exception e) {
    		return false;
    	}
    	
    	}
    
    public boolean  verifyNewCredits(String newCredits){
    	try {
    		WebElement displayWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(newCredits_xpath));
    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(newCreditsAmount_xpath));
    		displayWebElement.isDisplayed();
    		String actual = AmountWebElement.getText().trim();
    		if (actual.equals(newCredits))
    			return true;
    		else
    			return false;

    	} catch (Exception e) {
    		return false;
    	}
    	
    	}
    
    public boolean  verifyNewCashCollected(String newCashCollected){
    	try {
    		WebElement displayWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(newCashCollected_xpath));
    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(newCashCollectedAmount_xpath));
    		displayWebElement.isDisplayed();
    		String actual = AmountWebElement.getText().trim();
    		if (actual.equals(newCashCollected))
    			return true;
    		else
    			return false;

    	} catch (Exception e) {
    		return false;
    	}
    	
    	}
    
    public boolean  verifyNewAdjustments(String newAdjustments){
    	try {
    		WebElement displayWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(newAdjustment_xpath));
    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(newAdjustmentAmount_xpath));
    		displayWebElement.isDisplayed();
    		String actual = AmountWebElement.getText().trim();
    		if (actual.equals(newAdjustments))
    			return true;
    		else
    			return false;

    	} catch (Exception e) {
    		return false;
    	}
    	
    	}
    
    public boolean  verifyBBCAdjustment(String bBCAdjustment){
    	try {
    		WebElement displayWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(bbcAdjustment_xpath));
    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(bbcAdjustmentAmount_xpath));
    		displayWebElement.isDisplayed();
    		String actual = AmountWebElement.getText().trim();
    		if (actual.equals(bBCAdjustment))
    			return true;
    		else
    			return false;

    	} catch (Exception e) {
    		return false;
    	}
    	
    	}
    
    public boolean  verifyUnreconciled(String Unreconciled){
    	try {
    		WebElement displayWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(unreconciled_xpath));
    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(unreconciledAmount_xpath));
    		displayWebElement.isDisplayed();
    		String actual = AmountWebElement.getText().trim();
    		if (actual.equals(Unreconciled))
    			return true;
    		else
    			return false;

    	} catch (Exception e) {
    		return false;
    	}
    	
    	}
    
    public boolean  verifyEndingBalanceTotalAr(String endingBalanceTotalAR){
    	try {
    		WebElement displayWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(endingBallanceTotalAr_xpath));
    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(endingBallanceTotalArAmount_xpath));
    		displayWebElement.isDisplayed();
    		String actual = AmountWebElement.getText().trim();
    		if (actual.equals(endingBalanceTotalAR))
    			return true;
    		else
    			return false;

    	} catch (Exception e) {
    		return false;
    	}
    	
    	}
    
    public boolean  verifyCurrent(String current){
    	try {
    		WebElement displayWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(current_xpath));
    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(currentValue_xpath));
    		displayWebElement.isDisplayed();
    		String actual = AmountWebElement.getText().trim();
    		if (actual.equals(current))
    			return true;
    		else
    			return false;

    	} catch (Exception e) {
    		return false;
    	}
    	
    	}
    
    public boolean  verifyOver30(String Over30){
    	try {
    		WebElement displayWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(over30_xpath));
    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(over30Value_xpath));
    		displayWebElement.isDisplayed();
    		String actual = AmountWebElement.getText().trim();
    		if (actual.equals(Over30))
    			return true;
    		else
    			return false;

    	} catch (Exception e) {
    		return false;
    	}
    	
    	}
    
    public boolean  verifyOver60(String Over60){
    	try {
    		WebElement displayWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(over60_xpath));
    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(over60Value_xpath));
    		displayWebElement.isDisplayed();
    		String actual = AmountWebElement.getText().trim();
    		if (actual.equals(Over60))
    			return true;
    		else
    			return false;

    	} catch (Exception e) {
    		return false;
    	}
    	
    	}
    
    public boolean  verifyOver90(String Over90){
    	try {
    		WebElement displayWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(over90_xpath));
    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(over90Value_xpath));
    		displayWebElement.isDisplayed();
    		String actual = AmountWebElement.getText().trim();
    		if (actual.equals(Over90))
    			return true;
    		else
    			return false;

    	} catch (Exception e) {
    		return false;
    	}
    	
    	}
    
    public boolean  verifyOver120(String Over120){
    	try {
    		WebElement displayWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(over120_xpath));
    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(over120Value_xpath));
    		displayWebElement.isDisplayed();
    		String actual = AmountWebElement.getText().trim();
    		if (actual.equals(Over120))
    			return true;
    		else
    			return false;

    	} catch (Exception e) {
    		return false;
    	}
    	
    	}
    
    public boolean  verifyTotalAgedReceivables(String totalAgedReceivables){
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
    //kruthivas
    public boolean  verifyTotalAgedReceivables1(){
    	try {
    		WebElement displayWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(totalAgedReceivables_xpath));
    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(totalAgedReceivablesValue_xpath));
    		displayWebElement.isDisplayed();
    		String s=displayWebElement.getText();
    		System.out.println(s);
    		AmountWebElement.isDisplayed();
    		String s1=AmountWebElement.getText();
    		System.out.println(s1);
    		
    			

    	} catch (Exception e) {
    		return false;
    	}
    	return true;
    	}
    
    public boolean clickOnSecondPlus()
	{
		try{

			WebElement plusWebEelement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(secondPlus_xpath));
			plusWebEelement.click();
			//Thread.sleep(2000);
			
	return true;
		}
	catch (Exception ex) {
	}
	return false;

	}	
    public boolean  verifyIneligiblesValue(String ineligibleValue){
    	try {
    		WebElement displayWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(ineligiblesLabel_xpath));
    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(ineligiblesValue_xpath));
    		displayWebElement.isDisplayed();
    		String actual = AmountWebElement.getText().trim();
    		if (actual.equals(ineligibleValue))
    			return true;
    		else
    			return false;

    	} catch (Exception e) {
    		return false;
    	}
    	
    	}
  
    //rohit
    public boolean  verifyIneligiblesValue1(String ineligibleValue){
    	try {
    		WebElement displayWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(ineligiblesLabel_xpath));
    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(ineligiblesValue1_xpath));
    		displayWebElement.isDisplayed();
    		String actual = AmountWebElement.getText().trim();
    		if (actual.equals(ineligibleValue))
    			return true;
    		else
    			return false;

    	} catch (Exception e) {
    		return false;
    	}
    	
    	}
    
    

    public boolean  verifyARAgedPastDueDaysM(String  AgedPastDueDays){
    	try {
    		WebElement displayWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(agedPastDueDays_xpath));
    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(agedPastDueDaysValue_xpath));
    		displayWebElement.isDisplayed();
    		String actual = AmountWebElement.getText().trim();
    		if (actual.equals(AgedPastDueDays))
    			return true;
    		else
    			return false;

    	} catch (Exception e) {
    		return false;
    	}
    	
    	}
    
    public boolean  verifyEligibleAR(String EligibleAR){
    	try {
    		WebElement displayWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(eligbileAr_xpath));
    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(eligbileArValue_xpath));
    		displayWebElement.isDisplayed();
    		String actual = AmountWebElement.getText().trim();
    		if (actual.equals(EligibleAR))
    			return true;
    		/*else
    			return false;*/

    	} catch (Exception e) {
    		return false;
    	}
    	return true;
    	}

	// rohit
	public boolean verifyEligibleAR1(String EligibleAR) {
		try {
			WebElement displayWebElement = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(eligbileAr_xpath));
			WebElement AmountWebElement = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(eligbileArValue1_xpath));
			displayWebElement.isDisplayed();
			String actual = AmountWebElement.getText().trim();
			if (actual.equals(EligibleAR))
				return true;
			else
				return false;

		} catch (Exception e) {
			return false;
		}

	}
    
    public boolean  verifyAdvanceRate(String AdvanceRate){
    	try {
    		WebElement displayWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(advanceRate_xapth));
    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(advanceRateValue_xapth));
    		displayWebElement.isDisplayed();
    		String actual = AmountWebElement.getText().trim();
    		if (actual.equals(AdvanceRate))
    			return true;
    		else
    			return false;

    	} catch (Exception e) {
    		return false;
    	}
    	
    }
    
    //rohit
	public boolean verifyAdvanceRate1(String AdvanceRate) {
		try {
			WebElement displayWebElement = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(advanceRate_xapth));
			WebElement AmountWebElement = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(advanceRateValue1_xapth));
			displayWebElement.isDisplayed();
			String actual = AmountWebElement.getText().trim();
			if (actual.equals(AdvanceRate))
				return true;
			else
				return false;

		} catch (Exception e) {
			return false;
		}

	}
    

    
    public boolean  verifyARAvailable(String ARAvailable){
    	try {
    		WebElement displayWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(arAvailable_xpath));
    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(arAvailableValue_xpath));
    		displayWebElement.isDisplayed();
    		String actual = AmountWebElement.getText().trim();
    		if (actual.equals(ARAvailable))
    			return true;
    		/*else
    			return false;*/

    	} catch (Exception e) {
    		return false;
    	}
    	return true;
    }
    
	// rohit
	public boolean verifyARAvailable1(String ARAvailable) {
		try {
			WebElement displayWebElement = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(arAvailable_xpath));
			WebElement AmountWebElement = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(arAvailableValue1_xpath));
			displayWebElement.isDisplayed();
			String actual = AmountWebElement.getText().trim();
			if (actual.equals(ARAvailable))
				return true;
			else
				return false;

		} catch (Exception e) {
			return false;
		}

	}
    
    public boolean  verifyARReceivablesSublimit(String  ARReceivablesSublimit){
    	try {
    		WebElement displayWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(arReceivableSublimit_xpath));
    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(arReceivableSublimitValue_xpath));
    		displayWebElement.isDisplayed();
    		String actual = AmountWebElement.getText().trim();
    		if (actual.equals(ARReceivablesSublimit))
    			return true;
    		/*else
    			return false;*/

    	} catch (Exception e) {
    		return false;
    	}
    	return true;
    }
    
	// rohit
	public boolean verifyARReceivablesSublimit1(String ARReceivablesSublimit) {
		try {
			WebElement displayWebElement = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(arReceivableSublimit_xpath));
			WebElement AmountWebElement = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(arReceivableSublimitValue1_xpath));
			displayWebElement.isDisplayed();
			String actual = AmountWebElement.getText().trim();
			if (actual.equals(ARReceivablesSublimit))
				return true;
			else
				return false;

		} catch (Exception e) {
			return false;
		}

	}
    
    public boolean  verifyARBorrowingBase(String  ARBorrowingBase){
    	try {
    		WebElement displayWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(arBorrowingBase_xpath));
    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(arBorrowingBaseValue_xpath));
    		displayWebElement.isDisplayed();
    		String actual = AmountWebElement.getText().trim();
    		if (actual.equals(ARBorrowingBase))
    			return true;
    		else
    			return false;

    	} catch (Exception e) {
    		return false;
    	}
    	
    }
    
	// rohit
	public boolean verifyARBorrowingBase1(String ARBorrowingBase) {
		try {
			WebElement displayWebElement = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(arBorrowingBase_xpath));
			WebElement AmountWebElement = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(arBorrowingBaseValue1_xpath));
			displayWebElement.isDisplayed();
			String actual = AmountWebElement.getText().trim();
			if (actual.equals(ARBorrowingBase))
				return true;
			else
				return false;

		} catch (Exception e) {
			return false;
		}

	}

    public boolean  verifyARTotalSublimit(String  ARTotalSumlimit){
    	try {
    		WebElement displayWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(arTotalSublimit_xpath));
    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(arTotalSublimitValue_xpath));
    		displayWebElement.isDisplayed();
    		String actual = AmountWebElement.getText().trim();
    		if (actual.equals(ARTotalSumlimit))
    			return true;
    		else
    			return false;

    	} catch (Exception e) {
    		return false;
    	}
    	
    }
    
    public boolean  verifyARAvailableForAdvance(String  ARAvailableForAdvance){
    	try {
    		WebElement displayWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(arAvaialbleAdv_xpath));
    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(arAvaialbleAdvValue_xpath));
    		displayWebElement.isDisplayed();
    		String actual = AmountWebElement.getText().trim();
    		if (actual.equals(ARAvailableForAdvance))
    			return true;
    		/*else
    			return false;*/

    	} catch (Exception e) {
    		return false;
    	}
    	return true;
    }
    
	public boolean verifyARAvailableForAdvance1(String ARAvailableForAdvance) {
		try {
			WebElement displayWebElement = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(arAvaialbleAdv_xpath));
			WebElement AmountWebElement = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(arBorrowingBaseValue1_xpath));
			displayWebElement.isDisplayed();
			String actual = AmountWebElement.getText().trim();
			if (actual.equals(ARAvailableForAdvance))
				return true;
			else
				return false;

		} catch (Exception e) {
			return false;
		}

	}
    
    
    public boolean  verifyARReserves(String  ARReserves){
    	try {
    		WebElement displayWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(arReserve_xpath));
    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(arReserveValue_xpath));
    		displayWebElement.isDisplayed();
    		String actual = AmountWebElement.getText().trim();
    		if (actual.equals(ARReserves))
    			return true;
    		else
    			return false;

    	} catch (Exception e) {
    		return false;
    	}
    	
    }
    
	// rohit
	public boolean verifyARReserves1(String ARReserves) {
		try {
			WebElement displayWebElement = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(arReserve_xpath));
			WebElement AmountWebElement = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(arReserveValue1_xpath));
			displayWebElement.isDisplayed();
			String actual = AmountWebElement.getText().trim();
			if (actual.equals(ARReserves))
				return true;
			else
				return false;

		} catch (Exception e) {
			return false;
		}

	}
    
    
    public boolean  verifyNetARAvailableForAdvance	(String  NetARAvailableForAdvance){
    	try {
    		WebElement displayWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(netArAdvanceAvailable_xpath));
    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(netArAdvanceAvailableValue_xpath));
    		displayWebElement.isDisplayed();
    		String actual = AmountWebElement.getText().trim();
    		if (actual.equals(NetARAvailableForAdvance))
    			return true;
    		/*else
    			return false;*/

    	} catch (Exception e) {
    		return false;
    	}
    	return true;
    }
    
	// rohit
	public boolean verifyNetARAvailableForAdvance1(
			String NetARAvailableForAdvance) {
		try {
			WebElement displayWebElement = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(netArAdvanceAvailable_xpath));
			WebElement AmountWebElement = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(netArAdvanceAvailableValue1_xpath));
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
    
    
    public boolean scrollToView()
	{
		try{
			 WebElement actual1=new WebDriverWait(driver,10)
    		 .until(ExpectedConditions.visibilityOfElementLocated(inventoryBorrowingBase_xpath));
    		JavascriptExecutor jse1 = (JavascriptExecutor)driver;;
    		jse1.executeScript("arguments[0].scrollIntoView(true);", actual1);  		
	        //Thread.sleep(3000);
	        return true;
			
		}
		catch(Exception e){
			
		}
		return false;
		
		}
    
    public boolean scrollToViewElement()
	{
		try{
			 WebElement actual1=new WebDriverWait(driver,10)
    		 .until(ExpectedConditions.visibilityOfElementLocated(borrorwingBaseAvailability_xpath));
    		JavascriptExecutor jse1 = (JavascriptExecutor)driver;;
    		jse1.executeScript("arguments[0].scrollIntoView(true);", actual1);  		
	        //Thread.sleep(3000);
	        return true;
			
		}
		catch(Exception e){
			
		}
		return false;
		
		}
    
    
    public boolean  verifyInventoryAmount(String  InventoryAmount){
    	try {
    		WebElement displayWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(inventoryAmount_xpath));
    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(inventoryAmountValue_xpath));
    		displayWebElement.isDisplayed();
    		String actual = AmountWebElement.getText().trim();
    		if (actual.equals(InventoryAmount))
    			return true;
    		else
    			return false;

    	} catch (Exception e) {
    		return false;
    	}
    	
    }
    
    public boolean  verifyGrossInventoryAmount(String  InventoryAmount){
    	try {
    		Thread.sleep(500);
    		WebElement displayWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(inventoryAmount_xpath));
    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(inventoryGrossAmountValue_xpath));
    		displayWebElement.isDisplayed();
    		String actual = AmountWebElement.getText().trim();
    		if (actual.equals(InventoryAmount))
    			return true;
    		
    	} catch (Exception e) {
    		return false;
    	}
    	return true;
    }
    
    public boolean  verifyIneligible(String  Ineligible){
    	try {
    		WebElement displayWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(ineligibleInventory_xpath));
    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(ineligibleInventoryValue_xpath));
    		displayWebElement.isDisplayed();
    		String actual = AmountWebElement.getText().trim();
    		if (actual.equals(Ineligible))
    			return true;
    		else
    			return false;

    	} catch (Exception e) {
    		return false;
    	}
    	
    }
    
    public boolean  verifyEligible(String  eligible){
    	try {
    		WebElement displayWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(eligibleInv_xpath));
    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(eligibleInvValue_xpath));
    		displayWebElement.isDisplayed();
    		String actual = AmountWebElement.getText().trim();
    		if (actual.equals(eligible))
    			return true;
    		/*else
    			return false;*/

    	} catch (Exception e) {
    		return false;
    	}
    	return true;
    }
 //kruthivas
    
    public boolean  verifyEligibleAr(String  eligible){
    	try {
    		WebElement displayWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(eligibleInv1_xpath));
    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(eligibleInvValue1_xpath));
    		displayWebElement.isDisplayed();
    		String actual = AmountWebElement.getText().trim();
    		if (actual.equals(eligible))
    			return true;
    		/*else
    			return false;*/

    	} catch (Exception e) {
    		return false;
    	}
    	return true;
    }
    
    public boolean  verifyAdjustedAdvanceRate(String  AdjustedAdvanceRate){
    	try {
    		WebElement displayWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(adjustmentAdvan_xpath));
    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(adjustmentAdvanValue_xpath));
    		displayWebElement.isDisplayed();
    		String actual = AmountWebElement.getText().trim();
    		if (actual.equals(AdjustedAdvanceRate))
    			return true;
    		else
    			return false;

    	} catch (Exception e) {
    		return false;
    	}
    	
    }
    
    public boolean  verifyAvailable(String  Available){
    	try {
    		WebElement displayWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(availableInv_xpath));
    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(availableInvValue_xpath));
    		displayWebElement.isDisplayed();
    		String actual = AmountWebElement.getText().trim();
    		if (actual.equals(Available))
    			return true;
    		else
    			return false;

    	} catch (Exception e) {
    		return false;
    	}
    	
    }
    
    
    public boolean  verifyInventoryAvailable(String  Available){
    	try {
    		WebElement displayWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(availableInv_xpath));
    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(availableInvValue_xpath));
    		displayWebElement.isDisplayed();
    		String actual = AmountWebElement.getText().trim();
    		if (actual.equals(Available))
    			return true;
    		/*else
    			return false;*/

    	} catch (Exception e) {
    		return false;
    	}
    	return true;
    }
    
    public boolean  verifySublimit(String  Sublimit){
    	try {
    		
    		WebElement displayWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(sublimit_xpath));
    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(sublimitValue_xpath));
    		displayWebElement.isDisplayed();
    		String actual = AmountWebElement.getText().trim();
    		if (actual.equals(Sublimit))
    			return true;
    		/*else
    			return false;*/

    	} catch (Exception e) {
    		return false;
    	}
    	return true;
    }
    
    public boolean  verifyInventoryBorrowingBase(String  inventoryBorrowingBase){
    	try {
    		WebElement displayWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(inventoryBorrowingBase_xpath));
    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(inventoryBorrowingBaseValue_xpath));
    		displayWebElement.isDisplayed();
    		String actual = AmountWebElement.getText().trim();
    		if (actual.equals(inventoryBorrowingBase))
    			return true;
    		/*else
    			return false;*/

    	} catch (Exception e) {
    		return false;
    	}
    	return true;
    }
    
    public boolean  verifyInventoryAvailableForAdvance(String   InventoryAvailableForAdvance){
    	try {
    		WebElement displayWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(inventoryAvailableForAdvance_xpath));
    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(inventoryAvailableForAdvanceValue_xpath));
    		displayWebElement.isDisplayed();
    		String actual = AmountWebElement.getText().trim();
    		if (actual.equals(InventoryAvailableForAdvance))
    			return true;
    		else
    			return false;

    	} catch (Exception e) {
    		return false;
    	}
    	
    }
    
    public boolean  verifyInventoryReserve(String  InventoryReserve){
    	try {
    		WebElement displayWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(inventoryReserve_xpath));
    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(inventoryReserveValue_xpath));
    		displayWebElement.isDisplayed();
    		String actual = AmountWebElement.getText().trim();
    		if (actual.equals(InventoryReserve))
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
    
    
    public boolean  verifyOtherAmount(String  OtherAmount){
    	try {
    		WebElement displayWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(otherAmount_xpath));
    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(otherAmountValue_xpath));
    		displayWebElement.isDisplayed();
    		String actual = AmountWebElement.getText().trim();
    		if (actual.equals(OtherAmount))
    			return true;
    		else
    			return false;

    	} catch (Exception e) {
    		return false;
    	}
    	
    }
    
    public boolean  verifyOtherCollateral(String  OtherAmount){
    	try {
    		WebElement displayWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(otherAmount_xpath));
    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(otherCollateralValue_xpath));
    		displayWebElement.isDisplayed();
    		String actual = AmountWebElement.getText().trim();
    		if (actual.equals(OtherAmount))
    			return true;
    		

    	} catch (Exception e) {
    		return false;
    	}
    	return true;
    }
    
    public boolean  verifyIneligibleOther(String  Ineligible){
    	try {
    		WebElement displayWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(ineligible_xpath));
    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(ineligibleValue_xpath));
    		displayWebElement.isDisplayed();
    		String actual = AmountWebElement.getText().trim();
    		if (actual.equals(Ineligible))
    			return true;
    		else
    			return false;

    	} catch (Exception e) {
    		return false;
    	}
    	
    }
    
    public boolean  verifyEligibleOther(String  Eligible){
    	try {
    		WebElement displayWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(eligibleCollateral_xpath));
    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(eligibleCollateralValue_xpath));
    		displayWebElement.isDisplayed();
    		String actual = AmountWebElement.getText().trim();
    		if (actual.equals(Eligible))
    			return true;
    		else
    			return false;

    	} catch (Exception e) {
    		return false;
    	}
    	
    }
    
    public boolean  verifyEligibleCollateral(String  Eligible){
    	try {
    		WebElement displayWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(eligibleCollateral_xpath));
    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(eligibleCollateralAmount_xpath));
    		displayWebElement.isDisplayed();
    		String actual = AmountWebElement.getText().trim();
    		if (actual.equals(Eligible))
    			return true;
    		/*else
    			return false;*/

    	} catch (Exception e) {
    		return false;
    	}
    	return true;
    }
    
    public boolean  verifyAdvancRate(String  AdvanceRate){
    	try {
    		WebElement displayWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(advanceRateCollateral_xpath));
    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(advanceRateCollateralValue_xpath));
    		displayWebElement.isDisplayed();
    		String actual = AmountWebElement.getText().trim();
    		if (actual.equals(AdvanceRate))
    			return true;
    		else
    			return false;

    	} catch (Exception e) {
    		return false;
    	}
    	
    }
    
    public boolean  verifyAvailableOther(String  Available){
    	try {
    		WebElement displayWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(availableCollateral_xpath));
    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(availableCollateralValue_xpath));
    		displayWebElement.isDisplayed();
    		String actual = AmountWebElement.getText().trim();
    		if (actual.equals(Available))
    			return true;
    		else
    			return false;

    	} catch (Exception e) {
    		return false;
    	}
    	
    }
    
    public boolean  verifyAvailableCollateral(String  Available){
    	try {
    		WebElement displayWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(availableCollateral_xpath));
    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(availableCollateralAmount_xpath));
    		displayWebElement.isDisplayed();
    		String actual = AmountWebElement.getText().trim();
    		if (actual.equals(Available))
    			return true;
    		/*else
    			return false;*/

    	} catch (Exception e) {
    		return false;
    	}
    	return true;
    }
    
    public boolean  verifySublimitOther(String  sublimit){
    	try {
    		WebElement displayWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(sublimitCollateral_xpath));
    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(sublimitCollateralValue_xpath));
    		displayWebElement.isDisplayed();
    		String actual = AmountWebElement.getText().trim();
    		if (actual.equals(sublimit))
    			return true;
    		else
    			return false;

    	} catch (Exception e) {
    		return false;
    	}
    	
    }
    
    public boolean  verifyOtherCollateralBorrowingBase(String  OtherCollateralBorrowingBase){
    	try {
    		WebElement displayWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(otherCollateralBorrowingBase_xpath));
    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(otherCollateralBorrowingBaseValue_xpath));
    		displayWebElement.isDisplayed();
    		String actual = AmountWebElement.getText().trim();
    		if (actual.equals(OtherCollateralBorrowingBase))
    			return true;
    		else
    			return false;

    	} catch (Exception e) {
    		return false;
    	}
    	
    }
    
    
    public boolean  verifyCollateralSublimit(String  sublimit){
    	try {
    		WebElement displayWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(sublimitCollateral_xpath));
    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(sublimitCollateralAmount_xpath));
    		displayWebElement.isDisplayed();
    		String actual = AmountWebElement.getText().trim();
    		if (actual.equals(sublimit))
    			return true;
    		else
    			return false;

    	} catch (Exception e) {
    		return false;
    	}
    	
    }
    
    public boolean  verifyCollateralBorrowingBase(String  OtherCollateralBorrowingBase){
    	try {
    		WebElement displayWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(otherCollateralBorrowingBase_xpath));
    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(collateralBorrowingBaseValue_xpath));
    		displayWebElement.isDisplayed();
    		String actual = AmountWebElement.getText().trim();
    		if (actual.equals(OtherCollateralBorrowingBase))
    			return true;
    		else
    			return false;

    	} catch (Exception e) {
    		return false;
    	}
    	
    }
    
    public boolean  verifyOtherCollateralSublimit(String  OtherCollateralBorrowingBase){
    	try {
    		WebElement displayWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(otherCollateralSublimit_xpath));
    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(otherCollateralSublimitValue_xpath));
    		displayWebElement.isDisplayed();
    		String actual = AmountWebElement.getText().trim();
    		if (actual.equals(OtherCollateralBorrowingBase))
    			return true;
    		else
    			return false;

    	} catch (Exception e) {
    		return false;
    	}
    	
    }
    
    public boolean  verifyOtherAvailableForAdvance(String  OtherAvailableForAdvance){
    	try {
    		WebElement displayWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(otherAvailableForAdvance_xpath));
    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(otherAvailableForAdvanceValue_xpath));
    		displayWebElement.isDisplayed();
    		String actual = AmountWebElement.getText().trim();
    		if (actual.equals(OtherAvailableForAdvance))
    			return true;
    		else
    			return false;

    	} catch (Exception e) {
    		return false;
    	}
    	
    }
    
    public boolean  verifyOtherReserves(String  OtherReserves){
    	try {
    		WebElement displayWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(otherReserve_xpath));
    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(otherReserveValue_xpath));
    		displayWebElement.isDisplayed();
    		String actual = AmountWebElement.getText().trim();
    		if (actual.equals(OtherReserves))
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
    
    public boolean  verifyTotalCollateral(String  TotalCollateral){
    	try {
    		WebElement displayWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(totalCollateral_xpath));
    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(totalCollateralValue_xpath));
    		displayWebElement.isDisplayed();
    		String actual = AmountWebElement.getText().trim();
    		if (actual.equals(TotalCollateral))
    			return true;
    		else
    			return false;

    	} catch (Exception e) {
    		return false;
    	}
    	
    }
    
    public boolean  verifyTotalReserve(String  TotalReserve){
    	try {
    		WebElement displayWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(totalReserve_xpath));
    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(totalReserveValue_xpath));
    		displayWebElement.isDisplayed();
    		String actual = AmountWebElement.getText().trim();
    		if (actual.equals(TotalReserve))
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
    
    
    public boolean  verifyCommitment(String commitment){
    	try {
    		WebElement displayWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(commitment_xpath));
    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(commitmentValue_xpath));
    		displayWebElement.isDisplayed();
    		String actual = AmountWebElement.getText().trim();
    		if (actual.equals(commitment))
    			return true;
    		else
    			return false;

    	} catch (Exception e) {
    		return false;
    	}
    	
    }
    
    public boolean  verifyBorrorwingBaseAvailability(String  borrorwingBaseAvailability){
    	try {
    		WebElement displayWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(borrorwingBaseAvailability_xpath));
    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(borrorwingBaseAvailabilityValue_xpath));
    		displayWebElement.isDisplayed();
    		String actual = AmountWebElement.getText().trim();
    		if (actual.equals(borrorwingBaseAvailability))
    			return true;
    		else
    			return false;

    	} catch (Exception e) {
    		return false;
    	}
    	
    }
    
    public boolean  verifyFundRequested(String  fundRequested){
    	try {
    		WebElement displayWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(fundRequested_xpath));
    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(fundRequestedValue_xpath));
    		displayWebElement.isDisplayed();
    		String actual = AmountWebElement.getText().trim();
    		if (actual.equals(fundRequested))
    			return true;
    		else
    			return false;

    	} catch (Exception e) {
    		return false;
    	}
    	
    }
    
    public boolean  verifyNetBorrowingBaseAvailable(String  netBorrowingBaseAvailable){
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
    
    
    public boolean  verifyBbcDate(String BbcDate){
    	try {
    		WebElement bbcDateWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(bbcDate_xpath));
    		String actual = bbcDateWebElement.getText().trim();
    		if (actual.equals(BbcDate))
			return true;
		else
			return false;

	} catch (Exception e) {
		return false;
	}
	
}
    
    public boolean  verifyTotalAgedReceivablesReport(String  TotalAgedReceivables){
    	try {
    		WebElement displayWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(totalAgedReceivablesReport_xpath));
    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(totalAgedReceivablesValuesReport_xpath));
    		displayWebElement.isDisplayed();
    		String actual = AmountWebElement.getText().trim();
    		if (actual.equals(TotalAgedReceivables))
    			return true;
    		else
    			return false;

    	} catch (Exception e) {
    		return false;
    	}
    	
    }
    
    public boolean  verifyNetARAvailableForAdvanceReport(String  NetARAvailableForAdvance){
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
    
    public boolean  verifyNetInventoryAvailableForAdvanceReport(String  NetInventoryAvailableForAdvance){
    	try {
    		WebElement displayWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(netInventoryAvailableForAdvanceReport_xpath));
    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(netInventoryAvailableForAdvanceValueReport_xpath));
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
    
    public boolean  verifyNetOtherAvailableForAdvanceReport(String  NetOtherAvailableForAdvance){
    	try {
    		WebElement displayWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(netOtherAvailableForAdvanceReport_xpath));
    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(netOtherAvailableForAdvanceValueReport_xpath));
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
    
    public boolean  verifyborrorwingBaseAvailabilityReport(String  borrorwingBaseAvailability){
    	try {
    		WebElement displayWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(borrorwingBaseAvailabilityReport_xpath));
    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(borrorwingBaseAvailabilityValueReport_xpath));
    		displayWebElement.isDisplayed();
    		String actual = AmountWebElement.getText().trim();
    		if (actual.equals(borrorwingBaseAvailability))
    			return true;
    		else
    			return false;

    	} catch (Exception e) {
    		return false;
    	}
    	
    }
    
    public boolean  verifyfundRequestedReport(String  fundRequested){
    	try {
    		WebElement displayWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(fundRequestedReport_xpath));
    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(fundRequestedValueReport_xpath));
    		displayWebElement.isDisplayed();
    		String actual = AmountWebElement.getText().trim();
    		if (actual.equals(fundRequested))
    			return true;
    		else
    			return false;

    	} catch (Exception e) {
    		return false;
    	}
    	
    }
    
    public boolean  verifynetBorrowingBaseAvailableReport(String  netBorrowingBaseAvailable){
    	try {
    		WebElement displayWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(netBorrowingBaseAvailableReport_xpath));
    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(netBorrowingBaseAvailableValueReport_xpath));
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
    

    		
    public boolean clickOnBBCPrintButton(String  BorrowingBaseCertificateDate)
	{
	try{
		WebElement  netBorrowingBaseWebEelement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(BBCPrintButton_xpath));
		netBorrowingBaseWebEelement.click();

		Thread.sleep(2000);
		Set <String> handles =driver.getWindowHandles();
		Iterator<String> it = handles.iterator();
		//iterate through your windows
		while (it.hasNext()){
		String parent = it.next();
		String newwin = it.next();
		driver.switchTo().window(newwin);
		
		driver.findElement(By.xpath("//h2[text()='Borrowing Base Certificate "+BorrowingBaseCertificateDate +"']")).isDisplayed();
		System.out.println("Report header");
		
		}
		return true;
		}
		catch(Exception ex){
		return false;
		}}

    public boolean clickOnBBCPrintButton1()
	
    	{
    		try{
    			driver.switchTo().defaultContent();
    			return true;
    		}
    		catch(Exception ex){
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
    
    
    public boolean  verifySkipBBC(){
    	try {
    		WebElement bbcDateWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(SkipBBC_xpath));
    		bbcDateWebElement.isDisplayed();
    	
			return true;
		

	} catch (Exception e) {
		return false;
	}
    }
    	
    	public boolean ClickOnSkipBBC()
   	{
   	try{
   		WebElement WebEelement=new WebDriverWait(driver,10)
   			.until(ExpectedConditions.visibilityOfElementLocated(SkipBBC_xpath));
   		WebEelement.click();
   		Alert alert = driver.switchTo().alert();
   		alert.accept();
   		//Thread.sleep(5000);
   		/*Alert alert1 = driver.switchTo().alert();
   		alert1.accept(); 
   		//Thread.sleep(5000);*/
   		return true;
   	}
   	catch(Exception ex){
		return false;
   	}
   	}
    	
    	public boolean verifyMessageOnSkipBBCAfterSave()
	    {
	    try{
	       WebElement SaveSkipBBC=new WebDriverWait(driver,10)
	       .until(ExpectedConditions.visibilityOfElementLocated(skipMsg_xpath));
	       SaveSkipBBC.isDisplayed();

		return true;
	

} catch (Exception e) {
	return false;
}
}
    	
    	//
    	 public boolean  verifyIneligiblesValueM(String ineligibleValue){
    	    	try {
    	    		WebElement displayWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(ineligiblesLabell_xpath));
    	    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(ineligiblesValuee_xpath));
    	    		displayWebElement.isDisplayed();
    	    		String actual = AmountWebElement.getText().trim();
    	    		if (actual.equals(ineligibleValue))
    	    			return true;
    	    		else
    	    			return false;

    	    	} catch (Exception e) {
    	    		return false;
    	    	}
    	    	
    	    	}
    	    

    	    public boolean  verifyARAgedPastDueDays(String  AgedPastDueDays){
    	    	try {
    	    		WebElement displayWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(agedPastDueDays_xpath));
    	    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(agedPastDueDaysValuee_xpath));
    	    		displayWebElement.isDisplayed();
    	    		String actual = AmountWebElement.getText().trim();
    	    		if (actual.equals(AgedPastDueDays))
    	    			return true;
    	    		else
    	    			return false;

    	    	} catch (Exception e) {
    	    		return false;
    	    	}
    	    	
    	    	}
    	
	// rohit
	public boolean verifyARAgedPastDueDays1(String AgedPastDueDays) {
		try {
			WebElement displayWebElement = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(agedPastDueDays_xpath));
			WebElement AmountWebElement = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(agedPastDueDaysValue1_xpath));
			displayWebElement.isDisplayed();
			String actual = AmountWebElement.getText().trim();
			if (actual.equals(AgedPastDueDays))
				return true;
			else
				return false;

		} catch (Exception e) {
			return false;
		}

	}
    	    
    	    public boolean  verifyEligibleARM(String EligibleAR){
    	    	try {
    	    		WebElement displayWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(eligbileAr_xpath));
    	    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(eligbileArValuee_xpath));
    	    		displayWebElement.isDisplayed();
    	    		String actual = AmountWebElement.getText().trim();
    	    		if (actual.equals(EligibleAR))
    	    			return true;
    	    		else
    	    			return false;

    	    	} catch (Exception e) {
    	    		return false;
    	    	}
    	    	
    	    	}

    	    public boolean  verifyAdvanceRateM(String AdvanceRate){
    	    	try {
    	    		WebElement displayWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(advanceRate_xapth));
    	    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(advanceRateValuee_xapth));
    	    		displayWebElement.isDisplayed();
    	    		String actual = AmountWebElement.getText().trim();
    	    		if (actual.equals(AdvanceRate))
    	    			return true;
    	    		else
    	    			return false;

    	    	} catch (Exception e) {
    	    		return false;
    	    	}
    	    	
    	    }

    	    
    	    public boolean  verifyARAvailableM(String ARAvailable){
    	    	try {
    	    		WebElement displayWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(arAvailable_xpath));
    	    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(arAvailableValuee_xpath));
    	    		displayWebElement.isDisplayed();
    	    		String actual = AmountWebElement.getText().trim();
    	    		if (actual.equals(ARAvailable))
    	    			return true;
    	    		else
    	    			return false;

    	    	} catch (Exception e) {
    	    		return false;
    	    	}
    	    	
    	    }
    	    
    	    public boolean  verifyARReceivablesSublimitM(String  ARReceivablesSublimit){
    	    	try {
    	    		WebElement displayWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(arReceivableSublimit_xpath));
    	    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(arReceivableSublimitValuee_xpath));
    	    		displayWebElement.isDisplayed();
    	    		String actual = AmountWebElement.getText().trim();
    	    		if (actual.equals(ARReceivablesSublimit))
    	    			return true;
    	    		else
    	    			return false;

    	    	} catch (Exception e) {
    	    		return false;
    	    	}
    	    	
    	    }
    	    public boolean  verifyARBorrowingBaseM(String  ARBorrowingBase){
    	    	try {
    	    		WebElement displayWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(arBorrowingBase_xpath));
    	    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(arBorrowingBaseValuee_xpath));
    	    		displayWebElement.isDisplayed();
    	    		String actual = AmountWebElement.getText().trim();
    	    		if (actual.equals(ARBorrowingBase))
    	    			return true;
    	    		else
    	    			return false;

    	    	} catch (Exception e) {
    	    		return false;
    	    	}
    	    	
    	    }
    	    
    	    public boolean  verifyARAvailableForAdvanceM(String  ARAvailableForAdvance){
    	    	try {
    	    		WebElement displayWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(arAvaialbleAdv_xpath));
    	    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(arAvaialbleAdvValuee_xpath));
    	    		displayWebElement.isDisplayed();
    	    		String actual = AmountWebElement.getText().trim();
    	    		if (actual.equals(ARAvailableForAdvance))
    	    			return true;
    	    		else
    	    			return false;

    	    	} catch (Exception e) {
    	    		return false;
    	    	}
    	    	
    	    }
    	    
    	    public boolean  verifyARReservesM(String  ARReserves){
    	    	try {
    	    		WebElement displayWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(arReserve_xpath));
    	    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(arReserveValuee_xpath));
    	    		displayWebElement.isDisplayed();
    	    		String actual = AmountWebElement.getText().trim();
    	    		if (actual.equals(ARReserves))
    	    			return true;
    	    		else
    	    			return false;

    	    	} catch (Exception e) {
    	    		return false;
    	    	}
    	    	
    	    }
    	    
    	    public boolean  verifyNetARAvailableForAdvanceM(String  NetARAvailableForAdvance){
    	    	try {
    	    		WebElement displayWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(netArAdvanceAvailable_xpath));
    	    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(netArAdvanceAvailableValuee_xpath));
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


//
    	    public boolean  verifyInventoryAmountt(String  InventoryAmount){
    	    	try {
    	    		WebElement displayWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(inventoryAmount_xpath));
    	    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(inventoryAmountValueM_xpath));
    	    		displayWebElement.isDisplayed();
    	    		String actual = AmountWebElement.getText().trim();
    	    		if (actual.equals(InventoryAmount))
    	    			return true;
    	    		else
    	    			return false;

    	    	} catch (Exception e) {
    	    		return false;
    	    	}
    	    	
    	    }

    	    public boolean  verifyIneligiblet(String  Ineligible){
    	    	try {
    	    		WebElement displayWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(ineligibleInventory_xpath));
    	    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(ineligibleInventoryValueM_xpath));
    	    		displayWebElement.isDisplayed();
    	    		String actual = AmountWebElement.getText().trim();
    	    		if (actual.equals(Ineligible))
    	    			return true;
    	    		else
    	    			return false;

    	    	} catch (Exception e) {
    	    		return false;
    	    	}
    	    	
    	    }
    	    public boolean  verifyEligibleM(String  eligible){
    	    	try {
    	    		WebElement displayWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(eligibleInv_xpath));
    	    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(eligibleInvValueM_xpath));
    	    		displayWebElement.isDisplayed();
    	    		String actual = AmountWebElement.getText().trim();
    	    		if (actual.equals(eligible))
    	    			return true;
    	    		else
    	    			return false;

    	    	} catch (Exception e) {
    	    		return false;
    	    	}
    	    	
    	    }
    	    public boolean  verifyAdjustedAdvanceRateM(String  AdjustedAdvanceRate){
    	    	try {
    	    		WebElement displayWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(adjustmentAdvan_xpath));
    	    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(adjustmentAdvanValueM_xpath));
    	    		displayWebElement.isDisplayed();
    	    		String actual = AmountWebElement.getText().trim();
    	    		if (actual.equals(AdjustedAdvanceRate))
    	    			return true;
    	    		else
    	    			return false;

    	    	} catch (Exception e) {
    	    		return false;
    	    	}
    	    	
    	    }
    	    
    	    public boolean  verifyAvailableM(String  Available){
    	    	try {
    	    		WebElement displayWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(availableInv_xpath));
    	    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(availableInvValueM_xpath));
    	    		displayWebElement.isDisplayed();
    	    		String actual = AmountWebElement.getText().trim();
    	    		if (actual.equals(Available))
    	    			return true;
    	    		else
    	    			return false;

    	    	} catch (Exception e) {
    	    		return false;
    	    	}
    	    	
    	    }
    	    
    	    public boolean  verifySublimitM(String  Sublimit){
    	    	try {
    	    		
    	    		WebElement displayWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(sublimit_xpath));
    	    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(sublimitValueM_xpath));
    	    		displayWebElement.isDisplayed();
    	    		String actual = AmountWebElement.getText().trim();
    	    		if (actual.equals(Sublimit))
    	    			return true;
    	    		else
    	    			return false;

    	    	} catch (Exception e) {
    	    		return false;
    	    	}
    	    	
    	    }
    	    
    	    public boolean  verifyInventoryBorrowingBaseM(String  inventoryBorrowingBase){
    	    	try {
    	    		WebElement displayWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(inventoryBorrowingBase_xpath));
    	    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(inventoryBorrowingBaseValueM_xpath));
    	    		displayWebElement.isDisplayed();
    	    		String actual = AmountWebElement.getText().trim();
    	    		if (actual.equals(inventoryBorrowingBase))
    	    			return true;
    	    		else
    	    			return false;

    	    	} catch (Exception e) {
    	    		return false;
    	    	}
    	    	
    	    }
    	    
    	    public boolean  verifyInventoryAvailableForAdvanceM(String   InventoryAvailableForAdvance){
    	    	try {
    	    		WebElement displayWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(inventoryAvailableForAdvance_xpath));
    	    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(inventoryAvailableForAdvanceValueM_xpath));
    	    		displayWebElement.isDisplayed();
    	    		String actual = AmountWebElement.getText().trim();
    	    		if (actual.equals(InventoryAvailableForAdvance))
    	    			return true;
    	    		else
    	    			return false;

    	    	} catch (Exception e) {
    	    		return false;
    	    	}
    	    	
    	    }
    	    public boolean  verifyInventoryReserveM(String  InventoryReserve){
    	    	try {
    	    		WebElement displayWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(inventoryReserve_xpath));
    	    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(inventoryReserveValueM_xpath));
    	    		displayWebElement.isDisplayed();
    	    		String actual = AmountWebElement.getText().trim();
    	    		if (actual.equals(InventoryReserve))
    	    			return true;
    	    		else
    	    			return false;

    	    	} catch (Exception e) {
    	    		return false;
    	    	}
    	    	
    	    }
    	    
    	    public boolean  verifyNetInventoryAvailableForAdvanceM(String  NetInventoryAvailableForAdvance){
    	    	try {
    	    		WebElement displayWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(netInventoryAvailableForAdvance_xpath));
    	    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(netInventoryAvailableForAdvanceValueM_xpath));
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
    	    
    	    public boolean scrollToViewM()
    		{
    			try{
    				 WebElement actual1=new WebDriverWait(driver,10)
    	    		 .until(ExpectedConditions.visibilityOfElementLocated(inventoryAmount_xpath));
    	    		JavascriptExecutor jse1 = (JavascriptExecutor)driver;;
    	    		jse1.executeScript("arguments[0].scrollIntoView(true);", actual1);  		
    		        //Thread.sleep(3000);
    		        return true;
    				
    			}
    			catch(Exception e){
    				
    			}
    			return false;
    			
    			}
    	    
    	    public boolean  verifyOtherAmountT(String  OtherAmount){
    	    	try {
    	    		WebElement displayWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(otherAmount_xpath));
    	    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(otherAmountValueT_xpath));
    	    		displayWebElement.isDisplayed();
    	    		String actual = AmountWebElement.getText().trim();
    	    		if (actual.equals(OtherAmount))
    	    			return true;
    	    		else
    	    			return false;

    	    	} catch (Exception e) {
    	    		return false;
    	    	}
    	    	
    	    }
    	    public boolean  verifyIneligibleOtherT(String  Ineligible){
    	    	try {
    	    		WebElement displayWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(ineligible_xpath));
    	    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(ineligibleValueT_xpath));
    	    		displayWebElement.isDisplayed();
    	    		String actual = AmountWebElement.getText().trim();
    	    		if (actual.equals(Ineligible))
    	    			return true;
    	    		else
    	    			return false;

    	    	} catch (Exception e) {
    	    		return false;
    	    	}
    	    	
    	    }
    	    public boolean  verifyEligibleOtherT(String  Eligible){
    	    	try {
    	    		WebElement displayWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(eligibleCollateral_xpath));
    	    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(eligibleCollateralValueT_xpath));
    	    		displayWebElement.isDisplayed();
    	    		String actual = AmountWebElement.getText().trim();
    	    		if (actual.equals(Eligible))
    	    			return true;
    	    		else
    	    			return false;

    	    	} catch (Exception e) {
    	    		return false;
    	    	}
    	    	
    	    }
    	    
    	    public boolean  verifyAdvancRateT(String  AdvanceRate){
    	    	try {
    	    		WebElement displayWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(advanceRateCollateral_xpath));
    	    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(advanceRateCollateralValueT_xpath));
    	    		displayWebElement.isDisplayed();
    	    		String actual = AmountWebElement.getText().trim();
    	    		if (actual.equals(AdvanceRate))
    	    			return true;
    	    		else
    	    			return false;

    	    	} catch (Exception e) {
    	    		return false;
    	    	}
    	    	
    	    }
    	    
    	    public boolean  verifyAvailableOtherT(String  Available){
    	    	try {
    	    		WebElement displayWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(availableCollateral_xpath));
    	    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(availableCollateralValueT_xpath));
    	    		displayWebElement.isDisplayed();
    	    		String actual = AmountWebElement.getText().trim();
    	    		if (actual.equals(Available))
    	    			return true;
    	    		else
    	    			return false;

    	    	} catch (Exception e) {
    	    		return false;
    	    	}
    	    	
    	    }
    	    
    	    public boolean  verifySublimitOtherT(String  sublimit){
    	    	try {
    	    		WebElement displayWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(sublimitCollateral_xpath));
    	    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(sublimitCollateralValueT_xpath));
    	    		displayWebElement.isDisplayed();
    	    		String actual = AmountWebElement.getText().trim();
    	    		if (actual.equals(sublimit))
    	    			return true;
    	    		else
    	    			return false;

    	    	} catch (Exception e) {
    	    		return false;
    	    	}
    	    	
    	    }
    	    
    	    public boolean  verifyOtherCollateralBorrowingBaseT(String  OtherCollateralBorrowingBase){
    	    	try {
    	    		WebElement displayWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(otherCollateralBorrowingBase_xpath));
    	    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(otherCollateralBorrowingBaseValueT_xpath));
    	    		displayWebElement.isDisplayed();
    	    		String actual = AmountWebElement.getText().trim();
    	    		if (actual.equals(OtherCollateralBorrowingBase))
    	    			return true;
    	    		else
    	    			return false;

    	    	} catch (Exception e) {
    	    		return false;
    	    	}
    	    	
    	    }
    	    
    	    public boolean  verifyOtherAvailableForAdvanceT(String  OtherAvailableForAdvance){
    	    	try {
    	    		WebElement displayWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(otherAvailableForAdvance_xpath));
    	    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(otherAvailableForAdvanceValueT_xpath));
    	    		displayWebElement.isDisplayed();
    	    		String actual = AmountWebElement.getText().trim();
    	    		if (actual.equals(OtherAvailableForAdvance))
    	    			return true;
    	    		else
    	    			return false;

    	    	} catch (Exception e) {
    	    		return false;
    	    	}
    	    	
    	    }
    	    
    	    public boolean  verifyOtherReservesT(String  OtherReserves){
    	    	try {
    	    		WebElement displayWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(otherReserve_xpath));
    	    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(otherReserveValueT_xpath));
    	    		displayWebElement.isDisplayed();
    	    		String actual = AmountWebElement.getText().trim();
    	    		if (actual.equals(OtherReserves))
    	    			return true;
    	    		else
    	    			return false;

    	    	} catch (Exception e) {
    	    		return false;
    	    	}
    	    	
    	    }
    	    public boolean  verifyNetOtherAvailableForAdvanceT(String  NetOtherAvailableForAdvance){
    	    	try {
    	    		WebElement displayWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(netOtherAvailableForAdvance_xpath));
    	    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(netOtherAvailableForAdvanceValueT_xpath));
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
    	    
    	    public boolean scrollToViewOtherCollateral()
    		{
    			try{
    				 WebElement actual1=new WebDriverWait(driver,10)
    	    		 .until(ExpectedConditions.visibilityOfElementLocated(otherAmount_xpath));
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
    	    public boolean  verifyTotalCollateralT(String  TotalCollateral){
        	try {
        		WebElement displayWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(totalCollateral_xpath));
        		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(totalCollateralValueT_xpath));
        		displayWebElement.isDisplayed();
        		String actual = AmountWebElement.getText().trim();
        		if (actual.equals(TotalCollateral))
        			return true;
        		else
        			return false;

        	} catch (Exception e) {
        		return false;
        	}
        	
        }
        
        public boolean  verifyTotalReserveT(String  TotalReserve){
        	try {
        		WebElement displayWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(totalReserve_xpath));
        		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(totalReserveValueT_xpath));
        		displayWebElement.isDisplayed();
        		String actual = AmountWebElement.getText().trim();
        		if (actual.equals(TotalReserve))
        			return true;
        		else
        			return false;

        	} catch (Exception e) {
        		return false;
        	}
        	
        }
        
        public boolean  verifyTotalAvailableForAdvanceT(String  TotalAvailableForAdvance){
        	try {
        		WebElement displayWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(totalAvailableForAdvance_xpath));
        		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(totalAvailableForAdvanceValueT_xpath));
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
        
        public boolean  verifyFutureT(String future){
        	try {
        		WebElement displayWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(futureDisplayT_xpath));
        		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(futureValueT_xpath));
        		displayWebElement.isDisplayed();
        		String actual = AmountWebElement.getText().trim();
        		if (actual.equals(future))
        			return true;
        		else
        			return false;

        	} catch (Exception e) {
        		return false;
        	}
        	
        	}
        
        public boolean  verifyCurrentT(String current){
        	try {
        		WebElement displayWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(current_xpath));
        		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(currentValueT_xpath));
        		displayWebElement.isDisplayed();
        		String actual = AmountWebElement.getText().trim();
        		if (actual.equals(current))
        			return true;
        		else
        			return false;

        	} catch (Exception e) {
        		return false;
        	}
        	
        	}
        
        public boolean  verifyOver30T(String Over30){
        	try {
        		WebElement displayWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(over30_xpath));
        		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(over30ValueT_xpath));
        		displayWebElement.isDisplayed();
        		String actual = AmountWebElement.getText().trim();
        		if (actual.equals(Over30))
        			return true;
        		else
        			return false;

        	} catch (Exception e) {
        		return false;
        	}
        	
        	}
        
        public boolean  verifyOver60T(String Over60){
        	try {
        		WebElement displayWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(over60_xpath));
        		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(over60ValueT_xpath));
        		displayWebElement.isDisplayed();
        		String actual = AmountWebElement.getText().trim();
        		if (actual.equals(Over60))
        			return true;
        		else
        			return false;

        	} catch (Exception e) {
        		return false;
        	}
        	
        	}
        public boolean  verifyOver90T(String Over90){
        	try {
        		WebElement displayWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(over90_xpath));
        		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(over90ValueT_xpath));
        		displayWebElement.isDisplayed();
        		String actual = AmountWebElement.getText().trim();
        		if (actual.equals(Over90))
        			return true;
        		else
        			return false;

        	} catch (Exception e) {
        		return false;
        	}
        	
        	}
        
        public boolean  verifyOver120T(String Over120){
        	try {
        		WebElement displayWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(over120_xpath));
        		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(over120ValueT_xpath));
        		displayWebElement.isDisplayed();
        		String actual = AmountWebElement.getText().trim();
        		if (actual.equals(Over120))
        			return true;
        		else
        			return false;

        	} catch (Exception e) {
        		return false;
        	}
        	
        	}
        
        public boolean  verifyTotalAgedReceivablesT(String totalAgedReceivables){
        	try {
        		WebElement displayWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(totalAgedReceivables_xpath));
        		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(totalAgedReceivablesValueT_xpath));
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
        
        public boolean  verifyBorrorwingBaseAvailabilityM(String  borrorwingBaseAvailability){
        	try {
        		WebElement displayWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(borrorwingBaseAvailability_xpath));
        		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(borrorwingBaseAvailabilityValueT_xpath));
        		displayWebElement.isDisplayed();
        		String actual = AmountWebElement.getText().trim();
        		if (actual.equals(borrorwingBaseAvailability))
        			return true;
        		else
        			return false;

        	} catch (Exception e) {
        		return false;
        	}
        	
        }
        
        public boolean  verifyFundRequestedM(String  fundRequested){
        	try {
        		WebElement displayWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(fundRequested_xpath));
        		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(fundRequestedValueT_xpath));
        		displayWebElement.isDisplayed();
        		String actual = AmountWebElement.getText().trim();
        		if (actual.equals(fundRequested))
        			return true;
        		else
        			return false;

        	} catch (Exception e) {
        		return false;
        	}
        	
        }
        
        public boolean  verifyNetBorrowingBaseAvailableM(String  netBorrowingBaseAvailable){
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
        public boolean  verifyTotalAgedReceivablesReportM(String  TotalAgedReceivables){
        	try {
        		WebElement displayWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(totalAgedReceivablesReport_xpath));
        		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(totalAgedReceivablesValuesReportM_xpath));
        		displayWebElement.isDisplayed();
        		String actual = AmountWebElement.getText().trim();
        		if (actual.equals(TotalAgedReceivables))
        			return true;
        		else
        			return false;

        	} catch (Exception e) {
        		return false;
        	}
        	
        }
        
        public boolean  verifyNetARAvailableForAdvanceReportM(String  NetARAvailableForAdvance){
        	try {
        		WebElement displayWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(netARAvailableForAdvance_xpath));
        		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(netARAvailableForAdvanceValueM_xpath));
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
        
        public boolean  verifyNetInventoryAvailableForAdvanceReportM(String  NetInventoryAvailableForAdvance){
        	try {
        		WebElement displayWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(netInventoryAvailableForAdvanceReport_xpath));
        		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(netInventoryAvailableForAdvanceValueReportM_xpath));
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
        
        
        public boolean  verifyNetOtherAvailableForAdvanceReportM(String  NetOtherAvailableForAdvance){
        	try {
        		WebElement displayWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(netOtherAvailableForAdvanceReport_xpath));
        		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(netOtherAvailableForAdvanceValueReportM_xpath));
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
        
        public boolean  verifyborrorwingBaseAvailabilityReportM(String  borrorwingBaseAvailability){
        	try {
        		WebElement displayWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(borrorwingBaseAvailabilityReport_xpath));
        		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(borrorwingBaseAvailabilityValueReportM_xpath));
        		displayWebElement.isDisplayed();
        		String actual = AmountWebElement.getText().trim();
        		if (actual.equals(borrorwingBaseAvailability))
        			return true;
        		else
        			return false;

        	} catch (Exception e) {
        		return false;
        	}
        	
        }
        
        public boolean  verifyfundRequestedReportM(String  fundRequested){
        	try {
        		WebElement displayWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(fundRequestedReport_xpath));
        		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(fundRequestedValueReportM_xpath));
        		displayWebElement.isDisplayed();
        		String actual = AmountWebElement.getText().trim();
        		if (actual.equals(fundRequested))
        			return true;
        		else
        			return false;

        	} catch (Exception e) {
        		return false;
        	}
        	
        }
        
        public boolean  verifynetBorrowingBaseAvailableReportM(String  netBorrowingBaseAvailable){
        	try {
        		WebElement displayWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(netBorrowingBaseAvailableReport_xpath));
        		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(netBorrowingBaseAvailableValueReportM_xpath));
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
        

        public boolean  verifyARReliance(String ARReliance){
        	try {
        		WebElement displayWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(ARReliance_xpath));
        		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(ARRelianceValue_xpath));
        		displayWebElement.isDisplayed();
        		String actual = AmountWebElement.getText().trim();
        		if (actual.equals(ARReliance))
        			return true;
        		else
        			return false;

        	} catch (Exception e) {
        		return false;
        	}

        	
        	}

        //anusha(mul div)
        public boolean  verifyPriorBalanceForMulDiv(String priorBalance){
        	try {
        		WebElement priorBalanceWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(priorBalanceLabel_xpath));
        		WebElement priorAmountAmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(priorBalanceValueForMulDiv_xpath));
        		priorBalanceWebElement.isDisplayed();
        		String actual = priorAmountAmountWebElement.getText().trim();
        		if (actual.equals(priorBalance))
        			return true;
        		else
        			return false;

        	} catch (Exception e) {
        		return false;
        	}
        	
        	}

        public boolean  verifyNewSalesForMulDiv(String newSales){
        	try {
        		WebElement displayWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(newSales_xpath));
        		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(newSalesAmountForMulDiv_xpath));
        		displayWebElement.isDisplayed();
        		String actual = AmountWebElement.getText().trim();
        		if (actual.equals(newSales))
        			return true;
        		else
        			return false;

        	} catch (Exception e) {
        		return false;
        	}
        	
        	}
        public boolean  verifyNewCreditsForMulDiv(String newCredits){
        	try {
        		WebElement displayWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(newCredits_xpath));
        		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(newCreditsAmountForMulDiv_xpath));
        		displayWebElement.isDisplayed();
        		String actual = AmountWebElement.getText().trim();
        		if (actual.equals(newCredits))

        			return true;
        		else
        			return false;

        	} catch (Exception e) {
        		return false;
        	}

        	
        	}
        public boolean  verifyNewCashCollectedForMulDiv(String newCashCollected){
        	try {
        		WebElement displayWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(newCashCollected_xpath));
        		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(newCashCollectedAmountForMulDiv_xpath));
        		displayWebElement.isDisplayed();
        		String actual = AmountWebElement.getText().trim();
        		if (actual.equals(newCashCollected))
        			return true;
        		else
        			return false;

        	} catch (Exception e) {
        		return false;
        	}
        	
        	}
        
        public boolean  verifyNewAdjustmentsForMulDiv(String newAdjustments){
        	try {
        		WebElement displayWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(newAdjustment_xpath));
        		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(newAdjustmentAmountForMulDiv_xpath));
        		displayWebElement.isDisplayed();
        		String actual = AmountWebElement.getText().trim();
        		if (actual.equals(newAdjustments))
        			return true;
        		else
        			return false;

        	} catch (Exception e) {
        		return false;
        	}
        	
        	}
        public boolean  verifyBBCAdjustmentForMulDiv(String bBCAdjustment){
        	try {
        		WebElement displayWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(bbcAdjustment_xpath));
        		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(bbcAdjustmentAmountForMulDiv_xpath));
        		displayWebElement.isDisplayed();
        		String actual = AmountWebElement.getText().trim();
        		if (actual.equals(bBCAdjustment))
        			return true;
        		else
        			return false;

        	} catch (Exception e) {
        		return false;
        	}
        	
        	}
        public boolean  verifyUnreconciledForMulDiv(String Unreconciled){
        	try {
        		WebElement displayWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(unreconciled_xpath));
        		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(unreconciledAmountForMulDiv_xpath));
        		displayWebElement.isDisplayed();
        		String actual = AmountWebElement.getText().trim();
        		if (actual.equals(Unreconciled))
        			return true;
        		else
        			return false;

        	} catch (Exception e) {
        		return false;
        	}
        	
        	}
        public boolean  verifyEndingBalanceTotalArForMulDiv(String endingBalanceTotalAR){
        	try {
        		WebElement displayWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(endingBallanceTotalAr_xpath));
        		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(endingBallanceTotalArAmountForMulDiv_xpath));
        		displayWebElement.isDisplayed();
        		String actual = AmountWebElement.getText().trim();
        		if (actual.equals(endingBalanceTotalAR))
        			return true;
        		else
        			return false;

        	} catch (Exception e) {
        		return false;
        	}
        	
        	}
        public boolean  verifyFutureForMulDiv(String future){
        	try {
        		WebElement displayWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(futureDisplayT_xpath));
        		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(futureValueForMulDiv_xpath));
        		displayWebElement.isDisplayed();
        		String actual = AmountWebElement.getText().trim();
        		if (actual.equals(future))
        			return true;
        		else
        			return false;

        	} catch (Exception e) {
        		return false;
        	}
        	
        	}
        
        public boolean  verifyCurrentForMulDiv(String current){
        	try {
        		WebElement displayWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(current_xpath));
        		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(currentValueForMulDiv_xpath));
        		displayWebElement.isDisplayed();
        		String actual = AmountWebElement.getText().trim();
        		if (actual.equals(current))
        			return true;
        		else
        			return false;

        	} catch (Exception e) {
        		return false;
        	}
        	
        	}
        
        public boolean  verifyOver30ForMulDiv(String Over30){
        	try {
        		WebElement displayWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(over30_xpath));
        		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(over30ValueForMulDiv_xpath));
        		displayWebElement.isDisplayed();
        		String actual = AmountWebElement.getText().trim();
        		if (actual.equals(Over30))
        			return true;
        		else
        			return false;

        	} catch (Exception e) {
        		return false;
        	}
        	
        	}
        
        public boolean  verifyOver60ForMulDiv(String Over60){
        	try {
        		WebElement displayWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(over60_xpath));
        		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(over60ValueForMulDiv_xpath));
        		displayWebElement.isDisplayed();
        		String actual = AmountWebElement.getText().trim();
        		if (actual.equals(Over60))
        			return true;
        		else
        			return false;

        	} catch (Exception e) {
        		return false;
        	}
        	
        	}
        public boolean  verifyOver90ForMulDiv(String Over90){
        	try {
        		WebElement displayWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(over90_xpath));
        		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(over90ValueForMulDiv_xpath));
        		displayWebElement.isDisplayed();
        		String actual = AmountWebElement.getText().trim();
        		if (actual.equals(Over90))
        			return true;
        		else
        			return false;

        	} catch (Exception e) {
        		return false;
        	}
        	
        	}
        
        public boolean  verifyOver120ForMulDiv(String Over120){
        	try {
        		WebElement displayWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(over120_xpath));
        		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(over120ValueForMulDiv_xpath));
        		displayWebElement.isDisplayed();
        		String actual = AmountWebElement.getText().trim();
        		if (actual.equals(Over120))
        			return true;
        		else
        			return false;

        	} catch (Exception e) {
        		return false;
        	}
        	
        	}
        public boolean  verifyTotalAgedReceivablesForMulDiv(String totalAgedReceivables){
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
        

   

   	 public boolean  verifyIneligiblesValueForMulDiv(String ineligibleValue){
   	    	try {
   	    		WebElement displayWebElement = new WebDriverWait(driver, 100).until(ExpectedConditions.visibilityOfElementLocated(ineligiblesLabell_xpath));
   	    		WebElement AmountWebElement = new WebDriverWait(driver, 100).until(ExpectedConditions.visibilityOfElementLocated(ineligiblesValueeForMulDiv_xpath));
   	    		displayWebElement.isDisplayed();
   	    		String actual = AmountWebElement.getText().trim();
   	    		if (actual.equals(ineligibleValue))
   	    			return true;
   	    		else
   	    			return false;

   	    	} catch (Exception e) {
   	    		return false;
   	    	}
   	    	
   	    	}
   	    

   	    public boolean  verifyARAgedPastDueDaysForMulDiv(String  AgedPastDueDays){
   	    	try {
   	    		WebElement displayWebElement = new WebDriverWait(driver, 100).until(ExpectedConditions.visibilityOfElementLocated(agedPastDueDays_xpath));
   	    		WebElement AmountWebElement = new WebDriverWait(driver, 100).until(ExpectedConditions.visibilityOfElementLocated(agedPastDueDaysValueeForMulDiv_xpath));
   	    		displayWebElement.isDisplayed();
   	    		String actual = AmountWebElement.getText().trim();
   	    		if (actual.equals(AgedPastDueDays))
   	    			return true;
   	    		else
   	    			return false;

   	    	} catch (Exception e) {
   	    		return false;
   	    	}
   	    	
   	    	}
   	    
   	    public boolean  verifyEligibleARMForMulDiv(String EligibleAR){
   	    	try {
   	    		WebElement displayWebElement = new WebDriverWait(driver, 100).until(ExpectedConditions.visibilityOfElementLocated(eligbileAr_xpath));
   	    		WebElement AmountWebElement = new WebDriverWait(driver, 100).until(ExpectedConditions.visibilityOfElementLocated(eligbileArValueeForMulDiv_xpath));
   	    		displayWebElement.isDisplayed();
   	    		String actual = AmountWebElement.getText().trim();
   	    		if (actual.equals(EligibleAR))
   	    			return true;
   	    		else
   	    			return false;

   	    	} catch (Exception e) {
   	    		return false;
   	    	}
   	    	
   	    	}

   	    public boolean  verifyAdvanceRateForMulDiv(String AdvanceRate){
   	    	try {
   	    		WebElement displayWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(advanceRate_xapth));
   	    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(advanceRateValueeForMulDiv_xapth));
   	    		displayWebElement.isDisplayed();
   	    		String actual = AmountWebElement.getText().trim();
   	    		if (actual.equals(AdvanceRate))
   	    			return true;
   	    		else
   	    			return false;

   	    	} catch (Exception e) {
   	    		return false;
   	    	}
   	    	
   	    }

   	    
   	    public boolean  verifyARAvailableForMulDiv(String ARAvailable){
   	    	try {
   	    		WebElement displayWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(arAvailable_xpath));
   	    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(arAvailableValueeForMulDiv_xpath));
   	    		displayWebElement.isDisplayed();
   	    		String actual = AmountWebElement.getText().trim();
   	    		if (actual.equals(ARAvailable))
   	    			return true;
   	    		else
   	    			return false;

   	    	} catch (Exception e) {
   	    		return false;
   	    	}
   	    	
   	    }
   	    
   	    public boolean  verifyARReceivablesSublimitForMulDiv( ){
   	    	try {
   	    		WebElement displayWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(arReceivableSublimit_xpath));
   	    		
   	    		displayWebElement.isDisplayed();
   	    	
   	    			return true;
   	    		

   	    	} catch (Exception e) {
   	    		return false;
   	    	}
   	    	
   	    }
   	    public boolean  verifyARBorrowingBaseForMulDiv(String  ARBorrowingBase){
   	    	try {
   	    		WebElement displayWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(arBorrowingBase_xpath));
   	    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(arBorrowingBaseValueeForMulDiv_xpath));
   	    		displayWebElement.isDisplayed();
   	    		String actual = AmountWebElement.getText().trim();
   	    		if (actual.equals(ARBorrowingBase))
   	    			return true;
   	    		else
   	    			return false;

   	    	} catch (Exception e) {
   	    		return false;
   	    	}
   	    	
   	    }
   	    
   	    public boolean  verifyARAvailableForAdvanceForMulDiv(String  ARAvailableForAdvance){
   	    	try {
   	    		WebElement displayWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(arAvaialbleAdv_xpath));
   	    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(arAvaialbleAdvValueeForMulDiv_xpath));
   	    		displayWebElement.isDisplayed();
   	    		String actual = AmountWebElement.getText().trim();
   	    		if (actual.equals(ARAvailableForAdvance))
   	    			return true;
   	    		else
   	    			return false;

   	    	} catch (Exception e) {
   	    		return false;
   	    	}
   	    	
   	    }
   	    
   	    public boolean  verifyARReservesForMulDiv(String  ARReserves){
   	    	try {
   	    		WebElement displayWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(arReserve_xpath));
   	    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(arReserveValueeForMulDiv_xpath));
   	    		displayWebElement.isDisplayed();
   	    		String actual = AmountWebElement.getText().trim();
   	    		if (actual.equals(ARReserves))
   	    			return true;
   	    		else
   	    			return false;

   	    	} catch (Exception e) {
   	    		return false;
   	    	}
   	    	
   	    }
   	    
   	    public boolean  verifyNetARAvailableForAdvanceForMulDiv(String  NetARAvailableForAdvance){
   	    	try {
   	    		WebElement displayWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(netArAdvanceAvailable_xpath));
   	    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(netArAdvanceAvailableValueeForMulDiv_xpath));
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
   	   public boolean  verifyInventoryAmounttForMulDiv(String  InventoryAmount){
	    	try {
	    		WebElement displayWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(inventoryAmount_xpath));
	    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(inventoryAmountValueMForMulDiv_xpath));
	    		displayWebElement.isDisplayed();
	    		String actual = AmountWebElement.getText().trim();
	    		if (actual.equals(InventoryAmount))
	    			return true;
	    		else
	    			return false;

	    	} catch (Exception e) {
	    		return false;
	    	}
	    	
	    }

	    public boolean  verifyIneligibletForMulDiv(String  Ineligible){
	    	try {
	    		WebElement displayWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(ineligibleInventory_xpath));
	    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(ineligibleInventoryValueMForMulDiv_xpath));
	    		displayWebElement.isDisplayed();
	    		String actual = AmountWebElement.getText().trim();
	    		if (actual.equals(Ineligible))
	    			return true;
	    		else
	    			return false;

	    	} catch (Exception e) {
	    		return false;
	    	}
	    	
	    }
	    public boolean  verifyEligibleMForMulDiv(String  eligible){
	    	try {
	    		WebElement displayWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(eligibleInv_xpath));
	    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(eligibleInvValueMForMulDiv_xpath));
	    		displayWebElement.isDisplayed();
	    		String actual = AmountWebElement.getText().trim();
	    		if (actual.equals(eligible))
	    			return true;
	    		else
	    			return false;

	    	} catch (Exception e) {
	    		return false;
	    	}
	    	
	    }
	    
	    
	    public boolean  verifyAvailableMForMulDiv(String  Available){
	    	try {
	    		WebElement displayWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(availableInv_xpath));
	    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(availableInvValueMForMulDiv_xpath));
	    		displayWebElement.isDisplayed();
	    		String actual = AmountWebElement.getText().trim();
	    		if (actual.equals(Available))
	    			return true;
	    		else
	    			return false;

	    	} catch (Exception e) {
	    		return false;
	    	}
	    	
	    }
	    

	    
	    public boolean  verifyInventoryBorrowingBaseMForMulDiv(String  inventoryBorrowingBase){
	    	try {
	    		
	    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(inventoryBorrowingBaseValueMForMulDiv_xpath));
	    		
	    		String actual = AmountWebElement.getText().trim();
	    		if (actual.equals(inventoryBorrowingBase))
	    			return true;
	    		else
	    			return false;

	    	} catch (Exception e) {
	    		return false;
	    	}
	    	
	    }
	    
	    public boolean  verifyInventoryAvailableForAdvanceMForMulDiv(String   InventoryAvailableForAdvance){
	    	try {
	    		WebElement displayWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(inventoryAvailableForAdvance_xpath));
	    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(inventoryAvailableForAdvanceValueMForMulDiv_xpath));
	    		displayWebElement.isDisplayed();
	    		String actual = AmountWebElement.getText().trim();
	    		if (actual.equals(InventoryAvailableForAdvance))
	    			return true;
	    		else
	    			return false;

	    	} catch (Exception e) {
	    		return false;
	    	}
	    	
	    }
	    public boolean  verifyInventoryReserveMForMulDiv(String  InventoryReserve){
	    	try {
	    		WebElement displayWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(inventoryReserve_xpath));
	    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(inventoryReserveValueMForMulDiv_xpath));
	    		displayWebElement.isDisplayed();
	    		String actual = AmountWebElement.getText().trim();
	    		if (actual.equals(InventoryReserve))
	    			return true;
	    		else
	    			return false;

	    	} catch (Exception e) {
	    		return false;
	    	}
	    	
	    }
	    
	    public boolean  verifyNetInventoryAvailableForAdvanceMForMulDiv(String  NetInventoryAvailableForAdvance){
	    	try {
	    		WebElement displayWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(netInventoryAvailableForAdvance_xpath));
	    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(netInventoryAvailableForAdvanceValueMForMulDiv_xpath));
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
	    public boolean  verifyOtherAmountTForMulDiv(String  OtherAmount){
	    	try {
	    		WebElement displayWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(otherAmount_xpath));
	    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(otherAmountValueTForMulDiv_xpath));
	    		displayWebElement.isDisplayed();
	    		String actual = AmountWebElement.getText().trim();
	    		if (actual.equals(OtherAmount))
	    			return true;
	    		else
	    			return false;

	    	} catch (Exception e) {
	    		return false;
	    	}
	    	
	    }
	    public boolean  verifyIneligibleOtherTForMulDiv(String  Ineligible){
	    	try {
	    		WebElement displayWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(ineligible_xpath));
	    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(ineligibleValueTForMulDiv_xpath));
	    		displayWebElement.isDisplayed();
	    		String actual = AmountWebElement.getText().trim();
	    		if (actual.equals(Ineligible))
	    			return true;
	    		else
	    			return false;

	    	} catch (Exception e) {
	    		return false;
	    	}
	    	
	    }
	    public boolean  verifyEligibleOtherTForMulDiv(String  Eligible){
	    	try {
	    		WebElement displayWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(eligibleCollateral_xpath));
	    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(eligibleCollateralValueTForMulDiv_xpath));
	    		displayWebElement.isDisplayed();
	    		String actual = AmountWebElement.getText().trim();
	    		if (actual.equals(Eligible))
	    			return true;
	    		else
	    			return false;

	    	} catch (Exception e) {
	    		return false;
	    	}
	    	
	    }
	    
	  
	    
	    public boolean  verifyAvailableOtherTForMulDiv(String  Available){
	    	try {
	    		WebElement displayWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(availableCollateral_xpath));
	    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(availableCollateralValueTForMulDiv_xpath));
	    		displayWebElement.isDisplayed();
	    		String actual = AmountWebElement.getText().trim();
	    		if (actual.equals(Available))
	    			return true;
	    		else
	    			return false;

	    	} catch (Exception e) {
	    		return false;
	    	}
	    	
	    }
	    
	    
	    public boolean  verifyOtherCollateralBorrowingBaseTForMulDiv(String  OtherCollateralBorrowingBase){
	    	try {
	    		WebElement displayWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(otherCollateralBorrowingBase_xpath));
	    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(otherCollateralBorrowingBaseValueTForMulDiv_xpath));
	    		displayWebElement.isDisplayed();
	    		String actual = AmountWebElement.getText().trim();
	    		if (actual.equals(OtherCollateralBorrowingBase))
	    			return true;
	    		else
	    			return false;

	    	} catch (Exception e) {
	    		return false;
	    	}
	    	
	    }
	    
	    public boolean  verifyOtherAvailableForAdvanceTForMulDiv(String  OtherAvailableForAdvance){
	    	try {
	    		WebElement displayWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(otherAvailableForAdvance_xpath));
	    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(otherAvailableForAdvanceValueTForMulDiv_xpath));
	    		displayWebElement.isDisplayed();
	    		String actual = AmountWebElement.getText().trim();
	    		if (actual.equals(OtherAvailableForAdvance))
	    			return true;
	    		else
	    			return false;

	    	} catch (Exception e) {
	    		return false;
	    	}
	    	
	    }
	    
	    public boolean  verifyOtherReservesTForMulDiv(String  OtherReserves){
	    	try {
	    		WebElement displayWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(otherReserve_xpath));
	    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(otherReserveValueTForMulDiv_xpath));
	    		displayWebElement.isDisplayed();
	    		String actual = AmountWebElement.getText().trim();
	    		if (actual.equals(OtherReserves))
	    			return true;
	    		else
	    			return false;

	    	} catch (Exception e) {
	    		return false;
	    	}
	    	
	    }
	    public boolean  verifyNetOtherAvailableForAdvanceTForMulDiv(String  NetOtherAvailableForAdvance){
	    	try {
	    		WebElement displayWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(netOtherAvailableForAdvance_xpath));
	    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(netOtherAvailableForAdvanceValueTForMulDiv_xpath));
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
	    
	    public boolean scrollToViewOtherCollateralForMulDiv()
		{
			try{
				 WebElement actual1=new WebDriverWait(driver,10)
	    		 .until(ExpectedConditions.visibilityOfElementLocated(otherAmount_xpath));
	    		JavascriptExecutor jse1 = (JavascriptExecutor)driver;;
	    		jse1.executeScript("arguments[0].scrollIntoView(true);", actual1);  		
		        //Thread.sleep(3000);
		        return true;
				
			}
			catch(Exception e){
				
			}
			return false;
			
			}
	    
	    public boolean  verifyTotalCollateralTForMulDiv(String  TotalCollateral){
        	try {
        		WebElement displayWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(totalCollateral_xpath));
        		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(totalCollateralValueTForMulDiv_xpath));
        		displayWebElement.isDisplayed();
        		String actual = AmountWebElement.getText().trim();
        		if (actual.equals(TotalCollateral))
        			return true;
        		else
        			return false;

        	} catch (Exception e) {
        		return false;
        	}
        	
        }
        
        public boolean  verifyTotalReserveTForMulDiv(String  TotalReserve){
        	try {
        		WebElement displayWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(totalReserve_xpath));
        		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(totalReserveValueTForMulDiv_xpath));
        		displayWebElement.isDisplayed();
        		String actual = AmountWebElement.getText().trim();
        		if (actual.equals(TotalReserve))
        			return true;
        		else
        			return false;

        	} catch (Exception e) {
        		return false;
        	}
        	
        }
        
        public boolean  verifyTotalAvailableForAdvanceTForMulDiv(String  TotalAvailableForAdvance){
        	try {
        		WebElement displayWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(totalAvailableForAdvance_xpath));
        		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(totalAvailableForAdvanceValueTForMulDiv_xpath));
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
        
        
        public boolean  verifyBorrorwingBaseAvailabilityMForMulDiv(String  borrorwingBaseAvailability){
        	try {
        		WebElement displayWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(borrorwingBaseAvailability_xpath));
        		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(borrorwingBaseAvailabilityValueTForMulDiv_xpath));
        		displayWebElement.isDisplayed();
        		String actual = AmountWebElement.getText().trim();
        		if (actual.equals(borrorwingBaseAvailability))
        			return true;
        		else
        			return false;

        	} catch (Exception e) {
        		return false;
        	}
        	
        }
        
        public boolean  verifyFundRequestedMForMulDiv(String  fundRequested){
        	try {
        		WebElement displayWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(fundRequested_xpath));
        		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(fundRequestedValueTForMulDiv_xpath));
        		displayWebElement.isDisplayed();
        		String actual = AmountWebElement.getText().trim();
        		if (actual.equals(fundRequested))
        			return true;
        		else
        			return false;

        	} catch (Exception e) {
        		return false;
        	}
        	
        }
        
        public boolean  verifyNetBorrowingBaseAvailableMForMulDiv(String  netBorrowingBaseAvailable){
        	try {
        		WebElement displayWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(netBorrowingBaseAvailable_xpath));
        		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(netBorrowingBaseAvailableValueTForMulDiv_xpath));
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
        public boolean  verifyTotalAgedReceivablesReportMForMulDiv(String  TotalAgedReceivables){
        	try {
        		WebElement displayWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(totalAgedReceivablesReport_xpath));
        		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(totalAgedReceivablesValuesReportMForMulDiv_xpath));
        		displayWebElement.isDisplayed();
        		String actual = AmountWebElement.getText().trim();
        		if (actual.equals(TotalAgedReceivables))
        			return true;
        		else
        			return false;

        	} catch (Exception e) {
        		return false;
        	}
        	
        }
        
        public boolean  verifyNetARAvailableForAdvanceReportMForMulDiv(String  NetARAvailableForAdvance){
        	try {
        		WebElement displayWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(netARAvailableForAdvance_xpath));
        		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(netARAvailableForAdvanceValueMForMulDiv_xpath));
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
        
        public boolean  verifyNetInventoryAvailableForAdvanceReportMForMulDiv(String  NetInventoryAvailableForAdvance){
        	try {
        		WebElement displayWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(netInventoryAvailableForAdvanceReport_xpath));
        		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(netInventoryAvailableForAdvanceValueReportMForMulDiv_xpath));
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
        
        
        public boolean  verifyNetOtherAvailableForAdvanceReportMForMulDiv(String  NetOtherAvailableForAdvance){
        	try {
        		WebElement displayWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(netOtherAvailableForAdvanceReport_xpath));
        		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(netOtherAvailableForAdvanceValueReportMForMulDiv_xpath));
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
        
        public boolean  verifyborrorwingBaseAvailabilityReportMForMulDiv(String  borrorwingBaseAvailability){
        	try {
        		WebElement displayWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(borrorwingBaseAvailabilityReport_xpath));
        		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(borrorwingBaseAvailabilityValueReportMForMulDiv_xpath));
        		displayWebElement.isDisplayed();
        		String actual = AmountWebElement.getText().trim();
        		if (actual.equals(borrorwingBaseAvailability))
        			return true;
        		else
        			return false;

        	} catch (Exception e) {
        		return false;
        	}
        	
        }
        
        public boolean  verifyfundRequestedReportMForMulDiv(String  fundRequested){
        	try {
        		WebElement displayWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(fundRequestedReport_xpath));
        		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(fundRequestedValueReportMForMulDiv_xpath));
        		displayWebElement.isDisplayed();
        		String actual = AmountWebElement.getText().trim();
        		if (actual.equals(fundRequested))
        			return true;
        		else
        			return false;

        	} catch (Exception e) {
        		return false;
        	}
        	
        }
        
        public boolean  verifynetBorrowingBaseAvailableReportMForMulDiv(String  netBorrowingBaseAvailable){
        	try {
        		WebElement displayWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(netBorrowingBaseAvailableReport_xpath));
        		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(netBorrowingBaseAvailableValueReportMForMulDiv_xpath));
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

        
//Method to verify paper
        public boolean verifyPaper() {
			try{
				WebElement clickOnDeletedilogbox =new WebDriverWait(driver,5)
				.until(ExpectedConditions.visibilityOfElementLocated(Paper_xpath));
				clickOnDeletedilogbox.isDisplayed();
			//Thread.sleep(500);
		    return true;
		} catch (Exception ex) {
		    return false;
		}
		}

        //Method to verify electronic signature
        
        public boolean verifyelectronicsignature() {
    			try{
    				WebElement clickOnDeletedilogbox =new WebDriverWait(driver,5)
    				.until(ExpectedConditions.visibilityOfElementLocated(ElectronicSignature_xpath));
    				clickOnDeletedilogbox.isDisplayed();
    			//Thread.sleep(500);
    		    return true;
    		} catch (Exception ex) {
    		    return false;
    		}
    		}
        
        //Method to verify reject xpath
        
        
        public boolean verifyreject() {
    			try{
    				WebElement clickOnDeletedilogbox =new WebDriverWait(driver,5)
    				.until(ExpectedConditions.visibilityOfElementLocated(reject_xpath));
    				clickOnDeletedilogbox.isDisplayed();
    			//Thread.sleep(500);
    		    return true;
    		} catch (Exception ex) {
    		    return false;
    		}
    		}
        
        //Method to verify download
        
        
        public boolean verifyDownload() {
    			try{
    				WebElement clickOnDeletedilogbox =new WebDriverWait(driver,5)
    				.until(ExpectedConditions.visibilityOfElementLocated(Download_xpath));
    				clickOnDeletedilogbox.isDisplayed();
    			//Thread.sleep(500);
    		    return true;
    		} catch (Exception ex) {
    		    return false;
    		}
    		}
        
        //Method to verify print_xpath
        
        public boolean verifyprint() {
			try{
				WebElement clickOnDeletedilogbox =new WebDriverWait(driver,5)
				.until(ExpectedConditions.visibilityOfElementLocated(Print_xpath));
				clickOnDeletedilogbox.isDisplayed();
			//Thread.sleep(500);
		    return true;
		} catch (Exception ex) {
		    return false;
		}
		}
        //Method to verify popup header
        
        public boolean verifypopupHeader() {
			try{
				WebElement clickOnDeletedilogbox =new WebDriverWait(driver,5)
				.until(ExpectedConditions.visibilityOfElementLocated(Headersxpath));
				clickOnDeletedilogbox.isDisplayed();
			//Thread.sleep(500);
		    return true;
		} catch (Exception ex) {
		    return false;
		}
		}
        
        //method to click on electronicsignature
        
        
        public boolean clickelectronicsignature() {
    			try{
    				WebElement clickOnDeletedilogbox =new WebDriverWait(driver,5)
    				.until(ExpectedConditions.visibilityOfElementLocated(ElectronicSignature_xpath));
    				clickOnDeletedilogbox.click();
    			//Thread.sleep(500);
    		    return true;
    		} catch (Exception ex) {
    		    return false;
    		}
    		}
        
      //click on bbcavablity approve
   	 public boolean selectbbcavablityapprove() {
   	    	try {
   	    	    WebElement bbcavablityapprove = new WebDriverWait(driver, 5)
   	    		    .until(ExpectedConditions
   	    			    .visibilityOfElementLocated(BBcavablityapprove_xpath));
   	    	    bbcavablityapprove.click();
   	    	    //Thread.sleep(10000);
   	    	    return true;
   	    	} catch (Exception ex) {
   	    	    return false;
   	    	}

   	        }
   //enter dat in authoorised name
	 public String enterValueInAuthorisedName(String ClientData) 
	 {
	 try{
	 WebElement bbcdate =new WebDriverWait(driver,5)
	 .until(ExpectedConditions.visibilityOfElementLocated(Authorisedname_xpath));
	 bbcdate.click();
	 //Thread.sleep(5000);
	 bbcdate.sendKeys(ClientData);

	 }
	 catch(Exception ex){

	 }
	 return ClientData;
	 }
	 //click on i agree
	 public boolean clickOnIAgree() {
	    	try {
	    	    WebElement bbcavablityapprove = new WebDriverWait(driver, 5)
	    		    .until(ExpectedConditions
	    			    .visibilityOfElementLocated(Iagree_xpath));
	    	    bbcavablityapprove.click();
	    	    //Thread.sleep(2000);
	    	    return true;
	    	} catch (Exception ex) {
	    	    return false;
	    	}

	        }
	 //click on authorised signature
	 public boolean clickOnAuthorisedSignature() {
	    	try {
	    	    WebElement bbcavablityapprove = new WebDriverWait(driver, 5)
	    		    .until(ExpectedConditions
	    			    .visibilityOfElementLocated(AuthorisedSignature_xpath));
	    	    bbcavablityapprove.click();
	    	    //Thread.sleep(500);
	    	    return true;
	    	} catch (Exception ex) {
	    	    return false;
	    	}}


        public boolean  verifyAgedCreditItem(String  AgedCreditItem){
        	try {
        		
        		WebElement AmountWebElement = new WebDriverWait(driver, 100).until(ExpectedConditions.visibilityOfElementLocated(AgedCreditItem_xpath));
        		String actual = AmountWebElement.getText().trim();
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
        		
        		WebElement AmountWebElement = new WebDriverWait(driver, 100).until(ExpectedConditions.visibilityOfElementLocated(CrossAgedPercentage_xpath));
        		String actual = AmountWebElement.getText().trim();
        		if (actual.equals(CrossAgedPercentage))
        			return true;
        		else
        			return false;

        	} catch (Exception e) {
        		return false;
        	}
        	
        	}

        
        public boolean  verifyConcentrationPercentage(String  ConcentrationPercentage){
        	try {
        		
        		WebElement AmountWebElement = new WebDriverWait(driver, 100).until(ExpectedConditions.visibilityOfElementLocated(ConcentrationPercentage_xpath));
        		String actual = AmountWebElement.getText().trim();
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
        		
        		WebElement AmountWebElement = new WebDriverWait(driver, 100).until(ExpectedConditions.visibilityOfElementLocated(ConcentrationPercentageAgedcreditLimit_xpath));
        		String actual = AmountWebElement.getText().trim();
        		if (actual.equals(ConcentrationPercentage))
        			return true;
        		else
        			return false;

        	} catch (Exception e) {
        		return false;
        	}
        	
        	}
        
        public boolean  verifyConcentrationPercentage_AgedCreditLimit_EligibleBalance(String  ConcentrationPercentage){
        	try {
        		
        		WebElement AmountWebElement = new WebDriverWait(driver, 100).until(ExpectedConditions.visibilityOfElementLocated(ConcentrationPercentageAgedcreditLimitEligibleBalance_xpath));
        		String actual = AmountWebElement.getText().trim();
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
        		
        		WebElement AmountWebElement = new WebDriverWait(driver, 100).until(ExpectedConditions.visibilityOfElementLocated(ConcentrationPercentageIneligibleCustomer_xpath));
        		String actual = AmountWebElement.getText().trim();
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
        		
        		WebElement AmountWebElement = new WebDriverWait(driver, 100).until(ExpectedConditions.visibilityOfElementLocated(PastDueDays_xpath));
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
        		
        		WebElement AmountWebElement = new WebDriverWait(driver, 100).until(ExpectedConditions.visibilityOfElementLocated(IneligibleCustomer_xpath));
        		String actual = AmountWebElement.getText().trim();
        		if (actual.equals(Ineligible))
        			return true;
        		else
        			return false;


        	} catch (Exception e) {
        		return false;
        	}
        	
        	}
        
        public boolean  verifyConcentrationPercentage_AgedCreditLimit_(String  ConcentrationPercentage){
        	try {
        		
        		WebElement AmountWebElement = new WebDriverWait(driver, 100).
        				until(ExpectedConditions.visibilityOfElementLocated(ConcentrationPercentageAgedcreditLimit_xpath));
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
	 //verify message
	 public boolean VerifyMessageInSignBbc() {
			try {
			    WebElement clickonclientname = new WebDriverWait(driver,5)
				    .until(ExpectedConditions .visibilityOfElementLocated(Verifymessage_xpath));
			    clickonclientname.isDisplayed();
			    //Thread.sleep(500);
			    return true;
			} catch (Exception ex) {
			    return false;
			}

		}
	 //Verify BBc review page
	 public boolean verifyBBCreviewpage() {
			try {
			    WebElement clickonclientname = new WebDriverWait(driver,5)
				    .until(ExpectedConditions .visibilityOfElementLocated(Verfiypage_xpath));
			    clickonclientname.isDisplayed();
			    //Thread.sleep(500);
			    return true;
			} catch (Exception ex) {
			    return false;
			}

		}
	 public boolean  verifyPriorBalanceForSummaryYesMulDiv(String priorBalance){
	     	try {
	     	
	     		WebElement priorAmountAmountWebElement = new WebDriverWait(driver, 100).until(ExpectedConditions.visibilityOfElementLocated(priorBalanceValueForSummaryYesMulDiv_xpath));
	     		String actual = priorAmountAmountWebElement.getText().trim();
	     		if (actual.equals(priorBalance))
	     			return true;
	     		else
	     			return false;

	     	} catch (Exception e) {
	     		return false;
	     	}
	     	
	     	}

     public boolean  verifyNewSalesForSummaryYesMulDiv(String newSales){
     	try {

     		WebElement AmountWebElement = new WebDriverWait(driver, 10)
     		.until(ExpectedConditions.visibilityOfElementLocated(newSalesAmountForSummaryYesMulDiv_xpath));

     		String actual = AmountWebElement.getText().trim();
     		if (actual.equals(newSales))
     			return true;
     		else
     			return false;

     	} catch (Exception e) {
     		return false;
     	}
     	
     	}
     public boolean  verifyNewCreditsForSummaryYesMulDiv(String newCredits){
     	try {
     		WebElement AmountWebElement = new WebDriverWait(driver, 10)
     		.until(ExpectedConditions.visibilityOfElementLocated(newCreditsAmountForSummaryYesMulDiv_xpath));
     		String actual = AmountWebElement.getText().trim();
     		if (actual.equals(newCredits))

     			return true;
     		else
     			return false;

     	} catch (Exception e) {
     		return false;
     	}

     	
     	}
     public boolean  verifyNewCashCollectedForSummaryYesMulDiv(String newCashCollected){
     	try {
     		WebElement AmountWebElement = new WebDriverWait(driver, 10)
     		.until(ExpectedConditions.visibilityOfElementLocated(newCashCollectedAmountForSummaryYesMulDiv_xpath));
            String actual = AmountWebElement.getText().trim();
     		if (actual.equals(newCashCollected))
     			return true;
     		else
     			return false;

     	} catch (Exception e) {
     		return false;
     	}
     	
     	}
     
     public boolean  verifyNewAdjustmentsForSummaryYesMulDiv(String newAdjustments){
     	try {
     		WebElement AmountWebElement = new WebDriverWait(driver, 10)
     		.until(ExpectedConditions.visibilityOfElementLocated(newAdjustmentAmountForSummaryYesMulDiv_xpath));
     		String actual = AmountWebElement.getText().trim();
     		if (actual.equals(newAdjustments))
     			return true;
     		else
     			return false;

     	} catch (Exception e) {
     		return false;
     	}
     	
     	}
     public boolean  verifyBBCAdjustmentForSummaryYesMulDiv(String bBCAdjustment){
     	try {
     		WebElement AmountWebElement = new WebDriverWait(driver, 10)
     		.until(ExpectedConditions.visibilityOfElementLocated(bbcAdjustmentAmountForSummaryYesMulDiv_xpath));
     		String actual = AmountWebElement.getText().trim();
     		if (actual.equals(bBCAdjustment))
     			return true;
     		else
     			return false;

     	} catch (Exception e) {
     		return false;
     	}
     	
     	}
     public boolean  verifyUnreconciledForSummaryYesMulDiv(String Unreconciled){
     	try {
     		WebElement AmountWebElement = new WebDriverWait(driver, 10)
     		.until(ExpectedConditions.visibilityOfElementLocated(unreconciledAmountForSummaryYesMulDiv_xpath));
     		String actual = AmountWebElement.getText().trim();
     		if (actual.equals(Unreconciled))
     			return true;
     		else
     			return false;

     	} catch (Exception e) {
     		return false;
     	}
     	
     	}
     public boolean  verifyEndingBalanceTotalArForSummaryYesMulDiv(String endingBalanceTotalAR){
     	try {
     		WebElement AmountWebElement = new WebDriverWait(driver, 10)
     		.until(ExpectedConditions.visibilityOfElementLocated(endingBallanceTotalArAmountSummaryYesForMulDiv_xpath));
     		String actual = AmountWebElement.getText().trim();
     		if (actual.equals(endingBalanceTotalAR))
     			return true;
     		else
     			return false;

     	} catch (Exception e) {
     		return false;
     	}
     	
     	}
     public boolean  verifyFutureForSummaryYesMulDiv(String future){
     	try {
     		WebElement AmountWebElement = new WebDriverWait(driver, 10)
     		.until(ExpectedConditions.visibilityOfElementLocated(futureValueForSummaryYesMulDiv_xpath));
     		String actual = AmountWebElement.getText().trim();
     		if (actual.equals(future))
     			return true;
     		else
     			return false;

     	} catch (Exception e) {
     		return false;
     	}
     	
     	}
     
     public boolean  verifyCurrentForSummaryYesMulDiv(String current){
     	try {
     		WebElement AmountWebElement = new WebDriverWait(driver, 10)
     		.until(ExpectedConditions.visibilityOfElementLocated(currentValueForSummaryYesMulDiv_xpath));
     		String actual = AmountWebElement.getText().trim();
     		if (actual.equals(current))
     			return true;
     		else
     			return false;

     	} catch (Exception e) {
     		return false;
     	}
     	
     	}
     
     public boolean  verifyOver30ForSummaryYesMulDiv(String Over30){
     	try {
     		WebElement AmountWebElement = new WebDriverWait(driver, 10)
     		.until(ExpectedConditions.visibilityOfElementLocated(over30ValueForSummaryYesMulDiv_xpath));
     		String actual = AmountWebElement.getText().trim();
     		if (actual.equals(Over30))
     			return true;
     		else
     			return false;

     	} catch (Exception e) {
     		return false;
     	}
     	
     	}
     
     public boolean  verifyOver60ForSummaryYesMulDiv(String Over60){
     	try {
     		WebElement AmountWebElement = new WebDriverWait(driver, 10)
     		.until(ExpectedConditions.visibilityOfElementLocated(over60ValueForSummaryYesMulDiv_xpath));
     		String actual = AmountWebElement.getText().trim();
     		if (actual.equals(Over60))
     			return true;
     		else
     			return false;

     	} catch (Exception e) {
     		return false;
     	}
     	
     	}
     public boolean  verifyOver90ForSummaryYesMulDiv(String Over90){
     	try {
     		WebElement AmountWebElement = new WebDriverWait(driver, 10)
     		.until(ExpectedConditions.visibilityOfElementLocated(over90ValueForSummaryYesMulDiv_xpath));
     		String actual = AmountWebElement.getText().trim();
     		if (actual.equals(Over90))
     			return true;
     		else
     			return false;

     	} catch (Exception e) {
     		return false;
     	}
     	
     	}
     
     public boolean  verifyOver120ForSummaryYesMulDiv(String Over120){
     	try {
     		WebElement AmountWebElement = new WebDriverWait(driver, 10)
.until(ExpectedConditions.visibilityOfElementLocated(over120ValueForSummaryYesMulDiv_xpath));

     		String actual = AmountWebElement.getText().trim();
     		if (actual.equals(Over120))
     			return true;
     		else
     			return false;

     	} catch (Exception e) {
     		return false;
     	}
     	
     	}
     public boolean  verifyTotalAgedReceivablesForSummaryYesMulDiv(String totalAgedReceivables){
     	try {
     		WebElement AmountWebElement = new WebDriverWait(driver, 10)
     		.until(ExpectedConditions.visibilityOfElementLocated(totalAgedReceivablesValueForSummaryYesMulDiv_xpath));
     		String actual = AmountWebElement.getText().trim();
     		if (actual.equals(totalAgedReceivables))
     			return true;
     		else
     			return false;

     	} catch (Exception e) {
     		return false;
     	}
     	
     	}

   	 public boolean  verifyIneligiblesValueForSummaryYesMulDiv(String ineligibleValue){
   	    	try {
   	    		WebElement AmountWebElement = new WebDriverWait(driver, 10)
   	    		.until(ExpectedConditions.visibilityOfElementLocated(ineligiblesValueeForSummaryYesMulDiv_xpath));
   	    		String actual = AmountWebElement.getText().trim();
   	    		if (actual.equals(ineligibleValue))
   	    			return true;
   	    		else
   	    			return false;

   	    	} catch (Exception e) {
   	    		return false;
   	    	}
   	    	
   	    	}
   	    

   	    public boolean  verifyARAgedPastDueDaysForSummaryYesMulDiv(String  AgedPastDueDays){
   	    	try {
   	    		WebElement AmountWebElement = new WebDriverWait(driver, 10)
   	    		.until(ExpectedConditions.visibilityOfElementLocated(agedPastDueDaysValueeForSummaryYesMulDiv_xpath));
   	    		String actual = AmountWebElement.getText().trim();
   	    		if (actual.equals(AgedPastDueDays))
   	    			return true;
   	    		else
   	    			return false;

   	    	} catch (Exception e) {
   	    		return false;
   	    	}
   	    	
   	    	}
   	    
   	    public boolean  verifyEligibleARMForSummaryYesMulDiv(String EligibleAR){
   	    	try {
   	    		WebElement AmountWebElement = new WebDriverWait(driver, 10)
   	    		.until(ExpectedConditions.visibilityOfElementLocated(eligbileArValueeForSummaryYesMulDiv_xpath));
   	    		String actual = AmountWebElement.getText().trim();
   	    		if (actual.equals(EligibleAR))
   	    			return true;
   	    		else
   	    			return false;

   	    	} catch (Exception e) {
   	    		return false;
   	    	}
   	    	
   	    	}

   	    public boolean  verifyAdvanceRateForSummaryYesMulDiv(String AdvanceRate){
   	    	try {
   	    		WebElement AmountWebElement = new WebDriverWait(driver, 10)
   	    		.until(ExpectedConditions.visibilityOfElementLocated(advanceRateValueeForSummaryYesMulDiv_xapth));
   	    		String actual = AmountWebElement.getText().trim();
   	    		if (actual.equals(AdvanceRate))
   	    			return true;
   	    		else
   	    			return false;

   	    	} catch (Exception e) {
   	    		return false;
   	    	}
   	    	
   	    }

   	    
   	    public boolean  verifyARAvailableForSummaryYesMulDiv(String ARAvailable){
   	    	try {
   	    		WebElement AmountWebElement = new WebDriverWait(driver, 10)
   	    		.until(ExpectedConditions.visibilityOfElementLocated(arAvailableValueeForSummaryYesMulDiv_xpath));
   	    		String actual = AmountWebElement.getText().trim();
   	    		if (actual.equals(ARAvailable))
   	    			return true;
   	    		else
   	    			return false;

   	    	} catch (Exception e) {
   	    		return false;
   	    	}
   	    	
   	    }
   	    
   	    
   	    public boolean  verifyARBorrowingBaseForSummaryYesMulDiv(  ){
   	    	try {
   	    		WebElement AmountWebElement = new WebDriverWait(driver, 10)
   	    		.until(ExpectedConditions.visibilityOfElementLocated(arBorrowingBaseValueeForSummaryYesMulDiv_xpath));
   	    		AmountWebElement.isDisplayed();
   	    			return true;

   	    	} catch (Exception e) {
   	    		return false;
   	    	}
   	    	
   	    }
   	    
   	    public boolean  verifyARAvailableForAdvanceForSummaryYesMulDiv(String  ARAvailableForAdvance){
   	    	try {
   	    		WebElement AmountWebElement = new WebDriverWait(driver, 10)
   	    		.until(ExpectedConditions.visibilityOfElementLocated(arAvaialbleAdvValueeForSummaryYesMulDiv_xpath));

   	    		String actual = AmountWebElement.getText().trim();
   	    		if (actual.equals(ARAvailableForAdvance))
   	    			return true;
   	    		else
   	    			return false;

   	    	} catch (Exception e) {
   	    		return false;
   	    	}
   	    }
   	     public boolean  verifyARReservesForSummaryYesMulDiv(String  ARReserves){
    	    	try {
    	    		WebElement AmountWebElement = new WebDriverWait(driver, 10)
    	    		.until(ExpectedConditions.visibilityOfElementLocated(arReserveValueeForSummaryYesMulDiv_xpath));
    	    		String actual = AmountWebElement.getText().trim();
    	    		if (actual.equals(ARReserves))
    	    			return true;
    	    		else
    	    			return false;

    	    	} catch (Exception e) {
    	    		return false;
    	    	}
    	    	
    	    }
   	  public boolean  verifyNetARAvailableForAdvanceForSummaryYesMulDiv(String  NetARAvailableForAdvance){
 	    	try {
 	    		WebElement AmountWebElement = new WebDriverWait(driver, 10)
 	    		.until(ExpectedConditions.visibilityOfElementLocated(netArAdvanceAvailableValueeForSummaryYesMulDiv_xpath));
 	    		String actual = AmountWebElement.getText().trim();
 	    		if (actual.equals(NetARAvailableForAdvance))
 	    			return true;
 	    		else
 	    			return false;

 	    	} catch (Exception e) {
 	    		return false;
 	    	}
 	    	
 	    }  
   	 public boolean  verifyInventoryAmounttForSummaryYesMulDiv(String  InventoryAmount){
	    	try {
	    		WebElement AmountWebElement = new WebDriverWait(driver, 10)
	    		.until(ExpectedConditions.visibilityOfElementLocated(inventoryAmountValueMForSummaryYesMulDiv_xpath));
	    		String actual = AmountWebElement.getText().trim();
	    		if (actual.equals(InventoryAmount))
	    			return true;
	    		else
	    			return false;

	    	} catch (Exception e) {
	    		return false;
	    	}
	    	
	    }

	    public boolean  verifyIneligibletForSummaryYesMulDiv(String  Ineligible){
	    	try {

	    		WebElement AmountWebElement = new WebDriverWait(driver, 10)
	    		.until(ExpectedConditions.visibilityOfElementLocated(ineligibleInventoryValueMForSummaryYesMulDiv_xpath));
	    		String actual = AmountWebElement.getText().trim();
	    		if (actual.equals(Ineligible))
	    			return true;
	    		else
	    			return false;

	    	} catch (Exception e) {
	    		return false;
	    	}
	    	
	    }
	    public boolean  verifyEligibleMForSummaryYesMulDiv(String  eligible){
	    	try {

	    		WebElement AmountWebElement = new WebDriverWait(driver, 10)
.until(ExpectedConditions.visibilityOfElementLocated(eligibleInvValueMForSummaryYesMulDiv_xpath));

	    		String actual = AmountWebElement.getText().trim();
	    		if (actual.equals(eligible))
	    			return true;
	    		else
	    			return false;

	    	} catch (Exception e) {
	    		return false;
	    	}
	    	
	    }
	    
	    
	    public boolean  verifyAvailableMForSummaryYesMulDiv(String  Available){
	    	try {
	    		WebElement AmountWebElement = new WebDriverWait(driver, 10)
	    		.until(ExpectedConditions.visibilityOfElementLocated(availableInvValueMForSummaryYesMulDiv_xpath));
	    		String actual = AmountWebElement.getText().trim();
	    		if (actual.equals(Available))
	    			return true;
	    		else
	    			return false;

	    	} catch (Exception e) {
	    		return false;
	    	}
	    	
	    }
	    

	    
	    public boolean  verifyInventoryBorrowingBaseMForSummaryYesMulDiv(String  inventoryBorrowingBase){
	    	try {
	    				WebElement AmountWebElement = new WebDriverWait(driver, 10)
	    				.until(ExpectedConditions.visibilityOfElementLocated(inventoryBorrowingBaseValueMForSummaryYesMulDiv_xpath));
	    		
	    		String actual = AmountWebElement.getText().trim();
	    		if (actual.equals(inventoryBorrowingBase))
	    			return true;
	    		else
	    			return false;

	    	} catch (Exception e) {
	    		return false;
	    	}
	    	
	    }
	    
	    public boolean  verifyInventoryAvailableForAdvanceMForSummaryYesMulDiv(String   InventoryAvailableForAdvance){
	    	try {
	    		WebElement AmountWebElement = new WebDriverWait(driver, 10)
.until(ExpectedConditions.visibilityOfElementLocated(inventoryAvailableForAdvanceValueMForSummaryYesMulDiv_xpath));

	    		String actual = AmountWebElement.getText().trim();
	    		if (actual.equals(InventoryAvailableForAdvance))
	    			return true;
	    		else
	    			return false;

	    	} catch (Exception e) {
	    		return false;
	    	}
	    	
	    }
	    public boolean  verifyInventoryReserveMForSummaryYesMulDiv(String  InventoryReserve){
	    	try {
	    		WebElement AmountWebElement = new WebDriverWait(driver, 10)
.until(ExpectedConditions.visibilityOfElementLocated(inventoryReserveValueMForSummaryYesMulDiv_xpath));

	    		String actual = AmountWebElement.getText().trim();
	    		if (actual.equals(InventoryReserve))
	    			return true;
	    		else
	    			return false;

	    	} catch (Exception e) {
	    		return false;
	    	}
	    	
	    }
	    
	    public boolean  verifyNetInventoryAvailableForSummaryYesAdvanceMForMulDiv(String  NetInventoryAvailableForAdvance){
	    	try {

	    		WebElement AmountWebElement = new WebDriverWait(driver, 10)
	    		.until(ExpectedConditions.visibilityOfElementLocated(netInventoryAvailableForAdvanceValueMForSummaryYesMulDiv_xpath));
	    		String actual = AmountWebElement.getText().trim();
	    		if (actual.equals(NetInventoryAvailableForAdvance))
	    			return true;
	    		else
	    			return false;

	    	} catch (Exception e) {
	    		return false;
	    	}
	    	
	    }
	    
	    public boolean  verifyOtherAmountTForSummaryYesMulDiv(String  OtherAmount){
	    	try {

	    		WebElement AmountWebElement = new WebDriverWait(driver, 10)
	    		.until(ExpectedConditions.visibilityOfElementLocated(otherAmountValueTForSummaryYesMulDiv_xpath));
	    		String actual = AmountWebElement.getText().trim();
	    		if (actual.equals(OtherAmount))
	    			return true;
	    		else
	    			return false;

	    	} catch (Exception e) {
	    		return false;
	    	}
	    	
	    }
	    public boolean  verifyIneligibleOtherTForSummaryYesMulDiv(String  Ineligible){
	    	try {

	    		WebElement AmountWebElement = new WebDriverWait(driver, 10)
	    		.until(ExpectedConditions.visibilityOfElementLocated(ineligibleValueTForSummaryYesMulDiv_xpath));
	    		String actual = AmountWebElement.getText().trim();
	    		if (actual.equals(Ineligible))
	    			return true;
	    		else
	    			return false;

	    	} catch (Exception e) {
	    		return false;
	    	}
	    	
	    }
	    public boolean  verifyEligibleOtherTForSummaryYesMulDiv(String  Eligible){
	    	try {
	    		WebElement AmountWebElement = new WebDriverWait(driver, 10)
	    		.until(ExpectedConditions.visibilityOfElementLocated(eligibleCollateralValueTForSummaryYesMulDiv_xpath));
	    		String actual = AmountWebElement.getText().trim();
	    		if (actual.equals(Eligible))
	    			return true;
	    		else
	    			return false;

	    	} catch (Exception e) {
	    		return false;
	    	}
	    	
	    }
	    
	  
	    
	    public boolean  verifyAvailableOtherTForSummaryYesMulDiv(String  Available){
	    	try {
	    		WebElement AmountWebElement = new WebDriverWait(driver, 10)
	    		.until(ExpectedConditions.visibilityOfElementLocated(availableCollateralValueTForSummaryYesMulDiv_xpath));
	    		String actual = AmountWebElement.getText().trim();
	    		if (actual.equals(Available))
	    			return true;
	    		else
	    			return false;

	    	} catch (Exception e) {
	    		return false;
	    	}
	    	
	    }
	    
	    
	    public boolean  verifyOtherCollateralBorrowingBaseTForSummaryYesMulDiv(String  OtherCollateralBorrowingBase){
	    	try {

	    		WebElement AmountWebElement = new WebDriverWait(driver, 10)
	    		.until(ExpectedConditions.visibilityOfElementLocated(otherCollateralBorrowingBaseValueTForSummaryYesMulDiv_xpath));
	    		String actual = AmountWebElement.getText().trim();
	    		if (actual.equals(OtherCollateralBorrowingBase))
	    			return true;
	    		else
	    			return false;

	    	} catch (Exception e) {
	    		return false;
	    	}
	    	
	    }
	    
	    public boolean  verifyOtherAvailableForAdvanceTForSummaryYesMulDiv(String  OtherAvailableForAdvance){
	    	try {

	    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(otherAvailableForAdvanceValueTForSummaryYesMulDiv_xpath));

	    		String actual = AmountWebElement.getText().trim();
	    		if (actual.equals(OtherAvailableForAdvance))
	    			return true;
	    		else
	    			return false;

	    	} catch (Exception e) {
	    		return false;
	    	}
	    	
	    }
	    
	    public boolean  verifyOtherReservesTForSummaryYesMulDiv(String  OtherReserves){
	    	try {
	    		WebElement AmountWebElement = new WebDriverWait(driver, 10)
.until(ExpectedConditions.visibilityOfElementLocated(otherReserveValueTForSummaryYesMulDiv_xpath));
	    		String actual = AmountWebElement.getText().trim();
	    		if (actual.equals(OtherReserves))
	    			return true;
	    		else
	    			return false;

	    	} catch (Exception e) {
	    		return false;
	    	}
	    	
	    }
	    public boolean  verifyNetOtherAvailableForSummaryYesAdvanceTForMulDiv(String  NetOtherAvailableForAdvance){
	    	try {

	    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(netOtherAvailableForAdvanceValueTForSummaryYesMulDiv_xpath));

	    		String actual = AmountWebElement.getText().trim();
	    		if (actual.equals(NetOtherAvailableForAdvance))
	    			return true;
	    		else
	    			return false;

	    	} catch (Exception e) {
	    		return false;
	    	}
	    	
	    }
	    public boolean  verifyNetOtherAvailableForAdvanceTForSummaryYesMulDiv(String  NetOtherAvailableForAdvance){
	    	try {

	    		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(netOtherAvailableForAdvanceValueTForSummaryYesMulDiv_xpath));

	    		String actual = AmountWebElement.getText().trim();
	    		if (actual.equals(NetOtherAvailableForAdvance))
	    			return true;
	    		else
	    			return false;

	    	} catch (Exception e) {
	    		return false;
	    	}
	    	
	    }
	    public boolean  verifyTotalCollateralTForSummaryYesMulDiv(String  TotalCollateral){
        	try {

        		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(totalCollateralValueTForSummaryYesMulDiv_xpath));

        		String actual = AmountWebElement.getText().trim();
        		if (actual.equals(TotalCollateral))
        			return true;
        		else
        			return false;

        	} catch (Exception e) {
        		return false;
        	}
        	
        }
        
        public boolean  verifyTotalReserveTForSummaryYesMulDiv(String  TotalReserve){
        	try {

        		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(totalReserveValueTForSummaryYesMulDiv_xpath));
        		String actual = AmountWebElement.getText().trim();
        		if (actual.equals(TotalReserve))
        			return true;
        		else
        			return false;

        	} catch (Exception e) {
        		return false;
        	}
        	
        }
        
        public boolean  verifyTotalAvailableForAdvanceTForSummaryYesMulDiv(String  TotalAvailableForAdvance){
        	try {

        		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(totalAvailableForAdvanceValueTForSummaryYesMulDiv_xpath));

        		String actual = AmountWebElement.getText().trim();
        		if (actual.equals(TotalAvailableForAdvance))
        			return true;
        		else
        			return false;

        	} catch (Exception e) {
        		return false;
        	}
        	
        }
        public boolean  verifyBorrorwingBaseAvailabilityMForSummaryYesMulDiv(String  borrorwingBaseAvailability){
        	try {

        		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(borrorwingBaseAvailabilityValueTForSummaryYesMulDiv_xpath));

        		String actual = AmountWebElement.getText().trim();
        		if (actual.equals(borrorwingBaseAvailability))
        			return true;
        		else
        			return false;

        	} catch (Exception e) {
        		return false;
        	}
        	
        }
        
        public boolean  verifyFundRequestedMForSummaryYesMulDiv(String  fundRequested){
        	try {

        		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(fundRequestedValueTForSummaryYesMulDiv_xpath));

        		String actual = AmountWebElement.getText().trim();
        		if (actual.equals(fundRequested))
        			return true;
        		else
        			return false;

        	} catch (Exception e) {
        		return false;
        	}
        	
        }
        
        public boolean  verifyNetBorrowingBaseAvailableMForSummaryYesMulDiv(String  netBorrowingBaseAvailable){
        	try {

        		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(netBorrowingBaseAvailableValueTForSummaryYesMulDiv_xpath));

        		String actual = AmountWebElement.getText().trim();
        		if (actual.equals(netBorrowingBaseAvailable))
        			return true;
        		else
        			return false;

        	} catch (Exception e) {
        		return false;
        	}
        	
        }
        
        public boolean  verifyTotalAgedReceivablesReportMForSummaryYesMulDiv(String  TotalAgedReceivables){
        	try {

        		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(totalAgedReceivablesValuesReportMForSummaryYesMulDiv_xpath));

        		String actual = AmountWebElement.getText().trim();
        		if (actual.equals(TotalAgedReceivables))
        			return true;
        		else
        			return false;

        	} catch (Exception e) {
        		return false;
        	}
        	
        }
        
        public boolean  verifyNetARAvailableForAdvanceReportMForSummaryYesMulDiv(String  NetARAvailableForAdvance){
        	try {

        		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(netARAvailableForAdvanceValueMForSummaryYesMulDiv_xpath));

        		String actual = AmountWebElement.getText().trim();
        		if (actual.equals(NetARAvailableForAdvance))
        			return true;
        		else
        			return false;

        	} catch (Exception e) {
        		return false;
        	}
        	
        }
        
        public boolean  verifyNetInventoryAvailableForAdvanceReportMForSummaryYesMulDiv(String  NetInventoryAvailableForAdvance){
        	try {

        		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(netInventoryAvailableForAdvanceValueReportMForSummaryYesMulDiv_xpath));

        		String actual = AmountWebElement.getText().trim();
        		if (actual.equals(NetInventoryAvailableForAdvance))
        			return true;
        		else
        			return false;

        	} catch (Exception e) {
        		return false;
        	}
        	
        }
        
        
        public boolean  verifyNetOtherAvailableForAdvanceReportMForSummaryYesMulDiv(String  NetOtherAvailableForAdvance){
        	try {

        		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(netOtherAvailableForAdvanceValueReportMForSummaryYesMulDiv_xpath));

        		String actual = AmountWebElement.getText().trim();
        		if (actual.equals(NetOtherAvailableForAdvance))
        			return true;
        		else
        			return false;

        	} catch (Exception e) {
        		return false;
        	}
        	
        }
        
        public boolean  verifyborrorwingBaseAvailabilityReportMForSummaryYesMulDiv(String  borrorwingBaseAvailability){
        	try {

        		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(borrorwingBaseAvailabilityValueReportMForSummaryYesMulDiv_xpath));

        		String actual = AmountWebElement.getText().trim();
        		if (actual.equals(borrorwingBaseAvailability))
        			return true;
        		else
        			return false;

        	} catch (Exception e) {
        		return false;
        	}
        	
        }
        
        public boolean  verifyfundRequestedReportMForSummaryYesMulDiv(String  fundRequested){
        	try {

        		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(fundRequestedValueReportMForSummaryYesMulDiv_xpath));

        		String actual = AmountWebElement.getText().trim();
        		if (actual.equals(fundRequested))
        			return true;
        		else
        			return false;

        	} catch (Exception e) {
        		return false;
        	}
        	
        }
        
        public boolean  verifynetBorrowingBaseAvailableReportMForSummaryYesMulDiv(String  netBorrowingBaseAvailable){
        	try {

        		WebElement AmountWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(netBorrowingBaseAvailableValueReportMForSummaryYesMulDiv_xpath));

        		String actual = AmountWebElement.getText().trim();
        		if (actual.equals(netBorrowingBaseAvailable))
        			return true;
        		else
        			return false;

        	} catch (Exception e) {
        		return false;
        	}
        	
        } 

    	   
}


