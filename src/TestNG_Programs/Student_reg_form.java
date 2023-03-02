package TestNG_Programs;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Student_reg_form {
	
	public WebDriver driver;
	
  @Test
  public void registration() {
	  driver.findElement(By.id("firstName")).sendKeys("lakshmi");
	  driver.findElement(By.id("lastName")).sendKeys("surya");
	  driver.findElement(By.id("userEmail")).sendKeys("lakshmisurya@gmail.com");
	  driver.findElement(By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div[2]/label")).click();
	  driver.findElement(By.id("userNumber")).sendKeys("9123456789");
	  driver.findElement(By.id("dateOfBirthInput")).click();
	  driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/select")).sendKeys("december");
	  driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[2]/select")).sendKeys("1990");
	  driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[2]/div[5]/div[3]")).sendKeys("25");
	  driver.findElement(By.xpath("//*[@id=\"subjectsinput\"]/div/div[1]")).click();
	  driver.findElement(By.xpath("//*[@id=\"subjectsinput\"]/div/div[1]")).sendKeys("maths");
	  driver.findElement(By.xpath("//*[@id=\"subjectsContainer\"]/div/div[1]")).sendKeys("key=enter");
	  driver.findElement(By.xpath("//*[@id=\"hobbiesWrapper\"]/div[2]/div[2]/label")).click();
	  driver.findElement(By.id("uploadPicture")).sendKeys("C:\\Users\\Laxmi Surya\\Desktop\\WhatsApp Images");
	  driver.findElement(By.id("currentAddress")).sendKeys("flat no.1,ground floor,shree shivasai nilayam");
	  driver.findElement(By.xpath("//*[@id=\"state\"]/div/div[1]")).sendKeys("ncr");
	  driver.findElement(By.xpath("//*[@id=\"city\"]/div/div[1]")).sendKeys("lucknow");
	  driver.findElement(By.id("submit")).click();
	  
	  
  }
  
  @BeforeTest
  public void openurl() {
	  
	  driver = new ChromeDriver();
	  driver.get("https://demoqa.com/automation-practice-form");
	  System.setProperty("webdriver.chrome.driver", "D:\\Robowings_workspace\\chromedriver.exe");
	  driver.manage().window().maximize();
  }

  @AfterTest
  
  
  public void afterTest() {
  }

}
