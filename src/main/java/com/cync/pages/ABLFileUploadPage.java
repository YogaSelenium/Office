package com.cync.pages;

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
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.LocalFileDetector;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.SkipException;

import com.cync.base.BasePage;

public class ABLFileUploadPage extends BasePage {

	private final By ABLFileUploadPageHeader_xpath = By
			.xpath("//h3[contains(text(),'ABL File Uploads')]");
	private final By bbcDate_xpath = By
			.xpath("//input[@class='ng-tns-c5-2 ui-inputtext ui-widget ui-state-default ui-corner-all ng-star-inserted']");
	private final By dataFileType_xpath = By
			.xpath("//span[text()='Receivables']");
	private final By collateralName_xpath = By
			.xpath("//span[text()='summarymapping']");
	private final By currentPeriod_xpath = By
			.xpath("(//span[text()='04/28/2017'])[1]");
	private final By DueDate_xpath = By
			.xpath("(//span[text()='04/28/2017'])[2]");

	/*
	 * Author-Lavanya private final By
	 * chooseFile_xpath=By.xpath("//button[text()=' Choose File ']"); private
	 * final By ProcessFile_xpath=By.xpath("//span[text()='Process Files']");
	 * private final By
	 * sucessMessage_xpath=By.xpath("//b[text()='File upload was successful']");
	 * private final By
	 * closeSucessMessage_xpath=By.xpath("(//button[.='Close'])[2]"); private
	 * final By uploadedValue_xpath=By.xpath("//*[text()='117,250.00']");
	 */// private final By
		// chooseFile_xpath=By.xpath("//button[text()=' Choose File ']");
		// rohit
	private final By chooseFile_xpath = By
			.xpath("(//*[contains(@class,'ui-cell')]//*[@class='btn ng-star-inserted']/../input[@id='file_upload0'])");
	
	private final By ProcessFile_xpath = By
			.xpath("//span[text()='Process Files']");
	private final By sucessMessage_xpath = By
			.xpath("//b[text()='File upload was successful']");
	private final By closeSucessMessage_xpath = By
			.xpath("(//button[text()='Close'])[2]");
	private final By uploadedValue_xpath = By
			.xpath("//*[@class='ng-star-inserted']//*[text()='117,250.00']");

	private final By dataClick_xpath = By
			.xpath("//*['cync_main_contents_wradio']//*[contains(@class,'')]//td/a");
	private final By collateralNameData_xpath = By
			.xpath("//a[contains(text(),'summary')]");
	private final By futureAmountData_xpath = By
			.xpath("//span[contains(text(),'2,000.00')]");
	private final By currentAmountData_xpath = By
			.xpath("//span[contains(text(),'36,500.00')]");
	private final By Over30AmountData_xpath = By
			.xpath("//span[contains(text(),'11,500.00')]");
	private final By Over60AmountData_xpath = By
			.xpath("//span[contains(text(),'33,000.00')]");
	private final By Over90AmountData_xpath = By
			.xpath("//span[contains(text(),'19,750.00')]");
	private final By Over120AmountData_xpath = By
			.xpath("//span[contains(text(),'14,500.00')]");
	private final By BalanceAmountData_xpath = By
			.xpath("//span[contains(text(),'117,250.00')]");
	private final By notificationClick_xpath = By
			.xpath("//span[@class='ui-cell-data clr_blue hand']");
	private final By NotificationProcessFileData_xpath = By
			.xpath("//p[contains(text(),'Processing file succeed')]");
	private final By HyperLinkFileNavigate_xpath = By
			.xpath("//a[contains(text(),'SummaryArAblOne.xlsx')]");
	private final By ChooseFileForReceivables_xpath = By
			.xpath("(//*[contains(@class,'ui-cell')]//*[@class='btn ng-star-inserted'])[1]");
	private final By chooseFileInventory_xpath = By
			.xpath("(//button[contains(text(),'Choose File')])[1]");
	private final By chooseFilePayble_xpath = By
			.xpath("(//button[contains(text(),'Choose File')])[2]");
	private final By chooseFileReceivable_xpath = By
			.xpath("(//button[contains(text(),'Choose File')])[3]");
	private final By selectDataFileTypeAsReceivable_xpath = By
			.xpath("(//span[@class='ui-row-toggler fa fa-fw ui-clickable fa-chevron-circle-right'])[3]");
	private final By CollateralNameLink_xpath = By
			.xpath("(//span[@class='ui-cell-data clr_blue hand mapping_icon_parent_class ng-star-inserted'])[2]");
	private final By verifyMappingScreen_xpath = By
			.xpath("//strong[contains(text(),'Mapping')]");
	private final By selectDataFileTypeAsInventory_xpath = By
			.xpath("(//span[@class='ui-row-toggler fa fa-fw ui-clickable fa-chevron-circle-right'])[1]");
	private final By selectDataFileTypeAsPaybles_xpath = By
			.xpath("(//span[@class='ui-row-toggler fa fa-fw ui-clickable fa-chevron-circle-right'])[2]");
	private final By clickFileHyperLink_xpath = By
			.xpath("//span[@class='m-l-10 ui-cell-data clr_blue']");
	private final By summaryReceivables_xpath = By
			.xpath("//span[@class='paneltitle']");
	private final By summaryReceivables1_xpath = By
			.xpath("//span[text()=' Summary Receivables']");
	private final By assetInventory_xpath = By
			.xpath("(//*[@id='bgshadow']//*[text()='Assets / Inventory'])[1]");
	private final By Payables_xpath = By
			.xpath("//span[contains(text(),' Summary Payables')]");
	private final By detailReceivables1_xpath = By
			.xpath("//span[text()=' Detail Receivables']");
	private final By DetailPaybles_xpath = By
			.xpath("//span[contains(text(),' Detail Payables')]");

	private final By DataReviews_xpath = By
			.xpath("//*[contains(@class,'input-group grid-search')]//input[@id='globalSearch']");

	private final By ChooseFileForReceivables1DIV1_xpath = By
			.xpath("(//*[contains(@class,'ui-cell')]//*[@class='btn ng-star-inserted']/../input[@id='file_upload1'])");
	// rohit
	private final By enterFileName_xapth = By
			.xpath("//*[.='Collateral Name']//input");
	private final By ChooseFile1_xpath = By
			.xpath("(//*[contains(@class,'ui-cell')]//*[@class='btn ng-star-inserted']/../input[@id='file_upload0'])");
	private final By ChooseFile2_xpath = By
			.xpath("(//*[contains(@class,'ui-cell')]//*[@class='btn ng-star-inserted']/../input[@id='file_upload1'])");
	private final By ChooseFile3_xpath = By
			.xpath("(//*[contains(@class,'ui-cell')]//*[@class='btn ng-star-inserted']/../input[@id='file_upload2'])");
	private final By ChooseFile4_xpath = By
			.xpath("(//*[contains(@class,'ui-cell')]//*[@class='btn ng-star-inserted']/../input[@id='file_upload3'])");

	// /ineligible calc
	private final By ChooseFileForInventory_xpath = By
			.xpath("(//*[contains(@class,'ui-cell')]//*[@class='btn ng-star-inserted']/../input[@id='file_upload0'])");
	private final By ChooseFileForInventory1DIV1_xpath = By
			.xpath("(//*[contains(@class,'ui-cell')]//*[@class='btn ng-star-inserted']/../input[@id='file_upload1'])");
	private final By ChooseFileForInventory2_xpath = By
			.xpath("(//*[contains(@class,'ui-cell')]//*[@class='btn ng-star-inserted']/../input[@id='file_upload2'])");
	private final By ChooseFileForInventory2DIV2_xpath = By
			.xpath("(//*[contains(@class,'ui-cell')]//*[@class='btn ng-star-inserted']/../input[@id='file_upload3'])");
	private final By ChooseFileForPayables_xpath = By
			.xpath("(//*[contains(@class,'ui-cell')]//*[@class='btn ng-star-inserted']/../input[@id='file_upload0'])");
	private final By ChooseFileForPayables1DIV1_xpath = By
			.xpath("(//*[contains(@class,'ui-cell')]//*[@class='btn ng-star-inserted']/../input[@id='file_upload1'])");
	private final By ChooseFileForPayables2_xpath = By
			.xpath("(//*[contains(@class,'ui-cell')]//*[@class='btn ng-star-inserted']/../input[@id='file_upload2'])");
	private final By ChooseFileForPayables2DIV2_xpath = By
			.xpath("(//*[contains(@class,'ui-cell')]//*[@class='btn ng-star-inserted']/../input[@id='file_upload3'])");
	private final By ChooseFileForReceivables2_xpath = By
			.xpath("(//*[contains(@class,'ui-cell')]//*[@class='btn ng-star-inserted']/../input[@id='file_upload2'])");
	private final By ChooseFileForReceivables2DIV2_xpath = By
			.xpath("(//*[contains(@class,'ui-cell')]//*[@class='btn ng-star-inserted']/../input[@id='file_upload3'])");
	private final By ReceivablesExpandLink_xpath = By
			.xpath("//*['cync_main_contents_wradio']//*[contains(@class,'')]//td/a");
	private final By PayablesExpandLink_xpath = By
			.xpath("(//*['cync_main_contents_wradio']//*[contains(@class,'')]//td/a)[5]");
	private final By ReceivablesHyperLinkUnderCollateralType = By
			.xpath("//a[@target='_blank'][contains(text(),'Receivables')]");
	private final By MappingFirstPage_xpath = By
			.xpath("//span[@class='img-circle mapActiveIcon1']");
	private final By AssetInventoryHyperLinkUnderCollateralType = By
			.xpath("//a[contains(text(),'AssetInventory')]");
	private final By PayablesHyperLinkUnderCollateralType = By
			.xpath("//a[@target='_blank'][contains(text(),'Payables')]");

	/*
	 * Author-Lavanya
	 */
	private final By clickonfilename_xpath = By
			.xpath("//span[@class='ui-row-toggler fa fa-fw ui-clickable fa-chevron-circle-right']");
	private final By clickonclose_xpath = By
			.xpath("//i[@class='hand fa fa-times-circle uploads_delete']");
	private final By clickonyesbtn_xpath = By.xpath("//button[text()='Yes']");
	private final By verifydeletefilemsg_xpath = By
			.xpath("//p[text()='File has been deleted successfully']");
	private final By menu_xpath = By.xpath("//img[@class='home-icon']");

	// Author garima
	private final By uploadbbcdatafile_xpath = By
			.xpath("//label[contains(text(),'Upload BBC Data Files')]");
	private final By uploadotherrequireddocounment_xpath = By
			.xpath(" //label[contains(text(),'Upload Other Required Documents')]");
	private final By chooseFileReceivable1_xpath = By
			.xpath("//button[text()=' Choose File ']");
	private final By ABL_xpath = By
			.xpath(" //label[contains(text(),'ABL Auto File Upload')]");
	private final By FileNAme_xpath = By
			.xpath("//span[contains(text(),'File Name')]");
	private final By Uploadtype_xpath = By
			.xpath("//span[contains(text(),'Upload Type')]");

	private final By Breadcrum_xpath = By
			.xpath("//div[@class='breadcrumb_container']");
	private final By Search_xpath = By.id("globalSearch");
	private final By DivisionDropDown_xpath = By
			.xpath("//select[@id='divisiondivision']");
	private final By Exchangehyperlink_xpath = By.xpath("//a[@class='m-l-10']");
	private final By DatafileType_xpath = By
			.xpath("(//input[@type='text'])[6]");
	private final By MappingName_xpath = By
			.xpath("//tr[@class='ui-state-default ng-star-inserted']//th[3]//input[1]");
	private final By fileuplods_xpath = By
			.xpath("//span[contains(text(),'File Format')]");
	private final By DueDates_xpath = By
			.xpath("//span[@class='ng-tns-c6-3 ui-calendar']//input[@placeholder='Search']");
	private final By ExpectedValue_xpath = By
			.xpath("//tr[@class='ui-state-default ng-star-inserted']//th[7]//input[1]");
	private final By TotalExpectedValue_xpath = By
			.xpath("//tr[@class='ui-state-default ng-star-inserted']//th[8]//input[1]");
	private final By uploadvalue_xpath = By
			.xpath("//tr[@class='ui-state-default ng-star-inserted']//th[9]//input[1]");
	private final By FileUploads_xpath = By
			.xpath("//tr[@class='ui-state-default ng-star-inserted']//th[10]//input[1]");
	private final By Borrower_xpath = By
			.xpath("//tr[@class='ui-state-default ng-star-inserted']//th[11]//input[1]");
	private final By Upload_xpath = By
			.xpath("(//span[@class='ui-column-title ng-star-inserted'])[12]");
	private final By ChooseFile_xpath = By
			.xpath("//button[@class='btn ng-star-inserted']");


	private final By ChooseFileForReceivables2ndBBCForMulDiv_xpath = By
			.xpath("//tbody[@class='ui-datatable-data ui-widget-content']//tr[1]//td[12]//span[1]//div[1]//button[1]");

