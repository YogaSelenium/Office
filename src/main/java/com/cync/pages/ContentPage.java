package com.cync.pages;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.SkipException;

import com.cync.base.BasePage;

public class ContentPage extends BasePage {
	
	private final By contentHeader_xpath=By.xpath("//h3[contains(text(),'Content')]");
	private final By breadCrumb_xpath=By.xpath("//ul[@class='breadcrumb']");
	private final By nameField_xpath=By.xpath("123");
	
	private final By letterContentRadioButton_xpath=By.xpath("(//i[@class='fa fa-dot-circle-o fa-2x'])[1]");
	private final By legalContentRadioButton_xpath=By.xpath("(//i[@class='fa fa-circle-o fa-2x'])[2]");	
	
	//private final By productTypesDropdown_xpath=By.xpath("(//select[@class='form-control ng-pristine ng-invalid ng-touched'])[1]");
	//private final By letterTypesDropdown_xpath=By.xpath("(//select[@class='form-control ng-pristine ng-invalid ng-touched'])[2]");
	
	//Ashfaq
	private final By productTypesDropdown_xpath=By.xpath("(//select[@formcontrolname='productTypeForLetterContent'])[1]");
	
	/*private final By productTypesDropdown_xpath=By.xpath("//select[@formcontrolname='productTypeForLetterContent']");*/
	private final By letterTypesDropdown_xpath=By.xpath("(//select[@formcontrolname='letter_types'])[1]");
	
	private final By productTypesDropdownLegal_xpath=By.xpath("(//select[@formcontrolname='productTypeForLetterContent'])[2]");
	private final By legalTypesDropdownLegal_xpath=By.xpath("//select[@formcontrolname='legal_types']");
	private final By printDropdownLegal_xpath=By.xpath("//select[@formcontrolname='radiotop']");


	
	
	private final By productTypesDropdownOptions_xpath=By.xpath("//select[@formcontrolname='letter_types']");
	
	private final By logoHedder_xpath=By.xpath("(//div[@class='col-xs-12 col-sm-12 col-md-12 p_b_10 semi_bold'])[1]");
	private final By placeHolderHedder_xpath=By.xpath("//a[contains(text(),'Place Holders')]");
	
	//Ashfaq
	/*private final By editLogoLetter_xpath=By.id("Edit");*/
	private final By editLogoLetter_xpath=By.xpath("//i[@id='Edit']");
	//
	
	private final By resetOnContent_xpath=By.xpath("//img[@title='Reset']");
	private final By SaveOnLetterContent_xpath=By.xpath("(//button[@id='action_save'])[1]");
	private final By cancelOnLetterContent_xpath=By.xpath("(//button[@id='action_back'])[1]");

	private final By factoringDropLetter_xpath=By.xpath("(//option[text()='FACTORING'])[1]");
	
	private final By AblDropLetter_xpath=By.xpath("(//option[text()='ABL'])[1]");
	
	private final By browseLogo_xpath=By.xpath("(//span[@class='ui-button-text ui-clickable no-pad'])[1]");
	//private final By browseLogo_xpath=By.xpath("//input[@type='file']");

	
	private final By FormatEditLetter=By.xpath("//p");
	
	private final By successMessage_id=By.id("cync_notifications_msg");
	private final By CyncLogoPreview_xpath=By.xpath("//a/img[@id='preview']");
	
	private final By letterTypedropdownval_xpath=By.xpath("(//select[@class='form-control ng-untouched ng-pristine ng-invalid'])[4]");
	private final By letterFormat_xpath=By.xpath("//div[@class='mce-edit-area mce-container mce-panel mce-stack-layout-item']");
	private final By saveLegal_xpath=By.id("action_save");
	private final By successMessage_xpath=By.xpath("//div[text()='Record saved successfully.']");
	private final By legalPath_xpath=By.xpath("//select[@formcontrolname='legal_types']");
	
	
	//Ashfaq
	
