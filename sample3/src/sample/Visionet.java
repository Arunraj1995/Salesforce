package sample;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Visionet {

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		JavascriptExecutor js;
		// TODO Auto-generated method stub
		try {
			System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			
			//Login into lightsand
			driver.get("https://techkasetti--chat.my.salesforce.com");
			driver.manage().window().maximize();
		    driver.findElement(By.id("username")).sendKeys("kasettitechnologies@isvedition.org.chat");
		    driver.findElement(By.id("password")).sendKeys("kasetti@555");
		    driver.findElement(By.id("Login")).click();
		    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		   
		    
		    //Search by keyword
		    //driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[1]/section[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/lightning-input[1]/div[1]/input[1]")).sendKeys("ROYCE-2 Running Shoes For Men");
		    Thread.sleep(1000);
		   // driver.findElement(By.xpath("//body/div[4]/div[1]/section[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[4]/button[1]/span[1]")).click();
		    //Search by image
		    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		    driver.findElement(By.xpath("//body/div[4]/div[1]/section[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/button[1]")).click();
		    Thread.sleep(1000);
		   
		}catch (Exception e) {
		    	e.printStackTrace();
		    }
	}		

}

