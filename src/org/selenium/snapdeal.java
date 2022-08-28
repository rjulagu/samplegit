package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class snapdeal {
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\NIzar\\eclipse-workspace\\selenim1\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.get("https://www.snapdeal.com/login?utm_term=437025299421_104151711009_%7Bbidstrategy%7D&gclid=EAIaIQobChMItrbS0fDS-AIVZoJLBR1JRAatEAAYASAAEgIu1fD_BwE&utm_campaign=brand_account_brandcat_cpt_1d_ftu&utm_source=earth_sembrand&utm_medium=snapdeal");
	    WebElement amazon = driver.findElement(By.name("username"));
	    amazon.sendKeys("7569856412");
	   
	    
}
}
