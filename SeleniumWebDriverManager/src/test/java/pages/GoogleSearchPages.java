package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleSearchPages {

	private static WebElement element = null;
	
	
	public static WebElement textBox_search(WebDriver driver) {		
		 element = driver.findElement(By.cssSelector("input[class='gLFyf gsfi']"));  //(By.name("q"));
		return element;
	}
	
	public static WebElement button_search(WebDriver driver) {
		element = driver.findElement(By.name("btnK"));
		System.out.println(element);
		return element;
		
	}
	
}
