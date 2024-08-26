package elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleElements {

    WebDriver driver;

    @FindBy(id = "APjFqb")
    public WebElement searchBox;
    @FindBy(name = "btnK")
    public WebElement searchButton;

    public GoogleElements(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
