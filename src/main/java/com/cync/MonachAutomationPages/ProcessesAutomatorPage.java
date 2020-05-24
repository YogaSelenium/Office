package com.cync.MonachAutomationPages;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.SkipException;

import com.cync.base.BasePage;

public class ProcessesAutomatorPage extends BasePage {

    static Logger log = Logger
	    .getLogger(ProcessesAutomatorPage.class.getName());

    private final By ProcessHeader_xpath = By
	    .xpath("//span[text()='Processes']");
    private final By clickaddIconInProcessPage_xpath = By
	    .xpath("(//span[@class='ui-icon ui-icon-plus'])[1]");
    private final By nameTextBoxInGeneral_xpath = By
	    .xpath("//input[@id='Name']");
    private final By descriptionTextBoxInGeneral_xpath = By
	    .xpath("//textarea[@id='Description']");
    private final By clickaddButtonInGeneralPage_xpath = By
	    .xpath("//input[@id='PumpTasks_General_AddBtn']");
    private final By enterProjectFilePathdrpj_xpath = By
	    .xpath("//input[@id='PumpTasks_General_ProjectFileName']");
    private final By selectSourceTypeDropDown_xpath = By
	    .xpath("//select[@class='full-width']");
    private final By searchForProjectFilePath_xpath = By
	    .xpath("//input[@class='search-control-filter-input']");
    private final By selectForProjectFile_xpath = By
	    .xpath("//a[contains(text(),'dprj')]");
    private final By saveTheFileInTheProjectFilePath_xpath = By
	    .xpath("//input[@id='PumpTasks_General_ModalOkBtn']");
    private final By saveTheFileInTheGeneral_xpath = By
	    .xpath("//input[@id='PumpTasks_General_SaveBtn']");
    private final By searchFileInProcesses_xpath = By
	    .xpath("//input[@id='PumpTasks_ListIndex_Grid_ListFilter_Filter']");
    private final By clickOnSearchedFileInProcesses_xpath = By
	    .xpath("//a[contains(@onclick,'AdminUtils.prepareStates')]");
    private final By generalPageHeader_xpath = By
	    .xpath("//span[contains(text(),'General')]");
    private final By clickOnSearchButton_xpath = By
	    .xpath("//span[contains(@id,'PumpTasks_ListIndex_Grid_ListFilter_ApplyBtn')]");
    private final By clickOnOpenInProjectEditorWebElement_xpath = By
	    .xpath("//span[@title='Open in Project Editor']");
    private final By FileNameInHomeTab_xpath = By
	    .xpath("//input[@name='Name' and @class='full-width valid']");
    private final By ModelAndVerificationsWebElement_xpath = By
	    .xpath("//a[contains(text(),'Model & Verifications')]");
    private final By enterLocationFilePathdmod_xpath = By
	    .xpath("//input[contains(@name,'ModelFilePath')]");
    private final By InputWebElement_xpath = By.xpath("//a[text()='Input']");
    private final By enterInputFilePathPdf_xpath = By
	    .xpath("//div[@title='Click to enter direct edit mode']");
    private final By EditButtonInInputWebElement_xpath = By
	    .xpath("//button[@title='Edit']");
    private final By selectSourceTypeDropDownInput_xpath = By
	    .xpath("//*[@id='ProjectInputsDialog']/div[1]/div/div[1]/select");
    private final By selectForInputFile_xpath = By
	    .xpath("//a[contains(text(),'pdf')]");
    private final By okTheFileInTheInputPath_xpath = By
	    .xpath("//*[@id='ProjectInputsDialog']/div[2]/input[1]");
    private final By clickOnInputDistributionWebElement_xpath = By
	    .xpath("//a[text()='Input Distribution']");
    private final By AddButtonInInputDistributionWebElement_xpath = By
	    .xpath("//*[@id='add_PumpProjectDistribution_DistributionActionsModal_Grid_InputDistributionEditor']/div/span");
    private final By RadioButtonMoveInInputDistributionWebElement_xpath = By
	    .xpath("//*[@id='PumpProjectDistribution_DistributionActionDetail_ActionTypesMenu']//tr[1]//td[3]/input");
    private final By SendFileNameInMoveFileToFolder_xpath = By
	    .xpath("//input[@id='PumpActions_DetailMoveCopy_DestinationFolder']");
    private final By SendFileNameInRenameFileAsWebElement_xpath = By
	    .xpath("//input[@id='PumpActions_DetailMoveCopy_RenameFilePattern']");
    private final By clickOnCheckBoxOverwriteWebElement_xpath = By
	    .xpath("//input[@id='Overwrite']");
    private final By okOnActionDetailWebElement_xpath = By
	    .xpath("//*[@id='PumpProjectDistribution_DistributionActionsModal_ActionContent_InputDistributionEditor-ui-dialog']/div[3]/div/button[1]/span");
    private final By clickOnExportWebElement_xpath = By
	    .xpath("//a[text()='Exports']");
    private final By clickOnAddButtonInExportWebElement_xpath = By
	    .xpath("//*[@id='add_ProjectEditor_Exports_ExportsList']/div/span");
    private final By clickOnNextGeneralExportWebElement_xpath = By
	    .xpath("//input[@id='PumpProjectExportWizard_Next']");
    private final By clickOnFinishExportWebElement_xpath = By
	    .xpath("//input[@id='PumpProjectExportWizard_Finish']");
    private final By enterExportFilePathcsv_xpath = By
	    .xpath("//input[@name='FilePath']");
    private final By clickOnDelimitedTextRadioButtonWebElement_xpath = By
	    .xpath("(//input[@name='OutputFileFormatOptions'])[2]");
    private final By clickOnSaveFromExportWebElement_xpath = By
	    .xpath("//div[@class='button-container']/input[@value='Save']");
    private final By clickOnCommitInExportWebElement_xpath = By
	    .xpath("//input[@value='Commit']");
    private final By clickOnMonitoringWebElement_xpath = By
	    .xpath("//span[text()='Monitoring']");
    private final By clickOnEnableCheckBoxInMonitoringWebElement_xpath = By
	    .xpath("//input[@id='PumpTasks_Monitoring_MonitoringEnable']");
    private final By clickOnAddButtonInMonitoringWebElement_xpath = By
	    .xpath("//input[@id='PumpTasks_Monitoring_AddBtn']");
    private final By   enterMonitoringFilePathpdfWebElement_xpath = By
	    .xpath("//input[@id='PumpTasks_Monitoring_FileSpecificationPath']");
    private final By clickOnSaveMonitoringPopUpWebElement_xpath = By
	    .xpath("//input[@id='PumpTasks_Monitoring_ModalOkBtn']");
    private final By clickOnSaveMonitoringPageWebElement_xpath = By
	    .xpath("//input[@id='PumpTasks_Monitoring_SaveBtn']");
    private final By clickOnSaveGeneralPageWebElement_xpath = By
	    .xpath("//input[@id='PumpTasks_General_SaveBtn']");
    private final By clickOnRunFromProcessesWebElement_xpath = By
	    .xpath("//span[@class='ui-icon ui-icon-clock runnow-icon']");
    private final By clickOnExport1InExportWebElement_xpath = By
	    .xpath("//td[@title='Export 1']");
    private final By clickOnEditInExportWebElement_xpath = By
	    .xpath("//*[@id='edit_ProjectEditor_Exports_ExportsList']/div/span"); 
    private final By clickOnCommitFromInputDistributionWebElement_xpath = By
	    .xpath("(//input[@value='Commit'])[1]");  
    private final By clickOnCommitFromInputDistributionPopUpWebElement_xpath = By
	    .xpath("(//input[@value='Commit'])[2]"); 
    private final By clickOnSaveFromInputDistributionWebElement_xpath = By
	    .xpath("(//input[@value='Save'])[1]"); 
    
