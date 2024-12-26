package rahulshettyacademy.pageObject;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import rahulshettyacademy.AbstractComponents.AbstractComponents;

public class CartPage extends AbstractComponents
{
	
	WebDriver driver;
	
	public CartPage(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
	    PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(css="div[class='cartSection'] h3")
	List<WebElement> cartProducts;
	
	@FindBy(css=".totalRow button")
	WebElement checkoutButton;
	
	public boolean verifyProduct(String productname)
	{
		boolean match = cartProducts.stream().anyMatch(product->product.getText().equalsIgnoreCase(productname));
		return match;
	}
	
	public CheckoutPage goToCheckout()
	{
		checkoutButton.click();
		CheckoutPage checkoutPage=new CheckoutPage(driver);
		return checkoutPage;
	}
	
	
	

}
