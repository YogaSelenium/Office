package com.cync.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.cync.base.BasePage;


public class LetterOfCredit extends BasePage{

	
	public LetterOfCredit(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
//Author:sanusha
	
	

	private final By LetterOfCreditPageHeader_xpath= By.xpath("//span[@class='paneltitle']");
	private final By LetterOfCreditBreadcrumb_xpath= By.xpath("(//ul[@class='horizontal-li-list'])[1]");
	private final By LetterOfCreditColumn_xpath= By.id("jqgh_letter_of_credits_list_letter_of_credit_no");
    private final By DescriptionColumn_xpath= By.id("jqgh_letter_of_credits_list_description");
	private final By ExpiryDateColumn_xpath= By.id("jqgh_letter_of_credits_list_expired_dt");
	private final By AmountColumn_xpath= By.id("jqgh_letter_of_credits_list_amount");
	private final By StatusColumn_xpath= By.id("gs_active");
	private final By LCLimitColumn_xpath= By.id("jqgh_letter_of_credits_list_lc_limit_amount");
	private final By GridSearchButton_xpath= By.xpath("//span[@class='ui-icon ui-icon-search']");
	private final By GridReloadButton_xpath= By.xpath("//span[@class='ui-icon ui-icon-refresh']");
	private final By GridAddButton_xpath= By.xpath("//span[@class='ui-icon ui-icon ui-icon-plus']");
	private final By GridSaveButton_xpath= By.xpath("//span[@class='ui-icon ui-icon ui-icon-disk']");
	private final By GridCancelButton_xpath= By.xpath("//span[@class='ui-icon ui-icon ui-icon-cancel']");
	private final By GridExportButton_xpath= By.xpath("(//div[@class='ui-pg-div'])[7]");
	private final By pageRecords_xpath=By.xpath("//select[contains(@title,'Records per Page')]");
	private final By LetterOfcreditInput_xpath=By.id("jqg1_letter_of_credit_no");
	private final By DescriptionInput_xpath=By.id("jqg1_description");
	private final By AmountInput_xpath=By.id("jqg1_amount");  
	
	private final By CheckBoxColumn_xpath=By.xpath("//input[@id='cb_letter_of_credits_list']");
	private final By searchButtonInLetterOfCredit_xpath=By.xpath("//input[@id='gs_letter_of_credit_no']");
	private final By CancelButtonSearchInLetterOfCredit_xpath=By.xpath("(//a[@class='clearsearchclass'])[2]");
    private final By SearchFieldInDiscriptionColumn_xpath=By.xpath("//input[@id='gs_description']");
    private final By CancelButtonInDiscriptionColumn_xpath=By.xpath("(//a[@class='clearsearchclass'])[2]");
    private final By SearchFieldInExpiryDate_xpath=By.xpath("//input[@id='gs_expired_dt']");
    private final By CancelButtonSearchInExpiryDate_xpath=By.xpath("(//a[@class='clearsearchclass'])[4]");
    private final By SearchFieldInAmountColumn_xpath=By.xpath("//input[@id='gs_amount']");
    private final By CancelbuttonInAmountColumn_xpath=By.xpath("(//a[@class='clearsearchclass'])[5]");
    private final By SelectDropDown_xpath=By.xpath("//select[@id='gs_active']");
    private final By CancelButtonInStatusColumn_xpath=By.xpath("(//a[@class='clearsearchclass'])[6]");
    private final By MaximizeDropDownInStatus_xpath=By.xpath("//span[@class='toggle-multiselect']");
    private final By searchFieldInLCLimit_xpath=By.xpath("//input[@id='gs_lc_limit_amount']");
    private final By CancelButtonInLCLimitColumn_xpath=By.xpath("(//a[@class='clearsearchclass'])[7]");
    private final By TotalColumn_xpath=By.xpath("//td[contains(text(),'Totals')]");
    //private final By TotalAmount_xpath=By.xpath("//td[contains(text(),'10,100.00')]");
    private final By SearchIconInGrid_xpath=By.xpath("//span[@class='ui-icon ui-icon-search']");
    private final By SearchPopupHeader_xpath=By.xpath("(//span[@class='ui-jqdialog-title'])[1]");
    private final By SearchPopupClose_xpath=By.xpath("(//a[@class='ui-jqdialog-titlebar-close ui-corner-all'])[1]");
    private final By RecordsView_xpath=By.xpath("//div[@class='ui-paging-info']");
    private final By VerifyMessage_WithOutGiving_letterOfCredit_xpath=By.xpath("//div[@class='ui-state-error']");
    private final By EnterLCLimit_xpath=By.xpath("(//input[@name='lc_limit_amount'])[2]");
    private final By validationMessageWhenAmountFieldBlank_xpath=By.xpath("//div[@class='ui-state-error']");
    private final By validationMessageWhenEnteredAmountIsMoreThanTheLClimit_xpath=By.xpath("//div[@class='ui-state-error']");
    private final By ExistingLetterOfCreditDetail_xpath=By.xpath("(//td[@role='gridcell'])[11]");
    private final By ModifiedLetterOfCreditMessage_xpath=By.xpath("//div[@class='ui-state-success']");
    private final By closepopup_xpath=By.xpath("//a[@id='closedialog']");
    private final By ExportPopUpHeader_xpath=By.xpath("(//label[contains(text(),'Letter of Credit')])[1]");
    private final By ExportPopUp_letterOfCredit_xpath=By.xpath("(//label[@class='pull-left'])[1]");
    private final By ExportPopUP_discription_xpath=By.xpath("(//label[@class='pull-left'])[2]");
    private final By ExportPopup_close_xpath=By.xpath("(//button[@class='ui-dialog-titlebar-close'])[1]");
    private final By ExportIconInPopup_xpath=By.xpath("//div[@class='export']");
    private final By ExportPopup_discriptionCheckBox_xpath=By.xpath("(//input[@id='export_cols'])[2]");
    private final By VerifyDataInDiscription_xpath=By.xpath("//td[contains(text(),'Testing')]");
    private final By VerifyrecordInAmountColumn_xpath=By.xpath("//td[contains(text(),'100.00')]");
    private final By ModifiedFieldInletterOfCreditColumn_xpath=By.xpath("(//input[@name='letter_of_credit_no'])[2]");
    //private final By VerifyingRecordOfLCLimit_xpath=By.xpath("//td[contains(text(),'11.00')]");
    private final By VerifyRecordOfExpiry_xpath=By.xpath("//td[contains(text(),'11/30/2018')]");
    private final By VerifyRecordOfStatusColumn_xpath=By.xpath("(//td[contains(text(),'Active')])[1]");
    
    private final By errorMsgCloseBTN_xpath = By.xpath("//a[@id='closedialog']");
    private final By TotalAmount_xpath=By.xpath("//tr[@class='footrow footrow-ltr ui-widget-content']//td[6]");
    private final By VerifyingRecordOfLCLimit_xpath=By.xpath("//td[contains(text(),'2,000')]");
    
public boolean HeaderVerify(String Header)
{
 
try{
	WebElement HeaderWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(LetterOfCreditPageHeader_xpath));
	HeaderWebEelement.isDisplayed();
	return true;

} catch (Exception e) {
	return false;
}
}


public String breadcrumb(String LetterOfCreditBreadcrumb)
{
	try{
		WebElement breadcrumbWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(LetterOfCreditBreadcrumb_xpath));
		breadcrumbWebEelement.isDisplayed();
		
	}
	catch(Exception ex){
		
	}
	return LetterOfCreditBreadcrumb;

	}