	private final By RadioButtonOfUploadBBCdataFile_xpath = By
			.xpath("//span[@class='ui-radiobutton-icon ui-clickable fa fa-circle']");
	private final By RadioButtonOfUploadOtherRequiredDocuments_xpath = By
			.xpath("(//div[@class='ui-radiobutton-box ui-widget ui-state-default'])[2]");
	private final By RadioButtonOfABLAutoFileUpload_xpath = By
			.xpath("//span[@class='ui-radiobutton-icon ui-clickable fa fa-circle']");
	private final By VerifyDropDownDivision_xpath = By
			.xpath("//select[@name='division']");
	private final By ExchangeRateInScreen_xpath = By
			.xpath("//a[contains(text(),'Exchange Rate')]");
	private final By fileFormat_xpath = By
			.xpath("//span[contains(text(),'File Format')]");
	private final By CurrentPeriod_xpath = By
			.xpath("(//span[contains(text(),'Current Period')])[1]");
	private final By UploadOtherRequiredDocumentPageMessage_xpath = By
			.xpath("//span[contains(text(),'No records found')]");
	private final By selectCollateralFromDropDown_xpath = By
			.xpath("(//span[@class='ui-cell-data ng-star-inserted'])[13]");

	private final By CollateralName_xpath = By
			.xpath("//span[contains(text(),'Receivables0')]");
	private final By mappingName_xpath = By
			.xpath("//tr[@class='ui-datatable-even ui-widget-content ng-star-inserted']//span[@class='ui-cell-data ng-star-inserted'][contains(text(),'rec')]");
	private final By BorrowerReceivable_xpath = By
			.xpath("//span[contains(text(),'BorrowerReceivable')]");
	private final By BorrowerReceivableYESCase_xpath = By
			.xpath("//span[contains(text(),'YES')]");
	private final By UploadotherRequiredDocumnetData_xpath = By
			.xpath("//tr[@class='ui-state-default ng-star-inserted']");
	private final By AutoFileUploadData_xpath = By
			.xpath("//tr[@class='ui-state-default ng-star-inserted']");

	private final By accountnum_xpath = By
			.xpath("(//div[@class='ui-th-div ui-jqgrid-sortable'])[2]");
	
	private final By invoicno_xpath = By
			.xpath("(//div[@class='ui-th-div ui-jqgrid-sortable'])[4]");
	private final By orderno_xpath = By
			.xpath("(//div[@class='ui-th-div ui-jqgrid-sortable'])[5]");
	private final By orignalDate_xpath = By
			.xpath("(//div[@class='ui-th-div ui-jqgrid-sortable'])[6]");
	private final By invoicedays_xpath = By
			.xpath("(//div[@class='ui-th-div ui-jqgrid-sortable'])[7]");
	private final By Invoiceamount_xpath = By
			.xpath("(//div[@class='ui-th-div ui-jqgrid-sortable'])[8]");
	private final By currentAmount_xpath = By
			.xpath("(//div[@class='ui-th-div ui-jqgrid-sortable'])[9]");

	private final By VerifyMappingReceivables_xpath = By
			.xpath("(//img[@class='mapping_icon'])[3]");
	private final By selectDataFileTypeAsAsset_xpath = By
			.xpath("(//img[@class='mapping_icon'])[2]");
	private final By selectDataFileTypeAsPayables_xpath = By
			.xpath("(//img[@class='mapping_icon'])[1]");

	private final By clickFileHyperLinksummarySingleDiv_xpath = By
			.xpath("//a[contains(text(),'summary_file.xlsx')]");
	private final By clickFileHyperLinkForAssetSummarySingleDiv_xpath = By
			.xpath("//a[contains(text(),'Inventory.xlsx')]");
	private final By clickFileHyperLinkSummarySingleDivPay_xpath = By
			.xpath("//a[contains(text(),'apsumarypayble.xlsx')]");

	private final By clickFileHyperLinksummarySingleDiv1_xpath = By
			.xpath("//a[contains(text(),'summaryfile1.xlsx')]");

	private final By clickFileHyperLinkSummarySingleDivPay1_xpath = By
			.xpath("//a[contains(text(),'summarypayables.xlsx')]");
	private final By ablFileUploadData_xpath=By.xpath("//*['cync_main_contents_wradio']//*[contains(@class,'')]//td/a");
	private final By loadingWait_xpath=By.xpath("//*[contains(@class,'theme_3') and not (contains(@class,'loading'))]");
	
	
	//kruthivas
	private final By VerifyActionpending_xpath=By.xpath("//div[@class='ui-datatable-tablewrapper ng-star-inserted']//table//tr[1]//th[15]//input");
	private final By verifyABLDataFileType_xpath=By.xpath("//div[@class='ui-datatable-tablewrapper ng-star-inserted']//tbody//tr[1]/td[2]");
	private final By VerifyABLBBCMappingGroup_xpath=By.xpath("(//input[@class='ui-column-filter ui-inputtext ui-widget ui-state-default ui-corner-all ng-star-inserted'])[2]");
	private final By VerifyABLBBCMappingName_xpath=By.xpath("//*[@id='cync_main_contents_wradio']/div[1]/p-datatable/div/div[1]/table/tbody/tr[1]/td[4]/span/select");
	private final By Selectedcollateralfromname_xpath=By.xpath("//table[@id='borrower_addendums_list']//tr[2]//td[7]/select");
	private final By Description_xpath=By.xpath("//table[@id='borrower_addendums_list']//tr[2]//td[5]/input");
	private final By verifyselectgmappinggroup_xpath=By.xpath("//div[@class='ui-datatable-tablewrapper ng-star-inserted']//table//tr[2]//td[3]");
	private final By AblMappingDatafiletype_xpath=By.xpath("(//input[@class='ui-column-filter ui-inputtext ui-widget ui-state-default ui-corner-all ng-star-inserted'])[1]");
	private final By verifyDatafiletype_xpath=By.xpath("(//input[@class='ui-column-filter ui-inputtext ui-widget ui-state-default ui-corner-all ng-star-inserted'])[1]");
	private final By AblMappingCollateral_xpath=By.xpath("(//input[@class='ui-column-filter ui-inputtext ui-widget ui-state-default ui-corner-all ng-star-inserted'])[3]");
	private final By verifyCollateral_xpath=By.xpath("//tbody[@class='ui-datatable-data ui-widget-content']//tr[1]//td[5]");
	private final By VerifyABLMappingName_xpath=By.xpath("//div[@class='ui-datatable-tablewrapper ng-star-inserted']//tbody//tr[5]//td[4]//select");
	private final By verifyAblMappingname_Xpath=By.xpath("//div[@class='ui-datatable-tablewrapper ng-star-inserted']//tbody//tr[5]//td[4]");
	private final By ClickonMappingView_xpath=By.xpath("//div[@class='ui-datatable-tablewrapper ng-star-inserted']//tbody//tr[5]//descendant::span[@class='ui-cell-data clr_blue hand mapping_icon_parent_class ng-star-inserted']//img");
	private final By ClickonLayoutView_xpath=By.xpath("//div[@class='ui-datatable-tablewrapper ng-star-inserted']//tbody//tr[5]//descendant::span[@class='ng-star-inserted']//a");
	private final By chooseFile_xpath2=By.xpath("//div[@class='ui-datatable-tablewrapper ng-star-inserted']//tbody//tr[5]//descendant::span[@class='ng-star-inserted']//a");
	private final By VerifyABLMappingName2_xpath=By.xpath("//div[@class='ui-datatable-tablewrapper ng-star-inserted']//tbody//tr[1]//td[4]//select");
	private final By chooseFile2_xpath=By.xpath("(//button[text()=' Choose File '])[1]");
	private final By verifyClickhere_xpath=By.xpath("(//button[@class='btn btn-primary ng-star-inserted'])[1]");
	private final By Namemultiplemappingpreview_xpath=By.xpath("//*[@id='bgshadow']/div/div/strong[1]");
	private final By verifyCollateralNamemultiplemappingpreview_xpath=By.xpath("//*[@id='bgshadow']/div/div/strong[2]");
	private final By verifyAccountNomultiplemappingpreview_xpath=By.xpath("//*[@id='receivables_list_0']/thead/tr/th[1]");
	private final By verifybreadcrumbactionpendingscreen_xpath=By.xpath("//*[@id='breadcrumb_container']/div[3]/ul");
	private final By verifyTooltips_xpath=By.xpath("//*[@id='bgshadow']/div/div/span/a");
	private final By VerifyABLMappingName3_xpath=By.xpath("//div[@class='ui-datatable-tablewrapper ng-star-inserted']//tbody//tr[7]//td[4]//select");
	private final By ChooseFile12_xpath = By.xpath("(//*[contains(@class,'ui-cell')]//*[@class='btn ng-star-inserted']/../input[@id='file_upload6'])");
	
	private final By verifyClickhere2_xpath=By.xpath("(//button[contains(text(),'Click Here')])[2]");
	
	private final By CloseSuccesfull_xpath=By.xpath("//button[contains(text(),'Close') and @id='modal_action_close']");
	private final By Clickonradobutton_xpath=By.xpath("//*[@id='abl_auto_file_upload']/div/div[2]");
	private final By verifyuploadedfileid_xpath=By.xpath("//*[@id='MyDataTable']/div/div[1]//tbody/tr[1]/td[1]/span");
	private final By Verifyvalue_xpath=By.xpath("//*[@id='receivables_list_0']/tbody/tr/td[2]/strong");
	
	private final By verifyAccountName_xpath=By.xpath("//*[@id='receivables_list_0']/thead/tr/th[2]");
	private final By verifyInvoiceNo_xpath=By.xpath("//*[@id='receivables_list_0']/thead/tr/th[3]");
	private final By OriginalDate_xpath=By.xpath("//*[@id='receivables_list_0']/thead/tr/th[4]");
	private final By Current_xpath=By.xpath("//*[@id='receivables_list_0']/thead/tr/th[5]");
	private final By actualvalue_xpath=By.xpath("//*[@id='receivables_list_0']/tbody/tr/td[3]/strong");
	private final By RecordCount_xpath=By.xpath("//*[@id='receivables_list_0']/tbody/tr/td[2]/strong");
	private final By Variancevalue_xpath=By.xpath("//*[@id='receivables_list_0']/tbody/tr/td[3]/strong");
	private final By valueBox_xpath=By.xpath("//*[@id='cync_main_contents_wradio']/div[1]/p-datatable/div/div[1]/table/tbody/tr[7]/td[9]/span/span/input");
	private final By clickDatatype_xpath=By.xpath("//*[@id='cync_main_contents_wradio']/div[1]/p-datatable/div/div[1]/table/thead/tr/th[2]/span[2]");
	private final By MappingAndBBC_xpath=By.xpath("//a[contains(text(),'Proceed with this Mapping')]");
	
	public ABLFileUploadPage(WebDriver driver) {
		super(driver);
		try {
			if (!driver.findElement(ABLFileUploadPageHeader_xpath).getText()
					.trim().contains("ABL File Uploads")) {
				throw new SkipException(
						"ABL Client Creation page couldn't open.");

			}
		} catch (Exception e) {

			// TODO Auto-generated constructor stub
			e.printStackTrace();
		}}

		// TODO Auto-generated constructor stub

	private final By clickFileHyperLinkForreceivablesSum_xpath=By.xpath("(//img[@class='mapping_icon'])[3]");
	private final By clickFileHyperLinkForAssetinventorySum_xpath=By.xpath("(//img[@class='mapping_icon'])[1]");
	private final By clickFileHyperLinkForPayablesSum_xpath=By.xpath("(//img[@class='mapping_icon'])[2]");
	private final By clickOnInvoiceName_xpath=By.xpath("//a[text()=' newARAllBuckets.xlsx']");
	private final By clickARDetails_xpath=By.xpath("//a[@href='#']");    
	private final By clickRefreshButton_xpath=By.xpath("//span[@class='glyphicon glyphicon-refresh']");
	
	
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
	

	public boolean bbcDateValidation(String expectedBBCDate) {
		try {
			WebElement BBCDateWebElement = new WebDriverWait(driver, 100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(bbcDate_xpath));

			String actual = BBCDateWebElement.getText().trim();
			actual.equals(expectedBBCDate);
			return true;

		} catch (Exception e) {
			return false;
		}
	}

	public boolean dataFileTypeValidate(String expectedDataFileType) {
		try {
			WebElement BBCDateWebElement = new WebDriverWait(driver, 100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(dataFileType_xpath));

			String actual = BBCDateWebElement.getText().trim();
			actual.equals(expectedDataFileType);
			return true;

		} catch (Exception e) {
			return false;
		}
	}

	public boolean collateralName(String expectedCollateralName) {
		try {
			WebElement collateralNameWebElement = new WebDriverWait(driver, 100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(collateralName_xpath));

			String actual = collateralNameWebElement.getText().trim();
			actual.equals(expectedCollateralName);
			return true;

		} catch (Exception e) {
			return false;
		}
	}

