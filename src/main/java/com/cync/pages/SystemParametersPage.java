package com.cync.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.SkipException;

import com.cync.base.BasePage;

public class SystemParametersPage extends BasePage {

	
		private final By systemParametersHeader=By.xpath("//h3[text()='System Parameters Summary']");
		private final By systemParametersPageSearch_xpath=By.xpath("//input[@placeholder='Search Here']");
		private final By breadcrumb_xpath=By.xpath("//ul[@class='breadcrumb']");
		private final By nameColumnLabel_xpath=By.xpath("//span[text()='Name']");
		private final By descriptionColumnLabel_xpath=By.xpath("//span[text()='Description']");
		private final By parameterTypeLabel_xpath=By.xpath("//span[text()='Parameter Type']");
		private final By valueLabel_xpath=By.xpath("//span[text()='Value']");
		private final By export_xpath=By.xpath("//i[@id='Export']");
		private final By exportHeader_xpath=By.xpath("//span[text()='System Parameters']");
		private final By nameLabelExport_xpath=By.xpath("//label[text()='Name']");
		private final By descriptionLabelExport_xpath=By.xpath("//label[text()='Description']");
		private final By parameterTypeLabelExport_xpath=By.xpath("//label[text()='Parameter Type']");
		private final By valueLabelExport_xpath=By.xpath("//label[text()='Value']");
		private final By nameCheckboxExport_xpath=By.xpath("(//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default ui-state-active'])[2]");
		private final By descriptionCheckboxExport_xpath=By.xpath("(//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default ui-state-active'])[3]");
		private final By parameterTypeCheckboxExport_xpath=By.xpath("(//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default ui-state-active'])[4]");
		private final By valueCheckboxExport_xpath=By.xpath("(//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default ui-state-active'])[5]");
		private final By exportButtonExport_xpath= By.xpath("(//span[@class='ui-chkbox-icon ui-clickable fa fa-check'])[2]");
		
		//Ashfaq
		private final By exportCloseIcon_xpath=By.xpath("//span[text()='Export']");
		/*private final By exportCloseIcon_xpath=By.xpath("//a[@class='ng-tns-c4-2 ui-dialog-titlebar-icon ui-dialog-titlebar-close ui-corner-all ng-star-inserted']");*/
		//
		
		private final By systemParametersValidPageSearch_xpath=By.xpath("//span[@class='ui-cell-data ng-star-inserted']");
		private final By searchFieldcrossIcon_xpath=By.xpath("//i[@class='fa fa-close ng-star-inserted']");	
		private final By systemParametersInvalidPageSearch_xpath=By.xpath("//span[text()='No records found']");
		private final By nameSearch_xpath=By.xpath("(//input[@class='ui-column-filter ui-inputtext ui-widget ui-state-default ui-corner-all ng-star-inserted'])[1]");
		private final By descriptionSearch_xpath=By.xpath("(//input[@class='ui-column-filter ui-inputtext ui-widget ui-state-default ui-corner-all ng-star-inserted'])[3]");
		private final By parameterTypeSearch_xpath=By.xpath("(//input[@class='ui-column-filter ui-inputtext ui-widget ui-state-default ui-corner-all ng-star-inserted'])[2]");
		private final By valueSearch_xpath=By.xpath("(//input[@class='ui-column-filter ui-inputtext ui-widget ui-state-default ui-corner-all ng-star-inserted'])[4]");
		private final By valueEditIcon_xpath=By.xpath("(//i[@class='fa fa-pencil pad-left10'])[1]");
		private final By valueEditInput_xpath=By.xpath("//input[@class='ng-pristine ng-valid ng-touched']");
		private final By valueEditCancel_xpath=By.xpath("//i[@class='fa fa-times icon-red']");
		private final By valueEditConfirm_xpath=By.xpath("//i[@class='fa fa-check icon-green']");
		private final By recordMessage_xpath=By.id("cync_notifications_msg");
		
