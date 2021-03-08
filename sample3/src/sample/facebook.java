package sample;


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class facebook {

		public static void main(String[] args) throws InterruptedException {
				System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				driver.get("http://google.com");
				driver.get("https://www.facebook.com/");
				driver.manage().window().maximize();
			    driver.findElement(By.id("email")).sendKeys("champ.gjarun@gmail.com");
			    //driver.findElement(By.id("main")).click();
			    driver.findElement(By.id("pass")).click();
			    driver.findElement(By.id("pass")).sendKeys("Jamunarani@1995");
			    driver.findElement(By.name("login")).click();
			   // String ActualResult ="Upload Interface";
			    //String ExpectedResult ="Lightning Experience";
			    Thread.sleep(6000);
			    System.out.println(driver.getTitle());
		}
}
