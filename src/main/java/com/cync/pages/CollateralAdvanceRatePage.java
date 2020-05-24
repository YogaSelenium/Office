package com.cync.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.SkipException;

import com.cync.base.BasePage;

public class CollateralAdvanceRatePage extends BasePage  {
	
	
	private final By CollateralAdvanceRateHeader_xpath = By.xpath("//span[@class='paneltitle']");
	private final By ReceivablesDoubleClick_xpath = By.xpath("(//div[@class='ui-jqgrid ui-widget ui-widget-content ui-corner-all']//div//table/tbody/tr[2]/td[4])[2]");
	private final By advanceRateTextBox_xpath = By.xpath("(//input[@class='editable inline-edit-cell ui-widget-content ui-corner-all'])[5]");
    private final By SaveBtnClick_xpath = By.xpath("(//span[@class='ui-icon ui-icon ui-icon-disk'])[2]");
	private final By SuccessMsg_xpath = By.xpath("//div[text()='Collateral Advance Rate was successfully updated.']");
	private final By closePopup_xpath = By.id("closedialog");
	private final By DoubleClickVerifyInventory_xpath = By.xpath("(//div[@class='ui-jqgrid ui-widget ui-widget-content ui-corner-all']//div//table/tbody/tr[4]/td[4])[1]");
	private final By DoubleClickVerifyOtherCollateral_xpath = By.xpath("(//div[@class='ui-jqgrid ui-widget ui-widget-content ui-corner-all']//div//table/tbody/tr[5]/td[4])[1]");
	private final By DoubleClickVerifyPaybles_xpath = By.xpath("(//div[@class='ui-jqgrid ui-widget ui-widget-content ui-corner-all']//div//table/tbody/tr[3]/td[4])[1]");
	private final By AddButtonInDivisionGrid_xpath=By.xpath("//td[@id='add_division_code_list']");
	private final By DivisionNameTextBox_xpath=By.xpath("(//input[@class='editable inline-edit-cell ui-widget-content ui-corner-all'])[1]");
	private final By DivisionDiscriptionTextBox_xpath=By.xpath("(//input[@class='editable inline-edit-cell ui-widget-content ui-corner-all'])[2]");
	private final By DivisionGridSaveButton_xpath=By.xpath("//td[@id='division_code_pager_left']//span[@class='ui-icon ui-icon ui-icon-disk']");
	private final By SuccessMessageOfDivisionCreation_xpath=By.xpath("//div[@class='ui-state-success']");
	private final By ChechBoxOfDIV1_xpath=By.xpath("(//input[@class='cbox '])[1]");
	private final By AddButtonInGrid_xpath=By.xpath("//td[@id='add_collateral_advance_rates_list']//div[@class='ui-pg-div']");
	private final By SecondReceivablestextBox_xpath=By.xpath("//input[@id='jqg1_name']");
	private final By AddSecondAdvanceRateForReceivables_xpath=By.xpath("//input[@name='advance_rate']");
	private final By AddSecondCollateralTypeCollateral_xpath=By.xpath("(//select[@class='editable inline-edit-cell ui-widget-content ui-corner-all'])[1]");
	private final By AddSecondCollateralNameTextBox_xpath=By.xpath("(//input[@class='editable inline-edit-cell ui-widget-content ui-corner-all'])[1]");
	private final By AddAvanceRateForCollateral_xpath=By.xpath("(//input[@class='editable inline-edit-cell ui-widget-content ui-corner-all'])[5]");
	private final By PayablesCollateralType_xpath=By.xpath("(//td[contains(text(),'Payables')])[1]");
	private final By SelectDIV2_xpath=By.xpath("(//td[@role='gridcell'])[11]");
	

	//anusha
	private final By CollateralName_xpath=By.xpath("//td[contains(text(),'Receivables0')]");

