package ClientMaintenancePages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.cync.base.BasePage;

public class IneligibilityReasonsPage extends BasePage  {

	
	private final By IneligibilityReasonsPageHeader_xpath=By.xpath("//h3[text()='Ineligibility Reasons ']");
	private final By AddNewBtn_xpath=By.xpath("//i[@id='New']");
	private final By EditBtn_xpath=By.xpath("//i[@id='Edit']");
	private final By DeleteBtn_xpath=By.xpath("//i[@id='Delete']");
	private final By ExportBtn_xpath=By.xpath("//i[@id='Export']");
	private final By SortingIcon_xpath=By.xpath("(//span[@class='ui-sortable-column-icon fa fa-fw fa-sort ng-star-inserted'])[1]");

	private final By PrimarySearch_xpath=By.xpath("//input[@placeholder='Search Here']");

	private final By IneligibilityReasonSearch_xpath=By.xpath("(//input[@placeholder='Search'])[1]");
	private final By DescriptionSearch_xpath=By.xpath("(//input[@placeholder='Search'])[2]");
	private final By PrimaryCheck_xpath=By.xpath("(//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default'])[1]");

	private final By TotalRecordCount_xpath=By.xpath("//p[@class='recordcount ng-star-inserted']//b");
	private final By FirstCheckboxSelect_xpath=By.xpath("(//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default'])[2]");

	private final By EditBtnEnable_xpath=By.xpath("//i[contains(@class,'ng-star-inserted hand fa fa-pencil fa-1x clr_grey f_s')]");

	private final By DeleteBtnEnable_xpath=By.xpath("//i[contains(@class,'ng-star-inserted hand fa fa-trash ')]");
	private final By IneligibilityReasonCodeTextField_xpath=By.xpath("//input[@id='irCode']");
	private final By DescriptionTextField_xpath=By.xpath("//input[@id='irDescription']");
	private final By NegativeEligibleBalance_xpath=By.xpath("(//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default'])[1]");
	private final By NegativeDebtorBalance_xpath=By.xpath("(//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default'])[2]");

	private final By SaveBtn_xpath=By.xpath("//span[text()=' Save ']");

	private final By IneligibilityReasonsMsg_xpath=By.xpath("//div[@id='every-api-message']");

	private final By VerifyString_xpath=By.xpath("//tr[@class='ui-datatable-even ui-widget-content ng-star-inserted']");
	private final By DescriptionTextVerify_xpath=By.xpath("(//span[@class='ui-cell-data ng-star-inserted'])[2]");
	private final By NoRecordFound_xpath=By.xpath("//span[text()='No records found']");
	
	private final By IneligibilityReasonsCodeTextVerify_xpath=By.xpath("(//span[@class='ui-cell-data ng-star-inserted'])[1]");
	private final By IneligibilityReasonsAddHeader_xpath=By.xpath("//h3[text()='Ineligibility Reasons - Add']");

	private final By IRCMandatoryTextVerify_xpath=By.xpath("//small[text()='Enter Ineligibility Reason Code']");
	private final By DescriptionMandatoryTextVerify_xpath=By.xpath("//small[text()='Enter Description']");

	private final By CancelButton_xpath=By.xpath("//button[@id='action_back']");
	private final By SaveAndNewButton_xpath=By.xpath("//button[@id='action_save_new']");
	private final By DeleteBtnPopUpYes_xpath=By.xpath("(//button[@aria-label='Close dialog'])[1]");

	//Author garima
	
