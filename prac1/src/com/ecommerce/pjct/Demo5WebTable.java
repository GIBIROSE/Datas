package com.ecommerce.pjct;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo5WebTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//row count in static webtable using tr
		int row = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr")).size();
		System.out.println(row);
// column count using th 
		int column = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/th")).size();
		System.out.println("Column count is: " + column);
// text in the row
		WebElement rowText = driver.findElement(By.xpath("//table[@id='customers']/tbody/tr[2]/td[1]"));
		System.out.println(rowText.getText());

		WebElement data = driver.findElement(By.xpath("//table[@id='customers']/tbody/tr[2]"));
		System.out.println(data.getText());

		for (int i = 1; i <= row; i++) {

			for (int j = 1; j <= column; j++) {
				String output = driver
						.findElement(By.xpath("//table[@id='customers']/tbody/tr[" + i + "]/td[" + j + "]")).getText();
				System.out.println("Table data is:" + output);

			}

		}

	}

}
