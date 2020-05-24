package com.cync.ClientMaintenance;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.cync.base.BasePage;
																		//Author name-Garima
public class ActivityPage extends BasePage{
	

	

private final By addsymbol_xpath = By.xpath("//span[@class='ui-icon ui-icon ui-icon-plus']");
private final By descriptionbox_xpath=By.xpath("(//input[@role='textbox'])[7]");
private final By savebutton_xpath=By.xpath("//span [@class='ui-icon ui-icon ui-icon-disk']");
private final By closesucessbox_xpath=By.id("closedialog");
private final By frequencydropdown_xpath=By.id("gs_frequency");
private final By lastdate_xpath=By.id("gs_last_date");
private final By nextdate_xpath=By.id("gs_next_date");
private final By daytorecipt_xpath=By.id("jqg1_days_to_receipt");
private final By notificationdate_xpath=By.id("jqg1_notification_days");
private final By search_xpath=By.id("gs_source_documents_name");
private final By canclbutton_xpath=By.xpath("//span[@class='ui-icon ui-icon ui-icon-cancel']");
private final By reloadbutton_xpath=By.xpath("//span[@class='ui-icon ui-icon-refresh']");
private final By exportbutton_xpath=By.xpath("//span [@class='ui-icon ui-icon-extlink']");
private final By downloadbutton_xpath=By.xpath("//div[@class='export']");
private final By firstpage_xpath=By.xpath("//td[@class='ui-pg-button ui-corner-all']//span[@class='ui-icon ui-icon-seek-first']");
private final By previouspage_xpath=By.xpath("//span[@class='ui-icon ui-icon-seek-prev']");
private final By  nextpage_xpath=By.xpath("//span[@class='ui-icon ui-icon-seek-next']");
private final By  lastpage_xpath=By.xpath("//td[@class='ui-pg-button ui-corner-all ui-state-disabled']//span[@class='ui-icon ui-icon-seek-end']");
private final By delete_xpath=By.xpath(" //td[@id='del_lender_tickler_list']//div[@class='ui-pg-div']");
private final By frequency_xpath=By.id("gs_frequency");
private final By selectfiestcheckbox_xpath=By.xpath("(//input[@role='checkbox'])");
//private final By deletedilodbox_xpath=By.id("dData");
private final By selectdownloadpopup_xpath=By.id("export_cols");
private final By selectsecondcheckbox_Xpath=By.xpath("(//input[@role='checkbox'])");
private final By selecteditbox__xpatBy=By.xpath("//tr[@class='jqgrow ui-row-ltr ui-widget-content row-even'][2]//td[@role='gridcell'][3]");
private final By Doubleclick_xpath=By.xpath("(//td[@role='gridcell'])");
private final By Entervalue_xpath=By.xpath("//td[@role='gridcell']//input[@name='source_documents_name']");
private final By deletedilodbox_xpath=By.xpath("//a[@class='ui-jqdialog-titlebar-close ui-corner-all']");
private final By Doubleclick_xpath1=By.xpath("(//td[@role='gridcell'])[35]");








public ActivityPage(WebDriver driver) {
	super(driver);
	
    }

//method to click on add button 
public boolean clickToAdd()
{
	try
	{
		WebElement ClickonAdd=new WebDriverWait(driver,5)
		.until(ExpectedConditions.visibilityOfElementLocated(addsymbol_xpath));
		ClickonAdd.click();
		
return true;
		}
	catch (Exception e)
	{
		return false;
	}}

//method to click on add button 
public boolean ToAdd()
{
	try
	{
		WebElement ClickonAdd=new WebDriverWait(driver,5)
		.until(ExpectedConditions.visibilityOfElementLocated(addsymbol_xpath));
		ClickonAdd.isDisplayed();
		
return true;
		}
	catch (Exception e)
	{
		return false;
	}}
//select   edit box 
public boolean clickeditbox()
{
	try
	{  
		/*Wait<WebDriver> wait= new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofMillis(50))
				.pollingEvery(Duration.ofNanos(20)).ignoring(NoSuchElementException.class);
		WebElement  Clickeditbox= wait.until(ExpectedConditions.visibilityOfElementLocated(addsymbol_xpath));*/
		
		WebElement  Clickeditbox=new WebDriverWait(driver,5)
		.until(ExpectedConditions.visibilityOfElementLocated(addsymbol_xpath));
		 Clickeditbox.click();
		
return true;
		}
	catch (Exception e)
	{
		return false;
	}}
//click on secondcheckbox
public boolean clickTosecondcheckbox ()
{
	try
	{
		
		WebElement clickTosecondcheckbox=new WebDriverWait(driver,5)
		.until(ExpectedConditions.visibilityOfElementLocated(selectsecondcheckbox_Xpath));
		
		
		clickTosecondcheckbox.click();
		
return true;
		}
	catch (Exception e)
	{
		return false;
	}}

//click on second edit box
/*public boolean clickTosecondeditbox()
{
	try
	{
		WebElement clickTosecondeditbox=new WebDriverWait(driver,200)
		.until(ExpectedConditions.visibilityOfElementLocated(selecteditbox__xpatBy));
		////Thread.sleep(2000);
		Actions act1=new Actions((WebDriver)selecteditbox__xpatBy);
		act1.doubleClick().perform();
		////Thread.sleep(1000);
		((WebElement) act1).clear();
		
return true;
		}
	catch (Exception e)
	{System.out.println("Test case Failed");
		return false;
	}}
*/
//method to edit
public String clickTosecondeditbox1(String data)
{
	try
	{
		WebElement clickTosecondeditbox=new WebDriverWait(driver,5)
		.until(ExpectedConditions.visibilityOfElementLocated(selecteditbox__xpatBy));
		Actions action = new Actions(driver);
		action.doubleClick(clickTosecondeditbox).build().perform();
		////Thread.sleep(2000);
		((WebElement) action).clear();

		
		
		

		}
	catch (Exception e)
	{
		
	}
	return data;}


//select downloadpopup for export
public boolean clickTodownload ()
{
	try
	{
		WebElement ClickonAdd=new WebDriverWait(driver,5)
		.until(ExpectedConditions.visibilityOfElementLocated(selectdownloadpopup_xpath));
		ClickonAdd.click();
		
return true;
		}
	catch (Exception e)
	{
		return false;
	}}

