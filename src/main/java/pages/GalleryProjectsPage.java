package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import utils.DriverSettings;

import java.util.List;
import java.util.Random;

public class GalleryProjectsPage extends BasePage {
    @FindBy(xpath = "//div[@class='wrapperProjects']/a/img")
    protected List<WebElement> projectsList;

    public void checkProjectsCount(String count) {
        int projectsCount = Integer.parseInt(count);
        DriverSettings.getWait().until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@class='wrapperProjects']/a/img")));
        Assert.assertEquals("Количество проектов на странице отображается неверно ",projectsCount, projectsList.size());
    }
    public void clickToRandomImg(){
        DriverSettings.getWait().until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@class='wrapperProjects']/a/img")));
        int projectsCount = projectsList.size();
        Random random = new Random();
        click(projectsList.get(random.nextInt(projectsCount)));
    }
}
