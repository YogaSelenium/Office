package com.cync.ClientMaintenance;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.cync.base.BasePage;
																							//Author name-Garima
public class SeasonalAdvancedRate extends BasePage {

	public SeasonalAdvancedRate(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	    }

	private final By DivisioncodeDropdown_xpath = By
			.xpath("//select[@name='seasonal_advance_rate[division_id]']");
	private final By ColletralDropDown_xpath = By
			.xpath("//td[@role='gridcell'][3]//select[@role='select']");
	private final By MainColletral_xpath = By
			.xpath("//td[@class='ui-search-input']//select[@name='collateral_advance_rate_id']");
	private final By mainAsOFDate_xpath = By
			.xpath("//td[@class='ui-search-input']//input[@name='as_of_date']");
	private final By AsOfDate_xpath = By
			.xpath("//td[@role='gridcell'][4]//input[@name='as_of_date']");
	private final By Addicon_xpath = By
			.xpath("//td[@class='ui-pg-button ui-corner-all'][4]");
	private final By Sublimit_xpath = By
			.xpath("//td[@role='gridcell'][5]//input[@role='textbox']");
	private final By Save_xpath = By
			.xpath("//td[@class='ui-pg-button ui-corner-all'][5]//div[@class='ui-pg-div']");
	private final By Novl_xpath = By
			.xpath("//td[@role='gridcell'][6]//input[@name='nolv_value']");
	private final By LvtAdvance_xpath = By
			.xpath("//td[@role='gridcell'][7]//input[@name='advance_rate']");
	private final By AdjustedAdvanceRate_xpath = By
			.id("gs_adjusted_advance_rate");
	private final By LowValue_xpath = By
			.xpath("//td[@role='gridcell'][9]//input[@name='low_value']");
	private final By highVale_xpath = By
			.xpath("//td[@role='gridcell'][10]//input[@name='high_value']");
	private final By Basedon_xpath = By.id("gs_sublimit_based_on");
	private final By nextbaseon_xpath = By
			.xpath("//td[@role='gridcell'][11]//select[@name='sublimit_based_on']");
	private final By CalculatedCapBy_xpath = By
			.xpath("//select[@id='gs_collateral_advance_rate_id']");