	//select delet dilog box
	public boolean clickdeletedilogbox()
	{
		try
		{
			WebElement ClickonAdd=new WebDriverWait(driver,5)
			.until(ExpectedConditions.visibilityOfElementLocated(deletedilodbox_xpath));
			ClickonAdd.click();
			
	return true;
			}
		catch (Exception e)
		{
			return false;
		}
	
}//select first check box
	public boolean clickcheckbox()
	{
		try
		{
			WebElement clickcheckbox=new WebDriverWait(driver,5)
			.until(ExpectedConditions.visibilityOfElementLocated(selectfiestcheckbox_xpath));
			clickcheckbox.click();
			
	return true;
			}
		catch (Exception e)
		{
			return false;
		}
	}
	 //method to enter text in description box

	public boolean enterdata(String ClientData)
	{
	try{

	WebElement divisioncode =new WebDriverWait(driver,5)
	.until(ExpectedConditions.visibilityOfElementLocated(descriptionbox_xpath));
	////Thread.sleep(500);
		/*Wait<WebDriver> wait= new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofMillis(50))
				.pollingEvery(Duration.ofNanos(20)).ignoring(NoSuchElementException.class);
		WebElement divisioncode=wait.until(ExpectedConditions.visibilityOfElementLocated(descriptionbox_xpath));*/
	Thread.sleep(1000);
	
/*	Actions act=new Actions(driver);
	act.click();
	act.sendKeys(ClientData);*/
	
	divisioncode.sendKeys(ClientData);

	}
	catch(Exception ex){
return false;
	}
	return true;
	
	}
	
//method to click on save button

public boolean clickOnsavebutton()
{
	try{
		/*Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofMillis(50))
				.pollingEvery(Duration.ofNanos(20)).ignoring(NoSuchElementException.class);
		WebElement clickOnsavebutton= wait.until(ExpectedConditions.elementToBeClickable(savebutton_xpath));*/
		
		
		
		WebElement clickOnsavebutton=new WebDriverWait(driver,5)
	.until(ExpectedConditions.visibilityOfElementLocated( savebutton_xpath));
	 clickOnsavebutton.click();
	
	 return true;
}
catch(Exception e)
{
	 return false;
}
}
//method to click on close button
public  String  clickOnCloseSucessbox(String successmsg)
{
	try
	

		{
		/*Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofMillis(50))
				.pollingEvery(Duration.ofNanos(20)).ignoring(NoSuchElementException.class);
		WebElement clickOnCloseSucessbox= wait.until(ExpectedConditions.elementToBeClickable(closesucessbox_xpath));*/
		
		WebElement clickOnCloseSucessbox=new WebDriverWait(driver,5)
		.until(ExpectedConditions.visibilityOfElementLocated( closesucessbox_xpath));

		clickOnCloseSucessbox.click();
		
			
			
		 }
		 catch(Exception e)
		 {
			 
		 }
	
	return successmsg;
	
	
}
//method to click on frequency button
public  String  clickOnFrequencybutton(String clientdate)
{
	try
	{
		/*Wait<WebDriver> wait= new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofMillis(50))
				.pollingEvery(Duration.ofNanos(20)).ignoring(NoSuchElementException.class);
		WebElement clickOnFrequencybutton= wait.until(ExpectedConditions.visibilityOfElementLocated(frequencydropdown_xpath));*/
		
		
		WebElement clickOnFrequencybutton=new WebDriverWait(driver,5)
	.until(ExpectedConditions.visibilityOfElementLocated( frequencydropdown_xpath));
	clickOnFrequencybutton.click();
	clickOnFrequencybutton.sendKeys(clientdate);

	}
catch (Exception e)
{
	
}
	return clientdate;
}
//method to click on lastdate
public String clickOnLastdate(String clientname)
{
	try {
		WebElement  clickOnLastdate=new WebDriverWait(driver,5)
		.until(ExpectedConditions.visibilityOfElementLocated( lastdate_xpath));
		 clickOnLastdate.click();
		 clickOnLastdate.sendKeys(clientname);

		
		}
		catch (Exception e)
		{
		}
	return clientname;
}
//method to click on nextdate
public String clickOnNextdate(String clientname)
{
	try
	{
		/*Wait<WebDriver> wait= new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofMillis(50))
				.pollingEvery(Duration.ofNanos(20)).ignoring(NoSuchElementException.class);
		WebElement  clickOnNextdate=wait.until(ExpectedConditions.visibilityOfElementLocated(nextdate_xpath));*/
		
		
		WebElement  clickOnNextdate=new WebDriverWait(driver,5)
		.until(ExpectedConditions.visibilityOfElementLocated(  nextdate_xpath));
		clickOnNextdate.click();
		clickOnNextdate.sendKeys(clientname);
	}
	catch (Exception e)
	{
		
	}
	return clientname;}
		//method to click on day to receipt

public String dayToRecipt(String clientdate1)
{
	try
	{
		/*Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofMillis(50))
				.pollingEvery(Duration.ofNanos(20)).ignoring(NoSuchElementException.class);
		WebElement  dayToRecipt= wait.until(ExpectedConditions.visibilityOfElementLocated(daytorecipt_xpath));*/
		
		WebElement  dayToRecipt=new WebDriverWait(driver,5)
		.until(ExpectedConditions.visibilityOfElementLocated(  daytorecipt_xpath));
		dayToRecipt.click();
		dayToRecipt.sendKeys(clientdate1);
	}
	catch(Exception e)
	{
		
	}
	return clientdate1;
	}
	//method to click on notification date
	public String  notificationDate(String clientdate11)
	{
		try
		{
			/*Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
					.withTimeout(Duration.ofMillis(50))
					.pollingEvery(Duration.ofNanos(20)).ignoring(NoSuchElementException.class);
			WebElement notificationDate= wait.until(ExpectedConditions.visibilityOfElementLocated(notificationdate_xpath));*/
			
			
			WebElement notificationDate=new WebDriverWait(driver,5)
			.until(ExpectedConditions.visibilityOfElementLocated( notificationdate_xpath));
			notificationDate.click();
			notificationDate.sendKeys(clientdate11);
		}
		
	
		catch(Exception e)
		{
			
		}
		return clientdate11;}
		
		
	//method to click on search
		public String clicksearch(String data)
		{
			try
			{
				WebElement clickselectall=new WebDriverWait(driver,5)
				.until(ExpectedConditions.visibilityOfElementLocated( search_xpath));
				clickselectall.sendKeys(data);
				////Thread.sleep(2000);
				clickselectall.click();
			}
			catch(Exception e)
			{
				
				
		}
			return data;
			}
		//method to click on cancle button
		public boolean clickcancleButton()
		{
			try{
				WebElement clickcancleButton=new WebDriverWait(driver,5)
				.until(ExpectedConditions.visibilityOfElementLocated( canclbutton_xpath));
				clickcancleButton.click();
				////Thread.sleep(2000);
			
			
			return true;
			}
			catch(Exception e)
			{
				
				return false;
			}}
			//method to click on reload
	public boolean clickreload()
	{
		try{
			WebElement clickreload=new WebDriverWait(driver,5)
			.until(ExpectedConditions.visibilityOfElementLocated(reloadbutton_xpath));
			clickreload.click();
			////Thread.sleep(2000);
			return true;
		}
		catch (Exception e)
		{
			
		}
		return false;}
		//method to click on export button
	public boolean export()
	{
		try{
			WebElement export=new WebDriverWait(driver,5)
			.until(ExpectedConditions.visibilityOfElementLocated(exportbutton_xpath));
			export.click();
			return true;
	}
		catch(Exception e)
		{
			
		}
		return false;}
		
