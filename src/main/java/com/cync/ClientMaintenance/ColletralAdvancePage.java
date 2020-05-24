package com.cync.ClientMaintenance;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.cync.base.BasePage;
																										//Author name-Garima
public class ColletralAdvancePage extends BasePage {

	public ColletralAdvancePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
private final By Divisioncodeplussymbol_xpath=By.xpath("//span[@class='ui-icon ui-icon ui-icon-plus']");
private final By Divisioncodename_xpath=By.xpath("//input[@name='name']");
private final By Divisioncodedescription_xpath=By.xpath("//input[@name='description']");
private final By Divisioncodesave_xpath=By.xpath("//span[@class='ui-icon ui-icon ui-icon-disk']");
private final By Divisioncodecancle_xpath=By.xpath("//span[@class='ui-icon ui-icon ui-icon-cancel']");
private final By Divisioncodeerrormessage_xpath=By.xpath("//div[@class='ui-state-error']");
private final By Divisioncodenameedit_xpath=By.xpath("(//tr[@class='jqgrow ui-row-ltr ui-widget-content row-even'][1]//td[@role='gridcell'][3])[1]");
private final By Divisioncodecheckboxbox_xpath=By.xpath("(//tr[@class='jqgrow ui-row-ltr ui-widget-content row-even'][1]//input[@class='cbox '])[1]");
private final By Divisioncodedelete_xpath=By.xpath("//span[@class='ui-icon ui-icon-trash']");
private final By Divisioncodeclosebox_xpath=By.id("closedialog");
private final By Divisioncodereload_xpath=By.xpath("//span[@class='ui-icon ui-icon-refresh']");
private final By Colletraladvanceaddsymbol_xpath=By.xpath("(//span[@class='ui-icon ui-icon ui-icon-plus'])[2]");
private final By Colletraladvancecanclesymbol_xpath=By.xpath("(//span[@class='ui-icon ui-icon ui-icon-cancel'])[2]");
private final By Colletraltypedropdown_xpath=By.xpath("(//select[@class='editable inline-edit-cell ui-widget-content ui-corner-all'])[1]");
private final By ColletralName_xpath=By.xpath("(//input[@class='editable inline-edit-cell ui-widget-content ui-corner-all'])[1]");
private final By Colletralsave_xpath=By.xpath("(//span[@class='ui-icon ui-icon ui-icon-disk'])[2]");
private final By Colletralsublimit=By.xpath("//input[@name='sub_limit']");
private final By Colletralclose_xpath=By.xpath("//div[@id='info_head']//a[@class='ui-jqdialog-titlebar-close ui-corner-all']");
private final By ColletralNovl_xpath=By.xpath("(//input[@class='editable inline-edit-cell ui-widget-content ui-corner-all'])[4]");
private final By Colletralerroemessage_xpath=By.xpath("(//div[@class='ui-state-error'])");
private final By Colletralltv_xpath=By.xpath("(//input[@class='editable inline-edit-cell ui-widget-content ui-corner-all'])[5]");
private final By ColletralAdjustedAdvanceRate_xpath=By.xpath("//tr[@class='jqgrow ui-row-ltr ui-widget-content row-even jqgrid-new-row ui-state-highlight ui-state-hover']//td[@role='gridcell'][7]");
private final By Colletrallowvalue_xpath=By.xpath("//input[@name='low_value']");
private final By Colletralhighvalue_xpath=By.xpath("//input[@name='high_value']");
private final By Coletralineligible_xpath=By.xpath("//input[@name='ineligible']");
private final By Colleteralineligibilityreason_xpath=By.xpath("//select[@name='ineligibility_reason_id']");
private final By Colletralcurrencyid_xpath=By.xpath("//select[@name='currency_id']");
private final By Colletralbasedon_xpath=By.xpath("//select[@name='sublimit_based_on']");
private final By Colletralcalculated_xpath=By.xpath("//select[@name='sublimit_calculated_cap_by']");
private final By ColletralCheckbox_xpath=By.xpath("(//tr[@class='jqgrow ui-row-ltr ui-widget-content row-even'][1]//input[@class='cbox '])[2]");
private final By ColletralDelete_xpath=By.xpath("(//span[@class='ui-icon ui-icon-trash'])[2]");
private final By ColletralClosebox_xpath=By.xpath("//a[@class='fm-button ui-state-default ui-corner-all fm-button-icon-left'][1]");
private final By ColletralEditbox_xpath=By.xpath("//input[@name='name']");
private final By ColletralEditName_xpath=By.xpath("(//table[@id='collateral_advance_rates_list']//tr[@class='jqgrow ui-row-ltr ui-widget-content row-even']//td[4])[1]");
private final By ColletralReload_xpath=By.xpath("(//span[@class='ui-icon ui-icon-refresh'])[2]");
private final By ColletralExport_xpath=By.xpath("//span[@class='ui-icon ui-icon-extlink']");
private final By Colletralexportdownload_xpath=By.xpath("//div[@class='export']");
private final By Colletralfirstpagination_xpath=By.xpath("(//span[@class='ui-icon ui-icon-seek-first'])[2]");
private final By ColletralPreviouspage_xpath=By.xpath("(//span[@class='ui-icon ui-icon-seek-prev'])[2]");
private final By ColletralNextpage_xpath=By.xpath("(//span[@class='ui-icon ui-icon-seek-next'])[2]");
private final By Colletrallastpage_xpath=By.xpath("(//span[@class='ui-icon ui-icon-seek-end'])[2]");
private final By bbcprocess_xpath=By.xpath("//div[@class='col-md-2']");
//private final By BBCAvailability_xpath=By.id("tab_150");
private final By BBCAvailability_xpath=By.xpath("//li[@id='tab_284' or @id='tab_150']");
private final By bbcreport_xpath=By.xpath("(//li[@class='open_menu'])[9]");
private final By bbcdilogbox_xpath=By.xpath("//select[@name='bbc_status']");
private final By bbcorientation_xpath=By.xpath("//select[@name='bbc_print_orientation']");
private final By bbxxls_xpath=By.xpath("//div[@class='ui-dialog-buttonset']//button[text()='XLS']");
private final By BBcavablityapprove_xpath=By.xpath("//a[text()='Approve BBC']");
private final By bbctrendreport_xpath=By.xpath("(//li[@class='open_menu'])[25]");
private final By bbcstartdate_xpath=By.xpath("//input[@name='start_date']");
private final By clickanywere_xpath1=By.xpath("//div[@class='ui-dialog-titlebar ui-widget-header ui-corner-all ui-helper-clearfix']");
private final By enddate_xpath=By.xpath("//input[@name='end_date']");
private final By bbctrendreportdate_xpath=By.xpath("//select[@name='bbc_id']");
private final By bbcdisplaycomment_xpath=By.xpath("//div[contains(text(),'Display Past Comments: ')]//input[@value='true']");
private final By bbctrendgenrate_xpath=By.xpath("//div[@class='ui-dialog-buttonset']");
private final By BBCRecalculationProcessButton_xpath=By.xpath("//a[contains(text(),'Process/Re-Calculate BBC')]");
private final By Creoo_xpath=By.xpath("(//a[@class='ui-jqdialog-titlebar-close ui-corner-all'])[1]");
private final By Highvalue_xpath=By.xpath("//input[@name='high_value']");
private final By Title_xpath=By.xpath("//span[@class='paneltitle']");
private final By BBCAvablityy_xpath=By.xpath("//span[@class='paneltitle']");
private final By Titlee_xpath=By.xpath("//span[@class='paneltitle']");
private final By bbcTrendReport_xpath=By.xpath("(//a[text()='BBC Trend Report'])[1]");

//kruthivas
private final By clickondivisioncodeclose_xpath=By.xpath("(//a[@class='ui-jqdialog-titlebar-close ui-corner-all'])[1]");
//click on division code add symbol
public  boolean clickondivisioncodeadd()
{
try{
Thread.sleep(2000);
WebElement clickondivisioncodeadd =new WebDriverWait(driver,20)
.until(ExpectedConditions.visibilityOfElementLocated(Divisioncodeplussymbol_xpath));
clickondivisioncodeadd.click();
return true;}
catch(Exception ex){
return false;
}
}

public  boolean clickoncross()
{
try{
WebElement clickondivisioncodeadd =new WebDriverWait(driver,5)
.until(ExpectedConditions.visibilityOfElementLocated(Creoo_xpath));
clickondivisioncodeadd.click();
return true;}
catch(Exception ex){
return false;
}
}
//click on division code name
public   String clickondivisioncodename(String data)
{
try{
WebElement clickondivisioncodename =new WebDriverWait(driver,5)
.until(ExpectedConditions.visibilityOfElementLocated(Divisioncodename_xpath));
clickondivisioncodename.click();
clickondivisioncodename.clear();
clickondivisioncodename.sendKeys(data);
}
catch(Exception ex){

}
return data;
}
//click on division code description
public   String clickondivisioncodediscription(String data)
{
try{
WebElement clickondivisioncodename =new WebDriverWait(driver,5)
.until(ExpectedConditions.visibilityOfElementLocated(Divisioncodedescription_xpath));
clickondivisioncodename.click();
clickondivisioncodename.sendKeys(data);
}
catch(Exception ex){

}
return data;
}
//click on division code save
public  boolean clickondivisioncodesave()
{
try{
WebElement clickondivisioncodeadd =new WebDriverWait(driver,5)
.until(ExpectedConditions.visibilityOfElementLocated(Divisioncodesave_xpath));
clickondivisioncodeadd.click();
////Thread.sleep(2000);
return true;}
catch(Exception ex){
return false;
}
}
//click on division code cancle symbol
public  boolean clickondivisioncodecancle()
{
try{
WebElement clickondivisioncodecancle =new WebDriverWait(driver,5)
.until(ExpectedConditions.visibilityOfElementLocated(Divisioncodecancle_xpath));
clickondivisioncodecancle.click();
return true;}
catch(Exception ex){
return false;
}
}
//click on division code add symbol
public  boolean clickondivisioncodeclose()
{
try{
	Thread.sleep(2000);
WebElement clickondivisioncodeclose =new WebDriverWait(driver,5)
.until(ExpectedConditions.visibilityOfElementLocated(clickondivisioncodeclose_xpath));
clickondivisioncodeclose.isDisplayed();
clickondivisioncodeclose.click();
return true;}
catch(Exception ex){
return false;
}
}
//double click on division code name

public boolean doubleclickondivisioncodename()
{
	try
	{
		WebElement clickonassertname=new WebDriverWait(driver,5)
		.until(ExpectedConditions.visibilityOfElementLocated(Divisioncodenameedit_xpath));
		Actions action = new Actions(driver);
		action.doubleClick(clickonassertname).build().perform();
		}
	catch (Exception e)
	{
		
	}
	return false;
	
}

//click on division code check box  box 
public  boolean clickondivisioncodecheckbox()
{
try{
WebElement clickondivisioncodecheckbox =new WebDriverWait(driver,5)
.until(ExpectedConditions.visibilityOfElementLocated(Divisioncodecheckboxbox_xpath));
clickondivisioncodecheckbox.click();
return true;}
catch(Exception ex){
return false;
}
}
//click on division code delete symbol
public  boolean clickondivisioncodedelete()
{
try{
WebElement clickondivisioncodeadd =new WebDriverWait(driver,5)
.until(ExpectedConditions.visibilityOfElementLocated(Divisioncodedelete_xpath));
clickondivisioncodeadd.click();
return true;}
catch(Exception ex){
return false;
}
}
//click on close dilogbox symbol
public  boolean clickonclose()
{
try{
WebElement clickonclose =new WebDriverWait(driver,5)
.until(ExpectedConditions.visibilityOfElementLocated(Creoo_xpath));
clickonclose.click();
return true;}
catch(Exception ex){
return false;
}
}
//verify error message
public  boolean verifymessage()
{
try{
	Thread.sleep(2000);
WebElement verifymessage =new WebDriverWait(driver,10)
.until(ExpectedConditions.visibilityOfElementLocated(Divisioncodeerrormessage_xpath));
verifymessage.isDisplayed();
return true;}
catch(Exception ex){
return false;
}
}
//click on division code reload symbol
public  boolean clickondivisioncodereload()
{
try{
WebElement clickondivisioncodereload =new WebDriverWait(driver,5)
.until(ExpectedConditions.visibilityOfElementLocated(Divisioncodereload_xpath));
clickondivisioncodereload.click();
////Thread.sleep(500);
return true;}
catch(Exception ex){
return false;
}
}
//click on colletral advance code add symbol
public  boolean clickoncolletralcodeadd()
{
try{

	Thread.sleep(2000);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

WebElement clickondivisioncodeadd =new WebDriverWait(driver,5)
.until(ExpectedConditions.visibilityOfElementLocated(Colletraladvanceaddsymbol_xpath));
clickondivisioncodeadd.click();
return true;}
catch(Exception ex){
return false;
}
}
//click on colletral advance code cancle symbol
public  boolean clickoncolletralcodecancle()
{
try{
WebElement clickondivisioncodeadd =new WebDriverWait(driver,5)
.until(ExpectedConditions.visibilityOfElementLocated(Colletraladvancecanclesymbol_xpath));
clickondivisioncodeadd.click();
return true;}
catch(Exception ex){
return false;
}
}
//click on colletral type dropdown
public   String clickoncolletraltypedropdown(String data)
{
try{
WebElement clickondivisioncodename =new WebDriverWait(driver,5)
.until(ExpectedConditions.visibilityOfElementLocated(Colletraltypedropdown_xpath));
clickondivisioncodename.click();
clickondivisioncodename.sendKeys(data);
}
catch(Exception ex){

}
return data;
}
//click on colletral advance name
public  boolean clickoncolletralname()
{
try{
	Thread.sleep(500);
WebElement clickondivisioncodeadd =new WebDriverWait(driver,5)
.until(ExpectedConditions.visibilityOfElementLocated(Colletraltypedropdown_xpath));
clickondivisioncodeadd.click();
return true;}
catch(Exception ex){
return false;
}
}
//click on division code add symbol
public  boolean clickoncolletralnmae()
{
try{
WebElement clickoncolletralnmae =new WebDriverWait(driver,5)
.until(ExpectedConditions.visibilityOfElementLocated(ColletralName_xpath));
clickoncolletralnmae.isDisplayed();
return true;}
catch(Exception ex){
return false;
}
}
//click on division code add symbol
public   String clickoncolletralname(String data)
{
try{
WebElement clickoncolletralnmae =new WebDriverWait(driver,5)
.until(ExpectedConditions.visibilityOfElementLocated(ColletralName_xpath));
clickoncolletralnmae.click();
clickoncolletralnmae.sendKeys(data);
}
catch(Exception ex){

}
return data;


}
//click on colletral advance save
public  boolean clickoncolletralsave()
{
try{
WebElement clickondivisioncodeadd =new WebDriverWait(driver,5)
.until(ExpectedConditions.visibilityOfElementLocated(Colletralsave_xpath));
clickondivisioncodeadd.click();
return true;}
catch(Exception ex){
return false;
}
}
//click on colletral sublimit
public  String clickonsublimit(String data)
{
try{
WebElement clickonsublimit =new WebDriverWait(driver,5)
.until(ExpectedConditions.visibilityOfElementLocated(Colletralsublimit));
clickonsublimit.click();
clickonsublimit.clear();
clickonsublimit.sendKeys(data);
////Thread.sleep(2000);
}
catch(Exception ex){
}
return data;
}
//click on colletral advance close
public  boolean clickoncolletralclose()
{
try{
WebElement clickoncolletralclose =new WebDriverWait(driver,5)
.until(ExpectedConditions.visibilityOfElementLocated(Colletralclose_xpath));
clickoncolletralclose.click();
return true;}
catch(Exception ex){
return false;
}
}
//click on colletral novl
public  boolean clickonnovl1()
{
try{
WebElement clickonnovl1 =new WebDriverWait(driver,5)
.until(ExpectedConditions.visibilityOfElementLocated(ColletralNovl_xpath));
clickonnovl1.isDisplayed();
return true;}
catch(Exception ex){
return false;
}
}
//click on colletral novl
public  String clickonnovl(String data)
{
try{
WebElement clickonsublimit =new WebDriverWait(driver,5)
.until(ExpectedConditions.visibilityOfElementLocated(ColletralNovl_xpath));
clickonsublimit.click();
clickonsublimit.clear();
clickonsublimit.sendKeys(data);
////Thread.sleep(2000);
}
catch(Exception ex){
}
return data;
}
//click on colletral ltv
public  boolean clickonltv()
{
try{
WebElement clickonltv =new WebDriverWait(driver,5)
.until(ExpectedConditions.visibilityOfElementLocated(Colletralltv_xpath));
clickonltv.isDisplayed();
return true;}
catch(Exception ex){
return false;
}
}
//click on colletral ltv
public  String clickonltv1(String data)
{
try{
WebElement clickonltv =new WebDriverWait(driver,5)
.until(ExpectedConditions.visibilityOfElementLocated(Colletralltv_xpath));
clickonltv.click();
clickonltv.clear();
////Thread.sleep(1000);
clickonltv.sendKeys(data);
}
catch(Exception ex){

}
return data;
}
//verify error message
public  boolean verifyadjustedadvancerate()
{
try{
WebElement verifyadjustedadvancerate =new WebDriverWait(driver,5)
.until(ExpectedConditions.visibilityOfElementLocated(ColletralAdjustedAdvanceRate_xpath));
verifyadjustedadvancerate.isDisplayed();
////Thread.sleep(500);
return true;}
catch(Exception ex){
return false;
}
}
//click on colletral lowvalue
public  boolean clickonlowvalue()
{
try{
	Thread.sleep(500);
WebElement clickonlowvalue =new WebDriverWait(driver,20)
.until(ExpectedConditions.visibilityOfElementLocated(Colletrallowvalue_xpath));
String s=clickonlowvalue.getText();
System.out.println(s);
return true;}
catch(Exception ex){
return false;
}
}
//click on colletral lowvalue
public  String clickonlowvalue1(String data)
{
try{
WebElement clickonlowvalue1 =new WebDriverWait(driver,5)
.until(ExpectedConditions.visibilityOfElementLocated(Colletrallowvalue_xpath));
clickonlowvalue1.click();
clickonlowvalue1.clear();
////Thread.sleep(1000);
clickonlowvalue1.sendKeys(data);
}
catch(Exception ex){

}
return data;
}

//click on colletral highvalue
public  boolean clickonhighvalue()
{
try{
WebElement clickonlowvalue =new WebDriverWait(driver,5)
.until(ExpectedConditions.visibilityOfElementLocated(Colletralhighvalue_xpath));
String n=clickonlowvalue.getText();
System.out.println(n);
return true;}
catch(Exception ex){
return false;
}
}
//click on colletral highvalue
public  String clickonhighvalue1(String data)
{
try{
WebElement clickonlowvalue1 =new WebDriverWait(driver,5)
.until(ExpectedConditions.visibilityOfElementLocated(Colletralhighvalue_xpath));
clickonlowvalue1.click();
clickonlowvalue1.clear();
////Thread.sleep(1000);
clickonlowvalue1.sendKeys(data);
}
catch(Exception ex){

}
return data;
}

//click on colletral ineligible
public  boolean clickonineligible()
{
try{
WebElement clickonineligible =new WebDriverWait(driver,5)
.until(ExpectedConditions.visibilityOfElementLocated(Colletralhighvalue_xpath));
clickonineligible.click();
clickonineligible.isSelected();
return true;}
catch(Exception ex){
return false;
}
}
//click on colletral ineligible
public  boolean clickonineligible1()
{
try{
WebElement clickonineligible =new WebDriverWait(driver,5)
.until(ExpectedConditions.visibilityOfElementLocated(Colletralhighvalue_xpath));

clickonineligible.isDisplayed();
return true;}
catch(Exception ex){
return false;
}
}
//click on colletralineligibilityreason 
public  boolean clickonineligibilityreason()
{
try{
WebElement clickonineligibilityreason =new WebDriverWait(driver,5)
.until(ExpectedConditions.visibilityOfElementLocated(Colleteralineligibilityreason_xpath));
clickonineligibilityreason.click();
clickonineligibilityreason.isDisplayed();
return true;}
catch(Exception ex){
return false;
}
}
//click on colletralineligibilityreason 
public  String  clickonineligibilityreason1(String data)
{
try{
WebElement clickonineligibilityreason =new WebDriverWait(driver,5)
.until(ExpectedConditions.visibilityOfElementLocated(Colleteralineligibilityreason_xpath));
clickonineligibilityreason.click();
////Thread.sleep(2000);
clickonineligibilityreason.sendKeys(data);
}
catch(Exception ex){

}
return data;
}

//click oncolletral  currency id 
public  boolean clickoncurrencyid()
{
try{
WebElement clickoncurrencyid =new WebDriverWait(driver,5)
.until(ExpectedConditions.visibilityOfElementLocated(Colletralcurrencyid_xpath));
clickoncurrencyid.click();
clickoncurrencyid.isDisplayed();
return true;}
catch(Exception ex){
return false;
}
}
//click on colletralineligibilityreason 
public  String  clickoncurrencyid1(String data)
{
try{
WebElement clickoncurrencyid1 =new WebDriverWait(driver,5)
.until(ExpectedConditions.visibilityOfElementLocated(Colletralcurrencyid_xpath));
clickoncurrencyid1.click();
////Thread.sleep(2000);
clickoncurrencyid1.sendKeys(data);
}
catch(Exception ex){

}
return data;
}

//click oncolletral  based on 
public  boolean clickonbasedon()
{
try{
WebElement clickonbasedon =new WebDriverWait(driver,5)
.until(ExpectedConditions.visibilityOfElementLocated(Colletralbasedon_xpath));
clickonbasedon.click();
clickonbasedon.isDisplayed();
return true;}
catch(Exception ex){
return false;
}
}
//click on colletralineligibilityreason 
public  String  clickonbasedon1(String data)
{
try{
WebElement clickonbasedon1 =new WebDriverWait(driver,5)
.until(ExpectedConditions.visibilityOfElementLocated(Colletralbasedon_xpath));
clickonbasedon1.click();
////Thread.sleep(2000);
clickonbasedon1.sendKeys(data);
}
catch(Exception ex){

}
return data;
}

//click oncolletral  calculate cap
public  boolean clickoncalculatedcap()
{
try{
WebElement clickoncalculatedcap =new WebDriverWait(driver,5)
.until(ExpectedConditions.visibilityOfElementLocated(Colletralcalculated_xpath));
clickoncalculatedcap.click();
clickoncalculatedcap.isDisplayed();
return true;}
catch(Exception ex){
return false;
}
}
//select colletral check box
public  boolean clickonColletralcheckbox()
{
try{
WebElement clickonColletralcheckbox =new WebDriverWait(driver,5)
.until(ExpectedConditions.visibilityOfElementLocated(ColletralCheckbox_xpath));
clickonColletralcheckbox.click();
return true;}
catch(Exception ex){
return false;
}
}
//click on division code delete symbol
public  boolean clickonColletraldelete()
{
try{
WebElement clickonColletraldelete =new WebDriverWait(driver,5)
.until(ExpectedConditions.visibilityOfElementLocated(ColletralDelete_xpath));
clickonColletraldelete.click();
return true;}
catch(Exception ex){
return false;
}
}
//click on close dilogbox symbol
public  boolean clickondelete()
{
try{
WebElement clickondelete =new WebDriverWait(driver,5)
.until(ExpectedConditions.visibilityOfElementLocated(ColletralClosebox_xpath));
clickondelete.click();
return true;}
catch(Exception ex){
return false;
}
}
//double click on division code name

public boolean doubleclickonColletralname()
{
	try
	{
		WebElement doubleclickonColletralname=new WebDriverWait(driver,5)
		.until(ExpectedConditions.visibilityOfElementLocated(ColletralEditName_xpath));
		Actions action = new Actions(driver);
		action.doubleClick(doubleclickonColletralname).build().perform();
		}
	catch (Exception e)
	{
		
	}
	return true;
	
}

//click on Colletral code reload symbol
public  boolean clickonColletralreload()
{
try{
WebElement clickonColletralreload =new WebDriverWait(driver,5)
.until(ExpectedConditions.visibilityOfElementLocated(ColletralReload_xpath));
clickonColletralreload.click();
////Thread.sleep(500);
return true;}
catch(Exception ex){
return false;
}
}
//click on colletral export
public  boolean clickoncolletralexport()
{
try{
WebElement clickoncolletralexport =new WebDriverWait(driver,5)
.until(ExpectedConditions.visibilityOfElementLocated(ColletralExport_xpath));
clickoncolletralexport.click();
return true;}
catch(Exception ex){
return false;
}
}
//click on colletral export download
public  boolean clickoncolletralexportdownload()
{
try{
WebElement clickoncolletralexportdownload =new WebDriverWait(driver,5)
.until(ExpectedConditions.visibilityOfElementLocated(Colletralexportdownload_xpath));
clickoncolletralexportdownload.click();
return true;}
catch(Exception ex){
return false;
}
}
//click on fiest pagination
public  boolean clickonfirstpagination()
{
try{
WebElement clickonfirstpagination =new WebDriverWait(driver,5)
.until(ExpectedConditions.visibilityOfElementLocated(Colletralfirstpagination_xpath));
clickonfirstpagination.click();
////Thread.sleep(2000);
return true;}
catch(Exception ex){
return false;
}
}
//click on previous pagination
public  boolean clickonpreviouspagination()
{
try{
WebElement clickonpreviouspagination =new WebDriverWait(driver,5)
.until(ExpectedConditions.visibilityOfElementLocated(ColletralPreviouspage_xpath));
clickonpreviouspagination.click();
////Thread.sleep(2000);
return true;}
catch(Exception ex){
return false;
}
}
//click on next pagination
public  boolean clickonnextpagination()
{
try{
WebElement clickonnextpagination =new WebDriverWait(driver,5)
.until(ExpectedConditions.visibilityOfElementLocated(ColletralNextpage_xpath));
clickonnextpagination.click();
////Thread.sleep(2000);
return true;}
catch(Exception ex){
return false;
}
}
//click on last pagination
public  boolean clickonlastpagination()
{
try{
WebElement clickonlastpagination =new WebDriverWait(driver,5)
.until(ExpectedConditions.visibilityOfElementLocated( Colletrallastpage_xpath));
clickonlastpagination.click();
////Thread.sleep(2000);
return true;}
catch(Exception ex){
return false;
}
}
//click on bbc
		public boolean clickonrecalculatebbc()
		{
		try{
		WebElement bbc =new WebDriverWait(driver,5)
		.until(ExpectedConditions.visibilityOfElementLocated(bbcprocess_xpath));
		bbc.click();
		////Thread.sleep(2000);
		
	return true;
		}
		catch(Exception ex){

		}
		return true;

		
	}
public boolean clickonbbcavablity()
{
try{
WebElement bbcavablity =new WebDriverWait(driver,5)
.until(ExpectedConditions.visibilityOfElementLocated(BBCAvailability_xpath));
bbcavablity.click();
////Thread.sleep(7000);

return true;
}
catch(Exception ex){

}
return false;
}
public boolean clickonbbcreport() {
	try {
	    WebElement bbcreport = new WebDriverWait(driver, 5)
		    .until(ExpectedConditions
			    .visibilityOfElementLocated(bbcreport_xpath));
	    bbcreport.click();
	    ////Thread.sleep(2000);
	    return true;
	} catch (Exception ex) {
	    return false;
	}
}
public String clickonbbcdropdown(String ClientData) 
{
try{
WebElement bbcdate =new WebDriverWait(driver,5)
.until(ExpectedConditions.visibilityOfElementLocated(bbcdilogbox_xpath));
bbcdate.click();
////Thread.sleep(5000);
bbcdate.sendKeys(ClientData);

}
catch(Exception ex){

}
return ClientData;
}
public String clickonbbcorientationdropdown(String ClientData ) throws InterruptedException{
	

	WebDriverWait wait = new WebDriverWait(driver, 5);
	wait.until(ExpectedConditions.visibilityOfElementLocated((bbcorientation_xpath)));

	WebElement element = driver.findElement((bbcorientation_xpath));
	Select sel = new Select(element);
	List<WebElement> list = sel.getOptions();	
	
	
	for(WebElement ele : list){
		
		if(ele.getText().equals(ClientData)){
			ele.click();

			Thread.sleep(500);

			break;
		}
	}
	return ClientData;

}
public boolean clickbbcxlsformat() {
	try {
	    WebElement bbcxls = new WebDriverWait(driver, 5)
		    .until(ExpectedConditions
			    .visibilityOfElementLocated(bbxxls_xpath));
	    bbcxls.click();
	    ////Thread.sleep(10000);
	    return true;
	} catch (Exception ex) {
	    return false;
	}

    }
public boolean clickonbbcavablity1()
{
try{
WebElement bbcavablity =new WebDriverWait(driver,5)
.until(ExpectedConditions.visibilityOfElementLocated(BBCAvailability_xpath));
bbcavablity.click();
////Thread.sleep(7000);

return true;
}
catch(Exception ex){

}
return false;
}
//click on bbcavablity approve
	 public boolean selectbbcavablityapprove() {
	    	try {
	    	    WebElement bbcavablityapprove = new WebDriverWait(driver, 5)
	    		    .until(ExpectedConditions
	    			    .visibilityOfElementLocated(BBcavablityapprove_xpath));
	    	    bbcavablityapprove.click();
	    	    ////Thread.sleep(10000);
	    	    return true;
	    	} catch (Exception ex) {
	    	    return false;
	    	}

	        }
	 public boolean clickonbbctrendreport() {
	    	try {
	    	    WebElement bbctrendreport = new WebDriverWait(driver, 5)
	    		    .until(ExpectedConditions
	    			    .visibilityOfElementLocated(bbctrendreport_xpath));
	    	    bbctrendreport.click();
	    	    ////Thread.sleep(500);
	    	    return true;
	    	} catch (Exception ex) {
	    	    return false;
	    	}

	        }
		public boolean clickOnBbcTrendReport()
		{
			try{

				WebElement trendnWebEelement=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(bbcTrendReport_xpath));
				trendnWebEelement.click();				
				return true;
			}
			catch(Exception ex){
				return false;
			}
	}
	 public String startdate(String ClientData)
		{
		try{
		WebElement startdate =new WebDriverWait(driver,5)
		.until(ExpectedConditions.visibilityOfElementLocated(bbcstartdate_xpath));
		startdate.click();

		Thread.sleep(500);

		startdate.sendKeys(ClientData);
		startdate.sendKeys(Keys.ESCAPE);

		}
		catch(Exception ex){

		}
		return ClientData;
		}
	 public boolean bbcanywere() {
	    	try {
	    	    WebElement bbcanywere = new WebDriverWait(driver, 5)
	    		    .until(ExpectedConditions
	    			    .visibilityOfElementLocated(clickanywere_xpath1));
	    	    bbcanywere.click();
	    	    ////Thread.sleep(500);
	    	    return true;
	    	} catch (Exception ex) {
	    	    return false;
	    	}

	        }
	 public String endtdate(String ClientData)
		{
		try{
		WebElement endtdate =new WebDriverWait(driver,5)
		.until(ExpectedConditions.visibilityOfElementLocated(enddate_xpath));
		endtdate.click();

		Thread.sleep(500);

		endtdate.sendKeys(ClientData);
		endtdate.sendKeys(Keys.ESCAPE);

		}
		catch(Exception ex){

		}
		return ClientData;
		}
	 public String clickonbbctrenddate(String ClientData)
		{
		try{
		WebElement bbctrenddate =new WebDriverWait(driver,5)
		.until(ExpectedConditions.visibilityOfElementLocated(bbctrendreportdate_xpath));
		bbctrenddate.click();
		////Thread.sleep(2000);
		bbctrenddate.sendKeys(ClientData);

		}
		catch(Exception ex){

		}
		return ClientData;
		}

