package com.cync.CashAppPages;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.SkipException;

import com.cync.base.BasePage;

public class BatchCashPage  extends BasePage {
	
	private final By batchCashPageHeader_xpath = By.xpath("//span[contains(text(),'Batch Cash Receipts Entry')]");
	private final By batchDetail_xpath = By.xpath("//h2[contains(text(),'Batch Details')]");
	private final By checkEntry_xpath = By.xpath("//h2[contains(text(),'Check Entry')]");
	private final By editFundingStyle_xpath = By.id("edit");
	private final By batchCashType_xpath = By.id("parameter_batch_cash_type");
	private final By saveBtnClick_xpath = By.id("save");
	private final By sourceTypeValue_xpath = By.id("batch_batch_source_code_id");
	private final By totalAmountTextBox_xpath = By.id("batch_total_amount");
	private final By cashTypeValue_xpath = By.id("batch_batch_cash_type");
	private final By splitImageValue_xpath = By.id("batch_image_split");
	private final By chooseFile_xpath = By.xpath("//input[@type='file']");
	private final By clientValue_xpath = By.xpath("(//span[@role='presentation'])[3]");
	private final By debtorValue_xpath = By.xpath("(//span[@class='select2-selection select2-selection--single'])[4]");
	private final By bankRoutingNumTextBox_xpath = By.xpath("(//td/input[@class='bank_route'])[1]");
	private final By bankAccountNumTextBox_xpath = By.xpath("(//input[@class='bank_acc'])[1]");
	private final By checkNumTextBox_xpath = By.xpath("(//input[@class='check_number'])[1]");
	private final By checkAmountTextBox_xpath = By.xpath("(//input[@class='check_am'])[1]");
	private final By batchSaveBtn_xpath = By.id("save_entire_batch_button");
	private final By batchSaveSuvvessMsg_xpath = By.xpath("//li[contains(text(),'Batch was successfully ')]s");
	private final By searchClientTextBox_xpath = By.xpath("//input[@type='search']");
	private final By searchClient_xpath = By.xpath("(//li[contains(@class,'select2-results__option select2-results__option--highlighted')])[1]");
	private final By searchDebtorTextBox_xpath = By.xpath("//input[@type='search']");
	private final By searchDebtor_xpath = By.xpath("(//ul[@class='select2-results__options'])[1]");
	private final By batchCashImaMapping_xpath = By.xpath("//a[@title='Image Mapping']");
	private final By checkDebtorMapping_xpath = By.xpath("//input[@class='invoice_list_checks']");
	private final By checkImageSelect_xpath = By.xpath("(//input[@class='thumbcheck'])[1]");
	private final By checkImageSaveBtn_xpath = By.id("assign_invoice_btn");
	private final By checkImageIconLink_xpath = By.xpath("(//span[@class='icon-link'])[1]");
	private final By checkImagePopupClose_xpath = By.xpath("//span[@class='mp-iconClose']");
	private final By ImageIconLink_xpath = By.xpath("//a[@class='view_attachment']");
	private final By batchSaveSuvvessMsgClose_xpath = By.xpath("(//button[@class='close'])[1]");
	private final By extBatchSelect_xpath = By.xpath("//select[@id='batch_existing_batch_no']");
	private final By extSelectBatch_xpath = By.xpath("(//select[@id='batch_existing_batch_no']/option)[2]");
	private final By imgAssignDelete_xpath = By.xpath("//div[@class='delate-buttom delate-active-btn']");
	private final By imgAssignDeleteNO_xpath = By.xpath("//div[@class='delate-buttom delate-active-btn']");
	private final By imgAssignDeleteYes_xpath = By.xpath("//span[@class='dialog-btn-cancel']");
	private final By InvoiceDetailsHyperlink_xpath = By.id("invoiceDetails");
	private final By ApplyCheckBox_xpath = By.xpath("(//input[@class='check_invoice_tablebody'])[1]");
	private final By SelectedInvoices_xpath = By.xpath("//a[@href='#selected_invoices']");
	private final By SaveBtnClick_xpath = By.id("save_invoice_detail");
	private final By applyAmountTextBox_xpath = By.xpath("(//input[@class='invoice_current_amount'])[1]");
	private final By InvoiceDetailsPopupSearchTextBox_xpath = By.xpath("(//input[@class='form-control search_value'])[1]");
	private final By SearcgBtnClick_xpath = By.xpath("(//i[@class='icon-search'])[1]");
	private final By RemoveSelectedRecord_xpath = By.xpath("(//button[@class='remInvoices'])[1]");
	private final By InvoiceDetailsPopupClose = By.xpath("//button[@class='ui-dialog-titlebar-close']");
	private final By SelectedCheckBox_xpath = By.xpath("//tbody[@id='selected_invoice_body']/tr/td//input[@class='check_invoice_tablebody']");
	private final By viewAttachment_xpath = By.xpath("(//label[@title='View Attachment'])[1]");
	private final By viewAttachmentImage_xpath = By.xpath("//div[@class='popover-content']//td[1]//a");

	
	
	private final By AddNewCheckBtn_xpath = By.id("batch_new_check_button");	
	private final By AddCheckclientValue_xpath = By.xpath("(//span[@role='presentation'])[13]");
	private final By AddCheckbankRoutingNumTextBox_xpath = By.xpath("(//td/input[@class='bank_route'])[6]");
	private final By AddCheckbankAccountNumTextBox_xpath = By.xpath("(//input[@class='bank_acc'])[6]");
	private final By AddCheckcheckNumTextBox_xpath = By.xpath("(//input[@class='check_number'])[6]");
	private final By AddCheckcheckAmountTextBox_xpath = By.xpath("(//input[@class='check_am'])[6]");
	private final By AddNewCheckdebtorValue_xpath = By.xpath("(//span[@class='select2-selection select2-selection--single'])[14]");
	private final By deleteBatchBtn_xpath = By.id("delete_selected_batch");	
	

