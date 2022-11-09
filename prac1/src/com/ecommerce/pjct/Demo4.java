package com.ecommerce.pjct;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/profile");
		driver.manage().window().maximize();
	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//div[normalize-space()='Forms']")).click();
		
		driver.findElement(By.xpath("//span[normalize-space()='Practice Form']")).click();
		
		driver.findElement(By.xpath("//input[@id='dateOfBirthInput']")).click();
		
		WebElement month=driver.findElement(By.xpath("//select[contains(@class,'react-datepicker__month-select')]"));
		Select sc=new Select(month);
		sc.selectByIndex(2);
		
	}

}
