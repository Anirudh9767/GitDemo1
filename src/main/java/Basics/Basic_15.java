package Basics;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic_15 {

	public static void main(String[] args) throws IOException 
	{
		WebDriver driver=new ChromeDriver();
//		URL url=new URL("https://rahulshettyacademy.com/AutomationPractice/");
//		HttpURLConnection conn=(HttpURLConnection)url.openConnection();
//		conn.setRequestMethod("HEAD");
//		conn.connect();
//		int responseCode = conn.getResponseCode();
//		System.out.println("Response Code :"+responseCode);
//		System.out.println("Response Message :"+conn.getResponseMessage());
//		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		List<WebElement> links = driver.findElements(By.xpath(".//*[@class='gf-li'] /a"));
		for(WebElement link:links)
		{
			@Nullable
			String url = link.getAttribute("href");
			
			HttpURLConnection conn=(HttpURLConnection)new URL(url).openConnection();
			conn.setRequestMethod("HEAD");
			conn.connect();
			int responseCode = conn.getResponseCode();
			if(responseCode>=400)
			{
				System.out.println(link.getText()+" = "+responseCode);
			}
		}

	}

}
