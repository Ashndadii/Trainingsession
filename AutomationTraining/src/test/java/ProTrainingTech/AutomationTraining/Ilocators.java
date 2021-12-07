package ProTrainingTech.AutomationTraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ilocators {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ash and Adii\\eclipse-workspace\\AutomationTraining\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.navigate().to("http://www.amazon.com");
		driver.manage().window().maximize();
		
		Thread.sleep(6000);
		//1. id
		WebElement searchbutton= driver.findElement(By.id("nav-search-submit-button"));
		 searchbutton.click();
		 
		//2.link text
		 Thread.sleep(6000);
		 WebElement Bestsellers= driver.findElement(By.linkText("Best Sellers"));
		 Bestsellers.click();
			
		 //3.partial text link
		 Thread.sleep(6000);
		 WebElement dealof=driver.findElement(By.partialLinkText("Cyber"));
		 dealof.click();
		 
		 //4.class name
		 
		 
		 
		 
		 //xpath
		 
		 //absolute xpath
		 
		 WebElement phonenumberfield=driver.findElement(By.xpath(//input[@placeholder='Email or phonenumber'}));
				 
	}

}
