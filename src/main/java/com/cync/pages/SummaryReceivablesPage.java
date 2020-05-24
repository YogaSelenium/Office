package com.cync.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.SkipException;

import com.cync.base.BasePage;

public class SummaryReceivablesPage extends BasePage {

	public SummaryReceivablesPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	private final By summaryReceivables_xpath = By
			.xpath("//span[@class='paneltitle']");
	private final By firstAccountNo_xpath = By
			.xpath("(//td[@aria-describedby='receivable_summaries_list_account_no'])[1]");
	private final By secondAccountNo_xpath = By
			.xpath("(//td[@aria-describedby='receivable_summaries_list_account_no'])[2]");
	private final By thirdAccountNo_xpath = By
			.xpath("(//td[@aria-describedby='receivable_summaries_list_account_no'])[3]");
	private final By fourthAccountNo_xpath = By
			.xpath("(//td[@aria-describedby='receivable_summaries_list_account_no'])[4]");
	private final By fifthAccountNo_xpath = By
			.xpath("(//td[@aria-describedby='receivable_summaries_list_account_no'])[5]");
	private final By sixthAccountNo_xpath = By
			.xpath("(//td[@aria-describedby='receivable_summaries_list_account_no'])[6]");
	private final By seventhAccountNo_xpath = By
			.xpath("(//td[@aria-describedby='receivable_summaries_list_account_no'])[7]");
	private final By eighthAccountNo_xpath = By
			.xpath("(//td[@aria-describedby='receivable_summaries_list_account_no'])[8]");
	private final By firstAccountName_xpath = By
			.xpath("(//td[@aria-describedby='receivable_summaries_list_account_name'])[1]");
	private final By secondAccountName_xpath = By
			.xpath("(//td[@aria-describedby='receivable_summaries_list_account_name'])[2]");
	private final By thirdAccountName_xpath = By
			.xpath("(//td[@aria-describedby='receivable_summaries_list_account_name'])[3]");
	private final By fourthAccountName_xpath = By
			.xpath("(//td[@aria-describedby='receivable_summaries_list_account_name'])[4]");
	private final By fifthAccountName_xpath = By
			.xpath("(//td[@aria-describedby='receivable_summaries_list_account_name'])[5]");
	private final By sixthAccountName_xpath = By
			.xpath("(//td[@aria-describedby='receivable_summaries_list_account_name'])[6]");
	private final By seventhAccountName_xpath = By
			.xpath("(//td[@aria-describedby='receivable_summaries_list_account_name'])[7]");
	private final By eighthAccountName_xpath = By
			.xpath("(//td[@aria-describedby='receivable_summaries_list_account_name'])[8]");
	private final By futureAmount_xpath = By
			.xpath("(//td[@aria-describedby='receivable_summaries_list_future_amount'])[1]");
	private final By firstCurrentAmount_xpath = By
			.xpath("(//td[@aria-describedby='receivable_summaries_list_current_amount'])[1]");
	private final By secondCurrentAmount_xpath = By
			.xpath("(//td[@aria-describedby='receivable_summaries_list_current_amount'])[7]");
	private final By firstOver30Amount_xpath = By
			.xpath("(//td[@aria-describedby='receivable_summaries_list_bucket_1_amount'])[1]");
	private final By secondOver30Amount_xpath = By
			.xpath("(//td[@aria-describedby='receivable_summaries_list_bucket_1_amount'])[8]");
	private final By firstOver60Amount_xpath = By
			.xpath("(//td[@aria-describedby='receivable_summaries_list_bucket_2_amount'])[1]");
	private final By firstOver90Amount_xpath = By
			.xpath("(//td[@aria-describedby='receivable_summaries_list_bucket_3_amount'])[1]");
	private final By firstOver120Amount_xpath = By
			.xpath("(//td[@aria-describedby='receivable_summaries_list_bucket_4_amount'])[1]");
	private final By firstBalanceAmount_xpath = By
			.xpath("(//td[@aria-describedby='receivable_summaries_list_balance_amount'])[1]");
	private final By secondBalanceAmount_xpath = By
			.xpath("(//td[@aria-describedby='receivable_summaries_list_balance_amount'])[2]");
	private final By thirdBalanceAmount_xpath = By
			.xpath("(//td[@aria-describedby='receivable_summaries_list_balance_amount'])[3]");
	private final By fourthBalanceAmount_xpath = By
			.xpath("(//td[@aria-describedby='receivable_summaries_list_balance_amount'])[4]");
	private final By fifthBalanceAmount_xpath = By
			.xpath("(//td[@aria-describedby='receivable_summaries_list_balance_amount'])[5]");
	private final By sixthBalanceAmount_xpath = By
			.xpath("(//td[@aria-describedby='receivable_summaries_list_balance_amount'])[6]");
	private final By seventhBalanceAmount_xpath = By
			.xpath("(//td[@aria-describedby='receivable_summaries_list_balance_amount'])[7]");
	private final By eighthBalanceAmount_xpath = By
			.xpath("(//td[@aria-describedby='receivable_summaries_list_balance_amount'])[8]");
	private final By totalFutureAmount_xpath = By
			.xpath("//*[@class='footrow footrow-ltr ui-widget-content']//*[@aria-describedby='receivable_summaries_list_future_amount']");
	private final By totalCurrentAmount_xpath = By
			.xpath("//*[@class='footrow footrow-ltr ui-widget-content']//*[@aria-describedby='receivable_summaries_list_current_amount']");
	private final By totalOver30Amount_xpath = By
			.xpath("//*[@class='footrow footrow-ltr ui-widget-content']//*[@aria-describedby='receivable_summaries_list_bucket_1_amount']");
	private final By totalOver60Amount_xpath = By
			.xpath("//*[@class='footrow footrow-ltr ui-widget-content']//*[@aria-describedby='receivable_summaries_list_bucket_2_amount']");
	private final By totalOver90Amount_xpath = By
			.xpath("//*[@class='footrow footrow-ltr ui-widget-content']//*[@aria-describedby='receivable_summaries_list_bucket_3_amount']");
	private final By totalOver120Amount_xpath = By
			.xpath("//*[@class='footrow footrow-ltr ui-widget-content']//*[@aria-describedby='receivable_summaries_list_bucket_4_amount']");
	private final By totalBalanceAmount_xpath = By
			.xpath("//*[@class='footrow footrow-ltr ui-widget-content']//*[@aria-describedby='receivable_summaries_list_balance_amount']");
	private final By totalFutureAmountSecondBBC_xpath = By
			.xpath("(//td[@aria-describedby='receivable_summaries_list_future_amount'])[9]");
	private final By totalCurrentAmountSecondBBC_xpath = By
			.xpath("(//td[@aria-describedby='receivable_summaries_list_current_amount'])[9]");
	private final By totalOver30AmountSecondBBC_xpath = By
			.xpath("(//td[@aria-describedby='receivable_summaries_list_bucket_1_amount'])[9]");
	private final By totalOver60AmountSecondBBC_xpath = By
			.xpath("(//td[@aria-describedby='receivable_summaries_list_bucket_2_amount'])[9]");
	private final By totalOver90AmountSecondBBC_xpath = By
			.xpath("(//td[@aria-describedby='receivable_summaries_list_bucket_3_amount'])[9]");
	private final By totalOver120AmountSecondBBC_xpath = By
			.xpath("(//td[@aria-describedby='receivable_summaries_list_bucket_4_amount'])[9]");
	private final By totalBalanceAmountSecondBBC_xpath = By
			.xpath("(//td[@aria-describedby='receivable_summaries_list_balance_amount'])[9]");

	//-----------------------------------------------------------------------------------------
	private final By gridSelection_xpath = By.xpath("//div[@id='colomun_choose_action']");
	//
	private final By debtorSelection_xpath = By.xpath("//a[text()= 'Edit Debtor Parameters']");
	
	// ------------------
	private final  By gridColumn =  By.id("colomun_choose_action");
	private final By accountNO_xpath = By.xpath("//span[text()= 'Account No']");
	private final By accountname_xpath = By.xpath("//span[text()= 'Account Name']");
	
	private final By future_xpath = By.xpath("//span[text()= 'Future']");
	private final By current_xpath = By.xpath("//span[text()= 'Current']");
	
	private final By over30_xpath = By.xpath("//span[text()= 'Over 30']");
	private final By over60_xpath = By.xpath("//span[text()= 'Over 60']");
	private final By over90_xpath = By.xpath("//span[text()= 'Over 90']");
	private final By over120_xpath = By.xpath("//span[text()= 'Over 120']");
	private final By balanceamount_xpath = By.xpath("//span[text()= 'Balance Amount']");
	private final By retention_xpath = By.xpath("//span[text()= 'Retention']");
	