	private final By Checkbox_xpath=By.xpath("//tbody[@class='ui-datatable-data ui-widget-content ui-datatable-hoverable-rows']//tr[1]//td[1]//p-dtcheckbox[1]//div[1]//div[2]");
	private final By Edit_xpath=By.xpath("//i[@title='Edit']");
	private final By Delete_xpath=By.xpath("//i[@title='Delete']");
	private final By secondCheckbox_xpath=By.xpath("//p-dtcheckbox[@class='ng-star-inserted']//span[@class='ui-chkbox-icon ui-clickable fa fa-check']");
	private final By Search_xpath=By.xpath("(//input[@placeholder='Search'])[1]");
	private final By verifyNoresultfound=By.xpath("//span[contains(text(),'No records found')]");
	private final By descriptionfiled_xpath=By.xpath("(//input[@type='text'])[7]");
	private final By ineligblity_xpath=By.xpath("//input[@id='irCode']");
	private final By Descriptions_xpath=By.xpath("//input[@id='irDescription']")	;	
	private final By firestcheckbox_xpath=By.xpath("(//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default'])[1]");
	private final By Seconcheckbox_xpath=By.xpath("(//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default'])[2]");
	private final By Header_xpath=By.xpath("//h3[@class='no-m-bt']");
	private final By popupexport_xpath=By.xpath("//span[contains(text(),'Export')]");
	
	//Author kruthivas
	
	private final By DeleteBtn_enable_xpath=By.id("Delete");
	//private final By AddNewBtn_click_xpath=By.xpath("//i[@class='hand fa fa-plus fa-1x f_s_20 clr_grey ng-star-inserted']");
	private final By NegativeDebtorBalance_Check_xpath=By.xpath("//div[4]//p-checkbox[1]//div[1]//div[2]");
	
	
	
	
	
	
	
	
	
	
	
	public IneligibilityReasonsPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	 public String verifyPageHeader(String PageHeader)
	    {
	    try{
	       WebElement PageHeaderWebEelement=new WebDriverWait(driver,10)
	       .until(ExpectedConditions.visibilityOfElementLocated(IneligibilityReasonsPageHeader_xpath));
	       
	      String actualMsg= PageHeaderWebEelement.getText();
	      if(actualMsg.equalsIgnoreCase(PageHeader))
	      {
	       return actualMsg;
	      }
	       
	    }
	    catch(Exception ex){
	     
	    }
	 return PageHeader;
	    }
	 
	
	 