	private final By totalAmountDefaultValue_xpath = By.xpath("(//input[@value='0.00'])[1]");
	private final By NewBatchBtn_xpath = By.id("new_batch_button");	
	private final By viewAttachmentImageLink_xpath = By.xpath("(//a[@target='_blank'])[2]");

	private final By InvPostBal_OP_xpath = By.xpath("(//td[contains(@id,'remaining_balance')])[1]");
	private final By adjustAmountTextBox_xpath = By.xpath("(//input[@class='invoice_adjust_amount'])[1]");
	private final By adjustmentReasonValue_xpath = By.id("batch_checks_attributes_0_check_invoices_attributes_0_adjustment_reason_id");

	
	private final By viewAttachmentDebtorCollection_xpath = By.xpath("(//data[@class='doc-attached-icon icon-random'])[1]");

	private final By CheckEntryClientClick_xpath = By.xpath("(//span[@class='select2-selection select2-selection--single'])[3]");
	private final By CheckEntryClientsearch_xpath = By.xpath("//input[@class='select2-search__field']");
	private final By ClientSearchVerify_xpath = By.xpath("(//li[@class='select2-results__option select2-results__option--highlighted'])[1]");

	
	
	
	
	public BatchCashPage(WebDriver driver) {
		super(driver);
		try{
			/*if(!driver.findElement(batchCashPageHeader_xpath).getText().trim().contains("Batch Cash Receipts Entry")){
				throw new SkipException("Batch Cash Receipts Entry page couldn't open.");
			
			} */
			}
		catch(Exception e){
			
		// TODO Auto-generated constructor stub
			e.printStackTrace();
	}
		
		// TODO Auto-generated constructor stub

}
	
	
	
	
	public boolean ViewAttachmentCollection_Debtor()
	{
	try{

	WebElement ColDebttWebEelement=new WebDriverWait(driver,100)
	.until(ExpectedConditions.visibilityOfElementLocated(viewAttachmentDebtorCollection_xpath));
	ColDebttWebEelement.click();
	Thread.sleep(5000);

	return true;
	}
	catch(Exception ex){
	return false;
	}

	}
	
	
	
	public boolean SelectClientFunction()
	{
	try{
	    Thread.sleep(2000);
	WebElement selectClientWebEelement=new WebDriverWait(driver,100)
	.until(ExpectedConditions.visibilityOfElementLocated(clientValue_xpath));
	selectClientWebEelement.click();

	return true;
	}
	catch(Exception ex){
	return false;
	}

	}


	public String addValueToSearch(String ClientData)
	{
	try{
	WebElement searchClientTextBoxWebEelement=new WebDriverWait(driver,200)
	.until(ExpectedConditions.visibilityOfElementLocated(searchClientTextBox_xpath));
	searchClientTextBoxWebEelement.clear();
	searchClientTextBoxWebEelement.sendKeys(ClientData);

	}
	catch(Exception ex){

	}
	return ClientData;

	}


	public boolean SearchClientClick()
	{
	try{

	WebElement searchClientWebEelement=new WebDriverWait(driver,100)
	.until(ExpectedConditions.visibilityOfElementLocated(searchClient_xpath));
	searchClientWebEelement.click();
	Thread.sleep(5000);
	


	return true;
	}
	catch(Exception ex){
	return false;
	}

	}
	
	
	public boolean selectClientFromDropDown(String ClintData)
	{
	try{
	this.SelectClientFunction();
	this.addValueToSearch(ClintData);
	this.SearchClientClick();

	

	return true;
	}
	catch(Exception ex){
	return false;
	}

	} 

	
	

	public boolean SelectDebtorFunction()
	{
	try{
	    Thread.sleep(2000);
	/*WebElement selectDebtorWebEelement=new WebDriverWait(driver,100)
	.until(ExpectedConditions.visibilityOfElementLocated(debtorValue_xpath));*/
	    WebElement selectDebtorWebEelement=driver.findElement(debtorValue_xpath);
	selectDebtorWebEelement.click();

	return true;
	}
	catch(Exception ex){
	return false;
	}

	}


	public String addValueToDebtorSearch(String DebtorData)
	{
	try{
	WebElement searchWebEelement=new WebDriverWait(driver,200)
	.until(ExpectedConditions.visibilityOfElementLocated(searchDebtorTextBox_xpath));
	searchWebEelement.clear();
	searchWebEelement.sendKeys(DebtorData);

	}
	catch(Exception ex){

	}
	return DebtorData;

	}


	public boolean SearchDebtorClick()
	{
	try{

	WebElement searchDebtorWebEelement=new WebDriverWait(driver,100)
	.until(ExpectedConditions.visibilityOfElementLocated(searchDebtor_xpath));
	searchDebtorWebEelement.click();


	return true;
	}
	catch(Exception ex){
	return false;
	}

	}
	
	
	public boolean selectDebtorFromDropDown(String DebtorData)
	{
	try{
	this.SelectDebtorFunction();
	this.addValueToDebtorSearch(DebtorData);
	this.SearchDebtorClick();

	Thread.sleep(7000);

	return true;
	}
	catch(Exception ex){
	return false;
	}

	} 

	
	
