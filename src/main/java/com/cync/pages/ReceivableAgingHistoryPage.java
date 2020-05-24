package com.cync.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.SkipException;

import com.cync.base.BasePage;

public class ReceivableAgingHistoryPage extends BasePage{

	private final By receivableAgingPage_xpath=By.xpath("//span[contains(text(),'Receivable Aging')]");
	
	private final By bbcDateLabel_xpath=By.xpath("//label[text()='BBC Date']");
	private final By bbcDate_xpath=By.xpath("(//label[@class='control-label'])[2]");
	private final By FutureLabel_xpath=By.xpath("//label[text()='Future']");
	private final By FutureValue_xpath=By.id("Future");
	private final By CurrentLabel_xpath=By.xpath("//label[text()='Current']");
	private final By CurrentValue_xpath=By.id("Current");
	private final By Over30Label_xpath=By.xpath("//label[text()='Over 30']");
	private final By Over30Value_xpath=By.id("Over_30");
	private final By Over60Label_xpath=By.xpath("//label[text()='Over 60']");
	private final By Over60Value_xpath=By.id("Over_60");
	private final By Over90Label_xpath=By.xpath("//label[text()='Over 90']");
	private final By Over90Value_xpath=By.id("Over_90");
	private final By Over120Label_xpath=By.xpath("//label[text()='Over 120']");
	private final By Over120Value_xpath=By.id("Over_120");
	private final By RetentionLabel_xpath=By.xpath("//label[text()='Retention']");
	private final By RetentionValue_xpath=By.id("Retention");
	private final By TotalLabel_xpath=By.xpath("//label[text()='Total']");
	private final By TotalValue_xpath=By.id("total");
	private final By EOMTotalsLabel_xpath=By.xpath("//td[contains(text(),'EOM Totals')]");
	private final By EOMTotalsValue_xpath=By.xpath("//div[@id='summary_section']/table/tbody/tr[1]/td[2]");
	private final By EligibleAccountsReceivablesLabel_xpath=By.xpath("//td[contains(text(),'Eligible Accounts Receivables')]");
	private final By EligibleAccountsReceivablesValue_xpath=By.xpath("//div[@id='summary_section']/table/tbody/tr[2]/td[2]");
	private final By AccountsReceivablesCollateralLabel_xpath=By.xpath("//td[contains(text(),'Accounts Receivables Collateral')]");
	private final By AccountsReceivablesCollateralValue_xpath=By.xpath("//div[@id='summary_section']/table/tbody/tr[3]/td[2]");
	
	
	//
	private final By ineligibiltyReason_xpath=By.xpath("//table[@id='ineligible_summaries_list']/tbody/tr[2]/td[3]");
	private final By ineligibiltyTotal_xpath=By.xpath("//table[@id='ineligible_summaries_list']/tbody/tr[2]/td[4]");
	private final By eomTotal_xpath=By.xpath("//div[@id='summary_section']/table/tbody/tr[1]/td[2]");
	private final By eligibleAccReceivable_xpath=By.xpath("//div[@id='summary_section']/table/tbody/tr[2]/td[2]");
	private final By accReceivableCollateral_xpath=By.xpath("//div[@id='summary_section']/table/tbody/tr[3]/td[2]");
	
	
	//ineligible customer
	private final By amnt_xpath=By.xpath("(//td[text()='6,250.00'])[2]");
	private final By reason_xpath=By.xpath("//td[text()='Ineligible Customer']");
	private final By inelireason=By.id("jqgh_ineligible_summaries_list_ineligibility_reason_id");
	private final By ineliamnt_xpath=By.id("jqgh_ineligible_summaries_list_ineligible_amount");
	
	//retention reason
	private final By retention_xpath=By.xpath("//td[text()='Retention']");
	private final By retentionamnt_xpath=By.xpath("(//td[text()='1,500.00'])[2]");
	private final By retentionamnt1_xpath=By.xpath("(//td[text()='22,000.00'])[2]");
	private final By retentionamnt2_xpath=By.xpath("(//td[text()='50.00'])[2]");
	
	private final By retentiontotal_xpath=By.xpath("//td[text()='Totals']");
	private final By retentionamnt3_xpath=By.xpath("//td[text()='0.00']");


