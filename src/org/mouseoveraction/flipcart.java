package org.mouseoveraction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class flipcart {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\NIzar\\eclipse-workspace\\selenim1\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com");
        driver.manage().window().maximize();
        WebElement flipcart = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
        flipcart.click();
        WebElement ulagu = driver.findElement(By.xpath("//div[@class='eFQ30H'][5]"));
        Actions actions = new Actions(driver);
        actions.moveToElement(ulagu).perform();
        WebElement ulagu1 = driver.findElement(By.xpath("//a[text()=\"Laptop and Desktop\"]"));
        actions.moveToElement(ulagu1).perform();
        WebElement ulagu2 = driver.findElement(By.xpath("(//a[text()=\"Laptops\"])[1]"));
        ulagu2.click();
        WebElement ulagu3 = driver.findElement(By.xpath("(//span[.=\"Become a Seller\"])[1]"));
        String text = ulagu3.getText();
        System.out.println(text);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
}}
