package com.cync.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.SkipException;

import com.cync.base.BasePage;
import com.cync.base.CyncMenus;

public class CommentTypesPage extends BasePage{
	

	private final By menuItem_xpath = By.id("hamburger_m");
	private final By administation_xpath =By.xpath("//span[text()='Administration']");
	private final By breadcrumb_xpath=By.xpath("//ul[@class='breadcrumb']");
	private final By CommentsTypePageSearch_xpath=By.xpath("//input[@placeholder='Search Here']");
	private final By addButton_xpath=By.xpath("//i[@title='Add New']");
	private final By edit_xpath=By.id("Edit");
	private final By deleteIcon_xpath=By.id("Delete");
	private final By export_xpath=By.xpath("//i[@title='Export']");
	private final By commentsTypeHeader=By.xpath("//h3[text()='Comments Type Summary']");
	private final By addHeader=By.xpath("//h3[text()='Comment Types - Add']");
	private final By addNameLabel=By.xpath("//label[text()='Name']");
	private final By addDescriptionLabel=By.xpath("//label[text()='Description']");
	private final By addNameField=By.xpath("//input[@formcontrolname='name']");
	private final By addDescriptionField=By.xpath("//input[@formcontrolname='description']");
	private final By addSaveButton=By.xpath("//span[text()='Save']");
	private final By addSaveandNewButton=By.xpath("//span[text()='Save & New']");
	private final By addCancelButton=By.xpath("//span[text()='Cancel']");
	private final By recordMessage_xpath=By.id("cync_notifications_msg");
	private final By nameColumnLabel_xpath=By.xpath("//span[text()='Name']");
	private final By descriptionColumnLabel_xpath=By.xpath("//span[text()='Description']");
	private final By exportHeader_xpath=By.xpath("//span[text()='Comments Type']");
	private final By nameLabelExport_xpath=By.xpath("//label[text()='Name']");
	private final By descriptionLabelExport_xpath=By.xpath("//label[text()='Description']");
	private final By nameCheckboxExport_xpath=By.xpath("(//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default ui-state-active'])[2]");
	private final By descriptionCheckboxExport_xpath=By.xpath("(//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default ui-state-active'])[3]");
	private final By exportButtonExport_xpath= By.xpath("(//span[@class='ui-chkbox-icon ui-clickable fa fa-check'])[2]");
	/*private final By exportCloseIcon_xpath=By.xpath("//a[@class='ng-tns-c4-2 ui-dialog-titlebar-icon ui-dialog-titlebar-close ui-corner-all ng-star-inserted']");*/
//	private final By commentFirstCheckbox_xpath=By.xpath("(//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default'])[2]");
	private final By commentFirstCheckbox_xpath=By.xpath("(//div[@class='ui-chkbox ui-widget']//descendant::div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default'])[2]");
	private final By commentSecondCheckbox_xpath=By.xpath("(//div[@class='ui-chkbox ui-widget']//descendant::div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default'])[3]");
//	private final By commentSecondCheckbox_xpath=By.xpath("(//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default'])[3]");
//	private final By commentSecondCheckbox_xpath=By.xpath("(//span[@class='ui-chkbox-icon ui-clickable'])[3]");

	private final By editHeader_xpath=By.xpath("//h3[text()='Comment Types - Edit']");
	private final By editNameLabel_xpath=By.xpath("//label[text()='Name']");
	private final By editDescriptionLabel_xpath=By.xpath("//label[text()='Description']");
	private final By editNameField_xpath=By.xpath("//input[@formcontrolname='name']");
	private final By editDescriptionField_xpath=By.xpath("//input[@formcontrolname='description']");
	private final By editSaveButton_xpath=By.xpath("//span[text()='Save']");
	private final By editCancelButton_xpath=By.xpath("//span[text()='Cancel']");
	private final By clickOnFirstRecord_xpath=By.xpath("(//span[@class='ui-cell-data ng-star-inserted'])[1]");
	private final By commentsTypeValidPageSearch_xpath=By.xpath("//span[@class='ui-cell-data ng-star-inserted']");
/*	private final By commentsTypeInvalidPageSearch_xpath=By.xpath("//span[@class='ng-star-inserted']");*/
	private final By commentsTypeInvalidPageSearch_xpath=By.xpath("//span[text()='No records found']");
	private final By searchFieldcrossIcon_xpath=By.xpath("//i[@class='fa fa-close ng-star-inserted']");	
	private final By nameSearch_xpath=By.xpath("(//input[@class='ui-column-filter ui-inputtext ui-widget ui-state-default ui-corner-all ng-star-inserted'])[1]");
	private final By descriptionSearch_xpath=By.xpath("(//input[@class='ui-column-filter ui-inputtext ui-widget ui-state-default ui-corner-all ng-star-inserted'])[2]");
	private final By deletepopuptriangle_xpath=By.xpath("//i[@class='fa fa-5x fa-exclamation-triangle clr_white f_s_64']");
	private final By deletepopupyes_xpath=By.xpath("//button[@id='modal_action_yes']");
	private final By deletepopupno_xpath=By.xpath("//button[@id='modal_action_no']");
//	private final By deletepopmsg_xpath=By.xpath("//p[text()='Are you sure you want to delete ' EDIT NAME FIELD DATA ' ?']");
	private final By deletepopmsg_xpath=By.xpath("//p[contains(text(),'Are you sure you want to delete')]");
	private final By masterSearch_xpath=By.xpath("//input[@id='searchInputId']");
	
