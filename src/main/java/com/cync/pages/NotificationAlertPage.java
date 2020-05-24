package com.cync.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.SkipException;


import com.cync.base.BasePage;

public class NotificationAlertPage extends BasePage {

	
	

	private final By BBCRecalculationProcessPageHeader_xpath = By.xpath("//span[contains(text(),'BBC Recalculation Process')]");
	private final By notificationAlertBtn_xpath = By.id("show_notification");
	private final By ClearAllBtn_xpath = By.id("notify_clear");
	private final By notificationAlertPopUpClose_xpath = By.xpath("//button[@class='ui-dialog-titlebar-close']");
	private final By reCalculationBbcBtn_xpath = By.xpath("//a[@href='/borrowers/4999/bbc_start']");
	private final By BBCRecalculationSuccessMsg_xpath = By.xpath("//div[contains(@class,'justifiedContent')]");

	

	//
	private final By clearAll_xpath=By.id("notify_clear");
	
	public NotificationAlertPage(WebDriver driver) {
		super(driver);
		try{
			/*if(!driver.findElement(BBCRecalculationProcessPageHeader_xpath).getText().trim().contains("BBC Recalculation Process")){
				throw new SkipException("BBC Recalculation Process page couldn't open.");
			
			}*/}
		catch(Exception e){
			
		// TODO Auto-generated constructor stub
			e.printStackTrace();
	}
		
		// TODO Auto-generated constructor stub
		
	}
	
	
	public String HeaderVerify(String Header)
	{
	 
	try{
		WebElement HeaderWebEelement=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(BBCRecalculationProcessPageHeader_xpath));
		HeaderWebEelement.getText();
		
	}
	catch(Exception ex){
		
	}
	return Header;
	
	} 
	
	

	public boolean NotificationAlertBtnVerify()
	{
		try{
		
		WebElement alertWebelement=new WebDriverWait(driver,100)
		.until(ExpectedConditions.visibilityOfElementLocated(notificationAlertBtn_xpath));
		alertWebelement.click();
		Thread.sleep(5000);
		
		return true;
	}
	

	catch(Exception ex){
		return false;
	}
		
	}
	
	public boolean NotificationAlertClearAllBtnVerify()
	{
		try{
		
		WebElement alertClearAllWebelement=new WebDriverWait(driver,100)
		.until(ExpectedConditions.visibilityOfElementLocated(ClearAllBtn_xpath));
		alertClearAllWebelement.click();
		Thread.sleep(3000);
		
		return true;
	}
	

	catch(Exception ex){
		return false;
	}
		
	}
	
	
	public boolean NotificationAlertClosePopUpBtnVerify()
	{
		try{
		
		WebElement alertCloseAllWebelement=new WebDriverWait(driver,100)
		.until(ExpectedConditions.visibilityOfElementLocated(notificationAlertPopUpClose_xpath));
		alertCloseAllWebelement.click();
		Thread.sleep(2000);
		
		return true;
	}
	

	catch(Exception ex){
		return false;
	}
		
	}
	
		
	public boolean ProcessRecalculationBBCVerify()
	{
		try{
		
		WebElement reCalculationBbcWebelement=new WebDriverWait(driver,100)
		.until(ExpectedConditions.visibilityOfElementLocated(reCalculationBbcBtn_xpath));
		reCalculationBbcWebelement.click();
		Thread.sleep(3000);
		Alert alertOK = driver.switchTo().alert();
		alertOK.accept();
		Thread.sleep(3000);
		Alert alertOKK = driver.switchTo().alert();
		alertOKK.accept();
		Thread.sleep(5000);
		return true;
	}
	

	catch(Exception ex){
		return false;
	}
		
	}
	
	
	public boolean AlertMsgVerify()
	{
	 
	try{
		WebElement SuccessMsgWebEelement=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(BBCRecalculationSuccessMsg_xpath));
		SuccessMsgWebEelement.isDisplayed();
		Thread.sleep(2000);
		return true;
		
	}
	catch(Exception ex){
		return false;
		
	}
	
	}
	

	//12_01
	
	public boolean verifySummaryRecountCount(String ClientData,String recordCount){
	try{
		//Thread.sleep(4000);
		driver.findElement(By.xpath("(//div[contains(text(),'"+ ClientData+ " Processing file succeed: summary_file.xlsx. "+recordCount+" records imported')])[1]")) .isDisplayed();
		System.out.println("verifySummaryRecountCount");
		return true;
	}
	catch(Exception e){
		
	}
	return false;
	}	
	
	public boolean verifySummaryClickHere(String ClientData){
	try{
		//Thread.sleep(4000);
		driver.findElement(By.xpath("(//div[contains(text(),'"+ClientData+" New customers were found by upload, click')])[1]")) .isDisplayed();	
		System.out.println("verifySummaryClickHere");
		return true;
	}
	catch(Exception e){
		
	}
	return false;
	}	
	
	public boolean verifyNotificationForRecalution(String ClientData){
		try{
			//Thread.sleep(4000);
			driver.findElement(By.xpath("(//div[contains(text(),'"+ClientData+" BBC Re-Calculated Successfully')])[1]")) .isDisplayed();
			System.out.println("verifyNotificationForRecalution");
			return true;
		}
		catch(Exception e){
			
		}
		return false;
		}	
	
	public boolean verifyPayableRecountCount(String ClientData,String recordCount){
		try{
			//Thread.sleep(4000);
			driver.findElement(By.xpath("//div[contains(text(),'"+ClientData+" Processing file succeed: apsumarypayble.xlsx. "+recordCount+" records imported.')]")) .isDisplayed();	
			System.out.println("verifyPayableRecountCount");
			return true;
		}
		catch(Exception e){
			
		}
		return false;
		}	
	
	public boolean verifyPayableClickHere(String ClientData){
		try{
			//Thread.sleep(4000);
			driver.findElement(By.xpath("//div[contains(text(),'"+ClientData+" New vendors were found by upload, click')]")) .isDisplayed();	
			System.out.println("verifyPayableClickHere");
			return true;
		}
		catch(Exception e){
			
		}
		return false;
		}	
	
	public boolean verifyNotificationForRecalutionPayable(String ClientData){
		try{
			//Thread.sleep(4000);
			driver.findElement(By.xpath("(//div[contains(text(),'"+ClientData+" BBC Re-Calculated Successfully')])[2]")) .isDisplayed();	
			System.out.println("verifyNotificationForRecalutionPayable");
			return true;
		}
		catch(Exception e){
			
		}
		return false;
		}	
	
	public boolean verifyInventoryRecountCount(String ClientData,String recordCount){
		try{
			//Thread.sleep(4000);
			driver.findElement(By.xpath("//div[contains(text(),'"+ClientData+" Processing file succeed: Inventory.xlsx. "+recordCount+" records imported.')]")) .isDisplayed();	
			System.out.println("verifyInventoryRecountCount");
			return true;
		}
		catch(Exception e){
			
		}
		return false;
		}	
	
	public boolean verifyInventoryAmountVariance(String ClientData){
		try{
			//Thread.sleep(4000);
			driver.findElement(By.xpath("//div[contains(text(),'"+ClientData+" Inventory.xlsx - Amount variance in expected value and uploaded value')]")) .isDisplayed();	
			System.out.println("verifyInventoryAmountVariance");
			return true;
		}
		catch(Exception e){
			
		}
		return false;
		}	
	public boolean verifyNotificationForRecalutionInventory(String ClientData){
		try{
			//Thread.sleep(4000);
			driver.findElement(By.xpath("(//div[contains(text(),'"+ClientData+" BBC Re-Calculated Successfully')])[3]")) .isDisplayed();	
			System.out.println("verifyNotificationForRecalutionInventory");
			return true;
		}
		catch(Exception e){
			
		}
		return false;
		}
	
	//83
	public boolean verifySecondSummaryRecountCount(String ClientData,String recordCount){
	try{
		//Thread.sleep(4000);
		//div[contains(text(),'TESTABL_G Processing file succeed: summaryfile1.xlsx. 4 records imported.')]
		driver.findElement(By.xpath("//div[contains(text(),'"+ ClientData+ " Processing file succeed: summaryfile1.xlsx. "+recordCount+" records imported.')]")) .isDisplayed();		
		System.out.println("verifySecondSummaryRecountCount");
		return true;
	}
	catch(Exception e){
		
	}
	return false;
	}	
		
	
	public boolean verifyNotificationForSecondsummaryRecalution(String ClientData){
		try{
			//Thread.sleep(4000);
			driver.findElement(By.xpath("(//div[contains(text(),'"+ClientData+" BBC Re-Calculated Successfully')])[1]")) .isDisplayed();
			System.out.println("verifyNotificationForSecondsummaryRecalution");
			return true;
		}
		catch(Exception e){
			
		}
		return false;
		}	
	
	public boolean verifySecondPayableRecountCount(String ClientData,String recordCount){
		try{
			//Thread.sleep(4000);
			driver.findElement(By.xpath("//div[contains(text(),'"+ClientData+" Processing file succeed: summarypayables.xlsx. "+recordCount+" records imported.')]")) .isDisplayed();
			System.out.println("verifySecondPayableRecountCount");
			return true;
		}
		catch(Exception e){
			
		}
		return false;
		}	
	
	public boolean verifySecondPayableClickHere(String ClientData){
		try{
			//Thread.sleep(4000);
			driver.findElement(By.xpath("(//div[contains(text(),'"+ClientData+" New vendors were found by upload, click')])[1]")) .isDisplayed();	
			System.out.println("verifySecondPayableClickHere");
			return true;
		}
		catch(Exception e){
			
		}
		return false;
		}	
	
	public boolean verifySecondNotificationForRecalutionPayable(String ClientData){
		try{
			//Thread.sleep(4000);
			driver.findElement(By.xpath("(//div[contains(text(),'"+ClientData+" BBC Re-Calculated Successfully')])[3]")) .isDisplayed();	
			System.out.println("verifySecondNotificationForRecalutionPayable");
			return true;
		}
		catch(Exception e){
			
		}
		return false;
		}	
	
	public boolean verifySecondInventoryRecountCount(String ClientData,String recordCount){
		try{
			//Thread.sleep(4000);
			driver.findElement(By.xpath("//div[contains(text(),'"+ClientData+" Processing file succeed: inventoryfile2.xlsx. "+recordCount+" records imported.')]")) .isDisplayed();	
			System.out.println("verifySecondInventoryRecountCount");
			return true;
		}
		catch(Exception e){
			
		}
		return false;
		}	
	
	public boolean verifySecondInventoryAmountVariance(String ClientData){
		try{
			//Thread.sleep(4000);
			driver.findElement(By.xpath("//div[contains(text(),'"+ClientData+" inventoryfile2.xlsx - Amount variance in expected value and uploaded value')]")) .isDisplayed();	
			System.out.println("verifySecondInventoryAmountVariance");
			return true;
		}
		catch(Exception e){
			
		}
		return false;
		}	
	
	public boolean verifySecondNotificationForRecalutionInventory(String ClientData){
		try{
			//Thread.sleep(4000);
			driver.findElement(By.xpath("(//div[contains(text(),'"+ClientData+" BBC Re-Calculated Successfully')])[2]")) .isDisplayed();	
			System.out.println("verifySecondNotificationForRecalutionInventory");
			return true;
		}
		catch(Exception e){
			
		}
		return false;
		}

	//12 Maintain AR
	public boolean verifySummaryRecountCountYes(String ClientData,String recordCount){
		try{
			//Thread.sleep(4000);
			driver.findElement(By.xpath("(//div[contains(text(),'"+ ClientData+ " Processing file succeed: newARAllBuckets.xlsx. "+recordCount+" records imported')])[1]")) .isDisplayed();
			System.out.println("verifySummaryRecountCountYes");
			return true;
		}
		catch(Exception e){
			
		}
		return false;
		}	
	
	public boolean verifyInventoryRecountCountYes(String ClientData,String recordCount){
		try{
			//Thread.sleep(4000);
			driver.findElement(By.xpath("//div[contains(text(),'"+ClientData+" Processing file succeed: Assetinventorynew.xlsx. "+recordCount+" records imported.')]")) .isDisplayed();	
			System.out.println("verifyInventoryRecountCountYes");
			return true;
		}
		catch(Exception e){
			
		}
		return false;
		}	
	
	public boolean verifyInventoryAmountVarianceYes(String ClientData){
		try{
			//Thread.sleep(4000);
			driver.findElement(By.xpath("//div[contains(text(),'"+ClientData+" Assetinventorynew.xlsx - Amount variance in expected value and uploaded value')]")) .isDisplayed();	
			System.out.println("verifyInventoryAmountVarianceYes");
			return true;
		}
		catch(Exception e){
			
		}
		return false;
		}	
	
	public boolean verifyPayableRecountCountYes(String ClientData,String recordCount){
		try{
			//Thread.sleep(4000);
			driver.findElement(By.xpath("//div[contains(text(),'"+ClientData+" Processing file succeed: apdetail052012.xlsx. "+recordCount+" records imported.')]")) .isDisplayed();	
			System.out.println("verifyPayableRecountCountYes");
			return true;
		}
		catch(Exception e){
			
		}
		return false;
		}	
	
	public boolean clickOnClearAll(){
		try{
			//Thread.sleep(4000);
			WebElement clickWebelement=new WebDriverWait(driver,100).until(ExpectedConditions.visibilityOfElementLocated(clearAll_xpath));
			clickWebelement.click();
			
			return true;
		}
		catch(Exception e){
			
		}
		return false;
		}
	public boolean verifySummaryRecountCountYes_multidivision(String ClientData,String recordCount){
		try{
			//Thread.sleep(4000);
			driver.findElement(By.xpath("(//div[contains(text(),'"+ ClientData+ "Processing file succeed: newARAllBuckets1.xlsx. "+recordCount+" records imported')])[4]")) .isDisplayed();
			System.out.println("verifySummaryRecountCountYes");
			return true;
		}
		catch(Exception e){
			
		}
		return false;
		}	
	
	
	//
	public boolean verifySecondYesRecountCount(String ClientData,String recordCount){
	try{
		//Thread.sleep(4000);
		//div[contains(text(),'TESTABL_G Processing file succeed: summaryfile1.xlsx. 4 records imported.')]
		driver.findElement(By.xpath("//div[contains(text(),'"+ ClientData+ " Processing file succeed: newARAllBucketsFor2ndBBC.xlsx. "+recordCount+" records imported.')]")) .isDisplayed();		
		System.out.println("verifySecondSummaryRecountCount");
		return true;
	}
	catch(Exception e){
		
	}
	return false;
	}	
		
	
	public boolean verifyNotificationForSecondYesRecalution(String ClientData){
		try{
			//Thread.sleep(4000);
			driver.findElement(By.xpath("(//div[contains(text(),'"+ClientData+" BBC Re-Calculated Successfully')])[1]")) .isDisplayed();
			System.out.println("verifyNotificationForSecondsummaryRecalution");
			return true;
		}
		catch(Exception e){
			
		}
		return false;
		}	
	
	public boolean verifySecondDetailPayableRecountCount(String ClientData,String recordCount){
		try{
			//Thread.sleep(4000);
			driver.findElement(By.xpath("//div[contains(text(),'"+ClientData+" Processing file succeed: APDetailsnewAllBucketsfor2ndBBC.xlsx. "+recordCount+" records imported.')]")) .isDisplayed();
			System.out.println("verifySecondPayableRecountCount");
			return true;
		}
		catch(Exception e){
			
		}
		return false;
		}	
	

	public boolean verifySecondNotificationForDetailRecalutionPayable(String ClientData){
		try{
			//Thread.sleep(4000);
			driver.findElement(By.xpath("(//div[contains(text(),'"+ClientData+" BBC Re-Calculated Successfully')])[3]")) .isDisplayed();	
			System.out.println("verifySecondNotificationForRecalutionPayable");
			return true;
		}
		catch(Exception e){
			
		}
		return false;
		}	
	
	public boolean verifySecondDetailInventoryRecountCount(String ClientData,String recordCount){
		try{
			//Thread.sleep(4000);
			driver.findElement(By.xpath("//div[contains(text(),'"+ClientData+" Processing file succeed: Assetinventorynewfor2ndBBC.xlsx. "+recordCount+" records imported.')]")) .isDisplayed();	
			System.out.println("verifySecondInventoryRecountCount");
			return true;
		}
		catch(Exception e){
			
		}
		return false;
		}	
	
	public boolean verifySecondDetailInventoryAmountVariance(String ClientData){
		try{
			//Thread.sleep(4000);
			driver.findElement(By.xpath("//div[contains(text(),'"+ClientData+" Assetinventorynewfor2ndBBC.xlsx - Amount variance in expected value and uploaded value')]")) .isDisplayed();	
			System.out.println("verifySecondInventoryAmountVariance");
			return true;
		}
		catch(Exception e){
			
		}
		return false;
		}	
	
	public boolean verifySecondDetailNotificationForRecalutionInventory(String ClientData){
		try{
			//Thread.sleep(4000);
			driver.findElement(By.xpath("(//div[contains(text(),'"+ClientData+" BBC Re-Calculated Successfully')])[2]")) .isDisplayed();	
			System.out.println("verifySecondNotificationForRecalutionInventory");
			return true;
		}
		catch(Exception e){
			
		}
		return false;
		}
//
	public boolean verifyNotificationForSkipped(String ClientData,String Date){
		try{
			//Thread.sleep(4000);
			driver.findElement(By.xpath("//div[contains(text(),'"+ClientData+"  BBC("+Date+") is Skipped Succesfully!')]")) .isDisplayed();
			System.out.println("verifyNotificationForSkipped");
			return true;
		}
		catch(Exception e){
			
		}
		return false;
		}	
}