    public ProcessesAutomatorPage(WebDriver driver) {
	super(driver);
	log.info("verifying the header of the process page");

	if (!driver.findElement(ProcessHeader_xpath).getText().trim()
		.equals("Processes")) {
	    log.info("Processes  Page couldn't open.");
	    throw new SkipException("Processes Page couldn't open.");
	}
    }

    public boolean clickaddIconInProcessPage() {
	try {

	    WebElement clickaddIconInProcessPageWebEelement = new WebDriverWait(
		    driver, 200)
		    .until(ExpectedConditions
			    .visibilityOfElementLocated(clickaddIconInProcessPage_xpath));
	    clickaddIconInProcessPageWebEelement.click();
	    Thread.sleep(5000);
	    return true;
	} catch (Exception ex) {
	    return false;
	}

    }

    public boolean enterNameIntheGeneralScreen(String LenderName,
	    String FileName) {
	try {
	    WebElement NameTextBoxIntheGeneralScreenWebElement = new WebDriverWait(
		    driver, 100).until(ExpectedConditions
		    .visibilityOfElementLocated(nameTextBoxInGeneral_xpath));
	    Thread.sleep(1000);
	    System.out.println(LenderName + " " + "-" + " " + FileName);
	    NameTextBoxIntheGeneralScreenWebElement.sendKeys(LenderName + " "
		    + "-" + " " + FileName);
	    return true;

	} catch (Exception e) {
	    return false;
	}
    }

