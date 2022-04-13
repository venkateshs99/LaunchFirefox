package frames;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleFrames {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","C:\\Users\\S VENKATESH\\eclipse-workspace\\Locators in Selinium\\seleniumBrowserJars\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://the-internet.herokuapp.com/javascript_alerts");
		

	}

}
