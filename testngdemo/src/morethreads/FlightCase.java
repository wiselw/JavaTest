package morethreads;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.AssertJUnit;
import org.testng.Reporter;

public class FlightCase {
	public WebDriver  driver ;
	public FlightCase(WebDriver driver)
	{
		this.driver=driver;
	}
	//login 
	public void Login()
	{
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	      driver.navigate().to("http://www.ctrip.com/");
//	      driver.findElement(By.linkText("登录")).click();
//	      driver.findElement(By.id("txtUserName")).clear();
//	      driver.findElement(By.id("txtUserName")).sendKeys("ctriptestat");
//	      driver.findElement(By.id("txtPwd")).clear();
//	      driver.findElement(By.id("txtPwd")).sendKeys("2wsxcde3$RFV");
//	      driver.findElement(By.id("btnSubmit")).click();
	}
	public void SearchFlt()//throws Exception 
	{
		//点击国内机票标签栏
		WebElement navFlight= driver.findElement(By.id("cui_nav_flight"));
		Actions  moveAction= new Actions(driver);
		moveAction.moveToElement(navFlight).perform();
		navFlight.findElement(By.linkText("国内机票")).click();
		//driver.findElement(By.id("cui_nav")).findElements(By.tagName("a")).get(5).click();
		SeleniumFunc.waitUntileElementDisplayed(driver.findElement(By.id("radio_S")), 5).click();
//		driver.findElement(By.id("DepartCity1TextBox")).clear();
//		driver.findElement(By.id("DepartCity1TextBox")).sendKeys("上海");
		//SeleniumFunc.waitUntileElementDisplayed(driver.findElement(By.className("c_address_list")), 5).findElement(By.linkText("上海")).click();
		SeleniumFunc.sendKeysById(driver, "DepartCity1TextBox", "上海");
//		driver.findElement(By.id("ArriveCity1TextBox")).clear();
//		driver.findElement(By.id("ArriveCity1TextBox")).sendKeys("北京");
		SeleniumFunc.sendKeysById(driver, "ArriveCity1TextBox", "北京");
		//SeleniumFunc.waitUntileElementDisplayed(driver.findElement(By.className("c_address_list")), 5).findElement(By.linkText("北京")).click();
		SeleniumFunc.sendKeysById(driver, "DepartDate1TextBox", "2013-06-04");
		//driver.findElement(By.id("DepartDate1TextBox"))
		driver.findElement(By.id("search_btn")).click();
		try
		{
		Thread.sleep(3000);
		}
		catch(Exception ex)
		{}
		AssertJUnit.assertNotNull(driver.findElement(By.id("flt_list")));
		Reporter.log("查询成功！");
	}

}
