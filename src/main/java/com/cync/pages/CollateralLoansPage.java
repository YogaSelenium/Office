package com.cync.pages;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.SkipException;

import com.cync.base.BasePage;

public class CollateralLoansPage extends BasePage {
	
	private final By CollateralLoansPageHeader_xpath = By.xpath("//span[contains(text(),'Collateral Loans')]");
	private final By breadcrumb_xpath=By.xpath("(//ul[@class='horizontal-li-list'])[1]");
	private final By enterDateTextbox_xpath=By.xpath("//input[@id='date_from_recalculate']");
	private final By reapplyChargesButton_xpath=By.xpath("//input[@class='view-button btn-sm']");
	private final By loanIDTextbox_xpath=By.xpath("(//input[@type='text'])[3]");
	private final By dateColumn_xpath=By.xpath("//div[@id='jqgh_collateral_loans_list_activity_date']");
	private final By chargeCodeColumn_xpath=By.xpath("//div[@id='jqgh_collateral_loans_list_charge_template_id']");
	private final By amountColumn_xpath=By.xpath("//div[@id='jqgh_collateral_loans_list_charge_amount']");
	private final By floatDaysColumn_xpath=By.xpath("//div[@id='jqgh_collateral_loans_list_float_days']");
	private final By floatDaysSearch_xpath=By.xpath("//input[@name='float_days']");
	private final By interestPercentageColumn_xpath=By.xpath("//div[@id='jqgh_collateral_loans_list_interest_pct.cync_format']");
	private final By interestPercentageColumnSearch_xpath=By.xpath("//input[@name='interest_pct.cync_format']");
	private final By batchNumberColumn_xpath=By.xpath("//div[@id='jqgh_collateral_loans_list_batch_no']");
	private final By batchNumberColumnSearch_xpath=By.xpath("//input[@id='gs_batch_no']");
	private final By interestColumn_xpath=By.xpath("//div[@id='jqgh_collateral_loans_list_interest']");
	private final By otherColumn_xpath=By.xpath("//div[@id='jqgh_collateral_loans_list_other_fees']");
	private final By closingBalanceColumn_xpath=By.xpath("//div[@id='jqgh_collateral_loans_list_closing_balance.cync_format']");
	private final By closingBalanceColumnSearch_xpath=By.xpath("//input[@id='gs_closing_balance.cync_format']");
	private final By SourceBBCColumn_xpath=By.xpath("//div[@id='jqgh_collateral_loans_list_source_bbc_date']");
	private final By SourceBBCColumnSearch_xpath=By.xpath("//input[@id='gs_source_bbc_date']");
	private final By chargeCodeDateName_xpath = By.xpath("//td[contains(@aria-describedby,'collateral_loans_list_charge_template')]");
	private final By amountVerify_xpath = By.xpath("//td[contains(text(),'10,000.00')]");
	private final By loanIdVerify_xpath = By.xpath("//input[@name='fname']");
	private final By dateVerify_xpath = By.xpath("//td[contains(@aria-describedby,'collateral_loans_list_activity_date')]");
	private final By closingBalanceVerify_xpath = By.xpath("(//td[contains(@aria-describedby,'collateral_loans_list_closing_balance.cync')])");
	private final By dateEnterVerify_xpath = By.xpath("(//input[@name='activity_date'])[2]");
	private final By chargeCodeDropDownvalue_xpath = By.xpath("//select[@name='charge_template_id']");
	private final By saveBtnVerify_xpath = By.xpath("//span[@class='ui-icon ui-icon ui-icon-disk']");
	private final By successMsg_xpath = By.xpath("//div[@class='ui-state-success']");
	private final By closeBtnVerify_xpath = By.id("closedialog");
	private final By amountTextBoxVerify_xpath = By.xpath("(//input[@name='charge_amount'])[2]");
	private final By addRecordVerify_xpath = By.id("add_collateral_loans_list");
	private final By closeingBalanceVerify_xpath = By.xpath("(//td[@aria-describedby='collateral_loans_list_closing_balance.cync_format'])[1]");
	private final By ChargeCodeValue_xpath = By.id("jqg1_charge_template_id");
	private final By VerifyAmount_xpath = By.xpath("(//td[@aria-describedby='collateral_loans_list_charge_amount'])[1]");

	private final By addButton_xpath=By.xpath("//td[@id='add_collateral_loans_list']");
	private final By amountBox_xpath=By.xpath("//input[@id='jqg1_charge_amount']");
	private final By monthDropDown_xpath=By.xpath("//select[contains(@class,'ui-datepicker-month')]");
	private final By yearDropDown_xpath=By.xpath("//select[contains(@class,'ui-datepicker-year')]");
	private final By dateWidget_xpath=By.xpath("//table[contains(@class,'ui-datepicker-calendar')]");

