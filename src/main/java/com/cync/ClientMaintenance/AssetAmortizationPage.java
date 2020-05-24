package com.cync.ClientMaintenance;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.cync.base.BasePage;
																								//Author name-Garima
public class AssetAmortizationPage extends BasePage {

	public AssetAmortizationPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	    }
	
	private final By MaincolletralName_xpath=By.xpath("//select[@name='collateral_advance_rate_id']");
	private final By AddSymbol_xpath=By.xpath("//span[@class='ui-icon ui-icon ui-icon-plus']");
	private final By secondcolletral_xpath=By.xpath("jqgrow ui-row-ltr ui-widget-content row-even ui-state-hover");
	private final By secondassertname_xpath=By.xpath("//td[@role='gridcell'][4]//input[@name='name']");
	private final By secondamortizedamount_xpath=By.xpath("//td[@role='gridcell'][5]//input[@name='amount']");
	private final By secondamortizedfrequency_xpath=By.xpath("//tr[@class='jqgrow ui-row-ltr ui-widget-content row-even jqgrid-new-row ui-state-highlight']//select[@name='frequency']");
	private final By secondamortizedpercentage=By.xpath("//td[@role='gridcell'][7]//input[@name='percentage']");
	private final By savebutton_xpath=By.xpath("//span[@class='ui-icon ui-icon ui-icon-disk']");
	private final By sucessmessageverify_xpath=By.xpath("//div[@class='ui-state-error']");
	private final By closesucessbox_xpath=By.xpath("//a[@class='fm-button ui-state-default ui-corner-all']");
	private final By canclebutton_xpath=By.xpath("//span[@class='ui-icon ui-icon ui-icon-cancel']");
	private final By relode_xpath=By.xpath("//span[@class='ui-icon ui-icon-refresh']");
	private final By delete_xpath=By.xpath("//span[@class='ui-icon ui-icon-trash']");
	private final By export_xpath=By.xpath("//span[@class='ui-icon ui-icon-extlink']");
	private final By download_xpath=By.xpath("//div[@class='export']");
	private final By firstpage_xpath=By.xpath("//span[@class='ui-icon ui-icon-seek-first']");
	private final By previouspage_xpath=By.xpath("//span[@class='ui-icon ui-icon-seek-prev']");
	private final By nextpage_xpath=By.xpath("//span[@class='ui-icon ui-icon-seek-next']");
	private final By lastpage_xpath=By.xpath("//span[@class='ui-icon ui-icon-seek-end']");
	private final By secondassernameinbrowser_xpath=By.xpath("//tr[@class='jqgrow ui-row-ltr ui-widget-content row-even']//td[@role='gridcell'][4]");
	private final By mainassertname_xpath=By.id("gs_name");
	private final By firstcheckbox_xpath=By.xpath("//td[@role='gridcell']//input[@role='checkbox']");
	private final By deletedilogbox_xpath=By.id("dData");
	private final By bbcprocess_xpath=By.xpath("//div[@class='col-md-2']");
	 private final By BBCAvailability_xpath=By.id("tab_150");
	 private final By totalassertamount_xpath=By.xpath("//tr[@class='footrow footrow-ltr ui-widget-content']//td[@role='gridcell'][5]");
	 private final By totalassertpercentagevalue_xpath=By.xpath("//tr[@class='footrow footrow-ltr ui-widget-content']//td[@role='gridcell'][8]");
	 
	// private final By DeleteButton_xopath=By.id("//a[@id='dData']");
	// private final By DeleteButton_xopath=By.xpath("//a[@class='fm-button ui-state-default ui-corner-all fm-button-icon-left ui-state-active']");
	 private final By DeleteButton_xopath= By.xpath("//div[@id='delmodamortized_asset']//descendant::a[@class='ui-jqdialog-titlebar-close ui-corner-all']");
	 private final By Cross=By.xpath("(//a[@class='ui-jqdialog-titlebar-close ui-corner-all'])[1]");
	 private final By WarningCross_xpath=By.xpath("//div[@id='alerthd_amortized_asset']//descendant::a[@class='ui-jqdialog-titlebar-close ui-corner-all']");
