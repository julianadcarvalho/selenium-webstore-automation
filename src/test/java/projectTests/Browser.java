package projectTests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {
    public ChromeDriver create() {
        WebDriverManager.chromedriver().setup();
        ChromeDriver openBrowser = new ChromeDriver();
        openBrowser.get("http://automationpractice.com/index.php");
        openBrowser.manage().window().maximize();
        return openBrowser;
    }
}
