package com.cync.FactoringPages;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.cync.base.BasePage;

public class MappingListViewPageFactoring extends BasePage {
	
	
	private final By MappingListViewPageFactoring_xpath = By.xpath("//span[@class='paneltitle' and text()=' Mapping List View ' ]");
	
	private final By createNewMapping_xpath=By.xpath("//a[text()='Create New Mapping']");
	private final By mappingname_xpath = By.xpath("//input[@id='mapping_entered_name']");
	private final By dataFileTypedropdown_xpath = By.xpath("//select[@id='mapping_data_type']");
	private final By collateralNamedropdown_xpath = By.xpath("//select[@id='mapping_collateral_advance_rate_id']");
	private final By fileformatdropdown_xpath = By.xpath("//select[@id='mapping_file_format']");
	private final By chooseFile_xpath = By.xpath("//input[@id='mapping_file']");
	private final By nextBTN_xpath = By.xpath("//input[@id='mapping_create_bt_new']");
	private final By step2NextBTN_xpath = By.xpath("//input[@id='mapping_create_bt']");
	private final By sheetNoField_xpath = By.xpath("//input[@id='mapping_sheet_no']");
	private final By headerRowsField_xpath = By.xpath("//input[@id='mapping_header_rows']");
	private final By accountNo_xpath = By.xpath("//select[@id='mapping_column_mappings_account_no']");
	private final By accountName_xpath = By.xpath("//select[@id='mapping_column_mappings_account_name']");
	private final By collateralType_xpath = By.xpath("//select[@id='mapping_column_mappings_collateral_advance_rate_id']");
	private final By invoiceNo_xpath = By.xpath("//select[@name='mapping[column_mappings][invoice_no]']");	
	private final By poNo_xpath = By.xpath("//select[@name='mapping[column_mappings][po_number]']");
	private final By originalDate_xpath = By.xpath("//select[@id='mapping_column_mappings_original_date']");
	private final By invoiceAmountDropdown_xpath = By.xpath("//select[@name='mapping[column_mappings][current_amount][]']");
	private final By dueDateDropdown_xpath = By.xpath("//select[@id='mapping_column_mappings_due_date'] ");
	private final By bankReferenceDropdown_xpath = By.xpath("//select[@id='mapping_column_mappings_batch_reference_no']");
	private final By pdfImageRadioBTN_xpath = By.xpath("//input[@id='mapping_image_file_data_type_pdf']");
	private final By accountNoField_xpath = By.xpath("//th[contains(text(),'Account No')]");
	private final By accountNameField_xpath = By.xpath("//table[@id='mapping_preview']//thead//tr //th[contains(text(),'Account Name')]");
	private final By invoiceNoField_xpath = By.xpath("//table[@id='mapping_preview']//thead//tr//th[contains(text(),'Invoice No')]");
	private final By poNoField_xpath = By.xpath("//table[@id='mapping_preview']//thead//tr//th[contains(text(),'PO Number')]");
	private final By originalDateField_xpath = By.xpath("//table[@id='mapping_preview']//thead//tr//th[contains(text(),'Original Date')]");
	private final By invoiceAmountField_xpath = By.xpath("//table[@id='mapping_preview']//thead//tr//th[contains(text(),'Invoice Amount')]");
	private final By dueDateField_xpath = By.xpath("//table[@id='mapping_preview']//thead//tr//th[contains(text(),'Due Date')]");
	private final By batchRefNoField_xpath = By.xpath("//table[@id='mapping_preview']//thead//tr//th[contains(text(),'Batch Reference No')]");
	//private final By saveBTN_xpath = By.xpath("//input[@name='commit']");
	private final By saveBTN_xpath = By.xpath("//input[@id='mapping_create_bt' and @name='commit']");
	private final By successMsg_xpath = By.xpath("//div[@id='message']");
	private final By mappingHyperlink_xpath = By.xpath("//a[@class='btn-link']");
	
	
	
	
	public MappingListViewPageFactoring(WebDriver driver) {
		super(driver);
		try
		{
			
		}
		catch(Exception e)
		{
			
		}
	}
	public  String PageHeaderVerify(String Header)
    {
    	try
    	{
    		WebElement HeaderWebEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(MappingListViewPageFactoring_xpath));
		HeaderWebEelement.getText();
		Thread.sleep(2000);
    	}
    	catch(Exception e)
    	{
    		
    	}
    	return Header;
    }
	public boolean ClickOnCreateNewMappingBTN() {
		try
		{
			WebElement clickcreateNewMappingWebEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(createNewMapping_xpath));
			clickcreateNewMappingWebEelement.click();
			this.isAlertPresent();
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}
	public boolean addValueToMappingName(String mappingname) {
		try
		{
			WebElement mappingnameWebEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(mappingname_xpath));
			mappingnameWebEelement.clear();
			mappingnameWebEelement.sendKeys(mappingname);
			return true;
		}
		catch(Exception e)
		{
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
	public boolean addValueToDataFiletype(String dataFileType) {
		
			try {
				WebElement dataFileTypeDropdownWebEelement = new WebDriverWait(
						driver, 20).until(ExpectedConditions
						.visibilityOfElementLocated(dataFileTypedropdown_xpath));
				Select sel = new Select(dataFileTypeDropdownWebEelement);
				List<WebElement> list = sel.getOptions();
				for (WebElement ele : list) {
					if (ele.getText().equals(dataFileType)) {
						ele.click();
						Thread.sleep(1000);
						
                   return true;
					}
				}

			} catch (Exception ex) {
			}
			return false;
		}
	
	public boolean addValueToCollateralname(String collateralname) {
		try {
			WebElement CollateralnameDropdownWebEelement = new WebDriverWait(
					driver, 20).until(ExpectedConditions
					.visibilityOfElementLocated(collateralNamedropdown_xpath));
			Select sel = new Select(CollateralnameDropdownWebEelement);
			List<WebElement> list = sel.getOptions();
			for (WebElement ele : list) {
				if (ele.getText().equals(collateralname)) {
					ele.click();
					Thread.sleep(1000);

					 return true;
				}
			}

		} catch (Exception ex) {
		}
		return true;
	}
	public boolean addValueToFileFormat(String fileformat) {
		try {
			WebElement fileformatWebEelement = new WebDriverWait(
					driver, 20).until(ExpectedConditions
					.visibilityOfElementLocated(fileformatdropdown_xpath));
			Select sel = new Select(fileformatWebEelement);
			List<WebElement> list = sel.getOptions();
			for (WebElement ele : list) {
				if (ele.getText().equals(fileformat)) {
					ele.click();
					Thread.sleep(1000);

					 return true;
				}
			}

		} catch (Exception ex) {
		}
		return false;
	}
	
	public boolean SendInvoiceMapping() {
		try
		{
			WebElement ChooseFile = new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(chooseFile_xpath));
			ChooseFile.sendKeys(System.getProperty("user.dir")+"\\FileUpload\\FactoringMappFile.xlsx");
			Thread.sleep(1000);
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}
	public boolean ClickOnNextBTN() {
		try
		{
			WebElement NextBTNWebEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(nextBTN_xpath));
			NextBTNWebEelement.click();
			this.isAlertPresent();
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}
	public boolean addValueToSheetNo(String sheetno) {
		try
		{
			WebElement sheetnoWebEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(sheetNoField_xpath));
			sheetnoWebEelement.clear();
			sheetnoWebEelement.sendKeys(sheetno);
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}
	public boolean addValueToHeaderRow(String headerrows) {
		try
		{
			WebElement headerrowWebEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(headerRowsField_xpath));
			headerrowWebEelement.clear();
			headerrowWebEelement.sendKeys(headerrows);
			//return true;
		}
		catch(Exception e)
		{
			return false;
		}
		return true;
	}
	
	public boolean accountNodropdownValues(String accountNo) {
		try {
			WebElement accountNoDropdownWebEelement = new WebDriverWait(
					driver, 10).until(ExpectedConditions
					.visibilityOfElementLocated(accountNo_xpath));
			//Thread.sleep(2000);
			Select sel = new Select(accountNoDropdownWebEelement);
			sel.selectByVisibleText(accountNo);
			
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
	public boolean accountNamedropdownValues(String accountName) {
		try {
			WebElement accountNameDropdownWebEelement = new WebDriverWait(
					driver, 10).until(ExpectedConditions
					.visibilityOfElementLocated(accountName_xpath));
			//Thread.sleep(2000);
			Select sel = new Select(accountNameDropdownWebEelement);
			sel.selectByVisibleText(accountName);
			
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
	public boolean collateraltypedropdownValues(String collateraltype) {
		try {
			WebElement collateraltypedropdownWebEelement = new WebDriverWait(
					driver, 10).until(ExpectedConditions
					.visibilityOfElementLocated(collateralType_xpath));
			//Thread.sleep(2000);
			Select sel = new Select(collateraltypedropdownWebEelement);
			sel.selectByVisibleText(collateraltype);
			
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
	public boolean invoicenodropdownValues(String invoiceno) {
		try {
			WebElement invoicenodropdownWebEelement = new WebDriverWait(
					driver, 10).until(ExpectedConditions
					.visibilityOfElementLocated(invoiceNo_xpath));
			//Thread.sleep(2000);
			Select sel = new Select(invoicenodropdownWebEelement);
			/*sel.selectByVisibleText(invoiceno);*/
			
			List<WebElement> list = sel.getOptions();
			for (WebElement ele : list) {
				if (ele.getText().equals(invoiceno)) {
					ele.click();

					Thread.sleep(500);

					
					 return true;
				}
			}
			return true;
		} catch (Exception ex) {
		}
		return false;
	}
	public boolean poNodropdownValues(String poNo) {
		try {
			WebElement poNodropdownWebEelement = new WebDriverWait(
					driver, 10).until(ExpectedConditions
					.visibilityOfElementLocated(poNo_xpath));
			//Thread.sleep(2000);
			Select sel = new Select(poNodropdownWebEelement);
			/*sel.selectByVisibleText(poNo);*/
			
			List<WebElement> list = sel.getOptions();
			for (WebElement ele : list) {
				if (ele.getText().equals(poNo)) {
					ele.click();

					Thread.sleep(500);

					
					 return true;
				}
			}
			return true;
		} catch (Exception ex) {
		}
		return false;
	}
	public boolean originalDatedropdownValues(String originaldate) {
		try {
			WebElement originalDatedropdownWebEelement = new WebDriverWait(
					driver, 10).until(ExpectedConditions
					.visibilityOfElementLocated(originalDate_xpath));
			//Thread.sleep(2000);
			Select sel = new Select(originalDatedropdownWebEelement);
			/*sel.selectByVisibleText(originaldate);*/
			
			List<WebElement> list = sel.getOptions();
			for (WebElement ele : list) {
				if (ele.getText().equals(originaldate)) {
					ele.click();

					Thread.sleep(500);

					
					 return true;
				}
			}
			return true;
		} catch (Exception ex) {
		}
		return false;
	}
	public boolean invoiceamountdropdownValues(String invoiceamount) {
		try {
			WebElement invoiceamountdropdownWebEelement = new WebDriverWait(
					driver, 10).until(ExpectedConditions
					.visibilityOfElementLocated(invoiceAmountDropdown_xpath));
			//Thread.sleep(2000);
			Select sel = new Select(invoiceamountdropdownWebEelement);
			/*sel.selectByVisibleText(invoiceamount);*/
			
			List<WebElement> list = sel.getOptions();
			for (WebElement ele : list) {
				if (ele.getText().equals(invoiceamount)) {
					ele.click();

					Thread.sleep(500);

					
					 return true;
				}
			}
			return true;
		} catch (Exception ex) {
		}
		return false;
	}
	public boolean duedatedropdownValues(String duedate) {
		try {
			WebElement duedatedropdownWebEelement = new WebDriverWait(
					driver, 10).until(ExpectedConditions
					.visibilityOfElementLocated(dueDateDropdown_xpath));
			//Thread.sleep(2000);
			Select sel = new Select(duedatedropdownWebEelement);
			/*sel.selectByVisibleText(duedate);*/
			
			List<WebElement> list = sel.getOptions();
			for (WebElement ele : list) {
				if (ele.getText().equals(duedate)) {
					ele.click();

					Thread.sleep(500);

					
					 return true;
				}
			}
			return true;
		} catch (Exception ex) {
		}
		return false;
	}
	public boolean batchReferenceNodropdownValues(String referenceno) {
		try {
			WebElement bankReferenceNodropdownWebEelement = new WebDriverWait(
					driver, 10).until(ExpectedConditions
					.visibilityOfElementLocated(bankReferenceDropdown_xpath));
			//Thread.sleep(2000);
			Select sel = new Select(bankReferenceNodropdownWebEelement);
			/*sel.selectByVisibleText(referenceno);*/
			
			List<WebElement> list = sel.getOptions();
			for (WebElement ele : list) {
				if (ele.getText().equals(referenceno)) {
					ele.click();

					Thread.sleep(500);

					
					 return true;
				}
			}
			return true;
		} catch (Exception ex) {
		}
		return false;
	}
	public boolean CheckOnImageFileFormat() {
		try {
			WebElement ImageFileFormatWebEelement = new WebDriverWait(
					driver, 10).until(ExpectedConditions
					.visibilityOfElementLocated(pdfImageRadioBTN_xpath));
			//Thread.sleep(2000);
			ImageFileFormatWebEelement.click();
					Thread.sleep(500);
					 return true;
		} catch (Exception ex) {
		}
		return false;
	}
	
	
	public boolean verifyAccountNoFieldStep4() {
		try {
			WebElement AccountNoFieldWebEelement = new WebDriverWait(
					driver, 10).until(ExpectedConditions
					.visibilityOfElementLocated(accountNoField_xpath));
			//Thread.sleep(2000);
			AccountNoFieldWebEelement.isDisplayed();
					Thread.sleep(500);
					 return true;
		} catch (Exception ex) {
		}
		return false;
	}
	
	public boolean verifyAccountNameFieldStep4() {
		try {
			WebElement AccountNameFieldWebEelement = new WebDriverWait(
					driver, 10).until(ExpectedConditions
					.visibilityOfElementLocated(accountNameField_xpath));
			//Thread.sleep(2000);
			AccountNameFieldWebEelement.isDisplayed();
					Thread.sleep(500);
					 return true;
		} catch (Exception ex) {
		}
		return false;
	}
	
	
	public boolean verifyInvoiceNoFieldStep4() {
		try {
			WebElement InvoiceNoFieldWebEelement = new WebDriverWait(
					driver, 10).until(ExpectedConditions
					.visibilityOfElementLocated(invoiceNoField_xpath));
			//Thread.sleep(2000);
			InvoiceNoFieldWebEelement.isDisplayed();
					Thread.sleep(500);
					 return true;
		} catch (Exception ex) {
		}
		return false;
	}
	
	
	public boolean verifyPoNoFieldStep4() {
		try {
			WebElement PoNoFieldWebEelement = new WebDriverWait(
					driver, 10).until(ExpectedConditions
					.visibilityOfElementLocated(poNoField_xpath));
			//Thread.sleep(2000);
			PoNoFieldWebEelement.isDisplayed();
					Thread.sleep(500);
					 return true;
		} catch (Exception ex) {
		}
		return false;
	}
	
	public boolean verifyOriginalDateFieldStep4() {
		try {
			WebElement OriginalDateFieldWebEelement = new WebDriverWait(
					driver, 10).until(ExpectedConditions
					.visibilityOfElementLocated(originalDateField_xpath));
			//Thread.sleep(2000);
			OriginalDateFieldWebEelement.isDisplayed();
					Thread.sleep(500);
					 return true;
		} catch (Exception ex) {
		}
		return false;
	}
	
	
	public boolean verifyInvoiceAmountFieldStep4() {
		try {
			WebElement InvoiceAmountFieldWebEelement = new WebDriverWait(
					driver, 10).until(ExpectedConditions
					.visibilityOfElementLocated(invoiceAmountField_xpath));
			//Thread.sleep(2000);
			InvoiceAmountFieldWebEelement.isDisplayed();
					Thread.sleep(500);
					 return true;
		} catch (Exception ex) {
		}
		return false;
	}
	
	
	public boolean verifyDueDateFieldStep4() {
		try {
			WebElement DueDateFieldWebEelement = new WebDriverWait(
					driver, 10).until(ExpectedConditions
					.visibilityOfElementLocated(dueDateField_xpath));
			//Thread.sleep(2000);
			DueDateFieldWebEelement.isDisplayed();
					Thread.sleep(500);
					 return true;
		} catch (Exception ex) {
		}
		return false;
	}
	
	
	public boolean verifyBatchRefNoFieldStep4() {
		try {
			WebElement BatchRefNoFieldWebEelement = new WebDriverWait(
					driver, 10).until(ExpectedConditions
					.visibilityOfElementLocated(batchRefNoField_xpath));
			//Thread.sleep(2000);
			BatchRefNoFieldWebEelement.isDisplayed();
					Thread.sleep(500);
					 return true;
		} catch (Exception ex) {
		}
		return false;
	}
	
	
	public boolean ClickOnSaveBTN() {
		try
		{
			WebElement SaveBTNWebEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(saveBTN_xpath));
			SaveBTNWebEelement.click();
			this.isAlertPresent();
			Thread.sleep(1000);
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}
	
	public boolean verifySuccessMsg() {
		try
		{
			WebElement SuccessMsgWebEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(successMsg_xpath));
			SuccessMsgWebEelement.isDisplayed();
			
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}
	
	
	public boolean verifyMappingHyperlink() {
		try
		{
			WebElement MappingHyperlinkWebEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(mappingHyperlink_xpath));
			MappingHyperlinkWebEelement.isDisplayed();
			
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}
	public boolean ClickOnstep2NextBTN() {
		try
		{
			WebElement NextBTNWebEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(step2NextBTN_xpath));
			NextBTNWebEelement.click();
			this.isAlertPresent();
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}
	
	
	
	
	
	
	
}