	public boolean currentPeriod(String expectedCurrentPeriod) {
		try {
			WebElement currentPeriodWebElement = new WebDriverWait(driver, 100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(currentPeriod_xpath));

			String actual = currentPeriodWebElement.getText().trim();
			actual.equals(expectedCurrentPeriod);
			return true;

		} catch (Exception e) {
			return false;
		}
	}

	public boolean dueDate(String expectedDueDate) {
		try {
			WebElement dueDateWebElement = new WebDriverWait(driver, 100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(DueDate_xpath));

			String actual = dueDateWebElement.getText().trim();
			actual.equals(expectedDueDate);
			return true;

		} catch (Exception e) {
			return false;
		}
	}

	public boolean clickchooseFile() {

		try {
			WebElement clickchooseFileWebEelement = new WebDriverWait(driver,
					10).until(ExpectedConditions
					.visibilityOfElementLocated(chooseFile_xpath));
			clickchooseFileWebEelement.isDisplayed();
			clickchooseFileWebEelement.click();
			Thread.sleep(5000);
			return true;
		} catch (Exception ex) {
			return false;
		}

	}

	// rohit
	public void fileUPload_Mapping() {
		try {
			Thread.sleep(2000);
			WebElement El = driver.findElement(chooseFile_xpath);
			// scrollIntoView(By.xpath("(//*[contains(@class,'ui-cell')]//*[@class='btn ng-star-inserted'])[1]/../input"));
			((RemoteWebElement) El).setFileDetector(new LocalFileDetector());
			El.sendKeys("D:\\cyncautomation\\Cync_Automation_Project\\FileUpload\\SummaryArAblOne.xlsx");
			Thread.sleep(1000);
		} catch (Exception e) {
			// TODO Auto-generated catch block
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
			El.sendKeys("D:\\Cync_Project_Automation\\cyncautomation\\Cync_Automation_Project\\FileUpload\\SummaryArAblOne.xlsx");
			Thread.sleep(1000);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public boolean fileUPload_mapping() {

		try {

			StringSelection ss = new StringSelection(
					"D:\\cyncautomation\\Cync_Automation_Project\\FileUpload\\SummaryArAblOne.xlsx");
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
			// TODO: handle exception
			return false;
		}

	}

	public boolean clickProcessFile() {

		try{

			Thread.sleep(3000);
			WebElement clickchooseFileWebEelement=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(ProcessFile_xpath));
			clickchooseFileWebEelement.click();
			driver.findElement(loadingWait_xpath);
			//new WebDriverWait(driver,100).until(ExpectedConditions.elementToBeClickable(loadingWait_xpath));
			Thread.sleep(5000);
			return true;
		}
		catch(Exception ex)
		{
			return false;
		}
	

	}

//Mukesh
//Verify and click AR Details in ABL File Upload page
public boolean clickOnARdetails()
{
	try{
		driver.navigate().refresh();
		Thread.sleep(5000);
		WebElement clickARdetailsWebElement = new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(clickARDetails_xpath));
		clickARdetailsWebElement.isDisplayed();
		clickARdetailsWebElement.click();
		Thread.sleep(1000);
		this.isAlertPresent();
		return true;
	}
	catch(Exception ex)
	{
		return false;
	}
}
//Mukesh
//Verify and click on Invoice number under AR Details
public boolean clickOnInvoiceName()
{
	try{
		
		Thread.sleep(3000);
		
		WebElement clickOnInvoiceNameWebElement = new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(clickOnInvoiceName_xpath));
		//clickOnInvoiceNameWebElement.isDisplayed();
		clickOnInvoiceNameWebElement.click();
		
		
		return true;
	}
	catch(Exception ex)
	{
		return false;
	}
}


//Mukesh
//Verify and click on Invoice number under AR Details



public boolean uploadedValue(String expectedUplodedValue){
	try {
		
		WebElement dueDateWebElement = new WebDriverWait(
				driver, 100)
				.until(ExpectedConditions
						.visibilityOfElementLocated(uploadedValue_xpath));
		
		String actual = dueDateWebElement.getText().trim();
		actual.equals(expectedUplodedValue);

			return true;
		}
		catch(Exception ex){
			return false;
		}

		}
	

	public String sucessMessage(String expectedSucessMessage) {
		try {
			WebElement dueDateWebElement = new WebDriverWait(driver, 20)
					.until(ExpectedConditions
							.visibilityOfElementLocated(sucessMessage_xpath));

			String actual = dueDateWebElement.getText().trim();
			actual.equals(expectedSucessMessage);

			Thread.sleep(2000);

		} catch (Exception e) {

		}
		return expectedSucessMessage;
	}

	public boolean closeSucessMessage() {

		try {

			Thread.sleep(10000);
			WebElement clickchooseFileWebEelement = new WebDriverWait(driver,
					10).until(ExpectedConditions
					.visibilityOfElementLocated(closeSucessMessage_xpath));
			clickchooseFileWebEelement.click();

			return true;
		} catch (Exception ex) {
			return false;
		}

	}

	public boolean ClickToOpenData() {

		try {
			driver.navigate().refresh();
			Thread.sleep(10000);
			WebElement clickchooseFileWebEelement = new WebDriverWait(driver,
					10).until(ExpectedConditions
					.visibilityOfElementLocated(dataClick_xpath));
			clickchooseFileWebEelement.click();

			return true;
		} catch (Exception ex) {
			return false;
		}

	}

	public boolean collateralNameData(String expectedCollateralName) {
		try {
			WebElement collateralNameWebElement = new WebDriverWait(driver, 100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(collateralNameData_xpath));

			String actual = collateralNameWebElement.getText().trim();
			actual.equals(expectedCollateralName);
			return true;

		} catch (Exception e) {
			return false;
		}
	}

	public boolean futureAmountData(String expectedfutureAmount) {
		try {
			WebElement collateralNameWebElement = new WebDriverWait(driver, 100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(futureAmountData_xpath));

			String actual = collateralNameWebElement.getText().trim();
			actual.equals(expectedfutureAmount);
			return true;

		} catch (Exception e) {
			return false;
		}
	}

	public boolean currentAmountData(String expectedCurrentAmount) {
		try {
			WebElement collateralNameWebElement = new WebDriverWait(driver, 100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(currentAmountData_xpath));


			String actual = collateralNameWebElement.getText().trim();
			actual.equals(expectedCurrentAmount);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
public boolean clickCollateralNameLinkAndVerifyMapping(){
	
	try{
		/*WebElement WebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(CollateralNameLink_xpath));
		WebEelement.click();*/
		Thread.sleep(1000);
		Set <String> handles =driver.getWindowHandles();
		Iterator<String> it = handles.iterator();
		//iterate through your windows
		while (it.hasNext()){
		String parent = it.next();
		String newwin = it.next();
		driver.switchTo().window(newwin);
		//perform actions on new window
		WebElement WebEelement1=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(verifyMappingScreen_xpath));
		WebEelement1.isDisplayed();
		driver.close();
		driver.switchTo().window(parent);
		return true;
	}}
	catch(Exception ex){
		
	}
	return false;
}


public boolean clickCollateralNameLinkAndVerifyMapping1(){
	
	try{
		WebElement WebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(CollateralNameLink_xpath));
		WebEelement.click();
		Thread.sleep(1000);
		Set <String> handles =driver.getWindowHandles();
		Iterator<String> it = handles.iterator();
		//iterate through your windows
		while (it.hasNext()){
		String parent = it.next();
		String newwin = it.next();
		driver.switchTo().window(newwin);
		//perform actions on new window
		WebElement WebEelement1=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(verifyMappingScreen_xpath));
		WebEelement1.isDisplayed();
		driver.close();
		driver.switchTo().window(parent);
		return true;
	}}
	catch(Exception ex){
		
	}
	return false;
}

	

	public boolean Over30AmountData(String expectedOver30Amount) {
		try {
			WebElement collateralNameWebElement = new WebDriverWait(driver, 100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(Over30AmountData_xpath));

			String actual = collateralNameWebElement.getText().trim();
			actual.equals(expectedOver30Amount);
			return true;

		} catch (Exception e) {
			return false;
		}
	}

	public boolean Over60AmountData(String expectedOver60Amount) {
		try {
			WebElement collateralNameWebElement = new WebDriverWait(driver, 100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(Over60AmountData_xpath));

			String actual = collateralNameWebElement.getText().trim();
			actual.equals(expectedOver60Amount);
			return true;

		} catch (Exception e) {
			return false;
		}
	}

	public boolean Over90AmountData(String expectedOver90Amount) {
		try {

			WebElement collateralNameWebElement = new WebDriverWait(driver, 100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(Over90AmountData_xpath));

			String actual = collateralNameWebElement.getText().trim();
			actual.equals(expectedOver90Amount);
			return true;

		} catch (Exception e) {
			return false;
		}
	}

	public boolean Over120AmountData(String expectedOver120Amount) {
		try {

			WebElement collateralNameWebElement = new WebDriverWait(driver, 100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(Over120AmountData_xpath));

			String actual = collateralNameWebElement.getText().trim();
			actual.equals(expectedOver120Amount);
			return true;

		} catch (Exception e) {
			return false;
		}
	}

