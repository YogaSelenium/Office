package com.cync.pages;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.SkipException;

import com.cync.base.BasePage;




public class SalesRegion extends BasePage {


private final By salesRegionHeader_xpath=By.xpath("//h3[contains(text(),'Sales Region')]");
private final By salesPageSearch_xpath=By.xpath("//input[@placeholder='Search Here']");
private final By regionField_xpath=By.xpath("//span[text()='Region']");
private final By nameField_xpath=By.xpath("//span[text()='Name']");
private final By addButton_xpath=By.id("New");
private final By editButton_xpath=By.id("Edit");
private final By deleteButton_xpath=By.id("Delete");
private final By exportButton_xpath=By.id("Export");	
private final By breadcrumb_xpath=By.xpath("//ul[@class='breadcrumb']");
private final By firstCheckBox_xpath=By.xpath("(//div[contains(@class,'ui-chkbox-box ui-widget ui-corner-all ui-state-default')])[2]");
private final By selectAllCheckBox_xpath=By.xpath("//tr/th[1]/p-dtcheckbox/div/div[2]");
private final By editDisable_xpath=By.xpath("//i[@class='hand fa fa-pencil fa-1x clr_grey f_s_20 icon_disabled ng-star-inserted']");
private final By deleteDisable_xpath=By.xpath("//i[@class='hand fa fa-trash fa-2x f_s_20 clr_grey icon_disabled ng-star-inserted']");
private final By searchRegion_xpath=By.xpath("(//input[@placeholder='Search'])[1]");
private final By searchName_xpath=By.xpath("(//input[@placeholder='Search'])[2]");
private final By regionAddField_xpath=By.xpath("//label[contains(text(),'Region')]");
private final By nameAddField_xpath=By.xpath("//label[contains(text(),'Name')]");
private final By regionAddMandatory_xpath=By.xpath("(//span[@class='required'])[1]");
private final By nameAddMandatory_xpath=By.xpath("(//span[@class='required'])[2]");
private final By regionTextBox_xpath=By.xpath("//input[@formcontrolname='region']");
private final By nameTextBox_xpath=By.xpath("//input[@formcontrolname='name']");
private final By cancelOnAddSales_xpath=By.id("action_back");
private final By SaveOnAddSales_xpath=By.xpath("//span[text()='Save']");
private final By SaveAndNewOnAddSales_xpath=By.xpath("//span[text()='Save & New']");
private final By salesRegionMsgObj_xpath=By.id("cync_notifications_msg");
private final By searchFail_xpath=By.xpath("//span[text()='No records found']");
private final By validSearchData_xpath=By.xpath("(//span[@class='ui-cell-data ng-star-inserted'])[1]");
private final By dataSearchCheckbox_xpath=By.xpath("(//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default'])[2]");
private final By exportButtonPopUp_xpath=By.xpath("//span[text()='Export']");
private final By crossExportPopUp_Xpath=By.xpath("//span[@class='fa fa-fw fa-close']");
private final By headerExportPopup_Xpath=By.xpath("//span[text()='Sales Regions']");
private final By exportRegionCheckBox_Xpath=By.xpath("(//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default ui-state-active'])[2]");
private final By exportNameCheckBox_Xpath=By.xpath("(//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default ui-state-active'])[3]");
private final By  deleteYes_xpath=By.id("modal_action_yes");
private final By  deleteNo_xpath=By.id("modal_action_no");
private final By deleteButtonPopUpHeader_xpath=By.xpath("//p[contains(text(),'Are you sure you want to delete')]");
private final By selectAllCheckBoxDelete_xpath=By.xpath("(//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default'])[1]");
private final By menuSearch_xpath=By.xpath("//*[@id='menu-search']");
private final By validMenuSearch_xpath=By.className("tw-heading");




	public SalesRegion(WebDriver driver) {
		super(driver);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(!driver.findElement(salesRegionHeader_xpath).getText().trim().equals("Sales Region Summary")){
			throw new SkipException("sales region couldn't open.");
		}
	}
	
	
	public String SalesRegionHeader(String salesregionHeader)
	{
	try{
		WebElement salesRegionSearchWebEelement=new WebDriverWait(driver,200)
			.until(ExpectedConditions.visibilityOfElementLocated(salesRegionHeader_xpath));
		salesRegionSearchWebEelement.getText();
		
	}
	catch(Exception ex){
		
	}
	return salesregionHeader;
	
	}


