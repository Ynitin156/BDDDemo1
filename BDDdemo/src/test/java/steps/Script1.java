package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Script1 
{
	WebDriver d1;
	@Given("Open the chrome browser and url of the application")
	public void open_the_chrome_browser_and_url_of_the_application() 
	{
	    System.out.println("Given start");
	    
	   
		System.setProperty("webdriver.chrome.driver","E:\\newautomation\\chromedriverr.exe");
		d1 = new ChromeDriver();
		d1.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		d1.manage().window().maximize();
		d1.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	
	@When("Enter {string} , {string} and click on the login button")
	public void enter_and_click_on_the_login_button(String username, String password) 
	{
		System.out.println("when start");
		
		 d1.findElement(By.name("username")).sendKeys(username);
		 d1.findElement(By.name("password")).sendKeys(password);
		 d1.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
	}
	
	
	@Then("Success in login and homepage open")
	public void success_in_login_and_homepage_open()
	{
		 System.out.println("then start");
		 System.out.println("Orangehrm home page open succesfully");
	}



}
