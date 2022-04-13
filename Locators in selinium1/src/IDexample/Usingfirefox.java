package IDexample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Usingfirefox {

	public static void main(String[] args) {
System.setProperty("webdriver.geko.driver","C:\\Users\\S VENKATESH\\eclipse-workspace\\Locators in selinium1\\FirefoxBrowser\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtusername")).sendKeys("Admin123");
		

	}

}