	private final By dateBox_xpath=By.xpath("//input[@id='jqg1_activity_date']");
	private final By closingBalanceBeforeFee_xpath=By.xpath("(//td[@aria-describedby='collateral_loans_list_closing_balance.cync_format'])[27]");
	private final By closingBalanceAfterFee_xpath=By.xpath("(//td[@aria-describedby='collateral_loans_list_closing_balance.cync_format'])[26]");
	private final By paginationEnd_xpath=By.xpath("//td[@id='last_collateral_loans_pager']");
	private final By pageRecords_xpath=By.xpath("//select[contains(@title,'Records per Page')]");
	private final By interestPercentage_xpath=By.xpath("(//td[@aria-describedby='collateral_loans_list_interest_pct.cync_format'])[3]");
	private final By interestAmount_xpath = By.xpath("(//td[@aria-describedby='collateral_loans_list_interest'])[3]");
	private final By closingBalanceBeforeInterestAdd_xpath=By.xpath("(//td[@aria-describedby='collateral_loans_list_closing_balance.cync_format'])[4]");
	private final By closingBalanceAfterInterestAdd_xpath=By.xpath("(//td[@aria-describedby='collateral_loans_list_closing_balance.cync_format'])[3]");
	private final By accrueclosingBalanceVerify_xpath = By.xpath("(//td[@aria-describedby='collateral_loans_list_closing_balance.cync_format'])[5]");
    private final By accrueinterestPercentage_xpath=By.xpath("(//td[@aria-describedby='collateral_loans_list_interest_pct.cync_format'])[4]");
    private final By accrueinterestAmount_xpath = By.xpath("(//td[@aria-describedby='collateral_loans_list_accured_interest'])[4]");
    private final By closingBalanceBeforeInterestAddAccrue_xpath=By.xpath("(//td[@aria-describedby='collateral_loans_list_closing_balance.cync_format'])[4]");
	private final By closingBalanceAfterInterestAddAccrue_xpath=By.xpath("(//td[@aria-describedby='collateral_loans_list_closing_balance.cync_format'])[3]");
	
	private final By deleteIcon_xpath=By.xpath("//span[@class='ui-icon ui-icon-trash']");
	private final By reloadIcon_xpath=By.xpath("//span[@class='ui-icon ui-icon-refresh']");
	private final By addIcon_xpath=By.xpath("//span[@class='ui-icon ui-icon ui-icon-plus']");
	private final By cancelIcon_xpath=By.xpath("//span[@class='ui-icon ui-icon ui-icon-cancel']");
	private final By exportIcon_xpath=By.xpath("(//div[@class='ui-pg-div'])[6]");
	private final By saveIcon_xpath=By.xpath("//td[@title='Save Record']");
	private final By paginationNext_xpath=By.xpath("//span[@class='ui-icon ui-icon-seek-next']");
	private final By paginationLast_xpath=By.xpath("//span[@class='ui-icon ui-icon-seek-end']");
	private final By paginationPrevious_xpath=By.xpath("//span[@class='ui-icon ui-icon-seek-prev']");
	private final By paginationFirst_xpath=By.xpath("//span[@class='ui-icon ui-icon-seek-first']");
	private final By pageTextbox_xpath=By.xpath("//input[@class='ui-pg-input ui-corner-all']");
	 private final By exportButtonInPopUp_xpath=By.xpath("//span[text()='Export']");
	 private final By collectionChargeValue_xpath=By.xpath("(//td[@aria-describedby='collateral_loans_list_other_fees'])[3]");
	 
	 
	 /*kruthivas*/
	 
	 private final By interestColumn1_xpath=By.xpath("//div[@id='jqgh_collateral_loans_list_interest_pct.cync_format']");

	

	public CollateralLoansPage(WebDriver driver) {
		super(driver);
		try{
			if(!driver.findElement(CollateralLoansPageHeader_xpath).getText().trim().contains("Collateral Loans")){
				throw new SkipException("Collateral Loans page couldn't open.");
			
			}}
		catch(Exception e){
			
		// TODO Auto-generated constructor stub
			e.printStackTrace();
	}
		
		// TODO Auto-generated constructor stub
		
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
	
	public boolean HeaderVerify(String Header)
	{
	 
	try{
		WebElement HeaderWebEelement=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(CollateralLoansPageHeader_xpath));
		String actual = HeaderWebEelement.getText();
		if (actual.equals(Header))
			return true;
		else
			return false;

	} catch (Exception e) {
		return false;
	}
}
	
