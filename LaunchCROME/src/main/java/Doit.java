
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

public class Doit 
{

	
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.freecrm.com/index.html");
		
		WebElement Username = driver.findElementByName("username");
		Username.sendKeys("ram2get");
		
		WebElement Password = driver.findElementByName("password");
				Password.sendKeys("Chotti@2016");
			
				Thread.sleep(3000);
	
				WebElement Loginbutton = driver.findElementByXPath("//input[@value='Login']");
				Loginbutton.click();
				
		
		//driver.close();

	}

}
