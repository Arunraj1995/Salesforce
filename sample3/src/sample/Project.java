package sample;

import java.awt.AWTException;
import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Project {
	/**
	 * @param args
	 * @throws AWTException 
	 */
	public static void main(String[] args) throws AWTException {
		try {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//Login into lightsand
		driver.get("https://mainetti--lightsand.cs31.my.salesforce.com/");
		driver.manage().window().maximize();
	    driver.findElement(By.id("username")).sendKeys("crm.support@mainetti.com.lightsand");
	    driver.findElement(By.id("main")).click();
	    driver.findElement(By.id("password")).click();
	    driver.findElement(By.id("password")).sendKeys("kasetti555");
	    driver.findElement(By.id("Login")).click();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
	    //Failed scenario
	    driver.findElement(By.xpath("//button[@name='inventoryModal']")).click();
	    driver.findElement(By.xpath("//select[@id='630:0']")).click();
	    Select drpCompany = new Select(driver.findElement(By.xpath("//select[@id='630:0']")));
	    drpCompany.selectByVisibleText("Mainetti (HK) Ltd");
	    WebElement uploadElement = driver.findElement(By.xpath("//div[@class='cBatchMaster']//input[1]"));
	    uploadElement.sendKeys("E:\\Automation\\Error Inventory.csv");
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.xpath("//div[@id='customerBody']//button[@class='slds-button slds-button_brand'][contains(text(),'Upload')]")).click();
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    
	    //Close the alert message
	    WebDriverWait wait = new WebDriverWait(driver, 15);
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='slds-button slds-button_icon toastClose slds-notify__close slds-button--icon-inverse slds-button_icon-bare']//lightning-primitive-icon")));
	    driver.findElement(By.xpath("//button[@class='slds-button slds-button_icon toastClose slds-notify__close slds-button--icon-inverse slds-button_icon-bare']//lightning-primitive-icon")).click();
	    
	    //Click the view error button
	    WebDriverWait wait1 = new WebDriverWait(driver, 90);
	    driver.manage().timeouts().implicitlyWait(90000, TimeUnit.SECONDS);
	    wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(text(),'View Error')]")));
	    driver.findElement(By.xpath("//button[contains(text(),'View Error')]")).click();
	    driver.findElement(By.xpath("//div[@class='windowViewMode-normal oneContent active lafPageHost']")).click();
	    
	    //Page Down
	    Actions actions = new Actions(driver);
	    actions.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();
	    Thread.sleep(5000);
	    
	    //Screen shot method calling
	    Takingsc.takeSnapShot(driver, "E:\\Capture.jpg");
	    Thread.sleep(50000);
	    
	    
	    //Logout
	    /*driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
	    driver.findElement(By.xpath("//span[@class='uiImage']")).click();
	    driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
	    driver.findElement(By.xpath("//a[@class='profile-link-label logout uiOutputURL']")).click();*/
	    
	   
	    
	   //Valid scenario:
  	   /* driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.findElement(By.xpath("//button[@name='inventoryModal']")).click();
	    driver.findElement(By.xpath("//select[@id='617:0']")).click();
	    Select drpCompany = new Select(driver.findElement(By.xpath("//select[@id='617:0']")));
	    drpCompany.selectByVisibleText("Mainetti (HK) Ltd");
	    WebElement uploadElement = driver.findElement(By.xpath("//div[@class='cBatchMaster']//input[1]"));
	    uploadElement.sendKeys("E:\\Automation\\Valid data for Inventory.csv");
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.findElement(By.xpath("//div[@id='customerBody']//button[@class='slds-button slds-button_brand'][contains(text(),'Upload')]")).click();*/       
	    
        
        //Switch to window and click the button in pop-up
        /*driver.switchTo().alert().dismiss();
	    driver.switchTo().window("Data Transaction Upload Status");
	    WebDriverWait wait = new WebDriverWait(driver, 30);
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='closeAzure']/table/tbody/tr[3]/td/div/input")));
	    driver.findElement(By.xpath("//*[@id='closeAzure']/table/tbody/tr[3]/td/div/input")).click();*/
	    
		}
		
	    catch (Exception e) {
	    	e.printStackTrace();
	    }
		
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


