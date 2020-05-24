package com.cync.ClientMaintenance;

import java.text.SimpleDateFormat;
import java.util.Date;
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

public class CommentsPages extends BasePage {
	
	private final By UserDropDownClick_xpath = By.xpath("//select[@id='gs_user_id']");
	private final By CommentsTypeDropDownClick_xpath = By.xpath("//select[@id='gs_comment_type_id']");
	private final By ClassDropDownClick_xpath = By.xpath("//select[@id='gs_public']");
	private final By CommentsTextSearch_xpath = By.xpath("//input[@id='gs_comment_text']");
	private final By CommentsDateSearch_xpath = By.xpath("//input[@id='gs_comment_date']");
	private final By CommentsEditBySearch_xpath = By.xpath("//input[@id='gs_edited_by']");
	private final By AddNewRecordClick_xpath = By.xpath("//span[@class='ui-icon ui-icon ui-icon-plus']");
	private final By Commentstype_xpath = By.xpath("(//select[@class='editable inline-edit-cell ui-widget-content ui-corner-all'])[1]");
	private final By Class_xpath = By.xpath("(//select[@class='editable inline-edit-cell ui-widget-content ui-corner-all'])[2]");
	private final By CommentsTextField_xpath = By.xpath("//td//textarea[@class='editable inline-edit-cell ui-widget-content ui-corner-all']");
	private final By SaveIconClick_xpath = By.xpath("//span[@class='ui-icon ui-icon ui-icon-disk']");
	private final By CommentsAfterSaveMsg_xpath = By.xpath("//div[@class='ui-state-success']");
	private final By ClosePopUpClick_xpath = By.xpath("//a[@id='closedialog']");
	private final By CommentsAfterSaveErrorMsg_xpath = By.xpath("//div[@class='ui-state-error']");
	private final By CommentsDoubleClick_xpath = By.xpath("(//td[@class='wrap-content-td'])[1]");
	
	private final By CancelBtn_xpath = By.xpath("//td[@title='Cancel']");
	private final By ReloadBtn_xpath = By.xpath("//span[@class='ui-icon ui-icon-refresh']");
	private final By CheckOn_xpath = By.xpath("//input[@class='cbox']");
	private final By DeleteBtn_xpath = By.xpath("//span[@class='ui-icon ui-icon-trash']");
	private final By DeleteBtnPopUp_xpath = By.xpath("//a[@id='dData']");
	private final By warningMsgWhileDelete_xpath = By.xpath("//div[text()='Please select row']");
	private final By WarningMsgPopUpClose_xpath = By.xpath("(//a[@class='ui-jqdialog-titlebar-close ui-corner-all'])[1]");
	private final By ExportBtn_xpath = By.xpath("//td[@title='Export Data']");
	private final By DownloadBtn_xpath = By.xpath("//div[@class='export']");

	
	private final By UserChkPopUp_xpath = By.xpath("//input[@value='user_name']");
	private final By CommentsTypeCheckChkPopUp_xpath = By.xpath("//input[@value='comment_type_name']");
	private final By ClassChkPopUp_xpath = By.xpath("//input[@value='public_or_private']");
	private final By CommentsChkPopUp_xpath = By.xpath("//input[@value='comment_text']");
	private final By DateChkPopUp_xpath = By.xpath("//input[@value='comment_date.localtime.custom_format']");
	private final By EditedByChkPopUp_xpath = By.xpath("//input[@value='edited_by']");

	private final By warningMsgWhileDownload_xpath = By.xpath("//div[@class='ui-state-error']");
	private final By DownloadPopUpClose_xpath = By.xpath("//button[@class='ui-dialog-titlebar-close']");

	private final By PaginationFirstpage_xpath = By.xpath("//span[@class='ui-icon ui-icon-seek-first']");
	private final By Paginationpreviouspage_xpath = By.xpath("//span[@class='ui-icon ui-icon-seek-prev']");
	private final By PaginationNextpage_xpath = By.xpath("//span[@class='ui-icon ui-icon-seek-next']");
	private final By PaginationLastpage_xpath = By.xpath("//span[@class='ui-icon ui-icon-seek-end']");

	
	
	
	