public boolean VerifyLetterOfCreditColumn()
{
 
try{
	WebElement letterOfCreditWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(LetterOfCreditColumn_xpath));
	letterOfCreditWebEelement.isDisplayed();
	System.out.println("VerifyLetterOfCreditColumn");
	return true;
} catch (Exception e) {
	return false;
}

}

public boolean VerifyDescriptionColumn()
{
 
try{
	WebElement letterOfCreditWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(DescriptionColumn_xpath));
	letterOfCreditWebEelement.isDisplayed();
	System.out.println("VerifyDescriptionColumn");
	return true;
	} catch (Exception e) {
		return false;
	}

	}


public boolean VerifyExpiryDateColumn()
{
 
try{
	WebElement letterOfCreditWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(ExpiryDateColumn_xpath));
	letterOfCreditWebEelement.isDisplayed();
	System.out.println("VerifyExpiryDateColumn");
	return true;
	} catch (Exception e) {
		return false;
	}

	}
public boolean VerifyAmountColumn()
{
 
try{
	WebElement letterOfCreditWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(AmountColumn_xpath));
	letterOfCreditWebEelement.isDisplayed();
	System.out.println("VerifyAmountColumn");
	return true;
	} catch (Exception e) {
		return false;
	}

	}
public boolean VerifyStatusColumn()
{
 
try{
	WebElement letterOfCreditWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(StatusColumn_xpath));
	letterOfCreditWebEelement.isDisplayed();
	System.out.println("VerifyStatusColumn");
	return true;
	} catch (Exception e) {
		return false;
	}

	}


