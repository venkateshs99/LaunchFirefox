package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathExample {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","C:\\Users\\S VENKATESH\\eclipse-workspace\\Casestudy4\\Browserjars\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtusername")).sendKeys("Admin123");
		driver.findElement(By.xpath("//*[@id=\"btnLogin\"]")).click();
		


	}

}
