package org.selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class icicibank {
	public static void main(String[] args) {
		
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\NIzar\\eclipse-workspace\\selenim1\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://infinity.icicibank.com/corp/AuthenticationController?FORMSGROUP_ID__=AuthenticationFG&__START_TRAN_FLAG__=Y&FG_BUTTONS__=LOAD&ACTION.LOAD=Y&AuthenticationFG.LOGIN_FLAG=1&BANK_ID=ICI&ITM=nli_personalb_personal_login_btn&_ga=2.88024728.186450130.1656389809-20654495.1656389809&_gl=1*srrxkk*_ga*MjA2NTQ0OTUuMTY1NjM4OTgwOQ..*_ga_SKB78GHTFV*MTY1NjUwNjUyNC4xLjAuMTY1NjUwNjUzMC41NA..");
		driver.manage().window().maximize();
		
		WebElement txtUserName = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		txtUserName.click();
		txtUserName.sendKeys("ulaganathan@gmail.com");
		WebElement txtpassword = driver.findElement(By.xpath("(//input[@type='password'])[1]"));
		txtpassword.sendKeys("ulaganathan123");
		
	
	
		
		
	}}


