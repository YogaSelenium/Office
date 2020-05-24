package com.cync.pages;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.SkipException;

import com.cync.base.BasePage;

public class DailyTransactionReportingPage extends  BasePage {
private final By dailytransactionreporting_xpath=By.xpath("//span[text()='Daily Transaction Reporting']");

	
	private final By Loanactivitybreadcrumb_xpath=By.xpath("//div[@class='pull-left pleftnext']");
    private final By VerifyTransactionTypeDropdown_xpath=By.xpath("//select[@id='transaction_type']");
	private final By VerifyDefaultValueOfFromDate_xpath=By.xpath("//input[@id='from_date']");
	private final By VerifyDefaultValueOfToDate_xpath=By.xpath("//input[@id='to_date']");
	private final By TransactiotypDropDownClick_xpath=By.xpath("//select[@id='transaction_type']");
	private final By Clientverify_xpath=By.xpath("//select[@id='client_id']");
    private final By VerifyGenerate_xpath=By.xpath("//button[@id='generate_report']");
    private final By VerifyInterest_xpath=By.xpath("//label[.='Interest']");
    private final By VerifyFeescharge_xpath=By.xpath("//label[contains(text(),'Fees / Charges')]");
   //private final By VerifyFeescharge_xpath=By.xpath("//label[contains(text(),'Fees / Charges')]");

    private final By VerifyExport_xpath=By.xpath("//td[@title='Export Data']");
    private final By VerifyExportIcon_xpath=By.xpath("//div[@class='export']");
    private final By exportCloseBTN_xpath = By.xpath("//button[@class='ui-dialog-titlebar-close']");
    private final By Reload_xpath=By.xpath("//td[@title='Reload Grid']");
    private final By Collection_xpath=By.xpath("//label[contains(text(),'Collection')]");
    private final By Advance_xpath=By.xpath("//label[contains(text(),'Advance')]");
    private final By Adjustment_xpath=By.xpath("//label[contains(text(),'Adjustment')]");
    private final By ClientColumn_xpath=By.xpath("//div[@id='jqgh_transaction_list8_client_name']");
    private final By Datecolumn_xpath=By.xpath("//div[@id='jqgh_transaction_list8_activity_date']");
    private final By Chargetype_xpath=By.xpath("//div[@id='jqgh_transaction_list8_name']");
    private final By Interest_xpath=By.xpath("//div[@id='jqgh_transaction_list8_charge_amount']");
    private final By AccuredInterest_xpath=By.xpath("//div[@id='jqgh_transaction_list8_accrued']");
    private final By ClientColumnofFees_xpath=By.xpath("//div[text()='Client']");
    private final By DatecolumnofFees_xpath=By.xpath("//div[text()='Date']");
    private final By ChargetypeofFees_xpath=By.xpath("//div[text()='Charge Type']");
    private final By Feescharge_xpath=By.xpath("//div[text()='Fees / Charges']");
    private final By AccuredFees_xpath=By.xpath("//div[text()='Accrued Fees / Charges']");
    private final By ClientColumnofAdjust_xpath=By.xpath("//div[@id='jqgh_transaction_list7_client_name']");
    private final By DatecolumnofAdjust_xpath=By.xpath("//div[@id='jqgh_transaction_list7_activity_date']");
    private final By ChargetypeofAdjust_xpath=By.xpath("//div[@id='jqgh_transaction_list7_name']");
    private final By Amount_xpath=By.xpath("//div[@id='jqgh_transaction_list7_charge_amount']");
    private final By ClientColumnofAdvance_xpath=By.xpath("//div[@id='jqgh_transaction_list4_client_name']");
    private final By DatecolumnofAdvance_xpath=By.xpath("//div[@id='jqgh_transaction_list4_activity_date']");
    private final By ChargetypeofAdvance_xpath=By.xpath("//div[@id='jqgh_transaction_list4_name']");
    private final By Amount_xpathadv=By.xpath("//div[@id='jqgh_transaction_list4_charge_amount']");
    private final By ClientColumnofColl_xpath=By.xpath("//div[@id='jqgh_transaction_list6_client_name']");
    private final By DatecolumnofColl_xpath=By.xpath("//div[@id='jqgh_transaction_list6_activity_date']");
    private final By ChargetypeofColl_xpath=By.xpath("//div[@id='jqgh_transaction_list6_name']");
    private final By Amount_xpathColl=By.xpath("//div[@id='jqgh_transaction_list6_charge_amount']");
   // private final By InterestDetails_xpath=By.xpath("(//tr[@id='8926255'])[1]//td[5]");
    private final By InterestDetails_xpath=By.xpath("(//tr[@id='8926255' or @id='677687'])[1]//td[5]");
    private final By FeesDetails_xpath=By.xpath("//tr[@id='8926254'][1]//td[5]");
    private final By Colldetails_xpath=By.xpath("(//td[text()='34,550.00'])[2]");
    private final By AdvDetails_xpath=By.xpath("//tr[@class='footrow footrow-ltr ui-widget-content']//td[5]");
    private final By AdjDetails_xpath=By.xpath("//tr[@class='footrow footrow-ltr ui-widget-content'] //td[5]");
    
