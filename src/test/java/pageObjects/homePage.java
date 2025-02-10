package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class homePage extends basePage {
    public homePage (WebDriver driver)
    {
        super(driver);
    }

    @FindBy(xpath = "//span[normalize-space()='My Account']")
    WebElement my_account;
    @FindBy(xpath = "//a[normalize-space()='Register']")WebElement register;

    public void click_myaccount()
    {
        my_account.click();
    }
    public void click_reglink()
    {
        register.click();
    }


}
