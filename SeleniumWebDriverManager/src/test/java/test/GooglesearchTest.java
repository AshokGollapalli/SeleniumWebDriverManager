package test;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.GoogleSearchPages;

public class GooglesearchTest {

	private static WebDriver driver = null;
	
	public static void main(String[] args) throws InterruptedException, IOException {
		 GoogleSearch();
		 
	}
	
	public static void GoogleSearch() throws InterruptedException, IOException {
		
	
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/ChromeDrivers/chromedriver.exe");
		 driver = new ChromeDriver();
		
						
		// WebDriverManager.chromedriver().setup();
		 //WebDriver driver = new ChromeDriver();
		 
		//WebDriverManager.firefoxdriver().setup();
		//WebDriver driver = new FirefoxDriver();
		 
		// driver.get("https://gmail.com");
		driver.navigate().to("https://google.co.in");
		System.out.println("Title:" + driver.getTitle());
		System.out.println("URL:" + driver.getCurrentUrl());
		// System.out.println("Title:" + driver.getPageSource());
		// driver.navigate().back();
		// driver.navigate().forward();
		
		driver.manage().window().maximize();
		
		//driver.findElement(By.name("q")).sendKeys("Automation step by step");
		
		GoogleSearchPages.textBox_search(driver).sendKeys("Automation ");
		
		WebElement temp = GoogleSearchPages.button_search(driver);
		Thread.sleep(1000);
		temp.click();
		//Thread.sleep(1000);
		//GoogleSearchPages.button_search(driver).click();
		File f= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f, new File("C:\\Users\\ashok gollapalli\\Downloads\\image.png"));
			
		//driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		driver.close();
		
		System.out.println("THE AUTOMATION COMPLEATED SUCCESFULLY");
		
	}
	
	
	
	
	

}
