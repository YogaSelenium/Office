package com.cync.FactoringPages;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.math.BigDecimal;
import java.math.RoundingMode;
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

public class BatchProcessScreenPageFactoring extends BasePage
{
	private final By BatchProcessScreenPageFactoring_xpath = By.xpath("//button[@class='link-height mat-menu-item2 ng-star-inserted link-active']");
	//private final By addNewBTN_xpath = By.xpath("//mat-icon[@class='mat-icon notranslate material-icons mat-icon-no-color']");
	private final By addNewBTN_xpath = By.xpath("//button[@class='primary-black add-button mat-mini-fab mat-accent ng-star-inserted']");
	private final By batchDate_xpath = By.xpath("//input[@class='form-input ng-pristine ng-valid ng-touched']");
	private final By batchRefNo_xpath = By.xpath("//input[@name='refBatch']");
	private final By batchAmt_xpath = By.xpath("//input[@name='totalAmount']");
	private final By batchAmtFieldAfterEdit_xpath = By.xpath("//div[@class='container batch-data']//div[3]//div[1]//input[1]");
	private final By checkTotAmt_xpath = By.xpath("//input[@name='checkAmount']");
	private final By appliedAmt_xpath = By.xpath("//input[@name='appliedTotals']");
	private final By browseFilesBTN_xpath = By.xpath("//input[@class='browse-btn']");
	private final By backToBatchBTN_xpath = By.xpath("//span[contains(text(),'Back to Batch list')]");
	private final By saveBatchBTN_xpath = By.xpath("//span[contains(text(),'Save Batch')]");
	private final By batchDateMsg_xpath = By.xpath("//span[contains(text(),' Batch Date is Today ')]");
	private final By saveAndCreateChkBTN_xpath = By.xpath("//button[@class='divRight cync-button-grey']");
	private final By successMsg_xpath = By.xpath("//div[@class='cdk-overlay-container']");

	private final By cientField_xpath = By.xpath("//label[text()='Client ']/following-sibling::input");
	private final By debtorField_xpath = By.xpath("//label[text()='Account Debtor']/following-sibling::input");

	
	private final By sourceType_xpath = By.xpath("//select[@name='statusFilter']");
	private final By checkRefNoField_xpath = By.xpath("//input[@name='checkno']");
	private final By checkAmtField_xpath = By.xpath("//div[@class='input-wrap']//input[@name='amount']");
	private final By bankRoutNoField_xpath = By.xpath("//input[@name='bankroutingno']");
	private final By bankAccNoField_xpath = By.xpath("//input[@name='bankaccountno']");
	private final By factPaymentsTag_xpath = By.xpath("//mat-panel-title[contains(text(),'Factoring Payments')]");



	//private final By invCheckBox_xpath = By.xpath("//div[@class='ag-row ag-row-no-focus ag-row-even ag-row-level-0 ag-row-position-absolute ag-row-first']//span[@class='ag-selection-checkbox']");

	//private final By invCheckBox_xpath = By.xpath("(//span[@class='ag-icon ag-icon-checkbox-unchecked' and @xpath='1']");


	private final By invCheckBox_xpath = By.xpath("(//*[@class='ag-cell ag-cell-not-inline-editing ag-cell-with-height ag-cell-no-focus']//following-sibling::span)[4]");
 
  //private final By invCheckBox_xpath = By.xpath("//div[@class='ag-row ag-row-odd ag-row-level-0 ag-row-position-absolute ag-row-focus']//span[@class='ag-icon ag-icon-checkbox-unchecked']");

	private final By applyAmtField_xpath = By.xpath("//html//body//app-root//div//app-create-check-route//app-batch//app-create-check//div//div//div//div//mat-accordion//mat-expansion-panel//div//div//div//mat-accordion//mat-expansion-panel//div//div//div//ag-grid-angular//div//div//div//div//div//div//div//div//div//app-on-account-grid-input//div//input[@name='apply_amount']");
	private final By applyAmtFieldShortPayment_xpath = By.xpath("//div[@class='ag-row ag-row-no-focus ag-row-even ag-row-level-0 ag-row-position-absolute ag-row-first']//input[@name='apply_amount']");
	private final By applyAmtField_NonFactored_xpath = By.xpath("(//*[@col-id='apply_amount']//descendant::input[@class='factoring-grid-input right-text-align ng-star-inserted'])[1]");
	private final By cancelBTN_xpath = By.xpath("//span[contains(text(),'Cancel')]");
	private final By saveBTN_xpath = By.xpath("//button[2]//span[1]");
	private final By saveBTNAfterEditBatch_xpath = By.xpath("//span[contains(text(),'Save Batch')]");
	private final By saveAndCreateCheckBTN_xpath = By.xpath("//span[contains(text(),'Save & New')]");
	private final By saveChkSuccessMsg_xpath = By.xpath("//span[contains(text(),'Check created successfully')]");
	private final By previewIcon_xpath = By.xpath("//img[@class='view-icons']");
	private final By editIcon_xpath = By.xpath("//body//img[2]");
	private final By deleteIcon_xpath = By.xpath("//body//img[3]");
	private final By batchChkBox1_xpath = By.xpath("(//div[@class='ag-center-cols-clipper']//div[1]//div[1]//span[1]//span[1]//span[2])[1]");
	private final By batchChkBox2_xpath = By.xpath("//div[@class='ag-center-cols-clipper']//div[2]//div[1]//span[1]//span[1]//span[2]");
	private final By processBTN_xpath = By.xpath("//span[contains(text(),'Process')]");
	private final By notificationIcon_xpath = By.xpath("//mat-icon[@class='not-icon mat-icon notranslate mat-badge material-icons mat-badge-warn mat-icon-no-color mat-badge-overlap mat-badge-above mat-badge-after mat-badge-medium']");
	private final By completedMsg_xpath = By.xpath("//div[contains(text(),'Batch process completed successfully.')]");
	private final By cancelBTNNot_xpath = By.xpath("//span[contains(text(),'Cancel')]");


	//private final By invDistriTag_xpath = By.xpath("(//mat-panel-title[@class='mat-expansion-panel-header-title'][contains(text(),'Invoice Distribution')])[2]");


	private final By invDistriTag_xpath = By.xpath("(//p[contains(text(),'By Invoice Distribution')])[2]");



	private final By invDistriTag2_xpath = By.xpath("//div[@class='container factoring-container']//span//mat-panel-title[text()=' Invoice Distribution ']");



	private final By OnAccountTag_xpath=By.xpath("//div[@class='container factoring-container']//span//mat-panel-title[text()='On Account']");


	//private final By OnAccountTag_xpath=By.xpath("(//p[contains(text(),'On Account')])[2]");


