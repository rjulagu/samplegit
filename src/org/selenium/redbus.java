package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class redbus {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\NIzar\\eclipse-workspace\\selenim1\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.in/");
		WebElement txtUserName = driver.findElement(By.id("src"));
		txtUserName.sendKeys("CHENNAI");
		WebElement txtplace = driver.findElement(By.id("dest"));
		txtplace.sendKeys("pondicherry");
		
		
	}

}
