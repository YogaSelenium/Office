package com.cync.ClientMaintenance;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.cync.base.BasePage;

public class ReportCommentsPage extends BasePage {
	
	private final By CommentSetNameWebEelement_xpath = By.xpath("//th[contains(text(),'Comment Set Name')]");
	private final By AssignedReports_xpath = By.xpath("//th[contains(text(),'Assigned Reports')]");
	private final By CreatedDate_xpath = By.xpath("//th[contains(text(),'Created Date')]");
	private final By Action_xpath = By.xpath("//th[@class='textCenter']");
	private final By CreateCommentSet_xpath = By.xpath("//a[text()='Create Comment Set']");
	private final By Edit_xpath = By.xpath("//a[@class='edit-comments editLink']");
	private final By Delete_xpath = By.xpath("(//a[text()='Delete'])[1]");

	private final By CommentSetName_xpath = By.xpath("//input[@class='form-control text_field']");

	private final By BBCTrendReport_xpath = By.xpath("(//input[@name='comment_set[cync_report_ids][]'])[1]");
	private final By BBCExecutiveTrendReport_xpath = By.xpath("(//input[@name='comment_set[cync_report_ids][]'])[2]");
	private final By CollateralAnalysis_xpath = By.xpath("(//input[@name='comment_set[cync_report_ids][]'])[3]");
	private final By BBCPrint_xpath = By.xpath("(//input[@name='comment_set[cync_report_ids][]'])[4]");
	private final By BBCManagementReport_xpath = By.xpath("(//input[@name='comment_set[cync_report_ids][]'])[5]");
	private final By PortfolioAnalysisReport_xpath = By.xpath("(//input[@name='comment_set[cync_report_ids][]'])[6]");
	private final By SaveBtn_xpath = By.xpath("//input[@class='view-button  btn-sm']");
	private final By BackBtn_xpath = By.xpath("//a[@class='view-button  btn-sm']");
	private final By ErrorMsg1AfterSave_xpath = By.xpath("//div[@id='error_explanation']//ul//li[1]");
	private final By ErrorMsg2AfterSave_xpath = By.xpath("//div[@id='error_explanation']//ul//li[2]");
	private final By ReportCommentSaveMsg_xpath = By.xpath("//div[@class='alert alert-success comment_set_alert']");
	private final By ClickOnHyperLink_xpath = By.id("createCommentSet");
	private final By clickOnAddComment_xpath = By.xpath("//button[@class='view-button-new btn-sm']");
	private final By AddCommentEntertext_xpath = By.xpath("//iframe[@class='cke_wysiwyg_frame cke_reset']");
	private final By AddCommentClickOnSaveBtn_xpath = By.xpath("//input[@id='save_comment_set_notes']");
	private final By SuccessMsgAfterSaveComment_xpath = By.xpath("//div[@class='alert alert-success alert-dismissible comment_note_alert']");
	private final By clickOnEditComment_xpath = By.xpath("//a[@class='edit-comments editLink']");

	private final By AddCommentClickOnSaveBtnAfterEdit_xpath = By.xpath("(//input[@value='Save'])[2]");

	private final By clickOnDeleteComment_xpath = By.xpath("//a[@class='deleteLink']");
	private final By clickOnCloseComment_xpath = By.xpath("//button[text()='Close']");
	private final By ClickBBCExecutiveTrendReport_xpath = By.xpath("//a[contains(text(),'BBC Executive Trend Report')]");

	private final By ClickOnGenerateBtn_xpath = By.xpath("//button[text()='Generate']");
private final By Back_xpath=By.xpath(" //a[contains(@class,'btn-sm')]");
	
	
	
	//Author garima

private final By Delter_xpath=By.xpath("//a[contains(text(),'Delete')]");

	

	public ReportCommentsPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	 public boolean CommentSetName_Label()
	 {
	 try{

	 	WebElement CommentSetNameWebEelement=new WebDriverWait(driver,5)
	 	.until(ExpectedConditions.visibilityOfElementLocated(CommentSetNameWebEelement_xpath));
	 	CommentSetNameWebEelement.isDisplayed();
	
	 	return true;
	 }
	 catch(Exception ex){
	 	return false;
	 }

	 }
	
	
		