//select  data from main colletral name
	public  String clickonmaincolletralname(String data)
	{
	try{
	WebElement clickonmaincolletralname =new WebDriverWait(driver,5)
	.until(ExpectedConditions.visibilityOfElementLocated( MaincolletralName_xpath));
	clickonmaincolletralname.click();
	Select sel= new Select(clickonmaincolletralname);
	sel.selectByVisibleText(data);
	//clickonmaincolletralname.sendKeys(data);
////Thread.sleep(500);
	}
	catch(Exception ex){

	}
	return data;
	}
	//click on edit box symbol
	
		public boolean clickOnFirsteditboxsymbol() {
			try{
				WebElement clickOnFirsteditboxsymbol =new WebDriverWait(driver,5)
				.until(ExpectedConditions.visibilityOfElementLocated(firstcheckbox_xpath));
				clickOnFirsteditboxsymbol.click();
			Thread.sleep(500);
		    return true;
		} catch (Exception ex) {
		    return false;
		}
		}
		
		//Click on Cross
		

		/*public boolean clickOnCross() {
			try{
				WebElement clickOnFirsteditboxsymbol =new WebDriverWait(driver,5)
				.until(ExpectedConditions.visibilityOfElementLocated(Cross));
				clickOnFirsteditboxsymbol.click();
			Thread.sleep(500);
		    return true;
		} catch (Exception ex) {
		    return false;
		}
		}*/
		//click on delete box symbol
		
			public boolean clickOnDeletedilogbox() {
				try{
					WebElement clickOnDeletedilogbox =new WebDriverWait(driver,5)
					.until(ExpectedConditions.visibilityOfElementLocated(deletedilogbox_xpath));
					clickOnDeletedilogbox.click();
				//Thread.sleep(500);
			    return true;
			} catch (Exception ex) {
			    return false;
			}
			}
	//click on add symbol
	
	public boolean clickOnAddsymbol() {
		try{
			//Thread.sleep(2000);
			WebElement clickOnAddsymbol =new WebDriverWait(driver,5)
			.until(ExpectedConditions.visibilityOfElementLocated(AddSymbol_xpath));
			clickOnAddsymbol.click();
		//Thread.sleep(500);
	    return true;
	} catch (Exception ex) {
	    return false;
	}
	}
	//click on main assert namesymbol
	
		public String clickOnmainassertnamesymbol(String data) {
			try{
				WebElement clickOnmainassertnamesymbol =new WebDriverWait(driver,5)
				.until(ExpectedConditions.visibilityOfElementLocated(mainassertname_xpath));
				clickOnmainassertnamesymbol.click();
				clickOnmainassertnamesymbol.sendKeys(data);
		   //Thread.sleep(5000);
		} catch (Exception ex) {
		   
		}
			return data;
		}
	//click on download symbol
	
		public boolean clickOndownloadsymbol() {
			try{
				WebElement clickOndownloadsymbol =new WebDriverWait(driver,5)
				.until(ExpectedConditions.visibilityOfElementLocated(download_xpath));
				clickOndownloadsymbol.click();
			//Thread.sleep(6000);
		    return true;
		} catch (Exception ex) {
		    return false;
		}
		}
	//click on cancel symbol
	
		public boolean clickOnCanclesymbol() {
			try{
				WebElement clickOnCanclesymbol =new WebDriverWait(driver,5)
				.until(ExpectedConditions.visibilityOfElementLocated(canclebutton_xpath));
				clickOnCanclesymbol.click();
			//Thread.sleep(500);
		    return true;
		} catch (Exception ex) {
		    return false;
		}
		}
		//click on reload symbol
		
			public boolean clickOnReloadsymbol() {
				try{
					WebElement clickOnReloadsymbol =new WebDriverWait(driver,5)
					.until(ExpectedConditions.visibilityOfElementLocated(relode_xpath));
					clickOnReloadsymbol.click();
				//Thread.sleep(5000);
			    return true;
			} catch (Exception ex) {
			    return false;
			}
			}
			//click on delete symbol
			
			public boolean clickOndeletesymbol() {
				try{
					WebElement clickOndeletesymbol =new WebDriverWait(driver,5)
					.until(ExpectedConditions.visibilityOfElementLocated(delete_xpath));
					clickOndeletesymbol.click();
				
				Thread.sleep(500);
			    return true;
			} catch (Exception ex) {
			    return false;
			}
			}
			
			
			public boolean clickOndeletesymbol2() {
				try{
					WebElement clickOndeletesymbol =new WebDriverWait(driver,5)
					.until(ExpectedConditions.visibilityOfElementLocated(DeleteButton_xopath));
					clickOndeletesymbol.click();
				
				Thread.sleep(500);
			    return true;
			} catch (Exception ex) {
			    return false;
			}
			}
			//click on export symbol
			
			public boolean clickOnExportsymbol() {
				try{
					WebElement clickOnExportsymbol =new WebDriverWait(driver,5)
					.until(ExpectedConditions.visibilityOfElementLocated(export_xpath));
					clickOnExportsymbol.click();
				Thread.sleep(500);
			    return true;
			} catch (Exception ex) {
			    return false;
			}
			}
			//click on  firstpagesymbol
			
			public boolean clickOnfirstpagesymbol() {
				try{
					//Thread.sleep(1000);
					WebElement clickOnfirstpagesymbol =new WebDriverWait(driver,5)
					.until(ExpectedConditions.visibilityOfElementLocated(firstpage_xpath));
					clickOnfirstpagesymbol.click();
				//Thread.sleep(6000);
			    return true;
			} catch (Exception ex) {
			    return false;
			}
			}
