package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class AlzaPage {
    protected WebDriver driver;

    public AlzaPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    public int priceToInt(String productPrice){
        String price = productPrice
                .replaceAll("[\\,\\-\\s]","");
        return Integer.parseInt(price);
    }
}
