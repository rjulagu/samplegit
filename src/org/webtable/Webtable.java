package org.webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class Webtable {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\NIzar\\eclipse-workspace\\selenim1\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://m.cricbuzz.com/cricket-series/4184/tamil-nadu-premier-league-2022/points-table");
		
		

		List<WebElement> elements = driver.findElements(By.xpath("/html/body/div[2]/div[2]/div/div/table"));
		for (int i = 0; i < elements.size(); i++) {
			WebElement webElement = elements.get(i);
		String text = webElement.getText();
		//System.out.println(text);
			
		}
		WebElement element = elements.get(0);
		System.out.println(element);
	}	
		
}	
		
		
		
		
		
		//	
//			for (String string : args) {
//				
//			
//			 driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/table/tbody[1]"));
//			 driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/table/tbody[2]"));
//			 driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/table/tbody[3]"));
//			 driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/table/tbody[4]"));
//			}			
//					
//				
//		
//		
		
		
		
		
		
		
		
		
		
		
//		WebElement findElement = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/table/thead/tr"));
//String text = findElement.getText();
//	System.out.println(text);
//		
//		List<WebElement> find= driver.findElements(By.tagName("tr"));
//		for (int i = 0; i < find.size(); i++) {
//			WebElement webElement = find.get(i);
//			String text = webElement.getText();
//			System.out.println(text);
			
		

		
		
	