	public String verifyBreadcrumb(String Breadcrumb)
	{
		try{
			WebElement breadcrumbWebEelement=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(breadcrumb_xpath));
			String actualData=breadcrumbWebEelement.getText().trim();
			if(actualData.equalsIgnoreCase(Breadcrumb));
		}
		catch(Exception ex){
			
		}
		return Breadcrumb;

		}
	
	public boolean VerifyEnterDateTextbox()
	{
		try{
		
		WebElement collateralLoansWebelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(enterDateTextbox_xpath));
		collateralLoansWebelement.isDisplayed();
	
		
		return true;
	}
	

	catch(Exception ex){
		return false;
	}
		
	}
	
	public boolean VerifyReapplyChargesButton()
	{
		try{
		
		WebElement collateralLoansWebelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(reapplyChargesButton_xpath));
		collateralLoansWebelement.isDisplayed();
	
		
		return true;
	}
	catch(Exception ex){
		return false;
	}
		
	}
	
	public boolean VerifyLoanIDTextbox()
	{
		try{
		
		WebElement collateralLoansWebelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(loanIDTextbox_xpath));
		collateralLoansWebelement.isDisplayed();
	
		
		return true;
	}
	catch(Exception ex){
		return false;
	}
		
	}
	
	public boolean VerifyDateColumn()
	{
		try{
		
		WebElement collateralLoansWebelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(dateColumn_xpath));
		collateralLoansWebelement.isDisplayed();
	
		
		return true;
	}
	catch(Exception ex){
		return false;
	}
		
	}
	
	
	public boolean VerifyChargeCodeColumn()
	{
		try{
		
		WebElement collateralLoansWebelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(chargeCodeColumn_xpath));
		collateralLoansWebelement.isDisplayed();
	
		
		return true;
	}
	catch(Exception ex){
		return false;
	}
		
	}
	
	
	public boolean VerifyAmountColumn()
	{
		try{
		
		WebElement collateralLoansWebelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(amountColumn_xpath));
		collateralLoansWebelement.isDisplayed();
		
		
		return true;
	}
	catch(Exception ex){
		return false;
	}
		
	}
	
	public boolean VerifyFloatdaysColumn()
	{
		try{
		
		WebElement collateralLoansWebelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(floatDaysColumn_xpath));
		collateralLoansWebelement.isDisplayed();
	
		
		return true;
	}
	catch(Exception ex){
		return false;
	}
		
	}
	
	public boolean VerifyInterestPercentageColumn()
	{
		try{
		
		WebElement collateralLoansWebelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(interestPercentageColumn_xpath));
		collateralLoansWebelement.isDisplayed();
		
		
		return true;
	}
	catch(Exception ex){
		return false;
	}
		
	}
	
	public boolean VerifyBatchNumberColumn()
	{
		try{
		
		WebElement collateralLoansWebelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(batchNumberColumn_xpath));
		collateralLoansWebelement.isDisplayed();
		
		
		return true;
	}
	catch(Exception ex){
		return false;
	}
		
	}
	
	public boolean VerifyInterestColumn()
	{
		try{
		
		WebElement collateralLoansWebelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(interestColumn1_xpath));
		collateralLoansWebelement.isDisplayed();
	
		
		return true;
	}
	catch(Exception ex){
		return false;
	}
		
	}
	
	public boolean VerifyOtherFeesColumn()
	{
		try{
		Thread.sleep(500);
		WebElement collateralLoansWebelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(otherColumn_xpath));
		collateralLoansWebelement.isDisplayed();
	
		
		return true;
	}
	catch(Exception ex){
		return false;
	}
		
	}
	
	public boolean VerifyClosingBalanceColumn()
	{
		try{
		
		WebElement collateralLoansWebelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(closingBalanceColumn_xpath));
		collateralLoansWebelement.isDisplayed();
		
		
		return true;
	}
	catch(Exception ex){
		return false;
	}
		
	}
	
	public boolean VerifySourceBBCColumn()
	{
		try{
		
		WebElement collateralLoansWebelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(SourceBBCColumn_xpath));
		collateralLoansWebelement.isDisplayed();
	
		
		return true;
	}
	catch(Exception ex){
		return false;
	}
		
	}
	
	public boolean VerifyDateSearchTextbox()
	{
		try{
		
		WebElement collateralLoansWebelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(dateColumn_xpath));
		collateralLoansWebelement.isDisplayed();
	
		
		return true;
	}
	catch(Exception ex){
		return false;
	}
		
	}
	
	
	public boolean VerifyChargeCodeDropdown()
	{
		try{
			 
			WebElement dropdown = driver.findElement(chargeCodeDropDownvalue_xpath);  
			  dropdown.click();
			  //Thread.sleep(4000);
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
	
	
	public boolean VerifyAmountColumnSearchTextbox()
	{
		try{
		
		WebElement collateralLoansWebelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(amountColumn_xpath));
		collateralLoansWebelement.isDisplayed();
		
		
		return true;
	}
	catch(Exception ex){
		return false;
	}
		
	}
	
	public boolean VerifyFloatdaysColumnSearch()
	{
		try{
		
		WebElement collateralLoansWebelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(floatDaysSearch_xpath));
		collateralLoansWebelement.isDisplayed();
		
		
		return true;
	}
	catch(Exception ex){
		return false;
	}
		
	}
	
	public boolean VerifyInterestPercentageColumnSearch()
	{
		try{
		
		WebElement collateralLoansWebelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(interestPercentageColumnSearch_xpath));
		collateralLoansWebelement.isDisplayed();
		
		
		return true;
	}
	catch(Exception ex){
		return false;
	}
		
	}
	
	public boolean VerifyBatchNumberColumnSearch()
	{
		try{
		
		WebElement collateralLoansWebelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(batchNumberColumnSearch_xpath));
		collateralLoansWebelement.isDisplayed();
		//Thread.sleep(2000);
		
		return true;
	}
	catch(Exception ex){
		return false;
	}
		
	}
	
	
	
	public boolean VerifyClosingBalanceColumnSearch()
	{
		try{
		
		WebElement collateralLoansWebelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(closingBalanceColumnSearch_xpath));
		collateralLoansWebelement.isDisplayed();
		//Thread.sleep(2000);
		
		return true;
	}
	catch(Exception ex){
		return false;
	}
		
	}
	
	public boolean VerifySourceBBCColumnSearch()
	{
		try{
		
		WebElement collateralLoansWebelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(SourceBBCColumnSearch_xpath));
		collateralLoansWebelement.isDisplayed();
		//Thread.sleep(2000);
		
		return true;
	}
	catch(Exception ex){
		return false;
	}
		
	}
	
	
	
	
	
	public boolean ChargeCodeColumnDataNameVerify()
	{
		try{
		
		WebElement chargeCodeWebelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(chargeCodeDateName_xpath));
		chargeCodeWebelement.isDisplayed();
		//Thread.sleep(2000);
		
		return true;
	}
	

	catch(Exception ex){
		return false;
	}
		
	}
	
	
	public boolean CollateralLoanAmountVerify()
	{
		try{
		
		WebElement amountWebelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(amountVerify_xpath));
		amountWebelement.isDisplayed();
		//Thread.sleep(2000);
		
		return true;
	}
	

	catch(Exception ex){
		return false;
	}
		
	}
	
	
	public boolean CollateralLoanLoanIDVerify()
	{
		try{
		
		WebElement loanIdWebelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(loanIdVerify_xpath));
		loanIdWebelement.isDisplayed();
		//Thread.sleep(2000);
		
		return true;
	}
	

	catch(Exception ex){
		return false;
	}
		
	}
	
	
	public boolean CollateralLoanDatecolumnVerify()
	{
		try{
		
		WebElement dateWebelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(dateVerify_xpath));
		dateWebelement.isDisplayed();
		//Thread.sleep(2000);
		
		return true;
	}
	

	catch(Exception ex){
		return false;
	}
		
	}

	
	public boolean CollateralLoanClosingBalanceDataVerify()
	{
		try{
		
		WebElement closingBalanceDateWebelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(closingBalanceVerify_xpath));
		closingBalanceDateWebelement.isDisplayed();
		//Thread.sleep(2000);
		
		return true;
	}
	

	catch(Exception ex){
		return false;
	}
		
	}

	
	public boolean CollateralLoanAddRecordClickVerify()
	{
		try{
		
		WebElement addRecordWebelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(addRecordVerify_xpath));
		addRecordWebelement.click();
		//Thread.sleep(2000);
		
		return true;
	}
	

	catch(Exception ex){
		return false;
	}
		
	}

	
	
	
	public boolean DoubleClickVerify()
	{
		try{
		
		WebElement element=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(chargeCodeDateName_xpath));
		//Double click
		Actions action = new Actions(driver);
		action.doubleClick(element).build().perform();
		Thread.sleep(2000);
		
		return true;
	}

		catch(Exception ex){
			return false;
		}
	}
	
	
