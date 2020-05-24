package com.cync.FactoringPageBreak;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class ParallaelDemo {

	//WebDriver driver=null;
	
	@Test
	public void test1() throws InterruptedException{
		//String projectpath=System.getProperty("user.dir");
		//System.setProperty(, value)
		String localBrowserPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",localBrowserPath+"\\src\\test\\resources\\FactoringTestRunner\\chromedriver.exe" );
		 WebDriver driver=new ChromeDriver();
		
		
		
		driver.get("https://www.google.com");
		System.out.println("in mtd 1 : "+Thread.currentThread().getId());
		Thread.sleep(3000);
	}
	@Test
	public void test2() throws InterruptedException{
		//String projectpath=System.getProperty("user.dir");
		//System.setProperty(, value)
		String localBrowserPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",localBrowserPath+"/exe/chromedriver/chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		
		System.out.println("in mtd 2 : "+Thread.currentThread().getId());
		
		driver.get("https://www.flipkart.com");
		Thread.sleep(3000);
	}
}
