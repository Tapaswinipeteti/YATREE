package TestNG_Programs;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Gmail {
	
	public WebDriver driver;
	
	
  @Test 
  public void create_account() {
	  
	  driver.findElement(By.id("firstName")).sendKeys("lakshmi");
	  driver.findElement(By.id("lastName")).sendKeys("surya");
	  driver.findElement(By.id("username")).sendKeys("lakshmisurya@gmail.com");
	  driver.findElement(By.name("Passwd")).sendKeys("Lakshmi123@");
	  driver.findElement(By.name("ConfirmPasswd")).sendKeys("Lakshmi123@");
	  driver.findElement(By.xpath("//*[@id=\"view_container\"]/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div[3]/div[3]/div/div[1]/div/div/div[1]/div/input")).click();
	  driver.findElement(By.xpath("//*[@id=\"accountDetailsNext\"]/div/button/span")).click();
	  
	    
  }	  
	  

  @Test
  public void login() {
	  
	  driver.findElement(By.id("identifierId")).sendKeys("lakshmisurya@gmail.com");
	  driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/span")).click();
	  
	  
  }

  
  @Test
  public void composemail() {
	  
  }

  
  
  
  
  
  
  
  
  @BeforeTest
  public void openurl() {
	
	  driver = new ChromeDriver();
	  driver.get("https://Gmail.com/");
	  System.setProperty("webdriver.chrome.driver", "D:\\Robowings_workspace\\chromedriver.exe");
	  driver.manage().window().maximize();
	  
  }
  

  @AfterTest
  public void afterTest() {
	  
	  
	  
  }

}
