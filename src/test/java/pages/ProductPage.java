package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends AlzaPage {

    @FindBy(xpath = "//span[@class='bigPrice price_withVat']")
    private WebElement productPricePath;

    @FindBy(xpath = "//h1[@itemprop='name']")
    private WebElement productNamePath;

    public ProductPage(WebDriver driver) {
        super(driver);
    }

    public String getProductName(){
        return this.productNamePath.getText();
    }

    public int getProductPrice(){
        return priceToInt(this.productPricePath.getText());
    }
}