	//Ashfaq
	private final By exportCloseIcon_xpath=By.xpath("(//a[@href='#'])[1]");
	
	
	public CommentTypesPage(WebDriver driver) {
		super(driver);
		/*try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(!driver.findElement(commentsTypeHeader).getText().trim().equals("Comments Type Summary")){
			throw new SkipException("comments types couldn't open.");
		}*/
	}
	
	
	public String commentstypeHeader(String commentsTypeHeaders)
	{
		
	try{
		
		WebElement PageSearchWebE=new WebDriverWait(driver,30)
			.until(ExpectedConditions.visibilityOfElementLocated(commentsTypeHeader));
		PageSearchWebE.getText();
		
	}
	catch(Exception ex){
		
	}
	return commentsTypeHeaders;
	}
	
	public String commentstypeHeaderPageRefresh(String commentsTypeHeaders)
	{
		
	try{
		driver.navigate().refresh();
		WebElement PageSearchWebE=new WebDriverWait(driver,30)
			.until(ExpectedConditions.visibilityOfElementLocated(commentsTypeHeader));
		PageSearchWebE.getText();
		
	}
	catch(Exception ex){
		
	}
	return commentsTypeHeaders;
	}
	
	public String breadcrumb(String commentsTypeBreadcrumb)
	{
		try{
			WebElement breadcrumbWebEelement=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(breadcrumb_xpath));
			breadcrumbWebEelement.isDisplayed();
			
		}
		catch(Exception ex){
			
		}
		return commentsTypeBreadcrumb;

		}
	
	public boolean pageSearchTextBoxUI(){
		try{
			WebElement PageSearchWebE=new WebDriverWait(driver,10)
				.until(ExpectedConditions.visibilityOfElementLocated(CommentsTypePageSearch_xpath));
			PageSearchWebE.isDisplayed();
			return true;
		}catch(Exception ex){
			return false;
		}
		
	}
	
	public boolean AddIconUI(){
		try {
			WebElement AddiconWebE=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(addButton_xpath));
			AddiconWebE.isDisplayed();
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
	
	public boolean EditIconUI(){
		try {
			WebElement EditIconWebE=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(edit_xpath));
			EditIconWebE.isDisplayed();
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
	
	public boolean DeleteIconUI(){
		try {
			WebElement DeleteIconWebE=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(deleteIcon_xpath));
			DeleteIconWebE.isDisplayed();
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
	
	public boolean ExportIconUI(){
		try {
			WebElement DeleteIconWebE=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(export_xpath));
			DeleteIconWebE.isDisplayed();
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
	
	public boolean NameColumnLabelUI(){
		try {
			WebElement NameColumnLabelWebE=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(nameColumnLabel_xpath));
			NameColumnLabelWebE.isDisplayed();
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
	
	public boolean DescriptionColumnLabelUI(){
		try {
			WebElement DescriptionColumnWebE=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(descriptionColumnLabel_xpath));
			DescriptionColumnWebE.isDisplayed();
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
	
	public boolean ClickOnAddButton()
	{
	try{
	//	System.out.println("before");
		Thread.sleep(5000);
		WebElement addButtonWebEelement=new WebDriverWait(driver,100)
		.until(ExpectedConditions.visibilityOfElementLocated(addButton_xpath));
	//	System.out.println("I am here");
		
		addButtonWebEelement.click();
		
   return true;
	}
	catch(Exception ex){
		return false;
	}

	}
	
	public String AddPageHeader(String addHeaderComments){
		try {
			WebElement AddPageHeaderWebE=new WebDriverWait(driver,30)
			.until(ExpectedConditions.visibilityOfElementLocated(addHeader));
			AddPageHeaderWebE.getText();
		} catch (Exception ex) {
			// TODO: handle exception
			
		}
		return addHeaderComments;
	}
	
	public boolean AddPageNameLabelUI(){
		try {
			WebElement AddNameLabelWebE=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(addNameLabel));
			AddNameLabelWebE.isDisplayed();
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
	
	public boolean AddPageDescriptionLabelUI(){
		try {
			WebElement AddPageDescriptionLabelWebE=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(addDescriptionLabel));
			AddPageDescriptionLabelWebE.isDisplayed();
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
	
	public boolean AddDescriptionFieldUI(){
		try {
			WebElement AddPageDescriptionLabelWebE=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(addDescriptionField));
			AddPageDescriptionLabelWebE.isDisplayed();
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
	
	public boolean AddNameFieldUI(){
		try {
			WebElement AddPageDescriptionLabelWebE=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(addNameField));
			AddPageDescriptionLabelWebE.isDisplayed();
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
	
	public boolean AddSaveButtonUI(){
		try {
			WebElement AddSaveButtonWebE=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(addSaveButton));
			AddSaveButtonWebE.isDisplayed();
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
	
	public boolean AddSaveandNewButtonClick(){
		try {
			WebElement AddSaveandNewButtonWebE=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(addSaveandNewButton));
			AddSaveandNewButtonWebE.click();
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
	
	public boolean AddSaveandNewButtonUI(){
		try {
			WebElement AddSaveandNewButtonWebE=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(addSaveandNewButton));
			AddSaveandNewButtonWebE.isDisplayed();
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
	
	public boolean AddCancelButtonUI(){
		try {
			WebElement AddCancelButtonWebE=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(addCancelButton));
			AddCancelButtonWebE.isDisplayed();
			
		} catch (Exception e) {
			return false;
		}
		return true;
	}
	
	public boolean AddSaveButtonClick(){
		try {
			WebElement AddSaveButtonWebE=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(addSaveButton));
			AddSaveButtonWebE.isDisplayed();
			AddSaveButtonWebE.click();
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	
	public boolean addNameFieldInput(String addNameFieldData){
		try {
			WebElement addPageDescriptionLabelWebE=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(addNameField));
			addPageDescriptionLabelWebE.clear();
			addPageDescriptionLabelWebE.sendKeys(addNameFieldData);
			
		} catch (Exception e) {
			return false;// TODO: handle exception
		}
		return true;
	}
	
	
	public boolean descriptionFieldInput(String addDescriptionFieldData){
		try {
			WebElement addPageDescriptionLabelWebE=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(addDescriptionField));
			addPageDescriptionLabelWebE.clear();
			addPageDescriptionLabelWebE.sendKeys(addDescriptionFieldData);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return false;
	}
	

/*	public  add(String addNameFieldData){
		try{
			this.descriptionFieldInput(addNameFieldData);
			this.addNameFieldInput(addNameFieldData);	
			new WebDriverWait(driver,10)
				.until(ExpectedConditions.visibilityOfElementLocated(addSaveandNewButton)).click();
			if(!driver.findElement(recordSuccessMessage_xpath).getText().substring(0, 22).equals("Record saved successfully.")){
				throw new SkipException("Record couldn't Save.");
			}
		}catch(Exception ex){
			
		}
		return null;
	}*/
	
	/*public  String add(String addNameFieldData, String addDescriptionFieldData, String qwerty){

			try{
				this.descriptionFieldInput(addDescriptionFieldData);
				this.addNameFieldInput(addNameFieldData);	
				new WebDriverWait(driver,10)
				.until(ExpectedConditions.visibilityOfElementLocated(addSaveandNewButton)).click();
				WebElement successfulMessageWebE=new WebDriverWait(driver,20)
					.until(ExpectedConditions.visibilityOfElementLocated(recordSuccessMessage_xpath));
				System.out.println("11111111111111111" +successfulMessageWebE.getText());
				if(!successfulMessageWebE.getText().equals(qwerty)){
					throw new SkipException("Record couldn't Save.");
				}
				
			}catch(Exception ex){
		}
			return qwerty;
	}*/
	
	public String verifyMessageOnAfterSave(String successMessageOnContent)
	   {
	   try{
	      WebElement SaveOnAddSalesWebEelement=new WebDriverWait(driver,10)
	      .until(ExpectedConditions.visibilityOfElementLocated(recordMessage_xpath));
	     String actualMsgFromAPP= SaveOnAddSalesWebEelement.getText();
	     Thread.sleep(1000);
	     if(actualMsgFromAPP.contains(successMessageOnContent))	   
	      
	    	 return actualMsgFromAPP;	    
	      
	   }
	   catch(Exception ex){
	    
	   }
	return successMessageOnContent;	   	   
	   }
	
	public boolean AddCancelButtonClick(){
		try {
			WebElement AddCancelButtonWebE=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(addCancelButton));
			AddCancelButtonWebE.click();
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
	
	public boolean ExportIconClick(){
		try {
			WebElement ExportIconClickWebE=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(export_xpath));
			Thread.sleep(5000);
			ExportIconClickWebE.click();
			
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
	
	public boolean exportPopUpHeaderUI(){
		try {
			WebElement exportPopUpHeaderWebE=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(exportHeader_xpath));
			exportPopUpHeaderWebE.isDisplayed();
			
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
	
	public boolean exportPopUpNameLabelUI(){
		try {
			WebElement exportPopUpNameLabelWebE=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(nameLabelExport_xpath));
			exportPopUpNameLabelWebE.isDisplayed();
			
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
	
	public boolean exportPopUpDescrpitonLabelUI(){
		try {
			WebElement exportPopUpDescrpitonLabelWebE=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(descriptionLabelExport_xpath));
			exportPopUpDescrpitonLabelWebE.isDisplayed();
			
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
	
	public boolean exportPopUpNameCheckboxUI(){
		try {
			WebElement exportPopUpNameCheckboxWebE=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(nameCheckboxExport_xpath));
			exportPopUpNameCheckboxWebE.isDisplayed();
			
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
	
	public boolean exportPopUpDescriptionCheckboxUI(){
		try {
			WebElement exportPopUpHeaderWebE=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(descriptionCheckboxExport_xpath));
			exportPopUpHeaderWebE.isDisplayed();
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
	
	public boolean exportPopUpExportButtonUI(){
		try {
			WebElement exportPopUpExportButtonUIWebE=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(exportButtonExport_xpath));
			exportPopUpExportButtonUIWebE.isDisplayed();
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
	
	public boolean exportPopUpCloseIconUI(){
		try {
			WebElement exportPopUpCloseIconUIWebE=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(exportCloseIcon_xpath));
			exportPopUpCloseIconUIWebE.isDisplayed();
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
	
	public boolean clickOnexportPopUpCloseIcon(){
		try {
			WebElement clickOnexportPopUpCloseIconWebE=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(exportCloseIcon_xpath));
			clickOnexportPopUpCloseIconWebE.click();
			
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
	
	public boolean selectexportPopUpNameCheckbox(boolean flag){
		   try {
		      WebDriverWait wait = new WebDriverWait(driver, 60);
		      
		      wait.until(ExpectedConditions.visibilityOfElementLocated((nameCheckboxExport_xpath)));
		      
		      WebElement element = driver.findElement((nameCheckboxExport_xpath));
		      if(flag){
		       if(!element.isSelected() == true){
		        element.click();
		        Thread.sleep(10000);
		       }
		      }else if(!flag){
		       if(element.isSelected() == true){
		        element.click();
		        Thread.sleep(10000);

		       }
		      }   
		     } catch (Exception e) {
		      System.out.println("Exception in clickOnCheckBox Method "+e.getCause());
		     }
		  return flag; 
		 }
	

	
	public boolean selectexportPopUpDescriptionCheckbox(boolean flag){
		   try {
		      WebDriverWait wait = new WebDriverWait(driver, 60);
		      
		      wait.until(ExpectedConditions.visibilityOfElementLocated((descriptionCheckboxExport_xpath)));
		      
		      WebElement element = driver.findElement((descriptionCheckboxExport_xpath));
		      if(flag){
		       if(!element.isSelected() == true){
		        element.click();
		        Thread.sleep(10000);
		       }
		      }else if(!flag){
		       if(element.isSelected() == true){
		        element.click();
		        Thread.sleep(10000);

		       }
		      }   
		     } catch (Exception e) {
		      System.out.println("Exception in clickOnCheckBox Method "+e.getCause());
		     }
		  return flag; 
		 }
	
	
	public boolean clickOnexportPopUpExportButton(){
		try {
			WebElement clickOnexportPopUpExportButtonWebE=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(exportButtonExport_xpath));
			clickOnexportPopUpExportButtonWebE.click();
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
	
	
	
	public boolean clickOnFirstCheckbox(){
	try {
		WebElement commentFirstCheckboxWebE=new WebDriverWait(driver,60)
		.until(ExpectedConditions.visibilityOfElementLocated(commentFirstCheckbox_xpath));
		commentFirstCheckboxWebE.click();
		Thread.sleep(5000);
		return true;
	} catch (Exception e) {
		// TODO: handle exception
		return false;
	}
}
	public boolean clickOnSecondCheckbox(){
		try {
			WebElement commentSecondCheckboxWebE=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(commentFirstCheckbox_xpath));
			commentSecondCheckboxWebE.click();
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
	
	
	public boolean clickOneditIcon(){
		try {
			WebElement clickOneditIconWebE=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(edit_xpath));
			clickOneditIconWebE.click();
			Thread.sleep(5000);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
	
	public String editPageHeader(String editpageheader){
		try {
			WebElement editPageHeaderWebE=new WebDriverWait(driver,60)
			.until(ExpectedConditions.visibilityOfElementLocated(editHeader_xpath));
			editPageHeaderWebE.getText();
		} catch (Exception e) {
			// TODO: handle exception
		
		}
		return editpageheader;
	}
	
	
	public boolean editNameLabel(){
		try {
			WebElement editNameLabelWebE=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(editNameLabel_xpath));
			editNameLabelWebE.isDisplayed();
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
	
	public boolean editDescriptionLabel(){
		try {
			WebElement editDescriptionLabelWebE=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(editDescriptionLabel_xpath));
			editDescriptionLabelWebE.isDisplayed();
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
	
	public boolean editNameField(){
		try {
			WebElement editNameFieldWebE=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(editNameField_xpath));
			editNameFieldWebE.isDisplayed();			
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
	
	public boolean editDescriptionField(){
		try {
			WebElement editDescriptionFieldWebE=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(editDescriptionField_xpath));
			editDescriptionFieldWebE.isDisplayed();
	
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
	
	public boolean editSaveButton(){
		try {
			WebElement editSaveButtonWebE=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(editSaveButton_xpath));
			editSaveButtonWebE.isDisplayed();
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
	
	public boolean editCancelButton(){
		try {
			WebElement editCancelButtonWebE=new WebDriverWait(driver,60)
			.until(ExpectedConditions.visibilityOfElementLocated(editCancelButton_xpath));
			editCancelButtonWebE.isDisplayed();
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
	
	public boolean editNameFieldInput(String editNameFieldData){
		try {
			WebElement editNameFieldInputWebE=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(editNameField_xpath));
			editNameFieldInputWebE.clear();
			editNameFieldInputWebE.sendKeys(editNameFieldData);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return false;
	}
	
	
	public boolean editdescriptionFieldInput(String editDescriptionFieldData){
		try {
			WebElement editdescriptionFieldInputWebE=new WebDriverWait(driver,30)
			.until(ExpectedConditions.visibilityOfElementLocated(editDescriptionField_xpath));
			editdescriptionFieldInputWebE.clear();
			editdescriptionFieldInputWebE.sendKeys(editDescriptionFieldData);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return false;
	}
	
	public boolean clickOneditSaveButton(){
		try {
			WebElement clickOneditSaveButtonWebE=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(editSaveButton_xpath));
			Thread.sleep(1000);
			clickOneditSaveButtonWebE.click();
		
		} catch (Exception e) {
			return false;
		}
		return true;
	}
	
	public boolean clickOneditCancelButton(){
		try {
			WebElement clickOneditCancelButtonWebE=new WebDriverWait(driver,60)
			.until(ExpectedConditions.visibilityOfElementLocated(editCancelButton_xpath));
			clickOneditCancelButtonWebE.click();
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
	
	public boolean clickOnFirstRecord(){
		try {
			Thread.sleep(1000);
			WebElement commentFirstRecordWebE=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(clickOnFirstRecord_xpath));
			commentFirstRecordWebE.click();
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
	
/*	public String invalidSerachedData(String dataOnPageSearch)
	 {
	     try{
	 WebElement commentsTypeSearchWebEelement=new WebDriverWait(driver,30)
	  .until(ExpectedConditions.visibilityOfElementLocated(commentsTypeInvalidPageSearch_xpath));
	 commentsTypeSearchWebEelement.getText();
	     }
	     catch(Exception ex){
	 
	     }
	     return dataOnPageSearch;

	 }*/
	
	public boolean invalidSerachedData()
	 {
	     try{
	 WebElement commentsTypeSearchWebEelement=new WebDriverWait(driver,30)
	  .until(ExpectedConditions.visibilityOfElementLocated(commentsTypeInvalidPageSearch_xpath));
	 return true;
	     }
	     catch(Exception ex){
	    	 return false;
	     }

	 }
	
	public boolean pageSearchTextBoxInput(String validdata){
		try{
			Thread.sleep(1000);
			WebElement pageSearchTextBoxInputWebE=new WebDriverWait(driver,30)
				.until(ExpectedConditions.visibilityOfElementLocated(CommentsTypePageSearch_xpath));
			pageSearchTextBoxInputWebE.clear();
			pageSearchTextBoxInputWebE.sendKeys(validdata);
			
		}catch(Exception ex){
			return false;
		}
		return true;
	}
	
	
	public String validPageSearchTextBox(String dataOnPageSearch){
		try{
			WebElement PageSearchWebE=new WebDriverWait(driver,30)
				.until(ExpectedConditions.visibilityOfElementLocated(commentsTypeValidPageSearch_xpath));
			PageSearchWebE.getText();
		}catch(Exception ex){
			
		}
		return dataOnPageSearch;
		
	}
	
	public boolean clickOnsearchcrossIcon(){
		try {
			WebElement clickOnsearchcrossIconWebE=new WebDriverWait(driver,30)
			.until(ExpectedConditions.visibilityOfElementLocated(searchFieldcrossIcon_xpath));
			clickOnsearchcrossIconWebE.click();
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
	
	public boolean nameSearchTextBoxInput(String validdata){
		try{
			WebElement nameSearchTextBoxInputWebE=new WebDriverWait(driver,30)
				.until(ExpectedConditions.visibilityOfElementLocated(nameSearch_xpath));
			nameSearchTextBoxInputWebE.clear();
			nameSearchTextBoxInputWebE.sendKeys(validdata);
			Thread.sleep(5000);
			
		}catch(Exception ex){
			return false;
		}
		return true;
	}
	
	public boolean descriptionSearchTextBoxInput(String validdata){
		try{
			WebElement descriptionSearchTextBoxInputWebE=new WebDriverWait(driver,30)
				.until(ExpectedConditions.visibilityOfElementLocated(descriptionSearch_xpath));
			descriptionSearchTextBoxInputWebE.clear();
			descriptionSearchTextBoxInputWebE.sendKeys(validdata);
			Thread.sleep(5000);
			return true;
		}catch(Exception ex){
			
		}
		return false;
	}
	
	public boolean clickOnDeleteIcon(){
		try {
			WebElement clickOnDeleteIconWebE=new WebDriverWait(driver,60)
			.until(ExpectedConditions.visibilityOfElementLocated(deleteIcon_xpath));
			clickOnDeleteIconWebE.click();
			Thread.sleep(5000);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
	
	public boolean deletepopuptriangleUI(){
		try {
			WebElement deletepopuptriangleUIWebE=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(deletepopuptriangle_xpath));
			deletepopuptriangleUIWebE.isDisplayed();
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
	
	
	public boolean deletepopupyesactionUI(){
		try {
			WebElement deletepopupyesactionUIWebE=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(deletepopupyes_xpath));
			deletepopupyesactionUIWebE.isDisplayed();
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
	
	public boolean deletepopupnoactionUI(){
		try {
			WebElement deletepopupnoactionUIWebE=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(deletepopupno_xpath));
			deletepopupnoactionUIWebE.isDisplayed();
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
	
	
	public boolean clickOndeletepopupyesaction(){
		try {
			WebElement clickOndeletepopupyesactionWebE=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(deletepopupyes_xpath));
			clickOndeletepopupyesactionWebE.click();
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
	
	public boolean clickOndeletepopupnoaction(){
		try {
			WebElement clickOndeletepopupnoactionWebE=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(deletepopupno_xpath));
			clickOndeletepopupnoactionWebE.click();
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
	
	public boolean deletepopupmsgUI(){
		try {
			WebElement deletepopupmsgUIWebE=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(deletepopmsg_xpath));
			deletepopupmsgUIWebE.isDisplayed();
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
	
	
	
	/*public boolean masterSearchUI(){
		try {
			WebElement masterSearchUIWebE=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(masterSearch_xpath));
			masterSearchUIWebE.isDisplayed();
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}*/
	
	
	}

		
	
	
