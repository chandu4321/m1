package food;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Pizza_Test {
	@Test
	public void pizza() {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.pizzahut.co.in/");
		driver.quit();
	}
}
