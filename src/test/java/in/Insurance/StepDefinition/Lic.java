package in.Insurance.StepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import in.AugestTask.BaseClass.BaseClass;
import in.AugestTask.ObjectRepository.LicPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Lic {
	//public static WebDriver driver;
	public static BaseClass base = BaseClass.getInstance();
	//public static LicPage li=new LicPage();


	
	@Given("user launch the LIC Life Insurance Application {string}")
	public void user_launch_the_LIC_Life_Insurance_Application(String string) {
//		WebDriverManager.edgedriver().setup();
//	    EdgeOptions options = new EdgeOptions();
//	    options.addArguments("disable-notifications");
//	    options.addArguments("disable-popups");
//	    options.addArguments("start-maximized");
//	    base.driver = new EdgeDriver(options);
//	    base.driver.get(string);
		base.UserLaunchbrowser(string);
		base.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

	}


	@When("user enters the value in search box")
	public void user_enters_the_value_in_search_box() {
		WebElement user_search=base.driver.findElement(By.xpath("//input[@class=\"form-control\"]"));
		//user_search.sendKeys("Medical");
		//base.inputKeys(li.getuser_search(), "Medical");
		base.inputKeys(user_search, "Medical");
	}
	
	@When("user click the search button")
	public void user_click_the_search_button() {
		WebElement user_searching=base.driver.findElement(By.xpath("//span[@type=\"submit\"]"));
		//user_searching.click();
	    //base.button(li.getuser_searching());
		base.button(user_searching);
	}

	@Then("user check and view the medical policy for personal purpose")
	public void user_check_and_view_the_medical_policy_for_personal_purpose() {
		WebElement user_check=base.driver.findElement(By.xpath("//strong[contains(text(),'RFP for Empanelment of Medical ')]"));
		//user_check.click();
		base.buttons(user_check);
		 //base.buttons(li.getuser_check());

	}



}
