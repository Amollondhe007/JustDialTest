package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePageSteps {
	
	WebDriver driver = null;
	
	@Given("launch Just dial browser")
	public void launch_Just_dial_browser() {
		
		System.out.println("Inside Step - Just Dial browser is open");
		
		String projectPath = System.getProperty("user.dir");
		System.out.println(projectPath);
		
		System.setProperty("webdriver.gecko.driver","D:\\MyJava\\JustDialTest\\src\\test\\resources\\Drivers\\geckodriver.exe");
		
		driver = new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		
		driver.get("https://www.justdial.com/");
		
//		driver.manage().window().maximize();

	}

	@When("title of home page is Justdial")
	public void title_of_home_page_is_Justdial() throws InterruptedException {
		driver.findElement(By.xpath("//span[@id='h_login']")).isDisplayed();
	    Thread.sleep(3000);
	}

	@Then("user verify the page headers on main page")
	public void user_verify_the_page_headers_on_main_page() {
	}
	
	@When("user is on bannerLink on just dial page")
	public void user_is_on_bannerLink_on_just_dial_page() {
	
	}
	
//	@Then("click on right-header sprite till Book now option")
//	public void click_on_right-header_sprite_till_Book_now_option() {
//	}
	
	@When("user see Book Now on bannerLink")
	public void user_see_Book_Now_on_bannerLink() {
	
	}
	
	@Then("user click on Book Now and navigate back by clicking on JustDial Travel")
	public void user_click_on_Book_Now_and_go_back_by_clicking_on_JustDial_Travel() {
	}
	
	@When("user verify Free Listing link")
	public void user_verify_Free_Listing_link() {
	
	}
	
	@Then("user click on Free Listing link")
	public void user_click_on_Free_Listing_link() {
	}

//	@And("verify the Login/Sign Up and come back to Just dial home page by clicking on JD")
//	public void verify_the_Login/Sign_Up_and_come_back_to_Just_dial_home_page_by_clicking_on_JD() {
//	}

}