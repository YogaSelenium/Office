package com.cync.pages;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.SkipException;

import com.cync.base.BasePage;

public class ReceivableAgingPage extends BasePage {
	private final By receivableAgingPage_xpath=By.xpath("//span[@class='paneltitle']");
	private final By bbcDate_xpath=By.xpath("//div[@class='control-group bbc_sum_lbls']//label[3]");
	private final By future_xpath=By.xpath("//label[text()='Future']");
	private final By current_xpath=By.xpath("//label[text()='Current']");
	private final By over30_xpath=By.xpath("//label[text()='Over 30']");
	private final By over60_xpath=By.xpath("//label[text()='Over 60']");
	private final By over90_xpath=By.xpath("//label[text()='Over 90']");
	private final By over120_xpath=By.xpath("//label[text()='Over 120']");
	//private final By retention_xpath=By.xpath("//label[text()='Retention']");
	private final By total_xpath=By.xpath("//label[text()='Total']");
	private final By futureAmount_xpath=By.id("Future");
	private final By currentAmount_xpath=By.id("Current");
	private final By over30Amount_xpath=By.id("Over_30");
	private final By over60Amount_xpath=By.id("Over_60");
	private final By over90Amount_xpath=By.id("Over_90");
	private final By over120Amount_xpath=By.id("Over_120");
	//private final By retentionAmount_xpath=By.xpath("//label[text()='Retention']");
	private final By totalAmount_xpath=By.id("total");
	private final By agedPastDueDaya_xpath=By.xpath("//td[text()='Aged: Past Due Days']");
	private final By agedPastDueDayaAmoput_xpath=By.xpath("//td[text()='61,250.00']");


//Summary
	private final By collateralLabel_xpath=By.xpath("//label[text()='Collateral Name']");
	private final By bbcDateLabel_xpath=By.xpath("//label[text()='BBC Date']");
	private final By retention_xpath=By.xpath("//label[text()='Retention']");
	private final By arAdjustment_xpath=By.xpath("//label[text()='AR Adjustment']");
	private final By totalLabel_xpath=By.xpath("//label[text()='Total']");
	private final By ineligibiltyReasonLabel_xpath=By.xpath("//div[text()='Ineligiblity Reason']");
	private final By ineligibiltyAmountLabel_xpath=By.xpath("//div[text()='Ineligible Amount']");
	private final By eomLabel_xpath=By.xpath("//td[contains(text(),'EOM Totals')]");
	private final By eligibleAccRecLabel_xpath=By.xpath("//td[contains(text(),'Eligible Accounts Receivables')]");
	private final By accRecevCollateral_xpath=By.xpath("//td[contains(text(),'Accounts Receivables Collateral')]");
	private final By retentionValue_xpath=By.id("Retention");
	private final By arAdjustmentAmount_xpath=By.id("AR_Adjustment");
	private final By ineligibiltyReason_xpath=By.xpath("//table[@id='ineligible_summaries_list']/tbody/tr[2]/td[3]");
	private final By ineligibiltyTotal_xpath=By.xpath("//table[@id='ineligible_summaries_list']/tbody/tr[2]/td[4]");
	private final By eomTotal_xpath=By.xpath("//div[@id='summary_section']/table/tbody/tr[1]/td[2]");
	private final By eligibleAccReceivable_xpath=By.xpath("//div[@id='summary_section']/table/tbody/tr[2]/td[2]");
	private final By accReceivableCollateral_xpath=By.xpath("//div[@id='summary_section']/table/tbody/tr[3]/td[2]");


	//ineligible customeer

		//private final By ineligibleamnt_xpath=By.xpath("(//td[@aria-describedby='ineligible_summaries_list_ineligible_amount'])[2]");

   

		///ineligible combination reason
		private final By agedpastdue_xpath=By.xpath("//td[text()='Aged: Past Due Days']");
		private final By agedpastineliamnmt_xpath=By.xpath("//td[text()='3,800.00']");
		private final By crossagedreason_xpath=By.xpath("//td[text()='Cross Aged %']");
		private final By crossagedamnt_xpath=By.xpath("//td[text()='(600.00)']");
		private final By crossagedamnt16_xpath=By.xpath("//td[text()='45,050.00']");
		private final By crossagedamnt17_xpath=By.xpath("//td[text()='(4,950.00)']");
		private final By agedcreditmsg_xpath=By.xpath("//p[@style='display: table; color: red;']");
		private final By crossagedamnt1_xpath=By.xpath("//td[text()='(2,725.00)']");
		private final By crossagedamnt2_xpath=By.xpath("//td[text()='(4,350.00)']");
		private final By crossagedamnt3_xpath=By.xpath("//td[text()='400.00']");
		private final By agedpastineliamnmt1_xpath=By.xpath("//td[text()='4,900.00']");
		private final By agedpastineliamnmt2_xpath=By.xpath("//td[text()='(1,950.00)']");
		private final By agedpastineliamnmt3_xpath=By.xpath("//td[text()='(1,350.00)']");
		private final By crossagedamnt4_xpath=By.xpath("//td[text()='(1,700.00)']");
		private final By crossagedamnt5_xpath=By.xpath("//td[text()='(3,825.00)']");
		private final By crossagedamnt6_xpath=By.xpath("//td[text()='(5,450.00)']");
		private final By crossagedamnt7_xpath=By.xpath("//td[text()='(700.00)']");
		private final By crossagedamnt8_xpath=By.xpath("//td[text()='(450.00)']");
		private final By crossagedamnt9_xpath=By.xpath("//td[text()='950.00']");
		private final By crossagedamnt10_xpath=By.xpath("//td[text()='(1,050.00)']");
		private final By crossagedamnt11_xpath=By.xpath("//td[text()='350.00']");
		private final By agedcreditreason_xpath=By.xpath("//td[text()='Aged Credit Item']");
		private final By agedcreditamnt_xpath=By.xpath("//td[text()='(4,950.00)']");
		private final By agedcreditamnt1_xpath=By.xpath("//td[text()='4,850.00']");
		private final By agedcreditamnt2_xpath=By.xpath("//td[text()='200.00']");
		private final By negagedcredit_xpath=By.xpath("//span[text()='(13300)']");
		private final By negagedcredit1_xpath=By.xpath("//span[text()='(5750)']");
		private final By negagedcredit2_xpath=By.xpath("//span[text()='(6250)']");
		private final By negagedcredit3_xpath=By.xpath("//span[text()='(300)']");
		private final By negagedcredit4_xpath=By.xpath("//span[text()='(800)']");
		private final By agedcreditamnt4_xpath=By.xpath("//td[text()='1,300.00']");
		private final By agedpastineliamnmt4_xpath=By.xpath("//td[text()='2,900.00']");
		private final By agedpastineliamnmt5_xpath=By.xpath("//td[text()='3,500.00']");
		private final By crossagedamnt13_xpath=By.xpath("//td[text()='(1,200.00)']");
		private final By crossagedamnt12_xpath=By.xpath("//td[text()='(3,550.00)']");
		private final By crossagedamnt14_xpath=By.xpath("//td[text()='(200.00)']");
		private final By crossagedamnt15_xpath=By.xpath("//td[text()='(4,150.00)']");
		