	 public String PageHeaderVerify(String Header)
		{
		try{
			WebElement HeaderWebEelement=new WebDriverWait(driver,100)
				.until(ExpectedConditions.visibilityOfElementLocated(batchCashPageHeader_xpath));
			HeaderWebEelement.getText();
			Thread.sleep(2000);
			
		}
		catch(Exception ex){
			
		}
		return Header;
		
		}  
	
	 
	public boolean BatchDetailLabelVerify()
		{
		try{

			WebElement batchDetailWebEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(batchDetail_xpath));
			batchDetailWebEelement.isDisplayed();
			
	return true;
		}
		catch(Exception ex){
			return false;
		}

		}
	 
	public boolean CheckEntryLabelVerify()
	{
	try{

		WebElement checkEntryWebEelement=new WebDriverWait(driver,100)
		.until(ExpectedConditions.visibilityOfElementLocated(checkEntry_xpath));
		checkEntryWebEelement.isDisplayed();
		
return true;
	}
	catch(Exception ex){
		return false;
	}

	}
	
	
public boolean FundingStyleEditVerify()
	{
	try{

		WebElement editFundingStyleWebEelement=new WebDriverWait(driver,100)
		.until(ExpectedConditions.visibilityOfElementLocated(editFundingStyle_xpath));
		editFundingStyleWebEelement.click();
		
return true;
	}
	catch(Exception ex){
		return false;
	}

	}

public boolean FundingStyleBatchCashTypeVerify()
{
try{

	WebElement BAtchCashtypeFundingStyleWebEelement=new WebDriverWait(driver,100)
	.until(ExpectedConditions.visibilityOfElementLocated(batchCashType_xpath));
	BAtchCashtypeFundingStyleWebEelement.click();
	
return true;
}
catch(Exception ex){
	return false;
}

}

public String FundingStyleBatchCashTypeSelect(String cashType) throws InterruptedException{
	

	WebDriverWait wait = new WebDriverWait(driver, 60);
	wait.until(ExpectedConditions.visibilityOfElementLocated((batchCashType_xpath)));

	WebElement element = driver.findElement((batchCashType_xpath));
	Select sel = new Select(element);
	List<WebElement> list = sel.getOptions();	
	
	
	for(WebElement ele : list){
		
		if(ele.getText().equals(cashType)){
			ele.click();
			Thread.sleep(10000);
			break;
		}
	}
	return cashType;

}



public boolean FundingStyleCancelBtnVerify()
{
try{

	WebElement CancelBtnFundingStyleWebEelement=new WebDriverWait(driver,100)
	.until(ExpectedConditions.visibilityOfElementLocated(saveBtnClick_xpath));
	CancelBtnFundingStyleWebEelement.isDisplayed();
	
return true;
}
catch(Exception ex){
	return false;
}

}
	
public boolean FundingStyleSaveBtnVerify()
{
try{

	WebElement SaveBtnFundingStyleWebEelement=new WebDriverWait(driver,100)
	.until(ExpectedConditions.visibilityOfElementLocated(saveBtnClick_xpath));
	SaveBtnFundingStyleWebEelement.click();
	Thread.sleep(10000);
	
return true;
}
catch(Exception ex){
	return false;
}

}


public String selectValueInSourceTypeDropdown(String sourceypeLabel) throws InterruptedException{
	

	WebDriverWait wait = new WebDriverWait(driver, 60);
	wait.until(ExpectedConditions.visibilityOfElementLocated((sourceTypeValue_xpath)));

	WebElement element = driver.findElement((sourceTypeValue_xpath));
	Select sel = new Select(element);
	List<WebElement> list = sel.getOptions();	
	
	
	for(WebElement ele : list){
		
		if(ele.getText().equals(sourceypeLabel)){
			ele.click();
			Thread.sleep(2000);
			break;
		}
	}
	return sourceypeLabel;

}


public String CashAppTotalAmountVerify(String totalAmount)
{
try{
	WebElement TotalAmount_CashAppWebEelement=new WebDriverWait(driver,200)
	.until(ExpectedConditions.visibilityOfElementLocated(totalAmountTextBox_xpath));
	TotalAmount_CashAppWebEelement.clear();
	TotalAmount_CashAppWebEelement.sendKeys(totalAmount);
	Thread.sleep(2000);

}
catch(Exception ex){

}
return totalAmount;

}


public String selectValueInCashTypeDropdown(String cashTypeLabel) throws InterruptedException{
	

	WebDriverWait wait = new WebDriverWait(driver, 60);
	wait.until(ExpectedConditions.visibilityOfElementLocated((cashTypeValue_xpath)));

	WebElement element = driver.findElement((cashTypeValue_xpath));
	Select sel = new Select(element);
	List<WebElement> list = sel.getOptions();	
	
	
	for(WebElement ele : list){
		
		if(ele.getText().equals(cashTypeLabel)){
			ele.click();
			Thread.sleep(10000);
			break;
		}
	}
	return cashTypeLabel;

}

public String selectValueInSplitImageDropdown(String splitImageLabel) throws InterruptedException{
	

	WebDriverWait wait = new WebDriverWait(driver, 60);
	wait.until(ExpectedConditions.visibilityOfElementLocated((splitImageValue_xpath)));

	WebElement element = driver.findElement((splitImageValue_xpath));
	Select sel = new Select(element);
	List<WebElement> list = sel.getOptions();	
	
	
	for(WebElement ele : list){
		
		if(ele.getText().equals(splitImageLabel)){
			ele.click();
			Thread.sleep(2000);
			break;
		}
	}
	return splitImageLabel;

}

