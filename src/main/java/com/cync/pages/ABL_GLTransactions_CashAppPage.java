package com.cync.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.cync.base.BasePage;

public class ABL_GLTransactions_CashAppPage extends BasePage {
	
	private final By ABL_GLTransactionsPageHeader_xpath = By.xpath("//span[contains(text(),'ABL GL Transactions')]");
	private final By clientNameValue_xpath = By.id("gs_borrower_id");
	private final By ClickOnTransactionDate_xpath = By.id("jqgh_gl_transactions_list_post_date");
	private final By GLAmountCredit_xpath = By.xpath("(//td[@aria-describedby='gl_transactions_list_gl_amount_credit'])[2]");
	private final By GLAmountDebit_xpath = By.xpath("(//td[@aria-describedby='gl_transactions_list_gl_amount_debit'])[1]");
	private final By GLAccountNameDebit_xpath = By.xpath("(//td[@aria-describedby='gl_transactions_list_gl_account_name'])[1]");
	private final By GLAccountNameCredit_xpath = By.xpath("(//td[@aria-describedby='gl_transactions_list_gl_account_name'])[2]");

	
	
	

	public ABL_GLTransactions_CashAppPage(WebDriver driver) {
		super(driver);
		try{
			/*if(!driver.findElement(ABL_GLTransactionsPageHeader_xpath).getText().trim().contains("ABL GL Transactions")){
				throw new SkipException("ABL_GLTransactions page couldn't open.");
			
			} */
			}
		catch(Exception e){
			
		// TODO Auto-generated constructor stub
			e.printStackTrace();
	}
		
		// TODO Auto-generated constructor stub

}

	
	public String PageHeaderVerify(String Header)
	{
	try{
		WebElement HeaderWebEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(ABL_GLTransactionsPageHeader_xpath));
		HeaderWebEelement.getText();
		Thread.sleep(2000);
		
	}
	catch(Exception ex){
		
	}
	return Header;
	
	}  

	
	public boolean selectClientNameDropdown(String Clientname) throws InterruptedException{
		
		try {
			WebElement clientDropdownWebEelement = new WebDriverWait(
					driver, 10).until(ExpectedConditions
					.visibilityOfElementLocated(clientNameValue_xpath));
			Select sel = new Select(clientDropdownWebEelement);
			List<WebElement> list = sel.getOptions();
			for (WebElement ele : list) {
				if (ele.getText().equals(Clientname)) {
			 		ele.click();
					Thread.sleep(5000);
					 return true;
				}
			}
		} catch (Exception ex) {
		}
		return false;
	}
	
	 public boolean ClickOnTransactionDate_AblGL()
	 {
	 try{

	 	WebElement TransactionDateWebEelement=new WebDriverWait(driver,100)
	 	.until(ExpectedConditions.visibilityOfElementLocated(ClickOnTransactionDate_xpath));
	 	TransactionDateWebEelement.click();
	 	Thread.sleep(5000);

	 return true;
	 }
	 catch(Exception ex){
	 	return false;
	 }

	 }	

	 
	 public boolean GLAmountCredit_AblGL()
	 {
	 try{

	 	WebElement TransactionDateWebEelement=new WebDriverWait(driver,100)
	 	.until(ExpectedConditions.visibilityOfElementLocated(GLAmountCredit_xpath));
	 	TransactionDateWebEelement.isDisplayed();
	 	Thread.sleep(2000);

	 return true;
	 }
	 catch(Exception ex){
	 	return false;
	 }

	 }	
	 
	 public boolean GLAmountDebit_AblGL()
	 {
	 try{

	 	WebElement TransactionDateWebEelement=new WebDriverWait(driver,100)
	 	.until(ExpectedConditions.visibilityOfElementLocated(GLAmountDebit_xpath));
	 	TransactionDateWebEelement.isDisplayed();
	 	Thread.sleep(2000);

	 return true;
	 }
	 catch(Exception ex){
	 	return false;
	 }

	 }	
	
	 public boolean GLAccountNameDebit_AblGL()
	 {
	 try{

	 	WebElement TransactionDateWebEelement=new WebDriverWait(driver,100)
	 	.until(ExpectedConditions.visibilityOfElementLocated(GLAccountNameDebit_xpath));
	 	TransactionDateWebEelement.isDisplayed();
	 	Thread.sleep(2000);

	 return true;
	 }
	 catch(Exception ex){
	 	return false;
	 }

	 }	
	 
	 public boolean GLAccountNameCredit_AblGL()
	 {
	 try{

	 	WebElement TransactionDateWebEelement=new WebDriverWait(driver,100)
	 	.until(ExpectedConditions.visibilityOfElementLocated(GLAccountNameCredit_xpath));
	 	TransactionDateWebEelement.isDisplayed();
	 	Thread.sleep(2000);

	 return true;
	 }
	 catch(Exception ex){
	 	return false;
	 }

	 }	
}
