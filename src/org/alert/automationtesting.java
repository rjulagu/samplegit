package org.alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class automationtesting {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\NIzar\\eclipse-workspace\\selenim1\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		WebElement testing = driver.findElement(By.xpath("(//a[@class='analystic'])[3]"));
		testing.click();
		WebElement testing1 = driver.findElement(By.xpath("//button[@class='btn btn-info']"));
		testing1.click();
		Alert u = driver.switchTo().alert();
		u.accept();
		WebElement testing2 = driver.findElement(By.xpath("//p[@id='demo1']"));
		String text = testing2.getText();
	    System.out.println(text);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
