package launchBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestChromeBrowser {

	public static void main(String[] args) {
		
    System.setProperty("webdriver.chrome.driver","C:\\Users\\S VENKATESH\\eclipse-workspace\\LaunchChromeBrowser\\SeleniumBrowserJars\\chromedriver.exe");
    
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.selenium.dev/");
    driver.quit();
	}

}
