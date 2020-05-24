package com.cync.pages;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import org.openqa.selenium.support.ui.WebDriverWait;

import com.cync.base.BasePage;

public class LetterOfCreditReportPage extends BasePage{

	
	
	private final By bbcreport_xpath=By.xpath("(//li[@class='open_menu'])[9]");
	private final By BbcStatus_xpath=By.xpath("//select[@id='bbc_status']");
	private final By BbcOrientation_xpath=By.xpath("//select[@id='bbc_print_orientation']");
	private final By ReportAsHTML_xpath=By.xpath("(//button[@type='button'])[8]");
	private final By VerifyingTheReport_xpath=By.xpath("//h2[contains(text(),'EXECUTION_SCRIPT')]");
	private final By LCAmount_xpath=By.xpath("(//td[contains(text(), ' 5,100.00')])[1]");	
	private final By LoanStatusReport_xpath=By.xpath("(//li[@class='open_menu'])[39]");
	private final By clientDropdown_xpath=By.xpath("//select[@id='client']");
	private final By ReportAsOfDate_xpath=By.xpath("//input[@id='report_date']");
	private final By LoanStatusReportHTML_xpath=By.xpath("(//button[@type='button'])[8]");
	private final By VerifyLoanStatusREport_xpath=By.xpath("(//td[contains(text(),'5,100.00')])[1]");
	private final By BbcDate_xpath=By.xpath("//select[@id='bbc_id']");

	
	
	
	public LetterOfCreditReportPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	


	public boolean clickonbbcreport() {
    	try {
    	    WebElement bbcreport = new WebDriverWait(driver, 10)
    		    .until(ExpectedConditions
    			    .visibilityOfElementLocated(bbcreport_xpath));
    	    bbcreport.click();
    	    Thread.sleep(2000);
    	    return true;
    	} catch (Exception ex) {
    	    return false;
    	}

        }

	
	public boolean clickonBBCStatus() {
    	try {
    	    WebElement bbcreport = new WebDriverWait(driver, 10)
    		    .until(ExpectedConditions
    			    .visibilityOfElementLocated(BbcStatus_xpath));
    	    bbcreport.click();
    	    Thread.sleep(2000);
    	    return true;
    	} catch (Exception ex) {
    	    return false;
    	}

        }
	
	public boolean clickonBBCOrientation() {
    	try {
    	    WebElement bbcreport = new WebDriverWait(driver, 10)
    		    .until(ExpectedConditions
    			    .visibilityOfElementLocated(BbcOrientation_xpath));
    	    bbcreport.click();
    	    Thread.sleep(2000);
    	    return true;
    	} catch (Exception ex) {
    	    return false;
    	}

        }
	