public boolean clickOnChooseFile_BatchImage(){
	
	try{
		WebElement chooseFileWebEelement=new WebDriverWait(driver,60)
		.until(ExpectedConditions.visibilityOfElementLocated(chooseFile_xpath));
		chooseFileWebEelement.isDisplayed();
		chooseFileWebEelement.click();
		Thread.sleep(7000);
		return true;
	}
	catch(Exception ex){
		return false;
	}

	}
	

public boolean  fileUPload_BatchImage(){
	
	
	try {	
		StringSelection ss = new StringSelection("D:\\Cync_master\\cyncautomation\\cyncautomation\\Cync_Automation_Project\\src\\test\\resources\\cash1.pdf");
		
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
				
		Thread.sleep(5000);
		return true;
	} catch (Exception e) {
		// TODO: handle exception
	}
	return false;
	
}
	
/*public String selectClientFromClientDropdown(String selectClient) throws InterruptedException{
	

	WebDriverWait wait = new WebDriverWait(driver, 60);
	wait.until(ExpectedConditions.visibilityOfElementLocated((clientValue_xpath)));

	WebElement element = driver.findElement((clientValue_xpath));
	Select sel = new Select(element);
	List<WebElement> list = sel.getOptions();	
	
	
	for(WebElement ele : list){
		
		if(ele.getText().equals(selectClient)){
			ele.click();
			Thread.sleep(10000);
			break;
		}
	}
	return selectClient;

}*/

/*public String selectAccDebtorFromDropdown(String selectDebtor) throws InterruptedException{
	

	WebDriverWait wait = new WebDriverWait(driver, 60);
	wait.until(ExpectedConditions.visibilityOfElementLocated((debtorValue_xpath)));

	WebElement element = driver.findElement((debtorValue_xpath));
	Select sel = new Select(element);
	List<WebElement> list = sel.getOptions();	
	
	
	for(WebElement ele : list){
		
		if(ele.getText().equals(selectDebtor)){
			ele.click();
			Thread.sleep(2000);
			break;
		}
	}
	return selectDebtor;

}*/


public String CashAppBankRoutingNo(String RoutingNum)
{
try{
	WebElement RoutingNumCashAppWebEelement=new WebDriverWait(driver,200)
	.until(ExpectedConditions.visibilityOfElementLocated(bankRoutingNumTextBox_xpath));
	RoutingNumCashAppWebEelement.clear();
	RoutingNumCashAppWebEelement.sendKeys(RoutingNum);
	Thread.sleep(2000);

}
catch(Exception ex){

}
return RoutingNum;

}

public String CashAppBankAccountNo(String AccountNum)
{
try{
	WebElement AccountNumCashAppWebEelement=new WebDriverWait(driver,200)
	.until(ExpectedConditions.visibilityOfElementLocated(bankAccountNumTextBox_xpath));
	AccountNumCashAppWebEelement.clear();
	AccountNumCashAppWebEelement.sendKeys(AccountNum);
	Thread.sleep(5000);

}
catch(Exception ex){

}
return AccountNum;

}



/*public String CashAppCheckNo(String CheckNum)
{
try{
	WebElement CheckNumCashAppWebEelement=new WebDriverWait(driver,200)
	.until(ExpectedConditions.visibilityOfElementLocated(checkNumTextBox_xpath));
	CheckNumCashAppWebEelement.sendKeys(CheckNum);
	Thread.sleep(5000);

}
catch(Exception ex){

}
return CheckNum;

}*/

public boolean CashAppCheckNo(){
	try {
		WebElement chkWebElement = new WebDriverWait(driver,
				100)
				.until(ExpectedConditions
						.visibilityOfElementLocated(checkNumTextBox_xpath));
		Date date = new Date(System.currentTimeMillis());
		SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");
		String today=formatter.format(date);
		chkWebElement.clear();
		
		chkWebElement.sendKeys(today);
		Thread.sleep(2000);
		
		return true;
	} catch (Exception e) {
		return false;
	}
}



public String CashAppCheckAmount(String CheckAmount)
{
try{
	WebElement CheckAmountCashAppWebEelement=new WebDriverWait(driver,200)
	.until(ExpectedConditions.visibilityOfElementLocated(checkAmountTextBox_xpath));
	CheckAmountCashAppWebEelement.clear();
	CheckAmountCashAppWebEelement.sendKeys(CheckAmount);
	Thread.sleep(2000);

}
catch(Exception ex){

}
return CheckAmount;

}

public boolean BatchCashSaveBtnFunction()
{
try{

	WebElement batchSaveBtnWebEelement=new WebDriverWait(driver,100)
	.until(ExpectedConditions.visibilityOfElementLocated(batchSaveBtn_xpath));
	batchSaveBtnWebEelement.click();
	Thread.sleep(10000);
	driver.navigate().refresh();
	Thread.sleep(5000);
	
return true;
}
catch(Exception ex){
	return false;
}

}

public boolean BatchCashSuccessMsgClose()
{
try{

	WebElement batchSaveMsgCloseWebEelement=new WebDriverWait(driver,100)
	.until(ExpectedConditions.visibilityOfElementLocated(batchSaveSuvvessMsgClose_xpath));
	batchSaveMsgCloseWebEelement.click();
	Thread.sleep(2000);
	
return true;
}
catch(Exception ex){
	return false;
}

}