//Mukesh
public boolean  fileUploadMapping(){
	try {	
	StringSelection ss = new StringSelection("C:\\Users\\mukesh.k\\Downloads\\newARAllBuckets.xlsx");
	
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




public boolean clickchooseFileInventory(){
	
	try{
		WebElement clickchooseFileWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(chooseFileInventory_xpath));
		clickchooseFileWebEelement.isDisplayed();
		clickchooseFileWebEelement.click();
		Thread.sleep(5000);
		return true;
	}
	catch(Exception ex){
		return false;
	}
	}

	public boolean BalanceAmountData(String expectedBalanceAmount) {
		try {
			WebElement collateralNameWebElement = new WebDriverWait(driver, 100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(BalanceAmountData_xpath));

			String actual = collateralNameWebElement.getText().trim();
			actual.equals(expectedBalanceAmount);
			return true;

		} catch (Exception e) {
			return false;
		}
	}

	public boolean ClickOnNotification() {

		try {

			WebElement clickchooseFileWebEelement = new WebDriverWait(driver,
					10).until(ExpectedConditions
					.visibilityOfElementLocated(notificationClick_xpath));
			clickchooseFileWebEelement.click();
			Thread.sleep(5000);
			return true;
		} catch (Exception ex) {
			return false;
		}


	}
	

	public boolean NotificationProcessFileData() {
		try {

			WebElement sucessSignatureandApproveBBCWebEelement = new WebDriverWait(
					driver, 30)
					.until(ExpectedConditions
							.visibilityOfElementLocated(NotificationProcessFileData_xpath));
			sucessSignatureandApproveBBCWebEelement.isDisplayed();
			return true;
		} catch (Exception ex) {
			return false;
		}
	}

	public SummaryReceivablesPage clickOntheFileNavigateToSummaryReceivableScreen() {
		try {
			WebElement netBorrowingBaseWebEelement = new WebDriverWait(driver,
					30).until(ExpectedConditions
					.visibilityOfElementLocated(HyperLinkFileNavigate_xpath));
			netBorrowingBaseWebEelement.click();
			return new SummaryReceivablesPage(driver);
		} catch (Exception ex) {

		}
		return null;
	}

	public MappingListViewPage clickOnCollateralNameToNavgateMappingScreen() {
		try {
			WebElement netBorrowingBaseWebEelement = new WebDriverWait(driver,
					30).until(ExpectedConditions
					.visibilityOfElementLocated(collateralNameData_xpath));
			netBorrowingBaseWebEelement.click();

		} catch (Exception ex) {

		}
		return null;
	}

	public void fileupload(String filepath) {

		driver.findElement(
				By.xpath("(//*[@class='ui-sortable-column-icon fa fa-fw fa-sort ng-star-inserted']/..//input)[10]"))
				.click();

		By uploadFile_xpath = By
				.xpath("(//button[@class='btn ng-star-inserted'])[1]/../input");
		WebElement fileInput = new WebDriverWait(driver, 10)
				.until(ExpectedConditions
						.visibilityOfElementLocated(uploadFile_xpath));
		// WebElement fileInput =
		// driver.findElement(By.xpath(chooseFile_xpath));
		// fileInput.click();
		// String file=System.getProperty(filepath);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		fileInput.sendKeys(filepath);
		// fileInput.click();
	}

	public  void fileUPload(String FilePath) {
		try {

			WebElement El = driver.findElement(ChooseFile1_xpath);
			((RemoteWebElement) El).setFileDetector(new LocalFileDetector());
			El.sendKeys(FilePath);
			Thread.sleep(500);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}

	public boolean fileUPloadData_mapping(String FilePath) {
		try {
			StringSelection ss = new StringSelection(FilePath);
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
			// TODO: handle exception
		}
		return false;

	}

	public boolean clickchooseFilePayble() {

		try {
			WebElement clickchooseFileWebEelement = new WebDriverWait(driver,
					10).until(ExpectedConditions
					.visibilityOfElementLocated(chooseFilePayble_xpath));
			clickchooseFileWebEelement.isDisplayed();
			clickchooseFileWebEelement.click();
			Thread.sleep(5000);
			return true;
		} catch (Exception ex) {
			return false;
		}

	}


	public boolean clickchooseFileReceivable() {

		try {
			WebElement clickchooseFileWebEelement = new WebDriverWait(driver,
					10).until(ExpectedConditions
					.visibilityOfElementLocated(chooseFileReceivable_xpath));
			clickchooseFileWebEelement.isDisplayed();
			clickchooseFileWebEelement.click();
			Thread.sleep(5000);
			return true;
		} catch (Exception ex) {
			return false;
		}


	}

	public boolean clickchooseFileReceivable1() {

		try {
			WebElement clickchooseFileWebEelement = new WebDriverWait(driver,
					10).until(ExpectedConditions
					.visibilityOfElementLocated(chooseFileReceivable1_xpath));
			clickchooseFileWebEelement.isDisplayed();
			clickchooseFileWebEelement.click();
			Thread.sleep(500);
			return true;
		} catch (Exception ex) {
			return false;
		}

	}

	public boolean selectDataFileTypeAsReceivable() {

		try {
			WebElement WebEelement = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(selectDataFileTypeAsReceivable_xpath));
			WebEelement.click();
			Thread.sleep(2000);
			return true;
		} catch (Exception ex) {
			return false;
		}

	}

	
	//rohit
	
	public boolean clickFileHyperLinkAndVerfiySummaryReceivableSingleDiv11(){
		try{
	
	WebElement actual = new WebDriverWait(driver, 200)

	.until(ExpectedConditions
			.visibilityOfElementLocated(summaryReceivables1_xpath));


	actual.isDisplayed();
	return true;
	}catch(Exception e){
	return false;	
	}
	}
	
	
	public boolean clickFileHyperLinkAndVerfiySummaryReceivableSingleDiv()

	{

		try {

			WebElement WebEelement = new WebDriverWait(driver, 10)

					.until(ExpectedConditions
							.visibilityOfElementLocated(clickFileHyperLinksummarySingleDiv_xpath));

			WebEelement.click();

			// Thread.sleep(2000);

			Set<String> handles = driver.getWindowHandles();

			Iterator<String> it = handles.iterator();

			// iterate through your windows

			while (it.hasNext()) {

				String parent = it.next();

				String newwin = it.next();

				driver.switchTo().window(newwin);

				// perform actions on new window

				WebElement actual = new WebDriverWait(driver, 200)

				.until(ExpectedConditions
						.visibilityOfElementLocated(summaryReceivables1_xpath));

				actual.isDisplayed();

				driver.switchTo().window(newwin).close();

				driver.close();

				driver.switchTo().window(parent);

				return true;
			}
		} catch (Exception ex) {
		}
		return false;
	}

	public boolean selectDataFileTypeAsAssetInventorySummaryYes() {

		try {

			WebElement WebEelement = new WebDriverWait(driver, 10)

					.until(ExpectedConditions
							.visibilityOfElementLocated(clickFileHyperLinkForAssetinventorySum_xpath));

			WebEelement.click();

			Thread.sleep(1000);

			return true;
		}

		catch (Exception ex) {

			return false;
		}
	}

	public boolean clickFileHyperLinkAndVerfiyInventorySummarySIngleDiv()

	{

		try {

			WebElement WebEelement = new WebDriverWait(driver, 10)

					.until(ExpectedConditions
							.visibilityOfElementLocated(clickFileHyperLinkForAssetSummarySingleDiv_xpath));

			WebEelement.click();

			Set<String> handles = driver.getWindowHandles();

			Iterator<String> it = handles.iterator();

			while (it.hasNext()) {

				String parent = it.next();

				String newwin = it.next();

				driver.switchTo().window(newwin);

				// perform actions on new window

				WebElement actual = new WebDriverWait(driver, 200).until(ExpectedConditions.visibilityOfElementLocated(clickFileHyperLinkForAssetinventorySum_xpath));
				actual.isDisplayed();

				driver.close();

				driver.switchTo().window(parent);

				return true;

			}
		} catch (Exception ex) {

		}
		return false;


	}



	public boolean selectDataFileTypeAsReceivableSummaryYes() {

		try {

			WebElement WebEelement = new WebDriverWait(driver, 10)

					.until(ExpectedConditions
							.visibilityOfElementLocated(clickFileHyperLinkForreceivablesSum_xpath));

			WebEelement.click();

			Thread.sleep(1000);


			return true;
		} catch (Exception ex) {
			return false;
		}
	}



	public boolean clickFileHyperLinkAndVerfiySummaryReceivableSingleDiv1()
	{


		try {

			WebElement WebEelement = new WebDriverWait(driver, 10)

					.until(ExpectedConditions
							.visibilityOfElementLocated(clickFileHyperLinksummarySingleDiv1_xpath));

			WebEelement.click();

			// Thread.sleep(2000);

			Set<String> handles = driver.getWindowHandles();

			Iterator<String> it = handles.iterator();

			// iterate through your windows

			while (it.hasNext()) {

				String parent = it.next();

				String newwin = it.next();

				driver.switchTo().window(newwin);

				// perform actions on new window

				WebElement actual = new WebDriverWait(driver, 200)

				.until(ExpectedConditions
						.visibilityOfElementLocated(summaryReceivables1_xpath));

				actual.isDisplayed();

				driver.close();

				driver.switchTo().window(parent);

				return true;

			}
		}

		catch (Exception ex) {
			return false;
		}
		return false;
		
		
	}

	public boolean clickFileHyperLinkAndVerfiyInventorySummarySIngleDiv1() {
		try {

			WebElement WebEelement = new WebDriverWait(driver, 10)


					.until(ExpectedConditions
							.visibilityOfElementLocated(clickFileHyperLinkForAssetSummarySingleDiv_xpath));

			WebEelement.click();

			// Thread.sleep(2000);

			Set<String> handles = driver.getWindowHandles();

			Iterator<String> it = handles.iterator();

			// iterate through your windows

			while (it.hasNext()) {

				String parent = it.next();

				String newwin = it.next();

				driver.switchTo().window(newwin);

				// perform actions on new window

				WebElement actual = new WebDriverWait(driver, 200)

				.until(ExpectedConditions
						.visibilityOfElementLocated(assetInventory_xpath));

				actual.isDisplayed();
				driver.close();
				driver.switchTo().window(parent);

				return true;

			}
		}

		catch (Exception ex) {

		}
		return false;
	}

	public boolean VerifyDataFileTypeAsAssetMappingView() {

		try {

			WebElement WebEelement = new WebDriverWait(driver, 10)

					.until(ExpectedConditions
							.visibilityOfElementLocated(selectDataFileTypeAsAsset_xpath));


			WebEelement.click();
			return true;
	    }
	//}
	catch(Exception ex){
		return false;	
	}
		
	}

public boolean clickFileHyperLinkAndVerfiyInventory()
{
try{
    WebElement WebEelement=new WebDriverWait(driver,10)
	.until(ExpectedConditions.visibilityOfElementLocated(clickFileHyperLink_xpath));
	WebEelement.click();
	Thread.sleep(2000);
 Set <String> handles =driver.getWindowHandles();
	Iterator<String> it = handles.iterator();
	//iterate through your windows
	while (it.hasNext()){
	String parent = it.next();
	String newwin = it.next();
	driver.switchTo().window(newwin);
	//perform actions on new window

	WebElement actual=new WebDriverWait(driver,10)
	.until(ExpectedConditions.visibilityOfElementLocated(assetInventory_xpath));
	actual.isDisplayed();
	
	driver.close();
	driver.switchTo().window(parent);
	
	return true;
    }}
//}
catch(Exception ex){
	
}
return false;
	
}

public boolean clickFileHyperLinkAndVerfiyDetailReceivbale()
{
try{
    WebElement WebEelement=new WebDriverWait(driver,10)
	.until(ExpectedConditions.visibilityOfElementLocated(clickFileHyperLink_xpath));
	WebEelement.click();
	Thread.sleep(500);
	
	Thread.sleep(500);
	Set <String> handles =driver.getWindowHandles();
	Iterator<String> it = handles.iterator();
	//iterate through your windows
	while (it.hasNext()){
	String parent = it.next();
	String newwin = it.next();
	driver.switchTo().window(newwin);	
	//perform actions on new window
	WebElement actual=new WebDriverWait(driver,200)
	.until(ExpectedConditions.visibilityOfElementLocated(detailReceivables1_xpath));
	actual.isDisplayed();
	driver.close();
	driver.switchTo().window(parent);
	
return true;


			

			// Thread.sleep(5000);
			
		}}
	catch (Exception ex) {
			return false;
		}
return false;
	}


	public boolean VerifyDataFileTypeAsReceivableMappingView() {

		try {

			WebElement WebEelement = new WebDriverWait(driver, 10)

					.until(ExpectedConditions
							.visibilityOfElementLocated(VerifyMappingReceivables_xpath));
			WebEelement.isDisplayed();

			return true;
		} catch (Exception ex) {
			return false;
		}
	}
public boolean clickFileHyperLinkAndVerfiyDetailPaybles()
{
try{
    WebElement WebEelement=new WebDriverWait(driver,10)
	.until(ExpectedConditions.visibilityOfElementLocated(clickFileHyperLink_xpath));
	WebEelement.click();
	Thread.sleep(2000);
   Set <String> handles =driver.getWindowHandles();
	Iterator<String> it = handles.iterator();
	//iterate through your windows
   while (it.hasNext()){
	String parent = it.next();
   String newwin = it.next();
	driver.switchTo().window(newwin);
	//perform actions on new window
	
	
	WebElement actual=new WebDriverWait(driver,10)
	.until(ExpectedConditions.visibilityOfElementLocated(DetailPaybles_xpath));
	actual.isDisplayed();
	driver.close();
	driver.switchTo().window(parent);
	return true;

}}
catch(Exception ex){
}
return false;
}


//rohit
public boolean clickchooseFileAssetInventory(){
	
	try{
		WebElement clickchooseFileWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(ChooseFileForInventory_xpath));
		clickchooseFileWebEelement.isDisplayed();
		clickchooseFileWebEelement.click();
		Thread.sleep(5000);
		return true;
	}
	catch(Exception ex){
		return false;
	}

	}

	public boolean verifyMappingScreen() {

		try {
			Thread.sleep(5000);
			WebElement WebEelement = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(verifyMappingScreen_xpath));
			WebEelement.isDisplayed();
			return true;
		} catch (Exception ex) {
			return false;
		}

	}

	public boolean selectDataFileTypeAsInventory() {

		try {
			WebElement WebEelement = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(selectDataFileTypeAsInventory_xpath));
			WebEelement.click();
			Thread.sleep(2000);
			return true;
		} catch (Exception ex) {
			return false;
		}

	}

	public boolean selectDataFileTypeAsPaybles() {

		try {
			WebElement WebEelement = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(selectDataFileTypeAsPaybles_xpath));
			WebEelement.click();
			Thread.sleep(2000);
			return true;
		} catch (Exception ex) {
			return false;
		}

	}

	public boolean clickFileHyperLinkAndVerfiyPayblesSummarySingleDiv()

	{

		try {

			WebElement WebEelement = new WebDriverWait(driver, 10)

					.until(ExpectedConditions
							.visibilityOfElementLocated(clickFileHyperLinkSummarySingleDivPay_xpath));

			WebEelement.click();

			// Thread.sleep(2000);

			Set<String> handles = driver.getWindowHandles();

			Iterator<String> it = handles.iterator();

			// iterate through your windows

			while (it.hasNext()) {

				String parent = it.next();

				String newwin = it.next();

				driver.switchTo().window(newwin);

				// perform actions on new window
				WebElement actual = new WebDriverWait(driver, 200)
						.until(ExpectedConditions
								.visibilityOfElementLocated(Payables_xpath));

				actual.isDisplayed();

				driver.close();

				driver.switchTo().window(parent);

				return true;

			}
		}

		catch (Exception ex) {

		}
		return false;
	}

	public boolean selectDataFileTypeAsPayablesSummaryYesSingleDiv() {

		try {

			WebElement WebEelement = new WebDriverWait(driver, 10)

					.until(ExpectedConditions
							.visibilityOfElementLocated(clickFileHyperLinkForPayablesSum_xpath));

			WebEelement.click();

			Thread.sleep(1000);

			return true;
		} catch (Exception ex) {
			return false;
		}
	}

	public boolean clickFileHyperLink8() {

		try {
			WebElement WebEelement = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(clickFileHyperLink_xpath));
			WebEelement.click();
			Thread.sleep(8000);
			return true;

		} catch (Exception ex) {

		}
		return false;

	}

	public SummaryReceivablesPage clickFileHyperLink() {

		try {
			WebElement WebEelement = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(clickFileHyperLink_xpath));
			WebEelement.click();
			Thread.sleep(8000);
			return new SummaryReceivablesPage(driver);

		} catch (Exception ex) {

		}
		return null;
	}

	public boolean SummaryReceivablesHeader() {
		try {
			WebElement SalesRegionFieldValidationWebEelement = new WebDriverWait(
					driver, 10).until(ExpectedConditions
					.visibilityOfElementLocated(summaryReceivables_xpath));
			SalesRegionFieldValidationWebEelement.isDisplayed();
			return true;
		} catch (Exception ex) {
			return false;
		}

	}

	public boolean SummaryReceivablesHeader1() {
		try {
			WebElement actual = new WebDriverWait(driver, 200)
					.until(ExpectedConditions
							.visibilityOfElementLocated(summaryReceivables1_xpath));
			actual.isDisplayed();
			/*
			 * actual.getText().trim(); if (actual.equals(expected)) return
			 * true; else return false;
			 */return true;
		} catch (Exception e) {

		}
		return false;
	}

	public boolean clickFileHyperLinkAndVerfiySummaryReceivable() {
		try {
			WebElement WebEelement = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(clickFileHyperLink_xpath));
			WebEelement.click();
			Thread.sleep(2000);
			Set<String> handles = driver.getWindowHandles();
			Iterator<String> it = handles.iterator();
			// iterate through your windows
			while (it.hasNext()) {
				String parent = it.next();
				String newwin = it.next();
				driver.switchTo().window(newwin);
				// perform actions on new window

				WebElement actual = new WebDriverWait(driver, 200)
						.until(ExpectedConditions
								.visibilityOfElementLocated(summaryReceivables1_xpath));
				actual.isDisplayed();
				return true;

			}
		} catch (Exception ex) {

		}

		return false;
	}

		public boolean clickFileHyperLinkAndVerfiyPaybles() {
		try {
			WebElement WebEelement = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(clickFileHyperLink_xpath));
			WebEelement.click();
			Thread.sleep(2000);
			Set<String> handles = driver.getWindowHandles();
			Iterator<String> it = handles.iterator();
			// iterate through your windows
			while (it.hasNext()) {
				String parent = it.next();
				String newwin = it.next();
				driver.switchTo().window(newwin);
				// perform actions on new window

				WebElement actual = new WebDriverWait(driver, 200)
						.until(ExpectedConditions
								.visibilityOfElementLocated(Payables_xpath));
				actual.isDisplayed();
				return true;

			}
		} catch (Exception ex) {

		}

		return false;
	}

	
	
	// rohit
	public void fileUPload_AssetInventory(String FilePath) {

       fileupload(FilePath, ChooseFile1_xpath);

	}

	

	// rohit
	public void fileUPload_AssetInventory1DIV1(String FilePath) {

		fileupload(FilePath, ChooseFile2_xpath);

	}

	public boolean clickchooseFileAssetInventory1DIV1() {

		try {
			WebElement clickchooseFileWebEelement = new WebDriverWait(driver,
					10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(ChooseFileForInventory1DIV1_xpath));
			clickchooseFileWebEelement.isDisplayed();
			clickchooseFileWebEelement.click();
			Thread.sleep(5000);
			return true;
		} catch (Exception ex) {
			return false;
		}

	}

	// rohit
	public void fileUPload_AssetInventory2(String FilePath) {

		// fileupload(FilePath, ChooseFileForInventory2_xpath);

		fileupload(FilePath, ChooseFile3_xpath);

	}

	public boolean clickchooseFileAssetInventory2() {

		try {
			WebElement clickchooseFileWebEelement = new WebDriverWait(driver,
					10).until(ExpectedConditions
					.visibilityOfElementLocated(ChooseFileForInventory2_xpath));
			clickchooseFileWebEelement.isDisplayed();
			clickchooseFileWebEelement.click();
			Thread.sleep(5000);
			return true;
		} catch (Exception ex) {
			return false;
		}

	}

	// rohit
	public void fileUPload_AssetInventory2DIV2(String FilePath) {

		// fileupload(FilePath, ChooseFileForInventory2DIV2_xpath);
		fileupload(FilePath, ChooseFile4_xpath);

	}

	public boolean clickchooseFileAssetInventory2DIV2() {

		try {
			WebElement clickchooseFileWebEelement = new WebDriverWait(driver,
					10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(ChooseFileForInventory2DIV2_xpath));
			clickchooseFileWebEelement.isDisplayed();
			clickchooseFileWebEelement.click();
			Thread.sleep(5000);
			return true;
		} catch (Exception ex) {
			return false;
		}

	}

	// rohit
	public void fileUPload_Payables1(String FilePath) {

		// fileupload(FilePath, ChooseFileForPayables_xpath);

		fileupload(FilePath, ChooseFile1_xpath);

	}

	public boolean clickchooseFilePayables1() {

		try {
			WebElement clickchooseFileWebEelement = new WebDriverWait(driver,
					10).until(ExpectedConditions
					.visibilityOfElementLocated(ChooseFileForPayables_xpath));
			clickchooseFileWebEelement.isDisplayed();
			clickchooseFileWebEelement.click();
			Thread.sleep(5000);
			return true;
		} catch (Exception ex) {
			return false;
		}

	}

	//rohit
	public void fileUPload_Payables1DIV1(String FilePath){
		fileupload(FilePath, ChooseFileForPayables1DIV1_xpath);
	}

	
	public boolean inputReceivales(String Data){
    try{
	this.isAlertPresent();
	WebElement BBCDateWebElement = new WebDriverWait(driver, 20)
	.until(ExpectedConditions.visibilityOfElementLocated(enterFileName_xapth));
	BBCDateWebElement.clear();
	BBCDateWebElement.sendKeys(Data);
	List<WebElement> ele = driver.findElements(ablFileUploadData_xpath);
	while(ele.size()!=4){
		
		ele = driver.findElements(ablFileUploadData_xpath);
		System.out.println("no of element"+ele.size());
		
		System.out.println("loop start");
		if(ele.size()==4){
			System.out.println("loop break");
        break;
		}
	}
    this.isAlertPresent();
    Thread.sleep(4000);
    return true;
    }catch(Exception e){
	  return false;
  }
}
	
