package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeDriverService;

public class Edge {
	private WebDriver driver;
	
	public Edge() {
		System.setProperty(EdgeDriverService.EDGE_DRIVER_EXE_PROPERTY,
				"{ドライバーのパス}/EdgeDriver/MicrosoftWebDriver.exe");
		driver = new EdgeDriver();
	}
	
	public WebDriver getDriver() {
		return driver;
	}
}