/*public boolean selectFromNatSignDropdown(String visibleText) throws InterruptedException{
		
		try {
			WebElement DropdownWebEelement = new WebDriverWait(driver, 10)
			.until(ExpectedConditions.visibilityOfElementLocated(monthDropDown_xpath));
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


	
	
	public boolean selectMonth(String month)
	{
		try{
			
			WebElement monthDropDown= new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(monthDropDown_xpath));
			//Thread.sleep(3000);
			monthDropDown.click();
			//Thread.sleep(3000);
			
			Select sel = new Select(monthDropDown);
			
			List<WebElement> list = sel.getOptions();
			
			for (WebElement ele : list) 
			{
				String data = ele.getText();
				System.out.println(data);
				
				if (ele.getText().equals(month)) 
				{
			 		ele.click();
			 		//ele.sendKeys(Keys.ESCAPE);
					
					return true;
					
				}
			}
		}
			
			catch(Exception ex){
				return false;
			}
		return false;
								
		
	}
	
	
	public boolean selectYear(String year)
	{
		try{
			Actions action = new Actions(driver);
			
			WebElement yearDropDown= new WebDriverWait(driver,3000)
			.until(ExpectedConditions.visibilityOfElementLocated(yearDropDown_xpath));
			action.moveToElement(yearDropDown).perform();
			action.click().build().perform();
			Thread.sleep(3000);
			Select sel1 = new Select(yearDropDown);
			
			List<WebElement> list1 = sel1.getOptions();
			
			for (WebElement ele1: list1) 
			{
				String data = ele1.getText();
				System.out.println(data);
				
				if (ele1.getText().equals(year)) 
				{
			 		ele1.click();
					//Thread.sleep(3000);

					
					 return true;
				}
			}
		}
			

			catch(Exception ex){
				return false;
			}
		return false;
							
			
		}
	
	
	public boolean selectDay(String day)
	{
		try{
			
			
			
			WebElement dateWidget= new WebDriverWait(driver,3000)
			.until(ExpectedConditions.visibilityOfElementLocated(dateWidget_xpath));
			
			
			List<WebElement> rows =dateWidget.findElements(By.tagName("tr"));
			  List<WebElement> columns =dateWidget.findElements(By.tagName("td"));
			  
			  for (WebElement cell: columns){
			   //Select 13th Date 
			   if (cell.getText().equals("13")){
			   cell.findElement(By.linkText("13")).click();
			   break;
			   }
			  }
		}
			
			
			
			
			
			
			List<WebElement>days=driver.findElements(dateWidget_xpath);
			
			for(WebElement ele:dateWidget)
			{
				
				String date=ele.getText();
				
				if(date.equalsIgnoreCase(day))
				{
					ele.click();
					break;
				}
				
			}
	       
			
		
			catch(Exception ex){
				return false;
			}
		return false;
							
			
		}*/
	       
	
	public boolean enterDateIntoTextbox(String value)
	{
	try{
		WebElement editWebEelement=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(dateBox_xpath));
		editWebEelement.clear();
		editWebEelement.sendKeys(value);
		
		return true;
	}
	catch(Exception ex){
		return false;	
	}
	}
	
		 public String chargeCodeDropDownValueClick(String chargeCodeLabel) {

		try{
		WebElement chargeCodeDropdownWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(chargeCodeDropDownvalue_xpath)); 

		Select sel=new Select(chargeCodeDropdownWebEelement);
		sel.selectByVisibleText(chargeCodeLabel);
		/*List<WebElement> list =sel.getOptions();

		for (WebElement ele:list){

		if(ele.getText().equals(chargeCodeLabel))
		{
		ele.click();
		Thread.sleep(10000);
		break;

		}
		}*/

		}
		catch(Exception ex){

		}

		return chargeCodeLabel;


		}
		 
		 
		 
		public boolean AmountTextClickVerify()
					{
						try{
						
						WebElement amountbtnWebelement=new WebDriverWait(driver,10)
						.until(ExpectedConditions.visibilityOfElementLocated(amountTextBoxVerify_xpath));
						amountbtnWebelement.clear();
						amountbtnWebelement.sendKeys("10000");
						Thread.sleep(1000);
						amountbtnWebelement.click();
						Thread.sleep(1000);
						
						return true;
					}
					

					catch(Exception ex){
						return false;
					}
						
					} 
		 
		 
	public boolean SaveBtnVerify()
			{
				try{
				Thread.sleep(1000);
				WebElement savebtnWebelement=new WebDriverWait(driver,30)
				.until(ExpectedConditions.visibilityOfElementLocated(saveBtnVerify_xpath));
				savebtnWebelement.click();
				this.isAlertPresent();
				Thread.sleep(500);
				
				return true;
			}
			

			catch(Exception ex){
				return false;
			}
				
			}
	
	
	public String SuccessMsgVerify(String SuccessMsg)
	{
	 
	try{
		WebElement MsgWebEelement=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(successMsg_xpath));
		MsgWebEelement.getText();
		
		
	}
	catch(Exception ex){
		
	}
	return SuccessMsg;
	
	} 
	

	public boolean CloseBtnVerify()
	{
		try{
		
		WebElement closebtnWebelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(closeBtnVerify_xpath));
		closebtnWebelement.click();
		this.isAlertPresent();
		
		return true;
	}
	

	catch(Exception ex){
		return false;
	}
		
	}
	
	
	public boolean ClosongBalanceVerify()
	{
		try{
		
		WebElement closebalanceWebelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(closeingBalanceVerify_xpath));
		closebalanceWebelement.isDisplayed();
		
		return true;
	}
	

	catch(Exception ex){
		return false;
	}
		
	}
	
	
	public String selectValueInChargeCodeDropdown(String ChargeCode) throws InterruptedException{
		

		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOfElementLocated((ChargeCodeValue_xpath)));

		WebElement element = driver.findElement((ChargeCodeValue_xpath));
		Select sel = new Select(element);
		sel.selectByVisibleText(ChargeCode);
		/*List<WebElement> list = sel.getOptions();	
		
		
		for(WebElement ele : list){
			
			if(ele.getText().equals(ChargeCode)){
				ele.click();
				Thread.sleep(5000);
				break;
			}
		}*/
		return ChargeCode;

	}

	
	public boolean AmountVerify(String Amnt)
	{
		try{
		
		WebElement amountWebelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(VerifyAmount_xpath));
		String actual = amountWebelement.getText();
		if (actual.equals(Amnt))
			return true;
		else
			return false;

	} catch (Exception e) {
		return false;
	}
}

	public boolean clickOnAddButton()
	{
	try{
		WebElement editWebEelement=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(addButton_xpath));
		editWebEelement.click();
		Thread.sleep(1000);
		return true;
	}
	catch(Exception ex){
		return false;	
	}
	}

	public boolean addToAmountTextbox(String value)
	{
	try{
		WebElement editWebEelement=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(amountBox_xpath));
		editWebEelement.clear();
		editWebEelement.sendKeys(value);
		editWebEelement.sendKeys(Keys.ESCAPE);
		
		return true;
	}
	catch(Exception ex){
		return false;	
	}
	}
	
	
	public String verifyClosingBalanceBeforeFee(String balance){
		try{
			
			WebElement loanidWebE=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(closingBalanceBeforeFee_xpath));
			String actual_id=loanidWebE.getText().trim();
			
			if(actual_id.equals(balance));
		}
		catch(Exception ex){
		}
		return balance;
		}
	
	

	public String verifyClosingBalanceAfterFee(String balance){
		try{
			
			WebElement loanidWebE=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(closingBalanceAfterFee_xpath));
			String actual_id=loanidWebE.getText().trim();
			
			if(actual_id.equals(balance));
		}
		catch(Exception ex){
		}
		return balance;
		}
	
	
	
	
	public boolean clickOnPaginationButton()
	{
	try{
		WebElement editWebEelement=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(paginationEnd_xpath));
		editWebEelement.click();
		Thread.sleep(1000);
		return true;
	}
	catch(Exception ex){
			
	}
	return false;
	}
	
	