public boolean VerifyLCLimitColumn()
{
 
try{
	WebElement letterOfCreditWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(LCLimitColumn_xpath));
	letterOfCreditWebEelement.isDisplayed();
	System.out.println("VerifyLCLimitColumn");
	
	return true;
	} catch (Exception e) {
		return false;
	}

	}


public boolean VerifyGridSearchButton()
{
 
try{
	WebElement letterOfCreditWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(GridSearchButton_xpath));
	letterOfCreditWebEelement.isDisplayed();
	
	return true;
	} catch (Exception e) {
		return false;
	}

	}

public boolean VerifyGridReloadButton()
{
 
try{
	WebElement letterOfCreditWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(GridReloadButton_xpath));
	letterOfCreditWebEelement.isDisplayed();
	
	return true;
	} catch (Exception e) {
		return false;
	}

	}

public boolean VerifyGridAddButton()
{
 
try{
	WebElement letterOfCreditWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(GridAddButton_xpath));
	letterOfCreditWebEelement.isDisplayed();
	
	return true;
	} catch (Exception e) {
		return false;
	}

	}
public boolean VerifyGridSaveButton()
{
 
try{
	WebElement letterOfCreditWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(GridSaveButton_xpath));
	letterOfCreditWebEelement.isDisplayed();
	
	return true;
	} catch (Exception e) {
		return false;
	}

	}


public boolean VerifyGridCancelButton()
{
 
try{
	WebElement letterOfCreditWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(GridCancelButton_xpath));
	letterOfCreditWebEelement.isDisplayed();
	
	return true;
	} catch (Exception e) {
		return false;
	}

	}
public boolean VerifyGridExportButton()
{
 
try{
	WebElement letterOfCreditWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(GridExportButton_xpath));
	letterOfCreditWebEelement.isDisplayed();
	
	return true;
	} catch (Exception e) {
		return false;
	}

	}
public boolean pageRecordDropdown_UIValidation()
{
try{
		 
	WebElement dropdown = driver.findElement(pageRecords_xpath);  
	  dropdown.click();
	  //Thread.sleep(4000);
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

public boolean clickOnAdd()
{
 
try{
	WebElement clickWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(GridAddButton_xpath));
	clickWebEelement.click();
	
	return true;
	} catch (Exception e) {
		return false;
	}

	}
public boolean EnterInputforLetterOfCredit(String LetterOfCreditcolumn)
{
 
try{
	WebElement InputWebElement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(LetterOfcreditInput_xpath));
	InputWebElement.sendKeys(LetterOfCreditcolumn);
	
	return true;
	} catch (Exception e) {
		return false;
	}

	}

