package in.AugestTask.ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import in.AugestTask.BaseClass.BaseClass;

public class LicPage {
	
	BaseClass base=BaseClass.getInstance();
	
 public LicPage() {
	 
		PageFactory.initElements(base.driver, this);
 }
 @FindBy(xpath = "//input[@class=\"form-control\"]")
 private WebElement user_search;
 
 
 @FindBy(xpath = "//span[@type=\"submit\"]")
 private WebElement user_searching;

 
 
 @FindBy(xpath = "//strong[contains(text(),'RFP for Empanelment of Medical ')]")
 private WebElement user_check;

 public WebElement getuser_search() {
    return user_search;
}

 public WebElement getuser_searching() {
	return user_searching;
	 
 }
 
 public WebElement getuser_check() {
    return user_check;
 }
}