		 public boolean AssignedReports_Label()
		 {
		 try{

		 	WebElement CommentSetNameWebEelement=new WebDriverWait(driver,5)
		 	.until(ExpectedConditions.visibilityOfElementLocated(AssignedReports_xpath));
		 	CommentSetNameWebEelement.isDisplayed();
		
		 	return true;
		 }
		 catch(Exception ex){
		 	return false;
		 }

		 }
	
	
		 public boolean CreatedDate_Label()
		 {
		 try{

		 	WebElement CommentSetNameWebEelement=new WebDriverWait(driver,5)
		 	.until(ExpectedConditions.visibilityOfElementLocated(CreatedDate_xpath));
		 	CommentSetNameWebEelement.isDisplayed();
		
		 	return true;
		 }
		 catch(Exception ex){
		 	return false;
		 }

		 }
	
		 public boolean Action_Label()
		 {
		 try{

		 	WebElement CommentSetNameWebEelement=new WebDriverWait(driver,5)
		 	.until(ExpectedConditions.visibilityOfElementLocated(Action_xpath));
		 	CommentSetNameWebEelement.isDisplayed();
		
		 	return true;
		 }
		 catch(Exception ex){
		 	return false;
		 }

		 }
	
		 public boolean CreateCommentSet_Btn()
		 {
		 try{

		 	WebElement CommentSetNameWebEelement=new WebDriverWait(driver,5)
		 	.until(ExpectedConditions.visibilityOfElementLocated(CreateCommentSet_xpath));
		 	CommentSetNameWebEelement.isDisplayed();
		
		 	return true;
		 }
		 catch(Exception ex){
		 	return false;
		 }

		 }
	
		 public boolean Edit_Btn()
		 {
		 try{

		 	WebElement CommentSetNameWebEelement=new WebDriverWait(driver,5)
		 	.until(ExpectedConditions.visibilityOfElementLocated(Edit_xpath));
		 	CommentSetNameWebEelement.isDisplayed();
		
		 	return true;
		 }
		 catch(Exception ex){
		 	return false;
		 }

		 }
		 

		 public boolean Edit_BtnClick()
		 {
		 try{

		 	WebElement CommentSetNameWebEelement=new WebDriverWait(driver,5)
		 	.until(ExpectedConditions.visibilityOfElementLocated(Edit_xpath));
		 	CommentSetNameWebEelement.click();
		 	//////Thread.sleep(500);
		
		 	return true;
		 }
		 catch(Exception ex){
		 	return false;
		 }

		 }
		 
		 
		 public boolean Delete_Btn()
		 {
		 try{

		 	WebElement CommentSetNameWebEelement=new WebDriverWait(driver,5)
		 	.until(ExpectedConditions.visibilityOfElementLocated(Delete_xpath));
		 	CommentSetNameWebEelement.isDisplayed();
		
		 	return true;
		 }
		 catch(Exception ex){
		 	return false;
		 }

		 }
		 
		 
		 public boolean Delete_ButtonClick()
		 {
		 try{

		 	WebElement DeleteBtnWebEelement=new WebDriverWait(driver,5)
		 	.until(ExpectedConditions.visibilityOfElementLocated(Delete_xpath));
		 	DeleteBtnWebEelement.click();

		 	//Thread.sleep(500);
		 	this.isAlertPresent();

			Alert alertOK = driver.switchTo().alert();
			alertOK.accept();
			//////Thread.sleep(500);
			
		
		 	return true;
		 }
		 catch(Exception ex){
		 	return false;
		 }

		 }
		 
		 public boolean CommentSetName_textField()
		 {
		 try{

		 	WebElement CommentSetNameWebEelement=new WebDriverWait(driver,5)
		 	.until(ExpectedConditions.visibilityOfElementLocated(CommentSetName_xpath));
		 	CommentSetNameWebEelement.isDisplayed();
		
		 	return true;
		 }
		 catch(Exception ex){
		 	return false;
		 }

		 }
		 
		 public boolean  BBCTrendReport_Check()
		 {
		 try{

		 	WebElement CommentSetNameWebEelement=new WebDriverWait(driver,5)
		 	.until(ExpectedConditions.visibilityOfElementLocated(BBCTrendReport_xpath));
		 	CommentSetNameWebEelement.isDisplayed();
		
		 	return true;
		 }
		 catch(Exception ex){
		 	return false;
		 }

		 }
		 
		 
		 public boolean  BBCExecutiveTrendReport_Check()
		 {
		 try{
                Thread.sleep(500);
		 	WebElement CommentSetNameWebEelement=new WebDriverWait(driver,10)
		 	.until(ExpectedConditions.visibilityOfElementLocated(BBCExecutiveTrendReport_xpath));
		 	CommentSetNameWebEelement.isDisplayed();
		
		 	return true;
		 }
		 catch(Exception ex){
		 	return false;
		 }

		 }
		 
