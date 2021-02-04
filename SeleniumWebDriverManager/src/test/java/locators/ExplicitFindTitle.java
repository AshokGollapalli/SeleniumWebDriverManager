package locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitFindTitle {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("9030014257");
		driver.findElement(By.name("pass")).sendKeys("9985471421");
		driver.findElement(By.name("login")).click();
		WebDriverWait wait=new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.titleIs("Facebook – log in or sign up"));
		WebElement ele = driver.findElement(By.xpath("//*[@id=\"mount_0_0\"]/div/div[1]/div/div[3]/div/div/div[1]/div[1]/div/div[1]/div/div/div[1]/div/div/div[1]/div[1]/ul/li[4]/div/a/div[1]/div[2]/div/div/div/div/span/span"));
		ele.click();
		driver.close();
	}

	

}
