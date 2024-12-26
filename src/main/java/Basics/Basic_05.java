package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic_05 {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://support.orangehrm.com/portal/en/signin");
		driver.switchTo().frame("iamFrame");
		driver.findElement(By.name("username")).sendKeys("ajd");
		driver.findElement(By.name("password")).sendKeys("dhsd");
		Thread.sleep(2000);
	    driver.findElement(By.xpath(".//input[@class='btn big-btn primary']")).submit();
	    Thread.sleep(2000);
	    WebElement errorMsg = driver.findElement(By.xpath(".//span[@class='error']"));
	    if(errorMsg.isDisplayed())
	    {
	    	System.out.println("error msg is displaying");
	    }
	    
	    else {
			System.out.println("error msg is not displaying");
		}
	    
	   WebElement checkbox = driver.findElement(By.className("rememberMe"));
	   System.out.println(checkbox.getTagName());
	   System.out.println(checkbox.getAttribute("class"));
	   System.out.println(checkbox.getText());
		

	}

}
