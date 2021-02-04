package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorsXpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
 WebDriverManager.chromedriver().setup();
 WebDriver driver = new ChromeDriver();
 driver.get("https://amazon.in/");
 driver.manage().window().maximize();
 
/* //absolute xPath 
 
 driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[2]/div/form/div[2]/div[1]/input")).sendKeys("laptop accessories");
 driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[2]/div/form/div[3]/div/span/input")).click();*/
 
 //Relative xpath
 
 //driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("wifirouters");
// driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).sendKeys(Keys.RETURN);
 
 //relative xpath with or operator
 
 //driver.findElement(By.xpath("//input[@name='field-keywords' or aria-label='Search']")).sendKeys("earphones");
// driver.findElement(By.xpath("//input[@id='nav-search-submit-button' or type='submit']")).click();
 
//relative xpath with and operator
 //driver.findElement(By.xpath("//input[@name='field-keywords' and @aria-label='Search']")).sendKeys("earphones");
 //driver.findElement(By.xpath("//input[@id='nav-search-submit-button' and @type='submit']")).click();
  
 // contain and start-with
 //driver.findElement(By.xpath("//input[contains(@id,'textbox')]")).sendKeys("earrings");//twotabsearchtextbox
 //driver.findElement(By.xpath("//input[starts-with(@id,'nav')]")).click();//id="nav-search-submit-button"
 //driver.findElement(By.xpath("//a[contains(text(),'Customer Service')]")).click();
 
 //driver.findElement(By.xpath("//a[text()='Customer Service']")).click();
 //input[@id='twotabsearchtextbox']
 
 // form method
 driver.findElement(By.xpath("//form[@id='nav-search-bar-form']//input[@type='text']")).sendKeys("earrings");
 driver.findElement(By.xpath("//form[@id=\"nav-search-bar-form\"]//input[@type=\"submit\"]")).click();
 
 
 Thread.sleep(1000);
  driver.close();
	}

	
}
