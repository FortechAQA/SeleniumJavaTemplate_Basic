package Pages.Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import static Pages.Login.Locators.*;

public class LoginPage {
    private WebDriver driver;

    @FindBy(how = How.CSS, using = usernameSelector)
    private WebElement usernameInputField;

    @FindBy(how = How.CSS, using = passwordLocator)
    private WebElement passwordInputField;

    @FindBy(how = How.CSS, using = loginButtonLocator)
    private WebElement loginButton;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    private void writeUsername(String username) {
        usernameInputField.sendKeys(username);
    }

    private void writePassword(String password) {
        passwordInputField.sendKeys(password);
    }

    private void clickLoginButton() {
        loginButton.click();
    }

    public void loginWithUsernameAndPassword(String username, String password) {
        writeUsername(username);
        writePassword(password);
        clickLoginButton();
    }

}
