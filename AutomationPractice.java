package practise.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutomationPractice {

	 public static void main(String[] args) {
	
		 WebDriverManager.chromedriver().setup();
		 
		 ChromeDriver driver = new ChromeDriver();
		  
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 
		 driver.manage().window().maximize();
		 
		 driver.get(" http://automationpractice.com/index.php");
		 
		 driver.findElement(By.xpath("//a[contains(text(),'Sign in')]")).click();
		
		driver.findElement(By.className("//input[@name='email_create']")).sendKeys("harishraj001@gmail.com");
		
		driver.findElement(By.xpath("//div[@class='submit']")).click();
		 
		 driver.findElement(By.id("//button[@id='SubmitCreate']")).click();
		 
		 
		 driver.findElement(By.xpath("(//input[@type='radio'])[1]")).click();
		 
		 driver.findElement(By.className("//input[@name='customer_firstname']")).sendKeys("Harish Raj");
		 
		 driver.findElement(By.className("//input[@name='customer_lastname']")).sendKeys("B S");
		 
		 driver.findElement(By.id("//input[@id='passwd']")).sendKeys("123456");
		 
		 
		 driver.findElement(By.xpath("(//input[@class='form-control'])[1]")).sendKeys("Harish Raj");
		 
		 driver.findElement(By.xpath("(//input[@class='form-control'])[2]")).sendKeys("B S");
		 
		 driver.findElement(By.xpath("(//input[@class='form-control'])[3]")).sendKeys("CTS");
		 
		 driver.findElement(By.xpath("(//input[@class='form-control'])[4]")).sendKeys("Perambur");
		 
		 driver.findElement(By.xpath("(//input[@class='form-control'])[5]")).sendKeys("MKB nagar");
		 
		 driver.findElement(By.xpath("(//input[@class='form-control'])[6]")).sendKeys("Chen");
		 
		 driver.findElement(By.xpath("//option[@value='32']")).click();
		 
		 driver.close(); 
		 
	 }
	 
} 
