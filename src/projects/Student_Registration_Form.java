package projects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Student_Registration_Form {
	
	public WebDriver driver;
	
	public void openurl() {
		
		driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/automation-practice-form");
		
		System.setProperty("Webdriver.chrome.driver", "D:\\Robowings_workspace\\chromedriver.exe");
		
		driver.manage().window().maximize();
		
		
		
		
		
	}

	public void registration() {
		
		driver.findElement(By.id("firstName")).sendKeys("lakshmi");
        driver.findElement(By.id("lastName")).sendKeys("surya");
        driver.findElement(By.id("userEmail")).sendKeys("lakshmisurya@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div[2]/label")).click();
        driver.findElement(By.id("userNumber")).sendKeys("9123456789");
        driver.findElement(By.id("dateOfBirthInput")).click();
        driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/button[1]")).sendKeys("december");
		
		
	}
	
	
	
	
	
	
	
	
	

	public static void main(String[] args) {
        
		Student_Registration_Form s = new Student_Registration_Form();
		s.openurl();
		s.registration();
     
	}

}