//click on  previouspagesymbol
			
			public boolean clickOnpreviouspagesymbol() {
				try{
					WebElement clickOnfirstpagesymbol =new WebDriverWait(driver,5)
					.until(ExpectedConditions.visibilityOfElementLocated(previouspage_xpath));
					clickOnfirstpagesymbol.click();
				//Thread.sleep(6000);
			    return true;
			} catch (Exception ex) {
			    return false;
			}
			}
//click on  nextpagesymbol
			
			public boolean clickOnnextpagesymbol() {
				try{
					WebElement clickOnfirstpagesymbol =new WebDriverWait(driver,5)
					.until(ExpectedConditions.visibilityOfElementLocated( nextpage_xpath));
					clickOnfirstpagesymbol.click();
				//Thread.sleep(6000);
			    return true;
			} catch (Exception ex) {
			    return false;
			}
			}
//click on   lasrpagesymbol
			
			public boolean clickOnlastpagesymbol() {
				try{
					WebElement clickOnfirstpagesymbol =new WebDriverWait(driver,5)
					.until(ExpectedConditions.visibilityOfElementLocated( lastpage_xpath));
					clickOnfirstpagesymbol.click();
				//Thread.sleep(6000);
			    return true;
			} catch (Exception ex) {
			    return false;
			}
			}
	//clickon second colletral
	public  String clickonsecondcolletralname(String data)
	{
	try{
	WebElement clickonsecondcolletralname =new WebDriverWait(driver,5)
	.until(ExpectedConditions.visibilityOfElementLocated(secondcolletral_xpath));
	
	clickonsecondcolletralname.click();

	}
	catch(Exception ex){

	}
	return data;
	}
	//clickon secondassert colletral
		public  String clickonsecondassertname(String data10)
		{
		try{
		WebElement clickonsecondassertname =new WebDriverWait(driver,5)
		.until(ExpectedConditions.visibilityOfElementLocated(secondassertname_xpath));
	//	clickonsecondassertname.click();
		clickonsecondassertname.clear();
		clickonsecondassertname.sendKeys(data10);
		
		
		
		}
		catch(Exception ex){
			
		}
		return data10;
		}
		//clickon secondassertamount colletral
				public  String clickonsecondamortisedamount(String data)
				{
				try{
				WebElement clickonsecondamortisedamount =new WebDriverWait(driver,5)
				.until(ExpectedConditions.visibilityOfElementLocated(secondamortizedamount_xpath));
				

				clickonsecondamortisedamount.sendKeys(data);
				
				}
				catch(Exception ex){

				}
				return data;
				}
				//clickon secondassertfrequency colletral
				public  String clickonsecondamortisedfrequency(String data)
				
				{
				try{
				WebElement clickonsecondamortisedfrequency =new WebDriverWait(driver,5)
				.until(ExpectedConditions.visibilityOfElementLocated(secondamortizedfrequency_xpath));
				
				
				clickonsecondamortisedfrequency.sendKeys(data);
			
				}
				catch(Exception ex){

				}
				return data;
				}
				//clickon secondassert percentage colletral
				public  String clickonsecondamortisedpercentage(String data)
				
				{
				try{
				WebElement clickonsecondamortisedpercentage =new WebDriverWait(driver,5)
				.until(ExpectedConditions.visibilityOfElementLocated(secondamortizedpercentage));
				
				
				clickonsecondamortisedpercentage.sendKeys(data);
			
				}
				catch(Exception ex){

				}
				return data;
				}
				//click on save symbol
				
				public boolean clickOnSavesymbol() {
					try{
						WebElement clickOnSavesymbol =new WebDriverWait(driver,5)
						.until(ExpectedConditions.visibilityOfElementLocated(savebutton_xpath));
						clickOnSavesymbol.click();
					//Thread.sleep(500);
				    return true;
				} catch (Exception ex) {
				    return false;
				}
				}
				//verify message data
				
				public String verifysucessmessage(String data) {
					try{
						WebElement verifysucessmessage =new WebDriverWait(driver,5)
						.until(ExpectedConditions.visibilityOfElementLocated(sucessmessageverify_xpath));
						verifysucessmessage.isDisplayed();
					//Thread.sleep(500);
					
					verifysucessmessage.sendKeys(data);
					
				} catch (Exception ex) {
				  
				}
					return data;
				}
				
				public boolean clickOnwarnningl() {
					try{
						WebElement clickOndeletesymbol =new WebDriverWait(driver,5)
						.until(ExpectedConditions.visibilityOfElementLocated(WarningCross_xpath));
						clickOndeletesymbol.click();
					
					Thread.sleep(500);
				    return true;
				} catch (Exception ex) {
				    return false;
				}
				}
				
