package runTests;

import org.openqa.selenium.chrome.ChromeDriver;
import projectTests.Authentication;
import projectTests.Browser;
import projectTests.ClosePurchase;
import projectTests.Shopping;

public class RunnerTest {
    public static void main(String[] args) {
       Browser driver = new Browser();
       ChromeDriver openBrowser = driver.create();
       Authentication account = new Authentication(openBrowser);
       Shopping purchase = new Shopping(openBrowser);
       ClosePurchase closure = new ClosePurchase(openBrowser);

       account.enterSignIn();
       account.register();
       account.logOut();
       account.loginIn();

       purchase.search();
       purchase.cart();

       closure.check();
       closure.payment();
       account.logOut();
    }
}
