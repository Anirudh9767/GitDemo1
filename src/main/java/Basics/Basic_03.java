package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Basic_03 {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/?_rdr");
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("Anirudh");
		email.sendKeys(Keys.CONTROL+"a","c");
		
		Thread.sleep(3000);
//		WebElement password = driver.findElement(By.id("pass"));
//		password.sendKeys(Keys.CONTROL+"v");
		email.sendKeys(Keys.TAB,Keys.CONTROL+"v");
		
		

	}

}