public boolean EnterInputforDescription(String Description)
{
 
try{
	WebElement InputWebElement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(DescriptionInput_xpath));
	//InputWebElement.clear();
	InputWebElement.sendKeys(Description);
	
	return true;
	} catch (Exception e) {
		return false;
	}

	}
public boolean EnterInputforAmount(String Amount)
{
 
try{
	WebElement InputWebElement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(AmountInput_xpath));
	InputWebElement.clear();
	InputWebElement.sendKeys(Amount);
	
	return true;
	} catch (Exception e) {
		return false;
	}

	}
public boolean clickOnSave()
{
 
try{
	WebElement clickWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(GridSaveButton_xpath));
	clickWebEelement.click();
	Thread.sleep(1000);
	
	return true;
	} catch (Exception e) {
		return false;
	}

	}

public boolean VerifyCheckBoxColumn()
{
 
try{
	WebElement letterOfCreditWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(CheckBoxColumn_xpath));
	letterOfCreditWebEelement.isDisplayed();
	return true;
} catch (Exception e) {
	return false;
}

}

public boolean VerifySearchFieldInLetterOfCredit()
{
 
try{
	WebElement letterOfCreditWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(searchButtonInLetterOfCredit_xpath));
	letterOfCreditWebEelement.isDisplayed();
	return true;
} catch (Exception e) {
	return false;
}

}

public boolean VerifyCancelButtonInLetterOfCredit()
{
 
try{
	WebElement letterOfCreditWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(CancelButtonSearchInLetterOfCredit_xpath));
	letterOfCreditWebEelement.isDisplayed();
	return true;
} catch (Exception e) {
	return false;
}

}

public boolean VerifySearchFieldInDiscriptionColumn()
{
 
try{
	WebElement letterOfCreditWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(SearchFieldInDiscriptionColumn_xpath));
	letterOfCreditWebEelement.isDisplayed();
	return true;
} catch (Exception e) {
	return false;
}

}



public boolean VerifyCancelButtonInDiscrptionColumn()
{
 
try{
	WebElement letterOfCreditWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(CancelButtonInDiscriptionColumn_xpath));
	letterOfCreditWebEelement.isDisplayed();
	return true;
} catch (Exception e) {
	return false;
}

}

public boolean VerifySerachButtonInExpiryDate()
{
 
try{
	WebElement letterOfCreditWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(SearchFieldInExpiryDate_xpath));
	letterOfCreditWebEelement.isDisplayed();
	return true;
} catch (Exception e) {
	return false;
}

}


public boolean VerifyCancelButtonInExpiryDateColumn()
{
 
try{
	WebElement letterOfCreditWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(CancelButtonSearchInExpiryDate_xpath));
	letterOfCreditWebEelement.isDisplayed();
	return true;
} catch (Exception e) {
	return false;
}

}


public boolean VerifySerachButtonInAmountColumn()
{
 
try{
	WebElement letterOfCreditWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(SearchFieldInAmountColumn_xpath));
	letterOfCreditWebEelement.isDisplayed();
	return true;
} catch (Exception e) {
	return false;
}

}

public boolean VerifyCancelButtonInAmountColumn()
{
 
try{
	WebElement letterOfCreditWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(CancelbuttonInAmountColumn_xpath));
	letterOfCreditWebEelement.isDisplayed();
	return true;
} catch (Exception e) {
	return false;
}

}


public boolean VerifySelectDropDown()
{
 
try{
	WebElement letterOfCreditWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(SelectDropDown_xpath));
	letterOfCreditWebEelement.isDisplayed();
	return true;
} catch (Exception e) {
	return false;
}

}


public boolean ValidationOfSelectDropDown()
{
 
try{
	WebElement letterOfCreditWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(SelectDropDown_xpath));
	letterOfCreditWebEelement.click();;
	return true;
} catch (Exception e) {
	return false;
}

}