	//excluded reason
		private final By excludedreson_xpath=By.xpath("//td[text()='Excluded']");
		private final By excludeamnt_xpath=By.xpath("(//td[text()='8,100.00'])[1]");
		
		
		///retention reason
		private final By retentionreason_xpath=By.xpath("//td[text()='Retention']");
		private final By retentionamnt_xpath=By.xpath("(//td[text()='1,500.00'])[1]");
		private final By retentionamnt1_xpath=By.xpath("(//td[text()='22,000.00'])[1]");
		private final By retentionamnt2_xpath=By.xpath("(//td[text()='50.00'])[1]");
		private final By retentiontotal_xpath=By.xpath("//td[text()='Totals']");
		private final By retentionamnt3_xpath=By.xpath("//td[text()='0.00']");
		


	//ineligible customeer

		//private final By ineligibleamnt_xpath=By.xpath("(//td[@aria-describedby='ineligible_summaries_list_ineligible_amount'])[2]");


		private final By ineligibleamnt_xpath=By.xpath("(//td[text()='6,250.00'])[2]");
		private final By ineligiblereason_xpath=By.xpath("//td[text()='Ineligible Customer']");
		private final By inetotal_xpath=By.xpath("//td[text()='Totals']");
		private final By ineliamnt_xpath=By.xpath("//td[text()='0.00']");

		private final By concentration_xpath=By.xpath("//td[contains(text(),'Concentration %')]");
		private final By concamnt_xpath=By.xpath("//td[text()='21,925.00']");
		private final By agedpastamnt_xpath=By.xpath("//td[text()='28,400.00']");
		private final By exceedcredit_xpath=By.xpath("//td[text()='Exceeds Credit Limit']");
		private final By inelicust_xpath=By.xpath("//td[text()='Ineligible Customer']");
		private final By exceedcreditamnt_xpath=By.xpath("//td[text()='28,075.00']");
		private final By exceedcreditamnt1_xpath=By.xpath("//td[text()='75,000.00']");
		private final By agedpastamnt1_xpath=By.xpath("//td[text()='5,400.00']");
		private final By exceedcreditamnt2_xpath=By.xpath("//td[text()='50,000.00']");
		private final By inelicust2_xpath=By.xpath("//td[text()='77,000.00']");
		private final By inelicust3_xpath=By.xpath("//td[text()='2,000.00']");
		

		//////excluded reason
		private final By excludeamnt1_xpath=By.xpath("(//td[text()='3,000.00'])[1]");
		private final By excludeamnt2_xpath=By.xpath("(//td[text()='3,500.00'])[1]");
		private final By excludeamnt3_xpath=By.xpath("(//td[text()='2,500.00'])[1]");
		private final By excludeamnt4_xpath=By.xpath("(//td[text()='15,900.00'])[1]");
		private final By excludeamnt5_xpath=By.xpath("(//td[text()='16,500.00'])[1]");
		private final By excludeamnt6_xpath=By.xpath("(//td[text()='5,000.00'])[1]");
		private final By excludeamnt7_xpath=By.xpath("(//td[text()='(6,600.00)'])[1]");
		private final By agedpastamnt2_xpath=By.xpath("//td[contains(text(),'66,000.00')]");
		
		//cyncs_4462
		private final By agedpastdueamnt_xpath=By.xpath("(//td[contains(text(),'126,750.00')])[1]");
        private final By selectoption_xpath=By.xpath("//select[@id='collateral_id']");
        private final By addaButton_xpath=By.xpath("//span[@class='ui-icon ui-icon ui-icon-plus']");
        private final By ineligiblereasons_xpath=By.xpath("//select[@name='ineligibility_reason_id']");
        private final By inelig_cync_value_xpath=By.xpath("//input[@id='jqg1_ineligible_amount']");
        private final By inelig_client_value_xpath=By.xpath("//input[@id='jqg1_client_ineligible_amount']");
        private final By savebtn_xpath=By.xpath("//span[@class='ui-icon ui-icon ui-icon-disk']");
        private final By concentrationamnt_xpath=By.xpath("(//td[text()='200.00'])[1]");
        private final By totaldis_xpath=By.xpath("//td[contains(@role,'gridcell')][contains(text(),'Totals')]");
        private final By totalamnt_xpath=By.xpath("(//td[text()='126,950.00'])[1]");
        private final By agedpastdueamnt1_xpath=By.xpath("(//td[contains(text(),'0.00')])[1]");
        private final By concentrationamnt1_xpath=By.xpath("(//td[contains(text(),'8,000.00')])[1]");
        private final By totalamnt1_xpath=By.xpath("(//td[text()='8,000.00'])[1]");
        private final By delete_xpath=By.xpath("//span[@class='ui-icon ui-icon-trash']");
        
        private final By checkbox_xpath=By.xpath("//input[@role='checkbox']");
        
