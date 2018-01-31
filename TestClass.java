package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import org.openqa.selenium.WebDriver;

@ExtendWith(WebDriverExtension.class)
public class TestClass {
	private static final String PAGE_URL = "https://www.google.co.jp/";
	
	@Test
	public void test1(Chrome driver) {
		WebDriver dr = driver.getDriver();
		dr.navigate().to(PAGE_URL);
		String title = dr.getTitle();
		assertEquals("Google", title, "タイトル 違う");
		dr.quit();
	}
	
	@Test
	public void test2(Edge driver) {
		WebDriver dr = driver.getDriver();
		dr.navigate().to(PAGE_URL);
		String title = dr.getTitle();
		assertEquals("Google", title, "タイトル 違う");
		dr.quit();
	}
	
	@Test
	public void test3(Firefox driver) {
		WebDriver dr = driver.getDriver();
		dr.navigate().to(PAGE_URL);
		String title = dr.getTitle();
		assertEquals("Google", title, "タイトル 違う");
		dr.quit();
	}
	
	@Test
	public void test4(IE driver) {
		WebDriver dr = driver.getDriver();
		dr.navigate().to(PAGE_URL);
		String title = dr.getTitle();
		assertEquals("Google", title, "タイトル 違う");
		dr.quit();
	}
	
	@Test
	public void test5(ChromeHeadless driver) {
		WebDriver dr = driver.getDriver();
		dr.navigate().to(PAGE_URL);
		String title = dr.getTitle();
		assertEquals("Google", title, "タイトル 違う");
		dr.quit();
	}
	
	@Test
	public void test6(FirefoxHeadless driver) {
		WebDriver dr = driver.getDriver();
		dr.navigate().to(PAGE_URL);
		String title = dr.getTitle();
		assertEquals("Google", title, "タイトル 違う");
		dr.quit();
	}
}
