package com.cync.base;

import java.io.File;

import com.cync.utility.Utility_generics;
import com.relevantcodes.extentreports.ExtentReports;

public class ExtentManager {
static ExtentReports reports;
	
	public static ExtentReports getReporter(){
		if(reports == null) {
			reports = new ExtentReports("./Reports"+"/TestReport"+Utility_generics.getFormatedDateTime()+".html");
			reports.addSystemInfo("Idexcel.com", "QA Enviroment");
			reports.addSystemInfo("Author ", "CYNC Automation QA");
			reports.loadConfig(new File("Reports/ExtentConfig.xml"));
	}
		return reports;

}
}