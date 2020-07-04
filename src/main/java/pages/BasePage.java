package pages;

import org.openqa.selenium.support.PageFactory;
import utils.DriverSettings;

public class BasePage {
	public BasePage() {
		PageFactory.initElements(DriverSettings.getDriver(), this);
	}

}