	public final By invoiceAmount_xpath=By.xpath("/html[1]/body[1]/app-root[1]/div[2]/app-create-check-route[1]/app-batch[1]/app-create-check[1]/div[2]/div[5]/div[2]/div[1]/mat-accordion[1]/mat-expansion-panel[2]/div[1]/div[1]/div[1]/mat-accordion[1]/mat-expansion-panel[1]/div[1]/div[1]/div[1]/section[2]/ag-grid-angular[1]/div[1]/div[2]/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[3]");
	private final By AdjustmentReason_xpath=By.xpath("(//div[@class='ng-star-inserted']//select[@name='adjustment_resoan'])[1]");
	private final By Applyamount_xpath=By.xpath("//div[@class='container factoring-container']//span//mat-panel-title[text()='On Account']");
	private final By AdjustmentAmtField_xpath=By.xpath("/html[1]/body[1]/app-root[1]/div[2]/app-create-check-route[1]/app-batch[1]/app-create-check[1]/div[2]/div[5]/div[2]/div[1]/mat-accordion[1]/mat-expansion-panel[2]/div[1]/div[1]/div[1]/mat-accordion[1]/mat-expansion-panel[1]/div[1]/div[1]/div[1]/section[2]/ag-grid-angular[1]/div[1]/div[2]/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[7]/app-factoring-grid-input[1]/div[1]/input[1]");
	private final By EditBatchBTN_xpath=By.xpath("//img[@class='edit-icon ng-star-inserted' and @title='Edit']");
	private final By ProcessBTN_xpath=By.xpath("(//div[@col-id='batch_no'])[2]//span[@class='process-icon sprite']");
	//private final By BatchNo_xpath=By.xpath("//span[@class='ng-tns-c19-1 ng-star-inserted']");
	private final By BatchNo_xpath=By.xpath("//div[@class='mat-select-value']//span/span");
	private final By BatchNo_SearchResult_xpath=By.xpath("//a[@class='link-color active-column']");
	private final By BatchNoSearchField_xpath=By.xpath("//div[@class='filter-div']//input");
	private final By Addinvoice_xpath=By.xpath("(//div[@class='title-div']//div//span[contains(text(),'Add Invoice')])[2]");
	private final By invoiceNoField_xpath = By.xpath("//input[@name='receivable_no']");
	public final By CurrentAmtField_xpath = By.xpath("//div[@class='ag-row ag-row-even ag-row-level-0 ag-row-position-absolute ag-row-first ag-row-focus']//div[4]");



	//public final By CurrentAmtField_NonFactored_xpath = By.xpath("//div[@class='ag-row ag-row-no-focus ag-row-even ag-row-level-0 ag-row-position-absolute ag-row-first']//div[4]");

	public final By CurrentAmtField_NonFactored_xpath = By.xpath("/html[1]/body[1]/app-root[1]/div[2]/app-create-check-route[1]/app-batch[1]/app-create-check[1]/div[2]/div[5]/div[2]/div[1]/mat-accordion[1]/mat-expansion-panel[2]/div[1]/div[1]/div[1]/mat-accordion[1]/mat-expansion-panel[1]/div[1]/div[1]/div[1]/section[2]/ag-grid-angular[1]/div[1]/div[2]/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[4]");
	public final By CurrentAmtField_Factored_xpath = By.xpath("//div[@tabindex='-1' and @role='gridcell' and @col-id='current_amount']");

	//private final By invDistriTag_xpath = By.xpath("//div[@class='container factoring-container']//span//div//p[text()=' By Invoice Distribution']");




	
	public BatchProcessScreenPageFactoring(WebDriver driver) {
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
			.until(ExpectedConditions.visibilityOfElementLocated(BatchProcessScreenPageFactoring_xpath));
		HeaderWebEelement.getText();
		Thread.sleep(2000);
    	}
    	catch(Exception e)
    	{
    		
    	}
    	return Header;
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
	
