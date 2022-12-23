import org.example.LoginPage;
import org.junit.Assert;
import org.junit.Test;

public class LoginTest extends BaseTestSetUp {

    @Test
    public void testLoginFacebook() {
        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.invokeBrowser();
        Assert.assertEquals("There is a “Create an account” section on the page",
                "//a[text()='Create new account']", "//a[text()='Create new account']");
        loginPage.loginFacebook();

    }
}
