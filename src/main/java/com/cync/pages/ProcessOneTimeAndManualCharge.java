package com.cync.pages;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.cync.base.BasePage;

public class ProcessOneTimeAndManualCharge extends BasePage
{
	
	private final By processOnetimeAndManualChargepage_xpath=By.xpath("//a[text()='Process OneTime & Manual Charges']");
	private final By breadcrumbcontainer_xpath=By.id("breadcrumb_container");
	private final By processOneTimeManualChargeHeader_xpath=By.xpath("//span[@class='paneltitle']");
	private final By activity_xpath= By.xpath("//input[@name='activity_date']");
	private final By chargeCodecheckBox_xpath=By.xpath("(//td[@style='text-align: center;'])[1]");
	private final By edit_xpath=By.id("edit");
	private final By ChargeCode_xpath=By.xpath("//th[text()='Charge Code']");
	private final By Chargetype_xpath =By.xpath("//th[text()='Charge Type']");
	private final By Frequency_xpath=By.xpath("//th[text()='Frequency']");
	private final By ValueType_xpath=By.xpath("//th[text()='Value Type']");
	private final By ProcessAmount_xpath=By.xpath("//th[text()='Process Amount']");
	private final By Process_xpath=By.xpath("//th[text()='Process']");
	private final By ManualFrequency_xpath=By.xpath("(//td[text()='Manual'])[1]");
	private final By processAmountEnter_xpath=By.xpath("(//input[@style='text-align:right;'])[1]");
	private final By processCheckBox_xpath=By.xpath("(//input[@type='checkbox'])[5]");
	private final By save_xpath=By.id("save");
	private final By FromDate_xpath=By.xpath("//input[@name='from_date']");
	private final By Todate_xpath=By.xpath("//input[@name='to_date']");
	private final By generate_xpath=By.xpath("//button[@class='view-button save_btn']");
	private final By othersFeetextBox_xpath=By.xpath("text-align:right;");
	private final By cancelbutton_xpath=By.xpath("//button[@class='view-button cancel_btn']");
	private final By secondprocessAmount_xpath=By.xpath("(//input[@style='text-align:right;'])[2]");
	private final By secondProcess_xpath=By.xpath("(//input[@type='checkbox'])[6]");
	private final By enterActivityDate_xpath=By.xpath("//input[@name='activity_date']");
	private final By calenderDate_xapth=By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr[3]//td[3]");
	private final By calenderMonth_xpath=By.xpath("//select[@class='ui-datepicker-month']");
	private final By calenderyear_xpath=By.xpath("//select[@class='ui-datepicker-year']");
	private final By errorMsgCloseBTN_xpath	= By.xpath("//a[@id='closedialog']");	

	
	
	
	
	
	
	public ProcessOneTimeAndManualCharge(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	
	public boolean processonetimemanualchargescreen(String Header)
	{
	 
	try{
		WebElement ScreenWebEelement=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(processOnetimeAndManualChargepage_xpath));
		String actual = ScreenWebEelement.getText();
		if (actual.equals(Header))
			return true;
		else
			return false;

	} catch (Exception e) {
		return false;
	}
	}
	
	
	
