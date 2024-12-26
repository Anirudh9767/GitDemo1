package Basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Basics_09 {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement dropdown = driver.findElement(By.id("dropdown-class-example"));
		Select s=new Select(dropdown);
		s.selectByIndex(1);
		s.selectByValue("option2");
		s.selectByVisibleText("Option3");
		System.out.println(s.isMultiple());
		List<WebElement> allOptions = s.getOptions();
		for(WebElement x:allOptions)
		{
			System.out.println(x.getText());
		}

	}

}
