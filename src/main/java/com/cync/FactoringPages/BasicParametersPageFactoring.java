package com.cync.FactoringPages;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.cync.base.BasePage;

public class BasicParametersPageFactoring extends BasePage
{
	private final By BasicParameterHeader_xpath = By.xpath("//span[text()='Basic Parameters' and @class='paneltitle']");
	
	private final By editBTN_xpath = By.xpath("//a[@id='parameter_edit']");
	private final By invValTempDropdown_xpath = By.xpath("//select[@name='parameter[invoice_verification_template_id]']");
	private final By feedaysDropdown_xpath = By.xpath("//select[@name='parameter[fee_calculated_on]']");
	private final By saveBTN_xpath = By.xpath("//input[@class='view-button save_btn']");
	//private final By saveBTN_xpath = By.xpath("//button[@id='borrower_save_bt']");
	
    public static final String SCROLL_INTO_VIEW="arguments[0].scrollIntoView();";

	
	public BasicParametersPageFactoring(WebDriver driver) {
		super(driver);
		try
		{
			
		}
		catch(Exception e)
		{
			
		}
	}
	public  String PageHeaderVerify(String Header)
    {
    	try
    	{
    		WebElement HeaderWebEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(BasicParameterHeader_xpath));
		HeaderWebEelement.getText();
		Thread.sleep(2000);
    	}
    	catch(Exception e)
    	{
    		
    	}
    	return Header;
    }
	public boolean ClickOnEditBTN() {
		try
		{
			WebElement EditWebEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(editBTN_xpath));
		EditWebEelement.click();
		Thread.sleep(1000);
		return true;
		}
		catch(Exception e)
		{
			return false;
		}	
		
	}
	public boolean selectInvValTemp(String tempdata) {
			try {
				Thread.sleep(2000);
				WebElement DropdownWebEelement = new WebDriverWait(driver, 100)
				.until(ExpectedConditions
						.visibilityOfElementLocated(invValTempDropdown_xpath));
				//DropdownWebEelement.click();
				System.out.println("*********************"+tempdata);
				Select sel = new Select(DropdownWebEelement);
				sel.selectByVisibleText(tempdata);
				/*List<WebElement> list = sel.getOptions();
				Thread.sleep(1000);
				for(WebElement ele : list) 
				{
					if (ele.getText().trim().contains(tempdata))
					{
						list.size();
						ele.click();
						Thread.sleep(2000);

						 return true;
					}
				}*/
				
				
				/*for(Iterator<WebElement> iterator = list.iterator();
						iterator.hasNext(); ) {
		            WebElement WebL = iterator.next();
		            ((JavascriptExecutor) driver).executeScript(SCROLL_INTO_VIEW, WebL);
		           String Name= WebL.getText().trim();
		            if(Name.equalsIgnoreCase(tempdata)) {
		                WebL.click();
		                System.out.println("Selected  is "+Name);
		            }
		        }*/

			} catch (Exception ex) {
				return false;
			}
			return true;
		}
	public Object selectFeeDays(String feedays) {
		try {
			WebElement productTypeDropdownWebEelement = new WebDriverWait(
					driver, 20).until(ExpectedConditions
					.visibilityOfElementLocated(feedaysDropdown_xpath));
			Select sel = new Select(productTypeDropdownWebEelement);
			
			List<WebElement> list = sel.getOptions();
			
			for (WebElement ele : list) {
				if (ele.getText().equals(feedays)) {
					ele.click();
					Thread.sleep(1000);

					 return feedays;
				}
			}

		} catch (Exception ex) {
			return false;
		}
		return feedays;
	}
	public boolean ClickOnSaveBTN() {
		try
		{
			WebElement savebtnWebElement = new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(saveBTN_xpath));
			savebtnWebElement.click();
			Thread.sleep(500);
			
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}
	public String VerifyRetentionActionPending(String Header)
    {
        String h1 = "";
    try{
        WebElement editWebEelement=new WebDriverWait(driver,10)
        .until(ExpectedConditions.visibilityOfElementLocated(BasicParameterHeader_xpath));
        Thread.sleep(1000);
        editWebEelement.isDisplayed();
        String verifyOverride=editWebEelement.getText().trim();
        if (verifyOverride.equals(Header));
       
        h1=verifyOverride;
     
        }
      catch (Exception ex) {
              
      }
    return h1;
    
      }
   
   
	
}