	public DailyTransactionReportingPage(WebDriver driver) {
		super(driver);
		try{
			if(!driver.findElement( dailytransactionreporting_xpath).getText().trim().contains("Daily Transaction Reporting")){
				throw new SkipException("Dailytransactionreport  page couldn't open.");
			
			}}
		catch(Exception e){
			
		// TODO Auto-generated constructor stub
			e.printStackTrace();
		// TODO Auto-generated constructor stub
	}
	}
	
	
	 public String HeaderVerify(String dailytranscationHeader)
		{
		try{
			WebElement HeaderWebEelement=new WebDriverWait(driver,10)
				.until(ExpectedConditions.visibilityOfElementLocated(dailytransactionreporting_xpath));
			HeaderWebEelement.getText();
			//Thread.sleep(1000);
			
		}
		catch(Exception ex){
			
		}
		return dailytranscationHeader;
		}
	 
	 
	 
	 public Boolean VerifyClientColumnofFee()
		{
		try{
			WebElement HeaderWebEelement=new WebDriverWait(driver,10)
				.until(ExpectedConditions.visibilityOfElementLocated(ClientColumnofFees_xpath));
			HeaderWebEelement.isDisplayed();
			//Thread.sleep(1000);
			return true;
		}
		catch(Exception ex){
			
		
		return false;
		}
	 
		}
	 public Boolean VerifyAdvanceAmount()
		{
		try{
			WebElement HeaderWebEelement=new WebDriverWait(driver,10)
				.until(ExpectedConditions.visibilityOfElementLocated(AdvDetails_xpath));
			HeaderWebEelement.isDisplayed();
			//Thread.sleep(1000);
			return true;
		}
		catch(Exception ex){
			
		
		return false;
		}
	 
		}
	 
	 public Boolean VerifyAdjuAmount()
		{
		try{
			WebElement HeaderWebEelement=new WebDriverWait(driver,10)
				.until(ExpectedConditions.visibilityOfElementLocated(AdjDetails_xpath));
			HeaderWebEelement.isDisplayed();
			//Thread.sleep(1000);
			return true;
		}
		catch(Exception ex){
			
		
		return false;
		}
	 
		}
	 public Boolean VerifyinterestAmount()
		{
		try{
			WebElement HeaderWebEelement=new WebDriverWait(driver,100)
				.until(ExpectedConditions.visibilityOfElementLocated(InterestDetails_xpath));
			HeaderWebEelement.isDisplayed();
			Thread.sleep(500);
			return true;
		}
		catch(Exception ex){
			
		
		return false;
		}
	 
		}
	 public Boolean VerifyFeesAmount()
		{
		try{
			WebElement HeaderWebEelement=new WebDriverWait(driver,10)
				.until(ExpectedConditions.visibilityOfElementLocated(FeesDetails_xpath));
			HeaderWebEelement.isDisplayed();
			//Thread.sleep(1000);
			return true;
		}
		catch(Exception ex){
			
		
		return false;
		}
	 
		}
	 
