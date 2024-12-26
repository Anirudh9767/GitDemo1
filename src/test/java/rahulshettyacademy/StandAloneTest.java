package rahulshettyacademy;

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

public class StandAloneTest {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		String productName="ZARA COAT 3";
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://rahulshettyacademy.com/client/");
		driver.findElement(By.id("userEmail")).sendKeys("guddu12@gmail.com");
		driver.findElement(By.id("userPassword")).sendKeys("Guddu@123");
		driver.findElement(By.id("login")).click();
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".mb-3")));
		
		List<WebElement> products = driver.findElements(By.cssSelector(".mb-3"));
	    WebElement prod =  products.stream().filter(product->product.findElement(By.tagName("b")).getText().equalsIgnoreCase(productName)).findAny().orElse(null);
        prod.findElement(By.cssSelector(".card-body button:last-of-type")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("toast-container")));
        wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.cssSelector(".ng-animating"))));
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("button[routerlink='/dashboard/cart']")).click();
        
        List<WebElement> cartProduct = driver.findElements(By.cssSelector("div[class='cartSection'] h3"));
        boolean match = cartProduct.stream().anyMatch(product->product.getText().equalsIgnoreCase(productName));
        Assert.assertTrue(match);
        driver.findElement(By.cssSelector(".totalRow button")).click();
        
        driver.findElement(By.cssSelector("input[placeholder='Select Country']")).sendKeys("ind");
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector(".ta-results.list-group.ng-star-inserted"))));
        driver.findElement(By.xpath("//button[contains(@class,'ta-item')][2]")).click();
        driver.findElement(By.cssSelector(".btnn.action__submit.ng-star-inserted")).click();
        Thread.sleep(3000);
        
        String confirmationMsg = driver.findElement(By.cssSelector(".hero-primary")).getText();
        Assert.assertTrue(confirmationMsg.equalsIgnoreCase("Thankyou for the order."));
        driver.quit();
        
        
        
        
        
        
		
	}

}
