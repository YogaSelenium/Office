package com.cync.pages;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.SkipException;

import com.cync.base.BasePage;

public class BBCDocumentsPage extends BasePage {

        private final By BBCDocumentHeader_xpath=By.xpath("//span[@class='paneltitle']");
        private final By ReceivableUploadeValidation_xpath=By.xpath("//a[text()='summary_file.xlsx']");
        private final By InventoryUploadeValidation_xpath=By.xpath("//a[text()='Inventory.xlsx']");
        private final By PaybleUploadeValidation_xpath=By.xpath("//a[text()='apsumarypayble.xlsx']");
        private final By ReceivableUploadeValidationSecondBBC_xpath=By.xpath("//a[text()='summaryfile1.xlsx']");
        private final By InventoryUploadeValidationSecondBBC_xpath=By.xpath("//a[text()='inventoryfile2.xlsx']");
        private final By PaybleUploadeValidationSecondBBC_xpath=By.xpath("//a[text()='summarypayables.xlsx']");
        private final By ReceivableUploadeValidationDetailFirstBBC_xpath=By.xpath("//a[text()='newARAllBuckets.xlsx']");
        private final By InventoryUploadeValidationDetailFirstBBC_xpath=By.xpath("//a[text()='Assetinventorynew.xlsx']");
        private final By PaybleUploadeValidationDetailFirstBBC_xpath=By.xpath("//a[text()='apdetail052012.xlsx']");
        private final By ReceivableUploadeValidationDetailSecondBBC_xpath=By.xpath("//a[text()='newARAllBucketsFor2ndBBC.xlsx']");
        private final By InventoryUploadeValidationDetailSecondBBC_xpath=By.xpath("//a[text()='Assetinventorynewfor2ndBBC.xlsx']");
        private final By PaybleUploadeValidationDetailSecondBBC_xpath=By.xpath("//a[text()='APDetailsnewAllBucketsfor2ndBBC.xlsx']");
        
        //anusha
        private final By Receivables1UploadValidation_xpath=By.xpath("//a[contains(text(),'newARAllBuckets.xlsx')]");
        private final By Receivables1DIV1UploadValidation_xpath=By.xpath("//a[contains(text(),'newARAllBuckets1Div1.xlsx')]");
        private final By Receivables2UploadValidation_xpath=By.xpath("//a[contains(text(),'newARAllBuckets2.xlsx')]");
        private final By Receivables3DIV2UploadValidation_xpath=By.xpath("//a[contains(text(),'newARAllBuckets3Div2.xlsx')]");
        private final By ClickOnNextButton_xpath=By.xpath("//a[contains(text(),'Next ›')]");
        private final By AssetInventory1UploadValidation_xpath=By.xpath("//a[contains(text(),'Assetinventorynew.xlsx')]");
        private final By AssetInventory1DIV1UploadValidation_xpath=By.xpath("//a[contains(text(),'Assetinventorynew1Div1.xlsx')]");
        private final By AssetInventory2UploadValidation_xpath=By.xpath("//a[contains(text(),'Assetinventorynew2.xlsx')]");
        private final By AssetInventory2DIV2UploadValidation_xpath=By.xpath("//a[contains(text(),'Assetinventorynew3Div2.xlsx')]");
        private final By Payables1UploadValidation_xpath=By.xpath("//a[contains(text(),'APDetails.xlsx')]");
        private final By Payables1DIV1UploadValidation_xpath=By.xpath("//a[contains(text(),'APDetails1Div1.xlsx')]");
        private final By Payables2UploadValidation_xpath=By.xpath("//a[contains(text(),'APDetails2.xlsx')]");