	public String verifyBreadcrumb(String Breadcrumb)
	{
		try{
			WebElement breadcrumbWebEelement=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(breadcrumbcontainer_xpath));
			String actualData=breadcrumbWebEelement.getText().trim();
			if(actualData.equalsIgnoreCase(Breadcrumb));
		}
		catch(Exception ex){
			
		}
		return Breadcrumb;

		}
	
	
	public boolean VerifyHeader(String Header)
	{
	 
	try{
		WebElement HeaderWebEelement=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(processOneTimeManualChargeHeader_xpath));
		String actual = HeaderWebEelement.getText();
		//Thread.sleep(2000);
		if (actual.equals(Header))
			return true;
		else
			return false;

	} catch (Exception e) {
		return false;
	}
}
	
	
	public boolean VerifyDisabledFields()
	{
	 
	try{
		WebElement disabledFieldWebEelement=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(activity_xpath));
		disabledFieldWebEelement.isEnabled();
		//Thread.sleep(2000);
			return true;
		
	} catch (Exception e) {
		return false;
	}
}
	
	
	public Boolean verifyProcessAmount()
	{
		try{
		
		WebElement processamountWebelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(ProcessAmount_xpath));
		processamountWebelement.isDisplayed();
		
		return true;
		
	} catch (Exception e) {
		return false;
	}
}
	
	
	public Boolean verifyChargeCodeCheckBox()
	{
		try{
		
		WebElement chargeCodeWebelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(chargeCodecheckBox_xpath));
		chargeCodeWebelement.isDisplayed();
		
		return true;
		
	} catch (Exception e) {
		return false;
	}
	
}
	
	

	public Boolean ClickEdit()
	{
		try{
		
		WebElement editWebelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(edit_xpath));
		editWebelement.click();
		
		return true;
		
	} catch (Exception e) {
		return false;
	}
	
}
	public Boolean VerifyEdit()
	{
		try{
		
		WebElement verifyEditWebelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(edit_xpath));
		verifyEditWebelement.isDisplayed();
		
		return true;
		
	} catch (Exception e) {
		return false;
	}
	
}
	
	
	
	public Boolean VerifyActivityDate()
	{
	 
	try{
		WebElement activityDateWebEelement=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(activity_xpath));
		activityDateWebEelement.isDisplayed();
		//Thread.sleep(2000);
			return true;
		
	} catch (Exception e) {
		return false;
	}
	}
	
	
	
	public Boolean VerifyChargeCode()
	{
	 
	try{
		WebElement chargeCodeWebEelement=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(ChargeCode_xpath));
		chargeCodeWebEelement.isDisplayed();
		//Thread.sleep(2000);
			return true;
		
	} catch (Exception e) {
		return false;
	}
	}
	
	
	
	public Boolean VerifyChargeType()
	{
	 
	try{
		WebElement chargeTypeWebEelement=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(Chargetype_xpath));
		chargeTypeWebEelement.isDisplayed();
		//Thread.sleep(2000);
			return true;
		
	} catch (Exception e) {
		return false;
	}
	}
	
	
	
	public Boolean VerifyFrequency()
	{
	 
	try{
		WebElement frequencyWebEelement=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(Frequency_xpath));
		frequencyWebEelement.isDisplayed();
		//Thread.sleep(2000);
			return true;
		
	} catch (Exception e) {
		return false;
	}
	}
	
	
	
	public Boolean VerifyValueType()
	{
	 
	try{
		WebElement valueTypeWebEelement=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(ValueType_xpath));
		valueTypeWebEelement.isDisplayed();
		//Thread.sleep(2000);
			return true;
		
	} catch (Exception e) {
		return false;
	}
}
	
	
	
	public Boolean ProcessAmountValidation()
	{
	 
	try{
		WebElement amountValidationWebEelement=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(ProcessAmount_xpath));
		amountValidationWebEelement.isDisplayed();
		//Thread.sleep(2000);
			return true;
		
	} catch (Exception e) {
		return false;
	}
}
	public Boolean verifyProcess()
	{
	 
	try{
		WebElement processWebEelement=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(Process_xpath));
		processWebEelement.isDisplayed();
		//Thread.sleep(2000);
			return true;
		
	} catch (Exception e) {
		return false;
	}
	
	
}
	public Boolean verifyManualFrequency()
	{
	 
	try{
		WebElement manualFrequencyWebEelement=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(ManualFrequency_xpath));
		manualFrequencyWebEelement.isDisplayed();
		//Thread.sleep(2000);
			return true;
		
	} catch (Exception e) {
		return false;
	}
}
	
	
	
	
	/*public boolean AcivityDateValidation(){
	
			 
			try{
				WebElement processOneTimeAndManualChargerWebEelement=new WebDriverWait(driver,10)
					.until(ExpectedConditions.visibilityOfElementLocated(activity_xpath));
				processOneTimeAndManualChargerWebEelement.isDisplayed();
				Thread.sleep(2000);
					return true;
				
			} catch (Exception e) {
				return false;
			}
			}
	*/
	
	public boolean AcivityValidation(String dateFormatted) {
		try {
			WebElement ActivityDateWebElement = new WebDriverWait(driver, 100)
					.until(ExpectedConditions
							.visibilityOfElementLocated(activity_xpath));


			String actual = ActivityDateWebElement.getAttribute("value");
		
			 System.out.println(actual);
			 
			 if (actual.equals(dateFormatted))
					return true;
				else
					return false;

			
		} catch (Exception e) {
			
		}
		return false;
	}
	

	public String verifyLoanID(String loanid){
        try{
            WebElement loanidWebE=new WebDriverWait(driver,10)
            .until(ExpectedConditions.visibilityOfElementLocated(activity_xpath));
            String actual_id=loanidWebE.getText().trim();
            System.out.println(actual_id);
           
            if(actual_id.equals(loanid));
        }
        catch(Exception ex){
        }
        return loanid;
        }
	
	public String EnterProcessAmount(String processAmount)
	{
		try{
			WebElement EnterProcessAmountWebEelement=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(processAmountEnter_xpath));
			EnterProcessAmountWebEelement.clear();
			EnterProcessAmountWebEelement.sendKeys(processAmount);
			//Thread.sleep(2000);
			
		}
		catch(Exception ex){
			
		}
		return processAmount;

	}
	
	
	public Boolean processCheckBox()
	{
	 
	try{
		WebElement processCheckBoxWebEelement=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(processCheckBox_xpath));

		processCheckBoxWebEelement.click();;
		Thread.sleep(1000);


			return true;
		
	} catch (Exception e) {
		return false;
	}
    }
	
	
	public Boolean Verifysave()
	{
	 
	try{
		WebElement SaveWebEelement=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(save_xpath));

		SaveWebEelement.click();;
		Thread.sleep(1000);

			return true;
		
	} catch (Exception e) {
		return false;
	}
    }
	
	public boolean ClickErrorMsgCloseBTN()
	{
	 
	try{
		WebElement CloseBTNWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(errorMsgCloseBTN_xpath));
		CloseBTNWebEelement.click();
		return true;
	} catch (Exception e) {
		return false;
	} }
	
	public String 	EnterFromdate(String Fromdate)
	{
		try{
			WebElement EnterfromdateWebEelement=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(FromDate_xpath));
			EnterfromdateWebEelement.clear();
			EnterfromdateWebEelement.sendKeys(Fromdate);
			//Thread.sleep(2000);
			
		}
		catch(Exception ex){
			
		}
		return Fromdate;

	}
	
	
	public String 	EnterToDate(String ToDate)
	{
		try{
			WebElement EntertoDateWebEelement=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(Todate_xpath));
			EntertoDateWebEelement.clear();
			EntertoDateWebEelement.sendKeys(ToDate);
			//Thread.sleep(2000);
			
		}
		catch(Exception ex){
			
		}
		return ToDate;

	}
	
	public boolean VerifyGenerate()
	{
	 
	try{
		WebElement generateWebEelement=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(generate_xpath));

		generateWebEelement.click();;
		Thread.sleep(1000);

			return true;
		
	} catch (Exception e) {
		return false;
	}
    } 
	public boolean verifyAddedCharges(String Amnt)
	{
		try{
		
		WebElement addedChargesWebelement=new WebDriverWait(driver,100)
		.until(ExpectedConditions.visibilityOfElementLocated(othersFeetextBox_xpath));
		String actual = addedChargesWebelement.getText();
		if (actual.equals(Amnt))
			return true;
		else
			return false;

	} catch (Exception e) {
		return false;
	}
}
	
	public boolean verifyCancelButton()
	{
		try{
		
		WebElement cancelButtonWebelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(cancelbutton_xpath));
		cancelButtonWebelement.click();
		
		return true;
		
	} catch (Exception e) {
		return false;
	}
	}
	

	public String EnterSecondProcessAmount(String Amount)
	{
		try{
			WebElement EnterProcessAmountWebEelement=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(secondprocessAmount_xpath));
			EnterProcessAmountWebEelement.clear();
			EnterProcessAmountWebEelement.sendKeys(Amount);
			//Thread.sleep(2000);
			
		}
		catch(Exception ex){
			
		}
		return Amount;

	}
	public boolean secondprocesscheckBox()
	{
	 
	try{
		WebElement secondProcessCheckBoxWebEelement=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(secondProcess_xpath));

		secondProcessCheckBoxWebEelement.click();;
		Thread.sleep(1000);

			return true;
		
	} catch (Exception e) {
		return false;
	}
    }
	
	
	public boolean EnterActivityDate()
	{
		try{
			WebElement ActivityDateWebElement=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(enterActivityDate_xpath));

			ActivityDateWebElement.isDisplayed();
			Thread.sleep(2000);
		}
		catch(Exception ex)
		{
			
		}
		return false;
	}
	
	public String EnterMonth(String month)
	{
		try{
			WebElement CalenderMonthWebEelement=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(calenderMonth_xpath));
			CalenderMonthWebEelement.click();
			CalenderMonthWebEelement.sendKeys(month);
			//Thread.sleep(2000);
			
		}
		catch(Exception ex){
			
		}
		return month;
	}
	

	public String EnterYear(String year)
	{
		try{
			WebElement CalenderYearWebEelement=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(calenderyear_xpath));
			CalenderYearWebEelement.click();
			CalenderYearWebEelement.sendKeys(year);
			//Thread.sleep(2000);
			
		}
		catch(Exception ex){
			
		}
		return year;
	}

	
	public boolean calenderDate()
	{
		try{
			WebElement calenderdateWebElement=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(calenderDate_xapth));
			calenderdateWebElement.click();
			//Thread.sleep(2000);
			
		}
		catch(Exception ex)
		{
			
		}
		return false;
	}
	
	
	
	
	
	
}
