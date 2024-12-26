package Basics;

import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice_01 {

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/?s_kwcid=AL!739!3!676201929245!b!!g!!flipkart&gclsrc=aw.ds&&semcmpid=sem_8024046704_brand_exe_buyers_goog&gad_source=1&gclid=CjwKCAiAjp-7BhBZEiwAmh9rBS7WTq66MebORZndrnDIODKw78mtISGabePGhXiw8uT4Pkk3plGAJhoCJ5EQAvD_BwE");
        driver.findElement(By.xpath(".//*[@name='q']")).sendKeys("iphone 14");
        driver.findElement(By.cssSelector("._2iLD__")).submit();
        List<WebElement> mobiles = driver.findElements(By.xpath(".//div[contains(text(),'Apple iPhone 14 ')]"));
        System.out.println("Total no of matchings: "+mobiles.size());
        List<WebElement> price = driver.findElements(By.cssSelector(".Nx9bqj "));
        for(int i=0;i<mobiles.size();i++)
        {
        	String mob = mobiles.get(i).getText();
        	String pri = price.get(i).getText();
        	System.out.println(mob+" :"+pri);
        	
        }
        
        TreeSet<Integer> ref3=new TreeSet<Integer>();
        for(int i=0;i<ref3.size();i++)
        {
        	String str = price.get(i).getText().substring(i).replaceAll(",", "");
        	int prices = Integer.parseInt(str);
        	ref3.add(prices);
        	
        }
        System.out.println("lowest price "+ref3.first() );
        System.out.println("Highest price "+ref3.last() );
       
		
		
	}

}