	private final By MaxCap_xpath = By
			.xpath("//td[@role='gridcell'][13]//input[@name='sublimit_max_cap_pct']");
	private final By Delete_xpath = By
			.xpath("//td[@class='ui-pg-button ui-corner-all'][1]//span[@class='ui-icon ui-icon-trash']");
	private final By Reload_xpath = By
			.xpath("//span[@class='ui-icon ui-icon-refresh']");
	private final By cancle_xpath = By
			.xpath("//span[@class='ui-icon ui-icon ui-icon-cancel']");
	private final By Search_xpath = By.id("search_seasonal_advance_rates_list");
	private final By Export_xpath = By
			.xpath("//span[@class='ui-icon ui-icon-extlink']");
	private final By Firstpagination_xpath = By
			.xpath("//span[@class='ui-icon ui-icon-seek-first']");
	private final By PreviousPagination_xpath = By
			.xpath("//span[@class='ui-icon ui-icon-seek-prev']");
	private final By NextPagination_xpath = By
			.xpath("//span[@class='ui-icon ui-icon-seek-next']");
	private final By lastPagination_xpath = By
			.xpath("//span[@class='ui-icon ui-icon-seek-end']");
	private final By Firsteditbox_xpath = By
			.xpath("//input[@id='jqg_seasonal_advance_rates_list_1423']");
	private final By deletedilogbox_xpath = By
			.xpath("//td[@class='DelButton EditButton']//a[@class='fm-button ui-state-default ui-corner-all fm-button-icon-left'][1]");
	private final By firstasofdate_xpath = By
			.xpath("//tr[@class='jqgrow ui-row-ltr ui-widget-content row-even'][2]//td[@role='gridcell'][4]");
	private final By searchanybox_xpath = By
			.xpath("//select[@class='opsel ui-widget-content ui-corner-all']");
	private final By searchasofdate_xpath = By
			.xpath("//td[@class='columns']//select[@class='ui-widget-content ui-corner-all'][1]");
	private final By searchEqual_xpath = By
			.xpath("//td[@class='operators']//select[@class='selectopts ui-widget-content ui-corner-all'][1]");
	private final By searchdate_xpath = By
			.xpath("//td[@class='data']//input[@name='as_of_date']");
	private final By searchfind_xpath = By
			.xpath("//td[@class='EditButton']//a[@class='fm-button ui-state-default ui-corner-all fm-button-icon-right ui-search']");
	private final By clickanywere_xpath = By
			.xpath("//div[@id='searchhdfbox_seasonal_advance_rates_list']");
	private final By download_xpath = By.xpath("//div[@class='export']");
	private final By closebox_xpath = By.id("closedialog");
	private final By bbcprocess_xpath = By.xpath("//div[@class='col-md-2']");
	private final By bbcreport_xpath = By
			.xpath("(//li[@class='open_menu'])[9]");
	private final By bbctreand_xpath = By
			.xpath("//div[@class='reports_subview_container']//ul[@class='reports_third_ul']//li[@class='open_menu'][8]");
	private final By bbcdilogbox_xpath = By
			.xpath("//select[@name='bbc_status']");
	private final By bbcorientation_xpath = By
			.xpath("//select[@name='bbc_print_orientation']");
	private final By bbxxls_xpath = By
			.xpath("//div[@class='ui-dialog-buttonset']//button[text()='XLS']");
//	private final By BBCAvailability_xpath = By.id("tab_150");
	private final By BBCAvailability_xpath = By.xpath("//li[@id='tab_284' or @id='tab_150']");
	private final By BBcavablityapprove_xpath = By
			.xpath("//a[text()='Approve BBC']");
	private final By bbcinspect_xpath = By
			.xpath("//select[@name='detail_activity']");
	private final By bbcreportdate_xpath = By.xpath("//select[@name='bbc_id']");
	private final By bbcstartdate_xpath = By
			.xpath("//input[@name='start_date']");
	private final By clickanywere_xpath1 = By
			.xpath("//div[@class='ui-dialog-titlebar ui-widget-header ui-corner-all ui-helper-clearfix']");
	private final By enddate_xpath = By.xpath("//input[@name='end_date']");
	private final By bbctrendreport_xpath = By
			.xpath("(//li[@class='open_menu'])[25]");
	private final By bbctrendreportdate_xpath = By
			.xpath("//select[@name='bbc_id']");
	private final By bbcdisplaycomment_xpath = By.id("past_comments_false");
	private final By bbctrendgenrate_xpath = By
			.xpath("//div[@class='ui-dialog-buttonset']");
	private final By seasonalclickanywere_xpath = By
			.xpath("//div[@class='panel-heading']");
	private final By clickonclose_xpath = By
			.xpath("//button[@class='ui-dialog-titlebar-close']");
	private final By BBCRecalculationProcessButton_xpath = By
			.xpath("//a[contains(text(),'Process/Re-Calculate BBC')]");
	private final By Cross_xpath = By
			.xpath("(//a[@class='ui-jqdialog-titlebar-close ui-corner-all'])[1]");
	
	private final By maxcap_xpath = By
			.xpath("//input[@id='gs_sublimit_max_cap_pct']");

	public boolean clickOnCloseSucessbox() {
		try {
			WebElement divisioncode = new WebDriverWait(driver, 5)
					.until(ExpectedConditions
							.visibilityOfElementLocated(clickonclose_xpath));
			divisioncode.click();
		//////Thread.sleep(500);
	    return true;
	} catch (Exception ex) {
	    return false;
	}
    }
	// kruthivas
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
public boolean clickOncross() {
	try{

		WebElement divisioncode =new WebDriverWait(driver,5)
		.until(ExpectedConditions.visibilityOfElementLocated(Cross_xpath));
		divisioncode.click();
	//////Thread.sleep(500);
    return true;
} catch (Exception ex) {
    return false;
}

}
	//2 select data from division code drop down method
public String Clickondivisioncode(String ClientData) {
    try {
        WebElement divisioncode = new WebDriverWait(driver, 5)
                .until(ExpectedConditions
                        .visibilityOfElementLocated(DivisioncodeDropdown_xpath));
        divisioncode.click();
        divisioncode.sendKeys(ClientData);
        this.isAlertPresent();
    } catch (Exception ex) {
    }
    return ClientData;
}
//tbody//tr[@class='jqgrow ui-row-ltr ui-widget-content row-even ui-state-hover']//td[@role='gridcell'][4]
	//tr[@class='jqgrow ui-row-ltr ui-widget-content row-even'][2]//td[@role='gridcell'][4]
	//click on bbctrend start date
	public String startdate(String ClientData)
	{
	try{
	WebElement startdate =new WebDriverWait(driver,5)
	.until(ExpectedConditions.visibilityOfElementLocated(bbcstartdate_xpath));
	startdate.click();
	//////Thread.sleep(2000);
	startdate.sendKeys(ClientData);

	}
	catch(Exception ex){

	}
	return ClientData;
	}
	//enter date on bbc trend date
	//click on bbctrend start date
		public String clickonbbctrenddate(String ClientData)
		{
		try{
		WebElement bbctrenddate =new WebDriverWait(driver,5)
		.until(ExpectedConditions.visibilityOfElementLocated(bbctrendreportdate_xpath));
		bbctrenddate.click();
		//////Thread.sleep(2000);
		bbctrenddate.sendKeys(ClientData);

		}
		catch(Exception ex){
		}
		return ClientData;
	}

