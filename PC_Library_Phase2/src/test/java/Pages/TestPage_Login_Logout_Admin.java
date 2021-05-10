package Pages;

import Helpers.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestPage_Login_Logout_Admin {
    WebDriver driver = WebDriverFactory.getWebDriver();
    private WebDriverWait wait;
    public static final int TIMEOUT = 20;


    public void click(By element) { wait.until(ExpectedConditions.visibilityOfElementLocated(element)).click(); }
    @BeforeMethod
    public void startBrowser() {
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, TIMEOUT);
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }

    By signinbutton = By.xpath("/html/body/div[1]/div/div/div/form/div/button");
    By enteremail = By.xpath("/html/body/div/form[1]/div/div/div[2]/div/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[2]/div/input[1]");
    By clicknext = By.id("idSIButton9");
    By enterpassword = By.xpath("/html/body/div/form[1]/div/div/div[2]/div/div/div[1]/div[2]/div[2]/div/div[2]/div/div[2]/div/div[2]/input");
    By signinbutton2 = By.xpath("/html/body/div/form[1]/div/div/div[2]/div/div/div[1]/div[2]/div[2]/div/div[2]/div/div[3]/div[2]/div/div/div/div/input");
    By logoutbutton = By.xpath("/html/body/div[1]/div/div[1]/header/div/div/div/div[1]/button");
    By logoutbutton1 = By.xpath("/html/body/div/form/div/div/div[1]/div[2]/div/div/div/div[3]/div/div/div/div/div/div/div[2]");
    By clickNoBtn = By.xpath("/html/body/div/form/div/div/div[1]/div[2]/div/div[2]/div/div[3]/div[2]/div/div/div[1]/input");



    public void navigateto(){
        driver.get("http://localhost:3001/");
    }

    public void signinbutton() {
        click(this.signinbutton);

    }

    public void enteremail(String email){
        wait.until(ExpectedConditions.visibilityOfElementLocated(this.enteremail)).sendKeys(email);
    }

    public void clicknext() {

        click(this.clicknext);
    }
    public void enterpassword(String pass) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(this.enterpassword)).sendKeys(pass);
    }
    public void signinbutton2(){
        click(this.signinbutton2);
    }
    public void logoutbutton() {
        click(this.logoutbutton);
    }
    public void logoutbutton1() {
        click(this.logoutbutton1);
    }
    public void clickNoBtn() {
        click(this.clickNoBtn);
    }
    public void clickAssetTypeBtn(){
        driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/header/div/div/div/div[1]/div[1]/a[4]")).click();
    }

}
