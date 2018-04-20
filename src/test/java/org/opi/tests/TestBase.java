package org.opi.tests;

import org.opi.driver.management.DriverManager;
import org.opi.driver.management.utils.DriverUtils;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import static org.opi.utils.EnvironmentUrls.MAIN_APP_URL;

public class TestBase {

    @BeforeMethod
    public void setup() {
        DriverManager.getDriver().manage().window().maximize();
        DriverUtils.navigateTo(MAIN_APP_URL);
    }

    @AfterMethod
    public void tearDown() {
        DriverManager.disposeDriver();
    }

}
