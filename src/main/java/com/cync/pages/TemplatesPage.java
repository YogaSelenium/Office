package com.cync.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.SkipException;

import com.cync.base.BasePage;

public class TemplatesPage  extends BasePage
{

	private final By menuItem_xpath = By.id("hamburger_m");
	private final By administation_xpath =By.xpath("//span[text()='Administration']");
	private final By templateHeader=By.xpath("//h3[contains(text(),'Templates')]");
	private final By textRadioButton_xpath=By.xpath("(//input[@type='radio'])[2]");
	private final By emailRadioButton_xpath=By.xpath("(//input[@type='radio'])[1]");
	private final By pleaseSelectInfoLabel_xpath=By.xpath("(//div[@class='col-md-12 col-sm-12 col-xs-12'])[1]");

	private final By productTypeDropdown_xpath=By.xpath("//select[@formcontrolname='productTypeForEmailTemplate']");
	private final By productTypeDropdown2_xpath=By.xpath("//select[@formcontrolname='productTypeForTextTemplate']");
	
	private final By emailPurposeLabel_xpath=By.xpath("//h5[text()='Email Purpose']");
	private final By emailPurposeSearch_xpath=By.xpath("(//input[@placeholder='Search Purpose'])[1]");
	private final By emailPurposeSearchTrue_xpath=By.xpath("(//span[text()='Email for OTP'])[1]");
	private final By ProductTypeSearchTrueValue_xpath=By.xpath("(//option[text()='ABL'])[2]");
	private final By productTypeGeneralSelect_xpath=By.xpath("(//option[text()='General'])[1]");

	private final By UnlockInstructions1_xpath=By.xpath("(//span[text()='Unlock Instructions'])[1]");
	private final By UnlockAttachment1_xpath=By.xpath("(//span[text()='Unlock Attachment'])[1]");
	private final By mailNewcustomer_xpath=By.xpath("//span[text()='Mail new customer list to Manager']");
	private final By resetpasswordInstructions_xpath=By.xpath("//span[text()='Reset password instructions']");
	private final By assignPortfolioManager_xpath=By.xpath("//span[text()='Assign Portfolio Manager']");
	private final By reactivateUserAccount_xpath=By.xpath("//span[text()='Reactivate user account']");
	private final By confirmationInstructions_xpath=By.xpath("//span[text()='Confirmation Instructions']");
	
	//Ashfaq
	private final By UnlockInstructions2_xpath=By.xpath("//span[text()='Unlock Instructions']");
	/*private final By UnlockInstructions2_xpath=By.xpath("(//span[text()='Unlock Instructions'])[2]");*/
	
	private final By UnlockAttachment2_xpath=By.xpath("//span[text()='Unlock Attachment']");
	/*private final By UnlockAttachment2_xpath=By.xpath("(//span[text()='Unlock Attachment'])[2]");*/
	//
	
	private final By emailforOTP_xpath=By.xpath("//span[text()='Email for OTP']");

	private final By productTypeAbl_xpath=By.xpath("(//option[text()='ABL'])[2]");
	private final By approvalBBCNotification_xpath=By.xpath("//span[text()='Approval BBC notification']");
	private final By MailCollateralChange_xpath=By.xpath("//span[text()='Mail collateral change in value']");
	private final By MailFundingRequest_xpath=By.xpath("//span[text()='Mail funding request']");
	private final By mailAfterFund_xpath=By.xpath("//span[text()='Mail after Fund']");
	private final By mailBBCUnreleased_xpath=By.xpath("//span[text()='Mail BBC unreleased']");
	private final By monarchUploadNotification_xpath=By.xpath("//span[text()='Monarch upload notification']");
	private final By signAndApproveBBC_xpath=By.xpath("//span[text()='Sign and approve BBC']");
	private final By rejectBBCReview_xpath=By.xpath("//span[text()='Reject BBC review']");
	private final By mailClientDeActivation_xpath=By.xpath("//span[text()='Mail Client De-Activation']");
	private final By letterofCreditExpiryNotification_xpath=By.xpath("//span[text()='Letter of Credit Expiry Notification']");
	private final By addendumPriorNotification_xpath=By.xpath("//span[text()='Addendum prior notification']");
	private final By skipBbc_xpath=By.xpath("//span[text()='Skip BBC']");
	private final By mailNewAccounts_xpath=By.xpath("//span[text()='Mail new Accounts']");
	private final By monarchMapping_xpath=By.xpath("//span[text()='Monarch mapping support notification']");
	private final By interestStatementtoClient_xpath=By.xpath("//span[text()='Interest statement to client']");
	private final By mailClientActivation_xpath=By.xpath("//span[text()='Mail Client Activation']");
	private final By mailBalanceLimit_xpath=By.xpath("//span[text()='Mail Balance Limit']");
	private final By downloadAllFiles_xpath=By.xpath("//span[text()='Download All Files']");

	
	private final By productTypeFactoring_xpath=By.xpath("(//option[text()='Factoring'])[1]");
	private final By mailNewAccountsFactoring1_xpath=By.xpath("(//span[text()='Mail new Accounts'])[1]");
	private final By recourseInvoiceNotification_xpath=By.xpath("//span[text()='Recourse invoice notification']");
	private final By verificationNotificationtoClient_xpath=By.xpath("//span[text()='Verification notification to Client']");
	private final By senderFundedEmailtoClient_xpath=By.xpath("//span[text()='Sender funded email to client']");
	private final By verificationConfirmationEmailtoDebtor_xpath=By.xpath("//span[text()='Verification confirmation email to debtor']");
	private final By verificationConfirmationEmailtoClient_xpath=By.xpath("//span[text()='Verification confirmation email to client']");
	private final By verificationConfirmationEmailtoPM_xpath=By.xpath("//span[text()='Verification confirmation email to pm']");
	private final By verificationEmailtoDebtor_xpath=By.xpath("//span[text()='Verification email to debtor']");
	
	//Ashfaq
	
	private final By mailNewAccountsFactoring2_xpath=By.xpath("//span[text()='Mail new Accounts']");
	/*private final By mailNewAccountsFactoring2_xpath=By.xpath("(//span[text()='Mail new Accounts'])[2]");*/
	
    //
	
