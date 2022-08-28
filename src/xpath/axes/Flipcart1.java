package xpath.axes;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipcart1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\NIzar\\\\eclipse-workspace\\\\selenim1\\\\driver\\\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		WebElement btnclck = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		btnclck.click();
		
		WebElement product = driver.findElement(By.xpath("//input[@class='_3704LK']"));
		product.sendKeys("apple iphone 13proMax");
		WebElement search = driver.findElement(By.xpath("//button[@class='L0Z3Pu']"));
		search.click();
		 java.util.List<WebElement> text = driver.findElements(By.xpath("(//div[contains(text(),'APPLE iPhone 13 Pro Max (Graphite, 128 GB)')])[1]//following::div[7]"));
	
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
