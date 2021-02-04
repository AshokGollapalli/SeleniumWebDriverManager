package com.selenium.browsers;

import java.util.Scanner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Browsers {
	public static WebDriver driver;
	public static void main(String[] args) {
		System.out.println("Enter Which browser you want Chrome or Firefox or IE ");
		Scanner sc = new Scanner(System.in);
		String browser = sc.next();
		switch(browser) {
		case "Chrome":
			driver = new ChromeDriver();
			break;
		case "Firefox":
			driver = new FirefoxDriver();
			break;
		case "IE":
			driver = new InternetExplorerDriver();
			break;
		}
		
		driver.get("https://accounts.google.com/");
		driver.getTitle();
		
		
		
	}
	
}