public boolean BatchCashSaveSuccessMsg()
{
try{

	WebElement batchSaveMsgWebEelement=new WebDriverWait(driver,100)
	.until(ExpectedConditions.visibilityOfElementLocated(batchSaveSuvvessMsg_xpath));
	batchSaveMsgWebEelement.isDisplayed();
	Thread.sleep(3000);

	
return true;
}
catch(Exception ex){
	return false;
}

}

public boolean BatchCashExtBatchClick()
{
try{

	WebElement extBatchWebEelement=new WebDriverWait(driver,100)
	.until(ExpectedConditions.visibilityOfElementLocated(extBatchSelect_xpath));
	extBatchWebEelement.click();

return true;
}
catch(Exception ex){
	return false;
}

}	


public boolean BatchCashExtBatchSelect()
{
try{

	WebElement extBatchSelectWebEelement=new WebDriverWait(driver,100)
	.until(ExpectedConditions.visibilityOfElementLocated(extSelectBatch_xpath));
	extBatchSelectWebEelement.click();
	Thread.sleep(5000);


return true;
}
catch(Exception ex){
	return false;
}

}	


public boolean BatchCashImageMapping()
{
try{
	
	 /*WebElement batchImgMappingWebEelement=driver.findElement(batchCashImaMapping_xpath);*/

	WebElement batchImgMappingWebEelement=new WebDriverWait(driver,100)
	.until(ExpectedConditions.visibilityOfElementLocated(batchCashImaMapping_xpath));
	batchImgMappingWebEelement.click();

	Alert alertOK = driver.switchTo().alert();
	alertOK.accept();
	Thread.sleep(3000);
	
return true;
}
catch(Exception ex){
	return false;
}

}

public boolean BatchCashImgMappingCheckBox()
{
try{

	WebElement batchImgMapWebEelement=new WebDriverWait(driver,100)
	.until(ExpectedConditions.visibilityOfElementLocated(checkDebtorMapping_xpath));
	batchImgMapWebEelement.click();
	Thread.sleep(5000);

	
return true;
}
catch(Exception ex){
	return false;
}

}

public boolean BatchCashImgMappingSelectImg()
{
try{

	WebElement batchSelectImgWebEelement=new WebDriverWait(driver,100)
	.until(ExpectedConditions.visibilityOfElementLocated(checkImageSelect_xpath));
	batchSelectImgWebEelement.click();
	Thread.sleep(5000);

	
return true;
}
catch(Exception ex){
	return false;
}

}

public boolean BatchCashImgMappingSaveBtn()
{
try{

	WebElement batchSelectImgSaveWebEelement=new WebDriverWait(driver,100)
	.until(ExpectedConditions.visibilityOfElementLocated(checkImageSaveBtn_xpath));
	batchSelectImgSaveWebEelement.click();
	Thread.sleep(4000);

	
return true;
}
catch(Exception ex){
	return false;
}

}

public boolean SplitImageNo_ViewAttachment()
{
try{

	WebElement viewAttachWebEelement=new WebDriverWait(driver,100)
	.until(ExpectedConditions.visibilityOfElementLocated(viewAttachment_xpath));
	viewAttachWebEelement.click();
	Thread.sleep(2000);

	
return true;
}
catch(Exception ex){
	return false;
}

}


public boolean SplitImageNo_ViewAttachment_Image()
{
try{

	WebElement viewAttachImageWebEelement=new WebDriverWait(driver,100)
	.until(ExpectedConditions.visibilityOfElementLocated(viewAttachmentImage_xpath));
	viewAttachImageWebEelement.isDisplayed();
	Thread.sleep(2000);

	
return true;
}
catch(Exception ex){
	return false;
}

}


public boolean SplitImageNo_ViewAttachmentImageLink()
{
try{

	WebElement viewAttachWebEelement=new WebDriverWait(driver,100)
	.until(ExpectedConditions.visibilityOfElementLocated(viewAttachmentImageLink_xpath));
	viewAttachWebEelement.click();
	Alert alertOK = driver.switchTo().alert();
	alertOK.accept();
	Thread.sleep(10000);

	
return true;
}
catch(Exception ex){
	return false;
}

}


public boolean BatchCashMappingIcon()
{
try{

	WebElement batchSelectIconWebEelement=new WebDriverWait(driver,100)
	.until(ExpectedConditions.visibilityOfElementLocated(checkImageIconLink_xpath));
	batchSelectIconWebEelement.isDisplayed();
	Thread.sleep(2000);

	
return true;
}
catch(Exception ex){
	return false;
}

}

public boolean BatchCashImgMappingClose()
{
try{

	WebElement batchImgMappingCloseWebEelement=new WebDriverWait(driver,100)
	.until(ExpectedConditions.visibilityOfElementLocated(checkImagePopupClose_xpath));
	batchImgMappingCloseWebEelement.click();
	Thread.sleep(10000);

	
return true;
}
catch(Exception ex){
	return false;
}

}


public boolean BatchCashImageIconDisplayed()
{
try{

	WebElement batchImageIconWebEelement=new WebDriverWait(driver,100)
	.until(ExpectedConditions.visibilityOfElementLocated(ImageIconLink_xpath));
	batchImageIconWebEelement.isDisplayed();
	Thread.sleep(2000);

	
return true;
}
catch(Exception ex){
	return false;
}

}

public boolean BatchCashMappingIconClick()
{
try{

	WebElement batchSelectIconWebEelement=new WebDriverWait(driver,100)
	.until(ExpectedConditions.visibilityOfElementLocated(checkImageIconLink_xpath));
	batchSelectIconWebEelement.click();
	Thread.sleep(5000);

	
return true;
}
catch(Exception ex){
	return false;
}

}