	private final By unlockInstructionsName_xpath=By.xpath("//span[text()='Name :']");
	private final By unlockInstructionsCc_xpath=By.xpath("//span[text()='CC :']");
	private final By unlockInstructionsSubject_xpath=By.xpath("//span[text()='Subject :']");
	private final By edit_xpath=By.id("Edit");
	private final By save_xpath=By.id("action_save");
	private final By saveMessage_xpath=By.id("cync_notifications_msg");
	private final By cancel_xpath=By.id("action_back");

	

	private final By pleaseSelectInfoLabelTextTemplate_xpath=By.xpath("(//div[@class='col-md-12 col-sm-12 col-xs-12'])[2]");
	private final By productTypeDropdownTextTemplate_xpath=By.xpath("//select[@formcontrolname='productTypeForTextTemplate']");
	private final By textTemplatesList_xpath=By.xpath("//span[text()='Text Message for OTP']");
	private final By productTypeFactoringTextTemplate_xpath=By.xpath("(//option[text()='Factoring'])[2]");
	private final By productTypeGeneralTextTemplate_xpath=By.xpath("(//option[text()='General'])[2]");
	private final By productTypeAblTextTemplate_xpath=By.xpath("(//option[text()='ABL'])[3]");
	private final By textTemplatesListAblCollateralChange_xpath=By.xpath("//span[text()='Collateral change in value']");
	private final By textTemplatesListAblBalanceLimit_xpath=By.xpath("//span[text()='Balance Limit']");
	private final By textTemplatesListAblLetterofCredit_xpath=By.xpath("//span[text()='Letter of Credit Expiry Notification']");
	private final By textTemplatesAddendumPrior_xpath=By.xpath("//span[text()='Addendum prior notification']");
	private final By textTemplatesAddendumPost_xpath=By.xpath("//span[text()='Addendum post notification']");
	private final By textTemplatesApprovalBBC_xpath=By.xpath("//span[text()='Approval BBC notification']");
	
	private final By textTemplatesMessageforNewAccounts_xpath=By.xpath("//span[text()='Message for New Accounts']");
	private final By textTemplatesRecourseInvoiceNotification_xpath=By.xpath("//span[text()='Recourse invoice notification']");
	private final By productTypeAblFromLabel_xpath=By.xpath("//span[text()='From :']");
	private final By productTypeAblPlaceHolderLabel_xpath=By.xpath("(//a[@class='accordion-toggle collapsed'])[2]");
	private final By productTypeAblEditLabel_xpath= By.id("Edit");;
	private final By productTypeAblSaveLabel_xpath= By.id("action_save");;
	private final By productTypeSuccessMsgLabel_xpath= By.id("cync_notifications_msg");;
	private final By productTypeAblCancelLabel_xpath= By.id("action_back");;

	private final By searchPurpose_xpath=By.xpath("(//input[@placeholder='Search Purpose'])[2]");
	private final By searchPurposeTrueValue_xpath=By.xpath("(//span[text()='Text Message for OTP'])[1]");

	private final By emailTemplateLabelUI_xpath=By.xpath("//label[text()='Email Template']");
	private final By textTemplateLabelUI_xpath=By.xpath("//label[text()='Text Template']");
	private final By templateEmailPurposeLabelUI_xpath=By.xpath("//h5[text()='Email Purpose']");
	private final By templateProductTypesLabelUI_xpath=By.xpath("(//label[text()='Product Types'])[1]");
	private final By emailTemplateRadioBtn_xpath=By.xpath("(//input[@type='radio'])[1]");

	
	
	

	public TemplatesPage(WebDriver driver)
	{
		super(driver);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(!driver.findElement(templateHeader).getText().trim().equals("Templates")){
			throw new SkipException("Templates couldn't open.");
		}// TODO Auto-generated constructor stub
	}

	
	public boolean ClickOnTextTemplateRadioBtn()
	{
	try{

		WebElement radioBtnTextWebEelement=new WebDriverWait(driver,100)
		.until(ExpectedConditions.visibilityOfElementLocated(textRadioButton_xpath));
		Thread.sleep(5000);
		radioBtnTextWebEelement.click();
		Thread.sleep(2000);
return true;
	}
	catch(Exception ex){
		return false;
	}

	}
	
	
	public boolean ClickOnEmailTemplateRadioBtn()
	{
	try{
	
		WebElement radioBtnEmailWebEelement=new WebDriverWait(driver,100)
		.until(ExpectedConditions.visibilityOfElementLocated(emailRadioButton_xpath));
		Thread.sleep(5000);
		radioBtnEmailWebEelement.click();
		Thread.sleep(2000);
		
return true;
	}
	catch(Exception ex){
		return false;
	}

	}
	
