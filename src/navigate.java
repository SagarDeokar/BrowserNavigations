import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class navigate {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new FirefoxDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://www.google.com");
		Thread.sleep(3000);

		driver.get("https://www.yahoo.com");
		Thread.sleep(3000);

		driver.navigate().back();
		Thread.sleep(3000);

		driver.navigate().forward();
		Thread.sleep(3000);

		driver.navigate().refresh();
		Thread.sleep(3000);

		driver.navigate().to("https://www.facebook.com");
		Thread.sleep(3000);

		driver.quit();
	}
}