public boolean DeleteAssignClick()
{
try{

	WebElement imgAssignDeleteWebEelement=new WebDriverWait(driver,100)
	.until(ExpectedConditions.visibilityOfElementLocated(imgAssignDelete_xpath));
	imgAssignDeleteWebEelement.click();
	Thread.sleep(2000);

	
return true;
}
catch(Exception ex){
	return false;
}

}

public boolean DeleteAssignClick_NO()
{
try{

	WebElement imgAssignDeleteWebEelement=new WebDriverWait(driver,100)
	.until(ExpectedConditions.visibilityOfElementLocated(imgAssignDeleteNO_xpath));
	imgAssignDeleteWebEelement.click();
	Thread.sleep(2000);
	
return true;
}
catch(Exception ex){
	return false;
}

}

public boolean DeleteAssignClick_Yes()
{
try{

	WebElement imgAssignDeleteWebEelement=new WebDriverWait(driver,100)
	.until(ExpectedConditions.visibilityOfElementLocated(imgAssignDeleteYes_xpath));
	imgAssignDeleteWebEelement.click();
	Thread.sleep(5000);
	
return true;
}
catch(Exception ex){
	return false;
}

}

public boolean BatchCashImageIconClick()
{
try{

	WebElement batchImageIconWebEelement=new WebDriverWait(driver,100)
	.until(ExpectedConditions.visibilityOfElementLocated(ImageIconLink_xpath));
	batchImageIconWebEelement.click();
	Thread.sleep(5000);

	
return true;
}
catch(Exception ex){
	return false;
}

}

public boolean BatchCashInvoiceDetailsHyperlink()
{
try{

	WebElement batchDetailsLinkWebEelement=new WebDriverWait(driver,100)
	.until(ExpectedConditions.visibilityOfElementLocated(InvoiceDetailsHyperlink_xpath));
	batchDetailsLinkWebEelement.click();
	Thread.sleep(10000);

	
return true;
}
catch(Exception ex){
	return false;
}

}


public boolean InvoiceDetailsHyperlink_ApplyCheckBox()
{
try{

	WebElement batchApplyCheckWebEelement=new WebDriverWait(driver,100)
	.until(ExpectedConditions.visibilityOfElementLocated(ApplyCheckBox_xpath));
	batchApplyCheckWebEelement.click();
	Thread.sleep(2000);

	
return true;
}
catch(Exception ex){
	return false;
}

}

public boolean SelectedInvoice_ApplyCheckBox()
{
try{

	WebElement batchApplyCheckWebEelement=new WebDriverWait(driver,100)
	.until(ExpectedConditions.visibilityOfElementLocated(SelectedCheckBox_xpath));
	batchApplyCheckWebEelement.click();
	Thread.sleep(2000);

	
return true;
}
catch(Exception ex){
	return false;
}

}



public String CashAppApplyAmount(String ApplyAmount)
{
try{
	WebElement ApplyAmountCashAppWebEelement=new WebDriverWait(driver,200)
	.until(ExpectedConditions.visibilityOfElementLocated(applyAmountTextBox_xpath));
	ApplyAmountCashAppWebEelement.clear();
	ApplyAmountCashAppWebEelement.sendKeys(ApplyAmount);
	Thread.sleep(2000);

}
catch(Exception ex){

}
return ApplyAmount;

}


public String CashAppAdjustAmount(String AdjustAmount)
{
try{
	WebElement AdjustAmountCashAppWebEelement=new WebDriverWait(driver,200)
	.until(ExpectedConditions.visibilityOfElementLocated(adjustAmountTextBox_xpath));
	AdjustAmountCashAppWebEelement.clear();
	AdjustAmountCashAppWebEelement.sendKeys(AdjustAmount);
	Thread.sleep(2000);

}
catch(Exception ex){

}
return AdjustAmount;

}


public String selectValueInAdjustmentReasonDropdown(String adjustmentReason) throws InterruptedException{
	

	WebDriverWait wait = new WebDriverWait(driver, 60);
	wait.until(ExpectedConditions.visibilityOfElementLocated((adjustmentReasonValue_xpath)));

	WebElement element = driver.findElement((adjustmentReasonValue_xpath));
	Select sel = new Select(element);
	List<WebElement> list = sel.getOptions();	
	
	
	for(WebElement ele : list){
		
		if(ele.getText().equals(adjustmentReason)){
			ele.click();
			Thread.sleep(2000);
			break;
		}
	}
	return adjustmentReason;

}



public boolean InvPostBal(String expected) {
	try {
		WebElement InvPostBalWebElement = new WebDriverWait(driver, 100)
				.until(ExpectedConditions
						.visibilityOfElementLocated(InvPostBal_OP_xpath));

		String actual = InvPostBalWebElement.getText();
		if (actual.equals(expected))
			return true;
		else
			return false;

	} catch (Exception e) {
		return false;
	}
}



public boolean InvoiceDetailsPopup_SelectedInvoices()
{
try{

	WebElement batchSelectedInvoicesWebEelement=new WebDriverWait(driver,100)
	.until(ExpectedConditions.visibilityOfElementLocated(SelectedInvoices_xpath));
	batchSelectedInvoicesWebEelement.isDisplayed();

return true;
}
catch(Exception ex){
	return false;
}

}

public boolean InvoiceDetailsPopup_Savebtn()
{
try{

	WebElement batchSavebtnWebEelement=new WebDriverWait(driver,100)
	.until(ExpectedConditions.visibilityOfElementLocated(SaveBtnClick_xpath));
	batchSavebtnWebEelement.click();
	Thread.sleep(10000);

	
return true;
}
catch(Exception ex){
	return false;
}

}


