import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class Appoinment {

	@Test
	void test() throws InterruptedException {		
		WebDriver driver = null;

		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		driver = new ChromeDriver();
		
		   driver.get("https://katalon-demo-cura.herokuapp.com/");
		   
	        
	        Thread.sleep(2000);
	         driver.quit();
	         driver = null;
	}

}