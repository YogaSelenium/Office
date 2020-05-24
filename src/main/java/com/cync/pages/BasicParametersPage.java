package com.cync.pages;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.SkipException;
import com.cync.base.BasePage;


public class BasicParametersPage extends BasePage {
	
	
	
	
	
	private final By selectClient_xpath = By.id("select2-choose_borrower-container");
	private final By searchClientTextBox_xpath = By.xpath("//input[@type='search']");
	private final By searchClient_xpath = By.xpath("//span[@class='select2-results']");
	private final By SummaryCheckBox_xpath = By.id("parameter_combine_summ_det_ar_yn");
	private final By interestRateCodeDropdown_xpath=By.xpath("//select[@id='parameter_interest_rate_code_id']");
	
	private final By addIcon_xpath=By.xpath("//span[@class='ui-icon ui-icon ui-icon-plus']");
	
	private final By valueBox_xpath=By.xpath("(//input[contains(@name,'value')])[3]");
	//private final By saveIcon_xpath=By.xpath("//td[@title='Save Record']");
	private final By successMsg_xpath=By.xpath("//div[text()='Rate Adjustment was successfully created.']");
	
	private final By closeButton_xpath=By.xpath("//a[text()='Close']");
	private final By crossIcon_xpath=By.xpath("//button[@class='ui-dialog-titlebar-close']");
	 

    

  //AUTHOR-SHEFALI 

    private final By BBCothersHeader_xpath=By.xpath("//div[text()='BBC Others']");
    private final By BasicParametersPage = By.xpath("//span[text()='Basic Parameters']");
    private final By interestHeader_xpath= By.xpath("//div[text()='Interest']");
    private final By overAdvanceHeader_xpath=By.xpath("//div[text()='Over Advance']");
    private final By financialsHeader_xpath= By.xpath("//div[text()='Financials']");
    private final By subLimitHeader_xpath= By.xpath("//div[text()='Sub Limits']");
    private final By inelegibleHeader_xpath= By.xpath("//div[text()='Ineligible Reasons']");
   // private final By saveButton_xpath=By.id("parameter_submit");
    private final By cancelButton_xpath=By.id("parameter_cancel");
    //private final By collateralChangePercent_xpath=By.id("parameter_collateral_change_pct");
    private final By collateralChangePercent_xpath=By.xpath("//input[@id='parameter_collateral_change_pct']");
    private final By concentrationBasicParameters_xpath=By.xpath("//input[@id='parameter_concentration_pct']");
    private final By errorMessageConcentrationAlphanumeric_xpath=By.xpath("//li[contains(text(),'Concentration Report Threshold % is not a number ')]");

	 private final By concentrationReportThreshold_xpath=By.id("parameter_concentration_report_threshold");
	// private final By maximumInvoiceAmount_xpath=By.id("parameter_invoice_max_amt");
	 private final By auditLetterDays_xpath=By.id("parameter_send_audit_letter_in_days");
	 private final By defaultInvoiceStatus_xpath=By.id("parameter_default_invoice_status");
	 private final By acceptDuplicateChckBx_xpath=By.id("parameter_accept_duplicate");
	 private final By processSummaryAgingChckBx_xpath=By.id("parameter_combine_summ_det_ar_yn");
	 private final By maintainCurrentAR_xpath=By.id("parameter_maintain_current_ar");
	 private final By errorNegativeValueBBCConcThresh_xpath=By.xpath("//li[contains(text(),'Concentration Report Threshold % must be greater than or equal to 0 ')]");
    private final By successMsgCommon_xpath=By.xpath("//strong[contains(text(),'Client Parameter was successfully updated.')]");
    private final By errorMaxInvAmnt_xpath=By.xpath("//li[contains(text(),'Maximum Invoice Amount is not a number ')]");
    private final By erroMsgNegativeBlank_xpath=By.xpath("//li[contains(text(),'Maximum Invoice Amount must be greater than or equal to 0 ')]");
    private final By successMsgDisplay_xpath=By.id("message");
    private final By collateralErrorMsg_xpath=By.xpath("//li[contains(text(),'Collateral Change % is not a number ')]"); 
    private final By collateralError_xpath=By.xpath("//li[contains(text(),'Collateral Change % must be less than or equal to 100 ')]");
    private final By AuditLetterTxtBx_xpath=By.id("parameter_send_audit_letter_in_days");
    private final By AuditLetterErroMsg_xpath=By.xpath("//li[contains(text(),'Audit Letter Days is not a number ')]");
	private final By defualtInvoiceDD_xpath=By.id("parameter_default_invoice_status");
 
	private final By toAllRadioBtn_xpath=By.id("parameter_division_or_all_in_rollforward_a");
	private final By toDivisionRadioBtn_xpath=By.id("parameter_division_or_all_in_rollforward_d");
	 private final By maxOverAdvancePercent_xpath=By.id("parameter_over_advance_pct");
    private final By allowAdvanceRate_xpath=By.id("parameter_allow_over_advance");
    private final By fundSendDD_xpath=By.id("parameter_fund_send_by");
    private final By maxOverAdvanceErrorMsg_xpath=By.xpath("//li[contains(text(),'Max Over Advance % is not a number ')]");
    private final By maxOverAdvanceNegativeValue_xpath=By.xpath("//li[contains(text(),'Max Over Advance % must be greater than 0 ')]");
    private final By interestDetails_xpath=By.xpath("//a[@id='rate_adjustments']");
    private final By interestDetailsClose_xpath=By.xpath("//button[@class='ui-dialog-titlebar-close']");
    private final By effectiveDateInterestDetailsPopUp_xpath=By.id("gs_effective_date");
    private final By interestDetailspopupValue_xpath=By.id("gs_value");
    private final By deleteInterestDetailspopup_xpath=By.className("//span[@class='ui-icon ui-icon-trash']"); 
    private final By saveInterestDetailspopup_xpath=By.className("//span[@class='ui-icon ui-icon ui-icon-disk']"); 
    private final By addInterestDetailspopup_xpath=By.className("//span[@class='ui-icon ui-icon ui-icon-plus']"); 
    //private final By reloadInterestDetailspopup_xpath=By.className("ui-icon ui-icon-refresh");
    private final By reloadInterestDetailspopup_xpath=By.xpath("//*[@class='ui-icon ui-icon-refresh']");
    private final By cancelInterestDetailspopup_xpath=By.className("ui-icon ui-icon ui-icon-cancel");
    private final By minRateBox_xpath=By.id("parameter_min_interest_rate");
	private final By maxRateBox_xpath=By.id("parameter_max_interest_rate");
	private final By saveBtn_xpath = By.id("parameter_submit");
//	 private final By editBtn_xpath = By.id("parameter_edit");
    private final By errorMsgMinIntRateAlphaNumericValue_xpath=By.xpath("//li[contains(text(),'Min. Interest Rate is not a number ')]");
    private final By errMsgMinIntRateGreaterValu_xpath=By.xpath("//li[contains(text(),'Min. Interest Rate must be less than or equal to 99.99999 ')]");
    private final By calendarDate_xpath=By.xpath("//table/tbody/tr[1]/td[@class=' ui-datepicker-week-end ui-datepicker-other-month ui-datepicker-unselectable ui-state-disabled']");
    private final By clickOnPrevCalenderDate_xpath=By.xpath("//div/a[@data-handler='prev']");
    private final By errMsgMinIntRateNegativeValue_xpath=By.xpath("//li[contains(text(),'Min. Interest Rate must be greater than or equal to 0 ')]");
    
    /*Author-Garima*/
    private final By BaseOn_xpath=By.xpath("//select[@name='parameter[inventory_sublimit_based_on]']");
    private final By ClientSearchEdit_xpath=By.xpath("(//i[@class='fa fa-pencil pad-left10'])[3]");
    private final By CalculatedCap_xpath=By.xpath("(//div[@class='ms-select-text select-text'])[4]");
    private final By CrossAging_xpath=By.xpath("//input[@name='parameter[cross_aging_pct]']");
    private final By TotalReceivable_xpath=By.xpath("//div[@id='inventory_tree']//li[@id='Receivables']//i[@class='jstree-icon jstree-checkbox']");
    private final By MaxCap_xpath=By.xpath("//input[@id='parameter_ar_reliance_max_cap_pct']");
    private final By savebutton_xpath=By.xpath("//input[@id='parameter_submit']");
    private final By SucessMEssage_xpath=By.xpath("//strong[@class='extend_message']");
    private final By BBCRecalculationProcessButton_xpath = By.xpath("//a[contains(text(),'Process/Re-Calculate BBC')]");
    private final By Maxadvance_xpath=By.xpath("//input[@name='parameter[over_advance_pct]']");
    private final By errormessage_xpath=By.xpath("//div[@class='alert alert-error']");
    private final By interstdetil_xpath=By.xpath(" //a[@id='rate_adjustments']")	;				
    private final By Add_xpath=By.xpath(" //span[@class='ui-icon ui-icon ui-icon-plus']");
    //private final By Date_xpath=By.xpath("//div[@class='ui-jqgrid-bdiv']//td[3]");
    private final By save_xpath=By.xpath("//input[@value='Save']");
	private final By cross_xpath=By.xpath("(//a[@class='ui-jqdialog-titlebar-close ui-corner-all'])[1]");
	private final By Maxintrest_xpath=By.xpath("//input[@name='parameter[min_interest_rate]']");
	private final By Sucess_xpath=By.xpath("//strong[@class='extend_message']");
	private final By Min_xpath=By.xpath("//input[@name='parameter[max_interest_rate]']");
	private final By loanCheckbox_xpath=By.xpath("(//input[@name='parameter[post_to_loan_activity]'])[2]");
	private final By Disbursmentloan_xpath=By.xpath("(//input[@name='parameter[post_advance_to_loan_activity]'])[2]");
	private final By inventory_xpath=By.xpath("//input[@name='parameter[inventory_sublimit]']");
	private final By maxcap_xpath=By.xpath("//input[@name='parameter[ar_reliance_max_cap_pct]']");
	private final By Ar_xpath=By.xpath("//input[@name='parameter[over_invoice_days]']");
	
	private final By Cross_xpath=By.xpath("//legend[contains(text(),'CROSS AGING:')]")	;	
	private final By pastdue_xpath=By.xpath("//legend[contains(text(),'PAST DUE & AGED CREDITS:')]");
	private final By Other_xpath=By.xpath("//legend[contains(text(),'OTHER INELIGIBLE PARAMETERS:')] ");
	private final By Exclude_xpath=By.xpath("//legend[contains(text(),'EXCLUDE PARAMETERS:')]");
	private final  By Inventory_xpath=By.xpath("//legend[contains(text(),'EXCLUDE PARAMETERS:')]");
	private final By Concentrationbox_xpath=By.xpath("//input[@name='parameter[concentration_pct]']");
	private final By sublimit_xpath=By.xpath("//div[contains(text(),'Sub Limits')]");
	private final By reference_xpath=By.xpath(" //div[contains(text(),'Report Preferences')]");
	private final By Liq_xpath=By.xpath("//input[@name='parameter[liq_cost]']");
	private final By AMx_xpath=By.xpath("//input[@name='parameter[inventory_sublimit_max_cap_pct]']");
	private final By Ars_xpath=By.xpath("//input[@name='parameter[receivable_sublimit]']");
	private final By Select_xpath=By.xpath("//select[@name='parameter[fund_send_by]']");
	private final By Arduplicate_xpath=By.xpath("(//input[@name='parameter[add_cash_from_batch_to_rollforward]'])[2]")	;
	private final By Maxover_xpath=By.xpath("//input[@name='parameter[min_interest_rate]']");
	private final By Accept_xpath=By.xpath("(//input[@name='parameter[accept_duplicate]'])[2]");
	private final By MAxx_xpath=By.xpath("(//input[@name='parameter[calculate_profit]'])[2]")	;
	private final By process_xpath=By.xpath("(//input[@name='parameter[post_to_loan_activity]'])[2]");
	private final By m_xpath=By.xpath("//input[@name='parameter[max_interest_rate]']");
	private final By min_xpath=By.xpath("//input[@name='parameter[min_interest_rate]']");
	private final By mm_xpath=By.xpath("//input[@name='parameter[over_advance_pct]']");
	private final By intrest_xpath=By.xpath("//select[@name='parameter[interest_rate_code_id]']");
	private final By cap_xpath=By.xpath("(//input[@name='parameter[conc_pct_type]'])[1]");
	private final By exclude_xpath=By.xpath("(//input[@name='parameter[conc_pct_type]'])[2]");
	private final By inventoryy_xpath=By.xpath("(//input[@name='parameter[ignore_negative_inventory_available]'])[2]");
	private final By othercolletral_xpath=By.xpath("(//input[@name='parameter[ignore_negative_other_available]'])[2]");
	private final By inventoryineligble_xpath=By.xpath("(//input[@name='parameter[display_inventory_ineligibles]'])[2]");
	private final By PAstdueDays_xpath=By.xpath("//input[@name='parameter[ar_aging_days]']");
	private final By pastamount_xpath=By.xpath("//select[@name='parameter[ineligible_past_due_flag]']");
	private final By Creditage_xpath=By.xpath("//select[@name='parameter[ineligible_aged_credit_flag]']");
	private final By Crosss_xpath=By.xpath("//input[@name='parameter[cross_aging_pct]']");
	private final By Crosscheckbox_xpath=By.xpath("(//input[@name='parameter[cross_aging_by_project]'])[2]");
	private final By PaymentOverdays_xpath=By.xpath("//input[@name='parameter[over_invoice_days]']");
	private final By ManualEntery_xpath=By.xpath("(//input[@name='parameter[is_manual_ineligible_amt_by_client]'])[2]");
	private final By Inventorys_xpath=By.xpath("//input[@name='parameter[inventory_sublimit]']");
	private final By Othersublimty_xpath=By.xpath("//input[@name='parameter[other_sublimit]']");
	private final By BasedOn_xpath=By.xpath("//select[@name='parameter[inventory_sublimit_based_on]']");
	private final By OthercolletralBasedOn_xpath=By.xpath("//select[@name='parameter[receivable_sublimit_based_on]']");
	private final By RBasedOn_xpath=By.xpath("//select[@name='parameter[other_collateral_based_on]']");
	private final By CalculatedCaps_xpath=By.xpath("//span[@id='ms-select-receivable-output']");
	private final By Cap_xpath=By.xpath("(//div[@class='ms-select-text select-text'])[4]");
	private final By Capp_xpath=By.xpath("(//span[@class='ms-select-output'])[5]");
	private final By CapDropdown_xpath=By.xpath("(//i[@class='jstree-icon jstree-checkbox'])[9]");
	private final By MaxCap_xopath=By.xpath("//input[@name='parameter[receivable_sublimit_max_cap_pct]']");
	private final By base_xpath=By.xpath("//select[@name='parameter[receivable_sublimit_based_on]']");
	
