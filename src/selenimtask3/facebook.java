package selenimtask3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\NIzar\\eclipse-workspace\\selenim1\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		WebElement facebook = driver.findElement(By.id("email"));
		facebook.sendKeys("raviulagu1996@gmail.com");
		WebElement facebook1 = driver.findElement(By.id("pass"));
		facebook1.sendKeys("Jayaravi100");
	
		WebElement facebook2 = driver.findElement(By.xpath("//button[@type='submit']"));
		facebook2.click();
	}

}
