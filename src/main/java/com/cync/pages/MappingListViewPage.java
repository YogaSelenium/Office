package com.cync.pages;

//Author :Lavanya
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.LocalFileDetector;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.SkipException;

import com.cync.base.BasePage;

public class MappingListViewPage extends BasePage {

	// private final By
	// collateralNameField_xpath=By.xpath("//input[@id='mapping_entered_name']");
	// private final By
	// collateralNameField_xpath=By.xpath("//input[contains(@id,'mapping_entered_name')]");

	/*
	 * private final By
	 * dataFileType_xpath=By.xpath("//select[@id='mapping_data_type']");
	 */
	



	private final By collateralTypeDropdownValue = By
			.xpath("//*[contains(@value,'Save') or contains(@value,'Next')]/../input[1]");
	
	// rohit
    private final By findAndRplace_xpath=By.xpath("(//label[contains(text(),'Find and Replace')])[1]");
    //for staging
  //  private final By VerifyMappingNameTB_xpath=By.xpath("//input[@id='mapping_entered_name']");(req)
    //for prod
//    private final By VerifyMappingNameTB_xpath=By.xpath("//input[@id='mapping_name']");
    private final By FindAndReplaceColumn_xpath=By.xpath("//label[contains(text(),'Find and Replace Column')]");
    private final By Findtext_xpath=By.xpath("//label[contains(text(),'Find Text')]");
    private final By Matchtext_xpath=By.xpath("//label[contains(text(),'Match Text')]");
    private final By ReplaceWith_xpath=By.xpath("//label[contains(text(),'Replace with')]");
    private final By FinAndReplaceColTB_xpath=By.xpath("//input[@id='mapping_find_col_no']");
    private final By FindTextTB_xpath=By.xpath("//input[@id='mapping_find_text']");
    private final By MatchTextdd_xpath=By.xpath("//select[@id='mapping_match_text']");
    private final By ReplaceWithTB_xpath=By.xpath("//input[@id='mapping_replace_text']");
    private final By ErrorMsg_xpath=By.xpath("//li[contains(text(),'Find col no should be integer with comma separated fields like 1, 2 ')]");
    private final By ErrorMsg2_xpath=By.xpath("//li[contains(text(),'Find text')]");
    private final By saveBtn_id=By.id("mapping_create_bt");
    private final By verifyChanges_xpath=By.xpath("(//table[@id='mapping_preview']//td)[12]");
    private final By AccountNoandNameonSameColumn_xpath=By.xpath("//input[@id='mapping_accounts_on_same_column']");
    private final By DelimeterNoAndNameSeperation_xpath=By.xpath("//input[@id='mapping_delimeter_required_for_account_info']");
    private final By accountsAndAmountFields_xpath=By.xpath("//input[@id='mapping_accounts_and_amounts_fields_in_same_row']");
    private final By accountNumberAndNameDelimeterStyle_xpath=By.xpath("//label[contains(text(),'Account no & name Delimeter Style')]");
    private final By accountNumberAndNameDelimeterTB_xpath=By.xpath("//input[@id='mapping_accounts_on_same_column_delimiter_char']");
//    private final By startsAccountNumberInfoTB_xpath=By.xpath("//input[@id='mapping_accounts_on_same_column_delimiter_char']");
    private final By endsAccountNumberInfoTB_xpath=By.xpath("//input[@id='mapping_accounts_string_between_to']");
    private final By accountsNumberPosition_xpath=By.xpath("//select[@id='mapping_accounts_on_same_column_acc_no_position']");
    private final By Discardvaluecol_xpath=By.xpath("//input[@id='mapping_discard_value_column']");
    private final By AccountNumberAndName_xpath=By.xpath("//select[@id='mapping_column_mappings_account_no']");
    private final By futureDropDown_xpath=By.xpath("//select[@id='mapping_column_mappings_bucket_0']");
    private final By over30_xpath2=By.id("mapping_column_mappings_bucket_2");
    private final By over60_xpath2=By.id("mapping_column_mappings_bucket_3");
    private final By over90_xpath2=By.id("mapping_column_mappings_bucket_4");
    private final By over120_xpath2=By.id("mapping_column_mappings_bucket_5");
    private final By accountNumberCol_xpath=By.xpath("//th[contains(text(),'Account No')]");
    private final By accountNameCol_xpath=By.xpath("//table[@id='mapping_preview']//th[contains(text(),'Account Name')]");
    private final By mappingSuccess_xpath=By.xpath("//strong[contains(text(),'Mapping was')]");
    private final By mappingListView_xpath=By.xpath("(//a[text()='Mapping List View'])[1]");
    private final By menuItem_xpath = By.xpath("//div[@class='b-c-area']//div[@class='hamburger_icon']");
    private final By ablChooseFileButton_xpath = By.xpath("//button[@class='btn ng-star-inserted']");
    private final By add_plus_xpath = By.xpath("//span[@class='ui-icon ui-icon ui-icon-plus']");
    private final By mapping_name_xpath = By.id("jqg1_mapping_id");
    private final By save_file_xpath = By.xpath("//span[@class='ui-icon ui-icon ui-icon-disk']");
   /* private final By process_file_xpath = By.xpath("//span[contains(text(),'Process Files')]");*/
    private final By close_btn_xpath = By.id("closedialog");
    private final By verifyMsg_xpath = By.xpath("//div[@class='ui-state-success']");
    private final By ProcessFile_xpath=By.xpath("//span[text()='Process Files']");
    private final By chooseFile_xpath2=By.xpath("//button[text()=' Choose File ']");
    private final By account_numberField_xpath=By.xpath("(//table[@id='receivables_list']//td[@aria-describedby='receivables_list_account_no'])[1]");
    private final By account_nameField_xpath=By.xpath("(//table[@id='receivables_list']//td[@aria-describedby='receivables_list_account_name'])[1]");
    private final By fileupload_confirmation_xpath=By.id("modal_action_close");
    private final By accountsAndAmount_onSamePath_xpath=By.xpath("//input[@id='mapping_accounts_and_amounts_fields_in_same_row']");
    private final By detail_receivables_page_xpath=By.xpath("(//a[@id='routerLinkId'])[3]");
    private final By invoice_dropdown_xpath=By.id("mapping_column_mappings_invoice_no");
    private final By originaldate_dropdown_xpath=By.id("mapping_column_mappings_original_date");
    private final By summaryReceivables_Page_xpath=By.xpath("(//a[@id='routerLinkId'])[4]");
    private final By summaryReceivables_AccountNumberColumn_xpath=By.xpath("(//table[@id='receivable_summaries_list']//td[@aria-describedby='receivable_summaries_list_account_no'])[1]");
    private final By summaryReceivables_AccountNameColumn_xpath=By.xpath("(//table[@id='receivable_summaries_list']//span[@id='account_name'])[1]");
    private final By debtors_AccountNumberColumn_xpath=By.xpath("(//table[@id='customers_list']//td[@aria-describedby='customers_list_account_no'])[1]");
    private final By debtors_AccountNameColumn_xpath=By.xpath("(//table[@id='customers_list']//td[@aria-describedby='customers_list_account_name'])[1]");
    private final By detailPayables_AccountNumberColumn_xpath=By.xpath("(//table[@id='payables_list']//td[@aria-describedby='payables_list_account_no'])[1]");
    private final By detailPayables_AccountNameColumn_xpath=By.xpath("(//table[@id='payables_list']//td[@aria-describedby='payables_list_account_name'])[1]");
    private final By summaryPayables_AccountNumberColumn_xpath=By.xpath("(//table[@id='payable_summaries_list']//td[@aria-describedby='payable_summaries_list_account_no'])[1]");
    private final By summaryPayables_AccountNameColumn_xpath=By.xpath("(//table[@id='payable_summaries_list']//td[@aria-describedby='payable_summaries_list_account_name'])[1]");
    private final By vendors_AccountNumberColumn_xpath=By.xpath("(//table[@id='vendors_list']//td[@aria-describedby='vendors_list_account_no'])[1]");
    private final By vendors_AccountNameColumn_xpath=By.xpath("(//table[@id='vendors_list']//td[@aria-describedby='vendors_list_account_name'])[1]");
    private final By balanceAmount_xpath=By.name("mapping[column_mappings][balance_amount]");
    private final By currentTB_xpath=By.name("mapping[column_mappings][current_amount]");
    private final By over30TB_xpath=By.name("mapping[column_mappings][bucket1]");
    private final By over60TB_xpath=By.name("mapping[column_mappings][bucket2]");
    private final By over90TB_xpath=By.name("mapping[column_mappings][bucket3]");
    private final By over120TB_xpath=By.name("mapping[column_mappings][bucket4]");
    private final By vendors_xpath = By.xpath("(//a[text()='Vendors'])[1]");
    private final By accounNumberAndNameDelimeter_Dropdown=By.name("mapping[system_defined_delimeter_for_account]");
    private final By startsAccountNumberInfoTB_xpath=By.name("mapping[accounts_string_between_from]");
    private final By discardAccountNo_xpath=By.xpath("(//input[@name='mapping[cync_generated_acc_no]'])[2]");
    private final By accountNumberAndNameDelimeterDD_xpath=By.xpath("//select[@name='mapping[accounts_on_same_column_delimiter_char]']");
    private final By balanceAmountDD_xpath=By.name("mapping[column_mappings][balance_amount][]");
    private final By accountNumberContent_xpath=By.xpath("(//table[@id='mapping_preview']//td[1])[1]");
    private final By accountNameContent_xpath=By.xpath("(//table[@id='mapping_preview']//td[6])[1]");
    private final By summaryPayablesPage_xpath=By.xpath("//a[contains(text(),' Summary Payables')]");
    private final By detailReceivables_AccountNameColumn_xpath=By.xpath("(//table[@id='receivables_list']//td[@aria-describedby='receivables_list_account_no'])[1]");
    private final By detailReceivables_AccountNumberColumn_xpath=By.xpath("(//table[@id='receivables_list']//td[@aria-describedby='receivables_list_account_name'])[1]");
    private final By verifyABLDataFileType_xpath=By.xpath("//div[@class='ui-datatable-tablewrapper ng-star-inserted']//tbody//tr[1]/td[2]");
    
    private final By save3_xpath=By.xpath("//div[@class='box-header']//input[@class='view-button' or @id='mapping_create_bt']");
    
 
	//kruthivas      
   // private final By VerifyMappingNameTB_xpath = By.xpath("//input[contains(@id,'mapping_entered_name') or contains(@id,'mapping_name')]");
	//private final By Click_on_crossPop_up_xpath = By.xpath("//button[@class='ui-dialog-titlebar-close']");
	private final By collateralType_xpath1 = By.xpath("//select[@id='mapping_column_mappings_collateral_advance_rate_id']");
	private final By future_xpath2 = By.xpath("//select[@id='mapping_column_mappings_bucket_0']");
	
	private final By VerifyMappingGroupName_xpath = By.xpath("//td[contains(text(),'kruthi9203')]");
	private final By VerifyMappingName2_xpath = By.xpath("//a[contains(text(),'kruthi9204')]");
	private final By VerifyDescription_xpath = By.xpath("//input[@id='description_0']");
	private final By VerifyDescription2_xpath = By.xpath("//td[contains(text(),'VerifymappingDescription')]");
	private final By VerifyMappingData_File_Type_xpath = By.xpath("//td[contains(text(),'AR Summary')]");
	
	private final By verifyCollateral_BalanceName_xpath = By.xpath("//td[contains(text(),'Receivables')]");
	private final By verifyFileFormat_xpath=By.xpath("//td[contains(text(),'XLSX')]");
	private final By verifyStatus_xpath=By.xpath("//td[contains(text(),'XLSX')]");
	private final By verifyPreview_xpath=By.xpath("//img[@class='dms_row_icon1']");
	private final By verifyActions_xpath=By.xpath("//i[@class='icon-trash icon-white']");
	private final By verifyDescription_xpath=By.xpath("//input[@id='gs_source_documents_name']");
	private final By verifyMappingname_xpath=By.xpath("//input[@id='gs_mapping_name']");
	
	private final By VerifyMappingNameTB2_xpath = By.xpath("//input[contains(@class,'nameInputEvent')]");
	private final By verifyMappingGroup_Xpath = By.xpath("//table[@class='table dataTable table-bordered']//td[2]");
	private final By verifycheckmappingview_xpath = By.xpath("//a[contains(text(),'kruthi9215')]");
	private final By EdirDescription_xpath = By.xpath("//input[@id='mapping_description']");
	private final By Clickonpreview_xpath = By.xpath("//table[@class='table dataTable table-bordered']//tbody//tr[1]//td[8]");
	private final By errorMessage_xpath=By.xpath("//*[@id='mapping_errors']");
	private final By SelectedMappingGroup_xpath=By.xpath("//*[@id='jqg1_mapping_id']");
	private final By successMsg_xpath=By.xpath("//div[@class='ui-state-success']");
	private final By cross_xpath=By.xpath("(//a[@class='ui-jqdialog-titlebar-close ui-corner-all'])[1]");
	private final By Mapping_xpath=By.id("gs_mapping_id");
	private final By searchList_xpath=By.xpath("//a[@class='ui-corner-all']");
	private final By BBCFileFormat_xpath=By.xpath("//input[@id='gs_file_format']");
	private final By doubleclickonMapping_xpath=By.xpath("//*[@id='borrower_addendums_list']//tr[2]//td[3]");
	private final By Description_xpath=By.xpath("//table[@id='borrower_addendums_list']//tr[2]//td[5]/input");
	private final By Selectedcollateralfromname_xpath=By.xpath("//table[@id='borrower_addendums_list']//tr[2]//td[7]/select");
	private final By EditingMappingName_xpath=By.xpath("//div[@class='dataTables_wrapper no-footer']//tbody//tr[1]//td[2]//input");
	private final By VerifyABLMappingName_xpath=By.xpath("//div[@class='ui-datatable-tablewrapper ng-star-inserted']//tbody//tr[5]//td[4]//select");
	
	
	/*private final By add_plus_xpath = By.xpath("//span[@class='ui-icon ui-icon ui-icon-plus']");
	private final By mapping_name_xpath = By.id("jqg1_mapping_id");
	private final By save_file_xpath = By.xpath("//span[@class='ui-icon ui-icon ui-icon-disk']");
	private final By verifyMsg_xpath = By.xpath("//div[@class='ui-state-success']");
	private final By close_btn_xpath = By.id("closedialog");
    private final By accountNumberAndNameDelimeterDD_xpath=By.xpath("//select[@name='mapping[accounts_on_same_column_delimiter_char]']");
    private final By AccountNumberAndName_xpath=By.xpath("//select[@id='mapping_column_mappings_account_no']");
    private final By invoice_dropdown_xpath=By.id("mapping_column_mappings_invoice_no");
    private final By originaldate_dropdown_xpath=By.id("mapping_column_mappings_original_date");
    private final By saveBtn_id=By.id("mapping_create_bt");
    private final By mappingSuccess_xpath=By.xpath("//strong[contains(text(),'Mapping was')]");*/
  
	
	

	public boolean Datafiledropdown_Click() {
		try {
			String[] exp = { "AP Details", "AR Details", "Account Debtors",
					"Vendors", "AR Summary", "AP Summary", "Cash Receipts",
					"Asset Inventory", "GL Translation", "GL Balance" };

			WebElement dropdown = driver.findElement(dataFileType_xpath);

			dropdown.click();

			Select select = new Select(dropdown);

			List<WebElement> options = select.getOptions();

			for (WebElement we : options) {

				boolean match = false;
				for (int i = 0; i < exp.length; i++) {
					if (we.getText().equals(exp[i])) {
						match = true;
						System.out.println(we.getText());
					}
				}
				Assert.assertTrue(match);
			 }
		} catch (Exception e) {
		
			return false;
		}
		return true;
 }
    
        
		private final By MappingListViewPageHeader=By.xpath("//span[contains(text(),'Mapping List View')]");
        private final By createNewMapping_xpath=By.xpath("//a[text()='Create New Mapping']");
private final By collateralNameField_xpath=By.xpath("//input[@name='mapping[entered_name]']");
	//private final By collateralNameField_xpath=By.xpath("//input[@id='mapping_entered_name']");
	//private final By collateralNameField_xpath=By.xpath("(//input[contains(@id,'mapping')])[4]");
	/*private final By dataFileType_xpath=By.xpath("//select[@id='mapping_data_type']");*/
	private final By collateralType_xpath=By.xpath("//select[@id='mapping_collateral_advance_rate_id']");
	private final By fileFormat_xpath=By.xpath("//select[@id='mapping_file_format']");
	private final By sheetNo_xpath=By.xpath("//input[@id='mapping_sheet_no']");
	private final By chooseFile_xpath=By.xpath("//input[@id='mapping_file']");
	private final By nextButton_xpath=By.xpath("//input[@value='Next']");

	private final By savebtn_xpath=By.xpath("//input[@id='mapping_create_bt']");

	private final By noOfHeaderRows_xpath=By.xpath("(//input[@id='mapping_header_rows'])");
	private final By accountNo_xpath=By.xpath("//select[@id='mapping_column_mappings_account_no']");
	private final By accountName_xpath=By.xpath("//select[@id='mapping_column_mappings_account_name']");
	private final By balanceAmountDropdownValue_xpath=By.xpath("//select[@id='mapping_column_mappings_balance_amount']");
	private final By future_xpath=By.xpath("//select[@id='mapping_column_mappings_future_amount']");
	private final By current_xpath=By.xpath("//select[@id='mapping_column_mappings_current_amount']");
	private final By over30_xpath=By.xpath("//select[@id='mapping_column_mappings_bucket1']");
	private final By over60_xpath=By.xpath("//select[@id='mapping_column_mappings_bucket2']");
	private final By over90_xpath=By.xpath("//select[@id='mapping_column_mappings_bucket3']");
	private final By over120_xpath=By.xpath("//select[@id='mapping_column_mappings_bucket4']");
	private final By sucessMessageForMapping_xpath=By.xpath("//strong[text()='Mapping was successfully created.']");
	private final By dataFileType_xpath=By.xpath("//select[@name='mapping[data_type]']");

	//summary_inventory
		private final By attachdocumentToBbc_xpath=By.id("mapping_attach_document_to_bbc");
		private final By locationStep3_xpath=By.id("mapping_column_mappings_location");
		private final By assetNumberStep3_xpath=By.id("mapping_column_mappings_asset_no");
		private final By assetNameStep3_xpath=By.id("mapping_column_mappings_asset_name");		
		private final By assetValueStep3_xpath=By.id("mapping_column_mappings_asset_value");
		
		//Maintain
				private final By payableNo_xpath=By.id("mapping_column_mappings_payable_no");
				private final By originalDate_xpath=By.id("mapping_column_mappings_original_date");
				private final By currentAmount_xpath=By.id("mapping_column_mappings_bucket_1");
				
				private final By del_xpath=By.xpath("//a[@title='Delete']");
				

			
		///mapping list view	
		private final By Datafiletype_xpath=By.xpath("//th[text()='Data File Type']");
		private final By CurrentAmount_xpath=By.xpath("//select[@id='mapping_column_mappings_bucket_1']");
		private final By RetentionDropdown_xpath=By.xpath("//select[@id='mapping_column_mappings_retention']");
		       private final By Retention_xpath=By.xpath("//select[@id='mapping_column_mappings_retention']");
                private final By Monarchmap_xpath=By.xpath("//a[text()='Monarch Mapping Support']");
		        private final By Invoiceno_xpath=By.xpath("//select[@id='mapping_column_mappings_invoice_no']");
		        private final By Orderno_xpath=By.xpath("//select[@id='mapping_column_mappings_order_no']");
		        private final By Originaldate_xpath=By.xpath("//select[@id='mapping_column_mappings_original_date']");
                private final By Duedate_xpath=By.xpath("//select[@id='mapping_column_mappings_due_date']");
		        private final By Batchref_xpath=By.xpath("//select[@id='mapping_column_mappings_batch_reference_no']");
		        private final By Invoicimages_xpath=By.xpath("//select[@id='mapping_column_mappings_invoice_images']");
		        private final By futuredetails_xpath=By.xpath("//select[@id='mapping_column_mappings_bucket_0']");
		        private final By Currentdetails_xpath=By.xpath("//select[@id='mapping_column_mappings_bucket_1']");
		        private final By Adresline1_xpath=By.id("mapping_column_mappings_street_address_line1");
		        private final By Adresline2_xpath=By.id("mapping_column_mappings_street_address_line2");
		        private final By City_xpath=By.id("mapping_column_mappings_city");
		        private final By State_xpath=By.id("mapping_column_mappings_state_province");
		        private final By Country_xpath=By.id("mapping_column_mappings_country");
		        private final By Postalcode_xpath=By.id("mapping_column_mappings_postal_code");
		        private final By Url_xpath=By.id("mapping_column_mappings_url");
		        private final By Phonenumber_xpath=By.id("mapping_column_mappings_phone_no");
		        private final By Fax_xpath=By.id("mapping_column_mappings_fax");
		        private final By Altphone_xpath=By.id("mapping_column_mappings_alternate_phone_no");
		        private final By Credritlimit_xpath=By.id("mapping_column_mappings_credit_limit");
		        private final By Insurancelimit_xpath=By.id("mapping_column_mappings_insurance_limit");
		        private final By IneligibleReason_xpath=By.id("mapping_column_mappings_ineligible_reason");
		        private final By Instrumentno_xpath=By.id("mapping_column_mappings_instrument_no");
		        private final By Applytoinvoice_xpath=By.id("mapping_column_mappings_apply_to_invoice");
		        private final By Adjustmentamnt_xpath=By.id("mapping_column_mappings_adjustment_amount");
		        private final By Unappliedcashinvoice_xpath=By.id("mapping_column_mappings_unapplied_cash_invoice_prefix");
		        private final By Unappliedcashparam_xpath=By.id("mapping_column_mappings_unapplied_cash_invoice_param");
		        private final By Location_xpath=By.id("mapping_column_mappings_location");
		        private final By Assetno_xpath=By.id("mapping_column_mappings_asset_no");
		        private final By Assetname_xpath=By.id("mapping_column_mappings_asset_name");
		        private final By Assetvalue_xpath=By.id("mapping_column_mappings_asset_value");
		        private final By COGSvalue_xpath=By.id("mapping_column_mappings_cogs_value");
		        private final By Accountnametable_xpath=By.xpath("//table[@id='mapping_preview']/thead/tr/th[2]");
		        private final By Accountnotable_xpath=By.xpath("//table[@id='mapping_preview']/thead/tr/th[1]");
		        private final By Invoicenotable_xpath=By.xpath("//table[@id='mapping_preview']/thead/tr/th[3]");
		        private final By originaldatetable_xpath=By.xpath("//table[@id='mapping_preview']/thead/tr/th[4]");
		        private final By Accountnumcheckbox_xpath=By.id("mapping_account_is_separate");
		        private final By Accountnumcheckbox_xpath2=By.id("mapping_accounts_on_same_column");	        
	               private final By VerifyMappingName_xpath=By.xpath("//tr[@class='ui-datatable-even ui-widget-content ng-star-inserted']//span[@class='ui-cell-data ng-star-inserted'][contains(text(),'rec')]");
	               private final By MatchText_xpath=By.xpath("//select[@id='mapping_match_text']");
	               private final By clickRefreshButton_xpath=By.xpath("//span[@class='glyphicon glyphicon-refresh']");
	               private final By successPopUpBBCRequired_xpath=By.xpath("//a[text()='Close']");
	              /* private final By ReplaceWith_xpath=By.xpath("//input[@id='mapping_replace_text']");*/
		        
		        
		      ///mapping list view	
			
