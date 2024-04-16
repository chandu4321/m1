package food;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Zomato_Test {
	@Test
	public void zomato() {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.zomato.com/bangalore");
		driver.quit();
	}
}
