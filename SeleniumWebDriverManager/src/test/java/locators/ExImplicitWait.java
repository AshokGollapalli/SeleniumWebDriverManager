package locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExImplicitWait {

	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		
		//driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/");			
		driver.findElement(By.id("email")).sendKeys("9030014257");
		driver.findElement(By.name("pass")).sendKeys("9985471421");
		
		driver.findElement(By.name("login")).click();
		WebDriverWait wait= new WebDriverWait(driver,10);//if error present it will wait for 10 seconds to give no such element exception
		//actually wait is useful in case of any delay in loading webpage or application
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/div[1]/div[1]/div[3]/div/div/div[1]/div[1]/div/div[1]/div/div/div[1]/div/div/div[1]/div[1]/ul/li[3]/div/a/div[1]/div[2]/div/div/div/div/span/span"))).click();
		String title=driver.getTitle();
		System.out.println(title);
		driver.close();
	
	}
	
}
