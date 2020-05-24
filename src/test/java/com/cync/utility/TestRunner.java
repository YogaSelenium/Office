package com.cync.utility;

import java.util.ArrayList;
import java.util.List;

import org.testng.TestListenerAdapter;
import org.testng.TestNG;

public class TestRunner {
	
	
	public static void main(String[] args) {
	
		TestNG testng = new TestNG();
		TestListenerAdapter adapter = new TestListenerAdapter();
		List<String> suites=new ArrayList<String>();
		testng.addListener(adapter);
		suites.add("D:/Cync_Project_Automation/cyncautomation/Cync_Automation_Project/MaintainARNo_SingleDivision1.xml");
		suites.add("D:/Cync_Project_Automation/cyncautomation/Cync_Automation_Project/MaintainARYes_SingleDivision1.xml");
		testng.setTestSuites(suites);
		testng.setParallel("parallel");
		testng.setSuiteThreadPoolSize(2);
		testng.setOutputDirectory("./Cync_Automation_Project/Reports");
		testng.run();
	}
}