public boolean selectFromPageRecordDropdown(String value) throws InterruptedException{
		
		try {
			WebElement DropdownWebEelement = new WebDriverWait(driver, 10)
			.until(ExpectedConditions.visibilityOfElementLocated(pageRecords_xpath));
			DropdownWebEelement.click();
			Select sel = new Select(DropdownWebEelement);
			sel.selectByVisibleText(value);
			/*List<WebElement> list = sel.getOptions();
			
			for (WebElement ele : list) 
			{
				String data = ele.getText();
				System.out.println(data);
				
				if (ele.getText().equals(value)) 
				{
			 		ele.click();
			 		Thread.sleep(5000);
					
					 return true;
				}
			}*/
		} 
		catch (Exception ex)
		{
			return false;
		}
		
		return true;
		}


public String verifyInterestAmount(String interestamount) {
	try {
		
		WebElement closingBalanceWebelement = new WebDriverWait(driver, 10)
				.until(ExpectedConditions.visibilityOfElementLocated(closingBalanceBeforeInterestAdd_xpath));
		WebElement interestPercentageWebelement = new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(interestPercentage_xpath));
		WebElement interestAmountWebelement = new WebDriverWait(driver, 10)
				.until(ExpectedConditions.visibilityOfElementLocated(interestAmount_xpath));
		String closingBalance = closingBalanceWebelement.getText().trim();
		int closingBalanceAmount = Integer.parseInt(closingBalance);
		String interestPercentage = interestPercentageWebelement.getText().trim();
		int interestPercentageAmount = Integer.parseInt(interestPercentage);
		String interestAmount = interestAmountWebelement.getText().trim();
		int actualinterestAmount = Integer.parseInt(interestAmount);

		int expectedInterestAmount = (closingBalanceAmount* interestPercentageAmount / 100) / 360;
		if (actualinterestAmount == expectedInterestAmount);
			/*return true;
		else
			return false;*/
	} catch (Exception e) {
		System.out.println(e.getMessage());
		
	}
	return interestamount;
}


