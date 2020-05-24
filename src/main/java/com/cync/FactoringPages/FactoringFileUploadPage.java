package com.cync.FactoringPages;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.cync.base.BasePage;




public class FactoringFileUploadPage extends BasePage {
	


		private final By factoringFileUploadHeader_xpath = By.xpath("//span[contains(text(),' Factoring File Uploads ')]");
	    private final By dataFieldType_xpath = By.xpath("//th[contains(text(),'Data File Type')]");
	    private final By collateralName_xpath = By.xpath("//th[contains(text(),'Collateral Name')]");
	    private final By format_xpath = By.xpath("//th[contains(text(),'Format')]");
	    private final By expectedValue_xpath = By.xpath("(//input[@type='text'])[2]");
	    private final By openFile_xpath = By.xpath("//th[contains(text(),'Open File')]");
	    private final By imageFile_xpath = By.xpath("//th[contains(text(),'Image File')]");
	    private final By processFilesBTN_xpath = By.id("process_fact_files_bt");
	    
	    
	  
	    private final By collateralNamePopup_xpath = By.id("//tr[@class='row-odd'][1]//td[2]");
	    private final By formatPopup_xpath = By.xpath("//tr[@class='row-odd'][1]//td[3]");
	    private final By expectedValueTextBox_xpath = By.id("uploaded_file_7269_expected_value");
	   
	    private final By uploadImageFile_xpath = By.xpath("//tr[@class='row-odd'][1]//td[7]");
	    private final By successMsg_xpath = By.xpath("//div[@id='message']");
	    		
	    
	    
	    private final By chooseFilesBTN_xpath = By.id("uploaded_file_7269_file");
	    private final By clearUploadFiles_xpath = By.xpath("//span[@title='Clear upload files']");
	    private final By chooseImageFileBTN_xpath = By.id("uploaded_file_7269_image_file");
	    private final By clearUploadImageFiles_xpath = By.xpath("//span[@title='Clear upload files'][2]");
	    private final By closeSuccessBTN_xpath = By.xpath("//div[@id='message']//button[@class='close'][contains(text(),'×')]  ");
	    private final By  ChooseFile_xpath=By.xpath("//input[contains(@id,'uploaded_file')][3]");
	    