    public boolean enterDescriptionIntheGeneralScreen(String LenderName,
	    String FileName) {
	try {
	    WebElement DescriptionTextBoxIntheGeneralScreenWebElement = new WebDriverWait(
		    driver, 100)
		    .until(ExpectedConditions
			    .visibilityOfElementLocated(descriptionTextBoxInGeneral_xpath));
	    Thread.sleep(1000);
	    System.out.println(LenderName + " " + "-" + " " + FileName);

	    DescriptionTextBoxIntheGeneralScreenWebElement.sendKeys(LenderName
		    + " " + "-" + " " + FileName);
	    return true;

	} catch (Exception e) {
	    return false;
	}
    }

    public boolean clickaddButtonInGeneralPage() {
	try {

	    WebElement clickaddButtonInGeneralPageWebEelement = new WebDriverWait(
		    driver, 200)
		    .until(ExpectedConditions
			    .visibilityOfElementLocated(clickaddButtonInGeneralPage_xpath));
	    clickaddButtonInGeneralPageWebEelement.click();
	    Thread.sleep(5000);
	    return true;
	} catch (Exception ex) {
	    return false;
	}

    }

    public boolean enterProjectFilePathdrpj(String LenderName, String FileName) {
	try {
	    WebElement enterProjectFilePathdrpjWebElement = new WebDriverWait(
		    driver, 100)
		    .until(ExpectedConditions
			    .visibilityOfElementLocated(enterProjectFilePathdrpj_xpath));
	    Thread.sleep(1000);
	    System.out.println("C:\\monarchcync\\" + LenderName + "\\models\\"
		    + FileName + ".dprj");
	    enterProjectFilePathdrpjWebElement.sendKeys("C:\\monarchcync\\"
		    + LenderName + "\\models\\" + FileName + ".dprj");
	    return true;

	} catch (Exception e) {
	    return false;
	}
    }

    public String selectSourceType(String namePath) {

	try {
	    WebElement selectClientDropdownWebEelement = new WebDriverWait(
		    driver, 10)
		    .until(ExpectedConditions
			    .visibilityOfElementLocated(selectSourceTypeDropDown_xpath));

	    Select sel = new Select(selectClientDropdownWebEelement);
	    List<WebElement> list = sel.getOptions();

	    for (WebElement ele : list) {

		if (ele.getText().equals(namePath)) {
		    ele.click();
		    Thread.sleep(10000);
		    break;

		}
	    }

	} catch (Exception ex) {

	}

	return namePath;

    }

    public boolean searchFileNameInTheProjectFilePath(String FileName) {
	try {
	    WebElement searchFileNameInTheProjectFilePathWebElement = new WebDriverWait(
		    driver, 100)
		    .until(ExpectedConditions
			    .visibilityOfElementLocated(searchForProjectFilePath_xpath));
	    Thread.sleep(1000);
	    System.out.println(FileName);
	    searchFileNameInTheProjectFilePathWebElement.sendKeys(FileName);
	    Thread.sleep(10000);
	    return true;

	} catch (Exception e) {
	    return false;
	}
    }

    public boolean selectTheFileNameInTheProjectFilePath() {
	try {
	    WebElement selectTheFileNameWebElement = new WebDriverWait(driver,
		    100).until(ExpectedConditions
		    .visibilityOfElementLocated(selectForProjectFile_xpath));
	    Thread.sleep(1000);
	    selectTheFileNameWebElement.click();
	    return true;

	} catch (Exception e) {
	    return false;
	}
    }

    public boolean saveTheFileInTheProjectFilePath() {
	try {
	    WebElement saveTheFileInTheProjectFilePathWebElement = new WebDriverWait(
		    driver, 100)
		    .until(ExpectedConditions
			    .visibilityOfElementLocated(saveTheFileInTheProjectFilePath_xpath));
	    saveTheFileInTheProjectFilePathWebElement.click();
	    Thread.sleep(1000);
	    return true;

	} catch (Exception e) {
	    return false;
	}
    }

