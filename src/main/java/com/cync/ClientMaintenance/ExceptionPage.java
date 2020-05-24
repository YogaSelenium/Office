package com.cync.ClientMaintenance;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.cync.base.BasePage;

public class ExceptionPage extends BasePage{
	 private  final By ExcepDesc_xpath=By.xpath("//select[@name='lender_exception_id']");
	 private final By ExcepNotes_xpath=By.xpath("//input[@name='description']");
	 private final By ExcepSign_xpath=By.xpath("//div[@id='jqgh_borrower_exceptions_list_operator']");
	 private final By ValueType_xpath=By.xpath("//div[@id='jqgh_borrower_exceptions_list_value_type']");
	 private final By ExcepValue_xpath=By.xpath("//div[@id='jqgh_borrower_exceptions_list_exception_value']");
	 private final By System_xpath=By.xpath("//select[@name='system_defined']");
	 private final By Delete_xpath=By.xpath("//td[@title='Delete selected row']//div[@class='ui-pg-div']");
	 private final By Reload_xpath=By.xpath("//span[@class='ui-icon ui-icon-refresh']");
	 private final By AddRecord_xpath=By.xpath("//td[@title='Add Record']");
	 private final By Save_xpath=By.xpath("//td[@title='Save Record']");
	 private final By Cancel_xpath=By.xpath("//td[@title='Cancel']");
	 private final By Export_xpath=By.xpath("//td[@title='Export Data']");
	 private final By SelectExceDesc_xpath=By.xpath("//select[@name='lender_exception_id']");
	 private final By SelectExcepNotes_xpath=By.xpath("//input[@name='description']");
	 private final By SelectExceSign_xpath=By.xpath("//select[@name='operator']");
	 private final By SelectValueType_xpath=By.xpath("//select[@name='value_type']");
	 private final By EnterExcepValue_xpath=By.xpath("//input[@name='exception_value']");
	// private final By Check_xpath=By.xpath("//input[@name='jqg_borrower_exceptions_list_154331']");
	 //kruthivas
	 private final By Check_xpath=By.xpath("//input[@id='cb_borrower_exceptions_list']");
	 private final By DelPop_xpath=By.xpath("//a[@id='dData']");
	 private final By ExportExcepDesc_xpath=By.xpath("(//input[@id='export_cols'])[1]");
	 private final By Exportbtn_xpath=By.xpath("//div[@class='export']");
	 private final By NextPage_xpath=By.id("next_borrower_exceptions_pager");
	 private final By Lastpage_xpath=By.id("last_borrower_exceptions_pager");
	 private final By Firstpage_xpath=By.id("first_borrower_exceptions_pager");
	 private final By PreviousPage_xpath=By.id("prev_borrower_exceptions_pager");
	 private final By ExcepText_xpath=By.xpath("(//input[@class='ui-widget-content ui-corner-all'])[2]");
	 //kruthivas 
	 private final By Creoss_xpath=By.xpath("(//a[@class='ui-jqdialog-titlebar-close ui-corner-all'])[1]");
	 private final By Close_xpath=By.xpath("//a[@id='closedialog']");
	 
	 
public ExceptionPage(WebDriver driver) 
{
		
		super(driver);
}

public boolean  Click_on_AddBtn()
{
try{
	WebElement HeaderWebEelement=new WebDriverWait(driver,5)
		.until(ExpectedConditions.visibilityOfElementLocated(AddRecord_xpath));
	HeaderWebEelement.click();
	//////Thread.sleep(5000);
	return true;
}
catch(Exception ex){
	return false;

}


}
public boolean  Click_on_CancelBtn()
{
try{
	WebElement HeaderWebEelement=new WebDriverWait(driver,5)
		.until(ExpectedConditions.visibilityOfElementLocated(Cancel_xpath));
	HeaderWebEelement.click();
	//////Thread.sleep(5000);
	return true;
}
catch(Exception ex){
	return false;

}


}

public boolean  Click_on_Download()
{
try{
	WebElement HeaderWebEelement=new WebDriverWait(driver,5)
		.until(ExpectedConditions.visibilityOfElementLocated(Exportbtn_xpath));
	HeaderWebEelement.click();
	//////Thread.sleep(5000);
	return true;
}
catch(Exception ex){
	return false;

}


}
public boolean  Click_on_Nextpage()
{
try{
	WebElement HeaderWebEelement=new WebDriverWait(driver,5)
		.until(ExpectedConditions.visibilityOfElementLocated(NextPage_xpath));
	HeaderWebEelement.click();
	//////Thread.sleep(5000);
	return true;
}
catch(Exception ex){
	return false;

}


}
public boolean  Click_on_Prevpage()
{
try{
	WebElement HeaderWebEelement=new WebDriverWait(driver,5)
		.until(ExpectedConditions.visibilityOfElementLocated(PreviousPage_xpath));
	HeaderWebEelement.click();
	//////Thread.sleep(5000);
	return true;
}
catch(Exception ex){
	return false;

}


}
public boolean  Click_on_Lastpage()
{
try{
	WebElement HeaderWebEelement=new WebDriverWait(driver,5)
		.until(ExpectedConditions.visibilityOfElementLocated(Lastpage_xpath));
	HeaderWebEelement.click();
	//////Thread.sleep(5000);
	return true;
}
catch(Exception ex){
	return false;

}


}
public boolean  Click_on_Firstpage()
{
try{
	WebElement HeaderWebEelement=new WebDriverWait(driver,5)
		.until(ExpectedConditions.visibilityOfElementLocated(Firstpage_xpath));
	HeaderWebEelement.click();
	//////Thread.sleep(5000);
	return true;
}
catch(Exception ex){
	return false;

}


}

public boolean  Click_on_ExportExcepDesc()
{
try{
	WebElement HeaderWebEelement=new WebDriverWait(driver,5)
		.until(ExpectedConditions.visibilityOfElementLocated(ExportExcepDesc_xpath));
	HeaderWebEelement.click();
	HeaderWebEelement.click();
	
	//////Thread.sleep(5000);
	return true;
}
catch(Exception ex){
	return false;

}


}

public boolean  Click_on_ExportBtn()
{
try{
	WebElement HeaderWebEelement=new WebDriverWait(driver,5)
		.until(ExpectedConditions.visibilityOfElementLocated(Export_xpath));
	HeaderWebEelement.click();
	//////Thread.sleep(5000);
	return true;
}
catch(Exception ex){
	return false;

}


}
public boolean  Click_on_Delpop()
{
try{
	Thread.sleep(500);
	WebElement HeaderWebEelement=new WebDriverWait(driver,20)
		.until(ExpectedConditions.visibilityOfElementLocated(DelPop_xpath));
	Thread.sleep(500);
	HeaderWebEelement.click();

	return true;
}
catch(Exception ex){
	return false;

}


}

public boolean  Click_on_Reload()
{
try{
	WebElement HeaderWebEelement=new WebDriverWait(driver,5)
		.until(ExpectedConditions.visibilityOfElementLocated(Reload_xpath));
	HeaderWebEelement.click();
	//////Thread.sleep(5000);
	return true;
}
catch(Exception ex){
	return false;

}


}
public boolean  Click_on_Deletebtn()
{
try{
	WebElement HeaderWebEelement=new WebDriverWait(driver,5)
		.until(ExpectedConditions.visibilityOfElementLocated(Delete_xpath));
	HeaderWebEelement.click();
	//////Thread.sleep(5000);
	return true;
}
catch(Exception ex){
	return false;

}


}

public boolean  Click_on_Checkbox()
{
try{
	Thread.sleep(1000);
	WebElement HeaderWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(Check_xpath));
	HeaderWebEelement.click();
	return true;
}
catch(Exception ex){
	return false;

}


}

	 public Boolean VerifyCancelbtn()
		{
		try{
			WebElement HeaderWebEelement=new WebDriverWait(driver,5)
				.until(ExpectedConditions.visibilityOfElementLocated(Cancel_xpath));
			HeaderWebEelement.isDisplayed();
			//////Thread.sleep(5000);
			return true;
		}
		catch(Exception ex){
			
		
		return false;
		}
	 
		}
	 
	 public Boolean VerifyExportbtn()
		{
		try{
			WebElement HeaderWebEelement=new WebDriverWait(driver,5)
				.until(ExpectedConditions.visibilityOfElementLocated(Export_xpath));
			HeaderWebEelement.isDisplayed();
			//////Thread.sleep(5000);
			return true;
		}
		catch(Exception ex){
			
		
		return false;
		}
	 
		}
	 public Boolean VerifyExcepDesc()
		{
		try{
			WebElement HeaderWebEelement=new WebDriverWait(driver,5)
				.until(ExpectedConditions.visibilityOfElementLocated(ExcepDesc_xpath));
			HeaderWebEelement.isDisplayed();
			//////Thread.sleep(5000);
			return true;
		}
		catch(Exception ex){
			
		
		return false;
		}
	 
		}
	 public Boolean VerifySaveBtn()
		{
		try{
			WebElement HeaderWebEelement=new WebDriverWait(driver,5)
				.until(ExpectedConditions.visibilityOfElementLocated(Save_xpath));
			HeaderWebEelement.isDisplayed();
			//////Thread.sleep(5000);
			return true;
		}
		catch(Exception ex){
			
		
		return false;
		}
	 
		}
	 public Boolean VerifyAddBtn()
		{
		try{
			WebElement HeaderWebEelement=new WebDriverWait(driver,5)
				.until(ExpectedConditions.visibilityOfElementLocated(AddRecord_xpath));
			HeaderWebEelement.isDisplayed();
			//////Thread.sleep(5000);
			return true;
		}
		catch(Exception ex){
			
		
		return false;
		}
	 
		}
	 public Boolean VerifyRelaodBtn()
		{
		try{
			WebElement HeaderWebEelement=new WebDriverWait(driver,5)
				.until(ExpectedConditions.visibilityOfElementLocated(Reload_xpath));
			HeaderWebEelement.isDisplayed();
			//////Thread.sleep(5000);
			return true;
		}
		catch(Exception ex){
			
		
		return false;
		}
	 
		}
	 public Boolean VerifyExcepNotes()
		{
		try{
			WebElement HeaderWebEelement=new WebDriverWait(driver,5)
				.until(ExpectedConditions.visibilityOfElementLocated(ExcepNotes_xpath));
			HeaderWebEelement.isDisplayed();
			//////Thread.sleep(5000);
			return true;
		}
		catch(Exception ex){
			
		
		return false;
		}
	 
		}
	 public Boolean VerifyExcepSign()
		{
		try{
			WebElement HeaderWebEelement=new WebDriverWait(driver,5)
				.until(ExpectedConditions.visibilityOfElementLocated(ExcepSign_xpath));
			HeaderWebEelement.isDisplayed();
			//////Thread.sleep(5000);
			return true;
		}
		catch(Exception ex){
			
		
		return false;
		}
	 
		}
	 public Boolean VerifyValueType()
		{
		try{
			WebElement HeaderWebEelement=new WebDriverWait(driver,5)
				.until(ExpectedConditions.visibilityOfElementLocated(ValueType_xpath));
			HeaderWebEelement.isDisplayed();
			//////Thread.sleep(5000);
			return true;
		}
		catch(Exception ex){
			
		
		return false;
		}
	 
		}
	 public Boolean VerifyExcepValue()
		{
		try{
			WebElement HeaderWebEelement=new WebDriverWait(driver,5)
				.until(ExpectedConditions.visibilityOfElementLocated(ExcepValue_xpath));
			HeaderWebEelement.isDisplayed();
			//////Thread.sleep(5000);
			return true;
		}
		catch(Exception ex){
			
		
		return false;
		}
	 
		}
	 public Boolean VerifySystem()
		{
		try{
			WebElement HeaderWebEelement=new WebDriverWait(driver,5)
				.until(ExpectedConditions.visibilityOfElementLocated(System_xpath));
			HeaderWebEelement.isDisplayed();
			//////Thread.sleep(5000);
			return true;
		}
		catch(Exception ex){
			
		
		return false;
		}
	 
		}
	 public Boolean VerifyDeleteBtn()
		{
		try{
			WebElement HeaderWebEelement=new WebDriverWait(driver,5)
				.until(ExpectedConditions.visibilityOfElementLocated(Delete_xpath));
			HeaderWebEelement.isDisplayed();
			//////Thread.sleep(5000);
			return true;
		}
		catch(Exception ex){
			
		
		return false;
		}
	 
		}
	 
	 public boolean Click_on_ExcepDesc(String sw) {
			try {

				WebElement accTypeDropdownWebEelement = new WebDriverWait(driver, 5)
				.until(ExpectedConditions.visibilityOfElementLocated(SelectExceDesc_xpath));
				Thread.sleep(500);
				Select sel = new Select(accTypeDropdownWebEelement);
				
				List<WebElement> list = sel.getOptions();
				for (WebElement ele : list) {
					if (ele.getText().equals(sw)) {
						ele.click();
						//////Thread.sleep(5000);
						break;
					}
				}
				return true;} 
			catch (Exception ex) {
			}
			return false;

		}
	 public boolean EnterExcepNotes(String sw1)
		{
		try{

			WebElement selectWebEelement=new WebDriverWait(driver,5)
			.until(ExpectedConditions.visibilityOfElementLocated(SelectExcepNotes_xpath));
			selectWebEelement.click();
			selectWebEelement.sendKeys(sw1);
			//////Thread.sleep(2000);
			return true;

		}
		catch(Exception ex){
			return false;
		}

		}
	 public boolean Click_on_ExcepSign(String sw2) {
			try {
				WebElement accTypeDropdownWebEelement = new WebDriverWait(driver, 5)
				.until(ExpectedConditions.visibilityOfElementLocated(SelectExceSign_xpath));
				Select sel = new Select(accTypeDropdownWebEelement);
				List<WebElement> list = sel.getOptions();
				for (WebElement ele : list) {
					if (ele.getText().equals(sw2)) {
						ele.click();
						//////Thread.sleep(5000);
						break;
					}
				}
				return true;} 
			catch (Exception ex) {
			}
			return false;

		}
	 
	 public boolean Click_on_Valuetype(String sw3) {
			try {
				WebElement accTypeDropdownWebEelement = new WebDriverWait(driver, 5).until(ExpectedConditions.visibilityOfElementLocated(SelectValueType_xpath));
				Select sel = new Select(accTypeDropdownWebEelement);
				List<WebElement> list = sel.getOptions();
				for (WebElement ele : list) {
					if (ele.getText().equals(sw3)) {
						ele.click();
						//////Thread.sleep(5000);
						break;
					}
				}
				return true;} 
			catch (Exception ex) {
			}
			return false;

		}
	 public boolean Click_on_Excepdesc2(String sw5) {
			try {
				WebElement accTypeDropdownWebEelement = new WebDriverWait(driver,10)
				.until(ExpectedConditions.visibilityOfElementLocated(ExcepDesc_xpath));
				Select sel = new Select(accTypeDropdownWebEelement);
				List<WebElement> list = sel.getOptions();
				for (WebElement ele : list) {
					if (ele.getText().equals(sw5)) {
						ele.click();
						//////Thread.sleep(5000);
						break;
					}
				}
				return true;} 
			catch (Exception ex) {
			}
			return false;

		}
	 public boolean EnterExcepValue(String sw4)
		{
		try{

			WebElement selectWebEelement=new WebDriverWait(driver,5)
			.until(ExpectedConditions.visibilityOfElementLocated(EnterExcepValue_xpath));
			selectWebEelement.click();
			selectWebEelement.sendKeys(sw4);
			//////Thread.sleep(2000);
			return true;

		}
		catch(Exception ex){
			return false;
		}

		}
	 public boolean  Click_on_Save()
		{
		try{
			WebElement HeaderWebEelement=new WebDriverWait(driver,5)
				.until(ExpectedConditions.visibilityOfElementLocated(Save_xpath));
			HeaderWebEelement.click();
			//////Thread.sleep(5000);
			return true;
		}
		catch(Exception ex){
			return false;

		}


		}
	 public boolean  System_Click(){
			try {
				String[] exp = {"All","Yes","No"};
				
				WebElement dropdown = driver.findElement(System_xpath);
				
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
	 
	 public boolean EnterExcepNotes1(String note)
	 {
	 try{

	 	WebElement selectWebEelement=new WebDriverWait(driver,5)
	 	.until(ExpectedConditions.visibilityOfElementLocated(ExcepNotes_xpath));
	 	selectWebEelement.click();
	 	selectWebEelement.sendKeys(note);
	 	//////Thread.sleep(2000);
	 	return true;

	 }
	 catch(Exception ex){
	 	return false;
	 }

	 }
	 
	 public boolean DoubleClickOnExceptionNotes()
		{
			try{
			
			WebElement element=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(ExcepText_xpath));
			//Double click
			Actions action = new Actions(driver);
			action.doubleClick(element).build().perform();
			Thread.sleep(1000);
			return true;
			}
			catch(Exception ex){
				return false;
			}
			
		}
	 //kurthivas
	 public boolean cross()
	 {
	 try{
         Thread.sleep(500);
	 	WebElement CrosspupWebEelement=new WebDriverWait(driver,10)
	 	.until(ExpectedConditions.visibilityOfElementLocated(Creoss_xpath));
	 	CrosspupWebEelement.click();
	
	 	return true;
	 }
	 catch(Exception ex){
	 	return false;
	 }
	 } 
	 public boolean Close()
	 {
	 try{

	 	WebElement ClosepupElement=new WebDriverWait(driver,5)
	 	.until(ExpectedConditions.visibilityOfElementLocated(Close_xpath));
	 	ClosepupElement.click();
	
	 	return true;
	 }
	 catch(Exception ex){
	 	return false;
	 }
}
}
		
	