	    public FactoringFileUploadPage(WebDriver driver) {
			super(driver);
			try
			{
				
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	    
	    
	    public String PageHeaderVerify(String Header)
	    {
	    	try
	    	{
	    		WebElement HeaderWebEelement=new WebDriverWait(driver,100)
				.until(ExpectedConditions.visibilityOfElementLocated(factoringFileUploadHeader_xpath));
			HeaderWebEelement.getText();
			Thread.sleep(1000);
	    	}
	    	catch(Exception e)
	    	{
	    		
	    	}
	    	return Header;
	    }
	    
	    
	    public boolean ProcessFilesClick()
	    {
	    	try{

	    	 	WebElement processFilesWebEelement=new WebDriverWait(driver,100)
	    	 	.until(ExpectedConditions.elementToBeClickable(processFilesBTN_xpath));
	    	 	processFilesWebEelement.click();

	    	 return true;
	    	 }
	    	 catch(Exception ex){
	    	 	return false;
	    	 }
	    }
	    
	    
	   public boolean DataTypeFileIn_FactoringFileUploadsHistory()
	   {
		   try
		   {
			   WebElement dataTypeFileWebElement=new WebDriverWait(driver,100)
			     .until(ExpectedConditions.visibilityOfElementLocated(dataFieldType_xpath));
			   dataTypeFileWebElement.isDisplayed();
			   
			   return true;
		    }
		   catch(Exception e)
		   {
			   return false;
		   }
	   }
	  
	   
	   public boolean CollateralNameIn_FactoringFileUploadsHistory()
	   {
		   try
		   {
			   WebElement collateralNameWebElement=new WebDriverWait(driver,100)
			       .until(ExpectedConditions.visibilityOfElementLocated(collateralName_xpath));
			   collateralNameWebElement.isDisplayed();
			   
			   return true;
		   }
		   catch(Exception e)
		   {
			   return false;
		   }
	   }
	   
	   public boolean FormatIn_FactoringFileUploadsHistory()
	   {
		   try
		   {
			   WebElement formatWebElement=new WebDriverWait(driver,100)
			   .until(ExpectedConditions.visibilityOfElementLocated(format_xpath));
			   formatWebElement.isDisplayed();
			   
			   return true;
		   }
		   catch(Exception e)
		   {
			   return false;
		   }
	   }
	    
	   
	   public boolean ExpectedValueIn_FactoringUploadsHistory()
	   {
		   try
		   {
			   WebElement expectedWebElement =new WebDriverWait(driver,100)
			   .until(ExpectedConditions.visibilityOfElementLocated(expectedValue_xpath));
			   expectedWebElement.isDisplayed();
			   
			   return true;
		   }
		   catch(Exception e)
		   {
			   return false;
		   }
	   }
	   
	   
	   public boolean OpenFileIn_FactoringUploadsHistory()
	   {
		   try
		   {
			   WebElement openFileWebElement =new WebDriverWait(driver,100)
			   .until(ExpectedConditions.visibilityOfElementLocated(openFile_xpath));
			   openFileWebElement.isDisplayed();
			   
			   return true;
		   }
		   catch(Exception e)
		   {
			   return false;
		   }
	   }
	   
	   public boolean ImageFileIn_FactoringUploadsHistory()
	   {
		   try
		   {
			   WebElement imageFileWebElement =new WebDriverWait(driver,100)
			   .until(ExpectedConditions.visibilityOfElementLocated(imageFile_xpath));
			   imageFileWebElement.isDisplayed();
			   
			   return true;
		   }
		   catch(Exception e)
		   {
			   return false;
		   }
	   }
	   
	   public boolean VerfiySuccessMsg()
	   {
		   try
		   {
			   WebElement SuccessMsgWebElement =new WebDriverWait(driver,100)
			   .until(ExpectedConditions.visibilityOfElementLocated(successMsg_xpath));
			   SuccessMsgWebElement.isDisplayed();
			   
			   return true;
		   }
		   catch(Exception e)
		   {
			   return false;
		   }
	   }
	   
	   
	   public String TypeExpectedValue_FactoringFileUpload(String expectedValue)
	   {
		   try
		   {
			   WebElement expectedValueWebElement =new WebDriverWait(driver,100)
			   .until(ExpectedConditions.visibilityOfElementLocated(expectedValueTextBox_xpath));
			   expectedValueWebElement.isDisplayed();
			   expectedValueWebElement.sendKeys(expectedValue);
			   
		   }
		   catch(Exception e)
		   {
			   
		   }
		return expectedValue;
	   }
	   
	   
	   public boolean CollateralNamePopUp_FactoringFileUploadHirtory(String collateralName)
		 {
		 try
		 {
            WebElement collateralNamePopup_WebEelement =new WebDriverWait(driver,100)
		 	.until(ExpectedConditions.visibilityOfElementLocated(collateralNamePopup_xpath));
		 	String actual = collateralNamePopup_WebEelement.getText();
			if (actual.equals(collateralName))
				return true;
			else
				return false;

		    } 
		 catch (Exception e) 
		 {
			return false;
		  }
	  }
	   
	   public boolean FormatPopup_FactoringFileUploadHirtory(String formatType)
	   {
		   try
		   {
			   WebElement formatPopup_WebElement =new WebDriverWait(driver,100)
			   .until(ExpectedConditions.visibilityOfElementLocated(formatPopup_xpath));
			   String actual = formatPopup_WebElement.getText();
			   if(actual.equals(formatType))
			       return true;
			   else
				   return false;
		   }
		   catch(Exception e)
		   {
			   return false;
		   }
	   }
	   
	   public boolean ChooseFileBTN_click()
	   {
		   try
		   {
			   WebElement chooseFileBtnWebElement =new WebDriverWait(driver,100)
			   .until(ExpectedConditions.visibilityOfElementLocated(chooseFilesBTN_xpath));
			   chooseFileBtnWebElement.click();
			   
			   Thread.sleep(2000);
			   return true;
			   
			   
		   }
		   catch(Exception e)
		   {
			   
		   }
		return false;
	   }
	   
	   public boolean ChooseImageFileBTN_click()
	   {
		   try
		   {
			   WebElement chooseImageFileBtnWebElement =new WebDriverWait(driver,100)
			   .until(ExpectedConditions.visibilityOfElementLocated(chooseImageFileBTN_xpath));
			   chooseImageFileBtnWebElement.click();
			   
			   Thread.sleep(3000);
			   return true;
			   
			   
		   }
		   catch(Exception e)
		   {
			   
		   }
		return false;
	   }
	   
	   public String UploadImageFile(String imageFileName)
	   {
		   try
		   {
			   WebElement chooseFileBtnWebElement =new WebDriverWait(driver,100)
			   .until(ExpectedConditions.visibilityOfElementLocated(uploadImageFile_xpath));
			   chooseFileBtnWebElement.sendKeys(imageFileName);
			   
			   
		   }
		   catch(Exception e)
		   {
			   
		   }
		return imageFileName;
	   }
	   
	   
	   
	   public boolean ClearUploadFile_Click()
	   {
		   try
		   {
			   WebElement clearUploadFileWebElemnt =new WebDriverWait(driver,100)
			   .until(ExpectedConditions.elementToBeClickable(clearUploadFiles_xpath));
			   clearUploadFileWebElemnt.click();
			   
			   return true;
		   }
		   catch(Exception e)
		   {
			   return false;
		   }
	   }
	   
	   public boolean ClearUploadImageFile_Click()
	   {
		   try
		   {
			   WebElement clearUploadImageFileWebElement =new WebDriverWait(driver,100)
			   .until(ExpectedConditions.elementToBeClickable(clearUploadImageFiles_xpath));
			   clearUploadImageFileWebElement.click();
			   
			   return true;
		   }
		   catch(Exception e)
		   {
			   return false;
		   }
	   }
	   
	   
	   public boolean verifyDataFileType_FactFileUploadHistory(String dataFileType)
	   {
		   try
		   {
			   WebElement dataFileTypeWebElement=new WebDriverWait(driver,100)
			     .until(ExpectedConditions.visibilityOfElementLocated(dataFieldType_xpath));
			   dataFileTypeWebElement.isDisplayed();
			   String text = dataFileTypeWebElement.getText();
			   if(text.equals(dataFileType))
			   {
				   return true;
			   }
			   else
			   {
				   return false;
			   }
		   }
		   catch(Exception e)
		   {
			   return false;
		   }
	   }
	   
	   public boolean verifyCollateralName_FactFileUploadHistory(String collateralName)
	   {
		   try
		   {
			   WebElement collateralNameWebElement=new WebDriverWait(driver,100)
			     .until(ExpectedConditions.visibilityOfElementLocated(collateralName_xpath));
			   collateralNameWebElement.isDisplayed();
			   String text = collateralNameWebElement.getText();
			   if(text.equals(collateralName))
			   {
				   return true;
			   }
			   else
			   {
				   return false;
			   }
		   }
		   catch(Exception e)
		   {
			   return false;
		   }
	   }
	   

		public boolean  fileUPload_MappingARDetails_Factoring(){
			try {	
			StringSelection ss = new StringSelection("D:\\Workspace\\cyncautomation\\cyncautomation\\Cync_Automation_Project\\FileUpload\\Ar.xlsx");
			
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
			
			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
					
			Thread.sleep(3000);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return false;
		}
		
		public boolean  fileUPload_ImageFile_Factoring(){
			try {	
			StringSelection ss = new StringSelection("D:\\Workspace\\cyncautomation\\cyncautomation\\Cync_Automation_Project\\FileUpload\\Image.pdf");
			
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
			
			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
					
			Thread.sleep(3000);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return false;
		}


		public boolean addValueToExpectedValue(String expectedValueData) {

         try
         {
        	 WebElement ExpectedValueWebElement = new WebDriverWait(driver,100)
        	 .until(ExpectedConditions.visibilityOfElementLocated(expectedValue_xpath));
        	 ExpectedValueWebElement.sendKeys(expectedValueData);
        	 
        	/* Thread.sleep(5000);*/
        	 /*WebElement ExpectedValueWebElement_i = new WebDriverWait(driver,100)
        	 .until(ExpectedConditions.visibilityOfElementLocated(ChooseFile_xpath));
        	 ExpectedValueWebElement_i.click();*/
        	 
        	 return true;
         }
         catch(Exception e)
         {
        	 return false;
         }
			
		}
		
		 public boolean ClickCloseSuccessMSG_BTN()
		   {
			   try
			   {
				   WebElement closeSuccessMsgWebElement =new WebDriverWait(driver,100)
				   .until(ExpectedConditions.elementToBeClickable(closeSuccessBTN_xpath));
				   closeSuccessMsgWebElement.click();
				   
				   return true;
			   }
			   catch(Exception e)
			   {
				   return false;
			   }
		   }
}