	//excluded reason
	   private final By excludedreason_xpath=By.xpath("(//td[contains(text(),'Excluded')])[1]");
	   private final By excludeamnt1_xpath=By.xpath("(//td[text()='3,000.00'])[1]");
	   private final By excludeamnt2xpath=By.xpath("(//td[text()='3,500.00'])[1]");
	   private final By excludeamnt3_xpath=By.xpath("(//td[text()='2,500.00'])[1]");
	   private final By excludeamnt4_xpath=By.xpath("(//td[text()='15,900.00'])[1]");
	   private final By excludeamnt5_xpath=By.xpath("(//td[text()='16,500.00'])[1]");
	   private final By inetotal_xpath=By.xpath("//td[text()='Totals']");
		private final By ineliamnt1_xpath=By.xpath("//td[text()='0.00']");
		private final By excludeamnt6_xpath=By.xpath("(//td[text()='5,000.00'])[1]");
		private final By excludeamnt7_xpath=By.xpath("(//td[text()='(6,600.00)'])[1]");

		private final By agedpastdue_xpath=By.xpath("//td[text()='Aged: Past Due Days']");
		private final By agedpastamnt2_xpath=By.xpath("//td[contains(text(),'66,000.00')]");
	
	//anusha
	 private final By AgedCreditItem_xpath=By.xpath("(//td[contains(text(),'300.00')])[1]");
	    private final By CrossAgedPercentage_xpath=By.xpath("(//td[contains(text(),'75,800.00')])[1]");
	    private final By ConcentrationPercentage_xpath=By.xpath("(//td[contains(text(),'67,540.00')])[1]");
	    private final By PastDueDays_xpath=By.xpath("(//td[contains(text(),'71,950.00')])[1]");
	    private final By IneligibleCustomer_xpath=By.xpath("(//td[contains(text(),'9,000.00')])[1]");
	    private final By ConcentrationPercentageAgedcreditLimit_xpath=By.xpath("(//td[contains(text(),'67,570')])[1]");
	    private final By ConcentrationPercentageAgedCreditLimitExclude_xpath=By.xpath("(//td[contains(text(),'84,500.00')])[1]");
	    private final By ConcentrationPercentageIneligibleCustomer_xpath=By.xpath("(//td[contains(text(),'68,470.00')])[1]");
	    private final By ConcentrationPercentageCrossAgedPercentageExclude_xpath=By.xpath("(//td[contains(text(),'76,050.00')])[1]");
	    private final By ConcentrationPercentageTotalReceivablesCap_xpath=By.xpath("(//td[contains(text(),'60,345.00')])[1]");
	    private final By ConcentrationPercentageAgedcreditLimitEligibleBalance_xpath=By.xpath("(//td[contains(text(),'67,540.00')])[1]");

	    
	    //cync_4462
	    private final By agedpastdueamnt_xpath=By.xpath("(//td[contains(text(),'126,750.00')])[1]");
	    private final By concentration_xpath=By.xpath("//td[contains(text(),'Concentration %')]");
	    private final By concentrationamnt_xpath=By.xpath("(//td[text()='200.00'])[1]");
	    private final By totaldis_xpath=By.xpath("//td[contains(@role,'gridcell')][contains(text(),'Totals')]");
	    private final By totalamnt_xpath=By.xpath("(//td[text()='126,950.00'])[1]");
	    private final By agedpastdueamnt1_xpath=By.xpath("(//td[contains(text(),'0.00')])[1]");
	    private final By concentrationamnt1_xpath=By.xpath("(//td[contains(text(),'8,000.00')])[1]");
	    private final By totalamnt1_xpath=By.xpath("(//td[text()='8,000.00'])[1]");
	    
	    
	    
	public ReceivableAgingHistoryPage(WebDriver driver) {
		super(driver);

		try {
			Thread.sleep(1000);
		} catch (Exception e) {

			e.printStackTrace();
		}
		/*if (!driver.findElement(receivableAgingPage_xpath).getText().trim()
				.equals("Receivable Aging")) {
			throw new SkipException("Receivable Aging couldn't open.");
		}*/
	}
	
	