public boolean clickonbbctrenddisplay() {
	try {
	    WebElement bbctrenddisplay = new WebDriverWait(driver, 5)
		    .until(ExpectedConditions
			    .visibilityOfElementLocated(bbcdisplaycomment_xpath));
	    bbctrenddisplay.click();
	    ////Thread.sleep(500);
	    return true;
	} catch (Exception ex) {
	    return false;
	}

    }
public boolean clickbbctrendgenerateoption() {
	try {
	    WebElement bbctrendgenerate = new WebDriverWait(driver, 5)
		    .until(ExpectedConditions
			    .visibilityOfElementLocated(bbctrendgenrate_xpath));
	    bbctrendgenerate.click();
	    ////Thread.sleep(500);
	    return true;
	} catch (Exception ex) {
	    return false;
	}

    }
public  boolean clickOnProcessButton() {
	 try {
		  WebElement IneligibleCalculationPageWebElement = new WebDriverWait(driver, 5)
		 .until(ExpectedConditions.elementToBeClickable(BBCRecalculationProcessButton_xpath));
		 IneligibleCalculationPageWebElement.click();
		 ////Thread.sleep(500);
		 Alert simpleAlert = driver.switchTo().alert();
		 simpleAlert.accept();
		 ////Thread.sleep(1000);
		 return true;
		 }
	 
catch (Exception ex) {
  return false;
				}
}

