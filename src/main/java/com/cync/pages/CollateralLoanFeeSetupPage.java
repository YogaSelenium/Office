package com.cync.pages;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.SkipException;

import com.cync.base.BasePage;

public class CollateralLoanFeeSetupPage extends BasePage {
	private final By CollateralLoanFeeSetupPageHeader_xpath=By.xpath("//span[contains(text(), 'Collateral Loan Fee Setup')]");
	private final By breadcrumb_xpath=By.xpath("//div[@class='pull-left pleftnext']");
	private final By HeaderVerify_xpath=By.xpath("//span[contains(text(),'Collateral Loan Fee Setup')]");
	private final By processingTypeColumn_xpath=By.id("jqgh_processing_fee_setup_list_processing_type");
	private final By processingTypesDropdownOptions_xpath=By.id("gs_processing_type");
	private final By cashTransactioTypeColumn_xpath=By.id("jqgh_processing_fee_setup_list_cash_receipt_source_code_id");

	private final By CashTransactionTypesDropdownOptions_xpath=By.xpath("//select[@name='cash_receipt_source_code_id']");
	private final By chargeCodeColumn_xpath=By.id("jqgh_processing_fee_setup_list_charge_template_id");
	private final By ChargeCodeDropdownOptions_xpath=By.xpath("//select[@id='gs_charge_template_id']");

	private final By chargevalueColumn_xpath=By.id("jqgh_processing_fee_setup_list_charge_value");
	private final By chargevalueSearch_xpath=By.id("gs_charge_value");
	private final By gridcancelicon_xpath=By.xpath("//span[@class='ui-icon ui-icon ui-icon-cancel']");
	private final By gridexporticon_xpath=By.xpath("(//div[@class='ui-pg-div'])[6]");
	private final By gridsaveicon_xpath=By.xpath("//span[@class='ui-icon ui-icon ui-icon-disk']");
	private final By gridaddicon_xpath=By.xpath("//span[@class='ui-icon ui-icon ui-icon-plus']");
	private final By gridreloadicon_xpath=By.xpath("//span[@class='ui-icon ui-icon-refresh']");
	private final By griddeleteicon_xpath=By.xpath("//span[@class='ui-icon ui-icon-trash']");
	private final By processingTypedropdown_xpath=By.id("jqg1_processing_type");
	private final By cashTranscationdropdown_xpath=By.id("jqg1_cash_receipt_source_code_id");
	private final By chargeCodedropdown_xpath=By.xpath("(//select[@name='charge_template_id'])[2]");
	private final By chargevalueinput_xpath=By.id("jqg1_charge_value");
	private final By successmessage_xpath=By.xpath("//div[@class='ui-state-success']");
	private final By checkbox_xpath=By.xpath("(//input[@type='checkbox'])[6]");
	private final By deletesuccessmessage_xpath=By.xpath("//div[@class='ui-state-success']");
	private final By deletebutton_xpath=By.id("dData");
	private final By exportpopupheader_xpath=By.xpath("//label[@class='box col-md-8 padone']");
	private final By exportdownloadicon_xpath=By.xpath("//div[@class='export']");
	private final By exportprocesingtype_xpath=By.xpath("(//input[@id='export_cols'])[1]");
	private final By exportcashtransactiontype_xpath=By.xpath("(//input[@id='export_cols'])[2]");
	private final By exportchargecode_xpath=By.xpath("(//input[@id='export_cols'])[3]");
	private final By exportchargevaluetype_xpath=By.xpath("(//input[@id='export_cols'])[4]");
	private final By exporterrormessage_xpath=By.xpath("//div[@class='ui-state-error']");
    private final By closeButton_xpath = By.id("closedialog");




	private final By collectionChargeValue_xpath=By.xpath("(//td[@aria-describedby='processing_fee_setup_list_charge_value'])[2]");
	private final By searchbar_xpath=By.xpath("//input[@id='gs_charge_value']");
	private final By validsearch_xpath=By.xpath("//td[@aria-describedby='processing_fee_setup_list_charge_value']");
    private final By closeButtonExportpopup_xpath = By.xpath("//button[@class='ui-dialog-titlebar-close']");
    
    private final By errorMsgCloseBTN_xpath = By.xpath("//a[@id='closedialog']");

		public CollateralLoanFeeSetupPage(WebDriver driver) {
			super(driver);
			try{
				if(!driver.findElement(CollateralLoanFeeSetupPageHeader_xpath).getText().trim().contains("Collateral Loan Fee Setup")){
					throw new SkipException("Collateral Loan Fee Setup page couldn't open.");
				
				}}
			catch(Exception e){
				

			
				e.printStackTrace();
		}
			
			

	}

