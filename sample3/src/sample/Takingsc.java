package sample;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Takingsc {
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
    driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
    WebDriverWait wait = new WebDriverWait(driver, 15);
    //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(text(),'Search')]")));
   // WebDriverWait wait = new WebDriverWait(driver, 90);
    driver.manage().timeouts().implicitlyWait(90000, TimeUnit.SECONDS);
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(text(),'View Error')]")));
    driver.findElement(By.xpath("//button[contains(text(),'View Error')]")).click();
    driver.findElement(By.xpath("//div[@class='windowViewMode-normal oneContent active lafPageHost']")).click();
    Actions actions = new Actions(driver);
    // Page Down
    actions.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();
    Thread.sleep(5000);
    Takingsc.takeSnapShot(driver, "E:\\Capture.jpg");
    Thread.sleep(50000);
	}
	 public static void takeSnapShot(WebDriver webdriver,String fileWithPath) throws Exception{

	        //Convert web driver object to TakeScreenshot

	        TakesScreenshot scrShot =((TakesScreenshot)webdriver);

	        //Call getScreenshotAs method to create image file

	                File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);

	            //Move image file to new destination

	                File DestFile=new File("E:\\Capture.jpg");

	                //Copy file at destination

	                FileUtils.copyFile(SrcFile, DestFile);

	    }
	 
	
    
	}
