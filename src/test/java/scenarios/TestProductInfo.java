package scenarios;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CategoryPage;
import pages.HomePage;
import pages.ProductPage;

public class TestProductInfo extends BaseTest{
    private HomePage homePage;
    private CategoryPage categoryPage;
    private CategoryPage subCategoryPage;
    private ProductPage productPage;

    @Test
    public void testProductInfo(){
        homePage = new HomePage(driver);
        categoryPage = homePage.navigateToWearablesCategory();

        subCategoryPage = categoryPage.navigateToSmartWatchCategory();
        String name1 = subCategoryPage.getFirstProductName();
        int price1 = subCategoryPage.getFirstProductPrice();

        productPage = subCategoryPage.openFirstProductPage();
        String name2 = productPage.getProductName();
        int price2 = productPage.getProductPrice();

        //verify name and price from product page are same as on category page
        Assert.assertEquals(name1, name2, "Names are not equal");
        Assert.assertEquals(price1,price2, "Prices are not equal");
    }
}
