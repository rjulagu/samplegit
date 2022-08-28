package org.mouseoveraction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class guru99 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\NIzar\\eclipse-workspace\\selenim1\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		WebElement u = driver.findElement(By.xpath("(//a[@class='button button-orange'])[5]"));
		WebElement v = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		Actions actions = new Actions(driver);
		actions.dragAndDrop(u,v).perform();
		WebElement x = driver.findElement(By.id("credit1"));
		WebElement y = driver.findElement(By.id("loan"));
		actions.dragAndDrop(x,y).perform();
		
		WebElement p = driver.findElement(By.id("fourth"));
		WebElement q = driver.findElement(By.id("amt7"));
		actions.dragAndDrop(p,q).perform();
		WebElement a = driver.findElement(By.id("fourth"));
		WebElement b = driver.findElement(By.id("amt8"));
		actions.dragAndDrop(a,b).perform();
		WebElement guru = driver.findElement(By.id("equal"));
		guru.click();
		
		
		
		
	
	
	
	
	
	
	}
}