	// click on bbc trend generate
	// click anywere on bbctrend
	public boolean clickbbctrendgenerateoption() {
		try {
			WebElement bbctrendgenerate = new WebDriverWait(driver, 5)
					.until(ExpectedConditions
							.visibilityOfElementLocated(bbctrendgenrate_xpath));
			bbctrendgenerate.click();
			 Set <String> handles =driver.getWindowHandles();
	            Iterator<String> it = handles.iterator();
	            //iterate through your windows
	            while (it.hasNext()){
	            String parent = it.next();
	            String newwin = it.next();
	            driver.switchTo().window(newwin).close();
	            driver.switchTo().window(parent);
	            return true;
	            }

			// ////Thread.sleep(500);
			return true;
		} catch (Exception ex) {
			return false;
		}}
	
	//click on bbctrend end date
		public String endtdate(String ClientData)
		{
		try{
		WebElement endtdate =new WebDriverWait(driver,5)
		.until(ExpectedConditions.visibilityOfElementLocated(enddate_xpath));
		endtdate.click();
		//////Thread.sleep(2000);
		endtdate.sendKeys(ClientData);
		return ClientData;
		} catch (Exception ex) {
    	    return "Method failed";
    	}

		
	}

		//click anywere on bbctrend 
		public boolean bbcanywere() {
	    	try {
	    	    WebElement bbcanywere = new WebDriverWait(driver, 5)
	    		    .until(ExpectedConditions
	    			    .visibilityOfElementLocated(clickanywere_xpath1));
	    	    bbcanywere.click();
	    	    //////Thread.sleep(500);
	    	    return true;
	    	} catch (Exception ex) {
	    	    return false;
	    	}

	        }
		//click any were in screen
		//click anywere on bbctrend 
				public boolean clickonsecondasofdate1() {
			    	try {
			    	    WebElement anywere = new WebDriverWait(driver, 5)
			    		    .until(ExpectedConditions
			    			    .visibilityOfElementLocated(seasonalclickanywere_xpath));
			    	    anywere.click();
			    	    //////Thread.sleep(1000);
			    	    return true;
			    	} catch (Exception ex) {
			    	    return false;
			    	}

			        }
		//click on bbc trend display 
		//click anywere on bbctrend 
				public boolean clickonbbctrenddisplay() {
			    	try {
			    	    WebElement bbctrenddisplay = new WebDriverWait(driver, 5)
			    		    .until(ExpectedConditions
			    			    .visibilityOfElementLocated(bbcdisplaycomment_xpath));
			    	    bbctrenddisplay.click();
			    	    //////Thread.sleep(500);
			    	    return true;
			    	} catch (Exception ex) {
			    	    return false;
			    	}

			        }
			/*	//click on bbc trend generate
				//click anywere on bbctrend 
				public boolean clickbbctrendgenerateoption() {
			    	try {
			    	    WebElement bbctrendgenerate = new WebDriverWait(driver, 5)
			    		    .until(ExpectedConditions
			    			    .visibilityOfElementLocated(bbctrendgenrate_xpath));
			    	    bbctrendgenerate.click();
			    	    //////Thread.sleep(500);
			    	    return true;
			    	} catch (Exception ex) {
			    	    return false;
			    	}

			        }*/
		//click anywere on bbctrend 
				public boolean clickonbbctrendreport() {
			    	try {
			    	    WebElement bbctrendreport = new WebDriverWait(driver, 5)
			    		    .until(ExpectedConditions
			    			    .visibilityOfElementLocated(bbctrendreport_xpath));
			    	    bbctrendreport.click();
			    	    //////Thread.sleep(500);
			    	    return true;
			    	} catch (Exception ex) {
			    	    return false;
			    	}

			        }
	 public boolean clickonbbcreport() {
	    	try {
	    	    WebElement bbcreport = new WebDriverWait(driver, 5)
	    		    .until(ExpectedConditions
	    			    .visibilityOfElementLocated(bbcreport_xpath));
	    	    bbcreport.click();
	    	    //////Thread.sleep(2000);
	    	    return true;
	    	} catch (Exception ex) {
	    	    return false;
	    	}

	        }
	 //click bbctrend
	 public boolean clickonbbctrend() {
	    	try {
	    	    WebElement bbctrend = new WebDriverWait(driver, 5)
	    		    .until(ExpectedConditions
	    			    .visibilityOfElementLocated(bbctreand_xpath));
	    	    bbctrend.click();
	    	    //////Thread.sleep(2000);
	    	    return true;
	    	} catch (Exception ex) {
	    	    return false;
	    	}

	        }
	 //click on bbc xls
	 public boolean clickbbcxlsformat() {
	    	try {
	    	    WebElement bbcxls = new WebDriverWait(driver, 5)
	    		    .until(ExpectedConditions
	    			    .visibilityOfElementLocated(bbxxls_xpath));
	    	    bbcxls.click();
	    	    //////Thread.sleep(10000);
	    	    return true;
	    	} catch (Exception ex) {
	    	    return false;
	    	}

	        }
	//click on bbcavablity approve
	 public boolean selectbbcavablityapprove() {
	    	try {
	    	    WebElement bbcavablityapprove = new WebDriverWait(driver, 5)
	    		    .until(ExpectedConditions
	    			    .visibilityOfElementLocated(BBcavablityapprove_xpath));
	    	    bbcavablityapprove.click();
	    	    //////Thread.sleep(10000);
	    	    return true;
	    	} catch (Exception ex) {
	    	    return false;
	    	}

	        }
	//select search any
	public String clickonfirstdilogboxofsearch(String ClientData)
	{
	try{
	WebElement searchany =new WebDriverWait(driver,5)
	.until(ExpectedConditions.visibilityOfElementLocated(searchanybox_xpath));
	searchany.click();
	searchany.sendKeys(ClientData);

	}
	catch(Exception ex){

	}
	return ClientData;

	}
	//click on main colletral
	public String clickonmaincolletral(String data)
	{
	try{
	WebElement clickonmaincolletral =new WebDriverWait(driver,5)
	.until(ExpectedConditions.visibilityOfElementLocated(MainColletral_xpath));
	clickonmaincolletral.click();
	clickonmaincolletral.sendKeys(data);

	}
	catch(Exception ex){

	}
	return data;
}