		 public boolean  CollateralAnalysis_Check()
		 {
		 try{

		 	WebElement CommentSetNameWebEelement=new WebDriverWait(driver,5)
		 	.until(ExpectedConditions.visibilityOfElementLocated(CollateralAnalysis_xpath));
		 	CommentSetNameWebEelement.isDisplayed();
		
		 	return true;
		 }
		 catch(Exception ex){
		 	return false;
		 }

		 }
		 
		 public boolean  BBCPrint_Check()
		 {
		 try{

		 	WebElement CommentSetNameWebEelement=new WebDriverWait(driver,5)
		 	.until(ExpectedConditions.visibilityOfElementLocated(BBCPrint_xpath));
		 	CommentSetNameWebEelement.isDisplayed();
		
		 	return true;
		 }
		 catch(Exception ex){
		 	return false;
		 }

		 }
		  
		 
		 public boolean   BBCManagementReport_Check()
		 {
		 try{

		 	WebElement CommentSetNameWebEelement=new WebDriverWait(driver,50)
		 	.until(ExpectedConditions.visibilityOfElementLocated(BBCManagementReport_xpath));
		 	CommentSetNameWebEelement.isDisplayed();
		
		 	return true;
		 }
		 catch(Exception ex){
		 	return false;
		 }

		 }
		   
		 public boolean  PortfolioAnalysisReport_Check()
		 {
		 try{

		 	WebElement CommentSetNameWebEelement=new WebDriverWait(driver,5)
		 	.until(ExpectedConditions.visibilityOfElementLocated(PortfolioAnalysisReport_xpath));
		 	CommentSetNameWebEelement.isDisplayed();
		
		 	return true;
		 }
		 catch(Exception ex){
		 	return false;
		 }

		 }
		  
		 public boolean  SaveBtn()
		 {
		 try{

		 	WebElement SaveBtnWebEelement=new WebDriverWait(driver,5)
		 	.until(ExpectedConditions.visibilityOfElementLocated(SaveBtn_xpath));
		 	SaveBtnWebEelement.isDisplayed();
		
		 	return true;
		 }
		 catch(Exception ex){
		 	return false;
		 }

		 }
		 
