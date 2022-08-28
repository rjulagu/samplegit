package selenimtask3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class automationtesting {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\NIzar\\eclipse-workspace\\selenim1\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		WebElement txtUserName = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		txtUserName.sendKeys("ulaganathan");
		WebElement txtpassword = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		txtpassword.sendKeys("R");

	}
}
