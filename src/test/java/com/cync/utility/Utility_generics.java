package com.cync.utility;

import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class Utility_generics {
	
	public static String getFormatedDateTime(){
		SimpleDateFormat sd = new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss");
		return sd.format(new Date());
	}
	
	public static String getPageScreenShot(WebDriver driver, String imageFolderPath){
		String imagePath=imageFolderPath+"/"+getFormatedDateTime()+".png";
		EventFiringWebDriver edriver=new EventFiringWebDriver(driver);
		try{
			FileUtils.copyFile(edriver.getScreenshotAs(OutputType.FILE), new File(imagePath));
		}catch(Exception e){
			
		}
		return imagePath;
		
	}

	public static void getDesktopScreenshot(String folder)  {
		try{
		SimpleDateFormat s=new SimpleDateFormat("DD_MM_YYYY_hh_mm_ss");
		String res=s.format(new Date());
		System.out.println(res);
		//get size of desktop
		Dimension d=Toolkit.getDefaultToolkit().getScreenSize();
		//desktop area
		Rectangle screenRect= new Rectangle(d);
		//take that area screen shot
		Robot r=new Robot();
		BufferedImage img=r.createScreenCapture(screenRect);
		//create new file
		File output=new File(folder+res+".png");
		//paste it
		ImageIO.write(img, "png", output);
		System.out.println("done");
		}
		catch(Exception e){
			
		}
	}
	
}