	///ineligible customer
	public  boolean verifyIneligibilityReasonReceivableAgingScreenunapp(String ReasonData){
		try{
		WebElement verifyIneligibilityReasonWebE=new WebDriverWait(driver,20)
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
	    
	public  boolean verifyIneligibleReasonReceivableAging(String ReasonData){
		try{
		WebElement verifyIneligibilityReasonWebE=new WebDriverWait(driver,20)
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
		public  boolean verifyIneligibilityAmountReceivableAgingScreenunapp(String ReasonAmount){
			try{
			WebElement verifyIneligibilityAmountWebE=new WebDriverWait(driver,20)
			.until(ExpectedConditions.visibilityOfElementLocated(ineliamnt1_xpath));
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
	public  boolean verifyIneligibilityamntreceivablehistrycreenapp1(String ReasonAmount){
		try{
		WebElement verifyIneligibilityAmountWebE=new WebDriverWait(driver,20)
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


	public  boolean verifyIneligibleExcludedamntreceivablehistrycreeapprove5(String ReasonAmount){
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
	public  boolean verifyIneligibleExcludedamntreceivablehistrycreeapprove6(String ReasonAmount){
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
	public  boolean verifyIneligibleExcludedamntreceivablehistrycreeapprove4(String ReasonAmount){
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

	public  boolean verifyIneligibleretentionReasonReceivableAging1(String ReasonData){
		try{
		WebElement verifyIneligibilityReasonWebE=new WebDriverWait(driver,20)
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
	public  boolean verifyIneligibleretentionAmountReceivableAging3(String ReasonAmount){
		try{
		WebElement verifyIneligibilityAmountWebE=new WebDriverWait(driver,20)
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
	public  boolean verifyIneligibleExcludedamntreceivablehistrycreenapprove3(String ReasonAmount){
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
	
	
	public  boolean verifyIneligibleretentionreasonreceivablehistoryScreenapprove(String ReasonData){
    	try{
    	WebElement verifyIneligibilityReasonWebE=new WebDriverWait(driver,20)
    	.until(ExpectedConditions.visibilityOfElementLocated(retention_xpath));
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
	public  boolean verifyIneligibleretentionamntreceivablehistrycreenapprove1(String ReasonAmount){
		try{
		WebElement verifyIneligibilityAmountWebE=new WebDriverWait(driver,20)
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
	public  boolean verifyIneligibleretentionamntreceivablehistrycreenapprove2(String ReasonAmount){
		try{
		WebElement verifyIneligibilityAmountWebE=new WebDriverWait(driver,20)
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
public  boolean verifyIneligibleretentionamntreceivablehistrycreenapprove(String ReasonAmount){
	try{
	WebElement verifyIneligibilityAmountWebE=new WebDriverWait(driver,20)
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
	 public  boolean verifyIneligibilityreasonreceivablehistoryScreenapp1(String ReasonData){
	    	try{
	    	WebElement verifyIneligibilityReasonWebE=new WebDriverWait(driver,20)
	    	.until(ExpectedConditions.visibilityOfElementLocated(inelireason));
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
	public  boolean verifyIneligibilityamntreceivablehistrycreenapp(String ReasonAmount){
		try{
		WebElement verifyIneligibilityAmountWebE=new WebDriverWait(driver,20)
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
	
	 public  boolean verifyIneligibilityreasonreceivablehistoryScreenapp(String ReasonData){
	    	try{
	    	WebElement verifyIneligibilityReasonWebE=new WebDriverWait(driver,20)
	    	.until(ExpectedConditions.visibilityOfElementLocated(inelireason));
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
	public  boolean verifyIneligibilityamntreceivablehistrycreen(String ReasonAmount){
		try{
		WebElement verifyIneligibilityAmountWebE=new WebDriverWait(driver,20)
		.until(ExpectedConditions.visibilityOfElementLocated(amnt_xpath));
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
	
	 public  boolean verifyIneligibilityreasonreceivablehistoryScreen(String ReasonData){
	    	try{
	    	WebElement verifyIneligibilityReasonWebE=new WebDriverWait(driver,20)
	    	.until(ExpectedConditions.visibilityOfElementLocated(reason_xpath));
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
	
	 public boolean bBCDateLabelVerify()
		{
			try{

				WebElement labelWebEelement=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(bbcDateLabel_xpath));
				labelWebEelement.isDisplayed();				
		return true;
			}
		catch (Exception ex) {
		}
		return false;

		}	
	 
	 public boolean futureLabelVerify()
		{
			try{

				WebElement labelWebEelement=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(FutureLabel_xpath));
				labelWebEelement.isDisplayed();				
		return true;
			}
		catch (Exception ex) {
		}
		return false;

		}	
	 public boolean currentLabelVerify()
		{
			try{

				WebElement labelWebEelement=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(CurrentLabel_xpath));
				labelWebEelement.isDisplayed();				
		return true;
			}
		catch (Exception ex) {
		}
		return false;

		}	
	 
	 public boolean Over30LabelVerify()
		{
			try{

				WebElement labelWebEelement=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(Over30Label_xpath));
				labelWebEelement.isDisplayed();				
		return true;
			}
		catch (Exception ex) {
		}
		return false;

		}	
	
	 public boolean Over60LabelVerify()
		{
			try{

				WebElement labelWebEelement=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(Over60Label_xpath));
				labelWebEelement.isDisplayed();				
		return true;
			}
		catch (Exception ex) {
		}
		return false;

		}	
	
	 public boolean Over90LabelVerify()
		{
			try{

				WebElement labelWebEelement=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(Over90Label_xpath));
				labelWebEelement.isDisplayed();				
		return true;
			}
		catch (Exception ex) {
		}
		return false;

		}	
	
	 public boolean Over120LabelVerify()
		{
			try{

				WebElement labelWebEelement=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(Over120Label_xpath));
				labelWebEelement.isDisplayed();				
		return true;
			}
		catch (Exception ex) {
		}
		return false;

		}	
	 
	 public boolean retentionLabelVerify()
		{
			try{

				WebElement labelWebEelement=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(RetentionLabel_xpath));
				labelWebEelement.isDisplayed();				
		return true;
			}
		catch (Exception ex) {
		}
		return false;

		}	
	 
	 public boolean totalLabelVerify()
		{
			try{

				WebElement labelWebEelement=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(TotalLabel_xpath));
				labelWebEelement.isDisplayed();				
		return true;
			}
		catch (Exception ex) {
		}
		return false;

		}	
	 
	 public boolean eomTotalLabelVerify()
		{
			try{

				WebElement labelWebEelement=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(EOMTotalsLabel_xpath));
				labelWebEelement.isDisplayed();				
		return true;
			}
		catch (Exception ex) {
		}
		return false;

		}	
	 
	 public boolean eligibleAccountsReceivablesLabelVerify()
		{
			try{

				WebElement labelWebEelement=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(EligibleAccountsReceivablesLabel_xpath));
				labelWebEelement.isDisplayed();				
		return true;
			}
		catch (Exception ex) {
		}
		return false;

		}	
	 
	 public boolean accountsReceivablesCollateralLabelVerify()
		{
			try{

				WebElement labelWebEelement=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(AccountsReceivablesCollateralLabel_xpath));
				labelWebEelement.isDisplayed();				
		return true;
			}
		catch (Exception ex) {
		}
		return false;

		}	
	 
	 public boolean  verifyBbcDate(String  bbcDate){
	    	try {
	    		WebElement dateWebElement = new WebDriverWait(driver, 100).until(ExpectedConditions.visibilityOfElementLocated(bbcDate_xpath));
	    		String actual = dateWebElement.getText();
	    		if (actual.equals(bbcDate))
	    			return true;
	    		else
	    			return false;

	    	} catch (Exception e) {
	    		return false;
	    	}
	    	
	    }
	
	 public boolean verifyFuture(String future){
			try {
				WebElement labelAdditionsWebElement = new WebDriverWait(driver, 100).until(ExpectedConditions.visibilityOfElementLocated(FutureLabel_xpath));
				WebElement valueAmountWebElement = new WebDriverWait(driver, 100).until(ExpectedConditions.visibilityOfElementLocated(FutureValue_xpath));
				labelAdditionsWebElement.isDisplayed();
				String actual = valueAmountWebElement.getAttribute("value").trim();
				if (actual.equals(future))
					return true;
				else
					return false;

			} catch (Exception e) {
				return false;
			}
			
			}
	 
	 public boolean verifyCurrent(String current){
			try {
				WebElement labelAdditionsWebElement = new WebDriverWait(driver, 100).until(ExpectedConditions.visibilityOfElementLocated(CurrentLabel_xpath));
				WebElement valueAmountWebElement = new WebDriverWait(driver, 100).until(ExpectedConditions.visibilityOfElementLocated(CurrentValue_xpath));
				labelAdditionsWebElement.isDisplayed();
				String actual = valueAmountWebElement.getAttribute("value").trim();
				if (actual.equals(current))
					return true;
				else
					return false;

			} catch (Exception e) {
				return false;
			}
			
			}
	 
	 public boolean verifyover30(String over30){
			try {
				WebElement labelAdditionsWebElement = new WebDriverWait(driver, 100).until(ExpectedConditions.visibilityOfElementLocated(Over30Label_xpath));
				WebElement valueAmountWebElement = new WebDriverWait(driver, 100).until(ExpectedConditions.visibilityOfElementLocated(Over30Value_xpath));
				labelAdditionsWebElement.isDisplayed();
				String actual = valueAmountWebElement.getAttribute("value").trim();
				if (actual.equals(over30))
					return true;
				else
					return false;

			} catch (Exception e) {
				return false;
			}
			
			}
	 
	 public boolean verifyOver60(String over60){
			try {
				WebElement labelAdditionsWebElement = new WebDriverWait(driver, 100).until(ExpectedConditions.visibilityOfElementLocated(Over60Label_xpath));
				WebElement valueAmountWebElement = new WebDriverWait(driver, 100).until(ExpectedConditions.visibilityOfElementLocated(Over60Value_xpath));
				labelAdditionsWebElement.isDisplayed();
				String actual = valueAmountWebElement.getAttribute("value").trim();
				if (actual.equals(over60))
					return true;
				else
					return false;

			} catch (Exception e) {
				return false;
			}
			
			}
	 
	 public boolean verifyOver90(String over90){
			try {
				WebElement labelAdditionsWebElement = new WebDriverWait(driver, 100).until(ExpectedConditions.visibilityOfElementLocated(Over90Label_xpath));
				WebElement valueAmountWebElement = new WebDriverWait(driver, 100).until(ExpectedConditions.visibilityOfElementLocated(Over90Value_xpath));
				labelAdditionsWebElement.isDisplayed();
				String actual = valueAmountWebElement.getAttribute("value").trim();
				if (actual.equals(over90))
					return true;
				else
					return false;

			} catch (Exception e) {
				return false;
			}
			
			}
	 
	 public boolean verifyOver120(String over120){
			try {
				WebElement labelAdditionsWebElement = new WebDriverWait(driver, 100).until(ExpectedConditions.visibilityOfElementLocated(Over120Label_xpath));
				WebElement valueAmountWebElement = new WebDriverWait(driver, 100).until(ExpectedConditions.visibilityOfElementLocated(Over120Value_xpath));
				labelAdditionsWebElement.isDisplayed();
				String actual = valueAmountWebElement.getAttribute("value").trim();
				if (actual.equals(over120))
					return true;
				else
					return false;

			} catch (Exception e) {
				return false;
			}
			
			}
	 
	 public boolean verifyRetention(String retention){
			try {
				WebElement labelAdditionsWebElement = new WebDriverWait(driver, 100).until(ExpectedConditions.visibilityOfElementLocated(RetentionLabel_xpath));
				WebElement valueAmountWebElement = new WebDriverWait(driver, 100).until(ExpectedConditions.visibilityOfElementLocated(RetentionValue_xpath));
				labelAdditionsWebElement.isDisplayed();
				String actual = valueAmountWebElement.getAttribute("value").trim();
				if (actual.equals(retention))
					return true;
				else
					return false;

			} catch (Exception e) {
				return false;
			}
			
			}
	 
	 
	 public boolean verifyTotal(String Total){
			try {
				WebElement labelAdditionsWebElement = new WebDriverWait(driver, 100).until(ExpectedConditions.visibilityOfElementLocated(TotalLabel_xpath));
				WebElement valueAmountWebElement = new WebDriverWait(driver, 100).until(ExpectedConditions.visibilityOfElementLocated(TotalValue_xpath));
				labelAdditionsWebElement.isDisplayed();
				String actual = valueAmountWebElement.getAttribute("value").trim();
				if (actual.equals(Total))
					return true;
				else
					return false;

			} catch (Exception e) {
				return false;
			}
			
			}
	 
	 public boolean verifyEOMTotals(String EOMTotals){
			try {
				WebElement labelsWebElement = new WebDriverWait(driver, 100).until(ExpectedConditions.visibilityOfElementLocated(EOMTotalsLabel_xpath));
				WebElement valueAmountWebElement = new WebDriverWait(driver, 100).until(ExpectedConditions.visibilityOfElementLocated(EOMTotalsValue_xpath));
				labelsWebElement.isDisplayed();
				String actual = valueAmountWebElement.getText().trim();
				if (actual.equals(EOMTotals))
					return true;
				else
					return false;

			} catch (Exception e) {
				return false;
			}
			
			}
	 
	 

	 
	 public boolean verifyEligibleAccountsReceivables(String EligibleAccountsReceivables){
			try {
				WebElement labelAdditionsWebElement = new WebDriverWait(driver, 100).until(ExpectedConditions.visibilityOfElementLocated(EligibleAccountsReceivablesLabel_xpath));
				WebElement valueAmountWebElement = new WebDriverWait(driver, 100).until(ExpectedConditions.visibilityOfElementLocated(EligibleAccountsReceivablesValue_xpath));
				labelAdditionsWebElement.isDisplayed();
				String actual = valueAmountWebElement.getText().trim();
				if (actual.equals(EligibleAccountsReceivables))
					return true;
				else
					return false;

			} catch (Exception e) {
				return false;
			}
			
			}
	 
	 
	 public boolean verifyAccountsReceivablesCollateral(String AccountsReceivablesCollateral){
			try {
				WebElement labelAdditionsWebElement = new WebDriverWait(driver, 100).until(ExpectedConditions.visibilityOfElementLocated(AccountsReceivablesCollateralLabel_xpath));
				WebElement valueAmountWebElement = new WebDriverWait(driver, 100).until(ExpectedConditions.visibilityOfElementLocated(AccountsReceivablesCollateralValue_xpath));
				labelAdditionsWebElement.isDisplayed();
				String actual = valueAmountWebElement.getText().trim();
				if (actual.equals(AccountsReceivablesCollateral))
					return true;
				else
					return false;

			} catch (Exception e) {
				return false;
			}
			
			}
	
//
	 public boolean verifyIneligibleReason(String reason){
			try{
				//Thread.sleep(5000);
				WebElement reasonWebElement=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(ineligibiltyReason_xpath));
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
				WebElement amountWebElement=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(ineligibiltyTotal_xpath));
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
				WebElement eomWebElement=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(eomTotal_xpath));
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
				WebElement eligibleAccRecWebElement=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(eligibleAccReceivable_xpath));
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
				WebElement AccRecWebElement=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(accReceivableCollateral_xpath));
				AccRecWebElement.getText().trim().equalsIgnoreCase(accRecievableCollateral);
				return true;
				
			}
			catch(Exception e){
				
			}
			return false;
			
			}
		

		public  boolean verifyIneligibleExcludedamntreceivablehistrycreenapprove1(String ReasonAmount){
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
		public  boolean verifyIneligibleExcludedreasonreceivablehistoryScreenapprove(String ReasonData){
	        try{
	        WebElement verifyIneligibilityReasonWebE=new WebDriverWait(driver,20)
	        .until(ExpectedConditions.visibilityOfElementLocated(excludedreason_xpath));
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
		public  boolean verifyIneligibleExcludedamntreceivablehistrycreenapprove2(String ReasonAmount){
	        try{
	        WebElement verifyIneligibilityAmountWebE=new WebDriverWait(driver,20)
	        .until(ExpectedConditions.visibilityOfElementLocated(excludeamnt2xpath));
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
		
		public  boolean verifyIneligibleExcludedamntreceivablehistrycreeapprove3(String ReasonAmount){
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

		 public boolean  verifyAgedCreditItem(String  AgedCreditItem){
	        	try {
	        		
	        		WebElement AmountWebElement = new WebDriverWait(driver, 100).
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
	        		
	        		WebElement AmountWebElement = new WebDriverWait(driver, 100).
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
	        public boolean  verifyConcentrationPercentage(String  ConcentrationPercentage){
	        	try {
	        		
	        		WebElement AmountWebElement = new WebDriverWait(driver, 100).
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
	        public boolean  verifyConcentrationPercentage_AgedCreditLimit_Exclude_BBC(String  ConcentrationPercentage){
	        	try {
	        		
	        		WebElement AmountWebElement = new WebDriverWait(driver, 100).
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
	        
	        public boolean  verifyPastDueDate(String  AgedPastDueDays){
	        	try {
	        		
	        		WebElement AmountWebElement = new WebDriverWait(driver, 100).
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
	        		
	        		WebElement AmountWebElement = new WebDriverWait(driver, 100).
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
	        public boolean  verifyConcentrationPercentage_CrossAgedPercentage_Cap(String  ConcentrationPercentage){
	    		try {
	    			
	    			WebElement AmountWebElement = new WebDriverWait(driver, 100).
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
	    			
	    			WebElement AmountWebElement = new WebDriverWait(driver, 100).
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
	        ///cync_4462
	        public boolean verifyAgedPastDueDaysAmount_cyncs4462_approvebbc(String expected) {
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
	        public boolean verifyConcentrationAmount_cyncs4462_approvebbc(String expected1) {
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
	        public boolean verifyTotalIneligAmount_cyncs4462_approvebbc(String expected2) {
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
}
