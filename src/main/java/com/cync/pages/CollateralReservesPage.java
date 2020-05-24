package com.cync.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.SkipException;

import com.cync.base.BasePage;

public class CollateralReservesPage extends BasePage  {
	
	
	private final By CollateralReservesHeader_xpath = By.xpath("//span[@class='paneltitle']");
	private final By collateralTypeDropdownValue_xpath=By.xpath("//select[@id='inventory_reserve_collateral_type']");
	private final By addCollateralReserve_xpath=By.xpath("//span[@class='ui-icon ui-icon ui-icon-plus']");
	private final By EnterDescriptionInCollateralReserveWebEelement_xpath=By.xpath("(//input[@class='editable inline-edit-cell ui-widget-content ui-corner-all'])[1]");
	private final By AdvancePerInCollateralReserveWebEelement_xpath=By.xpath("(//input[@class='editable inline-edit-cell ui-widget-content ui-corner-all'])[2]");
	private final By EnterValueInCollateralReserveWebEelement_xpath=By.xpath("(//input[@class='editable inline-edit-cell ui-widget-content ui-corner-all'])[3]");
	private final By SaveBtnClick_xpath = By.xpath("//span[@class='ui-icon ui-icon ui-icon-disk']");
	private final By SuccessMsg_xpath = By.xpath("//div[text()='Collateral Reserves was successfully created.']");
	private final By closePopup_xpath = By.id("closedialog");
	
	

	
	public CollateralReservesPage(WebDriver driver) {
		super(driver);
		try{
			Thread.sleep(3000);
			}
		catch(Exception e){
			
		// TODO Auto-generated constructor stub
			e.printStackTrace();
	        }
		if(!driver.findElement(CollateralReservesHeader_xpath).getText().trim().equals("Collateral Reserves")){
			throw new SkipException(" Seasonal Advance Rates  Page couldn't open.");
		}// TODO Auto-generated constructor stub

		}
	
	
	
	
	 public boolean collateralTypeDropdownValues(String collateralTypeDropdownValue) {
		try {
			WebElement productTypeDropdownWebEelement = new WebDriverWait(
					driver, 10).until(ExpectedConditions
					.visibilityOfElementLocated(collateralTypeDropdownValue_xpath));
			Select sel = new Select(productTypeDropdownWebEelement);
			//sel.selectByVisibleText(collateralTypeDropdownValue);
			List<WebElement> list = sel.getOptions();
			for (WebElement ele : list) {
				if (ele.getText().equals(collateralTypeDropdownValue)) {
					ele.click();
					Thread.sleep(2000);
					return true;
				}
			}
			return true;
		} catch (Exception ex) {
		}
		return false;
	}
	
	 public boolean clickaddCollateralReserve()
		{
		try{

			Thread.sleep(2000);
			WebElement clickaddSeasonalAdvanceRatedWebEelement=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(addCollateralReserve_xpath));
			clickaddSeasonalAdvanceRatedWebEelement.click();
		Thread.sleep(500);
	return true;
		}
		catch(Exception ex){
			return false;
		}

		}
	 
	 public boolean EnterDescriptionInCollateralReserve(String Description)
		{
		try{

			WebElement EnterDescriptionInCollateralReserveWebEelement=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(EnterDescriptionInCollateralReserveWebEelement_xpath));
			EnterDescriptionInCollateralReserveWebEelement.clear();
			EnterDescriptionInCollateralReserveWebEelement.sendKeys(Description);
			Thread.sleep(1000);			
	return true;
		}
		catch(Exception ex){
			return false;
		}
		}
		 
	 public boolean EnterAdvancePerInCollateralReserve(String Advance)
		{
		try{


			WebElement EnterAdvancePerInCollateralReserve=new WebDriverWait(driver,50)
			.until(ExpectedConditions.visibilityOfElementLocated(AdvancePerInCollateralReserveWebEelement_xpath));
			EnterAdvancePerInCollateralReserve.clear();
			EnterAdvancePerInCollateralReserve.sendKeys(Advance);
			Thread.sleep(1000);			
	return true;
		}
		catch(Exception ex){
			return false;
		}

		}
	
	 
	 public boolean EnterValueInCollateralReserve(String value)
		{
		try{

			WebElement EnterValueInCollateralReserve=new WebDriverWait(driver,50)
			.until(ExpectedConditions.visibilityOfElementLocated(EnterValueInCollateralReserveWebEelement_xpath));
			EnterValueInCollateralReserve.clear();
			EnterValueInCollateralReserve.sendKeys(value);
			Thread.sleep(1000);

			
	return true;
		}
		catch(Exception ex){
			return false;
		}

		}
	 
	 
	public boolean SaveBtnVerify()
	{
		try{
		
		WebElement saveWebelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(SaveBtnClick_xpath));
		saveWebelement.click();
		Thread.sleep(1000);
		
		return true;
	}
	

	catch(Exception ex){
		return false;
	}
		
	}
	
		

	  public String SuccessMsgVerify(String SuccessMsg)
		{
		 
		try{
			WebElement SuccessMsgWebEelement=new WebDriverWait(driver,10)
				.until(ExpectedConditions.visibilityOfElementLocated(SuccessMsg_xpath));
			SuccessMsgWebEelement.getText();
			Thread.sleep(1000);
			
		}
		catch(Exception ex){
			
		}
		return SuccessMsg;
		
		}  
		
	  public boolean ClosePopUpVerify()
		{
			try{
			
			WebElement closeWebelement=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(closePopup_xpath));
			closeWebelement.click();
			
			
			return true;
		}
		

		catch(Exception ex){
			return false;
		}
			
		}
	  
}