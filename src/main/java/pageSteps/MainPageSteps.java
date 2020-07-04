package pageSteps;

import io.cucumber.java.en.When;
import utils.DriverSettings;

public class MainPageSteps {
	@When("Перейти на сайт {string}")
	public void goToPage(String page) {
		DriverSettings.getDriver().get(page);
	}
}
