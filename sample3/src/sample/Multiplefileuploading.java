package sample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiplefileuploading {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://mainetti--lightsand.cs31.my.salesforce.com/");
		driver.manage().window().maximize();
	    driver.findElement(By.id("username")).sendKeys("ashwin.raj@techkasetti.com");
	    driver.findElement(By.id("main")).click();
	    driver.findElement(By.id("password")).click();
	    driver.findElement(By.id("password")).sendKeys("kasetti555");
	    driver.findElement(By.id("Login")).click();
	    Thread.sleep(5000);
	   
	    driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
	    driver.findElement(By.xpath("//button[@name='inventoryModal']")).click();
	    driver.findElement(By.xpath("//select[@id='617:0']")).click();
	    Select drpCompany = new Select(driver.findElement(By.xpath("//select[@id='617:0']")));
	    drpCompany.selectByVisibleText("Mainetti (HK) Ltd");
	   //driver.findElement(By.xpath("///div[@class='cBatchMaster']//input[1]")).click();
	    WebElement uploadElement = driver.findElement(By.xpath("//div[@class='cBatchMaster']//input[1]"));
	    uploadElement.sendKeys("E:\\Automation\\Error Inventory.csv");
	    driver.findElement(By.xpath("//div[@id='customerBody']//button[@class='slds-button slds-button_brand'][contains(text(),'Upload')]")).click();
	    
	}
}


