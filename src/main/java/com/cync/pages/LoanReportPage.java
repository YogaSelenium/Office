package com.cync.pages;



	import java.util.List;

	import org.openqa.selenium.By;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.Select;
	import org.openqa.selenium.support.ui.WebDriverWait;
	import org.testng.SkipException;

	import com.cync.base.BasePage;


	public class LoanReportPage extends BasePage {
		
		private final By reportPopUpHeader_xpath=By.xpath("//span[text()='Loan Report']");
		private final By startDateField_xpath=By.xpath("//label[text()='Start Date']");
		private final By styleField_xpath=By.xpath("//select[@id='style']");
		private final By endDateField_xpath=By.xpath("//label[text()='End Date']");
		private final By startDateFieldSearch_xpath=By.xpath("//input[@placeholder='Enter Start Date']");
		private final By endDateFieldSearch_xpath=By.xpath("//input[@placeholder='Enter End Date']");
		private final By crossIcon_xpath=By.xpath("//button[@class='ui-dialog-titlebar-close']");
		private final By XLSButton_xpath=By.xpath("//button[text()='XLS']");
		private final By HTMLButton_xpath=By.xpath("//button[text()='HTML']");
		private final By PDFButton_xpath=By.xpath("//button[text()='PDF']");
		


		public LoanReportPage(WebDriver driver) {
			super(driver);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(!driver.findElement(reportPopUpHeader_xpath).getText().trim().equals("Unused Loan")){
				throw new SkipException("Unused Loan Report couldn't open.");
			// TODO Auto-generated constructor stub
			}
		}
		
		
		
		public boolean verifyStartDateField_UIValidation()
		{
		try{
			Thread.sleep(5000);
			WebElement reportsWebEelement=new WebDriverWait(driver,10)
				.until(ExpectedConditions.visibilityOfElementLocated(startDateField_xpath));
			reportsWebEelement.isDisplayed();
			return true;
		}
		catch(Exception ex){
			
		}
		return false;	
		}
		
		public boolean verifyEndDateField_UIValidation()
		{
		try{
			WebElement reportsWebEelement=new WebDriverWait(driver,10)
				.until(ExpectedConditions.visibilityOfElementLocated(endDateField_xpath));
			reportsWebEelement.isDisplayed();
			return true;

		}
		catch(Exception ex){
			
		}
		return false;	
		}
		
		
		
		
		
			public boolean verifyStartDateFieldSearch_UIValidation()
		 {
		try{
			WebElement reportsWebEelement=new WebDriverWait(driver,10)
				.until(ExpectedConditions.visibilityOfElementLocated(startDateFieldSearch_xpath));
			reportsWebEelement.isDisplayed();
			return true;

		}
		catch(Exception ex){
			
		}
		return false;	
		}
		
		public boolean verifyEndDateFieldSearch_UIValidation()
		{
		try{
			WebElement reportsWebEelement=new WebDriverWait(driver,10)
				.until(ExpectedConditions.visibilityOfElementLocated(endDateFieldSearch_xpath));
			reportsWebEelement.isDisplayed();
			return true;

		}
		catch(Exception ex){
			
		}
		return false;	
		}
		
		
		
		public boolean verifyCrossIcon_UIValidation()
		{
		try{
			WebElement reportsWebEelement=new WebDriverWait(driver,10)
				.until(ExpectedConditions.visibilityOfElementLocated(crossIcon_xpath));
			reportsWebEelement.isDisplayed();
			return true;

		}
		catch(Exception ex){
			
		}
		return false;	
		}
		
		public boolean verifyXLSButton_UIValidation()
		{
		try{
			WebElement reportsWebEelement=new WebDriverWait(driver,10)
				.until(ExpectedConditions.visibilityOfElementLocated(XLSButton_xpath));
			reportsWebEelement.isDisplayed();
			return true;

		}
		catch(Exception ex){
			
		}
		return false;	
		}
		
		public boolean verifyHTMLButton_UIValidation()
		{
		try{
			WebElement reportsWebEelement=new WebDriverWait(driver,10)
				.until(ExpectedConditions.visibilityOfElementLocated(HTMLButton_xpath));
			reportsWebEelement.isDisplayed();
			return true;

		}
		catch(Exception ex){
			
		}
		return false;	
		}
		
		public boolean verifyPDFButton_UIValidation()
		{
		try{
			WebElement reportsWebEelement=new WebDriverWait(driver,10)
				.until(ExpectedConditions.visibilityOfElementLocated(PDFButton_xpath));
			reportsWebEelement.isDisplayed();
			return true;

		}
		catch(Exception ex){
			
		}
		return false;	
		}
		
		public boolean clickPDFButton()
		{
		try{
			WebElement reportsWebEelement=new WebDriverWait(driver,10)
				.until(ExpectedConditions.visibilityOfElementLocated(PDFButton_xpath));
			reportsWebEelement.click();
			return true;

		}
		catch(Exception ex){
			
		}
		return false;	
		}
		
		public boolean VerifyStyleDropdown()
		{
			try{
				 
				WebElement dropdown = driver.findElement(styleField_xpath);  
				  dropdown.click();
				  Thread.sleep(4000);
				  Select select = new Select(dropdown);  

				   List<WebElement> options = select.getOptions(); 
				   int iSize = options.size();
				   for(int i =0; i<iSize ; i++){
						String sValue = options.get(i).getText();
						System.out.println(sValue);
						}
				   
			return true;
			}
			catch(Exception ex){
				return false;
			}
			}
		
	public boolean selectFromStyleDropdown(String visibleText) throws InterruptedException{
			
			try {
				WebElement DropdownWebEelement = new WebDriverWait(driver, 10)
				.until(ExpectedConditions.visibilityOfElementLocated(styleField_xpath));
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
		
		public boolean SelectStartDate(String date)
		{
			try{
			
			WebElement IntestPaymentWebelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(startDateFieldSearch_xpath));
			IntestPaymentWebelement.clear();
			IntestPaymentWebelement.sendKeys(date);
			IntestPaymentWebelement.sendKeys(Keys.ESCAPE);
			Thread.sleep(2000);
			
			return true;
		    }
			catch (Exception e) {
				return false;
			}
		}
		
		
			
		
		
		public boolean SelectEndDate(String date)
		{
			try{
			
			WebElement IntestPaymentWebelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(endDateFieldSearch_xpath));
			IntestPaymentWebelement.clear();
			IntestPaymentWebelement.sendKeys(date);
			IntestPaymentWebelement.sendKeys(Keys.ESCAPE);
			Thread.sleep(2000);
			
			return true;
		    }
			catch (Exception e) {
				return false;
			}
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

	




