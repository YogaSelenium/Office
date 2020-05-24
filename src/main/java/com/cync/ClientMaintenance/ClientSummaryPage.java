package com.cync.ClientMaintenance;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.cync.base.BasePage;
																						//Author name-Garima
public class ClientSummaryPage extends BasePage{

	public ClientSummaryPage(WebDriver driver)
	 {
		super(driver);
		// TODO Auto-generated constructor stub
	    }//Author-Garima
	
private final By Clientnamesearch_xpath=By.xpath("(//input[@name='client_name'])[1]");
private final By ClientNumbersearch_xpath=By.xpath("(//input[@name='client_number'])[1]");
private final By Clientmanagersearch_xpath=By.xpath("(//select[@name='user_name'])[1]");
private final By Clientlastbbcdatesearch_xpath=By.xpath("(//input[@name='latest_bbc_date'])[1]");
private final By Clientnumberofbbcapprovesearch_xpath=By.xpath("(//input[@name='no_of_bbcs_approved'])[1]");
private final By Clientaveragemonthlyloan_xpath=By.xpath("(//input[@name='avg_monthly_loan_balance'])[1]");
private final By Creditlinesearch_xpath=By.xpath("//input[@id='gs_credit_line_amount']");
//private final By Colletralvaluesearch_xpath=By.id("gs_current_balance_amount");
private final By CurrentBalance_xpath=By.xpath("(//input[@name='current_bal'])[1]");
private final By lettetrofcreditsearch_xpath=By.xpath("(//input[@name='letter_of_credit'])[1]");
private final By Availabletoloan_xpath=By.xpath("(//input[@name='available_to_loan'])[1]");
private final By Saleregion_xpath=By.xpath("(//input[@name='sales_region_name'])[1]");
private final By Aprequired_xpath=By.xpath("//select[@name='ap_required']");
private final By Clientsetup_xpath=By.xpath("//input[@name='created_at']");
private final By Clientnameheader_xpath=By.xpath("(//th[@class='ui-th-column ui-th-ltr ui-state-default'])[3]");
private final By Clientnumberheader_xpath=By.xpath("(//th[@class='ui-th-column ui-th-ltr ui-state-default'])[4]");
private final By Clientmanager_xpath=By.xpath("(//th[@class='ui-th-column ui-th-ltr ui-state-default'])[5]");
private final By Lastbbcdate_xpath=By.xpath("(//th[@class='ui-th-column ui-th-ltr ui-state-default'])[6]");
private final By Noofbbcapprove_xapth=By.xpath("(//th[@class='ui-th-column ui-th-ltr ui-state-default'])[7]");
private final By Averagemonthlyloan_xpath=By.xpath("(//th[@class='ui-th-column ui-th-ltr ui-state-default'])[8]");
private final By Creditloan_xpath=By.xpath("(//th[@class='ui-th-column ui-th-ltr ui-state-default'])[9]");
private final By Colletralvalue_xpath=By.xpath("(//th[@class='ui-th-column ui-th-ltr ui-state-default'])[10]");
private final By Currentbalance_xpath=By.xpath("(//th[@class='ui-th-column ui-th-ltr ui-state-default'])[11]");
private final By Letterofcredit_xpath=By.xpath("(//th[@class='ui-th-column ui-th-ltr ui-state-default'])[12]");
private final By Availabletoloan_xpath1=By.xpath("(//th[@class='ui-th-column ui-th-ltr ui-state-default'])[13]");
private final By Saleregion_xpath1=By.xpath("(//th[@class='ui-th-column ui-th-ltr ui-state-default'])[14]");
private final By Aprequires_xpath1=By.xpath("(//input[@name='parameter[ap_required_flag]'])[2]");
private final By Clientselection_xpath12=By.id("jqgh_borrowers_list_created_at");
private final By CheckBox_xpath=By.xpath("(//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default'])[22]");
private final By Export_xpath=By.xpath("(//div[@class='ui-pg-div'])[2]");
private final By Basicclientname_xpath=By.xpath("//input[@name='borrower[client_name]']");
private final By searcheddata_xpath=By.xpath("//tr[@class='jqgrow ui-row-ltr ui-widget-content row-even']//td[@role='gridcell'][3]");
private final By verifyclientnumber_xpath=By.xpath("//input[@name='borrower[client_number]']");
private final By Clientnumber_xpath1=By.xpath("//input[@name='client_number'");
private final By BasicManager_xapth=By.xpath("//div[@class='multiselect']//label[@class='checkbox onlycheck multiselect-on']");
private final By Clientsummarymanager_xpath=By.xpath("(//td[text()='KRUTHIVAS_TEST'])[1]");
private final By verifybbcdate_xpath=By.xpath("//input[@name='borrower[bbc_frequency_date]']");
private final By verifylastdatefromclientsummary_xpath=By.xpath("//tr[@class='jqgrow ui-row-ltr ui-widget-content row-even']//td[@role='gridcell'][6]");
private final By bbcprocess_xpath=By.xpath("//div[@class='col-md-2']");
//private final By BBCAvailability_xpath=By.id("tab_150");
private final By BBCAvailability_xpath=By.xpath("//li[@id='tab_284' or @id='tab_150' or @id='tab_306']");
private final By BBcavablityapprove_xpath=By.xpath("//a[text()='Approve BBC']");
private final By Bbcelectroniapprove_xpath=By.id("lnk-electronic-signature");
private final By popname_xpath=By.id("signer_name");
private final By clickonagree_xpath=By.id("terms_condition");
private final By Approve_xpath=By.xpath("//button[text()='Authorize Signature and Approve BBC']");
private final By verifynamefrompopup_xpath=By.xpath("(//div[@class='controls'])[3]");
private final By closepopup_xpath=By.xpath("//div[@class='ui-dialog-titlebar ui-widget-header ui-corner-all ui-helper-clearfix']//button[@class='ui-dialog-titlebar-close']");
private final By noofbbcapprove_xpath=By.xpath("//tr[@class='jqgrow ui-row-ltr ui-widget-content row-even']//td[@role='gridcell'][8]");
private final By selectdate_Xpath=By.id("choose_bbc");
private final By creditline_xpath=By.id("limit_amount");
private final By creditlines_xpath=By.xpath("//tr[@class='jqgrow ui-row-ltr ui-widget-content row-even']//td[@role='gridcell'][11]");
private final By colletralvalue_xpath=By.xpath("//tr[@class='jqgrow ui-row-ltr ui-widget-content row-even']//td[@role='gridcell'][12]");
private final By basicscreencolletral_xpath=By.xpath("(//td[@class='numRightAlign'])[3]");
private final By BBCRecalculationProcessButton_xpath=By.xpath("//a[contains(text(),'Process/Re-Calculate BBC')]");
private final By saleregion_xpath=By.id("borrower_sales_region_id");
private final By saleedit_xpath=By.id("detail_parameter_edit");
//private final  By clientsummarysaleregion_xpath=By.xpath("//tr[@class='jqgrow ui-row-ltr ui-widget-content row-even']//td[@role='gridcell'][16]");
private final By apregion_xpath=By.xpath("(//input[@name='parameter[ap_required_flag]'])[2]");
private final By clientsummaryaprequired=By.xpath("//tr[@class='jqgrow ui-row-ltr ui-widget-content row-even']//td[@role='gridcell'][17]");
//private final By userdefinedplussymbol_xpath=By.id("New");
//private final By Udfname_xpath=By.id("udf_name");
//private final By Udfdescription_xpath=By.id("udf_description");
private final By save_xpath=By.xpath("(//span[contains(text(),'Save')])[2]");
private final By save_xpath1=By.xpath("//div[@id='save_grid']");
private final By udfmapping_xpath=By.xpath("(//div[@class='ui-radiobutton-box ui-widget ui-state-default'])[1]");
private final By udfselect_xpath=By.xpath("//select[@class='mapping-dropdown form-control ng-pristine ui-inputtext ui-corner-all ui-state-default ng-submitted ng-untouched ng-invalid']");
private final By udfprogram_xpath=By.xpath("//select[@class='mapping-dropdown form-control w-95 ng-touched ng-dirty ng-valid']");
private final By basicparameteredit_xpath=By.id("parameter_edit");
private final By basicclientsave_xpath=By.xpath("//input[@name='commit']");
private final By selectdate_xpath=By.id("borrower_bbc_frequency_date");
private final By saves_xpath=By.xpath("//div[contains(text(),'Save')]");
private final By grid_xpath=By.id("colomun_choose_action");
private final By close_path=By.xpath("//div[@id='done']");
private final By selectcheckbox_xpath=By.xpath("(//input[@name='client_number'])[2]");
private final By selectsave_xpath=By.id("save_grid");
private final By download_xpath=By.xpath("//div[@class='export']");
private final By ScrollToViewForElement_xpath=By.xpath("//td[contains(text(),'ZAO21MAR17_02_02_054465')]");
private final By Colletralvaluesearch_xpath=By.xpath("(//input[@class='ui-widget-content ui-corner-all'])[9]");
private final  By clientsummarysaleregion_xpath=By.xpath("//select[@id='borrower_sales_region_id']");
private final By userdefinedplussymbol_xpath=By.xpath("//i[@class='hand fa fa-plus fa-1x f_s_20 clr_grey ng-star-inserted' and @id='New']");
private final By Udfname_xpath=By.xpath("//input[@id='udf_name']");
private final By Udfdescription_xpath=By.xpath("//input[@id='udf_description']");
//check for client name search 
	public boolean clickonclientnamesearch() {
		try{
    	    WebElement clickonclientnamesearch = new WebDriverWait(driver,5)
    		    .until(ExpectedConditions .visibilityOfElementLocated(Clientnamesearch_xpath));
    	    clickonclientnamesearch.click();
    	    //////Thread.sleep(500);
    	    return true;
    	}
	catch (Exception ex) {
    	    return false;
    	}

	}
	
//click on client name search
	public boolean clickonclientnumbersearch() {
    	try {
    	    WebElement clickonclientnumbersearch = new WebDriverWait(driver,5)
    		    .until(ExpectedConditions .visibilityOfElementLocated(ClientNumbersearch_xpath));
    	    clickonclientnumbersearch.click();
    	    //////Thread.sleep(500);
    	    return true;
    	} catch (Exception ex) {
    	    return false;
    	}

        }
	//click on client manager search
		public boolean clickonclientmanagersearch() {
	    	try {
	    	    WebElement clickonclientmanagersearch = new WebDriverWait(driver,5)
	    		    .until(ExpectedConditions .visibilityOfElementLocated(Clientmanagersearch_xpath));
	    	    clickonclientmanagersearch.click();
	    	    //////Thread.sleep(500);
	    	    return true;
	    	} catch (Exception ex) {
	    	    return false;
	    	}

	        }
//click on last bbc data search
		public boolean clickonlastbbcsearch() {
	    	try {
	    	    WebElement clickonlastbbcsearch = new WebDriverWait(driver,5)
	    		    .until(ExpectedConditions .visibilityOfElementLocated(Clientlastbbcdatesearch_xpath));
	    	    clickonlastbbcsearch.click();
	    	    //////Thread.sleep(500);
	    	    return true;
	    	} catch (Exception ex) {
	    	    return false;
	    	}

	        }
//click on  no of bbc approve searchj		
		public boolean clickonnoofbbcapprovesearch() {
	    	try {
	    	    WebElement clickonnoofbbcapprovesearch = new WebDriverWait(driver,5)
	    		    .until(ExpectedConditions .visibilityOfElementLocated(Clientnumberofbbcapprovesearch_xpath));
	    	    clickonnoofbbcapprovesearch.click();

	    	    return true;
	    	} catch (Exception ex) {
	    	    return false;
	    	}

	        }
//click on average monthly loan search 
		public boolean clickonnoofmonthlyavergeloan() {
	    	try {
	    	    WebElement clickonnoofmonthlyavergeloan = new WebDriverWait(driver,5)
	    		    .until(ExpectedConditions .visibilityOfElementLocated(Clientaveragemonthlyloan_xpath));
	    	    clickonnoofmonthlyavergeloan.click();
	    	    //////Thread.sleep(500);
	    	    return true;
	    	} catch (Exception ex) {
	    	    return false;
	    	}

	        }
	//click on credit line search 	
		public boolean clickoncreditlinesearch() {
	    	try {
	    	    WebElement clickoncreditlinesearch = new WebDriverWait(driver,5)
	    		    .until(ExpectedConditions .visibilityOfElementLocated(Creditlinesearch_xpath));
	    	    clickoncreditlinesearch.click();
	    	    Actions action = new Actions(driver);
	    	    action.sendKeys(Keys.TAB).build().perform();
	    	    //////Thread.sleep(500);
	    	    return true;
	    	} catch (Exception ex) {
	    	    return false;
	    	}

	        }
//click on colletral search
		public boolean clickoncolletralsearch() {
	    	try {
	    		Thread.sleep(500);
	    	    WebElement clickoncolletralsearch = new WebDriverWait(driver,10)
	    		    .until(ExpectedConditions .visibilityOfElementLocated(Colletralvaluesearch_xpath));
	    	    clickoncolletralsearch.click();
	    	    /*Actions action = new Actions(driver);
	    	    action.sendKeys(Keys.TAB).build().perform();*/
	    	   
	    	    return true;
	    	} catch (Exception ex) {
	    	    return false;
	    	}

	        }
//click on  current balance
		public boolean clickoncurrentbalancesearch() {
	    	try {
	    	    WebElement clickoncurrentbalancesearch = new WebDriverWait(driver,5)
	    		    .until(ExpectedConditions .visibilityOfElementLocated(CurrentBalance_xpath));
	    	    clickoncurrentbalancesearch.click();
	    	    Actions action = new Actions(driver);
	    	    action.sendKeys(Keys.TAB).build().perform();
	    	    //////Thread.sleep(500);
	    	    return true;
	    	} catch (Exception ex) {
	    	    return false;
	    	}

	        }
//click on letter of credit
		public boolean clickonletterofcreditsearch() {
	    	try {
	    	    WebElement clickonletterofcreditsearch = new WebDriverWait(driver,5)
	    		    .until(ExpectedConditions .visibilityOfElementLocated(lettetrofcreditsearch_xpath));
	    	    clickonletterofcreditsearch.click();
	    	    //////Thread.sleep(500);
	    	    return true;
	    	} catch (Exception ex) {
	    	    return false;
	    	}

	        }
//click on available to loan
		public boolean clickonavailabletoloansearch() {
	    	try {
	    	    WebElement clickonavailabletoloansearch = new WebDriverWait(driver,5)
	    		    .until(ExpectedConditions .visibilityOfElementLocated(Availabletoloan_xpath));
	    	    clickonavailabletoloansearch.click();
	    	    //////Thread.sleep(500);
	    	    return true;
	    	} catch (Exception ex) {
	    	    return false;
	    	}

	        }
//click on sale region search
		public boolean clickonsaleregionsearch() {
	    	try {
	    	    WebElement clickonsaleregionsearch = new WebDriverWait(driver,5)
	    		    .until(ExpectedConditions .visibilityOfElementLocated(Saleregion_xpath));
	    	    clickonsaleregionsearch.click();
	    	    //////Thread.sleep(500);
	    	    return true;
	    	} catch (Exception ex) {
	    	    return false;
	    	}

	        }
//click on ap required search
		public boolean clickonsaprequiredsearch() {
	    	try {
	    	    WebElement clickonsaprequiredsearch = new WebDriverWait(driver,5)
	    		    .until(ExpectedConditions .visibilityOfElementLocated(Aprequired_xpath));
	    	    clickonsaprequiredsearch.click();
	    	    //////Thread.sleep(500);
	    	    return true;
	    	} catch (Exception ex) {
	    	    return false;
	    	}

	        }
//click on client set up
		public boolean clickonclientsetupsearch() {
	    	try {
	    	    WebElement clickonclientsetupsearch = new WebDriverWait(driver,5)
	    		    .until(ExpectedConditions .visibilityOfElementLocated(Clientsetup_xpath));
	    	    clickonclientsetupsearch.click();
	    	    //////Thread.sleep(500);
	    	    return true;
	    	} catch (Exception ex) {
	    	    return false;
	    	}

	        }
	//click on client name
		public boolean clickonclientname() {
	    	try {
	    	    WebElement clickonclientname = new WebDriverWait(driver,5)
	    		    .until(ExpectedConditions .visibilityOfElementLocated(Clientnameheader_xpath));
	    	    clickonclientname.isDisplayed();
	    	    //////Thread.sleep(500);
	    	    return true;
	    	} catch (Exception ex) {
	    	    return false;
	    	}

	        }
//click on client no
		public boolean clickonclientnumber() {
	    	try {
	    	    WebElement clickonclientnumber = new WebDriverWait(driver,10)
	    		    .until(ExpectedConditions .visibilityOfElementLocated(Clientnumberheader_xpath));
	    	    clickonclientnumber.isDisplayed();
	    	    //////Thread.sleep(500);
	    	    return true;
	    	} catch (Exception ex) {
	    	    return false;
	    	}

	        }
	// click on client manager
		public boolean clickonclientmanager() {
	    	try {
	    	    WebElement clickonclientmanager = new WebDriverWait(driver,10)
	    		    .until(ExpectedConditions .visibilityOfElementLocated(Clientnumberheader_xpath));
	    	    clickonclientmanager.isDisplayed();
	    	    //////Thread.sleep(500);
	    	    return true;
	    	} catch (Exception ex) {
	    	    return false;
	    	}

	        }
	//click on lastbbc date
		public boolean clickonlastbbc() {
	    	try {
	    	    WebElement clickonlastbbc = new WebDriverWait(driver,10)
	    		    .until(ExpectedConditions .visibilityOfElementLocated(Lastbbcdate_xpath));
	    	    clickonlastbbc.isDisplayed();
	    	    //////Thread.sleep(500);
	    	    return true;
	    	} catch (Exception ex) {
	    	    return false;
	    	}

	        }
// click on no of bbc approve
		public boolean clickonnumberofbbcapprove() {
	    	try {
	    	    WebElement clickonnumberofbbcapprove = new WebDriverWait(driver,10)
	    		    .until(ExpectedConditions .visibilityOfElementLocated(Noofbbcapprove_xapth));
	    	    clickonnumberofbbcapprove.isDisplayed();
	    	    //////Thread.sleep(500);
	    	    return true;
	    	} catch (Exception ex) {
	    	    return false;
	    	}

	        }
// click on average monthly loan
		public boolean clickonaveragemonthlyload() {
	    	try {
	    	    WebElement clickonaveragemonthlyload = new WebDriverWait(driver,10)
	    		    .until(ExpectedConditions .visibilityOfElementLocated(Averagemonthlyloan_xpath));
	    	    clickonaveragemonthlyload.isDisplayed();
	    	    //////Thread.sleep(500);
	    	    return true;
	    	} catch (Exception ex) {
	    	    return false;
	    	}

	        }
// click on credit line
		public boolean clickoncreditloan() {
	    	try {
	    	    WebElement clickoncreditloan = new WebDriverWait(driver,10)
	    		    .until(ExpectedConditions .visibilityOfElementLocated(Creditloan_xpath));
	    	    clickoncreditloan.isDisplayed();
	    	    Actions action = new Actions(driver);
	    	    action.sendKeys(Keys.TAB).build().perform();
	    	    //////Thread.sleep(500);
	    	    //////Thread.sleep(500);
	    	    return true;
	    	} catch (Exception ex) {
	    	    return false;
	    	}

	        }
// click on colletral valuer
		public boolean clickoncolletralvalue() {
	    	try {
	    	    WebElement clickoncolletralvalue = new WebDriverWait(driver,10)
	    		    .until(ExpectedConditions .visibilityOfElementLocated(Colletralvalue_xpath));
	    	    clickoncolletralvalue.isDisplayed();
	    	    
	    	    //////Thread.sleep(500);
	    	    return true;
	    	} catch (Exception ex) {
	    	    return false;
	    	}

	        }
//click on current balance
		public boolean clickoncurrentbalance() {
	    	try {
	    	    WebElement clickoncurrentbalance = new WebDriverWait(driver,10)
	    		    .until(ExpectedConditions .visibilityOfElementLocated(Currentbalance_xpath));
	    	    clickoncurrentbalance.isDisplayed();
	    	    
	    	    //////Thread.sleep(500);
	    	    return true;
	    	} catch (Exception ex) {
	    	    return false;
	    	}}
//click on letterof crwedit
	    	public boolean clickonletterofcredit() {
		    	try {
		    	    WebElement clickonletterofcredit = new WebDriverWait(driver,10)
		    		    .until(ExpectedConditions .visibilityOfElementLocated(Letterofcredit_xpath));
		    	    clickonletterofcredit.isDisplayed();
		    	   
		    	    //////Thread.sleep(500);
		    	    return true;
		    	} catch (Exception ex) {
		    	    return false;
		    	}
	    	}
		        
// click on available to loan
		    	public boolean clickonavailabletoloan() {
			    	try {
			    	    WebElement clickonavailabletoloan = new WebDriverWait(driver,10)
			    		    .until(ExpectedConditions .visibilityOfElementLocated(Availabletoloan_xpath1));
			    	    clickonavailabletoloan.isDisplayed();
			    	    
			    	    //////Thread.sleep(500);
			    	    return true;
			    	} catch (Exception ex) {
			    	    return false;
			    	}
		    	}
//click on sale region
		    	public boolean clickonsaleregion() {
			    	try {
			    	    WebElement clickonsaleregion = new WebDriverWait(driver,10)
			    		    .until(ExpectedConditions .visibilityOfElementLocated(Saleregion_xpath1));
			    	    clickonsaleregion.isDisplayed();
			    	    
			    	    //////Thread.sleep(500);
			    	    return true;
			    	} catch (Exception ex) {
			    	    return false;
			    	}
		    	}
// click on ap required
		    	public boolean clickonaprequired() {
			    	try {
			    	    WebElement clickonaprequired = new WebDriverWait(driver,10)
			    		    .until(ExpectedConditions .visibilityOfElementLocated(Aprequires_xpath1));
			    	    clickonaprequired.click();
			    	   return true;
			    	} catch (Exception ex) {
			    	    return false;
			    	}
		    	}
		    	//get data from client ap required
		    	public boolean getaprequired()
		    	{
		    		  try{
		    			  WebElement verifycolletralvalue=new WebDriverWait(driver,10)
		    			  .until(ExpectedConditions.visibilityOfElementLocated(clientsummaryaprequired));
		    			 String valueclient= verifycolletralvalue.getText();

		    			  Thread.sleep(4000);

		    		  return true;
		    		  }
		    	catch(Exception ex){
		    			return false;
		    		}
		    	}
		    	//verify data
		    	public String verifyaprequired(String data)
		    	{
		    	try{
		    	WebElement SaveWebEelement=new WebDriverWait(driver,10)
		    	.until(ExpectedConditions.visibilityOfElementLocated(clientsummaryaprequired));

		    	String actualMsg= SaveWebEelement.getText();
		    	if(actualMsg.equalsIgnoreCase(data))
		    	{
		    	return actualMsg;
		    	}

		    	}
		    	catch(Exception ex){

		    	}
		    	return data;
		    	}

// click on client selection
		    	public boolean clickonclientselection() {
			    	try {
			    	    WebElement clickonclientselection = new WebDriverWait(driver,10)
			    		    .until(ExpectedConditions .visibilityOfElementLocated(Clientselection_xpath12));
			    	    clickonclientselection.isDisplayed();
			    	    
			    	    //////Thread.sleep(500);
			    	    return true;
			    	} catch (Exception ex) {
			    	    return false;
			    	}
		    	}
		    	
// method for scrollbar
		    	public boolean clickonexport()
		    	{
		    		  try{
		    			  WebElement clickonexport=new WebDriverWait(driver,10)
		    			  .until(ExpectedConditions.visibilityOfElementLocated(Export_xpath));
		    			  clickonexport.click();
		    			  //////Thread.sleep(4000);
		    		  return true;
		    		  }
		    	catch(Exception ex){
		    			return false;
		    		}
		    	}
		    	//click on download
		    	public boolean clickondownload()
		    	{
		    		  try{
		    			  WebElement clickonexport=new WebDriverWait(driver,10)
		    			  .until(ExpectedConditions.visibilityOfElementLocated(download_xpath));
		    			  clickonexport.click();
		    			  //////Thread.sleep(4000);
		    		  return true;
		    		  }
		    	catch(Exception ex){
		    			return false;
		    		}
		    	}
		    	