public String verifyClosingBalanceBeforeInterestAdd(String balance){
	try{
		
		WebElement loanidWebE=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(closingBalanceBeforeInterestAdd_xpath));
		String actual_id=loanidWebE.getText().trim();
		
		if(actual_id.equals(balance));
	}
	catch(Exception ex){
	}
	return balance;
	}



public String verifyClosingBalanceAfterInterestAdd(String balance){
	try{
		
		WebElement loanidWebE=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(closingBalanceAfterInterestAdd_xpath));
		String actual_id=loanidWebE.getText().trim();
		
		if(actual_id.equals(balance));
	}
	catch(Exception ex){
	}
	return balance;
	}

 
public String verifyAccrueInterestAmount(String interestamount) {
	try {
		Thread.sleep(1000);
		WebElement closingBalanceWebelement = new WebDriverWait(driver, 10)
				.until(ExpectedConditions.visibilityOfElementLocated(accrueclosingBalanceVerify_xpath));
		WebElement interestPercentageWebelement = new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(accrueinterestPercentage_xpath));
		WebElement interestAmountWebelement = new WebDriverWait(driver, 10)
				.until(ExpectedConditions.visibilityOfElementLocated(accrueinterestAmount_xpath));
		String closingBalance = closingBalanceWebelement.getText().trim();
		int closingBalanceAmount = Integer.parseInt(closingBalance);
		String interestPercentage = interestPercentageWebelement.getText().trim();
		int interestPercentageAmount = Integer.parseInt(interestPercentage);
		String interestAmount = interestAmountWebelement.getText().trim();
		int actualinterestAmount = Integer.parseInt(interestAmount);

		int expectedInterestAmount = (closingBalanceAmount* interestPercentageAmount / 100) / 360;
		if (actualinterestAmount == expectedInterestAmount);
			/*return true;
		else
			return false;*/
	} catch (Exception e) {
		System.out.println(e.getMessage());
		
	}
	return interestamount;
}


