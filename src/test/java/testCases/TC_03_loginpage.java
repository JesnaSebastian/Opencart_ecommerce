package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.homePage;
import pageObjects.loginpage;
import testBase.baseClass;
import utilities.readingfrompropertyclass;

import java.io.IOException;

public class TC_03_loginpage extends baseClass {
    @Test
    public void TC_03loginpage() throws IOException, InterruptedException {
       homePage hp1=new homePage(driver);
       hp1.click_myaccount();
       hp1.click_loginlink();

       loginpage lp1=new loginpage(driver);
       Thread.sleep(2000);
       String em=readingfrompropertyclass.reademail();
       lp1.enter_email(em);
       lp1.enter_pwd(readingfrompropertyclass.readpassword());
        lp1.click_loginbutton();
        Thread.sleep(5000);

        Assert.assertEquals("My Account",lp1.gettextmyaccountname(),"incorrect pagename ");
    }

}
