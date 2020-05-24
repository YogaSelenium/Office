package com.cync.ClientMaintenance;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.SkipException;

import com.cync.base.BasePage;

public class IneligibleCaluculationPage extends BasePage {
	private final By ineligibleCalculations_xpath=By.xpath("//a[text()='Ineligible Calculations']");
	private final By IneligibleTab_xpath=By.xpath("(//a[text()='Ineligible Calculations'])[2]");
	private final By SaveBtn_xpath=By.xpath("//a[text()='Save']");
	private final By Emptylist_xpath=By.xpath("//span[contains(text(),'Empty list')]");
	private final By Showinglist_xpath=By.xpath("//span[text()='Showing all 13']");
	private final By Filterbox_xpath=By.xpath("(//input[@class='filter'])[2]");
	private final By Moveallelement_xpath=By.xpath("//button[@title='Move all the elements!!!']");
	private final By MoveSelectedArrow_xpath=By.xpath("(//i[@class='icon-arrow-right'])[3]");
	private final By RemoveSelectedArrow_xpath=By.xpath("(//i[@class='icon-arrow-left'])[1]");
	private final By RemoveAllArrow_xpath=By.xpath("(//i[@class='icon-arrow-left'])[2]");
	private final By ArrowUp_xpath=By.xpath("//i[@class='icon-arrow-up']");
	private final By ArrowDown_xpath=By.xpath("//i[@class='icon-arrow-down']");
	private final By Agedpast_xpath=By.xpath("(//option[text()='Aged: Past Due Days'])[1]");
	private final By AgedCredit_xpath=By.xpath("(//option[text()='Aged Credit Item'])[1]");
	private final By PaymentTerm_xpath=By.xpath("(//option[text()='Payment term overdays'])[1]");
	private final By Ineligiblecust_xpath=By.xpath("(//option[text()='Ineligible Customer'])[1]");
	private final By Uninsured_xpath=By.xpath("(//option[text()='Uninsured'])[1]");
	private final By DeferredRevenue_xpath=By.xpath("(//option[text()='Deferred Revenue'])[1]");
	private final By CrossAged_xpath=By.xpath("(//option[text()='Cross Aged %'])[1]");
	private final By Concentration_xpath=By.xpath("(//option[text()='Concentration %'])[1]");
	private final By ExceedsCredit_xpath=By.xpath("(//option[text()='Exceeds Credit Limit'])[1]");
	private final By Retention_xpath=By.xpath("(//option[text()='Retention'])[1]");
	private final By Deductible_xpath=By.xpath("(//option[text()='Deductible'])[1]");
	private final By Filter1_xpath=By.xpath("(//input[@class='filter'])[1]");
	private final By Ineligible_xpath=By.xpath("(//tr[@class='row-odd summary-row parent-row'] )[2]");
	private final By IneliReport_xpath=By.xpath("(//li[@class='open_menu'])[3]");
	//private final By Agedpast1_xpath=By.xpath("(//option[text()='Aged: Past Due Days'])[1]");
	private final By BBCtextbox_xpath=By.xpath("//a[text()='Process/Re-Calculate BBC']");
	private final By BBCStatus_xpath=By.xpath("//select[@id='bbc_status']");
	private final By Groupby_xpath=By.xpath("//select[@name='ineligible_style']");
	private final By Orientation_xpath=By.xpath("//select[@name='ineligible_receivable_print_orientation']");
	private final By HTML_xpath=By.xpath("//button[text()='HTML']");
	private final By BBCReport_xpath=By.xpath("(//li[@class='open_menu'])[9]");
	private final By ApproveBBC_xpath=By.xpath("//a[text()='Approve BBC']");
	private final By Checkbox_xpath=By.xpath("(//input[@type='checkbox'])[6]");
	private final By Selectbbc_xpath=By.xpath("//select[@id='choose_bbc']");
	private final By verifin_xpath=By.xpath("//td[text()='Aged: Past Due Days']");
	private final By Receiag_xpath=By.xpath("(//a[text()='Receivable Aging'])[3]");
	private final By BBCdte_xpath=By.xpath("//select[@label_text='BBC Date']");
	private final By BBCtrebd_xpath=By.xpath("(//li[@class='open_menu'])[25]");
	private final By Generatebtn_xpath=By.xpath("//button[text()='Generate']");
	private final By BBCExetrend_xpath=By.xpath("(//li[@class='open_menu'])[24]");
	private final By BBCManReport_xpath=By.xpath("//a[contains(text(),'BBC Management Report')]");
	 
	
	//ineligible customer 
		private final By Electronicsign_xpath=By.id("lnk-electronic-signature");
		private final By signername_xpath=By.id("signer_name");
		private final By Agreecheckbox_xpath=By.id("terms_condition");
		private final By Authorizebbc_xpath=By.xpath("//button[text()='Authorize Signature and Approve BBC']");
		private final By cancel_xpath=By.xpath("//button[text()='Cancel']");
		private final By ineligibletrendreport_xpath=By.xpath("(//li[@class='open_menu'])[27]");
		private final By bbcdateinreport_xpath=By.xpath("//select[@id='bbc_id']");
		private final By ineligible_xpath=By.xpath("(//i[@class='icon-plus'])[2]");

///EXCLUDE REASON



///EXCLUDE REASON
private final By exclude_xpath=By.xpath("(//option[text()='Excluded'])[1]");
private final By dialog_xapth=By.xpath("//select[@id='bootstrap-duallistbox-selected-list_duallistbox']");


///EXCLUDE REASON

//private final By exclude_xpath=By.xpath("(//option[text()='Excluded'])[1]");



