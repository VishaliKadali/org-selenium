package hooks;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import steps.Baseclass;

public class Hooks extends Baseclass {
	
	
	@Before
	public void preCondition() {
		
			WebDriverManager.chromedriver().setup();
			ChromeOptions options=new ChromeOptions();
			options.addArguments("remote-allow-origins=*");
			driver = new ChromeDriver(options);
			driver.get("http://leaftaps.com/opentaps");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
	}

	@After
	public void postCondition() throws InterruptedException {
		Thread.sleep(1000);
		driver.close();
	}

}