public String CashAppInvoiceDetailsPopupSearch(String enterData)
{
try{
	WebElement InvoiceDetailsPopupSearchCashAppWebEelement=new WebDriverWait(driver,200)
	.until(ExpectedConditions.visibilityOfElementLocated(InvoiceDetailsPopupSearchTextBox_xpath));
	InvoiceDetailsPopupSearchCashAppWebEelement.clear();
	InvoiceDetailsPopupSearchCashAppWebEelement.sendKeys(enterData);
	Thread.sleep(5000);

}
catch(Exception ex){

}
return enterData;

}

public boolean CashAppInvoiceDetailsPopupSearch_Click()
{
try{

	WebElement InvoiceDetailsPopupSearchCashAppWebEelement=new WebDriverWait(driver,100)
	.until(ExpectedConditions.visibilityOfElementLocated(SearcgBtnClick_xpath));
	InvoiceDetailsPopupSearchCashAppWebEelement.click();
	Thread.sleep(5000);

return true;
}
catch(Exception ex){
	return false;
}

}

public boolean InvoiceDetailsPopup_SelectedInvoicesFunction()
{
try{

	WebElement batchSelectedInvoicesWebEelement=new WebDriverWait(driver,100)
	.until(ExpectedConditions.visibilityOfElementLocated(SelectedInvoices_xpath));
	batchSelectedInvoicesWebEelement.click();
	Thread.sleep(3000);

return true;
}
catch(Exception ex){
	return false;
}

}

public boolean InvoiceDetailsPopup_RemoveSelectedInvoicesFunction()
{
try{

	WebElement batchSelectedInvoicesRemoveWebEelement=new WebDriverWait(driver,100)
	.until(ExpectedConditions.visibilityOfElementLocated(RemoveSelectedRecord_xpath));
	batchSelectedInvoicesRemoveWebEelement.click();
	Thread.sleep(3000);
	Alert alertOK = driver.switchTo().alert();
	alertOK.accept();
	Thread.sleep(3000);
	

return true;
}
catch(Exception ex){
	return false;
}

}

public boolean InvoiceDetailsPopup_CloseFunction()
{
try{

	WebElement batchSelectedInvoicesWebEelement=new WebDriverWait(driver,100)
	.until(ExpectedConditions.visibilityOfElementLocated(InvoiceDetailsPopupClose));
	batchSelectedInvoicesWebEelement.click();
	Thread.sleep(2000);

return true;
}
catch(Exception ex){
	return false;
}

}

public boolean CashApp_AddNewCheck()
{
try{

	WebElement addCheckWebEelement=new WebDriverWait(driver,100)
	.until(ExpectedConditions.visibilityOfElementLocated(AddNewCheckBtn_xpath));
	addCheckWebEelement.click();
	Thread.sleep(5000);

return true;
}
catch(Exception ex){
	return false;
}

}


public boolean SelectClientFunction_AddNewCheck()
{
try{
    Thread.sleep(2000);
WebElement selectClientWebEelement=new WebDriverWait(driver,100)
.until(ExpectedConditions.visibilityOfElementLocated(AddCheckclientValue_xpath));
selectClientWebEelement.click();

return true;
}
catch(Exception ex){
return false;
}

}


public String addValueToSearch_AddNewCheck(String ClientData)
{
try{
WebElement searchClientTextBoxWebEelement=new WebDriverWait(driver,200)
.until(ExpectedConditions.visibilityOfElementLocated(searchClientTextBox_xpath));
searchClientTextBoxWebEelement.clear();
searchClientTextBoxWebEelement.sendKeys(ClientData);

}
catch(Exception ex){

}
return ClientData;

}


public boolean SearchClientClick_AddNewCheck()
{
try{

WebElement searchClientWebEelement=new WebDriverWait(driver,100)
.until(ExpectedConditions.visibilityOfElementLocated(searchClient_xpath));
searchClientWebEelement.click();
Thread.sleep(5000);



return true;
}
catch(Exception ex){
return false;
}

}


public boolean selectClientFromDropDown_AddNewCheck(String ClientData)
{
try{
this.SelectClientFunction_AddNewCheck();
this.addValueToSearch_AddNewCheck(ClientData);
this.SearchClientClick_AddNewCheck();



return true;
}
catch(Exception ex){
return false;
}

} 

public boolean SelectDebtorFunction_AddNewCheck()
{
try{
    Thread.sleep(2000);
/*WebElement selectDebtorWebEelement=new WebDriverWait(driver,100)
.until(ExpectedConditions.visibilityOfElementLocated(debtorValue_xpath));*/
    WebElement selectDebtorWebEelement=driver.findElement(AddNewCheckdebtorValue_xpath);
selectDebtorWebEelement.click();

return true;
}
catch(Exception ex){
return false;
}

}


public String addValueToDebtorSearch_AddNewCheck(String DebtorData)
{
try{
WebElement searchWebEelement=new WebDriverWait(driver,200)
.until(ExpectedConditions.visibilityOfElementLocated(searchDebtorTextBox_xpath));
searchWebEelement.clear();
searchWebEelement.sendKeys(DebtorData);

}
catch(Exception ex){

}
return DebtorData;

}


public boolean SearchDebtorClick_AddNewCheck()
{
try{

WebElement searchDebtorWebEelement=new WebDriverWait(driver,100)
.until(ExpectedConditions.visibilityOfElementLocated(searchDebtor_xpath));
searchDebtorWebEelement.click();


return true;
}
catch(Exception ex){
return false;
}

}


