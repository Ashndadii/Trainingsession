package ProTrainingTech.AutomationTraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dropdown {
	public static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ash and Adii\\eclipse-workspace\\AutomationTraining\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.navigate().to("http://www.facebook.com");
		
		WebElement createanaccount=driver.findElement(By.linkText("create new account"));
	}

}
