package pageObjectsTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    protected WebDriver driver;
    @BeforeMethod
    public void startUp() {
        driver = getDriver();
    }
    @AfterMethod
    public  void  tearDown () throws InterruptedException {
        Thread.sleep(1000);
        driver.quit();
    }
    private WebDriver getDriver(){
        WebDriverManager.chromedriver().setup();
        return new ChromeDriver();

    }

}
