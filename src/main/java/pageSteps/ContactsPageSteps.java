package pageSteps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.When;
import pages.ContactsPage;

public class ContactsPageSteps {

	ContactsPage cp = new ContactsPage();

	@When("Заполнить поля:")
	public void заполнить_поля(DataTable dataTable) {
		cp.fillFields(dataTable.asMap(String.class,String.class));
	}

	@When("Нажать на кнопку {string}")
	public void нажать_на_кнопку(String string) {
		cp.submit();
	}

	@When("Проверить, что после отправки отображается текст {string}")
	public void проверить_что_после_отправки_отображается_текст(String string) {
		cp.checkText(string);
	}
}
