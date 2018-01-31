package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerDriverService;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class IE {
private WebDriver driver;
	
	public IE() {
		System.setProperty(InternetExplorerDriverService.IE_DRIVER_EXE_PROPERTY,
				"{ドライバーのパス}/IEDriverServer_x64/IEDriverServer.exe");
		DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
		capabilities.setCapability(
				InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
		capabilities.setCapability(InternetExplorerDriver.IE_ENSURE_CLEAN_SESSION, true);
		InternetExplorerOptions options = new InternetExplorerOptions(capabilities);
		driver = new InternetExplorerDriver(options);
	}
	
	public WebDriver getDriver() {
		return driver;
	}
}