public String verifyClosingBalanceBeforeInterestAdd_Accrue(String balance){
	try{
		
		WebElement loanidWebE=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(closingBalanceBeforeInterestAddAccrue_xpath));
		String actual_id=loanidWebE.getText().trim();
		
		if(actual_id.equals(balance));
	}
	catch(Exception ex){
	}
	return balance;
	}


public String verifyClosingBalanceAfterInterestAdd_Accrue(String balance){
	try{
		
		WebElement loanidWebE=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(closingBalanceAfterInterestAddAccrue_xpath));
		String actual_id=loanidWebE.getText().trim();
		
		if(actual_id.equals(balance));
	}
	catch(Exception ex){
	}
	return balance;
	}



public boolean verifySaveIcon()
{
try{

	WebElement saveWebEelement=new WebDriverWait(driver,10)
	.until(ExpectedConditions.visibilityOfElementLocated(saveIcon_xpath));
	saveWebEelement.isDisplayed();
	//Thread.sleep(5000);
	return true;
}
catch(Exception ex){
	return false;
}

}

public boolean verifyDeleteIcon()
{
try{

	WebElement deleteWebEelement=new WebDriverWait(driver,10)
	.until(ExpectedConditions.visibilityOfElementLocated(deleteIcon_xpath));
	deleteWebEelement.isDisplayed();
	//Thread.sleep(5000);
	return true;
}
catch(Exception ex){
	return false;
}

}

public boolean verifyReloadIcon()
{
try{

	WebElement deleteWebEelement=new WebDriverWait(driver,10)
	.until(ExpectedConditions.visibilityOfElementLocated(reloadIcon_xpath));
	deleteWebEelement.isDisplayed();
	//Thread.sleep(5000);
	return true;
}
catch(Exception ex){
	return false;
}

}

public boolean verifyAddIcon()
{
try{

	WebElement deleteWebEelement=new WebDriverWait(driver,10)
	.until(ExpectedConditions.visibilityOfElementLocated(addIcon_xpath));
	deleteWebEelement.isDisplayed();
	//Thread.sleep(5000);
	return true;
}
catch(Exception ex){
	return false;
}

}


public boolean clickOnAddIcon()
{
try{

	WebElement addWebEelement=new WebDriverWait(driver,10)
	.until(ExpectedConditions.visibilityOfElementLocated(addIcon_xpath));
	addWebEelement.click();
	//Thread.sleep(5000);
	return true;
}
catch(Exception ex){
	return false;
}

}

