package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Basic_02 {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
//		driver.findElement(By.xpath(".//span[@role='button']")).click();
		driver.findElement(By.name("q")).sendKeys("oneplus mobile");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(.//li[@class='_3D0G9a'])[1]")).click();
		Thread.sleep(3000);
		System.out.println(driver.findElement(By.xpath(".//div[text()='OnePlus Nord CE 3 Lite 5G (Pastel Lime, 256 GB)']/../..//div[@class='col col-5-12 BfVC2z']//div[text()='₹18,609']")).getText());
	
		
		
	}

}