		 public boolean  BackBtn()
		 {
		 try{

		 	WebElement SaveBtnWebEelement=new WebDriverWait(driver,5)
		 	.until(ExpectedConditions.visibilityOfElementLocated(BackBtn_xpath));
		 	SaveBtnWebEelement.isDisplayed();
		
		 	return true;
		 }
		 catch(Exception ex){
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

		 
		 public boolean CreateCommentSet_BtnClick()
		 {
		 try{

		 	WebElement CommentSetNameWebEelement=new WebDriverWait(driver,50)
		 	.until(ExpectedConditions.visibilityOfElementLocated(CreateCommentSet_xpath));
		 	CommentSetNameWebEelement.click();
		 	this.isAlertPresent();
		 	Thread.sleep(2000);
		
		 	return true;
		 }
		 catch(Exception ex){
		 	return false;
		 }

		 }
		 
		 public boolean  BBCTrendReport_ClickOnCheck()
		 {
		 try{

		 	WebElement CommentSetNameWebEelement=new WebDriverWait(driver,5)
		 	.until(ExpectedConditions.visibilityOfElementLocated(BBCTrendReport_xpath));
		 	CommentSetNameWebEelement.click();
		
		 	return true;
		 }
		 catch(Exception ex){
		 	return false;
		 }

		 }
		 
		 
		 
		 
		 public boolean  BBCExecutiveTrendReport_ClickOnCheck()
		 {
		 try{

		 	WebElement CommentSetNameWebEelement=new WebDriverWait(driver,10)
		 	.until(ExpectedConditions.visibilityOfElementLocated(BBCExecutiveTrendReport_xpath));
		 	CommentSetNameWebEelement.click();
		 	Thread.sleep(1000);
		 	return true;
		 }
		 catch(Exception ex){
		 	return false;
		 }

		 }
		 
		 
		 public boolean  CollateralAnalysis_ClickOnCheck()
		 {
		 try{

		 	WebElement CommentSetNameWebEelement=new WebDriverWait(driver,5)
		 	.until(ExpectedConditions.visibilityOfElementLocated(CollateralAnalysis_xpath));
		 	CommentSetNameWebEelement.click();
		
		 	return true;
		 }
		 catch(Exception ex){
		 	return false;
		 }

		 }
		 
		 public boolean  BBCPrint_ClickOnCheck()
		 {
		 try{

		 	WebElement CommentSetNameWebEelement=new WebDriverWait(driver,5)
		 	.until(ExpectedConditions.visibilityOfElementLocated(BBCPrint_xpath));
		 	CommentSetNameWebEelement.click();
		
		 	return true;
		 }
		 catch(Exception ex){
		 	return false;
		 }

		 }
		  
		 
		 public boolean   BBCManagementReport_ClickOnCheck()
		 {
		 try{

		 	WebElement CommentSetNameWebEelement=new WebDriverWait(driver,50)
		 	.until(ExpectedConditions.visibilityOfElementLocated(BBCManagementReport_xpath));
		 	CommentSetNameWebEelement.click();
		
		 	return true;
		 }
		 catch(Exception ex){
		 	return false;
		 }

		 }
		   
		 public boolean  PortfolioAnalysisReport_ClickOnCheck()
		 {
		 try{

		 	WebElement CommentSetNameWebEelement=new WebDriverWait(driver,5)
		 	.until(ExpectedConditions.visibilityOfElementLocated(PortfolioAnalysisReport_xpath));
		 	CommentSetNameWebEelement.click();
		
		 	return true;
		 }
		 catch(Exception ex){
		 	return false;
		 }

		 }
		  
		 
		 public boolean  SaveBtn_click()
		 {
		 try{

		 	WebElement SaveBtnWebEelement=new WebDriverWait(driver,5)
		 	.until(ExpectedConditions.visibilityOfElementLocated(SaveBtn_xpath));
		 	SaveBtnWebEelement.click();
		 	//////Thread.sleep(5000);
		
		 	return true;
		 }
		 catch(Exception ex){
		 	return false;
		 }

		 }
		 
		 public boolean  BackBtn_click()
		 {
		 try{

		 	WebElement SaveBtnWebEelement=new WebDriverWait(driver,5)
		 	.until(ExpectedConditions.visibilityOfElementLocated(BackBtn_xpath));
		 	SaveBtnWebEelement.click();
		 	//////Thread.sleep(5000);

		 	return true;
		 }
		 catch(Exception ex){
		 	return false;
		 }

		 }
		 
		 
		 public String verifyMessage1AfterSave_ErrorMsg(String ErrorMsg1)
		    {
		    try{
		       WebElement SaveWebEelement=new WebDriverWait(driver,5)
		       .until(ExpectedConditions.visibilityOfElementLocated(ErrorMsg1AfterSave_xpath));
		       
		      String actualMsg= SaveWebEelement.getText();
		      if(actualMsg.equalsIgnoreCase(ErrorMsg1))
		      {
		       return actualMsg;
		      }
		       
		    }
		    catch(Exception ex){
		     
		    }
		 return ErrorMsg1;
		    }
		 
		
		 public String verifyMessage2AfterSave_ErrorMsg(String ErrorMsg2)
		    {
		    try{
		       WebElement SaveWebEelement=new WebDriverWait(driver,10)
		       .until(ExpectedConditions.visibilityOfElementLocated(ErrorMsg2AfterSave_xpath));
		       
		      String actualMsg= SaveWebEelement.getText();
		      if(actualMsg.equalsIgnoreCase(ErrorMsg2))
		      {
		       return actualMsg;
		      }
		       
		    }
		    catch(Exception ex){
		     
		    }
		 return ErrorMsg2;
		    }
		
		 
		 
		 public boolean CommentSetName_EntertextField(String EnterText)
		 {
		 try{

		 	WebElement CommentSetNameWebEelement=new WebDriverWait(driver,5)
		 	.until(ExpectedConditions.visibilityOfElementLocated(CommentSetName_xpath));
		 	CommentSetNameWebEelement.clear();
		 	CommentSetNameWebEelement.sendKeys(EnterText);
		 	//////Thread.sleep(2000);
		
		 	return true;
		 }
		 catch(Exception ex){
		 	return false;
		 }

		 }
		 
		 public String ReportCommentAfterSave_ErrorMsg(String ReportCommentSave)
		    {
		    try{
		       WebElement SaveWebEelement=new WebDriverWait(driver,5)
		       .until(ExpectedConditions.visibilityOfElementLocated(ReportCommentSaveMsg_xpath));
		       
		      String actualMsg= SaveWebEelement.getText();
		      if(actualMsg.equalsIgnoreCase(ReportCommentSave))
		      {
		       return actualMsg;
		      }
		       
		    }
		    catch(Exception ex){
		     
		    }
		 return ReportCommentSave;
		    }	
		 
		 
		 public boolean  CommentSetName_clickOnHyperLink()
		 {
		 try{

		 	WebElement SaveBtnWebEelement=new WebDriverWait(driver,5)
		 	.until(ExpectedConditions.visibilityOfElementLocated(ClickOnHyperLink_xpath));
		 	SaveBtnWebEelement.click();
		 	//////Thread.sleep(2000);

		 	return true;
		 }
		 catch(Exception ex){
		 	return false;
		 }

		 }
		
		 public boolean  CommentSetName_clickOnAddComment()
		 {
		 try{

		 	WebElement SaveBtnWebEelement=new WebDriverWait(driver,5)
		 	.until(ExpectedConditions.visibilityOfElementLocated(clickOnAddComment_xpath));
		 	SaveBtnWebEelement.click();
		 	//////Thread.sleep(4000);

		 	return true;
		 }
		 catch(Exception ex){
		 	return false;
		 }

		 }
		 
		 
	 public boolean CommentSetName_AddComment_Entertext(String EnterData)
		 {
		 try{
		//	 WebElement iframeMsg = driver.findElement(By.xpath("//iframe[@class='cke_wysiwyg_frame cke_reset']"));        
		//	 driver.switchTo().frame(iframeMsg);
			 //////Thread.sleep(5000);
			 WebElement iframeMsg = driver.findElement(By.xpath("//iframe[contains(@title,'Rich Text Editor, new_notes')]")); 
			/* int size = driver.findElements(By.tagName("iframe")).size();
			 System.out.println(size);*/
		     driver.switchTo().frame(iframeMsg);
/*		 	WebElement CommentSetNameWebEelement=new WebDriverWait(driver,100)
		  	.until(ExpectedConditions.visibilityOfElementLocated(AddCommentEntertext_xpath));*/
		//iframeMsg.clear();
			 WebElement TextBox = driver.findElement(By.xpath("//body[@contenteditable='true']")); 
			 TextBox.sendKeys(EnterData);
		 	//////Thread.sleep(2000);
			driver.switchTo().parentFrame();

		
		 	return true;
		 }
		 catch(Exception ex){
			 ex.printStackTrace();
		 	return false ;
		 }
		 }

		
		 
		 
	
		 
	/*	 public boolean CommentSetName_AddComment_Entertext(String EnterData)
		 {
		 try{
			 WebElement iframe = (WebElement) driver.findElements(By.tagName("iframe"));
			 driver.switchTo().frame(iframe);
			 driver.getPageSource();
			 driver.switchTo().defaultContent();

 	WebElement CommentSetNameWebEelement=new WebDriverWait(driver,100)
		  	.until(ExpectedConditions.visibilityOfElementLocated(AddCommentEntertext_xpath));
		 	CommentSetNameWebEelement.clear();
		 	CommentSetNameWebEelement.sendKeys(EnterData);
		 	//////Thread.sleep(2000);
			driver.switchTo().parentFrame();

		
		 	return true;
		 }
		 catch(Exception ex){
		 	return false;
		 }

		 }*/
		 
		 
		 public boolean  CommentSetName_AddComment_clickOnSaveBtn()
		 {
		 try{

		 	WebElement SaveBtnWebEelement=new WebDriverWait(driver,5)
		 	.until(ExpectedConditions.visibilityOfElementLocated(AddCommentClickOnSaveBtn_xpath));
		 	SaveBtnWebEelement.click();
		 	
		 	//////Thread.sleep(2000);
		 	Alert alertOK = driver.switchTo().alert();
			alertOK.accept();
		 	return true;
		 }
		 catch(Exception ex){
		 	return false;
		 }

		 }
		 
		 
		 public String verifyMessageAfterSaveComment_SuccessMsg(String SuccessMsgComment)
		    {
		    try{
		       WebElement SaveWebEelement=new WebDriverWait(driver,5)
		       .until(ExpectedConditions.visibilityOfElementLocated(SuccessMsgAfterSaveComment_xpath));
		       
		      String actualMsg= SaveWebEelement.getText();
		      if(actualMsg.equalsIgnoreCase(SuccessMsgComment))
		      {
		       return actualMsg;
		      }
		       
		    }
		    catch(Exception ex){
		     
		    }
		 return SuccessMsgComment;
		    }
		
			
		 public boolean  CommentSetName_clickOnEditComment()
		 {
		 try{

		 	WebElement SaveBtnWebEelement=new WebDriverWait(driver,5)
		 	.until(ExpectedConditions.visibilityOfElementLocated(clickOnEditComment_xpath));
		 	SaveBtnWebEelement.click();

		 	return true;
		 }
		 catch(Exception ex){
		 	return false;
		 }

		 }
		 
		 public boolean  CommentSetName_AddComment_clickOnSaveBtnAftrEdit()
		 {
		 try{

		 	WebElement SaveBtnWebEelement=new WebDriverWait(driver,5)
		 	.until(ExpectedConditions.visibilityOfElementLocated(AddCommentClickOnSaveBtnAfterEdit_xpath));
		 	SaveBtnWebEelement.click();
		 	//////Thread.sleep(2000);

		 	return true;
		 }
		 catch(Exception ex){
		 	return false;
		 }

		 }
		 
		 public boolean  CommentSetName_clickOnDeleteComment()
		 {
		 try{

		 	WebElement SaveBtnWebEelement=new WebDriverWait(driver,5)
		 	.until(ExpectedConditions.visibilityOfElementLocated(clickOnDeleteComment_xpath));
		 	SaveBtnWebEelement.click();
		 	//////Thread.sleep(2000);

		 	return true;
		 }
		 catch(Exception ex){
		 	return false;
		 }

		 }
		 
		 public boolean  CommentSetName_clickOnCloseBtn()
		 {
		 try{

		 	WebElement SaveBtnWebEelement=new WebDriverWait(driver,5)
		 	.until(ExpectedConditions.visibilityOfElementLocated(clickOnCloseComment_xpath));
		 	SaveBtnWebEelement.click();

		 	return true;
		 }
		 catch(Exception ex){
		 	return false;
		 }

		 }
		 
		 public boolean  ManagementReport_clickBBCExecutiveTrendReport()
		 {
		 try{

		 	WebElement ManagementReportWebEelement=new WebDriverWait(driver,5)
		 	.until(ExpectedConditions.visibilityOfElementLocated(ClickBBCExecutiveTrendReport_xpath));
		 	ManagementReportWebEelement.click();
		 	//////Thread.sleep(500);

		 	return true;
		 }
		 catch(Exception ex){
		 	return false;
		 }

		 }
		 
		 public boolean  ManagementReport_clickOnGenerateBtn()
		 {
		 try{

		 	WebElement ManagementReportWebEelement=new WebDriverWait(driver,10)
		 	.until(ExpectedConditions.visibilityOfElementLocated(ClickOnGenerateBtn_xpath));
		 	ManagementReportWebEelement.click();
		 	
/*kruthivas*/
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
		 

		 public boolean back()
		 {
		 try{

		 	WebElement ManagementReportWebEelement=new WebDriverWait(driver,5)
		 	.until(ExpectedConditions.visibilityOfElementLocated(Back_xpath));
		 	ManagementReportWebEelement.click();
		 	//////Thread.sleep(500);

		 	return true;
		 }
		 catch(Exception ex){
		 	return false;
		 }

		 }	 
		 //Method to click on deklete

		 public boolean delete()
		 {
		 try{

		 	WebElement ManagementReportWebEelement=new WebDriverWait(driver,5)
		 	.until(ExpectedConditions.visibilityOfElementLocated(Delter_xpath));
		 	ManagementReportWebEelement.click();
		 	//////Thread.sleep(500);
		 	Alert alertOK = driver.switchTo().alert();
			alertOK.accept();
			this.isAlertPresent();
		 	return true;
		 }
		 catch(Exception ex){
		 	return false;
		 }

		 }	 
		 
		  
		 
}
