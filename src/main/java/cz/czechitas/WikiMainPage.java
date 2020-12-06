package cz.czechitas;

import org.openqa.selenium.*;

public class WikiMainPage {

    public WebDriver driver;

    public WikiMainPage(WebDriver webDriver) {
        driver = webDriver;
    }

    public void ClickOnRandomArticle() {

        WebElement randomArticle = driver.findElement(By.id("n-randompage"));
        randomArticle.click();

        System.out.println("Clicked on random article");
    }

}