	 public Boolean VerifycollAmount()
		{
		try{
			WebElement HeaderWebEelement=new WebDriverWait(driver,10)
				.until(ExpectedConditions.visibilityOfElementLocated( Colldetails_xpath));
			HeaderWebEelement.isDisplayed();
			//Thread.sleep(1000);
			return true;
		}
		catch(Exception ex){
			
		
		return false;
		}
	 
		}
	 public Boolean VerifyChargetypeColumnofFee()
		{
		try{
			WebElement HeaderWebEelement=new WebDriverWait(driver,10)
				.until(ExpectedConditions.visibilityOfElementLocated(ChargetypeofFees_xpath));
			HeaderWebEelement.isDisplayed();
			//Thread.sleep(1000);
			return true;
		}
		catch(Exception ex){
			
		
		return false;
		}
	 
		}
	 public Boolean VerifyDateColumnofFee()
		{
		try{
			WebElement HeaderWebEelement=new WebDriverWait(driver,10)
				.until(ExpectedConditions.visibilityOfElementLocated(DatecolumnofFees_xpath));
			HeaderWebEelement.isDisplayed();
			//Thread.sleep(1000);
			return true;
		}
		catch(Exception ex){
			
		
		return false;
		}
	 
		}
	 public Boolean VerifyFeeschargeColumnofFee()
		{
		try{
			WebElement HeaderWebEelement=new WebDriverWait(driver,10)
				.until(ExpectedConditions.visibilityOfElementLocated( Feescharge_xpath));
			HeaderWebEelement.isDisplayed();
			//Thread.sleep(1000);
			return true;
		}
		catch(Exception ex){
			
		
		return false;
		}
	 
		}
	 public Boolean VerifyClientColumnofAdj()
		{
		try{
			WebElement HeaderWebEelement=new WebDriverWait(driver,10)
				.until(ExpectedConditions.visibilityOfElementLocated(ClientColumnofAdjust_xpath));
			HeaderWebEelement.isDisplayed();
			//Thread.sleep(1000);
			return true;
		}
		catch(Exception ex){
			
		
		return false;
		}
	 
		}
	 public Boolean VerifyChargetypeColumnofAdj()
		{
		try{
			WebElement HeaderWebEelement=new WebDriverWait(driver,10)
				.until(ExpectedConditions.visibilityOfElementLocated( ChargetypeofAdjust_xpath));
			HeaderWebEelement.isDisplayed();
			//Thread.sleep(1000);
			return true;
		}
		catch(Exception ex){
			
		
		return false;
		}
	 
		}
	 public Boolean VerifyDateColumnofAdj()
		{
		try{
			WebElement HeaderWebEelement=new WebDriverWait(driver,10)
				.until(ExpectedConditions.visibilityOfElementLocated( DatecolumnofAdjust_xpath));
			HeaderWebEelement.isDisplayed();
			//Thread.sleep(1000);
			return true;
		}
		catch(Exception ex){
			
		
		return false;
		}
	 
		}
	 public Boolean VerifyAmountColumnofAdj()
		{
		try{
			WebElement HeaderWebEelement=new WebDriverWait(driver,10)
				.until(ExpectedConditions.visibilityOfElementLocated(Amount_xpath));
			HeaderWebEelement.isDisplayed();
			//Thread.sleep(1000);
			return true;
		}
		catch(Exception ex){
			
		
		return false;
		}
	 
		}
	 