				private final By Mappinliststep3_xpath=By.xpath("(//a[text()='Mapping List View'])[3]");
				private final By FileFormat_xpath=By.xpath("//th[text()='File Format']");
				private final By MappingName_xpath=By.xpath("//th[text()='Mapping Name']");
				private final By CollateralName_xpath=By.xpath("//th[text()='Collateral Name / Balance Name']");
				private final By Status_xpath=By.xpath("//th[text()='Status']");
				private final By Actions_xpath=By.xpath("//th[text()='Actions']");
				private final By MappingListviewBtn_xpath=By.xpath("(//a[text()='Mapping List View'])[4]");
				private final By SampleExcel_xpath=By.xpath("//a[text()='Excel Sample Format']");
				private final By Map_xapth=By.xpath("(//a[text()='Mapping List View'])[4]");
				private final By Autofile_xpath=By.xpath("//input[@id='mapping_auto_document_no']");
		        private final By Dateformat_xpath=By.id("mapping_date_format");
		        private final By Previousbtn_xpath=By.xpath("//a[text()='Previous']");
		        private final By Accountnolength_xpath=By.xpath("//input[@id='mapping_account_no_length']");
		        private final By AttachBBC_xpath=By.xpath("//input[@id='mapping_attach_document_to_bbc']");
				private final By Reversesign_xpath=By.xpath("//input[@id='mapping_interpret_sign']");
				private final By DiscardRow_xpath=By.xpath("//input[@id='mapping_discard_blank_col']");
				private final By Delimiter_xpath=By.xpath("//select[@name='mapping[delimiter_char]']");			

				private final By Selectbyvaluetb_xpath=By.xpath("(//input[@class='text_field'])[9]");
				private final By Selectbytexttb_xpath=By.xpath("(//input[@class='text_field'])[10]");
				private final By DiscardValueText_xpath=By.xpath("(//input[@class='text_field'])[8]");
		        private final By Nooftrailerrows_xpath=By.xpath("(//input[@class='text_field'])[5]");
		        private final By Discardvaluecolumn_xpath=By.xpath("(//input[@class='text_field'])[11]");
		        private final By Considerrowtb_xpath=By.xpath("(//input[@class='text_field'])[11]");
		        private final By collname_xpath=By.xpath("//select[@id='mapping_collateral_advance_rate_id']");
		        private final By clickARDetails_xpath=By.xpath("//span[@class='ui-row-toggler fa fa-fw ui-clickable fa-chevron-circle-down']");
		        

///lavanya
		        private final By delete_xpath=By.xpath("//a[@title='Delete']");
		//kruthivas      
		        private final By VerifyMappingNameTB_xpath=By.xpath("//input[@class='text_field ui-autocomplete-input']");
		        private final By Click_on_crossPop_up_xpath=By.xpath("//button[@class='ui-dialog-titlebar-close']");

	
	// Mukesh
	 public boolean verifyFindText_Field()
	 {
		 try{
			 WebElement HeaderWebElement = new WebDriverWait(driver,100)
			                              .until(ExpectedConditions.visibilityOfElementLocated(MatchText_xpath));
			 HeaderWebElement.isDisplayed();
			 Thread.sleep(100);
			 return true;
		 }
		 catch(Exception ex)
		 {
			 return false;
		 }
	 }
	 
	 //Mukesh
	 public boolean matchTextdropdownClick()
	 {
		 try{
			 String[] str = {"Partial","Entire"};
	 
			 WebElement dropdown = driver.findElement(MatchText_xpath);
			 
			 dropdown.click();
			 
			 Select sel = new Select(dropdown);
			 
			 List<WebElement> options = sel.getOptions();
			 
			 for(WebElement we:options)
			 {
				 boolean match = false;
				 for(int i=0; i<str.length;i++)
				 {
					 if(we.getText().equals(str[i]))
					 {
						 match = true;
						 System.out.println(we.getText());
					 }
				 }
				 Assert.assertTrue(match);
			 }
		 }
			 catch(Exception e)
			 {
				 return false;
			 }
		 return true;
		 }
	 
