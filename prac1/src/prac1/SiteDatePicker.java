package prac1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SiteDatePicker {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Datepicker.html");
		driver.manage().window().maximize();

		String expMonth = "October";
		String expYear = "2022";
		String expDay = "19";
		driver.findElement(By.xpath("//img[@class='imgdp']")).click();
		while (true) {

			String text = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			System.out.println(text);
			if (text.equalsIgnoreCase(expMonth)) {
				break;

			} else {
				driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
			}
		}
		driver.findElement(By.xpath("//tbody/tr[4]/td[4]")).click();

		}

	}


