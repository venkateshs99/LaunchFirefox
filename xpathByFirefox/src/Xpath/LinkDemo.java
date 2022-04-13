package Xpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class LinkDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.geko.driver","C:\\Users\\S VENKATESH\\eclipse-workspace\\xpathByFirefox\\FirefoxJars\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.easycalculation.com/");
        //counting no of links in EasyCalculation
        List<WebElement> Links = driver.findElements(By.xpath("//a"));
        int Nolinks = Links.size();
        System.out.println("Number of Links in calculation is...." + Nolinks);
        //if Link Exit in Easy calculation then print each link
        for(int i=0; i<=Links.size(); i++) {
        	System.out.println(Links.get(i).getText());
        	String str = Links.get(i).getText();
        	String strl = "Love Calculator";
        	if(str.equals(strl)) {
        		driver.findElement(By.linkText("Love Calculator")).click();
        		driver.findElement(By.xpath("//*[@id=\"alarmContentDisplay\"]/div[1]/div[6]/div[2]/div[1]/ul/li[2]/a"));
        		
        	}
        }
        
	}

}
