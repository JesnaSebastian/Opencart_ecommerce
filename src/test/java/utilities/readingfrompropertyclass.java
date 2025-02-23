package utilities;

import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class readingfrompropertyclass {


    public static String reademail() throws IOException {

        String path = "./src/test/testdata/config.properties";
        FileInputStream fis = new FileInputStream(path);
        Properties prop = new Properties();
        prop.load(fis);
        String remail = prop.getProperty("email");
        return remail;
    }

    public static String readpassword() throws IOException {

        String path = "./src/test/testdata/config.properties";
        FileInputStream fis = new FileInputStream(path);
        Properties prop = new Properties();
        prop.load(fis);
        String rpasswrd = prop.getProperty("pwd");
        return rpasswrd;
    }
}







