package Axis.TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class HardAssertTest {
	WebDriver driver;

	@Test
	public void HardAssretTest() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver-win64/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		String actualtittle = driver.getTitle();
		String expectedtitle = "Orange";

		Assert.assertEquals(actualtittle, expectedtitle);

		Thread.sleep(500);

		driver.findElement(By.xpath("//input[@name = 'username']")).sendKeys("Admin");
		driver.close();
	}
}
