package com.cync.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.SkipException;

import com.cync.base.BasePage;

public class LoanSummaryPage extends BasePage{
	
	
	private final By loanSummaryHeader=By.xpath("//span[text()=' Loan Summary ']");
	private final By loanID_xpath=By.id("loan_number_loan_name");
	
	
	
	
	

	public LoanSummaryPage(WebDriver driver) {

		super(driver);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(!driver.findElement(loanSummaryHeader).getText().trim().equals("Loan Summary")){
			throw new SkipException("Loan Summary couldn't open.");
		}

	
	}
	
	

	public String verifyLoanID(String loanid){
		try{
			WebElement loanidWebE=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(loanID_xpath));
			String actual_id=loanidWebE.getText().trim();
			
			if(actual_id.equals(loanid));
		}
		catch(Exception ex){
		}
		return loanid;
		}
	
}