	public IneligibleCaluculationPage(WebDriver driver) {
		
		super(driver);
	}
	
	
	public boolean  Click_on_agedpastdue()
	{
	try{
		WebElement HeaderWebEelement=new WebDriverWait(driver,5)
			.until(ExpectedConditions.visibilityOfElementLocated(Agedpast_xpath));
		HeaderWebEelement.click();


		Thread.sleep(100);

		return true;
	}
	catch(Exception ex){
		return false;

	}


	}
	
	public boolean scrollToViewL()
	{
		try{
			 WebElement actual1=new WebDriverWait(driver,10)
			 .until(ExpectedConditions.visibilityOfElementLocated(Agedpast_xpath));
			JavascriptExecutor jse1 = (JavascriptExecutor)driver;;
			jse1.executeScript("arguments[0].scrollIntoView(true);", actual1);  		


	        return true;
			
		}
		catch(Exception e){
			
		}
		return false;
		
		} 

	public boolean  Click_on_retention()

	{
	try{
		WebElement HeaderWebEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(Retention_xpath));
		HeaderWebEelement.click();

		////Thread.sleep(200);
		return true;
	}
	catch(Exception ex){
		return false;

	}


	}
	/*public boolean  Click_on_exclude()
	{
	try{
		WebElement HeaderWebEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(exclude_xpath));
		HeaderWebEelement.click();
		////Thread.sleep(5000);

		return true;
	}
	catch(Exception ex){
		return false;

	}


	}*/
	/*public boolean  Click_on_agedcredititem()

	{
	try{
		WebElement HeaderWebEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(Retention_xpath));
		HeaderWebEelement.click();
		////Thread.sleep(5000);
		return true;
	}
	catch(Exception ex){
		return false;

	}


	}*/
	public boolean  Click_on_exclude()
	{
	try{
		WebElement HeaderWebEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(exclude_xpath));
		HeaderWebEelement.click();
		////Thread.sleep(200);

		return true;
	}
	catch(Exception ex){
		return false;

	}


	}
	public boolean  Click_on_agedcredititem()
	{
	try{
		WebElement HeaderWebEelement=new WebDriverWait(driver,5)
			.until(ExpectedConditions.visibilityOfElementLocated(AgedCredit_xpath));
		HeaderWebEelement.click();

		//////Thread.sleep(5000);

		return true;
	}
	catch(Exception ex){
		return false;

	}


	}
	public boolean  Click_on_crossaged()
	{
	try{
		WebElement HeaderWebEelement=new WebDriverWait(driver,5)
			.until(ExpectedConditions.visibilityOfElementLocated(CrossAged_xpath));
		HeaderWebEelement.click();

		//////Thread.sleep(5000);

		return true;
	}
	catch(Exception ex){
		return false;

	}


	}
	
	public Boolean Verifyin()
	{
	try{
		WebElement HeaderWebEelement=new WebDriverWait(driver,5)
			.until(ExpectedConditions.visibilityOfElementLocated(verifin_xpath));
		HeaderWebEelement.isDisplayed();

		//////Thread.sleep(5000);

		return true;
	}
	catch(Exception ex){
		
	
	return false;
	}
 
	}

	public boolean  Click_on_Ineligible2()
	{
	try{
		WebElement HeaderWebEelement=new WebDriverWait(driver,5)
			.until(ExpectedConditions.visibilityOfElementLocated(ineligible_xpath));
		HeaderWebEelement.click();

		//////Thread.sleep(5000);

		return true;
	}
	catch(Exception ex){
		return false;

	}
	}


	public boolean entersign(String name)
	{
		try{

			WebElement trendnWebEelement=new WebDriverWait(driver,5).until(ExpectedConditions.visibilityOfElementLocated(signername_xpath));
			trendnWebEelement.sendKeys(name);
			return true;
		}
		catch(Exception ex){
			return false;
		}
}
	public boolean  Click_on_Iagreecheckbox()
	{
	try{
		WebElement HeaderWebEelement=new WebDriverWait(driver,5)
			.until(ExpectedConditions.visibilityOfElementLocated(Agreecheckbox_xpath));
		HeaderWebEelement.click();

		////Thread.sleep(200);

		//////Thread.sleep(5000);

		return true;
	}
	catch(Exception ex){
		return false;

	}


	}
	public boolean  Click_on_Ineligibletrendreport()
	{
	try{
		WebElement HeaderWebEelement=new WebDriverWait(driver,5)
			.until(ExpectedConditions.visibilityOfElementLocated(ineligibletrendreport_xpath));
		HeaderWebEelement.click();

		//////Thread.sleep(5000);

		return true;
	}
	catch(Exception ex){
		return false;

	}


	}
	public boolean  Click_on_cancel()
	{
	try{
		WebElement HeaderWebEelement=new WebDriverWait(driver,5)
			.until(ExpectedConditions.visibilityOfElementLocated(cancel_xpath));
		HeaderWebEelement.click();


		//////Thread.sleep(5000);

		return true;
	}
	catch(Exception ex){
		return false;

	}


	}
	public boolean  Click_on_authorizesiGnBBC()
	{
	try{
		WebElement HeaderWebEelement=new WebDriverWait(driver,5)
			.until(ExpectedConditions.visibilityOfElementLocated(Authorizebbc_xpath));
		HeaderWebEelement.click();

		//////Thread.sleep(5000);

		return true;
	}
	catch(Exception ex){
		return false;

	}


	}
	public boolean  Click_on_electronicsign()
	{
	try{
		WebElement HeaderWebEelement=new WebDriverWait(driver,5)
			.until(ExpectedConditions.visibilityOfElementLocated(Electronicsign_xpath));
		HeaderWebEelement.click();

		////Thread.sleep(200);

		return true;
	}
	catch(Exception ex){
		return false;

	}


	}
	public boolean  Click_on_Ineligiblecustomer()
	{
	try{
		WebElement HeaderWebEelement=new WebDriverWait(driver,5)
			.until(ExpectedConditions.visibilityOfElementLocated(Ineligiblecust_xpath));
		HeaderWebEelement.click();


		////Thread.sleep(2000);


		//////Thread.sleep(5000);

		return true;
	}
	catch(Exception ex){
		return false;

	}


	}
	public boolean  Click_on_Agedcredit()
	{
	try{
		WebElement HeaderWebEelement=new WebDriverWait(driver,5)
			.until(ExpectedConditions.visibilityOfElementLocated(AgedCredit_xpath));
		HeaderWebEelement.click();


		//////Thread.sleep(5000);

		return true;
	}
	catch(Exception ex){
		return false;

	}


	}
	public boolean Select_on_BBCdateinreport(String sw2) {
		try {
			WebElement accTypeDropdownWebEelement = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(bbcdateinreport_xpath));
			Select sel = new Select(accTypeDropdownWebEelement);
			List<WebElement> list = sel.getOptions();
			for (WebElement ele : list) {
				if (ele.getText().equals(sw2)) {
					ele.click();
					//////Thread.sleep(5000);
					break;
				}
			}
			return true;} 
		catch (Exception ex) {
		}
		return false;

	}
	
	public boolean  Click_on_BBCManReport()
	{
	try{
		WebElement HeaderWebEelement=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(BBCManReport_xpath));
		HeaderWebEelement.click();


		Thread.sleep(500);



		return true;
	}
	catch(Exception ex){
		return false;

	}


	}
	
	public boolean  Click_on_BBCExeTrendReport()
	{
	try{
		WebElement HeaderWebEelement=new WebDriverWait(driver,5)
			.until(ExpectedConditions.visibilityOfElementLocated(BBCExetrend_xpath));
		HeaderWebEelement.click();


	
		//////Thread.sleep(5000);

		return true;
	}
	catch(Exception ex){
		return false;

	}


	}
	public boolean  Click_on_Generatebtn()
	{
	try{
		Thread.sleep(500);
		WebElement HeaderWebEelement=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(Generatebtn_xpath));
		HeaderWebEelement.click();
		Thread.sleep(500);



		return true;
	}
	catch(Exception ex){
		return false;

	}


	}
	public boolean  Click_on_BBCtrendreport()
	{
	try{
		WebElement HeaderWebEelement=new WebDriverWait(driver,5)
			.until(ExpectedConditions.visibilityOfElementLocated(BBCtrebd_xpath));
		HeaderWebEelement.click();

		//////Thread.sleep(5000);

		return true;
	}
	catch(Exception ex){
		return false;

	}


	}
	
	
	public boolean  Click_on_Receaging()
	{
	try{
		WebElement HeaderWebEelement=new WebDriverWait(driver,5)
			.until(ExpectedConditions.visibilityOfElementLocated(Receiag_xpath));
		HeaderWebEelement.click();

		//////Thread.sleep(5000);

		return true;
	}
	catch(Exception ex){
		return false;

	}


	}
	
	public boolean  Click_on_checkbox()
	{
	try{
		WebElement HeaderWebEelement=new WebDriverWait(driver,5)
			.until(ExpectedConditions.visibilityOfElementLocated(Checkbox_xpath));
//////Thread.sleep(5000);

		return true;
	}
	catch(Exception ex){
		return false;

	}


	}
	
	public boolean  Click_on_ApproveBBC()
	{
	try{
		WebElement HeaderWebEelement=new WebDriverWait(driver,5)
			.until(ExpectedConditions.visibilityOfElementLocated(ApproveBBC_xpath));
		HeaderWebEelement.click();

		////Thread.sleep(200);

		return true;
	}
	catch(Exception ex){
		return false;

	}


	}
	
	public boolean  Click_on_BBCstatus()
	{
	try{
		WebElement HeaderWebEelement=new WebDriverWait(driver,5)
			.until(ExpectedConditions.visibilityOfElementLocated(BBCStatus_xpath));
		HeaderWebEelement.click();


	
		//////Thread.sleep(5000);

		return true;
	}
	catch(Exception ex){
		return false;

	}


	}
	public boolean  Click_on_BBCReport()
	{
	try{
		WebElement HeaderWebEelement=new WebDriverWait(driver,5)
			.until(ExpectedConditions.visibilityOfElementLocated(BBCReport_xpath));
		HeaderWebEelement.click();

		////Thread.sleep(2000);


		return true;
	}
	catch(Exception ex){
		return false;

	}


	}
	public boolean  Click_on_HTML()
	{
	try{
		WebElement HeaderWebEelement=new WebDriverWait(driver,5)
			.until(ExpectedConditions.visibilityOfElementLocated(HTML_xpath));
		HeaderWebEelement.click();
		return true;
	}
	catch(Exception ex){
		return false;

	}
	}
	//kruthivas
	public boolean closeHtmlREport() {
        try {
            Thread.sleep(1000);
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

	public boolean  Click_on_Groupby()
	{
	try{
		WebElement HeaderWebEelement=new WebDriverWait(driver,5)
			.until(ExpectedConditions.visibilityOfElementLocated(Groupby_xpath));
		HeaderWebEelement.click();

		//////Thread.sleep(5000);

		return true;
	}
	catch(Exception ex){
		return false;

	}


	}
	
	public boolean  Click_on_Orientation()
	{
	try{
		WebElement HeaderWebEelement=new WebDriverWait(driver,5)
			.until(ExpectedConditions.visibilityOfElementLocated(Orientation_xpath));
		HeaderWebEelement.click();

		//////Thread.sleep(5000);

		return true;
	}
	catch(Exception ex){
		return false;

	}


	}
	
	public boolean  Click_on_Analys()
	{
	try{
		WebElement HeaderWebEelement=new WebDriverWait(driver,5)
			.until(ExpectedConditions.visibilityOfElementLocated(IneliReport_xpath));
		HeaderWebEelement.click();

		//////Thread.sleep(5000);

		return true;
	}
	catch(Exception ex){
		return false;

	}


	}
	public boolean  Click_on_Ineligible()
	{
	try{
		WebElement HeaderWebEelement=new WebDriverWait(driver,5)
			.until(ExpectedConditions.visibilityOfElementLocated(Ineligible_xpath));
		HeaderWebEelement.click();

		//////Thread.sleep(5000);

		return true;
	}
	catch(Exception ex){
		return false;

	}


	}
	public boolean EnterFilterWord(String word)
	{
	try{

		WebElement selectWebEelement=new WebDriverWait(driver,5)
		.until(ExpectedConditions.visibilityOfElementLocated(Filterbox_xpath));
		selectWebEelement.click();
		selectWebEelement.sendKeys(word);

	
		//////Thread.sleep(2000);

		return true;

	}
	catch(Exception ex){
		return false;
	}

	}
	public boolean EnterFilter1Word(String word)
	{
	try{

		WebElement selectWebEelement=new WebDriverWait(driver,5)
		.until(ExpectedConditions.visibilityOfElementLocated(Filter1_xpath));
		selectWebEelement.click();
		selectWebEelement.sendKeys(word);

		//////Thread.sleep(2000);

		return true;

	}
	catch(Exception ex){
		return false;
	}

	}
	public boolean  Click_on_Arrowup()
	{
	try{
		WebElement HeaderWebEelement=new WebDriverWait(driver,5)
			.until(ExpectedConditions.visibilityOfElementLocated(ArrowUp_xpath));
		HeaderWebEelement.click();

		//////Thread.sleep(5000);

		return true;
	}
	catch(Exception ex){
		return false;

	}


	}
	public boolean  Click_on_BBCProces()
	{
	try{
		WebElement HeaderWebEelement=new WebDriverWait(driver,5)
			.until(ExpectedConditions.visibilityOfElementLocated(BBCtextbox_xpath));
		HeaderWebEelement.click();

		//////Thread.sleep(5000);

		return true;
	}
	catch(Exception ex){
		return false;

	}


	}
	public boolean  Click_on_MoveAll()
	{
	try{
		WebElement HeaderWebEelement=new WebDriverWait(driver,5)
			.until(ExpectedConditions.visibilityOfElementLocated(Moveallelement_xpath));
		HeaderWebEelement.click();

		//////Thread.sleep(5000);

		return true;
	}
	catch(Exception ex){
		return false;

	}


	}
	public boolean  Click_on_MoveSel()
	{
	try{
		WebElement HeaderWebEelement=new WebDriverWait(driver,5)
			.until(ExpectedConditions.visibilityOfElementLocated(MoveSelectedArrow_xpath));
		HeaderWebEelement.click();

		//////Thread.sleep(5000);

		return true;
	}
	catch(Exception ex){
		return false;

	}


	}
	public boolean  Click_on_RemoveAll()
	{
	try{
		WebElement HeaderWebEelement=new WebDriverWait(driver,5)
			.until(ExpectedConditions.visibilityOfElementLocated(RemoveAllArrow_xpath));
		HeaderWebEelement.click();

		//////Thread.sleep(5000);

		return true;
	}
	catch(Exception ex){
		return false;

	}


	}
	
	public boolean  Click_on_concentration()
	{
	try{
		WebElement HeaderWebEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(Concentration_xpath));
		HeaderWebEelement.click();
		////Thread.sleep(500);
		return true;
	}
	catch(Exception ex){
		return false;

	}


	}
	
	public boolean  Click_on_Exceedcreditlimit()
	{
	try{
		WebElement HeaderWebEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(ExceedsCredit_xpath));
		HeaderWebEelement.click();

		////Thread.sleep(1000);

		return true;
	}
	catch(Exception ex){
		return false;

	}


	}
	public boolean  Click_on_dialogbox()
	{
	try{
		WebElement HeaderWebEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(dialog_xapth));
		HeaderWebEelement.click();
		////Thread.sleep(1000);
		return true;
	}
	catch(Exception ex){
		return false;

	}


	}
    
	public boolean  Click_on_RemoveSel()
	{
	try{
		WebElement HeaderWebEelement=new WebDriverWait(driver,5)
			.until(ExpectedConditions.visibilityOfElementLocated(RemoveSelectedArrow_xpath));
		HeaderWebEelement.click();

		////Thread.sleep(1000);

		return true;
	}
	catch(Exception ex){
		return false;

	}


	}
	public boolean  Click_on_Arrowdown()
	{
	try{
		WebElement HeaderWebEelement=new WebDriverWait(driver,5)
			.until(ExpectedConditions.visibilityOfElementLocated(ArrowDown_xpath));
		HeaderWebEelement.click();

		////Thread.sleep(2000);


		return true;
	}
	catch(Exception ex){
		return false;

	}


	}
	public boolean  Click_on_Save()
	{
	try{
		WebElement HeaderWebEelement=new WebDriverWait(driver,5)
			.until(ExpectedConditions.visibilityOfElementLocated(SaveBtn_xpath));
		HeaderWebEelement.click();

		////Thread.sleep(200);


		return true;
	}
	catch(Exception ex){
		return false;

	}


	}
	public Boolean VerifyIneligibleCalTab()
	{
	try{
		WebElement HeaderWebEelement=new WebDriverWait(driver,5)
			.until(ExpectedConditions.visibilityOfElementLocated(IneligibleTab_xpath));
		HeaderWebEelement.isDisplayed();

		//////Thread.sleep(5000);

		return true;
	}
	catch(Exception ex){
		
	
	return false;
	}
 
	}
	public Boolean VerifyDeductible()
	{
	try{
		WebElement HeaderWebEelement=new WebDriverWait(driver,5)
			.until(ExpectedConditions.visibilityOfElementLocated(Deductible_xpath));
		HeaderWebEelement.isDisplayed();

		//////Thread.sleep(5000);

		return true;
	}
	catch(Exception ex){
		
	
	return false;
	}
 
	}
	public Boolean VerifyConcentration()
	{
	try{
		WebElement HeaderWebEelement=new WebDriverWait(driver,5)
			.until(ExpectedConditions.visibilityOfElementLocated( Concentration_xpath));
		HeaderWebEelement.isDisplayed();

		//////Thread.sleep(5000);

		return true;
	}
	catch(Exception ex){
		
	
	return false;
	}
 
	}
	public Boolean VerifyRetention()
	{
	try{
		WebElement HeaderWebEelement=new WebDriverWait(driver,5)
			.until(ExpectedConditions.visibilityOfElementLocated(Retention_xpath));
		HeaderWebEelement.isDisplayed();

		//////Thread.sleep(5000);

		return true;
	}
	catch(Exception ex){
		
	
	return false;
	}
 
	}
	public Boolean VerifyExceedsCreditLimit()
	{
	try{
		WebElement HeaderWebEelement=new WebDriverWait(driver,5)
			.until(ExpectedConditions.visibilityOfElementLocated(ExceedsCredit_xpath));
		HeaderWebEelement.isDisplayed();

		//////Thread.sleep(5000);

		return true;
	}
	catch(Exception ex){
		
	
	return false;
	}
 
	}
	public Boolean VerifyCrossAged()
	{
	try{
		WebElement HeaderWebEelement=new WebDriverWait(driver,5)
			.until(ExpectedConditions.visibilityOfElementLocated(CrossAged_xpath));
		HeaderWebEelement.isDisplayed();

		//////Thread.sleep(5000);

		return true;
	}
	catch(Exception ex){
		
	
	return false;
	}
 
	}
	
	public Boolean VerifyDeferredRevenue()
	{
	try{
		WebElement HeaderWebEelement=new WebDriverWait(driver,5)
			.until(ExpectedConditions.visibilityOfElementLocated(DeferredRevenue_xpath));
		HeaderWebEelement.isDisplayed();

		//////Thread.sleep(5000);

		return true;
	}
	catch(Exception ex){
		
	
	return false;
	}
 
	}
	public Boolean VerifyUninsured()
	{
	try{
		WebElement HeaderWebEelement=new WebDriverWait(driver,5)
			.until(ExpectedConditions.visibilityOfElementLocated(Uninsured_xpath));
		HeaderWebEelement.isDisplayed();

		//////Thread.sleep(5000);

		return true;
	}
	catch(Exception ex){
		
	
	return false;
	}
 
	}
	public Boolean VerifyIneligibleCustomer()
	{
	try{
		WebElement HeaderWebEelement=new WebDriverWait(driver,5)
			.until(ExpectedConditions.visibilityOfElementLocated(Ineligiblecust_xpath));
		HeaderWebEelement.isDisplayed();

		//////Thread.sleep(5000);

		return true;
	}
	catch(Exception ex){
		
	
	return false;
	}
 
	}

	public Boolean VerifyPaymentTermOverdays()
	{
	try{
		WebElement HeaderWebEelement=new WebDriverWait(driver,5)
			.until(ExpectedConditions.visibilityOfElementLocated(PaymentTerm_xpath));
		HeaderWebEelement.isDisplayed();

		//////Thread.sleep(5000);

		return true;
	}
	catch(Exception ex){
		
	
	return false;
	}
	}

	public Boolean VerifyAgedCreditItem()
	{
	try{
		WebElement HeaderWebEelement=new WebDriverWait(driver,5)
			.until(ExpectedConditions.visibilityOfElementLocated( AgedCredit_xpath));
		HeaderWebEelement.isDisplayed();
		//////Thread.sleep(5000);
		return true;
	}
	catch(Exception ex){
		
	
	return false;
	}
 
	}
	public Boolean VerifySaveBtn()
	{
	try{
		WebElement HeaderWebEelement=new WebDriverWait(driver,5)
			.until(ExpectedConditions.visibilityOfElementLocated(SaveBtn_xpath));
		HeaderWebEelement.isDisplayed();

		//////Thread.sleep(5000);

		return true;
	}
	catch(Exception ex){
		
	
	return false;
	}
 
	}
	public Boolean VerifyEmptylist()
	{
	try{
		Thread.sleep(500);
		WebElement HeaderWebEelement=new WebDriverWait(driver,50)
			.until(ExpectedConditions.visibilityOfElementLocated(Emptylist_xpath));
		HeaderWebEelement.isDisplayed();

		//////Thread.sleep(5000);

		return true;
	}
	catch(Exception ex){
		
	
	return false;
	}
 
	}
	public Boolean VerifyShowinglist()
	{
	try{
		WebElement HeaderWebEelement=new WebDriverWait(driver,5)
			.until(ExpectedConditions.visibilityOfElementLocated(Showinglist_xpath));
		HeaderWebEelement.isDisplayed();

		//////Thread.sleep(5000);

		return true;
	}
	catch(Exception ex){
		
	
	return false;
	}
 
	}
	public Boolean VerifyFilterlist()
	{
	try{
		WebElement HeaderWebEelement=new WebDriverWait(driver,5)
			.until(ExpectedConditions.visibilityOfElementLocated( Filterbox_xpath));
		HeaderWebEelement.isDisplayed();

		//////Thread.sleep(5000);

		return true;
	}
	catch(Exception ex){
		
	
	return false;
	}
 
	}
	public Boolean VerifyMoveallArrow()
	{
	try{
		WebElement HeaderWebEelement=new WebDriverWait(driver,5)
			.until(ExpectedConditions.visibilityOfElementLocated(Moveallelement_xpath));
		HeaderWebEelement.isDisplayed();

		//////Thread.sleep(5000);
		return true;
	}
	catch(Exception ex){
		
	
	return false;
	}
 
	}
	public Boolean VerifyMoveSelectedArrow()
	{
	try{
		WebElement HeaderWebEelement=new WebDriverWait(driver,5)
			.until(ExpectedConditions.visibilityOfElementLocated( MoveSelectedArrow_xpath));
		HeaderWebEelement.isDisplayed();

		//////Thread.sleep(5000);

		return true;
	}
	catch(Exception ex){
		
	
	return false;
	}
 
	}
	public Boolean VerifyRemoveSelectedArrow()
	{
	try{
		WebElement HeaderWebEelement=new WebDriverWait(driver,5)
			.until(ExpectedConditions.visibilityOfElementLocated(RemoveSelectedArrow_xpath));
		HeaderWebEelement.isDisplayed();

		//////Thread.sleep(5000);

		return true;
	}
	catch(Exception ex){
		
	
	return false;
	}
 
	}
	public Boolean VerifyRemoveAllArrow()
	{
	try{
		WebElement HeaderWebEelement=new WebDriverWait(driver,5)
			.until(ExpectedConditions.visibilityOfElementLocated(RemoveAllArrow_xpath));
		HeaderWebEelement.isDisplayed();
		//////Thread.sleep(5000);
		return true;
	}
	catch(Exception ex){
		
	
	return false;
	}
 
	}
	public Boolean VerifyArrowup()
	{
	try{
		WebElement HeaderWebEelement=new WebDriverWait(driver,5)
			.until(ExpectedConditions.visibilityOfElementLocated(ArrowUp_xpath));
		HeaderWebEelement.isDisplayed();
		//////Thread.sleep(5000);
		return true;
	}
	catch(Exception ex){
		
	
	return false;
	}
 
	}
	public Boolean VerifyArrowdown()
	{
	try{
		WebElement HeaderWebEelement=new WebDriverWait(driver,5)
			.until(ExpectedConditions.visibilityOfElementLocated(ArrowDown_xpath));
		HeaderWebEelement.isDisplayed();
		//////Thread.sleep(5000);
		return true;
	}
	catch(Exception ex){
		
	
	return false;
	}
 
	}
	public Boolean VerifyAgedpastduedays()
	{
	try{
		WebElement HeaderWebEelement=new WebDriverWait(driver,5)
			.until(ExpectedConditions.visibilityOfElementLocated(Agedpast_xpath));
		HeaderWebEelement.isDisplayed();
		//////Thread.sleep(5000);
		return true;
	}
	catch(Exception ex){
		
	
	return false;
	}
 
	}
	public Boolean ClickAgedpastduedays()
	{
	try{
		WebElement HeaderWebEelement=new WebDriverWait(driver,5)
			.until(ExpectedConditions.visibilityOfElementLocated(Agedpast_xpath));
		HeaderWebEelement.click();
		//////Thread.sleep(5000);
		return true;
	}
	catch(Exception ex){
		
	
	return false;
	}
 
	}
	/*public Boolean ClickAgedpastduedays()
	{
	try{
		WebElement HeaderWebEelement=new WebDriverWait(driver,100)
			.until(ExpectedConditions.visibilityOfElementLocated(Agedpast_xpath));
		HeaderWebEelement.click();
		//////Thread.sleep(5000);
		return true;
	}
	catch(Exception ex){
		
	
	return false;
	}
 
	}*/
	
	/*ublic boolean  TransactiotypeDropDown_Click(){
		try {
			String[] exp = {"Aged: Past Due Days","Aged Credit Item","Cross Aged %"};
			
			WebElement dropdown = driver.findElement(Agedpast_xpath);
			
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
	public boolean Click_on_BBCdate(String sw) {
		try {
			WebElement accTypeDropdownWebEelement = new WebDriverWait(driver, 5).until(ExpectedConditions.visibilityOfElementLocated(Selectbbc_xpath));
			Select sel = new Select(accTypeDropdownWebEelement);
			List<WebElement> list = sel.getOptions();
			for (WebElement ele : list) {
				if (ele.getText().equals(sw)) {
					ele.click();
					////////Thread.sleep(5000);
					break;
				}
			}
			return true;} 
		catch (Exception ex) {
		}
		return false;

	}
	public boolean Select_on_BBCdate(String sw1) {
		try {
			WebElement accTypeDropdownWebEelement = new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(BBCdte_xpath));
			Select sel = new Select(accTypeDropdownWebEelement);
			//sel.selectByVisibleText(sw1);
			List<WebElement> list = sel.getOptions();
			for (WebElement ele : list) {
				if (ele.getText().equals(sw1)) {
					ele.click();
					Thread.sleep(1000);
					break;
				}
			}
			return true;} 
		catch (Exception ex) {
		}
		return false;

	}
	
	
		
}