		    	//get data from basic client
		    	public boolean getdatafrombasicclient()
		    	{
		    		  try{
		    			  WebElement getdatafrombasicclient=new WebDriverWait(driver,10)
		    			  .until(ExpectedConditions.visibilityOfElementLocated(Basicclientname_xpath));
		    			 String valueclient= getdatafrombasicclient.getAttribute("value");
		    			
		    			  //////Thread.sleep(4000);
		    		  return true;
		    		  }
		    	catch(Exception ex){
		    			return false;
		    		}
		    	}
		    	//search data in clent summary
		    	public String clickonclientnamesearch1(String data) {
		        	try {
		        	    WebElement clickonclientnamesearch1 = new WebDriverWait(driver,10)
		        		    .until(ExpectedConditions .visibilityOfElementLocated(Clientnamesearch_xpath));
		        	    clickonclientnamesearch1.click();
		        	    clickonclientnamesearch1.sendKeys(data);
		        	    
		        	    //////Thread.sleep(500);
		        	    
		        	} catch (Exception ex) {
		        	 
		        	}
return data;
		            }
		    	//verify data
		    	public String verifyData(String data1)
			    {
			    try{
			       WebElement SaveWebEelement=new WebDriverWait(driver,10)
			       .until(ExpectedConditions.visibilityOfElementLocated(Basicclientname_xpath));
			       
			      String actualMsg= SaveWebEelement.getText();
			      if(actualMsg.equalsIgnoreCase(data1))
			      {
			       return actualMsg;
			      }
			       
			    }
			    catch(Exception ex){
			     
			    }
			 return data1;
			    }	
				


//get data from basic client
public boolean getdatafromclientnumberfrombasicclientscreen()
{
	  try{
		  WebElement getdatafrombasicclient=new WebDriverWait(driver,10)
		  .until(ExpectedConditions.visibilityOfElementLocated(verifyclientnumber_xpath));
		 String valueclient= getdatafrombasicclient.getAttribute("value");
		
		  //////Thread.sleep(4000);
	  return true;
	  }
catch(Exception ex){
		return false;
	}
}
//click on client summary client number
public String clickonclientnumbersearch1(String data) {
	try {
	    WebElement clickonclientnumbersearch = new WebDriverWait(driver,10)
		    .until(ExpectedConditions .visibilityOfElementLocated(ClientNumbersearch_xpath));
	    clickonclientnumbersearch.click();
	    clickonclientnumbersearch.sendKeys(data);
	    //////Thread.sleep(500);
	 
	} catch (Exception ex) {
	    
	}
return data;
    }


//verify data
public String verifyData1(String data)
{
try{
   WebElement SaveWebEelement=new WebDriverWait(driver,10)
   .until(ExpectedConditions.visibilityOfElementLocated(verifyclientnumber_xpath));
   
  String actualMsg= SaveWebEelement.getText();
  if(actualMsg.equalsIgnoreCase(data))
  {
   return actualMsg;
  }
   
}
catch(Exception ex){
 
}
return data;
}
//verify data from basic client manager
public boolean getdatafrommanagerfrombasicclientscreen()
{
	  try{
		  WebElement getdatafrombasicclient=new WebDriverWait(driver,10)
		  .until(ExpectedConditions.visibilityOfElementLocated(BasicManager_xapth));
		 String valueclient= getdatafrombasicclient.getAttribute("value");
		
		  //////Thread.sleep(4000);
	  return true;
	  }
catch(Exception ex){
		return false;
	}
}
public boolean verifydatafrommanager()
{
	  try{
		  WebElement getdatafrombasicclient=new WebDriverWait(driver,10)
		  .until(ExpectedConditions.visibilityOfElementLocated(Clientsummarymanager_xpath));
		 String valueclient= getdatafrombasicclient.getText();
		
		  //////Thread.sleep(4000);
	  return true;
	  }
catch(Exception ex){
		return false;
	}
}
//verify data for master
public String verifyDataformaster(String data)
{
try{
   WebElement SaveWebEelement=new WebDriverWait(driver,10)
   .until(ExpectedConditions.visibilityOfElementLocated(BasicManager_xapth));
   
  String actualMsg= SaveWebEelement.getText();
  if(actualMsg.equalsIgnoreCase(data))
  {
   return actualMsg;
  }
   
}
catch(Exception ex){
 
}
return data;
}
//check date from basic client
public boolean getdatafrombbddatefrombasicclientscreen()
{
	  try{
		  WebElement getdatafrombasicclient=new WebDriverWait(driver,10)
		  .until(ExpectedConditions.visibilityOfElementLocated(verifybbcdate_xpath));
		 String valueclient= getdatafrombasicclient.getAttribute("value");
		
		  //////Thread.sleep(4000);
	  return true;
	  }
catch(Exception ex){
		return false;
	}
}
/*public String clickonlastbbcsearchs(String data) {
	try {
	    WebElement clickonlastbbcsearch = new WebDriverWait(driver,10)
		    .until(ExpectedConditions .visibilityOfElementLocated(Clientlastbbcdatesearch_xpath));
	    clickonlastbbcsearch.click();
	    clickonlastbbcsearch.sendKeys(data);
	    //////Thread.sleep(500);
	  
	} catch (Exception ex) {
	    
	}
return data;
    }*/

//verify last date from client summary
public boolean verifylastdatefromclientsummary()
{
	  try{
		  WebElement getdatafrombasicclient=new WebDriverWait(driver,10)
		  .until(ExpectedConditions.visibilityOfElementLocated(verifylastdatefromclientsummary_xpath));
		 String valueclient= getdatafrombasicclient.getText();
		
		  //////Thread.sleep(4000);
	  return true;
	  }
catch(Exception ex){
		return false;
	}
}
//verify bbc date from client summary and basic client screen
//verify data for master
public String verifylastbbcdate(String data)
{
try{
 WebElement SaveWebEelement=new WebDriverWait(driver,10)
 .until(ExpectedConditions.visibilityOfElementLocated(verifylastdatefromclientsummary_xpath));
 
String actualMsg= SaveWebEelement.getText();
if(actualMsg.equalsIgnoreCase(data))
{
 return actualMsg;
}
 
}
catch(Exception ex){

}
return data;
}
//click on bbc recalculation
public boolean clickonrecalculatebbc()
{
try{
WebElement bbc =new WebDriverWait(driver,200)
.until(ExpectedConditions.visibilityOfElementLocated(bbcprocess_xpath));
bbc.click();
//////Thread.sleep(2000);

return true;
}
catch(Exception ex){

}
return false;


}
//click on bbcavablity
public boolean clickonbbcavablity()
{
try{
	Thread.sleep(500);
WebElement bbcavablity =new WebDriverWait(driver,10)
.until(ExpectedConditions.visibilityOfElementLocated(BBCAvailability_xpath));
bbcavablity.click();


return true;
}
catch(Exception ex){

}
return false;
}
//click on bbcavablity approve
	 public boolean selectbbcavablityapprove() {
	    	try {
	    	    WebElement bbcavablityapprove = new WebDriverWait(driver, 10)
	    		    .until(ExpectedConditions
	    			    .visibilityOfElementLocated(BBcavablityapprove_xpath));
	    	    bbcavablityapprove.click();
	    	    //////Thread.sleep(10000);
	    	    return true;
	    	} catch (Exception ex) {
	    	    return false;
	    	}

	        }
	 //click on bbc electronic signature

