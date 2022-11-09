package com.ecommerce.pjct;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/elements");
		driver.manage().window().maximize();
		//driver.manage().deleteAllCookies();
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		//textbox
		driver.findElement(By.xpath("//span[normalize-space()='Text Box']")).click();
		
		driver.findElement(By.xpath("//input[@id='userName']")).click();
		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("Grm");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;

		WebElement button = driver.findElement(By.xpath("//button[@id='submit']"));
		js.executeScript("arguments[0].click();", button);
		
		//checkbox
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[normalize-space()='Check Box']")).click();
		
		//span[normalize-space()='Home']
		//driver.findElement(By.xpath("//span[normalize-space()='Home']")).click();
		driver.findElement(By.xpath("//button[@title='Toggle']//*[name()='svg']")).click();
		
		driver.findElement(By.xpath("//span[contains(text(),'Documents')]")).click();
		System.out.println(driver.findElement(By.xpath("//div[@id='result']")).getText());

	}

}
//div[contains(@class,'header-text')][normalize-space()='Elements']
