package projectTests;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ClosePurchase {
    ChromeDriver driver;

    public ClosePurchase(ChromeDriver newDriver ) {
        driver = newDriver;
    }

    public void check(){
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[@class='cart_quantity_delete'])[2]")));

        driver.findElement(By.xpath("(//a[@class='cart_quantity_delete'])[2]")).click();

        driver.findElement(By.className("cart_quantity_up")).click();

        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]/span")));
        driver.findElement(By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]/span")).click();

        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"center_column\"]/form/p/button/span")));
        driver.findElement(By.xpath("//*[@id=\"center_column\"]/form/p/button/span")).click();

        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"form\"]/div/p[2]/label")));
        driver.findElement(By.xpath("//*[@id=\"form\"]/div/p[2]/label")).click();

        driver.findElement(By.xpath("//*[@id=\"form\"]/p/button/span")).click();
    }

    public void payment() {
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"HOOK_PAYMENT\"]/div[1]/div/p/a")));
        driver.findElement(By.xpath("//*[@id=\"HOOK_PAYMENT\"]/div[1]/div/p/a")).click();

        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"cart_navigation\"]/button/span")));
        driver.findElement(By.xpath("//*[@id=\"cart_navigation\"]/button/span")).click();

        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")));
        driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")).click();

        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"center_column\"]/div/div[1]/ul/li[1]/a/span")));
        driver.findElement(By.xpath("//*[@id=\"center_column\"]/div/div[1]/ul/li[1]/a/span")).click();
    }
}
