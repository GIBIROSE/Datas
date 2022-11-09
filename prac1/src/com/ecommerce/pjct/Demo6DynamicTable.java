package com.ecommerce.pjct;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo6DynamicTable {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/admin/index.php?route=common/login");
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.xpath("//input[@id='input-username']")).click();
		driver.findElement(By.xpath("//input[@id='input-username']")).sendKeys("demo");

		driver.findElement(By.xpath("//input[@id='input-password']")).click();
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("demo");

		driver.findElement(By.xpath("//button[@type='submit']")).click();

		driver.findElement(By.xpath("//button[@class='btn-close']")).click();

		driver.findElement(By.xpath("//a[@href='#collapse-4']")).click();

		driver.findElement(By.xpath("//a[normalize-space()='Orders']")).click();

		// a[@href='https://demo.opencart.com/admin/index.php?route=customer/customer&user_token=0020df1ad2283b24d26e485457caf0f0']

		/*driver.findElement(By.xpath(
				"//a[@href='https://demo.opencart.com/admin/index.php?route=customer/customer&user_token=0020df1ad2283b24d26e485457caf0f0']"))
				.click();*/
		
		
		driver.findElement(By.xpath("//a[normalize-space()='>|']")).click();
		String value=driver.findElement(By.xpath("//span[@class='page-link']")).getText();
		System.out.println(value);

	}

}
