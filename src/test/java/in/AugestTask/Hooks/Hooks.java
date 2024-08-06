package in.AugestTask.Hooks;


import in.AugestTask.BaseClass.BaseClass;
import io.cucumber.java.Before;

public class Hooks {
	BaseClass base=BaseClass.getInstance();
	@Before
	public void user_launch_the_LIC_Life_Insurance_Application(String string) {

		base.UserLaunchbrowser(string);

	}
}
