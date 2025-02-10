package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class newaccount extends basePage{
    public newaccount(WebDriver driver)
    {
        super(driver);
    }
    @FindBy(xpath = "//input[@id='input-firstname']")
    WebElement firstname;
    @FindBy(xpath = "//input[@id='input-lastname']")WebElement lastname;
    @FindBy(xpath = "//input[@id='input-email']") WebElement email;
    @FindBy(xpath = "//input[@id='input-telephone']")WebElement telphone;
    @FindBy(xpath = "//input[@id='input-password']") WebElement password;
    @FindBy(xpath = "//input[@id='input-confirm']") WebElement confirmpassword;
    @FindBy(xpath = "//input[@name='agree']") WebElement tandc_checkbox;
    @FindBy(xpath = "//input[@value='Continue']") WebElement continue_button;

    public void insert_firstname(String name)
    {
        firstname.sendKeys(name);
    }
    public void insert_lastname(String name)
    {
        lastname.sendKeys(name);
    }
    public void insert_telephone(String ph)
    {
        telphone.sendKeys(ph);
    }
    public void insert_email(String email1)
    {
       email.sendKeys(email1);
    }
    public void insert_password(String password1)
    {
        password.sendKeys(password1);
    }
    public void insert_confirmpass(String password1)
    {
       confirmpassword.sendKeys(password1);
    }
    public void checkoff_tandc()
    {
       tandc_checkbox.click();
    }
    public void cont_button()
    {
        continue_button.click();
    }


}