	 public Boolean VerifyClientColumnofColl()
		{
		try{
			WebElement HeaderWebEelement=new WebDriverWait(driver,10)
				.until(ExpectedConditions.visibilityOfElementLocated(ClientColumnofColl_xpath));
			HeaderWebEelement.isDisplayed();
			//Thread.sleep(1000);
			return true;
		}
		catch(Exception ex){
			
		
		return false;
		}
	 
		}
	 public Boolean VerifyChargetypeColumnofColl()
		{
		try{
			WebElement HeaderWebEelement=new WebDriverWait(driver,10)
				.until(ExpectedConditions.visibilityOfElementLocated(  ChargetypeofColl_xpath));
			HeaderWebEelement.isDisplayed();
			//Thread.sleep(1000);
			return true;
		}
		catch(Exception ex){
			
		
		return false;
		}
	 
		}
	 public Boolean VerifyDateColumnofColl()
		{
		try{
			WebElement HeaderWebEelement=new WebDriverWait(driver,10)
				.until(ExpectedConditions.visibilityOfElementLocated( DatecolumnofColl_xpath));
			HeaderWebEelement.isDisplayed();
			//Thread.sleep(1000);
			return true;
		}
		catch(Exception ex){
			
		
		return false;
		}
	 
		}
	 public Boolean VerifyAmountColumnofColl()
		{
		try{
			WebElement HeaderWebEelement=new WebDriverWait(driver,10)
				.until(ExpectedConditions.visibilityOfElementLocated( Amount_xpathColl));
			HeaderWebEelement.isDisplayed();
			//Thread.sleep(1000);
			return true;
		}
		catch(Exception ex){
			
		
		return false;
		}
	 
		}
	 public Boolean VerifyClientColumnofAdvance()
		{
		try{
			WebElement HeaderWebEelement=new WebDriverWait(driver,10)
				.until(ExpectedConditions.visibilityOfElementLocated(ClientColumnofAdvance_xpath));
			HeaderWebEelement.isDisplayed();
			//Thread.sleep(1000);
			return true;
		}
		catch(Exception ex){
			
		
		return false;
		}
	 
		}
	 public Boolean VerifyChargetypeColumnofAdvance()
		{
		try{
			WebElement HeaderWebEelement=new WebDriverWait(driver,10)
				.until(ExpectedConditions.visibilityOfElementLocated( ChargetypeofAdvance_xpath));
			HeaderWebEelement.isDisplayed();
			//Thread.sleep(1000);
			return true;
		}
		catch(Exception ex){
			
		
		return false;
		}
	 
		}
	 public Boolean VerifyDateColumnofAdvance()
		{
		try{
			WebElement HeaderWebEelement=new WebDriverWait(driver,10)
				.until(ExpectedConditions.visibilityOfElementLocated( DatecolumnofAdvance_xpath));
			HeaderWebEelement.isDisplayed();
			//Thread.sleep(1000);
			return true;
		}
		catch(Exception ex){
			
		
		return false;
		}
	 
		}
	 public Boolean VerifyAmountColumnofAdvane()
		{
		try{
			WebElement HeaderWebEelement=new WebDriverWait(driver,10)
				.until(ExpectedConditions.visibilityOfElementLocated(Amount_xpathadv));
			HeaderWebEelement.isDisplayed();
			//Thread.sleep(1000);
			return true;
		}
		catch(Exception ex){
			
		
		return false;
		}
	 
		}
	 public Boolean VerifyAccuredFeeschargetColumnofFee()
		{
		try{
			WebElement HeaderWebEelement=new WebDriverWait(driver,10)
				.until(ExpectedConditions.visibilityOfElementLocated(AccuredFees_xpath));
			HeaderWebEelement.isDisplayed();
			//Thread.sleep(1000);
			return true;
		}
		catch(Exception ex){
			
		
		return false;
		}
	 
		}
	 public Boolean VerifyClientColumnofInterest()
		{
		try{
			WebElement HeaderWebEelement=new WebDriverWait(driver,10)
				.until(ExpectedConditions.visibilityOfElementLocated(ClientColumn_xpath));
			HeaderWebEelement.isDisplayed();
			//Thread.sleep(1000);
			return true;
		}
		catch(Exception ex){
			
		
		return false;
		}
	 
		}
	 public Boolean VerifyChargetypeColumnofInterest()
		{
		try{
			WebElement HeaderWebEelement=new WebDriverWait(driver,10)
				.until(ExpectedConditions.visibilityOfElementLocated(Chargetype_xpath));
			HeaderWebEelement.isDisplayed();
			//Thread.sleep(1000);
			return true;
		}
		catch(Exception ex){
			
		
		return false;
		}
	 
		}
	 public Boolean VerifyDateColumnofInterest()
		{
		try{
			WebElement HeaderWebEelement=new WebDriverWait(driver,10)
				.until(ExpectedConditions.visibilityOfElementLocated(Datecolumn_xpath));
			HeaderWebEelement.isDisplayed();
			//Thread.sleep(1000);
			return true;
		}
		catch(Exception ex){
			
		
		return false;
		}
	 
		}
	 public Boolean VerifyInterestColumnofInterest()
		{
		try{
			WebElement HeaderWebEelement=new WebDriverWait(driver,10)
				.until(ExpectedConditions.visibilityOfElementLocated( Interest_xpath));
			HeaderWebEelement.isDisplayed();
			//Thread.sleep(1000);
			return true;
		}
		catch(Exception ex){
			
		
		return false;
		}
	 
		}
	 public Boolean VerifyAccuredInterestColumnofInterest()
		{
		try{
			WebElement HeaderWebEelement=new WebDriverWait(driver,10)
				.until(ExpectedConditions.visibilityOfElementLocated(AccuredInterest_xpath));
			HeaderWebEelement.isDisplayed();
			//Thread.sleep(1000);
			return true;
		}
		catch(Exception ex){
			
		
		return false;
		}
	 
		}
	 public Boolean VerifyGenearate()
		{
		try{
			WebElement HeaderWebEelement=new WebDriverWait(driver,10)
				.until(ExpectedConditions.visibilityOfElementLocated(VerifyGenerate_xpath));
			HeaderWebEelement.isDisplayed();
			//Thread.sleep(1000);
			return true;
		}
		catch(Exception ex){
			
		
		return false;
		}
	 
		}
	 
