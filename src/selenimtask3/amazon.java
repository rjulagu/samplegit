package selenimtask3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazon {
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\NIzar\\eclipse-workspace\\selenim1\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.get("https://www.amazon.in/");
	    WebElement amazon = driver.findElement(By.xpath("//input[@type='text']"));
	    amazon.sendKeys("iphone");
	    WebElement amazon1 = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
	    amazon1.click();
	    
	    
		
		
		
	}

}