			//method to click on download button
	public boolean downloadButton()
	{
		try
		{WebElement  downloadButton=new WebDriverWait(driver,5)
		.until(ExpectedConditions.visibilityOfElementLocated(downloadbutton_xpath));
		 downloadButton.click();

			
			return true;
		}
		catch(Exception e)
		{
			
			return false;
		}
	}
	//method to click on firstpagination
	public boolean clickfirstPagination()
	{
		try
		{ WebElement  clickfirstPagination=new WebDriverWait(driver,5)
		.until(ExpectedConditions.visibilityOfElementLocated(firstpage_xpath));
	clickfirstPagination.click();
////Thread.sleep(2000);
			
			return true;
		}
		catch(Exception e)
		{
			
			return false;
		}
	}
	//method to create on nextpagination
	public boolean clicknextPage()
	{
		try{WebElement  clicknextPage=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(nextpage_xpath));
		clicknextPage.click();
		////Thread.sleep(2000);
		return true;
	}
		catch (Exception e)
		{
			
			return false;
		}
}
	//method to click on lastpage
	public  boolean clicklastPage()
	{
		try
		{WebElement   clicklastPage=new WebDriverWait(driver,5)
		.until(ExpectedConditions.visibilityOfElementLocated(lastpage_xpath));
		 clicklastPage.click();
		 ////Thread.sleep(2000);
			
			return true;
		}
		catch(Exception e)
		{
			
			return false;
		}
	}
	//method to click on previous page
	public  boolean previouspage()
	{
		try
		{WebElement   previouspage=new WebDriverWait(driver,5)
		.until(ExpectedConditions.visibilityOfElementLocated(previouspage_xpath));
		previouspage.click();
		 ////Thread.sleep(2000);
			
			return true;
		}
		catch(Exception e)
		{
			
			return false;
		}
	}
	//methos to delete
	public boolean clickondelete ()
	{
		try{
			
			WebElement   clickondelete=new WebDriverWait(driver,5)
			.until(ExpectedConditions.visibilityOfElementLocated(delete_xpath));
			////Thread.sleep(20000);
			clickondelete.click();
			return true;
		
		}
		catch(Exception e)
		{
			
			return false;
		}}
	
	public  String  verifyError(String errorsg)
	{
		try
		
		{  /*Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
		             .withTimeout(Duration.ofMillis(50))
		             .pollingEvery(Duration.ofNanos(20)).ignoring(NoSuchElementException.class);
		WebElement clickOnCloseSucessbox= wait.until(ExpectedConditions.visibilityOfElementLocated(closesucessbox_xpath));*/
			
			
			WebElement clickOnCloseSucessbox=new WebDriverWait(driver,5)
			.until(ExpectedConditions.visibilityOfElementLocated( closesucessbox_xpath));
			clickOnCloseSucessbox.click();
			
				
				
			 }
			 catch(Exception e)
			 {
				 
			 }
		
		return errorsg;
		
		
	}
	//click on frequency button
	public String clickOnfrequencybutton(String data)
	{
		try{/*Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofMillis(50))
				.pollingEvery(Duration.ofNanos(20)).ignoring(NoSuchElementException.class);
		
		WebElement clickOnfrequencybutton= wait.until(ExpectedConditions.visibilityOfElementLocated(frequency_xpath));*/
			
			
			WebElement clickOnfrequencybutton=new WebDriverWait(driver,5)
		.until(ExpectedConditions.visibilityOfElementLocated( frequency_xpath));
		clickOnfrequencybutton.click();
		clickOnfrequencybutton.sendKeys(data);
		 
	}
	catch(Exception e)
	{
		 
	}
		return data;

}
	public boolean selectSystemDate_From(){
		try {
		/*Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofMillis(50))
				.pollingEvery(Duration.ofNanos(20)).ignoring(NoSuchElementException.class);
		WebElement batchDateWebElement= wait.until(ExpectedConditions.visibilityOfElementLocated(lastdate_xpath));*/	
			
			WebElement batchDateWebElement = new WebDriverWait(driver,5)
		.until(ExpectedConditions
		.visibilityOfElementLocated(lastdate_xpath));
		Date date = new Date(System.currentTimeMillis());
		SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
		String today=formatter.format(date);

		batchDateWebElement.sendKeys(today);


		return true;
		} catch (Exception e) {
		return false;
		
		}}
