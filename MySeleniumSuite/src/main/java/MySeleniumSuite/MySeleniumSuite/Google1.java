package MySeleniumSuite.MySeleniumSuite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google1 {

	public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("http://google.com");
			driver.get("https://mainetti--lightsand.cs31.my.salesforce.com/");
			driver.manage().window().maximize();
		    driver.findElement(By.id("username")).sendKeys("crm.support@mainetti.com.lightsand");
		    driver.findElement(By.id("main")).click();
		    driver.findElement(By.id("password")).click();
		    driver.findElement(By.id("password")).sendKeys("kasetti555");
		    driver.findElement(By.id("Login")).click();
            driver.findElement(By.xpath("//div[@class='slds-page-header cBatchMasterForSales']//button[@name='inventoryModal'][normalize-space()='Upload File']")).click();
		    /*String ActualResult ="Upload Interface";
		    String ExpectedResult ="Lightning Experience";
		    System.out.println(driver.getTitle());
		    if(ActualResult.equals(ExpectedResult)) {
		    	System.out.println("Success");
		    }
		    else {
		    	System.out.println("Failed");
		    }*/
		    
	}

}
