package cucumberTests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumTest {
private static WebDriver driver = null;
public static void main(String[] args) {

	   System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
       driver = new FirefoxDriver();

       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       driver.get("http://www.google.com");
     
       /*
       driver.findElement(By.xpath(".//*[@id='account']/a")).click();
       driver.findElement(By.id("log")).sendKeys("testuser_1"); 
       driver.findElement(By.id("pwd")).sendKeys("Test@123");      
       driver.findElement(By.id("login")).click();
       
       System.out.println("Login Successfully");

       driver.findElement (By.xpath(".//*[@id='account_logout']/a")).click(); 
       */  
       System.out.println("LogOut Successfully");
       driver.quit();
	}
}