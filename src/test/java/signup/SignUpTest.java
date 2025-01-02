package signup;

import Base.BaseSteps;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.SignUpPage;

public class SignUpTest extends BaseSteps {
    @Test
    public void TestSignUpPage() throws InterruptedException {
        SignUpPage signUpPage = homePage.clickOnSignUpButton();
        Thread.sleep(3000);
        signUpPage.FillUsernameBox();
        signUpPage.FillPasswordBox();
        signUpPage.clickOnRegisterButton();
        Thread.sleep(3000);
        String actualresult = signUpPage.SignUpSuccessful();
        String expectedresult = "Sign up successful.";
        Assert.assertTrue(actualresult.contains(expectedresult));
        signUpPage.AcceptSignUpSuccesfulMessage();
    }
}