	 //Mukesh
	public boolean Replacewith_Field()
	{
		try{
			
		WebElement HeaderWebElement = new WebDriverWait(driver,100)
		                             .until(ExpectedConditions.visibilityOfElementLocated(ReplaceWith_xpath));
		HeaderWebElement.isDisplayed();
		Thread.sleep(100);
		return true;
		
		}
		catch(Exception ex)
		{
			return false;
		}
		
	}
	//Mukesh
	public boolean replaceWithINputData(String replaceWithData) 
	{
		try{
			WebElement findTextInputWebEelement=new WebDriverWait(driver,100)
    		.until(ExpectedConditions.visibilityOfElementLocated(ReplaceWith_xpath));
    		Thread.sleep(1000);
    		
    		findTextInputWebEelement.sendKeys(replaceWithData);
    		return true;
		}
		catch(Exception ex)
		{
			return true;
		}
	}
	//Mukesh
	public boolean clickOnInvoiceNameInARDetails()
	{
	    try{
	         WebElement WebEelement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(clickARDetails_xpath));
	         WebEelement.click();
	         //Thread.sleep(5000);
	         Set <String> handles =driver.getWindowHandles();
	         Iterator<String> it = handles.iterator();
	         //iterate through your windows
	         while (it.hasNext()){
	         String parent = it.next();
	         String newwin = it.next();
	         driver.switchTo().window(newwin);
	         
	         driver.findElement(clickRefreshButton_xpath).click();
	         System.out.println("Refresh button");
	         }
	         return true;
	    }
	    catch(Exception ex)
	    {
	    	return false;
	    	}
	    }
	 	 
	 public boolean clickSuccessPopUp()
	    {
	    	try{
	    		WebElement clickPopupWebElement = new WebDriverWait(driver,10)
	    		             .until(ExpectedConditions.visibilityOfElementLocated(successPopUpBBCRequired_xpath));
	    		Alert alert = driver.switchTo().alert();
	    		alert.accept();
	    		
	    		Thread.sleep(1000);
	    		return true;
	    	}
	    	catch(Exception ex)
	    	{
	    		return false;
	    	}
	    }
	 public boolean accountNamedropdownValues(String accountNameDropdownValue) {
			try {
				WebElement productTypeDropdownWebEelement = new WebDriverWait(
						driver, 10).until(ExpectedConditions
						.visibilityOfElementLocated(accountName_xpath));
				Select sel = new Select(productTypeDropdownWebEelement);
				sel.selectByVisibleText(accountNameDropdownValue);
				
				/*List<WebElement> list = sel.getOptions();
				for (WebElement ele : list) {
					if (ele.getText().equals(accountNameDropdownValue)) {
						ele.click();
						
						 return true;
					}
				}*/
				return true;
			} catch (Exception ex) {
			}
		return false;
	}


	// rohit
	public boolean accountNamedropdownValues1(String accountNameDropdownValue) {
		try {
			WebElement productTypeDropdownWebEelement = new WebDriverWait(
					driver, 10).until(ExpectedConditions
					.visibilityOfElementLocated(accountName_xpath));
			Select sel = new Select(productTypeDropdownWebEelement);
			List<WebElement> list = sel.getOptions();
			for (WebElement ele : list) {
				if (ele.getText().equals(accountNameDropdownValue)) {
					ele.click();

					return true;
				}
			}
		} catch (Exception ex) {
		}
		return false;
	}

	public boolean fileUPload_mapping3() {
		try {

			StringSelection ss = new StringSelection(
					"D:\\GITWorkSpace\\cyncautomation\\Cync_Automation_Project\\FileUpload\\summary_file.xlsx");
		
			Toolkit.getDefaultToolkit().getSystemClipboard()
					.setContents(ss, null);

			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			return true;
		} catch (Exception e) {
			return false;
			
		}
	}

	public Boolean VerifyCollteralNameDropdown() {
		try {
			WebElement HeaderWebEelement = new WebDriverWait(driver, 100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(collateralType_xpath));
			HeaderWebEelement.isDisplayed();
			// Thread.sleep(500);
			return true;
		} catch (Exception ex) {

			return false;
		}
	}

	public Boolean VerifyDataFileTypeDropdown() {
		try {
			WebElement HeaderWebEelement = new WebDriverWait(driver, 100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(dataFileType_xpath));
			HeaderWebEelement.isDisplayed();
			return true;
		} catch (Exception ex) {

			return false;
		}

	}

	public boolean clickondelete() {
		try {
			WebElement WebEelement = new WebDriverWait(driver, 30)
					.until(ExpectedConditions
							.visibilityOfElementLocated(del_xpath));
			WebEelement.click();
			Alert alert = driver.switchTo().alert();
			alert.accept();

			Alert alert1 = driver.switchTo().alert();
			alert1.accept();

			Thread.sleep(200);

			return true;
		} catch (Exception ex) {
			return false;
		}
	}

	public Boolean VerifyMappingName() {
		try {
			WebElement HeaderWebEelement = new WebDriverWait(driver, 100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(MappingName_xpath));
			HeaderWebEelement.isDisplayed();
			Thread.sleep(100);
			return true;
		} catch (Exception ex) {

			return false;
		}

	}

	// anusha

	public boolean VerifyAccountnumbelength() {
		try {
			WebElement HeaderWebEelement = new WebDriverWait(driver, 100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(Accountnolength_xpath));
			HeaderWebEelement.isDisplayed();
			return true;
		} catch (Exception ex) {
			return false;

		}
	}

	public boolean VerifyAccountnamecheckbox2() {
		try {
			WebElement HeaderWebEelement = new WebDriverWait(driver, 100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(Accountnumcheckbox_xpath2));
			HeaderWebEelement.isDisplayed();
			return true;
		} catch (Exception ex) {
			return false;
		}
	}

	public boolean InvoicenodropdownValues(String invoicenoDropdownValue) {
		try {
			WebElement productTypeDropdownWebEelement = new WebDriverWait(
					driver, 10).until(ExpectedConditions
					.visibilityOfElementLocated(Invoiceno_xpath));
			Select sel = new Select(productTypeDropdownWebEelement);
			List<WebElement> list = sel.getOptions();
			for (WebElement ele : list) {
				if (ele.getText().equals(invoicenoDropdownValue)) {
					ele.click();

					return true;
				}
			}
		} catch (Exception ex) {
		}
		return false;
	}

	public boolean originldatedropdownValues(String originaldateDropdownValue) {
		try {
			WebElement productTypeDropdownWebEelement = new WebDriverWait(
					driver, 10).until(ExpectedConditions
					.visibilityOfElementLocated(Originaldate_xpath));
			Select sel = new Select(productTypeDropdownWebEelement);
			List<WebElement> list = sel.getOptions();
			for (WebElement ele : list) {
				if (ele.getText().equals(originaldateDropdownValue)) {
					ele.click();
					return true;
				}
			}
		} catch (Exception ex) {
		}
		return false;
	}

	public boolean Click_on_mappinglistveiw3() {
		try {
			WebElement HeaderWebEelement = new WebDriverWait(driver, 100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(Mappinliststep3_xpath));
			HeaderWebEelement.click();

			return true;
		} catch (Exception ex) {
			return false;

		}

	}

	public boolean VerifyLocation() {
		try {
			WebElement HeaderWebEelement = new WebDriverWait(driver, 100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(Location_xpath));
			HeaderWebEelement.isDisplayed();
			return true;
		} catch (Exception ex) {
			return false;

		}

	}

	public boolean VerifyDiscardrowblankincolumn() {
		try {
			WebElement HeaderWebEelement = new WebDriverWait(driver, 100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(DiscardRow_xpath));
			HeaderWebEelement.isDisplayed();
			return true;
		} catch (Exception ex) {
			return false;

		}

	}

	public boolean Verifyexcelsample() {
		try {
			WebElement HeaderWebEelement = new WebDriverWait(driver, 100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(SampleExcel_xpath));
			HeaderWebEelement.isDisplayed();
			return true;
		} catch (Exception ex) {
			return false;

		}

	}

	public boolean VerifyAccountnametable() {
		try {
			WebElement HeaderWebEelement = new WebDriverWait(driver, 100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(Accountnametable_xpath));
			HeaderWebEelement.isDisplayed();
			return true;
		} catch (Exception ex) {
			return false;

		}

	}

	public boolean VerifyInvoicenotable() {
		try {
			WebElement HeaderWebEelement = new WebDriverWait(driver, 100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(Invoicenotable_xpath));
			HeaderWebEelement.isDisplayed();
			return true;
		} catch (Exception ex) {
			return false;

		}

	}

	public boolean VerifyOriginaldatetable() {
		try {
			WebElement HeaderWebEelement = new WebDriverWait(driver, 100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(originaldatetable_xpath));
			HeaderWebEelement.isDisplayed();
			return true;
		} catch (Exception ex) {
			return false;

		}

	}

	public boolean VerifyAccountnotable() {
		try {
			WebElement HeaderWebEelement = new WebDriverWait(driver, 100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(Accountnotable_xpath));
			HeaderWebEelement.isDisplayed();

			return true;
		} catch (Exception ex) {
			return false;

		}

	}

	public boolean VerifyAssetNo() {
		try {
			WebElement HeaderWebEelement = new WebDriverWait(driver, 100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(Assetno_xpath));
			HeaderWebEelement.isDisplayed();

			return true;
		} catch (Exception ex) {
			return false;

		}

	}

	public boolean VerifyAssetname() {
		try {
			WebElement HeaderWebEelement = new WebDriverWait(driver, 100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(Assetname_xpath));
			HeaderWebEelement.isDisplayed();
			return true;
		} catch (Exception ex) {
			return false;

		}

	}

	public boolean VerifyAssetvalue() {
		try {
			WebElement HeaderWebEelement = new WebDriverWait(driver, 100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(Assetvalue_xpath));
			HeaderWebEelement.isDisplayed();

			return true;
		} catch (Exception ex) {
			return false;

		}

	}

	public boolean VerifyCOGSvalue() {
		try {
			WebElement HeaderWebEelement = new WebDriverWait(driver, 100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(COGSvalue_xpath));
			HeaderWebEelement.isDisplayed();

			return true;
		} catch (Exception ex) {
			return false;

		}

	}

	public boolean VerifyDuedate() {
		try {
			WebElement HeaderWebEelement = new WebDriverWait(driver, 100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(Duedate_xpath));
			HeaderWebEelement.isDisplayed();

			return true;
		} catch (Exception ex) {
			return false;

		}

	}

	public boolean VerifyOriginaladate() {
		try {
			WebElement HeaderWebEelement = new WebDriverWait(driver, 100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(Originaldate_xpath));
			HeaderWebEelement.isDisplayed();

			return true;
		} catch (Exception ex) {
			return false;

		}

	}

	public boolean VerifyIneligiblevalue() {
		try {
			WebElement HeaderWebEelement = new WebDriverWait(driver, 100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(balanceAmountDropdownValue_xpath));
			HeaderWebEelement.isDisplayed();

			return true;
		} catch (Exception ex) {
			return false;

		}

	}

	public boolean VerifyAccountno() {
		try {
			WebElement HeaderWebEelement = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(accountNo_xpath));
			HeaderWebEelement.isDisplayed();

			return true;
		} catch (Exception ex) {
			return false;

		}
	}

	public boolean VerifyAdjustmentAmnt() {
		try {
			WebElement HeaderWebEelement = new WebDriverWait(driver, 100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(Adjustmentamnt_xpath));
			HeaderWebEelement.isDisplayed();

			return true;
		} catch (Exception ex) {
			return false;

		}

	}

	public boolean VerifyInstrumentno() {
		try {
			WebElement HeaderWebEelement = new WebDriverWait(driver, 100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(Instrumentno_xpath));
			HeaderWebEelement.isDisplayed();

			return true;
		} catch (Exception ex) {
			return false;

		}

	}

	public boolean VerifyApplytoinvoice() {
		try {
			WebElement HeaderWebEelement = new WebDriverWait(driver, 100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(Applytoinvoice_xpath));
			HeaderWebEelement.isDisplayed();

			return true;
		} catch (Exception ex) {
			return false;

		}

	}

	public boolean VerifyStatefield() {
		try {
			WebElement HeaderWebEelement = new WebDriverWait(driver, 100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(State_xpath));
			HeaderWebEelement.isDisplayed();

			return true;
		} catch (Exception ex) {
			return false;

		}

	}

	public boolean VerifyCountryfield() {
		try {
			WebElement HeaderWebEelement = new WebDriverWait(driver, 100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(Country_xpath));
			HeaderWebEelement.isDisplayed();

			return true;
		} catch (Exception ex) {
			return false;
		}
	}

	public boolean AccountnoDropDown_Click() {
		try {
			String[] exp = { "account no", "Account name", "future", "current",
					"over30", "over60", "over90", "over120", "Total" };

			WebElement dropdown = driver.findElement(accountNo_xpath);

			dropdown.click();

			Select select = new Select(dropdown);

			List<WebElement> options = select.getOptions();

			for (WebElement we : options) {

				// boolean match = false;
				for (int i = 0; i < exp.length; i++) {
					if (we.getText().equals(exp[i])) {
						// match = true;
						System.out.println(we.getText());
					}
				}
				// Assert.assertTrue(match);
			}
		} catch (Exception e) {
			
			return false;
		}
		return true;
	}

	public boolean InvoicenoDropDown_Click() {
		try {
			String[] exp = { "Account", "Name", "Invoice", "Inv Date", "Amount" };

			WebElement dropdown = driver.findElement(Invoiceno_xpath);

			dropdown.click();

			Select select = new Select(dropdown);

			List<WebElement> options = select.getOptions();

			for (WebElement we : options) {

				// boolean match = false;
				for (int i = 0; i < exp.length; i++) {
					if (we.getText().equals(exp[i])) {
						// match = true;
						System.out.println(we.getText());
					}
				}
				// Assert.assertTrue(match);
			}
		} catch (Exception e) {

			return false;

		}
		return true;

	}

	public boolean VerifyUnappliedcashprefix() {
		try {
			WebElement HeaderWebEelement = new WebDriverWait(driver, 100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(Unappliedcashinvoice_xpath));
			HeaderWebEelement.isDisplayed();

			// ////Thread.sleep(5000);

			return true;
		} catch (Exception ex) {
			return false;

		}

	}

	public boolean VerifyPostalcode() {
		try {
			WebElement HeaderWebEelement = new WebDriverWait(driver, 100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(Postalcode_xpath));
			HeaderWebEelement.isDisplayed();

			// ////Thread.sleep(5000);
			return true;
		} catch (Exception ex) {
			return false;
		}
	}

	public boolean VerifyUrlfield() {
		try {
			WebElement HeaderWebEelement = new WebDriverWait(driver, 100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(Url_xpath));
			HeaderWebEelement.isDisplayed();

			// ////Thread.sleep(5000);
			return true;
		} catch (Exception ex) {

			return false;
		}
	}

	public boolean VerifyPhoneNumber() {
		try {
			WebElement HeaderWebEelement = new WebDriverWait(driver, 100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(Phonenumber_xpath));
			HeaderWebEelement.isDisplayed();

			// ////Thread.sleep(5000);
			return true;
		} catch (Exception ex) {
			return false;

		}
	}

	public boolean VerifyFaxField() {
		try {
			WebElement HeaderWebEelement = new WebDriverWait(driver, 100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(Fax_xpath));
			HeaderWebEelement.isDisplayed();

			// ////Thread.sleep(5000);
			return true;
		} catch (Exception ex) {
			return false;

		}
	}

	public boolean VerifyAltphonefield() {
		try {
			WebElement HeaderWebEelement = new WebDriverWait(driver, 100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(Altphone_xpath));
			HeaderWebEelement.isDisplayed();

			// ////Thread.sleep(5000);

			return true;
		} catch (Exception ex) {
			return false;
		}
	}

	public MappingListViewPage(WebDriver driver) {
		super(driver);

		try {
			// ////Thread.sleep(1000);
		} catch (Exception e) {

			e.printStackTrace();
		}
		if (!driver.findElement(MappingListViewPageHeader).getText().trim()
				.equals("Mapping List View")) {
			throw new SkipException("Mapping List View screen couldn't open.");
		}

	}

	public boolean VerifyInsuranceLimit() {
		try {
			WebElement HeaderWebEelement = new WebDriverWait(driver, 100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(Insurancelimit_xpath));
			HeaderWebEelement.isDisplayed();

			// ////Thread.sleep(5000);
			return true;
		} catch (Exception ex) {
			return false;

		}

	}

	public boolean VerifyIneligiblereason() {
		try {
			WebElement HeaderWebEelement = new WebDriverWait(driver, 100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(IneligibleReason_xpath));
			HeaderWebEelement.isDisplayed();

			return true;
		} catch (Exception ex) {
			return false;

		}
	}

	public boolean BatchreferenceNoDropDown_Click() {

		try {
			String[] exp = { "Account", "Name", "Invoice", "Inv Date", "Amount" };

			WebElement dropdown = driver.findElement(Orderno_xpath);

			dropdown.click();

			Select select = new Select(dropdown);

			List<WebElement> options = select.getOptions();

			for (WebElement we : options) {

				// boolean match = false;
				for (int i = 0; i < exp.length; i++) {
					if (we.getText().equals(exp[i])) {
						// match = true;
						System.out.println(we.getText());
					}
				}
				// Assert.assertTrue(match);
			}
		} catch (Exception e) {
			
			return false;
		}
		return true;

	}

	public boolean Click_on_Selectvaluecolumntb() {
		try {
			WebElement HeaderWebEelement = new WebDriverWait(driver, 100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(Selectbyvaluetb_xpath));
			HeaderWebEelement.click();
			// ////Thread.sleep(5000);
			return true;
		} catch (Exception ex) {

			return false;

		}
	}

	public boolean Click_on_Selectvaluetexttb() {
		try {
			WebElement HeaderWebEelement = new WebDriverWait(driver, 100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(Selectbytexttb_xpath));
			HeaderWebEelement.click();
			// ////Thread.sleep(5000);
			return true;
		} catch (Exception ex) {

			return false;

		}

	}

	public boolean Click_on_SampleExcelSheet() {
		try {
			WebElement HeaderWebEelement = new WebDriverWait(driver, 100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(SampleExcel_xpath));
			HeaderWebEelement.click();
			// Thread.sleep(5000);
			return true;
		} catch (Exception ex) {
			return false;

		}

	}

	// click on popup cross//kruthivas

	public boolean clickOnPopupCross() {
		try {
			WebElement clickOnPopupDelete = new WebDriverWait(driver, 5)
					.until(ExpectedConditions
							.visibilityOfElementLocated(Click_on_crossPop_up_xpath));
			clickOnPopupDelete.click();

			return true;
		} catch (Exception ex) {
			return false;
		}
	}

	public boolean Select_collateralname(String sw1) {
		try {
			WebElement accTypeDropdownWebEelement = new WebDriverWait(driver,
					10).until(ExpectedConditions
					.visibilityOfElementLocated(collname_xpath));
			Select sel = new Select(accTypeDropdownWebEelement);
			List<WebElement> list = sel.getOptions();
			for (WebElement ele : list) {
				if (ele.getText().equals(sw1)) {
					ele.click();
					// //Thread.sleep(5000);
					break;
				}
			}
			return true;
		} catch (Exception ex) {
		}
		return false;

	}

	public boolean VerifyAdressline2() {
		try {
			WebElement HeaderWebEelement = new WebDriverWait(driver, 100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(Adresline2_xpath));
			HeaderWebEelement.isDisplayed();
			// //Thread.sleep(5000);
			return true;
		} catch (Exception ex) {
			return false;
		}
	}

	public boolean RetentionDropDown_Click() {
		try {
			String[] exp = { "account no", "Account name", "future", "current",
					"over30", "over60", "over90", "over120", "Total" };

			WebElement dropdown = driver.findElement(Retention_xpath);

			dropdown.click();

			Select select = new Select(dropdown);

			List<WebElement> options = select.getOptions();

			for (WebElement we : options) {

				// boolean match = false;
				for (int i = 0; i < exp.length; i++) {
					if (we.getText().equals(exp[i])) {
						// match = true;
						System.out.println(we.getText());
					}
				}
				// Assert.assertTrue(match);
			}
		} catch (Exception e) {
			return false;
		}
		return true;
	}

	public boolean Over30DropDown_Click() {
		try {
			String[] exp = { "account no", "Account name", "future", "current",
					"over30", "over60", "over90", "over120", "Total" };

			WebElement dropdown = driver.findElement(over30_xpath);

			dropdown.click();

			Select select = new Select(dropdown);

			List<WebElement> options = select.getOptions();

			for (WebElement we : options) {

				// boolean match = false;
				for (int i = 0; i < exp.length; i++) {
					if (we.getText().equals(exp[i])) {
						// match = true;
						System.out.println(we.getText());
					}
				}
				// Assert.assertTrue(match);
			}
		} catch (Exception e) {

			return false;

		}
		return false;
	}

	public boolean AccountNumberLength(String length) {
		try {

			WebElement collateralNameFieldInputWebEelement = new WebDriverWait(
					driver, 100).until(ExpectedConditions
					.visibilityOfElementLocated(Accountnolength_xpath));
			collateralNameFieldInputWebEelement.clear();
			collateralNameFieldInputWebEelement.sendKeys(length);
			// Thread.sleep(2000);

			return true;
		} catch (Exception ex) {
			return false;
		}
	}

	public boolean SelectFromCurrentamountDrsopdown(String visibleTexts)
			throws InterruptedException {

		try {
			WebElement DropdownWebEelements1 = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(Currentdetails_xpath));
			DropdownWebEelements1.click();
			Select sel = new Select(DropdownWebEelements1);

			List<WebElement> list = sel.getOptions();

			for (WebElement ele : list) {
				String data = ele.getText();
				System.out.println(data);

				if (ele.getText().equals(visibleTexts)) {
					ele.click();

					break;
				}
			}
			return true;
		} catch (Exception ex) {

		}

		return false;
	}

	public Boolean VerifyNoofheaderows() {
		try {
			WebElement HeaderWebEelement = new WebDriverWait(driver, 100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(noOfHeaderRows_xpath));
			HeaderWebEelement.isDisplayed();
			// Thread.sleep(5000);
			return true;
		} catch (Exception ex) {

			return false;
		}

	}

	public Boolean VerifyCreatemapBtn() {
		try {
			WebElement HeaderWebEelement = new WebDriverWait(driver, 100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(createNewMapping_xpath));
			HeaderWebEelement.isDisplayed();
			// //Thread.sleep(5000);
			return true;
		} catch (Exception ex) {

			return false;
		}
	}

	public Boolean VerifyMappingNameTB() {
		try {
			WebElement HeaderWebEelement = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(collateralNameField_xpath));
			HeaderWebEelement.isDisplayed();
			// //Thread.sleep(5000);
			return true;

		} catch (Exception ex) {
			return false;

		}
	}

	public Boolean VerifyStatus() {
		try {
			WebElement HeaderWebEelement = new WebDriverWait(driver, 100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(Status_xpath));
			HeaderWebEelement.isDisplayed();
			// Thread.sleep(5000);
			return true;
		} catch (Exception ex) {

			return false;
		}

	}

	public boolean clickcreateNewMapping() {
		try {

			Thread.sleep(2000);

			WebElement clickcreateNewMappingWebEelement = new WebDriverWait(
					driver, 100).until(ExpectedConditions
					.visibilityOfElementLocated(createNewMapping_xpath));
			clickcreateNewMappingWebEelement.click();

			this.isAlertPresent();

			return true;
		} catch (Exception ex) {
			return false;
		}
	}
	public boolean nextButtonClick1() {
        try {
            // Thread.sleep(1000);
            WebElement nextButtonClickWebEelement = new WebDriverWait(driver,
                    10).until(ExpectedConditions
                    .visibilityOfElementLocated(nextButton_xpath));
            nextButtonClickWebEelement.click();
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

	public boolean Over120DropDown_Click() {
		try {
			String[] exp = { "account no", "Account name", "future", "current",
					"over30", "over60", "over90", "over120", "Total" };

			WebElement dropdown = driver.findElement(over120_xpath);

			dropdown.click();

			Select select = new Select(dropdown);

			List<WebElement> options = select.getOptions();

			for (WebElement we : options) {

				// boolean match = false;
				for (int i = 0; i < exp.length; i++) {
					if (we.getText().equals(exp[i])) {
						// match = true;
						System.out.println(we.getText());
					}
				}
				// Assert.assertTrue(match);
			}
		} catch (Exception e) {

			return false;

		}
		return true;

	}

	public boolean CurrentamtDropDown_Click() {
		try {
			String[] exp = { "account no", "Account name", "future", "current",
					"over30", "over60", "over90", "over120", "Total" };

			WebElement dropdown = driver.findElement(current_xpath);

			dropdown.click();

			Select select = new Select(dropdown);

			List<WebElement> options = select.getOptions();

			for (WebElement we : options) {

				// boolean match = false;
				for (int i = 0; i < exp.length; i++) {
					if (we.getText().equals(exp[i])) {
						// match = true;
						System.out.println(we.getText());
					}
				}
				// Assert.assertTrue(match);
			}
		} catch (Exception e) {

			return false;
		}
		return true;
	}

	public boolean VerifyAutofiledocumentcheckbox() {
		try {
			WebElement HeaderWebEelement = new WebDriverWait(driver, 100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(Autofile_xpath));
			HeaderWebEelement.isDisplayed();

			// Thread.sleep(5000);
			return true;
		} catch (Exception ex) {
			return false;

		}

	}

	public boolean VerifyConsiderAccountrowtextbox() {
		try {
			WebElement HeaderWebEelement = new WebDriverWait(driver, 20)
					.until(ExpectedConditions
							.visibilityOfElementLocated(Considerrowtb_xpath));
			HeaderWebEelement.isDisplayed();

			// Thread.sleep(5000);
			return true;
		} catch (Exception ex) {
			return false;

		}
	}

	public boolean VerifyUnappliedcashparam() {
		try {
			WebElement HeaderWebEelement = new WebDriverWait(driver, 100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(Unappliedcashparam_xpath));
			HeaderWebEelement.isDisplayed();
			// ////Thread.sleep(5000);
			return true;
		} catch (Exception ex) {
			return false;

		}

	}

	public boolean VerifyAdressline1() {
		try {
			WebElement HeaderWebEelement = new WebDriverWait(driver, 100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(Adresline1_xpath));
			HeaderWebEelement.isDisplayed();

			// ////Thread.sleep(5000);
			return true;
		} catch (Exception ex) {
			return false;

		}
	}

	public boolean VerifyCityField() {
		try {
			WebElement HeaderWebEelement = new WebDriverWait(driver, 100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(City_xpath));
			HeaderWebEelement.isDisplayed();

			return true;
		} catch (Exception ex) {
			return false;

		}
	}

	public boolean Click_on_AttachtoBBC() {
		try {
			WebElement HeaderWebEelement = new WebDriverWait(driver, 100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(AttachBBC_xpath));
			HeaderWebEelement.click();
			// ////Thread.sleep(5000);
			return true;
		} catch (Exception ex) {
			return false;

		}

	}

	public boolean fileUpload_ineligible() {
		try {
			StringSelection ss = new StringSelection(
					"D:\\GITWorkSpace\\cyncautomation\\Cync_Automation_Project\\FileUpload\\CreditData.xlsx");
		
			Toolkit.getDefaultToolkit().getSystemClipboard()
					.setContents(ss, null);

			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);

			// ////Thread.sleep(3000);
			return true;
		} catch (Exception e) {
		}
		return false;

	}

	public boolean Over60DropDown_Click() {
		try {
			String[] exp = { "account no", "Account name", "future", "current",
					"over30", "over60", "over90", "over120", "Total" };

			WebElement dropdown = driver.findElement(over60_xpath);

			dropdown.click();

			Select select = new Select(dropdown);

			List<WebElement> options = select.getOptions();

			for (WebElement we : options) {

				// boolean match = false;
				for (int i = 0; i < exp.length; i++) {
					if (we.getText().equals(exp[i])) {
						// match = true;
						System.out.println(we.getText());
					}
				}
				// Assert.assertTrue(match);
			}
		} catch (Exception e) {

			return false;
		}

		return true;
	}

	public boolean Over90DropDown_Click() {
		try {
			String[] exp = { "account no", "Account name", "future", "current",
					"over30", "over60", "over90", "over120", "Total" };

			WebElement dropdown = driver.findElement(over90_xpath);

			dropdown.click();

			Select select = new Select(dropdown);

			List<WebElement> options = select.getOptions();

			for (WebElement we : options) {

				// boolean match = false;
				for (int i = 0; i < exp.length; i++) {
					if (we.getText().equals(exp[i])) {
						// match = true;
						System.out.println(we.getText());
					}
				}
				// Assert.assertTrue(match);
			}
		} catch (Exception e) {

			return false;
		}
		return true;
	}

	public Boolean VerifyPageHeader() {
		try {
			WebElement HeaderWebEelement = new WebDriverWait(driver, 100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(MappingListViewPageHeader));
			HeaderWebEelement.isDisplayed();
			// //Thread.sleep(5000);
			return true;
		} catch (Exception ex) {
			return false;

		}
	}

	public boolean Selectvaluecolumntb(String length) {
		try {

			WebElement collateralNameFieldInputWebEelement = new WebDriverWait(
					driver, 100).until(ExpectedConditions
					.visibilityOfElementLocated(Selectbyvaluetb_xpath));
			collateralNameFieldInputWebEelement.clear();
			collateralNameFieldInputWebEelement.sendKeys(length);
			// Thread.sleep(2000);

			return true;

		} catch (Exception ex) {

			return false;
		}

	}

	public Boolean VerifyDataFileType() {
		try {
			WebElement HeaderWebEelement = new WebDriverWait(driver, 100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(Datafiletype_xpath));
			HeaderWebEelement.isDisplayed();
			// ////Thread.sleep(5000);
			return true;

		} catch (Exception ex) {
			return false;
		}
	}

	public Boolean VerifyFileFormat() {
		try {
			WebElement HeaderWebEelement = new WebDriverWait(driver, 100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(FileFormat_xpath));
			HeaderWebEelement.isDisplayed();
			// ////Thread.sleep(5000);
			return true;

		} catch (Exception ex) {
			return false;
		}
	}

	public boolean Click_on_Discardvaluetext() {
		try {
			WebElement HeaderWebEelement = new WebDriverWait(driver, 100)

			.until(ExpectedConditions
					.visibilityOfElementLocated(DiscardValueText_xpath));
			HeaderWebEelement.click();
			// Thread.sleep(5000);
			HeaderWebEelement.isDisplayed();
			// ////Thread.sleep(5000);

			return true;
		} catch (Exception ex) {
			return false;

		}

	}

	public boolean Discardvaluetext(String length) {
		try {

			WebElement collateralNameFieldInputWebEelement = new WebDriverWait(
					driver, 100).until(ExpectedConditions
					.visibilityOfElementLocated(DiscardValueText_xpath));
			collateralNameFieldInputWebEelement.clear();
			collateralNameFieldInputWebEelement.sendKeys(length);
			// Thread.sleep(2000);

			return true;
		} catch (Exception ex) {
			return false;
		}

	}

	public Boolean VerifyCollateralName() {
		try {
			WebElement HeaderWebEelement = new WebDriverWait(driver, 100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(CollateralName_xpath));
			HeaderWebEelement.isDisplayed();
			// ////Thread.sleep(5000);
			return true;
		} catch (Exception ex) {

			return false;
		}

	}

	public Boolean VerifyAction() {
		try {
			WebElement HeaderWebEelement = new WebDriverWait(driver, 100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(Actions_xpath));
			HeaderWebEelement.isDisplayed();
			// ////Thread.sleep(5000);
			return true;

		} catch (Exception ex) {
			return false;

		}
	}

	public boolean Click_on_Discardvaluecolumn() {
		try {
			WebElement HeaderWebEelement = new WebDriverWait(driver, 100)

			.until(ExpectedConditions
					.visibilityOfElementLocated(Discardvaluecolumn_xpath));
			HeaderWebEelement.click();
			// Thread.sleep(5000);
			return true;
		} catch (Exception ex) {

			return false;
		}

	}

	public boolean Click_on_Datafiletype(String sw) {
		try {
			WebElement accTypeDropdownWebEelement = new WebDriverWait(driver,
					10).until(ExpectedConditions
					.visibilityOfElementLocated(dataFileType_xpath));
			Select sel = new Select(accTypeDropdownWebEelement);
			List<WebElement> list = sel.getOptions();
			for (WebElement ele : list) {
				if (ele.getText().equals(sw)) {
					ele.click();
					// ////Thread.sleep(5000);
					break;
				}
			}
			return true;
		} catch (Exception ex) {
		}
		return false;
	}

	public boolean Click_on_Discardrowcolumn() {
		try {
			WebElement HeaderWebEelement = new WebDriverWait(driver, 100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(DiscardRow_xpath));
			HeaderWebEelement.click();
			HeaderWebEelement.clear();
			Thread.sleep(5000);
			return true;
		} catch (Exception ex) {
			return false;

		}
	}

	public boolean Discardvaluecolumn(String length) {
		try {

			WebElement collateralNameFieldInputWebEelement = new WebDriverWait(
					driver, 100).until(ExpectedConditions
					.visibilityOfElementLocated(Discardvaluecolumn_xpath));
			collateralNameFieldInputWebEelement.clear();
			collateralNameFieldInputWebEelement.sendKeys(length);
			// Thread.sleep(2000);

			return true;
		} catch (Exception ex) {
			return false;
		}

	}

	public Boolean VerifyNextBtn() {
		try {
			WebElement HeaderWebEelement = new WebDriverWait(driver, 100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(nextButton_xpath));
			HeaderWebEelement.isDisplayed();
			// //Thread.sleep(5000);
			return true;
		} catch (Exception ex) {

			return false;
		}

	}

	public Boolean VerifyReverseSigncheckbox() {
		try {
			WebElement HeaderWebEelement = new WebDriverWait(driver, 100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(Reversesign_xpath));
			HeaderWebEelement.isDisplayed();
			// //Thread.sleep(5000);
			return true;
		} catch (Exception ex) {

			return false;
		}

	}

	public boolean fileUPload_mapping5() {
		try {
            Thread.sleep(500);
			StringSelection ss = new StringSelection(
					"D:\\GITWorkSpace\\cyncautomation\\Cync_Automation_Project\\FileUpload\\apsumarypayble.xlsx");
		
			Toolkit.getDefaultToolkit().getSystemClipboard()
					.setContents(ss, null);

			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);

			Thread.sleep(3000);
			return true;
		} catch (Exception e) {
		}
		return false;

	}

	public boolean OrdernoDropDown_Click() {
		try {
			String[] exp = { "Account", "Name", "Invoice", "Inv Date", "Amount" };

			WebElement dropdown = driver.findElement(Orderno_xpath);

			dropdown.click();

			Select select = new Select(dropdown);

			List<WebElement> options = select.getOptions();

			for (WebElement we : options) {

				// boolean match = false;
				for (int i = 0; i < exp.length; i++) {
					if (we.getText().equals(exp[i])) {
						// match = true;
						System.out.println(we.getText());
					}
				}
				// Assert.assertTrue(match);
			}
		} catch (Exception e) {

			return false;
		}
		return true;
	}

	public boolean DueDateDropDown_Click() {
		try {
			String[] exp = { "Account", "Name", "Invoice", "Inv Date", "Amount" };

			WebElement dropdown = driver.findElement(Duedate_xpath);

			dropdown.click();

			Select select = new Select(dropdown);

			List<WebElement> options = select.getOptions();

			for (WebElement we : options) {

				// boolean match = false;
				for (int i = 0; i < exp.length; i++) {
					if (we.getText().equals(exp[i])) {
						// match = true;
						System.out.println(we.getText());
					}
				}
				// Assert.assertTrue(match);
			}
		} catch (Exception e) {

			return false;

		}
		return true;

	}

	public boolean FutureDropDown_Click() {
		try {
			String[] exp = { "account no", "Account name", "future", "current",
					"over30", "over60", "over90", "over120", "Total" };

			WebElement dropdown = driver.findElement(future_xpath);

			dropdown.click();

			Select select = new Select(dropdown);

			List<WebElement> options = select.getOptions();

			for (WebElement we : options) {

				// boolean match = false;
				for (int i = 0; i < exp.length; i++) {
					if (we.getText().equals(exp[i])) {
						// match = true;
						System.out.println(we.getText());
					}
				}
				// Assert.assertTrue(match);
			}
		} catch (Exception e) {

			return false;

		}
		return true;

	}

	public boolean Selectvaluetext(String length) {
		try {

			WebElement collateralNameFieldInputWebEelement = new WebDriverWait(
					driver, 100).until(ExpectedConditions
					.visibilityOfElementLocated(Selectbytexttb_xpath));
			collateralNameFieldInputWebEelement.clear();
			collateralNameFieldInputWebEelement.sendKeys(length);
			Thread.sleep(2000);

			return true;

		} catch (Exception ex) {

			return false;
		}
	}



	public Boolean VerifyAttachmenttoBBC() {
		try {
			WebElement HeaderWebEelement = new WebDriverWait(driver, 100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(AttachBBC_xpath));
			HeaderWebEelement.isDisplayed();
			// //Thread.sleep(5000);
			return true;
		} catch (Exception ex) {

			return false;
		}
	}

	public Boolean VerifyAccountNoLengthtb() {
		try {
			WebElement HeaderWebEelement = new WebDriverWait(driver, 100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(Accountnolength_xpath));
			HeaderWebEelement.isDisplayed();
			// //Thread.sleep(5000);
			return true;
		} catch (Exception ex) {

			return false;
		}

	}

	public String VerifyActions(String d) {
		try {
			WebElement HeaderWebEelement = new WebDriverWait(driver, 100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(dataFileType_xpath));
			HeaderWebEelement.click();

			HeaderWebEelement.sendKeys(d);
		} catch (Exception ex) {
		}
		return d;
	}

	public Boolean VerifyChoosefileBtn() {
		try {
			WebElement HeaderWebEelement = new WebDriverWait(driver, 100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(chooseFile_xpath));
			HeaderWebEelement.isDisplayed();
			// Thread.sleep(5000);
			return true;
		} catch (Exception e) {

			return false;
		}
	}

	public Boolean VerifyFileFormatDropdown() {
		try {
			WebElement HeaderWebEelement = new WebDriverWait(driver, 100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(fileFormat_xpath));
			HeaderWebEelement.isDisplayed();
			return true;
		} catch (Exception ex) {

			return false;
		}

	}

	public boolean OrginaldateDropDown_Click() {
		try {
			String[] exp = { "Account", "Name", "Invoice", "Inv Date", "Amount" };

			WebElement dropdown = driver.findElement(Originaldate_xpath);

			dropdown.click();

			Select select = new Select(dropdown);

			List<WebElement> options = select.getOptions();

			for (WebElement we : options) {

				// boolean match = false;
				for (int i = 0; i < exp.length; i++) {
					if (we.getText().equals(exp[i])) {
						// match = true;
						System.out.println(we.getText());
					}
				}
				// Assert.assertTrue(match);
			}
		} catch (Exception e) {

			return false;
		}
		return true;
	}

	public boolean Click_on_Map1listview() {
		try {
			WebElement HeaderWebEelement = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(Map_xapth));
			HeaderWebEelement.click();
			Thread.sleep(5000);

			return true;
		} catch (Exception ex) {
			return false;
		}
	}

	public boolean collateralNameFieldInput(String collateralNameFieldData) {
		try {
            
			WebElement collateralNameFieldInputWebEelement = new WebDriverWait(
					driver, 10).until(ExpectedConditions
					.visibilityOfElementLocated(VerifyMappingNameTB_xpath));
			Thread.sleep(1000);

			collateralNameFieldInputWebEelement.clear();

			collateralNameFieldInputWebEelement
					.sendKeys(collateralNameFieldData);
			return true;
		} catch (Exception ex) {
			return false;
		}
	}

	public boolean AccountnameDropDown_Click() {
		try {
			String[] exp = { "account no", "Account name", "future", "current",
					"over30", "over60", "over90", "over120", "Total" };

			WebElement dropdown = driver.findElement(accountName_xpath);

			dropdown.click();

			Select select = new Select(dropdown);

			List<WebElement> options = select.getOptions();

			for (WebElement we : options) {

				// boolean match = false;
				for (int i = 0; i < exp.length; i++) {
					if (we.getText().equals(exp[i])) {
						// match = true;
						System.out.println(we.getText());
					}
				}
				// Assert.assertTrue(match);
			}
		} catch (Exception e) {

			return false;
		}
		return true;
	}

	public boolean CollateralnameDropDown_Click() {
		try {
			String[] exp = { "account no", "Account name", "future", "current",
					"over30", "over60", "over90", "over120", "Total" };

			WebElement dropdown = driver.findElement(collateralType_xpath);

			dropdown.click();

			Select select = new Select(dropdown);

			List<WebElement> options = select.getOptions();

			for (WebElement we : options) {

				// boolean match = false;
				for (int i = 0; i < exp.length; i++) {
					if (we.getText().equals(exp[i])) {
						// match = true;
						System.out.println(we.getText());
					}
				}
				// Assert.assertTrue(match);
			}
		} catch (Exception e) {

			return false;
		}
		return true;

	}

	public boolean VerifyMonarchmap() {
		try {
			WebElement HeaderWebEelement = new WebDriverWait(driver, 100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(Monarchmap_xpath));
			HeaderWebEelement.isDisplayed();

			StringSelection ss = new StringSelection(
					"D:\\GITWorkSpace\\cyncautomation\\Cync_Automation_Project\\FileUpload\\summary_file.xlsx");
			Toolkit.getDefaultToolkit().getSystemClipboard()
					.setContents(ss, null);

			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);

			return true;
		} catch (Exception ex) {
			return false;

		}

	}

	public boolean fileUPload_mapping1() {
		try {
			Thread.sleep(1000);
			StringSelection ss = new StringSelection(
					"D:\\cyncautomation\\Cync_Automation_Project\\FileUpload\\newARSummary1.xlsx");
		
			Toolkit.getDefaultToolkit().getSystemClipboard()
					.setContents(ss, null);

			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);

			return true;
		} catch (Exception e) {
		
		}
		return false;

	}

	public boolean VerifySavebtn() {
		try {
			WebElement HeaderWebEelement = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(nextButton_xpath));
			HeaderWebEelement.isDisplayed();

			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);

			Thread.sleep(3000);
			return true;
		} catch (Exception e) {
			// //Thread.sleep(3000);
			return false;
		}

	}

		public boolean saveButtonClick()
	{
	try{

		WebElement nextButtonClickWebEelement=new WebDriverWait(driver,100)
		.until(ExpectedConditions.visibilityOfElementLocated(savebtn_xpath));
		nextButtonClickWebEelement.click();
		this.isAlertPresent();
		////Thread.sleep(10000);
		this.isAlertPresent();

			return true;
		} catch (Exception ex) {
			return false;
		}

	}
	
	


	public boolean nextButtonClick() {
		try {
			Thread.sleep(1000);
			WebElement nextButtonClickWebEelement = new WebDriverWait(driver,
					10).until(ExpectedConditions
					.visibilityOfElementLocated(nextButton_xpath));
			nextButtonClickWebEelement.click();
			return true;
		} catch (Exception ex) {
			return false;
		}
	}
	public void fileUPload_mappingArDetails_forMultipleDivision() {

		 

        String filepath = "D:\\cyncautomation\\Cync_Automation_Project\\FileUpload\\newARAllBuckets.xlsx";
        fileUpload(chooseFile_xpath, filepath);

 

    }

	public boolean currentAmountValues(String currentAmountValue) {
		try {
			WebElement productTypeDropdownWebEelement = new WebDriverWait(
					driver, 10).until(ExpectedConditions
					.visibilityOfElementLocated(currentAmount_xpath));
			Select sel = new Select(productTypeDropdownWebEelement);
			List<WebElement> list = sel.getOptions();
			for (WebElement ele : list) {
				if (ele.getText().equals(currentAmountValue)) {
					Actions action = new Actions(driver);
					action.doubleClick(ele).build().perform();

					return true;
				}
			}
		} catch (Exception ex) {
		}
		return false;
	}

	public boolean nextButtonClick_step2() {
		try {

			WebElement nextButtonClickWebEelement = new WebDriverWait(driver,
					10).until(ExpectedConditions
					.visibilityOfElementLocated(savebtn_xpath));
			nextButtonClickWebEelement.click();
			return true;
		}

		catch (Exception ex) {
			return false;
		}
	}

	public boolean Verifymappingliststep3() {
		try {
			WebElement HeaderWebEelement = new WebDriverWait(driver, 100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(Mappinliststep3_xpath));
			HeaderWebEelement.isDisplayed();

			// ////Thread.sleep(5000);
			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);

			// ////Thread.sleep(3000);

			return true;
		} catch (Exception ex) {
			return false;
		}
	}

	public boolean fileUPload_mapping6() {
		try {
             Thread.sleep(1000);
			StringSelection ss = new StringSelection(
					"D:\\cyncautomation\\Cync_Automation_Project\\FileUpload\\Inventory.xlsx");
		
			Toolkit.getDefaultToolkit().getSystemClipboard()
					.setContents(ss, null);

			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);

			// Thread.sleep(3000);
			return true;
		} catch (Exception e) {
			// ////Thread.sleep(3000);
			return false;

		}
	}

	public boolean collateralTypedropdownValues(
			String collateralTypeDropdownValue) {

		try {
                  
			WebElement dropdown = driver.findElement(collateralType_xpath);

			Select select = new Select(dropdown);
			select.selectByVisibleText(collateralTypeDropdownValue);
			/*List<WebElement> options = select.getOptions();

			for (WebElement item : options) {
				System.out.println(item.getText());
				if (item.getText().equals(collateralTypeDropdownValue)) {
					item.click();

					Thread.sleep(3000);

					return true;
				}
			}
*/        
			return true;
		} catch (Exception e) {
		}
		return false;

	}
	
	
	public boolean collateralTypedropdownValues1(
            String collateralTypeDropdownValue) {

 

        try {
            
             Thread.sleep(3000);        
            WebElement dropdown = driver.findElement(collateralType_xpath);

 

            Select select = new Select(dropdown);
            List<WebElement> options = select.getOptions();

 

            for (WebElement item : options) {
                System.out.println(item.getText());
                if (item.getText().equals(collateralTypeDropdownValue)) {
                    item.click();

 

                    //Thread.sleep(3000);

 

                    return true;
                }
            }
        
            return true;
        } catch (Exception e) {
        }
        return false;

 
	}
    
	

	public boolean noOfHeaderRowsFieldInput(String noOfHeaderRowsData) {
		try {
			WebElement productTypeDropdownWebEelement = new WebDriverWait(
					driver, 10).until(ExpectedConditions
					.visibilityOfElementLocated(collateralType_xpath));
			Select sel = new Select(productTypeDropdownWebEelement);
			List<WebElement> list = sel.getOptions();
			for (WebElement ele : list) {
				if (ele.getText().equals(collateralTypeDropdownValue)) {
					ele.click();
					Thread.sleep(500);

					
				}
			}
			 return true;
		} catch (Exception ex) {
		}
		return false;
	}


	public boolean clickOnAttachDocToBbc() {
		try {
			// //Thread.sleep(5000);
			WebElement clickOnattchBbcWebElement = new WebDriverWait(driver,
					100).until(ExpectedConditions
					.visibilityOfElementLocated(attachdocumentToBbc_xpath));
			clickOnattchBbcWebElement.click();
			return true;

		} catch (Exception e) {

		}
		return false;

	}

	public boolean accountNodropdownValues(String accountNoDropdownValue) {
		try {
			Thread.sleep(1000);
			WebElement productTypeDropdownWebEelement = new WebDriverWait(
					driver, 10).until(ExpectedConditions
					.visibilityOfElementLocated(accountNo_xpath));
			// Thread.sleep(2000);
			Select sel = new Select(productTypeDropdownWebEelement);
			sel.selectByVisibleText(accountNoDropdownValue);
			
			/*List<WebElement> list = sel.getOptions();
			for (WebElement ele : list) {
				if (ele.getText().equals(accountNoDropdownValue)) {
					ele.click();

					Thread.sleep(500);

					return true;
				}
			}*/
			return true;
		} catch (Exception ex) {
		}
		return false;
	}
	
	
	public boolean accountNodropdownValues1(String accountNoDropdownValue) {
		try {
			WebElement productTypeDropdownWebEelement = new WebDriverWait(
					driver, 10).until(ExpectedConditions
					.visibilityOfElementLocated(accountNo_xpath));
			// Thread.sleep(2000);
			Select sel = new Select(productTypeDropdownWebEelement);
			List<WebElement> list = sel.getOptions();
			for (WebElement ele : list) {
				if (ele.getText().equals(accountNoDropdownValue)) {
					ele.click();

					Thread.sleep(500);

					return true;
				}
			}
		} catch (Exception ex) {
		}
		return false;
	}

	public boolean fileFormatdropdownValues(String fileFormatDropdownValue) {
		try {
			WebElement productTypeDropdownWebEelement = new WebDriverWait(
					driver, 10).until(ExpectedConditions
					.visibilityOfElementLocated(fileFormat_xpath));
			Select sel = new Select(productTypeDropdownWebEelement);
			
			List<WebElement> list = sel.getOptions();
			for (WebElement ele : list) {
				if (ele.getText().equals(fileFormatDropdownValue)) {
					ele.click();

                     this.isAlertPresent();

					Thread.sleep(500);
					return true;
				}
			}
		}
		catch (Exception ex) {
		}
		return false;
	}

	public boolean sheetNoFieldInput(String sheetNoFieldData) {
		try {

			WebElement collateralNameFieldInputWebEelement = new WebDriverWait(
					driver, 100).until(ExpectedConditions
					.visibilityOfElementLocated(sheetNo_xpath));
			collateralNameFieldInputWebEelement.clear();
			collateralNameFieldInputWebEelement.sendKeys(sheetNoFieldData);
			Thread.sleep(100);

			return true;
		} catch (Exception ex) {
			return false;
		}
	}
	public void fileUPload_mappingArDetails_forMultipleDivision1() {
        // rohit
        String filepath = "D:\\cyncautomation\\Cync_Automation_Project\\FileUpload\\newARAllBuckets.xlsx";
        BasePage base=new BasePage(driver);
        base.fileUpload(chooseFile_xpath, filepath);
    }

	public boolean clickchooseFile() {

		try {
			WebElement clickchooseFileWebEelement = new WebDriverWait(driver,
					10).until(ExpectedConditions
					.visibilityOfElementLocated(chooseFile_xpath));
			clickchooseFileWebEelement.isDisplayed();
			clickchooseFileWebEelement.click();
			Thread.sleep(200);
			return true;
		} catch (Exception ex) {
			return false;
		}

	}

	public boolean fileUPload_mapping4() {
		try {
			StringSelection ss = new StringSelection(
					"D:/Cync_Project_Automation/cyncautomation/Cync_Automation_Project/FileUpload/summarypayables.xlsx");
		
			Toolkit.getDefaultToolkit().getSystemClipboard()
					.setContents(ss, null);

			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);

			// ////Thread.sleep(3000);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return false;
	}


	public boolean ClickMonarchmap() {
		try {
			WebElement HeaderWebEelement = new WebDriverWait(driver, 100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(Monarchmap_xpath));
			HeaderWebEelement.click();

			return true;
		} catch (Exception ex) {
			return false;

		}

	}
	public boolean VerifyAccountname() {
		try {
			WebElement HeaderWebEelement = new WebDriverWait(driver, 100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(accountName_xpath));

			HeaderWebEelement.isDisplayed();
			// //Thread.sleep(5000);
			return true;

		} catch (Exception ex) {
			return false;
		}
	}
