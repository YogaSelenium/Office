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

public class Retention extends BasePage {

	public Retention(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	private final By selectAllValues_xpath = By.xpath("//button[@class='moveall arrow-btnstyle']");
	private final By saveOnIneligibleReasons_xpath = By.id("apply_calculations");
	private final By unselectAllValues_xpath = By.xpath("//button[@class='removeall arrow-btnstyle']");
	private final By selecttRetention_xpath = By.xpath("(//option[contains(text(),'Retention')])[1]");
	private final By finalRetention_xpath = By.xpath("//button[@class='move arrow-btnstyle']");
	private final By BBCRecalculationProcess_xpath=By.xpath("//a[contains(text(),'BBC Recalculation Process')]");
	private final By BBCRecalculationProcessButton_xpath=By.xpath("//a[contains(text(),'Process/Re-Calculate BBC')]");
	private final By menuItem_xpath = By.id("top-menu");
	private final By ReceivableAging_xpath=By.xpath("//a[contains(text(),'Receivable Aging')]");
	private final By Retention_IneligibilityReason_Xpath=By.xpath("//td[contains(text(),'Retention')]");
	private final By IneligibilityReasonTotals_Xpath=By.xpath("(//td[contains(text(),'Totals')])[1]");
	private final By Retention_IneligibilityAmount_Xpath=By.xpath("(//td[contains(text(),'159,050.00')])[1]");
	private final By BBCAvailability_xpath=By.xpath("(//a[contains(text(),'BBC Availability')])[1]");
	private final By clickOnHTMlButton_Xpath=By.xpath("//button[contains(text(),'HTML')]");
	private final By Reports_xpath=By.xpath("(//a[contains(text(),'Reports')])[1]");
	private final By clickOnBBCReport_Xpath=By.xpath("(//li[@class='open_menu'])[9]");
	private final By clickOnIneligibleEligibleAnalysisReport_Xpath=By.xpath("(//li[@class='open_menu'])[3]");
	private final By ClickonGroupbyDropdown_Xpath=By.xpath("//select[@id='ineligible_style']");
	private final By clickOnPlusBBCAvailability_Xpath=By.xpath("(//i[@class='icon-plus'])[2]");
	private final By BBCManagementReport_Xpath=By.xpath("(//li[@class='open_menu'])[28]");
	private final By ClickonGenerateButton_Xpath=By.xpath("//button[contains(text(),'Generate')]");
	private final By BBCManagement_ReasonData=By.xpath("//td[contains(text(),'Retention')]");
	private final By BBCManagement_AmountData=By.xpath("(//td[contains(text(),'159,050')])[5]");
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
	
	public  boolean selecttRetention() {
		try {
			WebElement selectUninsuiredWebE=new WebDriverWait(driver,20)
			.until(ExpectedConditions.visibilityOfElementLocated(selecttRetention_xpath));
			selectUninsuiredWebE.click();
			Thread.sleep(100);
			return true;
		}
		 catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
	
	public  boolean finalRetention() {
		try {
			WebElement finalUninsuiredWebE=new WebDriverWait(driver,20)
			.until(ExpectedConditions.visibilityOfElementLocated(finalRetention_xpath));
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

	public boolean selectRetention() {
		 try {
			 this.selectAllReasons();
			 this.removeAllList();
			 this.selecttRetention();
			 this.finalRetention();
			 this.saveOnIneligibleCalculation();
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
			.until(ExpectedConditions.visibilityOfElementLocated(Retention_IneligibilityReason_Xpath));
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
			.until(ExpectedConditions.visibilityOfElementLocated(Retention_IneligibilityAmount_Xpath));
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
	    public  boolean navigateToBBCAvailabilitySCreen() {
			 try {
				 this.MouseOverOnMenu();
				 this.moveToLeftNavigation("ABL");
				 WebElement navigateToIneligibleSummaryWebElement = new WebDriverWait(driver, 1000)
				 .until(ExpectedConditions.elementToBeClickable(BBCAvailability_xpath));
				 navigateToIneligibleSummaryWebElement.click();
				 this.isAlertPresent();
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
			.until(ExpectedConditions.visibilityOfElementLocated(Retention_IneligibilityReason_Xpath));
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
	    
	    public  boolean verifyIneligibilityAmountBBCAvailabilityScreen(String ReasonAmount){
			try{
			WebElement verifyIneligibilityAmountWebE=new WebDriverWait(driver,20)
			.until(ExpectedConditions.visibilityOfElementLocated(Retention_IneligibilityAmount_Xpath));
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
				.until(ExpectedConditions.visibilityOfElementLocated(Retention_IneligibilityReason_Xpath));
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
				.until(ExpectedConditions.visibilityOfElementLocated(Retention_IneligibilityAmount_Xpath));
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
				.until(ExpectedConditions.visibilityOfElementLocated(Retention_IneligibilityReason_Xpath));
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
				.until(ExpectedConditions.visibilityOfElementLocated(Retention_IneligibilityAmount_Xpath));
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
					try
					{
					WebElement verifyIneligibilityReasonWebE=new WebDriverWait(driver,20)
					.until(ExpectedConditions.visibilityOfElementLocated(Retention_IneligibilityReason_Xpath));
					Thread.sleep(100);
					String ActualReason = verifyIneligibilityReasonWebE.getText();
					if(ActualReason.equalsIgnoreCase(ReasonData))
							{
							System.out.println(ActualReason);
							return true;
							}
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
					.until(ExpectedConditions.visibilityOfElementLocated(Retention_IneligibilityAmount_Xpath));
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
	
				public  boolean verifyIneligibilityReasonBBCManagementReport(String ReasonData){
					try{
					WebElement verifyIneligibilityReasonWebE=new WebDriverWait(driver,20)
					.until(ExpectedConditions.visibilityOfElementLocated(BBCManagement_ReasonData));
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
			    
			    public  boolean verifyIneligibilityAmountBBCManagementReport(String ReasonAmount){
					try{
					WebElement verifyIneligibilityAmountWebE=new WebDriverWait(driver,20)
					.until(ExpectedConditions.visibilityOfElementLocated(BBCManagement_AmountData));
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
						 this.navigateToBBCAvailabilitySCreen();
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
						 Thread.sleep(5000);
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
						 		this.isAlertPresent();
						 		 Thread.sleep(5000);
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
				
				public boolean isAlertPresent() {

            	    boolean presentFlag = false;

            	    try {
            	        Alert alert = driver.switchTo().alert();
               	        presentFlag = true;
            	        alert.accept();
            	        } 
            	    catch (Exception ex) {
            	        
            	        System.out.println("No Such Alert Present");
            	        
            	    }

            	    return presentFlag;
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
						 this.selectBBCDate("10/01/2018");
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
						 this.selectBBCDate("10/01/2018");
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
						 this.selectBBCDate("10/01/2018");
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
						 this.selectBBCDate("10/01/2018");
						 Thread.sleep(500);
						 this.clickOnGenerate_BBCManagement();
						 return true;
					 	}
					 
				catch (Exception ex) {
				    return false;
								}
					
				}

}
