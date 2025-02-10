package utilities;

import com.github.javafaker.Faker;

public class fakerclass {
    public static String faker_firstname()
    {
        Faker faker=new Faker();
        return faker.name().firstName();
    }
    public static String faker_lastname()
    {
        Faker faker=new Faker();
        return faker.name().lastName();
    }
    public static String faker_email()
    {
        Faker faker=new Faker();
        return faker.name().firstName()+"@gmail.com";
    }
    public static String faker_tele()
    {
        Faker faker=new Faker();
        return faker.number().digits(10);
    }
    public static String faker_pass()
    {
        Faker faker=new Faker();
        return faker.name().firstName()+"123";
    }
}
