package sample;


import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;


public class SalesforceLogin {
	 WebDriver driver;
  
  @BeforeMethod
  public void beforeMethod() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://mainetti--lightsand.cs31.my.salesforce.com/");
		driver.manage().window().maximize();
	    driver.findElement(By.id("username")).sendKeys("crm.support@mainetti.com.lightsand");
	    driver.findElement(By.id("main")).click();
	    driver.findElement(By.id("password")).click();
	    driver.findElement(By.id("password")).sendKeys("kasetti555");
	    driver.findElement(By.id("Login")).click();
	    driver.findElement(By.xpath("//div[@class='slds-page-header cBatchMasterForSales']//button[@name='inventoryModal'][normalize-space()='Upload File']")).click();
	    //driver.findElement(By.xpath("//header/div[2]/span[1]/div[2]/ul[1]/li[8]/span[1]/button[1]/div[1]/span[1]/div[1]/span[1]")).click();
	    //driver.findElement(By.xpath("//a[contains(text(),'Log Out')]")).click();
	    Thread.sleep(5000);
	  
  }
  

  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }


  
    
  }