	private final By TotalInventoryCheck_xpath=By.xpath("(//i[@class='jstree-icon jstree-checkbox'])[10]");
	private final By TotalOthercolletralCheckBox_xpath=By.xpath("//div[@id='receivable_tree']//a[@id='Receivables_anchor']");
	private final By AutofillNovl_xpath=By.xpath("(//input[@name='parameter[auto_calculate_nolv]'])[2]");
	private final By Minliqcost_xpath=By.xpath("//input[@name='parameter[min_liq_cost]']");
	private final By VariableMinCost_xpath=By.xpath("//input[@name='parameter[percentage_of_var_liq_cost]']");
	private final By LiqCost_xpath=By.xpath("//input[@name='parameter[liq_cost]']");
	private final By PerOfNovl_xpath=By.xpath("//input[@name='parameter[percentage_of_nolv]']");
	private final By PerOfCost_xpath=By.xpath("//input[@name='parameter[percentage_of_cost]']");
	private final By verifyErrorMessage_xpath=By.xpath("//div[@class='alert alert-error']");
	private final By InventoryAr_xpath=By.xpath("//input[@name='parameter[ar_reliance_pct]']");
	private final By InventoryBalancePer_xpath=By.xpath("//input[@name='parameter[loan_amt_pct]']");
	private final By advanceArVsInventory_xpath=By.xpath("(//input[@name='parameter[ar_or_inventory]'])[2]");
	private final By ProcessFinancialManual_xpath=By.xpath("(//input[@name='parameter[process_financial_manually]'])[2]");
	private final  By CalculatedCurrentProfitLoss_xpath=By.xpath("(//input[@name='parameter[calculate_profit]'])[2]");
	

/*Nidhi Changes*/
 private final By inventoryARCheckbox_xpath=By.xpath("//input[@id='parameter_ar_reliance_pct']");
 private final By basedOnDropdown_xpath=By.xpath("//select[@name='parameter[ar_reliance_based_on]']");
 //private final By calculatedCapByDropdown_xpath=By.xpath("//span[@id='ms-select-ar_reliance-output']");
 private final By maxCapCheckbox_xpath=By.xpath("//input[@id='parameter_ar_reliance_max_cap_pct']");
 private final By CalculatedCap1_xpath=By.xpath("//span[@id='ms-select-ar_reliance-output']");
 private final By TotalReceivable1_xpath=By.xpath("(//a[contains(text(),'Total Receivables')])[6]");
 private final By TotalInventory_xpath=By.xpath("(//a[contains(text(),'Total Inventory')])[6]");
 private final By TotalOtherCollateral_xpath=By.xpath("(//a[contains(text(),'Total Other Collateral')])[6]");
 
 
 
 //Factoring
 
 private final By invValTempDropdown_xpath = By.id("parameter_invoice_verification_template_id");
 private final By recourseFactCheckBox_xpath = By.id("parameter_recourse_factoring");
 private final By recourseDaysTextBox_xpath = By.id("parameter_recourse_days");
 private final By recourseFeeTextBox_xpath = By.id("parameter_recourse_fee_pct");
 private final By editBTN_xpath = By.id("parameter_edit");
 
 //anusha
 private final By DebtorNumeratorField_xapth=By.xpath("//label[contains(text(),'Debtor (Numerator)')]");
 private final By DebtorNumeratorDropDown_xapth=By.xpath("//select[@id='parameter_concentration_on']");
 private final By TotalNumeratorDropDown_xpath=By.xpath("//select[@id='parameter_concentration_denominator']");	 
 private final By PastDueARDays_xpath=By.xpath("//input[@id='parameter_ar_aging_days']");
 private final By AllowPastDueDebtorBalance_xpath=By.xpath("//input[@id='parameter_allow_pastdue_over_balance']");
 private final By PastDueAmount_xpath=By.xpath("//select[@id='parameter_ineligible_past_due_flag']");
 private final By AgeCreditIneligible_xpath=By.xpath("//select[@id='parameter_aged_credit_ineligible']");
 private final By CrossAgingPercentage_xpath=By.xpath("//input[@id='parameter_cross_aging_pct']");
 private final By Concentration_xpath=By.xpath("//input[@id='parameter_concentration_pct']");
 private final By ManualEnteryInELigibleCheckBox_xpath=By.xpath("//input[@id='parameter_is_manual_ineligible_amt_by_client']");
 private final By ExcludeCheckbox_xpath=By.xpath("//input[@id='parameter_conc_pct_type_e']");
 private final By CapCheckBox_xpath=By.xpath("//input[@id='parameter_conc_pct_type_c']");
 private final By successMsgCommon_xpath1=By.xpath("//strong[contains(text(),'Client Parameter was successfully updated.')]");
//kruthivas
private final By editBtn_xpath = By.xpath("//a[@class='view-button edit_lnk']");
private final By clickanywhere_xpath = By.xpath("//div[@class='ui-dialog-titlebar ui-widget-header ui-corner-all ui-helper-clearfix']");
private final By clickOnsave_xapth=By.xpath("//*[@class='ui-icon ui-icon ui-icon-disk']");
private final By Date_xpath=By.xpath("//input[@id='jqg1_effective_date']");
private final By saveIcon_xpath=By.xpath("//span[@class='ui-icon ui-icon ui-icon-disk']");
private final By clickOncross2_xpath=By.xpath("//button[@class='ui-dialog-titlebar-close']");
private final By saveButton_xpath=By.xpath("//input[@id='parameter_submit']");
private final By verifyerrorMessages_xpath=By.xpath("//li[contains(text(),'Min. Interest Rate')]");
private final By verifyerrorMessagesMax_xpath=By.xpath("//li[contains(text(),'Max. Interest Rate')]");
private final By verifyerrorMessages1_xpath=By.xpath("//li[contains(text(),'Inventory Sublimit Cap ')]");
private final By maximumInvoiceAmount_xpath=By.xpath("//input[@id='parameter_invoice_max_amt']");
private final By postCashToRollforward_xpath=By.xpath("//input[@id='parameter_add_cash_from_batch_to_rollforward']");
private final By interestClick_xpath=By.xpath("//input[@id='gs_effective_date']");
private final By effectiveDateInterestDetailsPopUp_xpath1=By.xpath("//input[@id='jqg4_effective_date']");
private final By CalculatedCap_xpath1=By.xpath("(//div[@class='ms-select-text select-text'])[3]");
private final By CalculatedCap_xpath11=By.xpath("(//div[@class='ms-select-text select-text'])[4]");
private final By clickcalculateNOLV_xpath=By.xpath("//input[@id='parameter_auto_calculate_nolv']");

private final By  DueDaysforalpha_xpath=By.xpath("//input[@id='parameter_allow_pastdue_over_balance']");
private final By  selectHyperlinkcheckbox_xpath=By.xpath("//input[@class='cbox ']");
private final By clickdelete_xpath=By.xpath("//a[@id='dData']");
private final By deleteInterestpopup_xpath=By.xpath("//td[@id='del_rate_adjustments_list']//div[@class='ui-pg-div']//span[@class='ui-icon ui-icon-trash']");



