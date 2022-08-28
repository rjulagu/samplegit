package org.screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook {
public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\NIzar\\eclipse-workspace\\selenim1\\driver\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://www.facebook.com");
driver.manage().window().maximize();
TakesScreenshot screenshot =(TakesScreenshot) driver;
File s = screenshot.getScreenshotAs(OutputType.FILE);
File k = new File("C:\\Users\\NIzar\\eclipse-workspace\\selenim1\\ScreenShot.src1.png");
FileUtils.copyFile(s, k);






















}
}
