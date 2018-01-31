package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverService;

public class Firefox {
	private WebDriver driver;

	public Firefox() {
		System.setProperty(GeckoDriverService.GECKO_DRIVER_EXE_PROPERTY,
				"{ドライバーのパス}/GeckoDriver/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	public WebDriver getDriver() {
		return driver;
	}
}
