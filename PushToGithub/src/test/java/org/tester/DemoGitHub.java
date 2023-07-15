package org.tester;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoGitHub {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
	    driver.get("https://www.facebook.com/");
	    
	    String currentUrl = driver.getCurrentUrl();
	    System.out.println(currentUrl);
	    String title = driver.getTitle();
	    System.out.println(title);
	    WebElement userID = driver.findElement(By.id("email"));
	    userID.sendKeys("qwertyu12345@gmail.com");	

	}
}