	private final By parametername_xpath = By.xpath("//span[text()= 'Parameter Name']");
	private final By concentration_xpath = By.xpath("//span[text()= 'Concentration %']");
	private final By crossaging_xpath = By.xpath("//span[text()= 'Cross Aging']");
	private final By arexclude_xpath = By.xpath("//span[text()= 'A/R Exclude %']");
	private final By excludeValue_xpath = By.xpath("//span[text()= 'A/R Exclude value']");
	
	private final By insuranceLimit_xpath = By.xpath("//span[text()= 'Insurance Limit']");
	private final By inelegibleReason_xpath = By.xpath("//span[text()= 'Ineligible Reason']");
	private final By pastdue_xpath = By.xpath("//span[text()= 'Past Due AR Days']");
	private final By deductible_xpath = By.xpath("//span[text()= 'Deductible']");
	private final By creditlimit_xpath = By.xpath("//span[contains(text(),'Credit Limit')]");
	private final By createddate_xpath = By.xpath("//span[contains(text(),'Created Date')]");
	private final By comments_xpath = By.xpath("//span[text()= 'Comments']");
	
	
	
	//----------
	
	private final By accountNOCheckedBox_xpath = By.xpath("//input[@value ='account_no']");
	private final By accountnameCheckedBox_xpath = By.xpath("//input[@value ='account_name']");
	
	private final By futureCheckedBox_xpath = By.xpath("//input[@value ='future_amount']");
	private final By currentCheckedBox_xpath = By.xpath("//input[@value ='current_amount']");
	
	private final By over30CheckedBox_xpath = By.xpath("//input[@value ='bucket_1_amount']");
	private final By over60CheckedBox_xpath = By.xpath("//input[@value ='bucket_2_amount']");
	private final By over90CheckedBox_xpath = By.xpath("//input[@value ='bucket_3_amount']");
	private final By over120CheckedBox_xpath = By.xpath("//input[@value ='bucket_4_amount']");
	private final By balanceamountCheckedBox_xpath = By.xpath("//input[@value ='balance_amount']");
	private final By retentionCheckedBox_xpath = By.id("grid-columns-filter");
	
	private final By parameternameCheckedBox_xpath =  By.xpath("//input[@value ='collateral_advance_rate_id']");
	
	
	private final By columnselection_xpath = By.id("done");
	
	
	private final By parameterSelecton = By.id("colomun_choose_action");
	
	//-------------------------------06.12.2018
	
	private final By concentrationSelecton_xpath = By.id("jqgh_detailed_receivable_summaries_list_concentration_pct");
	
	
	private final By checkedconcentrationcolumn_xpath = By.xpath("//input[@value='concentration_pct']");
	
	private final By savebutton_xpath = By.id("save_grid");
	
	private final By age_xpath = By.xpath("//span[@onclick='child_popup_details(event, this, false)']");
	
	private final By viewchildren_xpath = By.linkText("View Children");
	
	private final By export_xpath = By.xpath("(//div[@class='ui-pg-div'])[7]");
	
	private final By concentrationcheckbox_xpath =By.xpath("//input[@value='concentration_pct.cync_format']");
	
	
	//======================07.12.2018
	
	private final By gridcolimn1_xpath = By.xpath("//div[@title='Grid Columns show/hide']");
	
	private final By creditlimitchecked_xpath = By.xpath("//input[@class='mselect_check']");
	
	
	private final By Test1_xpath = By.xpath("//span[contains(text(),'Test1')]");
	
	
	private final By logout_xpath = By.xpath("//a[@class=logout-button]");
	
	//=============
	
	
	private final By deductiblechecked_xpath = By.xpath("//input[@class='mselect_check']");
	
	
	private final By uncheckconcentration_xpath= By.xpath("//input[@value='concentration_pct']");
	
	private final By summaryrecivablebackbutton_xpath = By.xpath("//i[@class='glyphicon glyphicon-arrow-left']");
	
	private final By addrecord_xpath=By.xpath("//td[@title='Add Record']");
	
//anusha
	private final By SearchFieldInAccountno_xpath=By.xpath("//input[@id='gs_account_no']");
	
	
	
	
	
	
	
	
	private final By accountno_xpath=By.xpath("//td[@role='gridcell']//input[@name='account_no']");
	private final By accountnamee_xpath=By.xpath("(//input[@name ='account_name'])[2]");
	private final By futuree_xpath=By.xpath("(//input[@name ='future_amount'])[2]");
	private final By currentt_xpath=By.xpath("(//input[@name ='current_amount'])[2]");
	
	private final By over30e_xpath=By.xpath("(//input[@name ='bucket_1_amount'])[2]");
	private final By over60e_xpath=By.xpath("(//input[@name ='bucket_2_amount'])[2]");
	private final By over90e_xpath=By.xpath("(//input[@name ='bucket_3_amount'])[2]");
	private final By over120e_xpath=By.xpath("(//input[@name ='bucket_4_amount'])[2]");
	private final By retentione_xpath=By.xpath("(//input[@name ='retention_amount'])[2]");
	private final By savebtn_xpath=By.xpath("//td[@title='Save Record']");
	private final By cancelbtn_xpath=By.xpath("//a[@id='closedialog']");
	
	private final By totalFutureAmountG_xpath=By.xpath("(//td[@aria-describedby='receivable_summaries_list_future_amount'])[5]");
	private final By totalCurrentAmountG_xpath=By.xpath("(//td[@aria-describedby='receivable_summaries_list_current_amount'])[5]");
	private final By totalOver30AmountG_xpath=By.xpath("(//td[@aria-describedby='receivable_summaries_list_bucket_1_amount'])[5]");
	private final By totalOver60AmountG_xpath=By.xpath("(//td[@aria-describedby='receivable_summaries_list_bucket_2_amount'])[5]");
	private final By totalOver90AmountG_xpath=By.xpath("(//td[@aria-describedby='receivable_summaries_list_bucket_3_amount'])[5]");
	private final By totalOver120AmountG_xpath=By.xpath("(//td[@aria-describedby='receivable_summaries_list_bucket_4_amount'])[5]");
	private final By totalBalanceAmountG_xpath=By.xpath("(//td[@aria-describedby='receivable_summaries_list_balance_amount'])[5]");
	
	/*
	 * public SummaryReceivablesPage(WebDriver driver) { super(driver);
	 * 
	 * try {
	 * 
	 * } catch (Exception e) {
	 * 
	 * e.printStackTrace(); } if
	 * (!driver.findElement(summaryReceivables_xpath).getText
	 * ().trim().equals("Summary Receivables")) { throw new
	 * SkipException("summary Receivables couldn't open."); } }
	 */

