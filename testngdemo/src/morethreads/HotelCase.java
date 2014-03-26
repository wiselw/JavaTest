package morethreads;

import static org.testng.AssertJUnit.*;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.AssertJUnit;
import org.testng.Reporter;

public class HotelCase {
	public WebDriver  driver ;
	public HotelCase(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void Login()
	{
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	      driver.navigate().to("http://www.ctrip.com/");
	      driver.findElement(By.linkText("登录")).click();
	      driver.findElement(By.id("txtUserName")).clear();
	      driver.findElement(By.id("txtUserName")).sendKeys("ctriptestat");
	      driver.findElement(By.id("txtPwd")).clear();
	      driver.findElement(By.id("txtPwd")).sendKeys("2wsxcde3$RFV");
	      driver.findElement(By.id("btnSubmit")).click();
	}
	public void SearchHotel()//throws Exception 
	{
		driver.findElement(By.id("cui_nav")).findElements(By.tagName("a")).get(2).click();
		driver.findElement(By.id("txtCity")).clear();
		driver.findElement(By.id("txtCity")).sendKeys("上海");
		driver.findElement(By.id("txtCheckIn")).clear();
		driver.findElement(By.id("txtCheckIn")).sendKeys("2013-03-25");
		driver.findElement(By.id("txtCheckOut")).clear();
		driver.findElement(By.id("txtCheckOut")).sendKeys("2013-03-26");
		driver.findElement(By.id("btnSearch")).sendKeys("\n");
		try
		{
		Thread.sleep(100);
		}
		catch(Exception ex)
		{}
		AssertJUnit.assertEquals("http://hotels.ctrip.com/hotel/shanghai2", driver.getCurrentUrl());
		Reporter.log("查询成功！");
	}
}
