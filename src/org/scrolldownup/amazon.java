package org.scrolldownup;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazon {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\NIzar\\eclipse-workspace\\selenim1\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		//WebElement amazon = driver.findElement(By.xpath("//a[text()='Conditions of Use & Sale']"));
		// JavascriptExecutor executor = (JavascriptExecutor) driver;
		//Thread.sleep(2000);
		
		WebElement down= driver.findElement(By.xpath("//a[text()='Conditions of Use & Sale']"));
				 JavascriptExecutor executor = (JavascriptExecutor) driver;
		
		executor.executeScript("arguments[0].ScrollIntoView(true)", down);
		
	}

}
