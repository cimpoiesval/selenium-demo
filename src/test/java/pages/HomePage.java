package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;


public class HomePage extends AlzaPage {

    @FindBy(xpath = "//div[@class='bx']/a[contains(text(),'Smart')]")
    private WebElement smartMenuPath;

    @FindBy(xpath = "//a[@class='head'][contains(text(),'Wearables')]")
    private WebElement wearablesPath;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public CategoryPage navigateToWearablesCategory(){
        new Actions(driver).moveToElement(this.smartMenuPath).perform();
        this.wearablesPath.click();
        return new CategoryPage(driver);
    }
}
