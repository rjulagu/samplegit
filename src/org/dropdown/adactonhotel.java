package org.dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class adactonhotel {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\NIzar\\eclipse-workspace\\selenim1\\driver\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://adactinhotelapp.com/");
	driver.manage().window().maximize();
	WebElement hotel = driver.findElement(By.id("username"));
	hotel.sendKeys("Greens8767");
	WebElement hotel1 = driver.findElement(By.id("password")); 
	hotel1.sendKeys("QN8V3A");
	WebElement hotel2 = driver.findElement(By.id("login"));
	hotel2.click();
	WebElement name1 = driver.findElement(By.id("location"));
	Select name = new Select(name1);
	 name.selectByIndex(2);
	 WebElement hotel3 = driver.findElement(By.id("hotels"));
	 Select name2 = new Select(hotel3);
	name2.selectByVisibleText("Hotel Sunshine");
	 WebElement submit = driver.findElement(By.id("Submit"));
	 submit.click();
	 WebElement button = driver.findElement(By.id("radiobutton_2"));
	 button.click();
	 WebElement contnue = driver.findElement(By.id("continue"));
	 contnue.click();
	 WebElement fristname = driver.findElement(By.id("first_name"));
	 fristname.sendKeys("ulaganathan");

	 WebElement lastname = driver.findElement(By.id("last_name"));
	 lastname.sendKeys("r");
	 WebElement address = driver.findElement(By.id("address"));
	 address.sendKeys("6, holland street,syney");
	 WebElement creditno = driver.findElement(By.id("cc_num"));
	 creditno.sendKeys("1234567898765432");
	 WebElement credittype = driver.findElement(By.id("cc_type"));
	 Select type = new Select(credittype);
	 type.selectByIndex(1);	 
	 WebElement starting = driver.findElement(By.id("cc_exp_month"));
	 Select type1 = new Select(starting);
	 type1.selectByIndex(4);
	 WebElement ending = driver.findElement(By.id("cc_exp_year"));
	 Select type2 = new Select(ending);
	 type2.selectByIndex(3);
	 WebElement cvv = driver.findElement(By.id("cc_cvv"));
	 cvv.sendKeys("345");
	 WebElement book = driver.findElement(By.id("book_now"));
	 book.click();
	 Thread.sleep(8000);
	 WebElement order = driver.findElement(By.id("order_no"));													 
	 String text = order.getAttribute("value");
	 System.out.println(text);
	

	
	
}
}
