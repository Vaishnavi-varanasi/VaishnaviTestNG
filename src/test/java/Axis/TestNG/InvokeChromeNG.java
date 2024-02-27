package Axis.TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class InvokeChromeNG {
	public static WebDriver driver;
	@Test
	public void InvokeChromeBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver-win64/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/");
	}
}