	 public String breadcrumVerify(String Header)
		{
		try{
			WebElement HeaderWebEelement=new WebDriverWait(driver,10)
				.until(ExpectedConditions.visibilityOfElementLocated(Loanactivitybreadcrumb_xpath));
			HeaderWebEelement.getText();
			//Thread.sleep(1000);
			
		}
		catch(Exception ex){
			
		}
		return Header;
		}
	
	 
	 
	 
	 public boolean ClientVerify()
		{
		try{
			WebElement HeaderWebEelement=new WebDriverWait(driver,10)
				.until(ExpectedConditions.visibilityOfElementLocated( Clientverify_xpath));
			HeaderWebEelement.isDisplayed();
			//Thread.sleep(1000);
			return true;
		}
		catch(Exception ex){
			
		return false;
		}
		
		}
	 
	 
	 public boolean TransactiontypeVerify()
		{
		try{
			WebElement HeaderWebEelement=new WebDriverWait(driver,10)
				.until(ExpectedConditions.visibilityOfElementLocated( VerifyTransactionTypeDropdown_xpath));
			HeaderWebEelement.isDisplayed();
			//Thread.sleep(1000);
			return true;
		}
		catch(Exception ex){
			
		return false;
		}
		
		}
	 
	 
	 public boolean Fromdate_Verify()
		{
		try{
			WebElement HeaderWebEelement=new WebDriverWait(driver,10)
				.until(ExpectedConditions.visibilityOfElementLocated(VerifyDefaultValueOfFromDate_xpath));
			HeaderWebEelement.isDisplayed();
			//Thread.sleep(1000);
			return true;
		}
		catch(Exception ex){
			
		return false;
		}
		
		}
	 
	 
	 
	 public boolean Todate_Verify()
		{
		try{
			WebElement HeaderWebEelement=new WebDriverWait(driver,10)
				.until(ExpectedConditions.visibilityOfElementLocated( VerifyDefaultValueOfToDate_xpath));
			HeaderWebEelement.isDisplayed();
			//Thread.sleep(1000);
			return true;
		}
		catch(Exception ex){
			
		return false;
		}
		
		}
	 
	 
	 