	/*public boolean clickAddNewBTN() {
		try
    	{
    		WebElement AddNewBTNEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(addNewBTN_xpath));
    		
    		AddNewBTNEelement.click();
    	//	AddNewBTNEelement.click();
    		//this.isAlertPresent();
            return true;
    	}
    	catch(Exception e)
    	{
    	   return false;	
    	}

	}*/
	public By add = By.xpath("//button[@class='primary-black add-button mat-mini-fab mat-accent ng-star-inserted']");
	public boolean clickElement(By test) {
        try {
            Thread.sleep(2000);
            WebElement element = new WebDriverWait(driver, 100)
                    .until(ExpectedConditions.visibilityOfElementLocated(add));
           
            element.click();
            Thread.sleep(500);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
	
	public boolean clickAddNewBTN() {
        try {
            Thread.sleep(1000);
            WebElement element = new WebDriverWait(driver, 10)
                    .until(ExpectedConditions.visibilityOfElementLocated(addNewBTN_xpath));
            Thread.sleep(1000);
            System.out.println("before clicking on By invoice");
            element.click();
            System.out.println("Clicked on Add Batch");
            // Thread.sleep(5000);
            return true;
        } catch (Exception e) {
            System.out.println("Inside catch block");
            e.printStackTrace();
            return false;
            
          }
         }
	public boolean VerifyBatchDate() {
		try
    	{
    		WebElement BatchDateEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(batchDate_xpath));
    		BatchDateEelement.isDisplayed();
  
            return true;
    	}
    	catch(Exception e)
    	{
    	   return false;	
    	}
	}
	public boolean VerifyRefBatchNo() {
		try
    	{
    		WebElement RefBatchNoEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(batchRefNo_xpath));
    		RefBatchNoEelement.isDisplayed();
  
            return true;
    	}
    	catch(Exception e)
    	{
    	   return false;	
    	}
	}
	public boolean VerifyBatchAmt() {
		try
    	{
    		WebElement BatchAmtEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(batchAmt_xpath));
    		BatchAmtEelement.isDisplayed();
  
            return true;
    	}
    	catch(Exception e)
    	{
    	   return false;	
    	}
	}
	public boolean VerifyCheckTotal() {
		try
    	{
    		WebElement CheckTotalEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(checkTotAmt_xpath));
    		CheckTotalEelement.isDisplayed();
  
            return true;
    	}
    	catch(Exception e)
    	{
    	   return false;	
    	}
	}
	public boolean VerifyAppliedAmt() {
		try
    	{
    		WebElement AppliedAmtEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(appliedAmt_xpath));
    		AppliedAmtEelement.isDisplayed();
  
            return true;
    	}
    	catch(Exception e)
    	{
    	   return false;	
    	}
	}
	public boolean VerifyBrowseFilesBTN() {
		try
    	{
    		WebElement BrowseFilesBTNEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(browseFilesBTN_xpath));
    		BrowseFilesBTNEelement.isDisplayed();
  
            return true;
    	}
    	catch(Exception e)
    	{
    	   return false;	
    	}
	}
	public boolean addValueToRefBatchNo(String refBatchNo) {
		try
    	{
    		WebElement RefBatchNoEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(batchRefNo_xpath));
    		RefBatchNoEelement.clear();
    		RefBatchNoEelement.sendKeys(refBatchNo);
  
            return true;
    	}
    	catch(Exception e)
    	{
    	   return false;	
    	}
	}
	public boolean addValueToBatchAmtAfterEditBatch(String applyAmtfetchedfromUI) {
		try
    	{
			
    		WebElement BatchAmtEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(batchAmtFieldAfterEdit_xpath));
    		BatchAmtEelement.clear();
    		
    		BatchAmtEelement.sendKeys(applyAmtfetchedfromUI);
  
            return true;
    	}
    	catch(Exception e)
    	{
    	   return false;	
    	}
	}
	public boolean addValueToBatchAmt(String batchamount) {
		try
    	{
			
    		WebElement BatchAmtEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(batchAmt_xpath));
    		BatchAmtEelement.clear();
    		BatchAmtEelement.sendKeys(batchamount);
  
            return true;
    	}
    	catch(Exception e)
    	{
    	   return false;	
    	}
	}
	public boolean VerifyBackToBatchBTN() {
		try
    	{
    		WebElement BackToBatchBTNEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(backToBatchBTN_xpath));
    		BackToBatchBTNEelement.isDisplayed();
  
            return true;
    	}
    	catch(Exception e)
    	{
    	   return false;	
    	}
	}
	public boolean VerifySaveBatchBTN() {
		try
    	{
    		WebElement SaveBatchBTNEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(saveBatchBTN_xpath));
    		SaveBatchBTNEelement.isDisplayed();
  
            return true;
    	}
    	catch(Exception e)
    	{
    	   return false;	
    	}
	}
	public boolean VerifyBatchDateMsg() {
		try
    	{
    		WebElement BatchDateMsgEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(batchDateMsg_xpath));
    		BatchDateMsgEelement.isDisplayed();
  
            return true;
    	}
    	catch(Exception e)
    	{
    	   return false;	
    	}
	}
	public boolean VerifySaveAndCreateCheckBTN() {
		try
    	{
    		WebElement SaveAndCreateCheckBTNEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(saveAndCreateChkBTN_xpath));
    		SaveAndCreateCheckBTNEelement.isDisplayed();
  
            return true;
    	}
    	catch(Exception e)
    	{
    	   return false;	
    	}
	}
	public boolean ClickSaveAndCreateCheckBTN() {
		try
    	{
    		WebElement SaveAndCreateCheckBTNEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(saveAndCreateChkBTN_xpath));
    		SaveAndCreateCheckBTNEelement.click();
            Thread.sleep(10000);
            return true;
    	}
    	catch(Exception e)
    	{
    	   return false;	
    	}
	}
	public boolean VerifySuccessMsg() {
		
		
		try
    	{
			Thread.sleep(2000);
    		WebElement SuccessMsgEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(successMsg_xpath));
    		SuccessMsgEelement.click();
  
            return true;
    	}
    	catch(Exception e)
    	{
    	   return false;	
    	}
	}
	public boolean addValueToClientField(String clientname) {
		try
    	{
    		WebElement ClientFieldEelement=new WebDriverWait(driver,800)
			.until(ExpectedConditions.visibilityOfElementLocated(cientField_xpath));
    		ClientFieldEelement.clear();
    		ClientFieldEelement.sendKeys(clientname);




    		Thread.sleep(500);
    		Robot rb = new Robot();
    		rb.keyPress(KeyEvent.VK_ENTER);


    		Thread.sleep(3000);
    		/*Robot rb = new Robot();
    		rb.keyPress(KeyEvent.VK_ENTER);
    		rb.keyPress(KeyEvent.VK_ENTER);*/
    		ClientFieldEelement.sendKeys(Keys.ENTER);




    		Thread.sleep(3000);
    		/*Robot rb = new Robot();
    		rb.keyPress(KeyEvent.VK_ENTER);
    		rb.keyPress(KeyEvent.VK_ENTER);*/
    		ClientFieldEelement.sendKeys(Keys.ENTER);

    		

            Thread.sleep(1000);
            return true;
    	}
    	catch(Exception e)
    	{
    	   return false;	
    	}
	}
	public boolean addValueToDebtorField(String debtorname) {
		try
    	{
    		WebElement DebtorFieldEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(debtorField_xpath));
    		DebtorFieldEelement.clear();
    		DebtorFieldEelement.sendKeys(debtorname);
    		Thread.sleep(500);
    		Robot rb = new Robot();
    		rb.keyPress(KeyEvent.VK_ENTER);
            Thread.sleep(1000);
            return true;
    	}
    	catch(Exception e)
    	{
    	   return false;	
    	}
	}
	
	private final By debtor_xpath = By.xpath("//div[@role='listbox']/mat-option[2]");
	public boolean SelectValueFromDebtorFieldDropDown() {
		try
    	{
    		WebElement DebtorFieldEelement=new WebDriverWait(driver,2000)
			.until(ExpectedConditions.visibilityOfElementLocated(debtorField_xpath));
    		DebtorFieldEelement.click();
    	    Thread.sleep(2000);
    		
    	    WebElement DebtorEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(debtor_xpath));
    		DebtorEelement.click();
    	    
    		Thread.sleep(500);
    		/*Robot rb = new Robot();
    		rb.keyPress(KeyEvent.VK_ENTER);*/
    		
    		//Select at=new Select(DebtorFieldEelement);
    		//at.selectByIndex(1);
    		
            Thread.sleep(1000);
            return true;
    	}
    	catch(Exception e)
    	{
    	   return false;	
    	}
	}
	
	
	
	
	public boolean SelectSourceType(String sourcetype) {
		try {
			WebElement SourceTypeWebEelement = new WebDriverWait(
					driver, 20).until(ExpectedConditions
					.visibilityOfElementLocated(sourceType_xpath));
			Select sel = new Select(SourceTypeWebEelement);
			List<WebElement> list = sel.getOptions();
			for (WebElement ele : list) {
				if (ele.getText().equals(sourcetype)) {
					ele.click();
					Thread.sleep(1000);

					 return true;
				}
			}

		} catch (Exception ex) {
		}
		return false;
	}
	
	
	
	public boolean addValueToCheckNoField(String checkrefno) {
		try
    	{
    		WebElement CheckNoFieldEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(checkRefNoField_xpath));
    		CheckNoFieldEelement.clear();
    		CheckNoFieldEelement.sendKeys(checkrefno);
  
            return true;
    	}
    	catch(Exception e)
    	{
    	   return false;	
    	}
	}
	public boolean addValueToCheckAmtField(String checkamount) {
		try
    	{
			
			
    		WebElement CheckAmtFieldEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(checkAmtField_xpath));
    		CheckAmtFieldEelement.clear();
    		CheckAmtFieldEelement.sendKeys(checkamount);
  
            return true;
    	}
    	catch(Exception e)
    	{
    	   return false;	
    	}
	}
	public boolean addValueToinvoiceNoField(String invoiceNo) {
		try
    	{
			
			
    		WebElement CheckAmtFieldEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(invoiceNoField_xpath));
    		CheckAmtFieldEelement.clear();
    		CheckAmtFieldEelement.sendKeys(invoiceNo);
  
            return true;
    	}
    	catch(Exception e)
    	{
    	   return false;	
    	}
	}
	public boolean addValueToBatchNoSearchField(String BatchNo) {
		try
    	{
			
			
    		WebElement CheckAmtFieldEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(BatchNoSearchField_xpath));
    		CheckAmtFieldEelement.clear();
    		CheckAmtFieldEelement.sendKeys(BatchNo);
  
            return true;
    	}
    	catch(Exception e)
    	{
    	   return false;	
    	}
	}
	public boolean addValueToCheckAmtFieldFromApplyamount() {
		try
    	{
			WebElement invoiceAmtFieldEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(CurrentAmtField_NonFactored_xpath));
			
			String invAmount=invoiceAmtFieldEelement.getText();
			
			String invAmountWthOutCma=  invAmount.replaceAll(",","");
			
	        double d = Double.parseDouble(invAmountWthOutCma);
				
		     String invStr = Double.toString(d);
			
    		WebElement CheckAmtFieldEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(checkAmtField_xpath));
    		CheckAmtFieldEelement.clear();
    		CheckAmtFieldEelement.sendKeys(invStr);
  
            return true;
    	}
    	catch(Exception e)
    	{
    	   return false;	
    	}
	}
	public boolean addValueToApplyAmtFieldFromCurrentamount() {
		try
    	{
			WebElement invoiceAmtFieldEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(CurrentAmtField_Factored_xpath));
			
			String invAmount=invoiceAmtFieldEelement.getText();
			
			String invAmountWthOutCma=  invAmount.replaceAll(",","");
			
	       // double d = Double.parseDouble(invAmountWthOutCma);
				
		   //  String invStr = Double.toString(d);
			
    		WebElement CheckAmtFieldEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(applyAmtField_xpath));
    		CheckAmtFieldEelement.clear();
    		CheckAmtFieldEelement.sendKeys(invAmountWthOutCma);
  
            return true;
    	}
    	catch(Exception e)
    	{
    	   return false;	
    	}
	}
	
	public boolean addValueToCheckAmtField_ShortPayment(String Amt) {
		try
    	{
			
    		WebElement CheckAmtFieldEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(checkAmtField_xpath));
    		CheckAmtFieldEelement.clear();
    		CheckAmtFieldEelement.sendKeys(Amt);
  
            return true;
    	}
    	catch(Exception e)
    	{
    	   return false;	
    	}
	}
	
	public boolean addValueToCheckAmtField_PartialPayment(String Amt) {
		try
    	{
			
    		WebElement CheckAmtFieldEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(checkAmtField_xpath));
    		CheckAmtFieldEelement.clear();
    		CheckAmtFieldEelement.sendKeys(Amt);
  
            return true;
    	}
    	catch(Exception e)
    	{
    	   return false;	
    	}
	}
	public boolean addValueToCheckAmtField_OverPayment(String Amt) {
		try
    	{
			
    		WebElement CheckAmtFieldEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(checkAmtField_xpath));
    		CheckAmtFieldEelement.clear();
    		CheckAmtFieldEelement.sendKeys(Amt);
  
            return true;
    	}
    	catch(Exception e)
    	{
    	   return false;	
    	}
	}
	public boolean ClickBatchEditIcon() {
		try
    	{
    		WebElement EditIconEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(EditBatchBTN_xpath));
    		EditIconEelement.click();
  
            return true;
    	}
    	catch(Exception e)
    	{
    	   return false;	
    	}
	}
	
	
	public boolean batchNumberMouseHover() {
        try {
            Thread.sleep(3000);
            WebElement element = new WebDriverWait(driver,10)
                    .until(ExpectedConditions.visibilityOfElementLocated(BatchNo_SearchResult_xpath));
            Actions act=new Actions(driver);
            act.moveToElement(element).build().perform();
             //**
            return true;
        } catch (Exception e) {
            return false;
        }
    }
	public boolean ProcessBatchBTN() {
        try {
            Thread.sleep(3000);
            WebElement element = new WebDriverWait(driver,100)
                    .until(ExpectedConditions.visibilityOfElementLocated(ProcessBTN_xpath));
            Actions act=new Actions(driver);
            act.moveToElement(element).build().perform();
               act.click();
               element.click();
            return true;
        } catch (Exception e) {
            return false;
        }
    }
	
	public boolean VerifyBankRoutingNoField() {
		try
    	{
    		WebElement BankRoutingNoFieldEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(bankRoutNoField_xpath));
    		BankRoutingNoFieldEelement.isDisplayed();
  
            return true;
    	}
    	catch(Exception e)
    	{
    	   return false;	
    	}
	}
	public boolean VerifyBankAccNoField() {
		try
    	{
    		WebElement BankAccNoFieldEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(bankAccNoField_xpath));
    		BankAccNoFieldEelement.isDisplayed();
  
            return true;
    	}
    	catch(Exception e)
    	{
    	   return false;	
    	}
	}
	public boolean VerifyFactPaymentsTag() {
		try
    	{
    		WebElement FactPaymentsTagEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(factPaymentsTag_xpath));
    		FactPaymentsTagEelement.click();
  
            return true;
    	}
    	catch(Exception e)
    	{
    	   return false;	
    	}
	}
	public boolean CheckOnInvCheckBox() {
		try
    	{
			Thread.sleep(500);
    		WebElement InvCheckBoxEle=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(invCheckBox_xpath));
    		InvCheckBoxEle.click();
    		//InvCheckBoxEle.click();
    		
            Actions act=new Actions(driver);
            act.click(InvCheckBoxEle).build().perform();
            
           // action.doubleClick(clickTosecondeditbox).build().perform();
            return true;
    	}
    	catch(Exception e)
    	{
    	   return false;	
    	}
	}
	
	
	public String getValueFromFactoredCinvoiceAmtField(By path) {
		try
    	{
			WebElement invoiceAmtFieldEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(path));
			
			String invAmount=invoiceAmtFieldEelement.getText();
			
			String invAmountWthOutCma=  invAmount.replaceAll(",","");
			
	        double d = Double.parseDouble(invAmountWthOutCma);
	        
	        double bigDouble= BigDecimal.valueOf(d).setScale(2, RoundingMode.HALF_UP).doubleValue();
	        
		    // String invStr = Double.toString(d);
		     
		     String invStr = Double.toString(bigDouble);
	
			
            return invStr;
    	}
    	catch(Exception e)
    	{
    	   return null;	
    	}
	}
	public String getValueFromBatchNoField() {
		try
    	{
			WebElement invoiceAmtFieldEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(BatchNo_xpath));
			
			String BatchNo=invoiceAmtFieldEelement.getText();
			
			//String invAmountWthOutCma=  invAmount.replaceAll(",","");
			
	       // double d = Double.parseDouble(invAmountWthOutCma);
				
		   //  String invStr = Double.toString(d);
	       
			
            return BatchNo;
    	}
    	catch(Exception e)
    	{
    	   return null;	
    	}
	}
	
	
	/*public String addValueToFactoredApplyAmtField(String applyAmtfetchedfromUI) {

		try
    	{
			WebElement invoiceAmtFieldEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(invoiceAmount_xpath));
			
			String invAmount=invoiceAmtFieldEelement.getText();
			
			String invAmountWthOutCma=  invAmount.replaceAll(",","");
			
	        double d = Double.parseDouble(invAmountWthOutCma);
				
		     String invStr = Double.toString(d);
	
			//Thread.sleep(500);


		try
    	{
			WebElement invoiceAmtFieldEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(invoiceAmount_xpath));
			
			String invAmount=invoiceAmtFieldEelement.getText();
			
			String invAmountWthOutCma=  invAmount.replaceAll(",","");
			
	        double d = Double.parseDouble(invAmountWthOutCma);
				
		     String invStr = Double.toString(d);
	
			//Thread.sleep(500);

    		WebElement ApplyAmtFieldEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(applyAmtField_xpath));
    		ApplyAmtFieldEelement.clear();
    		ApplyAmtFieldEelement.sendKeys(applyAmtfetchedfromUI);
            Thread.sleep(1000);
            return applyAmtfetchedfromUI;
    	}
    	catch(Exception e)
    	{
    	   return null;	
    	}
	}*/
	
	public boolean addValueToNonFactoredApplyAmtFieldii() {
		try
    	{
			WebElement invoiceAmtFieldEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(invoiceAmount_xpath));
			
			String invAmount=invoiceAmtFieldEelement.getText();
			
			String invAmountWthOutCma=  invAmount.replaceAll(",","");
			
	        double d = Double.parseDouble(invAmountWthOutCma);
				
		     String invStr = Double.toString(d);
	
			//Thread.sleep(500);

    		WebElement ApplyAmtFieldEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(applyAmtField_xpath));
    		ApplyAmtFieldEelement.clear();
    		ApplyAmtFieldEelement.sendKeys(invStr);
  
            return true;
    	}
    	catch(Exception e)
    	{
    	   return false;	
    	}
	}



	private final By OverapplyAmtField_xpath = By.xpath("//div[@class='ag-row ag-row-no-focus ag-row-even ag-row-level-0 ag-row-position-absolute ag-row-first']//input[@name='apply_amount']");
	
	public boolean addValueToOverPaymentApplyAmtField() {
		try
    	{
			WebElement CurrentAmtFieldEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(CurrentAmtField_NonFactored_xpath));
			
			String CurrentAmount=CurrentAmtFieldEelement.getText();
			
			String CurrentAmount_Without_Coma=  CurrentAmount.replaceAll(",","");
			
	        double d = Double.parseDouble(CurrentAmount_Without_Coma);
				double d1=d+(d/2);
		     String CurrentAmt_Calculated = Double.toString(d1);
	
			Thread.sleep(500);

    		WebElement ApplyAmtFieldEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(OverapplyAmtField_xpath));
    		ApplyAmtFieldEelement.clear();
    		ApplyAmtFieldEelement.sendKeys("6000");
    		ApplyAmtFieldEelement.clear();
    		ApplyAmtFieldEelement.sendKeys(CurrentAmt_Calculated);



			//Thread.sleep(500);



            return true;
    	}
    	catch(Exception e)
    	{
    	   return false;	
    	}
	}
	
	
	
	/*public boolean addValueToApplyAmtField(String applyamount) {
		try
    	{
			WebElement invoiceAmtFieldEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(invoiceAmount_xpath));
			
			String invAmount=invoiceAmtFieldEelement.getText();
			int amountint=Integer.parseInt(invAmount);
			int amountint2=amountint-100;
			String applyamount1 = Integer.toString(amountint2);
			
			Thread.sleep(4000);
			

    		WebElement ApplyAmtFieldEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(applyAmtField_xpath));

    		ApplyAmtFieldEelement.clear();
    		ApplyAmtFieldEelement.sendKeys(applyAmtfetchedfromUI);
            Thread.sleep(1000);
            return applyAmtfetchedfromUI;
    	}
    	catch(Exception e)
    	{
    	   return null;	
    	}
	}*/

	public String addValueToNonFactoredApplyAmtField(String applyAmtfetchedfromUI) {
		try
    	{
			/*WebElement invoiceAmtFieldEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(invoiceAmount_xpath));
			
			String invAmount=invoiceAmtFieldEelement.getText();
			
			String invAmountWthOutCma=  invAmount.replaceAll(",","");
			
	        double d = Double.parseDouble(invAmountWthOutCma);
				
		     String invStr = Double.toString(d);
	
			//Thread.sleep(500);
*/          System.out.println("-------------------------->"+applyAmtfetchedfromUI);
    		WebElement ApplyAmtFieldEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(applyAmtField_NonFactored_xpath));
    		//ApplyAmtFieldEelement.click();
    		
    		
    		Actions act1=new Actions(driver);
    	//	act.moveToElement(ApplyAmtFieldEelement).click().build().perform();
    		//act.click().build().perform();
    		act1.moveToElement(ApplyAmtFieldEelement).sendKeys(applyAmtfetchedfromUI).build().perform();
    		
    		ApplyAmtFieldEelement.clear();
    		ApplyAmtFieldEelement.sendKeys(applyAmtfetchedfromUI);
            Thread.sleep(1000);
            return applyAmtfetchedfromUI;
    	}
    	catch(Exception e)
    	{
    	   return null;	
    	}
	}
	public boolean addValueToNonFactoredApplyAmtField() {
		try
    	{
			WebElement invoiceAmtFieldEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(invoiceAmount_xpath));
			
			String invAmount=invoiceAmtFieldEelement.getText();
			
			String invAmountWthOutCma=  invAmount.replaceAll(",","");
			
	        double d = Double.parseDouble(invAmountWthOutCma);
				
		     String invStr = Double.toString(d);
	
			//Thread.sleep(500);

    		WebElement ApplyAmtFieldEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(applyAmtField_xpath));
    		ApplyAmtFieldEelement.clear();
    		ApplyAmtFieldEelement.sendKeys(invStr);
            String applyamount="";
    		//ApplyAmtFieldEelement.clear();

    		ApplyAmtFieldEelement.sendKeys(applyamount);

  
            return true;
    	}
    	catch(Exception e)
    	{
    	   return false;	
    	}
	}
	public boolean addValueToOnAccountApplyAmtField() {
		try
    	{
			WebElement invoiceAmtFieldEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(invoiceAmount_xpath));
			
			String invAmount=invoiceAmtFieldEelement.getText();
			
			String invAmountWthOutCma=  invAmount.replaceAll(",","");
			
	        double d = Double.parseDouble(invAmountWthOutCma);
				
		     String invStr = Double.toString(d);
	
			//Thread.sleep(500);

    		WebElement ApplyAmtFieldEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(applyAmtField_xpath));
    		ApplyAmtFieldEelement.clear();
    		ApplyAmtFieldEelement.sendKeys(invStr);
            String applyamount1="";



    		ApplyAmtFieldEelement.sendKeys(applyamount1);

  
            return true;
    	}
    	catch(Exception e)
    	{
    	   return false;	
    	}
	}
	
	public String addValueToOnAccountApplyAmtFieldi(String invamount) {
		try
    	{
			
	
			//Thread.sleep(500);

    		WebElement ApplyAmtFieldEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(applyAmtField_xpath));
    		ApplyAmtFieldEelement.clear();
    		ApplyAmtFieldEelement.sendKeys(invamount);
            //String applyamount1="";
    		//ApplyAmtFieldEelement.sendKeys(applyamount1);

  
            return invamount;
    	}
    	catch(Exception e)
    	{
    	   return null;	
    	}
	}


	public String getValueOfShortPaymentCurrentAmtFieldwithCalculation() {
		try
    	{
			WebElement invoiceAmtFieldEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(CurrentAmtField_NonFactored_xpath));
			
			String invAmount=invoiceAmtFieldEelement.getText();
			
			String invAmountWthOutCma=  invAmount.replaceAll(",","");
			
	        double d = Double.parseDouble(invAmountWthOutCma)/2;
	        double bigDouble= BigDecimal.valueOf(d).setScale(2, RoundingMode.HALF_UP).doubleValue();
	        
				
		     String invStr = Double.toString(bigDouble);
	
			//Thread.sleep(500);

            return invStr;
    	}
    	catch(Exception e)
    	{
    	   return null;	
    	}
	}
	public String getValueOfPartialPaymentCurrentAmtFieldwithCalculation() {
		try
    	{
			WebElement invoiceAmtFieldEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(CurrentAmtField_NonFactored_xpath));
			
			String invAmount=invoiceAmtFieldEelement.getText();
			
			String invAmountWthOutCma=  invAmount.replaceAll(",","");
			
	        double d = Double.parseDouble(invAmountWthOutCma)/2;
	        double bigDouble= BigDecimal.valueOf(d).setScale(2, RoundingMode.HALF_UP).doubleValue();
	        
				
		     String invStr = Double.toString(bigDouble);
	
			//Thread.sleep(500);

            return invStr;
    	}
    	catch(Exception e)
    	{
    	   return null;	
    	}
	}
	public String getValueOfOverPaymentCurrentAmtFieldwithCalculation() {
		try
    	{
			/*WebElement invoiceAmtFieldEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(CurrentAmtFieldNonFactored_xpath));
			
			String invAmount=invoiceAmtFieldEelement.getText();
			
			String invAmountWthOutCma=  invAmount.replaceAll(",","");
			
	        double d = Double.parseDouble(invAmountWthOutCma)/2;
	        double bigDouble= BigDecimal.valueOf(d).setScale(2, RoundingMode.HALF_UP).doubleValue();
	        
				
		     String invStr = Double.toString(bigDouble);*/
			
			WebElement CurrentAmtFieldEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(CurrentAmtField_NonFactored_xpath));
			
			String CurrentAmount=CurrentAmtFieldEelement.getText();
			
			String CurrentAmount_Without_Coma=  CurrentAmount.replaceAll(",","");
			
	        double d = Double.parseDouble(CurrentAmount_Without_Coma);
				double d1=d+(d/2);
				
				double bigDouble= BigDecimal.valueOf(d).setScale(2, RoundingMode.HALF_UP).doubleValue();
		        
			     String OverPaymentCurrentAmtWithCalculation = Double.toString(bigDouble);
				
				
				
		     String CurrentAmt_Calculated = Double.toString(d1);
	
			//Thread.sleep(500);

            return CurrentAmt_Calculated;
    	}
    	catch(Exception e)
    	{
    	   return null;	
    	}
	}
	public boolean addValueToShortPaymentApplyAmtField() {
		try
    	{
		    WebElement invoiceAmtFieldEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(invoiceAmount_xpath));
			
			String invAmount=invoiceAmtFieldEelement.getText();
			
			String invAmountWthOutCma= invAmount.replaceAll(",","");
			
	        double d = Double.parseDouble(invAmountWthOutCma)/2;
	        double bigDouble= BigDecimal.valueOf(d).setScale(2, RoundingMode.HALF_UP).doubleValue();
	        
				
		     String invStr = Double.toString(bigDouble);
	
			//Thread.sleep(500);

    		WebElement ApplyAmtFieldEelement=new WebDriverWait(driver,200)
			.until(ExpectedConditions.visibilityOfElementLocated(applyAmtFieldShortPayment_xpath));
    		ApplyAmtFieldEelement.clear();
    		//String invStr1="909";
    		Thread.sleep(2000);
    		ApplyAmtFieldEelement.sendKeys(invStr);
            Thread.sleep(2000);
            return true;
    	}
    	catch(Exception e)
    	{
    	   return false;	
    	}
	}
	
	public boolean addValueToShortPaymentApplyAmtFieldi(String CurrentAmount_ShortPayment_Calculated) {
		try
    	{
		    /*WebElement invoiceAmtFieldEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(invoiceAmount_xpath));
			
			String invAmount=invoiceAmtFieldEelement.getText();
			
			String invAmountWthOutCma= invAmount.replaceAll(",","");
			
	        double d = Double.parseDouble(invAmountWthOutCma)/2;
	        double bigDouble= BigDecimal.valueOf(d).setScale(2, RoundingMode.HALF_UP).doubleValue();
	        
				
		     String invStr = Double.toString(bigDouble);
	
			//Thread.sleep(500);
*/
    		WebElement ApplyAmtFieldEelement=new WebDriverWait(driver,800)
			.until(ExpectedConditions.visibilityOfElementLocated(applyAmtFieldShortPayment_xpath));
    		ApplyAmtFieldEelement.clear();
    		//String invStr1="909";
    		ApplyAmtFieldEelement.sendKeys(CurrentAmount_ShortPayment_Calculated);
            //Thread.sleep(4000);
            return true;
    	}
    	catch(Exception e)
    	{
    	   return false;	
    	}
	}
	
	
	
	public String addValueTo_PartialPayment_ApplyAmtField() {
		try
    	{
			WebElement CurrentAmtFieldEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(CurrentAmtField_NonFactored_xpath));
			
			String CurrentAmount=CurrentAmtFieldEelement.getText();
			
			String CurrentAmount_WthOutCma=  CurrentAmount.replaceAll(",","");
			
			
	        double d = Double.parseDouble(CurrentAmount_WthOutCma)/2;
	        double bigDouble= BigDecimal.valueOf(d).setScale(2, RoundingMode.HALF_UP).doubleValue();
		    String CurrentAmount_Calculated = Double.toString(bigDouble);
	
			//Thread.sleep(500);

    		WebElement ApplyAmtFieldEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(OverapplyAmtField_xpath));
    		ApplyAmtFieldEelement.clear();
    		ApplyAmtFieldEelement.sendKeys("7000");
    		ApplyAmtFieldEelement.clear();
    		ApplyAmtFieldEelement.sendKeys(CurrentAmount_Calculated);
    		
            Thread.sleep(2000);
            return CurrentAmount_Calculated;
    	}
    	catch(Exception e)
    	{
    	   return null;	
    	}
	}

	/*public boolean addValueToOverPaymentApplyAmtFieldi() {
=======
	public boolean addValueToOverPaymentApplyAmtFieldi() {
>>>>>>> fe0662ad7a443804e0f0f5b4d8d696fe0d429cbc
		try
    	{
			WebElement CurrentAmtFieldEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(CurrentAmtField_NonFactored_xpath));
			
			String CurrentAmount=CurrentAmtFieldEelement.getText();
			
			String CurrentAmount_Without_Coma=  CurrentAmount.replaceAll(",","");
			
	        double d = Double.parseDouble(CurrentAmount_Without_Coma);
				double d1=d+(d/2);
		     String CurrentAmt_Calculated = Double.toString(d1);
	
			//Thread.sleep(500);

    		WebElement ApplyAmtFieldEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(applyAmtField_xpath));
    		ApplyAmtFieldEelement.clear();
    		ApplyAmtFieldEelement.sendKeys(CurrentAmt_Calculated);
  
            return true;
    	}
    	catch(Exception e)
    	{
    	   return false;	
    	}
	}*/
	
	
	
	public boolean addValueToApplyAmtFieldi(String applyamount) {
		try
    	{
			WebElement invoiceAmtFieldEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(invoiceAmount_xpath));
			
			String invAmount=invoiceAmtFieldEelement.getText();
			int amountint=Integer.parseInt(invAmount);
			int amountint2=amountint-100;
			String applyamount1 = Integer.toString(amountint2);
			
			Thread.sleep(4000);
			
    		WebElement ApplyAmtFieldEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(applyAmtField_xpath));
    		//ApplyAmtFieldEelement.clear();
    		ApplyAmtFieldEelement.sendKeys(applyamount1);
  
            return true;
    	}
    	catch(Exception e)
    	{
    	   return false;	
    	}
	}
	

	public boolean SelectAdjustmentReason() {
		try {
			WebElement AReasonWebEelement = new WebDriverWait(
					driver, 100).until(ExpectedConditions
					.visibilityOfElementLocated(AdjustmentReason_xpath));
			AReasonWebEelement.click();
			Select sel = new Select(AReasonWebEelement);
			//sel.selectByIndex(2);
			sel.selectByVisibleText("Defective product");
			List<WebElement> list = sel.getOptions();
			/*for (WebElement ele : list) {
				if (ele.getText().equals(sourcetype)) {
					ele.click();
					Thread.sleep(1000);

					 return true;
				}
			}*/

		} catch (Exception ex) {
		}
		return true;
	}
	public boolean addValueToAdjustmentAmount(String CurrentAmount_ShortPayment_Calculated) {
		try
    	{
			/*WebElement invoiceAmtFieldEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(Applyamount));
			
			String applyAmount=invoiceAmtFieldEelement.getText();*/
			
			
			WebElement CurrentAmtFieldEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(CurrentAmtField_NonFactored_xpath));
			
			String CurrentAmount=CurrentAmtFieldEelement.getText();
			String CurrentAmountWthOutCma= CurrentAmount.replaceAll(",","");
			
			Double amountA=Double.parseDouble(CurrentAmount_ShortPayment_Calculated);
			Double amountB=Double.parseDouble(CurrentAmountWthOutCma);
			
			Double amountC=amountB-amountA;
			
			String Adjustmentamount = Double.toString(amountC);
			
			Thread.sleep(500);
			
    		WebElement AdjustmentAmtFieldEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(AdjustmentAmtField_xpath));
    		AdjustmentAmtFieldEelement.clear();
    		String Adjustmentamount1="8000";
    		AdjustmentAmtFieldEelement.sendKeys(Adjustmentamount);
  
            return true;
    	}
    	catch(Exception e)
    	{
    	   return false;	
    	}
	}
	
	public boolean addValueToAdjustmentAmounti(String CurrentAmount_ShortPayment_Calculated) {
		try
    	{
			/*WebElement invoiceAmtFieldEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(Applyamount));
			
			String applyAmount=invoiceAmtFieldEelement.getText();*/
			
			
			/*WebElement CurrentAmtFieldEelement=new WebDriverWait(driver,800)
			.until(ExpectedConditions.visibilityOfElementLocated(CurrentAmtField_NonFactored_xpath));
			
			String CurrentAmount=CurrentAmtFieldEelement.getText();
			
			Double amountA=Double.parseDouble(CurrentAmount_ShortPayment_Calculated);
			Double amountB=Double.parseDouble(CurrentAmount);
			
			Double amountC=amountB-amountA;
			
			String Adjustmentamount = Double.toString(amountC);*/
			
			Thread.sleep(500);
			
    		WebElement AdjustmentAmtFieldEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(AdjustmentAmtField_xpath));
    		AdjustmentAmtFieldEelement.clear();
    		String Adjustmentamount1="5000";
    		AdjustmentAmtFieldEelement.sendKeys(Adjustmentamount1);
  
            return true;
    	}
    	catch(Exception e)
    	{
    	   return false;	
    	}
	}
	
	
	public boolean VerifyCancelBTN() {
		try
    	{
    		WebElement CancelBTNEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(cancelBTN_xpath));
    		CancelBTNEelement.isDisplayed();
  
            return true;
    	}
    	catch(Exception e)
    	{
    	   return false;	
    	}
	}
	public boolean VerifySaveBTN() {
		try
    	{
    		WebElement SaveBTNEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(saveBTN_xpath));
    		SaveBTNEelement.isDisplayed();
  
            return true;
    	}
    	catch(Exception e)
    	{
    	   return false;	
    	}
	}
	public boolean VerifySaveAndNewBTN() {
		try
    	{
    		WebElement SaveAndNewBTNEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(saveAndCreateCheckBTN_xpath));
    		SaveAndNewBTNEelement.isDisplayed();
  
            return true;
    	}
    	catch(Exception e)
    	{
    	   return false;	
    	}
	}
	public boolean ClickSaveBTN() {
		try
    	{
    		WebElement SaveBTNEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(saveBTN_xpath));
    		SaveBTNEelement.click();
    		Thread.sleep(1000);
  
            return true;
    	}
    	catch(Exception e)
    	{
    	   return false;	
    	}
	}
	
	public boolean ClickSaveBTNafterEditBatch() {
		try
    	{
    		WebElement SaveBTNEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(saveBTNAfterEditBatch_xpath));
    		SaveBTNEelement.click();
    		Thread.sleep(1000);
  
            return true;
    	}
    	catch(Exception e)
    	{
    	   return false;	
    	}
	}
	
	public boolean VerifySaveChkSuccessMsg() {
		try
    	{
    		WebElement SaveChkSuccessMsgEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(saveChkSuccessMsg_xpath));
    		SaveChkSuccessMsgEelement.isDisplayed();
  
            return true;
    	}
    	catch(Exception e)
    	{
    	   return false;	
    	}
	}
	public boolean ClickOnBackToBatchBTN() {
		try
    	{
    		WebElement BackToBatchBTNEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(backToBatchBTN_xpath));
    		BackToBatchBTNEelement.click();
    		Thread.sleep(2000);
  
            return true;
    	}
    	catch(Exception e)
    	{
    	   return false;	
    	}
	}
	public boolean VerifyPreviewIcon() {
		try
    	{
    		WebElement PreviewIconEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(previewIcon_xpath));
    		PreviewIconEelement.isDisplayed();
  
            return true;
    	}
    	catch(Exception e)
    	{
    	   return false;	
    	}
	}
	public boolean VerifyEditIcon() {
		try
    	{
    		WebElement EditIconEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(editIcon_xpath));
    		EditIconEelement.isDisplayed();
  
            return true;
    	}
    	catch(Exception e)
    	{
    	   return false;	
    	}
	}
	public boolean VerifyDeleteIcon() {
		try
    	{
    		WebElement DeleteIconEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(deleteIcon_xpath));
    		DeleteIconEelement.isDisplayed();
  
            return true;
    	}
    	catch(Exception e)
    	{
    	   return false;	
    	}
	}
	public boolean CheckOnBatchChkBox() {
		try
    	{
    		WebElement BatchChkBoxEelement1=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(batchChkBox1_xpath));
    		BatchChkBoxEelement1.click();
    		Thread.sleep(500);
    		WebElement BatchChkBoxEelement2=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(batchChkBox2_xpath));
    	//	BatchChkBoxEelement2.click();
    		
  
            return true;
    	}
    	catch(Exception e)
    	{
    	   return false;	
    	}
	}
	public boolean ClickProcessBTN() {
		try
    	{
    		WebElement ProcessBTNEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(processBTN_xpath));
    		ProcessBTNEelement.click();
    		Thread.sleep(5000);
  
            return true;
    	}
    	catch(Exception e)
    	{
    	   return false;	
    	}
	}
	public boolean ClickNotificationIcon() {
		try
    	{
    		WebElement NotificationIconEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(notificationIcon_xpath));
    		NotificationIconEelement.click();
    		Thread.sleep(5000);
  
            return true;
    	}
    	catch(Exception e)
    	{
    	   return false;	
    	}
	}
	public boolean VerifyCompletedMsg() {
		try
    	{
    		WebElement CompletedMsgEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(completedMsg_xpath));
    		CompletedMsgEelement.isDisplayed();
  
            return true;
    	}
    	catch(Exception e)
    	{
    	   return false;	
    	}
	}
	public boolean ClickCancelBTNInNot() {
		try
    	{
    		WebElement CancelBTNInNotEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(cancelBTNNot_xpath));
    		CancelBTNInNotEelement.click();
    		Thread.sleep(5000);
  
            return true;
    	}
    	catch(Exception e)
    	{
    	   return false;	
    	}
	}
	public boolean ClickInvDistributionTag() {
		try
    	{
    		WebElement InvDistributionTag=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(invDistriTag_xpath));
    		Thread.sleep(2000);
    		InvDistributionTag.click();
    		JavascriptExecutor js = (JavascriptExecutor) driver;
    		js.executeScript("window.scrollBy(0,1500)");
    		Thread.sleep(5000);
  
            return true;
    	}
    	catch(Exception e)
    	{
    	   return false;	
    	}
	}






	public boolean ClickOnAccountTag() {
		try
    	{
    		WebElement InvDistributionTag=new WebDriverWait(driver,200)
			.until(ExpectedConditions.visibilityOfElementLocated(OnAccountTag_xpath));
    		InvDistributionTag.click();
    		JavascriptExecutor js = (JavascriptExecutor) driver;
    		js.executeScript("window.scrollBy(0,1500)");
    		Thread.sleep(4000);
  
            return true;
    	}
    	catch(Exception e)
    	{
    	   return false;	
    	}
	}
	public boolean ClickOn_AddInvoice() {
		try
    	{
    		WebElement InvDistributionTag=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(Addinvoice_xpath));
    		InvDistributionTag.click();
    		/*JavascriptExecutor js = (JavascriptExecutor) driver;
    		js.executeScript("window.scrollBy(0,1500)");*/
    		Thread.sleep(4000);
  
            return true;
    	}
    	catch(Exception e)
    	{
    	   return false;	
    	}
	}
	


	private final By nonfactoredcheckboxi_xpath=By.xpath("//input[@class='cync-nonefactor ng-untouched ng-pristine ng-valid']");

	//private final By nonfactoredcheckboxii_xpath=By.xpath("//input[@class='cync-nonefactor ng-valid ng-dirty ng-touched']");






	private final By nonfactoredcheckboxii_xpath=By.xpath("//div[@class='nonfactor-box']//input");


	public boolean ClickNonFactoredcheckbox() {
		try
    	{
    		WebElement InvDistributionTag=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(nonfactoredcheckboxii_xpath));
    		InvDistributionTag.click();
    		//JavascriptExecutor js = (JavascriptExecutor) driver;
    	//	js.executeScript("window.scrollBy(0,1500)");
    	//	Thread.sleep(5000);
  
            return true;
    	}
    	catch(Exception e)
    	{
    	   return false;	
    	}
	}

}
