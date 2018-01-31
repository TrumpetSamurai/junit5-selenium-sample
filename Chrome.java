package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

public class Chrome {
	private WebDriver driver;

	public Chrome() {
		System.setProperty(ChromeDriverService.CHROME_DRIVER_EXE_PROPERTY,
				"{ドライバーのパス}/ChromeDriver/chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	public WebDriver getDriver() {
		return driver;
	}

}
