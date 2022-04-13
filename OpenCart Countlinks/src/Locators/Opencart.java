package Locators;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Opencart {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\S VENKATESH\\eclipse-workspace\\OpenCart Countlinks\\BrowserJars\\chromedriver.exe");
	    WebDriver driver= new ChromeDriver();
	    driver.manage().window().maximize();
		driver.get("https://demo.opencart.com/");
		java.util.List<WebElement> Links = driver.findElements(By.xpath("//a"));
		int Nolinks = Links.size();
		System.out.println("Number of Links in Calculation" +Nolinks);
		for(int i=0;i<Links.size();i++) {
			System.out.println(Links.get(i).getText());
			String str = Links.get(i).getText();
			String str1 = "Tablets";
			if(str.equals(str1)) {
				driver.findElement(By.linkText("Tablets")).click();
				driver.findElement(By.xpath(" //*[@id=\"menu\"]/div[2]/ul/li[4]/a")).click();
			}
		}
		 
			
	}
}


