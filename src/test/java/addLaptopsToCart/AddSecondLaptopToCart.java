package addLaptopsToCart;

import Base.BaseSteps;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LaptopsPage;
import pages.SecondProductPage;

public class AddSecondLaptopToCart extends BaseSteps {
    @Test
    public void SecondLaptopInCart() throws InterruptedException {
        LaptopsPage laptopsPage = homePage.clickOnLaptopsButton();
        Thread.sleep(3000);
        SecondProductPage secondProductPage = laptopsPage.clickOnSecondProduct();
        Thread.sleep(3000);
        secondProductPage.clickOnAddButton();
        Thread.sleep(3000);
        String actualresult = secondProductPage.ProductAddedMessage();
        String expectedresult = "Product added";
        Assert.assertTrue(actualresult.contains(expectedresult));
        secondProductPage.AcceptAlertMessage();
    }
}