    public boolean saveTheFileInTheGeneralScreen() {
	try {
	    WebElement saveTheFileInTheGeneralWebElement = new WebDriverWait(
		    driver, 100).until(ExpectedConditions
		    .visibilityOfElementLocated(saveTheFileInTheGeneral_xpath));
	    saveTheFileInTheGeneralWebElement.click();
	    Thread.sleep(1000);
	    return true;

	} catch (Exception e) {
	    return false;
	}
    }

    public boolean searchFileNameInTheProcesses(String FileName) {
	try {
	    WebElement searchFileNameInTheProcessesWebElement = new WebDriverWait(
		    driver, 100).until(ExpectedConditions
		    .visibilityOfElementLocated(searchFileInProcesses_xpath));

	    System.out.println(FileName);
	    searchFileNameInTheProcessesWebElement.sendKeys(FileName);
	    Thread.sleep(10000);

	    return true;

	} catch (Exception e) {
	    return false;
	}
    }

    public boolean clickOnSearchButtonInProcess() {
	try {
	    WebElement clickOnSearchButtonInProcessWebElement = new WebDriverWait(
		    driver, 100).until(ExpectedConditions
		    .visibilityOfElementLocated(clickOnSearchButton_xpath));
	    clickOnSearchButtonInProcessWebElement.click();

	    Thread.sleep(1000);
	    return true;

	} catch (Exception e) {
	    return false;
	}
    }

    public boolean clickOnSearchedFileInProcesses() {
	try {
	    WebElement clickOnSearchedFileInProcessesWebElement = new WebDriverWait(
		    driver, 100)
		    .until(ExpectedConditions
			    .visibilityOfElementLocated(clickOnSearchedFileInProcesses_xpath));
	    clickOnSearchedFileInProcessesWebElement.click();

	    Thread.sleep(1000);
	    return true;

	} catch (Exception e) {
	    return false;
	}
    }

    public boolean verfiyGeneralPageHeader() {
	try {

	    WebElement GeneralPageHeaderWebEelement = new WebDriverWait(driver,
		    200).until(ExpectedConditions
		    .visibilityOfElementLocated(generalPageHeader_xpath));
	    GeneralPageHeaderWebEelement.isDisplayed();
	    Thread.sleep(5000);
	    return true;
	} catch (Exception ex) {
	    return false;
	}

    }

    public boolean clickOnOpenInProjectEditor() {
	try {
	    WebElement clickOnOpenInProjectEditorWebElement = new WebDriverWait(
		    driver, 100)
		    .until(ExpectedConditions
			    .visibilityOfElementLocated(clickOnOpenInProjectEditorWebElement_xpath));
	    clickOnOpenInProjectEditorWebElement.click();

	    Thread.sleep(2000);
	    return true;

	} catch (Exception e) {
	    return false;
	}
    }

    public String verifyFileNameInHomeTab(String FileName) {
	try {
	    WebElement verifyFileNameInHomeTabWebEelement = new WebDriverWait(
		    driver, 10).until(ExpectedConditions
		    .visibilityOfElementLocated(FileNameInHomeTab_xpath));

	    String actualMsgFromApp = verifyFileNameInHomeTabWebEelement
		    .getText();
	    if (actualMsgFromApp.equalsIgnoreCase(FileName)) {
		return actualMsgFromApp;
	    }

	} catch (Exception ex) {

	}
	return FileName;

    }

    public boolean clickOnModelAndVerifications() {
	try {
	    WebElement ModelAndVerificationsWebElement = new WebDriverWait(
		    driver, 100)
		    .until(ExpectedConditions
			    .visibilityOfElementLocated(ModelAndVerificationsWebElement_xpath));
	    ModelAndVerificationsWebElement.click();

	    return true;

	} catch (Exception e) {
	    return false;
	}
    }

    public boolean enterLocationFilePathdmod(String LenderName, String FileName) {
	try {
	    WebElement enterLocationFilePathdmodWebElement = new WebDriverWait(
		    driver, 100)
		    .until(ExpectedConditions
			    .visibilityOfElementLocated(enterLocationFilePathdmod_xpath));
	    Thread.sleep(1000);
	    enterLocationFilePathdmodWebElement.clear();
	    System.out.println("C:\\monarchcync\\" + LenderName + "\\models\\"
		    + FileName + ".dmod");
	    enterLocationFilePathdmodWebElement.sendKeys("C:\\monarchcync\\"
		    + LenderName + "\\models\\" + FileName + ".dmod");
	    return true;

	} catch (Exception e) {
	    return false;
	}
    }