/*public boolean  fileUPload_mapping4(){
	try {	
	StringSelection ss = new StringSelection("D:\\Workspace\\cyncautomation\\cyncautomation\\Cync_Automation_Project\\FileUpload\\summarypayables.xlsx");
	//StringSelection ss = new StringSelection("D:\\AutomationCI\\Cync_Automation_Project\\src\\test\resources\\cynclogo_fin.png");
	
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
	
	Robot robot = new Robot();
	robot.keyPress(KeyEvent.VK_CONTROL);
	robot.keyPress(KeyEvent.VK_V);
	robot.keyRelease(KeyEvent.VK_V);
	robot.keyRelease(KeyEvent.VK_CONTROL);
	robot.keyPress(KeyEvent.VK_ENTER);
	robot.keyRelease(KeyEvent.VK_ENTER);
			
	//////Thread.sleep(3000);
	return true;
} catch (Exception e) {
	// TODO: handle exception
}
return false;
}*/

	public boolean fileUPload_mapping2() {
		try {

			StringSelection ss = new StringSelection(
					"D:\\cyncautomation\\Cync_Automation_Project\\FileUpload\\newARAllBuckets.xlsx");

			Toolkit.getDefaultToolkit().getSystemClipboard()
					.setContents(ss, null);

			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);

			// Thread.sleep(3000);
			return true;
		} catch (Exception e) {
		}
		return false;

	}

	public boolean VerifyRetention() {
		try {
			WebElement HeaderWebEelement = new WebDriverWait(driver, 100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(Retention_xpath));
			HeaderWebEelement.isDisplayed();

			return true;
		} catch (Exception ex) {

			return false;

		}
	}

	// collateralTypeDropdownValue){
	public boolean VerifyFuture() {
		try {
			Thread.sleep(1000);
			WebElement HeaderWebEelement = new WebDriverWait(driver, 50)
					.until(ExpectedConditions
							.visibilityOfElementLocated(future_xpath));
			HeaderWebEelement.isDisplayed();

			return true;
		} catch (Exception ex) {
			return false;

		}
	}

	// rohit
	public void fileUpload_Mapping() {

		try {
			// Thread.sleep(2000);
			WebElement El = driver.findElement(chooseFile_xpath);
			// scrollIntoView(By.xpath("(//*[contains(@class,'ui-cell')]//*[@class='btn ng-star-inserted'])[1]/../input"));
			((RemoteWebElement) El).setFileDetector(new LocalFileDetector());
			El.sendKeys("D:\\cyncautomation\\Cync_Automation_Project\\FileUpload\\SummaryArAblOne.xlsx");
			Thread.sleep(1000);
		} catch (Exception e) {
		
			e.printStackTrace();
		}
	}

	// rohit
	public void fileUPload_Mapping1() {

		try {
			Thread.sleep(2000);
			WebElement El = driver.findElement(chooseFile_xpath);
			// scrollIntoView(By.xpath("(//*[contains(@class,'ui-cell')]//*[@class='btn ng-star-inserted'])[1]/../input"));
			((RemoteWebElement) El).setFileDetector(new LocalFileDetector());
			El.sendKeys("D:\\Cync_Project_Automation\\cyncautomation\\Cync_Automation_Project\\FileUpload\\summary_file.xlsx");
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


	public boolean  fileUPload_mapping(){
			try {	
			StringSelection ss = new StringSelection("D:\\Cync_Project_Automation\\cyncautomation\\Cync_Automation_Project\\FileUpload\\summary_file.xlsx");
			
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);

			Thread.sleep(1000);

			return true;
		} catch (Exception e) {
		
		}
		return false;
	}

	public boolean VerifyCurrent() {
		try {
			WebElement HeaderWebEelement = new WebDriverWait(driver, 100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(current_xpath));
			HeaderWebEelement.isDisplayed();

			return true;
		}

		catch (Exception ex) {
			return false;

		}

	}

	public boolean VerifyOver30() {
		try {
			WebElement HeaderWebEelement = new WebDriverWait(driver, 100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(over30_xpath));
			HeaderWebEelement.isDisplayed();

			return true;
		} catch (Exception ex) {
			return false;

		}

	}

	public boolean VerifyOver60() {
		try {
			WebElement HeaderWebEelement = new WebDriverWait(driver, 100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(over60_xpath));
			HeaderWebEelement.isDisplayed();

			return true;
		} catch (Exception ex) {
			return false;

		}

	}

	public boolean VerifyOver90() {
		try {
			WebElement HeaderWebEelement = new WebDriverWait(driver, 100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(over90_xpath));
			HeaderWebEelement.isDisplayed();
			return true;
		} catch (Exception ex) {
			return false;

		}

	}

	public boolean VerifyOver120() {
		try {
			WebElement HeaderWebEelement = new WebDriverWait(driver, 100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(over120_xpath));
			HeaderWebEelement.isDisplayed();

			return true;
		} catch (Exception ex) {
			return false;
		}
	}

	public boolean VerifyBalanceAmount() {
		try {
			WebElement HeaderWebEelement = new WebDriverWait(driver, 100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(balanceAmountDropdownValue_xpath));
			HeaderWebEelement.isDisplayed();
			return true;
		} catch (Exception ex) {
			return false;

		}

	}

	public boolean VerifyCollateralType() {
		try {
			WebElement HeaderWebEelement = new WebDriverWait(driver, 100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(collateralType_xpath));
			HeaderWebEelement.isDisplayed();

			return true;
		} catch (Exception ex) {
			return false;

		}
	}

	public boolean VerifyDateformat() {
		try {
			WebElement HeaderWebEelement = new WebDriverWait(driver, 100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(Dateformat_xpath));
			HeaderWebEelement.isDisplayed();
			return true;
		} catch (Exception ex) {
			return false;

		}

	}

	public boolean Click_on_Accountmolength() {
		try {
			WebElement HeaderWebEelement = new WebDriverWait(driver, 100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(Accountnolength_xpath));
			HeaderWebEelement.click();

			return true;

		} catch (Exception ex) {
			return false;

		}
	}

	public boolean Dateformat(String length) {
		try {

			WebElement collateralNameFieldInputWebEelement = new WebDriverWait(
					driver, 100).until(ExpectedConditions
					.visibilityOfElementLocated(Dateformat_xpath));
			collateralNameFieldInputWebEelement.click();
			collateralNameFieldInputWebEelement.clear();
			collateralNameFieldInputWebEelement.sendKeys(length);

			return true;
		}

		catch (Exception ex) {
			return false;
		}
	}

	public boolean Click_on_PreviousBtn() {
		try {
			WebElement HeaderWebEelement = new WebDriverWait(driver, 100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(Previousbtn_xpath));
			HeaderWebEelement.click();
			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			return true;
		} catch (Exception ex) {
			return false;

		}

	}

	public boolean Click_on_AutoFilemissingcheckbox() {
		try {
			WebElement HeaderWebEelement = new WebDriverWait(driver, 100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(Autofile_xpath));
			HeaderWebEelement.isDisplayed();
			HeaderWebEelement.click();
			return true;
		} catch (Exception ex) {
			return false;

		}

	}

	// Maintain AR single div
	public boolean fileUPload_mappingArDetails() {
		try {
			Thread.sleep(1000);
			StringSelection ss = new StringSelection(
					"D:\\Cync_Project_Automation\\cyncautomation\\Cync_Automation_Project\\FileUpload\\newARAllBuckets.xlsx");

			Toolkit.getDefaultToolkit().getSystemClipboard()
					.setContents(ss, null);

			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(1000);
			return true;
		} catch (Exception ex) {
			return false;

		}
	}

	public boolean Click_on_Delete() {
		try {
			WebElement HeaderWebEelement = new WebDriverWait(driver, 100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(delete_xpath));
			HeaderWebEelement.isDisplayed();
			HeaderWebEelement.click();
			Alert alert = driver.switchTo().alert();
			alert.accept();
			Thread.sleep(400);
			// //Thread.sleep(5000);
			return true;
		} catch (Exception ex) {
			return false;
		}
	}

	public boolean Click_on_ReverseSign() {
		try {
			WebElement HeaderWebEelement = new WebDriverWait(driver, 100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(Reversesign_xpath));
			HeaderWebEelement.isDisplayed();
			HeaderWebEelement.click();
			return true;
		} catch (Exception ex) {
			return false;

		}

	}

	public boolean Nooftrailerrowstb(String length) {
		try {

			WebElement collateralNameFieldInputWebEelement = new WebDriverWait(
					driver, 100).until(ExpectedConditions
					.visibilityOfElementLocated(Nooftrailerrows_xpath));
			collateralNameFieldInputWebEelement.click();
			collateralNameFieldInputWebEelement.clear();
			collateralNameFieldInputWebEelement.sendKeys(length);
			return true;
		} catch (Exception ex) {
			return false;
		}
	}


	public void fileUPload_mappingARInventory() {
			try {	
			StringSelection ss = new StringSelection("D:\\Cync_Project_Automation\\cyncautomation\\Cync_Automation_Project\\FileUpload\\Assetinventorynew.xlsx");
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(1000);	
				
	
		}
		catch(Exception ex){
			
		}

}

	public void fileUPload1_mappingARInventory() {

		String filepath = "D:/Cync_Project_Automation/cyncautomation/Cync_Automation_Project/FileUpload/Assetinventorynew.xlsx";
		fileUpload(chooseFile_xpath, filepath);

	}

	public boolean fileUpload_ineligible2() {
		try {

			StringSelection ss = new StringSelection(
					"D:\\GITWorkSpace\\cyncautomation\\Cync_Automation_Project\\FileUpload\\ARSummary-Ineligible1.xlsx");
            Toolkit.getDefaultToolkit().getSystemClipboard()
					.setContents(ss, null);

			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);

			return true;
		} catch (Exception e) {

			return false;
		}
	}

	public boolean fileUpload_ineligible2_4462() {
		try {

			StringSelection ss = new StringSelection(
					"D:\\GITWorkSpace\\cyncautomation\\Cync_Automation_Project\\FileUpload\\Inventoryfile_4462.xlsx");
			Toolkit.getDefaultToolkit().getSystemClipboard()
					.setContents(ss, null);

			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);

			// //Thread.sleep(3000);
			return true;
		} catch (Exception e) {

			return false;
		}
	}

	public boolean fileUpload_ineligible3() {
		try {

			StringSelection ss = new StringSelection(
					"D:\\GITWorkSpace\\cyncautomation\\Cync_Automation_Project\\FileUpload\\4624inelig2.xlsx");

		
			Toolkit.getDefaultToolkit().getSystemClipboard()
					.setContents(ss, null);

			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);

			// //Thread.sleep(3000);
			return true;
		} catch (Exception e) {

			return false;
		}
	}

	public boolean Discardrowcolumntb(String length) {
		try {

			WebElement collateralNameFieldInputWebEelement = new WebDriverWait(
					driver, 100).until(ExpectedConditions
					.visibilityOfElementLocated(DiscardRow_xpath));
			collateralNameFieldInputWebEelement.clear();
			collateralNameFieldInputWebEelement.sendKeys(length);
			// ////Thread.sleep(2000);
			return true;
		} catch (Exception ex) {
			return false;
		}
	}

	public Boolean VerifyDiscardrows() {
		try {
			WebElement HeaderWebEelement = new WebDriverWait(driver, 100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(DiscardValueText_xpath));
			HeaderWebEelement.isDisplayed();
			// ////Thread.sleep(5000);
			return true;
		} catch (Exception ex) {
			return false;
		}
	}

	public Boolean VerifyDelimiterCharacter() {
		try {
			WebElement HeaderWebEelement = new WebDriverWait(driver, 100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(Delimiter_xpath));
			HeaderWebEelement.isDisplayed();
		} catch (Exception ex) {
			return false;
		}
		return true;
	}

	public Boolean VerifyDiscardColumn() {
		try {
			WebElement HeaderWebEelement = new WebDriverWait(driver, 100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(Discardvaluecolumn_xpath));
			HeaderWebEelement.isDisplayed();
			// ////Thread.sleep(5000);
			return true;
		} catch (Exception ex) {
			return false;
		}
	}

	public boolean Click_on_Considerrowtextbox() {
		try {
			WebElement HeaderWebEelement = new WebDriverWait(driver, 100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(Considerrowtb_xpath));
			HeaderWebEelement.click();

			return true;
		} catch (Exception ex) {
			return false;

		}
	}

	public Boolean VerifyPreviousButton() {
		try {
			WebElement HeaderWebEelement = new WebDriverWait(driver, 100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(Previousbtn_xpath));
			HeaderWebEelement.isDisplayed();

			return true;
		} catch (Exception ex) {
		}
		return false;
	}


	public boolean balanceAmountDropdownValues(String balanceAmountDropdownValue) {
		try {
			WebElement productTypeDropdownWebEelement = new WebDriverWait(
					driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(balanceAmountDropdownValue_xpath));
			Select sel = new Select(productTypeDropdownWebEelement);
			List<WebElement> list = sel.getOptions();
			for (WebElement ele : list) {
				if (ele.getText().equals(balanceAmountDropdownValue)) {
					Actions action = new Actions(driver);
					action.doubleClick(ele).build().perform();

					return true;
				}
			}
		} catch (Exception ex) {
		}
		return false;
	}

	public String verifyMessageOnMappingSave(String messageOnMapping) {
		try {

			WebElement SaveOnAddSalesWebEelement = new WebDriverWait(driver,
					200).until(ExpectedConditions
					.visibilityOfElementLocated(sucessMessageForMapping_xpath));

			String actualMsgFromAPP = SaveOnAddSalesWebEelement.getText();
			this.isAlertPresent();
			if (actualMsgFromAPP.equalsIgnoreCase(messageOnMapping))
				;

			{
				return actualMsgFromAPP;
			}

		} catch (Exception ex) {

		}
		return messageOnMapping;
	}

	 public Boolean VerifySelectValueColumn()
		{
		try{
			WebElement HeaderWebEelement=new WebDriverWait(driver,100)
				.until(ExpectedConditions.visibilityOfElementLocated(Selectbyvaluetb_xpath));
			HeaderWebEelement.isDisplayed();
			return true;
		}
		catch(Exception ex){
			
		
		return false;
		}
		}

	public boolean dataFileTypedropdownValues(String dataFileTypeDropdownValue) {
		try {
			WebElement productTypeDropdownWebEelement = new WebDriverWait(
					driver, 10).until(ExpectedConditions
					.visibilityOfElementLocated(dataFileType_xpath));
			Select sel = new Select(productTypeDropdownWebEelement);
			List<WebElement> list = sel.getOptions();
			for (WebElement ele : list) {
				if (ele.getText().equals(dataFileTypeDropdownValue)) {
					ele.click();

					Thread.sleep(1000);

					return true;
				}
			}
		} catch (Exception ex) {
		}
		return false;
	}

	public boolean futuredropdownValues(String futureDropdownValue) {
		try {
			WebElement productTypeDropdownWebEelement = new WebDriverWait(
					driver, 10).until(ExpectedConditions
					.visibilityOfElementLocated(future_xpath));
			Select sel = new Select(productTypeDropdownWebEelement);
			List<WebElement> list = sel.getOptions();
			for (WebElement ele : list) {
				if (ele.getText().equals(futureDropdownValue)) {
					Actions action = new Actions(driver);
					action.doubleClick(ele).build().perform();

					return true;
				}
			}
		} catch (Exception ex) {
		}
		return false;
	}

	public boolean currentdropdownValues(String currentDropdownValue) {
		try {
			WebElement productTypeDropdownWebEelement = new WebDriverWait(
					driver, 10).until(ExpectedConditions
					.visibilityOfElementLocated(current_xpath));
			Select sel = new Select(productTypeDropdownWebEelement);

			List<WebElement> list = sel.getOptions();
			for (WebElement ele : list) {
				if (ele.getText().equals(currentDropdownValue)) {
					Actions action = new Actions(driver);
					action.doubleClick(ele).build().perform();

					return true;
				}
			}
		} catch (Exception ex) {
		}
		return false;
	}


	public boolean over30dropdownValues(String over30DropdownValue) {
		try {
			WebElement productTypeDropdownWebEelement = new WebDriverWait(
					driver, 10).until(ExpectedConditions
					.visibilityOfElementLocated(over30_xpath));
			Select sel = new Select(productTypeDropdownWebEelement);
			List<WebElement> list = sel.getOptions();
			for (WebElement ele : list) {
				if (ele.getText().equals(over30DropdownValue)) {
					Actions action = new Actions(driver);
					action.doubleClick(ele).build().perform();

					return true;
				}
			}
		} catch (Exception ex) {
		}
		return false;
	}
	 

	 //Mukesh
	 public boolean currentAmountdropdown(String data) {

         try {

             WebElement element = new WebDriverWait( driver, 10).until(ExpectedConditions
                     .visibilityOfElementLocated(CurrentAmount_xpath));

             element.click();

             Select sel = new Select(element);

             /*sel.ByVisibleText(accountNameDropdownValue);*/

             List<WebElement> list = sel.getOptions();

             for (WebElement ele : list) {

                 String actual=ele.getText();

                 if (actual.equals(data))

                     sel.selectByVisibleText(actual);                   
             }

         } catch (Exception ex) {

         }

         return true;
	 }
	 
	 //Mukesh 
	 public boolean retentionDropdown(String data)
	 {
		 try{
		 WebElement element = new WebDriverWait(driver,10).until(ExpectedConditions.
		                        		 visibilityOfElementLocated(RetentionDropdown_xpath));
		 element.click();
		 Select sel = new Select(element);
		 List<WebElement> list = sel.getOptions();
		 for(WebElement ele : list)
		 {
			 String actual = ele.getText();
			 if(actual.equals(data))
				 sel.selectByVisibleText(actual);
		 }
	 }
	 catch(Exception ex)
	 {
	 }
	 return true;
    }
	

	 
	 //Mukesh
	 public boolean matchCurrentAmountDropdownClick()
	 {
		 try{
			 String[] str = {"Account","Name","Invoice","Inv Date","Amount","Retention"};
			 
			 WebElement dropdown = driver.findElement(CurrentAmount_xpath);
			 
			 dropdown.click();
			 
			 Select sel = new Select(dropdown);
			 
			 List<WebElement> options = sel.getOptions();
			 
			 for(WebElement we:options)
			 {
				 boolean match = false;
				 for(int i=0; i<str.length;i++)
				 {
					 if(we.getText().equals(str[i]))
					 {
						 match = true;
						 System.out.println(we.getText());
					 }
				 }
				 Assert.assertTrue(match);
			 }
		 }
			 catch(Exception e)
			 {
				 return false;
			 }
		 return true;
		 }
	 
	 //Mukesh
	 public boolean matchRetentionDropdownClick()
	 {
		 try{
			 String[] str = {"Account","Name","Invoice","Inv Date","Amount","Retention"};
			 
			 WebElement dropdown = driver.findElement(RetentionDropdown_xpath);
			 
			 dropdown.click();
			 
			 Select sel = new Select(dropdown);
			 
			 List<WebElement> options = sel.getOptions();
			 
			 for(WebElement we:options)
			 {
				 boolean match = false;
				 for(int i=0; i<str.length;i++)
				 {
					 if(we.getText().equals(str[i]))
					 {
						 match = true;
						 System.out.println(we.getText());
					 }
				 }
				 Assert.assertTrue(match);
			 }
		 }
			 catch(Exception e)
			 {
				 return false;
			 }
		 return true;
		 }
	 //Mukesh
	 public boolean retentionDropdownValues(String retentionDropdownValue)
	 {
		 try{
			 WebElement prductTypeDropdownWebElement = new WebDriverWait(driver,100)
			                         .until(ExpectedConditions.visibilityOfElementLocated(Retention_xpath));
			 Select sel = new Select(prductTypeDropdownWebElement);
			 
			 List<WebElement> list = sel.getOptions();
			 for(WebElement ele : list)
			 {
				 if(ele.getText().equals(retentionDropdownValue));
				 {
					 Actions act = new Actions(driver);
					 act.click(ele);
					 Thread.sleep(1000);
					 return true;
				 }
			 }
		 }
		 catch(Exception ex){ 
		 }
		 return false;
	 }
		
	
	public boolean over90dropdownValues(String over90DropdownValue) {
		try {
			WebElement productTypeDropdownWebEelement = new WebDriverWait(
					driver, 10).until(ExpectedConditions
					.visibilityOfElementLocated(over90_xpath));
			Select sel = new Select(productTypeDropdownWebEelement);
			List<WebElement> list = sel.getOptions();
			for (WebElement ele : list) {
				if (ele.getText().equals(over90DropdownValue)) {
				    Actions action = new Actions(driver);
					action.doubleClick(ele).build().perform();
				
					 return true;
				}
			}
		} catch (Exception ex) {
		}
		return false;
	}
	public boolean over120dropdownValues(String over120DropdownValue) {
		try {
			WebElement productTypeDropdownWebEelement = new WebDriverWait(
					driver, 10).until(ExpectedConditions
					.visibilityOfElementLocated(over120_xpath));
			Select sel = new Select(productTypeDropdownWebEelement);
			List<WebElement> list = sel.getOptions();
			for (WebElement ele : list) {
				if (ele.getText().equals(over120DropdownValue)) {
					Actions action = new Actions(driver);
					action.doubleClick(ele).build().perform();			
					}
				}
				 return true;
			} catch (Exception ex) 
		{
			}
		return false;
	}

	/*
	public void fileUPload_mappingArDetails_forMultipleDivision() {

		String filepath = "D:\\cyncautomation\\Cync_Automation_Project\\FileUpload\\newARAllBuckets.xlsx";
		fileUpload(chooseFile_xpath, filepath);

		/*
		 * try {
		 * 
		 * 
		 * 
		 * 
		 * StringSelection ss = new StringSelection(
		 * "D:\\cyncautomation\\Cync_Automation_Project\\FileUpload\\newARAllBuckets.xlsx"
		 * ); //StringSelection ss = new StringSelection(
		 * "D:\\AutomationCI\\Cync_Automation_Project\\src\\test\resources\\cynclogo_fin.png"
		 * );
		 * 
		 * Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss,
		 * null);
		 * 
		 * Robot robot = new Robot(); robot.keyPress(KeyEvent.VK_CONTROL);
		 * robot.keyPress(KeyEvent.VK_V); robot.keyRelease(KeyEvent.VK_V);
		 * robot.keyRelease(KeyEvent.VK_CONTROL);
		 * robot.keyPress(KeyEvent.VK_ENTER);
		 * robot.keyRelease(KeyEvent.VK_ENTER);
		 * 
		 * Thread.sleep(3000); return true; } catch (Exception e) {  } return false;
		 * }
		 */

	public void fileUPloadMappingForReceivables1Div11() {
		String filepath = "D:/Cync_Project_Automation/cyncautomation/Cync_Automation_Project/FileUpload/newARAllBuckets1Div1.xlsx";
		fileUpload(chooseFile_xpath, filepath);
	}

	public void fileUPloadMappingForReceivables1Div1() {
		String filepath = "D:/Cync_Project_Automation/cyncautomation/Cync_Automation_Project/FileUpload/newARAllBuckets1Div1.xlsx";
		fileUpload(chooseFile_xpath, filepath);

	}

	public Boolean VerifyNooftrailerrows() {
		try {
			WebElement HeaderWebEelement = new WebDriverWait(driver, 100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(Nooftrailerrows_xpath));
			HeaderWebEelement.isDisplayed();
			// //Thread.sleep(5000);
			return true;
		} catch (Exception e) {
		}
		return false;
		}
