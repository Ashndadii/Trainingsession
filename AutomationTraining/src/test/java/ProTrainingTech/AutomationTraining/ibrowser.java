package ProTrainingTech.AutomationTraining;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ibrowser {

public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ash and Adii\\eclipse-workspace\\AutomationTraining\\chromedriver.exe");
driver= new ChromeDriver();
driver.navigate().to("http://www.amazon.com");
driver.navigate(). refresh();//how to refresh
Thread.sleep(6000);
driver.navigate().back(); //how to backward
Thread.sleep(6000);
driver.navigate().forward(); //how to forward
Thread.sleep(6000);
driver.manage().window().maximize(); //how to maximize
String Windowofhandle= driver.getWindowHandle();
System.out.print(Windowofhandle);
String currenturlpage= driver.getCurrentUrl();
System.out.print(currenturlpage);
driver.close();
}
}