		/*Author -Garima*/
		private final By ClientSearchEdit_xpath=By.xpath("(//i[@class='fa fa-pencil pad-left10'])[3]");
		private final By ClientDisplayDropDown_xpath=By.xpath("//select[@class='ng-untouched ng-pristine ng-valid']");
		private final By selectClient_xpath = By.xpath("(//span[@class='ui-clickable fa fa-fw fa-caret-down'])[2]");
				
		private final By searchClientTextBox_xpath = By
				.xpath("//div[@class='ng-tns-c2-0 ui-dropdown ui-widget ui-state-default ui-corner-all ui-helper-clearfix']//span[@class='ui-clickable fa fa-fw fa-caret-down']");
		private final By searchClient_xpath = By
				.xpath("(//input[@class='ui-dropdown-filter ui-inputtext ui-widget ui-state-default ui-corner-all'])[2]");
		
	
	public SystemParametersPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(!driver.findElement(systemParametersHeader).getText().trim().equals("System Parameters Summary")){
			throw new SkipException("comments types couldn't open.");
		}
	}
	
	public String systemParametersHeader(String systemparameterHeader)
	{
		
	try{
		
		WebElement PageSearchWebE=new WebDriverWait(driver,30)
			.until(ExpectedConditions.visibilityOfElementLocated(systemParametersHeader));
		PageSearchWebE.getText();
		
	}
	catch(Exception ex){
		
	}
	return systemparameterHeader;
	}
	
	
	public String systemParametersPageRefresh(String commentsTypeHeaders)
	{
		
	try{
		driver.navigate().refresh();
		WebElement systemParametersPageRefreshWebE=new WebDriverWait(driver,30)
			.until(ExpectedConditions.visibilityOfElementLocated(systemParametersHeader));
		Thread.sleep(2000);
		
		String value=systemParametersPageRefreshWebE.getText().trim();
		
		if(value.contains(commentsTypeHeaders))
			return value;
		
	}
	catch(Exception ex){
		return null;
	}
	return commentsTypeHeaders;
	}
	
	
	public String breadcrumb(String systemParametersBreadcrumb)
	{
		try{
			WebElement systemParametersBreadcrumbWebEelement=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(breadcrumb_xpath));
			systemParametersBreadcrumbWebEelement.isDisplayed();
			
		}
		catch(Exception ex){
			
		}
		return systemParametersBreadcrumb;

		}
	
	public boolean pageSearchTextBoxUI(){
		try{
			WebElement PageSearchWebE=new WebDriverWait(driver,10)
				.until(ExpectedConditions.visibilityOfElementLocated(systemParametersPageSearch_xpath));
			PageSearchWebE.isDisplayed();
			return true;
		}catch(Exception ex){
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
	
	public boolean parameterTypeColumnLabelUI(){
		try {
			WebElement parameterTypeColumnLabelWebE=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(parameterTypeLabel_xpath));
			parameterTypeColumnLabelWebE.isDisplayed();
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
	
	public boolean valueColumnLabelUI(){
		try {
			WebElement valueColumnWebE=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(valueLabel_xpath));
			valueColumnWebE.isDisplayed();
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
	
	
	public boolean ExportIconUI(){
		try {
			WebElement ExportIconUIWebE=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(export_xpath));
			ExportIconUIWebE.isDisplayed();
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
			exportPopUpNameLabelWebE.click();
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
			exportPopUpDescrpitonLabelWebE.click();
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
	
	
	public boolean exportPopUpParameterTypeLabelUI(){
		try {
			WebElement exportPopUpParameterTypeLabelUIWebE=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(parameterTypeLabelExport_xpath));
			exportPopUpParameterTypeLabelUIWebE.click();
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
	
	public boolean exportPopUpValueLabelUI(){
		try {
			WebElement exportPopUpValueLabelWebE=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(valueLabelExport_xpath));
			exportPopUpValueLabelWebE.click();
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
			exportPopUpNameCheckboxWebE.click();
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
			exportPopUpHeaderWebE.click();
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
	
	public boolean exportPopUpParameterCheckboxUI(){
		try {
			WebElement exportPopUpParameterCheckboxWebE=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(parameterTypeCheckboxExport_xpath));
			exportPopUpParameterCheckboxWebE.click();
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
	
	public boolean exportPopUpValueCheckboxUI(){
		try {
			WebElement exportPopUpValueWebE=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(valueCheckboxExport_xpath));
			exportPopUpValueWebE.click();
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
			Thread.sleep(3000);
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
	
	
	public boolean selectexportPopUpValueCheckbox(boolean flag){
		   try {
		      WebDriverWait wait = new WebDriverWait(driver, 60);
		      
		      wait.until(ExpectedConditions.visibilityOfElementLocated((valueCheckboxExport_xpath)));
		      
		      WebElement element = driver.findElement((valueCheckboxExport_xpath));
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
	

	
	public boolean selectexportPopUpParameterTypeCheckbox(boolean flag){
		   try {
		      WebDriverWait wait = new WebDriverWait(driver, 60);
		      
		      wait.until(ExpectedConditions.visibilityOfElementLocated((parameterTypeCheckboxExport_xpath)));
		      
		      WebElement element = driver.findElement((parameterTypeCheckboxExport_xpath));
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
	
	public boolean pageSearchTextBoxInput(String validdata){
		try{
			WebElement pageSearchTextBoxInputWebE=new WebDriverWait(driver,30)
				.until(ExpectedConditions.visibilityOfElementLocated(systemParametersPageSearch_xpath));
			pageSearchTextBoxInputWebE.clear();
			pageSearchTextBoxInputWebE.sendKeys(validdata);
			return true;
		}catch(Exception ex){
			
		}
		return false;
	}
	
	public String validPageSearchTextBox(String dataOnPageSearch){
		try{
			WebElement PageSearchWebE=new WebDriverWait(driver,30)
				.until(ExpectedConditions.visibilityOfElementLocated(systemParametersValidPageSearch_xpath));
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
	
	public boolean invalidSearchedData()
	 {
	     try{
	 WebElement commentsTypeSearchWebEelement=new WebDriverWait(driver,30)
	  .until(ExpectedConditions.visibilityOfElementLocated(systemParametersInvalidPageSearch_xpath));
	 return true;
	     }
	     catch(Exception ex){
	    	 return false;
	     }

	 }
	public boolean nameSearchTextBoxInputUI(){
		try{
			WebElement nameSearchTextBoxInputUIWebE=new WebDriverWait(driver,30)
				.until(ExpectedConditions.visibilityOfElementLocated(nameSearch_xpath));
			nameSearchTextBoxInputUIWebE.isDisplayed();
			Thread.sleep(5000);
			return true;
		}catch(Exception ex){
			
		}
		return false;
	}
	
	public boolean descriptionSearchTextBoxUI(){
		try{
			WebElement descriptionSearchTextBoxUIWebE=new WebDriverWait(driver,30)
				.until(ExpectedConditions.visibilityOfElementLocated(descriptionSearch_xpath));
			descriptionSearchTextBoxUIWebE.isDisplayed();
			Thread.sleep(5000);
			return true;
		}catch(Exception ex){
			
		}
		return false;
	}
	
	public boolean parameterTypeSearchTextBoxUI(){
		try{
			WebElement parameterTypeSearchTextBoxUIWebE=new WebDriverWait(driver,30)
				.until(ExpectedConditions.visibilityOfElementLocated(parameterTypeSearch_xpath));
			parameterTypeSearchTextBoxUIWebE.isDisplayed();
			Thread.sleep(5000);
			return true;
		}catch(Exception ex){
			
		}
		return false;
	}
	
	public boolean valueSearchTextBoxUI(){
		try{
			WebElement valueSearchTextBoxUIWebE=new WebDriverWait(driver,30)
				.until(ExpectedConditions.visibilityOfElementLocated(valueSearch_xpath));
			valueSearchTextBoxUIWebE.isDisplayed();
			Thread.sleep(5000);
			return true;
		}catch(Exception ex){
			
		}
		return false;
	}
	public boolean nameSearchTextBoxInput(String validdata){
		try{
			WebElement nameSearchTextBoxInputWebE=new WebDriverWait(driver,30)
				.until(ExpectedConditions.visibilityOfElementLocated(nameSearch_xpath));
			nameSearchTextBoxInputWebE.clear();
			nameSearchTextBoxInputWebE.sendKeys(validdata);
			Thread.sleep(5000);
			return true;
		}catch(Exception ex){
			
		}
		return false;
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
	
	public boolean parameterTypeSearchTextBoxInput(String validdata){
		try{
			WebElement parameterTypeSearchTextBoxInputWebE=new WebDriverWait(driver,30)
				.until(ExpectedConditions.visibilityOfElementLocated(parameterTypeSearch_xpath));
			parameterTypeSearchTextBoxInputWebE.clear();
			parameterTypeSearchTextBoxInputWebE.sendKeys(validdata);
			Thread.sleep(5000);
			return true;
		}catch(Exception ex){
			
		}
		return false;
	}
	
	public boolean valueSearchTextBoxInput(String validdata){
		try{
			WebElement valueSearchTextBoxInputWebE=new WebDriverWait(driver,30)
				.until(ExpectedConditions.visibilityOfElementLocated(valueSearch_xpath));
			valueSearchTextBoxInputWebE.clear();
			valueSearchTextBoxInputWebE.sendKeys(validdata);
			Thread.sleep(5000);
			return true;
		}catch(Exception ex){
			
		}
		return false;
	}
	
	public boolean valueEditIconUI(){
		try{
			WebElement valueEditIconUIWebE=new WebDriverWait(driver,30)
				.until(ExpectedConditions.visibilityOfElementLocated(valueEditIcon_xpath));
			valueEditIconUIWebE.isDisplayed();
			Thread.sleep(5000);
			return true;
		}catch(Exception ex){
			return false;
		}
	}
	
	
	public boolean valueEditIconClick(){
		try{
			WebElement valueEditIconClickWebE=new WebDriverWait(driver,30)
				.until(ExpectedConditions.visibilityOfElementLocated(valueEditIcon_xpath));
			valueEditIconClickWebE.click();
			Thread.sleep(5000);
			return true;
		}catch(Exception ex){
			return false;
		}
		
	}
	
	
	public boolean valueEditInputFieldUI(){
		try{
			WebElement valueEditInputFieldUIWebE=new WebDriverWait(driver,30)
				.until(ExpectedConditions.visibilityOfElementLocated(valueEditInput_xpath));
			valueEditInputFieldUIWebE.isDisplayed();
			Thread.sleep(5000);
			return true;
		}catch(Exception ex){
			return false;
		}

	}
	
	public boolean valueEditCancelIconUI(){
		try{
			WebElement valueEditCancelIconUIWebE=new WebDriverWait(driver,30)
				.until(ExpectedConditions.visibilityOfElementLocated(valueEditCancel_xpath));
			Thread.sleep(5000);
			valueEditCancelIconUIWebE.isDisplayed();

			return true;
		}catch(Exception ex){
			return false;
		}
		
	}
	
	public boolean valueEditConfirmIconUI(){
		try{
			WebElement valueEditConfirmIconUIWebE=new WebDriverWait(driver,30)
				.until(ExpectedConditions.visibilityOfElementLocated(valueEditConfirm_xpath));
			Thread.sleep(5000);
			valueEditConfirmIconUIWebE.isDisplayed();
			
			return true;
		}catch(Exception ex){
			return false;
		}
		
	}
	
	
	public boolean valueEditInput(String validdata){
		try{
			WebElement valueEditInputWebE=new WebDriverWait(driver,30)
				.until(ExpectedConditions.visibilityOfElementLocated(valueEditInput_xpath));
			Thread.sleep(2000);
			valueEditInputWebE.click();
			valueEditInputWebE.clear();
			valueEditInputWebE.sendKeys(validdata);
			Thread.sleep(1000);
			
		}catch(Exception ex){
			return false;
		}
		return true;
	}
	
	public boolean valueEditCancelIconClick(){
		try{
			WebElement valueEditCancelIconClickWebE=new WebDriverWait(driver,30)
				.until(ExpectedConditions.visibilityOfElementLocated(valueEditCancel_xpath));
			valueEditCancelIconClickWebE.click();
			Thread.sleep(5000);
			return true;
		}catch(Exception ex){
			
		}
		return false;
	}
	
	public boolean valueEditConfirmIconClick(){
		try{
			WebElement valueEditConfirmIconClickWebE=new WebDriverWait(driver,30)
				.until(ExpectedConditions.visibilityOfElementLocated(valueEditConfirm_xpath));
			valueEditConfirmIconClickWebE.click();
			Thread.sleep(5000);
			return true;
		}catch(Exception ex){
			
		}
		return false;
	}
	
	public String verifyMessageOnAfterSave(String successMessageOnContent)
	   {
	   try{
	      WebElement SaveOnAddSalesWebEelement=new WebDriverWait(driver,10)
	      .until(ExpectedConditions.visibilityOfElementLocated(recordMessage_xpath));
	     String actualMsgFromAPP= SaveOnAddSalesWebEelement.getText();
	     if(actualMsgFromAPP.equalsIgnoreCase(successMessageOnContent))
	     {
	      return actualMsgFromAPP;
	     }
	      
	   }
	   catch(Exception ex){
	    
	   }
	return successMessageOnContent;
	   }
	
	/*Author-Garima*/
	
	//Method to Click on Client Display Edit
	
		public boolean clickOnClientDisplayEdit(){
			try
			{
				WebElement savebutton=new WebDriverWait(driver,100)
				.until(ExpectedConditions.elementToBeClickable(ClientSearchEdit_xpath));
				savebutton.click();
				
				
				return true;
			}
			catch(Exception e)
			{
				return false;
			}
		}
		
	//Method to Click on Drop down
		public   String  clickOnDropDown(String value){
			try {
				WebElement productTypeDropdownWebEelement = new WebDriverWait(
						driver, 10).until(ExpectedConditions
						.visibilityOfElementLocated(ClientDisplayDropDown_xpath));
				
				productTypeDropdownWebEelement.click();
				productTypeDropdownWebEelement.sendKeys(value);
				Thread.sleep(3000);
				Select sel = new Select(productTypeDropdownWebEelement);
				java.util.List<WebElement> options = sel.getOptions();
				for (int i=0;i<=options.size();i++) 
				{
						String values=options.get(i).getText();
						System.out.println(values);
						
					}
				
			} catch (Exception ex) {
		
			}
			return value;
		}
		

		/*//Method to Click on drop down
		public boolean selectClientFromDropdown(String ClientData) {
			try {
				this.SelectClientFunction();
				this.addValueToSearch(ClientData);
				this.SearchClientClick();

				Thread.sleep(5000);

				return true;
			} catch (Exception ex) {
				return false;
			}

		}*/
		public boolean selectClientFunction() {
			try {
				Thread.sleep(10000);
				WebElement selectClientWebEelement = new WebDriverWait(driver, 100)
						.until(ExpectedConditions
								.visibilityOfElementLocated(searchClientTextBox_xpath));
				selectClientWebEelement.click();

				return true;
			} catch (Exception ex) {
				return false;
			}

		}
		public String addValueToSearch(String ClientData) {
			try {
				WebElement addValueToSearch = new WebDriverWait(
						driver, 200).until(ExpectedConditions
						.visibilityOfElementLocated(searchClient_xpath));
				
				addValueToSearch.sendKeys(ClientData);
			System.out.println(ClientData);

			} catch (Exception ex) {

			}
			return ClientData;

		}
	
	
}