//verify message data
				
				public boolean clickonclose() {
					try{
						WebElement clickonclose =new WebDriverWait(driver,5)
						.until(ExpectedConditions.visibilityOfElementLocated(closesucessbox_xpath));
						clickonclose.click();
					//Thread.sleep(7000);
				    return true;
				} catch (Exception ex) {
				    return false;
				}
				}
				//double click on asset name
				public boolean doubleclickonassertname()
				{
					try
					{
						WebElement clickonassertname=new WebDriverWait(driver,5)
						.until(ExpectedConditions.visibilityOfElementLocated(secondassernameinbrowser_xpath));
						Actions action = new Actions(driver);
						action.doubleClick(clickonassertname).build().perform();
						}
					catch (Exception e)
					{
						
					}
					return false;
					
				}
				//click on bbc
				public boolean clickonrecalculatebbc()
				{
				try{
				WebElement bbc =new WebDriverWait(driver,5)
				.until(ExpectedConditions.visibilityOfElementLocated(bbcprocess_xpath));
				bbc.click();
				//Thread.sleep(2000);
				
			return true;
				}
				catch(Exception ex){

				}
				return false;

				
			}
				//click on bbc avablity
				public boolean clickonbbcavablity()
				{
				try{
				WebElement bbcavablity =new WebDriverWait(driver,5)
				.until(ExpectedConditions.visibilityOfElementLocated(BBCAvailability_xpath));
				bbcavablity.click();
				//Thread.sleep(7000);

				return true;
				}
				catch(Exception ex){

				}
				return false;
				}
				//click on bbc avablity
				public boolean comparetotalassertamountandassertpercentage()
				{
				try{
				WebElement totalassertamount =new WebDriverWait(driver,5)
				.until(ExpectedConditions.visibilityOfElementLocated(totalassertamount_xpath));
				totalassertamount.getText();
				WebElement totalassertamount1 =new WebDriverWait(driver,5)
				.until(ExpectedConditions.visibilityOfElementLocated(totalassertpercentagevalue_xpath));
				totalassertamount1.getText();
				if(totalassertamount.equals(totalassertamount1));
				{
					System.out.println("data verified ");
				}

				return true;
				}
				catch(Exception ex){

				}
				return false;
				}
				}
	