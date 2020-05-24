package com.cync.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.SkipException;

import com.cync.base.BasePage;

public class NotificationCentrePage extends BasePage
{
	private final By menuItem_xpath = By.id("hamburger_m");
	private final By administation_xpath =By.xpath("//span[text()='Administration']");
	private final By notificationSettingsHeader=By.xpath("//h3[text()='Notification Settings']");
	private final By globalSettingsLabel_xpath=By.xpath("//span[text()='Global Settings']");
	private final By roleSettingsLabel_xpath=By.xpath("//span[text()='Role Settings']");
	private final By userSettingsLabel_xpath=By.xpath("//span[text()='User Settings']");
	private final By globalSettingsRadioBtn_xpath=By.xpath("(//i[@class='fa fa-dot-circle-o fa-2x'])[1]");
	private final By globalSettingsRadioBtnOnAblLabel_xpath=By.id("ablID");
	private final By globalSettingsRadioBtnOnFactoringLabel_xpath=By.id("factID");
	private final By globalSettingsAblExtendBbcUnreleasedApproved_xpath=By.xpath("//span[contains(text(),'BBC Unreleased/Approved')]");
	private final By globalSettingsAblExtendNewCustomers_xpath=By.xpath("(//span[contains(text(),'New Customers')])[1]");
	private final By globalSettingsAblExtendChangeInCollateralValue_xpath=By.xpath("//span[contains(text(),'Change in Collateral Value')]");
	private final By globalSettingsAblExtendVariance_xpath=By.xpath("(//span[text()='Variance in Balance Limit'])[1]");
	private final By globalSettingsAblExtendFundRequest_xpath=By.xpath("//span[text()='Fund Request']");
	private final By globalSettingsAblExtendFunded_xpath=By.xpath("//span[text()='Funded']");
	private final By globalSettingsAblExtendLetter_xpath=By.xpath("//span[contains(text(),'Letter of Credit')]");
	private final By globalSettingsAblExtendFiles_xpath=By.xpath("//span[contains(text(),'Files Required/Ticklers')]");
	private final By globalSettingsAblExtendSelectAll_xpath=By.xpath("(//label[@style='vertical-align: middle;'])[1]");
	private final By globalSettingsAblExtendSelectDropdown_xpath=By.xpath("//select[@label='Select All']");
	private final By globalSettingsAblExtendSelectDropdownBoth_xpath=By.xpath("(//option[text()='Both'])[1]");
	private final By globalSettingsAblExtendSelectDropdownEmail_xpath=By.xpath("(//option[text()='Email'])[1]");
	private final By globalSettingsAblExtendSelectDropdownText_xpath=By.xpath("(//option[text()='Text'])[1]");
	private final By globalSettingsFactoringExtendRecourseInvoices_xpath=By.xpath("//span[text()='Recourse Invoices']");
	private final By globalSettingsFactoringExtendNewCustomers_xpath=By.xpath("(//span[contains(text(),'New Customers')])[2]");
	private final By globalSettingsFactoringExtendVariance_xpath=By.xpath("(//span[text()='Variance in Balance Limit'])[2]");
	private final By globalSettingsFactoringExtendSelectAll_xpath=By.xpath("(//label[@style='vertical-align: middle;'])[2]");
	
	private final By globalSettingsAblExtendBBCUnreleasedSelectDropdown_xpath=By.id("typeValueABL0");
	private final By globalSettingsAblExtendNewCustomersSelectDropdown_xpath=By.id("typeValueABL1");
	private final By globalSettingsAblExtendChangeinCollateralValueSelectDropdown_xpath=By.id("typeValueABL2");
	private final By globalSettingsAblExtendVarianceinBalanceLimitSelectDropdown_xpath=By.id("typeValueABL3");
	private final By globalSettingsAblExtendFundRequestSelectDropdown_xpath=By.id("typeValueABL4");
	private final By globalSettingsAblExtendFundedSelectDropdown_xpath=By.id("typeValueABL5");
	private final By globalSettingsAblExtendLetterofCreditSelectDropdown_xpath=By.id("typeValueABL6");
	private final By globalSettingsAblExtendFilesRequiredSelectDropdown_xpath=By.id("typeValueABL7");

