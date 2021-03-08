package sample;

//Generated by Selenium IDE
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
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class UsecaseTest {
private WebDriver driver;
private Map<String, Object> vars;
JavascriptExecutor js;
@Before
public void setUp() {
 driver = new ChromeDriver();
 js = (JavascriptExecutor) driver;
 vars = new HashMap<String, Object>();
}
@After
public void tearDown() {
 driver.quit();
}
@Test
public void usecase() {
 driver.get("https://mainetti--lightsand.my.salesforce.com/");
 driver.manage().window().setSize(new Dimension(1366, 728));
 driver.findElement(By.id("username")).click();
 driver.findElement(By.cssSelector("b:nth-child(25)")).click();
 driver.findElement(By.name("inventoryModal")).click();
 driver.findElement(By.id("667:0")).click();
 {
   WebElement dropdown = driver.findElement(By.id("667:0"));
   dropdown.findElement(By.xpath("//option[. = 'Hong Kong Packaging']")).click();
 }
 driver.findElement(By.id("667:0")).click();
 driver.findElement(By.id("699:0")).click();
 {
   WebElement dropdown = driver.findElement(By.id("699:0"));
   dropdown.findElement(By.xpath("//option[. = '2020']")).click();
 }
 driver.findElement(By.id("699:0")).click();
 driver.findElement(By.cssSelector("input:nth-child(7)")).click();
 driver.findElement(By.cssSelector("input:nth-child(7)")).sendKeys("C:\\fakepath\\Latest-Hongkong.csv");
 driver.findElement(By.cssSelector(".slds-button:nth-child(8)")).click();
}
}