        private final By deletepopup_xpath=By.xpath("//a[@id='dData']");
        
public ReceivableAgingPage(WebDriver driver) {
	super(driver);

	try {
		Thread.sleep(1000);
	} catch (Exception e) {

		e.printStackTrace();
	}
	if (!driver.findElement(receivableAgingPage_xpath).getText().trim()
			.equals("Receivable Aging")) {
		throw new SkipException("Receivable Aging couldn't open.");
	}
}
public  boolean verifyIneligibleExcludedReasonReceivableAging(String ReasonData){
	try{
	WebElement verifyIneligibilityReasonWebE=new WebDriverWait(driver,20)
	.until(ExpectedConditions.visibilityOfElementLocated(excludedreson_xpath));
	Thread.sleep(100);
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
public  boolean verifyIneligibleExcludeAmountReceivableAging2(String ReasonAmount){
	try{
	WebElement verifyIneligibilityAmountWebE=new WebDriverWait(driver,20)
	.until(ExpectedConditions.visibilityOfElementLocated(excludeamnt3_xpath));
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
public  boolean verifyIneligibleExcludeAmountReceivableAging5(String ReasonAmount){
	try{
	WebElement verifyIneligibilityAmountWebE=new WebDriverWait(driver,20)
	.until(ExpectedConditions.visibilityOfElementLocated(excludeamnt6_xpath));
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
public  boolean verifyIneligibleExcludeAmountReceivableAging6(String ReasonAmount){
	try{
	WebElement verifyIneligibilityAmountWebE=new WebDriverWait(driver,20)
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
public  boolean verifyIneligibleExcludeAmountReceivableAging4(String ReasonAmount){
	try{
	WebElement verifyIneligibilityAmountWebE=new WebDriverWait(driver,20)
	.until(ExpectedConditions.visibilityOfElementLocated(excludeamnt5_xpath));
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
public  boolean verifyIneligibleExcludeAmountReceivableAging3(String ReasonAmount){
	try{
	WebElement verifyIneligibilityAmountWebE=new WebDriverWait(driver,20)
	.until(ExpectedConditions.visibilityOfElementLocated(excludeamnt4_xpath));
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
public  boolean verifyIneligibleExcludeAmountReceivableAging1(String ReasonAmount){
	try{
	WebElement verifyIneligibilityAmountWebE=new WebDriverWait(driver,20)
	.until(ExpectedConditions.visibilityOfElementLocated(excludeamnt2_xpath));
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
public  boolean verifyIneligibleExcludeAmountReceivableAging(String ReasonAmount){
	try{
	WebElement verifyIneligibilityAmountWebE=new WebDriverWait(driver,20)
	.until(ExpectedConditions.visibilityOfElementLocated(excludeamnt1_xpath));
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
public  boolean verifyIneligibleconcentrationReasonReceivableAging(String ReasonData){
	try{
	WebElement verifyIneligibilityReasonWebE=new WebDriverWait(driver,10)
	.until(ExpectedConditions.visibilityOfElementLocated(concentration_xpath));
	Thread.sleep(100);
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
public  boolean verifyIneligibleconcentrationAmountReceivableAging(String ReasonAmount){
	try{
	WebElement verifyIneligibilityAmountWebE=new WebDriverWait(driver,10)
	.until(ExpectedConditions.visibilityOfElementLocated(concamnt_xpath));
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
public  boolean verifyIneligibleagedpastdueAmountReceivableAging(String ReasonAmount1){
	try{
	WebElement verifyIneligibilityAmountWebE=new WebDriverWait(driver,10)
	.until(ExpectedConditions.visibilityOfElementLocated(agedpastamnt_xpath));
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
public  boolean verifyIneligibleagedpastdueAmountReceivableAging2(String ReasonAmount1){
	try{
	WebElement verifyIneligibilityAmountWebE=new WebDriverWait(driver,20)
	.until(ExpectedConditions.visibilityOfElementLocated(agedpastamnt2_xpath));
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
public  boolean verifyIneligibleagedpastdueAmountReceivableAging_cyncs4462(String ReasonAmount1){
	try{
	WebElement verifyIneligibilityAmountWebE=new WebDriverWait(driver,20)
	.until(ExpectedConditions.visibilityOfElementLocated(agedpastdueamnt_xpath));
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
public  boolean verifyIneligibleagedpastdueAmountReceivableAging1(String ReasonAmount1){
	try{
	WebElement verifyIneligibilityAmountWebE=new WebDriverWait(driver,10)
	.until(ExpectedConditions.visibilityOfElementLocated(agedpastamnt1_xpath));
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
public  boolean verifyIneligibleIneligiblecustReasonReceivableAging(String ReasonData2){
	try{
	WebElement verifyIneligibilityReasonWebE=new WebDriverWait(driver,10)
	.until(ExpectedConditions.visibilityOfElementLocated(inelicust_xpath));
	Thread.sleep(100);
	String ActualReason = verifyIneligibilityReasonWebE.getText().trim();
	if(ActualReason.equalsIgnoreCase(ReasonData2))
	{
		System.out.println(ReasonData2);
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
public  boolean verifyIneligibleExceedcreditlimitReasonReceivableAging(String ReasonData2){
	try{
	WebElement verifyIneligibilityReasonWebE=new WebDriverWait(driver,10)
	.until(ExpectedConditions.visibilityOfElementLocated(exceedcredit_xpath));
	Thread.sleep(100);
	String ActualReason = verifyIneligibilityReasonWebE.getText().trim();
	if(ActualReason.equalsIgnoreCase(ReasonData2))
	{
		System.out.println(ReasonData2);
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
public  boolean verifyIneligiblecustomerAmountReceivableAging3(String ReasonAmount3){
	try{
	WebElement verifyIneligibilityAmountWebE=new WebDriverWait(driver,10)
	.until(ExpectedConditions.visibilityOfElementLocated(inelicust3_xpath));
	Thread.sleep(100);
	String ActualAmount = verifyIneligibilityAmountWebE.getText();
	if(ActualAmount.equalsIgnoreCase(ReasonAmount3))
	{
		System.out.println(ReasonAmount3);
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
public  boolean verifyIneligiblecustomerAmountReceivableAging2(String ReasonAmount3){
	try{
	WebElement verifyIneligibilityAmountWebE=new WebDriverWait(driver,10)
	.until(ExpectedConditions.visibilityOfElementLocated(inelicust2_xpath));
	Thread.sleep(100);
	String ActualAmount = verifyIneligibilityAmountWebE.getText();
	if(ActualAmount.equalsIgnoreCase(ReasonAmount3))
	{
		System.out.println(ReasonAmount3);
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
public  boolean verifyIneligibleexceedcreditAmountReceivableAging2(String ReasonAmount3){
	try{
	WebElement verifyIneligibilityAmountWebE=new WebDriverWait(driver,10)
	.until(ExpectedConditions.visibilityOfElementLocated(exceedcreditamnt2_xpath));
	Thread.sleep(100);
	String ActualAmount = verifyIneligibilityAmountWebE.getText();
	if(ActualAmount.equalsIgnoreCase(ReasonAmount3))
	{
		System.out.println(ReasonAmount3);
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
public  boolean verifyIneligibleexceedcreditAmountReceivableAging1(String ReasonAmount2){
	try{
	WebElement verifyIneligibilityAmountWebE=new WebDriverWait(driver,10)
	.until(ExpectedConditions.visibilityOfElementLocated(exceedcreditamnt1_xpath));
	Thread.sleep(100);
	String ActualAmount = verifyIneligibilityAmountWebE.getText();
	if(ActualAmount.equalsIgnoreCase(ReasonAmount2))
	{
		System.out.println(ReasonAmount2);
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
public  boolean verifyIneligibleexceedcreditAmountReceivableAging(String ReasonAmount2){
	try{
	WebElement verifyIneligibilityAmountWebE=new WebDriverWait(driver,10)
	.until(ExpectedConditions.visibilityOfElementLocated(exceedcreditamnt_xpath));
	Thread.sleep(100);
	String ActualAmount = verifyIneligibilityAmountWebE.getText();
	if(ActualAmount.equalsIgnoreCase(ReasonAmount2))
	{
		System.out.println(ReasonAmount2);
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
public  boolean verifyIneligibleamntagedcreditReceivableAging(String ReasonData2){
	try{
	WebElement verifyIneligibilityReasonWebE=new WebDriverWait(driver,10)
	.until(ExpectedConditions.visibilityOfElementLocated(negagedcredit_xpath));
	Thread.sleep(100);
	String ActualReason = verifyIneligibilityReasonWebE.getText().trim();
	if(ActualReason.equalsIgnoreCase(ReasonData2))
	{
		System.out.println(ReasonData2);
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
public  boolean verifyIneligibleamntagedcreditReceivableAging1(String ReasonData2){
	try{
	WebElement verifyIneligibilityReasonWebE=new WebDriverWait(driver,10)
	.until(ExpectedConditions.visibilityOfElementLocated(negagedcredit1_xpath));
	Thread.sleep(100);
	String ActualReason = verifyIneligibilityReasonWebE.getText().trim();
	if(ActualReason.equalsIgnoreCase(ReasonData2))
	{
		System.out.println(ReasonData2);
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
public  boolean verifyIneligibleamntagedcreditReceivableAging2(String ReasonData2){
	try{
	WebElement verifyIneligibilityReasonWebE=new WebDriverWait(driver,10)
	.until(ExpectedConditions.visibilityOfElementLocated(negagedcredit2_xpath));
	Thread.sleep(100);
	String ActualReason = verifyIneligibilityReasonWebE.getText().trim();
	if(ActualReason.equalsIgnoreCase(ReasonData2))
	{
		System.out.println(ReasonData2);
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
public  boolean verifyIneligibleamntagedcreditReceivableAging3(String ReasonData2){
	try{
	WebElement verifyIneligibilityReasonWebE=new WebDriverWait(driver,10)
	.until(ExpectedConditions.visibilityOfElementLocated(negagedcredit3_xpath));
	Thread.sleep(100);
	String ActualReason = verifyIneligibilityReasonWebE.getText().trim();
	if(ActualReason.equalsIgnoreCase(ReasonData2))
	{
		System.out.println(ReasonData2);
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
public  boolean verifyIneligibleamntagedcreditReceivableAging4(String ReasonData2){
	try{
	WebElement verifyIneligibilityReasonWebE=new WebDriverWait(driver,10)
	.until(ExpectedConditions.visibilityOfElementLocated(negagedcredit4_xpath));
	Thread.sleep(100);
	String ActualReason = verifyIneligibilityReasonWebE.getText().trim();
	if(ActualReason.equalsIgnoreCase(ReasonData2))
	{
		System.out.println(ReasonData2);
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
public  boolean verifyIneligibleReasonagedcreditReceivableAging2(String ReasonData2){
	try{
	WebElement verifyIneligibilityReasonWebE=new WebDriverWait(driver,10)
	.until(ExpectedConditions.visibilityOfElementLocated(agedcreditreason_xpath));
	Thread.sleep(100);
	String ActualReason = verifyIneligibilityReasonWebE.getText().trim();
	if(ActualReason.equalsIgnoreCase(ReasonData2))
	{
		System.out.println(ReasonData2);
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
public  boolean verifyIneligibleAmountagedcreditReceivableAging(String ReasonAmount3){
	try{
	WebElement verifyIneligibilityAmountWebE=new WebDriverWait(driver,10)
	.until(ExpectedConditions.visibilityOfElementLocated(agedcreditamnt_xpath));
	Thread.sleep(100);
	String ActualAmount = verifyIneligibilityAmountWebE.getText();
	if(ActualAmount.equalsIgnoreCase(ReasonAmount3))
	{
		System.out.println(ReasonAmount3);
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
public  boolean verifyIneligibleAmountagedcreditReceivableAging3(String ReasonAmount3){
	try{
	WebElement verifyIneligibilityAmountWebE=new WebDriverWait(driver,10)
	.until(ExpectedConditions.visibilityOfElementLocated(agedcreditamnt4_xpath));
	Thread.sleep(100);
	String ActualAmount = verifyIneligibilityAmountWebE.getText();
	if(ActualAmount.equalsIgnoreCase(ReasonAmount3))
	{
		System.out.println(ReasonAmount3);
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
public  boolean verifyIneligibleAmountagedcreditReceivableAging1(String ReasonAmount3){
	try{
	WebElement verifyIneligibilityAmountWebE=new WebDriverWait(driver,10)
	.until(ExpectedConditions.visibilityOfElementLocated(agedcreditamnt1_xpath));
	Thread.sleep(100);
	String ActualAmount = verifyIneligibilityAmountWebE.getText();
	if(ActualAmount.equalsIgnoreCase(ReasonAmount3))
	{
		System.out.println(ReasonAmount3);
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
public  boolean verifyIneligibleAmountagedcreditReceivableAging2(String ReasonAmount3){
	try{
	WebElement verifyIneligibilityAmountWebE=new WebDriverWait(driver,10)
	.until(ExpectedConditions.visibilityOfElementLocated(agedcreditamnt2_xpath));
	Thread.sleep(100);
	String ActualAmount = verifyIneligibilityAmountWebE.getText();
	if(ActualAmount.equalsIgnoreCase(ReasonAmount3))
	{
		System.out.println(ReasonAmount3);
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

public  boolean verifyIneligibleAmountcrossagedReceivableAging3(String ReasonAmount1){
	try{
	WebElement verifyIneligibilityAmountWebE=new WebDriverWait(driver,10)
	.until(ExpectedConditions.visibilityOfElementLocated(crossagedamnt3_xpath));
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
public  boolean verifyIneligibleAmountcrossagedReceivableAging7(String ReasonAmount2){
	try{
	WebElement verifyIneligibilityAmountWebE=new WebDriverWait(driver,10)
	.until(ExpectedConditions.visibilityOfElementLocated(crossagedamnt7_xpath));
	Thread.sleep(100);
	String ActualAmount = verifyIneligibilityAmountWebE.getText();
	if(ActualAmount.equalsIgnoreCase(ReasonAmount2))
	{
		System.out.println(ReasonAmount2);
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
public  boolean verifyIneligibleAmountcrossagedReceivableAging6(String ReasonAmount2){
	try{
	WebElement verifyIneligibilityAmountWebE=new WebDriverWait(driver,10)
	.until(ExpectedConditions.visibilityOfElementLocated(crossagedamnt6_xpath));
	Thread.sleep(100);
	String ActualAmount = verifyIneligibilityAmountWebE.getText();
	if(ActualAmount.equalsIgnoreCase(ReasonAmount2))
	{
		System.out.println(ReasonAmount2);
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
public  boolean verifyIneligibleAmountcrossagedReceivableAging8(String ReasonAmount2){
	try{
	WebElement verifyIneligibilityAmountWebE=new WebDriverWait(driver,10)
	.until(ExpectedConditions.visibilityOfElementLocated(crossagedamnt8_xpath));
	Thread.sleep(100);
	String ActualAmount = verifyIneligibilityAmountWebE.getText();
	if(ActualAmount.equalsIgnoreCase(ReasonAmount2))
	{
		System.out.println(ReasonAmount2);
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
public  boolean verifyIneligibleAmountcrossagedReceivableAging10(String ReasonAmount2){
	try{
	WebElement verifyIneligibilityAmountWebE=new WebDriverWait(driver,10)
	.until(ExpectedConditions.visibilityOfElementLocated(crossagedamnt10_xpath));
	Thread.sleep(100);
	String ActualAmount = verifyIneligibilityAmountWebE.getText();
	if(ActualAmount.equalsIgnoreCase(ReasonAmount2))
	{
		System.out.println(ReasonAmount2);
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
public  boolean verifyIneligibleAmountcrossagedReceivableAging11(String ReasonAmount2){
	try{
	WebElement verifyIneligibilityAmountWebE=new WebDriverWait(driver,10)
	.until(ExpectedConditions.visibilityOfElementLocated(crossagedamnt11_xpath));
	Thread.sleep(100);
	String ActualAmount = verifyIneligibilityAmountWebE.getText();
	if(ActualAmount.equalsIgnoreCase(ReasonAmount2))
	{
		System.out.println(ReasonAmount2);
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
public  boolean verifyIneligibleAmountcrossagedReceivableAging9(String ReasonAmount2){
	try{
	WebElement verifyIneligibilityAmountWebE=new WebDriverWait(driver,10)
	.until(ExpectedConditions.visibilityOfElementLocated(crossagedamnt9_xpath));
	Thread.sleep(100);
	String ActualAmount = verifyIneligibilityAmountWebE.getText();
	if(ActualAmount.equalsIgnoreCase(ReasonAmount2))
	{
		System.out.println(ReasonAmount2);
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
public  boolean verifyIneligibleAmountcrossagedReceivableAging5(String ReasonAmount2){
	try{
	WebElement verifyIneligibilityAmountWebE=new WebDriverWait(driver,10)
	.until(ExpectedConditions.visibilityOfElementLocated(crossagedamnt5_xpath));
	Thread.sleep(100);
	String ActualAmount = verifyIneligibilityAmountWebE.getText();
	if(ActualAmount.equalsIgnoreCase(ReasonAmount2))
	{
		System.out.println(ReasonAmount2);
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
public  boolean verifyIneligibleAmountcrossagedReceivableAging4(String ReasonAmount1){
	try{
	WebElement verifyIneligibilityAmountWebE=new WebDriverWait(driver,10)
	.until(ExpectedConditions.visibilityOfElementLocated(crossagedamnt4_xpath));
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

public  boolean verifyIneligibleReasoncrossagedReceivableAging(String ReasonData1){
	try{
	WebElement verifyIneligibilityReasonWebE=new WebDriverWait(driver,10)
	.until(ExpectedConditions.visibilityOfElementLocated(crossagedreason_xpath));
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
public  boolean verifyIneligibleAmountcrossagedReceivableAging2(String ReasonAmount1){
	try{
	WebElement verifyIneligibilityAmountWebE=new WebDriverWait(driver,10)
	.until(ExpectedConditions.visibilityOfElementLocated(crossagedamnt2_xpath));
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
public  boolean verifyIneligibleAmountcrossagedReceivableAging1(String ReasonAmount1){
	try{
	WebElement verifyIneligibilityAmountWebE=new WebDriverWait(driver,10)
	.until(ExpectedConditions.visibilityOfElementLocated(crossagedamnt1_xpath));
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
public  boolean verifyIneligibleAmountcrossagedReceivableAging17(String ReasonAmount2){
	try{
	WebElement verifyIneligibilityAmountWebE=new WebDriverWait(driver,1)
	.until(ExpectedConditions.visibilityOfElementLocated(crossagedamnt17_xpath));
	Thread.sleep(100);
	String ActualAmount = verifyIneligibilityAmountWebE.getText();
	if(ActualAmount.equalsIgnoreCase(ReasonAmount2))
	{
		System.out.println(ReasonAmount2);
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
public  boolean verifyIneligibleAmountcrossagedReceivableAging16(String ReasonAmount1){
	try{
	WebElement verifyIneligibilityAmountWebE=new WebDriverWait(driver,10)
	.until(ExpectedConditions.visibilityOfElementLocated(crossagedamnt16_xpath));
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
public  boolean verifyIneligibleAmountcrossagedReceivableAging(String ReasonAmount1){
	try{
	WebElement verifyIneligibilityAmountWebE=new WebDriverWait(driver,10)
	.until(ExpectedConditions.visibilityOfElementLocated(crossagedamnt_xpath));
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
public boolean  Verifyineligibleagedcreditreason()
{
try{
	WebElement HeaderWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(agedcreditmsg_xpath));
	HeaderWebEelement.isDisplayed();
	Thread.sleep(1000);
	return true;
}
catch(Exception ex){
	return false;

}


}
public  boolean verifyIneligibleReasonReceivableAging(String ReasonData){
	try{
	WebElement verifyIneligibilityReasonWebE=new WebDriverWait(driver,10)
	.until(ExpectedConditions.visibilityOfElementLocated(agedpastdue_xpath));
	Thread.sleep(100);
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
public  boolean verifyIneligibleretentionReasonReceivableAging1(String ReasonData){
	try{
	WebElement verifyIneligibilityReasonWebE=new WebDriverWait(driver,10)
	.until(ExpectedConditions.visibilityOfElementLocated(retentiontotal_xpath));
	Thread.sleep(100);
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
public  boolean verifyIneligibleretentionReasonReceivableAging(String ReasonData){
	try{
	WebElement verifyIneligibilityReasonWebE=new WebDriverWait(driver,10)
	.until(ExpectedConditions.visibilityOfElementLocated(retentionreason_xpath));
	Thread.sleep(100);
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
public  boolean verifyIneligibleExcludedReasonReceivableaging(String ReasonData){
	try{
	WebElement verifyIneligibilityReasonWebE=new WebDriverWait(driver,10)
	.until(ExpectedConditions.visibilityOfElementLocated(excludedreson_xpath));
	Thread.sleep(100);
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
	WebElement verifyIneligibilityAmountWebE=new WebDriverWait(driver,20)
	.until(ExpectedConditions.visibilityOfElementLocated(excludeamnt4_xpath));
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

public  boolean verifyIneligibleAmountReceivableAging1(String ReasonAmount){
	try{
	WebElement verifyIneligibilityAmountWebE=new WebDriverWait(driver,10)
	.until(ExpectedConditions.visibilityOfElementLocated(agedpastineliamnmt1_xpath));
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
public  boolean verifyIneligibleAmountReceivableAging2(String ReasonAmount){
	try{
	WebElement verifyIneligibilityAmountWebE=new WebDriverWait(driver,10)
	.until(ExpectedConditions.visibilityOfElementLocated(agedpastineliamnmt2_xpath));
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
public  boolean verifyIneligibleAmountReceivableAging3(String ReasonAmount){
	try{
	WebElement verifyIneligibilityAmountWebE=new WebDriverWait(driver,10)
	.until(ExpectedConditions.visibilityOfElementLocated(agedpastineliamnmt3_xpath));
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
public  boolean verifyIneligibleAmountReceivableAging(String ReasonAmount){
	try{
	WebElement verifyIneligibilityAmountWebE=new WebDriverWait(driver,10)
	.until(ExpectedConditions.visibilityOfElementLocated(agedpastineliamnmt_xpath));
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
public  boolean verifyIneligibleretentionAmountReceivableAging3(String ReasonAmount){
	try{
	WebElement verifyIneligibilityAmountWebE=new WebDriverWait(driver,10)
	.until(ExpectedConditions.visibilityOfElementLocated(retentionamnt3_xpath));
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
public  boolean verifyIneligibleretentionAmountReceivableAging2(String ReasonAmount){
	try{
	WebElement verifyIneligibilityAmountWebE=new WebDriverWait(driver,10)
	.until(ExpectedConditions.visibilityOfElementLocated(retentionamnt2_xpath));
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
public  boolean verifyIneligibleretentionAmountReceivableAging(String ReasonAmount){
	try{
	WebElement verifyIneligibilityAmountWebE=new WebDriverWait(driver,10)
	.until(ExpectedConditions.visibilityOfElementLocated(retentionamnt_xpath));
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
public  boolean verifyIneligibleretentionAmountReceivableAging1(String ReasonAmount){
	try{
	WebElement verifyIneligibilityAmountWebE=new WebDriverWait(driver,10)
	.until(ExpectedConditions.visibilityOfElementLocated(retentionamnt1_xpath));
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
public  boolean verifyIneligibleExcludedAmountReceivableAging(String ReasonAmount){
	try{
	WebElement verifyIneligibilityAmountWebE=new WebDriverWait(driver,10)
	.until(ExpectedConditions.visibilityOfElementLocated(excludeamnt_xpath));
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
public boolean  VerifyIneligibleamnt()
{
try{
	WebElement HeaderWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(ineligibleamnt_xpath));
	HeaderWebEelement.click();
	Thread.sleep(1000);
	return true;
}
catch(Exception ex){
	return false;

}


}
public  boolean verifyIneligibilityReasonReceivableAgingScreenunapp1(String ReasonData){
	try{
	WebElement verifyIneligibilityReasonWebE=new WebDriverWait(driver,10)
	.until(ExpectedConditions.visibilityOfElementLocated(inetotal_xpath));
	Thread.sleep(100);
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
    

	public  boolean verifyIneligibilityAmountReceivableAgingScreenunapp1(String ReasonAmount){
		try{
		WebElement verifyIneligibilityAmountWebE=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(ineliamnt_xpath));
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
public  boolean verifyIneligibilityReasonReceivableAgingScreenunapp(String ReasonData){
	try{
	WebElement verifyIneligibilityReasonWebE=new WebDriverWait(driver,10)
	.until(ExpectedConditions.visibilityOfElementLocated(inetotal_xpath));
	Thread.sleep(100);
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
    

	public  boolean verifyIneligibilityAmountReceivableAgingScreenunapp(String ReasonAmount){
		try{
		WebElement verifyIneligibilityAmountWebE=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(ineliamnt_xpath));
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
public  boolean verifyIneligibilityReasonReceivableAgingScreen(String ReasonData){
	try{
	WebElement verifyIneligibilityReasonWebE=new WebDriverWait(driver,10)
	.until(ExpectedConditions.visibilityOfElementLocated(ineligiblereason_xpath));
	Thread.sleep(100);
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
    

	public  boolean verifyIneligibilityAmountReceivableAgingScreen(String ReasonAmount){
		try{
		WebElement verifyIneligibilityAmountWebE=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(ineligibleamnt_xpath));
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
	    


public boolean bbcDateValidation(String expected){
	try {
		WebElement BBCDateWebElement = new WebDriverWait(
				driver, 10)
				.until(ExpectedConditions
						.visibilityOfElementLocated(bbcDate_xpath));
		
		String actual = BBCDateWebElement.getText().trim();
		if (actual.equals(expected))
			return true;
		else
			return false;

	} catch (Exception e) {
		return false;
	}
}

public boolean verifyFutureAmount(String expected) {
	try {
		WebElement futureAmountWebElement = new WebDriverWait(
				driver, 10)
				.until(ExpectedConditions
						.visibilityOfElementLocated(futureAmount_xpath));
		WebElement futureWebElement = new WebDriverWait(
				driver, 10)
				.until(ExpectedConditions
						.visibilityOfElementLocated(future_xpath));

		futureWebElement.isDisplayed();
		String actual = futureAmountWebElement.getAttribute("value");
		if (actual.equals(expected))
			return true;
		else
			return false;

	} catch (Exception e) {
		return false;
	}
}
public boolean verifyCurrentAmount(String expected) {
	try {
		WebElement currentAmountWebElement = new WebDriverWait(
				driver, 10)
				.until(ExpectedConditions
						.visibilityOfElementLocated(currentAmount_xpath));
		WebElement currentWebElement = new WebDriverWait(
				driver, 10)
				.until(ExpectedConditions
						.visibilityOfElementLocated(current_xpath));

		currentWebElement.isDisplayed();
		String actual = currentAmountWebElement.getAttribute("value");
		if (actual.equals(expected))
			return true;
		else
			return false;

	} catch (Exception e) {
		return false;
	}
}
public boolean verifyOver30Amount(String expected) {
	try {
		WebElement over30AmountWebElement = new WebDriverWait(
				driver, 10)
				.until(ExpectedConditions
						.visibilityOfElementLocated(over30Amount_xpath));
		WebElement over30WebElement = new WebDriverWait(
				driver, 10)
				.until(ExpectedConditions
						.visibilityOfElementLocated(over30_xpath));

		over30WebElement.isDisplayed();
		String actual = over30AmountWebElement.getAttribute("value");
		if (actual.equals(expected))
			return true;
		else
			return false;

	} catch (Exception e) {
		return false;
	}
}
public boolean verifyOver60Amount(String expected) {
	try {
		WebElement Over60AmountWebElement = new WebDriverWait(
				driver, 10)
				.until(ExpectedConditions
						.visibilityOfElementLocated(over60Amount_xpath));
		WebElement Over60WebElement = new WebDriverWait(
				driver, 10)
				.until(ExpectedConditions
						.visibilityOfElementLocated(over60_xpath));

		Over60WebElement.isDisplayed();
		String actual = Over60AmountWebElement.getAttribute("value");
		if (actual.equals(expected))
			return true;
		else
			return false;

	} catch (Exception e) {
		return false;
	}
}
public boolean verifyOver90Amount(String expected) {
	try {
		WebElement Over90AmountWebElement = new WebDriverWait(
				driver, 10)
				.until(ExpectedConditions
						.visibilityOfElementLocated(over90Amount_xpath));
		WebElement Over90WebElement = new WebDriverWait(
				driver, 10)
				.until(ExpectedConditions
						.visibilityOfElementLocated(over90_xpath));

		Over90WebElement.isDisplayed();
		String actual = Over90AmountWebElement.getAttribute("value");
		if (actual.equals(expected))
			return true;
		else
			return false;

	} catch (Exception e) {
		return false;
	}
}
public boolean verifyOver120Amount(String expected) {
	try {
		WebElement Over120AmountWebElement = new WebDriverWait(
				driver, 10)
				.until(ExpectedConditions
						.visibilityOfElementLocated(over120Amount_xpath));
		WebElement Over120WebElement = new WebDriverWait(
				driver, 10)
				.until(ExpectedConditions
						.visibilityOfElementLocated(over120_xpath));

		Over120WebElement.isDisplayed();
		String actual = Over120AmountWebElement.getAttribute("value");
		if (actual.equals(expected))
			return true;
		else
			return false;

	} catch (Exception e) {
		return false;
	}
}
public boolean verifyTotalAmount(String expected) {
	try {
		WebElement totalAmountWebElement = new WebDriverWait(
				driver, 10)
				.until(ExpectedConditions
						.visibilityOfElementLocated(totalAmount_xpath));
		WebElement totalWebElement = new WebDriverWait(
				driver, 10)
				.until(ExpectedConditions
						.visibilityOfElementLocated(total_xpath));

		totalWebElement.isDisplayed();
		String actual = totalAmountWebElement.getAttribute("value");
		if (actual.equals(expected))
			return true;
		else
			return false;

	} catch (Exception e) {
		return false;
	}
}

public boolean verifyAgedPastDueDayaAmount(String expected) {
	try {
		WebElement AgedPastDueDayaWebElement = new WebDriverWait(
				driver, 10)
				.until(ExpectedConditions
						.visibilityOfElementLocated(agedPastDueDaya_xpath));
		WebElement AgedPastDueDayaAmountWebElement = new WebDriverWait(
				driver, 10)
				.until(ExpectedConditions
						.visibilityOfElementLocated(agedPastDueDayaAmoput_xpath));

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


public boolean verifyAgedPastDueDaysAmount_cyncs4462(String expected) {
	try {
		WebElement AgedPastDueDayaWebElement = new WebDriverWait(
				driver, 100)
				.until(ExpectedConditions
						.visibilityOfElementLocated(agedpastdue_xpath));
		WebElement AgedPastDueDayaAmountWebElement = new WebDriverWait(
				driver, 100)
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
		WebElement AgedPastDueDayaWebElement = new WebDriverWait(
				driver, 100)
				.until(ExpectedConditions
						.visibilityOfElementLocated(agedpastdue_xpath));
		WebElement AgedPastDueDayaAmountWebElement = new WebDriverWait(
				driver, 100)
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
public boolean verifyConcentrationAmount_cyncs4462(String expected1) {
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
		if (actual.equals(expected1))
			return true;
		else
			return false;

	} catch (Exception e) {
		return false;
	}
}
public boolean verifyConcentrationAmount_cyncs4462_1(String expected1) {
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
		if (actual.equals(expected1))
			return true;
		else
			return false;

	} catch (Exception e) {
		return false;
	}
}
public boolean verifyTotalIneligAmount_cyncs4462(String expected2) {
	try {
		WebElement AgedPastDueDayaWebElement = new WebDriverWait(
				driver, 100)
				.until(ExpectedConditions
						.visibilityOfElementLocated(totaldis_xpath));
		WebElement AgedPastDueDayaAmountWebElement = new WebDriverWait(
				driver, 100)
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
public boolean verifyTotalIneligAmount_cyncs4462_1(String expected2) {
	try {
		WebElement AgedPastDueDayaWebElement = new WebDriverWait(
				driver, 100)
				.until(ExpectedConditions
						.visibilityOfElementLocated(totaldis_xpath));
		WebElement AgedPastDueDayaAmountWebElement = new WebDriverWait(
				driver, 100)
				.until(ExpectedConditions
						.visibilityOfElementLocated(totalamnt1_xpath));

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

public  boolean selectoptionfrom_collateralnameDropdown(String value1) {
	try {
		WebElement DropdownWebEelement = new WebDriverWait(driver, 10)
		.until(ExpectedConditions.visibilityOfElementLocated(selectoption_xpath));
		Select sel = new Select(DropdownWebEelement);
		
		List<WebElement> list = sel.getOptions();
		
		for (WebElement ele : list) 
		{
			/*String data = ele.getText();
			System.out.println(data);*/
			if (ele.getText().equals(value1)) 
			{
		 		ele.click();
				//Thread.sleep(10000);
				
				 return true;
			}
		}
	} 
	catch (Exception ex)
	{
		return false;
	}
	return false;
	

}
public boolean clickOn_add()
{
try{
	WebElement editWebEelement=new WebDriverWait(driver,5)
		.until(ExpectedConditions.visibilityOfElementLocated(addaButton_xpath));
	editWebEelement.click();
	return true;
}
catch(Exception ex){
	return false;	
}
}
public boolean clickOn_checkbox()
{
try{
	WebElement editWebEelement=new WebDriverWait(driver,5)
		.until(ExpectedConditions.visibilityOfElementLocated(checkbox_xpath));
	editWebEelement.click();
	return true;
}
catch(Exception ex){
	return false;	
}
}
public boolean clickOn_deletepopup_concentration()
{
try{
	WebElement editWebEelement=new WebDriverWait(driver,5)
		.until(ExpectedConditions.visibilityOfElementLocated(deletepopup_xpath));
	editWebEelement.click();
	return true;
}
catch(Exception ex){
	return false;	
}
}
public boolean clickOn_delete_concentration()
{
try{
	WebElement editWebEelement=new WebDriverWait(driver,5)
		.until(ExpectedConditions.visibilityOfElementLocated(delete_xpath));
	editWebEelement.click();
	return true;
}
catch(Exception ex){
	return false;	
}
}
public boolean clickOn_save()
{
try{
	WebElement editWebEelement=new WebDriverWait(driver,5)
		.until(ExpectedConditions.visibilityOfElementLocated(savebtn_xpath));
	editWebEelement.click();
	return true;
}
catch(Exception ex){
	return false;	
}
}
public  boolean selectoptionfrom_ineligiblereasonsDropdown(String value2) {
	try {
		WebElement DropdownWebEelement = new WebDriverWait(driver, 10)
		.until(ExpectedConditions.visibilityOfElementLocated(ineligiblereasons_xpath));
		Select sel = new Select(DropdownWebEelement);
		
		List<WebElement> list = sel.getOptions();
		
		for (WebElement ele : list) 
		{
			/*String data = ele.getText();
			System.out.println(data);*/
			if (ele.getText().equals(value2)) 
			{
		 		ele.click();
				//Thread.sleep(10000);
				
				 return true;
			}
		}
	} 
	catch (Exception ex)
	{
		return false;
	}
	return false;
	

}

public boolean enter_cync_ineligible(String value3)
{
	try{

		WebElement textWebEelement=new WebDriverWait(driver,5).until(ExpectedConditions.visibilityOfElementLocated(inelig_cync_value_xpath));
		textWebEelement.click();
		textWebEelement.clear();
		textWebEelement.sendKeys(value3);
		return true;
	}
	catch(Exception ex){
		return false;
	}
}
public boolean enter_client_ineligible(String value4)
{
	try{

		WebElement textWebEelement=new WebDriverWait(driver,5).until(ExpectedConditions.visibilityOfElementLocated(inelig_client_value_xpath));
		textWebEelement.click();
		textWebEelement.clear();
		textWebEelement.sendKeys(value4);
		return true;
	}
	catch(Exception ex){
		return false;
	}
}
//Summary
public boolean collateralNameDisplay(){
	try{
		//Thread.sleep(5000);
		WebElement collateralNAmeWebElement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(collateralLabel_xpath));
		collateralNAmeWebElement.isDisplayed();
		System.out.println("collateralNameDisplay");
		return true;
		
	}
	catch(Exception e){
		
	}
	return false;
	
	}

public boolean bbcDateDisplay(){
	try{
		//Thread.sleep(5000);
		WebElement bbcDateWebElement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(bbcDateLabel_xpath));
		bbcDateWebElement.isDisplayed();
		System.out.println("bbcDateDisplay");
		return true;
		
	}
	catch(Exception e){
		
	}
	return false;
	
	}
public boolean futureDisplay(){
	try{
		//Thread.sleep(5000);
		WebElement fututreWebElement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(future_xpath));
		fututreWebElement.isDisplayed();
		System.out.println("futureDisplay");
		return true;
		
	}
	catch(Exception e){
		
	}
	return false;
	
	}
public boolean currentDisplay(){
	try{
		//Thread.sleep(5000);
		WebElement currentWebElement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(current_xpath));
		currentWebElement.isDisplayed();
		System.out.println("currentDisplay");
		return true;
		
	}
	catch(Exception e){
		
	}
	return false;
	
	}
public boolean over30Display(){
	try{
		//Thread.sleep(5000);
		WebElement over30WebElement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(over30_xpath));
		over30WebElement.isDisplayed();
		System.out.println("over30Display");
		return true;
		
	}
	catch(Exception e){
		
	}
	return false;
	
	}
public boolean over60Display(){
	try{
		//Thread.sleep(5000);
		WebElement over60WebElement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(over60_xpath));
		over60WebElement.isDisplayed();
		System.out.println("over60Display");
		return true;
		
	}
	catch(Exception e){
		
	}
	return false;
	
	}
public boolean over90Display(){
	try{
		//Thread.sleep(5000);
		WebElement over90WebElement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(over90_xpath));
		over90WebElement.isDisplayed();
		System.out.println("over90Display");
		return true;
		
	}
	catch(Exception e){
		
	}
	return false;
	
	}
public boolean over120Display(){
	try{
		//Thread.sleep(5000);
		WebElement over120WebElement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(over120_xpath));
		over120WebElement.isDisplayed();
		System.out.println("over120Display");
		return true;
		
	}
	catch(Exception e){
		
	}
	return false;
	
	}

public boolean retentionDisplay(){
	try{
		//Thread.sleep(5000);
		WebElement retentionWebElement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(retention_xpath));
		retentionWebElement.isDisplayed();
		System.out.println("retentionDisplay");
		return true;
		
	}
	catch(Exception e){
		
	}
	return false;
	
	}

public boolean arAdjustmentDisplay(){
	try{
		//Thread.sleep(5000);
		WebElement arAdjustmentWebElement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(arAdjustment_xpath));
		arAdjustmentWebElement.isDisplayed();
		System.out.println("arAdjustmentDisplay");
		return true;
		
	}
	catch(Exception e){
		
	}
	return false;
	
	}
public boolean totalDisplay(){
	try{
		//Thread.sleep(5000);
		WebElement totalWebElement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(totalLabel_xpath));
		totalWebElement.isDisplayed();
		System.out.println("totalDisplay");
		return true;
		
	}
	catch(Exception e){
		
	}
	return false;
	
	}
public boolean ineligibiltyReasonDisplay(){
	try{
		//Thread.sleep(5000);
		WebElement inelReasonWebElement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(ineligibiltyReasonLabel_xpath));
		inelReasonWebElement.isDisplayed();
		System.out.println("ineligibiltyReasonDisplay");
		return true;
		
	}
	catch(Exception e){
		
	}
	return false;
	
	}
public boolean ineligibiltyAmountDisplay(){
	try{
		//Thread.sleep(5000);
		WebElement inelAmountWebElement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(ineligibiltyAmountLabel_xpath));
		inelAmountWebElement.isDisplayed();
		System.out.println("ineligibiltyAmountDisplay");
		return true;
		
	}
	catch(Exception e){
		
	}
	return false;
	
	}

public boolean eomDisplay(){
	try{
		//Thread.sleep(5000);
		WebElement eomWebElement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(eomLabel_xpath));
		eomWebElement.isDisplayed();
		System.out.println("eomDisplay");
		return true;
		
	}
	catch(Exception e){
		
	}
	return false;
	
	}

public boolean eligibleAccRecDisplay(){
	try{
		//Thread.sleep(5000);
		WebElement eligibleWebElement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(eligibleAccRecLabel_xpath));
		eligibleWebElement.isDisplayed();
		System.out.println("eligibleAccRecDisplay");
		return true;
		
	}
	catch(Exception e){
		
	}
	return false;
	
	}

public boolean AccRecCollateralDisplay(){
	try{
		//Thread.sleep(5000);
		WebElement AccountsWebElement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(accRecevCollateral_xpath));
		AccountsWebElement.isDisplayed();
		System.out.println("AccRecCollateralDisplay");
		return true;
		
	}
	catch(Exception e){
		
	}
	return false;
	
	}

public boolean verifyRetentionAmount(String expected) {
	try {
		WebElement retentionAmountWebElement = new WebDriverWait(
				driver, 10)
				.until(ExpectedConditions
						.visibilityOfElementLocated(retentionValue_xpath));
		WebElement retentionWebElement = new WebDriverWait(
				driver, 10)
				.until(ExpectedConditions
						.visibilityOfElementLocated(retention_xpath));

		retentionWebElement.isDisplayed();
		String actual = retentionAmountWebElement.getAttribute("value");
		if (actual.equals(expected))
			return true;
		else
			return false;

	} catch (Exception e) {
		return false;
	}
}

public boolean verifyarAdjustmentAmount(String expected) {
	try {
		WebElement arAdjustmentAmountWebElement = new WebDriverWait(
				driver, 10)
				.until(ExpectedConditions
						.visibilityOfElementLocated(arAdjustmentAmount_xpath));
		WebElement arAdjustmentWebElement = new WebDriverWait(
				driver, 10)
				.until(ExpectedConditions
						.visibilityOfElementLocated(arAdjustment_xpath));

		arAdjustmentWebElement.isDisplayed();
		String actual = arAdjustmentAmountWebElement.getAttribute("value");
		if (actual.equals(expected))
			return true;
		else
			return false;

	} catch (Exception e) {
		return false;
	}
}



public boolean verifyIneligibleReason(String reason){
	try{
		//Thread.sleep(5000);
		WebElement reasonWebElement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(ineligibiltyReason_xpath));
		reasonWebElement.getText().equalsIgnoreCase(reason);
		return true;
		
	}
	catch(Exception e){
		
	}
	return false;
	
	}

public boolean verifyIneligibleAmount(String amount){
	try{
		//Thread.sleep(5000);
		WebElement amountWebElement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(ineligibiltyTotal_xpath));
		amountWebElement.getText().equalsIgnoreCase(amount);
		return true;
		
	}
	catch(Exception e){
		
	}
	return false;
	
	}

public boolean verifyEomTotal(String eom){
	try{
		//Thread.sleep(5000);
		WebElement eomWebElement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(eomTotal_xpath));
		eomWebElement.getText().trim().equalsIgnoreCase(eom);
		return true;
		
	}
	catch(Exception e){
		
	}
	return false;
	
	}
public boolean verifyEligibleAccReceivable(String accRecievable){
	try{
		//Thread.sleep(5000);
		WebElement eligibleAccRecWebElement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(eligibleAccReceivable_xpath));
		eligibleAccRecWebElement.getText().trim().equalsIgnoreCase(accRecievable);
		return true;
		
	}
	catch(Exception e){
		
	}
	return false;
	
	}
public boolean verifyAccReceivableCollateral(String accRecievableCollateral){
	try{
		//Thread.sleep(5000);
		WebElement AccRecWebElement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(accReceivableCollateral_xpath));
		AccRecWebElement.getText().trim().equalsIgnoreCase(accRecievableCollateral);
		return true;
		
	}
	catch(Exception e){
		
	}
	return false;
	
	}
public  boolean verifyIneligibleAmountReceivableAging4(String ReasonAmount){
	try{
	WebElement verifyIneligibilityAmountWebE=new WebDriverWait(driver,10)
	.until(ExpectedConditions.visibilityOfElementLocated(agedpastineliamnmt4_xpath));
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




public  boolean verifyIneligibleAmountReceivableAging5(String ReasonAmount){
	try{
	WebElement verifyIneligibilityAmountWebE=new WebDriverWait(driver,10)
	.until(ExpectedConditions.visibilityOfElementLocated(agedpastineliamnmt5_xpath));
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
public  boolean verifyIneligibleAmountcrossagedReceivableAging13(String ReasonAmount1){
	try{
	WebElement verifyIneligibilityAmountWebE=new WebDriverWait(driver,10)
	.until(ExpectedConditions.visibilityOfElementLocated(crossagedamnt13_xpath));
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
public  boolean verifyIneligibleAmountcrossagedReceivableAging12(String ReasonAmount1){
	try{
	WebElement verifyIneligibilityAmountWebE=new WebDriverWait(driver,10)
	.until(ExpectedConditions.visibilityOfElementLocated(crossagedamnt12_xpath));
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
public  boolean verifyIneligibleAmountcrossagedReceivableAging14(String ReasonAmount1){
	try{
	WebElement verifyIneligibilityAmountWebE=new WebDriverWait(driver,10)
	.until(ExpectedConditions.visibilityOfElementLocated(crossagedamnt14_xpath));
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
public  boolean verifyIneligibleAmountcrossagedReceivableAging15(String ReasonAmount1){
	try{
	WebElement verifyIneligibilityAmountWebE=new WebDriverWait(driver,10)
	.until(ExpectedConditions.visibilityOfElementLocated(crossagedamnt15_xpath));
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


}