    public boolean clickOnInputPage() {
	try {
	    WebElement InputPageWebElement = new WebDriverWait(driver, 100)
		    .until(ExpectedConditions
			    .visibilityOfElementLocated(InputWebElement_xpath));
	    InputPageWebElement.click();

	    return true;

	} catch (Exception e) {
	    return false;
	}
    }

    public boolean enterInputFilePathPdf(String LenderName, String FileName) {
	try {
	    WebElement enterInputFilePathPdfWebElement = new WebDriverWait(
		    driver, 100).until(ExpectedConditions
		    .visibilityOfElementLocated(enterInputFilePathPdf_xpath));

	    enterInputFilePathPdfWebElement.isDisplayed();
	    /* enterInputFilePathPdfWebElement.click(); */

	    System.out.println("C:\\monarchcync\\" + LenderName + "\\out\\"
		    + FileName + ".pdf");
	    /*
	     * Robot robot = new Robot();
	     * robot.keyPress(KeyEvent.VK_BACK_SPACE);
	     */

	    /*
	     * enterInputFilePathPdfWebElement.clear();
	     * enterInputFilePathPdfWebElement.sendKeys("C:\\monarchcync\\"+
	     * LenderName +"\\out\\"+ FileName +".pdf");
	     */
	    return true;

	} catch (Exception e) {
	    return false;
	}

    }

    public boolean clickOnEditButtonInInput() {
	try {
	    WebElement EditButtonInInputWebElement = new WebDriverWait(driver,
		    100)
		    .until(ExpectedConditions
			    .visibilityOfElementLocated(EditButtonInInputWebElement_xpath));
	    EditButtonInInputWebElement.click();
	    Thread.sleep(5000);

	    return true;

	} catch (Exception e) {
	    return false;
	}
    }

    public String selectSourceTypeInput(String namePath) {

	try {
	    WebElement selectClientDropdownWebEelement = new WebDriverWait(
		    driver, 10)
		    .until(ExpectedConditions
			    .visibilityOfElementLocated(selectSourceTypeDropDownInput_xpath));

	    Select sel = new Select(selectClientDropdownWebEelement);
	    List<WebElement> list = sel.getOptions();

	    for (WebElement ele : list) {

		if (ele.getText().equals(namePath)) {
		    ele.click();
		    Thread.sleep(10000);
		    break;

		}
	    }

	} catch (Exception ex) {

	}

	return namePath;

    }

    public boolean selectTheFileNameInTheInputPath() {
	try {
	    WebElement selectTheFileNameWebElement = new WebDriverWait(driver,
		    100).until(ExpectedConditions
		    .visibilityOfElementLocated(selectForInputFile_xpath));
	    Thread.sleep(1000);
	    selectTheFileNameWebElement.click();
	    return true;

	} catch (Exception e) {
	    return false;
	}
    }

    public boolean okTheFileInTheInputPath() {
	try {
	    WebElement saveTheFileInTheProjectFilePathWebElement = new WebDriverWait(
		    driver, 100).until(ExpectedConditions
		    .visibilityOfElementLocated(okTheFileInTheInputPath_xpath));
	    saveTheFileInTheProjectFilePathWebElement.click();
	    Thread.sleep(10000);
	    return true;

	} catch (Exception e) {
	    return false;
	}

    }

    public boolean clickOnInputDistribution() {
	try {
	    WebElement clickOnInputDistributionWebElement = new WebDriverWait(
		    driver, 100)
		    .until(ExpectedConditions
			    .visibilityOfElementLocated(clickOnInputDistributionWebElement_xpath));
	    clickOnInputDistributionWebElement.click();
	    Thread.sleep(5000);

	    return true;

	} catch (Exception e) {
	    return false;
	}

    }

    public boolean clickOnAddButtonInInputDistribution() {
	try {
	    WebElement AddButtonInInputDistributionWebElement = new WebDriverWait(
		    driver, 100)
		    .until(ExpectedConditions
			    .visibilityOfElementLocated(AddButtonInInputDistributionWebElement_xpath));
	    AddButtonInInputDistributionWebElement.click();
	    Thread.sleep(5000);

	    return true;

	} catch (Exception e) {
	    return false;
	}

    }

    public boolean clickOnRadioButtonMoveInInputDistribution() {
	try {
	    WebElement RadioButtonMoveInInputDistributionWebElement = new WebDriverWait(
		    driver, 100)
		    .until(ExpectedConditions
			    .visibilityOfElementLocated(RadioButtonMoveInInputDistributionWebElement_xpath));
	    RadioButtonMoveInInputDistributionWebElement.click();
	    Thread.sleep(5000);

	    return true;

	} catch (Exception e) {
	    return false;
	}

    }