public Boolean VerifySelectValueText()
{
try{
	WebElement HeaderWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(Selectbytexttb_xpath));
	HeaderWebEelement.isDisplayed();
	//////Thread.sleep(5000);
	return true;
}
catch(Exception ex){
	

		}
		return false;

	}

	// rohit
	public void fileUPloadMappingForReceivables21() {
		String filepath = "D:/Cync_Project_Automation/cyncautomation/Cync_Automation_Project/FileUpload/newARAllBuckets2.xlsx";
		fileUpload(chooseFile_xpath, filepath);
	}
public Boolean VerifyDiscardText()
{
try{
	WebElement HeaderWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(DiscardValueText_xpath));
	HeaderWebEelement.isDisplayed();
	//////Thread.sleep(5000);
	return true;
}
catch(Exception ex){
return false;
}
}
	public void fileUPloadMappingForReceivables2() {

		String filepath = "D:/Cync_Project_Automation/cyncautomation/Cync_Automation_Project/FileUpload/newARAllBuckets2.xlsx";
		fileUpload(chooseFile_xpath, filepath);
				}
			
		
	public boolean over60dropdownValues(String over60DropdownValue) {
		try {
			WebElement productTypeDropdownWebEelement = new WebDriverWait(
					driver, 10).until(ExpectedConditions
					.visibilityOfElementLocated(over60_xpath));
			Select sel = new Select(productTypeDropdownWebEelement);
			List<WebElement> list = sel.getOptions();
			for (WebElement ele : list) {
				if (ele.getText().equals(over60DropdownValue)) {
					Actions action = new Actions(driver);
					action.doubleClick(ele).build().perform();

					return true;
				}
			}
		} catch (Exception ex) {
		}
		return false;
	}
	


	// Summary_Inventory
	public boolean fileUPload_mappingInventory() {
		try {
			StringSelection ss = new StringSelection(
					"D:\\Cync_Project_Automation\\cyncautomation\\Cync_Automation_Project\\FileUpload\\Inventory.xlsx");
			Toolkit.getDefaultToolkit().getSystemClipboard()
					.setContents(ss, null);
			
			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(1000);
			return true;
		} catch (Exception e) {

		}
		return false;

	}

	//rohit
	public void fileUPload_mappingInventory1() {
				String filepath = "D:\\Cync_Project_Automation\\cyncautomation\\Cync_Automation_Project\\FileUpload\\Inventory.xlsx";
			fileUpload(chooseFile_xpath, filepath);

	}

	// rohit
	
	public void fileUPload1_mappingInventory() {

		String filepath = "D:\\cyncautomation\\Cync_Automation_Project\\FileUpload\\Assetinventorynew.xlsx";
		fileUpload(chooseFile_xpath, filepath);

	}
	
	public void fileUPload1_mappingARInventory2() {

		String filepath = "D:/Cync_Project_Automation/cyncautomation/Cync_Automation_Project/FileUpload/Assetinventorynew2.xlsx";
		fileUpload(chooseFile_xpath, filepath);

	}

	// rohit
	public void fileUPload_mappingARInventory2() {
		
		String filepath = "D:/Cync_Project_Automation/cyncautomation/Cync_Automation_Project/FileUpload/Assetinventorynew2.xlsx";
		fileUpload(chooseFile_xpath, filepath);

		/*
		 * try { StringSelection ss = new
		 * StringSelection(
		 * "D:\\GIT WorkspaceNew\\cyncautomation\\Cync_Automation_Project\\FileUpload\\Assetinventorynew2.xlsx"
		 * );
		 * 
		 * 
		 * Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss,
		 * null);
		 * 
		 * Robot robot = new Robot(); robot.keyPress(KeyEvent.VK_CONTROL);
		 * robot.keyPress(KeyEvent.VK_V); robot.keyRelease(KeyEvent.VK_V);
		 * robot.keyRelease(KeyEvent.VK_CONTROL);
		 * robot.keyPress(KeyEvent.VK_ENTER);
		 * robot.keyRelease(KeyEvent.VK_ENTER); return true; } catch (Exception
		 * e) {} return false;
		 */
	}

	public boolean assetNameSelection(String assetName) {

		try {

			WebElement assetNameWebElement = new WebDriverWait(driver, 100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(assetNameStep3_xpath));
			Select sel = new Select(assetNameWebElement);
			List<WebElement> list = sel.getOptions();

			for (WebElement ele : list) {

				if (ele.getText().equals(assetName)) {
					ele.click();
					break;
				}
			}
			return true;
		} catch (Exception e) {

		}

		return false;
	}

	public boolean assetValueSelection(String assetValue) {

		try {
			WebElement assetValueWebElement = new WebDriverWait(driver, 100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(assetValueStep3_xpath));
			Select sel = new Select(assetValueWebElement);
			List<WebElement> list = sel.getOptions();

			for (WebElement ele : list) {

				if (ele.getText().equals(assetValue)) {
					ele.click();

					break;
				}
			}
			return true;
		} catch (Exception e) {

		}

		return false;
	}

	public boolean locationSelection(String locationToSelect) {

		try {

			WebElement locationWebElement = new WebDriverWait(driver, 100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(locationStep3_xpath));
			Select sel = new Select(locationWebElement);
			List<WebElement> list = sel.getOptions();

			for (WebElement ele : list) {

				if (ele.getText().equals(locationToSelect)) {
					ele.click();
					break;
				}
			}
			return true;
		} catch (Exception e) {

		}

		return false;
	}

	public boolean assetNumberSelection(String assetNo) {

		try {
			WebElement assetNoWebElement = new WebDriverWait(driver, 100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(assetNumberStep3_xpath));
			Select sel = new Select(assetNoWebElement);
			List<WebElement> list = sel.getOptions();

			for (WebElement ele : list) {

				if (ele.getText().equals(assetNo)) {
					ele.click();

					break;
				}
			}
			return true;
		} catch (Exception e) {

		}

		return false;
	}

	public boolean payableNodropdownValues(String payableNoDropdownValue) {
		try {
			WebElement productTypeDropdownWebEelement = new WebDriverWait(
					driver, 10).until(ExpectedConditions
					.visibilityOfElementLocated(payableNo_xpath));
			Select sel = new Select(productTypeDropdownWebEelement);
			List<WebElement> list = sel.getOptions();
			for (WebElement ele : list) {
				if (ele.getText().equals(payableNoDropdownValue)) {
					ele.click();

					return true;
				}
			}
		} catch (Exception ex) {
		}
		return false;
	}

	public boolean originalDatedropdownValues(String dateDropdownValue) {
		try {
			WebElement productTypeDropdownWebEelement = new WebDriverWait(
					driver, 10).until(ExpectedConditions
					.visibilityOfElementLocated(originalDate_xpath));
			Select sel = new Select(productTypeDropdownWebEelement);
			List<WebElement> list = sel.getOptions();
			for (WebElement ele : list) {
				if (ele.getText().equals(dateDropdownValue)) {
					ele.click();

					return true;
				}
			}
		} catch (Exception ex) {
		}
		return false;
	}

	public void fileUPload1_mappingDetailPayables2() {

		String filepath = "D:/Cync_Project_Automation/cyncautomation/Cync_Automation_Project/FileUpload/APDetails2.xlsx";
		fileUpload(chooseFile_xpath, filepath);
	}

	public void fileUPload_mappingDetailPayables2() {

		String filepath = "D:/Cync_Project_Automation/cyncautomation/Cync_Automation_Project/FileUpload/APDetails2.xlsx";
		fileUpload(chooseFile_xpath, filepath);
	}

	public void fileUPloadMappingForReceivables2DIV21() {

		String filepath = "D:/Cync_Project_Automation/cyncautomation/Cync_Automation_Project/FileUpload/newARAllBuckets3Div2.xlsx";
		fileUpload(chooseFile_xpath, filepath);

	}

	public void fileUPloadMappingForReceivables2DIV2() {

		String filepath = "D:/Cync_Project_Automation/cyncautomation/Cync_Automation_Project/FileUpload/newARAllBuckets3Div2.xlsx";
		fileUpload(chooseFile_xpath, filepath);

	}

	// rohit
	public void fileUPload1_mappingARInventory1DIV1() {

		String filepath = "D:/Cync_Project_Automation/cyncautomation/Cync_Automation_Project/FileUpload/Assetinventorynew1Div1.xlsx";
		fileUpload(chooseFile_xpath, filepath);

	}
	
	
	public boolean fileUPload1_mappingApDetail() {

		String filepath = "D:/Cync_Project_Automation/cyncautomation/Cync_Automation_Project/FileUpload/apdetail052012.xlsx";
		fileUpload(chooseFile_xpath, filepath);
		
		  try { StringSelection ss = new StringSelection(
		  "D:/Cync_Project_Automation/cyncautomation/Cync_Automation_Project/FileUpload/Assetinventorynew1Div1.xlsx"
		 ); 
		  
		  Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss,
		  null);
		 
		 Robot robot = new Robot(); robot.keyPress(KeyEvent.VK_CONTROL);
		  robot.keyPress(KeyEvent.VK_V); robot.keyRelease(KeyEvent.VK_V);
		  robot.keyRelease(KeyEvent.VK_CONTROL);
		  robot.keyPress(KeyEvent.VK_ENTER);
		  robot.keyRelease(KeyEvent.VK_ENTER);
		  
		  return true; 
		  }
		  catch (Exception e) {
		 return false;
		  }
		 
	}

	public boolean fileUPload_mappingApDetail() {
		try {

			StringSelection ss = new StringSelection(
					"D:/Cync_Project_Automation/cyncautomation/Cync_Automation_Project/FileUpload/apdetail052012.xlsx");

			Toolkit.getDefaultToolkit().getSystemClipboard()
					.setContents(ss, null);
			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(1000);
			return true;
		} catch (Exception e) {
		}
		return false;

	}


	public boolean  fileUPload_mappingApsummary(){
		try {	

		StringSelection ss = new StringSelection("D:\\Cync_Project_Automation\\cyncautomation\\Cync_Automation_Project\\FileUpload\\apsumarypayble.xlsx");

		
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);

		return true;
	} catch (Exception e) {
		// TODO: handle exception
	}
	return false;
	
}
public boolean  fileUPload_mappingARInventory1DIV1(){
	try {	
	StringSelection ss = new StringSelection("D:\\Cync_Project_Automation\\cyncautomation\\Cync_Automation_Project\\FileUpload\\Assetinventorynew1Div1.xlsx");

			Toolkit.getDefaultToolkit().getSystemClipboard()
					.setContents(ss, null);

			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(1000);
			return true;
		} catch (Exception e) {
		}
		return false;

	}

	// rohit
	public void fileUPload1_mappingApsummary() {
		String filepath = "D:\\Cync_Project_Automation\\cyncautomation\\Cync_Automation_Project\\FileUpload\\apsumarypayble.xlsx";
		fileUpload(chooseFile_xpath, filepath);

	}


	// rohit
	public void fileUPload1_mappingARInventory2DIV2() {

		String filepath = "D:/Cync_Project_Automation/cyncautomation/Cync_Automation_Project/FileUpload/Assetinventorynew3Div2.xlsx";
		fileUpload(chooseFile_xpath, filepath);

	}

	public void fileUPload_mappingARInventory2DIV2() {

		String filepath = "D:/Cync_Project_Automation/cyncautomation/Cync_Automation_Project/FileUpload/Assetinventorynew3Div2.xlsx";
		fileUpload(chooseFile_xpath, filepath);

		/*
		 * try { StringSelection ss = new StringSelection(
		 * "D:/Cync_Project_Automation/cyncautomation/Cync_Automation_Project/FileUpload/Assetinventorynew3Div2.xlsx"
		 * ); 
		 * 
		 * Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss,
		 * null);
		 * 
		 * Robot robot = new Robot(); robot.keyPress(KeyEvent.VK_CONTROL);
		 * robot.keyPress(KeyEvent.VK_V); robot.keyRelease(KeyEvent.VK_V);
		 * robot.keyRelease(KeyEvent.VK_CONTROL);
		 * robot.keyPress(KeyEvent.VK_ENTER);
		 * robot.keyRelease(KeyEvent.VK_ENTER);
		 * 
		 * return true; } catch (Exception e) {
		 * return false;
		 */

	}

	// rohit
	public void fileUPload1_mappingDetailPayables() {

		String filepath = "D:/Cync_Project_Automation/cyncautomation/Cync_Automation_Project/FileUpload/APDetails.xlsx";
		fileUpload(chooseFile_xpath, filepath);
	}

	public void fileUPload_mappingDetailPayables() {

		String filepath = "D:/Cync_Project_Automation/cyncautomation/Cync_Automation_Project/FileUpload/APDetails.xlsx";
		fileUpload(chooseFile_xpath, filepath);

		/*
		 * try { StringSelection ss = new StringSelection(
		 * "D:/Cync_Project_Automation/cyncautomation/Cync_Automation_Project/FileUpload/APDetails.xlsx"
		 * );
		 * Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss,
		 * null); Robot robot = new Robot();
		 * robot.keyPress(KeyEvent.VK_CONTROL); robot.keyPress(KeyEvent.VK_V);
		 * robot.keyRelease(KeyEvent.VK_V);
		 * robot.keyRelease(KeyEvent.VK_CONTROL);
		 * robot.keyPress(KeyEvent.VK_ENTER);
		 * robot.keyRelease(KeyEvent.VK_ENTER); return true; } catch (Exception
		 * e) { 
		 */

	}

	// rohit
	public void fileUPload1_mappingDetailPayables1DIV1() {

		String filepath = "D:/Cync_Project_Automation/cyncautomation/Cync_Automation_Project/FileUpload/APDetails1Div1.xlsx";
		fileUpload(chooseFile_xpath, filepath);
	}
	public void fileUPload_mappingDetailPayables1DIV1() {

		String filepath = "D:/Cync_Project_Automation/cyncautomation/Cync_Automation_Project/FileUpload/APDetails1Div1.xlsx";
		fileUpload(chooseFile_xpath, filepath);

		/*
		 * try { StringSelection ss = new StringSelection(
		 * "D:/Cync_Automation_Project/cyncautomation/Cync_Automation_Project/FileUpload/APDetails1Div1.xlsx"
		 * );		 * 
		 * "D:/Cync_Project_Automation/cyncautomation/Cync_Automation_Project/FileUpload/APDetails1Div1.xlsx"
		 * ); 
		 * Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss,
		 * null);
		 * Robot robot = new Robot(); robot.keyPress(KeyEvent.VK_CONTROL);
		 * robot.keyPress(KeyEvent.VK_V); robot.keyRelease(KeyEvent.VK_V);
		 * robot.keyRelease(KeyEvent.VK_CONTROL);
		 * robot.keyPress(KeyEvent.VK_ENTER);
		 * robot.keyRelease(KeyEvent.VK_ENTER);
		 * return true; } catch (Exception e) { 
		 * return false;
		 */

	}

	// rohit
	public void fileUPload1_mappingDetailPayables2DIV2() {

		String filepath = "D:/Cync_Project_Automation/cyncautomation/Cync_Automation_Project/FileUpload/APDetails3Div2.xlsx";
		fileUpload(chooseFile_xpath, filepath);

	}

	public void fileUPload_mappingDetailPayables2DIV2() {

		String filepath = "D:/Cync_Project_Automation/cyncautomation/Cync_Automation_Project/FileUpload/APDetails3Div2.xlsx";
		fileUpload(chooseFile_xpath, filepath);

		/*
		 * try { StringSelection ss = new StringSelection(
		 * "D:/Cync_Project_Automation/cyncautomation/Cync_Automation_Project/FileUpload/APDetails3Div2.xlsx"
		 * );
		 * 
		 * >>>>>>> Stashed changes
		 * Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss,
		 * null); Robot robot = new Robot();
		 * robot.keyPress(KeyEvent.VK_CONTROL); robot.keyPress(KeyEvent.VK_V);
		 * robot.keyRelease(KeyEvent.VK_V);
		 * robot.keyRelease(KeyEvent.VK_CONTROL);
		 * robot.keyPress(KeyEvent.VK_ENTER);
		 * robot.keyRelease(KeyEvent.VK_ENTER);
		 * 
		 * return true; } catch (Exception e) {
		 * return false;
		 */

	}

	// anusha

	public boolean fileUPloadForSummaryYesMultipleDivision() {
		try {

			StringSelection ss = new StringSelection(
					"D:/Cync_Project_Automation/cyncautomation/Cync_Automation_Project/FileUpload/newARSummary1.xlsx");

			Toolkit.getDefaultToolkit().getSystemClipboard()
					.setContents(ss, null);

			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(3000);
			return true;
		} catch (Exception e) {

		}
		return false;

	}

	public boolean fileUPloadForSummaryYesMultipleDivisionReceivables1Div1() {
		try {
			StringSelection ss = new StringSelection(
					"D:/Cync_Project_Automation/cyncautomation/Cync_Automation_Project/FileUpload/newARSummary1Div1.xlsx");

			Toolkit.getDefaultToolkit().getSystemClipboard()
					.setContents(ss, null);

			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);

			Thread.sleep(3000);
			return true;
		} catch (Exception e) {

		}
		return false;

	}

	public boolean fileUPloadForSummaryYesMultipleDivisionReceivables2() {
		try {
			StringSelection ss = new StringSelection(
					"D:/Cync_Project_Automation/cyncautomation/Cync_Automation_Project/FileUpload/newARSummary2.xlsx");
			Toolkit.getDefaultToolkit().getSystemClipboard()
					.setContents(ss, null);

			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);

			Thread.sleep(3000);

			return true;
		} catch (Exception e) {

		}
		return false;

	}

	public boolean fileUPloadForSummaryYesMultipleDivisionReceivables2DIV2() {
		try {
			StringSelection ss = new StringSelection(
					"D:/Cync_Project_Automation/cyncautomation/Cync_Automation_Project/FileUpload/newARSummary2Div2.xlsx");

			Toolkit.getDefaultToolkit().getSystemClipboard()
					.setContents(ss, null);

			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);

			Thread.sleep(3000);
			return true;
		} catch (Exception e) {

		}
		return false;

	}

	public boolean fileUPloadForSummaryYesMulDivPayables1() {
		try {
            	StringSelection ss = new StringSelection(
					"D:/Cync_Project_Automation/cyncautomation/Cync_Automation_Project/FileUpload/APSummary.xlsx");
			Toolkit.getDefaultToolkit().getSystemClipboard()
					.setContents(ss, null);

			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);

			Thread.sleep(3000);
			return true;
		} catch (Exception e) {

		}
		return false;

	}

	public boolean fileUPloadForSummaryYesMulDivPayables1DIV1() {
		try {
          	StringSelection ss = new StringSelection(
					"D:/Cync_Project_Automation/cyncautomation/Cync_Automation_Project/FileUpload/APSummary1DIV1.xlsx");
         	Toolkit.getDefaultToolkit().getSystemClipboard();
			// StringSelection ss = new
			// StringSelection("D:\\Workspace\\cyncautomation\\cyncautomation\\Cync_Automation_Project\\FileUpload\\APSummary1DIV1.xlsx");

		//	StringSelection ss = new StringSelection("D:\\Automation\\Automation_28_May\\cyncautomation\\Cync_Automation_Project\\FileUpload\\APSummary.xlsx");
			// StringSelection ss = new
			// StringSelection("D:\\AutomationCI\\Cync_Automation_Project\\src\\test\resources\\cynclogo_fin.png");

			Toolkit.getDefaultToolkit().getSystemClipboard()
					.setContents(ss, null);

			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);

			Thread.sleep(3000);

			return true;
		} catch (Exception e) {

		}
		return false;

	}

	public boolean fileUPloadForSummaryYesMulDivPayables2() {
		try {
            StringSelection ss = new StringSelection(
					"D:/Cync_Project_Automation/cyncautomation/Cync_Automation_Project/FileUpload/APSummary2.xlsx");
         	Toolkit.getDefaultToolkit().getSystemClipboard()
					.setContents(ss, null);

			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);

			Thread.sleep(3000);

			return true;
		} catch (Exception e) {


		}
		return false;

	}

	public boolean fileUPloadForSummaryYesMulDivPayables2DIV2() {
		try {

				StringSelection ss = new StringSelection(
					"D:/Cync_Project_Automation/cyncautomation/Cync_Automation_Project/FileUpload/APSummary2.xlsx");
	       Toolkit.getDefaultToolkit().getSystemClipboard()
					.setContents(ss, null);


			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);

			Thread.sleep(3000);

			return true;
		} catch (Exception e) {

		}
		return false;

	}
