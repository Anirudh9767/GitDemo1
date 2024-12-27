package Basics;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic_01 {

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		
		System.out.println("Updated File1");
		
		Dimension d=new Dimension(500, 400);
		driver.manage().window().setSize(d);
		
		Point p=new Point(400, 500);
		driver.manage().window().setPosition(p);
		
		System.out.println(driver.getCurrentUrl());
		
		driver.close();

	}

}
