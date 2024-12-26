package rahulshettyacademy.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import rahulshettyacademy.AbstractComponents.AbstractComponents;

public class CheckoutPage extends AbstractComponents
{
	WebDriver driver;
	
	public CheckoutPage(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css="input[placeholder='Select Country']")
	WebElement country;
	
	@FindBy(css=".btnn.action__submit.ng-star-inserted")
	WebElement submit;
	
	By result=(By.cssSelector(".ta-results.list-group.ng-star-inserted"));
	
	
	public void selectCountry(String countryName)
	{
		country.sendKeys(countryName);
		waitForElementToAppear(result);
		driver.findElement(By.xpath("//button[contains(@class,'ta-item')][2]")).click();
	}
	
	public ConfirmationPage goToConfirmation()
	{
		submit.click();
		ConfirmationPage confirmationPage=new ConfirmationPage(driver);
		return confirmationPage;
	}
	
	

}