	// click on bbc
	public boolean clickonrecalculatebbc() {
		try {
			WebElement bbc = new WebDriverWait(driver, 5)
					.until(ExpectedConditions
							.visibilityOfElementLocated(bbcprocess_xpath));
			bbc.click();
			// ////Thread.sleep(2000);
this.isAlertPresent();
			return true;
		} catch (Exception ex) {

		}
		return false;

	}

	// click on close
	public boolean clickonclosebox() {
		try {
			WebElement closebox = new WebDriverWait(driver, 5)
					.until(ExpectedConditions
							.visibilityOfElementLocated(closebox_xpath));
			closebox.click();
			this.isAlertPresent();
			// ////Thread.sleep(2000);
			return true;
		} catch (Exception ex) {

		}
		return false;

		
	}

	//click on download
		public boolean clickondownload()
		{
		try{
		WebElement download =new WebDriverWait(driver,5)
		.until(ExpectedConditions.visibilityOfElementLocated(download_xpath));
		download.click();
		//////Thread.sleep(2000);
		
	return true;
		}
		catch(Exception ex){

		}
		return false;

		
	}
		
	//click on click anywere in screen
		public boolean clickanywere()
		{
		try{
		WebElement clickanywere =new WebDriverWait(driver,5)
		.until(ExpectedConditions.visibilityOfElementLocated(clickanywere_xpath));
		clickanywere.click();
		//////Thread.sleep(2000);
	return true;
		}
		catch(Exception ex){
		return false;

	}
		}
	// click on save
	public boolean clickonsave() {
		try {
			WebElement save = new WebDriverWait(driver, 5)
					.until(ExpectedConditions
							.visibilityOfElementLocated(Save_xpath));
			save.click();

			Thread.sleep(100);
         this.isAlertPresent();
         this.isAlertPresent();
		} catch (Exception ex) {

		}
		return false;

		
	}
	//select searchfinf
	public boolean clickonfind()
	{
	try{
	WebElement find =new WebDriverWait(driver,5)
	.until(ExpectedConditions.visibilityOfElementLocated(searchfind_xpath));
	find.click();
	//////Thread.sleep(500);
	
return true;
	}
	catch(Exception ex){

	}
	return false;

	
}
	//click on first edit box
	public boolean clickonfirsteditbox()
	{
	try{
	WebElement firsteditbox =new WebDriverWait(driver,5)
	.until(ExpectedConditions.visibilityOfElementLocated(Firsteditbox_xpath));
	//////Thread.sleep(1000);
	firsteditbox.click();
	
return true;
	}
	catch(Exception ex){

	}
	return false;

	
}
	