    public boolean SendFileNameInMoveFileToFolder(String LenderName) {
	try {
	    WebElement SendFileNameInMoveFileToFoldeWebElement = new WebDriverWait(
		    driver, 100)
		    .until(ExpectedConditions
			    .visibilityOfElementLocated(SendFileNameInMoveFileToFolder_xpath));
	    Thread.sleep(1000);

	    System.out
		    .println("C:\\monarchcync\\" + LenderName + "\\processed");
	    SendFileNameInMoveFileToFoldeWebElement
		    .sendKeys("C:\\monarchcync\\" + LenderName + "\\processed");
	    return true;

	} catch (Exception e) {
	    return false;
	}
    }

    public boolean SendFileNameInRenameFileAs() {
	try {
	    WebElement SendFileNameInRenameFileAsWebElement = new WebDriverWait(
		    driver, 100)
		    .until(ExpectedConditions
			    .visibilityOfElementLocated(SendFileNameInRenameFileAsWebElement_xpath));
	    Thread.sleep(1000);

	    System.out.println("&[source.name]&[yyyy]&[mm]&[dd]");
	    SendFileNameInRenameFileAsWebElement
		    .sendKeys("&[source.name]&[yyyy]&[mm]&[dd]");
	    return true;

	} catch (Exception e) {
	    return false;
	}
    }

    public boolean clickOnCheckBoxOverwrite() {
	try {
	    WebElement clickOnCheckBoxOverwriteWebElement = new WebDriverWait(
		    driver, 100)
		    .until(ExpectedConditions
			    .visibilityOfElementLocated(clickOnCheckBoxOverwriteWebElement_xpath));
	    clickOnCheckBoxOverwriteWebElement.click();
	    Thread.sleep(5000);

	    return true;

	} catch (Exception e) {
	    return false;
	}

    }

    public boolean okOnActionDetail() {
	try {
	    WebElement okOnActionDetailWebElement = new WebDriverWait(driver,
		    100)
		    .until(ExpectedConditions
			    .visibilityOfElementLocated(okOnActionDetailWebElement_xpath));
	    okOnActionDetailWebElement.click();
	    Thread.sleep(10000);
	    return true;

	} catch (Exception e) {
	    return false;
	}

    }

    public boolean clickOnCommitFromInputDistribution() {
	try {
	    WebElement clickOnCommitFromInputDistributionWebElement = new WebDriverWait(driver,
		    100)
		    .until(ExpectedConditions
			    .visibilityOfElementLocated(clickOnCommitFromInputDistributionWebElement_xpath));
	    clickOnCommitFromInputDistributionWebElement.click();
	    Thread.sleep(10000);
	    return true;

	} catch (Exception e) {
	    return false;
	}

    }
   
    public boolean clickOnCommitFromInputDistributionPopUp() {
	try {
	    WebElement clickOnCommitFromInputDistributionPopUpWebElement = new WebDriverWait(driver,
		    100)
		    .until(ExpectedConditions
			    .visibilityOfElementLocated(clickOnCommitFromInputDistributionPopUpWebElement_xpath));
	    clickOnCommitFromInputDistributionPopUpWebElement.click();
	    Thread.sleep(10000);
	    return true;

	} catch (Exception e) {
	    return false;
	}

    }
   
    public boolean clickOnExport() {
	try {
	    WebElement clickOnExportWebElement = new WebDriverWait(driver, 100)
		    .until(ExpectedConditions
			    .visibilityOfElementLocated(clickOnExportWebElement_xpath));
	    clickOnExportWebElement.click();
	    Thread.sleep(3000);

	    return true;

	} catch (Exception e) {
	    return false;
	}

    }

    public boolean clickOnAddButtonInExport() {
	try {
	    WebElement clickOnAddButtonInExportWebElement = new WebDriverWait(
		    driver, 100)
		    .until(ExpectedConditions
			    .visibilityOfElementLocated(clickOnAddButtonInExportWebElement_xpath));
	    clickOnAddButtonInExportWebElement.click();
	    Thread.sleep(5000);

	    return true;

	} catch (Exception e) {
	    return false;
	}

    }

    public boolean clickOnNextExport() {
	try {
	    WebElement clickOnNextGeneralExportWebElement = new WebDriverWait(
		    driver, 100)
		    .until(ExpectedConditions
			    .visibilityOfElementLocated(clickOnNextGeneralExportWebElement_xpath));
	    clickOnNextGeneralExportWebElement.click();
	    Thread.sleep(5000);

	    return true;

	} catch (Exception e) {
	    return false;
	}

    }