	private final By lenderdropdown_xpath=By.xpath("//select[@id='affiliatedLenderSelection']");
	
	
	
	//zzz
	public ContentPage(WebDriver driver) {
		super(driver);
		
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		if(!driver.findElement(contentHeader_xpath).getText().trim().equals("Content")){
			throw new SkipException("Content couldn't open.");
		}	
	}
	
	
	public String breadcrumb(String contentBreadcrumb)
	{
		try{
			WebElement breadcrumbWebEelement=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(breadCrumb_xpath));
			breadcrumbWebEelement.isDisplayed();
			
		}
		catch(Exception ex){
			
		}
		return contentBreadcrumb;

		}
	
	public String contentHeader(String contentHeader)
	{
	try{
		WebElement ContentHeaderWebEelement=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(contentHeader_xpath));
		ContentHeaderWebEelement.getText();
		
	}
	catch(Exception ex){
		
	}
	return contentHeader;
	
	}
	
	/////////////////////
	public boolean letterContentRadioBtnUIValidation(){
		
	try{
		WebElement letterContentRadiobtnFieldWebEelement=new WebDriverWait(driver,60)
		.until(ExpectedConditions.visibilityOfElementLocated(letterContentRadioButton_xpath));
		letterContentRadiobtnFieldWebEelement.isDisplayed();
		return true;
	}
	catch(Exception ex){
		return false;
	}

	}
	
	public boolean legalContentRadioBtnUIValidation(){
		
	try{
		WebElement legalContentRadiobtnFieldWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(legalContentRadioButton_xpath));
		legalContentRadiobtnFieldWebEelement.isDisplayed();
		return true;
	}
	catch(Exception ex){
		return false;
	}
	
	

	}
	public boolean productTypesdropdownUIValidation(){
		
	try{
		
		WebElement productTypesdropdownValidationWebEelement=new WebDriverWait(driver,30)
		.until(ExpectedConditions.visibilityOfElementLocated(productTypesDropdown_xpath));
		productTypesdropdownValidationWebEelement.isDisplayed();
		return true;
		
	}
	catch(Exception ex){
		return false;
	}

	}	
	
	public boolean letterTypesdropdownUIValidation(){
		
	try{
		
		WebElement letterTypesdropdownValidationWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(letterTypesDropdown_xpath));
		letterTypesdropdownValidationWebEelement.isDisplayed();
		
		return true;
	}
	catch(Exception ex){
		return false;
	}

	}
	public boolean contentPageLogoUIValidation(){
		
	try{
		WebElement contentPageLogoValidationWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(logoHedder_xpath));
		contentPageLogoValidationWebEelement.isDisplayed();
		return true;
	}
	catch(Exception ex){
		return false;
	}

	}
	public boolean placeHoldersUIValidation(){
		
	try{
		WebElement placeHoldersValidationWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(placeHolderHedder_xpath));
		placeHoldersValidationWebEelement.isDisplayed();
		return true;
	}
	catch(Exception ex){
		return false;
	}

	}
	public boolean ResetIconUIValidation(){
		
	try{
		WebElement resetIconValidationWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(resetOnContent_xpath));
		resetIconValidationWebEelement.isDisplayed();
		return true;
	}
	catch(Exception ex){
		return false;
	}

	}
	public boolean EditIconUIValidation(){
		
	try{
		WebElement editIconValidationWebEelement=new WebDriverWait(driver,60)
		.until(ExpectedConditions.visibilityOfElementLocated(editLogoLetter_xpath));
		editIconValidationWebEelement.isDisplayed();
		return true;
	}
	catch(Exception ex){
		return false;
	}

	}
	public boolean SaveBtnUIValidation(){
		
	try{
		WebElement saveBtnValidationWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(SaveOnLetterContent_xpath));
		saveBtnValidationWebEelement.isDisplayed();
		return true;
	}
	catch(Exception ex){
		return false;
	}

	}
	
	
	public boolean CancelBtnUIValidation(){
		
		try{
			WebElement cancelBtnValidationWebEelement=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(cancelOnLetterContent_xpath));
			cancelBtnValidationWebEelement.isDisplayed();
			return true;
		}
		catch(Exception ex){
			return false;
		}

		}
	
	public boolean productTypesdropdownValues(String productDropdownValue){
		
					try {
						//productTypesDropdown_xpath
						
						WebElement dropdown = driver.findElement(productTypesDropdown_xpath);    
						Select select = new Select(dropdown); 
						java.util.List<WebElement> options = select.getOptions(); 
					
	                     for(WebElement item:options){
	                    	 System.out.println(item.getText());
	                    	 if (item.getText().equals(productDropdownValue)){
		                          System.out.println("Matched");
		                          return true;
		                          }
	                     }
	                    	 
	               	
					} catch (Exception e) {
	// TODO: handle exception
}
					return false;
		
		
		}
	
	
	
	
	public boolean selectlegalContentRadioBtn(boolean flag){
		 try {
			   WebDriverWait wait = new WebDriverWait(driver, 60);
			   
			   wait.until(ExpectedConditions.visibilityOfElementLocated((legalContentRadioButton_xpath)));
			     Thread.sleep(5000);

			   WebElement element = driver.findElement((legalContentRadioButton_xpath));
			   if(flag){
			    if(!element.isSelected() == true){
			     element.click();
			     Thread.sleep(5000);
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
	
	
	

	public boolean selectletterContentRadioBtn(boolean flag){
		 try {
			 Thread.sleep(6000);
			   WebDriverWait wait = new WebDriverWait(driver, 60);
		      wait.until(ExpectedConditions.visibilityOfElementLocated(letterContentRadioButton_xpath));			   
			   WebElement element = driver.findElement(letterContentRadioButton_xpath);
			   
			   if(flag){
			    if(!element.isSelected() == true){
			     element.click();
			    }
			   }
			   
			   else if(!flag){
				   
			    if(element.isSelected() == false){
			     element.click();

			    }
			   }   
			  } catch (Exception e) {
			   System.out.println("Exception in clickOnCheckBox Method "+e.getCause());
			  }
		return flag; 
	}
	
	
	
	public String selectDropdownvalueProductTypes(String productTypeLabel) throws InterruptedException{
		

		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOfElementLocated((productTypesDropdown_xpath)));
	
		WebElement element = driver.findElement((productTypesDropdown_xpath));
		element.click();
		
		Select sel = new Select(element);
		List<WebElement> list = sel.getOptions();	
		
		
		for(WebElement ele : list){
			
			if(ele.getText().equals(productTypeLabel)){
				ele.click();
				Thread.sleep(5000);
				break;
			}
		}
		return productTypeLabel;
		
		
	}
	
	
	public String selectDropdownvalueLetterTypes(String letterTypeLabel) throws InterruptedException{
		

		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOfElementLocated((letterTypesDropdown_xpath)));
	
		WebElement element = driver.findElement((letterTypesDropdown_xpath));
		Select sel = new Select(element);
		List<WebElement> list = sel.getOptions();	
		
		
		for(WebElement ele : list){
			
			if(ele.getText().equals(letterTypeLabel)){
				ele.click();
				 Thread.sleep(5000);
				//TimeUnit.SECONDS.sleep(5);
				break;
			}
		}
		return letterTypeLabel;
		
			}

	public boolean clickOnResetIcon( ){
		try{
			 Thread.sleep(3000);
			WebElement resetIconWebE=new WebDriverWait(driver,10)
				.until(ExpectedConditions.visibilityOfElementLocated(resetOnContent_xpath));
			resetIconWebE.click();
		     Thread.sleep(5000);

			return true;
		}catch(Exception ex){
			return false;
		}
		
	}
	
	
	//verifyproductTypeLabel

	public String verifytDropdownvaluesProductTypes(String productTypeLabel) throws InterruptedException{
		

		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOfElementLocated((productTypesDropdown_xpath)));
	
		WebElement element = driver.findElement((productTypesDropdown_xpath));
		Select sel = new Select(element);
		List<WebElement> list = sel.getOptions();	
		
		
		for(WebElement ele : list){
			
			if(ele.getText().equals(productTypeLabel)){
				ele.click();
			     Thread.sleep(10000);
				//TimeUnit.SECONDS.sleep(5);
				break;
			}
		}
		return productTypeLabel;
			
	}
public String verifyABLvalueProductTypesDropdown(String productTypeABLLabel) throws InterruptedException{
		

		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOfElementLocated((productTypesDropdown_xpath)));
	
		WebElement element = driver.findElement((productTypesDropdown_xpath));
		Select sel = new Select(element);
		List<WebElement> list = sel.getOptions();	
		
		
		for(WebElement ele : list){
			
			if(ele.getText().equals(productTypeABLLabel)){
				ele.click();
				Thread.sleep(10000);
				break;
			}
		}
		return productTypeABLLabel;
		
		
	}
	