	//3 click collertralDropdown method
	public boolean colletral()
	{
	try{
	WebElement colletral =new WebDriverWait(driver,5)
	.until(ExpectedConditions.visibilityOfElementLocated(ColletralDropDown_xpath));
	colletral.click();
	
return true;
	}
	catch(Exception ex){

	}
	return false;

	
}
	//click As of date method
	public boolean AsofDate()
	{
	try{
	WebElement AsofDate =new WebDriverWait(driver,5)
	.until(ExpectedConditions.visibilityOfElementLocated(AsOfDate_xpath));
	AsofDate.click();
	
return true;
	}
	catch(Exception ex){

	}
	return false;
	}
	//select colletral date methos
	public String clickonColletral1(String ClientData)
	{
	try{
	WebElement Colletral1 =new WebDriverWait(driver,5)
	.until(ExpectedConditions.visibilityOfElementLocated(ColletralDropDown_xpath));
	Colletral1.click();
	Colletral1.sendKeys(ClientData);

	}
	catch(Exception ex){

	}
	return ClientData;

	}
	//select AsOfDate methoddate methos
		public String clickonAsOfDate(String ClientData)
		{
		try{
		WebElement AsOfDate =new WebDriverWait(driver,5)
		.until(ExpectedConditions.visibilityOfElementLocated(AsOfDate_xpath));
		AsOfDate.click();
		AsOfDate.sendKeys(ClientData);

		}
		catch(Exception ex){

		}
		return ClientData;

		}
		//search as of date
		public String clickonAsOfDatecalender(String ClientData)
		{
		try{
		WebElement AsOfDate1 =new WebDriverWait(driver,5)
		.until(ExpectedConditions.visibilityOfElementLocated(searchdate_xpath));
		AsOfDate1.click();
		AsOfDate1.sendKeys(ClientData);

		}
		catch(Exception ex){

		}
		return ClientData;

		}
		//select MainAsOfDate methoddate methos
				public String clickonMainAsOfDate(String ClientData)
				{
				try{
				WebElement MainAsOfDate =new WebDriverWait(driver,5)
				.until(ExpectedConditions.visibilityOfElementLocated(AsOfDate_xpath));
				MainAsOfDate.click();
				MainAsOfDate.sendKeys(ClientData);

				}
				catch(Exception ex){

				}
				return ClientData;

				}
		//click on add button
		public boolean clickonadd()
		{
		try{
		WebElement clickonadd =new WebDriverWait(driver,5)
		.until(ExpectedConditions.visibilityOfElementLocated(Addicon_xpath));
		clickonadd.click();
		
	return true;
		}
		catch(Exception ex){

		}
		return false;
	}
		//select sublimit data
				public String clickonsublimit(String ClientData)
				{
				try{
				WebElement sublimit =new WebDriverWait(driver,5)
				.until(ExpectedConditions.visibilityOfElementLocated(Sublimit_xpath));
				sublimit.click();
				
				sublimit.sendKeys(ClientData);

				}
				catch(Exception ex){

				}
				return ClientData;
}
				//select novl value
				public String clickonnovl(String ClientData)
				{
				try{
				WebElement novl =new WebDriverWait(driver,5)
				.until(ExpectedConditions.visibilityOfElementLocated(Novl_xpath));
				novl.click();
				
				novl.sendKeys(ClientData);

				}
				catch(Exception ex){

				}
				return ClientData;
}
				//select ltv/Advancevalue
				public String clickonltvAdvance(String ClientData)
				{
				try{
				WebElement ltvAdvance =new WebDriverWait(driver,5)
				.until(ExpectedConditions.visibilityOfElementLocated(LvtAdvance_xpath));
				ltvAdvance.click();
				
				ltvAdvance.sendKeys(ClientData);

				}
				catch(Exception ex){

				}
				return ClientData;
				}
				//select adjusted Advance rate
				public String adjustedAdvancerate(String ClientData)
				{
				try{
				WebElement adjustedAdvancerate =new WebDriverWait(driver,5)
				.until(ExpectedConditions.visibilityOfElementLocated(AdjustedAdvanceRate_xpath));
				adjustedAdvancerate.click();
				
				adjustedAdvancerate.sendKeys(ClientData);

				}
				catch(Exception ex){

				}
				return ClientData;
				}
				//select low value
				public String clickonlowvalue(String ClientData)
				{
				try{
				WebElement lowvalue =new WebDriverWait(driver,5)
				.until(ExpectedConditions.visibilityOfElementLocated(LowValue_xpath));
				lowvalue.click();
			
				lowvalue.sendKeys(ClientData);

				}
				catch(Exception ex){

				}
				return ClientData;
				}
				//select highvalue
				public String clickonhighvalue(String ClientData)
				{
				try{
				WebElement highvalue =new WebDriverWait(driver,5)
				.until(ExpectedConditions.visibilityOfElementLocated(highVale_xpath));
				highvalue.click();
				highvalue.sendKeys(ClientData);
				}
				catch(Exception ex){

				}
				return ClientData;
				}
				//click on Basedon
				public String clickonbaseon( String data)
				{
				try{
				WebElement baseon =new WebDriverWait(driver,5)
				.until(ExpectedConditions.visibilityOfElementLocated(Basedon_xpath));
				//////Thread.sleep(2000);
				baseon.click();
				baseon.sendKeys(data);

				}
				catch(Exception ex){

				}
				return data;
				}
				//select basedon
				public String clickonbasedon(String ClientData)
				{
				try{
				WebElement basedon =new WebDriverWait(driver,5)
				.until(ExpectedConditions.visibilityOfElementLocated(nextbaseon_xpath));
				basedon.click();
				basedon.sendKeys(ClientData);

				}
				catch(Exception ex){

				}
				return ClientData;
				}
				//click on calculatedcap
				public   String  clickonmaincalculatedcap(String value){
					try {
						WebElement productTypeDropdownWebEelement = new WebDriverWait(
								driver, 5).until(ExpectedConditions
								.visibilityOfElementLocated(CalculatedCapBy_xpath));
						
						productTypeDropdownWebEelement.click();
						productTypeDropdownWebEelement.sendKeys(value);
						//////Thread.sleep(500);
						Select sel = new Select(productTypeDropdownWebEelement);
						java.util.List<WebElement> options = sel.getOptions();
						for (int i=0;i<=options.size();i++) 
						{
								String values=options.get(i).getText();
								System.out.println(values);
								
							}
						
					} catch (Exception ex) {
				
					}
					return value;
				}
//select calculatedcap by
public String clickoncalculatedcapby(String ClientData)
{
try{
WebElement calculatedcapby =new WebDriverWait(driver,5)
.until(ExpectedConditions.visibilityOfElementLocated(CalculatedCapBy_xpath));
calculatedcapby.click();
calculatedcapby.sendKeys(ClientData);

}
catch(Exception ex){

}
return ClientData;
}
//select maxcap by
public String clickonmaxcap(String ClientData)
{
try{
WebElement maxcap =new WebDriverWait(driver,5)
.until(ExpectedConditions.visibilityOfElementLocated(MaxCap_xpath));
maxcap.click();

maxcap.sendKeys(ClientData);

}
catch(Exception ex){

}
return ClientData;
}
//3 select delete
	public boolean clickondelete()
	{
	try{
	WebElement delete =new WebDriverWait(driver,5)
	.until(ExpectedConditions.visibilityOfElementLocated(Delete_xpath));
	delete.click();
	
return true;
	}
	catch(Exception ex){

	}
	return false;
}
	//click on delete dilogbox
	public boolean clickondeleteddilogbox()
	{
	try{
	WebElement deletedilogbox =new WebDriverWait(driver,5)
	.until(ExpectedConditions.visibilityOfElementLocated(deletedilogbox_xpath));
	deletedilogbox.click();
	
return true;
	}
	catch(Exception ex){

	}
	return false;

	
}
	//select cancle
	public boolean clickoncancle()
	{
	try{
	WebElement cancle =new WebDriverWait(driver,5)
	.until(ExpectedConditions.visibilityOfElementLocated(cancle_xpath));
	cancle.click();
	//////Thread.sleep(500);
return true;
	}
	catch(Exception ex){

	}
	return false;
	}
	//select reload
		public boolean clickonreload()
		{
		try{
		WebElement reload =new WebDriverWait(driver,5)
		.until(ExpectedConditions.visibilityOfElementLocated(Reload_xpath));
		reload.click();
		
	return true;
		}
		catch(Exception ex){

		}
		return false;
		}
		//select export
				public boolean  clickonexport()
				{
				try{
				WebElement reload =new WebDriverWait(driver,5)
				.until(ExpectedConditions.visibilityOfElementLocated(Export_xpath));
				reload.click();
				
			return true;
				}
				catch(Exception ex){

				}
				return false;
				}
		//select search
		public boolean clickonsearch()
		{
		try{
		WebElement search =new WebDriverWait(driver,5)
		.until(ExpectedConditions.visibilityOfElementLocated(Search_xpath));
		search.click();
		
		}
		catch(Exception ex){

		}
		return false;
		}
		//select firstpagination
				public boolean clickonfirstpaginationsymbol()
				{
				try{
				WebElement firstpagination =new WebDriverWait(driver,5)
				.until(ExpectedConditions.visibilityOfElementLocated(Firstpagination_xpath));
				firstpagination.click();
				//////Thread.sleep(2000);
				
			return true;
				}
				catch(Exception ex){

				}
				return false;
}
				//select previouspaginization
				public boolean clickonpreviouspaginizationsymbol()
				{
				try{
				WebElement previouspaginization =new WebDriverWait(driver,5)
				.until(ExpectedConditions.visibilityOfElementLocated(PreviousPagination_xpath));
				previouspaginization.click();
				//////Thread.sleep(2000);
				
			return true;
				}
				catch(Exception ex){

				}
				return false;}
				//select nextpagination
				public boolean clickonnextpaginationsymbol()
				{
				try{
				WebElement nextpagination =new WebDriverWait(driver,5)
				.until(ExpectedConditions.visibilityOfElementLocated(NextPagination_xpath));
				nextpagination.click();
				//////Thread.sleep(2000);
				
			return true;
				}
				catch(Exception ex){

				}
				return false;}
				
//select lastpaginization
public boolean clickonlastpaginizationsymbol()
{
try{
WebElement lastpaginization =new WebDriverWait(driver,5)
.until(ExpectedConditions.visibilityOfElementLocated(lastPagination_xpath));
lastpaginization.click();
//////Thread.sleep(2000);

return true;
}
catch(Exception ex){

}
return false;
}
//click on bbc avablity 

//select lastpaginization
public boolean clickonbbcavablity()
{
try{
WebElement bbcavablity =new WebDriverWait(driver,5)
.until(ExpectedConditions.visibilityOfElementLocated(BBCAvailability_xpath));
bbcavablity.click();

Thread.sleep(500);


return true;
}
catch(Exception ex){

}
return false;
}
//click on div
public String DivisionTypeSelect(String ClientData ) throws InterruptedException{
	

	WebDriverWait wait = new WebDriverWait(driver, 5);
	wait.until(ExpectedConditions.visibilityOfElementLocated((DivisioncodeDropdown_xpath)));

	WebElement element = driver.findElement((DivisioncodeDropdown_xpath));
	Select sel = new Select(element);
	List<WebElement> list = sel.getOptions();	
	
	
	for(WebElement ele : list){
		
		if(ele.getText().equals(ClientData)){
			ele.click();
			//////Thread.sleep(10000);
			break;
		}
	}
	return ClientData;

}
//step to select data from bbc orientation dropdown

public String clickonbbcorientationdropdown(String ClientData)
        throws InterruptedException {



    WebDriverWait wait = new WebDriverWait(driver, 5);
    wait.until(ExpectedConditions
            .visibilityOfElementLocated((bbcorientation_xpath)));



    WebElement element = driver.findElement((bbcorientation_xpath));
    Select sel = new Select(element);
    List<WebElement> list = sel.getOptions();



    for (WebElement ele : list) {



        if (ele.getText().equals(ClientData)) {
            ele.click();
            
            // ////Thread.sleep(10000);
            break;
        }
    }
    return ClientData;



}

