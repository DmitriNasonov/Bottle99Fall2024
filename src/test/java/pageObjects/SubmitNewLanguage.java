package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.stream.Collectors;

public class SubmitNewLanguage extends BasePage {


    public SubmitNewLanguage(WebDriver driver) {
        super(driver);

    }
    private List<WebElement> getSubMenuList(){
        return driver.findElements(By.xpath("//ul[@id = 'submenu']/li/a"));
    }
    public boolean verifySubmitNewLanguage(){
        return getSubMenuList().get(0).getText().equals("Submit New Language");

    }
//    public String verifySubmitNewLanguage1(){
//        return getSubMenuList().get(0).getText();

//    }
    private List<WebElement> findSubMenuList(){
        List<WebElement> elements = driver.findElements(By.xpath("//ul[@id='submenu']/li/a"));
        return elements;
    }
    public Object subMenuName(){
        for (int i = 0; i < findSubMenuList().size() ; i++) {
            if (findSubMenuList().get(i).getText().equalsIgnoreCase("Submit New Language")) {
                return (findSubMenuList().get(i).getText());

            }
        }
        return null;
    }

    public WebElement submitButton(){
        return driver.findElement(By.xpath("//*[@value='Submit Language']"));
    }
    public boolean verifyErrorMessage(){
        submitButton().click();
        return getErrorMessage().getText().equalsIgnoreCase("Error: Precondition failed - Incomplete Input.");

    }
    public WebElement getErrorMessage(){
        return driver.findElement(By.xpath("//p[contains(@style,'border: 1px solid red; ')]"));
    }

    public WebElement locateImportantMessage(){
        return driver.findElement(By.xpath("//span[contains(@style,'background-color:')]"));

    }

    public boolean getImportantMessage(){
        return locateImportantMessage().getText().equalsIgnoreCase(" Take your time! The more carefully you fill out this form (especially the language name and description), the easier it will be for us and the faster your language will show up on this page. We don't have the time to mess around with fixing your descriptions etc. Thanks for your understanding.");
    }
    public String getImportantMessage1(){
        return locateImportantMessage().getText();
    }

    private List<WebElement> listOfPageText(){
        List<WebElement> elements = driver.findElements(By.xpath("//div[@id ='main']/ul/li"));
        return elements;
    }
    public Object pageText(){
        for (int i = 0; i < listOfPageText().size() ; i++) {
            if (listOfPageText().get(i).getText().equalsIgnoreCase("IMPORTANT: Take your time! The more carefully you fill out this form (especially the language name and description), the easier it will be for us and the faster your language will show up on this page. We don't have the time to mess around with fixing your descriptions etc. Thanks for your understanding.")) {
                return listOfPageText().get(i).getText();

            }
        }
        return null;
    }

       public Object pageText1(){
        List <WebElement> listOfDashboardText = driver.findElements(By.xpath("//div[@id ='main']/ul/li"));
        List <String> extractedText = listOfDashboardText.stream()
                .map(WebElement::getText)
                .collect(Collectors.toList());
        return extractedText;

    }




}
