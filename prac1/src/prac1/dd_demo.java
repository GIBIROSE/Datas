package prac1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dd_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://www.redbus.in/");
		driver.manage().window().maximize();

		//String year = "2022";
		//String month = "October";
		String date = "10 October 2022";

		driver.findElement(By.xpath("//input[@id='onward_cal']")).click();
		
		
		

			String arr[] = date.split(" ");
			String dat=arr[0];
			String mon = arr[1];
			String yr = arr[2];

		while(true) {
			//String monthYear=
		}
		

		/*List<WebElement> alloptions = driver.findElements(By.xpath("//tbody/tr/td"));
		for (WebElement option : alloptions) {

			if (option.getText().equalsIgnoreCase(date)) {
				option.click();

			}
		}*/
	}

}
