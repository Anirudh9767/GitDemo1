package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic_06 {

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/?_rdr");
		WebElement button = driver.findElement(By.cssSelector("._42ft._4jy0._6lti._4jy6._4jy2.selected._51sy"));
		System.out.println("button height= "+button.getSize().getHeight());
		System.out.println("button width= "+button.getSize().getWidth());
		
		System.out.println("button x location= "+button.getLocation().getX());
		System.out.println("button y location= "+button.getLocation().getY());
		System.out.println(button.getCssValue("background-color"));
		System.out.println(button.getCssValue("font-family"));

	}

}
