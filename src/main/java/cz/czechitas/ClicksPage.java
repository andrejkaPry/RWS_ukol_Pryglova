package cz.czechitas;

import java.sql.*;
import java.util.*;
import org.openqa.selenium.*;

public class ClicksPage {

    public WebDriver driver;

    public ClicksPage(WebDriver webDriver) {
        driver = webDriver;
    }
}

//    public void CountClick(){
//        int numClicks = 0;
//        NewWikiPage newWikiPage = new NewWikiPage(driver);
//        newWikiPage.CheckParagraphs();
//        numClicks = numClicks + 1;
//        if(numClicks<10) {
//            System.out.println("It took you: " + numClicks + " clicks to get to Philosophy page. Wow that is not that much.");
//
//        } else
//            System.out.println("It took you: " + numClicks + " clicks to get to Philosophy page. Wow that is a lot! ");
//    }
//    }




