package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SnapDealAction {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();

		ChromeOptions options = new ChromeOptions();

		options.addArguments("--disable-notifications--");

		ChromeDriver driver = new ChromeDriver(options);

		driver.get(" https://www.snapdeal.com/");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		WebElement MensFashion = driver
				.findElement(By.xpath("//div[@id='leftNavMenuRevamp']/div[1]/div[2]//ul[1]//li[7]/a/span"));

		Actions builder = new Actions(driver);

		builder.moveToElement(MensFashion).perform();

		Thread.sleep(5000);

		driver.findElement(By.xpath("(//span[text()='Shirts'])[2]")).click();

		WebElement firstElement = driver.findElement(By.xpath(
				"//div[@class='product-desc-rating ']/a/p[text()='Jolly 100 Percent Cotton Green Shirt Single']"));

		builder.moveToElement(firstElement).perform();

		driver.findElement(By.xpath("(//div[@class='clearfix row-disc'])[1]//div")).click();

		System.out.println("Clicked Quick view and closing browsers ");

		driver.quit();

	}

}