//click onHigh value
		public boolean clickonHighvalue() {
	    	try {
                  Thread.sleep(500);
	    	    WebElement clickoncolletralsearch = new WebDriverWait(driver,20)
	    		    .until(ExpectedConditions .visibilityOfElementLocated(Highvalue_xpath));
	    	    clickoncolletralsearch.click();
	    	    Actions action = new Actions(driver);
	    	    action.sendKeys(Keys.TAB).build().perform();

	    	    Thread.sleep(500);
	    	   

	    	    return true;
	    	} catch (Exception ex) {
	    	    return false;
	    	}

	        }
		

public boolean verfiypage() {
	try {
	    WebElement bbctrenddisplay = new WebDriverWait(driver, 5)
		    .until(ExpectedConditions
			    .visibilityOfElementLocated(Title_xpath));
	    bbctrenddisplay.isDisplayed();
	    ////Thread.sleep(500);
	    return true;
	} catch (Exception ex) {
	    return false;
	}

    }

//verify page
public boolean verfiypages() {
	try {
	    WebElement bbctrenddisplay = new WebDriverWait(driver, 5)
		    .until(ExpectedConditions
			    .visibilityOfElementLocated(BBCAvablityy_xpath));
	    bbctrenddisplay.isDisplayed();
	    ////Thread.sleep(500);
	    return true;
	} catch (Exception ex) {
	    return false;
	}

    }
//verify pasge

public boolean verfiypagess() {
	try {
	    WebElement bbctrenddisplay = new WebDriverWait(driver, 5)
		    .until(ExpectedConditions
			    .visibilityOfElementLocated(Titlee_xpath));
	    bbctrenddisplay.isDisplayed();
	    ////Thread.sleep(500);
	    return true;
	} catch (Exception ex) {
	    return false;
	}

    }
}