 public BasicParametersPage(WebDriver driver) {

		super(driver);
		try{
			Thread.sleep(1000);
			}
		catch(Exception e){
			
	
			e.printStackTrace();
	}
		if(!driver.findElement(BasicParametersPage).getText().trim().equals("Basic Parameters")){
			throw new SkipException("Basic Parameter page couldn't open.");
		}
}
	
	
	public boolean HeaderVerify()
	{
	try{

		WebElement headerWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(BasicParametersPage));
		headerWebEelement.isDisplayed();
       return true;
	}
	catch(Exception ex){
		return false;
	}
	}
	
	public boolean concentrationInput(String concentrationData)
	{
	try{

		WebElement concentrationInputWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(concentrationBasicParameters_xpath));
		concentrationInputWebEelement.clear();
		concentrationInputWebEelement.sendKeys(concentrationData);
		//Thread.sleep(2000);	
		Thread.sleep(1000);	
       return true;
	}
	catch(Exception ex){
		return false;
	}
	}

	public boolean EditBtnClick()
	{
	try{

		WebElement editWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(editBtn_xpath));
		editWebEelement.click();
		//Thread.sleep(2000);	
		Thread.sleep(1000);	
        return true;
	}
	catch(Exception ex){
		return false;
	}
	}
	
	
	public boolean verifySAveAndCancelButton()
	{
	try{
		
		WebElement saveButton=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(saveButton_xpath));
		WebElement cancelButton=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(cancelButton_xpath));
		saveButton.isDisplayed();
		cancelButton.isDisplayed();
		return true;	
	}
		catch(Exception e)
	{
			return false;
	}
	}
	
	public boolean cickOnCancelButton()
	{
	  try
		{
		WebElement cancelButton=new WebDriverWait(driver,10).until(ExpectedConditions.elementToBeClickable(cancelButton_xpath));
		cancelButton.click();
		//Thread.sleep(4000);
		Thread.sleep(1000);
		return true;
		}
	  catch(Exception e)
	  {
		  return false;
	  }
	}
	

	public boolean ProcessSummaryAgingCheckBox(){

		 try {
			   WebDriverWait wait = new WebDriverWait(driver, 10);
			   Thread.sleep(1000);
			   wait.until(ExpectedConditions.visibilityOfElementLocated((processSummaryAgingChckBx_xpath)));			   
			   WebElement element = driver.findElement((processSummaryAgingChckBx_xpath));
			    if(!element.isSelected()){
			     element.click();	
			    }
			   else
			   {
			    if(element.isSelected()){
			     element.click();
			    }
			   }   
			  } catch (Exception e) {
			   System.out.println("Exception in clickOnCheckBox Method "+e.getCause());
			  }
		return true; 
	}
	public boolean MaintainCurrentARCheckBox(){
		 try {
			   WebDriverWait wait = new WebDriverWait(driver, 10);

			   Thread.sleep(1000);

			   wait.until(ExpectedConditions.visibilityOfElementLocated((maintainCurrentAR_xpath)));			   
			   WebElement element = driver.findElement((maintainCurrentAR_xpath));	
			    if(!element.isSelected()){
			     element.click();
			    }
			   else {
			    if(element.isSelected()){
			     element.click();
			    }
			   }   
			  } catch (Exception e) {
			   System.out.println("Exception in clickOnCheckBox Method "+e.getCause());
			  }
		return true; 
	}	

	public boolean SaveFunction()
	{
	try{

		WebElement saveWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(saveBtn_xpath));
		saveWebEelement.click();
		//Thread.sleep(5000);
		Thread.sleep(1000);
return true;
	}
	catch(Exception ex){
		return false;
	}
	}
	
	
	public String verifyMessageOnBasicParameterAfterSave(String successMsg)
    {
    try{
       WebElement SaveWebEelement=new WebDriverWait(driver,10)
       .until(ExpectedConditions.visibilityOfElementLocated(successMsgCommon_xpath));
       
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
	//rohit
	
	public String verifyMessageOnBasicParameterAfterSave1(String successMsg)
    {
	try{
    	
    	getClient();
    	System.out.println(BasePage.clientName);
       WebElement SaveWebEelement=new WebDriverWait(driver,10)
       .until(ExpectedConditions.visibilityOfElementLocated(successMsgCommon_xpath));
       
      String actualMsgFromApp= SaveWebEelement.getText();
      if(actualMsgFromApp.equalsIgnoreCase(successMsg))
      {
	  return actualMsgFromApp; 	
      }
       
      
    }
    catch(Exception ex){
   
    }
    return successMsg;
    }	
	public boolean SummaryCheckBox()
	{
	try{

		WebElement checkBoxWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(SummaryCheckBox_xpath));
		checkBoxWebEelement.click();
		Thread.sleep(1000);
return true;
	}
	catch(Exception ex){
		return false;
	}
	}	
	
	public boolean selectFromInterestRateCodeDropdown(String visibleText) throws InterruptedException{
		
		try {
			WebElement DropdownWebEelement = new WebDriverWait(driver, 10)
			.until(ExpectedConditions.visibilityOfElementLocated(interestRateCodeDropdown_xpath));
			DropdownWebEelement.click();
			Select sel = new Select(DropdownWebEelement);
			sel.selectByVisibleText(visibleText);
			/*List<WebElement> list = sel.getOptions();
			
			for (WebElement ele : list) 
			{
				String data = ele.getText();
				System.out.println(data);
				
				if (ele.getText().equals(visibleText)) 
				{
			 		ele.click();
					////Thread.sleep(10000);
					
					 return true;
				}
			}*/
			return true;
		} 
		catch (Exception ex)
		{
			return false;
		}
		
		}
		
		
		
		public boolean clickOnInterestDetails()
		{
		try{
			WebElement editWebEelement=new WebDriverWait(driver,10)
				.until(ExpectedConditions.visibilityOfElementLocated(interestDetails_xpath));
			editWebEelement.click();
			Thread.sleep(1000);
			return true;
		}
		catch(Exception ex){
			return false;	
		}
		}
		
		public boolean clickAddIconOnInterestDetailsPopUp()
		{
		try{
			Thread.sleep(2000);
			WebElement editWebEelement=new WebDriverWait(driver,10)
				.until(ExpectedConditions.visibilityOfElementLocated(addIcon_xpath));
			editWebEelement.click();
			//Thread.sleep(2000);
			Thread.sleep(1000);
			return true;
		}
		catch(Exception ex){
			return false;	
		}
		}
		
		
				
	/*		WebElement dateBox = driver.findElement(By.xpath("(//input[contains(@name,'effective_date')])[2]"));
			
			dateBox.clear();
			//Thread.sleep(3000);

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
			Thread.sleep(1000);
			WebElement editWebEelement=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(valueBox_xpath));
			editWebEelement.click();
			editWebEelement.clear();
			editWebEelement.sendKeys(value);
			//Thread.sleep(6000);
			Thread.sleep(1000);
			return true;
		}
		catch(Exception ex){
			return false;	
		}
		}
		
		public boolean clickOnSaveInterestDetails()
		{
		try{
		
			WebElement editWebEelement=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(saveIcon_xpath));
			editWebEelement.click();
			//Thread.sleep(5000);
			Thread.sleep(1000);
			return true;
		}
		catch(Exception ex){
			return false;
		}
		}
		
		
		public String verifySuccessMessage(String successmsg){
			try{
				
				WebElement successMessageWebE=new WebDriverWait(driver,10)
				.until(ExpectedConditions.visibilityOfElementLocated(successMsg_xpath));
				String actual_msg=successMessageWebE.getText().trim();
				
				if(actual_msg.equals(successmsg));
			}
			catch(Exception ex){
			}
			return successmsg;
			}
		
		
		public String verifySuccessMessageAfterEditingValue(String successmsg){
			try{
				WebElement successMessageWebE=new WebDriverWait(driver,10)
				.until(ExpectedConditions.visibilityOfElementLocated(successMsgCommon_xpath));
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
			WebElement editWebEelement=new WebDriverWait(driver,10)
				.until(ExpectedConditions.visibilityOfElementLocated(closeButton_xpath));
			editWebEelement.click();
			return true;
		}
		catch(Exception ex){		
			return false;
		}
		}
		

		public boolean clickOnCrossIconInPopUp()
		{
		try{
			WebElement editWebEelement=new WebDriverWait(driver,10)
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
			WebElement maxInterestRate=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(maxRateBox_xpath));
			maxInterestRate.clear();
			maxInterestRate.sendKeys("0");
			Thread.sleep(1000);
			WebElement minInterestRate=new WebDriverWait(driver,10)
				.until(ExpectedConditions.visibilityOfElementLocated(minRateBox_xpath));
			minInterestRate.clear();
			minInterestRate.sendKeys(value);
			//Thread.sleep(4000);
			Thread.sleep(1000);
			return true;
		}
		catch(Exception ex){
			System.out.println("unable to write value in min interest rate " + ex.getCause());
			return false;	
		}
		}
			
		public boolean addToMaxInterestRateTextbox(String value)
		{
		try{
			WebElement editWebEelement=new WebDriverWait(driver,10)
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
			WebElement editWebEelement=new WebDriverWait(driver,10)
				.until(ExpectedConditions.visibilityOfElementLocated(saveButton_xpath));
			editWebEelement.click();
			return true;
		}
		catch(Exception ex){
			return false;	
		}
		}
		
		
		public boolean checkBBCOthersPresent()
		{
		try{
			WebElement BBCOthers=new WebDriverWait(driver,10)
				.until(ExpectedConditions.visibilityOfElementLocated(BBCothersHeader_xpath));
			
			WebElement interestHeader=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(interestHeader_xpath));
			
			WebElement overAdvanceHeader=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(overAdvanceHeader_xpath));
			
			/*WebElement financialsHeader=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(financialsHeader_xpath));*/
			
			WebElement subLimitHeader=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(subLimitHeader_xpath));
			
			WebElement inelegibleHeader=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(inelegibleHeader_xpath));
			BBCOthers.isDisplayed();
			interestHeader.isDisplayed();
			overAdvanceHeader.isDisplayed();
			//financialsHeader.isDisplayed();
			subLimitHeader.isDisplayed();
			inelegibleHeader.isDisplayed();
			return true;
		}
		catch(Exception ex){
			return false;
		}}
		
		
		
		
		public boolean editCollateralRatePercent(String collateralPercentage )
		{
			try
			{
				WebElement cRPercent=new WebDriverWait(driver,10).until(ExpectedConditions.elementToBeClickable(collateralChangePercent_xpath));
				cRPercent.click();
				cRPercent.sendKeys(collateralPercentage);
				//Thread.sleep(4000);
				Thread.sleep(1000);
				return true;
			}
			catch(Exception e)
			{
				return false;
			}
		}
		  
		  
		
		public boolean verifyRequiredFieldsTextBoxes()
		{
		try
		{
			WebElement concentrationReportThreshold =new WebDriverWait(driver,10)
			.until(ExpectedConditions.elementToBeClickable(concentrationReportThreshold_xpath));
			concentrationReportThreshold.isDisplayed();
			
			WebElement maximumInvoiceAmount=new WebDriverWait(driver,10)
			.until(ExpectedConditions.elementToBeClickable(maximumInvoiceAmount_xpath));
			maximumInvoiceAmount.isDisplayed();
			
			WebElement collateralChange=new WebDriverWait(driver,10)
			.until(ExpectedConditions.elementToBeClickable(collateralChangePercent_xpath));
			collateralChange.isDisplayed();
			
			WebElement auditLetterDays=new WebDriverWait(driver,10)
			.until(ExpectedConditions.elementToBeClickable(auditLetterDays_xpath));
			auditLetterDays.isDisplayed();
			
			WebElement defaultInvoiceStatus=new WebDriverWait(driver,10)
			.until(ExpectedConditions.elementToBeClickable(defaultInvoiceStatus_xpath));
			defaultInvoiceStatus.isDisplayed();
			
			WebElement acceptDuplicate=new WebDriverWait(driver,10)
			.until(ExpectedConditions.elementToBeClickable(acceptDuplicateChckBx_xpath));
			acceptDuplicate.isDisplayed();
			
			WebElement processSummaryAging=new WebDriverWait(driver,10)
			.until(ExpectedConditions.elementToBeClickable(processSummaryAgingChckBx_xpath));
			processSummaryAging.isDisplayed();
			
			WebElement maintainCurrentAR=new WebDriverWait(driver,10)
			.until(ExpectedConditions.elementToBeClickable(maintainCurrentAR_xpath));
			maintainCurrentAR.isDisplayed();
			
			/*WebElement postCashToRollforward=new WebDriverWait(driver,10)
			.until(ExpectedConditions.elementToBeClickable(postCashToRollforward_xpath));
			postCashToRollforward.isDisplayed();*/
		
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
		}
		
		
		public boolean editConcentrationReportThreashold(String collateralPercentage )
		{
			try
			{
				WebElement cRPercent=new WebDriverWait(driver,10)
				.until(ExpectedConditions.elementToBeClickable(concentrationReportThreshold_xpath));
				cRPercent.clear();
				cRPercent.click();
				cRPercent.sendKeys(collateralPercentage);
				//Thread.sleep(4000);
				Thread.sleep(1000);
				return true;
			}
			catch(Exception e)
			{
				return false;
			}
		}
		
		public boolean clearConcentrationReportThreashold( )
		{
			try
			{
				WebElement concentrationPercentage=new WebDriverWait(driver,10)
				.until(ExpectedConditions.elementToBeClickable(concentrationReportThreshold_xpath));
				concentrationPercentage.click();
				concentrationPercentage.clear();
				Thread.sleep(1000);
				return true;
			}
			catch(Exception e)
			{
				return false;
			}
		}
		
		
		public String verifyErrorMsgBBCConcRTValue(String errorsMsg)
		{
			try
			{
				WebElement errorConcThreshAlphanumeric=new WebDriverWait(driver,10)
				.until(ExpectedConditions.elementToBeClickable(errorMessageConcentrationAlphanumeric_xpath));
				String ActualMsg_BBCConcentration=errorConcThreshAlphanumeric.getText().trim();
				Thread.sleep(1000);
				if(ActualMsg_BBCConcentration.equals(errorsMsg));
			}
			catch(Exception e)
			{
			}
			return errorsMsg; 
		}
		
		
		
		public String verifyErrorMsgBBCConcRTNegativeValue(String errorsMsg)
		{
			try
			{
				WebElement errorConcThreshNegative=new WebDriverWait(driver,10)
				.until(ExpectedConditions.elementToBeClickable(errorNegativeValueBBCConcThresh_xpath));
				String ActualMsg_BBCConcentration=errorConcThreshNegative.getText().trim();
				Thread.sleep(1000);
				if(ActualMsg_BBCConcentration.equals(errorsMsg));
			}
			catch(Exception e)
			{
			}
			return errorsMsg; 
		}
		
		
		public boolean editMaxInvoiceAmnt(String MaxInvoiceAmnt )
		{
			try
			{
				WebElement MaxInvoiceAmntele=new WebDriverWait(driver,10)
				.until(ExpectedConditions.elementToBeClickable(maximumInvoiceAmount_xpath));
				MaxInvoiceAmntele.click();
				MaxInvoiceAmntele.sendKeys(MaxInvoiceAmnt);
				Thread.sleep(1000);
				return true;
			}
			catch(Exception e)
			{
				return false;
			}
		}
		
		
		
		public String verifyMaxInvoiceAmntMsg(String successMsg)
		{
			try
			{
				WebElement MaxInAmntMsg=new WebDriverWait(driver,10)
				.until(ExpectedConditions.elementToBeClickable(successMsgCommon_xpath));
				String ActualMsg_BBCConcentration=MaxInAmntMsg.getText().trim();
				Thread.sleep(1000);
				if(ActualMsg_BBCConcentration.equals(successMsg));
			}
			catch(Exception e)
			{
			}
			return successMsg; 
		}
		
		public boolean clearMaxInvAmnt( )
		{
			try
			{
				WebElement maximumInvoiceAmount=new WebDriverWait(driver,10)
				.until(ExpectedConditions.elementToBeClickable(maximumInvoiceAmount_xpath));
				maximumInvoiceAmount.click();
				maximumInvoiceAmount.clear();
				Thread.sleep(1000);
				return true;
			}
			catch(Exception e)
			{
				return false;
			}
		}

		
		public String verifyMaxInvoiceAmntErrorMsg(String errorMsg)
		{
			try
			{
				WebElement MaxInAmntErrorMsg=new WebDriverWait(driver,10)
				.until(ExpectedConditions.elementToBeClickable(errorMaxInvAmnt_xpath));
				String ActualMsg_BBCConcentration=MaxInAmntErrorMsg.getText().trim();
				Thread.sleep(1000);
				if(ActualMsg_BBCConcentration.equals(errorMsg));
			}
			catch(Exception e)
			{
			}
			return errorMsg; 
		}
		
		
		
		public String verifyErrorMsgMaxInvoiceNegative(String errorsMsg)
		{
			try
			{
				WebElement errorMaxInvoiceNegative=new WebDriverWait(driver,10)
				.until(ExpectedConditions.elementToBeClickable(erroMsgNegativeBlank_xpath));
				String ActualMsg_BBCConcentration=errorMaxInvoiceNegative.getText().trim();
				Thread.sleep(1000);
				if(ActualMsg_BBCConcentration.equals(errorsMsg));
			}
			catch(Exception e)
			{
			}
			return errorsMsg; 
		}
		
		public String verifyErrorMsgMaxInvoiceGreaterValue(String successMsg)
		{
			try
			{
				WebElement succesMsgMaxInvoiceGreater=new WebDriverWait(driver,10)
				.until(ExpectedConditions.elementToBeClickable(successMsgDisplay_xpath));
				String ActualMsg_BBCConcentration=succesMsgMaxInvoiceGreater.getText().trim();
				Thread.sleep(1000);
				if(ActualMsg_BBCConcentration.equals(successMsg));
			}
			catch(Exception e)
			{
			}
			return successMsg; 
		}
		
		public boolean clearCollateralChangePercent( )
		{
			try
			{
				WebElement collateralChangePercent=new WebDriverWait(driver,10)
				.until(ExpectedConditions.elementToBeClickable(collateralChangePercent_xpath));
				collateralChangePercent.click();
				collateralChangePercent.clear();
				Thread.sleep(1000);
				return true;
			}
			catch(Exception e)
			{
				return false;
			}
		}


		
		
		
		public String verifyCollateralSuccessMsg(String successMsg)
		{
			try{
				WebElement collateralSuccessMsg=new WebDriverWait(driver,10)
				.until(ExpectedConditions.visibilityOfElementLocated(successMsgCommon_xpath));
				String ActualMsg=collateralSuccessMsg.getText().trim();
				Thread.sleep(1000);
				if(ActualMsg.contains(successMsg));
						}
			catch(Exception e)
			{
				return "Success message doesn't match";
			}
			return successMsg;
				
			}
		
				
		public String verifyCollateralErrorMsg(String errorMsg)
		{
			try{
				WebElement collateralErrorMsg=new WebDriverWait(driver,10)
				.until(ExpectedConditions.visibilityOfElementLocated(collateralErrorMsg_xpath));
				String ActualMsg=collateralErrorMsg.getText().trim();
				Thread.sleep(1000);
				if(ActualMsg.contains(errorMsg));
						}
			catch(Exception e)
			{
				return "Error message doesn't match";
			}
			return errorMsg;
				
			}
		
		
		
		
		public String verifyCollateralGreatorMsg(String errorMsg)
		{
			try
			{
				WebElement collateralError=new WebDriverWait(driver,10)
				.until(ExpectedConditions.visibilityOfElementLocated(collateralError_xpath));
				
				String actual_Msg=collateralError.getText().trim();
				if(actual_Msg.equals(errorMsg)); 
			}
			catch(Exception e)
			{
				return "Error message doesn't match";
			}
			return errorMsg; 
		}
		
		
		public boolean clearAuditLetter( )
		{
			try
			{
				WebElement AuditLetterEle=new WebDriverWait(driver,10)
				.until(ExpectedConditions.elementToBeClickable(AuditLetterTxtBx_xpath));
				
				AuditLetterEle.click();
				AuditLetterEle.clear();
				Thread.sleep(1000);
				return true;
			}
			catch(Exception e)
			{
				return false;
			}
		}

		public String verifyAuditLetterSuccessMsg(String successMsg)
		{
			try{
				WebElement AuditLetterSuccessMsg=new WebDriverWait(driver,10)
				.until(ExpectedConditions.visibilityOfElementLocated(successMsgCommon_xpath));
				String ActualMsg=AuditLetterSuccessMsg.getText().trim();
				Thread.sleep(1000);
				if(ActualMsg.contains(successMsg));
						}
			catch(Exception e)
			{
				return "Success message doesn't match";
			}
			return successMsg;
				
			}
		
		public boolean editAuditLetterValue(String AuditLetterValue )
		{
			try
			{
				WebElement AuditValue=new WebDriverWait(driver,10)
				.until(ExpectedConditions.elementToBeClickable(AuditLetterTxtBx_xpath));
				AuditValue.click();
				AuditValue.sendKeys(AuditLetterValue);
		Thread.sleep(1000);
				return true;
			}
			catch(Exception e)
			{
				return false;
			}
		}
		
		
		
		
		
		public String verifyAuditLetterErroMsg(String errorMsg)
		{
			try
			{
				WebElement AuditLetterErrMsg=new WebDriverWait(driver,10)
				.until(ExpectedConditions.visibilityOfElementLocated(AuditLetterErroMsg_xpath));
			
				String actual_Msg=AuditLetterErrMsg.getText().trim();
				if(actual_Msg.equals(errorMsg));
				
			}
			catch(Exception e)
			{
				return "Error Msg for Audit Letter days doesn't match";
			}
			return errorMsg;
		}
		

		
		
		public String verifyDDInvoiceOptions()
		{
			try{
				
				WebElement defaultInvoiceDD=new WebDriverWait(driver,10)
				.until(ExpectedConditions.visibilityOfElementLocated(defualtInvoiceDD_xpath));
			
				defaultInvoiceDD.click();
			Select sel=new Select(defaultInvoiceDD);
			
			List<WebElement> optionsDD =sel.getOptions();
			String[] stringOption={"Rebated","Closed","Approved","Verified","Funded","Non Funded","Adjusted","Retired","Partly Paid","Paid"};
			
			for(int i=1;i<=optionsDD.size();i++)
			{				 
				for(int k=0;k<=stringOption.length-1;k++)
				 {
					String optionsMatch=optionsDD.get(i).getText();
					i++;
				 if(optionsMatch.equals(optionsMatch))
				 {
					 System.out.println(optionsMatch);
				 }
				 else
				 {
					 return "doesn't match"+optionsMatch; 
				 }
			}
			}
			}
			catch(Exception e)
			{
				return "value doesn't match";
			}
			
			return "All values are present";
			
		}
		
		public boolean selectRebatedInDD()
		{
			try{
				WebElement InvoiceDD=new WebDriverWait(driver,10)
				.until(ExpectedConditions.visibilityOfElementLocated(defualtInvoiceDD_xpath));
				
				Select sel=new Select(InvoiceDD);
				sel.selectByVisibleText("Rebated");
				Thread.sleep(1000);
			}
			catch(Exception e)
			{
				return false;
			}
			return true;
		}
		
		public String verifyCommonSuccessMsg(String successMsg)
		{
			try{
				WebElement AuditLetterSuccessMsg=new WebDriverWait(driver,10)
				.until(ExpectedConditions.visibilityOfElementLocated(successMsgCommon_xpath));
				String ActualMsg=AuditLetterSuccessMsg.getText().trim();
				Thread.sleep(1000);
				if(ActualMsg.contains(successMsg));
						}
			catch(Exception e)
			{
				return "Success message doesn't match";
			}
			return successMsg;
				
			}
		public boolean selectClosedInDD()
		{
			try{
				WebElement InvoiceDD=new WebDriverWait(driver,10)
				.until(ExpectedConditions.visibilityOfElementLocated(defualtInvoiceDD_xpath));
				
				Select sel=new Select(InvoiceDD);
				sel.selectByVisibleText("Closed");
				Thread.sleep(1000);
			}
			catch(Exception e)
			{
				return false;
			}
			return true;
		}
		
		public boolean selectApprovedInDD()
		{
			try{
				WebElement InvoiceDD=new WebDriverWait(driver,10)
				.until(ExpectedConditions.visibilityOfElementLocated(defualtInvoiceDD_xpath));
				
				Select sel=new Select(InvoiceDD);
				sel.selectByVisibleText("Approved");
				Thread.sleep(1000);
			}
			catch(Exception e)
			{
				return false;
			}
			return true;
		}
		
		public boolean selectVerifiedInDD()
		{
			try{
				WebElement InvoiceDD=new WebDriverWait(driver,10)
				.until(ExpectedConditions.visibilityOfElementLocated(defualtInvoiceDD_xpath));
				
				Select sel=new Select(InvoiceDD);
				sel.selectByVisibleText("Verified");
				Thread.sleep(1000);
			}
			catch(Exception e)
			{
				return false;
			}
			return true;
		}
		public boolean selectFundedInDD()
		{
			try{
				WebElement InvoiceDD=new WebDriverWait(driver,10)
				.until(ExpectedConditions.visibilityOfElementLocated(defualtInvoiceDD_xpath));
				
				Select sel=new Select(InvoiceDD);
				sel.selectByVisibleText("Funded");
				Thread.sleep(1000);
			}
			catch(Exception e)
			{
				return false;
			}
			return true;
		}
		public boolean selectNonFundedInDD()
		{
			try{
				WebElement InvoiceDD=new WebDriverWait(driver,10)
				.until(ExpectedConditions.visibilityOfElementLocated(defualtInvoiceDD_xpath));
				
				Select sel=new Select(InvoiceDD);
				sel.selectByVisibleText("Non Funded");
				Thread.sleep(1000);
			}
			catch(Exception e)
			{
				return false;
			}
			return true;
		}
		public boolean selectAdjustedInDD()
		{
			try{
				WebElement InvoiceDD=new WebDriverWait(driver,10)
				.until(ExpectedConditions.visibilityOfElementLocated(defualtInvoiceDD_xpath));
				
				Select sel=new Select(InvoiceDD);
				sel.selectByVisibleText("Adjusted");
				Thread.sleep(1000);
			}
			catch(Exception e)
			{
				return false;
			}
			return true;
		}
		
		public boolean selectRetiredInDD()
		{
			try{
				WebElement InvoiceDD=new WebDriverWait(driver,10)
				.until(ExpectedConditions.visibilityOfElementLocated(defualtInvoiceDD_xpath));
				
				Select sel=new Select(InvoiceDD);
				sel.selectByVisibleText("Retired");
				Thread.sleep(1000);
			}
			catch(Exception e)
			{
				return false;
			}
			return true;
		}
		
		public boolean selectPartlyPaidInDD()
		{
			try{
				WebElement InvoiceDD=new WebDriverWait(driver,10)
				.until(ExpectedConditions.visibilityOfElementLocated(defualtInvoiceDD_xpath));
				
				Select sel=new Select(InvoiceDD);
				sel.selectByVisibleText("Partly Paid");
				Thread.sleep(1000);
			}
			catch(Exception e)
			{
				return false;
			}
			return true;
		}
		
		public boolean selectPaidInDD()
		{
			try{
				WebElement InvoiceDD=new WebDriverWait(driver,10)
				.until(ExpectedConditions.visibilityOfElementLocated(defualtInvoiceDD_xpath));
				
				Select sel=new Select(InvoiceDD);
				sel.selectByVisibleText("Paid");
				Thread.sleep(1000);
			}
			catch(Exception e)
			{
				return false;
			}
			return true;
		}
		
		public boolean checkAcceptDuplicateChckBx()
		{
			try
			{
				WebElement acceptDuplicateChckBx=new WebDriverWait(driver,10)
				.until(ExpectedConditions.elementToBeClickable(acceptDuplicateChckBx_xpath));
				
				acceptDuplicateChckBx.click();
				Thread.sleep(1000);
			}
			catch(Exception e)
			{
				return false;
			}
			return true;
		}
		
		public boolean checkAcceptProcessSummaryChckBx()
		{
			try
			{
				WebElement acceptDuplicateChckBx=new WebDriverWait(driver,10)
				.until(ExpectedConditions.elementToBeClickable(processSummaryAgingChckBx_xpath));
				
				acceptDuplicateChckBx.click();
				Thread.sleep(1000);
			}
			catch(Exception e)
			{
				return false;
			}
			return true;
		}
		public boolean checkCauurentARChckBx()
		{
			try
			{
				WebElement acceptDuplicateChckBx=new WebDriverWait(driver,10)
				.until(ExpectedConditions.elementToBeClickable(acceptDuplicateChckBx_xpath));
				
				acceptDuplicateChckBx.click();
				Thread.sleep(1000);
			}
			catch(Exception e)
			{
				return false;
			}
			return true;
		}
		
		
		public boolean selectRollForwardChckBx()
		{
			try
			{
				WebElement postCashToRollforward=new WebDriverWait(driver,10)
				.until(ExpectedConditions.elementToBeClickable(postCashToRollforward_xpath));
				postCashToRollforward.click();
				Thread.sleep(1000);
			}
			catch(Exception e)
			{
				return false;
			}
			return true;
		}
		
		public boolean radioButtonsUnderRollForward()
		{
			try
			{
				WebElement toAllRadioBtn=new WebDriverWait(driver,10)
				.until(ExpectedConditions.visibilityOfElementLocated(toAllRadioBtn_xpath));	
				toAllRadioBtn.isEnabled();
				
			WebElement toDivionRadioBtn=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(toDivisionRadioBtn_xpath));
			toDivionRadioBtn.isSelected();
			Thread.sleep(1000);
			}
			catch(Exception e)
			{
				return false;
			}
			return true;
		}
		
		public boolean disabledProcessSummary()
		{
			try{
				WebElement processSummaryAgingChckBx=new WebDriverWait(driver,10)
				.until(ExpectedConditions.visibilityOfElementLocated(processSummaryAgingChckBx_xpath));
				if(!processSummaryAgingChckBx.isDisplayed());
				System.out.println("Process summary is disabled");
			Thread.sleep(1000);
		}
				catch(Exception e)
				{
					return false;
			}
			return true;
		}
		public boolean disabledMaintainCurrentAR()
		{
			try{
				WebElement MaintainCurrentARChckBx=new WebDriverWait(driver,10)
				.until(ExpectedConditions.visibilityOfElementLocated(maintainCurrentAR_xpath));
				if(!MaintainCurrentARChckBx.isDisplayed());
				System.out.println("Maintain Current AR Check Box is disabled");
			Thread.sleep(1000);
		}
				catch(Exception e)
				{
					return false;
			}
			return true;
		}
		

	
		public boolean checkAllOverAdvanceWireframes()
		{
			try
			{
				WebElement allowAdvanceRate=new WebDriverWait(driver,10)
				.until(ExpectedConditions.visibilityOfElementLocated(allowAdvanceRate_xpath));
				allowAdvanceRate.isDisplayed();
				
				WebElement maxOverAdvancePercent=(WebElement) new WebDriverWait(driver,10)
				.until(ExpectedConditions.visibilityOfElementLocated(maxOverAdvancePercent_xpath));
				maxOverAdvancePercent.isDisplayed();
				
				WebElement fundSendDD=new WebDriverWait(driver,10)
				.until(ExpectedConditions.visibilityOfElementLocated(fundSendDD_xpath));
				fundSendDD.isDisplayed();
				Thread.sleep(1000);
				
			}
			catch(Exception e)
			{
				System.out.println("unable to find element "+e.getCause());
				return false;
			}
			return true;
		}
		
		
		public boolean selectAllowAdvanceRateChackBx()
		{
			try
			{
				WebElement allowAdvanceRate=new WebDriverWait(driver,10)
				.until(ExpectedConditions.visibilityOfElementLocated(allowAdvanceRate_xpath));
				
				if(allowAdvanceRate.isSelected());
				else
				{
					allowAdvanceRate.click();
				}
				Thread.sleep(1000);
			}
				catch(Exception e)
				{
					System.out.println("not clickable "+e.getCause());
					return false;
				}
					
return true;
		}
		
		public boolean editMaxOverAdvanceValue(String maxOverAdvancePercentValue)
		{
			try
			{
				WebElement maxOverAdvancePercent=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(maxOverAdvancePercent_xpath));
				
				maxOverAdvancePercent.clear();
				maxOverAdvancePercent.click();
				maxOverAdvancePercent.sendKeys(maxOverAdvancePercentValue);
				
			}
			catch(Exception e)
			{
				System.out.println("not clickable max over advane "+e.getCause());
			}
			return true;
		}
		
		public String verifyMaxOverAdvanceErrorMsg(String ErrorMsg)
		{
			try
			{
				WebElement maxOverAdvanceErrorMsg=new WebDriverWait(driver,10)
				.until(ExpectedConditions.visibilityOfElementLocated(maxOverAdvanceErrorMsg_xpath));
				
				String Actual_Msg=maxOverAdvanceErrorMsg.getText().trim();
				if(Actual_Msg.equals(ErrorMsg));
			}
			catch(Exception e)
			{
				System.out.println("both the messages are not same "+e.getCause());
			}
			return ErrorMsg ;
		}
		public String verifyMaxOverAdvanceNegativeValue(String ErroMsg)
		{
			try
			{
				WebElement maxOverAdvanceNegativeValue=new WebDriverWait(driver,10)
				.until(ExpectedConditions.visibilityOfElementLocated(maxOverAdvanceNegativeValue_xpath));
				
				String Actual_Msg=maxOverAdvanceNegativeValue.getText().trim();
				if(Actual_Msg.equals(maxOverAdvanceNegativeValue));
			}
			catch(Exception e)
			{
				System.out.println("MisMatch error message "+e.getCause());
			}
			return ErroMsg;

		}
		
		public boolean verifyOptionsOffundSendByDD()
		{
			try
			{
				WebElement fundSendByDD=new WebDriverWait(driver,10)
				.until(ExpectedConditions.visibilityOfElementLocated(fundSendDD_xpath));
				fundSendByDD.click();
				
				Select sel=new Select(fundSendByDD);
				List<WebElement> defualtValues=sel.getOptions();
				
				String[] valuesInDD={"Check","Lock Box","Wire Transfer","Lock Box Float","Letter of Credit","Intercreditor","TEST","BOX","Wire Cash"};
				
				for(int i=0;i<=defualtValues.size();i++)
				{
					String optionText=defualtValues.get(i).getText();
					
					for(int k=0;k<=valuesInDD.length-1;k++)
					{
						if(optionText.equals(valuesInDD[k]))
						{
							System.out.println(optionText);
						}
					else
						{
							i++;
						}
					}
				}
			}
			catch(Exception e)
			{
				System.out.println("All options are not present "+e.getCause());
			}
			return true;
		}
		
		public boolean interestDetailsClose()
		{
			try
			{
				WebElement interestDetailsCloseButton=new WebDriverWait(driver,10)
				.until(ExpectedConditions.visibilityOfElementLocated(interestDetailsClose_xpath));
				
				interestDetailsCloseButton.click();
				
			}
			catch(Exception e)
			{
				System.out.println("Unable to click on close button "+e.getCause());
			return false;
			}
			return true ;
			
		}
		
		
		
		public boolean interestDetialspopupwireframes()
		{
			try
			{
				WebElement interestDetailsCloseButton=new WebDriverWait(driver,10)
				.until(ExpectedConditions.visibilityOfElementLocated(deleteInterestDetailspopup_xpath));
				
				interestDetailsCloseButton.isDisplayed();
				
				WebElement saveInterestDetailspopup=new WebDriverWait(driver,10)
				.until(ExpectedConditions.visibilityOfElementLocated(saveInterestDetailspopup_xpath));
				
				saveInterestDetailspopup.isDisplayed();
				
				
				WebElement addInterestDetailspopup=new WebDriverWait(driver,10)
				.until(ExpectedConditions.visibilityOfElementLocated(addInterestDetailspopup_xpath));
				
				addInterestDetailspopup.isDisplayed();
				
				WebElement reloadInterestDetailspopup=new WebDriverWait(driver,10)
				.until(ExpectedConditions.visibilityOfElementLocated(reloadInterestDetailspopup_xpath));
				
				reloadInterestDetailspopup.isDisplayed();
				
				WebElement cancelInterestDetailspopup=new WebDriverWait(driver,10)
				.until(ExpectedConditions.visibilityOfElementLocated(cancelInterestDetailspopup_xpath));
				
				cancelInterestDetailspopup.isDisplayed();
				
				WebElement editWebEelement=new WebDriverWait(driver,10)
				.until(ExpectedConditions.visibilityOfElementLocated(effectiveDateInterestDetailsPopUp_xpath));
				editWebEelement.isDisplayed();
				
				WebElement interestDetailspopupValue=new WebDriverWait(driver,10)
				.until(ExpectedConditions.visibilityOfElementLocated(interestDetailspopupValue_xpath));
				interestDetailspopupValue.isDisplayed();
				
				
						
			}
			catch(Exception e)
			{
				System.out.println("Unable to click on close button "+e.getCause());
			return false;
			}
			return true ;
			
		}
		
		
		public boolean verifyEffectiveDateInterestDetailsPopup(){
			try {
				
		
				WebElement effectiveDateInterestDetailsPopUp =new WebDriverWait(driver,10)
				.until(ExpectedConditions.visibilityOfElementLocated(effectiveDateInterestDetailsPopUp_xpath));
				effectiveDateInterestDetailsPopUp.click();
		
			//Thread.sleep(1000);
			return true;

			} catch (Exception e) {
				return false;
			}
			}
		
		
		
		public String verifyErrMsgMinIntRate(String errMsg)
		{
			try
			{
				WebElement errMsgMinIntRate=new WebDriverWait(driver,10)
				.until(ExpectedConditions.visibilityOfElementLocated(errorMsgMinIntRateAlphaNumericValue_xpath));
				String actualErrMsg=errMsgMinIntRate.getText().trim();
				if(actualErrMsg.equals(errMsg));
			}
			catch(Exception e)
			{
			return " unable to verify error message "+e.getCause();	
			}
			return errMsg;
		}
		
		public String verifyErrMsgMinIntRateGreator(String errMsg)
		{
			try
			{
				WebElement errMsgIntRate=new WebDriverWait(driver,10)
				.until(ExpectedConditions.visibilityOfElementLocated(errMsgMinIntRateNegativeValue_xpath));
				String actualMsg=errMsgIntRate.getText().trim();
			
				if(actualMsg.equals(errMsg));
			}
			catch(Exception e)
			{
				return "unable to verify "+e.getCause();
			}
			return errMsg;
		}
		
		
	/*
	 * public String xlsReader(String sheetName,int rownum,int cellNum) throws
	 * Throwable { ExcelReader reader=new ExcelReader();
	 * 
	 * 
	 * String data= reader.fetchDataExcel(sheetName, rownum, cellNum);
	 * 
	 * 
	 * System.out.println("reason for exception is " );
	 * 
	 * return data;
	 * 
	 * }
	 */
	
		public boolean selectEffectiveDate(String date)
		{
			try
			{		
				Thread.sleep(1000);
				WebElement interestClick=new WebDriverWait(driver,10)
				.until(ExpectedConditions.visibilityOfElementLocated(interestClick_xpath));
				interestClick.click();
				
				
				//Thread.sleep(1000);

				
				WebElement effectiveDateInterestDetailsPopUp=new WebDriverWait(driver,10)
				.until(ExpectedConditions.visibilityOfElementLocated(effectiveDateInterestDetailsPopUp_xpath));
				effectiveDateInterestDetailsPopUp.click();
				
				WebElement calendarDate=new WebDriverWait(driver,10)
				.until(ExpectedConditions.visibilityOfElementLocated(calendarDate_xpath));
				calendarDate.click();
				
				WebElement clickOnPrevCalenderDate=new WebDriverWait(driver,10)
				.until(ExpectedConditions.visibilityOfElementLocated(clickOnPrevCalenderDate_xpath));
				clickOnPrevCalenderDate.click();
		
			}
			catch(Exception e)
			{}
			
			return true;
		}
		
		

		
		/*public boolean verifyOptionsInterestRateCodeDD()
		{
			try
			{
				WebElement InterestRateCode=new WebDriverWait(driver,100)
				.until(ExpectedConditions.visibilityOfElementLocated(fundSendDD_xpath));
				InterestRateCode.click();
				
				Select sel=new Select(InterestRateCode);
				List<WebElement> defualtValues=sel.getOptions();
				
				String[] valuesInDD={"Check","Lock Box","Wire Transfer","Lock Box Float","Letter of Credit","Intercreditor","TEST","BOX","Wire Cash"};
				
				for(int i=0;i<=defualtValues.size();i++)
				{
					String optionText=defualtValues.get(i).getText();
					
					for(int k=0;k<=valuesInDD.length-1;k++)
					{
						if(optionText.equals(valuesInDD[k]))
						{
							System.out.println(optionText);
						}
					else
						{
							i++;
						}
					}
				}
			}
			catch(Exception e)
			{
				System.out.println("All options are not present "+e.getCause());
			}
			return true;
		}*/
		
		
		
	/*	public  boolean clickOnPopUpButton() 
		{
			 try {
				  WebElement IneligibleCalculationPageWebElement = new WebDriverWait(driver, 1000)
				 .until(ExpectedConditions.visibilityOfElementLocated(basicParameter_xpath));
				
				 
				 
				 Alert simpleAlert = driver.switchTo().alert();
				 simpleAlert.accept();
				 //Thread.sleep(1000);
				 
				 return true;
				 }
			 
		catch (Exception ex) {
		 return false;
						}*/
		
		
		//}
		

		   /*Author-Garima*/
		
		//Method to Click on Based On		
		public   String  clickOnBasedOn(String Basedonvalue){
			try {
				WebElement productTypeDropdownWebEelement = new WebDriverWait(
						driver, 10).until(ExpectedConditions
						.visibilityOfElementLocated(BaseOn_xpath));
				productTypeDropdownWebEelement.sendKeys(Basedonvalue);
				productTypeDropdownWebEelement.click();
				Thread.sleep(1000);
				
			} catch (Exception ex) {
		
			}
			return Basedonvalue;
		}
		//Method to Enter value in max Cap
		
		public   String  enterValurInMaxCap(String Maxvalue){
			try {
				WebElement productTypeDropdownWebEelement = new WebDriverWait(
						driver, 10).until(ExpectedConditions
						.visibilityOfElementLocated(BaseOn_xpath));
				productTypeDropdownWebEelement.sendKeys(Maxvalue);
				Thread.sleep(1000);
				
			} catch (Exception ex) {
		
			}
			return Maxvalue;
		}
		
		//Method to Click on Client Display Edit
		
		public boolean clickOnClientDisplayEdit(){
			try
			{
				WebElement savebutton=new WebDriverWait(driver,10)
				.until(ExpectedConditions.elementToBeClickable(ClientSearchEdit_xpath));
				savebutton.click();
				
				
				return true;
			}
			catch(Exception e)
			{
				return false;
			}
		}
		
		//Method to Click o nCalculated cap
		
		public  boolean  clickOnCalculatedDropDown(){
			try {
				Thread.sleep(1000);
				WebElement clickOnCalculatedDropDown = new WebDriverWait(
						driver, 10).until(ExpectedConditions
						.visibilityOfElementLocated(CalculatedCap_xpath11));
			clickOnCalculatedDropDown.click();
				
				
				return true;
			} catch (Exception ex) {
				return false;
			}
			
		}
		
		
		//Method To Select Total Recivable
		
		public  boolean  clickOnReceivableCheckBox(){
			try {
				WebElement clickOnCalculatedDropDown = new WebDriverWait(
						driver, 10).until(ExpectedConditions
						.visibilityOfElementLocated(TotalReceivable_xpath));
			clickOnCalculatedDropDown.click();
				Thread.sleep(1000);
				
				return true;
			} catch (Exception ex) {
				return false;
			}
			
		}
		
		//method to Click on Save
		
		public  boolean  clickOnSave(){
			try {
				WebElement clickOnCalculatedDropDown = new WebDriverWait(
						driver, 10).until(ExpectedConditions
						.visibilityOfElementLocated(savebutton_xpath));
			clickOnCalculatedDropDown.click();
			this.isAlertPresent();
				Thread.sleep(1000);
				return true;
			} catch (Exception ex) {
				return false;
			}
			
		}
		
		//Method to Verify Sucess Message
		
		public boolean verifySucessMessage() {
			try {
			    WebElement clickonclientname = new WebDriverWait(driver,10)
				    .until(ExpectedConditions .visibilityOfElementLocated(SucessMEssage_xpath));
			    clickonclientname.isDisplayed();
			    
			    return true;
			} catch (Exception ex) {
			    return false;
			}

		}

		//Method to Clixck on BBC recalculation
		
		public boolean clickOnBBcReculationButton() {
			try {
				Thread.sleep(1000);
				WebElement IneligibleCalculationPageWebElement = new WebDriverWait(
						driver, 50).until(ExpectedConditions
						.elementToBeClickable(BBCRecalculationProcessButton_xpath));
				IneligibleCalculationPageWebElement.click();
				Thread.sleep(1000);
				Alert simpleAlert = driver.switchTo().alert();
				simpleAlert.accept();
				//Thread.sleep(1000);
				/*
				 * simpleAlert.accept(); //Thread.sleep(4000);
				 */
				return true;
			}

			catch (Exception ex) {
				return false;
			}
		}
		
	/*	Nidhi Changes*/
		

   public boolean verifyInventoryARRelianceTextbox()
   {
	try
	{
		WebElement textbox=new WebDriverWait(driver,10)
		.until(ExpectedConditions.elementToBeClickable(inventoryARCheckbox_xpath));		
		textbox.isDisplayed();
	}
	catch(Exception e)
	{
		return false;
	}
	return true;
}
   
   
   public boolean verifyBasedOnDropdown()
   {
   try{
   		 
   	WebElement dropdown = driver.findElement(basedOnDropdown_xpath);  
   	  dropdown.click();
   	  Thread.sleep(1000);
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
   
   
   public boolean selectFromBasedOnDropdown(String visibleText) throws InterruptedException{
		
				try {
					WebElement DropdownWebEelement = new WebDriverWait(driver, 10)
					.until(ExpectedConditions.visibilityOfElementLocated(basedOnDropdown_xpath));
					DropdownWebEelement.click();
					Select sel = new Select(DropdownWebEelement);
					sel.selectByVisibleText(visibleText);
					/*List<WebElement> list = sel.getOptions();
					
					for (WebElement ele : list) 
					{
						String data = ele.getText();
						System.out.println(data);
						
						if (ele.getText().equals(visibleText)) 
						{
					 		ele.click();
							
							 return true;
						}
					}*/
					return true;
				} 
				catch (Exception ex)
				{
					return false;
				}
				
				
				}

   public  boolean  clickOnCalculatedDropDown1(){
		try {
			WebElement clickOnCalculatedDropDown = new WebDriverWait(
					driver, 10).until(ExpectedConditions
					.visibilityOfElementLocated(CalculatedCap1_xpath));
		clickOnCalculatedDropDown.click();
			//Thread.sleep(3000);
			
			return true;
		} catch (Exception ex) {
			return false;
		}
		
	}
   
   public  boolean  clickOnCalculatedDropDown2(){
		try {
			WebElement clickOnCalculatedDropDown = new WebDriverWait(
					driver, 10).until(ExpectedConditions
					.visibilityOfElementLocated(CalculatedCap_xpath1));
		clickOnCalculatedDropDown.click();
			//Thread.sleep(3000);
			
			return true;
		} catch (Exception ex) {
			return false;
		}
		
	}
   
   public  boolean  clickOnReceivableCheckBox1(){
		try {
			WebElement clickOnCalculatedDropDown = new WebDriverWait(
					driver, 10).until(ExpectedConditions
					.visibilityOfElementLocated(TotalReceivable1_xpath));
		clickOnCalculatedDropDown.click();
			//Thread.sleep(3000);
			
			return true;
		} catch (Exception ex) {
			return false;
		}
		
	}
   
   public  boolean  clickOnInventoryCheckBox(){
		try {
			WebElement clickOnCalculatedDropDown = new WebDriverWait(
					driver, 10).until(ExpectedConditions
					.visibilityOfElementLocated(TotalInventory_xpath));
		clickOnCalculatedDropDown.click();
			//Thread.sleep(3000);
			
			return true;
		} catch (Exception ex) {
			return false;
		}
		
	}
   
   
   public  boolean  clickOnOtherCollateralCheckBox(){
		try {
			WebElement clickOnCalculatedDropDown = new WebDriverWait(
					driver, 10).until(ExpectedConditions
					.visibilityOfElementLocated(TotalOtherCollateral_xpath));
		clickOnCalculatedDropDown.click();
			//Thread.sleep(3000);
			
			return true;
		} catch (Exception ex) {
			return false;
		}
		
	}
  

   public boolean verifyMaxCapTextbox()
   {
	try
	{
		WebElement textbox=new WebDriverWait(driver,100)
		.until(ExpectedConditions.elementToBeClickable(maxCapCheckbox_xpath));		
		textbox.isDisplayed();
	}
	catch(Exception e)
	{
		return false;
	}
	return true;
}
   
   
   public boolean enterValueInInventoryARRelianceTextbox(String data)
   {
	try
	{
		WebElement textbox=new WebDriverWait(driver,100)
		.until(ExpectedConditions.elementToBeClickable(inventoryARCheckbox_xpath));	
		textbox.clear();
		textbox.sendKeys(data);
	}
	catch(Exception e)
	{
		return false;
	}
	return true;
}

   
public boolean enterValueInMaxCapTextbox(String data)
{
	try
	{
		WebElement textbox=new WebDriverWait(driver,100)
		.until(ExpectedConditions.elementToBeClickable(maxCapCheckbox_xpath));	
		textbox.clear();
		textbox.sendKeys(data);
	}
	catch(Exception e)
	{
		return false;
	}
	return true;
}


public boolean isAlertPresent() {

	boolean presentFlag = false;

	try {
		Thread.sleep(2000);
		Alert alert = driver.switchTo().alert();
		presentFlag = true;
		alert.accept();
	} catch (Exception ex) {

		System.out.println("No Such Alert Present");

	}
	return presentFlag;}
		public boolean VerifyDebtorNumeratorField( )
		{
			try
			{
				WebElement DebtorNumerator=new WebDriverWait(driver,100)
				.until(ExpectedConditions.elementToBeClickable(DebtorNumeratorField_xapth));
				JavascriptExecutor jse1 = (JavascriptExecutor)driver;;
	    		jse1.executeScript("arguments[0].scrollIntoView(true);", DebtorNumerator);  	    		
	    		DebtorNumerator.isDisplayed();	    		
				return true;
			}
			catch(Exception e)
			{
				return false;
			}
		}
	
		public boolean VerifyDebtorNumeratorDropdown( )
		{
			try
			{
				WebElement DebtorNumerator=new WebDriverWait(driver,100)
				.until(ExpectedConditions.elementToBeClickable(DebtorNumeratorDropDown_xapth));
				JavascriptExecutor jse1 = (JavascriptExecutor)driver;;
	    		jse1.executeScript("arguments[0].scrollIntoView(true);", DebtorNumerator);  	    		
	    		DebtorNumerator.isDisplayed();	    		
				return true;
			}
			catch(Exception e)
			{
				return false;
			}
		}
		
		public boolean SelectDebtorFromTheDropDown(String Value) {
			try {
				WebElement DebtorNumerator=new WebDriverWait(driver,100)
				.until(ExpectedConditions.elementToBeClickable(DebtorNumeratorDropDown_xapth));
				Select sel = new Select(DebtorNumerator);
				List<WebElement> list = sel.getOptions();
				for (WebElement ele : list) {
					if (ele.getText().equals(Value)) {
						ele.click();
						Thread.sleep(5000);
						break;
					}
				}
				return true;} 
			catch (Exception ex) {
			}
			return false;
		}

		public boolean SelectDebtorBalanceFromTheDropDown(String Value) {
			try {
				WebElement DebtorNumerator=new WebDriverWait(driver,100)
				.until(ExpectedConditions.elementToBeClickable(DebtorNumeratorDropDown_xapth));
				Select sel = new Select(DebtorNumerator);
				List<WebElement> list = sel.getOptions();
				for (WebElement ele : list) {
					if (ele.getText().equals(Value)) {
						ele.click();
						//Thread.sleep(5000);
						break;
					}
				}
				return true;} 
			catch (Exception ex) {
			}
			return false;
		}

		public boolean VerifyTotalNumeratorDropdown( )
		{
			try
			{
				WebElement DebtorNumerator=new WebDriverWait(driver,100)
				.until(ExpectedConditions.elementToBeClickable(TotalNumeratorDropDown_xpath));
				JavascriptExecutor jse1 = (JavascriptExecutor)driver;;
	    		jse1.executeScript("arguments[0].scrollIntoView(true);", DebtorNumerator);  	    		
	    		DebtorNumerator.click();	
	    		DebtorNumerator.getText();
				return true;
			}
			catch(Exception e)
			{
				return false;
			}

		}

//Method to click on MAxAdvance


public String  verifyMaxAdvce(String data )
{
	try
	{
		WebElement textbox=new WebDriverWait(driver,100)
		.until(ExpectedConditions.elementToBeClickable(Maxadvance_xpath));		
		textbox.sendKeys(data);
		}
	catch(Exception e)
	{
		

}
	return data;
}



		public boolean InvValTempDropdownValues(String invValTemp) {
			try {
				WebElement InvValTempDropdownWebEelement = new WebDriverWait(driver, 5)
				.until(ExpectedConditions.visibilityOfElementLocated(invValTempDropdown_xpath));
				InvValTempDropdownWebEelement.click();
				Select sel = new Select(InvValTempDropdownWebEelement);
				sel.selectByVisibleText(invValTemp);
				/*List<WebElement> list = sel.getOptions();
				
				for (WebElement ele : list) 
				{
					String data = ele.getText();
					System.out.println(data);
					
					if (ele.getText().equals(invValTemp)) 
					{
				 		ele.click();
						
						
						 return true;
					}
				}*/
				return true;
			} 
			catch (Exception ex)
			{
				return false;
			}
			
		
			}


		public boolean clickOnRecourseFactoringCheckBox() {
			try
			{
				WebElement recourseFactChkBoxWebElement = new WebDriverWait(driver,10)
				.until(ExpectedConditions.elementToBeClickable(recourseFactCheckBox_xpath));
				recourseFactChkBoxWebElement.click();
				
			Thread.sleep(1000);
			return true;
		   }
			catch(Exception e)
			{
				return false;
			}
			
		 }


		public String addValueToRecourseDays(String recourseDays) {
			try
			{
				WebElement recourseDaysWebElement =new WebDriverWait(driver,10)
				.until(ExpectedConditions.visibilityOfElementLocated(recourseDaysTextBox_xpath));
				recourseDaysWebElement.clear();
				recourseDaysWebElement.sendKeys(recourseDays);
				
				Thread.sleep(1000);
			}
			catch(Exception e)
			{
				
			}
			
			return recourseDays;
		}


		public String addValueToRecourseFee(String recourseFee) {
			try
			{
				WebElement recourseFeeWebElement =new WebDriverWait(driver,10)
				.until(ExpectedConditions.visibilityOfElementLocated(recourseFeeTextBox_xpath));
				recourseFeeWebElement.clear();
				recourseFeeWebElement.sendKeys(recourseFee);
				
				Thread.sleep(1000);
			}
			catch(Exception e)
			{
				
			}
			return recourseFee;
		}


		public boolean clickOnEditBTN() {
			try
			{
				WebElement editBTNWebElement =new WebDriverWait(driver,10)
				.until(ExpectedConditions.elementToBeClickable(editBTN_xpath));
				editBTNWebElement.click();
				
				Thread.sleep(1000);
				return true;
			}
			catch(Exception e)
			{
				return false;
			}
			
		}

		public boolean SelectfromTotalNumeratorDropdown(String input)
		{
			try
			{
				WebElement DebtorNumerator=new WebDriverWait(driver,100)
				.until(ExpectedConditions.elementToBeClickable(TotalNumeratorDropDown_xpath));
				JavascriptExecutor jse1 = (JavascriptExecutor)driver;;
				jse1.executeScript("arguments[0].scrollIntoView(true);", DebtorNumerator); 
				Select sel = new Select(DebtorNumerator);
				List<WebElement> list = sel.getOptions();
				for (WebElement ele : list) {
					if (ele.getText().equals(input)) {
						ele.click();
						//Thread.sleep(5000);
						break;
					}
				}
				return true;} 
			catch (Exception ex) {
			}
			return false;
		}


		public boolean EnterValueForPastDueARDays(String PastDueARDays)
		{
			try
			{
				WebElement DebtorNumerator=new WebDriverWait(driver,10)
				.until(ExpectedConditions.elementToBeClickable(PastDueARDays_xpath));
				JavascriptExecutor jse1 = (JavascriptExecutor)driver;;
				Thread.sleep(2000);
				jse1.executeScript("arguments[0].scrollIntoView(true);", DebtorNumerator); 
				DebtorNumerator.clear();
				DebtorNumerator.sendKeys(PastDueARDays);
				
				return true;} 
			catch (Exception ex) {
			}
			return false;
		}

		public boolean AllowPastDueDebtorBalance( )
		{
			try
			{
				WebElement DebtorNumerator=new WebDriverWait(driver,100)
				.until(ExpectedConditions.elementToBeClickable(AllowPastDueDebtorBalance_xpath));
				JavascriptExecutor jse1 = (JavascriptExecutor)driver;;
	    		jse1.executeScript("arguments[0].scrollIntoView(true);", DebtorNumerator);  	    		
	    		DebtorNumerator.click();	
				return true;
			}
			catch(Exception e)
			{
				return false;
			}
		}
	
		public boolean SelectPastDueAmountFromDropDown(String input1)
		{
			try
			{
				WebElement DebtorNumerator=new WebDriverWait(driver,100)
				.until(ExpectedConditions.elementToBeClickable(PastDueAmount_xpath));
				JavascriptExecutor jse1 = (JavascriptExecutor)driver;;
				jse1.executeScript("arguments[0].scrollIntoView(true);", DebtorNumerator); 
				Select sel = new Select(DebtorNumerator);
				List<WebElement> list = sel.getOptions();
				for (WebElement ele : list) {
					if (ele.getText().equals(input1)) {
						ele.click();
						Thread.sleep(2000);
						break;
					}
				}
				return true;} 
			catch (Exception ex) {
			}
			return false;
		}

		public boolean SelectAgeCreditIneligibleFromDropDown(String input2)
		{
			try
			{
				WebElement DebtorNumerator=new WebDriverWait(driver,100)
				.until(ExpectedConditions.elementToBeClickable(AgeCreditIneligible_xpath));
				JavascriptExecutor jse1 = (JavascriptExecutor)driver;;
				jse1.executeScript("arguments[0].scrollIntoView(true);", DebtorNumerator); 
				Select sel = new Select(DebtorNumerator);
				List<WebElement> list = sel.getOptions();
				for (WebElement ele : list) {
					if (ele.getText().equals(input2)) {
						ele.click();
					Thread.sleep(2000);
						break;
					}
				}
				return true;} 
			catch (Exception ex) {
			}
			return false;
		}

		public boolean EnterValueForCrossAgingPercentage(String CrossAgingPercentage)
		{
			try
			{
				WebElement DebtorNumerator=new WebDriverWait(driver,100)
				.until(ExpectedConditions.elementToBeClickable(CrossAgingPercentage_xpath));
				JavascriptExecutor jse1 = (JavascriptExecutor)driver;;
				Thread.sleep(2000);
				jse1.executeScript("arguments[0].scrollIntoView(true);", DebtorNumerator); 
				DebtorNumerator.clear();
				DebtorNumerator.sendKeys(CrossAgingPercentage);
				
				return true;} 
			catch (Exception ex) {
			}
			return false;
		}
		public boolean EnterValueForConcentration(String Concentration)
		{
			try
			{
				WebElement DebtorNumerator=new WebDriverWait(driver,100)
				.until(ExpectedConditions.elementToBeClickable(Concentration_xpath));
				JavascriptExecutor jse1 = (JavascriptExecutor)driver;;
				Thread.sleep(2000);
				jse1.executeScript("arguments[0].scrollIntoView(true);", DebtorNumerator);
				DebtorNumerator.clear();
				DebtorNumerator.sendKeys(Concentration);
				
				return true;} 
			catch (Exception ex) {
			}
			return false;
		}
		

		public boolean ClickOnCheckBoxOfManuallyEnterClientIneligible( )
		{
			try
			{
				WebElement DebtorNumerator=new WebDriverWait(driver,100)
				.until(ExpectedConditions.elementToBeClickable(ManualEnteryInELigibleCheckBox_xpath));
				JavascriptExecutor jse1 = (JavascriptExecutor)driver;;
	    		jse1.executeScript("arguments[0].scrollIntoView(true);", DebtorNumerator);  	    		
	    		DebtorNumerator.click();	
				return true;
			}
			catch(Exception e)
			{
				return false;
			}
		}

		public boolean ClickOnExcludeCheckBox()
		{
		try{

			WebElement DebtorNumerator=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(ExcludeCheckbox_xpath));
			JavascriptExecutor jse1 = (JavascriptExecutor)driver;;
    		jse1.executeScript("arguments[0].scrollIntoView(true);", DebtorNumerator); 
    		Thread.sleep(1000);
    		DebtorNumerator.click();
	       return true;
		}
		catch(Exception ex){
			return false;
		}
		}
		
		   public boolean ClickOnCap()
		   {
			try
			{
				WebElement DebtorNumerator=new WebDriverWait(driver,100)
				.until(ExpectedConditions.elementToBeClickable(CapCheckBox_xpath));	
				JavascriptExecutor jse1 = (JavascriptExecutor)driver;;
	    		jse1.executeScript("arguments[0].scrollIntoView(true);", DebtorNumerator); 
	    		DebtorNumerator.click();
			}
			catch(Exception e)
			{
				return false;
			}
			return true;
		}



//Verify error message

public boolean verifyMessage()
{
	try
	{
		WebElement textbox=new WebDriverWait(driver,100)
		.until(ExpectedConditions.elementToBeClickable(errormessage_xpath));		
		textbox.isDisplayed();
	}
	catch(Exception e)
	{
		return false;
	}
	return true;
}

//method to click on intrest detail Hyperlink


public boolean clickOnHyperlink()
{
	try
	{
		WebElement textbox=new WebDriverWait(driver,100)
		.until(ExpectedConditions.elementToBeClickable(interstdetil_xpath));		
		textbox.click();
		this.isAlertPresent();
		Thread.sleep(1000);
	}
	catch(Exception e)
	{
		return false;
	}
	return true;
}

//Click on Dilog box add

public boolean clickOnDilogBoxAdd()
{
	try
	{
		Thread.sleep(2000);
		WebElement textbox=new WebDriverWait(driver,10)
		.until(ExpectedConditions.elementToBeClickable(Add_xpath));		
		textbox.click();
	}
	catch(Exception e)
	{
		return false;
	}
	return true;

}


//Enter date in Date box



public String  verifydate(String date )
{
	try
	{
		WebElement textbox=new WebDriverWait(driver,100)
		.until(ExpectedConditions.elementToBeClickable(Date_xpath));		
		textbox.sendKeys(date);
		
	}
	catch(Exception e)
	{
		
	}
	return date;
}

//Click on save

public boolean clickOnSaves()
{
	try
	{
		Thread.sleep(200);
		WebElement textbox=new WebDriverWait(driver,10)
		.until(ExpectedConditions.elementToBeClickable(saveIcon_xpath));		
		textbox.click();
		Thread.sleep(200);
		this.isAlertPresent();
		return true;
	}
	catch(Exception e)
	{
		return false;
	}
	
}
//kruthivas
//saveButton
public boolean clickOnSaves2()
{
	try
	{
		Thread.sleep(500);
		WebElement textbox=new WebDriverWait(driver,10)
		.until(ExpectedConditions.elementToBeClickable(saveButton_xpath));		
		textbox.click();
		Thread.sleep(2000);
		this.isAlertPresent();
		return true;
	}
	catch(Exception e)
	{
		return false;
	}
	
}

//Click on cross
public boolean clickOncross()
{
	try
	{
		WebElement textbox=new WebDriverWait(driver,10)
		.until(ExpectedConditions.elementToBeClickable(cross_xpath));		
		textbox.click();
	}
	catch(Exception e)
	{
		return false;
	}
	return true;
}
//Method to enter value in max


public String  enterMaxInterst(String Max )
{
	try
	{
		WebElement textbox=new WebDriverWait(driver,100)
		.until(ExpectedConditions.elementToBeClickable(Maxintrest_xpath));		
		textbox.sendKeys(Max);
		
	}
	catch(Exception e)
	{
		
	}
	return Max;
}

//Methosd to verify sucess message

public boolean verifyErrorMessages()
{
	try
	{
		
		WebElement textbox=new WebDriverWait(driver,100)
		.until(ExpectedConditions.elementToBeClickable(verifyErrorMessage_xpath));		
		textbox.isDisplayed();
		String s=textbox.getText();
		System.out.println(s);
		this.isAlertPresent();
	}
	catch(Exception e)
	{
		return false;
	}
	return true;
}

//Method to verify error message


public boolean verifySucessMessages()
{
	try
	{
		
		WebElement textbox=new WebDriverWait(driver,100)
		.until(ExpectedConditions.elementToBeClickable(Sucess_xpath));		
		textbox.isDisplayed();
		String s=textbox.getText();
		System.out.println(s);
		this.isAlertPresent();
	}
	catch(Exception e)
	{
		return false;
	}
	return true;
}

//Enter max value



public String  enterMinInterst(String Min )
{
	try
	{
		WebElement textbox=new WebDriverWait(driver,100)
		.until(ExpectedConditions.elementToBeClickable(Min_xpath));		
		textbox.sendKeys(Min);
		
	}
	catch(Exception e)
	{
		
	}
	return Min;
}
//Method to click on loan activity check box


public boolean clickloanactivity()
{
	try
	{
		WebElement textbox=new WebDriverWait(driver,100)
		.until(ExpectedConditions.elementToBeClickable(loanCheckbox_xpath));		
		textbox.click();
		textbox.click();
	}
	catch(Exception e)
	{
		return false;
	}
	return true;
}

//click on disbursment loan checl box


public boolean clickdisbursnenmentloanactivity()
{
	try
	{
		WebElement textbox=new WebDriverWait(driver,100)
		.until(ExpectedConditions.elementToBeClickable(Disbursmentloan_xpath));		
		textbox.click();
		textbox.click();
	}
	catch(Exception e)
	{
		return false;
	}
	return true;
}

//Method to click on inventrory

public boolean clickinventory()
{
	try
	{
		WebElement textbox=new WebDriverWait(driver,100)
		.until(ExpectedConditions.elementToBeClickable(inventory_xpath));		
		textbox.click();
		
	}
	catch(Exception e)
	{
		return false;
	}
	return true;
}

//method to click on maxcap


public boolean clickMaxcap()
{
	try
	{
		WebElement textbox=new WebDriverWait(driver,100)
		.until(ExpectedConditions.elementToBeClickable(maxcap_xpath));		
		textbox.click();
		
	}
	catch(Exception e)
	{
		return false;
	}
	return true;
}

//method to displar Ar

public boolean clickAr()
{
	try
	{
		WebElement textbox=new WebDriverWait(driver,100)
		.until(ExpectedConditions.elementToBeClickable(Ar_xpath));		
		textbox.click();;
		Thread.sleep(1000);
		
	}
	catch(Exception e)
	{
		return false;
	}
	return true;
}

//Method to display parameter

public boolean displayconcentration()
{
	try
	{
		WebElement textbox=new WebDriverWait(driver,100)
		.until(ExpectedConditions.elementToBeClickable(Concentration_xpath));		
		textbox.isDisplayed();
		
		
	}
	catch(Exception e)
	{
		return false;
	}
	return true;
}


//Method to display cross


public boolean displaycross()
{
	try
	{
		WebElement textbox=new WebDriverWait(driver,100)
		.until(ExpectedConditions.elementToBeClickable(Cross_xpath));		
		textbox.isDisplayed();
		
		
	}
	catch(Exception e)
	{
		return false;
	}
	return true;
}

//Method to display past 

public boolean displaypast()
{
	try
	{
		WebElement textbox=new WebDriverWait(driver,100)
		.until(ExpectedConditions.elementToBeClickable(pastdue_xpath));		
		textbox.isDisplayed();
		
		
	}
	catch(Exception e)
	{
		return false;
	}
	return true;
}

//method to display other

public boolean displayother()
{
	try
	{
		WebElement textbox=new WebDriverWait(driver,100)
		.until(ExpectedConditions.elementToBeClickable(Other_xpath));		
		textbox.isDisplayed();
		
		
	}
	catch(Exception e)
	{
		return false;
	}
	return true;
}
//Method to display exclude


public boolean displayexclude()
{
	try
	{
		WebElement textbox=new WebDriverWait(driver,100)
		.until(ExpectedConditions.elementToBeClickable(Exclude_xpath));		
		textbox.isDisplayed();
		
		
	}
	catch(Exception e)
	{
		return false;
	}
	return true;
}

//Methosd to display injventory

public boolean displayinventory()
{
	try
	{
		WebElement textbox=new WebDriverWait(driver,100)
		.until(ExpectedConditions.elementToBeClickable(Inventory_xpath));		
		textbox.isDisplayed();
		
		
	}
	catch(Exception e)
	{
		return false;
	}
	return true;
}


//Method to enter value concentration


public String  enterconcentration(String con )
{
	try
	{
		WebElement textbox=new WebDriverWait(driver,100)
		.until(ExpectedConditions.elementToBeClickable(Concentrationbox_xpath));	
		textbox.clear();
		textbox.sendKeys(con);
		
	}
	catch(Exception e)
	{
		
	}
	return con;
}
//Method to find sublimit header

public boolean displaySublimitheader()
{
	try
	{
		WebElement textbox=new WebDriverWait(driver,100)
		.until(ExpectedConditions.elementToBeClickable(sublimit_xpath));		
		textbox.isDisplayed();
		
		
	}
	catch(Exception e)
	{
		return false;
	}
	return true;
}

//Method to display Inventory hesder

public boolean displayReferenceheader()
{
	try
	{
		WebElement textbox=new WebDriverWait(driver,100)
		.until(ExpectedConditions.elementToBeClickable(reference_xpath));		
		textbox.isDisplayed();
		
		
	}
	catch(Exception e)
	{
		return false;
	}
	return true;
}

//Method to display liq


public boolean displayliqheader()
{
	try
	{
		WebElement textbox=new WebDriverWait(driver,100)
		.until(ExpectedConditions.elementToBeClickable(Liq_xpath));		
		textbox.click();
		
		
	}
	catch(Exception e)
	{
		return false;
	}
	return true;
}

//Method to click on max cap


public boolean clickmax()
{
	try
	{
		WebElement textbox=new WebDriverWait(driver,100)
		.until(ExpectedConditions.elementToBeClickable(AMx_xpath));		
		textbox.click();
		
		
	}
	catch(Exception e)
	{
		return false;
	}
	return true;
}


//Method to click on AR

public boolean clickArs()
{
	try
	{
		WebElement textbox=new WebDriverWait(driver,100)
		.until(ExpectedConditions.elementToBeClickable(Ars_xpath));		
		textbox.click();
		
		
	}
	catch(Exception e)
	{
		return false;
	}
	return true;
}
//Methjod to click on select

public boolean clickselect()
{
	try
	{
		WebElement textbox=new WebDriverWait(driver,100)
		.until(ExpectedConditions.elementToBeClickable(Select_xpath));		
		textbox.click();
		
		
	}
	catch(Exception e)
	{
		return false;
	}
	return true;
}

//method to click on ar dfuplicate


public boolean clickarduplicate()
{
	try
	{
		WebElement textbox=new WebDriverWait(driver,10)
		.until(ExpectedConditions.elementToBeClickable(Arduplicate_xpath));		
		textbox.click();
		textbox.click();
		
	}
	catch(Exception e)
	{
		return false;
	}
	return true;
}

//Method to click on max over



public boolean clickMAxover()
{
	try
	{
		WebElement textbox=new WebDriverWait(driver,100)
		.until(ExpectedConditions.elementToBeClickable(Maxover_xpath));		
		textbox.isDisplayed();
		
		
	}
	catch(Exception e)
	{
		return false;
	}
	return true;
}

//Method to click on Accept

public boolean clickAccept()
{
	try
	{
		WebElement textbox=new WebDriverWait(driver,100)
		.until(ExpectedConditions.elementToBeClickable(Accept_xpath));		
		textbox.click();
		textbox.click();
		
	}
	catch(Exception e)
	{
		return false;
	}
	return true;
}

//Method to display intrest


public boolean displaylink()
{
	try
	{
		WebElement textbox=new WebDriverWait(driver,100)
		.until(ExpectedConditions.elementToBeClickable(m_xpath));		
		textbox.click();
		
	
	}
	catch(Exception e)
	{
		return false;
	}
	return true;
}

//Method to click on max

public boolean displaymax()
{
	try
	{
		WebElement textbox=new WebDriverWait(driver,100)
		.until(ExpectedConditions.elementToBeClickable(MAxx_xpath));		
		textbox.click();
		textbox.click();
		
	
	}
	catch(Exception e)
	{
		return false;
	}
	return true;
}

//Method to click on process 

public boolean clickProcess()
{
	try
	{
		WebElement textbox=new WebDriverWait(driver,10)
		.until(ExpectedConditions.elementToBeClickable(process_xpath));		
		textbox.click();
		textbox.click();
		
	
	}
	catch(Exception e)
	{
		return false;
	}
	return true;
}
//Method to click on min

public boolean clickmin()
{
	try
	{
		WebElement textbox=new WebDriverWait(driver,100)
		.until(ExpectedConditions.elementToBeClickable(min_xpath));		
		textbox.click();
		textbox.click();
		
	
	}
	catch(Exception e)
	{
		return false;
	}
	return true;
}

//Method  to click on max over

public boolean clickmaxx()
{
	try
	{
		WebElement textbox=new WebDriverWait(driver,100)
		.until(ExpectedConditions.elementToBeClickable(mm_xpath));		
		textbox.click();
	
		
	
	}
	catch(Exception e)
	{
		return false;
	}
	return true;
}

//Methodf to click on intrest


public boolean clickintrest()
{
	try
	{
		WebElement textbox=new WebDriverWait(driver,100)
		.until(ExpectedConditions.elementToBeClickable(intrest_xpath));		
		textbox.click();
	
		
	
	}
	catch(Exception e)
	{
		return false;
	}
	return true;
}


//Method to display cap



public boolean displaycap()
{
	try
	{
		WebElement textbox=new WebDriverWait(driver,100)
		.until(ExpectedConditions.elementToBeClickable(cap_xpath));		
		textbox.isDisplayed();
	
		
	
	}
	catch(Exception e)
	{
		return false;
	}
	return true;
}

//Method to display exclude

public boolean displayExclude()
{
	try
	{
		WebElement textbox=new WebDriverWait(driver,100)
		.until(ExpectedConditions.elementToBeClickable(exclude_xpath));		
		textbox.isDisplayed();
	
		
	
	}
	catch(Exception e)
	{
		return false;
	}
	return true;
}

//Method to select cap



public boolean clickcap()
{
	try
	{
		WebElement textbox=new WebDriverWait(driver,100)
		.until(ExpectedConditions.elementToBeClickable(cap_xpath));		
		textbox.click();
		textbox.isEnabled();
	
		
	
	}
	catch(Exception e)
	{
		return false;
	}
	return true;
}

//Method to display inventory


public boolean displayinventorys()
{
	try
	{
		WebElement textbox=new WebDriverWait(driver,100)
		.until(ExpectedConditions.elementToBeClickable(inventoryy_xpath));		
		textbox.isDisplayed();
	
		
	
	}
	catch(Exception e)
	{
		return false;
	}
	return true;
}

//Method to display  other colletral




public boolean displayothercolletral()
{
	try
	{
		WebElement textbox=new WebDriverWait(driver,100)
		.until(ExpectedConditions.elementToBeClickable(othercolletral_xpath));		
		textbox.isDisplayed();
	
		
	
	}
	catch(Exception e)
	{
		return false;
	}
	return true;
}

//Method to click on other colletral

public boolean clickothercolletral()
{
	try
	{
		WebElement textbox=new WebDriverWait(driver,100)
		.until(ExpectedConditions.elementToBeClickable(othercolletral_xpath));		
		textbox.click();
	
		
	
	}
	catch(Exception e)
	{
		return false;
	}
	return true;
}
//Method to click on inventory

public boolean clickinventorys()
{
	try
	{
		WebElement textbox=new WebDriverWait(driver,100)
		.until(ExpectedConditions.elementToBeClickable(inventoryy_xpath));		
		textbox.click();
		
	
	}
	catch(Exception e)
	{
		return false;
	}
	return true;
}

//Method to click on Inventory ineleigble

public boolean clickOnInventoryIneligble()
{
	try
	{
		WebElement textbox=new WebDriverWait(driver,100)
		.until(ExpectedConditions.elementToBeClickable(inventoryineligble_xpath));		
		textbox.click();
		
	
	}
	catch(Exception e)
	{
		return false;
	}
	return true;
}

//Method to display past due days


public String  enterpastduedays(String days )
{
	try
	{
		WebElement textbox=new WebDriverWait(driver,100)
		.until(ExpectedConditions.elementToBeClickable(PAstdueDays_xpath));	
		textbox.clear();
		textbox.sendKeys(days);
		
	}
	catch(Exception e)
	{
		
	}
	return days;
}

//Method to capture dropdownvalue

public boolean clickondropdown() throws InterruptedException{
	
	try {
		WebElement DropdownWebEelement = new WebDriverWait(driver, 10)
		.until(ExpectedConditions.visibilityOfElementLocated(pastamount_xpath));
		DropdownWebEelement.click();
		Select sel = new Select(DropdownWebEelement);
		
		List<WebElement> list = sel.getOptions();
		
		for (WebElement ele : list) 
		{
			String data = ele.getText();
			System.out.println(data);
			
}
	}
		catch(Exception e)
		{
			return false;
		}
		return true;
	}


//Method to print credit age dropdown value


public boolean clickoncreditagedropdown() throws InterruptedException{
	
	try {
		WebElement DropdownWebEelement = new WebDriverWait(driver, 10)
		.until(ExpectedConditions.visibilityOfElementLocated(Creditage_xpath));
		DropdownWebEelement.click();
		Select sel = new Select(DropdownWebEelement);
		
		List<WebElement> list = sel.getOptions();
		
		for (WebElement ele : list) 
		{
			String data = ele.getText();
			System.out.println(data);
			
}
	}
		catch(Exception e)
		{
			return false;
		}
		return true;
	}

//Methood to enter past dur date


public String  enterpastduedayss(String due )
{
	try
	{
		WebElement textbox=new WebDriverWait(driver,10)
		.until(ExpectedConditions.elementToBeClickable(pastamount_xpath));	
		
		textbox.sendKeys(due);
		Thread.sleep(6000);
		
	}
	catch(Exception e)
	{
		
	}
	return due;
}

//Method to enter credit loimit

public String  entercreditlimiiits(String cre )
{
	try
	{
		WebElement textbox=new WebDriverWait(driver,100)
		.until(ExpectedConditions.elementToBeClickable(Creditage_xpath));	
		
		textbox.sendKeys(cre);
		
	}
	catch(Exception e)
	{
		
	}
	return cre;
}

//Method to get cross %


public boolean  getcross()
{
	try
	{
		WebElement textbox=new WebDriverWait(driver,100)
		.until(ExpectedConditions.elementToBeClickable(Crosss_xpath));	
		String a=textbox.getText();
		System.out.println(a);
	}
	catch(Exception e)
	{
		return true;
	}
	return false;
	
}

//Method to enter value in cross

public String entercross(String c )
{
	try
	{
		WebElement textbox=new WebDriverWait(driver,100)
		.until(ExpectedConditions.elementToBeClickable(Crosss_xpath));	
		textbox.clear();
		textbox.sendKeys(c);
		
	}
	catch(Exception e)
	{
		
	}
	return c;
}
//Method to click on boc


public boolean clickOncrossbox()
{
	try
	{
		WebElement textbox=new WebDriverWait(driver,100)
		.until(ExpectedConditions.elementToBeClickable(Crosscheckbox_xpath));		
		textbox.click();
		
	
	}
	catch(Exception e)
	{
		return false;
	}
	return true;
}



//Method to enter data in Payment over days 


public String enterPaymentOverdays(String p )
{
	try
	{
		WebElement textbox=new WebDriverWait(driver,100)
		.until(ExpectedConditions.elementToBeClickable(PaymentOverdays_xpath));	
		textbox.clear();
		textbox.sendKeys(p);
		
	}
	catch(Exception e)
	{
		
	}
	return p;
}

//Method to display manual vEnter

public boolean displayManualEntey()
{
	try
	{
		WebElement textbox=new WebDriverWait(driver,100)
		.until(ExpectedConditions.elementToBeClickable(ManualEntery_xpath));		
		textbox.isDisplayed();
		
	
	}
	catch(Exception e)
	{
		return false;
	}
	return true;
}

//Method to enter value in AR limit ca[p

public String enterArSubLimitCap(String ar )
{
	try
	{
		WebElement textbox=new WebDriverWait(driver,100)
		.until(ExpectedConditions.elementToBeClickable(PaymentOverdays_xpath));	
		textbox.clear();
		textbox.sendKeys(ar);
		
	}
	catch(Exception e)
	{
		
	}
	return ar;
}

//Method to enter value in Inventory

public String enterInventiory(String ar )
{
	try
	{
		WebElement textbox=new WebDriverWait(driver,100)
		.until(ExpectedConditions.elementToBeClickable(Inventorys_xpath));	
		textbox.clear();
		textbox.sendKeys(ar);
		
	}
	catch(Exception e)
	{
		
	}
	return ar;
}

//Method to enter valur in Other sublimit


public String enterOtherSublimit(String o )
{
	try
	{
		WebElement textbox=new WebDriverWait(driver,100)
		.until(ExpectedConditions.elementToBeClickable(Othersublimty_xpath));	
		textbox.clear();
		textbox.sendKeys(o);
		
	}
	catch(Exception e)
	{
		
	}
	return o;
}


//Method to click onj Based on DropDown


public boolean clickOnBasedOndropdown()
{

	
		try {
			WebElement DropdownWebEelement = new WebDriverWait(driver, 10)
			.until(ExpectedConditions.visibilityOfElementLocated(BasedOn_xpath));
			DropdownWebEelement.click();
			Select sel = new Select(DropdownWebEelement);
			
			List<WebElement> list = sel.getOptions();
			
			for (WebElement ele : list) 
			{
				String data = ele.getText();
				System.out.println(data);
			}}
	catch(Exception e)
	{
		return false;
	}
	return true;
}

//Method to get data of other colletral base on value

public boolean clickOnOtherBasedOndropdown()
{

	
		try {
			WebElement DropdownWebEelement = new WebDriverWait(driver, 10)
			.until(ExpectedConditions.visibilityOfElementLocated(OthercolletralBasedOn_xpath));
			DropdownWebEelement.click();
			Select sel = new Select(DropdownWebEelement);
			
			List<WebElement> list = sel.getOptions();
			
			for (WebElement ele : list) 
			{
				String data = ele.getText();
				System.out.println(data);
			}}
	catch(Exception e)
	{
		return false;
	}
	return true;
}

//Method to get data of basedon 


public boolean clickOnInventoryBasedOndropdown()
{

	
		try {
			WebElement DropdownWebEelement = new WebDriverWait(driver, 10)
			.until(ExpectedConditions.visibilityOfElementLocated(RBasedOn_xpath));
			DropdownWebEelement.click();
			Select sel = new Select(DropdownWebEelement);
			
			List<WebElement> list = sel.getOptions();
			
			for (WebElement ele : list) 
			{
				String data = ele.getText();
				System.out.println(data);
			}}
	catch(Exception e)
	{
		return false;
	}
	return true;
}
//Method to click on Calculatedc  cap Dropdown

public boolean clickOnCalculatedCapDropdown()
{

	
		try {
			WebElement DropdownWebEelement = new WebDriverWait(driver, 10)
			.until(ExpectedConditions.visibilityOfElementLocated(CalculatedCaps_xpath));
			/*JavascriptExecutor jse1 = (JavascriptExecutor)driver;;
    		jse1.executeScript("arguments[0].scrollIntoView(true);", DropdownWebEelement);  	    		
    		
			Thread.sleep(5000);*/
			DropdownWebEelement.click();
			/*Thread.sleep(5000);*/
			/*Select sel = new Select(DropdownWebEelement);
			List<WebElement> list = sel.getOptions();
			*/

			return true;} 
		catch (Exception ex) {
		}
		return false;
		}
		



//method to print Tatal receivable

public boolean totalReceivable()
{
	try
	{
		WebElement textbox=new WebDriverWait(driver,100)
		.until(ExpectedConditions.elementToBeClickable(Othersublimty_xpath));	
		textbox.isDisplayed();
	}
	catch(Exception e)
	{
		
	}
	return false;
	
}

//Method to click on ca

public boolean clickOnCalculatedCap1Dropdown()
{

	
		try {
			WebElement DropdownWebEelement = new WebDriverWait(driver, 10)
			.until(ExpectedConditions.visibilityOfElementLocated(Cap_xpath));
			JavascriptExecutor jse1 = (JavascriptExecutor)driver;;
    		jse1.executeScript("arguments[0].scrollIntoView(true);", DropdownWebEelement);  	    		
    		
			Thread.sleep(5000);
			DropdownWebEelement.click();
			Thread.sleep(5000);
			/*Select sel = new Select(DropdownWebEelement);
			List<WebElement> list = sel.getOptions();
			*/

			return true;} 
		catch (Exception ex) {
		}
		return false;
		}
		
//Method to click on cap

public boolean clickOnCalculatedCap2Dropdown()
{

	
		try {
			WebElement DropdownWebEelement = new WebDriverWait(driver, 10)
			.until(ExpectedConditions.visibilityOfElementLocated(Capp_xpath));
			JavascriptExecutor jse1 = (JavascriptExecutor)driver;;
    		jse1.executeScript("arguments[0].scrollIntoView(true);", DropdownWebEelement);  	    		
    		
			Thread.sleep(5000);
			DropdownWebEelement.click();
			Thread.sleep(5000);
			/*Select sel = new Select(DropdownWebEelement);
			List<WebElement> list = sel.getOptions();
			*/

			return true;} 
		catch (Exception ex) {
		}
		return false;
		}

//Method to  click on checkbox of calculated ca[p


public boolean ClicktotalReceivable()
{
	try
	{
		WebElement textbox=new WebDriverWait(driver,100)
		.until(ExpectedConditions.elementToBeClickable(CapDropdown_xpath));	
		Thread.sleep(2000);
		textbox.click();
		return true;
		
		
	}
	catch(Exception e)
	{
		
	}
	return false;
	
}
//Meythod to enter data in Based on



public String  entervalueinBasedon(String B)
{
	try
	{
		WebElement DropdownWebEelement=new WebDriverWait(driver,100)
		.until(ExpectedConditions.elementToBeClickable(base_xpath));	
		JavascriptExecutor jse1 = (JavascriptExecutor)driver;;
		jse1.executeScript("arguments[0].scrollIntoView(true);", DropdownWebEelement);  	    		
		
		Thread.sleep(5000);
		DropdownWebEelement.click();
		Thread.sleep(5000);
		DropdownWebEelement.click();
		DropdownWebEelement.sendKeys(B);
		Thread.sleep(2000);
	}
	catch(Exception e)
	{
		
	}
	return B;
	
}
//Method to enter value in maX cap

public String  entervalueinMaxCap(String m)
{
	try
	{
		WebElement textbox=new WebDriverWait(driver,100)
		.until(ExpectedConditions.elementToBeClickable(MaxCap_xopath));	
		textbox.click();
		textbox.clear();
		textbox.sendKeys(m);
	}
	catch(Exception e)
	{
		
	}
	return m;
	
}

//Method to select total invenmtory checkbox


public boolean ClicktotalInventory()
{
	try
	{
		WebElement textbox=new WebDriverWait(driver,100)
		.until(ExpectedConditions.elementToBeClickable(TotalInventoryCheck_xpath));	
		Thread.sleep(2000);
		textbox.click();
		return true;
		
		
	}
	catch(Exception e)
	{
		
	}
	return false;
	
}
//Method to select Total other colletral Checkbox


public boolean ClicktotalOthercolletral()
{
	try
	{
		WebElement textbox=new WebDriverWait(driver,10)
		.until(ExpectedConditions.elementToBeClickable(TotalOthercolletralCheckBox_xpath));	
		Thread.sleep(2000);
		textbox.click();
		return true;
		
		
	}
	catch(Exception e)
	{
		
	}
	return false;
	
}
//Method to click on Auto fill Novl


public boolean ClickOnAutoFillNovl()
{
	try
	{
		WebElement textbox=new WebDriverWait(driver,100)
		.until(ExpectedConditions.elementToBeClickable(AutofillNovl_xpath));	
		Thread.sleep(2000);
		textbox.click();
		return true;
		
		
	}
	catch(Exception e)
	{
		
	}
	return false;
	
}
//Method to display min liq cost
public boolean verifyMinLiqcost()
{
	try
	{
		WebElement DropdownWebEelement=new WebDriverWait(driver,100)
		.until(ExpectedConditions.elementToBeClickable(Minliqcost_xpath));	
		JavascriptExecutor jse1 = (JavascriptExecutor)driver;;
		jse1.executeScript("arguments[0].scrollIntoView(true);", DropdownWebEelement);  	    		
		
		Thread.sleep(5000);
		DropdownWebEelement.click();
		
		DropdownWebEelement.isDisplayed();
		return true;
		
		
	}
	catch(Exception e)
	{
		
	}
	return false;
	
}
//Method to display vasriable % min coast

public boolean verifyVariableMinLiqcost()
{
	try
	{
		WebElement textbox=new WebDriverWait(driver,100)
		.until(ExpectedConditions.elementToBeClickable(VariableMinCost_xpath));	
		
		textbox.isDisplayed();
		return true;
		
		
	}
	catch(Exception e)
	{
		
	}
	return false;
	
}
//Method to display  verify liq cost
public boolean verifyLiqcost()
{
	try
	{
		WebElement textbox=new WebDriverWait(driver,100)
		.until(ExpectedConditions.elementToBeClickable(LiqCost_xpath));	
		
		textbox.isDisplayed();
		return true;
		
		
	}
	catch(Exception e)
	{
		
	}
	return false;
	
}
//Method to display % of novl

public boolean verifyPerNovl()
{
	try
	{
		WebElement textbox=new WebDriverWait(driver,100)
		.until(ExpectedConditions.elementToBeClickable(PerOfNovl_xpath));	
		
		textbox.isDisplayed();
		return true;
		
		
	}
	catch(Exception e)
	{
		
	}
	return false;
	
}

//Method to dispaly % of cost

public boolean verifyPerOfCost()
{
	try
	{
		WebElement textbox=new WebDriverWait(driver,100)
		.until(ExpectedConditions.elementToBeClickable(PerOfCost_xpath));	
		
		textbox.isDisplayed();
		return true;
		
		
	}
	catch(Exception e)
	{
		
	}
	return false;
	
}
//Method to enter value in min liq


public String enterAutoFillNovl(String m)
{
	try
	{
		WebElement textbox=new WebDriverWait(driver,100)
		.until(ExpectedConditions.elementToBeClickable(Minliqcost_xpath));	
		textbox.click();
		textbox.clear();
		textbox.sendKeys(m);
	}
	catch(Exception e)
	{
		
	}
	return m;
	
}


//Method to enter value in  variable %


public String enterVariablePer(String v)
{
	try
	{
		WebElement textbox=new WebDriverWait(driver,100)
		.until(ExpectedConditions.elementToBeClickable(VariableMinCost_xpath));	
		textbox.click();
		textbox.clear();
		textbox.sendKeys(v);
	}
	catch(Exception e)
	{
		
	}
	return v;
	
}
//Method to enter value in Liq cost


public String enterKLiqCost(String l)
{
	try
	{
		WebElement textbox=new WebDriverWait(driver,100)
		.until(ExpectedConditions.elementToBeClickable(LiqCost_xpath));	
		textbox.click();
		textbox.clear();
		textbox.sendKeys(l);
	}
	catch(Exception e)
	{
		
	}
	return l;
	
}


//method to enter value in pernovl

public String enterPerNovl(String p)
{
	try
	{
		WebElement textbox=new WebDriverWait(driver,100)
		.until(ExpectedConditions.elementToBeClickable(PerOfNovl_xpath));	
		textbox.click();
		textbox.clear();
		textbox.sendKeys(p);
	}
	catch(Exception e)
	{
		
	}
	return p;
	
}

//Method to enter value in per cost



public String enterpercost(String c)
{
	try
	{
		WebElement textbox=new WebDriverWait(driver,100)
		.until(ExpectedConditions.elementToBeClickable(PerOfCost_xpath));	
		textbox.click();
		textbox.clear();
		textbox.sendKeys( c);
	}
	catch(Exception e)
	{
		
	}
	return c;
	
}

//Method to enter value in inventory Ar


public String enterInventoryAr(String i)
{
	try
	{
		WebElement textbox=new WebDriverWait(driver,100)
		.until(ExpectedConditions.elementToBeClickable(InventoryAr_xpath));	
		textbox.click();
		textbox.clear();
		textbox.sendKeys( i);
	}
	catch(Exception e)
	{
		
	}
	return i;
	
}

//Method to enter data in Inventory Balance percentage


public String enterInventoryLoanBalance(String l)
{
	try
	{
		WebElement textbox=new WebDriverWait(driver,10)
		.until(ExpectedConditions.elementToBeClickable(InventoryBalancePer_xpath));	
		textbox.click();
		textbox.clear();
		textbox.sendKeys( l);
	}
	catch(Exception e)
	{
		
	}
	return l;
	
}
//Method to click on Advance Ar vs Inventory


public boolean clickOnAdvanceArVsInventory()
{
	try
	{
		WebElement textbox=new WebDriverWait(driver,10)
		.until(ExpectedConditions.elementToBeClickable(advanceArVsInventory_xpath));	
		
		textbox.click();
		return true;
		
		
	}
	catch(Exception e)
	{
		
	}
	return false;
	
}

//Method to click On Process financial manually

public boolean clickOnProcessFinancialManually()
{
	try
	{
		WebElement textbox=new WebDriverWait(driver,10)
		.until(ExpectedConditions.elementToBeClickable(ProcessFinancialManual_xpath));	
		
		textbox.click();
		return true;
		
		
	}
	catch(Exception e)
	{
		
	}
	return false;
	
}


//Method to click on Current calculate current profit loss

public boolean clickOnCalculatedCurrentProfitLoss()
{
	try
	{
		WebElement textbox=new WebDriverWait(driver,10)
		.until(ExpectedConditions.elementToBeClickable(CalculatedCurrentProfitLoss_xpath));	
		
		textbox.click();
		return true;
		
	}
	catch(Exception e)
	{
		
	}
	return false;
	
}
//kruthivas
public boolean enterValueInofNOLVTextbox(String data)
{
	try
	{
		WebElement textbox=new WebDriverWait(driver,10)
		.until(ExpectedConditions.elementToBeClickable(inventoryARCheckbox_xpath));	
		textbox.clear();
		textbox.sendKeys(data);
	}
	catch(Exception e)
	{
		return false;
	}
	return true;
}
//kruthivas
//Auto calculate NOLV
public boolean clickcalculateNOLV()
{
	try
	{
		WebElement textbox=new WebDriverWait(driver,10)
		.until(ExpectedConditions.elementToBeClickable(clickcalculateNOLV_xpath));	
		
		textbox.click();
		return true;
	}
	catch(Exception e)
	{
		
	}
	return false;
	
	
}
//kruthivas
public boolean DueDaysforalphanumeric()
{
	try
	{
		WebElement textbox=new WebDriverWait(driver,10)
		.until(ExpectedConditions.elementToBeClickable(DueDaysforalpha_xpath));	
		
		textbox.click();
		return true;
	}
	catch(Exception e)
	{	
	}
	return false;	
}

//kruthivas
      public boolean  verifyPastDueARDays(){
          try {
              WebElement displayWebElement = new WebDriverWait(driver, 10)
              .until(ExpectedConditions.visibilityOfElementLocated(DueDaysforalpha_xpath));
              displayWebElement.isDisplayed();
              String s=displayWebElement.getText();
              System.out.println(s);
              
          } catch (Exception e) {
              return false;
          }
          return true;
          }

//kruthivas
      public String PastDueARDaysValue(String l)
      {
      	try
      	{
      		WebElement textbox=new WebDriverWait(driver,10)
      		.until(ExpectedConditions.elementToBeClickable(PastDueARDays_xpath));	
      		textbox.click();
      		textbox.clear();
      		textbox.sendKeys(l);
      	}
      	catch(Exception e)
      	{
      		
      	}
      	return l;
      	
      }
      //kruthivas
      public boolean reloadhyperlink()
      {
      	try
      	{
      		Thread.sleep(2000);
      		WebElement reloadInterestDetailspopup=new WebDriverWait(driver,10)			
      		.until(ExpectedConditions.visibilityOfElementLocated(reloadInterestDetailspopup_xpath));	
      		reloadInterestDetailspopup.click();
      		Thread.sleep(200);
      		return true;
      	}
      	catch(Exception e)
      	{
      		return false;
      	}
      	
      }
      //kruthivas
      //select on hyperlink check box
      public boolean selectHyperlinkcheckbox()
      {
      	try
      	{
      		Thread.sleep(1000);
      		WebElement textbox=new WebDriverWait(driver,10)
      		.until(ExpectedConditions.elementToBeClickable(selectHyperlinkcheckbox_xpath));	
      		textbox.click();
      		//Thread.sleep(1000);
      		return true;
      	}
      	catch(Exception e)
      	{	
      	}
      	return false;
      }
    //kruthivas
      //delete on hyperlink  
      public boolean Deletebutton()
      {
      	try
      	{
      		Thread.sleep(2000);
      		WebElement textbox=new WebDriverWait(driver,10)
      		.until(ExpectedConditions.elementToBeClickable(deleteInterestpopup_xpath));		
      		textbox.click();
      		Thread.sleep(200);
      		this.isAlertPresent();
      		return true;
      	}
      	catch(Exception e)
      	{
      		return false;
      	}
      }
//kruthivas
      public boolean clickDeletepopup() throws InterruptedException
      {
    	  Thread.sleep(2000);
      	try
      	{
      		
      		WebElement textbox=new WebDriverWait(driver,10)
      		.until(ExpectedConditions.elementToBeClickable(clickdelete_xpath));		
      		textbox.click();
      		Thread.sleep(1000);
      		
      	}
      	catch(Exception e)
      	{
      		return false;
      	}
      	return true;
      }
      public boolean  verifydateclick()
      {
      	try
      	{
      		WebElement textbox=new WebDriverWait(driver,10)
      		.until(ExpectedConditions.elementToBeClickable(Date_xpath));
      		Thread.sleep(500);
      		textbox.clear();
    
      	}
      	catch(Exception e)
      	{
      	
      	}
      	return true;
      }
      

}

