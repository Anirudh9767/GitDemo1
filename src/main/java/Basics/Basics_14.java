package Basics;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basics_14 {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.cssSelector(".blinkingText")).click();
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		String parentWindow = it.next();
		String childwindow = it.next();
		driver.switchTo().window(childwindow);
		System.out.println(driver.findElement(By.cssSelector(".about_conference_heading")).getText());
		driver.switchTo().window(parentWindow);
		System.out.println(driver.findElement(By.xpath(".//h1[text()='Practice Page']")).getText());
		

	}

}
