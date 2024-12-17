package pageObjectsTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.MainPage;
import pageObjects.StartPage;

public class TeamSubPageToApp extends BaseTest {

    /**
     * TC_11_06 Подтвердите, что имена создателей сайта:
     * Oliver Schade
     * Gregor Scheithauer
     * Stefan Scheler
     * Шаги:
     */
    @Test
    public void verifyCreatorsOfTheSite() {

        MainPage mainPage = new MainPage(driver);
        mainPage.openMainPage();
        StartPage startPage = mainPage.navigateToStartPage();

        startPage.navigateToTeamSubPage();

        Assert.assertEquals(startPage.verifyCreatorsNamesList(), true);


    }

}