public boolean VerifyCancelButtonInStatusColumn()
{
 
try{
	WebElement letterOfCreditWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(CancelButtonInStatusColumn_xpath));
	letterOfCreditWebEelement.click();;
	return true;
} catch (Exception e) {
	return false;
}

}



public boolean VerifyMaximizeDropDown()
{
 
try{
	WebElement letterOfCreditWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(MaximizeDropDownInStatus_xpath));
	letterOfCreditWebEelement.isDisplayed();
	return true;
} catch (Exception e) {
	return false;
}

}

public boolean ValidationMaximizeDropDown()
{
 
try{
	WebElement letterOfCreditWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(MaximizeDropDownInStatus_xpath));
	letterOfCreditWebEelement.click();
	Thread.sleep(3000);
	return true;
} catch (Exception e) {
	return false;
}

}

public boolean VerifySearchFieldInLCLimit()
{
 
try{
	WebElement letterOfCreditWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(searchFieldInLCLimit_xpath));
	letterOfCreditWebEelement.isDisplayed();
	return true;
} catch (Exception e) {
	return false;
}

}

public boolean VerifyCancelButtonInLCLimit()
{
 
try{
	WebElement letterOfCreditWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(CancelButtonInLCLimitColumn_xpath));
	letterOfCreditWebEelement.isDisplayed();
	return true;
} catch (Exception e) {
	return false;
}

}


public boolean VerifyTotalColumn()
{
 
try{
	WebElement letterOfCreditWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(TotalColumn_xpath));
	letterOfCreditWebEelement.isDisplayed();
	return true;
} catch (Exception e) {
	return false;
}

}

public boolean VerifyTotalAmountColumn(String Amount)
{
 
try{
	WebElement letterOfCreditWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(TotalAmount_xpath));
	String actual = letterOfCreditWebEelement.getText().trim();
	if (actual.equals(Amount))
		return true;
	else
		return false;

	
} catch (Exception e) {
	return false;
}

}

public boolean VerifygridSearchIcon()
{
 
try{
	WebElement letterOfCreditWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(SearchIconInGrid_xpath));
	letterOfCreditWebEelement.isDisplayed();
	return true;
} catch (Exception e) {
	return false;
}

}


public boolean ValidateSearchIconGrid()
{
 
try{
	WebElement letterOfCreditWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(SearchIconInGrid_xpath));
	letterOfCreditWebEelement.click();
	Thread.sleep(1000);
	return true;
} catch (Exception e) {
	return false;
}

}

public boolean VerifygridSearchIconPopUp(String header)
{
 
try{
	WebElement letterOfCreditWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(SearchPopupHeader_xpath));
	String actual=letterOfCreditWebEelement.getText();
	if (actual.equals(header))
		return true;
	else
		return false;

} catch (Exception e) {
	return false;
}

}

public boolean VerifyGridSearchPopupCloseButton()
{
 
try{
	WebElement letterOfCreditWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(SearchPopupClose_xpath));
	letterOfCreditWebEelement.click();
	Thread.sleep(1000);
	return true;
} catch (Exception e) {
	return false;
}

}


public boolean VerifyRecordsView()
{
 
try{
	WebElement letterOfCreditWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(RecordsView_xpath));
	letterOfCreditWebEelement.isDisplayed();
	return true;
} catch (Exception e) {
	return false;
}

}

public boolean VerifyMessage_WithoutGiving_letterOfCredit(String Message)
{
 
try{
	WebElement HeaderWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(VerifyMessage_WithOutGiving_letterOfCredit_xpath));
	String actual = HeaderWebEelement.getText();
	if (actual.equals(Message))
		return true;
	else
		return false;

} catch (Exception e) {
	return false;
}
} 

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


