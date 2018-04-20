package org.opi.page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    @FindBy(id = "search_query_top")
    private WebElement searchQueryTextField;

    @FindBy(name = "submit_search")
    private WebElement searchButton;

    @FindBy(className = "login")
    private WebElement signInLink;

    public HomePage typeIntoSearchQueryTextField(String searchQuery) {
        searchQueryTextField.sendKeys(searchQuery);
        return this;
    }

    public ResultsPage clickOnSearchButton() {
        searchButton.click();
        return new ResultsPage();
    }

    public LoginPage clickOnSignIn(){
        signInLink.click();
        return new LoginPage();
    }
}
