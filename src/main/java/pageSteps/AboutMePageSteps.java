package pageSteps;

import io.cucumber.java.en.When;
import pages.AboutMePage;

public class AboutMePageSteps {
	AboutMePage ap = new AboutMePage();

	@When("Проверить что на странице отображается текст, содержащий слова {string}")
	public void проверить_что_на_странице_отображается_текст_содержащий_слова(String string) {
		ap.checkText(string);
	}

//	@When("Кликнуть по ссылке {string}")
//	public void кликнуть_по_ссылке(String string) {
//		// Write code here that turns the phrase above into concrete actions
//		throw new io.cucumber.java.PendingException();
//	}

}