//Ashfuq
	public boolean findAndReplaceCheck(){        try{
        WebElement findAndReplaceWebEelement=new WebDriverWait(driver,100)
            .until(ExpectedConditions.visibilityOfElementLocated(findAndRplace_xpath));
        findAndReplaceWebEelement.isDisplayed();
       
        return true;
    }
    catch(Exception ex){
        return false;

    }
	
}
	public boolean findAndReplaceClick(){
        try{
            WebElement findAndReplaceWebEelement=new WebDriverWait(driver,100)
            .until(ExpectedConditions.visibilityOfElementLocated(findAndRplace_xpath));
            findAndReplaceWebEelement.click();
        
            return true;
            }
    catch(Exception ex){
        return false;
            }
        }
	public boolean findAndReplaceFields(){
        try{
            WebElement findAndReplaceCoulmnWebEelement=new WebDriverWait(driver,2)
            .until(ExpectedConditions.visibilityOfElementLocated(FindAndReplaceColumn_xpath));
            findAndReplaceCoulmnWebEelement.isDisplayed();
    
            WebElement FindtextWebEelement=new WebDriverWait(driver,2)
            .until(ExpectedConditions.visibilityOfElementLocated(Findtext_xpath));
            FindtextWebEelement.isDisplayed();
    
            WebElement MatchtextWebEelement=new WebDriverWait(driver,2)
            .until(ExpectedConditions.visibilityOfElementLocated(Matchtext_xpath));
            MatchtextWebEelement.isDisplayed();
    
            WebElement ReplaceWithWebEelement=new WebDriverWait(driver,2)
            .until(ExpectedConditions.visibilityOfElementLocated(ReplaceWith_xpath));
            ReplaceWithWebEelement.isDisplayed();
    
            return true;
            }
        catch(Exception ex){
            return false;
            }
        }
	public boolean findAndReplaceColTB(){
        try{
            WebElement findAndReplaceColTB=new WebDriverWait(driver,10)
            .until(ExpectedConditions.visibilityOfElementLocated(FinAndReplaceColTB_xpath));
            findAndReplaceColTB.isEnabled();
        
            return true;
        }
        catch(Exception ex){
            return false;
            }
        }
	public boolean findTextTB(){
        try{
            WebElement findTextTB=new WebDriverWait(driver,10)
            .until(ExpectedConditions.visibilityOfElementLocated(FindTextTB_xpath));
            findTextTB.isEnabled();
        
            return true;
            }
    catch(Exception ex){
        return false;

            }
        }
	public boolean MatchTextDropdown(){
        try{
            WebElement MatchText=new WebDriverWait(driver,10)
            .until(ExpectedConditions.visibilityOfElementLocated(MatchTextdd_xpath));
            MatchText.isEnabled();
        
            return true;
            }
        catch(Exception ex){
            return false;
            }
        }
	public boolean ReplaceWithTB(){
        try{
        WebElement findTextTB=new WebDriverWait(driver,10)
            .until(ExpectedConditions.visibilityOfElementLocated(ReplaceWithTB_xpath));
        findTextTB.isEnabled();
        
        return true;
            }
        catch(Exception ex){
            return false;
        }
    }
	public boolean PassValuefindAndReplaceColTB(String value){
        try{
            WebElement findAndReplaceColTB=new WebDriverWait(driver,10)
            .until(ExpectedConditions.visibilityOfElementLocated(FinAndReplaceColTB_xpath));
            findAndReplaceColTB.clear();
            findAndReplaceColTB.sendKeys(value);
       
            return true;
        }
    catch(Exception ex){
        return false;
        }
    }
	public Boolean ClickMappingNextBtn()
    {    
        try{
            WebElement HeaderWebEelement=new WebDriverWait(driver,100)
            .until(ExpectedConditions.visibilityOfElementLocated(nextButton_xpath));
            HeaderWebEelement.click();
    //Thread.sleep(5000);
            return true;
        }
        catch(Exception ex){
            return false;
                }
    }
    
public boolean sendReceivables1Div1File() {
	try
	{
		WebElement ChooseFile = new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(chooseFile_xpath));
		ChooseFile.sendKeys("D:\\Cync_Project_Automation\\cyncautomation\\Cync_Automation_Project\\FileUpload\\newARSummary1Div1.xlsx");
		Thread.sleep(1000);
		return true;
	}
	catch(Exception e)
	{
		return false;
	}
}
   
	public boolean verifyerrorMessages2()
    {
        try
        {         
            WebElement textbox=new WebDriverWait(driver,100)
            .until(ExpectedConditions.visibilityOfElementLocated(ErrorMsg2_xpath));       
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
	public boolean passValuefindTextTB(String value1){
        try{
            WebElement findTextTB=new WebDriverWait(driver,10)
            .until(ExpectedConditions.visibilityOfElementLocated(FindTextTB_xpath));
            findTextTB.sendKeys(value1);
        
            return true;
            }
    catch(Exception ex){
        return false;
            }
        }
	public boolean  verifyMatchTextDropDownValues(){
        try {
            String[] exp = {"Partial","Entire"};
           
            WebElement dropdown = driver.findElement(MatchTextdd_xpath);
           
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
	public boolean  fileUPload_Ineligiblesumary(){
        try {    
         Thread.sleep(2000);
        StringSelection ss = new StringSelection("D:\\Automation\\Automation_28_May\\cyncautomation\\Cync_Automation_Project\\FileUpload\\IneligibleSummaryFile.xlsx");
       // StringSelection ss = new StringSelection("D:\\Automation\\cyncautomation\\Cync_Automation_Project\\FileUpload\\IneligibleSummaryFile.xlsx");
        //StringSelection ss = new StringSelection("D:\\AutomationCI\\Cync_Automation_Project\\src\\test\resources\\cynclogo_fin.png");
        
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
        
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        return true;
    } catch (Exception e) {
    return false;
        // TODO: handle exception
    }
 }
	public boolean verifyMatchTextDropDownValues(String matchText){
        try {
           
            WebElement dropdown = driver.findElement(MatchTextdd_xpath);               
            dropdown.click();
           
            Select select = new Select(dropdown);
        
             List<WebElement> options = select.getOptions();
            
             for(WebElement we:options)
             {             
                 String actual=we.getText().toString();
                
                if(actual.equals(matchText)){
                    select.selectByVisibleText(actual);
                }
             }
        } catch (Exception e) {
            // TODO: handle exception
            return false;
        }
        return true;
 }
	public boolean passValuesReplaceWithTB(String ReplaceWithValue){
        try{
        WebElement ReplaceWithTextTB=new WebDriverWait(driver,10)
            .until(ExpectedConditions.visibilityOfElementLocated(ReplaceWithTB_xpath));
        ReplaceWithTextTB.sendKeys(ReplaceWithValue);
        
        return true;
            }
        catch(Exception ex){
            return false;



        }
    }
	public boolean  selectValueFromRetentionDropDown(String retentionValue){
        try {
            



            WebElement dropdown = driver.findElement(Retention_xpath);
            
            dropdown.click();
            
            Select select = new Select(dropdown);
         
             List<WebElement> options = select.getOptions(); 
             
             for(WebElement we:options)  
             {  
                 String actual=we.getText().toString();
                 
               if (actual.equals(retentionValue)){
                           
                   select.selectByVisibleText(retentionValue);    
                           
                       return true;
                  }
              
             }
        } catch (Exception e){    
        return false;
        }
        return true;
    }
	public boolean verifyChanges(String change){
        try{
        WebElement changes=new WebDriverWait(driver,10)
            .until(ExpectedConditions.visibilityOfElementLocated(verifyChanges_xpath));
        String value=changes.getText().trim();
       
        if(value.equalsIgnoreCase(change))
       
           return true;
            }
        catch(Exception ex){
            return false;
        }   
        return true;
    }
	public boolean verifyAccountNumberAndColumnCB()
    {    
        try{
                Thread.sleep(3000);        
            WebElement WebEelement=new WebDriverWait(driver,10)
            .until(ExpectedConditions.visibilityOfElementLocated(AccountNoandNameonSameColumn_xpath));
            WebEelement.isDisplayed();
    //Thread.sleep(5000);
            return true;
        }
        catch(Exception ex){
            return false;
                }
    }
	public boolean SelectAccountNumberAndColumnCB()
    {    
        try{
                Thread.sleep(3000);        
            WebElement WebEelement=new WebDriverWait(driver,10)
            .until(ExpectedConditions.visibilityOfElementLocated(AccountNoandNameonSameColumn_xpath));
            WebEelement.click();
    //Thread.sleep(5000);
            return true;
        }
        catch(Exception ex){
            return false;
                }
    }
	public boolean verifyDelimeterAccNoAndName()
    {    
        try{
                Thread.sleep(3000);        
            WebElement WebEelement=new WebDriverWait(driver,10)
            .until(ExpectedConditions.visibilityOfElementLocated(DelimeterNoAndNameSeperation_xpath));
            WebEelement.isDisplayed();
    ////Thread.sleep(5000);
            return true;
        }
        catch(Exception ex){
            return false;
                }        



    }
    
    public boolean verifyAccountsAndAmountFieldsCB()
    {    
        try{
                Thread.sleep(3000);        
            WebElement WebEelement=new WebDriverWait(driver,10)
            .until(ExpectedConditions.visibilityOfElementLocated(accountsAndAmountFields_xpath));
            WebEelement.isDisplayed();
    ////Thread.sleep(5000);
            return true;
        }
        catch(Exception ex){
            return false;
                }        



    }
    
    
    public boolean verifyAccountNumberAndNameStyle()
    {    
        try{
                Thread.sleep(3000);        
            WebElement We=new WebDriverWait(driver,10)
            .until(ExpectedConditions.visibilityOfElementLocated(accountsAndAmountFields_xpath));
            We.isDisplayed();
    ////Thread.sleep(5000);
            return true;
        }
        catch(Exception ex){
            return false;
                }        
    }
    
    
    public boolean verifyAccountNumberAndNameTB()
    {    
        try{
                Thread.sleep(3000);        
            WebElement We=new WebDriverWait(driver,10)
            .until(ExpectedConditions.visibilityOfElementLocated(accountNumberAndNameDelimeterTB_xpath));
            We.isDisplayed();
    ////Thread.sleep(5000);
            return true;
        }
        catch(Exception ex){
            return false;
                }        



    }
    
    
    public boolean verifyStartsAccountInfoTB()
    {    
        try{
                Thread.sleep(3000);        
            WebElement We=new WebDriverWait(driver,10)
            .until(ExpectedConditions.visibilityOfElementLocated(startsAccountNumberInfoTB_xpath));
            We.isDisplayed();
    ////Thread.sleep(5000);
            return true;
        }
        catch(Exception ex){
            return false;
                }        



    }
    
    
    public boolean verifyEndsAccountInfoTB()
    {    
        try{
                Thread.sleep(3000);        
            WebElement We=new WebDriverWait(driver,10)
            .until(ExpectedConditions.visibilityOfElementLocated(endsAccountNumberInfoTB_xpath));
            We.isDisplayed();
    ////Thread.sleep(5000);
            return true;
        }
        catch(Exception ex){
            return false;
                }        



    }
    
    public boolean verifyAccountsNumberPositionTB()
    {    
        try{
                Thread.sleep(3000);        
            WebElement We=new WebDriverWait(driver,10)
            .until(ExpectedConditions.visibilityOfElementLocated(accountsNumberPosition_xpath));
            We.isDisplayed();
    ////Thread.sleep(5000);
            return true;
        }
        catch(Exception ex){
            return false;
                }        
    }
    public boolean  fileUPload_Ineligiblesumary1(){
        try {  
        	Thread.sleep(1000);
        StringSelection ss = new StringSelection("D:\\Automation\\Automation_28_May\\cyncautomation\\Cync_Automation_Project\\FileUpload\\4510ARdetailfile.xlsx");
       // StringSelection ss = new StringSelection("D:\\Automation\\cyncautomation\\Cync_Automation_Project\\FileUpload\\4510ARdetailfile.xlsx");
        //StringSelection ss = new StringSelection("D:\\AutomationCI\\Cync_Automation_Project\\src\\test\resources\\cynclogo_fin.png");
        
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
        
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        return true;
    } catch (Exception e) {
    return false;
        // TODO: handle exception
    }
 }
    public boolean passValueDiscardvaluecolumn(String length)
    {
    try{



        WebElement collateralNameFieldInputWebEelement=new WebDriverWait(driver,100)
        .until(ExpectedConditions.visibilityOfElementLocated(Discardvaluecolumn_xpath));
        collateralNameFieldInputWebEelement.clear();
        collateralNameFieldInputWebEelement.sendKeys(length);
        //Thread.sleep(2000);
        
return true;
    }
    catch(Exception ex){
        return false;
    }
    }
    public boolean  passValuesClickonConsiderrowtextbox(String value)
    {
    try{
        WebElement HeaderWebEelement=new WebDriverWait(driver,100)
            .until(ExpectedConditions.visibilityOfElementLocated(Considerrowtb_xpath));
        HeaderWebEelement.clear();
        HeaderWebEelement.sendKeys(value);



        return true;
    }
    catch(Exception ex){
        return false;

    }
    }
    public boolean passValueVerifyAccountNumberAndNameTB(String value)
    {    
        try{
                Thread.sleep(3000);        
            WebElement We=new WebDriverWait(driver,10)
            .until(ExpectedConditions.visibilityOfElementLocated(accountNumberAndNameDelimeterTB_xpath));
            We.clear();
            We.sendKeys(value);
    ////Thread.sleep(5000);
            return true;
        }
        catch(Exception ex){
            return false;
                }        
    }
   
    public boolean accountNumberAndNamedropdown(String accountNameDropdownValue) {
        try {
            WebElement Eelement = new WebDriverWait(
                    driver, 10).until(ExpectedConditions
                    .visibilityOfElementLocated(AccountNumberAndName_xpath));
            Select sel = new Select(Eelement);
            /*sel.selectByVisibleText(accountNameDropdownValue);*/
            List<WebElement> list = sel.getOptions();
            for (WebElement ele : list) {
                if (ele.getText().equals(accountNameDropdownValue))
                    ele.click();                   
            }
        } catch (Exception ex) {
        }
        return true;
    }
    public boolean over30dropdown(String value1) {
        try {
            Thread.sleep(2000);
            WebElement element = new WebDriverWait(
                    driver, 10).until(ExpectedConditions
                    .visibilityOfElementLocated(over30_xpath2));
        
            Select sel = new Select(element);
            
            List<WebElement> list = sel.getOptions();
            for (WebElement ele : list) {
                if (ele.getText().equals(value1)) {
                     Actions action = new Actions(driver);
                    action.moveToElement(ele).click().perform();
                    
                         return true;
                }
            }
        } catch (Exception ex) {
            return false;
        }
        return true;
    }



    public boolean over60dropdown(String value2) {
        try {
            Thread.sleep(2000);
            WebElement element = new WebDriverWait(
                    driver, 10).until(ExpectedConditions
                    .visibilityOfElementLocated(over60_xpath2));
            
    
            Select sel = new Select(element);
        
            List<WebElement> list = sel.getOptions();
            
            for (WebElement ele : list) {
                if (ele.getText().equals(value2)) {
                     Actions action = new Actions(driver);
                     action.moveToElement(ele).click().perform();
                    
                         return true;
                }
            }
        } catch (Exception ex) {
            return false;
        }
        return true;
    }
    
    
    public boolean over90dropdown(String value3) {
        try {
            Thread.sleep(2000);
            WebElement element = new WebDriverWait(
                    driver, 10).until(ExpectedConditions
                    .visibilityOfElementLocated(over90_xpath2));
    
            Select sel = new Select(element);
            
            List<WebElement> list = sel.getOptions();
            for (WebElement ele : list) {
                if (ele.getText().equals(value3)) {
                     Actions action = new Actions(driver);
                     action.moveToElement(ele).click().perform();
                    
                         return true;
                }
            }
        } catch (Exception ex) {
            return false;
        }
        return true;
    }




    public boolean over120dropdown(String value4) {
        try {
            Thread.sleep(2000);
            WebElement element = new WebDriverWait(
                    driver, 10).until(ExpectedConditions
                    .visibilityOfElementLocated(over120_xpath2));
        
            Select sel = new Select(element);
            
            List<WebElement> list = sel.getOptions();
            for (WebElement ele : list) {
                if (ele.getText().equals(value4)) {
                     Actions action = new Actions(driver);
                     action.moveToElement(ele).click().perform();
                    
                         return true;
                }
            }
        } catch (Exception ex) {
            return false;
        }
        return true;
    }
    public boolean verifyAccountNumberColumn()
    {    
        try{
//                Thread.sleep(3000);        
            WebElement We=new WebDriverWait(driver,10)
            .until(ExpectedConditions.visibilityOfElementLocated(accountNumberCol_xpath));
            We.isDisplayed();
    ////Thread.sleep(5000);
            return true;
        }
        catch(Exception ex){
            return false;
                }        



    }
    
    public boolean verifyAccountNameColumn()
    {    
        try{
//                Thread.sleep(3000);        
            WebElement We=new WebDriverWait(driver,10)
            .until(ExpectedConditions.visibilityOfElementLocated(accountNameCol_xpath));
            We.isDisplayed();
    ////Thread.sleep(5000);
            return true;
        }
        catch(Exception ex){
            return false;
                }        



    }
    
    public boolean clickOnSaveBtn(){
        try{
        WebElement saveBtn=new WebDriverWait(driver,10)
            .until(ExpectedConditions.visibilityOfElementLocated(saveBtn_id));
        saveBtn.click();
        
        this.isAlertPresent();
        return true;                        
            }
        catch(Exception ex){
            return false;
        }
    }
    public boolean selectInvoiceDropDown(String data) {
        try {
            WebElement element = new WebDriverWait(
                    driver, 10).until(ExpectedConditions
                    .visibilityOfElementLocated(invoice_dropdown_xpath));
            Select sel = new Select(element);
            /*sel.ByVisibleText(accountNameDropdownValue);*/
            List<WebElement> list = sel.getOptions();
            for (WebElement ele : list) {
                String actual=ele.getText();
                if (actual.equals(data))
                    sel.selectByVisibleText(actual);                   
            }
        } catch (Exception ex) {
        }
        return true;
    }
    public boolean originalDateDropDown(String data) {
        try {
            WebElement element = new WebDriverWait(
                    driver, 10).until(ExpectedConditions
                    .visibilityOfElementLocated(originaldate_dropdown_xpath));
            Select sel = new Select(element);
            /*sel.ByVisibleText(accountNameDropdownValue);*/
            List<WebElement> list = sel.getOptions();
            for (WebElement ele : list) {
                String actual=ele.getText();
                if (actual.equals(data))
                    sel.selectByVisibleText(actual);                   
            }
        } catch (Exception ex) {
        }
        return true;
    }
    public boolean clickOnAccountAndAmountFieldCB(){
        
        try{
            Thread.sleep(3000);
            WebElement clickchooseFileWebEelement=new WebDriverWait(driver,10)
            .until(ExpectedConditions.visibilityOfElementLocated(accountsAndAmount_onSamePath_xpath));
            clickchooseFileWebEelement.click();
            Thread.sleep(5000);
            return true;
        }
        catch(Exception ex){
            return false;
        }
   
        }
      
    public String verifySucessMsg(String verifymessage)
    {   
        try{
                Thread.sleep(3000);       
            WebElement We=new WebDriverWait(driver,10)
            .until(ExpectedConditions.visibilityOfElementLocated(verifyMsg_xpath));
            String actual=We.getText();
                   
                if(actual.equals(verifymessage))
                   //Thread.sleep(5000);
            return actual;
        }
        catch(Exception ex){
            return null;
                }       
        return verifymessage;
    }
   
    public boolean clickchooseFile2(){
        
        try{
            WebElement clickchooseFileWebEelement=new WebDriverWait(driver,10)
            .until(ExpectedConditions.visibilityOfElementLocated(chooseFile_xpath2));
            clickchooseFileWebEelement.isDisplayed();
            clickchooseFileWebEelement.click();
            Thread.sleep(5000);
            return true;
        }
        catch(Exception ex){
            return false;
        }
        }
    public boolean  fileUpload_mapping(){
        try { 
        	Thread.sleep(1000);
            StringSelection ss = new StringSelection("D:\\Automation\\Automation_28_May\\cyncautomation\\Cync_Automation_Project\\FileUpload\\4510ARdetailfile.xlsx");
        //StringSelection ss = new StringSelection("D:\\AutomationCI\\Cync_Automation_Project\\src\\test\resources\\cynclogo_fin.png");
       
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
       
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
       
        Thread.sleep(3000);
        return true;
    } catch (Exception e) {
        // TODO: handle exception
    }
    return true;
   
}
    public boolean clickProcessFile(){
        
        try{
            Thread.sleep(3000);
            WebElement clickchooseFileWebEelement=new WebDriverWait(driver,10)
            .until(ExpectedConditions.visibilityOfElementLocated(ProcessFile_xpath));
            clickchooseFileWebEelement.click();
            
            Thread.sleep(5000);
            return true;
        }
        catch(Exception ex){
            return false;
        }
        }
    public boolean clickOnFileUploadConfirmation()
    {    
        try{  
        	Thread.sleep(500);
            WebElement We=new WebDriverWait(driver,10)
            .until(ExpectedConditions.visibilityOfElementLocated(fileupload_confirmation_xpath));
            We.click();;
            Thread.sleep(500);
            return true;
        }
        catch(Exception ex){
            return false;
                }        
    }
    public boolean navigateToDetailReceivables(){
        
        try{
            Thread.sleep(3000);
            WebElement Eelement=new WebDriverWait(driver,10)
            .until(ExpectedConditions.visibilityOfElementLocated(detail_receivables_page_xpath));
            Eelement.click();
            Thread.sleep(5000);
            return true;
        }
        catch(Exception ex){
            return false;
        }
        }
    public String verifyAccountNumberFieldData(String verifydata)
    {   
        try{
                Thread.sleep(3000);       
            WebElement We=new WebDriverWait(driver,10)
            .until(ExpectedConditions.visibilityOfElementLocated(account_numberField_xpath));
            String actual=We.getText();
                   
                if(actual.equals(verifydata))
                   
                            ////Thread.sleep(5000);
            return actual;
        }
        catch(Exception ex){
            return null;
                }       
        return verifydata;
    }
    public boolean navigateToSummaryReceivablesPage(){
        
        try{
            Thread.sleep(10000);
            WebElement Eelement=new WebDriverWait(driver,10)
            .until(ExpectedConditions.visibilityOfElementLocated(summaryReceivables_Page_xpath));
            Eelement.click();
            Thread.sleep(5000);
            return true;
        }
        catch(Exception ex){
            return false;
        }
   
        }
   
    public String verifyDebtorAccountNameFieldData(String verifydata1)
    {   
        try{
                Thread.sleep(3000);       
            WebElement We=new WebDriverWait(driver,10)
            .until(ExpectedConditions.visibilityOfElementLocated(debtors_AccountNameColumn_xpath));
            String actual=We.getText();
             Thread.sleep(1000);
                if(actual.equals(verifydata1))   
                       
            return actual;
        }
        catch(Exception ex){
            return null;
                }
        return verifydata1;
        }
   
    public String verifyDebtorAccountNumberFieldData(String verifydata)
    {   
        try{
                Thread.sleep(3000);       
            WebElement We=new WebDriverWait(driver,10)
            .until(ExpectedConditions.visibilityOfElementLocated(debtors_AccountNumberColumn_xpath));
            String actual=We.getText();
            Thread.sleep(1000);
                if(actual.equals(verifydata))
                                                   
            return actual;
        }
        catch(Exception ex){
            return null;
                }       
    return verifydata;
    }
	public String verifySummaryReceivablesAccountNumberFieldData(String verifydata1)
	{	
		try{
				Thread.sleep(3000);		
			WebElement We=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(summaryReceivables_AccountNumberColumn_xpath));
			String actual=We.getText();
					
				if(actual.equals(verifydata1))
					
							////Thread.sleep(5000);
			return actual;
		}
		catch(Exception ex){
			return null;
				}		
		return verifydata1;
	}
	



public String verifySummaryReceivablesAccountNameFieldData(String verifydata)
	{	
		try{
				Thread.sleep(3000);		
			WebElement We=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(summaryReceivables_AccountNameColumn_xpath));
			String actual=We.getText();
					
				if(actual.equals(verifydata))
					
							////Thread.sleep(5000);
			return actual;
		}
		catch(Exception ex){
			return null;
				}		
		return verifydata;
	}



public String verifyDetailPayablesAccountNumberFieldData(String verifydata)
	{	
		try{
				Thread.sleep(3000);		
			WebElement We=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(detailPayables_AccountNumberColumn_xpath));
			String actual=We.getText();
					
				if(actual.equals(verifydata))
					
							////Thread.sleep(5000);
			return actual;
		}
		catch(Exception ex){
			return null;
				}		
		return verifydata;
	}



public String verifyDetailPayablesAccountNameFieldData(String verifydata)
	{	
		try{
				Thread.sleep(3000);		
			WebElement We=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(detailPayables_AccountNameColumn_xpath));
			String actual=We.getText();
					
				if(actual.equals(verifydata))
					
							////Thread.sleep(5000);
			return actual;
		}
		catch(Exception ex){
			return null;
				}		
		return verifydata;
	}
	