	public boolean TemplateHeaderLabel(){
		try {
			WebElement TemplateHeaderWebE=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(templateHeader));
			TemplateHeaderWebE.isDisplayed();
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
	
	public boolean TemplatePleaseSelectInfoLabel(){
		try {
			WebElement TemplatePleaseSelectInfoWebE=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(pleaseSelectInfoLabel_xpath));
			TemplatePleaseSelectInfoWebE.isDisplayed();
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
	
	
	public boolean EmailTemplateValidationAndSearchFunction()
	{
	try{
	
		WebElement emailTemplateProductTypeWebEelement=new WebDriverWait(driver,100)
		.until(ExpectedConditions.visibilityOfElementLocated(productTypeDropdown_xpath));
		emailTemplateProductTypeWebEelement.click();
		Thread.sleep(2000);
		
       return true;
	}
	catch(Exception ex){
		return false;
	}

	}	
	
	public String addSearchPurposeTextBox(String searchData)
	{
	try{
		WebElement searchTextBoxWebEelement=new WebDriverWait(driver,200)
		.until(ExpectedConditions.visibilityOfElementLocated(emailPurposeSearch_xpath));
		searchTextBoxWebEelement.clear();
		searchTextBoxWebEelement.sendKeys(searchData);
		 Thread.sleep(3000);

	}
	catch(Exception ex){

	}
	return searchData;

	}
	
	public boolean EmailTemplateSearchFunction()
	{
	try{
	
		WebElement emailTemplateProductTypeWebEelement=new WebDriverWait(driver,100)
		.until(ExpectedConditions.visibilityOfElementLocated(emailPurposeSearchTrue_xpath));
		emailTemplateProductTypeWebEelement.isDisplayed();
		Thread.sleep(2000);
		
return true;
	}
	catch(Exception ex){
		return false;
	}

	}	
	
	public String productTypeDroptBox(String searchData)
	{
	try{
		WebElement searchTextBoxWebEelement=new WebDriverWait(driver,200)
		.until(ExpectedConditions.visibilityOfElementLocated(productTypeDropdown_xpath));
		searchTextBoxWebEelement.sendKeys(searchData);
		 Thread.sleep(3000);

	}
	catch(Exception ex){

	}
	return searchData;

	}
	
	
	
	
	
	public boolean productTypeDropdoenClick(){
		try {		
			WebElement UserSetttingsSearchRoleTrueWebE=new WebDriverWait(driver,10)
			.until(ExpectedConditions.visibilityOfElementLocated(ProductTypeSearchTrueValue_xpath));
			Thread.sleep(2000);
			UserSetttingsSearchRoleTrueWebE.click();
		    return true;
	}
	catch(Exception ex){
		return false;
	}

	}
	
	
	
	public String productTypeDroptBox2(String searchData)
	{
	try{
		WebElement searchTextBoxWebEelement=new WebDriverWait(driver,200)
		.until(ExpectedConditions.visibilityOfElementLocated(productTypeDropdown_xpath));
		
		Select sel=new Select(searchTextBoxWebEelement);
		
		List<WebElement> list=sel.getOptions();
		
		for(WebElement e:list){
			String str=e.getText().trim();
			
			if(str.equals(searchData)){
				sel.selectByVisibleText(str);
				return str;
			}
		}

	}
	catch(Exception ex){
		return null;
	}
	return searchData;

	}
	
	
	public String productTypeDroptBox3(String searchData)
	{
	try{
		WebElement searchTextBoxWebEelement=new WebDriverWait(driver,200)
		.until(ExpectedConditions.visibilityOfElementLocated(productTypeDropdown2_xpath));
		
		Select sel=new Select(searchTextBoxWebEelement);
		
		List<WebElement> list=sel.getOptions();
		
		for(WebElement e:list){
			String str=e.getText().trim();
			
			if(str.equals(searchData)){
				sel.selectByVisibleText(str);
				return str;
			}
		}

	}
	catch(Exception ex){
		return null;
	}
	return searchData;

	}
	
	
	
	public boolean  verifyProductDropdownValuesEmailTemplate(){
		 try {
		  String[] exp = {"General","ABL","Factoring"};
		  
		  WebElement dropdown = driver.findElement(productTypeDropdown_xpath);  
		  dropdown.click();
		  Thread.sleep(3000);
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
		}

	
	public boolean EmailTemplateProductTypesGeneralEmailPurposeVakueValidation()
	{
	try{
		
		WebElement emailTemplateEmailPurposeLabelWebEelement=new WebDriverWait(driver,100)
		.until(ExpectedConditions.visibilityOfElementLocated(emailPurposeLabel_xpath));
		emailTemplateEmailPurposeLabelWebEelement.isDisplayed();
		Thread.sleep(2000);

		WebElement emailTemplateEmailPurposeUnlockInstructions1LabelWebEelement=new WebDriverWait(driver,100)
		.until(ExpectedConditions.visibilityOfElementLocated(UnlockInstructions1_xpath));
		emailTemplateEmailPurposeUnlockInstructions1LabelWebEelement.isDisplayed();
		Thread.sleep(1000);
		
		WebElement emailTemplateEmailPurposeUnlockAttachment1LabelWebEelement=new WebDriverWait(driver,100)
		.until(ExpectedConditions.visibilityOfElementLocated(UnlockAttachment1_xpath));
		emailTemplateEmailPurposeUnlockAttachment1LabelWebEelement.isDisplayed();
		Thread.sleep(1000);
		
		WebElement emailTemplateEmailPurposeMailnewcustomerlisttoManagerLabelWebEelement=new WebDriverWait(driver,100)
		.until(ExpectedConditions.visibilityOfElementLocated(mailNewcustomer_xpath));
		emailTemplateEmailPurposeMailnewcustomerlisttoManagerLabelWebEelement.isDisplayed();
		Thread.sleep(1000);
		
		WebElement emailTemplateEmailPurposeResetpasswordInstructionsLabelWebEelement=new WebDriverWait(driver,100)
		.until(ExpectedConditions.visibilityOfElementLocated(resetpasswordInstructions_xpath));
		emailTemplateEmailPurposeResetpasswordInstructionsLabelWebEelement.isDisplayed();
		Thread.sleep(1000);
		
		WebElement emailTemplateEmailPurposeAssignPortfolioManagerLabelWebEelement=new WebDriverWait(driver,100)
		.until(ExpectedConditions.visibilityOfElementLocated(assignPortfolioManager_xpath));
		emailTemplateEmailPurposeAssignPortfolioManagerLabelWebEelement.isDisplayed();
		Thread.sleep(1000);
		
		WebElement emailTemplateEmailPurposeReactivateUserAccountLabelWebEelement=new WebDriverWait(driver,100)
		.until(ExpectedConditions.visibilityOfElementLocated(reactivateUserAccount_xpath));
		emailTemplateEmailPurposeReactivateUserAccountLabelWebEelement.isDisplayed();
		Thread.sleep(1000);
		
		WebElement emailTemplateEmailPurposeConfirmationInstructionsLabelWebEelement=new WebDriverWait(driver,100)
		.until(ExpectedConditions.visibilityOfElementLocated(confirmationInstructions_xpath));
		emailTemplateEmailPurposeConfirmationInstructionsLabelWebEelement.isDisplayed();
		Thread.sleep(1000);
		
		WebElement emailTemplateEmailPurposeUnlockInstructions2LabelWebEelement=new WebDriverWait(driver,100)
		.until(ExpectedConditions.visibilityOfElementLocated(UnlockInstructions2_xpath));
		emailTemplateEmailPurposeUnlockInstructions2LabelWebEelement.isDisplayed();
		Thread.sleep(1000);
		
		WebElement emailTemplateEmailPurposeUnlockAttachment2LabelWebEelement=new WebDriverWait(driver,100)
		.until(ExpectedConditions.visibilityOfElementLocated(UnlockAttachment2_xpath));
		emailTemplateEmailPurposeUnlockAttachment2LabelWebEelement.isDisplayed();
		Thread.sleep(1000);
		
		WebElement emailTemplateEmailPurposeEmailforOTPLabelWebEelement=new WebDriverWait(driver,100)
		.until(ExpectedConditions.visibilityOfElementLocated(emailforOTP_xpath));
		emailTemplateEmailPurposeEmailforOTPLabelWebEelement.isDisplayed();
		Thread.sleep(1000);
		
		return true;
	}
	catch(Exception ex){
		return false;
	}

	}
	
	public boolean EmailTemplateProductTypesAblClick()
	{
	try{		
		WebElement emailTemplateProductTypesSelectAblWebEelement=new WebDriverWait(driver,100)
		.until(ExpectedConditions.visibilityOfElementLocated(productTypeAbl_xpath));
		Thread.sleep(2000);
		emailTemplateProductTypesSelectAblWebEelement.click();
		Thread.sleep(5000);
		
		return true;
	}
	catch(Exception ex){
		return false;
	}

	}
	
	
	public boolean EmailTemplateProductTypesAblEmailPurposeValuesValidation()
	{
	try{				
		WebElement emailTemplateApprovalBBCNotificationLabelWebEelement=new WebDriverWait(driver,100)
		.until(ExpectedConditions.visibilityOfElementLocated(approvalBBCNotification_xpath));
		emailTemplateApprovalBBCNotificationLabelWebEelement.isDisplayed();
		Thread.sleep(2000);

		WebElement emailTemplateEmailPurposeMailCollateralChangeLabelWebEelement=new WebDriverWait(driver,100)
		.until(ExpectedConditions.visibilityOfElementLocated(MailCollateralChange_xpath));
		emailTemplateEmailPurposeMailCollateralChangeLabelWebEelement.isDisplayed();
		Thread.sleep(1000);
			
		WebElement emailTemplateEmailPurposeMailfundingRequestLabelWebEelement=new WebDriverWait(driver,100)
		.until(ExpectedConditions.visibilityOfElementLocated(MailFundingRequest_xpath));
		emailTemplateEmailPurposeMailfundingRequestLabelWebEelement.isDisplayed();
		Thread.sleep(1000);
		
		WebElement emailTemplateEmailPurposeMailafterFundLabelWebEelement=new WebDriverWait(driver,100)
		.until(ExpectedConditions.visibilityOfElementLocated(mailAfterFund_xpath));
		emailTemplateEmailPurposeMailafterFundLabelWebEelement.isDisplayed();
		Thread.sleep(1000);
		
		WebElement emailTemplateEmailPurposeMailBBCUnreleasedLabelWebEelement=new WebDriverWait(driver,100)
		.until(ExpectedConditions.visibilityOfElementLocated(mailBBCUnreleased_xpath));
		emailTemplateEmailPurposeMailBBCUnreleasedLabelWebEelement.isDisplayed();
		Thread.sleep(1000);
		
		WebElement emailTemplateEmailPurposeMonarchUploadNotificationLabelWebEelement=new WebDriverWait(driver,100)
		.until(ExpectedConditions.visibilityOfElementLocated(monarchUploadNotification_xpath));
		emailTemplateEmailPurposeMonarchUploadNotificationLabelWebEelement.isDisplayed();
		Thread.sleep(1000);
		
		WebElement emailTemplateEmailPurposeSignandApproveBBCLabelWebEelement=new WebDriverWait(driver,100)
		.until(ExpectedConditions.visibilityOfElementLocated(signAndApproveBBC_xpath));
		emailTemplateEmailPurposeSignandApproveBBCLabelWebEelement.isDisplayed();
		Thread.sleep(1000);

		WebElement emailTemplateEmailPurposeRejectBBCReviewLabelWebEelement=new WebDriverWait(driver,100)
		.until(ExpectedConditions.visibilityOfElementLocated(rejectBBCReview_xpath));
		emailTemplateEmailPurposeRejectBBCReviewLabelWebEelement.isDisplayed();
		Thread.sleep(1000);
		
		WebElement emailTemplateEmailPurposeMailClientDeActivationLabelWebEelement=new WebDriverWait(driver,100)
		.until(ExpectedConditions.visibilityOfElementLocated(mailClientDeActivation_xpath));
		emailTemplateEmailPurposeMailClientDeActivationLabelWebEelement.isDisplayed();
		Thread.sleep(1000);
		
		WebElement emailTemplateEmailPurposeLetterofCreditWebEelement=new WebDriverWait(driver,100)
		.until(ExpectedConditions.visibilityOfElementLocated(letterofCreditExpiryNotification_xpath));
		emailTemplateEmailPurposeLetterofCreditWebEelement.isDisplayed();
		Thread.sleep(1000);
		
		WebElement emailTemplateEmailPurposeAddendumpriorNotificationLabelWebEelement=new WebDriverWait(driver,100)
		.until(ExpectedConditions.visibilityOfElementLocated(addendumPriorNotification_xpath));
		emailTemplateEmailPurposeAddendumpriorNotificationLabelWebEelement.isDisplayed();
		Thread.sleep(1000);
		
		WebElement emailTemplateEmailPurposeSkipBbcLabelWebEelement=new WebDriverWait(driver,100)
		.until(ExpectedConditions.visibilityOfElementLocated(skipBbc_xpath));
		emailTemplateEmailPurposeSkipBbcLabelWebEelement.isDisplayed();
		Thread.sleep(1000);
		
		WebElement emailTemplateEmailPurposeMailnewAccountsLabelWebEelement=new WebDriverWait(driver,100)
		.until(ExpectedConditions.visibilityOfElementLocated(mailNewAccounts_xpath));
		emailTemplateEmailPurposeMailnewAccountsLabelWebEelement.isDisplayed();
		Thread.sleep(1000);
		
		WebElement emailTemplateEmailPurposeMonarchMappingLabelWebEelement=new WebDriverWait(driver,100)
		.until(ExpectedConditions.visibilityOfElementLocated(monarchMapping_xpath));
		emailTemplateEmailPurposeMonarchMappingLabelWebEelement.isDisplayed();
		Thread.sleep(1000);
		
		WebElement emailTemplateEmailPurposeInterestLabelWebEelement=new WebDriverWait(driver,100)
		.until(ExpectedConditions.visibilityOfElementLocated(interestStatementtoClient_xpath));
		emailTemplateEmailPurposeInterestLabelWebEelement.isDisplayed();
		Thread.sleep(1000);
		
		WebElement emailTemplateEmailPurposeMailClientActivationLabelWebEelement=new WebDriverWait(driver,100)
		.until(ExpectedConditions.visibilityOfElementLocated(mailClientActivation_xpath));
		emailTemplateEmailPurposeMailClientActivationLabelWebEelement.isDisplayed();
		Thread.sleep(1000);
		
		WebElement emailTemplateEmailPurposeMailBalanceLimitLabelWebEelement=new WebDriverWait(driver,100)
		.until(ExpectedConditions.visibilityOfElementLocated(mailBalanceLimit_xpath));
		emailTemplateEmailPurposeMailBalanceLimitLabelWebEelement.isDisplayed();
		Thread.sleep(1000);
		
		WebElement emailTemplateEmailPurposeDownloadAllFilesLabelWebEelement=new WebDriverWait(driver,100)
		.until(ExpectedConditions.visibilityOfElementLocated(downloadAllFiles_xpath));
		emailTemplateEmailPurposeDownloadAllFilesLabelWebEelement.isDisplayed();
		Thread.sleep(1000);
		
		return true;
	}
	catch(Exception ex){
		return false;
	}

	}
	
	
	public boolean EmailTemplateProductTypesFacoringClick()
	{
	try{		
		WebElement emailTemplateProductTypesSelectWebEelement=new WebDriverWait(driver,100)
		.until(ExpectedConditions.visibilityOfElementLocated(productTypeFactoring_xpath));
		Thread.sleep(2000);
		emailTemplateProductTypesSelectWebEelement.click();
		Thread.sleep(5000);
		
		return true;
	}
	catch(Exception ex){
		return false;
	}

	}
	
	public boolean EmailTemplateProductTypesFactoringEmailPurposeValuesValidation()
	{
	try{
	
		WebElement emailTemplateMailnewAccountsLabelWebEelement=new WebDriverWait(driver,100)
		.until(ExpectedConditions.visibilityOfElementLocated(mailNewAccountsFactoring1_xpath));
		emailTemplateMailnewAccountsLabelWebEelement.isDisplayed();
		Thread.sleep(2000);
		
		WebElement emailTemplateEmailPurposeRecourseInvoiceLabelWebEelement=new WebDriverWait(driver,100)
		.until(ExpectedConditions.visibilityOfElementLocated(recourseInvoiceNotification_xpath));
		emailTemplateEmailPurposeRecourseInvoiceLabelWebEelement.isDisplayed();
		Thread.sleep(1000);
			
		WebElement emailTemplateEmailPurposeVerificationNotificationtoClientLabelWebEelement=new WebDriverWait(driver,100)
		.until(ExpectedConditions.visibilityOfElementLocated(verificationNotificationtoClient_xpath));
		emailTemplateEmailPurposeVerificationNotificationtoClientLabelWebEelement.isDisplayed();
		Thread.sleep(1000);
		
		WebElement emailTemplateEmailPurposeSenderFundedEmailtoClientLabelWebEelement=new WebDriverWait(driver,100)
		.until(ExpectedConditions.visibilityOfElementLocated(senderFundedEmailtoClient_xpath));
		emailTemplateEmailPurposeSenderFundedEmailtoClientLabelWebEelement.isDisplayed();
		Thread.sleep(1000);
		
		WebElement emailTemplateEmailPurposeMailClientActivationLabelWebEelement=new WebDriverWait(driver,100)
		.until(ExpectedConditions.visibilityOfElementLocated(mailClientActivation_xpath));
		emailTemplateEmailPurposeMailClientActivationLabelWebEelement.isDisplayed();
		Thread.sleep(1000);
		
		WebElement emailTemplateEmailPurposeVerificationConfirmationEmailtoDebtorLabelWebEelement=new WebDriverWait(driver,100)
		.until(ExpectedConditions.visibilityOfElementLocated(verificationConfirmationEmailtoDebtor_xpath));
		emailTemplateEmailPurposeVerificationConfirmationEmailtoDebtorLabelWebEelement.isDisplayed();
		Thread.sleep(1000);
		
		WebElement emailTemplateEmailPurposeVerificationConfirmationEmailtoClientLabelWebEelement=new WebDriverWait(driver,100)
		.until(ExpectedConditions.visibilityOfElementLocated(verificationConfirmationEmailtoClient_xpath));
		emailTemplateEmailPurposeVerificationConfirmationEmailtoClientLabelWebEelement.isDisplayed();
		Thread.sleep(1000);

		WebElement emailTemplateEmailPurposeVerificationConfirmationEmailtoPmWebEelement=new WebDriverWait(driver,100)
		.until(ExpectedConditions.visibilityOfElementLocated(verificationConfirmationEmailtoPM_xpath));
		emailTemplateEmailPurposeVerificationConfirmationEmailtoPmWebEelement.isDisplayed();
		Thread.sleep(1000);
		
		WebElement emailTemplateEmailPurposeVerificationEmailtoDebtorWebEelement=new WebDriverWait(driver,100)
		.until(ExpectedConditions.visibilityOfElementLocated(verificationEmailtoDebtor_xpath));
		emailTemplateEmailPurposeVerificationEmailtoDebtorWebEelement.isDisplayed();
		Thread.sleep(1000);

		WebElement emailTemplateMailnewAccountsFactoringLabelWebEelement=new WebDriverWait(driver,100)
		.until(ExpectedConditions.visibilityOfElementLocated(mailNewAccountsFactoring2_xpath));
		emailTemplateMailnewAccountsFactoringLabelWebEelement.isDisplayed();
		Thread.sleep(1000);
		
		return true;
	}
	catch(Exception ex){
		return false;
	}

	}
	
	public boolean EmailTemplateProductTypesSelectAndEmailPurposeSelect()
	{
	try{
		WebElement emailTemplateApprovalBBCNotificationLabelWebEelement=new WebDriverWait(driver,100)
		.until(ExpectedConditions.visibilityOfElementLocated(approvalBBCNotification_xpath));
		Thread.sleep(2000);
		emailTemplateApprovalBBCNotificationLabelWebEelement.click();
		Thread.sleep(5000);
			
	
		return true;
		}
		catch(Exception ex){
			return false;
		}

		}
	
	
	
	public boolean EmailTemplateProductTypesGeneralClick()
	{
	try{

		WebElement emailTemplateEmailPurposeUnlockInstructions1LabelWebEelement=new WebDriverWait(driver,100)
		.until(ExpectedConditions.visibilityOfElementLocated(UnlockInstructions1_xpath));
		Thread.sleep(1000);
		emailTemplateEmailPurposeUnlockInstructions1LabelWebEelement.click();
		Thread.sleep(5000);
		
		return true;
	}
	catch(Exception ex){
		return false;
	}

	}
	
	public boolean EmailTemplateProductTypesGeneralNameCCSubjectTextEditorValidation()
	{
	try{
		WebElement emailTemplateNameWebEelement=new WebDriverWait(driver,100)
		.until(ExpectedConditions.visibilityOfElementLocated(unlockInstructionsName_xpath));
		emailTemplateNameWebEelement.isDisplayed();
		Thread.sleep(1000);
	
		WebElement emailTemplateCcWebEelement=new WebDriverWait(driver,100)
		.until(ExpectedConditions.visibilityOfElementLocated(unlockInstructionsCc_xpath));
		emailTemplateCcWebEelement.isDisplayed();
		Thread.sleep(2000);
		
		WebElement emailTemplateSubjectWebEelement=new WebDriverWait(driver,100)
		.until(ExpectedConditions.visibilityOfElementLocated(unlockInstructionsSubject_xpath));
		emailTemplateSubjectWebEelement.isDisplayed();
		Thread.sleep(2000);
		return true;
		}
		catch(Exception ex){
			return false;
		}

		}
		
	public boolean EmailTemplateProductTypesGeneralTextEditorValidation()
	{
	try{
		WebElement emailTemplateEditWebEelement=new WebDriverWait(driver,100)
		.until(ExpectedConditions.visibilityOfElementLocated(edit_xpath));
		Thread.sleep(1000);
		emailTemplateEditWebEelement.click();
		Thread.sleep(2000);
		return true;
		}
		catch(Exception ex){
			return false;
		}

		}
		
	
	public boolean EmailTemplateProductTypesGeneralTextEditorSave()
	{
	try{
		WebElement emailTemplateSaveWebEelement=new WebDriverWait(driver,100)
		.until(ExpectedConditions.visibilityOfElementLocated(save_xpath));
		Thread.sleep(2000);
		emailTemplateSaveWebEelement.click();
		Thread.sleep(3000);
		return true;
		}
		catch(Exception ex){
			return false;
		}

		}
	public boolean EmailTemplateProductTypesGeneralTextEditorAfterSaveMsg()
	{
	try{
		WebElement emailTemplateSuccessMsgWebEelement=new WebDriverWait(driver,100)
		.until(ExpectedConditions.visibilityOfElementLocated(saveMessage_xpath));
		emailTemplateSuccessMsgWebEelement.isDisplayed();
		
		return true;
	}
	catch(Exception ex){
		return false;
	}

	}
/*
	public String verifyMessageOnAfterSave(String successMessageOnTemplate)
	   {
	   try{
	      WebElement SaveOnTemplateWebEelement=new WebDriverWait(driver,10)
	      .until(ExpectedConditions.visibilityOfElementLocated(saveMessage_xpath));
	     String actualMsgFromAPP= SaveOnTemplateWebEelement.getText();
	     if(actualMsgFromAPP.equalsIgnoreCase(successMessageOnTemplate))
	     {
	      return actualMsgFromAPP;
	     }
	      
	   }
	   catch(Exception ex){
	    
	   }
	return successMessageOnTemplate;
	   }*/
		
	public boolean EmailTemplateProductTypesGeneralNameCCSubjectTextEditorCancelValidation()
	{
	try{
		
		WebElement emailTemplateCancelWebEelement=new WebDriverWait(driver,100)
		.until(ExpectedConditions.visibilityOfElementLocated(cancel_xpath));
		Thread.sleep(2000);
		emailTemplateCancelWebEelement.click();
		Thread.sleep(5000);

		return true;
	}
	catch(Exception ex){
		return false;
	}

	}

	/////////////// Email Template End //////////////////
	
	public boolean ClickOnTextTemplateRadioBtnVerify()
	{
	try{

		WebElement radioBtnTextWebEelement=new WebDriverWait(driver,100)
		.until(ExpectedConditions.visibilityOfElementLocated(textRadioButton_xpath));
		Thread.sleep(3000);
		radioBtnTextWebEelement.click();
		Thread.sleep(5000);
return true;
	}
	catch(Exception ex){
		return false;
	}

	}
	
	
	public boolean PleaseSelectInfoLabelVerifyInTextTemplate()
	{
	try{
		
		WebElement pleaseSelectInfoWebEelement=new WebDriverWait(driver,100)
		.until(ExpectedConditions.visibilityOfElementLocated(pleaseSelectInfoLabelTextTemplate_xpath));
		pleaseSelectInfoWebEelement.isDisplayed();
		Thread.sleep(2000);
		
return true;
	}
	catch(Exception ex){
		return false;
	}

	}
	
	public boolean TextTemplateProductTypeDropdownValuesValidation()
	{
	try{
		
		 String[] exp = {"General","ABL","Factoring"};
		 
		WebElement radioBtnTextWebEelement=new WebDriverWait(driver,100)
		.until(ExpectedConditions.visibilityOfElementLocated(textRadioButton_xpath));
		Thread.sleep(2000);
		radioBtnTextWebEelement.click();
		Thread.sleep(4000);

		WebElement dropdown = driver.findElement(productTypeDropdownTextTemplate_xpath);  
		  dropdown.click();
		  Thread.sleep(4000);
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

return true;
	}
	catch(Exception ex){
		return false;
	}

	}
	
	
public boolean TextTemplatesListInTextTemplate()
	{
	try{
	
		WebElement textTemplateListWebEelement=new WebDriverWait(driver,100)
		.until(ExpectedConditions.visibilityOfElementLocated(textTemplatesList_xpath));
		textTemplateListWebEelement.isDisplayed();
		
return true;
	}
	catch(Exception ex){
		return false;
	}

	}
	

public boolean  verifyProductTypeDropdownValuesTextTemplate(){
	 try {
		 String[] exp = {"General","ABL","Factoring"};
	  
	  WebElement dropdown = driver.findElement(productTypeDropdownTextTemplate_xpath);  
	  dropdown.click();
	  Thread.sleep(3000);
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
	}
	


public boolean TextTemplatesProductTypeDropdownSingleSelectVerify()
{
try{

	WebElement productTypeDropdownWebEelement=new WebDriverWait(driver,100)
	.until(ExpectedConditions.visibilityOfElementLocated(productTypeDropdownTextTemplate_xpath));
	Thread.sleep(2000);
	productTypeDropdownWebEelement.click();
	Thread.sleep(2000);
	
	return true;
	}
	catch(Exception ex){
		return false;
	}

	}
	
public boolean TextTemplatesProductTypeDropdownSelectFactoringVerify()
{
try{

	WebElement productTypeDropdownSingleSelectWebEelement=new WebDriverWait(driver,100)
	.until(ExpectedConditions.visibilityOfElementLocated(productTypeFactoringTextTemplate_xpath));
	Thread.sleep(2000);
	productTypeDropdownSingleSelectWebEelement.click();
	Thread.sleep(2000);
	
	
return true;
}
catch(Exception ex){
	return false;
}

}

public boolean TextTemplatesProductTypeGeneralSelectVerifyTextTemplates()
{
try{
	
	WebElement textTemplateTestMsgOtpWebEelement=new WebDriverWait(driver,100)
	.until(ExpectedConditions.visibilityOfElementLocated(textTemplatesList_xpath));
	textTemplateTestMsgOtpWebEelement.isDisplayed();
	Thread.sleep(2000);
	
	
return true;
}
catch(Exception ex){
	return false;
}

}


public boolean TextTemplatesProductTypeAblSelect()
{
try{

	WebElement productTypeDropdownAblWebEelement=new WebDriverWait(driver,100)
	.until(ExpectedConditions.visibilityOfElementLocated(productTypeAblTextTemplate_xpath));
	Thread.sleep(2000);
	productTypeDropdownAblWebEelement.click();
	Thread.sleep(2000);
	
	return true;
	}
	catch(Exception ex){
		return false;
	}

	}

public boolean TextTemplatesProductTypeAblSelectVerify()
{
try{
	WebElement textTemplateCollateralChangeValueWebEelement=new WebDriverWait(driver,100)
	.until(ExpectedConditions.visibilityOfElementLocated(textTemplatesListAblCollateralChange_xpath));
	textTemplateCollateralChangeValueWebEelement.isDisplayed();
	Thread.sleep(2000);
	
	WebElement textTemplateBalanceLimitValueWebEelement=new WebDriverWait(driver,100)
	.until(ExpectedConditions.visibilityOfElementLocated(textTemplatesListAblBalanceLimit_xpath));
	textTemplateBalanceLimitValueWebEelement.isDisplayed();
	Thread.sleep(2000);

	WebElement textTemplateLetterofCreditExpiryValueWebEelement=new WebDriverWait(driver,100)
	.until(ExpectedConditions.visibilityOfElementLocated(textTemplatesListAblLetterofCredit_xpath));
	textTemplateLetterofCreditExpiryValueWebEelement.isDisplayed();
	Thread.sleep(2000);
	
	WebElement textTemplateAddendumPriorWebEelement=new WebDriverWait(driver,100)
	.until(ExpectedConditions.visibilityOfElementLocated(textTemplatesAddendumPrior_xpath));
	textTemplateAddendumPriorWebEelement.isDisplayed();
	Thread.sleep(2000);
	
	WebElement textTemplateAddendumPostWebEelement=new WebDriverWait(driver,100)
	.until(ExpectedConditions.visibilityOfElementLocated(textTemplatesAddendumPost_xpath));
	textTemplateAddendumPostWebEelement.isDisplayed();
	Thread.sleep(2000);
	
	WebElement textTemplateApproveBbcWebEelement=new WebDriverWait(driver,100)
	.until(ExpectedConditions.visibilityOfElementLocated(textTemplatesApprovalBBC_xpath));
	textTemplateApproveBbcWebEelement.isDisplayed();
	Thread.sleep(2000);
	
return true;
}
catch(Exception ex){
	return false;
}

}


public boolean TextTemplatesProductTypeFactoringSelect()
{
try{

	WebElement productTypeDropdownFacWebEelement=new WebDriverWait(driver,100)
	.until(ExpectedConditions.visibilityOfElementLocated(productTypeFactoringTextTemplate_xpath));
	Thread.sleep(2000);
	productTypeDropdownFacWebEelement.click();
	Thread.sleep(2000);
	
	return true;
	}
	catch(Exception ex){
		return false;
	}

	}


public boolean TextTemplatesProductTypeFactoringSelectVerify()
{
try{

	WebElement textTemplateMessageforNewAccountsWebEelement=new WebDriverWait(driver,100)
	.until(ExpectedConditions.visibilityOfElementLocated(textTemplatesMessageforNewAccounts_xpath));
	textTemplateMessageforNewAccountsWebEelement.isDisplayed();
	Thread.sleep(2000);
	
	WebElement textTemplateRecourseInvoiceWebEelement=new WebDriverWait(driver,100)
	.until(ExpectedConditions.visibilityOfElementLocated(textTemplatesRecourseInvoiceNotification_xpath));
	textTemplateRecourseInvoiceWebEelement.isDisplayed();
	Thread.sleep(2000);

return true;
}
catch(Exception ex){
	return false;
}

}

public boolean TextTemplatesProductTypeFactoringTestTemplateUpdated()
{
try{	
	WebElement textTemplateMessageforNewAccountsWebEelement=new WebDriverWait(driver,100)
	.until(ExpectedConditions.visibilityOfElementLocated(textTemplatesMessageforNewAccounts_xpath));
	Thread.sleep(2000);
	textTemplateMessageforNewAccountsWebEelement.click();
	Thread.sleep(5000);


return true;
}
catch(Exception ex){
	return false;
}

}

public boolean TextTemplatesFunctionality()
{
try{
	
	WebElement textTemplateSelectCollateralChangeValueWebEelement=new WebDriverWait(driver,100)
	.until(ExpectedConditions.visibilityOfElementLocated(textTemplatesListAblCollateralChange_xpath));
	Thread.sleep(2000);
	textTemplateSelectCollateralChangeValueWebEelement.click();
	Thread.sleep(5000);
	
	return true;
	}
	catch(Exception ex){
		return false;
	}

	}
	
public boolean TextTemplatesAfterClickFromLabels()
{
try{
	
	
	WebElement productTypeDropdownFromLabelWebEelement=new WebDriverWait(driver,100)
	.until(ExpectedConditions.visibilityOfElementLocated(productTypeAblFromLabel_xpath));
	productTypeDropdownFromLabelWebEelement.isDisplayed();
	Thread.sleep(2000);
	
	return true;
	}
	catch(Exception ex){
		return false;
	}

	}

public boolean TextTemplatesPlaceHolderFunctionality()
{
try{
	
	WebElement productTypeDropdownPlaceHolderWebEelement=new WebDriverWait(driver,100)
	.until(ExpectedConditions.visibilityOfElementLocated(productTypeAblPlaceHolderLabel_xpath));
	Thread.sleep(2000);
	productTypeDropdownPlaceHolderWebEelement.click();
	Thread.sleep(2000);

	return true;
	}
	catch(Exception ex){
		return false;
	}

	}

public boolean TextTemplatesEditFunctionality()
{
try{

	WebElement editWebEelement=new WebDriverWait(driver,100)
	.until(ExpectedConditions.visibilityOfElementLocated(productTypeAblEditLabel_xpath));
	Thread.sleep(2000);
	editWebEelement.click();
	Thread.sleep(2000);
	return true;
	}
	catch(Exception ex){
		return false;
	}

	}
	
	
public boolean TextTemplatesSaveFunctionality()
{
try{
	WebElement saveWebEelement=new WebDriverWait(driver,100)
	.until(ExpectedConditions.visibilityOfElementLocated(productTypeAblSaveLabel_xpath));
	Thread.sleep(2000);
	saveWebEelement.click();
	Thread.sleep(1000);
	
	WebElement successMsgWebEelement=new WebDriverWait(driver,100)
	.until(ExpectedConditions.visibilityOfElementLocated(productTypeSuccessMsgLabel_xpath));
	successMsgWebEelement.isDisplayed();
	Thread.sleep(2000);
	
return true;
}
catch(Exception ex){
	return false;
}

}


public boolean TextTemplatesFunctionalityWithCancelBtn()
{
try{
	
	WebElement cancelWebEelement=new WebDriverWait(driver,100)
	.until(ExpectedConditions.visibilityOfElementLocated(productTypeAblCancelLabel_xpath));
	Thread.sleep(2000);
	cancelWebEelement.click();
	Thread.sleep(2000);
	
	WebElement pleaseSelectLabelTextTemplateWebEelement=new WebDriverWait(driver,100)
	.until(ExpectedConditions.visibilityOfElementLocated(pleaseSelectInfoLabelTextTemplate_xpath));
	pleaseSelectLabelTextTemplateWebEelement.isDisplayed();
	Thread.sleep(2000);
	
return true;
}
catch(Exception ex){
	return false;
}

}


public String textTemplateSearchPurposeFunction(String Data)
{
try{
	WebElement searchTextBoxWebEelement=new WebDriverWait(driver,200)
	.until(ExpectedConditions.visibilityOfElementLocated(searchPurpose_xpath));
	searchTextBoxWebEelement.sendKeys(Data);
	 Thread.sleep(3000);

}
catch(Exception ex){

}
return Data;

}


public boolean TextTemplatesSearchFunctionality()
{
try{
	
	WebElement searchTrueWebEelement=new WebDriverWait(driver,100)
	.until(ExpectedConditions.visibilityOfElementLocated(searchPurposeTrueValue_xpath));
	searchTrueWebEelement.isDisplayed();
	Thread.sleep(2000);

return true;
}
catch(Exception ex){
	return false;
}

}


///////high priority End////////////


public boolean TemplateUIEmailTemplate()
{
try{

	WebElement emailTemplateUIWebEelement=new WebDriverWait(driver,100)
	.until(ExpectedConditions.visibilityOfElementLocated(emailTemplateLabelUI_xpath));
	emailTemplateUIWebEelement.isDisplayed();
	Thread.sleep(2000);
	
return true;
}
catch(Exception ex){
	return false;
}

}

public boolean TemplateUITextTemplate()
{
try{

	WebElement textTemplateUIWebEelement=new WebDriverWait(driver,100)
	.until(ExpectedConditions.visibilityOfElementLocated(textTemplateLabelUI_xpath));
	textTemplateUIWebEelement.isDisplayed();
	Thread.sleep(2000);
	
return true;
}
catch(Exception ex){
	return false;
}

}


public boolean TemplateUIEmailPurpose()
{
try{

	WebElement emailPurposeTemplateUIWebEelement=new WebDriverWait(driver,100)
	.until(ExpectedConditions.visibilityOfElementLocated(templateEmailPurposeLabelUI_xpath));
	emailPurposeTemplateUIWebEelement.isDisplayed();
	Thread.sleep(2000);
	
return true;
}
catch(Exception ex){
	return false;
}

}

public boolean TemplateUIProductTypes()
{
try{

	WebElement productTypesTemplateUIWebEelement=new WebDriverWait(driver,100)
	.until(ExpectedConditions.visibilityOfElementLocated(templateProductTypesLabelUI_xpath));
	productTypesTemplateUIWebEelement.isDisplayed();
	Thread.sleep(2000);
	
return true;
}
catch(Exception ex){
	return false;
}

}


public boolean TemplateUIEmailTemplateRadioBtn()
{
try{

	WebElement emailTemplateBtnUIWebEelement=new WebDriverWait(driver,100)
	.until(ExpectedConditions.visibilityOfElementLocated(emailTemplateRadioBtn_xpath));
	emailTemplateBtnUIWebEelement.isDisplayed();
	Thread.sleep(2000);
	
return true;
}
catch(Exception ex){
	return false;
}

}



}
