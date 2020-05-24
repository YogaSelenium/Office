package com.cync.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.cync.base.BasePage;

public class Concentration extends BasePage {

	public Concentration(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	private final By selectAllValues_xpath = By.xpath("//button[@class='moveall arrow-btnstyle']");
	private final By saveOnIneligibleReasons_xpath = By.id("apply_calculations");
	private final By unselectAllValues_xpath = By.xpath("//button[@class='removeall arrow-btnstyle']");
	private final By selecttConcentration_xpath = By.xpath("(//option[contains(text(),'Concentration')])[1]");
	private final By finalConcentration_xpath = By.xpath("//button[@class='move arrow-btnstyle']");
	private final By BBCRecalculationProcess_xpath=By.xpath("//a[contains(text(),'BBC Recalculation Process')]");
	private final By BasicParameter_xpath=By.xpath("//a[contains(text(),'Basic Parameters')]");
	private final By Edit_BasicParameter_xpath=By.id("parameter_edit");
	private final By ConcentPercentage_xpath=By.id("parameter_concentration_pct");
	private final By Save_BasicParameter_xpath=By.id("parameter_submit");
	private final By BBCRecalculationProcessButton_xpath=By.xpath("//a[contains(text(),'Process/Re-Calculate BBC')]");
	private final By menuItem_xpath = By.id("top-menu");
	private final By ReceivableAging_xpath=By.xpath("//a[contains(text(),'Receivable Aging')]");
	private final By Concentration_ReceivableAgingReason_Xpath=By.xpath("//td[contains(text(),'Concentration %')]");
	private final By Concentration_ReceivableAgingAmount_Xpath=By.xpath("(//td[contains(text(),'21,925.00')])[1]");
	private final By BBCAvailability_xpath=By.xpath("(//a[contains(text(),'BBC Availability')])[1]");
	private final By clickOnPlusBBCAvailability_Xpath=By.xpath("(//i[@class='icon-plus'])[2]");
	private final By Concentration_BBCAvailabilityReason_Xpath=By.xpath("//td[contains(text(),'Concentration %')]");
	private final By Concentration_BBCAvailabilityAmount_Xpath=By.xpath("(//td[contains(text(),'21,925.00')])[1]");
	private final By Reports_xpath=By.xpath("(//a[contains(text(),'Reports')])[1]");
	private final By clickOnBBCReport_Xpath=By.xpath("(//li[@class='open_menu'])[9]");
	private final By clickOnHTMlButton_Xpath=By.xpath("//button[contains(text(),'HTML')]");
	private final By Concentration_BBCReportReason_Xpath=By.xpath("//td[contains(text(),'Concentration %')]");
	private final By Concentration_BBCReportAmount_Xpath=By.xpath("(//td[contains(text(),'21,925.00')])[1]");
	private final By clickOnIneligibleEligibleAnalysisReport_Xpath=By.xpath("(//li[@class='open_menu'])[3]");
	private final By Concentration_IneligibleEligibleAnalysis_Reason_Reason_Xpath=By.xpath("//td[contains(text(),'Concentration %')]");
	private final By Concentration_IneligibleEligibleAnalysis_Reason_Amount_Xpath=By.xpath("(//td[contains(text(),'21,925.00')])[1]");
	private final By Concentration_IneligibleEligibleAnalysis_Debtor_Reason_Xpath=By.xpath("//td[contains(text(),'Concentration %')]");
	private final By Concentration_IneligibleEligibleAnalysis_Debtor_Amount_Xpath=By.xpath("(//td[contains(text(),'21,925.00')])[1]");
	private final By Concentration_Management_Reason_Xpath=By.xpath("//td[contains(text(),'Concentration %')]");
	private final By Concentration_Management_Amount_Xpath=By.xpath("(//td[contains(text(),'21,925')])[5]");
	private final By BBCManagementReport_Xpath=By.xpath("(//li[@class='open_menu'])[28]");
	private final By ClickonGenerateButton_Xpath=By.xpath("//button[contains(text(),'Generate')]");
	private final By ClickonGroupbyDropdown_Xpath=By.xpath("//select[@id='ineligible_style']");
	
	private final By ClickonApproveBBC_Xpath=By.xpath("(//a[contains(text(),'Approve BBC')])[2]");
	private final By ClickonElectronicSignature_Xpath=By.xpath("(//a[contains(text(),'Electronic Signature')])");
	private final By SigNameTextBox_Xpath=By.id("signer_name");
	private final By AgreeCheckBox_Xpath=By.id("terms_condition");
	private final By ClickonApproveBBCButton_Xpath=By.xpath("(//button[contains(text(),'Authorize Signature and Approve BBC')])");
	private final By CloseButtonPopup_Xpath=By.xpath("(//button[@class='ui-dialog-titlebar-close'])");
	
	private final By SelectBBC_Xpath=By.id("choose_bbc");
	private final By BBCReviewData_History=By.xpath("(//a[contains(text(),'BBC Review Data')])[2]");
	
	private final By ReceivableAgingHistory_xpath=By.xpath("(//a[contains(text(),'Receivable Aging')])[2]");
	private final By BBCAvailabilityHistory_xpath=By.xpath("(//a[contains(text(),'BBC Availability')])[2]");
	
	private final By ApproveBBcDropdown_BBCReport_Xpath=By.id("bbc_status");
	private final By ApproveBBcDate_BBCReport_Xpath=By.id("bbc_id");
	
	private final By ApproveBBc_Xpath=By.xpath("//a[contains(text(),'Approve BBC/Funding')]");
	private final By SelectBorrowerList_Xpath=By.id("selected_borrower_list");
	private final By ClickonSearch_Xpath=By.xpath("//input[@value='Search']");
	private final By SelectCheckBox_Xpath=By.id("move_to_fund_check_box_14222");
	private final By ClickonUnreleaseButton_Xpath=By.xpath("//a[contains(text(),'Unrelease BBC')]");
	
	private final By Concentration_ReceivableAgingReason_Lesser_Xpath=By.xpath("//td[contains(text(),'Totals')]");
	private final By Concentration_ReceivableAgingAmount_Lesser_Xpath=By.xpath("(//td[contains(text(),'0.00')])[1]");
	
	private final By Concentration_BBCAvailabilityAmount_Lesser_Xpath=By.xpath("(//td[contains(text(),'0.00')])[31]");
	private final By Concentration_BBCAvailabilityAmount_Approve_Lesser_Xpath=By.xpath("(//td[contains(text(),'0.00')])[18]");
	
	
	private final By Concentration_BBCReportReason_Lesser_Xpath=By.xpath("//td[contains(text(),'INELIGIBLES')]");
	private final By Concentration_BBCReportAmount_Lesser_Xpath=By.xpath("(//td[contains(text(),'0.00')])[31]");
	
	private final By Concentration_BBCReportAmountApprove_Lesser_Xpath=By.xpath("(//td[contains(text(),'0.00')])[33]");
	
	private final By Concentration_IneligibleAnalysisReason_Reason_Lesser_Xpath=By.xpath("//td[contains(text(),' Overall Total ')]");
	private final By Concentration_IneligibleAnalysisReason_Amount_Lesser_Xpath=By.xpath("(//td[contains(text(),'0.00')])[1]");
	
	private final By Concentration_IneligibleAnalysisDebtor_Reason_Lesser_Xpath=By.xpath("//td[contains(text(),'Total')]");
	private final By Concentration_IneligibleAnalysisDebtor_Amount_Lesser_Xpath=By.xpath("(//td[contains(text(),'0.00')])[1]");
		
	private final By Concentration_BBCManagementReport_Xpath=By.xpath("(//th[contains(text(),'Ineligible')])[1]");
	private final By Concentration_BBCManagementAmount_Xpath=By.xpath("(//td[contains(text(),'0.00')])[77]");
	
	private final By ExcludeRadio_xpath=By.id("parameter_conc_pct_type_e");
	
	
	private final By Concentration_ReceivableAgingReason_Exclude_Xpath=By.xpath("//td[contains(text(),'Concentration %')]");
	private final By Concentration_ReceivableAgingAmount_Exclude_Xpath=By.xpath("(//td[contains(text(),'77,000.00')])[1]");
	
	private final By Concentration_BBCAvailabilityScreenReason_Exclude_Xpath=By.xpath("//td[contains(text(),'Concentration %')]");
	private final By Concentration_BBCAvailabilityScreenAmount_Exclude_Xpath=By.xpath("(//td[contains(text(),'77,000.00')])[1]");

	private final By Concentration_BBCReportReason_Exclude_Xpath=By.xpath("//td[contains(text(),'Concentration %')]");
	private final By Concentration_BBCReportAmount_Exclude_Xpath=By.xpath("(//td[contains(text(),'77,000.00')])[1]");

	private final By Concentration_IneligibleEligibleReceivableAnalysisReportBy_ReasonReason_Exclude_Xpath=By.xpath("//td[contains(text(),'Concentration %')]");
	private final By Concentration_IneligibleEligibleReceivableAnalysisReportBy_ReasonAmount_Exclude_Xpath=By.xpath("(//td[contains(text(),'77,000.00')])[1]");

	private final By Concentration_IneligibleEligibleReceivableAnalysisReportBy_DebtorReason_Exclude_Xpath=By.xpath("//td[contains(text(),'Concentration %')]");
	private final By Concentration_IneligibleEligibleReceivableAnalysisReportBy_DebtorAmount_Exclude_Xpath=By.xpath("(//td[contains(text(),'77,000.00')])[1]");

	private final By Concentration_BBCManagementReportReason_Exclude_Xpath=By.xpath("//td[contains(text(),'Concentration %')]");
	private final By Concentration_BBCManagementReportAmount_Exclude_Xpath=By.xpath("(//td[contains(text(),'77,000.00')])[1]");

	private final By ToBBCToApproved_Xpath=By.xpath("//ul[@id='FLUL32']/li[2]/a");
	private final By ClickonPurgeButton_Xpath=By.xpath("//a[contains(text(),'Purge')]");
	private final By CapRadio_xpath=By.id("parameter_conc_pct_type_c");




	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
    
    
    
    
    
    
    
    
    
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public boolean selectConcentration() {
		 try {
			 this.selectAllReasons();
			 this.removeAllList();
			 this.selecttConcentration();
			 this.finalConcentration();
			 this.saveOnIneligibleCalculation();
			 return true;
		 	}
		 
	catch (Exception ex) {
	    return false;
					}
		
	}
	
	public  boolean selectAllReasons() {
		try {
			WebElement selectAllReasonsWebE=new WebDriverWait(driver,20)
			.until(ExpectedConditions.visibilityOfElementLocated(selectAllValues_xpath));
			selectAllReasonsWebE.click();
			Thread.sleep(100);
			return true;
		}
		 catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
	
	public  boolean removeAllList() {
		try {
			WebElement removeAllListWebE=new WebDriverWait(driver,20)
			.until(ExpectedConditions.visibilityOfElementLocated(unselectAllValues_xpath));
			removeAllListWebE.click();
			Thread.sleep(100);
			return true;
		}
		 catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
	
	public  boolean selecttConcentration() {
		try {
			WebElement selectUninsuiredWebE=new WebDriverWait(driver,20)
			.until(ExpectedConditions.visibilityOfElementLocated(selecttConcentration_xpath));
			selectUninsuiredWebE.click();
			Thread.sleep(100);
			return true;
		}
		 catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
	
	public  boolean finalConcentration() {
		try {
			WebElement finalUninsuiredWebE=new WebDriverWait(driver,20)
			.until(ExpectedConditions.visibilityOfElementLocated(finalConcentration_xpath));
			finalUninsuiredWebE.click();
			Thread.sleep(100);
			return true;
		}
		 catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}

	public  boolean saveOnIneligibleCalculation() {
		try {
		WebElement saveOnIneligibleReasonsWebE=new WebDriverWait(driver,20)
		.until(ExpectedConditions.visibilityOfElementLocated(saveOnIneligibleReasons_xpath));
		saveOnIneligibleReasonsWebE.click();
		Thread.sleep(1000);
		
		return true;
	}
	 catch (Exception e) {
		// TODO: handle exception
		return false;
	}
}
	
	public boolean defineConcentrationPercentage(String conctPercentage) {
		try {
			this.openBasicParameterScreen();
			this.editBasicParameterScreen();
			
			WebElement saveOnIneligibleReasonsWebE=new WebDriverWait(driver,20)
			.until(ExpectedConditions.visibilityOfElementLocated(ConcentPercentage_xpath));
			saveOnIneligibleReasonsWebE.clear();
			saveOnIneligibleReasonsWebE.sendKeys(conctPercentage);
			Thread.sleep(1000);
			this.saveBasicParameterScreen();
			return true;
		}
		 catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
	
	public boolean openBasicParameterScreen() {
		 try {
			 this.MouseOverOnMenu();
			 this.moveToLeftNavigation("Client Maintenance");
			 WebElement IneligibleCalculationPageWebElement = new WebDriverWait(driver, 1000)
			 .until(ExpectedConditions.elementToBeClickable(BasicParameter_xpath));
			 IneligibleCalculationPageWebElement.click();
			 Thread.sleep(1000);
			 return true;
		 	}
		 
	catch (Exception ex) {
	    return false;
					}
		
	}

	public boolean editBasicParameterScreen_Exculde() {
			 try {
				 
				 WebElement IneligibleCalculationPageWebElement = new WebDriverWait(driver, 1000)
				 .until(ExpectedConditions.elementToBeClickable(Edit_BasicParameter_xpath));
				 IneligibleCalculationPageWebElement.click();
				 Thread.sleep(100);
				 this.selectExcludeasReason();
				 
				 return true;
			 	}
			 
		catch (Exception ex) {
		    return false;
						}
			
		}
	public boolean selectCapasReason() {
		 try {
			 WebElement IneligibleCalculationPageWebElement = new WebDriverWait(driver, 1000)
			 .until(ExpectedConditions.elementToBeClickable(CapRadio_xpath));
			 IneligibleCalculationPageWebElement.click();
			 Thread.sleep(1000);
			 return true;
		 	}
		 
	catch (Exception ex) {
	    return false;
					}
		
	}
	public boolean editBasicParameterScreen_Cap() {
		 try {
			 
			 WebElement IneligibleCalculationPageWebElement = new WebDriverWait(driver, 1000)
			 .until(ExpectedConditions.elementToBeClickable(Edit_BasicParameter_xpath));
			 IneligibleCalculationPageWebElement.click();
			 Thread.sleep(100);
			 this.selectCapasReason();
			 
			 return true;
		 	}
		 
	catch (Exception ex) {
	    return false;
					}
		
	}
	
	public boolean editBasicParameterScreen() {
		 try {
			 
			 WebElement IneligibleCalculationPageWebElement = new WebDriverWait(driver, 1000)
			 .until(ExpectedConditions.elementToBeClickable(Edit_BasicParameter_xpath));
			 IneligibleCalculationPageWebElement.click();
			 Thread.sleep(100);
			 this.selectExcludeasReason();
			 
			 return true;
		 	}
		 
	catch (Exception ex) {
	    return false;
					}
		
	}
	
	public boolean selectExcludeasReason() {
		 try {
			 WebElement IneligibleCalculationPageWebElement = new WebDriverWait(driver, 1000)
			 .until(ExpectedConditions.elementToBeClickable(ExcludeRadio_xpath));
			 IneligibleCalculationPageWebElement.click();
			 Thread.sleep(1000);
			 return true;
		 	}
		 
	catch (Exception ex) {
	    return false;
					}
		
	}
	public boolean defineConcentrationPercentage_cap(String conctPercentage) {
		try {
			this.openBasicParameterScreen();
			this.editBasicParameterScreen_Cap();
			
			WebElement saveOnIneligibleReasonsWebE=new WebDriverWait(driver,20)
			.until(ExpectedConditions.visibilityOfElementLocated(ConcentPercentage_xpath));
			saveOnIneligibleReasonsWebE.clear();
			saveOnIneligibleReasonsWebE.sendKeys(conctPercentage);
			Thread.sleep(1000);
			this.saveBasicParameterScreen();
			return true;
		}
		 catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
	public boolean saveBasicParameterScreen() {
		 try {
			 WebElement IneligibleCalculationPageWebElement = new WebDriverWait(driver, 1000)
			 .until(ExpectedConditions.elementToBeClickable(Save_BasicParameter_xpath));
			 IneligibleCalculationPageWebElement.click();
			 Thread.sleep(1000);
			 return true;
		 	}
		 
	catch (Exception ex) {
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
	public boolean defineConcentrationPercentage_Exclude(String conctPercentage) {
		try {
			this.openBasicParameterScreen();
			this.editBasicParameterScreen_Exculde();
			
			WebElement saveOnIneligibleReasonsWebE=new WebDriverWait(driver,20)
			.until(ExpectedConditions.visibilityOfElementLocated(ConcentPercentage_xpath));
			saveOnIneligibleReasonsWebE.clear();
			saveOnIneligibleReasonsWebE.sendKeys(conctPercentage);
			Thread.sleep(1000);
			this.saveBasicParameterScreen();
			return true;
		}
		 catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
	
	public boolean openBbcRecalculationProcess() {
		 try {
			 this.MouseOverOnMenu();
			 this.moveToLeftNavigation("ABL");
			 WebElement IneligibleCalculationPageWebElement = new WebDriverWait(driver, 1000)
			 .until(ExpectedConditions.elementToBeClickable(BBCRecalculationProcess_xpath));
			 IneligibleCalculationPageWebElement.click();
			 Thread.sleep(1000);
			 return true;
		 	}
		 
	catch (Exception ex) {
	    return false;
					}
		
	}

	

	public  boolean clickOnProcessButton() {
		 try {
			  WebElement IneligibleCalculationPageWebElement = new WebDriverWait(driver, 1000)
			 .until(ExpectedConditions.elementToBeClickable(BBCRecalculationProcessButton_xpath));
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
	public boolean MouseOverOnMenu() {
		try {
		    WebElement menuItemWebE = new WebDriverWait(driver, 10)
			    .until(ExpectedConditions
				    .visibilityOfElementLocated(menuItem_xpath));
		   /* new Actions(driver).moveToElement(menuItemWebE).perform();*/
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
		    		.until(ExpectedConditions.visibilityOfElementLocated(menuContainerWebE_xpath));
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
	    
	    public  boolean navigateToReceivableAgingScreen() {
			 try {
				 this.MouseOverOnMenu();
				 this.moveToLeftNavigation("ABL");
				 WebElement navigateToIneligibleSummaryWebElement = new WebDriverWait(driver, 1000)
				 .until(ExpectedConditions.elementToBeClickable(ReceivableAging_xpath));
				 navigateToIneligibleSummaryWebElement.click();
				 this.isAlertPresent();
				 Thread.sleep(1000);
				 return true;
			 	}
			 
		catch (Exception ex) {
		    return false;
						}
			
		}
	    
	    public  boolean verifyIneligibilityReasonReceivableAgingScreen(String ReasonData){
			try{
			WebElement verifyIneligibilityReasonWebE=new WebDriverWait(driver,20)
			.until(ExpectedConditions.visibilityOfElementLocated(Concentration_ReceivableAgingReason_Xpath));
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
			WebElement verifyIneligibilityAmountWebE=new WebDriverWait(driver,20)
			.until(ExpectedConditions.visibilityOfElementLocated(Concentration_ReceivableAgingAmount_Xpath));
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
	    
	    public  boolean navigateToBBCAvailabilitySCreen() {
			 try {
				 this.MouseOverOnMenu();
				 this.moveToLeftNavigation("ABL");
				 WebElement navigateToIneligibleSummaryWebElement = new WebDriverWait(driver, 1000)
				 .until(ExpectedConditions.elementToBeClickable(BBCAvailability_xpath));
				 navigateToIneligibleSummaryWebElement.click();
				 this.isAlertPresent();
				 Thread.sleep(1000);
				 return true;
			 	}
			 
		catch (Exception ex) {
		    return false;
						}
			
		} 
	    
	    public  boolean clickOnPlus_BBCAvailability() {
			 try {
				  WebElement clickOnPlus_BBCAvailabilityWebElement = new WebDriverWait(driver, 1000)
				 .until(ExpectedConditions.elementToBeClickable(clickOnPlusBBCAvailability_Xpath));
				 clickOnPlus_BBCAvailabilityWebElement.click();
				 Thread.sleep(1000);
				 return true;
			 	}
			 
		catch (Exception ex) {
		    return false;
						}
			
		}
	    
	    public  boolean verifyIneligibilityReasonBBCAvailabilityScreen(String ReasonData){
			try{
			this.clickOnPlus_BBCAvailability();
			WebElement verifyIneligibilityReasonWebE=new WebDriverWait(driver,20)
			.until(ExpectedConditions.visibilityOfElementLocated(Concentration_BBCAvailabilityReason_Xpath));
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
	    
	    public  boolean verifyIneligibilityAmountBBCAvailabilityScreen(String ReasonAmount){
			try{
			WebElement verifyIneligibilityAmountWebE=new WebDriverWait(driver,20)
			.until(ExpectedConditions.visibilityOfElementLocated(Concentration_BBCAvailabilityAmount_Xpath));
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
	    
	    
	    public  boolean generatingBBCReport() {
			 try {
				 this.MouseOverOnMenu();
				 this.moveToLeftNavigation("Reports");
				 WebElement navigationToReportsWebElement = new WebDriverWait(driver, 1000)
				 .until(ExpectedConditions.elementToBeClickable(Reports_xpath));
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
	    public  boolean clickOnBBCReport() {
			 try {
				  WebElement clickOnPlus_BBCAvailabilityWebElement = new WebDriverWait(driver, 1000)
				 .until(ExpectedConditions.elementToBeClickable(clickOnBBCReport_Xpath));
				 clickOnPlus_BBCAvailabilityWebElement.click();
				 Thread.sleep(1000);
				 return true;
			 	}
			 
		catch (Exception ex) {
		    return false;
						}
			
		}  
		
		public  boolean clickOnHTMlButton() {
			 try {
				  WebElement clickOnPlus_BBCAvailabilityWebElement = new WebDriverWait(driver, 1000)
				 .until(ExpectedConditions.elementToBeClickable(clickOnHTMlButton_Xpath));
				 clickOnPlus_BBCAvailabilityWebElement.click();
				  Thread.sleep(1000);
				  ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
				  driver.switchTo().window(tabs2.get(1));
				  return true;
			 	}
			 
		catch (Exception ex) {
		    return false;
						}
			
		}
		
		 public  boolean verifyIneligibilityReasonBBCReport(String ReasonData){
				try{
				WebElement verifyIneligibilityReasonWebE=new WebDriverWait(driver,20)
				.until(ExpectedConditions.visibilityOfElementLocated(Concentration_BBCReportReason_Xpath));
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
		    
		    public  boolean verifyIneligibilityAmountBBCReport(String ReasonAmount){
				try{
				WebElement verifyIneligibilityAmountWebE=new WebDriverWait(driver,20)
				.until(ExpectedConditions.visibilityOfElementLocated(Concentration_BBCReportAmount_Xpath));
				Thread.sleep(100);
				String ActualAmount = verifyIneligibilityAmountWebE.getText().trim();
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
		    
		    public  boolean generatingIneligibleEligibleReceivableAnalysisReportBy_Reason() {
				 try {
					 this.MouseOverOnMenu();
					 this.moveToLeftNavigation("Reports");
					 WebElement navigationToReportsWebElement = new WebDriverWait(driver, 1000)
					 .until(ExpectedConditions.elementToBeClickable(Reports_xpath));
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
		    
		    public  boolean IneligibleEligibleRecivablesAnalysisReport() {
				 try {
					  WebElement clickOnPlus_BBCAvailabilityWebElement = new WebDriverWait(driver, 1000)
					 .until(ExpectedConditions.elementToBeClickable(clickOnIneligibleEligibleAnalysisReport_Xpath));
					 clickOnPlus_BBCAvailabilityWebElement.click();
					 Thread.sleep(1000);
					 return true;
				 	}
				 
			catch (Exception ex) {
			    return false;
							}
				
			} 
		    
		    public  boolean verifyIneligibilityReason_IneligibleEligibleReceivableAnalysisReportBy_Reason(String ReasonData){
				try{
				WebElement verifyIneligibilityReasonWebE=new WebDriverWait(driver,20)
				.until(ExpectedConditions.visibilityOfElementLocated(Concentration_IneligibleEligibleAnalysis_Reason_Reason_Xpath));
				Thread.sleep(100);
				String ActualReason = verifyIneligibilityReasonWebE.getText();
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
		    
		    public  boolean verifyIneligibilityAmount_IneligibleEligibleReceivableAnalysisReportBy_Reason(String ReasonAmount){
				try{
				WebElement verifyIneligibilityAmountWebE=new WebDriverWait(driver,20)
				.until(ExpectedConditions.visibilityOfElementLocated(Concentration_IneligibleEligibleAnalysis_Reason_Amount_Xpath));
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
		    
		    
		    public boolean generatingIneligibleEligibleReceivableAnalysisReportBy_Debtor() {
				 try {
					 this.MouseOverOnMenu();
					 this.moveToLeftNavigation("Reports");
					 WebElement navigationToReportsWebElement = new WebDriverWait(driver, 1000)
					 .until(ExpectedConditions.elementToBeClickable(Reports_xpath));
					 navigationToReportsWebElement.click();
					 Thread.sleep(1000);
					 this.IneligibleEligibleRecivablesAnalysisReport();
					 return true;
				 	}
				 
			catch (Exception ex) {
			    return false;
							}
				
			}
			
			public  boolean ClickonGroupbyDropdown(String GropuBy) {
				try {
					WebElement DropdownWebEelement = new WebDriverWait(driver, 10)
					.until(ExpectedConditions.visibilityOfElementLocated(ClickonGroupbyDropdown_Xpath));
					Select sel = new Select(DropdownWebEelement);
					
					List<WebElement> list = sel.getOptions();
					
					for (WebElement ele : list) 
					{
						/*String data = ele.getText();
						System.out.println(data);*/
						if (ele.getText().equals(GropuBy)) 
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
			
		    
		    public  boolean verifyIneligibilityReason_IneligibleEligibleReceivableAnalysisReportBy_Debtor(String ReasonData){
				try{
				WebElement verifyIneligibilityReasonWebE=new WebDriverWait(driver,20)
				.until(ExpectedConditions.visibilityOfElementLocated(Concentration_IneligibleEligibleAnalysis_Debtor_Reason_Xpath));
				Thread.sleep(100);
				String ActualReason = verifyIneligibilityReasonWebE.getText();
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
		    
		    public  boolean verifyIneligibilityAmount_IneligibleEligibleReceivableAnalysisReportBy_Debtor(String ReasonAmount){
				try{
				WebElement verifyIneligibilityAmountWebE=new WebDriverWait(driver,20)
				.until(ExpectedConditions.visibilityOfElementLocated(Concentration_IneligibleEligibleAnalysis_Debtor_Amount_Xpath));
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
		    
		    public boolean generatingBBCManagementReport() {
				 try {
					 this.MouseOverOnMenu();
					 this.moveToLeftNavigation("Reports");
					 WebElement navigationToReportsWebElement = new WebDriverWait(driver, 1000)
					 .until(ExpectedConditions.elementToBeClickable(Reports_xpath));
					 navigationToReportsWebElement.click();
					 Thread.sleep(1000);
					 this.generatBBCManagementReport();
					 
					 return true;
				 	}
				 
			catch (Exception ex) {
			    return false;
							}
				
			}
		    
		    public  boolean generatBBCManagementReport() {
				 try {
					  WebElement clickOnPlus_BBCAvailabilityWebElement = new WebDriverWait(driver, 1000)
					 .until(ExpectedConditions.elementToBeClickable(BBCManagementReport_Xpath));
					 clickOnPlus_BBCAvailabilityWebElement.click();
					 Thread.sleep(1000);
					 this.clickOnGenerate_BBCManagement();
					 return true;
				 	}
				 
			catch (Exception ex) {
			    return false;
							}
				
			} 
		    
		    public  boolean clickOnGenerate_BBCManagement() {
				try {
					  WebElement clickOnGenerate_BBCManagementWebElement = new WebDriverWait(driver, 1000)
					 .until(ExpectedConditions.elementToBeClickable(ClickonGenerateButton_Xpath));
					  clickOnGenerate_BBCManagementWebElement.click();
					  Thread.sleep(1000);
					  ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
					  driver.switchTo().window(tabs2.get(1));
					  return true;
				 	}
				 
			catch (Exception ex) {
			    return false;
							}
				
			}
		    
		    public  boolean verifyIneligibilityReason_BBCManagementReport(String ReasonData){
				try{
				WebElement verifyIneligibilityReasonWebE=new WebDriverWait(driver,20)
				.until(ExpectedConditions.visibilityOfElementLocated(Concentration_Management_Reason_Xpath));
				Thread.sleep(100);
				String ActualReason = verifyIneligibilityReasonWebE.getText();
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
		    
		    public  boolean verifyIneligibilityAmount_BBCManagementReport(String ReasonAmount){
				try{
				WebElement verifyIneligibilityAmountWebE=new WebDriverWait(driver,20)
				.until(ExpectedConditions.visibilityOfElementLocated(Concentration_Management_Amount_Xpath));
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
		    
		    public  boolean approveTheBBC(String SignatureData) {
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
		    
		    public  boolean clickOnApproveBBC() {
				 try {
					  WebElement clickOnApproveBBCWebElement = new WebDriverWait(driver, 1000)
					 .until(ExpectedConditions.elementToBeClickable(ClickonApproveBBC_Xpath));
					  clickOnApproveBBCWebElement.click();
					  this.isAlertPresent();
					 Thread.sleep(1000);
					 return true;
				 	}
				 
			catch (Exception ex) {
			    return false;
							}
				
			}
		    
		    public  boolean clickOnElectronicSignatureButton() {
				 try {
					  WebElement clickOnElectronicSignatureButtonWebElement = new WebDriverWait(driver, 1000)
					 .until(ExpectedConditions.elementToBeClickable(ClickonElectronicSignature_Xpath));
					  clickOnElectronicSignatureButtonWebElement.click();
					 Thread.sleep(500);
					 return true;
				 	}
				 
			catch (Exception ex) {
			    return false;
							}
				
			}
		    
		    public  boolean datatoTheSigntureTextBox(String SignatureData) {
				 try {
					  WebElement datatoTheSigntureTextBoxWebElement = new WebDriverWait(driver, 1000)
					 .until(ExpectedConditions.elementToBeClickable(SigNameTextBox_Xpath));
					  datatoTheSigntureTextBoxWebElement.clear();
					  datatoTheSigntureTextBoxWebElement.sendKeys(SignatureData);
					   Thread.sleep(500);
					 return true;
				 	}
				 
			catch (Exception ex) {
			    return false;
							}
				
			}
		    
		    public  boolean clickOnAgreeCheckBox() {
				 try {
					  WebElement clickOnAgreeCheckBoxWebElement = new WebDriverWait(driver, 1000)
					 .until(ExpectedConditions.elementToBeClickable(AgreeCheckBox_Xpath));
					  clickOnAgreeCheckBoxWebElement.click();
					 Thread.sleep(500);
					 return true;
				 	}
				 
			catch (Exception ex) {
			    return false;
							}
				
			}
			
			public  boolean clickOnArroveBBCbutton() {
				 try {
					  WebElement clickOnArroveBBCbuttonWebElement = new WebDriverWait(driver, 1000)
					 .until(ExpectedConditions.elementToBeClickable(ClickonApproveBBCButton_Xpath));
					  clickOnArroveBBCbuttonWebElement.click();
					 Thread.sleep(2000);
					 return true;
				 	}
				 
			catch (Exception ex) {
			    return false;
							}
				
			} 
			
			public  boolean clickOnCloseButton() {
				 try {
					  WebElement clickOnCloseButtonWebElement = new WebDriverWait(driver, 1000)
					 .until(ExpectedConditions.elementToBeClickable(CloseButtonPopup_Xpath));
					  clickOnCloseButtonWebElement.click();
					 Thread.sleep(500);
					 return true;
				 	}
				 
			catch (Exception ex) {
			    return false;
							}
				
			} 
			
			public  boolean navigationToBBCReviewData_History() {
				 try {
					 this.MouseOverOnMenu();
					 this.moveToLeftNavigation("ABL");
					 WebElement navigateToIneligibleSummaryWebElement = new WebDriverWait(driver, 1000)
					 .until(ExpectedConditions.elementToBeClickable(BBCReviewData_History));
					 navigateToIneligibleSummaryWebElement.click();
					 this.isAlertPresent();
					 Thread.sleep(1000);
					 return true;
				 	}
				 
			catch (Exception ex) {
			    return false;
							}
				
			} 
			
			public  boolean ClickonSelectBBCDropdown(String SelectBBC) {
				try {
					WebElement DropdownWebEelement = new WebDriverWait(driver, 10)
					.until(ExpectedConditions.visibilityOfElementLocated(SelectBBC_Xpath));
					Thread.sleep(1500);
					Select sel = new Select(DropdownWebEelement);
					
					List<WebElement> list = sel.getOptions();
					
					for (WebElement ele : list) 
					{
						/*String data = ele.getText();
						System.out.println(data);*/
						
						if (ele.getText().equals(SelectBBC)) 
						{
					 		ele.click();
							Thread.sleep(2500);
							
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
			
			public  boolean navigateToReceivableAgingHistoryScreen() {
				 try {
					 this.MouseOverOnMenu();
					 this.moveToLeftNavigation("ABL");
					 WebElement navigateToIneligibleSummaryWebElement = new WebDriverWait(driver, 1000)
					 .until(ExpectedConditions.elementToBeClickable(ReceivableAgingHistory_xpath));
					 navigateToIneligibleSummaryWebElement.click();
					 this.isAlertPresent();
					 Thread.sleep(1000);
					 return true;
				 	}
				 
			catch (Exception ex) {
			    return false;
							}
				
			}
			
			public  boolean navigateToBBCAvailabilityHistoryScreen() {
				 try {
					
					 this.MouseOverOnMenu();
					 this.moveToLeftNavigation("ABL");
					 WebElement navigateToIneligibleSummaryWebElement = new WebDriverWait(driver, 1000)
					 .until(ExpectedConditions.elementToBeClickable(BBCAvailabilityHistory_xpath));
					 navigateToIneligibleSummaryWebElement.click();
					 this.isAlertPresent();
					 Thread.sleep(1000);
					 this.clickOnPlus_BBCAvailability();
					 return true;
				 	}
				 
			catch (Exception ex) {
			    return false;
							}
				
			}
			
			public  boolean generatingBBCReport_Approved(String SelectBBCDate, String SelectBBCStatus) {
				 try {
					 this.MouseOverOnMenu();
					 this.moveToLeftNavigation("Reports");
					 WebElement navigationToReportsWebElement = new WebDriverWait(driver, 1000)
					 .until(ExpectedConditions.elementToBeClickable(Reports_xpath));
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
			
			public  boolean selectBBCStatus(String SelectBBCStatus) {
				try {
					WebElement DropdownWebEelement = new WebDriverWait(driver, 10)
					.until(ExpectedConditions.visibilityOfElementLocated(ApproveBBcDropdown_BBCReport_Xpath));
					Thread.sleep(1500);
					Select sel = new Select(DropdownWebEelement);
					
					List<WebElement> list = sel.getOptions();
					
					for (WebElement ele : list) 
					{
						/*String data = ele.getText();
						System.out.println(data);*/
						
						if (ele.getText().equals(SelectBBCStatus)) 
						{
					 		ele.click();
							Thread.sleep(2500);
							
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
		
			public  boolean selectBBCDate(String SelectBBCDate) {
				try {
					WebElement DropdownWebEelement = new WebDriverWait(driver, 10)
					.until(ExpectedConditions.visibilityOfElementLocated(ApproveBBcDate_BBCReport_Xpath));
					Thread.sleep(1500);
					Select sel = new Select(DropdownWebEelement);
					
					List<WebElement> list = sel.getOptions();
					
					for (WebElement ele : list) 
					{
						/*String data = ele.getText();
						System.out.println(data);*/
						
						if (ele.getText().equals(SelectBBCDate)) 
						{
					 		ele.click();
							Thread.sleep(2500);
							
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
			
			public  boolean generatingIneligibleReasonReportApproved_Reason(String SelectBBCDate, String SelectBBCStatus) {
				 try {
					 this.MouseOverOnMenu();
					 this.moveToLeftNavigation("Reports");
					 WebElement navigationToReportsWebElement = new WebDriverWait(driver, 1000)
					 .until(ExpectedConditions.elementToBeClickable(Reports_xpath));
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
			
			public  boolean generatingIneligibleReasonReportApproved_Debtor(String SelectBBCDate, String SelectBBCStatus) {
				 try {
					 this.MouseOverOnMenu();
					 this.moveToLeftNavigation("Reports");
					 WebElement navigationToReportsWebElement = new WebDriverWait(driver, 1000)
					 .until(ExpectedConditions.elementToBeClickable(Reports_xpath));
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
			
			public  boolean generatingBBCManagementReport_Approved(String SelectBBCDate, String SelectBBCStatus) {
				 try {
					 this.MouseOverOnMenu();
					 this.moveToLeftNavigation("Reports");
					 WebElement navigationToReportsWebElement = new WebDriverWait(driver, 1000)
					 .until(ExpectedConditions.elementToBeClickable(Reports_xpath));
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
			
			public  boolean generatBBCManagementReport_Approved() {
				 try {
					  WebElement clickOnPlus_BBCAvailabilityWebElement = new WebDriverWait(driver, 1000)
					 .until(ExpectedConditions.elementToBeClickable(BBCManagementReport_Xpath));
					 clickOnPlus_BBCAvailabilityWebElement.click();
					 Thread.sleep(1000);
					 //this.clickOnGenerate_BBCManagement();
					 return true;
				 	}
				 
			catch (Exception ex) {
			    return false;
							}
				
			}
		    
	
			public boolean UnreleaseTheBBC(String SelectApprovedClient) {
				 try {
					 this.navigationToApproveBBC();
					 this.clickonAllClientDropdown("INELIGIBLE_CONCENTRATION_AUTOMATION");
					 this.clickonSearchButton();
					 this.SelectCheckBox();
					 this.clickonUnreleaseButton();
					 return true;
				 	}
				 
			catch (Exception ex) {
			    return false;
							}
					} 
			
			public  boolean navigationToApproveBBC() {
				 try {
					 this.MouseOverOnMenu();
					 this.moveToLeftNavigation("ABL");
					 WebElement navigateToIneligibleSummaryWebElement = new WebDriverWait(driver, 1000)
					 .until(ExpectedConditions.elementToBeClickable(ApproveBBc_Xpath));
					 navigateToIneligibleSummaryWebElement.click();
					 this.isAlertPresent();
					 Thread.sleep(1000);
					 return true;
				 	}
				 
			catch (Exception ex) {
			    return false;
							}
							}
			
			public  boolean clickonAllClientDropdown(String SelectApprovedClient) {
				try {
					WebElement DropdownWebEelement = new WebDriverWait(driver, 10)
					.until(ExpectedConditions.visibilityOfElementLocated(SelectBorrowerList_Xpath));
					Thread.sleep(1000);
					Select sel = new Select(DropdownWebEelement);
					
					List<WebElement> list = sel.getOptions();
					
					for (WebElement ele : list) 
					{
						/*String data = ele.getText();
						System.out.println(data);*/
						
						if (ele.getText().equals(SelectApprovedClient)) 
						{
					 		ele.click();
							Thread.sleep(2500);
							
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
									
			public  boolean clickonSearchButton() {
				 try {
					 WebElement clickonSearchButtonWebElement = new WebDriverWait(driver, 1000)
					 .until(ExpectedConditions.elementToBeClickable(ClickonSearch_Xpath));
					 clickonSearchButtonWebElement.click();
					 Thread.sleep(1000);
					 return true;
				 	}
				 
			catch (Exception ex) {
			    return false;
							}
				
			} 
			
			public  boolean SelectCheckBox() {
				 try {
					 WebElement clickonSearchButtonWebElement = new WebDriverWait(driver, 1000)
					 .until(ExpectedConditions.elementToBeClickable(SelectCheckBox_Xpath));
					 clickonSearchButtonWebElement.click();
					 Thread.sleep(1000);
					 return true;
				 	}
				 
			catch (Exception ex) {
			    return false;
							}
				
			} 
						
			public  boolean clickonUnreleaseButton() {
				 try {
					 WebElement clickonUnreleaseButtonWebElement = new WebDriverWait(driver, 1000)
					 .until(ExpectedConditions.elementToBeClickable(ClickonUnreleaseButton_Xpath));
					 clickonUnreleaseButtonWebElement.click();
					 Thread.sleep(1000);
					 Alert simpleAlert = driver.switchTo().alert();
					 simpleAlert.accept();
					 Thread.sleep(1000);
					 return true;
				 	}
				 
			catch (Exception ex) {
			    return false;
							}
				
			}
			
			public  boolean verifyIneligibilityReasonReceivableAging_Lesser(String ReasonData){
				try{
				WebElement verifyIneligibilityReasonWebE=new WebDriverWait(driver,20)
				.until(ExpectedConditions.visibilityOfElementLocated(Concentration_ReceivableAgingReason_Lesser_Xpath));
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
		    
		    public  boolean verifyIneligibilityAmountReceivableAging_Lesser(String ReasonAmount){
				try{
				WebElement verifyIneligibilityAmountWebE=new WebDriverWait(driver,20)
				.until(ExpectedConditions.visibilityOfElementLocated(Concentration_ReceivableAgingAmount_Lesser_Xpath));
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
		    
		    public  boolean verifyIneligibilityAmountBBCAvailability_Lesser(String ReasonAmount){
				try{
				WebElement verifyIneligibilityAmountWebE=new WebDriverWait(driver,20)
				.until(ExpectedConditions.visibilityOfElementLocated(Concentration_BBCAvailabilityAmount_Lesser_Xpath));
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
		    
		    public  boolean verifyIneligibilityReasonBBCReport_Lesser(String ReasonData){
				try{
				WebElement verifyIneligibilityReasonWebE=new WebDriverWait(driver,20)
				.until(ExpectedConditions.visibilityOfElementLocated(Concentration_BBCReportReason_Lesser_Xpath));
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
		    
		    public  boolean verifyIneligibilityAmountBBCReport_Lesser(String ReasonAmount){
				try{
				WebElement verifyIneligibilityAmountWebE=new WebDriverWait(driver,20)
				.until(ExpectedConditions.visibilityOfElementLocated(Concentration_BBCReportAmount_Lesser_Xpath));
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
		    
		    public  boolean verifyIneligibilityReasonIneligibleEligibleReceivableAnalysisReportBy_Reason_Lesser(String ReasonData){
				try{
				WebElement verifyIneligibilityReasonWebE=new WebDriverWait(driver,20)
				.until(ExpectedConditions.visibilityOfElementLocated(Concentration_IneligibleAnalysisReason_Reason_Lesser_Xpath));
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
		    
		    public  boolean verifyIneligibilityAmountIneligibleEligibleReceivableAnalysisReportBy_Reason_Lesser(String ReasonAmount){
				try{
				WebElement verifyIneligibilityAmountWebE=new WebDriverWait(driver,20)
				.until(ExpectedConditions.visibilityOfElementLocated(Concentration_IneligibleAnalysisReason_Amount_Lesser_Xpath));
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
		    
		    public  boolean verifyIneligibilityReasonIneligibleEligibleReceivableAnalysisReportBy_Debtor_Lesser(String ReasonData){
				try{
				WebElement verifyIneligibilityReasonWebE=new WebDriverWait(driver,20)
				.until(ExpectedConditions.visibilityOfElementLocated(Concentration_IneligibleAnalysisDebtor_Reason_Lesser_Xpath));
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
		    
		    public  boolean verifyIneligibilityAmountIneligibleEligibleReceivableAnalysisReportBy_Debtor_Lesser(String ReasonAmount){
				try{
				WebElement verifyIneligibilityAmountWebE=new WebDriverWait(driver,20)
				.until(ExpectedConditions.visibilityOfElementLocated(Concentration_IneligibleAnalysisDebtor_Amount_Lesser_Xpath));
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
		    
		    public  boolean verifyIneligibilityReasonBBCManagementReport_Lesser(String ReasonData){
				try{
				WebElement verifyIneligibilityReasonWebE=new WebDriverWait(driver,20)
				.until(ExpectedConditions.visibilityOfElementLocated(Concentration_BBCManagementReport_Xpath));
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
		    
		    public  boolean verifyIneligibilityAmountBBCManagementReport_Lesser(String ReasonAmount){
				try{
				WebElement verifyIneligibilityAmountWebE=new WebDriverWait(driver,20)
				.until(ExpectedConditions.visibilityOfElementLocated(Concentration_BBCManagementAmount_Xpath));
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
		    
		    public  boolean verifyIneligibilityAmountBBCAvailabilityApprove_Lesser(String ReasonAmount){
				try{
				WebElement verifyIneligibilityAmountWebE=new WebDriverWait(driver,20)
				.until(ExpectedConditions.visibilityOfElementLocated(Concentration_BBCAvailabilityAmount_Approve_Lesser_Xpath));
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
		    
		    public  boolean verifyIneligibilityAmountBBCReportApprove_Lesser(String ReasonAmount){
				try{
				WebElement verifyIneligibilityAmountWebE=new WebDriverWait(driver,20)
				.until(ExpectedConditions.visibilityOfElementLocated(Concentration_BBCReportAmountApprove_Lesser_Xpath));
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
		    
		    
		    public  boolean verifyIneligibilityReasonReceivableAgingScreen_exclude(String ReasonData){
				try{
				WebElement verifyIneligibilityReasonWebE=new WebDriverWait(driver,20)
				.until(ExpectedConditions.visibilityOfElementLocated(Concentration_ReceivableAgingReason_Exclude_Xpath));
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
		    
		    public  boolean verifyIneligibilityAmountReceivableAgingScreen_exclude(String ReasonAmount){
				try{
				WebElement verifyIneligibilityAmountWebE=new WebDriverWait(driver,20)
				.until(ExpectedConditions.visibilityOfElementLocated(Concentration_ReceivableAgingAmount_Exclude_Xpath));
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
		    
		    public  boolean verifyIneligibilityReasonBBCAvailabilityScreen_exclude(String ReasonData){
				try{
					this.clickOnPlus_BBCAvailability();
					
				WebElement verifyIneligibilityReasonWebE=new WebDriverWait(driver,20)
				.until(ExpectedConditions.visibilityOfElementLocated(Concentration_BBCAvailabilityScreenReason_Exclude_Xpath));
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
		    
		    public  boolean verifyIneligibilityAmountBBCAvailabilityScreen_exclude(String ReasonAmount){
				try{
				WebElement verifyIneligibilityAmountWebE=new WebDriverWait(driver,20)
				.until(ExpectedConditions.visibilityOfElementLocated(Concentration_BBCAvailabilityScreenAmount_Exclude_Xpath));
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
		    
		    public  boolean verifyIneligibilityReasonBBCReport_exclude(String ReasonData){
				try{
				WebElement verifyIneligibilityReasonWebE=new WebDriverWait(driver,20)
				.until(ExpectedConditions.visibilityOfElementLocated(Concentration_BBCReportReason_Exclude_Xpath));
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
		    
		    public  boolean verifyIneligibilityAmountBBCReport_exclude(String ReasonAmount){
				try{
				WebElement verifyIneligibilityAmountWebE=new WebDriverWait(driver,20)
				.until(ExpectedConditions.visibilityOfElementLocated(Concentration_BBCReportAmount_Exclude_Xpath));
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
		    
		    public  boolean verifyIneligibilityReason_IneligibleEligibleReceivableAnalysisReportBy_Reason_exclude(String ReasonData){
				try{
				WebElement verifyIneligibilityReasonWebE=new WebDriverWait(driver,20)
				.until(ExpectedConditions.visibilityOfElementLocated(Concentration_IneligibleEligibleReceivableAnalysisReportBy_ReasonReason_Exclude_Xpath));
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
		    
		    public  boolean verifyIneligibilityAmount_IneligibleEligibleReceivableAnalysisReportBy_Reason_exclude(String ReasonAmount){
				try{
				WebElement verifyIneligibilityAmountWebE=new WebDriverWait(driver,20)
				.until(ExpectedConditions.visibilityOfElementLocated(Concentration_IneligibleEligibleReceivableAnalysisReportBy_ReasonAmount_Exclude_Xpath));
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
		    
		    public  boolean verifyIneligibilityReason_IneligibleEligibleReceivableAnalysisReportBy_Debtor_exclude(String ReasonData){
				try{
				WebElement verifyIneligibilityReasonWebE=new WebDriverWait(driver,20)
				.until(ExpectedConditions.visibilityOfElementLocated(Concentration_IneligibleEligibleReceivableAnalysisReportBy_DebtorReason_Exclude_Xpath));
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
		    
		    public  boolean verifyIneligibilityAmount_IneligibleEligibleReceivableAnalysisReportBy_Debtor_exclude(String ReasonAmount){
				try{
				WebElement verifyIneligibilityAmountWebE=new WebDriverWait(driver,20)
				.until(ExpectedConditions.visibilityOfElementLocated(Concentration_IneligibleEligibleReceivableAnalysisReportBy_DebtorAmount_Exclude_Xpath));
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
		    
		    public  boolean verifyIneligibilityReason_BBCManagementReport_exclude(String ReasonData){
				try{
				WebElement verifyIneligibilityReasonWebE=new WebDriverWait(driver,20)
				.until(ExpectedConditions.visibilityOfElementLocated(Concentration_BBCManagementReportReason_Exclude_Xpath));
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
		    
		    public  boolean verifyIneligibilityAmount_BBCManagementReport_exclude(String ReasonAmount){
				try{
				WebElement verifyIneligibilityAmountWebE=new WebDriverWait(driver,20)
				.until(ExpectedConditions.visibilityOfElementLocated(Concentration_BBCManagementReportAmount_Exclude_Xpath));
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

		    public  boolean navigationToBBCToApproved() {
				 try {
					 this.MouseOverOnMenu();
					 this.moveToLeftNavigation("ABL");
					 WebElement navigateToIneligibleSummaryWebElement = new WebDriverWait(driver, 1000)
					 .until(ExpectedConditions.elementToBeClickable(ToBBCToApproved_Xpath));
					 navigateToIneligibleSummaryWebElement.click();
					 Thread.sleep(1000);
					 return true;
				 	}
				 
			catch (Exception ex) {
			    return false;
							}
							}
			
			public  boolean clickonPurgeButton() {
				 try {
					 WebElement clickonUnreleaseButtonWebElement = new WebDriverWait(driver, 1000)
					 .until(ExpectedConditions.elementToBeClickable(ClickonPurgeButton_Xpath));
					 clickonUnreleaseButtonWebElement.click();
					 Thread.sleep(1000);
					 Alert simpleAlert = driver.switchTo().alert();
					 simpleAlert.accept();
					 Thread.sleep(1000);
					 return true;
				 	}
				 
			catch (Exception ex) {
			    return false;
							}
				
			} 
			public boolean purgeBBC(String SelectApprovedClient) {
				 try {
					 this.navigationToBBCToApproved();
					 this.clickonAllClientDropdown("INELIGIBLE_CONCENTRATION_AUTOMATION");
					 this.clickonSearchButton();
					 this.SelectCheckBox();
					 this.clickonPurgeButton();
					 return true;
				 	}
				 
			catch (Exception ex) {
			    return false;
							}
					}
			
			public boolean purgeBBC_Equal(String SelectApprovedClient) {
				 try {
					 this.navigationToBBCToApproved();
					 this.clickonAllClientDropdown("CONC_EQUAL_AUTOMATION");
					 this.clickonSearchButton();
					 this.SelectCheckBox();
					 this.clickonPurgeButton();
					 return true;
				 	}
				 
			catch (Exception ex) {
			    return false;
							}
					} 
			
			public boolean UnreleaseTheBBC_Equal(String SelectApprovedClient) {
				 try {
					 this.navigationToApproveBBC();
					 this.clickonAllClientDropdown("CONC_EQUAL_AUTOMATION");
					 this.clickonSearchButton();
					 this.SelectCheckBox();
					 this.clickonUnreleaseButton();
					 return true;
				 	}
				 
			catch (Exception ex) {
			    return false;
							}
					} 
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
			
			
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