	// select data from drop down of bbc

	public boolean clickonsecondasofdate() {
		try {
			WebElement secondasofdate = new WebDriverWait(driver,10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(firstasofdate_xpath));
			Actions action = new Actions(driver);
			action.doubleClick(secondasofdate).build().perform();
			return true;
		} catch (Exception e) 
		{}
	return false;

}
//click on dasofdate in search
public String clickonsearchasofdate(String ClientData) throws InterruptedException{
	

	WebDriverWait wait = new WebDriverWait(driver, 5);
	wait.until(ExpectedConditions.visibilityOfElementLocated((searchasofdate_xpath)));

	WebElement element = driver.findElement((searchasofdate_xpath));
	Select sel = new Select(element);
	List<WebElement> list = sel.getOptions();	
	
	
	for(WebElement ele : list){
		
		if(ele.getText().equals(ClientData)){
			ele.click();
			//////Thread.sleep(10000);
			break;
		}
	}
	return ClientData;

}//select equal fro msearch
public String clickonsecondbox(String ClientData) throws InterruptedException{
	

	WebDriverWait wait = new WebDriverWait(driver, 5);
	wait.until(ExpectedConditions.visibilityOfElementLocated((searchEqual_xpath)));

	WebElement element = driver.findElement((searchEqual_xpath));
	Select sel = new Select(element);
	List<WebElement> list = sel.getOptions();	
	
	
	for(WebElement ele : list){
		
		if(ele.getText().equals(ClientData)){
			ele.click();
			//////Thread.sleep(10000);
			break;
		}
	}
	return ClientData;

}
//select data from drop down of bbc
public String clickonbbcdropdown(String ClientData) 
{
try{
WebElement bbcdate =new WebDriverWait(driver,5)
.until(ExpectedConditions.visibilityOfElementLocated(bbcdilogbox_xpath));
bbcdate.click();
//////Thread.sleep(5000);
bbcdate.sendKeys(ClientData);

}
catch(Exception ex){

}
return ClientData;
}
//select data from drop down of bbc