public boolean SearchForReceivables(String Data){
	try {
		this.isAlertPresent();
		Thread.sleep(1000);
		WebElement BBCDateWebElement = new WebDriverWait(driver, 20)
		.until(ExpectedConditions.visibilityOfElementLocated(DataReviews_xpath));
		
		BBCDateWebElement.clear();
		BBCDateWebElement.sendKeys(Data);
		BBCDateWebElement.sendKeys(Keys.ESCAPE);
		Thread.sleep(1000);
	    this.isAlertPresent();
		Thread.sleep(1000);

		return true;

	} catch (Exception e) {
		return false;
	}

}

public boolean SearchForReceivables1(String Data){
	try {
		this.isAlertPresent();
		WebElement BBCDateWebElement = new WebDriverWait(driver, 20)
		.until(ExpectedConditions.visibilityOfElementLocated(DataReviews_xpath));
		
		BBCDateWebElement.clear();
		BBCDateWebElement.sendKeys(Data);
		BBCDateWebElement.sendKeys(Keys.ESCAPE);
	    this.isAlertPresent();
		return true;

	} catch (Exception e) {
		return false;
	}

}

	public boolean clickchooseFilePayables1DIV1() {

		try {
			WebElement clickchooseFileWebEelement = new WebDriverWait(driver,
					10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(ChooseFileForPayables1DIV1_xpath));
			clickchooseFileWebEelement.isDisplayed();
			clickchooseFileWebEelement.click();
			Thread.sleep(5000);
			return true;
		} catch (Exception ex) {
			return false;
		}

	}

	// rohit
	public void fileUPload_Payables2(String FilePath) {

		// fileupload(FilePath, ChooseFileForPayables2_xpath);
		fileupload(FilePath, ChooseFile3_xpath);
}
public boolean ClickOnReceivablesExpandLink(){
	
	try{
		Thread.sleep(1000);
		WebElement WebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(ReceivablesExpandLink_xpath));
		WebEelement.click();
		Thread.sleep(1000);
		return true;
	}
	catch(Exception ex){
		return false;
	}
}

	public boolean clickchooseFilePayables2() {

		try {
			WebElement clickchooseFileWebEelement = new WebDriverWait(driver,
					10).until(ExpectedConditions
					.visibilityOfElementLocated(ChooseFileForPayables2_xpath));
			clickchooseFileWebEelement.isDisplayed();
			clickchooseFileWebEelement.click();
			Thread.sleep(5000);
			return true;
		} catch (Exception ex) {
			return false;
		}

	}

	// rohit
	public void fileUPload_Payables2DIV2(String FilePath) {

		// fileupload(FilePath, ChooseFileForPayables2DIV2_xpath);

		fileupload(FilePath, ChooseFile4_xpath);

	}

	public boolean clickchooseFilePayables2DIV2() {

		try {
			WebElement clickchooseFileWebEelement = new WebDriverWait(driver,
					10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(ChooseFileForPayables2DIV2_xpath));
			clickchooseFileWebEelement.isDisplayed();
			clickchooseFileWebEelement.click();
			Thread.sleep(5000);
			return true;
		} catch (Exception ex) {
			return false;
		}

	}

	public boolean clickchooseFileReceivables1(){
		
		try{
			//BasePage.scrollIntoView(ChooseFileForReceivables_xpath);
//			JavascriptExecutor jse = (JavascriptExecutor) driver;
//			jse.executeScript("window.scrollBy(1000,0)", "");
			Thread.sleep(3000);
			WebElement clickchooseFileWebEelement=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(ChooseFileForReceivables_xpath));
			clickchooseFileWebEelement.isDisplayed();
			clickchooseFileWebEelement.click();
			Thread.sleep(3000);
			return true;
		}
		catch(Exception ex){
			return false;
		}

		}
public boolean ClickOnAssetInventoryExpandLink(){
	
	try{
		Thread.sleep(1000);
		WebElement WebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(ReceivablesExpandLink_xpath));
		WebEelement.click();
		Thread.sleep(1000);
		return true;
	}
	catch(Exception ex){
		return false;
	}

	}

public boolean ClickOnPayablesExpandLink(){
	
	try{
		WebElement WebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(PayablesExpandLink_xpath));
		WebEelement.click();
		Thread.sleep(1000);
		return true;
	}
	catch(Exception ex){
		return false;
	}

	}
