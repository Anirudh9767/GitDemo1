package rahulshettyacademy.TestComponents;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import rahulshettyacademy.pageObject.LandingPage;

public class BaseTest 
{
	public WebDriver driver;
	public WebDriver initializeBrowser() throws IOException
	{
		Properties prop=new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\anura\\eclipse-workspace\\SeleniumFrameworkDesign\\src\\main\\java\\rahulshettyacademy\\Resources\\globalProperties.properties");
		prop.load(fis);
		String browsername = prop.getProperty("browsername");
		
		if(browsername.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();
		}
		
		else if(browsername.equalsIgnoreCase("edge"))
		{
			driver=new EdgeDriver();
		}
		
		
		return driver;
		
	}
	
	public LandingPage launchApplication() throws IOException
	{
		driver=initializeBrowser();
		LandingPage landingPage=new LandingPage(driver);
		landingPage.goTo();
		return landingPage;
	}
	
	

}
