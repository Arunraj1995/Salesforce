package TestNG;



import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class HomepageTest {
	WebDriver driver;
	
  @BeforeMethod
  public void SetUp() {
	  System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://freecrm.com/");
		
		
  }
	  
  @Test(priority=1)
  public void verifyPageTitleTest() {
	  String title = driver.getTitle();
	  System.out.println("the page title is: "+title);
	  Assert.assertEquals(title, "#1 Free CRM customer relationship management software cloudXXXX");
  }
  @Test(priority=2)
  public void verifyImgaeLogoTest() {
	  boolean flag = driver.findElement(By.xpath("//font[contains(text(),'crm')]")).isDisplayed();
	  Assert.assertTrue(flag);
  }

  @AfterMethod
  public void afterMethod() {
	  //driver.close();
  }

}
