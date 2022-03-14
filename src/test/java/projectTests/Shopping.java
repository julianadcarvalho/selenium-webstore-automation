package projectTests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Shopping {
    ChromeDriver driver;
    String serch;

    public Shopping(ChromeDriver newDriver) {
        driver = newDriver;
        serch = "t-shirt";
    }

    public void search(){
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(By.id("search_query_top")));
        driver.findElement(By.id("search_query_top")).sendKeys( serch+ Keys.ENTER);

        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(By.linkText("All best sellers")));
        WebElement searchBtn = driver.findElement(By.linkText("All best sellers"));
        Actions actionProvider = new Actions(driver);
        actionProvider.clickAndHold(searchBtn).build().perform();
        actionProvider.release().build().perform();
    }

    public void cart(){
         new WebDriverWait(driver, Duration.ofSeconds(10))
                 .until(ExpectedConditions.elementToBeClickable(By.linkText("Printed Dress")));
         driver.findElement(By.linkText("Printed Dress")).click();

         new WebDriverWait(driver, Duration.ofSeconds(10))
                 .until(ExpectedConditions.elementToBeClickable(By.id("add_to_cart")));
         WebElement searchBtn = driver.findElement(By.id("add_to_cart"));
         Actions actionProvider = new Actions(driver);
         actionProvider.clickAndHold(searchBtn).build().perform();
         actionProvider.release().build().perform();

         new WebDriverWait(driver, Duration.ofSeconds(10))
                 .until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/span")));
         driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/span")).click();

         new WebDriverWait(driver, Duration.ofSeconds(10))
                 .until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"columns\"]/div[1]/a[4]")));
         driver.findElement(By.xpath("//*[@id=\"columns\"]/div[1]/a[4]")).click();

         new WebDriverWait(driver, Duration.ofSeconds(10))
                 .until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"special_block_right\"]/div/div/a/span")));
         driver.findElement(By.xpath("//*[@id=\"special_block_right\"]/div/div/a/span")).click();

         new WebDriverWait(driver, Duration.ofSeconds(10))
                 .until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"center_column\"]/ul/li[1]/div/div[1]/div/a[1]/img")));
         driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[1]/div/div[1]/div/a[1]/img")).click();

         new WebDriverWait(driver, Duration.ofSeconds(10))
                 .until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"quantity_wanted_p\"]/a[2]/span")));
         driver.findElement(By.xpath("//*[@id=\"quantity_wanted_p\"]/a[2]/span")).click();
            driver.findElement(By.xpath("//*[@id=\"add_to_cart\"]/button/span")).click();

            new WebDriverWait(driver, Duration.ofSeconds(10))
                    .until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span")));
            driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span")).click();
    }
}
