package com.cync.base;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.DateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.cync.pages.ActiveSession;
import com.cync.pages.AdjustmentReasonPage;
import com.cync.pages.CyncHomePage;
import com.cync.pages.LoginPage;
import com.relevantcodes.extentreports.LogStatus;

public abstract class BaseTest {
	public static WebDriver driver;
	//public static WebDriver driver2;
	DesiredCapabilities capability = new DesiredCapabilities();
	ChromeOptions options=null;
	public static CyncHomePage cyncHomePage;
	public static LoginPage login;
	public static ActiveSession activeSession;
	static Logger log = Logger.getLogger(AdjustmentReasonPage.class.getName());
	Map<WebDriver, String> drivers = new HashMap<>();
	static String url = PropertyManager.getInstance().getURL();
  //  static String url;
    
	//@Parameters({ "browserName", "localBrowserPath", "selGrid", "nodeURL","urll" })
	//@Parameters("browserName")
	@Parameters({ "browserName", "localBrowserPath", "selGrid", "nodeURL","un","pwd"})
	//@Parameters({"selGrid","nodeURL","browserName","localBrowserPath","un","pwd","url"})
	@BeforeTest(alwaysRun = true)
	//@BeforeClass(alwaysRun= true)
	//public void beforeMethod(@Optional("chrome") String browserName,@Optional("D:\\chromedriver.com") String localBrowserPath,@Optional("false") Boolean selGrid,@Optional("http://172.16.6.28:5555/wd/hub") String nodeURL,@Optional("https://staging.cyncsoftware.com"), String url,Method method) throws MalformedURLException {
	
	
	
	
	public void beforeMethod(@Optional("chrome") String browserName,@Optional("D:\\chromedriver.com") String localBrowserPath,@Optional("false") Boolean selGrid,@Optional("http://172.16.6.28:5555/wd/hub") String nodeURL,String un,String pwd) throws MalformedURLException {
		String log4jConfPath = "log4j.properties";
		PropertyConfigurator.configure(log4jConfPath);

		String thread = Thread.currentThread().getName();
	//	String thread2=Thread.currentThread().getName();
		//url1=url;
		
		
		switch (browserName.toUpperCase()) {

		case "HEADLESS":

			final String dir_localBrowserPath1 = System.getProperty("user.dir")+ "\\src\\test\\resources\\" + localBrowserPath;

			System.setProperty("webdriver.chrome.driver", dir_localBrowserPath1);

			capability = DesiredCapabilities.chrome();
			ChromeOptions chromeOptions = new ChromeOptions();
			chromeOptions.addArguments("--headless", "--disable-gpu","--window-size=1280,1024", "--ignore-certificate-errors");
			capability.setCapability(ChromeOptions.CAPABILITY, chromeOptions);
			capability.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
			// capability.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR,
			// true);
			capability.setPlatform(Platform.ANY);
			if (selGrid) {
				driver = new RemoteWebDriver(new URL(nodeURL), capability);
				log.info("execution started in the CHROME browser");
			} else {
				driver = new ChromeDriver(chromeOptions);
				log.info("execution started in the CHROME browser");
			}

			drivers.put(driver,thread);
			break;

		case "CHROME":

			final String dir_localBrowserPath2 = System.getProperty("user.dir")+ "\\src\\test\\resources\\" + localBrowserPath;

			System.setProperty("webdriver.chrome.driver", dir_localBrowserPath2);
			capability = DesiredCapabilities.chrome();
			options = new ChromeOptions();
			//options.addArguments("Web Test", "start-maximizing","no-default-browser-check");
			capability.setCapability(ChromeOptions.CAPABILITY, options);
			capability.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
			// capability.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR,
			// true);
			capability.setPlatform(Platform.ANY);
			if (selGrid) {
				System.out.println("ïnside sel grid chrome block");
				try {
					driver = new RemoteWebDriver(new URL(nodeURL), capability);
				} catch (Exception e) {
					e.printStackTrace();
				}
				log.info("execution started in the CHROME browser");
			} else {
				
				//ChromeOptions options = new ChromeOptions();
				//options.setCapability("marionette", true);
			//	driver = new ChromeDriver(options);
				driver=new ChromeDriver();
				log.info("execution started in the CHROME browser");
				//driver2=new ChromeDriver();
				
				//WebDriver WD = new ChromeDriver(options);
			}

			drivers.put(driver, thread);
			//drivers.put(driver, thread2);
			break;

		case "FIREFOX":
			
			
			
			final String dir_localBrowserPath4 = System.getProperty("user.dir")+ "\\exe\\" + localBrowserPath;

			System.setProperty("webdriver.gecko.driver", dir_localBrowserPath4);
			capability = DesiredCapabilities.firefox();
			capability.setCapability("marionette", true);
			capability.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
			capability.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR,true);
			if (selGrid) {
				driver = new RemoteWebDriver(new URL(nodeURL), capability);
			} else {
				driver = new FirefoxDriver();
			}
			drivers.put(driver, thread);
			break;

		case "IE":

			final String dir_localBrowserPath3 = System.getProperty("user.dir")+ "\\src\\test\\resources\\" + localBrowserPath;
			System.setProperty("webdriver.ie.driver", dir_localBrowserPath3);
			capability = DesiredCapabilities.internetExplorer();
			capability.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
			capability.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR,true);
			if (selGrid) {
				driver = new RemoteWebDriver(new URL(nodeURL), capability);
			} else {
				driver = new InternetExplorerDriver();
			}
			drivers.put(driver, thread);
			break;
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		log.info("maximizing the Browser");
		driver.manage().window().maximize();

