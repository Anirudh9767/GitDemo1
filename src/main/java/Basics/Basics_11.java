package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basics_11 {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		JavascriptExecutor js=(JavascriptExecutor)driver;
//		js.executeScript("window.scrollBy(0,600)");
//		Thread.sleep(3000);
//		js.executeScript("window.scrollBy(0,-600)");
		
//		for(int i=0;i<10;i++)
//		{
//			js.executeScript("window.scrollBy(0,50)");
//			Thread.sleep(1000);
//		}
//		for(int i=0;i<10;i++)
//		{
//			js.executeScript("window.scrollBy(0,-50)");
//			Thread.sleep(1000);
//		}
		
		WebElement location = driver.findElement(By.xpath(".//*[@class='totalAmount']"));
		js.executeScript("arguments[0].scrollIntoView(true)", location);

	}

}
