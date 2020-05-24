package com.cync.ClientMaintenance;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.cync.base.BasePage;
import com.cync.pages.SignBBCPage;

public class CollateralReservesPages extends BasePage  {
	
	private final By CollateralTypesDropdownValues_xpath = By.xpath("//select[@id='inventory_reserve_collateral_type']");
	private final By DeleteBtn_xpath = By.xpath("//span[@class='ui-icon ui-icon-trash']");
	private final By AddBtn_xpath = By.xpath("//span[@class='ui-icon ui-icon ui-icon-plus']");
	private final By SaveBtn_xpath = By.xpath("//span[@class='ui-icon ui-icon ui-icon-disk']");
	private final By ExportBtn_xpath = By.xpath("//span[@class='ui-icon ui-icon-extlink']");
	private final By CancelBtn_xpath = By.xpath("//span[@class='ui-icon ui-icon ui-icon-cancel']");
	private final By DescriptionField_xpath = By.xpath("//td[@role='gridcell']/input[@name='description']");
	private final By Reload_xpath=By.xpath("//span[@class='ui-icon ui-icon-refresh']");
	//private final By enterAdvancePercentField_xpath = By.xpath("(//input[@type='text'])[8]");
	private final By CollateralReservesMsg_xpath = By.xpath("//div[@class='ui-state-success']");
	private final By CloseBtnPopUp_xpath = By.xpath("//div[@class='ui-jqdialog ui-widget ui-widget-content ui-corner-all ui-dialog jqmID1']//a[@class='ui-jqdialog-titlebar-close ui-corner-all']");
	private final By CollateralReservesErrorMsg_xpath = By.xpath("//div[@class='ui-state-error']");
	private final By EnterTextInValue_xpath = By.xpath("(//input[@type='text'])[9]");
	private final By EnterReserveFieldData_xpath = By.xpath("(//input[@type='text'])[10]");
	private final By PrimaryCheckBox_xpath = By.xpath("//input[@id='cb_inventory_reserve']");
	private final By DeleteBtnClick_xpath = By.xpath("(//a[@class='fm-button ui-state-default ui-corner-all fm-button-icon-left'])[1]");
	private final By BBCRecalculationProcessButton_xpath=By.xpath("//a[contains(text(),'Process/Re-Calculate BBC')]");
	
	//private final By BBCAvailability_xpath=By.id("tab_150");
	private final By BBCAvailability_xpath=By.xpath("//li[@id='tab_284' or @id='tab_150']");
	private final By Total_xpath=By.xpath("//tbody//tr[33]//td[6]");
	private final By bbctrendreport_xpath=By.xpath("(//li[@class='open_menu'])[8]");
	private final By bbcstartdate_xpath=By.xpath("//input[@name='start_date']");
	private final By clickanywere_xpath1=By.xpath("//div[@class='ui-dialog-titlebar ui-widget-header ui-corner-all ui-helper-clearfix']");
	private final By enddate_xpath=By.xpath("//input[@name='end_date']");
	private final By bbcorientation_xpath=By.xpath("//select[@name='bbc_print_orientation']");
	private final By bbxxls_xpath=By.xpath("//div[@class='ui-dialog-buttonset']//button[text()='XLS']");
	private final By bbcreport_xpath=By.xpath("(//li[@class='open_menu'])[9]");
	private final By bbcdilogbox_xpath=By.xpath("//select[@name='bbc_status']");
	private final By BBCExecutivetrendReport_xpath=By.xpath("(//li[@class='open_menu'])[24]");
	private final By bbCdate_xpath=By.xpath("//input[@id='past_comments_true']");
	private final By Generate_xpath=By.xpath("//button[contains(text(),'Generate')]");
	private final By Download_xpath=By.xpath(" //div[@class='export']");
	private final By Search_xpath=By.xpath("//input[@name='description']");
	private final By firstpage_xpath=By.xpath("//span[@class='ui-icon ui-icon-seek-first']");
	private final By previouspage_xpath=By.xpath(" //span[@class='ui-icon ui-icon-seek-prev']");
	private final By Nextpage_xpath=By.xpath("//span[@class='ui-icon ui-icon-seek-next']");
	private final By lastpage_xpath=By.xpath("//span[@class='ui-icon ui-icon-seek-end']");
	//kruthivas 
	private final By Selectcross_xpath=By.xpath("//a[@class='fm-button ui-state-default ui-corner-all']");
	private final By enterAdvancePercentField_xpath = By.xpath("(//input[@class='ui-widget-content ui-corner-all'])[3]");
	private final By DeleteBtnpop_xpath=By.xpath("//a[@id='dData']");
	private final By ApproveBBCButton_xpath=By.xpath("(//a[contains(text(),'Approve BBC')])[2]");
	private final By bbctrendreport3_xpath=By.xpath("(//a[contains(text(),'BBC Trend Report')])[2]");

