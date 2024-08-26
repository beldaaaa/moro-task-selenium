package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import steps.CommonSteps;

public class MoroActions {

    private final WebDriver driver;

    public MoroActions(CommonSteps commonSteps) {
        this.driver = commonSteps.getDriver();
    }

    public void clickOnLinkByText(String linkText) {
        driver.findElement(By.linkText(linkText)).click();
    }
}