    public boolean enterExportFilePathcsv(String LenderName, String FileName) {
	try {
	    WebElement enterExportFilePathcsvWebElement = new WebDriverWait(
		    driver, 100).until(ExpectedConditions
		    .visibilityOfElementLocated(enterExportFilePathcsv_xpath));
	    System.out.println("C:\\monarchcync\\" + LenderName + "\\out\\"
		    + FileName + ".csv");
	    enterExportFilePathcsvWebElement.sendKeys("C:\\monarchcync\\"
		    + LenderName + "\\out\\" + FileName + ".csv");
	    Thread.sleep(5000);
	    return true;

	} catch (Exception e) {
	    return false;
	}
    }

    public boolean clickOnDelimitedTextRadioButton() {
	try {
	    WebElement clickOnDelimitedTextRadioButtonWebElement = new WebDriverWait(
		    driver, 100)
		    .until(ExpectedConditions
			    .visibilityOfElementLocated(clickOnDelimitedTextRadioButtonWebElement_xpath));
	    clickOnDelimitedTextRadioButtonWebElement.click();
	    return true;

	} catch (Exception e) {
	    return false;
	}

    }

    public boolean clickOnFinishExport() {
	try {
	    WebElement clickOnFinishExportWebElement = new WebDriverWait(
		    driver, 100)
		    .until(ExpectedConditions
			    .visibilityOfElementLocated(clickOnFinishExportWebElement_xpath));
	    clickOnFinishExportWebElement.click();
	    Thread.sleep(5000);

	    return true;

	} catch (Exception e) {
	    return false;
	}
    }

    public boolean clickOnSaveFromExport() {
	try {
	    WebElement clickOnSaveFromExportWebElement = new WebDriverWait(
		    driver, 100)
		    .until(ExpectedConditions
			    .visibilityOfElementLocated(clickOnSaveFromExportWebElement_xpath));
	    clickOnSaveFromExportWebElement.click();
	    Thread.sleep(5000);

	    return true;

	} catch (Exception e) {
	    return false;
	}
    }

    public boolean clickOnCommitInExport() {
	try {
	    WebElement clickOnCommitInExportWebElement = new WebDriverWait(
		    driver, 100)
		    .until(ExpectedConditions
			    .visibilityOfElementLocated(clickOnCommitInExportWebElement_xpath));
	    clickOnCommitInExportWebElement.click();
	    Thread.sleep(10000);

	    return true;

	} catch (Exception e) {
	    return false;
	}
    }
    
	public boolean clickOnMonitoring() {
		try {
		    WebElement clickOnMonitoringWebElement = new WebDriverWait(driver, 100)
			    .until(ExpectedConditions
				    .visibilityOfElementLocated(clickOnMonitoringWebElement_xpath));
		    clickOnMonitoringWebElement.click();
		    Thread.sleep(3000);

		    return true;

		} catch (Exception e) {
		    return false;
		}

	    }

	
	 public boolean clickOnEnableCheckBoxInMonitoring() {
		try {
		    WebElement clickOnEnableCheckBoxInMonitoringWebElement = new WebDriverWait(
			    driver, 100)
			    .until(ExpectedConditions
				    .visibilityOfElementLocated(clickOnEnableCheckBoxInMonitoringWebElement_xpath));
		    clickOnEnableCheckBoxInMonitoringWebElement.click();
		    return true;

		} catch (Exception e) {
		    return false;
		}

	    }
	 
	 public boolean clickOnAddButtonInMonitoring() {
		try {
		    WebElement clickOnAddButtonInMonitoringWebElement = new WebDriverWait(
			    driver, 100)
			    .until(ExpectedConditions
				    .visibilityOfElementLocated(clickOnAddButtonInMonitoringWebElement_xpath));
		    clickOnAddButtonInMonitoringWebElement.click();
		    Thread.sleep(3000);
		    return true;

		} catch (Exception e) {
		    return false;
		}

	    }
	 
	 public boolean enterMonitoringFilePathpdf(String LenderName, String FileName) {
		try {
		    WebElement eenterMonitoringFilePathpdfWebElement = new WebDriverWait(
			    driver, 100).until(ExpectedConditions
			    .visibilityOfElementLocated(enterMonitoringFilePathpdfWebElement_xpath));
		    System.out.println("C:\\monarchcync\\" + LenderName + "\\out\\"
			    + FileName + ".pdf");
		    eenterMonitoringFilePathpdfWebElement.sendKeys("C:\\monarchcync\\"
			    + LenderName + "\\out\\" + FileName + ".pdf");
		    Thread.sleep(5000);
		    return true;

		} catch (Exception e) {
		    return false;
		}
	    }