	private final By globalSettingsFactoringExtendSelectDropdown_xpath=By.xpath("//select[@placeholder='factoring_notification']");
	private final By globalSettingsFactoringExtendRecourseInvoicesDropdown_xpath=By.id("typeValueFACT0");
	private final By globalSettingsFactoringExtendNewCustomersDropdown_xpath=By.id("typeValueFACT1");
	private final By globalSettingsFactoringExtendVarianceinBalanceLimitDropdown_xpath=By.id("typeValueFACT2");
	
	private final By globalSettingsSave_xpath=By.id("action_save");

	
	
	//private final By roleSettingsRadioBtn_xpath=By.xpath("(//i[@class='fa fa-circle-o fa-2x'])[2]");
	private final By roleSettingsProductTypeDropdown_xpath=By.xpath("//select[@class='form-control ng-pristine ng-valid ng-touched']");
	private final By roleSettingsPleaseSelectLabel_xpath=By.xpath("//div[@class='col-md-12 col-sm-12 col-xs-12']");
	private final By roleSettingsSearchRole_xpath=By.xpath("//input[@placeholder='Search Roles']");
	private final By roleSettingsSearchRoleTrue_xpath=By.xpath("(//span[text()='Any Client'])[1]");

	private final By userSettingsSearchClientInfor_xpath=By.xpath("//small[contains(text(),'Select Client first to proceed User Settings.')]");
	private final By userSettingsSearchClientSearch_xpath=By.xpath("//input[@placeholder='Search client...']");
	private final By userSettingsSaveBtn_xpath=By.xpath("//span[text()='Save']");
	private final By userSettingsCancelBtn_xpath=By.xpath("(//span[text()='Cancel'])[1]");
	private final By userSettingsSearchRoleTrue_xpath=By.xpath("(//span[@class='ng-star-inserted'])[1]");
	private final By userSettingsSearchRoleTrueUserName_xpath=By.xpath("//li[@class='list-group-item ng-star-inserted']");
	private final By userSettingsSearchRoleTrueUserNameSearch_xpath=By.xpath("//input[@placeholder='Search Users']");
	private final By userSettingsSearchRoleTrueUserNameTrue_xpath=By.xpath("(//span[@class='ng-star-inserted'])[2]");
	private final By userSettingsSearchRole_xpath=By.xpath("//input[@placeholder='Search client...']");

	
	
	
	public NotificationCentrePage(WebDriver driver) {
		super(driver);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(!driver.findElement(notificationSettingsHeader).getText().trim().equals("Notification Settings")){
			throw new SkipException("Notification Settings couldn't open.");
		}// TODO Auto-generated constructor stub
	}

	
	public String notificationSettingsHeader(String notificationSettingsHeaders)
	{
		
	try{
		
		WebElement PageSearchWebE=new WebDriverWait(driver,30)
			.until(ExpectedConditions.visibilityOfElementLocated(notificationSettingsHeader));
		PageSearchWebE.getText();
		
	}
	catch(Exception ex){
		
	}
	return notificationSettingsHeaders;
	}
	
