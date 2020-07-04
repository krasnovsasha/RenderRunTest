package pages;

import org.junit.Assert;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import utils.DriverSettings;

import java.time.Duration;

public class BasePage {
	private static FluentWait<WebDriver> fluentWait;
	public BasePage() {
		PageFactory.initElements(DriverSettings.getDriver(), this);
	}
	protected String getTextElement(WebElement element){
		waitUntilElementToBeVisible(element);
		return element.getText();
	}
	protected static void waitUntilElementToBeVisible(WebElement element) {
		fluentWait = new FluentWait<>(DriverSettings.getDriver())
				.withTimeout(Duration.ofMillis(25000))
				.pollingEvery(Duration.ofMillis(500))
				.ignoring(NoSuchElementException.class);
		fluentWait.until(ExpectedConditions.visibilityOf(element));
	}
	protected void assertText(WebElement element,String text){
		String textInElement = getTextElement(element);
		Assert.assertTrue("Элемент " + element.getTagName() + " не содержит текст " + text,textInElement.contains(text));
	}
}
