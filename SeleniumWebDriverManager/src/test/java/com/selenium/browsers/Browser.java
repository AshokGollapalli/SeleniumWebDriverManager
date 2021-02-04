package com.selenium.browsers;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class Browser {
	public static String browser = "chrome"; // excel
	public static WebDriver driver;

	public static void main(String[] args) {
		

				if (browser.equals("firefox")) {

					driver = new FirefoxDriver();

				} else if (browser.equals("chrome")) {

					driver = new ChromeDriver();
				} else if (browser.equals("ie")) {

					driver = new InternetExplorerDriver();
				}
				driver.get("http://google.com");
				System.out.println(driver.getTitle());;
				
			}

		

}
