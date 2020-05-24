package com.cync.ClientMaintenance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.cync.base.BasePage;

public class IneligibilityReasonsPage extends BasePage  {

	
	private final By IneligibilityReasonsPageHeader_xpath=By.xpath("//h3[text()='Ineligibility Reasons ']");
	private final By AddNewBtn_xpath=By.xpath("//i[@id='New']");
	private final By EditBtn_xpath=By.xpath("//i[@id='Edit']");
	private final By DeleteBtn_xpath=By.xpath("//i[@id='Delete']");
	private final By ExportBtn_xpath=By.xpath("//i[@id='Export']");
	private final By SortingIcon_xpath=By.xpath("(//span[@class='ui-sortable-column-icon fa fa-fw fa-sort ng-star-inserted'])[1]");

	private final By PrimarySearch_xpath=By.xpath("//input[@placeholder='Search Here']");

	private final By IneligibilityReasonSearch_xpath=By.xpath("(//input[@placeholder='Search'])[1]");
	private final By DescriptionSearch_xpath=By.xpath("(//input[@placeholder='Search'])[2]");
	private final By PrimaryCheck_xpath=By.xpath("(//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default'])[1]");

	private final By TotalRecordCount_xpath=By.xpath("//p[@class='recordcount ng-star-inserted']//b");
	private final By FirstCheckboxSelect_xpath=By.xpath("//p[@class='recordcount ng-star-inserted']//b");

	private final By EditBtnEnable_xpath=By.xpath("//i[contains(@class,'ng-star-inserted hand fa fa-pencil fa-1x clr_grey f_s')]");

	private final By DeleteBtnEnable_xpath=By.xpath("//i[contains(@class,'ng-star-inserted hand fa fa-trash ')]");
	private final By IneligibilityReasonCodeTextField_xpath=By.xpath("//input[@id='irCode']");
	private final By DescriptionTextField_xpath=By.xpath("//input[@id='irDescription']");
	private final By NegativeEligibleBalance_xpath=By.xpath("(//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default'])[1]");
	private final By NegativeDebtorBalance_xpath=By.xpath("(//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default'])[2]");

	private final By SaveBtn_xpath=By.xpath("//span[text()=' Save ']");

	
	
	
	
	
	
	public IneligibilityReasonsPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	 public String verifyPageHeader(String PageHeader)
	    {
	    try{
	       WebElement PageHeaderWebEelement=new WebDriverWait(driver,5)
	       .until(ExpectedConditions.visibilityOfElementLocated(IneligibilityReasonsPageHeader_xpath));
	       
	      String actualMsg= PageHeaderWebEelement.getText();
	      if(actualMsg.equalsIgnoreCase(PageHeader))
	      {
	       return actualMsg;
	      }
	       
	    }
	    catch(Exception ex){
	     
	    }
	 return PageHeader;
	    }
	 
	
	 
	 public boolean AddNewBtn()
		{
		try{

			WebElement AddNewBtnWebEelement=new WebDriverWait(driver,5)
			.until(ExpectedConditions.visibilityOfElementLocated(AddNewBtn_xpath));
			AddNewBtnWebEelement.isDisplayed();

	return true;
		}
		catch(Exception ex){
			return false;
		}

		}
	 
	 public boolean EditBtn()
		{
		try{

			WebElement EditBtnWebEelement=new WebDriverWait(driver,5)
			.until(ExpectedConditions.visibilityOfElementLocated(EditBtn_xpath));
			EditBtnWebEelement.isDisplayed();

	return true;
		}
		catch(Exception ex){
			return false;
		}

		}
	
	 public boolean DeleteBtn()
		{
		try{

			WebElement DeleteBtnWebEelement=new WebDriverWait(driver,5)
			.until(ExpectedConditions.visibilityOfElementLocated(DeleteBtn_xpath));
			DeleteBtnWebEelement.isDisplayed();

	return true;
		}
		catch(Exception ex){
			return false;
		}

		}
	
	 public boolean ExportBtn()
		{
		try{

			WebElement ExportBtnWebEelement=new WebDriverWait(driver,5)
			.until(ExpectedConditions.visibilityOfElementLocated(ExportBtn_xpath));
			ExportBtnWebEelement.isDisplayed();

	return true;
		}
		catch(Exception ex){
			return false;
		}

		}

	 
	 public boolean SortingIcon()
		{
		try{

			WebElement SortingIconWebEelement=new WebDriverWait(driver,5)
			.until(ExpectedConditions.visibilityOfElementLocated(SortingIcon_xpath));
			SortingIconWebEelement.isDisplayed();

	return true;
		}
		catch(Exception ex){
			return false;
		}

		}
 
	 public boolean PrimarySearch()
		{
		try{

			WebElement PrimarySearchWebEelement=new WebDriverWait(driver,5)
			.until(ExpectedConditions.visibilityOfElementLocated(PrimarySearch_xpath));
			PrimarySearchWebEelement.isDisplayed();

	return true;
		}
		catch(Exception ex){
			return false;
		}

		}
 
