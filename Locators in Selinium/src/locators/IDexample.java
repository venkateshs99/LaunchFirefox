package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IDexample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\S VENKATESH\\eclipse-workspace\\Locators in Selinium\\seleniumBrowserJars\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testng.org/doc/download.html");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtusername")).sendKeys("Admin123");
		
	
	}

}