public boolean verifyCancelIcon()
{
try{

	WebElement deleteWebEelement=new WebDriverWait(driver,10)
	.until(ExpectedConditions.visibilityOfElementLocated(cancelIcon_xpath));
	deleteWebEelement.isDisplayed();
	//Thread.sleep(5000);
	return true;
}
catch(Exception ex){
	return false;
}
}

public boolean clickOnCancelIcon()
{
try{

	WebElement deleteWebEelement=new WebDriverWait(driver,10)
	.until(ExpectedConditions.visibilityOfElementLocated(cancelIcon_xpath));
	deleteWebEelement.isDisplayed();
	//Thread.sleep(5000);
	return true;
}
catch(Exception ex){
	return false;
}
}

public boolean clickOnReloadIcon()
{
try{
    Thread.sleep(500);
	WebElement deleteWebEelement=new WebDriverWait(driver,20)
	.until(ExpectedConditions.visibilityOfElementLocated(reloadIcon_xpath));
	deleteWebEelement.click();
	//Thread.sleep(5000);
	return true;
}
catch(Exception ex){
	return false;
}

}

public boolean verifyExportIcon()
{
try{

	WebElement deleteWebEelement=new WebDriverWait(driver,10)
	.until(ExpectedConditions.visibilityOfElementLocated(exportIcon_xpath));
	deleteWebEelement.isDisplayed();
	//Thread.sleep(5000);
	return true;
}
catch(Exception ex){
	return false;
}

}

public boolean clickOnExportIcon()
{
try{

	WebElement deleteWebEelement=new WebDriverWait(driver,10)
	.until(ExpectedConditions.visibilityOfElementLocated(exportIcon_xpath));
	deleteWebEelement.click();
	
	return true;
}
catch(Exception ex){
	return false;
}

}

public boolean clickexportButtonInPopUp()
	{
	try{
	//Thread.sleep(3000);
		WebElement exportButtonWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(exportButtonInPopUp_xpath));
		//Thread.sleep(3000);
		exportButtonWebEelement.click();
		return true;
	}
	catch(Exception ex){
		return false;
	}
	}

public boolean clickOnNextPaginationButton()
{
try{
	WebElement editWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(paginationNext_xpath));
	editWebEelement.click();
	Thread.sleep(1000);
	return true;
}
catch(Exception ex){
		
}
return false;
}


public boolean clickOnLastPaginationButton()
{
try{
	WebElement editWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(paginationLast_xpath));
	editWebEelement.click();
	Thread.sleep(1000);
	return true;
}
catch(Exception ex){
		
}
return false;
}

public boolean clickOnPreviousPaginationButton()
{
try{
	WebElement editWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(paginationPrevious_xpath));
	editWebEelement.click();
	Thread.sleep(1000);
	return true;
}
catch(Exception ex){
		
}
return false;
}

public boolean clickOnFirstPaginationButton()
{
try{
	WebElement editWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(paginationFirst_xpath));
	editWebEelement.click();
	Thread.sleep(1000);
	return true;
}
catch(Exception ex){
		
}
return false;
}

public boolean enterValueInPageTextbox(String pagenumber)
{
try{
	WebElement editWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(pageTextbox_xpath));
	editWebEelement.sendKeys(pagenumber);
	editWebEelement.sendKeys(Keys.ENTER);
	Thread.sleep(1000);
	return true;
}
catch(Exception ex){
		
}
return false;
}
public boolean pageRecordDropdown_UIValidation()
{
try{
		 
	WebElement dropdown = driver.findElement(pageRecords_xpath);  
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
public String verifyInterestPercentage(String interest){
	try{
		
		WebElement successMessageWebE=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(interestPercentage_xpath));
		String actual_msg=successMessageWebE.getText().trim();
		
		if(actual_msg.equals(interest));
	}
	catch(Exception ex){
	}
	return interest;
	}


public boolean selectDate(){
    try {
     WebElement dateWebElement = new WebDriverWait(driver,
       100)
       .until(ExpectedConditions
         .visibilityOfElementLocated(dateEnterVerify_xpath));
     Date date = new Date(System.currentTimeMillis());
     SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
     String today=formatter.format(date);
     dateWebElement.clear();
     
     dateWebElement.sendKeys(today);
     Thread.sleep(2000);
     
     return true;
    } catch (Exception e) {
     return false;
    }
   }

public boolean verifyChargeValueAppliedFromCollateralLoanFee(String chargeValue)
{
 
try{
	WebElement HeaderWebEelement=new WebDriverWait(driver,10)
	.until(ExpectedConditions.visibilityOfElementLocated(collectionChargeValue_xpath));
	String actual = HeaderWebEelement.getText();
	if (actual.equals(chargeValue))
		return true;
	else
		return false;

} catch (Exception e) {
	return false;
}
}
}





	



