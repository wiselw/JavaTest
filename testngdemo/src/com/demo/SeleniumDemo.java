package com.demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.framework.Config;

public class SeleniumDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//FireFoxTest();
		System.out.println(Config.getConfBykey("element.find.timeout"));
	    
	}
	public static void chrometest()
	{
		ChromeDriver driver = null;
		System.setProperty("webdriver.chrome.driver","D:\\Personal\\Driver\\chromedriver.exe");
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		String[] switches = {"start-maximized","--user-agent=iPhone-IOS 5"};
		capabilities.setCapability("chrome.switches", switches);
		driver =new ChromeDriver(capabilities);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.navigate().to("http://m.ctrip.com/");
	    System.out.println(driver.manage().ime().toString());
	    System.out.println(driver.getCapabilities().asMap().toString());
		
	}
	public static void FireFoxTest()
	{
		FirefoxDriver driver = null;
		driver =new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	    driver.navigate().to("http://m.ctrip.com/");
	    System.out.println(driver.manage().ime().toString());
	    System.out.println(driver.getCapabilities().asMap().toString());
		
	}

}
