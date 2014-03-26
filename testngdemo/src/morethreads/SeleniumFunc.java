package morethreads;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;

public  class SeleniumFunc {
	public static WebElement waitUntileElementDisplayed(WebElement element ,int timeout)
	{
		long start =System.currentTimeMillis();
		boolean isDisplayed =false;
		while (!isDisplayed&&((System.currentTimeMillis()-start)<timeout*1000))
		{
			isDisplayed=(element==null)?false:element.isDisplayed();
		}
		
		if (!isDisplayed)
		{
			String error="当前元素"+timeout+"秒里不能识别！";
			Reporter.log(error);
		}
		return element;
	}

	protected static void sendKeysByDom(WebDriver driver ,String by,String byValue,String text,int index) throws Exception
	{
		String js = null;  
	    if (by.equalsIgnoreCase("tagname")) {  
	        js = "document.getElementsByTagName('" + byValue + "')[" + index + "].value='" + text + "'";  
	    } else if (by.equalsIgnoreCase("name")) {  
	        js = "document.getElementsByName('" + byValue + "')[" + index + "].value='" + text + "'";  
	    } else if (by.equalsIgnoreCase("id")) {  
	        js = "document.getElementById('" + byValue + "').value='" + text + "'";  
	    } else {  
	        throw new IllegalArgumentException("only can find element by TagName/Name/Id");  
	    }  
	  
	    ((JavascriptExecutor)driver).executeScript(js);  
	
	}
	public static void sendKeysById(WebDriver driver,String elementId, String text) {  
		try {
			sendKeysByDom(driver,"Id",elementId,text,0);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
	}  
	  
	public static void sendKeysByName(WebDriver driver,String elementName, String text, int elementIndex) throws Exception{  
		sendKeysByDom( driver,"Name", elementName, text, elementIndex);  
	}  
	  
	public static void sendKeysByTagName(WebDriver driver,String elementTagName, String text, int elementIndex) throws Exception{  
		sendKeysByDom(driver,"TagName", elementTagName, text, elementIndex);  
	}  
	
}
