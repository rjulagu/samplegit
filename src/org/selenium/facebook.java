package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\NIzar\\eclipse-workspace\\selenim1\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		WebElement txtUserName = driver.findElement(By.id("email"));
		txtUserName.sendKeys("ulaganathan@gmal.com");
		WebElement txtpassword = driver.findElement(By.id("pass"));
		txtpassword.sendKeys("ulaganathan123");
	}}
