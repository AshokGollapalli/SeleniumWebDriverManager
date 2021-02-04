package SampleProject1;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Pillow {
	static WebDriver driver = null;
	public static void main(String[] args) throws InterruptedException  {
		
		ExtentHtmlReporter htmlReport = new ExtentHtmlReporter("ExtentReportsOfBuyingPillow.html");
		
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(htmlReport);
		
		ExtentTest test1 = extent.createTest("Buying Pillow", "this isa test to validate BuyingPillow functionality");
		
		WebDriver driver=new ChromeDriver();
		test1.log(Status.INFO, "starting test case");
		driver.get("https://demo.midtrans.com/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		WebElement clickBuy= driver.findElement(By.xpath("//*[@id=\"container\"]/div/div/div[1]/div[2]/div/div[1]/a"));
		clickBuy.click();
		test1.pass("Selected clickbuy button");
		Thread.sleep(2000);
		test1.log(Status.INFO, "Selecting test button");
				
		//WebDriverWait wait1= new WebDriverWait(driver,10);
		//wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='cart-checkout']"))).click();
		WebElement chekout=driver.findElement(By.xpath("//div[@class='cart-checkout']"));
		chekout.click();
		test1.pass("Selected checkout button");
		
		test1.log(Status.INFO, "Selecting Continue button");	
		WebElement testframe = driver.findElement(By.xpath("//*[@id=\"snap-midtrans\"]"));
		driver.switchTo().frame(testframe);
		
		//WebDriverWait wait= new WebDriverWait(driver,30);
		//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(@class,\"button-main\")]"))).click();
		WebElement contin=driver.findElement(By.xpath("//a[contains(@class,\"button-main\")]"));
		contin.click();
		test1.pass("Selected Continue button");
		
		//WebDriverWait wait1= new WebDriverWait(driver,30);
		//wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='payment-list']/div[1]/a/div[2]/div[2]"))).click();
		
		test1.log(Status.INFO, "Selecting Credit Card Option");
		WebElement credit=driver.findElement(By.xpath("//*[@id=\"payment-list\"]/div[1]/a/div[2]/div[2]"));
		credit.click();
		test1.pass("Selected credit card Option");
		
		test1.log(Status.INFO, "Checking Credentials");
		int y,OTP;
		int Date=1224;
		//System.out.println("Enter account no ");
		//Scanner sc=new Scanner(System.in);
		long x=4811111111111114l;
				//sc.nextLong();
		
		//System.out.println("Enter CVV no ");
		y= 123;
		//sc.nextInt();
		
		//System.out.println("Enter Expiry date ");
		Date=1224;
		//sc.nextInt();
		
		//System.out.println("Enter OTP ");
		OTP=112233;
		//sc.nextInt();
		
		if((x==4811111111111114l) && (y==123) && (Date==1224) && (OTP==112233))
		{
			System.out.println("your credentials are validated Sucessfully");
		}
		else 
		{
			System.out.println("wrong credentials provided ");
			System.exit(0);
		}
					
		test1.pass("credentials are validated Sucessfully");	
		
		test1.log(Status.INFO, "Entering Account number");
		WebElement cardNo=driver.findElement(By.xpath("//*[@id=\"application\"]/div[3]/div/div/div/form/div[2]/div[1]/input"));
		//Long x=4811111111111114l;
		cardNo.sendKeys("4811111111111114l");
		test1.pass("Entered Account number");
		
		test1.log(Status.INFO, "Entering CVV");
		driver.findElement(By.xpath("//*[@id=\"application\"]/div[3]/div/div/div/form/div[2]/div[3]/input")).sendKeys("123");
		test1.pass("123");
		
		test1.log(Status.INFO, "Entering Date");
		driver.findElement(By.xpath("//*[@id=\"application\"]/div[3]/div/div/div/form/div[2]/div[2]/input")).sendKeys("1224");
		test1.pass("1224");
		
		
		
		test1.log(Status.INFO, "Click on pay now");
		driver.findElement(By.xpath("//*[@id=\"application\"]/div[1]/a")).click();
		test1.pass("Clicked on pay now");
		
		
		
		WebElement testframe2 = driver.findElement(By.xpath("//*[@id=\"application\"]/div[3]/div/div/div/iframe"));
		driver.switchTo().frame(testframe2);
		
		
		test1.log(Status.INFO, "Click on ok");
		//WebDriverWait wait3= new WebDriverWait(driver,30);
		//System.out.println("hi i am");
		//wait3.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"acsForm\"]/div[6]/div/button[1]"))).click();
		Thread.sleep(3000);
		WebElement ok=driver.findElement(By.xpath("//*[@id=\"acsForm\"]/div[6]/div/button[1]"));
		ok.click();
		test1.pass("Clicked on ok");
		
		test1.pass("close the browser");
		test1.info("test completed");
		extent.flush();
			
		
		
	}

	}
