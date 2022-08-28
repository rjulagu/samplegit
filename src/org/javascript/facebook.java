package org.javascript;

import org.openqa.selenium.By;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\NIzar\\eclipse-workspace\\selenim1\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com/");
		driver.manage().window().maximize();
		//username 
		WebElement txtusername = driver.findElement(By.id("email"));
                                        //cast js
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].setAttribute('value','ulagu@gmail.com')", txtusername); //key,args
		Thread.sleep(3000);
		Object y = executor.executeScript("return arguments[0].getAttribute('value')",txtusername);
		System.out.println(y);
		//password
		WebElement txtusername1 = driver.findElement(By.id("pass"));
		executor.executeScript("arguments[0].setAttribute('value','ulagu12345')", txtusername1); //key,args
		Object i = executor.executeScript("return arguments[0].getAttribute('value')",txtusername1);
		System.out.println(i);
		//login
		WebElement login = driver.findElement(By.name("login"));
		executor.executeScript("arguments[0].click()",login);
	}
		
	}


