package SeleniumBasic;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NaukriLogin {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", ".//Drivers//geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://www.naukri.com");
		Set<String>Windows = driver.getWindowHandles();
		int WinCount = Windows.size();
		
System.out.println("No. of child windows:"+ (WinCount-1));
for(String Win:Windows)
{
	driver.switchTo().window(Win);
driver.manage().window().maximize();
System.out.println("Window title:"+driver.getTitle());

}
driver.switchTo().parentFrame();
driver.navigate().to("http://www.facebook.com");

	}

}