public String verifyFACTORINGvalueProductTypesDropdown(String productTypeFactoringLabel) throws InterruptedException{
	

	WebDriverWait wait = new WebDriverWait(driver, 60);
	wait.until(ExpectedConditions.visibilityOfElementLocated((productTypesDropdown_xpath)));

	WebElement element = driver.findElement((productTypesDropdown_xpath));
	Select sel = new Select(element);
	List<WebElement> list = sel.getOptions();	
	
	
	for(WebElement ele : list){
		
		if(ele.getText().equals(productTypeFactoringLabel)){
			ele.click();
		     Thread.sleep(10000);
			//TimeUnit.SECONDS.sleep(5);
			break;
		}
	}
	return productTypeFactoringLabel;
		
}/*
public boolean checkOptions(String[] expected){
    WebElement select = driver.findElement(By.id("ctl00_cphMainContent_dq14_response"));
    WebElement options = select.findElement(By.xpath(".//option"));
    int k = 0;
    for (WebElement opt : options){
        if (!opt.getText().equals(expected[k]){
            return false;
        }
        k = k + 1;
    }
    return true;
}*/


public boolean  verifyletterTypeDropdownValues_WhenABLisSelected(){
	try {
		String[] exp = {"Disclaimer","Please Select","Verification Letter","Notice of Assignment","Audit Letter"};
		
		WebElement dropdown = driver.findElement(productTypesDropdownOptions_xpath);  
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

public boolean  verifyletterTypeDropdownValues_WhenFactoringisSelected(){
	try {
		/*String[] exp = {"Please Select","Notice of Assignment","Audit Letter"};*/
		
		//Ashfaq
		String[] exp = {"Please Select","Disclaimer","Verification Letter","Notice of Assignment","Audit Letter"};
		
		WebElement dropdown = driver.findElement(productTypesDropdownOptions_xpath); 
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


public boolean clickOnEditIcon(){
	
	try{
		Thread.sleep(3000);
		WebElement editIconValidationWebEelement=new WebDriverWait(driver,60)
		.until(ExpectedConditions.visibilityOfElementLocated(editLogoLetter_xpath));
		Thread.sleep(3000);
		editIconValidationWebEelement.click();
		
		return true;
	}
	catch(Exception ex){
		return false;
	}

	}




public boolean clickOnBrowseLogo(){
	
	try{
		WebElement editIconValidationWebEelement=new WebDriverWait(driver,60)
		.until(ExpectedConditions.visibilityOfElementLocated(browseLogo_xpath));
		editIconValidationWebEelement.isDisplayed();
		editIconValidationWebEelement.click();
		Thread.sleep(5000);
		return true;
	}
	catch(Exception ex){
		return false;
	}

	}


public boolean  fileUPload_CyncLogo(){
	
	
	try {	
		StringSelection ss = new StringSelection("D:\\Automation\\cyncautomation\\Cync_Automation_Project\\cynclogo_fin.png");
		/*StringSelection ss = new StringSelection("D:\\AutomationCI\\Cync_Automation_Project\\cynclogo_fin.png");*/
		//StringSelection ss = new StringSelection("D:\\AutomationCI\\Cync_Automation_Project\\src\\test\resources\\cynclogo_fin.png");
		
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
				
		Thread.sleep(3000);
		
	} catch (Exception e) {
		// TODO: handle exception
		return false;
	}
	
	return true;
}

public boolean  fileUPload_CyncLogoMorethan1MB(){
	
	
	try {	
		StringSelection ss = new StringSelection("D:\\Automation\\cyncautomation\\Cync_Automation_Project\\Morethan1MBsize.jpg");
		
         //  StringSelection ss = new StringSelection("D:\\AutomationCI\\Cync_Automation_Project\\Morethan1MBsize.jpg");
		//StringSelection ss = new StringSelection("D:\\AutomationCI\\Cync_Automation_Project\\src\\test\resources\\cynclogo_fin.png");
		
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
				
		Thread.sleep(3000);
		
	} catch (Exception e) {
		// TODO: handle exception
		return false;
	}
	
	return true;
}


public boolean clickOnCancelButton(){
	
	try{
		WebElement editIconValidationWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(cancelOnLetterContent_xpath));
		editIconValidationWebEelement.isDisplayed();
		editIconValidationWebEelement.click();
		Thread.sleep(5000);
		return true;
	}
	catch(Exception ex){
		return false;
	}

	}

public boolean clickOnSaveButton(){
	
	try{
		WebElement editIconValidationWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(SaveOnLetterContent_xpath));
		editIconValidationWebEelement.isDisplayed();
		editIconValidationWebEelement.click();
		Thread.sleep(5000);
		return true;
	}
	catch(Exception ex){
		return false;
	}

	}



public boolean letterFormatEditorData(String letterFormatData){
	  try {
		  driver.switchTo().frame(driver.findElement(By.id("letter_Content_id_ifr")));
		  WebElement letterFormatWebE=new WebDriverWait(driver,10)
	   .until(ExpectedConditions.visibilityOfElementLocated(FormatEditLetter));
	//   letterFormatWebE.clear();
	 //  driver.switchTo().frame(driver.findElement(By.id("letter_Content_id_ifr")));
	   letterFormatWebE.sendKeys(letterFormatData);
	   Thread.sleep(10000);
	   return true;
	  } catch (Exception e) {
	   // TODO: handle exception
	  }
	  return false;
	 }


			
			public boolean verifyMessageOnAfterSave(String successMessageOnContent)
			{
			try{
					 WebElement SaveOnContentPageWebEelement=new WebDriverWait(driver,10)
					 .until(ExpectedConditions.visibilityOfElementLocated(successMessage_id));
					String actualMsgFromAPP= SaveOnContentPageWebEelement.getText();
					if(actualMsgFromAPP.equalsIgnoreCase(successMessageOnContent)){
						return true;
					}
					 
			}
			catch(Exception ex){
				return false;
			}
			return true;
			
			}
	
			

			public boolean verifyLogoIsPresent()
			{
				try{
					WebElement breadcrumbWebEelement=new WebDriverWait(driver,10)
					.until(ExpectedConditions.visibilityOfElementLocated(CyncLogoPreview_xpath));
					breadcrumbWebEelement.isDisplayed();
					return true;
				}
				catch(Exception ex){
					return false;
				}
				

				}
			
			
			
			//zzz
			
			
			
			
			

			public boolean verifyProductTypeLegal()
			{
				try{
					WebElement productTypeDropdownLegalWebEelement=new WebDriverWait(driver,10)
					.until(ExpectedConditions.visibilityOfElementLocated(productTypesDropdownLegal_xpath));
					productTypeDropdownLegalWebEelement.isDisplayed();
					return true;
				}
				catch(Exception ex){
					return false;
				}
				

				}
		
			

			public boolean verifyLegalTypeDropdownLegal()
			{
				try{
					WebElement legalTypeDropdownLegalWebEelement=new WebDriverWait(driver,10)
					.until(ExpectedConditions.visibilityOfElementLocated(legalTypesDropdownLegal_xpath));
					legalTypeDropdownLegalWebEelement.isDisplayed();
					return true;
				}
				catch(Exception ex){
					return false;
				}
				

				}
		
			public boolean verifyPrintDropdownLegal()
			{
				try{
					WebElement printDropdownLegalWebEelement=new WebDriverWait(driver,10)
					.until(ExpectedConditions.visibilityOfElementLocated(printDropdownLegal_xpath));
					printDropdownLegalWebEelement.isDisplayed();
					return true;
				}
				catch(Exception ex){
					return false;
				}
				

			}
			

			public boolean verifyProductDropdownSelectLegal()
			{
				try{
					WebElement productDropdownLegalWebEelement=new WebDriverWait(driver,10)
					.until(ExpectedConditions.visibilityOfElementLocated(printDropdownLegal_xpath));
					productDropdownLegalWebEelement.click();
					
					
					return true;
				}
				catch(Exception ex){
					return false;
				}
				

			}
			
	/*		public boolean  verifyLetterTypeDropdownValues(){
				 try {
						Thread.sleep(10000);
				  String[] exp = {"Please Select","Disclaimer","Verification Letter","Notice of Assignment","Audit Letter"};
				  
				  WebElement dropdown = driver.findElement(actionNameValueDropdown_xpath);  
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
			}*/
			
			
			
			public boolean  verifyProductTypeDropdownValues(){
				 try {
						Thread.sleep(3000);
				  String[] exp = {"Please Select","ABL","FACTORING"};
				  
				  WebElement dropdown = driver.findElement(productTypesDropdownLegal_xpath);  
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
			
			public boolean  verifyLegalTypeDropdownValues(){
				 try {
						Thread.sleep(3000);
				  String[] exp = {"Please Select","BBC","Report","E-signature"};
				  
				  WebElement dropdown = driver.findElement(legalTypesDropdownLegal_xpath);  
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
			
			public boolean  verifyPrintDropdownValues(){
				 try {
						Thread.sleep(3000);
				  String[] exp = {"Please Select","Top","Bottom"};
				  
				  WebElement dropdown = driver.findElement(printDropdownLegal_xpath);  
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
			
			

public boolean selectUserSpecificProductTypeForLegalType(String productTypeLabel) {
	try {

		WebElement productTypeDrpWebElement=new WebDriverWait(driver,30).until(ExpectedConditions.visibilityOfElementLocated(productTypesDropdownLegal_xpath));
		
		Select sel = new Select(productTypeDrpWebElement);
		List<WebElement> list = sel.getOptions();				
		
		for(WebElement ele : list){
			
			if(ele.getText().equals(productTypeLabel)){
				ele.click();
				break;			
		}		
		}return true;
		
	} catch (Exception e) {
		return false;
	}}

	public boolean verifyLegalAfterSelectingFactoring(){
		 try {
				Thread.sleep(3000);
		  String[] exp = {"Please Select","Disclaimer","E-signature"};
		  
		  WebElement dropdown = driver.findElement(legalTypesDropdownLegal_xpath);  
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

public boolean selectUserSpecificLegalTypeForLegalType(String legalTypeLabel) {
	try {
		Thread.sleep(3000);
		WebElement legalTypeDrpWebElement=new WebDriverWait(driver,30).until(ExpectedConditions.visibilityOfElementLocated(letterTypedropdownval_xpath));
		
		Select sel = new Select(legalTypeDrpWebElement);
		List<WebElement> list = sel.getOptions();				
		
		for(WebElement ele : list){
			
			if(ele.getText().equals(legalTypeLabel)){
				ele.click();
				break;			
		}		
		}return true;
		
	} catch (Exception e) {
		return false;
	}}


public boolean printIsDisplayedForEsignature() {
	try {

		WebElement printWebElement=new WebDriverWait(driver,30).until(ExpectedConditions.visibilityOfElementLocated(printDropdownLegal_xpath));
		printWebElement.isDisplayed();
		
		return false;
	}
	catch(Exception ex){
		return true;
	}

	}

public boolean letterFormatappendValue() {
	try {

		//WebElement letterFormatWebElement=new WebDriverWait(driver,30).until(ExpectedConditions.visibilityOfElementLocated(letterFormat_xpath));
		WebElement iframe1 = driver.findElement(By.tagName("iframe"));
        driver.switchTo().frame(iframe1);
        WebElement web1=driver.findElement(By.id("tinymce"));
        String Data=web1.getText();
        String DataNew=Data+"..";
        web1.clear();
        Actions act1=new Actions(driver);
        act1.sendKeys(web1, DataNew).build().perform();
        driver.switchTo().defaultContent();
        WebElement saveWebElement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(saveLegal_xpath));
		saveWebElement.click();
      /*  int size = driver.findElements(By.tagName("iframe")).size();
	    System.out.println("Total Frames --" + size);
	    
		// prints the total number of frames 
		driver.switchTo().frame(0);*/
		
        /*int size = driver.findElements(By.tagName("iframe")).size();

	    for(int i=0; i<=size; i++){
		driver.switchTo().frame(i);
		//int total=driver.findElements(By.xpath("html/body/a/img")).size();
		//System.out.println(total);
	    driver.switchTo().defaultContent();
	    }*/
	   
        //driver.switchTo().defaultContent(); // you are now outside both frames
        //driver.switchTo().frame(iframe1);
		/*String oldValue=letterFormatWebElement.getText();
		letterFormatWebElement.click();
		letterFormatWebElement.sendKeys("....................." + oldValue );*/
		//Thread.sleep(10000);
		
		//driver.switchTo().defaultContent();
		return false;
	}
	catch(Exception ex){
		return true;
	}}

public boolean clickOnSave( ){
	try{
		WebElement saveWebElement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(saveLegal_xpath));
		saveWebElement.click();
	     Thread.sleep(1000);

		return true;
	}catch(Exception ex){
		return false;
	}}

public boolean verifySuccessMessage( ){
	try{
		WebElement saveWebElement=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(successMessage_xpath));
		saveWebElement.isDisplayed();
	     Thread.sleep(1000);

		return true;
	}catch(Exception ex){
		return false;
	}}
public boolean selectUserSpecificLegalType(String legalTypeLabel) {
	try {
		Thread.sleep(3000);
		WebElement legalTypeDrpWebElement=new WebDriverWait(driver,30).until(ExpectedConditions.visibilityOfElementLocated(legalPath_xpath));
	
		Select sel = new Select(legalTypeDrpWebElement);
		List<WebElement> list = sel.getOptions();				
		
		for(WebElement ele : list){
			
			if(ele.getText().equals(legalTypeLabel)){
				ele.click();
				break;			
		}		
		}return true;
		
	} catch (Exception e) {
		return false;
	}}


//Ashfaq


public boolean selectLenderDropDownValue(String lender) {
	try {
		Thread.sleep(3000);
		WebElement Element=new WebDriverWait(driver,30).until(ExpectedConditions.visibilityOfElementLocated(lenderdropdown_xpath));
	    Element.click();
		
		Select sel = new Select(Element);
		List<WebElement> list = sel.getOptions();				
		
		for(WebElement ele : list){
			Thread.sleep(1000);
			if(ele.getText().contains(lender)){
				ele.click();
				break;			
		}		
		}
		
	} catch (Exception e) {
		return false;
	}
	return true;
   }



}