	public boolean SummaryReceivablesHeader(String expected) {
		try {
			WebElement actual = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(summaryReceivables_xpath));

			actual.getText().trim();
			if (actual.equals(expected))
				return true;
			else
				return false;

		} catch (Exception e) {

		}
		return false;

	}

	public boolean addrecordClick() {
		try {
			WebElement summaryreceivablewebelement = new WebDriverWait(driver,
					10).until(ExpectedConditions
					.visibilityOfElementLocated(addrecord_xpath));
			summaryreceivablewebelement.click();
			return true;

		} catch (Exception e) {
			return false;
		}
	}
	public boolean saveClick() {
		try {
			WebElement summaryreceivablewebelement = new WebDriverWait(driver,
					10).until(ExpectedConditions
					.visibilityOfElementLocated(savebtn_xpath));
			summaryreceivablewebelement.click();
			return true;

		} catch (Exception e) {
			return false;
		}
	}
	public boolean cancelClick() {
		try {
			WebElement summaryreceivablewebelement = new WebDriverWait(driver,
					10).until(ExpectedConditions
					.visibilityOfElementLocated(cancelbtn_xpath));
			summaryreceivablewebelement.click();
			return true;

		} catch (Exception e) {
			return false;
		}
	}
	
	public boolean enteraccoutno(String num)
	{
	try{

		WebElement pastdueardaysInputWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(accountno_xpath));
		pastdueardaysInputWebEelement.click();
		pastdueardaysInputWebEelement.clear();
		pastdueardaysInputWebEelement.sendKeys(num);
		Thread.sleep(1000);
		
	return true;
	}
	catch(Exception ex){
		return false;
	}
	}
	public boolean enteraccoutname(String name)
	{
	try{

		WebElement pastdueardaysInputWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(accountnamee_xpath));
		pastdueardaysInputWebEelement.click();
		pastdueardaysInputWebEelement.clear();
		pastdueardaysInputWebEelement.sendKeys(name);
		Thread.sleep(1000);
		
	return true;
	}
	catch(Exception ex){
		return false;
	}
	}
	public boolean enterfutureamnt(String amnt)
	{
	try{

		WebElement pastdueardaysInputWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(futuree_xpath));
		pastdueardaysInputWebEelement.click();
		pastdueardaysInputWebEelement.clear();
		pastdueardaysInputWebEelement.sendKeys(amnt);
		Thread.sleep(1000);
		
	return true;
	}
	catch(Exception ex){
		return false;
	}
	}
	public boolean entercurrentamnt(String amnt)
	{
	try{

		WebElement pastdueardaysInputWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(currentt_xpath));
		pastdueardaysInputWebEelement.click();
		pastdueardaysInputWebEelement.clear();
		pastdueardaysInputWebEelement.sendKeys(amnt);
		Thread.sleep(1000);
		
	return true;
	}
	catch(Exception ex){
		return false;
	}
	}
	public boolean enterover30(String amnt)
	{
	try{

		WebElement pastdueardaysInputWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(over30e_xpath));
		pastdueardaysInputWebEelement.click();
		pastdueardaysInputWebEelement.clear();
		pastdueardaysInputWebEelement.sendKeys(amnt);
		Thread.sleep(1000);
		
	return true;
	}
	catch(Exception ex){
		return false;
	}
	}
	public boolean enterover60(String amnt)
	{
	try{

		WebElement pastdueardaysInputWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(over60e_xpath));
		pastdueardaysInputWebEelement.click();
		pastdueardaysInputWebEelement.clear();
		pastdueardaysInputWebEelement.sendKeys(amnt);
		Thread.sleep(1000);
		
	return true;
	}
	catch(Exception ex){
		return false;
	}
	}
	public boolean enterover90(String amnt)
	{
	try{

		WebElement pastdueardaysInputWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(over90e_xpath));
		pastdueardaysInputWebEelement.click();
		pastdueardaysInputWebEelement.clear();
		pastdueardaysInputWebEelement.sendKeys(amnt);
		Thread.sleep(1000);
		
	return true;
	}
	catch(Exception ex){
		return false;
	}
	}
	public boolean enterover120(String amnt)
	{
	try{

		WebElement pastdueardaysInputWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(over120e_xpath));
		pastdueardaysInputWebEelement.click();
		pastdueardaysInputWebEelement.clear();
		pastdueardaysInputWebEelement.sendKeys(amnt);
		Thread.sleep(1000);
		
	return true;
	}
	catch(Exception ex){
		return false;
	}
	}
	public boolean enterretentionamnt(String amnt)
	{
	try{

		WebElement pastdueardaysInputWebEelement=new WebDriverWait(driver,10)
		.until(ExpectedConditions.visibilityOfElementLocated(retentione_xpath));
		pastdueardaysInputWebEelement.click();
		pastdueardaysInputWebEelement.clear();
		pastdueardaysInputWebEelement.sendKeys(amnt);
		Thread.sleep(1000);
		
	return true;
	}
	catch(Exception ex){
		return false;
	}
	}
	public boolean firstAccountNoValidation(String expected) {
		try {
			Thread.sleep(1000);

			WebElement firstAccountNoWebElement = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(firstAccountNo_xpath));

			String actual = firstAccountNoWebElement.getText();
			if (actual.equals(expected))
				return true;
			else
				return false;

		} catch (Exception e) {
			return false;
		}
	}

	public boolean secondAccountNoValidation(String expected) {
		try {
			WebElement secondAccountNoWebElement = new WebDriverWait(driver,
					10).until(ExpectedConditions
					.visibilityOfElementLocated(secondAccountNo_xpath));

			String actual = secondAccountNoWebElement.getText();
			if (actual.equals(expected))
				return true;
			else
				return false;

		} catch (Exception e) {
			return false;
		}
	}

	public boolean thirdAccountNoValidation(String expected) {
		try {
			WebElement thirdAccountNoWebElement = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(thirdAccountNo_xpath));

			String actual = thirdAccountNoWebElement.getText();
			if (actual.equals(expected))
				return true;
			else
				return false;

		} catch (Exception e) {
			return false;
		}
	}

	public boolean fourthAccountNoValidation(String expected) {
		try {
			WebElement fourthAccountNoWebElement = new WebDriverWait(driver,
					10).until(ExpectedConditions
					.visibilityOfElementLocated(fourthAccountNo_xpath));

			String actual = fourthAccountNoWebElement.getText();
			if (actual.equals(expected))
				return true;
			else
				return false;

		} catch (Exception e) {
			return false;
		}
	}

	public boolean fifthAccountNoValidation(String expected) {
		try {
			WebElement fifthAccountNoWebElement = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(fifthAccountNo_xpath));

			String actual = fifthAccountNoWebElement.getText();
			if (actual.equals(expected))
				return true;
			else
				return false;

		} catch (Exception e) {
			return false;
		}
	}

	public boolean sixthAccountNoValidation(String expected) {
		try {
			WebElement sixthAccountNoWebElement = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(sixthAccountNo_xpath));

			String actual = sixthAccountNoWebElement.getText();
			if (actual.equals(expected))
				return true;
			else
				return false;

		} catch (Exception e) {
			return false;
		}
	}

	public boolean seventhAccountNoValidation(String expected) {
		try {
			WebElement seventhAccountNoWebElement = new WebDriverWait(driver,
					10).until(ExpectedConditions
					.visibilityOfElementLocated(seventhAccountNo_xpath));

			String actual = seventhAccountNoWebElement.getText();
			if (actual.equals(expected))
				return true;
			else
				return false;

		} catch (Exception e) {
			return false;
		}
	}

	public boolean eighthAccountNoValidation(String expected) {
		try {
			WebElement eighthAccountNoWebElement = new WebDriverWait(driver,
					10).until(ExpectedConditions
					.visibilityOfElementLocated(eighthAccountNo_xpath));

			String actual = eighthAccountNoWebElement.getText();
			if (actual.equals(expected))
				return true;
			else
				return false;

		} catch (Exception e) {
			return false;
		}
	}

	public boolean firstAccountNameValidation(String expected) {
		try {
			WebElement firstAccountNameWebElement = new WebDriverWait(driver,
					10).until(ExpectedConditions
					.visibilityOfElementLocated(firstAccountName_xpath));

			String actual = firstAccountNameWebElement.getText();
			if (actual.equals(expected))
				return true;
			else
				return false;

		} catch (Exception e) {
			return false;
		}
	}

	public boolean secondAccountNameValidation(String expected) {
		try {
			WebElement secondAccountNameWebElement = new WebDriverWait(driver,
					10).until(ExpectedConditions
					.visibilityOfElementLocated(secondAccountName_xpath));

			String actual = secondAccountNameWebElement.getText();
			if (actual.equals(expected))
				return true;
			else
				return false;

		} catch (Exception e) {
			return false;
		}
	}

	public boolean thirdAccountNameValidation(String expected) {
		try {
			WebElement thirdAccountNameWebElement = new WebDriverWait(driver,
					10).until(ExpectedConditions
					.visibilityOfElementLocated(thirdAccountName_xpath));

			String actual = thirdAccountNameWebElement.getText();
			if (actual.equals(expected))
				return true;
			else
				return false;

		} catch (Exception e) {
			return false;
		}
	}

	public boolean fourthAccountNameValidation(String expected) {
		try {
			WebElement fourthAccountNameWebElement = new WebDriverWait(driver,
					10).until(ExpectedConditions
					.visibilityOfElementLocated(fourthAccountName_xpath));

			String actual = fourthAccountNameWebElement.getText();
			if (actual.equals(expected))
				return true;
			else
				return false;

		} catch (Exception e) {
			return false;
		}
	}

	public boolean fifthAccountNameValidation(String expected) {
		try {
			WebElement fifthAccountNameWebElement = new WebDriverWait(driver,
					10).until(ExpectedConditions
					.visibilityOfElementLocated(fifthAccountName_xpath));

			String actual = fifthAccountNameWebElement.getText();
			if (actual.equals(expected))
				return true;
			else
				return false;

		} catch (Exception e) {
			return false;
		}
	}

	public boolean sixthAccountNameValidation(String expected) {
		try {
			WebElement sixthAccountNameWebElement = new WebDriverWait(driver,
					10).until(ExpectedConditions
					.visibilityOfElementLocated(sixthAccountName_xpath));

			String actual = sixthAccountNameWebElement.getText();
			if (actual.equals(expected))
				return true;
			else
				return false;

		} catch (Exception e) {
			return false;
		}
	}

	public boolean seventhAccountNameValidation(String expected) {
		try {
			WebElement seventhAccountNameWebElement = new WebDriverWait(driver,
					10).until(ExpectedConditions
					.visibilityOfElementLocated(seventhAccountName_xpath));

			String actual = seventhAccountNameWebElement.getText();
			if (actual.equals(expected))
				return true;
			else
				return false;

		} catch (Exception e) {
			return false;
		}
	}

	public boolean eighthAccountNameValidation(String expected) {
		try {
			WebElement eighthAccountNameWebElement = new WebDriverWait(driver,
					10).until(ExpectedConditions
					.visibilityOfElementLocated(eighthAccountName_xpath));

			String actual = eighthAccountNameWebElement.getText();
			if (actual.equals(expected))
				return true;
			else
				return false;

		} catch (Exception e) {
			return false;
		}
	}

	public boolean futureAmountValidation(String expected) {
		try {
			/*
			 * JavascriptExecutor js = (JavascriptExecutor) driver;
			 * js.executeScript("window.scrollBy(400,0)", "");
			 */
			WebElement futureAmountWebElement = new WebDriverWait(driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(futureAmount_xpath));

			String actual = futureAmountWebElement.getText();
			if (actual.equals(expected))
				return true;
			else
				return false;

		} catch (Exception e) {
			return false;
		}
	}

	public boolean firstCurrentAmountValidation(String expected) {
		try {

			WebElement firstCurrentAmountWebElement = new WebDriverWait(driver,
					10).until(ExpectedConditions
					.visibilityOfElementLocated(firstCurrentAmount_xpath));

			String actual = firstCurrentAmountWebElement.getText();
			if (actual.equals(expected))
				return true;
			else
				return false;

		} catch (Exception e) {
			return false;
		}
	}

	public boolean secondCurrentAmountValidation(String expected) {
		try {

			WebElement secondCurrentAmountWebElement = new WebDriverWait(
					driver, 10).until(ExpectedConditions
					.visibilityOfElementLocated(secondCurrentAmount_xpath));

			String actual = secondCurrentAmountWebElement.getText();
			if (actual.equals(expected))
				return true;
			else
				return false;

		} catch (Exception e) {
			return false;
		}
	}

	public boolean firstOver30AmountValidation(String expected) {
		try {

			WebElement firstOver30AmountWebElement = new WebDriverWait(driver,
					10).until(ExpectedConditions
					.visibilityOfElementLocated(firstOver30Amount_xpath));

			String actual = firstOver30AmountWebElement.getText();
			if (actual.equals(expected))
				return true;
			else
				return false;

		} catch (Exception e) {
			return false;
		}
	}

	public boolean secondOver30AmountValidation(String expected) {
		try {

			WebElement secondOver30AmountWebElement = new WebDriverWait(driver,
					10).until(ExpectedConditions
					.visibilityOfElementLocated(secondOver30Amount_xpath));

			String actual = secondOver30AmountWebElement.getText();
			if (actual.equals(expected))
				return true;
			else
				return false;

		} catch (Exception e) {
			return false;
		}
	}

	public boolean firstOver60AmountValidation(String expected) {
		try {

			WebElement firstOver60AmountWebElement = new WebDriverWait(driver,
					10).until(ExpectedConditions
					.visibilityOfElementLocated(firstOver60Amount_xpath));

			String actual = firstOver60AmountWebElement.getText();
			if (actual.equals(expected))
				return true;
			else
				return false;

		} catch (Exception e) {
			return false;
		}
	}

	public boolean firstOver90AmountValidation(String expected) {
		try {

			WebElement firstOver90AmountWebElement = new WebDriverWait(driver,
					10).until(ExpectedConditions
					.visibilityOfElementLocated(firstOver90Amount_xpath));

			String actual = firstOver90AmountWebElement.getText();
			if (actual.equals(expected))
				return true;
			else
				return false;

		} catch (Exception e) {
			return false;
		}
	}

	public boolean firstOver120AmountValidation(String expected) {
		try {

			WebElement firstOver120AmountWebElement = new WebDriverWait(driver,
					10).until(ExpectedConditions
					.visibilityOfElementLocated(firstOver120Amount_xpath));

			String actual = firstOver120AmountWebElement.getText();
			if (actual.equals(expected))
				return true;
			else
				return false;

		} catch (Exception e) {
			return false;
		}
	}

	public boolean totalFutureAmountValidation(String expected) {
		try {

			WebElement totalFutureAmountWebElement = new WebDriverWait(driver,
					10).until(ExpectedConditions
					.visibilityOfElementLocated(totalFutureAmount_xpath));

			String actual = totalFutureAmountWebElement.getText();
			if (actual.equals(expected))
				return true;
			else
				return false;

		} catch (Exception e) {
			return false;
		}
	}

	public boolean totalCurrentAmountValidation(String expected) {
		try {

			WebElement totalCurrentAmountWebElement = new WebDriverWait(driver,
					10).until(ExpectedConditions
					.visibilityOfElementLocated(totalCurrentAmount_xpath));

			String actual = totalCurrentAmountWebElement.getText();
			if (actual.equals(expected))
				return true;
			else
				return false;

		} catch (Exception e) {
			return false;
		}
	}

	public boolean totalOver30AmountValidation(String expected) {
		try {

			WebElement totalOver30AmountWebElement = new WebDriverWait(driver,
					10).until(ExpectedConditions
					.visibilityOfElementLocated(totalOver30Amount_xpath));

			String actual = totalOver30AmountWebElement.getText();
			if (actual.equals(expected))
				return true;
			else
				return false;

		} catch (Exception e) {
			return false;
		}
	}

	public boolean totalOver60AmountValidation(String expected) {
		try {

			WebElement totalOver60AmountWebElement = new WebDriverWait(driver,
					10).until(ExpectedConditions
					.visibilityOfElementLocated(totalOver60Amount_xpath));

			String actual = totalOver60AmountWebElement.getText();
			if (actual.equals(expected))
				return true;
			else
				return false;

		} catch (Exception e) {
			return false;
		}
	}

	public boolean totalOver90AmountValidation(String expected) {
		try {

			WebElement totalOver90AmountValidationWebElement = new WebDriverWait(
					driver, 10).until(ExpectedConditions
					.visibilityOfElementLocated(totalOver90Amount_xpath));

			String actual = totalOver90AmountValidationWebElement.getText();
			if (actual.equals(expected))
				return true;
			else
				return false;

		} catch (Exception e) {
			return false;
		}
	}

	public boolean totalOver120AmountValidation(String expected) {
		try {

			WebElement totalOver120AmountValidationWebElement = new WebDriverWait(
					driver, 10).until(ExpectedConditions
					.visibilityOfElementLocated(totalOver120Amount_xpath));

			String actual = totalOver120AmountValidationWebElement.getText();
			if (actual.equals(expected))
				return true;
			else
				return false;

		} catch (Exception e) {
			return false;
		}
	}

	public boolean firstBalanceAmountValidation(String expected) {
		try {
			WebElement firstBalanceAmountWebElement = new WebDriverWait(driver,
					10).until(ExpectedConditions
					.visibilityOfElementLocated(firstBalanceAmount_xpath));

			String actual = firstBalanceAmountWebElement.getText();
			if (actual.equals(expected))
				return true;
			else
				return false;

		} catch (Exception e) {
			return false;
		}
	}

	public boolean secondBalanceAmountValidation(String expected) {
		try {
			WebElement secondBalanceAmountWebElement = new WebDriverWait(
					driver, 10).until(ExpectedConditions
					.visibilityOfElementLocated(secondBalanceAmount_xpath));

			String actual = secondBalanceAmountWebElement.getText();
			if (actual.equals(expected))
				return true;
			else
				return false;

		} catch (Exception e) {
			return false;
		}
	}

	public boolean thirdBalanceAmountValidation(String expected) {
		try {
			WebElement thirdBalanceAmountWebElement = new WebDriverWait(driver,
					10).until(ExpectedConditions
					.visibilityOfElementLocated(thirdBalanceAmount_xpath));

			String actual = thirdBalanceAmountWebElement.getText();
			if (actual.equals(expected))
				return true;
			else
				return false;

		} catch (Exception e) {
			return false;
		}
	}

	public boolean fourthBalanceAmountValidation(String expected) {
		try {
			WebElement fourthBalanceAmountWebElement = new WebDriverWait(
					driver, 10).until(ExpectedConditions
					.visibilityOfElementLocated(fourthBalanceAmount_xpath));

			String actual = fourthBalanceAmountWebElement.getText();
			if (actual.equals(expected))
				return true;
			else
				return false;

		} catch (Exception e) {
			return false;
		}
	}

	public boolean fifthBalanceAmountValidation(String expected) {
		try {
			WebElement fifthBalanceAmountWebElement = new WebDriverWait(driver,
					10).until(ExpectedConditions
					.visibilityOfElementLocated(fifthBalanceAmount_xpath));

			String actual = fifthBalanceAmountWebElement.getText();
			if (actual.equals(expected))
				return true;
			else
				return false;

		} catch (Exception e) {
			return false;
		}
	}

	public boolean sixthBalanceAmountValidation(String expected) {
		try {
			WebElement sixthBalanceAmountWebElement = new WebDriverWait(driver,
					10).until(ExpectedConditions
					.visibilityOfElementLocated(sixthBalanceAmount_xpath));

			String actual = sixthBalanceAmountWebElement.getText();
			if (actual.equals(expected))
				return true;
			else
				return false;

		} catch (Exception e) {
			return false;
		}
	}

	public boolean seventhBalanceAmountValidation(String expected) {
		try {
			WebElement seventhBalanceAmountWebElement = new WebDriverWait(
					driver, 10).until(ExpectedConditions
					.visibilityOfElementLocated(seventhBalanceAmount_xpath));

			String actual = seventhBalanceAmountWebElement.getText();
			if (actual.equals(expected))
				return true;
			else
				return false;

		} catch (Exception e) {
			return false;
		}
	}

	public boolean eighthBalanceAmountValidation(String expected) {
		try {
			WebElement eighthBalanceAmountWebElement = new WebDriverWait(
					driver, 10).until(ExpectedConditions
					.visibilityOfElementLocated(eighthBalanceAmount_xpath));

			String actual = eighthBalanceAmountWebElement.getText();
			if (actual.equals(expected))
				return true;
			else
				return false;

		} catch (Exception e) {
			return false;
		}
	}

	public boolean totalBalanceAmountValidation(String expected) {
		try {
			WebElement totalBalanceAmountWebElement = new WebDriverWait(driver,
					10).until(ExpectedConditions
					.visibilityOfElementLocated(totalBalanceAmount_xpath));

			String actual = totalBalanceAmountWebElement.getText();
			if (actual.equals(expected))
				return true;
			else
				return false;

		} catch (Exception e) {
			return false;
		}
	}

	public boolean totalFutureAmountValidationSecondBBC(String expected) {
		try {
            Thread.sleep(2000);
			WebElement totalFutureAmountWebElement = new WebDriverWait(driver,
					20)
					.until(ExpectedConditions
							.elementToBeClickable(totalFutureAmountSecondBBC_xpath));

			String actual = totalFutureAmountWebElement.getText();
			if (actual.equals(expected))
				return true;
			else
				return false;

		} catch (Exception e) {
			return false;
		}
	}

	public boolean totalCurrentAmountValidationSecondBBC(String expected) {
		try {

			WebElement totalCurrentAmountWebElement = new WebDriverWait(driver,
					10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(totalCurrentAmountSecondBBC_xpath));

			String actual = totalCurrentAmountWebElement.getText();
			if (actual.equals(expected))
				return true;
			else
				return false;

		} catch (Exception e) {
			return false;
		}
	}

	public boolean totalOver30AmountValidationSecondBBC(String expected) {
		try {

			WebElement totalOver30AmountWebElement = new WebDriverWait(driver,
					10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(totalOver30AmountSecondBBC_xpath));

			String actual = totalOver30AmountWebElement.getText();
			if (actual.equals(expected))
				return true;
			else
				return false;

		} catch (Exception e) {
			return false;
		}
	}

	public boolean totalOver60AmountValidationSecondBBC(String expected) {
		try {

			WebElement totalOver60AmountWebElement = new WebDriverWait(driver,
					10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(totalOver60AmountSecondBBC_xpath));

			String actual = totalOver60AmountWebElement.getText();
			if (actual.equals(expected))
				return true;
			else
				return false;

		} catch (Exception e) {
			return false;
		}
	}

	public boolean totalOver90AmountValidationSecondBBC(String expected) {
		try {

			WebElement totalOver90AmountValidationWebElement = new WebDriverWait(
					driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(totalOver90AmountSecondBBC_xpath));

			String actual = totalOver90AmountValidationWebElement.getText();
			if (actual.equals(expected))
				return true;
			else
				return false;

		} catch (Exception e) {
			return false;
		}
	}

	public boolean totalOver120AmountValidationSecondBBC(String expected) {
		try {

			WebElement totalOver120AmountValidationWebElement = new WebDriverWait(
					driver, 10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(totalOver120AmountSecondBBC_xpath));

			String actual = totalOver120AmountValidationWebElement.getText();
			if (actual.equals(expected))
				return true;
			else
				return false;

		} catch (Exception e) {
			return false;
		}
	}

	public boolean totalBalanceAmountValidationSecondBBC(String expected) {
		try {
			WebElement totalBalanceAmountWebElement = new WebDriverWait(driver,
					10)
					.until(ExpectedConditions
							.visibilityOfElementLocated(totalBalanceAmountSecondBBC_xpath));

			String actual = totalBalanceAmountWebElement.getText();
			if (actual.equals(expected))
				return true;
			else
				return false;

		} catch (Exception e) {
			return false;
		}
	}

	//-----------------------------------------------------------------------------------------
	public boolean gridDisplayed() {
		try {
			WebElement totalBalanceAmountWebElement = new WebDriverWait(driver,
					10).until(ExpectedConditions
					.visibilityOfElementLocated(gridSelection_xpath));
			totalBalanceAmountWebElement.isDisplayed();
			return true;

		} catch (Exception e) {
			return false;
		}
	}

	//

	public boolean debtorDisplayed() {
		try {
			WebElement totalBalanceAmountWebElement = new WebDriverWait(driver,
					10).until(ExpectedConditions
					.visibilityOfElementLocated(debtorSelection_xpath));
			totalBalanceAmountWebElement.isDisplayed();
			return true;

		} catch (Exception e) {
			return false;
		}
	}
	//----------3
	public boolean clickONGrid() {
		try {
			WebElement gridWebElement = new WebDriverWait(driver,
					10).until(ExpectedConditions
					.visibilityOfElementLocated(gridSelection_xpath));
			gridWebElement.isDisplayed();
			
			return true;

		} catch (Exception e) {
			return false;
		}
	}
	
	public boolean accountNODisplayed() {
		try {
			WebElement accountNoWebElement = new WebDriverWait(driver,
					10).until(ExpectedConditions
					.visibilityOfElementLocated(gridSelection_xpath));
			accountNoWebElement.isDisplayed();
			
			return true;

		} catch (Exception e) {
	}
		
		return false;
	}

	
	public boolean accountNameDisplayed() {
		try {
			WebElement accountNameWebElement = new WebDriverWait(driver,
					10).until(ExpectedConditions
					.visibilityOfElementLocated(gridSelection_xpath));
			accountNameWebElement.isDisplayed();
			return true;

		} catch (Exception e) {
			return false;
		}
	}
	
	public boolean futureDisplayed() {
		try {
			WebElement futureWebElement = new WebDriverWait(driver,
					10).until(ExpectedConditions
					.visibilityOfElementLocated(gridSelection_xpath));
			futureWebElement.isDisplayed();
			return true;

		} catch (Exception e) {
			return false;
		}
	}
	
	
	public boolean currentDisplayed() {
		try {
			WebElement currentWebElement = new WebDriverWait(driver,
					10).until(ExpectedConditions
					.visibilityOfElementLocated(gridSelection_xpath));
			currentWebElement.isDisplayed();
			return true;

		} catch (Exception e) {
			return false;
		}
	}
	
	public boolean over30Displayed() {
		try {
			WebElement over30WebElement = new WebDriverWait(driver,
					10).until(ExpectedConditions
					.visibilityOfElementLocated(gridSelection_xpath));
			over30WebElement.isDisplayed();
			return true;

		} catch (Exception e) {
			return false;
		}
	}
	
	public boolean over60Displayed() {
		try {
			WebElement over60WebElement = new WebDriverWait(driver,
					10).until(ExpectedConditions
					.visibilityOfElementLocated(gridSelection_xpath));
			over60WebElement.isDisplayed();
			return true;

		} catch (Exception e) {
			return false;
		}
	}
	
	public boolean over90Displayed() {
		try {
			WebElement over90WebElement = new WebDriverWait(driver,
					10).until(ExpectedConditions
					.visibilityOfElementLocated(gridSelection_xpath));
			over90WebElement.isDisplayed();
			return true;

		} catch (Exception e) {
			return false;
		}
	}
	
	public boolean over120Displayed() {
		try {
			WebElement over120WebElement = new WebDriverWait(driver,
					10).until(ExpectedConditions
					.visibilityOfElementLocated(gridSelection_xpath));
			over120WebElement.isDisplayed();
			return true;

		} catch (Exception e) {
			return false;
		}
	}
	
	public boolean balanceAmountDisplayed() {
		try {
			WebElement balanceAmountWebElement = new WebDriverWait(driver,
					10).until(ExpectedConditions
					.visibilityOfElementLocated(gridSelection_xpath));
			balanceAmountWebElement.isDisplayed();
			return true;

		} catch (Exception e) {
			return false;
		}
	}
	
	public boolean retentionDisplayed() {
		try {
			WebElement retentionWebElement = new WebDriverWait(driver,
					10).until(ExpectedConditions
					.visibilityOfElementLocated(gridSelection_xpath));
			retentionWebElement.isDisplayed();
			return true;

		} catch (Exception e) {
			return false;
		}
	}
	
	public boolean parameterNameDisplayed() {
		try {
			WebElement parameterNameWebElement = new WebDriverWait(driver,
					10).until(ExpectedConditions
					.visibilityOfElementLocated(gridSelection_xpath));
			parameterNameWebElement.isDisplayed();
			return true;

		} catch (Exception e) {
			return false;
		}
	}
	
	public boolean concentrationDisplayed() {
		try {
			WebElement concentrationWebElement = new WebDriverWait(driver,
					10).until(ExpectedConditions
					.visibilityOfElementLocated(gridSelection_xpath));
			concentrationWebElement.isDisplayed();
			return true;

		} catch (Exception e) {
			return false;
		}
	}
	
	public boolean crossAgingDisplayed() {
		try {
			WebElement crossAgingWebElement = new WebDriverWait(driver,
					10).until(ExpectedConditions
					.visibilityOfElementLocated(gridSelection_xpath));
			crossAgingWebElement.isDisplayed();
			return true;

		} catch (Exception e) {
			return false;
		}
	}
	
	public boolean arExcludeValueDisplayed() {
		try {
			WebElement arExculdeValueWebElement = new WebDriverWait(driver,
					10).until(ExpectedConditions
					.visibilityOfElementLocated(gridSelection_xpath));
			 arExculdeValueWebElement.isDisplayed();
			return true;

		} catch (Exception e) {
			return false;
		}
	}
	
	public boolean insuranceLimitDisplayed() {
		try {
			WebElement insuranceLimitWebElement = new WebDriverWait(driver,
					10).until(ExpectedConditions
					.visibilityOfElementLocated(gridSelection_xpath));
			insuranceLimitWebElement.isDisplayed();
			return true;

		} catch (Exception e) {
			return false;
		}
	}
	
	public boolean ineligibleReasonDisplayed() {
		try {
			WebElement ineligibleReasonWebElement = new WebDriverWait(driver,
					10).until(ExpectedConditions
					.visibilityOfElementLocated(gridSelection_xpath));
			ineligibleReasonWebElement.isDisplayed();
			return true;

		} catch (Exception e) {
			return false;
		}
	}
	
	public boolean pastDueARDaysDisplayed() {
		try {
			WebElement pastDueARDaysWebElement = new WebDriverWait(driver,
					10).until(ExpectedConditions
					.visibilityOfElementLocated(gridSelection_xpath));
			pastDueARDaysWebElement.isDisplayed();
			return true;

		} catch (Exception e) {
			return false;
		}
	}
	
	public boolean deductiblesDisplayed() {
		try {
			WebElement deductiblesWebElement = new WebDriverWait(driver,
					10).until(ExpectedConditions
					.visibilityOfElementLocated(gridSelection_xpath));
			deductiblesWebElement.isDisplayed();
			return true;

		} catch (Exception e) {
			return false;
		}
	}
	
	public boolean CreditDisplayed() {
		try {
			WebElement CreditsWebElement = new WebDriverWait(driver,
					10).until(ExpectedConditions
					.visibilityOfElementLocated(gridSelection_xpath));
			CreditsWebElement.isDisplayed();
			return true;

		} catch (Exception e) {
			return false;
		}
	}
	
	public boolean createdDateDisplayed() {
		try {
			WebElement createdDateWebElement = new WebDriverWait(driver,
					10).until(ExpectedConditions
					.visibilityOfElementLocated(gridSelection_xpath));
			createdDateWebElement.isDisplayed();
			return true;

		} catch (Exception e) {
			return false;
		}
	}
	
	public boolean commentsDisplayed() {
		try {
			WebElement commentsWebElement = new WebDriverWait(driver,
					10).until(ExpectedConditions
					.visibilityOfElementLocated(gridSelection_xpath));
			commentsWebElement.isDisplayed();
			return true;

		} catch (Exception e) {
			return false;
		}
	}
	
	
	//----------------
	
	
	public boolean accountNOSelected() {
		try {
			WebElement accountNoWebElement = new WebDriverWait(driver,
					10).until(ExpectedConditions
					.visibilityOfElementLocated(gridSelection_xpath));
			accountNoWebElement.isSelected();
			return true;

		} catch (Exception e) {
			return false;
		}
	}
	
	public boolean accountNameSelected() {
		try {
			WebElement accountNameWebElement = new WebDriverWait(driver,
					10).until(ExpectedConditions
					.visibilityOfElementLocated(gridSelection_xpath));
			accountNameWebElement.isSelected();
			return true;

		} catch (Exception e) {
			return false;
		}
	}
	
	public boolean futureSlected() {
		try {
			WebElement futureWebElement = new WebDriverWait(driver,
					10).until(ExpectedConditions
					.visibilityOfElementLocated(gridSelection_xpath));
			futureWebElement.isSelected();
			return true;

		} catch (Exception e) {
			return false;
		}
	}
	
	public boolean currentSelected() {
		try {
			WebElement currentWebElement = new WebDriverWait(driver,
					10).until(ExpectedConditions
					.visibilityOfElementLocated(gridSelection_xpath));
			currentWebElement .isSelected();
			return true;

		} catch (Exception e) {
			return false;
		}
	}
	
	public boolean over30Selected() {
		try {
			WebElement over30WebElement = new WebDriverWait(driver,
					10).until(ExpectedConditions
					.visibilityOfElementLocated(gridSelection_xpath));
			over30WebElement .isSelected();
			return true;

		} catch (Exception e) {
			return false;
		}
	}
	
	public boolean over60Selected() {
		try {
			WebElement over60WebElement = new WebDriverWait(driver,
					10).until(ExpectedConditions
					.visibilityOfElementLocated(gridSelection_xpath));
			over60WebElement .isSelected();
			return true;

		} catch (Exception e) {
			return false;
		}
	}
	public boolean over90Selected() {
		try {
			WebElement over90WebElement = new WebDriverWait(driver,
					10).until(ExpectedConditions
					.visibilityOfElementLocated(gridSelection_xpath));
			over90WebElement .isSelected();
			return true;

		} catch (Exception e) {
			return false;
		}
	}
	
	public boolean over120Selected() {
		try {
			WebElement over120WebElement = new WebDriverWait(driver,
					10).until(ExpectedConditions
					.visibilityOfElementLocated(gridSelection_xpath));
			over120WebElement .isSelected();
			return true;

		} catch (Exception e) {
			return false;
		}
	}
	
	public boolean balanceAmountSelected() {
		try {
			WebElement balanceAmountWebElement = new WebDriverWait(driver,
					10).until(ExpectedConditions
					.visibilityOfElementLocated(gridSelection_xpath));
			balanceAmountWebElement .isSelected();
			return true;

		} catch (Exception e) {
			return false;
		}
	}
	
	public boolean retentionSelected() {
		try {
			WebElement retentionSelectedWebElement = new WebDriverWait(driver,
					10).until(ExpectedConditions
					.visibilityOfElementLocated(gridSelection_xpath));
			retentionSelectedWebElement .isSelected();
			return true;

		} catch (Exception e) {
			return false;
		}
	}
	
	public boolean parameterNameSelected() {
		try {
			WebElement parameterNameSelectedWebElement = new WebDriverWait(driver,
					10).until(ExpectedConditions
					.visibilityOfElementLocated(gridSelection_xpath));
			parameterNameSelectedWebElement .isSelected();
			return true;

		} catch (Exception e) {
			return false;
		}
	}
	
	public boolean clickedOnCloseButton() {
		try {
			WebElement closebuttonWebElement = new WebDriverWait(driver,
					10).until(ExpectedConditions
					.visibilityOfElementLocated(gridSelection_xpath));
			closebuttonWebElement.isDisplayed();
			
			return true;

		} catch (Exception e) {
			return false;
		}
	}
	
	//=====================================1
	public boolean checkOnConcentrationCheckboxes() {
		try {
			WebElement selectedColumnAddedWithexistingColumnsWebElement = new WebDriverWait(driver,
					10).until(ExpectedConditions
					.visibilityOfElementLocated(gridSelection_xpath));
			selectedColumnAddedWithexistingColumnsWebElement.isDisplayed();
			
			return true;

		} catch (Exception e) {
			return false;
		}
	}
	
	//======================================2
	public boolean checkOnMultipleColumnsCheckboxes() {
		try {
			WebElement multipleColumnsWithexistingColumnsWebElement = new WebDriverWait(driver,
					10).until(ExpectedConditions
					.visibilityOfElementLocated(gridSelection_xpath));
			multipleColumnsWithexistingColumnsWebElement.isDisplayed();
			
			return true;

		} catch (Exception e) {
			return false;
		}
	}
	//================================3
	public boolean selectrecordToUpdateDisplayed() {
		try {
			WebElement debtorParameterColumnsWebElement = new WebDriverWait(driver,
					10).until(ExpectedConditions
					.visibilityOfElementLocated(gridSelection_xpath));
			debtorParameterColumnsWebElement.isDisplayed();
			
			return true;

		} catch (Exception e) {
			return false;
		}
	}
	//=================4
	public boolean ColumnAddedInSummaryReceivablesDisplaySameValueinDebtor() {
		try {
			WebElement ColumnAddedInSummaryReceivablesDisplaySameValueinDebtorWebelement = new WebDriverWait(driver,
					10).until(ExpectedConditions
					.visibilityOfElementLocated(gridSelection_xpath));
			ColumnAddedInSummaryReceivablesDisplaySameValueinDebtorWebelement.isDisplayed();
			
			return true;

		} catch (Exception e) {
			return false;
		}
	}
	//================================5
	
	
	public boolean uncheckedColumnHiddenAfterDeselected() {
		try {
			WebElement uncheckedColumnHiddenAfterDeselectedWebelement = new WebDriverWait(driver,
					10).until(ExpectedConditions
					.visibilityOfElementLocated(gridSelection_xpath));
			uncheckedColumnHiddenAfterDeselectedWebelement.	isSelected();
			
			return true;

		} catch (Exception e) {
			return false;
		}
	}
	
	
	//============================================6
	
	public boolean columnsNotAddedInSummaryreceivablesWhenCheckboxesUnchecked() {
		try {
			WebElement columnsNotAddedInSummaryreceivablesWhenCheckboxesUncheckedWebelement = new WebDriverWait(driver,
					10).until(ExpectedConditions
					.visibilityOfElementLocated(gridSelection_xpath));
			columnsNotAddedInSummaryreceivablesWhenCheckboxesUncheckedWebelement.isDisplayed();
			
			return true;

		} catch (Exception e) {
			return false;
		}
	}
	
	//===================
	public boolean debtorsSccreendisplayed() {
		try {
			WebElement editdebtorsparametersWebelement = new WebDriverWait(driver,
					10).until(ExpectedConditions
					.visibilityOfElementLocated(gridSelection_xpath));
			editdebtorsparametersWebelement.click();
			
			return true;

		} catch (Exception e) {
			return false;
		}
	}
	//========================05-12-2018
	
	
	
	public boolean clickdebtor() {
		try {
			WebElement totalBalanceAmountWebElement = new WebDriverWait(driver,
					10).until(ExpectedConditions
					.visibilityOfElementLocated(debtorSelection_xpath));
			totalBalanceAmountWebElement.click();
			return true;

		} catch (Exception e) {
			return false;
		}
	}
	//=======================
	
	public boolean updatedColumnReflectInDebtorAndSummaryreceivables() {
		try {
			WebElement updatedColumnReflectInDebtorAndSummaryreceivablesWebElement = new WebDriverWait(driver,
					10).until(ExpectedConditions
					.visibilityOfElementLocated(debtorSelection_xpath));
			updatedColumnReflectInDebtorAndSummaryreceivablesWebElement.isDisplayed();
			return true;

		} catch (Exception e) {
			return false;
		}
	}
	//===============================
	
	public boolean clickEditDebtorParameters() {
		try {
			WebElement summaryreceivablesBackupButtonWebElement = new WebDriverWait(driver,
					10).until(ExpectedConditions
					.visibilityOfElementLocated(debtorSelection_xpath));
			summaryreceivablesBackupButtonWebElement.isDisplayed();
			return true;

		} catch (Exception e) {
			return false;
			
		}
	}
		
		
		//===========================
		
		
		public boolean columnfromGridSelectionPopupSelected() {
			try {
				WebElement columnfromGridSelectionPopupWebElement = new WebDriverWait(driver,
						10).until(ExpectedConditions
						.visibilityOfElementLocated(concentration_xpath));
				columnfromGridSelectionPopupWebElement.isSelected();
				return true;

			} catch (Exception e) {
				return false;
			}}
		
		//======================06.12.2018
		
		
		public boolean columnCheckedfromGridSelectionPopup() {
			try {
				WebElement CheckedcolumnfromgridselectionbeaddedinsummaryrecivablesafterexistingcolumnswebElement = new WebDriverWait(driver,
						10).until(ExpectedConditions
						.visibilityOfElementLocated(checkedconcentrationcolumn_xpath));
				CheckedcolumnfromgridselectionbeaddedinsummaryrecivablesafterexistingcolumnswebElement.isDisplayed();
				return true;

			} catch (Exception e) {
				return false;
			}}
		//===================
		
		
		
		public boolean editDebtorParametersClicked() {
			try {
				WebElement debtorwebElement = new WebDriverWait(driver,
						10).until(ExpectedConditions
						.visibilityOfElementLocated(gridSelection_xpath));
				debtorwebElement.click();
				return true;

			} catch (Exception e) {
				return false;
			}}
		
		//==========================
		
		public boolean gridClicked() {
			try {
				WebElement gridwebElement = new WebDriverWait(driver,
						10).until(ExpectedConditions
						.visibilityOfElementLocated(gridSelection_xpath));
				gridwebElement.click();
				return true;

			} catch (Exception e) {
				return false;
			}}
		
		
		public boolean checkedSelectedColumn() {
			try {
				WebElement checkedselectedcolumnwebelement = new WebDriverWait(driver,
						10).until(ExpectedConditions
						.visibilityOfElementLocated(checkedconcentrationcolumn_xpath));
				checkedselectedcolumnwebelement.isSelected();
				return true;

			} catch (Exception e) {
				return false;
			}}
		
		public boolean saveButtonClicked() {
			try {
				WebElement savebuttonwebelement = new WebDriverWait(driver,
						10).until(ExpectedConditions
						.visibilityOfElementLocated(savebutton_xpath));
				savebuttonwebelement.click();
				return true;

			} catch (Exception e) {
				return false;
			}}
		
		public boolean ageClicked() {
			try {
				WebElement agewebelement = new WebDriverWait(driver,
						10).until(ExpectedConditions
						.visibilityOfElementLocated(age_xpath));
				agewebelement.click();
				return true;

			} catch (Exception e) {
				return false;
			}}
		
		
		public boolean viewchildrenClicked() {
			try {
				WebElement viewchildrenwebelement = new WebDriverWait(driver,
						10).until(ExpectedConditions
						.visibilityOfElementLocated(viewchildren_xpath));
				viewchildrenwebelement.click();
				return true;

			} catch (Exception e) {
				return false;
			}}
		
		//===========
		public boolean ExportClicked() {
			try {
				WebElement exportwebelement = new WebDriverWait(driver,
						10).until(ExpectedConditions
						.visibilityOfElementLocated(export_xpath));
				exportwebelement.click();
				return true;

			} catch (Exception e) {
				return false;
			}}
		//===============
		
		
		public boolean concentrationCheckedColumn() {
			try {
				WebElement concentrationcheckboxwebelement = new WebDriverWait(driver,
						10).until(ExpectedConditions
						.visibilityOfElementLocated(concentrationcheckbox_xpath));
				concentrationcheckboxwebelement.isSelected();
				return true;

			} catch (Exception e) {
				return false;
			}}
		
		//===========================07.12.2018
		
		public boolean gridcolumnClick() {
			try {
				WebElement gridcolumnwebelement = new WebDriverWait(driver,
						10).until(ExpectedConditions
						.visibilityOfElementLocated(gridcolimn1_xpath));
				gridcolumnwebelement.click();
				return true;

			} catch (Exception e) {
				return false;
			}}
		
		
		public boolean checkedCreditlimit() {
			try {
				WebElement creditlimitcheckboxwebelement = new WebDriverWait(driver,
						10).until(ExpectedConditions
						.visibilityOfElementLocated(creditlimitchecked_xpath));
				creditlimitcheckboxwebelement.isSelected();
				return true;

			} catch (Exception e) {
				return false;
			}}
		
		//======================(26)
		
		public boolean creditLimitDisplayed() {
			try {
				WebElement creditlimitcheckbox1webelement = new WebDriverWait(driver,
						10).until(ExpectedConditions
						.visibilityOfElementLocated(creditlimit_xpath));
				creditlimitcheckbox1webelement.isDisplayed();
				return true;

			} catch (Exception e) {
				return false;
			}}
		
		
		public boolean Test1Displayed() {
			try {
				WebElement test1webelement = new WebDriverWait(driver,
						10).until(ExpectedConditions
						.visibilityOfElementLocated(Test1_xpath));
				test1webelement.isDisplayed();
				return true;

			} catch (Exception e) {
				return false;
			}}
		
		public boolean createdDate1Displayed() {
			try {
				WebElement Createddate1webelement = new WebDriverWait(driver,
						10).until(ExpectedConditions
						.visibilityOfElementLocated(createddate_xpath));
				Createddate1webelement.isDisplayed();
				return true;

			} catch (Exception e) {
				return false;
			}}
		
		
		public boolean saveButtonClick() {
			try {
				WebElement savewebelement = new WebDriverWait(driver,
						10).until(ExpectedConditions
						.visibilityOfElementLocated(createddate_xpath));
				savewebelement.isDisplayed();
				return true;

			} catch (Exception e) {
				return false;
			}}
		//======================
		
		public boolean logoutClick() {
			try {
				WebElement logoutwebelement = new WebDriverWait(driver,
						10).until(ExpectedConditions
						.visibilityOfElementLocated(logout_xpath));
				logoutwebelement.click();
				return true;

			} catch (Exception e) {
				return false;
			}}
		
		//========================================10.12.2018
		

		public boolean checkedDuctible() {
			try {
				WebElement deductiblecheckbox1webelement = new WebDriverWait(driver,
						10).until(ExpectedConditions
						.visibilityOfElementLocated(deductiblechecked_xpath));
				deductiblecheckbox1webelement.isDisplayed();
				return true;

			} catch (Exception e) {
				return false;
			}}
		//-----------
		
		
		public boolean uncheckedConcentration() {
			try {
				WebElement uncheckboxconcentrationwebelement = new WebDriverWait(driver,
						10).until(ExpectedConditions
						.visibilityOfElementLocated(concentration_xpath));
				uncheckboxconcentrationwebelement.isDisplayed();
				return true;

			} catch (Exception e) {
				return false;
			}}
		//--------------
		
		
		public boolean ConcentrationClick() {
			try {
				WebElement concentrationwebelement = new WebDriverWait(driver,
						10).until(ExpectedConditions
						.visibilityOfElementLocated(uncheckconcentration_xpath));
				concentrationwebelement.click();
				return true;

			} catch (Exception e) {
				return false;
			}}
		
		//-----------
		public boolean editDebtorParametersClick() {
			try {
				WebElement debtorwebelement = new WebDriverWait(driver,
						10).until(ExpectedConditions
						.visibilityOfElementLocated(debtorSelection_xpath));
				debtorwebelement .click();
				return true;

			} catch (Exception e) {
				return false;
			}}
		
		//-----------------
		
		public boolean summaryReceivableClick() {
			try {
				WebElement summaryreceivablewebelement = new WebDriverWait(driver,
						10).until(ExpectedConditions
						.visibilityOfElementLocated(summaryrecivablebackbutton_xpath));
				summaryreceivablewebelement.click();
				return true;

			} catch (Exception e) {
				return false;
			}}
		
		
		
