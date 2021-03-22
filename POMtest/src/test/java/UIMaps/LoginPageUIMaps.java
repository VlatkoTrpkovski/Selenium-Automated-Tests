package UIMaps;

import org.openqa.selenium.By;

public class LoginPageUIMaps {

    public By usernameInput() { return By.id("user-name"); }

    public By passwordInput() { return By.id("password"); }

    public By loginBtn() { return By.id("login-button"); }

    public By loginContainer() { return By.id("login_button_container"); }
}
