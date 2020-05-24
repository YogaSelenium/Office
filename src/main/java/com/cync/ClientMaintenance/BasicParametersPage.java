package com.cync.ClientMaintenance;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;




import java.util.concurrent.TimeUnit;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.SkipException;

import com.cync.base.BasePage;

public class BasicParametersPage extends BasePage {
	
	
	private final By BasicParametersPage = By.xpath("//span[text()='Basic Parameters']");
	private final By editBtn_xpath = By.xpath("//a[@id='parameter_edit']");
	private final By maintainCurrentARCheckBox_xpath = By.id("parameter_maintain_current_ar");
	private final By saveBtn_xpath = By.id("parameter_submit");
	private final By basicParameterMsg_xpath = By.xpath("//strong[text()='Client Parameter was successfully updated.']");

	private final By selectClient_xpath = By.id("select2-choose_borrower-container");
	private final By searchClientTextBox_xpath = By.xpath("//input[@type='search']");
	private final By searchClient_xpath = By.xpath("//span[@class='select2-results']");
	private final By concentrationBasicParameters_xpath=By.xpath("//input[@id='parameter_concentration_pct']");
	

	private final By SummaryCheckBox_xpath = By.id("parameter_combine_summ_det_ar_yn");


	private final By interestRateCodeDropdown_xpath=By.xpath("//select[@id='parameter_interest_rate_code_id']");
	private final By interestDetails_xpath=By.xpath("//a[@id='rate_adjustments']");
	private final By addIcon_xpath=By.xpath("//span[@class='ui-icon ui-icon ui-icon-plus']");
	private final By effectiveDateBox_xpath=By.xpath("(//input[@name='effective_date'])[2]");
	private final By valueBox_xpath=By.xpath("(//input[contains(@name,'value')])[3]");
	private final By saveIcon_xpath=By.xpath("//td[@title='Save Record']");
	private final By successMsg_xpath=By.xpath("//div[text()='Rate Adjustment was successfully created.']");
	private final By successMsg1_xpath=By.xpath("//strong[text()='Client Parameter was successfully updated.']");
	private final By closeButton_xpath=By.xpath("//a[text()='Close']");
	private final By crossIcon_xpath=By.xpath("//button[@class='ui-dialog-titlebar-close']");
	private final By minRateBox_xpath=By.id("parameter_min_interest_rate");
	private final By maxRateBox_xpath=By.id("parameter_max_interest_rate");
	private final By saveButton_xpath=By.id("parameter_submit");

	private final By ProcessSummaryAgingCheckBox_xpath = By.xpath("//input[@id='parameter_combine_summ_det_ar_yn']");
	
	private final By auditletter_xpath=By.xpath("//label[text()='Audit Letter Days']");
	   private final By inventory_xpath=By.xpath("//label[text()='Inventory Reliance %']");
	   private final By liqcost_xpath=By.xpath("//label[text()='Liq. Cost %']");
	   private final By pastdueardays_xpath=By.id("parameter_ar_aging_days");
	   private final By pastdueamnt_xpath=By.xpath("//select[@id='parameter_ineligible_past_due_flag']");
	   private final By agedcreditamnt_xpath=By.xpath("//select[@id='parameter_ineligible_aged_credit_flag']");
	   private final By crossaging_xpath=By.id("parameter_cross_aging_pct");
	   private final By agingradiobtn_xpath=By.id("parameter_pastdue_type_a");
	   private final By ineligibleradio_xpath=By.id("parameter_pastdue_type_i");
	   private final By crossagedropdown_xpath=By.xpath("//select[@id='parameter_crossage_formula']");
	   private final By allowpastduecheckbox_xpath=By.id("parameter_allow_pastdue_over_balance");
	   private final By concentration_xpath=By.id("parameter_concentration_pct");


	   
	   //Author garima
	   private final By ClickOnaging_xpath=By.xpath(" //span[@class='inblock']//input[@value='A']");
	   private final By CrossAgebucket_xpath=By.xpath(" //a[contains(text(),'Consider Cross Age Buckets')]");
	   private final By Inventorysublimit_xpath=By.xpath("//input[@id='parameter_inventory_sublimit']");
	   private final By CrossAging_xpath=By.xpath("//div[@class='control-group form-inline top-buttom-gap']//input[@value='5.00'");
	   private final By Inventorycap_xpath=By.xpath("//input[@id='parameter_ar_reliance_pct']");
		private final By MAxCap_xpath=By.xpath(" //input[@id='parameter_ar_reliance_max_cap_pct']");
		private final By cross_xpath=By.xpath("//input[@id='parameter_cross_aging_pct']");
		private final By Table_xpath=By.xpath("//div[@class='ui-jqgrid-bdiv']");
	private final By BucketTable_xpath=By.xpath("(//table[@class='cync_form ui-jqgrid-btable ui-common-table'])[1]");
	private final By DoubleClick_xpath=By.xpath("//tr[@id='31901']//td[5]");
	private final By DoubleClicks_xpath=By.xpath("(//*[@aria-describedby='cross_bucket_ageing_list_bucket_name'])[2]");
	private final By Baseon_xpath=By.xpath("//select[@name='based_on']");
	private final By ineligble_xpath=By.xpath(" //input[@value='I']");
	private final By CheckBox_xpath=By.xpath("//input[@id='31902_ageing']");
	private final By Save_xpath=By.xpath("//span[contains(@class,'ui-icon ui-icon ui-icon-disk')]");
	private final By excludear_xpath=By.xpath("//label[contains(text(),'AR Exclude')]");
    private final By arexcludedropdown_xpath=By.xpath("//select[@id='parameter_ar_exclude_on']");
    


//cyncs_4462 //lavanya
    
