package locators;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorsEx1 {
	public static void main(String[] args) throws InterruptedException  {
		
	//WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://facebook.com/");
	driver.manage().window().maximize();
	
	// id name locators
	driver.findElement(By.id("email")).sendKeys("9030014257");
	WebElement temp = driver.findElement(By.name("pass"));
	temp.sendKeys("9985471421");
	driver.findElement(By.name("login")).click();
	
	driver.close();
	
	// linkText and partialLinkTest
	//WebDriverManager.chromedriver().setup();
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\ashok gollapalli\\eclipse-workspace\\SeleniumWebDriverManager\\drivers\\geckodriver\\geckodriver.exe");
	WebDriver driver2 = new FirefoxDriver();
	//link Text
	driver2.get("https://amazon.in/");
	driver2.findElement(By.linkText("Smart bulbs & string lights")).click();
	//link partialText
	driver2.findElement(By.partialLinkText("Specialty")).click();
	
	Thread.sleep(10000);
	driver2.close();
	System.out.println("program excuited succesfully");
	}

}
