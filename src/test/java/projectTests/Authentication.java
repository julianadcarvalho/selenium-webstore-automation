package projectTests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Random;

public class Authentication {
    ChromeDriver driver;
    String email;
    String password;
    String name;
    String lastName;
    String address;
    String adressC;
    String city;



    public Authentication(ChromeDriver newDriver){
      Random random = new Random();
      int numero = random.nextInt(5000);

      driver   = newDriver;
      email    = numero+"teste@teste.com";
      password = "12345678";
      name     = "Joana";
      lastName = "Souza";
      address   = "teste";
      adressC  = "teste";
      city     = "teste";
    }

    public void enterSignIn() {
        WebElement searchBtn = driver.findElement(By.linkText("Sign in"));
        Actions actionProvider = new Actions(driver);
        actionProvider.clickAndHold(searchBtn).build().perform();
        actionProvider.release().build().perform();
    }

    public void register() {
        driver.findElement(By.id("email_create")).sendKeys(email + Keys.ENTER);
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(By.id("id_gender2")));
        driver.findElement(By.id("id_gender2")).click();
        driver.findElement(By.id("customer_firstname")).sendKeys(name + Keys.TAB);
        driver.findElement(By.id("customer_lastname")).sendKeys(lastName + Keys.TAB);
        driver.findElement(By.id("email")).sendKeys(email + Keys.TAB);
        driver.findElement(By.id("passwd")).sendKeys(password + Keys.TAB);
        driver.findElement(By.id("days")).sendKeys("10" + Keys.ENTER);
        driver.findElement(By.id("months")).sendKeys("September " + Keys.ENTER);
        driver.findElement(By.id("years")).sendKeys("1998 " + Keys.ENTER);
        driver.findElement(By.id("optin")).click();
        driver.findElement(By.id("firstname")).sendKeys(name + Keys.TAB);
        driver.findElement(By.id("lastname")).sendKeys(lastName + Keys.TAB);
        driver.findElement(By.id("company")).sendKeys( Keys.TAB);
        driver.findElement(By.id("address1")).sendKeys(address + Keys.TAB);
        driver.findElement(By.id("address2")).sendKeys(adressC + Keys.TAB);
        driver.findElement(By.id("city")).sendKeys(city + Keys.TAB);
        driver.findElement(By.id("id_state")).sendKeys("Florida " + Keys.ENTER);
        driver.findElement(By.id("postcode")).sendKeys("12345" + Keys.TAB);
        driver.findElement(By.id("id_country")).sendKeys( Keys.TAB);
        driver.findElement(By.id("other")).sendKeys("testeteste" + Keys.TAB);
        driver.findElement(By.id("phone")).sendKeys( Keys.TAB);
        driver.findElement(By.id("phone_mobile")).sendKeys("11 12345678" + Keys.TAB);
        driver.findElement(By.id("alias")).sendKeys( Keys.TAB);

        WebElement searchBtn = driver.findElement(By.id("submitAccount"));
        Actions actionProvider = new Actions(driver);
        actionProvider.clickAndHold(searchBtn).build().perform();
        actionProvider.release().build().perform();
    }

    public void logOut() {
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(By.linkText("Sign out")));
        driver.findElement(By.linkText("Sign out")).click();
    }

    public void loginIn(){
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(By.linkText("Sign in")));
        driver.findElement(By.linkText("Sign in")).click();
        driver.findElement(By.id("email")).sendKeys(email + Keys.TAB);
        driver.findElement(By.id("passwd")).sendKeys(password + Keys.ENTER);
    }
}