public boolean selectSystemDate_From1(){
	try {
    /*Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
    		.withTimeout(Duration.ofMillis(50))
    		.pollingEvery(Duration.ofNanos(20)).ignoring(NoSuchElementException.class);
    WebElement batchDateWebElement= wait.until(ExpectedConditions.visibilityOfElementLocated(nextdate_xpath));*/
		
		
		WebElement batchDateWebElement = new WebDriverWait(driver,5)
	.until(ExpectedConditions
	.visibilityOfElementLocated(nextdate_xpath));
	Date date = new Date(System.currentTimeMillis());
	SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
	String today=formatter.format(date);

	batchDateWebElement.sendKeys(today);


	return true;
	} catch (Exception e) {
	return false;
	}
	}

	

	//double click
	
		
public String doubleoneditbutton(String data)
{
	try{
	
	WebElement element=new WebDriverWait(driver,5)
	.until(ExpectedConditions.visibilityOfElementLocated(selecteditbox__xpatBy));
	Actions action = new Actions(driver);
	action.doubleClick(element).build().perform();
	((WebElement) action).clear();
	action.sendKeys(data);

	
	}
catch(Exception ex){
	
}
	return data;
}

	
		
public boolean Doubleclick()
{
	try{
	
	WebElement element=new WebDriverWait(driver,5)
	.until(ExpectedConditions.visibilityOfElementLocated(selecteditbox__xpatBy));
	//Double click
	Actions action = new Actions(driver);
	action.doubleClick(element).build().perform();
	////Thread.sleep(2000);
	
return true;
}


catch(Exception ex){

return false;

}}