public boolean EnterTheInPutInLClimit(String Amount1)
{
 
try{
	WebElement HeaderWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(EnterLCLimit_xpath));
	HeaderWebEelement.clear();
	HeaderWebEelement.sendKeys(Amount1);
   return true; 
} catch (Exception e) {
	return false;
}

}

public boolean VerifyMessage_ByGivingAmount_greaterThanLClimit(String Message1)
{
 
try{
	WebElement HeaderWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(validationMessageWhenEnteredAmountIsMoreThanTheLClimit_xpath));
	String actual = HeaderWebEelement.getText();
	if (actual.equals(Message1))
		return true;
	else
		return false;

} catch (Exception e) {
	return false;
}
}


public boolean ValidationOfMessageWhenAmountFieldIsBlank(String Message1)
{
 
try{
	WebElement HeaderWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(validationMessageWhenAmountFieldBlank_xpath));
	String actual = HeaderWebEelement.getText();
	if (actual.equals(Message1))
		return true;
	else
		return false;

} catch (Exception e) {
	return false;
}
}




public boolean DoubleClickOnletterOfcredit(String data)
{
 
try{
	WebElement letterOfCreditWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(ExistingLetterOfCreditDetail_xpath));
	
	   
	    Actions action = new Actions(driver);
		action.doubleClick(letterOfCreditWebEelement).build().perform();
		
		WebElement letterOfCreditWebEelement1=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(ModifiedFieldInletterOfCreditColumn_xpath));
	
		letterOfCreditWebEelement1.clear();
		letterOfCreditWebEelement1.sendKeys(data);
		
	    
	return true;
} catch (Exception e) {
	return false;
}

}


public boolean ValidateMessageAfterModifyingLetterOfCRedit(String message)
{
 
try{
	WebElement letterOfCreditWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(ModifiedLetterOfCreditMessage_xpath));
	
	String actual=letterOfCreditWebEelement.getText();
      if (actual.equals(message))
  		return true;
  	else
  		return false;
 
	
} catch (Exception e) {
	return false;
}


}


public boolean closeThepopup()
{
 
try{
	WebElement letterOfCreditWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(closepopup_xpath));
	letterOfCreditWebEelement.click();
	return true;
	} catch (Exception e) {
		return false;
	}
}


public boolean VerifyChnagesIn_letterOfCredit(String data1)
{
 
try{
	WebElement letterOfCreditWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(ExistingLetterOfCreditDetail_xpath));
       String actual=letterOfCreditWebEelement.getText();
       if (actual.equals(data1))
     		return true;
     	else
     		return false;
    
      
	} catch (Exception e) {
		return false;
	}

	}


public boolean clickOnLetterOfCredit()
{
 
try{
	WebElement letterOfCreditWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(ExistingLetterOfCreditDetail_xpath));
	letterOfCreditWebEelement.click();
	return true;
	} catch (Exception e) {
		return false;
	}
}


public boolean ClickOnReload()
{
 
try{
	WebElement letterOfCreditWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(GridReloadButton_xpath));
	letterOfCreditWebEelement.click();
	
	return true;
	} catch (Exception e) {
		return false;
	}

	}


public boolean ValidationOfGrid()
{
 
try{
	WebElement letterOfCreditWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(GridExportButton_xpath));
	letterOfCreditWebEelement.click();
	Thread.sleep(3000);
	
	return true;
	} catch (Exception e) {
		return false;
	}

	}


public boolean VerifyExportPopupHeader(String PopUpHeader)
{
 
try{
	WebElement letterOfCreditWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(ExportPopUpHeader_xpath));
	String actual = letterOfCreditWebEelement.getText().trim();
	if (actual.equals(PopUpHeader))
		return true;
	else
		return false;

	
} catch (Exception e) {
	return false;
}

}
public boolean VerifyExportPopup_letterOfCredit()
{
 
try{
	WebElement letterOfCreditWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(ExportPopUp_letterOfCredit_xpath));
	letterOfCreditWebEelement.isDisplayed();
	
	
	WebElement letterOfCreditWebEelement1=new WebDriverWait(driver,10)
	.until(ExpectedConditions.visibilityOfElementLocated(ExportPopUP_discription_xpath));
	letterOfCreditWebEelement1.isDisplayed();

	return true;
	} catch (Exception e) {
		return false;
	}

	}

