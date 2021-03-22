package Pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage {

    public void verifyLoginPageOpened() {
        WebElement loginContainer = driver.findElement(loginPageUIMaps.loginContainer());
        Assert.assertTrue(loginContainer.isDisplayed());
    }

    public void addUsernameAndPass(String username, String password){
        WebElement usernameInput = driver.findElement(loginPageUIMaps.usernameInput());
        usernameInput.sendKeys(username);
        WebElement passwordInput = driver.findElement(loginPageUIMaps.passwordInput());
        passwordInput.sendKeys(password);
    }

    public void clickLoginBtn(){
        WebElement loginBtn = driver.findElement(loginPageUIMaps.loginBtn());
        loginBtn.click();
    }
}
