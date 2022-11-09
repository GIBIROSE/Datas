package com.ecommerce.pjct;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoPjct {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://admin-demo.nopcommerce.com/login");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		//driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		driver.findElement(By.cssSelector("button[type='submit']")).click();

		WebElement email = driver.findElement(By.xpath("//input[@id='Email']"));
		email.click();
		email.clear();
		email.sendKeys("admin@yourstore.com");

		WebElement password = driver.findElement(By.xpath("//input[@id='Password']"));
		password.click();
		password.clear();
		password.sendKeys("admin");
		Thread.sleep(2000);

		JavascriptExecutor js = (JavascriptExecutor) driver;

		WebElement button = driver.findElement(By.xpath("//button[@type='submit']"));
		js.executeScript("arguments[0].click();", button);

		// driver.quit();*/

	}

}
