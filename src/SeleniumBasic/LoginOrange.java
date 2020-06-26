package SeleniumBasic;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class LoginOrange {
	static WebDriver driver;
	public static void main(String args[]) throws IOException {
		System.setProperty("webdriver.gecko.driver", ".//Drivers//geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://luffymugivara-trials65101.orangehrmlive.com/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("@TrV78pQaO");
		driver.findElement(By.xpath("//input[@name='Submit']")).click();
		driver.findElement(By.id("user-dropdown")).click();
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File Source = ts.getScreenshotAs(OutputType.FILE);
		File Dest = new File(".//Screenshot//LogoutDetect"+".png");
		FileUtils.copyFile(Source, Dest);
		System.out.println("Screenshot taken");
		
		
		
		
		
	}

}
