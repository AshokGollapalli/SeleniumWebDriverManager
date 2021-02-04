package locators;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ColorsByGetCss {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement element1 = driver.findElement(By.id("email"));
		element1.sendKeys(Keys.SHIFT);
		//System.out.println(element1.));
		System.out.println(element1.getCssValue("font-size"));		
		driver.close();
	}

}
