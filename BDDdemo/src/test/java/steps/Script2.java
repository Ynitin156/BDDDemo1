package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Script2 
{
	WebDriver d1;

	@Given("open the chrome browser and url of the application")
	public void open_the_chrome_browser_and_url_of_the_application() 
	{
		
		System.setProperty("webdriver.chrome.driver","E:\\newautomation\\chromedriverr.exe");
		d1 = new ChromeDriver();
		d1.get("https://www.instagram.com/");
		d1.manage().window().maximize();
		d1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@When("Enter username ,password and click on the login button")
	public void enter_username_password_and_click_on_the_login_button() 
	{
        d1.findElement(By.name("username")).sendKeys("beingnitinyadav");
        d1.findElement(By.name("password")).sendKeys("Quantum@24");
        d1.findElement(By.xpath("/html/body/div[2]/div/div/div/div[1]/div/div/div/div[1]/section/main/article/div[2]/div[1]/div[2]/form/div/div[3]")).click();

	}

	@Then("Succesfully login nd homepage is open")
	public void succesfully_login_nd_homepage_is_open() 
	{
       System.out.println("Succesfully login nd homepage is open");

	}
}
