package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorsClsTag {
	public static void main(String[] args)  {
		
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://flipkart.com/");
	
	//className
	int slides = driver.findElements(By.className("_1mIbUg")).size();
	System.out.println(slides);
	
	
	//tagName
	int links = driver.findElements(By.tagName("a")).size();
	System.out.println(links);
	
	System.out.println("program excuited succesfully");
	
	//driver.get("https://google.com/");
	//driver.findElement(By.className("gb_g")).click();
	//driver.findElement(By.tagName("a")).click();
	
	
	}

}
