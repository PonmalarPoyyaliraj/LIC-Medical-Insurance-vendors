package in.AugestTask.BaseClass;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass implements IBaseClass{
	
public static BaseClass base=null;
	
	public static BaseClass getInstance() {
		if(base==null) {
			
			base=new BaseClass();
		}
		return base;
	}
	
	private BaseClass() {}
	
	public static WebDriver driver;
	
	public void UserLaunchbrowser(String string) {
		WebDriverManager.edgedriver().setup();
	    EdgeOptions options = new EdgeOptions();
	    options.addArguments("disable-notifications");
	    options.addArguments("disable-popups");
	    options.addArguments("start-maximized");
	    driver = new EdgeDriver(options);
	    driver.get(string);
	}
	
	public void inputKeys(WebElement ele, String value) {
          ele.sendKeys(value);		
	}

	public void button(WebElement ele) {
          ele.click();		
	}
	public void buttons(WebElement ele) {
         ele.click();	
	}
	
	
	}

