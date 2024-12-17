package pageObjectsTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageObjects.BrowseLanguage;
import pageObjects.MainPage;

public class BrowseLanguageToApp extends BaseTest {

    /**
     * TC_11_04 Подтвердите, что на странице по ссылке http://www.99-bottles-of-beer.net/abc.html , первый пункт подменю называется 0-9
     * Шаги:
     * 1. Открыть вебсайт на странице
     * 2. Считать название первого подзаголовка
     * 3. Подтвердить, что название подменю соответствует ожидаемому
     * 4. Закрыть браузер
     */
    @Test
    public void ConfirmFirstSubTitle0_9() throws InterruptedException {
        String expectedResult = "0-9";
        MainPage mainPage = new MainPage(driver);
        mainPage.openMainPage();
        BrowseLanguage browseLanguage = mainPage.navigateToBrowseLanguage();
        Assert.assertTrue(browseLanguage.verifySubMenuItems());
//        Assert.assertEquals(browseLanguage.verifySubMenuItems(),expectedResult);

    }
}
