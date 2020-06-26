package SeleniumBasic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebooklogin {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", ".//Drivers//geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.Facebook.com/");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Vedant");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Ahire");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("vedantahire7@gmail.com");
		driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("vedantahire7@gmail.com");
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("Vedant123");

		Select select = new Select(driver.findElement(By.id("day")));
		select.selectByValue("12");
		Select select1 = new Select(driver.findElement(By.id("month")));
		select1.selectByVisibleText("Jun");
		Select select2 = new Select(driver.findElement(By.id("year")));
		select2.selectByVisibleText("1994");
		
		driver.findElement(By.xpath("//input[@id=\'u_0_7\']")).click();
		System.out.println("Female Radio Btn is Selected:" + driver.findElement(By.id("u_0_6")).isSelected());
		System.out.println("male Radio Btn is Enable:" + driver.findElement(By.id("u_0_7")).isEnabled());
		
		driver.close();
	}

}
	

