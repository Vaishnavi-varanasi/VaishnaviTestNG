package Axis.TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertTest {

	WebDriver driver;

	@Test
	public void SoftAssretTest() throws InterruptedException {
		SoftAssert st = new SoftAssert();
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver-win64/chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		String actualtittle = driver.getTitle();
		String expectedtitle = "Orange";

		st.assertEquals(actualtittle, expectedtitle);

		Thread.sleep(500);

		driver.findElement(By.xpath("//input[@name = 'username']")).sendKeys("Admin");
		driver.close();

	}
}
