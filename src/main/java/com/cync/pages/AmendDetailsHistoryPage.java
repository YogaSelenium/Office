package com.cync.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.SkipException;

import com.cync.base.BasePage;

public class AmendDetailsHistoryPage extends BasePage {
	private final By AmendDetailPage_xpath = By
			.xpath("//span[@class='paneltitle']");
	private final By IneligibleARField_xpath = By
		.xpath("//td[text()='Ineligibles']");
	private final By IneligibleCurrentAmount_xpath = By
		.xpath("//td[text()='45,900.00']");
	private final By PreviousValueIneligible_xpath = By
		.xpath("//table[@id='amend_details_list']/tbody/tr[2]/td[5]");
	private final By eligibleARField_xpath = By
		.xpath("//td[text()='Eligible AR']");
	private final By eligibleCurrentAmount_xpath = By
		.xpath("//table[@id='amend_details_list']/tbody/tr[3]/td[4]");
	private final By PreviousValueeligible_xpath = By
		.xpath("//table[@id='amend_details_list']/tbody/tr[3]/td[5]");
	
	private final By ARBorrowingARField_xpath = By
		.xpath("//td[text()='AR Borrowing Base']");
	private final By ARBorrowingCurrentAmount_xpath = By
		.xpath("//table[@id='amend_details_list']/tbody/tr[4]/td[4]");
	private final By PreviousValueARBorrowing_xpath = By.xpath("//table[@id='amend_details_list']/tbody/tr[4]/td[5]");
	

	private final By PreviousAmountIneligibleForMulDIv_xpath=By.xpath("//td[contains(text(),'547,655.00')]");
	private final By PreviousValueARBorrowingForMulDiv_xpath = By.xpath("//td[contains(text(),'1,105.50')]");
	private final By eligibleCurrentAmountForMulDiv_xpath = By.xpath("//td[contains(text(),'45,900.00')]");

