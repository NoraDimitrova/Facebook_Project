import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BaseTestSetUp {

    protected WebDriver webDriver;

    String url = "http://www.fb.com";

    @BeforeClass
    public static void setUpBrowser() {
        WebDriverManager.chromedriver().setup();
        WebDriverManager.firefoxdriver().setup();
    }

    @Before
    public void setUp() {
        webDriver = new ChromeDriver();
        webDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        webDriver.manage().window().maximize();
        webDriver.manage().deleteAllCookies();
        webDriver.get(url);
    }

    @After
    public void quitBrowser() {
//        webDriver.quit();
    }
}
