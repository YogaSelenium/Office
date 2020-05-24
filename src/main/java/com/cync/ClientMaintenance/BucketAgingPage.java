
	package com.cync.ClientMaintenance;


	import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
																					
	import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Iterator;
import java.util.List;


import java.util.Set;

import org.openqa.selenium.support.ui.Select;






	









//Author name=Garima
import com.cync.base.BasePage;

	public class BucketAgingPage  extends BasePage{															//Author name-Garima

		private static final CharSequence ClientData = null;

		public BucketAgingPage(WebDriver driver) {
			super(driver);
			// TODO Auto-generated constructor stub
		}


	private final By BucketNumber_xpath=By.id("jqgh_bucket_ageing_list_bucket_number");
	private final By BucketName_xpath=By.id("jqgh_bucket_ageing_list_bucket_name");
	private final By BucketDaysFrom_xpath=By.id("bucket_ageing_list_days_from");
	private final By BucketDaysTo_xpath=By.id("bucket_ageing_list_days_to");
	private final By BucketNameEditBox_xpath=By.xpath("//input[@name='bucket_name']");
	private final By BucketDaysFromEdit_xpath=By.xpath("//input[@name='days_from']");
	private final By BucketDaystoEdit_xpath=By.xpath("//input[@name='days_to']");
	private final By Save_xpath=By.xpath("(//span[@class='ui-icon ui-icon ui-icon-disk'])[1]");
	private final By Erroemessage_xpath=By.xpath("//div[@class='ui-state-error']");
	private final By ArcheckBox_xpath=By.xpath("(//table[@class='cync_form ui-jqgrid-btable ui-common-table']//tbody//tr[@role='row']//td[@role='gridcell']//input[@role='checkbox'])[5]");
	private final By Reload_xpath=By.xpath("(//span[@class='ui-icon ui-icon-refresh'])[1]");
	private final By Arexport_xpath=By.xpath("(//span[@class='ui-icon ui-icon-extlink'])[1]");
	private final By add_xpath=By.xpath("(//span[@class='ui-icon ui-icon ui-icon-plus'])[1]");
	private final By ClickOnAdd_Xpath=By.xpath("(//span[@class='ui-icon ui-icon ui-icon-plus'])[1]");
	private final By Previous_xpath=By.xpath("(//span[@class='ui-icon ui-icon-seek-prev'])[1]");
	private final By clickOnAdd_xpath = By.xpath("(//span[@class='ui-icon ui-icon ui-icon-plus'])[1]");
	private  final By ClickonarDelete_xpath=By.xpath("(//span[@class='ui-icon ui-icon-trash'])[1]");
	private final By SelectDelete_xpath=By.id("dData");
	private final By Selectcross_xpath=By.xpath("//button[@class='ui-dialog-titlebar-close']");
	private final By FirstPagination_xpath=By.xpath("(//span[@class='ui-icon ui-icon-seek-first'])[1]");
	private final By NextPAgination_xpath=By.xpath("(//span[@class='ui-icon ui-icon-seek-next'])[1]");
	private final By LastPAgination_xpath=By.xpath("(//span[@class='ui-icon ui-icon-seek-end'])[1]");
	private final By BBCRecalculationProcessButton_xpath=By.xpath("//a[contains(text(),'Process/Re-Calculate BBC')]");
	//private final By Daysto_xpath=By.xpath("(//tr[@role='row']//td[@role='gridcell'])[36]");
	private final By enterdataindaysto_xpath=By.xpath("//td[@role='gridcell']/input[@name='days_to']");
	//private final By Close_xpath=By.id("closedialog");
	
	
	private final By addedbucketvalue_xpath=By.xpath("(//div[@class='ui-th-div ui-jqgrid-sortable'])[20]");
	private final By detailscreensearch_xpath=By.id("gs_invoice_status");
	private final By detailscreenparameter_xpath=By.id("gs_collateral_advance_rate_id");
	private final By clickonaddedbucketaging_xpath=By.xpath("(//input[@class='ui-widget-content ui-corner-all'])[14]");
	private final By Selectcheckkbox_xpath=By.xpath("(//table[@class='cync_form ui-jqgrid-btable ui-common-table']//tbody//tr[@role='row']//td[@role='gridcell']//input[@role='checkbox'])[6]");
	private final By clickoncross_xpath=By.xpath("//button[@class='ui-dialog-titlebar-close']");
	private final By clickoncreate_xpath=By.xpath("//a[@class='view-button pull-right']");
	private final By mappingdata=By.id("mapping_name");
	private final By next_xpath=By.xpath("//input[@value='Next']");
	private final By Verifyvalue_xpath=By.xpath("(//label[@class='control-label'])[13]");
	private final By Verifyvalues_xpath=By.xpath("(//label[@class='control-label'])[11]");
	private final By data_xpath=By.xpath("(//table[@class='dataTable table table-bordered table-striped']/tbody/tr[@class='row-even summary-row child_'])[5]");
	private final By BBCprint_xpath=By.xpath("(//a[@class='view-button'])[2]");
	private final By xlsformat_xpath=By.xpath("(//a[@target='_blank']/img[@title='Download'])[1]");
	 private final By bbcreport_xpath=By.xpath("(//li[@class='open_menu'])[9]");
	 private final By bbcdilogbox_xpath=By.xpath("//select[@name='bbc_status']");
	 private final By bbcorientation_xpath=By.xpath("//select[@name='bbc_print_orientation']");
	 private final By bbxxls_xpath=By.xpath("//button[contains(text(),'XLS')]");
	 private final By Arreport_xpath=By.xpath("(//li[@class='open_menu'])[12]");
	 private final By ArAsOFResult_xpath=By.id("as_of_date");
	 private final By clickanywere_xpath=By.xpath("//div[@id='searchhdfbox_seasonal_advance_rates_list']");
	 private final By clickanywere_xpath1=By.xpath("//div[@class='ui-dialog-titlebar ui-widget-header ui-corner-all ui-helper-clearfix']");
	 private final By BBCAvailability_xpath=By.xpath("(//a[contains(text(),'BBC Availability')])[4]");
	 private final By BBcavablityapprove_xpath=By.xpath("//a[text()='Approve BBC']");
	 private final By ElectronicSignature_xpath=By.id("lnk-electronic-signature");
	 private final By Authorisedname_xpath=By.id("signer_name");
	 private final By Iagree_xpath=By.id("terms_condition");
	 private final By AuthorisedSignature_xpath=By.xpath("(//button[@type='button'])[6]");
	 private final By Verifymessage_xpath=By.id("message");
	 private final By xlxformat=By.xpath("(//button[contains(text(),'XLS')])");
	private final By BBCReviredate_xpath=By.xpath("(//a[text()='BBC Review Data'])[3]");
	private final By Choosedate_xpath=By.xpath("//div[@class='greyPanel']//select[@name='detail_activity']");
	//private final By bbcavablitys_xpath=By.xpath("(//a[text()='BBC Availability'])[2]");
	private final By BBcprint_xpath=By.xpath("(//a[@class='view-button'])[2]");
	private final By bbcreportdate_xpath=By.xpath("//select[@name='bbc_id']");
	private final By bbctrendreport_xpath=By.xpath("(//li[@class='open_menu'])[8]");
	private final By bbcstartdate_xpath=By.xpath("//input[@name='start_date']");
	private final By enddate_xpath=By.xpath("//input[@name='end_date']");
	private final By ApBucketnumber_xpath=By.id("jqgh_payable_bucket_ageing_list_bucket_number");
	private final By ApBucketname_xpath=By.id("jqgh_payable_bucket_ageing_list_bucket_name");
	private final By ApDaysFrom_xpath=By.id("jqgh_payable_bucket_ageing_list_days_from");
	private final By ApDaysto_xpath=By.id("jqgh_payable_bucket_ageing_list_days_to");
	private final By Apadd_xpath=By.xpath("(//span[@class='ui-icon ui-icon ui-icon-plus'])[2]");
	private final By ApeditBox_xpath=By.xpath("(//input[@name='bucket_name'])[2]");
	private final By ApBucketDaysFromEdit_xpath=By.xpath("(//input[@name='days_from'])");
	private final By ApBucketDaystoEdit_xpath=By.xpath("(//input[@name='days_to'])");
	private final By ApSave_xpath=By.xpath("(//span[@class='ui-icon ui-icon ui-icon-disk'])[2]");
	private final By ApDaysTo_xpath=By.xpath("(//table[@class='cync_form ui-jqgrid-btable ui-common-table'])[2]/tbody/tr[@role='row'][7]//td[@role='gridcell'][6]");
	private final By Apenterdaysto=By.xpath("(//table[@class='cync_form ui-jqgrid-btable ui-common-table'])[2]/tbody/tr[@role='row'][7]/td[@role='gridcell']/input[@name='days_to']");
	private final By ApBucketEdit_xpath=By.xpath("//td[@role='gridcell']//input[@name='bucket_name']");
	private final By Apreload=By.xpath("(//span[@class='ui-icon ui-icon-refresh'])[2]");
	private final By ApCancle_xpath=By.xpath("(//span[@class='ui-icon ui-icon ui-icon-cancel'])[2]");
	private final By Apexport_xpath=By.xpath("(//span[@class='ui-icon ui-icon-extlink'])[2]");
	private final By ApFirstPagination_xpath=By.xpath("(//span[@class='ui-icon ui-icon-seek-first'])[2]");
	private final By ApNextPAgination_xpath=By.xpath("(//span[@class='ui-icon ui-icon-seek-next'])[2]");
	private final By ApLastPAgination_xpath=By.xpath("(//span[@class='ui-icon ui-icon-seek-end'])[2]");
	private final By ApPrevious_xpath=By.xpath("(//span[@class='ui-icon ui-icon-seek-prev'])[2]");
	private final By Over5_xpath=By.xpath("//input[@name='bucket_1_amount']");
	private final By Over15_xpath=By.xpath("(//div[@class='ui-th-div ui-jqgrid-sortable'])[15]");
	private final By SummaryOver15_xpath=By.xpath("(//div[@class='ui-th-div ui-jqgrid-sortable'])[11]");
	private final By Verify15_xpath=By.xpath("//table[@class='dataTable table table-bordered table-striped']/tbody/tr[@class='row-even summary-row child_'][5]");
	private final By VerifyOver15_xapth=By.xpath("(//table[@class='dataTable']/tbody/tr/td)[52]");
	private final By Verifydata_xpath=By.xpath("(//label[@class='control-label'])[12]");
	//Author name-kruthivas
	private final By Close_xpath=By.xpath("//a[@class='fm-button ui-state-default ui-corner-all']");
	private final By htmlButton_xpath=By.xpath("//button[text()='HTML']");
	private final By bbcDate_xpath=By.id("bbc_status");
	private final By bbcDateRecev_xpath=By.id("bbc_id");

	//private final By Daysto_xpath=By.xpath("//tr[@id='36327']//td[6]");//staging
	private final By Daysto_xpath=By.xpath("//div[@class='row padone']//tr[@id='306']//td[6]");//devpenstaging
	private final By bbcavablitys_xpath=By.xpath("(//a[contains(text(),'BBC Availability')])[4]");
	private final By SelectDelete_xpath1=By.xpath("(//a[@class='ui-jqdialog-titlebar-close ui-corner-all'])[1]");

//verify  Ar bucket aging number

public boolean VerifyBucketNumber() {
	try {
	    WebElement clickonclientname = new WebDriverWait(driver,5)
		    .until(ExpectedConditions .visibilityOfElementLocated(BucketNumber_xpath));
	    clickonclientname.isDisplayed();
	    //////Thread.sleep(500);
	    return true;
	} catch (Exception ex) {
	    return false;
	}

}
//verify  Ar BucketName

public boolean VerifyBucketName() {
	try {
	    WebElement clickonclientname = new WebDriverWait(driver,5)
		    .until(ExpectedConditions .visibilityOfElementLocated(BucketName_xpath));
	    clickonclientname.isDisplayed();
	    //////Thread.sleep(500);
	    return true;
	} catch (Exception ex) {
	    return false;

	}
}

	//verify days to
	public boolean VerifyBucketDaysTo() {
		try {
		    WebElement clickonclientname = new WebDriverWait(driver,5)
			    .until(ExpectedConditions .visibilityOfElementLocated(BucketDaysTo_xpath));
		    clickonclientname.isDisplayed();
		    //////Thread.sleep(500);
		    return true;
		} catch (Exception ex) {
		    return false;
		}

	}
	//verify  AR bucket days from

	public boolean VerifyBucketDaysFrom() {
		try {
		    WebElement clickonclientname = new WebDriverWait(driver,5)
			    .until(ExpectedConditions .visibilityOfElementLocated(BucketDaysFrom_xpath));
		    clickonclientname.isDisplayed();
		    //////Thread.sleep(500);
		    return true;
		} catch (Exception ex) {
		    return false;
		}

	}

	//click on plus Symbol
	public boolean clickOnAdd() {
		try {

			Thread.sleep(500);

		    WebElement menuItemWebE = new WebDriverWait(driver, 5)
		    .until(ExpectedConditions.visibilityOfElementLocated(clickOnAdd_xpath));
		    menuItemWebE.click();
		    return true;
		} catch (Exception ex) {
		    return false;
		}
	    }

	//enter data in bucket name field

	public String ClickOnBucketNameField(String value) {
		try {
		    WebElement ClickOnBucketNameField = new WebDriverWait(driver,5)
			    .until(ExpectedConditions .visibilityOfElementLocated(BucketNameEditBox_xpath));
		    ClickOnBucketNameField.click();

		    Thread.sleep(500);

		    ClickOnBucketNameField.sendKeys(value);
	} catch (Exception ex) {
		   
		}
		return value;
	}

	//enter data in days from

	public String ClickOnDaysFrom(String value) {
		try {
		    WebElement ClickOnBucketNameField = new WebDriverWait(driver,5)
			    .until(ExpectedConditions .visibilityOfElementLocated(BucketDaysFromEdit_xpath));
		    ClickOnBucketNameField.click();
		    //////Thread.sleep(2000);
		    ClickOnBucketNameField.sendKeys(value);
	} catch (Exception ex) {
		   
		}
		return value;
	}
	//enter data in days to

	public String ClickOnDaysTO(String value) {
		try {
		    WebElement ClickOnBucketNameField = new WebDriverWait(driver,5)
			    .until(ExpectedConditions .visibilityOfElementLocated(BucketDaystoEdit_xpath));
		    ClickOnBucketNameField.click();
		    //////Thread.sleep(2000);
		    ClickOnBucketNameField.sendKeys(value);
	} catch (Exception ex) {
		   
		}
		return value;
	}

	//click on save

	public boolean ClickOnSaveSymbol() {
		try {
		    WebElement ClickOnPlusSymbol = new WebDriverWait(driver,5)
			    .until(ExpectedConditions .visibilityOfElementLocated(Save_xpath));
		    ClickOnPlusSymbol.click();
		    //////Thread.sleep(2000);
		    return true;
		} catch (Exception ex) {
		    return false;
		}
	}
	//method to handle alert

	public boolean isAlertPresent() {

		boolean presentFlag = false;

		try {
			Alert alert = driver.switchTo().alert();
			presentFlag = true;
			alert.accept();
			Thread.sleep(500);
		} catch (Exception ex) {

			System.out.println("No Such Alert Present");

		}

		return presentFlag;
	}
		
//verify error message
public boolean VerifyErrorMessage() {
	try {
	    WebElement VerifyErrorMessage = new WebDriverWait(driver,5)
		    .until(ExpectedConditions .visibilityOfElementLocated(Erroemessage_xpath));
	    VerifyErrorMessage.isDisplayed();
	    
	    //////Thread.sleep(2000);
	    return true;
	} catch (Exception ex) {
	    return false;

	}
}

	//select ar bucket checkbox

	public boolean ClickOnArCheckBox() {
		try {
		    WebElement ClickOnArCheckBox = new WebDriverWait(driver,5)
			    .until(ExpectedConditions .visibilityOfElementLocated(ArcheckBox_xpath));
		    
		    ClickOnArCheckBox.click();
		    //////Thread.sleep(2000);
		    return true;
		} catch (Exception ex) {
		    return false;
		}
	}

	//click on Ar reload
	public boolean ClickOnArReload() {
		try {
		    WebElement ClickOnArReload = new WebDriverWait(driver,5)
			    .until(ExpectedConditions .visibilityOfElementLocated(Reload_xpath));
		    ClickOnArReload.click();
		    //////Thread.sleep(4000);
		    return true;
		} catch (Exception ex) {
		    return false;
		}
	}
	//click on export

	public boolean ClickOnArExport() {
		try {
		    WebElement ClickOnArExport = new WebDriverWait(driver,5)
			    .until(ExpectedConditions .visibilityOfElementLocated(Arexport_xpath));
		    ClickOnArExport.click();
		    //////Thread.sleep(4000);
		    return true;
		} catch (Exception ex) {
		}
		return false;
	}




	//click on delete Symbol

	public boolean clickOnDelete() {
		try {
		    WebElement clickOnDelete = new WebDriverWait(driver, 5)
		    .until(ExpectedConditions.visibilityOfElementLocated(ClickonarDelete_xpath));
		    clickOnDelete.click();

		    return true;
		} catch (Exception ex) {
		    return false;
		}
	  }

	//click on delete popup

	public boolean clickOnPopupDelete() {
		try {
		    WebElement clickOnPopupDelete = new WebDriverWait(driver, 5)
		    .until(ExpectedConditions.visibilityOfElementLocated(SelectDelete_xpath));
		    clickOnPopupDelete.click();

		    return true;
		} catch (Exception ex) {
		    return false;
		}
	  }


	//click on  popup cross

	public boolean clickOnPopupCross() {
		try {
		    WebElement clickOnPopupDelete = new WebDriverWait(driver, 5)
		    .until(ExpectedConditions.visibilityOfElementLocated(Selectcross_xpath));
		    clickOnPopupDelete.click();

		    return true;
		} catch (Exception ex) {
		    return false;
		}
	}
	//click on previous page symbol

	public boolean ClickOnArPreviousPageSymbol() {
		try {
		    WebElement ClickOnArPreviousPageSymbol = new WebDriverWait(driver,5)
			    .until(ExpectedConditions.visibilityOfElementLocated(Previous_xpath));
		    ClickOnArPreviousPageSymbol.click();
		    //////Thread.sleep(500);
		    return true;
		} catch (Exception ex) {
		    return false;
		}
	}
		//click on first page
		

		public boolean ClickOnArFirstPageSymbol() {
			try {
			    WebElement ClickOnArPreviousPageSymbol = new WebDriverWait(driver,5)
				    .until(ExpectedConditions.visibilityOfElementLocated(FirstPagination_xpath));
			    ClickOnArPreviousPageSymbol.click();
			    //////Thread.sleep(500);
			    return true;
			} catch (Exception ex) {
			    return false;
			}
	}
		
		//click on Next page
		

			public boolean ClickOnArNextPageSymbol() {
				try {
				    WebElement ClickOnArPreviousPageSymbol = new WebDriverWait(driver,5)
					    .until(ExpectedConditions.visibilityOfElementLocated(NextPAgination_xpath));
				    ClickOnArPreviousPageSymbol.click();
				    //////Thread.sleep(500);
				    return true;
				} catch (Exception ex) {
				    return false;
				}
		}

			//click on LAST page
			

				public boolean ClickOnArlastPageSymbol() {
					try {
					    WebElement ClickOnArPreviousPageSymbol = new WebDriverWait(driver,5)
						    .until(ExpectedConditions.visibilityOfElementLocated(LastPAgination_xpath));
					    ClickOnArPreviousPageSymbol.click();
					    //////Thread.sleep(500);
					    return true;
					} catch (Exception ex) {
					    return false;
					}
			}

				//Click on BBc recalculation
				public  boolean clickOnBBcReculationButton() {
					 try {
						  WebElement IneligibleCalculationPageWebElement = new WebDriverWait(driver, 5)
						 .until(ExpectedConditions.elementToBeClickable(BBCRecalculationProcessButton_xpath));
						 IneligibleCalculationPageWebElement.click();
						 //////Thread.sleep(500);
						 Alert simpleAlert = driver.switchTo().alert();
						 simpleAlert.accept();
						 //////Thread.sleep(1000);
						 /*simpleAlert.accept();
						 //////Thread.sleep(4000);*/
						 return true;
						 }
					 
				catch (Exception ex) {
				   return false;
								}
				}
				
				//doubleclick
				public boolean doubleclickonDaysto()
				{
					try
					
					{
						Thread.sleep(1000);
						WebElement doubleclickonDaysto=new WebDriverWait(driver,10)
						.until(ExpectedConditions.visibilityOfElementLocated(Daysto_xpath));
						Actions action = new Actions(driver);
						action.doubleClick(doubleclickonDaysto).build().perform();
						//////Thread.sleep(2000);	
						return true;
						}
					catch (Exception e)
					{
						
					}
					return false;
					
				}

	////enter data in day to edit field
	public boolean EnterdatainDayTo(String value) {
		try {
		    WebElement ClickOnBucketNameField = new WebDriverWait(driver,5)
			.until(ExpectedConditions .visibilityOfElementLocated(enterdataindaysto_xpath));
		    ClickOnBucketNameField.clear();
		    ClickOnBucketNameField.sendKeys(value);
		    return true;
	} catch (Exception ex) {
		   
		}
		return false;
	}


	//click on close


		public boolean ClickOnClose() {
			try {
			    WebElement ClickOnArPreviousPageSymbol = new WebDriverWait(driver,5)
				    .until(ExpectedConditions.visibilityOfElementLocated(Close_xpath));
			    ClickOnArPreviousPageSymbol.click();

			    Thread.sleep(500);

			    return true;
			} catch (Exception ex) {
			    return false;
			}
	}

	//verify bucket aging value in detail reciavable scree
		public boolean VerifyBucketAgingValueInDetailRecevaibleScreen() {
			try {
			    WebElement clickonclientname = new WebDriverWait(driver,5)
				    .until(ExpectedConditions .visibilityOfElementLocated(addedbucketvalue_xpath));
			    clickonclientname.isDisplayed();
			    //////Thread.sleep(500);
			    return true;
			} catch (Exception ex) {
			    return false;
			}

		}
		//click on search
		public boolean clickonStatus() {
	    	try {
	    	    WebElement clickoncolletralsearch = new WebDriverWait(driver,5)
	    		    .until(ExpectedConditions .visibilityOfElementLocated(detailscreensearch_xpath));
	    	    clickoncolletralsearch.click();
	    	    Actions action = new Actions(driver);
	    	    action.sendKeys(Keys.TAB).build().perform();
	    	    Actions action1 = new Actions(driver);
	    	    action1.sendKeys(Keys.TAB).build().perform();
	    	    //////Thread.sleep(500);
	    	    return true;
	    	} catch (Exception ex) {
	    	    return false;
	    	}

	        }
		//click on parameter
		
			public boolean clickonParameter() {
		    	try {
		    	    WebElement clickoncolletralsearch = new WebDriverWait(driver,5)
		    		    .until(ExpectedConditions .visibilityOfElementLocated(detailscreenparameter_xpath));
		    	    clickoncolletralsearch.click();
		    	    Actions action = new Actions(driver);
		    	    action.sendKeys(Keys.TAB).build().perform();
		    	    //////Thread.sleep(500);
		    	    Actions action1 = new Actions(driver);
		    	    action1.sendKeys(Keys.TAB).build().perform();
		    	    //////Thread.sleep(500);
		    	    return true;
		    	} catch (Exception ex) {
		    	    return false;
		    	}

		        }
			//click on added aging
			public boolean clickonnewlyaddedbucket() {
		    	try {
		    	    WebElement clickoncolletralsearch = new WebDriverWait(driver,5)
		    		    .until(ExpectedConditions .visibilityOfElementLocated(clickonaddedbucketaging_xpath));
		    	    clickoncolletralsearch.click();
		    	    Actions action = new Actions(driver);
		    	    action.sendKeys(Keys.TAB).build().perform();
		    	  
		    	   //////Thread.sleep(500);
		    	    return true;
		    	} catch (Exception ex) {
		    	    return false;
		    	}

		        }
			//delete 1 row
			public boolean deleteLastrowfromArbucketaging() {
		    	try {
		    	    WebElement clickoncolletralsearch = new WebDriverWait(driver,5)
		    		    .until(ExpectedConditions .visibilityOfElementLocated(Selectcheckkbox_xpath));
		    	    clickoncolletralsearch.click();
		    	    
		    	   //////Thread.sleep(500);
		    	    return true;
		    	} catch (Exception ex) {
		    	    return false;
		    	}

		        }
			//click on cross
			public boolean Clicko0nCross() {
		    	try {
		    	    WebElement clickoncolletralsearch = new WebDriverWait(driver,5)
		    		    .until(ExpectedConditions .visibilityOfElementLocated(clickoncross_xpath));
		    	    clickoncolletralsearch.click();
		    	    
		    	   //////Thread.sleep(2000);
		    	    return true;
		    	} catch (Exception ex) {
		    	    return false;
		    	}

		        }
			//Click on create mapping
			public boolean Clicko0nCreateMapping() {
		    	try {
		    	    WebElement clickoncolletralsearch = new WebDriverWait(driver,5)
		    		    .until(ExpectedConditions .visibilityOfElementLocated(clickoncreate_xpath));
		    	    clickoncolletralsearch.click();
		    	    
		    	   //////Thread.sleep(2000);
		    	    return true;
		    	} catch (Exception ex) {
		    	    return false;
		    	}

		        }
			//enterdata in mapping name
			public String EnterdatainMappingName(String value) {
				try {
				    WebElement ClickOnBucketNameField = new WebDriverWait(driver,5)
					.until(ExpectedConditions .visibilityOfElementLocated(mappingdata));
				    ClickOnBucketNameField.clear();
				    ClickOnBucketNameField.sendKeys(value);
				
			} catch (Exception ex) {
				   
				}
				return value;
			}
	//click on next
			public boolean Clicko0nNext() {
		    	try {
		    	    WebElement clickoncolletralsearch = new WebDriverWait(driver,5)
		    		    .until(ExpectedConditions .visibilityOfElementLocated(next_xpath));
		    	    clickoncolletralsearch.click();
		    	    
		    	   //////Thread.sleep(2000);
		    	    return true;
		    	} catch (Exception ex) {
		    	    return false;
		    	}

		        }	
			
			//verify bucket aging value in detail reciavable scree
			public boolean VerifyaddedbucketvalueInMappinglistScreen() {
				try {
				    WebElement clickonclientname = new WebDriverWait(driver,5)
					    .until(ExpectedConditions .visibilityOfElementLocated(Verifyvalue_xpath));
				    clickonclientname.isDisplayed();
				    //////Thread.sleep(500);
				    return true;
				} catch (Exception ex) {
				    return false;
				}

			}
			//verify bucket aging value in detail reciavable scree
			public boolean VerifyBucketAgingValueInRecevaibleScreen() {
				try {
				    WebElement clickonclientname = new WebDriverWait(driver,5)
					    .until(ExpectedConditions .visibilityOfElementLocated(Verifyvalues_xpath));
				    clickonclientname.isDisplayed();

				    Thread.sleep(500);
				    this.isAlertPresent();

				    return true;
				} catch (Exception ex) {
				    return false;
				}

			}
			//verify data
			public boolean VerifyBucketAgingValueInBbcAvablityScreen() {
				try {
				    WebElement clickonclientname = new WebDriverWait(driver,5)
					    .until(ExpectedConditions .visibilityOfElementLocated(data_xpath));
				    clickonclientname.isDisplayed();

				    Thread.sleep(500);

				    return true;
				} catch (Exception ex) {
				    return false;
				}
		}
			
			//verify 15
			public boolean VerifyBucketAgingValueInBbcAvablityScreenForOver15() {
				try {
				    WebElement clickonclientname = new WebDriverWait(driver,5)
					    .until(ExpectedConditions .visibilityOfElementLocated(Verify15_xpath));
				    clickonclientname.isDisplayed();
				    //////Thread.sleep(500);
				    return true;
				} catch (Exception ex) {
				    return false;
				}
		}
			
		//click on bbc print
		public boolean clickonBBCPrint() {
			try {
			    WebElement clickonclientname = new WebDriverWait(driver,5)
				    .until(ExpectedConditions .visibilityOfElementLocated(BBCprint_xpath));
			    clickonclientname.click();
			    //////Thread.sleep(500);
			    return true;
			} catch (Exception ex) {
			    return false;
			}

		}
		//click on xsl format
		public boolean clickonBBCXlsformat() {
			try {
			    WebElement clickonBBCXlsformat = new WebDriverWait(driver,5)
				    .until(ExpectedConditions .visibilityOfElementLocated(xlsformat_xpath));
			    //////Thread.sleep(500);
			    clickonBBCXlsformat.click();
			   
			    return true;
			} catch (Exception ex) {
			    return false;
			}

		}
//click on bbc report
public boolean clickonbbcreport() {
try {
WebElement bbcreport = new WebDriverWait(driver, 5)
    .until(ExpectedConditions
	    .visibilityOfElementLocated(bbcreport_xpath));
bbcreport.click();

Thread.sleep(500);

return true;
} catch (Exception ex) {
return false;
}

}

//select data from drop down of bbc
public String clickonbbcdropdown(String ClientData) 
{
try{
WebElement bbcdate =new WebDriverWait(driver,5)
.until(ExpectedConditions.visibilityOfElementLocated(bbcdilogbox_xpath));
bbcdate.click();
//Thread.sleep(5000);
bbcdate.sendKeys(ClientData);

}
catch(Exception ex){

}
return ClientData;
}
	
	
//step to select data from bbc orientation dropdown

public String clickonbbcorientationdropdown(String ClientData ) throws InterruptedException{
	

	WebDriverWait wait = new WebDriverWait(driver, 5);
	wait.until(ExpectedConditions.visibilityOfElementLocated((bbcorientation_xpath)));

	WebElement element = driver.findElement((bbcorientation_xpath));
	Select sel = new Select(element);
	sel.selectByVisibleText(ClientData);
	/*List<WebElement> list = sel.getOptions();	
	
	
	for(WebElement ele : list){
		
		if(ele.getText().equals(ClientData)){
			ele.click();

			//////Thread.sleep(10000);

			Thread.sleep(500);

			break;
		}
	}*/
	return ClientData;

}
//click on bbc xls
public boolean clickbbcxlsformat() {
   	try {
   	    WebElement bbcxls = new WebDriverWait(driver, 5)
   		    .until(ExpectedConditions
   			    .visibilityOfElementLocated(bbxxls_xpath));
   	    bbcxls.click();

   	    Thread.sleep(500);

   	    return true;
   	} catch (Exception ex) {
   	    return false;
   	}

       }
//click on ar report
public boolean clickOnArReport() {
   	try {
   	    WebElement bbcxls = new WebDriverWait(driver, 5)
   		    .until(ExpectedConditions
   			    .visibilityOfElementLocated(Arreport_xpath));
   	    bbcxls.click();
   	    //////Thread.sleep(10000);
   	    return true;
   	} catch (Exception ex) {
   	    return false;
   	}

}
//CLICK ON as of date
public String ClickOnAsOfDate(String value) {
	try {
	    WebElement ClickOnBucketNameField = new WebDriverWait(driver,5)
		    .until(ExpectedConditions .visibilityOfElementLocated(ArAsOFResult_xpath));
	    ClickOnBucketNameField.click();
	    //////Thread.sleep(2000);
	    ClickOnBucketNameField.sendKeys(value);
} catch (Exception ex) {
	   
	}
	return value;
}

//click anywere on bbctrend 
		public boolean Clickonanywere() {
	    	try {
	    	    WebElement bbcanywere = new WebDriverWait(driver,5)
	    		    .until(ExpectedConditions
	    			    .visibilityOfElementLocated(clickanywere_xpath1));
	    	    bbcanywere.click();
	    	    ////Thread.sleep(500);
	    	    return true;
	    	} catch (Exception ex) {
	    	    return false;
	    	}

	        }
		//click on bbc avablity
		public boolean clickonbbcavablity()
		{
		try{
			Thread.sleep(1000);
		WebElement bbcavablity =new WebDriverWait(driver,5)
		.until(ExpectedConditions.visibilityOfElementLocated(BBCAvailability_xpath));
		bbcavablity.click();

		Thread.sleep(500);


		return true;
		}
		catch(Exception ex){

		}
		return false;
		}
		//click on bbcavablity approve
		 public boolean selectbbcavablityapprove() {
		    	try {
		    	    WebElement bbcavablityapprove = new WebDriverWait(driver, 5)
		    		    .until(ExpectedConditions
		    			    .visibilityOfElementLocated(BBcavablityapprove_xpath));
		    	    bbcavablityapprove.click();
		    	    //////Thread.sleep(2000);
		    	    return true;
		    	} catch (Exception ex) {
		    	    return false;
		    	}

		        }
		 //click on electronic signature
		 public boolean clickOnElectronicSignature() {
		    	try {
		    	    WebElement bbcavablityapprove = new WebDriverWait(driver, 5)
		    		    .until(ExpectedConditions
		    			    .visibilityOfElementLocated(ElectronicSignature_xpath));
		    	    bbcavablityapprove.click();
		    	    //////Thread.sleep(2000);
		    	    return true;
		    	} catch (Exception ex) {
		    	    return false;
		    	}

		        }
		 //enter dat in authoorised name
		 public String enterValueInAuthorisedName(String ClientData) 
		 {
		 try{
		 WebElement bbcdate =new WebDriverWait(driver,5)
		 .until(ExpectedConditions.visibilityOfElementLocated(Authorisedname_xpath));
		 bbcdate.click();
		 //////Thread.sleep(5000);
		 bbcdate.sendKeys(ClientData);

		 }
		 catch(Exception ex){

		 }
		 return ClientData;
		 }
		 //click on i agree
		 public boolean clickOnIAgree() {
		    	try {
		    	    WebElement bbcavablityapprove = new WebDriverWait(driver, 5)
		    		    .until(ExpectedConditions
		    			    .visibilityOfElementLocated(Iagree_xpath));
		    	    bbcavablityapprove.click();
		    	    //////Thread.sleep(2000);
		    	    return true;
		    	} catch (Exception ex) {
		    	    return false;
		    	}

		        }
		 //click on authorised signature
		 public boolean clickOnAuthorisedSignature() {
		    	try {
		    	    WebElement bbcavablityapprove = new WebDriverWait(driver, 5)
		    		    .until(ExpectedConditions
		    			    .visibilityOfElementLocated(AuthorisedSignature_xpath));
		    	    bbcavablityapprove.click();

		    	    
		    	

		    	    return true;
		    	} catch (Exception ex) {
		    	    return false;
		    	}

		        }
		 //verify message
		 public boolean VerifyMessageInSignBbc() {
				try {
				    WebElement clickonclientname = new WebDriverWait(driver,5)
					    .until(ExpectedConditions .visibilityOfElementLocated(Verifymessage_xpath));
				    clickonclientname.isDisplayed();
				    //////Thread.sleep(500);
				    return true;
				} catch (Exception ex) {
				    return false;
				}

			}
		 //click on xls format
		 public boolean clickOnXls() {
		    	try {
		    	    WebElement bbcavablityapprove = new WebDriverWait(driver, 5)
		    		    .until(ExpectedConditions
		    			    .visibilityOfElementLocated(xlxformat));
		    	    bbcavablityapprove.click();

		    	    Thread.sleep(500);

		    	    return true;
		    	} catch (Exception ex) {
		    	    return false;
		    	}

		        }
		 //click on bbc re view date
		 public boolean clickOnBbcReveiwDate() {
		    	try {
		    		Thread.sleep(2000);
		    	    WebElement bbcavablityapprove = new WebDriverWait(driver,10)
		    		    .until(ExpectedConditions
		    			    .visibilityOfElementLocated(BBCReviredate_xpath));
		    	    bbcavablityapprove.click();

		    	    Thread.sleep(500);

		    	    return true;
		    	} catch (Exception ex) {
		    	    return false;
		    	}
		 }
		    
		 //select date from drop down
		 public String selectDatefromDropDowns(String data ) throws InterruptedException{
             WebDriverWait wait = new WebDriverWait(driver, 5);
             wait.until(ExpectedConditions.visibilityOfElementLocated((Choosedate_xpath)));
             WebElement element = driver.findElement((Choosedate_xpath));
             Select sel = new Select(element);
             Thread.sleep(500);
         //    sel.selectByVisibleText(data);
             List<WebElement> list = sel.getOptions();    
             for(WebElement ele : list){
                 
                 if(ele.getText().equals(data)){
                     ele.click();
                     Thread.sleep(1000);
                     break;
                 }
             }
             return data;

         }
		 //click on bbc avablity
		 public boolean clickOnBbcavablitys() {
		    	try {
		    	    WebElement bbcavablityapprove = new WebDriverWait(driver, 5)
		    		    .until(ExpectedConditions
		    			    .visibilityOfElementLocated(bbcavablitys_xpath));
		    	    bbcavablityapprove.click();

		    	   Thread.sleep(500);

		    	    return true;
		    	} catch (Exception ex) {
		    	    return false;
		    	}

		        }
		 //click on bbc print
		 public boolean clickOnBbcPrint() {
		    	try {
		    		Thread.sleep(200);
		    	    WebElement bbcavablityapprove = new WebDriverWait(driver,10)
		    		    .until(ExpectedConditions
		    			    .visibilityOfElementLocated(BBcprint_xpath));
		    	    bbcavablityapprove.click();
		    	   
		    	    return true;
		    	} catch (Exception ex) {
		    	    return false;
		    	}

		        }
		 
		 public boolean closeBBCREport() {
		    	try {
		    	    
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
		    	} catch (Exception ex) {
		    	    return false;
		    	}
				return false;

		        }
		 
		 
		 //click on bbc date
		 public String selectbbcrecorddatefrombbcdate(String ClientData)
		 {
		 try{
		 WebElement bbcrecordbbcdate =new WebDriverWait(driver,5)
		 .until(ExpectedConditions.visibilityOfElementLocated(bbcreportdate_xpath));
		 bbcrecordbbcdate.click();
		 //Thread.sleep(5000);
		 bbcrecordbbcdate.sendKeys(ClientData);

		 }
		 catch(Exception ex){

		 }
		 return ClientData;}
		

//click on bbc trend report
public boolean clickonbbctrendreport() {
	try {
	    WebElement bbctrendreport = new WebDriverWait(driver, 5)
		    .until(ExpectedConditions
			    .visibilityOfElementLocated(bbctrendreport_xpath));
	    bbctrendreport.click();
	    //////Thread.sleep(500);
	    return true;
	} catch (Exception ex) {
	    return false;
	}

}
//click on start date
public String startdate(String ClientData)
{
try{
WebElement startdate =new WebDriverWait(driver,5)
.until(ExpectedConditions.visibilityOfElementLocated(bbcstartdate_xpath));
startdate.click();
//////Thread.sleep(2000);
startdate.sendKeys(ClientData);

}
catch(Exception ex){

}
return ClientData;
}

//click anywere on bbctrend 
		public boolean bbcanywere() {
	    	try {
	    	    WebElement bbcanywere = new WebDriverWait(driver, 5)
	    		    .until(ExpectedConditions
	    			    .visibilityOfElementLocated(clickanywere_xpath1));
	    	    bbcanywere.click();
	    	    //////Thread.sleep(500);
	    	    return true;
	    	} catch (Exception ex) {
	    	    return false;
	    	}

	        }
		
		//click on bbctrend end date
				public String endtdate(String ClientData)
				{
				try{
				WebElement endtdate =new WebDriverWait(driver,5)
				.until(ExpectedConditions.visibilityOfElementLocated(enddate_xpath));
				endtdate.click();
				//////Thread.sleep(2000);
				endtdate.sendKeys(ClientData);

				}
				catch(Exception ex){

				}
				return ClientData;
				}
				//verify  Ap bucket aging number

				public boolean VerifyApBucketNumber() {
					try {
					    WebElement clickonclientname = new WebDriverWait(driver,5)
						    .until(ExpectedConditions .visibilityOfElementLocated(ApBucketnumber_xpath));
					    clickonclientname.isDisplayed();
					    //////Thread.sleep(500);
					    return true;
					} catch (Exception ex) {
					    return false;
					}

				}
				
				//verify  Ar BucketName

				public boolean VerifyApBucketName() {
					try {
					    WebElement clickonclientname = new WebDriverWait(driver,5)
						    .until(ExpectedConditions .visibilityOfElementLocated(ApBucketname_xpath));
					    clickonclientname.isDisplayed();
					    //////Thread.sleep(500);
					    return true;
					} catch (Exception ex) {
					    return false;
					}

				}
				
				//verify  AR bucket days from

				public boolean VerifyApBucketDaysFrom() {
					try {
					    WebElement clickonclientname = new WebDriverWait(driver,5)
						    .until(ExpectedConditions .visibilityOfElementLocated(ApDaysFrom_xpath));
					    clickonclientname.isDisplayed();
					    //////Thread.sleep(500);
					    return true;
					} catch (Exception ex) {
					    return false;
					}

				}
				
				//verify  AR days to

				public boolean VerifyApBucketDaysTo() {
					try {
					    WebElement clickonclientname = new WebDriverWait(driver,5)
						    .until(ExpectedConditions .visibilityOfElementLocated(ApDaysto_xpath));
					    clickonclientname.isDisplayed();
					    //////Thread.sleep(500);
					    return true;
					} catch (Exception ex) {
					    return false;
					}

				}
				//click on plus Symbol

				public boolean clickOnApAdd() {
					try {
					    WebElement menuItemWebE = new WebDriverWait(driver, 5)
					    .until(ExpectedConditions.visibilityOfElementLocated(Apadd_xpath));
					    menuItemWebE.click();

					    return true;
					} catch (Exception ex) {
					    return false;
					}
				    }

				//enter data in bucket name field

				public String ClickOnApBucketNameField(String value) {
					try {
					    WebElement ClickOnBucketNameField = new WebDriverWait(driver,5)
						    .until(ExpectedConditions .visibilityOfElementLocated(ApeditBox_xpath));
					    ClickOnBucketNameField.click();
					    //////Thread.sleep(2000);
					 ClickOnBucketNameField.sendKeys(value);
				} catch (Exception ex) {
					   
					}
					return value;
				}
				//enter data in bucket name field

				public String ClickOnApBucketDaysFromField(String value) {
					try {
					    WebElement ClickOnBucketNameField = new WebDriverWait(driver,5)
						    .until(ExpectedConditions .visibilityOfElementLocated(ApBucketDaysFromEdit_xpath));
					    ClickOnBucketNameField.click();
					    //////Thread.sleep(2000);
					    ClickOnBucketNameField.sendKeys(value);
				} catch (Exception ex) {
					   
					}
					return value;
				}


public String ClickApOnDaysFrom(String value) {
	try {
	    WebElement ClickOnBucketNameField = new WebDriverWait(driver,5)
		    .until(ExpectedConditions .visibilityOfElementLocated(ApBucketDaystoEdit_xpath));
	    ClickOnBucketNameField.click();
	    //////Thread.sleep(2000);
	    ClickOnBucketNameField.sendKeys(value);
} catch (Exception ex) {
	   
	}
	return value;
}
//click on save

public boolean ClickOnApSaveSymbol() {
	try {
	    WebElement ClickOnPlusSymbol = new WebDriverWait(driver,5)
		    .until(ExpectedConditions .visibilityOfElementLocated(ApSave_xpath));
	    ClickOnPlusSymbol.click();
      //  this.isAlertPresent();
	    return true;
	} catch (Exception ex) {
	    return false;
	}
}

//doubleclick on ap days to
public boolean doubleclickonApDaysto()
{
	
	try
	{
		Thread.sleep(500);
		WebElement doubleclickonDaysto=new WebDriverWait(driver,5)
		.until(ExpectedConditions.visibilityOfElementLocated(ApDaysTo_xpath));
		Actions action = new Actions(driver);
		action.doubleClick(doubleclickonDaysto).build().perform();
		//////Thread.sleep(2000);	
		return true;
		}
	catch (Exception e)
	{
		
	}
	return false;
	
}


//enter data 
public boolean EnterdatainApDayTo(String value) {
	try {
	    WebElement ClickOnBucketNameField = new WebDriverWait(driver,5)
		.until(ExpectedConditions .visibilityOfElementLocated(Apenterdaysto));
	    ClickOnBucketNameField.clear();
	    ClickOnBucketNameField.sendKeys(value);
	    return true;
} catch (Exception ex) {
	   
	}
	return false;
}


//click on Ar reload
public boolean ClickOnApReload() {
	try {
	    WebElement ClickOnArReload = new WebDriverWait(driver,5)
		    .until(ExpectedConditions .visibilityOfElementLocated(Apreload));
	    ClickOnArReload.click();
	    //////Thread.sleep(6000);
	    return true;
	} catch (Exception ex) {
	    return false;
	}}

//Click on Ap cancle
	public boolean ClickOnApCancle() {
		try {
		    WebElement ClickOnArReload = new WebDriverWait(driver,5)
			    .until(ExpectedConditions .visibilityOfElementLocated(ApCancle_xpath));
		    ClickOnArReload.click();
		    //////Thread.sleep(6000);
		    return true;
		} catch (Exception ex) {
		    return false;
		}}
//click on Ap Export
	//Click on Ap cancle
		public boolean ClickOnApExport() {
			try {
			    WebElement ClickOnArReload = new WebDriverWait(driver,30)
				    .until(ExpectedConditions .visibilityOfElementLocated(Apexport_xpath));
			    ClickOnArReload.click();
			    //////Thread.sleep(6000);
			    return true;
			} catch (Exception ex) {
			    return false;
}}
		
		//click on previous page symbol

		public boolean ClickOnApPreviousPageSymbol() {
			try {
			    WebElement ClickOnArPreviousPageSymbol = new WebDriverWait(driver,5)
				    .until(ExpectedConditions.visibilityOfElementLocated(ApPrevious_xpath));
			    ClickOnArPreviousPageSymbol.click();
			    //////Thread.sleep(500);
			    return true;
			} catch (Exception ex) {
			    return false;
			}
		}
		
		//click on first page
		

		public boolean ClickOnApFirstPageSymbol() {
			try {
			    WebElement ClickOnArPreviousPageSymbol = new WebDriverWait(driver,5)
				    .until(ExpectedConditions.visibilityOfElementLocated(ApFirstPagination_xpath));

			    ClickOnArPreviousPageSymbol.click();
			    //////Thread.sleep(500);
			    return true;
			} catch (Exception ex) {
			    return false;
			}

		}
		
		//click on Next page
		

			public boolean ClickOnApNextPageSymbol() {
				try {
				    WebElement ClickOnArPreviousPageSymbol = new WebDriverWait(driver,5)
					    .until(ExpectedConditions.visibilityOfElementLocated(ApNextPAgination_xpath));

				    ClickOnArPreviousPageSymbol.click();
				    //////Thread.sleep(500);
				    return true;
				} catch (Exception ex) {
				    return false;
				}
		}

			
			

				//click on LAST page
				

					public boolean ClickOnAplastPageSymbol() {
						try {
						    WebElement ClickOnArPreviousPageSymbol = new WebDriverWait(driver,5)
							    .until(ExpectedConditions.visibilityOfElementLocated(ApLastPAgination_xpath));
						    ClickOnArPreviousPageSymbol.click();
						    //////Thread.sleep(500);
						    return true;
						} catch (Exception ex) {
						    return false;
						}
				}
					
					//enter data in bucket name field

					public String EnterdataOnApBucketNameField(String value) {
						try {
						    WebElement ClickOnBucketNameField = new WebDriverWait(driver,5)
							    .until(ExpectedConditions .visibilityOfElementLocated(ApBucketEdit_xpath));
						    ClickOnBucketNameField.click();
						    ClickOnBucketNameField.clear();
						    //////Thread.sleep(2000);
						    ClickOnBucketNameField.sendKeys(value);
					} catch (Exception ex) {
						   
						}
						return value;
					}
					//enter data in bucket Days From field

					public String EnterdataOnApBucketNameDaysFrom(String value) {
						try {
						    WebElement ClickOnBucketNameField = new WebDriverWait(driver,5)
							    .until(ExpectedConditions .visibilityOfElementLocated(ApBucketDaysFromEdit_xpath));
						    ClickOnBucketNameField.click();
						    ClickOnBucketNameField.clear();
						    //////Thread.sleep(2000);
						    ClickOnBucketNameField.sendKeys(value);
					} catch (Exception ex) {
						   
						}
						return value;
					}

					//enter data in bucket Days to field

					public String EnterdataOnApBucketNameDaysTo(String value) {
						try {
						    WebElement ClickOnBucketNameField = new WebDriverWait(driver,5)
							    .until(ExpectedConditions .visibilityOfElementLocated(ApBucketDaystoEdit_xpath));
						    ClickOnBucketNameField.click();
						    ClickOnBucketNameField.clear();
						    //////Thread.sleep(2000);
						    ClickOnBucketNameField.sendKeys(value);
					} catch (Exception ex) {
						   
						}
						return value;
					}

//Click on detail payable over 5
					public boolean clickonOver5Search() {
				    	try {
				    	    WebElement clickoncolletralsearch = new WebDriverWait(driver,5)
				    		    .until(ExpectedConditions .visibilityOfElementLocated(Over5_xpath));
				    	    clickoncolletralsearch.click();
				    	    Actions action = new Actions(driver);
				    	    action.sendKeys(Keys.TAB).build().perform();
				    	  
				    	   //////Thread.sleep(500);
				    	    return true;
				    	} catch (Exception ex) {
				    	    return false;
				    	}

				        }
					//Verify Over 15 
					public boolean VerifyOver15() {
						try {
						    WebElement clickonclientname = new WebDriverWait(driver,5)
							    .until(ExpectedConditions .visibilityOfElementLocated(Over15_xpath));
						    clickonclientname.isDisplayed();
						    //////Thread.sleep(500);
						    return true;
						} catch (Exception ex) {
						    return false;
						}

					}
					//Verify Over 15 
					public boolean VerifyOver15inSummaryPayable() {
						try {
						    WebElement clickonclientname = new WebDriverWait(driver,5)
							    .until(ExpectedConditions .visibilityOfElementLocated(SummaryOver15_xpath));
						    clickonclientname.isDisplayed();
						    //////Thread.sleep(500);
						    return true;
						} catch (Exception ex) {
						    return false;
						}

					}
					
					//Verify Over 15 
					public boolean VerifyOver15inBBcreport() {
						try {
						    WebElement clickonclientname = new WebDriverWait(driver,5)
							    .until(ExpectedConditions .visibilityOfElementLocated(VerifyOver15_xapth));
						    clickonclientname.isDisplayed();
						    //////Thread.sleep(500);
						    return true;
						} catch (Exception ex) {
						    return false;
						}

					}
					//Verify Over 120
					public boolean VerifyOver15inMappingView() {
						try {
						    WebElement clickonclientname = new WebDriverWait(driver,5)
							    .until(ExpectedConditions .visibilityOfElementLocated(Verifydata_xpath));
						    clickonclientname.isDisplayed();
						    //////Thread.sleep(500);
						    return true;
						} catch (Exception ex) {
						    return false;
						}

					}
					
					public boolean ClickOnHTMLReport() {
						try {
						    WebElement clickonclientname = new WebDriverWait(driver,5)
							    .until(ExpectedConditions .visibilityOfElementLocated(htmlButton_xpath));
						    clickonclientname.click();
						    Set <String> handles =driver.getWindowHandles();
							Iterator<String> it = handles.iterator();
							//iterate through your windows
							while (it.hasNext()){
							String parent = it.next();
							String newwin = it.next();
							driver.switchTo().window(newwin).close();;
						    //Thread.sleep(500);
							driver.switchTo().window(parent);
						    return true;
						}
						}catch (Exception ex) {
						    return false;
						}
						return false;
					}
				
				
	}

	