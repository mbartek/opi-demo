//package org.opi.tests;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.Test;
//
//import static org.testng.Assert.assertTrue;
//
//public class FluentWaitTest {
//
//    private WebDriver webDriver;
//
//    @BeforeMethod
//    public void setup(){
//        System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
//        webDriver = new ChromeDriver();
//        webDriver.manage().window().maximize();
//        webDriver.navigate().to("file:///C:/Users/mateu/Dropbox/szkolenie-03.2018-OPI/szkolenie/Selenium/SeleniumIntro/selenium-basic/exercies/Fluent_Wait_Page.html");
//    }
//
//    @AfterMethod
//    public void tearDown(){
//        webDriver.quit();
//    }
//
//    @Test
//    public void fluentWaitTest(){
//        WebElement addTextButton = webDriver.findElement(By.id("addText"));
//        addTextButton.click();
//
//        WebDriverWait webDriverWait = new WebDriverWait(webDriver, 10);
//        webDriverWait.withMessage("Checking if button is red if not should fail");
//        WebElement dynamicElement = webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.id("dynamicElement")));
//
//        assertTrue(dynamicElement.isDisplayed());
//    }
//    @Test
//    public void fluentWaitTest2(){
//        WebElement dynamicColour = webDriver.findElement(By.id("dynamicColour"));
//        dynamicColour.click();
//
//        WebDriverWait webDriverWait = new WebDriverWait(webDriver, 10);
//        webDriverWait.until(ExpectedConditions.attributeToBe(dynamicColour, "style", "color: red;"));
//        dynamicColour = webDriver.findElement(By.id("dynamicColour"));
//
//        assertTrue(dynamicColour.getAttribute("style").contains("red"), "Button colour should be black but was different");
//
//    }
//}