public boolean  fileUPload_summary(){
		try {	
			Thread.sleep(1000);
		StringSelection ss = new StringSelection("D:\\Automation\\Automation_28_May\\cyncautomation\\Cync_Automation_Project\\FileUpload\\4510summary.xlsx");
		//StringSelection ss = new StringSelection("D:\\Automation\\cyncautomation\\Cync_Automation_Project\\FileUpload\\4510summary.xlsx");
		//StringSelection ss = new StringSelection("D:\\AutomationCI\\Cync_Automation_Project\\src\\test\resources\\cynclogo_fin.png");
		
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		return true;
	} catch (Exception e) {
	return false;
		// TODO: handle exception
	}
 }
 





public String verifySummaryPayablesAccountNumberFieldData(String verifydata)
	{	
		try{
				Thread.sleep(1000);		
			WebElement We=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(summaryPayables_AccountNumberColumn_xpath));
			String actual=We.getText();
					
				if(actual.equals(verifydata))
					
							////Thread.sleep(5000);
			return actual;
		}
		catch(Exception ex){
			return null;
				}		
		return verifydata;
	}


public String verifySummaryPayablesAccountNameFieldData(String verifydata)
	{	
		try{
				Thread.sleep(1000);		
			WebElement We=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(summaryPayables_AccountNameColumn_xpath));
			String actual=We.getText();
					
				if(actual.equals(verifydata))
					
							////Thread.sleep(5000);
			return actual;
		}
		catch(Exception ex){
			return null;
				}		
		return verifydata;
	}



public String verifyVendorsAccountNumberFieldData(String verifydata)
	{	
		try{
//				Thread.sleep(3000);		
			WebElement We=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(vendors_AccountNumberColumn_xpath));
			String actual=We.getText();
					
				if(actual.equals(verifydata))
					
							////Thread.sleep(5000);
			return actual;
		}
		catch(Exception ex){
			return null;
				}		
		return verifydata;
	}
	



	public String verifyVendorsAccountNameFieldData(String verifydata1)
	{	
		try{
//				Thread.sleep(3000);		
			WebElement We=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(vendors_AccountNameColumn_xpath));
			String actual=We.getText();
					
				if(actual.equals(verifydata1))
					
							////Thread.sleep(5000);
			return actual;
		}
		catch(Exception ex){
			return null;
				}		
		return verifydata1;
	}
	


public boolean passValuesStartsAccountInfoTB(String value)
	{	
		try{
				Thread.sleep(1000);		
			WebElement We=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(startsAccountNumberInfoTB_xpath));
			We.sendKeys(value);
		}
		catch(Exception ex){
			return false;
				}		
		return true;
	}
	

public boolean verifyDiscrdValueCB()
	{	
		try{
				Thread.sleep(1000);		
			WebElement We=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(startsAccountNumberInfoTB_xpath));
			We.isDisplayed();
		}
		catch(Exception ex){
			return false;
				}		
		return true;
	}

public boolean selectccountNumberAndNamedropdown(String accountNameDropdownValue) {
		try {
			WebElement Eelement = new WebDriverWait(
					driver, 10).until(ExpectedConditions
					.visibilityOfElementLocated(accounNumberAndNameDelimeter_Dropdown));
			Select sel = new Select(Eelement);
			/*sel.selectByVisibleText(accountNameDropdownValue);*/
			List<WebElement> list = sel.getOptions();
			for (WebElement ele : list) {
				if (ele.getText().equals(accountNameDropdownValue)) {
					ele.click();
				}					
			}
			Thread.sleep(3000);
		} catch (Exception ex) {
		}
		return true;
	}

//Abirami - Changes


public boolean sendReceivablesFile() {
	try
	{
		WebElement ChooseFile = new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(chooseFile_xpath));
		ChooseFile.sendKeys("D:\\Cync_Project_Automation\\cyncautomation\\Cync_Automation_Project\\FileUpload\\APSummary2.xlsx");

		ChooseFile.sendKeys("D:\\Workspace\\cyncautomation\\cyncautomation\\Cync_Automation_Project\\FileUpload\\newARSummary1.xlsx");
		Thread.sleep(1000);
		return true;
	}
	catch(Exception e)
	{
		return false;
	}
}



public boolean sendReceivables2File() {
	try
	{
		WebElement ChooseFile = new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(chooseFile_xpath));
		ChooseFile.sendKeys("D:\\Workspace\\cyncautomation\\cyncautomation\\Cync_Automation_Project\\FileUpload\\newARSummary2.xlsx");
		Thread.sleep(1000);
		return true;
	}
	catch(Exception e)
	{
		return false;
	}
}

public boolean sendReceivables2Div2File() {
	try
	{
		WebElement ChooseFile = new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(chooseFile_xpath));
		ChooseFile.sendKeys("D:\\Workspace\\cyncautomation\\cyncautomation\\Cync_Automation_Project\\FileUpload\\newARSummary2Div2.xlsx");
		Thread.sleep(1000);
		return true;
	}
	catch(Exception e)
	{
		return false;
	}
}

public boolean sendInventoryFile() {
	try
	{
		WebElement ChooseFile = new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(chooseFile_xpath));
		ChooseFile.sendKeys("D:\\Workspace\\cyncautomation\\cyncautomation\\Cync_Automation_Project\\FileUpload\\Assetinventorynew.xlsx");
		Thread.sleep(1000);
		return true;
	}
 catch (Exception ex) {
}
return true;
}

public boolean selectcAccountNumberAndNamedropdown(String DropdownValue) {
		try {
			WebElement Eelement = new WebDriverWait(
					driver, 10).until(ExpectedConditions
					.presenceOfElementLocated(accountNumberAndNameDelimeterDD_xpath));
			Select sel = new Select(Eelement);
			/*sel.selectByVisibleText(accountNameDropdownValue);*/
			List<WebElement> list = sel.getOptions();
			for (WebElement ele : list) {
				String actual=ele.getText();
				if (actual.contains(DropdownValue)) 
					ele.click();					
			}			
			
		} catch (Exception ex) {
		}
		return true;
	}




 public boolean  fileUPload_singleSpace(){
		try {	
			Thread.sleep(1000);
		StringSelection ss = new StringSelection("D:\\Automation\\Automation_28_May\\cyncautomation\\Cync_Automation_Project\\FileUpload\\Example 1 - SINGLE SPACE.xlsx");
		//StringSelection ss = new StringSelection("D:\\Automation\\cyncautomation\\Cync_Automation_Project\\FileUpload\\Example 1 - SINGLE SPACE.xlsx");
		//StringSelection ss = new StringSelection("D:\\AutomationCI\\Cync_Automation_Project\\src\\test\resources\\cynclogo_fin.png");
		
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		return true;
	} catch (Exception e) {
	return false;
		// TODO: handle exception
	}
 }


public boolean discardAccountNumberCB()
	{	
		try{
				Thread.sleep(1000);		
			WebElement We=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(discardAccountNo_xpath));
			We.click();
		}
		catch(Exception ex){
			return false;
				}		
		return true;
	}
	
	
public boolean summaryPayablePage()
	{	
		try{
				Thread.sleep(1000);		
			WebElement We=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(summaryPayablesPage_xpath));
			We.click();
		}
		catch(Exception ex){
			return false;
				}		
		return true;
	}



public boolean selectcBalaceAmountdropdown(String DropdownValue) {
		try {
			WebElement Eelement = new WebDriverWait(
					driver, 10).until(ExpectedConditions
					.visibilityOfElementLocated(balanceAmountDD_xpath));
			Select sel = new Select(Eelement);
			/*sel.selectByVisibleText(accountNameDropdownValue);*/
			List<WebElement> list = sel.getOptions();
			for (WebElement ele : list) {
				if (ele.getText().equals(DropdownValue)) 
					ele.click();					
			}
		} 
		catch (Exception ex) {
			return false;
		}
		return true;
	}


public String verifyAccountNameContent(String verifydata)
	{	
		try{
				Thread.sleep(3000);		
			WebElement We=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(accountNameContent_xpath));
			String actual=We.getText();
			Thread.sleep(1000);
				if(actual.equals(verifydata))
													
			return actual;
		}
		catch(Exception ex){
			return null;
				}		
	return verifydata;
	}




public String verifyAccountNumberContent(String verifydata)
	{	
		try{
				Thread.sleep(3000);		
			WebElement We=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(accountNumberContent_xpath));
			String actual=We.getText();
			Thread.sleep(1000);
				if(actual.equals(verifydata))
													
			return actual;
		}
		catch(Exception ex){
			return null;
				}		
	return verifydata;
	}
public boolean  fileUPload_APSummary(){
    try {    
    	
    StringSelection ss = new StringSelection("D:\\Automation\\Automation_28_May\\cyncautomation\\Cync_Automation_Project\\FileUpload\\AP_4855_Summary.xlsx");
  //  StringSelection ss = new StringSelection("D:\\Automation\\cyncautomation\\Cync_Automation_Project\\FileUpload\\AP_4855_Summary.xlsx");
    //StringSelection ss = new StringSelection("D:\\AutomationCI\\Cync_Automation_Project\\src\\test\resources\\cynclogo_fin.png");
    
    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
    
    Robot robot = new Robot();
    robot.keyPress(KeyEvent.VK_CONTROL);
    robot.keyPress(KeyEvent.VK_V);
    robot.keyRelease(KeyEvent.VK_V);
    robot.keyRelease(KeyEvent.VK_CONTROL);
    robot.keyPress(KeyEvent.VK_ENTER);
    robot.keyRelease(KeyEvent.VK_ENTER);
    return true;
} catch (Exception e) {
return false;
    // TODO: handle exception
}
}
public boolean  fileUPload_ARDetail(){
    try {
    	Thread.sleep(1000);
    StringSelection ss = new StringSelection("D:\\Automation\\Automation_28_May\\cyncautomation\\Cync_Automation_Project\\FileUpload\\ARDetail_4855.xlsx");
    //StringSelection ss = new StringSelection("D:\\Automation\\cyncautomation\\Cync_Automation_Project\\FileUpload\\ARDetail_4855.xlsx");
    //StringSelection ss = new StringSelection("D:\\AutomationCI\\Cync_Automation_Project\\src\\test\resources\\cynclogo_fin.png");
    
    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
    
    Robot robot = new Robot();
    robot.keyPress(KeyEvent.VK_CONTROL);
    robot.keyPress(KeyEvent.VK_V);
    robot.keyRelease(KeyEvent.VK_V);
    robot.keyRelease(KeyEvent.VK_CONTROL);
    robot.keyPress(KeyEvent.VK_ENTER);
    robot.keyRelease(KeyEvent.VK_ENTER);
    return true;
} catch (Exception e) {
return false;
    // TODO: handle exception
}
}
public String verifyDetailReceivablesAccountNameFieldData(String verifydata)
{   
    try{
            Thread.sleep(1000);       
        WebElement We=new WebDriverWait(driver,10)
        .until(ExpectedConditions.visibilityOfElementLocated(detailReceivables_AccountNameColumn_xpath));
        String actual=We.getText();
               
            if(actual.equals(verifydata))
             
        return actual;
    }
    catch(Exception ex){
        return null;
            }       
    return verifydata;
}
public String verifyDetailReceivablesAccountNumberFieldData(String verifydata)
{   
    try{
            Thread.sleep(1000);       
        WebElement We=new WebDriverWait(driver,10)
        .until(ExpectedConditions.visibilityOfElementLocated(detailReceivables_AccountNumberColumn_xpath));
        String actual=We.getText();
               
            if(actual.equals(verifydata))
               
           //Thread.sleep(5000);
        return actual;
    }
    catch(Exception ex){
        return null;
            }       
    return verifydata;
}
public boolean  fileUPload_APDetail(){
    try { 
    	Thread.sleep(1000);
   StringSelection ss = new StringSelection("D:\\Automation\\Automation_28_May\\cyncautomation\\Cync_Automation_Project\\FileUpload\\AP_detail_4855.xlsx");
    //StringSelection ss = new StringSelection("D:\\Automation\\cyncautomation\\Cync_Automation_Project\\FileUpload\\AP_detail_4855.xlsx");
    //StringSelection ss = new StringSelection("D:\\AutomationCI\\Cync_Automation_Project\\src\\test\resources\\cynclogo_fin.png");
    
    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
    
    Robot robot = new Robot();
    robot.keyPress(KeyEvent.VK_CONTROL);
    robot.keyPress(KeyEvent.VK_V);
    robot.keyRelease(KeyEvent.VK_V);
    robot.keyRelease(KeyEvent.VK_CONTROL);
    robot.keyPress(KeyEvent.VK_ENTER);
    robot.keyRelease(KeyEvent.VK_ENTER);
    return true;
} catch (Exception e) {
return false;
  
}
}
//kruthivas
public boolean VerifyFuture2() {
	try {
		Thread.sleep(1000);
		WebElement HeaderWebEelement = new WebDriverWait(driver, 50)
				.until(ExpectedConditions
						.visibilityOfElementLocated(future_xpath2));
		HeaderWebEelement.isDisplayed();

		return true;
	} catch (Exception ex) {
		return false;

	}
}
public boolean collateralNameFieldInput2(String collateralNameFieldData) {
	try {

		WebElement collateralNameFieldInputWebEelement = new WebDriverWait(
				driver, 100).until(ExpectedConditions
				.visibilityOfElementLocated(VerifyMappingNameTB_xpath));
		Thread.sleep(100);
		this.isAlertPresent();
		collateralNameFieldInputWebEelement.clear();

		collateralNameFieldInputWebEelement.sendKeys(collateralNameFieldData);

		return true;
	} catch (Exception ex) {
		return false;
	}
}


//kruthivas
public boolean  verifyMappingGroup(String ARReliance){
	try {
		
		WebElement AmountWebElement = new WebDriverWait(driver, 10).
				until(ExpectedConditions.visibilityOfElementLocated(VerifyMappingGroupName_xpath));
		AmountWebElement.isDisplayed();
		String actual = AmountWebElement.getText().trim();
		if (actual.equals(ARReliance))
			return true;

	} catch (Exception e) {
		return false;
	}
	return true;
	}
public boolean  verifyMappingName(String ARReliance){
	try {
		
		WebElement AmountWebElement = new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(VerifyMappingName2_xpath));
		AmountWebElement.isDisplayed();
		String actual = AmountWebElement.getText().trim();
		if (actual.equals(ARReliance))
			return true;

	} catch (Exception e) {
		return false;
	}
	return true;
	}
public boolean VerifyDescription(String sheetNoFieldData) {
	try {

		WebElement collateralNameFieldInputWebEelement = new WebDriverWait(
				driver, 10).until(ExpectedConditions
				.visibilityOfElementLocated(VerifyDescription_xpath));
		collateralNameFieldInputWebEelement.clear();
		collateralNameFieldInputWebEelement.sendKeys(sheetNoFieldData);
		Thread.sleep(100);

		return true;
	} catch (Exception ex) {
		return false;
	}
	
}


public boolean  verifyFileFormat(String ARReliance){
	try {
		
		WebElement AmountWebElement = new WebDriverWait(driver,10).
				until(ExpectedConditions.visibilityOfElementLocated(verifyFileFormat_xpath));
		AmountWebElement.isDisplayed();
		String actual = AmountWebElement.getText().trim();
		if (actual.equals(ARReliance))
			return true;

	} catch (Exception e) {
		return false;
	}
	return true;
	}
public boolean  verifyStatus(String ARReliance){
	try {
		
		WebElement AmountWebElement = new WebDriverWait(driver,10).
				until(ExpectedConditions.visibilityOfElementLocated(verifyStatus_xpath));
		AmountWebElement.isDisplayed();
		String actual = AmountWebElement.getText().trim();
		if (actual.equals(ARReliance))
			return true;

	} catch (Exception e) {
		return false;
	}
	return true;
	}
public boolean  verifyPreview(){
	try {
		
		WebElement AmountWebElement = new WebDriverWait(driver,10).
				until(ExpectedConditions.visibilityOfElementLocated(verifyPreview_xpath));
		AmountWebElement.isDisplayed();
	
	} catch (Exception e) {
		return false;
	}
	return true;
	}
public boolean  verifyActions(){
	try {
		
		WebElement AmountWebElement = new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(verifyActions_xpath));
		AmountWebElement.isDisplayed();
	
	} catch (Exception e) {
		return false;
	}
	return true;
	}



//kruthivas*********Uploading************
public boolean  verifyselectgmappinggroup() {
	try {
          Thread.sleep(2000);
          
          List<WebElement> list=new ArrayList(driver.findElements((searchList_xpath)));
          
        for (int i = 0; i < list.size(); i++) {
			Thread.sleep(2000);
			WebElement ele=list.get(i);
			ele.click();
			Thread.sleep(3000);
			break;
		}

		return true;
	} catch (Exception ex) {
		return false;
	}
}
public boolean  verifyexistingmappinggroup3(String collateralNameFieldData) {
	try {
         /* Thread.sleep(2000);*/
		WebElement collateralNameFieldInputWebEelement = new WebDriverWait(
				driver, 100).until(ExpectedConditions
				.visibilityOfElementLocated(VerifyMappingNameTB2_xpath));
		Thread.sleep(100);
		this.isAlertPresent();
		collateralNameFieldInputWebEelement.clear();

		collateralNameFieldInputWebEelement
				.sendKeys(collateralNameFieldData);

		return true;
	} catch (Exception ex) {
		return false;
	}
}
public boolean  verifyMappingGroup() {
	try {
          List<WebElement> list=new ArrayList(driver.findElements((verifyMappingGroup_Xpath))); 
        for (int i = 0; i < list.size(); i++) {
			WebElement ele=list.get(i);
			String selectmappingname=ele.getText();
			System.out.println(selectmappingname);
		}

		return true;
	} catch (Exception ex) {
		return false;
	}
}
public boolean  verifycheckmappingview(){
	try {
		
		WebElement Clickonmappingnamelink = new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(verifycheckmappingview_xpath));
		Thread.sleep(1000);
		Clickonmappingnamelink.click();
	
	} catch (Exception e) {
		return false;
	}
	return true;
	}