        private final By Payables3DIV2UploadValidation_xpath=By.xpath("//a[contains(text(),'APDetails3DIV')]");
        private final By Summary1UploadValidation_xpath=By.xpath("//a[contains(text(),'newARSummary1.xlsx')]");
        private final By SummaryReceivables2UploadValidation_xpath=By.xpath("//a[contains(text(),'newARSummary2.xlsx')]");
        private final By SummaryReceivables1DIV1UploadValidation_xpath=By.xpath("//a[contains(text(),'newARSummary1Div1.xlsx')]");
        private final By SummaryReceivables3DIV2UploadValidation_xpath=By.xpath("//a[contains(text(),'newARSummary2Div2.xlsx')]");
        private final By SummaryPayables1UploadValidation_xpath=By.xpath("//a[contains(text(),'APSummary.xlsx')]");
        private final By SummaryPayables1DIV1UploadValidation_xpath=By.xpath("//a[contains(text(),'APSummary1DIV1.xlsx')]");
        private final By SummaryPayables2UploadValidation_xpath=By.xpath("//a[contains(text(),'APSummary2.xlsx')]");
        private final By SummaryPayables3DIV2UploadValidation_xpath=By.xpath("//a[contains(text(),'APSummary2DIV2.xlsx')]");

     
        private final By PreviousBTN_xpath = By.xpath("//a[contains(text(),'Prev')]");
        
        
    public BBCDocumentsPage(WebDriver driver) throws InterruptedException {
    	super(driver);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
    
    public boolean isAlertPresent() {
		boolean presentFlag = false;

		try {
			Alert alert = driver.switchTo().alert();
			presentFlag = true;
			alert.accept();
		} catch (Exception ex) {

			System.out.println("No Such Alert Present");

		}

		return presentFlag;
    }
    
    public boolean ReceivableUploadeValidation(String expected) {
	try {

		WebElement ReceivableUploadeValidationWebElement = new WebDriverWait(
				driver, 10).until(ExpectedConditions
				.visibilityOfElementLocated(ReceivableUploadeValidation_xpath));

		String actual = ReceivableUploadeValidationWebElement.getText();
		if (actual.equals(expected))
			return true;
		else
			return false;

	} catch (Exception e) {
		return false;
	}
}
    
    public boolean InventoryUploadeValidation(String expected) {
	try {

		WebElement InventoryUploadeValidationWebElement = new WebDriverWait(
				driver, 10).until(ExpectedConditions
				.visibilityOfElementLocated(InventoryUploadeValidation_xpath));

		String actual = InventoryUploadeValidationWebElement.getText();
		if (actual.equals(expected))
			return true;
		else
			return false;

	} catch (Exception e) {
		return false;
	}
}
    
    public boolean PaybleUploadeValidation(String expected) {
	try {

		WebElement PaybleUploadeValidationWebElement = new WebDriverWait(
				driver, 10).until(ExpectedConditions
				.visibilityOfElementLocated(PaybleUploadeValidation_xpath));

		String actual = PaybleUploadeValidationWebElement.getText();
		if (actual.equals(expected))
			return true;
		else
			return false;

	} catch (Exception e) {
		return false;
	}
}
    public boolean ReceivableUploadeValidationSecondBBC(String expected) {
  	try {

  		WebElement ReceivableUploadeValidationWebElement = new WebDriverWait(
  				driver, 10).until(ExpectedConditions
  				.visibilityOfElementLocated(ReceivableUploadeValidationSecondBBC_xpath));

  		String actual = ReceivableUploadeValidationWebElement.getText();
  		if (actual.equals(expected))
  			return true;
  		else
  			return false;

  	} catch (Exception e) {
  		return false;
  	}
  }
      
      public boolean InventoryUploadeValidationSecondBBC(String expected) {
  	try {

  		WebElement InventoryUploadeValidationWebElement = new WebDriverWait(
  				driver, 10).until(ExpectedConditions
  				.visibilityOfElementLocated(InventoryUploadeValidationSecondBBC_xpath));

  		String actual = InventoryUploadeValidationWebElement.getText();
  		if (actual.equals(expected))
  			return true;
  		else
  			return false;

  	} catch (Exception e) {
  		return false;
  	}
  }
      
      public boolean PaybleUploadeValidationSecondBBC(String expected) {
  	try {

  		WebElement PaybleUploadeValidationWebElement = new WebDriverWait(
  				driver, 10).until(ExpectedConditions
  				.visibilityOfElementLocated(PaybleUploadeValidationSecondBBC_xpath));

  		String actual = PaybleUploadeValidationWebElement.getText();
  		if (actual.equals(expected))
  			return true;
  		else
  			return false;

  	} catch (Exception e) {
  		return false;
  	}
  }
      
      
      public boolean ReceivableUploadeValidationDetailFirstBBC(String expected) {
		try {

			WebElement ReceivableUploadeValidationWebElement = new WebDriverWait(
					driver, 10).until(ExpectedConditions
					.visibilityOfElementLocated(ReceivableUploadeValidationDetailFirstBBC_xpath));

			String actual = ReceivableUploadeValidationWebElement.getText();
			if (actual.equals(expected))
				return true;
			else
				return false;

		} catch (Exception e) {
			return false;
		}
	}
	    
	    public boolean InventoryUploadeValidationDetailFirstBBC(String expected) {
		try {

			WebElement InventoryUploadeValidationWebElement = new WebDriverWait(
					driver, 10).until(ExpectedConditions
					.visibilityOfElementLocated(InventoryUploadeValidationDetailFirstBBC_xpath));

			String actual = InventoryUploadeValidationWebElement.getText();
			if (actual.equals(expected))
				return true;
			else
				return false;

		} catch (Exception e) {
			return false;
		}
	}
	    
	    public boolean PaybleUploadeValidationDetailFirstBBC(String expected) {
		try {

			WebElement PaybleUploadeValidationWebElement = new WebDriverWait(
					driver, 10).until(ExpectedConditions
					.visibilityOfElementLocated(PaybleUploadeValidationDetailFirstBBC_xpath));

			String actual = PaybleUploadeValidationWebElement.getText();
			if (actual.equals(expected))
				return true;
			else
				return false;

		} catch (Exception e) {
			return false;
		}
	}
	    
	    public boolean ReceivableUploadeValidationDetailSecondBBC(String expected) {
		try {

			WebElement ReceivableUploadeValidationWebElement = new WebDriverWait(
					driver, 10).until(ExpectedConditions
					.visibilityOfElementLocated(ReceivableUploadeValidationDetailSecondBBC_xpath));

			String actual = ReceivableUploadeValidationWebElement.getText();
			if (actual.equals(expected))
				return true;
			else
				return false;

		} catch (Exception e) {
			return false;
		}
	}
	    
	    public boolean InventoryUploadeValidationDetailSecondBBC(String expected) {
		try {

			WebElement InventoryUploadeValidationWebElement = new WebDriverWait(
					driver, 10).until(ExpectedConditions
					.visibilityOfElementLocated(InventoryUploadeValidationDetailSecondBBC_xpath));

			String actual = InventoryUploadeValidationWebElement.getText();
			if (actual.equals(expected))
				return true;
			else
				return false;

		} catch (Exception e) {
			return false;
		}
	}
	    
	    public boolean PaybleUploadeValidationDetailSecondBBC(String expected) {
		try {

			WebElement PaybleUploadeValidationWebElement = new WebDriverWait(
					driver, 10).until(ExpectedConditions
					.visibilityOfElementLocated(PaybleUploadeValidationDetailSecondBBC_xpath));

			String actual = PaybleUploadeValidationWebElement.getText();
			if (actual.equals(expected))
				return true;
			else
				return false;

		} catch (Exception e) {
			return false;
		}
	}
	    //anusha
	    public boolean Receivable1UploadeValidationDetailFirstBBC(String expected) {
			try {

				WebElement ReceivableUploadeValidationWebElement = new WebDriverWait(
						driver, 10).until(ExpectedConditions
						.visibilityOfElementLocated(Receivables1UploadValidation_xpath));

				String actual = ReceivableUploadeValidationWebElement.getText();
				if (actual.equals(expected))
					return true;
				else
					return false;

			} catch (Exception e) {
				return false;
			}
		}
	    public boolean Receivable1DIV1UploadeValidationDetailFirstBBC(String expected1) {
			try {

				WebElement ReceivableUploadeValidationWebElement = new WebDriverWait(
						driver, 10).until(ExpectedConditions
						.visibilityOfElementLocated(Receivables1DIV1UploadValidation_xpath));

				String actual = ReceivableUploadeValidationWebElement.getText();
				if (actual.equals(expected1))
					return true;
				else
					return false;

			} catch (Exception e) {
				return false;
			}
		}
	    public boolean Receivable2UploadeValidationDetailFirstBBC(String expected2) {
			try {

				WebElement ReceivableUploadeValidationWebElement = new WebDriverWait(
						driver, 10).until(ExpectedConditions
						.visibilityOfElementLocated(Receivables2UploadValidation_xpath));

				String actual = ReceivableUploadeValidationWebElement.getText();
				if (actual.equals(expected2))
					return true;
				else
					return false;

			} catch (Exception e) {
				return false;
			}
		}
	    public boolean Receivable2DIV2UploadeValidationDetailFirstBBC(String expected3) {
			try {

				WebElement ReceivableUploadeValidationWebElement = new WebDriverWait(
						driver, 10).until(ExpectedConditions
						.visibilityOfElementLocated(Receivables3DIV2UploadValidation_xpath));

				String actual = ReceivableUploadeValidationWebElement.getText();
				if (actual.equals(expected3))
					return true;
				else
					return false;

			} catch (Exception e) {
				return false;
			}
		}
	    public boolean ClickOnNextButton() {
			try {

				WebElement ReceivableUploadeValidationWebElement = new WebDriverWait(
						driver, 10).until(ExpectedConditions
						.visibilityOfElementLocated(ClickOnNextButton_xpath));
				ReceivableUploadeValidationWebElement.click();
		        this.isAlertPresent();
				//Thread.sleep(3000);

				return true;

			} catch (Exception e) {
				
			}
			return false;
		}
	    
	    public boolean ClickOnPrevButton() {
			try {

				WebElement ReceivableUploadeValidationWebElement = new WebDriverWait(
						driver, 10).until(ExpectedConditions
						.visibilityOfElementLocated(PreviousBTN_xpath));
				ReceivableUploadeValidationWebElement.click();
		        this.isAlertPresent();
				//Thread.sleep(3000);

				return true;

			} catch (Exception e) {
				
			}
			return false;
		}
	    
	    
	    public boolean AssetInventory1UploadeValidationDetailFirstBBC(String expected) {
			try {

				WebElement AssetInventoryUploadeValidationWebElement = new WebDriverWait(
						driver, 10).until(ExpectedConditions
						.visibilityOfElementLocated(AssetInventory1UploadValidation_xpath));

				String actual = AssetInventoryUploadeValidationWebElement.getText();
				if (actual.equals(expected))
					return true;
				else
					return false;

			} catch (Exception e) {
				return false;
			}
		}
	    public boolean AssetInventory1DIV1UploadeValidationDetailFirstBBC(String expected1) {
			try {

				WebElement AssetInventoryUploadeValidationWebElement = new WebDriverWait(
						driver, 10).until(ExpectedConditions
						.visibilityOfElementLocated(AssetInventory1DIV1UploadValidation_xpath));

				String actual = AssetInventoryUploadeValidationWebElement.getText();
				if (actual.equals(expected1))
					return true;
				else
					return false;

			} catch (Exception e) {
				return false;
			}
		}
	    public boolean AssetInventory2UploadeValidationDetailFirstBBC(String expected2) {
			try {

				WebElement AssetInventoryUploadeValidationWebElement = new WebDriverWait(
						driver, 10).until(ExpectedConditions
						.visibilityOfElementLocated(AssetInventory2UploadValidation_xpath));

				String actual = AssetInventoryUploadeValidationWebElement.getText();
				if (actual.equals(expected2))
					return true;
				else
					return false;

			} catch (Exception e) {
				return false;
			}
		}
	    public boolean AssetInventory2DIV2UploadeValidationDetailFirstBBC(String expected3) {
			try {

				WebElement AssetInventoryUploadeValidationWebElement = new WebDriverWait(
						driver, 10).until(ExpectedConditions
						.visibilityOfElementLocated(AssetInventory2DIV2UploadValidation_xpath));

				String actual = AssetInventoryUploadeValidationWebElement.getText();
				if (actual.equals(expected3))
					return true;
				else
					return false;

			} catch (Exception e) {
				return false;
			}
		}
	    
	    public boolean Payables1UploadeValidationDetailFirstBBC(String expected) {
			try {

				WebElement PayablesUploadeValidationWebElement = new WebDriverWait(
						driver, 10).until(ExpectedConditions
						.visibilityOfElementLocated(Payables1UploadValidation_xpath));

				String actual = PayablesUploadeValidationWebElement.getText();
				if (actual.equals(expected))
					return true;
				else
					return false;

			} catch (Exception e) {
				return false;
			}
		}
	    public boolean Payables1DIV1UploadeValidationDetailFirstBBC(String expected1) {
			try {

				WebElement PayablesUploadeValidationWebElement = new WebDriverWait(
						driver, 10).until(ExpectedConditions
						.visibilityOfElementLocated(Payables1DIV1UploadValidation_xpath));

				String actual = PayablesUploadeValidationWebElement.getText();
				if (actual.equals(expected1))
					return true;
				else
					return false;

			} catch (Exception e) {
				return false;
			}
		}
	    public boolean Payables2UploadeValidationDetailFirstBBC(String expected2) {
			try {

				WebElement PayablesUploadeValidationWebElement = new WebDriverWait(
						driver, 10).until(ExpectedConditions
						.visibilityOfElementLocated(Payables2UploadValidation_xpath));

				String actual = PayablesUploadeValidationWebElement.getText();
				if (actual.equals(expected2))
					return true;
				else
					return false;

			} catch (Exception e) {
				return false;
			}
		}
	    public boolean Payables2DIV2UploadeValidationDetailFirstBBC(String expected3) {
			try {

				WebElement PayablesUploadeValidationWebElement = new WebDriverWait(
						driver, 10).until(ExpectedConditions
						.visibilityOfElementLocated(Payables3DIV2UploadValidation_xpath));

				String actual = PayablesUploadeValidationWebElement.getText();
				if (actual.equals(expected3))
					return true;
				else
					return false;

			} catch (Exception e) {
				return false;
			}
		}
	    
	    //anusha
	    
	    public boolean Receivable1UploadeValidationSummaryFirstBBC(String expected) {
			try {

				WebElement ReceivableUploadeValidationWebElement = new WebDriverWait(
						driver, 10).until(ExpectedConditions
						.visibilityOfElementLocated(Summary1UploadValidation_xpath));

				String actual = ReceivableUploadeValidationWebElement.getText();
				if (actual.equals(expected))
					return true;
				else
					return false;

			} catch (Exception e) {
				return false;
			}
		}
	    public boolean Receivable1DIV1UploadeValidationsummaryFirstBBC(String expected1) {
			try {

				WebElement ReceivableUploadeValidationWebElement = new WebDriverWait(
						driver, 10).until(ExpectedConditions
						.visibilityOfElementLocated(SummaryReceivables1DIV1UploadValidation_xpath));

				String actual = ReceivableUploadeValidationWebElement.getText();
				if (actual.equals(expected1))
					return true;
				else
					return false;

			} catch (Exception e) {
				return false;
			}
		}
	    public boolean Receivable2UploadeValidationSummaryFirstBBC(String expected2) {
			try {

				WebElement ReceivableUploadeValidationWebElement = new WebDriverWait(
						driver, 10).until(ExpectedConditions
						.visibilityOfElementLocated(SummaryReceivables2UploadValidation_xpath));

				String actual = ReceivableUploadeValidationWebElement.getText();
				if (actual.equals(expected2))
					return true;
				else
					return false;

			} catch (Exception e) {
				return false;
			}
		}
	    public boolean Receivable2DIV2UploadeValidationSummaryFirstBBC(String expected3) {
			try {

				WebElement ReceivableUploadeValidationWebElement = new WebDriverWait(
						driver, 10).until(ExpectedConditions
						.visibilityOfElementLocated(SummaryReceivables3DIV2UploadValidation_xpath));

				String actual = ReceivableUploadeValidationWebElement.getText();
				if (actual.equals(expected3))
					return true;
				else
					return false;

			} catch (Exception e) {
				return false;
			}
		}
	    public boolean SummaryPayables1UploadeValidationDetailFirstBBC(String expected) {
			try {

				WebElement PayablesUploadeValidationWebElement = new WebDriverWait(
						driver, 10).until(ExpectedConditions
						.visibilityOfElementLocated(SummaryPayables1UploadValidation_xpath));

				String actual = PayablesUploadeValidationWebElement.getText();
				if (actual.equals(expected))
					return true;
				else
					return false;

			} catch (Exception e) {
				return false;
			}
		}
	    public boolean SummaryPayables1DIV1UploadeValidationDetailFirstBBC(String expected1) {
			try {

				WebElement PayablesUploadeValidationWebElement = new WebDriverWait(
						driver, 10).until(ExpectedConditions
						.visibilityOfElementLocated(SummaryPayables1DIV1UploadValidation_xpath));

				String actual = PayablesUploadeValidationWebElement.getText();
				if (actual.equals(expected1))
					return true;
				else
					return false;

			} catch (Exception e) {
				return false;
			}
		}
	    public boolean SummaryPayables2UploadeValidationDetailFirstBBC(String expected2) {
			try {

				WebElement PayablesUploadeValidationWebElement = new WebDriverWait(
						driver, 10).until(ExpectedConditions
						.visibilityOfElementLocated(SummaryPayables2UploadValidation_xpath));

				String actual = PayablesUploadeValidationWebElement.getText();
				if (actual.equals(expected2))
					return true;
				else
					return false;

			} catch (Exception e) {
				return false;
			}
		}
	    public boolean SummaryPayables2DIV2UploadeValidationDetailFirstBBC(String expected3) {
			try {

				WebElement PayablesUploadeValidationWebElement = new WebDriverWait(
						driver, 10).until(ExpectedConditions
						.visibilityOfElementLocated(SummaryPayables3DIV2UploadValidation_xpath));

				String actual = PayablesUploadeValidationWebElement.getText();
				if (actual.equals(expected3))
					return true;
				else
					return false;

			} catch (Exception e) {
				return false;
			}
		}
	    
	    
	    
}