	 public boolean Verifyclientdropdwnvalues()
		{
		try{

			WebElement selectWebEelement=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(Clientverify_xpath));
			selectWebEelement.click();
			//Thread.sleep(1000);
			return true;

		}
		catch(Exception ex){
			return false;
		}

		}
	 
	 
	 
	 public boolean VerifyFromDateTextField()
		{
		try{

			WebElement selectWebEelement=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(VerifyDefaultValueOfFromDate_xpath));
			selectWebEelement.click();
			//Thread.sleep(1000);
             return true;

		}
		catch(Exception ex){
			return false;
		}

		}
	 
	 
	 
	 public boolean VerifyToDateTextField()
		{
		try{

			WebElement selectWebEelement=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(VerifyDefaultValueOfToDate_xpath));
			selectWebEelement.click();
			//Thread.sleep(1000);
			return true;

		}
		catch(Exception ex){
			return false;
		}

		}
	 
	 
	 public boolean  TransactiotypeDropDown_Click(){
			try {
				String[] exp = {"All","ADVANCE","COLLECTION","ADJUSTMENT","INTEREST","FEES/CHARGES"};
				
				WebElement dropdown = driver.findElement(TransactiotypDropDownClick_xpath);
				
				dropdown.click();
				
				Select select = new Select(dropdown);
			 
			     List<WebElement> options = select.getOptions(); 
			     
				 for(WebElement we:options)  
				 {  
					 
				  boolean match = false;
				  for (int i=0; i<exp.length; i++){
				      if (we.getText().equals(exp[i])){
				        match = true;
				        System.out.println(we.getText());
				      }
				    }
				  Assert.assertTrue(match);
				 }
			} catch (Exception e) {
				// TODO: handle exception
				return false;
			}
			return true;
	 }
	 


	 
	 public boolean  Clientfromdropdown_Click(String clientName){
			try {
	 //String clientName="TESTINTEREST1";
				WebElement DropdownWebEelements = new WebDriverWait(driver, 10)
				.until(ExpectedConditions.visibilityOfElementLocated(Clientverify_xpath));
				DropdownWebEelements.click();
				Select sel = new Select(DropdownWebEelements);	
				sel.selectByVisibleText(clientName);
	    /*List<WebElement> list =sel.getOptions();
	    
	    for (WebElement ele:list){
		
		if(ele.getText().equals(clientName))
		{
		ele.click();
		break;

		 //System.out.println(ele.getText());
	      
	    }
	  //Assert.assertTrue(match);
	 }*/
	    return true;	
} catch (Exception e) {
	// TODO: handle exception
	
}
			return false;
}

	   

public boolean SelectFromTransactiontypeDrsopdown(String visibleTexts) throws InterruptedException{
	
	try {
		WebElement DropdownWebEelements1 = new WebDriverWait(driver, 10)
		.until(ExpectedConditions.visibilityOfElementLocated(TransactiotypDropDownClick_xpath));
		DropdownWebEelements1.click();
		Select sel = new Select(DropdownWebEelements1);
		
		sel.selectByVisibleText(visibleTexts);
		
		/*List<WebElement> list = sel.getOptions();
		
		for (WebElement ele : list) 
		{
			String data = ele.getText();
			System.out.println(data);
			
			if (ele.getText().equals(visibleTexts)) 
			{
		 		ele.click();
				
				break;
			}
		}*/
		return true;
	} 
	catch (Exception ex)
	{
		
	}
	
	return false;
	}
public boolean EnterFromdate(String From_Date)
{
try{

	WebElement selectWebEelement=new WebDriverWait(driver,10)
	.until(ExpectedConditions.visibilityOfElementLocated(VerifyDefaultValueOfFromDate_xpath));
	selectWebEelement.click();
	selectWebEelement.sendKeys(From_Date);
	Thread.sleep(200);
	return true;

}
catch(Exception ex){
	return false;
}

}
public boolean EnterTodate(String To_Date)
{
try{

	WebElement selectWebEelement=new WebDriverWait(driver,10)
	.until(ExpectedConditions.visibilityOfElementLocated(VerifyDefaultValueOfToDate_xpath));
	selectWebEelement.click();
	selectWebEelement.sendKeys(To_Date);
	Thread.sleep(500);
	return true;

}
catch(Exception ex){
	return false;
}

}
public boolean  Click_on_Genearate()
{
try{
	WebElement HeaderWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(VerifyGenerate_xpath));
	HeaderWebEelement.click();
Thread.sleep(1000);
	this.isAlertPresent();
	return true;
}
catch(Exception ex){
	return false;

}


}

