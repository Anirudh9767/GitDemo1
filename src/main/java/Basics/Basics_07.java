package Basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basics_07 {

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("No of links Are : "+links.size());
		for(WebElement x:links)
		{
			System.out.println(x.getAttribute("href"));
		}
	}

}