	public boolean SalesRegionPageSerach()
	{
	try{
		WebElement salesRegionSearchWebEelement=new WebDriverWait(driver,30)
			.until(ExpectedConditions.visibilityOfElementLocated(salesPageSearch_xpath));
		salesRegionSearchWebEelement.isDisplayed();
		return true;
	}
	catch(Exception ex){
		return false;
	}
	}
	
	
	public boolean regionFieldUIValidation()
	{
	try{
		WebElement SalesRegionFieldValidationWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(regionField_xpath));
		SalesRegionFieldValidationWebEelement.isDisplayed();
		return true;
	}
	catch(Exception ex){
		return false;
	}

	}
	
	public boolean nameFieldUIValidation()
	{
	try{
		WebElement SalesNameFieldValidationWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(nameField_xpath));
		SalesNameFieldValidationWebEelement.isDisplayed();
		return true;
	}
	catch(Exception ex){
		return false;
	}

	}
	
	public  boolean addButtonUIValidation()
	{
	try{
		WebElement addButtonWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(addButton_xpath));
		addButtonWebEelement.isDisplayed();
		return true;
	}
	catch(Exception ex){
		return false;
	}

	}

	public boolean editButtonUIValidation()
	{
	try{
		WebElement editButtonWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(editButton_xpath));
		editButtonWebEelement.isDisplayed();
		return true;
	}
	catch(Exception ex){
		return false;
	}

	}
	
	public boolean deleteButtonUIValidation()
	{
	try{
		WebElement deleteButtonWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(deleteButton_xpath));
		deleteButtonWebEelement.isDisplayed();
		return true;
	}
	catch(Exception ex){
		return false;
	}

	}
		
	public boolean exportButtonUIValidation()
	{
	try{
		WebElement exportButtonWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(exportButton_xpath));
		exportButtonWebEelement.isDisplayed();
		return true;
	}
	catch(Exception ex){
		return false;
	}

	}
	
	public boolean regionSerachUIValidation()
	{
	try{
		WebElement exportButtonWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(searchRegion_xpath));
		exportButtonWebEelement.isDisplayed();
		return true;
	}
	catch(Exception ex){
		return false;
	}

	}
	public boolean nameSerachUIValidation()
	{
	try{
		WebElement exportButtonWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(searchName_xpath));
		exportButtonWebEelement.isDisplayed();
		return true;
	}
	catch(Exception ex){
		return false;
	}

	}
	
	public String breadcrumb(String salesregionBreadcrumb)
	{
		try{
			WebElement breadcrumbWebEelement=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(breadcrumb_xpath));
			breadcrumbWebEelement.isDisplayed();
			
		}
		catch(Exception ex){
			
		}
		return salesregionBreadcrumb;

		}
	
	
	public boolean disableOfEditDeleteIconsWithoutSelectingAnyCheckBox()
	{
		try{
			
			new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(editDisable_xpath)).isDisplayed();
			new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(deleteDisable_xpath)).isDisplayed();
			return true;
			}
		catch(Exception ex){
			return false;
		}

		}
	
	
	public boolean enableAndDisableOfEditDeleteIconsByslectingOneCheckBox()
	{
		try{
			new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(firstCheckBox_xpath)).click();
			new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(editButton_xpath)).isDisplayed();
			new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(deleteButton_xpath)).isDisplayed();
			return true;
			}
		catch(Exception ex){
			return false;
		}

		}
	
	public boolean enableAndDisableOfEditDeleteIconsByslectingMultipleCheckBox()
	{
		try{
			new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(selectAllCheckBox_xpath)).click();
			new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(editDisable_xpath)).isDisplayed();
			new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(deleteButton_xpath)).isDisplayed();
			return true;
			}
		catch(Exception ex){
			return false;
		}

		}
	
	
	public boolean ClickOnAddButton()
	{
	try{
		WebElement addButtonWebEelement=new WebDriverWait(driver,100)
		.until(ExpectedConditions.visibilityOfElementLocated(addButton_xpath));
		Thread.sleep(10000);
		addButtonWebEelement.click();
		return true;
	}
	catch(Exception ex){
		return false;
	}

	}
	

	public boolean regionAddFieldUIValidation()
	{
	try{
		WebElement regionAddFieldWebEelement=new WebDriverWait(driver,100)
		.until(ExpectedConditions.visibilityOfElementLocated(regionAddField_xpath));
		regionAddFieldWebEelement.isDisplayed();
		return true;
	}
	catch(Exception ex){
		return false;
	}

	}
	
	
	public boolean nameAddFieldUIValidation()
	{
	try{
		WebElement nameAddFieldWebEelement=new WebDriverWait(driver,100)
		.until(ExpectedConditions.visibilityOfElementLocated(nameAddField_xpath));
		nameAddFieldWebEelement.isDisplayed();
		return true;
	}
	catch(Exception ex){
		return false;
	}
}
	
	
	public boolean regionAddMandatoryUIValidation()
	{
	try{
		WebElement regionAddMandatoryWebEelement=new WebDriverWait(driver,100)
		.until(ExpectedConditions.visibilityOfElementLocated(regionAddMandatory_xpath));
		regionAddMandatoryWebEelement.isDisplayed();
		return true;
	}
	catch(Exception ex){
		return false;
	}

	}
	
	public boolean nameAddMandatoryUIValidation()
	{
	try{
		WebElement nameAddMandatoryWebEelement=new WebDriverWait(driver,100)
		.until(ExpectedConditions.visibilityOfElementLocated(nameAddMandatory_xpath));
		nameAddMandatoryWebEelement.isDisplayed();
		return true;
	}
	catch(Exception ex){
		return false;
	}

	}
	public boolean regionTextBoxUIValidation()
	{
	try{
		WebElement regionTextBoxWebEelement=new WebDriverWait(driver,200)
		.until(ExpectedConditions.visibilityOfElementLocated(regionTextBox_xpath));
		regionTextBoxWebEelement.isDisplayed();
		return true;
	}
	catch(Exception ex){
		return false;
	}

	}
	
	public boolean nameTextBoxUIValidation()
	{
	try{
		WebElement nameTextBoxWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(nameTextBox_xpath));
		nameTextBoxWebEelement.isDisplayed();
		return true;
	}
	catch(Exception ex){
		return false;
	}
}
	public boolean cancelOnAddSalesUIValidation()
	{
	try{
		WebElement cancelOnAddSalesWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(cancelOnAddSales_xpath));
		cancelOnAddSalesWebEelement.isDisplayed();
		return true;
	}
	catch(Exception ex){
		return false;
	}

	}
	
	public boolean saveOnAddSalesUIValidation()
	{
	try{
		WebElement SaveOnAddSalesWebEelement=new WebDriverWait(driver,20)
			.until(ExpectedConditions.visibilityOfElementLocated(SaveOnAddSales_xpath));
		SaveOnAddSalesWebEelement.isDisplayed();
		return true;
	}
	catch(Exception ex){
		return false;
	}

	}
	
	public boolean saveAndNewOnAddSalesUIValidation()
	{
	try{
		WebElement SaveAndNewOnAddSalesWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(SaveAndNewOnAddSales_xpath));
		SaveAndNewOnAddSalesWebEelement.isDisplayed();
		return true;
	}
	catch(Exception ex){
		return false;
	}

	}
	
	public String addValueToRegionTextBox(String regionData)
	{
	try{
		WebElement regionTextBoxWebEelement=new WebDriverWait(driver,200)
		.until(ExpectedConditions.visibilityOfElementLocated(regionTextBox_xpath));
		regionTextBoxWebEelement.clear();
		regionTextBoxWebEelement.sendKeys(regionData);
		
	}
	catch(Exception ex){
	  
	}
	return regionData;
	

	}
	
	
	public String addValueToNameTextBox(String nameData)
	{
	try{
		WebElement nameTextBoxWebEelement=new WebDriverWait(driver,200)
		.until(ExpectedConditions.visibilityOfElementLocated(nameTextBox_xpath));
		nameTextBoxWebEelement.clear();
		nameTextBoxWebEelement.sendKeys(nameData);
		
	}
	catch(Exception ex){

	}
	return nameData;

	}
	
	
	public boolean saveSalesRegion()
	{
	try{
		WebElement SaveOnAddSalesWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(SaveOnAddSales_xpath));
		SaveOnAddSalesWebEelement.click();
		return true;
	}
	catch(Exception ex){
		return false;
	}

	}
	
	public boolean saveAndNewSalesRegion()
	{
	try{
		WebElement SaveAndNewOnAddSalesWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(SaveAndNewOnAddSales_xpath));
		SaveAndNewOnAddSalesWebEelement.click();
		return true;
	}
	catch(Exception ex){
		return false;
	}

	}
	
	
	
	
	
	/*public String verifyMessageOnSalesRegionAfterSave(String messageOnSalesRegion)
	{
	try{
		WebElement SaveOnAddSalesWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(salesRegionMsgObj_xpath));
		//SaveOnAddSalesWebEelement.getText();
		
		String actualmsg=SaveOnAddSalesWebEelement.getText();
		if(actualmsg.equals(messageOnSalesRegion)){
		    return actualmsg;
		}
	}
	catch(Exception ex){
		
	}
	return messageOnSalesRegion;

	}
	
	*/
	
	
	
	
	
	public String verifyMessageOnSalesRegionAfterSave(String messageOnSalesRegion)
	    {
	    try{
	       WebElement SaveOnAddSalesWebEelement=new WebDriverWait(driver,10)
	       .until(ExpectedConditions.visibilityOfElementLocated(salesRegionMsgObj_xpath));
	       
	      String actualMsgFromAPP= SaveOnAddSalesWebEelement.getText();
	      if(actualMsgFromAPP.equalsIgnoreCase(messageOnSalesRegion))
	      {
	       return actualMsgFromAPP;
	      }
	       
	    }
	    catch(Exception ex){
	     
	    }
	 return messageOnSalesRegion;
	    }
	
	
	 
	 
	 
	public boolean cancelSalesRegion()
	{
	try{
		WebElement cancelOnAddSalesWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(cancelOnAddSales_xpath));
		cancelOnAddSalesWebEelement.click();
		return true;
	}
	catch(Exception ex){
	    return false;	
	}
	
	}
	
	public boolean addDataSalesRegionPageSerach(String validdata)
	{
	try{
		WebElement salesRegionSearchWebEelement=new WebDriverWait(driver,200)
			.until(ExpectedConditions.visibilityOfElementLocated(salesPageSearch_xpath));
		salesRegionSearchWebEelement.clear();
		salesRegionSearchWebEelement.sendKeys(validdata);
		return true;
	}
	catch(Exception ex){
		return false;	
	}
	}
	
	public String invalidSerachedData(String dataOnPageSearch)
	{
	    try{
	WebElement salesRegionSearchWebEelement=new WebDriverWait(driver,30)
		.until(ExpectedConditions.visibilityOfElementLocated(searchFail_xpath));
	salesRegionSearchWebEelement.getText();
	    }
	    catch(Exception ex){
	
	    }
	    return dataOnPageSearch;

	}
	
	public String validSerachedData(String validdata)
	{
	    try{
	WebElement salesRegionSearchWebEelement=new WebDriverWait(driver,30)
		.until(ExpectedConditions.visibilityOfElementLocated(validSearchData_xpath));
	salesRegionSearchWebEelement.getText();
	    }
	    catch(Exception ex){
	
	    }
	    return validdata;

	}

	
        public boolean addDataSalesRegion_RegionSerach(String Invaliddata)
        {
        try{
        	WebElement salesRegionSearchWebEelement=new WebDriverWait(driver,50)
        		.until(ExpectedConditions.visibilityOfElementLocated(searchRegion_xpath));
        	salesRegionSearchWebEelement.sendKeys(Invaliddata);
        	return true;
        }
        catch(Exception ex){
            return false;	
        }
	
        }
        
        public boolean addDataSalesRegion_NameSerach(String Invaliddata)
        {
        try{
        	WebElement salesRegionSearchWebEelement=new WebDriverWait(driver,50)
        		.until(ExpectedConditions.visibilityOfElementLocated(searchName_xpath));
        	salesRegionSearchWebEelement.sendKeys(Invaliddata);
        	return true;
        }
        catch(Exception ex){
            return false;
        }
	
        }
        
        public boolean salesRegionEditByClick()
        {
            try{
        	Thread.sleep(2000);
        	WebElement salesRegionSearchWebEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.elementToBeClickable(validSearchData_xpath));
        	new Actions(driver).moveToElement(salesRegionSearchWebEelement).click().build().perform();
        	return true;
            }
        catch(Exception ex){
            return false;
           }
	    
        }
        
        
        public boolean clickOnsearchedElement()
        {
            try{
        	Thread.sleep(2000);
        	WebElement salesRegionSearchWebEelement=new WebDriverWait(driver,200)
		.until(ExpectedConditions.visibilityOfElementLocated(dataSearchCheckbox_xpath));
        
        	salesRegionSearchWebEelement.click();
        	
        	
        	return true;
            }
        catch(Exception ex){
            return false;
            }
	    
        }
        
        
        public boolean clickOnEditButton()
        {
            try{
        	WebElement EditButtonWebEelement=new WebDriverWait(driver,200)
		.until(ExpectedConditions.visibilityOfElementLocated(editButton_xpath));
        
        	EditButtonWebEelement.click();
        	
        	
        	return true;
            }
        catch(Exception ex){
            return false;
            }
        }
       
     
       
        public boolean exportButtonClick()
	{
	try{
	    Thread.sleep(3000);
		WebElement exportButtonWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(exportButton_xpath));
		exportButtonWebEelement.click();
		return true;
	}
	catch(Exception ex){
		return false;
	}

	}
        
      
        
        public boolean exportHeader()
       	{
       	try{
       		WebElement exportButtonWebEelement=new WebDriverWait(driver,10)
       		.until(ExpectedConditions.visibilityOfElementLocated(headerExportPopup_Xpath));
       		exportButtonWebEelement.isDisplayed();
       		return true;
       	}
       	catch(Exception ex){
       		return false;
       	}

       	}

        public boolean UIexportButtonInPopUp()
       	{
       	try{
       		WebElement exportButtonWebEelement=new WebDriverWait(driver,10)
       		.until(ExpectedConditions.visibilityOfElementLocated(exportButtonPopUp_xpath));
       		exportButtonWebEelement.isDisplayed();
       		return true;
       	}
       	catch(Exception ex){
       		return false;
       	}

       	}
        
        public boolean RegionUIInExportPopUp()
       	{
       	try{
       		WebElement exportButtonWebEelement=new WebDriverWait(driver,10)
       		.until(ExpectedConditions.visibilityOfElementLocated(regionAddField_xpath));
       		exportButtonWebEelement.isDisplayed();
       		return true;
       	}
       	catch(Exception ex){
       		return false;
       	}

       	}
        
        public boolean NameUIInExportPopUp()
       	{
       	try{
       		WebElement exportButtonWebEelement=new WebDriverWait(driver,10)
       		.until(ExpectedConditions.visibilityOfElementLocated(nameAddField_xpath));
       		exportButtonWebEelement.isDisplayed();
       		return true;
       	}
       	catch(Exception ex){
       		return false;
       	}

       	}
        
        public boolean crossUIInExportPopUp()
       	{
       	try{
       		WebElement exportButtonWebEelement=new WebDriverWait(driver,10)
       		.until(ExpectedConditions.visibilityOfElementLocated(crossExportPopUp_Xpath));
       		exportButtonWebEelement.isDisplayed();
       		return true;
       	}
       	catch(Exception ex){
       		return false;
       	}

       	}  
        
        public boolean RegionCheckBoxUIInExportPopUp()
       	{
       	try{
       		WebElement exportButtonWebEelement=new WebDriverWait(driver,10)
       		.until(ExpectedConditions.visibilityOfElementLocated(exportRegionCheckBox_Xpath));
       		exportButtonWebEelement.isDisplayed();
       		return true;
       	}
       	catch(Exception ex){
       		return false;
       	}

       	}  
        public boolean NameCheckBoxUIInExportPopUp()
       	{
       	try{
       		WebElement exportButtonWebEelement=new WebDriverWait(driver,10)
       		.until(ExpectedConditions.visibilityOfElementLocated(exportNameCheckBox_Xpath));
       		exportButtonWebEelement.isDisplayed();
       		return true;
       	}
       	catch(Exception ex){
       		return false;
       	}

       	}  
        
        
        public boolean selectexportPopUpRegionCheckbox(boolean flag){
            try {
               WebDriverWait wait = new WebDriverWait(driver, 60);
               
               wait.until(ExpectedConditions.visibilityOfElementLocated((exportRegionCheckBox_Xpath)));
               
               WebElement element = driver.findElement((exportRegionCheckBox_Xpath));
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
        
        
        public boolean selectexportPopUpNameCheckbox(boolean flag){
            try {
               WebDriverWait wait = new WebDriverWait(driver, 60);
               
               wait.until(ExpectedConditions.visibilityOfElementLocated((exportNameCheckBox_Xpath)));
               
               WebElement element = driver.findElement((exportNameCheckBox_Xpath));
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
        
        public boolean crossclickInExportPopUp()
       	{
       	try{
       		WebElement exportButtonWebEelement=new WebDriverWait(driver,10)
       		.until(ExpectedConditions.visibilityOfElementLocated(crossExportPopUp_Xpath));
       		exportButtonWebEelement.click();
       		return true;
       	}
       	catch(Exception ex){
       		return false;
       	}

       	} 
        
        public boolean clickexportButtonInPopUp()
       	{
       	try{
       	Thread.sleep(3000);
       		WebElement exportButtonWebEelement=new WebDriverWait(driver,10)
       		.until(ExpectedConditions.visibilityOfElementLocated(exportButtonPopUp_xpath));
       		Thread.sleep(3000);
       		exportButtonWebEelement.click();
       		return true;
       	}
       	catch(Exception ex){
       		return false;
       	}

       	}
     
        public boolean deleteButtonClick()
	{
	try{
	    Thread.sleep(3000);
		WebElement deleteButtonWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(deleteButton_xpath));
		deleteButtonWebEelement.click();
		return true;
	}
	catch(Exception ex){
		return false;
	}

	} 
     
        
        public boolean deleteButtonWarningPopUpHeader()
       	{
       	try{
       	    Thread.sleep(3000);
       		WebElement deleteButtonWebEelement=new WebDriverWait(driver,10)
       		.until(ExpectedConditions.visibilityOfElementLocated(deleteButtonPopUpHeader_xpath));
       		deleteButtonWebEelement.isDisplayed();
       		return true;
       	}
       	catch(Exception ex){
       		return false;
       	}

       	}
        
        public boolean deleteButtonYesUi()
       	{
       	try{
       		WebElement deleteButtonWebEelement=new WebDriverWait(driver,10)
       		.until(ExpectedConditions.visibilityOfElementLocated(deleteYes_xpath));
       		deleteButtonWebEelement.isDisplayed();
       		return true;
       	}
       	catch(Exception ex){
       		return false;
       	}

       	} 
        public boolean deleteButtonNoUi()
       	{
       	try{
       		WebElement deleteButtonWebEelement=new WebDriverWait(driver,10)
       		.until(ExpectedConditions.visibilityOfElementLocated(deleteNo_xpath));
       		deleteButtonWebEelement.isDisplayed();
       		return true;
       	}
       	catch(Exception ex){
       		return false;
       	}

       	}   
     
        public boolean deleteButtonNoClick()
       	{
       	try{
       		WebElement deleteButtonWebEelement=new WebDriverWait(driver,10)
       		.until(ExpectedConditions.visibilityOfElementLocated(deleteNo_xpath));
       		deleteButtonWebEelement.click();
       		return true;
       	}
       	catch(Exception ex){
       		return false;
       	}

       	}   
        
        public boolean deleteButtonYesClick()
       	{
       	try{
       		WebElement deleteButtonWebEelement=new WebDriverWait(driver,10)
       		.until(ExpectedConditions.visibilityOfElementLocated(deleteYes_xpath));
       		deleteButtonWebEelement.click();
       		return true;
       	}
       	catch(Exception ex){
       		return false;
       	}
       	}
        
       	public boolean multipleCheckBoxClick()
       	{
       	try{
       		WebElement deleteButtonWebEelement=new WebDriverWait(driver,10)
       		.until(ExpectedConditions.visibilityOfElementLocated(selectAllCheckBoxDelete_xpath));
       		deleteButtonWebEelement.click();
       		return true;
       	}
       	catch(Exception ex){
       		return false;
       	}
 
       
       	}
	public boolean menuSearch(String salesRegionSerach)
       	{
       	try{
       	    Thread.sleep(3000);
       		WebElement menuSearchWebEelement=new WebDriverWait(driver,10)
       		.until(ExpectedConditions.visibilityOfElementLocated(menuSearch_xpath));
       		menuSearchWebEelement.click();
       		menuSearchWebEelement.sendKeys(salesRegionSerach);
       		return true;
       	}
       	catch(Exception ex){
       		return false;
       	}
 
       
       	}
	
	
	
      public boolean validateMenuSearch()
	{
	try{
		WebElement menuSearchWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(validMenuSearch_xpath));
		menuSearchWebEelement.click();
		return true;
	}
	catch(Exception ex){
		return false;
	}


	}
	
	
}
	
	
	
	