public boolean selectDebtorFromDropDown_AddNewCheck(String DebtorData)
{
try{
this.SelectDebtorFunction_AddNewCheck();
this.addValueToDebtorSearch_AddNewCheck(DebtorData);
this.SearchDebtorClick_AddNewCheck();

Thread.sleep(7000);

return true;
}
catch(Exception ex){
return false;
}

} 



public String CashAppBankRoutingNo_AddNewCheck(String RoutingNum)
{
try{
	WebElement RoutingNumCashAppWebEelement=new WebDriverWait(driver,200)
	.until(ExpectedConditions.visibilityOfElementLocated(AddCheckbankRoutingNumTextBox_xpath));
	RoutingNumCashAppWebEelement.clear();
	RoutingNumCashAppWebEelement.sendKeys(RoutingNum);
	Thread.sleep(2000);

}
catch(Exception ex){

}
return RoutingNum;

}

public String CashAppBankAccountNo_AddNewCheck(String AccountNum)
{
try{
	WebElement AccountNumCashAppWebEelement=new WebDriverWait(driver,200)
	.until(ExpectedConditions.visibilityOfElementLocated(AddCheckbankAccountNumTextBox_xpath));
	AccountNumCashAppWebEelement.clear();
	AccountNumCashAppWebEelement.sendKeys(AccountNum);
	Thread.sleep(5000);

}
catch(Exception ex){

}
return AccountNum;

}



/*public String CashAppCheckNo(String CheckNum)
{
try{
	WebElement CheckNumCashAppWebEelement=new WebDriverWait(driver,200)
	.until(ExpectedConditions.visibilityOfElementLocated(checkNumTextBox_xpath));
	CheckNumCashAppWebEelement.sendKeys(CheckNum);
	Thread.sleep(5000);

}
catch(Exception ex){

}
return CheckNum;

}*/

public boolean CashAppCheckNo_AddNewCheck(){
	try {
		WebElement chkWebElement = new WebDriverWait(driver,
				100)
				.until(ExpectedConditions
						.visibilityOfElementLocated(AddCheckcheckNumTextBox_xpath));
		Date date = new Date(System.currentTimeMillis());
		SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");
		String today=formatter.format(date);
		chkWebElement.clear();
		
		chkWebElement.sendKeys(today);
		Thread.sleep(2000);
		
		return true;
	} catch (Exception e) {
		return false;
	}
}



public String CashAppCheckAmount_AddNewCheck(String CheckAmount)
{
try{
	WebElement CheckAmountCashAppWebEelement=new WebDriverWait(driver,200)
	.until(ExpectedConditions.visibilityOfElementLocated(AddCheckcheckAmountTextBox_xpath));
	CheckAmountCashAppWebEelement.clear();
	CheckAmountCashAppWebEelement.sendKeys(CheckAmount);
	Thread.sleep(2000);

}
catch(Exception ex){

}
return CheckAmount;

}

public boolean CashApp_DeleteBatch()
{
try{

	WebElement deletebatchWebEelement=new WebDriverWait(driver,100)
	.until(ExpectedConditions.visibilityOfElementLocated(deleteBatchBtn_xpath));
	deletebatchWebEelement.click();
	Thread.sleep(5000);
	Alert alertOK = driver.switchTo().alert();
	alertOK.accept();
	Alert alertOOK = driver.switchTo().alert();
	alertOOK.accept();
	Thread.sleep(10000);
	driver.navigate().refresh();

return true;
}
catch(Exception ex){
	return false;
}

}


public boolean CashApp_NewBatch()
{
try{

	WebElement newBatchWebEelement=new WebDriverWait(driver,100)
	.until(ExpectedConditions.visibilityOfElementLocated(NewBatchBtn_xpath));
	newBatchWebEelement.click();
	Thread.sleep(5000);

return true;
}
catch(Exception ex){
	return false;
}

}



public boolean CashAppTotalAmount_DefaultValue()
{
try{

	WebElement DefaultValueWebEelement=new WebDriverWait(driver,100)
	.until(ExpectedConditions.visibilityOfElementLocated(totalAmountDefaultValue_xpath));
	DefaultValueWebEelement.isDisplayed();

return true;
}
catch(Exception ex){
	return false;
}

}


public boolean CheckEntry_ClientClick()
{
try{

	WebElement DefaultValueWebEelement=new WebDriverWait(driver,100)
	.until(ExpectedConditions.visibilityOfElementLocated(CheckEntryClientClick_xpath));
	DefaultValueWebEelement.click();
	Thread.sleep(3000);

return true;
}
catch(Exception ex){
	return false;
}

}


public String CheckEntryClientsearch_search(String enterClient)
{
try{
	WebElement CheckAmountCashAppWebEelement=new WebDriverWait(driver,200)
	.until(ExpectedConditions.visibilityOfElementLocated(CheckEntryClientsearch_xpath));
	CheckAmountCashAppWebEelement.clear();
	CheckAmountCashAppWebEelement.sendKeys(enterClient);
	Thread.sleep(2000);

}
catch(Exception ex){

}
return enterClient;

}


public boolean ClientSearch_verify()
{
try{

	WebElement DefaultValueWebEelement=new WebDriverWait(driver,100)
	.until(ExpectedConditions.visibilityOfElementLocated(ClientSearchVerify_xpath));
	DefaultValueWebEelement.isDisplayed();
	Thread.sleep(2000);

return true;
}
catch(Exception ex){
	return false;
}

}

}