package rahulshettyacademy.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import rahulshettyacademy.AbstractComponents.AbstractComponents;

public class LandingPage  extends AbstractComponents
{
	
	WebDriver driver=new ChromeDriver();
	
	public LandingPage(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(id="userEmail")
	WebElement userEmail;
	
	@FindBy(id="userPassword")
	WebElement userPassword;
	
	@FindBy(id="login")
	WebElement loginButton;
	
	public ProductCataloge loginApplication(String email,String password)
	{
		userEmail.sendKeys(email);
		userPassword.sendKeys(password);
		loginButton.submit();
		ProductCataloge productCataloge=new ProductCataloge(driver);
		return productCataloge;
	}
	
	public ProductCataloge goTo()
	{
		driver.get("https://rahulshettyacademy.com/client/");
		ProductCataloge productCatloge=new ProductCataloge(driver);
		return productCatloge;
	}
	
	

}
