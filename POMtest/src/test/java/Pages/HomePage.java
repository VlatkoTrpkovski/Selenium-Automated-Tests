package Pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage {

    public void verifyHomePageOpened(){
        WebElement headerContainer = driver.findElement(homePageUIMaps.headerContainer());
        Assert.assertTrue(headerContainer.isDisplayed());
    }

    public void clickOnMenuBtn() {
        WebElement menuBtn = driver.findElement(homePageUIMaps.menuBtn());
        menuBtn.click();
    }

    public void clickOnLogoutLink() {
        WebElement logoutLink = driver.findElement(homePageUIMaps.logoutLink());
        logoutLink.click();
    }
}
