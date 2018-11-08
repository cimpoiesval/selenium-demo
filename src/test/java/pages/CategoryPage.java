package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CategoryPage extends AlzaPage {

    @FindBy(xpath = "//div[@class='catlist top']//span[contains(@class,'text')][contains(text(),'Chytré hodinky')]")
    private WebElement smartWatchPath;

    @FindBy(xpath = "//div[@class='box browsingitem canBuy inStockAvailability action first firstRow']")
    private WebElement firstProduct;

    @FindBy(xpath = "//div[@class='box browsingitem canBuy inStockAvailability action first firstRow']/div[1]/div/a")
    private WebElement firstProductName;

    @FindBy(xpath = "//div[@class='box browsingitem canBuy inStockAvailability action first firstRow']/div[2]/div/div/span[1]")
    private WebElement firstProductPrice;

    public CategoryPage(WebDriver driver) {
        super(driver);
    }

    public CategoryPage navigateToSmartWatchCategory(){
        this.smartWatchPath.click();
        return new CategoryPage(driver);
    }

    public String getFirstProductName(){
        return this.firstProductName.getText();
    }

    public int getFirstProductPrice(){
        return priceToInt(this.firstProductPrice.getText());
    }

    public ProductPage openFirstProductPage(){
        this.firstProductName.click();
        return new ProductPage(driver);
    }
}
