package sample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Scrolldown {
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
	    //Close the alert message
	    //WebDriverWait wait = new WebDriverWait(driver, 15);
	    //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='slds-button slds-button_icon toastClose slds-notify__close slds-button--icon-inverse slds-button_icon-bare']//lightning-primitive-icon")));
	    //driver.findElement(By.xpath("//button[@class='slds-button slds-button_icon toastClose slds-notify__close slds-button--icon-inverse slds-button_icon-bare']//lightning-primitive-icon")).click();
	    //Click the view error button
	    WebDriverWait wait1 = new WebDriverWait(driver, 90);
	    driver.manage().timeouts().implicitlyWait(90000, TimeUnit.SECONDS);
	    wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(text(),'View Error')]")));
	    driver.findElement(By.xpath("//button[contains(text(),'View Error')]")).click();
	    driver.findElement(By.xpath("//div[@class='windowViewMode-normal oneContent active lafPageHost']")).click();
	    Actions actions = new Actions(driver);
	    // Page Down
	    actions.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();
	    driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
	    driver.findElement(By.xpath("//span[@class='uiImage']")).click();
	    driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
	    driver.findElement(By.xpath("//a[@class='profile-link-label logout uiOutputURL']")).click();
	   
}
}
