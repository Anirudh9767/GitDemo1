package Basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic_04 {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://support.orangehrm.com/portal/en/signin");
		driver.switchTo().frame("iamFrame");
		WebElement checkBox = driver.findElement(By.name("sremember"));
		checkBox.click();
		if(checkBox.isSelected())
		{
			System.out.println("checkbox is selected");
		}
		else
		{
			System.out.println("checkbox is not selected");
		}

	}

}
