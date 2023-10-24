import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;


import java.time.Duration;
import java.util.List;
import java.util.logging.Logger;

public class FirstTest {
    WebDriver driver = null;
    WebDriverWait wait;

    public Logger logger = Logger.getLogger(String.valueOf(FirstTest.class));

    @BeforeTest
    public void iniciarWebDriver() {
        String pathDriver = "/Users/zero/GIT/IdeaProjects/seleniumstarting/utils/chromedriver";
        System.setProperty("webdriver.chrome.driver", pathDriver);
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(4));
    }

/*    @Test
    public void testWiki() {

        driver.navigate().to("https://wikipedia.org/");

        WebElement searchBox = driver.findElement(By.cssSelector("input#searchInput"));
        searchBox.sendKeys("Ubuntu");

        WebElement submit = driver.findElement(By.cssSelector("[type=\"submit\"]"));
        submit.click();

        WebElement tituloUbuntu = driver.findElement(By.cssSelector(".mw-page-title-main"));

        Assert.assertEquals(tituloUbuntu.getText(), "Ubuntu");
        logger.info(tituloUbuntu.getText());

        List<WebElement> hiperLinks = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.cssSelector("#mw-content-text .external")));
        for (WebElement element:hiperLinks) {
            logger.info(element.getText());
            System.out.println(element.getText());
        }*/

    @Test
    public void logearseEnDemoBlaze() {
        driver.navigate().to("https://demoblaze.com/");
        WebElement loginButton = driver.findElement(By.cssSelector("#login2"));
        loginButton.click();
       // WebElement userBox = driver.findElement(By.cssSelector("#loginusername"));
        WebElement waitForUserBox = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#loginusername")));
        waitForUserBox.click();
        waitForUserBox.sendKeys("demo");
        WebElement pwdBox = driver.findElement(By.cssSelector("#loginpassword"));
        pwdBox.click();
        pwdBox.sendKeys("demo");
        WebElement sendButton = driver.findElement(By.cssSelector("[onclick=\"logIn()\"])");
        sendButton.click();
        



    }


}
