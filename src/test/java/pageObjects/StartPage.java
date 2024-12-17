package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Arrays;
import java.util.List;

public class StartPage extends BasePage {
    public StartPage(WebDriver driver) {
        super(driver);

    }

    private List<WebElement> getSubMenuList(){
        List<WebElement> elements = driver.findElements(By.xpath("//ul[@id='submenu']/li"));
        return elements;
    }
    public StartPage navigateToTeamSubPage(){
        for (int i = 0; i < getSubMenuList().size() ; i++) {
            if (getSubMenuList().get(i).getText().equalsIgnoreCase("Team")) {
                getSubMenuList().get(i).click();
                return new StartPage(driver);

            }
        }
        return null;
    }


    private List<WebElement> getCreatorList() {

        return driver.findElements(By.xpath("//*[@id='main']/h3"));
    }

    public boolean verifyCreatorsNamesList() {
        boolean result;
        String[] creatorsNames = new String[]{"Gregor Scheithauer", "Oliver Schade", "Stefan Scheler"};
//        List<String> names = new ArrayList<>(List.of("Gregor Scheithauer", "Oliver Schade", "Stefan Scheler"));
        List<String>names = Arrays.asList(creatorsNames);

        if (getCreatorList().size() != names.size()) {
            return false;
        }

        for (int i = 0; i < names.size(); i++) {
            result = false;
            for (int j = 0; j < getCreatorList().size(); j++) {
                if (getCreatorList().get(i).getText().equals(names.get(j))) {
                    result = true;
                    break;
                }

            }
            if (!result) {
                return false;
            }

        }
        return true;
    }

}
