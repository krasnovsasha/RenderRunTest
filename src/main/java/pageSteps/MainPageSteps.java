package pageSteps;

import io.cucumber.java.en.When;
import utils.DriverSettings;

public class MainPageSteps {
	@When("Перейти на сайт {string}")
	public void goToPage(String page) {
		DriverSettings.getDriver().get(page);
	}
	@When("Проверить что в футере отображается текст {string}")
	public void проверить_что_в_футере_отображается_текст(String string) {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@When("Кликнуть по ссылке {string}")
	public void кликнуть_по_ссылке(String string) {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}


}