public boolean ClickOnReceivablesHyperLinkUnderCollateralType()
{
try{
    WebElement WebEelement=new WebDriverWait(driver,10)
	.until(ExpectedConditions.visibilityOfElementLocated(ReceivablesHyperLinkUnderCollateralType));
	WebEelement.click();
	Thread.sleep(1000);
//	Set <String> handles =driver.getWindowHandles();
//	Iterator<String> it = handles.iterator();
//	//iterate through your windows
//	while (it.hasNext()){
//	String parent = it.next();
//	String newwin = it.next();
//	driver.switchTo().window(newwin);
//	//perform actions on new window
	
	String parentWindow = driver.getWindowHandle();

	//Set<String> childWindow;
	for(String childWindow1:driver.getWindowHandles())
	{
	if(!childWindow1.equals(parentWindow)){
	    driver.switchTo().window(childWindow1);
	}
	}

	WebElement actual=new WebDriverWait(driver,10)
	.until(ExpectedConditions.visibilityOfElementLocated(MappingFirstPage_xpath));
	actual.isDisplayed();
	return true;

}//}
catch(Exception ex){
		
}
return false;

}

	

	public void fileUPload_mapping(String FilePath) {

		
		fileupload(FilePath, ChooseFile2_xpath);
		
	}
	
	// rohit
 public void fileUPload_mapping1(String FilePath) {		
		fileupload(FilePath, ChooseFile2_xpath);
		
	}
	

	public boolean clickchooseFileReceivables1DIV1() {

		try {

			// scrollIntoView(ChooseFileForReceivables1DIV1_xpath);
			WebElement clickchooseFileWebEelement = new WebDriverWait(driver,
					10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(ChooseFileForReceivables1DIV1_xpath));
			clickchooseFileWebEelement.isDisplayed();
			clickchooseFileWebEelement.click();
			Thread.sleep(3000);
			return true;
		} catch (Exception ex) {
			return false;
		}

	}

	// rohit
	public void fileUPload_Receivables2(String FilePath) {
		fileupload(FilePath, ChooseFile3_xpath);

	}

	public boolean clickchooseFileReceivables2() {

		try {
			WebElement clickchooseFileWebEelement = new WebDriverWait(driver,
					10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(ChooseFileForReceivables2_xpath));
			clickchooseFileWebEelement.isDisplayed();
			clickchooseFileWebEelement.click();
			Thread.sleep(5000);
			return true;
		} catch (Exception ex) {
			return false;
		}

	}

	// rohit
	public void fileUPload_Receivables2DIV2(String FilePath) {
		fileupload(FilePath, ChooseFile4_xpath);

	}

	public boolean clickchooseFileReceivables2DIV2() {

		try {
			WebElement clickchooseFileWebEelement = new WebDriverWait(driver,
					10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(ChooseFileForReceivables2DIV2_xpath));
			clickchooseFileWebEelement.isDisplayed();
			clickchooseFileWebEelement.click();
			Thread.sleep(5000);
			return true;
		} catch (Exception ex) {
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
	public boolean verifyDivisionDropDown()
	{
		try{ WebElement clickOnsavebutton=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated( DivisionDropDown_xpath));
		 clickOnsavebutton.isDisplayed();
		
		 return true;
	}
	catch(Exception e)
	{
		 return false;
	}
	}
public boolean verifyDataTypeSearch()
{
	try{ WebElement clickOnsavebutton=new WebDriverWait(driver,10)
	.until(ExpectedConditions.visibilityOfElementLocated( DatafileType_xpath));
	 clickOnsavebutton.isDisplayed();
	
	 return true;
}
catch(Exception e)
{
	 return false;
}
}


public boolean verifyMappingNAmeSearch()
{
	try{ WebElement clickOnsavebutton=new WebDriverWait(driver,10)
	.until(ExpectedConditions.visibilityOfElementLocated( MappingName_xpath));
	 clickOnsavebutton.isDisplayed();
	
	 return true;
}
catch(Exception e)
{
	 return false;
}
}
//Method to file uploads 
public boolean verifyFIleuploadsSearch()
{
	try{ WebElement clickOnsavebutton=new WebDriverWait(driver,10)
	.until(ExpectedConditions.visibilityOfElementLocated( fileuplods_xpath));
	 clickOnsavebutton.isDisplayed();
	
	 return true;
}
catch(Exception e)
{
	 return false;
}
}

//Method to verify total expected value search
public boolean verifyTotalExpextedValueSearch()
{
	try{ WebElement clickOnsavebutton=new WebDriverWait(driver,10)
	.until(ExpectedConditions.visibilityOfElementLocated( TotalExpectedValue_xpath));

	 clickOnsavebutton.isDisplayed();
	
	 return true;
}
catch(Exception e)
{
	 return false;
}
}
	public boolean verifyUploadValueSearch()
	{
		try{ WebElement clickOnsavebutton=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated( uploadvalue_xpath));

		 clickOnsavebutton.isDisplayed();
		
		 return true;
	}
	catch(Exception e)
	{
		 return false;
	}
	}
	public boolean ClickOnAssetInventorHyperLinkUnderCollateralType() {
		try {
			WebElement WebEelement = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(AssetInventoryHyperLinkUnderCollateralType));
			WebEelement.click();
			Thread.sleep(2000);
			// Set <String> handles =driver.getWindowHandles();
			// Iterator<String> it = handles.iterator();
			// //iterate through your windows
			// while (it.hasNext()){
			// String parent = it.next();
			// String newwin = it.next();
			// driver.switchTo().window(newwin);
			// perform actions on new window
			String parentWindow = driver.getWindowHandle();

			// Set<String> childWindow;
			for (String childWindow1 : driver.getWindowHandles()) {
				if (!childWindow1.equals(parentWindow)) {
					driver.switchTo().window(childWindow1);
				}
			}

			WebElement actual = new WebDriverWait(driver, 200)
					.until(ExpectedConditions
							.visibilityOfElementLocated(MappingFirstPage_xpath));
			actual.isDisplayed();
			return true;
		}// }
		catch (Exception ex) {
		}
		return false;
	}

	public boolean ClickOnPayablesHyperLinkUnderCollateralType() {
		try {
			WebElement WebEelement = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(PayablesHyperLinkUnderCollateralType));
			WebEelement.click();
			Thread.sleep(2000);
			// Set <String> handles =driver.getWindowHandles();
			// Iterator<String> it = handles.iterator();
			// //iterate through your windows
			// while (it.hasNext()){
			// String parent = it.next();
			// String newwin = it.next();
			// driver.switchTo().window(newwin);
			// //perform actions on new window

			String parentWindow = driver.getWindowHandle();

			// Set<String> childWindow;
			for (String childWindow1 : driver.getWindowHandles()) {
				if (!childWindow1.equals(parentWindow)) {
					driver.switchTo().window(childWindow1);
				}
			}

			WebElement actual = new WebDriverWait(driver, 200)
					.until(ExpectedConditions
							.visibilityOfElementLocated(MappingFirstPage_xpath));
			actual.isDisplayed();
			return true;

		}
		// }
		catch (Exception ex) {

		}
		return false;
	}

	public boolean clickonfilename() {

		try {
			WebElement clickchooseFileWebEelement = new WebDriverWait(driver,
					10).until(ExpectedConditions
					.visibilityOfElementLocated(clickonfilename_xpath));
			clickchooseFileWebEelement.click();
			Thread.sleep(2000);
			return true;
		} catch (Exception ex) {
			return false;
		}
}
public boolean verifyDueDateSearch()
{
	try{ WebElement clickOnsavebutton=new WebDriverWait(driver,10)
	.until(ExpectedConditions.visibilityOfElementLocated( DueDates_xpath));
	 clickOnsavebutton.isDisplayed();
	
	 return true;
}
catch(Exception e)
{
	 return false;
}
}
//Method to verify expected value Search

	public boolean clickonclose() {
		try {
			WebElement clickchooseFileWebEelement = new WebDriverWait(driver,
					10).until(ExpectedConditions
					.visibilityOfElementLocated(clickonclose_xpath));
			clickchooseFileWebEelement.click();
			Thread.sleep(1000);
			return true;
		} catch (Exception ex) {
			return false;
		}
		
	}
public boolean verifyExpextedValueSearch()
{
	try{ WebElement clickOnsavebutton=new WebDriverWait(driver,10)
	.until(ExpectedConditions.visibilityOfElementLocated( ExpectedValue_xpath));
	 clickOnsavebutton.isDisplayed();
	
	 return true;
}
catch(Exception e)
{
	 return false;
}
}

public boolean clickFileHyperLinkAndVerfiyPayblesSummarySingleDiv1()
{
try{
    WebElement WebEelement=new WebDriverWait(driver,10)
	.until(ExpectedConditions.visibilityOfElementLocated(clickFileHyperLinkSummarySingleDivPay1_xpath));
	WebEelement.click();
	//Thread.sleep(2000);
	Set <String> handles =driver.getWindowHandles();
	Iterator<String> it = handles.iterator();
	//iterate through your windows
	while (it.hasNext()){
	String parent = it.next();
	String newwin = it.next();
	driver.switchTo().window(newwin);
	//perform actions on new window
	
	WebElement actual=new WebDriverWait(driver,200)
	.until(ExpectedConditions.visibilityOfElementLocated(Payables_xpath));
	actual.isDisplayed();
	driver.switchTo().window(newwin).close();
	driver.switchTo().window(parent);
	return true;
}}
catch(Exception ex){
	
}
return false;
}
public boolean clickonyesbutton() {
		try {
			WebElement clickchooseFileWebEelement = new WebDriverWait(driver,
					10).until(ExpectedConditions
					.visibilityOfElementLocated(clickonyesbtn_xpath));
			clickchooseFileWebEelement.click();
			Thread.sleep(1000);
			return true;
		} catch (Exception ex) {
			return false;
		}

	}
public String verifydeletefileMessage(String expectedSucessMessage){
	try {
		WebElement dueDateWebElement = new WebDriverWait(
				driver, 100)
				.until(ExpectedConditions
						.visibilityOfElementLocated(verifydeletefilemsg_xpath));
		
		String actual = dueDateWebElement.getText().trim();
		actual.equals(expectedSucessMessage);
			
		
	} catch (Exception e) {
	
	}
	return expectedSucessMessage;
}
			//Method to Verify Choose file

			public boolean verifyChooseFile()
			{
				try{ WebElement clickOnsavebutton=new WebDriverWait(driver,10)
				.until(ExpectedConditions.visibilityOfElementLocated(ChooseFile_xpath));

				 clickOnsavebutton.isDisplayed();
				
				 return true;
			}
			catch(Exception e)
			{
				 return false;
			}
			}

	// Method to verify uploads bbc file

	public boolean verifyuploadsbbcfile() {
		try {
			WebElement clickOnsavebutton = new WebDriverWait(driver, 30)
					.until(ExpectedConditions
							.visibilityOfElementLocated(uploadbbcdatafile_xpath));
			clickOnsavebutton.isDisplayed();

			return true;
		} catch (Exception e) {
			return false;
		}
	}

