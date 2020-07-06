package pageSteps;

import io.cucumber.java.en.When;
import pages.FooterPage;
import pages.HeaderPage;
import pages.MainPage;
import utils.DriverSettings;

public class MainPageSteps {
	MainPage mp = new MainPage();
	FooterPage fp = new FooterPage();
	HeaderPage hp = new HeaderPage();
	@When("Перейти на сайт {string}")
	public void goToPage(String page) {
		DriverSettings.getDriver().get(page);
	}
	@When("Проверить что в футере отображается текст {string}")
	public void проверить_что_в_футере_отображается_текст(String string) {
		fp.checkTextInFooter(string);
	}

	@When("Кликнуть по ссылке {string}")
	public void кликнуть_по_ссылке(String string) {
		hp.clickToMenuLink(string);
	}


}
