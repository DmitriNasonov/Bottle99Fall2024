package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class MainPage extends BasePage {


    public MainPage(WebDriver driver) {
        super(driver);

    }
    public void openMainPage(){
        driver.get("https://www.99-bottles-of-beer.net");
    }
    public String readSiteName99(){
       By title99Bottles = By.xpath("//h1[text() = '99 Bottles of Beer']");
       WebElement element = driver.findElement(title99Bottles);
       String text = element.getText();
       return text;
    }
    public String subNewLanguage(String tabName){
        List<WebElement> elements = driver.findElements(By.xpath("//ul [@id='menu']/li/a"));
        String name = "";
        for (int i = 0; i < elements.size(); i++) {
            if (elements.get(i).getText().equals(tabName)){
                name =tabName;
            }

        }
        return name;
    }
    private List<WebElement> getMainMenuList(){
        List<WebElement> elements = driver.findElements(By.xpath("//ul[@id='menu']/li"));
        return elements;
    }
    public BrowseLanguage navigateToBrowseLanguage(){
        for (int i = 0; i <getMainMenuList().size() ; i++) {
            if (getMainMenuList().get(i).getText().equalsIgnoreCase("Browse Languages")) {
                getMainMenuList().get(i).click();
                return new BrowseLanguage(driver);

            }
        }
        return null;
    }
    public SubmitNewLanguage navigateToSubmitNewLanguage(){
        for (int i = 0; i <getMainMenuList().size() ; i++) {
            if (getMainMenuList().get(i).getText().equalsIgnoreCase("Submit new Language")) {
                getMainMenuList().get(i).click();
                return new SubmitNewLanguage(driver);

            }
        }
        return null;
    }
    public StartPage navigateToStartPage(){
        for (int i = 0; i <getMainMenuList().size() ; i++) {
            if (getMainMenuList().get(i).getText().equalsIgnoreCase("Start")) {
                getMainMenuList().get(i).click();


            }
        }
        return new StartPage(driver);
    }




}
