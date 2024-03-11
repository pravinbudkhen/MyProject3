package JavaScriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JSExecutor {

	public static void flash(WebDriver driver,WebElement element)
	{
		JavascriptExecutor js=((JavascriptExecutor)driver);
		String bgColor=element.getCssValue("backgroundColor");
		for(int i=10;i<10;i++)
		{
			changeColor("rgb(0,200,0)",driver,element);
			changeColor(bgColor,driver,element);
		}
	}
	
	public static void changeColor(String color,WebDriver driver,WebElement element)
	{
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("arguments[0].style.backgroundColor = '"+color+"'", element);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	
	}
	
	public static  void drowBorder(WebDriver driver,WebElement element) {
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("arguments[0].style.border='3px solid red'", element);
	}
}
