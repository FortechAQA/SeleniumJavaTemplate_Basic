import Pages.Login.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestLogin extends Base{
    public String username = "standard_user";
    public String problemUser = "problem_user";
    public String password = "secret_sauce";

    @Test
    public void testLoginSuccess() {
        LoginPage loginPage  = new LoginPage(driver);
        loginPage.loginWithUsernameAndPassword(username, password);

        String actualResult = driver.getCurrentUrl();
        String expectedResult = "https://www.saucedemo.com/inventory.html";

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testLoginSuccessOtherUser() {
        LoginPage loginPage  = new LoginPage(driver);
        loginPage.loginWithUsernameAndPassword(problemUser, password);

        String actualResult = driver.getCurrentUrl();
        String expectedResult = "https://www.saucedemo.com/inventory.html";

        Assert.assertEquals(actualResult, expectedResult);
    }
}
