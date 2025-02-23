package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class loginpage extends basePage {
    private loginpage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//input[@id='input-email']")
    WebElement email_address;
    @FindBy(xpath = "//input[@id='input-password']")
    WebElement password;
    @FindBy(xpath = "//input[@value='Login']")
    WebElement loginbuton;

    public void enter_email(String email) {
        email_address.sendKeys(email);
    }

    public void enter_pwd(String password1) {
        password.sendKeys(password1);
    }

    public void click_loginbutton() {
        loginbuton.click();
    }


}
