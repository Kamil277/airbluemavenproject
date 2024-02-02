package airbluemavenp;

import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class airbluemaven {
	
	@Test
	static void Browserlaunch()
	{
	String baseUrl = "https://www.airblue.com/";
    String driverPath = "geckodriver.exe";
    WebDriver driver = new FirefoxDriver();
    System.out.println("Open the browawe");
    System.out.println("launching Firefox browser");
    System.setProperty("webdriver.gecko.driver", driverPath);
    driver.get(baseUrl);
    String actualTitle = driver.getTitle();
    System.out.println(actualTitle);
    driver.manage().window().maximize();
	}
	
	
	@After
	static void login() throws InterruptedException 
	{
	String baseUrl = "https://www.airblue.com/";
    String driverPath = "geckodriver.exe";
    WebDriver driver = new FirefoxDriver();
    System.out.println("launching Firefox browser");
    System.setProperty("webdriver.gecko.driver", driverPath);
    driver.get(baseUrl);
    String actualTitle = driver.getTitle();
    System.out.println(actualTitle);
    driver.manage().window().maximize();
    
    driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/div[1]/form/div[3]/span/a/u")).click();
    Thread.sleep(2000);
       
    driver.findElement(By.id("memberId")).sendKeys("abcd@gmail.com");	
    
    Thread.sleep(2000);
    
       driver.findElement(By.id("memberPwd")).sendKeys("abcdefghlkjl");							
    driver.findElement(By.xpath("/html/body/div/div/div[3]/div/div/div[1]/div/div/div/form/div[3]/button")).click();
    
    
}
	
	
	

}
