package prac1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BookingDatePicker {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.booking.com/");
		driver.manage().window().maximize();

		String monthyear = "October 2022";

		driver.findElement(By.xpath("//div[@class='sb-date-field b-datepicker']/div/span")).click();

		Thread.sleep(2000);

		while (true) {

			String text = driver
					.findElement(
							By.xpath("//div[@class='bui-calendar__main b-a11y-calendar-contrasts']//div[1]//div[1]"))
					.getText();
			System.out.println(text);

			if (text.equalsIgnoreCase(monthyear)) {
				break;
			}

			else {
				driver.findElement(By.xpath("//div[@data-bui-ref='calendar-next']")).click();
			}
		}
		String day = "2";
		List<WebElement> alldates = driver.findElements(By.xpath(
				"//body[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[3]/div[1]/table[1]/tbody[1]/tr/td"));

		for (WebElement option : alldates) {
			if (option.getText().equalsIgnoreCase(day)) {
				option.click();
			}
		}

	}

}