public boolean CloseTheExportPopup()
{
 
try{
	WebElement letterOfCreditWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(ExportPopup_close_xpath));
	letterOfCreditWebEelement.click();
	
	return true;
	} catch (Exception e) {
		return false;
	}

	}

public boolean verifyCloseTheExportPopup()
{
 
try{
	WebElement letterOfCreditWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(ExportPopup_close_xpath));
	letterOfCreditWebEelement.isDisplayed();
	
	return true;
	} catch (Exception e) {
		return false;
	}

	}
public boolean VerifyExportIcon_inPopup()
{
 
try{
	WebElement letterOfCreditWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(ExportIconInPopup_xpath));
	letterOfCreditWebEelement.isDisplayed();
	
	return true;
	} catch (Exception e) {
		return false;
	}

	}


public boolean ValidationExportIcon_inPopup()
{
 
try{
	WebElement letterOfCreditWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(ExportIconInPopup_xpath));
	letterOfCreditWebEelement.click();
	Thread.sleep(1000);
	
	return true;
	} catch (Exception e) {
		return false;
	}

	}
public boolean UncheckTheDiscription()
{
 
try{
	
	
	WebElement letterOfCreditWebEelement1=new WebDriverWait(driver,10)
	.until(ExpectedConditions.visibilityOfElementLocated(ExportPopup_discriptionCheckBox_xpath));
	letterOfCreditWebEelement1.click();
	Thread.sleep(1000);

	return true;
	} catch (Exception e) {
		return false;
	}

	}

public boolean VerifySearchFieldInLetterOfCredit(String input)
{
 
try{
	WebElement letterOfCreditWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(searchButtonInLetterOfCredit_xpath));
	letterOfCreditWebEelement.click();
	letterOfCreditWebEelement.sendKeys(input);
	Thread.sleep(1000);
	return true;
} catch (Exception e) {
	return false;
}

}


public boolean ValidationCancelButtonInLetterOfCredit()
{
 
try{
	WebElement letterOfCreditWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(CancelButtonSearchInLetterOfCredit_xpath));
	letterOfCreditWebEelement.click();
	Thread.sleep(1000);
	return true;
} catch (Exception e) {
	return false;
}

}


public boolean VerifySearchFieldInDiscriptionColumn_ByEnteringData(String input)
{
 
try{
	WebElement letterOfCreditWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(SearchFieldInDiscriptionColumn_xpath));
	letterOfCreditWebEelement.click();
	letterOfCreditWebEelement.sendKeys(input);
	return true;
} catch (Exception e) {
	return false;
}

}


public boolean VerifyingrecordsDiscription()
{
 
try{
	WebElement letterOfCreditWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(VerifyDataInDiscription_xpath));
	letterOfCreditWebEelement.isDisplayed();

	return true;
} catch (Exception e) {
	return false;
}

}


public boolean VerifySerachButtonInAmountColumn(String input)
{
 
try{
	WebElement letterOfCreditWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(SearchFieldInAmountColumn_xpath));
	letterOfCreditWebEelement.click();
	letterOfCreditWebEelement.sendKeys(input);
	return true;
} catch (Exception e) {
	return false;
}

}


public boolean ValidationGridCancelButton()
{
 
try{
	WebElement letterOfCreditWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(GridCancelButton_xpath));
	letterOfCreditWebEelement.click();
	
	return true;
	} catch (Exception e) {
		return false;
	}

	}


public boolean ValidationCancelButtonInDiscrptionColumn()
{
 
try{
	WebElement letterOfCreditWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(CancelButtonInDiscriptionColumn_xpath));
	letterOfCreditWebEelement.click();
	return true;
} catch (Exception e) {
	return false;
}

}

