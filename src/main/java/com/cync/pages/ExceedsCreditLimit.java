package com.cync.pages;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.cync.base.BasePage;
	
	
	public class ExceedsCreditLimit extends BasePage{

		
		private final By ExceedsCreditLimit_xpath=By.xpath("//span[contains(text(),'Exceeds Credit Limit')]");
		private final By ExceedCreditLimitSystemDefined_xpath=By.xpath("(//i[@class='fa fa-check-square'])[7]");
		private final By  CalculateOnNegativeEligibleBalance_xpath=By.xpath("(//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default'])[1]");
		private final By save_xpath=By.xpath("//span[contains(text(),' Save ')]");
		private final By selectAllValues_xpath = By.xpath("//button[@class='moveall arrow-btnstyle']");
		private final By saveOnIneligibleReasons_xpath = By.id("apply_calculations");
		private final By unselectAllValues_xpath = By.xpath("//button[@class='removeall arrow-btnstyle']");
		private final By ExceedsCreditLimitField_Xpath = By.xpath("(//option[contains(text(),'Exceeds Credit Limit')])[1]");
		private final By finalDefferedRevenue_xpath = By.xpath("//button[@class='move arrow-btnstyle']");
		private final By ClickonRecordsPerPageDropdown_Xpath=By.xpath("//select[@class='ui-pg-selbox ui-widget-content ui-corner-all']");
		private final By menuItem_xpath = By.id("top-menu");
		private final By debtors_xpath=By.xpath("//a[contains(text(),'Debtors')]");
		private final By navigateto_3rd_page_Xpath=By.xpath("//span[@class='ui-icon ui-icon-seek-next']");
		
		private final By ReceivablesDoubleClick_xpath = By.xpath("(//td[@aria-describedby='customers_list_credit_limit'])[2]");
		private final By CreditLimitTextbox_xpath = By.id("1372567_credit_limit");
		private final By SaveonDebtors_Xpath = By.xpath("//span[@class='ui-icon ui-icon ui-icon-disk']");
		private final By CloseOnPopUp_Xpath = By.id("closedialog");
		private final By BBCRecalculationProcess_xpath=By.xpath("//a[contains(text(),'BBC Recalculation Process')]");
		private final By BBCRecalculationProcessButton_xpath=By.xpath("//a[contains(text(),'Process/Re-Calculate BBC')]");
		private final By ReceivableAging_xpath=By.xpath("//a[contains(text(),'Receivable Aging')]");
		private final By IneligibilityReason_Xpath=By.xpath("//td[contains(text(),'Totals')]");
		private final By IneligibilityAmount_Xpath=By.xpath("(//td[contains(text(),'0.00')])[1]");
		private final By ReceivablesDoubleClick_Negative_xpath = By.xpath("(//td[@aria-describedby='customers_list_credit_limit'])[7]");
		private final By CreditLimitTextboxNegative_xpath = By.id("1372556_credit_limit");
		private final By GreaterthanCreditLimit_xpath = By.xpath("(//td[@aria-describedby='customers_list_credit_limit'])[1]");
		private final By GreaterthanCreditLimitTextbox_xpath = By.id("1372558_credit_limit");
		private final By IneligibilityReasonGreaterthan_CreditLimit_Xpath=By.xpath("//td[contains(text(),'Exceeds Credit Limit')]");
		private final By IneligibilityAmountGreaterthan_CreditLimit_Xpath=By.xpath("(//td[contains(text(),'800.00')])[1]");
		private final By DebtorParentChildRelationS_xpath=By.xpath("(//a[contains(text(),'Debtor Parent Child Relation')])[1]");
		private final By Addcustomerparentchildlist_xpath = By.id("add_customer_parent_child_list");
		private final By ParentTextbox_xpath = By.id("jqg1_parent_name");
		private final By selectingdebtor_xpath=By.xpath("(//li[@class='ui-menu-item'])[1]");
		private final By ChildTextbox_xpath = By.id("jqg1_child_name");
		private final By selectingChilddebtor_xpath=By.xpath("(//li[@class='ui-menu-item'])[2]");
		private final By IneligibilityReasonParent_Greaterthan_CreditLimit_Xpath=By.xpath("//td[contains(text(),'Exceeds Credit Limit')]");
		private final By IneligibilityAmountParent_Greaterthan_CreditLimit_Xpath=By.xpath("(//td[contains(text(),'500.00')])[1]");
		
		private final By BucketAging_xpath = By.xpath("//a[contains(text(),'Bucket Aging')]");
		private final By clickOnAdd_xpath = By.xpath("(//span[@class='ui-icon ui-icon ui-icon-plus'])[1]");
		private final By Textbox_xpath = By.xpath("//input[@class='form-control search-input-text ng-valid ng-dirty ng-touched']");
		
		public ExceedsCreditLimit(WebDriver driver) {
			super(driver);
			// TODO Auto-generated constructor stub
		}

		

		public boolean VerifyExceedCreditLaimit()
		{
		 
		try{
			this.VerifyExceedCreditLimit("Data");
			WebElement ExceedCreditLimitWebElement=new WebDriverWait(driver,10)
				.until(ExpectedConditions.visibilityOfElementLocated(ExceedsCreditLimit_xpath));
			ExceedCreditLimitWebElement.isDisplayed();
			Thread.sleep(3000);
			
			return true;
			} catch (Exception e) {
				return false;
			}

			}
		
		public boolean VerifyExceedCreditLimit(String Data)
		{
		 
		try{
			WebElement ExceedCreditLimitWebElement=new WebDriverWait(driver,10)
				.until(ExpectedConditions.visibilityOfElementLocated(Textbox_xpath));
			ExceedCreditLimitWebElement.sendKeys(Data);
			Thread.sleep(3000);
			
			return true;
			} catch (Exception e) {
				return false;
			}

			}
		
		
		public boolean ValidationExceedCreditLimitSystemDefined()
		{
		 
		try{
			WebElement ExceedCreditLimitWebElement=new WebDriverWait(driver,10)
				.until(ExpectedConditions.visibilityOfElementLocated(ExceedCreditLimitSystemDefined_xpath));
			ExceedCreditLimitWebElement.isEnabled();
			Thread.sleep(3000);
			
			return true;
			} catch (Exception e) {
				return false;
			}

			}
		
		

		public boolean alculateOnNegativeEligibleBalance()
		{
		 
		try{
			WebElement ExceedCreditLimitWebElement=new WebDriverWait(driver,10)
				.until(ExpectedConditions.visibilityOfElementLocated(CalculateOnNegativeEligibleBalance_xpath));
			ExceedCreditLimitWebElement.click();
			Thread.sleep(3000);
			
			return true;
			} catch (Exception e) {
				return false;
			}

			}
		
		public boolean ClickOnSave()
		{
		 
		try{
			WebElement ExceedCreditLimitWebElement=new WebDriverWait(driver,10)
				.until(ExpectedConditions.visibilityOfElementLocated(save_xpath));
			ExceedCreditLimitWebElement.click();
			Thread.sleep(1000);
			
			return true;
			} catch (Exception e) {
				return false;
			}

			}
		
		
		public  boolean selectAllReasons() {
			try {
				WebElement selectAllReasonsWebE=new WebDriverWait(driver,20)
				.until(ExpectedConditions.visibilityOfElementLocated(selectAllValues_xpath));
				selectAllReasonsWebE.click();
				Thread.sleep(100);
				return true;
			}
			 catch (Exception e) {
				// TODO: handle exception
				return false;
			}
		}
		
		public  boolean removeAllList() {
			try {
				WebElement removeAllListWebE=new WebDriverWait(driver,20)
				.until(ExpectedConditions.visibilityOfElementLocated(unselectAllValues_xpath));
				removeAllListWebE.click();
				Thread.sleep(100);
				return true;
			}
			 catch (Exception e) {
				// TODO: handle exception
				return false;
			}
		}
		
		public  boolean selectExceedsCreditLimitt() {
			try {
				WebElement selectUninsuiredWebE=new WebDriverWait(driver,20)
				.until(ExpectedConditions.visibilityOfElementLocated(ExceedsCreditLimitField_Xpath));
				selectUninsuiredWebE.click();
				Thread.sleep(100);
				return true;
			}
			 catch (Exception e) {
				// TODO: handle exception
				return false;
			}
		}
		
		public  boolean finalExceedsCreditLimit() {
			try {
				WebElement finalUninsuiredWebE=new WebDriverWait(driver,20)
				.until(ExpectedConditions.visibilityOfElementLocated(finalDefferedRevenue_xpath));
				finalUninsuiredWebE.click();
				
				
				Thread.sleep(1000);
				return true;
			}
			 catch (Exception e) {
				// TODO: handle exception
				return false;
			}
		}

		public  boolean saveOnIneligibleCalculation() {
			try {
			WebElement saveOnIneligibleReasonsWebE=new WebDriverWait(driver,20)
			.until(ExpectedConditions.visibilityOfElementLocated(saveOnIneligibleReasons_xpath));
			saveOnIneligibleReasonsWebE.click();
			this.isAlertPresent();
			Thread.sleep(1000);
			
			return true;
		}
		 catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}

		public boolean selectExceedsCreditLimit() {
			 try {
				 this.selectAllReasons();
				 this.removeAllList();
				 this.selectExceedsCreditLimitt();
				 this.finalExceedsCreditLimit();
				 this.saveOnIneligibleCalculation();
				 
				 return true;
			 	}
			 
		catch (Exception ex) {
		    return false;
						}
			
		}



		public boolean verifyExceedsCreditLimitField() {
			try {
				WebElement saveOnIneligibleReasonsWebE=new WebDriverWait(driver,20)
				.until(ExpectedConditions.visibilityOfElementLocated(ExceedsCreditLimitField_Xpath));
				saveOnIneligibleReasonsWebE.isDisplayed();
				Thread.sleep(1000);
				
				return true;
			}
			 catch (Exception e) {
				// TODO: handle exception
				return false;
			}
		}
		
		public boolean UnselectExceedsCreditLimit() {
			try {
				 this.selectAllReasons();
				 this.removeAllList();
				
				 
				 return true;
			 	}
			 
		catch (Exception ex) {
		    return false;
						}
			
		}
		
		public  boolean ClickonRecordsPerPageDropdown(String PageValue) {
			try {
				WebElement DropdownWebEelement = new WebDriverWait(driver, 10)
				.until(ExpectedConditions.visibilityOfElementLocated(ClickonRecordsPerPageDropdown_Xpath));
				Select sel = new Select(DropdownWebEelement);
				
				List<WebElement> list = sel.getOptions();
				
				for (WebElement ele : list) 
				{
					/*String data = ele.getText();
					System.out.println(data);*/
					
					if (ele.getText().equals(PageValue)) 
					{
				 		ele.click();
						//Thread.sleep(10000);
						
						 return true;
					}
				}
			} 
			catch (Exception ex)
			{
				return false;
			}
			return false;
			

		}
		
		public boolean openDebtors() {
			 try {
				 Thread.sleep(3000);
				 this.MouseOverOnMenu();
				 this.moveToLeftNavigation("ABL");
				 WebElement IneligibleCalculationPageWebElement = new WebDriverWait(driver, 1000)
				 .until(ExpectedConditions.elementToBeClickable(debtors_xpath));
				 IneligibleCalculationPageWebElement.click();
				 Thread.sleep(1000);
				 this.isAlertPresent();
				 Thread.sleep(1000);
				 return true;
			 	}
			 
		catch (Exception ex) {
		    return false;
						}
			
		}
		
		public boolean openBucketAging() {
			 try {
				 Thread.sleep(5000);
				 this.MouseOverOnMenu();
				 this.moveToLeftNavigation("Client Maintenance");
				 WebElement IneligibleCalculationPageWebElement = new WebDriverWait(driver, 1000)
				 .until(ExpectedConditions.elementToBeClickable(BucketAging_xpath));
				 IneligibleCalculationPageWebElement.click();
				 Thread.sleep(1000);
				 this.isAlertPresent();
				 Thread.sleep(1000);
				 return true;
			 	}
			 
		catch (Exception ex) {
		    return false;
						}
			
		}
		
		public boolean clickOnAdd() {
			try {
			    WebElement menuItemWebE = new WebDriverWait(driver, 10)
			    .until(ExpectedConditions.visibilityOfElementLocated(clickOnAdd_xpath));
			    menuItemWebE.click();

			    return true;
			} catch (Exception ex) {
			    return false;
			}
		    }
		
		public boolean MouseOverOnMenu() {
			try {
			    WebElement menuItemWebE = new WebDriverWait(driver, 10)
				    .until(ExpectedConditions
					    .visibilityOfElementLocated(menuItem_xpath));
			    menuItemWebE.click();

			    return true;
			} catch (Exception ex) {
			    return false;
			}
		    }

			    public boolean moveToLeftNavigation(String navigation_Name) {
				try {
				    By menuContainerWebE_xpath = By.xpath("//ul[@id='menu']");
				    WebElement menuContainerWebE = new WebDriverWait(driver, 10)
				    		.until(ExpectedConditions.visibilityOfElementLocated(menuContainerWebE_xpath));
				    List<WebElement> menuWebL = menuContainerWebE.findElements(By
					    .tagName("li"));
				    for (WebElement option : menuWebL) {
					String title = option.getText();
					if (title.equals(navigation_Name)) {
					    new Actions(driver).moveToElement(option).perform();
					    return true;
					}

				    }
				    return false;
				} catch (Exception ex) {
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

			    public boolean definingCreditLimit_Zero1() {
					try {
						this.navigateto_3rd_page();
						this.dubbleClickOnDebtor_Zero();
						this.setCreditLimitValue("5000");
						this.saveOnDebtorsScreen();
						this.closeOnPopUp();
						return true;
						 }
						 
					catch (Exception ex) {
					    return false;
									}
										}
					

				public boolean definingCreditLimit_Zero() {
				try {
					this.navigateto_3rd_page();
					this.dubbleClickOnDebtor_Zero();
					this.setCreditLimitValue("0");
					this.saveOnDebtorsScreen();
					this.closeOnPopUp();
					return true;
					 }
					 
				catch (Exception ex) {
				    return false;
								}
									}
				
				public boolean navigateto_3rd_page(){
					try{
					
					WebElement navigateto_3rd_pageWebE=new WebDriverWait(driver,20)
					.until(ExpectedConditions.visibilityOfElementLocated(navigateto_3rd_page_Xpath));
					Thread.sleep(100);
					navigateto_3rd_pageWebE.click();
					Thread.sleep(1000);
					navigateto_3rd_pageWebE.click();
					Thread.sleep(10000);
					
					return true;
				}
					 catch (Exception e) {
							// TODO: handle exception
							return false;
						}
				}
		
				public boolean dubbleClickOnDebtor_Zero(){
					try{
					
					WebElement element=new WebDriverWait(driver,100)
					.until(ExpectedConditions.visibilityOfElementLocated(ReceivablesDoubleClick_xpath));
					//Double click
					Actions action = new Actions(driver);
					action.doubleClick(element).build().perform();
					Thread.sleep(2000);
					return true;
				}
					 catch (Exception e) {
							// TODO: handle exception
							return false;
						}
				}
				
				public boolean setCreditLimitValue(String Value){
					try{
					
					WebElement setUninsuredValueWebE=new WebDriverWait(driver,20)
					.until(ExpectedConditions.visibilityOfElementLocated(CreditLimitTextbox_xpath));
					Thread.sleep(100);
					setUninsuredValueWebE.clear();
					setUninsuredValueWebE.sendKeys(Value);
					Thread.sleep(500);			
					return true;
				}
					 catch (Exception e) {
							// TODO: handle exception
							return false;
						}
				}
				
				public boolean saveOnDebtorsScreen(){
					try{
					
					WebElement saveOnDebtorsScreeneWebE=new WebDriverWait(driver,20)
					.until(ExpectedConditions.visibilityOfElementLocated(SaveonDebtors_Xpath));
					Thread.sleep(100);
					saveOnDebtorsScreeneWebE.click();
					Thread.sleep(500);			
					return true;
				}
					 catch (Exception e) {
							// TODO: handle exception
							return false;
						}
				}

		 
				 

				public  boolean closeOnPopUp(){
					try{
					WebElement saveOnDebtorsScreeneWebE=new WebDriverWait(driver,20)
					.until(ExpectedConditions.visibilityOfElementLocated(CloseOnPopUp_Xpath));
					Thread.sleep(100);
					saveOnDebtorsScreeneWebE.click();
					return true;
						}
					catch (Exception e) {
							return false;
						}
				}
				
				public boolean recalculatingBBC() {
					try {
						this.openBbcRecalculationProcess();
						this.clickOnProcessButton();
						return true;
						 }
						 
					catch (Exception ex) {
					    return false;
									}
						
					}
				
				public boolean openBbcRecalculationProcess() {
					 try {
						 this.MouseOverOnMenu();
						 this.moveToLeftNavigation("ABL");
						 WebElement IneligibleCalculationPageWebElement = new WebDriverWait(driver, 1000)
						 .until(ExpectedConditions.elementToBeClickable(BBCRecalculationProcess_xpath));
						 IneligibleCalculationPageWebElement.click();
						 this.isAlertPresent();
						 Thread.sleep(1000);
						 return true;
					 	}
					 
				catch (Exception ex) {
				    return false;
								}
					
				}

				

				public  boolean clickOnProcessButton() {
					 try {
						  WebElement IneligibleCalculationPageWebElement = new WebDriverWait(driver, 1000)
						 .until(ExpectedConditions.elementToBeClickable(BBCRecalculationProcessButton_xpath));
						 IneligibleCalculationPageWebElement.click();
						 Thread.sleep(2000);
						 Alert simpleAlert = driver.switchTo().alert();
						 simpleAlert.accept();
						 Thread.sleep(2000);
						 simpleAlert.accept();
						 Thread.sleep(2000);
						 return true;
						 }
					 
				catch (Exception ex) {
				    return false;
								}
			}
				
				 public  boolean navigateToReceivableAgingScreen() {
					 try {
						 this.MouseOverOnMenu();
						 this.moveToLeftNavigation("ABL");
						 WebElement navigateToIneligibleSummaryWebElement = new WebDriverWait(driver, 1000)
						 .until(ExpectedConditions.elementToBeClickable(ReceivableAging_xpath));
						 navigateToIneligibleSummaryWebElement.click();
						 this.isAlertPresent();
						 Thread.sleep(1000);
						 return true;
					 	}
					 
				catch (Exception ex) {
				    return false;
								}
					
				}
				 
				 public  boolean verifyIneligibilityReason(String ReasonData){
						try{
						WebElement verifyIneligibilityReasonWebE=new WebDriverWait(driver,20)
						.until(ExpectedConditions.visibilityOfElementLocated(IneligibilityReason_Xpath));
						Thread.sleep(100);
						String ActualReason = verifyIneligibilityReasonWebE.getText();
						if(ActualReason.equalsIgnoreCase(ReasonData))
						{
						System.out.println(ActualReason);
						return true;
						}
						else
						{
							System.out.println("ffffffffffffffffffffffffffffff");
						}

						}
						catch (Exception e) {
								return false;
							}
						return false;
						
					}
				 
				 public  boolean verifyIneligibilityAmount(String ReasonAmount){
						try{
						WebElement verifyIneligibilityAmountWebE=new WebDriverWait(driver,20)
						.until(ExpectedConditions.visibilityOfElementLocated(IneligibilityAmount_Xpath));
						Thread.sleep(100);
						String ActualAmount = verifyIneligibilityAmountWebE.getText();
						if(ActualAmount.equalsIgnoreCase(ReasonAmount))
						{
							System.out.println(ActualAmount);
							return true;
							}
						else
						{
							System.out.println("ffffffffffffffffffffffffffffff");
						}
						
						}
							catch (Exception e) {
									return false;
								}
						return false;
						}
					
				 public boolean definingCreditLimit_Negative() {
						try {
							
							this.dubbleClickOnDebtor_Negative();
							this.setCreditLimitValue_Negative("70000");
							this.saveOnDebtorsScreen();
							this.closeOnPopUp();
							return true;
							 }
							 
						catch (Exception ex) {
						    return false;
										}
											}



				public boolean dubbleClickOnDebtor_Negative(){
					try{
					
					WebElement element=new WebDriverWait(driver,100)
					.until(ExpectedConditions.visibilityOfElementLocated(ReceivablesDoubleClick_Negative_xpath));
					//Double click
					Actions action = new Actions(driver);
					action.doubleClick(element).build().perform();
					Thread.sleep(2000);
					return true;
				}
					 catch (Exception e) {
							// TODO: handle exception
							return false;
						}
				}
				
				public boolean setCreditLimitValue_Negative(String Value){
					try{
					
					WebElement setUninsuredValueWebE=new WebDriverWait(driver,20)
					.until(ExpectedConditions.visibilityOfElementLocated(CreditLimitTextboxNegative_xpath));
					Thread.sleep(100);
					setUninsuredValueWebE.clear();
					setUninsuredValueWebE.sendKeys(Value);
					Thread.sleep(500);			
					return true;
				}
					 catch (Exception e) {
							// TODO: handle exception
							return false;
						}
				}
				
				public boolean definingCreditLimitt_Zeroo() {
					try {
						
						this.dubbleClickOnDebtor_Negative();
						this.setCreditLimitValue_Negative("00000");
						this.saveOnDebtorsScreen();
						this.closeOnPopUp();
						return true;
						 }
						 
					catch (Exception ex) {
					    return false;
									}
										}
				
				public boolean definingCreditLimit_GreaterthanCreditLimit() {
					try {
						this.navigateto_2rd_page();
						this.dubbleClickOnDebtor_GreaterthanCreditLimit();
						this.setCreditLimitValue_GreaterthanCreditLimit("1200");
						this.saveOnDebtorsScreen();
						this.closeOnPopUp();
						return true;
						 }
						 
					catch (Exception ex) {
					    return false;
									}
										}
				public boolean navigateto_2rd_page(){
					try{
					
					WebElement navigateto_3rd_pageWebE=new WebDriverWait(driver,20)
					.until(ExpectedConditions.visibilityOfElementLocated(navigateto_3rd_page_Xpath));
					Thread.sleep(100);
					navigateto_3rd_pageWebE.click();
					Thread.sleep(1000);
					/*navigateto_3rd_pageWebE.click();
					Thread.sleep(10000);*/
					
					return true;
				}
					 catch (Exception e) {
							// TODO: handle exception
							return false;
						}
				}
				
				public boolean dubbleClickOnDebtor_GreaterthanCreditLimit(){
					try{
					
					WebElement element=new WebDriverWait(driver,100)
					.until(ExpectedConditions.visibilityOfElementLocated(GreaterthanCreditLimit_xpath));
					//Double click
					Actions action = new Actions(driver);
					action.doubleClick(element).build().perform();
					Thread.sleep(2000);
					return true;
				}
					 catch (Exception e) {
							// TODO: handle exception
							return false;
						}
				}
				
				public boolean setCreditLimitValue_GreaterthanCreditLimit(String Value){
					try{
					
					WebElement setUninsuredValueWebE=new WebDriverWait(driver,20)
					.until(ExpectedConditions.visibilityOfElementLocated(GreaterthanCreditLimitTextbox_xpath));
					Thread.sleep(100);
					setUninsuredValueWebE.clear();
					setUninsuredValueWebE.sendKeys(Value);
					Thread.sleep(500);			
					return true;
				}
					 catch (Exception e) {
							// TODO: handle exception
							return false;
						}
				}
				
				public  boolean verifyIneligibilityReason_Greaterthan_CreditLimit(String ReasonData){
					try{
					WebElement verifyIneligibilityReasonWebE=new WebDriverWait(driver,20)
					.until(ExpectedConditions.visibilityOfElementLocated(IneligibilityReasonGreaterthan_CreditLimit_Xpath));
					Thread.sleep(100);
					String ActualReason = verifyIneligibilityReasonWebE.getText();
					if(ActualReason.equalsIgnoreCase(ReasonData))
					{
					System.out.println(ActualReason);
					return true;
					}
					else
					{
						System.out.println("ffffffffffffffffffffffffffffff");
					}

					}
					catch (Exception e) {
							return false;
						}
					return false;
					
				}
			 
			 public  boolean verifyIneligibilityAmount_Greaterthan_CreditLimit(String ReasonAmount){
					try{
					WebElement verifyIneligibilityAmountWebE=new WebDriverWait(driver,20)
					.until(ExpectedConditions.visibilityOfElementLocated(IneligibilityAmountGreaterthan_CreditLimit_Xpath));
					Thread.sleep(100);
					String ActualAmount = verifyIneligibilityAmountWebE.getText();
					if(ActualAmount.equalsIgnoreCase(ReasonAmount))
					{
						System.out.println(ActualAmount);
						return true;
						}
					else
					{
						System.out.println("ffffffffffffffffffffffffffffff");
					}
					
					}
						catch (Exception e) {
								return false;
							}
					return false;
					}
				
			 public boolean definingCreditLimit_LesserthanCreditLimit() {
					try {
						this.navigateto_2rd_page();
						this.dubbleClickOnDebtor_GreaterthanCreditLimit();
						this.setCreditLimitValue_LesserthanCreditLimit("2100");
						this.saveOnDebtorsScreen();
						this.closeOnPopUp();
						return true;
						 }
						 
					catch (Exception ex) {
					    return false;
									}
										}
			 public boolean setCreditLimitValue_LesserthanCreditLimit(String Value){
					try{
					
					WebElement setUninsuredValueWebE=new WebDriverWait(driver,20)
					.until(ExpectedConditions.visibilityOfElementLocated(GreaterthanCreditLimitTextbox_xpath));
					Thread.sleep(100);
					setUninsuredValueWebE.clear();
					setUninsuredValueWebE.sendKeys(Value);
					Thread.sleep(500);			
					return true;
				}
					 catch (Exception e) {
							// TODO: handle exception
							return false;
						}
				}
			 
			 public boolean definingCreditLimit_EqualCreditLimit() {
					try {
						this.navigateto_2rd_page();
						this.dubbleClickOnDebtor_GreaterthanCreditLimit();
						this.setCreditLimitValue_EqualCreditLimit("2000");
						this.saveOnDebtorsScreen();
						this.closeOnPopUp();
						return true;
						 }
						 
					catch (Exception ex) {
					    return false;
									}
										}
			 public boolean setCreditLimitValue_EqualCreditLimit(String Value){
					try{
					
					WebElement setUninsuredValueWebE=new WebDriverWait(driver,20)
					.until(ExpectedConditions.visibilityOfElementLocated(GreaterthanCreditLimitTextbox_xpath));
					Thread.sleep(100);
					setUninsuredValueWebE.clear();
					setUninsuredValueWebE.sendKeys(Value);
					Thread.sleep(500);			
					return true;
				}
					 catch (Exception e) {
							// TODO: handle exception
							return false;
						}
				}
			 
			 public boolean openDebtorParentChildRelationScreen() {
				 try {
					 Thread.sleep(5000);
					 this.MouseOverOnMenu();
					 this.moveToLeftNavigation("ABL");
					 WebElement IneligibleCalculationPageWebElement = new WebDriverWait(driver, 1000)
					 .until(ExpectedConditions.elementToBeClickable(DebtorParentChildRelationS_xpath));
					 IneligibleCalculationPageWebElement.click();
					 Thread.sleep(1000);
					 this.isAlertPresent();
					 Thread.sleep(1000);
					 return true;
				 	}
				 
			catch (Exception ex) {
			    return false;
							}
				
			}
			 
			 public boolean assigningParentToChildren(String ParentData,String ChildData) {
					try {
						this.clickonParentDebtorAdd();
						this.selectingParentDebtor(ParentData);
						this.selectingChildDebtor(ChildData);
						this.saveOnDebtorsScreen();
						this.closeOnPopUp();
						return true;
						 }
						 
					catch (Exception ex) {
					    return false;
									}
										}
			 
			 public boolean clickonParentDebtorAdd(){
					try{
					
					WebElement clickonParentDebtorAddWebE=new WebDriverWait(driver,20)
					.until(ExpectedConditions.visibilityOfElementLocated(Addcustomerparentchildlist_xpath));
					Thread.sleep(100);
					clickonParentDebtorAddWebE.click();
					return true;
				}
					 catch (Exception e) {
						
							return false;
						}
				}
			 public boolean selectingParentDebtor(String ParentData) {
					try {
						//this.clickonParentTextbox();
						this.PassingthedataIntoTextbox(ParentData);
						this.selectingdebtor();
						return true;
					 }
					 
				catch (Exception ex) {
				    return false;
								}
									}
			 			 
			 public boolean PassingthedataIntoTextbox(String ParentData){
					try{
					
					WebElement clickonParentDebtorAddWebE=new WebDriverWait(driver,20)
					.until(ExpectedConditions.visibilityOfElementLocated(ParentTextbox_xpath));
					Thread.sleep(100);
					clickonParentDebtorAddWebE.clear();
					clickonParentDebtorAddWebE.sendKeys(ParentData);
					return true;
				}
					 catch (Exception e) {
						
							return false;
						}
			 }
			 
			 public boolean selectingdebtor(){
					try{
					
					WebElement clickonParentDebtorAddWebE=new WebDriverWait(driver,20)
					.until(ExpectedConditions.visibilityOfElementLocated(selectingdebtor_xpath));
					Thread.sleep(100);
					clickonParentDebtorAddWebE.click();
					return true;
				}
					 catch (Exception e) {
						
							return false;
						}
			 }
			 
			 public boolean selectingChildDebtor(String ChildData) {
					try {
						//this.clickonParentTextbox();
						this.PassingthedataIntoChildTextbox(ChildData);
						this.selectingchilddebtor();
						return true;
					 }
					 
				catch (Exception ex) {
				    return false;
								}
									}
			 
			 public boolean PassingthedataIntoChildTextbox(String ChildData){
					try{
					
					WebElement clickonParentDebtorAddWebE=new WebDriverWait(driver,20)
					.until(ExpectedConditions.visibilityOfElementLocated(ChildTextbox_xpath));
					Thread.sleep(100);
					clickonParentDebtorAddWebE.clear();
					clickonParentDebtorAddWebE.sendKeys(ChildData);
					return true;
				}
					 catch (Exception e) {
						
							return false;
						}
			 }
			 
			 public boolean selectingchilddebtor(){
					try{
					
					WebElement clickonParentDebtorAddWebE=new WebDriverWait(driver,20)
					.until(ExpectedConditions.visibilityOfElementLocated(selectingChilddebtor_xpath));
					Thread.sleep(100);
					clickonParentDebtorAddWebE.click();
					return true;
				}
					 catch (Exception e) {
						
							return false;
						}
			 }
			 
			 public boolean definingParentCreditLimit_Greater_CreditLimit() {
					try {
						this.navigateto_2rd_page();
						this.dubbleClickOnDebtor_GreaterthanCreditLimit();
						this.setCreditLimitValueParent_Greater_CreditLimit("500");
						this.saveOnDebtorsScreen();
						this.closeOnPopUp();
						return true;
						 }
						 
					catch (Exception ex) {
					    return false;
									}
										}
			 public boolean setCreditLimitValueParent_Greater_CreditLimit(String Value){
					try{
					
					WebElement setUninsuredValueWebE=new WebDriverWait(driver,20)
					.until(ExpectedConditions.visibilityOfElementLocated(GreaterthanCreditLimitTextbox_xpath));
					Thread.sleep(100);
					setUninsuredValueWebE.clear();
					setUninsuredValueWebE.sendKeys(Value);
					Thread.sleep(500);			
					return true;
				}
					 catch (Exception e) {
							// TODO: handle exception
							return false;
						}
				}
			 
			 public  boolean verifyIneligibilityReasonParent_Greaterthan_CreditLimit(String ReasonData){
					try{
					WebElement verifyIneligibilityReasonWebE=new WebDriverWait(driver,20)
					.until(ExpectedConditions.visibilityOfElementLocated(IneligibilityReasonParent_Greaterthan_CreditLimit_Xpath));
					Thread.sleep(100);
					String ActualReason = verifyIneligibilityReasonWebE.getText();
					if(ActualReason.equalsIgnoreCase(ReasonData))
					{
					System.out.println(ActualReason);
					return true;
					}
					else
					{
						System.out.println("ffffffffffffffffffffffffffffff");
					}

					}
					catch (Exception e) {
							return false;
						}
					return false;
					
				}
			 
			 public  boolean verifyIneligibilityAmountParent_Greaterthan_CreditLimit(String ReasonAmount){
					try{
					WebElement verifyIneligibilityAmountWebE=new WebDriverWait(driver,20)
					.until(ExpectedConditions.visibilityOfElementLocated(IneligibilityAmountParent_Greaterthan_CreditLimit_Xpath));
					Thread.sleep(100);
					String ActualAmount = verifyIneligibilityAmountWebE.getText();
					if(ActualAmount.equalsIgnoreCase(ReasonAmount))
					{
						System.out.println(ActualAmount);
						return true;
						}
					else
					{
						System.out.println("ffffffffffffffffffffffffffffff");
					}
					
					}
						catch (Exception e) {
								return false;
							}
					return false;
					}
			 
			 public boolean definingParentCreditLimit_Lesserr_CreditLimit() {
					try {
						this.navigateto_2rd_page();
						this.dubbleClickOnDebtor_GreaterthanCreditLimit();
						this.setCreditLimitValueParent_Lesser_CreditLimit("1500");
						this.saveOnDebtorsScreen();
						this.closeOnPopUp();
						return true;
						 }
						 
					catch (Exception ex) {
					    return false;
									}
										}
			 
			 public boolean setCreditLimitValueParent_Lesser_CreditLimit(String Value){
					try{
					
					WebElement setUninsuredValueWebE=new WebDriverWait(driver,20)
					.until(ExpectedConditions.visibilityOfElementLocated(GreaterthanCreditLimitTextbox_xpath));
					Thread.sleep(100);
					setUninsuredValueWebE.clear();
					setUninsuredValueWebE.sendKeys(Value);
					Thread.sleep(500);			
					return true;
				}
					 catch (Exception e) {
							// TODO: handle exception
							return false;
						}
				}
			 
			 public boolean definingParentCreditLimit_Equal_CreditLimit() {
					try {
						this.navigateto_2rd_page();
						this.dubbleClickOnDebtor_GreaterthanCreditLimit();
						this.setCreditLimitValueParent_Equal_CreditLimit("1000");
						this.saveOnDebtorsScreen();
						this.closeOnPopUp();
						return true;
						 }
						 
					catch (Exception ex) {
					    return false;
									}
										}
			 
			 public boolean setCreditLimitValueParent_Equal_CreditLimit(String Value){
					try{
					
					WebElement setUninsuredValueWebE=new WebDriverWait(driver,20)
					.until(ExpectedConditions.visibilityOfElementLocated(GreaterthanCreditLimitTextbox_xpath));
					Thread.sleep(100);
					setUninsuredValueWebE.clear();
					setUninsuredValueWebE.sendKeys(Value);
					Thread.sleep(500);			
					return true;
				}
					 catch (Exception e) {
							// TODO: handle exception
							return false;
						}
				}
			 



	}	
	