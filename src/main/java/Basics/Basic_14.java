package Basics;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic_14 {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		driver.get("https://demoapps.qspiders.com/ui/alert?sublist=0");
//		driver.findElement(By.id("buttonAlert2")).click();
//		driver.switchTo().alert().accept();
		
//		driver.get("https://demoapps.qspiders.com/ui/alert/confirm?sublist=1");
//		driver.findElement(By.id("buttonAlert5")).click();
//		driver.switchTo().alert().dismiss();
		
		driver.get("https://demoapps.qspiders.com/ui/alert/prompt?sublist=2");
		driver.findElement(By.id("buttonAlert1")).click();
		Alert a = driver.switchTo().alert();
		a.sendKeys("Anirudh");
		Thread.sleep(3000);
		a.accept();

	}

}
