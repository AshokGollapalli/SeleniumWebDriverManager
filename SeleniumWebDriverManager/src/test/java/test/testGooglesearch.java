package test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class testGooglesearch {

	public static void main(String[] args) throws InterruptedException {
		 GoogleSearch();
		
	}
	public static void GoogleSearch() throws InterruptedException {
		
	
		/*String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/ChromeDrivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();*/
		
				
		
		 WebDriverManager.chromedriver().setup();
		 WebDriver driver = new ChromeDriver();
		 
		//WebDriverManager.firefoxdriver().setup();
		//WebDriver driver = new FirefoxDriver();
		 
		
		driver.get("https://google.co.in");
		
		driver.findElement(By.name("q")).sendKeys("Automation step by step");
		
		/*WebDriverWait wait1 = new WebDriverWait(driver, 10);
		WebElement element1 = wait1.until(ExpectedConditions.elementToBeClickable(By.name("btnK")));
		element1.click();*/
		
		Thread.sleep(1000);
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);

		driver.close();
		
		System.out.println("THE AUTOMATION COMPLEATED SUCCESFULLY");
		
	}
	
	
	
	
	

}
