package food;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Kfc_Test {

	@Test
	public void kfc() {
		WebDriver driver= new ChromeDriver();
		driver.get("https://online.kfc.co.in/");
		driver.quit();
	}
}