	public CollateralAdvanceRatePage(WebDriver driver) {
		super(driver);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	
	  public String HeaderVerify(String Header)
		{
		 
		try{
			WebElement HeaderWebEelement=new WebDriverWait(driver,10)
				.until(ExpectedConditions.visibilityOfElementLocated(CollateralAdvanceRateHeader_xpath));
			HeaderWebEelement.getText();
			
		}
		catch(Exception ex){
			
		}
		return Header;
		
		}  
	
	
	public boolean DoubleClickVerify()
	{
		try{
		
		WebElement element=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(ReceivablesDoubleClick_xpath));
		//Double click
		Actions action = new Actions(driver);
		action.doubleClick(element).build().perform();
		//Thread.sleep(2000);
		
		return true;
	}
	

	catch(Exception ex){
		return false;
	}
}

	public String addValueToAdvanceRate(String Advancerate)
	{
	try{
		WebElement advanceRateTextBoxWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(advanceRateTextBox_xpath));
		advanceRateTextBoxWebEelement.clear();
		advanceRateTextBoxWebEelement.sendKeys(Advancerate);
		//Thread.sleep(2000);
	
	}
	catch(Exception ex){

	}
	return Advancerate;

	}

	
	public boolean SaveBtnVerify()
	{
		try{
		
		WebElement saveWebelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(SaveBtnClick_xpath));
		saveWebelement.click();
		//Thread.sleep(5000);
		
		return true;
	}
	

	catch(Exception ex){
		return false;
	}
		
	}
	
		

	  public String SuccessMsgVerify(String SuccessMsg)
		{
		 
		try{
			WebElement SuccessMsgWebEelement=new WebDriverWait(driver,10)
				.until(ExpectedConditions.visibilityOfElementLocated(SuccessMsg_xpath));
			SuccessMsgWebEelement.getText();
			//Thread.sleep(2000);
			
		}
		catch(Exception ex){
			
		}
		return SuccessMsg;
		
		}  
		
	  public boolean ClosePopUpVerify()
		{
			try{
			
			WebElement closeWebelement=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(closePopup_xpath));
			closeWebelement.click();
			
			
			return true;
		}
		

		catch(Exception ex){
			return false;
		}
			
		}
	  
	  public boolean DoubleClickVerifyReceivable()
		{
			try{
			
			WebElement element=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(ReceivablesDoubleClick_xpath));
			//Double click
			 Thread.sleep(1000);
			Actions action = new Actions(driver);
			action.doubleClick(element).build().perform();
		   Thread.sleep(1000);
			
			return true;
		}
		

		catch(Exception ex){
			return false;
		}
	}
	  
	  public boolean DoubleClickVerifyInventory()
		{
			try{
			
			WebElement element=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(DoubleClickVerifyInventory_xpath));
			//Double click
			Thread.sleep(1000);
			Actions action = new Actions(driver);
			action.doubleClick(element).build().perform();
			Thread.sleep(1000);
			
			return true;
		}
		

		catch(Exception ex){
			return false;
		}
	}
	  
	  public boolean DoubleClickVerifyOtherCollateral()
		{
			try{
			
			WebElement element=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(DoubleClickVerifyOtherCollateral_xpath));
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
	  
	  public boolean DoubleClickVerifyPaybles()
			{
				try{
				
				WebElement element=new WebDriverWait(driver,10)
				.until(ExpectedConditions.visibilityOfElementLocated(DoubleClickVerifyPaybles_xpath));
				//Double click
				Thread.sleep(1000);
				Actions action = new Actions(driver);
				action.doubleClick(element).build().perform();
				Thread.sleep(1000);
				
				return true;
			}
			

			catch(Exception ex){
				return false;
			}
		}	


	  
	  public boolean ClickOnAddButtonInDivisionGrid()
		{
			try{
			
			WebElement element=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(AddButtonInDivisionGrid_xpath));
			element.click();
			Thread.sleep(1000);			
			return true;
		}		
		catch(Exception ex){
			return false;
		}
	}	
	  
	  public boolean EnterDivisionName(String DivisionName)
		{
		 
		try{
			WebElement HeaderWebEelement=new WebDriverWait(driver,10)
				.until(ExpectedConditions.visibilityOfElementLocated(DivisionNameTextBox_xpath));
			HeaderWebEelement.sendKeys(DivisionName);	
			//Thread.sleep(2000);
			return true;
		}
		catch(Exception ex){			
		}
		return false;				
		}  
	  
	  public boolean EnterDivisionDiscription(String DivisionDiscription)
		{
		 
		try{
			WebElement HeaderWebEelement=new WebDriverWait(driver,10)
				.until(ExpectedConditions.visibilityOfElementLocated(DivisionDiscriptionTextBox_xpath));
			HeaderWebEelement.sendKeys(DivisionDiscription);	
			//Thread.sleep(2000);
			return true;
		}
		catch(Exception ex){
			
		}
		return false;				
		} 
	  

	  public boolean ClickOnsaveButtonInDivisionGrid()
		{
			try{
			
			WebElement element=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(DivisionGridSaveButton_xpath));
			element.click();
			//Thread.sleep(2000);			
			return true;
		}		
		catch(Exception ex){
			return false;
		}
	}	
	  public boolean SelectDIV1CheckBox()
		{
			try{
			
			WebElement element=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(ChechBoxOfDIV1_xpath));
			element.click();
			//Thread.sleep(2000);			
			return true;
		}		
		catch(Exception ex){
			return false;
		}
	}	
	  public String VerifyTheSucessMessageOfDivisionCreation(String Message)
		{
		 
		try{
			WebElement HeaderWebEelement=new WebDriverWait(driver,10)
				.until(ExpectedConditions.visibilityOfElementLocated(SuccessMessageOfDivisionCreation_xpath));
			String actualMsgFromAPP= HeaderWebEelement.getText();
		      if(actualMsgFromAPP.equalsIgnoreCase(Message));
		      {
		       return actualMsgFromAPP;
		      }		       	
		}
	  catch(Exception ex){
		}
		return Message; 
		}
	  
	  

	  public boolean ClickOnAddButtonInGrid()
		{
			try{
			
			WebElement element=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(AddButtonInGrid_xpath));
			element.click();
			//Thread.sleep(2000);			
			return true;
		}		
		catch(Exception ex){
			return false;
		}
	}	
	  public boolean selectReceivables(String receivables)
		{
			try{
			
			WebElement element=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(SecondReceivablestextBox_xpath));
			element.click();
			element.sendKeys(receivables);
			//Thread.sleep(2000);			
			return true;
		}		
		catch(Exception ex){
			return false;
		}
	}
	  public String addValueToSecondAdvanceRate_receivables(String Advancerate)
		{
		try{
			WebElement Eelement=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(AddSecondAdvanceRateForReceivables_xpath));
			Eelement.clear();
			Eelement.sendKeys(Advancerate);
			//Thread.sleep(2000);
		
		}
		catch(Exception ex){		
		}
		return Advancerate;
		}
	
	  public boolean addSecondCollateralType_inventory(String inventory)
		{
		try{
			WebElement Eelement=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(AddSecondCollateralTypeCollateral_xpath));
			Eelement.click();
			Select sel = new Select(Eelement);
			sel.selectByVisibleText(inventory);
			/*List<WebElement> list = sel.getOptions();
			for (WebElement ele : list) {
				if (ele.getText().equals(inventory)) {
					ele.click();
					//Thread.sleep(10000);
					 return true;
				}
			}*/
		return true;	
		}
		catch(Exception ex){			
		}
		return false;

		}
	  public boolean selectInventory(String InventoryName)
		{
			try{
			
			WebElement element=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(AddSecondCollateralNameTextBox_xpath));
			element.click();
			element.sendKeys(InventoryName);
			//Thread.sleep(2000);			
			return true;
		}		
		catch(Exception ex){
			return false;
		}
	}

    public String addValueToSecondAdvanceRate_Inventory(String Advancerate)
    {

try{
	WebElement Eelement=new WebDriverWait(driver,10)
	.until(ExpectedConditions.visibilityOfElementLocated(AddAvanceRateForCollateral_xpath));
	Eelement.clear();
	Eelement.sendKeys(Advancerate);
	//Thread.sleep(2000);

}
catch(Exception ex){		

}
return Advancerate;
}