	 public boolean clickOnSaveMonitoringPopUp() {
		try {
		    WebElement clickOnSaveMonitoringPopUpWebElement = new WebDriverWait(
			    driver, 100)
			    .until(ExpectedConditions
				    .visibilityOfElementLocated(clickOnSaveMonitoringPopUpWebElement_xpath));
		    clickOnSaveMonitoringPopUpWebElement.click();
		    Thread.sleep(3000);
		    return true;

		} catch (Exception e) {
		    return false;
		}

	    }
	 
	 public boolean clickOnSaveMonitoringPage() {
		try {
		    WebElement clickOnSaveMonitoringPageWebElement = new WebDriverWait(
			    driver, 100)
			    .until(ExpectedConditions
				    .visibilityOfElementLocated(clickOnSaveMonitoringPageWebElement_xpath));
		    clickOnSaveMonitoringPageWebElement.click();
		    Thread.sleep(3000);
		    return true;

		} catch (Exception e) {
		    return false;
		}

	    }
	 
	 public boolean clickOnSaveGeneralPage() {
		try {
		    WebElement clickOnSaveGeneralPageWebElement = new WebDriverWait(
			    driver, 100)
			    .until(ExpectedConditions
				    .visibilityOfElementLocated(clickOnSaveGeneralPageWebElement_xpath));
		    clickOnSaveGeneralPageWebElement.click();
		    Thread.sleep(3000);
		    return true;

		} catch (Exception e) {
		    return false;
		}

	    }
	 
	 public boolean clickOnRunFromProcesses() {
		try {
		    WebElement clickOnRunFromProcessesWebElement = new WebDriverWait(
			    driver, 100)
			    .until(ExpectedConditions
				    .visibilityOfElementLocated(clickOnRunFromProcessesWebElement_xpath));
		    clickOnRunFromProcessesWebElement.click();
		    Thread.sleep(3000);
		    return true;

		} catch (Exception e) {
		    return false;
		}

	    }
	 
	 public boolean clickOnExport1InExport() {
		try {
		    WebElement clickOnExport1InExportWebElement = new WebDriverWait(
			    driver, 100)
			    .until(ExpectedConditions
				    .visibilityOfElementLocated(clickOnExport1InExportWebElement_xpath));
		    clickOnExport1InExportWebElement.click();
		    Thread.sleep(3000);
		    return true;

		} catch (Exception e) {
		    return false;
		}

	    }
	 
	 public boolean clickOnEditInExport() {
		try {
		    WebElement clickOnEditInExportWebElement = new WebDriverWait(
			    driver, 100)
			    .until(ExpectedConditions
				    .visibilityOfElementLocated(clickOnEditInExportWebElement_xpath));
		    clickOnEditInExportWebElement.click();
		    Thread.sleep(3000);
		    return true;

		} catch (Exception e) {
		    return false;
		}

	    }
	 
	 public boolean enterExportFilePathcsvIn(String LenderName, String FileName) {
		try {
		    WebElement enterExportFilePathcsvInWebElement = new WebDriverWait(
			    driver, 100).until(ExpectedConditions
			    .visibilityOfElementLocated(enterExportFilePathcsv_xpath));
		    enterExportFilePathcsvInWebElement.clear();
		    System.out.println("C:\\monarchcync\\" + LenderName + "\\in\\"
			    + FileName + ".csv");
		    enterExportFilePathcsvInWebElement.sendKeys("C:\\monarchcync\\"
			    + LenderName + "\\in\\" + FileName + ".csv");
		    Thread.sleep(5000);
		    return true;

		} catch (Exception e) {
		    return false;
		}
	    }
	 public boolean clickOnSaveFromInputDistribution() {
		try {
		    WebElement clickOnSaveFromInputDistributionWebElement = new WebDriverWait(
			    driver, 100)
			    .until(ExpectedConditions
				    .visibilityOfElementLocated(clickOnSaveFromInputDistributionWebElement_xpath));
		    clickOnSaveFromInputDistributionWebElement.click();
		    Thread.sleep(3000);
		    return true;

		} catch (Exception e) {
		    return false;
		}

	    }
	 
}
