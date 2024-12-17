package pageObjectsTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageObjects.BasePage;
import pageObjects.MainPage;

import java.util.List;

public class MainToApp extends BaseTest {


    /**
     * TC_11_01 Подтвердите, что на странице по базовой ссылке в правом верхнем углу пользователь видит заголовок 99 Bottles of Beer
     *
     * Шаги:
     * 1. Открыть вебсайт на базовой странице2. Считать заголовок в правом верхнем углу
     * 3. Подтвердить, что текст заголовка соответствует ожидаемому
     * 4. Закрыть браузер
     */
    @Test
    public void readSiteName99Test(){
        String expectedResult = "99 Bottles of Beer";
        MainPage mainPage = new MainPage(driver);
        mainPage.openMainPage();
        Assert.assertEquals(mainPage.readSiteName99(), expectedResult);
    }
    /**
     * TC_11_02 Подтвердите, что на странице по базовой ссылке последний пункт меню называется Submit new Language
     *
     * Шаги:
     * 1. Открыть вебсайт на базовой странице
     * 2. Считать название последнего пункта меню
     * 3. Подтвердить, что название последнего пункта меню соответствует ожидаемому4. Закрыть браузер
     */

    @Test
    public void subNewLanguageTest(){
        String lastElement = "SUBMIT NEW LANGUAGE";
        MainPage mainPage = new MainPage(driver);
        mainPage.openMainPage();
        Assert.assertEquals(mainPage.subNewLanguage("SUBMIT NEW LANGUAGE"),lastElement);
    }


}
