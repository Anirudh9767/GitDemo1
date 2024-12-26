package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Basics_13 {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/ui/dragDrop/dragToCorrect?sublist=2");
		Thread.sleep(2000);
//		WebElement target_ele = driver.findElement(By.cssSelector(".HomeAndLiving.relative"));
		Actions a=new Actions(driver);
//		a.moveToElement(target_ele).perform();
		
		WebElement draggable = driver.findElement(By.xpath(".//*[text()='Mobile Charger']"));
		WebElement droppable = driver.findElement(By.cssSelector(".drop-column:first-child"));
//		a.dragAndDrop(draggable, droppable).build().perform();
		a.clickAndHold(draggable).moveToElement(droppable).release(droppable).build().perform();

	}

}