		public String breadcrumb(String Breadcrumb)
		{
			try{
				WebElement breadcrumbWebEelement=new WebDriverWait(driver,10)
				.until(ExpectedConditions.visibilityOfElementLocated(breadcrumb_xpath));
				breadcrumbWebEelement.isDisplayed();
				
			}
			catch(Exception ex){
				
			}
			return Breadcrumb;

			}

		

		public boolean HeaderVerify(String Header)
		{
		 
		try{
			WebElement HeaderWebEelement=new WebDriverWait(driver,10)
				.until(ExpectedConditions.visibilityOfElementLocated(HeaderVerify_xpath));
			String actual = HeaderWebEelement.getText();
			if (actual.equals(Header))
				return true;
			else
				return false;

		} catch (Exception e) {
			return false;
		}
		}
		public boolean VerifyProcessingTypeColumn()
		{
		 
		try{
			WebElement HeaderWebEelement=new WebDriverWait(driver,10)
				.until(ExpectedConditions.visibilityOfElementLocated(processingTypeColumn_xpath));
			HeaderWebEelement.isDisplayed();
			System.out.println("VerifyProcessingTypeColumn");
			return true;
		} catch (Exception e) {
			return false;
		}

		}

		public boolean  verifyProcessingTypeDropdownValues(){
			try {
				String[] exp = {"All","Collection","Funding"};
				
				WebElement dropdown = driver.findElement(processingTypesDropdownOptions_xpath); 
				
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

			}
			return true;	
		}

