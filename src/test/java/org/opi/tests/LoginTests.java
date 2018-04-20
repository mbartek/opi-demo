package org.opi.tests;

import org.opi.driver.management.utils.DriverUtils;
import org.opi.page.objects.HomePage;
import org.opi.page.objects.LoginPage;
import org.testng.annotations.Test;

import static org.opi.utils.EnvironmentUrls.LOGIN_URL;
import static org.testng.Assert.assertEquals;

public class LoginTests extends TestBase {

    @Test
    public void asUserTryToLoginWithBadCredentails() {
        DriverUtils.navigateTo(LOGIN_URL);

        LoginPage loginPage = new LoginPage();
        String badPassword = loginPage
                .typeIntoEmailField("bad@email")
                .typeIntoPasswordField("badpassword")
                .clickOnSignInButton()
                .getWarningText();

        assertEquals(badPassword, "Invalid email address.");
    }


}
