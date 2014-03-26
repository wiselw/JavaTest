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
//	      driver.findElement(By.linkText("��¼")).click();
//	      driver.findElement(By.id("txtUserName")).clear();
//	      driver.findElement(By.id("txtUserName")).sendKeys("ctriptestat");
//	      driver.findElement(By.id("txtPwd")).clear();
//	      driver.findElement(By.id("txtPwd")).sendKeys("2wsxcde3$RFV");
//	      driver.findElement(By.id("btnSubmit")).click();
	}
	public void SearchFlt()//throws Exception 
	{
		//������ڻ�Ʊ��ǩ��
		WebElement navFlight= driver.findElement(By.id("cui_nav_flight"));
		Actions  moveAction= new Actions(driver);
		moveAction.moveToElement(navFlight).perform();
		navFlight.findElement(By.linkText("���ڻ�Ʊ")).click();
		//driver.findElement(By.id("cui_nav")).findElements(By.tagName("a")).get(5).click();
		SeleniumFunc.waitUntileElementDisplayed(driver.findElement(By.id("radio_S")), 5).click();
//		driver.findElement(By.id("DepartCity1TextBox")).clear();
//		driver.findElement(By.id("DepartCity1TextBox")).sendKeys("�Ϻ�");
		//SeleniumFunc.waitUntileElementDisplayed(driver.findElement(By.className("c_address_list")), 5).findElement(By.linkText("�Ϻ�")).click();
		SeleniumFunc.sendKeysById(driver, "DepartCity1TextBox", "�Ϻ�");
//		driver.findElement(By.id("ArriveCity1TextBox")).clear();
//		driver.findElement(By.id("ArriveCity1TextBox")).sendKeys("����");
		SeleniumFunc.sendKeysById(driver, "ArriveCity1TextBox", "����");
		//SeleniumFunc.waitUntileElementDisplayed(driver.findElement(By.className("c_address_list")), 5).findElement(By.linkText("����")).click();
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
		Reporter.log("��ѯ�ɹ���");
	}

}