		log.info("Passing the APP URL");
		driver.get(url);
		System.out.println(url);
		//this is for propetyfile use
	//	driver.get(BaseTest.url);
		driver.get(url);
		
		//System.out.println(BaseTest.url);
		System.out.println(url);
		
		 login=new LoginPage(driver);
		 // login=new LoginPage(driver2);
	 cyncHomePage=login.doLoginPassData(un, pwd);
		//Verify Active session
	 activeSession= new ActiveSession(driver);
     cyncHomePage=activeSession.verifyActiveSession();
	}
	//@AfterClass(alwaysRun=true)
		@AfterTest(alwaysRun = true)
		public void testDown(){

			driver.manage().deleteAllCookies();
			 log.info("Delete Cookies");

			driver.close();
	        driver.quit();
	        
	        log.info("Browser Closed");
			
		}
	
   @BeforeMethod(alwaysRun=true)	
   public void strtBrowswe(Method method){
	log.info("Retun to home page");
	
	ExtentTestManager.startTest(""+ method.getName());
}
	
   @AfterMethod(alwaysRun=true)
	 public void afterMethod(ITestResult result,Method method) throws Exception{
	 // int testStatus;
	        String fileName = "FAIL  - Error Message Generated on Details Reports";
	        String failMsg = "";
	        System.out.println("Working Directory = " + System.getProperty("user.dir"));
	        Date endDateTime;
	        String dateEndInString;
	        byte testStatus;
	        if(result.getStatus() == 2) {
	            endDateTime = new Date();
	            DateFormat shortDf = DateFormat.getDateTimeInstance(3, 3);
	            String currentDate = shortDf.format(endDateTime).toString().replace("/", "_");
	            currentDate = currentDate.toString().replace(" ", "_");
	            currentDate = currentDate.toString().replace(":", "_");
	            dateEndInString = "SC_error__" + currentDate;
	            fileName = System.getProperty("user.dir") + "\\Reports\\failure_screenshots\\" + dateEndInString + ".png";
	            takeScreenShot(BaseTest.driver, fileName);
	            ExtentTestManager.getTest().log(LogStatus.FAIL, "Error Screenshort" + ExtentTestManager.getTest().addScreenCapture(fileName));
	          //ExtentTestManager.getTest().log(LogStatus.FAIL, "Error Screenshort" + ExtentTestManager.getTest().addBase64ScreenShot(fileName));
	            ExtentTestManager.getTest().log(LogStatus.FAIL, result.getThrowable());
	            ExtentTestManager.getTest().log(LogStatus.FAIL, "Test Failed");
	            testStatus = 2;
	        } else if(result.getStatus() == 3) {
	            ExtentTestManager.getTest().log(LogStatus.SKIP, "Test skipped " + result.getThrowable());
	            testStatus = 3;
	        } else {
	            ExtentTestManager.getTest().log(LogStatus.PASS, "Test passed");
	            testStatus = 1;
	            Thread.sleep(500);
	            driver.get(url);
	            //driver.findElement(By.xpath("//img[@class='grayscale']")).click();
	            this.isAlertPresent();
	        }     
	        ExtentManager.getReporter().endTest(ExtentTestManager.getTest());
	        ExtentManager.getReporter().flush();
	       
	}


	

 public static void takeScreenShot(WebDriver driver, String filePath){
  TakesScreenshot scrShot = (TakesScreenshot)driver;
        File srcFile = (File)scrShot.getScreenshotAs(OutputType.FILE);
        File destFile = new File(filePath);
        try {
   FileUtils.copyFile(srcFile, destFile);
  } catch (IOException e) {
   // TODO Auto-generated catch block
   e.printStackTrace();
  }
  
        driver.get(url);
          
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
}



