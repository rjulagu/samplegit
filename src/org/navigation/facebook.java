package org.navigation;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook {
public static void main(String[] args) throws MalformedURLException, InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\NIzar\\eclipse-workspace\\selenim1\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	URL url = new URL("https://www.facebook.com");
	driver.navigate().to(url);
	Thread.sleep(3000);
	driver.navigate().back();
	Thread.sleep(3000);
	driver.navigate().forward();
	Thread.sleep(3000);
	driver.navigate().refresh();
	
	
}
}