public boolean Doubleclicks()
{
try{
Thread.sleep(1000);
WebElement element=new WebDriverWait(driver,5)
.until(ExpectedConditions.visibilityOfElementLocated(Doubleclick_xpath));
//Double click
Actions action = new Actions(driver);
action.doubleClick(element).build().perform();

Thread.sleep(2000);
return true;
}

catch(Exception ex){
return false;

}}
//kruthivas
public boolean Doubleclicks1()
{
try{
Thread.sleep(1000);
WebElement element=new WebDriverWait(driver,5)
.until(ExpectedConditions.visibilityOfElementLocated(Doubleclick_xpath1));
//Double click
Actions action = new Actions(driver);
action.doubleClick(element).build().perform();

Thread.sleep(2000);
return true;
}

catch(Exception ex){
return false;

}}

public  String  enterValue(String c)
{
	try
	{WebElement clickOnFrequencybutton=new WebDriverWait(driver,5)
	.until(ExpectedConditions.visibilityOfElementLocated( Entervalue_xpath));
	clickOnFrequencybutton.click();
	clickOnFrequencybutton.sendKeys(c);

	}
catch (Exception e)
{
	
}
	return c;
}

public boolean enterdata1(String descriptiontData) {
	try {
	WebElement firstAccountNoWebElement = new WebDriverWait(driver, 5)
	.until(ExpectedConditions
	.visibilityOfElementLocated(descriptionbox_xpath));
	////Thread.sleep(500);
	firstAccountNoWebElement.sendKeys(descriptiontData);
	////Thread.sleep(500);	
	return true;
	} 
	catch (Exception e) {
		return false;
	}
	}
}