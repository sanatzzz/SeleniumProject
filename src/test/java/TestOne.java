import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestOne {
    @Test
    public void login() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver-win64\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        WebDriver driver=new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
        driver.get("https://www.advantageonlineshopping.com/#/");
        driver.manage().window().maximize();

        WebElement profile=driver.findElement(By.id("menuUser"));
        WebElement tablets=driver.findElement(By.id("tabletsTxt"));
        WebElement username=driver.findElement(By.name("username"));
        WebElement password=driver.findElement(By.name("password"));
        WebElement login=driver.findElement(By.id("sign_in_btn"));
        wait.until(d -> tablets.isDisplayed());
        profile.click();
        username.sendKeys("admin");
        password.sendKeys("adm1n");
        login.click();
    }
}