	public boolean clickonHTML() {
    	try {
    	    WebElement bbcreport = new WebDriverWait(driver, 10)
    		    .until(ExpectedConditions
    			    .visibilityOfElementLocated(ReportAsHTML_xpath));
    	    bbcreport.click();
    	    Thread.sleep(2000);
    	    return true;
    	} catch (Exception ex) {
    	    return false;
    	}
	}
 
	
	public boolean VerifyReport(String ReportHeader)
	{
	 
	try{
		WebElement HeaderWebEelement=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(VerifyingTheReport_xpath));
		String actual = HeaderWebEelement.getText();
		if (actual.equals(ReportHeader))
			return true;
		else
			return false;

	} catch (Exception e) {
		return false;
	}
	}
	

	public String VerifyLcAmount(String amount)
	{
	 
	try{
		WebElement HeaderWebEelement=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(LCAmount_xpath));
		String actual = HeaderWebEelement.getText();
		if (actual.equals(amount))
		{
			
		}
		
	} catch (Exception e) {
		
	}
	return amount;
	}
	
	
	
	 public boolean clickonLoanStatusReport() {
	    	try {
	    	    WebElement bbcreport = new WebDriverWait(driver, 10)
	    		    .until(ExpectedConditions
	    			    .visibilityOfElementLocated(LoanStatusReport_xpath));
	    	    bbcreport.click();
	    	    Thread.sleep(2000);
	    	    return true;
	    	} catch (Exception ex) {
	    	    return false;
	    	}

	        }
	
	
	
	
	 public boolean selectclientFromDropDown(String visibleText) {
	    	try {
	    	    WebElement bbcreport = new WebDriverWait(driver, 10)
	    		    .until(ExpectedConditions
	    			    .visibilityOfElementLocated(clientDropdown_xpath));
	    
	    	    Select sel = new Select(bbcreport);
				
				List<WebElement> list = sel.getOptions();
				
				for (WebElement ele : list) 
				{
				
					if (ele.getText().equals(visibleText)) 
					{
				 		ele.click();
						
						 return true;
					}
				}
		 
	    	    Thread.sleep(2000);
	    	    return true;
	    	} catch (Exception ex) {
	    	    return false;
	    	}

	        }
	
	
	
	 public boolean selectReportAsOfDate(String date) {
	    	try {
	    	    WebElement bbcreport = new WebDriverWait(driver, 10)
	    		    .until(ExpectedConditions
	    			    .visibilityOfElementLocated(ReportAsOfDate_xpath));
	    	    bbcreport.clear();
	    	    bbcreport.sendKeys(date);
	    	    bbcreport.sendKeys(Keys.ESCAPE);
	    	    Thread.sleep(2000);
	    	    return true;
	    	} catch (Exception ex) {
	    	    return false;
	    	}

	        }
	
	 public boolean clickLoanStatusReportHTML() {
	    	try {
	    	    WebElement bbcreport = new WebDriverWait(driver, 10)
	    		    .until(ExpectedConditions
	    			    .visibilityOfElementLocated(LoanStatusReportHTML_xpath));
	    	    bbcreport.click();
	    	    Thread.sleep(2000);
	    	    return true;
	    	} catch (Exception ex) {
	    	    return false;
	    	}

	        }
	
	
	
	 public String VerifyReportLoanStatus(String amount) {
	    	try {
	    	    WebElement bbcreport = new WebDriverWait(driver, 10)
	    		    .until(ExpectedConditions
	    			    .visibilityOfElementLocated(VerifyLoanStatusREport_xpath));
	    	    String actual=bbcreport.getText().trim();
	    	    if (actual.equals(amount))
	    	    {
	    	    	
	    	    }
	    		
	    	} catch (Exception ex) {
	    	
	    	}
			return amount;

	        }
	
	 public boolean selectBBCStatus(String status) {
	    	try {
	    	    WebElement bbcreport = new WebDriverWait(driver, 10)
	    		    .until(ExpectedConditions
	    			    .visibilityOfElementLocated(BbcStatus_xpath));
	    
	    	    Select sel = new Select(bbcreport);
	    	    sel.selectByIndex(1);
				
				/*List<WebElement> list = sel.getOptions();
				
				for (WebElement ele : list) 
				{
				
					if (ele.getText().equals(status)) 
					{
				 		ele.click();
						
						 return true;
					}
				}*/
		 
	    	    Thread.sleep(2000);
	    	    return true;
	    	} catch (Exception ex) {
	    	    return false;
	    	}

	        }
	
	 public boolean selectBbcDate(String date) {
	    	try {
	    	    WebElement bbcreport = new WebDriverWait(driver, 10)
	    		    .until(ExpectedConditions
	    			    .visibilityOfElementLocated(BbcDate_xpath));
	    	    bbcreport.clear();
	    	    bbcreport.sendKeys(date);
	    	    bbcreport.sendKeys(Keys.ESCAPE);
	    	    Thread.sleep(2000);
	    	    return true;
	    	} catch (Exception ex) {
	    	    return false;
	    	}

	        }


	
	
	
	
	
}