	public boolean VerifyCashTransactionTypeColumn()
	{
	 
	try{
		WebElement HeaderWebEelement=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(cashTransactioTypeColumn_xpath));
		HeaderWebEelement.isDisplayed();
		System.out.println("VerifyCashTransactionTypeColumn");
		return true;
	} catch (Exception e) {
		return false;
	}

	}
	public boolean  verifyCashTransactionTypeDropdownValues(){
		try {

			//String[] exp = {"All","Check","Lock Box","Wire Transfer","Lock Box Float"};

			Thread.sleep(1000);
			/*String[] exp = {"All","Check","Lock Box","Wire Transfer","Lock Box Float"};*/

			
			WebElement dropdown = driver.findElement(CashTransactionTypesDropdownOptions_xpath); 
			
			 Select select = new Select(dropdown);  

			 List<WebElement> options = select.getOptions();  		 
			 for(WebElement we:options)  
			 {  	
				 System.out.println(we.getText());

			 /* boolean match = false;
			  for (int i=0; i<exp.length; i++){
			      if (we.getText().equals(exp[i])){
			        match = true;
			       System.out.println(we.getText());
			      }
			    }
			  Assert.assertTrue(match);*/
			 }
		} catch (Exception e) {

			return false;
		}
		return true;	
	}


	public boolean VerifyChargeCodeColumn()
	{
	 
	try{
		WebElement HeaderWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(chargeCodeColumn_xpath));
		HeaderWebEelement.isDisplayed();
		System.out.println("VerifyChargeCodeColumn");
		return true;
	} catch (Exception e) {
		return false;
	}
	}
	public boolean  verifyChargeCodeDropdownValues(){
		try {

			//String[] exp = {"All","ACCRUED FEES","ADVANCE","COLLECTION","LEGAL FEE"};

			Thread.sleep(1000);
			String[] exp = {"All","ACCRUED FEES","ADVANCE","COLLECTION","LEGAL FEE"};

			
			WebElement dropdown = driver.findElement(ChargeCodeDropdownOptions_xpath); 
			
			 Select select = new Select(dropdown);  

			 List<WebElement> options = select.getOptions();  		 
			 for(WebElement we:options)  
			 {  
				 System.out.println(we.getText());
				 
			  /*boolean match = false;
			  for (int i=0; i<exp.length; i++){
			      if (we.getText().equals(exp[i])){
			        match = true;
			        System.out.println(we.getText());
			     }
			    }
			  Assert.assertTrue(match);*/
			 }
		} catch (Exception e) {

			return false;
		}
		return true;	
	}
	public boolean VerifyChargeValueColumn()
	{
	 
	try{
		WebElement HeaderWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(chargevalueColumn_xpath));
		HeaderWebEelement.isDisplayed();
		System.out.println("VerifyChargevalueColumn");
		return true;
	} catch (Exception e) {
		return false;
	}
	}
	public boolean VerifyChargeValueSearch()
	{
		try{
			WebElement HeaderWebEelement=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(chargevalueSearch_xpath));
			HeaderWebEelement.isDisplayed();
			System.out.println("VerifyChargeValueSearchDisplayed");
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	public boolean VerifyCancelIcon()
	{
		try{
			WebElement HeaderWebEelement=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(gridcancelicon_xpath));
			HeaderWebEelement.isDisplayed();
			System.out.println("VerifycanceliconisDisplayed");
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	public boolean VerifyExportIcon()
	{
		try{
			WebElement HeaderWebEelement=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(gridexporticon_xpath));
			HeaderWebEelement.isDisplayed();
			System.out.println("VerifyexportliconisDisplayed");
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	public boolean VerifySaveIcon()
	{
		try{
			WebElement HeaderWebEelement=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(gridsaveicon_xpath));
			HeaderWebEelement.isDisplayed();
			System.out.println("VerifysaveliconisDisplayed");
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	public boolean VerifyAddIcon()
	{
		try{
			WebElement HeaderWebEelement=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(gridaddicon_xpath));
			HeaderWebEelement.isDisplayed();
			System.out.println("VerifyaddiconisDisplayed");
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	public boolean VerifyReloadIcon()
	{
		try{
			WebElement HeaderWebEelement=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(gridreloadicon_xpath));
			HeaderWebEelement.isDisplayed();
			System.out.println("VerifyReloadiconisDisplayed");
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	public boolean VerifyDeleteIcon()
	{
		try{
			WebElement HeaderWebEelement=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(griddeleteicon_xpath));
			HeaderWebEelement.isDisplayed();
			System.out.println("VerifyReloadiconisDisplayed");
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	public boolean clickOnAddIcon()
	{
	 
	try{
		WebElement clickWebEelement=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(gridaddicon_xpath));
		clickWebEelement.click();
		Thread.sleep(1000);
		
		return true;
		} catch (Exception e) {
			return false;
		}
	}
	public boolean selectprocessingtype(String Processingtype){ 
		   
		   try {
		    //Thread.sleep(4000);
		    WebElement collateralNameWebElement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(processingTypedropdown_xpath));  
		    Select sel = new Select(collateralNameWebElement);
		    sel.selectByVisibleText(Processingtype);
		    /*List<WebElement> list = sel.getOptions(); 
		    
		    
		    for(WebElement ele : list){
		     
		     if(ele.getText().equals(Processingtype)){
		      ele.click();
		       //Thread.sleep(1000);
		      break;
		     }
		    }*/
		    return true;
		  } catch (Exception e) {
		   System.out.println("Error");
		  }
		    
		   return false;
		 }



	public boolean selectCashtransactiontype(String Transactiontype){ 
		   
		   try {
		    //Thread.sleep(4000);
		    WebElement collateralNameWebElement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(cashTranscationdropdown_xpath));  
		    Select sel = new Select(collateralNameWebElement);
		    sel.selectByVisibleText(Transactiontype);
		    /*List<WebElement> list = sel.getOptions(); 
		    
		    
		    for(WebElement ele : list){
		     
		     if(ele.getText().equals(Transactiontype)){
		      ele.click();
		       Thread.sleep(1000);
		      break;
		     }
		    }*/
		    return true;
		  } catch (Exception e) {
		   System.out.println("Error");
		  }
		    
		   return false;
		 }


	public boolean selectchargecode(String chargecode){ 
		   
		   try {
		    Thread.sleep(4000);
		    WebElement collateralNameWebElement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(chargeCodedropdown_xpath));  
		    Select sel = new Select(collateralNameWebElement);
		    sel.selectByVisibleText(chargecode);
		   /* List<WebElement> list = sel.getOptions(); 
		    
		    
		    for(WebElement ele : list){
		     
		     if(ele.getText().equals(chargecode)){
		      ele.click();
		       Thread.sleep(4000);
		      break;
		     }
		    }*/
		    return true;
		  } catch (Exception e) {
		   System.out.println("Error");
		  }
		    
		   return false;
		 }
	public boolean EnterInputforChargevalue(String Chargevalue)
	{
	 
	try{
		WebElement InputWebElement=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(chargevalueinput_xpath));
		InputWebElement.clear();
		InputWebElement.sendKeys(Chargevalue);
		
		return true;
		} catch (Exception e) {
			return false;
		}

		}
	public boolean clickOnSaveIcon()
	{
	 
	try{
		WebElement clickWebEelement=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(gridsaveicon_xpath));
		clickWebEelement.click();
		 Thread.sleep(1000);
		
		return true;
		} catch (Exception e) {
			return false;
		}
	}
	public boolean VerifySuccessmessage()
	{
	 
	try{
		WebElement HeaderWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(successmessage_xpath));
		HeaderWebEelement.isDisplayed();
		System.out.println("Verify Successmessage");
		return true;
	} catch (Exception e) {
		return false;
	}
	}
	
	public boolean ClickCloseButton()
	{
		try
		{
			WebElement CloseButtonWebElement = new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(closeButton_xpath));
			CloseButtonWebElement.click();
			Thread.sleep(500);
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}
	
	public boolean ClickExportpopupCloseBTN()
	{
		try
		{
			WebElement ExportCloseBTNWebElement = new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(closeButtonExportpopup_xpath));
			ExportCloseBTNWebElement.click();
			Thread.sleep(500);
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}
	
	
	public boolean clickOnCancelIcon()
	{
	 
	try{
		WebElement clickWebEelement=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(gridcancelicon_xpath));
		clickWebEelement.click();
		
		return true;
		} catch (Exception e) {
			return false;
		}
	}
	public boolean clickOnDeleteIcon()
	{
	 
	try{
		WebElement clickWebEelement=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(griddeleteicon_xpath));
		clickWebEelement.click();
		
		return true;
		} catch (Exception e) {
			return false;
		}
	}
	public boolean clickOncheckbox()
	{
	 
	try{
		WebElement clickWebEelement=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(checkbox_xpath));
		clickWebEelement.click();
		
		return true;
		} catch (Exception e) {
			return false;
		}
	}
	public boolean VerifyDeleteSuccessmessage()
	{
	 
	try{
		WebElement HeaderWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(deletesuccessmessage_xpath));
		HeaderWebEelement.isDisplayed();
		System.out.println("Verify Successmessage");
		return true;
	} catch (Exception e) {
		return false;
	} }
	public boolean clickOnDeleteButtoninCollateral()
	{
	 
	try{
		WebElement clickWebEelement=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(deletebutton_xpath));
		clickWebEelement.click();
		
		return true;
		} catch (Exception e) {
			return false;
		}
	}

	public boolean clickOnExportButtoninCollateral()
	{
	 
	try{
		WebElement clickWebEelement=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(gridexporticon_xpath));
		clickWebEelement.click();
		
		return true;
		} catch (Exception e) {
			return false;
		}
	}
	public boolean HeaderVerifyofexportpopup(String Header)
	{
	 
	try{
		WebElement HeaderWebEelement=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(exportpopupheader_xpath));
		String actual = HeaderWebEelement.getText();
		if (actual.equals(Header))
			return true;
		else
			return false;

	} catch (Exception e) {
		return false;
	}
	}
	public boolean clickOnexportdownloadicon()
	{
	 
	try{
		WebElement clickWebEelement=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(exportdownloadicon_xpath));
		clickWebEelement.click();
		
		return true;
		} catch (Exception e) {
			return false;
		}
	}
	public boolean clickOnExportprocessingType()
	{
	 
	try{
		WebElement clickWebEelement=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(exportprocesingtype_xpath));
		clickWebEelement.click();
		
		return true;
		} catch (Exception e) {
			return false;
		}
	}
	public boolean clickOnExportcashtransactionType()
	{
	 
	try{
		WebElement clickWebEelement=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(exportcashtransactiontype_xpath));
		clickWebEelement.click();
		
		return true;
		} catch (Exception e) {
			return false;
		}
	}
	public boolean clickOnExportchargecode()
	{
	 
	try{
		WebElement clickWebEelement=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(exportchargecode_xpath));
		clickWebEelement.click();
		
		return true;
		} catch (Exception e) {
			return false;
		}
	}
	public boolean clickOnExportchargevalue()
	{
	 
	try{
		WebElement clickWebEelement=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(exportchargevaluetype_xpath));
		clickWebEelement.click();
		
		return true;
		} catch (Exception e) {
			return false;
		}
	}

	public boolean Verifyexporterrorsmessage()
	{
	 
	try{
		WebElement HeaderWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(exporterrormessage_xpath));
		HeaderWebEelement.isDisplayed();
		System.out.println("Verify Errormessage");
		return true;
	} catch (Exception e) {
		return false;
	} }
	
	public boolean ClickErrorMsgCloseBTN()
	{
	 
	try{
		WebElement CloseBTNWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(errorMsgCloseBTN_xpath));
		CloseBTNWebEelement.click();
		return true;
	} catch (Exception e) {
		return false;
	} }
	

	  

	/*Nidhi Changes*/

	public boolean VerifyCollectionChargeValue(String chargeValue)
	{
	 
	try{
		WebElement HeaderWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(collectionChargeValue_xpath));
		String actual = HeaderWebEelement.getText();
		if (actual.equals(chargeValue))
			return true;
		else
			return false;

	} catch (Exception e) {
		return false;
	}
	}

	public boolean ChargeCodesPageSerach(String data)
	{
	try{
		WebElement chargeCodesSearchWebEelement=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(searchbar_xpath));
		chargeCodesSearchWebEelement.clear();
		chargeCodesSearchWebEelement.sendKeys(data);
		return true;
	}
	catch(Exception ex){
		return false;	
	}
	}

	public  String validSerachedData(String validdata)
	{
	    try{
	WebElement chargeCodesSearchWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(validsearch_xpath));
	chargeCodesSearchWebEelement.getText();
	    }
	    catch(Exception ex){

	    }
	    return validdata;
	}



}

