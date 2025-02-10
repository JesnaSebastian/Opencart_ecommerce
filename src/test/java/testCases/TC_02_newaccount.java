package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.homePage;
import pageObjects.newaccount;
import testBase.baseClass;
import utilities.fakerclass;

public class TC_02_newaccount extends baseClass {
    @Test
    public void TC02_newaccount() throws InterruptedException {
        homePage hp1=new homePage(driver);
        hp1.click_myaccount();
       hp1.click_reglink();

        newaccount na=new newaccount(driver);
        na.insert_firstname(fakerclass.faker_firstname());
        na.insert_lastname(fakerclass.faker_lastname());
        na.insert_email(fakerclass.faker_email());
        na.insert_telephone(fakerclass.faker_tele());
        na.insert_password("jesna@1234");
        na.insert_confirmpass("jesna@1234");
        na.checkoff_tandc();
        na.cont_button();
        Thread.sleep(5000);
       String confirm_msg= na.getconfirmtionmessage();
        Assert.assertEquals(confirm_msg,"Your Account Has Been Created!","incorrect page");
    }
}
