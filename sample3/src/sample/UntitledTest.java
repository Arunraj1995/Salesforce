package sample;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.util.concurrent.TimeUnit;
public class UntitledTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
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
    driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    driver.findElement(By.name("inventoryModal")).click();
    driver.findElement(By.id("345:0")).click();
    {
      WebElement dropdown = driver.findElement(By.id("345:0"));
      driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
      dropdown.findElement(By.xpath("//option[. = 'Inventory']")).click();
    }
    driver.findElement(By.id("345:0")).click();
    driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    driver.findElement(By.id("777:0")).click();
    {
      driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
      WebElement dropdown = driver.findElement(By.id("777:0"));
      driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
      dropdown.findElement(By.xpath("//option[. = 'Mainetti (HK) Ltd']")).click();
    }
    driver.findElement(By.id("777:0")).click();
    driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    driver.findElement(By.cssSelector("input:nth-child(4)")).click();
    {
    	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
      WebElement element = driver.findElement(By.cssSelector(".slds-button:nth-child(6)"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).clickAndHold().perform();
    }
    {
      WebElement element = driver.findElement(By.cssSelector(".slds-button:nth-child(6)"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.cssSelector(".slds-button:nth-child(6)"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).release().perform();
    }
    driver.findElement(By.cssSelector(".slds-button:nth-child(6)")).click();
    driver.findElement(By.cssSelector(".slds-fade-in-open lightning-primitive-icon")).click();
    driver.findElement(By.name("a1Np000000IhVbuEAF")).click();
    {
      WebElement element = driver.findElement(By.name("a1Np000000IhVbuEAF"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }
    {
      WebElement element = driver.findElement(By.cssSelector("tr:nth-child(2) .slds-button:nth-child(2)"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }
    driver.findElement(By.cssSelector("tr:nth-child(1) > td:nth-child(9) > div > div")).click();
    {
      WebElement element = driver.findElement(By.cssSelector(".uiImage"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    driver.findElement(By.cssSelector(".uiImage")).click();
    {
      WebElement element = driver.findElement(By.cssSelector(".tooltipTrigger > .photoContainer"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    driver.findElement(By.linkText("Log Out")).click();
    driver.close();
  }
}