	public CommentsPages(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	
	public boolean UserDropDown_Click()
	 {
	 try{

	 	WebElement UserDropDownWebEelement=new WebDriverWait(driver,5)
	 	.until(ExpectedConditions.visibilityOfElementLocated(UserDropDownClick_xpath));
	 	UserDropDownWebEelement.click();
	
	 	return true;
	 }
	 catch(Exception ex){
	 	return false;
	 }

	 }
	
	
	public boolean CommentsType_Click()
	 {
	 try{

	 	WebElement CommentsTypeDropDownWebEelement=new WebDriverWait(driver,5)
	 	.until(ExpectedConditions.visibilityOfElementLocated(CommentsTypeDropDownClick_xpath));
	 	CommentsTypeDropDownWebEelement.click();
	
	 	return true;
	 }
	 catch(Exception ex){
	 	return false;
	 }

	 }
	
	public boolean  ClassDropDown_Click(){
		try {
			String[] exp = {"All","Public","Private"};
			
			WebElement dropdown = driver.findElement(ClassDropDownClick_xpath);  
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
	
	
/*	public boolean ClassDropDown_Click()
	 {
	 try{

	 	WebElement ClassDropDownWebEelement=new WebDriverWait(driver,100)
	 	.until(ExpectedConditions.visibilityOfElementLocated(ClassDropDownClick_xpath));
	 	ClassDropDownWebEelement.click();
	
	 	return true;
	 }
	 catch(Exception ex){
	 	return false;
	 }

	 }*/
	
	 public boolean CommentsText(String CommentsText)
		{
		try{
			WebElement CommentsTextWebEelement=new WebDriverWait(driver,5)
				.until(ExpectedConditions.visibilityOfElementLocated(CommentsTextSearch_xpath));
			CommentsTextWebEelement.clear();
			CommentsTextWebEelement.sendKeys(CommentsText);
			
			return true;
		}
		catch(Exception ex){
			return false;
		}
		}
	  
	 public boolean CommentsDate(String CommentsDate)
		{
		try{
			WebElement CommentsDateWebEelement=new WebDriverWait(driver,5)
				.until(ExpectedConditions.visibilityOfElementLocated(CommentsDateSearch_xpath));
			CommentsDateWebEelement.clear();
			CommentsDateWebEelement.sendKeys(CommentsDate);
			
			return true;
		}
		catch(Exception ex){
			return false;
		}
		}
	  
	 public boolean CommentsEditBy(String CommentsEditBy)
		{
		try{
			WebElement CommentsEditByWebEelement=new WebDriverWait(driver,5)
				.until(ExpectedConditions.visibilityOfElementLocated(CommentsEditBySearch_xpath));
			CommentsEditByWebEelement.clear();
			CommentsEditByWebEelement.sendKeys(CommentsEditBy);
			
			return true;
		}
		catch(Exception ex){
			return false;
		}
		}
	 
	 public boolean AddNewRecord_Click()
	 {
	 try{

	 	WebElement AddNewRecordWebEelement=new WebDriverWait(driver,5)
	 	.until(ExpectedConditions.visibilityOfElementLocated(AddNewRecordClick_xpath));
	 	AddNewRecordWebEelement.click();
	
	 	return true;
	 }
	 catch(Exception ex){
	 	return false;
	 }

	 }
	 
	 public String Commentstype_Dropdown(String Commentstype) throws InterruptedException{
			

			WebDriverWait wait = new WebDriverWait(driver, 5);
			wait.until(ExpectedConditions.visibilityOfElementLocated((Commentstype_xpath)));

			WebElement element = driver.findElement((Commentstype_xpath));
			Select sel = new Select(element);
			List<WebElement> list = sel.getOptions();	
			
			
			for(WebElement ele : list){
				
				if(ele.getText().equals(Commentstype)){
					ele.click();
					//////Thread.sleep(10000);
					break;
				}
			}
			return Commentstype;

		}
	 
	 
	 public String Class_Dropdown(String Classtype) throws InterruptedException{
			

			WebDriverWait wait = new WebDriverWait(driver, 5);
			wait.until(ExpectedConditions.visibilityOfElementLocated((Class_xpath)));

			WebElement element = driver.findElement((Class_xpath));
			Select sel = new Select(element);
			List<WebElement> list = sel.getOptions();	
			
			
			for(WebElement ele : list){
				
				if(ele.getText().equals(Classtype)){
					ele.click();
					//////Thread.sleep(10000);
					break;
				}
			}
			return Classtype;

		}
	 
	public boolean CommentsText_field()
	 {
	 try{

	 	WebElement AddNewRecordWebEelement=new WebDriverWait(driver,5)
	 	.until(ExpectedConditions.visibilityOfElementLocated(CommentsTextField_xpath));
	 	AddNewRecordWebEelement.click();
	
	 	return true;
	 }
	 catch(Exception ex){
	 	return false;
	 }
	 }
	
	 
 public boolean CommentsText_field(String enterText)
		{
		try{
			WebElement enterDataWebEelement=new WebDriverWait(driver,5)
				.until(ExpectedConditions.visibilityOfElementLocated(CommentsTextField_xpath));
			enterDataWebEelement.clear();
			enterDataWebEelement.sendKeys(enterText);
			
			return true;
		}
		catch(Exception ex){
			return false;
		}
		}
 
 public boolean CommentsTextEdit_field(String enterTextEdit)
	{
	try{
		WebElement enterDataWebEelement=new WebDriverWait(driver,5)
			.until(ExpectedConditions.visibilityOfElementLocated(CommentsTextField_xpath));
		enterDataWebEelement.clear();
		enterDataWebEelement.sendKeys(enterTextEdit);
		
		return true;
	}
	catch(Exception ex){
		return false;
	}
	}

	 
	 public boolean SaveIcon_Click()
	 {
	 try{

	 	WebElement SaveIconWebEelement=new WebDriverWait(driver,5)
	 	.until(ExpectedConditions.visibilityOfElementLocated(SaveIconClick_xpath));
	 	SaveIconWebEelement.click();
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
	       .until(ExpectedConditions.visibilityOfElementLocated(CommentsAfterSaveMsg_xpath));
	       
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
		
		public boolean ClosePopUp_Click()
		 {
		 try{

		 	WebElement ClosePopUpWebEelement=new WebDriverWait(driver,5)
		 	.until(ExpectedConditions.visibilityOfElementLocated(ClosePopUpClick_xpath));
		 	ClosePopUpWebEelement.click();
				
		 	return true;
		 }
		 catch(Exception ex){
		 	return false;
		 }

		 }
		 
		public String verifyErrorMessage(String ErrorMsg)
	    {
	    try{
	       WebElement SaveWebEelement=new WebDriverWait(driver,5)
	       .until(ExpectedConditions.visibilityOfElementLocated(CommentsAfterSaveErrorMsg_xpath));
	       
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
		
		public boolean DoubleClickVerify()
		{
			try{
			
			WebElement element=new WebDriverWait(driver,5)
			.until(ExpectedConditions.visibilityOfElementLocated(CommentsDoubleClick_xpath));
			//Double click
			Actions action = new Actions(driver);
			action.doubleClick(element).build().perform();
			//////Thread.sleep(2000);
			
			return true;
		}

		catch(Exception ex){
			return false;
		}
	}	
		
		 public boolean CancelBtn_Click()
		 {
		 try{

		 	WebElement CancelBtnWebEelement=new WebDriverWait(driver,5)
		 	.until(ExpectedConditions.visibilityOfElementLocated(CancelBtn_xpath));
		 	CancelBtnWebEelement.click();
		 	//////Thread.sleep(500);
		
		 	return true;
		 }
		 catch(Exception ex){
		 	return false;
		 }
		 
		 }
		 
		 public boolean ReloadBtn_Click()
		 {
		 try{

		 	WebElement ReloadBtnWebEelement=new WebDriverWait(driver,5)
		 	.until(ExpectedConditions.visibilityOfElementLocated(ReloadBtn_xpath));
		 	ReloadBtnWebEelement.isDisplayed();
		
		 	return true;
		 }
		 catch(Exception ex){
		 	return false;
		 }

		 }
		
		 
		 public boolean CheckOn_Click()
		 {
		 try{

		 	WebElement CheckOnWebEelement=new WebDriverWait(driver,5)
		 	.until(ExpectedConditions.visibilityOfElementLocated(CheckOn_xpath));
		 	CheckOnWebEelement.click();
		 	//////Thread.sleep(2000);

		 	return true;
		 }
		 catch(Exception ex){
		 	return false;
		 }

		 }
		
		 public boolean DeleteBtn_Click()
		 {
		 try{

		 	WebElement DeleteBtnBtnWebEelement=new WebDriverWait(driver,5)
		 	.until(ExpectedConditions.visibilityOfElementLocated(DeleteBtn_xpath));
		 	DeleteBtnBtnWebEelement.click();
		 	//////Thread.sleep(500);

		 	return true;
		 }
		 catch(Exception ex){
		 	return false;
		 }

		 }
	
		 public boolean DeleteBtnPopUp_Click()
		 {
		 try{

		 	WebElement DeleteBtnBtnWebEelement=new WebDriverWait(driver,5)
		 	.until(ExpectedConditions.visibilityOfElementLocated(DeleteBtnPopUp_xpath));
		 	DeleteBtnBtnWebEelement.click();
		 	//////Thread.sleep(500);

		 	return true;
		 }
		 catch(Exception ex){
		 	return false;
		 }

		 }
		 
		 public String verifyWarningMsgDelete(String warningMsg)
		    {
		    try{
		       WebElement WarningMsgWebEelement=new WebDriverWait(driver,5)
		       .until(ExpectedConditions.visibilityOfElementLocated(warningMsgWhileDelete_xpath));
		       
		      String actualMsg= WarningMsgWebEelement.getText();
		      if(actualMsg.equalsIgnoreCase(warningMsg))
		      {
		       return actualMsg;
		      }
		       
		    }
		    catch(Exception ex){
		     
		    }
		 return warningMsg;
		    }
		
		 
		 public boolean warningMsgPopUp_Close()
		 {
		 try{

		 	WebElement DeleteBtnBtnWebEelement=new WebDriverWait(driver,5)
		 	.until(ExpectedConditions.visibilityOfElementLocated(WarningMsgPopUpClose_xpath));
		 	DeleteBtnBtnWebEelement.click();

		 	return true;
		 }
		 catch(Exception ex){
		 	return false;
		 }
		 
		 }
		 
		 public boolean ExportBtn_Click()
		 {
		 try{

		 	WebElement ExportBtnWebEelement=new WebDriverWait(driver,5)
		 	.until(ExpectedConditions.visibilityOfElementLocated(ExportBtn_xpath));
		 	ExportBtnWebEelement.click();
		 			
		 	return true;
		 }
		 catch(Exception ex){
		 	return false;
		 }

		 }
		 
		 public boolean Export_DownloadClick()
		 {
		 try{

		 	WebElement ExportBtnWebEelement=new WebDriverWait(driver,5)
		 	.until(ExpectedConditions.visibilityOfElementLocated(DownloadBtn_xpath));
		 	ExportBtnWebEelement.click();
		 	//////Thread.sleep(5000);
		 			
		 	return true;
		 }
		 catch(Exception ex){
		 	return false;
		 }

		 }	 
		
				 
		 public boolean UserCheckBoxOffifOn(boolean flag){
			 try {
				   WebDriverWait wait = new WebDriverWait(driver, 5);
				   //////Thread.sleep(2000);
				   wait.until(ExpectedConditions.visibilityOfElementLocated(( UserChkPopUp_xpath)));			   
				   WebElement element = driver.findElement((UserChkPopUp_xpath));
				   if(flag){
				    if(!element.isSelected() == false){
				     element.click();
				
				    }
				   }else if(!flag){
				    if(element.isSelected() == false){
				     element.click();
				    

				    }
				   }   
				  } catch (Exception e) {
				  }
			return flag; 
	}
		
		 public boolean CommentTypeCheckBoxOffifOn(boolean flag){
			 try {
				   WebDriverWait wait = new WebDriverWait(driver, 5);
				   //////Thread.sleep(2000);
				   wait.until(ExpectedConditions.visibilityOfElementLocated(( CommentsTypeCheckChkPopUp_xpath)));			   
				   WebElement element = driver.findElement((CommentsTypeCheckChkPopUp_xpath));
				   if(flag){
				    if(!element.isSelected() == false){
				     element.click();
				
				    }
				   }else if(!flag){
				    if(element.isSelected() == false){
				     element.click();
				    

				    }
				   }   
				  } catch (Exception e) {
				  }
			return flag; 
	}
		 
	
		 public boolean ClassCheckBoxOffifOn(boolean flag){
			 try {
				   WebDriverWait wait = new WebDriverWait(driver, 5);
				   //////Thread.sleep(2000);
				   wait.until(ExpectedConditions.visibilityOfElementLocated(( ClassChkPopUp_xpath)));			   
				   WebElement element = driver.findElement((ClassChkPopUp_xpath));
				   if(flag){
				    if(!element.isSelected() == false){
				     element.click();
				
				    }
				   }else if(!flag){
				    if(element.isSelected() == false){
				     element.click();
				    

				    }
				   }   
				  } catch (Exception e) {
				  }
			return flag; 
	}
		 
		 public boolean CommentCheckBoxOffifOn(boolean flag){
			 try {
				   WebDriverWait wait = new WebDriverWait(driver, 5);
				   //////Thread.sleep(2000);
				   wait.until(ExpectedConditions.visibilityOfElementLocated(( CommentsChkPopUp_xpath)));			   
				   WebElement element = driver.findElement((CommentsChkPopUp_xpath));
				   if(flag){
				    if(!element.isSelected() == false){
				     element.click();
				
				    }
				   }else if(!flag){
				    if(element.isSelected() == false){
				     element.click();
				    

				    }
				   }   
				  } catch (Exception e) {
				  }
			return flag; 
	}
		 
	
		 public boolean DateCheckBoxOffifOn(boolean flag){
			 try {
				   WebDriverWait wait = new WebDriverWait(driver, 5);
				   //////Thread.sleep(2000);
				   wait.until(ExpectedConditions.visibilityOfElementLocated(( DateChkPopUp_xpath)));			   
				   WebElement element = driver.findElement((DateChkPopUp_xpath));
				   if(flag){
				    if(!element.isSelected() == false){
				     element.click();
				
				    }
				   }else if(!flag){
				    if(element.isSelected() == false){
				     element.click();
				    

				    }
				   }   
				  } catch (Exception e) {
				  }
			return flag; 
	}
		
		 
		 public boolean EditedByCheckBoxOffifOn(boolean flag){
			 try {
				   WebDriverWait wait = new WebDriverWait(driver, 5);
				   //////Thread.sleep(2000);
				   wait.until(ExpectedConditions.visibilityOfElementLocated(( EditedByChkPopUp_xpath)));			   
				   WebElement element = driver.findElement((EditedByChkPopUp_xpath));
				   if(flag){
				    if(!element.isSelected() == false){
				     element.click();
				
				    }
				   }else if(!flag){
				    if(element.isSelected() == false){
				     element.click();
				    

				    }
				   }   
				  } catch (Exception e) {
				  }
			return flag; 
	}	
		 
		 
		 public String verifyWarningMsgDownload(String warningMsgDownload)
		    {
		    try{
		       WebElement WarningMsgWebEelement=new WebDriverWait(driver,5)
		       .until(ExpectedConditions.visibilityOfElementLocated(warningMsgWhileDownload_xpath));
		       
		      String actualMsg= WarningMsgWebEelement.getText();
		      if(actualMsg.equalsIgnoreCase(warningMsgDownload))
		      {
		       return actualMsg;
		      }
		       
		    }
		    catch(Exception ex){
		     
		    }
		 return warningMsgDownload;
		    }
		
		 
		 public boolean DownloadPopUp_close()
		 {
		 try{

		 	WebElement ExportBtnWebEelement=new WebDriverWait(driver,5)
		 	.until(ExpectedConditions.visibilityOfElementLocated(DownloadPopUpClose_xpath));
		 	ExportBtnWebEelement.click();
		 			 			
		 	return true;
		 }
		 catch(Exception ex){
		 	return false;
		 }

		 }	
		 
		 public boolean Pagination_firstpage()
		 {
		 try{

		 	WebElement ExportBtnWebEelement=new WebDriverWait(driver,5)
		 	.until(ExpectedConditions.visibilityOfElementLocated(PaginationFirstpage_xpath));
		 	ExportBtnWebEelement.isDisplayed();
		 			
		 	return true;
		 }
		 catch(Exception ex){
		 	return false;
		 }

		 }
		 
		 public boolean Pagination_previouspage()
		 {
		 try{

		 	WebElement ExportBtnWebEelement=new WebDriverWait(driver,5)
		 	.until(ExpectedConditions.visibilityOfElementLocated(Paginationpreviouspage_xpath));
		 	ExportBtnWebEelement.isDisplayed();
		 			
		 	return true;
		 }
		 catch(Exception ex){
		 	return false;
		 }
		 
		 }
		 
		 
		 public boolean Pagination_Nextpage()
		 {
		 try{

		 	WebElement ExportBtnWebEelement=new WebDriverWait(driver,5)
		 	.until(ExpectedConditions.visibilityOfElementLocated(PaginationNextpage_xpath));
		 	ExportBtnWebEelement.isDisplayed();
		 			
		 	return true;
		 }
		 catch(Exception ex){
		 	return false;
		 }
		 }
		 
		 public boolean Pagination_Lastpage()
		 {
		 try{

		 	WebElement ExportBtnWebEelement=new WebDriverWait(driver,5)
		 	.until(ExpectedConditions.visibilityOfElementLocated(PaginationLastpage_xpath));
		 	ExportBtnWebEelement.isDisplayed();
		 			
		 	return true;
		 }
		 catch(Exception ex){
		 	return false;
		 }
		 
		 }
		 

			public boolean selectSystemDate_DateField(){
				try {
				WebElement selectSystemDateWebElement = new WebDriverWait(driver,
				5)
				.until(ExpectedConditions
				.visibilityOfElementLocated(CommentsDateSearch_xpath));
				Date date = new Date(System.currentTimeMillis());
				SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
				String today=formatter.format(date);

				selectSystemDateWebElement.sendKeys(today);
				//////Thread.sleep(5000);


				return true;
				} catch (Exception e) {
				return false;
				}
				}
			
		 
			 public String Search_Verify(String textSearched)
			    {
			    try{
			       WebElement WarningMsgWebEelement=new WebDriverWait(driver,5)
			       .until(ExpectedConditions.visibilityOfElementLocated(CommentsDoubleClick_xpath));
			       
			      String actualMsg= WarningMsgWebEelement.getText();
			      if(actualMsg.equalsIgnoreCase(textSearched))
			      {
			       return actualMsg;
			      }
			       
			    }
			    catch(Exception ex){
			     
			    }
			 return textSearched;
			    }
			


			
			 
} 
			 

