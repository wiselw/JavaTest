package morethreads;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.ie.*;
public class morethreadtest {
  @Test
  public void firefoxtest() {
	  FirefoxDriver driver = new FirefoxDriver();
	  HotelCase hc=new HotelCase(driver);
	  hc.Login();
	  hc.SearchHotel();
  }
  @Test
  public void ietest() {
	  
	  System.setProperty("webdriver.ie.driver","D:\\Personal\\Driver\\IEDriverServer.exe");
	  InternetExplorerDriver driver = new InternetExplorerDriver();
	  HotelCase hc=new HotelCase(driver);
	  hc.Login();
	  hc.SearchHotel();
  }
  
  @Test
  public void chrometest() {
	  System.setProperty("webdriver.chrome.driver","D:\\Personal\\Driver\\chromedriver.exe");
	  ChromeDriver driver = new ChromeDriver();
	  HotelCase hc=new HotelCase(driver);
	  hc.Login();
	  hc.SearchHotel();
  }
  @BeforeTest
  public void beforeTest() {
	  //
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
