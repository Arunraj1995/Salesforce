package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://mainetti--lightsand.cs31.my.salesforce.com/");
		driver.manage().window().maximize();
	    driver.findElement(By.id("username")).sendKeys("crm.support@mainetti.com.lightsand");
	    driver.findElement(By.id("main")).click();
	    driver.findElement(By.id("password")).click();
	    driver.findElement(By.id("password")).sendKeys("kasetti555");
	    driver.findElement(By.id("Login")).click();
	    driver.findElement(By.xpath("//body/div[4]/div[1]/section[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/button[1]")).click();
	   // driver.findElement(By.xpath("//tbody/tr[1]/td[10]/div[1]/button[2]")).click();
	}
}
