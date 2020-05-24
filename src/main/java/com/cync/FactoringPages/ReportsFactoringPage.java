package com.cync.FactoringPages;

import java.awt.RenderingHints.Key;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.cync.base.BasePage;

//@author:Aatish
public class ReportsFactoringPage extends BasePage{
	
//private final By htmlButton_xpath=By.xpath("//div[@class='ui-dialog-buttonset']/button[3]");
private final By htmlButton_xpath=By.xpath("//button[text()='PDF']");
private final By asOfDate_xpath = By.xpath("//input[@id='as_of_date']");
private final By asOfDate_StatementofAccount_xpath=By.xpath("//input[@id='asof_dt']");
private final By Header_xpath = By.xpath("//td/h2[1]");
private final By FromDate_xpath=By.xpath("//input[@id='from_date']");
private final By ToDate_xpath=By.xpath("//input[@id='to_date']");

private final By FromDate_StartDate_xpath=By.xpath("//input[@id='start_date']");
private final By ToDate_EndDate_xpath=By.xpath("//input[@id='end_date']");

private final By reportheader_xpath = By.xpath("//h2");
private final By HeaderReportTitle_xpath = By.xpath("//td[2]/h2[2]");

private final By HeaderClientAcitivityReportTitle_xpath = By.xpath("//td/h2[1]/div[1]");
private final By StartDate_xpath = By.xpath("//input[@id='start_dt']");
private final By ClientFundedARaging_xpath=By.xpath("//a[text()='Client Funded AR Aging']");
public ReportsFactoringPage(WebDriver driver) {
	super(driver);
	try
	{
		
	}
	catch(Exception e)
	{
		
	}
}
	
