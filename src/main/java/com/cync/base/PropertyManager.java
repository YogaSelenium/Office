package com.cync.base;

import java.util.Properties;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class PropertyManager {

	private static PropertyManager instance;
    private static final Object lock = new Object();
    private static String propertyFilePath = System.getProperty("user.dir")+
            "\\config\\config.properties";
    private static String url;
    private static String userName;
    private static String passWord;
    private static String lenderName;
    private static String clientName;
 
    //Create a Singleton instance. We need only one instance of Property Manager.
    public static PropertyManager getInstance () {
        if (instance == null) {
           synchronized (lock)
        	{
                instance = new PropertyManager();
                instance.loadData();
            }
        }
        return instance;
    }
 
    //Get all configuration data and assign to related fields.
    private void loadData() {
        //Declare a properties object
        Properties prop = new Properties();
 
        //Read configuration.properties file
        try {
            prop.load(new FileInputStream(propertyFilePath));
            //prop.load(this.getClass().getClassLoader().getResourceAsStream("configuration.properties"));
        } catch (IOException e) {
            System.out.println("Configuration properties file cannot be found");
        }
 
        //Get properties from configuration.properties
        url = prop.getProperty("url");
        userName = prop.getProperty("userName");
        passWord = prop.getProperty("passWord");
        lenderName=prop.getProperty("lenderName");
        clientName=prop.getProperty("clientName");
    }
 
    public String getURL () {
      return url;
    }
 
    public String getUsername () {
        return userName;
    }
 
    public String getPassword () {
        return passWord;
    }
    
	public String getLenderName() {
		return lenderName;
	}
	
	public String getClientName() {
		return clientName;
	}
	
}