public boolean AddOtherCollateralInTextBox(String OtherCollateral)
{
	try{
	
	WebElement element=new WebDriverWait(driver,10)
	.until(ExpectedConditions.visibilityOfElementLocated(AddSecondCollateralNameTextBox_xpath));
	element.click();
	element.sendKeys(OtherCollateral);
	//Thread.sleep(2000);			
	return true;
}		
catch(Exception ex){
	return false;
}
}

public boolean AddOtherCollateralInAvanceRate(String AdvanceRate)
{
	try{
	
	WebElement element=new WebDriverWait(driver,10)
	.until(ExpectedConditions.visibilityOfElementLocated(AddAvanceRateForCollateral_xpath));	
	element.click();
	element.clear();
	element.sendKeys(AdvanceRate);
	//Thread.sleep(2000);			
	return true;
}		
catch(Exception ex){
	return false;
}
}

        public boolean addSecondCollateralType_OtherCollateral(String otherCollateral)
            {
            try{

	           WebElement Eelement=new WebDriverWait(driver,10)
	           .until(ExpectedConditions.visibilityOfElementLocated(AddSecondCollateralTypeCollateral_xpath));
	           Eelement.click();
	           Select sel = new Select(Eelement);
	           sel.selectByVisibleText(otherCollateral);
	           /*List<WebElement> list = sel.getOptions();
	           for (WebElement ele : list) {
	        	   if (ele.getText().equals(otherCollateral)) {
	        		   ele.click();
	        		   //Thread.sleep(10000);
	        		   return true;
	        	   }
	           }*/
	        return true;   
            }


          catch(Exception ex){			
          }
          return false;
          }
      
       
    
        public boolean DoubleClickOnPaybles()

		{
			try{
			
			WebElement element=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(PayablesCollateralType_xpath));
			//Double click
			Actions action = new Actions(driver);
			action.doubleClick(element).build().perform();
			//Thread.sleep(2000);
			
			return true;
		}
		

		catch(Exception ex){
			return false;
		}
		}
	 

        public boolean addSecondCollateralType_payables(String Payables)
        {
        try{
           WebElement Eelement=new WebDriverWait(driver,10)
           .until(ExpectedConditions.visibilityOfElementLocated(AddSecondCollateralTypeCollateral_xpath));
           Eelement.click();
           Select sel = new Select(Eelement);
           sel.selectByVisibleText(Payables);
           /*List<WebElement> list = sel.getOptions();
           for (WebElement ele : list) {
        	   if (ele.getText().equals(Payables)) {
        		   ele.click();
        		   //Thread.sleep(10000);
        		   return true;
        	   }
           }*/
        return true;   
        }
        catch(Exception ex){			
        }
        return false;
        }
        public boolean AddPayableInTextBox(String payables1)
        {
        	try{
        	
        	WebElement element=new WebDriverWait(driver,10)
        	.until(ExpectedConditions.visibilityOfElementLocated(AddSecondCollateralNameTextBox_xpath));
        	element.click();
        	element.sendKeys(payables1);
        	//Thread.sleep(2000);			
        	return true;
        }		
        catch(Exception ex){
        	return false;
        }
        }
        public boolean SelectDIV2CheckBox()
		{
			try{
			
			WebElement element=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(SelectDIV2_xpath));
			element.click();
		Thread.sleep(1000);			
			return true;
		}		
		catch(Exception ex){
			return false;
		}
	}	
        
        public boolean VerifyCollateralName(String CollateralName)
		{
		 
		try{
			WebElement HeaderWebEelement=new WebDriverWait(driver,10)
				.until(ExpectedConditions.visibilityOfElementLocated(CollateralName_xpath));
			String actualMsgFromAPP= HeaderWebEelement.getText();
		      if(actualMsgFromAPP.equalsIgnoreCase(CollateralName));
		      {
		       return true;
		      }		       	
		}
	  catch(Exception ex){
		}
		return false; 
		}
}
