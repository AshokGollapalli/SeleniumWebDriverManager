package Assignement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import java.util.concurrent.TimeUnit;
public class getValu
{
	
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ashok gollapalli\\eclipse-workspace\\SeleniumWebDriverManager\\drivers\\ChromeDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com/");
		WebElement ele1= driver.findElement(By.name("q"));
		driver.findElement(By.name("q")).sendKeys("ashok");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		String s1 = ele1.getAttribute("value");
		System.out.println(s1);
		int v1=s1.length();
		System.out.println(v1);
		driver.close();
	}
	
	
}