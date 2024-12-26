package Basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Basics_08 {

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		List<WebElement> checkbox = driver.findElements(By.xpath(".//input[@type='checkbox']"));
		for(WebElement x:checkbox)
		{
			if(x.getAttribute("value").equals("option1") || x.getAttribute("value").equals("option2"))
			{
			x.click();
		    }
			if(x.isSelected())
			{
				System.out.println(x.getAttribute("value"));
			}
		}
		

	}

}
