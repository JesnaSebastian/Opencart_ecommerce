package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pageObjects.homePage;
import testBase.baseClass;

public class TC_01_Homepage extends baseClass {
    @Test
    public void TC01_homepage() throws InterruptedException {

        homePage hp2=new homePage(driver);
        hp2.click_myaccount();
        hp2.click_reglink();
        Thread.sleep(5000);
    }


    }