	 public boolean AddNewBtn()
		{
		try{

			WebElement AddNewBtnWebEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(AddNewBtn_xpath));
			AddNewBtnWebEelement.isDisplayed();

	return true;
		}
		catch(Exception ex){
			return false;
		}

		}
	 
	 public boolean EditBtn()
		{
		try{

			WebElement EditBtnWebEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(EditBtn_xpath));
			EditBtnWebEelement.isDisplayed();

	return true;
		}
		catch(Exception ex){
			return false;
		}

		}
	
	 public boolean DeleteBtn()
		{
		try{

			WebElement DeleteBtnWebEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(DeleteBtn_xpath));
			DeleteBtnWebEelement.isDisplayed();

	return true;
		}
		catch(Exception ex){
			return false;
		}

		}
	
	 public boolean ExportBtn()
		{
		try{

			WebElement ExportBtnWebEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(ExportBtn_xpath));
			ExportBtnWebEelement.isDisplayed();

	return true;
		}
		catch(Exception ex){
			return false;
		}

		}

	 
	 public boolean SortingIcon()
		{
		try{

			WebElement SortingIconWebEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(SortingIcon_xpath));
			SortingIconWebEelement.isDisplayed();

	return true;
		}
		catch(Exception ex){
			return false;
		}

		}
 
	 public boolean PrimarySearch()
		{
		try{

			WebElement PrimarySearchWebEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(PrimarySearch_xpath));
			PrimarySearchWebEelement.isDisplayed();

	return true;
		}
		catch(Exception ex){
			return false;
		}

		}
 
	 public boolean IneligibilityReason_Search()
		{
		try{

			WebElement PrimarySearchWebEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(IneligibilityReasonSearch_xpath));
			PrimarySearchWebEelement.isDisplayed();

	return true;
		}
		catch(Exception ex){
			return false;
		}

		}
	
	 public boolean Description_Search()
		{
		try{

			WebElement PrimarySearchWebEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(DescriptionSearch_xpath));
			PrimarySearchWebEelement.isDisplayed();

	return true;
		}
		catch(Exception ex){
			return false;
		}

		}
	 
	 public boolean Primary_CheckBox()
		{
		try{

			WebElement PrimaryCheckWebEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(PrimaryCheck_xpath));
			PrimaryCheckWebEelement.isDisplayed();

	return true;
		}
		catch(Exception ex){
			return false;
		}

		}
	 
	 
	 public boolean TotalRecord_Count()
		{
		try{

			WebElement TotalRecordCountWebEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(TotalRecordCount_xpath));
			TotalRecordCountWebEelement.isDisplayed();

	return true;
		}
		catch(Exception ex){
			return false;
		}

		}
	 
	 public boolean SelectingFirst_CheckBox()
		{
		try{

			WebElement PrimaryCheckWebEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(FirstCheckboxSelect_xpath));
			PrimaryCheckWebEelement.click();
			Thread.sleep(2000);

	return true;
		}
		catch(Exception ex){
			return false;
		}

		}
	 
	 
	 public boolean EditBtn_enable()
		{
		try{

			WebElement EditBtnWebEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(EditBtnEnable_xpath));
			EditBtnWebEelement.isDisplayed();

	return true;
		}
		catch(Exception ex){
			return false;
		}

		}
	 
	 
	 public boolean DeleteBtn_enable()
		{
		try{

			WebElement DeleteBtnWebEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(DeleteBtn_enable_xpath));
			Thread.sleep(100);
			DeleteBtnWebEelement.isDisplayed();
	return true;
		}
		catch(Exception ex){
			return false;
		}

		}
	 
	 public boolean AddNewBtn_click()
		{
		try{
         
			WebElement AddNewBtnWebEelement=new WebDriverWait(driver,50)
			.until(ExpectedConditions.visibilityOfElementLocated(AddNewBtn_xpath));
			Thread.sleep(1000);
			AddNewBtnWebEelement.click();

	return true;
		}
		catch(Exception ex){
			return false;
		}

		}
	 
	 
	 public boolean IneligibilityReasonsAdd_Header()
		{
		try{

			WebElement HeaderWebEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(IneligibilityReasonsAddHeader_xpath));
			HeaderWebEelement.isDisplayed();

	return true;
		}
		catch(Exception ex){
			return false;
		}

		}
	 
	 
	 public boolean IneligibilityReasonCodeInput(String EnterData)
		{
		try{

			WebElement IneligibilityReasonCodeWebEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(IneligibilityReasonCodeTextField_xpath));
			IneligibilityReasonCodeWebEelement.clear();
			IneligibilityReasonCodeWebEelement.sendKeys(EnterData);
			Thread.sleep(2000);
			
	return true;
		}
		catch(Exception ex){
			return false;
		}
		}
	 
	 public boolean IneligibilityReasonCode_click()
		{
		try{

			WebElement IneligibilityReasonCodeWebEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(IneligibilityReasonCodeTextField_xpath));
			IneligibilityReasonCodeWebEelement.click();
			Thread.sleep(2000);
			
	return true;
		}
		catch(Exception ex){
			return false;
		}
		}
	 
	 
	 public String MandatoryTextVerify_IRC(String VerifyMandatoryText)
	    {
	    try{
	       WebElement SaveWebEelement=new WebDriverWait(driver,10)
	       .until(ExpectedConditions.visibilityOfElementLocated(IRCMandatoryTextVerify_xpath));
	       
	      String actualMsg= SaveWebEelement.getText();
	      if(actualMsg.equalsIgnoreCase(VerifyMandatoryText))
	      {
	       return actualMsg;
	      }
	       
	    }
	    catch(Exception ex){
	     
	    }
	 return VerifyMandatoryText;
	    }
		
	 
	 public boolean DescriptionTextInput(String EnterDescription)
		{
		try{

			WebElement DescriptionWebEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(DescriptionTextField_xpath));
			DescriptionWebEelement.clear();
			DescriptionWebEelement.sendKeys(EnterDescription);
			Thread.sleep(2000);
			
	return true;
		}
		catch(Exception ex){
			return false;
		}
		}
	 
	 public boolean DescriptionTextInput_click()
		{
		try{

			WebElement DescriptionWebEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(DescriptionTextField_xpath));
			DescriptionWebEelement.click();
			Thread.sleep(2000);
			
	return true;
		}
		catch(Exception ex){
			return false;
		}
		}
	 
	 public String MandatoryTextVerify_Description(String VerifyMandatoryTextDescription)
	    {
	    try{
	       WebElement SaveWebEelement=new WebDriverWait(driver,10)
	       .until(ExpectedConditions.visibilityOfElementLocated(DescriptionMandatoryTextVerify_xpath));
	       
	      String actualMsg= SaveWebEelement.getText();
	      if(actualMsg.equalsIgnoreCase(VerifyMandatoryTextDescription))
	      {
	       return actualMsg;
	      }
	       
	    }
	    catch(Exception ex){
	     
	    }
	 return VerifyMandatoryTextDescription;
	    }
	 
	 
	 
	 public boolean NegativeEligibleBalance_Check()
		{
		try{

			WebElement NegativeEligibleBalanceWebEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(NegativeEligibleBalance_xpath));
			NegativeEligibleBalanceWebEelement.click();

	return true;
		}
		catch(Exception ex){
			return false;
		}

		}
	 
	 public boolean NegativeDebtorBalance_Check()
		{
		try{

			WebElement NegativeDebtorBalanceWebEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(NegativeDebtorBalance_Check_xpath));
			NegativeDebtorBalanceWebEelement.click();

	return true;
		}
		catch(Exception ex){
			return false;
		}

		}
	 
	 public boolean SaveBtn_Check()
		{
		try{
               
			WebElement SaveBtnWebEelement=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(SaveBtn_xpath));
			Thread.sleep(500);
			SaveBtnWebEelement.click();

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
	       .until(ExpectedConditions.visibilityOfElementLocated(IneligibilityReasonsMsg_xpath));
	       
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
		
		
		 public boolean PrimarySearch_EnterTest(String EnterPrimaryText)
			{
			try{

				WebElement PrimarySearchWebEelement=new WebDriverWait(driver,100)
				.until(ExpectedConditions.visibilityOfElementLocated(PrimarySearch_xpath));
				PrimarySearchWebEelement.sendKeys(EnterPrimaryText);
				Thread.sleep(3000);

		return true;
			}
			catch(Exception ex){
				return false;
			}

			}
		 
		 public boolean VerifyString_Present()
			{
			try{

				WebElement VerifyStringWebEelement=new WebDriverWait(driver,100)
				.until(ExpectedConditions.visibilityOfElementLocated(VerifyString_xpath));
				VerifyStringWebEelement.isDisplayed();
				Thread.sleep(3000);

		return true;
			}
			catch(Exception ex){
				return false;
			}

			}
		 

			public String verifyText_description(String VerifyText)
		    {
		    try{
		       WebElement SaveWebEelement=new WebDriverWait(driver,10)
		       .until(ExpectedConditions.visibilityOfElementLocated(DescriptionTextVerify_xpath));
		       
		      String actualMsg= SaveWebEelement.getText();
		      if(actualMsg.equalsIgnoreCase(VerifyText))
		      {
		       return actualMsg;
		      }
		       
		    }
		    catch(Exception ex){
		     
		    }
		 return VerifyText;
		    }
			
	 
			public String verifyText_ForNoRecord(String NoRecord)
		    {
		    try{
		       WebElement SaveWebEelement=new WebDriverWait(driver,10)
		       .until(ExpectedConditions.visibilityOfElementLocated(NoRecordFound_xpath));
		       
		      String actualMsg= SaveWebEelement.getText();
		      if(actualMsg.equalsIgnoreCase(NoRecord))
		      {
		       return actualMsg;
		      }
		       
		    }
		    catch(Exception ex){
		     
		    }
		 return NoRecord;
		    }
				
			public boolean IneligibilityReasonsCodeSearch(String ReasonsCodeSearch)
			{
			try{

				WebElement PrimarySearchWebEelement=new WebDriverWait(driver,100)
				.until(ExpectedConditions.visibilityOfElementLocated(IneligibilityReasonSearch_xpath));
				PrimarySearchWebEelement.sendKeys(ReasonsCodeSearch);
				Thread.sleep(1000);

		return true;
			}
			catch(Exception ex){
				return false;
			}

			}
		 
			public String verifyText_IneligibilityReasonsCode(String VerifyText)
		    {
		    try{
		       WebElement SaveWebEelement=new WebDriverWait(driver,10)
		       .until(ExpectedConditions.visibilityOfElementLocated(IneligibilityReasonsCodeTextVerify_xpath));
		       
		      String actualMsg= SaveWebEelement.getText();
		      if(actualMsg.equalsIgnoreCase(VerifyText))
		      {
		       return actualMsg;
		      }
		       
		    }
		    catch(Exception ex){
		     
		    }
		 return VerifyText;
		    }
			
			
			public boolean DescriptionSearch(String DescriptionSearch)
			{
			try{

				WebElement PrimarySearchWebEelement=new WebDriverWait(driver,100)
				.until(ExpectedConditions.visibilityOfElementLocated(DescriptionSearch_xpath));
				PrimarySearchWebEelement.sendKeys(DescriptionSearch);
				Thread.sleep(1000);

		return true;
			}
			catch(Exception ex){
				return false;
			}

			}
			
			 public boolean Cancel_Button()
				{
				try{

					WebElement CancelWebEelement=new WebDriverWait(driver,100)
					.until(ExpectedConditions.visibilityOfElementLocated(CancelButton_xpath));
					CancelWebEelement.isDisplayed();
					
			return true;
				}
				catch(Exception ex){
					return false;
				}
				}	
			
			 
			 public boolean SaveAndNew_Button()
				{
				try{

					WebElement SaveAndNewWebEelement=new WebDriverWait(driver,100)
					.until(ExpectedConditions.visibilityOfElementLocated(SaveAndNewButton_xpath));
					SaveAndNewWebEelement.isDisplayed();
					
			return true;
				}
				catch(Exception ex){
					return false;
				}
				}	
			 
			 public boolean Save_Button()
				{
				try{

					WebElement SaveBtnWebEelement=new WebDriverWait(driver,100)
					.until(ExpectedConditions.visibilityOfElementLocated(SaveBtn_xpath));
					SaveBtnWebEelement.isDisplayed();

			return true;
				}
				catch(Exception ex){
					return false;
				}

				}
			 
			 
			 public boolean SaveAndNew_Click()
				{
				try{

					WebElement SaveAndNewWebEelement=new WebDriverWait(driver,100)
					.until(ExpectedConditions.visibilityOfElementLocated(SaveAndNewButton_xpath));
					SaveAndNewWebEelement.click();
					Thread.sleep(1000);
					
			return true;
				}
				catch(Exception ex){
					return false;
				}
				}	
	 
			 
			 public boolean CancelButton_click()
				{
				try{

					WebElement CancelWebEelement=new WebDriverWait(driver,100)
					.until(ExpectedConditions.visibilityOfElementLocated(CancelButton_xpath));
					CancelWebEelement.click();
					Thread.sleep(3000);
					
			return true;
				}
				catch(Exception ex){
					return false;
				}
				}	
			 
			 
			 public boolean EditBtn_Click()
				{
				try{

					WebElement EditBtnWebEelement=new WebDriverWait(driver,100)
					.until(ExpectedConditions.visibilityOfElementLocated(EditBtnEnable_xpath));
					EditBtnWebEelement.click();
					Thread.sleep(5000);
					

			return true;
				}
				catch(Exception ex){
					return false;
				}

				}
			 
			 
			 public boolean DeleteBtn_click()
				{
				try{

					WebElement DeleteBtnWebEelement=new WebDriverWait(driver,100)
					.until(ExpectedConditions.visibilityOfElementLocated(DeleteBtn_xpath));
					DeleteBtnWebEelement.click();
					Thread.sleep(5000);

			return true;
				}
				catch(Exception ex){
					return false;
				}

				}
			 
			 
			 public boolean DeleteBtn_PopUpYes()
				{
				try{

					WebElement DeleteBtnWebEelement=new WebDriverWait(driver,100)
					.until(ExpectedConditions.visibilityOfElementLocated(DeleteBtnPopUpYes_xpath));
					DeleteBtnWebEelement.click();
					Thread.sleep(5000);

			return true;
				}
				catch(Exception ex){
					return false;
				}
				}
				//Method to select check box
				
				
				 public boolean selectCheckBox()
					{
					try{

						WebElement DeleteBtnWebEelement=new WebDriverWait(driver,30)
						.until(ExpectedConditions.visibilityOfElementLocated(Checkbox_xpath));
						DeleteBtnWebEelement.click();
						

				return true;
					}
					catch(Exception ex){
						return false;
					}
				}
			
				 //Method to Verify edit
				 

				 public boolean verifyEdit()
					{
					try{

						WebElement DeleteBtnWebEelement=new WebDriverWait(driver,30)
						.until(ExpectedConditions.visibilityOfElementLocated(Edit_xpath));
						DeleteBtnWebEelement.isEnabled();
						

				return true;
					}
					catch(Exception ex){
						return false;
					}
				}
			
				 //Method to verify delete
				 

				 public boolean verifyDelete()
					{
					try{

						WebElement DeleteBtnWebEelement=new WebDriverWait(driver,30)
						.until(ExpectedConditions.visibilityOfElementLocated(Delete_xpath));
						DeleteBtnWebEelement.isEnabled();
						

				return true;
					}
					catch(Exception ex){
						return false;
					}
				}
				 
				 //Method to select second check Box
				 
				 

				 public boolean selectSecondCheckBox()
					{
					try{

						WebElement DeleteBtnWebEelement=new WebDriverWait(driver,30)
						.until(ExpectedConditions.visibilityOfElementLocated(secondCheckbox_xpath));
						DeleteBtnWebEelement.click();
						

				return true;
					}
					catch(Exception ex){
						return false;
					}
				}
			
				 //Method to verify edit as disabled
				 
				 public boolean verifyEditdisaBLE()
					{
					try{

						WebElement DeleteBtnWebEelement=new WebDriverWait(driver,30)
						.until(ExpectedConditions.visibilityOfElementLocated(Edit_xpath));
						DeleteBtnWebEelement.isDisplayed();
						

				return true;
					}
					catch(Exception ex){
						return false;
					}
				}
				 
				 //method to enter data in search
				 
				 public String enterDataInSearch(String s)
					{
					try{

						WebElement DeleteBtnWebEelement=new WebDriverWait(driver,30)
						.until(ExpectedConditions.visibilityOfElementLocated(Search_xpath));
						DeleteBtnWebEelement.click();
						
						DeleteBtnWebEelement.sendKeys(s);
						Thread.sleep(2000);
				
					}
					catch(Exception ex){
						
					}
					return s;
				}
				 
				 //Method to Verify No result found
				 
				 
				 public boolean verifyNoResultFound()
					{
					try{

						WebElement DeleteBtnWebEelement=new WebDriverWait(driver,30)
						.until(ExpectedConditions.visibilityOfElementLocated(verifyNoresultfound));
						DeleteBtnWebEelement.isDisplayed();
						

				return true;
					}
					catch(Exception ex){
						return false;
					}
				}
				 
				 //Method to enter data in description
				 
				 public String enterDataInDescriptioon(String d)
					{
					try{

						WebElement DeleteBtnWebEelement=new WebDriverWait(driver,30)
						.until(ExpectedConditions.visibilityOfElementLocated(descriptionfiled_xpath));
						DeleteBtnWebEelement.click();
						
						DeleteBtnWebEelement.sendKeys(d);
						Thread.sleep(2000);
				
					}
					catch(Exception ex){
						
					}
					return d;
				}
				 //method to click on add
				 
				 public boolean clickAddNewBtn()
					{
					try{

						WebElement AddNewBtnWebEelement=new WebDriverWait(driver,30)
						.until(ExpectedConditions.visibilityOfElementLocated(AddNewBtn_xpath));
						AddNewBtnWebEelement.click();

				return true;
					}
					catch(Exception ex){
						return false;
					}

					}
				 
				 //Method to vderify ineligblity
				 
				 public boolean verifyIneligblity()
					{
					try{

						WebElement AddNewBtnWebEelement=new WebDriverWait(driver,30)
						.until(ExpectedConditions.visibilityOfElementLocated(ineligblity_xpath));
						AddNewBtnWebEelement.isDisplayed();

				return true;
					}
					catch(Exception ex){
						return false;
					}

					}
				 
				 //method to verify discriptions
				 
				 public boolean verifyDescriptions()
					{
					try{

						WebElement AddNewBtnWebEelement=new WebDriverWait(driver,30)
						.until(ExpectedConditions.visibilityOfElementLocated(Descriptions_xpath));
						AddNewBtnWebEelement.isDisplayed();

				return true;
					}
					catch(Exception ex){
						return false;
					}

					}
				 
				 //Method to verify firest checkbox
				 
				 
				 public boolean verifyFirstCheckBox()
					{
					try{

						WebElement AddNewBtnWebEelement=new WebDriverWait(driver,30)
						.until(ExpectedConditions.visibilityOfElementLocated(firestcheckbox_xpath));
						AddNewBtnWebEelement.isDisplayed();

				return true;
					}
					catch(Exception ex){
						return false;
					}

					}
				 
				 //Method to select second check box
				 
				 

				 public boolean verifySecondCheckBox()
					{
					try{

						WebElement AddNewBtnWebEelement=new WebDriverWait(driver,30)
						.until(ExpectedConditions.visibilityOfElementLocated(Seconcheckbox_xpath));
						AddNewBtnWebEelement.isDisplayed();

				return true;
					}
					catch(Exception ex){
						return false;
					}

					}
				 
				 //verify headetr
				 
				 public boolean verifyHeader()
					{
					try{

						WebElement AddNewBtnWebEelement=new WebDriverWait(driver,30)
						.until(ExpectedConditions.visibilityOfElementLocated(Header_xpath));
						AddNewBtnWebEelement.isDisplayed();

				return true;
					}
					catch(Exception ex){
						return false;
					}

					}
				 //M<EMthod to click on export
				 

				 public boolean clickExportBtn()
					{
					try{

						WebElement ExportBtnWebEelement=new WebDriverWait(driver,30)
						.until(ExpectedConditions.visibilityOfElementLocated(ExportBtn_xpath));
						ExportBtnWebEelement.click();

				return true;
					}
					catch(Exception ex){
						return false;
					}

					}
				 
				 //Method to click on popup export
				 
				 public boolean clickpopupExportBtn()
					{
					try{

						WebElement ExportBtnWebEelement=new WebDriverWait(driver,30)
						.until(ExpectedConditions.visibilityOfElementLocated(popupexport_xpath));
						ExportBtnWebEelement.click();

				return true;
					}
					catch(Exception ex){
						return false;
					}

					}
}