		 public boolean clickonelectronicsignature() {
		    	try {
		    	    WebElement bbcavablityapprove = new WebDriverWait(driver, 10)
		    		    .until(ExpectedConditions
		    			    .visibilityOfElementLocated(Bbcelectroniapprove_xpath));
		    	    bbcavablityapprove.click();
		    	    //////Thread.sleep(10000);
		    	    return true;
		    	} catch (Exception ex) {
		    	    return false;
		    	}

		        }
// enter name in pop up field
		 public String enterdetailinpopup(String data) {
				try {
				    WebElement enterdetailinpopup = new WebDriverWait(driver,10)
					    .until(ExpectedConditions .visibilityOfElementLocated(popname_xpath));
				    enterdetailinpopup.click();
				    enterdetailinpopup.sendKeys(data);
				    //////Thread.sleep(500);
				 
				} catch (Exception ex) {
				    
				}
			return data;
			    }


//click on i agree
public boolean clickoniagree() {
	try {
	    WebElement bbcavablityapprove = new WebDriverWait(driver, 10)
		    .until(ExpectedConditions
			    .visibilityOfElementLocated(clickonagree_xpath));
	    bbcavablityapprove.click();
	    //////Thread.sleep(10000);
	    return true;
	} catch (Exception ex) {
	    return false;
	}

    }
// click on approve
public boolean clickonapprove() {
	try {
	    WebElement bbcavablityapprove = new WebDriverWait(driver, 10)
		    .until(ExpectedConditions
			    .visibilityOfElementLocated(Approve_xpath));
	    bbcavablityapprove.click();
	    //////Thread.sleep(10000);
	    return true;
	} catch (Exception ex) {
	    return false;
	}

    }
//verify name from popup
public boolean verifynamefrompopup()
{
	  try{
		  WebElement verifynamefrompopup=new WebDriverWait(driver,10)
		  .until(ExpectedConditions.visibilityOfElementLocated(verifynamefrompopup_xpath));
		 String valueclient= verifynamefrompopup.getText();
		
		  //////Thread.sleep(4000);
	  return true;
	  }
catch(Exception ex){
		return false;
	}
}
//click on close 
//click on approve
public boolean clickonclose() {
	try {
	    WebElement clickonclose = new WebDriverWait(driver, 10)
		    .until(ExpectedConditions
			    .visibilityOfElementLocated(closepopup_xpath));
	    clickonclose.click();
	    //////Thread.sleep(10000);
	    return true;
	} catch (Exception ex) {
	    return false;
	}

 }
//verify data
public String verifyapprovername(String data)
{
try{
 WebElement SaveWebEelement=new WebDriverWait(driver,10)
 .until(ExpectedConditions.visibilityOfElementLocated(verifynamefrompopup_xpath));
 
String actualMsg= SaveWebEelement.getText();
if(actualMsg.equalsIgnoreCase(data))
{
 return actualMsg;
}
 
}
catch(Exception ex){

}
return data;
}
//verify number of bbc approve
public boolean verifynumofbbcapprove()
{
	  try{
		  WebElement verifynumofbbcapprove=new WebDriverWait(driver,10) .until(ExpectedConditions.visibilityOfElementLocated(noofbbcapprove_xpath));
		  Thread.sleep(1000);
		 String valueclient= verifynumofbbcapprove.getText();
		
		
	  return true;
	  }
catch(Exception ex){
		return false;
	}
}
//select date
public boolean clickonselectdate()
{
	  try{
		  WebElement verifynumofbbcapprove=new WebDriverWait(driver,10)
		  .until(ExpectedConditions.visibilityOfElementLocated(selectdate_Xpath));
		  verifynumofbbcapprove.click();
		 
		
		  //////Thread.sleep(4000);
	  return true;
	  }
catch(Exception ex){
		return false;
	}
}
//verify data
public String verifynumberofbbcapproves(String data)
{
try{
WebElement SaveWebEelement=new WebDriverWait(driver,10)
.until(ExpectedConditions.visibilityOfElementLocated(noofbbcapprove_xpath));

String actualMsg= SaveWebEelement.getText();
if(actualMsg.equalsIgnoreCase(data))
{
return actualMsg;
}

}
catch(Exception ex){

}
return data;
}
//click on credit line
//check date from basic client
public boolean getcreditlinedetail()
{
	  try{
		  WebElement getdatafrombasicclient=new WebDriverWait(driver,10)
		  .until(ExpectedConditions.visibilityOfElementLocated(creditline_xpath));
		 String valueclient= getdatafrombasicclient.getAttribute("value");
		
		  //////Thread.sleep(4000);
	  return true;
	  }
catch(Exception ex){
		return false;
	}
}
//verify data from creditline
public boolean verifycreditline()
{
	  try{
		  WebElement verifynumofbbcapprove=new WebDriverWait(driver,10)
		  .until(ExpectedConditions.visibilityOfElementLocated(creditlines_xpath));
		 String valueclient= verifynumofbbcapprove.getText();
		
		  //////Thread.sleep(4000);
	  return true;
	  }
catch(Exception ex){
		return false;
	}
}
//verify data
//verify data
public String verifdataofcreditline(String data)
{
try{
WebElement SaveWebEelement=new WebDriverWait(driver,10)
.until(ExpectedConditions.visibilityOfElementLocated(creditline_xpath));

String actualMsg= SaveWebEelement.getText();
if(actualMsg.equalsIgnoreCase(data))
{
return actualMsg;
}

}
catch(Exception ex){

}
return data;
}
//verify data from colletral value
//verify data from creditline
public boolean verifycolletralvalue()
{
	  try{
		  WebElement verifycolletralvalue=new WebDriverWait(driver,10)
		  .until(ExpectedConditions.visibilityOfElementLocated(colletralvalue_xpath));
		 String valueclient= verifycolletralvalue.getText();
		
		  //////Thread.sleep(4000);
	  return true;
	  }
catch(Exception ex){
		return false;
	}
}
//verify recivable colletral from basic client screen
public boolean getcolletralvalue()
{
	  try{
		  WebElement getcolletralvalue=new WebDriverWait(driver,10)
		  .until(ExpectedConditions.visibilityOfElementLocated(basicscreencolletral_xpath));
		 String valueclient= getcolletralvalue.getAttribute("value");
		
		  //////Thread.sleep(4000);
	  return true;
	  }
catch(Exception ex){
		return false;
	}
}
//verify data
public String verifdataofcolletralvalue(String data)
{
try{
WebElement SaveWebEelement=new WebDriverWait(driver,10)
.until(ExpectedConditions.visibilityOfElementLocated(colletralvalue_xpath));

String actualMsg= SaveWebEelement.getText();
if(actualMsg.equalsIgnoreCase(data))
{
return actualMsg;
}

}
catch(Exception ex){

}
return data;
}

public  boolean clickOnProcessButton() {
	 try {
		  WebElement IneligibleCalculationPageWebElement = new WebDriverWait(driver, 40)
		 .until(ExpectedConditions.elementToBeClickable(BBCRecalculationProcessButton_xpath));
		 IneligibleCalculationPageWebElement.click();
		 
		 Alert simpleAlert = driver.switchTo().alert();
		 simpleAlert.accept();
		 //////Thread.sleep(1000);
		 
		 return true;
		 }
	 
catch (Exception ex) {
 return false;
				}

}
//get dat from sale region
public boolean getsaleregion()
{
	  try{
		  WebElement getcolletralvalue=new WebDriverWait(driver,10)
		  .until(ExpectedConditions.visibilityOfElementLocated(saleregion_xpath));
		 String getsaleregion= getcolletralvalue.getAttribute("value");
		
		  //////Thread.sleep(4000);
	  return true;
	  }
catch(Exception ex){
		return false;
	}
}
//click on click
public boolean clickonedit() {
	try {
	    WebElement bbcavablityapprove = new WebDriverWait(driver, 10)
		    .until(ExpectedConditions
			    .visibilityOfElementLocated(saleedit_xpath));
	    bbcavablityapprove.click();
	    //////Thread.sleep(10000);
	    return true;
	} catch (Exception ex) {
	    return false;
	}

 }
//verify data from sale region client summary page
public boolean verifyclientsummarysaleregion()
{
	  try{
		  Thread.sleep(500);
		  WebElement verifycolletralvalue=new WebDriverWait(driver,10)
		  .until(ExpectedConditions.visibilityOfElementLocated(clientsummarysaleregion_xpath));
		 String valueclient= verifycolletralvalue.getText();
		
		  //////Thread.sleep(4000);
	  return true;
	  }
catch(Exception ex){
		return false;
	}
}
//verify data
public String verifdataofsaleregion(String data)
{
try{
WebElement SaveWebEelement=new WebDriverWait(driver,10)
.until(ExpectedConditions.visibilityOfElementLocated(clientsummarysaleregion_xpath));

String actualMsg= SaveWebEelement.getText();
if(actualMsg.equalsIgnoreCase(data))
{
return actualMsg;
}

}
catch(Exception ex){

}
return data;
}
//click on plus symbol
public boolean clickonplussymbol() {
	try {
		Thread.sleep(1000);
	    WebElement clickonplussymblo = new WebDriverWait(driver,10)
		    .until(ExpectedConditions.visibilityOfElementLocated(userdefinedplussymbol_xpath));
	       Thread.sleep(1000);
	       clickonplussymblo.click();
	    
	   
	    return true;
	} catch (Exception ex) {
	    return false;
	}

    }
//send data in udf name
public String clickonudfname(String data) {
	try {
	    WebElement clickonudfname = new WebDriverWait(driver,10)
		    .until(ExpectedConditions .visibilityOfElementLocated(Udfname_xpath));
	    Thread.sleep(500);
	    clickonudfname.click();
	    clickonudfname.sendKeys(data);
	    
	    //////Thread.sleep(500);
	    
	} catch (Exception ex) {
	 
	}
	return data;
}
//send data in udf description
public String clickonudfdescription(String data) {
	try {
	    WebElement clickonudfname = new WebDriverWait(driver,10)
		    .until(ExpectedConditions .visibilityOfElementLocated(Udfdescription_xpath));
	    Thread.sleep(500);
	    clickonudfname.click();
	    clickonudfname.sendKeys(data);
	    
	    //////Thread.sleep(500);
	    
	} catch (Exception ex) {
	 
	}
	return data;
}
//click on save
public boolean clickonsave() {
	try{
	    WebElement clickonsave = new WebDriverWait(driver,10)
		    .until(ExpectedConditions .visibilityOfElementLocated(save_xpath));
	    clickonsave.click();
	    //////Thread.sleep(5000);
	    return true;
	}
catch (Exception ex) {
	    return false;
	}

}

//Verify save


public boolean verifySave() {
	try{
	    WebElement clickonsave = new WebDriverWait(driver,10)
		    .until(ExpectedConditions .visibilityOfElementLocated(save_xpath1));
	    clickonsave.isDisplayed();
	    
	    return true;
	}
catch (Exception ex) {
	    return false;
	}

}
//click on ufdmapping
public boolean clickOnUdfmapping() {
	try{
	    WebElement clickOnUdfmapping = new WebDriverWait(driver,10)
		    .until(ExpectedConditions .visibilityOfElementLocated(udfmapping_xpath));
	    clickOnUdfmapping.click();
	    //////Thread.sleep(6000);
	    return true;
	}
catch (Exception ex) {
	    return false;
	}

}
//select data from udf select
public String UdfSelect(String option) throws InterruptedException{
	

	WebDriverWait wait = new WebDriverWait(driver, 60);
	wait.until(ExpectedConditions.visibilityOfElementLocated((udfselect_xpath)));
	
	WebElement element = driver.findElement((udfselect_xpath));
	Select sel = new Select(element);
	List<WebElement> list = sel.getOptions();	
	
	
	for(WebElement ele : list){
		
		if(ele.getText().equals(option)){
			ele.click();
			//////Thread.sleep(10000);
			break;
		}
	}
	return option;

}

//click on edit
public boolean clickOnEdit() {
	try{
	    WebElement clickOnUdfmapping = new WebDriverWait(driver,10)
		    .until(ExpectedConditions .visibilityOfElementLocated(basicparameteredit_xpath));
	    clickOnUdfmapping.click();
	    //////Thread.sleep(500);
	    return true;
	}
catch (Exception ex) {
	    return false;
	}

}
//click on savwe
public boolean clickOnSave() {
	try{
	    WebElement clickOnSave = new WebDriverWait(driver,10)
		    .until(ExpectedConditions .visibilityOfElementLocated( basicclientsave_xpath));
	    clickOnSave.click();
	    //////Thread.sleep(500);
	    return true;
	}
catch (Exception ex) {
	    return false;
	}

}
//click on ufdmapping
public boolean clickOnselect() {
	try{
	    WebElement clickOnselect = new WebDriverWait(driver,10)
		    .until(ExpectedConditions .visibilityOfElementLocated(udfselect_xpath));
	    clickOnselect.click();
	    //////Thread.sleep(4000);
	    return true;
	}
catch (Exception ex) {
	    return false;
	}

}
public  boolean ClickonSelect(String option ) {
	try {
		/*this.openDebtors();*/
		
		WebElement DropdownWebEelement = new WebDriverWait(driver, 10)
		.until(ExpectedConditions.visibilityOfElementLocated(udfselect_xpath));
		DropdownWebEelement.click();
		Select sel = new Select(DropdownWebEelement);
		
		List<WebElement> list = sel.getOptions();
		
		for (WebElement ele : list) 
		{
			String data = ele.getText();
			System.out.println(data);
			
			if (data.equalsIgnoreCase(option))
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
public  boolean ClickOnProgram(String options ) {
	try {
		/*this.openDebtors();*/
		
		WebElement ClickOnProgram = new WebDriverWait(driver, 10)
		.until(ExpectedConditions.visibilityOfElementLocated(udfprogram_xpath));
		ClickOnProgram.click();
		Select sel = new Select(ClickOnProgram);
		List<WebElement> list = sel.getOptions();
		
		for (WebElement ele : list) 
		{
			String data = ele.getText();
			System.out.println(data);
			
			if (data.equalsIgnoreCase(options))
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
//select date
//click on client summary client number
public String clickonselectdate(String data) {
	try {
	    WebElement clickonselectdate = new WebDriverWait(driver,10)
		    .until(ExpectedConditions .visibilityOfElementLocated(selectdate_xpath));
	    clickonselectdate.click();
	    clickonselectdate.clear();
	    //////Thread.sleep(500);
	    clickonselectdate.sendKeys(data);
	   
	 
	} catch (Exception ex) {
	    
	}
return data;
  }
//click on save
public boolean clickonsaves() {
	try{
	    WebElement clickonclientnamesearch = new WebDriverWait(driver,10)
		    .until(ExpectedConditions .visibilityOfElementLocated(saves_xpath));
	    clickonclientnamesearch.click();
	    //////Thread.sleep(500);
	    return true;
	}
catch (Exception ex) {
	    return false;
	}

}
//click on grid
public boolean clickongrid() {
	try{
	    WebElement clickongrid = new WebDriverWait(driver,10)
		    .until(ExpectedConditions .visibilityOfElementLocated(grid_xpath));
	    clickongrid.click();
	   System.out.println(clickongrid.getText());
	    
	    //////Thread.sleep(500);
	    return true;
	}
catch (Exception ex) {
	    return false;
	}

}
//click on close
public boolean clickoncloses() {
	try{
	    WebElement clickonclientnamesearch = new WebDriverWait(driver,10)
		    .until(ExpectedConditions .visibilityOfElementLocated(close_path));
	    clickonclientnamesearch.click();
	    //////Thread.sleep(500);
	    return true;
	}
catch (Exception ex) {
	    return false;
	}

}
//select check box
public boolean clickoncheckbox() {
	try{
	    WebElement clickonclientnamesearch = new WebDriverWait(driver,10)
		    .until(ExpectedConditions .visibilityOfElementLocated(selectcheckbox_xpath));
	    clickonclientnamesearch.click();
	    //////Thread.sleep(500);
	    return true;
	}
catch (Exception ex) {
	    return false;
	}

}
//select save
public boolean clickonsavebutton() {
	try{
	    WebElement clickonclientnamesearch = new WebDriverWait(driver,10)
		    .until(ExpectedConditions .visibilityOfElementLocated(selectsave_xpath));
	    clickonclientnamesearch.click();
	    //////Thread.sleep(500);
	    return true;
	}
catch (Exception ex) {
	    return false;
	}

}
public boolean scrollToViewExport()
{
	try{
		 WebElement actual1=new WebDriverWait(driver,10)
		 .until(ExpectedConditions.visibilityOfElementLocated(ScrollToViewForElement_xpath));
		JavascriptExecutor jse1 = (JavascriptExecutor)driver;;
		jse1.executeScript("arguments[0].scrollIntoView(true);", actual1);  		

        Thread.sleep(500);

        return true;
		
	}
	catch(Exception e){
		
	}
	return false;
	
	}
}
		    	