	public String maxcap(String clientData1111111111) {
		try {
			WebElement highvalue = new WebDriverWait(driver, 5)
					.until(ExpectedConditions
							.visibilityOfElementLocated(maxcap_xpath));
			highvalue.click();
			highvalue.sendKeys(clientData1111111111);
		} catch (Exception ex) {

		}
		return clientData1111111111;
	}


//select calculatedcap by
public String selectbbcdate(String ClientData)
{
try{
WebElement bbcdate =new WebDriverWait(driver,5)
.until(ExpectedConditions.visibilityOfElementLocated(bbcinspect_xpath));
bbcdate.click();
//////Thread.sleep(5000);
bbcdate.sendKeys(ClientData);

}
catch(Exception ex){

}
return ClientData;
}
public String selectbbcrecorddatefrombbcdate(String ClientData)
{
try{
WebElement bbcrecordbbcdate =new WebDriverWait(driver,5)
.until(ExpectedConditions.visibilityOfElementLocated(bbcreportdate_xpath));
bbcrecordbbcdate.click();
//////Thread.sleep(5000);
bbcrecordbbcdate.sendKeys(ClientData);

}
catch(Exception ex){

}
return ClientData;
}


//popup
public  boolean clickOnProcessButton() {
	 try {
		  WebElement IneligibleCalculationPageWebElement = new WebDriverWait(driver, 5)
		 .until(ExpectedConditions.elementToBeClickable(BBCRecalculationProcessButton_xpath));
		 IneligibleCalculationPageWebElement.click();
		 //////Thread.sleep(500);
		 Alert simpleAlert = driver.switchTo().alert();
		 simpleAlert.accept();
		 //////Thread.sleep(1000);
		/* simpleAlert.accept();
		 //////Thread.sleep(1000);*/
		 return true;
		 }
	 
catch (Exception ex) {
   return false;
				}
}


}