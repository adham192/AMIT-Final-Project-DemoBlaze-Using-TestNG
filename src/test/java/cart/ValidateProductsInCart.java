package cart;

import Base.BaseSteps;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CartPage;


public class ValidateProductsInCart extends BaseSteps {
    @Test
    public void BothProductsInCart(){
        CartPage cartPage = homePage.clickOnCartButton();
        Assert.assertTrue(cartPage.FirstProductIsDisplayed());
        Assert.assertTrue(cartPage.SecondProductIsDisplayed());
        Assert.assertTrue(cartPage.FirstProductPriceIsDisplayed());
        Assert.assertTrue(cartPage.SecondProductPriceIsDisplayed());
        cartPage.CheckThatTotalPriceIsCorrect();
    }
}
