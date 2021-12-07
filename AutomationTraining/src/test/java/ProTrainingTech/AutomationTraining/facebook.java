package ProTrainingTech.AutomationTraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook {
	public static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ash and Adii\\eclipse-workspace\\AutomationTraining\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.navigate().to("http://www.facebook.com");
		driver.manage().window().maximize();
		
		//automate sign-in function for facebook
		WebElement email= driver.findElement(By.id("email"));
		email.click();
		 WebElement fieldof=driver.findElement(By.name("email"));
		 fieldof.sendKeys("youremail@gmail.com");
		
		 WebElement password= driver.findElement(By.id("pass"));
		 password.click();
		 WebElement pass=driver.findElement(By.name("pass"));
		pass.sendKeys("password");
		
		WebElement loginbutton = driver.findElement(By.id("loginbutton"));
		loginbutton.click();
		
		 //forget password function for facebook    Forgot password?
		
		
		WebElement forget = driver.findElement(By.id("Forgot password"));
		forget.click();
		 
		
				 
	}
}
