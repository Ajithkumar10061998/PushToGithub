package org.codepushtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browserlaunching {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\AJITH KUMAR G\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	String currentUrl = driver.getCurrentUrl();
	System.out.println(currentUrl);
	String title = driver.getTitle();
	System.out.println(title);
	WebElement userID = driver.findElement(By.id("email"));
	userID.sendKeys("Ajith");

	}
}
