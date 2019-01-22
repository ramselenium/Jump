import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegistrationFreeCRM {

	public static void main(String[] args) throws InterruptedException {

		
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		ChromeDriver driver = new ChromeDriver();
		
		
		//driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.get("https://www.freecrm.com/index.html");
	
		Thread.sleep(15000);
		//WebDriverWait wait = new WebDriverWait(driver,10);
		//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[2]/ul[1]/li[2]/a[1]/font[1]")));

		WebElement SignUp = driver.findElementByCssSelector("#navbar-collapse > ul > li:nth-child(2) > a > font");
		SignUp.click();
	
		driver.close();
	}

}
