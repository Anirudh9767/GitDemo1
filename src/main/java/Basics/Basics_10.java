package Basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Basics_10 {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
//		System.out.println(driver.findElement(By.xpath("(.//*[@id='product'])[1]/tbody/tr[8]/td[2]")).getText());
		
		List<WebElement> data = driver.findElements(By.xpath("(.//*[@id='product'])[1]/tbody/tr"));
		for(int i=0;i<data.size();i++)
		{
			System.out.println(data.get(i).getText());
		}

	}

}
