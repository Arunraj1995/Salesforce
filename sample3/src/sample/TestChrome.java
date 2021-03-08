package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
 
import org.openqa.selenium.chrome.ChromeDriver;
 
public class TestChrome {
 
public static void main(String[] args) {
 
	System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Chromedriver.exe");
 
// Initialize browser
WebDriver driver=new ChromeDriver();
 
// Open facebook
driver.get("http://www.facebook.com");
 
// Maximize browser
 
driver.manage().window().maximize();
driver.findElement(By.xpath("//input[@id='email']")).sendKeys("champ.gjarun@gmail.com");
 
}
 
}