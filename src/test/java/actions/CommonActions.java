package actions;

import elements.GoogleElements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import steps.CommonSteps;

public class CommonActions {

    private final WebDriver driver;
    GoogleElements googleElements;

    public CommonActions(CommonSteps commonSteps) {
        this.driver = commonSteps.getDriver();
        googleElements = new GoogleElements(driver);
    }

    public void goToUrl(String url) {
        driver.get(url);
    }

    public void searchItem(String item) {
        googleElements.searchBox.sendKeys(item);
    }

    public void clickOnSearchButton() {
        googleElements.searchButton.submit();
    }

    public void clickOnLinkByText() {
        driver.findElements(By.xpath("//h3[@class='r']//a"));
    }
}
