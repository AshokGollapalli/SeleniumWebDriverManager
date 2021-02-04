package locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class Synchronisation
{
public static void main(String[] args)
{
//System.setProperty("WebDriver.firefox.driver","C:\\Users\\ashok gollapalli\\eclipse-workspace\\SeleniumWebDriverManager\\drivers\\geckodriver\\geckodriver.exe");
WebDriverManager.firefoxdriver().setup();
WebDriver driver=new FirefoxDriver();
driver.get("https://www.facebook.com/");
driver.findElement(By.id("email")).sendKeys("9030014257");
driver.findElement(By.name("pass")).sendKeys("9985471421");
driver.findElement(By.name("login")).click();
try
{
Thread.sleep(20000);
}
catch (InterruptedException e)
{
e.printStackTrace();
}
driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[1]/div[2]/div[4]/div[2]/div/div/div[1]/div[1]/div/div/div/div/div/div/div/div/div[1]/div/div[3]/div/div[4]/div/div[1]/div[2]/div/div/div/div/span")).click();
driver.close();
}
}