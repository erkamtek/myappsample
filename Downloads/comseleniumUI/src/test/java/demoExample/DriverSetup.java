package demoExample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class DriverSetup {

    WebDriver driver ;
    String webUrl="http://www.amazon.de" ;

    @BeforeTest
    public void setUp(){
        driver = new FirefoxDriver();

    }


    @AfterTest
    public void tearDown(){

        driver.quit();

    }
}
