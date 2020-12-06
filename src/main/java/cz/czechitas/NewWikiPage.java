package cz.czechitas;

import java.sql.*;
import java.util.*;
import org.openqa.selenium.*;
import org.openqa.selenium.NoSuchElementException;

public class NewWikiPage {

    private WebDriver driver;

    public NewWikiPage(WebDriver webDriver) {
        driver = webDriver;
    }

    public void CheckParagraphs() {
        int numClicks = 0;

        while (!driver.getCurrentUrl().equals("https://en.wikipedia.org/wiki/Philosophy")) {

        System.out.println("Checking for suitable paragraph");

        List<WebElement> paragraphs = driver.findElements(By.tagName("p"));

        System.out.println(driver.findElement(By.tagName("H1")).getText());

        boolean linkFound = false;

        for (WebElement paragraph : paragraphs) {

            linkFound = ClickFirstViableLink(paragraph);

            if (linkFound) {

                break;                                                        
            }
        }
        if (linkFound == false) {

            throw new NoSuchElementException("Could not locate suitable link");
        } numClicks = numClicks + 1;
        }
        if(numClicks<15) {
            System.out.println("It took you: " + numClicks + " clicks to get to Philosophy page. Wow that is not that much.");

        } else
            System.out.println("It took you: " + numClicks + " clicks to get to Philosophy page. Wow that is a lot! ");
    }

    public boolean ClickFirstViableLink(WebElement firstP) {
        System.out.println("Checking for suitable link");

        List<WebElement> links = firstP.findElements(By.xpath("a"));

        String trimmedParagrpah = firstP.getText().replaceAll("\\(.*\\(.+?\\).*\\)", "").replaceAll("\\(.+?\\)", "");

        for (WebElement link : links) {

            if (trimmedParagrpah.contains(link.getText())) {

                link.click();
                return true;
            }
        }
        return false;
    }
}