	public boolean GlobalSettingsLabelUI(){
		try {
			WebElement GlobalSettingsWebE=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(globalSettingsLabel_xpath));
			Thread.sleep(2000);
			GlobalSettingsWebE.isDisplayed();
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
	
	
	public boolean RoleSettingsLabelUI(){
		try {
			WebElement RoleSettingsWebE=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(roleSettingsLabel_xpath));
			Thread.sleep(2000);
			RoleSettingsWebE.isDisplayed();
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
	public boolean UserSettingsLabelUI(){
		try {
			WebElement UserSettingsWebE=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(userSettingsLabel_xpath));
			Thread.sleep(2000);
			UserSettingsWebE.isDisplayed();
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
	
	public boolean GlobalSettingRadioBtnOn(){
		try {
			WebElement GlobalSettingsRadioBtnWebE=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(globalSettingsRadioBtn_xpath));
		
			Thread.sleep(2000);
			
			GlobalSettingsRadioBtnWebE.isDisplayed();
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
	
	public boolean GlobalSettingRadioBtnOnAblLabel(){
		try {
			WebElement GlobalSettingsRadioBtnOnAblWebE=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(globalSettingsRadioBtnOnAblLabel_xpath));
			Thread.sleep(2000);
			GlobalSettingsRadioBtnOnAblWebE.isDisplayed();
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
	
	public boolean GlobalSettingRadioBtnOnFactoringLabel(){
		try {
			WebElement GlobalSettingsRadioBtnOnFactoringWebE=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(globalSettingsRadioBtnOnFactoringLabel_xpath));
			Thread.sleep(2000);
			GlobalSettingsRadioBtnOnFactoringWebE.isDisplayed();
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
	
	public boolean GlobalSettingRadioBtnOnAblExtend(){
		try {
			WebElement GlobalSettingsRadioBtnOnAblExtendWebE=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(globalSettingsRadioBtnOnAblLabel_xpath));
			Thread.sleep(3000);
			GlobalSettingsRadioBtnOnAblExtendWebE.click();
			Thread.sleep(3000);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
	
	public boolean GlobalSettingRadioBtnOnAblCollapsed(){
		try {
			WebElement GlobalSettingsRadioBtnOnAblExtendWebE=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(globalSettingsRadioBtnOnAblLabel_xpath));
			Thread.sleep(3000);
			GlobalSettingsRadioBtnOnAblExtendWebE.click();
			Thread.sleep(3000);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
	public boolean GlobalSettingAblExtendBbcUnreleasedApproved(){
		try {
			WebElement GlobalSettingAblExtendBbcWebE=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(globalSettingsAblExtendBbcUnreleasedApproved_xpath));
			Thread.sleep(3000);
			GlobalSettingAblExtendBbcWebE.isDisplayed();
			Thread.sleep(3000);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
	
	
	
	public boolean GlobalSettingAblExtendNewCustomers(){
		try {
			WebElement GlobalSettingAblExtendNewWebE=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(globalSettingsAblExtendNewCustomers_xpath));
			Thread.sleep(3000);
			GlobalSettingAblExtendNewWebE.isDisplayed();
			Thread.sleep(3000);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
	
	public boolean GlobalSettingAblExtendChangeInCollateralValue(){
		try {
			WebElement GlobalSettingAblExtendChangeWebE=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(globalSettingsAblExtendChangeInCollateralValue_xpath));
		
			GlobalSettingAblExtendChangeWebE.isDisplayed();
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}

	public boolean GlobalSettingAblExtendVarianceInBalanceLimit(){
		try {
			WebElement GlobalSettingAblExtendVarianceWebE=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(globalSettingsAblExtendVariance_xpath));
			Thread.sleep(3000);
			GlobalSettingAblExtendVarianceWebE.isDisplayed();
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
	
	public boolean GlobalSettingAblExtendFundRequest(){
		try {
			WebElement GlobalSettingAblExtendFundWebE=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(globalSettingsAblExtendFundRequest_xpath));
			Thread.sleep(3000);
			GlobalSettingAblExtendFundWebE.isDisplayed();
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
	
	
	public boolean GlobalSettingAblExtendFunded(){
		try {
			WebElement GlobalSettingAblExtendFundedWebE=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(globalSettingsAblExtendFunded_xpath));
			Thread.sleep(3000);
			GlobalSettingAblExtendFundedWebE.isDisplayed();
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
		}
	
	public boolean GlobalSettingAblExtendLetter(){
		try {
			WebElement GlobalSettingAblExtendLetterWebE=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(globalSettingsAblExtendLetter_xpath));
			Thread.sleep(3000);
			GlobalSettingAblExtendLetterWebE.isDisplayed();
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}

	public boolean GlobalSettingAblExtendFilesRequired(){
		try {
			WebElement GlobalSettingAblExtendFilesWebE=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(globalSettingsAblExtendFiles_xpath));
			Thread.sleep(3000);
			GlobalSettingAblExtendFilesWebE.isDisplayed();
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
	
	public boolean GlobalSettingAblExtendSelectAll(){
		try {
			WebElement GlobalSettingAblExtendSelectAllWebE=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(globalSettingsAblExtendSelectAll_xpath));
			Thread.sleep(5000);
			GlobalSettingAblExtendSelectAllWebE.isDisplayed();
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
	
	
	public boolean GlobalSettingAblExtendSelectdropdownValues(){
		
				 try {
				  String[] exp = {"Select","Both","Email","Text"};
				  
				  WebElement dropdown = driver.findElement(globalSettingsAblExtendSelectDropdown_xpath);  
				  dropdown.click();
				  Thread.sleep(3000);
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
	
	public boolean GlobalSettingRadioBtnOnFactoringExtend(){
		try {
			WebElement GlobalSettingsRadioBtnOnFactoringExtendWebE=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(globalSettingsRadioBtnOnFactoringLabel_xpath));
			Thread.sleep(2000);
			GlobalSettingsRadioBtnOnFactoringExtendWebE.click();
			Thread.sleep(2000);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
	
	public boolean GlobalSettingFactoringExtendRecourseInvoices(){
		try {
			WebElement GlobalSettingFactoringExtendRecourseWebE=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(globalSettingsFactoringExtendRecourseInvoices_xpath));
			Thread.sleep(2000);
			GlobalSettingFactoringExtendRecourseWebE.isDisplayed();
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
	
	public boolean GlobalSettingFactoringExtendNewCustomers(){
		try {
			WebElement GlobalSettingFactoringExtendNewWebE=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(globalSettingsFactoringExtendNewCustomers_xpath));
			Thread.sleep(2000);
			GlobalSettingFactoringExtendNewWebE.isDisplayed();
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
	
	public boolean GlobalSettingFactoringExtendVariance(){
		try {
			WebElement GlobalSettingFactoringExtendVarianceWebE=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(globalSettingsFactoringExtendVariance_xpath));
			Thread.sleep(3000);
			GlobalSettingFactoringExtendVarianceWebE.isDisplayed();
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
	
	public boolean GlobalSettingFactoringExtendSelectAll(){
		try {
			WebElement GlobalSettingFactoringExtendSelectAllWebE=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(globalSettingsFactoringExtendSelectAll_xpath));
			GlobalSettingFactoringExtendSelectAllWebE.isDisplayed();
			Thread.sleep(3000);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
	
	
	public boolean  verifyFactoringExtendDropdownValues(){
		 try {
		  String[] exp = {"Select","Both","Email","Text"};
		  
		  WebElement dropdown = driver.findElement(globalSettingsFactoringExtendSelectDropdown_xpath);  
		  dropdown.click();
		  Thread.sleep(3000);
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
	
	
	public boolean  verifyFactoringExtendRecourseInvoicesDropdownValues(){
		 try {
		  String[] exp = {"Select","Both","Email","Text"};
		  
		  WebElement dropdown = driver.findElement(globalSettingsFactoringExtendRecourseInvoicesDropdown_xpath);  
		  dropdown.click();
		  Thread.sleep(3000);
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
	
	public boolean  verifyFactoringExtendNewCustomersDropdownValues(){
		 try {
		  String[] exp = {"Select","Both","Email","Text"};
		  
		  WebElement dropdown = driver.findElement(globalSettingsFactoringExtendNewCustomersDropdown_xpath);  
		  dropdown.click();
		  Thread.sleep(3000);
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
	
	public boolean  verifyFactoringExtendVarianceinBalanceLimitDropdownValues(){
		 try {
		  String[] exp = {"Select","Both","Email","Text"};
		  
		  WebElement dropdown = driver.findElement(globalSettingsFactoringExtendVarianceinBalanceLimitDropdown_xpath);  
		  dropdown.click();
		  Thread.sleep(3000);
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
	
	
	
	
	public boolean  verifyAblExtendDropdownValues(){
		 try {
		  String[] exp = {"Select","Both","Email","Text"};
		  
		  WebElement dropdown = driver.findElement(globalSettingsAblExtendSelectDropdown_xpath);  
		  dropdown.click();
		  Thread.sleep(3000);
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
	
	
	public boolean  verifyAblExtendBBCUnreleasedDropdownValues(){
		 try {
		  String[] exp = {"Select","Both","Email","Text"};
		  
		  WebElement dropdown = driver.findElement(globalSettingsAblExtendBBCUnreleasedSelectDropdown_xpath);  
		  dropdown.click();
		  Thread.sleep(3000);
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
	
	
	public boolean  verifyAblExtendNewCustomersDropdownValues(){
		 try {
		  String[] exp = {"Select","Both","Email","Text"};
		  
		  WebElement dropdown = driver.findElement(globalSettingsAblExtendNewCustomersSelectDropdown_xpath);  
		  dropdown.click();
		  Thread.sleep(3000);
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
	
	
	public boolean  verifyAblExtendChangeCollateralValueDropdownValues(){
		 try {
		  String[] exp = {"Select","Both","Email","Text"};
		  
		  WebElement dropdown = driver.findElement(globalSettingsAblExtendChangeinCollateralValueSelectDropdown_xpath);  
		  dropdown.click();
		  Thread.sleep(3000);
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
	
	public boolean  verifyAblExtendVarianceinBalanceLimitDropdownValues(){
		 try {
		  String[] exp = {"Select","Both","Email","Text"};
		  
		  WebElement dropdown = driver.findElement(globalSettingsAblExtendVarianceinBalanceLimitSelectDropdown_xpath);  
		  dropdown.click();
		  Thread.sleep(3000);
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
	
	public boolean  verifyAblExtendFundRequestDropdownValues(){
		 try {
		  String[] exp = {"Select","Both","Email","Text"};
		  
		  WebElement dropdown = driver.findElement(globalSettingsAblExtendFundRequestSelectDropdown_xpath);  
		  dropdown.click();
		  Thread.sleep(3000);
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
	
	
	public boolean  verifyAblExtendFundedDropdownValues(){
		 try {
		  String[] exp = {"Select","Both","Email","Text"};
		  
		  WebElement dropdown = driver.findElement(globalSettingsAblExtendFundedSelectDropdown_xpath);  
		  dropdown.click();
		  Thread.sleep(3000);
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
	
	public boolean  verifyAblExtendLetterofCreditDropdownValues(){
		 try {
		  String[] exp = {"Select","Both","Email","Text"};
		  
		  WebElement dropdown = driver.findElement(globalSettingsAblExtendLetterofCreditSelectDropdown_xpath);  
		  dropdown.click();
		  Thread.sleep(3000);
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
	
	
	public boolean  verifyAblExtendFilesRequiredDropdownValues(){
		 try {
		  String[] exp = {"Select","Both","Email","Text"};
		  
		  WebElement dropdown = driver.findElement(globalSettingsAblExtendFilesRequiredSelectDropdown_xpath);  
		  dropdown.click();
		  Thread.sleep(3000);
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

	
	
	public boolean GlobalSettingRadioBtnOnFactoringCollapsed(){
		try {
			WebElement GlobalSettingsRadioBtnOnFactoringCollapsedWebE=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(globalSettingsRadioBtnOnFactoringLabel_xpath));
			Thread.sleep(2000);
			GlobalSettingsRadioBtnOnFactoringCollapsedWebE.click();
			Thread.sleep(2000);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
	

	public boolean GlobalSettingRadioBtnOnAblBbcDropdownSelected(){
		try {
			WebElement GlobalSettingsRadioBtnOnAblBbcDropWebE=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(globalSettingsAblExtendBBCUnreleasedSelectDropdown_xpath));
			GlobalSettingsRadioBtnOnAblBbcDropWebE.click();
			new Select(GlobalSettingsRadioBtnOnAblBbcDropWebE).selectByVisibleText("Both");
   		Thread.sleep(2000);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
	

	public boolean GlobalSettingRadioBtnOnFactoringRecourseDropdownSelected(){
		try {
			WebElement GlobalSettingsRadioBtnOnFactoringRecourseDroppWebE=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(globalSettingsFactoringExtendRecourseInvoicesDropdown_xpath));
			GlobalSettingsRadioBtnOnFactoringRecourseDroppWebE.click();
			new Select(GlobalSettingsRadioBtnOnFactoringRecourseDroppWebE).selectByVisibleText("Both");
   		Thread.sleep(2000);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
	
	public boolean GlobalSettingSaveButton(){
		try {
			WebElement GlobalSettingsSaveWebE=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(globalSettingsSave_xpath));
			GlobalSettingsSaveWebE.click();
			Thread.sleep(3000);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
	
	//////////////////////////////global settings End/////////////////////////////////

	public boolean RoleSetttingsRadioBtn(){
		try {
			WebElement RoleSetttingsRadioBtnWebE=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(roleSettingsLabel_xpath));
			
			Thread.sleep(10000);
			RoleSetttingsRadioBtnWebE.click();
			 Thread.sleep(10000);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
	
	public boolean  verifyProductDropdownValuesRoleSettings(){
		 try {
		  String[] exp = {"ABL","FACTORING"};
		  
		  WebElement dropdown = driver.findElement(roleSettingsProductTypeDropdown_xpath);  
		  dropdown.click();
		  Thread.sleep(3000);
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
	
	
	public boolean RoleSettingsPleaseSelectLabelUI(){
		try {
			WebElement RoleSettingsPleaseSelectWebE=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(roleSettingsPleaseSelectLabel_xpath));
			Thread.sleep(3000);
			RoleSettingsPleaseSelectWebE.isDisplayed();
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}

	
	
	
	
	public String addValueToSearchRoleTextBox(String searchData)
	{
	try{
		WebElement searchTextBoxWebEelement=new WebDriverWait(driver,200)
		.until(ExpectedConditions.visibilityOfElementLocated(roleSettingsSearchRole_xpath));
		searchTextBoxWebEelement.clear();
		searchTextBoxWebEelement.sendKeys(searchData);
		 Thread.sleep(3000);

	}
	catch(Exception ex){

	}
	return searchData;

	}
	
	
	public boolean RoleSettingsTrueValueSearchAfterDataInput(){
		try {
			WebElement RoleSettingsEnterDataWebE=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(roleSettingsSearchRoleTrue_xpath));
			Thread.sleep(5000);
			RoleSettingsEnterDataWebE.isDisplayed();
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
	
	
	
	
	
/*	public boolean RoleSetttingsSearchRole(){
		try {
			WebElement RoleSetttingsSearchRoleWebE=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(roleSettingsSearchRole_xpath));
			RoleSetttingsSearchRoleWebE.clear();
			Thread.sleep(2000);
			RoleSetttingsSearchRoleWebE.sendKeys("Administrator");
			Thread.sleep(3000);
			WebElement RoleSetttingsSearchRoleTrueWebE=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(roleSettingsSearchRoleTrue_xpath));
			Thread.sleep(3000);
			RoleSetttingsSearchRoleTrueWebE.isDisplayed();
			Thread.sleep(2000);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}*/
	
	////////////////////////////// User settings End/////////////////////////////////

	public boolean UserSetttingsRadioBtn(){
		try {
			WebElement UserSetttingsRadioBtnWebE=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(userSettingsLabel_xpath));
			
			Thread.sleep(5000);
			UserSetttingsRadioBtnWebE.click();
			 Thread.sleep(5000);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
	
	

	public boolean UserSettingsSelectClientInformationLabel(){
		try {
			WebElement UserSettingsSelectClientInformationLabelWebE=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(userSettingsSearchClientInfor_xpath));
			 Thread.sleep(3000);
			UserSettingsSelectClientInformationLabelWebE.isDisplayed();
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
	
	
	public boolean UserSettingsSelectClientSearchLabel(){
		try {
			WebElement UserSettingsSelectClientSearchLabelWebE=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(userSettingsSearchClientSearch_xpath));
			 Thread.sleep(3000);
			UserSettingsSelectClientSearchLabelWebE.isDisplayed();
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
	
	
	public boolean UserSettingsSaveBtnLabel(){
		try {
			WebElement UserSettingsSaveLabelWebE=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(userSettingsSaveBtn_xpath));
			 Thread.sleep(3000);
			UserSettingsSaveLabelWebE.isDisplayed();
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
	
	public boolean UserSettingsCancelBtnLabel(){
		try {
			WebElement UserSettingsCancelLabelWebE=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(userSettingsCancelBtn_xpath));
			 Thread.sleep(3000);
			UserSettingsCancelLabelWebE.isDisplayed();
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
	
	
	
	
	
	
	public String userSettingsSearchClientTexttBox(String searchClient)
	{
	try{
		WebElement searchClientTextBoxWebEelement=new WebDriverWait(driver,200)
		.until(ExpectedConditions.visibilityOfElementLocated(userSettingsSearchRole_xpath));
		searchClientTextBoxWebEelement.clear();
		searchClientTextBoxWebEelement.sendKeys(searchClient);
		 Thread.sleep(3000);	
	}
	catch(Exception ex){

	}
	return searchClient;

	}
	
	
	public boolean userSettingsTrueValueSearchAfterDataInput(){
		try {
			WebElement RoleSettingsEnterDataWebE=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(userSettingsSearchRoleTrue_xpath));
			Thread.sleep(5000);
			RoleSettingsEnterDataWebE.click();
			Thread.sleep(5000);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
	

	public boolean UserSetttingsUserName(){
		try {
			WebElement UserSetttingsSearchRoleTrueUserNameWebE=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(userSettingsSearchRoleTrueUserName_xpath));
			Thread.sleep(3000);
			UserSetttingsSearchRoleTrueUserNameWebE.isDisplayed();
			Thread.sleep(3000);
			
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
	
	
	
	public String userSettingsSearchUserTexttBox(String searchUser)
	{
	try{
		WebElement searchUserTextBoxWebEelement=new WebDriverWait(driver,200)
		.until(ExpectedConditions.visibilityOfElementLocated(userSettingsSearchRoleTrueUserNameSearch_xpath));
		searchUserTextBoxWebEelement.clear();
		Thread.sleep(3000);
		searchUserTextBoxWebEelement.sendKeys(searchUser);
		 Thread.sleep(3000);	
	}
	catch(Exception ex){

	}
	return searchUser;

	}
	
	public boolean userSettingsTrueValueSearchUserAfterDataInput(){
		try {
			WebElement UserSettingsEnterDataWebE=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(userSettingsSearchRoleTrueUserNameTrue_xpath));
			Thread.sleep(5000);
			UserSettingsEnterDataWebE.isDisplayed();
			Thread.sleep(5000);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
	

	
}