public boolean verifyBorrowerSearch()
{
	try{ WebElement clickOnsavebutton=new WebDriverWait(driver,10)
	.until(ExpectedConditions.visibilityOfElementLocated( Borrower_xpath));
	 clickOnsavebutton.isDisplayed();
	
	 return true;
}
catch(Exception e)
{
	 return false;
}
}
//Verify header
	public boolean verifyuploadotherrequireddocounment() {
		try {
			WebElement clickOnsavebutton = new WebDriverWait(driver, 30)
					.until(ExpectedConditions
							.visibilityOfElementLocated(uploadotherrequireddocounment_xpath));
			clickOnsavebutton.isDisplayed();

			return true;
		} catch (Exception e) {
			return false;
		}
	}

	// method to verfiy Abl uploads

	public boolean verifyAblUploads() {
		try {
			WebElement clickOnsavebutton = new WebDriverWait(driver, 30)
					.until(ExpectedConditions
							.visibilityOfElementLocated(ABL_xpath));
			clickOnsavebutton.isDisplayed();

			return true;
		} catch (Exception e) {
			return false;
		}
	}

	// method to verfiy file name

	public boolean verifyFileName() {
		try {
			WebElement clickOnsavebutton = new WebDriverWait(driver, 30)
					.until(ExpectedConditions
							.visibilityOfElementLocated(FileNAme_xpath));
			clickOnsavebutton.isDisplayed();

			return true;
		} catch (Exception e) {
			return false;
		}
	}

	// Method to verify upload files

	public boolean verifyuploadfile() {
		try {
			WebElement clickOnsavebutton = new WebDriverWait(driver, 30)
					.until(ExpectedConditions
							.visibilityOfElementLocated(Uploadtype_xpath));
			clickOnsavebutton.isDisplayed();

			return true;
		} catch (Exception e) {
			return false;
		}
	}

	// Method to display Brerad crum

	public boolean verifyBreradCrum() {
		try {
			WebElement clickOnsavebutton = new WebDriverWait(driver, 30)
					.until(ExpectedConditions
							.visibilityOfElementLocated(Breadcrum_xpath));
			clickOnsavebutton.isDisplayed();

			return true;
		} catch (Exception e) {
			return false;
		}
	}

	// Method to verify search

	public boolean verifySearch() {
		try {
			WebElement clickOnsavebutton = new WebDriverWait(driver, 30)
					.until(ExpectedConditions
							.visibilityOfElementLocated(Search_xpath));
			clickOnsavebutton.isDisplayed();

			return true;
		} catch (Exception e) {
			return false;
		}
	}

	

	// Method to verify file uploads search

	public boolean verifyFileUploadValueSearch() {
		try {
			WebElement clickOnsavebutton = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(FileUploads_xpath));

			clickOnsavebutton.isDisplayed();

			return true;
		} catch (Exception e) {
			return false;
		}
	}

	// Method to tab on file uploads

	public boolean tabFileUploadValueSearch() {
		try {
			WebElement clickOnsavebutton = new WebDriverWait(driver, 30)
					.until(ExpectedConditions
							.visibilityOfElementLocated(FileUploads_xpath));
			clickOnsavebutton.click();
			Actions action = new Actions(driver);
			action.sendKeys(Keys.TAB).build().perform();

			return true;

		} catch (Exception e) {
			return false;

		}
	}


	// Method to verify upload

	public boolean verifyupload() {
		try {
			WebElement clickOnsavebutton = new WebDriverWait(driver, 30)
					.until(ExpectedConditions
							.visibilityOfElementLocated(Upload_xpath));

			clickOnsavebutton.isDisplayed();

			return true;
		} catch (Exception e) {
			return false;
		}
	}

	// Verify header

	// verify exchange header

	// verify exchange header

	public boolean verifyEXchangeheader() {
		try {
			WebElement clickOnsavebutton = new WebDriverWait(driver, 30)
					.until(ExpectedConditions
							.visibilityOfElementLocated(Exchangehyperlink_xpath));
			clickOnsavebutton.isDisplayed();

			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public boolean verifyinvoice() {
		try {
			WebElement clickOnsavebutton = new WebDriverWait(driver, 30)
					.until(ExpectedConditions
							.visibilityOfElementLocated(invoicno_xpath));
			clickOnsavebutton.isDisplayed();

			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public boolean verifyorderno() {
		try {
			WebElement clickOnsavebutton = new WebDriverWait(driver, 30)
					.until(ExpectedConditions
							.visibilityOfElementLocated(orderno_xpath));
			clickOnsavebutton.isDisplayed();

			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public boolean verifyorignal() {
		try {
			WebElement clickOnsavebutton = new WebDriverWait(driver, 30)
					.until(ExpectedConditions
							.visibilityOfElementLocated(orignalDate_xpath));
			clickOnsavebutton.isDisplayed();

			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public boolean verifyInvoice() {
		try {
			WebElement clickOnsavebutton = new WebDriverWait(driver, 30)
					.until(ExpectedConditions
							.visibilityOfElementLocated(invoicedays_xpath));
			clickOnsavebutton.isDisplayed();

			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public boolean verifyInvoiceanmount() {
		try {
			WebElement clickOnsavebutton = new WebDriverWait(driver, 30)
					.until(ExpectedConditions
							.visibilityOfElementLocated(Invoiceamount_xpath));
			clickOnsavebutton.isDisplayed();

			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public boolean verifycurrent() {
		try {
			WebElement clickOnsavebutton = new WebDriverWait(driver, 30)
					.until(ExpectedConditions
							.visibilityOfElementLocated(currentAmount_xpath));
			clickOnsavebutton.isDisplayed();

			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public boolean clickchooseFileReceivableFor2ndBbcForMulDIv() {

		try {
			WebElement clickchooseFileWebEelement = new WebDriverWait(driver,
					10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(ChooseFileForReceivables2ndBBCForMulDiv_xpath));
			clickchooseFileWebEelement.isDisplayed();
			clickchooseFileWebEelement.click();
			Thread.sleep(5000);
			return true;
		} catch (Exception ex) {
			return false;
		}

	}

	public boolean verifyheader() {
		try {
			WebElement clickOnsavebutton = new WebDriverWait(driver, 30)
					.until(ExpectedConditions
							.visibilityOfElementLocated(Borrower_xpath));
			clickOnsavebutton.isDisplayed();

			return true;
		} catch (Exception e) {
			return false;
		}
	}

	// verify radio button of upload bbc data file
	public boolean verifyUploadBBCdataFileRadioButton() {
		try {
			WebElement clickOnsavebutton = new WebDriverWait(driver, 30)
					.until(ExpectedConditions
							.visibilityOfElementLocated(RadioButtonOfUploadBBCdataFile_xpath));
			clickOnsavebutton.isDisplayed();

			return true;
		} catch (Exception e) {
			return false;
		}
	}

	// verify radio button of upload other requirement documents
	public boolean verifyRadioabuttonofUploadOtherRequiredDocuments() {
		try {
			WebElement clickOnsavebutton = new WebDriverWait(driver, 30)
					.until(ExpectedConditions
							.visibilityOfElementLocated(RadioButtonOfUploadOtherRequiredDocuments_xpath));
			clickOnsavebutton.isDisplayed();

			return true;
		} catch (Exception e) {
			return false;
		}
	}

	// verify auto Abl upload
	public boolean verifyAutoABLUploadRadioButton() {
		try {
			WebElement clickOnsavebutton = new WebDriverWait(driver, 30)
					.until(ExpectedConditions
							.visibilityOfElementLocated(RadioButtonOfABLAutoFileUpload_xpath));
			clickOnsavebutton.isDisplayed();

			return true;
		} catch (Exception e) {
			return false;
		}
	}

	// verify drop down division
	public boolean verifyDropDownDivision() {
		try {
			WebElement clickOnsavebutton = new WebDriverWait(driver, 30)
					.until(ExpectedConditions
							.visibilityOfElementLocated(VerifyDropDownDivision_xpath));
			clickOnsavebutton.isDisplayed();

			return true;
		} catch (Exception e) {
			return false;
		}
	}

	// verify exchange rate in screen
	public boolean verifyExchangeRateInScreen() {
		try {
			WebElement clickOnsavebutton = new WebDriverWait(driver, 30)
					.until(ExpectedConditions
							.visibilityOfElementLocated(ExchangeRateInScreen_xpath));
			clickOnsavebutton.isDisplayed();

			return true;
		} catch (Exception e) {
			return false;
		}
	}

	// verify file format
	public boolean verifyFileFormat() {
		try {
			WebElement clickOnsavebutton = new WebDriverWait(driver, 30)
					.until(ExpectedConditions
							.visibilityOfElementLocated(fileFormat_xpath));
			clickOnsavebutton.isDisplayed();

			return true;
		} catch (Exception e) {
			return false;
		}

	}

	// verify current period
	public boolean verifyCurrentPeriod() {
		try {
			WebElement clickOnsavebutton = new WebDriverWait(driver, 30)
					.until(ExpectedConditions
							.visibilityOfElementLocated(CurrentPeriod_xpath));
			clickOnsavebutton.isDisplayed();

			return true;
		} catch (Exception e) {
			return false;
		}

	}

	// verify Process file
	public boolean VerifyProcessFile() {

		try {
			WebElement clickchooseFileWebEelement = new WebDriverWait(driver,
					10).until(ExpectedConditions
					.visibilityOfElementLocated(ProcessFile_xpath));
			clickchooseFileWebEelement.isDisplayed();
			return true;
		} catch (Exception ex) {
			return false;
		}

	}

	// click on radio button of upload other required document
	public boolean ClickOnRadioabuttonofUploadOtherRequiredDocuments() {
		try {
			WebElement clickOnsavebutton = new WebDriverWait(driver, 30)
					.until(ExpectedConditions
							.visibilityOfElementLocated(RadioButtonOfUploadOtherRequiredDocuments_xpath));
			clickOnsavebutton.click();

			return true;
		} catch (Exception e) {
			return false;
		}
	}

	// verify page of upload other required document
	public boolean VerifyThePageOfOtherRequiredDocument(String Msg) {
		try {
			WebElement clickOnsavebutton = new WebDriverWait(driver, 30)
					.until(ExpectedConditions
							.visibilityOfElementLocated(UploadOtherRequiredDocumentPageMessage_xpath));
			String actual = clickOnsavebutton.getText();
			actual.equals(clickOnsavebutton);
			return true;

		} catch (Exception e) {
			return false;
		}
	}

	// verify radio button of Auto file upload
	public boolean verifyRadioabuttonofAutoFileUpload() {
		try {
			WebElement clickOnsavebutton = new WebDriverWait(driver, 30)
					.until(ExpectedConditions
							.visibilityOfElementLocated(RadioButtonOfABLAutoFileUpload_xpath));
			clickOnsavebutton.click();

			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public boolean verifyAccountno() {
		try {
			WebElement clickOnsavebutton = new WebDriverWait(driver, 30)
					.until(ExpectedConditions
							.visibilityOfElementLocated(accountnum_xpath));

			clickOnsavebutton.isDisplayed();

			return true;
		} catch (Exception e) {
			return false;
		}
	}

	// verify select Collateral drop down
	public boolean verifySelectCollateralDropDown() {
		try {
			WebElement clickOnsavebutton = new WebDriverWait(driver, 30)
					.until(ExpectedConditions
							.visibilityOfElementLocated(selectCollateralFromDropDown_xpath));
			clickOnsavebutton.isDisplayed();

			return true;
		} catch (Exception e) {
			return false;
		}
	}

	// verify click on drop down
	public boolean ClickOnSelectCollateralDropDown() {
		try {
			WebElement clickOnsavebutton = new WebDriverWait(driver, 30)
					.until(ExpectedConditions
							.visibilityOfElementLocated(selectCollateralFromDropDown_xpath));
			clickOnsavebutton.click();

			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public boolean VerifyCollateralName(String CollateralName) {

		try {
			WebElement HeaderWebEelement = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(CollateralName_xpath));
			String actualMsgFromAPP = HeaderWebEelement.getText();
			if (actualMsgFromAPP.equalsIgnoreCase(CollateralName))
				;
			{
				return true;
			}
		} catch (Exception ex) {
		}
		return false;
	}

	public boolean VerifyMappingName(String MappingName) {

		try {
			WebElement HeaderWebEelement = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(mappingName_xpath));
			String actualMsgFromAPP = HeaderWebEelement.getText();
			Thread.sleep(1000);
			if (actualMsgFromAPP.equalsIgnoreCase(MappingName))
				;
			{
				return true;
			}
		} catch (Exception ex) {
		}
		return false;
	}

	public boolean VerifyBorrowerReceivable() {

		try {
			WebElement HeaderWebEelement = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(BorrowerReceivable_xpath));
			HeaderWebEelement.isDisplayed();
			return true;
		}

		catch (Exception ex) {
		}
		return false;

	}

	public boolean VerifyBorrowerReceivablesYESCase(String BorrowerReceivable) {

		try {
			WebElement HeaderWebEelement = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(BorrowerReceivableYESCase_xpath));
			String actualMsgFromAPP = HeaderWebEelement.getText();
			Thread.sleep(1000);
			if (actualMsgFromAPP.equalsIgnoreCase(BorrowerReceivable))
				;
			{
				return true;
			}
		} catch (Exception ex) {
		}
		return false;
	}

	public boolean VerifyUploadOtherRequiredDocuments() {

		try {
			WebElement HeaderWebEelement = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(UploadotherRequiredDocumnetData_xpath));
			HeaderWebEelement.isDisplayed();
			return true;
		}

		catch (Exception ex) {
		}
		return false;

	}

	// click radio button of Auto file upload
	public boolean CliclOnRadioabuttonofAutoFileUpload() {
		try {
			WebElement clickOnsavebutton = new WebDriverWait(driver, 30)
					.until(ExpectedConditions
							.visibilityOfElementLocated(RadioButtonOfABLAutoFileUpload_xpath));
			clickOnsavebutton.click();

			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public boolean VerifyAutoFileUpload() {

		try {
			WebElement HeaderWebEelement = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(AutoFileUploadData_xpath));
			HeaderWebEelement.isDisplayed();
			return true;
		}

		catch (Exception ex) {
		}
		return false;

	}

	public boolean clickonmenu() {
		try {
			WebElement BBCDateWebElement = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(menu_xpath));
			BBCDateWebElement.click();
			return true;
		} catch (Exception ex) {
			return false;
		}

	}

	public boolean clickFileHyperLinkAndVerfiySummaryReceivables() {
		try {
			WebElement WebEelement = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(clickFileHyperLink_xpath));
			WebEelement.click();
			Thread.sleep(2000);
			Set<String> handles = driver.getWindowHandles();
			Iterator<String> it = handles.iterator();
			// iterate through your windows
			while (it.hasNext()) {
				String parent = it.next();
				String newwin = it.next();
				driver.switchTo().window(newwin);
				// perform actions on new window
				WebElement actual = new WebDriverWait(driver, 200)
						.until(ExpectedConditions
								.visibilityOfElementLocated(summaryReceivables1_xpath));
				actual.isDisplayed();
				
				driver.close();
				driver.switchTo().window(parent);
				return true;
			}
			
		} catch (Exception ex) {
			return false;
		}
		return false;
	}

	public boolean clickFileHyperLinkAndVerfiySummaryPaybles()
	{
	try{
	    WebElement WebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(clickFileHyperLink_xpath));
		WebEelement.click();
		Thread.sleep(2000);
		Set <String> handles =driver.getWindowHandles();
		Iterator<String> it = handles.iterator();
		//iterate through your windows
		while (it.hasNext()){
		String parent = it.next();
		String newwin = it.next();
		driver.switchTo().window(newwin);
		//perform actions on new window
		
		WebElement actual=new WebDriverWait(driver,200)
		.until(ExpectedConditions.visibilityOfElementLocated(Payables_xpath));
		actual.isDisplayed();
		driver.close();
		driver.switchTo().window(parent);
		return true;

	}}
	catch(Exception ex){
		
	}
	return false;
	}
	//rohit
	public boolean closeChildWindow() {
		try {
			Set<String> handles = driver.getWindowHandles();
			if (handles.size() > 1) {
				Iterator<String> it = handles.iterator();
				while (it.hasNext()) {
					String parent = it.next();
					String newwin = it.next();
					driver.switchTo().window(newwin);

					driver.switchTo().window(newwin).close();
					driver.switchTo().window(parent);
				}
	   		}
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	 //rohit
		public boolean switchWindow() {
			try {
				Set<String> handles = driver.getWindowHandles();
				if (handles.size() > 1) {
					Iterator<String> it = handles.iterator();
					while (it.hasNext()) {
						String parent = it.next();
						String newwin = it.next();
						driver.switchTo().window(newwin);
					}
					System.out.println(driver.getCurrentUrl());
				}
				System.out.println("not required");
				return true;
			} catch (Exception e) {
				return false;
			}
		}
		// rohit
	    public boolean clickFileHyperLink1() {
	        try {

	 

	            WebElement WebEelement = new WebDriverWait(driver, 10)

	 

	                    .until(ExpectedConditions
	                            .visibilityOfElementLocated(clickFileHyperLinksummarySingleDiv_xpath));

	 

	            WebEelement.click();

	 

	            return true;

	 

	        } catch (Exception ex) {
	        }
	        return false;
	    }
	        

	/*// rohit
	public boolean clickFileHyperLink1() {
			return true;
		} catch (Exception ex) {
			return false;
		}
	}
	*/
	public boolean AblMappingCollateral(String EditDescription) {
		try {
			Thread.sleep(2000);
			WebElement collateralNameFieldInputWebEelement = new WebDriverWait(
					driver,10).until(ExpectedConditions
					.visibilityOfElementLocated(AblMappingCollateral_xpath));
			
			collateralNameFieldInputWebEelement.clear();
			collateralNameFieldInputWebEelement.sendKeys(EditDescription);

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

public Boolean verifyClickheredisiable() {
	try {
		Thread.sleep(2000);
		WebElement HeaderWebEelement = new WebDriverWait(driver, 10)
				.until(ExpectedConditions
						.visibilityOfElementLocated(ChooseFile1_xpath));

		if(HeaderWebEelement.isEnabled())
		{
			return true;
		}
		
	} catch (Exception ex) {
		return false;

	}

	return true;

}
	
	public boolean  verifyDatafiletype() {
		try {
			WebElement WebEelement = new WebDriverWait(driver, 10)

					.until(ExpectedConditions
							.visibilityOfElementLocated(clickFileHyperLinksummarySingleDiv_xpath));
			return true;
		} catch (Exception ex) {
			return false;
		}
	}
	
	public boolean  verifyCollateral() {
        try {
              List<WebElement> list=new ArrayList(driver.findElements((verifyCollateral_xpath)));
              
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
	public boolean Switchtochildwindow() {
        try {
            
            Set <String> handles =driver.getWindowHandles();
            Iterator<String> it = handles.iterator();
            //iterate through your windows
            while (it.hasNext()){
            String parent = it.next();
            String newwin = it.next();
            Thread.sleep(1000);
            driver.switchTo().window(newwin).close();
            driver.switchTo().window(parent);
           
            return true;
            }
        } catch (Exception ex) {
            return false;
        }
        return false;
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
	 
public boolean verifyAblMappingname2(String VerifyMappingGroup) {
	try {
		Thread.sleep(3000);
		WebElement productTypeDropdownWebEelement = new WebDriverWait(
				driver, 10).until(ExpectedConditions
				.visibilityOfElementLocated(VerifyABLMappingName2_xpath));
		
		Select sel = new Select(productTypeDropdownWebEelement);
		List<WebElement> list = sel.getOptions();
	
		for (WebElement ele : list) {
			if (ele.getText().trim().equals(VerifyMappingGroup)) {
				ele.click();
				
				return true;
			}
		}
	} catch (Exception ex) {
		return false;
	}
	return true;
}
public boolean clickchooseABLFile2(){
    
    try{
        WebElement clickchooseFileWebEelement=new WebDriverWait(driver,10)
        .until(ExpectedConditions.visibilityOfElementLocated(chooseFile2_xpath));
        clickchooseFileWebEelement.isDisplayed();
        clickchooseFileWebEelement.click();
        Thread.sleep(5000);
        return true;
    }
    catch(Exception ex){
        return false;
    }
    }
public boolean clickProcessFile2(){
    
    try{
        
        WebElement clickchooseFileWebEelement=new WebDriverWait(driver,10)
        .until(ExpectedConditions.visibilityOfElementLocated(ProcessFile_xpath));
        clickchooseFileWebEelement.click();
        Thread.sleep(10000);
        
      
        
        return true;
    }
    catch(Exception ex){
        return false;
    }
    }


public Boolean Clickhere() {
	try {
		
		WebElement HeaderWebEelement = new WebDriverWait(driver,10)
				.until(ExpectedConditions
						.visibilityOfElementLocated(verifyClickhere_xpath));
      
		HeaderWebEelement.click();
		 Thread.sleep(1000);
		return true;

	} catch (Exception ex) {
		return false;

	}
}


public boolean  verifybreadcrumbactionpendingscreen (){
	try {
		Thread.sleep(2000);
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> it = handles.iterator();
		// iterate through your windows
		while (it.hasNext()) {
			String parent = it.next();
			String newwin = it.next();
			driver.switchTo().window(newwin);
			// perform actions on new window
			WebElement WebEelement1 = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(verifybreadcrumbactionpendingscreen_xpath));
			WebEelement1.isDisplayed();
			String s=WebEelement1.getText();
			System.out.println(s);	
			
			return true;
		} 

	} catch (Exception e) {
		return false;
	}
	return true;
	}

public Boolean Clickhere2() {
	try {
		
		WebElement Clickhereabl = new WebDriverWait(driver,10)
				.until(ExpectedConditions.visibilityOfElementLocated(verifyClickhere2_xpath));
		
		Thread.sleep(3000);
		Actions act= new Actions(driver);
		act.click(Clickhereabl).perform();
	//	Clickhereabl.click();
		

	} catch (Exception ex) {
		return false;

	}
	return true;
}

public Boolean Clickonradobutton() {
	try {
		
		WebElement HeaderWebEelement = new WebDriverWait(driver,10)
				.until(ExpectedConditions
						.visibilityOfElementLocated(Clickonradobutton_xpath));

		HeaderWebEelement.click();
		Thread.sleep(3000);
		return true;

	} catch (Exception ex) {
		return false;

	}
}


public boolean  verifyInvoiceNomultiplemappingpreview(){
	try {
		Thread.sleep(2000);
		WebElement MappingName = new WebDriverWait(driver, 10).
				until(ExpectedConditions.visibilityOfElementLocated(verifyInvoiceNo_xpath));
		String s=MappingName.getText();
		System.out.println(s);	
		

	} catch (Exception e) {
		return false;
	}
	return true;
	}
public boolean  verifyOriginalDatemultiplemappingpreview(){
	try {
		Thread.sleep(2000);
		WebElement MappingName = new WebDriverWait(driver, 10).
				until(ExpectedConditions.visibilityOfElementLocated(OriginalDate_xpath));
		String s=MappingName.getText();
		System.out.println(s);	
		

	} catch (Exception e) {
		return false;
	}
	return true;
	}
public boolean  VerifyVariancevalue(){
	try {
		
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> it = handles.iterator();
		// iterate through your windows
		while (it.hasNext()) {
			String parent = it.next();
			String newwin = it.next();
			driver.switchTo().window(newwin);
			// perform actions on new window
			WebElement WebEelement1 = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(Variancevalue_xpath));
			WebEelement1.isDisplayed();
			return true;
		}

	} catch (Exception e) {
		return false;
	}
	return true;
	}
public String ProceedMappingAndBBC(String value)
{
try{
	
	WebElement editWebEelement=new WebDriverWait(driver,10)
	.until(ExpectedConditions.visibilityOfElementLocated(MappingAndBBC_xpath));
	String actual=editWebEelement.getText().trim();
	Thread.sleep(1000);
	System.out.println(actual);
	if (actual.equals(value));
		
	}
catch(Exception ex){
}
 return value;
}



public boolean  verifyMappingNamemultiplemappingpreview(){
	try {
	
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> it = handles.iterator();
		// iterate through your windows
		while (it.hasNext()) {
			String parent = it.next();
			String newwin = it.next();
			driver.switchTo().window(newwin);
			// perform actions on new window
			WebElement WebEelement1 = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(Namemultiplemappingpreview_xpath));
			WebEelement1.isDisplayed();
			return true;
	}
	}catch (Exception e) {
		return false;
	}
	return true;
	
	}

public boolean  verifyCollateralNamemultiplemappingpreview(){
	try {
		Thread.sleep(2000);
		WebElement MappingName = new WebDriverWait(driver, 10).until
				(ExpectedConditions.visibilityOfElementLocated(verifyCollateralNamemultiplemappingpreview_xpath));
		String s=MappingName.getText();
		System.out.println(s);	

	} catch (Exception e) {
		return false;
	}
	return true;
	}

public boolean  verifyAccountNomultiplemappingpreview(){
	try {
		Thread.sleep(2000);
		WebElement MappingName = new WebDriverWait(driver, 10).
				until(ExpectedConditions.visibilityOfElementLocated(verifyAccountNomultiplemappingpreview_xpath));
		String s=MappingName.getText();
		System.out.println(s);	
		

	} catch (Exception e) {
		return false;
	}
	return true;
	}

public boolean  verifyTooltips(){
	try {
		Thread.sleep(2000);
		WebElement MappingName = new WebDriverWait(driver, 10).
				until(ExpectedConditions.visibilityOfElementLocated(verifyTooltips_xpath));
		String s=MappingName.getAttribute("title");
		System.out.println(s);	
		
	} catch (Exception e) {
		return false;
	}
	return true;
	}
public boolean verifyAblMappingname3(String VerifyMappingGroup) {
	try {
		Thread.sleep(3000);
		WebElement productTypeDropdownWebEelement = new WebDriverWait(
				driver, 50).until(ExpectedConditions
				.visibilityOfElementLocated(VerifyABLMappingName3_xpath));
		
		Select sel = new Select(productTypeDropdownWebEelement);
		List<WebElement> list = sel.getOptions();
	
		for (WebElement ele : list) {
			if (ele.getText().trim().equals(VerifyMappingGroup)) {
				ele.click();
				
				return true;
			}
		}
	} catch (Exception ex) {
		return false;
	}
	return true;
}
public  void fileUPload2(String FilePath) {
	try {

		Thread.sleep(2000);

		WebElement El = driver.findElement(ChooseFile12_xpath);
		
		((RemoteWebElement) El).setFileDetector(new LocalFileDetector());
		El.sendKeys(FilePath);

		Thread.sleep(2000);

	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

public Boolean CloseSuccesfull() {
	try {
		Thread.sleep(1000);
		
		WebElement HeaderWebEelement = new WebDriverWait(driver,200)
				.until(ExpectedConditions.visibilityOfElementLocated(CloseSuccesfull_xpath));
		
		Thread.sleep(2000);
		HeaderWebEelement.click();
		return true;

	} catch (Exception ex) {
		return false;

	}
}


public boolean  verifyuploadedfile_id(){
	try {
		WebElement displayWebElement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(verifyuploadedfileid_xpath));
		displayWebElement.isDisplayed();
		String s1=displayWebElement.getText();
		System.out.println(s1);
		
	} catch (Exception e) {
		return false;
	}
	return true;
	}
public Boolean Verifyexpvalue() {
	try {
		
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> it = handles.iterator();
		// iterate through your windows
		while (it.hasNext()) {
			String parent = it.next();
			String newwin = it.next();
			driver.switchTo().window(newwin);
			// perform actions on new window
			WebElement WebEelement1 = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(Verifyvalue_xpath));
			WebEelement1.isDisplayed();
			return true;
		}
	} catch (Exception ex) {
		return false;

	}
	return true;
}
public boolean  verifyAccountNamemultiplemappingpreview(){
	try {
		Thread.sleep(2000);
		WebElement MappingName = new WebDriverWait(driver, 10).
				until(ExpectedConditions.visibilityOfElementLocated(verifyAccountName_xpath));
		String s=MappingName.getText();
		System.out.println(s);	
		

	} catch (Exception e) {
		return false;
	}
	return true;
	}

public boolean  verifyCurrentmultiplemappingpreview(){
	try {
		Thread.sleep(2000);
		WebElement MappingName = new WebDriverWait(driver, 10).
				until(ExpectedConditions.visibilityOfElementLocated(Current_xpath));
		String s=MappingName.getText();
		System.out.println(s);	
		

	} catch (Exception e) {
		return false;
	}
	return true;
	}
public boolean  Verifyactualvalue(){
	try {
		
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> it = handles.iterator();
		// iterate through your windows
		while (it.hasNext()) {
			String parent = it.next();
			String newwin = it.next();
			driver.switchTo().window(newwin);
			// perform actions on new window
			WebElement WebEelement1 = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(actualvalue_xpath));
			WebEelement1.isDisplayed();
			return true;
		}

	} catch (Exception e) {
		return false;
	}
	return true;
	}
public boolean  VerifyRecordCount(){
	try {
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> it = handles.iterator();
		// iterate through your windows
		while (it.hasNext()) {
			String parent = it.next();
			String newwin = it.next();
			driver.switchTo().window(newwin);
			// perform actions on new window
			WebElement WebEelement1 = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(RecordCount_xpath));
			WebEelement1.isDisplayed();
			return true;
		}
	} catch (Exception e) {
		return false;
	}
	return true;
	}
public boolean addToValueTextbox(String value)
{
try{
	WebElement editWebEelement=new WebDriverWait(driver,5)
	.until(ExpectedConditions.visibilityOfElementLocated(valueBox_xpath));
	editWebEelement.click();
	editWebEelement.clear();
	editWebEelement.sendKeys(value);
	
	return true;
}
catch(Exception ex){
	return false;	
}
}
public Boolean verifyClickhere() {
	try {
		Thread.sleep(2000);
		WebElement HeaderWebEelement = new WebDriverWait(driver, 10)
				.until(ExpectedConditions
						.visibilityOfElementLocated(verifyClickhere_xpath));

		HeaderWebEelement.isDisplayed();
		// //Thread.sleep(5000);
		return true;

	} catch (Exception ex) {
		return false;

	}
}
public boolean verifyDataFileTypeAsPayablesMappingView() {

	try {

		WebElement WebEelement = new WebDriverWait(driver, 10)

				.until(ExpectedConditions
						.visibilityOfElementLocated(selectDataFileTypeAsPayables_xpath));

		WebEelement.click();

		// Thread.sleep(5000);
		return true;
	} catch (Exception ex) {
		return false;
	}
}
}
