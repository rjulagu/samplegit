package seleniumtak4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazon {
public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\NIzar\\eclipse-workspace\\selenim1\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.get("https://www.amazon.in/");
	    WebElement amazon = driver.findElement(By.xpath("(//a[contains(text(),'Use')])[1]"));
	    String text = amazon.getText();
	    System.out.println(text);
	   
	    
	    
}
}