	public boolean clickHTMLButton()
	{
		try{
			
           Thread.sleep(2000);
			WebElement WebEelement=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(htmlButton_xpath));
			
			WebEelement.click();
			
			
			
	return true;
		}
		catch(Exception ex){
			return false;
		}
}
	public boolean enterAsOfDate(String asOfDate)
	{
		try{

			WebElement ReportWebEelement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(asOfDate_xpath));
			ReportWebEelement.sendKeys(asOfDate);
			ReportWebEelement.sendKeys(Keys.ESCAPE);
			
			
	return true;
		}
	catch (Exception ex) {
	}
	return false;

	}	
	public boolean enterAsOfDate_StatementofAccounts(String asOfDate)
	{
		try{

			WebElement ReportWebEelement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(asOfDate_StatementofAccount_xpath));
			ReportWebEelement.sendKeys(asOfDate);
			ReportWebEelement.sendKeys(Keys.ESCAPE);
			
			
	return true;
		}
	catch (Exception ex) {
	}
	return false;

	}	
	public boolean StartDate(String StartDate)
	{
		try{

			WebElement ReportWebEelement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(StartDate_xpath));
			ReportWebEelement.sendKeys(StartDate);
			ReportWebEelement.sendKeys(Keys.ESCAPE);
			
			
	return true;
		}
	catch (Exception ex) {
	}
	return false;

	}	
	
	
	/**/
	public boolean enterFromDate(String FromDate)
	{
		try{

			WebElement ReportWebEelement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(FromDate_xpath));
			ReportWebEelement.sendKeys(FromDate);
			ReportWebEelement.sendKeys(Keys.ESCAPE);
			
			
	return true;
		}
	catch (Exception ex) {
	}
	return false;

	}		
	public boolean enterToDate(String ToDate)
	{
		try{

			WebElement ReportWebEelement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(ToDate_xpath));
			ReportWebEelement.sendKeys(ToDate);
			ReportWebEelement.sendKeys(Keys.ESCAPE);
			
			
	return true;
		}
	catch (Exception ex) {
	}
	return false;

	}		
	public boolean enterFromDate_PurchaseSummary(String FromDate_PurchaseSummary)
	{
		try{

			WebElement ReportWebEelement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(FromDate_StartDate_xpath));
			ReportWebEelement.sendKeys(FromDate_PurchaseSummary);
			ReportWebEelement.sendKeys(Keys.ESCAPE);
			
			
	return true;
		}
	catch (Exception ex) {
	}
	return false;

	}		
	public boolean enterToDate_PurchaseSummary(String ToDate_PurchaseSummary)
	{
		try{

			WebElement ReportWebEelement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(ToDate_EndDate_xpath));
			ReportWebEelement.sendKeys(ToDate_PurchaseSummary);
			ReportWebEelement.sendKeys(Keys.ESCAPE);
			
			
	return true;
		}
	catch (Exception ex) {
	}
	return false;

	}		
	/*end*/
	public String verifyHeader(String Header){
        try{
           
            WebElement successMessageWebE=new WebDriverWait(driver,10)
            .until(ExpectedConditions.visibilityOfElementLocated(Header_xpath));
            String actual_msg=successMessageWebE.getText().trim();
           
            if(actual_msg.contains(Header));
        }
        catch(Exception ex){
        }
        return Header;
        }
	public boolean moveToReportmenus(String navigation_Name) {
		try {
			//By menuContainerWebE_xpath = By.xpath("//ul[@id='menu']");
			//ul[@class='reports']/li//a
			By menuContainerWebE_xpath = By.xpath("//a");
			WebElement menuContainerWebE = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(menuContainerWebE_xpath));
			/*List<WebElement> menuWebL = menuContainerWebE.findElements(By
					.tagName("li"));*/
			List<WebElement> menuWebL = menuContainerWebE.findElements(menuContainerWebE_xpath);
			for (WebElement option : menuWebL) {
				String title = option.getText();
				//System.out.println(title);
				if (title.equals(navigation_Name)) {
					new Actions(driver).moveToElement(option).click().perform();
					return true;
				}

			}
			return true;
		} catch (Exception ex) {
			return false;
		}

	}
	By ClientContainerWebE_xpath=By.xpath("//select[@id='borrower_id']");
	public boolean selectFromPopupDropDown(String clientname) {
		try {
			
		
			WebElement menuContainerWebE = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(ClientContainerWebE_xpath));
			
			List<WebElement> menuWebL = menuContainerWebE.findElements(ClientContainerWebE_xpath);
			for (WebElement option : menuWebL) {
				String title = option.getText();
				System.out.println(title);
				if (title.contains(clientname)) {
					new Actions(driver).moveToElement(option).click().perform();
					return true;
				}
			}
			return true;
		} 
		catch (Exception ex) {
			return false;
		}

	}
	
	/*public boolean checkreporttitle(String report_name){
		try{
			
			List<WebElement> elements=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(reportheader_xpath));
			
		    for(WebElement option : elements)
		  {
			  String title = option.getText();
			 System.out.println(title);
			 System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
			if(title.contains(report_name))
			{
				System.out.println(title);
				break;
			}
		  }
		    return true;
	
		}
		catch(Exception ex){
			return false;
		}
		
}*/
	public String checkreporttitle(String Header){
        try{
           
            WebElement successMessageWebE=new WebDriverWait(driver,10)
            .until(ExpectedConditions.visibilityOfElementLocated(HeaderReportTitle_xpath));
            String actual_msg=successMessageWebE.getText().trim();
           
            if(actual_msg.contains(Header));
        }
        catch(Exception ex){
        }
        return Header;
        }
	public String ClientActivityDetail(String Header){
        try{
           
            WebElement successMessageWebE=new WebDriverWait(driver,10)
            .until(ExpectedConditions.visibilityOfElementLocated(HeaderClientAcitivityReportTitle_xpath));
            String actual_msg=successMessageWebE.getText().trim();
           
            if(actual_msg.contains(Header));
        }
        
         
        catch(Exception ex){
        }
        return Header;
        
        }
	
	public boolean Switchtochildwindow() {
        try {
           
            Set <String> handles =driver.getWindowHandles();
            Iterator<String> it = handles.iterator();
            //iterate through your windows
            while (it.hasNext()){
            String parent = it.next();
            String newWin = it.next();
            Thread.sleep(1000);
            driver.switchTo().window(newWin).close();
            driver.switchTo().window(parent);
          
            return true;
            }
        } catch (Exception ex) {
            return false;
        }
        return false;
        }
	public boolean moveToReport()
	{
		try
		{
			WebElement ReportARagingWebEelement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(ClientFundedARaging_xpath));
			ReportARagingWebEelement.click();
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}
}
