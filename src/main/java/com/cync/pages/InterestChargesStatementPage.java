package com.cync.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.SkipException;

import com.cync.base.BasePage;

public class InterestChargesStatementPage extends BasePage {
	
	private final By reportPopUpHeader_xpath=By.xpath("//span[text()='Interest Charges Statement']");
    private final By periodDropdown_xpath=By.xpath("//select[@id='selected_period']");
    private final By HTMLButton_xpath=By.xpath("//button[text()='HTML']");
	

	public InterestChargesStatementPage(WebDriver driver) {
		super(driver);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(!driver.findElement(reportPopUpHeader_xpath).getText().trim().equals("Interest Charges Statement")){
			throw new SkipException("Interest Charges Statement Report couldn't open.");
		}// TODO Auto-generated constructor stub

	
	}
	
public boolean selectPeriodFromDropdown(String visibleText) throws InterruptedException{
		
		try {
			WebElement DropdownWebEelement = new WebDriverWait(driver, 10)
			.until(ExpectedConditions.visibilityOfElementLocated(periodDropdown_xpath));
			DropdownWebEelement.click();
			Select sel = new Select(DropdownWebEelement);
			
			List<WebElement> list = sel.getOptions();
			
			for (WebElement ele : list) 
			{
				String data = ele.getText();
				System.out.println(data);
				
				if (ele.getText().equals(visibleText)) 
				{
			 		ele.click();
					
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


public boolean clickOnHTMLButton()
{
try{
	WebElement reportsWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(HTMLButton_xpath));
	reportsWebEelement.click();
	Thread.sleep(3000);
	return true;

}
catch(Exception ex){
	
}
return false;	
}
	
	
}

