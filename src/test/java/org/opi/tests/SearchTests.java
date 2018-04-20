package org.opi.tests;

import org.opi.page.objects.HomePage;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;


public class SearchTests extends TestBase {

    @DataProvider(name = "searchTestDataProvider")
    public Object[][] articlesToSearch() {
        Object[][] testDataArray = {{"Faded Short Sleeve T-shirts"}, {"Blouse"}, {"Dress"}};
        return testDataArray;
    }

    @Test(dataProvider = "searchTestDataProvider")
    public void asUserSearchForArticleName(String articleName) {
        HomePage homePage = new HomePage();
        homePage
                .typeIntoSearchQueryTextField(articleName)
                .clickOnSearchButton()
                .assertThatProductWithNameIsDisplayed(articleName);
    }

}