	public CollateralReservesPages(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	
	
	public boolean  verifyCollateralTypesDropdownValues(){
		try {
			String[] exp = {"All","Receivables","Inventory","Other Collateral","Total Collateral"};
			
			WebElement dropdown = driver.findElement(CollateralTypesDropdownValues_xpath);  
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
	
	
	public String selectValueInCollateralTypeDropdown(String SelectCollateralType) throws InterruptedException{
		

		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.visibilityOfElementLocated((CollateralTypesDropdownValues_xpath)));

		WebElement element = driver.findElement((CollateralTypesDropdownValues_xpath));
		Select sel = new Select(element);
		List<WebElement> list = sel.getOptions();	
		
		
		for(WebElement ele : list){
			
			if(ele.getText().equals(SelectCollateralType)){
				ele.click();
				//////Thread.sleep(10000);
				break;
			}
		}
		return SelectCollateralType;

	}
	
	 
	 public boolean Delete_Button()
	 {
	 try{

	 	WebElement DeleteBtnWebEelement=new WebDriverWait(driver,5)
	 	.until(ExpectedConditions.visibilityOfElementLocated(DeleteBtn_xpath));
	 	DeleteBtnWebEelement.isDisplayed();
	
	 	return true;
	 }
	 catch(Exception ex){
	 	return false;
	 }

	 }
	 
	 public boolean Generate()
	 {
	 try{

	 	WebElement DeleteBtnWebEelement=new WebDriverWait(driver,5)
	 	.until(ExpectedConditions.visibilityOfElementLocated(Generate_xpath));
	 	DeleteBtnWebEelement.isDisplayed();
	 	 
	 	return true;
	 }
	 catch(Exception ex){
	 	return false;
	 }

	 }
	
	
	 public boolean BBCexecutivetrend()
	 {
	 try{

	 	WebElement DeleteBtnWebEelement=new WebDriverWait(driver,5)
	 	.until(ExpectedConditions.visibilityOfElementLocated(BBCExecutivetrendReport_xpath));
	 	DeleteBtnWebEelement.click();
	
	 	return true;
	 }
	 catch(Exception ex){
	 	return false;
	 }

	 }
	 public boolean BBCdate()
	 {
	 try{

	 	WebElement DeleteBtnWebEelement=new WebDriverWait(driver,5)
	 	.until(ExpectedConditions.visibilityOfElementLocated(bbCdate_xpath));
	 	DeleteBtnWebEelement.click();
	
	 	return true;
	 }
	 catch(Exception ex){
	 	return false;
	 }

	 }
	
	 public boolean gettotal()
	 {
	 try{

	 	WebElement DeleteBtnWebEelement=new WebDriverWait(driver,5)
	 	.until(ExpectedConditions.visibilityOfElementLocated(Total_xpath));
	String d= 	DeleteBtnWebEelement.getText();
	System.out.println(d);
	 	return true;
	 }
	 catch(Exception ex){
	 	return false;
	 }

	 }
	
	
	 public boolean AddRecord_Button()
	 {
	 try{

	 	WebElement AddBtnWebEelement=new WebDriverWait(driver,100)
	 	.until(ExpectedConditions.visibilityOfElementLocated(AddBtn_xpath));
	 	AddBtnWebEelement.isDisplayed();
	
	 	return true;
	 }
	 catch(Exception ex){
	 	return false;
	 }

	 }
	 
	 public boolean SaveRecord_Button()
	 {
	 try{

	 	WebElement AddBtnWebEelement=new WebDriverWait(driver,5)
	 	.until(ExpectedConditions.visibilityOfElementLocated(SaveBtn_xpath));
	 	AddBtnWebEelement.isDisplayed();
	
	 	return true;
	 }
	 catch(Exception ex){
	 	return false;
	 }

	 }
	
	 public boolean Export_Button()
	 {
	 try{

	 	WebElement AddBtnWebEelement=new WebDriverWait(driver,5)
	 	.until(ExpectedConditions.visibilityOfElementLocated(ExportBtn_xpath));
	 	AddBtnWebEelement.isDisplayed();
	
	 	return true;
	 }
	 catch(Exception ex){
	 	return false;
	 }

	 }
	 
	 public boolean Reload_Button()
	 {
	 try{

	 	WebElement AddBtnWebEelement=new WebDriverWait(driver,5)
	 	.until(ExpectedConditions.visibilityOfElementLocated(Reload_xpath));
	 	AddBtnWebEelement.isDisplayed();
	
	 	return true;
	 }
	 catch(Exception ex){
	 	return false;
	 }

	 }
	
	 public boolean download()
	 {
	 try{

	 	WebElement AddBtnWebEelement=new WebDriverWait(driver,5)
	 	.until(ExpectedConditions.visibilityOfElementLocated(Download_xpath));
	 	AddBtnWebEelement.isDisplayed();
	
	 	return true;
	 }
	 catch(Exception ex){
	 	return false;
	 }

	 }
	 
	 public boolean clickExport_Button()
	 {
	 try{

	 	WebElement AddBtnWebEelement=new WebDriverWait(driver,5)
	 	.until(ExpectedConditions.visibilityOfElementLocated(ExportBtn_xpath));
	 	AddBtnWebEelement.click();
	
	 	return true;
	 }
	 catch(Exception ex){
	 	return false;
	 }

	 }
	 public boolean Cancel_Button()
	 {
	 try{

	 	WebElement AddBtnWebEelement=new WebDriverWait(driver,5)
	 	.until(ExpectedConditions.visibilityOfElementLocated(CancelBtn_xpath));
	 	AddBtnWebEelement.isDisplayed();
	
	 	return true;
	 }
	 catch(Exception ex){
	 	return false;
	 }

	 }
	
	
	 public boolean AddRecord_ButtonClick()
	 {
	 try{
		 ////Thread.sleep(3000);
	 	WebElement AddBtnWebEelement=new WebDriverWait(driver,5)	
	 	.until(ExpectedConditions.visibilityOfElementLocated(AddBtn_xpath));
		 Thread.sleep(2000);	 
	 	AddBtnWebEelement.click();
	 	return true;
	 }
	 catch(Exception ex){
	 	return false;
	 }

	 }
	 
	
	 public boolean EnterDescription(String EnterData)
	 {
	 try{

	 	WebElement enterBankRoutingWebEelement=new WebDriverWait(driver,5)
	 	.until(ExpectedConditions.visibilityOfElementLocated(DescriptionField_xpath));
	 	////Thread.sleep(3000);
	 	enterBankRoutingWebEelement.sendKeys(EnterData);
	
	 	return true;
	 }
	 catch(Exception ex){
	 	return false;
	 }

	 }
	 
	 
	 public boolean EnterValueInSearch(String EnterData)
	 {
	 try{

	 	WebElement enterBankRoutingWebEelement=new WebDriverWait(driver,5)
	 	.until(ExpectedConditions.visibilityOfElementLocated(Search_xpath));
	 	enterBankRoutingWebEelement.clear();
	 	enterBankRoutingWebEelement.sendKeys(EnterData);
	
	 	return true;
	 }
	 catch(Exception ex){
	 	return false;
	 }

	 }
	 
	 public boolean Cancel_ButtonClick()
	 {
	 try{

	 	WebElement AddBtnWebEelement=new WebDriverWait(driver,5)
	 	.until(ExpectedConditions.visibilityOfElementLocated(CancelBtn_xpath));
	 	AddBtnWebEelement.click();
	
	 	return true;
	 }
	 catch(Exception ex){
	 	return false;
	 }

	 }
	
	 
	 public boolean EnterAdvancePercent(String EnterAdvanceData)
	 {
	 try{

	 	WebElement enterAdvancePercentWebEelement=new WebDriverWait(driver,5)
	 	.until(ExpectedConditions.visibilityOfElementLocated(enterAdvancePercentField_xpath));
	
	 	enterAdvancePercentWebEelement.sendKeys(EnterAdvanceData);
	
	 	return true;
	 }
	 catch(Exception ex){
	 	return false;
	 }

	 }
	 
	 public boolean SaveRecord_ButtonClick()
	 {
	 try{

	 	WebElement AddBtnWebEelement=new WebDriverWait(driver,5)
	 	.until(ExpectedConditions.visibilityOfElementLocated(SaveBtn_xpath));
	 	AddBtnWebEelement.click();
	 	//////Thread.sleep(500);
	
	 	return true;
	 }
	 catch(Exception ex){
	 	return false;
	 }

	 }
	 
	 public String verifyMessageAfterSave(String successMsg)
	    {
	    try{
	       WebElement SaveWebEelement=new WebDriverWait(driver,10)
	       .until(ExpectedConditions.visibilityOfElementLocated(CollateralReservesMsg_xpath));
	       
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
	 
	 
	 public boolean PopUpClose_ButtonClick()
	 {
	 try{
          Thread.sleep(100);
	 	WebElement AddBtnWebEelement=new WebDriverWait(driver,10)
	 	.until(ExpectedConditions.visibilityOfElementLocated(CloseBtnPopUp_xpath));
	 	AddBtnWebEelement.click();
	
	 	return true;
	 }
	 catch(Exception ex){
	 	return false;
	 }

	 }
	//click on  popup cross

		public boolean clickOnPopupCross() {
			try {
			    WebElement clickOnPopupDelete = new WebDriverWait(driver, 5)
			    .until(ExpectedConditions.visibilityOfElementLocated(Selectcross_xpath));
			    Thread.sleep(500);
			    clickOnPopupDelete.click();

			    return true;
			} catch (Exception ex) {
			    return false;
			}
		}
	 
	 
	 public String verifyErrorMessageAfterSave(String ErrorMsg)
	    {
	    try{
	       WebElement SaveWebEelement=new WebDriverWait(driver,10)
	       .until(ExpectedConditions.visibilityOfElementLocated(CollateralReservesErrorMsg_xpath));
	       
	      String actualMsg= SaveWebEelement.getText();
	      if(actualMsg.equalsIgnoreCase(ErrorMsg))
	      {
	       return actualMsg;
	      }
	       
	    }
	    catch(Exception ex){
	     
	    }
	 return ErrorMsg;
	    }
	 
	 public boolean EnterTextInValue(String EnterValueFieldData)
	 {
	 try{

	 	WebElement enterAdvancePercentWebEelement=new WebDriverWait(driver,5)
	 	.until(ExpectedConditions.visibilityOfElementLocated(EnterTextInValue_xpath));
	 	enterAdvancePercentWebEelement.clear();
	 	enterAdvancePercentWebEelement.sendKeys(EnterValueFieldData);
	
	 	return true;
	 }
	 catch(Exception ex){
	 	return false;
	 }

	 }
	 
	 
	 public boolean EnterTextInReserve(String EnterReserveFieldData)
	 {
	 try{

	 	WebElement enterAdvancePercentWebEelement=new WebDriverWait(driver,5)
	 	.until(ExpectedConditions.visibilityOfElementLocated(EnterReserveFieldData_xpath));
	 	enterAdvancePercentWebEelement.clear();
	 	enterAdvancePercentWebEelement.sendKeys(EnterReserveFieldData);
	//////Thread.sleep(500);
	 	return true;
	 }
	 catch(Exception ex){
	 	return false;
	 }

	 }
	 

	 public boolean PrimaryCheckBoxSelect()
	 {
	 try{
		 ////Thread.sleep(1000);
		//visibilityOfElementLocated(PrimaryCheckBox_xpath));
	 	WebElement CheckBoxWebEelement=new WebDriverWait(driver,5)
	 	.until(ExpectedConditions.visibilityOfElementLocated(PrimaryCheckBox_xpath));
	 	CheckBoxWebEelement.click();
	
	 	return true;
	 }
	 catch(Exception ex){
	 	return false;
	 }

	 }
	 
	 public boolean Delete_ButtonClick()
	 {
	 try{
		 ////Thread.sleep(1000);
	 	WebElement DeleteBtnWebEelement=new WebDriverWait(driver,5)
	 	.until(ExpectedConditions.visibilityOfElementLocated(DeleteBtn_xpath));
	 	DeleteBtnWebEelement.click();
	 	//////Thread.sleep(500);
	
	 	return true;
	 }
	 catch(Exception ex){
	 	return false;
	 }

	
	 }
	 
	 public boolean DeleteBtnClickPopUp()
	 {
	 try{
		 ////Thread.sleep(1000);
	 	WebElement DeleteBtnWebEelement=new WebDriverWait(driver,5)
	 	.until(ExpectedConditions.visibilityOfElementLocated(DeleteBtnClick_xpath));
	 	DeleteBtnWebEelement.click();
	 	//////Thread.sleep(500);
	
	 	return true;
	 }
	 catch(Exception ex){
	 	return false;
	 }

	 }
	
	 
	 public  boolean clickOnProcessButton() {
		 try {
			 Thread.sleep(500);
			  WebElement IneligibleCalculationPageWebElement = new WebDriverWait(driver,10)
			 .until(ExpectedConditions.elementToBeClickable(BBCRecalculationProcessButton_xpath));
			 IneligibleCalculationPageWebElement.click();
			////Thread.sleep(5000);
		
			 Alert simpleAlert = driver.switchTo().alert();
			 simpleAlert.accept();
			////Thread.sleep(1000);
			 return true;
			 }
		 
	catch (Exception ex) {
	  return false;
					}
	}
	 
	 public boolean clickonbbcavablity()
	 {
	 try{
	 WebElement bbcavablity =new WebDriverWait(driver,10)
	 .until(ExpectedConditions.visibilityOfElementLocated(BBCAvailability_xpath));
	 bbcavablity.click();
	 //////Thread.sleep(7000);

	 return true;
	 }
	 catch(Exception ex){

	 }
	 return false;
	 }
	 

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

public String startdate(String ClientData)
{
try{
WebElement startdate =new WebDriverWait(driver,5)
.until(ExpectedConditions.visibilityOfElementLocated(bbcstartdate_xpath));
startdate.click();
//////Thread.sleep(2000);
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
	    //////Thread.sleep(500);
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
//////Thread.sleep(2000);
endtdate.sendKeys(ClientData);

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
			//////Thread.sleep(10000);
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
	    //////Thread.sleep(10000);
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


public boolean firstpage()
{
try{

	WebElement DeleteBtnWebEelement=new WebDriverWait(driver,5)
	.until(ExpectedConditions.visibilityOfElementLocated(firstpage_xpath));
	DeleteBtnWebEelement.isDisplayed();
	//////Thread.sleep(500);

	return true;
}
catch(Exception ex){
	return false;
}

}

public boolean previouspage()
{
try{

	WebElement DeleteBtnWebEelement=new WebDriverWait(driver,5)
	.until(ExpectedConditions.visibilityOfElementLocated(previouspage_xpath));
	DeleteBtnWebEelement.isDisplayed();
	//////Thread.sleep(500);

	return true;
}
catch(Exception ex){
	return false;
}

}

public boolean nextpage()
{
try{

	WebElement DeleteBtnWebEelement=new WebDriverWait(driver,5)
	.until(ExpectedConditions.visibilityOfElementLocated(Nextpage_xpath));
	DeleteBtnWebEelement.isDisplayed();
	//////Thread.sleep(500);

	return true;
}
catch(Exception ex){
	return false;
}

}

public boolean lastpage()
{
try{

	WebElement DeleteBtnWebEelement=new WebDriverWait(driver,5)
	.until(ExpectedConditions.visibilityOfElementLocated(lastpage_xpath));
	DeleteBtnWebEelement.isDisplayed();
	//////Thread.sleep(500);

	return true;
}
catch(Exception ex){
	return false;
}


}
//kruthivas
public SignBBCPage ApproveBBCButtonClick()
{
try{
	WebElement  netBorrowingBaseWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(ApproveBBCButton_xpath));
	netBorrowingBaseWebEelement.click();
	return new SignBBCPage(driver);
}
catch(Exception ex){

}
return null;
}
public boolean clickonbbctrendreport3() {
	try {
	    WebElement bbctrendreport = new WebDriverWait(driver, 5)
		    .until(ExpectedConditions
			    .visibilityOfElementLocated(bbctrendreport3_xpath));
	    bbctrendreport.click();
	    //////Thread.sleep(500);
	    return true;
	} catch (Exception ex) {
	    return false;
	}

    }
public boolean Generate3()
{
try{
	Thread.sleep(1000);
	WebElement DeleteBtnWebEelement=new WebDriverWait(driver,10)
	.until(ExpectedConditions.visibilityOfElementLocated(Generate_xpath));
	DeleteBtnWebEelement.click();
	Thread.sleep(1000);
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
	 
	return true;
}
catch(Exception ex){
	return false;
}
}
}