	private final By PreviousAmountIneligibleForSummaryMulDIv_xpath=By.xpath("//td[contains(text(),'170,600.00')]");
	private final By PreviousValueARBorrowingForSummaryMulDiv_xpath = By.xpath("//td[contains(text(),'144,610.00')]");
	private final By eligibleCurrentAmountForSummaryMulDiv_xpath = By.xpath("//td[contains(text(),'290,900.00')]");
	private final By IneligibleCurrentAmountSumary_xpath = By.xpath("//td[contains(text(),'45,900.00')]");

	
public AmendDetailsHistoryPage(WebDriver driver) {
	super(driver);
	try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
}

public boolean verifyIneligiblesCurrentAmount(String IneligibleCurrentAmount) {
	try {
		WebElement IneligibleCurrentAmountWebElement = new WebDriverWait(
				driver, 50)
				.until(ExpectedConditions
						.visibilityOfElementLocated(IneligibleCurrentAmount_xpath));
		WebElement IneligibleARFieldWebElement = new WebDriverWait(
				driver, 50)
				.until(ExpectedConditions
						.visibilityOfElementLocated(IneligibleARField_xpath));

		IneligibleARFieldWebElement.isDisplayed();
		String actual = IneligibleCurrentAmountWebElement.getText().trim();
		if (actual.equals(IneligibleCurrentAmount))
			return true;
		else
			return false;

		
	
	} catch (Exception e) {
		return false;
	}
}

public boolean verifyIneligiblesPreviousAmount(String PreviousValueIneligibl) {
	try {
	    WebElement PreviousValueIneligibleWebElement = new WebDriverWait(
			driver, 50)
			.until(ExpectedConditions
					.visibilityOfElementLocated(PreviousValueIneligible_xpath));
	WebElement IneligibleARFieldWebElement = new WebDriverWait(
			driver, 50)
			.until(ExpectedConditions
					.visibilityOfElementLocated(IneligibleARField_xpath));

	IneligibleARFieldWebElement.isDisplayed();
	String actual = PreviousValueIneligibleWebElement.getText().trim();
	if (actual.equals(PreviousValueIneligibl))
		return true;
	else
		return false;

	} catch (Exception e) {
		return false;
	}
}



public boolean verifyeligiblesCurrentAmount(String eligibleCurrentAmount) {
	try {
		WebElement IneligibleCurrentAmountWebElement = new WebDriverWait(
				driver, 50)
				.until(ExpectedConditions
						.visibilityOfElementLocated(eligibleCurrentAmount_xpath));
		WebElement IneligibleARFieldWebElement = new WebDriverWait(
				driver, 50)
				.until(ExpectedConditions
						.visibilityOfElementLocated(eligibleARField_xpath));

		IneligibleARFieldWebElement.isDisplayed();
		String actual = IneligibleCurrentAmountWebElement.getText().trim();
		if (actual.equals(eligibleCurrentAmount))
			return true;
		else
			return false;

		
	
	} catch (Exception e) {
		return false;
	}
}

public boolean verifyeligiblesPreviousAmount(String PreviousValueeligibl) {
	try {
	    WebElement PreviousValueIneligibleWebElement = new WebDriverWait(
			driver, 50)
			.until(ExpectedConditions
					.visibilityOfElementLocated(PreviousValueeligible_xpath));
	WebElement IneligibleARFieldWebElement = new WebDriverWait(
			driver, 50)
			.until(ExpectedConditions
					.visibilityOfElementLocated(eligibleARField_xpath));

	IneligibleARFieldWebElement.isDisplayed();
	String actual = PreviousValueIneligibleWebElement.getText().trim();
	if (actual.equals(PreviousValueeligibl))
		return true;
	else
		return false;

	} catch (Exception e) {
		return false;
	}
}
public boolean verifyARBorrowingBaseCurrentAmount(String ARBorrowingCurrentAmount) {
	try {
		WebElement IneligibleCurrentAmountWebElement = new WebDriverWait(
				driver, 50)
				.until(ExpectedConditions
						.visibilityOfElementLocated(eligibleCurrentAmount_xpath));
		WebElement IneligibleARFieldWebElement = new WebDriverWait(
				driver, 50)
				.until(ExpectedConditions
						.visibilityOfElementLocated(eligibleARField_xpath));

		IneligibleARFieldWebElement.isDisplayed();
		String actual = IneligibleCurrentAmountWebElement.getText().trim();
		if (actual.equals(ARBorrowingCurrentAmount))
			return true;
		else
			return false;

		
	
	} catch (Exception e) {
		return false;
	}
}

public boolean verifyARBorrowingBasePreviousAmount(String PreviousValueARBorrowing) {
	try {
	    WebElement PreviousValueIneligibleWebElement = new WebDriverWait(
			driver, 50)
			.until(ExpectedConditions
					.visibilityOfElementLocated(PreviousValueeligible_xpath));
	WebElement IneligibleARFieldWebElement = new WebDriverWait(
			driver, 50)
			.until(ExpectedConditions
					.visibilityOfElementLocated(eligibleARField_xpath));

	IneligibleARFieldWebElement.isDisplayed();
	String actual = PreviousValueIneligibleWebElement.getText().trim();
	if (actual.equals(PreviousValueARBorrowing))
		return true;
	else
		return false;

	} catch (Exception e) {
		return false;
	}
}


public boolean verifyIneligiblesPreviousAmountForMulDiv(String PreviousValueIneligibl) {
    try {
        WebElement PreviousValueIneligibleWebElement = new WebDriverWait(
            driver, 50)
            .until(ExpectedConditions
                    .visibilityOfElementLocated(PreviousAmountIneligibleForMulDIv_xpath));
    WebElement IneligibleARFieldWebElement = new WebDriverWait(
            driver, 50)
            .until(ExpectedConditions
                    .visibilityOfElementLocated(IneligibleARField_xpath));
 
    IneligibleARFieldWebElement.isDisplayed();
    String actual = PreviousValueIneligibleWebElement.getText().trim();
    if (actual.equals(PreviousValueIneligibl))
        return true;
    else
        return false;
 
    } catch (Exception e) {
        return false;
    }
}

public boolean verifyARBorrowingBasePreviousAmountForMulDiv(String PreviousValueARBorrowing) {
    try {
        WebElement PreviousValueIneligibleWebElement = new WebDriverWait(
            driver, 50)
            .until(ExpectedConditions
                    .visibilityOfElementLocated(PreviousValueARBorrowingForMulDiv_xpath));
    WebElement IneligibleARFieldWebElement = new WebDriverWait(
            driver, 50)
            .until(ExpectedConditions
                    .visibilityOfElementLocated(ARBorrowingARField_xpath));
 
    IneligibleARFieldWebElement.isDisplayed();
    String actual = PreviousValueIneligibleWebElement.getText().trim();
    if (actual.equals(PreviousValueARBorrowing))
        return true;
    else
        return false;
 
    } catch (Exception e) {
        return false;
    }
}
public boolean verifyeligiblesCurrentAmountForMulDiv(String eligibleCurrentAmount) {
    try {
        WebElement IneligibleCurrentAmountWebElement = new WebDriverWait(
                driver, 50)
                .until(ExpectedConditions
                        .visibilityOfElementLocated(eligibleCurrentAmountForMulDiv_xpath));
        WebElement IneligibleARFieldWebElement = new WebDriverWait(
                driver, 50)
                .until(ExpectedConditions
                        .visibilityOfElementLocated(eligibleARField_xpath));
 
        IneligibleARFieldWebElement.isDisplayed();
        String actual = IneligibleCurrentAmountWebElement.getText().trim();
        if (actual.equals(eligibleCurrentAmount))
            return true;
        else
            return false;
 
        
    
    } catch (Exception e) {
        return false;
    }
}
 
public boolean verifyARBorrowingBasePreviousAmountSummary(String PreviousValueARBorrowing) {
	try {
	    WebElement PreviousValueIneligibleWebElement = new WebDriverWait(
			driver, 50)
			.until(ExpectedConditions
					.visibilityOfElementLocated(PreviousValueARBorrowing_xpath));
	WebElement IneligibleARFieldWebElement = new WebDriverWait(
			driver, 50)
			.until(ExpectedConditions
					.visibilityOfElementLocated(ARBorrowingARField_xpath));

	IneligibleARFieldWebElement.isDisplayed();
	String actual = PreviousValueIneligibleWebElement.getText().trim();
	if (actual.equals(PreviousValueARBorrowing))
		return true;
	else
		return false;

	} catch (Exception e) {
		return false;
	}
}


public boolean verifyIneligiblesPreviousAmountForSummaryMulDiv(String PreviousValueIneligibl) {
    try {
        WebElement PreviousValueIneligibleWebElement = new WebDriverWait(
            driver, 50)
            .until(ExpectedConditions
                    .visibilityOfElementLocated(PreviousAmountIneligibleForSummaryMulDIv_xpath));
    WebElement IneligibleARFieldWebElement = new WebDriverWait(
            driver, 50)
            .until(ExpectedConditions
                    .visibilityOfElementLocated(IneligibleARField_xpath));
 
    IneligibleARFieldWebElement.isDisplayed();
    String actual = PreviousValueIneligibleWebElement.getText().trim();
    if (actual.equals(PreviousValueIneligibl))
        return true;
    else
        return false;
 
    } catch (Exception e) {
        return false;
    }
}

public boolean verifyARBorrowingBasePreviousAmountForSummaryMulDiv(String PreviousValueARBorrowing) {
    try {
        WebElement PreviousValueIneligibleWebElement = new WebDriverWait(
            driver, 50)
            .until(ExpectedConditions
                    .visibilityOfElementLocated(PreviousValueARBorrowingForSummaryMulDiv_xpath));
    WebElement IneligibleARFieldWebElement = new WebDriverWait(
            driver, 50)
            .until(ExpectedConditions
                    .visibilityOfElementLocated(ARBorrowingARField_xpath));
 
    IneligibleARFieldWebElement.isDisplayed();
    String actual = PreviousValueIneligibleWebElement.getText().trim();
    if (actual.equals(PreviousValueARBorrowing))
        return true;
    else
        return false;
 
    } catch (Exception e) {
        return false;
    }
}
public boolean verifyeligiblesCurrentAmountForSummaryMulDiv(String eligibleCurrentAmount) {
    try {
        WebElement IneligibleCurrentAmountWebElement = new WebDriverWait(
                driver, 50)
                .until(ExpectedConditions
                        .visibilityOfElementLocated(eligibleCurrentAmountForSummaryMulDiv_xpath));
        WebElement IneligibleARFieldWebElement = new WebDriverWait(
                driver, 50)
                .until(ExpectedConditions
                        .visibilityOfElementLocated(eligibleARField_xpath));
 
        IneligibleARFieldWebElement.isDisplayed();
        String actual = IneligibleCurrentAmountWebElement.getText().trim();
        if (actual.equals(eligibleCurrentAmount))
            return true;
        else
            return false;
 
        
    
    } catch (Exception e) {
        return false;
    }
}
public boolean verifyIneligiblesCurrentAmountSummary(String IneligibleCurrentAmount) {
	try {
		WebElement IneligibleCurrentAmountWebElement = new WebDriverWait(
				driver, 50)
				.until(ExpectedConditions
						.visibilityOfElementLocated(IneligibleCurrentAmountSumary_xpath));
		WebElement IneligibleARFieldWebElement = new WebDriverWait(
				driver, 50)
				.until(ExpectedConditions
						.visibilityOfElementLocated(IneligibleARField_xpath));

		IneligibleARFieldWebElement.isDisplayed();
		String actual = IneligibleCurrentAmountWebElement.getText().trim();
		if (actual.equals(IneligibleCurrentAmount))
			return true;
		else
			return false;

		
	
	} catch (Exception e) {
		return false;
	}
}

}
