package addLaptopsToCart;

import Base.BaseSteps;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;

public class AddFirstLaptopToCart extends BaseSteps {
    @Test
    public void LaptopInCart() throws InterruptedException {
        LaptopsPage laptopsPage = homePage.clickOnLaptopsButton();
        //Thread.sleep(3000);
        FirstProductPage firstProductPage = laptopsPage.clickOnFirstProduct();
        //Thread.sleep(3000);
        firstProductPage.clickOnAddtoCartButton();
        //Thread.sleep(3000);
        String actualresult = firstProductPage.ProductAddedMessage();
        String expectedresult = "Product added";
        Assert.assertTrue(actualresult.contains(expectedresult));
        firstProductPage.AcceptAlertMessage();


        CartPage cartPage = firstProductPage.clickOnCartButton();
        //Thread.sleep(5000);
        Assert.assertTrue(cartPage.FirstProductIsDisplayed());
        Assert.assertTrue(cartPage.FirstProductPriceIsDisplayed());


        HomePage homePage1 = cartPage.ReturntoHomePage();
        //Thread.sleep(3000);
        LaptopsPage laptopsPage1 = homePage1.clickOnLaptopsButton();
        //Thread.sleep(3000);
        SecondProductPage secondProductPage = laptopsPage1.clickOnSecondProduct();
        //Thread.sleep(3000);
        secondProductPage.clickOnAddButton();
        //Thread.sleep(3000);
        String actualresult1 = secondProductPage.ProductAddedMessage();
        String expectedresult1 = "Product added";
        Assert.assertTrue(actualresult1.contains(expectedresult1));
        secondProductPage.AcceptAlertMessage();


        CartPage cartPage1 = secondProductPage.ClickonCartButton();
        //Thread.sleep(5000);
        Assert.assertTrue(cartPage1.SecondProductIsDisplayed());
        Assert.assertTrue(cartPage1.SecondProductPriceIsDisplayed());

        Assert.assertTrue(cartPage1.CheckThatTotalPriceIsCorrect());


        PlaceOrderPage placeOrderPage = cartPage1.clickOnPlaceOrderButton();
        //Thread.sleep(5000);
        placeOrderPage.insertName("Adham");
        placeOrderPage.insertCountry("Egypt");
        placeOrderPage.insertCity("Cairo");
        placeOrderPage.insertCreditCard("124353");
        placeOrderPage.insertMonth("12");
        placeOrderPage.insertYear("2024");
        PurchaseConfirmationPage purchaseConfirmationPage = placeOrderPage.clickOnPurchaseButton();
        //Thread.sleep(3000);
        String actualresult2 = purchaseConfirmationPage.GetValidationMessage();
        String expectedresult2 = "Thank you for your purchase!";
        Assert.assertTrue(actualresult2.contains(expectedresult2));
    }
}