    private final By manuallyentercheckbox_xpath=By.xpath("//input[@id='parameter_is_manual_ineligible_amt_by_client']");
    private final By receivableaging_label_xpath=By.xpath("//label[contains(text(),'Receivable Aging')]");
    private final By asset_label_xpath=By.xpath("//label[contains(text(),'Asset/Inventory')]");
    private final By othercoll_label_xpath=By.xpath("(//label[contains(text(),'Other Collateral')])[1]");
    private final By defaultoption_xpath=By.xpath("//select[@id='parameter_ineligible_amt_base_on']");
    
    private final By selectoption_xpath=By.xpath("//select[@id='parameter_ineligible_amt_base_on']");
    private final By selectoption1_xpath=By.xpath("//select[@id='parameter_inventory_ineligible_amt_base_on']");
    private final By enable_inve_xpath=By.xpath("//input[@id='parameter_display_inventory_ineligibles']");

    
    
    
    
	////ineligible exclude ar reason

	public BasicParametersPage(WebDriver driver) {
		super(driver);
		try{
			////Thread.sleep(500);
			}
		catch(Exception e){
			
		// TODO Auto-generated constructor stub
			e.printStackTrace();
	}
		if(!driver.findElement(BasicParametersPage).getText().trim().equals("Basic Parameters")){
			throw new SkipException("Basic Parameter page couldn't open.");
		}// TODO Auto-generated constructor stub
}
	
	public boolean HeaderVerify()
	{
	try{

		WebElement headerWebEelement=new WebDriverWait(driver,5)
		.until(ExpectedConditions.visibilityOfElementLocated(BasicParametersPage));
		headerWebEelement.isDisplayed();
		
return true;
	}
	catch(Exception ex){
		return false;
	}

	}
	

	public boolean ARExcludedropdownVerify()
	{
	try{

		WebElement headerWebEelement=new WebDriverWait(driver,5)
		.until(ExpectedConditions.visibilityOfElementLocated(excludear_xpath));
		headerWebEelement.isDisplayed();
		
return true;
	}
	catch(Exception ex){
		return false;
	}

	}
	
