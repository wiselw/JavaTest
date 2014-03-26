package com.framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

final class Browser extends Base {
//
	static WebDriver getIeDriver(){
        String dir_name = "D:\\Personal\\Driver\\IEDriverServer.exe"; 
        System.setProperty("webdriver.ie.driver",dir_name);
        DesiredCapabilities ieCapabilities = DesiredCapabilities.internetExplorer();   
        ieCapabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);   
        WebDriver ie = new InternetExplorerDriver(ieCapabilities);
        return ie;
    }
    /**
     * Ê¹ÓÃFirefoxä¯ÀÀÆ÷
     * @return
     */
     static WebDriver getFirefoxDriver(){
       WebDriver ff = new FirefoxDriver();
       return ff;
    }
    static WebDriver getChromeDriver()
    {
    	//
    	System.setProperty("webdriver.chrome.driver","D:\\Personal\\Driver\\chromedriver.exe");
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		String[] switches = {"start-maximized","--user-agent=iPhone-IOS 5"};
		capabilities.setCapability("chrome.switches", switches);
		WebDriver driver =new ChromeDriver(capabilities);
    	return driver;
    }
}
