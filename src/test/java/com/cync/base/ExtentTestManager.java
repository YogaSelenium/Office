package com.cync.base;

import java.util.HashMap;
import java.util.Map;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class ExtentTestManager {
	@SuppressWarnings("rawtypes")
	static Map extentTestMap=new HashMap();
	static ExtentReports reports=ExtentManager.getReporter();
	
	
	public static synchronized ExtentTest getTest() {
        return (ExtentTest)extentTestMap.get(Integer.valueOf((int)Thread.currentThread().getId()));
    }

    public static synchronized void endTest() {
    	reports.endTest((ExtentTest)extentTestMap.get(Integer.valueOf((int)Thread.currentThread().getId())));
    }

    public static synchronized ExtentTest startTest(String testName) {
        return startTest(testName, "");
    }

    @SuppressWarnings("unchecked")
	public static synchronized ExtentTest startTest(String testName, String desc) {
        ExtentTest test = reports.startTest(testName, desc);
        extentTestMap.put(Integer.valueOf((int)Thread.currentThread().getId()), test);
        return test;
    }
}