	public boolean  ARexcludeDropDown_Click(){
        try {
            String[] exp = {"Eligible Balance","Debtor Balance"};
           
            WebElement dropdown = driver.findElement(arexcludedropdown_xpath);
           
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
	/*	try {
			String[] exp = {"Eligible Balance","Debtor Balance"};
			
			WebElement dropdown = driver.findElement(arexcludedropdown_xpath);
			
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
 */
	public  boolean ClickonARExcludeDropdown(String value) {
		try {
			WebElement DropdownWebEelement = new WebDriverWait(driver, 10)
			.until(ExpectedConditions.visibilityOfElementLocated(arexcludedropdown_xpath));
			Select sel = new Select(DropdownWebEelement);
			
			List<WebElement> list = sel.getOptions();
			
			for (WebElement ele : list) 
			{
				/*String data = ele.getText();
				System.out.println(data);*/
				if (ele.getText().equals(value)) 
				{
			 		ele.click();
					////Thread.sleep(10000);
					
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

	public boolean verifyineligble()
	{
	try{

		WebElement headerWebEelement=new WebDriverWait(driver,5)
		.until(ExpectedConditions.visibilityOfElementLocated(BasicParametersPage));
		headerWebEelement.click();
		
return true;
	}
	catch(Exception ex){
		return false;
	}

	}
	
	
	public boolean clickOnSave()
	{
	try{

		WebElement headerWebEelement=new WebDriverWait(driver,5)
		.until(ExpectedConditions.visibilityOfElementLocated(Save_xpath));
		headerWebEelement.click();
		
return true;
	}
	catch(Exception ex){
		return false;
	}

	}
	
	
	public boolean clickCheckBox()
	{
	try{

		WebElement headerWebEelement=new WebDriverWait(driver,5)
		.until(ExpectedConditions.visibilityOfElementLocated(CheckBox_xpath));
		headerWebEelement.click();
		
return true;
	}
	catch(Exception ex){
		return false;
	}

	}
	
	public boolean verifyineligbles()
	{
	try{

		WebElement headerWebEelement=new WebDriverWait(driver,5)
		.until(ExpectedConditions.visibilityOfElementLocated(BasicParametersPage));
		headerWebEelement.isDisplayed();
		
return true;
	}
	catch(Exception ex){
		return false;
	}

	}
	public boolean verifytable()
	{
	try{

		WebElement headerWebEelement=new WebDriverWait(driver,5)
		.until(ExpectedConditions.visibilityOfElementLocated(Table_xpath));
		
		String n=headerWebEelement.getText();
		System.out.println(n);
return true;
	}
	catch(Exception ex){
		return false;
	}

	}
	
	public boolean verifyBuckettable()
	{
	try{

		WebElement headerWebEelement=new WebDriverWait(driver,5)
		.until(ExpectedConditions.visibilityOfElementLocated(BucketTable_xpath));
		
		String n=headerWebEelement.getText();
		System.out.println(n);
return true;
	}
	catch(Exception ex){
		return false;
	}}
public	boolean clickTosecondeditbox1()
	{
		try
		{
			WebElement clickTosecondeditbox=new WebDriverWait(driver,50)
			.until(ExpectedConditions.visibilityOfElementLocated(DoubleClicks_xpath));
			Actions action = new Actions(driver);
			action.doubleClick(clickTosecondeditbox).build().perform();
			////Thread.sleep(2000);
			

			return true;
			
			

			}
		catch (Exception e)
		{
			return false;
		}
		


	}
public	boolean clickTosecondeditbox11()
{
	try
	{
		WebElement clickTosecondeditbox=new WebDriverWait(driver,50)
		.until(ExpectedConditions.visibilityOfElementLocated(DoubleClicks_xpath));
		Actions action = new Actions(driver);
		action.doubleClick(clickTosecondeditbox).build().perform();
		////Thread.sleep(2000);
		

		return true;
		
		

		}
	catch (Exception e)
	{
		return false;
	}
	


}
public	String clickTosecondeditbox2(String v)
{
	try
	{
		WebElement clickTosecondeditbox=new WebDriverWait(driver,5)
		.until(ExpectedConditions.visibilityOfElementLocated(DoubleClicks_xpath));
		
		
		clickTosecondeditbox.sendKeys(v);

		
		
		

		}
	catch (Exception e)
	{
		
	}
	

	return v;
}

public boolean clickbasedyCap()
{
try{

	WebElement headerWebEelement=new WebDriverWait(driver,5)
	.until(ExpectedConditions.visibilityOfElementLocated(Baseon_xpath));
	headerWebEelement.click();
	
return true;
}
catch(Exception ex){
	return false;
}

}

public String  clickbasedyCaps(String s)
{
try{

	WebElement headerWebEelement=new WebDriverWait(driver,5)
	.until(ExpectedConditions.visibilityOfElementLocated(Baseon_xpath));
	headerWebEelement.click();
	headerWebEelement.sendKeys(s);
	

}
catch(Exception ex){

}
return s;
}

	public boolean clickInventoryCap()
	{
	try{

		WebElement headerWebEelement=new WebDriverWait(driver,5)
		.until(ExpectedConditions.visibilityOfElementLocated(Inventorycap_xpath));
		headerWebEelement.click();;
		
return true;
	}
	catch(Exception ex){
		return false;
	}

	}
	
	public boolean clickMaxCap()
	{
	try{

		WebElement headerWebEelement=new WebDriverWait(driver,5)
		.until(ExpectedConditions.visibilityOfElementLocated(MAxCap_xpath));
		headerWebEelement.click();
		this.isAlertPresent();
		
return true;
	}
	catch(Exception ex){
		return false;
	}

	}
	
	public boolean clickcross()
	{
	try{

		WebElement headerWebEelement=new WebDriverWait(driver,5)
		.until(ExpectedConditions.visibilityOfElementLocated(cross_xpath));
		headerWebEelement.click();
		this.isAlertPresent();
		
return true;
	}
	catch(Exception ex){
		return false;
	}

	}

	public boolean clickonaging()
	{
	try{

		WebElement headerWebEelement=new WebDriverWait(driver,5)
		.until(ExpectedConditions.visibilityOfElementLocated(ClickOnaging_xpath));
		headerWebEelement.click();
		this.isAlertPresent();
		
return true;
	}
	catch(Exception ex){
		return false;
	}

	}

	public boolean verifyonaging()
	{
	try{

		WebElement headerWebEelement=new WebDriverWait(driver,5)
		.until(ExpectedConditions.visibilityOfElementLocated(ClickOnaging_xpath));
		headerWebEelement.isDisplayed();
		
return true;
	}
	catch(Exception ex){
		return false;
	}

	}
	public boolean clickinventory()
	{
	try{

		WebElement headerWebEelement=new WebDriverWait(driver,5)
		.until(ExpectedConditions.visibilityOfElementLocated(Inventorysublimit_xpath));
		headerWebEelement.click();;
		this.isAlertPresent();
		
return true;
	}
	catch(Exception ex){
		return false;
	}

	}
	
	

	public boolean isAlertPresent() {

		boolean presentFlag = true;

		try {
			Alert alert = driver.switchTo().alert();
			presentFlag = true;
			alert.accept();
		} catch (Exception ex) {

			System.out.println("No Such Alert Present");

		}

		return presentFlag;
	}
	public boolean clickcrossaging()
	{
	try{

		WebElement headerWebEelement=new WebDriverWait(driver,5)
		.until(ExpectedConditions.visibilityOfElementLocated(Inventorysublimit_xpath));
		headerWebEelement.click();;
		
return true;
	}
	catch(Exception ex){
		return false;
	}

	}
	public boolean concentrationInput(String concentrationData)
	{
	try{

		WebElement concentrationInputWebEelement=new WebDriverWait(driver,5)
		.until(ExpectedConditions.visibilityOfElementLocated(concentrationBasicParameters_xpath));
		concentrationInputWebEelement.clear();
		concentrationInputWebEelement.sendKeys(concentrationData);
		////Thread.sleep(2000);
		
return true;
	}
	catch(Exception ex){
		return false;
	}
	}

	public boolean EditBtnClick()
	{
	try{

		WebElement editWebEelement=new WebDriverWait(driver,50)
		.until(ExpectedConditions.visibilityOfElementLocated(editBtn_xpath));
		editWebEelement.click();

		////Thread.sleep(2000);

		
return true;
	}
	catch(Exception ex){
		return false;
	}

	}
	
	public boolean CrossageBucket()
	{
	try{

		WebElement editWebEelement=new WebDriverWait(driver,5)
		.until(ExpectedConditions.visibilityOfElementLocated(CrossAgebucket_xpath));
		editWebEelement.click();

		this.isAlertPresent();
		////Thread.sleep(6000);

		
return true;
	}
	catch(Exception ex){
		return false;
	}

	}
	

	public boolean CrossageBuckets()
	{
	try{

		WebElement editWebEelement=new WebDriverWait(driver,5)
		.until(ExpectedConditions.visibilityOfElementLocated(CrossAgebucket_xpath));
		editWebEelement.isDisplayed();
		////Thread.sleep(6000);
		
return true;
	}
	catch(Exception ex){
		return false;
	}

	}

	public boolean CrossageBuckett()
	{
	try{

		WebElement editWebEelement=new WebDriverWait(driver,5)
		.until(ExpectedConditions.visibilityOfElementLocated(CrossAgebucket_xpath));
		editWebEelement.isEnabled();
		////Thread.sleep(6000);
		
return true;
	}
	catch(Exception ex){
		return false;
	}

	}
	public boolean MaintainCurrentARCheckBox()
	{
	try{

		WebElement checkBoxWebEelement=new WebDriverWait(driver,100)
		.until(ExpectedConditions.visibilityOfElementLocated(maintainCurrentARCheckBox_xpath));
		checkBoxWebEelement.click();
		////Thread.sleep(2000);
		
return true;
	}
	catch(Exception ex){
		return false;
	}

	}
	
	
	public boolean ProcessSummaryAgingCheckBox(boolean flag){
		 try {
			   WebDriverWait wait = new WebDriverWait(driver, 5);
			   ////Thread.sleep(6000);
			   wait.until(ExpectedConditions.visibilityOfElementLocated((ProcessSummaryAgingCheckBox_xpath)));			   
			   WebElement element = driver.findElement((ProcessSummaryAgingCheckBox_xpath));
			   if(flag){
			    if(!element.isSelected() == true){
			     element.click();
			
			    }
			   }else if(!flag){
			    if(element.isSelected() == true){
			     element.click();
			    

			    }
			   }   
			  } catch (Exception e) {
			   System.out.println("Exception in clickOnCheckBox Method "+e.getCause());
			  }
		return flag; 
	}
	
	
	
	public boolean processsummaryagingCheckBox_on()
	{
	try{

		WebElement checkBoxWebEelement=new WebDriverWait(driver,100)
		.until(ExpectedConditions.visibilityOfElementLocated(ProcessSummaryAgingCheckBox_xpath));
		checkBoxWebEelement.click();
		//Thread.sleep(2000);
		
return true;
	}
	catch(Exception ex){
		return false;
	}

	}
	
	
	public boolean MaintainCurrentARCheckBox(boolean flag){
		 try {
			   WebDriverWait wait = new WebDriverWait(driver, 5);
			   ////Thread.sleep(6000);
			   wait.until(ExpectedConditions.visibilityOfElementLocated((maintainCurrentARCheckBox_xpath)));			   
			   WebElement element = driver.findElement((maintainCurrentARCheckBox_xpath));
			   if(flag){
			    if(!element.isSelected() == true){
			     element.click();
			
			    }
			   }else if(!flag){
			    if(element.isSelected() == true){
			     element.click();
			    

			    }
			   }   
			  } catch (Exception e) {
			   System.out.println("Exception in clickOnCheckBox Method "+e.getCause());
			  }
		return flag; 
	}
	
	
	
	
	

	public boolean SaveFunction()
	{
	try{

		WebElement saveWebEelement=new WebDriverWait(driver,5)
		.until(ExpectedConditions.visibilityOfElementLocated(saveBtn_xpath));
		saveWebEelement.click();
		////Thread.sleep(5000);

		
return true;
	}
	catch(Exception ex){
		return false;
	}

	}
	
	
	public String verifyMessageOnBasicParameterAfterSave(String successMsg)
    {
    try{
       WebElement SaveWebEelement=new WebDriverWait(driver,5)
       .until(ExpectedConditions.visibilityOfElementLocated(basicParameterMsg_xpath));
       
      String actualMsg= SaveWebEelement.getText();
      if(actualMsg.equalsIgnoreCase(successMsg))
      {
       return actualMsg;
      }
       
    }
    catch(Exception ex){
     
    }
 return successMsg;
    }
	
	
	public boolean SummaryCheckBox()
	{
	try{

		WebElement checkBoxWebEelement=new WebDriverWait(driver,5)
		.until(ExpectedConditions.visibilityOfElementLocated(SummaryCheckBox_xpath));
		checkBoxWebEelement.click();
		////Thread.sleep(2000);
		
return true;
	}
	catch(Exception ex){
		return false;
	}

	}	
	
	public boolean selectFromInterestRateCodeDropdown(String visibleText) throws InterruptedException{
		
		try {
			WebElement DropdownWebEelement = new WebDriverWait(driver, 5)
			.until(ExpectedConditions.visibilityOfElementLocated(interestRateCodeDropdown_xpath));
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
					//////Thread.sleep(10000);
					
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
		
		
		
		public boolean clickOnInterestDetails()
		{
		try{
			WebElement editWebEelement=new WebDriverWait(driver,5)
				.until(ExpectedConditions.visibilityOfElementLocated(interestDetails_xpath));
			editWebEelement.click();
			////Thread.sleep(500);
			return true;
		}
		catch(Exception ex){
			return false;	
		}
		}
		
		public boolean clickAddIconOnInterestDetailsPopUp()
		{
		try{
			WebElement editWebEelement=new WebDriverWait(driver,5)
				.until(ExpectedConditions.visibilityOfElementLocated(addIcon_xpath));
			editWebEelement.click();
			////Thread.sleep(2000);
			return true;
		}
		catch(Exception ex){
			return false;	
		}
		}
		

		/*public boolean selectEffectiveDate(String date){
			try {
				
			WebElement editWebEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(effectiveDateBox_xpath));
			editWebEelement.clear();
			editWebEelement.sendKeys(date);
			////Thread.sleep(1000);
			return true;

			} catch (Exception e) {
				return false;
			}
			
			}*/
		
		
		public boolean selectEffectiveDate(){
			try {
			WebElement dateWebElement = new WebDriverWait(driver,
			5)
			.until(ExpectedConditions.visibilityOfElementLocated(effectiveDateBox_xpath));
			Date date = new Date(System.currentTimeMillis());
			SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
			String today=formatter.format(date);
			dateWebElement.clear();
			////Thread.sleep(500);

			dateWebElement.sendKeys(today);


			return true;
			} catch (Exception e) {
			return false;
			}
			}
				
				
				
				
				
	/*		WebElement dateBox = driver.findElement(By.xpath("(//input[contains(@name,'effective_date')])[2]"));
			
			dateBox.clear();
			////Thread.sleep(500);

			//Fill date as mm/dd/yyyy as 09/25/2013

			 dateBox.sendKeys(date);*/
			 
			/*WebElement dateWebElement = new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(effectiveDateBox_xpath));
			Date date = new Date(System.currentTimeMillis());
			SimpleDateFormat formatter = new SimpleDateFormat("MM/DD/YYYY");
			String today=formatter.format(date);*/
			
			/*dateWebElement.clear();


			dateWebElement.sendKeys(today);*/
			
		
		public boolean addToValueTextbox(String value)
		{
		try{
			WebElement editWebEelement=new WebDriverWait(driver,5)
			.until(ExpectedConditions.visibilityOfElementLocated(valueBox_xpath));
			editWebEelement.click();
			editWebEelement.clear();
			editWebEelement.sendKeys(value);
			////Thread.sleep(6000);
			return true;
		}
		catch(Exception ex){
			return false;	
		}
		}
		
		public boolean clickOnSaveInterestDetails()
		{
		try{
		
			WebElement editWebEelement=new WebDriverWait(driver,5)
			.until(ExpectedConditions.visibilityOfElementLocated(saveIcon_xpath));
			editWebEelement.click();
			////Thread.sleep(5000);
			return true;
		}
		catch(Exception ex){
			return false;
		}
		
		}
		
		
		public String verifySuccessMessage(String successmsg){
			try{
				
				WebElement successMessageWebE=new WebDriverWait(driver,5)
				.until(ExpectedConditions.visibilityOfElementLocated(successMsg_xpath));
				String actual_msg=successMessageWebE.getText().trim();
				
				if(actual_msg.equals(successmsg));
			}
			catch(Exception ex){
			}
			return successmsg;
			}
		
		public String verifySuccessMessage1(String successmsg){
			try{
				WebElement successMessageWebE=new WebDriverWait(driver,5)
				.until(ExpectedConditions.visibilityOfElementLocated(successMsg1_xpath));
				String actual_msg=successMessageWebE.getText().trim();
				
				if(actual_msg.equals(successmsg));
			}
			catch(Exception ex){
			}
			return successmsg;
			}
		
		
		public boolean clickOnCloseButton()
		{
		try{
			WebElement editWebEelement=new WebDriverWait(driver,5)
				.until(ExpectedConditions.visibilityOfElementLocated(closeButton_xpath));
			editWebEelement.click();
			return true;
		}
		catch(Exception ex){
				
		}
		return false;
		}
		

		public boolean clickOnCrossIconInPopUp()
		{
		try{
			WebElement editWebEelement=new WebDriverWait(driver,5)
				.until(ExpectedConditions.visibilityOfElementLocated(crossIcon_xpath));
			editWebEelement.click();
			return true;
		}
		catch(Exception ex){
			return false;	
		}
		}
		

		public boolean addToMinInterestRateTextbox(String value)
		{
		try{
			WebElement editWebEelement=new WebDriverWait(driver,5)
				.until(ExpectedConditions.visibilityOfElementLocated(minRateBox_xpath));
			editWebEelement.clear();
			editWebEelement.sendKeys(value);
			
			return true;
		}
		catch(Exception ex){
			return false;	
		}
		}
			
		public boolean addToMaxInterestRateTextbox(String value)
		{
		try{
			WebElement editWebEelement=new WebDriverWait(driver,5)
				.until(ExpectedConditions.visibilityOfElementLocated(maxRateBox_xpath));
			editWebEelement.clear();
			editWebEelement.sendKeys(value);
			
			return true;
		}
		catch(Exception ex){
			return false;	
		}
		}
		
		

		public boolean clickOnSaveButton()
		{
		try{
			WebElement editWebEelement=new WebDriverWait(driver,5)
				.until(ExpectedConditions.visibilityOfElementLocated(saveButton_xpath));
			editWebEelement.click();
			return true;
		}
		catch(Exception ex){
			return false;	
		}
		}
		public boolean clickOnSaveButton_4462()
		{
		try{
			WebElement editWebEelement=new WebDriverWait(driver,5)
				.until(ExpectedConditions.visibilityOfElementLocated(saveButton_xpath));
			editWebEelement.click();
			Alert alert = driver.switchTo().alert();
	   		alert.accept();
			return true;
		}
		catch(Exception ex){
			return false;	
		}
		}
public boolean scrollToViewL()
{
	try{
		 WebElement actual1=new WebDriverWait(driver,5)
		 .until(ExpectedConditions.visibilityOfElementLocated(auditletter_xpath));
		JavascriptExecutor jse1 = (JavascriptExecutor)driver;;
		jse1.executeScript("arguments[0].scrollIntoView(true);", actual1);  		

        //Thread.sleep(300);

        return true;
		
	}
	catch(Exception e){
		
	}
	return false;
	
	} 


public boolean scrollToViewL1()
{
	try{
		 WebElement actual1=new WebDriverWait(driver,5)
		 .until(ExpectedConditions.visibilityOfElementLocated(inventory_xpath));
		JavascriptExecutor jse1 = (JavascriptExecutor)driver;;
		jse1.executeScript("arguments[0].scrollIntoView(true);", actual1);  		

        ////Thread.sleep(500);

        return true;
		
	}
	catch(Exception e){
		
	}
	return false;
	
	} 

public boolean scrollToViewL2()
{
	try{
		 WebElement actual1=new WebDriverWait(driver,5)
		 .until(ExpectedConditions.visibilityOfElementLocated(liqcost_xpath));
		JavascriptExecutor jse1 = (JavascriptExecutor)driver;;
		jse1.executeScript("arguments[0].scrollIntoView(true);", actual1);  		
        ////Thread.sleep(500);
        return true;
		
	}
	catch(Exception e){
		
	}
	return false;
	
	} 
public boolean scrollToViewL3()
{
	try{
		 WebElement actual1=new WebDriverWait(driver,5)
		 .until(ExpectedConditions.visibilityOfElementLocated(pastdueardays_xpath));
		JavascriptExecutor jse1 = (JavascriptExecutor)driver;;
		jse1.executeScript("arguments[0].scrollIntoView(true);", actual1);  		
        ////Thread.sleep(500);
        return true;
		
	}
	catch(Exception e){
		
	}
	return false;
	
	} 


public boolean pastdueardays(String days)
{
try{

	WebElement pastdueardaysInputWebEelement=new WebDriverWait(driver,5)
	.until(ExpectedConditions.visibilityOfElementLocated(pastdueardays_xpath));
	pastdueardaysInputWebEelement.click();
	pastdueardaysInputWebEelement.clear();
	pastdueardaysInputWebEelement.sendKeys(days);


	//Thread.sleep(1000);//kruthivas
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

return true;
}
catch(Exception ex){
	return false;
}
}
public boolean enterconcentrationpercent(String percent)
{
try{

	WebElement pastdueardaysInputWebEelement=new WebDriverWait(driver,100)
	.until(ExpectedConditions.visibilityOfElementLocated(concentration_xpath));
	pastdueardaysInputWebEelement.click();
	pastdueardaysInputWebEelement.clear();
	pastdueardaysInputWebEelement.sendKeys(percent);

	//Thread.sleep(1000);//kruthivas
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	//Thread.sleep(2000);


	
return true;
}
catch(Exception ex){
	return false;
}
}
public boolean SelectFromcrossagecaluculationDropdown(String visibleText) throws InterruptedException{
	
	try {
		WebElement DropdownWebEelements1 = new WebDriverWait(driver, 5)
		.until(ExpectedConditions.visibilityOfElementLocated(crossagedropdown_xpath));
		DropdownWebEelements1.click();
		Select sel = new Select(DropdownWebEelements1);
		
		List<WebElement> list = sel.getOptions();
		
		for (WebElement ele : list) 
		{
			
			if (ele.getText().equals(visibleText)) 
			{
		 		ele.click();
				
				break;
			}
		}return true;
	} 
	catch (Exception ex)
	{
		
	}
	return false;
	
}


public boolean ineligibleradiobtnClick()
{
try{

	WebElement editWebEelement=new WebDriverWait(driver,5)
	.until(ExpectedConditions.visibilityOfElementLocated(ineligibleradio_xpath));
	editWebEelement.click();
	////Thread.sleep(2000);
	
return true;
}
catch(Exception ex){
	return false;
}

}
public boolean agingradiobtnClick()
{
try{

	WebElement editWebEelement=new WebDriverWait(driver,5)
	.until(ExpectedConditions.visibilityOfElementLocated(agingradiobtn_xpath));
	editWebEelement.click();
	////Thread.sleep(2000);
	
return true;
}
catch(Exception ex){
	return false;
}

}
public boolean enable_manuallyenteredcheckbox()
{
try{

	WebElement enableWebEelement=new WebDriverWait(driver,5)
	.until(ExpectedConditions.visibilityOfElementLocated(manuallyentercheckbox_xpath));
	enableWebEelement.click();
	//Thread.sleep(2000);
	
return true;
}
catch(Exception ex){
	return false;
}

}
public boolean enable_displayinventory_ineligiblecheckbox()
{
try{

	WebElement enableWebEelement=new WebDriverWait(driver,5)
	.until(ExpectedConditions.visibilityOfElementLocated(enable_inve_xpath));
	enableWebEelement.click();
	//Thread.sleep(2000);
	
return true;
}
catch(Exception ex){
	return false;
}

}

public boolean Verify_Receivableaging_label()
{
try{

	WebElement verifyWebEelement=new WebDriverWait(driver,5)
	.until(ExpectedConditions.visibilityOfElementLocated(receivableaging_label_xpath));
	verifyWebEelement.isDisplayed();
	//Thread.sleep(2000);
	
return true;
}
catch(Exception ex){
	return false;
}

}
public boolean Verify_Assetinventory_label()
{
try{

	WebElement verifyWebEelement=new WebDriverWait(driver,5)
	.until(ExpectedConditions.visibilityOfElementLocated(asset_label_xpath));
	verifyWebEelement.isDisplayed();
	//Thread.sleep(2000);
	
return true;
}
catch(Exception ex){
	return false;
}

}
public boolean Verify_Othercollateral_label()
{
try{

	WebElement verifyWebEelement=new WebDriverWait(driver,5)
	.until(ExpectedConditions.visibilityOfElementLocated(othercoll_label_xpath));
	verifyWebEelement.isDisplayed();
	//Thread.sleep(2000);
	
return true;
}
catch(Exception ex){
	return false;
}

}
public boolean verify_defaultoption_receivableaging()
{
try{

	WebElement verifyWebEelement=new WebDriverWait(driver,5)
	.until(ExpectedConditions.visibilityOfElementLocated(defaultoption_xpath));
	verifyWebEelement.isDisplayed();
	//Thread.sleep(2000);
	
return true;
}
catch(Exception ex){
	return false;
}

}
public boolean verify_defaultoption_assetinventory()
{
try{

	WebElement verifyWebEelement=new WebDriverWait(driver,5)
	.until(ExpectedConditions.visibilityOfElementLocated(defaultoption_xpath));
	verifyWebEelement.isDisplayed();
	//Thread.sleep(2000);
	
return true;
}
catch(Exception ex){
	return false;
}

}
public boolean verify_defaultoption_othercollateral()
{
try{

	WebElement verifyWebEelement=new WebDriverWait(driver,5)
	.until(ExpectedConditions.visibilityOfElementLocated(defaultoption_xpath));
	verifyWebEelement.isDisplayed();
	//Thread.sleep(2000);
	
return true;
}
catch(Exception ex){
	return false;
}

}

public  boolean selectoptionfrom_receivableagingDropdown(String value) {
	try {
		WebElement DropdownWebEelement = new WebDriverWait(driver, 10)
		.until(ExpectedConditions.visibilityOfElementLocated(selectoption_xpath));
		Select sel = new Select(DropdownWebEelement);
		
		List<WebElement> list = sel.getOptions();
		
		for (WebElement ele : list) 
		{
			/*String data = ele.getText();
			System.out.println(data);*/
			if (ele.getText().equals(value)) 
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
public  boolean selectoptionfrom_assetinventory_Dropdown(String value) {
	try {
		WebElement DropdownWebEelement = new WebDriverWait(driver, 10)
		.until(ExpectedConditions.visibilityOfElementLocated(selectoption1_xpath));
		Select sel = new Select(DropdownWebEelement);
		
		List<WebElement> list = sel.getOptions();
		
		for (WebElement ele : list) 
		{
			/*String data = ele.getText();
			System.out.println(data);*/
			if (ele.getText().equals(value)) 
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
public boolean crossaging(String percent)
{
try{

	WebElement crossagingInputWebEelement=new WebDriverWait(driver,5)
	.until(ExpectedConditions.visibilityOfElementLocated(crossaging_xpath));
	crossagingInputWebEelement.click();
	crossagingInputWebEelement.clear();
	crossagingInputWebEelement.sendKeys(percent);
	////Thread.sleep(2000);
	
return true;
}
catch(Exception ex){
	return false;
}
}


public boolean SelectFrompastdueamountDropdown(String visibleTexts) throws InterruptedException{
	
	try {
		WebElement DropdownWebEelements1 = new WebDriverWait(driver, 5)
		.until(ExpectedConditions.visibilityOfElementLocated(pastdueamnt_xpath));
		DropdownWebEelements1.click();
		Select sel = new Select(DropdownWebEelements1);
		
		List<WebElement> list = sel.getOptions();
		
		for (WebElement ele : list) 
		{
			
			if (ele.getText().equals(visibleTexts)) 
			{
		 		ele.click();
				
				break;
			}
		}return true;
	} 
	catch (Exception ex)
	{
		
	}
	return false;
	
}
public boolean SelectFromagedcreditamountDropdown(String visibleTexts1) throws InterruptedException{
	
	try {
		WebElement DropdownWebEelements1 = new WebDriverWait(driver, 5)
		.until(ExpectedConditions.visibilityOfElementLocated(agedcreditamnt_xpath));
		DropdownWebEelements1.click();
		Select sel = new Select(DropdownWebEelements1);
		
		List<WebElement> list = sel.getOptions();
		
		for (WebElement ele : list) 
		{
			
			if (ele.getText().equals(visibleTexts1)) 
			{
		 		ele.click();
				
				break;
			}
		}return true;
	} 
	catch (Exception ex)
	{
		
	}
	return false;
	
}

public boolean allowpastduecheckboxClick()
	{
	try{

		WebElement editWebEelement=new WebDriverWait(driver,5)
		.until(ExpectedConditions.visibilityOfElementLocated(allowpastduecheckbox_xpath));
		editWebEelement.click();
		////Thread.sleep(2000);	
        return true;
	}
	catch(Exception ex){
		return false;
	}
	}

public boolean allowpastduecheckboxClear()
{
try{

	WebElement editWebEelement=new WebDriverWait(driver,100)
	.until(ExpectedConditions.visibilityOfElementLocated(allowpastduecheckbox_xpath));
	editWebEelement.clear();

	//Thread.sleep(2000);//kruthivas	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    return true;
}
catch(Exception ex){
	return false;
}
}



}
	


