package seleniumtak4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class greenstech {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\NIzar\\eclipse-workspace\\selenim1\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		WebElement facebook = driver.findElement(By.xpath("(//span[@class='text'])[3]"));
		facebook.click();
		WebElement facebook1 = driver.findElement(By.xpath("(//p[contains(text(),'Greens Technologies')])[1]"));
		String text = facebook1.getText();
		System.out.println(text);
	
	}
}
