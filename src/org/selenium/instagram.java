package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class instagram {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\NIzar\\eclipse-workspace\\selenim1\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/accounts/login/");
		//Thread.sleep(3000);
		WebElement txtUserName = driver.findElement(By.xpath("//input[@name=\"username\"]"));
		txtUserName.sendKeys("ulaganathan@gmal.com");
		WebElement txtpassword = driver.findElement(By.name("password"));
		txtpassword.sendKeys("ulaganathan123");
		
		
		
	
	
	
	
	
}
}
