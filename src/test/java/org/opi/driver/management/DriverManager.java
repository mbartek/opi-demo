package org.opi.driver.management;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverManager {

    public static final String USERNAME = "mateuszciolek1";
    public static final String AUTOMATE_KEY = "q8Xds9WMgD1njKDTMsUq";
    public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";

    private static ThreadLocal<WebDriver> threadLocal = new ThreadLocal<WebDriver>();

    private DriverManager() {
    }

    public synchronized static WebDriver getDriver() {

        if (threadLocal.get() == null) {

            WebDriver webDriver = null;
//            DesiredCapabilities caps = new DesiredCapabilities();
//            caps.setCapability("browser", "Chrome");
//            caps.setCapability("browser_version", "49.0");
//            caps.setCapability("os", "Windows");
//            caps.setCapability("os_version", "XP");
//            caps.setCapability("resolution", "1920x1080");
//
//            try {
//                webDriver = new RemoteWebDriver(new URL(URL), caps);
//            } catch (MalformedURLException e) {
//                e.printStackTrace();
//            }

            System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
            webDriver = new ChromeDriver();

            threadLocal.set(webDriver);
        }
        return threadLocal.get();
    }

    public synchronized static void disposeDriver() {
        threadLocal.get().quit();
        threadLocal.remove();
    }
}
