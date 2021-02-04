import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumTest {

	public static void main(String[] args) {
		
		 
		 WebDriverManager.chromedriver().browserVersion("2.36").setup();
		 WebDriver driver = new ChromeDriver();
		
		//WebDriverManager.firefoxdriver().setup();
		//WebDriver driver = new FirefoxDriver();
		 
		 
		 driver.get("https://google.com/");
		 driver.close();
		// Thread.sleep(3000);
	}
	
}
 