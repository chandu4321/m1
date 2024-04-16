package food;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Swiggy_Test {

	@Test
	public void swiggy() {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.swiggy.com/city/bangalore");
		driver.quit();
	}
}
