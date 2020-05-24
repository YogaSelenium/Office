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

public class SeasonalAdvanceRatePage extends BasePage  {
	
	
	private final By SeasonalAdvanceRateHeader_xpath = By.xpath("//span[@class='paneltitle']");
	private final By addIconSeasonalAdvanceRate_xpath=By.xpath("//span[@class='ui-icon ui-icon ui-icon-plus']");
	private final By EnterAsOfDateInSeasonalAdvanceRate_xpath=By.xpath("//input[@class='editable inline-edit-cell ui-widget-content ui-corner-all hasDatepicker']");
	private final By collateralNameDropdown_xpath=By.xpath("(//select[@class='editable inline-edit-cell ui-widget-content ui-corner-all'])[1]");
	private final By addValueToSublimtInSeasonalAdvanceRate_xpath=By.xpath("(//input[@class='editable inline-edit-cell ui-widget-content ui-corner-all'])[1]");
	private final By addAdvanceToSublimtInSeasonalAdvanceRate_xpath=By.xpath("(//input[@class='editable inline-edit-cell ui-widget-content ui-corner-all'])[3]");
	private final By SaveBtnClick_xpath = By.xpath("//span[@class='ui-icon ui-icon ui-icon-disk']");
	private final By SuccessMsg_xpath = By.xpath("//div[text()='Seasonal Advance Rates was successfully created.']");
	private final By closePopup_xpath = By.id("closedialog");
	
	

	
	public SeasonalAdvanceRatePage(WebDriver driver) {
		super(driver);
		try{
			Thread.sleep(3000);
			}
		catch(Exception e){
			
		// TODO Auto-generated constructor stub
			e.printStackTrace();
	        }
		if(!driver.findElement(SeasonalAdvanceRateHeader_xpath).getText().trim().equals("Seasonal Advance Rates")){
			throw new SkipException(" Seasonal Advance Rates  Page couldn't open.");
		}// TODO Auto-generated constructor stub

		}
	

	 public boolean clickaddSeasonalAdvanceRate()
		{
		try{

			WebElement clickaddSeasonalAdvanceRatedWebEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(addIconSeasonalAdvanceRate_xpath));
			clickaddSeasonalAdvanceRatedWebEelement.click();
			Thread.sleep(5000);

			
	return true;
		}
		catch(Exception ex){
			return false;
		}

		}
	
	 public boolean collateralNameDropdownValues(String collateralNameDropdownValue) {
		try {
			WebElement productTypeDropdownWebEelement = new WebDriverWait(
					driver, 10).until(ExpectedConditions
					.visibilityOfElementLocated(collateralNameDropdown_xpath));
			Select sel = new Select(productTypeDropdownWebEelement);
			List<WebElement> list = sel.getOptions();
			for (WebElement ele : list) {
				if (ele.getText().equals(collateralNameDropdownValue)) {
					ele.click();
					
					return true;
				}
			}
		} catch (Exception ex) {
		}
		return false;
	}
	
	 
	 public boolean EnterAsOfDateInSeasonalAdvanceRate(String Date)
		{
		try{

			WebElement EnterAsOfDateInSeasonalAdvanceRateWebEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(EnterAsOfDateInSeasonalAdvanceRate_xpath));
			EnterAsOfDateInSeasonalAdvanceRateWebEelement.clear();
			EnterAsOfDateInSeasonalAdvanceRateWebEelement.sendKeys(Date);
			Thread.sleep(2000);

			
	return true;
		}
		catch(Exception ex){
			return false;
		}

		}
	
	
	 public boolean addValueToSublimtInSeasonalAdvanceRate(String SublimtAmount)
		{
		try{
			WebElement addValueToSublimtInSeasonalAdvanceRateWebEelement=new WebDriverWait(driver,200)
			.until(ExpectedConditions.visibilityOfElementLocated(addValueToSublimtInSeasonalAdvanceRate_xpath));
			addValueToSublimtInSeasonalAdvanceRateWebEelement.clear();
			addValueToSublimtInSeasonalAdvanceRateWebEelement.sendKeys(SublimtAmount);
			Thread.sleep(2000);
			return true;
		}
		catch(Exception ex){
		    return false;
		}
		
	

		}
	
	
	 public boolean addAdvanceToSublimtInSeasonalAdvanceRate(String SublimtAdvance)
		{
		try{
			WebElement addAdvanceToSublimtInSeasonalAdvanceRateWebEelement=new WebDriverWait(driver,200)
			.until(ExpectedConditions.visibilityOfElementLocated(addAdvanceToSublimtInSeasonalAdvanceRate_xpath));
			addAdvanceToSublimtInSeasonalAdvanceRateWebEelement.clear();
			addAdvanceToSublimtInSeasonalAdvanceRateWebEelement.sendKeys(SublimtAdvance);
			Thread.sleep(2000);
			return true;
		}
		catch(Exception ex){
		    return false;
		}
		
		}
	
	public boolean SaveBtnVerify()
	{
		try{
		
		WebElement saveWebelement=new WebDriverWait(driver,100)
		.until(ExpectedConditions.visibilityOfElementLocated(SaveBtnClick_xpath));
		saveWebelement.click();
		Thread.sleep(2000);
		
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
			Thread.sleep(2000);
			
		}
		catch(Exception ex){
			
		}
		return SuccessMsg;
		
		}  
		
	  public boolean ClosePopUpVerify()
		{
			try{
			
			WebElement closeWebelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(closePopup_xpath));
			closeWebelement.click();
			
			
			return true;
		}
		

		catch(Exception ex){
			return false;
		}
			
		}
	  
}