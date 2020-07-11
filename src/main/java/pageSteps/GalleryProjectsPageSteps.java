package pageSteps;

import io.cucumber.java.en.When;
import pages.GalleryProjectsPage;

public class GalleryProjectsPageSteps {
	GalleryProjectsPage gp = new GalleryProjectsPage();

	@When("Проверить, что на странице отображается {string} изображений")
	public void проверить_что_на_странице_отображается_изображений(String string) {
		gp.checkProjectsCount(string);
	}

	@When("Кликнуть на любое изображение")
	public void кликнуть_на_любое_изображение() {
		gp.clickToRandomImg();
	}
}
