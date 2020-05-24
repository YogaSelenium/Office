package com.cync.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.SkipException;

import com.cync.base.BasePage;

public class NAICS_Codes_Page extends BasePage {

    
    private final By NAICSCodesHeader_xpath=By.xpath("//h3[contains(text(),'NAICS Codes')]");
    private final By NAICSCodesPageSearch_xpath=By.xpath("//input[@placeholder='Search Here']");
    private final By codeField_xpath=By.xpath("//span[text()='Code']");
    private final By descriptionField_xpath=By.xpath("//span[text()='Description']");
    private final By addButton_xpath=By.id("New");
    private final By editButton_xpath=By.id("Edit");
    private final By deleteButton_xpath=By.id("Delete");
    private final By exportButton_xpath=By.id("Export");	
    private final By breadcrumb_xpath=By.xpath("//ul[@class='breadcrumb']");
    private final By searchCode_xpath=By.xpath("(//input[@placeholder='Search'])[1]");
    private final By searchDescription_xpath=By.xpath("(//input[@placeholder='Search'])[2]");
    private final By editDisable_xpath=By.xpath("//i[@class='hand fa fa-pencil fa-1x clr_grey f_s_20 icon_disabled ng-star-inserted']");
    private final By deleteDisable_xpath=By.xpath("//i[@class='hand fa fa-trash fa-2x f_s_20 clr_grey icon_disabled ng-star-inserted']");
    private final By firstCheckBox_xpath=By.xpath("(//div[contains(@class,'ui-chkbox-box ui-widget ui-corner-all ui-state-default')])[2]");
    private final By selectAllCheckBox_xpath=By.xpath("//tr/th[1]/p-dtcheckbox/div/div[2]");
    private final By codeAddField_xpath=By.xpath("//label[contains(text(),'Code')]");
    private final By descriptionAddField_xpath=By.xpath("//label[contains(text(),'Description')]");
    private final By descriptionAddMandatory_xpath=By.xpath("(//span[@class='required'])[1]");
    private final By codeAddMandatory_xpath=By.xpath("(//span[@class='required'])[1]");
    private final By codeTextBox_xpath=By.xpath("//input[@formcontrolname='code']");
    private final By descriptionTextBox_xpath=By.xpath("//input[@formcontrolname='description']");
    private final By cancelOnAddNAICS_xpath=By.id("action_back");;
    private final By SaveOnAddNAICS_xpath=By.xpath("//span[text()='Save']");
    private final By SaveAndNewOnAddNAICS_xpath=By.xpath("//span[text()='Save & New']");
    private final By NAICSMsgObj_xpath=By.id("cync_notifications_msg");
    private final By searchFail_xpath=By.xpath("//span[text()='No records found']");
    private final By validSearchData_xpath=By.xpath("(//span[@class='ui-cell-data ng-star-inserted'])[1]");
    private final By dataSearchCheckbox_xpath=By.xpath("(//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default'])[2]");
    private final By headerExportPopup_Xpath=By.xpath("//span[contains(text(),'NAICS Codes')]");
    private final By exportButtonPopUp_xpath=By.xpath("//span[text()='Export']");
    private final By crossExportPopUp_Xpath=By.xpath("//span[@class='fa fa-fw fa-close']");
    private final By exportCodeCheckBox_Xpath=By.xpath("(//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default ui-state-active'])[2]");
    private final By exportDescriptionCheckBox_Xpath=By.xpath("(//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default ui-state-active'])[3]");
    private final By  deleteYes_xpath=By.id("modal_action_yes");
    private final By  deleteNo_xpath=By.id("modal_action_no");
    private final By deleteButtonPopUpHeader_xpath=By.xpath("//p[contains(text(),'Are you sure you want to delete')]");
    private final By selectAllCheckBoxDelete_xpath=By.xpath("(//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default'])[1]");
    
    
    public NAICS_Codes_Page(WebDriver driver) {
	super(driver);
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	if(!driver.findElement(NAICSCodesHeader_xpath).getText().trim().equals("NAICS Codes Summary")){
		throw new SkipException("sales region couldn't open.");
	}
}
    
    
    public String NAICSCodesHeader(String NAICSCodesHeaderHeader)
	{
	try{
		WebElement NAICSCodesSearchWebEelement=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(NAICSCodesHeader_xpath));
		NAICSCodesSearchWebEelement.getText();
		
	}
	catch(Exception ex){
		
	}
	return NAICSCodesHeaderHeader;
	
	}  
    
    public boolean NAICSCodesPageSerach()
	{
	try{
		WebElement NAICSCodesSearchWebEelement=new WebDriverWait(driver,30)
			.until(ExpectedConditions.visibilityOfElementLocated(NAICSCodesPageSearch_xpath));
		NAICSCodesSearchWebEelement.isDisplayed();
		return true;
	}
	catch(Exception ex){
		return false;
	}
	}
	
	
	public boolean codeFieldUIValidation()
	{
	try{
		WebElement NAICSCodesFieldValidationWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(codeField_xpath));
		NAICSCodesFieldValidationWebEelement.isDisplayed();
		return true;
	}
	catch(Exception ex){
		return false;
	}

	}
	
	public boolean descriptionFieldUIValidation()
	{
	try{
		WebElement NAICSCodesFieldValidationWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(descriptionField_xpath));
		NAICSCodesFieldValidationWebEelement.isDisplayed();
		return true;
	}
	catch(Exception ex){
		return false;
	}

	}
	
	public boolean addButtonUIValidation()
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
	
	public boolean codeSerachUIValidation()
	{
	try{
		WebElement exportButtonWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(searchCode_xpath));
		exportButtonWebEelement.isDisplayed();
		return true;
	}
	catch(Exception ex){
		return false;
	}

	}
	public boolean DescriptionSerachUIValidation()
	{
	try{
		WebElement DescriptionSerachWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(searchDescription_xpath));
		DescriptionSerachWebEelement.isDisplayed();
		return true;
	}
	catch(Exception ex){
		return false;
	}

	}
	
	public String breadcrumbNAICSCodes(String  NAICSCodesBreadcrumb)
	{
		try{
			WebElement breadcrumbWebEelement=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(breadcrumb_xpath));
			breadcrumbWebEelement.isDisplayed();
			
		}
		catch(Exception ex){
			
		}
		return NAICSCodesBreadcrumb;

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
	       
		WebElement addButtonWebEelement=new WebDriverWait(driver,200)
		.until(ExpectedConditions.visibilityOfElementLocated(addButton_xpath));
		Thread.sleep(10000);
		addButtonWebEelement.click();
		return true;
	}
	catch(Exception ex){
		return false;
	}

	}
	

	public boolean codeAddFieldUIValidation()
	{
	try{
		
		WebElement codeAddFieldWebEelement=new WebDriverWait(driver,100)
		.until(ExpectedConditions.visibilityOfElementLocated(codeAddField_xpath));
		codeAddFieldWebEelement.isDisplayed();
		return true;
	}
	catch(Exception ex){
		return false;
	}

	}
	
	
	public boolean descriptionAddFieldUIValidation()
	{
	try{
		WebElement descriptionAddFieldWebEelement=new WebDriverWait(driver,100)
		.until(ExpectedConditions.visibilityOfElementLocated(descriptionAddField_xpath));
		descriptionAddFieldWebEelement.isDisplayed();
		return true;
	}
	catch(Exception ex){
		return false;
	}
}
	
	
	public boolean codeAddMandatoryUIValidation()
	{
	try{
		WebElement codeAddMandatoryWebEelement=new WebDriverWait(driver,100)
		.until(ExpectedConditions.visibilityOfElementLocated(codeAddMandatory_xpath));
		codeAddMandatoryWebEelement.isDisplayed();
		return true;
	}
	catch(Exception ex){
		return false;
	}

	}
	
	public boolean descriptionAddMandatoryUIValidation()
	{
	try{
		WebElement descriptionAddMandatoryWebEelement=new WebDriverWait(driver,100)
		.until(ExpectedConditions.visibilityOfElementLocated(descriptionAddMandatory_xpath));
		descriptionAddMandatoryWebEelement.isDisplayed();
		return true;
	}
	catch(Exception ex){
		return false;
	}

	}
	public boolean codeTextBoxUIValidation()
	{
	try{
		WebElement codeTextBoxWebEelement=new WebDriverWait(driver,200)
		.until(ExpectedConditions.visibilityOfElementLocated(codeTextBox_xpath));
		codeTextBoxWebEelement.isDisplayed();
		return true;
	}
	catch(Exception ex){
		return false;
	}

	}
	
	public boolean descriptionTextBoxUIValidation()
	{
	try{
		WebElement descriptionTextBoxWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(descriptionTextBox_xpath));
		descriptionTextBoxWebEelement.isDisplayed();
		return true;
	}
	catch(Exception ex){
		return false;
	}
        }
	public boolean cancelOnAddNAICSUIValidation()
	{
	try{
		WebElement cancelOnAddNAICSWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(cancelOnAddNAICS_xpath));
		cancelOnAddNAICSWebEelement.isDisplayed();
		return true;
	}
	catch(Exception ex){
		return false;
	}

	}
	
	public boolean saveOnAddNAICSUIValidation()
	{
	try{
		
		WebElement SaveOnAddNAICSWebEelement=new WebDriverWait(driver,20)
			.until(ExpectedConditions.visibilityOfElementLocated(SaveOnAddNAICS_xpath));
		SaveOnAddNAICSWebEelement.isDisplayed();
		return true;
	}
	catch(Exception ex){
		return false;
	}

	}
	
	public boolean saveAndNewOnAddNAICSUIValidation()
	{
	try{
		WebElement SaveAndNewOnAddNAICSWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(SaveAndNewOnAddNAICS_xpath));
		SaveAndNewOnAddNAICSWebEelement.isDisplayed();
		return true;
	}
	catch(Exception ex){
		return false;
	}

	}
	
	public String addValueToCodeTextBox(String codeData)
	{
	try{
		WebElement codeTextBoxWebEelement=new WebDriverWait(driver,200)
		.until(ExpectedConditions.visibilityOfElementLocated(codeTextBox_xpath));
		codeTextBoxWebEelement.clear();
		codeTextBoxWebEelement.sendKeys(codeData);
		
	}
	catch(Exception ex){
	  
	}
	return codeData;
	

	}
	
	
	public String addValueToDescriptionTextBox(String descriptionData)
	{
	try{
		WebElement descriptionTextBoxWebEelement=new WebDriverWait(driver,200)
		.until(ExpectedConditions.visibilityOfElementLocated(descriptionTextBox_xpath));
		descriptionTextBoxWebEelement.clear();
		descriptionTextBoxWebEelement.sendKeys(descriptionData);
		
	}
	catch(Exception ex){

	}
	return descriptionData;

	}
	
	
	public boolean saveNAICSCodes()
	{
	try{
		Thread.sleep(2000);
		WebElement SaveOnAddSalesWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(SaveOnAddNAICS_xpath));
		SaveOnAddSalesWebEelement.click();
		return true;
	}
	catch(Exception ex){
		return false;
	}

	}
	
	public boolean saveAndNewNAICSCodes()
	{
	try{
		WebElement SaveAndNewOnAddSalesWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(SaveAndNewOnAddNAICS_xpath));
		SaveAndNewOnAddSalesWebEelement.click();
		return true;
	}
	catch(Exception ex){
		return false;
	}

	}
	
	
	public String verifyMessageOnNAICSAfterSave(String messageOnNAICSCode)
	    {
	    try{
	       WebElement SaveOnAddSalesWebEelement=new WebDriverWait(driver,200)
	       .until(ExpectedConditions.visibilityOfElementLocated(NAICSMsgObj_xpath));
	       
	      String actualMsgFromAPP= SaveOnAddSalesWebEelement.getText();
	      if(actualMsgFromAPP.equalsIgnoreCase(messageOnNAICSCode))
	      {
	       return actualMsgFromAPP;
	      }
	       
	    }
	    catch(Exception ex){
	     
	    }
	 return messageOnNAICSCode;
	    }

	
	public boolean cancelNAICSCode()
	{
	try{
		Thread.sleep(2000);
		WebElement cancelOnAddNAICSWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(cancelOnAddNAICS_xpath));
		cancelOnAddNAICSWebEelement.click();
		return true;
	}
	catch(Exception ex){
	    return false;	
	}
	
	}
	public boolean addDataNAICSCodesPageSerach(String validdata)
	{
	try{
		WebElement NAICSCodesSearchWebEelement=new WebDriverWait(driver,200)
			.until(ExpectedConditions.visibilityOfElementLocated(NAICSCodesPageSearch_xpath));
		NAICSCodesSearchWebEelement.clear();
		NAICSCodesSearchWebEelement.sendKeys(validdata);
		return true;
	}
	catch(Exception ex){
		return false;	
	}
	}
	
	public String invalidSerachedData(String dataOnPageSearch)
	{
	    try{
	WebElement NAICSCodesSearchWebEelement=new WebDriverWait(driver,30)
		.until(ExpectedConditions.visibilityOfElementLocated(searchFail_xpath));
	NAICSCodesSearchWebEelement.getText();
	    }
	    catch(Exception ex){
	
	    }
	    return dataOnPageSearch;

	}
	
	public String validSerachedData(String validdata)
	{
	    try{
	WebElement NAICSCodesSearchWebEelement=new WebDriverWait(driver,30)
		.until(ExpectedConditions.visibilityOfElementLocated(validSearchData_xpath));
	NAICSCodesSearchWebEelement.getText();
	    }
	    catch(Exception ex){
	
	    }
	    return validdata;

	}

	
        public boolean addDataNAICSCodes_CodeSerach(String Invaliddata)
        {
        try{
        	WebElement NAICSCodesSearchWebEelement=new WebDriverWait(driver,50)
        		.until(ExpectedConditions.visibilityOfElementLocated(searchCode_xpath));
        	NAICSCodesSearchWebEelement.sendKeys(Invaliddata);
        	return true;
        }
        catch(Exception ex){
            return false;	
        }
	
        }
        
        public boolean addDataNAICSCodes_DescriptionSerach(String Invaliddata)
        {
        try{
        	WebElement NAICSCodesSearchWebEelement=new WebDriverWait(driver,50)
        		.until(ExpectedConditions.visibilityOfElementLocated(searchDescription_xpath));
        	NAICSCodesSearchWebEelement.sendKeys(Invaliddata);
        	return true;
        }
        catch(Exception ex){
            return false;
        }
	
        }
        
        public boolean NAICSCodesEditByClick()
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
               
               public boolean codeUIInExportPopUp()
              	{
              	try{
              		WebElement exportButtonWebEelement=new WebDriverWait(driver,10)
              		.until(ExpectedConditions.visibilityOfElementLocated(codeAddField_xpath));
              		exportButtonWebEelement.isDisplayed();
              		return true;
              	}
              	catch(Exception ex){
              		return false;
              	}

              	}
               
               public boolean descriptionUIInExportPopUp()
              	{
              	try{
              		WebElement exportButtonWebEelement=new WebDriverWait(driver,10)
              		.until(ExpectedConditions.visibilityOfElementLocated(descriptionAddField_xpath));
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
               
               public boolean codeCheckBoxUIInExportPopUp()
              	{
              	try{
              		WebElement exportButtonWebEelement=new WebDriverWait(driver,10)
              		.until(ExpectedConditions.visibilityOfElementLocated(exportCodeCheckBox_Xpath));
              		exportButtonWebEelement.isDisplayed();
              		return true;
              	}
              	catch(Exception ex){
              		return false;
              	}

              	}  
               
               public boolean descriptionCheckBoxUIInExportPopUp()
              	{
              	try{
              		WebElement exportButtonWebEelement=new WebDriverWait(driver,10)
              		.until(ExpectedConditions.visibilityOfElementLocated(exportDescriptionCheckBox_Xpath));
              		exportButtonWebEelement.isDisplayed();
              		return true;
              	}
              	catch(Exception ex){
              		return false;
              	}

              	}  
               
               public boolean selectexportPopUpCodeCheckbox(boolean flag){
                   try {
                      WebDriverWait wait = new WebDriverWait(driver, 60);
                      
                      wait.until(ExpectedConditions.visibilityOfElementLocated((exportCodeCheckBox_Xpath)));
                      
                      WebElement element = driver.findElement((exportCodeCheckBox_Xpath));
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
                      
                      wait.until(ExpectedConditions.visibilityOfElementLocated((exportDescriptionCheckBox_Xpath)));
                      
                      WebElement element = driver.findElement((exportDescriptionCheckBox_Xpath));
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
}
    	



