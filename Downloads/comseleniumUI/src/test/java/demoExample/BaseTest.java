package demoExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BaseTest extends  DriverSetup{

   @Test
   public void checkTitle(){
       driver.get(webUrl);
       System.out.println(driver.getTitle());
       String expectedtitle ="Amazon.de: Günstige Preise für Elektronik & Foto, Filme, Musik, Bücher, Games, Spielzeug & mehr";
       Assert.assertEquals("Amazon.de: Günstige Preise für Elektronik & Foto, Filme, Musik, Bücher, Games, Spielzeug & mehr",expectedtitle);
   }

    @Test
    public void loginAccount(){

        driver.get(webUrl);

        WebElement elem = driver.findElement(By.id("nav-your-amazon"));
        elem.click();

        driver.findElement(By.id("ap_email")).sendKeys("erkamtek@gmail.com");
        driver.findElement(By.id("continue")).click();

        driver.findElement(By.id("ap_password")).sendKeys("Erkam911");
        driver.findElement(By.id("signInSubmit")).click();

        String message = driver.findElement(By.id("nav-your-amazon-text")).getText();
        System.out.println("Confirmation: " + message);


    }
}