public boolean  VerifyInterest()
{
try{
	WebElement HeaderWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(VerifyInterest_xpath));
	HeaderWebEelement.isDisplayed();
	Thread.sleep(500);
	this.isAlertPresent();
	return true;
}
catch(Exception ex){
	return false;

}
}

public boolean  VerifyFeescharge()
{
try{
	WebElement HeaderWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(VerifyFeescharge_xpath));
	HeaderWebEelement.isDisplayed();
	Thread.sleep(400);
	return true;
}
catch(Exception ex){
	return false;

}
}
public boolean  VerifyCollection()
{
try{
	WebElement HeaderWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(Collection_xpath));
	HeaderWebEelement.isDisplayed();
	Thread.sleep(500);
	return true;
}
catch(Exception ex){
	return false;

}
}

public boolean  Click_on_Interest()
{
try{
	WebElement HeaderWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(VerifyInterest_xpath));
	HeaderWebEelement.click();
	Thread.sleep(500);
	return true;
}
catch(Exception ex){
	return false;

}
}

public boolean  Click_on_Feescharge()
{
try{
	WebElement HeaderWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(VerifyFeescharge_xpath));
	HeaderWebEelement.click();
	Thread.sleep(500);
	return true;
}
catch(Exception ex){
	return false;

}
}

public boolean  Click_on_Collection()
{
try{
	WebElement HeaderWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(Collection_xpath));
	HeaderWebEelement.click();
	Thread.sleep(500);
	return true;
}
catch(Exception ex){
	return false;

}
}
public boolean  Click_on_Advance()
{
try{
	WebElement HeaderWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(Advance_xpath));
	HeaderWebEelement.click();
	//Thread.sleep(1000);
	return true;
}
catch(Exception ex){
	return false;

}
}
public boolean  Click_on_Adjustment()
{
try{
	WebElement HeaderWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(Adjustment_xpath));
	HeaderWebEelement.click();
	Thread.sleep(500);
	return true;
}
catch(Exception ex){
	return false;

}
}
public boolean  VerifyAdavnce()
{
try{
	WebElement HeaderWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(Advance_xpath));
	HeaderWebEelement.isDisplayed();
	//Thread.sleep(1000);
	return true;
}
catch(Exception ex){
	return false;

}
}
public boolean  VerifyAdjustment()
{
try{
	WebElement HeaderWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(Adjustment_xpath));
	HeaderWebEelement.isDisplayed();
	Thread.sleep(500);
	return true;
}
catch(Exception ex){
	return false;
}

}

public boolean  Verify_ReloadIcon()
{
try{
	WebElement HeaderWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(Reload_xpath));
	HeaderWebEelement.click() ;
	Thread.sleep(500);
	return true;
}
catch(Exception ex){
	return false;

}	
}
public boolean  Click_on_Export()
{
try{
	WebElement HeaderWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(VerifyExport_xpath));
	HeaderWebEelement.click();
	Thread.sleep(500);
	return true;
}
catch(Exception ex){
	return false;

}
}
public boolean  Click_on_TRPOPUP()
{
try{
	WebElement HeaderWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(VerifyExportIcon_xpath));
	HeaderWebEelement.click();
	Thread.sleep(500);
	return true;
}
catch(Exception ex){
	return false;

}
}

public boolean  ClickExportCloseBTN()
{
try{
	WebElement ExportCloseWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(exportCloseBTN_xpath));
	ExportCloseWebEelement.click();
	return true;
}
catch(Exception ex){
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


}
		
	    
			
	 
