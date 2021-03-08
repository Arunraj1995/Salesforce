package Mainetti;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.util.concurrent.TimeUnit;
public class DataUpload {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
private Object LOB;
  @Before
  public void setUp() {
	    System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Chromedriver.exe");
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void untitled() {
    driver.get("https://mainetti--lightsand.cs31.my.salesforce.com/");
    driver.manage().window().setSize(new Dimension(1366, 728));
    driver.findElement(By.id("username")).sendKeys("ashwin.raj@techkasetti.com");
    driver.findElement(By.id("main")).click();
    driver.findElement(By.id("password")).click();
    driver.findElement(By.id("password")).sendKeys("kasetti555");
    driver.findElement(By.id("Login")).click();
    //Click the button
    driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
    //Type inv
    driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).sendKeys("inv");
    //Choose Inventory Upload
    driver.findElement(By.xpath("//li[@id='02up00000000tOpAAI']//a[@id='appTile']")).click();
    //Click Upload
    driver.findElement(By.xpath("//button[@name='inventoryModal']")).click();
    //Mainetti company choosing
    driver.findElement(By.xpath("//select[@id='20:469;a']")).click();
    //Select dropdown
    
    //Choose file button
    driver.findElement(By.xpath("//div[@class='cBatchMaster']//input[1]")).click();
    //file choosing
    driver.findElement(By.cssSelector("input:nth-child(4)")).click();
    //Upload
    driver.findElement(By.xpath("//button[@class='slds-button slds-button_brand'][contains(text(),'Upload')]")).click();
    //View Error
    driver.findElement(By.xpath("//button[@name='a1Np000000IhuZxEAJ'][contains(text(),'View Error')]")).click();
    //Scroll down
    js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
    //Screenshot
    
    //again next file should upload(Repeat the process)
    
    //Sales
    //Click the button
    driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
    //Type sal
    driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).sendKeys("sal");
    //Choose sales inventory
    driver.findElement(By.xpath("//li[@id='02up00000000tOkAAI']//a[@id='appTile']")).click();
    //Upload file
    driver.findElement(By.xpath("//button[@name='inventoryModal']")).click();
    //Country
    driver.findElement(By.xpath("//select[@id='18:468;a']")).click();
    //select dropdown
    Select drpcountry = new Select(driver.findElement(By.name("Country")));
    drpcountry.selectByVisibleText("Hong Kong");
    drpcountry.selectByIndex(15);
    //Month
    driver.findElement(By.xpath("//select[@id='35:468;a']")).click();
    Select drpmonth = new Select(driver.findElement(By.name("Month")));
    drpmonth.selectByIndex(2);
    //year
    driver.findElement(By.xpath("//select[@id='52:468;a']")).click();
    Select drpyear = new Select(driver.findElement(By.name("Year")));
    drpyear.selectByIndex(1);
    //choose file
    driver.findElement(By.xpath("//div[@class='cBatchMaster']//input[1]")).click();
    //file choosing
    driver.findElement(By.cssSelector("input:nth-child(4)")).click();
    //upload
    driver.findElement(By.xpath("//button[@class='slds-button slds-button_brand'][contains(text(),'Upload')]")).click();
    //View Error
    driver.findElement(By.xpath("//button[@name='a1Np000000IhuZxEAJ'][contains(text(),'View Error')]")).click();
    //Scroll down
    js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
    //Scroll right
    js.executeScript("arguments[0].scrollIntoView();",LOB );
    //Screenshot
    
    
    //Repeat the process
    
}
}