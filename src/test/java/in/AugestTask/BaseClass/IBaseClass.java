package in.AugestTask.BaseClass;


import org.openqa.selenium.WebElement;

public interface IBaseClass {
	
	void UserLaunchbrowser(String string);
	void inputKeys (WebElement ele, String value);
	void button (WebElement ele);
	void buttons (WebElement ele);
}
