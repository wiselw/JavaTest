package morethreads;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FltSuite {
	@BeforeTest
	 public void befoerTest() {
		
		
	  }
	@AfterTest
	public void afterTest() {
		
	  }
  @Test
  public void fltTestForChrome() {
	  //
	  ChromeDriver driver = null;
	  System.setProperty("webdriver.chrome.driver","D:\\Personal\\Driver\\chromedriver.exe");
	  DesiredCapabilities capabilities = DesiredCapabilities.chrome();
	  //String[] switches = {"start-maximized","--user-agent=iPhone-IOS 5"};
	  
	  //String[] switches = {"start-maximized","--user-agent=Android 4.0.2-Galaxy Nexus"};
	  //capabilities.setCapability("chrome.switches", switches);
	  ChromeDriverService chromeDirverService = ChromeDriverService.createDefaultService();
      ChromeOptions chromeOptions = new ChromeOptions();
	  chromeOptions.addArguments("start-maximized","--user-agent=Android 4.0.2-Galaxy Nexus");
	  driver =new ChromeDriver(chromeDirverService,chromeOptions);
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
     // driver.navigate().to("http://m.ctrip.com/");
      driver.navigate().to("http://www.lvmama.com/client/other/sms.html?c=1&r=1");
      //driver.findElement(By.className("icon_hotel")).click();	  
//	  System.setProperty("webdriver.chrome.driver","D:\\Personal\\Driver\\chromedriver.exe");
//		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
//		String[] switches = {"start-maximized","--user-agent=Android 4.0.2-Galaxy Nexus"};
//		capabilities.setCapability("chrome.switches", switches);
//		ChromeDriver driver =new ChromeDriver(capabilities);
//		driver.navigate().to("http://www.lvmama.com/client/other/sms.html?c=1&r=1");
      try
		{
		Thread.sleep(30000);
		}
		catch(Exception ex)
		{}
	  Reporter.log("查询成功！！");
  }
  
  
  @Test
  public void fltTestForFireFox() {
	  System.out.println("start");
	  FirefoxDriver driver = new FirefoxDriver();
	  driver.navigate().to("http://www.ctrip.com/");
	  SeleniumFunc.sendKeysById(driver, "HD_CityName", "上海");
	  driver.findElement(By.id("HD_CheckIn")).click();
	  driver.findElement(By.id("2013-08-22_calendar0")).click();
	  driver.findElement(By.id("HD_CheckOut")).click();
	  driver.findElement(By.id("2013-09-04_calendar1")).click();
	  driver.findElement(By.id("HD_Btn")).click();
	  //driver.quit();
	  Reporter.log("查询成功！！");
  }
  
  @Test(invocationCount = 5)
  public void fltTestForIE() {
	  //
	  System.setProperty("webdriver.ie.driver","D:\\Personal\\Driver\\IEDriverServer.exe");
	  InternetExplorerDriver driver = new InternetExplorerDriver();
	  FlightCase fc=new FlightCase(driver);
	  fc.Login();
	  fc.SearchFlt();
	  driver.quit();
	  Reporter.log("查询成功！！");
  }
}