public boolean VerifySearchFieldInAmount(String input)
{
 
try{
	WebElement letterOfCreditWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(SearchFieldInAmountColumn_xpath));
	letterOfCreditWebEelement.click();
	letterOfCreditWebEelement.sendKeys(input);
	Thread.sleep(1000);
	return true;
} catch (Exception e) {
	return false;
}

}

public boolean VerifyRecordOfAmount()
{
 
try{
	WebElement letterOfCreditWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(VerifyrecordInAmountColumn_xpath));
	letterOfCreditWebEelement.click();
	return true;
} catch (Exception e) {
	return false;
}

}
public boolean ValidationCancelButtonInAmountColumn()
{
 
try{
	WebElement letterOfCreditWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(CancelbuttonInAmountColumn_xpath));
	letterOfCreditWebEelement.click();
	return true;
} catch (Exception e) {
	return false;
}

}
public boolean ValidationSearchFieldInLCLimit(String input)
{
 
try{
	WebElement letterOfCreditWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(searchFieldInLCLimit_xpath));
	letterOfCreditWebEelement.clear();
	letterOfCreditWebEelement.sendKeys(input);
	return true;
} catch (Exception e) {
	return false;
}

}
public boolean VerifyRecordOfLCLimit()
{
 
try{
	WebElement letterOfCreditWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(VerifyingRecordOfLCLimit_xpath));
	letterOfCreditWebEelement.click();
	return true;
} catch (Exception e) {
	return false;
}

}

public boolean ValidationCancelButtonInLCLimit()
{
 
try{
	WebElement letterOfCreditWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(CancelButtonInLCLimitColumn_xpath));
	letterOfCreditWebEelement.click();
	return true;
} catch (Exception e) {
	return false;
}

}

public boolean ValidationSearchFieldExpiry(String input)
{
 
try{
	WebElement letterOfCreditWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(SearchFieldInExpiryDate_xpath));
	letterOfCreditWebEelement.clear();
	letterOfCreditWebEelement.sendKeys(input);
	letterOfCreditWebEelement.sendKeys(Keys.ESCAPE);
	return true;
} catch (Exception e) {
	return false;
}

}

public boolean VerifyRecordOfExpiry()
{
 
try{
	WebElement letterOfCreditWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(VerifyRecordOfExpiry_xpath));
	letterOfCreditWebEelement.isDisplayed();
	return true;
} catch (Exception e) {
	return false;
}

}

public boolean ValidationCancelButtonInExpiryDateColumn()
{
 
try{
	WebElement letterOfCreditWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(CancelButtonSearchInExpiryDate_xpath));
	letterOfCreditWebEelement.click();
	return true;
} catch (Exception e) {
	return false;
}

}

public boolean ValidationStatusColumn(String input)
{
 
try{
	WebElement letterOfCreditWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(StatusColumn_xpath));
	
	Select sel = new Select(letterOfCreditWebEelement);
	sel.selectByVisibleText(input);
	/*List<WebElement> list = sel.getOptions();
	
	for (WebElement ele : list) 
	{
		
		if (ele.getText().equals(input)) 
		{
	 		ele.click();
			
			 return true;
		}
	}*/
	   
	return true;
	} catch (Exception e) {
		return false;
	}

	}
public boolean VerifyRecordOfStatus()
{
 
try{
	WebElement letterOfCreditWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(VerifyRecordOfStatusColumn_xpath));
	letterOfCreditWebEelement.isDisplayed();
	return true;
} catch (Exception e) {
	return false;
}

}
public boolean ValidationCancelButtonInStatusColumn()
{
 
try{
	WebElement letterOfCreditWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(CancelButtonInStatusColumn_xpath));
	letterOfCreditWebEelement.click();
	return true;
} catch (Exception e) {
	return false;
}


}}