public boolean EdirDescription(String sheetNoFieldData) {
	try {

		WebElement collateralNameFieldInputWebEelement = new WebDriverWait(
				driver,10).until(ExpectedConditions
				.visibilityOfElementLocated(EdirDescription_xpath));
		collateralNameFieldInputWebEelement.clear();
		collateralNameFieldInputWebEelement.sendKeys(sheetNoFieldData);
		return true;
	} catch (Exception ex) {
		return false;
	}
}
public boolean  Clickonpreview(){
	try {
		
		WebElement Clickonmappingnamelink = new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(Clickonpreview_xpath));
		Thread.sleep(1000);
		Clickonmappingnamelink.click();
	
	} catch (Exception e) {
		return false;
	}
	return true;
	}
public boolean  Seepreview(){
	try {
		
		WebElement Clickonmappingnamelink = new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(Clickonpreview_xpath));
		
		Clickonmappingnamelink.click();
		Thread.sleep(5000);
	
	} catch (Exception e) {
		return false;
	}
	return true;
	}
public String verifyErrorMsgMapping(String errorsMsg)
{
	try
	{
		WebElement errorConcThreshAlphanumeric=new WebDriverWait(driver,10)
		.until(ExpectedConditions.elementToBeClickable(errorMessage_xpath));
		String ActualMsg=errorConcThreshAlphanumeric.getText().trim();
		Thread.sleep(1000);
		if(ActualMsg.equals(errorsMsg));
	}
	catch(Exception e)
	{
	}
	return errorsMsg; 
}
public boolean SelectedMappingGroup(String accountNameDropdownValue) {
	try {
		WebElement productTypeDropdownWebEelement = new WebDriverWait(
				driver, 10).until(ExpectedConditions
				.visibilityOfElementLocated(SelectedMappingGroup_xpath));
		Select sel = new Select(productTypeDropdownWebEelement);

		List<WebElement> list = sel.getOptions();
		for (WebElement ele : list) {
			if (ele.getText().equals(accountNameDropdownValue)) {
				ele.click();

			}
		}
		return true;

	} catch (Exception ex) {

	}
	return false;
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
//Method to Verify Mapping Name

	public boolean clickOnMappingName() {
		try {
		    WebElement clickonclientname = new WebDriverWait(driver,10)
			    .until(ExpectedConditions .visibilityOfElementLocated(Mapping_xpath));
		    clickonclientname.isDisplayed();
		    clickonclientname.click();
		    
		    return true;
		} catch (Exception ex) {
		    return false;
		}

	}
	public boolean verifyDescription() {
		try {
		    WebElement clickonclientname = new WebDriverWait(driver,10)
			    .until(ExpectedConditions .visibilityOfElementLocated(verifyDescription_xpath));
		    clickonclientname.isDisplayed();
		    clickonclientname.click();
		    
		    return true;
		} catch (Exception ex) {
		    return false;
		}

	}
	
	public boolean VerifyBBCCollateralName() {
		try {
		    WebElement clickonclientname = new WebDriverWait(driver,10)
			    .until(ExpectedConditions .visibilityOfElementLocated(Mapping_xpath));
		    clickonclientname.isDisplayed();
		    clickonclientname.click();
		    
		    return true;
		} catch (Exception ex) {
		    return false;
		}

	}
	public boolean VerifyBBCFileFormat() {
		try {
		    WebElement clickonclientname = new WebDriverWait(driver,10)
			    .until(ExpectedConditions .visibilityOfElementLocated(BBCFileFormat_xpath));
		    clickonclientname.isDisplayed();
		    clickonclientname.click();
		    
		    return true;
		} catch (Exception ex) {
		    return false;
		}

	}
	
	//doubleclick
	public boolean doubleclickonMappingGroupName()
	{
		try
		{
			Thread.sleep(2000);
			WebElement doubleclickonDaysto=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(doubleclickonMapping_xpath));
			Actions action = new Actions(driver);
			action.doubleClick(doubleclickonDaysto).build().perform();
			Thread.sleep(3000);
			return true;
			}
		catch (Exception e)
		{
			
		}
		return false;
	}

	public boolean verifyDescription(String EditDescription) {
		try {
			Thread.sleep(2000);
			WebElement collateralNameFieldInputWebEelement = new WebDriverWait(
					driver,10).until(ExpectedConditions
					.visibilityOfElementLocated(Description_xpath));
			
			collateralNameFieldInputWebEelement.clear();
			collateralNameFieldInputWebEelement.sendKeys(EditDescription);

			return true;
		} catch (Exception ex) {
			return false;
		}
	}
	public boolean Selectedcollateralfromname(String accountNameDropdownValue) {
		try {
			WebElement productTypeDropdownWebEelement = new WebDriverWait(
					driver, 10).until(ExpectedConditions
					.visibilityOfElementLocated(Selectedcollateralfromname_xpath));
			Select sel = new Select(productTypeDropdownWebEelement);

			List<WebElement> list = sel.getOptions();
			for (WebElement ele : list) {
				if (ele.getText().equals(accountNameDropdownValue)) {
					ele.click();

				}
			}
			return true;

		} catch (Exception ex) {

		}
		return false;
	}
	
	
	public boolean EditingMappingName(String collateralNameFieldData) {
		try {
            
			WebElement collateralNameFieldInputWebEelement = new WebDriverWait(
					driver, 100).until(ExpectedConditions
					.visibilityOfElementLocated(EditingMappingName_xpath));
			Thread.sleep(100);
			this.isAlertPresent();
			collateralNameFieldInputWebEelement.clear();

			collateralNameFieldInputWebEelement
					.sendKeys(collateralNameFieldData);

			return true;
		} catch (Exception ex) {
			return false;
		}
	}
	public boolean VerifyABLMappingName(String VerifyMappingGroup) {
		try {
			Thread.sleep(2000);
			WebElement VerifyABLMappingname = new WebDriverWait(
					driver, 10).until(ExpectedConditions
					.visibilityOfElementLocated(VerifyABLMappingName_xpath));
			Thread.sleep(1000);
			VerifyABLMappingname.click();

			return true;
		} catch (Exception ex) {
			return false;
		}
	}
	public boolean uploadAPSummaryFile() {
		try{
			Thread.sleep(2000);
    String filepath = "D:\\Automation\\Automation_28_May\\cyncautomation\\Cync_Automation_Project\\FileUpload\\APSummary.xlsx";
    fileupload(filepath, chooseFile_xpath);
  

		} catch (Exception ex) {
			return false;
		} return true;
	} 
	public boolean  verifyselectgmappinggroup2(String selectMappingname) {
		try {
			Thread.sleep(1000);
	          List<WebElement> list=new ArrayList(driver.findElements((searchList_xpath)));
	          
	        for (int i = 0; i < list.size(); i++) {
				
				WebElement ele=list.get(i);
				if (ele.getText().equals(selectMappingname)) {
					ele.click();
					
					break;
				}
			}
			return true;
		} catch (Exception ex) {
			return false;
		
	}
}
	public boolean uploadARDetails() {
		try{
			Thread.sleep(2000);
    String filepath = "D:\\Automation\\Automation_28_May\\cyncautomation\\Cync_Automation_Project\\FileUpload\\newARAllBuckets.xlsx";
    fileupload(filepath, chooseFile_xpath);
  

		} catch (Exception ex) {
			return false;
		} return true;
	} 
	public boolean uploadARDetails1() {
		try{
			Thread.sleep(2000);
    String filepath = "D:\\Automation\\Automation_28_May\\cyncautomation\\Cync_Automation_Project\\FileUpload\\newARAllBuckets2.xlsx";
    fileupload(filepath, chooseFile_xpath);
  

		} catch (Exception ex) {
			return false;
		} return true;
	} 
public boolean sendInventory1Div1File() {
	try
	{
		WebElement ChooseFile = new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(chooseFile_xpath));
		ChooseFile.sendKeys("D:\\Workspace\\cyncautomation\\cyncautomation\\Cync_Automation_Project\\FileUpload\\Assetinventorynew1Div1.xlsx");
		Thread.sleep(1000);
		return true;
	}
	catch(Exception e)
	{
		return false;
	}
}

public boolean sendInventory2File() {
	try
	{
		WebElement ChooseFile = new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(chooseFile_xpath));
		ChooseFile.sendKeys("D:\\Workspace\\cyncautomation\\cyncautomation\\Cync_Automation_Project\\FileUpload\\Assetinventorynew2.xlsx");
		Thread.sleep(1000);
		return true;
	}
	catch(Exception e)
	{
		return false;
	}
}

public boolean sendInventory2Div2File() {
	try
	{
		WebElement ChooseFile = new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(chooseFile_xpath));
		ChooseFile.sendKeys("D:\\Workspace\\cyncautomation\\cyncautomation\\Cync_Automation_Project\\FileUpload\\Assetinventorynew3Div2.xlsx");
		Thread.sleep(1000);
		return true;
	}
	catch(Exception e)
	{
		return false;
	}
}

public boolean sendPayablesFile() {
	try
	{
		WebElement ChooseFile = new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(chooseFile_xpath));
		ChooseFile.sendKeys("D:\\Workspace\\cyncautomation\\cyncautomation\\Cync_Automation_Project\\FileUpload\\APSummary.xlsx");
		Thread.sleep(1000);
		return true;
	}
	catch(Exception e)
	{
		return false;
	}
}

public boolean sendPayables1Div1File() {
	try
	{
		WebElement ChooseFile = new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(chooseFile_xpath));
		ChooseFile.sendKeys("D:\\Workspace\\cyncautomation\\cyncautomation\\Cync_Automation_Project\\FileUpload\\APSummary1DIV1.xlsx");
		Thread.sleep(1000);
		return true;
	}
	catch(Exception e)
	{
		return false;
	}
}
public boolean verifyerrorMessages1()
{
    try
    {         
        WebElement textbox=new WebDriverWait(driver,100)
        .until(ExpectedConditions.visibilityOfElementLocated(ErrorMsg_xpath));     
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

public boolean sendPayables2File() {
	try
	{
		WebElement ChooseFile = new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(chooseFile_xpath));
		ChooseFile.sendKeys("D:\\Workspace\\cyncautomation\\cyncautomation\\Cync_Automation_Project\\FileUpload\\APSummary2.xlsx");
		Thread.sleep(1000);
		return true;
	}
	catch(Exception e)
	{
		return false;
	}
}


public boolean sendPayables2Div2File() {
	try
	{
		WebElement ChooseFile = new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(chooseFile_xpath));
		ChooseFile.sendKeys("D:\\Workspace\\cyncautomation\\cyncautomation\\Cync_Automation_Project\\FileUpload\\APSummary2.xlsx");
		Thread.sleep(1000);
		return true;
	}
	catch(Exception e)
	{
		return false;
	}
}
public boolean Savebutton3() {
	try {
		
		WebElement nextButtonClickWebEelement = new WebDriverWait(driver,
				10).until(ExpectedConditions
				.visibilityOfElementLocated(save3_xpath));
		Thread.sleep(1000);
		nextButtonClickWebEelement.click();
		return true;
	} catch (Exception ex) {
		return false;
	}
}
	
	
	public boolean  VerifyDescription2(String ARReliance){
		try {
			
			WebElement AmountWebElement = new WebDriverWait(driver,10).
					until(ExpectedConditions.visibilityOfElementLocated(VerifyDescription2_xpath));
			AmountWebElement.isDisplayed();
			String actual = AmountWebElement.getText().trim();
			if (actual.equals(ARReliance))
				return true;

		} catch (Exception e) {
			return false;
		}
		return true;
		}
	public boolean  verifyMappingData_File_Type(String ARReliance){
		try {
			
			WebElement AmountWebElement = new WebDriverWait(driver,10).
					until(ExpectedConditions.visibilityOfElementLocated(VerifyMappingData_File_Type_xpath));
			AmountWebElement.isDisplayed();
			String actual = AmountWebElement.getText().trim();
			if (actual.equals(ARReliance))
				return true;

		} catch (Exception e) {
			return false;
		}
		return true;
		}
	public boolean  verifyCollateralName_BalanceName(String ARReliance){
		try {
			WebElement AmountWebElement = new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(verifyCollateral_BalanceName_xpath));
			AmountWebElement.isDisplayed();
			String actual = AmountWebElement.getText().trim();
			if (actual.equals(ARReliance))
				return true;
			else {
				return false;
			}

		} catch (Exception e) {
			return false;
		}
		
		}
	public boolean  verifyexistingmappinggroup(String collateralNameFieldData) {
		try {
	          Thread.sleep(2000);
			WebElement collateralNameFieldInputWebEelement = new WebDriverWait(
					driver, 100).until(ExpectedConditions
					.visibilityOfElementLocated(VerifyMappingNameTB_xpath));
			Thread.sleep(100);
			this.isAlertPresent();
			collateralNameFieldInputWebEelement.clear();

			collateralNameFieldInputWebEelement
					.sendKeys(collateralNameFieldData);

			return true;
		} catch (Exception ex) {
			return false;
		}
	}

	/*//kruthivas*********Uploading************
	public boolean  verifyselectgmappinggroup() {
		try {
	          Thread.sleep(2000);
	          
	          List<WebElement> list=new ArrayList(driver.findElements((searchList_xpath)));
	          
	        for (int i = 0; i < list.size(); i++) {
				Thread.sleep(2000);
				WebElement ele=list.get(i);
				ele.click();
				Thread.sleep(3000);
				break;
			}

			return true;
		} catch (Exception ex) {
			return false;
		}
	}
	public boolean  verifyexistingmappinggroup3(String collateralNameFieldData) {
		try {
	          Thread.sleep(2000);
			WebElement collateralNameFieldInputWebEelement = new WebDriverWait(
					driver, 100).until(ExpectedConditions
					.visibilityOfElementLocated(VerifyMappingNameTB2_xpath));
			Thread.sleep(100);
			this.isAlertPresent();
			collateralNameFieldInputWebEelement.clear();

			collateralNameFieldInputWebEelement
					.sendKeys(collateralNameFieldData);

			return true;
		} catch (Exception ex) {
			return false;
		}
	}
	public boolean VerifyABLMappingName(String VerifyMappingGroup) {
		try {
			Thread.sleep(2000);
			WebElement VerifyABLMappingname = new WebDriverWait(
					driver, 10).until(ExpectedConditions
					.visibilityOfElementLocated(VerifyABLMappingName_xpath));
			Thread.sleep(1000);
			VerifyABLMappingname.click();

			return true;
		} catch (Exception ex) {
			return false;
		}
	}
	public boolean  verifyMappingGroup() {
		try {
	          List<WebElement> list=new ArrayList(driver.findElements((verifyMappingGroup_Xpath))); 
	        for (int i = 0; i < list.size(); i++) {
				WebElement ele=list.get(i);
				String selectmappingname=ele.getText();
				System.out.println(selectmappingname);
			}

			return true;
		} catch (Exception ex) {
			return false;
		}
	}
	
	public String verifyErrorMsgMapping(String errorsMsg)
	{
		try
		{
			WebElement errorConcThreshAlphanumeric=new WebDriverWait(driver,10)
			.until(ExpectedConditions.elementToBeClickable(errorMessage_xpath));
			String ActualMsg=errorConcThreshAlphanumeric.getText().trim();
			Thread.sleep(1000);
			if(ActualMsg.equals(errorsMsg));
		}
		catch(Exception e)
		{
		}
		return errorsMsg; 
	}
	public boolean  verifycheckmappingview(){
		try {
			
			WebElement Clickonmappingnamelink = new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(verifycheckmappingview_xpath));
			Thread.sleep(1000);
			Clickonmappingnamelink.click();
		
		} catch (Exception e) {
			return false;
		}
		return true;
		}
	public boolean EdirDescription(String sheetNoFieldData) {
		try {

			WebElement collateralNameFieldInputWebEelement = new WebDriverWait(
					driver,10).until(ExpectedConditions
					.visibilityOfElementLocated(EdirDescription_xpath));
			collateralNameFieldInputWebEelement.clear();
			collateralNameFieldInputWebEelement.sendKeys(sheetNoFieldData);
			return true;
		} catch (Exception ex) {
			return false;
		}
	}
	
	public boolean  Clickonpreview(){
		try {
			
			WebElement Clickonmappingnamelink = new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(Clickonpreview_xpath));
			Thread.sleep(1000);
			Clickonmappingnamelink.click();
		
		} catch (Exception e) {
			return false;
		}
		return true;
		}
	public boolean  Seepreview(){
		try {
			
			WebElement Clickonmappingnamelink = new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(Clickonpreview_xpath));
			
			Clickonmappingnamelink.click();
			Thread.sleep(5000);
		
		} catch (Exception e) {
			return false;
		}
		return true;
		}
	
	
	 

		public boolean verifyDescription() {
			try {
			    WebElement clickonclientname = new WebDriverWait(driver,10)
				    .until(ExpectedConditions .visibilityOfElementLocated(verifyDescription_xpath));
			    clickonclientname.isDisplayed();
			    clickonclientname.click();
			    
			    return true;
			} catch (Exception ex) {
			    return false;
			}

		}
		public boolean verifyMappingname() {
			try {
			    WebElement clickonclientname = new WebDriverWait(driver,10)
				    .until(ExpectedConditions .visibilityOfElementLocated(verifyMappingname_xpath));
			    clickonclientname.isDisplayed();
			    clickonclientname.click();
			    
			    return true;
			} catch (Exception ex) {
			    return false;
			}

		}

		public boolean VerifyBBCCollateralName() {
			try {
			    WebElement clickonclientname = new WebDriverWait(driver,10)
				    .until(ExpectedConditions .visibilityOfElementLocated(Mapping_xpath));
			    clickonclientname.isDisplayed();
			    clickonclientname.click();
			    
			    return true;
			} catch (Exception ex) {
			    return false;
			}

		}
		public boolean VerifyBBCFileFormat() {
			try {
			    WebElement clickonclientname = new WebDriverWait(driver,10)
				    .until(ExpectedConditions .visibilityOfElementLocated(BBCFileFormat_xpath));
			    clickonclientname.isDisplayed();
			    clickonclientname.click();
			    
			    return true;
			} catch (Exception ex) {
			    return false;
			}

		}
		public boolean doubleclickonMappingGroupName()
		{
			try
			{
				Thread.sleep(2000);
				WebElement doubleclickonDaysto=new WebDriverWait(driver,10)
				.until(ExpectedConditions.visibilityOfElementLocated(doubleclickonMapping_xpath));
				Actions action = new Actions(driver);
				action.doubleClick(doubleclickonDaysto).build().perform();
				Thread.sleep(3000);
				return true;
				}
			catch (Exception e)
			{
				
			}
			return false;
			
		}
		public boolean verifyDescription(String EditDescription) {
			try {
				Thread.sleep(2000);
				WebElement collateralNameFieldInputWebEelement = new WebDriverWait(
						driver,10).until(ExpectedConditions
						.visibilityOfElementLocated(Description_xpath));
				
				collateralNameFieldInputWebEelement.clear();
				collateralNameFieldInputWebEelement.sendKeys(EditDescription);

				return true;
			} catch (Exception ex) {
				return false;
			}
		}
		public boolean Selectedcollateralfromname(String accountNameDropdownValue) {
			try {
				WebElement productTypeDropdownWebEelement = new WebDriverWait(
						driver, 10).until(ExpectedConditions
						.visibilityOfElementLocated(Selectedcollateralfromname_xpath));
				Select sel = new Select(productTypeDropdownWebEelement);

				List<WebElement> list = sel.getOptions();
				for (WebElement ele : list) {
					if (ele.getText().equals(accountNameDropdownValue)) {
						ele.click();

					}
				}
				return true;

			} catch (Exception ex) {

			}
			return false;
		}
		public boolean uploadARDetails() {
			try{
				Thread.sleep(2000);
	    String filepath = "D:\\Automation\\Automation_28_May\\cyncautomation\\Cync_Automation_Project\\FileUpload\\newARAllBuckets.xlsx";
	    fileupload(filepath, chooseFile_xpath);
	  

			} catch (Exception ex) {
				return false;
			} return true;
		} 
		
		
		
		
		
		 
		 public String verifyMappingSuccessMessage(String expected)
		    {    
		        try{
//		                Thread.sleep(3000);        
		            WebElement We=new WebDriverWait(driver,10)
		            .until(ExpectedConditions.visibilityOfElementLocated(mappingSuccess_xpath));
		            String actual=We.getText();
		            
		            if(actual.equalsIgnoreCase(expected)){
		                return actual;
		            }
		    ////Thread.sleep(5000);    
		        }
		        catch(Exception ex){
		            return null;
		                }        
		        return expected;
		    }
		
		 public boolean verifyMappingname() {
				try {
				    WebElement clickonclientname = new WebDriverWait(driver,10)
					    .until(ExpectedConditions .visibilityOfElementLocated(verifyMappingname_xpath));
				    clickonclientname.isDisplayed();
				    clickonclientname.click();
				    
				    return true;
				} catch (Exception ex) {
				    return false;
				}

			}*/
	
		 public String verifyMappingSuccessMessage(String expected)
		    {    
		        try{
      
		            WebElement We=new WebDriverWait(driver,10)
		            .until(ExpectedConditions.visibilityOfElementLocated(mappingSuccess_xpath));
		            String actual=We.getText();
		            
		            if(actual.equalsIgnoreCase(expected)){
		                return actual;
		            }
		     
		        }
		        catch(Exception ex){
		            return null;
		                }        
		        return expected;
		    }
		 public boolean selectMappingNameDropDown(String data1) {
		        try {
		            WebElement element = new WebDriverWait(
		                    driver, 10).until(ExpectedConditions
		                    .visibilityOfElementLocated(mapping_name_xpath));
		            Select sel = new Select(element);
		            /*sel.ByVisibleText(accountNameDropdownValue);*/
		            List<WebElement> list = sel.getOptions();
		            for (WebElement ele : list) {
		                String actual=ele.getText();
		                if (actual.equals(data1))
		                    sel.selectByVisibleText(actual);                   
		            }
		        } catch (Exception ex) {
		        }
		        return true;
		    }
		 public boolean clickOnAdd()
		    {    
		        try{
		           Thread.sleep(1000);        
		            WebElement We=new WebDriverWait(driver,10)
		            .until(ExpectedConditions.visibilityOfElementLocated(add_plus_xpath));
		            We.click();;
		 
		            return true;
		        }
		        catch(Exception ex){
		            return false;
		                }   
		        
		    }
		 public boolean clickOnSaveFile()
		    {    
		        try{
		       Thread.sleep(1000);        
		            WebElement We=new WebDriverWait(driver,10)
		            .until(ExpectedConditions.visibilityOfElementLocated(save_file_xpath));
		            We.click();                
		    
		            return true;
		        }
		        catch(Exception ex){
		            return false;
		                }        
		    }
		 public boolean clickOnCloseBtn()
		    {    
		        try{
		                Thread.sleep(3000);        
		            WebElement We=new WebDriverWait(driver,10)
		            .until(ExpectedConditions.visibilityOfElementLocated(close_btn_xpath));
		            We.click();
		            this.isAlertPresent();
		   
		            return true;
		        }
		        catch(Exception ex){
		            return false;
		                }        
		    }
		 public boolean verifyMappingname() {
				try {
				    WebElement clickonclientname = new WebDriverWait(driver,10)
					    .until(ExpectedConditions .visibilityOfElementLocated(verifyMappingname_xpath));
				    clickonclientname.isDisplayed();
				    clickonclientname.click();
				    
				    return true;
				} catch (Exception ex) {
				    return false;
				}

			}
}
