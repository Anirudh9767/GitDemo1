package rahulshettyacademy;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import rahulshettyacademy.TestComponents.BaseTest;
import rahulshettyacademy.pageObject.CartPage;
import rahulshettyacademy.pageObject.CheckoutPage;
import rahulshettyacademy.pageObject.ConfirmationPage;
import rahulshettyacademy.pageObject.LandingPage;
import rahulshettyacademy.pageObject.ProductCataloge;


public class SubmitOrderTest extends BaseTest{

	@Test
	public void SubmitOrder() throws IOException 
	{
		String productName="ZARA COAT 3";
		LandingPage landingPage=launchApplication();
	
		ProductCataloge productCataloge=landingPage.loginApplication("guddu12@gmail.com", "Guddu@123");
		
        List<WebElement> product = productCataloge.getProductList();
        
		productCataloge.addProductToCart(productName);
        CartPage cartpage=productCataloge.goToCart();
        
        boolean match = cartpage.verifyProduct(productName);
        Assert.assertTrue(match);
        CheckoutPage checkoutPage=cartpage.goToCheckout();
        checkoutPage.selectCountry("india");
        ConfirmationPage confirmationPage=checkoutPage.goToConfirmation();
        String msg = confirmationPage.verifyMessage();
        Assert.assertTrue(msg.equalsIgnoreCase("Thankyou for the order."));
        driver.close();
       
	}

}
