package steps;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends Baseclass {

	/*
	 * @Given("Launch the browser") public void launchBrowser() {
	 * WebDriverManager.chromedriver().setup(); ChromeOptions options=new
	 * ChromeOptions(); options.addArguments("remote-allow-origins=*"); driver=new
	 * ChromeDriver(options); }
	 * 
	 * 
	 * @And("Load the url and maximize the application") public void loadURL() {
	 * driver.get("http://www.leaftaps.com/opentaps");
	 * driver.manage().window().maximize(); }
	 */

	@When("Enter the username as {string}")
	public void enterUsername(String username) {
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(username);
	}

	@And("Enter the password as {string}")
	public void enterPassword(String password) {
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
	}

	@And("Click Login")
	public void clickLogin() {
		driver.findElement(By.className("decorativeSubmit")).click();
	}

	@Then("Verify Homepage is displayed")
	public void verifyHomepage() {

		String text = driver.findElement(By.tagName("title")).getText();

		
		  if(text.contains("TestLeaf Automation Platform")) {
		  System.out.println("Login is successful"); } else {
		  System.out.println("Login is not successful"); }
		 

		// assertEquals(text,"Leaftaps - TestLeaf Automation Platform");

	}

	@But("Verify Error message is displayed")
	public void invalidLogin() {
		String text = driver.findElement(By.xpath("//p[text()='The Following Errors Occurred:']")).getText();
		assertEquals(text, "The Following Errors Occurred:", "Login unsuccessful");
	}

}
