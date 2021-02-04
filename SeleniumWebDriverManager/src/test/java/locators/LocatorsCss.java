package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
//import java.lang.Thread;

public class LocatorsCss {
	public static void main(String[] args)  {
		
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://facebook.com/");
	
	try
	{
	//cssSelector by tag id method
	driver.findElement(By.cssSelector("input#email")).sendKeys("9030014257");
	
	
	//cssSelector by tag class
	//driver.findElement(By.cssSelector("input.inputText")).sendKeys("9030014257");
	
	//driver.findElement(By.xpath("//input[@id = 'pass' and @class = 'inputtext _55r1 _6luy']")).sendKeys("9985471421");
	
	//cssSelector by tag&attribute
	driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("9985471421");
	
	System.out.println("program excuited succesfully");
	}

	finally {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.close();
		driver.quit();
	
	}
	}
}
