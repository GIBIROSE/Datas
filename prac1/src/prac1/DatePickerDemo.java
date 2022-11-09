package prac1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DatePickerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.dummyticket.com/dummy-ticket-for-visa-application/");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//input[@id='dob']")).click();
		WebElement month = driver.findElement(By.xpath("//select[@aria-label='Select month']"));
		month.click();
		Select sc = new Select(month);
		sc.selectByIndex(10);
		WebElement year = driver.findElement(By.xpath("//select[@aria-label='Select year']"));
		year.click();
		Select sc1 = new Select(year);
		sc1.selectByVisibleText("2022");
		
		
		String date = "5";
		List<WebElement> alldateOpt = driver.findElements(By.xpath("//tr/td[@data-handler='selectDay']"));
		for (WebElement opt : alldateOpt) {
			if (opt.getText().equals(date)) {
				opt.click();
				break;
			}
		}

	}

}