//anusha
		public boolean SerachForAccountNo(String AccountNo) {
			try {
				WebElement firstAccountNoWebElement = new WebDriverWait(driver, 10)
						.until(ExpectedConditions
								.visibilityOfElementLocated(SearchFieldInAccountno_xpath));
				firstAccountNoWebElement.click();
				firstAccountNoWebElement.sendKeys(AccountNo);
				Thread.sleep(1000);
				
				return true;

			} catch (Exception e) {
				return false;
			}
		}
		
		
		
		
		//summary Sec
		public boolean totalFutureAmountValidationSecondBBCG(String expected) {
			try {

				WebElement totalFutureAmountWebElement = new WebDriverWait(driver,
						10)
						.until(ExpectedConditions
								.visibilityOfElementLocated(totalFutureAmountG_xpath));

				String actual = totalFutureAmountWebElement.getText();
				if (actual.equals(expected))
					return true;
				else
					return false;

			} catch (Exception e) {
				return false;
			}
		}
		
		
		
		public boolean totalCurrentAmountValidationSecondBBCG(String expected) {
			try {

				WebElement totalCurrentAmountWebElement = new WebDriverWait(driver,
						10)
						.until(ExpectedConditions
								.visibilityOfElementLocated(totalCurrentAmountG_xpath));

				String actual = totalCurrentAmountWebElement.getText();
				if (actual.equals(expected))
					return true;
				else
					return false;

			} catch (Exception e) {
				return false;
			}
		}
		
		
		public boolean totalOver30AmountValidationSecondBBCG(String expected) {
			try {

				WebElement totalOver30AmountWebElement = new WebDriverWait(driver,
						10)
						.until(ExpectedConditions
								.visibilityOfElementLocated(totalOver30AmountG_xpath));

				String actual = totalOver30AmountWebElement.getText();
				if (actual.equals(expected))
					return true;
				else
					return false;

			} catch (Exception e) {
				return false;
			}
		}
		
		
		public boolean totalOver60AmountValidationSecondBBCG(String expected) {
			try {

				WebElement totalOver60AmountWebElement = new WebDriverWait(driver,
						10)
						.until(ExpectedConditions
								.visibilityOfElementLocated(totalOver60AmountG_xpath));

				String actual = totalOver60AmountWebElement.getText();
				if (actual.equals(expected))
					return true;
				else
					return false;

			} catch (Exception e) {
				return false;
			}
		}
		
		public boolean totalOver90AmountValidationSecondBBCG(String expected) {
			try {

				WebElement totalOver90AmountValidationWebElement = new WebDriverWait(
						driver, 10)
						.until(ExpectedConditions
								.visibilityOfElementLocated(totalOver90AmountG_xpath));

				String actual = totalOver90AmountValidationWebElement.getText();
				if (actual.equals(expected))
					return true;
				else
					return false;

			} catch (Exception e) {
				return false;
			}
		}
		
		
		public boolean totalOver120AmountValidationSecondBBCG(String expected) {
			try {

				WebElement totalOver120AmountValidationWebElement = new WebDriverWait(
						driver, 10)
						.until(ExpectedConditions
								.visibilityOfElementLocated(totalOver120AmountG_xpath));

				String actual = totalOver120AmountValidationWebElement.getText();
				if (actual.equals(expected))
					return true;
				else
					return false;

			} catch (Exception e) {
				return false;
			}
		}

		public boolean totalBalanceAmountValidationSecondBBCG(String expected) {
			try {
				WebElement totalBalanceAmountWebElement = new WebDriverWait(driver,
						10)
						.until(ExpectedConditions
								.visibilityOfElementLocated(totalBalanceAmountG_xpath));

				String actual = totalBalanceAmountWebElement.getText();
				if (actual.equals(expected))
					return true;
				else
					return false;

			} catch (Exception e) {
				return false;
			}
		}
}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	

	
	

