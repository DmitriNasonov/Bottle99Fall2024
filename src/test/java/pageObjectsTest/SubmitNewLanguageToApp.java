package pageObjectsTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.MainPage;
import pageObjects.StartPage;
import pageObjects.SubmitNewLanguage;

public class SubmitNewLanguageToApp extends BaseTest {

    /**
     * C_11_03 Подтвердите, что на странице по базовой ссылке последний пункт меню имеет подзаголовок Submit new Language
     * Шаги:
     * 1. Открыть вебсайт на базовой странице
     * 2. Нажать на пункт меню Submit new Language
     * 3. Считать название подзаголовка последнего пункта меню
     * 4. Подтвердить, что название подзаголовка последнего пункта меню соответствует ожидаемому
     * 5. Закрыть браузер
     */
    @Test
    public void verifySubmitNewLanguage() {
        String expectedResult = "Submit New Language";
        MainPage mainPage = new MainPage(driver);
        mainPage.openMainPage();
        SubmitNewLanguage submitNewLanguage = mainPage.navigateToSubmitNewLanguage();
//        Assert.assertTrue(submitNewLanguage.verifySubmitNewLanguage());
//        Assert.assertEquals(submitNewLanguage.verifySubmitNewLanguage1(),expectedResult);
        Assert.assertTrue(submitNewLanguage.subMenuName().equals("Submit New Language"));
//        Assert.assertEquals(submitNewLanguage.subMenuName(), "Submit New Language");
    }


/**
 * TC_11_11 Подтвердите, что если на странице по ссылке http://www.99-bottles-of-beer.net/submitnewlanguage.html ,  пользователь нажмет кнопку Submit Language,  не заполнив информацию в обязательных полях, будет показана ошибка
 * Error: Precondition failed - Incomplete Input.
 * Шаги:
 * 1. Открыть вебсайт на странице
 * 2. Нажать на кнопку Submit Language
 * 3. Подтвердить, что на странице показана ошибка
 * 4. Подтвердить, что текст ошибки соответствует ожидаемому
 * 5. Закрыть браузер
 */
    @Test
    public void verifyErrorMessage(){
        MainPage mainPage = new MainPage(driver);
        mainPage.openMainPage();
        SubmitNewLanguage submitNewLanguage = mainPage.navigateToSubmitNewLanguage();
//        Assert.assertEquals(submitNewLanguage.verifyErrorMessage(), true);
        Assert.assertTrue(submitNewLanguage.verifyErrorMessage());

    }
    /**
     * TC_11_13 Подтвердите, что на странице по ссылке
     * http://www.99-bottles-of-beer.net/submitnewlanguage.html
     * в первом пункте списка пользователь видит текст
     * * IMPORTANT: Take your time! The more carefully you fill out this form (especially
     * the language name and description), the easier it will be for us and the faster your
     * language will show up on this page. We don't have the time to mess around with fixing
     * your descriptions etc. Thanks for your understanding.
     * Шаги:
     * 1. Открыть вебсайт на странице
     * 2. Считать текст
     * 3. Подтвердить, что текст соответствует ожидаемому
     * 4. Закрыть браузер
     */
    @Test
    public void verifyImportantMessage(){

        MainPage mainPage = new MainPage(driver);
        mainPage.openMainPage();
        SubmitNewLanguage submitNewLanguage = mainPage.navigateToSubmitNewLanguage();

//        Assert.assertTrue(submitNewLanguage.getImportantMessage());
//        Assert.assertEquals(submitNewLanguage.getImportantMessage1(),"IMPORTANT:");
        Assert.assertEquals(submitNewLanguage.pageText(), "IMPORTANT: Take your time! The more carefully you fill out this form (especially the language name and description), the easier it will be for us and the faster your language will show up on this page. We don't have the time to mess around with fixing your descriptions etc. Thanks for your understanding.");

    }

}