	 public boolean IneligibilityReason_Search()
		{
		try{

			WebElement PrimarySearchWebEelement=new WebDriverWait(driver,5)
			.until(ExpectedConditions.visibilityOfElementLocated(IneligibilityReasonSearch_xpath));
			PrimarySearchWebEelement.isDisplayed();

	return true;
		}
		catch(Exception ex){
			return false;
		}

		}
	
	 public boolean Description_Search()
		{
		try{

			WebElement PrimarySearchWebEelement=new WebDriverWait(driver,5)
			.until(ExpectedConditions.visibilityOfElementLocated(DescriptionSearch_xpath));
			PrimarySearchWebEelement.isDisplayed();

	return true;
		}
		catch(Exception ex){
			return false;
		}

		}
	 
	 public boolean Primary_CheckBox()
		{
		try{

			WebElement PrimaryCheckWebEelement=new WebDriverWait(driver,5)
			.until(ExpectedConditions.visibilityOfElementLocated(PrimaryCheck_xpath));
			PrimaryCheckWebEelement.isDisplayed();

	return true;
		}
		catch(Exception ex){
			return false;
		}

		}
	 
	 
	 public boolean TotalRecord_Count()
		{
		try{

			WebElement TotalRecordCountWebEelement=new WebDriverWait(driver,5)
			.until(ExpectedConditions.visibilityOfElementLocated(TotalRecordCount_xpath));
			TotalRecordCountWebEelement.isDisplayed();

	return true;
		}
		catch(Exception ex){
			return false;
		}

		}
	 
	 public boolean SelectingFirst_CheckBox()
		{
		try{

			WebElement PrimaryCheckWebEelement=new WebDriverWait(driver,5)
			.until(ExpectedConditions.visibilityOfElementLocated(FirstCheckboxSelect_xpath));
			PrimaryCheckWebEelement.click();
			//////Thread.sleep(2000);

	return true;
		}
		catch(Exception ex){
			return false;
		}

		}
	 
	 
	 public boolean EditBtn_enable()
		{
		try{

			WebElement EditBtnWebEelement=new WebDriverWait(driver,5)
			.until(ExpectedConditions.visibilityOfElementLocated(EditBtnEnable_xpath));
			EditBtnWebEelement.isDisplayed();

	return true;
		}
		catch(Exception ex){
			return false;
		}

		}
	 
	 
	 public boolean DeleteBtn_enable()
		{
		try{

			WebElement DeleteBtnWebEelement=new WebDriverWait(driver,5)
			.until(ExpectedConditions.visibilityOfElementLocated(DeleteBtnEnable_xpath));
			DeleteBtnWebEelement.isDisplayed();

	return true;
		}
		catch(Exception ex){
			return false;
		}

		}
	 
	 public boolean AddNewBtn_click()
		{
		try{

			WebElement AddNewBtnWebEelement=new WebDriverWait(driver,5)
			.until(ExpectedConditions.visibilityOfElementLocated(AddNewBtn_xpath));
			AddNewBtnWebEelement.click();

	return true;
		}
		catch(Exception ex){
			return false;
		}

		}
	 
	 public boolean IneligibilityReasonCodeInput(String EnterData)
		{
		try{

			WebElement IneligibilityReasonCodeWebEelement=new WebDriverWait(driver,5)
			.until(ExpectedConditions.visibilityOfElementLocated(IneligibilityReasonCodeTextField_xpath));
			IneligibilityReasonCodeWebEelement.clear();
			IneligibilityReasonCodeWebEelement.sendKeys(EnterData);
			//////Thread.sleep(2000);
			
	return true;
		}
		catch(Exception ex){
			return false;
		}
		}
	 
	 
	 public boolean DescriptionTextInput(String EnterDescription)
		{
		try{

			WebElement DescriptionWebEelement=new WebDriverWait(driver,5)
			.until(ExpectedConditions.visibilityOfElementLocated(DescriptionTextField_xpath));
			DescriptionWebEelement.clear();
			DescriptionWebEelement.sendKeys(EnterDescription);
			//////Thread.sleep(2000);
			
	return true;
		}
		catch(Exception ex){
			return false;
		}
		}
	 
	 
	 public boolean NegativeEligibleBalance_Check()
		{
		try{

			WebElement NegativeEligibleBalanceWebEelement=new WebDriverWait(driver,5)
			.until(ExpectedConditions.visibilityOfElementLocated(NegativeEligibleBalance_xpath));
			NegativeEligibleBalanceWebEelement.click();

	return true;
		}
		catch(Exception ex){
			return false;
		}

		}
	 
	 public boolean NegativeDebtorBalance_Check()
		{
		try{

			WebElement NegativeDebtorBalanceWebEelement=new WebDriverWait(driver,5)
			.until(ExpectedConditions.visibilityOfElementLocated(NegativeDebtorBalance_xpath));
			NegativeDebtorBalanceWebEelement.click();

	return true;
		}
		catch(Exception ex){
			return false;
		}

		}
	 
	 public boolean SaveBtn_Check()
		{
		try{

			WebElement SaveBtnWebEelement=new WebDriverWait(driver,5)
			.until(ExpectedConditions.visibilityOfElementLocated(SaveBtn_xpath));
			SaveBtnWebEelement.click();

	return true;
		}
		catch(Exception ex){
			return false;
		}

		}
	 
	 
}
