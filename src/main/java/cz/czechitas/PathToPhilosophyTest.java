package cz.czechitas;

import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.*;

public class PathToPhilosophyTest {

    private WebDriver driver;

    @Before
    public void SetUp() {

        System.setProperty("webdriver.gecko.driver", "C://Java-Training//Selenium//geckodriver.exe");
        driver = new FirefoxDriver();

        driver.get("https://en.wikipedia.org/wiki/Main_Page");

        System.out.println("Navigated to Wikipedia");

        WikiMainPage wikiMainPage = new WikiMainPage(driver);
        wikiMainPage.ClickOnRandomArticle();
    }

    @Test
    public void PathToPhilosophy() {

        NewWikiPage newWikiPage = new NewWikiPage(driver);

        newWikiPage.CheckParagraphs();

//        ClicksPage clicksPage = new ClicksPage(driver);

//        clicksPage.CountClick();
    }
    @After
    public void CleanUp(){
        driver.quit();
    }
}










